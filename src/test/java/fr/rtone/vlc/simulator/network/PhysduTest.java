/**
 * Copyright 2017 Alexis DUQUE.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.rtone.vlc.simulator.network;

import fr.rtone.vlc.simulator.topology.Led;
import fr.rtone.vlc.simulator.utils.GenerationBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Physdu Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>juil. 3, 2017</pre>
 */
public class PhysduTest {

    Physdu physdu;

    @Before
    public void before() throws Exception {
        physdu = GenerationBuilder.buildRandomPhysdu(8, 16);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getDurationMs(int txFreq, Rll rll)
     */
    @Test
    public void testGetDurationMs() throws Exception {
        double expected = 6.5;
        double actual = physdu.getDurationMs(8000, Led.Rll.RLL_MANCHESTER);
        assertEquals(expected, actual, 0);
    }


} 
