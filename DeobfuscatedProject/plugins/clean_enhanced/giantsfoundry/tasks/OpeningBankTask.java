/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening bank", priority=50)
public class OpeningBankTask
extends GiantsfoundryTaskBase {

    static {
        v.var2();
    }

    @Inject
    public OpeningBankTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void var2() {
        var1 = new int[2];
        v.var1[0] = (60 + 15 - -119 + 31 ^ 15 + 51 - 16 + 143) & (57 + 129 - 84 + 31 ^ 125 + 132 - 118 + 26 ^ -1);
        v.var1[1] = 1;
    }

    @Override
    public boolean M() {
        v var3;
        if (v.var4(this.T.g() ? 1 : 0)) {
            return var1[0];
        }
        if (v.var4(var3.T.d() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[v.var1[0]] = var3.V.primaryBar().OpeningBankTask();
        if (v.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[v.var1[0]] = var3.V.secondaryBar().OpeningBankTask();
            if (v.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return var1[0];
            }
        }
        if (v.var4(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }
}

