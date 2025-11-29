/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.MenuAction
 */
package gg.squire.farmer.tasks;

import net.runelite.api.GameState;
import net.runelite.api.MenuAction;

class CHelper {
    
    static final  int[] D;
    static final  int[] C;

    static {
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        c.var2();
                                        D = new int[GameState.values().length];
                                        try {
                                            c.D[GameState.LOGGED_IN.ordinal()] = 0;
                                            0;
                                        }
                                        catch (NoSuchFieldError var3) {
                                            // empty catch block
                                        }
                                        if (1 != 0) break block17;
                                        break block18;
                                    }
                                    try {
                                        c.D[GameState.LOADING.ordinal()] = 1;
                                        0;
                                    }
                                    catch (NoSuchFieldError var3) {
                                        // empty catch block
                                    }
                                    if (2 >= ((0x78 ^ 0x5E) & ~(0x27 ^ 1))) break block19;
                                    break block18;
                                }
                                C = new int[MenuAction.values().length];
                                try {
                                    c.C[MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.ordinal()] = 0;
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if (3 >= 2) break block20;
                                break block18;
                            }
                            try {
                                c.C[MenuAction.GAME_OBJECT_FIRST_OPTION.ordinal()] = 1;
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (((0x4D ^ 0x7D) & ~(6 ^ 0x36)) <= ((0x61 ^ 0x3D) & ~(0x22 ^ 0x7E))) break block21;
                            break block18;
                        }
                        try {
                            c.C[MenuAction.GAME_OBJECT_SECOND_OPTION.ordinal()] = 2;
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (-(0xAE ^ 0xAB) < 0) break block22;
                        break block18;
                    }
                    try {
                        c.C[MenuAction.GAME_OBJECT_THIRD_OPTION.ordinal()] = 3;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (3 > 0) break block23;
                    break block18;
                }
                try {
                    c.C[MenuAction.GAME_OBJECT_FOURTH_OPTION.ordinal()] = 4;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if null == null break block24;
                break block18;
            }
            try {
                c.C[MenuAction.GAME_OBJECT_FIFTH_OPTION.ordinal()] = 5;
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (3 <= 0) {
                // empty if block
            }
        }
    }
}

