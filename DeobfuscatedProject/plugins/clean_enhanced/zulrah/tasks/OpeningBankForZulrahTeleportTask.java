/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum9;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Opening bank for zulrah teleport", priority=0x7FFFFFFD, blocking=true)
public class OpeningBankForZulrahTeleportTask
extends ZulrahTaskBase {

    @Override
    public boolean ac() {
        O var2;
        int[] nArray = new int[0];
        nArray[1] = 2;
        Item item = Inventory.getFirst((int[])nArray);
        if item != null {
            this.al.a(c.TRANSPORTING_ZULRAH);
            return 1;
        }
        if ((Prayers.anyActive( != 0) ? 1 : 0)) {
            Prayers.disableAll();
            return 0;
        }
        if ((var2.ah( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 1;
        }
        BankLocation var3 = BankLocation.getNearest();
        if var3 == null {
            return 1;
        }
        if ((Bank.open( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            Movement.walkTo((WorldArea)var3.getArea());
            0;
        }
        return 0;
    }

    static {
        O.var4();
    }

    @Inject
    public OpeningBankForZulrahTeleportTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.BANKING);
    }
}

