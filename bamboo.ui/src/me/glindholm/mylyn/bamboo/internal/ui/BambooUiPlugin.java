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

package me.glindholm.mylyn.bamboo.internal.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author Steffen Pingel
 */
public class BambooUiPlugin extends AbstractUIPlugin {

    public static String ID_PLUGIN = "org.eclipse.mylyn.bamboo.ui";

    public BambooUiPlugin() {
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        if (BambooStartup.getInstance() != null) {
            BambooStartup.getInstance().stop();
        }
        super.stop(context);
    }

}
