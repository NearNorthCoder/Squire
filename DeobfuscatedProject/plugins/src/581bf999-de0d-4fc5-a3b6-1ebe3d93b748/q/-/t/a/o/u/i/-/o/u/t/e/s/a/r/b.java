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
        b.llIIllIlIll[0] = " ".length();
        b.llIIllIlIll[1] = "  ".length();
        b.llIIllIlIll[2] = "   ".length();
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
                                "".length();
                            }
                            catch (NoSuchFieldError llllllllllllllllIIlllIllIllllIII) {
                                // empty catch block
                            }
                            if ("  ".length() < (12 + 6 - 6 + 121 ^ 79 + 19 - 75 + 106)) break block11;
                            break block12;
                        }
                        try {
                            b.C[Skill.STRENGTH.ordinal()] = llIIllIlIll[1];
                            "".length();
                        }
                        catch (NoSuchFieldError llllllllllllllllIIlllIllIllllIII) {
                            // empty catch block
                        }
                        if (" ".length() >= " ".length()) break block13;
                        break block12;
                    }
                    try {
                        b.C[Skill.DEFENCE.ordinal()] = llIIllIlIll[2];
                        "".length();
                    }
                    catch (NoSuchFieldError llllllllllllllllIIlllIllIllllIII) {
                        // empty catch block
                    }
                    if ("  ".length() != 0) break block14;
                    break block12;
                }
                try {
                    b.C[Skill.RANGED.ordinal()] = llIIllIlIll[3];
                    "".length();
                }
                catch (NoSuchFieldError llllllllllllllllIIlllIllIllllIII) {
                    // empty catch block
                }
                if ("  ".length() >= "  ".length()) break block15;
                break block12;
            }
            try {
                b.C[Skill.MAGIC.ordinal()] = llIIllIlIll[4];
                "".length();
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

