/*
 * Copyright 2023 Google LLC
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
import com.google.cloud.aiplatform.v1.TensorboardServiceClient;
import com.google.cloud.aiplatform.v1.TensorboardServiceSettings;
import com.google.cloud.spring.autoconfigure.core.GcpContextAutoConfiguration;
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
 * Auto-configuration for {@link TensorboardServiceClient}.
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
@ConditionalOnClass(TensorboardServiceClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.aiplatform.v1.tensorboard-service.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties(TensorboardServiceSpringProperties.class)
public class TensorboardServiceSpringAutoConfiguration {
  private final TensorboardServiceSpringProperties clientProperties;
  private final CredentialsProvider credentialsProvider;
  private static final Log LOGGER =
      LogFactory.getLog(TensorboardServiceSpringAutoConfiguration.class);

  protected TensorboardServiceSpringAutoConfiguration(
      TensorboardServiceSpringProperties clientProperties, CredentialsProvider credentialsProvider)
      throws IOException {
    this.clientProperties = clientProperties;
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from TensorboardService-specific configuration");
      }
      this.credentialsProvider =
          ((CredentialsProvider) new DefaultCredentialsProvider(this.clientProperties));
    } else {
      this.credentialsProvider = credentialsProvider;
    }
  }

  /**
   * Provides a default transport channel provider bean, corresponding to the client library's
   * default transport channel provider. If the library supports both GRPC and REST transport, and
   * the useRest property is configured, the HTTP/JSON transport provider will be used instead of
   * GRPC.
   *
   * @return a default transport channel provider.
   */
  @Bean
  @ConditionalOnMissingBean(name = "defaultTensorboardServiceTransportChannelProvider")
  public TransportChannelProvider defaultTensorboardServiceTransportChannelProvider() {
    return TensorboardServiceSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a TensorboardServiceSettings bean configured to use a DefaultCredentialsProvider and
   * the client library's default transport channel provider
   * (defaultTensorboardServiceTransportChannelProvider()). It also configures the quota project ID
   * and executor thread count, if provided through properties.
   *
   * <p>Retry settings are also configured from service-level and method-level properties specified
   * in TensorboardServiceSpringProperties. Method-level properties will take precedence over
   * service-level properties if available, and client library defaults will be used if neither are
   * specified.
   *
   * @param defaultTransportChannelProvider TransportChannelProvider to use in the settings.
   * @return a {@link TensorboardServiceSettings} bean configured with {@link
   *     TransportChannelProvider} bean.
   */
  @Bean
  @ConditionalOnMissingBean
  public TensorboardServiceSettings tensorboardServiceSettings(
      @Qualifier("defaultTensorboardServiceTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    TensorboardServiceSettings.Builder clientSettingsBuilder =
        TensorboardServiceSettings.newBuilder();
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
          TensorboardServiceSettings.defaultExecutorProviderBuilder()
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
      RetrySettings getTensorboardRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getTensorboardSettings().setRetrySettings(getTensorboardRetrySettings);

      RetrySettings listTensorboardsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .listTensorboardsSettings()
          .setRetrySettings(listTensorboardsRetrySettings);

      RetrySettings readTensorboardUsageRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.readTensorboardUsageSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .readTensorboardUsageSettings()
          .setRetrySettings(readTensorboardUsageRetrySettings);

      RetrySettings createTensorboardExperimentRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createTensorboardExperimentSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .createTensorboardExperimentSettings()
          .setRetrySettings(createTensorboardExperimentRetrySettings);

      RetrySettings getTensorboardExperimentRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardExperimentSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .getTensorboardExperimentSettings()
          .setRetrySettings(getTensorboardExperimentRetrySettings);

      RetrySettings updateTensorboardExperimentRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateTensorboardExperimentSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .updateTensorboardExperimentSettings()
          .setRetrySettings(updateTensorboardExperimentRetrySettings);

      RetrySettings listTensorboardExperimentsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardExperimentsSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .listTensorboardExperimentsSettings()
          .setRetrySettings(listTensorboardExperimentsRetrySettings);

      RetrySettings createTensorboardRunRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createTensorboardRunSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .createTensorboardRunSettings()
          .setRetrySettings(createTensorboardRunRetrySettings);

      RetrySettings batchCreateTensorboardRunsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.batchCreateTensorboardRunsSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .batchCreateTensorboardRunsSettings()
          .setRetrySettings(batchCreateTensorboardRunsRetrySettings);

      RetrySettings getTensorboardRunRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardRunSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .getTensorboardRunSettings()
          .setRetrySettings(getTensorboardRunRetrySettings);

      RetrySettings updateTensorboardRunRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateTensorboardRunSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .updateTensorboardRunSettings()
          .setRetrySettings(updateTensorboardRunRetrySettings);

      RetrySettings listTensorboardRunsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardRunsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .listTensorboardRunsSettings()
          .setRetrySettings(listTensorboardRunsRetrySettings);

      RetrySettings batchCreateTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.batchCreateTensorboardTimeSeriesSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .batchCreateTensorboardTimeSeriesSettings()
          .setRetrySettings(batchCreateTensorboardTimeSeriesRetrySettings);

      RetrySettings createTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createTensorboardTimeSeriesSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .createTensorboardTimeSeriesSettings()
          .setRetrySettings(createTensorboardTimeSeriesRetrySettings);

      RetrySettings getTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardTimeSeriesSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .getTensorboardTimeSeriesSettings()
          .setRetrySettings(getTensorboardTimeSeriesRetrySettings);

      RetrySettings updateTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateTensorboardTimeSeriesSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .updateTensorboardTimeSeriesSettings()
          .setRetrySettings(updateTensorboardTimeSeriesRetrySettings);

      RetrySettings listTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardTimeSeriesSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .listTensorboardTimeSeriesSettings()
          .setRetrySettings(listTensorboardTimeSeriesRetrySettings);

      RetrySettings batchReadTensorboardTimeSeriesDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.batchReadTensorboardTimeSeriesDataSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .batchReadTensorboardTimeSeriesDataSettings()
          .setRetrySettings(batchReadTensorboardTimeSeriesDataRetrySettings);

      RetrySettings readTensorboardTimeSeriesDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.readTensorboardTimeSeriesDataSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .readTensorboardTimeSeriesDataSettings()
          .setRetrySettings(readTensorboardTimeSeriesDataRetrySettings);

      RetrySettings writeTensorboardExperimentDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.writeTensorboardExperimentDataSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .writeTensorboardExperimentDataSettings()
          .setRetrySettings(writeTensorboardExperimentDataRetrySettings);

      RetrySettings writeTensorboardRunDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.writeTensorboardRunDataSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .writeTensorboardRunDataSettings()
          .setRetrySettings(writeTensorboardRunDataRetrySettings);

      RetrySettings exportTensorboardTimeSeriesDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.exportTensorboardTimeSeriesDataSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .exportTensorboardTimeSeriesDataSettings()
          .setRetrySettings(exportTensorboardTimeSeriesDataRetrySettings);

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
    Retry getTensorboardRetry = clientProperties.getGetTensorboardRetry();
    if (getTensorboardRetry != null) {
      RetrySettings getTensorboardRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardSettings().getRetrySettings(),
              getTensorboardRetry);
      clientSettingsBuilder.getTensorboardSettings().setRetrySettings(getTensorboardRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getTensorboard from properties.");
      }
    }
    Retry listTensorboardsRetry = clientProperties.getListTensorboardsRetry();
    if (listTensorboardsRetry != null) {
      RetrySettings listTensorboardsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardsSettings().getRetrySettings(),
              listTensorboardsRetry);
      clientSettingsBuilder
          .listTensorboardsSettings()
          .setRetrySettings(listTensorboardsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listTensorboards from properties.");
      }
    }
    Retry readTensorboardUsageRetry = clientProperties.getReadTensorboardUsageRetry();
    if (readTensorboardUsageRetry != null) {
      RetrySettings readTensorboardUsageRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.readTensorboardUsageSettings().getRetrySettings(),
              readTensorboardUsageRetry);
      clientSettingsBuilder
          .readTensorboardUsageSettings()
          .setRetrySettings(readTensorboardUsageRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for readTensorboardUsage from properties.");
      }
    }
    Retry createTensorboardExperimentRetry = clientProperties.getCreateTensorboardExperimentRetry();
    if (createTensorboardExperimentRetry != null) {
      RetrySettings createTensorboardExperimentRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createTensorboardExperimentSettings().getRetrySettings(),
              createTensorboardExperimentRetry);
      clientSettingsBuilder
          .createTensorboardExperimentSettings()
          .setRetrySettings(createTensorboardExperimentRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for createTensorboardExperiment from properties.");
      }
    }
    Retry getTensorboardExperimentRetry = clientProperties.getGetTensorboardExperimentRetry();
    if (getTensorboardExperimentRetry != null) {
      RetrySettings getTensorboardExperimentRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardExperimentSettings().getRetrySettings(),
              getTensorboardExperimentRetry);
      clientSettingsBuilder
          .getTensorboardExperimentSettings()
          .setRetrySettings(getTensorboardExperimentRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getTensorboardExperiment from properties.");
      }
    }
    Retry updateTensorboardExperimentRetry = clientProperties.getUpdateTensorboardExperimentRetry();
    if (updateTensorboardExperimentRetry != null) {
      RetrySettings updateTensorboardExperimentRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateTensorboardExperimentSettings().getRetrySettings(),
              updateTensorboardExperimentRetry);
      clientSettingsBuilder
          .updateTensorboardExperimentSettings()
          .setRetrySettings(updateTensorboardExperimentRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for updateTensorboardExperiment from properties.");
      }
    }
    Retry listTensorboardExperimentsRetry = clientProperties.getListTensorboardExperimentsRetry();
    if (listTensorboardExperimentsRetry != null) {
      RetrySettings listTensorboardExperimentsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardExperimentsSettings().getRetrySettings(),
              listTensorboardExperimentsRetry);
      clientSettingsBuilder
          .listTensorboardExperimentsSettings()
          .setRetrySettings(listTensorboardExperimentsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listTensorboardExperiments from properties.");
      }
    }
    Retry createTensorboardRunRetry = clientProperties.getCreateTensorboardRunRetry();
    if (createTensorboardRunRetry != null) {
      RetrySettings createTensorboardRunRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createTensorboardRunSettings().getRetrySettings(),
              createTensorboardRunRetry);
      clientSettingsBuilder
          .createTensorboardRunSettings()
          .setRetrySettings(createTensorboardRunRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for createTensorboardRun from properties.");
      }
    }
    Retry batchCreateTensorboardRunsRetry = clientProperties.getBatchCreateTensorboardRunsRetry();
    if (batchCreateTensorboardRunsRetry != null) {
      RetrySettings batchCreateTensorboardRunsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.batchCreateTensorboardRunsSettings().getRetrySettings(),
              batchCreateTensorboardRunsRetry);
      clientSettingsBuilder
          .batchCreateTensorboardRunsSettings()
          .setRetrySettings(batchCreateTensorboardRunsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for batchCreateTensorboardRuns from properties.");
      }
    }
    Retry getTensorboardRunRetry = clientProperties.getGetTensorboardRunRetry();
    if (getTensorboardRunRetry != null) {
      RetrySettings getTensorboardRunRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardRunSettings().getRetrySettings(),
              getTensorboardRunRetry);
      clientSettingsBuilder
          .getTensorboardRunSettings()
          .setRetrySettings(getTensorboardRunRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getTensorboardRun from properties.");
      }
    }
    Retry updateTensorboardRunRetry = clientProperties.getUpdateTensorboardRunRetry();
    if (updateTensorboardRunRetry != null) {
      RetrySettings updateTensorboardRunRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateTensorboardRunSettings().getRetrySettings(),
              updateTensorboardRunRetry);
      clientSettingsBuilder
          .updateTensorboardRunSettings()
          .setRetrySettings(updateTensorboardRunRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for updateTensorboardRun from properties.");
      }
    }
    Retry listTensorboardRunsRetry = clientProperties.getListTensorboardRunsRetry();
    if (listTensorboardRunsRetry != null) {
      RetrySettings listTensorboardRunsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardRunsSettings().getRetrySettings(),
              listTensorboardRunsRetry);
      clientSettingsBuilder
          .listTensorboardRunsSettings()
          .setRetrySettings(listTensorboardRunsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listTensorboardRuns from properties.");
      }
    }
    Retry batchCreateTensorboardTimeSeriesRetry =
        clientProperties.getBatchCreateTensorboardTimeSeriesRetry();
    if (batchCreateTensorboardTimeSeriesRetry != null) {
      RetrySettings batchCreateTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.batchCreateTensorboardTimeSeriesSettings().getRetrySettings(),
              batchCreateTensorboardTimeSeriesRetry);
      clientSettingsBuilder
          .batchCreateTensorboardTimeSeriesSettings()
          .setRetrySettings(batchCreateTensorboardTimeSeriesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for batchCreateTensorboardTimeSeries from properties.");
      }
    }
    Retry createTensorboardTimeSeriesRetry = clientProperties.getCreateTensorboardTimeSeriesRetry();
    if (createTensorboardTimeSeriesRetry != null) {
      RetrySettings createTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createTensorboardTimeSeriesSettings().getRetrySettings(),
              createTensorboardTimeSeriesRetry);
      clientSettingsBuilder
          .createTensorboardTimeSeriesSettings()
          .setRetrySettings(createTensorboardTimeSeriesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for createTensorboardTimeSeries from properties.");
      }
    }
    Retry getTensorboardTimeSeriesRetry = clientProperties.getGetTensorboardTimeSeriesRetry();
    if (getTensorboardTimeSeriesRetry != null) {
      RetrySettings getTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getTensorboardTimeSeriesSettings().getRetrySettings(),
              getTensorboardTimeSeriesRetry);
      clientSettingsBuilder
          .getTensorboardTimeSeriesSettings()
          .setRetrySettings(getTensorboardTimeSeriesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getTensorboardTimeSeries from properties.");
      }
    }
    Retry updateTensorboardTimeSeriesRetry = clientProperties.getUpdateTensorboardTimeSeriesRetry();
    if (updateTensorboardTimeSeriesRetry != null) {
      RetrySettings updateTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.updateTensorboardTimeSeriesSettings().getRetrySettings(),
              updateTensorboardTimeSeriesRetry);
      clientSettingsBuilder
          .updateTensorboardTimeSeriesSettings()
          .setRetrySettings(updateTensorboardTimeSeriesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for updateTensorboardTimeSeries from properties.");
      }
    }
    Retry listTensorboardTimeSeriesRetry = clientProperties.getListTensorboardTimeSeriesRetry();
    if (listTensorboardTimeSeriesRetry != null) {
      RetrySettings listTensorboardTimeSeriesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listTensorboardTimeSeriesSettings().getRetrySettings(),
              listTensorboardTimeSeriesRetry);
      clientSettingsBuilder
          .listTensorboardTimeSeriesSettings()
          .setRetrySettings(listTensorboardTimeSeriesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listTensorboardTimeSeries from properties.");
      }
    }
    Retry batchReadTensorboardTimeSeriesDataRetry =
        clientProperties.getBatchReadTensorboardTimeSeriesDataRetry();
    if (batchReadTensorboardTimeSeriesDataRetry != null) {
      RetrySettings batchReadTensorboardTimeSeriesDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.batchReadTensorboardTimeSeriesDataSettings().getRetrySettings(),
              batchReadTensorboardTimeSeriesDataRetry);
      clientSettingsBuilder
          .batchReadTensorboardTimeSeriesDataSettings()
          .setRetrySettings(batchReadTensorboardTimeSeriesDataRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for batchReadTensorboardTimeSeriesData from properties.");
      }
    }
    Retry readTensorboardTimeSeriesDataRetry =
        clientProperties.getReadTensorboardTimeSeriesDataRetry();
    if (readTensorboardTimeSeriesDataRetry != null) {
      RetrySettings readTensorboardTimeSeriesDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.readTensorboardTimeSeriesDataSettings().getRetrySettings(),
              readTensorboardTimeSeriesDataRetry);
      clientSettingsBuilder
          .readTensorboardTimeSeriesDataSettings()
          .setRetrySettings(readTensorboardTimeSeriesDataRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for readTensorboardTimeSeriesData from properties.");
      }
    }
    Retry writeTensorboardExperimentDataRetry =
        clientProperties.getWriteTensorboardExperimentDataRetry();
    if (writeTensorboardExperimentDataRetry != null) {
      RetrySettings writeTensorboardExperimentDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.writeTensorboardExperimentDataSettings().getRetrySettings(),
              writeTensorboardExperimentDataRetry);
      clientSettingsBuilder
          .writeTensorboardExperimentDataSettings()
          .setRetrySettings(writeTensorboardExperimentDataRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for writeTensorboardExperimentData from properties.");
      }
    }
    Retry writeTensorboardRunDataRetry = clientProperties.getWriteTensorboardRunDataRetry();
    if (writeTensorboardRunDataRetry != null) {
      RetrySettings writeTensorboardRunDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.writeTensorboardRunDataSettings().getRetrySettings(),
              writeTensorboardRunDataRetry);
      clientSettingsBuilder
          .writeTensorboardRunDataSettings()
          .setRetrySettings(writeTensorboardRunDataRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for writeTensorboardRunData from properties.");
      }
    }
    Retry exportTensorboardTimeSeriesDataRetry =
        clientProperties.getExportTensorboardTimeSeriesDataRetry();
    if (exportTensorboardTimeSeriesDataRetry != null) {
      RetrySettings exportTensorboardTimeSeriesDataRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.exportTensorboardTimeSeriesDataSettings().getRetrySettings(),
              exportTensorboardTimeSeriesDataRetry);
      clientSettingsBuilder
          .exportTensorboardTimeSeriesDataSettings()
          .setRetrySettings(exportTensorboardTimeSeriesDataRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for exportTensorboardTimeSeriesData from properties.");
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
   * Provides a TensorboardServiceClient bean configured with TensorboardServiceSettings.
   *
   * @param tensorboardServiceSettings settings to configure an instance of client bean.
   * @return a {@link TensorboardServiceClient} bean configured with {@link
   *     TensorboardServiceSettings}
   */
  @Bean
  @ConditionalOnMissingBean
  public TensorboardServiceClient tensorboardServiceClient(
      TensorboardServiceSettings tensorboardServiceSettings) throws IOException {
    return TensorboardServiceClient.create(tensorboardServiceSettings);
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-tensorboard-service";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
