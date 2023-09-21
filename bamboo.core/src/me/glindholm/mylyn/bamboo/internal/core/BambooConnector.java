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

package me.glindholm.mylyn.bamboo.internal.core;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.mylyn.builds.core.IBuildElement;
import org.eclipse.mylyn.builds.core.IBuildServer;
import org.eclipse.mylyn.builds.core.spi.BuildConnector;
import org.eclipse.mylyn.commons.repositories.core.RepositoryLocation;
import org.osgi.framework.Bundle;

import me.glindholm.mylyn.bamboo.internal.core.client.BambooConfigurationCache;

/**
 * @author Markus Knittig
 * @author Steffen Pingel
 */
public class BambooConnector extends BuildConnector {

	protected static File getCacheFile() {
		if (Platform.isRunning()) {
			Bundle bundle = Platform.getBundle(BambooCorePlugin.ID_PLUGIN);
			if (bundle != null) {
				IPath stateLocation = Platform.getStateLocation(bundle);
				IPath cacheFile = stateLocation.append("configuration.obj"); //$NON-NLS-1$
				return cacheFile.toFile();
			}
		}
		return null;
	}

	private final BambooConfigurationCache cache;

	public BambooConnector() {
		this(getCacheFile());
	}

	public BambooConnector(File cacheFile) {
		cache = new BambooConfigurationCache(cacheFile);
	}

	@Override
	public BambooServerBehaviour getBehaviour(RepositoryLocation location) throws CoreException {
		return new BambooServerBehaviour(location, cache);
	}

	@Override
	public IBuildElement getBuildElementFromUrl(IBuildServer server, String url) {
		return null;
	}

}
