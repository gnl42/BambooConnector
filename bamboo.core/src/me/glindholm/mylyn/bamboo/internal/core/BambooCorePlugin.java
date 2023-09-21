/*******************************************************************************
 * Copyright © 2010, 2013 Markus Knittig and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *     Markus Knittig - initial API and implementation
 *******************************************************************************/

package me.glindholm.mylyn.bamboo.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author Markus Knittig
 */
public class BambooCorePlugin implements BundleActivator {

    public static final String ID_PLUGIN = "me.glindholm.mylyn.bamboo.core"; //$NON-NLS-1$

    public static final String CONNECTOR_KIND = "org.eclipse.mylyn.bamboo"; //$NON-NLS-1$

    private static BambooCorePlugin plugin;

    private BambooConnector connector;

    @Override
    public void start(final BundleContext context) throws Exception {
        plugin = this;
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
    }

    /**
     * Returns the shared instance
     */
    public static BambooCorePlugin getDefault() {
        return plugin;
    }

    public BambooConnector getConnector() {
        if (connector == null) {
            connector = new BambooConnector();
        }
        return connector;
    }

    void setConnector(final BambooConnector connector) {
        this.connector = connector;
    }

    public static CoreException toCoreException(final Exception e) {
        return new CoreException(new Status(IStatus.ERROR, ID_PLUGIN, "Unexpected error: " + e.getMessage(), e)); //$NON-NLS-1$
    }

}
