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
/** Provides default property values for CatalogService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.retail.v2.spring.auto.catalog-service")
public class CatalogServiceSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials("https://www.googleapis.com/auth/cloud-platform");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  private Duration listCatalogsInitialRetryDelay;
  private Double listCatalogsRetryDelayMultiplier;
  private Duration listCatalogsMaxRetryDelay;
  private Duration listCatalogsInitialRpcTimeout;
  private Double listCatalogsRpcTimeoutMultiplier;
  private Duration listCatalogsMaxRpcTimeout;
  private Duration listCatalogsTotalTimeout;
  private Duration updateCatalogInitialRetryDelay;
  private Double updateCatalogRetryDelayMultiplier;
  private Duration updateCatalogMaxRetryDelay;
  private Duration updateCatalogInitialRpcTimeout;
  private Double updateCatalogRpcTimeoutMultiplier;
  private Duration updateCatalogMaxRpcTimeout;
  private Duration updateCatalogTotalTimeout;
  private Duration setDefaultBranchInitialRetryDelay;
  private Double setDefaultBranchRetryDelayMultiplier;
  private Duration setDefaultBranchMaxRetryDelay;
  private Duration setDefaultBranchInitialRpcTimeout;
  private Double setDefaultBranchRpcTimeoutMultiplier;
  private Duration setDefaultBranchMaxRpcTimeout;
  private Duration setDefaultBranchTotalTimeout;
  private Duration getDefaultBranchInitialRetryDelay;
  private Double getDefaultBranchRetryDelayMultiplier;
  private Duration getDefaultBranchMaxRetryDelay;
  private Duration getDefaultBranchInitialRpcTimeout;
  private Double getDefaultBranchRpcTimeoutMultiplier;
  private Duration getDefaultBranchMaxRpcTimeout;
  private Duration getDefaultBranchTotalTimeout;
  private Duration getCompletionConfigInitialRetryDelay;
  private Double getCompletionConfigRetryDelayMultiplier;
  private Duration getCompletionConfigMaxRetryDelay;
  private Duration getCompletionConfigInitialRpcTimeout;
  private Double getCompletionConfigRpcTimeoutMultiplier;
  private Duration getCompletionConfigMaxRpcTimeout;
  private Duration getCompletionConfigTotalTimeout;
  private Duration updateCompletionConfigInitialRetryDelay;
  private Double updateCompletionConfigRetryDelayMultiplier;
  private Duration updateCompletionConfigMaxRetryDelay;
  private Duration updateCompletionConfigInitialRpcTimeout;
  private Double updateCompletionConfigRpcTimeoutMultiplier;
  private Duration updateCompletionConfigMaxRpcTimeout;
  private Duration updateCompletionConfigTotalTimeout;
  private Duration getAttributesConfigInitialRetryDelay;
  private Double getAttributesConfigRetryDelayMultiplier;
  private Duration getAttributesConfigMaxRetryDelay;
  private Duration getAttributesConfigInitialRpcTimeout;
  private Double getAttributesConfigRpcTimeoutMultiplier;
  private Duration getAttributesConfigMaxRpcTimeout;
  private Duration getAttributesConfigTotalTimeout;
  private Duration updateAttributesConfigInitialRetryDelay;
  private Double updateAttributesConfigRetryDelayMultiplier;
  private Duration updateAttributesConfigMaxRetryDelay;
  private Duration updateAttributesConfigInitialRpcTimeout;
  private Double updateAttributesConfigRpcTimeoutMultiplier;
  private Duration updateAttributesConfigMaxRpcTimeout;
  private Duration updateAttributesConfigTotalTimeout;
  private Duration addCatalogAttributeInitialRetryDelay;
  private Double addCatalogAttributeRetryDelayMultiplier;
  private Duration addCatalogAttributeMaxRetryDelay;
  private Duration addCatalogAttributeInitialRpcTimeout;
  private Double addCatalogAttributeRpcTimeoutMultiplier;
  private Duration addCatalogAttributeMaxRpcTimeout;
  private Duration addCatalogAttributeTotalTimeout;
  private Duration removeCatalogAttributeInitialRetryDelay;
  private Double removeCatalogAttributeRetryDelayMultiplier;
  private Duration removeCatalogAttributeMaxRetryDelay;
  private Duration removeCatalogAttributeInitialRpcTimeout;
  private Double removeCatalogAttributeRpcTimeoutMultiplier;
  private Duration removeCatalogAttributeMaxRpcTimeout;
  private Duration removeCatalogAttributeTotalTimeout;
  private Duration replaceCatalogAttributeInitialRetryDelay;
  private Double replaceCatalogAttributeRetryDelayMultiplier;
  private Duration replaceCatalogAttributeMaxRetryDelay;
  private Duration replaceCatalogAttributeInitialRpcTimeout;
  private Double replaceCatalogAttributeRpcTimeoutMultiplier;
  private Duration replaceCatalogAttributeMaxRpcTimeout;
  private Duration replaceCatalogAttributeTotalTimeout;

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

  public Duration getListCatalogsInitialRetryDelay() {
    return this.listCatalogsInitialRetryDelay;
  }

  public void setListCatalogsInitialRetryDelay(java.time.Duration listCatalogsInitialRetryDelay) {
    this.listCatalogsInitialRetryDelay = Duration.parse(listCatalogsInitialRetryDelay.toString());
  }

  public Double getListCatalogsRetryDelayMultiplier() {
    return this.listCatalogsRetryDelayMultiplier;
  }

  public void setListCatalogsRetryDelayMultiplier(Double listCatalogsRetryDelayMultiplier) {
    this.listCatalogsRetryDelayMultiplier = listCatalogsRetryDelayMultiplier;
  }

  public Duration getListCatalogsMaxRetryDelay() {
    return this.listCatalogsMaxRetryDelay;
  }

  public void setListCatalogsMaxRetryDelay(java.time.Duration listCatalogsMaxRetryDelay) {
    this.listCatalogsMaxRetryDelay = Duration.parse(listCatalogsMaxRetryDelay.toString());
  }

  public Duration getListCatalogsInitialRpcTimeout() {
    return this.listCatalogsInitialRpcTimeout;
  }

  public void setListCatalogsInitialRpcTimeout(java.time.Duration listCatalogsInitialRpcTimeout) {
    this.listCatalogsInitialRpcTimeout = Duration.parse(listCatalogsInitialRpcTimeout.toString());
  }

  public Double getListCatalogsRpcTimeoutMultiplier() {
    return this.listCatalogsRpcTimeoutMultiplier;
  }

  public void setListCatalogsRpcTimeoutMultiplier(Double listCatalogsRpcTimeoutMultiplier) {
    this.listCatalogsRpcTimeoutMultiplier = listCatalogsRpcTimeoutMultiplier;
  }

  public Duration getListCatalogsMaxRpcTimeout() {
    return this.listCatalogsMaxRpcTimeout;
  }

  public void setListCatalogsMaxRpcTimeout(java.time.Duration listCatalogsMaxRpcTimeout) {
    this.listCatalogsMaxRpcTimeout = Duration.parse(listCatalogsMaxRpcTimeout.toString());
  }

  public Duration getListCatalogsTotalTimeout() {
    return this.listCatalogsTotalTimeout;
  }

  public void setListCatalogsTotalTimeout(java.time.Duration listCatalogsTotalTimeout) {
    this.listCatalogsTotalTimeout = Duration.parse(listCatalogsTotalTimeout.toString());
  }

  public Duration getUpdateCatalogInitialRetryDelay() {
    return this.updateCatalogInitialRetryDelay;
  }

  public void setUpdateCatalogInitialRetryDelay(java.time.Duration updateCatalogInitialRetryDelay) {
    this.updateCatalogInitialRetryDelay = Duration.parse(updateCatalogInitialRetryDelay.toString());
  }

  public Double getUpdateCatalogRetryDelayMultiplier() {
    return this.updateCatalogRetryDelayMultiplier;
  }

  public void setUpdateCatalogRetryDelayMultiplier(Double updateCatalogRetryDelayMultiplier) {
    this.updateCatalogRetryDelayMultiplier = updateCatalogRetryDelayMultiplier;
  }

  public Duration getUpdateCatalogMaxRetryDelay() {
    return this.updateCatalogMaxRetryDelay;
  }

  public void setUpdateCatalogMaxRetryDelay(java.time.Duration updateCatalogMaxRetryDelay) {
    this.updateCatalogMaxRetryDelay = Duration.parse(updateCatalogMaxRetryDelay.toString());
  }

  public Duration getUpdateCatalogInitialRpcTimeout() {
    return this.updateCatalogInitialRpcTimeout;
  }

  public void setUpdateCatalogInitialRpcTimeout(java.time.Duration updateCatalogInitialRpcTimeout) {
    this.updateCatalogInitialRpcTimeout = Duration.parse(updateCatalogInitialRpcTimeout.toString());
  }

  public Double getUpdateCatalogRpcTimeoutMultiplier() {
    return this.updateCatalogRpcTimeoutMultiplier;
  }

  public void setUpdateCatalogRpcTimeoutMultiplier(Double updateCatalogRpcTimeoutMultiplier) {
    this.updateCatalogRpcTimeoutMultiplier = updateCatalogRpcTimeoutMultiplier;
  }

  public Duration getUpdateCatalogMaxRpcTimeout() {
    return this.updateCatalogMaxRpcTimeout;
  }

  public void setUpdateCatalogMaxRpcTimeout(java.time.Duration updateCatalogMaxRpcTimeout) {
    this.updateCatalogMaxRpcTimeout = Duration.parse(updateCatalogMaxRpcTimeout.toString());
  }

  public Duration getUpdateCatalogTotalTimeout() {
    return this.updateCatalogTotalTimeout;
  }

  public void setUpdateCatalogTotalTimeout(java.time.Duration updateCatalogTotalTimeout) {
    this.updateCatalogTotalTimeout = Duration.parse(updateCatalogTotalTimeout.toString());
  }

  public Duration getSetDefaultBranchInitialRetryDelay() {
    return this.setDefaultBranchInitialRetryDelay;
  }

  public void setSetDefaultBranchInitialRetryDelay(
      java.time.Duration setDefaultBranchInitialRetryDelay) {
    this.setDefaultBranchInitialRetryDelay =
        Duration.parse(setDefaultBranchInitialRetryDelay.toString());
  }

  public Double getSetDefaultBranchRetryDelayMultiplier() {
    return this.setDefaultBranchRetryDelayMultiplier;
  }

  public void setSetDefaultBranchRetryDelayMultiplier(Double setDefaultBranchRetryDelayMultiplier) {
    this.setDefaultBranchRetryDelayMultiplier = setDefaultBranchRetryDelayMultiplier;
  }

  public Duration getSetDefaultBranchMaxRetryDelay() {
    return this.setDefaultBranchMaxRetryDelay;
  }

  public void setSetDefaultBranchMaxRetryDelay(java.time.Duration setDefaultBranchMaxRetryDelay) {
    this.setDefaultBranchMaxRetryDelay = Duration.parse(setDefaultBranchMaxRetryDelay.toString());
  }

  public Duration getSetDefaultBranchInitialRpcTimeout() {
    return this.setDefaultBranchInitialRpcTimeout;
  }

  public void setSetDefaultBranchInitialRpcTimeout(
      java.time.Duration setDefaultBranchInitialRpcTimeout) {
    this.setDefaultBranchInitialRpcTimeout =
        Duration.parse(setDefaultBranchInitialRpcTimeout.toString());
  }

  public Double getSetDefaultBranchRpcTimeoutMultiplier() {
    return this.setDefaultBranchRpcTimeoutMultiplier;
  }

  public void setSetDefaultBranchRpcTimeoutMultiplier(Double setDefaultBranchRpcTimeoutMultiplier) {
    this.setDefaultBranchRpcTimeoutMultiplier = setDefaultBranchRpcTimeoutMultiplier;
  }

  public Duration getSetDefaultBranchMaxRpcTimeout() {
    return this.setDefaultBranchMaxRpcTimeout;
  }

  public void setSetDefaultBranchMaxRpcTimeout(java.time.Duration setDefaultBranchMaxRpcTimeout) {
    this.setDefaultBranchMaxRpcTimeout = Duration.parse(setDefaultBranchMaxRpcTimeout.toString());
  }

  public Duration getSetDefaultBranchTotalTimeout() {
    return this.setDefaultBranchTotalTimeout;
  }

  public void setSetDefaultBranchTotalTimeout(java.time.Duration setDefaultBranchTotalTimeout) {
    this.setDefaultBranchTotalTimeout = Duration.parse(setDefaultBranchTotalTimeout.toString());
  }

  public Duration getGetDefaultBranchInitialRetryDelay() {
    return this.getDefaultBranchInitialRetryDelay;
  }

  public void setGetDefaultBranchInitialRetryDelay(
      java.time.Duration getDefaultBranchInitialRetryDelay) {
    this.getDefaultBranchInitialRetryDelay =
        Duration.parse(getDefaultBranchInitialRetryDelay.toString());
  }

  public Double getGetDefaultBranchRetryDelayMultiplier() {
    return this.getDefaultBranchRetryDelayMultiplier;
  }

  public void setGetDefaultBranchRetryDelayMultiplier(Double getDefaultBranchRetryDelayMultiplier) {
    this.getDefaultBranchRetryDelayMultiplier = getDefaultBranchRetryDelayMultiplier;
  }

  public Duration getGetDefaultBranchMaxRetryDelay() {
    return this.getDefaultBranchMaxRetryDelay;
  }

  public void setGetDefaultBranchMaxRetryDelay(java.time.Duration getDefaultBranchMaxRetryDelay) {
    this.getDefaultBranchMaxRetryDelay = Duration.parse(getDefaultBranchMaxRetryDelay.toString());
  }

  public Duration getGetDefaultBranchInitialRpcTimeout() {
    return this.getDefaultBranchInitialRpcTimeout;
  }

  public void setGetDefaultBranchInitialRpcTimeout(
      java.time.Duration getDefaultBranchInitialRpcTimeout) {
    this.getDefaultBranchInitialRpcTimeout =
        Duration.parse(getDefaultBranchInitialRpcTimeout.toString());
  }

  public Double getGetDefaultBranchRpcTimeoutMultiplier() {
    return this.getDefaultBranchRpcTimeoutMultiplier;
  }

  public void setGetDefaultBranchRpcTimeoutMultiplier(Double getDefaultBranchRpcTimeoutMultiplier) {
    this.getDefaultBranchRpcTimeoutMultiplier = getDefaultBranchRpcTimeoutMultiplier;
  }

  public Duration getGetDefaultBranchMaxRpcTimeout() {
    return this.getDefaultBranchMaxRpcTimeout;
  }

  public void setGetDefaultBranchMaxRpcTimeout(java.time.Duration getDefaultBranchMaxRpcTimeout) {
    this.getDefaultBranchMaxRpcTimeout = Duration.parse(getDefaultBranchMaxRpcTimeout.toString());
  }

  public Duration getGetDefaultBranchTotalTimeout() {
    return this.getDefaultBranchTotalTimeout;
  }

  public void setGetDefaultBranchTotalTimeout(java.time.Duration getDefaultBranchTotalTimeout) {
    this.getDefaultBranchTotalTimeout = Duration.parse(getDefaultBranchTotalTimeout.toString());
  }

  public Duration getGetCompletionConfigInitialRetryDelay() {
    return this.getCompletionConfigInitialRetryDelay;
  }

  public void setGetCompletionConfigInitialRetryDelay(
      java.time.Duration getCompletionConfigInitialRetryDelay) {
    this.getCompletionConfigInitialRetryDelay =
        Duration.parse(getCompletionConfigInitialRetryDelay.toString());
  }

  public Double getGetCompletionConfigRetryDelayMultiplier() {
    return this.getCompletionConfigRetryDelayMultiplier;
  }

  public void setGetCompletionConfigRetryDelayMultiplier(
      Double getCompletionConfigRetryDelayMultiplier) {
    this.getCompletionConfigRetryDelayMultiplier = getCompletionConfigRetryDelayMultiplier;
  }

  public Duration getGetCompletionConfigMaxRetryDelay() {
    return this.getCompletionConfigMaxRetryDelay;
  }

  public void setGetCompletionConfigMaxRetryDelay(
      java.time.Duration getCompletionConfigMaxRetryDelay) {
    this.getCompletionConfigMaxRetryDelay =
        Duration.parse(getCompletionConfigMaxRetryDelay.toString());
  }

  public Duration getGetCompletionConfigInitialRpcTimeout() {
    return this.getCompletionConfigInitialRpcTimeout;
  }

  public void setGetCompletionConfigInitialRpcTimeout(
      java.time.Duration getCompletionConfigInitialRpcTimeout) {
    this.getCompletionConfigInitialRpcTimeout =
        Duration.parse(getCompletionConfigInitialRpcTimeout.toString());
  }

  public Double getGetCompletionConfigRpcTimeoutMultiplier() {
    return this.getCompletionConfigRpcTimeoutMultiplier;
  }

  public void setGetCompletionConfigRpcTimeoutMultiplier(
      Double getCompletionConfigRpcTimeoutMultiplier) {
    this.getCompletionConfigRpcTimeoutMultiplier = getCompletionConfigRpcTimeoutMultiplier;
  }

  public Duration getGetCompletionConfigMaxRpcTimeout() {
    return this.getCompletionConfigMaxRpcTimeout;
  }

  public void setGetCompletionConfigMaxRpcTimeout(
      java.time.Duration getCompletionConfigMaxRpcTimeout) {
    this.getCompletionConfigMaxRpcTimeout =
        Duration.parse(getCompletionConfigMaxRpcTimeout.toString());
  }

  public Duration getGetCompletionConfigTotalTimeout() {
    return this.getCompletionConfigTotalTimeout;
  }

  public void setGetCompletionConfigTotalTimeout(
      java.time.Duration getCompletionConfigTotalTimeout) {
    this.getCompletionConfigTotalTimeout =
        Duration.parse(getCompletionConfigTotalTimeout.toString());
  }

  public Duration getUpdateCompletionConfigInitialRetryDelay() {
    return this.updateCompletionConfigInitialRetryDelay;
  }

  public void setUpdateCompletionConfigInitialRetryDelay(
      java.time.Duration updateCompletionConfigInitialRetryDelay) {
    this.updateCompletionConfigInitialRetryDelay =
        Duration.parse(updateCompletionConfigInitialRetryDelay.toString());
  }

  public Double getUpdateCompletionConfigRetryDelayMultiplier() {
    return this.updateCompletionConfigRetryDelayMultiplier;
  }

  public void setUpdateCompletionConfigRetryDelayMultiplier(
      Double updateCompletionConfigRetryDelayMultiplier) {
    this.updateCompletionConfigRetryDelayMultiplier = updateCompletionConfigRetryDelayMultiplier;
  }

  public Duration getUpdateCompletionConfigMaxRetryDelay() {
    return this.updateCompletionConfigMaxRetryDelay;
  }

  public void setUpdateCompletionConfigMaxRetryDelay(
      java.time.Duration updateCompletionConfigMaxRetryDelay) {
    this.updateCompletionConfigMaxRetryDelay =
        Duration.parse(updateCompletionConfigMaxRetryDelay.toString());
  }

  public Duration getUpdateCompletionConfigInitialRpcTimeout() {
    return this.updateCompletionConfigInitialRpcTimeout;
  }

  public void setUpdateCompletionConfigInitialRpcTimeout(
      java.time.Duration updateCompletionConfigInitialRpcTimeout) {
    this.updateCompletionConfigInitialRpcTimeout =
        Duration.parse(updateCompletionConfigInitialRpcTimeout.toString());
  }

  public Double getUpdateCompletionConfigRpcTimeoutMultiplier() {
    return this.updateCompletionConfigRpcTimeoutMultiplier;
  }

  public void setUpdateCompletionConfigRpcTimeoutMultiplier(
      Double updateCompletionConfigRpcTimeoutMultiplier) {
    this.updateCompletionConfigRpcTimeoutMultiplier = updateCompletionConfigRpcTimeoutMultiplier;
  }

  public Duration getUpdateCompletionConfigMaxRpcTimeout() {
    return this.updateCompletionConfigMaxRpcTimeout;
  }

  public void setUpdateCompletionConfigMaxRpcTimeout(
      java.time.Duration updateCompletionConfigMaxRpcTimeout) {
    this.updateCompletionConfigMaxRpcTimeout =
        Duration.parse(updateCompletionConfigMaxRpcTimeout.toString());
  }

  public Duration getUpdateCompletionConfigTotalTimeout() {
    return this.updateCompletionConfigTotalTimeout;
  }

  public void setUpdateCompletionConfigTotalTimeout(
      java.time.Duration updateCompletionConfigTotalTimeout) {
    this.updateCompletionConfigTotalTimeout =
        Duration.parse(updateCompletionConfigTotalTimeout.toString());
  }

  public Duration getGetAttributesConfigInitialRetryDelay() {
    return this.getAttributesConfigInitialRetryDelay;
  }

  public void setGetAttributesConfigInitialRetryDelay(
      java.time.Duration getAttributesConfigInitialRetryDelay) {
    this.getAttributesConfigInitialRetryDelay =
        Duration.parse(getAttributesConfigInitialRetryDelay.toString());
  }

  public Double getGetAttributesConfigRetryDelayMultiplier() {
    return this.getAttributesConfigRetryDelayMultiplier;
  }

  public void setGetAttributesConfigRetryDelayMultiplier(
      Double getAttributesConfigRetryDelayMultiplier) {
    this.getAttributesConfigRetryDelayMultiplier = getAttributesConfigRetryDelayMultiplier;
  }

  public Duration getGetAttributesConfigMaxRetryDelay() {
    return this.getAttributesConfigMaxRetryDelay;
  }

  public void setGetAttributesConfigMaxRetryDelay(
      java.time.Duration getAttributesConfigMaxRetryDelay) {
    this.getAttributesConfigMaxRetryDelay =
        Duration.parse(getAttributesConfigMaxRetryDelay.toString());
  }

  public Duration getGetAttributesConfigInitialRpcTimeout() {
    return this.getAttributesConfigInitialRpcTimeout;
  }

  public void setGetAttributesConfigInitialRpcTimeout(
      java.time.Duration getAttributesConfigInitialRpcTimeout) {
    this.getAttributesConfigInitialRpcTimeout =
        Duration.parse(getAttributesConfigInitialRpcTimeout.toString());
  }

  public Double getGetAttributesConfigRpcTimeoutMultiplier() {
    return this.getAttributesConfigRpcTimeoutMultiplier;
  }

  public void setGetAttributesConfigRpcTimeoutMultiplier(
      Double getAttributesConfigRpcTimeoutMultiplier) {
    this.getAttributesConfigRpcTimeoutMultiplier = getAttributesConfigRpcTimeoutMultiplier;
  }

  public Duration getGetAttributesConfigMaxRpcTimeout() {
    return this.getAttributesConfigMaxRpcTimeout;
  }

  public void setGetAttributesConfigMaxRpcTimeout(
      java.time.Duration getAttributesConfigMaxRpcTimeout) {
    this.getAttributesConfigMaxRpcTimeout =
        Duration.parse(getAttributesConfigMaxRpcTimeout.toString());
  }

  public Duration getGetAttributesConfigTotalTimeout() {
    return this.getAttributesConfigTotalTimeout;
  }

  public void setGetAttributesConfigTotalTimeout(
      java.time.Duration getAttributesConfigTotalTimeout) {
    this.getAttributesConfigTotalTimeout =
        Duration.parse(getAttributesConfigTotalTimeout.toString());
  }

  public Duration getUpdateAttributesConfigInitialRetryDelay() {
    return this.updateAttributesConfigInitialRetryDelay;
  }

  public void setUpdateAttributesConfigInitialRetryDelay(
      java.time.Duration updateAttributesConfigInitialRetryDelay) {
    this.updateAttributesConfigInitialRetryDelay =
        Duration.parse(updateAttributesConfigInitialRetryDelay.toString());
  }

  public Double getUpdateAttributesConfigRetryDelayMultiplier() {
    return this.updateAttributesConfigRetryDelayMultiplier;
  }

  public void setUpdateAttributesConfigRetryDelayMultiplier(
      Double updateAttributesConfigRetryDelayMultiplier) {
    this.updateAttributesConfigRetryDelayMultiplier = updateAttributesConfigRetryDelayMultiplier;
  }

  public Duration getUpdateAttributesConfigMaxRetryDelay() {
    return this.updateAttributesConfigMaxRetryDelay;
  }

  public void setUpdateAttributesConfigMaxRetryDelay(
      java.time.Duration updateAttributesConfigMaxRetryDelay) {
    this.updateAttributesConfigMaxRetryDelay =
        Duration.parse(updateAttributesConfigMaxRetryDelay.toString());
  }

  public Duration getUpdateAttributesConfigInitialRpcTimeout() {
    return this.updateAttributesConfigInitialRpcTimeout;
  }

  public void setUpdateAttributesConfigInitialRpcTimeout(
      java.time.Duration updateAttributesConfigInitialRpcTimeout) {
    this.updateAttributesConfigInitialRpcTimeout =
        Duration.parse(updateAttributesConfigInitialRpcTimeout.toString());
  }

  public Double getUpdateAttributesConfigRpcTimeoutMultiplier() {
    return this.updateAttributesConfigRpcTimeoutMultiplier;
  }

  public void setUpdateAttributesConfigRpcTimeoutMultiplier(
      Double updateAttributesConfigRpcTimeoutMultiplier) {
    this.updateAttributesConfigRpcTimeoutMultiplier = updateAttributesConfigRpcTimeoutMultiplier;
  }

  public Duration getUpdateAttributesConfigMaxRpcTimeout() {
    return this.updateAttributesConfigMaxRpcTimeout;
  }

  public void setUpdateAttributesConfigMaxRpcTimeout(
      java.time.Duration updateAttributesConfigMaxRpcTimeout) {
    this.updateAttributesConfigMaxRpcTimeout =
        Duration.parse(updateAttributesConfigMaxRpcTimeout.toString());
  }

  public Duration getUpdateAttributesConfigTotalTimeout() {
    return this.updateAttributesConfigTotalTimeout;
  }

  public void setUpdateAttributesConfigTotalTimeout(
      java.time.Duration updateAttributesConfigTotalTimeout) {
    this.updateAttributesConfigTotalTimeout =
        Duration.parse(updateAttributesConfigTotalTimeout.toString());
  }

  public Duration getAddCatalogAttributeInitialRetryDelay() {
    return this.addCatalogAttributeInitialRetryDelay;
  }

  public void setAddCatalogAttributeInitialRetryDelay(
      java.time.Duration addCatalogAttributeInitialRetryDelay) {
    this.addCatalogAttributeInitialRetryDelay =
        Duration.parse(addCatalogAttributeInitialRetryDelay.toString());
  }

  public Double getAddCatalogAttributeRetryDelayMultiplier() {
    return this.addCatalogAttributeRetryDelayMultiplier;
  }

  public void setAddCatalogAttributeRetryDelayMultiplier(
      Double addCatalogAttributeRetryDelayMultiplier) {
    this.addCatalogAttributeRetryDelayMultiplier = addCatalogAttributeRetryDelayMultiplier;
  }

  public Duration getAddCatalogAttributeMaxRetryDelay() {
    return this.addCatalogAttributeMaxRetryDelay;
  }

  public void setAddCatalogAttributeMaxRetryDelay(
      java.time.Duration addCatalogAttributeMaxRetryDelay) {
    this.addCatalogAttributeMaxRetryDelay =
        Duration.parse(addCatalogAttributeMaxRetryDelay.toString());
  }

  public Duration getAddCatalogAttributeInitialRpcTimeout() {
    return this.addCatalogAttributeInitialRpcTimeout;
  }

  public void setAddCatalogAttributeInitialRpcTimeout(
      java.time.Duration addCatalogAttributeInitialRpcTimeout) {
    this.addCatalogAttributeInitialRpcTimeout =
        Duration.parse(addCatalogAttributeInitialRpcTimeout.toString());
  }

  public Double getAddCatalogAttributeRpcTimeoutMultiplier() {
    return this.addCatalogAttributeRpcTimeoutMultiplier;
  }

  public void setAddCatalogAttributeRpcTimeoutMultiplier(
      Double addCatalogAttributeRpcTimeoutMultiplier) {
    this.addCatalogAttributeRpcTimeoutMultiplier = addCatalogAttributeRpcTimeoutMultiplier;
  }

  public Duration getAddCatalogAttributeMaxRpcTimeout() {
    return this.addCatalogAttributeMaxRpcTimeout;
  }

  public void setAddCatalogAttributeMaxRpcTimeout(
      java.time.Duration addCatalogAttributeMaxRpcTimeout) {
    this.addCatalogAttributeMaxRpcTimeout =
        Duration.parse(addCatalogAttributeMaxRpcTimeout.toString());
  }

  public Duration getAddCatalogAttributeTotalTimeout() {
    return this.addCatalogAttributeTotalTimeout;
  }

  public void setAddCatalogAttributeTotalTimeout(
      java.time.Duration addCatalogAttributeTotalTimeout) {
    this.addCatalogAttributeTotalTimeout =
        Duration.parse(addCatalogAttributeTotalTimeout.toString());
  }

  public Duration getRemoveCatalogAttributeInitialRetryDelay() {
    return this.removeCatalogAttributeInitialRetryDelay;
  }

  public void setRemoveCatalogAttributeInitialRetryDelay(
      java.time.Duration removeCatalogAttributeInitialRetryDelay) {
    this.removeCatalogAttributeInitialRetryDelay =
        Duration.parse(removeCatalogAttributeInitialRetryDelay.toString());
  }

  public Double getRemoveCatalogAttributeRetryDelayMultiplier() {
    return this.removeCatalogAttributeRetryDelayMultiplier;
  }

  public void setRemoveCatalogAttributeRetryDelayMultiplier(
      Double removeCatalogAttributeRetryDelayMultiplier) {
    this.removeCatalogAttributeRetryDelayMultiplier = removeCatalogAttributeRetryDelayMultiplier;
  }

  public Duration getRemoveCatalogAttributeMaxRetryDelay() {
    return this.removeCatalogAttributeMaxRetryDelay;
  }

  public void setRemoveCatalogAttributeMaxRetryDelay(
      java.time.Duration removeCatalogAttributeMaxRetryDelay) {
    this.removeCatalogAttributeMaxRetryDelay =
        Duration.parse(removeCatalogAttributeMaxRetryDelay.toString());
  }

  public Duration getRemoveCatalogAttributeInitialRpcTimeout() {
    return this.removeCatalogAttributeInitialRpcTimeout;
  }

  public void setRemoveCatalogAttributeInitialRpcTimeout(
      java.time.Duration removeCatalogAttributeInitialRpcTimeout) {
    this.removeCatalogAttributeInitialRpcTimeout =
        Duration.parse(removeCatalogAttributeInitialRpcTimeout.toString());
  }

  public Double getRemoveCatalogAttributeRpcTimeoutMultiplier() {
    return this.removeCatalogAttributeRpcTimeoutMultiplier;
  }

  public void setRemoveCatalogAttributeRpcTimeoutMultiplier(
      Double removeCatalogAttributeRpcTimeoutMultiplier) {
    this.removeCatalogAttributeRpcTimeoutMultiplier = removeCatalogAttributeRpcTimeoutMultiplier;
  }

  public Duration getRemoveCatalogAttributeMaxRpcTimeout() {
    return this.removeCatalogAttributeMaxRpcTimeout;
  }

  public void setRemoveCatalogAttributeMaxRpcTimeout(
      java.time.Duration removeCatalogAttributeMaxRpcTimeout) {
    this.removeCatalogAttributeMaxRpcTimeout =
        Duration.parse(removeCatalogAttributeMaxRpcTimeout.toString());
  }

  public Duration getRemoveCatalogAttributeTotalTimeout() {
    return this.removeCatalogAttributeTotalTimeout;
  }

  public void setRemoveCatalogAttributeTotalTimeout(
      java.time.Duration removeCatalogAttributeTotalTimeout) {
    this.removeCatalogAttributeTotalTimeout =
        Duration.parse(removeCatalogAttributeTotalTimeout.toString());
  }

  public Duration getReplaceCatalogAttributeInitialRetryDelay() {
    return this.replaceCatalogAttributeInitialRetryDelay;
  }

  public void setReplaceCatalogAttributeInitialRetryDelay(
      java.time.Duration replaceCatalogAttributeInitialRetryDelay) {
    this.replaceCatalogAttributeInitialRetryDelay =
        Duration.parse(replaceCatalogAttributeInitialRetryDelay.toString());
  }

  public Double getReplaceCatalogAttributeRetryDelayMultiplier() {
    return this.replaceCatalogAttributeRetryDelayMultiplier;
  }

  public void setReplaceCatalogAttributeRetryDelayMultiplier(
      Double replaceCatalogAttributeRetryDelayMultiplier) {
    this.replaceCatalogAttributeRetryDelayMultiplier = replaceCatalogAttributeRetryDelayMultiplier;
  }

  public Duration getReplaceCatalogAttributeMaxRetryDelay() {
    return this.replaceCatalogAttributeMaxRetryDelay;
  }

  public void setReplaceCatalogAttributeMaxRetryDelay(
      java.time.Duration replaceCatalogAttributeMaxRetryDelay) {
    this.replaceCatalogAttributeMaxRetryDelay =
        Duration.parse(replaceCatalogAttributeMaxRetryDelay.toString());
  }

  public Duration getReplaceCatalogAttributeInitialRpcTimeout() {
    return this.replaceCatalogAttributeInitialRpcTimeout;
  }

  public void setReplaceCatalogAttributeInitialRpcTimeout(
      java.time.Duration replaceCatalogAttributeInitialRpcTimeout) {
    this.replaceCatalogAttributeInitialRpcTimeout =
        Duration.parse(replaceCatalogAttributeInitialRpcTimeout.toString());
  }

  public Double getReplaceCatalogAttributeRpcTimeoutMultiplier() {
    return this.replaceCatalogAttributeRpcTimeoutMultiplier;
  }

  public void setReplaceCatalogAttributeRpcTimeoutMultiplier(
      Double replaceCatalogAttributeRpcTimeoutMultiplier) {
    this.replaceCatalogAttributeRpcTimeoutMultiplier = replaceCatalogAttributeRpcTimeoutMultiplier;
  }

  public Duration getReplaceCatalogAttributeMaxRpcTimeout() {
    return this.replaceCatalogAttributeMaxRpcTimeout;
  }

  public void setReplaceCatalogAttributeMaxRpcTimeout(
      java.time.Duration replaceCatalogAttributeMaxRpcTimeout) {
    this.replaceCatalogAttributeMaxRpcTimeout =
        Duration.parse(replaceCatalogAttributeMaxRpcTimeout.toString());
  }

  public Duration getReplaceCatalogAttributeTotalTimeout() {
    return this.replaceCatalogAttributeTotalTimeout;
  }

  public void setReplaceCatalogAttributeTotalTimeout(
      java.time.Duration replaceCatalogAttributeTotalTimeout) {
    this.replaceCatalogAttributeTotalTimeout =
        Duration.parse(replaceCatalogAttributeTotalTimeout.toString());
  }
}
