/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.movement.Movement
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to random tile", priority=12, blocking=true)
public class ac
extends n {
    private static /* synthetic */ int[] llIIllIIIlll;
    private final /* synthetic */ RectangularArea cm;

    private static void llllllIIlllIlI() {
        llIIllIIIlll = new int[7];
        ac.llIIllIIIlll[0] = " ".length();
        ac.llIIllIIIlll[1] = (0xDD ^ 0xA9 ^ (0xF2 ^ 0xC4)) & (62 + 107 - 67 + 27 ^ 116 + 128 - 228 + 179 ^ -" ".length());
        ac.llIIllIIIlll[2] = -(0xFFFFF46D & 0x6F97) & (0xFFFFFFFF & 0x6FD7);
        ac.llIIllIIIlll[3] = 0xFFFFD7FC & 0x3FEF;
        ac.llIIllIIIlll[4] = 0xFFFFAFDD & 0x5BFF;
        ac.llIIllIIIlll[5] = 0xFFFFF7ED & 0x1FFF;
        ac.llIIllIIIlll[6] = 96 + 104 - 45 + 10 ^ 6 + 192 - 134 + 129;
    }

    @Inject
    public ac(c c2) {
        d[] dArray = new d[llIIllIIIlll[0]];
        dArray[ac.llIIllIIIlll[1]] = d.OUTSIDE;
        super(c2, dArray);
        this.cm = new RectangularArea(llIIllIIIlll[2], llIIllIIIlll[3], llIIllIIIlll[4], llIIllIIIlll[5], llIIllIIIlll[0]);
    }

    private static boolean llllllIIlllIll(int n2) {
        return n2 == 0;
    }

    static {
        ac.llllllIIlllIlI();
    }

    @Override
    public boolean be() {
        if (ac.llllllIIlllIll(this.ba.h().waitAfterAttempt() ? 1 : 0)) {
            return llIIllIIIlll[1];
        }
        if (ac.llllllIIllllII(Movement.shouldWalk() ? 1 : 0)) {
            ac lllllllllllllllIlIIlIllIlllIlIIl;
            Movement.walkTo((WorldPoint)lllllllllllllllIlIIlIllIlllIlIIl.cm.getRandomTile());
            "".length();
            lllllllllllllllIlIIlIllIlllIlIIl.sleep(llIIllIIIlll[6]);
            return llIIllIIIlll[0];
        }
        return llIIllIIIlll[1];
    }

    private static boolean llllllIIllllII(int n2) {
        return n2 != 0;
    }
}

