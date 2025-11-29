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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean llIIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        bb llIlIlIIlIIlIII;
        int[] nArray = new int[lllIIIII[5]];
        nArray[bb.lllIIIII[4]] = lllIIIII[6];
        if (bb.llIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIIIII[4];
        }
        if (bb.llIIIllIII(Players.getLocal().getAnimation(), lllIIIII[7])) {
            return lllIIIII[4];
        }
        if (bb.llIIIllIIl(Players.getLocal().getInteracting())) {
            return lllIIIII[4];
        }
        if (bb.llIIIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIIII[4];
        }
        List llIlIlIIlIIIlll = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(llIllllI[lllIIIII[5]]));
        if (bb.llIIIllIlI(llIlIlIIlIIIlll.size(), lllIIIII[8])) {
            return lllIIIII[4];
        }
        WorldArea[] worldAreaArray = new WorldArea[lllIIIII[5]];
        worldAreaArray[bb.lllIIIII[4]] = llIlIlIIlIIlIII.fn;
        if (bb.llIIIlIlll(Players.getLocal().getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llIlIlIIlIIlIII.fn.getRandom());

            return lllIIIII[5];
        }
        WorldPoint[] worldPointArray = new WorldPoint[lllIIIII[5]];
        worldPointArray[bb.lllIIIII[4]] = Players.getLocal().getWorldLocation();
        NPC llIlIlIIlIIIllI = (NPC)((SceneEntityQueryResults)((NPCQuery)NPCs.query().locations(worldPointArray)).results()).nearest();
        if (bb.llIIIllIIl(llIlIlIIlIIIllI)) {
            Movement.walkTo((WorldPoint)llIlIlIIlIIlIII.fn.getRandom());

            return lllIIIII[5];
        }
        int[] nArray2 = new int[lllIIIII[5]];
        nArray2[bb.lllIIIII[4]] = lllIIIII[6];
        Inventory.getFirst((int[])nArray2).interact(llIllllI[lllIIIII[4]]);
        this.sleep(lllIIIII[9]);
        return lllIIIII[5];
    }

    static {
        bb.llIIIlIllI();
        bb.llIIIlIlIl();
    }

    private static boolean llIIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIlll(int n2) {
        return n2 == 0;
    }

    private static void llIIIlIlIl() {
        llIllllI = new String[lllIIIII[9]];
        bb.llIllllI[bb.lllIIIII[4]] = "Drop";
        bb.llIllllI[bb.lllIIIII[5]] = "bloated toad";
    }

    private static boolean llIIIllIIl(Object object) {
        return object != null;
    }

    public PlantingBaitTask() {
        this.fn = new WorldArea(lllIIIII[0], lllIIIII[1], lllIIIII[2], lllIIIII[3], lllIIIII[4]);
    }
}

