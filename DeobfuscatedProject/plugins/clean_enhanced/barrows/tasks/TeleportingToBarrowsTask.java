/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Teleporting to barrows", priority=100)
public class TeleportingToBarrowsTask
extends Task {

    private final  SquireBarrows ag;

    static {
        u.var3();
        u.var4();
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    private static void var4() {
        var2 = new String[var1[6]];
        u.var2[u.var1[0]] = "Portal Nexus";
        u.var2[u.var1[2]] = "Barrows";
        u.var2[u.var1[3]] = "Barrows";
    }

    private static void var3() {
        var1 = new int[8];
        u.var1[0] = (0x21 ^ 0x5F ^ (0x12 ^ 0x2C)) & (0x6A ^ 0xF ^ (0x90 ^ 0xB5) ^ -1);
        u.var1[1] = 0x10 ^ 0x4B ^ (0xC4 ^ 0x8B);
        u.var1[2] = 1;
        u.var1[3] = 2;
        u.var1[4] = 0xFFFFAFEB & 0x5DFF;
        u.var1[5] = 0xFFFF9EF3 & 0x6DFD;
        u.var1[6] = 3;
        u.var1[7] = 0xA1 ^ 0xA9;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(var1[4], var1[5], var1[0]);
        if (u.var7(Movement.shouldWalk() ? 1 : 0)) {
            return var1[2];
        }
        Movement.walkTo((WorldPoint)worldPoint);
        0;
        return var1[2];
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var1[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var1[0];
        while (u.var6(var16, var15)) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var24(Object object) {
        return object != null;
    }

    private static boolean var25(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public TeleportingToBarrowsTask(SquireBarrows squireBarrows) {
        this.ag = squireBarrows;
    }

    private static boolean var26(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        block9: {
            u var27;
            block8: {
                if (u.var5(Game.getState(), GameState.LOGGED_IN)) {
                    return var1[0];
                }
                if (u.var26(var27.ag.TeleportingToBarrowsTask() ? 1 : 0)) {
                    return var1[0];
                }
                if (u.var7(Movement.isRunEnabled() ? 1 : 0) && u.var25(Movement.getRunEnergy(), var1[1])) {
                    Movement.toggleRun();
                }
                if (!u.var7(var27.ag.h() ? 1 : 0) || u.var26(var27.ag.m() ? 1 : 0)) {
                    return var1[0];
                }
                String[] stringArray = new String[var1[2]];
                stringArray[u.var1[0]] = var2[var1[0]];
                TileObject var28 = TileObjects.getNearest((String[])stringArray);
                if (!u.var24(var28)) break block8;
                String[] stringArray2 = new String[var1[2]];
                stringArray2[u.var1[0]] = var2[var1[2]];
                if (!u.var7(var28.hasAction(stringArray2) ? 1 : 0)) break block9;
            }
            return var27.J();
        }
        if (u.var26(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[3]]);
        return var1[2];
    }
}

