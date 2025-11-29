/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Grabbing uncharged cells", priority=15, blocking=true)
public class GrabbingUnchargedCellsTask
extends RunecraftingTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean ak() {
        j var9;
        if ((this.aV.d() == 2)) {
            return 1;
        }
        if ((SquireGOTRPlugin.g.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        GameObject var10 = var9.aV.y();
        if (var10 != null && (Reachable.isInteractable(LocatablelllllllllllllllIlIIlIllIIIlllIII) ? 1 : 0)) {
            var10.interact(var1[1]);
            return 0;
        }
        return 1;
    }

    @Inject
    public GrabbingUnchargedCellsTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }
}

