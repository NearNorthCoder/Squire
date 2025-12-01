package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/j.class */
public abstract class j extends Task {
    protected final /* synthetic */ SquireGiantsFoundry U;
    protected final /* synthetic */ SquireGiantsConfig V;
    protected final /* synthetic */ a T;
    private static /* synthetic */ int[] llIlIlIIllIl;
    protected static final /* synthetic */ int S;

    private static boolean lIIIIIlIllllIlI(int i) {
        return i != 0;
    }

    @Inject
    public j(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        this.T = aVar;
        this.U = squireGiantsFoundry;
        this.V = squireGiantsConfig;
    }

    private static void lIIIIIlIllllIIl() {
        llIlIlIIllIl = new int[2];
        llIlIlIIllIl[0] = ((178 ^ 188) ^ (254 ^ 173)) & (((197 ^ 144) ^ (60 ^ 52)) ^ (-" ".length()));
        llIlIlIIllIl[1] = (-4098) & 48873;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    public boolean run() {
        if (!lIIIIIlIllllIlI(this.T.f() ? 1 : 0) && !lIIIIIlIllllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return M();
        }
        return llIlIlIIllIl[0];
    }

    public abstract boolean M();

    static {
        lIIIIIlIllllIIl();
        S = llIlIlIIllIl[1];
    }
}
