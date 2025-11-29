/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum2;

class ZHelper {
    static final  int[] V;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        z.var2();
                        V = new int[o.values().length];
                        try {
                            z.V[o.ANTI_VENOM.ordinal()] = 0;
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (3 >= 1) break block9;
                        break block10;
                    }
                    try {
                        z.V[o.ANTI_DOTE.ordinal()] = 1;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (-1 < 3) break block11;
                    break block10;
                }
                try {
                    z.V[o.CURE_SELF.ordinal()] = 2;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (3 == 3) break block12;
                break block10;
            }
            try {
                z.V[o.ANTI_POISON.ordinal()] = 3;
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((0x96 ^ 0x92) < 0) {
                // empty if block
            }
        }
    }
}

