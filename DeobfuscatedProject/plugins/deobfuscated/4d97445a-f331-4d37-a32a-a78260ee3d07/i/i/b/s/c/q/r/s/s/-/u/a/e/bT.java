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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bO;
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
public class bT
extends Task {
    private static /* synthetic */ int[] lIllllll;
    private static /* synthetic */ String[] lIlllllI;
    @Inject
    private /* synthetic */ SecondariesConfig gZ;
    private static final /* synthetic */ WorldArea gY;

    private static boolean lIlIlIlIIl(Object object) {
        return object == null;
    }

    private static void lIlIlIIIll() {
        lIlllllI = new String[lIllllll[8]];
        bT.lIlllllI[bT.lIllllll[0]] = bT."Remove-legs";
        bT.lIlllllI[bT.lIllllll[1]] = bT."Take";
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
                0;
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
                    0;
                    if (((0xA5 ^ 0x86) & ~(0x49 ^ 0x6A)) <= 0) break;
                    return ((0xAB ^ 0xBC) & ~(0x23 ^ 0x34)) != 0;
                }
                llIlllIIIIIIIll.interact(lIlllllI[lIllllll[0]]);
                0;
                if ((0x4D ^ 0x49) > 2) continue;
                return ((0x69 ^ 0x4E) & ~(0x7F ^ 0x58)) != 0;
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

    private static String lIlIlIIIlI(String llIllIllllIIIll, String llIllIllllIIIII) {
        try {
            SecretKeySpec llIllIllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllllIIIII.getBytes(StandardCharsets.UTF_8)), lIllllll[3]), "DES");
            Cipher llIllIllllIIlIl = Cipher.getInstance("DES");
            llIllIllllIIlIl.init(lIllllll[8], llIllIllllIIllI);
            return new String(llIllIllllIIlIl.doFinal(Base64.getDecoder().decode(llIllIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIllllIIlII) {
            llIllIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIIIIl(String llIllIlllllIIll, String llIllIlllllIIlI) {
        llIllIlllllIIll = new String(Base64.getDecoder().decode(llIllIlllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlllllIllI = new StringBuilder();
        char[] llIllIlllllIlIl = llIllIlllllIIlI.toCharArray();
        int llIllIlllllIlII = lIllllll[0];
        char[] llIllIllllIlllI = llIllIlllllIIll.toCharArray();
        int llIllIllllIllIl = llIllIllllIlllI.length;
        int llIllIllllIllII = lIllllll[0];
        while (bT.lIlIlIlIlI(llIllIllllIllII, llIllIllllIllIl)) {
            char llIllIllllllIIl = llIllIllllIlllI[llIllIllllIllII];
            llIllIlllllIllI.append((char)(llIllIllllllIIl ^ llIllIlllllIlIl[llIllIlllllIlII % llIllIlllllIlIl.length]));
            0;
            ++llIllIlllllIlII;
            ++llIllIllllIllII;
            0;
            if (((0xE9 ^ 0xAD) & ~(0x7C ^ 0x38)) == 0) continue;
            return null;
        }
        return String.valueOf(llIllIlllllIllI);
    }

    private static void lIlIlIIlII() {
        lIllllll = new int[9];
        bT.lIllllll[0] = (144 + 180 - 284 + 166 ^ 103 + 96 - 70 + 14) & (0x56 ^ 0x7D ^ (0x5A ^ 0x30) ^ -1);
        bT.lIllllll[1] = 1;
        bT.lIllllll[2] = -(0xFFFFDBBD & 0x675B) & (0xFFFFCFFF & 0x7B7E);
        bT.lIllllll[3] = 139 + 6 - 115 + 127 ^ 100 + 84 - 155 + 120;
        bT.lIllllll[4] = -(0xFFFFFCCA & 0x773F) & (0xFFFFFD7F & 0x7FEF);
        bT.lIllllll[5] = -(0xFFFFD7FF & 0x784F) & (0xFFFFFDFF & 0x5FFF);
        bT.lIllllll[6] = 0x40 ^ 0x59;
        bT.lIllllll[7] = 0x25 ^ 0x2A;
        bT.lIllllll[8] = 2;
    }
}

