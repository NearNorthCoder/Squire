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

/* TASK: Get Absorption -> GetabsorptionTask */
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
        r.lIIIlIIlIllIl[0] = (0xAE ^ 0xC7 ^ (0x52 ^ 8)) & (142 + 96 - 88 + 20 ^ 24 + 6 - -73 + 50 ^ -1);
        r.lIIIlIIlIllIl[1] = 1;
        r.lIIIlIIlIllIl[2] = 2;
        r.lIIIlIIlIllIl[3] = 3;
    }

    private static String lIIlllllIIIIlll(String var8, String var10) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIIIlIIlIllIl[2], var4);
            return new String(var16.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r var3;
        if (r.lIIlllllIIIlIll(this.az.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIllIl[0];
        }
        int var9 = var3.ax.a();
        if (r.lIIlllllIIIllII(var9, var3.ay.overload())) {
            return lIIIlIIlIllIl[0];
        }
        if (r.lIIlllllIIIlIll(Dialog.isEnterInputOpen() ? 1 : 0) && r.lIIlllllIIIlIll(Dialog.getText().contains(lIIIlIIlIllII[lIIIlIIlIllIl[0]]) ? 1 : 0)) {
            Dialog.enterAmount((int)(var3.ay.overload() - var9));
            return lIIIlIIlIllIl[1];
        }
        String[] stringArray = new String[lIIIlIIlIllIl[1]];
        stringArray[r.lIIIlIIlIllIl[0]] = lIIIlIIlIllII[lIIIlIIlIllIl[1]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray);
        if (r.lIIlllllIIIllIl(var5)) {
            return lIIIlIIlIllIl[0];
        }
        var2_2.interact(lIIIlIIlIllII[lIIIlIIlIllIl[2]]);
        return lIIIlIIlIllIl[1];
    }

    private static void lIIlllllIIIlIIl() {
        lIIIlIIlIllII = new String[lIIIlIIlIllIl[3]];
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[0]] = r."many doses of overload";
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[1]] = r."Overload potion";
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[2]] = r."Take";
    }

    @Inject
    public r(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ax = squireNightmareZone;
        this.ay = squireNightmareZoneConfig;
        this.az = client;
    }

    private static String lIIlllllIIIlIII(String var6, String var17) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var14 = var17.toCharArray();
        int var12 = lIIIlIIlIllIl[0];
        char[] var15 = var6.toCharArray();
        int var13 = var15.length;
        int var7 = lIIIlIIlIllIl[0];
        while (r.lIIlllllIIIlllI(var7, var13)) {
            char var2 = var15[var7];
            var1.append((char)(var2 ^ var14[var12 % var14.length]));
            0;
            ++var12;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIIlllllIIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        r.lIIlllllIIIlIlI();
        r.lIIlllllIIIlIIl();
    }
}

