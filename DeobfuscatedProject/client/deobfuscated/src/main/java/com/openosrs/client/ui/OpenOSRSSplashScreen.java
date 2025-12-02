/*
 * OpenOSRSSplashScreen - Bypassed version
 *
 * This replaces the original Squire splash screen to skip API authentication.
 * Any auth key entered will be accepted without network validation.
 *
 * The UI looks exactly the same - only the checkKey() method is bypassed.
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

// Use the original UI components from the JAR - they will be loaded from squire-with-logging.jar
import com.openosrs.client.ui.components.AuthenticationPanel;
import com.openosrs.client.ui.components.InfoPanel;
import com.openosrs.client.ui.components.MessagePanel;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ColorScheme;
import gg.squire.client.Squire;

/**
 * Bypassed OpenOSRSSplashScreen that accepts any auth key without API validation.
 * Uses the original UI components - only the authenticate() method is changed.
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

        try {
            this.setIconImage(ClientUI.ICON);
        } catch (Exception e) {
            log.debug("Could not set icon: {}", e.getMessage());
        }

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
     * BYPASSED: Accepts any key without calling the Squire API.
     * The original method called checkKey() which made an HTTP request.
     * This version skips that and just accepts the key directly.
     */
    public static void authenticate(String key) {
        log.info("===========================================");
        log.info("AUTHENTICATION BYPASSED - Accepting key");
        log.info("===========================================");

        if (key == null || key.trim().isEmpty()) {
            key = "local-bypass-key";
        }

        // BYPASSED: Original code called checkKey() here which made API request
        // String res = OpenOSRSSplashScreen.checkKey(key);
        // if (res == null || !res.equals(key)) {
        //     JOptionPane.showMessageDialog(INSTANCE, res == null ? "Invalid key for alpha usage" : res, "Error", 0);
        //     System.exit(0);
        // }

        // Set authenticated flag
        authenticated = true;
        log.info("Set authenticated = true");

        // Hide auth panel
        if (INSTANCE != null) {
            INSTANCE.authPanel.setEnabled(false);
            INSTANCE.authPanel.setVisible(false);
            INSTANCE.getContentPane().add((Component) new InfoPanel(), BorderLayout.EAST);
        }

        // Generate a fake hardware ID
        String fakeAuth = byteArrayToHexString(("local:" + System.currentTimeMillis()).getBytes(StandardCharsets.UTF_8));

        // Call Squire.setAuthentication to initialize the client properly
        try {
            Squire.setAuthentication(key, fakeAuth);
            log.info("Called Squire.setAuthentication(key={}, auth={})", key, fakeAuth);
        } catch (Exception e) {
            log.warn("Could not call Squire.setAuthentication: {}", e.getMessage());
        }

        log.info("Authentication complete (API bypassed)");
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
