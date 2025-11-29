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
import gg.squire.duke.tasks.BHelper;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Exit Arder Area", priority=87, blocking=true)
public class ExitArderAreaTask
extends Task {
    final  SquireDukeSucellus bt;
    final  a bu;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public ExitArderAreaTask(SquireDukeSucellus squireDukeSucellus) {
        this.bt = squireDukeSucellus;
        this.bu = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.bu.v( != 0))) {
            return 0;
        }
        TileObject var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[3];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (1 != (0x42 ^ 0x46)) return n2 != 0;
                    return ((0xA5 ^ 0x94) & ~(0xF6 ^ 0xC7)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var9 == null {
            return 0;
        }
        Player var10 = Players.getLocal();
        if var10 == null {
            return 0;
        }
        if ((b.illlllllllllllllIlIllllIIlIIllIll.contains((Locatable)var10) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        Item var11 = Inventory.getFirst((String[])stringArray);
        if (!var11 != null || (var11.getQuantity() < 2)) {
            return 0;
        }
        if ((b.blllllllllllllllIlIllllIIlIIllIll.contains((Locatable)var10) ? 1 : 0) && (b.f(var9 == 0).equals((Object)var10.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.f(var9));
            return 1;
        }
        Movement.setDestination((WorldPoint)b.j((TileObject)var1_1));
        return 1;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

}

