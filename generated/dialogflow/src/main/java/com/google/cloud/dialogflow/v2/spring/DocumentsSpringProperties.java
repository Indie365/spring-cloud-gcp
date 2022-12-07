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
/** Provides default property values for Documents client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.dialogflow.v2.spring.auto.documents")
public class DocumentsSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/dialogflow");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  private Duration listDocumentsInitialRetryDelay;
  private Double listDocumentsRetryDelayMultiplier;
  private Duration listDocumentsMaxRetryDelay;
  private Duration listDocumentsInitialRpcTimeout;
  private Double listDocumentsRpcTimeoutMultiplier;
  private Duration listDocumentsMaxRpcTimeout;
  private Duration listDocumentsTotalTimeout;
  private Duration getDocumentInitialRetryDelay;
  private Double getDocumentRetryDelayMultiplier;
  private Duration getDocumentMaxRetryDelay;
  private Duration getDocumentInitialRpcTimeout;
  private Double getDocumentRpcTimeoutMultiplier;
  private Duration getDocumentMaxRpcTimeout;
  private Duration getDocumentTotalTimeout;
  private Duration createDocumentInitialRetryDelay;
  private Double createDocumentRetryDelayMultiplier;
  private Duration createDocumentMaxRetryDelay;
  private Duration createDocumentInitialRpcTimeout;
  private Double createDocumentRpcTimeoutMultiplier;
  private Duration createDocumentMaxRpcTimeout;
  private Duration createDocumentTotalTimeout;
  private Duration importDocumentsInitialRetryDelay;
  private Double importDocumentsRetryDelayMultiplier;
  private Duration importDocumentsMaxRetryDelay;
  private Duration importDocumentsInitialRpcTimeout;
  private Double importDocumentsRpcTimeoutMultiplier;
  private Duration importDocumentsMaxRpcTimeout;
  private Duration importDocumentsTotalTimeout;
  private Duration deleteDocumentInitialRetryDelay;
  private Double deleteDocumentRetryDelayMultiplier;
  private Duration deleteDocumentMaxRetryDelay;
  private Duration deleteDocumentInitialRpcTimeout;
  private Double deleteDocumentRpcTimeoutMultiplier;
  private Duration deleteDocumentMaxRpcTimeout;
  private Duration deleteDocumentTotalTimeout;
  private Duration updateDocumentInitialRetryDelay;
  private Double updateDocumentRetryDelayMultiplier;
  private Duration updateDocumentMaxRetryDelay;
  private Duration updateDocumentInitialRpcTimeout;
  private Double updateDocumentRpcTimeoutMultiplier;
  private Duration updateDocumentMaxRpcTimeout;
  private Duration updateDocumentTotalTimeout;
  private Duration reloadDocumentInitialRetryDelay;
  private Double reloadDocumentRetryDelayMultiplier;
  private Duration reloadDocumentMaxRetryDelay;
  private Duration reloadDocumentInitialRpcTimeout;
  private Double reloadDocumentRpcTimeoutMultiplier;
  private Duration reloadDocumentMaxRpcTimeout;
  private Duration reloadDocumentTotalTimeout;
  private Duration exportDocumentInitialRetryDelay;
  private Double exportDocumentRetryDelayMultiplier;
  private Duration exportDocumentMaxRetryDelay;
  private Duration exportDocumentInitialRpcTimeout;
  private Double exportDocumentRpcTimeoutMultiplier;
  private Duration exportDocumentMaxRpcTimeout;
  private Duration exportDocumentTotalTimeout;
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

  public Duration getListDocumentsInitialRetryDelay() {
    return this.listDocumentsInitialRetryDelay;
  }

  public void setListDocumentsInitialRetryDelay(java.time.Duration listDocumentsInitialRetryDelay) {
    this.listDocumentsInitialRetryDelay = Duration.parse(listDocumentsInitialRetryDelay.toString());
  }

  public Double getListDocumentsRetryDelayMultiplier() {
    return this.listDocumentsRetryDelayMultiplier;
  }

  public void setListDocumentsRetryDelayMultiplier(Double listDocumentsRetryDelayMultiplier) {
    this.listDocumentsRetryDelayMultiplier = listDocumentsRetryDelayMultiplier;
  }

  public Duration getListDocumentsMaxRetryDelay() {
    return this.listDocumentsMaxRetryDelay;
  }

  public void setListDocumentsMaxRetryDelay(java.time.Duration listDocumentsMaxRetryDelay) {
    this.listDocumentsMaxRetryDelay = Duration.parse(listDocumentsMaxRetryDelay.toString());
  }

  public Duration getListDocumentsInitialRpcTimeout() {
    return this.listDocumentsInitialRpcTimeout;
  }

  public void setListDocumentsInitialRpcTimeout(java.time.Duration listDocumentsInitialRpcTimeout) {
    this.listDocumentsInitialRpcTimeout = Duration.parse(listDocumentsInitialRpcTimeout.toString());
  }

  public Double getListDocumentsRpcTimeoutMultiplier() {
    return this.listDocumentsRpcTimeoutMultiplier;
  }

  public void setListDocumentsRpcTimeoutMultiplier(Double listDocumentsRpcTimeoutMultiplier) {
    this.listDocumentsRpcTimeoutMultiplier = listDocumentsRpcTimeoutMultiplier;
  }

  public Duration getListDocumentsMaxRpcTimeout() {
    return this.listDocumentsMaxRpcTimeout;
  }

  public void setListDocumentsMaxRpcTimeout(java.time.Duration listDocumentsMaxRpcTimeout) {
    this.listDocumentsMaxRpcTimeout = Duration.parse(listDocumentsMaxRpcTimeout.toString());
  }

  public Duration getListDocumentsTotalTimeout() {
    return this.listDocumentsTotalTimeout;
  }

  public void setListDocumentsTotalTimeout(java.time.Duration listDocumentsTotalTimeout) {
    this.listDocumentsTotalTimeout = Duration.parse(listDocumentsTotalTimeout.toString());
  }

  public Duration getGetDocumentInitialRetryDelay() {
    return this.getDocumentInitialRetryDelay;
  }

  public void setGetDocumentInitialRetryDelay(java.time.Duration getDocumentInitialRetryDelay) {
    this.getDocumentInitialRetryDelay = Duration.parse(getDocumentInitialRetryDelay.toString());
  }

  public Double getGetDocumentRetryDelayMultiplier() {
    return this.getDocumentRetryDelayMultiplier;
  }

  public void setGetDocumentRetryDelayMultiplier(Double getDocumentRetryDelayMultiplier) {
    this.getDocumentRetryDelayMultiplier = getDocumentRetryDelayMultiplier;
  }

  public Duration getGetDocumentMaxRetryDelay() {
    return this.getDocumentMaxRetryDelay;
  }

  public void setGetDocumentMaxRetryDelay(java.time.Duration getDocumentMaxRetryDelay) {
    this.getDocumentMaxRetryDelay = Duration.parse(getDocumentMaxRetryDelay.toString());
  }

  public Duration getGetDocumentInitialRpcTimeout() {
    return this.getDocumentInitialRpcTimeout;
  }

  public void setGetDocumentInitialRpcTimeout(java.time.Duration getDocumentInitialRpcTimeout) {
    this.getDocumentInitialRpcTimeout = Duration.parse(getDocumentInitialRpcTimeout.toString());
  }

  public Double getGetDocumentRpcTimeoutMultiplier() {
    return this.getDocumentRpcTimeoutMultiplier;
  }

  public void setGetDocumentRpcTimeoutMultiplier(Double getDocumentRpcTimeoutMultiplier) {
    this.getDocumentRpcTimeoutMultiplier = getDocumentRpcTimeoutMultiplier;
  }

  public Duration getGetDocumentMaxRpcTimeout() {
    return this.getDocumentMaxRpcTimeout;
  }

  public void setGetDocumentMaxRpcTimeout(java.time.Duration getDocumentMaxRpcTimeout) {
    this.getDocumentMaxRpcTimeout = Duration.parse(getDocumentMaxRpcTimeout.toString());
  }

  public Duration getGetDocumentTotalTimeout() {
    return this.getDocumentTotalTimeout;
  }

  public void setGetDocumentTotalTimeout(java.time.Duration getDocumentTotalTimeout) {
    this.getDocumentTotalTimeout = Duration.parse(getDocumentTotalTimeout.toString());
  }

  public Duration getCreateDocumentInitialRetryDelay() {
    return this.createDocumentInitialRetryDelay;
  }

  public void setCreateDocumentInitialRetryDelay(
      java.time.Duration createDocumentInitialRetryDelay) {
    this.createDocumentInitialRetryDelay =
        Duration.parse(createDocumentInitialRetryDelay.toString());
  }

  public Double getCreateDocumentRetryDelayMultiplier() {
    return this.createDocumentRetryDelayMultiplier;
  }

  public void setCreateDocumentRetryDelayMultiplier(Double createDocumentRetryDelayMultiplier) {
    this.createDocumentRetryDelayMultiplier = createDocumentRetryDelayMultiplier;
  }

  public Duration getCreateDocumentMaxRetryDelay() {
    return this.createDocumentMaxRetryDelay;
  }

  public void setCreateDocumentMaxRetryDelay(java.time.Duration createDocumentMaxRetryDelay) {
    this.createDocumentMaxRetryDelay = Duration.parse(createDocumentMaxRetryDelay.toString());
  }

  public Duration getCreateDocumentInitialRpcTimeout() {
    return this.createDocumentInitialRpcTimeout;
  }

  public void setCreateDocumentInitialRpcTimeout(
      java.time.Duration createDocumentInitialRpcTimeout) {
    this.createDocumentInitialRpcTimeout =
        Duration.parse(createDocumentInitialRpcTimeout.toString());
  }

  public Double getCreateDocumentRpcTimeoutMultiplier() {
    return this.createDocumentRpcTimeoutMultiplier;
  }

  public void setCreateDocumentRpcTimeoutMultiplier(Double createDocumentRpcTimeoutMultiplier) {
    this.createDocumentRpcTimeoutMultiplier = createDocumentRpcTimeoutMultiplier;
  }

  public Duration getCreateDocumentMaxRpcTimeout() {
    return this.createDocumentMaxRpcTimeout;
  }

  public void setCreateDocumentMaxRpcTimeout(java.time.Duration createDocumentMaxRpcTimeout) {
    this.createDocumentMaxRpcTimeout = Duration.parse(createDocumentMaxRpcTimeout.toString());
  }

  public Duration getCreateDocumentTotalTimeout() {
    return this.createDocumentTotalTimeout;
  }

  public void setCreateDocumentTotalTimeout(java.time.Duration createDocumentTotalTimeout) {
    this.createDocumentTotalTimeout = Duration.parse(createDocumentTotalTimeout.toString());
  }

  public Duration getImportDocumentsInitialRetryDelay() {
    return this.importDocumentsInitialRetryDelay;
  }

  public void setImportDocumentsInitialRetryDelay(
      java.time.Duration importDocumentsInitialRetryDelay) {
    this.importDocumentsInitialRetryDelay =
        Duration.parse(importDocumentsInitialRetryDelay.toString());
  }

  public Double getImportDocumentsRetryDelayMultiplier() {
    return this.importDocumentsRetryDelayMultiplier;
  }

  public void setImportDocumentsRetryDelayMultiplier(Double importDocumentsRetryDelayMultiplier) {
    this.importDocumentsRetryDelayMultiplier = importDocumentsRetryDelayMultiplier;
  }

  public Duration getImportDocumentsMaxRetryDelay() {
    return this.importDocumentsMaxRetryDelay;
  }

  public void setImportDocumentsMaxRetryDelay(java.time.Duration importDocumentsMaxRetryDelay) {
    this.importDocumentsMaxRetryDelay = Duration.parse(importDocumentsMaxRetryDelay.toString());
  }

  public Duration getImportDocumentsInitialRpcTimeout() {
    return this.importDocumentsInitialRpcTimeout;
  }

  public void setImportDocumentsInitialRpcTimeout(
      java.time.Duration importDocumentsInitialRpcTimeout) {
    this.importDocumentsInitialRpcTimeout =
        Duration.parse(importDocumentsInitialRpcTimeout.toString());
  }

  public Double getImportDocumentsRpcTimeoutMultiplier() {
    return this.importDocumentsRpcTimeoutMultiplier;
  }

  public void setImportDocumentsRpcTimeoutMultiplier(Double importDocumentsRpcTimeoutMultiplier) {
    this.importDocumentsRpcTimeoutMultiplier = importDocumentsRpcTimeoutMultiplier;
  }

  public Duration getImportDocumentsMaxRpcTimeout() {
    return this.importDocumentsMaxRpcTimeout;
  }

  public void setImportDocumentsMaxRpcTimeout(java.time.Duration importDocumentsMaxRpcTimeout) {
    this.importDocumentsMaxRpcTimeout = Duration.parse(importDocumentsMaxRpcTimeout.toString());
  }

  public Duration getImportDocumentsTotalTimeout() {
    return this.importDocumentsTotalTimeout;
  }

  public void setImportDocumentsTotalTimeout(java.time.Duration importDocumentsTotalTimeout) {
    this.importDocumentsTotalTimeout = Duration.parse(importDocumentsTotalTimeout.toString());
  }

  public Duration getDeleteDocumentInitialRetryDelay() {
    return this.deleteDocumentInitialRetryDelay;
  }

  public void setDeleteDocumentInitialRetryDelay(
      java.time.Duration deleteDocumentInitialRetryDelay) {
    this.deleteDocumentInitialRetryDelay =
        Duration.parse(deleteDocumentInitialRetryDelay.toString());
  }

  public Double getDeleteDocumentRetryDelayMultiplier() {
    return this.deleteDocumentRetryDelayMultiplier;
  }

  public void setDeleteDocumentRetryDelayMultiplier(Double deleteDocumentRetryDelayMultiplier) {
    this.deleteDocumentRetryDelayMultiplier = deleteDocumentRetryDelayMultiplier;
  }

  public Duration getDeleteDocumentMaxRetryDelay() {
    return this.deleteDocumentMaxRetryDelay;
  }

  public void setDeleteDocumentMaxRetryDelay(java.time.Duration deleteDocumentMaxRetryDelay) {
    this.deleteDocumentMaxRetryDelay = Duration.parse(deleteDocumentMaxRetryDelay.toString());
  }

  public Duration getDeleteDocumentInitialRpcTimeout() {
    return this.deleteDocumentInitialRpcTimeout;
  }

  public void setDeleteDocumentInitialRpcTimeout(
      java.time.Duration deleteDocumentInitialRpcTimeout) {
    this.deleteDocumentInitialRpcTimeout =
        Duration.parse(deleteDocumentInitialRpcTimeout.toString());
  }

  public Double getDeleteDocumentRpcTimeoutMultiplier() {
    return this.deleteDocumentRpcTimeoutMultiplier;
  }

  public void setDeleteDocumentRpcTimeoutMultiplier(Double deleteDocumentRpcTimeoutMultiplier) {
    this.deleteDocumentRpcTimeoutMultiplier = deleteDocumentRpcTimeoutMultiplier;
  }

  public Duration getDeleteDocumentMaxRpcTimeout() {
    return this.deleteDocumentMaxRpcTimeout;
  }

  public void setDeleteDocumentMaxRpcTimeout(java.time.Duration deleteDocumentMaxRpcTimeout) {
    this.deleteDocumentMaxRpcTimeout = Duration.parse(deleteDocumentMaxRpcTimeout.toString());
  }

  public Duration getDeleteDocumentTotalTimeout() {
    return this.deleteDocumentTotalTimeout;
  }

  public void setDeleteDocumentTotalTimeout(java.time.Duration deleteDocumentTotalTimeout) {
    this.deleteDocumentTotalTimeout = Duration.parse(deleteDocumentTotalTimeout.toString());
  }

  public Duration getUpdateDocumentInitialRetryDelay() {
    return this.updateDocumentInitialRetryDelay;
  }

  public void setUpdateDocumentInitialRetryDelay(
      java.time.Duration updateDocumentInitialRetryDelay) {
    this.updateDocumentInitialRetryDelay =
        Duration.parse(updateDocumentInitialRetryDelay.toString());
  }

  public Double getUpdateDocumentRetryDelayMultiplier() {
    return this.updateDocumentRetryDelayMultiplier;
  }

  public void setUpdateDocumentRetryDelayMultiplier(Double updateDocumentRetryDelayMultiplier) {
    this.updateDocumentRetryDelayMultiplier = updateDocumentRetryDelayMultiplier;
  }

  public Duration getUpdateDocumentMaxRetryDelay() {
    return this.updateDocumentMaxRetryDelay;
  }

  public void setUpdateDocumentMaxRetryDelay(java.time.Duration updateDocumentMaxRetryDelay) {
    this.updateDocumentMaxRetryDelay = Duration.parse(updateDocumentMaxRetryDelay.toString());
  }

  public Duration getUpdateDocumentInitialRpcTimeout() {
    return this.updateDocumentInitialRpcTimeout;
  }

  public void setUpdateDocumentInitialRpcTimeout(
      java.time.Duration updateDocumentInitialRpcTimeout) {
    this.updateDocumentInitialRpcTimeout =
        Duration.parse(updateDocumentInitialRpcTimeout.toString());
  }

  public Double getUpdateDocumentRpcTimeoutMultiplier() {
    return this.updateDocumentRpcTimeoutMultiplier;
  }

  public void setUpdateDocumentRpcTimeoutMultiplier(Double updateDocumentRpcTimeoutMultiplier) {
    this.updateDocumentRpcTimeoutMultiplier = updateDocumentRpcTimeoutMultiplier;
  }

  public Duration getUpdateDocumentMaxRpcTimeout() {
    return this.updateDocumentMaxRpcTimeout;
  }

  public void setUpdateDocumentMaxRpcTimeout(java.time.Duration updateDocumentMaxRpcTimeout) {
    this.updateDocumentMaxRpcTimeout = Duration.parse(updateDocumentMaxRpcTimeout.toString());
  }

  public Duration getUpdateDocumentTotalTimeout() {
    return this.updateDocumentTotalTimeout;
  }

  public void setUpdateDocumentTotalTimeout(java.time.Duration updateDocumentTotalTimeout) {
    this.updateDocumentTotalTimeout = Duration.parse(updateDocumentTotalTimeout.toString());
  }

  public Duration getReloadDocumentInitialRetryDelay() {
    return this.reloadDocumentInitialRetryDelay;
  }

  public void setReloadDocumentInitialRetryDelay(
      java.time.Duration reloadDocumentInitialRetryDelay) {
    this.reloadDocumentInitialRetryDelay =
        Duration.parse(reloadDocumentInitialRetryDelay.toString());
  }

  public Double getReloadDocumentRetryDelayMultiplier() {
    return this.reloadDocumentRetryDelayMultiplier;
  }

  public void setReloadDocumentRetryDelayMultiplier(Double reloadDocumentRetryDelayMultiplier) {
    this.reloadDocumentRetryDelayMultiplier = reloadDocumentRetryDelayMultiplier;
  }

  public Duration getReloadDocumentMaxRetryDelay() {
    return this.reloadDocumentMaxRetryDelay;
  }

  public void setReloadDocumentMaxRetryDelay(java.time.Duration reloadDocumentMaxRetryDelay) {
    this.reloadDocumentMaxRetryDelay = Duration.parse(reloadDocumentMaxRetryDelay.toString());
  }

  public Duration getReloadDocumentInitialRpcTimeout() {
    return this.reloadDocumentInitialRpcTimeout;
  }

  public void setReloadDocumentInitialRpcTimeout(
      java.time.Duration reloadDocumentInitialRpcTimeout) {
    this.reloadDocumentInitialRpcTimeout =
        Duration.parse(reloadDocumentInitialRpcTimeout.toString());
  }

  public Double getReloadDocumentRpcTimeoutMultiplier() {
    return this.reloadDocumentRpcTimeoutMultiplier;
  }

  public void setReloadDocumentRpcTimeoutMultiplier(Double reloadDocumentRpcTimeoutMultiplier) {
    this.reloadDocumentRpcTimeoutMultiplier = reloadDocumentRpcTimeoutMultiplier;
  }

  public Duration getReloadDocumentMaxRpcTimeout() {
    return this.reloadDocumentMaxRpcTimeout;
  }

  public void setReloadDocumentMaxRpcTimeout(java.time.Duration reloadDocumentMaxRpcTimeout) {
    this.reloadDocumentMaxRpcTimeout = Duration.parse(reloadDocumentMaxRpcTimeout.toString());
  }

  public Duration getReloadDocumentTotalTimeout() {
    return this.reloadDocumentTotalTimeout;
  }

  public void setReloadDocumentTotalTimeout(java.time.Duration reloadDocumentTotalTimeout) {
    this.reloadDocumentTotalTimeout = Duration.parse(reloadDocumentTotalTimeout.toString());
  }

  public Duration getExportDocumentInitialRetryDelay() {
    return this.exportDocumentInitialRetryDelay;
  }

  public void setExportDocumentInitialRetryDelay(
      java.time.Duration exportDocumentInitialRetryDelay) {
    this.exportDocumentInitialRetryDelay =
        Duration.parse(exportDocumentInitialRetryDelay.toString());
  }

  public Double getExportDocumentRetryDelayMultiplier() {
    return this.exportDocumentRetryDelayMultiplier;
  }

  public void setExportDocumentRetryDelayMultiplier(Double exportDocumentRetryDelayMultiplier) {
    this.exportDocumentRetryDelayMultiplier = exportDocumentRetryDelayMultiplier;
  }

  public Duration getExportDocumentMaxRetryDelay() {
    return this.exportDocumentMaxRetryDelay;
  }

  public void setExportDocumentMaxRetryDelay(java.time.Duration exportDocumentMaxRetryDelay) {
    this.exportDocumentMaxRetryDelay = Duration.parse(exportDocumentMaxRetryDelay.toString());
  }

  public Duration getExportDocumentInitialRpcTimeout() {
    return this.exportDocumentInitialRpcTimeout;
  }

  public void setExportDocumentInitialRpcTimeout(
      java.time.Duration exportDocumentInitialRpcTimeout) {
    this.exportDocumentInitialRpcTimeout =
        Duration.parse(exportDocumentInitialRpcTimeout.toString());
  }

  public Double getExportDocumentRpcTimeoutMultiplier() {
    return this.exportDocumentRpcTimeoutMultiplier;
  }

  public void setExportDocumentRpcTimeoutMultiplier(Double exportDocumentRpcTimeoutMultiplier) {
    this.exportDocumentRpcTimeoutMultiplier = exportDocumentRpcTimeoutMultiplier;
  }

  public Duration getExportDocumentMaxRpcTimeout() {
    return this.exportDocumentMaxRpcTimeout;
  }

  public void setExportDocumentMaxRpcTimeout(java.time.Duration exportDocumentMaxRpcTimeout) {
    this.exportDocumentMaxRpcTimeout = Duration.parse(exportDocumentMaxRpcTimeout.toString());
  }

  public Duration getExportDocumentTotalTimeout() {
    return this.exportDocumentTotalTimeout;
  }

  public void setExportDocumentTotalTimeout(java.time.Duration exportDocumentTotalTimeout) {
    this.exportDocumentTotalTimeout = Duration.parse(exportDocumentTotalTimeout.toString());
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
