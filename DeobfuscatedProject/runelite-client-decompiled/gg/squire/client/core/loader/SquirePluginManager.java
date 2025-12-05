/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  javax.inject.Inject
 */
package gg.squire.client.core.loader;

import com.google.inject.Singleton;
import gg.squire.client.Squire;
import gg.squire.client.core.SquirePluginClassLoader;
import gg.squire.client.core.loader.SquireResources;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.events.ExternalPluginsChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;
import net.unethicalite.client.Static;
import net.unethicalite.client.config.SquireConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class SquirePluginManager {
    private static final Logger log = LoggerFactory.getLogger(SquirePluginManager.class);
    public static final String LOCAL_PLUGIN_DIR = "C:\\Users\\mikeh\\.squire\\captured_jars\\2025-11-28_233634";
    public static final File SQUIRE_DEV_JAR_DIR = new File(Squire.SQUIRE_HOME, "dev");
    private final PluginManager pluginManager;
    private final EventBus eventBus;
    private final SquireConfig config;
    private final Squire marker;
    private List<Plugin> squirePlugins = Collections.emptyList();
    private long lastReloadTime;

    @Inject
    public SquirePluginManager(PluginManager pluginManager, EventBus eventBus, SquireConfig squireConfig) {
        this.pluginManager = pluginManager;
        this.eventBus = eventBus;
        this.config = squireConfig;
        this.marker = new Squire();
    }

    private static URL safeURLTransform(String string) {
        try {
            return new URL("jar:file:" + string + "!/");
        }
        catch (MalformedURLException malformedURLException) {
            log.warn("Error trying to create a jarfile URL: {}", (Object)string);
            return null;
        }
    }

    private List<Class<?>> loadRemotePlugins() {
        log.info("===========================================");
        log.info("LOADING PLUGINS FROM LOCAL DIRECTORY");
        log.info("Path: {}", (Object)LOCAL_PLUGIN_DIR);
        log.info("===========================================");
        ArrayList arrayList = new ArrayList();
        File file2 = new File(LOCAL_PLUGIN_DIR);
        if (!file2.exists() || !file2.isDirectory()) {
            log.error("Plugin directory does not exist: {}", (Object)LOCAL_PLUGIN_DIR);
            log.error("Please update LOCAL_PLUGIN_DIR in SquirePluginManager.java");
            return arrayList;
        }
        File[] fileArray = file2.listFiles((file, string) -> string.endsWith(".jar"));
        if (fileArray == null || fileArray.length == 0) {
            log.warn("No JAR files found in plugin directory: {}", (Object)LOCAL_PLUGIN_DIR);
            return arrayList;
        }
        log.info("Found {} JAR files to load", (Object)fileArray.length);
        for (File file3 : fileArray) {
            log.info("Loading plugin JAR: {}", (Object)file3.getName());
            try {
                String string2 = file3.getAbsolutePath();
                String string3 = String.format("jar:file:%s!/", string2);
                URL uRL = new URL(string3);
                try (SquirePluginClassLoader squirePluginClassLoader = new SquirePluginClassLoader(null, new URL[]{uRL});
                     JarFile jarFile = new JarFile(file3);){
                    Enumeration<JarEntry> enumeration = jarFile.entries();
                    int n = 0;
                    while (enumeration.hasMoreElements()) {
                        JarEntry jarEntry = enumeration.nextElement();
                        if (jarEntry.getName().endsWith(".class")) {
                            String string4 = jarEntry.getName();
                            String string5 = string4.substring(0, string4.length() - 6).replaceAll("/", ".");
                            try {
                                Class<?> clazz = squirePluginClassLoader.loadClass(string5);
                                arrayList.add(clazz);
                                ++n;
                            }
                            catch (ClassNotFoundException | NoClassDefFoundError throwable) {
                                log.debug("Could not load class {}: {}", (Object)string5, (Object)throwable.getMessage());
                            }
                            continue;
                        }
                        if (jarEntry.isDirectory() || jarEntry.getName().contains("META-INF")) continue;
                        try {
                            SquireResources.load(jarEntry.getName(), squirePluginClassLoader.getResourceAsStream(jarEntry.getName()));
                        }
                        catch (Exception exception) {
                            log.debug("Could not load resource {}: {}", (Object)jarEntry.getName(), (Object)exception.getMessage());
                        }
                    }
                    log.info("Loaded {} classes from {}", (Object)n, (Object)file3.getName());
                }
            }
            catch (IOException iOException) {
                log.warn("Error loading plugin JAR {}: {}", (Object)file3.getName(), (Object)iOException.getMessage());
            }
        }
        log.info("===========================================");
        log.info("PLUGIN LOADING COMPLETE");
        log.info("Total classes loaded: {}", (Object)arrayList.size());
        log.info("===========================================");
        return arrayList;
    }

    private long timeSinceReload() {
        return System.currentTimeMillis() - this.lastReloadTime;
    }

    private boolean isReloading() {
        return this.timeSinceReload() < 5000L;
    }

    public void reload() {
        if (this.isReloading()) {
            return;
        }
        Squire.setReloading(true);
        this.lastReloadTime = System.currentTimeMillis();
        SquireResources.clear();
        this.unload(() -> {
            Squire.setReloading(false);
            this.load();
        });
    }

    private void load() {
        log.info("SquirePluginManager.load() - Loading plugins from local directory");
        try {
            List<Class<?>> list = this.loadRemotePlugins();
            this.squirePlugins = this.pluginManager.loadPlugins(list, null);
            for (Plugin plugin : this.squirePlugins) {
                if (!(plugin instanceof SquirePlugin)) continue;
                ((SquirePlugin)plugin).init();
            }
        }
        catch (PluginInstantiationException pluginInstantiationException) {
            log.warn("Error loading plugins", pluginInstantiationException);
        }
        this.squirePlugins.sort(Comparator.comparing(Plugin::getName));
        this.pluginManager.loadDefaultPluginConfiguration(this.squirePlugins);
        try {
            for (Plugin plugin : this.squirePlugins) {
                if (Static.getScript() != null && Static.getScript().equalsIgnoreCase(plugin.getName())) {
                    log.info("Enabling {} = {}", (Object)plugin.getName(), (Object)Static.getScript());
                    this.pluginManager.setPluginEnabled(plugin, true);
                } else {
                    boolean bl = this.pluginManager.isPluginEnabled(plugin);
                    if (!plugin.getClass().isAnnotationPresent(SquireUtil.class) && bl) {
                        this.pluginManager.setPluginEnabled(plugin, false);
                    }
                }
                SwingUtilities.invokeAndWait(() -> {
                    try {
                        this.pluginManager.startPlugin(plugin);
                    }
                    catch (PluginInstantiationException pluginInstantiationException) {
                        log.warn("Unable to start plugin {}", (Object)plugin.getClass().getSimpleName(), (Object)pluginInstantiationException);
                    }
                });
            }
            this.postChangedEvent();
        }
        catch (InterruptedException | InvocationTargetException exception) {
            log.warn("Unable to start plugins {}", (Object)this.squirePlugins);
        }
    }

    public void unload(Runnable runnable) {
        SwingUtilities.invokeLater(() -> {
            for (Plugin plugin : this.squirePlugins) {
                try {
                    if (plugin instanceof SquirePlugin) {
                        ((SquirePlugin)plugin).getManager().stop();
                    }
                    this.pluginManager.stopPlugin(plugin);
                    this.pluginManager.remove(plugin);
                }
                catch (PluginInstantiationException pluginInstantiationException) {
                    log.error("Error stopping Squire plugin: {}", (Object)pluginInstantiationException.getMessage());
                }
            }
            this.postChangedEvent();
            if (runnable != null) {
                Executors.newSingleThreadExecutor().execute(() -> runnable.run());
            }
        });
    }

    public void postChangedEvent() {
        this.eventBus.post(new ExternalPluginsChanged());
    }

    public PluginManager getPluginManager() {
        return this.pluginManager;
    }

    public List<Plugin> getSquirePlugins() {
        return this.squirePlugins;
    }
}

