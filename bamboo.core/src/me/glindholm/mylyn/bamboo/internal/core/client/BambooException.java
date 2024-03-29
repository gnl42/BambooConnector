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
public class BambooException extends Exception {

    private static final long serialVersionUID = -4419540659554920327L;

    public BambooException() {
    }

    public BambooException(final String message) {
        super(message);
    }

    public BambooException(final Throwable cause) {
        super(cause.getMessage(), cause);
    }

    public BambooException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
