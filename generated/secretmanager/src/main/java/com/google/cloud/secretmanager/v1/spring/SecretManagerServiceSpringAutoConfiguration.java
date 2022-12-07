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

package com.google.cloud.secretmanager.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1.SecretManagerServiceSettings;
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
 * Auto-configuration for {@link SecretManagerServiceClient}.
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
@ConditionalOnClass(SecretManagerServiceClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.secretmanager.v1.spring.auto.secret-manager-service.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({SecretManagerServiceSpringProperties.class, GlobalProperties.class})
public class SecretManagerServiceSpringAutoConfiguration {
  private final SecretManagerServiceSpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER =
      LogFactory.getLog(SecretManagerServiceSpringAutoConfiguration.class);

  protected SecretManagerServiceSpringAutoConfiguration(
      SecretManagerServiceSpringProperties clientProperties, GlobalProperties globalProperties) {
    this.clientProperties = clientProperties;
    this.globalProperties = globalProperties;
  }

  /**
   * Obtains the default credentials provider. The used key will be obtained from Spring Boot
   * configuration data files.
   */
  @Bean
  @ConditionalOnMissingBean
  public CredentialsProvider secretManagerServiceCredentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from SecretManagerService-specific configuration");
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
  public TransportChannelProvider defaultSecretManagerServiceTransportChannelProvider() {
    return SecretManagerServiceSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a SecretManagerServiceClient bean configured to use the default credentials provider
   * (obtained with secretManagerServiceCredentials()) and its default transport channel provider
   * (defaultSecretManagerServiceTransportChannelProvider()). It also configures the quota project
   * ID if provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in SecretManagerServiceSpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public SecretManagerServiceClient secretManagerServiceClient(
      @Qualifier("secretManagerServiceCredentials") CredentialsProvider credentialsProvider,
      @Qualifier("defaultSecretManagerServiceTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    SecretManagerServiceSettings.Builder clientSettingsBuilder =
        SecretManagerServiceSettings.newBuilder()
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
          SecretManagerServiceSettings.defaultExecutorProviderBuilder()
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
          SecretManagerServiceSettings.defaultHttpJsonTransportProviderBuilder().build());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using HTTP transport channel");
      }
    }
    RetrySettings.Builder listSecretsRetrySettingBuilder =
        clientSettingsBuilder.listSecretsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListSecretsInitialRpcTimeout() != null) {
      listSecretsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListSecretsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretsInitialRpcTimeout set to "
                + this.clientProperties.getListSecretsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListSecretsRpcTimeoutMultiplier() != null) {
      listSecretsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListSecretsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretsRpcTimeoutMultiplier set to "
                + this.clientProperties.getListSecretsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListSecretsMaxRpcTimeout() != null) {
      listSecretsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListSecretsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretsMaxRpcTimeout set to "
                + this.clientProperties.getListSecretsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListSecretsTotalTimeout() != null) {
      listSecretsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListSecretsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretsTotalTimeout set to " + this.clientProperties.getListSecretsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listSecretsSettings()
        .setRetrySettings(listSecretsRetrySettingBuilder.build());
    RetrySettings.Builder createSecretRetrySettingBuilder =
        clientSettingsBuilder.createSecretSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getCreateSecretInitialRpcTimeout() != null) {
      createSecretRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getCreateSecretInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateSecretInitialRpcTimeout set to "
                + this.clientProperties.getCreateSecretInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateSecretRpcTimeoutMultiplier() != null) {
      createSecretRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getCreateSecretRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateSecretRpcTimeoutMultiplier set to "
                + this.clientProperties.getCreateSecretRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getCreateSecretMaxRpcTimeout() != null) {
      createSecretRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getCreateSecretMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateSecretMaxRpcTimeout set to "
                + this.clientProperties.getCreateSecretMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateSecretTotalTimeout() != null) {
      createSecretRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getCreateSecretTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateSecretTotalTimeout set to "
                + this.clientProperties.getCreateSecretTotalTimeout());
      }
    }
    clientSettingsBuilder
        .createSecretSettings()
        .setRetrySettings(createSecretRetrySettingBuilder.build());
    RetrySettings.Builder addSecretVersionRetrySettingBuilder =
        clientSettingsBuilder.addSecretVersionSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getAddSecretVersionInitialRpcTimeout() != null) {
      addSecretVersionRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getAddSecretVersionInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AddSecretVersionInitialRpcTimeout set to "
                + this.clientProperties.getAddSecretVersionInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getAddSecretVersionRpcTimeoutMultiplier() != null) {
      addSecretVersionRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getAddSecretVersionRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AddSecretVersionRpcTimeoutMultiplier set to "
                + this.clientProperties.getAddSecretVersionRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getAddSecretVersionMaxRpcTimeout() != null) {
      addSecretVersionRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getAddSecretVersionMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AddSecretVersionMaxRpcTimeout set to "
                + this.clientProperties.getAddSecretVersionMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getAddSecretVersionTotalTimeout() != null) {
      addSecretVersionRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getAddSecretVersionTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AddSecretVersionTotalTimeout set to "
                + this.clientProperties.getAddSecretVersionTotalTimeout());
      }
    }
    clientSettingsBuilder
        .addSecretVersionSettings()
        .setRetrySettings(addSecretVersionRetrySettingBuilder.build());
    RetrySettings.Builder getSecretRetrySettingBuilder =
        clientSettingsBuilder.getSecretSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetSecretInitialRpcTimeout() != null) {
      getSecretRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetSecretInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretInitialRpcTimeout set to "
                + this.clientProperties.getGetSecretInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetSecretRpcTimeoutMultiplier() != null) {
      getSecretRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetSecretRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetSecretRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetSecretMaxRpcTimeout() != null) {
      getSecretRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetSecretMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretMaxRpcTimeout set to " + this.clientProperties.getGetSecretMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetSecretTotalTimeout() != null) {
      getSecretRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetSecretTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretTotalTimeout set to " + this.clientProperties.getGetSecretTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getSecretSettings()
        .setRetrySettings(getSecretRetrySettingBuilder.build());
    RetrySettings.Builder updateSecretRetrySettingBuilder =
        clientSettingsBuilder.updateSecretSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getUpdateSecretInitialRpcTimeout() != null) {
      updateSecretRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getUpdateSecretInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateSecretInitialRpcTimeout set to "
                + this.clientProperties.getUpdateSecretInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateSecretRpcTimeoutMultiplier() != null) {
      updateSecretRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getUpdateSecretRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateSecretRpcTimeoutMultiplier set to "
                + this.clientProperties.getUpdateSecretRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getUpdateSecretMaxRpcTimeout() != null) {
      updateSecretRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getUpdateSecretMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateSecretMaxRpcTimeout set to "
                + this.clientProperties.getUpdateSecretMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateSecretTotalTimeout() != null) {
      updateSecretRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getUpdateSecretTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateSecretTotalTimeout set to "
                + this.clientProperties.getUpdateSecretTotalTimeout());
      }
    }
    clientSettingsBuilder
        .updateSecretSettings()
        .setRetrySettings(updateSecretRetrySettingBuilder.build());
    RetrySettings.Builder deleteSecretRetrySettingBuilder =
        clientSettingsBuilder.deleteSecretSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDeleteSecretInitialRpcTimeout() != null) {
      deleteSecretRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDeleteSecretInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteSecretInitialRpcTimeout set to "
                + this.clientProperties.getDeleteSecretInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteSecretRpcTimeoutMultiplier() != null) {
      deleteSecretRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDeleteSecretRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteSecretRpcTimeoutMultiplier set to "
                + this.clientProperties.getDeleteSecretRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDeleteSecretMaxRpcTimeout() != null) {
      deleteSecretRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDeleteSecretMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteSecretMaxRpcTimeout set to "
                + this.clientProperties.getDeleteSecretMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteSecretTotalTimeout() != null) {
      deleteSecretRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDeleteSecretTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteSecretTotalTimeout set to "
                + this.clientProperties.getDeleteSecretTotalTimeout());
      }
    }
    clientSettingsBuilder
        .deleteSecretSettings()
        .setRetrySettings(deleteSecretRetrySettingBuilder.build());
    RetrySettings.Builder listSecretVersionsRetrySettingBuilder =
        clientSettingsBuilder.listSecretVersionsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListSecretVersionsInitialRpcTimeout() != null) {
      listSecretVersionsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListSecretVersionsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretVersionsInitialRpcTimeout set to "
                + this.clientProperties.getListSecretVersionsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListSecretVersionsRpcTimeoutMultiplier() != null) {
      listSecretVersionsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListSecretVersionsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretVersionsRpcTimeoutMultiplier set to "
                + this.clientProperties.getListSecretVersionsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListSecretVersionsMaxRpcTimeout() != null) {
      listSecretVersionsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListSecretVersionsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretVersionsMaxRpcTimeout set to "
                + this.clientProperties.getListSecretVersionsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListSecretVersionsTotalTimeout() != null) {
      listSecretVersionsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListSecretVersionsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListSecretVersionsTotalTimeout set to "
                + this.clientProperties.getListSecretVersionsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listSecretVersionsSettings()
        .setRetrySettings(listSecretVersionsRetrySettingBuilder.build());
    RetrySettings.Builder getSecretVersionRetrySettingBuilder =
        clientSettingsBuilder.getSecretVersionSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetSecretVersionInitialRpcTimeout() != null) {
      getSecretVersionRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetSecretVersionInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretVersionInitialRpcTimeout set to "
                + this.clientProperties.getGetSecretVersionInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetSecretVersionRpcTimeoutMultiplier() != null) {
      getSecretVersionRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetSecretVersionRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretVersionRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetSecretVersionRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetSecretVersionMaxRpcTimeout() != null) {
      getSecretVersionRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetSecretVersionMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretVersionMaxRpcTimeout set to "
                + this.clientProperties.getGetSecretVersionMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetSecretVersionTotalTimeout() != null) {
      getSecretVersionRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetSecretVersionTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetSecretVersionTotalTimeout set to "
                + this.clientProperties.getGetSecretVersionTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getSecretVersionSettings()
        .setRetrySettings(getSecretVersionRetrySettingBuilder.build());
    RetrySettings.Builder accessSecretVersionRetrySettingBuilder =
        clientSettingsBuilder.accessSecretVersionSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getAccessSecretVersionInitialRetryDelay() != null) {
      accessSecretVersionRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getAccessSecretVersionInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AccessSecretVersionInitialRetryDelay set to "
                + this.clientProperties.getAccessSecretVersionInitialRetryDelay());
      }
    }
    if (this.clientProperties.getAccessSecretVersionRetryDelayMultiplier() != null) {
      accessSecretVersionRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getAccessSecretVersionRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AccessSecretVersionRetryDelayMultiplier set to "
                + this.clientProperties.getAccessSecretVersionRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getAccessSecretVersionMaxRetryDelay() != null) {
      accessSecretVersionRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getAccessSecretVersionMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AccessSecretVersionMaxRetryDelay set to "
                + this.clientProperties.getAccessSecretVersionMaxRetryDelay());
      }
    }
    if (this.clientProperties.getAccessSecretVersionInitialRpcTimeout() != null) {
      accessSecretVersionRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getAccessSecretVersionInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AccessSecretVersionInitialRpcTimeout set to "
                + this.clientProperties.getAccessSecretVersionInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getAccessSecretVersionRpcTimeoutMultiplier() != null) {
      accessSecretVersionRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getAccessSecretVersionRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AccessSecretVersionRpcTimeoutMultiplier set to "
                + this.clientProperties.getAccessSecretVersionRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getAccessSecretVersionMaxRpcTimeout() != null) {
      accessSecretVersionRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getAccessSecretVersionMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AccessSecretVersionMaxRpcTimeout set to "
                + this.clientProperties.getAccessSecretVersionMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getAccessSecretVersionTotalTimeout() != null) {
      accessSecretVersionRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getAccessSecretVersionTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "AccessSecretVersionTotalTimeout set to "
                + this.clientProperties.getAccessSecretVersionTotalTimeout());
      }
    }
    clientSettingsBuilder
        .accessSecretVersionSettings()
        .setRetrySettings(accessSecretVersionRetrySettingBuilder.build());
    RetrySettings.Builder disableSecretVersionRetrySettingBuilder =
        clientSettingsBuilder.disableSecretVersionSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDisableSecretVersionInitialRpcTimeout() != null) {
      disableSecretVersionRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDisableSecretVersionInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableSecretVersionInitialRpcTimeout set to "
                + this.clientProperties.getDisableSecretVersionInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDisableSecretVersionRpcTimeoutMultiplier() != null) {
      disableSecretVersionRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDisableSecretVersionRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableSecretVersionRpcTimeoutMultiplier set to "
                + this.clientProperties.getDisableSecretVersionRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDisableSecretVersionMaxRpcTimeout() != null) {
      disableSecretVersionRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDisableSecretVersionMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableSecretVersionMaxRpcTimeout set to "
                + this.clientProperties.getDisableSecretVersionMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDisableSecretVersionTotalTimeout() != null) {
      disableSecretVersionRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDisableSecretVersionTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableSecretVersionTotalTimeout set to "
                + this.clientProperties.getDisableSecretVersionTotalTimeout());
      }
    }
    clientSettingsBuilder
        .disableSecretVersionSettings()
        .setRetrySettings(disableSecretVersionRetrySettingBuilder.build());
    RetrySettings.Builder enableSecretVersionRetrySettingBuilder =
        clientSettingsBuilder.enableSecretVersionSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getEnableSecretVersionInitialRpcTimeout() != null) {
      enableSecretVersionRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getEnableSecretVersionInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableSecretVersionInitialRpcTimeout set to "
                + this.clientProperties.getEnableSecretVersionInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getEnableSecretVersionRpcTimeoutMultiplier() != null) {
      enableSecretVersionRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getEnableSecretVersionRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableSecretVersionRpcTimeoutMultiplier set to "
                + this.clientProperties.getEnableSecretVersionRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getEnableSecretVersionMaxRpcTimeout() != null) {
      enableSecretVersionRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getEnableSecretVersionMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableSecretVersionMaxRpcTimeout set to "
                + this.clientProperties.getEnableSecretVersionMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getEnableSecretVersionTotalTimeout() != null) {
      enableSecretVersionRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getEnableSecretVersionTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableSecretVersionTotalTimeout set to "
                + this.clientProperties.getEnableSecretVersionTotalTimeout());
      }
    }
    clientSettingsBuilder
        .enableSecretVersionSettings()
        .setRetrySettings(enableSecretVersionRetrySettingBuilder.build());
    RetrySettings.Builder destroySecretVersionRetrySettingBuilder =
        clientSettingsBuilder.destroySecretVersionSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDestroySecretVersionInitialRpcTimeout() != null) {
      destroySecretVersionRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDestroySecretVersionInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DestroySecretVersionInitialRpcTimeout set to "
                + this.clientProperties.getDestroySecretVersionInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDestroySecretVersionRpcTimeoutMultiplier() != null) {
      destroySecretVersionRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDestroySecretVersionRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DestroySecretVersionRpcTimeoutMultiplier set to "
                + this.clientProperties.getDestroySecretVersionRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDestroySecretVersionMaxRpcTimeout() != null) {
      destroySecretVersionRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDestroySecretVersionMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DestroySecretVersionMaxRpcTimeout set to "
                + this.clientProperties.getDestroySecretVersionMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDestroySecretVersionTotalTimeout() != null) {
      destroySecretVersionRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDestroySecretVersionTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DestroySecretVersionTotalTimeout set to "
                + this.clientProperties.getDestroySecretVersionTotalTimeout());
      }
    }
    clientSettingsBuilder
        .destroySecretVersionSettings()
        .setRetrySettings(destroySecretVersionRetrySettingBuilder.build());
    RetrySettings.Builder setIamPolicyRetrySettingBuilder =
        clientSettingsBuilder.setIamPolicySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getSetIamPolicyInitialRpcTimeout() != null) {
      setIamPolicyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getSetIamPolicyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "SetIamPolicyInitialRpcTimeout set to "
                + this.clientProperties.getSetIamPolicyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getSetIamPolicyRpcTimeoutMultiplier() != null) {
      setIamPolicyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getSetIamPolicyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "SetIamPolicyRpcTimeoutMultiplier set to "
                + this.clientProperties.getSetIamPolicyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getSetIamPolicyMaxRpcTimeout() != null) {
      setIamPolicyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getSetIamPolicyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "SetIamPolicyMaxRpcTimeout set to "
                + this.clientProperties.getSetIamPolicyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getSetIamPolicyTotalTimeout() != null) {
      setIamPolicyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getSetIamPolicyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "SetIamPolicyTotalTimeout set to "
                + this.clientProperties.getSetIamPolicyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .setIamPolicySettings()
        .setRetrySettings(setIamPolicyRetrySettingBuilder.build());
    RetrySettings.Builder getIamPolicyRetrySettingBuilder =
        clientSettingsBuilder.getIamPolicySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetIamPolicyInitialRpcTimeout() != null) {
      getIamPolicyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetIamPolicyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIamPolicyInitialRpcTimeout set to "
                + this.clientProperties.getGetIamPolicyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetIamPolicyRpcTimeoutMultiplier() != null) {
      getIamPolicyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetIamPolicyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIamPolicyRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetIamPolicyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetIamPolicyMaxRpcTimeout() != null) {
      getIamPolicyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetIamPolicyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIamPolicyMaxRpcTimeout set to "
                + this.clientProperties.getGetIamPolicyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetIamPolicyTotalTimeout() != null) {
      getIamPolicyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetIamPolicyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetIamPolicyTotalTimeout set to "
                + this.clientProperties.getGetIamPolicyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getIamPolicySettings()
        .setRetrySettings(getIamPolicyRetrySettingBuilder.build());
    RetrySettings.Builder testIamPermissionsRetrySettingBuilder =
        clientSettingsBuilder.testIamPermissionsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getTestIamPermissionsInitialRpcTimeout() != null) {
      testIamPermissionsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getTestIamPermissionsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "TestIamPermissionsInitialRpcTimeout set to "
                + this.clientProperties.getTestIamPermissionsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getTestIamPermissionsRpcTimeoutMultiplier() != null) {
      testIamPermissionsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getTestIamPermissionsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "TestIamPermissionsRpcTimeoutMultiplier set to "
                + this.clientProperties.getTestIamPermissionsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getTestIamPermissionsMaxRpcTimeout() != null) {
      testIamPermissionsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getTestIamPermissionsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "TestIamPermissionsMaxRpcTimeout set to "
                + this.clientProperties.getTestIamPermissionsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getTestIamPermissionsTotalTimeout() != null) {
      testIamPermissionsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getTestIamPermissionsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "TestIamPermissionsTotalTimeout set to "
                + this.clientProperties.getTestIamPermissionsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .testIamPermissionsSettings()
        .setRetrySettings(testIamPermissionsRetrySettingBuilder.build());
    return SecretManagerServiceClient.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-secret-manager-service";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
