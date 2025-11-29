/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.util.HardwareAcceleration;

class SystemInfo {
    static final /* synthetic */ int[] ak;
    private static /* synthetic */ int[] lIlI;

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        o.lIl();
                        ak = new int[n.values().length];
                        try {
                            o.ak[n.DIRECTDRAW.ordinal()] = lIlI[0];
                            0;
                        }
                        catch (NoSuchFieldError llllllllllllllI) {
                            // empty catch block
                        }
                        if (-1 <= 0) break block9;
                        break block10;
                    }
                    try {
                        o.ak[n.OPENGL.ordinal()] = lIlI[1];
                        0;
                    }
                    catch (NoSuchFieldError llllllllllllllI) {
                        // empty catch block
                    }
                    if (3 < (0x45 ^ 0x41)) break block11;
                    break block10;
                }
                try {
                    o.ak[n.OFF.ordinal()] = lIlI[2];
                    0;
                }
                catch (NoSuchFieldError llllllllllllllI) {
                    // empty catch block
                }
                if (null == null) break block12;
                break block10;
            }
            try {
                o.ak[n.METAL.ordinal()] = lIlI[3];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0x3A ^ 0x28) & ~(0xC ^ 0x1E)) != 0) {
                // empty if block
            }
        }
    }

    private static void lIl() {
        lIlI = new int[4];
        o.lIlI[0] = 1;
        o.lIlI[1] = 2;
        o.lIlI[2] = 3;
        o.lIlI[3] = 98 + 152 - 85 + 26 ^ 57 + 170 - 124 + 84;
    }
}
