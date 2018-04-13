/*******************************************************************************
 * Copyright 2015-2018 Capgemini SE.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/
package com.capgemini.devonfw.module.integration.common.api;

import java.util.Map;

/**
 * @author pparrado
 *
 */
public interface IntegrationChannel {

  /**
   * Sends a message
   *
   * @param message the message to be sent
   * @return the result of the sending operation
   */
  Boolean send(String message);

  /**
   * Sends a message with headers
   *
   * @param message the message to be sent
   * @param headers the headers for the message
   * @return the result of the sending operation
   */
  Boolean send(String message, Map<?, ?> headers);

}
