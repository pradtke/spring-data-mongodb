/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *			http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.mongodb.core.geo;

import org.springframework.data.mongodb.core.query.NearQuery;

/**
 * Commonly used {@link Metrics} for {@link NearQuery}s.
 * 
 * @deprecated As of release 1.5, replaced by {@link org.springframework.data.geo.Metrics}. This class is scheduled to
 *             be removed in the next major release.
 * @author Oliver Gierke
 * @author Thomas Darimont
 */
@Deprecated
public enum Metrics implements Metric {

	KILOMETERS(org.springframework.data.geo.Metrics.KILOMETERS.getMultiplier()), //
	MILES(org.springframework.data.geo.Metrics.MILES.getMultiplier()), //
	NEUTRAL(org.springframework.data.geo.Metrics.NEUTRAL.getMultiplier()); //

	private final double multiplier;

	private Metrics(double multiplier) {
		this.multiplier = multiplier;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.data.mongodb.core.geo.Metric#getMultiplier()
	 */
	public double getMultiplier() {
		return multiplier;
	}
}
