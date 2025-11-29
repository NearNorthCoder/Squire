package gg.squire.giantsfoundry;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.giantsfoundry.overlay.GiantsOverlay;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.k;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.l;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.m;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.n;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.o;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.p;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.q;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.r;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.s;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.t;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.u;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.v;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.w;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.x;
@PluginDescriptor(name = "Squire Giants Foundry", enabledByDefault = false, tags = {"giant", "foundry", "smithing"})
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:gg/squire/giantsfoundry/SquireGiantsFoundry.class */
public class SquireGiantsFoundry extends SquirePlugin {
    @Inject
    private /* synthetic */ SquireGiantsConfig b;
    private static /* synthetic */ int[] llIlIlllIlII;
    @Inject
    private /* synthetic */ k d;
    @Inject
    private /* synthetic */ GiantsOverlay c;
    @Inject
    private /* synthetic */ OverlayManager a;
    private /* synthetic */ InventorySetup e = new InventorySetup();
    private /* synthetic */ boolean f = llIlIlllIlII[0];

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIlIlllIlII[1]];
        clsArr[llIlIlllIlII[0]] = p.class;
        clsArr[llIlIlllIlII[2]] = l.class;
        clsArr[llIlIlllIlII[3]] = m.class;
        clsArr[llIlIlllIlII[4]] = n.class;
        clsArr[llIlIlllIlII[5]] = q.class;
        clsArr[llIlIlllIlII[6]] = t.class;
        clsArr[llIlIlllIlII[7]] = u.class;
        clsArr[llIlIlllIlII[8]] = r.class;
        clsArr[llIlIlllIlII[9]] = s.class;
        clsArr[llIlIlllIlII[10]] = w.class;
        clsArr[llIlIlllIlII[11]] = x.class;
        clsArr[llIlIlllIlII[12]] = v.class;
        clsArr[llIlIlllIlII[13]] = o.class;
        return clsArr;
    }

    static {
        lIIIIIllllllIlI();
    }

    private static void lIIIIIllllllIlI() {
        llIlIlllIlII = new int[14];
        llIlIlllIlII[0] = (67 ^ 85) & ((98 ^ 116) ^ (-1));
        llIlIlllIlII[1] = 13 ^ 0;
        llIlIlllIlII[2] = " ".length();
        llIlIlllIlII[3] = "  ".length();
        llIlIlllIlII[4] = "   ".length();
        llIlIlllIlII[5] = 61 ^ 57;
        llIlIlllIlII[6] = 39 ^ 34;
        llIlIlllIlII[7] = 129 ^ 135;
        llIlIlllIlII[8] = 41 ^ 46;
        llIlIlllIlII[9] = 84 ^ 92;
        llIlIlllIlII[10] = (254 ^ 194) ^ (126 ^ 75);
        llIlIlllIlII[11] = 180 ^ 190;
        llIlIlllIlII[12] = 206 ^ 197;
        llIlIlllIlII[13] = (166 ^ 190) ^ (156 ^ 136);
    }

    public void a(InventorySetup inventorySetup) {
        this.e = inventorySetup;
    }

    private void a() {
        if (lIIIIIllllllIll(b())) {
            a(new InventorySetup());
        }
        b().add(this.b.primaryBar().v(), this.b.primaryBarAmount());
        "".length();
        b().add(this.b.secondaryBar().v(), this.b.secondaryBarAmount());
        "".length();
    }

    private static boolean lIIIIIllllllIll(Object obj) {
        return obj == null;
    }

    public InventorySetup b() {
        return this.e;
    }

    protected void onStart() {
        this.a.add(this.c);
        "".length();
        this.a.add(this.d);
        "".length();
        a();
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        a(new InventorySetup());
        a();
    }

    public void a(boolean z) {
        this.f = z;
    }

    @Provides
    SquireGiantsConfig a(ConfigManager configManager) {
        return (SquireGiantsConfig) configManager.getConfig(SquireGiantsConfig.class);
    }

    protected void onStop() {
        this.a.remove(this.c);
        "".length();
        this.a.remove(this.d);
        "".length();
    }

    public boolean c() {
        return this.f;
    }
}
