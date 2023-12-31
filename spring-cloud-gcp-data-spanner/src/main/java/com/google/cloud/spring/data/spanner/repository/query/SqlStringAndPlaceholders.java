/*
 * Copyright 2017-2019 the original author or authors.
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

package com.google.cloud.spring.data.spanner.repository.query;

import java.util.List;

/**
 * Holds SQL query string and a list of placeholders. For sql string like this SELECT * FROM trades
 * WHERE ( action=@tag0 AND ticker=@tag1 ) the list of placeholders would look like this: [tag0,
 * tag1]
 *
 * @since 1.2.4
 */
class SqlStringAndPlaceholders {
  private String sql;

  private List<String> placeholders;

  SqlStringAndPlaceholders(String finalSql, List<String> placeholders) {
    this.sql = finalSql;
    this.placeholders = placeholders;
  }

  String getSql() {
    return sql;
  }

  List<String> getPlaceholders() {
    return placeholders;
  }
}
