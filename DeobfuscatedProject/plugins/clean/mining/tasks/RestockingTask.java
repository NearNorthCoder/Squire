/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Restocking")
public class RestockingTask
extends Task {

    private final  SquireMinerConfig D;

    private static boolean lIIlIIllIIIIlll(Object object) {
        return object != null;
    }

    static {
        t.lIIlIIllIIIIIIl();
        t.lIIlIIllIIIIIII();
    }

    @Inject
    public RestockingTask(SquireMinerConfig squireMinerConfig) {
        this.D = squireMinerConfig;
    }

    private static boolean lIIlIIllIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIllIIIIIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (t.lIIlIIllIIIIIlI((Object)this.D.activity(), (Object)a.GRANITE)) {
            return lllllIIllllI[0];
        }
        int[] nArray = new int[lllllIIllllI[1]];
        nArray[t.lllllIIllllI[0]] = lllllIIllllI[2];
        nArray[t.lllllIIllllI[3]] = lllllIIllllI[4];
        nArray[t.lllllIIllllI[5]] = lllllIIllllI[6];
        nArray[t.lllllIIllllI[7]] = lllllIIllllI[8];
        if (t.lIIlIIllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIIllllI[0];
        }
        int[] nArray2 = new int[lllllIIllllI[3]];
        nArray2[t.lllllIIllllI[0]] = lllllIIllllI[2];
        if (t.lIIlIIllIIIIlII(Inventory.getCount((int[])nArray2), lllllIIllllI[9])) {
            int[] nArray3 = new int[lllllIIllllI[3]];
            nArray3[t.lllllIIllllI[0]] = lllllIIllllI[2];
            Inventory.getFirst((int[])nArray3).interact(lllllIIlllIl[lllllIIllllI[0]]);
            return lllllIIllllI[0];
        }
        int[] nArray4 = new int[lllllIIllllI[3]];
        nArray4[t.lllllIIllllI[0]] = lllllIIllllI[10];
        NPC var1 = NPCs.getNearest((int[])nArray4);
        if (t.lIIlIIllIIIIIll(Shop.isOpen() ? 1 : 0)) {
            if (t.lIIlIIllIIIIlIl(Shop.getStock((int)lllllIIllllI[2]), lllllIIllllI[9])) {
                Shop.sellFive((int)lllllIIllllI[11]);
                return lllllIIllllI[0];
            }
            if (t.lIIlIIllIIIIllI(Shop.getStock((int)lllllIIllllI[2]), lllllIIllllI[9])) {
                Shop.buyFifty((int)lllllIIllllI[2]);
                return lllllIIllllI[0];
            }
        }
        if (t.lIIlIIllIIIIlll(var1) && t.lIIlIIllIIIIIll(Reachable.isInteractable((Locatable)var1) ? 1 : 0) && t.lIIlIIllIIIlIII(Shop.isOpen() ? 1 : 0)) {
            var1.interact(lllllIIlllIl[lllllIIllllI[3]]);

            }
        } else {
            int[] nArray5 = new int[lllllIIllllI[3]];
            nArray5[t.lllllIIllllI[0]] = lllllIIllllI[12];
            if (t.lIIlIIllIIIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lllllIIllllI[3]];
                nArray6[t.lllllIIllllI[0]] = lllllIIllllI[12];
                Inventory.getFirst((int[])nArray6).interact(lllllIIlllIl[lllllIIllllI[5]]);
                return lllllIIllllI[3];
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIIllllI[13], lllllIIllllI[14], lllllIIllllI[0]));

            return lllllIIllllI[3];
        }
        return lllllIIllllI[3];
    }

        return String.valueOf(var2);
    }

    private static boolean lIIlIIllIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIllIIIIIII() {
        lllllIIlllIl = new String[lllllIIllllI[7]];
        t.lllllIIlllIl[t.lllllIIllllI[0]] = "Drop";
        t.lllllIIlllIl[t.lllllIIllllI[3]] = "Trade";
        t.lllllIIlllIl[t.lllllIIllllI[5]] = "Drop";
    }

    private static boolean lIIlIIllIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIllIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIllIIIIlII(int n2, int n3) {
        return n2 > n3;
    }
}

