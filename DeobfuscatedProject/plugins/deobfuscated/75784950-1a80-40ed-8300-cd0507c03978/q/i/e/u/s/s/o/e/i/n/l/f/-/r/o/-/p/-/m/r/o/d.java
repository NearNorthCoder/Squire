/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Claim chest")
public class d
extends Task {
    private static /* synthetic */ String[] lIIIIIIlIllII;
    final /* synthetic */ WorldArea K;
    final /* synthetic */ WorldArea J;
    private static /* synthetic */ int[] lIIIIIIlIlllI;
    final /* synthetic */ WorldPoint L;

    private static String lIIlIllllIlllII(String lllllllllllllllIIIlllIlIlllIIIII, String lllllllllllllllIIIlllIlIlllIIlII) {
        lllllllllllllllIIIlllIlIlllIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlllIlIlllIIIll = new StringBuilder();
        char[] lllllllllllllllIIIlllIlIlllIIIlI = lllllllllllllllIIIlllIlIlllIIlII.toCharArray();
        int lllllllllllllllIIIlllIlIlllIIIIl = lIIIIIIlIlllI[4];
        char[] lllllllllllllllIIIlllIlIllIllIll = lllllllllllllllIIIlllIlIlllIIIII.toCharArray();
        int lllllllllllllllIIIlllIlIllIllIlI = lllllllllllllllIIIlllIlIllIllIll.length;
        int lllllllllllllllIIIlllIlIllIllIIl = lIIIIIIlIlllI[4];
        while (d.lIIlIlllllIlIlI(lllllllllllllllIIIlllIlIllIllIIl, lllllllllllllllIIIlllIlIllIllIlI)) {
            char lllllllllllllllIIIlllIlIlllIIllI = lllllllllllllllIIIlllIlIllIllIll[lllllllllllllllIIIlllIlIllIllIIl];
            lllllllllllllllIIIlllIlIlllIIIll.append((char)(lllllllllllllllIIIlllIlIlllIIllI ^ lllllllllllllllIIIlllIlIlllIIIlI[lllllllllllllllIIIlllIlIlllIIIIl % lllllllllllllllIIIlllIlIlllIIIlI.length]));
            0;
            ++lllllllllllllllIIIlllIlIlllIIIIl;
            ++lllllllllllllllIIIlllIlIllIllIIl;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlllIlIlllIIIll);
    }

    public boolean run() {
        TileObject lllllllllllllllIIIlllIllIIIIllIl;
        d lllllllllllllllIIIlllIllIIIIlllI;
        if (!d.lIIlIlllllIIllI(Vars.getBit((int)lIIIIIIlIlllI[11]), lIIIIIIlIlllI[12]) || !d.lIIlIlllllIIllI(Vars.getBit((int)lIIIIIIlIlllI[13]), lIIIIIIlIlllI[12]) || d.lIIlIlllllIIlll(Vars.getBit((int)lIIIIIIlIlllI[14]), lIIIIIIlIlllI[12])) {
            return lIIIIIIlIlllI[4];
        }
        if (d.lIIlIlllllIlIII(lllllllllllllllIIIlllIllIIIIlllI.J.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIIIlllIllIIIIllIl = TileObjects.getNearest(tileObject -> {
                int n;
                if (d.lIIlIlllllIlIII(tileObject.getName().contains(lIIIIIIlIllII[lIIIIIIlIlllI[24]]) ? 1 : 0) && d.lIIlIlllllIllII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIlllI[17])) {
                    n = lIIIIIIlIlllI[12];
                    0;
                    if (-(63 + 46 - 14 + 47 ^ 109 + 130 - 106 + 6) >= 0) {
                        return ((0x54 ^ 0x40 ^ (0x3F ^ 0x12)) & (63 + 109 - 80 + 69 ^ 110 + 21 - -4 + 17 ^ -1)) != 0;
                    }
                } else {
                    n = lIIIIIIlIlllI[4];
                }
                return n != 0;
            });
            if (d.lIIlIlllllIlIIl(lllllllllllllllIIIlllIllIIIIllIl) && d.lIIlIlllllIlIlI(Movement.getRunEnergy(), lIIIIIIlIlllI[15])) {
                SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[4]];
                lllllllllllllllIIIlllIllIIIIllIl.interact(lIIIIIIlIllII[lIIIIIIlIlllI[12]]);
                return lIIIIIIlIlllI[12];
            }
            if (d.lIIlIlllllIlIll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIlllIllIIIIlllI.L), lIIIIIIlIlllI[16]) && (!d.lIIlIlllllIlIlI(Movement.getRunEnergy(), lIIIIIIlIlllI[15]) || !d.lIIlIlllllIlIIl(lllllllllllllllIIIlllIllIIIIllIl) || d.lIIlIlllllIlIIl(lllllllllllllllIIIlllIllIIIIllIl) && d.lIIlIlllllIlIll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIlllIllIIIIllIl.getWorldLocation()), lIIIIIIlIlllI[17]))) {
                SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[18]];
                Movement.walkTo((WorldPoint)lllllllllllllllIIIlllIllIIIIlllI.L);
                0;
                return lIIIIIIlIlllI[12];
            }
            if (d.lIIlIlllllIllII(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIlllIllIIIIlllI.L), lIIIIIIlIlllI[16])) {
                String[] stringArray = new String[lIIIIIIlIlllI[12]];
                stringArray[d.lIIIIIIlIlllI[4]] = lIIIIIIlIllII[lIIIIIIlIlllI[19]];
                TileObject lllllllllllllllIIIlllIllIIIIllII = TileObjects.getNearest((String[])stringArray);
                if (d.lIIlIlllllIlIIl(lllllllllllllllIIIlllIllIIIIllII)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[20]];
                    lllllllllllllllIIIlllIllIIIIllII.interact(lIIIIIIlIllII[lIIIIIIlIlllI[17]]);
                    return lIIIIIIlIlllI[12];
                }
            }
        }
        if (d.lIIlIlllllIlIII(lllllllllllllllIIIlllIllIIIIlllI.K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIIlIlllI[12]];
            stringArray[d.lIIIIIIlIlllI[4]] = lIIIIIIlIllII[lIIIIIIlIlllI[21]];
            lllllllllllllllIIIlllIllIIIIllIl = TileObjects.getNearest((String[])stringArray);
            if (d.lIIlIlllllIlIIl(lllllllllllllllIIIlllIllIIIIllIl)) {
                SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[22]];
                lllllllllllllllIIIlllIllIIIIllIl.interact(lIIIIIIlIllII[lIIIIIIlIlllI[23]]);
                return lIIIIIIlIlllI[12];
            }
        }
        return lIIIIIIlIlllI[4];
    }

    private static boolean lIIlIlllllIllII(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIlllllIlIIl(Object object) {
        return object != null;
    }

    public d() {
        this.J = new WorldArea(lIIIIIIlIlllI[0], lIIIIIIlIlllI[1], lIIIIIIlIlllI[2], lIIIIIIlIlllI[3], lIIIIIIlIlllI[4]);
        this.K = new WorldArea(lIIIIIIlIlllI[5], lIIIIIIlIlllI[6], lIIIIIIlIlllI[7], lIIIIIIlIlllI[8], lIIIIIIlIlllI[4]);
        this.L = new WorldPoint(lIIIIIIlIlllI[9], lIIIIIIlIlllI[10], lIIIIIIlIlllI[4]);
    }

    static {
        d.lIIlIlllllIIlIl();
        d.lIIlIlllllIIlII();
    }

    private static void lIIlIlllllIIlII() {
        lIIIIIIlIllII = new String[lIIIIIIlIlllI[16]];
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[4]] = d."Drinking tea";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[12]] = d."Make-cuppa";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[18]] = d."Nav to door";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[19]] = d."Entrance";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[20]] = d."Entering door";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[17]] = d."Pass-through";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[21]] = d."Lunar Chest";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[22]] = d."Claiming chest";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[23]] = d."Claim";
        d.lIIIIIIlIllII[d.lIIIIIIlIlllI[24]] = d."Cooking stove";
    }

    private static String lIIlIllllIllIll(String lllllllllllllllIIIlllIllIIIIIIII, String lllllllllllllllIIIlllIllIIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIllIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIlllI[23]), "DES");
            Cipher lllllllllllllllIIIlllIllIIIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIlllIllIIIIIlII.init(lIIIIIIlIlllI[18], lllllllllllllllIIIlllIllIIIIIlIl);
            return new String(lllllllllllllllIIIlllIllIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllIllIIIIIIll) {
            lllllllllllllllIIIlllIllIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllllIlIll(int n, int n2) {
        return n > n2;
    }

    private static void lIIlIlllllIIlIl() {
        lIIIIIIlIlllI = new int[25];
        d.lIIIIIIlIlllI[0] = -(139 + 13 - 11 + 53) & (0xFFFFA7FF & 0x5DFF);
        d.lIIIIIIlIlllI[1] = 0xFFFFE7BF & 0x3D7D;
        d.lIIIIIIlIlllI[2] = 0x57 ^ 0x10 ^ (0x42 ^ 0x30);
        d.lIIIIIIlIlllI[3] = 0x5E ^ 0x4D ^ (0xDF ^ 0x8E);
        d.lIIIIIIlIlllI[4] = (95 + 29 - 65 + 142 ^ 90 + 114 - 127 + 70) & (0x4B ^ 0x47 ^ (0xDD ^ 0x8B) ^ -1);
        d.lIIIIIIlIlllI[5] = -(0xFFFFE31D & 0x7CEB) & (0xFFFFF7FB & 0x6DDF);
        d.lIIIIIIlIlllI[6] = 0xFFFFAFD9 & 0x757F;
        d.lIIIIIIlIlllI[7] = 0x48 ^ 0x63;
        d.lIIIIIIlIlllI[8] = 0x27 ^ 0x54 ^ (0x7E ^ 0x27);
        d.lIIIIIIlIlllI[9] = -(0xFFFFAAFD & 0x75B7) & (0xFFFFEFFF & 0x35FF);
        d.lIIIIIIlIlllI[10] = 0xFFFFEFD6 & 0x356D;
        d.lIIIIIIlIlllI[11] = 0xFFFFFFEB & 0x2696;
        d.lIIIIIIlIlllI[12] = 1;
        d.lIIIIIIlIlllI[13] = -(0xFFFFFBFD & 0x5D1F) & (0xFFFFFFBF & 0x7FDF);
        d.lIIIIIIlIlllI[14] = 0xFFFFA6AF & 0x7FD4;
        d.lIIIIIIlIlllI[15] = 0x5D ^ 0x4B ^ (0xD9 ^ 0x89);
        d.lIIIIIIlIlllI[16] = 0x38 ^ 0x32;
        d.lIIIIIIlIlllI[17] = 0x63 ^ 0x1A ^ (0x28 ^ 0x54);
        d.lIIIIIIlIlllI[18] = 2;
        d.lIIIIIIlIlllI[19] = 3;
        d.lIIIIIIlIlllI[20] = 0x8C ^ 0x88;
        d.lIIIIIIlIlllI[21] = 3 ^ (0x67 ^ 0x62);
        d.lIIIIIIlIlllI[22] = 0x6F ^ 0x12 ^ (0x1F ^ 0x65);
        d.lIIIIIIlIlllI[23] = 0xA8 ^ 0xA0;
        d.lIIIIIIlIlllI[24] = 79 + 49 - 72 + 91 ^ 21 + 9 - 0 + 124;
    }

    private static String lIIlIllllIlllll(String lllllllllllllllIIIlllIlIllllIlIl, String lllllllllllllllIIIlllIlIllllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIlIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlllIlIllllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlllIlIllllIlll.init(lIIIIIIlIlllI[18], lllllllllllllllIIIlllIlIlllllIII);
            return new String(lllllllllllllllIIIlllIlIllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIlIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllIlIllllIllI) {
            lllllllllllllllIIIlllIlIllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllllIIlll(int n, int n2) {
        return n != n2;
    }

    private static boolean lIIlIlllllIIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIlllllIlIII(int n) {
        return n != 0;
    }

    private static boolean lIIlIlllllIlIlI(int n, int n2) {
        return n < n2;
    }
}

