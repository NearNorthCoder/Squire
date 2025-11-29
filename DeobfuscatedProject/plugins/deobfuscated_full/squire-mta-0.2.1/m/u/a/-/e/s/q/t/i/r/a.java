/*
 * Decompiled with CFR 0.152.
 */
package m.u.a.-.e.s.q.t.i.r;

import m.u.a.-.e.s.q.t.i.r.c;

public class a {
    private static /* synthetic */ int[] lllIlIlIlIIl;
    public static final /* synthetic */ int[] n;

    private static void lIIIllIIIIIlIll() {
        lllIlIlIlIIl = new int[4];
        a.lllIlIlIlIIl[0] = 1;
        a.lllIlIlIlIIl[1] = 2;
        a.lllIlIlIlIIl[2] = 3;
        a.lllIlIlIlIIl[3] = 0x53 ^ 0x57;
    }

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        a.lIIIllIIIIIlIll();
                        n = new int[c.values().length];
                        try {
                            a.n[c.ALCHEMY.ordinal()] = lllIlIlIlIIl[0];
                            0;
                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (((0x27 ^ 1) & ~(0x2E ^ 8)) < (0x68 ^ 0x6C)) break block9;
                        break block10;
                    }
                    try {
                        a.n[c.GRAVEYARD.ordinal()] = lllIlIlIlIIl[1];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (2 >= 1) break block11;
                    break block10;
                }
                try {
                    a.n[c.TELEKENETIC.ordinal()] = lllIlIlIlIIl[2];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-3 <= 0) break block12;
                break block10;
            }
            try {
                a.n[c.ENCHANTMENT.ordinal()] = lllIlIlIlIIl[3];
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

