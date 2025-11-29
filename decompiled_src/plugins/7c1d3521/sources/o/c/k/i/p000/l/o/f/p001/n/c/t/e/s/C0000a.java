package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/a.class */
public class C0000a {
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea B;
    static /* synthetic */ WorldPoint H;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea E;
    private static /* synthetic */ String[] llIlIIIIII;
    public static final /* synthetic */ WorldPoint x;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ WorldArea w;
    public static final /* synthetic */ WorldArea y;
    private static /* synthetic */ int[] llIlIIIIlI;
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea A;

    private static boolean lIllIIIIIIIll(int i) {
        return i == 0;
    }

    public static void a(int[] iArr) {
        int i = llIlIIIIlI[2];
        while (lIllIIIIIIlll(i, iArr.length)) {
            Bank.withdraw(iArr[i], llIlIIIIlI[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIIIlI[1]);
            "".length();
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return;
            }
        }
    }

    static {
        lIllIIIIIIIII();
        lIlIlllllllll();
        w = new WorldArea(llIlIIIIlI[40], llIlIIIIlI[41], llIlIIIIlI[42], llIlIIIIlI[43], llIlIIIIlI[2]);
        x = new WorldPoint(llIlIIIIlI[44], llIlIIIIlI[45], llIlIIIIlI[2]);
        y = new WorldArea(llIlIIIIlI[46], llIlIIIIlI[47], llIlIIIIlI[48], llIlIIIIlI[48], llIlIIIIlI[2]);
        z = new WorldArea(llIlIIIIlI[49], llIlIIIIlI[50], llIlIIIIlI[51], llIlIIIIlI[52], llIlIIIIlI[2]);
        A = new WorldArea(llIlIIIIlI[53], llIlIIIIlI[54], llIlIIIIlI[38], llIlIIIIlI[11], llIlIIIIlI[2]);
        B = new WorldArea(llIlIIIIlI[55], llIlIIIIlI[56], llIlIIIIlI[57], llIlIIIIlI[58], llIlIIIIlI[2]);
        C = new WorldArea(llIlIIIIlI[59], llIlIIIIlI[60], llIlIIIIlI[61], llIlIIIIlI[62], llIlIIIIlI[2]);
        D = new WorldArea(llIlIIIIlI[63], llIlIIIIlI[64], llIlIIIIlI[35], llIlIIIIlI[36], llIlIIIIlI[2]);
        E = new WorldArea(llIlIIIIlI[7], llIlIIIIlI[65], llIlIIIIlI[66], llIlIIIIlI[67], llIlIIIIlI[2]);
        F = new WorldPoint(llIlIIIIlI[68], llIlIIIIlI[69], llIlIIIIlI[2]);
        G = new WorldPoint(llIlIIIIlI[70], llIlIIIIlI[71], llIlIIIIlI[2]);
        H = new WorldPoint(llIlIIIIlI[72], llIlIIIIlI[73], llIlIIIIlI[1]);
    }

