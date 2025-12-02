/*
 * Launcher stub
 * Original class handles S3 downloads and authentication
 * This stub provides state variables for compatibility
 */
package net.runelite.launcher;

import java.io.File;

/**
 * Stub for the original Squire launcher.
 * The original Launcher class downloaded client JARs from S3.
 * This stub just provides the authentication state variables
 * that other classes reference.
 */
public class Launcher {

    /**
     * Authentication token (bypassed in local mode)
     */
    public static String auth = "local-mode-bypass";

    /**
     * Whether the user is authenticated (always true in local mode)
     */
    public static boolean authenticated = true;

    /**
     * Squire home directory
     */
    public static final File SQUIRE_DIR = new File(System.getProperty("user.home"), ".squire");

    /**
     * Repository directory for client JARs
     */
    public static final File REPO_DIR = new File(SQUIRE_DIR, "repository2");

    /**
     * Main method stub - not used in local mode
     * Use SquireLauncher.main() instead
     */
    public static void main(String[] args) throws Exception {
        System.out.println("WARNING: Launcher.main() is deprecated.");
        System.out.println("Use SquireLauncher.main() for local launching.");
        System.out.println("This stub does not download from S3.");

        // Redirect to SquireLauncher
        squire.launcher.SquireLauncher.main(args);
    }

    // Private constructor
    private Launcher() {
    }
}
