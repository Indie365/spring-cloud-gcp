/*
 * Copyright 2017-2018 the original author or authors.
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

package com.google.cloud.spring.data.spanner.test.domain;

import com.google.cloud.spring.data.spanner.core.mapping.Column;
import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import java.util.Objects;

/**
 * A class containing the key components needed to identify a {@link Trade}. This is intentionally
 * not used in {@link Trade} but is used by its children to test that embedded objects containing
 * keys are resolved properly.
 */
public class TradeIdentifier {

  @Column(name = "id")
  @PrimaryKey
  String identifier;

  @PrimaryKey(keyOrder = 2)
  String trader_id;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeIdentifier that = (TradeIdentifier) o;
    return Objects.equals(this.identifier, that.identifier)
        && Objects.equals(this.trader_id, that.trader_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.identifier, this.trader_id);
  }
}
