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
package gg.squire.saradomin;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.overlay.SaraInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.saradomin.CastingB2pTask;
import gg.squire.saradomin.ConsumingPeachesTask;
import gg.squire.saradomin.HighAlchingTask;
import gg.squire.saradomin.LootingItemsTask;
import gg.squire.saradomin.KillingMinionsTask;
import gg.squire.saradomin.ReturningBackToStartingTileTask;
import gg.squire.saradomin.DrinkingRangePotionTask;
import gg.squire.saradomin.EquippingBowfaTask;
import gg.squire.saradomin.SaradominManager;
import gg.squire.saradomin.SaradominManager;
import gg.squire.saradomin.EnablingRunTask;
import gg.squire.saradomin.TeleportingOutTask;
import gg.squire.saradomin.WalkingToGodwarsTask;
import gg.squire.saradomin.WithdrawingItemsTask;
import gg.squire.saradomin.DrinkingStaminaDoseTask;
import gg.squire.saradomin.EatingFoodTask;
import gg.squire.saradomin.AttackingZilyanaTask;
import gg.squire.saradomin.FlickingPrayersTask;
import gg.squire.saradomin.RecoveringFromGettingStuckOnATileTask;
import gg.squire.saradomin.MovingToNextTileTask;
import gg.squire.saradomin.EnteringRoomTask;
import gg.squire.saradomin.GettingKillcountTask;
import gg.squire.saradomin.HandlingKcPrayersTask;

@PluginDescriptor(name="Squire Saradomin", enabledByDefault=false)
public class SquireSaradomin
extends SquirePlugin {
    @Inject
    private  f e;
    @Inject
    private  g a;
    private  boolean f;
    @Inject
    private  SaraInfoBox d;
    
    @Inject
    private  EventBus b;
    @Inject
    private  OverlayManager c;

    static {
        SquireSaradomin.var2();
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    @Provides
    SquireSaraConfig a(ConfigManager configManager) {
        return (SquireSaraConfig)configManager.getConfig(SquireSaraConfig.class);
    }

    protected void onStart() {
        this.c.add((Overlay)this.d);
        0;
        this.b.register((Object)this.a);
        this.b.register((Object)this.e);
        this.f = var1[2];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[1]];
        classArray[SquireSaradomin.var1[2]] = ReturningBackToStartingTileTask.class;
        classArray[SquireSaradomin.var1[0]] = EnablingRunTask.class;
        classArray[SquireSaradomin.var1[3]] = EquippingBowfaTask.class;
        classArray[SquireSaradomin.var1[4]] = DrinkingRangePotionTask.class;
        classArray[SquireSaradomin.var1[5]] = MovingToNextTileTask.class;
        classArray[SquireSaradomin.var1[6]] = AttackingZilyanaTask.class;
        classArray[SquireSaradomin.var1[7]] = FlickingPrayersTask.class;
        classArray[SquireSaradomin.var1[8]] = KillingMinionsTask.class;
        classArray[SquireSaradomin.var1[9]] = EatingFoodTask.class;
        classArray[SquireSaradomin.var1[10]] = DrinkingStaminaDoseTask.class;
        classArray[SquireSaradomin.var1[11]] = GettingKillcountTask.class;
        classArray[SquireSaradomin.var1[12]] = HandlingKcPrayersTask.class;
        classArray[SquireSaradomin.var1[13]] = CastingB2pTask.class;
        classArray[SquireSaradomin.var1[14]] = ConsumingPeachesTask.class;
        classArray[SquireSaradomin.var1[15]] = HighAlchingTask.class;
        classArray[SquireSaradomin.var1[16]] = LootingItemsTask.class;
        classArray[SquireSaradomin.var1[17]] = TeleportingOutTask.class;
        classArray[SquireSaradomin.var1[18]] = RecoveringFromGettingStuckOnATileTask.class;
        classArray[SquireSaradomin.var1[19]] = WithdrawingItemsTask.class;
        classArray[SquireSaradomin.var1[20]] = WalkingToGodwarsTask.class;
        classArray[SquireSaradomin.var1[21]] = EnteringRoomTask.class;
        return classArray;
    }

    public SquireSaradomin() {
        this.f = var1[0];
    }

    public boolean a() {
        return this.f;
    }

    private static void var2() {
        var1 = new int[22];
        SquireSaradomin.var1[0] = 1;
        SquireSaradomin.var1[1] = 0xA8 ^ 0xBD;
        SquireSaradomin.var1[2] = (0x89 ^ 0x80) & ~(0xB1 ^ 0xB8);
        SquireSaradomin.var1[3] = 2;
        SquireSaradomin.var1[4] = 3;
        SquireSaradomin.var1[5] = 123 + 130 - 93 + 0 ^ 140 + 145 - 269 + 148;
        SquireSaradomin.var1[6] = 9 ^ 0xC;
        SquireSaradomin.var1[7] = 0x30 ^ 0x36;
        SquireSaradomin.var1[8] = 0x9B ^ 0x9C;
        SquireSaradomin.var1[9] = 41 + 197 - 235 + 203 ^ 181 + 0 - 38 + 55;
        SquireSaradomin.var1[10] = 0x1C ^ 0x15;
        SquireSaradomin.var1[11] = 0x79 ^ 0x5D ^ (0x8A ^ 0xA4);
        SquireSaradomin.var1[12] = 0x50 ^ 0x5B;
        SquireSaradomin.var1[13] = 0x50 ^ 0x5C;
        SquireSaradomin.var1[14] = 5 ^ 0x70 ^ (0x4D ^ 0x35);
        SquireSaradomin.var1[15] = 0x56 ^ 0x58;
        SquireSaradomin.var1[16] = 0xB0 ^ 0x83 ^ (0x56 ^ 0x6A);
        SquireSaradomin.var1[17] = 0x9F ^ 0x8F;
        SquireSaradomin.var1[18] = 0xBD ^ 0xAC;
        SquireSaradomin.var1[19] = 141 + 85 - 205 + 124 ^ 98 + 19 - 65 + 79;
        SquireSaradomin.var1[20] = 131 + 22 - 66 + 56 ^ 64 + 150 - 176 + 118;
        SquireSaradomin.var1[21] = 95 + 180 - 93 + 33 ^ 131 + 6 - -57 + 1;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);
        0;
        this.b.unregister((Object)this.a);
        this.b.unregister((Object)this.c);
    }
}

