package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/l.class */
public abstract class l extends Task {
    protected final /* synthetic */ SquireTemporossConfig as;
    protected final /* synthetic */ SquireTempoross au;
    private static /* synthetic */ int[] lIIllIllIIlll;
    protected final /* synthetic */ a ar;
    protected final /* synthetic */ Client at;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public boolean run() {
        if (!lIllIIIlIIlIlIl(this.at.isInInstancedRegion() ? 1 : 0) && !lIllIIIlIIlIlIl(ak() ? 1 : 0) && !lIllIIIlIIlIllI(this.ar.N())) {
            if (lIllIIIlIIlIlIl(this.as.solo() ? 1 : 0)) {
                WorldPoint ag = this.ar.N().ag();
                int[] iArr = new int[lIIllIllIIlll[1]];
                iArr[lIIllIllIIlll[0]] = lIIllIllIIlll[2];
                if (lIllIIIlIIlIlll(NPCs.getNearest(ag, iArr))) {
                    this.ar.d((boolean) lIIllIllIIlll[1]);
                }
            }
            return lIllIIIlIIllIII(this.ar.k() ? 1 : 0) ? lIIllIllIIlll[0] : al();
        }
        return lIIllIllIIlll[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ar = aVar;
        this.as = squireTemporossConfig;
        this.at = client;
        this.au = squireTempoross;
    }

    public abstract boolean ak();

    private static boolean lIllIIIlIIllIII(int i) {
        return i != 0;
    }

    public abstract boolean al();

    static {
        lIllIIIlIIlIlII();
    }

    private static boolean lIllIIIlIIlIllI(Object obj) {
        return obj == null;
    }

    private static void lIllIIIlIIlIlII() {
        lIIllIllIIlll = new int[3];
        lIIllIllIIlll[0] = (177 ^ 164) & ((16 ^ 5) ^ (-1));
        lIIllIllIIlll[1] = " ".length();
        lIIllIllIIlll[2] = (-((-1161) & 17593)) & (-5121) & 32123;
    }

    private static boolean lIllIIIlIIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIlIIlIlIl(int i) {
        return i == 0;
    }
}
