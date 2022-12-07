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
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for PolicyTagManager client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.datacatalog.v1.spring.auto.policy-tag-manager")
public class PolicyTagManagerSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials("https://www.googleapis.com/auth/cloud-platform");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  private Duration createTaxonomyInitialRpcTimeout;
  private Double createTaxonomyRpcTimeoutMultiplier;
  private Duration createTaxonomyMaxRpcTimeout;
  private Duration createTaxonomyTotalTimeout;
  private Duration deleteTaxonomyInitialRpcTimeout;
  private Double deleteTaxonomyRpcTimeoutMultiplier;
  private Duration deleteTaxonomyMaxRpcTimeout;
  private Duration deleteTaxonomyTotalTimeout;
  private Duration updateTaxonomyInitialRpcTimeout;
  private Double updateTaxonomyRpcTimeoutMultiplier;
  private Duration updateTaxonomyMaxRpcTimeout;
  private Duration updateTaxonomyTotalTimeout;
  private Duration listTaxonomiesInitialRpcTimeout;
  private Double listTaxonomiesRpcTimeoutMultiplier;
  private Duration listTaxonomiesMaxRpcTimeout;
  private Duration listTaxonomiesTotalTimeout;
  private Duration getTaxonomyInitialRpcTimeout;
  private Double getTaxonomyRpcTimeoutMultiplier;
  private Duration getTaxonomyMaxRpcTimeout;
  private Duration getTaxonomyTotalTimeout;
  private Duration createPolicyTagInitialRpcTimeout;
  private Double createPolicyTagRpcTimeoutMultiplier;
  private Duration createPolicyTagMaxRpcTimeout;
  private Duration createPolicyTagTotalTimeout;
  private Duration deletePolicyTagInitialRpcTimeout;
  private Double deletePolicyTagRpcTimeoutMultiplier;
  private Duration deletePolicyTagMaxRpcTimeout;
  private Duration deletePolicyTagTotalTimeout;
  private Duration updatePolicyTagInitialRpcTimeout;
  private Double updatePolicyTagRpcTimeoutMultiplier;
  private Duration updatePolicyTagMaxRpcTimeout;
  private Duration updatePolicyTagTotalTimeout;
  private Duration listPolicyTagsInitialRpcTimeout;
  private Double listPolicyTagsRpcTimeoutMultiplier;
  private Duration listPolicyTagsMaxRpcTimeout;
  private Duration listPolicyTagsTotalTimeout;
  private Duration getPolicyTagInitialRpcTimeout;
  private Double getPolicyTagRpcTimeoutMultiplier;
  private Duration getPolicyTagMaxRpcTimeout;
  private Duration getPolicyTagTotalTimeout;
  private Duration getIamPolicyInitialRpcTimeout;
  private Double getIamPolicyRpcTimeoutMultiplier;
  private Duration getIamPolicyMaxRpcTimeout;
  private Duration getIamPolicyTotalTimeout;
  private Duration setIamPolicyInitialRpcTimeout;
  private Double setIamPolicyRpcTimeoutMultiplier;
  private Duration setIamPolicyMaxRpcTimeout;
  private Duration setIamPolicyTotalTimeout;
  private Duration testIamPermissionsInitialRpcTimeout;
  private Double testIamPermissionsRpcTimeoutMultiplier;
  private Duration testIamPermissionsMaxRpcTimeout;
  private Duration testIamPermissionsTotalTimeout;

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

  public Duration getCreateTaxonomyInitialRpcTimeout() {
    return this.createTaxonomyInitialRpcTimeout;
  }

  public void setCreateTaxonomyInitialRpcTimeout(
      java.time.Duration createTaxonomyInitialRpcTimeout) {
    this.createTaxonomyInitialRpcTimeout =
        Duration.parse(createTaxonomyInitialRpcTimeout.toString());
  }

  public Double getCreateTaxonomyRpcTimeoutMultiplier() {
    return this.createTaxonomyRpcTimeoutMultiplier;
  }

  public void setCreateTaxonomyRpcTimeoutMultiplier(Double createTaxonomyRpcTimeoutMultiplier) {
    this.createTaxonomyRpcTimeoutMultiplier = createTaxonomyRpcTimeoutMultiplier;
  }

  public Duration getCreateTaxonomyMaxRpcTimeout() {
    return this.createTaxonomyMaxRpcTimeout;
  }

  public void setCreateTaxonomyMaxRpcTimeout(java.time.Duration createTaxonomyMaxRpcTimeout) {
    this.createTaxonomyMaxRpcTimeout = Duration.parse(createTaxonomyMaxRpcTimeout.toString());
  }

  public Duration getCreateTaxonomyTotalTimeout() {
    return this.createTaxonomyTotalTimeout;
  }

  public void setCreateTaxonomyTotalTimeout(java.time.Duration createTaxonomyTotalTimeout) {
    this.createTaxonomyTotalTimeout = Duration.parse(createTaxonomyTotalTimeout.toString());
  }

  public Duration getDeleteTaxonomyInitialRpcTimeout() {
    return this.deleteTaxonomyInitialRpcTimeout;
  }

  public void setDeleteTaxonomyInitialRpcTimeout(
      java.time.Duration deleteTaxonomyInitialRpcTimeout) {
    this.deleteTaxonomyInitialRpcTimeout =
        Duration.parse(deleteTaxonomyInitialRpcTimeout.toString());
  }

  public Double getDeleteTaxonomyRpcTimeoutMultiplier() {
    return this.deleteTaxonomyRpcTimeoutMultiplier;
  }

  public void setDeleteTaxonomyRpcTimeoutMultiplier(Double deleteTaxonomyRpcTimeoutMultiplier) {
    this.deleteTaxonomyRpcTimeoutMultiplier = deleteTaxonomyRpcTimeoutMultiplier;
  }

  public Duration getDeleteTaxonomyMaxRpcTimeout() {
    return this.deleteTaxonomyMaxRpcTimeout;
  }

  public void setDeleteTaxonomyMaxRpcTimeout(java.time.Duration deleteTaxonomyMaxRpcTimeout) {
    this.deleteTaxonomyMaxRpcTimeout = Duration.parse(deleteTaxonomyMaxRpcTimeout.toString());
  }

  public Duration getDeleteTaxonomyTotalTimeout() {
    return this.deleteTaxonomyTotalTimeout;
  }

  public void setDeleteTaxonomyTotalTimeout(java.time.Duration deleteTaxonomyTotalTimeout) {
    this.deleteTaxonomyTotalTimeout = Duration.parse(deleteTaxonomyTotalTimeout.toString());
  }

  public Duration getUpdateTaxonomyInitialRpcTimeout() {
    return this.updateTaxonomyInitialRpcTimeout;
  }

  public void setUpdateTaxonomyInitialRpcTimeout(
      java.time.Duration updateTaxonomyInitialRpcTimeout) {
    this.updateTaxonomyInitialRpcTimeout =
        Duration.parse(updateTaxonomyInitialRpcTimeout.toString());
  }

  public Double getUpdateTaxonomyRpcTimeoutMultiplier() {
    return this.updateTaxonomyRpcTimeoutMultiplier;
  }

  public void setUpdateTaxonomyRpcTimeoutMultiplier(Double updateTaxonomyRpcTimeoutMultiplier) {
    this.updateTaxonomyRpcTimeoutMultiplier = updateTaxonomyRpcTimeoutMultiplier;
  }

  public Duration getUpdateTaxonomyMaxRpcTimeout() {
    return this.updateTaxonomyMaxRpcTimeout;
  }

  public void setUpdateTaxonomyMaxRpcTimeout(java.time.Duration updateTaxonomyMaxRpcTimeout) {
    this.updateTaxonomyMaxRpcTimeout = Duration.parse(updateTaxonomyMaxRpcTimeout.toString());
  }

  public Duration getUpdateTaxonomyTotalTimeout() {
    return this.updateTaxonomyTotalTimeout;
  }

  public void setUpdateTaxonomyTotalTimeout(java.time.Duration updateTaxonomyTotalTimeout) {
    this.updateTaxonomyTotalTimeout = Duration.parse(updateTaxonomyTotalTimeout.toString());
  }

  public Duration getListTaxonomiesInitialRpcTimeout() {
    return this.listTaxonomiesInitialRpcTimeout;
  }

  public void setListTaxonomiesInitialRpcTimeout(
      java.time.Duration listTaxonomiesInitialRpcTimeout) {
    this.listTaxonomiesInitialRpcTimeout =
        Duration.parse(listTaxonomiesInitialRpcTimeout.toString());
  }

  public Double getListTaxonomiesRpcTimeoutMultiplier() {
    return this.listTaxonomiesRpcTimeoutMultiplier;
  }

  public void setListTaxonomiesRpcTimeoutMultiplier(Double listTaxonomiesRpcTimeoutMultiplier) {
    this.listTaxonomiesRpcTimeoutMultiplier = listTaxonomiesRpcTimeoutMultiplier;
  }

  public Duration getListTaxonomiesMaxRpcTimeout() {
    return this.listTaxonomiesMaxRpcTimeout;
  }

  public void setListTaxonomiesMaxRpcTimeout(java.time.Duration listTaxonomiesMaxRpcTimeout) {
    this.listTaxonomiesMaxRpcTimeout = Duration.parse(listTaxonomiesMaxRpcTimeout.toString());
  }

  public Duration getListTaxonomiesTotalTimeout() {
    return this.listTaxonomiesTotalTimeout;
  }

  public void setListTaxonomiesTotalTimeout(java.time.Duration listTaxonomiesTotalTimeout) {
    this.listTaxonomiesTotalTimeout = Duration.parse(listTaxonomiesTotalTimeout.toString());
  }

  public Duration getGetTaxonomyInitialRpcTimeout() {
    return this.getTaxonomyInitialRpcTimeout;
  }

  public void setGetTaxonomyInitialRpcTimeout(java.time.Duration getTaxonomyInitialRpcTimeout) {
    this.getTaxonomyInitialRpcTimeout = Duration.parse(getTaxonomyInitialRpcTimeout.toString());
  }

  public Double getGetTaxonomyRpcTimeoutMultiplier() {
    return this.getTaxonomyRpcTimeoutMultiplier;
  }

  public void setGetTaxonomyRpcTimeoutMultiplier(Double getTaxonomyRpcTimeoutMultiplier) {
    this.getTaxonomyRpcTimeoutMultiplier = getTaxonomyRpcTimeoutMultiplier;
  }

  public Duration getGetTaxonomyMaxRpcTimeout() {
    return this.getTaxonomyMaxRpcTimeout;
  }

  public void setGetTaxonomyMaxRpcTimeout(java.time.Duration getTaxonomyMaxRpcTimeout) {
    this.getTaxonomyMaxRpcTimeout = Duration.parse(getTaxonomyMaxRpcTimeout.toString());
  }

  public Duration getGetTaxonomyTotalTimeout() {
    return this.getTaxonomyTotalTimeout;
  }

  public void setGetTaxonomyTotalTimeout(java.time.Duration getTaxonomyTotalTimeout) {
    this.getTaxonomyTotalTimeout = Duration.parse(getTaxonomyTotalTimeout.toString());
  }

  public Duration getCreatePolicyTagInitialRpcTimeout() {
    return this.createPolicyTagInitialRpcTimeout;
  }

  public void setCreatePolicyTagInitialRpcTimeout(
      java.time.Duration createPolicyTagInitialRpcTimeout) {
    this.createPolicyTagInitialRpcTimeout =
        Duration.parse(createPolicyTagInitialRpcTimeout.toString());
  }

  public Double getCreatePolicyTagRpcTimeoutMultiplier() {
    return this.createPolicyTagRpcTimeoutMultiplier;
  }

  public void setCreatePolicyTagRpcTimeoutMultiplier(Double createPolicyTagRpcTimeoutMultiplier) {
    this.createPolicyTagRpcTimeoutMultiplier = createPolicyTagRpcTimeoutMultiplier;
  }

  public Duration getCreatePolicyTagMaxRpcTimeout() {
    return this.createPolicyTagMaxRpcTimeout;
  }

  public void setCreatePolicyTagMaxRpcTimeout(java.time.Duration createPolicyTagMaxRpcTimeout) {
    this.createPolicyTagMaxRpcTimeout = Duration.parse(createPolicyTagMaxRpcTimeout.toString());
  }

  public Duration getCreatePolicyTagTotalTimeout() {
    return this.createPolicyTagTotalTimeout;
  }

  public void setCreatePolicyTagTotalTimeout(java.time.Duration createPolicyTagTotalTimeout) {
    this.createPolicyTagTotalTimeout = Duration.parse(createPolicyTagTotalTimeout.toString());
  }

  public Duration getDeletePolicyTagInitialRpcTimeout() {
    return this.deletePolicyTagInitialRpcTimeout;
  }

  public void setDeletePolicyTagInitialRpcTimeout(
      java.time.Duration deletePolicyTagInitialRpcTimeout) {
    this.deletePolicyTagInitialRpcTimeout =
        Duration.parse(deletePolicyTagInitialRpcTimeout.toString());
  }

  public Double getDeletePolicyTagRpcTimeoutMultiplier() {
    return this.deletePolicyTagRpcTimeoutMultiplier;
  }

  public void setDeletePolicyTagRpcTimeoutMultiplier(Double deletePolicyTagRpcTimeoutMultiplier) {
    this.deletePolicyTagRpcTimeoutMultiplier = deletePolicyTagRpcTimeoutMultiplier;
  }

  public Duration getDeletePolicyTagMaxRpcTimeout() {
    return this.deletePolicyTagMaxRpcTimeout;
  }

  public void setDeletePolicyTagMaxRpcTimeout(java.time.Duration deletePolicyTagMaxRpcTimeout) {
    this.deletePolicyTagMaxRpcTimeout = Duration.parse(deletePolicyTagMaxRpcTimeout.toString());
  }

  public Duration getDeletePolicyTagTotalTimeout() {
    return this.deletePolicyTagTotalTimeout;
  }

  public void setDeletePolicyTagTotalTimeout(java.time.Duration deletePolicyTagTotalTimeout) {
    this.deletePolicyTagTotalTimeout = Duration.parse(deletePolicyTagTotalTimeout.toString());
  }

  public Duration getUpdatePolicyTagInitialRpcTimeout() {
    return this.updatePolicyTagInitialRpcTimeout;
  }

  public void setUpdatePolicyTagInitialRpcTimeout(
      java.time.Duration updatePolicyTagInitialRpcTimeout) {
    this.updatePolicyTagInitialRpcTimeout =
        Duration.parse(updatePolicyTagInitialRpcTimeout.toString());
  }

  public Double getUpdatePolicyTagRpcTimeoutMultiplier() {
    return this.updatePolicyTagRpcTimeoutMultiplier;
  }

  public void setUpdatePolicyTagRpcTimeoutMultiplier(Double updatePolicyTagRpcTimeoutMultiplier) {
    this.updatePolicyTagRpcTimeoutMultiplier = updatePolicyTagRpcTimeoutMultiplier;
  }

  public Duration getUpdatePolicyTagMaxRpcTimeout() {
    return this.updatePolicyTagMaxRpcTimeout;
  }

  public void setUpdatePolicyTagMaxRpcTimeout(java.time.Duration updatePolicyTagMaxRpcTimeout) {
    this.updatePolicyTagMaxRpcTimeout = Duration.parse(updatePolicyTagMaxRpcTimeout.toString());
  }

  public Duration getUpdatePolicyTagTotalTimeout() {
    return this.updatePolicyTagTotalTimeout;
  }

  public void setUpdatePolicyTagTotalTimeout(java.time.Duration updatePolicyTagTotalTimeout) {
    this.updatePolicyTagTotalTimeout = Duration.parse(updatePolicyTagTotalTimeout.toString());
  }

  public Duration getListPolicyTagsInitialRpcTimeout() {
    return this.listPolicyTagsInitialRpcTimeout;
  }

  public void setListPolicyTagsInitialRpcTimeout(
      java.time.Duration listPolicyTagsInitialRpcTimeout) {
    this.listPolicyTagsInitialRpcTimeout =
        Duration.parse(listPolicyTagsInitialRpcTimeout.toString());
  }

  public Double getListPolicyTagsRpcTimeoutMultiplier() {
    return this.listPolicyTagsRpcTimeoutMultiplier;
  }

  public void setListPolicyTagsRpcTimeoutMultiplier(Double listPolicyTagsRpcTimeoutMultiplier) {
    this.listPolicyTagsRpcTimeoutMultiplier = listPolicyTagsRpcTimeoutMultiplier;
  }

  public Duration getListPolicyTagsMaxRpcTimeout() {
    return this.listPolicyTagsMaxRpcTimeout;
  }

  public void setListPolicyTagsMaxRpcTimeout(java.time.Duration listPolicyTagsMaxRpcTimeout) {
    this.listPolicyTagsMaxRpcTimeout = Duration.parse(listPolicyTagsMaxRpcTimeout.toString());
  }

  public Duration getListPolicyTagsTotalTimeout() {
    return this.listPolicyTagsTotalTimeout;
  }

  public void setListPolicyTagsTotalTimeout(java.time.Duration listPolicyTagsTotalTimeout) {
    this.listPolicyTagsTotalTimeout = Duration.parse(listPolicyTagsTotalTimeout.toString());
  }

  public Duration getGetPolicyTagInitialRpcTimeout() {
    return this.getPolicyTagInitialRpcTimeout;
  }

  public void setGetPolicyTagInitialRpcTimeout(java.time.Duration getPolicyTagInitialRpcTimeout) {
    this.getPolicyTagInitialRpcTimeout = Duration.parse(getPolicyTagInitialRpcTimeout.toString());
  }

  public Double getGetPolicyTagRpcTimeoutMultiplier() {
    return this.getPolicyTagRpcTimeoutMultiplier;
  }

  public void setGetPolicyTagRpcTimeoutMultiplier(Double getPolicyTagRpcTimeoutMultiplier) {
    this.getPolicyTagRpcTimeoutMultiplier = getPolicyTagRpcTimeoutMultiplier;
  }

  public Duration getGetPolicyTagMaxRpcTimeout() {
    return this.getPolicyTagMaxRpcTimeout;
  }

  public void setGetPolicyTagMaxRpcTimeout(java.time.Duration getPolicyTagMaxRpcTimeout) {
    this.getPolicyTagMaxRpcTimeout = Duration.parse(getPolicyTagMaxRpcTimeout.toString());
  }

  public Duration getGetPolicyTagTotalTimeout() {
    return this.getPolicyTagTotalTimeout;
  }

  public void setGetPolicyTagTotalTimeout(java.time.Duration getPolicyTagTotalTimeout) {
    this.getPolicyTagTotalTimeout = Duration.parse(getPolicyTagTotalTimeout.toString());
  }

  public Duration getGetIamPolicyInitialRpcTimeout() {
    return this.getIamPolicyInitialRpcTimeout;
  }

  public void setGetIamPolicyInitialRpcTimeout(java.time.Duration getIamPolicyInitialRpcTimeout) {
    this.getIamPolicyInitialRpcTimeout = Duration.parse(getIamPolicyInitialRpcTimeout.toString());
  }

  public Double getGetIamPolicyRpcTimeoutMultiplier() {
    return this.getIamPolicyRpcTimeoutMultiplier;
  }

  public void setGetIamPolicyRpcTimeoutMultiplier(Double getIamPolicyRpcTimeoutMultiplier) {
    this.getIamPolicyRpcTimeoutMultiplier = getIamPolicyRpcTimeoutMultiplier;
  }

  public Duration getGetIamPolicyMaxRpcTimeout() {
    return this.getIamPolicyMaxRpcTimeout;
  }

  public void setGetIamPolicyMaxRpcTimeout(java.time.Duration getIamPolicyMaxRpcTimeout) {
    this.getIamPolicyMaxRpcTimeout = Duration.parse(getIamPolicyMaxRpcTimeout.toString());
  }

  public Duration getGetIamPolicyTotalTimeout() {
    return this.getIamPolicyTotalTimeout;
  }

  public void setGetIamPolicyTotalTimeout(java.time.Duration getIamPolicyTotalTimeout) {
    this.getIamPolicyTotalTimeout = Duration.parse(getIamPolicyTotalTimeout.toString());
  }

  public Duration getSetIamPolicyInitialRpcTimeout() {
    return this.setIamPolicyInitialRpcTimeout;
  }

  public void setSetIamPolicyInitialRpcTimeout(java.time.Duration setIamPolicyInitialRpcTimeout) {
    this.setIamPolicyInitialRpcTimeout = Duration.parse(setIamPolicyInitialRpcTimeout.toString());
  }

  public Double getSetIamPolicyRpcTimeoutMultiplier() {
    return this.setIamPolicyRpcTimeoutMultiplier;
  }

  public void setSetIamPolicyRpcTimeoutMultiplier(Double setIamPolicyRpcTimeoutMultiplier) {
    this.setIamPolicyRpcTimeoutMultiplier = setIamPolicyRpcTimeoutMultiplier;
  }

  public Duration getSetIamPolicyMaxRpcTimeout() {
    return this.setIamPolicyMaxRpcTimeout;
  }

  public void setSetIamPolicyMaxRpcTimeout(java.time.Duration setIamPolicyMaxRpcTimeout) {
    this.setIamPolicyMaxRpcTimeout = Duration.parse(setIamPolicyMaxRpcTimeout.toString());
  }

  public Duration getSetIamPolicyTotalTimeout() {
    return this.setIamPolicyTotalTimeout;
  }

  public void setSetIamPolicyTotalTimeout(java.time.Duration setIamPolicyTotalTimeout) {
    this.setIamPolicyTotalTimeout = Duration.parse(setIamPolicyTotalTimeout.toString());
  }

  public Duration getTestIamPermissionsInitialRpcTimeout() {
    return this.testIamPermissionsInitialRpcTimeout;
  }

  public void setTestIamPermissionsInitialRpcTimeout(
      java.time.Duration testIamPermissionsInitialRpcTimeout) {
    this.testIamPermissionsInitialRpcTimeout =
        Duration.parse(testIamPermissionsInitialRpcTimeout.toString());
  }

  public Double getTestIamPermissionsRpcTimeoutMultiplier() {
    return this.testIamPermissionsRpcTimeoutMultiplier;
  }

  public void setTestIamPermissionsRpcTimeoutMultiplier(
      Double testIamPermissionsRpcTimeoutMultiplier) {
    this.testIamPermissionsRpcTimeoutMultiplier = testIamPermissionsRpcTimeoutMultiplier;
  }

  public Duration getTestIamPermissionsMaxRpcTimeout() {
    return this.testIamPermissionsMaxRpcTimeout;
  }

  public void setTestIamPermissionsMaxRpcTimeout(
      java.time.Duration testIamPermissionsMaxRpcTimeout) {
    this.testIamPermissionsMaxRpcTimeout =
        Duration.parse(testIamPermissionsMaxRpcTimeout.toString());
  }

  public Duration getTestIamPermissionsTotalTimeout() {
    return this.testIamPermissionsTotalTimeout;
  }

  public void setTestIamPermissionsTotalTimeout(java.time.Duration testIamPermissionsTotalTimeout) {
    this.testIamPermissionsTotalTimeout = Duration.parse(testIamPermissionsTotalTimeout.toString());
  }
}
