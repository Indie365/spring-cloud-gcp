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
import com.google.cloud.spring.data.spanner.core.mapping.Embedded;
import com.google.cloud.spring.data.spanner.core.mapping.Interleaved;
import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import com.google.cloud.spring.data.spanner.core.mapping.Where;
import java.util.List;
import java.util.Objects;

/** An interleaved child of {@link Trade}. */
@Table(name = "#{'sub_trades_'.concat(tableNameSuffix)}")
@Where("disabled = false")
public class SubTrade {

  @Embedded @PrimaryKey TradeIdentifier tradeIdentifier;

  @PrimaryKey(keyOrder = 2)
  String subTradeId;

  @Interleaved
  @Where("disabled = false")
  List<SubTradeComponent> subTradeComponentList;

  @Column boolean disabled;

  public SubTrade() {}

  public SubTrade(String id, String traderId, String subTradeId) {
    TradeIdentifier tradeIdentifier = new TradeIdentifier();
    tradeIdentifier.identifier = id;
    tradeIdentifier.trader_id = traderId;
    this.subTradeId = subTradeId;
    this.tradeIdentifier = tradeIdentifier;
  }

  public boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(boolean disabled) {
    this.disabled = disabled;
  }

  public String getSubTradeId() {
    return this.subTradeId;
  }

  public void setSubTradeId(String subTradeId) {
    this.subTradeId = subTradeId;
  }

  public List<SubTradeComponent> getSubTradeComponentList() {
    return this.subTradeComponentList;
  }

  public void setSubTradeComponentList(List<SubTradeComponent> subTradeComponentList) {
    this.subTradeComponentList = subTradeComponentList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTrade subTrade = (SubTrade) o;
    return Objects.equals(this.tradeIdentifier, subTrade.tradeIdentifier)
        && Objects.equals(this.disabled, subTrade.disabled)
        && Objects.equals(getSubTradeId(), subTrade.getSubTradeId())
        && (Objects.equals(getSubTradeComponentList(), subTrade.getSubTradeComponentList())
            || (getSubTradeComponentList() == null
                && subTrade.getSubTradeComponentList().size() == 0)
            || (subTrade.getSubTradeComponentList() == null
                && getSubTradeComponentList().size() == 0));
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.tradeIdentifier, getSubTradeId(), getSubTradeComponentList());
  }

  @Override
  public String toString() {
    return "SubTrade{"
        + "tradeIdentifier="
        + this.tradeIdentifier
        + ", subTradeId='"
        + this.subTradeId
        + '\''
        + ", subTradeComponentList="
        + this.subTradeComponentList
        + ", disabled="
        + this.disabled
        + '}';
  }
}
