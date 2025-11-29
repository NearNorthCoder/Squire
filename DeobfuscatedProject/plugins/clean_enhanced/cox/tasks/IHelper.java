/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum2;

class IHelper {
    static final  int[] cc;

    static {
        block8: {
            block9: {
                block7: {
                    I.var2();
                    cc = new int[S.values().length];
                    try {
                        I.cc[S.TEMPLATE_EAST.ordinal()] = 0;
                        0;
                    }
                    catch (NoSuchFieldError var3) {
                        // empty catch block
                    }
                    if (-1 <= 0) break block7;
                    break block8;
                }
                try {
                    I.cc[S.TEMPLATE_NORTH.ordinal()] = 1;
                    0;
                }
                catch (NoSuchFieldError var3) {
                    // empty catch block
                }
                if null == null break block9;
                break block8;
            }
            try {
                I.cc[S.TEMPLATE_WEST.ordinal()] = 2;
                0;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            if (-(0x11 ^ 0x7B ^ (0x52 ^ 0x3C)) >= 0) {
                // empty if block
            }
        }
    }
}

