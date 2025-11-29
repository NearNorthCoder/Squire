/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import net.runelite.api.GameState;

public class a {
    public static final /* synthetic */ int[] t;
    private static /* synthetic */ int[] llIIllllIllI;

    private static void lIIIIIIIIIlIlIl() {
        llIIllllIllI = new int[5];
        a.llIIllllIllI[0] = " ".length();
        a.llIIllllIllI[1] = "  ".length();
        a.llIIllllIllI[2] = "   ".length();
        a.llIIllllIllI[3] = 0x68 ^ 0x3A ^ (0x4D ^ 0x1B);
        a.llIIllllIllI[4] = 0x28 ^ 0x2D;
    }

    static {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            a.lIIIIIIIIIlIlIl();
                            t = new int[GameState.values().length];
                            try {
                                a.t[GameState.LOGIN_SCREEN.ordinal()] = llIIllllIllI[0];
                                "".length();
                            }
                            catch (NoSuchFieldError lllllllllllllllIlIIlIIIIIlIIlIll) {
                                // empty catch block
                            }
                            if ((0x51 ^ 0x55) >= " ".length()) break block11;
                            break block12;
                        }
                        try {
                            a.t[GameState.LOGGING_IN.ordinal()] = llIIllllIllI[1];
                            "".length();
                        }
                        catch (NoSuchFieldError lllllllllllllllIlIIlIIIIIlIIlIll) {
                            // empty catch block
                        }
                        if (null == null) break block13;
                        break block12;
                    }
                    try {
                        a.t[GameState.HOPPING.ordinal()] = llIIllllIllI[2];
                        "".length();
                    }
                    catch (NoSuchFieldError lllllllllllllllIlIIlIIIIIlIIlIll) {
                        // empty catch block
                    }
                    if (" ".length() >= -" ".length()) break block14;
                    break block12;
                }
                try {
                    a.t[GameState.CONNECTION_LOST.ordinal()] = llIIllllIllI[3];
                    "".length();
                }
                catch (NoSuchFieldError lllllllllllllllIlIIlIIIIIlIIlIll) {
                    // empty catch block
                }
                if (-(0x7E ^ 0x2F ^ (0x4D ^ 0x19)) < 0) break block15;
                break block12;
            }
            try {
                a.t[GameState.LOGGED_IN.ordinal()] = llIIllllIllI[4];
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
}

