package net.runelite.launcher;

import net.runelite.launcher.logging.NetworkLoggingInterceptor;
import net.runelite.launcher.logging.LoggingProxyServer;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Wrapper launcher that enables network logging before starting the main launcher.
 * This ensures all HTTP requests and responses are logged in clear text.
 *
 * Uses multiple approaches to capture HTTP traffic:
 * 1. System proxy server for transparent interception
 * 2. Reflection to patch OkHttpClient instances
 * 3. NetworkLoggingInterceptor for direct interception
 */
public class LauncherWithLogging {

    private static final NetworkLoggingInterceptor LOGGING_INTERCEPTOR = new NetworkLoggingInterceptor();
    private static final int PROXY_PORT = 18888;
    private static volatile boolean interceptorInstalled = false;
    private static LoggingProxyServer proxyServer;

    public static void main(String[] args) throws Exception {
        printBanner();

        System.out.println("[NetworkLogger] Initializing network logging...");

        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n═══════════════════════════════════════════════════════════════════════════════");
            System.out.println("Network logging session ended. Check logs at: ~/.squire/logs/network_*.log");
            System.out.println("═══════════════════════════════════════════════════════════════════════════════\n");
            if (proxyServer != null) {
                proxyServer.stop();
            }
        }));

        // Strategy 1: Start a proxy server to intercept HTTP traffic
        try {
            System.out.println("[NetworkLogger] Starting logging proxy server...");
            proxyServer = new LoggingProxyServer(PROXY_PORT);
            proxyServer.startAndConfigure();
            System.out.println("[NetworkLogger] Proxy server started on port " + PROXY_PORT);
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: Could not start proxy server: " + e.getMessage());
        }

        // Strategy 2: Patch OkHttpClient to use our proxy and interceptor
        try {
            patchOkHttpDefaults();
            System.out.println("[NetworkLogger] OkHttpClient defaults patched!");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: Could not patch OkHttpClient: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("[NetworkLogger] Launching Squire...\n");

        // Call the original launcher
        Launcher.main(args);
    }

    /**
     * Patches OkHttpClient defaults to use our proxy and interceptor.
     */
    private static void patchOkHttpDefaults() throws Exception {
        System.out.println("[NetworkLogger] Configuring OkHttp to use logging proxy...");

        // Create a test client to verify the configuration works
        Proxy loggingProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", PROXY_PORT));

        OkHttpClient testClient = new OkHttpClient.Builder()
            .addInterceptor(LOGGING_INTERCEPTOR)
            .proxy(loggingProxy)
            .build();

        System.out.println("[NetworkLogger] Test client created with interceptor and proxy");

        // Try to patch static OkHttpClient fields in Launcher and utility classes
        patchStaticClients();

        interceptorInstalled = true;
    }

    /**
     * Attempts to patch static OkHttpClient fields in the Launcher and related classes.
     */
    private static void patchStaticClients() {
        System.out.println("[NetworkLogger] Scanning for static OkHttpClient fields...");

        // List of classes that might have OkHttpClient fields
        String[] classesToCheck = {
            "net.runelite.launcher.Launcher",
            "net.runelite.launcher.utils.S3Utils",
            "net.runelite.launcher.utils.GitHubUtils",
            "c.r.m.a"  // Obfuscated class from Squire
        };

        Proxy loggingProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", PROXY_PORT));

        for (String className : classesToCheck) {
            try {
                Class<?> clazz = Class.forName(className);
                patchOkHttpFieldsInClass(clazz, loggingProxy);
            } catch (ClassNotFoundException e) {
                System.out.println("[NetworkLogger] Class not found (expected): " + className);
            } catch (Exception e) {
                System.err.println("[NetworkLogger] Error patching " + className + ": " + e.getMessage());
            }
        }
    }

    /**
     * Patches all OkHttpClient fields in a class to use our interceptor.
     */
    private static void patchOkHttpFieldsInClass(Class<?> clazz, Proxy proxy) throws Exception {
        for (Field field : clazz.getDeclaredFields()) {
            if (OkHttpClient.class.isAssignableFrom(field.getType())) {
                System.out.println("[NetworkLogger] Found OkHttpClient field: " + clazz.getSimpleName() + "." + field.getName());

                if (Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);

                    // Try to read current value
                    OkHttpClient currentClient = (OkHttpClient) field.get(null);

                    // Create a new client with our interceptor and proxy
                    OkHttpClient.Builder builder = new OkHttpClient.Builder()
                        .addInterceptor(LOGGING_INTERCEPTOR);

                    if (proxy != null) {
                        builder.proxy(proxy);
                    }

                    // Copy settings from current client if it exists
                    if (currentClient != null) {
                        builder.connectTimeout(currentClient.connectTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)
                               .readTimeout(currentClient.readTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)
                               .writeTimeout(currentClient.writeTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
                    }

                    OkHttpClient newClient = builder.build();

                    // Try to remove final modifier
                    if (Modifier.isFinal(field.getModifiers())) {
                        removeFinalModifier(field);
                    }

                    field.set(null, newClient);
                    System.out.println("[NetworkLogger] Successfully patched: " + clazz.getSimpleName() + "." + field.getName());
                }
            }
        }
    }

    /**
     * Attempts to remove the final modifier from a field.
     */
    private static void removeFinalModifier(Field field) {
        try {
            // Java 8 approach
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        } catch (NoSuchFieldException e) {
            // Java 12+ - this approach won't work
            System.out.println("[NetworkLogger] Note: Cannot modify final field in Java 12+");
        } catch (Exception e) {
            System.out.println("[NetworkLogger] Could not remove final modifier: " + e.getMessage());
        }
    }

    /**
     * Get a pre-configured OkHttpClient with logging enabled.
     */
    public static OkHttpClient.Builder getLoggingClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
            .addInterceptor(LOGGING_INTERCEPTOR);

        if (proxyServer != null) {
            builder.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", PROXY_PORT)));
        }

        return builder;
    }

    /**
     * Get the logging interceptor instance.
     */
    public static NetworkLoggingInterceptor getLoggingInterceptor() {
        return LOGGING_INTERCEPTOR;
    }

    /**
     * Check if the interceptor is installed.
     */
    public static boolean isInterceptorInstalled() {
        return interceptorInstalled;
    }

    /**
     * Create an OkHttpClient with logging already configured.
     */
    public static OkHttpClient createLoggingClient() {
        return getLoggingClientBuilder().build();
    }

    private static void printBanner() {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                               ║");
        System.out.println("║     ███╗   ██╗███████╗████████╗██╗    ██╗ ██████╗ ██████╗ ██╗  ██╗           ║");
        System.out.println("║     ████╗  ██║██╔════╝╚══██╔══╝██║    ██║██╔═══██╗██╔══██╗██║ ██╔╝           ║");
        System.out.println("║     ██╔██╗ ██║█████╗     ██║   ██║ █╗ ██║██║   ██║██████╔╝█████╔╝            ║");
        System.out.println("║     ██║╚██╗██║██╔══╝     ██║   ██║███╗██║██║   ██║██╔══██╗██╔═██╗            ║");
        System.out.println("║     ██║ ╚████║███████╗   ██║   ╚███╔███╔╝╚██████╔╝██║  ██║██║  ██╗           ║");
        System.out.println("║     ╚═╝  ╚═══╝╚══════╝   ╚═╝    ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝           ║");
        System.out.println("║                                                                               ║");
        System.out.println("║              ██╗      ██████╗  ██████╗  ██████╗ ███████╗██████╗              ║");
        System.out.println("║              ██║     ██╔═══██╗██╔════╝ ██╔════╝ ██╔════╝██╔══██╗             ║");
        System.out.println("║              ██║     ██║   ██║██║  ███╗██║  ███╗█████╗  ██████╔╝             ║");
        System.out.println("║              ██║     ██║   ██║██║   ██║██║   ██║██╔══╝  ██╔══██╗             ║");
        System.out.println("║              ███████╗╚██████╔╝╚██████╔╝╚██████╔╝███████╗██║  ██║             ║");
        System.out.println("║              ╚══════╝ ╚═════╝  ╚═════╝  ╚═════╝ ╚══════╝╚═╝  ╚═╝             ║");
        System.out.println("║                                                                               ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║  All HTTP requests and responses will be logged in clear text                 ║");
        System.out.println("║  Logs: ~/.squire/logs/network_*.log                                           ║");
        System.out.println("║  Proxy: localhost:" + PROXY_PORT + "                                                      ║");
        System.out.println("║  Started: " + timestamp + "                                             ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }
}
