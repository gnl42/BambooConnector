/*******************************************************************************
 * Copyright (c) 2010 Tasktop Technologies and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *     Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package me.glindholm.mylyn.bamboo.internal.core;

import org.eclipse.core.runtime.Status;

import me.glindholm.mylyn.bamboo.internal.core.client.BambooServerInfo;

/**
 * @author Steffen Pingel
 */
public class BambooStatus extends Status {

	private BambooServerInfo info;

	public BambooStatus(int severity, String pluginId, String message) {
		super(severity, pluginId, message);
	}

	public BambooStatus(int severity, String pluginId, String message, Throwable exception) {
		super(severity, pluginId, message, exception);
	}

	public BambooStatus(int severity, String pluginId, int code, String message, Throwable exception) {
		super(severity, pluginId, code, message, exception);
	}

	void setInfo(BambooServerInfo info) {
		this.info = info;
	}

	public BambooServerInfo getInfo() {
		return info;
	}

}
