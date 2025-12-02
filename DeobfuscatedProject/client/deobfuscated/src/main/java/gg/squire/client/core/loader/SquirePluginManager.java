/*
 * SquirePluginManager - Bypassed version
 *
 * This replaces the original to load plugins from local directory
 * instead of from the Squire API.
 *
 * TODO: Re-enable API loading when ready
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class SquirePluginManager {
    private static final Logger log = LoggerFactory.getLogger(SquirePluginManager.class);

    // TODO: Change this path to your captured plugins directory
    // This is where the client will load plugin JARs from instead of the API
    public static final String LOCAL_PLUGIN_DIR = "C:\\Users\\mikeh\\.squire\\captured_jars\\2025-11-28_233634";

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
        } catch (MalformedURLException e) {
            log.warn("Error trying to create a jarfile URL: {}", s);
            return null;
        }
    }

    /**
     * BYPASSED: Load plugins from local directory instead of API
     *
     * TODO: Re-enable API loading when ready
     * Original API: https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/userjars
     */
    private List<Class<?>> loadRemotePlugins() {
        log.info("===========================================");
        log.info("LOADING PLUGINS FROM LOCAL DIRECTORY");
        log.info("Path: {}", LOCAL_PLUGIN_DIR);
        log.info("===========================================");

        ArrayList<Class<?>> classes = new ArrayList<>();
        File pluginDir = new File(LOCAL_PLUGIN_DIR);

        if (!pluginDir.exists() || !pluginDir.isDirectory()) {
            log.error("Plugin directory does not exist: {}", LOCAL_PLUGIN_DIR);
            log.error("Please update LOCAL_PLUGIN_DIR in SquirePluginManager.java");
            return classes;
        }

        File[] jarFiles = pluginDir.listFiles((dir, name) -> name.endsWith(".jar"));
        if (jarFiles == null || jarFiles.length == 0) {
            log.warn("No JAR files found in plugin directory: {}", LOCAL_PLUGIN_DIR);
            return classes;
        }

        log.info("Found {} JAR files to load", jarFiles.length);

        for (File jarFile : jarFiles) {
            log.info("Loading plugin JAR: {}", jarFile.getName());
            try {
                String jarPath = jarFile.getAbsolutePath();
                String jarFormat = String.format("jar:file:%s!/", jarPath);
                URL jarUrl = new URL(jarFormat);

                try (SquirePluginClassLoader classLoader = new SquirePluginClassLoader(null, new URL[]{jarUrl});
                     JarFile jar = new JarFile(jarFile)) {

                    Enumeration<JarEntry> entries = jar.entries();
                    int classCount = 0;

                    while (entries.hasMoreElements()) {
                        JarEntry entry = entries.nextElement();

                        if (entry.getName().endsWith(".class")) {
                            String fullClassName = entry.getName();
                            String className = fullClassName.substring(0, fullClassName.length() - 6).replaceAll("/", ".");

                            try {
                                Class<?> clazz = classLoader.loadClass(className);
                                classes.add(clazz);
                                classCount++;
                            } catch (ClassNotFoundException | NoClassDefFoundError e) {
                                // Some classes may have missing dependencies, skip them
                                log.debug("Could not load class {}: {}", className, e.getMessage());
                            }
                        } else if (!entry.isDirectory() && !entry.getName().contains("META-INF")) {
                            // Load resources
                            try {
                                SquireResources.load(entry.getName(), classLoader.getResourceAsStream(entry.getName()));
                            } catch (Exception e) {
                                log.debug("Could not load resource {}: {}", entry.getName(), e.getMessage());
                            }
                        }
                    }

                    log.info("Loaded {} classes from {}", classCount, jarFile.getName());
                }
            } catch (IOException e) {
                log.warn("Error loading plugin JAR {}: {}", jarFile.getName(), e.getMessage());
            }
        }

        log.info("===========================================");
        log.info("PLUGIN LOADING COMPLETE");
        log.info("Total classes loaded: {}", classes.size());
        log.info("===========================================");

        return classes;
    }

    /*
     * TODO: Re-enable API-based plugin loading when ready
     * ====================================================================
     * Original loadRemotePlugins() implementation:
     *
     * private List<Class<?>> loadRemotePlugins() {
     *     OkHttpClient client = new OkHttpClient();
     *     Request request = new Request.Builder()
     *         .url("https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/userjars")
     *         .header("x-authentication-key", Squire.getKey())
     *         .header("x-hardware-id", Squire.getIdentifier())
     *         .header("Accept", "application/json")
     *         .build();
     *     ArrayList classes = new ArrayList();
     *     if (Squire.platformValidate(Static.getClient().getDiscordId(), Static.getClient().getDiscordUsername())) {
     *         Squire.wh("Banned user trying to load plugins from new client with auth: " + Squire.getKey());
     *     }
     *     HashMap resources = new HashMap();
     *     long totalSize = 0L;
     *     try (Response response = client.newCall(request).execute();){
     *         ResponseBody body = response.body();
     *         if (body != null) {
     *             String json = body.string();
     *             Gson gson = new Gson();
     *             JsonArray array = (JsonArray)gson.fromJson(json, JsonArray.class);
     *             for (JsonElement element : array) {
     *                 String url = element.getAsString().replace("\"", "").trim();
     *                 String jarFormat = String.format("jar:%s!/", url);
     *                 JarURLConnection connection = (JarURLConnection)new URL(jarFormat).openConnection();
     *                 try (SquirePluginClassLoader classLoader = new SquirePluginClassLoader(request, new URL[]{new URL(jarFormat)});){
     *                     totalSize += connection.getContentLengthLong();
     *                     JarFile file = connection.getJarFile();
     *                     Enumeration<JarEntry> entries = file.entries();
     *                     while (entries.hasMoreElements()) {
     *                         JarEntry next = entries.nextElement();
     *                         if (!next.getName().endsWith(".class")) {
     *                             if (next.isDirectory() || next.getName().contains("META-INF")) continue;
     *                             SquireResources.load(next.getName(), classLoader.getResourceAsStream(next.getName()));
     *                             continue;
     *                         }
     *                         String fullClassName = next.getName();
     *                         String className = fullClassName.substring(0, fullClassName.length() - 6).replaceAll("/", ".");
     *                         classes.add(classLoader.loadClass(className));
     *                     }
     *                     file.close();
     *                 }
     *                 catch (IOException e) {
     *                     String part = url.split(".com/")[1].split(".jar")[0];
     *                     log.info("Unable to load jar for plugin: {}", (Object)part);
     *                 }
     *             }
     *         }
     *     }
     *     catch (IOException e) {
     *         e.printStackTrace();
     *     }
     *     catch (ClassNotFoundException e) {
     *         System.out.println("Cannot find class" + e.getMessage());
     *     }
     *     System.out.println("Loaded all classes, should be " + totalSize + " bytes");
     *     return classes;
     * }
     * ====================================================================
     */

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

    /*
     * TODO: Re-enable original load() with anti-debug checks when ready
     * ====================================================================
     * Original load() implementation:
     *
     * private void load() {
     *     String tool = Squire.valid().get(0);
     *     if (!tool.equals("squire")) {
     *         Squire.wh("Some weird user tried to load plugins (new client)?" + Squire.getKey() +
     *             " is using dev-" + this.config.devMode() + " - " + Static.getClient().getDiscordUsername() +
     *             " - " + Static.getClient().getDiscordId() + " - tool: " + tool +
     *             " pc name: " + SquirePluginManager.getComputerName() + " ip: " + Squire.amazonCheck());
     *     }
     *     // ... rest of implementation
     * }
     * ====================================================================
     */

    private void load() {
        log.info("SquirePluginManager.load() - Loading plugins from local directory");
        // BYPASSED: Removed anti-debug tool check (Squire.valid())

        try {
            List<Class<?>> classes = this.loadRemotePlugins();
            this.squirePlugins = this.pluginManager.loadPlugins(classes, null);

            for (Plugin p : this.squirePlugins) {
                if (p instanceof SquirePlugin) {
                    ((SquirePlugin) p).init();
                }
            }
        } catch (PluginInstantiationException e) {
            log.warn("Error loading plugins", e);
        }

        this.squirePlugins.sort(Comparator.comparing(Plugin::getName));
        this.pluginManager.loadDefaultPluginConfiguration(this.squirePlugins);

        try {
            for (Plugin p : this.squirePlugins) {
                if (Static.getScript() != null && Static.getScript().equalsIgnoreCase(p.getName())) {
                    log.info("Enabling {} = {}", p.getName(), Static.getScript());
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
                    } catch (PluginInstantiationException ex) {
                        log.warn("Unable to start plugin {}", p.getClass().getSimpleName(), ex);
                    }
                });
            }
            this.postChangedEvent();
        } catch (InterruptedException | InvocationTargetException e) {
            log.warn("Unable to start plugins {}", this.squirePlugins);
        }
    }

    public void unload(Runnable callback) {
        SwingUtilities.invokeLater(() -> {
            for (Plugin plugin : this.squirePlugins) {
                try {
                    if (plugin instanceof SquirePlugin) {
                        ((SquirePlugin) plugin).getManager().stop();
                    }
                    this.pluginManager.stopPlugin(plugin);
                    this.pluginManager.remove(plugin);
                } catch (PluginInstantiationException e) {
                    log.error("Error stopping Squire plugin: {}", e.getMessage());
                }
            }
            this.postChangedEvent();
            if (callback != null) {
                Executors.newSingleThreadExecutor().execute(() -> {
                    // NetUtils.clear(); // Skip network cleanup for local loading
                    callback.run();
                });
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
