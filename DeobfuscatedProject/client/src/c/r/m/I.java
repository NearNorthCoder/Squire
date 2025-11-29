/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.G;

class I {
    static final /* synthetic */ int[] bs;
    private static /* synthetic */ int[] lIlIll;

    private static void lIllIlI() {
        lIlIll = new int[3];
        I.lIlIll[0] = " ".length();
        I.lIlIll[1] = "  ".length();
        I.lIlIll[2] = "   ".length();
    }

    static {
        block8: {
            block9: {
                block7: {
                    I.lIllIlI();
                    bs = new int[G.values().length];
                    try {
                        I.bs[G.Windows.ordinal()] = lIlIll[0];
                        "".length();
                    }
                    catch (NoSuchFieldError lllllIIIIIllIll) {
                        // empty catch block
                    }
                    if (null == null) break block7;
                    break block8;
                }
                try {
                    I.bs[G.MacOS.ordinal()] = lIlIll[1];
                    "".length();
                }
                catch (NoSuchFieldError lllllIIIIIllIll) {
                    // empty catch block
                }
                if ("   ".length() != ((31 + 161 - -3 + 9 ^ 176 + 195 - 228 + 56) & (0x6B ^ 0x4E ^ (0xEA ^ 0xC4) ^ -" ".length()))) break block9;
                break block8;
            }
            try {
                I.bs[G.Linux.ordinal()] = lIlIll[2];
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
