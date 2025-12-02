/*
 * AuthenticationPanel - Bypassed version
 *
 * This replaces the original Squire AuthenticationPanel to skip API authentication.
 * Any auth key entered will be accepted without network validation.
 */
package net.runelite.launcher;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bypassed AuthenticationPanel that accepts any auth key without API validation.
 */
public class AuthenticationPanel extends JPanel {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationPanel.class);

    public static final File SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");
    private static final Dimension PANEL_SIZE = new Dimension(500, 350);
    private static final Dimension BAR_SIZE = new Dimension(400, 30);
    private static final int MESSAGE_AREA_PADDING = 15;
    public static final Color DARK_GREY = new Color(40, 40, 40);

    private final JLabel titleLabel;
    private final JLabel messageArea;
    private final JProgressBar bar;
    private final JScrollPane scrollPane;
    private final JPanel buttonPanel;

    public AuthenticationPanel() {
        this.titleLabel = new JLabel("Squire Launcher (Local Mode)");
        this.bar = new JProgressBar(0, 100);

        setPreferredSize(PANEL_SIZE);
        setLayout(new GridBagLayout());
        setBackground(ColorScheme.DARKER_GRAY_COLOR);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 25;

        // Title
        titleLabel.setFont(new Font(FontManager.getRunescapeFont().getName(),
            FontManager.getRunescapeFont().getStyle(), 32));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setForeground(Color.WHITE);
        add(titleLabel, c);

        c.gridy++;

        // Message
        this.messageArea = messageArea("Enter any value to continue (API validation bypassed)");

        this.scrollPane = new JScrollPane(messageArea,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));

        JViewport viewport = scrollPane.getViewport();
        viewport.setForeground(Color.WHITE);
        viewport.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        viewport.setOpaque(true);

        c.weighty = 1.0;
        add(scrollPane, c);

        // Text field for auth key
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 30));
        textField.setBackground(ColorScheme.MEDIUM_GRAY_COLOR);
        textField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLoweredBevelBorder(),
            BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        textField.setCaretColor(Color.WHITE);
        textField.setForeground(ColorScheme.BRAND_BLUE);

        // Pre-fill with saved key if exists
        String savedKey = readKeyFile();
        if (savedKey != null && !savedKey.isEmpty()) {
            textField.setText(savedKey);
        }

        JPanel textPanel = new JPanel();
        textPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        textPanel.add(textField);

        c.gridy++;
        c.weightx = 0.25;
        add(textPanel, c);

        // Button panel
        c.gridy++;
        this.buttonPanel = new JPanel();
        buttonPanel.setBorder(new EmptyBorder(5, 10, 5, 10));
        buttonPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        buttonPanel.setOpaque(true);

        JButton authButton = new JButton("Continue");
        authButton.setPreferredSize(new Dimension(120, 40));
        authButton.setFont(new Font(FontManager.getRunescapeFont().getName(),
            FontManager.getRunescapeSmallFont().getStyle(), 16));
        authButton.setForeground(Color.WHITE);
        authButton.setOpaque(false);
        authButton.setContentAreaFilled(false);
        authButton.setFocusPainted(false);
        authButton.setBorder(BorderFactory.createLineBorder(ColorScheme.DARK_GRAY_COLOR));
        authButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // On click - bypass authentication
        authButton.addActionListener(e -> {
            saveLoginData(textField);
        });

        buttonPanel.add(authButton, "Center");
        add(buttonPanel, c);

        // Progress bar
        c.gridy++;
        c.weighty = 0.0;
        c.weightx = 1.0;
        c.ipady = 5;
        bar.setBackground(ColorScheme.BRAND_BLUE_TRANSPARENT.darker());
        bar.setForeground(ColorScheme.BRAND_BLUE);
        bar.setMinimumSize(BAR_SIZE);
        bar.setMaximumSize(BAR_SIZE);
        bar.setBorder(new MatteBorder(0, 0, 0, 0, Color.LIGHT_GRAY));
        bar.setFont(FontManager.getRunescapeFont());
        bar.setVisible(true);
        add(bar, c);

        setVisible(true);
    }

    /**
     * Reads the saved auth key from cfg.sqr
     */
    public static String readKeyFile() {
        File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
        if (!keyFile.exists()) {
            return null;
        }

        try (Scanner scanner = new Scanner(keyFile)) {
            if (!scanner.hasNextLine()) {
                return "";
            }
            return scanner.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Saves the auth key and sets authenticated=true WITHOUT calling the API.
     * This is the bypassed version - no network validation.
     */
    private void saveLoginData(JTextField textField) {
        String authKey = textField.getText().trim();

        if (authKey.isEmpty()) {
            authKey = "local-bypass";
        }

        log.info("Authentication bypassed - accepting key without API validation");

        // Set Launcher.authenticated = true via reflection
        try {
            Class<?> launcherClass = Class.forName("net.runelite.launcher.Launcher");

            Field authenticatedField = launcherClass.getDeclaredField("authenticated");
            authenticatedField.setAccessible(true);
            authenticatedField.setBoolean(null, true);

            Field authField = launcherClass.getDeclaredField("auth");
            authField.setAccessible(true);
            authField.set(null, authKey);

            log.info("Set Launcher.authenticated=true, auth={}", authKey);
        } catch (Exception e) {
            log.warn("Could not set Launcher fields via reflection: {}", e.getMessage());
        }

        // Save to cfg.sqr file
        try {
            if (!SQUIRE_HOME.exists()) {
                SQUIRE_HOME.mkdirs();
            }
            File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
            try (FileWriter writer = new FileWriter(keyFile)) {
                writer.write(authKey);
            }
            log.info("Saved auth key to {}", keyFile.getAbsolutePath());
        } catch (IOException e) {
            log.error("Failed to save auth key: {}", e.getMessage());
        }

        // Close the splash screen
        try {
            SquireSplashScreen.close();
        } catch (Exception e) {
            log.debug("Could not close splash screen: {}", e.getMessage());
        }
    }

    private JLabel messageArea(String message) {
        JLabel label = new JLabel("<html><div style='text-align: center; padding: " +
            MESSAGE_AREA_PADDING + "px;'>" + message + "</div></html>");
        label.setFont(FontManager.getRunescapeSmallFont());
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);
        return label;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }
}
