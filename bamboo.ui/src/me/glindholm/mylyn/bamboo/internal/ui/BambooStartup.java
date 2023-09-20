/*******************************************************************************
 * Copyright (c) 2012, 2013 Tasktop Technologies and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *     Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package me.glindholm.mylyn.bamboo.internal.ui;

import org.eclipse.mylyn.builds.ui.BuildsUiStartup;

/**
 * @author Steffen Pingel
 */
public class BambooStartup extends BuildsUiStartup {

	private static BambooStartup instance;

	public static BambooStartup getInstance() {
		return instance;
	}

	public BambooStartup() {
		instance = this;
	}

	@Override
	public void lazyStartup() {
	}

	public void stop() {
	}

}
