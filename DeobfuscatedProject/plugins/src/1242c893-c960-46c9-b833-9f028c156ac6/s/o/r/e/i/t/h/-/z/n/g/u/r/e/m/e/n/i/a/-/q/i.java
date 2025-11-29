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
        i.lIIIlIIIllIII[1] = " ".length();
        i.lIIIlIIIllIII[2] = "  ".length();
        i.lIIIlIIIllIII[3] = "   ".length();
    }

    private static String lIIllllIlIIlIII(String lllllllllllllllIIIlIIIIIllllIllI, String lllllllllllllllIIIlIIIIIllllIIII) {
        lllllllllllllllIIIlIIIIIllllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlIIIIIllllIlII = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIIllllIIll = lllllllllllllllIIIlIIIIIllllIIII.toCharArray();
        int lllllllllllllllIIIlIIIIIllllIIlI = lIIIlIIIllIII[0];
        char[] lllllllllllllllIIIlIIIIIlllIllII = lllllllllllllllIIIlIIIIIllllIllI.toCharArray();
        int lllllllllllllllIIIlIIIIIlllIlIll = lllllllllllllllIIIlIIIIIlllIllII.length;
        int lllllllllllllllIIIlIIIIIlllIlIlI = lIIIlIIIllIII[0];
        while (i.lIIllllIlIIlllI(lllllllllllllllIIIlIIIIIlllIlIlI, lllllllllllllllIIIlIIIIIlllIlIll)) {
            char lllllllllllllllIIIlIIIIIllllIlll = lllllllllllllllIIIlIIIIIlllIllII[lllllllllllllllIIIlIIIIIlllIlIlI];
            lllllllllllllllIIIlIIIIIllllIlII.append((char)(lllllllllllllllIIIlIIIIIllllIlll ^ lllllllllllllllIIIlIIIIIllllIIll[lllllllllllllllIIIlIIIIIllllIIlI % lllllllllllllllIIIlIIIIIllllIIll.length]));
            "".length();
            ++lllllllllllllllIIIlIIIIIllllIIlI;
            ++lllllllllllllllIIIlIIIIIlllIlIlI;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlIIIIIllllIlII);
    }

    static {
        i.lIIllllIlIIlIll();
        i.lIIllllIlIIlIlI();
    }

    private static boolean lIIllllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllllIlIIlIIl(String lllllllllllllllIIIlIIIIIlllIIIIl, String lllllllllllllllIIIlIIIIIllIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIlllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlIIIIIlllIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlIIIIIlllIIIll.init(lIIIlIIIllIII[2], lllllllllllllllIIIlIIIIIlllIIlII);
            return new String(lllllllllllllllIIIlIIIIIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIIlllIIIlI) {
            lllllllllllllllIIIlIIIIIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIllllIlIIlIlI() {
        lIIIlIIIlIlll = new String[lIIIlIIIllIII[3]];
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[0]] = i.lIIllllIlIIlIII("AgABPBhyHAMrDTc=", "RovYj");
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[1]] = i.lIIllllIlIIlIIl("zq41RArshT2SzqCCbEBgdd/Wzg4ZreYR", "cXiJg");
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[2]] = i.lIIllllIlIIlIIl("G4dvUhV7V2itRaexUjnwPA==", "wxuku");
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
        i lllllllllllllllIIIlIIIIlIIIIIIlI;
        if (i.lIIllllIlIIllII(this.W.powerSurge() ? 1 : 0)) {
            return lIIIlIIIllIII[0];
        }
        if (i.lIIllllIlIIllII(lllllllllllllllIIIlIIIIlIIIIIIlI.X.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIllIII[0];
        }
        String[] stringArray = new String[lIIIlIIIllIII[1]];
        stringArray[i.lIIIlIIIllIII[0]] = lIIIlIIIlIlll[lIIIlIIIllIII[0]];
        TileObject lllllllllllllllIIIlIIIIlIIIIIIIl = TileObjects.getNearest((String[])stringArray);
        if (i.lIIllllIlIIllIl(lllllllllllllllIIIlIIIIlIIIIIIIl)) {
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

