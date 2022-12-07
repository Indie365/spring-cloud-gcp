/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.videointelligence.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.DefaultCredentialsProvider;
import com.google.cloud.spring.global.GlobalProperties;
import com.google.cloud.videointelligence.v1.VideoIntelligenceServiceClient;
import com.google.cloud.videointelligence.v1.VideoIntelligenceServiceSettings;
import java.io.IOException;
import java.util.Collections;
import javax.annotation.Generated;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Auto-configuration for {@link VideoIntelligenceServiceClient}.
 *
 * <p>Provides auto-configuration for Spring Boot
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default transport provider is used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@AutoConfiguration
@ConditionalOnClass(VideoIntelligenceServiceClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.videointelligence.v1.spring.auto.video-intelligence-service.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({
  VideoIntelligenceServiceSpringProperties.class,
  GlobalProperties.class
})
public class VideoIntelligenceServiceSpringAutoConfiguration {
  private final VideoIntelligenceServiceSpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER =
      LogFactory.getLog(VideoIntelligenceServiceSpringAutoConfiguration.class);

  protected VideoIntelligenceServiceSpringAutoConfiguration(
      VideoIntelligenceServiceSpringProperties clientProperties,
      GlobalProperties globalProperties) {
    this.clientProperties = clientProperties;
    this.globalProperties = globalProperties;
  }

  /**
   * Obtains the default credentials provider. The used key will be obtained from Spring Boot
   * configuration data files.
   */
  @Bean
  @ConditionalOnMissingBean
  public CredentialsProvider videoIntelligenceServiceCredentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from VideoIntelligenceService-specific configuration");
      }
      return ((CredentialsProvider) new DefaultCredentialsProvider(this.clientProperties));
    }
    if (LOGGER.isTraceEnabled()) {
      LOGGER.trace("Using credentials from global configuration");
    }
    return ((CredentialsProvider) new DefaultCredentialsProvider(this.globalProperties));
  }

  /**
   * Returns the default channel provider. The default is gRPC and will default to it unless the
   * useRest option is provided to use HTTP transport instead
   */
  @Bean
  @ConditionalOnMissingBean
  public TransportChannelProvider defaultVideoIntelligenceServiceTransportChannelProvider() {
    return VideoIntelligenceServiceSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a VideoIntelligenceServiceClient bean configured to use the default credentials
   * provider (obtained with videoIntelligenceServiceCredentials()) and its default transport
   * channel provider (defaultVideoIntelligenceServiceTransportChannelProvider()). It also
   * configures the quota project ID if provided. It will configure an executor provider in case
   * there is more than one thread configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in VideoIntelligenceServiceSpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public VideoIntelligenceServiceClient videoIntelligenceServiceClient(
      @Qualifier("videoIntelligenceServiceCredentials") CredentialsProvider credentialsProvider,
      @Qualifier("defaultVideoIntelligenceServiceTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    VideoIntelligenceServiceSettings.Builder clientSettingsBuilder =
        VideoIntelligenceServiceSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .setTransportChannelProvider(defaultTransportChannelProvider)
            .setHeaderProvider(this.userAgentHeaderProvider());
    if (this.clientProperties.getQuotaProjectId() != null) {
      clientSettingsBuilder.setQuotaProjectId(this.clientProperties.getQuotaProjectId());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Quota project id set to "
                + this.clientProperties.getQuotaProjectId()
                + ", this overrides project id from credentials.");
      }
    }
    if (this.clientProperties.getExecutorThreadCount() != null) {
      ExecutorProvider executorProvider =
          VideoIntelligenceServiceSettings.defaultExecutorProviderBuilder()
              .setExecutorThreadCount(this.clientProperties.getExecutorThreadCount())
              .build();
      clientSettingsBuilder.setBackgroundExecutorProvider(executorProvider);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Background executor thread count is "
                + this.clientProperties.getExecutorThreadCount());
      }
    }
    if (this.clientProperties.getUseRest()) {
      clientSettingsBuilder.setTransportChannelProvider(
          VideoIntelligenceServiceSettings.defaultHttpJsonTransportProviderBuilder().build());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using HTTP transport channel");
      }
    }
    RetrySettings.Builder annotateVideoRetrySettingBuilder =
        clientSettingsBuilder.annotateVideoSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getAnnotateVideoInitialRetryDelay() != null) {
      annotateVideoRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getAnnotateVideoInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AnnotateVideoInitialRetryDelay set to "
                + this.clientProperties.getAnnotateVideoInitialRetryDelay());
      }
    }
    if (this.clientProperties.getAnnotateVideoRetryDelayMultiplier() != null) {
      annotateVideoRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getAnnotateVideoRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AnnotateVideoRetryDelayMultiplier set to "
                + this.clientProperties.getAnnotateVideoRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getAnnotateVideoMaxRetryDelay() != null) {
      annotateVideoRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getAnnotateVideoMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AnnotateVideoMaxRetryDelay set to "
                + this.clientProperties.getAnnotateVideoMaxRetryDelay());
      }
    }
    if (this.clientProperties.getAnnotateVideoInitialRpcTimeout() != null) {
      annotateVideoRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getAnnotateVideoInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AnnotateVideoInitialRpcTimeout set to "
                + this.clientProperties.getAnnotateVideoInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getAnnotateVideoRpcTimeoutMultiplier() != null) {
      annotateVideoRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getAnnotateVideoRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AnnotateVideoRpcTimeoutMultiplier set to "
                + this.clientProperties.getAnnotateVideoRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getAnnotateVideoMaxRpcTimeout() != null) {
      annotateVideoRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getAnnotateVideoMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AnnotateVideoMaxRpcTimeout set to "
                + this.clientProperties.getAnnotateVideoMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getAnnotateVideoTotalTimeout() != null) {
      annotateVideoRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getAnnotateVideoTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AnnotateVideoTotalTimeout set to "
                + this.clientProperties.getAnnotateVideoTotalTimeout());
      }
    }
    clientSettingsBuilder
        .annotateVideoSettings()
        .setRetrySettings(annotateVideoRetrySettingBuilder.build());
    return VideoIntelligenceServiceClient.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-video-intelligence-service";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
