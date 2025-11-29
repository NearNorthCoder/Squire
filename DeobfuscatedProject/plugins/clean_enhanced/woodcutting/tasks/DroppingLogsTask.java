/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping logs", priority=5, blocking=true)
public class DroppingLogsTask
extends Task {
    private final  SquireWoodcutterPlugin z;
    
    private final  SquireWoodcutterConfig A;

    public boolean run() {
        d var3;
        if (!(this.A.bank( == 0) ? 1 : 0) || !(this.A.fastTickChop( == 0) ? 1 : 0) || (this.A.cutLogs( != 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(this.A.tree().r()));
        Predicate<Item> var5 = item -> {
            boolean bl;
            if (!(item.getName( == 0).toLowerCase().contains(this.A.tree().r().toLowerCase()) ? 1 : 0) || (item.getName( != 0).equals(var1[0]) ? 1 : 0)) {
                bl = 1;
                0;
                if ((0xA7 ^ 0xA3) > (0xAA ^ 0xAE)) {
                    return ((0x40 ^ 0x7B) & ~(0x8D ^ 0xB6)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        };
        if (!(Inventory.isFull( == 0) ? 1 : 0) || var4 == null) {
            Item var6 = Inventory.getFirst(var5);
            if var6 == null {
                return 0;
            }
            Inventory.dropAll(var5);
            0;
            return 1;
        }
        return 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public DroppingLogsTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.z = squireWoodcutterPlugin;
        this.A = squireWoodcutterConfig;
    }
}

