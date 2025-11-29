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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i_Unknown;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.j_Unknown;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.BuyingRewardsTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.ClearingBlightedPlantsTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.DepositingFruitTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.DrinkingEnergyBoostTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.GettingNewSeedsTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.HarvestingPlantTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.LeavingTitheInstanceTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.PlantingSeedTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.RefillingWateringCansTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.WalkingTowardsTheNextPatchTask;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.WateringPlantTask;

@PluginDescriptor(name="Squire Tithe Farm", description="Automatically harvests and collects from Tithe Farm", enabledByDefault=false)
public class SquireTitheFarm
extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus e;
    private /* synthetic */ int g;
    public /* synthetic */ int a;
    @Inject
    private /* synthetic */ i d;
    @Inject
    private /* synthetic */ j f;
    private static /* synthetic */ int[] lIIllllllIllI;
    @Inject
    private /* synthetic */ OverlayManager b;
    @Inject
    private /* synthetic */ TitheInfoBox c;

    protected void onStart() {
        this.e.register((Object)this.d);
        this.e.register((Object)this.f);
        this.b.add((Overlay)this.c);
        0;
        this.b.add((Overlay)this.f);
        0;
        this.a = lIIllllllIllI[2];
        this.g = lIIllllllIllI[0];
        this.d.s();
    }

    public int a() {
        return this.a;
    }

    private static void lIllIllIIIlIIll() {
        lIIllllllIllI = new int[16];
        SquireTitheFarm.lIIllllllIllI[0] = -(0xFFFFFAA9 & 0x4D57) & (0xFFFFCFED & 0x7BFA);
        SquireTitheFarm.lIIllllllIllI[1] = 0xD0 ^ 0xBA ^ (0x6A ^ 0xB);
        SquireTitheFarm.lIIllllllIllI[2] = (0x83 ^ 0x99 ^ (0x8E ^ 0xAA)) & (130 + 18 - 92 + 80 ^ 118 + 24 - 124 + 164 ^ -1);
        SquireTitheFarm.lIIllllllIllI[3] = 1;
        SquireTitheFarm.lIIllllllIllI[4] = 2;
        SquireTitheFarm.lIIllllllIllI[5] = 3;
        SquireTitheFarm.lIIllllllIllI[6] = 42 + 29 - -30 + 29 ^ 16 + 51 - 44 + 111;
        SquireTitheFarm.lIIllllllIllI[7] = 0x3D ^ 0x14 ^ (0x7E ^ 0x52);
        SquireTitheFarm.lIIllllllIllI[8] = 86 + 13 - 80 + 133 ^ 96 + 92 - 107 + 77;
        SquireTitheFarm.lIIllllllIllI[9] = 0xB6 ^ 0xB1;
        SquireTitheFarm.lIIllllllIllI[10] = 0x25 ^ 0x2D;
        SquireTitheFarm.lIIllllllIllI[11] = 0xB ^ 2;
        SquireTitheFarm.lIIllllllIllI[12] = 0x67 ^ 0x6D;
        SquireTitheFarm.lIIllllllIllI[13] = 0xFFFFBFF6 & 0x747B;
        SquireTitheFarm.lIIllllllIllI[14] = 0xFFFFB7F3 & 0x7C7F;
        SquireTitheFarm.lIIllllllIllI[15] = -(0xFFFFC94B & 0x7EBE) & (0xFFFFFC7F & 0x7FFD);
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
        0;
        this.b.remove((Overlay)this.f);
        0;
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
        classArray[SquireTitheFarm.lIIllllllIllI[2]] = s.class;
        classArray[SquireTitheFarm.lIIllllllIllI[3]] = v.class;
        classArray[SquireTitheFarm.lIIllllllIllI[4]] = p.class;
        classArray[SquireTitheFarm.lIIllllllIllI[5]] = u.class;
        classArray[SquireTitheFarm.lIIllllllIllI[6]] = t.class;
        classArray[SquireTitheFarm.lIIllllllIllI[7]] = m.class;
        classArray[SquireTitheFarm.lIIllllllIllI[8]] = o.class;
        classArray[SquireTitheFarm.lIIllllllIllI[9]] = n.class;
        classArray[SquireTitheFarm.lIIllllllIllI[10]] = l.class;
        classArray[SquireTitheFarm.lIIllllllIllI[11]] = k.class;
        classArray[SquireTitheFarm.lIIllllllIllI[12]] = q.class;
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
            llllllllllllllIlllIIlIllIllIllIl.a += lIIllllllIllI[3];
        }
    }
}

