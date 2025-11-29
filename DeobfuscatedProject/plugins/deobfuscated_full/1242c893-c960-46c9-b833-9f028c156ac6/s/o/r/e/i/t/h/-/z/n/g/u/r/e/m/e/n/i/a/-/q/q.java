/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Get Absorption -> GetabsorptionTask */
@TaskDesc(name="Get Absorption", priority=6, blocking=true)
public class q
extends Task {
    private static /* synthetic */ int[] lIIIlIIllIIll;
    private final /* synthetic */ Client aw;
    private final /* synthetic */ SquireNightmareZone au;
    private static /* synthetic */ String[] lIIIlIIllIIlI;
    private final /* synthetic */ SquireNightmareZoneConfig av;

    private static boolean lIIlllllIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIlIIIlI(Object object) {
        return object == null;
    }

    private static String lIIlllllIIllIll(String var16, String var18) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIIlIIllIIll[2], var14);
            return new String(var4.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllIIllllI() {
        lIIIlIIllIIlI = new String[lIIIlIIllIIll[3]];
        q.lIIIlIIllIIlI[q.lIIIlIIllIIll[0]] = q."many doses of absorption";
        q.lIIIlIIllIIlI[q.lIIIlIIllIIll[1]] = q."Absorption potion";
        q.lIIIlIIllIIlI[q.lIIIlIIllIIll[2]] = q."Take";
    }

    private static void lIIlllllIIlllll() {
        lIIIlIIllIIll = new int[5];
        q.lIIIlIIllIIll[0] = (0x91 ^ 0x9B ^ (0xEA ^ 0xA2)) & (129 + 58 - 74 + 97 ^ 89 + 96 - 75 + 34 ^ -1);
        q.lIIIlIIllIIll[1] = 1;
        q.lIIIlIIllIIll[2] = 2;
        q.lIIIlIIllIIll[3] = 3;
        q.lIIIlIIllIIll[4] = 0x58 ^ 0xB ^ (0x69 ^ 0x32);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q var5;
        if (q.lIIlllllIlIIIII(this.aw.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIllIIll[0];
        }
        int var10 = var5.au.b();
        if (q.lIIlllllIlIIIIl(var10, var5.av.absorption())) {
            return lIIIlIIllIIll[0];
        }
        if (q.lIIlllllIlIIIII(Dialog.isEnterInputOpen() ? 1 : 0) && q.lIIlllllIlIIIII(Dialog.getText().contains(lIIIlIIllIIlI[lIIIlIIllIIll[0]]) ? 1 : 0)) {
            Dialog.enterAmount((int)(var5.av.absorption() - var10));
            return lIIIlIIllIIll[1];
        }
        String[] stringArray = new String[lIIIlIIllIIll[1]];
        stringArray[q.lIIIlIIllIIll[0]] = lIIIlIIllIIlI[lIIIlIIllIIll[1]];
        TileObject var20 = TileObjects.getNearest((String[])stringArray);
        if (q.lIIlllllIlIIIlI(var20)) {
            return lIIIlIIllIIll[0];
        }
        var2_2.interact(lIIIlIIllIIlI[lIIIlIIllIIll[2]]);
        return lIIIlIIllIIll[1];
    }

    private static String lIIlllllIIlllIl(String var12, String var1) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var22 = var1.toCharArray();
        int var13 = lIIIlIIllIIll[0];
        char[] var2 = var12.toCharArray();
        int var8 = var2.length;
        int var15 = lIIIlIIllIIll[0];
        while (q.lIIlllllIlIIIll(var15, var8)) {
            char var3 = var2[var15];
            var19.append((char)(var3 ^ var22[var13 % var22.length]));
            0;
            ++var13;
            ++var15;
            0;
            if (((0x57 ^ 0x61 ^ (0xA8 ^ 0x89)) & (0x7D ^ 0x28 ^ (0x35 ^ 0x77) ^ -1)) != -1) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean lIIlllllIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        q.lIIlllllIIlllll();
        q.lIIlllllIIllllI();
    }

    private static String lIIlllllIIlllII(String var9, String var17) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIIll[4]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIIlIIllIIll[2], var7);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public q(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.au = squireNightmareZone;
        this.av = squireNightmareZoneConfig;
        this.aw = client;
    }
}

