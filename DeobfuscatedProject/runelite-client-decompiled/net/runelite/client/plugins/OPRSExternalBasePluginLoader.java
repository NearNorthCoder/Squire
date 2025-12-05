/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.BasePluginLoader
 *  org.pf4j.PluginClassLoader
 *  org.pf4j.PluginClasspath
 *  org.pf4j.PluginDescriptor
 *  org.pf4j.PluginManager
 */
package net.runelite.client.plugins;

import java.nio.file.Path;
import net.runelite.client.plugins.OPRSExternalClassLoader;
import org.pf4j.BasePluginLoader;
import org.pf4j.PluginClassLoader;
import org.pf4j.PluginClasspath;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OPRSExternalBasePluginLoader
extends BasePluginLoader {
    private static final Logger log = LoggerFactory.getLogger(OPRSExternalBasePluginLoader.class);

    OPRSExternalBasePluginLoader(PluginManager pluginManager, PluginClasspath pluginClasspath) {
        super(pluginManager, pluginClasspath);
    }

    protected PluginClassLoader createPluginClassLoader(Path pluginPath, PluginDescriptor pluginDescriptor) {
        return new OPRSExternalClassLoader(this.pluginManager, pluginDescriptor, ((Object)((Object)this)).getClass().getClassLoader());
    }
}

