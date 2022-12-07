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

package com.google.api.serviceusage.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.serviceusage.v1.ServiceUsageClient;
import com.google.api.serviceusage.v1.ServiceUsageSettings;
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
 * Auto-configuration for {@link ServiceUsageClient}.
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
@ConditionalOnClass(ServiceUsageClient.class)
@ConditionalOnProperty(
    value = "com.google.api.serviceusage.v1.spring.auto.service-usage.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({ServiceUsageSpringProperties.class, GlobalProperties.class})
public class ServiceUsageSpringAutoConfiguration {
  private final ServiceUsageSpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER = LogFactory.getLog(ServiceUsageSpringAutoConfiguration.class);

  protected ServiceUsageSpringAutoConfiguration(
      ServiceUsageSpringProperties clientProperties, GlobalProperties globalProperties) {
    this.clientProperties = clientProperties;
    this.globalProperties = globalProperties;
  }

  /**
   * Obtains the default credentials provider. The used key will be obtained from Spring Boot
   * configuration data files.
   */
  @Bean
  @ConditionalOnMissingBean
  public CredentialsProvider serviceUsageCredentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from ServiceUsage-specific configuration");
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
  public TransportChannelProvider defaultServiceUsageTransportChannelProvider() {
    return ServiceUsageSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a ServiceUsageClient bean configured to use the default credentials provider (obtained
   * with serviceUsageCredentials()) and its default transport channel provider
   * (defaultServiceUsageTransportChannelProvider()). It also configures the quota project ID if
   * provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in ServiceUsageSpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public ServiceUsageClient serviceUsageClient(
      @Qualifier("serviceUsageCredentials") CredentialsProvider credentialsProvider,
      @Qualifier("defaultServiceUsageTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    ServiceUsageSettings.Builder clientSettingsBuilder =
        ServiceUsageSettings.newBuilder()
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
          ServiceUsageSettings.defaultExecutorProviderBuilder()
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
          ServiceUsageSettings.defaultHttpJsonTransportProviderBuilder().build());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using HTTP transport channel");
      }
    }
    RetrySettings.Builder enableServiceRetrySettingBuilder =
        clientSettingsBuilder.enableServiceSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getEnableServiceInitialRpcTimeout() != null) {
      enableServiceRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getEnableServiceInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableServiceInitialRpcTimeout set to "
                + this.clientProperties.getEnableServiceInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getEnableServiceRpcTimeoutMultiplier() != null) {
      enableServiceRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getEnableServiceRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableServiceRpcTimeoutMultiplier set to "
                + this.clientProperties.getEnableServiceRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getEnableServiceMaxRpcTimeout() != null) {
      enableServiceRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getEnableServiceMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableServiceMaxRpcTimeout set to "
                + this.clientProperties.getEnableServiceMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getEnableServiceTotalTimeout() != null) {
      enableServiceRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getEnableServiceTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "EnableServiceTotalTimeout set to "
                + this.clientProperties.getEnableServiceTotalTimeout());
      }
    }
    clientSettingsBuilder
        .enableServiceSettings()
        .setRetrySettings(enableServiceRetrySettingBuilder.build());
    RetrySettings.Builder disableServiceRetrySettingBuilder =
        clientSettingsBuilder.disableServiceSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDisableServiceInitialRpcTimeout() != null) {
      disableServiceRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDisableServiceInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableServiceInitialRpcTimeout set to "
                + this.clientProperties.getDisableServiceInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDisableServiceRpcTimeoutMultiplier() != null) {
      disableServiceRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDisableServiceRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableServiceRpcTimeoutMultiplier set to "
                + this.clientProperties.getDisableServiceRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDisableServiceMaxRpcTimeout() != null) {
      disableServiceRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDisableServiceMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableServiceMaxRpcTimeout set to "
                + this.clientProperties.getDisableServiceMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDisableServiceTotalTimeout() != null) {
      disableServiceRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDisableServiceTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DisableServiceTotalTimeout set to "
                + this.clientProperties.getDisableServiceTotalTimeout());
      }
    }
    clientSettingsBuilder
        .disableServiceSettings()
        .setRetrySettings(disableServiceRetrySettingBuilder.build());
    RetrySettings.Builder getServiceRetrySettingBuilder =
        clientSettingsBuilder.getServiceSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetServiceInitialRpcTimeout() != null) {
      getServiceRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetServiceInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetServiceInitialRpcTimeout set to "
                + this.clientProperties.getGetServiceInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetServiceRpcTimeoutMultiplier() != null) {
      getServiceRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetServiceRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetServiceRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetServiceRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetServiceMaxRpcTimeout() != null) {
      getServiceRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetServiceMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetServiceMaxRpcTimeout set to " + this.clientProperties.getGetServiceMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetServiceTotalTimeout() != null) {
      getServiceRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetServiceTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetServiceTotalTimeout set to " + this.clientProperties.getGetServiceTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getServiceSettings()
        .setRetrySettings(getServiceRetrySettingBuilder.build());
    RetrySettings.Builder listServicesRetrySettingBuilder =
        clientSettingsBuilder.listServicesSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListServicesInitialRpcTimeout() != null) {
      listServicesRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListServicesInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListServicesInitialRpcTimeout set to "
                + this.clientProperties.getListServicesInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListServicesRpcTimeoutMultiplier() != null) {
      listServicesRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListServicesRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListServicesRpcTimeoutMultiplier set to "
                + this.clientProperties.getListServicesRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListServicesMaxRpcTimeout() != null) {
      listServicesRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListServicesMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListServicesMaxRpcTimeout set to "
                + this.clientProperties.getListServicesMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListServicesTotalTimeout() != null) {
      listServicesRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListServicesTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListServicesTotalTimeout set to "
                + this.clientProperties.getListServicesTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listServicesSettings()
        .setRetrySettings(listServicesRetrySettingBuilder.build());
    RetrySettings.Builder batchEnableServicesRetrySettingBuilder =
        clientSettingsBuilder.batchEnableServicesSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getBatchEnableServicesInitialRpcTimeout() != null) {
      batchEnableServicesRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getBatchEnableServicesInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchEnableServicesInitialRpcTimeout set to "
                + this.clientProperties.getBatchEnableServicesInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchEnableServicesRpcTimeoutMultiplier() != null) {
      batchEnableServicesRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getBatchEnableServicesRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchEnableServicesRpcTimeoutMultiplier set to "
                + this.clientProperties.getBatchEnableServicesRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getBatchEnableServicesMaxRpcTimeout() != null) {
      batchEnableServicesRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getBatchEnableServicesMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchEnableServicesMaxRpcTimeout set to "
                + this.clientProperties.getBatchEnableServicesMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchEnableServicesTotalTimeout() != null) {
      batchEnableServicesRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getBatchEnableServicesTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchEnableServicesTotalTimeout set to "
                + this.clientProperties.getBatchEnableServicesTotalTimeout());
      }
    }
    clientSettingsBuilder
        .batchEnableServicesSettings()
        .setRetrySettings(batchEnableServicesRetrySettingBuilder.build());
    RetrySettings.Builder batchGetServicesRetrySettingBuilder =
        clientSettingsBuilder.batchGetServicesSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getBatchGetServicesInitialRpcTimeout() != null) {
      batchGetServicesRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getBatchGetServicesInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchGetServicesInitialRpcTimeout set to "
                + this.clientProperties.getBatchGetServicesInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchGetServicesRpcTimeoutMultiplier() != null) {
      batchGetServicesRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getBatchGetServicesRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchGetServicesRpcTimeoutMultiplier set to "
                + this.clientProperties.getBatchGetServicesRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getBatchGetServicesMaxRpcTimeout() != null) {
      batchGetServicesRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getBatchGetServicesMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchGetServicesMaxRpcTimeout set to "
                + this.clientProperties.getBatchGetServicesMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getBatchGetServicesTotalTimeout() != null) {
      batchGetServicesRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getBatchGetServicesTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "BatchGetServicesTotalTimeout set to "
                + this.clientProperties.getBatchGetServicesTotalTimeout());
      }
    }
    clientSettingsBuilder
        .batchGetServicesSettings()
        .setRetrySettings(batchGetServicesRetrySettingBuilder.build());
    return ServiceUsageClient.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-service-usage";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
