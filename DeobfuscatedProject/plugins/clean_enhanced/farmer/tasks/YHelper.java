/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum10;

class YHelper {
    static final  int[] bg;

    static {
        block14: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                y.var2();
                                bg = new int[P.values().length];
                                try {
                                    y.bg[P.FLOWER.ordinal()] = 0;
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if (2 >= 0) break block13;
                                break block14;
                            }
                            try {
                                y.bg[P.HERB.ordinal()] = 1;
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (-3 < 0) break block15;
                            break block14;
                        }
                        try {
                            y.bg[P.ALLOTMENT.ordinal()] = 2;
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (-2 <= 0) break block16;
                        break block14;
                    }
                    try {
                        y.bg[P.BUSH.ordinal()] = 3;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((0xB6 ^ 0xB2) > ((0x5D ^ 0x17) & ~(0xC9 ^ 0x83))) break block17;
                    break block14;
                }
                try {
                    y.bg[P.SEAWEED.ordinal()] = 4;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (((0xCD ^ 0x8C) & ~(0x78 ^ 0x39)) != 3) break block18;
                break block14;
            }
            try {
                y.bg[P.GRAPES.ordinal()] = 5;
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((0x6B ^ 0x10 ^ 63 + 116 - 87 + 35) > (104 + 2 - -12 + 61 ^ 28 + 85 - -51 + 19)) {
                // empty if block
            }
        }
    }
}

