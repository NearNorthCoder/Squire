package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Toggling run", priority = Integer.MAX_VALUE)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.n  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/n.class */
public class n extends Task {
    private static /* synthetic */ int[] lIlIlIIIIlIll;
    private final /* synthetic */ SquireVardorvis ad;
    private final /* synthetic */ SquireVardorvisConfig ae;

    @Inject
    n(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.ad = squireVardorvis;
        this.ae = squireVardorvisConfig;
    }

    private static boolean lIllllIlIIIllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllllIlIIIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (!lIllllIlIIIlllI(Movement.isRunEnabled() ? 1 : 0) && !lIllllIlIIIllll(Movement.getRunEnergy(), lIlIlIIIIlIll[1])) {
            Movement.toggleRun();
            return lIlIlIIIIlIll[2];
        }
        return lIlIlIIIIlIll[0];
    }

    private static void lIllllIlIIIllIl() {
        lIlIlIIIIlIll = new int[3];
        lIlIlIIIIlIll[0] = (74 ^ 24) & ((211 ^ 129) ^ (-1));
        lIlIlIIIIlIll[1] = (((125 + 136) - 131) + 23) ^ (((100 + 82) - 139) + 104);
        lIlIlIIIIlIll[2] = " ".length();
    }

    static {
        lIllllIlIIIllIl();
    }
}
