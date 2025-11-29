/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.construction.tasks;

import net.runelite.api.coords.WorldPoint;

public class aH {
    private  int ae;
    private static  int[] lIlIlIII;
    private  WorldPoint eo;

    public String toString() {
        return "LootTarget(location=" + this.cd() + ", id=" + this.P() + ")";
    }

    private static boolean var1(Object object) {
        return object != null;
    }

    public int P() {
        return this.ae;
    }

    private static void var2() {
        lIlIlIII = new int[4];
        aH.lIlIlIII[0] = 1;
        aH.lIlIlIII[1] = (0x58 ^ 0x74) & ~(0xB9 ^ 0x95);
        aH.lIlIlIII[2] = 0xB ^ 0x30;
        aH.lIlIlIII[3] = 0x15 ^ 0x3E;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    public void i(WorldPoint worldPoint) {
        this.eo = worldPoint;
    }

    public void f(int n2) {
        this.ae = n2;
    }

    public WorldPoint cd() {
        return this.eo;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3 = lIlIlIII[2];
        int n4 = lIlIlIII[0];
        n4 = n4 * lIlIlIII[2] + this.P();
        WorldPoint worldPoint = this.cd();
        int n5 = n4 * lIlIlIII[2];
        if (aH.var5(worldPoint)) {
            n2 = lIlIlIII[3];
            0;
            if (-1 > (0x3F ^ 0x3B)) {
                return (0xF8 ^ 0xAD) & ~(0x47 ^ 0x12);
            }
        } else {
            void var6;
            n2 = var6.hashCode();
        }
        n4 = n5 + n2;
        return n4;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block10: {
            block11: {
                WorldPoint var7;
                WorldPoint var8;
                block9: {
                    aH var9;
                    void var10;
                    if (aH.var3(object, this)) {
                        return lIlIlIII[0];
                    }
                    if (aH.var4(var10 instanceof aH)) {
                        return lIlIlIII[1];
                    }
                    aH var11 = (aH)var10;
                    if (aH.var4(var11.a(var9) ? 1 : 0)) {
                        return lIlIlIII[1];
                    }
                    if (aH.var12(var9.P(), var11.P())) {
                        return lIlIlIII[1];
                    }
                    var8 = var9.cd();
                    var7 = var11.cd();
                    if (!aH.var5(var8)) break block9;
                    if (!aH.var1(var7)) break block10;
                    0;
                    if (2 <= 0) {
                        return ((0xDF ^ 0x9F) & ~(0xD8 ^ 0x98)) != 0;
                    }
                    break block11;
                }
                if (!aH.var4(var8.equals(var7) ? 1 : 0)) break block10;
            }
            return lIlIlIII[1];
        }
        return lIlIlIII[0];
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

    protected boolean a(Object object) {
        return object instanceof aH;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        aH.var2();
    }
}

