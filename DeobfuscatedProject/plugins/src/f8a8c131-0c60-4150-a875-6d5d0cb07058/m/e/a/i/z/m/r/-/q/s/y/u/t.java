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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Recovering from getting stuck on a tile")
public class t
extends Task {
    private final /* synthetic */ l af;
    private static /* synthetic */ int[] lIllIIIlIllIl;
    private final /* synthetic */ c ag;

    private static boolean llIIIlIlIIIIlII(Object object) {
        return object == null;
    }

    @Inject
    public t(l l2, c c2) {
        this.af = l2;
        this.ag = c2;
    }

    private static void llIIIlIlIIIIIlI() {
        lIllIIIlIllIl = new int[2];
        t.lIllIIIlIllIl[0] = (0x7A ^ 0x7D) & ~(0xE ^ 9);
        t.lIllIIIlIllIl[1] = " ".length();
    }

    private static boolean llIIIlIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t llllllllllllllIllIIlIlllIIlIIIll;
        if (t.llIIIlIlIIIIIll(this.af.B() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        if (t.llIIIlIlIIIIIll(llllllllllllllIllIIlIlllIIlIIIll.af.G() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        if (t.llIIIlIlIIIIIll(llllllllllllllIllIIlIlllIIlIIIll.af.A() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        if (!t.llIIIlIlIIIIlII(llllllllllllllIllIIlIlllIIlIIIll.ag.e()) || t.llIIIlIlIIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIlIllIl[0];
        }
        WorldPoint llllllllllllllIllIIlIlllIIlIIIlI = llllllllllllllIllIIlIlllIIlIIIll.ag.g();
        if (t.llIIIlIlIIIIlII(llllllllllllllIllIIlIlllIIlIIIlI)) {
            return lIllIIIlIllIl[0];
        }
        Movement.walkTo((WorldPoint)var1_1);
        "".length();
        return lIllIIIlIllIl[1];
    }

    private static boolean llIIIlIlIIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        t.llIIIlIlIIIIIlI();
    }
}

