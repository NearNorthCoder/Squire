/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponStyle
 */
package -.r.u.q.e.s.o.t.a.i;

import com.openosrs.client.util.WeaponStyle;

class A_Unknown {
    private static /* synthetic */ int[] lIIllllIlIlll;
    static final /* synthetic */ int[] aU;

    static {
        block8: {
            block9: {
                block7: {
                    A.lIllIlIIllIIIll();
                    aU = new int[WeaponStyle.values().length];
                    try {
                        A.aU[WeaponStyle.MELEE.ordinal()] = lIIllllIlIlll[0];
                        0;
                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if ((98 + 18 - 86 + 149 ^ 71 + 165 - 229 + 176) > 0) break block7;
                    break block8;
                }
                try {
                    A.aU[WeaponStyle.RANGE.ordinal()] = lIIllllIlIlll[1];
                    0;
                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if (-2 <= 0) break block9;
                break block8;
            }
            try {
                A.aU[WeaponStyle.MAGIC.ordinal()] = lIIllllIlIlll[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            
        A.lIIllllIlIlll[0] = 1;
        A.lIIllllIlIlll[1] = 2;
        A.lIIllllIlIlll[2] = 3;
    }
}

