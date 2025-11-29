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

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.k;
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
        Class[] classArray = new Class[llIlIlllIlII[1]];
        classArray[SquireGiantsFoundry.llIlIlllIlII[0]] = ControllingTemperatureTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[2]] = HandingInSwordTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[3]] = HammeringSwordTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[4]] = PolishingSwordTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[5]] = GrindingSwordTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[6]] = GettingCommissionTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[7]] = MakingMouldTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[8]] = FillingCrucibleTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[9]] = BankingForBarsTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[10]] = PickingUpSwordTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[11]] = PouringCrucibleTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[12]] = OpeningBankTask.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[13]] = ResettingSwordTask.class;
        return classArray;
    }

    static {
        SquireGiantsFoundry.lIIIIIllllllIlI();
    }

    public SquireGiantsFoundry() {
        this.e = new InventorySetup();
        this.f = llIlIlllIlII[0];
    }

    public void a(InventorySetup inventorySetup) {
        this.e = inventorySetup;
    }

    private void a() {
        if (SquireGiantsFoundry.lIIIIIllllllIll(this.b())) {
            this.a(new InventorySetup());
        }
        this.b().add(this.b.primaryBar().v(), this.b.primaryBarAmount());

        this.b().add(this.b.secondaryBar().v(), this.b.secondaryBarAmount());

    }

    private static boolean lIIIIIllllllIll(Object object) {
        return object == null;
    }

    public InventorySetup b() {
        return this.e;
    }

    protected void onStart() {
        this.a.add((Overlay)this.c);

        this.a.add((Overlay)this.d);

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

        this.a.remove((Overlay)this.d);

    }

    public boolean c() {
        return this.f;
    }
}

