/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum20;
import gg.squire.farmer.tasks.GameEnum15;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Seeding birdhouse", priority=5)
public class SeedingBirdhouseTask
extends aG {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    protected SeedingBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[0];
        fArray[1] = F.BUILT;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(E e2) {
        TileObject tileObject = this.cu.a(e2);
        if (!tileObject != null || (tileObject.distanceTo((Locatable)Players.getLocal()) > 2)) {
            return 1;
        }
        Item var9 = Inventory.getFirst(item -> {
            int n2;
            if ((item.isStackable( != 0) ? 1 : 0) && (item.getName( != 0).toLowerCase().contains(var2[1]) ? 1 : 0)) {
                n2 = 0;
                0;
                if (-1 >= 0) {
                    return ((9 ^ 0x17) & ~(0xBA ^ 0xA4)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var9 != null {
            void var10;
            aJ var11;
            void var12;
            var9.useOn((TileObject)var12);
            var11.cu.Q().add((E)var10);
            0;
            return 0;
        }
        return 1;
    }

}

