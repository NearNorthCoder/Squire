/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.cox.tasks;

import net.unethicalite.api.game.Vars;

public class VHelper {

    public static boolean br() {
        boolean bl2;
        if ((Vars.getBit((int)2) == 3)) {
            bl2 = 3;
            0;
            if null != null {
                return ((8 ^ 0x28) & ~(0x55 ^ 0x75)) != 0;
            }
        } else {
            bl2 = 4;
        }
        return bl2;
    }

    public static int bu() {
        return Vars.getBit((int)7);
    }

    public static int bt() {
        return Vars.getBit((int)6);
    }

    public static int bq() {
        return Vars.getBit((int)1);
    }

    static {
        v.var2();
    }

    public static int bs() {
        return Vars.getBit((int)5);
    }

    public static int bp() {
        return Vars.getVarp((int)0);
    }

    public static int bv() {
        return Vars.getBit((int)8);
    }
}

