/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.launcher;

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
import javax.swing.plaf.basic.BasicProgressBarUI;
import net.runelite.launcher.ColorScheme;
import net.runelite.launcher.CustomScrollBarUI;
import net.runelite.launcher.FontManager;
import net.runelite.launcher.InfoPanel;
import net.runelite.launcher.Launcher;
import net.runelite.launcher.SquireSplashScreen;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class AuthenticationPanel
extends JPanel {
    public static final File SQUIRE_HOME = new File(System.getProperty("user.home") + "/.squire/");
    private static final Dimension PANEL_SIZE = new Dimension(SquireSplashScreen.FRAME_SIZE.width - InfoPanel.PANEL_SIZE.width, SquireSplashScreen.FRAME_SIZE.height);
    private static final Dimension BAR_SIZE = new Dimension(AuthenticationPanel.PANEL_SIZE.width, 30);
    private static final int MESSAGE_AREA_PADDING = 15;
    public static final Color DARK_GREY = new Color(10, 10, 10, 255);
    private final JLabel titleLabel = new JLabel("Squire Launcher");
    private final JLabel messageArea;
    private final JProgressBar bar = new JProgressBar(0, 100);
    private final JScrollPane scrollPane;
    private final JPanel buttonPanel;

    public AuthenticationPanel() {
        this.setPreferredSize(PANEL_SIZE);
        this.setLayout(new GridBagLayout());
        this.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = 1;
        c.anchor = 11;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 25;
        this.titleLabel.setFont(new Font(FontManager.getRunescapeFont().getName(), FontManager.getRunescapeFont().getStyle(), 32));
        this.titleLabel.setHorizontalAlignment(0);
        this.titleLabel.setForeground(Color.WHITE);
        this.add((Component)this.titleLabel, c);
        ++c.gridy;
        this.messageArea = this.messageArea("Please authenticate since this is your first time opening the client.");
        this.scrollPane = new JScrollPane(this.messageArea, 20, 31);
        this.scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        JViewport scrollPaneViewport = this.scrollPane.getViewport();
        scrollPaneViewport.setForeground(Color.WHITE);
        scrollPaneViewport.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        scrollPaneViewport.setOpaque(true);
        c.weighty = 1.0;
        this.add((Component)this.scrollPane, c);
        JTextField auth = new JTextField();
        auth.setPreferredSize(new Dimension(300, 30));
        auth.setBackground(ColorScheme.MEDIUM_GRAY_COLOR);
        auth.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        auth.setCaretColor(Color.WHITE);
        auth.setForeground(ColorScheme.BRAND_BLUE);
        JPanel authPanel = new JPanel();
        authPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        authPanel.add(auth);
        ++c.gridy;
        c.weightx = 0.25;
        this.add((Component)authPanel, c);
        ++c.gridy;
        this.buttonPanel = new JPanel();
        this.buttonPanel.setBorder(new EmptyBorder(5, 10, 5, 10));
        this.buttonPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        this.buttonPanel.setOpaque(true);
        JButton button = new JButton("Authenticate");
        button.setPreferredSize(new Dimension(120, 40));
        button.setFont(new Font(FontManager.getRunescapeFont().getName(), FontManager.getRunescapeSmallFont().getStyle(), 16));
        button.setForeground(Color.WHITE);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(ColorScheme.DARK_GRAY_COLOR));
        button.setCursor(Cursor.getPredefinedCursor(12));
        button.addActionListener(a -> this.saveLoginData(auth));
        this.buttonPanel.add((Component)button, "Center");
        this.add((Component)this.buttonPanel, c);
        ++c.gridy;
        c.weighty = 0.0;
        c.weightx = 1.0;
        c.ipady = 5;
        this.bar.setBackground(ColorScheme.BRAND_BLUE_TRANSPARENT.darker());
        this.bar.setForeground(ColorScheme.BRAND_BLUE);
        this.bar.setMinimumSize(BAR_SIZE);
        this.bar.setMaximumSize(BAR_SIZE);
        this.bar.setBorder(new MatteBorder(0, 0, 0, 0, Color.LIGHT_GRAY));
        this.bar.setUI(new BasicProgressBarUI(){

            @Override
            protected Color getSelectionForeground() {
                return ColorScheme.DARKER_GRAY_COLOR;
            }

            @Override
            protected Color getSelectionBackground() {
                return ColorScheme.DARKER_GRAY_COLOR;
            }
        });
        this.bar.setFont(FontManager.getRunescapeFont());
        this.bar.setVisible(true);
        this.add((Component)this.bar, c);
        ++c.gridy;
        this.setVisible(true);
    }

    private static JTextField createPanelTextField() {
        JTextField textField = new JTextField();
        textField.setForeground(ColorScheme.DARKER_GRAY_COLOR);
        textField.setCaretColor(ColorScheme.DARKER_GRAY_COLOR);
        textField.setPreferredSize(new Dimension(24, 24));
        textField.setMinimumSize(new Dimension(24, 24));
        textField.setBorder(new CompoundBorder(new MatteBorder(1, 0, 0, 0, DARK_GREY), new EmptyBorder(0, 15, 0, 15)));
        String file = AuthenticationPanel.readKeyFile();
        if (file != null) {
            textField.setText(file);
        }
        return textField;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String readKeyFile() {
        File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
        if (!keyFile.exists()) {
            return null;
        }
        try (Scanner reader = new Scanner(keyFile);){
            if (!reader.hasNextLine()) {
                String string = "";
                return string;
            }
            String string = reader.nextLine();
            return string;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveLoginData(JTextField auth) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(String.format("https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/AuthenticateAlpha?key=%s&mid=%s", auth.getText().trim(), "launcher")).get().build();
        try (Response res = okHttpClient.newCall(request).execute();){
            ResponseBody body = res.body();
            if (res.code() != 200) {
                JOptionPane.showMessageDialog(this, "This authentication key is invalid", "Invalid Auth", 0);
                return;
            }
        }
        catch (IOException e) {
            return;
        }
        Launcher.authenticated = true;
        SquireSplashScreen.close();
        String text = auth.getText();
        File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
        if (!SQUIRE_HOME.exists()) {
            SQUIRE_HOME.mkdirs();
        }
        try {
            keyFile.createNewFile();
            try (FileWriter fileWriter = new FileWriter(keyFile);){
                fileWriter.write(text.trim());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private JLabel messageArea(String message) {
        JLabel messageArea = new JLabel("<html><div style='text-align:center;'>" + message + "</div></html>"){

            @Override
            public Dimension getPreferredSize() {
                Dimension results = super.getPreferredSize();
                results.width = AuthenticationPanel.PANEL_SIZE.width - 15;
                return results;
            }
        };
        messageArea.setFont(new Font(FontManager.getRunescapeFont().getName(), FontManager.getRunescapeSmallFont().getStyle(), 16));
        messageArea.setForeground(Color.WHITE);
        messageArea.setBorder(new EmptyBorder(0, 15, 0, 15));
        messageArea.setHorizontalAlignment(0);
        return messageArea;
    }

    public JPanel getButtonPanel() {
        return this.buttonPanel;
    }
}
