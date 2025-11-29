package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Recovering from getting stuck on a tile", priority = 10)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.v  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/v.class */
public class v extends Task {
    private final /* synthetic */ C0006g ak;
    private static /* synthetic */ int[] lIIlIlIIlIIlI;
    private final /* synthetic */ l al;

    @Inject
    public v(C0006g c0006g, l lVar) {
        this.ak = c0006g;
        this.al = lVar;
    }

    private static boolean lIlIlIllIllIlll(int i) {
        return i == 0;
    }

    private static boolean lIlIlIllIlllIIl(int i) {
        return i != 0;
    }

    private static void lIlIlIllIllIllI() {
        lIIlIlIIlIIlI = new int[2];
        lIIlIlIIlIIlI[0] = ((143 ^ 197) ^ (146 ^ 187)) & (((148 ^ 142) ^ (200 ^ 177)) ^ (-" ".length()));
        lIIlIlIIlIIlI[1] = " ".length();
    }

    private static boolean lIlIlIllIlllIII(Object obj) {
        return obj == null;
    }

    static {
        lIlIlIllIllIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public boolean run() {
        if (!lIlIlIllIllIlll(this.ak.m() ? 1 : 0) && !lIlIlIllIllIlll(this.ak.l() ? 1 : 0)) {
            if (!lIlIlIllIlllIII(this.al.M()) || lIlIlIllIlllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                return lIIlIlIIlIIlI[0];
            }
            WorldPoint Q = this.al.Q();
            if (lIlIlIllIlllIII(Q)) {
                return lIIlIlIIlIIlI[0];
            }
            Movement.walkTo(Q);
            "".length();
            return lIIlIlIIlIIlI[1];
        }
        return lIIlIlIIlIIlI[0];
    }
}
