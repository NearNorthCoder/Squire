/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum60;

public final class DHelper {
    
    private final  int bk;
    private final  E bj;
    private final  long bl;

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

            if (-(0x3A ^ 0x3F ^ 1) > 0) {
                return 3 & (3 ^ -1);
            }
        } else {
            void var1;
            n2 = var1.hashCode();
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

    public DHelper(E e2, int n2, long l2) {
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

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block10: {
            block11: {
                E var2;
                E var3;
                block9: {
                    D var4;
                    void var5;
                    if (D.llllIIlllIllll(object, this)) {
                        return llIIIlIIIIlI[0];
                    }
                    if (D.llllIIllllIIII(var5 instanceof D)) {
                        return llIIIlIIIIlI[1];
                    }
                    D var6 = (DHelper) ar5;
                    if (D.llllIIllllIIIl(var4.ax(), var6.ax())) {
                        return llIIIlIIIIlI[1];
                    }
                    if (D.llllIIllllIIlI(D.llllIIlllIlllI(var4.ay(), var6.ay()))) {
                        return llIIIlIIIIlI[1];
                    }
                    var3 = var4.aw();
                    var2 = var6.aw();
                    if (!D.llllIIllllIIll((Object)var3)) break block9;
                    if (!D.llllIIllllIlII((Object)var2)) break block10;

                    if (1 <= -1) {
                        return ((0x60 ^ 0x3D ^ (0xF4 ^ 0xB4)) & (104 + 93 - 76 + 101 ^ 72 + 122 - 133 + 134 ^ -1)) != 0;
                    }
                    break block11;
                }
                if (!D.llllIIllllIIII(((Object)((Object)var3)).equals((Object)var2) ? 1 : 0)) break block10;
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

