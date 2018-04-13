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
package com.capgemini.devonfw.starter.i18n;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.capgemini.devonfw.module.i18n.logic.api.I18n;
import com.capgemini.devonfw.module.i18n.logic.impl.I18nImpl;

/**
 * @author vapadwal
 *
 */
@Configuration
@ConditionalOnClass({ I18n.class, I18nImpl.class })
@ComponentScan(basePackages = { "com.capgemini.devonfw.module.i18n" })
public class I18NAutoConfiguration {

}
