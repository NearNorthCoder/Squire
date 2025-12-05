/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.DevelopmentPluginClasspath
 */
package net.runelite.client.plugins;

import org.pf4j.DevelopmentPluginClasspath;

class OPRSExternalPluginClasspath
extends DevelopmentPluginClasspath {
    static final String GRADLE_DEPS_PATH = "build/deps";

    OPRSExternalPluginClasspath() {
        this.addJarsDirectories(new String[]{GRADLE_DEPS_PATH});
    }
}

