package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving to starting tile")
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.z  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/z.class */
public class z extends Task {
    private final /* synthetic */ e aA;
    private final /* synthetic */ d aB;
    private static /* synthetic */ int[] lllIIIIIIII;

    private static void lIlIllIIlIIlII() {
        lllIIIIIIII = new int[3];
        lllIIIIIIII[0] = "   ".length() & ("   ".length() ^ (-1));
        lllIIIIIIII[1] = (((20 + 87) - 37) + 59) ^ (((81 + 90) - 32) + 2);
        lllIIIIIIII[2] = " ".length();
    }

    private static boolean lIlIllIIlIIllI(Object obj) {
        return obj != null;
    }

    static {
        lIlIllIIlIIlII();
    }

    private static boolean lIlIllIIlIlIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIIlIIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIlIIlIl(int i) {
        return i == 0;
    }

    @Inject
    public z(e eVar, d dVar) {
        this.aA = eVar;
        this.aB = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        if (lIlIllIIlIIlIl(this.aA.t() ? 1 : 0)) {
            return lllIIIIIIII[0];
        }
        C0000a z = this.aA.z();
        if ((!lIlIllIIlIIllI(z) || !lIlIllIIlIIlll(z.b() ? 1 : 0)) && !lIlIllIIlIIlll(this.aA.s() ? 1 : 0)) {
            if (lIlIllIIlIIlll(this.aA.v() ? 1 : 0) && lIlIllIIlIlIII(this.aA.r(), lllIIIIIIII[1])) {
                return lllIIIIIIII[0];
            }
            Player local = Players.getLocal();
            if (lIlIllIIlIIlll(local.isMoving() ? 1 : 0)) {
                return lllIIIIIIII[0];
            }
            WorldPoint p = this.aB.p();
            if (lIlIllIIlIIlll(local.getWorldLocation().equals(p) ? 1 : 0)) {
                return lllIIIIIIII[0];
            }
            Movement.walkTo(p);
            "".length();
            return lllIIIIIIII[2];
        }
        return lllIIIIIIII[0];
    }
}
