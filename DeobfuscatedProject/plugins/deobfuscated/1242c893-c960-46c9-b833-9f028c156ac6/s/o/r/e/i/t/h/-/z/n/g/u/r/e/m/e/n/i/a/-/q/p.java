/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.Squire
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
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
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.b;

@TaskDesc(name="Enter Dream", priority=1, blocking=true)
public class p
extends Task {
    private final /* synthetic */ SquireNightmareZone ar;
    private final /* synthetic */ SquireNightmareZoneConfig as;
    private static /* synthetic */ String[] lIIIlIIIIllll;
    private static /* synthetic */ int[] lIIIlIIIlIIII;
    private final /* synthetic */ Client at;

    private static void lIIllllIIlIllIl() {
        lIIIlIIIIllll = new String[lIIIlIIIlIIII[8]];
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[0]] = p."We have less than 26k - stopping";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[2]] = p."Entering dream!";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[5]] = p."Drink";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[6]] = p."Potion";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[7]] = p."Drink";
    }

    private static boolean lIIllllIIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIIlIllll(int n2) {
        return n2 != 0;
    }

    private static String lIIllllIIlIlIlI(String lllllllllllllllIIIlIIIIllIlIIlII, String lllllllllllllllIIIlIIIIllIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIIII[9]), "DES");
            Cipher lllllllllllllllIIIlIIIIllIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIlIIIIllIlIlIII.init(lIIIlIIIlIIII[5], lllllllllllllllIIIlIIIIllIlIlIIl);
            return new String(lllllllllllllllIIIlIIIIllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIllIlIIlll) {
            lllllllllllllllIIIlIIIIllIlIIlll.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ar = squireNightmareZone;
        this.as = squireNightmareZoneConfig;
        this.at = client;
    }

    private static boolean lIIllllIIllIIlI(Object object) {
        return object != null;
    }

    private static void lIIllllIIlIlllI() {
        lIIIlIIIlIIII = new int[10];
        p.lIIIlIIIlIIII[0] = (0x87 ^ 0xA9) & ~(0x9F ^ 0xB1);
        p.lIIIlIIIlIIII[1] = 0xB5 ^ 0xAF;
        p.lIIIlIIIlIIII[2] = 1;
        p.lIIIlIIIlIIII[3] = 0x29 ^ 0x40 ^ (0x79 ^ 0xE);
        p.lIIIlIIIlIIII[4] = -1;
        p.lIIIlIIIlIIII[5] = 2;
        p.lIIIlIIIlIIII[6] = 3;
        p.lIIIlIIIlIIII[7] = 131 + 19 - 128 + 114 ^ 39 + 26 - -31 + 44;
        p.lIIIlIIIlIIII[8] = 57 + 95 - 100 + 131 ^ 100 + 176 - 176 + 78;
        p.lIIIlIIIlIIII[9] = 0x6A ^ 0xA ^ (0xDD ^ 0xB5);
    }

    private static String lIIllllIIlIllII(String lllllllllllllllIIIlIIIIllIIllIIl, String lllllllllllllllIIIlIIIIllIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlIIIIllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlIIIIllIIllIll.init(lIIIlIIIlIIII[5], lllllllllllllllIIIlIIIIllIIlllII);
            return new String(lllllllllllllllIIIlIIIIllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIllIIllIlI) {
            lllllllllllllllIIIlIIIIllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllllIIlIlIll(String lllllllllllllllIIIlIIIIllIIIIlII, String lllllllllllllllIIIlIIIIllIIIIIll) {
        lllllllllllllllIIIlIIIIllIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlIIIIllIIIIlll = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIllIIIIllI = lllllllllllllllIIIlIIIIllIIIIIll.toCharArray();
        int lllllllllllllllIIIlIIIIllIIIIlIl = lIIIlIIIlIIII[0];
        char[] lllllllllllllllIIIlIIIIlIlllllll = lllllllllllllllIIIlIIIIllIIIIlII.toCharArray();
        int lllllllllllllllIIIlIIIIlIllllllI = lllllllllllllllIIIlIIIIlIlllllll.length;
        int lllllllllllllllIIIlIIIIlIlllllIl = lIIIlIIIlIIII[0];
        while (p.lIIllllIIllIIIl(lllllllllllllllIIIlIIIIlIlllllIl, lllllllllllllllIIIlIIIIlIllllllI)) {
            char lllllllllllllllIIIlIIIIllIIIlIlI = lllllllllllllllIIIlIIIIlIlllllll[lllllllllllllllIIIlIIIIlIlllllIl];
            lllllllllllllllIIIlIIIIllIIIIlll.append((char)(lllllllllllllllIIIlIIIIllIIIlIlI ^ lllllllllllllllIIIlIIIIllIIIIllI[lllllllllllllllIIIlIIIIllIIIIlIl % lllllllllllllllIIIlIIIIllIIIIllI.length]));
            0;
            ++lllllllllllllllIIIlIIIIllIIIIlIl;
            ++lllllllllllllllIIIlIIIIlIlllllIl;
            0;
            if ((0x26 ^ 0x22) >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlIIIIllIIIIlll);
    }

    private static boolean lIIllllIIllIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        p lllllllllllllllIIIlIIIIllIllIllI;
        if (p.lIIllllIIlIllll(this.at.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIIII[0];
        }
        int lllllllllllllllIIIlIIIIllIllIlIl = Static.getClient().getVarbitValue(b.u);
        if (p.lIIllllIIllIIII(lllllllllllllllIIIlIIIIllIllIlIl)) {
            return lIIIlIIIlIIII[0];
        }
        int lllllllllllllllIIIlIIIIllIllIlII = lllllllllllllllIIIlIIIIllIllIllI.ar.b();
        if (p.lIIllllIIllIIIl(lllllllllllllllIIIlIIIIllIllIlII, lllllllllllllllIIIlIIIIllIllIllI.as.absorption())) {
            return lIIIlIIIlIIII[0];
        }
        int lllllllllllllllIIIlIIIIllIllIIll = lllllllllllllllIIIlIIIIllIllIllI.ar.a();
        if (p.lIIllllIIllIIIl(lllllllllllllllIIIlIIIIllIllIIll, lllllllllllllllIIIlIIIIllIllIllI.as.overload())) {
            return lIIIlIIIlIIII[0];
        }
        int lllllllllllllllIIIlIIIIllIllIIlI = Static.getClient().getVarbitValue(b.x);
        if (p.lIIllllIIllIIIl(lllllllllllllllIIIlIIIIllIllIIlI, lIIIlIIIlIIII[1])) {
            Log.error((String)lIIIlIIIIllll[lIIIlIIIlIIII[0]]);
            Squire.stop();
            return lIIIlIIIlIIII[2];
        }
        if (p.lIIllllIIllIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIlIIIlIIII[0];
        }
        Widget lllllllllllllllIIIlIIIIllIllIIIl = Widgets.get((int)b.v, (int)b.w);
        if (p.lIIllllIIllIIlI(lllllllllllllllIIIlIIIIllIllIIIl) && p.lIIllllIIlIllll(lllllllllllllllIIIlIIIIllIllIIIl.isVisible() ? 1 : 0)) {
            lllllllllllllllIIIlIIIIllIllIIIl.interact(lIIIlIIIlIIII[0], lIIIlIIIlIIII[3], lIIIlIIIlIIII[4], lllllllllllllllIIIlIIIIllIllIIIl.getId());
            System.out.println(lIIIlIIIIllll[lIIIlIIIlIIII[2]]);
            return lIIIlIIIlIIII[2];
        }
        TileObject lllllllllllllllIIIlIIIIllIllIIII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (p.lIIllllIIlIllll(tileObject.getName().contains(lIIIlIIIIllll[lIIIlIIIlIIII[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIlIIIlIIII[2]];
                stringArray[p.lIIIlIIIlIIII[0]] = lIIIlIIIIllll[lIIIlIIIlIIII[7]];
                if (p.lIIllllIIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIIlIIIlIIII[2];
                    0;
                    if (1 != 2) return n2 != 0;
                    return ((0x7F ^ 0x65) & ~(0xAB ^ 0xB1)) != 0;
                }
            }
            n2 = lIIIlIIIlIIII[0];
            return n2 != 0;
        });
        if (p.lIIllllIIllIIll(lllllllllllllllIIIlIIIIllIllIIII)) {
            return lIIIlIIIlIIII[0];
        }
        var6_6.interact(lIIIlIIIIllll[lIIIlIIIlIIII[5]]);
        return lIIIlIIIlIIII[2];
    }

    static {
        p.lIIllllIIlIlllI();
        p.lIIllllIIlIllIl();
    }
}

