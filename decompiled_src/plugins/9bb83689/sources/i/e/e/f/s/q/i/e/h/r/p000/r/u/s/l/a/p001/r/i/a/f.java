package i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to spot", priority = 5, blocking = true)
/* renamed from: i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.f  reason: invalid package */
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:i/e/e/f/s/q/i/e/h/r/-/r/u/s/l/a/-/r/i/a/f.class */
public class f extends Task {
    private static final /* synthetic */ WorldPoint m;
    private static /* synthetic */ int[] lIlIllIlllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIIlIIlllIlIll(Players.getLocal().getWorldLocation().equals(m) ? 1 : 0)) {
            return lIlIllIlllI[0];
        }
        Movement.setDestination(m);
        return lIlIllIlllI[1];
    }

    private static void lIIlIIlllIlIlI() {
        lIlIllIlllI = new int[4];
        lIlIllIlllI[0] = ((51 ^ 66) ^ (26 ^ 123)) & (((147 ^ 132) ^ (131 ^ 132)) ^ (-" ".length()));
        lIlIllIlllI[1] = " ".length();
        lIlIllIlllI[2] = (-27285) & 28660;
        lIlIllIlllI[3] = (-8275) & 11903;
    }

    static {
        lIIlIIlllIlIlI();
        m = new WorldPoint(lIlIllIlllI[2], lIlIllIlllI[3], lIlIllIlllI[0]);
    }

    private static boolean lIIlIIlllIlIll(int i2) {
        return i2 != 0;
    }
}
