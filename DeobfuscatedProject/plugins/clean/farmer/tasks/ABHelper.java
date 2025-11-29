/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class ABHelper
extends GameEnum19 {

    private static boolean llllIlIllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlIllllIIl(int n2) {
        return n2 >= 0;
    }

    ABHelper(A a2, String string2, boolean bl) {
    }

    private static boolean llllIlIllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ab.llllIlIllllIIl(n2) && ab.llllIlIllllIlI(n2, llIIIllIIllI[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIllIIllI[0] - n2);
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[1]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[2])) {
            return new an(au.MUSHROOM, n.GROWING, (int)(var1 - llIIIllIIllI[1]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[3]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[4])) {
            return new an(au.MUSHROOM, n.HARVESTABLE, (int)(var1 - llIIIllIIllI[3]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[5]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[6])) {
            return new an(au.MUSHROOM, n.DISEASED, (int)(var1 - llIIIllIIllI[4]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[7]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[8])) {
            return new an(au.MUSHROOM, n.DEAD, (int)(var1 - llIIIllIIllI[6]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[9]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[10])) {
            return new an(au.WEEDS, n.GROWING, llIIIllIIllI[0]);
        }
        return null;
    }

    static {
        ab.llllIlIllllIII();
    }
}

