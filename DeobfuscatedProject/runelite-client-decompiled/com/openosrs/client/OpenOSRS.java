/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client;

import com.google.common.base.Strings;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

public class OpenOSRS {
    public static final File SQUIRE_DIR = new File(System.getProperty("user.home"), ".squire");
    public static final File EXTERNALPLUGIN_DIR = new File(SQUIRE_DIR, "plugins");
    public static final String PLUGIN_DEVELOPMENT_PATH = "plugin.development.path";
    public static final String SYSTEM_VERSION;
    public static final String SYSTEM_API_VERSION;
    private static final Properties properties;
    public static String uuid;

    public static String[] getPluginDevelopmentPath() {
        String developmentPluginPaths = System.getenv(PLUGIN_DEVELOPMENT_PATH.replace('.', '_').toUpperCase());
        if (Strings.isNullOrEmpty(developmentPluginPaths)) {
            developmentPluginPaths = properties.getProperty(PLUGIN_DEVELOPMENT_PATH);
        }
        return Strings.isNullOrEmpty(developmentPluginPaths) ? new String[]{} : developmentPluginPaths.split(";");
    }

    public static void preload() {
    }

    static Properties getProperties() {
        return properties;
    }

    static {
        properties = new Properties();
        uuid = UUID.randomUUID().toString();
        try {
            properties.load(OpenOSRS.class.getResourceAsStream("/openosrs.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        SYSTEM_VERSION = properties.getProperty("oprs.version", "0.0.0");
        SYSTEM_API_VERSION = properties.getProperty("oprs.api.version");
    }
}

