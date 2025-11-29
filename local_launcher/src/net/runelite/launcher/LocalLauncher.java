package net.runelite.launcher;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * LocalLauncher - Bypasses Squire authentication and loads plugins locally
 *
 * This launcher:
 * 1. Sets the authentication flag to bypass login
 * 2. Loads plugins from local directory
 * 3. Starts the main RuneLite/Squire client
 *
 * Usage: java -jar squire-local.jar [--plugins-dir <path>]
 */
public class LocalLauncher {

    private static final String PLUGINS_DIR = "local_plugins";
    private static final String AUTH_FLAG_FIELD = "aN";
    private static final String AUTH_TOKEN_FIELD = "aM";

    public static void main(String[] args) throws Exception {
        System.out.println("===========================================");
        System.out.println("  SQUIRE LOCAL LAUNCHER");
        System.out.println("  Auth Bypass + Local Plugin Loading");
        System.out.println("===========================================\n");

        // Parse arguments
        String pluginsDir = PLUGINS_DIR;
        boolean debugMode = false;

        for (int i = 0; i < args.length; i++) {
            if ("--plugins-dir".equals(args[i]) && i + 1 < args.length) {
                pluginsDir = args[++i];
            } else if ("--debug".equals(args[i])) {
                debugMode = true;
            }
        }

        System.out.println("[*] Plugins directory: " + pluginsDir);
        System.out.println("[*] Debug mode: " + debugMode);

        // Step 1: Bypass authentication
        System.out.println("\n[1/4] Bypassing authentication...");
        bypassAuthentication();

        // Step 2: Load local plugins
        System.out.println("\n[2/4] Loading local plugins...");
        List<URL> pluginUrls = loadLocalPlugins(pluginsDir);
        System.out.println("     Loaded " + pluginUrls.size() + " plugin JAR(s)");

        // Step 3: Set up classpath
        System.out.println("\n[3/4] Setting up classpath...");
        addPluginsToClasspath(pluginUrls);

        // Step 4: Launch the main client
        System.out.println("\n[4/4] Launching client...\n");
        System.out.println("===========================================\n");

        // Call the original launcher main method
        launchOriginal(args);
    }

    /**
     * Bypass authentication by setting the aN flag to true
     * and providing a fake token
     */
    private static void bypassAuthentication() {
        try {
            Class<?> launcherClass = Class.forName("net.runelite.launcher.Launcher");

            // Set authentication flag to true
            try {
                Field authField = launcherClass.getDeclaredField(AUTH_FLAG_FIELD);
                authField.setAccessible(true);
                authField.setBoolean(null, true);
                System.out.println("     [OK] Set " + AUTH_FLAG_FIELD + " = true");
            } catch (NoSuchFieldException e) {
                System.out.println("     [WARN] Field " + AUTH_FLAG_FIELD + " not found, trying alternative");
                // Try to find the field by scanning
                for (Field f : launcherClass.getDeclaredFields()) {
                    if (f.getType() == boolean.class) {
                        f.setAccessible(true);
                        f.setBoolean(null, true);
                        System.out.println("     [OK] Set boolean field " + f.getName() + " = true");
                    }
                }
            }

            // Set a fake auth token
            try {
                Field tokenField = launcherClass.getDeclaredField(AUTH_TOKEN_FIELD);
                tokenField.setAccessible(true);
                tokenField.set(null, "local_bypass_token");
                System.out.println("     [OK] Set fake auth token");
            } catch (NoSuchFieldException e) {
                System.out.println("     [INFO] Token field not found, may not be needed");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("     [ERR] Launcher class not found: " + e.getMessage());
            System.out.println("     Make sure you're running from the Squire JAR");
        } catch (Exception e) {
            System.out.println("     [ERR] Failed to bypass auth: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Load all plugin JARs from the local directory
     */
    private static List<URL> loadLocalPlugins(String pluginsDir) {
        List<URL> urls = new ArrayList<>();

        Path dir = Paths.get(pluginsDir);
        if (!Files.exists(dir)) {
            System.out.println("     [WARN] Plugins directory not found: " + dir.toAbsolutePath());
            System.out.println("     Creating directory...");
            try {
                Files.createDirectories(dir);
            } catch (Exception e) {
                System.out.println("     [ERR] Failed to create directory: " + e.getMessage());
            }
            return urls;
        }

        try {
            Files.walk(dir)
                .filter(p -> p.toString().endsWith(".jar"))
                .forEach(jarPath -> {
                    try {
                        URL url = jarPath.toUri().toURL();
                        urls.add(url);
                        System.out.println("     [+] " + jarPath.getFileName());
                    } catch (Exception e) {
                        System.out.println("     [-] Failed to load: " + jarPath);
                    }
                });
        } catch (Exception e) {
            System.out.println("     [ERR] Failed to scan plugins: " + e.getMessage());
        }

        return urls;
    }

    /**
     * Add plugin JARs to the system classloader
     */
    private static void addPluginsToClasspath(List<URL> pluginUrls) {
        if (pluginUrls.isEmpty()) {
            System.out.println("     [INFO] No plugins to add");
            return;
        }

        try {
            // Get the system classloader
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

            if (systemClassLoader instanceof URLClassLoader) {
                // For Java 8
                Method addURL = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
                addURL.setAccessible(true);

                for (URL url : pluginUrls) {
                    addURL.invoke(systemClassLoader, url);
                }
                System.out.println("     [OK] Added plugins via URLClassLoader");
            } else {
                // For Java 9+, use instrumentation or custom classloader
                System.out.println("     [INFO] Java 9+ detected, plugins will be loaded via plugin system");
            }
        } catch (Exception e) {
            System.out.println("     [WARN] Could not modify classloader: " + e.getMessage());
            System.out.println("     Plugins will need to be loaded by the client");
        }
    }

    /**
     * Launch the original Squire launcher
     */
    private static void launchOriginal(String[] args) {
        try {
            Class<?> launcherClass = Class.forName("net.runelite.launcher.Launcher");
            Method mainMethod = launcherClass.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) args);
        } catch (ClassNotFoundException e) {
            System.out.println("[ERR] Original Launcher not found!");
            System.out.println("Make sure LocalLauncher is packaged with the Squire JAR");
        } catch (Exception e) {
            System.out.println("[ERR] Failed to launch: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
