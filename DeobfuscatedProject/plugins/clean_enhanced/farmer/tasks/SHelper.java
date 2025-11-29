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

class SHelper
extends QHelper {
    final  r aS;

    SHelper(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aS = r2;
        super(string, n2, bl, nArray);
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        if ((worldPoint.getX() >= 0) && (worldPoint.getY() < 1)) {
            int n2;
            if ((worldPoint.getX() < 2) && (worldPoint.getY() >= 3) && (worldPoint.getPlane( == 0))) {
                n2 = 4;
                0;
                if (2 == 1) {
                    return ((0x18 ^ 0xE) & ~(0x94 ^ 0x82)) != 0;
                }
            } else {
                n2 = 5;
            }
            return n2 != 0;
        }
        return 4;
    }

    static {
        s.var2();
    }

}

