/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

import gg.squire.minigame.tasks.GameEnum3;

class BHelper {
    static final  int[] m;

    static {
        block8: {
            block9: {
                block7: {
                    b.var2();
                    m = new int[d.values().length];
                    try {
                        b.m[d.EAST.ordinal()] = var1[0];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if null == null break block7;
                    break block8;
                }
                try {
                    b.m[d.WEST.ordinal()] = var1[1];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (3 < (0x3A ^ 0x3E)) break block9;
                break block8;
            }
            try {
                b.m[d.SOUTH.ordinal()] = var1[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0x1B ^ 8) & ~(0xBD ^ 0xAE)) != 0) {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[3];
        b.var1[0] = 1;
        b.var1[1] = 2;
        b.var1[2] = 3;
    }
}

