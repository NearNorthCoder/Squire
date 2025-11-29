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
 *  net.unethicalite.api.movement.Movement
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
import net.unethicalite.api.movement.Movement;

/* TASK: Pick Power Up -> PickpowerupTask */
@TaskDesc(name="Pick Power Up", priority=10, blocking=true)
public class i
extends Task {
    private final /* synthetic */ SquireNightmareZoneConfig W;
    private static /* synthetic */ String[] lIIIlIIIlIlll;
    private final /* synthetic */ SquireNightmareZone V;
    private final /* synthetic */ Client X;
    private static /* synthetic */ int[] lIIIlIIIllIII;

    private static void lIIllllIlIIlIll() {
        lIIIlIIIllIII = new int[4];
        i.lIIIlIIIllIII[0] = (0xC9 ^ 0x8A) & ~(0x23 ^ 0x60);
        i.lIIIlIIIllIII[1] = 1;
        i.lIIIlIIIllIII[2] = 2;
        i.lIIIlIIIllIII[3] = 3;
    }

    private static String lIIllllIlIIlIII(String var11, String var1) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var8 = var1.toCharArray();
        int var15 = lIIIlIIIllIII[0];
        char[] var10 = var11.toCharArray();
        int var12 = var10.length;
        int var14 = lIIIlIIIllIII[0];
        while (i.lIIllllIlIIlllI(var14, var12)) {
            char var4 = var10[var14];
            var6.append((char)(var4 ^ var8[var15 % var8.length]));
            0;
            ++var15;
            ++var14;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        i.lIIllllIlIIlIll();
        i.lIIllllIlIIlIlI();
    }

    private static boolean lIIllllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllllIlIIlIIl(String var9, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIIlIIIllIII[2], var3);
            return new String(var7.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIIllllIlIIlIlI() {
        lIIIlIIIlIlll = new String[lIIIlIIIllIII[3]];
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[0]] = i."Power surge";
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[1]] = i."Picking up Power Surge";
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[2]] = i."Activate";
    }

    @Inject
    public i(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.V = squireNightmareZone;
        this.W = squireNightmareZoneConfig;
        this.X = client;
    }

    private static boolean lIIllllIlIIllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        i var5;
        if (i.lIIllllIlIIllII(this.W.powerSurge() ? 1 : 0)) {
            return lIIIlIIIllIII[0];
        }
        if (i.lIIllllIlIIllII(var5.X.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIllIII[0];
        }
        String[] stringArray = new String[lIIIlIIIllIII[1]];
        stringArray[i.lIIIlIIIllIII[0]] = lIIIlIIIlIlll[lIIIlIIIllIII[0]];
        TileObject var16 = TileObjects.getNearest((String[])stringArray);
        if (i.lIIllllIlIIllIl(var16)) {
            return lIIIlIIIllIII[0];
        }
        if (i.lIIllllIlIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIlIIIllIII[1];
        }
        System.out.println(lIIIlIIIlIlll[lIIIlIIIllIII[1]]);
        var1_1.interact(lIIIlIIIlIlll[lIIIlIIIllIII[2]]);
        return lIIIlIIIllIII[1];
    }

    private static boolean lIIllllIlIIllIl(Object object) {
        return object == null;
    }
}

