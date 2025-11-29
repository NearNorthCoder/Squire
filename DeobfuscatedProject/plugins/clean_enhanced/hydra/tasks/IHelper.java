/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hydra.tasks;

import gg.squire.hydra.tasks.GameEnum;

class IHelper {
    
    static final  int[] ag;

    private static void var2() {
        var1 = new int[3];
        i.var1[0] = 1;
        i.var1[1] = 2;
        i.var1[2] = 3;
    }

    static {
        block8: {
            block9: {
                block7: {
                    i.var2();
                    ag = new int[k.values().length];
                    try {
                        i.ag[k.POISON.ordinal()] = var1[0];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((4 + 55 - -9 + 72 ^ 64 + 36 - 52 + 88) >= 0) break block7;
                    break block8;
                }
                try {
                    i.ag[k.LIGHTNING.ordinal()] = var1[1];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (((0xFC ^ 0xA4) & ~(0x19 ^ 0x41)) <= 0) break block9;
                break block8;
            }
            try {
                i.ag[k.FLAME.ordinal()] = var1[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0x4E ^ 0x39 ^ (0xC2 ^ 0xA0)) & (113 + 36 - 103 + 87 ^ 17 + 110 - 25 + 42 ^ -1) & ((0x46 ^ 0x7B ^ 1) & (53 + 28 - -12 + 44 ^ 23 + 149 - 170 + 179 ^ -1) ^ -1)) != 0) {
                // empty if block
            }
        }
    }
}

