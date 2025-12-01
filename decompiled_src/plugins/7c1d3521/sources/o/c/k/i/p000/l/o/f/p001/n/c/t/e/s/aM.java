package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import net.runelite.api.coords.WorldPoint;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aM  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aM.class */
public class aM implements Comparable<aM> {
    /* synthetic */ int nV;
    /* synthetic */ int nW;
    /* synthetic */ aM pV;
    /* synthetic */ WorldPoint nT;

    public aM(WorldPoint worldPoint, aM aMVar, int i, int i2) {
        this.nT = worldPoint;
        this.pV = aMVar;
        this.nV = i;
        this.nW = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(aM aMVar) {
        return Integer.compare(gl(), aMVar.gl());
    }

    public int gl() {
        return this.nV + this.nW;
    }
}
