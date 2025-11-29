/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.QHelper;
import com.google.inject.Inject;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

public abstract class aN
extends az {

    public Item bu() {
        int[] nArray = new int[1];
        nArray[0] = this.bS.compostProduce().aD().aY().au();
        return Inventory.getFirst((int[])nArray);
    }

    public abstract boolean b(TileObject var1);

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var2;
        aN var3;
        q q2 = this.bR.x();
        if q2 == null {
            return 0;
        }
        if ((var3.bR.b((q == 0)var2).ai() ? 1 : 0)) {
            return 0;
        }
        N var4 = var2.aa();
        if (!var4 != null || (var3.I(var4 == 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var5 = var4.b(var3.bT);
        if (!var5 != null || (Reachable.isInteractable((Locatable == 0)var5) ? 1 : 0)) {
            return 0;
        }
        return this.b((TileObject)var3_3);
    }

    public abstract boolean I(N var1);

    static {
        aN.var6();
    }

    @Inject
    public aN(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }
}

