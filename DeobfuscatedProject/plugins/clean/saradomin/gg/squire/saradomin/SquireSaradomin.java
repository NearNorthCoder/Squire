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
        SquireSaradomin.lIlIlIllIlllIlI();
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

        this.b.register((Object)this.a);
        this.b.register((Object)this.e);
        this.f = lIIlIlIIlIlII[2];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIlIlIIlIlII[1]];
        classArray[SquireSaradomin.lIIlIlIIlIlII[2]] = ReturningBackToStartingTileTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[0]] = EnablingRunTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[3]] = EquippingBowfaTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[4]] = DrinkingRangePotionTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[5]] = MovingToNextTileTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[6]] = AttackingZilyanaTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[7]] = FlickingPrayersTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[8]] = KillingMinionsTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[9]] = EatingFoodTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[10]] = DrinkingStaminaDoseTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[11]] = GettingKillcountTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[12]] = HandlingKcPrayersTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[13]] = CastingB2pTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[14]] = ConsumingPeachesTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[15]] = HighAlchingTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[16]] = LootingItemsTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[17]] = TeleportingOutTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[18]] = RecoveringFromGettingStuckOnATileTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[19]] = WithdrawingItemsTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[20]] = WalkingToGodwarsTask.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[21]] = EnteringRoomTask.class;
        return classArray;
    }

    public SquireSaradomin() {
        this.f = lIIlIlIIlIlII[0];
    }

    public boolean a() {
        return this.f;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);

        this.b.unregister((Object)this.a);
        this.b.unregister((Object)this.c);
    }
}

