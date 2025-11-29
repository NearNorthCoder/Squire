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
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum5;

@TaskDesc(name="Returning to Start", priority=0x7FFFFF76)
public class ReturningToStartTask
extends ThievingManager {

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    static {
        G.var3();
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    @Inject
    public ReturningToStartTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void var3() {
        var1 = new int[2];
        G.var1[0] = (0x18 ^ 8) & ~(0x5F ^ 0x4F);
        G.var1[1] = 1;
    }

    private static boolean var5(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean l() {
        G var6;
        if (G.var2(this.o.j() ? 1 : 0)) {
            return var1[0];
        }
        if (G.var2(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            return var1[1];
        }
        Player var7 = Players.getLocal();
        if (!G.var4(var7) || G.var2(Inventory.isFull() ? 1 : 0)) {
            return var1[0];
        }
        f var8 = var6.p.pickpocketTarget();
        NPC var9 = var6.a(var8);
        if (G.var4(var9)) {
            return var1[0];
        }
        if (G.var5(var7.getWorldLocation().distanceTo(var6.o.f()), var6.p.wanderRange())) {
            return var1[0];
        }
        if (G.var2(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var6.o.f());
            0;
        }
        return var1[1];
    }
}

