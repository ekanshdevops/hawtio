/**
 * Copyright (C) 2013 the original author or authors.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
package io.hawt.web.kubernetes;

import io.hawt.web.proxy.ProxyAddress;

/**
 * Default implementation of {@link ProxyAddress}
 */
public class DefaultProxyAddress implements ProxyAddress {
    private final String fullProxyUrl;
    private final String userName;
    private final String password;

    public DefaultProxyAddress(String fullProxyUrl, String userName, String password) {
        this.fullProxyUrl = fullProxyUrl;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
            "DefaultProxyAddress{fullProxyUrl='%s', userName='%s'}",
            fullProxyUrl, userName);
    }

    @Override
    public String getFullProxyUrl() {
        return fullProxyUrl;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
