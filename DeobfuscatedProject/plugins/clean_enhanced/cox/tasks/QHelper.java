/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum4;

class QHelper {
    static final  int[] cm;

    static {
        block16: {
            block21: {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                block15: {
                                    Q.var2();
                                    cm = new int[P.values().length];
                                    try {
                                        Q.cm[P.START.ordinal()] = 0;
                                        0;
                                    }
                                    catch (NoSuchFieldError var3) {
                                        // empty catch block
                                    }
                                    if (2 < (0xF ^ 0x3D ^ (0x11 ^ 0x27))) break block15;
                                    break block16;
                                }
                                try {
                                    Q.cm[P.END.ordinal()] = 1;
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if (-1 != 2) break block17;
                                break block16;
                            }
                            try {
                                Q.cm[P.SCAVENGERS.ordinal()] = 2;
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (((0x4D ^ 0x73) & ~(0x88 ^ 0xB6)) <= 0) break block18;
                            break block16;
                        }
                        try {
                            Q.cm[P.FARMING.ordinal()] = 3;
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (2 >= 0) break block19;
                        break block16;
                    }
                    try {
                        Q.cm[P.COMBAT.ordinal()] = 4;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (-3 < 0) break block20;
                    break block16;
                }
                try {
                    Q.cm[P.PUZZLE.ordinal()] = 5;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if ((0x25 ^ 0x21) >= 0) break block21;
                break block16;
            }
            try {
                Q.cm[P.EMPTY.ordinal()] = 6;
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (2 < 0) {
                // empty if block
            }
        }
    }
}

