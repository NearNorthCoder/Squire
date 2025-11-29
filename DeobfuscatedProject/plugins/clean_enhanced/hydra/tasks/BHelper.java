/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hydra.tasks;

import gg.squire.hydra.tasks.GameEnum;

class BHelper {
    
    static final  int[] t;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        b.var2();
                        t = new int[k.values().length];
                        try {
                            b.t[k.POISON.ordinal()] = var1[0];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (((0xCB ^ 0xA7 ^ (0xFF ^ 0xA6)) & (4 ^ 0x37 ^ (0x35 ^ 0x33) ^ -1)) == 0) break block9;
                        break block10;
                    }
                    try {
                        b.t[k.LIGHTNING.ordinal()] = var1[1];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (3 != ((0x59 ^ 0x43 ^ (0xA6 ^ 0xAC)) & (95 + 88 - 124 + 77 ^ 103 + 64 - 64 + 49 ^ -1))) break block11;
                    break block10;
                }
                try {
                    b.t[k.FLAME.ordinal()] = var1[2];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if ((0x31 ^ 0x34) > 0) break block12;
                break block10;
            }
            try {
                b.t[k.ENRAGED.ordinal()] = var1[3];
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

    private static void var2() {
        var1 = new int[4];
        b.var1[0] = 1;
        b.var1[1] = 2;
        b.var1[2] = 3;
        b.var1[3] = 0x61 ^ 0x65;
    }
}

