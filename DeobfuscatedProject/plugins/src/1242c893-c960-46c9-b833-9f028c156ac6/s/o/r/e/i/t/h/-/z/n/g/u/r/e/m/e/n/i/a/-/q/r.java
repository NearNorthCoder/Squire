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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Get Absorption", priority=6, blocking=true)
public class r
extends Task {
    private static /* synthetic */ int[] lIIIlIIlIllIl;
    private final /* synthetic */ SquireNightmareZone ax;
    private final /* synthetic */ Client az;
    private static /* synthetic */ String[] lIIIlIIlIllII;
    private final /* synthetic */ SquireNightmareZoneConfig ay;

    private static boolean lIIlllllIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIIIllIl(Object object) {
        return object == null;
    }

    private static void lIIlllllIIIlIlI() {
        lIIIlIIlIllIl = new int[4];
        r.lIIIlIIlIllIl[0] = (0xAE ^ 0xC7 ^ (0x52 ^ 8)) & (142 + 96 - 88 + 20 ^ 24 + 6 - -73 + 50 ^ -" ".length());
        r.lIIIlIIlIllIl[1] = " ".length();
        r.lIIIlIIlIllIl[2] = "  ".length();
        r.lIIIlIIlIllIl[3] = "   ".length();
    }

    private static String lIIlllllIIIIlll(String lllllllllllllllIIIIlllllIllllIII, String lllllllllllllllIIIIlllllIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllllIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllllIllllIlI.init(lIIIlIIlIllIl[2], lllllllllllllllIIIIlllllIllllIll);
            return new String(lllllllllllllllIIIIlllllIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllllIllllIIl) {
            lllllllllllllllIIIIlllllIllllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r lllllllllllllllIIIIllllllIIllIlI;
        if (r.lIIlllllIIIlIll(this.az.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIllIl[0];
        }
        int lllllllllllllllIIIIllllllIIllIIl = lllllllllllllllIIIIllllllIIllIlI.ax.a();
        if (r.lIIlllllIIIllII(lllllllllllllllIIIIllllllIIllIIl, lllllllllllllllIIIIllllllIIllIlI.ay.overload())) {
            return lIIIlIIlIllIl[0];
        }
        if (r.lIIlllllIIIlIll(Dialog.isEnterInputOpen() ? 1 : 0) && r.lIIlllllIIIlIll(Dialog.getText().contains(lIIIlIIlIllII[lIIIlIIlIllIl[0]]) ? 1 : 0)) {
            Dialog.enterAmount((int)(lllllllllllllllIIIIllllllIIllIlI.ay.overload() - lllllllllllllllIIIIllllllIIllIIl));
            return lIIIlIIlIllIl[1];
        }
        String[] stringArray = new String[lIIIlIIlIllIl[1]];
        stringArray[r.lIIIlIIlIllIl[0]] = lIIIlIIlIllII[lIIIlIIlIllIl[1]];
        TileObject lllllllllllllllIIIIllllllIIllIII = TileObjects.getNearest((String[])stringArray);
        if (r.lIIlllllIIIllIl(lllllllllllllllIIIIllllllIIllIII)) {
            return lIIIlIIlIllIl[0];
        }
        var2_2.interact(lIIIlIIlIllII[lIIIlIIlIllIl[2]]);
        return lIIIlIIlIllIl[1];
    }

    private static void lIIlllllIIIlIIl() {
        lIIIlIIlIllII = new String[lIIIlIIlIllIl[3]];
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[0]] = r.lIIlllllIIIIlll("WgeKNJkHwVWoeXp1NYRL9MN+ZtTf5sVU", "YXmge");
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[1]] = r.lIIlllllIIIIlll("+dyW1xQ1Yf4OnCyI8R5ybA==", "yWWPN");
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[2]] = r.lIIlllllIIIlIII("DgofAw==", "ZktfA");
    }

    @Inject
    public r(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ax = squireNightmareZone;
        this.ay = squireNightmareZoneConfig;
        this.az = client;
    }

    private static String lIIlllllIIIlIII(String lllllllllllllllIIIIllllllIIIllIl, String lllllllllllllllIIIIllllllIIIIlll) {
        lllllllllllllllIIIIllllllIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIllllllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIllllllIIIlIll = new StringBuilder();
        char[] lllllllllllllllIIIIllllllIIIlIlI = lllllllllllllllIIIIllllllIIIIlll.toCharArray();
        int lllllllllllllllIIIIllllllIIIlIIl = lIIIlIIlIllIl[0];
        char[] lllllllllllllllIIIIllllllIIIIIll = lllllllllllllllIIIIllllllIIIllIl.toCharArray();
        int lllllllllllllllIIIIllllllIIIIIlI = lllllllllllllllIIIIllllllIIIIIll.length;
        int lllllllllllllllIIIIllllllIIIIIIl = lIIIlIIlIllIl[0];
        while (r.lIIlllllIIIlllI(lllllllllllllllIIIIllllllIIIIIIl, lllllllllllllllIIIIllllllIIIIIlI)) {
            char lllllllllllllllIIIIllllllIIIlllI = lllllllllllllllIIIIllllllIIIIIll[lllllllllllllllIIIIllllllIIIIIIl];
            lllllllllllllllIIIIllllllIIIlIll.append((char)(lllllllllllllllIIIIllllllIIIlllI ^ lllllllllllllllIIIIllllllIIIlIlI[lllllllllllllllIIIIllllllIIIlIIl % lllllllllllllllIIIIllllllIIIlIlI.length]));
            "".length();
            ++lllllllllllllllIIIIllllllIIIlIIl;
            ++lllllllllllllllIIIIllllllIIIIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIllllllIIIlIll);
    }

    private static boolean lIIlllllIIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        r.lIIlllllIIIlIlI();
        r.lIIlllllIIIlIIl();
    }
}

