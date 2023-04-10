package me.glindholm.mylyn.build.bamboo.core.internal.client;

public class BambooException extends Exception {
    private static final long serialVersionUID = 1L;

    public BambooException() {
    }

    public BambooException(final String message) {
        super(message);
    }

    public BambooException(final Throwable cause) {
        super(cause);
    }

    public BambooException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BambooException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
