/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.awt.Color;

public final class BHelper {
    private static final  Color aV;
    private static final  Color aW;
    private static final  Color aU;
    private static  int[] lIllIlIII;
    private static final  Color aT;

    static {
        B.var1();
        aT = new Color(lIllIlIII[4], lIllIlIII[5], lIllIlIII[6], lIllIlIII[7]);
        aU = new Color(lIllIlIII[8], lIllIlIII[8], lIllIlIII[8], lIllIlIII[7]);
        aV = new Color(lIllIlIII[1], lIllIlIII[9], lIllIlIII[8], lIllIlIII[7]);
        aW = new Color(lIllIlIII[10], lIllIlIII[1], lIllIlIII[1], lIllIlIII[7]);
    }

    /*
     * WARNING - void declaration
     */
    public static int a(int n2, int n3, int n4) {
        int n5;
        int var2;
        if (!B.var3(n2) || !B.var4(n3) || B.var5(n4, lIllIlIII[0])) {
            return lIllIlIII[0];
        }
        int var6 = lIllIlIII[1];
        if (B.var4(var2)) {
            void var7;
            void var8;
            void var9;
            int var10 = lIllIlIII[2];
            if (B.var11((int)var9, lIllIlIII[2])) {
                if (B.var11(var2, lIllIlIII[2])) {
                    var10 = (var8 * (var2 - lIllIlIII[2]) + var9 - lIllIlIII[3]) / (var9 - lIllIlIII[2]);
                }
                if (B.var11((int)(var7 = (var8 * var2 - lIllIlIII[2]) / (var9 - lIllIlIII[2])), (int)var8)) {
                    var7 = var8;
                    0;
                    if null != null {
                        return (0x2E ^ 0x4C) & ~(0xC8 ^ 0xAA);
                    }
                }
            } else {
                var7 = var8;
            }
            n5 = (var10 + var7 + lIllIlIII[2]) / lIllIlIII[3];
        }
        return n5;
    }

    private static boolean var3(int n2) {
        return n2 >= 0;
    }

    private static void var1() {
        lIllIlIII = new int[11];
        B.lIllIlIII[0] = -1;
        B.lIllIlIII[1] = (0x8C ^ 0x96) & ~(0x72 ^ 0x68);
        B.lIllIlIII[2] = 1;
        B.lIllIlIII[3] = 2;
        B.lIllIlIII[4] = 231 + 57 - 224 + 180 ^ 14 + 78 - -84 + 2;
        B.lIllIlIII[5] = 0xD2 ^ 0x9E ^ (0xE6 ^ 0x97);
        B.lIllIlIII[6] = 0x15 ^ 0x27;
        B.lIllIlIII[7] = 75 + 219 - 196 + 127;
        B.lIllIlIII[8] = 203 + 226 - 336 + 162;
        B.lIllIlIII[9] = 13 + 134 - -22 + 16 ^ 83 + 91 - 8 + 16;
        B.lIllIlIII[10] = 1 ^ 0x53;
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2) {
        return n2 > 0;
    }

    private BHelper() {
    }
}

