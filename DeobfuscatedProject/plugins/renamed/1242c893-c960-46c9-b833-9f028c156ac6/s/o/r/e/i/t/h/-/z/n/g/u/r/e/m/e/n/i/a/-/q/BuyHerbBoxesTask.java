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
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.b_Unknown;

/* TASK: Buy Herb Boxes -> BuyherbboxesTask */
@TaskDesc(name="Buy Herb Boxes", priority=150, blocking=true)
public class BuyHerbBoxesTask
extends Task {
    private final /* synthetic */ Client an;
    private static /* synthetic */ String[] lIIIlIIlIlIII;
    private final /* synthetic */ SquireNightmareZoneConfig am;
    private static /* synthetic */ int[] lIIIlIIllIllI;
    private final /* synthetic */ SquireNightmareZone al;

    private static void lIIlllllIlIIllI() {
        lIIIlIIllIllI = new int[13];
        n.lIIIlIIllIllI[0] = (0x3C ^ 0x77) & ~(0x34 ^ 0x7F);
        n.lIIIlIIllIllI[1] = 1;
        n.lIIIlIIllIllI[2] = 12 + 107 - 5 + 28 ^ 65 + 67 - 39 + 46;
        n.lIIIlIIllIllI[3] = 0xFFFFAF7B & 0x5FFD;
        n.lIIIlIIllIllI[4] = 0x4F ^ 0x4A ^ (0 ^ 0xA);
        n.lIIIlIIllIllI[5] = 0xFFFFAF3E & 0x75DD;
        n.lIIIlIIllIllI[6] = (0x93 ^ 0x9F) + (107 + 29 - 79 + 70) - (0xDF ^ 0xC5) + (0x21 ^ 0x7C);
        n.lIIIlIIllIllI[7] = 2;
        n.lIIIlIIllIllI[8] = 3;
        n.lIIIlIIllIllI[9] = 0xBE ^ 0xBA;
        n.lIIIlIIllIllI[10] = 0x10 ^ 0x40 ^ (0x4F ^ 0x19);
        n.lIIIlIIllIllI[11] = 0x62 ^ 0x65;
        n.lIIIlIIllIllI[12] = 120 + 97 - 113 + 45 ^ 106 + 63 - 92 + 80;
    }

    private static boolean lIIlllllIlIllIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_8;
        n var10;
        if (n.lIIlllllIlIIlll(this.am.herbBox() ? 1 : 0)) {
            return lIIIlIIllIllI[0];
        }
        if (n.lIIlllllIlIlIII(var10.an.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIllIllI[0];
        }
        String[] stringArray = new String[lIIIlIIllIllI[1]];
        stringArray[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[0]];
        List var8 = Inventory.getAll((String[])stringArray);
        if (n.lIIlllllIlIlIIl(Inventory.getFreeSlots(), lIIIlIIllIllI[2]) && n.lIIlllllIlIIlll(var8.size())) {
            return lIIIlIIllIllI[0];
        }
        if (n.lIIlllllIlIlIlI(var8.size())) {
            String[] stringArray2 = new String[lIIIlIIllIllI[1]];
            stringArray2[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[1]];
            Inventory.doActions(item -> item.getName().startsWith(lIIIlIIlIlIII[lIIIlIIllIllI[10]]), (String[])stringArray2);
            return lIIIlIIllIllI[1];
        }
        int var13 = Static.getClient().getVarbitValue(lIIIlIIllIllI[3]);
        if (n.lIIlllllIlIlIll(var13, lIIIlIIllIllI[4])) {
            return lIIIlIIllIllI[0];
        }
        int var25 = Vars.getVarp((int)b.y);
        if (n.lIIlllllIlIlIIl(var25, lIIIlIIllIllI[5] * (lIIIlIIllIllI[4] - var13))) {
            return lIIIlIIllIllI[0];
        }
        int var22 = Static.getClient().getVarbitValue(b.s);
        int var19 = Static.getClient().getVarbitValue(b.t);
        if (!n.lIIlllllIlIlIll(var22 + var10.al.a(), var10.am.overload()) || n.lIIlllllIlIlIIl(var19 + var10.al.b(), var10.am.absorption())) {
            return lIIIlIIllIllI[0];
        }
        Widget var18 = Widgets.get((int)lIIIlIIllIllI[6], (int)lIIIlIIllIllI[1], (int)lIIIlIIllIllI[1]);
        if (!n.lIIlllllIlIllII(var18) || n.lIIlllllIlIIlll(var18.isVisible() ? 1 : 0)) {
            System.out.println(lIIIlIIlIlIII[lIIIlIIllIllI[7]]);
            String[] stringArray3 = new String[lIIIlIIllIllI[1]];
            stringArray3[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[8]];
            TileObject var21 = TileObjects.getNearest((String[])stringArray3);
            if (n.lIIlllllIlIllIl(var21)) {
                return lIIIlIIllIllI[0];
            }
            var21.interact(lIIIlIIlIlIII[lIIIlIIllIllI[9]]);
            return lIIIlIIllIllI[1];
        }
        Widget var21 = Widgets.get((int)lIIIlIIllIllI[6], (int)b.o, (int)b.r);
        if (n.lIIlllllIlIllIl(var21)) {
            return lIIIlIIllIllI[0];
        }
        var7_8.interact(lIIIlIIlIlIII[lIIIlIIllIllI[2]]);
        return lIIIlIIllIllI[1];
    }

    private static boolean lIIlllllIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllllIlIllII(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIllllIlllllll(String var2, String var24) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIIlIIllIllI[7], var9);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        n.lIIlllllIlIIllI();
        n.lIIlllllIIIIIII();
    }

    private static void lIIlllllIIIIIII() {
        lIIIlIIlIlIII = new String[lIIIlIIllIllI[11]];
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[0]] = n."Herb box";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[1]] = n."Bank-all";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[7]] = n."Widget is null";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[8]] = n."Rewards chest";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[9]] = n."Search";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[2]] = n."Buy-5";
        n.lIIIlIIlIlIII[n.lIIIlIIllIllI[10]] = n."Herb box";
    }

    private static String lIIllllIllllllI(String var6, String var23) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIllI[12]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIIIlIIllIllI[7], var1);
            return new String(var4.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Inject
    public n(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.al = squireNightmareZone;
        this.am = squireNightmareZoneConfig;
        this.an = client;
    }

    private static boolean lIIlllllIlIIlll(int n2) {
        return n2 == 0;
    }

    private static String lIIllllIlllllIl(String var17, String var26) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var11 = var26.toCharArray();
        int var14 = lIIIlIIllIllI[0];
        char[] var15 = var17.toCharArray();
        int var27 = var15.length;
        int var12 = lIIIlIIllIllI[0];
        while (n.lIIlllllIlIlIIl(var12, var27)) {
            char var7 = var15[var12];
            var20.append((char)(var7 ^ var11[var14 % var11.length]));
            0;
            ++var14;
            ++var12;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean lIIlllllIlIlIlI(int n2) {
        return n2 > 0;
    }
}

