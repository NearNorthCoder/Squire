/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Skill;

class b {
    
    static final  int[] C;

    static {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            b.lIlIIIlIlllIlI();
                            C = new int[Skill.values().length];
                            try {
                                b.C[Skill.ATTACK.ordinal()] = llIIllIlIll[0];

                            }
                            catch (NoSuchFieldError var1) {
                                // empty catch block
                            }
                            if (2 < (12 + 6 - 6 + 121 ^ 79 + 19 - 75 + 106)) break block11;
                            break block12;
                        }
                        try {
                            b.C[Skill.STRENGTH.ordinal()] = llIIllIlIll[1];

                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (1 >= 1) break block13;
                        break block12;
                    }
                    try {
                        b.C[Skill.DEFENCE.ordinal()] = llIIllIlIll[2];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (2 != 0) break block14;
                    break block12;
                }
                try {
                    b.C[Skill.RANGED.ordinal()] = llIIllIlIll[3];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (2 >= 2) break block15;
                break block12;
            }
            try {
                b.C[Skill.MAGIC.ordinal()] = llIIllIlIll[4];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (null != null) {
                // empty if block
            }
        }
    }
}

