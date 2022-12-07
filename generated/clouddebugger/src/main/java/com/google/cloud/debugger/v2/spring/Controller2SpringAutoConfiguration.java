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

package com.google.cloud.debugger.v2.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.debugger.v2.Controller2Client;
import com.google.cloud.debugger.v2.Controller2Settings;
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
 * Auto-configuration for {@link Controller2Client}.
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
@ConditionalOnClass(Controller2Client.class)
@ConditionalOnProperty(
    value = "com.google.cloud.debugger.v2.spring.auto.controller2.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties({Controller2SpringProperties.class, GlobalProperties.class})
public class Controller2SpringAutoConfiguration {
  private final Controller2SpringProperties clientProperties;
  private final GlobalProperties globalProperties;
  private static final Log LOGGER = LogFactory.getLog(Controller2SpringAutoConfiguration.class);

  protected Controller2SpringAutoConfiguration(
      Controller2SpringProperties clientProperties, GlobalProperties globalProperties) {
    this.clientProperties = clientProperties;
    this.globalProperties = globalProperties;
  }

  /**
   * Obtains the default credentials provider. The used key will be obtained from Spring Boot
   * configuration data files.
   */
  @Bean
  @ConditionalOnMissingBean
  public CredentialsProvider controller2Credentials() throws IOException {
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from Controller2-specific configuration");
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
  public TransportChannelProvider defaultController2TransportChannelProvider() {
    return Controller2Settings.defaultTransportChannelProvider();
  }

  /**
   * Provides a Controller2Client bean configured to use the default credentials provider (obtained
   * with controller2Credentials()) and its default transport channel provider
   * (defaultController2TransportChannelProvider()). It also configures the quota project ID if
   * provided. It will configure an executor provider in case there is more than one thread
   * configured in the client
   *
   * <p>Individual retry settings are configured as well. It will use the relevant client library's
   * default retry settings when they are not specified in Controller2SpringProperties.
   */
  @Bean
  @ConditionalOnMissingBean
  public Controller2Client controller2Client(
      @Qualifier("controller2Credentials") CredentialsProvider credentialsProvider,
      @Qualifier("defaultController2TransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    Controller2Settings.Builder clientSettingsBuilder =
        Controller2Settings.newBuilder()
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
          Controller2Settings.defaultExecutorProviderBuilder()
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
          Controller2Settings.defaultHttpJsonTransportProviderBuilder().build());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using HTTP transport channel");
      }
    }
    RetrySettings.Builder registerDebuggeeRetrySettingBuilder =
        clientSettingsBuilder.registerDebuggeeSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getRegisterDebuggeeInitialRpcTimeout() != null) {
      registerDebuggeeRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getRegisterDebuggeeInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "RegisterDebuggeeInitialRpcTimeout set to "
                + this.clientProperties.getRegisterDebuggeeInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getRegisterDebuggeeRpcTimeoutMultiplier() != null) {
      registerDebuggeeRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getRegisterDebuggeeRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "RegisterDebuggeeRpcTimeoutMultiplier set to "
                + this.clientProperties.getRegisterDebuggeeRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getRegisterDebuggeeMaxRpcTimeout() != null) {
      registerDebuggeeRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getRegisterDebuggeeMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "RegisterDebuggeeMaxRpcTimeout set to "
                + this.clientProperties.getRegisterDebuggeeMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getRegisterDebuggeeTotalTimeout() != null) {
      registerDebuggeeRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getRegisterDebuggeeTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "RegisterDebuggeeTotalTimeout set to "
                + this.clientProperties.getRegisterDebuggeeTotalTimeout());
      }
    }
    clientSettingsBuilder
        .registerDebuggeeSettings()
        .setRetrySettings(registerDebuggeeRetrySettingBuilder.build());
    RetrySettings.Builder listActiveBreakpointsRetrySettingBuilder =
        clientSettingsBuilder.listActiveBreakpointsSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getListActiveBreakpointsInitialRetryDelay() != null) {
      listActiveBreakpointsRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getListActiveBreakpointsInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListActiveBreakpointsInitialRetryDelay set to "
                + this.clientProperties.getListActiveBreakpointsInitialRetryDelay());
      }
    }
    if (this.clientProperties.getListActiveBreakpointsRetryDelayMultiplier() != null) {
      listActiveBreakpointsRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getListActiveBreakpointsRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListActiveBreakpointsRetryDelayMultiplier set to "
                + this.clientProperties.getListActiveBreakpointsRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getListActiveBreakpointsMaxRetryDelay() != null) {
      listActiveBreakpointsRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getListActiveBreakpointsMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListActiveBreakpointsMaxRetryDelay set to "
                + this.clientProperties.getListActiveBreakpointsMaxRetryDelay());
      }
    }
    if (this.clientProperties.getListActiveBreakpointsInitialRpcTimeout() != null) {
      listActiveBreakpointsRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getListActiveBreakpointsInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListActiveBreakpointsInitialRpcTimeout set to "
                + this.clientProperties.getListActiveBreakpointsInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getListActiveBreakpointsRpcTimeoutMultiplier() != null) {
      listActiveBreakpointsRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getListActiveBreakpointsRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListActiveBreakpointsRpcTimeoutMultiplier set to "
                + this.clientProperties.getListActiveBreakpointsRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getListActiveBreakpointsMaxRpcTimeout() != null) {
      listActiveBreakpointsRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getListActiveBreakpointsMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListActiveBreakpointsMaxRpcTimeout set to "
                + this.clientProperties.getListActiveBreakpointsMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getListActiveBreakpointsTotalTimeout() != null) {
      listActiveBreakpointsRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getListActiveBreakpointsTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "ListActiveBreakpointsTotalTimeout set to "
                + this.clientProperties.getListActiveBreakpointsTotalTimeout());
      }
    }
    clientSettingsBuilder
        .listActiveBreakpointsSettings()
        .setRetrySettings(listActiveBreakpointsRetrySettingBuilder.build());
    RetrySettings.Builder updateActiveBreakpointRetrySettingBuilder =
        clientSettingsBuilder.updateActiveBreakpointSettings().getRetrySettings().toBuilder();
    if (this.clientProperties.getUpdateActiveBreakpointInitialRetryDelay() != null) {
      updateActiveBreakpointRetrySettingBuilder.setInitialRetryDelay(
          this.clientProperties.getUpdateActiveBreakpointInitialRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateActiveBreakpointInitialRetryDelay set to "
                + this.clientProperties.getUpdateActiveBreakpointInitialRetryDelay());
      }
    }
    if (this.clientProperties.getUpdateActiveBreakpointRetryDelayMultiplier() != null) {
      updateActiveBreakpointRetrySettingBuilder.setRetryDelayMultiplier(
          this.clientProperties.getUpdateActiveBreakpointRetryDelayMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateActiveBreakpointRetryDelayMultiplier set to "
                + this.clientProperties.getUpdateActiveBreakpointRetryDelayMultiplier());
      }
    }
    if (this.clientProperties.getUpdateActiveBreakpointMaxRetryDelay() != null) {
      updateActiveBreakpointRetrySettingBuilder.setMaxRetryDelay(
          this.clientProperties.getUpdateActiveBreakpointMaxRetryDelay());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateActiveBreakpointMaxRetryDelay set to "
                + this.clientProperties.getUpdateActiveBreakpointMaxRetryDelay());
      }
    }
    if (this.clientProperties.getUpdateActiveBreakpointInitialRpcTimeout() != null) {
      updateActiveBreakpointRetrySettingBuilder.setInitialRpcTimeout(
          this.clientProperties.getUpdateActiveBreakpointInitialRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateActiveBreakpointInitialRpcTimeout set to "
                + this.clientProperties.getUpdateActiveBreakpointInitialRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateActiveBreakpointRpcTimeoutMultiplier() != null) {
      updateActiveBreakpointRetrySettingBuilder.setRpcTimeoutMultiplier(
          this.clientProperties.getUpdateActiveBreakpointRpcTimeoutMultiplier());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateActiveBreakpointRpcTimeoutMultiplier set to "
                + this.clientProperties.getUpdateActiveBreakpointRpcTimeoutMultiplier());
      }
    }
    if (this.clientProperties.getUpdateActiveBreakpointMaxRpcTimeout() != null) {
      updateActiveBreakpointRetrySettingBuilder.setMaxRpcTimeout(
          this.clientProperties.getUpdateActiveBreakpointMaxRpcTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateActiveBreakpointMaxRpcTimeout set to "
                + this.clientProperties.getUpdateActiveBreakpointMaxRpcTimeout());
      }
    }
    if (this.clientProperties.getUpdateActiveBreakpointTotalTimeout() != null) {
      updateActiveBreakpointRetrySettingBuilder.setTotalTimeout(
          this.clientProperties.getUpdateActiveBreakpointTotalTimeout());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "UpdateActiveBreakpointTotalTimeout set to "
                + this.clientProperties.getUpdateActiveBreakpointTotalTimeout());
      }
    }
    clientSettingsBuilder
        .updateActiveBreakpointSettings()
        .setRetrySettings(updateActiveBreakpointRetrySettingBuilder.build());
    return Controller2Client.create(clientSettingsBuilder.build());
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-controller2";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