    private static boolean lIllIIIIIIllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIllllllIlI(String llllllllllllllllllIIlIlIIIIlllII, String llllllllllllllllllIIlIlIIIIllIll) {
        String llllllllllllllllllIIlIlIIIIlllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIlIlIIIIllIll.toCharArray();
        int llllllllllllllllllIIlIlIIIIllIII = llIlIIIIlI[2];
        char[] charArray2 = llllllllllllllllllIIlIlIIIIlllII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIIlI[2];
        while (lIllIIIIIIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIlIlIIIIllIII % charArray.length]));
            "".length();
            llllllllllllllllllIIlIlIIIIllIII++;
            i++;
            "".length();
            if (((128 ^ 181) & ((139 ^ 190) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void b(int[] iArr, int i) {
        int i2 = llIlIIIIlI[2];
        while (lIllIIIIIIlll(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIIIlI[1]);
            "".length();
            int[] iArr2 = new int[llIlIIIIlI[1]];
            iArr2[llIlIIIIlI[2]] = iArr[i2];
            if (lIllIIIIIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            }
            i2++;
            "".length();
            if ((-" ".length()) > (155 ^ 159)) {
                return;
            }
        }
    }

    public static void a(int[] iArr, int i) {
        int i2 = llIlIIIIlI[2];
        while (lIllIIIIIIlll(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIIIlI[1]);
            "".length();
            i2++;
            "".length();
            if ((((171 ^ 160) ^ ((69 ^ 114) & ((81 ^ 102) ^ (-1)))) & (((214 ^ 144) ^ (95 ^ 18)) ^ (-" ".length()))) == "   ".length()) {
                return;
            }
        }
    }

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(llIlIIIIlI[1]);
        "".length();
    }

    public static void a() {
        if (lIllIIIIIIllI(Players.getLocal().getWorldLocation().distanceTo(H), llIlIIIIlI[28])) {
            String[] strArr = new String[llIlIIIIlI[1]];
            strArr[llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[27]];
            NPCs.getNearest(strArr).interact(llIlIIIIII[llIlIIIIlI[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llIlIIIIlI[30]);
            "".length();
        }
        if (!lIllIIIIIIIll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIIIIIIIlI(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(llIlIIIIlI[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llIlIIIIlI[30]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else if (lIllIIIIIIIll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIIIIIll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIIIIIll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIIIIIll(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIIIIIll(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIllIIIIIIllI(Players.getLocal().getWorldLocation().distanceTo(G), llIlIIIIlI[11])) {
            if (lIllIIIIIIIll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(H), llIlIIIIlI[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[llIlIIIIlI[1]];
                strArr2[llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (lIllIIIIIIlIl(nearest)) {
                    nearest.interact(llIlIIIIII[llIlIIIIlI[35]]);
                    Time.sleepTicks(llIlIIIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIIIIlI[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[llIlIIIIlI[1]];
            strArr3[llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (lIllIIIIIIlIl(nearest2)) {
                String[] strArr4 = new String[llIlIIIIlI[1]];
                strArr4[llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[23]];
                if (lIllIIIIIIIlI(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(llIlIIIIII[llIlIIIIlI[22]]);
                    Time.sleepTicks(llIlIIIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIIIIlI[30]);
                    "".length();
                }
                String[] strArr5 = new String[llIlIIIIlI[1]];
                strArr5[llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[32]];
                if (lIllIIIIIIIlI(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(llIlIIIIII[llIlIIIIlI[33]]);
                    Time.sleepTicks(llIlIIIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIIIIlI[30]);
                    "".length();
                }
            }
            "".length();
            if ("   ".length() > "   ".length()) {
            }
        }
    }

    private static void lIllIIIIIIIII() {
        llIlIIIIlI = new int[74];
        llIlIIIIlI[0] = (-((-3271) & 32479)) & (-293) & 31676;
        llIlIIIIlI[1] = " ".length();
        llIlIIIIlI[2] = (145 ^ 170) & ((0 ^ 59) ^ (-1));
        llIlIIIIlI[3] = (-((-10387) & 14491)) & (-67) & 6622;
        llIlIIIIlI[4] = (-((-20569) & 29401)) & (-3079) & 16383;
        llIlIIIIlI[5] = (-119) & 3070;
        llIlIIIIlI[6] = (-((-9445) & 28151)) & (-65) & 24543;
        llIlIIIIlI[7] = (-((-6229) & 30805)) & (-4226) & 31741;
        llIlIIIIlI[8] = (-78) & 5837;
        llIlIIIIlI[9] = 1 ^ 26;
        llIlIIIIlI[10] = (90 ^ 104) ^ (166 ^ 136);
        llIlIIIIlI[11] = (6 ^ 113) ^ (61 ^ 94);
        llIlIIIIlI[12] = -" ".length();
        llIlIIIIlI[13] = (176 ^ 132) ^ (59 ^ 9);
        llIlIIIIlI[14] = "  ".length();
        llIlIIIIlI[15] = "   ".length();
        llIlIIIIlI[16] = 71 ^ 111;
        llIlIIIIlI[17] = (-((-1025) & 30159)) & (-1) & 31742;
        llIlIIIIlI[18] = (-((-17) & 12863)) & (-16401) & 32638;
        llIlIIIIlI[19] = 14 ^ 11;
        llIlIIIIlI[20] = (-17747) & 20310;
        llIlIIIIlI[21] = (-((-27465) & 31691)) & (-25602) & 32687;
        llIlIIIIlI[22] = (136 ^ 169) ^ (131 ^ 169);
        llIlIIIIlI[23] = 1 ^ 11;
        llIlIIIIlI[24] = 71 ^ 67;
        llIlIIIIlI[25] = (-16817) & 19967;
        llIlIIIIlI[26] = (-161) & 4081;
        llIlIIIIlI[27] = 149 ^ 146;
        llIlIIIIlI[28] = 53 ^ 43;
        llIlIIIIlI[29] = 175 ^ 167;
        llIlIIIIlI[30] = (-16410) & 20409;
        llIlIIIIlI[31] = (((10 + 75) - 44) + 101) ^ (((36 + 1) - (-83)) + 15);
        llIlIIIIlI[32] = (76 ^ 91) ^ (97 ^ 122);
        llIlIIIIlI[33] = 32 ^ 45;
        llIlIIIIlI[34] = 165 ^ 171;
        llIlIIIIlI[35] = 161 ^ 174;
        llIlIIIIlI[36] = (((148 + 76) - 88) + 50) ^ (((89 + 150) - 83) + 14);
        llIlIIIIlI[37] = 11 ^ 26;
        llIlIIIIlI[38] = (178 ^ 134) ^ (40 ^ 14);
        llIlIIIIlI[39] = 14 ^ 29;
        llIlIIIIlI[40] = (-((-3591) & 32703)) & (-1) & 32255;
        llIlIIIIlI[41] = (-((-17843) & 22527)) & (-24579) & 32735;
        llIlIIIIlI[42] = (38 ^ 53) ^ (111 ^ 85);
        llIlIIIIlI[43] = "   ".length() ^ (20 ^ 48);
        llIlIIIIlI[44] = (-4204) & 7407;
        llIlIIIIlI[45] = (-8339) & 11703;
        llIlIIIIlI[46] = (-(97 ^ 100)) & (-1025) & 3935;
        llIlIIIIlI[47] = (-4866) & 8075;
        llIlIIIIlI[48] = 232 ^ 129;
        llIlIIIIlI[49] = (-((-2938) & 23547)) & (-8963) & 32767;
        llIlIIIIlI[50] = (-(163 ^ 170)) & (-25153) & 28526;
        llIlIIIIlI[51] = (87 ^ 71) ^ (17 ^ 34);
        llIlIIIIlI[52] = (121 ^ 84) ^ (84 ^ 67);
        llIlIIIIlI[53] = (-29193) & 32317;
        llIlIIIIlI[54] = (-(((6 + 126) - 55) + 64)) & (-24833) & 28591;
        llIlIIIIlI[55] = (-12513) & 16126;
        llIlIIIIlI[56] = (-8197) & 11614;
        llIlIIIIlI[57] = 112 ^ 44;
        llIlIIIIlI[58] = 141 ^ 168;
        llIlIIIIlI[59] = (-24705) & 27834;
        llIlIIIIlI[60] = (-4233) & 7673;
        llIlIIIIlI[61] = (71 ^ 72) ^ (159 ^ 161);
        llIlIIIIlI[62] = (29 ^ 34) ^ (52 ^ 79);
        llIlIIIIlI[63] = (-((-3205) & 32165)) & (-2049) & 32638;
        llIlIIIIlI[64] = (-20623) & 24558;
        llIlIIIIlI[65] = (-((-3205) & 24455)) & (-8209) & 32767;
        llIlIIIIlI[66] = 141 ^ 160;
        llIlIIIIlI[67] = (33 ^ 112) ^ (99 ^ 22);
        llIlIIIIlI[68] = (-12385) & 15359;
        llIlIIIIlI[69] = (-((-6157) & 31566)) & (-17) & 28667;
        llIlIIIIlI[70] = (-22786) & 24507;
        llIlIIIIlI[71] = (-517) & 3981;
        llIlIIIIlI[72] = (-((-2849) & 31532)) & (-1) & 31727;
        llIlIIIIlI[73] = (-((-6181) & 14391)) & (-2177) & 15359;
    }

    private static boolean lIllIIIIIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIIIIlII(int i, int i2) {
        return i > i2;
    }

    private static String lIlIllllllIll(String llllllllllllllllllIIlIIllllllIlI, String llllllllllllllllllIIlIIllllllIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIlllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIIlllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIIlllllllII.init(llIlIIIIlI[14], llllllllllllllllllIIlIIlllllllIl);
            return new String(llllllllllllllllllIIlIIlllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIlllllIllI) {
            llllllllllllllllllIIlIIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllllllll() {
        llIlIIIIII = new String[llIlIIIIlI[11]];
        llIlIIIIII[llIlIIIIlI[2]] = lIlIllllllIIl("rN6ScatqMm8=", "wXoLl");
        llIlIIIIII[llIlIIIIlI[1]] = lIlIllllllIIl("y30C3f9RWr8=", "LwIBF");
        llIlIIIIII[llIlIIIIlI[14]] = lIlIllllllIlI("HSgQBQ==", "JMqwt");
        llIlIIIIII[llIlIIIIlI[15]] = lIlIllllllIll("zYLaAytXCCo=", "Hbxfn");
        llIlIIIIII[llIlIIIIlI[24]] = lIlIllllllIlI("EgQgBDM=", "PvEeX");
        llIlIIIIII[llIlIIIIlI[19]] = lIlIllllllIIl("ggPhSMLHRQQ=", "UBsYc");
        llIlIIIIII[llIlIIIIlI[13]] = lIlIllllllIll("WZ11uzyWq7g=", "mmSKK");
        llIlIIIIII[llIlIIIIlI[27]] = lIlIllllllIll("8gO6Nor98Q2Mj+npx3QVtgL4moGckPPf", "QQBHv");
        llIlIIIIII[llIlIIIIlI[29]] = lIlIllllllIll("pwfO+lldTzI=", "PmPvn");
        llIlIIIIII[llIlIIIIlI[31]] = lIlIllllllIll("iyvwj78Ph2kbfGnndR8WdA==", "FWJWU");
        llIlIIIIII[llIlIIIIlI[23]] = lIlIllllllIlI("NCYy", "aUWgZ");
        llIlIIIIII[llIlIIIIlI[22]] = lIlIllllllIlI("DwUr", "ZvNbK");
        llIlIIIIII[llIlIIIIlI[32]] = lIlIllllllIlI("FyUXCg==", "UDyag");
        llIlIIIIII[llIlIIIIlI[33]] = lIlIllllllIll("VvP9M5wZVvo=", "ihyid");
        llIlIIIIII[llIlIIIIlI[34]] = lIlIllllllIlI("MDIHOlYQPAYlHg==", "rSiQv");
        llIlIIIIII[llIlIIIIlI[35]] = lIlIllllllIlI("IwsHOQ==", "ajiRj");
        llIlIIIIII[llIlIIIIlI[36]] = lIlIllllllIIl("Z29NmPk7DoT6gAewBYF/Tw==", "efkPd");
        llIlIIIIII[llIlIIIIlI[37]] = lIlIllllllIll("HnIsF3AekdEVz527wr27Qw==", "iytpz");
        llIlIIIIII[llIlIIIIlI[38]] = lIlIllllllIll("5i5thGe837GEQFLutwS24Q==", "jzjra");
        llIlIIIIII[llIlIIIIlI[39]] = lIlIllllllIlI("MycGFjcoMB4=", "GBjsG");
    }

    private static String lIlIllllllIIl(String llllllllllllllllllIIlIlIIIIIIlll, String llllllllllllllllllIIlIlIIIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), llIlIIIIlI[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIIlI[14], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIlIIIIIlIII) {
            llllllllllllllllllIIlIlIIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIIIlI(int i) {
        return i != 0;
    }

    public static void a(int i, int i2) {
        int[] iArr = new int[llIlIIIIlI[1]];
        iArr[llIlIIIIlI[2]] = i;
        if (lIllIIIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i + " item id");
        }
        int[] iArr2 = new int[llIlIIIIlI[1]];
        iArr2[llIlIIIIlI[2]] = i;
        if (lIllIIIIIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i, i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIIIlI[1]);
            "".length();
        }
    }

    public static void a(BankLocation bankLocation) {
        if (lIllIIIIIIIIl(Vars.getBit(llIlIIIIlI[0]), llIlIIIIlI[1]) && lIllIIIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[llIlIIIIlI[1]];
            strArr[llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[2]];
            C0020g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(llIlIIIIlI[3], llIlIIIIlI[4], llIlIIIIlI[2]);
        WorldPoint worldPoint2 = new WorldPoint(llIlIIIIlI[5], llIlIIIIlI[6], llIlIIIIlI[2]);
        WorldArea worldArea = new WorldArea(llIlIIIIlI[7], llIlIIIIlI[8], llIlIIIIlI[9], llIlIIIIlI[10], llIlIIIIlI[2]);
        if ((!lIllIIIIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIlIIIIlI[11]) || lIllIIIIIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIllIIIIIIIlI(Inventory.contains(item -> {
            return item.getName().contains(llIlIIIIII[llIlIIIIlI[39]]);
        }) ? 1 : 0) && lIllIIIIIIIIl(Players.getLocal().getAnimation(), llIlIIIIlI[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(llIlIIIIII[llIlIIIIlI[38]]);
            }).interact(llIlIIIIII[llIlIIIIlI[1]]);
            Time.sleepTicks(llIlIIIIlI[13]);
            "".length();
        }
        if (lIllIIIIIIIlI(Inventory.contains(C0019f.bk) ? 1 : 0) && lIllIIIIIIIll(Equipment.contains(C0019f.bk) ? 1 : 0)) {
            Inventory.getFirst(C0019f.bk).interact(llIlIIIIII[llIlIIIIlI[14]]);
            Time.sleepTicks(llIlIIIIlI[14]);
            "".length();
        }
        if (lIllIIIIIIIlI(Inventory.contains(C0019f.aT) ? 1 : 0) && lIllIIIIIIIll(Equipment.contains(C0019f.aT) ? 1 : 0)) {
            Inventory.getFirst(C0019f.aT).interact(llIlIIIIII[llIlIIIIlI[15]]);
            Time.sleepTicks(llIlIIIIlI[14]);
            "".length();
        }
        if (!lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(x), llIlIIIIlI[11]) || lIllIIIIIIIlI(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(llIlIIIIlI[14]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else if (!lIllIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(F), llIlIIIIlI[16]) || !lIllIIIIIIIll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIIIIIIIlI(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(llIlIIIIlI[14]);
            "".length();
            "".length();
            if ("  ".length() >= "   ".length()) {
            }
        } else if (lIllIIIIIIIlI(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(llIlIIIIlI[14]);
            "".length();
            "".length();
            if (" ".length() == 0) {
            }
        } else if (lIllIIIIIIIlI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0015b.I);
            "".length();
            Time.sleepTicks(llIlIIIIlI[14]);
            "".length();
            "".length();
            if ((118 ^ 114) > (198 ^ 194)) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(llIlIIIIlI[17], llIlIIIIlI[18], llIlIIIIlI[13], llIlIIIIlI[19], llIlIIIIlI[2]);
            WorldArea worldArea3 = new WorldArea(llIlIIIIlI[20], llIlIIIIlI[21], llIlIIIIlI[22], llIlIIIIlI[23], llIlIIIIlI[2]);
            if ((!lIllIIIIIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIIIIIIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIllIIIIIIIlI(Inventory.contains(item3 -> {
                return item3.getName().contains(llIlIIIIII[llIlIIIIlI[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(llIlIIIIII[llIlIIIIlI[36]]);
                }).interact(llIlIIIIII[llIlIIIIlI[24]]);
                Time.sleepTicks(llIlIIIIlI[24]);
                "".length();
            }
            if (lIllIIIIIIIlI(new WorldArea(llIlIIIIlI[25], llIlIIIIlI[26], llIlIIIIlI[27], llIlIIIIlI[13], llIlIIIIlI[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[llIlIIIIlI[1]];
                strArr2[llIlIIIIlI[2]] = llIlIIIIII[llIlIIIIlI[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lIllIIIIIIlIl(nearest)) {
                    nearest.interact(llIlIIIIII[llIlIIIIlI[13]]);
                    Time.sleepTicks(llIlIIIIlI[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(llIlIIIIlI[14]);
            "".length();
        }
    }

    private static boolean lIllIIIIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIIIIIIl(int i, int i2) {
        return i == i2;
    }
}
