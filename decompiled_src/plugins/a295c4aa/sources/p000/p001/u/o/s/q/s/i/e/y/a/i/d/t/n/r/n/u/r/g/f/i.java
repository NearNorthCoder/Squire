package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.Task;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.entities.Players;
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/i.class */
public abstract class i extends Task {
    protected final /* synthetic */ Client Q;
    protected final /* synthetic */ g R;
    private static /* synthetic */ int[] llIlIlllIIII;
    protected final /* synthetic */ a P;

    private static boolean lIIIIIlllllIIlI(int i) {
        return i != 0;
    }

    private static void lIIIIIllllIlllI() {
        llIlIlllIIII = new int[2];
        llIlIlllIIII[0] = (164 ^ 133) & ((49 ^ 16) ^ (-1));
        llIlIlllIIII[1] = -" ".length();
    }

    static {
        lIIIIIllllIlllI();
    }

    private static boolean lIIIIIllllIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIIIlllllIIIl(int i) {
        return i == 0;
    }

    protected abstract boolean N();

    private static boolean lIIIIIlllllIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    public boolean run() {
        if (!lIIIIIllllIllll(this.P.k(), this.R) && !lIIIIIlllllIIII(this.P.m(), llIlIlllIIII[1]) && !lIIIIIlllllIIIl(this.P.f() ? 1 : 0) && !lIIIIIlllllIIIl(this.P.n() ? 1 : 0)) {
            return lIIIIIlllllIIlI(this.P.a(this.Q) ? 1 : 0) ? N() : lIIIIIlllllIIlI(Players.getLocal().isMoving() ? 1 : 0) ? llIlIlllIIII[0] : M();
        }
        return llIlIlllIIII[0];
    }

    protected abstract boolean M();

    @Inject
    public i(a aVar, g gVar) {
        this.P = aVar;
        this.Q = aVar.t();
        this.R = gVar;
    }
}
