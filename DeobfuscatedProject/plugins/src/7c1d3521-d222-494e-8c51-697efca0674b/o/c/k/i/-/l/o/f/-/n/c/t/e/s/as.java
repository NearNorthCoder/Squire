/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import net.runelite.api.coords.WorldPoint;

class as
implements Comparable<as> {
    /* synthetic */ int nV;
    /* synthetic */ as nU;
    /* synthetic */ WorldPoint nT;
    /* synthetic */ int nW;

    public int b(as as2) {
        return Integer.compare(this.gl(), as2.gl());
    }

    public as(WorldPoint worldPoint, as as2, int n2, int n3) {
        this.nT = worldPoint;
        this.nU = as2;
        this.nV = n2;
        this.nW = n3;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.b((as)object);
    }

    public int gl() {
        return this.nV + this.nW;
    }
}

