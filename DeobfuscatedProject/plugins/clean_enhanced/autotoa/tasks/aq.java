/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.GameEnum3;

class aq {
    static final  int[] dd;

    private static void var2() {
        var1 = new int[4];
        aq.var1[0] = 1;
        aq.var1[1] = 2;
        aq.var1[2] = 3;
        aq.var1[3] = 99 + 119 - 151 + 84 ^ 35 + 101 - 97 + 108;
    }

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        aq.var2();
                        dd = new int[n.values().length];
                        try {
                            aq.dd[n.DEATH.ordinal()] = var1[0];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (2 != 0) break block9;
                        break block10;
                    }
                    try {
                        aq.dd[n.FIRE.ordinal()] = var1[1];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (((0x3E ^ 0xC ^ (0x54 ^ 0x47)) & (0x6E ^ 0x60 ^ (0x98 ^ 0xB7) ^ -1)) == 0) break block11;
                    break block10;
                }
                try {
                    aq.dd[n.AIR.ordinal()] = var1[2];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (((0x45 ^ 0) & ~(0xE2 ^ 0xA7)) == 0) break block12;
                break block10;
            }
            try {
                aq.dd[n.LIGHTNING.ordinal()] = var1[3];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0xA0 ^ 0x84) & ~(6 ^ 0x22)) != 0) {
                // empty if block
            }
        }
    }
}

