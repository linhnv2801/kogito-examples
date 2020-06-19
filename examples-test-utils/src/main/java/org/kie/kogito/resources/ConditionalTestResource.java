/**
 *  Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.kie.kogito.resources;

/**
 * Conditional test resource for kogito tests.
 * 
 */
public interface ConditionalTestResource<T> {

    /**
     * Start the test resource.
     */
    void start();

    /**
     * Stop the test resource.
     */
    void stop();

    /**
     * Enable the test resource only if the test category matches the value.
     * @param value to match the test category.
     * @return the test resource.
     */
    T enableIfTestCategoryIs(String value);

}