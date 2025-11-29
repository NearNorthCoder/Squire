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
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum;
import gg.squire.minigames.tasks.GameEnum11;
import gg.squire.minigames.tasks.GHelper;
import gg.squire.minigames.tasks.NHelper;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FHelper {
    public static  int G;
    public static  int J;
    public static  boolean z;
    public static  boolean y;
    private static final  Logger x;
    static final  int L;
    
    public static  int D;
    public static  int K;
    public static  boolean B;
    public static  int F;
    public static  int I;
    public static  int E;
    public static  e C;
    public static  int H;
    public static  boolean A;

    public static void FHelper(int n2) {
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
                int var1;
                Client var2;
                void var3;
                void var4;
                int var5 = llIIIlllllll[2];
                int var6 = llIIIlllllll[2];
                NPC var7 = n.b((GameEnum) ar4);
                if (!f.llllIllllIIIIl(var7) || !f.llllIllllIIIIl(var3)) break;
                int n3 = n.c(var7.getWorldArea().toWorldPointList());
                if (f.llllIllllIIIll(var7.getLocalLocation().distanceTo(var3.getLocalLocation()), llIIIlllllll[3])) {
                    var5 = llIIIlllllll[1];
                }
                if (f.llllIllllIIlII(var4.equals((Object)b.BLOB) ? 1 : 0)) {
                    var1 = var2.getTickCount() - f.w();

                    if (((0x4E ^ 0x5F) & ~(0x28 ^ 0x39)) < 0) {
                        return false;
                    }
                } else {
                    var1 = var2.getTickCount() - f.r();
                }
                if (f.llllIllllIIlIl(var1, llIIIlllllll[4])) {
                    var6 = llIIIlllllll[1];
                }
                if (f.llllIllllIIlII(var5) && f.llllIllllIIlII(var6) && f.llllIllllIIlII(n3)) {
                    n2 = llIIIlllllll[1];

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
                Client var2;
                void var3;
                void var4;
                NPC var1 = n.b((GameEnum) ar4);
                if (!f.llllIllllIIIIl(var1) || !f.llllIllllIIIIl(var3)) break;
                if (f.llllIlllIlllII(var1.getId(), llIIIlllllll[5])) {
                    boolean bl2;
                    if (f.llllIllllIIlIl(var2.getTickCount() - f.u(), llIIIlllllll[4])) {
                        bl2 = llIIIlllllll[1];

                        if (1 <= 0) {
                            return false;
                        }
                    } else {
                        bl2 = llIIIlllllll[2];
                    }
                    return bl2;
                }
                if (f.llllIllllIIlIl(var2.getTickCount() - f.u(), llIIIlllllll[4])) {
                    bl = llIIIlllllll[1];

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
                Client var2;
                void var3;
                void var4;
                NPC var8 = n.b((GameEnum) ar4);
                if (!f.llllIllllIIIIl(var8) || !f.llllIllllIIIIl(var3)) break;
                if (f.llllIllllIIlIl(var2.getTickCount() - f.t(), llIIIlllllll[4])) {
                    bl = llIIIlllllll[1];

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
        x = LoggerFactory.getLogger(FHelper.class);
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

