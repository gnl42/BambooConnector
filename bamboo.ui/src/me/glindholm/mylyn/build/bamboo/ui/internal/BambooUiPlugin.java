package me.glindholm.mylyn.build.bamboo.ui.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class BambooUiPlugin extends AbstractUIPlugin {

    public static String ID_PLUGIN = "me.glindholm.mylyn.build.bamboo.ui";

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
