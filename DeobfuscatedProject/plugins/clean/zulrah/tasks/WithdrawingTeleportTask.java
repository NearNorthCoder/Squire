/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum40;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Withdrawing teleport", priority=0x7FFFFFFF, blocking=true)
public class WithdrawingTeleportTask
extends ZulrahTaskBase {

    static {
        S.llIIlIIIllIIIII();
    }

    private static boolean llIIlIIIllIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIllIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public WithdrawingTeleportTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.BANKING);
    }

    @Override
    public boolean ac() {
        if (S.llIIlIIIllIIIIl(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIllIllIIIlll[0]];
            nArray[S.lIllIllIIIlll[1]] = lIllIllIIIlll[2];
            if (S.llIIlIIIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Bank.withdraw((int)lIllIllIIIlll[2], (int)lIllIllIIIlll[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIllIllIIIlll[0];
            }
        }
        if (S.llIIlIIIllIIIIl(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            return lIllIllIIIlll[0];
        }
        return lIllIllIIIlll[1];
    }
}

