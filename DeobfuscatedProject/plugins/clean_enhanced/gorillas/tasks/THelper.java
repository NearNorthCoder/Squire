/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gorillas.tasks;

import gg.squire.gorillas.tasks.GameEnum3;

class THelper {
    static final  int[] ag;

    static {
        block8: {
            block9: {
                block7: {
                    t.var2();
                    ag = new int[d.values().length];
                    try {
                        t.ag[d.MELEE.ordinal()] = 0;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if ((1 ^ (0x35 ^ 0x30)) >= 0) break block7;
                    break block8;
                }
                try {
                    t.ag[d.MAGIC.ordinal()] = 1;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if (1 != 0) break block9;
                break block8;
            }
            try {
                t.ag[d.RANGED.ordinal()] = 2;
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
}

