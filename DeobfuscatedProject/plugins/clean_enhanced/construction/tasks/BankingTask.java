/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    
    private final  SquirePlankerConfig l;

    private static void var3() {
        var2 = new String[var1[3]];
        b.var2[b.var1[2]] = "Bank booth";
        b.var2[b.var1[0]] = "Bank";
    }

    private static boolean var4(int n) {
        return n != 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var12(int n) {
        return n == 0;
    }

    static {
        b.var13();
        b.var3();
    }

    @Inject
    public BankingTask(SquirePlankerConfig squirePlankerConfig) {
        this.l = squirePlankerConfig;
    }

    private static void var13() {
        var1 = new int[5];
        b.var1[0] = 1;
        b.var1[1] = 129 + 78 - 197 + 136 ^ 73 + 152 - 131 + 66;
        b.var1[2] = (5 + 73 - -22 + 38 ^ 105 + 130 - 183 + 95) & (0x52 ^ 0x2E ^ (0xC0 ^ 0xA5) ^ -1);
        b.var1[3] = 2;
        b.var1[4] = 0x25 ^ 0x2D;
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    private static boolean var15(int n, int n2) {
        return n > n2;
    }

    public boolean run() {
        b var16;
        if (b.var12(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (b.var15(Movement.getRunEnergy(), var1[1]) && b.var12(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return var1[0];
        }
        int[] nArray = new int[var1[0]];
        nArray[b.var1[2]] = var16.l.plank().d();
        Item var17 = Inventory.getFirst((int[])nArray);
        if (b.var11(var17)) {
            if (b.var4(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            return var1[2];
        }
        if (b.var12(Bank.isOpen() ? 1 : 0)) {
            if (b.var4(var16.l.ironMode() ? 1 : 0)) {
                String[] stringArray = new String[var1[0]];
                stringArray[b.var1[2]] = var2[var1[2]];
                TileObject var18 = TileObjects.getNearest((String[])stringArray);
                if (b.var14(var18)) {
                    return var1[2];
                }
                var18.interact(var2[var1[0]]);
            }
            Bank.open();
            0;
            return var1[0];
        }
        int[] nArray2 = new int[var1[0]];
        nArray2[b.var1[2]] = this.l.plank().f();
        Bank.depositAll((int[])nArray2);
        Bank.withdrawAll((int)this.l.plank().d(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var1[0];
    }
}

