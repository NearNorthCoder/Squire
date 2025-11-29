/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 */
package gg.squire.gauntlet.tasks;

import net.runelite.api.GameState;

public class a {
    public static final  int[] t;

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

                            }
                            catch (NoSuchFieldError var1) {
                                // empty catch block
                            }
                            if ((0x51 ^ 0x55) >= 1) break block11;
                            break block12;
                        }
                        try {
                            a.t[GameState.LOGGING_IN.ordinal()] = llIIllllIllI[1];

                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (null == null) break block13;
                        break block12;
                    }
                    try {
                        a.t[GameState.HOPPING.ordinal()] = llIIllllIllI[2];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (1 >= -1) break block14;
                    break block12;
                }
                try {
                    a.t[GameState.CONNECTION_LOST.ordinal()] = llIIllllIllI[3];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-(0x7E ^ 0x2F ^ (0x4D ^ 0x19)) < 0) break block15;
                break block12;
            }
            try {
                a.t[GameState.LOGGED_IN.ordinal()] = llIIllllIllI[4];

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

