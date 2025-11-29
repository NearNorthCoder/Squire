/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.MenuAction
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import net.runelite.api.GameState;
import net.runelite.api.MenuAction;

class c {
    private static /* synthetic */ int[] lIllllIlIIlI;
    static final /* synthetic */ int[] D;
    static final /* synthetic */ int[] C;

    private static void lllIlllIIlllll() {
        lIllllIlIIlI = new int[6];
        c.lIllllIlIIlI[0] = " ".length();
        c.lIllllIlIIlI[1] = "  ".length();
        c.lIllllIlIIlI[2] = "   ".length();
        c.lIllllIlIIlI[3] = 0xA7 ^ 0xA3;
        c.lIllllIlIIlI[4] = 0x4B ^ 0x76 ^ (0x10 ^ 0x28);
        c.lIllllIlIIlI[5] = 0x39 ^ 0x3F;
    }

    static {
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        c.lllIlllIIlllll();
                                        D = new int[GameState.values().length];
                                        try {
                                            c.D[GameState.LOGGED_IN.ordinal()] = lIllllIlIIlI[0];
                                            "".length();
                                        }
                                        catch (NoSuchFieldError lllllllllllllllIlIllIIlIIlIIllIl) {
                                            // empty catch block
                                        }
                                        if (" ".length() != 0) break block17;
                                        break block18;
                                    }
                                    try {
                                        c.D[GameState.LOADING.ordinal()] = lIllllIlIIlI[1];
                                        "".length();
                                    }
                                    catch (NoSuchFieldError lllllllllllllllIlIllIIlIIlIIllIl) {
                                        // empty catch block
                                    }
                                    if ("  ".length() >= ((0x78 ^ 0x5E) & ~(0x27 ^ 1))) break block19;
                                    break block18;
                                }
                                C = new int[MenuAction.values().length];
                                try {
                                    c.C[MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.ordinal()] = lIllllIlIIlI[0];
                                    "".length();
                                }
                                catch (NoSuchFieldError lllllllllllllllIlIllIIlIIlIIllIl) {
                                    // empty catch block
                                }
                                if ("   ".length() >= "  ".length()) break block20;
                                break block18;
                            }
                            try {
                                c.C[MenuAction.GAME_OBJECT_FIRST_OPTION.ordinal()] = lIllllIlIIlI[1];
                                "".length();
                            }
                            catch (NoSuchFieldError lllllllllllllllIlIllIIlIIlIIllIl) {
                                // empty catch block
                            }
                            if (((0x4D ^ 0x7D) & ~(6 ^ 0x36)) <= ((0x61 ^ 0x3D) & ~(0x22 ^ 0x7E))) break block21;
                            break block18;
                        }
                        try {
                            c.C[MenuAction.GAME_OBJECT_SECOND_OPTION.ordinal()] = lIllllIlIIlI[2];
                            "".length();
                        }
                        catch (NoSuchFieldError lllllllllllllllIlIllIIlIIlIIllIl) {
                            // empty catch block
                        }
                        if (-(0xAE ^ 0xAB) < 0) break block22;
                        break block18;
                    }
                    try {
                        c.C[MenuAction.GAME_OBJECT_THIRD_OPTION.ordinal()] = lIllllIlIIlI[3];
                        "".length();
                    }
                    catch (NoSuchFieldError lllllllllllllllIlIllIIlIIlIIllIl) {
                        // empty catch block
                    }
                    if ("   ".length() > 0) break block23;
                    break block18;
                }
                try {
                    c.C[MenuAction.GAME_OBJECT_FOURTH_OPTION.ordinal()] = lIllllIlIIlI[4];
                    "".length();
                }
                catch (NoSuchFieldError lllllllllllllllIlIllIIlIIlIIllIl) {
                    // empty catch block
                }
                if (null == null) break block24;
                break block18;
            }
            try {
                c.C[MenuAction.GAME_OBJECT_FIFTH_OPTION.ordinal()] = lIllllIlIIlI[5];
                "".length();
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ("   ".length() <= 0) {
                // empty if block
            }
        }
    }
}

