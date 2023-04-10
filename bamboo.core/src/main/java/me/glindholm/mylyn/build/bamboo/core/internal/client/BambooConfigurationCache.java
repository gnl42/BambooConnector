package me.glindholm.mylyn.build.bamboo.core.internal.client;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.eclipse.mylyn.builds.core.spi.AbstractConfigurationCache;

public class BambooConfigurationCache extends AbstractConfigurationCache<BambooConfiguration> {

    public BambooConfigurationCache(final File cacheFile) {
        super(cacheFile);
    }

    @Override
    protected BambooConfiguration createConfiguration() {
        return new BambooConfiguration();
    }

    @Override
    protected BambooConfiguration readConfiguration(final ObjectInputStream in) throws IOException, ClassNotFoundException {
        return (BambooConfiguration) in.readObject();
    }

}
