/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.whisperer.tasks;

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
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Restoring prayer", priority=50)
public class RestoringPrayerTask
extends WhispererTaskBase {

    static {
        z.llIIIIlIlIIllIl();
        z.llIIIIlIlIIlIlI();
    }

    private static boolean llIIIIlIlIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        if (z.llIIIIlIlIIlllI(Prayers.getPoints(), this.i.drinkPrayerAt())) {
            return lIlIlllIlllII[0];
        }
        Item var1 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[lIlIlllIlllII[2]];
            stringArray[z.lIlIlllIlllII[0]] = lIlIlllIllIll[lIlIlllIlllII[2]];
            if (z.llIIIIlIlIlIIII(item.hasAction(stringArray) ? 1 : 0) && (!z.llIIIIlIlIlIIIl(item.getName().toLowerCase().contains(lIlIlllIllIll[lIlIlllIlllII[3]]) ? 1 : 0) || z.llIIIIlIlIlIIII(item.getName().toLowerCase().contains(lIlIlllIllIll[lIlIlllIlllII[4]]) ? 1 : 0))) {
                n2 = lIlIlllIlllII[2];

                if (3 != 3) {
                    return ((0x76 ^ 0x43 ^ (0x32 ^ 0x11)) & (0xB7 ^ 0x8C ^ (0xB6 ^ 0x9B) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllIlllII[0];
            }
            return n2 != 0;
        });
        if (z.llIIIIlIlIIllll(var1)) {
            return lIlIlllIlllII[0];
        }
        var1_1.interact(lIlIlllIllIll[lIlIlllIlllII[0]]);
        this.sleep(lIlIlllIlllII[1]);
        return lIlIlllIlllII[2];
    }

    private static boolean llIIIIlIlIlIIII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var2);
    }

    private static void llIIIIlIlIIlIlI() {
        lIlIlllIllIll = new String[lIlIlllIlllII[1]];
        z.lIlIlllIllIll[z.lIlIlllIlllII[0]] = "Drink";
        z.lIlIlllIllIll[z.lIlIlllIlllII[2]] = "Drink";
        z.lIlIlllIllIll[z.lIlIlllIlllII[3]] = "prayer";
        z.lIlIlllIllIll[z.lIlIlllIlllII[4]] = "restore";
    }

    private static boolean llIIIIlIlIIllll(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlIlIIlllI(int n2, int n3) {
        return n2 > n3;
    }

}

