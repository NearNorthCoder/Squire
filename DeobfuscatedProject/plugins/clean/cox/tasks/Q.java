/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum26;

class Q {
    static final  int[] cm;

    static {
        block16: {
            block21: {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                block15: {
                                    Q.llIllIllllIlII();
                                    cm = new int[P.values().length];
                                    try {
                                        Q.cm[P.START.ordinal()] = lIlIlIIIIIlI[0];

                                    }
                                    catch (NoSuchFieldError var1) {
                                        // empty catch block
                                    }
                                    if (2 < (0xF ^ 0x3D ^ (0x11 ^ 0x27))) break block15;
                                    break block16;
                                }
                                try {
                                    Q.cm[P.END.ordinal()] = lIlIlIIIIIlI[1];

                                }
                                catch (NoSuchFieldError var1) {
                                    // empty catch block
                                }
                                if (-1 != 2) break block17;
                                break block16;
                            }
                            try {
                                Q.cm[P.SCAVENGERS.ordinal()] = lIlIlIIIIIlI[2];

                            }
                            catch (NoSuchFieldError var1) {
                                // empty catch block
                            }
                            if (((0x4D ^ 0x73) & ~(0x88 ^ 0xB6)) <= 0) break block18;
                            break block16;
                        }
                        try {
                            Q.cm[P.FARMING.ordinal()] = lIlIlIIIIIlI[3];

                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (2 >= 0) break block19;
                        break block16;
                    }
                    try {
                        Q.cm[P.COMBAT.ordinal()] = lIlIlIIIIIlI[4];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (-3 < 0) break block20;
                    break block16;
                }
                try {
                    Q.cm[P.PUZZLE.ordinal()] = lIlIlIIIIIlI[5];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if ((0x25 ^ 0x21) >= 0) break block21;
                break block16;
            }
            try {
                Q.cm[P.EMPTY.ordinal()] = lIlIlIIIIIlI[6];

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

