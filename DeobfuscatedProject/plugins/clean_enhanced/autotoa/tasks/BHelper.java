/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Skill;

class BHelper {
    
    static final  int[] C;

    private static void var2() {
        var1 = new int[5];
        b.var1[0] = 1;
        b.var1[1] = 2;
        b.var1[2] = 3;
        b.var1[3] = 0xA ^ 0x16 ^ (0x43 ^ 0x5B);
        b.var1[4] = 1 ^ 4;
    }

    static {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            b.var2();
                            C = new int[Skill.values().length];
                            try {
                                b.C[Skill.ATTACK.ordinal()] = var1[0];
                                0;
                            }
                            catch (NoSuchFieldError var3) {
                                // empty catch block
                            }
                            if (2 < (12 + 6 - 6 + 121 ^ 79 + 19 - 75 + 106)) break block11;
                            break block12;
                        }
                        try {
                            b.C[Skill.STRENGTH.ordinal()] = var1[1];
                            0;
                        }
                        catch (NoSuchFieldError var3) {
                            // empty catch block
                        }
                        if (1 >= 1) break block13;
                        break block12;
                    }
                    try {
                        b.C[Skill.DEFENCE.ordinal()] = var1[2];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (2 != 0) break block14;
                    break block12;
                }
                try {
                    b.C[Skill.RANGED.ordinal()] = var1[3];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (2 >= 2) break block15;
                break block12;
            }
            try {
                b.C[Skill.MAGIC.ordinal()] = var1[4];
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

