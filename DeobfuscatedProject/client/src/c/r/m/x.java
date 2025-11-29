/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.G;

public class x {
    private static /* synthetic */ int[] lIIlIIl;
    public static final /* synthetic */ int[] aP;

    private static void lIIlIIII() {
        lIIlIIl = new int[3];
        x.lIIlIIl[0] = " ".length();
        x.lIIlIIl[1] = "  ".length();
        x.lIIlIIl[2] = "   ".length();
    }

    static {
        block8: {
            block9: {
                block7: {
                    x.lIIlIIII();
                    aP = new int[G.values().length];
                    try {
                        x.aP[G.Windows.ordinal()] = lIIlIIl[0];
                        "".length();
                    }
                    catch (NoSuchFieldError llllIlIIlIIlIII) {
                        // empty catch block
                    }
                    if ((0x93 ^ 0x9A ^ (0xCA ^ 0xC7)) >= -" ".length()) break block7;
                    break block8;
                }
                try {
                    x.aP[G.MacOS.ordinal()] = lIIlIIl[1];
                    "".length();
                }
                catch (NoSuchFieldError llllIlIIlIIlIII) {
                    // empty catch block
                }
                if ("  ".length() == "  ".length()) break block9;
                break block8;
            }
            try {
                x.aP[G.Linux.ordinal()] = lIIlIIl[2];
                "".length();
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((100 + 103 - 158 + 136 ^ 5 + 131 - 22 + 24) & (0x5F ^ 0x54 ^ (0x38 ^ 0xC) ^ -" ".length())) > "   ".length()) {
                // empty if block
            }
        }
    }
}
