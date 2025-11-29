/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

public class f {
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
        f.lIIlIllIIIIIll();
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
        f.lIllIIlIlII[0] = -(0xFFFFF7FB & 0x3A77) & (0xFFFFBEFF & 0x7BF7);
        f.lIllIIlIlII[1] = 0xFFFFFFF7 & 0x2DDD;
        f.lIllIIlIlII[2] = 0xFFFFFC8B & 0xBFF;
        f.lIllIIlIlII[3] = -(0xFFFFE75C & 0x3CE7) & (0xFFFFACCF & Short.MAX_VALUE);
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

