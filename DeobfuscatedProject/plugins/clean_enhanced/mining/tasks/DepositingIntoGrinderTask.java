/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Depositing into grinder")
public class DepositingIntoGrinderTask
extends Task {
    private final  SquireMinerConfig ag;

    private  int ah;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var2 = new int[5];
        I.var2[0] = (0x8F ^ 0xC0) & ~(0x45 ^ 0xA);
        I.var2[1] = 0x6B ^ 0x7F ^ (0x56 ^ 0x46);
        I.var2[2] = 1;
        I.var2[3] = 2;
        I.var2[4] = 0xAD ^ 0x95 ^ (0x55 ^ 0x65);
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        I var15;
        if (I.var14((Object)this.ag.activity(), (Object)a.SANDSTONE)) {
            return var2[0];
        }
        if (!I.var6(var15.ag.deposit() ? 1 : 0) || I.var4(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        int var16 = Static.getClient().getTickCount();
        if (I.var13(var16 - var15.ah, var2[1])) {
            return var2[2];
        }
        if (I.var6(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return var2[2];
        }
        String[] stringArray = new String[var2[2]];
        stringArray[I.var2[0]] = var1[var2[0]];
        TileObject var17 = TileObjects.getNearest((String[])stringArray);
        if (I.var3(var17) && I.var4(Players.getLocal().isMoving() ? 1 : 0)) {
            var17.interact(var1[var2[2]]);
            var15.ah = var16;
        }
        return var2[2];
    }

    static {
        I.var5();
        I.var18();
    }

    private static void var18() {
        var1 = new String[var2[3]];
        I.var1[I.var2[0]] = "Grinder";
        I.var1[I.var2[2]] = "Deposit";
    }

    @Inject
    public DepositingIntoGrinderTask(SquireMinerConfig squireMinerConfig) {
        this.ag = squireMinerConfig;
    }
}

