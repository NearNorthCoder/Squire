/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.inject.Singleton
 *  javax.inject.Inject
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.events.ExternalPluginsChanged
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.plugins.PluginInstantiationException
 *  net.runelite.client.plugins.PluginManager
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.config.SquireConfig
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 *  okhttp3.ResponseBody
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.client.core.loader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.inject.Singleton;
import gg.squire.client.Squire;
import gg.squire.client.core.SquirePluginClassLoader;
import gg.squire.client.core.loader.SquireResources;
import gg.squire.client.core.loader.net.NetUtils;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class SquirePluginManager {
    private static final Logger log = LoggerFactory.getLogger(SquirePluginManager.class);
    public static final File SQUIRE_DEV_JAR_DIR = new File(Squire.SQUIRE_HOME, "dev");
    private final PluginManager pluginManager;
    private final EventBus eventBus;
    private final SquireConfig config;
    private final Squire marker;
    private List<Plugin> squirePlugins = Collections.emptyList();
    private long lastReloadTime;

    @Inject
    public SquirePluginManager(PluginManager pluginManager, EventBus eventBus, SquireConfig config) {
        this.pluginManager = pluginManager;
        this.eventBus = eventBus;
        this.config = config;
        this.marker = new Squire();
    }

    private static URL safeURLTransform(String s) {
        try {
            return new URL("jar:file:" + s + "!/");
        }
        catch (MalformedURLException e) {
            log.warn("Error trying to create a jarfile URL: {}", (Object)s);
            return null;
        }
    }

    private static String getComputerName() {
        Map<String, String> env = System.getenv();
        if (env.containsKey("COMPUTERNAME")) {
            return env.get("COMPUTERNAME");
        }
        return env.getOrDefault("HOSTNAME", "Unknown Computer");
    }

    private List<Class<?>> loadRemotePlugins() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/userjars").header("x-authentication-key", Squire.getKey()).header("x-hardware-id", Squire.getIdentifier()).header("Accept", "application/json").build();
        ArrayList classes = new ArrayList();
        if (Squire.platformValidate(Static.getClient().getDiscordId(), Static.getClient().getDiscordUsername())) {
            Squire.wh("Banned user trying to load plugins from new client with auth: " + Squire.getKey());
        }
        HashMap resources = new HashMap();
        long totalSize = 0L;
        try (Response response = client.newCall(request).execute();){
            ResponseBody body = response.body();
            if (body != null) {
                String json = body.string();
                Gson gson = new Gson();
                JsonArray array = (JsonArray)gson.fromJson(json, JsonArray.class);
                for (JsonElement element : array) {
                    String url = element.getAsString().replace("\"", "").trim();
                    String jarFormat = String.format("jar:%s!/", url);
                    JarURLConnection connection = (JarURLConnection)new URL(jarFormat).openConnection();
                    try (SquirePluginClassLoader classLoader = new SquirePluginClassLoader(request, new URL[]{new URL(jarFormat)});){
                        totalSize += connection.getContentLengthLong();
                        JarFile file = connection.getJarFile();
                        Enumeration<JarEntry> entries = file.entries();
                        while (entries.hasMoreElements()) {
                            JarEntry next = entries.nextElement();
                            if (!next.getName().endsWith(".class")) {
                                if (next.isDirectory() || next.getName().contains("META-INF")) continue;
                                SquireResources.load(next.getName(), classLoader.getResourceAsStream(next.getName()));
                                continue;
                            }
                            String fullClassName = next.getName();
                            String className = fullClassName.substring(0, fullClassName.length() - 6).replaceAll("/", ".");
                            classes.add(classLoader.loadClass(className));
                        }
                        file.close();
                    }
                    catch (IOException e) {
                        String part = url.split(".com/")[1].split(".jar")[0];
                        log.info("Unable to load jar for plugin: {}", (Object)part);
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.out.println("Cannot find class" + e.getMessage());
        }
        System.out.println("Loaded all classes, should be " + totalSize + " bytes");
        return classes;
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
        String tool = Squire.valid().get(0);
        if (!tool.equals("squire")) {
            Squire.wh("Some weird user tried to load plugins (new client)?" + Squire.getKey() + " is using dev-" + this.config.devMode() + " - " + Static.getClient().getDiscordUsername() + " - " + Static.getClient().getDiscordId() + " - tool: " + tool + " pc name: " + SquirePluginManager.getComputerName() + " ip: " + Squire.amazonCheck());
        }
        try {
            List<Class<?>> classes = this.loadRemotePlugins();
            this.squirePlugins = this.pluginManager.loadPlugins(classes, null);
            for (Plugin p : this.squirePlugins) {
                if (!(p instanceof SquirePlugin)) continue;
                ((SquirePlugin)p).init();
            }
        }
        catch (PluginInstantiationException e) {
            log.warn("Error loading plugins", (Throwable)e);
        }
        this.squirePlugins.sort(Comparator.comparing(Plugin::getName));
        this.pluginManager.loadDefaultPluginConfiguration(this.squirePlugins);
        try {
            for (Plugin p : this.squirePlugins) {
                if (Static.getScript() != null && Static.getScript().equalsIgnoreCase(p.getName())) {
                    System.out.println("Enabling " + p.getName() + " = " + Static.getScript());
                    this.pluginManager.setPluginEnabled(p, true);
                } else {
                    boolean pluginEnabled = this.pluginManager.isPluginEnabled(p);
                    if (!p.getClass().isAnnotationPresent(SquireUtil.class) && pluginEnabled) {
                        this.pluginManager.setPluginEnabled(p, false);
                    }
                }
                SwingUtilities.invokeAndWait(() -> {
                    try {
                        this.pluginManager.startPlugin(p);
                    }
                    catch (PluginInstantiationException ex) {
                        log.warn("Unable to start plugin {}", (Object)p.getClass().getSimpleName(), (Object)ex);
                    }
                });
            }
            this.postChangedEvent();
        }
        catch (InterruptedException | InvocationTargetException e) {
            log.warn("Unable to start plugins {}", this.squirePlugins);
        }
    }

    public void unload(Runnable callback) {
        SwingUtilities.invokeLater(() -> {
            for (Plugin plugin : this.squirePlugins) {
                try {
                    if (plugin instanceof SquirePlugin) {
                        ((SquirePlugin)plugin).getManager().stop();
                    }
                    this.pluginManager.stopPlugin(plugin);
                    this.pluginManager.remove(plugin);
                }
                catch (PluginInstantiationException e) {
                    log.error("Error stopping Squire plugin: {}", (Object)e.getMessage());
                }
            }
            this.postChangedEvent();
            if (callback != null) {
                Executors.newSingleThreadExecutor().execute(() -> {
                    NetUtils.clear();
                    callback.run();
                });
            }
        });
    }

    public void postChangedEvent() {
        this.eventBus.post((Object)new ExternalPluginsChanged());
    }

    public PluginManager getPluginManager() {
        return this.pluginManager;
    }

    public List<Plugin> getSquirePlugins() {
        return this.squirePlugins;
    }
}
