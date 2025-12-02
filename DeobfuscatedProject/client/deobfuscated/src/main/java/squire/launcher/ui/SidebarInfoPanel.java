/*
 * Deobfuscated from: c/r/m/q.java
 * Original class name: q
 * Purpose: Left sidebar panel showing logo, version info, and links
 */
package squire.launcher.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.ui.components.ClickableLabelAdapter;
import squire.launcher.ui.components.HwidKeyListener;
import squire.launcher.util.DesktopUtil;
import squire.launcher.util.FontManager;
import squire.launcher.util.ImageLoader;
import squire.launcher.util.ThemeColors;

/**
 * Left sidebar panel in the Squire launcher.
 *
 * Displays:
 * - Squire logo
 * - Launcher version
 * - Launch mode (if specified)
 * - Clickable links (Discord, Website, Exit)
 * - HWID text field (if not already saved)
 */
class SidebarInfoPanel extends JPanel {

    private static final Logger log = LoggerFactory.getLogger(SidebarInfoPanel.class);

    // ==================== Constants ====================

    /**
     * Discord invite URL
     */
    private static final String DISCORD_URL = "https://discord.gg/squire";

    /**
     * Website URL
     */
    private static final String WEBSITE_URL = "https://squire.gg";

    /**
     * Documentation URL
     */
    private static final String DOCS_URL = "https://docs.squire.gg";

    /**
     * Squire directory (~/.squire/)
     */
    public static final File SQUIRE_DIR;

    /**
     * Sidebar dimensions (width, full height)
     */
    static final Dimension SIDEBAR_SIZE;

    /**
     * Label dimensions
     */
    private static final Dimension LABEL_SIZE;

    /**
     * Border/separator color (dark gray with transparency)
     */
    private static final Color SEPARATOR_COLOR;

    /**
     * Logo image
     */
    private static final BufferedImage LOGO_IMAGE;

    /**
     * Logo display size (pixels)
     */
    private static final int LOGO_SIZE = 160;

    // ==================== Static Initialization ====================

    static {
        SQUIRE_DIR = new File(System.getProperty("user.home") + "/.squire/");
        SIDEBAR_SIZE = new Dimension(200, LauncherFrame.WINDOW_SIZE.height);
        SEPARATOR_COLOR = new Color(10, 10, 10, 200);
        LOGO_IMAGE = ImageLoader.loadImage(SidebarInfoPanel.class, "/squire_logo.png");
        LABEL_SIZE = new Dimension(SIDEBAR_SIZE.width, 25);
    }

    // ==================== Constructor ====================

    /**
     * Creates the sidebar info panel.
     *
     * @param launchMode Current launch mode (e.g., "Developer", "Standard")
     */
    SidebarInfoPanel(String launchMode) {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(SIDEBAR_SIZE);
        this.setBackground(new Color(0, 0, 0)); // Pure black background

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 5;

        // Logo
        ImageIcon logoIcon = new ImageIcon();
        if (LOGO_IMAGE != null) {
            logoIcon.setImage(LOGO_IMAGE.getScaledInstance(LOGO_SIZE, LOGO_SIZE, java.awt.Image.SCALE_SMOOTH));
        }

        JLabel logoLabel = new JLabel((Icon) logoIcon);
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1.0;
        this.add(logoLabel, gbc);
        gbc.gridy++;

        // Reset anchor and weight for bottom labels
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.weighty = 0.0;

        // Version label
        this.add(createInfoLabel("Launcher Version: " + getVersion()), gbc);
        gbc.gridy++;

        // Launch mode (if specified)
        if (launchMode != null) {
            this.add(createInfoLabel("Mode: " + launchMode), gbc);
            gbc.gridy++;
        }

        // Logs link
        JLabel logsLink = createClickableLabel("Open Logs Folder", null, () -> {
            DesktopUtil.openFile(getLogsDirectory());
        });
        this.add(logsLink, gbc);
        gbc.gridy++;

        // Discord link
        JLabel discordLink = createClickableLabel("Join Discord", "Join our Discord community for support", () -> {
            DesktopUtil.openUrl(DISCORD_URL);
        });
        this.add(discordLink, gbc);
        gbc.gridy++;

        // Website link
        JLabel websiteLink = createClickableLabel("Visit Website", "Open the Squire website", () -> {
            DesktopUtil.openUrl(WEBSITE_URL);
        });
        this.add(websiteLink, gbc);
        gbc.gridy++;

        // Exit button
        JLabel exitLabel = createClickableLabel("Exit", "Close the launcher", () -> {
            System.exit(0);
        });
        this.add(exitLabel, gbc);
        gbc.gridy++;

        // HWID text field (if not saved)
        JTextField hwidField = createHwidField();
        if (hwidField != null) {
            JLabel hwidLabel = createClickableLabel("Hardware ID", "Enter your Hardware ID", () -> {});
            this.add(hwidLabel, gbc);
            gbc.gridy++;

            this.add(hwidField, gbc);
            gbc.gridy++;
        } else {
            // HWID already saved, set it on launcher
            // Launcher.setHwid(readHwid());
        }
    }

