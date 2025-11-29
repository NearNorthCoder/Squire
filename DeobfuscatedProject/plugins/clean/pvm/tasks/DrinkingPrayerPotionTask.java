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
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
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
import net.unethicalite.api.widgets.Prayers;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Drinking Prayer Potion")
public class DrinkingPrayerPotionTask
extends Task {

    private final  c Y;

    private static void lIlIlllIllllIll() {
        lIIllIIIlIIIl = new String[lIIllIIIlIIll[3]];
        n.lIIllIIIlIIIl[n.lIIllIIIlIIll[0]] = "Drink";
        n.lIIllIIIlIIIl[n.lIIllIIIlIIll[2]] = "Prayer potion";
    }

    private static boolean lIlIlllIllllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllllIIIIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (n.lIlIlllIllllllI(this.Y.s() ? 1 : 0)) {
            return lIIllIIIlIIll[0];
        }
        if (n.lIlIlllIlllllll(Prayers.getPoints(), lIIllIIIlIIll[1])) {
            return lIIllIIIlIIll[0];
        }
        Item var1 = Inventory.getFirst(item -> item.getName().startsWith(lIIllIIIlIIIl[lIIllIIIlIIll[2]]));
        if (n.lIlIllllIIIIIII(var1)) {
            return lIIllIIIlIIll[0];
        }
        var1_1.interact(lIIllIIIlIIIl[lIIllIIIlIIll[0]]);
        return lIIllIIIlIIll[2];
    }

    private static boolean lIlIlllIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public DrinkingPrayerPotionTask(c c2) {
        this.Y = c2;
    }

    static {
        n.lIlIlllIlllllIl();
        n.lIlIlllIllllIll();
    }

    private static boolean lIlIllllIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }
}

