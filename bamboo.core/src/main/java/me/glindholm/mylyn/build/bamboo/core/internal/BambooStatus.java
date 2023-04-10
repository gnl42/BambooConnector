package me.glindholm.mylyn.build.bamboo.core.internal;

import org.eclipse.core.runtime.Status;

import me.glindholm.mylyn.build.bamboo.model.ServerInfo;

public class BambooStatus extends Status {

    private ServerInfo info;

    public BambooStatus(final int severity, final String pluginId, final String message) {
        super(severity, pluginId, message);
    }

    public BambooStatus(final int severity, final String pluginId, final String message, final Throwable exception) {
        super(severity, pluginId, message, exception);
    }

    public BambooStatus(final int severity, final String pluginId, final int code, final String message, final Throwable exception) {
        super(severity, pluginId, code, message, exception);
    }

    void setInfo(final ServerInfo info) {
        this.info = info;
    }

    public ServerInfo getInfo() {
        return info;
    }

    public BambooStatus(final int severity, final Class<?> caller, final String message) {
        super(severity, caller, message);
    }

    public BambooStatus(final int severity, final Class<?> caller, final String message, final Throwable exception) {
        super(severity, caller, message, exception);
    }

    public BambooStatus(final int severity, final Class<?> caller, final int code, final String message, final Throwable exception) {
        super(severity, caller, code, message, exception);

    }

}
