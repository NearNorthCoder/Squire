/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.membership.SquireMembershipBuyer;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Buying Bond")
public class BuyingBondTask
extends Task {
    private final  SquireMembershipBuyer fg;
    private static  int[] lllllllI;
    private  int fh;

    public boolean run() {
        aX var1;
        int[] nArray = new int[0];
        nArray[1] = 2;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            return 1;
        }
        int[] nArray2 = new int[0];
        nArray2[1] = 3;
        if ((Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[0];
            nArray3[1] = 3;
            if ((Inventory.getCount((boolean)0 < (int[])nArray3), 4)) {
                return 1;
            }
        }
        if (var1.fh >= 0) {
            var1.fh -= 0;
            return 1;
        }
        if ((GrandExchange.isOpen( != 0) ? 1 : 0)) {
            if ((GrandExchange.canCollect( != 0) ? 1 : 0)) {
                GrandExchange.collect();
                return 0;
            }
            GrandExchange.buy((int)5, (int)0, (int)4);
            0;
            var1.fh += 0;
            0;
            if (3 <= 1) {
                return ((0x82 ^ 0xBB) & ~(0xC ^ 0x35)) != 0;
            }
        } else {
            GrandExchange.open();
        }
        return 0;
    }

    public boolean cr() {
        return 0;
    }

    static {
        aX.var2();
    }

    @Inject
    public BuyingBondTask(SquireMembershipBuyer squireMembershipBuyer) {
        this.fg = squireMembershipBuyer;
    }
}

