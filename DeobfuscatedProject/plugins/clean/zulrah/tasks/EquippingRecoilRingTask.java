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
package gg.squire.zulrah.tasks;

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
public class EquippingRecoilRingTask
extends Task {

    private static boolean llIIlIIlIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIlIIlIllIIll() {
        lIllIlllIIlII = new String[lIllIlllIIlIl[2]];
        A.lIllIlllIIlII[A.lIllIlllIIlIl[1]] = "Wear";
    }

    private static boolean llIIlIIlIllIlll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIlIllIlIl(Object object) {
        return object != null;
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
        Item var1 = Inventory.getFirst((int[])nArray);
        if (A.llIIlIIlIllIlll(var1)) {
            return lIllIlllIIlIl[1];
        }
        var2_2.interact(lIllIlllIIlII[lIllIlllIIlIl[1]]);
        return lIllIlllIIlIl[2];
    }

}

