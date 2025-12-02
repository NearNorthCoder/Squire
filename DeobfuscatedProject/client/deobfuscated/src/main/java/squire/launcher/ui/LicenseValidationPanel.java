/*
 * Deobfuscated from: c/r/m/c.java
 * Original class name: c
 * Purpose: Panel for HWID/license key validation
 */
package squire.launcher.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import squire.launcher.ui.components.CustomScrollBarUI;
import squire.launcher.ui.components.ProgressBarUI;
import squire.launcher.ui.components.WrappingLabel;
import squire.launcher.util.FontManager;
import squire.launcher.util.HardwareIdGenerator;
import squire.launcher.util.ThemeColors;
import net.runelite.launcher.Launcher;

/**
 * Panel for HWID/license key validation in the Squire launcher.
 *
 * Shown when the user hasn't registered their hardware ID yet.
 * Validates the license key against the Squire API.
 */
public class LicenseValidationPanel extends JPanel {

    // ==================== Constants ====================

    /**
     * License validation API endpoint
     */
    private static final String LICENSE_API_URL = "https://api.squire.gg/license/validate?key=%s&hwid=%s";

    /**
     * Squire directory (~/.squire/)
     */
    public static final File SQUIRE_DIR;

    /**
     * Panel size (frame width minus sidebar)
     */
    static final Dimension PANEL_SIZE;

    /**
     * Progress bar size
     */
    private static final Dimension PROGRESS_BAR_SIZE;

    /**
     * Separator/border color
     */
    public static final Color SEPARATOR_COLOR;

    /**
     * HTTP success code
     */
    private static final int HTTP_OK = 200;

    // ==================== UI Components ====================

    /**
     * Title label
     */
    private final JLabel titleLabel;

    /**
     * Description label
     */
    private final JLabel descriptionLabel;

    /**
     * Button container panel
     */
    private final JPanel buttonPanel;

    /**
     * Progress bar
     */
    private final JProgressBar progressBar;

    /**
     * Scroll pane for description
     */
    private final JScrollPane scrollPane;

    // ==================== Static Initialization ====================

    static {
        SQUIRE_DIR = new File(System.getProperty("user.home") + "/.squire/");
        PANEL_SIZE = new Dimension(
                LauncherFrame.WINDOW_SIZE.width - SidebarInfoPanel.SIDEBAR_SIZE.width,
                LauncherFrame.WINDOW_SIZE.height);
        PROGRESS_BAR_SIZE = new Dimension(PANEL_SIZE.width, 30);
        SEPARATOR_COLOR = new Color(10, 10, 10, 255);
    }

    // ==================== Constructor ====================

    /**
     * Creates the license validation panel.
     */
    public LicenseValidationPanel() {
        this.titleLabel = new JLabel("License Key");
        this.progressBar = new JProgressBar(0, 100);

        // Panel setup
        this.setPreferredSize(PANEL_SIZE);
        this.setLayout(new GridBagLayout());
        this.setBackground(ThemeColors.BACKGROUND_DARK);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 9;

        // Title label
        this.titleLabel.setFont(new Font(
                FontManager.getRegularFont().getName(),
                FontManager.getRegularFont().getStyle(),
                32));
        this.titleLabel.setHorizontalAlignment(JLabel.CENTER);
        this.titleLabel.setForeground(Color.WHITE);
        this.add(this.titleLabel, gbc);
        gbc.gridy++;

        // Description label
        this.descriptionLabel = createWrappingLabel(
                "Enter your license key below to activate Squire. " +
                "You can find your license key in your email or on the Squire dashboard.");

        this.scrollPane = new JScrollPane(this.descriptionLabel,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());

        JViewport viewport = this.scrollPane.getViewport();
        viewport.setForeground(Color.WHITE);
        viewport.setBackground(ThemeColors.BACKGROUND_DARK);
        viewport.setOpaque(true);

        gbc.weighty = 1.0;
        this.add(this.scrollPane, gbc);

        // License key text field
        JTextField licenseField = new JTextField();
        licenseField.setPreferredSize(new Dimension(300, 30));
        licenseField.setBackground(ThemeColors.BUTTON_BACKGROUND);
        licenseField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLoweredBevelBorder(),
                BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        licenseField.setCaretColor(Color.WHITE);
        licenseField.setForeground(ThemeColors.TEXT_COLOR);

        JPanel fieldPanel = new JPanel();
        fieldPanel.setBackground(ThemeColors.BACKGROUND_DARK);
        fieldPanel.add(licenseField);

        gbc.gridy++;
        gbc.weightx = 0.25;
        this.add(fieldPanel, gbc);
        gbc.gridy++;

        // Button panel
        this.buttonPanel = new JPanel();
        this.buttonPanel.setBorder(new EmptyBorder(5, 10, 5, 10));
        this.buttonPanel.setBackground(ThemeColors.BACKGROUND_DARK);
        this.buttonPanel.setOpaque(true);

        // Activate button
        JButton activateButton = new JButton("Activate License");
        activateButton.setPreferredSize(new Dimension(120, 40));
        activateButton.setFont(new Font(
                FontManager.getRegularFont().getName(),
                FontManager.getBoldFont().getStyle(),
                16));
        activateButton.setForeground(Color.WHITE);
        activateButton.setOpaque(false);
        activateButton.setContentAreaFilled(false);
        activateButton.setFocusPainted(false);
        activateButton.setBorder(BorderFactory.createLineBorder(ThemeColors.BORDER_COLOR));
        activateButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        activateButton.addActionListener(e -> validateLicense(licenseField));

        this.buttonPanel.add(activateButton, "Center");
        this.add(this.buttonPanel, gbc);
        gbc.gridy++;

        // Progress bar
        gbc.weighty = 0.0;
        gbc.weightx = 1.0;
        gbc.ipady = 5;

        this.progressBar.setBackground(ThemeColors.PRIMARY_COLOR.darker());
        this.progressBar.setForeground(ThemeColors.TEXT_COLOR);
        this.progressBar.setMinimumSize(PROGRESS_BAR_SIZE);
        this.progressBar.setMaximumSize(PROGRESS_BAR_SIZE);
        this.progressBar.setBorder(new MatteBorder(0, 0, 0, 0, Color.LIGHT_GRAY));
        this.progressBar.setUI(new ProgressBarUI(this));
        this.progressBar.setFont(FontManager.getRegularFont());
        this.progressBar.setVisible(true);
        this.add(this.progressBar, gbc);
        gbc.gridy++;

        this.setVisible(true);
    }

