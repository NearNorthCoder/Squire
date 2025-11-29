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
package gg.squire.bandos;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.bandos.overlay.BandosInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.bandos.GettingKillcountTask;
import gg.squire.bandos.BandosManager;
import gg.squire.bandos.BandosManager;
import gg.squire.bandos.TeleportingOutTask;
import gg.squire.bandos.AttackingBandosTask;
import gg.squire.bandos.DrinkingStaminaDoseTask;
import gg.squire.bandos.EatingFoodTask;
import gg.squire.bandos.FlickingPrayersTask;
import gg.squire.bandos.KillingMinionsTask;
import gg.squire.bandos.MovingToNextTileTask;
import gg.squire.bandos.CastingB2pTask;
import gg.squire.bandos.ConsumingPeachesTask;
import gg.squire.bandos.HighAlchingTask;
import gg.squire.bandos.LootingItemsTask;
import gg.squire.bandos.PlacingCannonBaseTask;
import gg.squire.bandos.DrinkingRangePotionTask;
import gg.squire.bandos.EquippingBowfaTask;
import gg.squire.bandos.MovingToStartingTileTask;

@PluginDescriptor(name="Squire Bandos", enabledByDefault=false)
public class SquireBandos
extends SquirePlugin {
    @Inject
    private  k e;
    
    @Inject
    private  EventBus c;
    @Inject
    private  OverlayManager a;
    @Inject
    private  BandosInfoBox b;
    @Inject
    private  e d;

    protected void onStop() {
        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
        this.a.remove((Overlay)this.b);
        0;
    }

    @Provides
    SquireBandosConfig a(ConfigManager configManager) {
        return (SquireBandosConfig)configManager.getConfig(SquireBandosConfig.class);
    }

    protected void onStart() {
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.a.add((Overlay)this.b);
        0;
    }

    private static void var2() {
        var1 = new int[17];
        SquireBandos.var1[0] = 0x4F ^ 0x5F;
        SquireBandos.var1[1] = (0xE8 ^ 0x91 ^ (0x13 ^ 0x23)) & (0xEE ^ 0xB1 ^ (0x56 ^ 0x40) ^ -1);
        SquireBandos.var1[2] = 1;
        SquireBandos.var1[3] = 2;
        SquireBandos.var1[4] = 3;
        SquireBandos.var1[5] = 86 + 73 - 129 + 118 ^ 23 + 91 - 113 + 143;
        SquireBandos.var1[6] = 0x24 ^ 0x23 ^ 2;
        SquireBandos.var1[7] = 79 + 19 - -49 + 0 ^ 133 + 74 - 130 + 72;
        SquireBandos.var1[8] = 0x79 ^ 0x7E;
        SquireBandos.var1[9] = 34 + 132 - 18 + 14 ^ 165 + 67 - 90 + 28;
        SquireBandos.var1[10] = 0x3E ^ 0x37;
        SquireBandos.var1[11] = 106 + 44 - 91 + 114 ^ 135 + 132 - 156 + 56;
        SquireBandos.var1[12] = 0x7E ^ 0x75;
        SquireBandos.var1[13] = 165 + 0 - 55 + 94 ^ 72 + 144 - 130 + 106;
        SquireBandos.var1[14] = 8 ^ 0x65 ^ (0xF9 ^ 0x99);
        SquireBandos.var1[15] = 0x1D ^ 0x4D ^ (0xE5 ^ 0xBB);
        SquireBandos.var1[16] = 158 + 114 - 184 + 89 ^ 60 + 140 - 53 + 43;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireBandos.var1[1]] = PlacingCannonBaseTask.class;
        classArray[SquireBandos.var1[2]] = AttackingBandosTask.class;
        classArray[SquireBandos.var1[3]] = MovingToNextTileTask.class;
        classArray[SquireBandos.var1[4]] = FlickingPrayersTask.class;
        classArray[SquireBandos.var1[5]] = DrinkingStaminaDoseTask.class;
        classArray[SquireBandos.var1[6]] = CastingB2pTask.class;
        classArray[SquireBandos.var1[7]] = ConsumingPeachesTask.class;
        classArray[SquireBandos.var1[8]] = LootingItemsTask.class;
        classArray[SquireBandos.var1[9]] = MovingToStartingTileTask.class;
        classArray[SquireBandos.var1[10]] = DrinkingRangePotionTask.class;
        classArray[SquireBandos.var1[11]] = TeleportingOutTask.class;
        classArray[SquireBandos.var1[12]] = HighAlchingTask.class;
        classArray[SquireBandos.var1[13]] = EatingFoodTask.class;
        classArray[SquireBandos.var1[14]] = KillingMinionsTask.class;
        classArray[SquireBandos.var1[15]] = GettingKillcountTask.class;
        classArray[SquireBandos.var1[16]] = EquippingBowfaTask.class;
        return classArray;
    }

    static {
        SquireBandos.var2();
    }
}

