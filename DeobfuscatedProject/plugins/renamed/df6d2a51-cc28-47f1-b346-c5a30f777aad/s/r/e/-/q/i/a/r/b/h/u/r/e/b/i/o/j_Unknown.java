/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import net.runelite.api.GameState;

class j_Unknown {
    static final /* synthetic */ int[] V;
    private static /* synthetic */ int[] lllIIllllIII;

    static {
        block8: {
            block9: {
                block7: {
                    j.lIIIlIllIIlIIIl();
                    V = new int[GameState.values().length];
                    try {
                        j.V[GameState.HOPPING.ordinal()] = lllIIllllIII[0];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (-1 < 3) break block7;
                    break block8;
                }
                try {
                    j.V[GameState.LOGGING_IN.ordinal()] = lllIIllllIII[1];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if ((0x5F ^ 0x5B) > 0) break block9;
                break block8;
            }
            try {
                j.V[GameState.LOADING.ordinal()] = lllIIllllIII[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            
        j.lllIIllllIII[0] = 1;
        j.lllIIllllIII[1] = 2;
        j.lllIIllllIII[2] = 3;
    }
}

