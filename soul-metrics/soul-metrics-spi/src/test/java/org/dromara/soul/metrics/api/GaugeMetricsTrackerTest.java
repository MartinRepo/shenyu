/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.metrics.api;

import org.dromara.soul.metrics.enums.MetricsTypeEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for GaugeMetricsTracker default method.
 *
 * @author dengliming
 */
public class GaugeMetricsTrackerTest {

    @Test
    public void metricsType() {
        assertEquals(MetricsTypeEnum.GAUGE.name(), new GaugeMetricsTracker() {
            @Override
            public String metricsLabel() {
                return null;
            }

            @Override
            public void inc(final double amount, final String... labelValues) {

            }

            @Override
            public void dec(final double amount, final String... labelValues) {

            }
        }.metricsType());
    }
}