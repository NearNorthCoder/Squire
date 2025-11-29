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
import gg.squire.aerialfisher.AHelper;
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
        Class[] classArray = new Class[lIlIllIllII[0]];
        classArray[SquireAerialFisher.lIlIllIllII[1]] = HoppingToAvoidNearbyPlayerTask.class;
        classArray[SquireAerialFisher.lIlIllIllII[2]] = GatheringBaitTask.class;
        classArray[SquireAerialFisher.lIlIllIllII[3]] = GettingBirdTask.class;
        classArray[SquireAerialFisher.lIlIllIllII[4]] = WalkingToSpotTask.class;
        classArray[SquireAerialFisher.lIlIllIllII[5]] = FishingTask.class;
        return classArray;
    }

    @Provides
    SquireAerialFisherConfig a(ConfigManager configManager) {
        return (SquireAerialFisherConfig)configManager.getConfig(SquireAerialFisherConfig.class);
    }

    static {
        SquireAerialFisher.lIIlIIlllIlIIl();
    }

    protected void onStop() {
        this.c.unregister((Object)this.a);
        this.b.remove((Overlay)this.d);

    }

    protected void onStart() {
        this.a.a();
        this.c.register((Object)this.a);
        this.b.add((Overlay)this.d);

    }
}

