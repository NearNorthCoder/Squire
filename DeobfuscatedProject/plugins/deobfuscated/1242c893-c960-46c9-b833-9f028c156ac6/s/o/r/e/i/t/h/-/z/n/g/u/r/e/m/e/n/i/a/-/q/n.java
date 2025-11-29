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
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.b;

@TaskDesc(name="Buy Herb Boxes", priority=150, blocking=true)
public class n
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
        n lllllllllllllllIIIIllllIllIIIllI;
        if (n.lIIlllllIlIIlll(this.am.herbBox() ? 1 : 0)) {
            return lIIIlIIllIllI[0];
        }
        if (n.lIIlllllIlIlIII(lllllllllllllllIIIIllllIllIIIllI.an.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIllIllI[0];
        }
        String[] stringArray = new String[lIIIlIIllIllI[1]];
        stringArray[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[0]];
        List lllllllllllllllIIIIllllIllIIIlIl = Inventory.getAll((String[])stringArray);
        if (n.lIIlllllIlIlIIl(Inventory.getFreeSlots(), lIIIlIIllIllI[2]) && n.lIIlllllIlIIlll(lllllllllllllllIIIIllllIllIIIlIl.size())) {
            return lIIIlIIllIllI[0];
        }
        if (n.lIIlllllIlIlIlI(lllllllllllllllIIIIllllIllIIIlIl.size())) {
            String[] stringArray2 = new String[lIIIlIIllIllI[1]];
            stringArray2[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[1]];
            Inventory.doActions(item -> item.getName().startsWith(lIIIlIIlIlIII[lIIIlIIllIllI[10]]), (String[])stringArray2);
            return lIIIlIIllIllI[1];
        }
        int lllllllllllllllIIIIllllIllIIIlII = Static.getClient().getVarbitValue(lIIIlIIllIllI[3]);
        if (n.lIIlllllIlIlIll(lllllllllllllllIIIIllllIllIIIlII, lIIIlIIllIllI[4])) {
            return lIIIlIIllIllI[0];
        }
        int lllllllllllllllIIIIllllIllIIIIll = Vars.getVarp((int)b.y);
        if (n.lIIlllllIlIlIIl(lllllllllllllllIIIIllllIllIIIIll, lIIIlIIllIllI[5] * (lIIIlIIllIllI[4] - lllllllllllllllIIIIllllIllIIIlII))) {
            return lIIIlIIllIllI[0];
        }
        int lllllllllllllllIIIIllllIllIIIIlI = Static.getClient().getVarbitValue(b.s);
        int lllllllllllllllIIIIllllIllIIIIIl = Static.getClient().getVarbitValue(b.t);
        if (!n.lIIlllllIlIlIll(lllllllllllllllIIIIllllIllIIIIlI + lllllllllllllllIIIIllllIllIIIllI.al.a(), lllllllllllllllIIIIllllIllIIIllI.am.overload()) || n.lIIlllllIlIlIIl(lllllllllllllllIIIIllllIllIIIIIl + lllllllllllllllIIIIllllIllIIIllI.al.b(), lllllllllllllllIIIIllllIllIIIllI.am.absorption())) {
            return lIIIlIIllIllI[0];
        }
        Widget lllllllllllllllIIIIllllIllIIIIII = Widgets.get((int)lIIIlIIllIllI[6], (int)lIIIlIIllIllI[1], (int)lIIIlIIllIllI[1]);
        if (!n.lIIlllllIlIllII(lllllllllllllllIIIIllllIllIIIIII) || n.lIIlllllIlIIlll(lllllllllllllllIIIIllllIllIIIIII.isVisible() ? 1 : 0)) {
            System.out.println(lIIIlIIlIlIII[lIIIlIIllIllI[7]]);
            String[] stringArray3 = new String[lIIIlIIllIllI[1]];
            stringArray3[n.lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[8]];
            TileObject lllllllllllllllIIIIllllIlIllllll = TileObjects.getNearest((String[])stringArray3);
            if (n.lIIlllllIlIllIl(lllllllllllllllIIIIllllIlIllllll)) {
                return lIIIlIIllIllI[0];
            }
            lllllllllllllllIIIIllllIlIllllll.interact(lIIIlIIlIlIII[lIIIlIIllIllI[9]]);
            return lIIIlIIllIllI[1];
        }
        Widget lllllllllllllllIIIIllllIlIllllll = Widgets.get((int)lIIIlIIllIllI[6], (int)b.o, (int)b.r);
        if (n.lIIlllllIlIllIl(lllllllllllllllIIIIllllIlIllllll)) {
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

    private static String lIIllllIlllllll(String lllllllllllllllIIIIllllIlIllIlll, String lllllllllllllllIIIIllllIlIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIllllIlIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIllllIlIlllIIl.init(lIIIlIIllIllI[7], lllllllllllllllIIIIllllIlIlllIlI);
            return new String(lllllllllllllllIIIIllllIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIllllIlIlllIII) {
            lllllllllllllllIIIIllllIlIlllIII.printStackTrace();
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

    private static String lIIllllIllllllI(String lllllllllllllllIIIIllllIlIIlIIII, String lllllllllllllllIIIIllllIlIIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIllllIlIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIllI[12]), "DES");
            Cipher lllllllllllllllIIIIllllIlIIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIllllIlIIlIlII.init(lIIIlIIllIllI[7], lllllllllllllllIIIIllllIlIIlIlIl);
            return new String(lllllllllllllllIIIIllllIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIllllIlIIlIIll) {
            lllllllllllllllIIIIllllIlIIlIIll.printStackTrace();
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

    private static String lIIllllIlllllIl(String lllllllllllllllIIIIllllIlIlIIIlI, String lllllllllllllllIIIIllllIlIlIIllI) {
        lllllllllllllllIIIIllllIlIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIllllIlIlIIlIl = new StringBuilder();
        char[] lllllllllllllllIIIIllllIlIlIIlII = lllllllllllllllIIIIllllIlIlIIllI.toCharArray();
        int lllllllllllllllIIIIllllIlIlIIIll = lIIIlIIllIllI[0];
        char[] lllllllllllllllIIIIllllIlIIlllIl = lllllllllllllllIIIIllllIlIlIIIlI.toCharArray();
        int lllllllllllllllIIIIllllIlIIlllII = lllllllllllllllIIIIllllIlIIlllIl.length;
        int lllllllllllllllIIIIllllIlIIllIll = lIIIlIIllIllI[0];
        while (n.lIIlllllIlIlIIl(lllllllllllllllIIIIllllIlIIllIll, lllllllllllllllIIIIllllIlIIlllII)) {
            char lllllllllllllllIIIIllllIlIlIlIII = lllllllllllllllIIIIllllIlIIlllIl[lllllllllllllllIIIIllllIlIIllIll];
            lllllllllllllllIIIIllllIlIlIIlIl.append((char)(lllllllllllllllIIIIllllIlIlIlIII ^ lllllllllllllllIIIIllllIlIlIIlII[lllllllllllllllIIIIllllIlIlIIIll % lllllllllllllllIIIIllllIlIlIIlII.length]));
            0;
            ++lllllllllllllllIIIIllllIlIlIIIll;
            ++lllllllllllllllIIIIllllIlIIllIll;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIllllIlIlIIlIl);
    }

    private static boolean lIIlllllIlIlIlI(int n2) {
        return n2 > 0;
    }
}

