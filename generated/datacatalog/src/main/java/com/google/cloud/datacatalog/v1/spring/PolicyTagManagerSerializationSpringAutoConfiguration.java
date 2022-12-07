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

package com.google.cloud.datacatalog.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationClient;
import com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationSettings;
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
 * Auto-configuration for {@link PolicyTagManagerSerializationClient}.
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
@ConditionalOnClass(PolicyTagManagerSerializationClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.datacatalog.v1.spring.auto.policy-tag-manager-serialization.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({
  PolicyTagManagerSerializationSpringProperties.class,
  GlobalProperties.class
})
public class PolicyTagManagerSerializationSpringAutoConfiguration {
  private final PolicyTagManagerSerializationSpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER =
      LogFactory.getLog(PolicyTagManagerSerializationSpringAutoConfiguration.class);

  protected PolicyTagManagerSerializationSpringAutoConfiguration(
      PolicyTagManagerSerializationSpringProperties clientProperties,
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
  public CredentialsProvider policyTagManagerSerializationCredentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from PolicyTagManagerSerialization-specific configuration");
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
  public TransportChannelProvider defaultPolicyTagManagerSerializationTransportChannelProvider() {
    return PolicyTagManagerSerializationSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a PolicyTagManagerSerializationClient bean configured to use the default credentials
   * provider (obtained with policyTagManagerSerializationCredentials()) and its default transport
   * channel provider (defaultPolicyTagManagerSerializationTransportChannelProvider()). It also
   * configures the quota project ID if provided. It will configure an executor provider in case
   * there is more than one thread configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in
   * PolicyTagManagerSerializationSpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public PolicyTagManagerSerializationClient policyTagManagerSerializationClient(
      @Qualifier("policyTagManagerSerializationCredentials")
          CredentialsProvider credentialsProvider,
      @Qualifier("defaultPolicyTagManagerSerializationTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    PolicyTagManagerSerializationSettings.Builder clientSettingsBuilder =
        PolicyTagManagerSerializationSettings.newBuilder()
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
          PolicyTagManagerSerializationSettings.defaultExecutorProviderBuilder()
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
          PolicyTagManagerSerializationSettings.defaultHttpJsonTransportProviderBuilder().build());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using HTTP transport channel");
      }
    }
    RetrySettings.Builder replaceTaxonomyRetrySettingBuilder =
        clientSettingsBuilder.replaceTaxonomySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getReplaceTaxonomyInitialRpcTimeout() != null) {
      replaceTaxonomyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getReplaceTaxonomyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ReplaceTaxonomyInitialRpcTimeout set to "
                + this.clientProperties.getReplaceTaxonomyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getReplaceTaxonomyRpcTimeoutMultiplier() != null) {
      replaceTaxonomyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getReplaceTaxonomyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ReplaceTaxonomyRpcTimeoutMultiplier set to "
                + this.clientProperties.getReplaceTaxonomyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getReplaceTaxonomyMaxRpcTimeout() != null) {
      replaceTaxonomyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getReplaceTaxonomyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ReplaceTaxonomyMaxRpcTimeout set to "
                + this.clientProperties.getReplaceTaxonomyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getReplaceTaxonomyTotalTimeout() != null) {
      replaceTaxonomyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getReplaceTaxonomyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ReplaceTaxonomyTotalTimeout set to "
                + this.clientProperties.getReplaceTaxonomyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .replaceTaxonomySettings()
        .setRetrySettings(replaceTaxonomyRetrySettingBuilder.build());
    RetrySettings.Builder importTaxonomiesRetrySettingBuilder =
        clientSettingsBuilder.importTaxonomiesSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getImportTaxonomiesInitialRpcTimeout() != null) {
      importTaxonomiesRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getImportTaxonomiesInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ImportTaxonomiesInitialRpcTimeout set to "
                + this.clientProperties.getImportTaxonomiesInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getImportTaxonomiesRpcTimeoutMultiplier() != null) {
      importTaxonomiesRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getImportTaxonomiesRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ImportTaxonomiesRpcTimeoutMultiplier set to "
                + this.clientProperties.getImportTaxonomiesRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getImportTaxonomiesMaxRpcTimeout() != null) {
      importTaxonomiesRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getImportTaxonomiesMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ImportTaxonomiesMaxRpcTimeout set to "
                + this.clientProperties.getImportTaxonomiesMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getImportTaxonomiesTotalTimeout() != null) {
      importTaxonomiesRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getImportTaxonomiesTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ImportTaxonomiesTotalTimeout set to "
                + this.clientProperties.getImportTaxonomiesTotalTimeout());
      }
    }
    clientSettingsBuilder
        .importTaxonomiesSettings()
        .setRetrySettings(importTaxonomiesRetrySettingBuilder.build());
    RetrySettings.Builder exportTaxonomiesRetrySettingBuilder =
        clientSettingsBuilder.exportTaxonomiesSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getExportTaxonomiesInitialRpcTimeout() != null) {
      exportTaxonomiesRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getExportTaxonomiesInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ExportTaxonomiesInitialRpcTimeout set to "
                + this.clientProperties.getExportTaxonomiesInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getExportTaxonomiesRpcTimeoutMultiplier() != null) {
      exportTaxonomiesRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getExportTaxonomiesRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ExportTaxonomiesRpcTimeoutMultiplier set to "
                + this.clientProperties.getExportTaxonomiesRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getExportTaxonomiesMaxRpcTimeout() != null) {
      exportTaxonomiesRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getExportTaxonomiesMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ExportTaxonomiesMaxRpcTimeout set to "
                + this.clientProperties.getExportTaxonomiesMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getExportTaxonomiesTotalTimeout() != null) {
      exportTaxonomiesRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getExportTaxonomiesTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ExportTaxonomiesTotalTimeout set to "
                + this.clientProperties.getExportTaxonomiesTotalTimeout());
      }
    }
    clientSettingsBuilder
        .exportTaxonomiesSettings()
        .setRetrySettings(exportTaxonomiesRetrySettingBuilder.build());
    return PolicyTagManagerSerializationClient.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-policy-tag-manager-serialization";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
