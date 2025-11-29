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
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

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
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.b;

@TaskDesc(name="Start Dream", priority=100, blocking=true)
public class o
extends Task {
    private static /* synthetic */ int[] lIIIlIIIllllI;
    private final /* synthetic */ SquireNightmareZone ao;
    private static /* synthetic */ String[] lIIIlIIIlllIl;
    private final /* synthetic */ SquireNightmareZoneConfig ap;
    private final /* synthetic */ Client aq;

    private static void lIIllllIlIllIlI() {
        lIIIlIIIllllI = new int[9];
        o.lIIIlIIIllllI[0] = (0xCA ^ 0x91 ^ (0x59 ^ 0x11)) & (0x93 ^ 0x81 ^ " ".length() ^ -" ".length());
        o.lIIIlIIIllllI[1] = " ".length();
        o.lIIIlIIIllllI[2] = "  ".length();
        o.lIIIlIIIllllI[3] = "   ".length();
        o.lIIIlIIIllllI[4] = 0x27 ^ 0x55 ^ (0x69 ^ 0x1F);
        o.lIIIlIIIllllI[5] = 0x20 ^ 0x25;
        o.lIIIlIIIllllI[6] = 0x52 ^ 3 ^ (0xC0 ^ 0x97);
        o.lIIIlIIIllllI[7] = 0xC5 ^ 0x81 ^ (0xF4 ^ 0xB7);
        o.lIIIlIIIllllI[8] = 0x45 ^ 0x4D;
    }

    @Inject
    public o(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ao = squireNightmareZone;
        this.ap = squireNightmareZoneConfig;
        this.aq = client;
    }

    private static String lIIllllIlIlIlll(String lllllllllllllllIIIlIIIIIlIIIlIIl, String lllllllllllllllIIIlIIIIIlIIIllIl) {
        lllllllllllllllIIIlIIIIIlIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlIIIIIlIIIllII = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIIlIIIlIll = lllllllllllllllIIIlIIIIIlIIIllIl.toCharArray();
        int lllllllllllllllIIIlIIIIIlIIIlIlI = lIIIlIIIllllI[0];
        char[] lllllllllllllllIIIlIIIIIlIIIIlII = lllllllllllllllIIIlIIIIIlIIIlIIl.toCharArray();
        int lllllllllllllllIIIlIIIIIlIIIIIll = lllllllllllllllIIIlIIIIIlIIIIlII.length;
        int lllllllllllllllIIIlIIIIIlIIIIIlI = lIIIlIIIllllI[0];
        while (o.lIIllllIlIlllIl(lllllllllllllllIIIlIIIIIlIIIIIlI, lllllllllllllllIIIlIIIIIlIIIIIll)) {
            char lllllllllllllllIIIlIIIIIlIIIllll = lllllllllllllllIIIlIIIIIlIIIIlII[lllllllllllllllIIIlIIIIIlIIIIIlI];
            lllllllllllllllIIIlIIIIIlIIIllII.append((char)(lllllllllllllllIIIlIIIIIlIIIllll ^ lllllllllllllllIIIlIIIIIlIIIlIll[lllllllllllllllIIIlIIIIIlIIIlIlI % lllllllllllllllIIIlIIIIIlIIIlIll.length]));
            "".length();
            ++lllllllllllllllIIIlIIIIIlIIIlIlI;
            ++lllllllllllllllIIIlIIIIIlIIIIIlI;
            "".length();
            if ("   ".length() >= "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlIIIIIlIIIllII);
    }

    private static boolean lIIllllIlIllIll(int n2) {
        return n2 != 0;
    }

    private static String lIIllllIlIllIII(String lllllllllllllllIIIlIIIIIIllIllII, String lllllllllllllllIIIlIIIIIIllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlIIIIIIllIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlIIIIIIllIlllI.init(lIIIlIIIllllI[2], lllllllllllllllIIIlIIIIIIllIllll);
            return new String(lllllllllllllllIIIlIIIIIIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIIIllIllIl) {
            lllllllllllllllIIIlIIIIIIllIllIl.printStackTrace();
            return null;
        }
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
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[0]] = o.lIIllllIlIlIllI("v0Jdfpx3/G8=", "pfUoS");
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[1]] = o.lIIllllIlIlIlll("NQ05", "lhJJF");
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[2]] = o.lIIllllIlIllIII("jkZLvIY/xhvuLJ1C/28qmaQSIQupLtkK", "YcqKl");
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[3]] = o.lIIllllIlIlIlll("JxsdASYYHAs=", "wixwO");
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[4]] = o.lIIllllIlIlIlll("LCQJOwQBKEQdBAEkCg==", "hKdRj");
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[5]] = o.lIIllllIlIlIllI("HyBgAT4cd6Q=", "tnGVk");
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[6]] = o.lIIllllIlIlIlll("JAgjPi8bDzU=", "tzFHF");
    }

    private static String lIIllllIlIlIllI(String lllllllllllllllIIIlIIIIIIlllIlll, String lllllllllllllllIIIlIIIIIIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIIlllIllI.getBytes(StandardCharsets.UTF_8)), lIIIlIIIllllI[8]), "DES");
            Cipher lllllllllllllllIIIlIIIIIIllllIll = Cipher.getInstance("DES");
            lllllllllllllllIIIlIIIIIIllllIll.init(lIIIlIIIllllI[2], lllllllllllllllIIIlIIIIIIlllllII);
            return new String(lllllllllllllllIIIlIIIIIIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIIIllllIlI) {
            lllllllllllllllIIIlIIIIIIllllIlI.printStackTrace();
            return null;
        }
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
        int lllllllllllllllIIIlIIIIIlIIllIlI = Static.getClient().getVarbitValue(b.u);
        if (o.lIIllllIlIllIll(lllllllllllllllIIIlIIIIIlIIllIlI)) {
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
            "".length();
            return lIIIlIIIllllI[1];
        }
        if (o.lIIllllIlIllIll(Dialog.isOpen() ? 1 : 0) && o.lIIllllIlIllIll(Dialog.hasOption(string -> string.startsWith(lIIIlIIIlllIl[lIIIlIIIllllI[6]])) ? 1 : 0)) {
            System.out.println(lIIIlIIIlllIl[lIIIlIIIllllI[2]]);
            String[] stringArray = new String[lIIIlIIIllllI[1]];
            stringArray[o.lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[3]];
            Dialog.chooseOption((String[])stringArray);
            "".length();
            return lIIIlIIIllllI[1];
        }
        String[] stringArray = new String[lIIIlIIIllllI[1]];
        stringArray[o.lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[4]];
        NPC lllllllllllllllIIIlIIIIIlIIllIIl = NPCs.getNearest((String[])stringArray);
        if (o.lIIllllIlIlllII(lllllllllllllllIIIlIIIIIlIIllIIl)) {
            return lIIIlIIIllllI[0];
        }
        var2_2.interact(lIIIlIIIlllIl[lIIIlIIIllllI[5]]);
        return lIIIlIIIllllI[1];
    }
}

