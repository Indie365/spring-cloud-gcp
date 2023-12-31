/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.springframework.web.client.RestTemplate;

/**
 * Integration test for the config client with local config server.
 *
 * <p>Because the test brings in config server/config client source files into a single project,
 * config server bootstrap need to be suppressed in the config client app instance.
 *
 * @since 1.2
 */
@EnabledIfSystemProperty(named = "it.pubsub-bus", matches = "true")
class LocalSampleAppIntegrationTest {

  private static final Log LOGGER = LogFactory.getLog("LocalSampleAppIntegrationTest");

  static final String CONFIG_DIR = "/tmp/config";

  static final String CONFIG_FILE = CONFIG_DIR + "/application.properties";

  static final String INITIAL_MESSAGE = "initial message";

  static final String UPDATED_MESSAGE = "updated message";

  final RestTemplate restTemplate = new RestTemplate();

  BufferedReader configServerOutput;

  BufferedReader configClientOutput;

  Process configServerProcess;

  Process configClientProcess;

  @BeforeAll
  static void prepare() throws Exception {
    Files.createDirectories(Paths.get(CONFIG_DIR));
  }

  @Test
  void testSample() throws Exception {

    writeMessageToFile(INITIAL_MESSAGE);

    startConfigServer();

    waitForLogMessage(
        this.configServerOutput,
        Source.SERVER,
        "Monitoring for local config changes: [" + CONFIG_DIR + "]");
    waitForLogMessage(
        this.configServerOutput, Source.SERVER, "Started PubSubConfigServerApplication");
    assertConfigServerValue(INITIAL_MESSAGE);

    startConfigClient();

    waitForLogMessage(this.configClientOutput, Source.CLIENT, "Located property source");
    waitForLogMessage(this.configClientOutput, Source.CLIENT, "Started PubSubConfigApplication");
    assertConfigClientValue(INITIAL_MESSAGE);

    writeMessageToFile(UPDATED_MESSAGE);
    waitForLogMessage(this.configServerOutput, Source.SERVER, "Refresh for: *");
    assertConfigServerValue(UPDATED_MESSAGE);

    waitForLogMessage(this.configClientOutput, Source.CLIENT, "Keys refreshed");
    assertConfigClientValue(UPDATED_MESSAGE);
  }

  @AfterAll
  static void tearDown() throws Exception {

    Path configFile = Paths.get(CONFIG_FILE);
    if (Files.exists(configFile)) {
      Files.delete(configFile);
    }

    Path configDir = Paths.get(CONFIG_DIR);
    if (Files.exists(configDir)) {
      Files.delete(configDir);
    }
  }

  @AfterEach
  void closeResources() throws IOException {

    if (this.configServerOutput != null) {
      this.configServerOutput.close();
    }

    if (this.configClientOutput != null) {
      this.configClientOutput.close();
    }

    if (this.configServerProcess != null) {
      this.configServerProcess.destroy();
    }

    if (this.configClientProcess != null) {
      this.configClientProcess.destroy();
    }
  }

  private void startConfigServer() throws IOException {
    LOGGER.info("Starting config server...");
    ProcessBuilder serverBuilder =
        new ProcessBuilder(
            "../../../mvnw",
            "spring-boot:run",
            "-f",
            "../spring-cloud-gcp-pubsub-bus-config-sample-server-local");
    this.configServerProcess = serverBuilder.start();
    this.configServerOutput =
        new BufferedReader(new InputStreamReader(this.configServerProcess.getInputStream()));
    LOGGER.info("Config server started.");
  }

  private void startConfigClient() throws IOException {
    LOGGER.info("Starting config client...");
    ProcessBuilder serverBuilder =
        new ProcessBuilder(
            "../../../mvnw",
            "spring-boot:run",
            "-f",
            "../spring-cloud-gcp-pubsub-bus-config-sample-client");
    this.configClientProcess = serverBuilder.start();
    this.configClientOutput =
        new BufferedReader(new InputStreamReader(this.configClientProcess.getInputStream()));
    LOGGER.info("Config client started.");
  }

  private static void writeMessageToFile(String value) {
    File properties = new File(CONFIG_FILE);

    String message = "example.message = " + value;
    try (FileOutputStream fos = new FileOutputStream(properties)) {
      fos.write(message.getBytes());
    } catch (IOException e) {
      fail("Could not write message to file", e);
    }
    LOGGER.info("Wrote message " + message + " to file " + CONFIG_FILE);
  }

  private void assertConfigServerValue(String message) {
    // Server is aware of value from filesystem.
    String serverPropertiesJson =
        this.restTemplate.getForObject("http://localhost:8888/application/default", String.class);
    assertThat(serverPropertiesJson).contains(message);
  }

  private void assertConfigClientValue(String message) {
    // Refresh scoped variable updated and returned.
    String value = this.restTemplate.getForObject("http://localhost:8080/message", String.class);
    assertThat(value).isEqualTo(message);
  }

  private void waitForLogMessage(BufferedReader reader, Source source, String message) {
    LOGGER.info("Waiting for message " + message);
    Awaitility.await(message)
        .atMost(60, TimeUnit.SECONDS)
        .until(
            () -> {
              // drain all lines up to the one requested, or until no more lines in reader.
              while (reader.ready()) {
                String line = reader.readLine();
                LOGGER.debug(source.toString() + ": " + line);

                if (line == null) {
                  return false;
                }

                if (line.contains(message)) {
                  LOGGER.info("Found message: " + message);
                  return true;
                }
              }
              return false;
            });
  }

  private enum Source {
    SERVER,
    CLIENT
  }
}
