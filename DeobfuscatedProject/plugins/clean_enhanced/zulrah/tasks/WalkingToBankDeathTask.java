/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Walking to bank (death)", priority=0x7FFFFFFA, blocking=true)
public class WalkingToBankDeathTask
extends ZulrahTaskBase {

    @Inject
    public WalkingToBankDeathTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.BANKING);
    }

    static {
        M.var2();
    }

    @Override
    public boolean ac() {
        if ((this.ah( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 0;
        }
        BankLocation var3 = BankLocation.getNearest();
        if var3 == null {
            return 0;
        }
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if ((var3.getArea( != 0).contains2D(var4) ? 1 : 0)) {
            return 0;
        }
        if ((Prayers.anyActive( != 0) ? 1 : 0)) {
            Prayers.disableAll();
            return 1;
        }
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            Movement.walkTo((WorldArea)var3.getArea());
            0;
        }
        return 1;
    }
}

