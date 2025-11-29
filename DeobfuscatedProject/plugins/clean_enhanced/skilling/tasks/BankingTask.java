/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.skilling.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    
    private final  SquireBankStander q;
    private final  BankStanderConfig p;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t var2;
        if (t.var3(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        InventorySetup var4 = var2.q.a();
        if (t.var5(var4)) {
            return var1[0];
        }
        if (t.var6(var4.matchesInventory() ? 1 : 0)) {
            if (t.var6(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            return var1[0];
        }
        var1_1.withdraw();
        0;
        this.sleep(var1[1]);
        return var1[1];
    }

    @Inject
    public BankingTask(BankStanderConfig bankStanderConfig, SquireBankStander squireBankStander) {
        this.p = bankStanderConfig;
        this.q = squireBankStander;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        t.var7();
    }

    private static void var7() {
        var1 = new int[2];
        t.var1[0] = (0x79 ^ 0x7E) & ~(0xC4 ^ 0xC3);
        t.var1[1] = 1;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }
}

