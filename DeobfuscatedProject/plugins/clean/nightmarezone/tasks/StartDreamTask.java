/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Start Dream", priority=100, blocking=true)
public class StartDreamTask
extends Task {
    
    private final  SquireNightmareZone ao;
    
    private final  SquireNightmareZoneConfig ap;
    private final  Client aq;

    @Inject
    public StartDreamTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ao = squireNightmareZone;
        this.ap = squireNightmareZoneConfig;
        this.aq = client;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIllllIlIllIll(int n2) {
        return n2 != 0;
    }

    static {
        o.lIIllllIlIllIlI();
        o.lIIllllIlIllIIl();
    }

    private static boolean lIIllllIlIlllII(Object object) {
        return object == null;
    }

    private static void lIIllllIlIllIIl() {
        lIIIlIIIlllIl = new String[lIIIlIIIllllI[7]];
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[0]] = "Yes";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[1]] = "Yes";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[2]] = "Choosing previous";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[3]] = "Previous";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[4]] = "Dominic Onion";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[5]] = "Dream";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[6]] = "Previous";
    }

    private static boolean lIIllllIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (o.lIIllllIlIllIll(this.aq.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIllllI[0];
        }
        int var2 = Static.getClient().getVarbitValue(b.u);
        if (o.lIIllllIlIllIll(var2)) {
            return lIIIlIIIllllI[0];
        }
        if (o.lIIllllIlIllIll(Dialog.canContinue() ? 1 : 0)) {
            return lIIIlIIIllllI[1];
        }
        if (o.lIIllllIlIllIll(Dialog.isViewingOptions() ? 1 : 0) && o.lIIllllIlIllIll(Dialog.hasOption((String)lIIIlIIIlllIl[lIIIlIIIllllI[0]]) ? 1 : 0)) {
            System.out.println("Option text:" + Dialog.getText());
            String[] stringArray = new String[lIIIlIIIllllI[1]];
            stringArray[o.lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[1]];
            Dialog.chooseOption((String[])stringArray);

            return lIIIlIIIllllI[1];
        }
        if (o.lIIllllIlIllIll(Dialog.isOpen() ? 1 : 0) && o.lIIllllIlIllIll(Dialog.hasOption(string -> string.startsWith(lIIIlIIIlllIl[lIIIlIIIllllI[6]])) ? 1 : 0)) {
            System.out.println(lIIIlIIIlllIl[lIIIlIIIllllI[2]]);
            String[] stringArray = new String[lIIIlIIIllllI[1]];
            stringArray[o.lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[3]];
            Dialog.chooseOption((String[])stringArray);

            return lIIIlIIIllllI[1];
        }
        String[] stringArray = new String[lIIIlIIIllllI[1]];
        stringArray[o.lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[4]];
        NPC var3 = NPCs.getNearest((String[])stringArray);
        if (o.lIIllllIlIlllII(var3)) {
            return lIIIlIIIllllI[0];
        }
        var2_2.interact(lIIIlIIIlllIl[lIIIlIIIllllI[5]]);
        return lIIIlIIIllllI[1];
    }
}

