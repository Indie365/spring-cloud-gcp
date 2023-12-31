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

package com.google.cloud.spring.pubsub.support.converter;

import com.google.cloud.spring.pubsub.support.AcknowledgeablePubsubMessage;

/**
 * An {@link AcknowledgeablePubsubMessage} that also contains the payload of the Pub/Sub message
 * converted to the desired type {@code T}.
 *
 * @param <T> the type of the converted payload.
 * @since 1.1
 */
public interface ConvertedAcknowledgeablePubsubMessage<T>
    extends AcknowledgeablePubsubMessage, ConvertedBasicAcknowledgeablePubsubMessage<T> {}
