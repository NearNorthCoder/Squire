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

class WHelper
extends QHelper {
    final  r aW;

    WHelper(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aW = r2;
        super(string, n2, bl, nArray);
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        boolean bl;
        if ((worldPoint.getY() < 0)) {
            bl = 1;
            0;
            if null != null {
                return ((0xFD ^ 0xB9) & ~(0x30 ^ 0x74)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    static {
        w.var2();
    }

}

