/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum16;

class z {
    static final  int[] V;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        z.llIIIllllIlllll();
                        V = new int[o.values().length];
                        try {
                            z.V[o.ANTI_VENOM.ordinal()] = lIllIlIIllIIl[0];

                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (3 >= 1) break block9;
                        break block10;
                    }
                    try {
                        z.V[o.ANTI_DOTE.ordinal()] = lIllIlIIllIIl[1];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (-1 < 3) break block11;
                    break block10;
                }
                try {
                    z.V[o.CURE_SELF.ordinal()] = lIllIlIIllIIl[2];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (3 == 3) break block12;
                break block10;
            }
            try {
                z.V[o.ANTI_POISON.ordinal()] = lIllIlIIllIIl[3];

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

