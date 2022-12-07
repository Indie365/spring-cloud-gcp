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

package com.google.cloud.dialogflow.v2.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.dialogflow.v2.IntentsClient;
import com.google.cloud.dialogflow.v2.IntentsSettings;
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
 * Auto-configuration for {@link IntentsClient}.
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
@ConditionalOnClass(IntentsClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.dialogflow.v2.spring.auto.intents.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({IntentsSpringProperties.class, GlobalProperties.class})
public class IntentsSpringAutoConfiguration {
  private final IntentsSpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER = LogFactory.getLog(IntentsSpringAutoConfiguration.class);

  protected IntentsSpringAutoConfiguration(
      IntentsSpringProperties clientProperties, GlobalProperties globalProperties) {
    this.clientProperties = clientProperties;
    this.globalProperties = globalProperties;
  }

  /**
   * Obtains the default credentials provider. The used key will be obtained from Spring Boot
   * configuration data files.
   */
  @Bean
  @ConditionalOnMissingBean
  public CredentialsProvider intentsCredentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from Intents-specific configuration");
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
  public TransportChannelProvider defaultIntentsTransportChannelProvider() {
    return IntentsSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a IntentsClient bean configured to use the default credentials provider (obtained with
   * intentsCredentials()) and its default transport channel provider
   * (defaultIntentsTransportChannelProvider()). It also configures the quota project ID if
   * provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in IntentsSpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public IntentsClient intentsClient(
      @Qualifier("intentsCredentials") CredentialsProvider credentialsProvider,
      @Qualifier("defaultIntentsTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    IntentsSettings.Builder clientSettingsBuilder =
        IntentsSettings.newBuilder()
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
          IntentsSettings.defaultExecutorProviderBuilder()
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
          IntentsSettings.defaultHttpJsonTransportProviderBuilder().build());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using HTTP transport channel");
      }
    }
    RetrySettings.Builder listIntentsRetrySettingBuilder =
        clientSettingsBuilder.listIntentsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListIntentsInitialRetryDelay() != null) {
      listIntentsRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getListIntentsInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListIntentsInitialRetryDelay set to "
                + this.clientProperties.getListIntentsInitialRetryDelay());
      }
    }
    if (this.clientProperties.getListIntentsRetryDelayMultiplier() != null) {
      listIntentsRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getListIntentsRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListIntentsRetryDelayMultiplier set to "
                + this.clientProperties.getListIntentsRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getListIntentsMaxRetryDelay() != null) {
      listIntentsRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getListIntentsMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListIntentsMaxRetryDelay set to "
                + this.clientProperties.getListIntentsMaxRetryDelay());
      }
    }
    if (this.clientProperties.getListIntentsInitialRpcTimeout() != null) {
      listIntentsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListIntentsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListIntentsInitialRpcTimeout set to "
                + this.clientProperties.getListIntentsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListIntentsRpcTimeoutMultiplier() != null) {
      listIntentsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListIntentsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListIntentsRpcTimeoutMultiplier set to "
                + this.clientProperties.getListIntentsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListIntentsMaxRpcTimeout() != null) {
      listIntentsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListIntentsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListIntentsMaxRpcTimeout set to "
                + this.clientProperties.getListIntentsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListIntentsTotalTimeout() != null) {
      listIntentsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListIntentsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListIntentsTotalTimeout set to " + this.clientProperties.getListIntentsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listIntentsSettings()
        .setRetrySettings(listIntentsRetrySettingBuilder.build());
    RetrySettings.Builder getIntentRetrySettingBuilder =
        clientSettingsBuilder.getIntentSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetIntentInitialRetryDelay() != null) {
      getIntentRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getGetIntentInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIntentInitialRetryDelay set to "
                + this.clientProperties.getGetIntentInitialRetryDelay());
      }
    }
    if (this.clientProperties.getGetIntentRetryDelayMultiplier() != null) {
      getIntentRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getGetIntentRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIntentRetryDelayMultiplier set to "
                + this.clientProperties.getGetIntentRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getGetIntentMaxRetryDelay() != null) {
      getIntentRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getGetIntentMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIntentMaxRetryDelay set to " + this.clientProperties.getGetIntentMaxRetryDelay());
      }
    }
    if (this.clientProperties.getGetIntentInitialRpcTimeout() != null) {
      getIntentRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetIntentInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIntentInitialRpcTimeout set to "
                + this.clientProperties.getGetIntentInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetIntentRpcTimeoutMultiplier() != null) {
      getIntentRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetIntentRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIntentRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetIntentRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetIntentMaxRpcTimeout() != null) {
      getIntentRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetIntentMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIntentMaxRpcTimeout set to " + this.clientProperties.getGetIntentMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetIntentTotalTimeout() != null) {
      getIntentRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetIntentTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIntentTotalTimeout set to " + this.clientProperties.getGetIntentTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getIntentSettings()
        .setRetrySettings(getIntentRetrySettingBuilder.build());
    RetrySettings.Builder createIntentRetrySettingBuilder =
        clientSettingsBuilder.createIntentSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getCreateIntentInitialRetryDelay() != null) {
      createIntentRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getCreateIntentInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateIntentInitialRetryDelay set to "
                + this.clientProperties.getCreateIntentInitialRetryDelay());
      }
    }
    if (this.clientProperties.getCreateIntentRetryDelayMultiplier() != null) {
      createIntentRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getCreateIntentRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateIntentRetryDelayMultiplier set to "
                + this.clientProperties.getCreateIntentRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getCreateIntentMaxRetryDelay() != null) {
      createIntentRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getCreateIntentMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateIntentMaxRetryDelay set to "
                + this.clientProperties.getCreateIntentMaxRetryDelay());
      }
    }
    if (this.clientProperties.getCreateIntentInitialRpcTimeout() != null) {
      createIntentRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getCreateIntentInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateIntentInitialRpcTimeout set to "
                + this.clientProperties.getCreateIntentInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateIntentRpcTimeoutMultiplier() != null) {
      createIntentRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getCreateIntentRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateIntentRpcTimeoutMultiplier set to "
                + this.clientProperties.getCreateIntentRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getCreateIntentMaxRpcTimeout() != null) {
      createIntentRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getCreateIntentMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateIntentMaxRpcTimeout set to "
                + this.clientProperties.getCreateIntentMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateIntentTotalTimeout() != null) {
      createIntentRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getCreateIntentTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateIntentTotalTimeout set to "
                + this.clientProperties.getCreateIntentTotalTimeout());
      }
    }
    clientSettingsBuilder
        .createIntentSettings()
        .setRetrySettings(createIntentRetrySettingBuilder.build());
    RetrySettings.Builder updateIntentRetrySettingBuilder =
        clientSettingsBuilder.updateIntentSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getUpdateIntentInitialRetryDelay() != null) {
      updateIntentRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getUpdateIntentInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateIntentInitialRetryDelay set to "
                + this.clientProperties.getUpdateIntentInitialRetryDelay());
      }
    }
    if (this.clientProperties.getUpdateIntentRetryDelayMultiplier() != null) {
      updateIntentRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getUpdateIntentRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateIntentRetryDelayMultiplier set to "
                + this.clientProperties.getUpdateIntentRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getUpdateIntentMaxRetryDelay() != null) {
      updateIntentRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getUpdateIntentMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateIntentMaxRetryDelay set to "
                + this.clientProperties.getUpdateIntentMaxRetryDelay());
      }
    }
    if (this.clientProperties.getUpdateIntentInitialRpcTimeout() != null) {
      updateIntentRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getUpdateIntentInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateIntentInitialRpcTimeout set to "
                + this.clientProperties.getUpdateIntentInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateIntentRpcTimeoutMultiplier() != null) {
      updateIntentRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getUpdateIntentRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateIntentRpcTimeoutMultiplier set to "
                + this.clientProperties.getUpdateIntentRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getUpdateIntentMaxRpcTimeout() != null) {
      updateIntentRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getUpdateIntentMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateIntentMaxRpcTimeout set to "
                + this.clientProperties.getUpdateIntentMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateIntentTotalTimeout() != null) {
      updateIntentRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getUpdateIntentTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateIntentTotalTimeout set to "
                + this.clientProperties.getUpdateIntentTotalTimeout());
      }
    }
    clientSettingsBuilder
        .updateIntentSettings()
        .setRetrySettings(updateIntentRetrySettingBuilder.build());
    RetrySettings.Builder deleteIntentRetrySettingBuilder =
        clientSettingsBuilder.deleteIntentSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDeleteIntentInitialRetryDelay() != null) {
      deleteIntentRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getDeleteIntentInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteIntentInitialRetryDelay set to "
                + this.clientProperties.getDeleteIntentInitialRetryDelay());
      }
    }
    if (this.clientProperties.getDeleteIntentRetryDelayMultiplier() != null) {
      deleteIntentRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getDeleteIntentRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteIntentRetryDelayMultiplier set to "
                + this.clientProperties.getDeleteIntentRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getDeleteIntentMaxRetryDelay() != null) {
      deleteIntentRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getDeleteIntentMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteIntentMaxRetryDelay set to "
                + this.clientProperties.getDeleteIntentMaxRetryDelay());
      }
    }
    if (this.clientProperties.getDeleteIntentInitialRpcTimeout() != null) {
      deleteIntentRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDeleteIntentInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteIntentInitialRpcTimeout set to "
                + this.clientProperties.getDeleteIntentInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteIntentRpcTimeoutMultiplier() != null) {
      deleteIntentRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDeleteIntentRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteIntentRpcTimeoutMultiplier set to "
                + this.clientProperties.getDeleteIntentRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDeleteIntentMaxRpcTimeout() != null) {
      deleteIntentRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDeleteIntentMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteIntentMaxRpcTimeout set to "
                + this.clientProperties.getDeleteIntentMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteIntentTotalTimeout() != null) {
      deleteIntentRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDeleteIntentTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteIntentTotalTimeout set to "
                + this.clientProperties.getDeleteIntentTotalTimeout());
      }
    }
    clientSettingsBuilder
        .deleteIntentSettings()
        .setRetrySettings(deleteIntentRetrySettingBuilder.build());
    RetrySettings.Builder batchUpdateIntentsRetrySettingBuilder =
        clientSettingsBuilder.batchUpdateIntentsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getBatchUpdateIntentsInitialRetryDelay() != null) {
      batchUpdateIntentsRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getBatchUpdateIntentsInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchUpdateIntentsInitialRetryDelay set to "
                + this.clientProperties.getBatchUpdateIntentsInitialRetryDelay());
      }
    }
    if (this.clientProperties.getBatchUpdateIntentsRetryDelayMultiplier() != null) {
      batchUpdateIntentsRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getBatchUpdateIntentsRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchUpdateIntentsRetryDelayMultiplier set to "
                + this.clientProperties.getBatchUpdateIntentsRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getBatchUpdateIntentsMaxRetryDelay() != null) {
      batchUpdateIntentsRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getBatchUpdateIntentsMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchUpdateIntentsMaxRetryDelay set to "
                + this.clientProperties.getBatchUpdateIntentsMaxRetryDelay());
      }
    }
    if (this.clientProperties.getBatchUpdateIntentsInitialRpcTimeout() != null) {
      batchUpdateIntentsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getBatchUpdateIntentsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchUpdateIntentsInitialRpcTimeout set to "
                + this.clientProperties.getBatchUpdateIntentsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchUpdateIntentsRpcTimeoutMultiplier() != null) {
      batchUpdateIntentsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getBatchUpdateIntentsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchUpdateIntentsRpcTimeoutMultiplier set to "
                + this.clientProperties.getBatchUpdateIntentsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getBatchUpdateIntentsMaxRpcTimeout() != null) {
      batchUpdateIntentsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getBatchUpdateIntentsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchUpdateIntentsMaxRpcTimeout set to "
                + this.clientProperties.getBatchUpdateIntentsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchUpdateIntentsTotalTimeout() != null) {
      batchUpdateIntentsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getBatchUpdateIntentsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchUpdateIntentsTotalTimeout set to "
                + this.clientProperties.getBatchUpdateIntentsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .batchUpdateIntentsSettings()
        .setRetrySettings(batchUpdateIntentsRetrySettingBuilder.build());
    RetrySettings.Builder batchDeleteIntentsRetrySettingBuilder =
        clientSettingsBuilder.batchDeleteIntentsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getBatchDeleteIntentsInitialRetryDelay() != null) {
      batchDeleteIntentsRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getBatchDeleteIntentsInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchDeleteIntentsInitialRetryDelay set to "
                + this.clientProperties.getBatchDeleteIntentsInitialRetryDelay());
      }
    }
    if (this.clientProperties.getBatchDeleteIntentsRetryDelayMultiplier() != null) {
      batchDeleteIntentsRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getBatchDeleteIntentsRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchDeleteIntentsRetryDelayMultiplier set to "
                + this.clientProperties.getBatchDeleteIntentsRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getBatchDeleteIntentsMaxRetryDelay() != null) {
      batchDeleteIntentsRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getBatchDeleteIntentsMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchDeleteIntentsMaxRetryDelay set to "
                + this.clientProperties.getBatchDeleteIntentsMaxRetryDelay());
      }
    }
    if (this.clientProperties.getBatchDeleteIntentsInitialRpcTimeout() != null) {
      batchDeleteIntentsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getBatchDeleteIntentsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchDeleteIntentsInitialRpcTimeout set to "
                + this.clientProperties.getBatchDeleteIntentsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchDeleteIntentsRpcTimeoutMultiplier() != null) {
      batchDeleteIntentsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getBatchDeleteIntentsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchDeleteIntentsRpcTimeoutMultiplier set to "
                + this.clientProperties.getBatchDeleteIntentsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getBatchDeleteIntentsMaxRpcTimeout() != null) {
      batchDeleteIntentsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getBatchDeleteIntentsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchDeleteIntentsMaxRpcTimeout set to "
                + this.clientProperties.getBatchDeleteIntentsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchDeleteIntentsTotalTimeout() != null) {
      batchDeleteIntentsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getBatchDeleteIntentsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchDeleteIntentsTotalTimeout set to "
                + this.clientProperties.getBatchDeleteIntentsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .batchDeleteIntentsSettings()
        .setRetrySettings(batchDeleteIntentsRetrySettingBuilder.build());
    RetrySettings.Builder listLocationsRetrySettingBuilder =
        clientSettingsBuilder.listLocationsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListLocationsInitialRetryDelay() != null) {
      listLocationsRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getListLocationsInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListLocationsInitialRetryDelay set to "
                + this.clientProperties.getListLocationsInitialRetryDelay());
      }
    }
    if (this.clientProperties.getListLocationsRetryDelayMultiplier() != null) {
      listLocationsRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getListLocationsRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListLocationsRetryDelayMultiplier set to "
                + this.clientProperties.getListLocationsRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getListLocationsMaxRetryDelay() != null) {
      listLocationsRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getListLocationsMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListLocationsMaxRetryDelay set to "
                + this.clientProperties.getListLocationsMaxRetryDelay());
      }
    }
    if (this.clientProperties.getListLocationsInitialRpcTimeout() != null) {
      listLocationsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListLocationsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListLocationsInitialRpcTimeout set to "
                + this.clientProperties.getListLocationsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListLocationsRpcTimeoutMultiplier() != null) {
      listLocationsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListLocationsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListLocationsRpcTimeoutMultiplier set to "
                + this.clientProperties.getListLocationsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListLocationsMaxRpcTimeout() != null) {
      listLocationsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListLocationsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListLocationsMaxRpcTimeout set to "
                + this.clientProperties.getListLocationsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListLocationsTotalTimeout() != null) {
      listLocationsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListLocationsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListLocationsTotalTimeout set to "
                + this.clientProperties.getListLocationsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listLocationsSettings()
        .setRetrySettings(listLocationsRetrySettingBuilder.build());
    RetrySettings.Builder getLocationRetrySettingBuilder =
        clientSettingsBuilder.getLocationSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetLocationInitialRetryDelay() != null) {
      getLocationRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getGetLocationInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetLocationInitialRetryDelay set to "
                + this.clientProperties.getGetLocationInitialRetryDelay());
      }
    }
    if (this.clientProperties.getGetLocationRetryDelayMultiplier() != null) {
      getLocationRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getGetLocationRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetLocationRetryDelayMultiplier set to "
                + this.clientProperties.getGetLocationRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getGetLocationMaxRetryDelay() != null) {
      getLocationRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getGetLocationMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetLocationMaxRetryDelay set to "
                + this.clientProperties.getGetLocationMaxRetryDelay());
      }
    }
    if (this.clientProperties.getGetLocationInitialRpcTimeout() != null) {
      getLocationRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetLocationInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetLocationInitialRpcTimeout set to "
                + this.clientProperties.getGetLocationInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetLocationRpcTimeoutMultiplier() != null) {
      getLocationRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetLocationRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetLocationRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetLocationRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetLocationMaxRpcTimeout() != null) {
      getLocationRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetLocationMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetLocationMaxRpcTimeout set to "
                + this.clientProperties.getGetLocationMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetLocationTotalTimeout() != null) {
      getLocationRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetLocationTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetLocationTotalTimeout set to " + this.clientProperties.getGetLocationTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getLocationSettings()
        .setRetrySettings(getLocationRetrySettingBuilder.build());
    return IntentsClient.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-intents";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
