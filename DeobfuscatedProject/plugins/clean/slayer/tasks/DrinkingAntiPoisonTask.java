/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Anti Poison")
public class DrinkingAntiPoisonTask
extends Task {

        return String.valueOf(var1);
    }

    private static void lIlllIlIIlIIlIl() {
        lIlIIlIIIlllI = new String[lIlIIlIIIllll[4]];
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[0]] = "Drink";
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[1]] = "anti";
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[2]] = "anti";
        f.lIlIIlIIIlllI[f.lIlIIlIIIllll[3]] = "Drink";
    }

    private static boolean lIlllIlIIlIIlll(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (f.lIlllIlIIlIIlll(Combat.isPoisoned() ? 1 : 0)) {
            return lIlIIlIIIllll[0];
        }
        if (f.lIlllIlIIlIIlll(Inventory.contains(item -> {
            int n2;
            if (f.lIlllIlIIlIlIII(item.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIllll[1]];
                stringArray[f.lIlIIlIIIllll[0]] = lIlIIlIIIlllI[lIlIIlIIIllll[3]];
                if (f.lIlllIlIIlIlIII(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIllll[1];

                    if (-1 <= (0x99 ^ 0x9D)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIIIllll[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIlIIlIIIllll[0];
        }
        Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[1]])).interact(lIlIIlIIIlllI[lIlIIlIIIllll[0]]);
        return lIlIIlIIIllll[1];
    }

    private static boolean lIlllIlIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIlIIlIlIII(int n2) {
        return n2 != 0;
    }

    static {
        f.lIlllIlIIlIIllI();
        f.lIlllIlIIlIIlIl();
    }
}

