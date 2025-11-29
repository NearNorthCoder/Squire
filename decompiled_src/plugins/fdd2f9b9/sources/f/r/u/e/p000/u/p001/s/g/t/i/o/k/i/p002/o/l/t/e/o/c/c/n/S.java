package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.S  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/S.class */
public class S implements G {
    static final /* synthetic */ WorldPoint jy;
    public static final /* synthetic */ WorldPoint jt;
    private static /* synthetic */ int[] lIIllIlllI;
    public static /* synthetic */ boolean bt;
    private final /* synthetic */ int jA = lIIllIlllI[0];
    public static final /* synthetic */ WorldPoint jv;
    public static /* synthetic */ List<C0003d> bv;
    static final /* synthetic */ WorldPoint jz;
    private static /* synthetic */ String[] lIIllIllIl;
    static final /* synthetic */ WorldPoint jx;
    public static final /* synthetic */ WorldPoint jw;
    public static final /* synthetic */ WorldPoint ju;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIIllIlIII(Skills.getLevel(Skill.PRAYER), lIIllIlllI[76])) {
            ?? r0 = lIIllIlllI[2];
            "".length();
            return " ".length() >= (8 ^ 12) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIlllI[1];
    }

    private static boolean lIIIIIllIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIllIlllI[1];
    }

    private static void lIIIIIlIlllll() {
        lIIllIlllI = new int[88];
        lIIllIlllI[0] = (-17793) & 18328;
        lIIllIlllI[1] = ((203 ^ 184) ^ (168 ^ 129)) & (((((37 + 82) - 29) + 117) ^ (((23 + 91) - 10) + 45)) ^ (-" ".length()));
        lIIllIlllI[2] = " ".length();
        lIIllIlllI[3] = "  ".length();
        lIIllIlllI[4] = "   ".length();
        lIIllIlllI[5] = (-((-23428) & 32763)) & (-2049) & 16383;
        lIIllIlllI[6] = (105 ^ 66) ^ (101 ^ 74);
        lIIllIlllI[7] = (-1346) & 22511;
        lIIllIlllI[8] = (-3117) & 15741;
        lIIllIlllI[9] = (-((-741) & 9973)) & (-6157) & 16383;
        lIIllIlllI[10] = (-((-4361) & 21882)) & (-1) & 28021;
        lIIllIlllI[11] = ((13 + 101) - 100) + 186;
        lIIllIlllI[12] = (115 ^ 55) ^ (247 ^ 129);
        lIIllIlllI[13] = (156 ^ 180) ^ (175 ^ 130);
        lIIllIlllI[14] = 12 ^ 24;
        lIIllIlllI[15] = (0 ^ 14) ^ (163 ^ 171);
        lIIllIlllI[16] = -" ".length();
        lIIllIlllI[17] = (((101 + 168) - 220) + 137) ^ (((14 + 79) - (-18)) + 78);
        lIIllIlllI[18] = 114 ^ 122;
        lIIllIlllI[19] = (((15 + 81) - 53) + 161) ^ (((177 + 127) - 299) + 192);
        lIIllIlllI[20] = 124 ^ 113;
        lIIllIlllI[21] = 169 ^ 163;
        lIIllIlllI[22] = (-21507) & 24534;
        lIIllIlllI[23] = (-((-37) & 24766)) & (-1) & 28571;
        lIIllIlllI[24] = (-42) & 3067;
        lIIllIlllI[25] = (-((-2649) & 23385)) & (-1) & 24571;
        lIIllIlllI[26] = (-((-2689) & 27269)) & (-1) & 27599;
        lIIllIlllI[27] = (-16392) & 20223;
        lIIllIlllI[28] = (-17417) & 20431;
        lIIllIlllI[29] = (-"   ".length()) & (-28929) & 32759;
        lIIllIlllI[30] = (-4142) & 7151;
        lIIllIlllI[31] = (-((-1989) & 14277)) & (-5) & 16117;
        lIIllIlllI[32] = (-((-14405) & 15431)) & (-4097) & 8127;
        lIIllIlllI[33] = (-16641) & 20462;
        lIIllIlllI[34] = (-24649) & 27647;
        lIIllIlllI[35] = (-((-6155) & 22815)) & (-1) & 20478;
        lIIllIlllI[36] = (-8273) & 11263;
        lIIllIlllI[37] = (-20741) & 24559;
        lIIllIlllI[38] = (-((-4129) & 29793)) & (-4113) & 32759;
        lIIllIlllI[39] = (-17436) & 20411;
        lIIllIlllI[40] = (-((-761) & 21246)) & (-9217) & 32671;
        lIIllIlllI[41] = 181 ^ 190;
        lIIllIlllI[42] = (-((-793) & 18233)) & (-4161) & 24563;
        lIIllIlllI[43] = (-12289) & 16108;
        lIIllIlllI[44] = (51 ^ 39) ^ (93 ^ 69);
        lIIllIlllI[45] = (-21585) & 24543;
        lIIllIlllI[46] = (41 ^ 18) ^ (16 ^ 37);
        lIIllIlllI[47] = (253 ^ 188) ^ (3 ^ 77);
        lIIllIlllI[48] = 91 ^ 75;
        lIIllIlllI[49] = 127 ^ 110;
        lIIllIlllI[50] = (-31937) & 32473;
        lIIllIlllI[51] = (24 ^ 81) ^ (10 ^ 81);
        lIIllIlllI[52] = (73 ^ 37) ^ (((66 + 6) - 47) + 102);
        lIIllIlllI[53] = 178 ^ 167;
        lIIllIlllI[54] = (((44 + 89) - 17) + 14) ^ (((22 + 38) - 4) + 92);
        lIIllIlllI[55] = 90 ^ 77;
        lIIllIlllI[56] = 155 ^ 131;
        lIIllIlllI[57] = 91 ^ 66;
        lIIllIlllI[58] = 43 ^ 49;
        lIIllIlllI[59] = 168 ^ 179;
        lIIllIlllI[60] = (31 ^ 13) ^ (135 ^ 137);
        lIIllIlllI[61] = 148 ^ 137;
        lIIllIlllI[62] = (52 ^ 24) ^ (57 ^ 11);
        lIIllIlllI[63] = (-29967) & 32766;
        lIIllIlllI[64] = (-4403) & 16382;
        lIIllIlllI[65] = (-4119) & 29118;
        lIIllIlllI[66] = (-16521) & 24527;
        lIIllIlllI[67] = (((97 + 111) - 133) + 115) ^ (((36 + 76) - (-36)) + 2);
        lIIllIlllI[68] = (-1060) & 1959;
        lIIllIlllI[69] = (-16914) & 290655;
        lIIllIlllI[70] = 78 ^ 114;
        lIIllIlllI[71] = (((10 + 143) - (-41)) + 42) ^ (((187 + 185) - 271) + 92);
        lIIllIlllI[72] = (-37) & 486;
        lIIllIlllI[73] = (-1335) & 62846;
        lIIllIlllI[74] = (((72 + 217) - 196) + 154) ^ (((70 + 13) - (-58)) + 6);
        lIIllIlllI[75] = (26 ^ 54) ^ (60 ^ 15);
        lIIllIlllI[76] = 8 ^ 107;
        lIIllIlllI[77] = (101 ^ 92) ^ (59 ^ 34);
        lIIllIlllI[78] = (-21545) & 24573;
        lIIllIlllI[79] = (-28921) & 32764;
        lIIllIlllI[80] = (-1093) & 4086;
        lIIllIlllI[81] = (-"   ".length()) & (-28693) & 32511;
        lIIllIlllI[82] = (-13402) & 16351;
        lIIllIlllI[83] = (-16401) & 20221;
        lIIllIlllI[84] = (-((-7077) & 16383)) & (-4097) & 16350;
        lIIllIlllI[85] = (-((-2079) & 31231)) & (-10) & 32255;
        lIIllIlllI[86] = (-(177 ^ 180)) & (-12313) & 15807;
        lIIllIlllI[87] = (((38 + 32) - (-3)) + 62) ^ (((152 + 77) - 166) + 103);
    }

    private static boolean lIIIIIllIIlIl(int i, int i2) {
        return i > i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            cB();
            "".length();
            if ("   ".length() < (((113 ^ 13) ^ (76 ^ 38)) & (((91 ^ 71) ^ (169 ^ 163)) ^ (-" ".length())))) {
                return ((((133 + 106) - 73) + 45) ^ (((45 + 17) - 53) + 129)) & (((199 ^ 172) ^ (147 ^ 161)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIllIlllI[74];
    }

    private static String lIIIIIlIlllII(String lllllllllllllllllllllIllIIIIlllI, String lllllllllllllllllllllIllIIIIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllllIllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllllIllIIIIlIll = lllllllllllllllllllllIllIIIIllIl.toCharArray();
        int lllllllllllllllllllllIllIIIIlIlI = lIIllIlllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIlllI[1];
        while (lIIIIIllIIIIl(i, length)) {
            char lllllllllllllllllllllIllIIIIllll = charArray[i];
            sb.append((char) (lllllllllllllllllllllIllIIIIllll ^ lllllllllllllllllllllIllIIIIlIll[lllllllllllllllllllllIllIIIIlIlI % lllllllllllllllllllllIllIIIIlIll.length]));
            "".length();
            lllllllllllllllllllllIllIIIIlIlI++;
            i++;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIIllIlIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIIllIIIII(int i) {
        return i != 0;
    }

    private static boolean lIIIIIllIIlII(int i) {
        return i > 0;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIllIllIl[lIIllIlllI[75]];
    }

    private static int cC() {
        return (lIIIIIllIIIIl(Skills.getLevel(Skill.PRAYER), lIIllIlllI[70]) && lIIIIIllIlIII(Skills.getLevel(Skill.PRAYER), lIIllIlllI[71])) ? ((lIIllIlllI[69] - Skills.getExperience(Skill.PRAYER)) / lIIllIlllI[72]) + lIIllIlllI[21] : ((lIIllIlllI[73] - Skills.getExperience(Skill.PRAYER)) / lIIllIlllI[72]) + lIIllIlllI[62];
    }

    private static String lIIIIIlIllIll(String lllllllllllllllllllllIlIlllllIIl, String lllllllllllllllllllllIlIlllllIII) {
        try {
            SecretKeySpec lllllllllllllllllllllIlIllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlIlllllIII.getBytes(StandardCharsets.UTF_8)), lIIllIlllI[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIlllI[3], lllllllllllllllllllllIlIllllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIlIlllllIlI) {
            lllllllllllllllllllllIlIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIlIllIlI(String lllllllllllllllllllllIlIlllIllII, String lllllllllllllllllllllIlIlllIlIll) {
        try {
            SecretKeySpec lllllllllllllllllllllIlIlllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllIlIlllIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllIlIlllIlllI.init(lIIllIlllI[3], lllllllllllllllllllllIlIlllIllll);
            return new String(lllllllllllllllllllllIlIlllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIlIlllIllIl) {
            lllllllllllllllllllllIlIlllIllIl.printStackTrace();
            return null;
        }
    }

    private static void af() {
        int[] iArr = new int[lIIllIlllI[2]];
        iArr[lIIllIlllI[1]] = lIIllIlllI[8];
        if (lIIIIIllIIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlllI[8], lIIllIlllI[13], C0008i.bq));
            "".length();
        }
        int[] iArr2 = new int[lIIllIlllI[2]];
        iArr2[lIIllIlllI[1]] = lIIllIlllI[0];
        if (lIIIIIllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlllI[0], cC(), lIIllIlllI[63]));
            "".length();
        }
        int[] iArr3 = new int[lIIllIlllI[2]];
        iArr3[lIIllIlllI[1]] = lIIllIlllI[7];
        if (lIIIIIllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlllI[7], lIIllIlllI[3], lIIllIlllI[5]));
            "".length();
        }
        if (lIIIIIllIIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllIllIl[lIIllIlllI[77]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlllI[64], lIIllIlllI[13], lIIllIlllI[65]));
            "".length();
        }
        int[] iArr4 = new int[lIIllIlllI[2]];
        iArr4[lIIllIlllI[1]] = lIIllIlllI[66];
        if (lIIIIIllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlllI[66], lIIllIlllI[67], lIIllIlllI[68]));
            "".length();
        }
    }

    private static void lIIIIIlIlllIl() {
        lIIllIllIl = new String[lIIllIlllI[87]];
        lIIllIllIl[lIIllIlllI[1]] = lIIIIIlIllIlI("ui47BHm4pUfBThd2bAWfgA==", "WaBko");
        lIIllIllIl[lIIllIlllI[2]] = lIIIIIlIllIll("O7YBf8RqwfcZdLmqll7hGf8QqlGuYV3gXMyaZSg878xRhmGj4tDksJVCjbY/N/wB", "TmNew");
        lIIllIllIl[lIIllIlllI[3]] = lIIIIIlIlllII("JTEkKhEKJDstEUskPWMUCj45", "kPRCv");
        lIIllIllIl[lIIllIlllI[4]] = lIIIIIlIllIlI("mZiX3axDNxKqIIxrTK56h3WTl6sBbx9Z", "Bjuzb");
        lIIllIllIl[lIIllIlllI[6]] = lIIIIIlIllIll("KpHyyvB0llbbzXu5Ez+oDOJMjzl84xs3c5yeizkRvJ59l06Fhj4ahj4TtK0z3XkurWAEDJWsuTI=", "iHFgD");
        lIIllIllIl[lIIllIlllI[13]] = lIIIIIlIlllII("MhsBJhM=", "vihHx");
        lIIllIllIl[lIIllIlllI[15]] = lIIIIIlIlllII("BS8pFlElJWUEGD0uPA==", "QJEsq");
        lIIllIllIl[lIIllIlllI[17]] = lIIIIIlIllIll("lITQFGyigf8=", "lTFPP");
        lIIllIllIl[lIIllIlllI[18]] = lIIIIIlIlllII("GBgUDkcZGBgK", "Tybog");
        lIIllIllIl[lIIllIlllI[19]] = lIIIIIlIllIll("kv9Zh3SnQ27fFSwwxhMF8Ea+tBD9hPZ9hY7PELjRlQK0dKGaIeTRVg==", "DWGRw");
        lIIllIllIl[lIIllIlllI[21]] = lIIIIIlIlllII("NzQXSA4WdQAEDhgn", "yUahz");
        lIIllIllIl[lIIllIlllI[41]] = lIIIIIlIlllII("eVUNJisjVQk9KTE=", "HuyOH");
        lIIllIllIl[lIIllIlllI[44]] = lIIIIIlIlllII("KSssIhFKIiE5Axg=", "jCMMb");
        lIIllIllIl[lIIllIlllI[20]] = lIIIIIlIllIll("Kc5LyKaVQMnglDUEWsfCww==", "uxLdI");
        lIIllIllIl[lIIllIlllI[46]] = lIIIIIlIllIlI("oAqcjHKIVbM=", "JpJml");
        lIIllIllIl[lIIllIlllI[47]] = lIIIIIlIllIlI("0UDgUvmcrC0=", "WRazU");
        lIIllIllIl[lIIllIlllI[48]] = lIIIIIlIllIlI("rmXUSDA4RJI=", "rgFDk");
        lIIllIllIl[lIIllIlllI[49]] = lIIIIIlIllIlI("X/UR9vPTui+TpZP1Zedvwg==", "etluw");
        lIIllIllIl[lIIllIlllI[51]] = lIIIIIlIllIll("uupjjON+k73USp5B1CJTYQ==", "fzWbb");
        lIIllIllIl[lIIllIlllI[52]] = lIIIIIlIllIlI("Io379sImKrctQKZPAkFWiQ==", "uAttw");
        lIIllIllIl[lIIllIlllI[14]] = lIIIIIlIllIll("DOBUQ1dNo6WPhS+CSWtQ+GwTNjnz3TR7", "ocHAv");
        lIIllIllIl[lIIllIlllI[53]] = lIIIIIlIllIlI("1TMlILit0Qp8pZABKb3SbQ==", "sOJnP");
        lIIllIllIl[lIIllIlllI[54]] = lIIIIIlIllIll("vWk8uWhSaSY=", "pvQCk");
        lIIllIllIl[lIIllIlllI[55]] = lIIIIIlIlllII("JRMiBg==", "jcGhJ");
        lIIllIllIl[lIIllIlllI[56]] = lIIIIIlIlllII("DBUdOA==", "CexVI");
        lIIllIllIl[lIIllIlllI[57]] = lIIIIIlIlllII("MSIuDRYaPSg=", "tZMew");
        lIIllIllIl[lIIllIlllI[58]] = lIIIIIlIlllII("ETIVIjM6LRNqZw==", "TJvJR");
        lIIllIllIl[lIIllIlllI[59]] = lIIIIIlIlllII("KDANLzgDLwtnGAEk", "mHnGY");
        lIIllIllIl[lIIllIlllI[60]] = lIIIIIlIllIlI("qb1KkMARczAaeNKprkbSXw==", "GydYJ");
        lIIllIllIl[lIIllIlllI[61]] = lIIIIIlIlllII("AyYfD1g7KVEQGTkgAwsT", "TOqjx");
        lIIllIllIl[lIIllIlllI[62]] = lIIIIIlIllIll("q+w9quCo+No=", "zgPcw");
        lIIllIllIl[lIIllIlllI[75]] = lIIIIIlIllIll("DQ1uBC45vy//0MLtk5Rn4g==", "HVirc");
        lIIllIllIl[lIIllIlllI[77]] = lIIIIIlIllIlI("g86JNuuS4oute1b1jrxSxQ5OmdR0FTF+", "XYcyq");
    }

    private static boolean lIIIIIllIIIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIIIlIlllll();
        lIIIIIlIlllIl();
        jt = new WorldPoint(lIIllIlllI[78], lIIllIlllI[79], lIIllIlllI[1]);
        ju = new WorldPoint(lIIllIlllI[80], lIIllIlllI[81], lIIllIlllI[1]);
        jv = new WorldPoint(lIIllIlllI[82], lIIllIlllI[83], lIIllIlllI[1]);
        jw = new WorldPoint(lIIllIlllI[84], lIIllIlllI[43], lIIllIlllI[1]);
        jx = new WorldPoint(lIIllIlllI[1], lIIllIlllI[1], lIIllIlllI[1]);
        jy = new WorldPoint(lIIllIlllI[1], lIIllIlllI[1], lIIllIlllI[1]);
        jz = new WorldPoint(lIIllIlllI[85], lIIllIlllI[86], lIIllIlllI[1]);
        bv = new ArrayList();
    }

    private static boolean lIIIIIllIIllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIIIIIllIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        int[] iArr = new int[lIIllIlllI[2]];
        iArr[lIIllIlllI[1]] = lIIllIlllI[9];
        if (lIIIIIllIIIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIllIlllI[2]];
            iArr2[lIIllIlllI[1]] = lIIllIlllI[9];
            if (lIIIIIllIlIII(Inventory.getFirst(iArr2).getQuantity(), lIIllIlllI[12])) {
                if (lIIIIIllIIIlI(Inventory.contains(C0005f.ba) ? 1 : 0)) {
                    if (lIIIIIllIIIII(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIllIlllI[2]];
                        iArr3[lIIllIlllI[1]] = lIIllIlllI[0];
                        if (lIIIIIllIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIllIlllI[2]];
                            iArr4[lIIllIlllI[1]] = lIIllIlllI[50];
                        }
                    }
                }
                ?? r0 = lIIllIlllI[2];
                "".length();
                return (((127 ^ 35) ^ (58 ^ 116)) & (((((145 + 168) - 269) + 166) ^ (((78 + 152) - 81) + 43)) ^ (-" ".length()))) != 0 ? ((63 ^ 118) ^ (78 ^ 51)) & (((82 ^ 26) ^ (206 ^ 178)) ^ (-" ".length())) : r0;
            }
        }
        return lIIllIlllI[1];
    }

    private static boolean lIIIIIllIIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v307, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v331, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v52, types: [boolean] */
    public static void cB() {
        if (lIIIIIllIIIII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[1]];
            C0001b.a(bv);
            if (lIIIIIllIIIIl(bv.size(), lIIllIlllI[2])) {
                System.out.println(lIIllIllIl[lIIllIlllI[2]]);
                bt = lIIllIlllI[1];
            }
        }
        if (lIIIIIllIIIlI(bt ? 1 : 0)) {
            if (lIIIIIllIIIlI(ab() ? 1 : 0) && lIIIIIllIIIIl(Game.getWildyLevel(), lIIllIlllI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIIllIIIll(nearest) && lIIIIIllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[3]];
                    C0000a.a(nearest);
                }
                if (lIIIIIllIIIll(nearest) && lIIIIIllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[4]];
                    if (lIIIIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIllIlllI[5]);
                        "".length();
                    }
                    if (lIIIIIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIIllIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIllIlllI[6]);
                            "".length();
                        }
                        if (lIIIIIllIIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIllIlllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIllIlllI[4]];
                        iArr[lIIllIlllI[1]] = lIIllIlllI[7];
                        iArr[lIIllIlllI[2]] = lIIllIlllI[0];
                        iArr[lIIllIlllI[3]] = lIIllIlllI[8];
                        if (lIIIIIllIIIlI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIllIllIl[lIIllIlllI[6]]);
                            bt = lIIllIlllI[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIllIlllI[4]];
                        iArr2[lIIllIlllI[1]] = lIIllIlllI[7];
                        iArr2[lIIllIlllI[2]] = lIIllIlllI[0];
                        iArr2[lIIllIlllI[3]] = lIIllIlllI[8];
                        if (lIIIIIllIIIII(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIIIIIllIIIlI(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                                C0000a.b(C0005f.ba, lIIllIlllI[2]);
                            }
                            C0000a.b(C0005f.aV, lIIllIlllI[2]);
                            C0000a.a(lIIllIlllI[9], lIIllIlllI[10]);
                            C0000a.b(lIIllIlllI[0], lIIllIlllI[11]);
                        }
                    }
                }
            }
            if (lIIIIIllIIIII(ab() ? 1 : 0)) {
                if (lIIIIIllIIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIIllIIIIl(Movement.getRunEnergy(), lIIllIlllI[12])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIllIllIl[lIIllIlllI[13]]);
                    Time.sleepTicks(lIIllIlllI[2]);
                    "".length();
                }
                if (lIIIIIllIIIlI(Movement.isRunEnabled() ? 1 : 0) && lIIIIIllIIlIl(Movement.getRunEnergy(), lIIllIlllI[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIIllIlllI[13]);
                    "".length();
                }
                if (lIIIIIllIIIIl(Game.getWildyLevel(), lIIllIlllI[2])) {
                    AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[15]];
                    if (lIIIIIllIIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIIIIllIIIlI(Dialog.isOpen() ? 1 : 0) && lIIIIIllIIIII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIIIIIllIIllI(Players.getLocal().getAnimation(), lIIllIlllI[16])) {
                        Inventory.getFirst(C0005f.ba).interact(lIIllIllIl[lIIllIlllI[17]]);
                        Time.sleepTicks(lIIllIlllI[3]);
                        "".length();
                    }
                    String[] strArr = new String[lIIllIlllI[3]];
                    strArr[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[18]];
                    strArr[lIIllIlllI[2]] = lIIllIllIl[lIIllIlllI[19]];
                    C0006g.a(strArr);
                }
                if (lIIIIIllIIlII(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIIllIlllI[2]];
                    iArr3[lIIllIlllI[1]] = lIIllIlllI[0];
                    if (lIIIIIllIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                            AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIIllIlllI[20]];
                            worldPointArr[lIIllIlllI[1]] = new WorldPoint(lIIllIlllI[22], lIIllIlllI[23], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[2]] = new WorldPoint(lIIllIlllI[24], lIIllIlllI[25], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[3]] = new WorldPoint(lIIllIlllI[26], lIIllIlllI[27], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[4]] = new WorldPoint(lIIllIlllI[28], lIIllIlllI[29], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[6]] = new WorldPoint(lIIllIlllI[30], lIIllIlllI[31], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[13]] = new WorldPoint(lIIllIlllI[32], lIIllIlllI[33], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[15]] = new WorldPoint(lIIllIlllI[34], lIIllIlllI[35], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[17]] = new WorldPoint(lIIllIlllI[36], lIIllIlllI[37], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[18]] = new WorldPoint(lIIllIlllI[38], lIIllIlllI[37], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[19]] = new WorldPoint(lIIllIlllI[39], lIIllIlllI[37], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[21]] = new WorldPoint(lIIllIlllI[40], lIIllIlllI[37], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[41]] = new WorldPoint(lIIllIlllI[42], lIIllIlllI[43], lIIllIlllI[1]);
                            worldPointArr[lIIllIlllI[44]] = new WorldPoint(lIIllIlllI[45], lIIllIlllI[43], lIIllIlllI[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIllIlllI[2]);
                            "".length();
                        }
                        if (lIIIIIllIIlll(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                            AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[41]];
                            String[] strArr2 = new String[lIIllIlllI[2]];
                            strArr2[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIIllIlllI[2]];
                            strArr3[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIIllIlllI[2]];
                            strArr4[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[46]];
                            if (lIIIIIllIIIII(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIIllIllIl[lIIllIlllI[47]]);
                            }
                            if (lIIIIIllIIIll(nearest2)) {
                                String[] strArr5 = new String[lIIllIlllI[2]];
                                strArr5[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[48]];
                                if (lIIIIIllIIIlI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIIllIlllI[2]];
                                    iArr4[lIIllIlllI[1]] = lIIllIlllI[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIIllIlllI[2]];
                                    strArr6[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIIllIlllI[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIllIlllI[2]];
                    iArr5[lIIllIlllI[1]] = lIIllIlllI[0];
                    if (lIIIIIllIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIllIlllI[2]];
                        iArr6[lIIllIlllI[1]] = lIIllIlllI[50];
                        if (lIIIIIllIIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                                AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIllIlllI[20]];
                                worldPointArr2[lIIllIlllI[1]] = new WorldPoint(lIIllIlllI[22], lIIllIlllI[23], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[2]] = new WorldPoint(lIIllIlllI[24], lIIllIlllI[25], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[3]] = new WorldPoint(lIIllIlllI[26], lIIllIlllI[27], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[4]] = new WorldPoint(lIIllIlllI[28], lIIllIlllI[29], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[6]] = new WorldPoint(lIIllIlllI[30], lIIllIlllI[31], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[13]] = new WorldPoint(lIIllIlllI[32], lIIllIlllI[33], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[15]] = new WorldPoint(lIIllIlllI[34], lIIllIlllI[35], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[17]] = new WorldPoint(lIIllIlllI[36], lIIllIlllI[37], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[18]] = new WorldPoint(lIIllIlllI[38], lIIllIlllI[37], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[19]] = new WorldPoint(lIIllIlllI[39], lIIllIlllI[37], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[21]] = new WorldPoint(lIIllIlllI[40], lIIllIlllI[37], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[41]] = new WorldPoint(lIIllIlllI[42], lIIllIlllI[43], lIIllIlllI[1]);
                                worldPointArr2[lIIllIlllI[44]] = new WorldPoint(lIIllIlllI[45], lIIllIlllI[43], lIIllIlllI[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIllIlllI[2]);
                                "".length();
                            }
                            if (lIIIIIllIIlll(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                                AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[52]];
                                if (!lIIIIIllIIIlI(Dialog.canLevelUpContinue() ? 1 : 0) || lIIIIIllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIIllIlllI[2]];
                                strArr7[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIIllIlllI[2]];
                                strArr8[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIIllIlllI[2]];
                                strArr9[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[54]];
                                if (lIIIIIllIIIII(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIIllIllIl[lIIllIlllI[55]]);
                                }
                                if (lIIIIIllIIIll(nearest4)) {
                                    String[] strArr10 = new String[lIIllIlllI[2]];
                                    strArr10[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[56]];
                                    if (lIIIIIllIIIlI(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIIIIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIIllIlllI[2]];
                                            iArr7[lIIllIlllI[1]] = lIIllIlllI[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIIllIlllI[3]);
                                            "".length();
                                        }
                                        if (lIIIIIllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIIIIIllIIIlI(options.isEmpty() ? 1 : 0)) {
                                                int i = lIIllIlllI[1];
                                                while (lIIIIIllIIIIl(i, options.size())) {
                                                    int[] iArr8 = new int[lIIllIlllI[2]];
                                                    iArr8[lIIllIlllI[1]] = lIIllIlllI[50];
                                                    if (lIIIIIllIIllI(((Item) Inventory.getAll(iArr8).get(lIIllIlllI[1])).getQuantity(), lIIllIlllI[2]) && lIIIIIllIIIII(((Widget) options.get(i)).getText().contains(lIIllIllIl[lIIllIlllI[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIllIlllI[2]);
                                                        Time.sleepTicks(lIIllIlllI[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIIllIlllI[2]];
                                                    iArr9[lIIllIlllI[1]] = lIIllIlllI[50];
                                                    if (lIIIIIllIIllI(((Item) Inventory.getAll(iArr9).get(lIIllIlllI[1])).getQuantity(), lIIllIlllI[13]) && lIIIIIllIIIII(((Widget) options.get(i)).getText().contains(lIIllIllIl[lIIllIlllI[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIllIlllI[2]);
                                                        Time.sleepTicks(lIIllIlllI[3]);
                                                        "".length();
                                                    }
                                                    if (lIIIIIllIIIII(((Widget) options.get(i)).getText().contains(lIIllIllIl[lIIllIlllI[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIllIlllI[2]);
                                                        Time.sleepTicks(lIIllIlllI[3]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if ((-" ".length()) > 0) {
                                                        return;
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
            }
            int[] iArr10 = new int[lIIllIlllI[2]];
            iArr10[lIIllIlllI[1]] = lIIllIlllI[9];
            if (lIIIIIllIIIII(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIIllIlllI[2]];
                iArr11[lIIllIlllI[1]] = lIIllIlllI[0];
                if (!lIIIIIllIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIllIlllI[2]];
                iArr12[lIIllIlllI[1]] = lIIllIlllI[50];
                if (!lIIIIIllIIIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIIIIIllIIlll(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[60]];
                String[] strArr11 = new String[lIIllIlllI[2]];
                strArr11[lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIIIIIllIIIll(nearest6)) {
                    nearest6.interact(lIIllIllIl[lIIllIlllI[62]]);
                }
            }
        }
    }

    private static boolean lIIIIIllIIlll(int i, int i2) {
        return i <= i2;
    }
}
