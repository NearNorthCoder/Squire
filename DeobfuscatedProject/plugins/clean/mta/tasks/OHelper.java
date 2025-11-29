/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.Direction
 */
package gg.squire.mta.tasks;

import net.runelite.api.coords.Direction;

class OHelper {
    static final  int[] an;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        o.lIIIllIIIlllIII();
                        an = new int[Direction.values().length];
                        try {
                            o.an[Direction.NORTH.ordinal()] = lllIlIllIIlI[0];

                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (null == null) break block9;
                        break block10;
                    }
                    try {
                        o.an[Direction.SOUTH.ordinal()] = lllIlIllIIlI[1];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if ((0x6D ^ 0x69) != 0) break block11;
                    break block10;
                }
                try {
                    o.an[Direction.EAST.ordinal()] = lllIlIllIIlI[2];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-1 <= 0) break block12;
                break block10;
            }
            try {
                o.an[Direction.WEST.ordinal()] = lllIlIllIIlI[3];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0x46 ^ 0x10) & ~(0xD ^ 0x5B)) < -1) {
                // empty if block
            }
        }
    }
}

