/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking (Superheat)", priority=150, blocking=true)
public class BankingSuperheatTask
extends Task {
    private final  int[] al;
    
    @Inject
    private  SquireMinerConfig f;
    private final  int[] am;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        K.var9();
        K.var10();
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    public BankingSuperheatTask() {
        int[] nArray = new int[var1[0]];
        nArray[K.var1[1]] = var1[2];
        nArray[K.var1[3]] = var1[4];
        nArray[K.var1[5]] = var1[6];
        nArray[K.var1[7]] = var1[8];
        this.al = nArray;
        int[] nArray2 = new int[var1[5]];
        nArray2[K.var1[1]] = var1[9];
        nArray2[K.var1[3]] = var1[10];
        this.am = nArray2;
    }

    private static boolean var14(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var21(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        BankLocation var22;
        WorldPoint var23;
        K var24;
        if (K.var21((Object)this.f.activity(), (Object)a.SUPERHEAT_MINE)) {
            return var1[1];
        }
        if (K.var12(Inventory.isFull() ? 1 : 0)) {
            return var1[1];
        }
        String var25 = var24.f.bankLoadout().getSelected();
        if (!K.var13(var25) || K.var11(var25.equals(var2[var1[1]]) ? 1 : 0)) {
            return var1[1];
        }
        BankLoadout var26 = (BankLoadout)var24.f.bankLoadout().selected(BankLoadout.class);
        if (K.var11(Bank.isOpen() ? 1 : 0) && K.var12(BankLoadouts.withdrawWithRetries((BankLoadout)var26, (int)var1[11]).booleanValue() ? 1 : 0)) {
            Log.info((String)var2[var1[3]]);
            return var1[3];
        }
        Player var27 = Players.getLocal();
        if (K.var14(var27.distanceTo(var23 = (var22 = BankLocation.ARDOUGNE_SOUTH_BANK).getArea().getCenter()), var1[12])) {
            Movement.walkTo((WorldPoint)var23, (boolean)var1[1]);
            0;
            return var1[3];
        }
        Bank.open();
        0;
        return var1[3];
    }

    private static void var10() {
        var2 = new String[var1[5]];
        K.var2[K.var1[1]] = "None";
        K.var2[K.var1[3]] = "Failed banking more than 5 times.";
    }

    private static void var9() {
        var1 = new int[13];
        K.var1[0] = 0xC8 ^ 0xB6 ^ (0xF9 ^ 0x83);
        K.var1[1] = (0x6E ^ 0x51) & ~(0x75 ^ 0x4A);
        K.var1[2] = 174 + 79 - 188 + 184;
        K.var1[3] = 1;
        K.var1[4] = 130 + 146 - 74 + 49;
        K.var1[5] = 2;
        K.var1[6] = 220 + 129 - 213 + 117;
        K.var1[7] = 3;
        K.var1[8] = 209 + 28 - 60 + 78;
        K.var1[9] = -(0xFFFFEECA & 0x5577) & (0xFFFFDDFF & 0x7EFD);
        K.var1[10] = -(0xFFFFCE2F & 0x71D1) & (0xFFFFD8FD & 0x7FBF);
        K.var1[11] = 88 + 46 - 125 + 127 ^ 116 + 96 - 163 + 92;
        K.var1[12] = 5 ^ 0x4C ^ (0x49 ^ 8);
    }
}

