/*******************************************************************************
 * Copyright © 2023 George Lindholm.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *     George Lindholm - initial API and implementation
 *******************************************************************************/

package me.glindholm.mylyn.bamboo.internal.core.client;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public class BambooConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	public Map<String, String> jobNameById = Collections.EMPTY_MAP;

	@Override
	public String toString() {
		return "BambooConfiguration [jobNameById=" + jobNameById + "]"; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
