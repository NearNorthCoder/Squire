/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.Direction
 */
package gg.squire.hunter.tasks;

import net.runelite.api.coords.Direction;

class BHelper {
    static final  int[] m;

    static {
        block6: {
            block5: {
                b.lIIIllIlllllllI();
                m = new int[Direction.values().length];
                try {
                    b.m[Direction.SOUTH.ordinal()] = lllIllllIIlI[0];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (null == null) break block5;
                break block6;
            }
            try {
                b.m[Direction.WEST.ordinal()] = lllIllllIIlI[1];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((0x34 ^ 0x31) == 0) {
                // empty if block
            }
        }
    }

}

