/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.EEnum;

public final class D_Unknown {
    private static /* synthetic */ int[] llIIIlIIIIlI;
    private final /* synthetic */ int bk;
    private final /* synthetic */ E bj;
    private final /* synthetic */ long bl;

    public String toString() {
        return "BirdHouseData(space=" + String.valueOf((Object)this.aw()) + ", varp=" + this.ax() + ", timestamp=" + this.ay() + ")";
    }

    private static boolean llllIIllllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIlllIllll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIllllIIll(Object object) {
        return object == null;
    }

    public E aw() {
        return this.bj;
    }

    public int ax() {
        return this.bk;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3 = llIIIlIIIIlI[2];
        int n4 = llIIIlIIIIlI[0];
        n4 = n4 * llIIIlIIIIlI[2] + this.ax();
        long l2 = this.ay();
        n4 = n4 * llIIIlIIIIlI[2] + (int)(l2 >>> llIIIlIIIIlI[3] ^ l2);
        E e2 = this.aw();
        int n5 = n4 * llIIIlIIIIlI[2];
        if (D.llllIIllllIIll((Object)e2)) {
            n2 = llIIIlIIIIlI[4];
            0;
            if (-(0x3A ^ 0x3F ^ 1) > 0) {
                return 3 & (3 ^ -1);
            }
        } else {
            void var4;
            n2 = var4.hashCode();
        }
        n4 = n5 + n2;
        return n4;
    }

    private static boolean llllIIllllIlII(Object object) {
        return object != null;
    }

    private static int llllIIlllIlllI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public D(E e2, int n2, long l2) {
        this.bj = e2;
        this.bk = n2;
        this.bl = l2;
    }

    static {
        D.llllIIlllIllIl();
    }

    private static boolean llllIIllllIIlI(int n2) {
        return n2 != 0;
    }

    private static void llllIIlllIllIl() {
        llIIIlIIIIlI = new int[5];
        D.llIIIlIIIIlI[0] = 1;
        D.llIIIlIIIIlI[1] = (0x3D ^ 0x78) & ~(0x6F ^ 0x2A);
        D.llIIIlIIIIlI[2] = 0x63 ^ 0x58;
        D.llIIIlIIIIlI[3] = 39 + 51 - 13 + 56 ^ 37 + 37 - 2 + 93;
        D.llIIIlIIIIlI[4] = 0x55 ^ 0x7E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block10: {
            block11: {
                E var3;
                E var6;
                block9: {
                    D var5;
                    void var2;
                    if (D.llllIIlllIllll(object, this)) {
                        return llIIIlIIIIlI[0];
                    }
                    if (D.llllIIllllIIII(var2 instanceof D)) {
                        return llIIIlIIIIlI[1];
                    }
                    D var1 = (D)var2;
                    if (D.llllIIllllIIIl(var5.ax(), var1.ax())) {
                        return llIIIlIIIIlI[1];
                    }
                    if (D.llllIIllllIIlI(D.llllIIlllIlllI(var5.ay(), var1.ay()))) {
                        return llIIIlIIIIlI[1];
                    }
                    var6 = var5.aw();
                    var3 = var1.aw();
                    if (!D.llllIIllllIIll((Object)var6)) break block9;
                    if (!D.llllIIllllIlII((Object)var3)) break block10;
                    0;
                    if (1 <= -1) {
                        return ((0x60 ^ 0x3D ^ (0xF4 ^ 0xB4)) & (104 + 93 - 76 + 101 ^ 72 + 122 - 133 + 134 ^ -1)) != 0;
                    }
                    break block11;
                }
                if (!D.llllIIllllIIII(((Object)((Object)var6)).equals((Object)var3) ? 1 : 0)) break block10;
            }
            return llIIIlIIIIlI[1];
        }
        return llIIIlIIIIlI[0];
    }

    public long ay() {
        return this.bl;
    }

    private static boolean llllIIllllIIIl(int n2, int n3) {
        return n2 != n3;
    }
}

