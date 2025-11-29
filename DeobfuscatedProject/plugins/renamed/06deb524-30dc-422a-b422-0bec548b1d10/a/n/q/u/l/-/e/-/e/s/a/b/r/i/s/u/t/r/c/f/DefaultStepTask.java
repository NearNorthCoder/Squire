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

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.T_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.v_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Default step -> DefaultstepTask */
@TaskDesc(name="Default step", priority=-1)
public class DefaultStepTask
extends T_Unknown<w> {
    private static /* synthetic */ int[] lIIllIlllIIl;

    private static boolean llIIlllllllIII(Object object) {
        return object != null;
    }

    private static void llIIllllllIlIl() {
        lIIllIlllIIl = new int[2];
        R.lIIllIlllIIl[0] = (0xA6 ^ 0xBD) & ~(0x1C ^ 7);
        R.lIIllIlllIIl[1] = 2;
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
        WorldPoint var3;
        void var2;
        if (R.llIIllllllIllI(this.cd.a(w2) ? 1 : 0)) {
            return lIIllIlllIIl[0];
        }
        Player var1 = Players.getLocal();
        if (R.llIIllllllIllI(var1.isMoving() ? 1 : 0) && R.llIIllllllIlll(var2 instanceof v) && R.llIIlllllllIII(var3 = Movement.getDestination()) && R.llIIlllllllIIl(var3.distanceTo(var1.getWorldLocation()), lIIllIlllIIl[1])) {
            return lIIllIlllIIl[0];
        }
        return w2.c(this.cb.a());
    }

    static {
        R.llIIllllllIlIl();
    }
}

