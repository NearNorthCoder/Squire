/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.G;

class v {
    static final /* synthetic */ int[] aD;
    private static /* synthetic */ int[] llIIll;

    static {
        block6: {
            block5: {
                v.llIIllI();
                aD = new int[G.values().length];
                try {
                    v.aD[G.Windows.ordinal()] = llIIll[0];
                    "".length();
                }
                catch (NoSuchFieldError llllIllllIlIlIl) {
                    // empty catch block
                }
                if (-" ".length() < (29 + 39 - 49 + 119 ^ 92 + 10 - -20 + 20)) break block5;
                break block6;
            }
            try {
                v.aD[G.MacOS.ordinal()] = llIIll[1];
                "".length();
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (-"  ".length() >= 0) {
                // empty if block
            }
        }
    }

    private static void llIIllI() {
        llIIll = new int[2];
        v.llIIll[0] = " ".length();
        v.llIIll[1] = "  ".length();
    }
}
