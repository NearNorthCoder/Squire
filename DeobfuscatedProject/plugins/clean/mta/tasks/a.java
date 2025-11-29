/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mta.tasks;

import gg.squire.mta.tasks.GameEnum8;

public class a {
    
    public static final  int[] n;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        a.lIIIllIIIIIlIll();
                        n = new int[c.values().length];
                        try {
                            a.n[c.ALCHEMY.ordinal()] = lllIlIlIlIIl[0];

                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (((0x27 ^ 1) & ~(0x2E ^ 8)) < (0x68 ^ 0x6C)) break block9;
                        break block10;
                    }
                    try {
                        a.n[c.GRAVEYARD.ordinal()] = lllIlIlIlIIl[1];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (2 >= 1) break block11;
                    break block10;
                }
                try {
                    a.n[c.TELEKENETIC.ordinal()] = lllIlIlIlIIl[2];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-3 <= 0) break block12;
                break block10;
            }
            try {
                a.n[c.ENCHANTMENT.ordinal()] = lllIlIlIlIIl[3];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            
        }
    }
}

