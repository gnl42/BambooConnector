package me.glindholm.mylyn.build.bamboo.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import me.glindholm.mylyn.build.bamboo.core.internal.BambooConnector;
import me.glindholm.mylyn.build.bamboo.core.internal.client.BambooException;

public class BambooCorePlugin implements BundleActivator {

    public static final String ID_PLUGIN = "org.eclipse.mylyn.hudson.core"; //$NON-NLS-1$

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

    public static CoreException toCoreException(final BambooException e) {
        return new CoreException(new Status(IStatus.ERROR, ID_PLUGIN, "Unexpected error: " + e.getMessage(), e)); //$NON-NLS-1$
    }

}
