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
        if (d.lIlIllllIllIllI(Bank.isOpen() ? 1 : 0)) {
            return this.x();
        }
        Bank.open();

        return lIIllIIIlllll[1];
    }

    private static boolean lIlIllllIlllIlI(int n, int n2) {
        return n == n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean v() {
        int n;
        int[] nArray = new int[lIIllIIIlllll[1]];
        nArray[d.lIIllIIIlllll[0]] = lIIllIIIlllll[2];
        if (d.lIlIllllIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIllIIIlllll[1]];
            nArray2[d.lIIllIIIlllll[0]] = lIIllIIIlllll[2];
            if (d.lIlIllllIllIlll(Inventory.getCount((int[])nArray2), lIIllIIIlllll[3])) {
                int[] nArray3 = new int[lIIllIIIlllll[1]];
                nArray3[d.lIIllIIIlllll[0]] = lIIllIIIlllll[4];
                if (d.lIlIllllIllIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n = lIIllIIIlllll[1];

                    if ((7 ^ 2) != 0) return n != 0;
                    return false;
                }
            }
        }
        n = lIIllIIIlllll[0];
        return n != 0;
    }

    private static boolean lIlIllllIllIlll(int n, int n2) {
        return n >= n2;
    }

    private boolean x() {
        int[] nArray = new int[lIIllIIIlllll[1]];
        nArray[d.lIIllIIIlllll[0]] = lIIllIIIlllll[6];
        if (d.lIlIllllIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIllIIIlllll[1]];
            nArray2[d.lIIllIIIlllll[0]] = lIIllIIIlllll[6];
            Bank.depositAll((int[])nArray2);
            return lIIllIIIlllll[1];
        }
        int[] nArray3 = new int[lIIllIIIlllll[1]];
        nArray3[d.lIIllIIIlllll[0]] = lIIllIIIlllll[4];
        if (d.lIlIllllIlllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            Bank.withdraw((int)lIIllIIIlllll[4], (int)lIIllIIIlllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIIllIIIlllll[1];
        }
        int[] nArray4 = new int[lIIllIIIlllll[1]];
        nArray4[d.lIIllIIIlllll[0]] = lIIllIIIlllll[2];
        if (d.lIlIllllIlllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            Bank.withdraw((int)lIIllIIIlllll[2], (int)lIIllIIIlllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIIllIIIlllll[1];
        }
        return lIIllIIIlllll[0];
    }

    private static boolean lIlIllllIlllIII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIllllIllIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllllIlllIIl(Object object) {
        return object != null;
    }

    static {
        d.lIlIllllIllIlII();
    }

    private static boolean lIlIllllIllIllI(int n) {
        return n != 0;
    }

    @Inject
    public MakingJuiceTask(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.u = squireSorceressGardenConfig;
    }

    public boolean run() {
        d var1;
        if (d.lIlIllllIllIlIl((Object)this.u.botActivity(), (Object)a.MAKE)) {
            return lIIllIIIlllll[0];
        }
        if (d.lIlIllllIllIllI(var1.v() ? 1 : 0)) {
            var1.w();
            return lIIllIIIlllll[1];
        }
        return this.u();
    }

    /*
     * WARNING - void declaration
     */
    private void w() {
        int[] nArray = new int[lIIllIIIlllll[1]];
        nArray[d.lIIllIIIlllll[0]] = lIIllIIIlllll[5];
        Item item = Inventory.getFirst((int[])nArray);
        int var2 = lIIllIIIlllll[0];
        while (d.lIlIllllIlllIII(var2, Inventory.getAll().size())) {
            Item var3 = Inventory.getItem((int)var2);
            if (d.lIlIllllIlllIIl(var3) && d.lIlIllllIlllIlI(var3.getId(), lIIllIIIlllll[2])) {
                void var4;
                var4.useOn(var3);
            }
            ++var2;

            if ((0xC ^ 8) >= 0) continue;
            return;
        }
    }

    private static boolean lIlIllllIlllIll(int n) {
        return n == 0;
    }
}

