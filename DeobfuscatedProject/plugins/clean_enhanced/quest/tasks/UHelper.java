/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public class UHelper
implements o {
    private final  int ai;

    private static void var2() {
        var1 = new int[3];
        u.var1[0] = 1;
        u.var1[1] = (0xB ^ 1) & ~(0x54 ^ 0x5E);
        u.var1[2] = 2;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean D() {
        int[] nArray = new int[var1[0]];
        nArray[u.var1[1]] = this.ai;
        if (u.var3(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return var1[1];
        }
        int[] nArray2 = new int[var1[0]];
        nArray2[u.var1[1]] = this.ai;
        Inventory.getFirst((int[])nArray2).interact(var1[2]);
        return var1[0];
    }

    static {
        u.var2();
    }

    public UHelper(int n2) {
        this.ai = n2;
    }
}

