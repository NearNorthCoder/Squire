package gg.squire.mta;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mta.overlay.InfoBox;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import m.u.a.p000.e.s.q.t.i.r.a;
import m.u.a.p000.e.s.q.t.i.r.b;
import m.u.a.p000.e.s.q.t.i.r.c;
import m.u.a.p000.e.s.q.t.i.r.e;
import m.u.a.p000.e.s.q.t.i.r.j;
import m.u.a.p000.e.s.q.t.i.r.l;
import m.u.a.p000.e.s.q.t.i.r.n;
import m.u.a.p000.e.s.q.t.i.r.p;
import m.u.a.p000.e.s.q.t.i.r.q;
import m.u.a.p000.e.s.q.t.i.r.r;
import m.u.a.p000.e.s.q.t.i.r.s;
import m.u.a.p000.e.s.q.t.i.r.t;
import m.u.a.p000.e.s.q.t.i.r.u;
import m.u.a.p000.e.s.q.t.i.r.v;
import m.u.a.p000.e.s.q.t.i.r.x;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
@Singleton
@PluginDescriptor(name = "Squire Mage Training Arena", description = "Automatically completes MTA for nice rewards!", tags = {"mta", "magic", "minigame", "overlay"}, enabledByDefault = false)
/* loaded from: squire-mta-0.2.1.jar:gg/squire/mta/SquireMTA.class */
public class SquireMTA extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus d;
    @Inject
    private /* synthetic */ InfoBox e;
    @Inject
    private /* synthetic */ q k;
    @Inject
    private /* synthetic */ l g;

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ b[] f0m;
    @Inject
    private /* synthetic */ OverlayManager c;
    @Inject
    private /* synthetic */ MagicArenaConfig j;
    @Inject
    private /* synthetic */ e f;
    private static /* synthetic */ int[] lllIllIIlIll;
    @Inject
    private /* synthetic */ n h;
    @Inject
    private /* synthetic */ p l;
    @Inject
    private /* synthetic */ j i;
    private final /* synthetic */ Map<c, Integer> a = new EnumMap(c.class);
    private final /* synthetic */ Map<c, Boolean> b = new HashMap();

    private static boolean lIIIllIIllllIlI(int i, int i2) {
        return i < i2;
    }

    public int c(c cVar) {
        return this.a.getOrDefault(cVar, Integer.valueOf(lllIllIIlIll[7])).intValue();
    }

    public Map<c, Integer> a() {
        return this.a;
    }

    protected void onStop() {
        this.c.remove(this.k);
        "".length();
        this.c.remove(this.l);
        "".length();
        this.c.remove(this.e);
        "".length();
        b[] bVarArr = this.f0m;
        int length = bVarArr.length;
        int i = lllIllIIlIll[1];
        while (lIIIllIIllllIlI(i, length)) {
            this.d.unregister(bVarArr[i]);
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        this.h.F();
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllIllIIlIll[0]];
        clsArr[lllIllIIlIll[1]] = u.class;
        clsArr[lllIllIIlIll[2]] = x.class;
        clsArr[lllIllIIlIll[3]] = r.class;
        clsArr[lllIllIIlIll[4]] = v.class;
        clsArr[lllIllIIlIll[5]] = t.class;
        clsArr[lllIllIIlIll[6]] = s.class;
        return clsArr;
    }

    static {
        lIIIllIIllllIIl();
    }

    public void a(c cVar, int i) {
        System.out.println("Setting points for " + cVar + " to " + i);
        this.a.put(cVar, Integer.valueOf(i));
        "".length();
    }

    @Provides
    public MagicArenaConfig a(ConfigManager configManager) {
        return (MagicArenaConfig) configManager.getConfig(MagicArenaConfig.class);
    }

    public int d(c cVar) {
        switch (a.n[cVar.ordinal()]) {
            case 1:
                return this.j.alchemyPoints();
            case 2:
                return this.j.graveyardPoints();
            case 3:
                return this.j.telekineticPoints();
            case 4:
                return this.j.enchantmentPoints();
            default:
                return lllIllIIlIll[7];
        }
    }

    public b[] b() {
        return this.f0m;
    }

    private static void lIIIllIIllllIIl() {
        lllIllIIlIll = new int[8];
        lllIllIIlIll[0] = 159 ^ 153;
        lllIllIIlIll[1] = ((19 ^ 63) ^ (177 ^ 148)) & (((128 ^ 189) ^ (128 ^ 180)) ^ (-" ".length()));
        lllIllIIlIll[2] = " ".length();
        lllIllIIlIll[3] = "  ".length();
        lllIllIIlIll[4] = "   ".length();
        lllIllIIlIll[5] = 116 ^ 112;
        lllIllIIlIll[6] = (253 ^ 160) ^ (48 ^ 104);
        lllIllIIlIll[7] = -" ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public void a(c cVar) {
        this.b.put(cVar, Boolean.valueOf((boolean) lllIllIIlIll[2]));
        "".length();
    }

    protected void onStart() {
        this.c.add(this.k);
        "".length();
        this.c.add(this.l);
        "".length();
        this.c.add(this.e);
        "".length();
        b[] bVarArr = new b[lllIllIIlIll[5]];
        bVarArr[lllIllIIlIll[1]] = this.f;
        bVarArr[lllIllIIlIll[2]] = this.g;
        bVarArr[lllIllIIlIll[3]] = this.h;
        bVarArr[lllIllIIlIll[4]] = this.i;
        this.f0m = bVarArr;
        b[] bVarArr2 = this.f0m;
        int length = bVarArr2.length;
        int i = lllIllIIlIll[1];
        while (lIIIllIIllllIlI(i, length)) {
            this.d.register(bVarArr2[i]);
            i++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public boolean b(c cVar) {
        return this.b.getOrDefault(cVar, Boolean.valueOf((boolean) lllIllIIlIll[1])).booleanValue();
    }
}
