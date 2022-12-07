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
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for QueryService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.monitoring.v3.spring.auto.query-service")
public class QueryServiceSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-platform",
          "https://www.googleapis.com/auth/monitoring",
          "https://www.googleapis.com/auth/monitoring.read");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private Double queryTimeSeriesRpcTimeoutMultiplier;

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

  public Double getQueryTimeSeriesRpcTimeoutMultiplier() {
    return this.queryTimeSeriesRpcTimeoutMultiplier;
  }

  public void setQueryTimeSeriesRpcTimeoutMultiplier(Double queryTimeSeriesRpcTimeoutMultiplier) {
    this.queryTimeSeriesRpcTimeoutMultiplier = queryTimeSeriesRpcTimeoutMultiplier;
  }
}
