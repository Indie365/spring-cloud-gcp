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

package com.google.cloud.networkconnectivity.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for HubService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.networkconnectivity.v1.spring.auto.hub-service")
public class HubServiceSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials("https://www.googleapis.com/auth/cloud-platform");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private Duration listHubsInitialRetryDelay;
  private Double listHubsRetryDelayMultiplier;
  private Duration listHubsMaxRetryDelay;
  private Duration listHubsInitialRpcTimeout;
  private Double listHubsRpcTimeoutMultiplier;
  private Duration listHubsMaxRpcTimeout;
  private Duration listHubsTotalTimeout;
  private Duration getHubInitialRetryDelay;
  private Double getHubRetryDelayMultiplier;
  private Duration getHubMaxRetryDelay;
  private Duration getHubInitialRpcTimeout;
  private Double getHubRpcTimeoutMultiplier;
  private Duration getHubMaxRpcTimeout;
  private Duration getHubTotalTimeout;
  private Duration createHubInitialRpcTimeout;
  private Double createHubRpcTimeoutMultiplier;
  private Duration createHubMaxRpcTimeout;
  private Duration createHubTotalTimeout;
  private Duration updateHubInitialRpcTimeout;
  private Double updateHubRpcTimeoutMultiplier;
  private Duration updateHubMaxRpcTimeout;
  private Duration updateHubTotalTimeout;
  private Duration deleteHubInitialRpcTimeout;
  private Double deleteHubRpcTimeoutMultiplier;
  private Duration deleteHubMaxRpcTimeout;
  private Duration deleteHubTotalTimeout;
  private Duration listSpokesInitialRetryDelay;
  private Double listSpokesRetryDelayMultiplier;
  private Duration listSpokesMaxRetryDelay;
  private Duration listSpokesInitialRpcTimeout;
  private Double listSpokesRpcTimeoutMultiplier;
  private Duration listSpokesMaxRpcTimeout;
  private Duration listSpokesTotalTimeout;
  private Duration getSpokeInitialRetryDelay;
  private Double getSpokeRetryDelayMultiplier;
  private Duration getSpokeMaxRetryDelay;
  private Duration getSpokeInitialRpcTimeout;
  private Double getSpokeRpcTimeoutMultiplier;
  private Duration getSpokeMaxRpcTimeout;
  private Duration getSpokeTotalTimeout;
  private Duration createSpokeInitialRpcTimeout;
  private Double createSpokeRpcTimeoutMultiplier;
  private Duration createSpokeMaxRpcTimeout;
  private Duration createSpokeTotalTimeout;
  private Duration updateSpokeInitialRpcTimeout;
  private Double updateSpokeRpcTimeoutMultiplier;
  private Duration updateSpokeMaxRpcTimeout;
  private Duration updateSpokeTotalTimeout;
  private Duration deleteSpokeInitialRpcTimeout;
  private Double deleteSpokeRpcTimeoutMultiplier;
  private Duration deleteSpokeMaxRpcTimeout;
  private Duration deleteSpokeTotalTimeout;

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

  public Duration getListHubsInitialRetryDelay() {
    return this.listHubsInitialRetryDelay;
  }

  public void setListHubsInitialRetryDelay(java.time.Duration listHubsInitialRetryDelay) {
    this.listHubsInitialRetryDelay = Duration.parse(listHubsInitialRetryDelay.toString());
  }

  public Double getListHubsRetryDelayMultiplier() {
    return this.listHubsRetryDelayMultiplier;
  }

  public void setListHubsRetryDelayMultiplier(Double listHubsRetryDelayMultiplier) {
    this.listHubsRetryDelayMultiplier = listHubsRetryDelayMultiplier;
  }

  public Duration getListHubsMaxRetryDelay() {
    return this.listHubsMaxRetryDelay;
  }

  public void setListHubsMaxRetryDelay(java.time.Duration listHubsMaxRetryDelay) {
    this.listHubsMaxRetryDelay = Duration.parse(listHubsMaxRetryDelay.toString());
  }

  public Duration getListHubsInitialRpcTimeout() {
    return this.listHubsInitialRpcTimeout;
  }

  public void setListHubsInitialRpcTimeout(java.time.Duration listHubsInitialRpcTimeout) {
    this.listHubsInitialRpcTimeout = Duration.parse(listHubsInitialRpcTimeout.toString());
  }

  public Double getListHubsRpcTimeoutMultiplier() {
    return this.listHubsRpcTimeoutMultiplier;
  }

  public void setListHubsRpcTimeoutMultiplier(Double listHubsRpcTimeoutMultiplier) {
    this.listHubsRpcTimeoutMultiplier = listHubsRpcTimeoutMultiplier;
  }

  public Duration getListHubsMaxRpcTimeout() {
    return this.listHubsMaxRpcTimeout;
  }

  public void setListHubsMaxRpcTimeout(java.time.Duration listHubsMaxRpcTimeout) {
    this.listHubsMaxRpcTimeout = Duration.parse(listHubsMaxRpcTimeout.toString());
  }

  public Duration getListHubsTotalTimeout() {
    return this.listHubsTotalTimeout;
  }

  public void setListHubsTotalTimeout(java.time.Duration listHubsTotalTimeout) {
    this.listHubsTotalTimeout = Duration.parse(listHubsTotalTimeout.toString());
  }

  public Duration getGetHubInitialRetryDelay() {
    return this.getHubInitialRetryDelay;
  }

  public void setGetHubInitialRetryDelay(java.time.Duration getHubInitialRetryDelay) {
    this.getHubInitialRetryDelay = Duration.parse(getHubInitialRetryDelay.toString());
  }

  public Double getGetHubRetryDelayMultiplier() {
    return this.getHubRetryDelayMultiplier;
  }

  public void setGetHubRetryDelayMultiplier(Double getHubRetryDelayMultiplier) {
    this.getHubRetryDelayMultiplier = getHubRetryDelayMultiplier;
  }

  public Duration getGetHubMaxRetryDelay() {
    return this.getHubMaxRetryDelay;
  }

  public void setGetHubMaxRetryDelay(java.time.Duration getHubMaxRetryDelay) {
    this.getHubMaxRetryDelay = Duration.parse(getHubMaxRetryDelay.toString());
  }

  public Duration getGetHubInitialRpcTimeout() {
    return this.getHubInitialRpcTimeout;
  }

  public void setGetHubInitialRpcTimeout(java.time.Duration getHubInitialRpcTimeout) {
    this.getHubInitialRpcTimeout = Duration.parse(getHubInitialRpcTimeout.toString());
  }

  public Double getGetHubRpcTimeoutMultiplier() {
    return this.getHubRpcTimeoutMultiplier;
  }

  public void setGetHubRpcTimeoutMultiplier(Double getHubRpcTimeoutMultiplier) {
    this.getHubRpcTimeoutMultiplier = getHubRpcTimeoutMultiplier;
  }

  public Duration getGetHubMaxRpcTimeout() {
    return this.getHubMaxRpcTimeout;
  }

  public void setGetHubMaxRpcTimeout(java.time.Duration getHubMaxRpcTimeout) {
    this.getHubMaxRpcTimeout = Duration.parse(getHubMaxRpcTimeout.toString());
  }

  public Duration getGetHubTotalTimeout() {
    return this.getHubTotalTimeout;
  }

  public void setGetHubTotalTimeout(java.time.Duration getHubTotalTimeout) {
    this.getHubTotalTimeout = Duration.parse(getHubTotalTimeout.toString());
  }

  public Duration getCreateHubInitialRpcTimeout() {
    return this.createHubInitialRpcTimeout;
  }

  public void setCreateHubInitialRpcTimeout(java.time.Duration createHubInitialRpcTimeout) {
    this.createHubInitialRpcTimeout = Duration.parse(createHubInitialRpcTimeout.toString());
  }

  public Double getCreateHubRpcTimeoutMultiplier() {
    return this.createHubRpcTimeoutMultiplier;
  }

  public void setCreateHubRpcTimeoutMultiplier(Double createHubRpcTimeoutMultiplier) {
    this.createHubRpcTimeoutMultiplier = createHubRpcTimeoutMultiplier;
  }

  public Duration getCreateHubMaxRpcTimeout() {
    return this.createHubMaxRpcTimeout;
  }

  public void setCreateHubMaxRpcTimeout(java.time.Duration createHubMaxRpcTimeout) {
    this.createHubMaxRpcTimeout = Duration.parse(createHubMaxRpcTimeout.toString());
  }

  public Duration getCreateHubTotalTimeout() {
    return this.createHubTotalTimeout;
  }

  public void setCreateHubTotalTimeout(java.time.Duration createHubTotalTimeout) {
    this.createHubTotalTimeout = Duration.parse(createHubTotalTimeout.toString());
  }

  public Duration getUpdateHubInitialRpcTimeout() {
    return this.updateHubInitialRpcTimeout;
  }

  public void setUpdateHubInitialRpcTimeout(java.time.Duration updateHubInitialRpcTimeout) {
    this.updateHubInitialRpcTimeout = Duration.parse(updateHubInitialRpcTimeout.toString());
  }

  public Double getUpdateHubRpcTimeoutMultiplier() {
    return this.updateHubRpcTimeoutMultiplier;
  }

  public void setUpdateHubRpcTimeoutMultiplier(Double updateHubRpcTimeoutMultiplier) {
    this.updateHubRpcTimeoutMultiplier = updateHubRpcTimeoutMultiplier;
  }

  public Duration getUpdateHubMaxRpcTimeout() {
    return this.updateHubMaxRpcTimeout;
  }

  public void setUpdateHubMaxRpcTimeout(java.time.Duration updateHubMaxRpcTimeout) {
    this.updateHubMaxRpcTimeout = Duration.parse(updateHubMaxRpcTimeout.toString());
  }

  public Duration getUpdateHubTotalTimeout() {
    return this.updateHubTotalTimeout;
  }

  public void setUpdateHubTotalTimeout(java.time.Duration updateHubTotalTimeout) {
    this.updateHubTotalTimeout = Duration.parse(updateHubTotalTimeout.toString());
  }

  public Duration getDeleteHubInitialRpcTimeout() {
    return this.deleteHubInitialRpcTimeout;
  }

  public void setDeleteHubInitialRpcTimeout(java.time.Duration deleteHubInitialRpcTimeout) {
    this.deleteHubInitialRpcTimeout = Duration.parse(deleteHubInitialRpcTimeout.toString());
  }

  public Double getDeleteHubRpcTimeoutMultiplier() {
    return this.deleteHubRpcTimeoutMultiplier;
  }

  public void setDeleteHubRpcTimeoutMultiplier(Double deleteHubRpcTimeoutMultiplier) {
    this.deleteHubRpcTimeoutMultiplier = deleteHubRpcTimeoutMultiplier;
  }

  public Duration getDeleteHubMaxRpcTimeout() {
    return this.deleteHubMaxRpcTimeout;
  }

  public void setDeleteHubMaxRpcTimeout(java.time.Duration deleteHubMaxRpcTimeout) {
    this.deleteHubMaxRpcTimeout = Duration.parse(deleteHubMaxRpcTimeout.toString());
  }

  public Duration getDeleteHubTotalTimeout() {
    return this.deleteHubTotalTimeout;
  }

  public void setDeleteHubTotalTimeout(java.time.Duration deleteHubTotalTimeout) {
    this.deleteHubTotalTimeout = Duration.parse(deleteHubTotalTimeout.toString());
  }

  public Duration getListSpokesInitialRetryDelay() {
    return this.listSpokesInitialRetryDelay;
  }

  public void setListSpokesInitialRetryDelay(java.time.Duration listSpokesInitialRetryDelay) {
    this.listSpokesInitialRetryDelay = Duration.parse(listSpokesInitialRetryDelay.toString());
  }

  public Double getListSpokesRetryDelayMultiplier() {
    return this.listSpokesRetryDelayMultiplier;
  }

  public void setListSpokesRetryDelayMultiplier(Double listSpokesRetryDelayMultiplier) {
    this.listSpokesRetryDelayMultiplier = listSpokesRetryDelayMultiplier;
  }

  public Duration getListSpokesMaxRetryDelay() {
    return this.listSpokesMaxRetryDelay;
  }

  public void setListSpokesMaxRetryDelay(java.time.Duration listSpokesMaxRetryDelay) {
    this.listSpokesMaxRetryDelay = Duration.parse(listSpokesMaxRetryDelay.toString());
  }

  public Duration getListSpokesInitialRpcTimeout() {
    return this.listSpokesInitialRpcTimeout;
  }

  public void setListSpokesInitialRpcTimeout(java.time.Duration listSpokesInitialRpcTimeout) {
    this.listSpokesInitialRpcTimeout = Duration.parse(listSpokesInitialRpcTimeout.toString());
  }

  public Double getListSpokesRpcTimeoutMultiplier() {
    return this.listSpokesRpcTimeoutMultiplier;
  }

  public void setListSpokesRpcTimeoutMultiplier(Double listSpokesRpcTimeoutMultiplier) {
    this.listSpokesRpcTimeoutMultiplier = listSpokesRpcTimeoutMultiplier;
  }

  public Duration getListSpokesMaxRpcTimeout() {
    return this.listSpokesMaxRpcTimeout;
  }

  public void setListSpokesMaxRpcTimeout(java.time.Duration listSpokesMaxRpcTimeout) {
    this.listSpokesMaxRpcTimeout = Duration.parse(listSpokesMaxRpcTimeout.toString());
  }

  public Duration getListSpokesTotalTimeout() {
    return this.listSpokesTotalTimeout;
  }

  public void setListSpokesTotalTimeout(java.time.Duration listSpokesTotalTimeout) {
    this.listSpokesTotalTimeout = Duration.parse(listSpokesTotalTimeout.toString());
  }

  public Duration getGetSpokeInitialRetryDelay() {
    return this.getSpokeInitialRetryDelay;
  }

  public void setGetSpokeInitialRetryDelay(java.time.Duration getSpokeInitialRetryDelay) {
    this.getSpokeInitialRetryDelay = Duration.parse(getSpokeInitialRetryDelay.toString());
  }

  public Double getGetSpokeRetryDelayMultiplier() {
    return this.getSpokeRetryDelayMultiplier;
  }

  public void setGetSpokeRetryDelayMultiplier(Double getSpokeRetryDelayMultiplier) {
    this.getSpokeRetryDelayMultiplier = getSpokeRetryDelayMultiplier;
  }

  public Duration getGetSpokeMaxRetryDelay() {
    return this.getSpokeMaxRetryDelay;
  }

  public void setGetSpokeMaxRetryDelay(java.time.Duration getSpokeMaxRetryDelay) {
    this.getSpokeMaxRetryDelay = Duration.parse(getSpokeMaxRetryDelay.toString());
  }

  public Duration getGetSpokeInitialRpcTimeout() {
    return this.getSpokeInitialRpcTimeout;
  }

  public void setGetSpokeInitialRpcTimeout(java.time.Duration getSpokeInitialRpcTimeout) {
    this.getSpokeInitialRpcTimeout = Duration.parse(getSpokeInitialRpcTimeout.toString());
  }

  public Double getGetSpokeRpcTimeoutMultiplier() {
    return this.getSpokeRpcTimeoutMultiplier;
  }

  public void setGetSpokeRpcTimeoutMultiplier(Double getSpokeRpcTimeoutMultiplier) {
    this.getSpokeRpcTimeoutMultiplier = getSpokeRpcTimeoutMultiplier;
  }

  public Duration getGetSpokeMaxRpcTimeout() {
    return this.getSpokeMaxRpcTimeout;
  }

  public void setGetSpokeMaxRpcTimeout(java.time.Duration getSpokeMaxRpcTimeout) {
    this.getSpokeMaxRpcTimeout = Duration.parse(getSpokeMaxRpcTimeout.toString());
  }

  public Duration getGetSpokeTotalTimeout() {
    return this.getSpokeTotalTimeout;
  }

  public void setGetSpokeTotalTimeout(java.time.Duration getSpokeTotalTimeout) {
    this.getSpokeTotalTimeout = Duration.parse(getSpokeTotalTimeout.toString());
  }

  public Duration getCreateSpokeInitialRpcTimeout() {
    return this.createSpokeInitialRpcTimeout;
  }

  public void setCreateSpokeInitialRpcTimeout(java.time.Duration createSpokeInitialRpcTimeout) {
    this.createSpokeInitialRpcTimeout = Duration.parse(createSpokeInitialRpcTimeout.toString());
  }

  public Double getCreateSpokeRpcTimeoutMultiplier() {
    return this.createSpokeRpcTimeoutMultiplier;
  }

  public void setCreateSpokeRpcTimeoutMultiplier(Double createSpokeRpcTimeoutMultiplier) {
    this.createSpokeRpcTimeoutMultiplier = createSpokeRpcTimeoutMultiplier;
  }

  public Duration getCreateSpokeMaxRpcTimeout() {
    return this.createSpokeMaxRpcTimeout;
  }

  public void setCreateSpokeMaxRpcTimeout(java.time.Duration createSpokeMaxRpcTimeout) {
    this.createSpokeMaxRpcTimeout = Duration.parse(createSpokeMaxRpcTimeout.toString());
  }

  public Duration getCreateSpokeTotalTimeout() {
    return this.createSpokeTotalTimeout;
  }

  public void setCreateSpokeTotalTimeout(java.time.Duration createSpokeTotalTimeout) {
    this.createSpokeTotalTimeout = Duration.parse(createSpokeTotalTimeout.toString());
  }

  public Duration getUpdateSpokeInitialRpcTimeout() {
    return this.updateSpokeInitialRpcTimeout;
  }

  public void setUpdateSpokeInitialRpcTimeout(java.time.Duration updateSpokeInitialRpcTimeout) {
    this.updateSpokeInitialRpcTimeout = Duration.parse(updateSpokeInitialRpcTimeout.toString());
  }

  public Double getUpdateSpokeRpcTimeoutMultiplier() {
    return this.updateSpokeRpcTimeoutMultiplier;
  }

  public void setUpdateSpokeRpcTimeoutMultiplier(Double updateSpokeRpcTimeoutMultiplier) {
    this.updateSpokeRpcTimeoutMultiplier = updateSpokeRpcTimeoutMultiplier;
  }

  public Duration getUpdateSpokeMaxRpcTimeout() {
    return this.updateSpokeMaxRpcTimeout;
  }

  public void setUpdateSpokeMaxRpcTimeout(java.time.Duration updateSpokeMaxRpcTimeout) {
    this.updateSpokeMaxRpcTimeout = Duration.parse(updateSpokeMaxRpcTimeout.toString());
  }

  public Duration getUpdateSpokeTotalTimeout() {
    return this.updateSpokeTotalTimeout;
  }

  public void setUpdateSpokeTotalTimeout(java.time.Duration updateSpokeTotalTimeout) {
    this.updateSpokeTotalTimeout = Duration.parse(updateSpokeTotalTimeout.toString());
  }

  public Duration getDeleteSpokeInitialRpcTimeout() {
    return this.deleteSpokeInitialRpcTimeout;
  }

  public void setDeleteSpokeInitialRpcTimeout(java.time.Duration deleteSpokeInitialRpcTimeout) {
    this.deleteSpokeInitialRpcTimeout = Duration.parse(deleteSpokeInitialRpcTimeout.toString());
  }

  public Double getDeleteSpokeRpcTimeoutMultiplier() {
    return this.deleteSpokeRpcTimeoutMultiplier;
  }

  public void setDeleteSpokeRpcTimeoutMultiplier(Double deleteSpokeRpcTimeoutMultiplier) {
    this.deleteSpokeRpcTimeoutMultiplier = deleteSpokeRpcTimeoutMultiplier;
  }

  public Duration getDeleteSpokeMaxRpcTimeout() {
    return this.deleteSpokeMaxRpcTimeout;
  }

  public void setDeleteSpokeMaxRpcTimeout(java.time.Duration deleteSpokeMaxRpcTimeout) {
    this.deleteSpokeMaxRpcTimeout = Duration.parse(deleteSpokeMaxRpcTimeout.toString());
  }

  public Duration getDeleteSpokeTotalTimeout() {
    return this.deleteSpokeTotalTimeout;
  }

  public void setDeleteSpokeTotalTimeout(java.time.Duration deleteSpokeTotalTimeout) {
    this.deleteSpokeTotalTimeout = Duration.parse(deleteSpokeTotalTimeout.toString());
  }
}
