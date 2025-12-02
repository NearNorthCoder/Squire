/*
 * Squire Launcher - Main Entry Point
 * Deobfuscated from the Squire OSRS botting client
 *
 * Modified to load client locally instead of downloading from S3
 * Supports Jagex account import and selection
 */
package squire.launcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.config.OperatingSystem;
import squire.launcher.config.OSType;
import squire.launcher.local.LocalClientLauncher;
import squire.launcher.ui.LauncherFrame;
import squire.launcher.auth.BrowserAccountImporter;
// import net.runelite.launcher.AccountImporter; // JCEF-based, requires native libs

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

    /**
     * Jagex accounts file (launcher.dat)
     */
    public static final File LAUNCHER_DATA_FILE;

    static {
        SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");
        REPOSITORY_DIR = new File(SQUIRE_HOME, "repository2");
        HWID_FILE = new File(SQUIRE_HOME, "hwid");
        PROFILES_FILE = new File(SQUIRE_HOME, "profiles.txt");
        LAUNCHER_DATA_FILE = new File(SQUIRE_HOME, "launcher.dat");
    }

    /**
     * Main entry point.
     *
     * @param args Command line arguments
     *             --local-repo <path>   : Use specified directory for client JARs
     *             --account <name>      : Launch with specified Jagex account
     *             --jagexlauncher       : Show account selection dialog
     *             --import-accounts     : Import Jagex accounts via OAuth2
     *             --list-accounts       : List imported accounts and exit
     *             --debug               : Enable debug logging
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

        // Bypass Squire authentication for using AccountImporter
        bypassSquireAuth();

        // Parse command line arguments
        File repoDir = REPOSITORY_DIR;
        List<String> clientArgs = new ArrayList<>();
        String selectedAccount = null;
        boolean showAccountSelector = false;
        boolean importAccounts = false;
        boolean listAccounts = false;

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if ("--local-repo".equals(arg) && i + 1 < args.length) {
                repoDir = new File(args[++i]);
                log.info("Using custom repository: {}", repoDir.getAbsolutePath());
            } else if ("--account".equals(arg) && i + 1 < args.length) {
                selectedAccount = args[++i];
                log.info("Using account: {}", selectedAccount);
            } else if ("--jagexlauncher".equals(arg)) {
                showAccountSelector = true;
            } else if ("--import-accounts".equals(arg)) {
                importAccounts = true;
            } else if ("--list-accounts".equals(arg)) {
                listAccounts = true;
            } else if ("--debug".equals(arg)) {
                clientArgs.add("--debug");
            } else {
                // Pass other args to the client
                clientArgs.add(arg);
            }
        }

        // Handle --list-accounts
        if (listAccounts) {
            listSavedAccounts();
            System.exit(0);
        }

        // Handle --import-accounts
        if (importAccounts) {
            log.info("Opening account importer...");
            importJagexAccounts();
            log.info("Account import complete. Run with --list-accounts to see imported accounts.");
            System.exit(0);
        }

        // Handle --jagexlauncher (account selection)
        if (showAccountSelector) {
            selectedAccount = selectAccount();
            if (selectedAccount == null) {
                log.info("No account selected, exiting.");
                System.exit(0);
            }
            log.info("Selected account: {}", selectedAccount);
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

        // Add account to client args if specified
        if (selectedAccount != null && !selectedAccount.isEmpty()) {
            clientArgs.add("--account=" + selectedAccount);
            log.info("Passing account to client: {}", selectedAccount);
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
     * Lists all saved Jagex accounts from launcher.dat
     */
    private static void listSavedAccounts() {
        List<String[]> accounts = loadAccountsFromFile();
        if (accounts.isEmpty()) {
            System.out.println("No Jagex accounts found.");
            System.out.println("Use --import-accounts to import accounts.");
            return;
        }

        System.out.println("=== Saved Jagex Accounts ===");
        int i = 1;
        for (String[] account : accounts) {
            String displayName = account[0];
            String accountId = account[1];
            System.out.printf("%d. %s (ID: %s)%n", i++, displayName, accountId);
        }
        System.out.println("============================");
        System.out.println("Use --account <name> to launch with a specific account");
    }

    /**
     * Opens the account importer to import Jagex accounts via OAuth2
     * Uses browser-based OAuth flow (no JCEF/CEF dependencies required)
     */
    private static void importJagexAccounts() {
        try {
            // Use browser-based importer (opens system browser for OAuth)
            // This avoids JCEF native library requirements
            final Object lock = new Object();
            final boolean[] done = {false};

            BrowserAccountImporter.importAccounts(() -> {
                log.info("Account import callback triggered");
                synchronized (lock) {
                    done[0] = true;
                    lock.notify();
                }
            });

            // Wait for import to complete (max 5 minutes)
            synchronized (lock) {
                if (!done[0]) {
                    lock.wait(300000);
                }
            }
        } catch (Exception e) {
            log.error("Failed to import accounts", e);
        }
    }

    /**
     * Shows a dialog to select from saved accounts
     * @return The selected account display name, or null if cancelled
     */
    private static String selectAccount() {
        List<String[]> accounts = loadAccountsFromFile();

        if (accounts.isEmpty()) {
            int result = JOptionPane.showConfirmDialog(
                null,
                "No Jagex accounts found. Would you like to import accounts now?",
                "No Accounts",
                JOptionPane.YES_NO_OPTION
            );
            if (result == JOptionPane.YES_OPTION) {
                importJagexAccounts();
                // Reload accounts after import
                accounts = loadAccountsFromFile();
            }
            if (accounts.isEmpty()) {
                return null;
            }
        }

        // Build array of display names for the dropdown
        String[] displayNames = accounts.stream()
            .map(a -> a[0])
            .toArray(String[]::new);

        String selected = (String) JOptionPane.showInputDialog(
            null,
            "Select a Jagex account to launch with:",
            "Select Account",
            JOptionPane.QUESTION_MESSAGE,
            null,
            displayNames,
            displayNames[0]
        );

        return selected;
    }

    /**
     * Loads accounts from launcher.dat
     * @return List of [displayName, accountId, sessionId] arrays
     */
    private static List<String[]> loadAccountsFromFile() {
        List<String[]> accounts = new ArrayList<>();

        if (!LAUNCHER_DATA_FILE.exists()) {
            return accounts;
        }

        try (Scanner scanner = new Scanner(LAUNCHER_DATA_FILE)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Format: ::sessionId:accountId:displayName
                String[] parts = line.split(":");
                if (parts.length >= 5) {
                    String sessionId = parts[2];
                    String accountId = parts[3];
                    String displayName = parts[4];
                    accounts.add(new String[]{displayName, accountId, sessionId});
                }
            }
        } catch (FileNotFoundException e) {
            log.warn("Could not read launcher.dat: {}", e.getMessage());
        }

        return accounts;
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

    /**
     * Bypasses Squire authentication by setting Launcher.authenticated = true
     * via reflection. This allows using AccountImporter without the auth panel.
     */
    private static void bypassSquireAuth() {
        try {
            Class<?> launcherClass = Class.forName("net.runelite.launcher.Launcher");

            // Set authenticated = true
            Field authenticatedField = launcherClass.getDeclaredField("authenticated");
            authenticatedField.setAccessible(true);
            authenticatedField.setBoolean(null, true);
            log.info("Bypassed Squire authentication (authenticated=true)");

            // Set auth = "bypassed" (some code may check this string)
            Field authField = launcherClass.getDeclaredField("auth");
            authField.setAccessible(true);
            authField.set(null, "bypassed");
            log.info("Set auth token to 'bypassed'");

        } catch (ClassNotFoundException e) {
            log.warn("Launcher class not found, authentication bypass not needed");
        } catch (NoSuchFieldException e) {
            log.warn("Launcher auth fields not found: {}", e.getMessage());
        } catch (IllegalAccessException e) {
            log.error("Failed to bypass authentication: {}", e.getMessage());
        }
    }
}
