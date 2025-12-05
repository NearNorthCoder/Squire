/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.ui.components;

import com.openosrs.client.ui.OpenOSRSSplashScreen;
import com.openosrs.client.ui.components.InfoPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicProgressBarUI;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.laf.RuneLiteScrollBarUI;

public class MessagePanel
extends JPanel {
    private static final Dimension PANEL_SIZE = new Dimension(OpenOSRSSplashScreen.FRAME_SIZE.width - InfoPanel.PANEL_SIZE.width, OpenOSRSSplashScreen.FRAME_SIZE.height);
    private static final Dimension BAR_SIZE = new Dimension(MessagePanel.PANEL_SIZE.width, 30);
    private static final int MESSAGE_AREA_PADDING = 15;
    private final JLabel titleLabel = new JLabel("Welcome to Squire!");
    private final JLabel messageArea;
    private final JLabel barLabel = new JLabel("Connecting with gameserver (try 1/10)");
    private final JProgressBar bar = new JProgressBar(0, 100);
    private final JScrollPane scrollPane;

    public MessagePanel() {
        this.setPreferredSize(PANEL_SIZE);
        this.setLayout(new GridBagLayout());
        this.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = 2;
        c.anchor = 11;
        c.weightx = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 25;
        this.titleLabel.setFont(new Font(FontManager.getRunescapeFont().getName(), FontManager.getRunescapeFont().getStyle(), 32));
        this.titleLabel.setHorizontalAlignment(0);
        this.titleLabel.setForeground(Color.WHITE);
        this.add((Component)this.titleLabel, c);
        ++c.gridy;
        this.messageArea = new JLabel("<html><div style='text-align:center;'><h1>Change Log</h1></br><table>\n  <tr>\n    <th>Date</th>\n    <th>Notes</th>\n  </tr>\n  <tr>\n    <td>2022-11-16</td>\n    <td>Update to latest RuneLite version.</td>\n  </tr>\n  <tr>\n    <td>2022-9-28</td>\n    <td>Added minimap zoom support.</td>\n  </tr>\n  <tr>\n    <td>2022-9-28</td>\n    <td>Latest game update has been confirmed not to have any effects on detection.</td>\n  </tr>\n  <tr>\n    <td>2022-9-23</td>\n    <td>Launcher is now the best way to run the client.</td>\n  </tr>\n</table></div></html>"){

            @Override
            public Dimension getPreferredSize() {
                Dimension results = super.getPreferredSize();
                results.width = MessagePanel.PANEL_SIZE.width - 15;
                return results;
            }
        };
        this.messageArea.setFont(new Font(FontManager.getRunescapeFont().getName(), FontManager.getRunescapeSmallFont().getStyle(), 16));
        this.messageArea.setForeground(Color.WHITE);
        this.messageArea.setBorder(new EmptyBorder(0, 15, 0, 15));
        this.scrollPane = new JScrollPane(this.messageArea, 20, 31);
        this.scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.scrollPane.getVerticalScrollBar().setUI((ScrollBarUI)((Object)new RuneLiteScrollBarUI()));
        JViewport viewport = this.scrollPane.getViewport();
        viewport.setForeground(Color.WHITE);
        viewport.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        viewport.setOpaque(true);
        c.weighty = 1.0;
        c.fill = 1;
        this.add((Component)this.scrollPane, c);
        ++c.gridy;
        c.weighty = 0.0;
        c.weightx = 1.0;
        c.ipady = 5;
        this.barLabel.setFont(FontManager.getRunescapeFont());
        this.barLabel.setHorizontalAlignment(0);
        this.barLabel.setForeground(Color.WHITE);
        this.barLabel.setBorder(new EmptyBorder(5, 0, 5, 0));
        this.add((Component)this.barLabel, c);
        ++c.gridy;
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
    }

    public void setMessageContent(String content) {
        if (!((String)content).startsWith("<html")) {
            content = "<html><div style='width: 100%; text-align:center;'>" + (String)content + "</div></html>";
        }
        this.messageArea.setText((String)content);
        this.messageArea.revalidate();
        this.messageArea.repaint();
    }

    public void setMessageTitle(String text) {
        this.titleLabel.setText(text);
        this.titleLabel.revalidate();
        this.titleLabel.repaint();
    }

    public JLabel getTitleLabel() {
        return this.titleLabel;
    }

    public JLabel getMessageArea() {
        return this.messageArea;
    }

    public JLabel getBarLabel() {
        return this.barLabel;
    }

    public JProgressBar getBar() {
        return this.bar;
    }
}

