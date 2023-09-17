/*******************************************************************************
 * Copyright (c) 2023 Tasktop Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package me.glindholm.mylyn.internal.bamboo.core.client;

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
