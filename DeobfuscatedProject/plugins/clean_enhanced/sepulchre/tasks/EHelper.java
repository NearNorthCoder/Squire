/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.GameEnum16;

class EHelper {
    
    static final  int[] V;

    static {
        block8: {
            block9: {
                block7: {
                    E.var2();
                    V = new int[F.values().length];
                    try {
                        E.V[F.STATUE_6_DOUBLE.ordinal()] = var1[0];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (2 != ((0x37 ^ 0x56) & ~(0x20 ^ 0x41))) break block7;
                    break block8;
                }
                try {
                    E.V[F.STATUE_8_DOUBLE.ordinal()] = var1[1];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if ((0x36 ^ 0x32) > 0) break block9;
                break block8;
            }
            try {
                E.V[F.STATUE_BLUE_DOUBLE.ordinal()] = var1[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0xE4 ^ 0xBC ^ (0x7C ^ 0xC)) & (0xB2 ^ 0xB8 ^ (0x9E ^ 0xBC) ^ -1)) != ((63 + 52 - 16 + 74 ^ 164 + 111 - 243 + 136) & (0x79 ^ 0x61 ^ (0xA0 ^ 0xBD) ^ -1))) {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[3];
        E.var1[0] = 1;
        E.var1[1] = 2;
        E.var1[2] = 3;
    }
}

