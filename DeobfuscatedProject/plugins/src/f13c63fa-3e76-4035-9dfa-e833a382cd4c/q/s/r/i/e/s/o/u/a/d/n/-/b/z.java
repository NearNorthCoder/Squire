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
import q.s.r.i.e.s.o.u.a.d.n.-.b.a;
import q.s.r.i.e.s.o.u.a.d.n.-.b.d;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@TaskDesc(name="Moving to starting tile")
public class z
extends Task {
    private final /* synthetic */ e aA;
    private final /* synthetic */ d aB;
    private static /* synthetic */ int[] lllIIIIIIII;

    private static void lIlIllIIlIIlII() {
        lllIIIIIIII = new int[3];
        z.lllIIIIIIII[0] = "   ".length() & ~"   ".length();
        z.lllIIIIIIII[1] = 20 + 87 - 37 + 59 ^ 81 + 90 - 32 + 2;
        z.lllIIIIIIII[2] = " ".length();
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
        z llllllllllllllllIIlIlIIlIIIlIlII;
        if (z.lIlIllIIlIIlIl(this.aA.t() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        a llllllllllllllllIIlIlIIlIIIlIIll = llllllllllllllllIIlIlIIlIIIlIlII.aA.z();
        if (z.lIlIllIIlIIllI(llllllllllllllllIIlIlIIlIIIlIIll) && z.lIlIllIIlIIlll(llllllllllllllllIIlIlIIlIIIlIIll.b() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        if (z.lIlIllIIlIIlll(llllllllllllllllIIlIlIIlIIIlIlII.aA.s() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        if (z.lIlIllIIlIIlll(llllllllllllllllIIlIlIIlIIIlIlII.aA.v() ? 1 : 0) && z.lIlIllIIlIlIII(llllllllllllllllIIlIlIIlIIIlIlII.aA.r(), lllIIIIIIII[1])) {
            return lllIIIIIIII[0];
        }
        Player llllllllllllllllIIlIlIIlIIIlIIlI = Players.getLocal();
        if (z.lIlIllIIlIIlll(llllllllllllllllIIlIlIIlIIIlIIlI.isMoving() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        WorldPoint llllllllllllllllIIlIlIIlIIIlIIIl = llllllllllllllllIIlIlIIlIIIlIlII.aB.p();
        if (z.lIlIllIIlIIlll(llllllllllllllllIIlIlIIlIIIlIIlI.getWorldLocation().equals((Object)llllllllllllllllIIlIlIIlIIIlIIIl) ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        Movement.walkTo((WorldPoint)var3_3);
        "".length();
        return lllIIIIIIII[2];
    }
}

