/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.aerialfisher;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.aerialfisher.SquireAerialFisherConfig;
import gg.squire.aerialfisher.overlay.AerialFisherInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.aerialfisher.AerialfisherManager;
import gg.squire.aerialfisher.FishingTask;
import gg.squire.aerialfisher.GatheringBaitTask;
import gg.squire.aerialfisher.GettingBirdTask;
import gg.squire.aerialfisher.HoppingToAvoidNearbyPlayerTask;
import gg.squire.aerialfisher.WalkingToSpotTask;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(name="Squire Aerial Fisher", enabledByDefault=false)
public class SquireAerialFisher
extends SquirePlugin {
    
    @Inject
    private  EventBus c;
    @Inject
    private  AerialFisherInfoBox d;
    @Inject
    private  OverlayManager b;
    @Inject
    private  a a;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireAerialFisher.var1[1]] = HoppingToAvoidNearbyPlayerTask.class;
        classArray[SquireAerialFisher.var1[2]] = GatheringBaitTask.class;
        classArray[SquireAerialFisher.var1[3]] = GettingBirdTask.class;
        classArray[SquireAerialFisher.var1[4]] = WalkingToSpotTask.class;
        classArray[SquireAerialFisher.var1[5]] = FishingTask.class;
        return classArray;
    }

    @Provides
    SquireAerialFisherConfig a(ConfigManager configManager) {
        return (SquireAerialFisherConfig)configManager.getConfig(SquireAerialFisherConfig.class);
    }

    static {
        SquireAerialFisher.var2();
    }

    protected void onStop() {
        this.c.unregister((Object)this.a);
        this.b.remove((Overlay)this.d);
        0;
    }

    private static void var2() {
        var1 = new int[6];
        SquireAerialFisher.var1[0] = 0x86 ^ 0x83;
        SquireAerialFisher.var1[1] = (57 + 42 - -11 + 35 ^ 158 + 13 - 22 + 46) & (0x55 ^ 0xD ^ (0x5A ^ 0x50) ^ -1);
        SquireAerialFisher.var1[2] = 1;
        SquireAerialFisher.var1[3] = 2;
        SquireAerialFisher.var1[4] = 3;
        SquireAerialFisher.var1[5] = 125 + 81 - 97 + 54 ^ 62 + 73 - 128 + 160;
    }

    protected void onStart() {
        this.a.a();
        this.c.register((Object)this.a);
        this.b.add((Overlay)this.d);
        0;
    }
}

