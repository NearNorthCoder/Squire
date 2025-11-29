/*
 * Decompiled with CFR 0.152.
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum;

class t_Unknown {
    static final /* synthetic */ int[] ag;
    private static /* synthetic */ int[] llIIllIIlIlI;

    private static void llllllIIIlIIlI() {
        llIIllIIlIlI = new int[3];
        t.llIIllIIlIlI[0] = 1;
        t.llIIllIIlIlI[1] = 2;
        t.llIIllIIlIlI[2] = 3;
    }

    static {
        block8: {
            block9: {
                block7: {
                    t.llllllIIIlIIlI();
                    ag = new int[d.values().length];
                    try {
                        t.ag[d.MELEE.ordinal()] = llIIllIIlIlI[0];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if ((1 ^ (0x35 ^ 0x30)) >= 0) break block7;
                    break block8;
                }
                try {
                    t.ag[d.MAGIC.ordinal()] = llIIllIIlIlI[1];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (1 != 0) break block9;
                break block8;
            }
            try {
                t.ag[d.RANGED.ordinal()] = llIIllIIlIlI[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (null != null) {
                // empty if block
            }
        }
    }
}

