/*
 * Copyright 2017-2020 the original author or authors.
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

package com.google.cloud.spring.autoconfigure.sql;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * Provides default JDBC driver class name and constructs the JDBC URL for Cloud SQL v2 when running
 * on local laptop, or in a VM-based environment (e.g., Google Compute Engine, Google Container
 * Engine).
 */
public class DefaultCloudSqlJdbcInfoProvider implements CloudSqlJdbcInfoProvider {

  private final GcpCloudSqlProperties properties;

  private final DatabaseType databaseType;

  public DefaultCloudSqlJdbcInfoProvider(
      GcpCloudSqlProperties properties, DatabaseType databaseType) {
    this.properties = properties;
    this.databaseType = databaseType;
    Assert.hasText(this.properties.getDatabaseName(), "A database name must be provided.");
    Assert.hasText(
        properties.getInstanceConnectionName(),
        "An instance connection name must be provided in the format"
            + " <PROJECT_ID>:<REGION>:<INSTANCE_ID>.");
  }

  @Override
  public String getJdbcDriverClass() {
    return this.databaseType.getJdbcDriverName();
  }

  @Override
  public String getJdbcUrl() {
    String jdbcUrl =
        String.format(
            this.databaseType.getJdbcUrlTemplate(),
            this.properties.getDatabaseName(),
            this.properties.getInstanceConnectionName());

    if (StringUtils.hasText(properties.getIpTypes())) {
      jdbcUrl += "&ipTypes=" + properties.getIpTypes();
    }

    if (properties.isEnableIamAuth()) {
      jdbcUrl += "&enableIamAuth=true&sslmode=disable";
    }

    return jdbcUrl;
  }
}
