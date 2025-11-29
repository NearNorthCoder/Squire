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
import gg.squire.tithefarm.TithefarmManager;
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
        0;
        this.b.add((Overlay)this.f);
        0;
        this.a = var1[2];
        this.g = var1[0];
        this.d.s();
    }

    public int a() {
        return this.a;
    }

    private static void var2() {
        var1 = new int[16];
        SquireTitheFarm.var1[0] = -(0xFFFFFAA9 & 0x4D57) & (0xFFFFCFED & 0x7BFA);
        SquireTitheFarm.var1[1] = 0xD0 ^ 0xBA ^ (0x6A ^ 0xB);
        SquireTitheFarm.var1[2] = (0x83 ^ 0x99 ^ (0x8E ^ 0xAA)) & (130 + 18 - 92 + 80 ^ 118 + 24 - 124 + 164 ^ -1);
        SquireTitheFarm.var1[3] = 1;
        SquireTitheFarm.var1[4] = 2;
        SquireTitheFarm.var1[5] = 3;
        SquireTitheFarm.var1[6] = 42 + 29 - -30 + 29 ^ 16 + 51 - 44 + 111;
        SquireTitheFarm.var1[7] = 0x3D ^ 0x14 ^ (0x7E ^ 0x52);
        SquireTitheFarm.var1[8] = 86 + 13 - 80 + 133 ^ 96 + 92 - 107 + 77;
        SquireTitheFarm.var1[9] = 0xB6 ^ 0xB1;
        SquireTitheFarm.var1[10] = 0x25 ^ 0x2D;
        SquireTitheFarm.var1[11] = 0xB ^ 2;
        SquireTitheFarm.var1[12] = 0x67 ^ 0x6D;
        SquireTitheFarm.var1[13] = 0xFFFFBFF6 & 0x747B;
        SquireTitheFarm.var1[14] = 0xFFFFB7F3 & 0x7C7F;
        SquireTitheFarm.var1[15] = -(0xFFFFC94B & 0x7EBE) & (0xFFFFFC7F & 0x7FFD);
    }

    public SquireTitheFarm() {
        this.g = var1[0];
    }

    static {
        SquireTitheFarm.var2();
    }

    protected void onStop() {
        this.e.unregister((Object)this.d);
        this.e.unregister((Object)this.f);
        this.b.remove((Overlay)this.c);
        0;
        this.b.remove((Overlay)this.f);
        0;
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    public int b() {
        return this.g;
    }

    @Provides
    SquireTitheConfig a(ConfigManager configManager) {
        return (SquireTitheConfig)configManager.getConfig(SquireTitheConfig.class);
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[1]];
        classArray[SquireTitheFarm.var1[2]] = PlantingSeedTask.class;
        classArray[SquireTitheFarm.var1[3]] = WateringPlantTask.class;
        classArray[SquireTitheFarm.var1[4]] = HarvestingPlantTask.class;
        classArray[SquireTitheFarm.var1[5]] = WalkingTowardsTheNextPatchTask.class;
        classArray[SquireTitheFarm.var1[6]] = RefillingWateringCansTask.class;
        classArray[SquireTitheFarm.var1[7]] = DepositingFruitTask.class;
        classArray[SquireTitheFarm.var1[8]] = GettingNewSeedsTask.class;
        classArray[SquireTitheFarm.var1[9]] = DrinkingEnergyBoostTask.class;
        classArray[SquireTitheFarm.var1[10]] = ClearingBlightedPlantsTask.class;
        classArray[SquireTitheFarm.var1[11]] = BuyingRewardsTask.class;
        classArray[SquireTitheFarm.var1[12]] = LeavingTitheInstanceTask.class;
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
        if (!SquireTitheFarm.var3(inventoryChanged.getItemId(), var1[13]) || !SquireTitheFarm.var3(inventoryChanged.getItemId(), var1[14]) || SquireTitheFarm.var4(inventoryChanged.getItemId(), var1[15])) {
            var5.a += var1[3];
        }
    }
}

