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

package com.google.cloud.monitoring.v3.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.monitoring.v3.AlertPolicyServiceClient;
import com.google.cloud.monitoring.v3.AlertPolicyServiceSettings;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.DefaultCredentialsProvider;
import com.google.cloud.spring.global.GlobalProperties;
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
 * Auto-configuration for {@link AlertPolicyServiceClient}.
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
@ConditionalOnClass(AlertPolicyServiceClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.monitoring.v3.spring.auto.alert-policy-service.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({AlertPolicyServiceSpringProperties.class, GlobalProperties.class})
public class AlertPolicyServiceSpringAutoConfiguration {
  private final AlertPolicyServiceSpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER =
      LogFactory.getLog(AlertPolicyServiceSpringAutoConfiguration.class);

  protected AlertPolicyServiceSpringAutoConfiguration(
      AlertPolicyServiceSpringProperties clientProperties, GlobalProperties globalProperties) {
    this.clientProperties = clientProperties;
    this.globalProperties = globalProperties;
  }

  /**
   * Obtains the default credentials provider. The used key will be obtained from Spring Boot
   * configuration data files.
   */
  @Bean
  @ConditionalOnMissingBean
  public CredentialsProvider alertPolicyServiceCredentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from AlertPolicyService-specific configuration");
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
  public TransportChannelProvider defaultAlertPolicyServiceTransportChannelProvider() {
    return AlertPolicyServiceSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a AlertPolicyServiceClient bean configured to use the default credentials provider
   * (obtained with alertPolicyServiceCredentials()) and its default transport channel provider
   * (defaultAlertPolicyServiceTransportChannelProvider()). It also configures the quota project ID
   * if provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in AlertPolicyServiceSpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public AlertPolicyServiceClient alertPolicyServiceClient(
      @Qualifier("alertPolicyServiceCredentials") CredentialsProvider credentialsProvider,
      @Qualifier("defaultAlertPolicyServiceTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    AlertPolicyServiceSettings.Builder clientSettingsBuilder =
        AlertPolicyServiceSettings.newBuilder()
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
          AlertPolicyServiceSettings.defaultExecutorProviderBuilder()
              .setExecutorThreadCount(this.clientProperties.getExecutorThreadCount())
              .build();
      clientSettingsBuilder.setBackgroundExecutorProvider(executorProvider);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Background executor thread count is "
                + this.clientProperties.getExecutorThreadCount());
      }
    }
    RetrySettings.Builder listAlertPoliciesRetrySettingBuilder =
        clientSettingsBuilder.listAlertPoliciesSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListAlertPoliciesInitialRetryDelay() != null) {
      listAlertPoliciesRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getListAlertPoliciesInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListAlertPoliciesInitialRetryDelay set to "
                + this.clientProperties.getListAlertPoliciesInitialRetryDelay());
      }
    }
    if (this.clientProperties.getListAlertPoliciesRetryDelayMultiplier() != null) {
      listAlertPoliciesRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getListAlertPoliciesRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListAlertPoliciesRetryDelayMultiplier set to "
                + this.clientProperties.getListAlertPoliciesRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getListAlertPoliciesMaxRetryDelay() != null) {
      listAlertPoliciesRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getListAlertPoliciesMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListAlertPoliciesMaxRetryDelay set to "
                + this.clientProperties.getListAlertPoliciesMaxRetryDelay());
      }
    }
    if (this.clientProperties.getListAlertPoliciesInitialRpcTimeout() != null) {
      listAlertPoliciesRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListAlertPoliciesInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListAlertPoliciesInitialRpcTimeout set to "
                + this.clientProperties.getListAlertPoliciesInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListAlertPoliciesRpcTimeoutMultiplier() != null) {
      listAlertPoliciesRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListAlertPoliciesRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListAlertPoliciesRpcTimeoutMultiplier set to "
                + this.clientProperties.getListAlertPoliciesRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListAlertPoliciesMaxRpcTimeout() != null) {
      listAlertPoliciesRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListAlertPoliciesMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListAlertPoliciesMaxRpcTimeout set to "
                + this.clientProperties.getListAlertPoliciesMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListAlertPoliciesTotalTimeout() != null) {
      listAlertPoliciesRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListAlertPoliciesTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListAlertPoliciesTotalTimeout set to "
                + this.clientProperties.getListAlertPoliciesTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listAlertPoliciesSettings()
        .setRetrySettings(listAlertPoliciesRetrySettingBuilder.build());
    RetrySettings.Builder getAlertPolicyRetrySettingBuilder =
        clientSettingsBuilder.getAlertPolicySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetAlertPolicyInitialRetryDelay() != null) {
      getAlertPolicyRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getGetAlertPolicyInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetAlertPolicyInitialRetryDelay set to "
                + this.clientProperties.getGetAlertPolicyInitialRetryDelay());
      }
    }
    if (this.clientProperties.getGetAlertPolicyRetryDelayMultiplier() != null) {
      getAlertPolicyRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getGetAlertPolicyRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetAlertPolicyRetryDelayMultiplier set to "
                + this.clientProperties.getGetAlertPolicyRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getGetAlertPolicyMaxRetryDelay() != null) {
      getAlertPolicyRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getGetAlertPolicyMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetAlertPolicyMaxRetryDelay set to "
                + this.clientProperties.getGetAlertPolicyMaxRetryDelay());
      }
    }
    if (this.clientProperties.getGetAlertPolicyInitialRpcTimeout() != null) {
      getAlertPolicyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetAlertPolicyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetAlertPolicyInitialRpcTimeout set to "
                + this.clientProperties.getGetAlertPolicyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetAlertPolicyRpcTimeoutMultiplier() != null) {
      getAlertPolicyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetAlertPolicyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetAlertPolicyRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetAlertPolicyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetAlertPolicyMaxRpcTimeout() != null) {
      getAlertPolicyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetAlertPolicyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetAlertPolicyMaxRpcTimeout set to "
                + this.clientProperties.getGetAlertPolicyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetAlertPolicyTotalTimeout() != null) {
      getAlertPolicyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetAlertPolicyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetAlertPolicyTotalTimeout set to "
                + this.clientProperties.getGetAlertPolicyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getAlertPolicySettings()
        .setRetrySettings(getAlertPolicyRetrySettingBuilder.build());
    RetrySettings.Builder createAlertPolicyRetrySettingBuilder =
        clientSettingsBuilder.createAlertPolicySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getCreateAlertPolicyInitialRpcTimeout() != null) {
      createAlertPolicyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getCreateAlertPolicyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateAlertPolicyInitialRpcTimeout set to "
                + this.clientProperties.getCreateAlertPolicyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateAlertPolicyRpcTimeoutMultiplier() != null) {
      createAlertPolicyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getCreateAlertPolicyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateAlertPolicyRpcTimeoutMultiplier set to "
                + this.clientProperties.getCreateAlertPolicyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getCreateAlertPolicyMaxRpcTimeout() != null) {
      createAlertPolicyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getCreateAlertPolicyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateAlertPolicyMaxRpcTimeout set to "
                + this.clientProperties.getCreateAlertPolicyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateAlertPolicyTotalTimeout() != null) {
      createAlertPolicyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getCreateAlertPolicyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateAlertPolicyTotalTimeout set to "
                + this.clientProperties.getCreateAlertPolicyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .createAlertPolicySettings()
        .setRetrySettings(createAlertPolicyRetrySettingBuilder.build());
    RetrySettings.Builder deleteAlertPolicyRetrySettingBuilder =
        clientSettingsBuilder.deleteAlertPolicySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDeleteAlertPolicyInitialRetryDelay() != null) {
      deleteAlertPolicyRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getDeleteAlertPolicyInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteAlertPolicyInitialRetryDelay set to "
                + this.clientProperties.getDeleteAlertPolicyInitialRetryDelay());
      }
    }
    if (this.clientProperties.getDeleteAlertPolicyRetryDelayMultiplier() != null) {
      deleteAlertPolicyRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getDeleteAlertPolicyRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteAlertPolicyRetryDelayMultiplier set to "
                + this.clientProperties.getDeleteAlertPolicyRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getDeleteAlertPolicyMaxRetryDelay() != null) {
      deleteAlertPolicyRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getDeleteAlertPolicyMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteAlertPolicyMaxRetryDelay set to "
                + this.clientProperties.getDeleteAlertPolicyMaxRetryDelay());
      }
    }
    if (this.clientProperties.getDeleteAlertPolicyInitialRpcTimeout() != null) {
      deleteAlertPolicyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDeleteAlertPolicyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteAlertPolicyInitialRpcTimeout set to "
                + this.clientProperties.getDeleteAlertPolicyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteAlertPolicyRpcTimeoutMultiplier() != null) {
      deleteAlertPolicyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDeleteAlertPolicyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteAlertPolicyRpcTimeoutMultiplier set to "
                + this.clientProperties.getDeleteAlertPolicyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDeleteAlertPolicyMaxRpcTimeout() != null) {
      deleteAlertPolicyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDeleteAlertPolicyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteAlertPolicyMaxRpcTimeout set to "
                + this.clientProperties.getDeleteAlertPolicyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteAlertPolicyTotalTimeout() != null) {
      deleteAlertPolicyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDeleteAlertPolicyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteAlertPolicyTotalTimeout set to "
                + this.clientProperties.getDeleteAlertPolicyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .deleteAlertPolicySettings()
        .setRetrySettings(deleteAlertPolicyRetrySettingBuilder.build());
    RetrySettings.Builder updateAlertPolicyRetrySettingBuilder =
        clientSettingsBuilder.updateAlertPolicySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getUpdateAlertPolicyInitialRpcTimeout() != null) {
      updateAlertPolicyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getUpdateAlertPolicyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateAlertPolicyInitialRpcTimeout set to "
                + this.clientProperties.getUpdateAlertPolicyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateAlertPolicyRpcTimeoutMultiplier() != null) {
      updateAlertPolicyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getUpdateAlertPolicyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateAlertPolicyRpcTimeoutMultiplier set to "
                + this.clientProperties.getUpdateAlertPolicyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getUpdateAlertPolicyMaxRpcTimeout() != null) {
      updateAlertPolicyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getUpdateAlertPolicyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateAlertPolicyMaxRpcTimeout set to "
                + this.clientProperties.getUpdateAlertPolicyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateAlertPolicyTotalTimeout() != null) {
      updateAlertPolicyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getUpdateAlertPolicyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateAlertPolicyTotalTimeout set to "
                + this.clientProperties.getUpdateAlertPolicyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .updateAlertPolicySettings()
        .setRetrySettings(updateAlertPolicyRetrySettingBuilder.build());
    return AlertPolicyServiceClient.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-alert-policy-service";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
