/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import net.runelite.api.coords.WorldPoint;

class aM
implements Comparable<aM> {
    /* synthetic */ int nV;
    /* synthetic */ int nW;
    /* synthetic */ aM pV;
    /* synthetic */ WorldPoint nT;

    public aM(WorldPoint worldPoint, aM aM2, int n2, int n3) {
        this.nT = worldPoint;
        this.pV = aM2;
        this.nV = n2;
        this.nW = n3;
    }

    public int b(aM aM2) {
        return Integer.compare(this.gl(), aM2.gl());
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.b((aM)object);
    }

    public int gl() {
        return this.nV + this.nW;
    }
}

