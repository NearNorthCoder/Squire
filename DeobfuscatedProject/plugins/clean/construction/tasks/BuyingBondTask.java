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
    
    private  int fh;

    private static boolean llIlllllIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aX llIIllllIlIIlll;
        int[] nArray = new int[lllllllI[0]];
        nArray[aX.lllllllI[1]] = lllllllI[2];
        if (aX.llIlllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllllI[1];
        }
        int[] nArray2 = new int[lllllllI[0]];
        nArray2[aX.lllllllI[1]] = lllllllI[3];
        if (aX.llIllllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lllllllI[0]];
            nArray3[aX.lllllllI[1]] = lllllllI[3];
            if (aX.llIlllllll(Inventory.getCount((boolean)lllllllI[0], (int[])nArray3), lllllllI[4])) {
                return lllllllI[1];
            }
        }
        if (aX.lllIIIIIII(llIIllllIlIIlll.fh, lllllllI[0])) {
            llIIllllIlIIlll.fh -= lllllllI[0];
            return lllllllI[1];
        }
        if (aX.llIlllllIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (aX.llIlllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                GrandExchange.collect();
                return lllllllI[0];
            }
            GrandExchange.buy((int)lllllllI[5], (int)lllllllI[0], (int)lllllllI[4]);

            llIIllllIlIIlll.fh += lllllllI[0];

            if (3 <= 1) {
                return false;
            }
        } else {
            GrandExchange.open();
        }
        return lllllllI[0];
    }

    public boolean cr() {
        return lllllllI[0];
    }

    static {
        aX.llIlllllII();
    }

    private static boolean lllIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIllllllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public BuyingBondTask(SquireMembershipBuyer squireMembershipBuyer) {
        this.fg = squireMembershipBuyer;
    }
}

