/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum12;
import gg.squire.farmer.tasks.GameEnum10;

class GHelper {
    
    static final  int[] an;
    static final  int[] am;

    static {
        block14: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                g.var2();
                                an = new int[P.values().length];
                                try {
                                    g.an[P.ALLOTMENT.ordinal()] = 0;
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if (((0x73 ^ 0x20 ^ (0x52 ^ 0x55)) & (0x7D ^ 0x1C ^ (0x84 ^ 0xB1) ^ -1)) < 2) break block13;
                                break block14;
                            }
                            try {
                                g.an[P.HERB.ordinal()] = 1;
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (((0x8C ^ 0x9A) & ~(0x11 ^ 7)) == ((0x96 ^ 0xC1) & ~(0xC5 ^ 0x92))) break block15;
                            break block14;
                        }
                        try {
                            g.an[P.FLOWER.ordinal()] = 2;
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (-1 <= 3) break block16;
                        break block14;
                    }
                    try {
                        g.an[P.BUSH.ordinal()] = 3;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (1 <= 3) break block17;
                    break block14;
                }
                am = new int[H.values().length];
                try {
                    g.am[H.SUPERCOMPOST.ordinal()] = 0;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if ((0x24 ^ 0x20) >= (0x10 ^ 0x14)) break block18;
                break block14;
            }
            try {
                g.am[H.ULTRACOMPOST.ordinal()] = 1;
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((133 + 117 - 207 + 110 ^ 142 + 132 - 140 + 23) <= -1) {
                // empty if block
            }
        }
    }
}

