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
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Recovering from getting stuck on a tile")
public class RecoveringFromGettingStuckOnATileTask
extends Task {
    private final  l af;
    
    private final  c ag;

    private static boolean llIIIlIlIIIIlII(Object object) {
        return object == null;
    }

    @Inject
    public RecoveringFromGettingStuckOnATileTask(l l2, c c2) {
        this.af = l2;
        this.ag = c2;
    }

    private static boolean llIIIlIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t var1;
        if (t.llIIIlIlIIIIIll(this.af.B() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        if (t.llIIIlIlIIIIIll(var1.af.G() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        if (t.llIIIlIlIIIIIll(var1.af.A() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        if (!t.llIIIlIlIIIIlII(var1.ag.e()) || t.llIIIlIlIIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        WorldPoint var2 = var1.ag.g();
        if (t.llIIIlIlIIIIlII(var2)) {
            return lIllIIIlIllIl[0];
        }
        Movement.walkTo((WorldPoint)var1_1);

        return lIllIIIlIllIl[1];
    }

    private static boolean llIIIlIlIIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        t.llIIIlIlIIIIIlI();
    }
}

