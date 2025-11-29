package gg.squire.duke;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.duke.overlay.SquireDukeSucellusInfoBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.A;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.B;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0000a;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0005f;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0008i;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0009j;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0010k;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0011l;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0012m;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0014o;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0015p;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0016q;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.C0017r;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.D;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.E;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.F;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.G;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.H;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.I;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.J;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.K;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.L;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.M;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.N;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.O;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.P;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.Q;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.R;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.s;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.t;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.u;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.v;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.w;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.x;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.y;
import k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.z;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
@PluginDescriptor(name = "Squire Duke Sucellus", description = "Squire Duke Sucellus", enabledByDefault = false, tags = {"duke", "sucellus", "dt2"})
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:gg/squire/duke/SquireDukeSucellus.class */
public class SquireDukeSucellus extends SquirePlugin {
    /* synthetic */ boolean l;
    private static /* synthetic */ int[] lIllIlllIIII;
    @Inject
    private /* synthetic */ OverlayManager r;
    @Inject
    private /* synthetic */ SquireDukeSucellusConfig v;
    /* synthetic */ int m;

    /* renamed from: k  reason: collision with root package name */
    /* synthetic */ boolean f0k;
    @Inject
    private /* synthetic */ EventBus q;
    private /* synthetic */ InventorySetup o;
    @Inject
    private /* synthetic */ C0008i t;
    @Inject
    private /* synthetic */ C0000a u;
    /* synthetic */ boolean j;
    @Inject
    private /* synthetic */ SquireDukeSucellusInfoBox s;
    private final /* synthetic */ HashSet<Prayer> a = new HashSet<>();
    /* synthetic */ int b = lIllIlllIIII[0];
    /* synthetic */ boolean c = lIllIlllIIII[1];
    /* synthetic */ List<WorldPoint> d = new ArrayList();
    /* synthetic */ WorldPoint e = new WorldPoint(lIllIlllIIII[0], lIllIlllIIII[0], lIllIlllIIII[0]);
    /* synthetic */ WorldPoint f = new WorldPoint(lIllIlllIIII[0], lIllIlllIIII[0], lIllIlllIIII[0]);
    /* synthetic */ List<WorldPoint> g = new ArrayList();
    /* synthetic */ boolean h = lIllIlllIIII[0];
    /* synthetic */ boolean i = lIllIlllIIII[0];
    /* synthetic */ boolean n = lIllIlllIIII[0];
    private /* synthetic */ List<C0005f> p = new ArrayList();

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
        return this.f0k;
    }

    public void f(boolean z) {
        this.l = z;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllIlllIIII[2]];
        clsArr[lIllIlllIIII[0]] = C0009j.class;
        clsArr[lIllIlllIIII[1]] = C0014o.class;
        clsArr[lIllIlllIIII[3]] = C0015p.class;
        clsArr[lIllIlllIIII[4]] = C0016q.class;
        clsArr[lIllIlllIIII[5]] = C0015p.class;
        clsArr[lIllIlllIIII[6]] = x.class;
        clsArr[lIllIlllIIII[7]] = z.class;
        clsArr[lIllIlllIIII[8]] = A.class;
        clsArr[lIllIlllIIII[9]] = w.class;
        clsArr[lIllIlllIIII[10]] = y.class;
        clsArr[lIllIlllIIII[11]] = C0011l.class;
        clsArr[lIllIlllIIII[12]] = u.class;
        clsArr[lIllIlllIIII[13]] = v.class;
        clsArr[lIllIlllIIII[14]] = C0010k.class;
        clsArr[lIllIlllIIII[15]] = C.class;
        clsArr[lIllIlllIIII[16]] = t.class;
        clsArr[lIllIlllIIII[17]] = B.class;
        clsArr[lIllIlllIIII[18]] = C0017r.class;
        clsArr[lIllIlllIIII[19]] = s.class;
        clsArr[lIllIlllIIII[20]] = G.class;
        clsArr[lIllIlllIIII[21]] = D.class;
        clsArr[lIllIlllIIII[22]] = H.class;
        clsArr[lIllIlllIIII[23]] = F.class;
        clsArr[lIllIlllIIII[24]] = C0012m.class;
        clsArr[lIllIlllIIII[25]] = N.class;
        clsArr[lIllIlllIIII[26]] = E.class;
        clsArr[lIllIlllIIII[27]] = P.class;
        clsArr[lIllIlllIIII[28]] = M.class;
        clsArr[lIllIlllIIII[29]] = O.class;
        clsArr[lIllIlllIIII[30]] = J.class;
        clsArr[lIllIlllIIII[31]] = L.class;
        clsArr[lIllIlllIIII[32]] = I.class;
        clsArr[lIllIlllIIII[33]] = K.class;
        clsArr[lIllIlllIIII[34]] = Q.class;
        clsArr[lIllIlllIIII[35]] = R.class;
        return clsArr;
    }

    public List<WorldPoint> f() {
        return this.d;
    }

    public void e(boolean z) {
        this.f0k = z;
    }

    public void e(List<WorldPoint> list) {
        this.d = list;
    }

    private static void lllIlIIllIIllI() {
        lIllIlllIIII = new int[36];
        lIllIlllIIII[0] = ((81 ^ 23) ^ (130 ^ 132)) & (((129 ^ 179) ^ (101 ^ 23)) ^ (-" ".length()));
        lIllIlllIIII[1] = " ".length();
        lIllIlllIIII[2] = (((94 + 77) - 63) + 19) ^ (201 ^ 149);
        lIllIlllIIII[3] = "  ".length();
        lIllIlllIIII[4] = "   ".length();
        lIllIlllIIII[5] = 94 ^ 90;
        lIllIlllIIII[6] = 61 ^ 56;
        lIllIlllIIII[7] = (159 ^ 146) ^ (46 ^ 37);
        lIllIlllIIII[8] = 81 ^ 86;
        lIllIlllIIII[9] = (136 ^ 140) ^ (15 ^ 3);
        lIllIlllIIII[10] = 143 ^ 134;
        lIllIlllIIII[11] = (112 ^ 26) ^ (120 ^ 24);
        lIllIlllIIII[12] = (((124 + 171) - 207) + 102) ^ (((20 + 9) - (-39)) + 113);
        lIllIlllIIII[13] = (145 ^ 185) ^ (20 ^ 48);
        lIllIlllIIII[14] = 147 ^ 158;
        lIllIlllIIII[15] = (213 ^ 163) ^ (124 ^ 4);
        lIllIlllIIII[16] = 75 ^ 68;
        lIllIlllIIII[17] = 3 ^ 19;
        lIllIlllIIII[18] = 58 ^ 43;
        lIllIlllIIII[19] = (((106 + 28) - 64) + 97) ^ (((12 + 98) - (-64)) + 7);
        lIllIlllIIII[20] = (((117 + 86) - 159) + 129) ^ (((109 + 4) - 77) + 154);
        lIllIlllIIII[21] = 102 ^ 114;
        lIllIlllIIII[22] = (52 ^ 67) ^ (249 ^ 155);
        lIllIlllIIII[23] = (((122 + 100) - 219) + 127) ^ (((67 + 44) - 72) + 109);
        lIllIlllIIII[24] = (40 ^ 24) ^ (7 ^ 32);
        lIllIlllIIII[25] = 188 ^ 164;
        lIllIlllIIII[26] = (40 ^ 115) ^ (251 ^ 185);
        lIllIlllIIII[27] = (96 ^ 75) ^ (56 ^ 9);
        lIllIlllIIII[28] = 84 ^ 79;
        lIllIlllIIII[29] = (151 ^ 164) ^ (148 ^ 187);
        lIllIlllIIII[30] = 106 ^ 119;
        lIllIlllIIII[31] = (227 ^ 198) ^ (19 ^ 40);
        lIllIlllIIII[32] = 91 ^ 68;
        lIllIlllIIII[33] = 157 ^ 189;
        lIllIlllIIII[34] = (122 ^ 46) ^ (230 ^ 147);
        lIllIlllIIII[35] = (120 ^ 75) ^ (117 ^ 100);
    }

    static {
        lllIlIIllIIllI();
    }

    public HashSet<Prayer> c() {
        return this.a;
    }

    public void g(boolean z) {
        this.n = z;
    }

    public WorldPoint h() {
        return this.f;
    }

    public C0000a s() {
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

    public void c(boolean z) {
        this.i = z;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (lllIlIIllIIlll(this.g.contains(worldPoint) ? 1 : 0)) {
                this.g.remove(worldPoint);
                "".length();
            }
        });
    }

    public void d(boolean z) {
        this.j = z;
    }

    private static boolean lllIlIIllIIlll(int i) {
        return i != 0;
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
        for (WorldArea worldArea : list) {
            this.g.addAll(worldArea.toWorldPointList());
            "".length();
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    protected void onStart() {
        this.q.register(this.u);
        this.u.t();
        this.r.add(this.s);
        "".length();
        this.r.add(this.t);
        "".length();
        this.h = lIllIlllIIII[1];
        this.m = lIllIlllIIII[0];
        this.n = lIllIlllIIII[0];
        e((boolean) lIllIlllIIII[0]);
        this.p.clear();
        this.l = lIllIlllIIII[0];
        this.j = lIllIlllIIII[0];
    }

    public List<C0005f> r() {
        return this.p;
    }

    public int o() {
        return this.m;
    }

    public void a(int i) {
        this.m = i;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void f(List<C0005f> list) {
        this.p = list;
    }

    public void c(List<WorldPoint> list) {
        this.g.addAll(list);
        "".length();
    }

    protected void onStop() {
        this.q.unregister(this.u);
        this.r.remove(this.s);
        "".length();
        this.r.remove(this.t);
        "".length();
    }

    public void b(boolean z) {
        this.h = z;
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (lllIlIIllIIlll(this.g.contains(worldPoint) ? 1 : 0)) {
                this.g.remove(worldPoint);
                "".length();
            }
        });
    }

    public boolean j() {
        return this.h;
    }

    public boolean e() {
        return this.c;
    }

    @Provides
    SquireDukeSucellusConfig a(ConfigManager configManager) {
        return (SquireDukeSucellusConfig) configManager.getConfig(SquireDukeSucellusConfig.class);
    }

    public boolean l() {
        return this.j;
    }

    public void a(WorldArea worldArea) {
        this.g.addAll(worldArea.toWorldPointList());
        "".length();
    }

    public void b(List<WorldArea> list) {
        for (WorldArea worldArea : list) {
            this.g.addAll(worldArea.toWorldPointList());
            "".length();
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }
}
