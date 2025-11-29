/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.GameEnum4;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Grabbing swamp toads")
public class GrabbingSwampToadsTask
extends Task {

    @Inject
    private  SecondariesConfig gZ;
    private static final  WorldArea gY;

    private static boolean lIlIlIlIIl(Object object) {
        return object == null;
    }

    private static void lIlIlIIIll() {
        lIlllllI = new String[lIllllll[8]];
        bT.lIlllllI[bT.lIllllll[0]] = "Remove-legs";
        bT.lIlllllI[bT.lIllllll[1]] = "Take";
    }

    private static boolean lIlIlIlIII(int n2) {
        return n2 <= 0;
    }

    private static boolean lIlIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bT.lIlIlIIlII();
        bT.lIlIlIIIll();
        gY = new WorldArea(lIllllll[4], lIllllll[5], lIllllll[6], lIllllll[7], lIllllll[0]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        List llIlllIIIIIIllI;
        if (bT.lIlIlIIlIl((Object)this.gZ.secondary(), (Object)bO.SWAMP_TOAD)) {
            return lIllllll[0];
        }
        if (bT.lIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
            return lIllllll[0];
        }
        if (bT.lIlIlIIlll(gY.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            if (bT.lIlIlIIllI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)gY.getCenter());

            }
            return lIllllll[1];
        }
        if (bT.lIlIlIIllI(Movement.isWalking() ? 1 : 0)) {
            int[] nArray = new int[lIllllll[1]];
            nArray[bT.lIllllll[0]] = lIllllll[2];
            llIlllIIIIIIllI = Inventory.getAll((int[])nArray);
            int llIlllIIIIIIlIl = lIllllll[3];
            Iterator llIlllIIIIIIlII = llIlllIIIIIIllI.iterator();
            while (bT.lIlIlIIllI(llIlllIIIIIIlII.hasNext() ? 1 : 0)) {
                Item llIlllIIIIIIIll = (Item)llIlllIIIIIIlII.next();
                if (bT.lIlIlIlIII(llIlllIIIIIIlIl--)) {

                    if (((0xA5 ^ 0x86) & ~(0x49 ^ 0x6A)) <= 0) break;
                    return false;
                }
                llIlllIIIIIIIll.interact(lIlllllI[lIllllll[0]]);

                if ((0x4D ^ 0x49) > 2) continue;
                return false;
            }
        }
        int[] nArray = new int[lIllllll[1]];
        nArray[bT.lIllllll[0]] = lIllllll[2];
        llIlllIIIIIIllI = TileItems.getNearest((int[])nArray);
        if (bT.lIlIlIlIIl(llIlllIIIIIIllI)) {
            return lIllllll[0];
        }
        var1_1.interact(lIlllllI[lIllllll[1]]);
        return lIllllll[1];
    }

    private static boolean lIlIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIlIl(Object object, Object object2) {
        return object != object2;
    }

        return String.valueOf(llIllIlllllIllI);
    }

}

