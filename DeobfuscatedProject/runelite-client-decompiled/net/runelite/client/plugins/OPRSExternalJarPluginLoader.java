/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.JarPluginLoader
 *  org.pf4j.PluginDescriptor
 *  org.pf4j.PluginManager
 */
package net.runelite.client.plugins;

import java.nio.file.Path;
import net.runelite.client.plugins.OPRSExternalClassLoader;
import org.pf4j.JarPluginLoader;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OPRSExternalJarPluginLoader
extends JarPluginLoader {
    private static final Logger log = LoggerFactory.getLogger(OPRSExternalJarPluginLoader.class);

    public OPRSExternalJarPluginLoader(PluginManager pluginManager) {
        super(pluginManager);
    }

    public ClassLoader loadPlugin(Path pluginPath, PluginDescriptor pluginDescriptor) {
        OPRSExternalClassLoader pluginClassLoader = new OPRSExternalClassLoader(this.pluginManager, pluginDescriptor, ((Object)((Object)this)).getClass().getClassLoader());
        pluginClassLoader.addFile(pluginPath.toFile());
        return pluginClassLoader;
    }
}

