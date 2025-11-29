/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.util.Platform;

public class CryptoUtil {
    private static /* synthetic */ int[] lIIlIIl;
    public static final /* synthetic */ int[] aP;

    private static void lIIlIIII() {
        lIIlIIl = new int[3];
        x.lIIlIIl[0] = 1;
        x.lIIlIIl[1] = 2;
        x.lIIlIIl[2] = 3;
    }

    static {
        block8: {
            block9: {
                block7: {
                    x.lIIlIIII();
                    aP = new int[G.values().length];
                    try {
                        x.aP[G.Windows.ordinal()] = lIIlIIl[0];
                        0;
                    }
                    catch (NoSuchFieldError llllIlIIlIIlIII) {
                        // empty catch block
                    }
                    if ((0x93 ^ 0x9A ^ (0xCA ^ 0xC7)) >= -1) break block7;
                    break block8;
                }
                try {
                    x.aP[G.MacOS.ordinal()] = lIIlIIl[1];
                    0;
                }
                catch (NoSuchFieldError llllIlIIlIIlIII) {
                    // empty catch block
                }
                if (2 == 2) break block9;
                break block8;
            }
            try {
                x.aP[G.Linux.ordinal()] = lIIlIIl[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if ((63 & (0x5F ^ 0x54 ^ (0x38 ^ 0xC) ^ -1)) > 3) {
                // empty if block
            }
        }
    }
}
