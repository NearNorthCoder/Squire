package gg.squire.scurrius;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.scurrius.overlay.SquireScurriusBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.b;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.d;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.e;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.f;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.g;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.h;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.j;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.k;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.l;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.m;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.n;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.o;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.p;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.q;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.r;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.s;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.t;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.u;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.v;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.w;
import r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.x;
@PluginDescriptor(name = "Squire Scurrius", description = "Squire Scurrius", enabledByDefault = false, tags = {"Scurrius", "rat", "king", "combat"})
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:gg/squire/scurrius/SquireScurrius.class */
public class SquireScurrius extends SquirePlugin {
    @Inject
    private /* synthetic */ SquireScurriusConfig s;
    @Inject
    private /* synthetic */ EventBus o;
    /* synthetic */ int m;
    @Inject
    private /* synthetic */ b c;
    /* synthetic */ boolean l;
    @Inject
    private /* synthetic */ SquireScurriusBox q;
    private static /* synthetic */ int[] lIIlIllIlllIl;
    /* synthetic */ boolean k;
    @Inject
    private /* synthetic */ OverlayManager p;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    private /* synthetic */ e f0r;
    private final /* synthetic */ HashSet<Prayer> h = new HashSet<>();
    /* synthetic */ boolean i = lIIlIllIlllIl[0];
    /* synthetic */ List<WorldPoint> j = new ArrayList();
    /* synthetic */ boolean n = lIIlIllIlllIl[1];

    public List<WorldPoint> i() {
        return this.j;
    }

