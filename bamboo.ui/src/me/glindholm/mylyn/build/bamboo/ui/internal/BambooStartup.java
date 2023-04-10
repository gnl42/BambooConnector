package me.glindholm.mylyn.build.bamboo.ui.internal;

import org.eclipse.mylyn.builds.ui.BuildsUiStartup;

public class BambooStartup extends BuildsUiStartup {

    public static BambooStartup instance;

    public BambooStartup() {
        instance = this;
    }

    @Override
    public void lazyStartup() {

    }

    public void stop() {
        // TODO Auto-generated method stub
    }

    public static BambooStartup getInstance() {
        return instance;
    }

}
