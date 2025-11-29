/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;

class ao_Unknown {
    static final /* synthetic */ int[] bF;
    private static /* synthetic */ int[] llIIIlIllIIl;

    private static void llllIlIlIlIllI() {
        llIIIlIllIIl = new int[2];
        ao.llIIIlIllIIl[0] = 1;
        ao.llIIIlIllIIl[1] = 2;
    }

    static {
        block6: {
            block5: {
                ao.llllIlIlIlIllI();
                bF = new int[n.values().length];
                try {
                    ao.bF[n.HARVESTABLE.ordinal()] = llIIIlIllIIl[0];
                    0;
                }
                catch (NoSuchFieldError lllllllllllllllIlIlIIlIlIIllllIl) {
                    // empty catch block
                }
                if (((0x62 ^ 0x34) & ~(0x2F ^ 0x79)) < (0x37 ^ 0x33)) break block5;
                break block6;
            }
            try {
                ao.bF[n.GROWING.ordinal()] = llIIIlIllIIl[1];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (3 < 1) {
                // empty if block
            }
        }
    }
}

