/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.QHelper;
import gg.squire.farmer.tasks.FarmerManager;
import net.runelite.api.coords.WorldPoint;

class VHelper
extends QHelper {
    final  r aV;

    static {
        v.var2();
    }

    VHelper(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aV = r2;
        super(string, n2, bl, nArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean c(WorldPoint worldPoint) {
        boolean bl;
        void var3;
        if ((worldPoint.getX() == 0) && (worldPoint.getY() >= 1) && (worldPoint.getY() <= 2)) {
            return 3;
        }
        if ((!(var3.getX() != 4) || !(var3.getX() != 5) || !(var3.getX() != 6) || (var3.getX() == 7)) && (var3.getY() <= 8) && (var3.getY() >= 9)) {
            return 3;
        }
        if ((var3.getPlane( == 0))) {
            bl = var1[10];
            0;
            if (2 < 1) {
                return ((7 ^ 0x19) & ~(0x12 ^ 0xC)) != 0;
            }
        } else {
            bl = 3;
        }
        return bl;
    }

}

