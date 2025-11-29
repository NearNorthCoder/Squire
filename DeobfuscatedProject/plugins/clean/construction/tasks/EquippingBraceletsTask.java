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
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping bracelets")
public class EquippingBraceletsTask
extends Task {

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.GLOVES);
        if (S.llIIllIIlll(item) && S.llIIllIIlll(item.getName())) {
            return lllIlllII[0];
        }
        int[] nArray = new int[lllIlllII[1]];
        nArray[S.lllIlllII[0]] = lllIlllII[2];
        nArray[S.lllIlllII[3]] = lllIlllII[4];
        Item lIlIlIIIlIIIIll = Inventory.getFirst((int[])nArray);
        if (S.llIIllIlIII(lIlIlIIIlIIIIll)) {
            return lllIlllII[0];
        }
        String[] stringArray = new String[lllIlllII[5]];
        stringArray[S.lllIlllII[0]] = lllIllIll[lllIlllII[0]];
        stringArray[S.lllIlllII[3]] = lllIllIll[lllIlllII[3]];
        stringArray[S.lllIlllII[1]] = lllIllIll[lllIlllII[1]];
        var2_2.interact(stringArray);
        return lllIlllII[3];
    }

    static {
        S.llIIllIIllI();
        S.llIIllIIlIl();
    }

    private static boolean llIIllIlIII(Object object) {
        return object == null;
    }

    private static boolean llIIllIIlll(Object object) {
        return object != null;
    }

    private static void llIIllIIlIl() {
        lllIllIll = new String[lllIlllII[5]];
        S.lllIllIll[S.lllIlllII[0]] = "Wield";
        S.lllIllIll[S.lllIlllII[3]] = "Wear";
        S.lllIllIll[S.lllIlllII[1]] = "Equip";
    }
}

