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

import java.net.URI;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/** Integration test for the Pub/Sub functional stream binder sample app. */
// Please use "-Dit.pubsub=true" to enable the tests
@EnabledIfSystemProperty(named = "it.pubsub", matches = "true")
@ExtendWith(OutputCaptureExtension.class)
class PubSubStreamBinderSampleAppIntegrationTest {

  @Test
  void testSample(CapturedOutput capturedOutput) throws Exception {

    // Run Source app
    SpringApplicationBuilder sourceBuilder =
        new SpringApplicationBuilder(FunctionalSourceApplication.class)
            .resourceLoader(
                new PropertyRemovingResourceLoader(
                    "spring-cloud-gcp-pubsub-stream-functional-sample-source"));
    sourceBuilder.run();

    // Run Sink app
    SpringApplicationBuilder sinkBuilder =
        new SpringApplicationBuilder(FunctionalSinkApplication.class)
            .resourceLoader(
                new PropertyRemovingResourceLoader(
                    "spring-cloud-gcp-pubsub-stream-functional-sample-sink"));
    sinkBuilder.run();

    // Post message to Source over HTTP.
    MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
    String message = "test message " + UUID.randomUUID();
    map.add("messageBody", message);
    map.add("username", "integration-test-user");

    RestTemplate restTemplate = new RestTemplate();

    URI redirect = restTemplate.postForLocation("http://localhost:8080/postMessage", map);
    assertThat(redirect).hasToString("http://localhost:8080/index.html");

    Awaitility.await()
        .atMost(10, TimeUnit.SECONDS)
        .until(
            () ->
                capturedOutput
                    .getOut()
                    .contains("New message received from integration-test-user: " + message));
  }

  /** Resolves the correct /application.properties file for the specific application. */
  static class PropertyRemovingResourceLoader extends DefaultResourceLoader {
    private String moduleName;

    PropertyRemovingResourceLoader(String moduleName) {
      this.moduleName = moduleName;
    }

    @Override
    public Resource getResource(String location) {
      if (location.contains("classpath:/application.properties")) {
        return new FileSystemResource(
            String.format("../%s/src/main/resources/application.properties", this.moduleName));
      }

      return super.getResource(location);
    }
  }
}
