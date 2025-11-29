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
import gg.squire.bandos.EHelper;
import gg.squire.bandos.KHelper;
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

    }

    @Provides
    SquireBandosConfig a(ConfigManager configManager) {
        return (SquireBandosConfig)configManager.getConfig(SquireBandosConfig.class);
    }

    protected void onStart() {
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.a.add((Overlay)this.b);

    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIlllllIlI[0]];
        classArray[SquireBandos.llIlllllIlI[1]] = PlacingCannonBaseTask.class;
        classArray[SquireBandos.llIlllllIlI[2]] = AttackingBandosTask.class;
        classArray[SquireBandos.llIlllllIlI[3]] = MovingToNextTileTask.class;
        classArray[SquireBandos.llIlllllIlI[4]] = FlickingPrayersTask.class;
        classArray[SquireBandos.llIlllllIlI[5]] = DrinkingStaminaDoseTask.class;
        classArray[SquireBandos.llIlllllIlI[6]] = CastingB2pTask.class;
        classArray[SquireBandos.llIlllllIlI[7]] = ConsumingPeachesTask.class;
        classArray[SquireBandos.llIlllllIlI[8]] = LootingItemsTask.class;
        classArray[SquireBandos.llIlllllIlI[9]] = MovingToStartingTileTask.class;
        classArray[SquireBandos.llIlllllIlI[10]] = DrinkingRangePotionTask.class;
        classArray[SquireBandos.llIlllllIlI[11]] = TeleportingOutTask.class;
        classArray[SquireBandos.llIlllllIlI[12]] = HighAlchingTask.class;
        classArray[SquireBandos.llIlllllIlI[13]] = EatingFoodTask.class;
        classArray[SquireBandos.llIlllllIlI[14]] = KillingMinionsTask.class;
        classArray[SquireBandos.llIlllllIlI[15]] = GettingKillcountTask.class;
        classArray[SquireBandos.llIlllllIlI[16]] = EquippingBowfaTask.class;
        return classArray;
    }

    static {
        SquireBandos.lIlIllIIIlIlII();
    }
}

