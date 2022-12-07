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
import com.google.cloud.datacatalog.v1.PolicyTagManagerClient;
import com.google.cloud.datacatalog.v1.PolicyTagManagerSettings;
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
 * Auto-configuration for {@link PolicyTagManagerClient}.
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
@ConditionalOnClass(PolicyTagManagerClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.datacatalog.v1.spring.auto.policy-tag-manager.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({PolicyTagManagerSpringProperties.class, GlobalProperties.class})
public class PolicyTagManagerSpringAutoConfiguration {
  private final PolicyTagManagerSpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER =
      LogFactory.getLog(PolicyTagManagerSpringAutoConfiguration.class);

  protected PolicyTagManagerSpringAutoConfiguration(
      PolicyTagManagerSpringProperties clientProperties, GlobalProperties globalProperties) {
    this.clientProperties = clientProperties;
    this.globalProperties = globalProperties;
  }

  /**
   * Obtains the default credentials provider. The used key will be obtained from Spring Boot
   * configuration data files.
   */
  @Bean
  @ConditionalOnMissingBean
  public CredentialsProvider policyTagManagerCredentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from PolicyTagManager-specific configuration");
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
  public TransportChannelProvider defaultPolicyTagManagerTransportChannelProvider() {
    return PolicyTagManagerSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a PolicyTagManagerClient bean configured to use the default credentials provider
   * (obtained with policyTagManagerCredentials()) and its default transport channel provider
   * (defaultPolicyTagManagerTransportChannelProvider()). It also configures the quota project ID if
   * provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in PolicyTagManagerSpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public PolicyTagManagerClient policyTagManagerClient(
      @Qualifier("policyTagManagerCredentials") CredentialsProvider credentialsProvider,
      @Qualifier("defaultPolicyTagManagerTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    PolicyTagManagerSettings.Builder clientSettingsBuilder =
        PolicyTagManagerSettings.newBuilder()
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
          PolicyTagManagerSettings.defaultExecutorProviderBuilder()
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
          PolicyTagManagerSettings.defaultHttpJsonTransportProviderBuilder().build());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using HTTP transport channel");
      }
    }
    RetrySettings.Builder createTaxonomyRetrySettingBuilder =
        clientSettingsBuilder.createTaxonomySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getCreateTaxonomyInitialRpcTimeout() != null) {
      createTaxonomyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getCreateTaxonomyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateTaxonomyInitialRpcTimeout set to "
                + this.clientProperties.getCreateTaxonomyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateTaxonomyRpcTimeoutMultiplier() != null) {
      createTaxonomyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getCreateTaxonomyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateTaxonomyRpcTimeoutMultiplier set to "
                + this.clientProperties.getCreateTaxonomyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getCreateTaxonomyMaxRpcTimeout() != null) {
      createTaxonomyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getCreateTaxonomyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateTaxonomyMaxRpcTimeout set to "
                + this.clientProperties.getCreateTaxonomyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getCreateTaxonomyTotalTimeout() != null) {
      createTaxonomyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getCreateTaxonomyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreateTaxonomyTotalTimeout set to "
                + this.clientProperties.getCreateTaxonomyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .createTaxonomySettings()
        .setRetrySettings(createTaxonomyRetrySettingBuilder.build());
    RetrySettings.Builder deleteTaxonomyRetrySettingBuilder =
        clientSettingsBuilder.deleteTaxonomySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDeleteTaxonomyInitialRpcTimeout() != null) {
      deleteTaxonomyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDeleteTaxonomyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteTaxonomyInitialRpcTimeout set to "
                + this.clientProperties.getDeleteTaxonomyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteTaxonomyRpcTimeoutMultiplier() != null) {
      deleteTaxonomyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDeleteTaxonomyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteTaxonomyRpcTimeoutMultiplier set to "
                + this.clientProperties.getDeleteTaxonomyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDeleteTaxonomyMaxRpcTimeout() != null) {
      deleteTaxonomyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDeleteTaxonomyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteTaxonomyMaxRpcTimeout set to "
                + this.clientProperties.getDeleteTaxonomyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDeleteTaxonomyTotalTimeout() != null) {
      deleteTaxonomyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDeleteTaxonomyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeleteTaxonomyTotalTimeout set to "
                + this.clientProperties.getDeleteTaxonomyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .deleteTaxonomySettings()
        .setRetrySettings(deleteTaxonomyRetrySettingBuilder.build());
    RetrySettings.Builder updateTaxonomyRetrySettingBuilder =
        clientSettingsBuilder.updateTaxonomySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getUpdateTaxonomyInitialRpcTimeout() != null) {
      updateTaxonomyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getUpdateTaxonomyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateTaxonomyInitialRpcTimeout set to "
                + this.clientProperties.getUpdateTaxonomyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateTaxonomyRpcTimeoutMultiplier() != null) {
      updateTaxonomyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getUpdateTaxonomyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateTaxonomyRpcTimeoutMultiplier set to "
                + this.clientProperties.getUpdateTaxonomyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getUpdateTaxonomyMaxRpcTimeout() != null) {
      updateTaxonomyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getUpdateTaxonomyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateTaxonomyMaxRpcTimeout set to "
                + this.clientProperties.getUpdateTaxonomyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateTaxonomyTotalTimeout() != null) {
      updateTaxonomyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getUpdateTaxonomyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateTaxonomyTotalTimeout set to "
                + this.clientProperties.getUpdateTaxonomyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .updateTaxonomySettings()
        .setRetrySettings(updateTaxonomyRetrySettingBuilder.build());
    RetrySettings.Builder listTaxonomiesRetrySettingBuilder =
        clientSettingsBuilder.listTaxonomiesSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListTaxonomiesInitialRpcTimeout() != null) {
      listTaxonomiesRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListTaxonomiesInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListTaxonomiesInitialRpcTimeout set to "
                + this.clientProperties.getListTaxonomiesInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListTaxonomiesRpcTimeoutMultiplier() != null) {
      listTaxonomiesRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListTaxonomiesRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListTaxonomiesRpcTimeoutMultiplier set to "
                + this.clientProperties.getListTaxonomiesRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListTaxonomiesMaxRpcTimeout() != null) {
      listTaxonomiesRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListTaxonomiesMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListTaxonomiesMaxRpcTimeout set to "
                + this.clientProperties.getListTaxonomiesMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListTaxonomiesTotalTimeout() != null) {
      listTaxonomiesRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListTaxonomiesTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListTaxonomiesTotalTimeout set to "
                + this.clientProperties.getListTaxonomiesTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listTaxonomiesSettings()
        .setRetrySettings(listTaxonomiesRetrySettingBuilder.build());
    RetrySettings.Builder getTaxonomyRetrySettingBuilder =
        clientSettingsBuilder.getTaxonomySettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetTaxonomyInitialRpcTimeout() != null) {
      getTaxonomyRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetTaxonomyInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetTaxonomyInitialRpcTimeout set to "
                + this.clientProperties.getGetTaxonomyInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetTaxonomyRpcTimeoutMultiplier() != null) {
      getTaxonomyRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetTaxonomyRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetTaxonomyRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetTaxonomyRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetTaxonomyMaxRpcTimeout() != null) {
      getTaxonomyRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetTaxonomyMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetTaxonomyMaxRpcTimeout set to "
                + this.clientProperties.getGetTaxonomyMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetTaxonomyTotalTimeout() != null) {
      getTaxonomyRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetTaxonomyTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetTaxonomyTotalTimeout set to " + this.clientProperties.getGetTaxonomyTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getTaxonomySettings()
        .setRetrySettings(getTaxonomyRetrySettingBuilder.build());
    RetrySettings.Builder createPolicyTagRetrySettingBuilder =
        clientSettingsBuilder.createPolicyTagSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getCreatePolicyTagInitialRpcTimeout() != null) {
      createPolicyTagRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getCreatePolicyTagInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreatePolicyTagInitialRpcTimeout set to "
                + this.clientProperties.getCreatePolicyTagInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getCreatePolicyTagRpcTimeoutMultiplier() != null) {
      createPolicyTagRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getCreatePolicyTagRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreatePolicyTagRpcTimeoutMultiplier set to "
                + this.clientProperties.getCreatePolicyTagRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getCreatePolicyTagMaxRpcTimeout() != null) {
      createPolicyTagRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getCreatePolicyTagMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreatePolicyTagMaxRpcTimeout set to "
                + this.clientProperties.getCreatePolicyTagMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getCreatePolicyTagTotalTimeout() != null) {
      createPolicyTagRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getCreatePolicyTagTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "CreatePolicyTagTotalTimeout set to "
                + this.clientProperties.getCreatePolicyTagTotalTimeout());
      }
    }
    clientSettingsBuilder
        .createPolicyTagSettings()
        .setRetrySettings(createPolicyTagRetrySettingBuilder.build());
    RetrySettings.Builder deletePolicyTagRetrySettingBuilder =
        clientSettingsBuilder.deletePolicyTagSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getDeletePolicyTagInitialRpcTimeout() != null) {
      deletePolicyTagRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getDeletePolicyTagInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeletePolicyTagInitialRpcTimeout set to "
                + this.clientProperties.getDeletePolicyTagInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getDeletePolicyTagRpcTimeoutMultiplier() != null) {
      deletePolicyTagRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getDeletePolicyTagRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeletePolicyTagRpcTimeoutMultiplier set to "
                + this.clientProperties.getDeletePolicyTagRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getDeletePolicyTagMaxRpcTimeout() != null) {
      deletePolicyTagRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getDeletePolicyTagMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeletePolicyTagMaxRpcTimeout set to "
                + this.clientProperties.getDeletePolicyTagMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getDeletePolicyTagTotalTimeout() != null) {
      deletePolicyTagRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getDeletePolicyTagTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "DeletePolicyTagTotalTimeout set to "
                + this.clientProperties.getDeletePolicyTagTotalTimeout());
      }
    }
    clientSettingsBuilder
        .deletePolicyTagSettings()
        .setRetrySettings(deletePolicyTagRetrySettingBuilder.build());
    RetrySettings.Builder updatePolicyTagRetrySettingBuilder =
        clientSettingsBuilder.updatePolicyTagSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getUpdatePolicyTagInitialRpcTimeout() != null) {
      updatePolicyTagRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getUpdatePolicyTagInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdatePolicyTagInitialRpcTimeout set to "
                + this.clientProperties.getUpdatePolicyTagInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdatePolicyTagRpcTimeoutMultiplier() != null) {
      updatePolicyTagRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getUpdatePolicyTagRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdatePolicyTagRpcTimeoutMultiplier set to "
                + this.clientProperties.getUpdatePolicyTagRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getUpdatePolicyTagMaxRpcTimeout() != null) {
      updatePolicyTagRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getUpdatePolicyTagMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdatePolicyTagMaxRpcTimeout set to "
                + this.clientProperties.getUpdatePolicyTagMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdatePolicyTagTotalTimeout() != null) {
      updatePolicyTagRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getUpdatePolicyTagTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdatePolicyTagTotalTimeout set to "
                + this.clientProperties.getUpdatePolicyTagTotalTimeout());
      }
    }
    clientSettingsBuilder
        .updatePolicyTagSettings()
        .setRetrySettings(updatePolicyTagRetrySettingBuilder.build());
    RetrySettings.Builder listPolicyTagsRetrySettingBuilder =
        clientSettingsBuilder.listPolicyTagsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListPolicyTagsInitialRpcTimeout() != null) {
      listPolicyTagsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListPolicyTagsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListPolicyTagsInitialRpcTimeout set to "
                + this.clientProperties.getListPolicyTagsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListPolicyTagsRpcTimeoutMultiplier() != null) {
      listPolicyTagsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListPolicyTagsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListPolicyTagsRpcTimeoutMultiplier set to "
                + this.clientProperties.getListPolicyTagsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListPolicyTagsMaxRpcTimeout() != null) {
      listPolicyTagsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListPolicyTagsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListPolicyTagsMaxRpcTimeout set to "
                + this.clientProperties.getListPolicyTagsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListPolicyTagsTotalTimeout() != null) {
      listPolicyTagsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListPolicyTagsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListPolicyTagsTotalTimeout set to "
                + this.clientProperties.getListPolicyTagsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listPolicyTagsSettings()
        .setRetrySettings(listPolicyTagsRetrySettingBuilder.build());
    RetrySettings.Builder getPolicyTagRetrySettingBuilder =
        clientSettingsBuilder.getPolicyTagSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getGetPolicyTagInitialRpcTimeout() != null) {
      getPolicyTagRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getGetPolicyTagInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetPolicyTagInitialRpcTimeout set to "
                + this.clientProperties.getGetPolicyTagInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getGetPolicyTagRpcTimeoutMultiplier() != null) {
      getPolicyTagRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getGetPolicyTagRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetPolicyTagRpcTimeoutMultiplier set to "
                + this.clientProperties.getGetPolicyTagRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getGetPolicyTagMaxRpcTimeout() != null) {
      getPolicyTagRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getGetPolicyTagMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetPolicyTagMaxRpcTimeout set to "
                + this.clientProperties.getGetPolicyTagMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getGetPolicyTagTotalTimeout() != null) {
      getPolicyTagRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getGetPolicyTagTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "GetPolicyTagTotalTimeout set to "
                + this.clientProperties.getGetPolicyTagTotalTimeout());
      }
    }
    clientSettingsBuilder
        .getPolicyTagSettings()
        .setRetrySettings(getPolicyTagRetrySettingBuilder.build());
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
    return PolicyTagManagerClient.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-policy-tag-manager";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
