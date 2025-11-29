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
                b.var2();
                m = new int[Direction.values().length];
                try {
                    b.m[Direction.SOUTH.ordinal()] = var1[0];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if null == null break block5;
                break block6;
            }
            try {
                b.m[Direction.WEST.ordinal()] = var1[1];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((0x34 ^ 0x31) == 0) {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[2];
        b.var1[0] = 1;
        b.var1[1] = 2;
    }
}

