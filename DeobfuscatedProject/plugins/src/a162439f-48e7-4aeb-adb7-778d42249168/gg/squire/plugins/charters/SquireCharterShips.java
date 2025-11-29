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
import u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c;

@PluginDescriptor(name="Squire Charter Ships", enabledByDefault=false, description="Does crafting methods")
public class SquireCharterShips
extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager a;
    private static /* synthetic */ int[] lIlIlllIIIII;

    @Provides
    SquireCharterConfig a(ConfigManager configManager) {
        return (SquireCharterConfig)configManager.getConfig(SquireCharterConfig.class);
    }

    static {
        SquireCharterShips.lllIIIIlIIlllI();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlllIIIII[0]];
        classArray[SquireCharterShips.lIlIlllIIIII[1]] = c.class;
        return classArray;
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    private static void lllIIIIlIIlllI() {
        lIlIlllIIIII = new int[2];
        SquireCharterShips.lIlIlllIIIII[0] = " ".length();
        SquireCharterShips.lIlIlllIIIII[1] = (0x85 ^ 0x90) & ~(0x13 ^ 6);
    }
}

