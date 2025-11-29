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
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Restoring Prayer", priority=2)
public class RestoringPrayerTask
extends Task {
    private static final  Logger en;
    
    private final  SquireNightmareConfig eo;
    private final  SquireNightmarePlugin ep;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ar var1;
        if (ar.lIIIllllllIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIllIIII[0];
        }
        if (ar.lIIIllllllIlllI(var1.ep.aq() ? 1 : 0)) {
            return llllIIllIIII[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!ar.lIIIllllllIllIl(string.contains(llllIIlIlllI[llllIIllIIII[2]]) ? 1 : 0) || !ar.lIIIllllllIllIl(string.contains(llllIIlIlllI[llllIIllIIII[3]]) ? 1 : 0) || ar.lIIIllllllIlllI(string.contains(llllIIlIlllI[llllIIllIIII[1]]) ? 1 : 0)) {
                n2 = llllIIllIIII[2];

                if (2 == 0) {
                    return ((0x42 ^ 0x46 ^ (4 ^ 0xF)) & (0xFD ^ 0xBA ^ (0x76 ^ 0x3E) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIllIIII[0];
            }
            return n2 != 0;
        });
        if (ar.lIIIllllllIllll(Prayers.getPoints(), var1.eo.restorePrayerAt())) {
            return llllIIllIIII[0];
        }
        if (ar.lIIIlllllllIIII(var2)) {
            return llllIIllIIII[0];
        }
        var1_1.interact(llllIIlIlllI[llllIIllIIII[0]]);
        this.sleep(llllIIllIIII[1]);
        return llllIIllIIII[2];
    }

    static {
        ar.lIIIllllllIlIll();
        ar.lIIIllllllIlIlI();
        en = LoggerFactory.getLogger(RestoringPrayerTask.class);
    }

    private static void lIIIllllllIlIlI() {
        llllIIlIlllI = new String[llllIIllIIII[4]];
        ar.llllIIlIlllI[ar.llllIIllIIII[0]] = "Drink";
        ar.llllIIlIlllI[ar.llllIIllIIII[2]] = "prayer";
        ar.llllIIlIlllI[ar.llllIIllIIII[3]] = "restore";
        ar.llllIIlIlllI[ar.llllIIllIIII[1]] = "sanfew";
    }

    @Inject
    protected RestoringPrayerTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.eo = squireNightmareConfig;
        this.ep = squireNightmarePlugin;
    }

    private static boolean lIIIllllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIllllllIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllllIIII(Object object) {
        return object == null;
    }
}

