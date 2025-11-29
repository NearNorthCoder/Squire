/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
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
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.b;

/* TASK: Restock Potions -> RestockpotionsTask */
@TaskDesc(name="Restock Potions", priority=200, blocking=true)
public class s
extends Task {
    private final /* synthetic */ SquireNightmareZone aA;
    private final /* synthetic */ Client aC;
    private static /* synthetic */ int[] lIIIlIIlIIlII;
    private final /* synthetic */ SquireNightmareZoneConfig aB;
    private static /* synthetic */ String[] lIIIlIIlIIIIl;

    private static boolean lIIllllIllIlllI(int n2) {
        return n2 == 0;
    }

    static {
        s.lIIllllIllIlIlI();
        s.lIIllllIllIIlll();
    }

    private static boolean lIIllllIllIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIllIllll(Object object) {
        return object == null;
    }

    public boolean run() {
        s var19;
        if (s.lIIllllIllIlIll(this.aC.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIlII[0];
        }
        if (s.lIIllllIllIlIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIIlIIlIIlII[1];
        }
        int var16 = Static.getClient().getVarbitValue(b.s);
        int var8 = Static.getClient().getVarbitValue(b.t);
        if (s.lIIllllIllIllII(var16 + var19.aA.a(), var19.aB.overload()) && s.lIIllllIllIllII(var8 + var19.aA.b(), var19.aB.absorption())) {
            return lIIIlIIlIIlII[0];
        }
        Widget var6 = Widgets.get((int)lIIIlIIlIIlII[2], (int)lIIIlIIlIIlII[1], (int)lIIIlIIlIIlII[1]);
        if (!s.lIIllllIllIllIl(var6) || s.lIIllllIllIlllI(var6.isVisible() ? 1 : 0)) {
            String[] stringArray = new String[lIIIlIIlIIlII[1]];
            stringArray[s.lIIIlIIlIIlII[0]] = lIIIlIIlIIIIl[lIIIlIIlIIlII[0]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray);
            if (s.lIIllllIllIllll(var5)) {
                return lIIIlIIlIIlII[0];
            }
            var5.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[1]]);
            return lIIIlIIlIIlII[1];
        }
        Widget var5 = Widgets.get((int)lIIIlIIlIIlII[2], (int)b.n, (int)b.p);
        if (s.lIIllllIlllIIII(var16, var19.aB.overload()) && s.lIIllllIllIllIl(var5)) {
            var5.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[3]]);
            return lIIIlIIlIIlII[1];
        }
        Widget var9 = Widgets.get((int)lIIIlIIlIIlII[2], (int)b.n, (int)b.q);
        if (s.lIIllllIlllIIII(var8, var19.aB.absorption()) && s.lIIllllIllIllIl(var9)) {
            var9.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[4]]);
            return lIIIlIIlIIlII[1];
        }
        return lIIIlIIlIIlII[0];
    }

    private static boolean lIIllllIllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllllIllIllIl(Object object) {
        return object != null;
    }

    @Inject
    public s(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.aA = squireNightmareZone;
        this.aB = squireNightmareZoneConfig;
        this.aC = client;
    }

    private static boolean lIIllllIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllllIllIIllI(String var4, String var2) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIIlIIlIIlII[3], var14);
            return new String(var17.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void lIIllllIllIIlll() {
        lIIIlIIlIIIIl = new String[lIIIlIIlIIlII[5]];
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[0]] = s."Rewards chest";
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[1]] = s."Search";
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[3]] = s."Buy-10";
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[4]] = s."Buy-10";
    }

    private static String lIIllllIllIIlIl(String var20, String var11) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var18 = lIIIlIIlIIlII[0];
        char[] var15 = var20.toCharArray();
        int var1 = var15.length;
        int var7 = lIIIlIIlIIlII[0];
        while (s.lIIllllIlllIIII(var7, var1)) {
            char var3 = var15[var7];
            var12.append((char)(var3 ^ var13[var18 % var13.length]));
            0;
            ++var18;
            ++var7;
            0;
            if ((0x3E ^ 0x7A ^ (0xCA ^ 0x8B)) > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static void lIIllllIllIlIlI() {
        lIIIlIIlIIlII = new int[6];
        s.lIIIlIIlIIlII[0] = (0x4F ^ 0x45) & ~(0xC9 ^ 0xC3);
        s.lIIIlIIlIIlII[1] = 1;
        s.lIIIlIIlIIlII[2] = (0x6B ^ 0x6F) + (7 ^ 0x75) - (0x62 ^ 0x55) + (7 + 137 - 119 + 118);
        s.lIIIlIIlIIlII[3] = 2;
        s.lIIIlIIlIIlII[4] = 3;
        s.lIIIlIIlIIlII[5] = 0x1B ^ 0x60 ^ 82 + 21 - 92 + 116;
    }
}

