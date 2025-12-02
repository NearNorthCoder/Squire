/*
 * Squire Launcher - Main Entry Point
 * Deobfuscated from the Squire OSRS botting client
 *
 * Modified to load client locally instead of downloading from S3
 */
package squire.launcher;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.config.OperatingSystem;
import squire.launcher.config.OSType;
import squire.launcher.local.LocalClientLauncher;
import squire.launcher.ui.LauncherFrame;

/**
 * Main entry point for the Squire launcher.
 *
 * This is the deobfuscated and modified version that:
 * - Bypasses all authentication/license checks
 * - Loads the client from local JAR files instead of downloading from S3
 * - Does not require network access to Squire API
 */
public class SquireLauncher {

    private static final Logger log = LoggerFactory.getLogger(SquireLauncher.class);

    /**
     * Application name
     */
    public static final String APP_NAME = "Squire";

    /**
     * Application version
     */
    public static final String VERSION = "1.0.0-LOCAL";

    /**
     * Squire home directory (~/.squire/)
     */
    public static final File SQUIRE_HOME;

    /**
     * Local repository directory containing client JARs
     */
    public static final File REPOSITORY_DIR;

    /**
     * HWID/license file (not used in local mode)
     */
    public static final File HWID_FILE;

    /**
     * Profiles file
     */
    public static final File PROFILES_FILE;

    static {
        SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");
        REPOSITORY_DIR = new File(SQUIRE_HOME, "repository2");
        HWID_FILE = new File(SQUIRE_HOME, "hwid");
        PROFILES_FILE = new File(SQUIRE_HOME, "profiles.txt");
    }

    /**
     * Main entry point.
     *
     * @param args Command line arguments
     *             --local-repo <path> : Use specified directory for client JARs
     *             --debug             : Enable debug logging
     *             Additional args are passed to the RuneLite client
     */
    public static void main(String[] args) throws Exception {
        log.info("==============================================");
        log.info("Starting {} v{}", APP_NAME, VERSION);
        log.info("LOCAL MODE - No network downloads required");
        log.info("==============================================");
        log.info("Operating System: {}", OperatingSystem.getCurrent());
        log.info("Java Version: {}", Runtime.version());
        log.info("Squire Home: {}", SQUIRE_HOME.getAbsolutePath());

        // Ensure Squire home directory exists
        if (!SQUIRE_HOME.exists()) {
            log.info("Creating Squire home directory");
            SQUIRE_HOME.mkdirs();
        }

        // Parse command line arguments
        File repoDir = REPOSITORY_DIR;
        List<String> clientArgs = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if ("--local-repo".equals(arg) && i + 1 < args.length) {
                repoDir = new File(args[++i]);
                log.info("Using custom repository: {}", repoDir.getAbsolutePath());
            } else if ("--debug".equals(arg)) {
                clientArgs.add("--debug");
            } else {
                // Pass other args to the client
                clientArgs.add(arg);
            }
        }

        // Check if repository exists
        if (!repoDir.exists() || !repoDir.isDirectory()) {
            log.error("Repository directory not found: {}", repoDir.getAbsolutePath());
            log.error("Please ensure the client JAR files are in this directory.");
            log.error("Expected files: runelite-client-*.jar and dependencies");
            System.exit(1);
        }

        // Count JAR files
        File[] jars = repoDir.listFiles((dir, name) -> name.endsWith(".jar"));
        if (jars == null || jars.length == 0) {
            log.error("No JAR files found in repository: {}", repoDir.getAbsolutePath());
            System.exit(1);
        }
        log.info("Found {} JAR files in repository", jars.length);

        // Check for the main client JAR
        boolean foundClient = false;
        for (File jar : jars) {
            if (jar.getName().contains("runelite-client")) {
                foundClient = true;
                log.info("Found client JAR: {}", jar.getName());
                break;
            }
        }
        if (!foundClient) {
            log.warn("Warning: No runelite-client JAR found in repository");
        }

        // Launch the client locally
        log.info("Launching client from local repository...");
        log.info("Client args: {}", clientArgs);

        try {
            LocalClientLauncher.launch(repoDir, clientArgs);
            log.info("Client launched successfully!");
        } catch (Exception e) {
            log.error("Failed to launch client", e);
            System.exit(1);
        }
    }

    /**
     * Sets the system look and feel for the current platform.
     */
    private static void setLookAndFeel() throws Exception {
        // Use system look and feel on macOS for better integration
        OSType os = OperatingSystem.getCurrent();
        if (os == OSType.MacOS) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } else {
            // Use cross-platform look and feel on other systems
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
    }

    /**
     * Parses the --profile argument from command line args.
     *
     * @param args Command line arguments
     * @return Profile name if specified, null otherwise
     */
    private static String parseProfileArg(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if ("--profile".equals(args[i])) {
                return args[i + 1];
            }
        }
        return null;
    }

    /**
     * Checks if a specific argument is present.
     *
     * @param args Command line arguments
     * @param arg Argument to check for
     * @return true if argument is present
     */
    private static boolean hasArg(String[] args, String arg) {
        for (String a : args) {
            if (arg.equals(a)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the Squire home directory.
     *
     * @return The ~/.squire/ directory
     */
    public static File getSquireHome() {
        return SQUIRE_HOME;
    }

    /**
     * Checks if the user has a valid license/HWID.
     *
     * @return true if HWID file exists
     */
    public static boolean isLicensed() {
        return HWID_FILE.exists();
    }
}
