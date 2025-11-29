package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

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
@TaskDesc(name = "Claim chest")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.d  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/d.class */
public class d extends Task {
    private static /* synthetic */ String[] lIIIIIIlIllII;
    private static /* synthetic */ int[] lIIIIIIlIlllI;
    final /* synthetic */ WorldArea J = new WorldArea(lIIIIIIlIlllI[0], lIIIIIIlIlllI[1], lIIIIIIlIlllI[2], lIIIIIIlIlllI[3], lIIIIIIlIlllI[4]);
    final /* synthetic */ WorldArea K = new WorldArea(lIIIIIIlIlllI[5], lIIIIIIlIlllI[6], lIIIIIIlIlllI[7], lIIIIIIlIlllI[8], lIIIIIIlIlllI[4]);
    final /* synthetic */ WorldPoint L = new WorldPoint(lIIIIIIlIlllI[9], lIIIIIIlIlllI[10], lIIIIIIlIlllI[4]);

    private static String lIIlIllllIlllII(String lllllllllllllllIIIlllIlIlllIIlIl, String lllllllllllllllIIIlllIlIlllIIlII) {
        String lllllllllllllllIIIlllIlIlllIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIlIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIlllIlIlllIIlII.toCharArray();
        int lllllllllllllllIIIlllIlIlllIIIIl = lIIIIIIlIlllI[4];
        char[] charArray2 = lllllllllllllllIIIlllIlIlllIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIlIlllI[4];
        while (lIIlIlllllIlIlI(i, length)) {
            char lllllllllllllllIIIlllIlIlllIIllI = charArray2[i];
            sb.append((char) (lllllllllllllllIIIlllIlIlllIIllI ^ charArray[lllllllllllllllIIIlllIlIlllIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIIlllIlIlllIIIIl++;
            i++;
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    public boolean run() {
        if (lIIlIlllllIIllI(Vars.getBit(lIIIIIIlIlllI[11]), lIIIIIIlIlllI[12]) && lIIlIlllllIIllI(Vars.getBit(lIIIIIIlIlllI[13]), lIIIIIIlIlllI[12]) && !lIIlIlllllIIlll(Vars.getBit(lIIIIIIlIlllI[14]), lIIIIIIlIlllI[12])) {
            if (lIIlIlllllIlIII(this.J.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIIlIlllllIlIII(tileObject.getName().contains(lIIIIIIlIllII[lIIIIIIlIlllI[24]]) ? 1 : 0) && lIIlIlllllIllII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIlllI[17])) {
                        ?? r0 = lIIIIIIlIlllI[12];
                        "".length();
                        return (-((((63 + 46) - 14) + 47) ^ (((109 + 130) - 106) + 6))) >= 0 ? ((84 ^ 64) ^ (63 ^ 18)) & (((((63 + 109) - 80) + 69) ^ (((110 + 21) - (-4)) + 17)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlIlllI[4];
                });
                if (lIIlIlllllIlIIl(nearest) && lIIlIlllllIlIlI(Movement.getRunEnergy(), lIIIIIIlIlllI[15])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[4]];
                    nearest.interact(lIIIIIIlIllII[lIIIIIIlIlllI[12]]);
                    return lIIIIIIlIlllI[12];
                } else if (lIIlIlllllIlIll(Players.getLocal().getWorldLocation().distanceTo(this.L), lIIIIIIlIlllI[16]) && (!lIIlIlllllIlIlI(Movement.getRunEnergy(), lIIIIIIlIlllI[15]) || !lIIlIlllllIlIIl(nearest) || (lIIlIlllllIlIIl(nearest) && lIIlIlllllIlIll(Players.getLocal().getWorldLocation().distanceTo(nearest.getWorldLocation()), lIIIIIIlIlllI[17])))) {
                    SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[18]];
                    Movement.walkTo(this.L);
                    "".length();
                    return lIIIIIIlIlllI[12];
                } else if (lIIlIlllllIllII(Players.getLocal().getWorldLocation().distanceTo(this.L), lIIIIIIlIlllI[16])) {
                    String[] strArr = new String[lIIIIIIlIlllI[12]];
                    strArr[lIIIIIIlIlllI[4]] = lIIIIIIlIllII[lIIIIIIlIlllI[19]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (lIIlIlllllIlIIl(nearest2)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[20]];
                        nearest2.interact(lIIIIIIlIllII[lIIIIIIlIlllI[17]]);
                        return lIIIIIIlIlllI[12];
                    }
                }
            }
            if (lIIlIlllllIlIII(this.K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[lIIIIIIlIlllI[12]];
                strArr2[lIIIIIIlIlllI[4]] = lIIIIIIlIllII[lIIIIIIlIlllI[21]];
                TileObject nearest3 = TileObjects.getNearest(strArr2);
                if (lIIlIlllllIlIIl(nearest3)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIllII[lIIIIIIlIlllI[22]];
                    nearest3.interact(lIIIIIIlIllII[lIIIIIIlIlllI[23]]);
                    return lIIIIIIlIlllI[12];
                }
            }
            return lIIIIIIlIlllI[4];
        }
        return lIIIIIIlIlllI[4];
    }

    private static boolean lIIlIlllllIllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIlllllIlIIl(Object obj) {
        return obj != null;
    }

    static {
        lIIlIlllllIIlIl();
        lIIlIlllllIIlII();
    }

    private static void lIIlIlllllIIlII() {
        lIIIIIIlIllII = new String[lIIIIIIlIlllI[16]];
        lIIIIIIlIllII[lIIIIIIlIlllI[4]] = lIIlIllllIllIll("vYz10+TNot8nvm7w37fm/g==", "KGszy");
        lIIIIIIlIllII[lIIIIIIlIlllI[12]] = lIIlIllllIlllII("Bw0HEVUpGRwEGQ==", "Jlltx");
        lIIIIIIlIllII[lIIIIIIlIlllI[18]] = lIIlIllllIllIll("VTEU/WY8Y1qGDbivc7Ypmw==", "MHBBn");
        lIIIIIIlIllII[lIIIIIIlIlllI[19]] = lIIlIllllIlllII("ABQuIDUrGT8=", "EzZRT");
        lIIIIIIlIllII[lIIIIIIlIlllI[20]] = lIIlIllllIlllII("AzwdIwcvPA5mESk9Gw==", "FRiFu");
        lIIIIIIlIllII[lIIIIIIlIlllI[17]] = lIIlIllllIlllII("CDAmGUQsOScFHD85", "XQUji");
        lIIIIIIlIllII[lIIIIIIlIlllI[21]] = lIIlIllllIlllll("SZ2HIuL3giYaexsLGBE18w==", "acAWf");
        lIIIIIIlIllII[lIIIIIIlIlllI[22]] = lIIlIllllIlllII("AQ8DDAorDQVFBCoGERE=", "Bcbeg");
        lIIIIIIlIllII[lIIIIIIlIlllI[23]] = lIIlIllllIllIll("4+7J6F6cIXY=", "bxaDm");
        lIIIIIIlIllII[lIIIIIIlIlllI[24]] = lIIlIllllIlllll("SDlIk3ECWpJFXlKZd17scA==", "LBsYt");
    }

    private static String lIIlIllllIllIll(String lllllllllllllllIIIlllIllIIIIIIlI, String lllllllllllllllIIIlllIlIllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIlIllllllll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIlllI[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlIlllI[18], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllIllIIIIIIll) {
            lllllllllllllllIIIlllIllIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllllIlIll(int i, int i2) {
        return i > i2;
    }

    private static void lIIlIlllllIIlIl() {
        lIIIIIIlIlllI = new int[25];
        lIIIIIIlIlllI[0] = (-(((139 + 13) - 11) + 53)) & (-22529) & 24063;
        lIIIIIIlIlllI[1] = (-6209) & 15741;
        lIIIIIIlIlllI[2] = (87 ^ 16) ^ (66 ^ 48);
        lIIIIIIlIlllI[3] = (94 ^ 77) ^ (223 ^ 142);
        lIIIIIIlIlllI[4] = ((((95 + 29) - 65) + 142) ^ (((90 + 114) - 127) + 70)) & (((75 ^ 71) ^ (221 ^ 139)) ^ (-" ".length()));
        lIIIIIIlIlllI[5] = (-((-7395) & 31979)) & (-2053) & 28127;
        lIIIIIIlIlllI[6] = (-20519) & 30079;
        lIIIIIIlIlllI[7] = 72 ^ 99;
        lIIIIIIlIlllI[8] = (39 ^ 84) ^ (126 ^ 39);
        lIIIIIIlIlllI[9] = (-((-21763) & 30135)) & (-4097) & 13823;
        lIIIIIIlIlllI[10] = (-4138) & 13677;
        lIIIIIIlIlllI[11] = (-21) & 9878;
        lIIIIIIlIlllI[12] = " ".length();
        lIIIIIIlIlllI[13] = (-((-1027) & 23839)) & (-65) & 32735;
        lIIIIIIlIlllI[14] = (-22865) & 32724;
        lIIIIIIlIlllI[15] = (93 ^ 75) ^ (217 ^ 137);
        lIIIIIIlIlllI[16] = 56 ^ 50;
        lIIIIIIlIlllI[17] = (99 ^ 26) ^ (40 ^ 84);
        lIIIIIIlIlllI[18] = "  ".length();
        lIIIIIIlIlllI[19] = "   ".length();
        lIIIIIIlIlllI[20] = 140 ^ 136;
        lIIIIIIlIlllI[21] = "   ".length() ^ (103 ^ 98);
        lIIIIIIlIlllI[22] = (111 ^ 18) ^ (31 ^ 101);
        lIIIIIIlIlllI[23] = 168 ^ 160;
        lIIIIIIlIlllI[24] = (((79 + 49) - 72) + 91) ^ (((21 + 9) - 0) + 124);
    }

    private static String lIIlIllllIlllll(String lllllllllllllllIIIlllIlIllllIlIl, String lllllllllllllllIIIlllIlIllllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIlIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIlIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlllIlIllllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlllIlIllllIlll.init(lIIIIIIlIlllI[18], lllllllllllllllIIIlllIlIlllllIII);
            return new String(lllllllllllllllIIIlllIlIllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIlIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllIlIllllIllI) {
            lllllllllllllllIIIlllIlIllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllllIIlll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIlllllIIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIlllllIlIII(int i) {
        return i != 0;
    }

    private static boolean lIIlIlllllIlIlI(int i, int i2) {
        return i < i2;
    }
}
