/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.farmer.tasks;

import -.m.e.a.u.s.r.r.q.i.r.e.f.ao;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;
import net.unethicalite.api.game.Vars;

public final class an {
    private final  n bD;
    private final  int bE;
    
    private final  au bC;

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
                n var2;
                n var3;
                block16: {
                    an var4;
                    an var5;
                    block14: {
                        block15: {
                            au var6;
                            au var7;
                            block13: {
                                void var8;
                                if (object == this) {
                                    return 2;
                                }
                                if (var8 instanceof an == 0) {
                                    return 0;
                                }
                                var5 = (an)var8;
                                if ((var4.bb() != var5.bb())) {
                                    return 0;
                                }
                                var7 = var4.aY();
                                var6 = var5.aY();
                                if (!(Object == nulllllllllllllllllIlIlIllIlllIlIllI)) break block13;
                                if (!(Object != nulllllllllllllllllIlIlIllIlllIlIlIl)) break block14;
                                0;
                                if (3 <= 0) {
                                    return ((0x85 ^ 0xB3) & ~(0x2C ^ 0x1A)) != 0;
                                }
                                break block15;
                            }
                            if (!(((Object == 0)((Object)var7)).equals((Object)var6) ? 1 : 0)) break block14;
                        }
                        return 0;
                    }
                    var3 = var4.aZ();
                    var2 = var5.aZ();
                    if (!(Object == nulllllllllllllllllIlIlIllIlllIlIlII)) break block16;
                    if (!(Object != nulllllllllllllllllIlIlIllIlllIlIIll)) break block17;
                    0;
                    if ((0x9E ^ 0x9A) <= 0) {
                        return ((0x90 ^ 0x87) & ~(0x89 ^ 0x9E)) != 0;
                    }
                    break block18;
                }
                if (!(((Object == 0)((Object)var3)).equals((Object)var2) ? 1 : 0)) break block17;
            }
            return 0;
        }
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        an var9;
        int n3;
        int n4 = 3;
        int n5 = 2;
        n5 = n5 * 3 + this.bb();
        au au2 = this.aY();
        int n6 = n5 * 3;
        if ((Object == nullau2)) {
            n3 = 4;
            0;
            if (((0xCF ^ 0x99) & ~(0x56 ^ 0)) >= 3) {
                return (0x9B ^ 0x87) & ~(0x62 ^ 0x7E);
            }
        } else {
            void var10;
            n3 = var10.hashCode();
        }
        int var11 = n6 + n3;
        n var12 = var9.aZ();
        int n7 = var11 * 3;
        if ((Object == nulllllllllllllllllIlIlIllIlllIIlIIl)) {
            n2 = 4;
            0;
            if (1 >= 3) {
                return (0x62 ^ 0x76) & ~(6 ^ 0x12);
            }
        } else {
            n2 = ((Object)((Object)var12)).hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    public int bc() {
        int n2;
        an var13;
        if (!((Object)this.bD != (Object)this.bD2)n.HARVESTABLE) || ((Object)this.bD == (Object)this.bD2)n.FILLING)) {
            n2 = var13.bC.bk();
            0;
            if (2 < 0) {
                return (0x6A ^ 0x7B ^ 2) & ((0x78 ^ 0x66) & ~(0x4E ^ 0x50) ^ (0xA ^ 0x19) ^ -1);
            }
        } else {
            n2 = var13.bC.bc();
        }
        return n2;
    }

    static {
        an.var14();
    }

    public boolean be() {
        boolean bl;
        an var15;
        int var16;
        int n2;
        if ((Vars.getBit((int > 0)1))) {
            n2 = 2;
            0;
            if null != null {
                return ((0x7E ^ 0x49) & ~(0x5F ^ 0x68)) != 0;
            }
        } else {
            n2 = var16 = 0;
        }
        if (!((Object)var15.bD != (Object)var15.bD2)n.EMPTY) || (var15.bE == 0) && !((Object)var15.bC != (Object)var15.bC2)au.WEEDS) || ((Object)var15.bC == (Object)var15.bC2)au.WEEDS) && var16) {
            bl = 2;
            0;
            if ((0xCD ^ 0xAE ^ (0xDE ^ 0xB9)) <= -1) {
                return ((0x7A ^ 0x6B ^ (0xEE ^ 0xC1)) & (91 + 100 - 106 + 96 ^ 106 + 37 - 13 + 9 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public n aZ() {
        return this.bD;
    }

    public au aY() {
        return this.bC;
    }

    public String toString() {
        return "PatchState(produce=" + String.valueOf((Object)this.aY()) + ", cropState=" + String.valueOf((Object)this.aZ()) + ", stage=" + this.bb() + ")";
    }

    public int bd() {
        switch (ao.bF[this.bD.ordinal()]) {
            case 1: {
                an var17;
                return var17.bC.bj();
            }
            case 2: {
                an var17;
                return var17.bC.bi();
            }
        }
        return 0;
    }

    public int bb() {
        return this.bE;
    }

}

