/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking Stamina Potion")
public class DrinkingStaminaPotionTask
extends Task {

    private static boolean llIIIIIllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIllIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIllIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIIIIllIIlllI() {
        lIlIllIllIllI = new String[lIlIllIllIlll[5]];
        g.lIlIllIllIllI[g.lIlIllIllIlll[1]] = "Drink";
        g.lIlIllIllIllI[g.lIlIllIllIlll[3]] = "Drink";
        g.lIlIllIllIllI[g.lIlIllIllIlll[4]] = "energy";
        g.lIlIllIllIllI[g.lIlIllIllIlll[2]] = "Stamina";
    }

    private static boolean llIIIIIllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIllIlIIll(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    static {
        g.llIIIIIllIlIIII();
        g.llIIIIIllIIlllI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!g.llIIIIIllIlIIIl(Movement.isStaminaBoosted() ? 1 : 0) || g.llIIIIIllIlIIlI(Movement.getRunEnergy(), lIlIllIllIlll[0])) {
            return lIlIllIllIlll[1];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().startsWith(lIlIllIllIllI[lIlIllIllIlll[2]]));
        if (g.llIIIIIllIlIIll(var2) && g.llIIIIIllIlIIll(var2 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[lIlIllIllIlll[3]];
            stringArray[g.lIlIllIllIlll[1]] = lIlIllIllIllI[lIlIllIllIlll[3]];
            if (g.llIIIIIllIlIlII(item.hasAction(stringArray) ? 1 : 0) && g.llIIIIIllIlIlII(item.getName().contains(lIlIllIllIllI[lIlIllIllIlll[4]]) ? 1 : 0)) {
                n2 = lIlIllIllIlll[3];

                if (((158 + 151 - 153 + 33 ^ 120 + 104 - 156 + 63) & (117 + 9 - 102 + 115 ^ 17 + 162 - 6 + 8 ^ -1)) < 0) {
                    return ((0x5F ^ 0x50 ^ (0xCC ^ 0x9B)) & (136 + 76 - 92 + 89 ^ 83 + 12 - 59 + 101 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIllIllIlll[1];
            }
            return n2 != 0;
        }))) {
            return lIlIllIllIlll[1];
        }
        var1_1.interact(lIlIllIllIllI[lIlIllIllIlll[1]]);
        this.sleep(lIlIllIllIlll[2]);
        return lIlIllIllIlll[3];
    }
}

