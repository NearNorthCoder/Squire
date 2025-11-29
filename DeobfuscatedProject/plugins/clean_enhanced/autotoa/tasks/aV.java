/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.GameEnum9;

class aV {
    static final  int[] ev;

    static {
        block6: {
            block5: {
                aV.var2();
                ev = new int[aW.values().length];
                try {
                    aV.ev[aW.PILLARS.ordinal()] = var1[0];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if ((116 + 133 - 109 + 12 ^ 140 + 138 - 215 + 93) >= 0) break block5;
                break block6;
            }
            try {
                aV.ev[aW.VENTS.ordinal()] = var1[1];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((0x38 ^ 0x3C) != (0x55 ^ 0x51)) {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[2];
        aV.var1[0] = 1;
        aV.var1[1] = 2;
    }
}

