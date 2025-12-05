/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 */
package net.runelite.client.plugins.openosrs;

import java.awt.image.BufferedImage;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.JOptionPane;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.openosrs.OS;
import net.runelite.client.plugins.openosrs.externals.ExternalPluginManagerPanel;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(loadWhenOutdated=true, hidden=true, name="OpenOSRS")
@Singleton
public class OpenOSRSPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(OpenOSRSPlugin.class);
    @Inject
    private ConfigManager configManager;
    @Nullable
    @Inject
    private Client client;
    @Inject
    private ClientToolbar clientToolbar;
    private NavigationButton navButton;

    @Override
    protected void startUp() {
        if (this.client == null) {
            return;
        }
        ExternalPluginManagerPanel panel = (ExternalPluginManagerPanel)this.injector.getInstance(ExternalPluginManagerPanel.class);
        BufferedImage icon = ImageUtil.loadImageResource(this.getClass(), "externalmanager_icon.png");
        this.navButton = NavigationButton.builder().tooltip("External Plugin Manager").icon(icon).priority(1).panel(panel).build();
        this.clientToolbar.addNavigation(this.navButton);
    }

    @Override
    protected void shutDown() {
        if (this.navButton != null) {
            this.clientToolbar.removeNavigation(this.navButton);
        }
    }

    @Subscribe
    protected void onConfigChanged(ConfigChanged event) {
        boolean disableHw;
        if (OS.getOs() == OS.OSType.MacOS && event.getGroup().equals("openosrs") && event.getKey().equals("disableHw") && (disableHw = ((Boolean)this.configManager.getConfiguration("openosrs", "disableHw", (Type)((Object)Boolean.class))).booleanValue())) {
            JOptionPane.showMessageDialog(ClientUI.getFrame(), "You can't disable hardware acceleration on MacOS", "Critical situation prevented", 0);
            this.configManager.setConfiguration("openosrs", "disableHw", false);
        }
    }
}

