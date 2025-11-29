package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.t  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/t.class */
public final class t {
    private final /* synthetic */ int lever2Value;
    private static /* synthetic */ String[] lllllllllllI;
    private final /* synthetic */ int unfinishedID;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ t AZURE_AURA_MIX;
    public static final /* synthetic */ t ALCO_AUGMENTATOR;
    private final /* synthetic */ int lever3Value;
    public static final /* synthetic */ t MAMMOTH_MIGHT;
    private static final /* synthetic */ t[] $VALUES;
    public static final /* synthetic */ t MYSTIC_MANA_AMALGAM;
    public static final /* synthetic */ t MARLEYS_MOONLIGHT;
    public static final /* synthetic */ t ANTI_LEECH_LOTION;
    public static final /* synthetic */ t MIXALOT;
    private final /* synthetic */ int xpReward;
    private final /* synthetic */ int lever1Value;
    private final /* synthetic */ String rewardType;
    public static final /* synthetic */ t LIPLACK_LIQUOR;
    public static final /* synthetic */ t MEGALITE_LIQUID;
    public static final /* synthetic */ t AQUALUX_AMALGAM;
    private static /* synthetic */ int[] llllllllllll;
    private final /* synthetic */ String name;

    public int n() {
        return this.unfinishedID;
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    private static boolean lIIlIllIIIIIIII(int i, int i2) {
        return i < i2;
    }

    public int k() {
        return this.lever2Value;
    }

    public String q() {
        return this.rewardType;
    }

    public int m() {
        return this.lever1Value;
    }

    public int l() {
        return this.lever3Value;
    }

    private static String lIIlIlIllllllII(String lllllllllllllllIIlIIIIIllIIlIlII, String lllllllllllllllIIlIIIIIllIIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIIllIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIIllIIllIII.init(llllllllllll[6], lllllllllllllllIIlIIIIIllIIllIIl);
            return new String(lllllllllllllllIIlIIIIIllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIllIIlIlll) {
            lllllllllllllllIIlIIIIIllIIlIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIlIllllllll();
        lIIlIlIlllllllI();
        LIPLACK_LIQUOR = new t(lllllllllllI[llllllllllll[0]], llllllllllll[0], lllllllllllI[llllllllllll[1]], llllllllllll[2], llllllllllll[3], llllllllllll[4], llllllllllll[4], llllllllllll[4], llllllllllll[5], lllllllllllI[llllllllllll[6]]);
        ALCO_AUGMENTATOR = new t(lllllllllllI[llllllllllll[4]], llllllllllll[1], lllllllllllI[llllllllllll[7]], llllllllllll[8], llllllllllll[9], llllllllllll[6], llllllllllll[6], llllllllllll[6], llllllllllll[5], lllllllllllI[llllllllllll[10]]);
        MAMMOTH_MIGHT = new t(lllllllllllI[llllllllllll[11]], llllllllllll[6], lllllllllllI[llllllllllll[12]], llllllllllll[13], llllllllllll[14], llllllllllll[1], llllllllllll[1], llllllllllll[1], llllllllllll[5], lllllllllllI[llllllllllll[15]]);
        MYSTIC_MANA_AMALGAM = new t(lllllllllllI[llllllllllll[16]], llllllllllll[4], lllllllllllI[llllllllllll[17]], llllllllllll[18], llllllllllll[19], llllllllllll[1], llllllllllll[1], llllllllllll[6], llllllllllll[20], lllllllllllI[llllllllllll[21]]);
        MARLEYS_MOONLIGHT = new t(lllllllllllI[llllllllllll[22]], llllllllllll[7], lllllllllllI[llllllllllll[23]], llllllllllll[24], llllllllllll[25], llllllllllll[1], llllllllllll[1], llllllllllll[4], llllllllllll[26], lllllllllllI[llllllllllll[27]]);
        AZURE_AURA_MIX = new t(lllllllllllI[llllllllllll[28]], llllllllllll[10], lllllllllllI[llllllllllll[29]], llllllllllll[30], llllllllllll[31], llllllllllll[6], llllllllllll[6], llllllllllll[1], llllllllllll[32], lllllllllllI[llllllllllll[33]]);
        AQUALUX_AMALGAM = new t(lllllllllllI[llllllllllll[34]], llllllllllll[11], lllllllllllI[llllllllllll[35]], llllllllllll[36], llllllllllll[37], llllllllllll[6], llllllllllll[4], llllllllllll[6], llllllllllll[38], lllllllllllI[llllllllllll[39]]);
        MEGALITE_LIQUID = new t(lllllllllllI[llllllllllll[40]], llllllllllll[12], lllllllllllI[llllllllllll[41]], llllllllllll[42], llllllllllll[43], llllllllllll[1], llllllllllll[4], llllllllllll[4], llllllllllll[44], lllllllllllI[llllllllllll[45]]);
        ANTI_LEECH_LOTION = new t(lllllllllllI[llllllllllll[46]], llllllllllll[15], lllllllllllI[llllllllllll[47]], llllllllllll[48], llllllllllll[49], llllllllllll[6], llllllllllll[4], llllllllllll[4], llllllllllll[50], lllllllllllI[llllllllllll[51]]);
        MIXALOT = new t(lllllllllllI[llllllllllll[52]], llllllllllll[16], lllllllllllI[llllllllllll[53]], llllllllllll[54], llllllllllll[55], llllllllllll[1], llllllllllll[6], llllllllllll[4], llllllllllll[56], lllllllllllI[llllllllllll[57]]);
        t[] tVarArr = new t[llllllllllll[17]];
        tVarArr[llllllllllll[0]] = LIPLACK_LIQUOR;
        tVarArr[llllllllllll[1]] = ALCO_AUGMENTATOR;
        tVarArr[llllllllllll[6]] = MAMMOTH_MIGHT;
        tVarArr[llllllllllll[4]] = MYSTIC_MANA_AMALGAM;
        tVarArr[llllllllllll[7]] = MARLEYS_MOONLIGHT;
        tVarArr[llllllllllll[10]] = AZURE_AURA_MIX;
        tVarArr[llllllllllll[11]] = AQUALUX_AMALGAM;
        tVarArr[llllllllllll[12]] = MEGALITE_LIQUID;
        tVarArr[llllllllllll[15]] = ANTI_LEECH_LOTION;
        tVarArr[llllllllllll[16]] = MIXALOT;
        $VALUES = tVarArr;
    }

    public int o() {
        return this.finishedID;
    }

    private static void lIIlIlIlllllllI() {
        lllllllllllI = new String[llllllllllll[58]];
        lllllllllllI[llllllllllll[0]] = lIIlIlIlllllIll("rVtKLiBAI/dcY+IPmXDn/g==", "ullCF");
        lllllllllllI[llllllllllll[1]] = lIIlIlIllllllII("bBhwpRx/4O3sTj3EVGseQQ==", "nLmok");
        lllllllllllI[llllllllllll[6]] = lIIlIlIlllllIll("AXE777Yed+I=", "GJNuz");
        lllllllllllI[llllllllllll[4]] = lIIlIlIlllllIll("/Hp34tBvD/qJ3kK2bbw18/nogibk3Fgk", "mmhiU");
        lllllllllllI[llllllllllll[7]] = lIIlIlIlllllIll("gNIDHLakd5Z/M2nV1ABmmPemNyC/J2y7", "JJlVB");
        lllllllllllI[llllllllllll[10]] = lIIlIlIllllllIl("JB8J", "ExhsA");
        lllllllllllI[llllllllllll[11]] = lIIlIlIllllllIl("DDkkDhwVMDYOGgYwPQ==", "AxiCS");
        lllllllllllI[llllllllllll[12]] = lIIlIlIlllllIll("LfpGQHMrZdJYPg2hhMCZfQyZRSRWWb7A", "HHMZV");
        lllllllllllI[llllllllllll[15]] = lIIlIlIllllllIl("ACEi", "mNZhu");
        lllllllllllI[llllllllllll[16]] = lIIlIlIllllllIl("OzAgGjw1Nj4POzc2MgM0Oi4yAw==", "visNu");
        lllllllllllI[llllllllllll[17]] = lIIlIlIlllllIll("J6AoBxI/VTtRUpcyI3kMi/9wG2t5zme6", "dwZUS");
        lllllllllllI[llllllllllll[21]] = lIIlIlIllllllII("D3lReTi5dss=", "eOprq");
        lllllllllllI[llllllllllll[22]] = lIIlIlIllllllII("UqQ4+mxQdWbgMscvgh9Rza+/2M2CYNVA", "bBmzh");
        lllllllllllI[llllllllllll[23]] = lIIlIlIllllllIl("KjQ6BT0ecjtJNQg6JgUxAD08", "gUHiX");
        lllllllllllI[llllllllllll[27]] = lIIlIlIllllllIl("DBc5", "axAeK");
        lllllllllllI[llllllllllll[28]] = lIIlIlIllllllII("XqLRKMHqB2MVmkIkzEWpYQ==", "MZeoc");
        lllllllllllI[llllllllllll[29]] = lIIlIlIllllllIl("MA0eOChRFh44LFEaAjI=", "qwkJM");
        lllllllllllI[llllllllllll[33]] = lIIlIlIllllllIl("JTMx", "DTPHb");
        lllllllllllI[llllllllllll[34]] = lIIlIlIllllllIl("OSQzFT8tLTkVPjk5IRU+", "xufTs");
        lllllllllllI[llllllllllll[35]] = lIIlIlIllllllIl("JSsUKDsRIkEoOgU2Big6", "dZaIW");
        lllllllllllI[llllllllllll[39]] = lIIlIlIllllllII("+M+9bcDdvQw=", "mmBjY");
        lllllllllllI[llllllllllll[40]] = lIIlIlIllllllIl("HjQKOTYaJQgnNhogGDE+", "SqMxz");
        lllllllllllI[llllllllllll[41]] = lIIlIlIllllllIl("GBAgMg08ASJzDTwEMjoF", "UuGSa");
        lllllllllllI[llllllllllll[45]] = lIIlIlIllllllII("uYbJqu28zw8=", "zmIwn");
        lllllllllllI[llllllllllll[46]] = lIIlIlIllllllIl("FSsQLxQYIAElAwspCzICGys=", "TeDfK");
        lllllllllllI[llllllllllll[47]] = lIIlIlIlllllIll("BM/XMcCkoMR5v6MIFN9TwwA0fnjZ57CS", "EEAmK");
        lllllllllllI[llllllllllll[51]] = lIIlIlIllllllII("BuKmDVbLtpc=", "msDLl");
        lllllllllllI[llllllllllll[52]] = lIIlIlIlllllIll("JdVq811XQ2c=", "yhGVo");
        lllllllllllI[llllllllllll[53]] = lIIlIlIlllllIll("QFo7+0T/2+Y=", "YuQao");
        lllllllllllI[llllllllllll[57]] = lIIlIlIllllllIl("HB4r", "pgNOt");
    }

    public int p() {
        return this.xpReward;
    }

    private static void lIIlIlIllllllll() {
        llllllllllll = new int[59];
        llllllllllll[0] = ((105 ^ 52) ^ (95 ^ 44)) & (((52 ^ 115) ^ (204 ^ 165)) ^ (-" ".length()));
        llllllllllll[1] = " ".length();
        llllllllllll[2] = (-(((111 + 5) - 57) + 128)) & (-2561) & 32763;
        llllllllllll[3] = (-2177) & 32203;
        llllllllllll[4] = "   ".length();
        llllllllllll[5] = (((((65 + 177) - 62) + 0) + (62 ^ 26)) - (((103 + 97) - 146) + 81)) + (253 ^ 144);
        llllllllllll[6] = "  ".length();
        llllllllllll[7] = (((109 + 51) - 79) + 103) ^ (((67 + 99) - 77) + 99);
        llllllllllll[8] = (-((-25361) & 27473)) & (-1) & 32126;
        llllllllllll[9] = (-((-16922) & 19135)) & (-17) & 32253;
        llllllllllll[10] = (66 ^ 103) ^ (128 ^ 160);
        llllllllllll[11] = (165 ^ 158) ^ (93 ^ 96);
        llllllllllll[12] = (21 ^ 6) ^ (76 ^ 88);
        llllllllllll[13] = (-((-31) & 2783)) & (-5) & 32767;
        llllllllllll[14] = (-((-30017) & 32731)) & (-1) & 32735;
        llllllllllll[15] = 166 ^ 174;
        llllllllllll[16] = 179 ^ 186;
        llllllllllll[17] = (107 ^ 83) ^ (172 ^ 158);
        llllllllllll[18] = (-2114) & 32125;
        llllllllllll[19] = (-521) & 30542;
        llllllllllll[20] = (((110 ^ 42) + (49 ^ 95)) - (((9 + 122) - 110) + 108)) + ((84 + 37) - 26) + 71;
        llllllllllll[21] = 21 ^ 30;
        llllllllllll[22] = (109 ^ 21) ^ (47 ^ 91);
        llllllllllll[23] = (218 ^ 177) ^ (214 ^ 176);
        llllllllllll[24] = (-707) & 30719;
        llllllllllll[25] = (-((-9543) & 10239)) & (-2049) & 32767;
        llllllllllll[26] = ((222 + 232) - 361) + 147;
        llllllllllll[27] = 61 ^ 51;
        llllllllllll[28] = 103 ^ 104;
        llllllllllll[29] = (((133 + 34) - 65) + 76) ^ (((120 + 53) - 117) + 106);
        llllllllllll[30] = (-549) & 30564;
        llllllllllll[31] = (-((-5203) & 7411)) & (-534) & 32767;
        llllllllllll[32] = (-10293) & 10557;
        llllllllllll[33] = 44 ^ 61;
        llllllllllll[34] = (60 ^ 29) ^ (241 ^ 194);
        llllllllllll[35] = 211 ^ 192;
        llllllllllll[36] = (-(((28 + 135) - 83) + 113)) & (-513) & 30719;
        llllllllllll[37] = (-2723) & 32747;
        llllllllllll[38] = (-((-2) & 31759)) & (-513) & 32559;
        llllllllllll[39] = (((116 + 157) - 236) + 130) ^ (((46 + 170) - 196) + 159);
        llllllllllll[40] = 120 ^ 109;
        llllllllllll[41] = (37 ^ 97) ^ (0 ^ 82);
        llllllllllll[42] = (-((-15687) & 16207)) & (-49) & 30587;
        llllllllllll[43] = (-(((111 + 88) - 20) + 0)) & (-2561) & 32767;
        llllllllllll[44] = (-22021) & 22335;
        llllllllllll[45] = 30 ^ 9;
        llllllllllll[46] = (((59 + 105) - 107) + 91) ^ (((82 + 65) - 22) + 15);
        llllllllllll[47] = (((133 + 123) - 172) + 94) ^ (((170 + 68) - 79) + 12);
        llllllllllll[48] = (-((-16477) & 19198)) & (-1) & 32739;
        llllllllllll[49] = (-658) & 30685;
        llllllllllll[50] = (-14499) & 14838;
        llllllllllll[51] = 139 ^ 145;
        llllllllllll[52] = (65 ^ 121) ^ (156 ^ 191);
        llllllllllll[53] = (132 ^ 138) ^ (49 ^ 35);
        llllllllllll[54] = (-(71 ^ 67)) & (-185) & 30207;
        llllllllllll[55] = (-178) & 30207;
        llllllllllll[56] = (-22161) & 22525;
        llllllllllll[57] = "  ".length() ^ (18 ^ 13);
        llllllllllll[58] = "  ".length() ^ (82 ^ 78);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    private static String lIIlIlIllllllIl(String lllllllllllllllIIlIIIIIlIllllIIl, String lllllllllllllllIIlIIIIIlIllllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIIIlIllllIII.toCharArray();
        int lllllllllllllllIIlIIIIIlIlllIlIl = llllllllllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllllllllll[0];
        while (lIIlIllIIIIIIII(i, length)) {
            char lllllllllllllllIIlIIIIIlIllllIlI = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIIIIIlIllllIlI ^ charArray[lllllllllllllllIIlIIIIIlIlllIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIIIlIlllIlIl++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private t(String str, int i, String str2, int i2, int i3, int i4, int i5, int i6, int i7, String str3) {
        this.name = str2;
        this.unfinishedID = i2;
        this.finishedID = i3;
        this.lever1Value = i4;
        this.lever2Value = i5;
        this.lever3Value = i6;
        this.xpReward = i7;
        this.rewardType = str3;
    }

    public String a() {
        return this.name;
    }

    private static String lIIlIlIlllllIll(String lllllllllllllllIIlIIIIIllIIIIlll, String lllllllllllllllIIlIIIIIllIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIllIIIlIII.getBytes(StandardCharsets.UTF_8)), llllllllllll[15]), "DES");
            Cipher lllllllllllllllIIlIIIIIllIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIllIIIlIll.init(llllllllllll[6], secretKeySpec);
            return new String(lllllllllllllllIIlIIIIIllIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIllIIIlIlI) {
            lllllllllllllllIIlIIIIIllIIIlIlI.printStackTrace();
            return null;
        }
    }
}
