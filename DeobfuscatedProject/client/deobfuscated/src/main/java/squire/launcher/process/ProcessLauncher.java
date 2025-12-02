/*
 * Deobfuscated from: c/r/m/u.java
 * Original class name: u
 * Purpose: Launches the client as a separate process with JVM arguments
 */
package squire.launcher.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.runelite.launcher.beans.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.config.OperatingSystem;
import squire.launcher.config.OSType;
import squire.launcher.ui.LauncherFrame;

/**
 * Launches the RuneLite client as a separate Java process.
 * Handles classpath construction and JVM argument configuration.
 */
public final class ProcessLauncher {

    private static final Logger log = LoggerFactory.getLogger(ProcessLauncher.class);

    /**
     * The main class to run
     */
    private static final String MAIN_CLASS = "net.runelite.client.RuneLite";

    /**
     * Launches the client with the given configuration.
     *
     * @param bootstrap Bootstrap configuration with JVM settings
     * @param jarFiles List of JAR files for the classpath
     * @param clientArgs Arguments to pass to the RuneLite client
     * @param jvmArgs Additional JVM arguments
     * @param appArgs Additional application arguments
     * @throws Exception if launching fails
     */
    public static void launch(
            Bootstrap bootstrap,
            List<File> jarFiles,
            Collection<String> clientArgs,
            List<String> jvmArgs,
            List<String> appArgs) throws Exception {

        // Build the classpath string
        StringBuilder classpath = new StringBuilder();
        for (File jarFile : jarFiles) {
            if (classpath.length() > 0) {
                classpath.append(File.pathSeparatorChar);
            }
            classpath.append(jarFile.getAbsolutePath());
        }

        // Find the Java executable
        String javaPath;
        try {
            javaPath = findJavaExecutable();
        } catch (FileNotFoundException e) {
            log.error("Could not find Java executable", e);
            return;
        }

        // Build the command
        List<String> command = new ArrayList<>();

        // Java executable
        command.add(javaPath);

        // Classpath
        command.add("-cp");
        command.add(classpath.toString());

        // JVM arguments from bootstrap
        String[] bootstrapJvmArgs = getBootstrapJvmArgs(bootstrap);
        if (bootstrapJvmArgs != null) {
            command.addAll(Arrays.asList(bootstrapJvmArgs));
        }

        // Additional JVM arguments
        command.addAll(jvmArgs);

        // Additional app arguments (like -ea for assertions)
        command.addAll(appArgs);

        // Main class
        command.add(MAIN_CLASS);

        // Client arguments
        command.addAll(clientArgs);

        log.info("Launching client with command: {}", command);

        // Create and start the process
        ProcessBuilder processBuilder = new ProcessBuilder(command.toArray(new String[0]));
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();

        // Close the launcher frame
        LauncherFrame.close();

        // If debug logging is enabled, print process output
        if (log.isDebugEnabled()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    /**
     * Finds the Java executable in JAVA_HOME.
     *
     * @return Absolute path to the java executable
     * @throws FileNotFoundException if Java cannot be found
     */
    private static String findJavaExecutable() throws FileNotFoundException {
        Path javaHome = Paths.get(System.getProperty("java.home"));

        if (!Files.exists(javaHome)) {
            throw new FileNotFoundException(
                "JAVA_HOME is not set correctly! directory \"" + javaHome + "\" does not exist."
            );
        }

        // Try bin/java first (Unix-like systems)
        Path javaPath = Paths.get(javaHome.toString(), "bin", "java");
        if (!Files.exists(javaPath)) {
            // Try bin/java.exe (Windows)
            javaPath = Paths.get(javaHome.toString(), "bin", "java.exe");
        }

        if (!Files.exists(javaPath)) {
            throw new FileNotFoundException(
                "java executable not found in directory \"" + javaPath.getParent() + "\""
            );
        }

        return javaPath.toAbsolutePath().toString();
    }

    /**
     * Gets JVM arguments from the bootstrap configuration.
     *
     * @param bootstrap The bootstrap configuration
     * @return Array of JVM arguments, or null if none configured
     */
    private static String[] getBootstrapJvmArgs(Bootstrap bootstrap) {
        OSType os = OperatingSystem.getCurrent();

        // Check if using JVM 17+
        if (isJava17()) {
            switch (os) {
                case Windows:
                    String[] windowsArgs = bootstrap.getClientJvm17WindowsArguments();
                    if (windowsArgs != null) {
                        return windowsArgs;
                    }
                    return bootstrap.getClientJvm17Arguments();

                case MacOS:
                    String[] macArgs = bootstrap.getClientJvm17MacArguments();
                    if (macArgs != null) {
                        return macArgs;
                    }
                    return bootstrap.getClientJvm17Arguments();

                default:
                    return bootstrap.getClientJvm17Arguments();
            }
        }

        // JVM 9-16
        return bootstrap.getClientJvm9Arguments();
    }

    /**
     * Checks if the current JVM is Java 16 or higher.
     * 16 has the same module restrictions as 17, so we use the 17 settings for it.
     *
     * @return true if running on Java 16+, false otherwise
     */
    private static boolean isJava17() {
        // Matches RuneLite launcher implementation
        return Runtime.version().feature() >= 16;
    }

    // Private constructor to prevent instantiation
    private ProcessLauncher() {
    }
}
