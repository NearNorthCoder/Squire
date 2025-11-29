/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.T;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.v;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Default step", priority=-1)
public class R
extends T<w> {
    private static /* synthetic */ int[] lIIllIlllIIl;

    private static boolean llIIlllllllIII(Object object) {
        return object != null;
    }

    private static void llIIllllllIlIl() {
        lIIllIlllIIl = new int[2];
        R.lIIllIlllIIl[0] = (0xA6 ^ 0xBD) & ~(0x1C ^ 7);
        R.lIIllIlllIIl[1] = "  ".length();
    }

    private static boolean llIIllllllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllllllIlll(int n2) {
        return n2 == 0;
    }

    @Inject
    public R(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, w.class);
    }

    private static boolean llIIlllllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(w w2, o o2) {
        WorldPoint lllllllllllllllIlllIllIIlIllllII;
        void lllllllllllllllIlllIllIIlIlllllI;
        if (R.llIIllllllIllI(this.cd.a(w2) ? 1 : 0)) {
            return lIIllIlllIIl[0];
        }
        Player lllllllllllllllIlllIllIIlIllllIl = Players.getLocal();
        if (R.llIIllllllIllI(lllllllllllllllIlllIllIIlIllllIl.isMoving() ? 1 : 0) && R.llIIllllllIlll(lllllllllllllllIlllIllIIlIlllllI instanceof v) && R.llIIlllllllIII(lllllllllllllllIlllIllIIlIllllII = Movement.getDestination()) && R.llIIlllllllIIl(lllllllllllllllIlllIllIIlIllllII.distanceTo(lllllllllllllllIlllIllIIlIllllIl.getWorldLocation()), lIIllIlllIIl[1])) {
            return lIIllIlllIIl[0];
        }
        return w2.c(this.cb.a());
    }

    static {
        R.llIIllllllIlIl();
    }
}

