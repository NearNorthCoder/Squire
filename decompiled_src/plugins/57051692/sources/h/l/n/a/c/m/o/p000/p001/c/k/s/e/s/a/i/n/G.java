package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.G  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/G.class */
public class G implements K {
    private static final /* synthetic */ int iO;
    private static final /* synthetic */ int iV;
    private static final /* synthetic */ int iP;
    private static final /* synthetic */ int iX;
    static /* synthetic */ boolean dd;
    private static final /* synthetic */ int iQ;
    private static final /* synthetic */ int iW;
    private static /* synthetic */ String[] lIlIlIlIlI;
    private static final /* synthetic */ int iR;
    private static final /* synthetic */ int iU;
    public static /* synthetic */ boolean bn;
    private static final /* synthetic */ int iT;
    static /* synthetic */ int cA;
    private static final /* synthetic */ WorldPoint iM;
    private static /* synthetic */ int[] lIlIlIllII;
    private static final /* synthetic */ int iS;
    static /* synthetic */ String iy;
    static /* synthetic */ String[] hn;
    private static final /* synthetic */ int iN;
    static /* synthetic */ int dc;
    public static /* synthetic */ List<C0003d> bp;

    private static boolean lIIlIIIllIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIlIllII[0];
    }

    private static void lIIlIIIlIlllI() {
        lIlIlIllII = new int[97];
        lIlIlIllII[0] = ((((31 + 35) - 61) + 124) ^ (((138 + 147) - 256) + 135)) & (((48 ^ 90) ^ (126 ^ 49)) ^ (-" ".length()));
        lIlIlIllII[1] = " ".length();
        lIlIlIllII[2] = (((17 ^ 52) + (62 ^ 12)) - (191 ^ 166)) + (64 ^ 34);
        lIlIlIllII[3] = "  ".length();
        lIlIlIllII[4] = "   ".length();
        lIlIlIllII[5] = (-((-24834) & 27991)) & (-33) & 8189;
        lIlIlIllII[6] = (((15 + 145) - 127) + 155) ^ (((120 + 93) - 201) + 172);
        lIlIlIllII[7] = (-((-4871) & 29623)) & (-3) & 32763;
        lIlIlIllII[8] = 78 ^ 68;
        lIlIlIllII[9] = (68 ^ 31) ^ (108 ^ 50);
        lIlIlIllII[10] = (-((-8417) & 28146)) & (-65) & 20351;
        lIlIlIllII[11] = (-6163) & 7162;
        lIlIlIllII[12] = (107 ^ 42) ^ (63 ^ 120);
        lIlIlIllII[13] = (-((-869) & 24551)) & (-8273) & 32511;
        lIlIlIllII[14] = 176 ^ 183;
        lIlIlIllII[15] = (-((-1991) & 30679)) & (-453) & 29695;
        lIlIlIllII[16] = (99 ^ 5) ^ (250 ^ 148);
        lIlIlIllII[17] = (-((-1649) & 28275)) & (-4133) & 32743;
        lIlIlIllII[18] = (106 ^ 35) ^ (17 ^ 81);
        lIlIlIllII[19] = (((137 + 110) - 66) + 0) ^ (((183 + 60) - 235) + 182);
        lIlIlIllII[20] = (-24609) & 32615;
        lIlIlIllII[21] = (-((-2445) & 22989)) & (-10241) & 32254;
        lIlIlIllII[22] = (-((-21953) & 32748)) & (-4113) & 16379;
        lIlIlIllII[23] = (-((-1351) & 30591)) & (-2054) & 32767;
        lIlIlIllII[24] = (-29186) & 30661;
        lIlIlIllII[25] = (-((-601) & 11869)) & (-17025) & 28671;
        lIlIlIllII[26] = (-1026) & 1525;
        lIlIlIllII[27] = (-((-577) & 20203)) & (-517) & 32767;
        lIlIlIllII[28] = (-((-15236) & 16335)) & (-24577) & 28255;
        lIlIlIllII[29] = (-((-2634) & 31693)) & (-21) & 32159;
        lIlIlIllII[30] = 145 ^ 133;
        lIlIlIllII[31] = 1 ^ 14;
        lIlIlIllII[32] = 204 ^ 192;
        lIlIlIllII[33] = (225 ^ 197) ^ (33 ^ 8);
        lIlIlIllII[34] = (183 ^ 174) ^ (100 ^ 115);
        lIlIlIllII[35] = (10 ^ 98) ^ (0 ^ 120);
        lIlIlIllII[36] = (165 ^ 189) ^ (17 ^ 24);
        lIlIlIllII[37] = (-706) & 10215;
        lIlIlIllII[38] = (183 ^ 186) ^ (122 ^ 101);
        lIlIlIllII[39] = (-((-4999) & 21479)) & (-1025) & 26614;
        lIlIlIllII[40] = 165 ^ 182;
        lIlIlIllII[41] = (35 ^ 27) ^ (167 ^ 138);
        lIlIlIllII[42] = 196 ^ 160;
        lIlIlIllII[43] = (-1121) & 1520;
        lIlIlIllII[44] = (89 ^ 49) ^ (65 ^ 63);
        lIlIlIllII[45] = (((9 + 113) - 66) + 91) ^ (((55 + 0) - (-75)) + 57);
        lIlIlIllII[46] = 171 ^ 188;
        lIlIlIllII[47] = (-((-1683) & 28315)) & (-1025) & 32766;
        lIlIlIllII[48] = 186 ^ 162;
        lIlIlIllII[49] = 18 ^ 11;
        lIlIlIllII[50] = (-((-10050) & 26453)) & (-1) & 28383;
        lIlIlIllII[51] = (-((-17245) & 30687)) & (-2066) & 32507;
        lIlIlIllII[52] = 24 ^ 2;
        lIlIlIllII[53] = (-30740) & 32639;
        lIlIlIllII[54] = 42 ^ 49;
        lIlIlIllII[55] = 109 ^ 113;
        lIlIlIllII[56] = 78 ^ 83;
        lIlIlIllII[57] = (47 ^ 52) ^ (142 ^ 139);
        lIlIlIllII[58] = (-((-25205) & 31350)) & (-41) & 8185;
        lIlIlIllII[59] = (-((-16493) & 22653)) & (-16579) & 23294;
        lIlIlIllII[60] = 52 ^ 43;
        lIlIlIllII[61] = 186 ^ 154;
        lIlIlIllII[62] = 149 ^ 180;
        lIlIlIllII[63] = 167 ^ 133;
        lIlIlIllII[64] = 138 ^ 169;
        lIlIlIllII[65] = 10 ^ 46;
        lIlIlIllII[66] = 168 ^ 141;
        lIlIlIllII[67] = (((39 + 11) - 14) + 111) ^ (((166 + 84) - 216) + 147);
        lIlIlIllII[68] = 106 ^ 77;
        lIlIlIllII[69] = 28 ^ 53;
        lIlIlIllII[70] = (173 ^ 160) ^ (59 ^ 28);
        lIlIlIllII[71] = 36 ^ 15;
        lIlIlIllII[72] = (((51 + 57) - 19) + 56) ^ (((7 + 156) - 152) + 178);
        lIlIlIllII[73] = (((53 + 166) - 75) + 28) ^ (((79 + 98) - 164) + 116);
        lIlIlIllII[74] = (((21 + 30) - (-90)) + 16) ^ (((50 + 1) - (-101)) + 27);
        lIlIlIllII[75] = (172 ^ 158) ^ (175 ^ 178);
        lIlIlIllII[76] = (((18 + 64) - 75) + 153) ^ (((118 + 140) - 147) + 33);
        lIlIlIllII[77] = (((116 + 37) - 141) + 178) ^ (((93 + 120) - 178) + 108);
        lIlIlIllII[78] = (83 ^ 122) ^ (24 ^ 3);
        lIlIlIllII[79] = (38 ^ 83) ^ (231 ^ 161);
        lIlIlIllII[80] = (77 ^ 60) ^ (96 ^ 37);
        lIlIlIllII[81] = 23 ^ 34;
        lIlIlIllII[82] = (((139 + 124) - 252) + 129) ^ (((142 + 118) - 90) + 16);
        lIlIlIllII[83] = (188 ^ 158) ^ (48 ^ 37);
        lIlIlIllII[84] = 161 ^ 153;
        lIlIlIllII[85] = (((6 + 135) - (-6)) + 5) ^ (((16 + 41) - (-62)) + 42);
        lIlIlIllII[86] = (-28994) & 29547;
        lIlIlIllII[87] = (-29133) & 32236;
        lIlIlIllII[88] = (-4901) & 8063;
        lIlIlIllII[89] = (250 ^ 195) ^ "   ".length();
        lIlIlIllII[90] = (43 ^ 108) ^ (70 ^ 58);
        lIlIlIllII[91] = 19 ^ 47;
        lIlIlIllII[92] = (20 ^ 57) ^ (158 ^ 142);
        lIlIlIllII[93] = (((27 + 70) - 22) + 69) ^ (((6 + 97) - 37) + 108);
        lIlIlIllII[94] = 145 ^ 174;
        lIlIlIllII[95] = (7 ^ 17) ^ (227 ^ 181);
        lIlIlIllII[96] = (122 ^ 125) ^ (135 ^ 193);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIIIllIlll(C0004e.j(lIlIlIllII[2]), lIlIlIllII[3])) {
            ?? r0 = lIlIlIllII[1];
            "".length();
            return (148 ^ 144) < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIllII[0];
    }

    private static boolean lIIlIIIllIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIIIllIlIl(int i, int i2) {
        return i != i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIlIlIlI[lIlIlIllII[84]];
    }

    private static boolean lIIlIIIllIIll(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIlIllll(int i) {
        return i != 0;
    }

    private static String lIIlIIIlIlIII(String lllllllllllllllllllIllIlllIlIlII, String lllllllllllllllllllIllIlllIlIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIllIlllIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIllIlllIlIIll.toCharArray();
        int lllllllllllllllllllIllIlllIlIIII = lIlIlIllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIllII[0];
        while (lIIlIIIllIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIllIlllIlIIII % charArray.length]));
            "".length();
            lllllllllllllllllllIllIlllIlIIII++;
            i++;
            "".length();
            if (((" ".length() ^ (98 ^ 125)) & (((169 ^ 130) ^ (125 ^ 72)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIlIIIlIlllI();
        lIIlIIIlIllIl();
        iS = lIlIlIllII[10];
        iR = lIlIlIllII[24];
        iQ = lIlIlIllII[23];
        iU = lIlIlIllII[13];
        iW = lIlIlIllII[25];
        iV = lIlIlIllII[86];
        iN = lIlIlIllII[2];
        iP = lIlIlIllII[22];
        iT = lIlIlIllII[15];
        iO = lIlIlIllII[21];
        iX = lIlIlIllII[17];
        iM = new WorldPoint(lIlIlIllII[87], lIlIlIllII[88], lIlIlIllII[3]);
        bp = new ArrayList();
        iy = lIlIlIlIlI[lIlIlIllII[89]];
        String[] strArr = new String[lIlIlIllII[12]];
        strArr[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[90]];
        strArr[lIlIlIllII[1]] = lIlIlIlIlI[lIlIlIllII[91]];
        strArr[lIlIlIllII[3]] = lIlIlIlIlI[lIlIlIllII[92]];
        strArr[lIlIlIllII[4]] = lIlIlIlIlI[lIlIlIllII[93]];
        strArr[lIlIlIllII[6]] = lIlIlIlIlI[lIlIlIllII[94]];
        strArr[lIlIlIllII[9]] = lIlIlIlIlI[lIlIlIllII[95]];
        hn = strArr;
        cA = lIlIlIllII[0];
    }

    private static void lIIlIIIlIllIl() {
        lIlIlIlIlI = new String[lIlIlIllII[96]];
        lIlIlIlIlI[lIlIlIllII[0]] = lIIlIIIlIIlll("iGotk5SfTyKxC2Jh0m7dag==", "QiSFi");
        lIlIlIlIlI[lIlIlIllII[1]] = lIIlIIIlIlIII("CAUJHiomCQNXOzsVDhk+bgUTEjQ9QEcELicYBB8wIAtHFTgtB0cDNm4dEhIqOgUJEA==", "NlgwY");
        lIlIlIlIlI[lIlIlIllII[3]] = lIIlIIIlIlIII("FA4SCzE7Gw0MMXobC0I0OwEP", "ZodbV");
        lIlIlIlIlI[lIlIlIllII[4]] = lIIlIIIlIlIII("LSM/PSoMNHoxIgw4", "bSZSC");
        lIlIlIlIlI[lIlIlIllII[6]] = lIIlIIIlIlIII("MTsBHRgQNAhZFhg0BBAaHg==", "yZoyt");
        lIlIlIlIlI[lIlIlIllII[9]] = lIIlIIIlIIlll("xxiSy7QX75Zm7PMPMSlcSgkAmFqoYv8R5f4ydN5hcC1ZDncxDOyJEsSQZAkeV/dk", "WFsxe");
        lIlIlIlIlI[lIlIlIllII[12]] = lIIlIIIlIIlll("Ldv8TlbXwehkO5DL2pyPPltS8B3OxpGZVHdkJoU3GtqV8Z/SNJPLH5O2F/VAgoZu", "DWuBA");
        lIlIlIlIlI[lIlIlIllII[14]] = lIIlIIIlIIlll("+2aNtypUcj7vWoTimjax9sbu/TheFKRe/HVy+bS+Cncg3MT/sX9futQO3bvlpz1T", "CdXwE");
        lIlIlIlIlI[lIlIlIllII[16]] = lIIlIIIlIIlll("Kp6NuKSkIYtHHN6MOVWPfNkitPDC7N2gAiDl2eAAy49TsW2DymIkIB0I9VHov9L5", "IfSEY");
        lIlIlIlIlI[lIlIlIllII[18]] = lIIlIIIlIIlll("4oYG8yAjifxEpKHCVO7hG+pXVOnwmQqp5O7VeSsqSI1SEzwgD7wwZq7L/Ck63ZWS", "RGuDX");
        lIlIlIlIlI[lIlIlIllII[8]] = lIIlIIIlIIlll("mGXrRwdNITluLG6q9V6/rGONqW8XVglxWFuXPFKDtFysNzV/P3mXglntWZtwOYm6", "HaiQR");
        lIlIlIlIlI[lIlIlIllII[19]] = lIIlIIIlIIlll("9dxLn3Q3yxWQ9ApLbZEG9PDMxQD/1t4O", "QfxHk");
        lIlIlIlIlI[lIlIlIllII[32]] = lIIlIIIlIlIII("Fyg+CjF6GTYRJjsl", "ZIYcR");
        lIlIlIlIlI[lIlIlIllII[33]] = lIIlIIIlIlIIl("DZ/8ACPONrs=", "ggyrz");
        lIlIlIlIlI[lIlIlIllII[34]] = lIIlIIIlIIlll("TRzN/H2DSObfX+09DQWQiw==", "Hpmct");
        lIlIlIlIlI[lIlIlIllII[31]] = lIIlIIIlIlIII("NhURZgIXVBQyFwoA", "xtgFv");
        lIlIlIlIlI[lIlIlIllII[35]] = lIIlIIIlIIlll("h2zzXoQNbdfAuCgpJ8lQTg==", "FMIrP");
        lIlIlIlIlI[lIlIlIllII[36]] = lIIlIIIlIlIIl("gkxfHFDHYOu60FYJvv8d9z52qya4pJuPCt1DrWuD47E=", "FcpPU");
        lIlIlIlIlI[lIlIlIllII[38]] = lIIlIIIlIIlll("Orqj5m14a7AzX+dryo/nV/W5AT3DQw4P5iPh1Rh/R+Y=", "iHzuJ");
        lIlIlIlIlI[lIlIlIllII[40]] = lIIlIIIlIlIII("MT4KIT0XegwkMhMxTio2ET5OPDxQOBsxcxwzHTw=", "pZnHS");
        lIlIlIlIlI[lIlIlIllII[30]] = lIIlIIIlIIlll("C0I84pvXxsqFH5kIAl9kV/HtiARth4vERPSY4bP3hZ4=", "CEfjc");
        lIlIlIlIlI[lIlIlIllII[41]] = lIIlIIIlIIlll("gAGWxfGIdxufnbIe8LitPdTxpv2UPwDiZ5hgGfZwuvg=", "TYKSG");
        lIlIlIlIlI[lIlIlIllII[44]] = lIIlIIIlIIlll("3PVribca8nmHfokj46nmhlt1p0CzfHKquunmrHBM2jI=", "tdmPA");
        lIlIlIlIlI[lIlIlIllII[46]] = lIIlIIIlIIlll("5J2FaV/6tSI3bexqem8yNF8/2SOCSHIjJ1xZz20BiGE=", "XYmSg");
        lIlIlIlIlI[lIlIlIllII[48]] = lIIlIIIlIIlll("SXM6YvUurL0UQaQS/F1P/PHg8WASNTo9uiSDXnvNNLQ=", "LjqEN");
        lIlIlIlIlI[lIlIlIllII[49]] = lIIlIIIlIlIII("EBEcChw2VQ8GEz0BEEMGPlUaFgtxGREQBg==", "Quxcr");
        lIlIlIlIlI[lIlIlIllII[52]] = lIIlIIIlIlIIl("GG/qZdIhpZ8uaoAIenBKrn9lTLzFTyBQzX0LxA6wHtU=", "vKIpT");
        lIlIlIlIlI[lIlIlIllII[54]] = lIIlIIIlIlIII("KiwVJh4MaBcuHAcxUTsRCTtROx9LKgQ2UAchAjs=", "kHqOp");
        lIlIlIlIlI[lIlIlIllII[55]] = lIIlIIIlIIlll("v3/GMH7U9lEdQs5BSA4spNodPZL6HkUXjl4LT6pfGw4=", "VRiwW");
        lIlIlIlIlI[lIlIlIllII[56]] = lIIlIIIlIlIIl("panSJQnppmi5nynSTBL7IYcaeXObJGIS2e20zig4Oz8=", "RNsuW");
        lIlIlIlIlI[lIlIlIllII[57]] = lIIlIIIlIlIII("Cj4LJyYsegInJi96HTsmLilPOidrOBo3aCczHDo=", "KZoNH");
        lIlIlIlIlI[lIlIlIllII[60]] = lIIlIIIlIlIII("GAUjHQ0+QSYdEXkTMhoGKkEzG0M7FD5UDzASMw==", "YaGtc");
        lIlIlIlIlI[lIlIlIllII[61]] = lIIlIIIlIlIII("GCUMPzo+YR83IDwzSCQhNyQbdiA2YQojLXktASUg", "YAhVT");
        lIlIlIlIlI[lIlIlIllII[62]] = lIIlIIIlIlIIl("ApT6c1toqGve5ZFZAtYUNDn2VTMh9NZJ/Wmc4wAa3f4=", "kQOqs");
        lIlIlIlIlI[lIlIlIllII[63]] = lIIlIIIlIlIII("FgM2ITQwRzMhKHcVJyY/JEcmJ3o1EitoNj4UJg==", "WgRHZ");
        lIlIlIlIlI[lIlIlIllII[64]] = lIIlIIIlIlIII("MTQmMwQXcDU7HhUiYigfHjUxeh4fcCAvE1A8Kyke", "pPBZj");
        lIlIlIlIlI[lIlIlIllII[65]] = lIIlIIIlIlIIl("5j6UqCyONRxpWI094kuFRH69LICQDbPPuu2caUQJ8io=", "idIEh");
        lIlIlIlIlI[lIlIlIllII[66]] = lIIlIIIlIlIIl("A2vCUUT8v22YIe5go4hoGfj9mXQwCVWxx3g9RSjs6H0=", "TIAuc");
        lIlIlIlIlI[lIlIlIllII[67]] = lIIlIIIlIIlll("uS2Try1FqsWU93EerCrvrw==", "svBVh");
        lIlIlIlIlI[lIlIlIllII[68]] = lIIlIIIlIlIII("EzYLKiI9cwUjLC4=", "JSgFM");
        lIlIlIlIlI[lIlIlIllII[45]] = lIIlIIIlIlIII("BiAmEA5kLiISAQ==", "DLGse");
        lIlIlIlIlI[lIlIlIllII[69]] = lIIlIIIlIlIII("NT4fAiRCNBMXJQ==", "bVvvA");
        lIlIlIlIlI[lIlIlIllII[70]] = lIIlIIIlIlIIl("Fbx5tbo02WE=", "SEhqR");
        lIlIlIlIlI[lIlIlIllII[71]] = lIIlIIIlIIlll("FjGEi2z8Rv9mzMR293RO7Q39uQQr42Gd", "uPcjp");
        lIlIlIlIlI[lIlIlIllII[72]] = lIIlIIIlIlIII("GRYHJD84AUIoNzgN", "VfbJV");
        lIlIlIlIlI[lIlIlIllII[73]] = lIIlIIIlIlIII("DDI/NggtPTZyBiU9OjsKIw==", "DSQRd");
        lIlIlIlIlI[lIlIlIllII[74]] = lIIlIIIlIIlll("SdPGXxdB9HvJPx8vDAt/Ag==", "mSTfg");
        lIlIlIlIlI[lIlIlIllII[75]] = lIIlIIIlIIlll("qH1IaI98lUViV46tQNbAuw==", "WVjyx");
        lIlIlIlIlI[lIlIlIllII[76]] = lIIlIIIlIIlll("2C49iKxzan9fo4+c3zksM0+I01rZrFuy4//v9d8fadCz2RwSvIugWwcJLkQgvMgs", "dddyG");
        lIlIlIlIlI[lIlIlIllII[77]] = lIIlIIIlIlIII("KwU6MAxOFj0qAQ==", "ndHDd");
        lIlIlIlIlI[lIlIlIllII[78]] = lIIlIIIlIlIII("MjsKDgdXKA0UCg==", "wZxzo");
        lIlIlIlIlI[lIlIlIllII[79]] = lIIlIIIlIIlll("j3qSW7fYWWbWtmhlcWvABMu9G83ez57CdrXCr19XBaTdCYYGIh42db32AJD8p6SF", "xjjRB");
        lIlIlIlIlI[lIlIlIllII[80]] = lIIlIIIlIlIIl("mV0uhJVuh7luLc8PzyRafQ==", "fmTFl");
        lIlIlIlIlI[lIlIlIllII[81]] = lIIlIIIlIlIIl("5KZFPf1bh/gnluo4Ka73Xg==", "utHle");
        lIlIlIlIlI[lIlIlIllII[82]] = lIIlIIIlIlIII("ISJGND8TZws8PgUuCDJtBTIWJSEfIhV5bQUwDyEuHi4IMm0CKEYXGC8OKBI=", "vGfUM");
        lIlIlIlIlI[lIlIlIllII[83]] = lIIlIIIlIlIII("LSBiNxAfZS8/EQksLDFCCTAyJg4TIDF6QgkyKyIBEiwsMUIOKmIUNyMMDBE=", "zEBVb");
        lIlIlIlIlI[lIlIlIllII[84]] = lIIlIIIlIIlll("Dt/oCJ72/XZRnunl1m0eUU3UM5+flWZq", "MUHqM");
        lIlIlIlIlI[lIlIlIllII[85]] = lIIlIIIlIIlll("nx3loNPXQR6SbYqV24tXHVi8ijvapsJd", "icLpO");
        lIlIlIlIlI[lIlIlIllII[89]] = lIIlIIIlIIlll("DU+dRyltPgM1NA2xJGVZKg==", "gglZN");
        lIlIlIlIlI[lIlIlIllII[90]] = lIIlIIIlIIlll("s6/6xLmlF7kBpjnndMRMuhDbJWWA5AIR", "NysnK");
        lIlIlIlIlI[lIlIlIllII[91]] = lIIlIIIlIIlll("xdTAVg9LZcyN3o+rpoGRdQ==", "PtVTY");
        lIlIlIlIlI[lIlIlIllII[92]] = lIIlIIIlIlIIl("5D5LrpLSxIWfapb/Jx+kV3xWotwS7FWNIigKsY7OPh4M1sQIon0q7cVTLmLXDbZJ", "LpDGu");
        lIlIlIlIlI[lIlIlIllII[93]] = lIIlIIIlIIlll("J1mhL4t2Cr0=", "NTBMl");
        lIlIlIlIlI[lIlIlIllII[94]] = lIIlIIIlIlIII("HRk7JGU5US44J2ocOyQ2LwNl", "JqZPB");
        lIlIlIlIlI[lIlIlIllII[95]] = lIIlIIIlIlIII("HRhgYxN1HyBjKTcWbDQyMwdsCnoxEiJjPj1d", "RsLCZ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v245, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v254, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v263, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v272, types: [boolean] */
    private static void ci() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIlIIIllIIlI(nearest) && lIIlIIIllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[71]];
            C0000a.a(nearest);
        }
        if (lIIlIIIllIIlI(nearest) && lIIlIIIlIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[72]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIlIlIllII[5]);
                "".length();
            }
            if (lIIlIIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[73]];
                if (lIIlIIIllIIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIlIlIllII[4]);
                    "".length();
                }
                if (lIIlIIIllIIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIlIlIllII[3]);
                    "".length();
                }
                String[] strArr = new String[lIlIlIllII[1]];
                strArr[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[74]];
                if (lIIlIIIlIllll(Bank.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIlIllII[1]];
                    strArr2[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[75]];
                    if (lIIlIIIllIIII(Bank.getFirst(strArr2).getQuantity(), lIlIlIllII[11])) {
                        O();
                        System.out.println(lIlIlIlIlI[lIlIlIllII[76]]);
                        bn = lIlIlIllII[1];
                        return;
                    }
                }
                String[] strArr3 = new String[lIlIlIllII[1]];
                strArr3[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[77]];
                if (lIIlIIIlIllll(Bank.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIlIllII[1]];
                    strArr4[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[78]];
                    if (lIIlIIIllIIII(Bank.getFirst(strArr4).getQuantity(), lIlIlIllII[11])) {
                        O();
                        System.out.println(lIlIlIlIlI[lIlIlIllII[79]]);
                        bn = lIlIlIllII[1];
                        return;
                    }
                }
                String[] strArr5 = new String[lIlIlIllII[1]];
                strArr5[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[80]];
                if (lIIlIIIlIllll(Bank.contains(strArr5) ? 1 : 0)) {
                    String[] strArr6 = new String[lIlIlIllII[1]];
                    strArr6[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[81]];
                    if (lIIlIIIllIIII(Bank.getFirst(strArr6).getQuantity(), lIlIlIllII[11])) {
                        O();
                        System.out.println(lIlIlIlIlI[lIlIlIllII[82]]);
                        bn = lIlIlIllII[1];
                        return;
                    }
                }
                int[] iArr = new int[lIlIlIllII[19]];
                iArr[lIlIlIllII[0]] = lIlIlIllII[20];
                iArr[lIlIlIllII[1]] = lIlIlIllII[21];
                iArr[lIlIlIllII[3]] = lIlIlIllII[22];
                iArr[lIlIlIllII[4]] = lIlIlIllII[23];
                iArr[lIlIlIllII[6]] = lIlIlIllII[24];
                iArr[lIlIlIllII[9]] = lIlIlIllII[7];
                iArr[lIlIlIllII[12]] = lIlIlIllII[17];
                iArr[lIlIlIllII[14]] = lIlIlIllII[25];
                iArr[lIlIlIllII[16]] = lIlIlIllII[10];
                iArr[lIlIlIllII[18]] = lIlIlIllII[15];
                iArr[lIlIlIllII[8]] = lIlIlIllII[13];
                if (lIIlIIIllIIIl(C0004e.b(iArr) ? 1 : 0)) {
                    O();
                    System.out.println(lIlIlIlIlI[lIlIlIllII[83]]);
                    bn = lIlIlIllII[1];
                    return;
                }
                while (lIIlIIIllIIIl(C0024y.bv() ? 1 : 0)) {
                    C0024y.bt();
                    Time.sleepTicks(lIlIlIllII[1]);
                    "".length();
                    "".length();
                    if (((19 ^ 74) ^ (237 ^ 176)) < " ".length()) {
                        return;
                    }
                }
                if (lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIlIlIllII[6]);
                    "".length();
                }
                int[] iArr2 = new int[lIlIlIllII[1]];
                iArr2[lIlIlIllII[0]] = lIlIlIllII[22];
                if (lIIlIIIlIllll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIlIllII[1]];
                    iArr3[lIlIlIllII[0]] = lIlIlIllII[22];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr3), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[22], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIlIlIllII[1]];
                            iArr4[lIlIlIllII[0]] = lIlIlIllII[22];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr4))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return "  ".length() <= (((126 ^ 27) ^ (118 ^ 87)) & (((((104 + 22) - (-3)) + 6) ^ (((66 + 35) - (-63)) + 31)) ^ (-" ".length()))) ? ((((83 + 86) - (-50)) + 9) ^ (((19 + 85) - 8) + 84)) & (((((68 + 131) - 50) + 88) ^ (((112 + 151) - 140) + 66)) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr4 = new int[lIlIlIllII[1]];
                iArr4[lIlIlIllII[0]] = lIlIlIllII[23];
                if (lIIlIIIlIllll(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIlIlIllII[1]];
                    iArr5[lIlIlIllII[0]] = lIlIlIllII[23];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr5), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[23], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr6 = new int[lIlIlIllII[1]];
                            iArr6[lIlIlIllII[0]] = lIlIlIllII[23];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr6))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return (-"  ".length()) >= 0 ? ((111 ^ 69) ^ (23 ^ 125)) & (((132 ^ 196) ^ ((111 ^ 67) & ((102 ^ 74) ^ (-1)))) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr6 = new int[lIlIlIllII[1]];
                iArr6[lIlIlIllII[0]] = lIlIlIllII[21];
                if (lIIlIIIlIllll(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIlIlIllII[1]];
                    iArr7[lIlIlIllII[0]] = lIlIlIllII[21];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr7), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[21], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr8 = new int[lIlIlIllII[1]];
                            iArr8[lIlIlIllII[0]] = lIlIlIllII[21];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr8))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr8 = new int[lIlIlIllII[1]];
                iArr8[lIlIlIllII[0]] = lIlIlIllII[24];
                if (lIIlIIIlIllll(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIlIlIllII[1]];
                    iArr9[lIlIlIllII[0]] = lIlIlIllII[24];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr9), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[24], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[lIlIlIllII[1]];
                            iArr10[lIlIlIllII[0]] = lIlIlIllII[24];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr10))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return (114 ^ 118) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr10 = new int[lIlIlIllII[1]];
                iArr10[lIlIlIllII[0]] = lIlIlIllII[7];
                if (lIIlIIIlIllll(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIlIlIllII[1]];
                    iArr11[lIlIlIllII[0]] = lIlIlIllII[7];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr11), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[7], lIlIlIllII[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[lIlIlIllII[1]];
                            iArr12[lIlIlIllII[0]] = lIlIlIllII[7];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr12))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr12 = new int[lIlIlIllII[1]];
                iArr12[lIlIlIllII[0]] = lIlIlIllII[17];
                if (lIIlIIIlIllll(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[lIlIlIllII[1]];
                    iArr13[lIlIlIllII[0]] = lIlIlIllII[17];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr13), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[17], lIlIlIllII[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lIlIlIllII[1]];
                            iArr14[lIlIlIllII[0]] = lIlIlIllII[17];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr14))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return 0 != 0 ? ((((123 + 177) - 199) + 82) ^ (((107 + 117) - 127) + 79)) & (((((42 + 46) - 28) + 119) ^ (((152 + 175) - 255) + 108)) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr14 = new int[lIlIlIllII[1]];
                iArr14[lIlIlIllII[0]] = lIlIlIllII[10];
                if (lIIlIIIlIllll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIlIllII[1]];
                    iArr15[lIlIlIllII[0]] = lIlIlIllII[10];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr15), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[10], lIlIlIllII[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIlIlIllII[1]];
                            iArr16[lIlIlIllII[0]] = lIlIlIllII[10];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr16))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return (-"   ".length()) > 0 ? ((113 ^ 71) ^ (62 ^ 45)) & (((79 ^ 115) ^ (113 ^ 104)) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIlIlIllII[1]];
                iArr16[lIlIlIllII[0]] = lIlIlIllII[15];
                if (lIIlIIIlIllll(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIlIlIllII[1]];
                    iArr17[lIlIlIllII[0]] = lIlIlIllII[15];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr17), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[15], lIlIlIllII[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIlIlIllII[1]];
                            iArr18[lIlIlIllII[0]] = lIlIlIllII[15];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr18))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return ((103 ^ 63) & ((104 ^ 48) ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIlIlIllII[1]];
                iArr18[lIlIlIllII[0]] = lIlIlIllII[13];
                if (lIIlIIIlIllll(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIlIlIllII[1]];
                    iArr19[lIlIlIllII[0]] = lIlIlIllII[13];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr19), lIlIlIllII[1])) {
                        Bank.withdraw(lIlIlIllII[13], lIlIlIllII[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIlIlIllII[1]];
                            iArr20[lIlIlIllII[0]] = lIlIlIllII[13];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr20))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return " ".length() == 0 ? ((((54 + 121) - 136) + 112) ^ (((170 + 85) - 234) + 178)) & (((8 ^ 106) ^ (33 ^ 19)) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlIlIllII[1]];
                iArr20[lIlIlIllII[0]] = lIlIlIllII[27];
                if (lIIlIIIlIllll(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIlIlIllII[1]];
                    iArr21[lIlIlIllII[0]] = lIlIlIllII[27];
                    if (lIIlIIIllIIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                        Bank.withdraw(lIlIlIllII[27], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIlIlIllII[1]];
                            iArr22[lIlIlIllII[0]] = lIlIlIllII[27];
                            return Inventory.contains(iArr22);
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIlIlIllII[1]];
                iArr22[lIlIlIllII[0]] = lIlIlIllII[25];
                if (lIIlIIIlIllll(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIlIlIllII[1]];
                    iArr23[lIlIlIllII[0]] = lIlIlIllII[25];
                    if (lIIlIIIllIIII(Inventory.getCount(iArr23), lIlIlIllII[1])) {
                        Bank.withdrawAll(lIlIlIllII[25], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIlIlIllII[1]];
                            iArr24[lIlIlIllII[0]] = lIlIlIllII[25];
                            if (lIIlIIIllIIll(Inventory.getCount(iArr24))) {
                                ?? r0 = lIlIlIllII[1];
                                "".length();
                                return (((((28 + 59) - (-102)) + 41) ^ (((37 + 125) - 76) + 106)) & (((146 ^ 133) ^ (83 ^ 98)) ^ (-" ".length()))) < 0 ? ((201 ^ 134) ^ (246 ^ 178)) & (((223 ^ 186) ^ (203 ^ 165)) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIllII[0];
                        }, lIlIlIllII[5]);
                        "".length();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v375, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v384, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v393, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v402, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v411, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v437, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public static void ch() {
        if (lIIlIIIlIllll(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[0]];
            C0001b.a(bp);
            if (lIIlIIIllIIII(bp.size(), lIlIlIllII[1])) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[1]]);
                bn = lIlIlIllII[0];
            }
        }
        if (lIIlIIIllIIIl(bn ? 1 : 0)) {
            if (lIIlIIIllIIIl(C0004e.j(lIlIlIllII[2]))) {
                if (lIIlIIIllIIIl(aK() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIlIIIllIIlI(nearest) && lIIlIIIllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[3]];
                        C0000a.a(nearest);
                    }
                    if (lIIlIIIllIIlI(nearest) && lIIlIIIlIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[4]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIlIlIllII[5]);
                            "".length();
                        }
                        if (lIIlIIIlIllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[6]];
                            if (lIIlIIIllIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIlIlIllII[4]);
                                "".length();
                            }
                            if (lIIlIIIllIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIlIlIllII[3]);
                                "".length();
                            }
                            int[] iArr = new int[lIlIlIllII[1]];
                            iArr[lIlIlIllII[0]] = lIlIlIllII[7];
                            if (lIIlIIIlIllll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlIlIllII[1]];
                                iArr2[lIlIlIllII[0]] = lIlIlIllII[7];
                                if (lIIlIIIllIIII(Bank.getFirst(iArr2).getQuantity(), lIlIlIllII[8])) {
                                    O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[9]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lIlIlIllII[1]];
                            iArr3[lIlIlIllII[0]] = lIlIlIllII[10];
                            if (lIIlIIIlIllll(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlIlIllII[1]];
                                iArr4[lIlIlIllII[0]] = lIlIlIllII[10];
                                if (lIIlIIIllIIII(Bank.getFirst(iArr4).getQuantity(), lIlIlIllII[11])) {
                                    O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[12]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] iArr5 = new int[lIlIlIllII[1]];
                            iArr5[lIlIlIllII[0]] = lIlIlIllII[13];
                            if (lIIlIIIlIllll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIlIllII[1]];
                                iArr6[lIlIlIllII[0]] = lIlIlIllII[13];
                                if (lIIlIIIllIIII(Bank.getFirst(iArr6).getQuantity(), lIlIlIllII[11])) {
                                    O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[14]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] iArr7 = new int[lIlIlIllII[1]];
                            iArr7[lIlIlIllII[0]] = lIlIlIllII[15];
                            if (lIIlIIIlIllll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlIlIllII[1]];
                                iArr8[lIlIlIllII[0]] = lIlIlIllII[15];
                                if (lIIlIIIllIIII(Bank.getFirst(iArr8).getQuantity(), lIlIlIllII[11])) {
                                    O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[16]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] iArr9 = new int[lIlIlIllII[1]];
                            iArr9[lIlIlIllII[0]] = lIlIlIllII[17];
                            if (lIIlIIIlIllll(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlIlIllII[1]];
                                iArr10[lIlIlIllII[0]] = lIlIlIllII[17];
                                if (lIIlIIIllIIII(Bank.getFirst(iArr10).getQuantity(), lIlIlIllII[9])) {
                                    O();
                                    System.out.println(lIlIlIlIlI[lIlIlIllII[18]]);
                                    bn = lIlIlIllII[1];
                                    return;
                                }
                            }
                            int[] iArr11 = new int[lIlIlIllII[19]];
                            iArr11[lIlIlIllII[0]] = lIlIlIllII[20];
                            iArr11[lIlIlIllII[1]] = lIlIlIllII[21];
                            iArr11[lIlIlIllII[3]] = lIlIlIllII[22];
                            iArr11[lIlIlIllII[4]] = lIlIlIllII[23];
                            iArr11[lIlIlIllII[6]] = lIlIlIllII[24];
                            iArr11[lIlIlIllII[9]] = lIlIlIllII[7];
                            iArr11[lIlIlIllII[12]] = lIlIlIllII[17];
                            iArr11[lIlIlIllII[14]] = lIlIlIllII[25];
                            iArr11[lIlIlIllII[16]] = lIlIlIllII[10];
                            iArr11[lIlIlIllII[18]] = lIlIlIllII[15];
                            iArr11[lIlIlIllII[8]] = lIlIlIllII[13];
                            if (lIIlIIIllIIIl(C0004e.b(iArr11) ? 1 : 0)) {
                                O();
                                System.out.println(lIlIlIlIlI[lIlIlIllII[8]]);
                                bn = lIlIlIllII[1];
                                return;
                            }
                            while (lIIlIIIllIIIl(C0024y.bv() ? 1 : 0)) {
                                C0024y.bt();
                                Time.sleepTicks(lIlIlIllII[1]);
                                "".length();
                                "".length();
                                if (" ".length() <= (((28 ^ 124) ^ (203 ^ 164)) & (((8 ^ 39) ^ (131 ^ 163)) ^ (-" ".length())))) {
                                    return;
                                }
                            }
                            if (lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIlIlIllII[6]);
                                "".length();
                            }
                            int[] iArr12 = new int[lIlIlIllII[1]];
                            iArr12[lIlIlIllII[0]] = lIlIlIllII[22];
                            if (lIIlIIIlIllll(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlIlIllII[1]];
                                iArr13[lIlIlIllII[0]] = lIlIlIllII[22];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr13), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[22], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr14 = new int[lIlIlIllII[1]];
                                        iArr14[lIlIlIllII[0]] = lIlIlIllII[22];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr14))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr14 = new int[lIlIlIllII[1]];
                            iArr14[lIlIlIllII[0]] = lIlIlIllII[23];
                            if (lIIlIIIlIllll(Bank.contains(iArr14) ? 1 : 0)) {
                                int[] iArr15 = new int[lIlIlIllII[1]];
                                iArr15[lIlIlIllII[0]] = lIlIlIllII[23];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr15), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[23], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr16 = new int[lIlIlIllII[1]];
                                        iArr16[lIlIlIllII[0]] = lIlIlIllII[23];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr16))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return 0 != 0 ? ((((54 + 202) - 126) + 109) ^ (((64 + 87) - 48) + 37)) & (((214 ^ 149) ^ (26 ^ 58)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr16 = new int[lIlIlIllII[1]];
                            iArr16[lIlIlIllII[0]] = lIlIlIllII[21];
                            if (lIIlIIIlIllll(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lIlIlIllII[1]];
                                iArr17[lIlIlIllII[0]] = lIlIlIllII[21];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr17), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[21], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr18 = new int[lIlIlIllII[1]];
                                        iArr18[lIlIlIllII[0]] = lIlIlIllII[21];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr18))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return ((79 ^ 118) ^ (32 ^ 29)) <= "  ".length() ? ((((130 + 124) - 230) + 144) ^ (((80 + 39) - 63) + 86)) & (((39 ^ 61) ^ (180 ^ 136)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr18 = new int[lIlIlIllII[1]];
                            iArr18[lIlIlIllII[0]] = lIlIlIllII[24];
                            if (lIIlIIIlIllll(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIlIlIllII[1]];
                                iArr19[lIlIlIllII[0]] = lIlIlIllII[24];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr19), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[24], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr20 = new int[lIlIlIllII[1]];
                                        iArr20[lIlIlIllII[0]] = lIlIlIllII[24];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr20))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return (((((141 + 94) - 96) + 23) ^ (((122 + 67) - 22) + 5)) & (((63 ^ 38) ^ (210 ^ 197)) ^ (-" ".length()))) == "   ".length() ? ((((85 + 118) - 91) + 61) ^ (((20 + 46) - (-96)) + 0)) & (((48 ^ 52) ^ (8 ^ 3)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr20 = new int[lIlIlIllII[1]];
                            iArr20[lIlIlIllII[0]] = lIlIlIllII[7];
                            if (lIIlIIIlIllll(Bank.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIlIlIllII[1]];
                                iArr21[lIlIlIllII[0]] = lIlIlIllII[7];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr21), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[7], lIlIlIllII[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr22 = new int[lIlIlIllII[1]];
                                        iArr22[lIlIlIllII[0]] = lIlIlIllII[7];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr22))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return "   ".length() != "   ".length() ? ((102 ^ 86) ^ (38 ^ 73)) & (((((11 + 105) - 84) + 221) ^ (((42 + 14) - (-28)) + 78)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr22 = new int[lIlIlIllII[1]];
                            iArr22[lIlIlIllII[0]] = lIlIlIllII[17];
                            if (lIIlIIIlIllll(Bank.contains(iArr22) ? 1 : 0)) {
                                int[] iArr23 = new int[lIlIlIllII[1]];
                                iArr23[lIlIlIllII[0]] = lIlIlIllII[17];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr23), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[17], lIlIlIllII[6], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr24 = new int[lIlIlIllII[1]];
                                        iArr24[lIlIlIllII[0]] = lIlIlIllII[17];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr24))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return (-(69 ^ 64)) >= 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr24 = new int[lIlIlIllII[1]];
                            iArr24[lIlIlIllII[0]] = lIlIlIllII[10];
                            if (lIIlIIIlIllll(Bank.contains(iArr24) ? 1 : 0)) {
                                int[] iArr25 = new int[lIlIlIllII[1]];
                                iArr25[lIlIlIllII[0]] = lIlIlIllII[10];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr25), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[10], lIlIlIllII[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr26 = new int[lIlIlIllII[1]];
                                        iArr26[lIlIlIllII[0]] = lIlIlIllII[10];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr26))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr26 = new int[lIlIlIllII[1]];
                            iArr26[lIlIlIllII[0]] = lIlIlIllII[15];
                            if (lIIlIIIlIllll(Bank.contains(iArr26) ? 1 : 0)) {
                                int[] iArr27 = new int[lIlIlIllII[1]];
                                iArr27[lIlIlIllII[0]] = lIlIlIllII[15];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr27), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[15], lIlIlIllII[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr28 = new int[lIlIlIllII[1]];
                                        iArr28[lIlIlIllII[0]] = lIlIlIllII[15];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr28))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr28 = new int[lIlIlIllII[1]];
                            iArr28[lIlIlIllII[0]] = lIlIlIllII[13];
                            if (lIIlIIIlIllll(Bank.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[lIlIlIllII[1]];
                                iArr29[lIlIlIllII[0]] = lIlIlIllII[13];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr29), lIlIlIllII[1])) {
                                    Bank.withdraw(lIlIlIllII[13], lIlIlIllII[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr30 = new int[lIlIlIllII[1]];
                                        iArr30[lIlIlIllII[0]] = lIlIlIllII[13];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr30))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return (-" ".length()) == ((245 ^ 170) & ((51 ^ 108) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr30 = new int[lIlIlIllII[1]];
                            iArr30[lIlIlIllII[0]] = lIlIlIllII[27];
                            if (lIIlIIIlIllll(Bank.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[lIlIlIllII[1]];
                                iArr31[lIlIlIllII[0]] = lIlIlIllII[27];
                                if (lIIlIIIllIIIl(Inventory.contains(iArr31) ? 1 : 0)) {
                                    Bank.withdraw(lIlIlIllII[27], lIlIlIllII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr32 = new int[lIlIlIllII[1]];
                                        iArr32[lIlIlIllII[0]] = lIlIlIllII[27];
                                        return Inventory.contains(iArr32);
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr32 = new int[lIlIlIllII[1]];
                            iArr32[lIlIlIllII[0]] = lIlIlIllII[25];
                            if (lIIlIIIlIllll(Bank.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lIlIlIllII[1]];
                                iArr33[lIlIlIllII[0]] = lIlIlIllII[25];
                                if (lIIlIIIllIIII(Inventory.getCount(iArr33), lIlIlIllII[1])) {
                                    Bank.withdrawAll(lIlIlIllII[25], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIllII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr34 = new int[lIlIlIllII[1]];
                                        iArr34[lIlIlIllII[0]] = lIlIlIllII[25];
                                        if (lIIlIIIllIIll(Inventory.getCount(iArr34))) {
                                            ?? r0 = lIlIlIllII[1];
                                            "".length();
                                            return ((((35 + 117) - (-5)) + 3) ^ (((120 + 106) - 83) + 21)) < "  ".length() ? ((218 ^ 129) ^ (148 ^ 158)) & (((50 ^ 84) ^ (119 ^ 64)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIllII[0];
                                    }, lIlIlIllII[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (lIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[6]) && lIIlIIIllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIlIlIllII[3]) && lIIlIIIlIllll(aK() ? 1 : 0)) {
                    if (lIIlIIIlIllll(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(lIlIlIllII[6]);
                        "".length();
                    }
                    AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[19]];
                    if (lIIlIIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIIIllIIII(cA, lIlIlIllII[1])) {
                            C0004e.v();
                            cA += lIlIlIllII[1];
                        }
                        if (lIIlIIIlIllll(new WorldArea(lIlIlIllII[28], lIlIlIllII[29], lIlIlIllII[30], lIlIlIllII[31], lIlIlIllII[3]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr = new String[lIlIlIllII[1]];
                            strArr[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[32]];
                            TileObjects.getNearest(strArr).interact(lIlIlIlIlI[lIlIlIllII[33]]);
                            Time.sleepTicks(C0004e.c(lIlIlIllII[12], lIlIlIllII[16]));
                            "".length();
                        }
                        Movement.walkTo(iM);
                        "".length();
                        Time.sleepTicks(lIlIlIllII[3]);
                        "".length();
                    }
                }
                if (lIIlIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[12])) {
                    AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[34]];
                    dc = lIlIlIllII[0];
                    C0006g.a(iy, hn);
                    if (lIIlIIIlIllll(C0006g.K() ? 1 : 0)) {
                        C0006g.a(hn);
                    }
                }
            }
            if (lIIlIIIllIIll(C0004e.j(lIlIlIllII[2])) && lIIlIIIllIIII(C0004e.j(lIlIlIllII[2]), lIlIlIllII[3])) {
                if (lIIlIIIllIIIl(aK() ? 1 : 0)) {
                    ci();
                }
                if (lIIlIIIlIllll(aK() ? 1 : 0)) {
                    if (lIIlIIIllIlII(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[12])) {
                        AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[31]];
                        if (lIIlIIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(iM);
                        "".length();
                        Time.sleepTicks(lIlIlIllII[1]);
                        "".length();
                    }
                    if (lIIlIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(iM), lIlIlIllII[12])) {
                        AccBuilderShamans.c = lIlIlIlIlI[lIlIlIllII[35]];
                        if (lIIlIIIllIIII(dc, lIlIlIllII[1])) {
                            Z.og += lIlIlIllII[1];
                            Z.p(AccBuilderShamans.m);
                            dc += lIlIlIllII[1];
                            Z.og = lIlIlIllII[0];
                            dd = lIlIlIllII[0];
                        }
                        C0006g.a(iy, hn);
                        if (lIIlIIIlIllll(C0006g.K() ? 1 : 0)) {
                            C0006g.a(hn);
                        }
                    }
                }
            }
            System.out.println("Setting: " + C0004e.j(lIlIlIllII[2]));
            C0006g.a(new String[lIlIlIllII[0]]);
        }
    }

    private static boolean lIIlIIIllIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIllIlll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIIIlIIlll(String lllllllllllllllllllIllIlllllIIIl, String lllllllllllllllllllIllIlllllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllIlllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIllIllllIllIl) {
            lllllllllllllllllllIllIllllIllIl.printStackTrace();
            return null;
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            ch();
            "".length();
            if ("   ".length() < 0) {
                return (37 ^ 61) & ((15 ^ 23) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIlIlIllII[42];
    }

    private static String lIIlIIIlIlIIl(String lllllllllllllllllllIllIllllIIlII, String lllllllllllllllllllIllIllllIIIll) {
        try {
            SecretKeySpec lllllllllllllllllllIllIllllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllIllllIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlIllII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIllII[3], lllllllllllllllllllIllIllllIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIllIllllIIlIl) {
            lllllllllllllllllllIllIllllIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aK() {
        String[] strArr = new String[lIlIlIllII[1]];
        strArr[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[67]];
        if (lIIlIIIlIllll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIlIlIllII[1]];
            strArr2[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[68]];
            if (lIIlIIIlIllll(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIlIlIllII[1]];
                strArr3[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[45]];
                if (lIIlIIIlIllll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIlIllII[1]];
                    strArr4[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[69]];
                    if (lIIlIIIlIllll(Inventory.contains(strArr4) ? 1 : 0)) {
                        int[] iArr = new int[lIlIlIllII[1]];
                        iArr[lIlIlIllII[0]] = lIlIlIllII[10];
                        if (lIIlIIIlIllll(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIlIlIllII[1]];
                            iArr2[lIlIlIllII[0]] = lIlIlIllII[15];
                            if (lIIlIIIlIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[lIlIlIllII[1]];
                                iArr3[lIlIlIllII[0]] = lIlIlIllII[13];
                                if (lIIlIIIlIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[lIlIlIllII[1]];
                                    iArr4[lIlIlIllII[0]] = lIlIlIllII[7];
                                    if (lIIlIIIlIllll(Inventory.contains(iArr4) ? 1 : 0)) {
                                        int[] iArr5 = new int[lIlIlIllII[1]];
                                        iArr5[lIlIlIllII[0]] = lIlIlIllII[25];
                                        if (lIIlIIIlIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                                            String[] strArr5 = new String[lIlIlIllII[1]];
                                            strArr5[lIlIlIllII[0]] = lIlIlIlIlI[lIlIlIllII[70]];
                                            if (lIIlIIIlIllll(Inventory.contains(strArr5) ? 1 : 0)) {
                                                ?? r0 = lIlIlIllII[1];
                                                "".length();
                                                return (((87 ^ 54) ^ (77 ^ 54)) & (((((156 + 74) - 102) + 61) ^ (((14 + 40) - (-43)) + 70)) ^ (-" ".length()))) != 0 ? ((66 ^ 110) ^ (190 ^ 179)) & (((154 ^ 135) ^ (170 ^ 150)) ^ (-" ".length())) : r0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIlIlIllII[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d9, code lost:
        if (lIIlIIIllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.G.lIlIlIllII[9]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03bb, code lost:
        if (lIIlIIIllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.G.lIlIlIllII[30]) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04aa, code lost:
        if (lIIlIIIllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.G.lIlIlIllII[30]) != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13 = new int[lIlIlIllII[1]];
        iArr13[lIlIlIllII[0]] = lIlIlIllII[21];
        if (lIIlIIIllIIIl(Bank.contains(iArr13) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[36]]);
            bp.add(new C0003d(lIlIlIllII[21], lIlIlIllII[1], lIlIlIllII[37]));
            "".length();
        }
        int[] iArr14 = new int[lIlIlIllII[1]];
        iArr14[lIlIlIllII[0]] = lIlIlIllII[22];
        if (lIIlIIIllIIIl(Bank.contains(iArr14) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[38]]);
            bp.add(new C0003d(lIlIlIllII[22], lIlIlIllII[1], lIlIlIllII[39]));
            "".length();
        }
        int[] iArr15 = new int[lIlIlIllII[1]];
        iArr15[lIlIlIllII[0]] = lIlIlIllII[23];
        if (lIIlIIIllIIIl(Bank.contains(iArr15) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[40]]);
            bp.add(new C0003d(lIlIlIllII[23], lIlIlIllII[1], lIlIlIllII[39]));
            "".length();
        }
        int[] iArr16 = new int[lIlIlIllII[1]];
        iArr16[lIlIlIllII[0]] = lIlIlIllII[24];
        if (lIIlIIIllIIIl(Bank.contains(iArr16) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[30]]);
            bp.add(new C0003d(lIlIlIllII[24], lIlIlIllII[1], lIlIlIllII[39]));
            "".length();
        }
        int[] iArr17 = new int[lIlIlIllII[1]];
        iArr17[lIlIlIllII[0]] = lIlIlIllII[25];
        if (lIIlIIIllIIIl(Bank.contains(iArr17) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[41]]);
            bp.add(new C0003d(lIlIlIllII[25], lIlIlIllII[42], lIlIlIllII[43]));
            "".length();
        }
        int[] iArr18 = new int[lIlIlIllII[1]];
        iArr18[lIlIlIllII[0]] = lIlIlIllII[25];
        if (lIIlIIIlIllll(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIlIlIllII[1]];
            iArr19[lIlIlIllII[0]] = lIlIlIllII[25];
            if (lIIlIIIllIIII(Bank.getFirst(iArr19).getQuantity(), lIlIlIllII[30])) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[44]]);
                bp.add(new C0003d(lIlIlIllII[25], lIlIlIllII[45], lIlIlIllII[43]));
                "".length();
            }
        }
        int[] iArr20 = new int[lIlIlIllII[1]];
        iArr20[lIlIlIllII[0]] = lIlIlIllII[17];
        if (lIIlIIIllIIIl(Bank.contains(iArr20) ? 1 : 0)) {
            System.out.println(lIlIlIlIlI[lIlIlIllII[46]]);
            bp.add(new C0003d(lIlIlIllII[17], lIlIlIllII[9], lIlIlIllII[47]));
            "".length();
        }
        int[] iArr21 = new int[lIlIlIllII[1]];
        iArr21[lIlIlIllII[0]] = lIlIlIllII[17];
        if (lIIlIIIlIllll(Bank.contains(iArr21) ? 1 : 0)) {
            int[] iArr22 = new int[lIlIlIllII[1]];
            iArr22[lIlIlIllII[0]] = lIlIlIllII[17];
            if (lIIlIIIlIllll(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIlIlIllII[1]];
                iArr23[lIlIlIllII[0]] = lIlIlIllII[17];
            }
            if (lIIlIIIllIIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIlIlIlIlI[lIlIlIllII[85]]);
            }) ? 1 : 0)) {
                System.out.println(lIlIlIlIlI[lIlIlIllII[49]]);
                bp.add(new C0003d(lIlIlIllII[50], lIlIlIllII[38], lIlIlIllII[51]));
                "".length();
            }
            iArr = new int[lIlIlIllII[1]];
            iArr[lIlIlIllII[0]] = lIlIlIllII[20];
            if (lIIlIIIlIllll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr24 = new int[lIlIlIllII[1]];
                iArr24[lIlIlIllII[0]] = lIlIlIllII[20];
                if (lIIlIIIlIllll(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIlIlIllII[1]];
                    iArr25[lIlIlIllII[0]] = lIlIlIllII[20];
                }
                iArr2 = new int[lIlIlIllII[1]];
                iArr2[lIlIlIllII[0]] = lIlIlIllII[7];
                if (lIIlIIIllIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println(lIlIlIlIlI[lIlIlIllII[54]]);
                    bp.add(new C0003d(lIlIlIllII[7], lIlIlIllII[30], lIlIlIllII[53]));
                    "".length();
                }
                iArr3 = new int[lIlIlIllII[1]];
                iArr3[lIlIlIllII[0]] = lIlIlIllII[7];
                if (lIIlIIIlIllll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr26 = new int[lIlIlIllII[1]];
                    iArr26[lIlIlIllII[0]] = lIlIlIllII[7];
                    if (lIIlIIIlIllll(Bank.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[lIlIlIllII[1]];
                        iArr27[lIlIlIllII[0]] = lIlIlIllII[7];
                    }
                    iArr4 = new int[lIlIlIllII[1]];
                    iArr4[lIlIlIllII[0]] = lIlIlIllII[27];
                    if (lIIlIIIllIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                        System.out.println(lIlIlIlIlI[lIlIlIllII[56]]);
                        bp.add(new C0003d(lIlIlIllII[27], lIlIlIllII[9], C0009j.bZ));
                        "".length();
                    }
                    iArr5 = new int[lIlIlIllII[1]];
                    iArr5[lIlIlIllII[0]] = lIlIlIllII[10];
                    if (lIIlIIIlIllll(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr28 = new int[lIlIlIllII[1]];
                        iArr28[lIlIlIllII[0]] = lIlIlIllII[10];
                        if (lIIlIIIllIIII(Bank.getFirst(iArr28).getQuantity(), lIlIlIllII[11])) {
                            System.out.println(lIlIlIlIlI[lIlIlIllII[57]]);
                            bp.add(new C0003d(lIlIlIllII[10], lIlIlIllII[58], lIlIlIllII[14]));
                            "".length();
                        }
                    }
                    iArr6 = new int[lIlIlIllII[1]];
                    iArr6[lIlIlIllII[0]] = lIlIlIllII[59];
                    if (lIIlIIIlIllll(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr29 = new int[lIlIlIllII[1]];
                        iArr29[lIlIlIllII[0]] = lIlIlIllII[59];
                        if (lIIlIIIllIIII(Bank.getFirst(iArr29).getQuantity(), lIlIlIllII[11])) {
                            System.out.println(lIlIlIlIlI[lIlIlIllII[60]]);
                            bp.add(new C0003d(lIlIlIllII[59], lIlIlIllII[58], lIlIlIllII[14]));
                            "".length();
                        }
                    }
                    iArr7 = new int[lIlIlIllII[1]];
                    iArr7[lIlIlIllII[0]] = lIlIlIllII[15];
                    if (lIIlIIIlIllll(Bank.contains(iArr7) ? 1 : 0)) {
                        int[] iArr30 = new int[lIlIlIllII[1]];
                        iArr30[lIlIlIllII[0]] = lIlIlIllII[15];
                        if (lIIlIIIllIIII(Bank.getFirst(iArr30).getQuantity(), lIlIlIllII[11])) {
                            System.out.println(lIlIlIlIlI[lIlIlIllII[61]]);
                            bp.add(new C0003d(lIlIlIllII[15], lIlIlIllII[58], lIlIlIllII[14]));
                            "".length();
                        }
                    }
                    iArr8 = new int[lIlIlIllII[1]];
                    iArr8[lIlIlIllII[0]] = lIlIlIllII[13];
                    if (lIIlIIIlIllll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr31 = new int[lIlIlIllII[1]];
                        iArr31[lIlIlIllII[0]] = lIlIlIllII[13];
                        if (lIIlIIIllIIII(Bank.getFirst(iArr31).getQuantity(), lIlIlIllII[11])) {
                            System.out.println(lIlIlIlIlI[lIlIlIllII[62]]);
                            bp.add(new C0003d(lIlIlIllII[13], lIlIlIllII[58], lIlIlIllII[14]));
                            "".length();
                        }
                    }
                    iArr9 = new int[lIlIlIllII[1]];
                    iArr9[lIlIlIllII[0]] = lIlIlIllII[59];
                    if (lIIlIIIllIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                        System.out.println(lIlIlIlIlI[lIlIlIllII[63]]);
                        bp.add(new C0003d(lIlIlIllII[59], lIlIlIllII[58], lIlIlIllII[14]));
                        "".length();
                    }
                    iArr10 = new int[lIlIlIllII[1]];
                    iArr10[lIlIlIllII[0]] = lIlIlIllII[15];
                    if (lIIlIIIllIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        System.out.println(lIlIlIlIlI[lIlIlIllII[64]]);
                        bp.add(new C0003d(lIlIlIllII[15], lIlIlIllII[58], lIlIlIllII[14]));
                        "".length();
                    }
                    iArr11 = new int[lIlIlIllII[1]];
                    iArr11[lIlIlIllII[0]] = lIlIlIllII[13];
                    if (lIIlIIIllIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                        System.out.println(lIlIlIlIlI[lIlIlIllII[65]]);
                        bp.add(new C0003d(lIlIlIllII[13], lIlIlIllII[58], lIlIlIllII[14]));
                        "".length();
                    }
                    iArr12 = new int[lIlIlIllII[1]];
                    iArr12[lIlIlIllII[0]] = lIlIlIllII[10];
                    if (lIIlIIIllIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        return;
                    }
                    System.out.println(lIlIlIlIlI[lIlIlIllII[66]]);
                    bp.add(new C0003d(lIlIlIllII[10], lIlIlIllII[58], lIlIlIllII[14]));
                    "".length();
                    return;
                }
                System.out.println(lIlIlIlIlI[lIlIlIllII[55]]);
                bp.add(new C0003d(lIlIlIllII[7], lIlIlIllII[30], lIlIlIllII[53]));
                "".length();
                iArr4 = new int[lIlIlIllII[1]];
                iArr4[lIlIlIllII[0]] = lIlIlIllII[27];
                if (lIIlIIIllIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIlIlIllII[1]];
                iArr5[lIlIlIllII[0]] = lIlIlIllII[10];
                if (lIIlIIIlIllll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lIlIlIllII[1]];
                iArr6[lIlIlIllII[0]] = lIlIlIllII[59];
                if (lIIlIIIlIllll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[lIlIlIllII[1]];
                iArr7[lIlIlIllII[0]] = lIlIlIllII[15];
                if (lIIlIIIlIllll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lIlIlIllII[1]];
                iArr8[lIlIlIllII[0]] = lIlIlIllII[13];
                if (lIIlIIIlIllll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIlIlIllII[1]];
                iArr9[lIlIlIllII[0]] = lIlIlIllII[59];
                if (lIIlIIIllIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIlIlIllII[1]];
                iArr10[lIlIlIllII[0]] = lIlIlIllII[15];
                if (lIIlIIIllIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIlIlIllII[1]];
                iArr11[lIlIlIllII[0]] = lIlIlIllII[13];
                if (lIIlIIIllIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[lIlIlIllII[1]];
                iArr12[lIlIlIllII[0]] = lIlIlIllII[10];
                if (lIIlIIIllIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                }
            }
            System.out.println(lIlIlIlIlI[lIlIlIllII[52]]);
            bp.add(new C0003d(lIlIlIllII[20], lIlIlIllII[45], lIlIlIllII[53]));
            "".length();
            iArr2 = new int[lIlIlIllII[1]];
            iArr2[lIlIlIllII[0]] = lIlIlIllII[7];
            if (lIIlIIIllIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIlIlIllII[1]];
            iArr3[lIlIlIllII[0]] = lIlIlIllII[7];
            if (lIIlIIIlIllll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            System.out.println(lIlIlIlIlI[lIlIlIllII[55]]);
            bp.add(new C0003d(lIlIlIllII[7], lIlIlIllII[30], lIlIlIllII[53]));
            "".length();
            iArr4 = new int[lIlIlIllII[1]];
            iArr4[lIlIlIllII[0]] = lIlIlIllII[27];
            if (lIIlIIIllIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIlIlIllII[1]];
            iArr5[lIlIlIllII[0]] = lIlIlIllII[10];
            if (lIIlIIIlIllll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIlIlIllII[1]];
            iArr6[lIlIlIllII[0]] = lIlIlIllII[59];
            if (lIIlIIIlIllll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIlIlIllII[1]];
            iArr7[lIlIlIllII[0]] = lIlIlIllII[15];
            if (lIIlIIIlIllll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIlIlIllII[1]];
            iArr8[lIlIlIllII[0]] = lIlIlIllII[13];
            if (lIIlIIIlIllll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIlIlIllII[1]];
            iArr9[lIlIlIllII[0]] = lIlIlIllII[59];
            if (lIIlIIIllIIIl(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIlIlIllII[1]];
            iArr10[lIlIlIllII[0]] = lIlIlIllII[15];
            if (lIIlIIIllIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIlIlIllII[1]];
            iArr11[lIlIlIllII[0]] = lIlIlIllII[13];
            if (lIIlIIIllIIIl(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[lIlIlIllII[1]];
            iArr12[lIlIlIllII[0]] = lIlIlIllII[10];
            if (lIIlIIIllIIIl(Bank.contains(iArr12) ? 1 : 0)) {
            }
        }
        System.out.println(lIlIlIlIlI[lIlIlIllII[48]]);
        bp.add(new C0003d(lIlIlIllII[17], lIlIlIllII[9], lIlIlIllII[47]));
        "".length();
        if (lIIlIIIllIIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlIlIlIlI[lIlIlIllII[85]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIlIlIllII[1]];
        iArr[lIlIlIllII[0]] = lIlIlIllII[20];
        if (lIIlIIIlIllll(Bank.contains(iArr) ? 1 : 0)) {
        }
        System.out.println(lIlIlIlIlI[lIlIlIllII[52]]);
        bp.add(new C0003d(lIlIlIllII[20], lIlIlIllII[45], lIlIlIllII[53]));
        "".length();
        iArr2 = new int[lIlIlIllII[1]];
        iArr2[lIlIlIllII[0]] = lIlIlIllII[7];
        if (lIIlIIIllIIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlIlIllII[1]];
        iArr3[lIlIlIllII[0]] = lIlIlIllII[7];
        if (lIIlIIIlIllll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        System.out.println(lIlIlIlIlI[lIlIlIllII[55]]);
        bp.add(new C0003d(lIlIlIllII[7], lIlIlIllII[30], lIlIlIllII[53]));
        "".length();
        iArr4 = new int[lIlIlIllII[1]];
        iArr4[lIlIlIllII[0]] = lIlIlIllII[27];
        if (lIIlIIIllIIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlIlIllII[1]];
        iArr5[lIlIlIllII[0]] = lIlIlIllII[10];
        if (lIIlIIIlIllll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIlIlIllII[1]];
        iArr6[lIlIlIllII[0]] = lIlIlIllII[59];
        if (lIIlIIIlIllll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIlIlIllII[1]];
        iArr7[lIlIlIllII[0]] = lIlIlIllII[15];
        if (lIIlIIIlIllll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIlIlIllII[1]];
        iArr8[lIlIlIllII[0]] = lIlIlIllII[13];
        if (lIIlIIIlIllll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIlIlIllII[1]];
        iArr9[lIlIlIllII[0]] = lIlIlIllII[59];
        if (lIIlIIIllIIIl(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIlIlIllII[1]];
        iArr10[lIlIlIllII[0]] = lIlIlIllII[15];
        if (lIIlIIIllIIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIlIlIllII[1]];
        iArr11[lIlIlIllII[0]] = lIlIlIllII[13];
        if (lIIlIIIllIIIl(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[lIlIlIllII[1]];
        iArr12[lIlIlIllII[0]] = lIlIlIllII[10];
        if (lIIlIIIllIIIl(Bank.contains(iArr12) ? 1 : 0)) {
        }
    }

    private static boolean lIIlIIIllIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIllIIlI(Object obj) {
        return obj != null;
    }
}
