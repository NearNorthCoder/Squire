/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingTaskBase;
import gg.squire.thieving.tasks.GameEnum32;

@TaskDesc(name="Returning to Start", priority=0x7FFFFF76)
public class ReturningToStartTask
extends ThievingTaskBase {

    private static boolean lIllIIllIIIllll(int n2) {
        return n2 != 0;
    }

    static {
        G.lIllIIllIIIlllI();
    }

    private static boolean lIllIIllIIlIIII(Object object) {
        return object != null;
    }

    @Inject
    public ReturningToStartTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIllIIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean l() {
        G var1;
        if (G.lIllIIllIIIllll(this.o.j() ? 1 : 0)) {
            return lIIlllIIllIlI[0];
        }
        if (G.lIllIIllIIIllll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            return lIIlllIIllIlI[1];
        }
        Player var2 = Players.getLocal();
        if (!G.lIllIIllIIlIIII(var2) || G.lIllIIllIIIllll(Inventory.isFull() ? 1 : 0)) {
            return lIIlllIIllIlI[0];
        }
        f var3 = var1.p.pickpocketTarget();
        NPC var4 = var1.a(var3);
        if (G.lIllIIllIIlIIII(var4)) {
            return lIIlllIIllIlI[0];
        }
        if (G.lIllIIllIIlIIIl(var2.getWorldLocation().distanceTo(var1.o.f()), var1.p.wanderRange())) {
            return lIIlllIIllIlI[0];
        }
        if (G.lIllIIllIIIllll(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var1.o.f());

        }
        return lIIlllIIllIlI[1];
    }
}

