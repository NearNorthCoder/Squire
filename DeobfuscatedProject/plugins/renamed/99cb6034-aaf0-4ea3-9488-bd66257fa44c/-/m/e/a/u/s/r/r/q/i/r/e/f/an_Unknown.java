/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.game.Vars
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.ao_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;
import net.unethicalite.api.game.Vars;

public final class an_Unknown {
    private final /* synthetic */ n bD;
    private final /* synthetic */ int bE;
    private static /* synthetic */ int[] llIIIIIIllII;
    private final /* synthetic */ au bC;

    public an(au au2, n n2, int n3) {
        this.bC = au2;
        this.bD = n2;
        this.bE = n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block17: {
            block18: {
                n var11;
                n var2;
                block16: {
                    an var1;
                    an var14;
                    block14: {
                        block15: {
                            au var6;
                            au var7;
                            block13: {
                                void var15;
                                if (an.llllIIIlIIlIII(object, this)) {
                                    return llIIIIIIllII[2];
                                }
                                if (an.llllIIIlIIlIlI(var15 instanceof an)) {
                                    return llIIIIIIllII[0];
                                }
                                var14 = (an)var15;
                                if (an.llllIIIlIIllII(var1.bb(), var14.bb())) {
                                    return llIIIIIIllII[0];
                                }
                                var7 = var1.aY();
                                var6 = var14.aY();
                                if (!an.llllIIIlIIllIl((Object)var7)) break block13;
                                if (!an.llllIIIlIIlllI((Object)var6)) break block14;
                                0;
                                if (3 <= 0) {
                                    return false;
                                }
                                break block15;
                            }
                            if (!an.llllIIIlIIlIlI(((Object)((Object)var7)).equals((Object)var6) ? 1 : 0)) break block14;
                        }
                        return llIIIIIIllII[0];
                    }
                    var2 = var1.aZ();
                    var11 = var14.aZ();
                    if (!an.llllIIIlIIllIl((Object)var2)) break block16;
                    if (!an.llllIIIlIIlllI((Object)var11)) break block17;
                    0;
                    if ((0x9E ^ 0x9A) <= 0) {
                        return false;
                    }
                    break block18;
                }
                if (!an.llllIIIlIIlIlI(((Object)((Object)var2)).equals((Object)var11) ? 1 : 0)) break block17;
            }
            return llIIIIIIllII[0];
        }
        return llIIIIIIllII[2];
    }

    private static boolean llllIIIlIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean llllIIIlIIlIIl(int n2) {
        return n2 > 0;
    }

    private static void llllIIIlIIIllI() {
        llIIIIIIllII = new int[5];
        an.llIIIIIIllII[0] = (0x73 ^ 0x24) & ~(0xF8 ^ 0xAF);
        an.llIIIIIIllII[1] = 0xFFFFF5BD & 0x1FF7;
        an.llIIIIIIllII[2] = 1;
        an.llIIIIIIllII[3] = 0xC ^ 0x4D ^ (0x5E ^ 0x24);
        an.llIIIIIIllII[4] = 0x57 ^ 6 ^ (0xD7 ^ 0xAD);
    }

    private static boolean llllIIIlIIlIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        an var4;
        int n3;
        int n4 = llIIIIIIllII[3];
        int n5 = llIIIIIIllII[2];
        n5 = n5 * llIIIIIIllII[3] + this.bb();
        au au2 = this.aY();
        int n6 = n5 * llIIIIIIllII[3];
        if (an.llllIIIlIIllIl((Object)au2)) {
            n3 = llIIIIIIllII[4];
            0;
            if (((0xCF ^ 0x99) & ~(0x56 ^ 0)) >= 3) {
                return (0x9B ^ 0x87) & ~(0x62 ^ 0x7E);
            }
        } else {
            void var8;
            n3 = var8.hashCode();
        }
        int var3 = n6 + n3;
        n var5 = var4.aZ();
        int n7 = var3 * llIIIIIIllII[3];
        if (an.llllIIIlIIllIl((Object)var5)) {
            n2 = llIIIIIIllII[4];
            0;
            if (1 >= 3) {
                return (0x62 ^ 0x76) & ~(6 ^ 0x12);
            }
        } else {
            n2 = ((Object)((Object)var5)).hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    public int bc() {
        int n2;
        an var9;
        if (!an.llllIIIlIIIlll((Object)this.bD, (Object)n.HARVESTABLE) || an.llllIIIlIIlIII((Object)this.bD, (Object)n.FILLING)) {
            n2 = var9.bC.bk();
            0;
            if (2 < 0) {
                return (0x6A ^ 0x7B ^ 2) & ((0x78 ^ 0x66) & ~(0x4E ^ 0x50) ^ (0xA ^ 0x19) ^ -1);
            }
        } else {
            n2 = var9.bC.bc();
        }
        return n2;
    }

    private static boolean llllIIIlIIllII(int n2, int n3) {
        return n2 != n3;
    }

    static {
        an.llllIIIlIIIllI();
    }

    private static boolean llllIIIlIIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIIIlIIlIII(Object object, Object object2) {
        return object == object2;
    }

    public boolean be() {
        boolean bl;
        an var13;
        int var12;
        int n2;
        if (an.llllIIIlIIlIIl(Vars.getBit((int)llIIIIIIllII[1]))) {
            n2 = llIIIIIIllII[2];
            0;
            
            }
        } else {
            n2 = var12 = llIIIIIIllII[0];
        }
        if (!an.llllIIIlIIIlll((Object)var13.bD, (Object)n.EMPTY) || an.llllIIIlIIlIlI(var13.bE) && !an.llllIIIlIIIlll((Object)var13.bC, (Object)au.WEEDS) || an.llllIIIlIIlIII((Object)var13.bC, (Object)au.WEEDS) && an.llllIIIlIIlIll(var12)) {
            bl = llIIIIIIllII[2];
            0;
            if ((0xCD ^ 0xAE ^ (0xDE ^ 0xB9)) <= -1) {
                return ((0x7A ^ 0x6B ^ (0xEE ^ 0xC1)) & (91 + 100 - 106 + 96 ^ 106 + 37 - 13 + 9 ^ -1)) != 0;
            }
        } else {
            bl = llIIIIIIllII[0];
        }
        return bl;
    }

    public n aZ() {
        return this.bD;
    }

    public au aY() {
        return this.bC;
    }

    private static boolean llllIIIlIIllIl(Object object) {
        return object == null;
    }

    public String toString() {
        return "PatchState(produce=" + String.valueOf((Object)this.aY()) + ", cropState=" + String.valueOf((Object)this.aZ()) + ", stage=" + this.bb() + ")";
    }

    public int bd() {
        switch (ao.bF[this.bD.ordinal()]) {
            case 1: {
                an var10;
                return var10.bC.bj();
            }
            case 2: {
                an var10;
                return var10.bC.bi();
            }
        }
        return llIIIIIIllII[0];
    }

    public int bb() {
        return this.bE;
    }

    private static boolean llllIIIlIIlllI(Object object) {
        return object != null;
    }
}

