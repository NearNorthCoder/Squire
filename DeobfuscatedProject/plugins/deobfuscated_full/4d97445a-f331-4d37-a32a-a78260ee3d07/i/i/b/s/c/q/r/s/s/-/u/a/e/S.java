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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

/* TASK: Equipping bracelets -> EquippingbraceletsTask */
@TaskDesc(name="Equipping bracelets")
public class S
extends Task {
    private static /* synthetic */ String[] lllIllIll;
    private static /* synthetic */ int[] lllIlllII;

    private static void llIIllIIllI() {
        lllIlllII = new int[7];
        S.lllIlllII[0] = (0x5C ^ 0x1D) & ~(0x54 ^ 0x15);
        S.lllIlllII[1] = 2;
        S.lllIlllII[2] = 0xFFFFD3BF & 0x7EFF;
        S.lllIlllII[3] = 1;
        S.lllIlllII[4] = -(0xFFFFB9FF & 0x6F45) & (0xFFFFFFFF & 0x7BFD);
        S.lllIlllII[5] = 3;
        S.lllIlllII[6] = 0x9B ^ 0x93;
    }

    private static String llIIllIIlII(String lIlIlIIIIlIllII, String lIlIlIIIIlIlIll) {
        try {
            SecretKeySpec lIlIlIIIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), lllIlllII[6]), "DES");
            Cipher lIlIlIIIIllIIII = Cipher.getInstance("DES");
            lIlIlIIIIllIIII.init(lllIlllII[1], lIlIlIIIIllIIIl);
            return new String(lIlIlIIIIllIIII.doFinal(Base64.getDecoder().decode(lIlIlIIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIIlIllll) {
            lIlIlIIIIlIllll.printStackTrace();
            return null;
        }
    }

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

    private static String llIIllIIIll(String lIlIlIIIIlllIll, String lIlIlIIIIlllIII) {
        try {
            SecretKeySpec lIlIlIIIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIIllllIl = Cipher.getInstance("Blowfish");
            lIlIlIIIIllllIl.init(lllIlllII[1], lIlIlIIIIlllllI);
            return new String(lIlIlIIIIllllIl.doFinal(Base64.getDecoder().decode(lIlIlIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIIllllII) {
            lIlIlIIIIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlll(Object object) {
        return object != null;
    }

    private static void llIIllIIlIl() {
        lllIllIll = new String[lllIlllII[5]];
        S.lllIllIll[S.lllIlllII[0]] = S."Wield";
        S.lllIllIll[S.lllIlllII[3]] = S."Wear";
        S.lllIllIll[S.lllIlllII[1]] = S."Equip";
    }
}

