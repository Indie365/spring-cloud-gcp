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

package com.google.cloud.aiplatform.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.aiplatform.v1.DatasetServiceClient;
import com.google.cloud.aiplatform.v1.DatasetServiceSettings;
import com.google.cloud.spring.autoconfigure.core.GcpContextAutoConfiguration;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.DefaultCredentialsProvider;
import com.google.cloud.spring.core.Retry;
import com.google.cloud.spring.core.util.RetryUtil;
import java.io.IOException;
import java.util.Collections;
import javax.annotation.Generated;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Auto-configuration for {@link DatasetServiceClient}.
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
@AutoConfigureAfter(GcpContextAutoConfiguration.class)
@ConditionalOnClass(DatasetServiceClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.aiplatform.v1.dataset-service.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties(DatasetServiceSpringProperties.class)
public class DatasetServiceSpringAutoConfiguration {
  private final DatasetServiceSpringProperties clientProperties;
  private final CredentialsProvider credentialsProvider;
  private static final Log LOGGER = LogFactory.getLog(DatasetServiceSpringAutoConfiguration.class);

  protected DatasetServiceSpringAutoConfiguration(
      DatasetServiceSpringProperties clientProperties, CredentialsProvider credentialsProvider)
      throws IOException {
    this.clientProperties = clientProperties;
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from DatasetService-specific configuration");
      }
      this.credentialsProvider =
          ((CredentialsProvider) new DefaultCredentialsProvider(this.clientProperties));
    } else {
      this.credentialsProvider = credentialsProvider;
    }
  }

  /**
   * Provides a default transport channel provider bean. The default is gRPC and will default to it
   * unless the useRest option is provided to use HTTP transport instead
   *
   * @return a default transport channel provider.
   */
  @Bean
  @ConditionalOnMissingBean(name = "defaultDatasetServiceTransportChannelProvider")
  public TransportChannelProvider defaultDatasetServiceTransportChannelProvider() {
    return DatasetServiceSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a DatasetServiceSettings bean configured to use the default credentials provider
   * (obtained with datasetServiceCredentials()) and its default transport channel provider
   * (defaultDatasetServiceTransportChannelProvider()). It also configures the quota project ID if
   * provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Retry settings are also configured from service-level and method-level properties specified
   * in DatasetServiceSpringProperties. Method-level properties will take precedence over
   * service-level properties if available, and client library defaults will be used if neither are
   * specified.
   *
   * @param defaultTransportChannelProvider TransportChannelProvider to use in the settings.
   * @return a {@link DatasetServiceSettings} bean configured with {@link TransportChannelProvider}
   *     bean.
   */
  @Bean
  @ConditionalOnMissingBean
  public DatasetServiceSettings datasetServiceSettings(
      @Qualifier("defaultDatasetServiceTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    DatasetServiceSettings.Builder clientSettingsBuilder = DatasetServiceSettings.newBuilder();
    clientSettingsBuilder
        .setCredentialsProvider(this.credentialsProvider)
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
          DatasetServiceSettings.defaultExecutorProviderBuilder()
              .setExecutorThreadCount(this.clientProperties.getExecutorThreadCount())
              .build();
      clientSettingsBuilder.setBackgroundExecutorProvider(executorProvider);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Background executor thread count is "
                + this.clientProperties.getExecutorThreadCount());
      }
    }
    Retry serviceRetry = clientProperties.getRetry();
    if (serviceRetry != null) {
      RetrySettings getDatasetRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getDatasetSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getDatasetSettings().setRetrySettings(getDatasetRetrySettings);

      RetrySettings updateDatasetRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateDatasetSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.updateDatasetSettings().setRetrySettings(updateDatasetRetrySettings);

      RetrySettings listDatasetsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listDatasetsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listDatasetsSettings().setRetrySettings(listDatasetsRetrySettings);

      RetrySettings listDataItemsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listDataItemsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listDataItemsSettings().setRetrySettings(listDataItemsRetrySettings);

      RetrySettings searchDataItemsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.searchDataItemsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .searchDataItemsSettings()
          .setRetrySettings(searchDataItemsRetrySettings);

      RetrySettings listSavedQueriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listSavedQueriesSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .listSavedQueriesSettings()
          .setRetrySettings(listSavedQueriesRetrySettings);

      RetrySettings getAnnotationSpecRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getAnnotationSpecSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .getAnnotationSpecSettings()
          .setRetrySettings(getAnnotationSpecRetrySettings);

      RetrySettings listAnnotationsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listAnnotationsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .listAnnotationsSettings()
          .setRetrySettings(listAnnotationsRetrySettings);

      RetrySettings listLocationsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listLocationsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listLocationsSettings().setRetrySettings(listLocationsRetrySettings);

      RetrySettings getLocationRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLocationSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getLocationSettings().setRetrySettings(getLocationRetrySettings);

      RetrySettings setIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.setIamPolicySettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.setIamPolicySettings().setRetrySettings(setIamPolicyRetrySettings);

      RetrySettings getIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getIamPolicySettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getIamPolicySettings().setRetrySettings(getIamPolicyRetrySettings);

      RetrySettings testIamPermissionsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.testIamPermissionsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .testIamPermissionsSettings()
          .setRetrySettings(testIamPermissionsRetrySettings);

      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured service-level retry settings from properties.");
      }
    }
    Retry getDatasetRetry = clientProperties.getGetDatasetRetry();
    if (getDatasetRetry != null) {
      RetrySettings getDatasetRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getDatasetSettings().getRetrySettings(), getDatasetRetry);
      clientSettingsBuilder.getDatasetSettings().setRetrySettings(getDatasetRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getDataset from properties.");
      }
    }
    Retry updateDatasetRetry = clientProperties.getUpdateDatasetRetry();
    if (updateDatasetRetry != null) {
      RetrySettings updateDatasetRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateDatasetSettings().getRetrySettings(), updateDatasetRetry);
      clientSettingsBuilder.updateDatasetSettings().setRetrySettings(updateDatasetRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for updateDataset from properties.");
      }
    }
    Retry listDatasetsRetry = clientProperties.getListDatasetsRetry();
    if (listDatasetsRetry != null) {
      RetrySettings listDatasetsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listDatasetsSettings().getRetrySettings(), listDatasetsRetry);
      clientSettingsBuilder.listDatasetsSettings().setRetrySettings(listDatasetsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listDatasets from properties.");
      }
    }
    Retry listDataItemsRetry = clientProperties.getListDataItemsRetry();
    if (listDataItemsRetry != null) {
      RetrySettings listDataItemsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listDataItemsSettings().getRetrySettings(), listDataItemsRetry);
      clientSettingsBuilder.listDataItemsSettings().setRetrySettings(listDataItemsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listDataItems from properties.");
      }
    }
    Retry searchDataItemsRetry = clientProperties.getSearchDataItemsRetry();
    if (searchDataItemsRetry != null) {
      RetrySettings searchDataItemsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.searchDataItemsSettings().getRetrySettings(),
              searchDataItemsRetry);
      clientSettingsBuilder
          .searchDataItemsSettings()
          .setRetrySettings(searchDataItemsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for searchDataItems from properties.");
      }
    }
    Retry listSavedQueriesRetry = clientProperties.getListSavedQueriesRetry();
    if (listSavedQueriesRetry != null) {
      RetrySettings listSavedQueriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listSavedQueriesSettings().getRetrySettings(),
              listSavedQueriesRetry);
      clientSettingsBuilder
          .listSavedQueriesSettings()
          .setRetrySettings(listSavedQueriesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listSavedQueries from properties.");
      }
    }
    Retry getAnnotationSpecRetry = clientProperties.getGetAnnotationSpecRetry();
    if (getAnnotationSpecRetry != null) {
      RetrySettings getAnnotationSpecRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getAnnotationSpecSettings().getRetrySettings(),
              getAnnotationSpecRetry);
      clientSettingsBuilder
          .getAnnotationSpecSettings()
          .setRetrySettings(getAnnotationSpecRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getAnnotationSpec from properties.");
      }
    }
    Retry listAnnotationsRetry = clientProperties.getListAnnotationsRetry();
    if (listAnnotationsRetry != null) {
      RetrySettings listAnnotationsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listAnnotationsSettings().getRetrySettings(),
              listAnnotationsRetry);
      clientSettingsBuilder
          .listAnnotationsSettings()
          .setRetrySettings(listAnnotationsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listAnnotations from properties.");
      }
    }
    Retry listLocationsRetry = clientProperties.getListLocationsRetry();
    if (listLocationsRetry != null) {
      RetrySettings listLocationsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listLocationsSettings().getRetrySettings(), listLocationsRetry);
      clientSettingsBuilder.listLocationsSettings().setRetrySettings(listLocationsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listLocations from properties.");
      }
    }
    Retry getLocationRetry = clientProperties.getGetLocationRetry();
    if (getLocationRetry != null) {
      RetrySettings getLocationRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLocationSettings().getRetrySettings(), getLocationRetry);
      clientSettingsBuilder.getLocationSettings().setRetrySettings(getLocationRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getLocation from properties.");
      }
    }
    Retry setIamPolicyRetry = clientProperties.getSetIamPolicyRetry();
    if (setIamPolicyRetry != null) {
      RetrySettings setIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.setIamPolicySettings().getRetrySettings(), setIamPolicyRetry);
      clientSettingsBuilder.setIamPolicySettings().setRetrySettings(setIamPolicyRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for setIamPolicy from properties.");
      }
    }
    Retry getIamPolicyRetry = clientProperties.getGetIamPolicyRetry();
    if (getIamPolicyRetry != null) {
      RetrySettings getIamPolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getIamPolicySettings().getRetrySettings(), getIamPolicyRetry);
      clientSettingsBuilder.getIamPolicySettings().setRetrySettings(getIamPolicyRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getIamPolicy from properties.");
      }
    }
    Retry testIamPermissionsRetry = clientProperties.getTestIamPermissionsRetry();
    if (testIamPermissionsRetry != null) {
      RetrySettings testIamPermissionsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.testIamPermissionsSettings().getRetrySettings(),
              testIamPermissionsRetry);
      clientSettingsBuilder
          .testIamPermissionsSettings()
          .setRetrySettings(testIamPermissionsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for testIamPermissions from properties.");
      }
    }
    return clientSettingsBuilder.build();
  }

  /**
   * Provides a DatasetServiceClient bean configured with DatasetServiceSettings.
   *
   * @param datasetServiceSettings settings to configure an instance of client bean.
   * @return a {@link DatasetServiceClient} bean configured with {@link DatasetServiceSettings}
   */
  @Bean
  @ConditionalOnMissingBean
  public DatasetServiceClient datasetServiceClient(DatasetServiceSettings datasetServiceSettings)
      throws IOException {
    return DatasetServiceClient.create(datasetServiceSettings);
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-dataset-service";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
