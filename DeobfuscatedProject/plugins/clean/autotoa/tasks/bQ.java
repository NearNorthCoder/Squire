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

    private static boolean lIIlIllllllIII(int n2, int n3) {
        return n2 != n3;
    }

    public bQ(NPC nPC, NPC nPC2, WorldPoint worldPoint, boolean bl2, boolean bl3) {
        this.gZ = nPC;
        this.ha = nPC2;
        this.hb = worldPoint;
        this.hc = bl2;
        this.hd = bl3;
    }

    private static boolean lIIlIllllllIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block26: {
            block27: {
                WorldPoint var1;
                WorldPoint var2;
                block25: {
                    bQ var3;
                    bQ var4;
                    block23: {
                        block24: {
                            NPC var5;
                            NPC var6;
                            block22: {
                                block20: {
                                    block21: {
                                        NPC var7;
                                        NPC var8;
                                        block19: {
                                            void var9;
                                            if (bQ.lIIlIllllllIlI(object, this)) {
                                                return lIllIllIlll[0];
                                            }
                                            if (bQ.lIIlIllllllIll(var9 instanceof bQ)) {
                                                return lIllIllIlll[1];
                                            }
                                            var4 = (bQ)var9;
                                            if (bQ.lIIlIllllllIII(var3.cx() ? 1 : 0, var4.cx() ? 1 : 0)) {
                                                return lIllIllIlll[1];
                                            }
                                            if (bQ.lIIlIllllllIII(var3.cy() ? 1 : 0, var4.cy() ? 1 : 0)) {
                                                return lIllIllIlll[1];
                                            }
                                            var8 = var3.cu();
                                            var7 = var4.cu();
                                            if (!bQ.lIIlIlllllllII(var8)) break block19;
                                            if (!bQ.lIIlIlllllllIl(var7)) break block20;

                                            break block21;
                                        }
                                        if (!bQ.lIIlIllllllIll(var8.equals(var7) ? 1 : 0)) break block20;
                                    }
                                    return lIllIllIlll[1];
                                }
                                var6 = var3.cv();
                                var5 = var4.cv();
                                if (!bQ.lIIlIlllllllII(var6)) break block22;
                                if (!bQ.lIIlIlllllllIl(var5)) break block23;

                                }
                                break block24;
                            }
                            if (!bQ.lIIlIllllllIll(var6.equals(var5) ? 1 : 0)) break block23;
                        }
                        return lIllIllIlll[1];
                    }
                    var2 = var3.cw();
                    var1 = var4.cw();
                    if (!bQ.lIIlIlllllllII(var2)) break block25;
                    if (!bQ.lIIlIlllllllIl(var1)) break block26;

                    if (2 <= 1) {
                        return false;
                    }
                    break block27;
                }
                if (!bQ.lIIlIllllllIll(var2.equals(var1) ? 1 : 0)) break block26;
            }
            return lIllIllIlll[1];
        }
        return lIllIllIlll[0];
    }

    public String toString() {
        return "ClearBoulder.BoulderSolution(boulder=" + String.valueOf(this.cu()) + ", jug=" + String.valueOf(this.cv()) + ", towards=" + String.valueOf(this.cw()) + ", diagonal=" + this.cx() + ", needsAttack=" + this.cy() + ")";
    }

    public boolean cy() {
        return this.hd;
    }

    public WorldPoint ct() {
        bQ var10;
        if (bQ.lIIlIlllllIlll(this.cx() ? 1 : 0)) {
            return this.ha.getWorldLocation().dx((int)Math.signum(this.ha.getWorldX() - this.hb.getWorldX())).dy((int)Math.signum(this.ha.getWorldY() - this.hb.getWorldY()));
        }
        if (!bQ.lIIlIllllllIII(var10.ha.getWorldY(), var10.gZ.getWorldY()) || bQ.lIIlIllllllIIl(var10.ha.getWorldY(), var10.hb.getWorldY())) {
            return var10.ha.getWorldLocation().dx((int)Math.signum(var10.ha.getWorldX() - var10.gZ.getWorldX()));
        }
        return this.ha.getWorldLocation().dy((int)Math.signum(this.ha.getWorldY() - this.gZ.getWorldY()));
    }

    private static boolean lIIlIllllllIIl(int n2, int n3) {
        return n2 == n3;
    }

    public boolean cx() {
        return this.hc;
    }

    public NPC cv() {
        return this.ha;
    }

    private static boolean lIIlIlllllllII(Object object) {
        return object == null;
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        bQ var11;
        int n6;
        int n7 = lIllIllIlll[2];
        int n8 = lIllIllIlll[0];
        int n9 = n8 * lIllIllIlll[2];
        if (bQ.lIIlIlllllIlll(this.cx() ? 1 : 0)) {
            n6 = lIllIllIlll[3];

            if (1 == -1) {
                return (0x26 ^ 0x16) & ~(0xBA ^ 0x8A);
            }
        } else {
            n6 = lIllIllIlll[4];
        }
        int var12 = n9 + n6;
        int n10 = var12 * lIllIllIlll[2];
        if (bQ.lIIlIlllllIlll(var11.cy() ? 1 : 0)) {
            n5 = lIllIllIlll[3];

            }
        } else {
            n5 = lIllIllIlll[4];
        }
        var12 = n10 + n5;
        NPC var13 = var11.cu();
        int n11 = var12 * lIllIllIlll[2];
        if (bQ.lIIlIlllllllII(var13)) {
            n4 = lIllIllIlll[5];

            if (-1 >= 2) {
                return (0xB5 ^ 0xB9) & ~(0x83 ^ 0x8F);
            }
        } else {
            n4 = var13.hashCode();
        }
        var12 = n11 + n4;
        NPC var14 = var11.cv();
        int n12 = var12 * lIllIllIlll[2];
        if (bQ.lIIlIlllllllII(var14)) {
            n3 = lIllIllIlll[5];

            if (1 == 0) {
                return (0xAE ^ 0x92) & ~(0x8C ^ 0xB0);
            }
        } else {
            n3 = var14.hashCode();
        }
        var12 = n12 + n3;
        WorldPoint var15 = var11.cw();
        int n13 = var12 * lIllIllIlll[2];
        if (bQ.lIIlIlllllllII(var15)) {
            n2 = lIllIllIlll[5];

            if (((0x2A ^ 0x21) & ~(0xAC ^ 0xA7)) != 0) {
                return (0xF9 ^ 0xB5) & ~(0x33 ^ 0x7F);
            }
        } else {
            n2 = var15.hashCode();
        }
        n8 = n13 + n2;
        return n8;
    }

    static {
        bQ.lIIlIlllllIllI();
    }

    private static boolean lIIlIlllllllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllllIlll(int n2) {
        return n2 != 0;
    }

    public NPC cu() {
        return this.gZ;
    }

    public WorldPoint cw() {
        return this.hb;
    }

    private static boolean lIIlIllllllIll(int n2) {
        return n2 == 0;
    }
}

