/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

public final class bQ_Unknown {
    private static /* synthetic */ int[] lIllIllIlll;
    final /* synthetic */ boolean hd;
    final /* synthetic */ WorldPoint hb;
    final /* synthetic */ NPC ha;
    private final /* synthetic */ boolean hc;
    final /* synthetic */ NPC gZ;

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
                WorldPoint var11;
                WorldPoint var1;
                block25: {
                    bQ var10;
                    bQ var12;
                    block23: {
                        block24: {
                            NPC var3;
                            NPC var14;
                            block22: {
                                block20: {
                                    block21: {
                                        NPC var6;
                                        NPC var4;
                                        block19: {
                                            void var13;
                                            if (bQ.lIIlIllllllIlI(object, this)) {
                                                return lIllIllIlll[0];
                                            }
                                            if (bQ.lIIlIllllllIll(var13 instanceof bQ)) {
                                                return lIllIllIlll[1];
                                            }
                                            var12 = (bQ)var13;
                                            if (bQ.lIIlIllllllIII(var10.cx() ? 1 : 0, var12.cx() ? 1 : 0)) {
                                                return lIllIllIlll[1];
                                            }
                                            if (bQ.lIIlIllllllIII(var10.cy() ? 1 : 0, var12.cy() ? 1 : 0)) {
                                                return lIllIllIlll[1];
                                            }
                                            var4 = var10.cu();
                                            var6 = var12.cu();
                                            if (!bQ.lIIlIlllllllII(var4)) break block19;
                                            if (!bQ.lIIlIlllllllIl(var6)) break block20;
                                            0;
                                            if (-3 >= 0) {
                                                return false;
                                            }
                                            break block21;
                                        }
                                        if (!bQ.lIIlIllllllIll(var4.equals(var6) ? 1 : 0)) break block20;
                                    }
                                    return lIllIllIlll[1];
                                }
                                var14 = var10.cv();
                                var3 = var12.cv();
                                if (!bQ.lIIlIlllllllII(var14)) break block22;
                                if (!bQ.lIIlIlllllllIl(var3)) break block23;
                                0;
                                
                                }
                                break block24;
                            }
                            if (!bQ.lIIlIllllllIll(var14.equals(var3) ? 1 : 0)) break block23;
                        }
                        return lIllIllIlll[1];
                    }
                    var1 = var10.cw();
                    var11 = var12.cw();
                    if (!bQ.lIIlIlllllllII(var1)) break block25;
                    if (!bQ.lIIlIlllllllIl(var11)) break block26;
                    0;
                    if (2 <= 1) {
                        return false;
                    }
                    break block27;
                }
                if (!bQ.lIIlIllllllIll(var1.equals(var11) ? 1 : 0)) break block26;
            }
            return lIllIllIlll[1];
        }
        return lIllIllIlll[0];
    }

    public String toString() {
        return "ClearBoulder.BoulderSolution(boulder=" + String.valueOf(this.cu()) + ", jug=" + String.valueOf(this.cv()) + ", towards=" + String.valueOf(this.cw()) + ", diagonal=" + this.cx() + ", needsAttack=" + this.cy() + ")";
    }

    private static void lIIlIlllllIllI() {
        lIllIllIlll = new int[6];
        bQ.lIllIllIlll[0] = 1;
        bQ.lIllIllIlll[1] = (0x7C ^ 0x6A) & ~(0x34 ^ 0x22);
        bQ.lIllIllIlll[2] = 0x4E ^ 0x75;
        bQ.lIllIllIlll[3] = 0xC ^ 0x43;
        bQ.lIllIllIlll[4] = 50 + 126 - 134 + 85 ^ (0xB6 ^ 0xA8);
        bQ.lIllIllIlll[5] = 0x98 ^ 0xB3;
    }

    public boolean cy() {
        return this.hd;
    }

    public WorldPoint ct() {
        bQ var2;
        if (bQ.lIIlIlllllIlll(this.cx() ? 1 : 0)) {
            return this.ha.getWorldLocation().dx((int)Math.signum(this.ha.getWorldX() - this.hb.getWorldX())).dy((int)Math.signum(this.ha.getWorldY() - this.hb.getWorldY()));
        }
        if (!bQ.lIIlIllllllIII(var2.ha.getWorldY(), var2.gZ.getWorldY()) || bQ.lIIlIllllllIIl(var2.ha.getWorldY(), var2.hb.getWorldY())) {
            return var2.ha.getWorldLocation().dx((int)Math.signum(var2.ha.getWorldX() - var2.gZ.getWorldX()));
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
        bQ var8;
        int n6;
        int n7 = lIllIllIlll[2];
        int n8 = lIllIllIlll[0];
        int n9 = n8 * lIllIllIlll[2];
        if (bQ.lIIlIlllllIlll(this.cx() ? 1 : 0)) {
            n6 = lIllIllIlll[3];
            0;
            if (1 == -1) {
                return (0x26 ^ 0x16) & ~(0xBA ^ 0x8A);
            }
        } else {
            n6 = lIllIllIlll[4];
        }
        int var9 = n9 + n6;
        int n10 = var9 * lIllIllIlll[2];
        if (bQ.lIIlIlllllIlll(var8.cy() ? 1 : 0)) {
            n5 = lIllIllIlll[3];
            0;
            
            }
        } else {
            n5 = lIllIllIlll[4];
        }
        var9 = n10 + n5;
        NPC var7 = var8.cu();
        int n11 = var9 * lIllIllIlll[2];
        if (bQ.lIIlIlllllllII(var7)) {
            n4 = lIllIllIlll[5];
            0;
            if (-1 >= 2) {
                return (0xB5 ^ 0xB9) & ~(0x83 ^ 0x8F);
            }
        } else {
            n4 = var7.hashCode();
        }
        var9 = n11 + n4;
        NPC var5 = var8.cv();
        int n12 = var9 * lIllIllIlll[2];
        if (bQ.lIIlIlllllllII(var5)) {
            n3 = lIllIllIlll[5];
            0;
            if (1 == 0) {
                return (0xAE ^ 0x92) & ~(0x8C ^ 0xB0);
            }
        } else {
            n3 = var5.hashCode();
        }
        var9 = n12 + n3;
        WorldPoint var15 = var8.cw();
        int n13 = var9 * lIllIllIlll[2];
        if (bQ.lIIlIlllllllII(var15)) {
            n2 = lIllIllIlll[5];
            0;
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

