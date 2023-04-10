package me.glindholm.mylyn.build.bamboo.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "me.glindholm.mylyn.build.bamboo.ui.internal.messages"; //$NON-NLS-1$

    public static String NewServerWizard_Title;
    public static String NewServerWizard_Message;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }

}
