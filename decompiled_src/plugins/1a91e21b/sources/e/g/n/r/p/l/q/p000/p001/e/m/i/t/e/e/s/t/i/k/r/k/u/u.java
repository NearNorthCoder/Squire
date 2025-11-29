package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import java.util.Comparator;
import net.runelite.api.TileObject;
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.u  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/u.class */
public class u implements Comparator<TileObject> {
    private static /* synthetic */ int[] lIIllIIllIIll;
    final /* synthetic */ t ae;

    static {
        lIlIlllllllIlIl();
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(TileObject tileObject, TileObject tileObject2) {
        return Integer.valueOf(((-tileObject.getWorldY()) * lIIllIIllIIll[0]) + tileObject.getWorldX()).compareTo(Integer.valueOf(((-tileObject2.getWorldY()) * lIIllIIllIIll[0]) + tileObject2.getWorldX()));
    }

    public u(t tVar) {
        this.ae = tVar;
    }

    private static void lIlIlllllllIlIl() {
        lIIllIIllIIll = new int[1];
        lIIllIIllIIll[0] = 55 ^ 61;
    }
}
