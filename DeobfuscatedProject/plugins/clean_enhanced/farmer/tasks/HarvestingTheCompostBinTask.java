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

import gg.squire.farmer.tasks.GameEnum12;
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

@TaskDesc(name="Harvesting the compost bin", priority=30, blocking=true)
public class HarvestingTheCompostBinTask
extends aN {

    @Override
    public boolean b(TileObject tileObject) {
        Item var2;
        Item item;
        if ((this.bS.bottomless( != 0) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = 2;
            item = Inventory.getFirst((int[])nArray);
            0;
            if ((0x3F ^ 0x3B) != (0x94 ^ 0x90)) {
                return ((0x5E ^ 0x61) & ~(0x8D ^ 0xB2)) != 0;
            }
        } else {
            int[] nArray = new int[1];
            nArray[0] = 3;
            var2 = Inventory.getFirst((int[])nArray);
        }
        if var2 == null {
            return 0;
        }
        item.useOn(tileObject);
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        boolean bl;
        void var3;
        an an2 = n2.aI();
        au au2 = an2.aY();
        H h2 = H.c(au2);
        if (!(Object != nullh2) || ((Object)h2 != (Object)h22)this.bS.compostType())) {
            return 0;
        }
        if (((Object)var3.aZ() == (Object)var3.aZ()2)n.HARVESTABLE)) {
            bl = 1;
            0;
            if (((0x71 ^ 0x57 ^ (0x5E ^ 0x43)) & (0x64 ^ 0x2C ^ (0x48 ^ 0x3B) ^ -1)) == 3) {
                return ((138 + 18 - 110 + 118 ^ 129 + 158 - 201 + 92) & (66 + 82 - 47 + 66 ^ 108 + 141 - 112 + 40 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    static {
        aQ.var4();
    }

    @Inject
    public HarvestingTheCompostBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }
}

