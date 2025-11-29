package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import net.runelite.api.coords.WorldPoint;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.as  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/as.class */
public class as implements Comparable<as> {
    /* synthetic */ int nV;
    /* synthetic */ as nU;
    /* synthetic */ WorldPoint nT;
    /* synthetic */ int nW;

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(as asVar) {
        return Integer.compare(gl(), asVar.gl());
    }

    public as(WorldPoint worldPoint, as asVar, int i, int i2) {
        this.nT = worldPoint;
        this.nU = asVar;
        this.nV = i;
        this.nW = i2;
    }

    public int gl() {
        return this.nV + this.nW;
    }
}
