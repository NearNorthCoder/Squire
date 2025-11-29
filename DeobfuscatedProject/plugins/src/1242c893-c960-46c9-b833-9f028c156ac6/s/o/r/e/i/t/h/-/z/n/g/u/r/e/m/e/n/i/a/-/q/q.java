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

    private static String lIIlllllIIllIll(String lllllllllllllllIIIIllllIlllIllIl, String lllllllllllllllIIIIllllIlllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIlllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIllllIlllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIllllIlllIllll.init(lIIIlIIllIIll[2], lllllllllllllllIIIIllllIllllIIII);
            return new String(lllllllllllllllIIIIllllIlllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIllllIlllIlllI) {
            lllllllllllllllIIIIllllIlllIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllIIllllI() {
        lIIIlIIllIIlI = new String[lIIIlIIllIIll[3]];
        q.lIIIlIIllIIlI[q.lIIIlIIllIIll[0]] = q.lIIlllllIIllIll("aZVwr0VntQv8Oi3FOnaObv7F5IhjQtAOFTzYFPz7mp8=", "iPwvc");
        q.lIIIlIIllIIlI[q.lIIIlIIllIIll[1]] = q.lIIlllllIIlllII("Pu0VhjSA+TD9avbht5vtN4lGm98cdrNn", "JOuyb");
        q.lIIIlIIllIIlI[q.lIIIlIIllIIll[2]] = q.lIIlllllIIlllIl("FgoqNw==", "BkARv");
    }

    private static void lIIlllllIIlllll() {
        lIIIlIIllIIll = new int[5];
        q.lIIIlIIllIIll[0] = (0x91 ^ 0x9B ^ (0xEA ^ 0xA2)) & (129 + 58 - 74 + 97 ^ 89 + 96 - 75 + 34 ^ -" ".length());
        q.lIIIlIIllIIll[1] = " ".length();
        q.lIIIlIIllIIll[2] = "  ".length();
        q.lIIIlIIllIIll[3] = "   ".length();
        q.lIIIlIIllIIll[4] = 0x58 ^ 0xB ^ (0x69 ^ 0x32);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q lllllllllllllllIIIIlllllIIIIllll;
        if (q.lIIlllllIlIIIII(this.aw.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIllIIll[0];
        }
        int lllllllllllllllIIIIlllllIIIIlllI = lllllllllllllllIIIIlllllIIIIllll.au.b();
        if (q.lIIlllllIlIIIIl(lllllllllllllllIIIIlllllIIIIlllI, lllllllllllllllIIIIlllllIIIIllll.av.absorption())) {
            return lIIIlIIllIIll[0];
        }
        if (q.lIIlllllIlIIIII(Dialog.isEnterInputOpen() ? 1 : 0) && q.lIIlllllIlIIIII(Dialog.getText().contains(lIIIlIIllIIlI[lIIIlIIllIIll[0]]) ? 1 : 0)) {
            Dialog.enterAmount((int)(lllllllllllllllIIIIlllllIIIIllll.av.absorption() - lllllllllllllllIIIIlllllIIIIlllI));
            return lIIIlIIllIIll[1];
        }
        String[] stringArray = new String[lIIIlIIllIIll[1]];
        stringArray[q.lIIIlIIllIIll[0]] = lIIIlIIllIIlI[lIIIlIIllIIll[1]];
        TileObject lllllllllllllllIIIIlllllIIIIllIl = TileObjects.getNearest((String[])stringArray);
        if (q.lIIlllllIlIIIlI(lllllllllllllllIIIIlllllIIIIllIl)) {
            return lIIIlIIllIIll[0];
        }
        var2_2.interact(lIIIlIIllIIlI[lIIIlIIllIIll[2]]);
        return lIIIlIIllIIll[1];
    }

    private static String lIIlllllIIlllIl(String lllllllllllllllIIIIlllllIIIIIIlI, String lllllllllllllllIIIIlllllIIIIIIIl) {
        lllllllllllllllIIIIlllllIIIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllllIIIIIIII = new StringBuilder();
        char[] lllllllllllllllIIIIllllIllllllll = lllllllllllllllIIIIlllllIIIIIIIl.toCharArray();
        int lllllllllllllllIIIIllllIlllllllI = lIIIlIIllIIll[0];
        char[] lllllllllllllllIIIIllllIlllllIII = lllllllllllllllIIIIlllllIIIIIIlI.toCharArray();
        int lllllllllllllllIIIIllllIllllIlll = lllllllllllllllIIIIllllIlllllIII.length;
        int lllllllllllllllIIIIllllIllllIllI = lIIIlIIllIIll[0];
        while (q.lIIlllllIlIIIll(lllllllllllllllIIIIllllIllllIllI, lllllllllllllllIIIIllllIllllIlll)) {
            char lllllllllllllllIIIIlllllIIIIIIll = lllllllllllllllIIIIllllIlllllIII[lllllllllllllllIIIIllllIllllIllI];
            lllllllllllllllIIIIlllllIIIIIIII.append((char)(lllllllllllllllIIIIlllllIIIIIIll ^ lllllllllllllllIIIIllllIllllllll[lllllllllllllllIIIIllllIlllllllI % lllllllllllllllIIIIllllIllllllll.length]));
            "".length();
            ++lllllllllllllllIIIIllllIlllllllI;
            ++lllllllllllllllIIIIllllIllllIllI;
            "".length();
            if (((0x57 ^ 0x61 ^ (0xA8 ^ 0x89)) & (0x7D ^ 0x28 ^ (0x35 ^ 0x77) ^ -" ".length())) != -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlllllIIIIIIII);
    }

    private static boolean lIIlllllIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        q.lIIlllllIIlllll();
        q.lIIlllllIIllllI();
    }

    private static String lIIlllllIIlllII(String lllllllllllllllIIIIllllIllIllllI, String lllllllllllllllIIIIllllIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIllIlllll.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIIll[4]), "DES");
            Cipher lllllllllllllllIIIIllllIlllIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIIIllllIlllIIIlI.init(lIIIlIIllIIll[2], lllllllllllllllIIIIllllIlllIIIll);
            return new String(lllllllllllllllIIIIllllIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIllllIlllIIIIl) {
            lllllllllllllllIIIIllllIlllIIIIl.printStackTrace();
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

