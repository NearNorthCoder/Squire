/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining huge remains", priority=6, blocking=true)
public class MiningHugeRemainsTask
extends RunecraftingTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        y var3;
        if (!(this.aV.g( != 0) ? 1 : 0) || (SquireGOTRPlugin.g.contains((Locatable == 0)Players.getLocal()) ? 1 : 0)) {
            return 1;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 2;
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if var4 == null {
            return 1;
        }
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0) && (var3.b(GameObjectlllllllllllllllIlIIlIlllIllIIIll) ? 1 : 0)) {
            return 0;
        }
        if ((var3.aV.o() > 3) && (Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            return 0;
        }
        var1_1.interact(var2[1]);
        return 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    public MiningHugeRemainsTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

}

