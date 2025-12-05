/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.ui;

import com.openosrs.client.ui.components.AuthenticationPanel;
import com.openosrs.client.ui.components.InfoPanel;
import com.openosrs.client.ui.components.MessagePanel;
import gg.squire.client.Squire;
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
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ColorScheme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenOSRSSplashScreen
extends JFrame {
    private static final Logger log = LoggerFactory.getLogger(OpenOSRSSplashScreen.class);
    public static final Dimension FRAME_SIZE = new Dimension(600, 350);
    public static volatile boolean authenticated = false;
    private static OpenOSRSSplashScreen INSTANCE;
    private final MessagePanel messagePanel = new MessagePanel();
    private final AuthenticationPanel authPanel = new AuthenticationPanel();

    private OpenOSRSSplashScreen() {
        this.setTitle("Squire");
        this.setDefaultCloseOperation(2);
        this.setSize(FRAME_SIZE);
        this.setLayout(new BorderLayout());
        this.setUndecorated(true);
        this.setIconImage(ClientUI.ICON);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.setPreferredSize(FRAME_SIZE);
        jPanel.add((Component)this.authPanel, "East");
        jPanel.add((Component)this.messagePanel, "West");
        this.setContentPane(jPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void authenticate(String string) {
        String string2;
        log.info("===========================================");
        log.info("AUTHENTICATION - Processing key");
        log.info("===========================================");
        if (string == null || string.trim().isEmpty()) {
            string = "local-bypass-key";
        }
        if ((string2 = OpenOSRSSplashScreen.checkKey(string)) == null || !string2.equals(string)) {
            JOptionPane.showMessageDialog(INSTANCE, string2 == null ? "Invalid key for alpha usage" : string2, "Error", 0);
            System.exit(0);
        }
        authenticated = true;
        log.info("Set authenticated = true");
        OpenOSRSSplashScreen.INSTANCE.authPanel.setEnabled(false);
        OpenOSRSSplashScreen.INSTANCE.authPanel.setVisible(false);
        INSTANCE.getContentPane().add((Component)new InfoPanel(), "East");
        log.info("Authentication complete");
    }

    private static String checkKey(String string) {
        Object object;
        log.info(">>> checkKey() ENTRY - key={}", (Object)string);
        if (string == null) {
            log.info("<<< checkKey() EXIT - key is null, returning null");
            return null;
        }
        log.info("checkKey() - API BYPASSED, accepting any key");
        String string2 = null;
        try {
            log.info("checkKey() - Generating hardware ID...");
            object = ("local:" + System.currentTimeMillis()).getBytes(StandardCharsets.UTF_8);
            log.info("checkKey() - Got bytes, calling byteArrayToHexString...");
            string2 = OpenOSRSSplashScreen.byteArrayToHexString((byte[])object);
            log.info("checkKey() - Hardware ID generated: {}", (Object)string2);
        }
        catch (Exception exception) {
            log.error("checkKey() - FAILED to generate hardware ID: {}", (Object)exception.getMessage(), (Object)exception);
            string2 = "fallback-auth-id-00000000000000000000";
        }
        log.info("checkKey() - Setting Squire auth fields via reflection (bypassing doThings anti-tamper)");
        try {
            object = Squire.class;
            Field field = ((Class)object).getDeclaredField("key");
            field.setAccessible(true);
            field.set(null, string);
            log.info("checkKey() - Set Squire.key = {}", (Object)string);
            Field field2 = ((Class)object).getDeclaredField("identifier");
            field2.setAccessible(true);
            field2.set(null, string2 != null ? string2 : "null");
            log.info("checkKey() - Set Squire.identifier = {}", (Object)string2);
            Field field3 = ((Class)object).getDeclaredField("uuid");
            field3.setAccessible(true);
            field3.set(null, UUID.randomUUID());
            log.info("checkKey() - Set Squire.uuid = random UUID");
            log.info("checkKey() - Squire auth fields set successfully (doThings bypassed)");
        }
        catch (Throwable throwable) {
            log.error("checkKey() - Failed to set Squire fields via reflection", throwable);
            log.warn("checkKey() - Continuing anyway - client may have limited functionality");
        }
        log.info("<<< checkKey() EXIT - returning key: {}", (Object)string);
        return string;
    }

    private static String byteArrayToHexString(byte[] byArray) {
        try {
            byte[] byArray2 = MessageDigest.getInstance("SHA-1").digest(byArray);
            StringBuilder stringBuilder = new StringBuilder();
            for (byte by : byArray2) {
                stringBuilder.append(Integer.toString((by & 0xFF) + 256, 16).substring(1));
            }
            return stringBuilder.toString();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "0000000000000000000000000000000000000000";
        }
    }

    public static boolean showing() {
        return INSTANCE != null;
    }

    public static void setError(String string, String string2) {
        if (INSTANCE != null) {
            INSTANCE.setErrorInstance(string, string2);
        }
    }

    public static void init() {
        SwingUtilities.invokeLater(() -> {
            try {
                INSTANCE = new OpenOSRSSplashScreen();
            }
            catch (Exception exception) {
                log.warn("Unable to start splash screen", exception);
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

    public static void stage(double d, double d2, String string, int n, int n2) {
        String string2 = n + " / " + n2;
        OpenOSRSSplashScreen.stage(d + (d2 - d) * (double)n / (double)n2, string + " " + string2);
    }

    public static void stage(double d, String string) {
        if (INSTANCE != null) {
            INSTANCE.setMessage(string, d);
        }
    }

    public static BufferedImage getProfilePicture() {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        }
        catch (AWTException aWTException) {
            // empty catch block
        }
        return bufferedImage;
    }

    public static byte[] getContent(BufferedImage bufferedImage) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (bufferedImage == null) {
                return new byte[0];
            }
            ImageIO.write((RenderedImage)bufferedImage, "png", byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            return new byte[0];
        }
    }

    private void setErrorInstance(String string, String string2) {
        this.messagePanel.setMessageContent(string2);
        this.messagePanel.setMessageTitle("Error!");
        this.messagePanel.getBarLabel().setText(string);
        this.messagePanel.getBar().setBackground(ColorScheme.PROGRESS_ERROR_COLOR.darker());
        this.messagePanel.getBar().setForeground(ColorScheme.PROGRESS_ERROR_COLOR);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    private void setBarText(String string) {
        JProgressBar jProgressBar = this.messagePanel.getBar();
        jProgressBar.setString(string);
        jProgressBar.setStringPainted(string != null);
        jProgressBar.revalidate();
        jProgressBar.repaint();
    }

    private void setMessage(String string, double d) {
        this.messagePanel.getBarLabel().setText(string);
        this.messagePanel.getBar().setMaximum(1000);
        this.messagePanel.getBar().setValue((int)(d * 1000.0));
        this.setBarText(null);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    public MessagePanel getMessagePanel() {
        return this.messagePanel;
    }
}

