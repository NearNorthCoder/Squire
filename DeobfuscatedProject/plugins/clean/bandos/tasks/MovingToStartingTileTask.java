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
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Moving to starting tile")
public class MovingToStartingTileTask
extends Task {
    private final  e aA;
    private final  d aB;

    private static boolean lIlIllIIlIIllI(Object object) {
        return object != null;
    }

    static {
        z.lIlIllIIlIIlII();
    }

    private static boolean lIlIllIIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlIIlIl(int n2) {
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
        z var1;
        if (z.lIlIllIIlIIlIl(this.aA.t() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        a var2 = var1.aA.MovingToStartingTileTask();
        if (z.lIlIllIIlIIllI(var2) && z.lIlIllIIlIIlll(var2.b() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        if (z.lIlIllIIlIIlll(var1.aA.s() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        if (z.lIlIllIIlIIlll(var1.aA.v() ? 1 : 0) && z.lIlIllIIlIlIII(var1.aA.r(), lllIIIIIIII[1])) {
            return lllIIIIIIII[0];
        }
        Player var3 = Players.getLocal();
        if (z.lIlIllIIlIIlll(var3.isMoving() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        WorldPoint var4 = var1.aB.p();
        if (z.lIlIllIIlIIlll(var3.getWorldLocation().equals((Object)var4) ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        Movement.walkTo((WorldPoint)var3_3);

        return lllIIIIIIII[2];
    }
}

