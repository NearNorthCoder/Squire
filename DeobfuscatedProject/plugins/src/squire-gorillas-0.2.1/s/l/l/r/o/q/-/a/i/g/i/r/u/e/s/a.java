/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HeadIcon
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import net.runelite.api.HeadIcon;

public class a {
    private static /* synthetic */ int[] llIIlIIlIlll;
    public static final /* synthetic */ int[] k;

    private static void lllllIIlllIlII() {
        llIIlIIlIlll = new int[3];
        a.llIIlIIlIlll[0] = " ".length();
        a.llIIlIIlIlll[1] = "  ".length();
        a.llIIlIIlIlll[2] = "   ".length();
    }

    static {
        block8: {
            block9: {
                block7: {
                    a.lllllIIlllIlII();
                    k = new int[HeadIcon.values().length];
                    try {
                        a.k[HeadIcon.MELEE.ordinal()] = llIIlIIlIlll[0];
                        "".length();
                    }
                    catch (NoSuchFieldError lllllllllllllllIlIlIIIIIlIIllIlI) {
                        // empty catch block
                    }
                    if (null == null) break block7;
                    break block8;
                }
                try {
                    a.k[HeadIcon.RANGED.ordinal()] = llIIlIIlIlll[1];
                    "".length();
                }
                catch (NoSuchFieldError lllllllllllllllIlIlIIIIIlIIllIlI) {
                    // empty catch block
                }
                if ((0x72 ^ 0x76) >= 0) break block9;
                break block8;
            }
            try {
                a.k[HeadIcon.MAGIC.ordinal()] = llIIlIIlIlll[2];
                "".length();
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ("  ".length() == (0x48 ^ 0x4C)) {
                // empty if block
            }
        }
    }
}

