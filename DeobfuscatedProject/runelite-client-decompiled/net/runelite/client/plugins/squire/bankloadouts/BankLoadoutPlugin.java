/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package net.runelite.client.plugins.squire.bankloadouts;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.bankloadouts.ui.BankLoadoutPanel;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Bank Loadouts", enabledByDefault=true)
public class BankLoadoutPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(BankLoadoutPlugin.class);
    @Inject
    private ClientToolbar clientToolbar;
    private NavigationButton navButton;
    private BankLoadoutPanel panel;

    @Override
    protected void startUp() throws Exception {
        this.panel = (BankLoadoutPanel)this.injector.getInstance(BankLoadoutPanel.class);
        BufferedImage icon = ImageUtil.loadImageResource(this.getClass(), "bank.png");
        this.navButton = NavigationButton.builder().tooltip("Bank Loadouts").icon(icon).priority(5).panel(this.panel).build();
        this.clientToolbar.addNavigation(this.navButton);
    }

    @Override
    protected void shutDown() throws Exception {
        this.clientToolbar.removeNavigation(this.navButton);
    }
}

