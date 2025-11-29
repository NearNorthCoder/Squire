/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.HHelper;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walk To Musca Mushroom", priority=99, blocking=true)
public class WalkToMuscaMushroomTask
extends Task {
    
    final  SquireDukeSucellus bD;
    final  a bE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public WalkToMuscaMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bD = squireDukeSucellus;
        this.bE = squireDukeSucellus.s();
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.bE.w( != 0))) {
            return 0;
        }
        TileObject var15 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[3];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((193 + 128 - 271 + 168 ^ 61 + 126 - 100 + 51) & (94 + 5 - -72 + 22 ^ 81 + 126 - 77 + 15 ^ -1)) >= ((38 + 44 - -87 + 21 ^ 125 + 18 - 94 + 137) & (95 + 58 - 135 + 114 ^ 119 + 7 - 28 + 30 ^ -1))) return n2 != 0;
                    return (((0x7F ^ 0x32) & ~(0x49 ^ 4) & ~((0x32 ^ 0x6F) & ~(0x2C ^ 0x71)) ^ (0x8F ^ 0xA4)) & (0x26 ^ 0x5D ^ (0x42 ^ 0x12) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var15 == null {
            return 0;
        }
        Player var16 = Players.getLocal();
        if var16 == null {
            return 0;
        }
        if ((h.tlllllllllllllllIlIlllIlIllllIIII.contains((Locatable)var16) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        Item var17 = Inventory.getFirst((String[])stringArray);
        if (var17 != null && (var17.getQuantity() >= 2)) {
            return 0;
        }
        if (!(h.d(var15 == 0).contains((Locatable)var16) ? 1 : 0) || (h.glllllllllllllllIlIlllIlIllllIIII.equals((Object)var16.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)h.e(var15));
            return 1;
        }
        Movement.setDestination((WorldPoint)h.g((TileObject)var1_1));
        return 1;
    }

}

