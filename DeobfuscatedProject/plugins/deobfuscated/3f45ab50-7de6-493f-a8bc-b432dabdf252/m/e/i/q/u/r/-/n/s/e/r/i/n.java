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
package m.e.i.q.u.r.-.n.s.e.r.i;

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
import m.e.i.q.u.r.-.n.s.e.r.i.a;
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
public class n
extends Task {
    private static /* synthetic */ int[] lllllIIIlIll;
    private static /* synthetic */ String[] lllllIIIlIlI;
    @Inject
    private /* synthetic */ SquireMinerConfig f;

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
            void lllllllllllllllIIlIIllIlIIIIIIII;
            if (n.lIIlIIlIIlllIIl(Reachable.isInteractable((Locatable)nPC2) ? 1 : 0)) {
                nPC2.interact(lllllIIIlIlI[lllllIIIlIll[0]]);
                return lllllIIIlIll[4];
            }
            Movement.walkTo((Locatable)lllllllllllllllIIlIIllIlIIIIIIII);
            0;
            return lllllIIIlIll[4];
        }
        if (n.lIIlIIlIIlllIIl(Locations.isRegionLoaded((int)lllllIIIlIll[6]) ? 1 : 0)) {
            Movement.walkTo((int)lllllIIIlIll[7], (int)lllllIIIlIll[8]);
            0;
            return lllllIIIlIll[4];
        }
        if (n.lIIlIIlIIlllIIl(Locations.isRegionLoaded((int)lllllIIIlIll[9]) ? 1 : 0)) {
            Movement.walkTo((int)lllllIIIlIll[10], (int)lllllIIIlIll[11]);
            0;
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
        n.lllllIIIlIlI[n.lllllIIIlIll[0]] = n."Teleport";
        n.lllllIIIlIlI[n.lllllIIIlIll[4]] = n."Teleport";
    }

    private static String lIIlIIlIIllIlII(String lllllllllllllllIIlIIllIIllllIIII, String lllllllllllllllIIlIIllIIllllIlII) {
        lllllllllllllllIIlIIllIIllllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIIllllIIll = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIllllIIlI = lllllllllllllllIIlIIllIIllllIlII.toCharArray();
        int lllllllllllllllIIlIIllIIllllIIIl = lllllIIIlIll[0];
        char[] lllllllllllllllIIlIIllIIlllIlIll = lllllllllllllllIIlIIllIIllllIIII.toCharArray();
        int lllllllllllllllIIlIIllIIlllIlIlI = lllllllllllllllIIlIIllIIlllIlIll.length;
        int lllllllllllllllIIlIIllIIlllIlIIl = lllllIIIlIll[0];
        while (n.lIIlIIlIIllllII(lllllllllllllllIIlIIllIIlllIlIIl, lllllllllllllllIIlIIllIIlllIlIlI)) {
            char lllllllllllllllIIlIIllIIllllIllI = lllllllllllllllIIlIIllIIlllIlIll[lllllllllllllllIIlIIllIIlllIlIIl];
            lllllllllllllllIIlIIllIIllllIIll.append((char)(lllllllllllllllIIlIIllIIllllIllI ^ lllllllllllllllIIlIIllIIllllIIlI[lllllllllllllllIIlIIllIIllllIIIl % lllllllllllllllIIlIIllIIllllIIlI.length]));
            0;
            ++lllllllllllllllIIlIIllIIllllIIIl;
            ++lllllllllllllllIIlIIllIIlllIlIIl;
            0;
            if (3 != ((0x99 ^ 0xA7 ^ (0x5F ^ 0x43)) & (18 + 114 - 90 + 112 ^ 118 + 21 - 90 + 135 ^ -1))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIIllllIIll);
    }

    private static void lIIlIIlIIllIlll() {
        lllllIIIlIll = new int[13];
        n.lllllIIIlIll[0] = (0x1F ^ 0x1A) & ~(0x91 ^ 0x94);
        n.lllllIIIlIll[1] = 0xFFFFBD4B & 0x6FFF;
        n.lllllIIIlIll[2] = 2;
        n.lllllIIIlIll[3] = 0xFFFF9F97 & 0x7F68;
        n.lllllIIIlIll[4] = 1;
        n.lllllIIIlIll[5] = -(0xFFFFF80B & 0x4FF7) & (0xFFFFCFBF & 0x7DDE);
        n.lllllIIIlIll[6] = -(0xFFFFDB9F & 0x6DEB) & (0xFFFFFFBF & 0x7BFF);
        n.lllllIIIlIll[7] = 0xFFFFEDFD & 0x1EB6;
        n.lllllIIIlIll[8] = -(0xFFFFB2FE & 0x5FB5) & (0xFFFFBFFB & 0x5FFF);
        n.lllllIIIlIll[9] = -(0xFFFFDFEF & 0x235E) & (0xFFFFAB7D & Short.MAX_VALUE);
        n.lllllIIIlIll[10] = 0xFFFF9A1E & 0x6FFF;
        n.lllllIIIlIll[11] = 0xFFFFBD0F & 0x4EFF;
        n.lllllIIIlIll[12] = 100 + 27 - -5 + 13 ^ 71 + 101 - 57 + 38;
    }

    private static boolean lIIlIIlIIlllIII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIlIIlIIllIlIl(String lllllllllllllllIIlIIllIIllIllllI, String lllllllllllllllIIlIIllIIllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), lllllIIIlIll[12]), "DES");
            Cipher lllllllllllllllIIlIIllIIlllIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIIlllIIIlI.init(lllllIIIlIll[2], lllllllllllllllIIlIIllIIlllIIIll);
            return new String(lllllllllllllllIIlIIllIIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIlllIIIIl) {
            lllllllllllllllIIlIIllIIlllIIIIl.printStackTrace();
            return null;
        }
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
            n lllllllllllllllIIlIIllIlIIIIIIll;
            return lllllllllllllllIIlIIllIlIIIIIIll.p();
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
        0;
        return lllllIIIlIll[4];
    }

    private static boolean lIIlIIlIIllllII(int n2, int n3) {
        return n2 < n3;
    }
}

