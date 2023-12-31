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

package com.google.cloud.spring.data.spanner.core.convert;

import com.google.cloud.spanner.ValueBinder;

/** An interface that allows multiple values to be bound for Cloud Spanner. */
public interface MultipleValueBinder {

  /**
   * Returns a {@link ValueBinder} for a given field name to bind.
   *
   * @param fieldName the name of the field to bind.
   * @return a value-binder object that then accepts the value to bind.
   */
  ValueBinder set(String fieldName);
}