    // ==================== Static Helper Methods ====================

    /**
     * Reads the saved HWID from file.
     *
     * @return HWID string, or null if not saved
     */
    public static String readHwid() {
        File hwidFile = new File(SQUIRE_DIR, "hwid");
        if (!hwidFile.exists()) {
            return null;
        }

        try (Scanner scanner = new Scanner(hwidFile)) {
            if (!scanner.hasNextLine()) {
                return "";
            }
            return scanner.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Gets the launcher version.
     */
    private static String getVersion() {
        // Would normally come from LauncherProperties
        return "1.0.0";
    }

    /**
     * Gets the logs directory.
     */
    private static File getLogsDirectory() {
        return new File(SQUIRE_DIR, "logs");
    }

    // ==================== UI Component Creation ====================

    /**
     * Creates an info label (non-clickable).
     */
    private static JLabel createInfoLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(FontManager.getBoldFont());
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(ThemeColors.TEXT_COLOR);
        label.setBackground(null);
        label.setPreferredSize(LABEL_SIZE);
        label.setMinimumSize(LABEL_SIZE);
        label.setBorder(new MatteBorder(1, 0, 0, 0, SEPARATOR_COLOR));
        return label;
    }

    /**
     * Creates a clickable label with hover effect.
     *
     * @param text Label text
     * @param tooltip Tooltip text
     * @param action Action to perform on click
     */
    private static JLabel createClickableLabel(String text, String tooltip, Runnable action) {
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setToolTipText(tooltip);
        label.setOpaque(true);
        label.setBackground(null);
        label.setForeground(Color.WHITE);
        label.setFont(FontManager.getRegularFont());
        label.setBorder(new CompoundBorder(
                new MatteBorder(1, 0, 0, 0, SEPARATOR_COLOR),
                new EmptyBorder(3, 0, 3, 0)));
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.addMouseListener(new ClickableLabelAdapter(action, label));
        return label;
    }

    /**
     * Creates an accent-colored clickable label.
     */
    private static JLabel createAccentLabel(String text, Runnable action) {
        JLabel label = new JLabel(text);
        label.setFont(FontManager.getBoldFont());
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(ThemeColors.ERROR_COLOR); // Red/accent color
        label.setBackground(null);
        label.setPreferredSize(LABEL_SIZE);
        label.setMinimumSize(LABEL_SIZE);
        label.setBorder(new MatteBorder(1, 0, 0, 0, SEPARATOR_COLOR));
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // Add click listener
        return label;
    }

    /**
     * Creates the HWID text field if HWID is not already saved.
     *
     * @return TextField for HWID entry, or null if already saved
     */
    public JTextField createHwidField() {
        String savedHwid = readHwid();
        if (savedHwid != null) {
            return null; // Already have HWID
        }

        JTextField textField = new JTextField();
        textField.setForeground(ThemeColors.BACKGROUND_DARK);
        textField.setCaretColor(ThemeColors.BACKGROUND_DARK);
        textField.setBackground(ThemeColors.TEXT_COLOR);
        textField.setPreferredSize(new Dimension(24, 24));
        textField.setMinimumSize(new Dimension(24, 24));
        textField.setBorder(new CompoundBorder(
                new MatteBorder(1, 0, 0, 0, ThemeColors.BORDER_COLOR),
                new EmptyBorder(0, 193, 0, 193)));
        textField.addKeyListener(new HwidKeyListener(textField));
        return textField;
    }
}
