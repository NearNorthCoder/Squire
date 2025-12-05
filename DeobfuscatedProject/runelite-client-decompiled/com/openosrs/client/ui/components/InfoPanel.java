/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.ui.components;

import com.openosrs.client.OpenOSRS;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.LinkBrowser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfoPanel
extends JPanel {
    private static final Logger log = LoggerFactory.getLogger(InfoPanel.class);
    static final Dimension PANEL_SIZE = new Dimension(200, OpenOSRSSplashScreen.FRAME_SIZE.height);
    private static final Color DARK_GREY = new Color(10, 10, 10, 255);
    private static final BufferedImage TRANSPARENT_LOGO = ImageUtil.getResourceStreamFromClass(InfoPanel.class, "/openosrs.png");
    private static final Dimension VERSION_SIZE = new Dimension(InfoPanel.PANEL_SIZE.width, 25);
    private static final File RUNELITE_DIR = new File(System.getProperty("user.home"), ".openosrs");
    private static final File LOGS_DIR = new File(RUNELITE_DIR, "logs");

    public InfoPanel() {
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
            transparentLogo.setImage(TRANSPARENT_LOGO.getScaledInstance(128, 128, 4));
        }
        JLabel logo = new JLabel(transparentLogo);
        c.anchor = 11;
        c.weighty = 1.0;
        this.add((Component)logo, c);
        ++c.gridy;
        c.anchor = 15;
        c.weighty = 0.0;
        this.add((Component)InfoPanel.createPanelTextButton("Squire Version: " + OpenOSRS.SYSTEM_VERSION), c);
        ++c.gridy;
        JLabel logsFolder = InfoPanel.createPanelButton("Open logs folder", null, () -> LinkBrowser.openLocalFile(LOGS_DIR));
        this.add((Component)logsFolder, c);
        ++c.gridy;
        JLabel discord = InfoPanel.createPanelButton("Join the Discord", "Instant invite link to join the openosrs discord", () -> LinkBrowser.browse(RuneLiteProperties.getDiscordInvite()));
        this.add((Component)discord, c);
        ++c.gridy;
        JLabel troubleshooting = InfoPanel.createPanelButton("Troubleshooting steps", "Opens a link to the troubleshooting wiki", () -> LinkBrowser.browse(RuneLiteProperties.getTroubleshootingLink()));
        this.add((Component)troubleshooting, c);
        ++c.gridy;
        JLabel exit = InfoPanel.createPanelButton("Exit", "Closes the application immediately", () -> System.exit(0));
        this.add((Component)exit, c);
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

    private static JLabel createPanelButton(String name, String tooltip, final Runnable runnable) {
        final JLabel btn = new JLabel(name, 0);
        btn.setToolTipText(tooltip);
        btn.setOpaque(true);
        btn.setBackground(null);
        btn.setForeground(Color.WHITE);
        btn.setFont(FontManager.getRunescapeFont());
        btn.setBorder(new CompoundBorder(new MatteBorder(1, 0, 0, 0, DARK_GREY), new EmptyBorder(3, 0, 3, 0)));
        btn.setCursor(Cursor.getPredefinedCursor(12));
        btn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                runnable.run();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(60, 60, 60));
                btn.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(null);
                btn.repaint();
            }
        });
        return btn;
    }
}

