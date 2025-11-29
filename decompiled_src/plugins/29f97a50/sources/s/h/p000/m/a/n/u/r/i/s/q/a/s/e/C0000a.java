package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
@Singleton
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/a.class */
public class C0000a {
    public static final /* synthetic */ List<String> q;
    private static final /* synthetic */ List<String> t;
    private static /* synthetic */ int[] lIIllIIIllIlI;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ HashMap<String, Integer> f0s;
    private /* synthetic */ boolean u;
    private final /* synthetic */ SquireShamanConfig w;
    private static /* synthetic */ String[] lIIllIIIlIlII;
    private final /* synthetic */ c v;
    public static final /* synthetic */ List<String> r;

    private static boolean lIlIllllIlIIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean a(Item item, TileItem tileItem) {
        if (lIlIllllIlIIIll(f0s.get(item.getName()).intValue() * item.getQuantity(), f0s.get(tileItem.getName()).intValue() * tileItem.getQuantity())) {
            ?? r0 = lIIllIIIllIlI[0];
            "".length();
            return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIIIllIlI[1];
    }

    private static boolean lIlIllllIlIIlII(int i) {
        return i == 0;
    }

    private static String lIlIllllIIIlIlI(String llllllllllllllIllllIIIllIIIllllI, String llllllllllllllIllllIIIllIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIllIIIllIll.getBytes(StandardCharsets.UTF_8)), lIIllIIIllIlI[9]), "DES");
            Cipher llllllllllllllIllllIIIllIIlIIIII = Cipher.getInstance("DES");
            llllllllllllllIllllIIIllIIlIIIII.init(lIIllIIIllIlI[3], secretKeySpec);
            return new String(llllllllllllllIllllIIIllIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIllIIIlllll) {
            llllllllllllllIllllIIIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIlIllllIIIlIIl(String llllllllllllllIllllIIIllIIllIIll, String llllllllllllllIllllIIIllIIlIllIl) {
        String llllllllllllllIllllIIIllIIllIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIllIIlIllIl.toCharArray();
        int llllllllllllllIllllIIIllIIlIllll = lIIllIIIllIlI[1];
        char[] charArray2 = llllllllllllllIllllIIIllIIllIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIllIlI[1];
        while (lIlIllllIlIIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIIIllIIlIllll % charArray.length]));
            "".length();
            llllllllllllllIllllIIIllIIlIllll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIllllIlIIIlI() {
        lIIllIIIllIlI = new int[156];
        lIIllIIIllIlI[0] = " ".length();
        lIIllIIIllIlI[1] = ((((67 + 139) - 77) + 25) ^ (((44 + 58) - 13) + 57)) & (((93 ^ 62) ^ (96 ^ 11)) ^ (-" ".length()));
        lIIllIIIllIlI[2] = (((38 + 40) - 47) + 134) ^ (((167 + 90) - 200) + 111);
        lIIllIIIllIlI[3] = "  ".length();
        lIIllIIIllIlI[4] = "   ".length();
        lIIllIIIllIlI[5] = (((160 + 71) - 214) + 172) ^ (((91 + 36) - 95) + 153);
        lIIllIIIllIlI[6] = (48 ^ 8) ^ (126 ^ 67);
        lIIllIIIllIlI[7] = 135 ^ 129;
        lIIllIIIllIlI[8] = 124 ^ 123;
        lIIllIIIllIlI[9] = 162 ^ 170;
        lIIllIIIllIlI[10] = 63 ^ 54;
        lIIllIIIllIlI[11] = 111 ^ 101;
        lIIllIIIllIlI[12] = (((99 + 121) - 188) + 144) ^ (((113 + 82) - 127) + 119);
        lIIllIIIllIlI[13] = 50 ^ 62;
        lIIllIIIllIlI[14] = (168 ^ 184) ^ (32 ^ 62);
        lIIllIIIllIlI[15] = (((95 ^ 120) + (87 ^ 13)) - (67 ^ 70)) + (0 ^ 13);
        lIIllIIIllIlI[16] = 109 ^ 98;
        lIIllIIIllIlI[17] = 153 ^ 137;
        lIIllIIIllIlI[18] = 28 ^ 13;
        lIIllIIIllIlI[19] = 188 ^ 174;
        lIIllIIIllIlI[20] = (101 ^ 121) ^ (40 ^ 39);
        lIIllIIIllIlI[21] = 114 ^ 102;
        lIIllIIIllIlI[22] = (248 ^ 130) ^ (41 ^ 70);
        lIIllIIIllIlI[23] = 104 ^ 126;
        lIIllIIIllIlI[24] = 3 ^ 20;
        lIIllIIIllIlI[25] = (102 ^ 33) ^ (72 ^ 23);
        lIIllIIIllIlI[26] = (116 ^ 92) ^ (122 ^ 75);
        lIIllIIIllIlI[27] = (134 ^ 188) ^ (27 ^ 59);
        lIIllIIIllIlI[28] = (71 ^ 115) ^ (53 ^ 26);
        lIIllIIIllIlI[29] = (146 ^ 195) ^ (210 ^ 159);
        lIIllIIIllIlI[30] = (((93 + 122) - 85) + 42) ^ (((59 + 58) - 61) + 121);
        lIIllIIIllIlI[31] = (65 ^ 79) ^ (62 ^ 46);
        lIIllIIIllIlI[32] = 110 ^ 113;
        lIIllIIIllIlI[33] = 45 ^ 13;
        lIIllIIIllIlI[34] = ((219 ^ 139) & ((247 ^ 167) ^ (-1))) ^ (176 ^ 145);
        lIIllIIIllIlI[35] = "   ".length() ^ (50 ^ 19);
        lIIllIIIllIlI[36] = (((111 + 121) - 86) + 26) ^ (((133 + 56) - 165) + 119);
        lIIllIIIllIlI[37] = (((6 + 40) - (-8)) + 132) ^ (((107 + 122) - 110) + 39);
        lIIllIIIllIlI[38] = (((85 + 123) - 136) + 84) ^ (((125 + 16) - (-24)) + 20);
        lIIllIIIllIlI[39] = (233 ^ 136) ^ (13 ^ 74);
        lIIllIIIllIlI[40] = (((13 + 54) - (-94)) + 20) ^ (((125 + 91) - 208) + 138);
        lIIllIIIllIlI[41] = 109 ^ 69;
        lIIllIIIllIlI[42] = 178 ^ 155;
        lIIllIIIllIlI[43] = 166 ^ 140;
        lIIllIIIllIlI[44] = (216 ^ 150) ^ (108 ^ 9);
        lIIllIIIllIlI[45] = 234 ^ 198;
        lIIllIIIllIlI[46] = 108 ^ 65;
        lIIllIIIllIlI[47] = (241 ^ 183) ^ (211 ^ 187);
        lIIllIIIllIlI[48] = 158 ^ 177;
        lIIllIIIllIlI[49] = (((39 + 95) - 128) + 167) ^ (((96 + 10) - 12) + 63);
        lIIllIIIllIlI[50] = 49 ^ 0;
        lIIllIIIllIlI[51] = (((43 + 83) - 14) + 26) ^ (((136 + 78) - 154) + 124);
        lIIllIIIllIlI[52] = 79 ^ 124;
        lIIllIIIllIlI[53] = (((139 + 18) - 131) + 129) ^ (((144 + 164) - 252) + 119);
        lIIllIIIllIlI[54] = (((68 + 54) - (-1)) + 41) ^ (((58 + 59) - (-1)) + 27);
        lIIllIIIllIlI[55] = (((86 + 179) - 239) + 215) ^ (((18 + 107) - 82) + 156);
        lIIllIIIllIlI[56] = 133 ^ 178;
        lIIllIIIllIlI[57] = (115 ^ 117) ^ (62 ^ 0);
        lIIllIIIllIlI[58] = (((94 + 20) - (-11)) + 10) ^ (((71 + 102) - 72) + 89);
        lIIllIIIllIlI[59] = (78 ^ 9) ^ (228 ^ 153);
        lIIllIIIllIlI[60] = 51 ^ 8;
        lIIllIIIllIlI[61] = 44 ^ 16;
        lIIllIIIllIlI[62] = (170 ^ 185) ^ (55 ^ 25);
        lIIllIIIllIlI[63] = 163 ^ 157;
        lIIllIIIllIlI[64] = (((66 + 126) - 51) + 31) ^ (((67 + 25) - (-25)) + 30);
        lIIllIIIllIlI[65] = 31 ^ 95;
        lIIllIIIllIlI[66] = 94 ^ 31;
        lIIllIIIllIlI[67] = 39 ^ 101;
        lIIllIIIllIlI[68] = (77 ^ 99) ^ (77 ^ 32);
        lIIllIIIllIlI[69] = (65 ^ 36) ^ (168 ^ 137);
        lIIllIIIllIlI[70] = (27 ^ 19) ^ (249 ^ 180);
        lIIllIIIllIlI[71] = 2 ^ 68;
        lIIllIIIllIlI[72] = (((203 + 169) - 230) + 110) ^ (((124 + 90) - 103) + 76);
        lIIllIIIllIlI[73] = (83 ^ 120) ^ (49 ^ 82);
        lIIllIIIllIlI[74] = (150 ^ 141) ^ (64 ^ 18);
        lIIllIIIllIlI[75] = 30 ^ 84;
        lIIllIIIllIlI[76] = 116 ^ 63;
        lIIllIIIllIlI[77] = (203 ^ 182) ^ (153 ^ 168);
        lIIllIIIllIlI[78] = (114 ^ 116) ^ (213 ^ 158);
        lIIllIIIllIlI[79] = 78 ^ 0;
        lIIllIIIllIlI[80] = (22 ^ 116) ^ (173 ^ 128);
        lIIllIIIllIlI[81] = (19 ^ 32) ^ (93 ^ 62);
        lIIllIIIllIlI[82] = 144 ^ 193;
        lIIllIIIllIlI[83] = (2 ^ 84) ^ (43 ^ 47);
        lIIllIIIllIlI[84] = (19 ^ 23) ^ (4 ^ 83);
        lIIllIIIllIlI[85] = 93 ^ 9;
        lIIllIIIllIlI[86] = 92 ^ 9;
        lIIllIIIllIlI[87] = 195 ^ 149;
        lIIllIIIllIlI[88] = 192 ^ 151;
        lIIllIIIllIlI[89] = (((55 + 97) - 15) + 76) ^ (((122 + 56) - 119) + 82);
        lIIllIIIllIlI[90] = (((39 + 168) - 140) + 132) ^ (((1 + 112) - 32) + 77);
        lIIllIIIllIlI[91] = 236 ^ 182;
        lIIllIIIllIlI[92] = (((145 + 51) - 177) + 139) ^ (((185 + 119) - 167) + 60);
        lIIllIIIllIlI[93] = 194 ^ 158;
        lIIllIIIllIlI[94] = (75 ^ 113) ^ (206 ^ 169);
        lIIllIIIllIlI[95] = (52 ^ 115) ^ (76 ^ 85);
        lIIllIIIllIlI[96] = 18 ^ 77;
        lIIllIIIllIlI[97] = 55 ^ 87;
        lIIllIIIllIlI[98] = (60 ^ 50) ^ (57 ^ 86);
        lIIllIIIllIlI[99] = " ".length() ^ (219 ^ 184);
        lIIllIIIllIlI[100] = (67 ^ 109) ^ (203 ^ 134);
        lIIllIIIllIlI[101] = (95 ^ 36) ^ (137 ^ 150);
        lIIllIIIllIlI[102] = 77 ^ 40;
        lIIllIIIllIlI[103] = (241 ^ 194) ^ (22 ^ 67);
        lIIllIIIllIlI[104] = 54 ^ 81;
        lIIllIIIllIlI[105] = (((165 + 119) - 96) + 42) ^ (((109 + 30) - 77) + 80);
        lIIllIIIllIlI[106] = (80 ^ 104) ^ (64 ^ 17);
        lIIllIIIllIlI[107] = (98 ^ 94) ^ (194 ^ 148);
        lIIllIIIllIlI[108] = 246 ^ 157;
        lIIllIIIllIlI[109] = (179 ^ 193) ^ (69 ^ 91);
        lIIllIIIllIlI[110] = 126 ^ 19;
        lIIllIIIllIlI[111] = 89 ^ 55;
        lIIllIIIllIlI[112] = ((16 ^ 81) & ((52 ^ 117) ^ (-1))) ^ (41 ^ 70);
        lIIllIIIllIlI[113] = 37 ^ 85;
        lIIllIIIllIlI[114] = (68 ^ 107) ^ (153 ^ 199);
        lIIllIIIllIlI[115] = 64 ^ 50;
        lIIllIIIllIlI[116] = (4 ^ 117) ^ "  ".length();
        lIIllIIIllIlI[117] = 177 ^ 197;
        lIIllIIIllIlI[118] = (((43 + 23) - (-90)) + 24) ^ (((57 + 25) - 72) + 183);
        lIIllIIIllIlI[119] = (115 ^ 35) ^ (13 ^ 43);
        lIIllIIIllIlI[120] = (((120 + 207) - 197) + 78) ^ (((0 + 53) - (-47)) + 67);
        lIIllIIIllIlI[121] = 189 ^ 197;
        lIIllIIIllIlI[122] = 204 ^ 181;
        lIIllIIIllIlI[123] = 73 ^ 51;
        lIIllIIIllIlI[124] = 85 ^ 46;
        lIIllIIIllIlI[125] = (((34 + 170) - 130) + 140) ^ (((58 + 150) - 87) + 49);
        lIIllIIIllIlI[126] = 115 ^ 14;
        lIIllIIIllIlI[127] = 107 ^ 21;
        lIIllIIIllIlI[128] = ((10 + 27) - (-16)) + 74;
        lIIllIIIllIlI[129] = ((78 + 125) - 202) + 127;
        lIIllIIIllIlI[130] = ((87 + 36) - 83) + 89;
        lIIllIIIllIlI[131] = (((45 ^ 41) + (((65 + 31) - 8) + 40)) - (80 ^ 92)) + (32 ^ 42);
        lIIllIIIllIlI[132] = (((((15 + 91) - 74) + 95) + (2 ^ 16)) - (183 ^ 154)) + (93 ^ 66);
        lIIllIIIllIlI[133] = ((69 + 116) - 155) + 102;
        lIIllIIIllIlI[134] = (((84 ^ 26) + (14 ^ 74)) - (76 ^ 9)) + (126 ^ 70);
        lIIllIIIllIlI[135] = (((35 ^ 109) + (69 ^ 100)) - (254 ^ 161)) + (55 ^ 65);
        lIIllIIIllIlI[136] = (("   ".length() + (93 ^ 116)) - (-(88 ^ 28))) + (152 ^ 143);
        lIIllIIIllIlI[137] = ((18 + 91) - (-5)) + 22;
        lIIllIIIllIlI[138] = (((61 ^ 53) + (0 ^ 97)) - (-(167 ^ 191))) + (14 ^ 7);
        lIIllIIIllIlI[139] = (((139 ^ 145) + (226 ^ 178)) - (76 ^ 3)) + (43 ^ 91);
        lIIllIIIllIlI[140] = (((15 ^ 95) + (12 ^ 38)) - (124 ^ 22)) + (222 ^ 162);
        lIIllIIIllIlI[141] = ((20 + 27) - (-80)) + 14;
        lIIllIIIllIlI[142] = ((63 + 94) - 115) + 100;
        lIIllIIIllIlI[143] = (((211 ^ 139) + (141 ^ 183)) - (106 ^ 122)) + (13 ^ 0);
        lIIllIIIllIlI[144] = ((17 + 4) - (-26)) + 97;
        lIIllIIIllIlI[145] = ((140 + 44) - 100) + 61;
        lIIllIIIllIlI[146] = ((53 + 87) - 128) + 134;
        lIIllIIIllIlI[147] = (((42 ^ 123) + (38 ^ 13)) - (203 ^ 177)) + ((17 + 128) - 133) + 133;
        lIIllIIIllIlI[148] = ((40 + 145) - 127) + 90;
        lIIllIIIllIlI[149] = ((127 + 4) - 33) + 51;
        lIIllIIIllIlI[150] = ((40 + 103) - 34) + 41;
        lIIllIIIllIlI[151] = ((102 + 74) - 63) + 38;
        lIIllIIIllIlI[152] = (((23 ^ 3) + (7 ^ 55)) - (83 ^ 113)) + (49 ^ 71);
        lIIllIIIllIlI[153] = (((64 ^ 17) + (62 ^ 107)) - (12 ^ 107)) + (116 ^ 46);
        lIIllIIIllIlI[154] = ((122 + 150) - 206) + 88;
        lIIllIIIllIlI[155] = (((127 ^ 42) + (55 ^ 125)) - (((21 + 56) - (-11)) + 58)) + ((9 + 85) - 41) + 89;
    }

    private static void lIlIllllIlIIIIl() {
        lIIllIIIlIlII = new String[lIIllIIIllIlI[155]];
        lIIllIIIlIlII[lIIllIIIllIlI[1]] = lIlIllllIIIIlIl("lXSatHFoa4k=", "oAQSv");
        lIIllIIIlIlII[lIIllIIIllIlI[0]] = lIlIllllIIIlIIl("AjkwJwAqPSsoUj04KysTIA==", "NPJFr");
        lIIllIIIlIlII[lIIllIIIllIlI[3]] = lIlIllllIIIlIIl("FBs4IEo2AjcxDyQBMjw=", "FnVEj");
        lIIllIIIlIlII[lIIllIIIllIlI[4]] = lIlIllllIIIIlIl("eYU1sJOajqymAK62EWyuPw==", "xtzEM");
        lIIllIIIlIlII[lIIllIIIllIlI[5]] = lIlIllllIIIIlIl("zur71kKH1UV0VtHb34rfXw==", "MxcpS");
        lIIllIIIlIlII[lIIllIIIllIlI[6]] = lIlIllllIIIlIIl("JxAoKmUFDCUkJA0A", "ueFOE");
        lIIllIIIlIlII[lIIllIIIllIlI[7]] = lIlIllllIIIlIIl("FBshDHgtBzsMKy4HKgU8", "FnOiX");
        lIIllIIIlIlII[lIIllIIIllIlI[8]] = lIlIllllIIIlIlI("Q/NkxFTek0i3BSyPNG3/mQ==", "UHbTY");
        lIIllIIIlIlII[lIIllIIIllIlI[9]] = lIlIllllIIIIlIl("cvRMwEeVwp0mN/88vwkrSH3ZnDQJJ5KD", "oLRCO");
        lIIllIIIlIlII[lIIllIIIllIlI[10]] = lIlIllllIIIlIIl("AjQlKmQzKSomKjIuLzY=", "PAKOD");
        lIIllIIIlIlII[lIIllIIIllIlI[11]] = lIlIllllIIIlIlI("jm8pQMhDOr4T+yGMgpoL1A==", "whfsS");
        lIIllIIIlIlII[lIIllIIIllIlI[12]] = lIlIllllIIIIlIl("yiIl2aWc782EYtM8IM8clbagAI8Katon", "bWkak");
        lIIllIIIlIlII[lIIllIIIllIlI[13]] = lIlIllllIIIlIlI("HTVI0fcHYG8cXYtWBCj2HQ==", "AbEvH");
        lIIllIIIlIlII[lIIllIIIllIlI[2]] = lIlIllllIIIIlIl("JubkPNSf5EgiKBQRppOPEQ==", "SdTgj");
        lIIllIIIlIlII[lIIllIIIllIlI[14]] = lIlIllllIIIIlIl("/U5JeWEwQe6dsg1wI87GKg==", "sXkdV");
        lIIllIIIlIlII[lIIllIIIllIlI[16]] = lIlIllllIIIlIIl("ICY+ORYWOzkxRQkxLg==", "bTWTe");
        lIIllIIIlIlII[lIIllIIIllIlI[17]] = lIlIllllIIIIlIl("NR3Kkn4+Oe35HZIRZLaGRg==", "xLinB");
        lIIllIIIlIlII[lIIllIIIllIlI[18]] = lIlIllllIIIlIlI("F6BPGtrevhMLXInpr2DU914tkf76LvoE", "ZFQlx");
        lIIllIIIlIlII[lIIllIIIllIlI[19]] = lIlIllllIIIlIlI("k2POBUP0e7NXdfxRWPnu2UuRP3O4eTib", "XoXcD");
        lIIllIIIlIlII[lIIllIIIllIlI[20]] = lIlIllllIIIlIlI("MsliPvVet5epekQC8lln1g==", "tnahj");
        lIIllIIIlIlII[lIIllIIIllIlI[21]] = lIlIllllIIIlIIl("EBccHXAhChMRPiANFgE=", "BbrxP");
        lIIllIIIlIlII[lIIllIIIllIlI[22]] = lIlIllllIIIlIIl("PTQFAnYYIBkPNwIsDhU=", "oAkgV");
        lIIllIIIlIlII[lIIllIIIllIlI[23]] = lIlIllllIIIlIlI("pgImR4MvvlHpth2C7blX3dY7d9fXtqQC", "vypNo");
        lIIllIIIlIlII[lIIllIIIllIlI[24]] = lIlIllllIIIlIlI("bXobOHA5J5+a5S+mqjCzjQ==", "NdqDj");
        lIIllIIIlIlII[lIIllIIIllIlI[25]] = lIlIllllIIIIlIl("scNLf8DNi8Q=", "cYgqQ");
        lIIllIIIlIlII[lIIllIIIllIlI[26]] = lIlIllllIIIlIlI("B9r6JZVrs0R1w5JnMnZrPw==", "okATC");
        lIIllIIIlIlII[lIIllIIIllIlI[27]] = lIlIllllIIIIlIl("QJ75hudDxovWfbsFFQ2igw==", "yVJwg");
        lIIllIIIlIlII[lIIllIIIllIlI[28]] = lIlIllllIIIlIIl("AgAuLzNlFjAjOCNSMCcvIQ==", "ErGBJ");
        lIIllIIIlIlII[lIIllIIIllIlI[29]] = lIlIllllIIIlIIl("Mj8lCDZVIS0LOxQpNQgq", "uMLeO");
        lIIllIIIlIlII[lIIllIIIllIlI[30]] = lIlIllllIIIIlIl("BHdnJanu+RwKpu2462yY6Q==", "DitiU");
        lIIllIIIlIlII[lIIllIIIllIlI[31]] = lIlIllllIIIlIIl("JC8sDAAEbjEIFxI=", "vNBmr");
        lIIllIIIlIlII[lIIllIIIllIlI[32]] = lIlIllllIIIlIlI("/jLJQNkOaCZxWp2AF7GGew==", "zEXkk");
        lIIllIIIlIlII[lIIllIIIllIlI[33]] = lIlIllllIIIIlIl("SQPKz3r5T6jkUdJhDz51VQ==", "CySGN");
        lIIllIIIlIlII[lIIllIIIllIlI[34]] = lIlIllllIIIIlIl("Mymirf3y8LpTGhnNSbHHYQ==", "MoWey");
        lIIllIIIlIlII[lIIllIIIllIlI[35]] = lIlIllllIIIlIIl("LCgART4QKBM=", "uMweM");
        lIIllIIIlIlII[lIIllIIIllIlI[36]] = lIlIllllIIIlIlI("D0wUeLae2phaEtsjwvDjVw==", "cTNGc");
        lIIllIIIlIlII[lIIllIIIllIlI[37]] = lIlIllllIIIIlIl("qXqum84KADL5C9rihaUubQ==", "mVRwZ");
        lIIllIIIlIlII[lIIllIIIllIlI[38]] = lIlIllllIIIlIIl("JSgWNG4IKQM4bh4vHz8=", "jFoLN");
        lIIllIIIlIlII[lIIllIIIllIlI[39]] = lIlIllllIIIlIIl("HSgFCylwJQ0FOQ==", "PIbbJ");
        lIIllIIIlIlII[lIIllIIIllIlI[40]] = lIlIllllIIIIlIl("YGDDBCyWFLXo1fYkieZyCMUR99RPmVQV", "fggwP");
        lIIllIIIlIlII[lIIllIIIllIlI[41]] = lIlIllllIIIIlIl("qIf+CSLkcBLXoKQyxPRjabCmkYYYjTnX", "gyUpG");
        lIIllIIIlIlII[lIIllIIIllIlI[42]] = lIlIllllIIIlIlI("P5ybBUz7YcD5pUmHJSEchg==", "nGyei");
        lIIllIIIlIlII[lIIllIIIllIlI[43]] = lIlIllllIIIlIlI("kBxSChocWB36dOf4kdTHcQ==", "MTiWD");
        lIIllIIIlIlII[lIIllIIIllIlI[44]] = lIlIllllIIIlIIl("JAsKJj1RFxwxMA==", "qeiSI");
        lIIllIIIlIlII[lIIllIIIllIlI[45]] = lIlIllllIIIlIIl("EjwBLTlnNgs5ICg8Bg==", "GRbXM");
        lIIllIIIlIlII[lIIllIIIllIlI[46]] = lIlIllllIIIIlIl("TGhxXkBw5Tn0tO6X9ikykw==", "hOPpz");
        lIIllIIIlIlII[lIIllIIIllIlI[47]] = lIlIllllIIIIlIl("k/8VpjfSJsHNpA6p9FDkrq81/M9J68Wp", "elgVo");
        lIIllIIIlIlII[lIIllIIIllIlI[48]] = lIlIllllIIIlIlI("UQhMqqLC5aXVDGfm5J/KUpNP8TR5e2xw", "Dysjk");
        lIIllIIIlIlII[lIIllIIIllIlI[49]] = lIlIllllIIIlIIl("LSsjGQcHJmIWBwU2MVRADGs=", "iBBth");
        lIIllIIIlIlII[lIIllIIIllIlI[50]] = lIlIllllIIIIlIl("crAjnUlimzwhhAfpvr59vg==", "IRRul");
        lIIllIIIlIlII[lIIllIIIllIlI[51]] = lIlIllllIIIIlIl("8020iZmiV0rZUtGC4vRswQ==", "yGkkJ");
        lIIllIIIlIlII[lIIllIIIllIlI[52]] = lIlIllllIIIlIlI("nXPUNVhfQTe8NNJt5ERxEw==", "REyPQ");
        lIIllIIIlIlII[lIIllIIIllIlI[53]] = lIlIllllIIIlIlI("m9CEoctbiM9njSQYybZjOA==", "aJtql");
        lIIllIIIlIlII[lIIllIIIllIlI[54]] = lIlIllllIIIlIIl("OA0VWjQBAgc=", "tlbzF");
        lIIllIIIlIlII[lIIllIIIllIlI[55]] = lIlIllllIIIlIIl("KyInNlRLP2kgAxYlLQ==", "yWISt");
        lIIllIIIlIlII[lIIllIIIllIlI[56]] = lIlIllllIIIlIIl("Ny8BBipVMRsHKw==", "uCniN");
        lIIllIIIlIlII[lIIllIIIllIlI[57]] = lIlIllllIIIlIlI("mo4t3VyKgsDGU+Fr9nO95g==", "xrScZ");
        lIIllIIIlIlII[lIIllIIIllIlI[58]] = lIlIllllIIIIlIl("DU5ApYq+pDeSfvdtj63u8w==", "TvAFo");
        lIIllIIIlIlII[lIIllIIIllIlI[59]] = lIlIllllIIIlIlI("asaPeXMb2GVpjjXzFhCd7A==", "eNYJF");
        lIIllIIIlIlII[lIIllIIIllIlI[60]] = lIlIllllIIIlIIl("OiccChg=", "yHudk");
        lIIllIIIlIlII[lIIllIIIllIlI[61]] = lIlIllllIIIlIlI("Q4A1q2rzY6fK4CTNIpnsQQ==", "NxLcv");
        lIIllIIIlIlII[lIIllIIIllIlI[62]] = lIlIllllIIIlIIl("MxYgN2cRCi05JhkG", "acNRG");
        lIIllIIIlIlII[lIIllIIIllIlI[63]] = lIlIllllIIIlIlI("A0TdizCkqgd+OPGUgsrQ0A==", "vWLUr");
        lIIllIIIlIlII[lIIllIIIllIlI[64]] = lIlIllllIIIIlIl("rJ5YW1KEeBOwAB4V3wkq3g==", "SJJpd");
        lIIllIIIlIlII[lIIllIIIllIlI[65]] = lIlIllllIIIlIlI("paK8x6EQ2BNl3CYMu2VyEQ==", "xmWju");
        lIIllIIIlIlII[lIIllIIIllIlI[66]] = lIlIllllIIIIlIl("VaOoBQEd7q8+AkVL8YMrAw==", "AQRys");
        lIIllIIIlIlII[lIIllIIIllIlI[67]] = lIlIllllIIIlIIl("AwY7HTU0Tj4dPyROOhk1Ng==", "PnRxY");
        lIIllIIIlIlII[lIIllIIIllIlI[68]] = lIlIllllIIIlIIl("NTwbEhofbgkFEBA8", "qNzuu");
        lIIllIIIlIlII[lIIllIIIllIlI[69]] = lIlIllllIIIlIlI("bwsPuGnwGkApaM7tNE2Wqw==", "muvUL");
        lIIllIIIlIlII[lIIllIIIllIlI[70]] = lIlIllllIIIlIIl("JQccLUsYCFI9DhYCBiI=", "wnrJk");
        lIIllIIIlIlII[lIIllIIIllIlI[71]] = lIlIllllIIIlIlI("DK9LJZmm3hy28gRa8uewOw==", "MxIQz");
        lIIllIIIlIlII[lIIllIIIllIlI[72]] = lIlIllllIIIIlIl("llrsGBF2RdZ2SPf9o3VzXg==", "xwSXX");
        lIIllIIIlIlII[lIIllIIIllIlI[73]] = lIlIllllIIIlIlI("FVQCP7YG10CU3Sj05MOI2A==", "JLfrp");
        lIIllIIIlIlII[lIIllIIIllIlI[74]] = lIlIllllIIIlIlI("nkkku9WF+VdUSXTh++yrvQ==", "xikML");
        lIIllIIIlIlII[lIIllIIIllIlI[75]] = lIlIllllIIIIlIl("99zn/68MC2ckzSCxUVwfeA==", "vJqDv");
        lIIllIIIlIlII[lIIllIIIllIlI[76]] = lIlIllllIIIIlIl("rLn4spfD2171geAzQJWvBCFRZVwwME46", "jvjbr");
        lIIllIIIlIlII[lIIllIIIllIlI[77]] = lIlIllllIIIIlIl("jHwq+sY4bdv0dOcieDVFgg==", "YVPKs");
        lIIllIIIlIlII[lIIllIIIllIlI[78]] = lIlIllllIIIlIlI("UBm5c20tO//k5jCzaCH6C8Ocu7tTVx55", "yZPuP");
        lIIllIIIlIlII[lIIllIIIllIlI[79]] = lIlIllllIIIIlIl("zdTJOSG+zB31TmCt0v1VU1IOmjTZ/CRZ", "kYVUl");
        lIIllIIIlIlII[lIIllIIIllIlI[80]] = lIlIllllIIIIlIl("kVHgrR7BmbE0AQIV/AE2mQ==", "pkMnp");
        lIIllIIIlIlII[lIIllIIIllIlI[81]] = lIlIllllIIIIlIl("OyZmSBq6brvZb266djju8A==", "ddzvk");
        lIIllIIIlIlII[lIIllIIIllIlI[82]] = lIlIllllIIIlIlI("lUVzp2j2VSss/loFjFT0oluQ7VXAv3qv", "Ajrli");
        lIIllIIIlIlII[lIIllIIIllIlI[83]] = lIlIllllIIIlIIl("FS0XIxsvJQ08WictFz4=", "ALyYz");
        lIIllIIIlIlII[lIIllIIIllIlI[84]] = lIlIllllIIIlIIl("OQc9KxZUADssEg==", "tfZBu");
        lIIllIIIlIlII[lIIllIIIllIlI[85]] = lIlIllllIIIlIIl("GRAQJAgkAQs6CGoDCycMLRA=", "JubTm");
        lIIllIIIlIlII[lIIllIIIllIlI[86]] = lIlIllllIIIIlIl("g4fPBho4goyYQvvRjgUM2Q==", "xVEnf");
        lIIllIIIlIlII[lIIllIIIllIlI[87]] = lIlIllllIIIlIIl("PgQgNTgUViw3M1oeJD46", "zvARW");
        lIIllIIIlIlII[lIIllIIIllIlI[88]] = lIlIllllIIIlIIl("LzsiFg0FaSsQDgksMRU=", "kICqb");
        lIIllIIIlIlII[lIIllIIIllIlI[89]] = lIlIllllIIIlIlI("Vjd6IkKp774kJKSUOkdagQ==", "uoQyf");
        lIIllIIIlIlII[lIIllIIIllIlI[90]] = lIlIllllIIIlIIl("FTgfD1YgPh4PGCYo", "EMmjv");
        lIIllIIIlIlII[lIIllIIIllIlI[91]] = lIlIllllIIIIlIl("1DlExD2VmCi64w7OVKbhyQ==", "xNoPj");
        lIIllIIIlIlII[lIIllIIIllIlI[92]] = lIlIllllIIIIlIl("j8aCZj1+rQLiXgXj/0jURQ==", "iccLQ");
        lIIllIIIlIlII[lIIllIIIllIlI[93]] = lIlIllllIIIlIIl("My0jNydXLScgJQ==", "wZBEA");
        lIIllIIIlIlII[lIIllIIIllIlI[94]] = lIlIllllIIIIlIl("dffEd86WE7c=", "jMbDl");
        lIIllIIIlIlII[lIIllIIIllIlI[95]] = lIlIllllIIIIlIl("dIHwxSlwL+w=", "IJFIt");
        lIIllIIIlIlII[lIIllIIIllIlI[96]] = lIlIllllIIIlIlI("wfVowiPm73S76DyLziap8w==", "xMSll");
        lIIllIIIlIlII[lIIllIIIllIlI[97]] = lIlIllllIIIlIlI("Ds0U0u+jmsb4KIYJByhddaiV9L0nHm+X", "eSmwL");
        lIIllIIIlIlII[lIIllIIIllIlI[98]] = lIlIllllIIIIlIl("DHobDvsy+nOp91oVcn7lzg==", "MdXic");
        lIIllIIIlIlII[lIIllIIIllIlI[99]] = lIlIllllIIIlIIl("GTYuNgI1OT95CTswNQ==", "TWFYe");
        lIIllIIIlIlII[lIIllIIIllIlI[100]] = lIlIllllIIIIlIl("1gNUP8tzqSM=", "OLzlU");
        lIIllIIIlIlII[lIIllIIIllIlI[101]] = lIlIllllIIIlIIl("OTw5HzEOaTgEIA==", "kIWvE");
        lIIllIIIlIlII[lIIllIIIllIlI[102]] = lIlIllllIIIlIIl("NBUVKDsWAFktPBIRWSorEhA=", "wtyYN");
        lIIllIIIlIlII[lIIllIIIllIlI[103]] = lIlIllllIIIlIlI("vrRtpxV1ksoxbrdWL3fSUA==", "qCIRc");
        lIIllIIIlIlII[lIIllIIIllIlI[104]] = lIlIllllIIIlIIl("MzIaNzACcx4kLAZzGTMsBw==", "cSjVI");
        lIIllIIIlIlII[lIIllIIIllIlI[105]] = lIlIllllIIIlIlI("Gk2G9VyOv61kHQmxDNA/1w==", "iBhZR");
        lIIllIIIlIlII[lIIllIIIllIlI[106]] = lIlIllllIIIIlIl("MOK5FHgc4g8VdIHLr9i/Nw==", "NOnPC");
        lIIllIIIlIlII[lIIllIIIllIlI[107]] = lIlIllllIIIlIlI("1JsVAUJtF3sNye7Pqq5YCQ==", "izXwA");
        lIIllIIIlIlII[lIIllIIIllIlI[108]] = lIlIllllIIIlIIl("IgMxCydGAzUcJUYHNRwl", "ftPyA");
        lIIllIIIlIlII[lIIllIIIllIlI[109]] = lIlIllllIIIlIlI("59YBhuZy1eFJJJPmaArTUw==", "fyUIH");
        lIIllIIIlIlII[lIIllIIIllIlI[110]] = lIlIllllIIIlIlI("G1+4pNscwtJHgZ8Oez4FOg==", "AboWl");
        lIIllIIIlIlII[lIIllIIIllIlI[111]] = lIlIllllIIIlIlI("7tw7y4rB3tv3dNUdd0IwxQ==", "tzWfF");
        lIIllIIIlIlII[lIIllIIIllIlI[112]] = lIlIllllIIIlIIl("ECkrOzcmMg==", "SFHTY");
        lIIllIIIlIlII[lIIllIIIllIlI[113]] = lIlIllllIIIlIIl("HQcFBDQp", "ZudtQ");
        lIIllIIIlIlII[lIIllIIIllIlI[114]] = lIlIllllIIIlIIl("JREsLj8CAyw7NQE=", "gpXZS");
        lIIllIIIlIlII[lIIllIIIllIlI[115]] = lIlIllllIIIIlIl("ecOHlQH8NhcB/qOfUR6NFA==", "LFyFn");
        lIIllIIIlIlII[lIIllIIIllIlI[116]] = lIlIllllIIIlIlI("j6zsVQlLAKAlo3S526I7mQ==", "VNLfR");
        lIIllIIIlIlII[lIIllIIIllIlI[117]] = lIlIllllIIIlIIl("LjgSGyAILkcGLR4+", "mJghH");
        lIIllIIIlIlII[lIIllIIIllIlI[118]] = lIlIllllIIIlIIl("ICwtBzAPPCUeNEEqLRg=", "aHLjQ");
        lIIllIIIlIlII[lIIllIIIllIlI[119]] = lIlIllllIIIlIlI("PNMmd70g+rGgejEaIed/dQ==", "YhMVr");
        lIIllIIIlIlII[lIIllIIIllIlI[120]] = lIlIllllIIIlIlI("HfbP/LyCgyWCX0a1F1BEQg==", "OsFWA");
        lIIllIIIlIlII[lIIllIIIllIlI[121]] = lIlIllllIIIlIIl("PjYrMx9LKj0kEg==", "kXHFk");
        lIIllIIIlIlII[lIIllIIIllIlI[122]] = lIlIllllIIIlIIl("KicXIwFJOxcgGxoiFyI=", "iOvLr");
        lIIllIIIlIlII[lIIllIIIllIlI[123]] = lIlIllllIIIIlIl("PuddfPQ9baQmKELzzupdGQ==", "BGfAU");
        lIIllIIIlIlII[lIIllIIIllIlI[124]] = lIlIllllIIIIlIl("qRGKE8HWhhLrTPVZavnjDQ==", "iwrzL");
        lIIllIIIlIlII[lIIllIIIllIlI[125]] = lIlIllllIIIlIIl("OR8/J1EdETwxURoWcDwUDA==", "upPWq");
        lIIllIIIlIlII[lIIllIIIllIlI[126]] = lIlIllllIIIlIIl("FwwtBTBjCyMdPmMMJFEzJho=", "CcBqX");
        lIIllIIIlIlII[lIIllIIIllIlI[127]] = lIlIllllIIIlIlI("ctqvmOYQVFokrLLVn6xFMg==", "aulcQ");
        lIIllIIIlIlII[lIIllIIIllIlI[128]] = lIlIllllIIIlIlI("/gMEMJGqTxs590ZTSGBTx3fUdQP2KSwd", "YtYSI");
        lIIllIIIlIlII[lIIllIIIllIlI[129]] = lIlIllllIIIlIIl("FjU1NiM8ZychKTM1", "RGTQL");
        lIIllIIIlIlII[lIIllIIIllIlI[130]] = lIlIllllIIIlIlI("NgHxCEjHJc1uo+1DSdH3AQ==", "mFCXF");
        lIIllIIIlIlII[lIIllIIIllIlI[131]] = lIlIllllIIIIlIl("q432O3L3z8pBWtT6uxsW2A==", "tQKNg");
        lIIllIIIlIlII[lIIllIIIllIlI[132]] = lIlIllllIIIlIIl("PScmEhAcbiUWEA==", "nNJdu");
        lIIllIIIlIlII[lIIllIIIllIlI[133]] = lIlIllllIIIIlIl("fjfTJQCEFdL14ycnUOhFYw==", "SCWJh");
        lIIllIIIlIlII[lIIllIIIllIlI[134]] = lIlIllllIIIIlIl("ggzaYKQ0bXa8cWUOeT20MA==", "IxPGU");
        lIIllIIIlIlII[lIIllIIIllIlI[135]] = lIlIllllIIIlIIl("ERQINmMhABInLyYAHjY=", "CafSC");
        lIIllIIIlIlII[lIIllIIIllIlI[136]] = lIlIllllIIIlIlI("/l2RNSY5K6qCqeY63GYsQw==", "SwWIl");
        lIIllIIIlIlII[lIIllIIIllIlI[137]] = lIlIllllIIIIlIl("flz1sGJH4Dfk5yuQNrCbKA==", "OHOqc");
        lIIllIIIlIlII[lIIllIIIllIlI[15]] = lIlIllllIIIlIlI("57SlBqi00E808t1qXHAZnw==", "dYgeG");
        lIIllIIIlIlII[lIIllIIIllIlI[138]] = lIlIllllIIIlIIl("IRwsI0wSGzApGw==", "siBFl");
        lIIllIIIlIlII[lIIllIIIllIlI[139]] = lIlIllllIIIIlIl("OO5RDOjfa5grqbvsMvDNjQ==", "tRmZq");
        lIIllIIIlIlII[lIIllIIIllIlI[140]] = lIlIllllIIIIlIl("n4trdPBweDbl+G4ccutiNA==", "dJbiE");
        lIIllIIIlIlII[lIIllIIIllIlI[141]] = lIlIllllIIIIlIl("K2FvDSJ+x9xSqWMsC0uAoA==", "lvQZJ");
        lIIllIIIlIlII[lIIllIIIllIlI[142]] = lIlIllllIIIlIlI("jEbzTIOZPOOdD8dSXLMn+A==", "xvqDc");
        lIIllIIIlIlII[lIIllIIIllIlI[143]] = lIlIllllIIIIlIl("0otF2NCnog1MainLAb5+0Q==", "NntDk");
        lIIllIIIlIlII[lIIllIIIllIlI[144]] = lIlIllllIIIlIIl("CgwbCgJ1GkkXAD4AGg4APElBCg83Gx1K", "Riica");
        lIIllIIIlIlII[lIIllIIIllIlI[145]] = lIlIllllIIIIlIl("hMGWz4u2fnJcvzQu9b5yvA==", "REWGY");
        lIIllIIIlIlII[lIIllIIIllIlI[146]] = lIlIllllIIIlIIl("LBI8ERkICnkEEgQ=", "ifYcw");
        lIIllIIIlIlII[lIIllIIIllIlI[147]] = lIlIllllIIIlIlI("xuchCBpv1xqsxCyzMtauHw==", "clNwv");
        lIIllIIIlIlII[lIIllIIIllIlI[148]] = lIlIllllIIIlIIl("Lw8nMWgAByAxJAcVICQuBA==", "bfTEH");
        lIIllIIIlIlII[lIIllIIIllIlI[149]] = lIlIllllIIIlIIl("JxISAnIBBhUCPgYUFRc0BQ==", "cgavR");
        lIIllIIIlIlII[lIIllIIIllIlI[150]] = lIlIllllIIIlIIl("BS0lDVMrLSUP", "IBKjs");
        lIIllIIIlIlII[lIIllIIIllIlI[151]] = lIlIllllIIIIlIl("nIs9bT+H8vhbHlLQGXp1cA==", "ApRWz");
        lIIllIIIlIlII[lIIllIIIllIlI[152]] = lIlIllllIIIlIIl("GBYEH2w2FgQd", "TyjxL");
        lIIllIIIlIlII[lIIllIIIllIlI[153]] = lIlIllllIIIlIlI("K6Z8mo6qMck4iAmRgIzSdw==", "hCkCK");
        lIIllIIIlIlII[lIIllIIIllIlI[154]] = lIlIllllIIIIlIl("YZ18S44cF+a6xtdCYYMdWg==", "uCcjq");
    }

    public boolean m() {
        return this.u;
    }

    private static String lIlIllllIIIIlIl(String llllllllllllllIllllIIIllIIIlIIIl, String llllllllllllllIllllIIIllIIIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIllIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIllIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIIllIlI[3], llllllllllllllIllllIIIllIIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIllIIIIllIl) {
            llllllllllllllIllllIIIllIIIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIllllIlIIIlI();
        lIlIllllIlIIIIl();
        String[] strArr = new String[lIIllIIIllIlI[2]];
        strArr[lIIllIIIllIlI[1]] = lIIllIIIlIlII[lIIllIIIllIlI[3]];
        strArr[lIIllIIIllIlI[0]] = lIIllIIIlIlII[lIIllIIIllIlI[4]];
        strArr[lIIllIIIllIlI[3]] = lIIllIIIlIlII[lIIllIIIllIlI[5]];
        strArr[lIIllIIIllIlI[4]] = lIIllIIIlIlII[lIIllIIIllIlI[6]];
        strArr[lIIllIIIllIlI[5]] = lIIllIIIlIlII[lIIllIIIllIlI[7]];
        strArr[lIIllIIIllIlI[6]] = lIIllIIIlIlII[lIIllIIIllIlI[8]];
        strArr[lIIllIIIllIlI[7]] = lIIllIIIlIlII[lIIllIIIllIlI[9]];
        strArr[lIIllIIIllIlI[8]] = lIIllIIIlIlII[lIIllIIIllIlI[10]];
        strArr[lIIllIIIllIlI[9]] = lIIllIIIlIlII[lIIllIIIllIlI[11]];
        strArr[lIIllIIIllIlI[10]] = lIIllIIIlIlII[lIIllIIIllIlI[12]];
        strArr[lIIllIIIllIlI[11]] = lIIllIIIlIlII[lIIllIIIllIlI[13]];
        strArr[lIIllIIIllIlI[12]] = lIIllIIIlIlII[lIIllIIIllIlI[2]];
        strArr[lIIllIIIllIlI[13]] = lIIllIIIlIlII[lIIllIIIllIlI[14]];
        q = List.of((Object[]) strArr);
        String[] strArr2 = new String[lIIllIIIllIlI[15]];
        strArr2[lIIllIIIllIlI[1]] = lIIllIIIlIlII[lIIllIIIllIlI[16]];
        strArr2[lIIllIIIllIlI[0]] = lIIllIIIlIlII[lIIllIIIllIlI[17]];
        strArr2[lIIllIIIllIlI[3]] = lIIllIIIlIlII[lIIllIIIllIlI[18]];
        strArr2[lIIllIIIllIlI[4]] = lIIllIIIlIlII[lIIllIIIllIlI[19]];
        strArr2[lIIllIIIllIlI[5]] = lIIllIIIlIlII[lIIllIIIllIlI[20]];
        strArr2[lIIllIIIllIlI[6]] = lIIllIIIlIlII[lIIllIIIllIlI[21]];
        strArr2[lIIllIIIllIlI[7]] = lIIllIIIlIlII[lIIllIIIllIlI[22]];
        strArr2[lIIllIIIllIlI[8]] = lIIllIIIlIlII[lIIllIIIllIlI[23]];
        strArr2[lIIllIIIllIlI[9]] = lIIllIIIlIlII[lIIllIIIllIlI[24]];
        strArr2[lIIllIIIllIlI[10]] = lIIllIIIlIlII[lIIllIIIllIlI[25]];
        strArr2[lIIllIIIllIlI[11]] = lIIllIIIlIlII[lIIllIIIllIlI[26]];
        strArr2[lIIllIIIllIlI[12]] = lIIllIIIlIlII[lIIllIIIllIlI[27]];
        strArr2[lIIllIIIllIlI[13]] = lIIllIIIlIlII[lIIllIIIllIlI[28]];
        strArr2[lIIllIIIllIlI[2]] = lIIllIIIlIlII[lIIllIIIllIlI[29]];
        strArr2[lIIllIIIllIlI[14]] = lIIllIIIlIlII[lIIllIIIllIlI[30]];
        strArr2[lIIllIIIllIlI[16]] = lIIllIIIlIlII[lIIllIIIllIlI[31]];
        strArr2[lIIllIIIllIlI[17]] = lIIllIIIlIlII[lIIllIIIllIlI[32]];
        strArr2[lIIllIIIllIlI[18]] = lIIllIIIlIlII[lIIllIIIllIlI[33]];
        strArr2[lIIllIIIllIlI[19]] = lIIllIIIlIlII[lIIllIIIllIlI[34]];
        strArr2[lIIllIIIllIlI[20]] = lIIllIIIlIlII[lIIllIIIllIlI[35]];
        strArr2[lIIllIIIllIlI[21]] = lIIllIIIlIlII[lIIllIIIllIlI[36]];
        strArr2[lIIllIIIllIlI[22]] = lIIllIIIlIlII[lIIllIIIllIlI[37]];
        strArr2[lIIllIIIllIlI[23]] = lIIllIIIlIlII[lIIllIIIllIlI[38]];
        strArr2[lIIllIIIllIlI[24]] = lIIllIIIlIlII[lIIllIIIllIlI[39]];
        strArr2[lIIllIIIllIlI[25]] = lIIllIIIlIlII[lIIllIIIllIlI[40]];
        strArr2[lIIllIIIllIlI[26]] = lIIllIIIlIlII[lIIllIIIllIlI[41]];
        strArr2[lIIllIIIllIlI[27]] = lIIllIIIlIlII[lIIllIIIllIlI[42]];
        strArr2[lIIllIIIllIlI[28]] = lIIllIIIlIlII[lIIllIIIllIlI[43]];
        strArr2[lIIllIIIllIlI[29]] = lIIllIIIlIlII[lIIllIIIllIlI[44]];
        strArr2[lIIllIIIllIlI[30]] = lIIllIIIlIlII[lIIllIIIllIlI[45]];
        strArr2[lIIllIIIllIlI[31]] = lIIllIIIlIlII[lIIllIIIllIlI[46]];
        strArr2[lIIllIIIllIlI[32]] = lIIllIIIlIlII[lIIllIIIllIlI[47]];
        strArr2[lIIllIIIllIlI[33]] = lIIllIIIlIlII[lIIllIIIllIlI[48]];
        strArr2[lIIllIIIllIlI[34]] = lIIllIIIlIlII[lIIllIIIllIlI[49]];
        strArr2[lIIllIIIllIlI[35]] = lIIllIIIlIlII[lIIllIIIllIlI[50]];
        strArr2[lIIllIIIllIlI[36]] = lIIllIIIlIlII[lIIllIIIllIlI[51]];
        strArr2[lIIllIIIllIlI[37]] = lIIllIIIlIlII[lIIllIIIllIlI[52]];
        strArr2[lIIllIIIllIlI[38]] = lIIllIIIlIlII[lIIllIIIllIlI[53]];
        strArr2[lIIllIIIllIlI[39]] = lIIllIIIlIlII[lIIllIIIllIlI[54]];
        strArr2[lIIllIIIllIlI[40]] = lIIllIIIlIlII[lIIllIIIllIlI[55]];
        strArr2[lIIllIIIllIlI[41]] = lIIllIIIlIlII[lIIllIIIllIlI[56]];
        strArr2[lIIllIIIllIlI[42]] = lIIllIIIlIlII[lIIllIIIllIlI[57]];
        strArr2[lIIllIIIllIlI[43]] = lIIllIIIlIlII[lIIllIIIllIlI[58]];
        strArr2[lIIllIIIllIlI[44]] = lIIllIIIlIlII[lIIllIIIllIlI[59]];
        strArr2[lIIllIIIllIlI[45]] = lIIllIIIlIlII[lIIllIIIllIlI[60]];
        strArr2[lIIllIIIllIlI[46]] = lIIllIIIlIlII[lIIllIIIllIlI[61]];
        strArr2[lIIllIIIllIlI[47]] = lIIllIIIlIlII[lIIllIIIllIlI[62]];
        strArr2[lIIllIIIllIlI[48]] = lIIllIIIlIlII[lIIllIIIllIlI[63]];
        strArr2[lIIllIIIllIlI[49]] = lIIllIIIlIlII[lIIllIIIllIlI[64]];
        strArr2[lIIllIIIllIlI[50]] = lIIllIIIlIlII[lIIllIIIllIlI[65]];
        strArr2[lIIllIIIllIlI[51]] = lIIllIIIlIlII[lIIllIIIllIlI[66]];
        strArr2[lIIllIIIllIlI[52]] = lIIllIIIlIlII[lIIllIIIllIlI[67]];
        strArr2[lIIllIIIllIlI[53]] = lIIllIIIlIlII[lIIllIIIllIlI[68]];
        strArr2[lIIllIIIllIlI[54]] = lIIllIIIlIlII[lIIllIIIllIlI[69]];
        strArr2[lIIllIIIllIlI[55]] = lIIllIIIlIlII[lIIllIIIllIlI[70]];
        strArr2[lIIllIIIllIlI[56]] = lIIllIIIlIlII[lIIllIIIllIlI[71]];
        strArr2[lIIllIIIllIlI[57]] = lIIllIIIlIlII[lIIllIIIllIlI[72]];
        strArr2[lIIllIIIllIlI[58]] = lIIllIIIlIlII[lIIllIIIllIlI[73]];
        strArr2[lIIllIIIllIlI[59]] = lIIllIIIlIlII[lIIllIIIllIlI[74]];
        strArr2[lIIllIIIllIlI[60]] = lIIllIIIlIlII[lIIllIIIllIlI[75]];
        strArr2[lIIllIIIllIlI[61]] = lIIllIIIlIlII[lIIllIIIllIlI[76]];
        strArr2[lIIllIIIllIlI[62]] = lIIllIIIlIlII[lIIllIIIllIlI[77]];
        strArr2[lIIllIIIllIlI[63]] = lIIllIIIlIlII[lIIllIIIllIlI[78]];
        strArr2[lIIllIIIllIlI[64]] = lIIllIIIlIlII[lIIllIIIllIlI[79]];
        strArr2[lIIllIIIllIlI[65]] = lIIllIIIlIlII[lIIllIIIllIlI[80]];
        strArr2[lIIllIIIllIlI[66]] = lIIllIIIlIlII[lIIllIIIllIlI[81]];
        strArr2[lIIllIIIllIlI[67]] = lIIllIIIlIlII[lIIllIIIllIlI[82]];
        strArr2[lIIllIIIllIlI[68]] = lIIllIIIlIlII[lIIllIIIllIlI[83]];
        strArr2[lIIllIIIllIlI[69]] = lIIllIIIlIlII[lIIllIIIllIlI[84]];
        strArr2[lIIllIIIllIlI[70]] = lIIllIIIlIlII[lIIllIIIllIlI[85]];
        strArr2[lIIllIIIllIlI[71]] = lIIllIIIlIlII[lIIllIIIllIlI[86]];
        strArr2[lIIllIIIllIlI[72]] = lIIllIIIlIlII[lIIllIIIllIlI[87]];
        strArr2[lIIllIIIllIlI[73]] = lIIllIIIlIlII[lIIllIIIllIlI[88]];
        strArr2[lIIllIIIllIlI[74]] = lIIllIIIlIlII[lIIllIIIllIlI[89]];
        strArr2[lIIllIIIllIlI[75]] = lIIllIIIlIlII[lIIllIIIllIlI[90]];
        strArr2[lIIllIIIllIlI[76]] = lIIllIIIlIlII[lIIllIIIllIlI[91]];
        strArr2[lIIllIIIllIlI[77]] = lIIllIIIlIlII[lIIllIIIllIlI[92]];
        strArr2[lIIllIIIllIlI[78]] = lIIllIIIlIlII[lIIllIIIllIlI[93]];
        strArr2[lIIllIIIllIlI[79]] = lIIllIIIlIlII[lIIllIIIllIlI[94]];
        strArr2[lIIllIIIllIlI[80]] = lIIllIIIlIlII[lIIllIIIllIlI[95]];
        strArr2[lIIllIIIllIlI[81]] = lIIllIIIlIlII[lIIllIIIllIlI[96]];
        strArr2[lIIllIIIllIlI[82]] = lIIllIIIlIlII[lIIllIIIllIlI[97]];
        strArr2[lIIllIIIllIlI[83]] = lIIllIIIlIlII[lIIllIIIllIlI[98]];
        strArr2[lIIllIIIllIlI[84]] = lIIllIIIlIlII[lIIllIIIllIlI[99]];
        strArr2[lIIllIIIllIlI[85]] = lIIllIIIlIlII[lIIllIIIllIlI[100]];
        strArr2[lIIllIIIllIlI[86]] = lIIllIIIlIlII[lIIllIIIllIlI[101]];
        strArr2[lIIllIIIllIlI[87]] = lIIllIIIlIlII[lIIllIIIllIlI[102]];
        strArr2[lIIllIIIllIlI[88]] = lIIllIIIlIlII[lIIllIIIllIlI[103]];
        strArr2[lIIllIIIllIlI[89]] = lIIllIIIlIlII[lIIllIIIllIlI[104]];
        strArr2[lIIllIIIllIlI[90]] = lIIllIIIlIlII[lIIllIIIllIlI[105]];
        strArr2[lIIllIIIllIlI[91]] = lIIllIIIlIlII[lIIllIIIllIlI[106]];
        strArr2[lIIllIIIllIlI[92]] = lIIllIIIlIlII[lIIllIIIllIlI[107]];
        strArr2[lIIllIIIllIlI[93]] = lIIllIIIlIlII[lIIllIIIllIlI[108]];
        strArr2[lIIllIIIllIlI[94]] = lIIllIIIlIlII[lIIllIIIllIlI[109]];
        strArr2[lIIllIIIllIlI[95]] = lIIllIIIlIlII[lIIllIIIllIlI[110]];
        strArr2[lIIllIIIllIlI[96]] = lIIllIIIlIlII[lIIllIIIllIlI[111]];
        strArr2[lIIllIIIllIlI[97]] = lIIllIIIlIlII[lIIllIIIllIlI[112]];
        strArr2[lIIllIIIllIlI[98]] = lIIllIIIlIlII[lIIllIIIllIlI[113]];
        strArr2[lIIllIIIllIlI[99]] = lIIllIIIlIlII[lIIllIIIllIlI[114]];
        strArr2[lIIllIIIllIlI[100]] = lIIllIIIlIlII[lIIllIIIllIlI[115]];
        strArr2[lIIllIIIllIlI[101]] = lIIllIIIlIlII[lIIllIIIllIlI[116]];
        strArr2[lIIllIIIllIlI[102]] = lIIllIIIlIlII[lIIllIIIllIlI[117]];
        strArr2[lIIllIIIllIlI[103]] = lIIllIIIlIlII[lIIllIIIllIlI[118]];
        strArr2[lIIllIIIllIlI[104]] = lIIllIIIlIlII[lIIllIIIllIlI[119]];
        strArr2[lIIllIIIllIlI[105]] = lIIllIIIlIlII[lIIllIIIllIlI[120]];
        strArr2[lIIllIIIllIlI[106]] = lIIllIIIlIlII[lIIllIIIllIlI[121]];
        strArr2[lIIllIIIllIlI[107]] = lIIllIIIlIlII[lIIllIIIllIlI[122]];
        strArr2[lIIllIIIllIlI[108]] = lIIllIIIlIlII[lIIllIIIllIlI[123]];
        strArr2[lIIllIIIllIlI[109]] = lIIllIIIlIlII[lIIllIIIllIlI[124]];
        strArr2[lIIllIIIllIlI[110]] = lIIllIIIlIlII[lIIllIIIllIlI[125]];
        strArr2[lIIllIIIllIlI[111]] = lIIllIIIlIlII[lIIllIIIllIlI[126]];
        strArr2[lIIllIIIllIlI[112]] = lIIllIIIlIlII[lIIllIIIllIlI[127]];
        strArr2[lIIllIIIllIlI[113]] = lIIllIIIlIlII[lIIllIIIllIlI[128]];
        strArr2[lIIllIIIllIlI[114]] = lIIllIIIlIlII[lIIllIIIllIlI[129]];
        strArr2[lIIllIIIllIlI[115]] = lIIllIIIlIlII[lIIllIIIllIlI[130]];
        strArr2[lIIllIIIllIlI[116]] = lIIllIIIlIlII[lIIllIIIllIlI[131]];
        strArr2[lIIllIIIllIlI[117]] = lIIllIIIlIlII[lIIllIIIllIlI[132]];
        strArr2[lIIllIIIllIlI[118]] = lIIllIIIlIlII[lIIllIIIllIlI[133]];
        strArr2[lIIllIIIllIlI[119]] = lIIllIIIlIlII[lIIllIIIllIlI[134]];
        strArr2[lIIllIIIllIlI[120]] = lIIllIIIlIlII[lIIllIIIllIlI[135]];
        strArr2[lIIllIIIllIlI[121]] = lIIllIIIlIlII[lIIllIIIllIlI[136]];
        strArr2[lIIllIIIllIlI[122]] = lIIllIIIlIlII[lIIllIIIllIlI[137]];
        strArr2[lIIllIIIllIlI[123]] = lIIllIIIlIlII[lIIllIIIllIlI[15]];
        strArr2[lIIllIIIllIlI[124]] = lIIllIIIlIlII[lIIllIIIllIlI[138]];
        strArr2[lIIllIIIllIlI[125]] = lIIllIIIlIlII[lIIllIIIllIlI[139]];
        strArr2[lIIllIIIllIlI[126]] = lIIllIIIlIlII[lIIllIIIllIlI[140]];
        strArr2[lIIllIIIllIlI[127]] = lIIllIIIlIlII[lIIllIIIllIlI[141]];
        strArr2[lIIllIIIllIlI[128]] = lIIllIIIlIlII[lIIllIIIllIlI[142]];
        strArr2[lIIllIIIllIlI[129]] = lIIllIIIlIlII[lIIllIIIllIlI[143]];
        strArr2[lIIllIIIllIlI[130]] = lIIllIIIlIlII[lIIllIIIllIlI[144]];
        strArr2[lIIllIIIllIlI[131]] = lIIllIIIlIlII[lIIllIIIllIlI[145]];
        strArr2[lIIllIIIllIlI[132]] = lIIllIIIlIlII[lIIllIIIllIlI[146]];
        strArr2[lIIllIIIllIlI[133]] = lIIllIIIlIlII[lIIllIIIllIlI[147]];
        strArr2[lIIllIIIllIlI[134]] = lIIllIIIlIlII[lIIllIIIllIlI[148]];
        strArr2[lIIllIIIllIlI[135]] = lIIllIIIlIlII[lIIllIIIllIlI[149]];
        strArr2[lIIllIIIllIlI[136]] = lIIllIIIlIlII[lIIllIIIllIlI[150]];
        strArr2[lIIllIIIllIlI[137]] = lIIllIIIlIlII[lIIllIIIllIlI[151]];
        r = Arrays.asList(strArr2);
        f0s = new C0001b();
        t = List.of(lIIllIIIlIlII[lIIllIIIllIlI[152]], lIIllIIIlIlII[lIIllIIIllIlI[153]], lIIllIIIlIlII[lIIllIIIllIlI[154]]);
    }

    public boolean a(TileItem tileItem) {
        return t.contains(tileItem.getName());
    }

    public void g(boolean z) {
        this.u = z;
    }

    private static boolean lIlIllllIlIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllllIlIIlIl(Object obj) {
        return obj != null;
    }

    public Optional<Item> l() {
        return Inventory.getAll(item -> {
            if (lIlIllllIlIIlIl(item.getName()) && lIlIllllIlIIllI(f0s.containsKey(item.getName()) ? 1 : 0)) {
                ?? r0 = lIIllIIIllIlI[0];
                "".length();
                return ((((91 + 55) - 94) + 90) ^ (((104 + 69) - 69) + 34)) == (-" ".length()) ? ((116 ^ 55) ^ (127 ^ 105)) & (((((139 + 79) - (-3)) + 0) ^ (((69 + 11) - 21) + 77)) ^ (-" ".length())) : r0;
            }
            return lIIllIIIllIlI[1];
        }).stream().filter(item2 -> {
            if (lIlIllllIlIIlII(item2.getName().equals(lIIllIIIlIlII[lIIllIIIllIlI[1]]) ? 1 : 0)) {
                ?? r0 = lIIllIIIllIlI[0];
                "".length();
                return "   ".length() <= 0 ? ((151 ^ 180) ^ (126 ^ 65)) & (((((127 + 167) - 268) + 192) ^ (((62 + 186) - 160) + 110)) ^ (-" ".length())) : r0;
            }
            return lIIllIIIllIlI[1];
        }).min(Comparator.comparingInt(item3 -> {
            return f0s.get(item3.getName()).intValue() * item3.getQuantity();
        }));
    }

    @Inject
    public C0000a(c cVar, SquireShamanConfig squireShamanConfig) {
        this.v = cVar;
        this.w = squireShamanConfig;
    }

    private static boolean lIlIllllIlIIlll(Object obj) {
        return obj == null;
    }

    public Optional<TileItem> k() {
        return TileItems.getAll(tileItem -> {
            if (lIlIllllIlIIllI(this.v.t().x().contains(tileItem.getWorldLocation()) ? 1 : 0) && lIlIllllIlIIlIl(tileItem.getName()) && lIlIllllIlIIllI(r.contains(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = lIIllIIIllIlI[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIllIlI[1];
        }).stream().filter(tileItem2 -> {
            if (lIlIllllIlIIlll(NPCs.getNearest(npc -> {
                if (lIlIllllIlIIllI(npc.getName().equals(lIIllIIIlIlII[lIIllIIIllIlI[0]]) ? 1 : 0) && lIlIllllIlIIllI(npc.getWorldArea().contains(tileItem2) ? 1 : 0)) {
                    ?? r0 = lIIllIIIllIlI[0];
                    "".length();
                    return (-" ".length()) >= " ".length() ? ((((188 + 101) - 105) + 53) ^ (((133 + 161) - 241) + 126)) & (((101 ^ 97) ^ (48 ^ 106)) ^ (-" ".length())) : r0;
                }
                return lIIllIIIllIlI[1];
            }))) {
                ?? r0 = lIIllIIIllIlI[0];
                "".length();
                return (120 ^ 124) < (35 ^ 39) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIllIlI[1];
        }).filter(tileItem3 -> {
            if (!lIlIllllIlIIlII(this.w.alch() ? 1 : 0) || lIlIllllIlIIlII(q.contains(tileItem3.getName()) ? 1 : 0)) {
                ?? r0 = lIIllIIIllIlI[0];
                "".length();
                return ((109 ^ 80) ^ (165 ^ 156)) > ((197 ^ 160) ^ (253 ^ 156)) ? ((90 ^ 123) ^ (107 ^ 90)) & (((148 ^ 198) ^ (230 ^ 164)) ^ (-" ".length())) : r0;
            }
            return lIIllIIIllIlI[1];
        }).max(Comparator.comparingInt(obj -> {
            return Prices.getItemPrice(((TileItem) obj).getId()) * ((TileItem) obj).getQuantity();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }
}
