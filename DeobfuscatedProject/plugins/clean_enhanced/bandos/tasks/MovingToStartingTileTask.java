/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.bandos.tasks.AHelper;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Moving to starting tile")
public class MovingToStartingTileTask
extends Task {
    private final  e aA;
    private final  d aB;

    private static void var2() {
        var1 = new int[3];
        z.var1[0] = 3 & ~3;
        z.var1[1] = 20 + 87 - 37 + 59 ^ 81 + 90 - 32 + 2;
        z.var1[2] = 1;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    static {
        z.var2();
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    @Inject
    public MovingToStartingTileTask(e e2, d d2) {
        this.aA = e2;
        this.aB = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        z var7;
        if (z.var6(this.aA.t() ? 1 : 0)) {
            return var1[0];
        }
        a var8 = var7.aA.MovingToStartingTileTask();
        if (z.var3(var8) && z.var5(var8.b() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var5(var7.aA.s() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var5(var7.aA.v() ? 1 : 0) && z.var4(var7.aA.r(), var1[1])) {
            return var1[0];
        }
        Player var9 = Players.getLocal();
        if (z.var5(var9.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var10 = var7.aB.p();
        if (z.var5(var9.getWorldLocation().equals((Object)var10) ? 1 : 0)) {
            return var1[0];
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        return var1[2];
    }
}

