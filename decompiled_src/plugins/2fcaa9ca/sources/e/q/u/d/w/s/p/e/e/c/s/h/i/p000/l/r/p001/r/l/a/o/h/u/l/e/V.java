package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.V  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/V.class */
public abstract class V extends Task {
    private final /* synthetic */ SquireSepulchre aC;
    private static /* synthetic */ int[] lllIIlIIIlII;
    private final /* synthetic */ SquireSepulchreConfig aD;

    public abstract boolean J();

    private static boolean lIIIlIIllllIIII(int i) {
        return i == 0;
    }

    private static void lIIIlIIlllIllll() {
        lllIIlIIIlII = new int[1];
        lllIIlIIIlII[0] = ((((117 + 9) - 5) + 28) ^ (((99 + 29) - 47) + 101)) & (((69 ^ 19) ^ (182 ^ 195)) ^ (-" ".length()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public V(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aC = squireSepulchre;
        this.aD = squireSepulchreConfig;
    }

    static {
        lIIIlIIlllIllll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lIIIlIIllllIIII(this.aD.sackOpener() ? 1 : 0) ? lllIIlIIIlII[0] : J();
    }
}
