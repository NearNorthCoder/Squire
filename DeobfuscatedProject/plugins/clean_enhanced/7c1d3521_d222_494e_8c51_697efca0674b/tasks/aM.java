/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import net.runelite.api.coords.WorldPoint;

class aM
implements Comparable<aM> {
     int nV;
     int nW;
     aM pV;
     WorldPoint nT;

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
    public  int compareTo(Object object) {
        return this.b((aM)object);
    }

    public int gl() {
        return this.nV + this.nW;
    }
}

