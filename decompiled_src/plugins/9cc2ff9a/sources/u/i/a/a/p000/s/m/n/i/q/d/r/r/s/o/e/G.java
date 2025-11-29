package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Returning back to starting tile", blocking = true)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.G  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/G.class */
public class G extends Task {
    private static /* synthetic */ int[] lIIlIIllllllI;
    private final /* synthetic */ l aN;
    private final /* synthetic */ C0006g aM;
    private final /* synthetic */ C0003d aO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    public boolean run() {
        if (lIlIlIlIllIllIl(this.aM.m() ? 1 : 0)) {
            return lIIlIIllllllI[0];
        }
        j t = this.aM.t();
        if ((!lIlIlIlIllIlllI(t) || !lIlIlIlIllIllll(t.B() ? 1 : 0)) && !lIlIlIlIllIllll(this.aM.l() ? 1 : 0)) {
            if (!lIlIlIlIlllIIII(this.aM.k(), lIIlIIllllllI[1]) || (lIlIlIlIllIllIl(this.aM.o() ? 1 : 0) && !lIlIlIlIllIllll(this.aO.i().isPresent() ? 1 : 0))) {
                WorldPoint N = this.aN.N();
                if (lIlIlIlIllIllll(Movement.shouldWalk() ? 1 : 0) && lIlIlIlIllIllIl(N.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walk(N);
                }
                return lIIlIIllllllI[2];
            }
            return lIIlIIllllllI[0];
        }
        return lIIlIIllllllI[0];
    }

    private static boolean lIlIlIlIllIllIl(int i) {
        return i == 0;
    }

    private static boolean lIlIlIlIlllIIII(int i, int i2) {
        return i > i2;
    }

    @Inject
    public G(C0006g c0006g, l lVar, C0003d c0003d) {
        this.aM = c0006g;
        this.aN = lVar;
        this.aO = c0003d;
    }

    private static boolean lIlIlIlIllIlllI(Object obj) {
        return obj != null;
    }

    private static void lIlIlIlIllIllII() {
        lIIlIIllllllI = new int[3];
        lIIlIIllllllI[0] = ((((41 + 21) - 36) + 132) ^ (((83 + 44) - 88) + 92)) & (((92 ^ 98) ^ (229 ^ 198)) ^ (-" ".length()));
        lIIlIIllllllI[1] = (98 ^ 124) ^ (94 ^ 74);
        lIIlIIllllllI[2] = " ".length();
    }

    static {
        lIlIlIlIllIllII();
    }

    private static boolean lIlIlIlIllIllll(int i) {
        return i != 0;
    }
}
