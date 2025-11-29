/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

public final class bQ {
    
    final  boolean hd;
    final  WorldPoint hb;
    final  NPC ha;
    private final  boolean hc;
    final  NPC gZ;

    private static boolean var2(int n2, int n3) {
        return n2 != n3;
    }

    public bQ(NPC nPC, NPC nPC2, WorldPoint worldPoint, boolean bl2, boolean bl3) {
        this.gZ = nPC;
        this.ha = nPC2;
        this.hb = worldPoint;
        this.hc = bl2;
        this.hd = bl3;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block26: {
            block27: {
                WorldPoint var4;
                WorldPoint var5;
                block25: {
                    bQ var6;
                    bQ var7;
                    block23: {
                        block24: {
                            NPC var8;
                            NPC var9;
                            block22: {
                                block20: {
                                    block21: {
                                        NPC var10;
                                        NPC var11;
                                        block19: {
                                            void var12;
                                            if (bQ.var3(object, this)) {
                                                return var1[0];
                                            }
                                            if (bQ.var13(var12 instanceof bQ)) {
                                                return var1[1];
                                            }
                                            var7 = (bQ)var12;
                                            if (bQ.var2(var6.cx() ? 1 : 0, var7.cx() ? 1 : 0)) {
                                                return var1[1];
                                            }
                                            if (bQ.var2(var6.cy() ? 1 : 0, var7.cy() ? 1 : 0)) {
                                                return var1[1];
                                            }
                                            var11 = var6.cu();
                                            var10 = var7.cu();
                                            if (!bQ.var14(var11)) break block19;
                                            if (!bQ.var15(var10)) break block20;
                                            0;
                                            if (-3 >= 0) {
                                                return ((71 + 2 - -16 + 52 ^ 51 + 86 - -2 + 29) & (0x37 ^ 0x13 ^ 1 ^ -1)) != 0;
                                            }
                                            break block21;
                                        }
                                        if (!bQ.var13(var11.equals(var10) ? 1 : 0)) break block20;
                                    }
                                    return var1[1];
                                }
                                var9 = var6.cv();
                                var8 = var7.cv();
                                if (!bQ.var14(var9)) break block22;
                                if (!bQ.var15(var8)) break block23;
                                0;
                                if null != null {
                                    return ((5 ^ 0x52) & ~(0xD0 ^ 0x87)) != 0;
                                }
                                break block24;
                            }
                            if (!bQ.var13(var9.equals(var8) ? 1 : 0)) break block23;
                        }
                        return var1[1];
                    }
                    var5 = var6.cw();
                    var4 = var7.cw();
                    if (!bQ.var14(var5)) break block25;
                    if (!bQ.var15(var4)) break block26;
                    0;
                    if (2 <= 1) {
                        return ((0xA5 ^ 0x99) & ~(0x26 ^ 0x1A)) != 0;
                    }
                    break block27;
                }
                if (!bQ.var13(var5.equals(var4) ? 1 : 0)) break block26;
            }
            return var1[1];
        }
        return var1[0];
    }

    public String toString() {
        return "ClearBoulder.BoulderSolution(boulder=" + String.valueOf(this.cu()) + ", jug=" + String.valueOf(this.cv()) + ", towards=" + String.valueOf(this.cw()) + ", diagonal=" + this.cx() + ", needsAttack=" + this.cy() + ")";
    }

    private static void var16() {
        var1 = new int[6];
        bQ.var1[0] = 1;
        bQ.var1[1] = (0x7C ^ 0x6A) & ~(0x34 ^ 0x22);
        bQ.var1[2] = 0x4E ^ 0x75;
        bQ.var1[3] = 0xC ^ 0x43;
        bQ.var1[4] = 50 + 126 - 134 + 85 ^ (0xB6 ^ 0xA8);
        bQ.var1[5] = 0x98 ^ 0xB3;
    }

    public boolean cy() {
        return this.hd;
    }

    public WorldPoint ct() {
        bQ var17;
        if (bQ.var18(this.cx() ? 1 : 0)) {
            return this.ha.getWorldLocation().dx((int)Math.signum(this.ha.getWorldX() - this.hb.getWorldX())).dy((int)Math.signum(this.ha.getWorldY() - this.hb.getWorldY()));
        }
        if (!bQ.var2(var17.ha.getWorldY(), var17.gZ.getWorldY()) || bQ.var19(var17.ha.getWorldY(), var17.hb.getWorldY())) {
            return var17.ha.getWorldLocation().dx((int)Math.signum(var17.ha.getWorldX() - var17.gZ.getWorldX()));
        }
        return this.ha.getWorldLocation().dy((int)Math.signum(this.ha.getWorldY() - this.gZ.getWorldY()));
    }

    private static boolean var19(int n2, int n3) {
        return n2 == n3;
    }

    public boolean cx() {
        return this.hc;
    }

    public NPC cv() {
        return this.ha;
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        bQ var20;
        int n6;
        int n7 = var1[2];
        int n8 = var1[0];
        int n9 = n8 * var1[2];
        if (bQ.var18(this.cx() ? 1 : 0)) {
            n6 = var1[3];
            0;
            if (1 == -1) {
                return (0x26 ^ 0x16) & ~(0xBA ^ 0x8A);
            }
        } else {
            n6 = var1[4];
        }
        int var21 = n9 + n6;
        int n10 = var21 * var1[2];
        if (bQ.var18(var20.cy() ? 1 : 0)) {
            n5 = var1[3];
            0;
            if null != null {
                return 3 & (3 ^ -1);
            }
        } else {
            n5 = var1[4];
        }
        var21 = n10 + n5;
        NPC var22 = var20.cu();
        int n11 = var21 * var1[2];
        if (bQ.var14(var22)) {
            n4 = var1[5];
            0;
            if (-1 >= 2) {
                return (0xB5 ^ 0xB9) & ~(0x83 ^ 0x8F);
            }
        } else {
            n4 = var22.hashCode();
        }
        var21 = n11 + n4;
        NPC var23 = var20.cv();
        int n12 = var21 * var1[2];
        if (bQ.var14(var23)) {
            n3 = var1[5];
            0;
            
        } else {
            n3 = var23.hashCode();
        }
        var21 = n12 + n3;
        WorldPoint var24 = var20.cw();
        int n13 = var21 * var1[2];
        if (bQ.var14(var24)) {
            n2 = var1[5];
            0;
            if (((0x2A ^ 0x21) & ~(0xAC ^ 0xA7)) != 0) {
                return (0xF9 ^ 0xB5) & ~(0x33 ^ 0x7F);
            }
        } else {
            n2 = var24.hashCode();
        }
        n8 = n13 + n2;
        return n8;
    }

    static {
        bQ.var16();
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    public NPC cu() {
        return this.gZ;
    }

    public WorldPoint cw() {
        return this.hb;
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }
}

