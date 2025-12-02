/*
 * Local Client Launcher - Loads the Squire client from local repository instead of S3
 * This bypasses all network downloads and uses pre-downloaded JAR files.
 *
 * For Jagex accounts, launches as a subprocess with JX_* environment variables set.
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
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.SquireLauncher.JagexAccountData;

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
     * Launches the client from local JAR files without Jagex account data.
     * This is the legacy method for non-Jagex account logins.
     *
     * @param repositoryDir Directory containing the client JAR files
     * @param clientArgs    Arguments to pass to the client
     * @throws Exception if launching fails
     */
    public static void launch(File repositoryDir, Collection<String> clientArgs) throws Exception {
        launch(repositoryDir, clientArgs, null);
    }

    /**
     * Launches the client from local JAR files with optional Jagex account data.
     *
     * For Jagex accounts, launches as a subprocess with JX_* environment variables set.
     * For non-Jagex accounts, runs in the same JVM using a classloader.
     *
     * @param repositoryDir Directory containing the client JAR files
     * @param clientArgs    Arguments to pass to the client
     * @param jagexAccount  Optional Jagex account data (sessionId, accountId, displayName)
     * @throws Exception if launching fails
     */
    public static void launch(File repositoryDir, Collection<String> clientArgs, JagexAccountData jagexAccount) throws Exception {
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

        // If Jagex account data is provided, launch as subprocess with environment variables
        if (jagexAccount != null) {
            log.info("Launching with Jagex account: {}", jagexAccount.displayName);
            launchAsSubprocess(repositoryDir, jarFiles, clientArgs, jagexAccount);
            return;
        }

        // Otherwise, use in-process classloader (for non-Jagex accounts)
        launchInProcess(repositoryDir, jarFiles, clientArgs);
    }

    /**
     * Launches the client as a subprocess with JX_* environment variables set.
     * This is required for Jagex account authentication.
     */
    private static void launchAsSubprocess(File repositoryDir, File[] jarFiles, Collection<String> clientArgs, JagexAccountData jagexAccount) throws Exception {
        log.info("=======================================================");
        log.info("JAGEX ACCOUNT LOGIN - SUBPROCESS LAUNCH");
        log.info("=======================================================");
        log.info("Account Display Name: {}", jagexAccount.displayName);
        log.info("Account ID: {}", jagexAccount.accountId);
        log.info("Session ID Length: {} chars", jagexAccount.sessionId != null ? jagexAccount.sessionId.length() : 0);
        log.info("Repository: {}", repositoryDir.getAbsolutePath());
        log.info("JAR files: {}", jarFiles.length);
        log.info("Client args: {}", clientArgs);
        log.info("-------------------------------------------------------");

        // Build classpath string
        StringBuilder classpath = new StringBuilder();

        // Add launcher JAR first (contains bypassed classes)
        try {
            URL launcherJarUrl = LocalClientLauncher.class.getProtectionDomain()
                .getCodeSource().getLocation();
            File launcherJar = new File(launcherJarUrl.toURI());
            classpath.append(launcherJar.getAbsolutePath());
            log.info("Added launcher JAR to classpath: {}", launcherJar.getAbsolutePath());
        } catch (Exception e) {
            log.warn("Could not add launcher JAR to classpath: {}", e.getMessage());
        }

        // Sort JARs (runelite-client first)
        Arrays.sort(jarFiles, (a, b) -> {
            if (a.getName().contains("runelite-client")) return -1;
            if (b.getName().contains("runelite-client")) return 1;
            return a.getName().compareTo(b.getName());
        });

        // Add all repository JARs
        for (File jar : jarFiles) {
            if (classpath.length() > 0) {
                classpath.append(File.pathSeparator);
            }
            classpath.append(jar.getAbsolutePath());
        }

        // Build command
        List<String> command = new ArrayList<>();
        command.add(getJavaExecutable());
        command.add("-cp");
        command.add(classpath.toString());

        // Add JVM options
        command.add("-Xmx512m");
        command.add("-Djava.net.preferIPv4Stack=true");

        // Add main class
        command.add(MAIN_CLASS);

        // Add client args
        command.addAll(clientArgs);

        log.info("Subprocess command: java -cp <classpath> {} {}", MAIN_CLASS,
                 clientArgs.stream().collect(Collectors.joining(" ")));

        // Create process builder
        ProcessBuilder pb = new ProcessBuilder(command);
        pb.directory(SQUIRE_HOME);
        pb.inheritIO(); // Redirect stdout/stderr to parent process

        // Set Jagex account environment variables
        log.info("-------------------------------------------------------");
        log.info("SETTING JAGEX ENVIRONMENT VARIABLES");
        log.info("-------------------------------------------------------");
        Map<String, String> env = pb.environment();

        String sessionId = jagexAccount.sessionId;
        String accountId = jagexAccount.accountId;
        String displayName = jagexAccount.displayName;

        // Validate values before setting
        if (sessionId == null || sessionId.isEmpty()) {
            log.error("ERROR: JX_SESSION_ID is null or empty!");
            throw new IllegalStateException("Session ID is required for Jagex account login");
        }
        if (accountId == null || accountId.isEmpty()) {
            log.error("ERROR: JX_CHARACTER_ID (accountId) is null or empty!");
            throw new IllegalStateException("Account ID is required for Jagex account login");
        }
        if (displayName == null || displayName.isEmpty()) {
            log.error("ERROR: JX_DISPLAY_NAME is null or empty!");
            throw new IllegalStateException("Display name is required for Jagex account login");
        }

        env.put("JX_SESSION_ID", sessionId);
        env.put("JX_CHARACTER_ID", accountId);
        env.put("JX_DISPLAY_NAME", displayName);
        // ACCESS_TOKEN and REFRESH_TOKEN are optional - use sessionId as fallback
        env.put("JX_ACCESS_TOKEN", sessionId);
        env.put("JX_REFRESH_TOKEN", "");

        log.info("JX_SESSION_ID:    {} (length: {})",
                 sessionId.substring(0, Math.min(20, sessionId.length())) + "...", sessionId.length());
        log.info("JX_CHARACTER_ID:  {}", accountId);
        log.info("JX_DISPLAY_NAME:  {}", displayName);
        log.info("JX_ACCESS_TOKEN:  (same as session ID)");
        log.info("JX_REFRESH_TOKEN: (empty)");
        log.info("-------------------------------------------------------");

        // Start the subprocess
        log.info("STARTING CLIENT SUBPROCESS...");
        Process process = pb.start();
        log.info("SUCCESS: Client subprocess started with PID: {}", process.pid());
        log.info("=======================================================");

        // Create a shutdown hook to terminate the client when launcher exits
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (process.isAlive()) {
                log.info("Terminating client subprocess...");
                process.destroy();
            }
        }));

        // Keep the launcher running
        log.info("Client is running. Close this window to terminate.");
    }

    /**
     * Launches the client in-process using a classloader.
     * This is the original method for non-Jagex account logins.
     */
    private static void launchInProcess(File repositoryDir, File[] jarFiles, Collection<String> clientArgs) throws Exception {
        log.info("Launching client in-process using classloader...");

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
     * Gets the path to the Java executable.
     */
    private static String getJavaExecutable() {
        String javaHome = System.getProperty("java.home");
        String os = System.getProperty("os.name").toLowerCase();
        String executable = os.contains("win") ? "java.exe" : "java";
        return new File(javaHome, "bin/" + executable).getAbsolutePath();
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
