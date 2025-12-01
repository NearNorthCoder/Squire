package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Default step", priority = -1)
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.R  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/R.class */
public class R extends T<w> {
    private static /* synthetic */ int[] lIIllIlllIIl;

    private static boolean llIIlllllllIII(Object obj) {
        return obj != null;
    }

    private static void llIIllllllIlIl() {
        lIIllIlllIIl = new int[2];
        lIIllIlllIIl[0] = (166 ^ 189) & ((28 ^ 7) ^ (-1));
        lIIllIlllIIl[1] = "  ".length();
    }

    private static boolean llIIllllllIllI(int i) {
        return i != 0;
    }

    private static boolean llIIllllllIlll(int i) {
        return i == 0;
    }

    @Inject
    public R(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, w.class);
    }

    private static boolean llIIlllllllIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.T
    public boolean a(w wVar, C0014o c0014o) {
        if (llIIllllllIllI(this.cd.a(wVar) ? 1 : 0)) {
            return lIIllIlllIIl[0];
        }
        Player local = Players.getLocal();
        if (llIIllllllIllI(local.isMoving() ? 1 : 0) && llIIllllllIlll(wVar instanceof v ? 1 : 0)) {
            WorldPoint destination = Movement.getDestination();
            if (llIIlllllllIII(destination) && llIIlllllllIIl(destination.distanceTo(local.getWorldLocation()), lIIllIlllIIl[1])) {
                return lIIllIlllIIl[0];
            }
        }
        return wVar.c(this.cb.a());
    }

    static {
        llIIllllllIlIl();
    }
}
