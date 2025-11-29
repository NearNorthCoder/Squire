/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.items.Inventory;

public class SHelper
implements o {

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new int[4];
        s.var1[0] = 1;
        s.var1[1] = (0x7D ^ 0x55) & ~(3 ^ 0x2B);
        s.var1[2] = 0xFFFF99DD & 0x6FF6;
        s.var1[3] = -(0xFFFFFE73 & 0x39FD) & (0xFFFFFFFF & 0x3FF9);
    }

    static {
        s.var4();
    }

    @Override
    public boolean D() {
        block3: {
            block2: {
                int[] nArray = new int[var1[0]];
                nArray[s.var1[1]] = var1[2];
                if (!s.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var1[0]];
                nArray2[s.var1[1]] = var1[3];
                if (!s.var2(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[s.var1[1]] = var1[2];
        int[] nArray3 = new int[var1[0]];
        nArray3[s.var1[1]] = var1[3];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
        return var1[0];
    }
}

