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
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for AlertPolicyService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.monitoring.v3.alert-policy-service")
public class AlertPolicyServiceSpringProperties implements CredentialsSupplier {
  /** OAuth2 credentials to authenticate and authorize calls to Google Cloud Client Libraries. */
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/monitoring",
          "https://www.googleapis.com/auth/monitoring.read");
  /** Quota project to use for billing. */
  private String quotaProjectId;
  /** Number of threads used for executors. */
  private Integer executorThreadCount;
  /** Allow override of retry settings at service level, applying to all of its RPC methods. */
  @NestedConfigurationProperty private Retry retry;
  /**
   * Allow override of retry settings at method-level for listAlertPolicies. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listAlertPoliciesRetry;
  /**
   * Allow override of retry settings at method-level for getAlertPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getAlertPolicyRetry;
  /**
   * Allow override of retry settings at method-level for createAlertPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createAlertPolicyRetry;
  /**
   * Allow override of retry settings at method-level for deleteAlertPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteAlertPolicyRetry;
  /**
   * Allow override of retry settings at method-level for updateAlertPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateAlertPolicyRetry;

  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  public String getQuotaProjectId() {
    return this.quotaProjectId;
  }

  public void setQuotaProjectId(String quotaProjectId) {
    this.quotaProjectId = quotaProjectId;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Retry getRetry() {
    return this.retry;
  }

  public void setRetry(Retry retry) {
    this.retry = retry;
  }

  public Retry getListAlertPoliciesRetry() {
    return this.listAlertPoliciesRetry;
  }

  public void setListAlertPoliciesRetry(Retry listAlertPoliciesRetry) {
    this.listAlertPoliciesRetry = listAlertPoliciesRetry;
  }

  public Retry getGetAlertPolicyRetry() {
    return this.getAlertPolicyRetry;
  }

  public void setGetAlertPolicyRetry(Retry getAlertPolicyRetry) {
    this.getAlertPolicyRetry = getAlertPolicyRetry;
  }

  public Retry getCreateAlertPolicyRetry() {
    return this.createAlertPolicyRetry;
  }

  public void setCreateAlertPolicyRetry(Retry createAlertPolicyRetry) {
    this.createAlertPolicyRetry = createAlertPolicyRetry;
  }

  public Retry getDeleteAlertPolicyRetry() {
    return this.deleteAlertPolicyRetry;
  }

  public void setDeleteAlertPolicyRetry(Retry deleteAlertPolicyRetry) {
    this.deleteAlertPolicyRetry = deleteAlertPolicyRetry;
  }

  public Retry getUpdateAlertPolicyRetry() {
    return this.updateAlertPolicyRetry;
  }

  public void setUpdateAlertPolicyRetry(Retry updateAlertPolicyRetry) {
    this.updateAlertPolicyRetry = updateAlertPolicyRetry;
  }
}