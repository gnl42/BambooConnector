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

package me.glindholm.mylyn.bamboo.core;

import java.io.File;

import org.eclipse.mylyn.builds.core.spi.BuildConnector;

import me.glindholm.mylyn.bamboo.internal.core.BambooConnector;

/**
 * @author Steffen Pingel
 */
public class BambooCore {

    public static BuildConnector createConnector(final File cacheFile) {
        return new BambooConnector(cacheFile);
    }

}
