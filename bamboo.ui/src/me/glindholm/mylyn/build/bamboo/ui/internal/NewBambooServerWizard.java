package me.glindholm.mylyn.build.bamboo.ui.internal;

import org.eclipse.mylyn.builds.core.IBuildServer;
import org.eclipse.mylyn.builds.ui.BuildsUi;
import org.eclipse.mylyn.builds.ui.spi.BuildServerWizard;
import org.eclipse.mylyn.builds.ui.spi.BuildServerWizardPage;

import me.glindholm.mylyn.build.bamboo.core.BambooCorePlugin;

public class NewBambooServerWizard extends BuildServerWizard {

    public NewBambooServerWizard(final IBuildServer server) {
        super(server);
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
