/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Cleansing parasite", priority=0x7FFFFFFF, blocking=true, register=true)
public class CleansingParasiteTask
extends Task {
    private final  h eh;
    private final  SquireNightmarePlugin eg;
    
    private static final  Logger ef;
    private final  SquireNightmareConfig ei;

    static {
        ao.lIIIllllIlIlllI();
        ao.lIIIllllIlIllIl();
        ef = LoggerFactory.getLogger(CleansingParasiteTask.class);
    }

    private static boolean lIIIllllIlIllll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static void lIIIllllIlIllIl() {
        llllIIIlllll = new String[llllIIlIIIII[6]];
        ao.llllIIIlllll[ao.llllIIlIIIII[0]] = "Infected and out of cures. Also No sanfew found in inventory or on the ground, teleporting out";
        ao.llllIIIlllll[ao.llllIIlIIIII[2]] = "Drink";
        ao.llllIIIlllll[ao.llllIIlIIIII[3]] = "Cleansing parasite";
        ao.llllIIIlllll[ao.llllIIlIIIII[4]] = "sanfew";
        ao.llllIIIlllll[ao.llllIIlIIIII[5]] = "balm";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ao var2;
        if (ao.lIIIllllIlIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIlIIIII[0];
        }
        if (ao.lIIIllllIllIIII(var2.eg.aq() ? 1 : 0)) {
            return llllIIlIIIII[0];
        }
        if (ao.lIIIllllIlIllll(Static.getClient().getVarbitValue(llllIIlIIIII[1]))) {
            return llllIIlIIIII[0];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[5]]));
        if (ao.lIIIllllIllIIIl(var3)) {
            var3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[4]]));
        }
        if (ao.lIIIllllIllIIIl(var3)) {
            Log.info((String)llllIIIlllll[llllIIlIIIII[0]]);
            return var2.eg.m();
        }
        var1_1.interact(llllIIIlllll[llllIIlIIIII[2]]);
        ef.info(llllIIIlllll[llllIIlIIIII[3]]);
        this.sleep(llllIIlIIIII[4]);
        this.eg.p(llllIIlIIIII[0]);
        return llllIIlIIIII[2];
    }

    private static boolean lIIIllllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIllllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public CleansingParasiteTask(SquireNightmarePlugin squireNightmarePlugin, h h2, SquireNightmareConfig squireNightmareConfig) {
        this.eg = squireNightmarePlugin;
        this.eh = h2;
        this.ei = squireNightmareConfig;
    }

    private static boolean lIIIllllIllIIII(int n2) {
        return n2 != 0;
    }
}

