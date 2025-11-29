/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.GameEnum29;

class aq {
    static final  int[] dd;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        aq.lIlIlIIIIIlIIl();
                        dd = new int[n.values().length];
                        try {
                            aq.dd[n.DEATH.ordinal()] = llIlIlllIlI[0];

                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (2 != 0) break block9;
                        break block10;
                    }
                    try {
                        aq.dd[n.FIRE.ordinal()] = llIlIlllIlI[1];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (((0x3E ^ 0xC ^ (0x54 ^ 0x47)) & (0x6E ^ 0x60 ^ (0x98 ^ 0xB7) ^ -1)) == 0) break block11;
                    break block10;
                }
                try {
                    aq.dd[n.AIR.ordinal()] = llIlIlllIlI[2];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (((0x45 ^ 0) & ~(0xE2 ^ 0xA7)) == 0) break block12;
                break block10;
            }
            try {
                aq.dd[n.LIGHTNING.ordinal()] = llIlIlllIlI[3];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0xA0 ^ 0x84) & ~(6 ^ 0x22)) != 0) {
                // empty if block
            }
        }
    }
}

