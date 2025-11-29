/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.construction.tasks;

import net.runelite.api.Skill;

class b {
    
    static final  int[] E;

    static {
        block8: {
            block9: {
                block7: {
                    b.lIlIlIllIll();
                    E = new int[Skill.values().length];
                    try {
                        b.E[Skill.ATTACK.ordinal()] = llIIIlIlI[0];

                    }
                    catch (NoSuchFieldError lIllIlllIIIIIll) {
                        // empty catch block
                    }
                    if (1 > 0) break block7;
                    break block8;
                }
                try {
                    b.E[Skill.RANGED.ordinal()] = llIIIlIlI[1];

                }
                catch (NoSuchFieldError lIllIlllIIIIIll) {
                    // empty catch block
                }
                if ((0x93 ^ 0x97) >= 0) break block9;
                break block8;
            }
            try {
                b.E[Skill.MAGIC.ordinal()] = llIIIlIlI[2];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((2 + 82 - -56 + 32 ^ 4 + 51 - -57 + 27) & (0xA ^ 0x67 ^ (0xF4 ^ 0xBE) ^ -1)) != 0) {
                // empty if block
            }
        }
    }

}

