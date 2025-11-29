/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining extra fragments", priority=1)
public class MiningExtraFragmentsTask
extends RunecraftingTaskBase {

    @Override
    protected boolean ak() {
        WorldPoint worldPoint;
        o var3;
        if (!(Inventory.isFull( == 0) ? 1 : 0) || !(this.aV.g( != 0) ? 1 : 0) || !(SquireGOTRPlugin.g.contains((Locatable == 0)Players.getLocal()) ? 1 : 0) || (SquireGOTRPlugin.h.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        if ((var3.aV.c( == 0) ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 2;
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if var4 == null {
            worldPoint = Players.getLocal().getWorldLocation();
            0;
            if (-3 > 0) {
                return (2 & ~2) != 0;
            }
        } else {
            worldPoint = var4.getWorldLocation();
        }
        int[] nArray2 = new int[0];
        nArray2[1] = 3;
        TileObject var5 = TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray2);
        if var5 == null {
            return 1;
        }
        Player var6 = Players.getLocal();
        if ((var6.isAnimating( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.b((GameObject == 0)var5) ? 1 : 0)) {
            var5.interact(var1[1]);
            var3.sleep(4);
        }
        return 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public MiningExtraFragmentsTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

}

