/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponStyle
 */
package gg.squire.toa.tasks;

import com.openosrs.client.util.WeaponStyle;

class AHelper {
    
    static final  int[] aU;

    static {
        block8: {
            block9: {
                block7: {
                    A.var2();
                    aU = new int[WeaponStyle.values().length];
                    try {
                        A.aU[WeaponStyle.MELEE.ordinal()] = var1[0];
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((98 + 18 - 86 + 149 ^ 71 + 165 - 229 + 176) > 0) break block7;
                    break block8;
                }
                try {
                    A.aU[WeaponStyle.RANGE.ordinal()] = var1[1];
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (-2 <= 0) break block9;
                break block8;
            }
            try {
                A.aU[WeaponStyle.MAGIC.ordinal()] = var1[2];
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if null != null {
                // empty if block
            }
        }
    }

    private static void var2() {
        var1 = new int[3];
        A.var1[0] = 1;
        A.var1[1] = 2;
        A.var1[2] = 3;
    }
}

