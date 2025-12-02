/*
 * Squire Launcher - Main Entry Point
 * Deobfuscated from the Squire OSRS botting client
 */
package squire.launcher;

import java.io.File;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.config.OperatingSystem;
import squire.launcher.config.OSType;
import squire.launcher.ui.LauncherFrame;

/**
 * Main entry point for the Squire launcher.
 *
 * The Squire launcher handles:
 * - License/HWID validation
 * - Profile selection and management
 * - OAuth2/Discord authentication
 * - Client download and launching
 * - RuneLite/Unethicalite client injection
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
    public static final String VERSION = "1.0.0-DEOBFUSCATED";

    /**
     * Squire home directory (~/.squire/)
     */
    public static final File SQUIRE_HOME;

    /**
     * HWID/license file
     */
    public static final File HWID_FILE;

    /**
     * Profiles file
     */
    public static final File PROFILES_FILE;

    static {
        SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");
        HWID_FILE = new File(SQUIRE_HOME, "hwid");
        PROFILES_FILE = new File(SQUIRE_HOME, "profiles.txt");
    }

    /**
     * Main entry point.
     *
     * @param args Command line arguments
     *             --profile <name> : Launch with specified profile
     *             --first-launch   : Force first-launch mode (license validation)
     */
    public static void main(String[] args) {
        log.info("Starting {} v{}", APP_NAME, VERSION);
        log.info("Operating System: {}", OperatingSystem.getCurrent());
        log.info("Java Version: {}", Runtime.version());
        log.info("Squire Home: {}", SQUIRE_HOME.getAbsolutePath());

        // Ensure Squire home directory exists
        if (!SQUIRE_HOME.exists()) {
            log.info("Creating Squire home directory");
            SQUIRE_HOME.mkdirs();
        }

        // Parse command line arguments
        String profileName = parseProfileArg(args);
        boolean forceFirstLaunch = hasArg(args, "--first-launch");

        // Set look and feel
        try {
            setLookAndFeel();
        } catch (Exception e) {
            log.warn("Failed to set look and feel", e);
        }

        // Launch the UI
        log.info("Launching UI...");
        if (forceFirstLaunch) {
            LauncherFrame.open("FirstLaunch");
        } else {
            LauncherFrame.open(profileName);
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
