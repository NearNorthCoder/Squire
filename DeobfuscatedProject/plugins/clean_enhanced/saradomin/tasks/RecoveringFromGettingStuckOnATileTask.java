/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.LHelper;

@TaskDesc(name="Recovering from getting stuck on a tile", priority=10)
public class RecoveringFromGettingStuckOnATileTask
extends Task {
    private final  g ak;
    
    private final  l al;

    @Inject
    public RecoveringFromGettingStuckOnATileTask(g g2, l l2) {
        this.ak = g2;
        this.al = l2;
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new int[2];
        v.var1[0] = (0x8F ^ 0xC5 ^ (0x92 ^ 0xBB)) & (0x94 ^ 0x8E ^ (0xC8 ^ 0xB1) ^ -1);
        v.var1[1] = 1;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        v.var4();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        v var6;
        if (v.var2(this.ak.m() ? 1 : 0)) {
            return var1[0];
        }
        if (v.var2(var6.ak.l() ? 1 : 0)) {
            return var1[0];
        }
        if (!v.var5(var6.al.M()) || v.var3(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var7 = var6.al.Q();
        if (v.var5(var7)) {
            return var1[0];
        }
        Movement.walkTo((WorldPoint)var1_1);
        0;
        return var1[1];
    }
}

