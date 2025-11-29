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

    private static void var2() {
        var1 = new int[4];
        o.var1[0] = 1;
        o.var1[1] = 2;
        o.var1[2] = 3;
        o.var1[3] = 20 + 40 - -27 + 97 ^ 93 + 129 - 173 + 139;
    }

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        o.var2();
                        an = new int[Direction.values().length];
                        try {
                            o.an[Direction.NORTH.ordinal()] = var1[0];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if null == null break block9;
                        break block10;
                    }
                    try {
                        o.an[Direction.SOUTH.ordinal()] = var1[1];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((0x6D ^ 0x69) != 0) break block11;
                    break block10;
                }
                try {
                    o.an[Direction.EAST.ordinal()] = var1[2];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-1 <= 0) break block12;
                break block10;
            }
            try {
                o.an[Direction.WEST.ordinal()] = var1[3];
                0;
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

