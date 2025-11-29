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
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Creating essence", priority=1, blocking=true)
public class CreatingEssenceTask
extends RunecraftingTaskBase {

    @Inject
    public CreatingEssenceTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.COUNTDOWN;
        cArray[2] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ak() {
        void var1_1;
        n var3;
        if (((Object)this.aV.m() == (Object)this.aV.m()2)c.ACTIVATING) && (this.aV.a() < this.aW.fragmentAmount())) {
            return 1;
        }
        int[] nArray = new int[2];
        nArray[1] = 3;
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        Player var5 = Players.getLocal();
        if (!(Inventory.isFull( == 0) ? 1 : 0) || !var4 != null || (SquireGOTRPlugin.g.contains(LocatablelllllllllllllllIlIIllIlIlIIlIIII) ? 1 : 0)) {
            return 1;
        }
        if ((SquireGOTRPlugin.h.contains(LocatablelllllllllllllllIlIIllIlIlIIlIIII) ? 1 : 0) && (var3.aV.a() < var3.aW.fragmentAmount())) {
            return 1;
        }
        if ((var3.aV.c( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((var3.aV.o() > 0) && (Players.getLocal().getAnimation() == 4)) {
            return 2;
        }
        if ((Reachable.isInteractable((Locatable == 0)var4) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var4.getWorldLocation(), (boolean)1);
            0;
            return 2;
        }
        if ((var3.b(GameObjectlllllllllllllllIlIIllIlIlIIlIIIl) ? 1 : 0)) {
            return 1;
        }
        var1_1.interact(var1[1]);
        this.sleep(2);
        return 2;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }
}

