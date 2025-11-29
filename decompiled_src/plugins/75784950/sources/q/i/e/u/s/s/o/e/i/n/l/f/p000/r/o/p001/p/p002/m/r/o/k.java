package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Prep supplies")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.k  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/k.class */
public class k extends Task {
    static /* synthetic */ WorldArea K;
    private static /* synthetic */ String[] lIIIIIIIllllI;
    static /* synthetic */ WorldArea Q;
    static final /* synthetic */ WorldArea at;
    static final /* synthetic */ WorldArea au;
    static /* synthetic */ int an;
    static /* synthetic */ int am;
    static /* synthetic */ WorldArea ap;
    static final /* synthetic */ WorldArea as;
    static /* synthetic */ WorldPoint al;
    static /* synthetic */ WorldArea aq;
    private final /* synthetic */ SquireMoonsOfPerilConfig aj;
    static /* synthetic */ WorldPoint ak;
    private static /* synthetic */ int[] lIIIIIIIlllll;
    static /* synthetic */ long ao;
    static final /* synthetic */ WorldArea ar;

    static {
        lIIlIlllIIlIIIl();
        lIIlIlllIIIIllI();
        ak = new WorldPoint(lIIIIIIIlllll[95], lIIIIIIIlllll[96], lIIIIIIIlllll[0]);
        al = new WorldPoint(lIIIIIIIlllll[97], lIIIIIIIlllll[98], lIIIIIIIlllll[0]);
        am = lIIIIIIIlllll[0];
        ao = System.currentTimeMillis();
        ap = new WorldArea(lIIIIIIIlllll[99], lIIIIIIIlllll[100], lIIIIIIIlllll[51], lIIIIIIIlllll[57], lIIIIIIIlllll[0]);
        aq = new WorldArea(lIIIIIIIlllll[101], lIIIIIIIlllll[102], lIIIIIIIlllll[54], lIIIIIIIlllll[50], lIIIIIIIlllll[0]);
        Q = new WorldArea(lIIIIIIIlllll[103], lIIIIIIIlllll[100], lIIIIIIIlllll[51], lIIIIIIIlllll[57], lIIIIIIIlllll[0]);
        K = new WorldArea(lIIIIIIIlllll[104], lIIIIIIIlllll[105], lIIIIIIIlllll[55], lIIIIIIIlllll[55], lIIIIIIIlllll[0]);
        ar = new WorldArea(lIIIIIIIlllll[106], lIIIIIIIlllll[107], lIIIIIIIlllll[66], lIIIIIIIlllll[80], lIIIIIIIlllll[0]);
        as = new WorldArea(lIIIIIIIlllll[106], lIIIIIIIlllll[108], lIIIIIIIlllll[82], lIIIIIIIlllll[109], lIIIIIIIlllll[0]);
        at = new WorldArea(lIIIIIIIlllll[110], lIIIIIIIlllll[102], lIIIIIIIlllll[74], lIIIIIIIlllll[77], lIIIIIIIlllll[0]);
        au = new WorldArea(lIIIIIIIlllll[111], lIIIIIIIlllll[112], lIIIIIIIlllll[63], lIIIIIIIlllll[59], lIIIIIIIlllll[1]);
    }

    private static int lIIlIlllIIllIIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIIlIlllIIlllll(int i, int i2) {
        return i <= i2;
    }

