/*
 * OpenOSRSSplashScreen - Bypassed version
 *
 * This replaces the original Squire splash screen to skip API authentication.
 * Any auth key entered will be accepted without network validation.
 *
 * Uses the original UI components - only the authenticate() method is changed.
 */
package com.openosrs.client.ui;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.openosrs.client.ui.components.AuthenticationPanel;
import com.openosrs.client.ui.components.InfoPanel;
import com.openosrs.client.ui.components.MessagePanel;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ColorScheme;
import gg.squire.client.Squire;

/**
 * Bypassed OpenOSRSSplashScreen that uses original UI components.
 * Only the authenticate() method is changed to skip API validation.
 */
public class OpenOSRSSplashScreen extends JFrame {

    private static final Logger log = LoggerFactory.getLogger(OpenOSRSSplashScreen.class);

    public static final Dimension FRAME_SIZE = new Dimension(600, 350);
    public static volatile boolean authenticated = false;
    private static OpenOSRSSplashScreen INSTANCE;
    private final MessagePanel messagePanel = new MessagePanel();
    private final AuthenticationPanel authPanel = new AuthenticationPanel();

    private OpenOSRSSplashScreen() {
        this.setTitle("Squire");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(FRAME_SIZE);
        this.setLayout(new BorderLayout());
        this.setUndecorated(true);
        this.setIconImage(ClientUI.ICON);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(FRAME_SIZE);
        panel.add((Component) this.authPanel, BorderLayout.EAST);
        panel.add((Component) this.messagePanel, BorderLayout.WEST);
        this.setContentPane(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * Authenticates the user with the given key.
     * Uses checkKey() which has been bypassed to skip the API call.
     */
    public static void authenticate(String key) {
        log.info("===========================================");
        log.info("AUTHENTICATION - Processing key");
        log.info("===========================================");

        if (key == null || key.trim().isEmpty()) {
            key = "local-bypass-key";
        }

        // Call checkKey - this is now bypassed to skip API
        String res = checkKey(key);
        if (res == null || !res.equals(key)) {
            // This should never happen with bypassed checkKey, but keep for when re-enabled
            javax.swing.JOptionPane.showMessageDialog(INSTANCE,
                res == null ? "Invalid key for alpha usage" : res,
                "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Set authenticated flag
        authenticated = true;
        log.info("Set authenticated = true");

        // Hide auth panel and show info panel (same as original)
        INSTANCE.authPanel.setEnabled(false);
        INSTANCE.authPanel.setVisible(false);
        INSTANCE.getContentPane().add((Component) new InfoPanel(), BorderLayout.EAST);

        log.info("Authentication complete");
    }

    /**
     * Validates the authentication key.
     *
     * TODO: Re-enable API call when ready
     * Original API endpoint: https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/AuthenticateAlpha?key=%s&mid=%s
     *
     * @param key The authentication key to validate
     * @return The key if valid, error message if invalid, null if server error
     */
    private static String checkKey(String key) {
        if (key == null) {
            return null;
        }

        log.info("checkKey() called - API BYPASSED, accepting any key");

        // Generate hardware ID (same format as original)
        String auth = byteArrayToHexString(("local:" + System.currentTimeMillis()).getBytes(StandardCharsets.UTF_8));
        log.info("Hardware ID (generated): {}", auth);

        /*
         * TODO: Re-enable API call when authentication is needed
         * =======================================================
         * // Original: Check for debugging tools
         * if (checkInstances(key)) {
         *     return "Your authentication key is invalid";
         * }
         *
         * // Original: Get real hardware ID
         * String details = getIP() + ":" + getUUID();
         * String auth = byteArrayToHexString(details.getBytes(StandardCharsets.UTF_8));
         * log.info("Hardware ID: " + auth);
         *
         * // Original: Make API request
         * OkHttpClient client = new OkHttpClient();
         * Request request = new Request.Builder()
         *     .url(String.format(
         *         "https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/AuthenticateAlpha?key=%s&mid=%s",
         *         key, auth))
         *     .get()
         *     .build();
         *
         * try (Response res = client.newCall(request).execute()) {
         *     ResponseBody body = res.body();
         *     if (res.code() == 200 && body != null) {
         *         Squire.setAuthentication(key, auth);
         *         Squire.setDiscordId(body.string());
         *         return key;
         *     }
         *     return body != null ? body.string() : "Error connecting to servers";
         * } catch (IOException e) {
         *     log.error("Authentication servers are down", e);
         *     return null;
         * }
         * =======================================================
         */

        // BYPASSED: Skip API call, just set authentication and return key
        try {
            Squire.setAuthentication(key, auth);
            log.info("Called Squire.setAuthentication(key={}, auth={})", key, auth);
        } catch (Exception e) {
            // Squire.setAuthentication() calls doThings() which may fail
            // This is OK - we just need authenticated=true to proceed
            log.warn("Squire.setAuthentication() threw exception (continuing anyway): {}", e.getMessage());
        }

        // TODO: Re-enable Discord ID from API response
        // Squire.setDiscordId(responseBody);

        // Return key to indicate success (same as original on success)
        return key;
    }

    private static String byteArrayToHexString(byte[] b) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(b);
            StringBuilder result = new StringBuilder();
            for (byte value : digest) {
                result.append(Integer.toString((value & 0xFF) + 256, 16).substring(1));
            }
            return result.toString();
        } catch (NoSuchAlgorithmException e) {
            return "0000000000000000000000000000000000000000";
        }
    }

    public static boolean showing() {
        return INSTANCE != null;
    }

    public static void setError(String title, String content) {
        if (INSTANCE != null) {
            INSTANCE.setErrorInstance(title, content);
        }
    }

    public static void init() {
        SwingUtilities.invokeLater(() -> {
            try {
                INSTANCE = new OpenOSRSSplashScreen();
            } catch (Exception e) {
                log.warn("Unable to start splash screen", e);
            }
        });
    }

    public static void close() {
        SwingUtilities.invokeLater(() -> {
            if (INSTANCE == null) {
                return;
            }
            INSTANCE.setVisible(false);
            INSTANCE.dispose();
            INSTANCE = null;
        });
    }

    public static void stage(double startProgress, double endProgress, String progressText, int done, int total) {
        String progress = done + " / " + total;
        OpenOSRSSplashScreen.stage(startProgress + (endProgress - startProgress) * (double) done / (double) total, progressText + " " + progress);
    }

    public static void stage(double overallProgress, String progressText) {
        if (INSTANCE != null) {
            INSTANCE.setMessage(progressText, overallProgress);
        }
    }

    public static BufferedImage getProfilePicture() {
        BufferedImage image = null;
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (AWTException e) {
            // ignore
        }
        return image;
    }

    public static byte[] getContent(BufferedImage image) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            if (image == null) {
                return new byte[0];
            }
            ImageIO.write((RenderedImage) image, "png", os);
            return os.toByteArray();
        } catch (IOException e) {
            return new byte[0];
        }
    }

    private void setErrorInstance(String title, String content) {
        this.messagePanel.setMessageContent(content);
        this.messagePanel.setMessageTitle("Error!");
        this.messagePanel.getBarLabel().setText(title);
        this.messagePanel.getBar().setBackground(ColorScheme.PROGRESS_ERROR_COLOR.darker());
        this.messagePanel.getBar().setForeground(ColorScheme.PROGRESS_ERROR_COLOR);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    private void setBarText(String text) {
        JProgressBar bar = this.messagePanel.getBar();
        bar.setString(text);
        bar.setStringPainted(text != null);
        bar.revalidate();
        bar.repaint();
    }

    private void setMessage(String msg, double value) {
        this.messagePanel.getBarLabel().setText(msg);
        this.messagePanel.getBar().setMaximum(1000);
        this.messagePanel.getBar().setValue((int) (value * 1000.0));
        this.setBarText(null);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    public MessagePanel getMessagePanel() {
        return this.messagePanel;
    }
}
