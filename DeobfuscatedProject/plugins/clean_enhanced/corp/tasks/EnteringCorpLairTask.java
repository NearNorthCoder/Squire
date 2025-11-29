/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Entering corp lair")
public class EnteringCorpLairTask
extends CorpTaskBase {

    @Inject
    private  SquireCorp p;
    private static final  int w;
    private static final  int v;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q var3;
        if ((this.g( == 0) ? 1 : 0)) {
            return 0;
        }
        NPC var4 = var3.f();
        if (var4 != null && (Reachable.isInteractable(LocatablelllllllllllllllIllIIIlllIIlIIlIl) ? 1 : 0)) {
            if ((var4.isDead( != 0) ? 1 : 0)) {
                var3.p.b(0);
                var3.sleep(1);
            }
            return 0;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0)) {
            Dialog.chooseOption((int)2);
            0;
            var3.sleep(3);
            return 2;
        }
        int[] nArray = new int[2];
        nArray[0] = 4;
        TileObject var5 = TileObjects.getNearest((int[])nArray);
        if (var5 != null && (Reachable.isInteractable((Locatable == 0)var5) ? 1 : 0)) {
            int[] nArray2 = new int[2];
            nArray2[0] = 5;
            TileObject var6 = TileObjects.getNearest((int[])nArray2);
            if var6 == null {
                return 0;
            }
            var6.interact(var2[0]);
            return 2;
        }
        if var5 == null {
            return 0;
        }
        if ((Players.getLocal( != 0).getWorldLocation().equals((Object)var5.getWorldLocation()) ? 1 : 0)) {
            if (!(Combat.getMissingHealth( <= 0)) || (Combat.getSpecEnergy() < 6)) {
                TeleportLoader.enterHouse();
                0;
            }
            return 0;
        }
        Movement.setDestination((WorldPoint)var2_2.getWorldLocation());
        return 2;
    }

    static {
        q.var7();
        q.var8();
        w = 5;
        v = 4;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

}

