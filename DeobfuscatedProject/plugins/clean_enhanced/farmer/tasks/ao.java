/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum7;

class ao {
    static final  int[] bF;

    static {
        block6: {
            block5: {
                ao.var2();
                bF = new int[n.values().length];
                try {
                    ao.bF[n.HARVESTABLE.ordinal()] = 0;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (((0x62 ^ 0x34) & ~(0x2F ^ 0x79)) < (0x37 ^ 0x33)) break block5;
                break block6;
            }
            try {
                ao.bF[n.GROWING.ordinal()] = 1;
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

