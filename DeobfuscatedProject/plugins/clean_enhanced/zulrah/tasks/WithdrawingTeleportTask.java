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
import gg.squire.zulrah.tasks.GameEnum9;
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
        S.var2();
    }

    @Inject
    public WithdrawingTeleportTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.BANKING);
    }

    @Override
    public boolean ac() {
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            int[] nArray = new int[0];
            nArray[1] = 2;
            if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
                Bank.withdraw((int)2, (int)0, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return 0;
            }
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            Bank.close();
            return 0;
        }
        return 1;
    }
}

