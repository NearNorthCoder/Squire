package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/z.class */
public class C0039z implements InterfaceC0003ac {
    private static /* synthetic */ String[] cE;
    static /* synthetic */ int cG;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ WorldPoint eb;
    static /* synthetic */ int di;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lllIIIllIl;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint ea;
    public static final /* synthetic */ WorldPoint ec;
    private static /* synthetic */ int[] lllIIIlllI;

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            bt();
            "".length();
            if (((95 ^ 89) & ((75 ^ 77) ^ (-1))) > "   ".length()) {
                return (113 ^ 123) & ((113 ^ 123) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIIIlllI[51];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[lllIIIlllI[1]];
        strArr[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[40]];
        if (llIIIIIIIIIlI(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[lllIIIlllI[1]];
            strArr2[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[41]];
            if (llIIIIIIIIIlI(Inventory.getCount(strArr2))) {
                String[] strArr3 = new String[lllIIIlllI[1]];
                strArr3[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[42]];
                if (llIIIIIIIIIlI(Inventory.getCount(strArr3))) {
                    String[] strArr4 = new String[lllIIIlllI[1]];
                    strArr4[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[43]];
                    if (llIIIIIIIIIlI(Inventory.getCount(strArr4))) {
                        ?? r0 = lllIIIlllI[1];
                        "".length();
                        return "  ".length() < 0 ? ((37 ^ 109) ^ (44 ^ 75)) & (((((131 + 86) - 178) + 106) ^ (((167 + 155) - 152) + 20)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lllIIIlllI[0];
    }

    private static void Q() {
        int[] iArr = new int[lllIIIlllI[1]];
        iArr[lllIIIlllI[0]] = lllIIIlllI[44];
        if (llIIIIIIIIIII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[44], lllIIIlllI[9], C0023j.cf));
            "".length();
        }
        int[] iArr2 = new int[lllIIIlllI[1]];
        iArr2[lllIIIlllI[0]] = lllIIIlllI[11];
        if (llIIIIIIIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[11], lllIIIlllI[1], lllIIIlllI[45]));
            "".length();
        }
        int[] iArr3 = new int[lllIIIlllI[1]];
        iArr3[lllIIIlllI[0]] = lllIIIlllI[12];
        if (llIIIIIIIIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[12], lllIIIlllI[1], lllIIIlllI[45]));
            "".length();
        }
        int[] iArr4 = new int[lllIIIlllI[1]];
        iArr4[lllIIIlllI[0]] = lllIIIlllI[14];
        if (llIIIIIIIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[14], lllIIIlllI[1], lllIIIlllI[45]));
            "".length();
        }
        int[] iArr5 = new int[lllIIIlllI[1]];
        iArr5[lllIIIlllI[0]] = lllIIIlllI[13];
        if (llIIIIIIIIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[13], lllIIIlllI[1], lllIIIlllI[45]));
            "".length();
        }
        int[] iArr6 = new int[lllIIIlllI[1]];
        iArr6[lllIIIlllI[0]] = lllIIIlllI[4];
        if (llIIIIIIIIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[4], lllIIIlllI[17], lllIIIlllI[45]));
            "".length();
        }
        if (llIIIIIIIIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIIllIl[lllIIIlllI[53]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[46], lllIIIlllI[9], lllIIIlllI[47]));
            "".length();
        }
        int[] iArr7 = new int[lllIIIlllI[1]];
        iArr7[lllIIIlllI[0]] = lllIIIlllI[48];
        if (llIIIIIIIIIII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlllI[48], lllIIIlllI[49], lllIIIlllI[50]));
            "".length();
        }
    }

    private static boolean llIIIIIIIIIII(int i) {
        return i == 0;
    }

    private static boolean lIllllllllllI(int i) {
        return i != 0;
    }

    private static String lIlllllllIlll(String lllllllllllllllllIlllIlllllIlIII, String lllllllllllllllllIlllIlllllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlllllIIlll.getBytes(StandardCharsets.UTF_8)), lllIIIlllI[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlllllIlIIl) {
            lllllllllllllllllIlllIlllllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllllllll(int i, int i2) {
        return i < i2;
    }

    static {
        lIlllllllllII();
        lIllllllllIlI();
        ea = new WorldPoint(lllIIIlllI[54], lllIIIlllI[55], lllIIIlllI[0]);
        eb = new WorldPoint(lllIIIlllI[56], lllIIIlllI[57], lllIIIlllI[1]);
        ec = new WorldPoint(lllIIIlllI[58], lllIIIlllI[59], lllIIIlllI[0]);
        bv = new ArrayList();
        cG = lllIIIlllI[0];
        String[] strArr = new String[lllIIIlllI[9]];
        strArr[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[60]];
        strArr[lllIIIlllI[1]] = lllIIIllIl[lllIIIlllI[61]];
        strArr[lllIIIlllI[3]] = lllIIIllIl[lllIIIlllI[62]];
        strArr[lllIIIlllI[5]] = lllIIIllIl[lllIIIlllI[63]];
        strArr[lllIIIlllI[8]] = lllIIIllIl[lllIIIlllI[64]];
        cE = strArr;
    }

    private static void lIlllllllllII() {
        lllIIIlllI = new int[65];
        lllIIIlllI[0] = (153 ^ 192) & ((239 ^ 182) ^ (-1));
        lllIIIlllI[1] = " ".length();
        lllIIIlllI[2] = (((164 + 82) - 125) + 56) ^ (((96 + 3) - 61) + 93);
        lllIIIlllI[3] = "  ".length();
        lllIIIlllI[4] = (-((-9043) & 16339)) & (-5) & 7679;
        lllIIIlllI[5] = "   ".length();
        lllIIIlllI[6] = (-((-2657) & 28277)) & (-4105) & 30719;
        lllIIIlllI[7] = (25 ^ 68) ^ (31 ^ 18);
        lllIIIlllI[8] = (255 ^ 179) ^ (223 ^ 151);
        lllIIIlllI[9] = 199 ^ 194;
        lllIIIlllI[10] = (-((-4225) & 29879)) & (-2050) & 32703;
        lllIIIlllI[11] = (-((-2409) & 24046)) & (-801) & 24575;
        lllIIIlllI[12] = (-((-3073) & 28073)) & (-5124) & 32255;
        lllIIIlllI[13] = (-((-1) & 29219)) & (-1030) & 32383;
        lllIIIlllI[14] = (-((-6915) & 8107)) & (-20738) & 24063;
        lllIIIlllI[15] = 64 ^ 70;
        lllIIIlllI[16] = (-8323) & 16331;
        lllIIIlllI[17] = (254 ^ 157) ^ (209 ^ 184);
        lllIIIlllI[18] = 20 ^ 19;
        lllIIIlllI[19] = (109 ^ 67) ^ (165 ^ 131);
        lllIIIlllI[20] = 200 ^ 193;
        lllIIIlllI[21] = (170 ^ 150) ^ (118 ^ 65);
        lllIIIlllI[22] = 126 ^ 114;
        lllIIIlllI[23] = (50 ^ 59) ^ (107 ^ 111);
        lllIIIlllI[24] = 155 ^ 149;
        lllIIIlllI[25] = (-((-23661) & 32749)) & (-1057) & 12286;
        lllIIIlllI[26] = (((54 + 0) - (-35)) + 45) ^ (((17 + 19) - 1) + 102);
        lllIIIlllI[27] = (89 ^ 76) ^ (141 ^ 136);
        lllIIIlllI[28] = (140 ^ 179) ^ (39 ^ 9);
        lllIIIlllI[29] = 165 ^ 183;
        lllIIIlllI[30] = 116 ^ 103;
        lllIIIlllI[31] = 112 ^ 100;
        lllIIIlllI[32] = 141 ^ 152;
        lllIIIlllI[33] = 180 ^ 162;
        lllIIIlllI[34] = (((141 + 7) - 118) + 138) ^ (((112 + 59) - 168) + 188);
        lllIIIlllI[35] = (((30 + 24) - (-7)) + 101) ^ (((0 + 118) - 22) + 90);
        lllIIIlllI[36] = 106 ^ 115;
        lllIIIlllI[37] = (46 ^ 95) ^ (244 ^ 159);
        lllIIIlllI[38] = (((18 + 29) - (-57)) + 42) ^ (((27 + 109) - 106) + 107);
        lllIIIlllI[39] = (14 ^ 75) ^ (28 ^ 69);
        lllIIIlllI[40] = (116 ^ 22) ^ (((70 + 98) - 73) + 32);
        lllIIIlllI[41] = (((151 + 83) - 117) + 51) ^ (((168 + 96) - 131) + 49);
        lllIIIlllI[42] = (238 ^ 133) ^ (196 ^ 176);
        lllIIIlllI[43] = 144 ^ 176;
        lllIIIlllI[44] = (-((-1073) & 17587)) & (-13) & 29151;
        lllIIIlllI[45] = (-((-9745) & 26292)) & (-8193) & 30639;
        lllIIIlllI[46] = (-((-8289) & 29025)) & (-33) & 32748;
        lllIIIlllI[47] = (-6659) & 31658;
        lllIIIlllI[48] = (-57) & 8063;
        lllIIIlllI[49] = (232 ^ 171) ^ (121 ^ 18);
        lllIIIlllI[50] = (-12306) & 13205;
        lllIIIlllI[51] = 41 ^ 77;
        lllIIIlllI[52] = (55 ^ 116) ^ (109 ^ 15);
        lllIIIlllI[53] = (((167 + 102) - 68) + 28) ^ (((68 + 60) - 7) + 78);
        lllIIIlllI[54] = (-((-4425) & 29145)) & (-1) & 27647;
        lllIIIlllI[55] = (-((-9757) & 30271)) & (-577) & 24574;
        lllIIIlllI[56] = (-16550) & 19447;
        lllIIIlllI[57] = (-((-869) & 5117)) & (-1) & 7675;
        lllIIIlllI[58] = (-5138) & 8029;
        lllIIIlllI[59] = (-6401) & 16231;
        lllIIIlllI[60] = 104 ^ 75;
        lllIIIlllI[61] = 35 ^ 7;
        lllIIIlllI[62] = 61 ^ 24;
        lllIIIlllI[63] = (((17 + 72) - (-30)) + 57) ^ (((19 + 56) - (-66)) + 9);
        lllIIIlllI[64] = (181 ^ 185) ^ (13 ^ 38);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bu() {
        String[] strArr = new String[lllIIIlllI[1]];
        strArr[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[36]];
        if (llIIIIIIIIIlI(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[lllIIIlllI[1]];
            strArr2[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[37]];
            if (llIIIIIIIIIlI(Inventory.getCount(strArr2))) {
                String[] strArr3 = new String[lllIIIlllI[1]];
                strArr3[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[38]];
                if (llIIIIIIIIIlI(Inventory.getCount(strArr3))) {
                    String[] strArr4 = new String[lllIIIlllI[1]];
                    strArr4[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[39]];
                    if (llIIIIIIIIIlI(Inventory.getCount(strArr4))) {
                        ?? r0 = lllIIIlllI[1];
                        "".length();
                        return (76 ^ 73) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lllIIIlllI[0];
    }

    private static boolean llIIIIIIIIllI(int i, int i2) {
        return i == i2;
    }

    private static int lIlllllllllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIIIIIIIIl(int i) {
        return i < 0;
    }

    private static boolean llIIIIIIIIIll(Object obj) {
        return obj != null;
    }

    private static void lIllllllllIlI() {
        lllIIIllIl = new String[lllIIIlllI[49]];
        lllIIIllIl[lllIIIlllI[0]] = lIlllllllIlll("3MwGqhznBZgeH4YIvVmJ1Q==", "Xwklq");
        lllIIIllIl[lllIIIlllI[1]] = lIlllllllIlll("Ltp3NcyKbb86orQHWwpnHvITjl09EIKm6pcN9TpuvxY1uyEBb2YB5ZHxhXD6cCWe", "CnnJT");
        lllIIIllIl[lllIIIlllI[3]] = lIlllllllIlll("N3FvgEBCMh8=", "PIYzA");
        lllIIIllIl[lllIIIlllI[5]] = lIllllllllIII("X4G9jd1QiBw=", "VhOXe");
        lllIIIllIl[lllIIIlllI[8]] = lIllllllllIIl("ISsXdgAAagM3GgQ=", "oJaVt");
        lllIIIllIl[lllIIIlllI[9]] = lIllllllllIIl("AikhIjgjJihmNismJC86LQ==", "JHOFT");
        lllIIIllIl[lllIIIlllI[15]] = lIllllllllIIl("ACNYEzoyZhUbOyQvFhVoJjMdATx3NQ0CODsvHQFkdzUPGzw0LhEcL3cyF1IKAh8xPA8=", "WFxrH");
        lllIIIllIl[lllIIIlllI[18]] = lIllllllllIIl("IwMfcCYCQhokMx8W", "mbiPR");
        lllIIIllIl[lllIIIlllI[19]] = lIllllllllIII("UAsCcq213YcbCXga3NJpsg==", "dletC");
        lllIIIllIl[lllIIIlllI[20]] = lIllllllllIII("dBfBa+Ku+xwvgQPsjcUILg==", "hMsNj");
        lllIIIllIl[lllIIIlllI[17]] = lIllllllllIII("Yvpb1w9cIpqlR7p+iMVodw==", "TRqWu");
        lllIIIllIl[lllIIIlllI[21]] = lIllllllllIIl("ASgvCVYmKC0EEyI=", "UICbv");
        lllIIIllIl[lllIIIlllI[22]] = lIllllllllIIl("HhcZCz86", "MvwmZ");
        lllIIIllIl[lllIIIlllI[23]] = lIlllllllIlll("YTamqFtMd8RnKGWb51uuhA==", "usxUT");
        lllIIIllIl[lllIIIlllI[24]] = lIllllllllIII("/jjWbo/UQ9PYklapu2G/Vg==", "QztTC");
        lllIIIllIl[lllIIIlllI[26]] = lIllllllllIII("bH0yN/5qKGW81PObH4uxCQ==", "mFUKX");
        lllIIIllIl[lllIIIlllI[27]] = lIllllllllIIl("BzkPYhE0LFgvBjQs", "UXxBc");
        lllIIIllIl[lllIIIlllI[28]] = lIlllllllIlll("Sy84d33BokGZ6he9Od6DEQ==", "zWSrU");
        lllIIIllIl[lllIIIlllI[29]] = lIllllllllIII("dDNEL5MBclLU5ImMo2xO3g==", "ZqVfI");
        lllIIIllIl[lllIIIlllI[30]] = lIllllllllIII("/UYuDXAC6SXI/9eKImXG5w==", "RFCow");
        lllIIIllIl[lllIIIlllI[31]] = lIlllllllIlll("8U62Cp9ta8n3WZMWO4JYpg==", "eObcn");
        lllIIIllIl[lllIIIlllI[32]] = lIlllllllIlll("5i6a7qaWpHY=", "XmrPo");
        lllIIIllIl[lllIIIlllI[33]] = lIllllllllIII("F5n5iRaLb1KpRXs5im321w==", "mjznj");
        lllIIIllIl[lllIIIlllI[34]] = lIllllllllIIl("IBQLIVoaBQQ=", "tugJz");
        lllIIIllIl[lllIIIlllI[35]] = lIlllllllIlll("B0H7ND4hz1utlj89X6TcAw==", "ozQHU");
        lllIIIllIl[lllIIIlllI[36]] = lIllllllllIIl("ACMqMDUrOSw8dCcoKCo=", "EMIXT");
        lllIIIllIl[lllIIIlllI[37]] = lIllllllllIIl("Mx85ECsYBT8cahUZMxshEx8=", "vqZxJ");
        lllIIIllIl[lllIIIlllI[38]] = lIllllllllIII("v+KdicFRgzJOibIGUE7icg==", "ODiiU");
        lllIIIllIl[lllIIIlllI[39]] = lIllllllllIII("yTcGkkCBBhumbiGtOQXF8w==", "wFiee");
        lllIIIllIl[lllIIIlllI[40]] = lIllllllllIIl("BgckRxE8DzAMFzo=", "TfSgr");
        lllIIIllIl[lllIIIlllI[41]] = lIllllllllIIl("OhsHTg8NHxY=", "hzpnm");
        lllIIIllIl[lllIIIlllI[42]] = lIlllllllIlll("OkfIHB1PIIIcvR33IFTHug==", "BEoFf");
        lllIIIllIl[lllIIIlllI[43]] = lIllllllllIIl("PCUcQiIPMEsPNQ8w", "nDkbP");
        lllIIIllIl[lllIIIlllI[52]] = lIllllllllIII("EqCBOxge4cMkiSpMnaZgw84zh+PwWa1C", "dDdGB");
        lllIIIllIl[lllIIIlllI[53]] = lIlllllllIlll("0Ia+ooGcr43E9cuSHHMZc7QRowRX2baW", "WUYNS");
        lllIIIllIl[lllIIIlllI[60]] = lIllllllllIII("hw21PWmW6DH2DqteT925XgqJZqOTQhQkB7tC4GB3YRA=", "yUXzr");
        lllIIIllIl[lllIIIlllI[61]] = lIllllllllIII("ixxDtTMaGD5YR5WbA/LI6cShcsOBbGYBjB9a4dcTn0w=", "zJmer");
        lllIIIllIl[lllIIIlllI[62]] = lIllllllllIIl("LQEEWw==", "tdwuX");
        lllIIIllIl[lllIIIlllI[63]] = lIlllllllIlll("DjnIvOEDrSASMHgv09S/Uk87vpFRuLCU2tOQlZX6423U5+uPVnR1PeLMvM+olYLswmcCxiizd8w=", "SytBl");
        lllIIIllIl[lllIIIlllI[64]] = lIllllllllIIl("BSZdchttIR1yNiVtBTozPm0FOjckYw==", "JMqRR");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIIIIIIlll(C0018e.j(lllIIIlllI[7]), lllIIIlllI[8])) {
            ?? r0 = lllIIIlllI[1];
            "".length();
            return 0 != 0 ? ((((70 + 0) - (-31)) + 43) ^ (((22 + 39) - (-9)) + 73)) & (((((152 + 53) - 140) + 103) ^ (((110 + 103) - 210) + 180)) ^ (-" ".length())) : r0;
        }
        return lllIIIlllI[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIIllIl[lllIIIlllI[52]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIIlllI[0];
    }

    private static boolean llIIIIIIIIlll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
        if (llIIIIIIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v308, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bt() {
        if (lIllllllllllI(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[0]];
            C0015b.a(bv);
            if (lIlllllllllll(bv.size(), lllIIIlllI[1])) {
                System.out.println(lllIIIllIl[lllIIIlllI[1]]);
                bt = lllIIIlllI[0];
            }
        }
        if (llIIIIIIIIIII(bt ? 1 : 0)) {
            if (lIllllllllllI(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlllllllllll(Movement.getRunEnergy(), lllIIIlllI[2])) {
                Inventory.getFirst(C0019f.ba).interact(lllIIIllIl[lllIIIlllI[3]]);
                Time.sleepTicks(lllIIIlllI[1]);
                "".length();
            }
            if (llIIIIIIIIIIl(lIlllllllllIl(C0018e.w(), 70.0d))) {
                int[] iArr = new int[lllIIIlllI[1]];
                iArr[lllIIIlllI[0]] = lllIIIlllI[4];
                if (lIllllllllllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIIlllI[1]];
                    iArr2[lllIIIlllI[0]] = lllIIIlllI[4];
                    Inventory.getFirst(iArr2).interact(lllIIIllIl[lllIIIlllI[5]]);
                }
            }
            if (llIIIIIIIIIII(Movement.isRunEnabled() ? 1 : 0) && llIIIIIIIIIlI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIllllllllllI(an() ? 1 : 0)) {
                int[] iArr3 = new int[lllIIIlllI[1]];
                iArr3[lllIIIlllI[0]] = lllIIIlllI[6];
            }
            if (lIlllllllllll(C0018e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIIIIIIll(nearest) && llIIIIIIIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[8]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lllIIIlllI[3]);
                    "".length();
                }
                if (llIIIIIIIIIll(nearest) && lIllllllllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[9]];
                    if (llIIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIlllI[10]);
                        "".length();
                    }
                    if (lIllllllllllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIIIIIIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIlllI[8]);
                            "".length();
                        }
                        if (llIIIIIIIIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIlllI[3]);
                            "".length();
                        }
                        int[] iArr4 = new int[lllIIIlllI[9]];
                        iArr4[lllIIIlllI[0]] = lllIIIlllI[11];
                        iArr4[lllIIIlllI[1]] = lllIIIlllI[12];
                        iArr4[lllIIIlllI[3]] = lllIIIlllI[13];
                        iArr4[lllIIIlllI[5]] = lllIIIlllI[14];
                        iArr4[lllIIIlllI[8]] = lllIIIlllI[4];
                        if (llIIIIIIIIIII(C0018e.c(iArr4) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIllIl[lllIIIlllI[15]]);
                            bt = lllIIIlllI[1];
                            return;
                        }
                        int[] iArr5 = new int[lllIIIlllI[9]];
                        iArr5[lllIIIlllI[0]] = lllIIIlllI[11];
                        iArr5[lllIIIlllI[1]] = lllIIIlllI[12];
                        iArr5[lllIIIlllI[3]] = lllIIIlllI[13];
                        iArr5[lllIIIlllI[5]] = lllIIIlllI[14];
                        iArr5[lllIIIlllI[8]] = lllIIIlllI[4];
                        if (lIllllllllllI(C0018e.c(iArr5) ? 1 : 0)) {
                            Bank.withdraw(lllIIIlllI[11], lllIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                            Bank.withdraw(lllIIIlllI[12], lllIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                            Bank.withdraw(lllIIIlllI[13], lllIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                            Bank.withdraw(lllIIIlllI[14], lllIIIlllI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                            C0000a.a(lllIIIlllI[16], lllIIIlllI[9]);
                            C0000a.b(C0019f.ba, lllIIIlllI[9]);
                            C0000a.a(lllIIIlllI[4], lllIIIlllI[17]);
                            C0000a.b(C0019f.bk, lllIIIlllI[1]);
                        }
                    }
                }
            }
            if (lIllllllllllI(an() ? 1 : 0) && lIlllllllllll(C0018e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                if (llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[18]];
                    if (lIlllllllllll(cG, lllIIIlllI[1])) {
                        C0018e.x();
                        cG += lllIIIlllI[1];
                    }
                    Movement.walkTo(ea);
                    "".length();
                    Time.sleepTicks(lllIIIlllI[1]);
                    "".length();
                }
                if (llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[19]];
                    C0020g.a(lllIIIllIl[lllIIIlllI[20]], cE);
                }
            }
            if (llIIIIIIIIllI(C0018e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                di = lllIIIlllI[0];
                if (llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[17]];
                    Movement.walkTo(eb);
                    "".length();
                    Time.sleepTicks(lllIIIlllI[1]);
                    "".length();
                }
                if (llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[21]];
                    C0020g.a(lllIIIllIl[lllIIIlllI[22]], cE);
                }
            }
            if (llIIIIIIIIllI(C0018e.j(lllIIIlllI[7]), lllIIIlllI[3]) && llIIIIIIIIIII(bu() ? 1 : 0)) {
                if (llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ec), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[23]];
                    Movement.walkTo(ec);
                    "".length();
                    Time.sleepTicks(lllIIIlllI[1]);
                    "".length();
                }
                if (llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ec), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[24]];
                    int[] iArr6 = new int[lllIIIlllI[1]];
                    iArr6[lllIIIlllI[0]] = lllIIIlllI[25];
                    TileObject nearest2 = TileObjects.getNearest(iArr6);
                    if (llIIIIIIIIIll(nearest2)) {
                        String[] strArr = new String[lllIIIlllI[1]];
                        strArr[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[26]];
                        Item first = Inventory.getFirst(strArr);
                        String[] strArr2 = new String[lllIIIlllI[1]];
                        strArr2[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[27]];
                        Item first2 = Inventory.getFirst(strArr2);
                        String[] strArr3 = new String[lllIIIlllI[1]];
                        strArr3[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[28]];
                        Item first3 = Inventory.getFirst(strArr3);
                        String[] strArr4 = new String[lllIIIlllI[1]];
                        strArr4[lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[29]];
                        Item first4 = Inventory.getFirst(strArr4);
                        if (llIIIIIIIIIll(first)) {
                            first.useOn(nearest2);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                        }
                        if (llIIIIIIIIIll(first2)) {
                            first2.useOn(nearest2);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                        }
                        if (llIIIIIIIIIll(first3)) {
                            first3.useOn(nearest2);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                        }
                        if (llIIIIIIIIIll(first4)) {
                            first4.useOn(nearest2);
                            Time.sleepTicks(lllIIIlllI[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIIIIIIIIllI(C0018e.j(lllIIIlllI[7]), lllIIIlllI[3]) && lIllllllllllI(bu() ? 1 : 0)) {
                if (llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[30]];
                    Movement.walkTo(eb);
                    "".length();
                    Time.sleepTicks(lllIIIlllI[1]);
                    "".length();
                }
                if (llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[31]];
                    C0020g.a(lllIIIllIl[lllIIIlllI[32]], cE);
                }
            }
            if (llIIIIIIIIllI(C0018e.j(lllIIIlllI[7]), lllIIIlllI[5])) {
                if (llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[33]];
                    Movement.walkTo(ea);
                    "".length();
                    Time.sleepTicks(lllIIIlllI[1]);
                    "".length();
                }
                if (llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[34]];
                    if (lIlllllllllll(di, lllIIIlllI[1])) {
                        aN.pX += lllIIIlllI[1];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIIlllI[1];
                        aN.pX = lllIIIlllI[0];
                    }
                    C0020g.a(lllIIIllIl[lllIIIlllI[35]], cE);
                }
            }
            C0020g.a(cE);
        }
    }

    private static String lIllllllllIII(String lllllllllllllllllIlllIllllIIIIll, String lllllllllllllllllIlllIllllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIllllIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIllllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIlllI[3], lllllllllllllllllIlllIllllIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIllllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIllllIIIlII) {
            lllllllllllllllllIlllIllllIIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIllllllllIIl(String lllllllllllllllllIlllIllllIllIII, String lllllllllllllllllIlllIllllIlIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIllllIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIllllIlIllI = new StringBuilder();
        char[] charArray = lllllllllllllllllIlllIllllIlIlll.toCharArray();
        int lllllllllllllllllIlllIllllIlIlII = lllIIIlllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllllIlllIllllIIllII = lllIIIlllI[0];
        while (lIlllllllllll(lllllllllllllllllIlllIllllIIllII, length)) {
            lllllllllllllllllIlllIllllIlIllI.append((char) (charArray2[lllllllllllllllllIlllIllllIIllII] ^ charArray[lllllllllllllllllIlllIllllIlIlII % charArray.length]));
            "".length();
            lllllllllllllllllIlllIllllIlIlII++;
            lllllllllllllllllIlllIllllIIllII++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlllIllllIlIllI);
    }

    private static boolean llIIIIIIIIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIIIIIIIlI(int i) {
        return i > 0;
    }

    private static boolean llIIIIIIIIlIl(int i, int i2) {
        return i <= i2;
    }
}
