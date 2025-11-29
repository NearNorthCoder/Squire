/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mta.tasks;

import gg.squire.mta.tasks.GameEnum2;

public class AHelper {
    
    public static final  int[] n;

    private static void var2() {
        var1 = new int[4];
        a.var1[0] = 1;
        a.var1[1] = 2;
        a.var1[2] = 3;
        a.var1[3] = 0x53 ^ 0x57;
    }

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        a.var2();
                        n = new int[c.values().length];
                        try {
                            a.n[c.ALCHEMY.ordinal()] = var1[0];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (((0x27 ^ 1) & ~(0x2E ^ 8)) < (0x68 ^ 0x6C)) break block9;
                        break block10;
                    }
                    try {
                        a.n[c.GRAVEYARD.ordinal()] = var1[1];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (2 >= 1) break block11;
                    break block10;
                }
                try {
                    a.n[c.TELEKENETIC.ordinal()] = var1[2];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-3 <= 0) break block12;
                break block10;
            }
            try {
                a.n[c.ENCHANTMENT.ordinal()] = var1[3];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (-1 >= 0) {
                // empty if block
            }
        }
    }
}

