/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 */
package gg.squire.gauntlet.tasks;

import net.runelite.api.GameState;

public class AHelper {
    public static final  int[] t;

    private static void var2() {
        var1 = new int[5];
        a.var1[0] = 1;
        a.var1[1] = 2;
        a.var1[2] = 3;
        a.var1[3] = 0x68 ^ 0x3A ^ (0x4D ^ 0x1B);
        a.var1[4] = 0x28 ^ 0x2D;
    }

    static {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            a.var2();
                            t = new int[GameState.values().length];
                            try {
                                a.t[GameState.LOGIN_SCREEN.ordinal()] = var1[0];
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if ((0x51 ^ 0x55) >= 1) break block11;
                            break block12;
                        }
                        try {
                            a.t[GameState.LOGGING_IN.ordinal()] = var1[1];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if null == null break block13;
                        break block12;
                    }
                    try {
                        a.t[GameState.HOPPING.ordinal()] = var1[2];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (1 >= -1) break block14;
                    break block12;
                }
                try {
                    a.t[GameState.CONNECTION_LOST.ordinal()] = var1[3];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-(0x7E ^ 0x2F ^ (0x4D ^ 0x19)) < 0) break block15;
                break block12;
            }
            try {
                a.t[GameState.LOGGED_IN.ordinal()] = var1[4];
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
}

