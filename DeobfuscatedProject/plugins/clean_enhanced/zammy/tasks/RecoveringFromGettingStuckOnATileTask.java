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
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Recovering from getting stuck on a tile")
public class RecoveringFromGettingStuckOnATileTask
extends Task {
    private final  l af;
    
    private final  c ag;

    @Inject
    public RecoveringFromGettingStuckOnATileTask(l l2, c c2) {
        this.af = l2;
        this.ag = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t var2;
        if ((this.af.B( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.af.G( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.af.A( == 0) ? 1 : 0)) {
            return 0;
        }
        if (!(var2.ag.e( == null)) || (Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 0;
        }
        WorldPoint var3 = var2.ag.g();
        if var3 == null {
            return 0;
        }
        Movement.walkTo((WorldPoint)var1_1);
        0;
        return 1;
    }

    static {
        t.var4();
    }
}

