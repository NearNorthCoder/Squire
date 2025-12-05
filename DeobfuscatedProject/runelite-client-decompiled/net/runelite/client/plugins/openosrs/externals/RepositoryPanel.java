/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package net.runelite.client.plugins.openosrs.externals;

import com.openosrs.client.events.OPRSRepositoryChanged;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.inject.Inject;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.OPRSExternalPluginManager;
import net.runelite.client.plugins.OPRSUpdateRepository;
import net.runelite.client.plugins.openosrs.externals.RepositoryBox;
import net.runelite.client.ui.ColorScheme;

public class RepositoryPanel
extends JPanel {
    @Inject
    public EventBus eventBus;
    private final OPRSExternalPluginManager externalPluginManager;
    private final GridBagConstraints c = new GridBagConstraints();

    RepositoryPanel(OPRSExternalPluginManager externalPluginManager, EventBus eventBus) {
        this.externalPluginManager = externalPluginManager;
        this.setLayout(new GridBagLayout());
        this.setBackground(ColorScheme.DARK_GRAY_COLOR);
        this.setBorder(new EmptyBorder(0, 10, 0, 10));
        this.onExternalRepositoryChanged(null);
        eventBus.register(this);
    }

    @Subscribe
    private void onExternalRepositoryChanged(OPRSRepositoryChanged event) {
        this.removeAll();
        this.c.fill = 2;
        this.c.weightx = 1.0;
        this.c.gridy = 0;
        this.c.insets = new Insets(5, 0, 0, 0);
        for (OPRSUpdateRepository repository : this.externalPluginManager.getRepositories()) {
            RepositoryBox p = new RepositoryBox(this.externalPluginManager, repository);
            this.add((Component)p, this.c);
            ++this.c.gridy;
        }
    }
}

