/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gauntlet.tasks;

import gg.squire.gauntlet.tasks.GameEnum4;

class SHelper {
    static final  int[] bz;

    static {
        block14: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                s.var2();
                                bz = new int[d.values().length];
                                try {
                                    s.bz[d.FIRST_ROTATION_EXPLORE.ordinal()] = var1[0];
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if (3 > 0) break block13;
                                break block14;
                            }
                            try {
                                s.bz[d.FIRST_ROTATION_CREATE.ordinal()] = var1[1];
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (-1 <= (19 + 0 - -34 + 138 ^ 126 + 4 - -24 + 33)) break block15;
                            break block14;
                        }
                        try {
                            s.bz[d.DEMI_BOSS_EXPLORE.ordinal()] = var1[2];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (1 >= ((0x4F ^ 3 ^ (0xBA ^ 0xAF)) & (0x26 ^ 0x2E ^ (0x6C ^ 0x3D) ^ -1))) break block16;
                        break block14;
                    }
                    try {
                        s.bz[d.CREATING_T3_STAFF.ordinal()] = var1[3];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((0x9E ^ 0x9A) != 0) break block17;
                    break block14;
                }
                try {
                    s.bz[d.PREPARE_BOSS_FIGHT.ordinal()] = var1[4];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if null == null break block18;
                break block14;
            }
            try {
                s.bz[d.EXTRA_FOOD_EXPLORE.ordinal()] = var1[5];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (-3 > 0) {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[6];
        s.var1[0] = 1;
        s.var1[1] = 2;
        s.var1[2] = 3;
        s.var1[3] = 0x2F ^ 0x25 ^ (0x5D ^ 0x53);
        s.var1[4] = 0x16 ^ 0x7D ^ (0xE5 ^ 0x8B);
        s.var1[5] = 0 ^ 6;
    }
}

