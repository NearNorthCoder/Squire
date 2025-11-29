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
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.scurrius.tasks.BHelper;

@TaskDesc(name="Drinking prayer", priority=10000)
public class DrinkingPrayerTask
extends Task {
    private final  SquireScurriusConfig aa;
    private final  b ab;

    private final  SquireScurrius Z;

        return String.valueOf(var1);
    }

    private static boolean lIlIllIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlllIlIl(Object object) {
        return object == null;
    }

    @Inject
    public DrinkingPrayerTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.Z = squireScurrius;
        this.aa = squireScurriusConfig;
        this.ab = squireScurrius.n();
    }

    private static boolean lIlIllIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIlllIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (p.lIlIllIIlllIlII(Prayers.getPoints(), this.aa.drinkPrayerAt())) {
            return lIIlIllIIlIll[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!p.lIlIllIIlllIllI(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[1]]) ? 1 : 0) || p.lIlIllIIlllIlll(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[2]]) ? 1 : 0)) {
                n2 = lIIlIllIIlIll[1];

                if (1 < 0) {
                    return false;
                }
            } else {
                n2 = lIIlIllIIlIll[0];
            }
            return n2 != 0;
        });
        if (p.lIlIllIIlllIlIl(var2)) {
            return lIIlIllIIlIll[0];
        }
        var1_1.interact(lIIlIllIIlIlI[lIIlIllIIlIll[0]]);
        return lIIlIllIIlIll[1];
    }

    private static void lIlIllIIlllIIlI() {
        lIIlIllIIlIlI = new String[lIIlIllIIlIll[3]];
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[0]] = "Drink";
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[1]] = "prayer potion";
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[2]] = "super restore";
    }

    static {
        p.lIlIllIIlllIIll();
        p.lIlIllIIlllIIlI();
    }

    private static boolean lIlIllIIlllIllI(int n2) {
        return n2 == 0;
    }
}

