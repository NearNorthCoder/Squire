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

/* TASK: Equipping recoil ring -> EquippingrecoilringTask */
@TaskDesc(name="Equipping recoil ring", priority=0x7FFFFFFE, blocking=true)
public class EquippingRecoilRingTask
extends Task {
    private static /* synthetic */ int[] lIllIlllIIlIl;
    private static /* synthetic */ String[] lIllIlllIIlII;

    private static boolean llIIlIIlIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIlIIlIllIIll() {
        lIllIlllIIlII = new String[lIllIlllIIlIl[2]];
        A.lIllIlllIIlII[A.lIllIlllIIlIl[1]] = A."Wear";
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
        A.lIllIlllIIlIl[1] = (101 + 11 - 82 + 167 ^ 142 + 157 - 242 + 137) & (105 + 151 - 105 + 21 ^ 92 + 62 - 79 + 96 ^ -1);
        A.lIllIlllIIlIl[2] = 1;
        A.lIllIlllIIlIl[3] = 2;
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
        Item var3 = Inventory.getFirst((int[])nArray);
        if (A.llIIlIIlIllIlll(var3)) {
            return lIllIlllIIlIl[1];
        }
        var2_2.interact(lIllIlllIIlII[lIllIlllIIlIl[1]]);
        return lIllIlllIIlIl[2];
    }

    private static String llIIlIIlIllIIlI(String var2, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllIlllIIlIl[3], var5);
            return new String(var1.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }
}

