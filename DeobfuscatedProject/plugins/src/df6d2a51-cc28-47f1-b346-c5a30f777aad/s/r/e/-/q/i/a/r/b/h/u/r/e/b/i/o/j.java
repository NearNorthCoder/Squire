/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import net.runelite.api.GameState;

class j {
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
                        "".length();
                    }
                    catch (NoSuchFieldError lllllllllllllllIIllIIllIIlIIllII) {
                        // empty catch block
                    }
                    if (-" ".length() < "   ".length()) break block7;
                    break block8;
                }
                try {
                    j.V[GameState.LOGGING_IN.ordinal()] = lllIIllllIII[1];
                    "".length();
                }
                catch (NoSuchFieldError lllllllllllllllIIllIIllIIlIIllII) {
                    // empty catch block
                }
                if ((0x5F ^ 0x5B) > 0) break block9;
                break block8;
            }
            try {
                j.V[GameState.LOADING.ordinal()] = lllIIllllIII[2];
                "".length();
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (null != null) {
                // empty if block
            }
        }
    }

    private static void lIIIlIllIIlIIIl() {
        lllIIllllIII = new int[3];
        j.lllIIllllIII[0] = " ".length();
        j.lllIIllllIII[1] = "  ".length();
        j.lllIIllllIII[2] = "   ".length();
    }
}

