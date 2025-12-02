/*
 * Deobfuscated from: c/r/m/y.java
 * Original class name: y
 * Purpose: Desktop operations utility for opening URLs and files
 */
package squire.launcher.util;

import com.google.common.base.Strings;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.config.OperatingSystem;
import squire.launcher.config.OSType;

/**
 * Utility class for desktop operations like opening URLs and files.
 * Provides cross-platform support with fallbacks.
 */
public final class DesktopUtil {

    private static final Logger log = LoggerFactory.getLogger(DesktopUtil.class);

    /**
     * Whether xdg-open is available (Linux only)
     */
    private static boolean xdgOpenAvailable;

    static {
        // Check if running on Linux where xdg-open might be available
        xdgOpenAvailable = OperatingSystem.getCurrent() == OSType.Linux;
    }

    /**
     * Opens a URL in the default browser.
     *
     * @param url The URL to open
     * @return true if the URL was opened successfully
     */
    public static boolean openUrl(String url) {
        if (Strings.isNullOrEmpty(url)) {
            return false;
        }

        // Try Desktop.browse() first
        if (browseUrl(url)) {
            log.debug("Opened URL via Desktop.browse(): {}", url);
            return true;
        }

        // On Linux, try xdg-open as fallback
        if (xdgOpenAvailable && openWithXdgOpen(url)) {
            log.debug("Opened URL via xdg-open: {}", url);
            return true;
        }

        // If all else fails, offer to copy to clipboard
        showCopyToClipboardDialog(
            "Could not open URL in browser. Would you like to copy it to clipboard?\n\n" + url,
            url
        );
        return false;
    }

    /**
     * Opens a file with the default application.
     *
     * @param file The file to open
     * @return true if the file was opened successfully
     */
    public static boolean openFile(File file) {
        if (file == null || !file.exists()) {
            return false;
        }

        if (openFileWithDesktop(file)) {
            log.debug("Opened file via Desktop.open(): {}", file);
            return true;
        }

        // Offer to copy path to clipboard
        showCopyToClipboardDialog(
            "Could not open file. Would you like to copy the path to clipboard?\n\n" + file.getAbsolutePath(),
            file.getAbsolutePath()
        );
        return false;
    }

    /**
     * Opens a URL using Desktop.browse().
     *
     * @param url The URL to open
     * @return true if successful
     */
    private static boolean browseUrl(String url) {
        if (!Desktop.isDesktopSupported()) {
            return false;
        }

        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            return false;
        }

        try {
            desktop.browse(new URI(url));
            return true;
        } catch (IOException | URISyntaxException e) {
            log.warn("Failed to open URL via Desktop.browse(): {}", url, e);
            return false;
        }
    }

    /**
     * Opens a file using Desktop.open().
     *
     * @param file The file to open
     * @return true if successful
     */
    private static boolean openFileWithDesktop(File file) {
        if (!Desktop.isDesktopSupported()) {
            return false;
        }

        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.OPEN)) {
            return false;
        }

        try {
            desktop.open(file);
            return true;
        } catch (IOException e) {
            log.warn("Failed to open file via Desktop.open(): {}", file, e);
            return false;
        }
    }

    /**
     * Opens a URL using xdg-open (Linux).
     *
     * @param url The URL to open
     * @return true if successful
     */
    private static boolean openWithXdgOpen(String url) {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"xdg-open", url});
            process.waitFor();

            int exitCode = process.exitValue();
            if (exitCode == 0) {
                return true;
            }

            log.warn("xdg-open returned exit code {} for URL: {}", exitCode, url);
            return false;
        } catch (IOException e) {
            // xdg-open not available
            xdgOpenAvailable = false;
            return false;
        } catch (InterruptedException e) {
            log.warn("Interrupted while waiting for xdg-open: {}", url);
            return false;
        }
    }

    /**
     * Shows a dialog offering to copy text to clipboard.
     *
     * @param message The message to display
     * @param textToCopy The text to copy if user confirms
     */
    private static void showCopyToClipboardDialog(String message, String textToCopy) {
        SwingUtilities.invokeLater(() -> {
            int result = JOptionPane.showConfirmDialog(
                null,
                message,
                "Copy to Clipboard",
                JOptionPane.YES_NO_OPTION
            );

            if (result == JOptionPane.YES_OPTION) {
                StringSelection selection = new StringSelection(textToCopy);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
            }
        });
    }

    // Private constructor to prevent instantiation
    private DesktopUtil() {
    }
}
