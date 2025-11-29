/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import java.util.Iterator;
import javax.inject.Inject;
import gg.squire.combat.tasks.DHelper;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Looting", priority=10, blocking=true)
public class LootingTask
extends Task {
    
    private final  SquireBlueDragonKiller F;

    public boolean run() {
        j var3;
        if ((this.F.c( != 0).isEmpty() ? 1 : 0)) {
            return 0;
        }
        if ((Prayers.anyActive( != 0) ? 1 : 0)) {
            Prayers.disableAll();
            return 1;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            Item var4 = Inventory.getFirst(item -> {
                String[] stringArray = new String[1];
                stringArray[0] = var2[2];
                return item.hasAction(stringArray);
            });
            if var4 == null {
                var3.F.c().clear();
                return 0;
            }
            var4.interact(var2[0]);
            var3.sleep(2);
            return 1;
        }
        Iterator<d> var4 = var3.F.c().iterator();
        while ((var4.hasNext( != 0) ? 1 : 0)) {
            d var5 = var4.next();
            int[] nArray = new int[1];
            nArray[0] = var5.r();
            TileItem var6 = TileItems.getFirstAt((WorldPoint)var5.o(), (int[])nArray);
            if var6 == null {
                var3.F.c().remove(var5);
                0;
                0;
                if ((0x64 ^ 0x60) >= 1) break;
                return ((0x3C ^ 0x7B) & ~(0xD6 ^ 0x91)) != 0;
            }
            if ((var3.alllllllllllllllIlllIlIlIIlllllll)) {
                var6.interact(var2[1]);
                return 1;
            }
            0;
            
            return ((0x94 ^ 0x80) & ~(0x2E ^ 0x3A)) != 0;
        }
        return 0;
    }

    @Inject
    public LootingTask(SquireBlueDragonKiller squireBlueDragonKiller) {
        this.F = squireBlueDragonKiller;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(TileItem tileItem) {
        boolean bl;
        block3: {
            block2: {
                if (!(Inventory.isFull( != 0) ? 1 : 0)) break block2;
                if (!(tileItem.isStackable( != 0) ? 1 : 0)) break block3;
                int[] nArray = new int[1];
                nArray[0] = tileItem.getId();
                if (!(Inventory.contains((int[] != 0)nArray) ? 1 : 0)) break block3;
            }
            bl = 1;
            0;
            if (-1 <= 0) return bl;
            return ((0x3B ^ 0x64 ^ (0xC5 ^ 0x80)) & (0xD8 ^ 0xC2 ^ (0x5D ^ 0x67) & ~(0x55 ^ 0x6F) ^ -1)) != 0;
        }
        bl = 0;
        return bl;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

}

