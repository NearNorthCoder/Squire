/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Drinking prayer potion", priority=150)
public class DrinkingPrayerPotionTask
extends Task {

    private final  a al;
    private final  SquireCerberusConfig ak;

    private static boolean lIIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        j.lIIIlllllIl();
        j.lIIIlllllII();
    }

    private static boolean lIIIlllllll(Object object) {
        return object == null;
    }

    private static boolean lIIIllllllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        j llIIIIlIllIIIll;
        if (!j.lIIIllllllI(this.al.k()) || j.lIIIlllllll(this.al.k().y())) {
            return lIlIIIlll[0];
        }
        if (j.lIIlIIIIIII(Prayers.getPoints(), llIIIIlIllIIIll.ak.drinkAtPrayer()) && j.lIIlIIIIIIl(llIIIIlIllIIIll.al.h().isEmpty() ? 1 : 0)) {
            return lIlIIIlll[0];
        }
        if (j.lIIlIIIIIII(Prayers.getPoints(), llIIIIlIllIIIll.ak.drinkAtPrayerGhost())) {
            return lIlIIIlll[0];
        }
        Item llIIIIlIllIIIlI = Inventory.getFirst(item -> {
            boolean bl2;
            if (!j.lIIlIIIIIlI(item.getName().startsWith(lIlIIIllI[lIlIIIlll[1]]) ? 1 : 0) || j.lIIlIIIIIIl(item.getName().startsWith(lIlIIIllI[lIlIIIlll[2]]) ? 1 : 0)) {
                bl2 = lIlIIIlll[1];

                if ((0x31 ^ 0x35) < -1) {
                    return false;
                }
            } else {
                bl2 = lIlIIIlll[0];
            }
            return bl2;
        });
        if (j.lIIIlllllll(llIIIIlIllIIIlI)) {
            return lIlIIIlll[0];
        }
        var1_1.interact(lIlIIIllI[lIlIIIlll[0]]);
        return lIlIIIlll[1];
    }

    private static void lIIIlllllII() {
        lIlIIIllI = new String[lIlIIIlll[3]];
        j.lIlIIIllI[j.lIlIIIlll[0]] = "Drink";
        j.lIlIIIllI[j.lIlIIIlll[1]] = "Prayer";
        j.lIlIIIllI[j.lIlIIIlll[2]] = "Super rest";
    }

        return String.valueOf(llIIIIlIlIIIllI);
    }

    @Inject
    private DrinkingPrayerPotionTask(SquireCerberusConfig squireCerberusConfig, a a2) {
        this.ak = squireCerberusConfig;
        this.al = a2;
    }
}

