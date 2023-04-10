package me.glindholm.mylyn.build.bamboo.core.internal;

public class BambooServerInfo {
    private String version;

    public BambooServerInfo(final String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
