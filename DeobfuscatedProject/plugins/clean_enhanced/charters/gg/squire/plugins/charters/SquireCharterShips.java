/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.plugins.charters;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.charters.SquireCharterConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.plugins.charters.CharterShipingTask;

@PluginDescriptor(name="Squire Charter Ships", enabledByDefault=false, description="Does crafting methods")
public class SquireCharterShips
extends SquirePlugin {
    @Inject
    private  OverlayManager a;

    @Provides
    SquireCharterConfig a(ConfigManager configManager) {
        return (SquireCharterConfig)configManager.getConfig(SquireCharterConfig.class);
    }

    static {
        SquireCharterShips.var2();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = CharterShipingTask.class;
        return classArray;
    }

    protected void onStart() {
    }

    protected void onStop() {
    }
}

