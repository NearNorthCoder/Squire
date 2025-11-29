/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import gg.squire.minigames.tasks.GameEnum;

@TaskDesc(name="Making Juice")
public class MakingJuiceTask
extends Task {
    private final  SquireSorceressGardenConfig u;

    private boolean u() {
        if (d.var2(Bank.isOpen() ? 1 : 0)) {
            return this.x();
        }
        Bank.open();
        0;
        return var1[1];
    }

    private static boolean var3(int n, int n2) {
        return n == n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean v() {
        int n;
        int[] nArray = new int[var1[1]];
        nArray[d.var1[0]] = var1[2];
        if (d.var2(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[d.var1[0]] = var1[2];
            if (d.var4(Inventory.getCount((int[])nArray2), var1[3])) {
                int[] nArray3 = new int[var1[1]];
                nArray3[d.var1[0]] = var1[4];
                if (d.var2(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n = var1[1];
                    0;
                    if ((7 ^ 2) != 0) return n != 0;
                    return ((0x59 ^ 0x54) & ~(0x7D ^ 0x70)) != 0;
                }
            }
        }
        n = var1[0];
        return n != 0;
    }

    private static boolean var4(int n, int n2) {
        return n >= n2;
    }

    private boolean x() {
        int[] nArray = new int[var1[1]];
        nArray[d.var1[0]] = var1[6];
        if (d.var2(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[d.var1[0]] = var1[6];
            Bank.depositAll((int[])nArray2);
            return var1[1];
        }
        int[] nArray3 = new int[var1[1]];
        nArray3[d.var1[0]] = var1[4];
        if (d.var5(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            Bank.withdraw((int)var1[4], (int)var1[7], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return var1[1];
        }
        int[] nArray4 = new int[var1[1]];
        nArray4[d.var1[0]] = var1[2];
        if (d.var5(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            Bank.withdraw((int)var1[2], (int)var1[8], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var6(int n, int n2) {
        return n < n2;
    }

    private static boolean var7(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    static {
        d.var9();
    }

    private static void var9() {
        var1 = new int[9];
        d.var1[0] = (2 ^ (0x9A ^ 0x96)) & (0x7E ^ 0x61 ^ (0x5E ^ 0x4F) ^ -1);
        d.var1[1] = 1;
        d.var1[2] = 0xFFFFBE7F & 0x6BDD;
        d.var1[3] = 2;
        d.var1[4] = -(0xFFFFB9B3 & 0x7ECD) & (0xFFFFBFFF & Short.MAX_VALUE);
        d.var1[5] = 207 + 158 - 155 + 23;
        d.var1[6] = -(0xFFFF9BEF & 0x751D) & (0xFFFFFBED & 0x3F7F);
        d.var1[7] = 0x24 ^ 0x2D;
        d.var1[8] = 0x5E ^ 0x23 ^ (0xE6 ^ 0x8F);
    }

    private static boolean var2(int n) {
        return n != 0;
    }

    @Inject
    public MakingJuiceTask(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.u = squireSorceressGardenConfig;
    }

    public boolean run() {
        d var10;
        if (d.var7((Object)this.u.botActivity(), (Object)a.MAKE)) {
            return var1[0];
        }
        if (d.var2(var10.v() ? 1 : 0)) {
            var10.w();
            return var1[1];
        }
        return this.u();
    }

    /*
     * WARNING - void declaration
     */
    private void w() {
        int[] nArray = new int[var1[1]];
        nArray[d.var1[0]] = var1[5];
        Item item = Inventory.getFirst((int[])nArray);
        int var11 = var1[0];
        while (d.var6(var11, Inventory.getAll().size())) {
            Item var12 = Inventory.getItem((int)var11);
            if (d.var8(var12) && d.var3(var12.getId(), var1[2])) {
                void var13;
                var13.useOn(var12);
            }
            ++var11;
            0;
            if ((0xC ^ 8) >= 0) continue;
            return;
        }
    }

    private static boolean var5(int n) {
        return n == 0;
    }
}

