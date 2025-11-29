/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

import gg.squire.minigame.tasks.GameEnum5;

class BHelper {
    static final  int[] m;

    static {
        block8: {
            block9: {
                block7: {
                    b.lIIllllllIIIIIl();
                    m = new int[d.values().length];
                    try {
                        b.m[d.EAST.ordinal()] = lIIIlIIllllII[0];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (null == null) break block7;
                    break block8;
                }
                try {
                    b.m[d.WEST.ordinal()] = lIIIlIIllllII[1];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (3 < (0x3A ^ 0x3E)) break block9;
                break block8;
            }
            try {
                b.m[d.SOUTH.ordinal()] = lIIIlIIllllII[2];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0x1B ^ 8) & ~(0xBD ^ 0xAE)) != 0) {
                // empty if block
            }
        }
    }

}

