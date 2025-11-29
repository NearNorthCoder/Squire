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

/* TASK: Enter Dream -> EnterdreamTask */
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

    private static String lIIllllIIlIlIlI(String var17, String var10) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIIII[9]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIIIlIIIlIIII[5], var19);
            return new String(var21.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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

    private static String lIIllllIIlIllII(String var8, String var7) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(lIIIlIIIlIIII[5], var1);
            return new String(var24.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllllIIlIlIll(String var12, String var2) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var9 = lIIIlIIIlIIII[0];
        char[] var16 = var12.toCharArray();
        int var3 = var16.length;
        int var20 = lIIIlIIIlIIII[0];
        while (p.lIIllllIIllIIIl(var20, var3)) {
            char var4 = var16[var20];
            var15.append((char)(var4 ^ var5[var9 % var5.length]));
            0;
            ++var9;
            ++var20;
            0;
            if ((0x26 ^ 0x22) >= 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIIllllIIllIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        p var13;
        if (p.lIIllllIIlIllll(this.at.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIIII[0];
        }
        int var18 = Static.getClient().getVarbitValue(b.u);
        if (p.lIIllllIIllIIII(var18)) {
            return lIIIlIIIlIIII[0];
        }
        int var26 = var13.ar.b();
        if (p.lIIllllIIllIIIl(var26, var13.as.absorption())) {
            return lIIIlIIIlIIII[0];
        }
        int var25 = var13.ar.a();
        if (p.lIIllllIIllIIIl(var25, var13.as.overload())) {
            return lIIIlIIIlIIII[0];
        }
        int var23 = Static.getClient().getVarbitValue(b.x);
        if (p.lIIllllIIllIIIl(var23, lIIIlIIIlIIII[1])) {
            Log.error((String)lIIIlIIIIllll[lIIIlIIIlIIII[0]]);
            Squire.stop();
            return lIIIlIIIlIIII[2];
        }
        if (p.lIIllllIIllIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIlIIIlIIII[0];
        }
        Widget var14 = Widgets.get((int)b.v, (int)b.w);
        if (p.lIIllllIIllIIlI(var14) && p.lIIllllIIlIllll(var14.isVisible() ? 1 : 0)) {
            var14.interact(lIIIlIIIlIIII[0], lIIIlIIIlIIII[3], lIIIlIIIlIIII[4], var14.getId());
            System.out.println(lIIIlIIIIllll[lIIIlIIIlIIII[2]]);
            return lIIIlIIIlIIII[2];
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (p.lIIllllIIlIllll(tileObject.getName().contains(lIIIlIIIIllll[lIIIlIIIlIIII[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIlIIIlIIII[2]];
                stringArray[p.lIIIlIIIlIIII[0]] = lIIIlIIIIllll[lIIIlIIIlIIII[7]];
                if (p.lIIllllIIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIIlIIIlIIII[2];
                    0;
                    if (1 != 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIIlIIIlIIII[0];
            return n2 != 0;
        });
        if (p.lIIllllIIllIIll(var11)) {
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

