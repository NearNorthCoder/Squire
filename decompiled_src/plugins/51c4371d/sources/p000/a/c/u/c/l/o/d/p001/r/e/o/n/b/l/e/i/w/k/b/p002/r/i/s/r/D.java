package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.D  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/D.class */
public class D implements F {
    public static /* synthetic */ List<C0003d> bB;
    private static final /* synthetic */ WorldPoint il;
    private static final /* synthetic */ WorldPoint ij;
    private static final /* synthetic */ WorldPoint im;
    private static /* synthetic */ int[] lllIlIlI;
    private static /* synthetic */ String[] lllIIlIl;
    static /* synthetic */ int bZ;
    private static final /* synthetic */ WorldPoint ik;
    static /* synthetic */ boolean cj;
    public static final /* synthetic */ String[] ii;
    public static /* synthetic */ boolean bz;
    static /* synthetic */ int ci;

    private static void llIIIIIlIll() {
        lllIlIlI = new int[75];
        lllIlIlI[0] = ((((144 + 57) - 82) + 41) ^ (((30 + 8) - (-81)) + 72)) & (((97 ^ 31) ^ (55 ^ 86)) ^ (-" ".length()));
        lllIlIlI[1] = " ".length();
        lllIlIlI[2] = 133 ^ 195;
        lllIlIlI[3] = "  ".length();
        lllIlIlI[4] = (-((-12621) & 32205)) & (-8193) & 28155;
        lllIlIlI[5] = "   ".length();
        lllIlIlI[6] = 35 ^ 72;
        lllIlIlI[7] = 90 ^ 94;
        lllIlIlI[8] = (34 ^ 109) ^ (83 ^ 25);
        lllIlIlI[9] = (-2149) & 7148;
        lllIlIlI[10] = (-20785) & 32762;
        lllIlIlI[11] = (-(102 ^ 69)) & (-2) & 8043;
        lllIlIlI[12] = (-3105) & 15729;
        lllIlIlI[13] = (-((-1605) & 26357)) & (-9) & 32767;
        lllIlIlI[14] = 175 ^ 169;
        lllIlIlI[15] = 79 ^ 69;
        lllIlIlI[16] = (-29252) & 32491;
        lllIlIlI[17] = (-((-10629) & 15358)) & (-8449) & 16381;
        lllIlIlI[18] = 127 ^ 119;
        lllIlIlI[19] = (122 ^ 65) ^ (179 ^ 131);
        lllIlIlI[20] = (187 ^ 152) ^ (143 ^ 171);
        lllIlIlI[21] = 9 ^ 0;
        lllIlIlI[22] = (85 ^ 109) ^ (102 ^ 82);
        lllIlIlI[23] = 42 ^ 39;
        lllIlIlI[24] = 65 ^ 79;
        lllIlIlI[25] = 167 ^ 168;
        lllIlIlI[26] = 97 ^ 113;
        lllIlIlI[27] = (-((-7767) & 32478)) & (-2129) & 27391;
        lllIlIlI[28] = (((10 + 49) - (-13)) + 70) ^ (((107 + 139) - 207) + 120);
        lllIlIlI[29] = 38 ^ 52;
        lllIlIlI[30] = (112 ^ 72) ^ (82 ^ 121);
        lllIlIlI[31] = 121 ^ 109;
        lllIlIlI[32] = (((12 + 99) - 68) + 109) ^ (((44 + 41) - 17) + 73);
        lllIlIlI[33] = 46 ^ 56;
        lllIlIlI[34] = (100 ^ 124) ^ (109 ^ 98);
        lllIlIlI[35] = (61 ^ 126) ^ (196 ^ 159);
        lllIlIlI[36] = (((131 + 80) - 168) + 129) ^ (((32 + 46) - (-4)) + 99);
        lllIlIlI[37] = 170 ^ 176;
        lllIlIlI[38] = (186 ^ 152) ^ (43 ^ 18);
        lllIlIlI[39] = (148 ^ 157) ^ (121 ^ 108);
        lllIlIlI[40] = (((46 + 53) - (-84)) + 7) ^ (((3 + 160) - 138) + 138);
        lllIlIlI[41] = 179 ^ 173;
        lllIlIlI[42] = (43 ^ 57) ^ (53 ^ 56);
        lllIlIlI[43] = 116 ^ 84;
        lllIlIlI[44] = (((46 + 47) - 48) + 101) ^ (((17 + 23) - 4) + 143);
        lllIlIlI[45] = (237 ^ 136) ^ (109 ^ 42);
        lllIlIlI[46] = (-((-29739) & 30123)) & (-66) & 16349;
        lllIlIlI[47] = (-10290) & 16189;
        lllIlIlI[48] = (-4370) & 16349;
        lllIlIlI[49] = (-7240) & 32239;
        lllIlIlI[50] = (-((-7497) & 32218)) & (-6145) & 32765;
        lllIlIlI[51] = (7 ^ 87) ^ (41 ^ 29);
        lllIlIlI[52] = 139 ^ 168;
        lllIlIlI[53] = (247 ^ 156) ^ (61 ^ 114);
        lllIlIlI[54] = (((128 + 185) - 174) + 85) ^ (((131 + 174) - 159) + 51);
        lllIlIlI[55] = 71 ^ 97;
        lllIlIlI[56] = 145 ^ 182;
        lllIlIlI[57] = 99 ^ 75;
        lllIlIlI[58] = (7 ^ 110) ^ (232 ^ 168);
        lllIlIlI[59] = 63 ^ 21;
        lllIlIlI[60] = 35 ^ 8;
        lllIlIlI[61] = (93 ^ 76) ^ (174 ^ 147);
        lllIlIlI[62] = (37 ^ 71) ^ (87 ^ 24);
        lllIlIlI[63] = (15 ^ 81) ^ (246 ^ 134);
        lllIlIlI[64] = (170 ^ 198) ^ (12 ^ 79);
        lllIlIlI[65] = 156 ^ 172;
        lllIlIlI[66] = (50 ^ 110) ^ (202 ^ 167);
        lllIlIlI[67] = (-((-17569) & 29878)) & (-33) & 15551;
        lllIlIlI[68] = (-24741) & 27886;
        lllIlIlI[69] = (-((-5158) & 29885)) & (-4353) & 32255;
        lllIlIlI[70] = (-517) & 3765;
        lllIlIlI[71] = (-4486) & 7679;
        lllIlIlI[72] = (-((-7722) & 32379)) & (-769) & 28543;
        lllIlIlI[73] = (-16546) & 26111;
        lllIlIlI[74] = (((87 + 75) - 99) + 80) ^ (((76 + 21) - 59) + 151);
    }

