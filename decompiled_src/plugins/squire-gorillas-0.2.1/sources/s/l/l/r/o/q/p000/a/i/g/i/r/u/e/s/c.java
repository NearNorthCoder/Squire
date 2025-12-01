package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.rs.api.RSNPCComposition;
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/c.class */
public class c {
    private /* synthetic */ NPC t;
    public static final /* synthetic */ int m;
    private /* synthetic */ int x;
    public static final /* synthetic */ int p;
    private /* synthetic */ boolean E;
    private /* synthetic */ boolean G;
    private /* synthetic */ HeadIcon H;
    private /* synthetic */ boolean z;
    private /* synthetic */ boolean C;
    public static final /* synthetic */ int r;
    public static final /* synthetic */ int n;
    private /* synthetic */ int I;
    private /* synthetic */ WorldArea y;
    private /* synthetic */ Actor B;
    public static final /* synthetic */ d[] l;
    private /* synthetic */ Actor A;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f0s;
    public static final /* synthetic */ int q;
    private static /* synthetic */ int[] llIIlIlIIlII;
    private /* synthetic */ boolean F;
    public static final /* synthetic */ int o;
    private /* synthetic */ List<d> u = Arrays.asList(l);
    private /* synthetic */ int w = llIIlIlIIlII[0];
    private /* synthetic */ int v = llIIlIlIIlII[1];
    private /* synthetic */ int D = llIIlIlIIlII[2];

    public void c(boolean z) {
        this.E = z;
    }

    static {
        lllllIlIlIIIll();
        q = llIIlIlIIlII[4];
        p = llIIlIlIIlII[5];
        r = llIIlIlIIlII[6];
        f0s = llIIlIlIIlII[7];
        n = llIIlIlIIlII[8];
        m = llIIlIlIIlII[9];
        o = llIIlIlIIlII[1];
        d[] dVarArr = new d[llIIlIlIIlII[1]];
        dVarArr[llIIlIlIIlII[3]] = d.MELEE;
        dVarArr[llIIlIlIIlII[10]] = d.RANGED;
        dVarArr[llIIlIlIIlII[11]] = d.MAGIC;
        l = dVarArr;
    }

    public boolean z() {
        return this.G;
    }

    @Inject
    public c(NPC npc) {
        this.t = npc;
    }

    public boolean x() {
        return this.E;
    }

    public void b(boolean z) {
        this.C = z;
    }

    public void b(Actor actor) {
        this.B = actor;
    }

    public WorldArea r() {
        return this.y;
    }

    public void a(List<d> list) {
        this.u = list;
    }

    public int w() {
        return this.D;
    }

    public void a(WorldArea worldArea) {
        this.y = worldArea;
    }

    public HeadIcon A() {
        return this.H;
    }

    public boolean s() {
        return this.z;
    }

    public void f(int i) {
        this.I = i;
    }

    public NPC m() {
        return this.t;
    }

    public Actor t() {
        return this.A;
    }

    private static boolean lllllIlIlIIlII(Object obj) {
        return obj != null;
    }

    public void a(HeadIcon headIcon) {
        this.H = headIcon;
    }

    public Actor u() {
        return this.B;
    }

    public void d(int i) {
        this.x = i;
    }

    public void a(Actor actor) {
        this.A = actor;
    }

    public void e(int i) {
        this.D = i;
    }

    public List<d> n() {
        return this.u;
    }

    public void b(int i) {
        this.v = i;
    }

    public int B() {
        return this.I;
    }

    public void c(int i) {
        this.w = i;
    }

    public boolean y() {
        return this.F;
    }

    public int p() {
        return this.w;
    }

    public HeadIcon l() {
        RSNPCComposition composition = this.t.getComposition();
        if (lllllIlIlIIlII(composition)) {
            return HeadIcon.values()[composition.getRsOverheadIcons()[llIIlIlIIlII[3]]];
        }
        return null;
    }

    private static void lllllIlIlIIIll() {
        llIIlIlIIlII = new int[12];
        llIIlIlIIlII[0] = -((1 ^ 56) ^ (121 ^ 36));
        llIIlIlIIlII[1] = "   ".length();
        llIIlIlIIlII[2] = -" ".length();
        llIIlIlIIlII[3] = ((116 ^ 104) ^ (75 ^ 118)) & (((203 ^ 169) ^ (198 ^ 133)) ^ (-" ".length()));
        llIIlIlIIlII[4] = 29 ^ 27;
        llIIlIlIIlII[5] = 101 ^ 109;
        llIIlIlIIlII[6] = 153 ^ 149;
        llIIlIlIIlII[7] = (251 ^ 162) ^ (249 ^ 169);
        llIIlIlIIlII[8] = 84 ^ 81;
        llIIlIlIIlII[9] = 30 ^ 20;
        llIIlIlIIlII[10] = " ".length();
        llIIlIlIIlII[11] = "  ".length();
    }

    public void a(boolean z) {
        this.z = z;
    }

    public int o() {
        return this.v;
    }

    public void d(boolean z) {
        this.F = z;
    }

    public void e(boolean z) {
        this.G = z;
    }

    public boolean v() {
        return this.C;
    }

    public int q() {
        return this.x;
    }
}
