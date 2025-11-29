/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Withdrawing loot (Restocking)", priority=1346674, blocking=true)
public class WithdrawingLootRestockingTask
extends NightmareTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        V.var9();
        V.var10();
    }

    private static void var10() {
        var1 = new String[var2[1]];
        V.var1[V.var2[0]] = "[WithdrawSellable]: No sellable items in bank, moving on.";
    }

    @Inject
    protected WithdrawingLootRestockingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void var9() {
        var2 = new int[4];
        V.var2[0] = (99 + 68 - 65 + 52 ^ 91 + 16 - 7 + 42) & (29 + 132 - 27 + 30 ^ 113 + 164 - 263 + 162 ^ -1);
        V.var2[1] = 1;
        V.var2[2] = 0xFFFFFFFF & Integer.MAX_VALUE;
        V.var2[3] = 2;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ci() {
        V var12;
        if (V.var13(this.cW.D() ? 1 : 0)) {
            return var2[0];
        }
        if (V.var13(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        if (V.var11(var12.cn() ? 1 : 0)) {
            return var2[0];
        }
        if (V.var11(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var2[1];
        }
        if (V.var11(Inventory.contains(item -> this.ca().contains(item.getId())) ? 1 : 0)) {
            Bank.withdraw(item -> this.ca().contains(item.getId()), (int)var2[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return var2[1];
        }
        if (V.var11(Bank.contains(item -> dt.contains(item.getId())) ? 1 : 0)) {
            var12.cW.f(var2[1]);
            Log.info((String)var1[var2[0]]);
            return var2[1];
        }
        if (V.var11(Equipment.getAll().isEmpty() ? 1 : 0) && V.var11(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
            Bank.depositEquipment();
            return var2[1];
        }
        Bank.withdraw(item -> dt.contains(item.getId()), (int)var2[2], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        return var2[1];
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }
}

