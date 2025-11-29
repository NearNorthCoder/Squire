/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.GameEnum2;

class OHelper {
    static final  int[] ao;

    static {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            o.var2();
                            ao = new int[c.values().length];
                            try {
                                o.ao[c.STARTING.ordinal()] = var1[0];
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (1 >= 1) break block11;
                            break block12;
                        }
                        try {
                            o.ao[c.PATHING.ordinal()] = var1[1];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (-(0xA4 ^ 0xA1) < 0) break block13;
                        break block12;
                    }
                    try {
                        o.ao[c.INSPECTING.ordinal()] = var1[2];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((126 + 129 - 236 + 142 ^ 134 + 73 - 96 + 54) >= 0) break block14;
                    break block12;
                }
                try {
                    o.ao[c.FINISHING.ordinal()] = var1[3];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-3 < 0) break block15;
                break block12;
            }
            try {
                o.ao[c.HARVESTING.ordinal()] = var1[4];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((3 ^ 0x3A) & ~(0x94 ^ 0xAD)) < 0) {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[5];
        o.var1[0] = 1;
        o.var1[1] = 2;
        o.var1[2] = 3;
        o.var1[3] = 0x97 ^ 0x93;
        o.var1[4] = 0xA7 ^ 0xBF ^ (0x38 ^ 0x25);
    }
}

