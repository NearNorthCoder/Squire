/*
 * Deobfuscated from: c/r/m/L.java
 * Original class name: L
 * Purpose: Main JFrame window for the Squire launcher
 */
package squire.launcher.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.util.ImageLoader;
import squire.launcher.util.ThemeColors;

/**
 * Main JFrame window for the Squire launcher.
 *
 * Provides:
 * - Window setup and layout management
 * - Progress bar updates for download/launch status
 * - Static methods for updating UI from any thread
 * - Integration with ProfileSelectionPanel and SidebarInfoPanel
 */
public class LauncherFrame extends JFrame {

    private static final Logger log = LoggerFactory.getLogger(LauncherFrame.class);

    /**
     * Default window dimensions (700 x 380)
     */
    static final Dimension WINDOW_SIZE = new Dimension(700, 380);

    /**
     * Maximum value for progress bar (1000 = 100%)
     */
    private static final int PROGRESS_MAX = 1000;

    /**
     * Singleton instance of the launcher frame
     */
    private static LauncherFrame instance;

    /**
     * Reference to the HWID/license file for checking registration
     */
    public static File hwidFile;

    /**
     * License validation panel (shown when not registered)
     */
    private final LicenseValidationPanel licensePanel;

    /**
     * Profile selection panel (main panel when registered)
     */
    private ProfileSelectionPanel profilePanel;

    // ==================== Static Factory Methods ====================

    /**
     * Gets the singleton launcher frame instance.
     *
     * @return The launcher frame, or null if not initialized
     */
    public static LauncherFrame getInstance() {
        return instance;
    }

