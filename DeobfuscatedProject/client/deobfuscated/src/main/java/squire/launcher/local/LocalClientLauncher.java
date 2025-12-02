/*
 * Local Client Launcher - Loads the Squire client from local repository instead of S3
 * This bypasses all network downloads and uses pre-downloaded JAR files.
 */
package squire.launcher.local;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Launches the RuneLite/Squire client from local JAR files.
 * No network access required - all dependencies are loaded from the local repository2 folder.
 */
public class LocalClientLauncher {

    private static final Logger log = LoggerFactory.getLogger(LocalClientLauncher.class);

    /**
     * The main class to run (RuneLite entry point)
     */
    private static final String MAIN_CLASS = "net.runelite.client.RuneLite";

    /**
     * UIManager key for storing the class loader reference
     */
    private static final String CLASSLOADER_KEY = "ClassLoader";

    /**
     * Squire home directory
     */
    private static final File SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");

    /**
     * Launches the client from local JAR files.
     *
     * @param repositoryDir Directory containing the client JAR files
     * @param clientArgs    Arguments to pass to the client
     * @throws Exception if launching fails
     */
    public static void launch(File repositoryDir, Collection<String> clientArgs) throws Exception {
        log.info("Launching client from local repository: {}", repositoryDir.getAbsolutePath());

        // Validate repository directory
        if (!repositoryDir.exists() || !repositoryDir.isDirectory()) {
            throw new IllegalArgumentException("Repository directory does not exist: " + repositoryDir);
        }

        // Get all JAR files from the repository
        File[] jarFiles = repositoryDir.listFiles((dir, name) -> name.endsWith(".jar"));
        if (jarFiles == null || jarFiles.length == 0) {
            throw new IllegalStateException("No JAR files found in repository: " + repositoryDir);
        }

        log.info("Found {} JAR files in repository", jarFiles.length);

        // Sort to ensure consistent ordering (runelite-client first for predictable loading)
        Arrays.sort(jarFiles, (a, b) -> {
            // Prioritize runelite-client JAR
            if (a.getName().contains("runelite-client")) return -1;
            if (b.getName().contains("runelite-client")) return 1;
            return a.getName().compareTo(b.getName());
        });

        // Build URL array for classloader
        // IMPORTANT: Include our launcher JAR FIRST so our bypassed classes take precedence
        List<URL> urlList = new ArrayList<>();

        // Add our launcher JAR first (contains bypassed OpenOSRSSplashScreen, etc.)
        try {
            // Get the JAR that contains this class (squire-launcher-local.jar)
            URL launcherJarUrl = LocalClientLauncher.class.getProtectionDomain()
                .getCodeSource().getLocation();
            urlList.add(launcherJarUrl);
            log.info("Added launcher JAR first (for bypassed classes): {}", launcherJarUrl);
        } catch (Exception e) {
            log.warn("Could not add launcher JAR to client classpath: {}", e.getMessage());
        }

        // Then add all repository JARs
        for (File jar : jarFiles) {
            urlList.add(jar.toURI().toURL());
            log.debug("Adding to classpath: {}", jar.getName());
        }

        URL[] urls = urlList.toArray(new URL[0]);

        // Create classloader with platform classloader as parent
        // This isolates the client from the launcher's classpath
        ClassLoader parentLoader = ClassLoader.getPlatformClassLoader();
        URLClassLoader clientLoader = new URLClassLoader(urls, parentLoader);

        // Store reference in UIManager for later access by RuneLite
        UIManager.put(CLASSLOADER_KEY, clientLoader);

        // Create and start the client thread
        Thread clientThread = new Thread(() -> {
            try {
                // Create session file for process tracking
                File tempSession = File.createTempFile(
                    "squire-session-index-",
                    String.valueOf(ProcessHandle.current().pid()),
                    SQUIRE_HOME
                );
                tempSession.deleteOnExit();

                // Load and invoke the main class
                log.info("Loading main class: {}", MAIN_CLASS);
                Class<?> mainClass = clientLoader.loadClass(MAIN_CLASS);
                Method mainMethod = mainClass.getMethod("main", String[].class);

                log.info("Starting RuneLite client with args: {}", clientArgs);
                mainMethod.invoke(null, (Object) clientArgs.toArray(new String[0]));
            } catch (Exception e) {
                log.error("Failed to launch client", e);
            }
        });

        clientThread.setName("Squire-Client");
        clientThread.setContextClassLoader(clientLoader);
        clientThread.start();

        log.info("Client thread started successfully");
    }

    /**
     * Launches the client with default settings.
     * Uses the standard repository2 location in ~/.squire/
     *
     * @param clientArgs Arguments to pass to the client
     * @throws Exception if launching fails
     */
    public static void launchDefault(Collection<String> clientArgs) throws Exception {
        File defaultRepo = new File(SQUIRE_HOME, "repository2");
        launch(defaultRepo, clientArgs);
    }

    /**
     * Gets the list of JAR files from a repository directory.
     *
     * @param repositoryDir The repository directory
     * @return List of JAR files
     */
    public static List<File> getJarFiles(File repositoryDir) {
        List<File> jars = new ArrayList<>();
        File[] files = repositoryDir.listFiles((dir, name) -> name.endsWith(".jar"));
        if (files != null) {
            jars.addAll(Arrays.asList(files));
        }
        return jars;
    }

    // Private constructor to prevent instantiation
    private LocalClientLauncher() {
    }
}
