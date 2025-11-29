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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.d;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to starting tile")
public class D
extends Task {
    private final /* synthetic */ l aG;
    private final /* synthetic */ c aH;
    private static /* synthetic */ int[] lIllIIIlIlIIl;

    @Inject
    public D(l l2, c c2) {
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
        D llllllllllllllIllIIlIlllIIllIIll;
        if (D.llIIIlIIlllIIll(this.aG.B() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        d llllllllllllllIllIIlIlllIIllIIlI = llllllllllllllIllIIlIlllIIllIIll.aG.I();
        if (D.llIIIlIIlllIlII(llllllllllllllIllIIlIlllIIllIIlI) && D.llIIIlIIlllIlIl(llllllllllllllIllIIlIlllIIllIIlI.l() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        if (D.llIIIlIIlllIlIl(llllllllllllllIllIIlIlllIIllIIll.aG.A() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        if (D.llIIIlIIlllIlIl(llllllllllllllIllIIlIlllIIllIIll.aG.D() ? 1 : 0) && D.llIIIlIIlllIllI(llllllllllllllIllIIlIlllIIllIIll.aG.z(), lIllIIIlIlIIl[1])) {
            return lIllIIIlIlIIl[0];
        }
        Player llllllllllllllIllIIlIlllIIllIIIl = Players.getLocal();
        if (D.llIIIlIIlllIlIl(llllllllllllllIllIIlIlllIIllIIIl.isMoving() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        WorldPoint llllllllllllllIllIIlIlllIIllIIII = llllllllllllllIllIIlIlllIIllIIll.aH.i();
        if (D.llIIIlIIlllIlIl(llllllllllllllIllIIlIlllIIllIIIl.getWorldLocation().equals((Object)llllllllllllllIllIIlIlllIIllIIII) ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        Movement.walkTo((WorldPoint)var3_3);
        "".length();
        return lIllIIIlIlIIl[2];
    }

    private static void llIIIlIIlllIIlI() {
        lIllIIIlIlIIl = new int[3];
        D.lIllIIIlIlIIl[0] = (0xC5 ^ 0xA0 ^ (0x21 ^ 0x40)) & (104 + 112 - 157 + 104 ^ 43 + 153 - 160 + 131 ^ -" ".length());
        D.lIllIIIlIlIIl[1] = 0x13 ^ 0x19;
        D.lIllIIIlIlIIl[2] = " ".length();
    }
}

