/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying compost potion to the bin", priority=31, blocking=true)
public class ApplyingCompostPotionToTheBinTask
extends aN {

    @Inject
    public ApplyingCompostPotionToTheBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        int n3;
        void var9;
        if ((this.bS.applyCompostPotion( == 0) ? 1 : 0)) {
            return 0;
        }
        an var10 = var9.aI();
        au var11 = var10.aY();
        if (((Object)var10.aZ() == (Object)var10.aZ()2)n.HARVESTABLE) && (!((Object)var11 != (Object)au.COMPOST) || ((Object)var11 == (Object)au.GIANT_COMPOST))) {
            n3 = 1;
            0;
            if (2 < 0) {
                return ((0x22 ^ 0x27) & ~(0x23 ^ 0x26)) != 0;
            }
        } else {
            n3 = 0;
        }
        return n3 != 0;
    }

    @Override
    public boolean b(TileObject tileObject) {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[0]));
        if item2 == null {
            return 0;
        }
        item2.useOn(tileObject);
        return 1;
    }

}

