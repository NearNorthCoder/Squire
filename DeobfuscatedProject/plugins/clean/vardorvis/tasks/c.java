/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vardorvis.tasks;

import gg.squire.vardorvis.tasks.GameEnum24;

class c {
    
    static final  int[] H;

    static {
        block6: {
            block5: {
                c.lIlllllIIIlIlII();
                H = new int[d.values().length];
                try {
                    c.H[d.NOT_ATTACKING.ordinal()] = lIlIlIIllIlll[0];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-1 < 1) break block5;
                break block6;
            }
            try {
                c.H[d.DELAYED.ordinal()] = lIlIlIIllIlll[1];

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

