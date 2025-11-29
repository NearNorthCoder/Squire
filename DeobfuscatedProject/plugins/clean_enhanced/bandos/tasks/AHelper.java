/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.bandos.tasks;

import net.runelite.api.NPC;

public class AHelper {
    
    public static final  int f;
    private final  NPC g;

    public boolean AHelper() {
        int n2;
        if (a.var2(this.g) && a.var3(this.g.isDead() ? 1 : 0) && a.var4(this.g.getAnimation(), var1[0])) {
            n2 = var1[1];
            0;
            if null != null {
                return ((0xF4 ^ 0xA6) & ~(0x3C ^ 0x6E)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    public AHelper(NPC nPC) {
        this.g = nPC;
    }

    private static void var5() {
        var1 = new int[3];
        a.var1[0] = -(0xFFFFEFD9 & 0x54B7) & (0xFFFFFFFD & 0x5FFE);
        a.var1[1] = 1;
        a.var1[2] = (0x40 ^ 0x63 ^ (0x22 ^ 6)) & (16 + 23 - 38 + 160 ^ 161 + 44 - 42 + 3 ^ -1);
    }

    public NPC c() {
        return this.g;
    }

    static {
        a.var5();
        f = var1[0];
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    public boolean b() {
        int n2;
        if (a.var2(this.g) && (!a.var3(this.g.isDead() ? 1 : 0) || a.var6(this.g.getAnimation(), var1[0]))) {
            n2 = var1[1];
            0;
            if (3 < 0) {
                return ((0 + 33 - -21 + 74 ^ 53 + 61 - 47 + 126) & (144 + 40 - 117 + 129 ^ 107 + 71 - 116 + 71 ^ -1)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }
}

