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
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Drinking prayer", priority=10000)
public class DrinkingPrayerTask
extends Task {
    
    private final  SquireVardorvis aq;
    private final  e as;
    private final  SquireVardorvisConfig ar;

    static {
        y.lIllllIlIlllIIl();
        y.lIllllIlIlllIII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.lIllllIlIlllIlI(Prayers.getPoints(), this.ar.drinkPrayerAt())) {
            return lIlIlIIIlIllI[0];
        }
        Item var1 = Inventory.getFirst(item -> {
            int n2;
            if (!y.lIllllIlIllllII(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[1]]) ? 1 : 0) || y.lIllllIlIllllIl(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[2]]) ? 1 : 0)) {
                n2 = lIlIlIIIlIllI[1];

                if (3 <= -1) {
                    return (3 & (3 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIIIlIllI[0];
            }
            return n2 != 0;
        });
        if (y.lIllllIlIlllIll(var1)) {
            return lIlIlIIIlIllI[0];
        }
        var1_1.interact(lIlIlIIIlIlIl[lIlIlIIIlIllI[0]]);
        return lIlIlIIIlIllI[1];
    }

    private static boolean lIllllIlIlllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllllIlIlllIII() {
        lIlIlIIIlIlIl = new String[lIlIlIIIlIllI[3]];
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[0]] = "Drink";
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[1]] = "prayer potion";
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[2]] = "super restore";
    }

    private static boolean lIllllIlIlllIll(Object object) {
        return object == null;
    }

    private static boolean lIllllIlIllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIlIllllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public DrinkingPrayerTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.aq = squireVardorvis;
        this.ar = squireVardorvisConfig;
        this.as = squireVardorvis.j();
    }
}

