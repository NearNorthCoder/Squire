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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        d.lIIlIlIIIIlIIII();
        d.lIIlIlIIIIIllll();
    }

    private static boolean lIIlIlIIIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIlIIIIIllll() {
        llllllIIlIIl = new String[llllllIIlIlI[6]];
        d.llllllIIlIIl[d.llllllIIlIlI[1]] = "We do not have enough food to go on, stopping plugin.";
        d.llllllIIlIIl[d.llllllIIlIlI[0]] = "We do not have enough anti-poison to go on, stopping plugin.";
    }

    private static boolean lIIlIlIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        d var1;
        int[] nArray = new int[llllllIIlIlI[0]];
        nArray[d.llllllIIlIlI[1]] = this.t.foodID();
        if (d.lIIlIlIIIIlIIIl(Inventory.getCount((int[])nArray), this.t.minFoodAmount()) && d.lIIlIlIIIIlIIIl(Inventory.getCount(item -> item.getName().startsWith(this.t.antiPoison())), this.t.minAntiAmount())) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIIlI(var1.u.getVarbitValue(llllllIIlIlI[2]))) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIIll(Players.getLocal().getWorldLocation().getRegionID(), llllllIIlIlI[3])) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
            if (d.lIIlIlIIIIlIIlI(var1.t.foodAmount())) {
                int[] nArray2 = new int[llllllIIlIlI[0]];
                nArray2[d.llllllIIlIlI[1]] = var1.t.foodID();
                if (d.lIIlIlIIIIlIlIl(Bank.getCount((boolean)llllllIIlIlI[0], (int[])nArray2), var1.t.foodAmount())) {
                    Log.info((String)llllllIIlIIl[llllllIIlIlI[1]]);
                    var1.r.forceStop();
                    return llllllIIlIlI[0];
                }
            }
            if (d.lIIlIlIIIIlIIlI(var1.t.antiAmount()) && d.lIIlIlIIIIlIlIl(Bank.getCount((boolean)llllllIIlIlI[0], item -> item.getName().startsWith(this.t.antiPoison())), var1.t.antiAmount())) {
                Log.info((String)llllllIIlIIl[llllllIIlIlI[0]]);
                var1.r.forceStop();
                return llllllIIlIlI[0];
            }
            var1.r.b().withdraw();

        }
        if (d.lIIlIlIIIIlIlII(Bank.open() ? 1 : 0)) {
            int[] nArray3 = new int[llllllIIlIlI[0]];
            nArray3[d.llllllIIlIlI[1]] = var1.t.foodID();
            System.out.println("Walking to bank; Food in inventory: " + Inventory.getCount((int[])nArray3) + " amount wanted " + var1.t.minFoodAmount());
            Movement.walkTo((WorldPoint)new WorldPoint(llllllIIlIlI[4], llllllIIlIlI[5], llllllIIlIlI[1]));

            return llllllIIlIlI[0];
        }
        return llllllIIlIlI[1];
    }

    private static boolean lIIlIlIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public BankingTask(SquirePlunder squirePlunder, a a2, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.r = squirePlunder;
        this.s = a2;
        this.t = squirePlunderConfig;
        this.u = client;
    }

}

