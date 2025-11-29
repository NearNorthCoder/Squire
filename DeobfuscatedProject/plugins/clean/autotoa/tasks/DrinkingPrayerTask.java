/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Drinking prayer", priority=85)
public class DrinkingPrayerTask
extends AutotoaTaskBase {
    private final  C cK;

    private static boolean lIIlllIIIIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected DrinkingPrayerTask(Client client, C c2) {
        super(client);
        this.cK = c2;
    }

    private static boolean lIIlllIIIIlIII(int n2) {
        return n2 == 0;
    }

    static {
        ag.lIIlllIIIIIIll();
        ag.lIIlllIIIIIIlI();
    }

    public boolean run() {
        ag var1;
        int var2;
        int n2;
        if (ag.lIIlllIIIIIlII(this.aq() ? 1 : 0)) {
            n2 = llIIIIIIIII[0];

        } else {
            n2 = var2 = llIIIIIIIII[1];
        }
        if (ag.lIIlllIIIIIlIl(Prayers.getPoints(), var2)) {
            return llIIIIIIIII[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (!ag.lIIlllIIIIlIII(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !ag.lIIlllIIIIlIII(item.getName().contains(lIllllllllI[llIIIIIIIII[2]]) ? 1 : 0) || !ag.lIIlllIIIIlIII(item.getName().contains(lIllllllllI[llIIIIIIIII[3]]) ? 1 : 0) || ag.lIIlllIIIIIlII(item.getName().contains(lIllllllllI[llIIIIIIIII[4]]) ? 1 : 0)) {
                n2 = llIIIIIIIII[2];

                }
            } else {
                n2 = llIIIIIIIII[1];
            }
            return n2 != 0;
        });
        if (ag.lIIlllIIIIIlll(var3) && ag.lIIlllIIIIIlII(var1.cK.am() ? 1 : 0)) {
            var3.interact(lIllllllllI[llIIIIIIIII[1]]);
            var1.cK.ao();
            return llIIIIIIIII[2];
        }
        return llIIIIIIIII[1];
    }

    private static boolean lIIlllIIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlllIIIIIIlI() {
        lIllllllllI = new String[llIIIIIIIII[5]];
        ag.lIllllllllI[ag.llIIIIIIIII[1]] = "Drink";
        ag.lIllllllllI[ag.llIIIIIIIII[2]] = "restore";
        ag.lIllllllllI[ag.llIIIIIIIII[3]] = "Prayer";
        ag.lIllllllllI[ag.llIIIIIIIII[4]] = "Sanfew";
    }

    private static boolean lIIlllIIIIIlll(Object object) {
        return object != null;
    }

}

