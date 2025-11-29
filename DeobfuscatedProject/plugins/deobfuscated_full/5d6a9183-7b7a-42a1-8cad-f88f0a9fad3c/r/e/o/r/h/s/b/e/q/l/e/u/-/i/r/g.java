/*
 * Decompiled with CFR 0.152.
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c;

class g {
    private static /* synthetic */ int[] lllIlIIIlllI;
    static final /* synthetic */ int[] p;

    private static void lIIIlIlllIlIllI() {
        lllIlIIIlllI = new int[5];
        g.lllIlIIIlllI[0] = 1;
        g.lllIlIIIlllI[1] = 2;
        g.lllIlIIIlllI[2] = 3;
        g.lllIlIIIlllI[3] = 0xAB ^ 0xAF;
        g.lllIlIIIlllI[4] = 0x5A ^ 0xC ^ (0xC8 ^ 0x9B);
    }

    static {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            g.lIIIlIlllIlIllI();
                            p = new int[c.values().length];
                            try {
                                g.p[c.CLEAN_HERBS.ordinal()] = lllIlIIIlllI[0];
                                0;
                            }
                            catch (NoSuchFieldError var1) {
                                // empty catch block
                            }
                            if ((0x37 ^ 0xF ^ (0x48 ^ 0x74)) > 0) break block11;
                            break block12;
                        }
                        try {
                            g.p[c.MAKE_UNF_POTS.ordinal()] = lllIlIIIlllI[1];
                            0;
                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (-1 <= 2) break block13;
                        break block12;
                    }
                    try {
                        g.p[c.FINISH_POTS.ordinal()] = lllIlIIIlllI[2];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (((0x1B ^ 0x15 ^ (0x28 ^ 4)) & (0x7D ^ 0x24 ^ (0xBD ^ 0xC6) ^ -1)) == 0) break block14;
                    break block12;
                }
                try {
                    g.p[c.ALL_STAGES.ordinal()] = lllIlIIIlllI[3];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-3 < 0) break block15;
                break block12;
            }
            try {
                g.p[c.ALL_STAGES_ALL_HERBS.ordinal()] = lllIlIIIlllI[4];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (2 <= 0) {
                // empty if block
            }
        }
    }
}

