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

/**
 * @author Steffen Pingel
 */
public class BambooServerInfo {

    public enum Type {
        BAMBOO
    }

    private final String version;

    private final Type type;

    public BambooServerInfo(final Type type, final String version) {
        this.type = type;
        this.version = version;
    }

    public Type getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

}
