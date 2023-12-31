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

package com.google.cloud.spring.data.datastore.core.convert;

import com.google.cloud.datastore.BaseEntity;
import com.google.cloud.spring.data.datastore.core.mapping.DatastorePersistentEntity;
import java.util.Map;
import org.springframework.data.convert.EntityReader;
import org.springframework.data.convert.EntityWriter;
import org.springframework.data.util.TypeInformation;

/**
 * An interface for converting objects to Datastore Entities and vice versa.
 *
 * @since 1.1
 */
public interface DatastoreEntityConverter
    extends EntityReader<Object, BaseEntity>, EntityWriter<Object, BaseEntity.Builder> {

  /**
   * Get the {@link ReadWriteConversions} used in this converter.
   *
   * @return the conversions used.
   */
  ReadWriteConversions getConversions();

  /**
   * Provide a {@link DatastorePersistentEntity} with support for discriminator fields.
   *
   * @param entityClass the entity class
   * @param entity the Datastore entity
   * @param <T> the type of the entity
   * @return {@link DatastorePersistentEntity} for the entity type with support for discriminator
   *     fields.
   */
  <T> DatastorePersistentEntity<T> getDiscriminationPersistentEntity(
      Class<T> entityClass, BaseEntity<?> entity);

  /**
   * Read the entity as a {@link Map}.
   *
   * @param <T> the type of the key in the map
   * @param <R> the type of the value in the map
   * @param entity the entity from Cloud Datastore.
   * @param mapTypeInformation the actual type of the map
   * @return a Map where the key values are the field names and the values the field values.
   */
  <T, R> Map<T, R> readAsMap(BaseEntity entity, TypeInformation mapTypeInformation);

  /**
   * Read the entity as a {@link Map} when the map type is unknown.
   *
   * @param <T> the type of the key in the map
   * @param <R> the type of the value in the map
   * @param keyType the key type of the map to be read.
   * @param componentType the value type of the map, into which each field value will be converted.
   * @param entity the entity from Cloud Datastore.
   * @return a Map where the key values are the field names and the values the field values.
   */
  <T, R> Map<T, R> readAsMap(Class<T> keyType, TypeInformation<R> componentType, BaseEntity entity);
}
