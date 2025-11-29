/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.g;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class f {
    public static /* synthetic */ int G;
    public static /* synthetic */ int J;
    public static /* synthetic */ boolean z;
    public static /* synthetic */ boolean y;
    private static final /* synthetic */ Logger x;
    static final /* synthetic */ int L;
    private static /* synthetic */ int[] llIIIlllllll;
    public static /* synthetic */ int D;
    public static /* synthetic */ int K;
    public static /* synthetic */ boolean B;
    public static /* synthetic */ int F;
    public static /* synthetic */ int I;
    public static /* synthetic */ int E;
    public static /* synthetic */ e C;
    public static /* synthetic */ int H;
    public static /* synthetic */ boolean A;

    public static void f(int n2) {
        H = n2;
    }

    public static int s() {
        return G;
    }

    public static void b(int n2) {
        D = n2;
    }

    public static void e(int n2) {
        G = n2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Client client, b b2, Player player) {
        switch (g.M[b2.ordinal()]) {
            case 1: 
            case 2: {
                int n2;
                int lllllllllllllllIlIlIIIIllIlllIIl;
                Client lllllllllllllllIlIlIIIIlllIIIIII;
                void lllllllllllllllIlIlIIIIllIlllllI;
                void lllllllllllllllIlIlIIIIllIllllll;
                int lllllllllllllllIlIlIIIIllIllllIl = llIIIlllllll[2];
                int lllllllllllllllIlIlIIIIllIllllII = llIIIlllllll[2];
                NPC lllllllllllllllIlIlIIIIllIlllIlI = n.b((b)lllllllllllllllIlIlIIIIllIllllll);
                if (!f.llllIllllIIIIl(lllllllllllllllIlIlIIIIllIlllIlI) || !f.llllIllllIIIIl(lllllllllllllllIlIlIIIIllIlllllI)) break;
                int n3 = n.c(lllllllllllllllIlIlIIIIllIlllIlI.getWorldArea().toWorldPointList());
                if (f.llllIllllIIIll(lllllllllllllllIlIlIIIIllIlllIlI.getLocalLocation().distanceTo(lllllllllllllllIlIlIIIIllIlllllI.getLocalLocation()), llIIIlllllll[3])) {
                    lllllllllllllllIlIlIIIIllIllllIl = llIIIlllllll[1];
                }
                if (f.llllIllllIIlII(lllllllllllllllIlIlIIIIllIllllll.equals((Object)b.BLOB) ? 1 : 0)) {
                    lllllllllllllllIlIlIIIIllIlllIIl = lllllllllllllllIlIlIIIIlllIIIIII.getTickCount() - f.w();
                    "".length();
                    if (((0x4E ^ 0x5F) & ~(0x28 ^ 0x39)) < 0) {
                        return ((0x3E ^ 0x5E) & ~(0x3D ^ 0x5D)) != 0;
                    }
                } else {
                    lllllllllllllllIlIlIIIIllIlllIIl = lllllllllllllllIlIlIIIIlllIIIIII.getTickCount() - f.r();
                }
                if (f.llllIllllIIlIl(lllllllllllllllIlIlIIIIllIlllIIl, llIIIlllllll[4])) {
                    lllllllllllllllIlIlIIIIllIllllII = llIIIlllllll[1];
                }
                if (f.llllIllllIIlII(lllllllllllllllIlIlIIIIllIllllIl) && f.llllIllllIIlII(lllllllllllllllIlIlIIIIllIllllII) && f.llllIllllIIlII(n3)) {
                    n2 = llIIIlllllll[1];
                    "".length();
                    if ("  ".length() < 0) {
                        return ((72 + 183 - 83 + 19 ^ 91 + 38 - 65 + 85) & (14 + 44 - 21 + 107 ^ 127 + 58 - 59 + 60 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIIIlllllll[2];
                }
                return n2 != 0;
            }
            case 3: {
                boolean bl;
                Client lllllllllllllllIlIlIIIIlllIIIIII;
                void lllllllllllllllIlIlIIIIllIlllllI;
                void lllllllllllllllIlIlIIIIllIllllll;
                NPC lllllllllllllllIlIlIIIIllIlllIIl = n.b((b)lllllllllllllllIlIlIIIIllIllllll);
                if (!f.llllIllllIIIIl(lllllllllllllllIlIlIIIIllIlllIIl) || !f.llllIllllIIIIl(lllllllllllllllIlIlIIIIllIlllllI)) break;
                if (f.llllIlllIlllII(lllllllllllllllIlIlIIIIllIlllIIl.getId(), llIIIlllllll[5])) {
                    boolean bl2;
                    if (f.llllIllllIIlIl(lllllllllllllllIlIlIIIIlllIIIIII.getTickCount() - f.u(), llIIIlllllll[4])) {
                        bl2 = llIIIlllllll[1];
                        "".length();
                        if (" ".length() <= 0) {
                            return ((174 + 185 - 170 + 2 ^ 126 + 16 - -19 + 16) & (66 + 3 - 4 + 64 ^ 91 + 41 - 121 + 132 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl2 = llIIIlllllll[2];
                    }
                    return bl2;
                }
                if (f.llllIllllIIlIl(lllllllllllllllIlIlIIIIlllIIIIII.getTickCount() - f.u(), llIIIlllllll[4])) {
                    bl = llIIIlllllll[1];
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return ((0x40 ^ 0x70) & ~(0x8C ^ 0xBC)) != 0;
                    }
                } else {
                    bl = llIIIlllllll[2];
                }
                return bl;
            }
            case 4: {
                boolean bl;
                Client lllllllllllllllIlIlIIIIlllIIIIII;
                void lllllllllllllllIlIlIIIIllIlllllI;
                void lllllllllllllllIlIlIIIIllIllllll;
                NPC lllllllllllllllIlIlIIIIllIlllIII = n.b((b)lllllllllllllllIlIlIIIIllIllllll);
                if (!f.llllIllllIIIIl(lllllllllllllllIlIlIIIIllIlllIII) || !f.llllIllllIIIIl(lllllllllllllllIlIlIIIIllIlllllI)) break;
                if (f.llllIllllIIlIl(lllllllllllllllIlIlIIIIlllIIIIII.getTickCount() - f.t(), llIIIlllllll[4])) {
                    bl = llIIIlllllll[1];
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0x73 ^ 0x5A) & ~(2 ^ 0x2B)) != 0;
                    }
                } else {
                    bl = llIIIlllllll[2];
                }
                return bl;
            }
        }
        return llIIIlllllll[2];
    }

    public static boolean k() {
        return y;
    }

    private static boolean llllIllllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    public static int r() {
        return F;
    }

    public static void h(int n2) {
        J = n2;
    }

    public static boolean l() {
        return z;
    }

    public static int v() {
        return J;
    }

    public static void a(e e2) {
        C = e2;
    }

    public static boolean n() {
        return B;
    }

    public static void d(int n2) {
        F = n2;
    }

    public static void i(int n2) {
        K = n2;
    }

    public static void b(boolean bl) {
        z = bl;
    }

    public static e o() {
        return C;
    }

    public static void c(boolean bl) {
        A = bl;
    }

    public static void d(boolean bl) {
        B = bl;
    }

    public boolean j() {
        boolean bl;
        if (f.llllIlllIlllII(Players.getLocal().getWorldLocation().getRegionID(), llIIIlllllll[0])) {
            bl = llIIIlllllll[1];
            "".length();
            if (null != null) {
                return ((0x1D ^ 0x4F ^ (0xA ^ 0x77)) & (0x43 ^ 0x7A ^ (0x4F ^ 0x59) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIIlllllll[2];
        }
        return bl;
    }

    private static boolean llllIllllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIllllIIIIl(Object object) {
        return object != null;
    }

    public static int q() {
        return E;
    }

    private static boolean llllIllllIIlII(int n2) {
        return n2 != 0;
    }

    static {
        f.llllIlllIllIlI();
        L = llIIIlllllll[0];
        x = LoggerFactory.getLogger(f.class);
        y = llIIIlllllll[2];
        z = llIIIlllllll[2];
        A = llIIIlllllll[2];
    }

    private static boolean llllIlllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    public static int p() {
        return D;
    }

    public static void g(int n2) {
        I = n2;
    }

    public static int u() {
        return I;
    }

    public static void a(boolean bl) {
        y = bl;
    }

    private static void llllIlllIllIlI() {
        llIIIlllllll = new int[6];
        f.llIIIlllllll[0] = 0xFFFFEAFF & 0x7D0D;
        f.llIIIlllllll[1] = " ".length();
        f.llIIIlllllll[2] = (0x4F ^ 0x43) & ~(0x9A ^ 0x96);
        f.llIIIlllllll[3] = -(0xFFFFDF49 & 0x6CB7) & (0xFFFFFFFF & 0x4DFE);
        f.llIIIlllllll[4] = "   ".length();
        f.llIIIlllllll[5] = 0xFFFFBE31 & 0x4DFF;
    }

    public static int w() {
        return K;
    }

    public static int t() {
        return H;
    }

    public static void c(int n2) {
        E = n2;
    }

    public static boolean m() {
        return A;
    }
}

