/*
 * Copyright 2022-2022 Google LLC
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

package com.google.cloud.language.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Provides default property values for LanguageService client bean
 */
@Generated("by gapic-generator-java")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.language.v1.spring.auto.language-service")
public class LanguageServiceSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-language",
          "https://www.googleapis.com/auth/cloud-platform");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  // Option 2(a): Change setter to accept arg of type java.time.Duration
  private Duration analyzeSentimentInitialRetryDelay;
  private Double analyzeSentimentRetryDelayMultiplier;
  // Option 2(b): Change property type to java.time.Duration, but have getter to return threeten.bp.Duration
  private java.time.Duration analyzeSentimentMaxRetryDelay;
  // Option 1 (WIP): Try defining custom converter through @ConfigurationPropertiesBinding
  private Duration analyzeSentimentInitialRpcTimeout;
  private Double analyzeSentimentRpcTimeoutMultiplier;
  private Duration analyzeSentimentMaxRpcTimeout;
  private Duration analyzeSentimentTotalTimeout;
  private Duration analyzeEntitiesInitialRetryDelay;
  private Double analyzeEntitiesRetryDelayMultiplier;
  private Duration analyzeEntitiesMaxRetryDelay;
  private Duration analyzeEntitiesInitialRpcTimeout;
  private Double analyzeEntitiesRpcTimeoutMultiplier;
  private Duration analyzeEntitiesMaxRpcTimeout;
  private Duration analyzeEntitiesTotalTimeout;
  private Duration analyzeEntitySentimentInitialRetryDelay;
  private Double analyzeEntitySentimentRetryDelayMultiplier;
  private Duration analyzeEntitySentimentMaxRetryDelay;
  private Duration analyzeEntitySentimentInitialRpcTimeout;
  private Double analyzeEntitySentimentRpcTimeoutMultiplier;
  private Duration analyzeEntitySentimentMaxRpcTimeout;
  private Duration analyzeEntitySentimentTotalTimeout;
  private Duration analyzeSyntaxInitialRetryDelay;
  private Double analyzeSyntaxRetryDelayMultiplier;
  private Duration analyzeSyntaxMaxRetryDelay;
  private Duration analyzeSyntaxInitialRpcTimeout;
  private Double analyzeSyntaxRpcTimeoutMultiplier;
  private Duration analyzeSyntaxMaxRpcTimeout;
  private Duration analyzeSyntaxTotalTimeout;
  private Duration classifyTextInitialRetryDelay;
  private Double classifyTextRetryDelayMultiplier;
  private Duration classifyTextMaxRetryDelay;
  private Duration classifyTextInitialRpcTimeout;
  private Double classifyTextRpcTimeoutMultiplier;
  private Duration classifyTextMaxRpcTimeout;
  private Duration classifyTextTotalTimeout;
  private Duration annotateTextInitialRetryDelay;
  private Double annotateTextRetryDelayMultiplier;
  private Duration annotateTextMaxRetryDelay;
  private Duration annotateTextInitialRpcTimeout;
  private Double annotateTextRpcTimeoutMultiplier;
  private Duration annotateTextMaxRpcTimeout;
  private Duration annotateTextTotalTimeout;

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

  public Duration getAnalyzeSentimentInitialRetryDelay() {
    return this.analyzeSentimentInitialRetryDelay;
  }

  // Option 2(a): Override setter to accept arg of type java.time.Duration
  public void setAnalyzeSentimentInitialRetryDelay(
      java.time.Duration analyzeSentimentInitialRetryDelay) {
    this.analyzeSentimentInitialRetryDelay = Duration.parse(
        analyzeSentimentInitialRetryDelay.toString());
  }

  public Double getAnalyzeSentimentRetryDelayMultiplier() {
    return this.analyzeSentimentRetryDelayMultiplier;
  }

  public void setAnalyzeSentimentRetryDelayMultiplier(Double analyzeSentimentRetryDelayMultiplier) {
    this.analyzeSentimentRetryDelayMultiplier = analyzeSentimentRetryDelayMultiplier;
  }

  // Option 2(b): Change property type to java.time.Duration, but have getter to return threeten.bp.Duration
  public Duration getAnalyzeSentimentMaxRetryDelay() {
    if (this.analyzeSentimentMaxRetryDelay != null) {
      return Duration.parse(this.analyzeSentimentMaxRetryDelay.toString());
    } else {
      return null;
    }
  }

  public void setAnalyzeSentimentMaxRetryDelay(java.time.Duration analyzeSentimentMaxRetryDelay) {
    this.analyzeSentimentMaxRetryDelay = analyzeSentimentMaxRetryDelay;
  }

  public Duration getAnalyzeSentimentInitialRpcTimeout() {
    return this.analyzeSentimentInitialRpcTimeout;
  }

  public void setAnalyzeSentimentInitialRpcTimeout(Duration analyzeSentimentInitialRpcTimeout) {
    this.analyzeSentimentInitialRpcTimeout = analyzeSentimentInitialRpcTimeout;
  }

  public Double getAnalyzeSentimentRpcTimeoutMultiplier() {
    return this.analyzeSentimentRpcTimeoutMultiplier;
  }

  public void setAnalyzeSentimentRpcTimeoutMultiplier(Double analyzeSentimentRpcTimeoutMultiplier) {
    this.analyzeSentimentRpcTimeoutMultiplier = analyzeSentimentRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeSentimentMaxRpcTimeout() {
    return this.analyzeSentimentMaxRpcTimeout;
  }

  public void setAnalyzeSentimentMaxRpcTimeout(Duration analyzeSentimentMaxRpcTimeout) {
    this.analyzeSentimentMaxRpcTimeout = analyzeSentimentMaxRpcTimeout;
  }

  public Duration getAnalyzeSentimentTotalTimeout() {
    return this.analyzeSentimentTotalTimeout;
  }

  public void setAnalyzeSentimentTotalTimeout(Duration analyzeSentimentTotalTimeout) {
    this.analyzeSentimentTotalTimeout = analyzeSentimentTotalTimeout;
  }

  public Duration getAnalyzeEntitiesInitialRetryDelay() {
    return this.analyzeEntitiesInitialRetryDelay;
  }

  public void setAnalyzeEntitiesInitialRetryDelay(Duration analyzeEntitiesInitialRetryDelay) {
    this.analyzeEntitiesInitialRetryDelay = analyzeEntitiesInitialRetryDelay;
  }

  public Double getAnalyzeEntitiesRetryDelayMultiplier() {
    return this.analyzeEntitiesRetryDelayMultiplier;
  }

  public void setAnalyzeEntitiesRetryDelayMultiplier(Double analyzeEntitiesRetryDelayMultiplier) {
    this.analyzeEntitiesRetryDelayMultiplier = analyzeEntitiesRetryDelayMultiplier;
  }

  public Duration getAnalyzeEntitiesMaxRetryDelay() {
    return this.analyzeEntitiesMaxRetryDelay;
  }

  public void setAnalyzeEntitiesMaxRetryDelay(Duration analyzeEntitiesMaxRetryDelay) {
    this.analyzeEntitiesMaxRetryDelay = analyzeEntitiesMaxRetryDelay;
  }

  public Duration getAnalyzeEntitiesInitialRpcTimeout() {
    return this.analyzeEntitiesInitialRpcTimeout;
  }

  public void setAnalyzeEntitiesInitialRpcTimeout(Duration analyzeEntitiesInitialRpcTimeout) {
    this.analyzeEntitiesInitialRpcTimeout = analyzeEntitiesInitialRpcTimeout;
  }

  public Double getAnalyzeEntitiesRpcTimeoutMultiplier() {
    return this.analyzeEntitiesRpcTimeoutMultiplier;
  }

  public void setAnalyzeEntitiesRpcTimeoutMultiplier(Double analyzeEntitiesRpcTimeoutMultiplier) {
    this.analyzeEntitiesRpcTimeoutMultiplier = analyzeEntitiesRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeEntitiesMaxRpcTimeout() {
    return this.analyzeEntitiesMaxRpcTimeout;
  }

  public void setAnalyzeEntitiesMaxRpcTimeout(Duration analyzeEntitiesMaxRpcTimeout) {
    this.analyzeEntitiesMaxRpcTimeout = analyzeEntitiesMaxRpcTimeout;
  }

  public Duration getAnalyzeEntitiesTotalTimeout() {
    return this.analyzeEntitiesTotalTimeout;
  }

  public void setAnalyzeEntitiesTotalTimeout(Duration analyzeEntitiesTotalTimeout) {
    this.analyzeEntitiesTotalTimeout = analyzeEntitiesTotalTimeout;
  }

  public Duration getAnalyzeEntitySentimentInitialRetryDelay() {
    return this.analyzeEntitySentimentInitialRetryDelay;
  }

  public void setAnalyzeEntitySentimentInitialRetryDelay(
      Duration analyzeEntitySentimentInitialRetryDelay) {
    this.analyzeEntitySentimentInitialRetryDelay = analyzeEntitySentimentInitialRetryDelay;
  }

  public Double getAnalyzeEntitySentimentRetryDelayMultiplier() {
    return this.analyzeEntitySentimentRetryDelayMultiplier;
  }

  public void setAnalyzeEntitySentimentRetryDelayMultiplier(
      Double analyzeEntitySentimentRetryDelayMultiplier) {
    this.analyzeEntitySentimentRetryDelayMultiplier = analyzeEntitySentimentRetryDelayMultiplier;
  }

  public Duration getAnalyzeEntitySentimentMaxRetryDelay() {
    return this.analyzeEntitySentimentMaxRetryDelay;
  }

  public void setAnalyzeEntitySentimentMaxRetryDelay(Duration analyzeEntitySentimentMaxRetryDelay) {
    this.analyzeEntitySentimentMaxRetryDelay = analyzeEntitySentimentMaxRetryDelay;
  }

  public Duration getAnalyzeEntitySentimentInitialRpcTimeout() {
    return this.analyzeEntitySentimentInitialRpcTimeout;
  }

  public void setAnalyzeEntitySentimentInitialRpcTimeout(
      Duration analyzeEntitySentimentInitialRpcTimeout) {
    this.analyzeEntitySentimentInitialRpcTimeout = analyzeEntitySentimentInitialRpcTimeout;
  }

  public Double getAnalyzeEntitySentimentRpcTimeoutMultiplier() {
    return this.analyzeEntitySentimentRpcTimeoutMultiplier;
  }

  public void setAnalyzeEntitySentimentRpcTimeoutMultiplier(
      Double analyzeEntitySentimentRpcTimeoutMultiplier) {
    this.analyzeEntitySentimentRpcTimeoutMultiplier = analyzeEntitySentimentRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeEntitySentimentMaxRpcTimeout() {
    return this.analyzeEntitySentimentMaxRpcTimeout;
  }

  public void setAnalyzeEntitySentimentMaxRpcTimeout(Duration analyzeEntitySentimentMaxRpcTimeout) {
    this.analyzeEntitySentimentMaxRpcTimeout = analyzeEntitySentimentMaxRpcTimeout;
  }

  public Duration getAnalyzeEntitySentimentTotalTimeout() {
    return this.analyzeEntitySentimentTotalTimeout;
  }

  public void setAnalyzeEntitySentimentTotalTimeout(Duration analyzeEntitySentimentTotalTimeout) {
    this.analyzeEntitySentimentTotalTimeout = analyzeEntitySentimentTotalTimeout;
  }

  public Duration getAnalyzeSyntaxInitialRetryDelay() {
    return this.analyzeSyntaxInitialRetryDelay;
  }

  public void setAnalyzeSyntaxInitialRetryDelay(Duration analyzeSyntaxInitialRetryDelay) {
    this.analyzeSyntaxInitialRetryDelay = analyzeSyntaxInitialRetryDelay;
  }

  public Double getAnalyzeSyntaxRetryDelayMultiplier() {
    return this.analyzeSyntaxRetryDelayMultiplier;
  }

  public void setAnalyzeSyntaxRetryDelayMultiplier(Double analyzeSyntaxRetryDelayMultiplier) {
    this.analyzeSyntaxRetryDelayMultiplier = analyzeSyntaxRetryDelayMultiplier;
  }

  public Duration getAnalyzeSyntaxMaxRetryDelay() {
    return this.analyzeSyntaxMaxRetryDelay;
  }

  public void setAnalyzeSyntaxMaxRetryDelay(Duration analyzeSyntaxMaxRetryDelay) {
    this.analyzeSyntaxMaxRetryDelay = analyzeSyntaxMaxRetryDelay;
  }

  public Duration getAnalyzeSyntaxInitialRpcTimeout() {
    return this.analyzeSyntaxInitialRpcTimeout;
  }

  public void setAnalyzeSyntaxInitialRpcTimeout(Duration analyzeSyntaxInitialRpcTimeout) {
    this.analyzeSyntaxInitialRpcTimeout = analyzeSyntaxInitialRpcTimeout;
  }

  public Double getAnalyzeSyntaxRpcTimeoutMultiplier() {
    return this.analyzeSyntaxRpcTimeoutMultiplier;
  }

  public void setAnalyzeSyntaxRpcTimeoutMultiplier(Double analyzeSyntaxRpcTimeoutMultiplier) {
    this.analyzeSyntaxRpcTimeoutMultiplier = analyzeSyntaxRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeSyntaxMaxRpcTimeout() {
    return this.analyzeSyntaxMaxRpcTimeout;
  }

  public void setAnalyzeSyntaxMaxRpcTimeout(Duration analyzeSyntaxMaxRpcTimeout) {
    this.analyzeSyntaxMaxRpcTimeout = analyzeSyntaxMaxRpcTimeout;
  }

  public Duration getAnalyzeSyntaxTotalTimeout() {
    return this.analyzeSyntaxTotalTimeout;
  }

  public void setAnalyzeSyntaxTotalTimeout(Duration analyzeSyntaxTotalTimeout) {
    this.analyzeSyntaxTotalTimeout = analyzeSyntaxTotalTimeout;
  }

  public Duration getClassifyTextInitialRetryDelay() {
    return this.classifyTextInitialRetryDelay;
  }

  public void setClassifyTextInitialRetryDelay(Duration classifyTextInitialRetryDelay) {
    this.classifyTextInitialRetryDelay = classifyTextInitialRetryDelay;
  }

  public Double getClassifyTextRetryDelayMultiplier() {
    return this.classifyTextRetryDelayMultiplier;
  }

  public void setClassifyTextRetryDelayMultiplier(Double classifyTextRetryDelayMultiplier) {
    this.classifyTextRetryDelayMultiplier = classifyTextRetryDelayMultiplier;
  }

  public Duration getClassifyTextMaxRetryDelay() {
    return this.classifyTextMaxRetryDelay;
  }

  public void setClassifyTextMaxRetryDelay(Duration classifyTextMaxRetryDelay) {
    this.classifyTextMaxRetryDelay = classifyTextMaxRetryDelay;
  }

  public Duration getClassifyTextInitialRpcTimeout() {
    return this.classifyTextInitialRpcTimeout;
  }

  public void setClassifyTextInitialRpcTimeout(Duration classifyTextInitialRpcTimeout) {
    this.classifyTextInitialRpcTimeout = classifyTextInitialRpcTimeout;
  }

  public Double getClassifyTextRpcTimeoutMultiplier() {
    return this.classifyTextRpcTimeoutMultiplier;
  }

  public void setClassifyTextRpcTimeoutMultiplier(Double classifyTextRpcTimeoutMultiplier) {
    this.classifyTextRpcTimeoutMultiplier = classifyTextRpcTimeoutMultiplier;
  }

  public Duration getClassifyTextMaxRpcTimeout() {
    return this.classifyTextMaxRpcTimeout;
  }

  public void setClassifyTextMaxRpcTimeout(Duration classifyTextMaxRpcTimeout) {
    this.classifyTextMaxRpcTimeout = classifyTextMaxRpcTimeout;
  }

  public Duration getClassifyTextTotalTimeout() {
    return this.classifyTextTotalTimeout;
  }

  public void setClassifyTextTotalTimeout(Duration classifyTextTotalTimeout) {
    this.classifyTextTotalTimeout = classifyTextTotalTimeout;
  }

  public Duration getAnnotateTextInitialRetryDelay() {
    return this.annotateTextInitialRetryDelay;
  }

  public void setAnnotateTextInitialRetryDelay(Duration annotateTextInitialRetryDelay) {
    this.annotateTextInitialRetryDelay = annotateTextInitialRetryDelay;
  }

  public Double getAnnotateTextRetryDelayMultiplier() {
    return this.annotateTextRetryDelayMultiplier;
  }

  public void setAnnotateTextRetryDelayMultiplier(Double annotateTextRetryDelayMultiplier) {
    this.annotateTextRetryDelayMultiplier = annotateTextRetryDelayMultiplier;
  }

  public Duration getAnnotateTextMaxRetryDelay() {
    return this.annotateTextMaxRetryDelay;
  }

  public void setAnnotateTextMaxRetryDelay(Duration annotateTextMaxRetryDelay) {
    this.annotateTextMaxRetryDelay = annotateTextMaxRetryDelay;
  }

  public Duration getAnnotateTextInitialRpcTimeout() {
    return this.annotateTextInitialRpcTimeout;
  }

  public void setAnnotateTextInitialRpcTimeout(Duration annotateTextInitialRpcTimeout) {
    this.annotateTextInitialRpcTimeout = annotateTextInitialRpcTimeout;
  }

  public Double getAnnotateTextRpcTimeoutMultiplier() {
    return this.annotateTextRpcTimeoutMultiplier;
  }

  public void setAnnotateTextRpcTimeoutMultiplier(Double annotateTextRpcTimeoutMultiplier) {
    this.annotateTextRpcTimeoutMultiplier = annotateTextRpcTimeoutMultiplier;
  }

  public Duration getAnnotateTextMaxRpcTimeout() {
    return this.annotateTextMaxRpcTimeout;
  }

  public void setAnnotateTextMaxRpcTimeout(Duration annotateTextMaxRpcTimeout) {
    this.annotateTextMaxRpcTimeout = annotateTextMaxRpcTimeout;
  }

  public Duration getAnnotateTextTotalTimeout() {
    return this.annotateTextTotalTimeout;
  }

  public void setAnnotateTextTotalTimeout(Duration annotateTextTotalTimeout) {
    this.annotateTextTotalTimeout = annotateTextTotalTimeout;
  }
}
