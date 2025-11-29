package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.hunter.SquireHunterConfig;
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.j  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/j.class */
public abstract class j extends Task {
    private final /* synthetic */ C0000a u;
    private /* synthetic */ EnumC0004e w;
    private final /* synthetic */ SquireHunterConfig v;
    private static /* synthetic */ int[] lllIlllIIlII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lIIIllIllIllIII(this.v.method(), this.w) ? lllIlllIIlII[0] : x();
    }

    protected abstract boolean x();

    private static void lIIIllIllIlIlll() {
        lllIlllIIlII = new int[1];
        lllIlllIIlII[0] = ((80 ^ 113) ^ (57 ^ 22)) & (((((10 + 99) - (-6)) + 24) ^ (((75 + 105) - 82) + 35)) ^ (-" ".length()));
    }

    public SquireHunterConfig z() {
        return this.v;
    }

    static {
        lIIIllIllIlIlll();
    }

    public C0000a y() {
        return this.u;
    }

    public j(C0000a c0000a, SquireHunterConfig squireHunterConfig, EnumC0004e enumC0004e) {
        this.u = c0000a;
        this.v = squireHunterConfig;
        this.w = enumC0004e;
    }

    private static boolean lIIIllIllIllIII(Object obj, Object obj2) {
        return obj != obj2;
    }
}
