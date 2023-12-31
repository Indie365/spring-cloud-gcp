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

import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import java.util.Objects;

/** An embedded grouping of columns. */
public class TradeDetail {

  @PrimaryKey String id;

  Double price;

  Double shares;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getShares() {
    return this.shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeDetail that = (TradeDetail) o;
    return Objects.equals(getId(), that.getId())
        && Objects.equals(getPrice(), that.getPrice())
        && Objects.equals(getShares(), that.getShares());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getPrice(), getShares());
  }
}
