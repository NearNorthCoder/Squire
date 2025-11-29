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
                    j.lIIIlIllIIlIIIl();
                    V = new int[GameState.values().length];
                    try {
                        j.V[GameState.HOPPING.ordinal()] = lllIIllllIII[0];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (-1 < 3) break block7;
                    break block8;
                }
                try {
                    j.V[GameState.LOGGING_IN.ordinal()] = lllIIllllIII[1];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if ((0x5F ^ 0x5B) > 0) break block9;
                break block8;
            }
            try {
                j.V[GameState.LOADING.ordinal()] = lllIIllllIII[2];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            
        j.lllIIllllIII[0] = 1;
        j.lllIIllllIII[1] = 2;
        j.lllIIllllIII[2] = 3;
    }
}

