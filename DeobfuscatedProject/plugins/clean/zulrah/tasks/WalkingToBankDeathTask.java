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
import gg.squire.zulrah.tasks.GameEnum40;
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

    private static boolean llIIlIIIIllIIII(Object object) {
        return object == null;
    }

    static {
        M.llIIlIIIIlIlllI();
    }

    private static boolean llIIlIIIIlIllll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        if (M.llIIlIIIIlIllll(this.ah() ? 1 : 0)) {
            return lIllIlIlllIII[0];
        }
        if (M.llIIlIIIIlIllll(Bank.isOpen() ? 1 : 0)) {
            return lIllIlIlllIII[0];
        }
        BankLocation var1 = BankLocation.getNearest();
        if (M.llIIlIIIIllIIII(var1)) {
            return lIllIlIlllIII[0];
        }
        WorldPoint var2 = Players.getLocal().getWorldLocation();
        if (M.llIIlIIIIlIllll(var1.getArea().contains2D(var2) ? 1 : 0)) {
            return lIllIlIlllIII[0];
        }
        if (M.llIIlIIIIlIllll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIllIlIlllIII[1];
        }
        if (M.llIIlIIIIlIllll(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldArea)var1.getArea());

        }
        return lIllIlIlllIII[1];
    }

}

