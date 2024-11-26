/*
 * Copyright (c) 2024 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.fluss.exception;

import com.alibaba.fluss.annotation.PublicEvolving;
import com.alibaba.fluss.config.ConfigOptions;

/**
 * This exception indicates that the tablet server received an unexpected sequence number from
 * writer, which means that data may have been lost. If the user writer is configured for
 * idempotence as {@link ConfigOptions#CLIENT_WRITER_ENABLE_IDEMPOTENCE} set to true, it's possible
 * to continue sending with the same writer instance, but doing so risks recording of sent records.
 */
@PublicEvolving
public class OutOfOrderSequenceException extends ApiException {
    public OutOfOrderSequenceException(String message) {
        super(message);
    }
}