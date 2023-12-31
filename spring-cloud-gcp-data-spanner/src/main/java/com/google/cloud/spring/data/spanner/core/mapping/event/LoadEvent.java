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

package com.google.cloud.spring.data.spanner.core.mapping.event;

import java.util.Objects;
import org.springframework.context.ApplicationEvent;

/** This event read operation on Cloud Spanner. */
public class LoadEvent extends ApplicationEvent {

  /**
   * Constructor.
   *
   * @param source The entities that were read from Cloud Spanner.This is never {@code null}.
   */
  public LoadEvent(Iterable source) {
    super(source);
  }

  /**
   * Returns the entities that were loaded.
   *
   * @return the entities that were read from Cloud Spanner.
   */
  public Iterable getRetrievedEntities() {
    return (Iterable) getSource();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AfterQueryEvent that = (AfterQueryEvent) o;
    return Objects.equals(getRetrievedEntities(), that.getRetrievedEntities());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getRetrievedEntities());
  }
}
