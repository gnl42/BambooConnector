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

package me.glindholm.mylyn.bamboo.internal.core.client;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

import org.eclipse.mylyn.builds.core.spi.AbstractConfigurationCache;

/**
 * @author Steffen Pingel
 */
public class BambooConfigurationCache extends AbstractConfigurationCache<BambooConfiguration> {

	public BambooConfigurationCache(File cacheFile) {
		super(cacheFile);
	}

	public BambooConfigurationCache() {
		super();
	}

	@Override
	protected BambooConfiguration createConfiguration() {
		return new BambooConfiguration();
	}

	@Override
	protected BambooConfiguration readConfiguration(ObjectInputStream in) throws IOException, ClassNotFoundException {
		final Object configuration = in.readObject();
		if (configuration instanceof BambooConfiguration) {
			final BambooConfiguration bambooConfiguration = new BambooConfiguration();
			bambooConfiguration.jobNameById = new HashMap<>(((BambooConfiguration) configuration).jobNameById);
			return bambooConfiguration;
		} else {
			return (BambooConfiguration) configuration;
		}
	}

}
