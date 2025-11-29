/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.thieving.tasks;

import gg.squire.thieving.tasks.GameEnum;

class BHelper {
    static final  int[] n;

    private static void var2() {
        var1 = new int[8];
        b.var1[0] = 1;
        b.var1[1] = 2;
        b.var1[2] = 3;
        b.var1[3] = 0x66 ^ 0x62;
        b.var1[4] = 0x2F ^ 0x48 ^ (0x47 ^ 0x25);
        b.var1[5] = 0x30 ^ 0x36;
        b.var1[6] = 0x6B ^ 0xD ^ (0x36 ^ 0x57);
        b.var1[7] = 0x93 ^ 0xB9 ^ (0x2B ^ 9);
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
                                        b.var2();
                                        n = new int[c.values().length];
                                        try {
                                            b.n[c.ROOM_ONE.ordinal()] = var1[0];
                                            0;
                                        }
                                        catch (NoSuchFieldError var3) {
                                            // empty catch block
                                        }
                                        if (2 >= 2) break block17;
                                        break block18;
                                    }
                                    try {
                                        b.n[c.ROOM_TWO.ordinal()] = var1[1];
                                        0;
                                    }
                                    catch (NoSuchFieldError var3) {
                                        // empty catch block
                                    }
                                    if ((0xC4 ^ 0xC0) > -1) break block19;
                                    break block18;
                                }
                                try {
                                    b.n[c.ROOM_THREE.ordinal()] = var1[2];
                                    0;
                                }
                                catch (NoSuchFieldError var3) {
                                    // empty catch block
                                }
                                if (1 != ((100 + 31 - -80 + 8 ^ 170 + 70 - 218 + 164) & (0x73 ^ 5 ^ (0x8E ^ 0x99) ^ -1))) break block20;
                                break block18;
                            }
                            try {
                                b.n[c.ROOM_FOUR.ordinal()] = var1[3];
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (((70 + 29 - -73 + 83 ^ 141 + 25 - 83 + 105) & (0xD6 ^ 0x9D ^ (0x54 ^ 0x5C) ^ -1)) == 0) break block21;
                            break block18;
                        }
                        try {
                            b.n[c.ROOM_FIVE.ordinal()] = var1[4];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (((114 + 75 - 25 + 8 ^ 138 + 101 - 238 + 159) & (79 + 8 - -55 + 17 ^ 60 + 54 - 13 + 46 ^ -1)) >= 0) break block22;
                        break block18;
                    }
                    try {
                        b.n[c.ROOM_SIX.ordinal()] = var1[5];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((0x83 ^ 0x86) != 0) break block23;
                    break block18;
                }
                try {
                    b.n[c.ROOM_SEVEN.ordinal()] = var1[6];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (3 >= 0) break block24;
                break block18;
            }
            try {
                b.n[c.ROOM_EIGHT.ordinal()] = var1[7];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (1 < -1) {
                // empty if block
            }
        }
    }
}

