/*
 * Deobfuscated from: c/r/m/H.java
 * Original class name: H
 * Purpose: Manages JVM configuration and settings file updates
 */
package squire.launcher.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import net.runelite.launcher.Launcher;
import net.runelite.launcher.beans.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manages JVM configuration settings for the RuneLite launcher.
 * Updates .runelite/settings.json with appropriate JVM arguments.
 */
public final class JvmConfigManager {

    private static final Logger log = LoggerFactory.getLogger(JvmConfigManager.class);

    /**
     * Path to the RuneLite settings file
     */
    private static final String SETTINGS_FILE = ".runelite/settings.json";

    /**
     * Key for JVM arguments in settings
     */
    private static final String JVM_ARGS_KEY = "jvmargs";

    /**
     * Key for environment variables in settings
     */
    private static final String ENV_KEY = "env";

    /**
     * Updates the launcher settings file with JVM arguments from bootstrap.
     *
     * @param bootstrap The bootstrap configuration
     * @param additionalArgs Additional JVM arguments to include
     */
    public static void updateSettings(Bootstrap bootstrap, Collection<String> additionalArgs) {
        File settingsFile = new File(SETTINGS_FILE).getAbsoluteFile();

        // Check if file exists and is writable
        if (!settingsFile.exists() || !settingsFile.canWrite()) {
            return;
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Map<String, Object> settings;

        // Read existing settings
        try (FileInputStream fis = new FileInputStream(settingsFile)) {
            settings = gson.fromJson(new InputStreamReader(fis), Map.class);
        } catch (IOException e) {
            log.warn("Failed to read settings file", e);
            return;
        }

        // Get JVM arguments for the current platform and Java version
        String[] jvmArgs = getJvmArguments(bootstrap);
        if (jvmArgs == null || jvmArgs.length == 0) {
            log.warn("No JVM arguments available from bootstrap");
            return;
        }

        // Combine bootstrap args with additional args
        ArrayList<String> allArgs = new ArrayList<>();
        allArgs.addAll(Arrays.asList(jvmArgs));
        allArgs.addAll(additionalArgs);

        // Update settings
        settings.put(JVM_ARGS_KEY, allArgs);
        settings.put(ENV_KEY, getEnvironmentVariables(bootstrap));

        // Write updated settings atomically
        try {
            File tempFile = File.createTempFile("settings-", null);

            try (FileOutputStream fos = new FileOutputStream(tempFile);
                 FileChannel channel = fos.getChannel();
                 PrintWriter writer = new PrintWriter(fos)) {

                channel.lock();
                writer.write(gson.toJson(settings));
                channel.force(true);
            }

            // Try atomic move first, fall back to regular move
            try {
                Files.move(
                    tempFile.toPath(),
                    settingsFile.toPath(),
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.ATOMIC_MOVE
                );
            } catch (AtomicMoveNotSupportedException e) {
                log.debug("Atomic move not supported, using regular move", e);
                Files.move(
                    tempFile.toPath(),
                    settingsFile.toPath(),
                    StandardCopyOption.REPLACE_EXISTING
                );
            }

        } catch (IOException e) {
            log.warn("Failed to write settings file", e);
        }
    }

    /**
     * Gets JVM arguments for the current platform and Java version.
     *
     * @param bootstrap The bootstrap configuration
     * @return Array of JVM arguments
     */
    private static String[] getJvmArguments(Bootstrap bootstrap) {
        OSType os = OperatingSystem.getCurrent();

        // Check if using JVM 17+
        if (Launcher.B()) {  // isJava17OrHigher()
            return getJvm17Arguments(bootstrap, os);
        } else {
            return getJvm11Arguments(bootstrap, os);
        }
    }

    /**
     * Gets JVM 17+ arguments for the current platform.
     */
    private static String[] getJvm17Arguments(Bootstrap bootstrap, OSType os) {
        switch (os) {
            case Windows:
                String[] windowsArgs = bootstrap.getLauncherJvm17WindowsArguments();
                if (windowsArgs != null) {
                    return windowsArgs;
                }
                return bootstrap.getLauncherJvm17Arguments();

            case MacOS:
                String[] macArgs = bootstrap.getLauncherJvm17MacArguments();
                if (macArgs != null) {
                    return macArgs;
                }
                return bootstrap.getLauncherJvm17Arguments();

            default:
                return bootstrap.getLauncherJvm17Arguments();
        }
    }

    /**
     * Gets JVM 11 arguments for the current platform.
     */
    private static String[] getJvm11Arguments(Bootstrap bootstrap, OSType os) {
        switch (os) {
            case Windows:
                String[] windowsArgs = bootstrap.getLauncherJvm11WindowsArguments();
                if (windowsArgs != null) {
                    return windowsArgs;
                }
                return bootstrap.getLauncherJvm11Arguments();

            case MacOS:
                String[] macArgs = bootstrap.getLauncherJvm11MacArguments();
                if (macArgs != null) {
                    return macArgs;
                }
                return bootstrap.getLauncherJvm11Arguments();

            default:
                return bootstrap.getLauncherJvm11Arguments();
        }
    }

    /**
     * Gets environment variables for the current platform.
     *
     * @param bootstrap The bootstrap configuration
     * @return Map of environment variables
     */
    private static Map<String, String> getEnvironmentVariables(Bootstrap bootstrap) {
        OSType os = OperatingSystem.getCurrent();

        switch (os) {
            case Windows:
                return bootstrap.getLauncherWindowsEnv();
            case MacOS:
                return bootstrap.getLauncherMacEnv();
            case Linux:
                return bootstrap.getLauncherLinuxEnv();
            default:
                return null;
        }
    }

    // Private constructor to prevent instantiation
    private JvmConfigManager() {
    }
}
