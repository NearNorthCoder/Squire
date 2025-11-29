package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Stopping plugin", priority = 8, register = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.j  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/j.class */
public class j extends Task {
    private final /* synthetic */ c Q;
    private static /* synthetic */ int[] lIIlIllllIIIl;
    private static final /* synthetic */ Logger O;
    private final /* synthetic */ SquireShamansPlugin P;

    @Inject
    public j(SquireShamansPlugin squireShamansPlugin, c cVar) {
        this.P = squireShamansPlugin;
        this.Q = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean run() {
        if (!lIlIllIlllllIll(this.P.i() ? 1 : 0) && !lIlIllIlllllIll(this.Q.s() ? 1 : 0)) {
            this.P.forceStop();
            return lIIlIllllIIIl[1];
        }
        return lIIlIllllIIIl[0];
    }

    static {
        lIlIllIlllllIlI();
        O = LoggerFactory.getLogger(j.class);
    }

    private static boolean lIlIllIlllllIll(int i) {
        return i == 0;
    }

    private static void lIlIllIlllllIlI() {
        lIIlIllllIIIl = new int[2];
        lIIlIllllIIIl[0] = ((14 ^ 66) ^ (109 ^ 50)) & (((14 ^ 49) ^ (132 ^ 168)) ^ (-" ".length()));
        lIIlIllllIIIl[1] = " ".length();
    }
}
