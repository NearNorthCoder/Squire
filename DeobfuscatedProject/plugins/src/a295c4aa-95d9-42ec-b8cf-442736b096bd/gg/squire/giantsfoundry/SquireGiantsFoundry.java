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
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.l;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.m;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.n;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.o;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.p;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.q;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.r;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.s;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.t;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.u;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.v;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.w;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.x;
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
    private /* synthetic */ SquireGiantsConfig b;
    private /* synthetic */ boolean f;
    private static /* synthetic */ int[] llIlIlllIlII;
    @Inject
    private /* synthetic */ k d;
    private /* synthetic */ InventorySetup e;
    @Inject
    private /* synthetic */ GiantsOverlay c;
    @Inject
    private /* synthetic */ OverlayManager a;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIlIlllIlII[1]];
        classArray[SquireGiantsFoundry.llIlIlllIlII[0]] = p.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[2]] = l.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[3]] = m.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[4]] = n.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[5]] = q.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[6]] = t.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[7]] = u.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[8]] = r.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[9]] = s.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[10]] = w.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[11]] = x.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[12]] = v.class;
        classArray[SquireGiantsFoundry.llIlIlllIlII[13]] = o.class;
        return classArray;
    }

    static {
        SquireGiantsFoundry.lIIIIIllllllIlI();
    }

    public SquireGiantsFoundry() {
        this.e = new InventorySetup();
        this.f = llIlIlllIlII[0];
    }

    private static void lIIIIIllllllIlI() {
        llIlIlllIlII = new int[14];
        SquireGiantsFoundry.llIlIlllIlII[0] = (0x43 ^ 0x55) & ~(0x62 ^ 0x74);
        SquireGiantsFoundry.llIlIlllIlII[1] = 0xD ^ 0;
        SquireGiantsFoundry.llIlIlllIlII[2] = " ".length();
        SquireGiantsFoundry.llIlIlllIlII[3] = "  ".length();
        SquireGiantsFoundry.llIlIlllIlII[4] = "   ".length();
        SquireGiantsFoundry.llIlIlllIlII[5] = 0x3D ^ 0x39;
        SquireGiantsFoundry.llIlIlllIlII[6] = 0x27 ^ 0x22;
        SquireGiantsFoundry.llIlIlllIlII[7] = 0x81 ^ 0x87;
        SquireGiantsFoundry.llIlIlllIlII[8] = 0x29 ^ 0x2E;
        SquireGiantsFoundry.llIlIlllIlII[9] = 0x54 ^ 0x5C;
        SquireGiantsFoundry.llIlIlllIlII[10] = 0xFE ^ 0xC2 ^ (0x7E ^ 0x4B);
        SquireGiantsFoundry.llIlIlllIlII[11] = 0xB4 ^ 0xBE;
        SquireGiantsFoundry.llIlIlllIlII[12] = 0xCE ^ 0xC5;
        SquireGiantsFoundry.llIlIlllIlII[13] = 0xA6 ^ 0xBE ^ (0x9C ^ 0x88);
    }

    public void a(InventorySetup inventorySetup) {
        this.e = inventorySetup;
    }

    private void a() {
        if (SquireGiantsFoundry.lIIIIIllllllIll(this.b())) {
            this.a(new InventorySetup());
        }
        this.b().add(this.b.primaryBar().v(), this.b.primaryBarAmount());
        "".length();
        this.b().add(this.b.secondaryBar().v(), this.b.secondaryBarAmount());
        "".length();
    }

    private static boolean lIIIIIllllllIll(Object object) {
        return object == null;
    }

    public InventorySetup b() {
        return this.e;
    }

    protected void onStart() {
        this.a.add((Overlay)this.c);
        "".length();
        this.a.add((Overlay)this.d);
        "".length();
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
        "".length();
        this.a.remove((Overlay)this.d);
        "".length();
    }

    public boolean c() {
        return this.f;
    }
}

