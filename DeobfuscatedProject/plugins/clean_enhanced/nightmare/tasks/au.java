/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import gg.squire.nightmare.tasks.GameEnum;

class au {
    static final  int[] er;

    private static void var2() {
        var1 = new int[4];
        au.var1[0] = 1;
        au.var1[1] = 2;
        au.var1[2] = 3;
        au.var1[3] = 4 ^ 0;
    }

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        au.var2();
                        er = new int[av.values().length];
                        try {
                            au.er[av.NORTH.ordinal()] = var1[0];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (2 < (145 + 66 - 201 + 141 ^ 9 + 0 - -127 + 11)) break block9;
                        break block10;
                    }
                    try {
                        au.er[av.SOUTH.ordinal()] = var1[1];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (3 < (0x7F ^ 0x54 ^ (0x93 ^ 0xBC))) break block11;
                    break block10;
                }
                try {
                    au.er[av.EAST.ordinal()] = var1[2];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-1 <= (0xC1 ^ 0xC5)) break block12;
                break block10;
            }
            try {
                au.er[av.WEST.ordinal()] = var1[3];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0x84 ^ 0xA1) & ~(0xB5 ^ 0x90)) != 0) {
                // empty if block
            }
        }
    }
}

