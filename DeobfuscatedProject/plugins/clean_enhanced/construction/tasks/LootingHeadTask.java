/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting Head")
public class LootingHeadTask
extends Task {
    private final  LooterConfig eC;
    private static  String[] llIIIll;
    private final  SquireLooter eD;
    private static  int[] llIIlII;

    public boolean run() {
        aM var1;
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 0;
        }
        Iterator<aH> var2 = var1.eD.ch().iterator();
        while ((var2.hasNext( != 0) ? 1 : 0)) {
            aH var3 = var2.next();
            int[] nArray = new int[1];
            nArray[0] = var3.P();
            TileItem var4 = TileItems.getFirstAt((WorldPoint)var3.cd(), (int[])nArray);
            if var4 != null {
                if ((var4.distanceTo(Players.getLocal().getWorldLocation()) > var1.eC.lootRange())) {
                    0;
                    if null == null continue;
                    return ((0x57 ^ 0x63) & ~(0x8F ^ 0xBB)) != 0;
                }
                if ((Inventory.isFull( == 0) ? 1 : 0)) {
                    var4.interact(llIIIll[0]);
                }
                if ((Inventory.isFull( != 0) ? 1 : 0)) {
                    return 0;
                }
            }
            0;
            if (-1 != 1) continue;
            return ((0x3A ^ 0x69) & ~(0x1D ^ 0x4E)) != 0;
        }
        return 1;
    }

    @Inject
    public LootingHeadTask(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eC = looterConfig;
        this.eD = squireLooter;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

}

