/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import net.runelite.api.Skill;

class b {
    private static /* synthetic */ int[] llIIllIlIll;
    static final /* synthetic */ int[] C;

    private static void lIlIIIlIlllIlI() {
        llIIllIlIll = new int[5];
        b.llIIllIlIll[0] = 1;
        b.llIIllIlIll[1] = 2;
        b.llIIllIlIll[2] = 3;
        b.llIIllIlIll[3] = 0xA ^ 0x16 ^ (0x43 ^ 0x5B);
        b.llIIllIlIll[4] = 1 ^ 4;
    }

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
                                0;
                            }
                            catch (NoSuchFieldError var1) {
                                // empty catch block
                            }
                            if (2 < (12 + 6 - 6 + 121 ^ 79 + 19 - 75 + 106)) break block11;
                            break block12;
                        }
                        try {
                            b.C[Skill.STRENGTH.ordinal()] = llIIllIlIll[1];
                            0;
                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (1 >= 1) break block13;
                        break block12;
                    }
                    try {
                        b.C[Skill.DEFENCE.ordinal()] = llIIllIlIll[2];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (2 != 0) break block14;
                    break block12;
                }
                try {
                    b.C[Skill.RANGED.ordinal()] = llIIllIlIll[3];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (2 >= 2) break block15;
                break block12;
            }
            try {
                b.C[Skill.MAGIC.ordinal()] = llIIllIlIll[4];
                0;
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

