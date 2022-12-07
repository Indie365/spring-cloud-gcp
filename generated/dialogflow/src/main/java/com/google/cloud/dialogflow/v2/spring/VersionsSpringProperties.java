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
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for Versions client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.dialogflow.v2.spring.auto.versions")
public class VersionsSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/dialogflow");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  private Duration listVersionsInitialRetryDelay;
  private Double listVersionsRetryDelayMultiplier;
  private Duration listVersionsMaxRetryDelay;
  private Duration listVersionsInitialRpcTimeout;
  private Double listVersionsRpcTimeoutMultiplier;
  private Duration listVersionsMaxRpcTimeout;
  private Duration listVersionsTotalTimeout;
  private Duration getVersionInitialRetryDelay;
  private Double getVersionRetryDelayMultiplier;
  private Duration getVersionMaxRetryDelay;
  private Duration getVersionInitialRpcTimeout;
  private Double getVersionRpcTimeoutMultiplier;
  private Duration getVersionMaxRpcTimeout;
  private Duration getVersionTotalTimeout;
  private Duration createVersionInitialRetryDelay;
  private Double createVersionRetryDelayMultiplier;
  private Duration createVersionMaxRetryDelay;
  private Duration createVersionInitialRpcTimeout;
  private Double createVersionRpcTimeoutMultiplier;
  private Duration createVersionMaxRpcTimeout;
  private Duration createVersionTotalTimeout;
  private Duration updateVersionInitialRetryDelay;
  private Double updateVersionRetryDelayMultiplier;
  private Duration updateVersionMaxRetryDelay;
  private Duration updateVersionInitialRpcTimeout;
  private Double updateVersionRpcTimeoutMultiplier;
  private Duration updateVersionMaxRpcTimeout;
  private Duration updateVersionTotalTimeout;
  private Duration deleteVersionInitialRetryDelay;
  private Double deleteVersionRetryDelayMultiplier;
  private Duration deleteVersionMaxRetryDelay;
  private Duration deleteVersionInitialRpcTimeout;
  private Double deleteVersionRpcTimeoutMultiplier;
  private Duration deleteVersionMaxRpcTimeout;
  private Duration deleteVersionTotalTimeout;
  private Duration listLocationsInitialRetryDelay;
  private Double listLocationsRetryDelayMultiplier;
  private Duration listLocationsMaxRetryDelay;
  private Duration listLocationsInitialRpcTimeout;
  private Double listLocationsRpcTimeoutMultiplier;
  private Duration listLocationsMaxRpcTimeout;
  private Duration listLocationsTotalTimeout;
  private Duration getLocationInitialRetryDelay;
  private Double getLocationRetryDelayMultiplier;
  private Duration getLocationMaxRetryDelay;
  private Duration getLocationInitialRpcTimeout;
  private Double getLocationRpcTimeoutMultiplier;
  private Duration getLocationMaxRpcTimeout;
  private Duration getLocationTotalTimeout;

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

  public Duration getListVersionsInitialRetryDelay() {
    return this.listVersionsInitialRetryDelay;
  }

  public void setListVersionsInitialRetryDelay(java.time.Duration listVersionsInitialRetryDelay) {
    this.listVersionsInitialRetryDelay = Duration.parse(listVersionsInitialRetryDelay.toString());
  }

  public Double getListVersionsRetryDelayMultiplier() {
    return this.listVersionsRetryDelayMultiplier;
  }

  public void setListVersionsRetryDelayMultiplier(Double listVersionsRetryDelayMultiplier) {
    this.listVersionsRetryDelayMultiplier = listVersionsRetryDelayMultiplier;
  }

  public Duration getListVersionsMaxRetryDelay() {
    return this.listVersionsMaxRetryDelay;
  }

  public void setListVersionsMaxRetryDelay(java.time.Duration listVersionsMaxRetryDelay) {
    this.listVersionsMaxRetryDelay = Duration.parse(listVersionsMaxRetryDelay.toString());
  }

  public Duration getListVersionsInitialRpcTimeout() {
    return this.listVersionsInitialRpcTimeout;
  }

  public void setListVersionsInitialRpcTimeout(java.time.Duration listVersionsInitialRpcTimeout) {
    this.listVersionsInitialRpcTimeout = Duration.parse(listVersionsInitialRpcTimeout.toString());
  }

  public Double getListVersionsRpcTimeoutMultiplier() {
    return this.listVersionsRpcTimeoutMultiplier;
  }

  public void setListVersionsRpcTimeoutMultiplier(Double listVersionsRpcTimeoutMultiplier) {
    this.listVersionsRpcTimeoutMultiplier = listVersionsRpcTimeoutMultiplier;
  }

  public Duration getListVersionsMaxRpcTimeout() {
    return this.listVersionsMaxRpcTimeout;
  }

  public void setListVersionsMaxRpcTimeout(java.time.Duration listVersionsMaxRpcTimeout) {
    this.listVersionsMaxRpcTimeout = Duration.parse(listVersionsMaxRpcTimeout.toString());
  }

  public Duration getListVersionsTotalTimeout() {
    return this.listVersionsTotalTimeout;
  }

  public void setListVersionsTotalTimeout(java.time.Duration listVersionsTotalTimeout) {
    this.listVersionsTotalTimeout = Duration.parse(listVersionsTotalTimeout.toString());
  }

  public Duration getGetVersionInitialRetryDelay() {
    return this.getVersionInitialRetryDelay;
  }

  public void setGetVersionInitialRetryDelay(java.time.Duration getVersionInitialRetryDelay) {
    this.getVersionInitialRetryDelay = Duration.parse(getVersionInitialRetryDelay.toString());
  }

  public Double getGetVersionRetryDelayMultiplier() {
    return this.getVersionRetryDelayMultiplier;
  }

  public void setGetVersionRetryDelayMultiplier(Double getVersionRetryDelayMultiplier) {
    this.getVersionRetryDelayMultiplier = getVersionRetryDelayMultiplier;
  }

  public Duration getGetVersionMaxRetryDelay() {
    return this.getVersionMaxRetryDelay;
  }

  public void setGetVersionMaxRetryDelay(java.time.Duration getVersionMaxRetryDelay) {
    this.getVersionMaxRetryDelay = Duration.parse(getVersionMaxRetryDelay.toString());
  }

  public Duration getGetVersionInitialRpcTimeout() {
    return this.getVersionInitialRpcTimeout;
  }

  public void setGetVersionInitialRpcTimeout(java.time.Duration getVersionInitialRpcTimeout) {
    this.getVersionInitialRpcTimeout = Duration.parse(getVersionInitialRpcTimeout.toString());
  }

  public Double getGetVersionRpcTimeoutMultiplier() {
    return this.getVersionRpcTimeoutMultiplier;
  }

  public void setGetVersionRpcTimeoutMultiplier(Double getVersionRpcTimeoutMultiplier) {
    this.getVersionRpcTimeoutMultiplier = getVersionRpcTimeoutMultiplier;
  }

  public Duration getGetVersionMaxRpcTimeout() {
    return this.getVersionMaxRpcTimeout;
  }

  public void setGetVersionMaxRpcTimeout(java.time.Duration getVersionMaxRpcTimeout) {
    this.getVersionMaxRpcTimeout = Duration.parse(getVersionMaxRpcTimeout.toString());
  }

  public Duration getGetVersionTotalTimeout() {
    return this.getVersionTotalTimeout;
  }

  public void setGetVersionTotalTimeout(java.time.Duration getVersionTotalTimeout) {
    this.getVersionTotalTimeout = Duration.parse(getVersionTotalTimeout.toString());
  }

  public Duration getCreateVersionInitialRetryDelay() {
    return this.createVersionInitialRetryDelay;
  }

  public void setCreateVersionInitialRetryDelay(java.time.Duration createVersionInitialRetryDelay) {
    this.createVersionInitialRetryDelay = Duration.parse(createVersionInitialRetryDelay.toString());
  }

  public Double getCreateVersionRetryDelayMultiplier() {
    return this.createVersionRetryDelayMultiplier;
  }

  public void setCreateVersionRetryDelayMultiplier(Double createVersionRetryDelayMultiplier) {
    this.createVersionRetryDelayMultiplier = createVersionRetryDelayMultiplier;
  }

  public Duration getCreateVersionMaxRetryDelay() {
    return this.createVersionMaxRetryDelay;
  }

  public void setCreateVersionMaxRetryDelay(java.time.Duration createVersionMaxRetryDelay) {
    this.createVersionMaxRetryDelay = Duration.parse(createVersionMaxRetryDelay.toString());
  }

  public Duration getCreateVersionInitialRpcTimeout() {
    return this.createVersionInitialRpcTimeout;
  }

  public void setCreateVersionInitialRpcTimeout(java.time.Duration createVersionInitialRpcTimeout) {
    this.createVersionInitialRpcTimeout = Duration.parse(createVersionInitialRpcTimeout.toString());
  }

  public Double getCreateVersionRpcTimeoutMultiplier() {
    return this.createVersionRpcTimeoutMultiplier;
  }

  public void setCreateVersionRpcTimeoutMultiplier(Double createVersionRpcTimeoutMultiplier) {
    this.createVersionRpcTimeoutMultiplier = createVersionRpcTimeoutMultiplier;
  }

  public Duration getCreateVersionMaxRpcTimeout() {
    return this.createVersionMaxRpcTimeout;
  }

  public void setCreateVersionMaxRpcTimeout(java.time.Duration createVersionMaxRpcTimeout) {
    this.createVersionMaxRpcTimeout = Duration.parse(createVersionMaxRpcTimeout.toString());
  }

  public Duration getCreateVersionTotalTimeout() {
    return this.createVersionTotalTimeout;
  }

  public void setCreateVersionTotalTimeout(java.time.Duration createVersionTotalTimeout) {
    this.createVersionTotalTimeout = Duration.parse(createVersionTotalTimeout.toString());
  }

  public Duration getUpdateVersionInitialRetryDelay() {
    return this.updateVersionInitialRetryDelay;
  }

  public void setUpdateVersionInitialRetryDelay(java.time.Duration updateVersionInitialRetryDelay) {
    this.updateVersionInitialRetryDelay = Duration.parse(updateVersionInitialRetryDelay.toString());
  }

  public Double getUpdateVersionRetryDelayMultiplier() {
    return this.updateVersionRetryDelayMultiplier;
  }

  public void setUpdateVersionRetryDelayMultiplier(Double updateVersionRetryDelayMultiplier) {
    this.updateVersionRetryDelayMultiplier = updateVersionRetryDelayMultiplier;
  }

  public Duration getUpdateVersionMaxRetryDelay() {
    return this.updateVersionMaxRetryDelay;
  }

  public void setUpdateVersionMaxRetryDelay(java.time.Duration updateVersionMaxRetryDelay) {
    this.updateVersionMaxRetryDelay = Duration.parse(updateVersionMaxRetryDelay.toString());
  }

  public Duration getUpdateVersionInitialRpcTimeout() {
    return this.updateVersionInitialRpcTimeout;
  }

  public void setUpdateVersionInitialRpcTimeout(java.time.Duration updateVersionInitialRpcTimeout) {
    this.updateVersionInitialRpcTimeout = Duration.parse(updateVersionInitialRpcTimeout.toString());
  }

  public Double getUpdateVersionRpcTimeoutMultiplier() {
    return this.updateVersionRpcTimeoutMultiplier;
  }

  public void setUpdateVersionRpcTimeoutMultiplier(Double updateVersionRpcTimeoutMultiplier) {
    this.updateVersionRpcTimeoutMultiplier = updateVersionRpcTimeoutMultiplier;
  }

  public Duration getUpdateVersionMaxRpcTimeout() {
    return this.updateVersionMaxRpcTimeout;
  }

  public void setUpdateVersionMaxRpcTimeout(java.time.Duration updateVersionMaxRpcTimeout) {
    this.updateVersionMaxRpcTimeout = Duration.parse(updateVersionMaxRpcTimeout.toString());
  }

  public Duration getUpdateVersionTotalTimeout() {
    return this.updateVersionTotalTimeout;
  }

  public void setUpdateVersionTotalTimeout(java.time.Duration updateVersionTotalTimeout) {
    this.updateVersionTotalTimeout = Duration.parse(updateVersionTotalTimeout.toString());
  }

  public Duration getDeleteVersionInitialRetryDelay() {
    return this.deleteVersionInitialRetryDelay;
  }

  public void setDeleteVersionInitialRetryDelay(java.time.Duration deleteVersionInitialRetryDelay) {
    this.deleteVersionInitialRetryDelay = Duration.parse(deleteVersionInitialRetryDelay.toString());
  }

  public Double getDeleteVersionRetryDelayMultiplier() {
    return this.deleteVersionRetryDelayMultiplier;
  }

  public void setDeleteVersionRetryDelayMultiplier(Double deleteVersionRetryDelayMultiplier) {
    this.deleteVersionRetryDelayMultiplier = deleteVersionRetryDelayMultiplier;
  }

  public Duration getDeleteVersionMaxRetryDelay() {
    return this.deleteVersionMaxRetryDelay;
  }

  public void setDeleteVersionMaxRetryDelay(java.time.Duration deleteVersionMaxRetryDelay) {
    this.deleteVersionMaxRetryDelay = Duration.parse(deleteVersionMaxRetryDelay.toString());
  }

  public Duration getDeleteVersionInitialRpcTimeout() {
    return this.deleteVersionInitialRpcTimeout;
  }

  public void setDeleteVersionInitialRpcTimeout(java.time.Duration deleteVersionInitialRpcTimeout) {
    this.deleteVersionInitialRpcTimeout = Duration.parse(deleteVersionInitialRpcTimeout.toString());
  }

  public Double getDeleteVersionRpcTimeoutMultiplier() {
    return this.deleteVersionRpcTimeoutMultiplier;
  }

  public void setDeleteVersionRpcTimeoutMultiplier(Double deleteVersionRpcTimeoutMultiplier) {
    this.deleteVersionRpcTimeoutMultiplier = deleteVersionRpcTimeoutMultiplier;
  }

  public Duration getDeleteVersionMaxRpcTimeout() {
    return this.deleteVersionMaxRpcTimeout;
  }

  public void setDeleteVersionMaxRpcTimeout(java.time.Duration deleteVersionMaxRpcTimeout) {
    this.deleteVersionMaxRpcTimeout = Duration.parse(deleteVersionMaxRpcTimeout.toString());
  }

  public Duration getDeleteVersionTotalTimeout() {
    return this.deleteVersionTotalTimeout;
  }

  public void setDeleteVersionTotalTimeout(java.time.Duration deleteVersionTotalTimeout) {
    this.deleteVersionTotalTimeout = Duration.parse(deleteVersionTotalTimeout.toString());
  }

  public Duration getListLocationsInitialRetryDelay() {
    return this.listLocationsInitialRetryDelay;
  }

  public void setListLocationsInitialRetryDelay(java.time.Duration listLocationsInitialRetryDelay) {
    this.listLocationsInitialRetryDelay = Duration.parse(listLocationsInitialRetryDelay.toString());
  }

  public Double getListLocationsRetryDelayMultiplier() {
    return this.listLocationsRetryDelayMultiplier;
  }

  public void setListLocationsRetryDelayMultiplier(Double listLocationsRetryDelayMultiplier) {
    this.listLocationsRetryDelayMultiplier = listLocationsRetryDelayMultiplier;
  }

  public Duration getListLocationsMaxRetryDelay() {
    return this.listLocationsMaxRetryDelay;
  }

  public void setListLocationsMaxRetryDelay(java.time.Duration listLocationsMaxRetryDelay) {
    this.listLocationsMaxRetryDelay = Duration.parse(listLocationsMaxRetryDelay.toString());
  }

  public Duration getListLocationsInitialRpcTimeout() {
    return this.listLocationsInitialRpcTimeout;
  }

  public void setListLocationsInitialRpcTimeout(java.time.Duration listLocationsInitialRpcTimeout) {
    this.listLocationsInitialRpcTimeout = Duration.parse(listLocationsInitialRpcTimeout.toString());
  }

  public Double getListLocationsRpcTimeoutMultiplier() {
    return this.listLocationsRpcTimeoutMultiplier;
  }

  public void setListLocationsRpcTimeoutMultiplier(Double listLocationsRpcTimeoutMultiplier) {
    this.listLocationsRpcTimeoutMultiplier = listLocationsRpcTimeoutMultiplier;
  }

  public Duration getListLocationsMaxRpcTimeout() {
    return this.listLocationsMaxRpcTimeout;
  }

  public void setListLocationsMaxRpcTimeout(java.time.Duration listLocationsMaxRpcTimeout) {
    this.listLocationsMaxRpcTimeout = Duration.parse(listLocationsMaxRpcTimeout.toString());
  }

  public Duration getListLocationsTotalTimeout() {
    return this.listLocationsTotalTimeout;
  }

  public void setListLocationsTotalTimeout(java.time.Duration listLocationsTotalTimeout) {
    this.listLocationsTotalTimeout = Duration.parse(listLocationsTotalTimeout.toString());
  }

  public Duration getGetLocationInitialRetryDelay() {
    return this.getLocationInitialRetryDelay;
  }

  public void setGetLocationInitialRetryDelay(java.time.Duration getLocationInitialRetryDelay) {
    this.getLocationInitialRetryDelay = Duration.parse(getLocationInitialRetryDelay.toString());
  }

  public Double getGetLocationRetryDelayMultiplier() {
    return this.getLocationRetryDelayMultiplier;
  }

  public void setGetLocationRetryDelayMultiplier(Double getLocationRetryDelayMultiplier) {
    this.getLocationRetryDelayMultiplier = getLocationRetryDelayMultiplier;
  }

  public Duration getGetLocationMaxRetryDelay() {
    return this.getLocationMaxRetryDelay;
  }

  public void setGetLocationMaxRetryDelay(java.time.Duration getLocationMaxRetryDelay) {
    this.getLocationMaxRetryDelay = Duration.parse(getLocationMaxRetryDelay.toString());
  }

  public Duration getGetLocationInitialRpcTimeout() {
    return this.getLocationInitialRpcTimeout;
  }

  public void setGetLocationInitialRpcTimeout(java.time.Duration getLocationInitialRpcTimeout) {
    this.getLocationInitialRpcTimeout = Duration.parse(getLocationInitialRpcTimeout.toString());
  }

  public Double getGetLocationRpcTimeoutMultiplier() {
    return this.getLocationRpcTimeoutMultiplier;
  }

  public void setGetLocationRpcTimeoutMultiplier(Double getLocationRpcTimeoutMultiplier) {
    this.getLocationRpcTimeoutMultiplier = getLocationRpcTimeoutMultiplier;
  }

  public Duration getGetLocationMaxRpcTimeout() {
    return this.getLocationMaxRpcTimeout;
  }

  public void setGetLocationMaxRpcTimeout(java.time.Duration getLocationMaxRpcTimeout) {
    this.getLocationMaxRpcTimeout = Duration.parse(getLocationMaxRpcTimeout.toString());
  }

  public Duration getGetLocationTotalTimeout() {
    return this.getLocationTotalTimeout;
  }

  public void setGetLocationTotalTimeout(java.time.Duration getLocationTotalTimeout) {
    this.getLocationTotalTimeout = Duration.parse(getLocationTotalTimeout.toString());
  }
}
