/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.query.entities.NPCQuery
 *  net.unethicalite.api.query.results.SceneEntityQueryResults
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.query.entities.NPCQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;

@TaskDesc(name="Planting bait", priority=35, blocking=true)
public class PlantingBaitTask
extends Task {
     WorldArea fn;
    private static  String[] llIllllI;
    private static  int[] lllIIIII;

    public boolean run() {
        bb var1;
        int[] nArray = new int[5];
        nArray[4] = 6;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 4;
        }
        if ((Players.getLocal().getAnimation() == 7)) {
            return 4;
        }
        if ((Players.getLocal( != null).getInteracting())) {
            return 4;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 4;
        }
        List var2 = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(llIllllI[5]));
        if ((var2.size() >= 8)) {
            return 4;
        }
        WorldArea[] worldAreaArray = new WorldArea[5];
        worldAreaArray[4] = var1.fn;
        if ((Players.getLocal( == 0).getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var1.fn.getRandom());
            0;
            return 5;
        }
        WorldPoint[] worldPointArray = new WorldPoint[5];
        worldPointArray[4] = Players.getLocal().getWorldLocation();
        NPC var3 = (NPC)((SceneEntityQueryResults)((NPCQuery)NPCs.query().locations(worldPointArray)).results()).nearest();
        if var3 != null {
            Movement.walkTo((WorldPoint)var1.fn.getRandom());
            0;
            return 5;
        }
        int[] nArray2 = new int[5];
        nArray2[4] = 6;
        Inventory.getFirst((int[])nArray2).interact(llIllllI[4]);
        this.sleep(9);
        return 5;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public PlantingBaitTask() {
        this.fn = new WorldArea(0, 1, 2, 3, 4);
    }
}

