/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.ui.components;

import com.openosrs.client.OpenOSRS;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import com.openosrs.client.ui.components.InfoPanel;
import gg.squire.client.Squire;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.util.ImageUtil;

public class AuthenticationPanel
extends JPanel {
    static final Dimension PANEL_SIZE = new Dimension(200, OpenOSRSSplashScreen.FRAME_SIZE.height);
    private static final Color DARK_GREY = new Color(10, 10, 10, 255);
    private static final BufferedImage TRANSPARENT_LOGO = ImageUtil.getResourceStreamFromClass(InfoPanel.class, "/openosrs.png");
    private static final Dimension VERSION_SIZE = new Dimension(AuthenticationPanel.PANEL_SIZE.width, 25);

    public AuthenticationPanel() {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(PANEL_SIZE);
        this.setBackground(new Color(38, 38, 38));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = 2;
        c.weightx = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 5;
        ImageIcon transparentLogo = new ImageIcon();
        if (TRANSPARENT_LOGO != null) {
            transparentLogo.setImage(TRANSPARENT_LOGO.getScaledInstance(155, 180, 4));
        }
        JLabel logo = new JLabel(transparentLogo);
        c.anchor = 11;
        c.weighty = 1.0;
        this.add((Component)logo, c);
        ++c.gridy;
        c.anchor = 15;
        c.weighty = 0.0;
        this.add((Component)AuthenticationPanel.createPanelTextButton("Squire Version: " + OpenOSRS.SYSTEM_VERSION), c);
        ++c.gridy;
        this.add((Component)AuthenticationPanel.createPanelTextButton("Authentication Token:"), c);
        ++c.gridy;
        JTextField password = AuthenticationPanel.createPanelTextField();
        password.addActionListener(e -> OpenOSRSSplashScreen.authenticate(password.getText()));
        this.add((Component)password, c);
        ++c.gridy;
    }

    private static JLabel createPanelTextButton(String title) {
        JLabel textButton = new JLabel(title);
        textButton.setFont(FontManager.getRunescapeSmallFont());
        textButton.setHorizontalAlignment(0);
        textButton.setForeground(ColorScheme.BRAND_BLUE);
        textButton.setBackground(null);
        textButton.setPreferredSize(VERSION_SIZE);
        textButton.setMinimumSize(VERSION_SIZE);
        textButton.setBorder(new MatteBorder(1, 0, 0, 0, DARK_GREY));
        return textButton;
    }

    private static JTextField createPanelTextField() {
        JTextField textField = new JTextField();
        textField.setFont(FontManager.getDefaultFont());
        textField.setForeground(ColorScheme.DARKER_GRAY_COLOR);
        textField.setBackground(ColorScheme.GRAND_EXCHANGE_ALCH);
        textField.setCaretColor(ColorScheme.DARKER_GRAY_COLOR);
        textField.setPreferredSize(VERSION_SIZE);
        textField.setMinimumSize(VERSION_SIZE);
        textField.setBorder(new CompoundBorder(new MatteBorder(1, 0, 0, 0, DARK_GREY), new EmptyBorder(0, 15, 0, 15)));
        String file = Squire.readKeyFile();
        if (file != null) {
            textField.setText(file);
        }
        return textField;
    }
}

