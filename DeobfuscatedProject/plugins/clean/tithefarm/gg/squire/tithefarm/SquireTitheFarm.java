/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.InventoryChanged
 */
package gg.squire.tithefarm;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.tithefarm.SquireTitheConfig;
import gg.squire.tithefarm.overlay.TitheInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import gg.squire.tithefarm.IHelper;
import gg.squire.tithefarm.TithefarmManager;
import gg.squire.tithefarm.BuyingRewardsTask;
import gg.squire.tithefarm.ClearingBlightedPlantsTask;
import gg.squire.tithefarm.DepositingFruitTask;
import gg.squire.tithefarm.DrinkingEnergyBoostTask;
import gg.squire.tithefarm.GettingNewSeedsTask;
import gg.squire.tithefarm.HarvestingPlantTask;
import gg.squire.tithefarm.LeavingTitheInstanceTask;
import gg.squire.tithefarm.PlantingSeedTask;
import gg.squire.tithefarm.RefillingWateringCansTask;
import gg.squire.tithefarm.WalkingTowardsTheNextPatchTask;
import gg.squire.tithefarm.WateringPlantTask;

@PluginDescriptor(name="Squire Tithe Farm", description="Automatically harvests and collects from Tithe Farm", enabledByDefault=false)
public class SquireTitheFarm
extends SquirePlugin {
    @Inject
    private  EventBus e;
    private  int g;
    public  int a;
    @Inject
    private  i d;
    @Inject
    private  j f;
    
    @Inject
    private  OverlayManager b;
    @Inject
    private  TitheInfoBox c;

    protected void onStart() {
        this.e.register((Object)this.d);
        this.e.register((Object)this.f);
        this.b.add((Overlay)this.c);

        this.b.add((Overlay)this.f);

        this.a = lIIllllllIllI[2];
        this.g = lIIllllllIllI[0];
        this.d.s();
    }

    public int a() {
        return this.a;
    }

    public SquireTitheFarm() {
        this.g = lIIllllllIllI[0];
    }

    static {
        SquireTitheFarm.lIllIllIIIlIIll();
    }

    protected void onStop() {
        this.e.unregister((Object)this.d);
        this.e.unregister((Object)this.f);
        this.b.remove((Overlay)this.c);

        this.b.remove((Overlay)this.f);

    }

    private static boolean lIllIllIIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    public int b() {
        return this.g;
    }

    @Provides
    SquireTitheConfig a(ConfigManager configManager) {
        return (SquireTitheConfig)configManager.getConfig(SquireTitheConfig.class);
    }

    private static boolean lIllIllIIIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllllllIllI[1]];
        classArray[SquireTitheFarm.lIIllllllIllI[2]] = PlantingSeedTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[3]] = WateringPlantTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[4]] = HarvestingPlantTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[5]] = WalkingTowardsTheNextPatchTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[6]] = RefillingWateringCansTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[7]] = DepositingFruitTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[8]] = GettingNewSeedsTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[9]] = DrinkingEnergyBoostTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[10]] = ClearingBlightedPlantsTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[11]] = BuyingRewardsTask.class;
        classArray[SquireTitheFarm.lIIllllllIllI[12]] = LeavingTitheInstanceTask.class;
        return classArray;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public void b(int n2) {
        this.g = n2;
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (!SquireTitheFarm.lIllIllIIIlIlII(inventoryChanged.getItemId(), lIIllllllIllI[13]) || !SquireTitheFarm.lIllIllIIIlIlII(inventoryChanged.getItemId(), lIIllllllIllI[14]) || SquireTitheFarm.lIllIllIIIlIlIl(inventoryChanged.getItemId(), lIIllllllIllI[15])) {
            var1.a += lIIllllllIllI[3];
        }
    }
}

