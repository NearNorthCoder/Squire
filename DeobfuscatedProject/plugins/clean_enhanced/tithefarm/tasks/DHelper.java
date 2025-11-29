/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.tithefarm.tasks;

import gg.squire.tithefarm.tasks.GameEnum2;

class DHelper {
    
    static final  int[] n;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        d.var2();
                        n = new int[c.values().length];
                        try {
                            d.n[c.GOLOVANOVA.ordinal()] = var1[0];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (((0x2C ^ 0x66) & ~(9 ^ 0x43)) == 0) break block9;
                        break block10;
                    }
                    try {
                        d.n[c.BOLOGANO.ordinal()] = var1[1];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (2 == 2) break block11;
                    break block10;
                }
                try {
                    d.n[c.LOGAVANO.ordinal()] = var1[2];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-3 <= 0) break block12;
                break block10;
            }
            try {
                d.n[c.BEST_OPTION.ordinal()] = var1[3];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (2 > (4 ^ 0x35 ^ (0x78 ^ 0x4D))) {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[4];
        d.var1[0] = 1;
        d.var1[1] = 2;
        d.var1[2] = 3;
        d.var1[3] = 0x26 ^ 0x22;
    }
}

