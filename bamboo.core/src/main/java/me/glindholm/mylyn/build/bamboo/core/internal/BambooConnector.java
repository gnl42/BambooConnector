package me.glindholm.mylyn.build.bamboo.core.internal;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.mylyn.builds.core.IBuildElement;
import org.eclipse.mylyn.builds.core.IBuildServer;
import org.eclipse.mylyn.builds.core.spi.BuildConnector;
import org.eclipse.mylyn.builds.core.spi.BuildServerBehaviour;
import org.eclipse.mylyn.commons.repositories.core.RepositoryLocation;
import org.osgi.framework.Bundle;

import me.glindholm.mylyn.build.bamboo.core.BambooCorePlugin;
import me.glindholm.mylyn.build.bamboo.core.internal.client.BambooConfigurationCache;

public class BambooConnector extends BuildConnector {

    protected static File getCacheFile() {
        if (Platform.isRunning()) {
            final Bundle bundle = Platform.getBundle(BambooCorePlugin.ID_PLUGIN);
            if (bundle != null) {
                final IPath stateLocation = Platform.getStateLocation(bundle);
                final IPath cacheFile = stateLocation.append("configuration.obj"); //$NON-NLS-1$
                return cacheFile.toFile();
            }
        }
        return null;
    }

    private final BambooConfigurationCache cache;

    public BambooConnector() {
        this(getCacheFile());
    }

    public BambooConnector(final File cacheFile) {
        cache = new BambooConfigurationCache(cacheFile);
    }

    @Override
    public BuildServerBehaviour getBehaviour(final RepositoryLocation location) throws CoreException {
        return new BambooServerBehaviour(location, cache);
    }

    @Override
    public IBuildElement getBuildElementFromUrl(final IBuildServer server, final String url) {
        return super.getBuildElementFromUrl(null, url);
    }
}
