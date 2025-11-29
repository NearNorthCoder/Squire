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
package gg.squire.fishing.tasks;

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
public class UsingSpecialAttackTask
extends Task {

    private static void lllIlIlllllIlI() {
        lIlllIllIllI = new String[lIlllIllIlll[5]];
        l.lIlllIllIllI[l.lIlllIllIlll[1]] = "Using special attack";
    }

    private static boolean lllIlIllllllII(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIllIIIIIIII(Object object) {
        return object != null;
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
            Item var1 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            if (l.lllIlIlllllllI(var1)) {
                return lIlllIllIlll[1];
            }
            if (l.lllIlIllllllll(var1.getId(), lIlllIllIlll[2])) {
                Widget var2 = Widgets.get((int)lIlllIllIlll[3], (int)lIlllIllIlll[4]);
                if (l.lllIllIIIIIIII(var2)) {
                    System.out.println(lIlllIllIllI[lIlllIllIlll[1]]);
                    var2.interact(lIlllIllIlll[1]);
                }

                if (3 <= ((0xF6 ^ 0xA7) & ~(0x1F ^ 0x4E))) {
                    return false;
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

