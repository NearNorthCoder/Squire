/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Picking up glass", blocking=true)
public class PickingUpGlassTask
extends Task {
    private final  BankStanderConfig t;

    private final  SquireBankStander s;

    static {
        E.var3();
        E.var4();
    }

    private static void var4() {
        var1 = new String[var2[3]];
        E.var1[E.var2[0]] = "Take";
    }

    @Inject
    public PickingUpGlassTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.s = squireBankStander;
        this.t = bankStanderConfig;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        TileItem var7;
        E var8;
        if (E.var6(this.t.glassMakePickGlass() ? 1 : 0)) {
            return var2[0];
        }
        if (E.var9(var8.s.b(), var2[1]) && E.var6(var8.s.d() ? 1 : 0)) {
            return var2[0];
        }
        if (E.var5(Inventory.isFull() ? 1 : 0)) {
            if (E.var5(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
            }
            return Bank.open();
        }
        if (E.var10(var8.s.b(), var2[2])) {
            var8.s.a(var2[3]);
        }
        if (E.var11(var7 = TileItems.getNearest(tileItem -> {
            boolean bl;
            if (E.var12(tileItem.getId(), var2[4])) {
                bl = var2[3];
                0;
                if null != null {
                    return ((0x3E ^ 0x72 ^ (0x58 ^ 0x77)) & (0xC ^ 0x12 ^ (0xE5 ^ 0x98) ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }))) {
            var8.s.a(var2[0]);
            var8.s.a(var2[0]);
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[3];
    }

    private static boolean var12(int n2, int n3) {
        return n2 == n3;
    }

    private static void var3() {
        var2 = new int[6];
        E.var2[0] = (0x7B ^ 0x74 ^ (0x7B ^ 0x7E)) & (41 + 20 - -47 + 69 ^ 67 + 173 - 145 + 92 ^ -1);
        E.var2[1] = 41 + 11 - -34 + 48 ^ 75 + 0 - -11 + 63;
        E.var2[2] = 0x24 ^ 0x7F ^ (0x3B ^ 0x74);
        E.var2[3] = 1;
        E.var2[4] = 0xFFFFF6EF & 0xFFF;
        E.var2[5] = 2;
    }

    private static boolean var9(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var10(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object == null;
    }
}

