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
        q.var2();
    }

    public boolean z() {
        int[] nArray = new int[5];
        nArray[0] = 9;
        nArray[1] = var1[10];
        return this.d(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(int ... nArray) {
        boolean bl;
        void var3;
        void var4;
        int n2 = 0;
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var5 = 0;
        while ((var5 < (int)var4)) {
            void var6;
            void var7 = var6[var5];
            int[] nArray3 = new int[1];
            nArray3[0] = var7;
            var3 += Equipment.getCount((int[])nArray3);
            ++var5;
            0;
            if (-1 <= 3) continue;
            return ((0xA7 ^ 0x90) & ~(0x48 ^ 0x7F)) != 0;
        }
        if (((int > 0)var3)) {
            bl = 1;
            0;
            if ((0xB7 ^ 0xB3) <= 0) {
                return ((0x4C ^ 0x11) & ~(0x35 ^ 0x68)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public boolean y() {
        int[] nArray = new int[2];
        nArray[0] = 3;
        nArray[1] = 4;
        nArray[5] = 6;
        nArray[7] = 8;
        return this.d(nArray);
    }
}

