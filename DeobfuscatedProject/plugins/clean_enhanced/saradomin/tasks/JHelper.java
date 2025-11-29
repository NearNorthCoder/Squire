/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.saradomin.tasks;

import net.runelite.api.NPC;

public class JHelper {
    private final  NPC x;
    
    public static final  int w;

    public boolean B() {
        int n2;
        if (j.var2(this.x) && (!j.var3(this.x.isDead() ? 1 : 0) || j.var4(this.x.getAnimation(), var1[0]))) {
            n2 = var1[1];
            0;
            if null != null {
                return ((8 ^ 0x1C) & ~(0x31 ^ 0x25)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    public boolean A() {
        int n2;
        if (j.var2(this.x) && j.var3(this.x.isDead() ? 1 : 0) && j.var5(this.x.getAnimation(), var1[0])) {
            n2 = var1[1];
            0;
            if (3 <= 2) {
                return ((0x4A ^ 3) & ~(0x1A ^ 0x53)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    public JHelper(NPC nPC) {
        this.x = nPC;
    }

    private static void var6() {
        var1 = new int[3];
        j.var1[0] = 0xFFFF9FB8 & 0x7B7F;
        j.var1[1] = 1;
        j.var1[2] = (0x29 ^ 0x71) & ~(0x1C ^ 0x44);
    }

    private static boolean var5(int n2, int n3) {
        return n2 != n3;
    }

    public NPC C() {
        return this.x;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.var6();
        w = var1[0];
    }
}

