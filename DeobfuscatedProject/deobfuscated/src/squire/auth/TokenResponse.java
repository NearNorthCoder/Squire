/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.util.Platform;

class TokenResponse {
    static final /* synthetic */ int[] bs;
    private static /* synthetic */ int[] lIlIll;

    private static void lIllIlI() {
        lIlIll = new int[3];
        I.lIlIll[0] = 1;
        I.lIlIll[1] = 2;
        I.lIlIll[2] = 3;
    }

    static {
        block8: {
            block9: {
                block7: {
                    I.lIllIlI();
                    bs = new int[G.values().length];
                    try {
                        I.bs[G.Windows.ordinal()] = lIlIll[0];
                        0;
                    }
                    catch (NoSuchFieldError lllllIIIIIllIll) {
                        // empty catch block
                    }
                    if (null == null) break block7;
                    break block8;
                }
                try {
                    I.bs[G.MacOS.ordinal()] = lIlIll[1];
                    0;
                }
                catch (NoSuchFieldError lllllIIIIIllIll) {
                    // empty catch block
                }
                if (3 != ((31 + 161 - -3 + 9 ^ 176 + 195 - 228 + 56) & (0x6B ^ 0x4E ^ (0xEA ^ 0xC4) ^ -1))) break block9;
                break block8;
            }
            try {
                I.bs[G.Linux.ordinal()] = lIlIll[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            
        }
    }
}
