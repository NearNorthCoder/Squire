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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

/* TASK: Planting bait -> PlantingbaitTask */
@TaskDesc(name="Planting bait", priority=35, blocking=true)
public class PlantingBaitTask
extends Task {
    /* synthetic */ WorldArea fn;
    private static /* synthetic */ String[] llIllllI;
    private static /* synthetic */ int[] lllIIIII;

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
            0;
            return lllIIIII[5];
        }
        WorldPoint[] worldPointArray = new WorldPoint[lllIIIII[5]];
        worldPointArray[bb.lllIIIII[4]] = Players.getLocal().getWorldLocation();
        NPC llIlIlIIlIIIllI = (NPC)((SceneEntityQueryResults)((NPCQuery)NPCs.query().locations(worldPointArray)).results()).nearest();
        if (bb.llIIIllIIl(llIlIlIIlIIIllI)) {
            Movement.walkTo((WorldPoint)llIlIlIIlIIlIII.fn.getRandom());
            0;
            return lllIIIII[5];
        }
        int[] nArray2 = new int[lllIIIII[5]];
        nArray2[bb.lllIIIII[4]] = lllIIIII[6];
        Inventory.getFirst((int[])nArray2).interact(llIllllI[lllIIIII[4]]);
        this.sleep(lllIIIII[9]);
        return lllIIIII[5];
    }

    private static String llIIIlIIlI(String llIlIlIIIllllII, String llIlIlIIIlllIll) {
        try {
            SecretKeySpec llIlIlIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIlIIlIIIIII = Cipher.getInstance("Blowfish");
            llIlIlIIlIIIIII.init(lllIIIII[9], llIlIlIIlIIIIIl);
            return new String(llIlIlIIlIIIIII.doFinal(Base64.getDecoder().decode(llIlIlIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIlIIIllllll) {
            llIlIlIIIllllll.printStackTrace();
            return null;
        }
    }

    static {
        bb.llIIIlIllI();
        bb.llIIIlIlIl();
    }

    private static boolean llIIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIlIllI() {
        lllIIIII = new int[10];
        bb.lllIIIII[0] = 0xFFFFDFB9 & 0x295E;
        bb.lllIIIII[1] = 0xFFFF8BF2 & 0x7FFD;
        bb.lllIIIII[2] = 0x21 ^ 0x27;
        bb.lllIIIII[3] = 0x99 ^ 0x9D;
        bb.lllIIIII[4] = (0x17 ^ 0x37 ^ (0xC4 ^ 0xB5)) & (0x3B ^ 0x12 ^ (0x45 ^ 0x3D) ^ -1);
        bb.lllIIIII[5] = 1;
        bb.lllIIIII[6] = -(0xFFFFB43F & 0x6FC5) & (0xFFFFAF3F & Short.MAX_VALUE);
        bb.lllIIIII[7] = 0xFFFFBE6E & 0x4593;
        bb.lllIIIII[8] = 0x5B ^ 0x5E;
        bb.lllIIIII[9] = 2;
    }

    private static boolean llIIIlIlll(int n2) {
        return n2 == 0;
    }

    private static void llIIIlIlIl() {
        llIllllI = new String[lllIIIII[9]];
        bb.llIllllI[bb.lllIIIII[4]] = bb."Drop";
        bb.llIllllI[bb.lllIIIII[5]] = bb."bloated toad";
    }

    private static boolean llIIIllIIl(Object object) {
        return object != null;
    }

    public bb() {
        this.fn = new WorldArea(lllIIIII[0], lllIIIII[1], lllIIIII[2], lllIIIII[3], lllIIIII[4]);
    }
}

