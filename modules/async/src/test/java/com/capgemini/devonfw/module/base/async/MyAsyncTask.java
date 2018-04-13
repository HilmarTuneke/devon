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
package com.capgemini.devonfw.module.base.async;

import com.capgemini.devonfw.module.async.common.api.AsyncTask;

/**
 * Class to wrap the long task
 *
 * @author pparrado
 */
public class MyAsyncTask implements AsyncTask {

  private int sleepTime;

  @SuppressWarnings("javadoc")
  public MyAsyncTask(int sleepTime) {
    this.sleepTime = sleepTime;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object run() {

    try {
      Thread.sleep(this.sleepTime);
      return "success";
    } catch (Exception e) {
      return null;
    }

  }

}
