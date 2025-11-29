/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.giantsfoundry;

import gg.squire.giantsfoundry.KHelper;
import gg.squire.giantsfoundry.HandingInSwordTask;
import gg.squire.giantsfoundry.HammeringSwordTask;
import gg.squire.giantsfoundry.PolishingSwordTask;
import gg.squire.giantsfoundry.ResettingSwordTask;
import gg.squire.giantsfoundry.ControllingTemperatureTask;
import gg.squire.giantsfoundry.GrindingSwordTask;
import gg.squire.giantsfoundry.FillingCrucibleTask;
import gg.squire.giantsfoundry.BankingForBarsTask;
import gg.squire.giantsfoundry.GettingCommissionTask;
import gg.squire.giantsfoundry.MakingMouldTask;
import gg.squire.giantsfoundry.OpeningBankTask;
import gg.squire.giantsfoundry.PickingUpSwordTask;
import gg.squire.giantsfoundry.PouringCrucibleTask;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.overlay.GiantsOverlay;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(name="Squire Giants Foundry", enabledByDefault=false, tags={"giant", "foundry", "smithing"})
public class SquireGiantsFoundry
extends SquirePlugin {
    @Inject
    private  SquireGiantsConfig b;
    private  boolean f;
    
    @Inject
    private  k d;
    private  InventorySetup e;
    @Inject
    private  GiantsOverlay c;
    @Inject
    private  OverlayManager a;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[1]];
        classArray[SquireGiantsFoundry.var1[0]] = ControllingTemperatureTask.class;
        classArray[SquireGiantsFoundry.var1[2]] = HandingInSwordTask.class;
        classArray[SquireGiantsFoundry.var1[3]] = HammeringSwordTask.class;
        classArray[SquireGiantsFoundry.var1[4]] = PolishingSwordTask.class;
        classArray[SquireGiantsFoundry.var1[5]] = GrindingSwordTask.class;
        classArray[SquireGiantsFoundry.var1[6]] = GettingCommissionTask.class;
        classArray[SquireGiantsFoundry.var1[7]] = MakingMouldTask.class;
        classArray[SquireGiantsFoundry.var1[8]] = FillingCrucibleTask.class;
        classArray[SquireGiantsFoundry.var1[9]] = BankingForBarsTask.class;
        classArray[SquireGiantsFoundry.var1[10]] = PickingUpSwordTask.class;
        classArray[SquireGiantsFoundry.var1[11]] = PouringCrucibleTask.class;
        classArray[SquireGiantsFoundry.var1[12]] = OpeningBankTask.class;
        classArray[SquireGiantsFoundry.var1[13]] = ResettingSwordTask.class;
        return classArray;
    }

    static {
        SquireGiantsFoundry.var2();
    }

    public SquireGiantsFoundry() {
        this.e = new InventorySetup();
        this.f = var1[0];
    }

    private static void var2() {
        var1 = new int[14];
        SquireGiantsFoundry.var1[0] = (0x43 ^ 0x55) & ~(0x62 ^ 0x74);
        SquireGiantsFoundry.var1[1] = 0xD ^ 0;
        SquireGiantsFoundry.var1[2] = 1;
        SquireGiantsFoundry.var1[3] = 2;
        SquireGiantsFoundry.var1[4] = 3;
        SquireGiantsFoundry.var1[5] = 0x3D ^ 0x39;
        SquireGiantsFoundry.var1[6] = 0x27 ^ 0x22;
        SquireGiantsFoundry.var1[7] = 0x81 ^ 0x87;
        SquireGiantsFoundry.var1[8] = 0x29 ^ 0x2E;
        SquireGiantsFoundry.var1[9] = 0x54 ^ 0x5C;
        SquireGiantsFoundry.var1[10] = 0xFE ^ 0xC2 ^ (0x7E ^ 0x4B);
        SquireGiantsFoundry.var1[11] = 0xB4 ^ 0xBE;
        SquireGiantsFoundry.var1[12] = 0xCE ^ 0xC5;
        SquireGiantsFoundry.var1[13] = 0xA6 ^ 0xBE ^ (0x9C ^ 0x88);
    }

    public void a(InventorySetup inventorySetup) {
        this.e = inventorySetup;
    }

    private void a() {
        if (SquireGiantsFoundry.var3(this.b())) {
            this.a(new InventorySetup());
        }
        this.b().add(this.b.primaryBar().v(), this.b.primaryBarAmount());
        0;
        this.b().add(this.b.secondaryBar().v(), this.b.secondaryBarAmount());
        0;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    public InventorySetup b() {
        return this.e;
    }

    protected void onStart() {
        this.a.add((Overlay)this.c);
        0;
        this.a.add((Overlay)this.d);
        0;
        this.a();
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.a();
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    @Provides
    SquireGiantsConfig a(ConfigManager configManager) {
        return (SquireGiantsConfig)configManager.getConfig(SquireGiantsConfig.class);
    }

    protected void onStop() {
        this.a.remove((Overlay)this.c);
        0;
        this.a.remove((Overlay)this.d);
        0;
    }

    public boolean c() {
        return this.f;
    }
}

