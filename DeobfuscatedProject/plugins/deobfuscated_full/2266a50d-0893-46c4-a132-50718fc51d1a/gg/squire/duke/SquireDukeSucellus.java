/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.duke;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.overlay.SquireDukeSucellusInfoBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.A;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.B;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.C;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.D;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.E;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.F;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.G;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.H;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.I;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.J;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.K;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.L;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.M;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.N;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.O;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.P;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.Q;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.R;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.f;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.i;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.j;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.k;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.l;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.m;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.o;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.p;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.q;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.r;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.s;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.t;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.u;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.v;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.w;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.x;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.y;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.z;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(name="Squire Duke Sucellus", description="Squire Duke Sucellus", enabledByDefault=false, tags={"duke", "sucellus", "dt2"})
public class SquireDukeSucellus
extends SquirePlugin {
    /* synthetic */ boolean l;
    private static /* synthetic */ int[] lIllIlllIIII;
    @Inject
    private /* synthetic */ OverlayManager r;
    @Inject
    private /* synthetic */ SquireDukeSucellusConfig v;
    private /* synthetic */ List<f> p;
    /* synthetic */ int m;
    /* synthetic */ boolean k;
    private final /* synthetic */ HashSet<Prayer> a;
    @Inject
    private /* synthetic */ EventBus q;
    /* synthetic */ boolean n;
    private /* synthetic */ InventorySetup o;
    /* synthetic */ WorldPoint e;
    @Inject
    private /* synthetic */ i t;
    /* synthetic */ int b;
    /* synthetic */ boolean c;
    /* synthetic */ WorldPoint f;
    @Inject
    private /* synthetic */ a u;
    /* synthetic */ List<WorldPoint> d;
    /* synthetic */ boolean j;
    /* synthetic */ List<WorldPoint> g;
    /* synthetic */ boolean i;
    @Inject
    private /* synthetic */ SquireDukeSucellusInfoBox s;
    /* synthetic */ boolean h;

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    public void b() {
        this.m += lIllIlllIIII[1];
    }

    public void a(WorldPoint worldPoint) {
        this.e = worldPoint;
    }

    public List<WorldPoint> i() {
        return this.g;
    }

    public boolean m() {
        return this.k;
    }

    public void f(boolean bl) {
        this.l = bl;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIlllIIII[2]];
        classArray[SquireDukeSucellus.lIllIlllIIII[0]] = j.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[1]] = o.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[3]] = p.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[4]] = q.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[5]] = p.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[6]] = x.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[7]] = z.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[8]] = A.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[9]] = w.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[10]] = y.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[11]] = l.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[12]] = u.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[13]] = v.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[14]] = k.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[15]] = C.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[16]] = t.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[17]] = B.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[18]] = r.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[19]] = s.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[20]] = G.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[21]] = D.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[22]] = H.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[23]] = F.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[24]] = m.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[25]] = N.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[26]] = E.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[27]] = P.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[28]] = M.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[29]] = O.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[30]] = J.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[31]] = L.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[32]] = I.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[33]] = K.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[34]] = Q.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[35]] = R.class;
        return classArray;
    }

    public List<WorldPoint> f() {
        return this.d;
    }

    public void e(boolean bl) {
        this.k = bl;
    }

    public void e(List<WorldPoint> list) {
        this.d = list;
    }

    private static void lllIlIIllIIllI() {
        lIllIlllIIII = new int[36];
        SquireDukeSucellus.lIllIlllIIII[0] = (0x51 ^ 0x17 ^ (0x82 ^ 0x84)) & (0x81 ^ 0xB3 ^ (0x65 ^ 0x17) ^ -1);
        SquireDukeSucellus.lIllIlllIIII[1] = 1;
        SquireDukeSucellus.lIllIlllIIII[2] = 94 + 77 - 63 + 19 ^ (0xC9 ^ 0x95);
        SquireDukeSucellus.lIllIlllIIII[3] = 2;
        SquireDukeSucellus.lIllIlllIIII[4] = 3;
        SquireDukeSucellus.lIllIlllIIII[5] = 0x5E ^ 0x5A;
        SquireDukeSucellus.lIllIlllIIII[6] = 0x3D ^ 0x38;
        SquireDukeSucellus.lIllIlllIIII[7] = 0x9F ^ 0x92 ^ (0x2E ^ 0x25);
        SquireDukeSucellus.lIllIlllIIII[8] = 0x51 ^ 0x56;
        SquireDukeSucellus.lIllIlllIIII[9] = 0x88 ^ 0x8C ^ (0xF ^ 3);
        SquireDukeSucellus.lIllIlllIIII[10] = 0x8F ^ 0x86;
        SquireDukeSucellus.lIllIlllIIII[11] = 0x70 ^ 0x1A ^ (0x78 ^ 0x18);
        SquireDukeSucellus.lIllIlllIIII[12] = 124 + 171 - 207 + 102 ^ 20 + 9 - -39 + 113;
        SquireDukeSucellus.lIllIlllIIII[13] = 0x91 ^ 0xB9 ^ (0x14 ^ 0x30);
        SquireDukeSucellus.lIllIlllIIII[14] = 0x93 ^ 0x9E;
        SquireDukeSucellus.lIllIlllIIII[15] = 0xD5 ^ 0xA3 ^ (0x7C ^ 4);
        SquireDukeSucellus.lIllIlllIIII[16] = 0x4B ^ 0x44;
        SquireDukeSucellus.lIllIlllIIII[17] = 3 ^ 0x13;
        SquireDukeSucellus.lIllIlllIIII[18] = 0x3A ^ 0x2B;
        SquireDukeSucellus.lIllIlllIIII[19] = 106 + 28 - 64 + 97 ^ 12 + 98 - -64 + 7;
        SquireDukeSucellus.lIllIlllIIII[20] = 117 + 86 - 159 + 129 ^ 109 + 4 - 77 + 154;
        SquireDukeSucellus.lIllIlllIIII[21] = 0x66 ^ 0x72;
        SquireDukeSucellus.lIllIlllIIII[22] = 0x34 ^ 0x43 ^ (0xF9 ^ 0x9B);
        SquireDukeSucellus.lIllIlllIIII[23] = 122 + 100 - 219 + 127 ^ 67 + 44 - 72 + 109;
        SquireDukeSucellus.lIllIlllIIII[24] = 0x28 ^ 0x18 ^ (7 ^ 0x20);
        SquireDukeSucellus.lIllIlllIIII[25] = 0xBC ^ 0xA4;
        SquireDukeSucellus.lIllIlllIIII[26] = 0x28 ^ 0x73 ^ (0xFB ^ 0xB9);
        SquireDukeSucellus.lIllIlllIIII[27] = 0x60 ^ 0x4B ^ (0x38 ^ 9);
        SquireDukeSucellus.lIllIlllIIII[28] = 0x54 ^ 0x4F;
        SquireDukeSucellus.lIllIlllIIII[29] = 0x97 ^ 0xA4 ^ (0x94 ^ 0xBB);
        SquireDukeSucellus.lIllIlllIIII[30] = 0x6A ^ 0x77;
        SquireDukeSucellus.lIllIlllIIII[31] = 0xE3 ^ 0xC6 ^ (0x13 ^ 0x28);
        SquireDukeSucellus.lIllIlllIIII[32] = 0x5B ^ 0x44;
        SquireDukeSucellus.lIllIlllIIII[33] = 0x9D ^ 0xBD;
        SquireDukeSucellus.lIllIlllIIII[34] = 0x7A ^ 0x2E ^ (0xE6 ^ 0x93);
        SquireDukeSucellus.lIllIlllIIII[35] = 0x78 ^ 0x4B ^ (0x75 ^ 0x64);
    }

    static {
        SquireDukeSucellus.lllIlIIllIIllI();
    }

    public HashSet<Prayer> c() {
        return this.a;
    }

    public void g(boolean bl) {
        this.n = bl;
    }

    public WorldPoint h() {
        return this.f;
    }

    public a s() {
        return this.u;
    }

    public int d() {
        return this.b;
    }

    public WorldPoint g() {
        return this.e;
    }

    public boolean p() {
        return this.n;
    }

    public void c(boolean bl) {
        this.i = bl;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (SquireDukeSucellus.lllIlIIllIIlll(this.g.contains(worldPoint) ? 1 : 0)) {
                this.g.remove(worldPoint);
                0;
            }
        });
    }

    public void d(boolean bl) {
        this.j = bl;
    }

    private static boolean lllIlIIllIIlll(int n2) {
        return n2 != 0;
    }

    public void a(InventorySetup inventorySetup) {
        this.o = inventorySetup;
    }

    public void a() {
        this.g.clear();
    }

    public void b(WorldPoint worldPoint) {
        this.f = worldPoint;
    }

    public InventorySetup q() {
        return this.o;
    }

    public boolean k() {
        return this.i;
    }

    public boolean n() {
        return this.l;
    }

    public void a(List<WorldArea> list) {
        this.g.clear();
        Iterator<WorldArea> var3 = list.iterator();
        while (SquireDukeSucellus.lllIlIIllIIlll(var3.hasNext() ? 1 : 0)) {
            SquireDukeSucellus var4;
            WorldArea var1 = var3.next();
            var4.g.addAll(var1.toWorldPointList());
            0;
            0;
            
            return;
        }
    }

    protected void onStart() {
        this.q.register((Object)this.u);
        this.u.t();
        this.r.add((Overlay)this.s);
        0;
        this.r.add((Overlay)this.t);
        0;
        this.h = lIllIlllIIII[1];
        this.m = lIllIlllIIII[0];
        this.n = lIllIlllIIII[0];
        this.e(lIllIlllIIII[0]);
        this.p.clear();
        this.l = lIllIlllIIII[0];
        this.j = lIllIlllIIII[0];
    }

    public List<f> r() {
        return this.p;
    }

    public int o() {
        return this.m;
    }

    public void a(int n2) {
        this.m = n2;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void f(List<f> list) {
        this.p = list;
    }

    public void c(List<WorldPoint> list) {
        this.g.addAll(list);
        0;
    }

    protected void onStop() {
        this.q.unregister((Object)this.u);
        this.r.remove((Overlay)this.s);
        0;
        this.r.remove((Overlay)this.t);
        0;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (SquireDukeSucellus.lllIlIIllIIlll(this.g.contains(worldPoint) ? 1 : 0)) {
                this.g.remove(worldPoint);
                0;
            }
        });
    }

    public boolean j() {
        return this.h;
    }

    public boolean e() {
        return this.c;
    }

    public SquireDukeSucellus() {
        this.a = new HashSet();
        this.b = lIllIlllIIII[0];
        this.c = lIllIlllIIII[1];
        this.d = new ArrayList<WorldPoint>();
        this.e = new WorldPoint(lIllIlllIIII[0], lIllIlllIIII[0], lIllIlllIIII[0]);
        this.f = new WorldPoint(lIllIlllIIII[0], lIllIlllIIII[0], lIllIlllIIII[0]);
        this.g = new ArrayList<WorldPoint>();
        this.h = lIllIlllIIII[0];
        this.i = lIllIlllIIII[0];
        this.n = lIllIlllIIII[0];
        this.p = new ArrayList<f>();
    }

    @Provides
    SquireDukeSucellusConfig a(ConfigManager configManager) {
        return (SquireDukeSucellusConfig)configManager.getConfig(SquireDukeSucellusConfig.class);
    }

    public boolean l() {
        return this.j;
    }

    public void a(WorldArea worldArea) {
        this.g.addAll(worldArea.toWorldPointList());
        0;
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var2 = list.iterator();
        while (SquireDukeSucellus.lllIlIIllIIlll(var2.hasNext() ? 1 : 0)) {
            SquireDukeSucellus var6;
            WorldArea var5 = var2.next();
            var6.g.addAll(var5.toWorldPointList());
            0;
            0;
            
            return;
        }
    }
}

