/*
 * Decompiled with CFR 0.152.
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.DEnum;

class c_Unknown {
    private static /* synthetic */ int[] lIlIlIIllIlll;
    static final /* synthetic */ int[] H;

    private static void lIlllllIIIlIlII() {
        lIlIlIIllIlll = new int[2];
        c.lIlIlIIllIlll[0] = 1;
        c.lIlIlIIllIlll[1] = 2;
    }

    static {
        block6: {
            block5: {
                c.lIlllllIIIlIlII();
                H = new int[d.values().length];
                try {
                    c.H[d.NOT_ATTACKING.ordinal()] = lIlIlIIllIlll[0];
                    0;
                }
                catch (NoSuchFieldError llllllllllllllIllIlIlllIIllIlIll) {
                    // empty catch block
                }
                if (-1 < 1) break block5;
                break block6;
            }
            try {
                c.H[d.DELAYED.ordinal()] = lIlIlIIllIlll[1];
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

