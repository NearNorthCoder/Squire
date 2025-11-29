/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.SEnum;

class I_Unknown {
    static final /* synthetic */ int[] cc;
    private static /* synthetic */ int[] lIlIIlIIlIIl;

    private static void llIllIIIlIIIll() {
        lIlIIlIIlIIl = new int[3];
        I.lIlIIlIIlIIl[0] = 1;
        I.lIlIIlIIlIIl[1] = 2;
        I.lIlIIlIIlIIl[2] = 3;
    }

    static {
        block8: {
            block9: {
                block7: {
                    I.llIllIIIlIIIll();
                    cc = new int[S.values().length];
                    try {
                        I.cc[S.TEMPLATE_EAST.ordinal()] = lIlIIlIIlIIl[0];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (-1 <= 0) break block7;
                    break block8;
                }
                try {
                    I.cc[S.TEMPLATE_NORTH.ordinal()] = lIlIIlIIlIIl[1];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (null == null) break block9;
                break block8;
            }
            try {
                I.cc[S.TEMPLATE_WEST.ordinal()] = lIlIIlIIlIIl[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (-(0x11 ^ 0x7B ^ (0x52 ^ 0x3C)) >= 0) {
                // empty if block
            }
        }
    }
}

