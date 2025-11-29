/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.thieving.tasks.GameEnum;

@TaskDesc(name="Banking (Stalls)", priority=5, blocking=true)
public class BankingStallsTask
extends Task {
    
    private final  SquireThievingConfig aJ;

    static {
        I.var2();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    @Inject
    public BankingStallsTask(SquireThievingConfig squireThievingConfig) {
        this.aJ = squireThievingConfig;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var2() {
        var1 = new int[3];
        I.var1[0] = (0x16 ^ 0x13) & ~(0x34 ^ 0x31);
        I.var1[1] = 1;
        I.var1[2] = 0x34 ^ 0x3E;
    }

    public boolean run() {
        if (I.var5((Object)this.aJ.method(), (Object)b.STALLS)) {
            return var1[0];
        }
        if (I.var3(Inventory.isFull() ? 1 : 0)) {
            return var1[0];
        }
        if (I.var4(Bank.isOpen() ? 1 : 0)) {
            Bank.depositInventory();
            Bank.close();
            return var1[1];
        }
        if (I.var3(Movement.shouldWalk() ? 1 : 0)) {
            return var1[1];
        }
        BankLocation var6 = BankLocation.getNearest();
        if (I.var7(var6.getArea().distanceTo((Locatable)Players.getLocal()), var1[2])) {
            Movement.walkTo((WorldPoint)var6.getArea().getCenter());
            0;
            return var1[1];
        }
        Bank.open();
        0;
        return var1[1];
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }
}

