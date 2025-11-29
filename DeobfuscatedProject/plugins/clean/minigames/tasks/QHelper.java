/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.minigames.tasks;

import net.unethicalite.api.items.Equipment;

public class QHelper {

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

    /*
     * WARNING - void declaration
     */
    public boolean d(int ... nArray) {
        boolean bl;
        void var1;
        void var2;
        int n2 = lIIllIIIIIlI[0];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var3 = lIIllIIIIIlI[0];
        while (q.llIIllIlllIlIl(var3, (int)var2)) {
            void var4;
            void var5 = var4[var3];
            int[] nArray3 = new int[lIIllIIIIIlI[1]];
            nArray3[q.lIIllIIIIIlI[0]] = var5;
            var1 += Equipment.getCount((int[])nArray3);
            ++var3;

            if (-1 <= 3) continue;
            return false;
        }
        if (q.llIIllIlllIllI((int)var1)) {
            bl = lIIllIIIIIlI[1];

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

