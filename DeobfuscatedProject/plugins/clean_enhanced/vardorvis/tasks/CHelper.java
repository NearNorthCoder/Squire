/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vardorvis.tasks;

import gg.squire.vardorvis.tasks.GameEnum5;

class CHelper {
    
    static final  int[] H;

    private static void var2() {
        var1 = new int[2];
        c.var1[0] = 1;
        c.var1[1] = 2;
    }

    static {
        block6: {
            block5: {
                c.var2();
                H = new int[d.values().length];
                try {
                    c.H[d.NOT_ATTACKING.ordinal()] = var1[0];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-1 < 1) break block5;
                break block6;
            }
            try {
                c.H[d.DELAYED.ordinal()] = var1[1];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if null != null {
                // empty if block
            }
        }
    }
}

