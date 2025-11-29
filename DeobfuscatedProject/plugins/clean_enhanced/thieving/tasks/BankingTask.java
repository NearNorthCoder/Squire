/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunder;
import gg.squire.thieving.SquirePlunderConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Banking", priority=25)
public class BankingTask
extends Task {
    
    private final  SquirePlunder r;
    private final  Client u;
    
    private final  a s;
    private final  SquirePlunderConfig t;

    static {
        d.var3();
        d.var4();
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static void var3() {
        var2 = new int[8];
        d.var2[0] = 1;
        d.var2[1] = (0x8F ^ 0xC6 ^ 2) & (119 + 99 - 201 + 214 ^ 66 + 44 - 42 + 104 ^ -1);
        d.var2[2] = -(0xFFFFAA7D & 0x7583) & (0xFFFFBFFF & 0x6947);
        d.var2[3] = -(0xFFFFE76F & 0x79B9) & (0xFFFFFF7F & 0x7FED);
        d.var2[4] = 0xFFFFABEF & 0x5EFF;
        d.var2[5] = 0xFFFF9775 & 0x7CBB;
        d.var2[6] = 2;
        d.var2[7] = 54 + 61 - 15 + 52 ^ 132 + 54 - 109 + 67;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var4() {
        var1 = new String[var2[6]];
        d.var1[d.var2[1]] = "We do not have enough food to go on, stopping plugin.";
        d.var1[d.var2[0]] = "We do not have enough anti-poison to go on, stopping plugin.";
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        d var14;
        int[] nArray = new int[var2[0]];
        nArray[d.var2[1]] = this.t.foodID();
        if (d.var12(Inventory.getCount((int[])nArray), this.t.minFoodAmount()) && d.var12(Inventory.getCount(item -> item.getName().startsWith(this.t.antiPoison())), this.t.minAntiAmount())) {
            return var2[1];
        }
        if (d.var13(var14.u.getVarbitValue(var2[2]))) {
            return var2[1];
        }
        if (d.var5(Players.getLocal().getWorldLocation().getRegionID(), var2[3])) {
            return var2[1];
        }
        if (d.var15(Movement.shouldWalk() ? 1 : 0)) {
            return var2[1];
        }
        if (d.var13(Bank.isOpen() ? 1 : 0)) {
            if (d.var13(var14.t.foodAmount())) {
                int[] nArray2 = new int[var2[0]];
                nArray2[d.var2[1]] = var14.t.foodID();
                if (d.var16(Bank.getCount((boolean)var2[0], (int[])nArray2), var14.t.foodAmount())) {
                    Log.info((String)var1[var2[1]]);
                    var14.r.forceStop();
                    return var2[0];
                }
            }
            if (d.var13(var14.t.antiAmount()) && d.var16(Bank.getCount((boolean)var2[0], item -> item.getName().startsWith(this.t.antiPoison())), var14.t.antiAmount())) {
                Log.info((String)var1[var2[0]]);
                var14.r.forceStop();
                return var2[0];
            }
            var14.r.b().withdraw();
            0;
        }
        if (d.var15(Bank.open() ? 1 : 0)) {
            int[] nArray3 = new int[var2[0]];
            nArray3[d.var2[1]] = var14.t.foodID();
            System.out.println("Walking to bank; Food in inventory: " + Inventory.getCount((int[])nArray3) + " amount wanted " + var14.t.minFoodAmount());
            Movement.walkTo((WorldPoint)new WorldPoint(var2[4], var2[5], var2[1]));
            0;
            return var2[0];
        }
        return var2[1];
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public BankingTask(SquirePlunder squirePlunder, a a2, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.r = squirePlunder;
        this.s = a2;
        this.t = squirePlunderConfig;
        this.u = client;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

