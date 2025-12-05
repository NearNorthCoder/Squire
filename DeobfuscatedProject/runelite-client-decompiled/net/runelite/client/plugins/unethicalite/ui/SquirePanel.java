/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.events.GameTick
 */
package net.runelite.client.plugins.unethicalite.ui;

import com.google.inject.Inject;
import gg.squire.client.Squire;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ScrollBarUI;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.recorder.MouseRecording;
import net.runelite.client.plugins.unethicalite.SquirePlugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.laf.RuneLiteScrollBarUI;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import org.jetbrains.annotations.NotNull;

public class SquirePanel
extends PluginPanel {
    private final EventBus evtBus;
    private final SquirePlugin plugin;
    private final JLabel region = new JLabel("Log in to load region");
    private final DefaultListModel<MouseRecording> recordingListModel = new DefaultListModel();
    private final JList<MouseRecording> recordingList = new JList<MouseRecording>(this.recordingListModel);
    private final JScrollPane recordingListScrollPane = new JScrollPane(this.recordingList, 20, 31);
    private final JButton record = new JButton("Record");
    private final JButton reload = new JButton("Reload");
    private final JLabel description = new JLabel("Mouse Recorder");
    private final JLabel explanation = new JLabel("<html>Recordings are bound to the region(s) in which they were recorded.<br/>View the discord mouse-recorder channel for more information on how they work</html>");
    private final JButton logs = new JButton("View Logs");
    private int[] lastRegions = new int[0];

    @Inject
    public SquirePanel(@NotNull EventBus evtBus, SquirePlugin plugin, BufferedImage icon) {
        this.evtBus = evtBus;
        this.plugin = plugin;
        this.evtBus.register(this);
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        this.setBackground(ColorScheme.DARK_GRAY_COLOR);
        ImageIcon imi = new ImageIcon(icon.getScaledInstance(32, 32, 4));
        JLabel title = new JLabel("Squire", imi, 4);
        title.setBorder(new CompoundBorder(new MatteBorder(0, 0, 5, 0, ColorScheme.BRAND_ORANGE), new EmptyBorder(0, 0, 8, 1)));
        title.setHorizontalAlignment(0);
        title.setFont(FontManager.getDefaultBoldFont());
        title.setForeground(ColorScheme.BRAND_BLUE);
        this.add((Component)title, "North");
        this.add((Component)this.quickActions(), "Center");
        this.add((Component)this.recorder(), "South");
    }

    private JPanel recorder() {
        JPanel recorderPanel = new JPanel(new GridBagLayout());
        TitledBorder recorderBorder = BorderFactory.createTitledBorder("<html><span>&nbsp;Mouse Recorder&nbsp;</span></html>");
        recorderBorder.setTitleFont(FontManager.getRunescapeBoldFont());
        recorderBorder.setTitleColor(Color.WHITE);
        recorderBorder.setBorder(new CompoundBorder(BorderFactory.createEtchedBorder(1, ColorScheme.DARKER_GRAY_COLOR, ColorScheme.DARKER_GRAY_COLOR), new EmptyBorder(5, 5, 5, 5)));
        recorderPanel.setBorder(recorderBorder);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = 2;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 0;
        c.insets = new Insets(10, 2, 10, 2);
        this.explanation.setText("<html>Recordings are bound to the region(s) in which they were recorded.<br/>View the discord mouse-recorder channel for more information on how they work</html>");
        this.explanation.setFont(FontManager.getRunescapeFont());
        this.explanation.setForeground(Color.GRAY);
        recorderPanel.add((Component)this.explanation, c);
        ++c.gridy;
        this.region.setFont(FontManager.getRunescapeSmallFont());
        this.region.setForeground(Color.WHITE);
        recorderPanel.add((Component)this.region, c);
        ++c.gridy;
        c.weighty = 2.0;
        c.weightx = 1.0;
        c.fill = 1;
        this.recordingListScrollPane.getVerticalScrollBar().setUI((ScrollBarUI)((Object)new RuneLiteScrollBarUI()));
        JViewport viewport = this.recordingListScrollPane.getViewport();
        viewport.setForeground(Color.WHITE);
        viewport.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        viewport.setOpaque(true);
        recorderPanel.add((Component)this.recordingListScrollPane, c);
        ++c.gridy;
        c.fill = 0;
        c.weighty = 0.0;
        c.gridheight = 1;
        c.gridwidth = 1;
        JButton delete = new JButton("Delete");
        delete.setFont(FontManager.getRunescapeFont());
        delete.addActionListener(this::onDeleteClicked);
        recorderPanel.add((Component)delete, c);
        ++c.gridx;
        this.record.setFont(FontManager.getRunescapeFont());
        this.record.addActionListener(this::onRecordClicked);
        recorderPanel.add((Component)this.record, c);
        ++c.gridx;
        ++c.gridy;
        return recorderPanel;
    }

    private JPanel quickActions() {
        JPanel quickActions = new JPanel();
        quickActions.setPreferredSize(new Dimension(230, 125));
        TitledBorder actions = BorderFactory.createTitledBorder("<html><span>&nbsp;Actions&nbsp;</span></html>");
        actions.setTitleFont(FontManager.getRunescapeBoldFont());
        actions.setTitleColor(Color.WHITE);
        CompoundBorder actionsBorder = new CompoundBorder(BorderFactory.createEtchedBorder(1, ColorScheme.DARKER_GRAY_COLOR, ColorScheme.DARKER_GRAY_COLOR), new EmptyBorder(5, 5, 5, 5));
        actions.setBorder(new CompoundBorder(BorderFactory.createEmptyBorder(10, 0, 25, 0), actionsBorder));
        quickActions.setBorder(actions);
        quickActions.setBackground(ColorScheme.DARK_GRAY_COLOR);
        this.reload.setFont(FontManager.getRunescapeFont());
        quickActions.add((Component)this.reload, "North");
        this.reload.addActionListener(a -> this.plugin.reloadPlugins());
        this.logs.setFont(FontManager.getRunescapeFont());
        quickActions.add((Component)this.logs, "South");
        this.logs.addActionListener(a -> {
            try {
                Desktop.getDesktop().open(Squire.SQUIRE_HOME.toPath().resolve("logs").toFile());
            }
            catch (IOException iOException) {
                // empty catch block
            }
        });
        return quickActions;
    }

    private void onDeleteClicked(ActionEvent actionEvent) {
        int selected = this.recordingList.getSelectedIndex();
        if (selected == -1) {
            return;
        }
        MouseRecording mrName = this.recordingListModel.get(selected);
        this.recordingList.clearSelection();
        MouseRecording.delete(mrName.getName());
        this.updateRegionText(true);
    }

    private void onRecordClicked(ActionEvent actionEvent) {
        if (this.plugin.isRecording()) {
            this.plugin.stopRecording();
            this.record.setText("Record");
            this.updateRegionText(true);
        } else {
            this.plugin.startNewRecording();
            this.record.setText("Stop recording");
        }
    }

    public void shutdown() {
        this.evtBus.unregister(this);
    }

    public void updateRegionText(boolean force) {
        Player local = Players.getLocal();
        if (local.getWorldLocation() == null) {
            this.region.setText("Log in to load region");
            this.record.setEnabled(false);
        }
        String regions = Arrays.toString(Static.getClient().getMapRegions());
        this.region.setText("<html>Regions: " + regions + "</html>");
        this.recordingListModel.clear();
        this.recordingListModel.addAll(MouseRecording.allInRegion());
        this.record.setEnabled(true);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        boolean update;
        int[] next = Static.getClient().getMapRegions();
        boolean bl = update = this.lastRegions.length != next.length;
        if (!update) {
            for (int i = 0; i < next.length; ++i) {
                if (this.lastRegions[i] == next[i]) continue;
                update = true;
                break;
            }
        }
        if (!update) {
            return;
        }
        this.lastRegions = next;
        this.updateRegionText(false);
    }
}

