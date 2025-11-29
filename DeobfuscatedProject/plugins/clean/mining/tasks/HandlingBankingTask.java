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
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Handling banking")
public class HandlingBankingTask
extends Task {

    @Inject
    private  SquireMinerConfig f;

    private static boolean lIIlIIlIIlllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean p() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lllllIIIlIll[4]];
            stringArray[n.lllllIIIlIll[0]] = lllllIIIlIlI[lllllIIIlIll[4]];
            return nPC.hasAction(stringArray);
        });
        if (n.lIIlIIlIIlllIll(nPC2)) {
            void var1;
            if (n.lIIlIIlIIlllIIl(Reachable.isInteractable((Locatable)nPC2) ? 1 : 0)) {
                nPC2.interact(lllllIIIlIlI[lllllIIIlIll[0]]);
                return lllllIIIlIll[4];
            }
            Movement.walkTo((Locatable)var1);

            return lllllIIIlIll[4];
        }
        if (n.lIIlIIlIIlllIIl(Locations.isRegionLoaded((int)lllllIIIlIll[6]) ? 1 : 0)) {
            Movement.walkTo((int)lllllIIIlIll[7], (int)lllllIIIlIll[8]);

            return lllllIIIlIll[4];
        }
        if (n.lIIlIIlIIlllIIl(Locations.isRegionLoaded((int)lllllIIIlIll[9]) ? 1 : 0)) {
            Movement.walkTo((int)lllllIIIlIll[10], (int)lllllIIIlIll[11]);

            return lllllIIIlIll[4];
        }
        return lllllIIIlIll[0];
    }

    static {
        n.lIIlIIlIIllIlll();
        n.lIIlIIlIIllIllI();
    }

    private static void lIIlIIlIIllIllI() {
        lllllIIIlIlI = new String[lllllIIIlIll[2]];
        n.lllllIIIlIlI[n.lllllIIIlIll[0]] = "Teleport";
        n.lllllIIIlIlI[n.lllllIIIlIll[4]] = "Teleport";
    }

        return String.valueOf(var2);
    }

    private static boolean lIIlIIlIIlllIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlIIlllIll(Object object) {
        return object != null;
    }

    public boolean run() {
        if (n.lIIlIIlIIlllIII((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return lllllIIIlIll[0];
        }
        if (n.lIIlIIlIIlllIIl(Locations.isRegionLoaded((int)lllllIIIlIll[1]) ? 1 : 0)) {
            return lllllIIIlIll[0];
        }
        int[] nArray = new int[lllllIIIlIll[2]];
        nArray[n.lllllIIIlIll[0]] = lllllIIIlIll[3];
        nArray[n.lllllIIIlIll[4]] = lllllIIIlIll[5];
        if (n.lIIlIIlIIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            n var3;
            return var3.p();
        }
        if (n.lIIlIIlIIlllIIl(Bank.open() ? 1 : 0)) {
            int[] nArray2 = new int[lllllIIIlIll[2]];
            nArray2[n.lllllIIIlIll[0]] = lllllIIIlIll[3];
            nArray2[n.lllllIIIlIll[4]] = lllllIIIlIll[5];
            Bank.depositAll((int[])nArray2);
            return lllllIIIlIll[4];
        }
        BankLocation bankLocation = BankLocation.getNearest();
        Movement.walkTo((WorldPoint)bankLocation.getArea().getCenter());

        return lllllIIIlIll[4];
    }

    private static boolean lIIlIIlIIllllII(int n2, int n3) {
        return n2 < n3;
    }
}

