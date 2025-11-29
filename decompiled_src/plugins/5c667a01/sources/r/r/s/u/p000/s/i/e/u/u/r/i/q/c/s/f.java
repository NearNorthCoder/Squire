package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Toggling run", priority = 2146483647)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.f  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/f.class */
public class f extends Task {
    private final /* synthetic */ SquireScurrius M;
    private static /* synthetic */ int[] lIIlIlIlllIll;
    private final /* synthetic */ SquireScurriusConfig N;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (!lIlIllIIIllllIl(Movement.isRunEnabled() ? 1 : 0) && !lIlIllIIIlllllI(Movement.getRunEnergy(), lIIlIlIlllIll[1])) {
            Movement.toggleRun();
            return lIIlIlIlllIll[2];
        }
        return lIIlIlIlllIll[0];
    }

    @Inject
    f(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.M = squireScurrius;
        this.N = squireScurriusConfig;
    }

    static {
        lIlIllIIIllllII();
    }

    private static void lIlIllIIIllllII() {
        lIIlIlIlllIll = new int[3];
        lIIlIlIlllIll[0] = "   ".length() & ("   ".length() ^ (-1));
        lIIlIlIlllIll[1] = (51 ^ 98) ^ (155 ^ 192);
        lIIlIlIlllIll[2] = " ".length();
    }

    private static boolean lIlIllIIIllllIl(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIIlllllI(int i, int i2) {
        return i < i2;
    }
}
