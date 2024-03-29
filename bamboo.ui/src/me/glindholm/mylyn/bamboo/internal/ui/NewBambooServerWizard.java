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

import org.eclipse.mylyn.builds.core.IBuildServer;
import org.eclipse.mylyn.builds.ui.BuildsUi;
import org.eclipse.mylyn.builds.ui.spi.BuildServerWizard;
import org.eclipse.mylyn.builds.ui.spi.BuildServerWizardPage;

import me.glindholm.mylyn.bamboo.internal.core.BambooCorePlugin;

/**
 * @author Steffen Pingel
 * @author Torkild U. Resheim
 */
public class NewBambooServerWizard extends BuildServerWizard {

    /**
     * Creates a new instance using the supplied build server model. It is assumed that this describes a
     * Bamboo server.
     */
    public NewBambooServerWizard(final IBuildServer model) {
        super(model);
    }

    /**
     * Creates a new instance using the Bamboo server connector.
     */
    public NewBambooServerWizard() {
        super(BuildsUi.createServer(BambooCorePlugin.CONNECTOR_KIND));
    }

    @Override
    protected void initPage(final BuildServerWizardPage page) {
        page.setTitle(Messages.NewServerWizard_Title);
        page.setMessage(Messages.NewServerWizard_Message);
    }

}
