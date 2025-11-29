/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.tasks.GameEnum2;

class BHelper {
    
    static final  int[] v;

    static {
        block6: {
            block5: {
                b.var2();
                v = new int[d.values().length];
                try {
                    b.v[d.AHRIM.ordinal()] = var1[0];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if ((0x9D ^ 0x98) > 0) break block5;
                break block6;
            }
            try {
                b.v[d.KARIL.ordinal()] = var1[1];
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

    private static void var2() {
        var1 = new int[2];
        b.var1[0] = 1;
        b.var1[1] = 2;
    }
}

