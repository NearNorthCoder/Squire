/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.pvm.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Walking to bank", priority=10, blocking=true)
public class WalkingToBankTask
extends Task {
    public static final  WorldPoint aL;
    
    private final  c aM;
    private final  SquireShamanConfig aN;
    public static final  WorldPoint aK;

    private static boolean var2(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean G() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        int n2 = worldPoint.getRegionID();
        if (!A.var3(n2, var1[4]) || A.var4(n2, var1[5])) {
            Movement.walkTo((WorldPoint)aL);
            0;
            0;
            if (-3 >= 0) {
                return ((0x30 ^ 0x2B ^ (0xF ^ 0x2F)) & (0xA ^ 0x41 ^ (0x20 ^ 0x50) ^ -1)) != 0;
            }
        } else {
            Movement.walkTo((WorldPoint)aK);
            0;
        }
        return var1[0];
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    private static void var7() {
        var1 = new int[10];
        A.var1[0] = (136 + 180 - 240 + 115 ^ 129 + 148 - 156 + 32) & (55 + 92 - 122 + 147 ^ 23 + 120 - 109 + 104 ^ -1);
        A.var1[1] = 1;
        A.var1[2] = -(0xFFFFBF3F & 0x51C9) & (0xFFFFFD5F & 0x7BFF);
        A.var1[3] = 0x16 ^ 0x10 ^ (0x8B ^ 0x87);
        A.var1[4] = -(0xFFFFC7AD & 0x7857) & (0xFFFFEB77 & 0x7CBE);
        A.var1[5] = 0xFFFFBDFB & 0x6B36;
        A.var1[6] = -(0xFFFFFBD7 & 0x2729) & (0xFFFFB7DF & 0x6FFF);
        A.var1[7] = -(0xFFFFED65 & 0x33BB) & (0xFFFFAFBF & 0x7FFB);
        A.var1[8] = 0xFFFFBD1E & 0x47F7;
        A.var1[9] = 0xFFFFCEFE & 0x3FB3;
    }

    static {
        A.var7();
        aK = new WorldPoint(var1[6], var1[7], var1[0]);
        aL = new WorldPoint(var1[8], var1[9], var1[0]);
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    @Inject
    public WalkingToBankTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.aM = c2;
        this.aN = squireShamanConfig;
    }

    public boolean run() {
        A var9;
        if (A.var6(this.aM.s() ? 1 : 0)) {
            return var1[0];
        }
        InventorySetup var10 = var9.aM.r();
        if (A.var6(var10.matchesInventory() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[A.var1[0]] = var1[2];
        TileObject var11 = TileObjects.getNearest((int[])nArray);
        if (A.var5(var11) && A.var2(var11.distanceTo((Locatable)Players.getLocal()), var1[3])) {
            return var1[0];
        }
        if (A.var8(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        return Movement.walkTo((WorldPoint)aK);
    }
}

