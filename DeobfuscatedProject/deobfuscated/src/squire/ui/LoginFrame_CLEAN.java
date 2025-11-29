/**
 * LoginFrame - Main login window for Squire launcher
 *
 * DEOBFUSCATED VERSION - Original class: c.r.m.L
 *
 * This class handles:
 * - Main launcher window (JFrame)
 * - Progress display during updates/authentication
 * - Account selection UI
 * - Error/status message display
 */
package squire.ui;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import net.runelite.launcher.Launcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginFrame extends JFrame {

    // ==========================================================================
    // CONSTANTS - Decrypted from obfuscated code
    // ==========================================================================

    public static final String WINDOW_TITLE = "Squire";
    public static final String ICON_PATH = "squire.png";
    public static final String DEFAULT_MESSAGE = "Selecting account";
    public static final String LAYOUT_CENTER = "Center";
    public static final String LAYOUT_NORTH = "North";
    public static final String LAYOUT_SOUTH = "South";
    public static final String LAYOUT_EAST = "East";
    public static final String LAYOUT_WEST = "West";
    public static final String PROGRESS_FORMAT = "%.2f MB / %.2f MB";
    public static final String CONFIG_DIR_PROPERTY = "user.home";
    public static final String CONFIG_FILENAME = ".session";
    public static final String INIT_ERROR = "Failed to initialize login frame";

    // Window dimensions
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 350;
    public static final Dimension WINDOW_SIZE = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);

    // ==========================================================================
    // INSTANCE FIELDS
    // ==========================================================================

    private static final Logger logger = LoggerFactory.getLogger(LoginFrame.class);
    private static LoginFrame instance;
    public static File squireDir;

    private final AuthPanel authPanel;
    private ProgressPanel progressPanel;

    // ==========================================================================
    // SINGLETON PATTERN
    // ==========================================================================

    private LoginFrame(String initialMessage, boolean hasExistingSession) {
        this.authPanel = new AuthPanel();

        setTitle(WINDOW_TITLE);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(WINDOW_SIZE);
        setLayout(new BorderLayout());
        setUndecorated(true);
        setIconImage(ImageLoader.loadImage(Launcher.class, ICON_PATH));

        // Create progress panel
        this.progressPanel = new ProgressPanel(DEFAULT_MESSAGE.equals(initialMessage));

        // Build UI
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setPreferredSize(WINDOW_SIZE);

        if (hasExistingSession) {
            // Show account selector
            contentPanel.add(new LogoSidePanel(initialMessage), LAYOUT_WEST);
            contentPanel.add(this.progressPanel, LAYOUT_CENTER);
        } else {
            // Show auth panel
            contentPanel.add(this.authPanel, LAYOUT_CENTER);
        }

        setContentPane(contentPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static LoginFrame getInstance() {
        return instance;
    }

    public static void show(String message) {
        try {
            SwingUtilities.invokeAndWait(() -> {
                if (instance != null) {
                    return;
                }
                try {
                    File configDir = new File(System.getProperty(CONFIG_DIR_PROPERTY) + "/.squire/");
                    File sessionFile = new File(configDir, CONFIG_FILENAME);
                    instance = new LoginFrame(message, sessionFile.exists());
                } catch (Exception e) {
                    logger.warn(INIT_ERROR, e);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

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

    // ==========================================================================
    // PROGRESS UPDATES
    // ==========================================================================

    /**
     * Update progress bar and status message
     */
    public static void updateProgress(double progress, String message) {
        if (instance != null) {
            instance.setProgress(message, progress);
        }
    }

    /**
     * Update progress with byte counts (for downloads)
     */
    public static void updateProgress(double startPercent, double endPercent, String message,
                                       int currentBytes, int totalBytes, boolean useMB) {
        String sizeText;
        if (useMB) {
            sizeText = String.format(PROGRESS_FORMAT, currentBytes / 1000000.0, totalBytes / 1000000.0);
        } else {
            sizeText = currentBytes + " / " + totalBytes;
        }

        double progress = startPercent + (endPercent - startPercent) * currentBytes / totalBytes;
        updateProgress(progress, message + " " + sizeText);
    }

    public static void setStatus(String status) {
        if (instance != null) {
            instance.progressPanel.setDescription(status);
        }
    }

    public static void setMessage(String message) {
        if (instance != null) {
            instance.progressPanel.setTitle(message);
        }
    }

    public static void showButtons() {
        if (instance != null) {
            instance.progressPanel.showButtons();
        }
    }

    public static JButton addButton(String text) {
        if (instance != null) {
            return instance.progressPanel.createButton(text, "");
        }
        return null;
    }

    public static void showError(String title, String message) {
        if (instance != null) {
            instance.displayError(title, message);
        }
    }

    // ==========================================================================
    // PRIVATE METHODS
    // ==========================================================================

    private void setProgress(String message, double progress) {
        progressPanel.getProgressLabel().setText(message);
        progressPanel.getProgressBar().setMaximum(1000);
        progressPanel.getProgressBar().setValue((int) (progress * 1000));
        updateProgressString(null);
        getContentPane().revalidate();
        getContentPane().repaint();
    }

    private void updateProgressString(String text) {
        JProgressBar bar = progressPanel.getProgressBar();
        bar.setString(text);
        bar.setStringPainted(text != null);
        bar.revalidate();
        bar.repaint();
    }

    private void displayError(String title, String message) {
        progressPanel.setDescription(message);
        progressPanel.setTitle("");
        progressPanel.getProgressLabel().setText(title);
        progressPanel.getProgressBar().setBackground(ThemeColors.ERROR_COLOR.darker());
        progressPanel.getProgressBar().setForeground(ThemeColors.ERROR_COLOR);
        getContentPane().revalidate();
        getContentPane().repaint();
    }
}