    public boolean k() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIlIllIlllIl[2]];
        clsArr[lIIlIllIlllIl[1]] = h.class;
        clsArr[lIIlIllIlllIl[0]] = j.class;
        clsArr[lIIlIllIlllIl[3]] = k.class;
        clsArr[lIIlIllIlllIl[4]] = l.class;
        clsArr[lIIlIllIlllIl[5]] = k.class;
        clsArr[lIIlIllIlllIl[6]] = r.class;
        clsArr[lIIlIllIlllIl[7]] = m.class;
        clsArr[lIIlIllIlllIl[8]] = x.class;
        clsArr[lIIlIllIlllIl[9]] = t.class;
        clsArr[lIIlIllIlllIl[10]] = n.class;
        clsArr[lIIlIllIlllIl[11]] = w.class;
        clsArr[lIIlIllIlllIl[12]] = q.class;
        clsArr[lIIlIllIlllIl[13]] = s.class;
        clsArr[lIIlIllIlllIl[14]] = v.class;
        clsArr[lIIlIllIlllIl[15]] = u.class;
        clsArr[lIIlIllIlllIl[16]] = g.class;
        clsArr[lIIlIllIlllIl[17]] = o.class;
        clsArr[lIIlIllIlllIl[18]] = p.class;
        clsArr[lIIlIllIlllIl[19]] = f.class;
        return clsArr;
    }

    public void c(List<WorldPoint> list) {
        this.j.addAll(list);
        "".length();
    }

    public void b(boolean z) {
        this.i = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean c() {
        if (!lIlIllIlIlllIll(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIlIllIlIlllIll(d.F.contains(Players.getLocal()) ? 1 : 0)) {
            return lIIlIllIlllIl[1];
        }
        return lIIlIllIlllIl[0];
    }

    @Provides
    SquireScurriusConfig a(ConfigManager configManager) {
        return (SquireScurriusConfig) configManager.getConfig(SquireScurriusConfig.class);
    }

    public void d() {
        this.j.clear();
    }

    private static boolean lIlIllIlIlllIll(int i) {
        return i != 0;
    }

    protected void onStop() {
        this.o.unregister(this.c);
        this.p.remove(this.q);
        "".length();
        this.p.remove(this.f0r);
        "".length();
    }

    private static void lIlIllIlIlllIlI() {
        lIIlIllIlllIl = new int[20];
        lIIlIllIlllIl[0] = " ".length();
        lIIlIllIlllIl[1] = ((((65 + 78) - 4) + 45) ^ (((92 + 24) - 97) + 113)) & (((((145 + 105) - 145) + 66) ^ (((40 + 50) - 26) + 87)) ^ (-" ".length()));
        lIIlIllIlllIl[2] = 165 ^ 182;
        lIIlIllIlllIl[3] = "  ".length();
        lIIlIllIlllIl[4] = "   ".length();
        lIIlIllIlllIl[5] = 138 ^ 142;
        lIIlIllIlllIl[6] = 54 ^ 51;
        lIIlIllIlllIl[7] = (228 ^ 159) ^ (100 ^ 25);
        lIIlIllIlllIl[8] = 152 ^ 159;
        lIIlIllIlllIl[9] = 93 ^ 85;
        lIIlIllIlllIl[10] = (111 ^ 57) ^ (92 ^ 3);
        lIIlIllIlllIl[11] = (((3 + 139) - 39) + 76) ^ (((163 + 114) - 218) + 126);
        lIIlIllIlllIl[12] = (((121 + 52) - 42) + 17) ^ (((98 + 125) - 203) + 139);
        lIIlIllIlllIl[13] = (((144 + 28) - 149) + 122) ^ (((5 + 118) - 47) + 81);
        lIIlIllIlllIl[14] = (((94 + 108) - 174) + 132) ^ (((157 + 146) - 165) + 35);
        lIIlIllIlllIl[15] = 91 ^ 85;
        lIIlIllIlllIl[16] = (((16 + 1) - (-22)) + 135) ^ (((13 + 15) - (-107)) + 26);
        lIIlIllIlllIl[17] = (((95 + 155) - 128) + 35) ^ (((40 + 105) - 73) + 69);
        lIIlIllIlllIl[18] = (((78 + 103) - 90) + 76) ^ (((65 + 134) - 87) + 70);
        lIIlIllIlllIl[19] = (((68 + 23) - 27) + 114) ^ (((27 + 84) - 44) + 93);
    }

    public void e(boolean z) {
        this.n = z;
    }

    public void d(boolean z) {
        this.l = z;
    }

    public HashSet<Prayer> g() {
        return this.h;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (lIlIllIlIlllIll(this.j.contains(worldPoint) ? 1 : 0)) {
                this.j.remove(worldPoint);
                "".length();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    protected void onStart() {
        this.o.register(this.c);
        this.c.o();
        this.p.add(this.q);
        "".length();
        this.p.add(this.f0r);
        "".length();
        this.m = lIIlIllIlllIl[1];
        this.n = this.s.bankOnStart();
        d((boolean) lIIlIllIlllIl[1]);
    }

    public void a(WorldArea worldArea) {
        this.j.addAll(worldArea.toWorldPointList());
        "".length();
    }

    static {
        lIlIllIlIlllIlI();
    }

    public boolean j() {
        return this.k;
    }

    public void e() {
        this.m += lIIlIllIlllIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean f() {
        if (!lIlIllIlIllllII(LocalPlayer.getAccountType().isIronman() ? 1 : 0) || lIlIllIlIlllIll(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
            ?? r0 = lIIlIllIlllIl[0];
            "".length();
            return (-((((40 + 31) - (-24)) + 66) ^ (((102 + 163) - 195) + 94))) >= 0 ? ((77 ^ 38) ^ (77 ^ 42)) & (((((5 + 90) - 42) + 134) ^ (((95 + 130) - 175) + 133)) ^ (-" ".length())) : r0;
        }
        return lIIlIllIlllIl[1];
    }

    public boolean h() {
        return this.i;
    }

    public void c(boolean z) {
        this.k = z;
    }

    private static boolean lIlIllIlIllllII(int i) {
        return i == 0;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (lIlIllIlIlllIll(this.j.contains(worldPoint) ? 1 : 0)) {
                this.j.remove(worldPoint);
                "".length();
            }
        });
    }

    public int l() {
        return this.m;
    }

    public void b(List<WorldArea> list) {
        for (WorldArea worldArea : list) {
            this.j.addAll(worldArea.toWorldPointList());
            "".length();
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
    }

    public b n() {
        return this.c;
    }

    public void a(List<WorldArea> list) {
        this.j.clear();
        for (WorldArea worldArea : list) {
            this.j.addAll(worldArea.toWorldPointList());
            "".length();
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
    }

    public void a(int i) {
        this.m = i;
    }
}
