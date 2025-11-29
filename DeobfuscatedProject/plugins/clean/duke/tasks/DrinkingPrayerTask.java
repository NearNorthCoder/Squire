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
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Drinking prayer", priority=10000)
public class DrinkingPrayerTask
extends Task {
    private final  SquireDukeSucellus aM;
    private final  a aO;

    private final  SquireDukeSucellusConfig aN;

    private static boolean lllIIllllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIllllIllII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lllIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIllllIlIlI(Object object) {
        return object == null;
    }

    private static void lllIIllllIIlll() {
        lIllIlIlIIII = new String[lIllIlIlIIIl[3]];
        v.lIllIlIlIIII[v.lIllIlIlIIIl[0]] = "Drink";
        v.lIllIlIlIIII[v.lIllIlIlIIIl[1]] = "prayer potion";
        v.lIllIlIlIIII[v.lIllIlIlIIIl[2]] = "super restore";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (v.lllIIllllIlIIl(Prayers.getPoints(), this.aN.drinkPrayerAt())) {
            return lIllIlIlIIIl[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!v.lllIIllllIlIll(item.getName().toLowerCase().contains(lIllIlIlIIII[lIllIlIlIIIl[1]]) ? 1 : 0) || v.lllIIllllIllII(item.getName().toLowerCase().contains(lIllIlIlIIII[lIllIlIlIIIl[2]]) ? 1 : 0)) {
                n2 = lIllIlIlIIIl[1];

                if ((4 ^ 0) == 0) {
                    return false;
                }
            } else {
                n2 = lIllIlIlIIIl[0];
            }
            return n2 != 0;
        });
        if (v.lllIIllllIlIlI(var2)) {
            return lIllIlIlIIIl[0];
        }
        var1_1.interact(lIllIlIlIIII[lIllIlIlIIIl[0]]);
        return lIllIlIlIIIl[1];
    }

    static {
        v.lllIIllllIlIII();
        v.lllIIllllIIlll();
    }

    @Inject
    public DrinkingPrayerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aM = squireDukeSucellus;
        this.aN = squireDukeSucellusConfig;
        this.aO = squireDukeSucellus.s();
    }
}

