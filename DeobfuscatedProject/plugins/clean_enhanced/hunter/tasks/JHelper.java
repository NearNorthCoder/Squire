/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 */
package gg.squire.hunter.tasks;

import net.runelite.api.GameState;

class JHelper {
    static final  int[] V;

    static {
        block8: {
            block9: {
                block7: {
                    j.var2();
                    V = new int[GameState.values().length];
                    try {
                        j.V[GameState.HOPPING.ordinal()] = var1[0];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (-1 < 3) break block7;
                    break block8;
                }
                try {
                    j.V[GameState.LOGGING_IN.ordinal()] = var1[1];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if ((0x5F ^ 0x5B) > 0) break block9;
                break block8;
            }
            try {
                j.V[GameState.LOADING.ordinal()] = var1[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if null != null {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[3];
        j.var1[0] = 1;
        j.var1[1] = 2;
        j.var1[2] = 3;
    }
}

