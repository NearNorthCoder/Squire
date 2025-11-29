/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum4;

class IHelper {
    static final  int[] bm;

    static {
        block14: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                I.var2();
                                bm = new int[au.values().length];
                                try {
                                    I.bm[au.GIANT_ULTRACOMPOST.ordinal()] = 0;
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if ((0x65 ^ 0x61) >= ((0xF9 ^ 0xC5) & ~(0x8F ^ 0xB3))) break block13;
                                break block14;
                            }
                            try {
                                I.bm[au.ULTRACOMPOST.ordinal()] = 1;
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (2 != 0) break block15;
                            break block14;
                        }
                        try {
                            I.bm[au.GIANT_SUPERCOMPOST.ordinal()] = 2;
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if null == null break block16;
                        break block14;
                    }
                    try {
                        I.bm[au.SUPERCOMPOST.ordinal()] = 3;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((0x4D ^ 0x29 ^ (0x31 ^ 0x51)) == (0xE4 ^ 0xA5 ^ (0xE1 ^ 0xA4))) break block17;
                    break block14;
                }
                try {
                    I.bm[au.GIANT_COMPOST.ordinal()] = 4;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (((0xD5 ^ 0x9D) & ~(0x27 ^ 0x6F)) == 0) break block18;
                break block14;
            }
            try {
                I.bm[au.COMPOST.ordinal()] = 5;
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((0x26 ^ 0x23) == 0) {
                // empty if block
            }
        }
    }
}

