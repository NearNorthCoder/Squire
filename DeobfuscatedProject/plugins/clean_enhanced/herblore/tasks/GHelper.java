/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import gg.squire.herblore.tasks.GameEnum2;

class GHelper {
    
    static final  int[] p;

    private static void var2() {
        var1 = new int[5];
        g.var1[0] = 1;
        g.var1[1] = 2;
        g.var1[2] = 3;
        g.var1[3] = 0xAB ^ 0xAF;
        g.var1[4] = 0x5A ^ 0xC ^ (0xC8 ^ 0x9B);
    }

    static {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            g.var2();
                            p = new int[c.values().length];
                            try {
                                g.p[c.CLEAN_HERBS.ordinal()] = var1[0];
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if ((0x37 ^ 0xF ^ (0x48 ^ 0x74)) > 0) break block11;
                            break block12;
                        }
                        try {
                            g.p[c.MAKE_UNF_POTS.ordinal()] = var1[1];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (-1 <= 2) break block13;
                        break block12;
                    }
                    try {
                        g.p[c.FINISH_POTS.ordinal()] = var1[2];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (((0x1B ^ 0x15 ^ (0x28 ^ 4)) & (0x7D ^ 0x24 ^ (0xBD ^ 0xC6) ^ -1)) == 0) break block14;
                    break block12;
                }
                try {
                    g.p[c.ALL_STAGES.ordinal()] = var1[3];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-3 < 0) break block15;
                break block12;
            }
            try {
                g.p[c.ALL_STAGES_ALL_HERBS.ordinal()] = var1[4];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (2 <= 0) {
                // empty if block
            }
        }
    }
}

