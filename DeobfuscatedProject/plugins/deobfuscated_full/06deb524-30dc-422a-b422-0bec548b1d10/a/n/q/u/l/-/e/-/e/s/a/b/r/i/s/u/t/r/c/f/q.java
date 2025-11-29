/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Equipment
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import net.unethicalite.api.items.Equipment;

public class q {
    private static /* synthetic */ int[] lIIllIIIIIlI;

    static {
        q.llIIllIlllIlII();
    }

    public boolean z() {
        int[] nArray = new int[lIIllIIIIIlI[5]];
        nArray[q.lIIllIIIIIlI[0]] = lIIllIIIIIlI[9];
        nArray[q.lIIllIIIIIlI[1]] = lIIllIIIIIlI[10];
        return this.d(nArray);
    }

    private static boolean llIIllIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIllIlllIllI(int n2) {
        return n2 > 0;
    }

    private static void llIIllIlllIlII() {
        lIIllIIIIIlI = new int[11];
        q.lIIllIIIIIlI[0] = (0x4F ^ 0x61) & ~(0x2A ^ 4);
        q.lIIllIIIIIlI[1] = 1;
        q.lIIllIIIIIlI[2] = 0xAC ^ 0xA8;
        q.lIIllIIIIIlI[3] = 0xFFFF9F9D & 0x636A;
        q.lIIllIIIIIlI[4] = 0xFFFFF747 & 0x2EFB;
        q.lIIllIIIIIlI[5] = 2;
        q.lIIllIIIIIlI[6] = 0xFFFFAFDD & 0x7666;
        q.lIIllIIIIIlI[7] = 3;
        q.lIIllIIIIIlI[8] = 0xFFFFB7EB & 0x7BF4;
        q.lIIllIIIIIlI[9] = 0xFFFFE67E & 0x1FAD;
        q.lIIllIIIIIlI[10] = -(0xFFFFD579 & 0x2EEF) & (0xFFFFEDFF & Short.MAX_VALUE);
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(int ... nArray) {
        boolean bl;
        void var1;
        void var5;
        int n2 = lIIllIIIIIlI[0];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var3 = lIIllIIIIIlI[0];
        while (q.llIIllIlllIlIl(var3, (int)var5)) {
            void var4;
            void var2 = var4[var3];
            int[] nArray3 = new int[lIIllIIIIIlI[1]];
            nArray3[q.lIIllIIIIIlI[0]] = var2;
            var1 += Equipment.getCount((int[])nArray3);
            ++var3;
            0;
            if (-1 <= 3) continue;
            return false;
        }
        if (q.llIIllIlllIllI((int)var1)) {
            bl = lIIllIIIIIlI[1];
            0;
            if ((0xB7 ^ 0xB3) <= 0) {
                return false;
            }
        } else {
            bl = lIIllIIIIIlI[0];
        }
        return bl;
    }

    public boolean y() {
        int[] nArray = new int[lIIllIIIIIlI[2]];
        nArray[q.lIIllIIIIIlI[0]] = lIIllIIIIIlI[3];
        nArray[q.lIIllIIIIIlI[1]] = lIIllIIIIIlI[4];
        nArray[q.lIIllIIIIIlI[5]] = lIIllIIIIIlI[6];
        nArray[q.lIIllIIIIIlI[7]] = lIIllIIIIIlI[8];
        return this.d(nArray);
    }
}

