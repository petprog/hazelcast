/*
 * Copyright (c) 2008-2020, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.nio.ascii;

import com.hazelcast.nio.tcp.TcpIpConnection;

/**
 * This interface is a text protocols policy enforcement point. It checks incoming command lines and validates if the command
 * can be processed. If the command is unknown or not allowed the connection is closed.
 */
interface TextProtocolFilter {
    void filterConnection(String commandLine, TcpIpConnection connection);
}