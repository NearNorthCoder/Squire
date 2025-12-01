package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/a.class */
public class C0000a {
    private static /* synthetic */ String[] lIIIlIIll;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea z;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea B;
    static /* synthetic */ WorldPoint I;
    public static final /* synthetic */ WorldPoint y;
    public static final /* synthetic */ WorldArea F;
    public static /* synthetic */ WorldPoint H;
    private static /* synthetic */ int[] lIIIlIlII;
    public static final /* synthetic */ WorldArea x;
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea E;

    private static boolean lllIIlIllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllIIlIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIIlIlIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(BankLocation bankLocation) {
        if (lllIIlIIlll(Vars.getBit(lIIIlIlII[0]), lIIIlIlII[1]) && lllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lIIIlIlII[1]];
            strArr[lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[2]];
            C0006g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(lIIIlIlII[3], lIIIlIlII[4], lIIIlIlII[2]);
        WorldPoint worldPoint2 = new WorldPoint(lIIIlIlII[5], lIIIlIlII[6], lIIIlIlII[2]);
        WorldArea worldArea = new WorldArea(lIIIlIlII[7], lIIIlIlII[8], lIIIlIlII[9], lIIIlIlII[10], lIIIlIlII[2]);
        if ((!lllIIlIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlIlII[11]) || lllIIlIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllIIlIlIII(Inventory.contains(item -> {
            return item.getName().contains(lIIIlIIll[lIIIlIlII[39]]);
        }) ? 1 : 0) && lllIIlIIlll(Players.getLocal().getAnimation(), lIIIlIlII[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(lIIIlIIll[lIIIlIlII[38]]);
            }).interact(lIIIlIIll[lIIIlIlII[1]]);
            Time.sleepTicks(lIIIlIlII[13]);
            "".length();
        }
        if (lllIIlIlIII(Inventory.contains(C0005f.bf) ? 1 : 0) && lllIIlIlIIl(Equipment.contains(C0005f.bf) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bf).interact(lIIIlIIll[lIIIlIlII[14]]);
            Time.sleepTicks(lIIIlIlII[14]);
            "".length();
        }
        if (lllIIlIlIII(Inventory.contains(C0005f.aO) ? 1 : 0) && lllIIlIlIIl(Equipment.contains(C0005f.aO) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aO).interact(lIIIlIIll[lIIIlIlII[15]]);
            Time.sleepTicks(lIIIlIlII[14]);
            "".length();
        }
        if (!lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(y), lIIIlIlII[11]) || lllIIlIlIII(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(lIIIlIlII[14]);
            "".length();
            "".length();
            if (((108 ^ 83) & ((12 ^ 51) ^ (-1))) > 0) {
            }
        } else if (!lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(G), lIIIlIlII[16]) || !lllIIlIlIIl(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlIlIII(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(lIIIlIlII[14]);
            "".length();
            "".length();
            if ("  ".length() < ((29 ^ 39) & ((173 ^ 151) ^ (-1)))) {
            }
        } else if (lllIIlIlIII(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(lIIIlIlII[14]);
            "".length();
            "".length();
            if (" ".length() > "   ".length()) {
            }
        } else if (lllIIlIlIII(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0001b.J);
            "".length();
            Time.sleepTicks(lIIIlIlII[14]);
            "".length();
            "".length();
            if ((-"  ".length()) > 0) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(lIIIlIlII[17], lIIIlIlII[18], lIIIlIlII[13], lIIIlIlII[19], lIIIlIlII[2]);
            WorldArea worldArea3 = new WorldArea(lIIIlIlII[20], lIIIlIlII[21], lIIIlIlII[22], lIIIlIlII[23], lIIIlIlII[2]);
            if ((!lllIIlIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlIlIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllIIlIlIII(Inventory.contains(item3 -> {
                return item3.getName().contains(lIIIlIIll[lIIIlIlII[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(lIIIlIIll[lIIIlIlII[36]]);
                }).interact(lIIIlIIll[lIIIlIlII[24]]);
                Time.sleepTicks(lIIIlIlII[24]);
                "".length();
            }
            if (lllIIlIlIII(new WorldArea(lIIIlIlII[25], lIIIlIlII[26], lIIIlIlII[27], lIIIlIlII[13], lIIIlIlII[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[lIIIlIlII[1]];
                strArr2[lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lllIIlIlIll(nearest)) {
                    nearest.interact(lIIIlIIll[lIIIlIlII[13]]);
                    Time.sleepTicks(lIIIlIlII[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(lIIIlIlII[14]);
            "".length();
        }
    }

    private static String lllIIlIIlII(String lIIIlllllIlllIl, String lIIIlllllIlllII) {
        String str = new String(Base64.getDecoder().decode(lIIIlllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIIlllllIlllII.toCharArray();
        int lIIIlllllIllIIl = lIIIlIlII[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIlII[2];
        while (lllIIlIllIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIIIlllllIllIIl % charArray.length]));
            "".length();
            lIIIlllllIllIIl++;
            i++;
            "".length();
            if ((-" ".length()) > (((113 ^ 105) ^ (67 ^ 30)) & (((16 ^ 10) ^ (65 ^ 30)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void a(int[] iArr, int i) {
        int i2 = lIIIlIlII[2];
        while (lllIIlIllIl(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIlII[1]);
            "".length();
            i2++;
            "".length();
            if ((((154 ^ 193) ^ (17 ^ 80)) & (((106 ^ 39) ^ (114 ^ 37)) ^ (-" ".length()))) > 0) {
                return;
            }
        }
    }

    private static boolean lllIIlIlIll(Object obj) {
        return obj != null;
    }

    private static void lllIIlIIlIl() {
        lIIIlIIll = new String[lIIIlIlII[11]];
        lIIIlIIll[lIIIlIlII[2]] = lllIIlIIIlI("T3gOUzrjAyU=", "tXSHF");
        lIIIlIIll[lIIIlIlII[1]] = lllIIlIIIll("KPDhXP2A2n0=", "yvBhF");
        lIIIlIIll[lIIIlIlII[14]] = lllIIlIIIll("8l/nSigBH40=", "mSexY");
        lIIIlIIll[lIIIlIlII[15]] = lllIIlIIlII("HxYECg==", "HsexG");
        lIIIlIIll[lIIIlIlII[24]] = lllIIlIIlII("BDopGB8=", "FHLyt");
        lIIIlIIll[lIIIlIlII[19]] = lllIIlIIIlI("u4aWb8a+TfI=", "Kmcty");
        lIIIlIIll[lIIIlIlII[13]] = lllIIlIIIlI("WCxdBKxPOZs=", "SaQre");
        lIIIlIIll[lIIIlIlII[27]] = lllIIlIIlII("Ci4sOQYjJ2kJAiEmLSIEOw==", "OCIKg");
        lIIIlIIll[lIIIlIlII[29]] = lllIIlIIIll("XnVdUOOYT/I=", "sGARJ");
        lIIIlIIll[lIIIlIlII[31]] = lllIIlIIlII("CDEjMXYpOCgpIg==", "JPMZV");
        lIIIlIIll[lIIIlIlII[23]] = lllIIlIIIll("8W/+n2QHbdM=", "QvrTO");
        lIIIlIIll[lIIIlIlII[22]] = lllIIlIIIlI("LEmaHoM/kkY=", "vQHZB");
        lIIIlIIll[lIIIlIlII[32]] = lllIIlIIlII("KCgvLQ==", "jIAFv");
        lIIIlIIll[lIIIlIlII[33]] = lllIIlIIIlI("xLyC3wXr0Nk=", "vttiR");
        lIIIlIIll[lIIIlIlII[34]] = lllIIlIIIlI("miXY91jEPRgbmfALZ1nF4w==", "ZncEd");
        lIIIlIIll[lIIIlIlII[35]] = lllIIlIIIlI("qPV8aWCnZEw=", "hDirS");
        lIIIlIIll[lIIIlIlII[36]] = lllIIlIIIll("uBXLlKy715SpDFtqIknafQ==", "fBziB");
        lIIIlIIll[lIIIlIlII[37]] = lllIIlIIIlI("HRgnkcYeoFjADi308ff/VA==", "vzeGi");
        lIIIlIIll[lIIIlIlII[38]] = lllIIlIIIll("3FAqsuR9tAwpvplpgjQr2g==", "ZeCJU");
        lIIIlIIll[lIIIlIlII[39]] = lllIIlIIIlI("Lt4u1TK1XGGB1I6NC7HwCw==", "QyNhB");
    }

    private static boolean lllIIlIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lllIIlIIllI() {
        lIIIlIlII = new int[74];
        lIIIlIlII[0] = (-846) & 3021;
        lIIIlIlII[1] = " ".length();
        lIIIlIlII[2] = (57 ^ 125) & ((121 ^ 61) ^ (-1));
        lIIIlIlII[3] = (-26146) & 28597;
        lIIIlIlII[4] = (-16903) & 21375;
        lIIIlIlII[5] = (-4132) & 7083;
        lIIIlIlII[6] = (-18531) & 24303;
        lIIIlIlII[7] = (-((-4185) & 21595)) & (-12418) & 32767;
        lIIIlIlII[8] = (-((-29189) & 31309)) & (-51) & 7930;
        lIIIlIlII[9] = (((14 + 55) - (-44)) + 52) ^ (((41 + 120) - 0) + 29);
        lIIIlIlII[10] = (4 ^ 74) ^ (64 ^ 18);
        lIIIlIlII[11] = (((147 + 100) - 189) + 105) ^ (((33 + 89) - 108) + 169);
        lIIIlIlII[12] = -" ".length();
        lIIIlIlII[13] = 10 ^ 12;
        lIIIlIlII[14] = "  ".length();
        lIIIlIlII[15] = "   ".length();
        lIIIlIlII[16] = 19 ^ 59;
        lIIIlIlII[17] = (-((-15521) & 31981)) & (-12419) & 31486;
        lIIIlIlII[18] = (-16517) & 19908;
        lIIIlIlII[19] = (75 ^ 119) ^ (32 ^ 25);
        lIIIlIlII[20] = (-24804) & 27367;
        lIIIlIlII[21] = (-((-591) & 26191)) & (-4242) & 32701;
        lIIIlIlII[22] = (80 ^ 4) ^ (110 ^ 49);
        lIIIlIlII[23] = (34 ^ 85) ^ (46 ^ 83);
        lIIIlIlII[24] = 74 ^ 78;
        lIIIlIlII[25] = (-((-7279) & 32751)) & (-49) & 28671;
        lIIIlIlII[26] = (-16389) & 20309;
        lIIIlIlII[27] = (250 ^ 183) ^ (85 ^ 31);
        lIIIlIlII[28] = (22 ^ 89) ^ (201 ^ 152);
        lIIIlIlII[29] = 57 ^ 49;
        lIIIlIlII[30] = (-((-1715) & 5887)) & (-8193) & 16364;
        lIIIlIlII[31] = 149 ^ 156;
        lIIIlIlII[32] = 189 ^ 177;
        lIIIlIlII[33] = (90 ^ 18) ^ (50 ^ 119);
        lIIIlIlII[34] = 25 ^ 23;
        lIIIlIlII[35] = 115 ^ 124;
        lIIIlIlII[36] = 34 ^ 50;
        lIIIlIlII[37] = 127 ^ 110;
        lIIIlIlII[38] = (65 ^ 116) ^ (177 ^ 150);
        lIIIlIlII[39] = 79 ^ 92;
        lIIIlIlII[40] = (-697) & 3839;
        lIIIlIlII[41] = (-((-18759) & 31599)) & (-3) & 16315;
        lIIIlIlII[42] = 122 ^ 83;
        lIIIlIlII[43] = 5 ^ 34;
        lIIIlIlII[44] = (-((-11622) & 28023)) & (-8489) & 28093;
        lIIIlIlII[45] = (-21129) & 24493;
        lIIIlIlII[46] = (-((-7685) & 32389)) & (-4101) & 31711;
        lIIIlIlII[47] = (-((-1049) & 14206)) & (-16401) & 32767;
        lIIIlIlII[48] = 74 ^ 35;
        lIIIlIlII[49] = (-24580) & 27775;
        lIIIlIlII[50] = (-(48 ^ 122)) & (-28673) & 32111;
        lIIIlIlII[51] = 56 ^ 27;
        lIIIlIlII[52] = (((18 + 103) - 47) + 68) ^ (((146 + 27) - 6) + 13);
        lIIIlIlII[53] = (-((-817) & 29553)) & (-131) & 31991;
        lIIIlIlII[54] = (-((-9411) & 13783)) & (-193) & 8183;
        lIIIlIlII[55] = (-((-2570) & 23467)) & (-8193) & 32703;
        lIIIlIlII[56] = (-16898) & 20315;
        lIIIlIlII[57] = 32 ^ 124;
        lIIIlIlII[58] = 144 ^ 181;
        lIIIlIlII[59] = (-((-681) & 21485)) & (-8321) & 32254;
        lIIIlIlII[60] = (-24705) & 28145;
        lIIIlIlII[61] = (227 ^ 176) ^ (36 ^ 70);
        lIIIlIlII[62] = 61 ^ 121;
        lIIIlIlII[63] = (-((-8206) & 31023)) & (-129) & 24575;
        lIIIlIlII[64] = (-((-6260) & 22651)) & (-25) & 20351;
        lIIIlIlII[65] = (-4867) & 8175;
        lIIIlIlII[66] = (((96 + 87) - 33) + 13) ^ (((139 + 110) - 172) + 65);
        lIIIlIlII[67] = " ".length() ^ (115 ^ 86);
        lIIIlIlII[68] = (-8193) & 11167;
        lIIIlIlII[69] = (-28946) & 32187;
        lIIIlIlII[70] = (-((-3667) & 16215)) & (-16385) & 30654;
        lIIIlIlII[71] = (-8279) & 11743;
        lIIIlIlII[72] = (-((-22409) & 30604)) & (-20489) & 31727;
        lIIIlIlII[73] = (-18433) & 23405;
    }

    private static String lllIIlIIIlI(String lIIIlllllIIlIII, String lIIIlllllIIIlll) {
        try {
            SecretKeySpec lIIIlllllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlllllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlllllIIlIlI = Cipher.getInstance("Blowfish");
            lIIIlllllIIlIlI.init(lIIIlIlII[14], lIIIlllllIIlIll);
            return new String(lIIIlllllIIlIlI.doFinal(Base64.getDecoder().decode(lIIIlllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlllllIIlIIl) {
            lIIIlllllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIlIIIll(String lIIIllllIlllIll, String lIIIllllIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllllIlllIlI.getBytes(StandardCharsets.UTF_8)), lIIIlIlII[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIlII[14], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIllllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllllIllllII) {
            lIIIllllIllllII.printStackTrace();
            return null;
        }
    }

    public static void b(int[] iArr, int i) {
        int i2 = lIIIlIlII[2];
        while (lllIIlIllIl(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIlII[1]);
            "".length();
            int[] iArr2 = new int[lIIIlIlII[1]];
            iArr2[lIIIlIlII[2]] = iArr[i2];
            if (lllIIlIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            }
            i2++;
            "".length();
            if ((131 ^ 135) < 0) {
                return;
            }
        }
    }

    static {
        lllIIlIIllI();
        lllIIlIIlIl();
        x = new WorldArea(lIIIlIlII[40], lIIIlIlII[41], lIIIlIlII[42], lIIIlIlII[43], lIIIlIlII[2]);
        y = new WorldPoint(lIIIlIlII[44], lIIIlIlII[45], lIIIlIlII[2]);
        z = new WorldArea(lIIIlIlII[46], lIIIlIlII[47], lIIIlIlII[48], lIIIlIlII[48], lIIIlIlII[2]);
        A = new WorldArea(lIIIlIlII[49], lIIIlIlII[50], lIIIlIlII[51], lIIIlIlII[52], lIIIlIlII[2]);
        B = new WorldArea(lIIIlIlII[53], lIIIlIlII[54], lIIIlIlII[38], lIIIlIlII[11], lIIIlIlII[2]);
        C = new WorldArea(lIIIlIlII[55], lIIIlIlII[56], lIIIlIlII[57], lIIIlIlII[58], lIIIlIlII[2]);
        D = new WorldArea(lIIIlIlII[59], lIIIlIlII[60], lIIIlIlII[61], lIIIlIlII[62], lIIIlIlII[2]);
        E = new WorldArea(lIIIlIlII[63], lIIIlIlII[64], lIIIlIlII[35], lIIIlIlII[36], lIIIlIlII[2]);
        F = new WorldArea(lIIIlIlII[7], lIIIlIlII[65], lIIIlIlII[66], lIIIlIlII[67], lIIIlIlII[2]);
        G = new WorldPoint(lIIIlIlII[68], lIIIlIlII[69], lIIIlIlII[2]);
        H = new WorldPoint(lIIIlIlII[70], lIIIlIlII[71], lIIIlIlII[2]);
        I = new WorldPoint(lIIIlIlII[72], lIIIlIlII[73], lIIIlIlII[1]);
    }

    public static void a(int[] iArr) {
        int lIIIllllllllIII = lIIIlIlII[2];
        while (lllIIlIllIl(lIIIllllllllIII, iArr.length)) {
            Bank.withdraw(iArr[lIIIllllllllIII], lIIIlIlII[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIlII[1]);
            "".length();
            lIIIllllllllIII++;
            "".length();
            if ((-" ".length()) >= ((239 ^ 178) & ((124 ^ 33) ^ (-1)))) {
                return;
            }
        }
    }

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(lIIIlIlII[1]);
        "".length();
    }

    public static void a() {
        if (lllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIlII[28])) {
            String[] strArr = new String[lIIIlIlII[1]];
            strArr[lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[27]];
            NPCs.getNearest(strArr).interact(lIIIlIIll[lIIIlIlII[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIIIlIlII[30]);
            "".length();
        }
        if (!lllIIlIlIIl(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlIlIII(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(lIIIlIlII[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIIIlIlII[30]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else if (lllIIlIlIIl(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIlIlIIl(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIlIlIIl(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIlIlIIl(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIlIlIIl(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(H), lIIIlIlII[11])) {
            if (lllIIlIlIIl(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIlII[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[lIIIlIlII[1]];
                strArr2[lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (lllIIlIlIll(nearest)) {
                    nearest.interact(lIIIlIIll[lIIIlIlII[35]]);
                    Time.sleepTicks(lIIIlIlII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIlIlII[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[lIIIlIlII[1]];
            strArr3[lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (lllIIlIlIll(nearest2)) {
                String[] strArr4 = new String[lIIIlIlII[1]];
                strArr4[lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[23]];
                if (lllIIlIlIII(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(lIIIlIIll[lIIIlIlII[22]]);
                    Time.sleepTicks(lIIIlIlII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIlIlII[30]);
                    "".length();
                }
                String[] strArr5 = new String[lIIIlIlII[1]];
                strArr5[lIIIlIlII[2]] = lIIIlIIll[lIIIlIlII[32]];
                if (lllIIlIlIII(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(lIIIlIIll[lIIIlIlII[33]]);
                    Time.sleepTicks(lIIIlIlII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIlIlII[30]);
                    "".length();
                }
            }
            "".length();
            if ("  ".length() <= (-" ".length())) {
            }
        }
    }

    private static boolean lllIIlIlIII(int i) {
        return i != 0;
    }

    private static boolean lllIIlIlIIl(int i) {
        return i == 0;
    }

    public static void a(int i, int i2) {
        int[] iArr = new int[lIIIlIlII[1]];
        iArr[lIIIlIlII[2]] = i;
        if (lllIIlIlIIl(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i + " item id");
        }
        int[] iArr2 = new int[lIIIlIlII[1]];
        iArr2[lIIIlIlII[2]] = i;
        if (lllIIlIlIII(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i, i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIlII[1]);
            "".length();
        }
    }
}