    /**
     * Opens the launcher frame.
     *
     * @param profileName Name of the profile to select, or null for default
     */
    public static void open(String profileName) {
        try {
            SwingUtilities.invokeAndWait(() -> {
                if (instance != null) {
                    return;
                }

                try {
                    File squireDir = new File(System.getProperty("user.home") + "/.squire/");
                    File hwidFile = new File(squireDir, "hwid");
                    instance = new LauncherFrame(profileName, hwidFile.exists());
                } catch (Exception e) {
                    log.warn("Failed to create launcher frame", e);
                }
            });
        } catch (InterruptedException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Closes and disposes the launcher frame.
     */
    public static void close() {
        SwingUtilities.invokeLater(() -> {
            if (instance == null) {
                return;
            }

            instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            instance.setVisible(false);
            instance.dispose();
            instance = null;
        });
    }

    // ==================== Progress Update Methods ====================

    /**
     * Updates progress with a percentage and status message.
     *
     * @param progress Progress percentage (0.0 - 1.0)
     * @param message Status message to display
     */
    public static void updateProgress(double progress, String message) {
        if (instance != null) {
            instance.setProgress(message, progress);
        }
    }

    /**
     * Sets status message without changing progress.
     *
     * @param message Status message to display
     */
    public static void setStatus(String message) {
        if (instance != null) {
            instance.setProgress(message, 0.0);
        }
    }

    /**
     * Sets status message on the profile panel.
     *
     * @param message Status message to display
     */
    public static void setStatusMessage(String message) {
        if (instance != null) {
            instance.profilePanel.setStatus(message);
        }
    }

    /**
     * Updates progress during a range-based operation (e.g., downloading files).
     *
     * @param startPercent Starting percentage of this phase
     * @param endPercent Ending percentage of this phase
     * @param message Status message
     * @param current Current item number
     * @param total Total number of items
     */
    public static void updateProgress(double startPercent, double endPercent, String message, int current, int total) {
        String progressText = current + " / " + total;
        updateProgress(startPercent + (endPercent - startPercent) * (double) current / (double) total,
                message + " " + progressText);
    }

    /**
     * Updates progress with MB-based size display.
     *
     * @param startPercent Starting percentage
     * @param endPercent Ending percentage
     * @param message Status message
     * @param currentBytes Bytes downloaded so far
     * @param totalBytes Total bytes to download
     * @param showMb Whether to show size in MB
     */
    public static void updateProgress(double startPercent, double endPercent, String message,
                                       int currentBytes, int totalBytes, boolean showMb) {
        String progressText;
        if (showMb) {
            double mbFactor = 1000000.0;
            progressText = String.format("%.1f / %.1f MB",
                    (double) currentBytes / mbFactor,
                    (double) totalBytes / mbFactor);
        } else {
            progressText = currentBytes + " / " + totalBytes;
        }

        updateProgress(startPercent + (endPercent - startPercent) * (double) currentBytes / (double) totalBytes,
                message + " " + progressText);
    }

    /**
     * Shows an error state in the launcher.
     *
     * @param title Error title
     * @param message Error message
     */
    public static void showError(String title, String message) {
        if (instance != null) {
            instance.displayError(title, message);
        }
    }

    /**
     * Enables the launch button on the profile panel.
     */
    public static void enableLaunch() {
        if (instance != null) {
            instance.profilePanel.enableLaunch();
        }
    }

    /**
     * Creates a button with the specified text.
     *
     * @param text Button text
     * @return The created button, or null if frame not initialized
     */
    public static JButton createButton(String text) {
        if (instance != null) {
            return instance.profilePanel.createButton(text, "Launch");
        }
        return null;
    }

    // ==================== Constructor ====================

    /**
     * Creates the launcher frame.
     *
     * @param profileName Name of the profile to select
     * @param isRegistered Whether the user has a valid HWID/license
     */
    private LauncherFrame(String profileName, boolean isRegistered) {
        this.licensePanel = new LicenseValidationPanel();

        // Window setup
        this.setTitle("Squire");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_SIZE);
        this.setLayout(new BorderLayout());
        this.setUndecorated(true);
        this.setIconImage(ImageLoader.loadImage(getClass(), "/squire_icon.png"));

        // Determine if this is the first launch (needs license)
        boolean needsLicense = "FirstLaunch".equals(profileName);
        this.profilePanel = new ProfileSelectionPanel(needsLicense);

        // Create main content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setPreferredSize(WINDOW_SIZE);

        if (!isRegistered) {
            // Show license validation panel
            contentPanel.add((Component) this.licensePanel, BorderLayout.CENTER);
        } else {
            // Show normal launcher with sidebar and profile panel
            contentPanel.add((Component) new SidebarInfoPanel(profileName), BorderLayout.WEST);
            contentPanel.add((Component) this.profilePanel, BorderLayout.CENTER);
        }

        this.setContentPane(contentPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // ==================== Instance Methods ====================

    /**
     * Sets the progress bar value and message.
     *
     * @param message Status message
     * @param progress Progress value (0.0 - 1.0)
     */
    private void setProgress(String message, double progress) {
        this.profilePanel.getStatusLabel().setText(message);
        this.profilePanel.getProgressBar().setMaximum(PROGRESS_MAX);
        this.profilePanel.getProgressBar().setValue((int) (progress * PROGRESS_MAX));
        this.updateProgressBarText(null);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    /**
     * Updates the progress bar text display.
     *
     * @param text Text to display, or null to hide
     */
    private void updateProgressBarText(String text) {
        JProgressBar progressBar = this.profilePanel.getProgressBar();
        progressBar.setString(text);

        boolean showText = text != null;
        progressBar.setStringPainted(showText);
        progressBar.revalidate();
        progressBar.repaint();
    }

    /**
     * Displays an error state in the launcher.
     *
     * @param title Error title
     * @param message Error message
     */
    private void displayError(String title, String message) {
        this.profilePanel.setStatus(message);
        this.profilePanel.setStatusDetail("Error");
        this.profilePanel.getStatusLabel().setText(title);
        this.profilePanel.getProgressBar().setBackground(ThemeColors.ERROR_COLOR.darker());
        this.profilePanel.getProgressBar().setForeground(ThemeColors.ERROR_COLOR);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }
}
