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
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.b_Unknown;

/* TASK: Start Dream -> StartdreamTask */
@TaskDesc(name="Start Dream", priority=100, blocking=true)
public class StartDreamTask
extends Task {
    private static /* synthetic */ int[] lIIIlIIIllllI;
    private final /* synthetic */ SquireNightmareZone ao;
    private static /* synthetic */ String[] lIIIlIIIlllIl;
    private final /* synthetic */ SquireNightmareZoneConfig ap;
    private final /* synthetic */ Client aq;

    private static void lIIllllIlIllIlI() {
        lIIIlIIIllllI = new int[9];
        o.lIIIlIIIllllI[0] = (0xCA ^ 0x91 ^ (0x59 ^ 0x11)) & (0x93 ^ 0x81 ^ 1 ^ -1);
        o.lIIIlIIIllllI[1] = 1;
        o.lIIIlIIIllllI[2] = 2;
        o.lIIIlIIIllllI[3] = 3;
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

    private static String lIIllllIlIlIlll(String var18, String var14) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var2 = var14.toCharArray();
        int var11 = lIIIlIIIllllI[0];
        char[] var13 = var18.toCharArray();
        int var6 = var13.length;
        int var5 = lIIIlIIIllllI[0];
        while (o.lIIllllIlIlllIl(var5, var6)) {
            char var1 = var13[var5];
            var3.append((char)(var1 ^ var2[var11 % var2.length]));
            0;
            ++var11;
            ++var5;
            0;
            if (3 >= 3) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIIllllIlIllIll(int n2) {
        return n2 != 0;
    }

    private static String lIIllllIlIllIII(String var8, String var9) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIIlIIIllllI[2], var21);
            return new String(var4.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[0]] = o."Yes";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[1]] = o."Yes";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[2]] = o."Choosing previous";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[3]] = o."Previous";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[4]] = o."Dominic Onion";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[5]] = o."Dream";
        o.lIIIlIIIlllIl[o.lIIIlIIIllllI[6]] = o."Previous";
    }

    private static String lIIllllIlIlIllI(String var15, String var20) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIIIlIIIllllI[8]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIIlIIIllllI[2], var19);
            return new String(var7.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
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
        int var10 = Static.getClient().getVarbitValue(b.u);
        if (o.lIIllllIlIllIll(var10)) {
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
            0;
            return lIIIlIIIllllI[1];
        }
        if (o.lIIllllIlIllIll(Dialog.isOpen() ? 1 : 0) && o.lIIllllIlIllIll(Dialog.hasOption(string -> string.startsWith(lIIIlIIIlllIl[lIIIlIIIllllI[6]])) ? 1 : 0)) {
            System.out.println(lIIIlIIIlllIl[lIIIlIIIllllI[2]]);
            String[] stringArray = new String[lIIIlIIIllllI[1]];
            stringArray[o.lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[3]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIIIlIIIllllI[1];
        }
        String[] stringArray = new String[lIIIlIIIllllI[1]];
        stringArray[o.lIIIlIIIllllI[0]] = lIIIlIIIlllIl[lIIIlIIIllllI[4]];
        NPC var16 = NPCs.getNearest((String[])stringArray);
        if (o.lIIllllIlIlllII(var16)) {
            return lIIIlIIIllllI[0];
        }
        var2_2.interact(lIIIlIIIlllIl[lIIIlIIIllllI[5]]);
        return lIIIlIIIllllI[1];
    }
}

