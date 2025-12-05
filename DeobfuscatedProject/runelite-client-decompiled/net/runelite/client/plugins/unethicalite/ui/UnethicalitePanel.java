/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.miginfocom.swing.MigLayout
 *  net.runelite.api.Client
 */
package net.runelite.client.plugins.unethicalite.ui;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.unethicalite.ui.InteractionContainer;
import net.runelite.client.plugins.unethicalite.ui.PanelContainer;
import net.runelite.client.ui.PluginPanel;
import net.unethicalite.client.config.SquireConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnethicalitePanel
extends PluginPanel {
    private static final Logger log = LoggerFactory.getLogger(UnethicalitePanel.class);
    private final List<PanelContainer> containers = new ArrayList<PanelContainer>();
    private final JTabbedPane tabbedPane = new JTabbedPane();

    public UnethicalitePanel(Client client, SquireConfig config, ConfigManager configManager) {
        this.setLayout((LayoutManager)new MigLayout());
        InteractionContainer interactionContainer = new InteractionContainer(config, configManager);
        this.containers.add(interactionContainer);
        this.add(this.tabbedPane);
        this.tabbedPane.addTab(interactionContainer.getTitle(), interactionContainer);
    }

    @Subscribe
    private void onConfigChanged(ConfigChanged e) {
        if (!e.getGroup().equals("squire")) {
            return;
        }
        SwingUtilities.invokeLater(() -> this.containers.forEach(PanelContainer::rebuild));
    }
}