    // ==================== Public Methods ====================

    /**
     * Gets the button panel.
     */
    public JPanel getButtonPanel() {
        return this.buttonPanel;
    }

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

    // ==================== Private Methods ====================

    /**
     * Creates a wrapping label with HTML styling.
     */
    private JLabel createWrappingLabel(String text) {
        WrappingLabel label = new WrappingLabel(this,
                "<html><div style='text-align:center;'>" + text + "</div></html>");
        label.setFont(new Font(
                FontManager.getRegularFont().getName(),
                FontManager.getBoldFont().getStyle(),
                16));
        label.setForeground(Color.WHITE);
        label.setBorder(new EmptyBorder(0, 25, 0, 25));
        label.setHorizontalAlignment(JLabel.CENTER);
        return label;
    }

    /**
     * Validates the license key against the API.
     *
     * @param licenseField Text field containing the license key
     */
    private void validateLicense(JTextField licenseField) {
        String licenseKey = licenseField.getText().trim();

        // TODO: Re-enable auth validation later
        // For now, bypass all authentication to test client loading

        /*
        // Validate input
        if (licenseKey.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a license key.",
                    "Missing License Key",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Generate hardware ID from system properties
        String hwid = HardwareIdGenerator.generateHwid();

        // Build API request
        OkHttpClient httpClient = new OkHttpClient();
        String url = String.format(LICENSE_API_URL, licenseKey, hwid);
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (response.code() != HTTP_OK) {
                JOptionPane.showMessageDialog(this,
                        "Invalid license key. Please check your key and try again.",
                        "Validation Failed",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Failed to connect to license server. Please check your internet connection.",
                    "Connection Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // License validated successfully - set authentication state
        Launcher.authenticated = true;
        Launcher.auth = hwid;
        */

        // BYPASS: Skip auth, just mark as authenticated
        Launcher.authenticated = true;
        Launcher.auth = "bypass-auth-for-testing";

        // Ensure Squire directory exists
        if (!SQUIRE_DIR.exists()) {
            SQUIRE_DIR.mkdirs();
        }

        // Save a dummy hwid file (this marks the user as registered)
        File hwidFile = new File(SQUIRE_DIR, "hwid");
        try {
            hwidFile.createNewFile();
            try (FileWriter writer = new FileWriter(hwidFile)) {
                // Save dummy value to bypass auth check on next launch
                writer.write(licenseKey.isEmpty() ? "bypass-auth" : licenseKey.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the current launcher frame
        LauncherFrame.close();

        // Reopen the launcher - it will now show profile selection since hwid file exists
        LauncherFrame.open(null);
    }

    /**
     * Creates an HWID text field pre-populated with saved value.
     */
    private static JTextField createHwidField() {
        JTextField textField = new JTextField();
        textField.setForeground(ThemeColors.BACKGROUND_DARK);
        textField.setCaretColor(ThemeColors.BACKGROUND_DARK);
        textField.setPreferredSize(new Dimension(24, 24));
        textField.setMinimumSize(new Dimension(24, 24));
        textField.setBorder(new CompoundBorder(
                new MatteBorder(1, 0, 0, 0, SEPARATOR_COLOR),
                new EmptyBorder(0, 25, 0, 25)));

        String savedHwid = readHwid();
        if (savedHwid != null) {
            textField.setText(savedHwid);
        }

        return textField;
    }
}
