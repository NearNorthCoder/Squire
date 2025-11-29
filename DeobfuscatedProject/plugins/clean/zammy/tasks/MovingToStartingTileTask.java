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
import m.e.a.i.z.m.r.-.q.s.y.u.d;
import gg.squire.zammy.tasks.LHelper;
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

    private static boolean llIIIlIIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIIlllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIIlllIllI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        D.llIIIlIIlllIIlI();
    }

    private static boolean llIIIlIIlllIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        D var1;
        if (D.llIIIlIIlllIIll(this.aG.B() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        d var2 = var1.aG.I();
        if (D.llIIIlIIlllIlII(var2) && D.llIIIlIIlllIlIl(var2.l() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        if (D.llIIIlIIlllIlIl(var1.aG.A() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        if (D.llIIIlIIlllIlIl(var1.aG.MovingToStartingTileTask() ? 1 : 0) && D.llIIIlIIlllIllI(var1.aG.z(), lIllIIIlIlIIl[1])) {
            return lIllIIIlIlIIl[0];
        }
        Player var3 = Players.getLocal();
        if (D.llIIIlIIlllIlIl(var3.isMoving() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        WorldPoint var4 = var1.aH.i();
        if (D.llIIIlIIlllIlIl(var3.getWorldLocation().equals((Object)var4) ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        Movement.walkTo((WorldPoint)var3_3);

        return lIllIIIlIlIIl[2];
    }

}

