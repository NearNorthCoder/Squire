/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import net.runelite.api.coords.WorldPoint;

class ASHelper
implements Comparable<as> {
     int nV;
     as nU;
     WorldPoint nT;
     int nW;

    public int b(as as2) {
        return Integer.compare(this.gl(), as2.gl());
    }

    public ASHelper(WorldPoint worldPoint, as as2, int n2, int n3) {
        this.nT = worldPoint;
        this.nU = as2;
        this.nV = n2;
        this.nW = n3;
    }

    @Override
    public  int compareTo(Object object) {
        return this.b((ASHelper) bject);
    }

    public int gl() {
        return this.nV + this.nW;
    }
}

