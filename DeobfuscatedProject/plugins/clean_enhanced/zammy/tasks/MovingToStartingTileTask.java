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
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.DHelper;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to starting tile")
public class MovingToStartingTileTask
extends Task {
    private final  l aG;
    private final  c aH;

    @Inject
    public MovingToStartingTileTask(l l2, c c2) {
        this.aG = l2;
        this.aH = c2;
    }

    static {
        D.var2();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        D var3;
        if ((this.aG.B( == 0) ? 1 : 0)) {
            return 0;
        }
        d var4 = var3.aG.I();
        if (var4 != null && (var4.l( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.aG.A( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.aG.MovingToStartingTileTask( != 0) ? 1 : 0) && (var3.aG.z() > 1)) {
            return 0;
        }
        Player var5 = Players.getLocal();
        if ((var5.isMoving( != 0) ? 1 : 0)) {
            return 0;
        }
        WorldPoint var6 = var3.aH.i();
        if ((var5.getWorldLocation( != 0).equals((Object)var6) ? 1 : 0)) {
            return 0;
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        return 2;
    }
}

