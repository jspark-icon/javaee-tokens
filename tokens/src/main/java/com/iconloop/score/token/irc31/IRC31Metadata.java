/*
 * Copyright 2021 ICON Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.iconloop.score.token.irc31;

import score.annotation.External;

import java.math.BigInteger;

/**
 * To provide rich set of asset metadata for a given token, smarts contracts need to implement the following method to return an URI that points to a JSON file.
 */
public interface IRC31Metadata {
    /**
     * Returns an URI for a given token ID.
     *
     * @param _id ID of the token
     * @return the URI string
     */
    @External(readonly = true)
    String tokenURI(BigInteger _id);
}
