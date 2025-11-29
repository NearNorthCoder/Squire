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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.s.r.i.e.s.o.u.a.d.n.-.b.a_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.d_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;

/* TASK: Moving to starting tile -> MovingtostartingtileTask */
@TaskDesc(name="Moving to starting tile")
public class MovingToStartingTileTask
extends Task {
    private final /* synthetic */ e aA;
    private final /* synthetic */ d aB;
    private static /* synthetic */ int[] lllIIIIIIII;

    private static void lIlIllIIlIIlII() {
        lllIIIIIIII = new int[3];
        z.lllIIIIIIII[0] = 3 & ~3;
        z.lllIIIIIIII[1] = 20 + 87 - 37 + 59 ^ 81 + 90 - 32 + 2;
        z.lllIIIIIIII[2] = 1;
    }

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
    public z(e e2, d d2) {
        this.aA = e2;
        this.aB = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        z var3;
        if (z.lIlIllIIlIIlIl(this.aA.t() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        a var4 = var3.aA.z();
        if (z.lIlIllIIlIIllI(var4) && z.lIlIllIIlIIlll(var4.b() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        if (z.lIlIllIIlIIlll(var3.aA.s() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        if (z.lIlIllIIlIIlll(var3.aA.v() ? 1 : 0) && z.lIlIllIIlIlIII(var3.aA.r(), lllIIIIIIII[1])) {
            return lllIIIIIIII[0];
        }
        Player var1 = Players.getLocal();
        if (z.lIlIllIIlIIlll(var1.isMoving() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        WorldPoint var2 = var3.aB.p();
        if (z.lIlIllIIlIIlll(var1.getWorldLocation().equals((Object)var2) ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        return lllIIIIIIII[2];
    }
}

