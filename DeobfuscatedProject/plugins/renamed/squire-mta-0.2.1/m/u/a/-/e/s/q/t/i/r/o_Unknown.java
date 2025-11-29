/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.Direction
 */
package m.u.a.-.e.s.q.t.i.r;

import net.runelite.api.coords.Direction;

class o_Unknown {
    static final /* synthetic */ int[] an;
    private static /* synthetic */ int[] lllIlIllIIlI;

    private static void lIIIllIIIlllIII() {
        lllIlIllIIlI = new int[4];
        o.lllIlIllIIlI[0] = 1;
        o.lllIlIllIIlI[1] = 2;
        o.lllIlIllIIlI[2] = 3;
        o.lllIlIllIIlI[3] = 20 + 40 - -27 + 97 ^ 93 + 129 - 173 + 139;
    }

    static {
        block10: {
            block12: {
                block11: {
                    block9: {
                        o.lIIIllIIIlllIII();
                        an = new int[Direction.values().length];
                        try {
                            o.an[Direction.NORTH.ordinal()] = lllIlIllIIlI[0];
                            0;
                        }
                        catch (NoSuchFieldError var1) {
                            // empty catch block
                        }
                        if (null == null) break block9;
                        break block10;
                    }
                    try {
                        o.an[Direction.SOUTH.ordinal()] = lllIlIllIIlI[1];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if ((0x6D ^ 0x69) != 0) break block11;
                    break block10;
                }
                try {
                    o.an[Direction.EAST.ordinal()] = lllIlIllIIlI[2];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-1 <= 0) break block12;
                break block10;
            }
            try {
                o.an[Direction.WEST.ordinal()] = lllIlIllIIlI[3];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (((0x46 ^ 0x10) & ~(0xD ^ 0x5B)) < -1) {
                // empty if block
            }
        }
    }
}

