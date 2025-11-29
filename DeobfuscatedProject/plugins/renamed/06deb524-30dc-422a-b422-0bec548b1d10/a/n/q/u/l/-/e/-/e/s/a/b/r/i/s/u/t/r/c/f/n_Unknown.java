/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Bank
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import net.unethicalite.api.items.Bank;

public class n_Unknown {
    private static /* synthetic */ int[] lIIlIlllIlII;

    private static void llIIllIlIllIlI() {
        lIIlIlllIlII = new int[2];
        n.lIIlIlllIlII[0] = 1;
        n.lIIlIlllIlII[1] = (22 + 87 - -73 + 49 ^ 93 + 16 - 33 + 84) & (0x47 ^ 0x40 ^ (0x7A ^ 0x3A) ^ -1);
    }

    public boolean h() {
        boolean bl;
        if (!n.llIIllIlIllIll(Bank.isOpen() ? 1 : 0) || n.llIIllIlIlllII(Bank.isPinWindowOpen() ? 1 : 0)) {
            bl = lIIlIlllIlII[0];
            0;
            
            }
        } else {
            bl = lIIlIlllIlII[1];
        }
        return bl;
    }

    private static boolean llIIllIlIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIllIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        n.llIIllIlIllIlI();
    }

    public boolean b(int ... nArray) {
        boolean bl;
        if (n.llIIllIlIllllI(this.a(nArray))) {
            bl = lIIlIlllIlII[0];
            0;
            if (2 <= 1) {
                return false;
            }
        } else {
            bl = lIIlIlllIlII[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public int a(int ... nArray) {
        void var3;
        int n2 = lIIlIlllIlII[1];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var2 = lIIlIlllIlII[1];
        while (n.llIIllIlIlllIl(var2, (int)var3)) {
            void var4;
            void var1 = var4[var2];
            int[] nArray3 = new int[lIIlIlllIlII[0]];
            nArray3[n.lIIlIlllIlII[1]] = var1;
            lllllllllllllllIllllIIIlIIIlIllI += Bank.getCount((int[])nArray3);
            ++var2;
            0;
            if (2 != 0) continue;
            return (9 ^ 0xC) & ~(0x87 ^ 0x82);
        }
        return n2;
    }

    private static boolean llIIllIlIllllI(int n2) {
        return n2 > 0;
    }
}

