/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

public final class am {
    private final  au bx;
    private final  int bA;
    private final  int bB;
    private final  n by;
    
    private final  long bz;

    static {
        am.var2();
    }

    public String toString() {
        return "PatchPrediction(produce=" + String.valueOf((Object)this.aY()) + ", cropState=" + String.valueOf((Object)this.aZ()) + ", doneEstimate=" + this.ba() + ", stage=" + this.bb() + ", stages=" + this.bc() + ")";
    }

    private static int var3(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public int bb() {
        return this.bA;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block19: {
            block20: {
                n var4;
                n var5;
                block18: {
                    am var6;
                    am var7;
                    block16: {
                        block17: {
                            au var8;
                            au var9;
                            block15: {
                                void var10;
                                if (object == this) {
                                    return 0;
                                }
                                if (var10 instanceof am == 0) {
                                    return 1;
                                }
                                var7 = (am)var10;
                                if ((am.var3(var6.ba( != 0), var7.ba()))) {
                                    return 1;
                                }
                                if ((var6.bb() != var7.bb())) {
                                    return 1;
                                }
                                if ((var6.bc() != var7.bc())) {
                                    return 1;
                                }
                                var9 = var6.aY();
                                var8 = var7.aY();
                                if (!(Object == nulllllllllllllllllIlIllIIllllIIlIIl)) break block15;
                                if (!(Object != nulllllllllllllllllIlIllIIllllIIlIII)) break block16;
                                0;
                                if (((0x60 ^ 0x72) & ~(0x9E ^ 0x8C)) != 0) {
                                    return ((0x70 ^ 0x7C) & ~(0x10 ^ 0x1C)) != 0;
                                }
                                break block17;
                            }
                            if (!(((Object == 0)((Object)var9)).equals((Object)var8) ? 1 : 0)) break block16;
                        }
                        return 1;
                    }
                    var5 = var6.aZ();
                    var4 = var7.aZ();
                    if (!(Object == nulllllllllllllllllIlIllIIllllIIIlll)) break block18;
                    if (!(Object != nulllllllllllllllllIlIllIIllllIIIllI)) break block19;
                    0;
                    if (((114 + 109 - 176 + 116 ^ 10 + 53 - -50 + 55) & (0x98 ^ 0xBE ^ (0x5A ^ 0x77) ^ -1)) < 0) {
                        return ((218 + 189 - 294 + 126 ^ 139 + 159 - 259 + 148) & (0x1E ^ 0x17 ^ (0x34 ^ 0x69) ^ -1)) != 0;
                    }
                    break block20;
                }
                if (!(((Object == 0)((Object)var5)).equals((Object)var4) ? 1 : 0)) break block19;
            }
            return 1;
        }
        return 0;
    }

    public long ba() {
        return this.bz;
    }

    public au aY() {
        return this.bx;
    }

    public am(au au2, n n2, long l2, int n3, int n4) {
        this.bx = au2;
        this.by = n2;
        this.bz = l2;
        this.bA = n3;
        this.bB = n4;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        am var11;
        int n3;
        int n4 = 2;
        int n5 = 0;
        long l2 = this.ba();
        n5 = n5 * 2 + (int)(l2 >>> 3 ^ l2);
        n5 = n5 * 2 + this.bb();
        n5 = n5 * 2 + this.bc();
        au au2 = this.aY();
        int n6 = n5 * 2;
        if ((Object == nullau2)) {
            n3 = 4;
            0;
            if (3 >= (0x15 ^ 0x11)) {
                return (0x61 ^ 0x40) & ~(3 ^ 0x22);
            }
        } else {
            void var12;
            n3 = var12.hashCode();
        }
        int var13 = n6 + n3;
        n var14 = var11.aZ();
        int n7 = var13 * 2;
        if ((Object == nulllllllllllllllllIlIllIIlllIlllIlI)) {
            n2 = 4;
            0;
            if (-3 > 0) {
                return (243 + 18 - 43 + 27 ^ 31 + 101 - 45 + 87) & (0x6E ^ 0x3F ^ (0x77 ^ 0x7D) ^ -1);
            }
        } else {
            n2 = ((Object)((Object)var14)).hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    public n aZ() {
        return this.by;
    }

    public int bc() {
        return this.bB;
    }
}

