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

package com.google.appengine.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for AuthorizedCertificates client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.appengine.v1.spring.auto.authorized-certificates")
public class AuthorizedCertificatesSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/appengine.admin",
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/cloud-platform.read-only");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  private Duration listAuthorizedCertificatesInitialRpcTimeout;
  private Double listAuthorizedCertificatesRpcTimeoutMultiplier;
  private Duration listAuthorizedCertificatesMaxRpcTimeout;
  private Duration listAuthorizedCertificatesTotalTimeout;
  private Duration getAuthorizedCertificateInitialRpcTimeout;
  private Double getAuthorizedCertificateRpcTimeoutMultiplier;
  private Duration getAuthorizedCertificateMaxRpcTimeout;
  private Duration getAuthorizedCertificateTotalTimeout;
  private Duration createAuthorizedCertificateInitialRpcTimeout;
  private Double createAuthorizedCertificateRpcTimeoutMultiplier;
  private Duration createAuthorizedCertificateMaxRpcTimeout;
  private Duration createAuthorizedCertificateTotalTimeout;
  private Duration updateAuthorizedCertificateInitialRpcTimeout;
  private Double updateAuthorizedCertificateRpcTimeoutMultiplier;
  private Duration updateAuthorizedCertificateMaxRpcTimeout;
  private Duration updateAuthorizedCertificateTotalTimeout;
  private Duration deleteAuthorizedCertificateInitialRpcTimeout;
  private Double deleteAuthorizedCertificateRpcTimeoutMultiplier;
  private Duration deleteAuthorizedCertificateMaxRpcTimeout;
  private Duration deleteAuthorizedCertificateTotalTimeout;

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

  public Duration getListAuthorizedCertificatesInitialRpcTimeout() {
    return this.listAuthorizedCertificatesInitialRpcTimeout;
  }

  public void setListAuthorizedCertificatesInitialRpcTimeout(
      java.time.Duration listAuthorizedCertificatesInitialRpcTimeout) {
    this.listAuthorizedCertificatesInitialRpcTimeout =
        Duration.parse(listAuthorizedCertificatesInitialRpcTimeout.toString());
  }

  public Double getListAuthorizedCertificatesRpcTimeoutMultiplier() {
    return this.listAuthorizedCertificatesRpcTimeoutMultiplier;
  }

  public void setListAuthorizedCertificatesRpcTimeoutMultiplier(
      Double listAuthorizedCertificatesRpcTimeoutMultiplier) {
    this.listAuthorizedCertificatesRpcTimeoutMultiplier =
        listAuthorizedCertificatesRpcTimeoutMultiplier;
  }

  public Duration getListAuthorizedCertificatesMaxRpcTimeout() {
    return this.listAuthorizedCertificatesMaxRpcTimeout;
  }

  public void setListAuthorizedCertificatesMaxRpcTimeout(
      java.time.Duration listAuthorizedCertificatesMaxRpcTimeout) {
    this.listAuthorizedCertificatesMaxRpcTimeout =
        Duration.parse(listAuthorizedCertificatesMaxRpcTimeout.toString());
  }

  public Duration getListAuthorizedCertificatesTotalTimeout() {
    return this.listAuthorizedCertificatesTotalTimeout;
  }

  public void setListAuthorizedCertificatesTotalTimeout(
      java.time.Duration listAuthorizedCertificatesTotalTimeout) {
    this.listAuthorizedCertificatesTotalTimeout =
        Duration.parse(listAuthorizedCertificatesTotalTimeout.toString());
  }

  public Duration getGetAuthorizedCertificateInitialRpcTimeout() {
    return this.getAuthorizedCertificateInitialRpcTimeout;
  }

  public void setGetAuthorizedCertificateInitialRpcTimeout(
      java.time.Duration getAuthorizedCertificateInitialRpcTimeout) {
    this.getAuthorizedCertificateInitialRpcTimeout =
        Duration.parse(getAuthorizedCertificateInitialRpcTimeout.toString());
  }

  public Double getGetAuthorizedCertificateRpcTimeoutMultiplier() {
    return this.getAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public void setGetAuthorizedCertificateRpcTimeoutMultiplier(
      Double getAuthorizedCertificateRpcTimeoutMultiplier) {
    this.getAuthorizedCertificateRpcTimeoutMultiplier =
        getAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public Duration getGetAuthorizedCertificateMaxRpcTimeout() {
    return this.getAuthorizedCertificateMaxRpcTimeout;
  }

  public void setGetAuthorizedCertificateMaxRpcTimeout(
      java.time.Duration getAuthorizedCertificateMaxRpcTimeout) {
    this.getAuthorizedCertificateMaxRpcTimeout =
        Duration.parse(getAuthorizedCertificateMaxRpcTimeout.toString());
  }

  public Duration getGetAuthorizedCertificateTotalTimeout() {
    return this.getAuthorizedCertificateTotalTimeout;
  }

  public void setGetAuthorizedCertificateTotalTimeout(
      java.time.Duration getAuthorizedCertificateTotalTimeout) {
    this.getAuthorizedCertificateTotalTimeout =
        Duration.parse(getAuthorizedCertificateTotalTimeout.toString());
  }

  public Duration getCreateAuthorizedCertificateInitialRpcTimeout() {
    return this.createAuthorizedCertificateInitialRpcTimeout;
  }

  public void setCreateAuthorizedCertificateInitialRpcTimeout(
      java.time.Duration createAuthorizedCertificateInitialRpcTimeout) {
    this.createAuthorizedCertificateInitialRpcTimeout =
        Duration.parse(createAuthorizedCertificateInitialRpcTimeout.toString());
  }

  public Double getCreateAuthorizedCertificateRpcTimeoutMultiplier() {
    return this.createAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public void setCreateAuthorizedCertificateRpcTimeoutMultiplier(
      Double createAuthorizedCertificateRpcTimeoutMultiplier) {
    this.createAuthorizedCertificateRpcTimeoutMultiplier =
        createAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public Duration getCreateAuthorizedCertificateMaxRpcTimeout() {
    return this.createAuthorizedCertificateMaxRpcTimeout;
  }

  public void setCreateAuthorizedCertificateMaxRpcTimeout(
      java.time.Duration createAuthorizedCertificateMaxRpcTimeout) {
    this.createAuthorizedCertificateMaxRpcTimeout =
        Duration.parse(createAuthorizedCertificateMaxRpcTimeout.toString());
  }

  public Duration getCreateAuthorizedCertificateTotalTimeout() {
    return this.createAuthorizedCertificateTotalTimeout;
  }

  public void setCreateAuthorizedCertificateTotalTimeout(
      java.time.Duration createAuthorizedCertificateTotalTimeout) {
    this.createAuthorizedCertificateTotalTimeout =
        Duration.parse(createAuthorizedCertificateTotalTimeout.toString());
  }

  public Duration getUpdateAuthorizedCertificateInitialRpcTimeout() {
    return this.updateAuthorizedCertificateInitialRpcTimeout;
  }

  public void setUpdateAuthorizedCertificateInitialRpcTimeout(
      java.time.Duration updateAuthorizedCertificateInitialRpcTimeout) {
    this.updateAuthorizedCertificateInitialRpcTimeout =
        Duration.parse(updateAuthorizedCertificateInitialRpcTimeout.toString());
  }

  public Double getUpdateAuthorizedCertificateRpcTimeoutMultiplier() {
    return this.updateAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public void setUpdateAuthorizedCertificateRpcTimeoutMultiplier(
      Double updateAuthorizedCertificateRpcTimeoutMultiplier) {
    this.updateAuthorizedCertificateRpcTimeoutMultiplier =
        updateAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public Duration getUpdateAuthorizedCertificateMaxRpcTimeout() {
    return this.updateAuthorizedCertificateMaxRpcTimeout;
  }

  public void setUpdateAuthorizedCertificateMaxRpcTimeout(
      java.time.Duration updateAuthorizedCertificateMaxRpcTimeout) {
    this.updateAuthorizedCertificateMaxRpcTimeout =
        Duration.parse(updateAuthorizedCertificateMaxRpcTimeout.toString());
  }

  public Duration getUpdateAuthorizedCertificateTotalTimeout() {
    return this.updateAuthorizedCertificateTotalTimeout;
  }

  public void setUpdateAuthorizedCertificateTotalTimeout(
      java.time.Duration updateAuthorizedCertificateTotalTimeout) {
    this.updateAuthorizedCertificateTotalTimeout =
        Duration.parse(updateAuthorizedCertificateTotalTimeout.toString());
  }

  public Duration getDeleteAuthorizedCertificateInitialRpcTimeout() {
    return this.deleteAuthorizedCertificateInitialRpcTimeout;
  }

  public void setDeleteAuthorizedCertificateInitialRpcTimeout(
      java.time.Duration deleteAuthorizedCertificateInitialRpcTimeout) {
    this.deleteAuthorizedCertificateInitialRpcTimeout =
        Duration.parse(deleteAuthorizedCertificateInitialRpcTimeout.toString());
  }

  public Double getDeleteAuthorizedCertificateRpcTimeoutMultiplier() {
    return this.deleteAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public void setDeleteAuthorizedCertificateRpcTimeoutMultiplier(
      Double deleteAuthorizedCertificateRpcTimeoutMultiplier) {
    this.deleteAuthorizedCertificateRpcTimeoutMultiplier =
        deleteAuthorizedCertificateRpcTimeoutMultiplier;
  }

  public Duration getDeleteAuthorizedCertificateMaxRpcTimeout() {
    return this.deleteAuthorizedCertificateMaxRpcTimeout;
  }

  public void setDeleteAuthorizedCertificateMaxRpcTimeout(
      java.time.Duration deleteAuthorizedCertificateMaxRpcTimeout) {
    this.deleteAuthorizedCertificateMaxRpcTimeout =
        Duration.parse(deleteAuthorizedCertificateMaxRpcTimeout.toString());
  }

  public Duration getDeleteAuthorizedCertificateTotalTimeout() {
    return this.deleteAuthorizedCertificateTotalTimeout;
  }

  public void setDeleteAuthorizedCertificateTotalTimeout(
      java.time.Duration deleteAuthorizedCertificateTotalTimeout) {
    this.deleteAuthorizedCertificateTotalTimeout =
        Duration.parse(deleteAuthorizedCertificateTotalTimeout.toString());
  }
}
