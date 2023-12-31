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

import com.google.cloud.spanner.Key;
import com.google.cloud.spring.data.spanner.repository.SpannerRepository;
import com.google.cloud.spring.data.spanner.repository.query.Query;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

/** Repository for a child class for integration tests. */
public interface SubTradeRepository extends SpannerRepository<SubTrade, Key> {

  @Query(
      "SELECT * FROM :com.google.cloud.spring.data.spanner.test.domain.SubTrade:"
          + " WHERE id = @id AND trader_id = @trader_id")
  List<SubTrade> getPage(
      @Param("id") String id, @Param("trader_id") String tradeId, Pageable pageable);

  @Query(
      "SELECT * FROM :com.google.cloud.spring.data.spanner.test.domain.SubTrade:"
          + " WHERE id = @id AND trader_id = @trader_id")
  List<SubTrade> getList(@Param("id") String id, @Param("trader_id") String tradeId, Sort sort);

  @Query(
      "SELECT count(1) FROM :com.google.cloud.spring.data.spanner.test.domain.SubTrade:"
          + " WHERE id = @id AND trader_id = @trader_id")
  long countBy(@Param("id") String id, @Param("trader_id") String tradeId);
}
