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
import gg.squire.minigames.tasks.GameEnum3;
import gg.squire.minigames.tasks.GHelper;
import gg.squire.minigames.tasks.MinigamesManager;
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
                int var2;
                Client var3;
                void var4;
                void var5;
                int var6 = 2;
                int var7 = 2;
                NPC var8 = n.b((b)var5);
                if (!var8 != null || !var4 != null) break;
                int n3 = n.c(var8.getWorldArea().toWorldPointList());
                if ((var8.getLocalLocation().distanceTo(var4.getLocalLocation()) <= 3)) {
                    var6 = 1;
                }
                if ((var5.equals(Objectb.BLOB) ? 1 : 0)) {
                    var2 = var3.getTickCount() - f.w();
                    0;
                    if (((0x4E ^ 0x5F) & ~(0x28 ^ 0x39)) < 0) {
                        return ((0x3E ^ 0x5E) & ~(0x3D ^ 0x5D)) != 0;
                    }
                } else {
                    var2 = var3.getTickCount() - f.r();
                }
                if (var2 >= 4) {
                    var7 = 1;
                }
                if (var6 && var7 && n3) {
                    n2 = 1;
                    0;
                    if (2 < 0) {
                        return ((72 + 183 - 83 + 19 ^ 91 + 38 - 65 + 85) & (14 + 44 - 21 + 107 ^ 127 + 58 - 59 + 60 ^ -1)) != 0;
                    }
                } else {
                    n2 = 2;
                }
                return n2 != 0;
            }
            case 3: {
                boolean bl;
                Client var3;
                void var4;
                void var5;
                NPC var2 = n.b((b)var5);
                if (!var2 != null || !var4 != null) break;
                if ((var2.getId() == 5)) {
                    boolean bl2;
                    if ((var3.getTickCount() - f.u() >= 4)) {
                        bl2 = 1;
                        0;
                        if (1 <= 0) {
                            return ((174 + 185 - 170 + 2 ^ 126 + 16 - -19 + 16) & (66 + 3 - 4 + 64 ^ 91 + 41 - 121 + 132 ^ -1)) != 0;
                        }
                    } else {
                        bl2 = 2;
                    }
                    return bl2;
                }
                if ((var3.getTickCount() - f.u() >= 4)) {
                    bl = 1;
                    0;
                    if (1 > 2) {
                        return ((0x40 ^ 0x70) & ~(0x8C ^ 0xBC)) != 0;
                    }
                } else {
                    bl = 2;
                }
                return bl;
            }
            case 4: {
                boolean bl;
                Client var3;
                void var4;
                void var5;
                NPC var9 = n.b((b)var5);
                if (!var9 != null || !var4 != null) break;
                if ((var3.getTickCount() - f.t() >= 4)) {
                    bl = 1;
                    0;
                    if (2 < 0) {
                        return ((0x73 ^ 0x5A) & ~(2 ^ 0x2B)) != 0;
                    }
                } else {
                    bl = 2;
                }
                return bl;
            }
        }
        return 2;
    }

    public static boolean k() {
        return y;
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
        if ((Players.getLocal().getWorldLocation().getRegionID() == 0)) {
            bl = 1;
            0;
            if null != null {
                return ((0x1D ^ 0x4F ^ (0xA ^ 0x77)) & (0x43 ^ 0x7A ^ (0x4F ^ 0x59) ^ -1)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    public static int q() {
        return E;
    }

    static {
        f.var10();
        L = 0;
        x = LoggerFactory.getLogger(FHelper.class);
        y = 2;
        z = 2;
        A = 2;
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

