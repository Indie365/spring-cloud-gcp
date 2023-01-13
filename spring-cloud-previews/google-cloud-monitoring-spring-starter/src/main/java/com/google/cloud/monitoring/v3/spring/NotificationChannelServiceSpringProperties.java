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
/** Provides default property values for NotificationChannelService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.monitoring.v3.notification-channel-service")
public class NotificationChannelServiceSpringProperties implements CredentialsSupplier {
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
   * Allow override of retry settings at method-level for listNotificationChannelDescriptors. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listNotificationChannelDescriptorsRetry;
  /**
   * Allow override of retry settings at method-level for getNotificationChannelDescriptor. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getNotificationChannelDescriptorRetry;
  /**
   * Allow override of retry settings at method-level for listNotificationChannels. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listNotificationChannelsRetry;
  /**
   * Allow override of retry settings at method-level for getNotificationChannel. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getNotificationChannelRetry;
  /**
   * Allow override of retry settings at method-level for createNotificationChannel. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createNotificationChannelRetry;
  /**
   * Allow override of retry settings at method-level for updateNotificationChannel. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateNotificationChannelRetry;
  /**
   * Allow override of retry settings at method-level for deleteNotificationChannel. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteNotificationChannelRetry;
  /**
   * Allow override of retry settings at method-level for sendNotificationChannelVerificationCode.
   * If defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry sendNotificationChannelVerificationCodeRetry;
  /**
   * Allow override of retry settings at method-level for getNotificationChannelVerificationCode. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getNotificationChannelVerificationCodeRetry;
  /**
   * Allow override of retry settings at method-level for verifyNotificationChannel. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry verifyNotificationChannelRetry;

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

  public Retry getListNotificationChannelDescriptorsRetry() {
    return this.listNotificationChannelDescriptorsRetry;
  }

  public void setListNotificationChannelDescriptorsRetry(
      Retry listNotificationChannelDescriptorsRetry) {
    this.listNotificationChannelDescriptorsRetry = listNotificationChannelDescriptorsRetry;
  }

  public Retry getGetNotificationChannelDescriptorRetry() {
    return this.getNotificationChannelDescriptorRetry;
  }

  public void setGetNotificationChannelDescriptorRetry(
      Retry getNotificationChannelDescriptorRetry) {
    this.getNotificationChannelDescriptorRetry = getNotificationChannelDescriptorRetry;
  }

  public Retry getListNotificationChannelsRetry() {
    return this.listNotificationChannelsRetry;
  }

  public void setListNotificationChannelsRetry(Retry listNotificationChannelsRetry) {
    this.listNotificationChannelsRetry = listNotificationChannelsRetry;
  }

  public Retry getGetNotificationChannelRetry() {
    return this.getNotificationChannelRetry;
  }

  public void setGetNotificationChannelRetry(Retry getNotificationChannelRetry) {
    this.getNotificationChannelRetry = getNotificationChannelRetry;
  }

  public Retry getCreateNotificationChannelRetry() {
    return this.createNotificationChannelRetry;
  }

  public void setCreateNotificationChannelRetry(Retry createNotificationChannelRetry) {
    this.createNotificationChannelRetry = createNotificationChannelRetry;
  }

  public Retry getUpdateNotificationChannelRetry() {
    return this.updateNotificationChannelRetry;
  }

  public void setUpdateNotificationChannelRetry(Retry updateNotificationChannelRetry) {
    this.updateNotificationChannelRetry = updateNotificationChannelRetry;
  }

  public Retry getDeleteNotificationChannelRetry() {
    return this.deleteNotificationChannelRetry;
  }

  public void setDeleteNotificationChannelRetry(Retry deleteNotificationChannelRetry) {
    this.deleteNotificationChannelRetry = deleteNotificationChannelRetry;
  }

  public Retry getSendNotificationChannelVerificationCodeRetry() {
    return this.sendNotificationChannelVerificationCodeRetry;
  }

  public void setSendNotificationChannelVerificationCodeRetry(
      Retry sendNotificationChannelVerificationCodeRetry) {
    this.sendNotificationChannelVerificationCodeRetry =
        sendNotificationChannelVerificationCodeRetry;
  }

  public Retry getGetNotificationChannelVerificationCodeRetry() {
    return this.getNotificationChannelVerificationCodeRetry;
  }

  public void setGetNotificationChannelVerificationCodeRetry(
      Retry getNotificationChannelVerificationCodeRetry) {
    this.getNotificationChannelVerificationCodeRetry = getNotificationChannelVerificationCodeRetry;
  }

  public Retry getVerifyNotificationChannelRetry() {
    return this.verifyNotificationChannelRetry;
  }

  public void setVerifyNotificationChannelRetry(Retry verifyNotificationChannelRetry) {
    this.verifyNotificationChannelRetry = verifyNotificationChannelRetry;
  }
}