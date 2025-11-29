/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HeadIcon
 */
package gg.squire.gorillas.tasks;

import net.runelite.api.HeadIcon;

public class a {
    
    public static final  int[] k;

    static {
        block8: {
            block9: {
                block7: {
                    a.lllllIIlllIlII();
                    k = new int[HeadIcon.values().length];
                    try {
                        a.k[HeadIcon.MELEE.ordinal()] = llIIlIIlIlll[0];

                    }
                    catch (NoSuchFieldError var1) {
                        // empty catch block
                    }
                    if (null == null) break block7;
                    break block8;
                }
                try {
                    a.k[HeadIcon.RANGED.ordinal()] = llIIlIIlIlll[1];

                }
                catch (NoSuchFieldError var1) {
                    // empty catch block
                }
                if ((0x72 ^ 0x76) >= 0) break block9;
                break block8;
            }
            try {
                a.k[HeadIcon.MAGIC.ordinal()] = llIIlIIlIlll[2];

            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (2 == (0x48 ^ 0x4C)) {
                // empty if block
            }
        }
    }
}

