package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.x  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/x.class */
public abstract class x extends Task {
    private static /* synthetic */ int[] lIIlllIIlIIll;
    protected final /* synthetic */ SquireTempoross aB;
    protected final /* synthetic */ a ay;
    protected final /* synthetic */ Client aA;
    protected final /* synthetic */ SquireTemporossConfig az;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    public boolean run() {
        if (lIllIIlIlIlIIII(this.aA.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllIIlIIll[0];
        }
        this.ay.w();
        this.ay.v();
        return al();
    }

    private static void lIllIIlIlIIllll() {
        lIIlllIIlIIll = new int[1];
        lIIlllIIlIIll[0] = (173 ^ 145) & ((254 ^ 194) ^ (-1));
    }

    public abstract boolean al();

    /* JADX INFO: Access modifiers changed from: protected */
    public x(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ay = aVar;
        this.az = squireTemporossConfig;
        this.aA = client;
        this.aB = squireTempoross;
    }

    static {
        lIllIIlIlIIllll();
    }

    private static boolean lIllIIlIlIlIIII(int i) {
        return i != 0;
    }
}
