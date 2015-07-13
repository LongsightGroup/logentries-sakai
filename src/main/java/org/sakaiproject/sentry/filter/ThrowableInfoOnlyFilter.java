/**
 * Copyright (c) 2015 Apereo
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sakaiproject.sentry.filter;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

/**
 * This is a simple filter that denies any message if it doesn't contain any
 * {@link java.lang.Throwable Throwable}.
 *
 * The use of this filter implies filtering of messages.
 *
 * @author Earle Nietzel (earle.nietzel@gmail.com)
 *
 */
public class ThrowableInfoOnlyFilter extends Filter {

    @Override
    public int decide(LoggingEvent event) {
        if (event.getThrowableInformation() == null) {
            return Filter.DENY;
        }
        return Filter.NEUTRAL;
    }
}