/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponStyle
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import com.openosrs.client.util.WeaponStyle;
import net.runelite.api.Prayer;

class XHelper {
    static final  int[] co;
    
    static final  int[] cp;

    private static void var2() {
        var1 = new int[8];
        X.var1[0] = 1;
        X.var1[1] = 2;
        X.var1[2] = 3;
        X.var1[3] = 0xB6 ^ 0xB2;
        X.var1[4] = 0x41 ^ 0x44;
        X.var1[5] = 127 + 98 - 162 + 91 ^ 38 + 143 - 76 + 51;
        X.var1[6] = 0x24 ^ 0x53 ^ (0xB3 ^ 0xC3);
        X.var1[7] = 5 ^ 0xD;
    }

    static {
        block24: {
            block33: {
                block32: {
                    block31: {
                        block30: {
                            block29: {
                                block28: {
                                    block27: {
                                        block26: {
                                            block25: {
                                                block23: {
                                                    X.var2();
                                                    cp = new int[Prayer.values().length];
                                                    try {
                                                        X.cp[Prayer.PROTECT_FROM_MELEE.ordinal()] = var1[0];
                                                        0;
                                                    }
                                                    catch (NoSuchFieldError var3) {
                                                        // empty catch block
                                                    }
                                                    if null == null break block23;
                                                    break block24;
                                                }
                                                try {
                                                    X.cp[Prayer.PROTECT_FROM_MISSILES.ordinal()] = var1[1];
                                                    0;
                                                }
                                                catch (NoSuchFieldError var3) {
                                                    // empty catch block
                                                }
                                                if (((41 + 93 - -33 + 24 ^ 59 + 59 - 6 + 22) & (0xF9 ^ 0xBD ^ (0xBF ^ 0xC2) ^ -1)) <= 0) break block25;
                                                break block24;
                                            }
                                            try {
                                                X.cp[Prayer.PROTECT_FROM_MAGIC.ordinal()] = var1[2];
                                                0;
                                            }
                                            catch (NoSuchFieldError var3) {
                                                // empty catch block
                                            }
                                            if null == null break block26;
                                            break block24;
                                        }
                                        try {
                                            X.cp[Prayer.ULTIMATE_STRENGTH.ordinal()] = var1[3];
                                            0;
                                        }
                                        catch (NoSuchFieldError var3) {
                                            // empty catch block
                                        }
                                        if (3 >= 0) break block27;
                                        break block24;
                                    }
                                    try {
                                        X.cp[Prayer.CHIVALRY.ordinal()] = var1[4];
                                        0;
                                    }
                                    catch (NoSuchFieldError var3) {
                                        // empty catch block
                                    }
                                    if ((62 + 130 - 78 + 26 ^ 101 + 81 - 64 + 18) >= 0) break block28;
                                    break block24;
                                }
                                try {
                                    X.cp[Prayer.PIETY.ordinal()] = var1[5];
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if (-(0x6C ^ 0x69) < 0) break block29;
                                break block24;
                            }
                            try {
                                X.cp[Prayer.RIGOUR.ordinal()] = var1[6];
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (1 >= 0) break block30;
                            break block24;
                        }
                        try {
                            X.cp[Prayer.AUGURY.ordinal()] = var1[7];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (((0x8C ^ 0x88) & ~(0x95 ^ 0x91)) == 0) break block31;
                        break block24;
                    }
                    co = new int[WeaponStyle.values().length];
                    try {
                        X.co[WeaponStyle.MELEE.ordinal()] = var1[0];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((37 + 30 - -10 + 66 ^ 137 + 100 - 233 + 135) >= 3) break block32;
                    break block24;
                }
                try {
                    X.co[WeaponStyle.RANGE.ordinal()] = var1[1];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (2 >= -1) break block33;
                break block24;
            }
            try {
                X.co[WeaponStyle.MAGIC.ordinal()] = var1[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (1 <= 0) {
                // empty if block
            }
        }
    }
}

