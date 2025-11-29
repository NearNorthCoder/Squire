/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping recoil ring", priority=0x7FFFFFFE, blocking=true)
public class A
extends Task {
    private static /* synthetic */ int[] lIllIlllIIlIl;
    private static /* synthetic */ String[] lIllIlllIIlII;

    private static boolean llIIlIIlIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIlIIlIllIIll() {
        lIllIlllIIlII = new String[lIllIlllIIlIl[2]];
        A.lIllIlllIIlII[A.lIllIlllIIlIl[1]] = A.llIIlIIlIllIIlI("SPzhxUE2ALg=", "vNFhD");
    }

    private static boolean llIIlIIlIllIlll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIlIllIlIl(Object object) {
        return object != null;
    }

    private static void llIIlIIlIllIlII() {
        lIllIlllIIlIl = new int[4];
        A.lIllIlllIIlIl[0] = -(0xFFFFF6F3 & 0x7B0E) & (0xFFFFFFFF & 0x7BF7);
        A.lIllIlllIIlIl[1] = (101 + 11 - 82 + 167 ^ 142 + 157 - 242 + 137) & (105 + 151 - 105 + 21 ^ 92 + 62 - 79 + 96 ^ -" ".length());
        A.lIllIlllIIlIl[2] = " ".length();
        A.lIllIlllIIlIl[3] = "  ".length();
    }

    static {
        A.llIIlIIlIllIlII();
        A.llIIlIIlIllIIll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.RING);
        if (A.llIIlIIlIllIlIl(item) && A.llIIlIIlIllIllI(item.getId(), lIllIlllIIlIl[0])) {
            return lIllIlllIIlIl[1];
        }
        int[] nArray = new int[lIllIlllIIlIl[2]];
        nArray[A.lIllIlllIIlIl[1]] = lIllIlllIIlIl[0];
        Item llllllllllllllIllIIIlIIllIIIIlll = Inventory.getFirst((int[])nArray);
        if (A.llIIlIIlIllIlll(llllllllllllllIllIIIlIIllIIIIlll)) {
            return lIllIlllIIlIl[1];
        }
        var2_2.interact(lIllIlllIIlII[lIllIlllIIlIl[1]]);
        return lIllIlllIIlIl[2];
    }

    private static String llIIlIIlIllIIlI(String llllllllllllllIllIIIlIIlIlllllll, String llllllllllllllIllIIIlIIlIlllllII) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIllIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIIllIIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIIllIIIIIIl.init(lIllIlllIIlIl[3], llllllllllllllIllIIIlIIllIIIIIlI);
            return new String(llllllllllllllIllIIIlIIllIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIllIIIIIII) {
            llllllllllllllIllIIIlIIllIIIIIII.printStackTrace();
            return null;
        }
    }
}

