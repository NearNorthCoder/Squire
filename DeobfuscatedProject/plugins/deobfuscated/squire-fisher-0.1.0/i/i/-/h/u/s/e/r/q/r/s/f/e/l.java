/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Widgets
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Using Special Attack")
public class l
extends Task {
    private static /* synthetic */ String[] lIlllIllIllI;
    private static /* synthetic */ int[] lIlllIllIlll;

    private static void lllIlIlllllIlI() {
        lIlllIllIllI = new String[lIlllIllIlll[5]];
        l.lIlllIllIllI[l.lIlllIllIlll[1]] = l."Using special attack";
    }

    private static boolean lllIlIllllllII(int n, int n2) {
        return n < n2;
    }

    private static void lllIlIlllllIll() {
        lIlllIllIlll = new int[7];
        l.lIlllIllIlll[0] = 169 + 128 - 226 + 131 ^ 42 + 153 - 108 + 87;
        l.lIlllIllIlll[1] = (0x54 ^ 0x49) & ~(0x42 ^ 0x5F);
        l.lIlllIllIlll[2] = 0xFFFFFE2E & 0x53F5;
        l.lIlllIllIlll[3] = (0xA6 ^ 0x9A) + (16 + 33 - -7 + 84) - (0x44 ^ 0xC) + (0x97 ^ 0xB7);
        l.lIlllIllIlll[4] = 93 + 22 - -8 + 46 ^ 46 + 113 - 124 + 103;
        l.lIlllIllIlll[5] = 1;
        l.lIlllIllIlll[6] = 2;
    }

    private static boolean lllIllIIIIIIII(Object object) {
        return object != null;
    }

    private static String lllIlIlllllIIl(String lllllllllllllllIlIlllIlIIIllllII, String lllllllllllllllIlIlllIlIIIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIIlIIIIII.init(lIlllIllIlll[6], lllllllllllllllIlIlllIlIIlIIIIIl);
            return new String(lllllllllllllllIlIlllIlIIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlIIIllllll) {
            lllllllllllllllIlIlllIlIIIllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllllllll(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIlIlllllllI(Object object) {
        return object == null;
    }

    static {
        l.lllIlIlllllIll();
        l.lllIlIlllllIlI();
    }

    public boolean run() {
        if (l.lllIlIllllllII(Combat.getSpecEnergy(), lIlllIllIlll[0])) {
            return lIlllIllIlll[1];
        }
        if (l.lllIlIllllllIl(Combat.isSpecEnabled() ? 1 : 0)) {
            Item lllllllllllllllIlIlllIlIIlIIIlll = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            if (l.lllIlIlllllllI(lllllllllllllllIlIlllIlIIlIIIlll)) {
                return lIlllIllIlll[1];
            }
            if (l.lllIlIllllllll(lllllllllllllllIlIlllIlIIlIIIlll.getId(), lIlllIllIlll[2])) {
                Widget lllllllllllllllIlIlllIlIIlIIIllI = Widgets.get((int)lIlllIllIlll[3], (int)lIlllIllIlll[4]);
                if (l.lllIllIIIIIIII(lllllllllllllllIlIlllIlIIlIIIllI)) {
                    System.out.println(lIlllIllIllI[lIlllIllIlll[1]]);
                    lllllllllllllllIlIlllIlIIlIIIllI.interact(lIlllIllIlll[1]);
                }
                0;
                if (3 <= ((0xF6 ^ 0xA7) & ~(0x1F ^ 0x4E))) {
                    return ((0x40 ^ 0x12) & ~(0x74 ^ 0x26)) != 0;
                }
            } else {
                return lIlllIllIlll[1];
            }
        }
        return lIlllIllIlll[5];
    }

    private static boolean lllIlIllllllIl(int n) {
        return n == 0;
    }
}

