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
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.JHelper;
import gg.squire.saradomin.tasks.LHelper;

@TaskDesc(name="Returning back to starting tile", blocking=true)
public class ReturningBackToStartingTileTask
extends Task {
    
    private final  l aN;
    private final  g aM;
    private final  d aO;

    public boolean run() {
        G var2;
        if (G.var3(this.aM.m() ? 1 : 0)) {
            return var1[0];
        }
        j var4 = var2.aM.t();
        if (G.var5(var4) && G.var6(var4.B() ? 1 : 0)) {
            return var1[0];
        }
        if (G.var6(var2.aM.l() ? 1 : 0)) {
            return var1[0];
        }
        if (G.var7(var2.aM.k(), var1[1]) && (!G.var3(var2.aM.o() ? 1 : 0) || G.var6(var2.aO.i().isPresent() ? 1 : 0))) {
            return var1[0];
        }
        WorldPoint var8 = var2.aN.N();
        if (G.var6(Movement.shouldWalk() ? 1 : 0) && G.var3(var8.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var8);
        }
        return var1[2];
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public ReturningBackToStartingTileTask(g g2, l l2, d d2) {
        this.aM = g2;
        this.aN = l2;
        this.aO = d2;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static void var9() {
        var1 = new int[3];
        G.var1[0] = (41 + 21 - 36 + 132 ^ 83 + 44 - 88 + 92) & (0x5C ^ 0x62 ^ (0xE5 ^ 0xC6) ^ -1);
        G.var1[1] = 0x62 ^ 0x7C ^ (0x5E ^ 0x4A);
        G.var1[2] = 1;
    }

    static {
        G.var9();
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }
}

