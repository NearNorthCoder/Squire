package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/f.class */
public class C0057f {
    private static /* synthetic */ List<NPC> I;
    public static final /* synthetic */ int F;
    public static final /* synthetic */ int D;
    private static /* synthetic */ List<NPC> J;
    private static /* synthetic */ WorldPoint H;
    private static /* synthetic */ WorldPoint G;
    private static /* synthetic */ int[] lIllIIlIlII;
    public static final /* synthetic */ List<Integer> E;

    public static void a(List<NPC> list) {
        I = list;
    }

    public static WorldPoint s() {
        return G;
    }

    static {
        lIIlIllIIIIIll();
        D = lIllIIlIlII[0];
        F = lIllIIlIlII[1];
        E = List.of(Integer.valueOf(lIllIIlIlII[2]), Integer.valueOf(lIllIIlIlII[3]));
    }

    public static void b(List<NPC> list) {
        J = list;
    }

    public static WorldPoint t() {
        return H;
    }

    public static List<NPC> u() {
        return I;
    }

    private static void lIIlIllIIIIIll() {
        lIllIIlIlII = new int[4];
        lIllIIlIlII[0] = (-((-2053) & 14967)) & (-16641) & 31735;
        lIllIIlIlII[1] = (-9) & 11741;
        lIllIIlIlII[2] = (-885) & 3071;
        lIllIIlIlII[3] = (-((-6308) & 15591)) & (-21297) & 32767;
    }

    public static void a(WorldPoint worldPoint) {
        G = worldPoint;
    }

    public static List<NPC> v() {
        return J;
    }

    public static void b(WorldPoint worldPoint) {
        H = worldPoint;
    }

    public static void r() {
        G = null;
        H = null;
        I = null;
        J = null;
    }
}
