/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class AEHelper
extends GameEnum19 {

    private static boolean lllIllllIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ae.lllIllllIIllIl(n2)) {
            return new an(au.EMPTY_GIANT_COMPOST_BIN, n.EMPTY, lIlllllIIIll[0]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[1]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[2])) {
            return new an(au.GIANT_COMPOST, n.FILLING, (int)(var1 - lIlllllIIIll[1]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[3]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[4])) {
            return new an(au.GIANT_COMPOST, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[3]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[5]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[6])) {
            return new an(au.GIANT_SUPERCOMPOST, n.FILLING, (int)(var1 - lIlllllIIIll[5]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[7]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[8])) {
            return new an(au.GIANT_SUPERCOMPOST, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[7]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[9]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[10])) {
            return new an(au.GIANT_COMPOST, n.FILLING, lIlllllIIIll[2] + var1 - lIlllllIIIll[9]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[11]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[12])) {
            return new an(au.GIANT_COMPOST, n.HARVESTABLE, lIlllllIIIll[2] + var1 - lIlllllIIIll[11]);
        }
        if (ae.lllIllllIlIIII((int)var1, lIlllllIIIll[13])) {
            return new an(au.GIANT_COMPOST, n.GROWING, au.GIANT_COMPOST.bc() - lIlllllIIIll[1]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[14]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[15])) {
            return new an(au.GIANT_SUPERCOMPOST, n.GROWING, (int)(var1 - lIlllllIIIll[14]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[16]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[17])) {
            return new an(au.GIANT_SUPERCOMPOST, n.HARVESTABLE, lIlllllIIIll[2] + var1 - lIlllllIIIll[16]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[18]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[19])) {
            return new an(au.GIANT_COMPOST, n.GROWING, (int)(var1 - lIlllllIIIll[18]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[20]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[21])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.FILLING, (int)(var1 - lIlllllIIIll[20]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[22]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[23])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[22]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[24]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[25])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.GROWING, (int)(var1 - lIlllllIIIll[24]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[26]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[27])) {
            return new an(au.GIANT_SUPERCOMPOST, n.FILLING, lIlllllIIIll[2] + var1 - lIlllllIIIll[26]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[28]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[29])) {
            return new an(au.GIANT_ULTRACOMPOST, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[28]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[30]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[31])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.HARVESTABLE, lIlllllIIIll[2] + var1 - lIlllllIIIll[30]);
        }
        if (ae.lllIllllIlIIII((int)var1, lIlllllIIIll[32])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.GROWING, au.GIANT_ROTTEN_TOMATO.bc() - lIlllllIIIll[1]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[33]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[34])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.FILLING, lIlllllIIIll[2] + var1 - lIlllllIIIll[33]);
        }
        return null;
    }

    private static boolean lllIllllIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    AEHelper(A a2, String string2, boolean bl) {
    }

    private static boolean lllIllllIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        ae.lllIllllIIllII();
    }

    private static boolean lllIllllIlIIII(int n2, int n3) {
        return n2 == n3;
    }
}

