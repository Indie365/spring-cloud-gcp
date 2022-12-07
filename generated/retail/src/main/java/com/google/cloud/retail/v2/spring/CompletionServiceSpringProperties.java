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

package com.google.cloud.retail.v2.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for CompletionService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.retail.v2.spring.auto.completion-service")
public class CompletionServiceSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials("https://www.googleapis.com/auth/cloud-platform");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  private Duration completeQueryInitialRetryDelay;
  private Double completeQueryRetryDelayMultiplier;
  private Duration completeQueryMaxRetryDelay;
  private Duration completeQueryInitialRpcTimeout;
  private Double completeQueryRpcTimeoutMultiplier;
  private Duration completeQueryMaxRpcTimeout;
  private Duration completeQueryTotalTimeout;
  private Duration importCompletionDataInitialRetryDelay;
  private Double importCompletionDataRetryDelayMultiplier;
  private Duration importCompletionDataMaxRetryDelay;
  private Duration importCompletionDataInitialRpcTimeout;
  private Double importCompletionDataRpcTimeoutMultiplier;
  private Duration importCompletionDataMaxRpcTimeout;
  private Duration importCompletionDataTotalTimeout;

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

  public boolean getUseRest() {
    return this.useRest;
  }

  public void setUseRest(boolean useRest) {
    this.useRest = useRest;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Duration getCompleteQueryInitialRetryDelay() {
    return this.completeQueryInitialRetryDelay;
  }

  public void setCompleteQueryInitialRetryDelay(java.time.Duration completeQueryInitialRetryDelay) {
    this.completeQueryInitialRetryDelay = Duration.parse(completeQueryInitialRetryDelay.toString());
  }

  public Double getCompleteQueryRetryDelayMultiplier() {
    return this.completeQueryRetryDelayMultiplier;
  }

  public void setCompleteQueryRetryDelayMultiplier(Double completeQueryRetryDelayMultiplier) {
    this.completeQueryRetryDelayMultiplier = completeQueryRetryDelayMultiplier;
  }

  public Duration getCompleteQueryMaxRetryDelay() {
    return this.completeQueryMaxRetryDelay;
  }

  public void setCompleteQueryMaxRetryDelay(java.time.Duration completeQueryMaxRetryDelay) {
    this.completeQueryMaxRetryDelay = Duration.parse(completeQueryMaxRetryDelay.toString());
  }

  public Duration getCompleteQueryInitialRpcTimeout() {
    return this.completeQueryInitialRpcTimeout;
  }

  public void setCompleteQueryInitialRpcTimeout(java.time.Duration completeQueryInitialRpcTimeout) {
    this.completeQueryInitialRpcTimeout = Duration.parse(completeQueryInitialRpcTimeout.toString());
  }

  public Double getCompleteQueryRpcTimeoutMultiplier() {
    return this.completeQueryRpcTimeoutMultiplier;
  }

  public void setCompleteQueryRpcTimeoutMultiplier(Double completeQueryRpcTimeoutMultiplier) {
    this.completeQueryRpcTimeoutMultiplier = completeQueryRpcTimeoutMultiplier;
  }

  public Duration getCompleteQueryMaxRpcTimeout() {
    return this.completeQueryMaxRpcTimeout;
  }

  public void setCompleteQueryMaxRpcTimeout(java.time.Duration completeQueryMaxRpcTimeout) {
    this.completeQueryMaxRpcTimeout = Duration.parse(completeQueryMaxRpcTimeout.toString());
  }

  public Duration getCompleteQueryTotalTimeout() {
    return this.completeQueryTotalTimeout;
  }

  public void setCompleteQueryTotalTimeout(java.time.Duration completeQueryTotalTimeout) {
    this.completeQueryTotalTimeout = Duration.parse(completeQueryTotalTimeout.toString());
  }

  public Duration getImportCompletionDataInitialRetryDelay() {
    return this.importCompletionDataInitialRetryDelay;
  }

  public void setImportCompletionDataInitialRetryDelay(
      java.time.Duration importCompletionDataInitialRetryDelay) {
    this.importCompletionDataInitialRetryDelay =
        Duration.parse(importCompletionDataInitialRetryDelay.toString());
  }

  public Double getImportCompletionDataRetryDelayMultiplier() {
    return this.importCompletionDataRetryDelayMultiplier;
  }

  public void setImportCompletionDataRetryDelayMultiplier(
      Double importCompletionDataRetryDelayMultiplier) {
    this.importCompletionDataRetryDelayMultiplier = importCompletionDataRetryDelayMultiplier;
  }

  public Duration getImportCompletionDataMaxRetryDelay() {
    return this.importCompletionDataMaxRetryDelay;
  }

  public void setImportCompletionDataMaxRetryDelay(
      java.time.Duration importCompletionDataMaxRetryDelay) {
    this.importCompletionDataMaxRetryDelay =
        Duration.parse(importCompletionDataMaxRetryDelay.toString());
  }

  public Duration getImportCompletionDataInitialRpcTimeout() {
    return this.importCompletionDataInitialRpcTimeout;
  }

  public void setImportCompletionDataInitialRpcTimeout(
      java.time.Duration importCompletionDataInitialRpcTimeout) {
    this.importCompletionDataInitialRpcTimeout =
        Duration.parse(importCompletionDataInitialRpcTimeout.toString());
  }

  public Double getImportCompletionDataRpcTimeoutMultiplier() {
    return this.importCompletionDataRpcTimeoutMultiplier;
  }

  public void setImportCompletionDataRpcTimeoutMultiplier(
      Double importCompletionDataRpcTimeoutMultiplier) {
    this.importCompletionDataRpcTimeoutMultiplier = importCompletionDataRpcTimeoutMultiplier;
  }

  public Duration getImportCompletionDataMaxRpcTimeout() {
    return this.importCompletionDataMaxRpcTimeout;
  }

  public void setImportCompletionDataMaxRpcTimeout(
      java.time.Duration importCompletionDataMaxRpcTimeout) {
    this.importCompletionDataMaxRpcTimeout =
        Duration.parse(importCompletionDataMaxRpcTimeout.toString());
  }

  public Duration getImportCompletionDataTotalTimeout() {
    return this.importCompletionDataTotalTimeout;
  }

  public void setImportCompletionDataTotalTimeout(
      java.time.Duration importCompletionDataTotalTimeout) {
    this.importCompletionDataTotalTimeout =
        Duration.parse(importCompletionDataTotalTimeout.toString());
  }
}
