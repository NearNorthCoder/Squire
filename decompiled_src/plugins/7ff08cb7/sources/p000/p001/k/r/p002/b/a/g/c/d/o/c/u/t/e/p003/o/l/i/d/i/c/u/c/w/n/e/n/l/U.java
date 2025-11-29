package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.U  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/U.class */
public class U implements ab {
    static /* synthetic */ WorldArea lo;
    private static /* synthetic */ int[] lllIIIlIl;
    static /* synthetic */ String[] cG;
    public static /* synthetic */ WorldPoint dg;
    static /* synthetic */ boolean dl;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ int dk;
    static /* synthetic */ int ln;
    public static /* synthetic */ WorldPoint ll;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] lllIIIlII;
    public static /* synthetic */ WorldPoint lj;
    public static /* synthetic */ WorldPoint lm;
    public static /* synthetic */ WorldPoint lk;

    private static boolean llIIIIIlIllI(int i, int i2) {
        return i >= i2;
    }

    private static void lIlllllllIlI() {
        lllIIIlIl = new int[198];
        lllIIIlIl[0] = " ".length();
        lllIIIlIl[1] = ((103 ^ 15) ^ (227 ^ 173)) & (((61 ^ 55) ^ (53 ^ 25)) ^ (-" ".length()));
        lllIIIlIl[2] = (-18470) & 23469;
        lllIIIlIl[3] = "  ".length();
        lllIIIlIl[4] = (((77 + 13) - 74) + 118) ^ (((58 + 94) - 61) + 39);
        lllIIIlIl[5] = (-1) & 8007;
        lllIIIlIl[6] = (-((-7171) & 15907)) & (-257) & 28607;
        lllIIIlIl[7] = (-((-1025) & 17410)) & (-7233) & 24569;
        lllIIIlIl[8] = "   ".length();
        lllIIIlIl[9] = (-((-2361) & 16383)) & (-16393) & 30687;
        lllIIIlIl[10] = (21 ^ 85) ^ (32 ^ 106);
        lllIIIlIl[11] = (-23651) & 23922;
        lllIIIlIl[12] = (-19625) & 32249;
        lllIIIlIl[13] = (-((-2291) & 11511)) & (-20481) & 30079;
        lllIIIlIl[14] = 86 ^ 83;
        lllIIIlIl[15] = 75 ^ 121;
        lllIIIlIl[16] = 173 ^ 165;
        lllIIIlIl[17] = 144 ^ 150;
        lllIIIlIl[18] = (((82 + 7) - 45) + 122) ^ (((68 + 139) - 146) + 100);
        lllIIIlIl[19] = (-15458) & 15731;
        lllIIIlIl[20] = 164 ^ 173;
        lllIIIlIl[21] = (-((-3) & 29259)) & (-4) & 32367;
        lllIIIlIl[22] = (-4195) & 7551;
        lllIIIlIl[23] = (193 ^ 173) ^ (53 ^ 82);
        lllIIIlIl[24] = (44 ^ 104) ^ (5 ^ 77);
        lllIIIlIl[25] = 64 ^ 77;
        lllIIIlIl[26] = " ".length() ^ (156 ^ 147);
        lllIIIlIl[27] = (((123 + 96) - 110) + 45) ^ (((24 + 99) - 43) + 69);
        lllIIIlIl[28] = (((98 + 89) - 67) + 60) ^ (((18 + 31) - (-4)) + 111);
        lllIIIlIl[29] = 173 ^ 188;
        lllIIIlIl[30] = 215 ^ 197;
        lllIIIlIl[31] = 113 ^ 98;
        lllIIIlIl[32] = 169 ^ 189;
        lllIIIlIl[33] = (232 ^ 186) ^ (102 ^ 33);
        lllIIIlIl[34] = 40 ^ 62;
        lllIIIlIl[35] = (205 ^ 138) ^ (40 ^ 120);
        lllIIIlIl[36] = (((17 + 125) - 55) + 102) ^ (((94 + 118) - 151) + 104);
        lllIIIlIl[37] = (((38 + 92) - (-17)) + 31) ^ (((91 + 137) - 173) + 116);
        lllIIIlIl[38] = (209 ^ 175) ^ (160 ^ 196);
        lllIIIlIl[39] = (196 ^ 136) ^ (98 ^ 53);
        lllIIIlIl[40] = 176 ^ 172;
        lllIIIlIl[41] = 185 ^ 164;
        lllIIIlIl[42] = (106 ^ 119) ^ "   ".length();
        lllIIIlIl[43] = (-4169) & 7275;
        lllIIIlIl[44] = (-20505) & 23871;
        lllIIIlIl[45] = (-((-1318) & 10039)) & (-4233) & 16319;
        lllIIIlIl[46] = (((16 + 20) - (-27)) + 78) ^ (((61 + 1) - 12) + 96);
        lllIIIlIl[47] = (248 ^ 199) ^ (142 ^ 145);
        lllIIIlIl[48] = 102 ^ 71;
        lllIIIlIl[49] = 43 ^ 9;
        lllIIIlIl[50] = (69 ^ 109) ^ (71 ^ 76);
        lllIIIlIl[51] = (92 ^ 90) ^ (224 ^ 194);
        lllIIIlIl[52] = (((125 + 23) - 101) + 111) ^ (((36 + 181) - 61) + 31);
        lllIIIlIl[53] = 107 ^ 77;
        lllIIIlIl[54] = (-8225) & 11314;
        lllIIIlIl[55] = (-4801) & 8153;
        lllIIIlIl[56] = (93 ^ 47) ^ (109 ^ 56);
        lllIIIlIl[57] = (227 ^ 165) ^ (226 ^ 140);
        lllIIIlIl[58] = 89 ^ 112;
        lllIIIlIl[59] = (43 ^ 97) ^ (226 ^ 130);
        lllIIIlIl[60] = (44 ^ 96) ^ (38 ^ 65);
        lllIIIlIl[61] = (-6446) & 16191;
        lllIIIlIl[62] = (-((-18484) & 31479)) & (-273) & 16383;
        lllIIIlIl[63] = (-((-18701) & 23022)) & (-3) & 14075;
        lllIIIlIl[64] = (-((-11533) & 28446)) & (-8449) & 28471;
        lllIIIlIl[65] = (-4501) & 14261;
        lllIIIlIl[66] = (-((-1569) & 24571)) & (-1) & 32767;
        lllIIIlIl[67] = (-16513) & 19609;
        lllIIIlIl[68] = (-4295) & 7399;
        lllIIIlIl[69] = (-4322) & 14079;
        lllIIIlIl[70] = (-((-17591) & 26623)) & (-129) & 12255;
        lllIIIlIl[71] = (-16729) & 26491;
        lllIIIlIl[72] = (-((-3625) & 16298)) & (-16897) & 32669;
        lllIIIlIl[73] = (-2435) & 12179;
        lllIIIlIl[74] = (-22787) & 24574;
        lllIIIlIl[75] = (-((-24167) & 32615)) & (-4097) & 14335;
        lllIIIlIl[76] = 121 ^ 85;
        lllIIIlIl[77] = 91 ^ 118;
        lllIIIlIl[78] = (82 ^ 10) ^ (53 ^ 67);
        lllIIIlIl[79] = 27 ^ 52;
        lllIIIlIl[80] = (-((-8867) & 31651)) & (-8195) & 32767;
        lllIIIlIl[81] = 128 ^ 176;
        lllIIIlIl[82] = (31 ^ 127) ^ (32 ^ 113);
        lllIIIlIl[83] = (99 ^ 124) ^ (5 ^ 41);
        lllIIIlIl[84] = (-18915) & 28671;
        lllIIIlIl[85] = 18 ^ 38;
        lllIIIlIl[86] = 170 ^ 159;
        lllIIIlIl[87] = 34 ^ 20;
        lllIIIlIl[88] = (91 ^ 62) ^ (15 ^ 93);
        lllIIIlIl[89] = 27 ^ 35;
        lllIIIlIl[90] = 154 ^ 163;
        lllIIIlIl[91] = (-((-29841) & 31985)) & (-16385) & 28287;
        lllIIIlIl[92] = (34 ^ 27) ^ "   ".length();
        lllIIIlIl[93] = (81 ^ 69) ^ (31 ^ 48);
        lllIIIlIl[94] = 29 ^ 33;
        lllIIIlIl[95] = 32 ^ 29;
        lllIIIlIl[96] = (((116 + 79) - 111) + 106) ^ (((19 + 22) - (-28)) + 59);
        lllIIIlIl[97] = (239 ^ 138) ^ (101 ^ 63);
        lllIIIlIl[98] = 231 ^ 167;
        lllIIIlIl[99] = 76 ^ 13;
        lllIIIlIl[100] = (0 ^ 84) ^ (181 ^ 163);
        lllIIIlIl[101] = 206 ^ 141;
        lllIIIlIl[102] = 196 ^ 128;
        lllIIIlIl[103] = (-22591) & 24382;
        lllIIIlIl[104] = (-((-18569) & 31146)) & (-65) & 15743;
        lllIIIlIl[105] = 68 ^ 1;
        lllIIIlIl[106] = (120 ^ 57) ^ (63 ^ 56);
        lllIIIlIl[107] = (9 ^ 39) ^ (67 ^ 42);
        lllIIIlIl[108] = (-((-21537) & 30433)) & (-4353) & 16349;
        lllIIIlIl[109] = (-22730) & 32489;
        lllIIIlIl[110] = (111 ^ 107) ^ (114 ^ 62);
        lllIIIlIl[111] = 60 ^ 117;
        lllIIIlIl[112] = (((127 + 55) - 23) + 71) ^ (((121 + 120) - 117) + 48);
        lllIIIlIl[113] = (-((-8354) & 14583)) & (-16521) & 32511;
        lllIIIlIl[114] = 49 ^ 122;
        lllIIIlIl[115] = 192 ^ 140;
        lllIIIlIl[116] = (14 ^ 88) ^ (169 ^ 178);
        lllIIIlIl[117] = (156 ^ 179) ^ (255 ^ 158);
        lllIIIlIl[118] = (74 ^ 26) ^ (130 ^ 157);
        lllIIIlIl[119] = 253 ^ 173;
        lllIIIlIl[120] = 212 ^ 133;
        lllIIIlIl[121] = (-((-1033) & 23695)) & (-8257) & 32711;
        lllIIIlIl[122] = (70 ^ 103) ^ (109 ^ 30);
        lllIIIlIl[123] = 2 ^ 81;
        lllIIIlIl[124] = (((73 + 102) - 53) + 22) ^ (((117 + 20) - (-24)) + 35);
        lllIIIlIl[125] = (255 ^ 196) ^ (82 ^ 60);
        lllIIIlIl[126] = (-((-1606) & 30279)) & (-2049) & 32511;
        lllIIIlIl[127] = (-21157) & 24255;
        lllIIIlIl[128] = 249 ^ 175;
        lllIIIlIl[129] = 72 ^ 31;
        lllIIIlIl[130] = 36 ^ 124;
        lllIIIlIl[131] = (-((-49) & 4605)) & (-8193) & 15852;
        lllIIIlIl[132] = (248 ^ 170) ^ (139 ^ 128);
        lllIIIlIl[133] = (103 ^ 79) ^ (92 ^ 46);
        lllIIIlIl[134] = 42 ^ 113;
        lllIIIlIl[135] = "   ".length() ^ (248 ^ 167);
        lllIIIlIl[136] = 80 ^ 13;
        lllIIIlIl[137] = (((27 + 126) - 33) + 118) ^ (((153 + 26) - 94) + 91);
        lllIIIlIl[138] = (-8962) & 12067;
        lllIIIlIl[139] = 127 ^ 32;
        lllIIIlIl[140] = (98 ^ 34) ^ (27 ^ 59);
        lllIIIlIl[141] = (((191 + 143) - 234) + 118) ^ (((143 + 39) - 177) + 182);
        lllIIIlIl[142] = (((185 + 174) - 336) + 177) ^ (((135 + 37) - 122) + 120);
        lllIIIlIl[143] = 249 ^ 154;
        lllIIIlIl[144] = 3 ^ 103;
        lllIIIlIl[145] = (153 ^ 158) ^ (95 ^ 61);
        lllIIIlIl[146] = (84 ^ 72) ^ (97 ^ 27);
        lllIIIlIl[147] = 69 ^ 34;
        lllIIIlIl[148] = 251 ^ 147;
        lllIIIlIl[149] = 72 ^ 33;
        lllIIIlIl[150] = (((148 + 98) - 105) + 27) ^ (((94 + 154) - 231) + 177);
        lllIIIlIl[151] = 93 ^ 54;
        lllIIIlIl[152] = (-((-19978) & 24475)) & (-16387) & 30647;
        lllIIIlIl[153] = (((207 + 214) - 354) + 169) ^ (((11 + 56) - (-58)) + 3);
        lllIIIlIl[154] = 231 ^ 138;
        lllIIIlIl[155] = 58 ^ 84;
        lllIIIlIl[156] = 85 ^ 58;
        lllIIIlIl[157] = ((139 + 84) - 119) + 41;
        lllIIIlIl[158] = (69 ^ 40) ^ (24 ^ 5);
        lllIIIlIl[159] = (((152 ^ 144) + (((97 + 107) - 126) + 59)) - (190 ^ 154)) + (87 ^ 119);
        lllIIIlIl[160] = 117 ^ 4;
        lllIIIlIl[161] = (-21377) & 24465;
        lllIIIlIl[162] = (-((-1689) & 20219)) & (-4101) & 32383;
        lllIIIlIl[163] = (223 ^ 136) ^ (2 ^ 39);
        lllIIIlIl[164] = 182 ^ 197;
        lllIIIlIl[165] = (165 ^ 187) ^ (197 ^ 175);
        lllIIIlIl[166] = (203 ^ 184) ^ (89 ^ 95);
        lllIIIlIl[167] = 214 ^ 160;
        lllIIIlIl[168] = (125 ^ 112) ^ (195 ^ 185);
        lllIIIlIl[169] = (61 ^ 39) ^ (208 ^ 178);
        lllIIIlIl[170] = (141 ^ 144) ^ (230 ^ 130);
        lllIIIlIl[171] = 125 ^ 7;
        lllIIIlIl[172] = 26 ^ 97;
        lllIIIlIl[173] = 108 ^ 16;
        lllIIIlIl[174] = 5 ^ 120;
        lllIIIlIl[175] = (-((-9532) & 13759)) & (-19065) & 32511;
        lllIIIlIl[176] = (-16641) & 28620;
        lllIIIlIl[177] = (-((-8365) & 15613)) & (-1) & 32248;
        lllIIIlIl[178] = (-9857) & 10156;
        lllIIIlIl[179] = (-((-10517) & 31167)) & (-2562) & 24511;
        lllIIIlIl[180] = (((69 + 8) - (-6)) + 169) ^ (((106 + 108) - 210) + 126);
        lllIIIlIl[181] = (((39 ^ 101) + (19 ^ 119)) - (54 ^ 95)) + (1 ^ 67);
        lllIIIlIl[182] = ((53 + 19) - (-21)) + 35;
        lllIIIlIl[183] = (((23 ^ 44) + (162 ^ 146)) - (250 ^ 167)) + (125 ^ 14);
        lllIIIlIl[184] = (-((-9649) & 30705)) & (-147) & 24567;
        lllIIIlIl[185] = ((48 + 43) - 54) + 93;
        lllIIIlIl[186] = (((86 ^ 66) + (8 ^ 126)) - (14 ^ 63)) + (68 ^ 110);
        lllIIIlIl[187] = (-8291) & 11619;
        lllIIIlIl[188] = (-((-2709) & 15029)) & (-577) & 15983;
        lllIIIlIl[189] = (-(((0 + 78) - 53) + 123)) & (-4609) & 8115;
        lllIIIlIl[190] = (-((-26713) & 27259)) & (-12501) & 16382;
        lllIIIlIl[191] = (-((-8449) & 12649)) & (-641) & 7934;
        lllIIIlIl[192] = (-(211 ^ 178)) & (-12289) & 15743;
        lllIIIlIl[193] = ((11 + 89) - 55) + 87;
        lllIIIlIl[194] = ((79 + 98) - 151) + 107;
        lllIIIlIl[195] = (((229 ^ 164) + (142 ^ 128)) - (85 ^ 21)) + (65 ^ 54);
        lllIIIlIl[196] = (-17) & 9759;
        lllIIIlIl[197] = ((21 + 114) - 20) + 20;
    }

    private static String lIllllllIllI(String llllIllIlIIlI, String llllIllIlIIIl) {
        try {
            SecretKeySpec llllIllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIlIl[3], llllIllIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIllIlIIll) {
            llllIllIlIIll.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            de();
            "".length();
            if ("  ".length() > (66 ^ 70)) {
                return (80 ^ 111) & ((191 ^ 128) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIIIlIl[144];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIIIlII[lllIIIlIl[180]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    static boolean df() {
        if (lIlllllllllI(Vars.getBit(lllIIIlIl[74])) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[103])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[121]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[126]), lllIIIlIl[0])) {
            ?? r0 = lllIIIlIl[0];
            "".length();
            return (-((247 ^ 154) ^ (41 ^ 64))) >= 0 ? ((((38 + 112) - 69) + 100) ^ (((44 + 51) - 54) + 143)) & (((((67 + 141) - 204) + 166) ^ (((71 + 117) - 75) + 54)) ^ (-" ".length())) : r0;
        }
        return lllIIIlIl[1];
    }

    private static boolean llIIIIIIIIIl(int i) {
        return i < 0;
    }

    private static void lIlllllllIIl() {
        lllIIIlII = new String[lllIIIlIl[197]];
        lllIIIlII[lllIIIlIl[1]] = lIllllllIlIl("FTwoHTQ7MCJUJSYsLxogczwyESogeWYHMDohJRwuPTJmFiYwPmYAKHMkMxE0Jw==", "SUFtG");
        lllIIIlII[lllIIIlIl[0]] = lIllllllIllI("00TMypeoZpfXJp3y8VQGXw==", "syHKn");
        lllIIIlII[lllIIIlIl[3]] = lIllllllIllI("BO1RTd1I0KesvqTPts/8oRnCFYzo7lMS", "FlvyC");
        lllIIIlII[lllIIIlIl[8]] = lIlllllllIII("Uf+mnoT0ryEm1KC9ZWYKFlAJxRkZA+wyU8cKdGYEOrQqHa0ztFThcnaCIq588GsvyGi8qB4btpM=", "fxJiA");
        lllIIIlII[lllIIIlIl[4]] = lIllllllIlIl("KiUaDyA=", "nWsaK");
        lllIIIlII[lllIIIlIl[14]] = lIllllllIlIl("LDAA", "iQtdm");
        lllIIIlII[lllIIIlIl[17]] = lIlllllllIII("I6X6blukAdqAiSc5k+grFw==", "YmcVO");
        lllIIIlII[lllIIIlIl[18]] = lIllllllIlIl("GhAECxFpFRAcFj0=", "Ideye");
        lllIIIlII[lllIIIlIl[16]] = lIlllllllIII("TtiBL4Yabx0Yx0MZOSOUdA==", "cJdGB");
        lllIIIlII[lllIIIlIl[20]] = lIlllllllIII("N57taWsh4/s=", "kgeKz");
        lllIIIlII[lllIIIlIl[10]] = lIllllllIlIl("LSAdQyEMYQ0KJgthDQw6Bw==", "cAkcU");
        lllIIIlII[lllIIIlIl[23]] = lIlllllllIII("Bag8YNxuj9Q7PrXEaTdQzu7Zad3x4Xjo", "kLYuo");
        lllIIIlII[lllIIIlIl[24]] = lIllllllIlIl("PRkfOQQOWBI/BQ0=", "ixtPj");
        lllIIIlII[lllIIIlIl[25]] = lIllllllIlIl("BgQGKg==", "RemOb");
        lllIIIlII[lllIIIlIl[26]] = lIllllllIlIl("IS0KDh8LbBEIGB8jD0cXBT8JRxcDIwU=", "lLagq");
        lllIIIlII[lllIIIlIl[27]] = lIlllllllIII("SSOHLQMO40s=", "zSSZp");
        lllIIIlII[lllIIIlIl[28]] = lIllllllIlIl("AC8lZychbjAoPj4hIDM=", "NNSGS");
        lllIIIlII[lllIIIlIl[29]] = lIllllllIlIl("CDMmMCoiPQ==", "LZAWC");
        lllIIIlII[lllIIIlIl[30]] = lIllllllIllI("2FM/N4dU6gtvsgMsUuuB9g==", "ZgQlj");
        lllIIIlII[lllIIIlIl[31]] = lIlllllllIII("12PXTiE+4pY=", "KGNxu");
        lllIIIlII[lllIIIlIl[32]] = lIllllllIlIl("JAkW", "oloHN");
        lllIIIlII[lllIIIlIl[33]] = lIllllllIllI("BEL8rnNWD27WhPLt1CTHJw==", "gmZxE");
        lllIIIlII[lllIIIlIl[34]] = lIllllllIllI("d471X2iLMWIocO/n4pF4RA==", "brEfD");
        lllIIIlII[lllIIIlIl[35]] = lIlllllllIII("zkceQIQ8Izs=", "vyXfR");
        lllIIIlII[lllIIIlIl[36]] = lIlllllllIII("+Km+5T+oGOYfKki++8/4pA==", "PUWHJ");
        lllIIIlII[lllIIIlIl[37]] = lIllllllIlIl("DRweLgUkHko9GSseDw==", "JyjZl");
        lllIIIlII[lllIIIlIl[38]] = lIllllllIllI("QXzo0wkhk3DcAjkkOCCojw==", "yMkoy");
        lllIIIlII[lllIIIlIl[39]] = lIllllllIllI("D8FH0rB+9xk=", "zpfEK");
        lllIIIlII[lllIIIlIl[40]] = lIlllllllIII("GVk2vIW5Sik=", "pQPmN");
        lllIIIlII[lllIIIlIl[41]] = lIlllllllIII("6QCWeyH0/Uv0CgZ8GjKdIQ==", "ebfnN");
        lllIIIlII[lllIIIlIl[42]] = lIllllllIllI("LhdmuNUBApwQ2XGswlSNAQ==", "Wodeh");
        lllIIIlII[lllIIIlIl[46]] = lIllllllIlIl("FisReDc3agM3LCo=", "XJgXC");
        lllIIIlII[lllIIIlIl[47]] = lIlllllllIII("Q4QUH4tun3o=", "LldKr");
        lllIIIlII[lllIIIlIl[48]] = lIllllllIlIl("PxY0CQ==", "pfQgA");
        lllIIIlII[lllIIIlIl[49]] = lIllllllIllI("VEqc7gUkwBH09+U3MIDr3A==", "RQaFq");
        lllIIIlII[lllIIIlIl[50]] = lIllllllIlIl("MAcWKDYQUgA/MQc=", "brtJS");
        lllIIIlII[lllIIIlIl[51]] = lIllllllIlIl("HzkDLw==", "KXhJs");
        lllIIIlII[lllIIIlIl[52]] = lIlllllllIII("OT7yAhTfPUTB7Zu8qXQuzQ==", "QVCJy");
        lllIIIlII[lllIIIlIl[53]] = lIlllllllIII("NItqJ9IuIzg=", "PmZfe");
        lllIIIlII[lllIIIlIl[56]] = lIlllllllIII("T/axvALyjeE=", "gLfie");
        lllIIIlII[lllIIIlIl[57]] = lIllllllIlIl("ACYzBg==", "OVVhh");
        lllIIIlII[lllIIIlIl[58]] = lIllllllIlIl("PhUwTzAfVCAGKhEYZh0rHxk=", "ptFoD");
        lllIIIlII[lllIIIlIl[59]] = lIllllllIlIl("PSwGMiwD", "qMbVI");
        lllIIIlII[lllIIIlIl[60]] = lIlllllllIII("g69Av5mBUlxAXqae+x7XAQ==", "pubSn");
        lllIIIlII[lllIIIlIl[76]] = lIllllllIlIl("IgskchgDSjM=", "ljRRl");
        lllIIIlII[lllIIIlIl[77]] = lIllllllIlIl("AS07JUM9PSEsEQ==", "QXWIc");
        lllIIIlII[lllIIIlIl[78]] = lIlllllllIII("LRNh7ieOw0o=", "tydcP");
        lllIIIlII[lllIIIlIl[79]] = lIlllllllIII("59btP9ZgTDU=", "DnyIG");
        lllIIIlII[lllIIIlIl[81]] = lIlllllllIII("sWLWYEqTWSgnI/QYOvh26A==", "opqnp");
        lllIIIlII[lllIIIlIl[82]] = lIllllllIllI("CZJg5AHdqhE5TLN47xQBPA==", "oEMFq");
        lllIIIlII[lllIIIlIl[15]] = lIlllllllIII("7aTChEA4b5M=", "bskab");
        lllIIIlII[lllIIIlIl[83]] = lIllllllIllI("LeBJbL6jPII=", "JLQXc");
        lllIIIlII[lllIIIlIl[85]] = lIllllllIllI("Wfvxd5BgNLh2llkRq434jQ==", "pGZDj");
        lllIIIlII[lllIIIlIl[86]] = lIlllllllIII("Kg5bbMCGggw=", "pnZCZ");
        lllIIIlII[lllIIIlIl[87]] = lIllllllIllI("LqF63o/8ZXw=", "HcIOm");
        lllIIIlII[lllIIIlIl[88]] = lIllllllIlIl("KhoZI2EWCgMqMw==", "zouOA");
        lllIIIlII[lllIIIlIl[89]] = lIllllllIllI("ZG2eWUI7w8o=", "yemRh");
        lllIIIlII[lllIIIlIl[90]] = lIlllllllIII("FWtu0O1I3lo=", "bgYAP");
        lllIIIlII[lllIIIlIl[92]] = lIlllllllIII("23k7BryyT6sJqvVUCBXFBA==", "nVsdL");
        lllIIIlII[lllIIIlIl[93]] = lIlllllllIII("fpai4V147UI=", "YkiVF");
        lllIIIlII[lllIIIlIl[94]] = lIllllllIllI("PdF0pUXoAF0=", "seoBw");
        lllIIIlII[lllIIIlIl[95]] = lIllllllIllI("lUxRBoHOxIWpPbtkt6qbAg==", "PCyVx");
        lllIIIlII[lllIIIlIl[96]] = lIllllllIlIl("Aj4VPHI+Lg81IA==", "RKyPR");
        lllIIIlII[lllIIIlIl[97]] = lIlllllllIII("qbF1qfiSj+s=", "xwOTJ");
        lllIIIlII[lllIIIlIl[98]] = lIllllllIlIl("PzkfGg==", "oLsvP");
        lllIIIlII[lllIIIlIl[99]] = lIllllllIlIl("PQ8CdSUcThU=", "sntUQ");
        lllIIIlII[lllIIIlIl[100]] = lIlllllllIII("8oBkILAeGi5LR8NPCEuz3w==", "COnTU");
        lllIIIlII[lllIIIlIl[101]] = lIllllllIllI("IIa1QKuouhQ=", "zmPFs");
        lllIIIlII[lllIIIlIl[102]] = lIllllllIllI("HPXDF/sAaLo=", "Hgbuw");
        lllIIIlII[lllIIIlIl[105]] = lIllllllIlIl("HQARMU0kAEcwAj8d", "PogTm");
        lllIIIlII[lllIIIlIl[106]] = lIlllllllIII("98d0zJh0DlU=", "RIwwK");
        lllIIIlII[lllIIIlIl[107]] = lIlllllllIII("d/xwSC2vriQ=", "ausNc");
        lllIIIlII[lllIIIlIl[110]] = lIllllllIllI("SXZlNMh4g+jH29FXJ3a5xw==", "mbBRX");
        lllIIIlII[lllIIIlIl[111]] = lIlllllllIII("zQNf3eTunQM=", "cTUlM");
        lllIIIlII[lllIIIlIl[112]] = lIllllllIlIl("OQMzHQ==", "vsVsp");
        lllIIIlII[lllIIIlIl[114]] = lIllllllIlIl("LAoYKU4VCk4oAQ4X", "aenLn");
        lllIIIlII[lllIIIlIl[115]] = lIllllllIllI("Lk5lckGEYJg=", "eolFc");
        lllIIIlII[lllIIIlIl[116]] = lIlllllllIII("ZxhDzI/B03A=", "ktxSk");
        lllIIIlII[lllIIIlIl[117]] = lIllllllIlIl("IS4CdRgAbxE=", "oOtUl");
        lllIIIlII[lllIIIlIl[118]] = lIllllllIlIl("EhY9OWouBicwOA==", "BcQUJ");
        lllIIIlII[lllIIIlIl[119]] = lIlllllllIII("XOKASfWyCcI=", "aMoio");
        lllIIIlII[lllIIIlIl[120]] = lIllllllIlIl("PwAWFQ==", "ouzyV");
        lllIIIlII[lllIIIlIl[122]] = lIlllllllIII("X8CIhHtrpKZmZZ09cJN+PA==", "HZrvc");
        lllIIIlII[lllIIIlIl[123]] = lIlllllllIII("opucxM5cHXbxB9VT5z3HKA==", "vcssA");
        lllIIIlII[lllIIIlIl[124]] = lIllllllIllI("y1SHRR8TQRs=", "amQQU");
        lllIIIlII[lllIIIlIl[125]] = lIllllllIlIl("CiweCg==", "ZYrfc");
        lllIIIlII[lllIIIlIl[128]] = lIlllllllIII("UEp+lfs2bkriavqSL02X1Q==", "zupKr");
        lllIIIlII[lllIIIlIl[129]] = lIllllllIllI("q8FfTEGb/mI=", "ndJHm");
        lllIIIlII[lllIIIlIl[130]] = lIllllllIllI("e/mIQMlYdVM=", "qfyLE");
        lllIIIlII[lllIIIlIl[132]] = lIllllllIllI("mfLvFxMtJ0OzKcmtT5/pbw==", "tFEfh");
        lllIIIlII[lllIIIlIl[133]] = lIlllllllIII("ZQ5+hRT+Mp4=", "FsmDX");
        lllIIIlII[lllIIIlIl[134]] = lIlllllllIII("L/Okb8Igm2Q=", "QAExZ");
        lllIIIlII[lllIIIlIl[135]] = lIlllllllIII("ZT2jVCALsVwz2LYLNuCBVA==", "nINDm");
        lllIIIlII[lllIIIlIl[136]] = lIllllllIllI("1nK6Lti0ykw=", "HSHZi");
        lllIIIlII[lllIIIlIl[137]] = lIlllllllIII("rW95od+ZcTo=", "npcAp");
        lllIIIlII[lllIIIlIl[139]] = lIllllllIllI("3XTPWIwTNUmHgZwJ+TzB0Q==", "oMYuS");
        lllIIIlII[lllIIIlIl[140]] = lIlllllllIII("9lbsi+Y/DZM=", "TmnYj");
        lllIIIlII[lllIIIlIl[141]] = lIllllllIllI("aNbHLaHvZ1Q=", "euHdU");
        lllIIIlII[lllIIIlIl[142]] = lIllllllIllI("IU3+qIfoRm+uvtJMu/c3Sg==", "kakLa");
        lllIIIlII[lllIIIlIl[143]] = lIllllllIlIl("ETUHIw==", "UZhQp");
        lllIIIlII[lllIIIlIl[144]] = lIllllllIllI("RSxsxXFc5DA=", "XBXFM");
        lllIIIlII[lllIIIlIl[145]] = lIlllllllIII("lzpEop9QeQGqXBHC7hn4vg==", "UhFnY");
        lllIIIlII[lllIIIlIl[146]] = lIllllllIlIl("FBM7HnMoAyEXIQ==", "DfWrS");
        lllIIIlII[lllIIIlIl[147]] = lIllllllIllI("iVax6LffX3Y=", "wcoLx");
        lllIIIlII[lllIIIlIl[148]] = lIlllllllIII("SQsHlnB2x8I=", "eNNzv");
        lllIIIlII[lllIIIlIl[149]] = lIllllllIllI("3yuXx5kFQS33oBKIkhsnfQ==", "uZlJx");
        lllIIIlII[lllIIIlIl[150]] = lIllllllIlIl("HgMqJw==", "ZlEUn");
        lllIIIlII[lllIIIlIl[151]] = lIllllllIllI("luz7AS1PVVA=", "GAzsF");
        lllIIIlII[lllIIIlIl[153]] = lIllllllIlIl("LA4sP3IVDno+PQ4T", "aaZZR");
        lllIIIlII[lllIIIlIl[154]] = lIllllllIlIl("EQIbPA==", "UmtNR");
        lllIIIlII[lllIIIlIl[155]] = lIlllllllIII("0iNvRPuWqGc=", "ayxvQ");
        lllIIIlII[lllIIIlIl[156]] = lIllllllIllI("wC5c4gswA7CjrBptPooAjQ==", "LSMLN");
        lllIIIlII[lllIIIlIl[158]] = lIllllllIllI("vu29BAQNvQM=", "EMhTb");
        lllIIIlII[lllIIIlIl[160]] = lIllllllIllI("YysF+pKTJcs=", "nGraB");
        lllIIIlII[lllIIIlIl[163]] = lIllllllIllI("hIYQf7OX9S0=", "YIoKP");
        lllIIIlII[lllIIIlIl[164]] = lIllllllIlIl("GQcidDQ3AA==", "VnNTW");
        lllIIIlII[lllIIIlIl[165]] = lIllllllIllI("5pO0uzAzJ5Q=", "uZeJM");
        lllIIIlII[lllIIIlIl[166]] = lIllllllIlIl("FgIAKi02VxY9KiE=", "DwbHH");
        lllIIIlII[lllIIIlIl[167]] = lIllllllIlIl("NSYpYjIbIQ==", "zOEBQ");
        lllIIIlII[lllIIIlIl[168]] = lIllllllIllI("T1QsvruEHRI=", "sQLkm");
        lllIIIlII[lllIIIlIl[169]] = lIlllllllIII("SLxxqx6sQHHVFpxkhFxsW+HqRMDMMu+2", "DDrTd");
        lllIIIlII[lllIIIlIl[170]] = lIlllllllIII("49epq0xxiRg=", "EKLSi");
        lllIIIlII[lllIIIlIl[171]] = lIlllllllIII("eiAjSYIO3S8pnSNgX2vr8koyybO+jvqS", "hkMns");
        lllIIIlII[lllIIIlIl[172]] = lIllllllIllI("rlnxu9sEqgPIgI4nrsI0SwuQl/9QEkd6", "AUrDR");
        lllIIIlII[lllIIIlIl[173]] = lIllllllIllI("XKokopnoV30=", "BqXyj");
        lllIIIlII[lllIIIlIl[174]] = lIlllllllIII("XFfe7unhPyfUE2JbS71XeIOyv1DUVSQ9", "JiMma");
        lllIIIlII[lllIIIlIl[180]] = lIllllllIlIl("CSEfPzI4cwUyJGwQGTMiJzYf", "LSqZA");
        lllIIIlII[lllIIIlIl[181]] = lIllllllIlIl("NQUXHnYoClkOMyYADRF2bw==", "GlyyV");
        lllIIIlII[lllIIIlIl[182]] = lIlllllllIII("tD8GGi/anwU=", "BoHwW");
        lllIIIlII[lllIIIlIl[183]] = lIlllllllIII("Rxuo3A9UFk8=", "uQnlS");
        lllIIIlII[lllIIIlIl[185]] = lIllllllIlIl("KwEWHg==", "onylb");
        lllIIIlII[lllIIIlIl[186]] = lIllllllIllI("lT8695tfkzs=", "ESONz");
        lllIIIlII[lllIIIlIl[193]] = lIllllllIllI("kDMUEk42Xew=", "axxEw");
        lllIIIlII[lllIIIlIl[194]] = lIlllllllIII("LFHZ8hRBib+fVBHUtSUhkhQSzt8xzyCGTyXIpJSSkSfHulkTuS6PPA==", "hArwp");
        lllIIIlII[lllIIIlIl[195]] = lIllllllIlIl("Bm4+RD0jKDdEDCo7PAozLChzADMrJ3QQei4qJxE7IyUqRD0qPXMBNCgoNAE+bz08RDtvKjsNOSQsPUo=", "OISdZ");
    }

    private static boolean llIIIIIIIlII(int i, int i2) {
        return i == i2;
    }

    private static int lIlllllllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIIIlIl[1];
    }

    private static boolean llIIIIIIIlIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0514, code lost:
        if (lIllllllllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L399;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1210, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1232, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void de() {
        if (lIllllllllII(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lIllllllllIl(bx.size(), lllIIIlIl[0])) {
                System.out.println(lllIIIlII[lllIIIlIl[1]]);
                bv = lllIIIlIl[1];
            }
        }
        if (lIlllllllllI(bv ? 1 : 0)) {
            if (lIlllllllllI(an() ? 1 : 0) && lIllllllllIl(C0004e.j(ln), lllIIIlIl[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllllllllll(nearest) && lIlllllllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[0]];
                    C0000a.a(nearest);
                }
                if (lIllllllllll(nearest) && lIllllllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlllllllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIlIl[2]);
                        "".length();
                    }
                    if (lIllllllllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[3]];
                        if (llIIIIIIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIlIl[4]);
                            "".length();
                        }
                        if (llIIIIIIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIlIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIIlIl[4]];
                        iArr[lllIIIlIl[1]] = lllIIIlIl[5];
                        iArr[lllIIIlIl[0]] = lllIIIlIl[6];
                        iArr[lllIIIlIl[3]] = lllIIIlIl[7];
                        iArr[lllIIIlIl[8]] = lllIIIlIl[9];
                        if (lIlllllllllI(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIlII[lllIIIlIl[8]]);
                            bv = lllIIIlIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lllIIIlIl[4]];
                        iArr2[lllIIIlIl[1]] = lllIIIlIl[5];
                        iArr2[lllIIIlIl[0]] = lllIIIlIl[6];
                        iArr2[lllIIIlIl[3]] = lllIIIlIl[7];
                        iArr2[lllIIIlIl[8]] = lllIIIlIl[9];
                        if (lIllllllllII(C0004e.d(iArr2) ? 1 : 0)) {
                            C0000a.a(lllIIIlIl[5], lllIIIlIl[10]);
                            C0000a.a(lllIIIlIl[6], lllIIIlIl[10]);
                            C0000a.a(lllIIIlIl[7], lllIIIlIl[0]);
                            C0000a.a(lllIIIlIl[11], lllIIIlIl[0]);
                            C0000a.a(lllIIIlIl[9], lllIIIlIl[0]);
                            C0000a.a(lllIIIlIl[12], lllIIIlIl[0]);
                            C0000a.a(lllIIIlIl[13], lllIIIlIl[14]);
                        }
                    }
                }
            }
            if (lIllllllllII(Inventory.contains(C0005f.bc) ? 1 : 0) && lIllllllllIl(Movement.getRunEnergy(), lllIIIlIl[15])) {
                Inventory.getFirst(C0005f.bc).interact(lllIIIlII[lllIIIlIl[4]]);
                Time.sleepTicks(lllIIIlIl[0]);
                "".length();
            }
            int[] iArr3 = new int[lllIIIlIl[0]];
            iArr3[lllIIIlIl[1]] = lllIIIlIl[13];
            if (lIllllllllII(Inventory.contains(iArr3) ? 1 : 0) && llIIIIIIIIIl(lIlllllllIll(C0004e.w(), 50.0d))) {
                int[] iArr4 = new int[lllIIIlIl[0]];
                iArr4[lllIIIlIl[1]] = lllIIIlIl[13];
                Inventory.getFirst(iArr4).interact(lllIIIlII[lllIIIlIl[14]]);
                Time.sleepTicks(lllIIIlIl[3]);
                "".length();
            }
            if (lIllllllllII(an() ? 1 : 0) && lIlllllllllI(C0004e.j(ln))) {
                if (llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIlIl[16])) {
                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[17]];
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(lllIIIlIl[0]);
                    "".length();
                }
                if (llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIlIl[16])) {
                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[18]];
                    if (lIllllllllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0006g.a(lllIIIlII[lllIIIlIl[16]], cG);
                }
            }
            if (llIIIIIIIlII(C0004e.j(ln), lllIIIlIl[0])) {
                dk = lllIIIlIl[1];
                int[] iArr5 = new int[lllIIIlIl[0]];
                iArr5[lllIIIlIl[1]] = lllIIIlIl[11];
                if (lIlllllllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIIIlIl[0]];
                    iArr6[lllIIIlIl[1]] = lllIIIlIl[19];
                    if (lIlllllllllI(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr = new String[lllIIIlIl[0]];
                        strArr[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[20]];
                        if (lIlllllllllI(Inventory.contains(strArr) ? 1 : 0)) {
                            WorldPoint worldPoint = new WorldPoint(lllIIIlIl[21], lllIIIlIl[22], lllIIIlIl[0]);
                            int[] iArr7 = new int[lllIIIlIl[0]];
                            iArr7[lllIIIlIl[1]] = lllIIIlIl[11];
                            if (lIlllllllllI(Inventory.contains(iArr7) ? 1 : 0)) {
                                if (llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIIlIl[14])) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[10]];
                                    Movement.walkTo(worldPoint);
                                    "".length();
                                    Time.sleepTicks(lllIIIlIl[0]);
                                    "".length();
                                }
                                if (llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIIlIl[14])) {
                                    int[] iArr8 = new int[lllIIIlIl[0]];
                                    iArr8[lllIIIlIl[1]] = lllIIIlIl[11];
                                    TileItem nearest2 = TileItems.getNearest(iArr8);
                                    if (lIllllllllll(nearest2)) {
                                        if (lIlllllllllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[23]];
                                            Movement.walkTo(nearest2.getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lllIIIlIl[0]);
                                            "".length();
                                        }
                                        if (lIllllllllII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[24]];
                                            nearest2.interact(lllIIIlII[lllIIIlIl[25]]);
                                            Time.sleepTicks(lllIIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lllIIIlIl[0]];
                iArr9[lllIIIlIl[1]] = lllIIIlIl[11];
                if (lIlllllllllI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIIIlIl[0]];
                    iArr10[lllIIIlIl[1]] = lllIIIlIl[19];
                }
                int[] iArr11 = new int[lllIIIlIl[0]];
                iArr11[lllIIIlIl[1]] = lllIIIlIl[19];
                if (lIlllllllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIIIlIl[0]];
                    iArr12[lllIIIlIl[1]] = lllIIIlIl[11];
                    if (lIllllllllII(Inventory.contains(iArr12) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[26]];
                        int[] iArr13 = new int[lllIIIlIl[0]];
                        iArr13[lllIIIlIl[1]] = lllIIIlIl[11];
                        Item first = Inventory.getFirst(iArr13);
                        int[] iArr14 = new int[lllIIIlIl[0]];
                        iArr14[lllIIIlIl[1]] = lllIIIlIl[9];
                        first.useOn(Inventory.getFirst(iArr14));
                        Time.sleepTicks(lllIIIlIl[0]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[lllIIIlIl[0]];
                iArr15[lllIIIlIl[1]] = lllIIIlIl[19];
                if (lIllllllllII(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIlIl[0]];
                    strArr2[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[27]];
                    if (lIlllllllllI(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lj), lllIIIlIl[4])) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[28]];
                            Movement.walkTo(lj);
                            "".length();
                            Time.sleepTicks(lllIIIlIl[0]);
                            "".length();
                        }
                        if (llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lj), lllIIIlIl[4])) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[29]];
                            String[] strArr3 = new String[lllIIIlIl[0]];
                            strArr3[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[30]];
                            TileObjects.getNearest(strArr3).interact(lllIIIlII[lllIIIlIl[31]]);
                            Time.sleepTicks(lllIIIlIl[20]);
                            "".length();
                        }
                    }
                    String[] strArr4 = new String[lllIIIlIl[0]];
                    strArr4[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[32]];
                    if (lIllllllllII(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lk), lllIIIlIl[8])) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[33]];
                            Movement.walkTo(lk);
                            "".length();
                            Time.sleepTicks(lllIIIlIl[0]);
                            "".length();
                        }
                        if (llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lk), lllIIIlIl[8])) {
                            int[] iArr16 = new int[lllIIIlIl[0]];
                            iArr16[lllIIIlIl[1]] = lllIIIlIl[19];
                            Item first2 = Inventory.getFirst(iArr16);
                            String[] strArr5 = new String[lllIIIlIl[0]];
                            strArr5[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[34]];
                            first2.useOn(TileObjects.getNearest(strArr5));
                            Time.sleepTicks(lllIIIlIl[0]);
                            "".length();
                        }
                    }
                }
                String[] strArr6 = new String[lllIIIlIl[0]];
                strArr6[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[35]];
                if (lIllllllllII(Inventory.contains(strArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lllIIIlIl[0]];
                    iArr17[lllIIIlIl[1]] = lllIIIlIl[19];
                    if (lIlllllllllI(Inventory.contains(iArr17) ? 1 : 0)) {
                        String[] strArr7 = new String[lllIIIlIl[0]];
                        strArr7[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[36]];
                        if (lIlllllllllI(Inventory.contains(strArr7) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[37]];
                            if (lIlllllllllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr8 = new String[lllIIIlIl[0]];
                                strArr8[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[38]];
                                TileObjects.getNearest(strArr8).interact(lllIIIlII[lllIIIlIl[39]]);
                                Time.sleepTicks(lllIIIlIl[4]);
                                "".length();
                            }
                            C0006g.a(cG);
                        }
                    }
                }
                String[] strArr9 = new String[lllIIIlIl[0]];
                strArr9[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[40]];
                if (lIllllllllII(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lllIIIlIl[0]];
                    strArr10[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[41]];
                    if (lIllllllllII(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lllIIIlIl[0]];
                        strArr11[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[42]];
                        if (lIlllllllllI(Inventory.contains(strArr11) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lllIIIlIl[43], lllIIIlIl[44], lllIIIlIl[1]);
                            WorldPoint worldPoint3 = new WorldPoint(lllIIIlIl[21], lllIIIlIl[44], lllIIIlIl[1]);
                            WorldArea worldArea = new WorldArea(lllIIIlIl[21], lllIIIlIl[45], lllIIIlIl[14], lllIIIlIl[8], lllIIIlIl[1]);
                            if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && lIlllllllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[46]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lllIIIlIl[0]);
                                "".length();
                            }
                            if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                String[] strArr12 = new String[lllIIIlIl[0]];
                                strArr12[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[47]];
                                TileObjects.getNearest(strArr12).interact(lllIIIlII[lllIIIlIl[48]]);
                                Time.sleepTicks(lllIIIlIl[3]);
                                "".length();
                            }
                            if (lIllllllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[49]];
                                String[] strArr13 = new String[lllIIIlIl[0]];
                                strArr13[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[50]];
                                TileItems.getNearest(strArr13).interact(lllIIIlII[lllIIIlIl[51]]);
                                Time.sleepTicks(lllIIIlIl[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr14 = new String[lllIIIlIl[0]];
                strArr14[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[52]];
                if (lIllllllllII(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lllIIIlIl[0]];
                    strArr15[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[53]];
                    if (lIlllllllllI(Inventory.contains(strArr15) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lllIIIlIl[21], lllIIIlIl[45], lllIIIlIl[14], lllIIIlIl[8], lllIIIlIl[1]);
                        WorldArea worldArea3 = new WorldArea(lllIIIlIl[54], lllIIIlIl[55], lllIIIlIl[18], lllIIIlIl[23], lllIIIlIl[1]);
                        if (lIllllllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[lllIIIlIl[0]];
                            strArr16[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[56]];
                            TileObjects.getNearest(strArr16).interact(lllIIIlII[lllIIIlIl[57]]);
                            Time.sleepTicks(lllIIIlIl[3]);
                            "".length();
                        }
                        if (lIlllllllllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllllllllI(lo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[58]];
                            Movement.walkTo(ll);
                            "".length();
                            Time.sleepTicks(lllIIIlIl[0]);
                            "".length();
                        }
                        if (lIllllllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr17 = new String[lllIIIlIl[0]];
                            strArr17[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[59]];
                            TileObjects.getNearest(strArr17).interact(lllIIIlII[lllIIIlIl[60]]);
                            Time.sleepTicks(lllIIIlIl[4]);
                            "".length();
                        }
                        if (lIllllllllII(lo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint4 = new WorldPoint(lllIIIlIl[21], lllIIIlIl[61], lllIIIlIl[1]);
                            WorldPoint worldPoint5 = new WorldPoint(lllIIIlIl[62], lllIIIlIl[63], lllIIIlIl[1]);
                            new WorldPoint(lllIIIlIl[64], lllIIIlIl[65], lllIIIlIl[1]);
                            new WorldPoint(lllIIIlIl[43], lllIIIlIl[66], lllIIIlIl[1]);
                            WorldPoint worldPoint6 = new WorldPoint(lllIIIlIl[67], lllIIIlIl[66], lllIIIlIl[1]);
                            WorldPoint worldPoint7 = new WorldPoint(lllIIIlIl[67], lllIIIlIl[66], lllIIIlIl[1]);
                            WorldArea worldArea4 = new WorldArea(lllIIIlIl[68], lllIIIlIl[69], lllIIIlIl[20], lllIIIlIl[23], lllIIIlIl[1]);
                            WorldArea worldArea5 = new WorldArea(lllIIIlIl[70], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[17], lllIIIlIl[1]);
                            WorldArea worldArea6 = new WorldArea(lllIIIlIl[72], lllIIIlIl[73], lllIIIlIl[32], lllIIIlIl[25], lllIIIlIl[1]);
                            if (llIIIIIIIlIl(Vars.getBit(lllIIIlIl[74]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[75]))) {
                                if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[76]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lllIIIlIl[0]);
                                    "".length();
                                }
                                if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[77]];
                                    String[] strArr18 = new String[lllIIIlIl[0]];
                                    strArr18[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[78]];
                                    TileObjects.getNearest(strArr18).interact(lllIIIlII[lllIIIlIl[79]]);
                                    Time.sleepTicks(lllIIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIIIIIIIlII(Vars.getBit(lllIIIlIl[74]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && lIlllllllllI(Vars.getBit(lllIIIlIl[75]))) {
                                if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[81]];
                                    Movement.walkTo(worldPoint5);
                                    "".length();
                                    Time.sleepTicks(lllIIIlIl[0]);
                                    "".length();
                                }
                                if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[82]];
                                    String[] strArr19 = new String[lllIIIlIl[0]];
                                    strArr19[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[15]];
                                    TileObjects.getNearest(strArr19).interact(lllIIIlII[lllIIIlIl[83]]);
                                    Time.sleepTicks(lllIIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIIIIIIIlII(Vars.getBit(lllIIIlIl[74]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[80]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[75]))) {
                                if (lIlllllllllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint8 = new WorldPoint(lllIIIlIl[21], lllIIIlIl[84], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[85]];
                                        Movement.walkTo(worldPoint8);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        String[] strArr20 = new String[lllIIIlIl[0]];
                                        strArr20[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[86]];
                                        TileObjects.getNearest(strArr20).interact(lllIIIlII[lllIIIlIl[87]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIllllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[88]];
                                    String[] strArr21 = new String[lllIIIlIl[0]];
                                    strArr21[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[89]];
                                    TileObjects.getNearest(strArr21).interact(lllIIIlII[lllIIIlIl[90]]);
                                    Time.sleepTicks(lllIIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (llIIIIIIIlII(Vars.getBit(lllIIIlIl[74]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[80]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0])) {
                                if (lIllllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint9 = new WorldPoint(lllIIIlIl[21], lllIIIlIl[91], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[92]];
                                        Movement.walkTo(worldPoint9);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        String[] strArr22 = new String[lllIIIlIl[0]];
                                        strArr22[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[93]];
                                        TileObjects.getNearest(strArr22).interact(lllIIIlII[lllIIIlIl[94]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIlllllllllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[95]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[96]];
                                        String[] strArr23 = new String[lllIIIlIl[0]];
                                        strArr23[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[97]];
                                        TileObjects.getNearest(strArr23).interact(lllIIIlII[lllIIIlIl[98]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (llIIIIIIIlII(Vars.getBit(lllIIIlIl[74]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0])) {
                                if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[99]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lllIIIlIl[0]);
                                    "".length();
                                }
                                if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[100]];
                                    String[] strArr24 = new String[lllIIIlIl[0]];
                                    strArr24[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[101]];
                                    TileObjects.getNearest(strArr24).interact(lllIIIlII[lllIIIlIl[102]]);
                                    Time.sleepTicks(lllIIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (lIlllllllllI(Vars.getBit(lllIIIlIl[74])) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[103])) && lIlllllllllI(df() ? 1 : 0)) {
                                if (lIlllllllllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIllllllllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint10 = new WorldPoint(lllIIIlIl[104], lllIIIlIl[84], lllIIIlIl[1]);
                                        if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[105]];
                                            Movement.walkTo(worldPoint10);
                                            "".length();
                                            Time.sleepTicks(lllIIIlIl[0]);
                                            "".length();
                                        }
                                        if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            String[] strArr25 = new String[lllIIIlIl[0]];
                                            strArr25[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[106]];
                                            TileObjects.getNearest(strArr25).interact(lllIIIlII[lllIIIlIl[107]]);
                                            Time.sleepTicks(lllIIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIllllllllII(new WorldArea(lllIIIlIl[72], lllIIIlIl[69], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllllllllI(df() ? 1 : 0)) {
                                        WorldPoint worldPoint11 = new WorldPoint(lllIIIlIl[108], lllIIIlIl[109], lllIIIlIl[1]);
                                        if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[110]];
                                            Movement.walkTo(worldPoint11);
                                            "".length();
                                            Time.sleepTicks(lllIIIlIl[0]);
                                            "".length();
                                        }
                                        if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            String[] strArr26 = new String[lllIIIlIl[0]];
                                            strArr26[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[111]];
                                            TileObjects.getNearest(strArr26).interact(lllIIIlII[lllIIIlIl[112]]);
                                            Time.sleepTicks(lllIIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIllllllllII(new WorldArea(lllIIIlIl[70], lllIIIlIl[69], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint12 = new WorldPoint(lllIIIlIl[67], lllIIIlIl[113], lllIIIlIl[1]);
                                        if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[114]];
                                            Movement.walkTo(worldPoint12);
                                            "".length();
                                            Time.sleepTicks(lllIIIlIl[0]);
                                            "".length();
                                        }
                                        if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            String[] strArr27 = new String[lllIIIlIl[0]];
                                            strArr27[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[115]];
                                            TileObjects.getNearest(strArr27).interact(lllIIIlII[lllIIIlIl[116]]);
                                            Time.sleepTicks(lllIIIlIl[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (lIllllllllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllllllllI(df() ? 1 : 0)) {
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[117]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[118]];
                                        String[] strArr28 = new String[lllIIIlIl[0]];
                                        strArr28[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[119]];
                                        TileObjects.getNearest(strArr28).interact(lllIIIlII[lllIIIlIl[120]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIlllllllllI(Vars.getBit(lllIIIlIl[74])) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[103]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[121]))) {
                                if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[122]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(lllIIIlIl[0]);
                                    "".length();
                                }
                                if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[123]];
                                    String[] strArr29 = new String[lllIIIlIl[0]];
                                    strArr29[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[124]];
                                    TileObjects.getNearest(strArr29).interact(lllIIIlII[lllIIIlIl[125]]);
                                    Time.sleepTicks(lllIIIlIl[8]);
                                    "".length();
                                }
                            }
                            if (lIlllllllllI(Vars.getBit(lllIIIlIl[74])) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[103]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[121]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[126]))) {
                                WorldArea worldArea7 = new WorldArea(lllIIIlIl[72], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]);
                                if (lIllllllllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint13 = new WorldPoint(lllIIIlIl[127], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[128]];
                                        Movement.walkTo(worldPoint13);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        String[] strArr30 = new String[lllIIIlIl[0]];
                                        strArr30[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[129]];
                                        TileObjects.getNearest(strArr30).interact(lllIIIlII[lllIIIlIl[130]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIllllllllII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint14 = new WorldPoint(lllIIIlIl[131], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[132]];
                                        Movement.walkTo(worldPoint14);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        String[] strArr31 = new String[lllIIIlIl[0]];
                                        strArr31[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[133]];
                                        TileObjects.getNearest(strArr31).interact(lllIIIlII[lllIIIlIl[134]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIllllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[135]];
                                    String[] strArr32 = new String[lllIIIlIl[0]];
                                    strArr32[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[136]];
                                    TileObjects.getNearest(strArr32).interact(lllIIIlII[lllIIIlIl[137]]);
                                    Time.sleepTicks(lllIIIlIl[16]);
                                    "".length();
                                }
                            }
                            if (lIlllllllllI(Vars.getBit(lllIIIlIl[74])) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[103]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[121]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[126]), lllIIIlIl[0])) {
                                WorldArea worldArea8 = new WorldArea(lllIIIlIl[72], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]);
                                if (lIllllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint15 = new WorldPoint(lllIIIlIl[138], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[139]];
                                        Movement.walkTo(worldPoint15);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        String[] strArr33 = new String[lllIIIlIl[0]];
                                        strArr33[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[140]];
                                        TileObjects.getNearest(strArr33).interact(lllIIIlII[lllIIIlIl[141]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIllllllllII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint16 = new WorldPoint(lllIIIlIl[108], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[142]];
                                        Movement.walkTo(worldPoint16);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        String[] strArr34 = new String[lllIIIlIl[0]];
                                        strArr34[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[143]];
                                        TileObjects.getNearest(strArr34).interact(lllIIIlII[lllIIIlIl[144]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIllllllllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[145]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[146]];
                                        String[] strArr35 = new String[lllIIIlIl[0]];
                                        strArr35[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[147]];
                                        TileObjects.getNearest(strArr35).interact(lllIIIlII[lllIIIlIl[148]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIlllllllllI(Vars.getBit(lllIIIlIl[74])) && lIlllllllllI(Vars.getBit(lllIIIlIl[80])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[75]), lllIIIlIl[0]) && lIlllllllllI(Vars.getBit(lllIIIlIl[103])) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[121]), lllIIIlIl[0]) && llIIIIIIIlII(Vars.getBit(lllIIIlIl[126]), lllIIIlIl[0])) {
                                WorldArea worldArea9 = new WorldArea(lllIIIlIl[72], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]);
                                if (lIllllllllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint17 = new WorldPoint(lllIIIlIl[127], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[149]];
                                        Movement.walkTo(worldPoint17);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        String[] strArr36 = new String[lllIIIlIl[0]];
                                        strArr36[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[150]];
                                        TileObjects.getNearest(strArr36).interact(lllIIIlII[lllIIIlIl[151]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIllllllllII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint18 = new WorldPoint(lllIIIlIl[104], lllIIIlIl[152], lllIIIlIl[1]);
                                    if (lIlllllllllI(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[153]];
                                        Movement.walkTo(worldPoint18);
                                        "".length();
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                    }
                                    if (lIllllllllII(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        Time.sleepTicks(lllIIIlIl[0]);
                                        "".length();
                                        String[] strArr37 = new String[lllIIIlIl[0]];
                                        strArr37[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[154]];
                                        TileObjects.getNearest(strArr37).interact(lllIIIlII[lllIIIlIl[155]]);
                                        Time.sleepTicks(lllIIIlIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIllllllllII(new WorldArea(lllIIIlIl[72], lllIIIlIl[69], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[156]];
                                    Time.sleepTicks(lllIIIlIl[0]);
                                    "".length();
                                    int[] iArr18 = new int[lllIIIlIl[0]];
                                    iArr18[lllIIIlIl[1]] = lllIIIlIl[157];
                                    TileObjects.getNearest(iArr18).interact(lllIIIlII[lllIIIlIl[158]]);
                                    Time.sleepTicks(lllIIIlIl[8]);
                                    "".length();
                                }
                                if (lIllllllllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] iArr19 = new int[lllIIIlIl[0]];
                                    iArr19[lllIIIlIl[1]] = lllIIIlIl[159];
                                    TileObjects.getNearest(iArr19).interact(lllIIIlII[lllIIIlIl[160]]);
                                    Time.sleepTicks(lllIIIlIl[8]);
                                    "".length();
                                }
                                if (lIllllllllII(new WorldArea(lllIIIlIl[161], lllIIIlIl[162], lllIIIlIl[23], lllIIIlIl[14], lllIIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr38 = new String[lllIIIlIl[0]];
                                    strArr38[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[163]];
                                    if (lIlllllllllI(Inventory.contains(strArr38) ? 1 : 0)) {
                                        String[] strArr39 = new String[lllIIIlIl[0]];
                                        strArr39[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[164]];
                                        TileItems.getNearest(strArr39).interact(lllIIIlII[lllIIIlIl[165]]);
                                        Time.sleepTicks(lllIIIlIl[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr40 = new String[lllIIIlIl[0]];
                strArr40[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[166]];
                if (lIllllllllII(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lllIIIlIl[0]];
                    strArr41[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[167]];
                    if (lIllllllllII(Inventory.contains(strArr41) ? 1 : 0)) {
                        if (lIllllllllII(new WorldArea(lllIIIlIl[161], lllIIIlIl[162], lllIIIlIl[23], lllIIIlIl[14], lllIIIlIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lllIIIlIl[0]];
                            iArr20[lllIIIlIl[1]] = lllIIIlIl[159];
                            TileObjects.getNearest(iArr20).interact(lllIIIlII[lllIIIlIl[168]]);
                            Time.sleepTicks(lllIIIlIl[14]);
                            "".length();
                        }
                        if (llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[169]];
                            Movement.walkTo(lm);
                            "".length();
                            Time.sleepTicks(lllIIIlIl[0]);
                            "".length();
                        }
                        if (llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                                if (lIllllllllII(tileObject.getName().contains(lllIIIlII[lllIIIlIl[185]]) ? 1 : 0)) {
                                    String[] strArr42 = new String[lllIIIlIl[0]];
                                    strArr42[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[186]];
                                    if (lIllllllllII(tileObject.hasAction(strArr42) ? 1 : 0) && llIIIIIIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIIIlIl[21], lllIIIlIl[184], lllIIIlIl[3])), lllIIIlIl[3])) {
                                        ?? r0 = lllIIIlIl[0];
                                        "".length();
                                        return "   ".length() < 0 ? ((84 ^ 47) ^ (218 ^ 134)) & (((213 ^ 188) ^ (80 ^ 30)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lllIIIlIl[1];
                            });
                            if (lIllllllllll(nearest3)) {
                                nearest3.interact(lllIIIlII[lllIIIlIl[170]]);
                                Time.sleepTicks(lllIIIlIl[8]);
                                "".length();
                            }
                            if (llIIIIIlIlIl(nearest3)) {
                                C0006g.a(lllIIIlII[lllIIIlIl[171]], cG, lllIIIlIl[0]);
                            }
                        }
                    }
                }
            }
            if (llIIIIIIIlII(C0004e.j(ln), lllIIIlIl[3])) {
                if (llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[172]];
                    Movement.walkTo(lm);
                    "".length();
                    Time.sleepTicks(lllIIIlIl[0]);
                    "".length();
                }
                if (llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                        if (lIllllllllII(tileObject2.getName().contains(lllIIIlII[lllIIIlIl[182]]) ? 1 : 0)) {
                            String[] strArr42 = new String[lllIIIlIl[0]];
                            strArr42[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[183]];
                            if (lIllllllllII(tileObject2.hasAction(strArr42) ? 1 : 0) && llIIIIIIIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lllIIIlIl[21], lllIIIlIl[184], lllIIIlIl[3])), lllIIIlIl[3])) {
                                ?? r0 = lllIIIlIl[0];
                                "".length();
                                return ((87 ^ 100) ^ (43 ^ 28)) <= "  ".length() ? ((55 ^ 15) ^ (112 ^ 67)) & (((157 ^ 172) ^ (132 ^ 190)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllIIIlIl[1];
                    });
                    if (lIllllllllll(nearest4)) {
                        nearest4.interact(lllIIIlII[lllIIIlIl[173]]);
                        Time.sleepTicks(lllIIIlIl[8]);
                        "".length();
                    }
                    if (llIIIIIlIlIl(nearest4)) {
                        if (lIllllllllIl(dk, lllIIIlIl[0])) {
                            as.pW += lllIIIlIl[0];
                            as.u(AccBuilderGWD.m);
                            dk += lllIIIlIl[0];
                            as.pW = lllIIIlIl[1];
                            dl = lllIIIlIl[1];
                        }
                        C0006g.a(lllIIIlII[lllIIIlIl[174]], cG, lllIIIlIl[0]);
                    }
                }
            }
            C0006g.a(cG);
        }
    }

    private static boolean llIIIIIIIIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIIIIlIllI(C0004e.j(lllIIIlIl[47]), lllIIIlIl[8])) {
            ?? r0 = lllIIIlIl[0];
            "".length();
            return ((46 ^ 90) ^ (94 ^ 47)) <= 0 ? ((((26 + 46) - (-83)) + 29) ^ (((40 + 133) - 170) + 171)) & (("   ".length() ^ (71 ^ 82)) ^ (-" ".length())) : r0;
        }
        return lllIIIlIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIIIlIl[4]];
        iArr[lllIIIlIl[1]] = lllIIIlIl[5];
        iArr[lllIIIlIl[0]] = lllIIIlIl[6];
        iArr[lllIIIlIl[3]] = lllIIIlIl[7];
        iArr[lllIIIlIl[8]] = lllIIIlIl[9];
        int i = lllIIIlIl[1];
        while (lIllllllllIl(i, iArr.length)) {
            int[] iArr2 = new int[lllIIIlIl[0]];
            iArr2[lllIIIlIl[1]] = iArr[i];
            if (lIlllllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIIIlIl[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIlIl[0];
    }

    private static boolean lIllllllllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllllllllII(int i) {
        return i != 0;
    }

    static {
        lIlllllllIlI();
        lIlllllllIIl();
        bx = new ArrayList();
        dg = new WorldPoint(lllIIIlIl[64], lllIIIlIl[187], lllIIIlIl[1]);
        lj = new WorldPoint(lllIIIlIl[188], lllIIIlIl[189], lllIIIlIl[1]);
        lk = new WorldPoint(lllIIIlIl[161], lllIIIlIl[190], lllIIIlIl[1]);
        ll = new WorldPoint(lllIIIlIl[191], lllIIIlIl[192], lllIIIlIl[1]);
        lm = new WorldPoint(lllIIIlIl[64], lllIIIlIl[45], lllIIIlIl[3]);
        ln = lllIIIlIl[47];
        String[] strArr = new String[lllIIIlIl[8]];
        strArr[lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[193]];
        strArr[lllIIIlIl[0]] = lllIIIlII[lllIIIlIl[194]];
        strArr[lllIIIlIl[3]] = lllIIIlII[lllIIIlIl[195]];
        cG = strArr;
        lo = new WorldArea(lllIIIlIl[188], lllIIIlIl[196], lllIIIlIl[50], lllIIIlIl[40], lllIIIlIl[1]);
    }

    private static boolean lIllllllllll(Object obj) {
        return obj != null;
    }

    private static String lIlllllllIII(String llllIllIIIlIl, String llllIllIIIlII) {
        try {
            SecretKeySpec llllIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIIIlII.getBytes(StandardCharsets.UTF_8)), lllIIIlIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIl[3], llllIllIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIllIIIllI) {
            llllIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIIll(int i, int i2) {
        return i <= i2;
    }

    private static String lIllllllIlIl(String llllIlIllIlIl, String llllIlIllIlII) {
        String str = new String(Base64.getDecoder().decode(llllIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllIlIllIIlI = llllIlIllIlII.toCharArray();
        int llllIlIllIIIl = lllIIIlIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIIlIl[1];
        while (lIllllllllIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllIlIllIIlI[llllIlIllIIIl % llllIlIllIIlI.length]));
            "".length();
            llllIlIllIIIl++;
            i++;
            "".length();
            if ((((33 ^ 91) ^ (121 ^ 92)) & (((133 ^ 175) ^ (211 ^ 166)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ad, code lost:
        if (lIllllllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.U.lllIIIlIl[14]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[lllIIIlIl[0]];
        iArr2[lllIIIlIl[1]] = lllIIIlIl[6];
        if (lIlllllllllI(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIlIl[6], lllIIIlIl[10], lllIIIlIl[175]));
            "".length();
        }
        int[] iArr3 = new int[lllIIIlIl[0]];
        iArr3[lllIIIlIl[1]] = lllIIIlIl[7];
        if (lIlllllllllI(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIlIl[7], lllIIIlIl[0], lllIIIlIl[175]));
            "".length();
        }
        int[] iArr4 = new int[lllIIIlIl[0]];
        iArr4[lllIIIlIl[1]] = lllIIIlIl[9];
        if (lIlllllllllI(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIlIl[9], lllIIIlIl[0], lllIIIlIl[175]));
            "".length();
        }
        if (lIlllllllllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIIlII[lllIIIlIl[181]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIlIl[176], lllIIIlIl[14], lllIIIlIl[177]));
            "".length();
        }
        int[] iArr5 = new int[lllIIIlIl[0]];
        iArr5[lllIIIlIl[1]] = lllIIIlIl[12];
        if (lIlllllllllI(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIlIl[12], lllIIIlIl[4], C0009j.ch));
            "".length();
        }
        int[] iArr6 = new int[lllIIIlIl[0]];
        iArr6[lllIIIlIl[1]] = lllIIIlIl[13];
        if (lIllllllllII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lllIIIlIl[0]];
            iArr7[lllIIIlIl[1]] = lllIIIlIl[13];
            if (lIllllllllII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIIlIl[0]];
                iArr8[lllIIIlIl[1]] = lllIIIlIl[13];
            }
            iArr = new int[lllIIIlIl[0]];
            iArr[lllIIIlIl[1]] = lllIIIlIl[5];
            if (lIllllllllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lllIIIlIl[0]];
                iArr9[lllIIIlIl[1]] = lllIIIlIl[5];
                if (!lIllllllllII(Bank.contains(iArr9) ? 1 : 0)) {
                    return;
                }
                int[] iArr10 = new int[lllIIIlIl[0]];
                iArr10[lllIIIlIl[1]] = lllIIIlIl[5];
                if (!lIllllllllIl(Bank.getFirst(iArr10).getQuantity(), lllIIIlIl[27])) {
                    return;
                }
            }
            bx.add(new C0003d(lllIIIlIl[5], lllIIIlIl[57], lllIIIlIl[179]));
            "".length();
        }
        bx.add(new C0003d(lllIIIlIl[13], lllIIIlIl[10], lllIIIlIl[178]));
        "".length();
        iArr = new int[lllIIIlIl[0]];
        iArr[lllIIIlIl[1]] = lllIIIlIl[5];
        if (lIllllllllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIIIlIl[5], lllIIIlIl[57], lllIIIlIl[179]));
        "".length();
    }

    private static boolean lIlllllllllI(int i) {
        return i == 0;
    }
}