    private static String lIIlIlllIIIIIll(String lllllllllllllllIIIllllIlIIIlllll, String lllllllllllllllIIIllllIlIIIllllI) {
        String lllllllllllllllIIIllllIlIIIlllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllIlIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIllllIlIIIllllI.toCharArray();
        int lllllllllllllllIIIllllIlIIIllIll = lIIIIIIIlllll[0];
        char[] charArray2 = lllllllllllllllIIIllllIlIIIlllll2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIIlllll[0];
        while (lIIlIlllIIllIlI(i, length)) {
            char lllllllllllllllIIIllllIlIIlIIIII = charArray2[i];
            sb.append((char) (lllllllllllllllIIIllllIlIIlIIIII ^ charArray[lllllllllllllllIIIllllIlIIIllIll % charArray.length]));
            "".length();
            lllllllllllllllIIIllllIlIIIllIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static int lIIlIlllIlIIIIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIIlIlllIIlIIll(int i) {
        return i != 0;
    }

    private static String lIIlIlllIIIIlII(String lllllllllllllllIIIllllIlIIIIlIlI, String lllllllllllllllIIIllllIlIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIlIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlllll[9]), "DES");
            Cipher lllllllllllllllIIIllllIlIIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIIllllIlIIIIllII.init(lIIIIIIIlllll[2], lllllllllllllllIIIllllIlIIIIllIl);
            return new String(lllllllllllllllIIIllllIlIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIlIIIIIllI) {
            lllllllllllllllIIIllllIlIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIIlIIIl() {
        lIIIIIIIlllll = new int[114];
        lIIIIIIIlllll[0] = (140 ^ 130) & ((49 ^ 63) ^ (-1));
        lIIIIIIIlllll[1] = " ".length();
        lIIIIIIIlllll[2] = "  ".length();
        lIIIIIIIlllll[3] = "   ".length();
        lIIIIIIIlllll[4] = 171 ^ 175;
        lIIIIIIIlllll[5] = 87 ^ 82;
        lIIIIIIIlllll[6] = (36 ^ 108) ^ (222 ^ 144);
        lIIIIIIIlllll[7] = 38 ^ 33;
        lIIIIIIIlllll[8] = (((11 + 38) - (-97)) + 57) ^ (((67 + 33) - 80) + 121);
        lIIIIIIIlllll[9] = 1 ^ 9;
        lIIIIIIIlllll[10] = (((61 + 104) - 126) + 119) ^ (((62 + 94) - 12) + 7);
        lIIIIIIIlllll[11] = (-((-138) & 22745)) & (-1) & 24063;
        lIIIIIIIlllll[12] = (-((-681) & 21228)) & (-513) & 30707;
        lIIIIIIIlllll[13] = (((121 + 114) - 185) + 128) ^ (((35 + 74) - 49) + 124);
        lIIIIIIIlllll[14] = (0 ^ 36) ^ (183 ^ 152);
        lIIIIIIIlllll[15] = 185 ^ 181;
        lIIIIIIIlllll[16] = (-((-525) & 31423)) & (-522) & 32767;
        lIIIIIIIlllll[17] = (-137) & 9727;
        lIIIIIIIlllll[18] = (62 ^ 26) ^ (113 ^ 88);
        lIIIIIIIlllll[19] = 202 ^ 196;
        lIIIIIIIlllll[20] = 132 ^ 139;
        lIIIIIIIlllll[21] = (-((-13707) & 32651)) & (-17) & 20350;
        lIIIIIIIlllll[22] = (-6689) & 16365;
        lIIIIIIIlllll[23] = 139 ^ 155;
        lIIIIIIIlllll[24] = (32 ^ 61) ^ (145 ^ 157);
        lIIIIIIIlllll[25] = (((179 + 91) - 201) + 118) ^ (((16 + 40) - (-50)) + 63);
        lIIIIIIIlllll[26] = 190 ^ 173;
        lIIIIIIIlllll[27] = 161 ^ 181;
        lIIIIIIIlllll[28] = 74 ^ 95;
        lIIIIIIIlllll[29] = 176 ^ 166;
        lIIIIIIIlllll[30] = (75 ^ 15) ^ (193 ^ 146);
        lIIIIIIIlllll[31] = 152 ^ 128;
        lIIIIIIIlllll[32] = 172 ^ 181;
        lIIIIIIIlllll[33] = 125 ^ 103;
        lIIIIIIIlllll[34] = 97 ^ 122;
        lIIIIIIIlllll[35] = ((105 + 13) - 100) + 215;
        lIIIIIIIlllll[36] = ((98 + 0) - 54) + 183;
        lIIIIIIIlllll[37] = 144 ^ 140;
        lIIIIIIIlllll[38] = 135 ^ 154;
        lIIIIIIIlllll[39] = (198 ^ 148) ^ (38 ^ 106);
        lIIIIIIIlllll[40] = (118 ^ 63) ^ (236 ^ 186);
        lIIIIIIIlllll[41] = (121 ^ 7) ^ (224 ^ 190);
        lIIIIIIIlllll[42] = 81 ^ 112;
        lIIIIIIIlllll[43] = 31 ^ 61;
        lIIIIIIIlllll[44] = (-((-1957) & 4021)) & (-20995) & 24575;
        lIIIIIIIlllll[45] = (-((-10145) & 32677)) & (-1) & 32223;
        lIIIIIIIlllll[46] = (-((-12996) & 14047)) & (-16513) & 24063;
        lIIIIIIIlllll[47] = (-((-22993) & 31729)) & (-16516) & 32751;
        lIIIIIIIlllll[48] = (((61 + 78) - 83) + 76) ^ (((126 + 140) - 246) + 147);
        lIIIIIIIlllll[49] = 6 ^ 34;
        lIIIIIIIlllll[50] = 159 ^ 186;
        lIIIIIIIlllll[51] = (123 ^ 63) ^ (87 ^ 53);
        lIIIIIIIlllll[52] = (((15 + 61) - 2) + 67) ^ (((128 + 33) - 148) + 157);
        lIIIIIIIlllll[53] = (((28 + 47) - 35) + 140) ^ (((78 + 0) - 20) + 98);
        lIIIIIIIlllll[54] = (11 ^ 115) ^ (123 ^ 42);
        lIIIIIIIlllll[55] = (((62 + 150) - 166) + 115) ^ (((4 + 115) - 72) + 92);
        lIIIIIIIlllll[56] = 119 ^ 92;
        lIIIIIIIlllll[57] = (94 ^ 37) ^ (245 ^ 162);
        lIIIIIIIlllll[58] = "   ".length() ^ (94 ^ 112);
        lIIIIIIIlllll[59] = (((92 + 57) - 106) + 144) ^ (((1 + 9) - (-42)) + 97);
        lIIIIIIIlllll[60] = (((110 + 63) - 47) + 6) ^ (((64 + 35) - 54) + 126);
        lIIIIIIIlllll[61] = (((31 + 39) - (-83)) + 0) ^ (((63 + 83) - 14) + 37);
        lIIIIIIIlllll[62] = 47 ^ 30;
        lIIIIIIIlllll[63] = 48 ^ 2;
        lIIIIIIIlllll[64] = (((98 + 81) - 37) + 33) ^ (((69 + 97) - 165) + 155);
        lIIIIIIIlllll[65] = 27 ^ 47;
        lIIIIIIIlllll[66] = 3 ^ 54;
        lIIIIIIIlllll[67] = 0 ^ 54;
        lIIIIIIIlllll[68] = (24 ^ 90) ^ (63 ^ 74);
        lIIIIIIIlllll[69] = (98 ^ 13) ^ (247 ^ 160);
        lIIIIIIIlllll[70] = 249 ^ 192;
        lIIIIIIIlllll[71] = (106 ^ 49) ^ (227 ^ 130);
        lIIIIIIIlllll[72] = (-13833) & 14137;
        lIIIIIIIlllll[73] = (8 ^ 104) ^ (30 ^ 69);
        lIIIIIIIlllll[74] = (121 ^ 100) ^ (45 ^ 12);
        lIIIIIIIlllll[75] = 127 ^ 66;
        lIIIIIIIlllll[76] = (((124 + 65) - 60) + 125) ^ (((144 + 15) - 113) + 146);
        lIIIIIIIlllll[77] = (((21 + 67) - 17) + 85) ^ (((87 + 97) - 91) + 70);
        lIIIIIIIlllll[78] = 7 ^ 71;
        lIIIIIIIlllll[79] = "  ".length() ^ (115 ^ 48);
        lIIIIIIIlllll[80] = (255 ^ 181) ^ (60 ^ 52);
        lIIIIIIIlllll[81] = (((2 + 87) - (-89)) + 55) ^ (((159 + 87) - 150) + 74);
        lIIIIIIIlllll[82] = 118 ^ 50;
        lIIIIIIIlllll[83] = (168 ^ 190) ^ (105 ^ 58);
        lIIIIIIIlllll[84] = (81 ^ 9) ^ (53 ^ 42);
        lIIIIIIIlllll[85] = (((14 + 230) - 210) + 204) ^ (((112 + 31) - 4) + 27);
        lIIIIIIIlllll[86] = (105 ^ 12) ^ (138 ^ 166);
        lIIIIIIIlllll[87] = 0 ^ 74;
        lIIIIIIIlllll[88] = 108 ^ 39;
        lIIIIIIIlllll[89] = 104 ^ 36;
        lIIIIIIIlllll[90] = 138 ^ 199;
        lIIIIIIIlllll[91] = 58 ^ 116;
        lIIIIIIIlllll[92] = 49 ^ 126;
        lIIIIIIIlllll[93] = 114 ^ 34;
        lIIIIIIIlllll[94] = 0 ^ 81;
        lIIIIIIIlllll[95] = (-16904) & 18423;
        lIIIIIIIlllll[96] = (-((-8649) & 29167)) & (-2561) & 32767;
        lIIIIIIIlllll[97] = (-((-801) & 25399)) & (-4610) & 30719;
        lIIIIIIIlllll[98] = (-18434) & 28127;
        lIIIIIIIlllll[99] = (-20993) & 22363;
        lIIIIIIIlllll[100] = (-4677) & 14286;
        lIIIIIIIlllll[101] = (-12293) & 13711;
        lIIIIIIIlllll[102] = (-((-3475) & 3987)) & (-16449) & 26623;
        lIIIIIIIlllll[103] = (-((-21979) & 32219)) & (-16449) & 28159;
        lIIIIIIIlllll[104] = (-((-25955) & 28007)) & (-1) & 3543;
        lIIIIIIIlllll[105] = (-35) & 9594;
        lIIIIIIIlllll[106] = (-25217) & 26558;
        lIIIIIIIlllll[107] = (-((-1049) & 19993)) & (-195) & 28671;
        lIIIIIIIlllll[108] = (-((-1461) & 20470)) & (-4097) & 32767;
        lIIIIIIIlllll[109] = (46 ^ 120) ^ "  ".length();
        lIIIIIIIlllll[110] = (-28699) & 30171;
        lIIIIIIIlllll[111] = (-16498) & 17911;
        lIIIIIIIlllll[112] = (-((-9371) & 25791)) & (-2065) & 28095;
        lIIIIIIIlllll[113] = (((173 + 32) - 54) + 84) ^ (((172 + 25) - 38) + 26);
    }

    private static boolean lIIlIlllIIllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlllIlIIIlI(int i) {
        return i > 0;
    }

    private static boolean lIIlIlllIIlIllI(Object obj) {
        return obj != null;
    }

    public static void f() {
        if (lIIlIlllIIlIIll(Inventory.contains(item -> {
            return item.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[94]]);
        }) ? 1 : 0)) {
            String[] strArr = new String[lIIIIIIIlllll[1]];
            strArr[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[0]];
            if (!lIIlIlllIIlIIll(Inventory.contains(strArr) ? 1 : 0)) {
                if (lIIlIlllIIlIIll(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[93]]);
                }) ? 1 : 0)) {
                    g();
                    i();
                    return;
                }
                return;
            }
        }
        h();
    }

    private static boolean lIIlIlllIIllllI(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIlllIIIIlIl(String lllllllllllllllIIIllllIIllllllIl, String lllllllllllllllIIIllllIIllllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIIllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIlllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIIlllllllI) {
            lllllllllllllllIIIllllIIlllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIIlllIl(int i) {
        return i == 0;
    }

    private static void lIIlIlllIIIIllI() {
        lIIIIIIIllllI = new String[lIIIIIIIlllll[113]];
        lIIIIIIIllllI[lIIIIIIIlllll[0]] = lIIlIlllIIIIIll("CRclOzwtHyIhcCMKPzdwNBk5ITU=", "DxJUP");
        lIIIIIIIllllI[lIIIIIIIlllll[1]] = lIIlIlllIIIIIll("KhUVNB4OHRIuUhcVDjMdCVJLcw==", "gzzZr");
        lIIIIIIIllllI[lIIIIIIIlllll[2]] = lIIlIlllIIIIlII("Pa3VdwKX/TNMXbCv/AqRxTahE1/myvAl", "rvGTC");
        lIIIIIIIllllI[lIIIIIIIlllll[3]] = lIIlIlllIIIIlII("lPlIERZnJ052pGOyMCCdaHnEMpHsU1LC", "vBaou");
        lIIIIIIIllllI[lIIIIIIIlllll[4]] = lIIlIlllIIIIlII("+vcAXRsdw6lLa+pOsIcl9V66g2m2IhlK", "ZnUdh");
        lIIIIIIIllllI[lIIIIIIIlllll[5]] = lIIlIlllIIIIIll("IQ0iFHUYAmMPNAMBMQ==", "wdCxU");
        lIIIIIIIllllI[lIIIIIIIlllll[6]] = lIIlIlllIIIIIll("BSIiNGs8LWMvKicuMQ==", "SKCXK");
        lIIIIIIIllllI[lIIIIIIIlllll[7]] = lIIlIlllIIIIlII("N3G/8NLCkZ8=", "EPuaQ");
        lIIIIIIIllllI[lIIIIIIIlllll[9]] = lIIlIlllIIIIlIl("tyovTnBxK3aZX7rMlprnDQ==", "JXQSn");
        lIIIIIIIllllI[lIIIIIIIlllll[10]] = lIIlIlllIIIIIll("PBY4PU4SAiMoAg==", "qwSXc");
        lIIIIIIIllllI[lIIIIIIIlllll[13]] = lIIlIlllIIIIlIl("QalTiWSwB5fBgH7wytM2M/8U4p86svDz", "OtJVX");
        lIIIIIIIllllI[lIIIIIIIlllll[14]] = lIIlIlllIIIIlIl("+5ZsKVTUxis7HbPWrqQClU+aBbBoe571", "YGpNa");
        lIIIIIIIllllI[lIIIIIIIlllll[15]] = lIIlIlllIIIIlIl("ggtzK8CzmCDTjBLokRqY7A==", "UnfsH");
        lIIIIIIIllllI[lIIIIIIIlllll[18]] = lIIlIlllIIIIlIl("ajECgZRS7JZpOhFwr3w4eGS6AkVlXZxD", "CWUYB");
        lIIIIIIIllllI[lIIIIIIIlllll[19]] = lIIlIlllIIIIlII("wR7+VXbtSIIHaYILSKcE9eiG7sxbnS7/", "yWteA");
        lIIIIIIIllllI[lIIIIIIIlllll[20]] = lIIlIlllIIIIlII("b4O2B8QbyIJDUPos2DUEyA==", "yFoJY");
        lIIIIIIIllllI[lIIIIIIIlllll[23]] = lIIlIlllIIIIIll("NgUBaDIXRAQ8NB0FGiopDQoTaCIXCwU=", "xdwHF");
        lIIIIIIIllllI[lIIIIIIIlllll[24]] = lIIlIlllIIIIlIl("JTzIv2evVX7a7wG0QYx3G8GmXgYoP4eU", "zaaGv");
        lIIIIIIIllllI[lIIIIIIIlllll[25]] = lIIlIlllIIIIlII("Uh6a2gq29WL+yWqc5XBpzA==", "HFcAQ");
        lIIIIIIIllllI[lIIIIIIIlllll[26]] = lIIlIlllIIIIIll("DjEyIQ==", "XXSMo");
        lIIIIIIIllllI[lIIIIIIIlllll[27]] = lIIlIlllIIIIlII("lnJJq/10CAw=", "qDoxB");
        lIIIIIIIllllI[lIIIIIIIlllll[28]] = lIIlIlllIIIIlIl("J7UtKAh91rs=", "UEpGR");
        lIIIIIIIllllI[lIIIIIIIlllll[29]] = lIIlIlllIIIIlII("UlSnQTg+YN2WllgarMSxIw==", "govWo");
        lIIIIIIIllllI[lIIIIIIIlllll[30]] = lIIlIlllIIIIlII("WoRSM9nb+T8BdWrIug9/0Q==", "AbxoD");
        lIIIIIIIllllI[lIIIIIIIlllll[31]] = lIIlIlllIIIIlIl("UjBP9gkz8TA=", "ndTIr");
        lIIIIIIIllllI[lIIIIIIIlllll[32]] = lIIlIlllIIIIlIl("ZPOB+EYbqk+eLIw/1e42aA==", "qytFE");
        lIIIIIIIllllI[lIIIIIIIlllll[33]] = lIIlIlllIIIIlIl("SsuatwuUMWQvoxo8owX7JQ==", "dyqPz");
        lIIIIIIIllllI[lIIIIIIIlllll[34]] = lIIlIlllIIIIlII("6pBHNH7Dl74=", "NoMZt");
        lIIIIIIIllllI[lIIIIIIIlllll[37]] = lIIlIlllIIIIlIl("+mr3M4Q2NA3tSMCXbNdBlw==", "plNDf");
        lIIIIIIIllllI[lIIIIIIIlllll[38]] = lIIlIlllIIIIIll("CBIsZSsqBTplEDoHKCkKKgQ=", "OwXEc");
        lIIIIIIIllllI[lIIIIIIIlllll[39]] = lIIlIlllIIIIIll("PzwmAykVaTUBJBgsJQ==", "lIVsE");
        lIIIIIIIllllI[lIIIIIIIlllll[40]] = lIIlIlllIIIIIll("OA4bKzkcBhwxdRITASd1BQAHMTA=", "uatEU");
        lIIIIIIIllllI[lIIIIIIIlllll[41]] = lIIlIlllIIIIIll("GiokCT8+IiMTczA3PgU=", "WEKgS");
        lIIIIIIIllllI[lIIIIIIIlllll[42]] = lIIlIlllIIIIlII("LNBoS2+NhbOmCRxGhAGZ6w==", "gknTe");
        lIIIIIIIllllI[lIIIIIIIlllll[43]] = lIIlIlllIIIIIll("Hx0gKyI7FScxbjUAOic=", "RrOEN");
        lIIIIIIIllllI[lIIIIIIIlllll[48]] = lIIlIlllIIIIlII("j8jI6enZ2Ph8YgCzu48Md+JT3W0jhHwC", "vXyNt");
        lIIIIIIIllllI[lIIIIIIIlllll[49]] = lIIlIlllIIIIIll("MyY/MAEGLiU/RBM1PjoX", "tGKXd");
        lIIIIIIIllllI[lIIIIIIIlllll[50]] = lIIlIlllIIIIIll("PQUzDyADVzUMMhYeKAo=", "zwFmB");
        lIIIIIIIllllI[lIIIIIIIlllll[51]] = lIIlIlllIIIIlII("qdlVnFVp6IpJTjmHPdniRw==", "DsSNx");
        lIIIIIIIllllI[lIIIIIIIlllll[52]] = lIIlIlllIIIIlII("ooy0uNWoJ5JpU6+hE5HO2A==", "PEQam");
        lIIIIIIIllllI[lIIIIIIIlllll[53]] = lIIlIlllIIIIIll("Cj89GC4uNzoCYiAiJxQ=", "GPRvB");
        lIIIIIIIllllI[lIIIIIIIlllll[54]] = lIIlIlllIIIIIll("JyMQIyoNPwJwJRYkByM=", "dQePB");
        lIIIIIIIllllI[lIIIIIIIlllll[55]] = lIIlIlllIIIIlII("Cer7m7XKpEuoKevlEq0biA==", "TyNAK");
        lIIIIIIIllllI[lIIIIIIIlllll[56]] = lIIlIlllIIIIlIl("4ufbEbia82cffdScBCuPz7LKN526l6Mp", "eXrlT");
        lIIIIIIIllllI[lIIIIIIIlllll[57]] = lIIlIlllIIIIlIl("9DNCzWo2DbbfM2MI8VCUqg==", "qGanp");
        lIIIIIIIllllI[lIIIIIIIlllll[58]] = lIIlIlllIIIIlII("J2SpZaQqgMxsLyWtgebs9Q==", "QTrPO");
        lIIIIIIIllllI[lIIIIIIIlllll[59]] = lIIlIlllIIIIlII("JU3ltQqa56Y+ac13rzGdHNb6gupyUThY", "Rasfh");
        lIIIIIIIllllI[lIIIIIIIlllll[60]] = lIIlIlllIIIIIll("PBsmNAkRByh6Fh0I", "xiOZb");
        lIIIIIIIllllI[lIIIIIIIlllll[61]] = lIIlIlllIIIIIll("ISA8HE4PNCcJAg==", "lAWyc");
        lIIIIIIIllllI[lIIIIIIIlllll[62]] = lIIlIlllIIIIlII("y6CtJyV+TkXbQyyqkpoQKWva5WEoNKhQ", "btxPg");
        lIIIIIIIllllI[lIIIIIIIlllll[63]] = lIIlIlllIIIIIll("IDc0IggeMWc0DwQkJj8CFQ==", "pVGQa");
        lIIIIIIIllllI[lIIIIIIIlllll[64]] = lIIlIlllIIIIIll("JgA2JmACCTc6OBEJ", "vaEUM");
        lIIIIIIIllllI[lIIIIIIIlllll[65]] = lIIlIlllIIIIlII("Z9/N+wbzDRJE5K6MaSwob8Z+uRINPWpn", "zeukK");
        lIIIIIIIllllI[lIIIIIIIlllll[66]] = lIIlIlllIIIIlIl("DwbQK+uA7ta+l9zkhZUflSp9hzoKkixS", "tQQiq");
        lIIIIIIIllllI[lIIIIIIIlllll[67]] = lIIlIlllIIIIIll("Ny0rJ1gTJCo7AAAk", "gLXTu");
        lIIIIIIIllllI[lIIIIIIIlllll[68]] = lIIlIlllIIIIlIl("d7WkjfekHZq+YeMauahruwAggoQT3D92", "UOVEK");
        lIIIIIIIllllI[lIIIIIIIlllll[69]] = lIIlIlllIIIIlII("oau/brb8qfvaeOXYgwRASxMb5M1dDFnp", "IZKPO");
        lIIIIIIIllllI[lIIIIIIIlllll[70]] = lIIlIlllIIIIlII("+Ei+tev9geLw5HR2scV7eg==", "bSbeB");
        lIIIIIIIllllI[lIIIIIIIlllll[71]] = lIIlIlllIIIIlII("kLME/gpPfm6UnVdoL1GnMg==", "XRAQY");
        lIIIIIIIllllI[lIIIIIIIlllll[73]] = lIIlIlllIIIIIll("HSQfYSc8ZRo0IyMpACQg", "SEiAS");
        lIIIIIIIllllI[lIIIIIIIlllll[74]] = lIIlIlllIIIIIll("MAEEcSwSEA==", "wdpQB");
        lIIIIIIIllllI[lIIIIIIIlllll[75]] = lIIlIlllIIIIlIl("lxbV0DhyQk5IU1/Wcqkfmg==", "xvWQf");
        lIIIIIIIllllI[lIIIIIIIlllll[76]] = lIIlIlllIIIIlIl("fFuYHXTBgSD8rjbQXgho97i0aojpdZxp", "vDfKp");
        lIIIIIIIllllI[lIIIIIIIlllll[77]] = lIIlIlllIIIIlIl("dN/K0YYTYn8=", "BeTmT");
        lIIIIIIIllllI[lIIIIIIIlllll[78]] = lIIlIlllIIIIlII("m2gMRK0gNxk=", "oBOnf");
        lIIIIIIIllllI[lIIIIIIIlllll[79]] = lIIlIlllIIIIlII("Y6zA0IeE/E54f+XXxDxZJw==", "MzGpd");
        lIIIIIIIllllI[lIIIIIIIlllll[80]] = lIIlIlllIIIIlII("5ZReqXhkByiqVvHyumEdLQ==", "ghvkx");
        lIIIIIIIllllI[lIIIIIIIlllll[81]] = lIIlIlllIIIIlII("VcGROkj3tw4pXUnwX5Pbnw==", "EsSQy");
        lIIIIIIIllllI[lIIIIIIIlllll[82]] = lIIlIlllIIIIIll("MB4EIgodFks6FxwHDg==", "sqkIc");
        lIIIIIIIllllI[lIIIIIIIlllll[83]] = lIIlIlllIIIIlII("/Ra9QLOgkTc=", "wCCqk");
        lIIIIIIIllllI[lIIIIIIIlllll[8]] = lIIlIlllIIIIlIl("VLFHYDJxc40NTVfod6P6eQ==", "vkFVE");
        lIIIIIIIllllI[lIIIIIIIlllll[84]] = lIIlIlllIIIIlIl("dInnhcjCHPw=", "eyqoQ");
        lIIIIIIIllllI[lIIIIIIIlllll[85]] = lIIlIlllIIIIIll("JCI4IDMPLyk=", "aLLRR");
        lIIIIIIIllllI[lIIIIIIIlllll[86]] = lIIlIlllIIIIlIl("X9CvUaKYgk0JTTTrCNh5Xw==", "hQHgL");
        lIIIIIIIllllI[lIIIIIIIlllll[87]] = lIIlIlllIIIIlIl("avBowm+b2nT2rM58tvOD/Q==", "LKYdx");
        lIIIIIIIllllI[lIIIIIIIlllll[88]] = lIIlIlllIIIIIll("NxwnBjEaFGgeLBsFLQ==", "tsHmX");
        lIIIIIIIllllI[lIIIIIIIlllll[89]] = lIIlIlllIIIIIll("FQ8ZFyM+Agg=", "PameB");
        lIIIIIIIllllI[lIIIIIIIlllll[90]] = lIIlIlllIIIIIll("NB0fCgkfEA4=", "qskxh");
        lIIIIIIIllllI[lIIIIIIIlllll[91]] = lIIlIlllIIIIlIl("Qfa5s1BDtNstZTZtxPQUsw==", "ajTwu");
        lIIIIIIIllllI[lIIIIIIIlllll[92]] = lIIlIlllIIIIlII("R3F/G6Yvh6NtXQCderhoCg==", "zQJyA");
        lIIIIIIIllllI[lIIIIIIIlllll[93]] = lIIlIlllIIIIlIl("DOWFAX7+pHgei1IemnWUtPKRiC0QfTWo", "jJNdN");
        lIIIIIIIllllI[lIIIIIIIlllll[94]] = lIIlIlllIIIIlII("Rr6SyiQFdmxFA+xPYWsGB20X49ZJ7Jy/", "wKxnQ");
    }

    private static boolean lIIlIlllIIllIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlllIIlIlll(int i, int i2) {
        return i >= i2;
    }

    private static void g() {
        String[] strArr = new String[lIIIIIIIlllll[1]];
        strArr[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[1]];
        Item first = Inventory.getFirst(strArr);
        String[] strArr2 = new String[lIIIIIIIlllll[1]];
        strArr2[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[2]];
        Item first2 = Inventory.getFirst(strArr2);
        String[] strArr3 = new String[lIIIIIIIlllll[1]];
        strArr3[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[3]];
        Item first3 = Inventory.getFirst(strArr3);
        if (lIIlIlllIIlIllI(first) && lIIlIlllIIlIllI(first3)) {
            first.useOn(first3);
            return;
        }
        if (lIIlIlllIIlIllI(first2)) {
            String[] strArr4 = new String[lIIIIIIIlllll[1]];
            strArr4[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[4]];
            List all = Inventory.getAll(strArr4);
            if (lIIlIlllIIlIlll(all.size(), lIIIIIIIlllll[2])) {
                ((Item) all.get(lIIIIIIIlllll[0])).useOn((Item) all.get(lIIIIIIIlllll[1]));
                return;
            } else if (lIIlIlllIIlIllI(first)) {
                first.useOn(first2);
                return;
            } else if (lIIlIlllIIlIllI(first3)) {
                first2.useOn(first3);
                return;
            }
        }
        String[] strArr5 = new String[lIIIIIIIlllll[1]];
        strArr5[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[5]];
        if (lIIlIlllIIlIIll(Inventory.contains(strArr5) ? 1 : 0)) {
            String[] strArr6 = new String[lIIIIIIIlllll[1]];
            strArr6[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[6]];
            Inventory.getFirst(strArr6).interact(lIIIIIIIllllI[lIIIIIIIlllll[7]]);
        }
    }

    private static void i() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[88]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlllll[5])) {
                ?? r0 = lIIIIIIIlllll[1];
                "".length();
                return (-"  ".length()) >= 0 ? ((82 ^ 62) ^ (33 ^ 109)) & (((((140 + 106) - 216) + 140) ^ (((36 + 11) - 3) + 94)) ^ (-" ".length())) : r0;
            }
            return lIIIIIIIlllll[0];
        });
        if (lIIlIlllIIlIllI(nearest) && lIIlIlllIIllIlI(Movement.getRunEnergy(), lIIIIIIIlllll[8])) {
            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[60]];
            nearest.interact(lIIIIIIIllllI[lIIIIIIIlllll[61]]);
            return;
        }
        if (lIIlIlllIIlIIll(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint = new WorldPoint(lIIIIIIIlllll[11], lIIIIIIIlllll[12], lIIIIIIIlllll[1]);
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (lIIlIlllIIlIIll(tileObject2.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[87]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject2.getWorldLocation().distanceTo(worldPoint), lIIIIIIIlllll[5])) {
                    ?? r0 = lIIIIIIIlllll[1];
                    "".length();
                    return (((48 ^ 122) ^ (170 ^ 131)) & (((231 ^ 176) ^ (244 ^ 192)) ^ (-" ".length()))) > 0 ? ((((76 + 92) - 2) + 70) ^ (((6 + 64) - (-53)) + 59)) & (((126 ^ 32) ^ (3 ^ 7)) ^ (-" ".length())) : r0;
                }
                return lIIIIIIIlllll[0];
            });
            if (lIIlIlllIIllIll(nearest2)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[62]];
                Movement.walkTo(worldPoint);
                "".length();
                return;
            } else if (lIIlIlllIIlIllI(nearest2)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[63]];
                nearest2.interact(lIIIIIIIllllI[lIIIIIIIlllll[64]]);
                return;
            }
        }
        if (lIIlIlllIIlIIll(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint2 = new WorldPoint(lIIIIIIIlllll[16], lIIIIIIIlllll[17], lIIIIIIIlllll[0]);
            TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
                if (lIIlIlllIIlIIll(tileObject3.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[86]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject3.getWorldLocation().distanceTo(worldPoint2), lIIIIIIIlllll[5])) {
                    ?? r0 = lIIIIIIIlllll[1];
                    "".length();
                    return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIIIIIlllll[0];
            });
            if (lIIlIlllIIllIll(nearest3)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[65]];
                Movement.walkTo(worldPoint2);
                "".length();
                return;
            } else if (lIIlIlllIIlIllI(nearest3)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[66]];
                nearest3.interact(lIIIIIIIllllI[lIIIIIIIlllll[67]]);
                return;
            }
        }
        if (lIIlIlllIIlIIll(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIIIIIIIlllll[21], lIIIIIIIlllll[22], lIIIIIIIlllll[0]);
            TileObject nearest4 = TileObjects.getNearest(tileObject4 -> {
                if (lIIlIlllIIlIIll(tileObject4.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[85]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject4.getWorldLocation().distanceTo(worldPoint3), lIIIIIIIlllll[7])) {
                    ?? r0 = lIIIIIIIlllll[1];
                    "".length();
                    return "  ".length() < "  ".length() ? ((((29 + 156) - 91) + 121) ^ (((92 + 102) - 84) + 47)) & (((((151 + 184) - 272) + 139) ^ (((116 + 70) - 117) + 59)) ^ (-" ".length())) : r0;
                }
                return lIIIIIIIlllll[0];
            });
            if (lIIlIlllIIllIll(nearest4)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[68]];
                Movement.walkTo(worldPoint3);
                "".length();
                return;
            } else if (lIIlIlllIIlIllI(nearest4)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[69]];
                nearest4.interact(lIIIIIIIllllI[lIIIIIIIlllll[70]]);
                return;
            }
        }
        if (lIIlIlllIIlIIll(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIlllIIlllIl(Inventory.isFull() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIIIlllll[1]];
                strArr[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[71]];
                if (!lIIlIlllIIlIIll(Inventory.contains(strArr) ? 1 : 0) || lIIlIlllIlIIIlI(Inventory.getFreeSlots())) {
                    int[] iArr = new int[lIIIIIIIlllll[1]];
                    iArr[lIIIIIIIlllll[0]] = lIIIIIIIlllll[72];
                    if (lIIlIlllIIlllIl(Inventory.contains(iArr) ? 1 : 0)) {
                        if (lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[73]];
                            Movement.walkTo(al);
                            "".length();
                            return;
                        } else if (lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[74]];
                            String[] strArr2 = new String[lIIIIIIIlllll[1]];
                            strArr2[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[75]];
                            TileObject nearest5 = TileObjects.getNearest(strArr2);
                            if (lIIlIlllIIlIllI(nearest5)) {
                                nearest5.interact(lIIIIIIIlllll[1]);
                                return;
                            }
                        }
                    }
                    int[] iArr2 = new int[lIIIIIIIlllll[1]];
                    iArr2[lIIIIIIIlllll[0]] = lIIIIIIIlllll[72];
                    if (lIIlIlllIIlIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                        if (lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ak), lIIIIIIIlllll[9])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[76]];
                            Movement.walkTo(ak);
                            "".length();
                            return;
                        } else if (lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(ak), lIIIIIIIlllll[9])) {
                            TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                                if (lIIlIlllIIlIIll(tileObject5.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[8]]) ? 1 : 0)) {
                                    String[] strArr3 = new String[lIIIIIIIlllll[1]];
                                    strArr3[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[84]];
                                    if (lIIlIlllIIlIIll(tileObject5.hasAction(strArr3) ? 1 : 0)) {
                                        ?? r0 = lIIIIIIIlllll[1];
                                        "".length();
                                        return 0 != 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                                    }
                                }
                                return lIIIIIIIlllll[0];
                            });
                            if (lIIlIlllIIlIllI(nearest6)) {
                                am = lIIIIIIIlllll[0];
                                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[77]];
                                nearest6.interact(lIIIIIIIllllI[lIIIIIIIlllll[78]]);
                                return;
                            }
                        }
                    }
                }
            }
            if (lIIlIlllIIlIIll(Inventory.isFull() ? 1 : 0)) {
                String[] strArr3 = new String[lIIIIIIIlllll[1]];
                strArr3[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[79]];
                if (lIIlIlllIIlIIll(Inventory.contains(strArr3) ? 1 : 0)) {
                    if (lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                        ao = System.currentTimeMillis() + l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[80]];
                        Movement.walkTo(al);
                        "".length();
                    } else if (lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                        SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[81]];
                        if (lIIlIlllIlIIIII(lIIlIlllIlIIIIl(System.currentTimeMillis(), ao))) {
                            am = lIIIIIIIlllll[0];
                            ao = System.currentTimeMillis() + l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                        }
                        String[] strArr4 = new String[lIIIIIIIlllll[1]];
                        strArr4[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[82]];
                        TileObject nearest7 = TileObjects.getNearest(strArr4);
                        if (lIIlIlllIIlIllI(nearest7) && lIIlIlllIIllIlI(am, lIIIIIIIlllll[3])) {
                            nearest7.interact(lIIIIIIIllllI[lIIIIIIIlllll[83]]);
                            am += lIIIIIIIlllll[1];
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean j() {
        if (lIIlIlllIIlllIl(ap.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlllIIlllIl(aq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlllIIlllIl(Q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIlIlllIIlIIll(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIlllll[0];
        }
        ?? r0 = lIIIIIIIlllll[1];
        "".length();
        return 0 != 0 ? ((203 ^ 167) ^ (65 ^ 124)) & (((72 ^ 118) ^ (124 ^ 19)) ^ (-" ".length())) : r0;
    }

    private static boolean lIIlIlllIlIIIII(int i) {
        return i >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        an = this.aj.makeXPotions();
        if (!lIIlIlllIIlIIll(j() ? 1 : 0) && !lIIlIlllIIlIIll(h.d() ? 1 : 0)) {
            f();
            return lIIIIIIIlllll[0];
        }
        return lIIIIIIIlllll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x02ec, code lost:
        if (lIIlIlllIIlllIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x043e, code lost:
        if (lIIlIlllIIllIlI(net.unethicalite.api.items.Inventory.getCount(r0), q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o.k.lIIIIIIIlllll[2]) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x056d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h() {
        String[] strArr;
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIlIlllIIlIIll(tileObject.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[92]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlllll[5])) {
                ?? r0 = lIIIIIIIlllll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((false ^ true) ^ true) : r0;
            }
            return lIIIIIIIlllll[0];
        });
        if (lIIlIlllIIlIllI(nearest) && lIIlIlllIIllIlI(Movement.getRunEnergy(), lIIIIIIIlllll[8])) {
            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[9]];
            nearest.interact(lIIIIIIIllllI[lIIIIIIIlllll[10]]);
            return;
        }
        if (lIIlIlllIIlIIll(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint = new WorldPoint(lIIIIIIIlllll[11], lIIIIIIIlllll[12], lIIIIIIIlllll[1]);
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (lIIlIlllIIlIIll(tileObject2.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[91]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject2.getWorldLocation().distanceTo(worldPoint), lIIIIIIIlllll[5])) {
                    ?? r0 = lIIIIIIIlllll[1];
                    "".length();
                    return (-(73 ^ 76)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIIIIIlllll[0];
            });
            if (lIIlIlllIIllIll(nearest2)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[13]];
                Movement.walkTo(worldPoint);
                "".length();
                return;
            } else if (lIIlIlllIIlIllI(nearest2)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[14]];
                nearest2.interact(lIIIIIIIllllI[lIIIIIIIlllll[15]]);
                return;
            }
        }
        if (lIIlIlllIIlIIll(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint2 = new WorldPoint(lIIIIIIIlllll[16], lIIIIIIIlllll[17], lIIIIIIIlllll[0]);
            TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
                if (lIIlIlllIIlIIll(tileObject3.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[90]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject3.getWorldLocation().distanceTo(worldPoint2), lIIIIIIIlllll[5])) {
                    ?? r0 = lIIIIIIIlllll[1];
                    "".length();
                    return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIIIIIlllll[0];
            });
            if (lIIlIlllIIllIll(nearest3)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[18]];
                Movement.walkTo(worldPoint2);
                "".length();
                return;
            } else if (lIIlIlllIIlIllI(nearest3)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[19]];
                nearest3.interact(lIIIIIIIllllI[lIIIIIIIlllll[20]]);
                return;
            }
        }
        if (lIIlIlllIIlIIll(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIIIIIIIlllll[21], lIIIIIIIlllll[22], lIIIIIIIlllll[0]);
            TileObject nearest4 = TileObjects.getNearest(tileObject4 -> {
                if (lIIlIlllIIlIIll(tileObject4.getName().contains(lIIIIIIIllllI[lIIIIIIIlllll[89]]) ? 1 : 0) && lIIlIlllIIlllll(tileObject4.getWorldLocation().distanceTo(worldPoint3), lIIIIIIIlllll[7])) {
                    ?? r0 = lIIIIIIIlllll[1];
                    "".length();
                    return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIIIIIlllll[0];
            });
            if (lIIlIlllIIllIll(nearest4)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[23]];
                Movement.walkTo(worldPoint3);
                "".length();
                return;
            } else if (lIIlIlllIIlIllI(nearest4)) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[24]];
                nearest4.interact(lIIIIIIIllllI[lIIIIIIIlllll[25]]);
                return;
            }
        }
        if (lIIlIlllIIlIIll(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIlllIIllIlI(Inventory.getFreeSlots(), lIIIIIIIlllll[6])) {
                String[] strArr2 = new String[lIIIIIIIlllll[1]];
                strArr2[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[26]];
                if (lIIlIlllIIlIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIIIIIIlllll[1]];
                    strArr3[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[27]];
                    Inventory.getFirst(strArr3).interact(lIIIIIIIllllI[lIIIIIIIlllll[28]]);
                    return;
                }
                String[] strArr4 = new String[lIIIIIIIlllll[1]];
                strArr4[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[29]];
                if (lIIlIlllIIlIIll(Inventory.contains(strArr4) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIIIIIIlllll[1]];
                    strArr5[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[30]];
                    Inventory.getFirst(strArr5).interact(lIIIIIIIllllI[lIIIIIIIlllll[31]]);
                    return;
                }
                String[] strArr6 = new String[lIIIIIIIlllll[1]];
                strArr6[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[32]];
                if (lIIlIlllIIlIIll(Inventory.contains(strArr6) ? 1 : 0)) {
                    String[] strArr7 = new String[lIIIIIIIlllll[1]];
                    strArr7[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[33]];
                    Inventory.getFirst(strArr7).interact(lIIIIIIIllllI[lIIIIIIIlllll[34]]);
                    return;
                }
            }
            int[] iArr = new int[lIIIIIIIlllll[1]];
            iArr[lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
            if (lIIlIlllIIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIIIIlllll[1]];
                iArr2[lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
            }
            if (lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[37]];
                Movement.walkTo(al);
                "".length();
                return;
            }
            if (lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(al), lIIIIIIIlllll[9])) {
                SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[38]];
                String[] strArr8 = new String[lIIIIIIIlllll[1]];
                strArr8[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[39]];
                TileObject nearest5 = TileObjects.getNearest(strArr8);
                if (lIIlIlllIIlIllI(nearest5)) {
                    nearest5.interact(lIIIIIIIlllll[3]);
                    return;
                }
            }
            int[] iArr3 = new int[lIIIIIIIlllll[1]];
            iArr3[lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
            if (lIIlIlllIIlIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIIIIIIlllll[1]];
                iArr4[lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                if (lIIlIlllIIlIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                    String[] strArr9 = new String[lIIIIIIIlllll[1]];
                    strArr9[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[40]];
                    if (lIIlIlllIIlllIl(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lIIIIIIIlllll[1]];
                        strArr10[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[41]];
                        if (lIIlIlllIIlIIll(Inventory.contains(strArr10) ? 1 : 0)) {
                            String[] strArr11 = new String[lIIIIIIIlllll[1]];
                            strArr11[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[42]];
                            if (lIIlIlllIIlIIll(Inventory.contains(strArr11) ? 1 : 0)) {
                                String[] strArr12 = new String[lIIIIIIIlllll[1]];
                                strArr12[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[43]];
                            }
                            strArr = new String[lIIIIIIIlllll[1]];
                            strArr[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[52]];
                            if (lIIlIlllIIlIIll(Inventory.contains(strArr) ? 1 : 0)) {
                                String[] strArr13 = new String[lIIIIIIIlllll[1]];
                                strArr13[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[53]];
                                if (lIIlIlllIIlIlll(Inventory.getCount(strArr13), lIIIIIIIlllll[2])) {
                                    SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[54]];
                                    int[] iArr5 = new int[lIIIIIIIlllll[1]];
                                    iArr5[lIIIIIIIlllll[0]] = lIIIIIIIlllll[35];
                                    Item first = Inventory.getFirst(iArr5);
                                    String[] strArr14 = new String[lIIIIIIIlllll[1]];
                                    strArr14[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[55]];
                                    first.useOn(Inventory.getFirst(strArr14));
                                    return;
                                }
                            }
                        }
                        WorldPoint worldPoint4 = new WorldPoint(lIIIIIIIlllll[44], lIIIIIIIlllll[45], lIIIIIIIlllll[0]);
                        if (lIIlIlllIIllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIIIIIIIlllll[13])) {
                            am = lIIIIIIIlllll[0];
                            ao = System.currentTimeMillis() + l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[48]];
                            Movement.walkTo(worldPoint4);
                            "".length();
                            return;
                        }
                        if (lIIlIlllIIlllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIIIIIIIlllll[13])) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[49]];
                            if (lIIlIlllIlIIIII(lIIlIlllIIllIIl(System.currentTimeMillis(), ao))) {
                                am = lIIIIIIIlllll[0];
                                ao = System.currentTimeMillis() + l.a(lIIIIIIIlllll[46], lIIIIIIIlllll[47]);
                            }
                            String[] strArr15 = new String[lIIIIIIIlllll[1]];
                            strArr15[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[50]];
                            TileObject nearest6 = TileObjects.getNearest(strArr15);
                            if (lIIlIlllIIlIllI(nearest6) && lIIlIlllIIllIlI(am, lIIIIIIIlllll[3])) {
                                nearest6.interact(lIIIIIIIllllI[lIIIIIIIlllll[51]]);
                                am += lIIIIIIIlllll[1];
                                return;
                            }
                        }
                        strArr = new String[lIIIIIIIlllll[1]];
                        strArr[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[52]];
                        if (lIIlIlllIIlIIll(Inventory.contains(strArr) ? 1 : 0)) {
                        }
                    }
                    String[] strArr16 = new String[lIIIIIIIlllll[1]];
                    strArr16[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[56]];
                    if (lIIlIlllIIlIIll(Inventory.contains(strArr16) ? 1 : 0)) {
                        String[] strArr17 = new String[lIIIIIIIlllll[1]];
                        strArr17[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[57]];
                        if (lIIlIlllIIlllIl(Inventory.contains(strArr17) ? 1 : 0)) {
                            SquireMoonsOfPeril.g = lIIIIIIIllllI[lIIIIIIIlllll[58]];
                            int[] iArr6 = new int[lIIIIIIIlllll[1]];
                            iArr6[lIIIIIIIlllll[0]] = lIIIIIIIlllll[36];
                            Item first2 = Inventory.getFirst(iArr6);
                            String[] strArr18 = new String[lIIIIIIIlllll[1]];
                            strArr18[lIIIIIIIlllll[0]] = lIIIIIIIllllI[lIIIIIIIlllll[59]];
                            first2.useOn(Inventory.getFirst(strArr18));
                        }
                    }
                }
            }
        }
    }

    @Inject
    public k(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.aj = squireMoonsOfPerilConfig;
    }
}
