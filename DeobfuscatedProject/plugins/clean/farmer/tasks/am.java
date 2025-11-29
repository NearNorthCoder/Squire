/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

public final class am {
    private final  au bx;
    private final  int bA;
    private final  int bB;
    private final  n by;
    
    private final  long bz;

    static {
        am.lllIllIllIlllI();
    }

    public String toString() {
        return "PatchPrediction(produce=" + String.valueOf((Object)this.aY()) + ", cropState=" + String.valueOf((Object)this.aZ()) + ", doneEstimate=" + this.ba() + ", stage=" + this.bb() + ", stages=" + this.bc() + ")";
    }

    private static int lllIllIllIllll(long l2, long l3) {
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
                n var1;
                n var2;
                block18: {
                    am var3;
                    am var4;
                    block16: {
                        block17: {
                            au var5;
                            au var6;
                            block15: {
                                void var7;
                                if (am.lllIllIlllIIII(object, this)) {
                                    return lIllllIIIllI[0];
                                }
                                if (am.lllIllIlllIIIl(var7 instanceof am)) {
                                    return lIllllIIIllI[1];
                                }
                                var4 = (am)var7;
                                if (am.lllIllIlllIIlI(am.lllIllIllIllll(var3.ba(), var4.ba()))) {
                                    return lIllllIIIllI[1];
                                }
                                if (am.lllIllIlllIIll(var3.bb(), var4.bb())) {
                                    return lIllllIIIllI[1];
                                }
                                if (am.lllIllIlllIIll(var3.bc(), var4.bc())) {
                                    return lIllllIIIllI[1];
                                }
                                var6 = var3.aY();
                                var5 = var4.aY();
                                if (!am.lllIllIlllIlII((Object)var6)) break block15;
                                if (!am.lllIllIlllIlIl((Object)var5)) break block16;

                                if (((0x60 ^ 0x72) & ~(0x9E ^ 0x8C)) != 0) {
                                    return false;
                                }
                                break block17;
                            }
                            if (!am.lllIllIlllIIIl(((Object)((Object)var6)).equals((Object)var5) ? 1 : 0)) break block16;
                        }
                        return lIllllIIIllI[1];
                    }
                    var2 = var3.aZ();
                    var1 = var4.aZ();
                    if (!am.lllIllIlllIlII((Object)var2)) break block18;
                    if (!am.lllIllIlllIlIl((Object)var1)) break block19;

                    if (((114 + 109 - 176 + 116 ^ 10 + 53 - -50 + 55) & (0x98 ^ 0xBE ^ (0x5A ^ 0x77) ^ -1)) < 0) {
                        return ((218 + 189 - 294 + 126 ^ 139 + 159 - 259 + 148) & (0x1E ^ 0x17 ^ (0x34 ^ 0x69) ^ -1)) != 0;
                    }
                    break block20;
                }
                if (!am.lllIllIlllIIIl(((Object)((Object)var2)).equals((Object)var1) ? 1 : 0)) break block19;
            }
            return lIllllIIIllI[1];
        }
        return lIllllIIIllI[0];
    }

    private static boolean lllIllIlllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIllIlllIIIl(int n2) {
        return n2 == 0;
    }

    public long ba() {
        return this.bz;
    }

    private static boolean lllIllIlllIlII(Object object) {
        return object == null;
    }

    private static boolean lllIllIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllIlllIlIl(Object object) {
        return object != null;
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

    private static boolean lllIllIlllIIll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        am var8;
        int n3;
        int n4 = lIllllIIIllI[2];
        int n5 = lIllllIIIllI[0];
        long l2 = this.ba();
        n5 = n5 * lIllllIIIllI[2] + (int)(l2 >>> lIllllIIIllI[3] ^ l2);
        n5 = n5 * lIllllIIIllI[2] + this.bb();
        n5 = n5 * lIllllIIIllI[2] + this.bc();
        au au2 = this.aY();
        int n6 = n5 * lIllllIIIllI[2];
        if (am.lllIllIlllIlII((Object)au2)) {
            n3 = lIllllIIIllI[4];

            if (3 >= (0x15 ^ 0x11)) {
                return (0x61 ^ 0x40) & ~(3 ^ 0x22);
            }
        } else {
            void var9;
            n3 = var9.hashCode();
        }
        int var10 = n6 + n3;
        n var11 = var8.aZ();
        int n7 = var10 * lIllllIIIllI[2];
        if (am.lllIllIlllIlII((Object)var11)) {
            n2 = lIllllIIIllI[4];

        } else {
            n2 = ((Object)((Object)var11)).hashCode();
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

