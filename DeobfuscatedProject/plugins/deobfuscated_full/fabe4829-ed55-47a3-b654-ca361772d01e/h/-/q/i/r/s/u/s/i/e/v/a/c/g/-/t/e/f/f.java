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
                int var3;
                Client var4;
                void var7;
                void var6;
                int var5 = llIIIlllllll[2];
                int var8 = llIIIlllllll[2];
                NPC var2 = n.b((b)var6);
                if (!f.llllIllllIIIIl(var2) || !f.llllIllllIIIIl(var7)) break;
                int n3 = n.c(var2.getWorldArea().toWorldPointList());
                if (f.llllIllllIIIll(var2.getLocalLocation().distanceTo(var7.getLocalLocation()), llIIIlllllll[3])) {
                    var5 = llIIIlllllll[1];
                }
                if (f.llllIllllIIlII(var6.equals((Object)b.BLOB) ? 1 : 0)) {
                    var3 = var4.getTickCount() - f.w();
                    0;
                    if (((0x4E ^ 0x5F) & ~(0x28 ^ 0x39)) < 0) {
                        return false;
                    }
                } else {
                    var3 = var4.getTickCount() - f.r();
                }
                if (f.llllIllllIIlIl(var3, llIIIlllllll[4])) {
                    var8 = llIIIlllllll[1];
                }
                if (f.llllIllllIIlII(var5) && f.llllIllllIIlII(var8) && f.llllIllllIIlII(n3)) {
                    n2 = llIIIlllllll[1];
                    0;
                    if (2 < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIlllllll[2];
                }
                return n2 != 0;
            }
            case 3: {
                boolean bl;
                Client var4;
                void var7;
                void var6;
                NPC var3 = n.b((b)var6);
                if (!f.llllIllllIIIIl(var3) || !f.llllIllllIIIIl(var7)) break;
                if (f.llllIlllIlllII(var3.getId(), llIIIlllllll[5])) {
                    boolean bl2;
                    if (f.llllIllllIIlIl(var4.getTickCount() - f.u(), llIIIlllllll[4])) {
                        bl2 = llIIIlllllll[1];
                        0;
                        if (1 <= 0) {
                            return false;
                        }
                    } else {
                        bl2 = llIIIlllllll[2];
                    }
                    return bl2;
                }
                if (f.llllIllllIIlIl(var4.getTickCount() - f.u(), llIIIlllllll[4])) {
                    bl = llIIIlllllll[1];
                    0;
                    if (1 > 2) {
                        return false;
                    }
                } else {
                    bl = llIIIlllllll[2];
                }
                return bl;
            }
            case 4: {
                boolean bl;
                Client var4;
                void var7;
                void var6;
                NPC var1 = n.b((b)var6);
                if (!f.llllIllllIIIIl(var1) || !f.llllIllllIIIIl(var7)) break;
                if (f.llllIllllIIlIl(var4.getTickCount() - f.t(), llIIIlllllll[4])) {
                    bl = llIIIlllllll[1];
                    0;
                    if (2 < 0) {
                        return false;
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
            0;
            
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
        f.llIIIlllllll[1] = 1;
        f.llIIIlllllll[2] = (0x4F ^ 0x43) & ~(0x9A ^ 0x96);
        f.llIIIlllllll[3] = -(0xFFFFDF49 & 0x6CB7) & (0xFFFFFFFF & 0x4DFE);
        f.llIIIlllllll[4] = 3;
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