    private static boolean llIIIIlIllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIllllIlllI(String lIIlllllIllIllI, String lIIlllllIllIlIl) {
        String str = new String(Base64.getDecoder().decode(lIIlllllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlllllIllIlII = new StringBuilder();
        char[] lIIlllllIllIIll = lIIlllllIllIlIl.toCharArray();
        int lIIlllllIllIIlI = lllIlIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIlI[0];
        while (llIIIIIlllI(i, length)) {
            lIIlllllIllIlII.append((char) (charArray[i] ^ lIIlllllIllIIll[lIIlllllIllIIlI % lIIlllllIllIIll.length]));
            "".length();
            lIIlllllIllIIlI++;
            i++;
            "".length();
            if (((61 ^ 109) ^ (117 ^ 33)) < (((((98 + 113) - 78) + 59) ^ (((58 + 182) - 191) + 147)) & (((((114 + 13) - 3) + 16) ^ (((131 + 58) - 92) + 39)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lIIlllllIllIlII);
    }

    static {
        llIIIIIlIll();
        lIlllllIlII();
        String[] strArr = new String[lllIlIlI[23]];
        strArr[lllIlIlI[0]] = lllIIlIl[lllIlIlI[54]];
        strArr[lllIlIlI[1]] = lllIIlIl[lllIlIlI[55]];
        strArr[lllIlIlI[3]] = lllIIlIl[lllIlIlI[56]];
        strArr[lllIlIlI[5]] = lllIIlIl[lllIlIlI[57]];
        strArr[lllIlIlI[7]] = lllIIlIl[lllIlIlI[58]];
        strArr[lllIlIlI[8]] = lllIIlIl[lllIlIlI[59]];
        strArr[lllIlIlI[14]] = lllIIlIl[lllIlIlI[60]];
        strArr[lllIlIlI[20]] = lllIIlIl[lllIlIlI[61]];
        strArr[lllIlIlI[18]] = lllIIlIl[lllIlIlI[62]];
        strArr[lllIlIlI[21]] = lllIIlIl[lllIlIlI[63]];
        strArr[lllIlIlI[15]] = lllIIlIl[lllIlIlI[64]];
        strArr[lllIlIlI[19]] = lllIIlIl[lllIlIlI[65]];
        strArr[lllIlIlI[22]] = lllIIlIl[lllIlIlI[66]];
        ii = strArr;
        ij = new WorldPoint(lllIlIlI[16], lllIlIlI[67], lllIlIlI[0]);
        ik = new WorldPoint(lllIlIlI[68], lllIlIlI[69], lllIlIlI[0]);
        il = new WorldPoint(lllIlIlI[70], lllIlIlI[71], lllIlIlI[0]);
        im = new WorldPoint(lllIlIlI[72], lllIlIlI[73], lllIlIlI[0]);
        bB = new ArrayList();
        bZ = lllIlIlI[0];
    }

    private static boolean llIIIIlIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIlIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIIlIIII(int i) {
        return i < 0;
    }

    private static boolean llIIIIlIIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ac() {
        int[] iArr = new int[lllIlIlI[1]];
        iArr[lllIlIlI[0]] = lllIlIlI[11];
        if (llIIIIIllIl(Inventory.contains(iArr) ? 1 : 0) && ((!llIIIIIllll(Inventory.contains(C0005f.aX) ? 1 : 0) || llIIIIIllIl(Equipment.contains(C0005f.aX) ? 1 : 0)) && llIIIIIllIl(Inventory.contains(C0005f.bb) ? 1 : 0))) {
            int[] iArr2 = new int[lllIlIlI[1]];
            iArr2[lllIlIlI[0]] = lllIlIlI[13];
            if (llIIIIIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllIlIlI[1]];
                iArr3[lllIlIlI[0]] = lllIlIlI[4];
                if (llIIIIIllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lllIlIlI[1];
                    "".length();
                    return (-" ".length()) >= "   ".length() ? ((((138 + 68) - 97) + 32) ^ (((118 + 60) - 116) + 82)) & (((118 ^ 71) ^ (144 ^ 188)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lllIlIlI[0];
    }

    private static void lIlllllIlII() {
        lllIIlIl = new String[lllIlIlI[74]];
        lllIIlIl[lllIlIlI[0]] = lIllllIllIl("M6SBqOZ+5O5v+JvuoXP2SQ==", "yyokc");
        lllIIlIl[lllIlIlI[1]] = lIllllIlllI("EAA5PCE+DDN1MCMQPjs1dgAjMD8lRXcmJT8dND07OA53NzM1AnchPXYYIjAhIg==", "ViWUR");
        lllIIlIl[lllIlIlI[3]] = lIllllIllll("HrCZUnDhXRo=", "raJXt");
        lllIIlIl[lllIlIlI[5]] = lIllllIllIl("tc/7I8c7GYw=", "XaUbB");
        lllIIlIl[lllIlIlI[7]] = lIllllIllll("KwDiXBTwj6a0dwC1DlvNBw==", "PlrGS");
        lllIIlIl[lllIlIlI[8]] = lIllllIlllI("OgUCLgUbCgtqCxMKByMHFQ==", "rdlJi");
        lllIIlIl[lllIlIlI[14]] = lIllllIllIl("eskEc9BFNBHqUVf3qWecTljM9gbuLDxOOLEcwalLnp5XnhhF0ahtQt8ylcsfoyn9KL3rHiz2aIU=", "OypCE");
        lllIIlIl[lllIlIlI[20]] = lIllllIllll("rzoujlwRCs2Yu1QZUjVn6w==", "LjCdy");
        lllIIlIl[lllIlIlI[18]] = lIllllIllll("KzbLu6TQ7BLqLT4TJmfV2Q==", "kpIiS");
        lllIIlIl[lllIlIlI[21]] = lIllllIllll("0zHlFduGbeo1GIVFMWhoNQ==", "qbsTP");
        lllIIlIl[lllIlIlI[15]] = lIllllIllll("/LfvCGWDPLHwiNEEoIoFsQ==", "rkGqy");
        lllIIlIl[lllIlIlI[19]] = lIllllIlllI("HSwGQjY8bR4HITghEQEncyoFGw==", "SMpbB");
        lllIIlIl[lllIlIlI[22]] = lIllllIlllI("Dho2ATcmFzYNKyBULBQm", "GtBdE");
        lllIIlIl[lllIlIlI[23]] = lIllllIllIl("xqe1jupKeq8=", "ShwzI");
        lllIIlIl[lllIlIlI[24]] = lIllllIllIl("00pAxvH01RA=", "GrsZz");
        lllIIlIl[lllIlIlI[25]] = lIllllIlllI("HCYOOw==", "SVkUw");
        lllIIlIl[lllIlIlI[26]] = lIllllIlllI("LjAsLSAacQ03LQY0IQ==", "hQXEE");
        lllIIlIl[lllIlIlI[28]] = lIllllIllll("Er0lO4B63oA=", "vyRld");
        lllIIlIl[lllIlIlI[29]] = lIllllIllIl("pgQRSc8XeTvDE4SyUf1LDw==", "uzUAk");
        lllIIlIl[lllIlIlI[30]] = lIllllIlllI("CQoPPhUoBQZ6Gi4NBzMX", "AkaZy");
        lllIIlIl[lllIlIlI[31]] = lIllllIllIl("fhQJnXpvPF+jxj8MeD93kQ==", "ltmlw");
        lllIIlIl[lllIlIlI[32]] = lIllllIlllI("NhQCOQEBAgJtCgweAjk=", "dqqMm");
        lllIIlIl[lllIlIlI[33]] = lIllllIlllI("NwwxIQYa", "tcWGo");
        lllIIlIl[lllIlIlI[34]] = lIllllIlllI("CREgPQ==", "FaESE");
        lllIIlIl[lllIlIlI[35]] = lIllllIlllI("NgMbVhMXQh4dEhQO", "xbmvg");
        lllIIlIl[lllIlIlI[36]] = lIllllIllIl("VpmkUz4HAF7WozxuCTecRQ==", "JrpRb");
        lllIIlIl[lllIlIlI[37]] = lIllllIllIl("6eC0GSgQxDk=", "tKBOm");
        lllIIlIl[lllIlIlI[38]] = lIllllIllIl("sx6UZBJ7GaA=", "JeNpP");
        lllIIlIl[lllIlIlI[39]] = lIllllIllIl("xkTw6P3m7Oc=", "HlYVD");
        lllIIlIl[lllIlIlI[40]] = lIllllIlllI("Cig6UDEraS8fIyIgIg==", "DILpE");
        lllIIlIl[lllIlIlI[41]] = lIllllIllll("0x9D+QEA9vCy378JD66NBw==", "ySuew");
        lllIIlIl[lllIlIlI[42]] = lIllllIllll("6TXx3Mqzhc8=", "ULonS");
        lllIIlIl[lllIlIlI[43]] = lIllllIlllI("CiEpPQ==", "EQLSC");
        lllIIlIl[lllIlIlI[44]] = lIllllIlllI("PgoNDA==", "qzhbw");
        lllIIlIl[lllIlIlI[45]] = lIllllIllIl("PJK1IEreePJnLvOJ5OV7/A==", "UPiWx");
        lllIIlIl[lllIlIlI[52]] = lIllllIllIl("L761CXuKVacs86GGZN1tpXfxEtaQvpnI", "pwmrT");
        lllIIlIl[lllIlIlI[53]] = lIllllIllll("SmRkX8OZb0cNmSWk2UQvPM+Ec9YQR5+C", "BWXQh");
        lllIIlIl[lllIlIlI[54]] = lIllllIllll("soG3BsnAh5V3+EPwX12tpvlDwumJTXuaWojDu8td2gg=", "EdwPH");
        lllIIlIl[lllIlIlI[55]] = lIllllIlllI("J1IMJxIVAUskFUYLBD4BRhQCJRYVBksqHwNSGycWBwEOZQ==", "frkKs");
        lllIIlIl[lllIlIlI[56]] = lIllllIllll("gxHATX4YWrW7fi/O9TiBotKxXEbOmArt", "fpNWs");
        lllIIlIl[lllIlIlI[57]] = lIllllIllll("gsF9+ljeGbI=", "mRUhT");
        lllIIlIl[lllIlIlI[58]] = lIllllIllIl("TDBZXIEsQWgxeNaW+CtzgPV23VGc/KTqryajACmJCQg=", "Djray");
        lllIIlIl[lllIlIlI[59]] = lIllllIlllI("Bg1GdB4sEko5F2kODzgCaRICMRxn", "IfjTr");
        lllIIlIl[lllIlIlI[60]] = lIllllIllIl("aP7AJMYGnMwlO1sAdYof03iNwDDf9ooDn7jjEDoS2mmfJgKeNsVhIw==", "WtwYS");
        lllIIlIl[lllIlIlI[61]] = lIllllIllll("pPUC6Kd7pG/cJPWuM3XSKDtv7UKjkg48HaNJd9OHnc1fhAF4cUCu9K1DzmuAHO73", "fAAyK");
        lllIIlIl[lllIlIlI[62]] = lIllllIllIl("99ubkSTsXZkh9j3Hygf2Lc08+kUZTclJXK9WhiGkrmg+9+b0mcBJXg==", "SlZXS");
        lllIIlIl[lllIlIlI[63]] = lIllllIllIl("9MJPq9O03cc=", "SwohK");
        lllIIlIl[lllIlIlI[64]] = lIllllIlllI("JnELbTsKNxQkIgh2ByNsDjsTISkbdgkrbAg+CT44TyUWKC0Edw==", "oVfML");
        lllIIlIl[lllIlIlI[65]] = lIllllIllll("w66zNAfmCDbeFAvFMANM9A==", "lhsrz");
        lllIIlIl[lllIlIlI[66]] = lIllllIlllI("Chs8UygjGms6ayoRJwN0", "BtKsK");
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            ci();
            "".length();
            if ((((84 ^ 90) ^ (212 ^ 132)) & (((55 ^ 50) ^ (110 ^ 53)) ^ (-" ".length()))) > 0) {
                return ((((58 + 69) - 83) + 89) ^ (((131 + 144) - 139) + 11)) & (((((5 + 142) - 105) + 107) ^ (((105 + 8) - 87) + 105)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIlIlI[51];
    }

    private static int llIIIIIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIIIllll(int i) {
        return i == 0;
    }

    private static String lIllllIllll(String lIIlllllIIlllll, String lIIlllllIlIIIII) {
        try {
            SecretKeySpec lIIlllllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlllllIlIIIll = Cipher.getInstance("Blowfish");
            lIIlllllIlIIIll.init(lllIlIlI[3], lIIlllllIlIIlII);
            return new String(lIIlllllIlIIIll.doFinal(Base64.getDecoder().decode(lIIlllllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlllllIlIIIlI) {
            lIIlllllIlIIIlI.printStackTrace();
            return null;
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lllIIlIl[lllIlIlI[52]];
    }

    private static String lIllllIllIl(String lIIllllllIIIllI, String lIIllllllIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllllIIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIlI[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllllIIIlll) {
            lIIllllllIIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lllIlIlI[0];
    }

    private static boolean llIIIIIlllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void ci() {
        if (llIIIIIllIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lllIIlIl[lllIlIlI[0]];
            C0001b.a(bB);
            if (llIIIIIlllI(bB.size(), lllIlIlI[1])) {
                System.out.println(lllIIlIl[lllIlIlI[1]]);
                bz = lllIlIlI[0];
            }
        }
        if (llIIIIIllll(bz ? 1 : 0)) {
            if (llIIIIIllIl(Inventory.contains(C0005f.bb) ? 1 : 0) && llIIIIIlllI(Movement.getRunEnergy(), lllIlIlI[2])) {
                Inventory.getFirst(C0005f.bb).interact(lllIIlIl[lllIlIlI[3]]);
                Time.sleepTicks(lllIlIlI[1]);
                "".length();
            }
            if (llIIIIlIIII(llIIIIIllII(C0004e.v(), 70.0d))) {
                int[] iArr = new int[lllIlIlI[1]];
                iArr[lllIlIlI[0]] = lllIlIlI[4];
                if (llIIIIIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIlIlI[1]];
                    iArr2[lllIlIlI[0]] = lllIlIlI[4];
                    Inventory.getFirst(iArr2).interact(lllIIlIl[lllIlIlI[5]]);
                }
            }
            if (llIIIIIllll(Movement.isRunEnabled() ? 1 : 0) && llIIIIlIIIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIIIIIllll(ac() ? 1 : 0) && llIIIIIlllI(C0004e.j(lllIlIlI[6]), lllIlIlI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIlIIlI(nearest) && llIIIIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lllIlIlI[3]);
                    "".length();
                }
                if (llIIIIlIIlI(nearest) && llIIIIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[8]];
                    if (llIIIIIllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlIlI[9]);
                        "".length();
                    }
                    if (llIIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlIlI[7]);
                            "".length();
                        }
                        if (llIIIIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIlIlI[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lllIlIlI[8]];
                        iArr3[lllIlIlI[0]] = lllIlIlI[10];
                        iArr3[lllIlIlI[1]] = lllIlIlI[11];
                        iArr3[lllIlIlI[3]] = lllIlIlI[12];
                        iArr3[lllIlIlI[5]] = lllIlIlI[13];
                        iArr3[lllIlIlI[7]] = lllIlIlI[4];
                        if (llIIIIIllll(C0004e.b(iArr3) ? 1 : 0)) {
                            ag();
                            System.out.println(lllIIlIl[lllIlIlI[14]]);
                            bz = lllIlIlI[1];
                            return;
                        }
                        Bank.withdraw(lllIlIlI[11], lllIlIlI[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlI[1]);
                        "".length();
                        Bank.withdraw(lllIlIlI[13], lllIlIlI[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlI[1]);
                        "".length();
                        Bank.withdraw(lllIlIlI[10], lllIlIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIlI[1]);
                        "".length();
                        C0000a.b(C0005f.bb, lllIlIlI[1]);
                        C0000a.a(lllIlIlI[4], lllIlIlI[15]);
                        C0000a.b(C0005f.bl, lllIlIlI[1]);
                    }
                }
            }
            if (llIIIIIllIl(ac() ? 1 : 0) && llIIIIIlllI(C0004e.j(lllIlIlI[6]), lllIlIlI[1])) {
                new WorldArea(lllIlIlI[16], lllIlIlI[17], lllIlIlI[18], lllIlIlI[19], lllIlIlI[0]);
                String[] strArr = new String[lllIlIlI[1]];
                strArr[lllIlIlI[0]] = lllIIlIl[lllIlIlI[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (llIIIIlIIll(nearest2) && llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ij), lllIlIlI[5]) && llIIIIIllll(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[18]];
                    if (llIIIIIlllI(bZ, lllIlIlI[1])) {
                        C0004e.w();
                        bZ += lllIlIlI[1];
                    }
                    Movement.walkTo(ij);
                    "".length();
                    Time.sleepTicks(lllIlIlI[1]);
                    "".length();
                }
                if (llIIIIlIIlI(nearest2)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[21]];
                    C0006g.a(lllIIlIl[lllIlIlI[15]], ii, lllIlIlI[1]);
                }
            }
            if (llIIIIlIlIl(C0004e.j(lllIlIlI[6]), lllIlIlI[1])) {
                if (llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ik), lllIlIlI[14])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[19]];
                    Movement.walkTo(ik);
                    "".length();
                    Time.sleepTicks(lllIlIlI[1]);
                    "".length();
                }
                if (llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(ik), lllIlIlI[14])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[22]];
                    String[] strArr2 = new String[lllIlIlI[1]];
                    strArr2[lllIlIlI[0]] = lllIIlIl[lllIlIlI[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (llIIIIlIIlI(nearest3)) {
                        String[] strArr3 = new String[lllIlIlI[1]];
                        strArr3[lllIlIlI[0]] = lllIIlIl[lllIlIlI[24]];
                        if (llIIIIIllIl(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(lllIIlIl[lllIlIlI[25]]);
                            Time.sleepTicks(lllIlIlI[8]);
                            "".length();
                        }
                    }
                    C0006g.a(lllIIlIl[lllIlIlI[26]], ii);
                }
            }
            if (llIIIIlIlIl(C0004e.j(lllIlIlI[6]), lllIlIlI[3])) {
                if (llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    int[] iArr4 = new int[lllIlIlI[1]];
                    iArr4[lllIlIlI[0]] = lllIlIlI[27];
                    if (llIIIIIllIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIlIlI[1]];
                        iArr5[lllIlIlI[0]] = lllIlIlI[27];
                        Inventory.getFirst(iArr5).interact(lllIIlIl[lllIlIlI[28]]);
                        Time.sleepTicks(lllIlIlI[1]);
                        "".length();
                    }
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[29]];
                    Movement.walkTo(il);
                    "".length();
                    Time.sleepTicks(lllIlIlI[1]);
                    "".length();
                }
                if (llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[30]];
                    String[] strArr4 = new String[lllIlIlI[1]];
                    strArr4[lllIlIlI[0]] = lllIIlIl[lllIlIlI[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (llIIIIlIIlI(nearest4)) {
                        C0006g.a(lllIIlIl[lllIlIlI[32]], ii);
                    }
                    if (llIIIIlIIll(nearest4)) {
                        String[] strArr5 = new String[lllIlIlI[1]];
                        strArr5[lllIlIlI[0]] = lllIIlIl[lllIlIlI[33]];
                        TileObjects.getNearest(strArr5).interact(lllIIlIl[lllIlIlI[34]]);
                        Time.sleepTicks(lllIlIlI[3]);
                        "".length();
                    }
                }
            }
            if (llIIIIlIlIl(C0004e.j(lllIlIlI[6]), lllIlIlI[5])) {
                ci = lllIlIlI[0];
                if (llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(im), lllIlIlI[5])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[35]];
                    Movement.walkTo(im);
                    "".length();
                    Time.sleepTicks(lllIlIlI[1]);
                    "".length();
                }
                if (llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(im), lllIlIlI[5])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[36]];
                    String[] strArr6 = new String[lllIlIlI[1]];
                    strArr6[lllIlIlI[0]] = lllIIlIl[lllIlIlI[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (llIIIIlIIlI(nearest5)) {
                        nearest5.interact(lllIIlIl[lllIlIlI[38]]);
                    }
                }
            }
            if (llIIIIlIlIl(C0004e.j(lllIlIlI[6]), lllIlIlI[7])) {
                if (llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    int[] iArr6 = new int[lllIlIlI[1]];
                    iArr6[lllIlIlI[0]] = lllIlIlI[27];
                    if (llIIIIIllIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIlIlI[1]];
                        iArr7[lllIlIlI[0]] = lllIlIlI[27];
                        Inventory.getFirst(iArr7).interact(lllIIlIl[lllIlIlI[39]]);
                        Time.sleepTicks(lllIlIlI[1]);
                        "".length();
                    }
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[40]];
                    Movement.walkTo(il);
                    "".length();
                    Time.sleepTicks(lllIlIlI[1]);
                    "".length();
                }
                if (llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[41]];
                    String[] strArr7 = new String[lllIlIlI[1]];
                    strArr7[lllIlIlI[0]] = lllIIlIl[lllIlIlI[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (llIIIIlIIlI(nearest6)) {
                        String[] strArr8 = new String[lllIlIlI[1]];
                        strArr8[lllIlIlI[0]] = lllIIlIl[lllIlIlI[43]];
                        if (llIIIIIllIl(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(lllIIlIl[lllIlIlI[44]]);
                            Time.sleepTicks(lllIlIlI[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[lllIlIlI[1]];
                        strArr9[lllIlIlI[0]] = lllIIlIl[lllIlIlI[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (llIIIIlIIlI(first)) {
                            if (llIIIIIlllI(ci, lllIlIlI[1])) {
                                Q.mq += lllIlIlI[1];
                                Q.o(AccBuilderBarrows.m);
                                ci += lllIlIlI[1];
                                Q.mq = lllIlIlI[0];
                                cj = lllIlIlI[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(lllIlIlI[5]);
                            "".length();
                        }
                    }
                }
                C0006g.a(ii);
            }
            C0006g.a(new String[lllIlIlI[0]]);
        }
    }

    private static void ag() {
        int[] iArr = new int[lllIlIlI[1]];
        iArr[lllIlIlI[0]] = lllIlIlI[10];
        if (llIIIIIllll(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(lllIlIlI[10], lllIlIlI[1], lllIlIlI[46]));
            "".length();
        }
        int[] iArr2 = new int[lllIlIlI[1]];
        iArr2[lllIlIlI[0]] = lllIlIlI[4];
        if (llIIIIIllll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(lllIlIlI[4], lllIlIlI[15], lllIlIlI[47]));
            "".length();
        }
        if (llIIIIIllll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIlIl[lllIlIlI[53]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lllIlIlI[48], lllIlIlI[8], lllIlIlI[49]));
            "".length();
        }
        int[] iArr3 = new int[lllIlIlI[1]];
        iArr3[lllIlIlI[0]] = lllIlIlI[11];
        if (llIIIIIllll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lllIlIlI[11], lllIlIlI[15], lllIlIlI[50]));
            "".length();
        }
        int[] iArr4 = new int[lllIlIlI[1]];
        iArr4[lllIlIlI[0]] = lllIlIlI[13];
        if (llIIIIIllll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lllIlIlI[13], lllIlIlI[31], lllIlIlI[50]));
            "".length();
        }
        int[] iArr5 = new int[lllIlIlI[1]];
        iArr5[lllIlIlI[0]] = lllIlIlI[12];
        if (llIIIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lllIlIlI[12], lllIlIlI[8], C0008i.bw));
            "".length();
        }
    }

    private static boolean llIIIIlIIll(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIIlIlll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIIIIlIlll(C0004e.j(lllIlIlI[6]), lllIlIlI[8])) {
            ?? r0 = lllIlIlI[1];
            "".length();
            return "   ".length() >= ((((165 + 162) - 192) + 51) ^ (((13 + 172) - 125) + 130)) ? ((((41 + 116) - 128) + 210) ^ (((109 + 59) - 65) + 94)) & (((((5 + 174) - 108) + 104) ^ (((44 + 17) - (-15)) + 57)) ^ (-" ".length())) : r0;
        }
        return lllIlIlI[0];
    }

    private static boolean llIIIIIllIl(int i) {
        return i != 0;
    }
}
