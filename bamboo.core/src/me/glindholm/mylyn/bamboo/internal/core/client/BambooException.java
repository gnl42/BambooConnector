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

/**
 * @author Steffen Pingel
 */
public class BambooException extends Exception {

	private static final long serialVersionUID = -4419540659554920327L;

	public BambooException() {
	}

	public BambooException(String message) {
		super(message);
	}

	public BambooException(Throwable cause) {
		super(cause.getMessage(), cause);
	}

	public BambooException(String message, Throwable cause) {
		super(message, cause);
	}

}
