package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.v  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/v.class */
public class C0035v implements InterfaceC0003ac {
    static /* synthetic */ WorldArea dp;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint dl;
    static /* synthetic */ WorldPoint dr;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ WorldPoint dn;
    static /* synthetic */ boolean dj;
    static /* synthetic */ WorldPoint ds;
    static /* synthetic */ String h;
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ int di;
    static /* synthetic */ String[] cE;
    static /* synthetic */ WorldArea dq;
    private static /* synthetic */ int[] lllIIlllII;
    static /* synthetic */ WorldArea dm;
    static /* synthetic */ int dt;
    private static /* synthetic */ String[] lllIIlIIlI;

    /* renamed from: do  reason: not valid java name */
    static /* synthetic */ WorldArea f1do;

    private static boolean llIIIIlIlIIIl(int i) {
        return i != 0;
    }

    static {
        llIIIIlIIlllI();
        llIIIIlIIllIl();
        bv = new ArrayList();
        de = new WorldPoint(lllIIlllII[443], lllIIlllII[444], lllIIlllII[1]);
        dl = new WorldPoint(lllIIlllII[445], lllIIlllII[446], lllIIlllII[1]);
        dm = new WorldArea(lllIIlllII[447], lllIIlllII[448], lllIIlllII[29], lllIIlllII[24], lllIIlllII[1]);
        dn = new WorldPoint(lllIIlllII[449], lllIIlllII[450], lllIIlllII[1]);
        f1do = new WorldArea(lllIIlllII[67], lllIIlllII[68], lllIIlllII[148], lllIIlllII[121], lllIIlllII[1]);
        dp = new WorldArea(lllIIlllII[451], lllIIlllII[452], lllIIlllII[126], lllIIlllII[101], lllIIlllII[0]);
        dq = new WorldArea(lllIIlllII[453], lllIIlllII[452], lllIIlllII[129], lllIIlllII[103], lllIIlllII[6]);
        dr = null;
        ds = null;
        String[] strArr = new String[lllIIlllII[56]];
        strArr[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[454]];
        strArr[lllIIlllII[0]] = lllIIlIIlI[lllIIlllII[455]];
        strArr[lllIIlllII[6]] = lllIIlIIlI[lllIIlllII[456]];
        strArr[lllIIlllII[7]] = lllIIlIIlI[lllIIlllII[457]];
        strArr[lllIIlllII[8]] = lllIIlIIlI[lllIIlllII[458]];
        strArr[lllIIlllII[9]] = lllIIlIIlI[lllIIlllII[459]];
        strArr[lllIIlllII[10]] = lllIIlIIlI[lllIIlllII[460]];
        strArr[lllIIlllII[12]] = lllIIlIIlI[lllIIlllII[461]];
        strArr[lllIIlllII[13]] = lllIIlIIlI[lllIIlllII[462]];
        strArr[lllIIlllII[14]] = lllIIlIIlI[lllIIlllII[463]];
        strArr[lllIIlllII[15]] = lllIIlIIlI[lllIIlllII[464]];
        strArr[lllIIlllII[17]] = lllIIlIIlI[lllIIlllII[465]];
        strArr[lllIIlllII[20]] = lllIIlIIlI[lllIIlllII[466]];
        strArr[lllIIlllII[24]] = lllIIlIIlI[lllIIlllII[467]];
        strArr[lllIIlllII[27]] = lllIIlIIlI[lllIIlllII[468]];
        strArr[lllIIlllII[28]] = lllIIlIIlI[lllIIlllII[469]];
        strArr[lllIIlllII[44]] = lllIIlIIlI[lllIIlllII[470]];
        strArr[lllIIlllII[46]] = lllIIlIIlI[lllIIlllII[471]];
        strArr[lllIIlllII[48]] = lllIIlIIlI[lllIIlllII[472]];
        strArr[lllIIlllII[50]] = lllIIlIIlI[lllIIlllII[473]];
        strArr[lllIIlllII[29]] = lllIIlIIlI[lllIIlllII[474]];
        cE = strArr;
        h = lllIIlIIlI[lllIIlllII[475]];
    }

    private static boolean llIIIIlIllIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIIlIlIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIlllII[1];
    }

    private static void llIIIIlIIlllI() {
        lllIIlllII = new int[477];
        lllIIlllII[0] = " ".length();
        lllIIlllII[1] = (124 ^ 29) & ((107 ^ 10) ^ (-1));
        lllIIlllII[2] = (76 ^ 1) ^ (196 ^ 185);
        lllIIlllII[3] = (210 ^ 138) ^ (32 ^ 85);
        lllIIlllII[4] = (139 ^ 146) ^ (106 ^ 91);
        lllIIlllII[5] = (-((-12479) & 31998)) & (-641) & 20479;
        lllIIlllII[6] = "  ".length();
        lllIIlllII[7] = "   ".length();
        lllIIlllII[8] = (27 ^ 97) ^ (107 ^ 21);
        lllIIlllII[9] = (69 ^ 47) ^ (18 ^ 125);
        lllIIlllII[10] = 91 ^ 93;
        lllIIlllII[11] = 71 ^ 97;
        lllIIlllII[12] = (125 ^ 96) ^ (216 ^ 194);
        lllIIlllII[13] = 173 ^ 165;
        lllIIlllII[14] = (((26 + 46) - 53) + 142) ^ (((32 + 114) - 21) + 43);
        lllIIlllII[15] = (97 ^ 122) ^ (31 ^ 14);
        lllIIlllII[16] = (-((-15189) & 16246)) & (-2055) & 8111;
        lllIIlllII[17] = (((75 + 121) - 191) + 161) ^ (((171 + 10) - 163) + 155);
        lllIIlllII[18] = (-20518) & 23541;
        lllIIlllII[19] = (-((-17913) & 18425)) & (-1129) & 14335;
        lllIIlllII[20] = 175 ^ 163;
        lllIIlllII[21] = (-9474) & 10029;
        lllIIlllII[22] = (207 ^ 166) ^ (124 ^ 38);
        lllIIlllII[23] = (-((-17491) & 27863)) & (-338) & 11263;
        lllIIlllII[24] = 188 ^ 177;
        lllIIlllII[25] = (-18043) & 18427;
        lllIIlllII[26] = (((77 ^ 53) + (163 ^ 155)) - (20 ^ 82)) + (48 ^ 23);
        lllIIlllII[27] = (240 ^ 133) ^ (195 ^ 184);
        lllIIlllII[28] = (((96 + 72) - 2) + 4) ^ (((134 + 160) - 183) + 54);
        lllIIlllII[29] = (72 ^ 119) ^ (114 ^ 89);
        lllIIlllII[30] = (-16553) & 24559;
        lllIIlllII[31] = (-4609) & 24237;
        lllIIlllII[32] = (-((-99) & 11387)) & (-5) & 12287;
        lllIIlllII[33] = (-20549) & 23509;
        lllIIlllII[34] = (-((-23107) & 23403)) & (-10243) & 12143;
        lllIIlllII[35] = (-((-4857) & 31485)) & (-4353) & 32735;
        lllIIlllII[36] = ((208 + 209) - 232) + 48;
        lllIIlllII[37] = (-31881) & 32444;
        lllIIlllII[38] = ((61 + 217) - 148) + 97;
        lllIIlllII[39] = (-28769) & 31202;
        lllIIlllII[40] = (-((-15057) & 31451)) & (-6) & 28239;
        lllIIlllII[41] = (-1624) & 8191;
        lllIIlllII[42] = (-11330) & 32627;
        lllIIlllII[43] = (-9291) & 30591;
        lllIIlllII[44] = 128 ^ 144;
        lllIIlllII[45] = (-((-21557) & 23799)) & (-9217) & 32762;
        lllIIlllII[46] = 128 ^ 145;
        lllIIlllII[47] = (-((-12409) & 30332)) & (-8321) & 32767;
        lllIIlllII[48] = 158 ^ 140;
        lllIIlllII[49] = (-25905) & 32639;
        lllIIlllII[50] = 40 ^ 59;
        lllIIlllII[51] = (-673) & 13297;
        lllIIlllII[52] = (-((-6225) & 15839)) & (-33) & 30655;
        lllIIlllII[53] = (-((-17092) & 29639)) & (-65) & 14315;
        lllIIlllII[54] = (-21642) & 32767;
        lllIIlllII[55] = (127 ^ 33) ^ (124 ^ 16);
        lllIIlllII[56] = 156 ^ 137;
        lllIIlllII[57] = 160 ^ 182;
        lllIIlllII[58] = 137 ^ 158;
        lllIIlllII[59] = (174 ^ 176) ^ (142 ^ 136);
        lllIIlllII[60] = (190 ^ 162) ^ (50 ^ 55);
        lllIIlllII[61] = (-20577) & 24183;
        lllIIlllII[62] = (-21122) & 24319;
        lllIIlllII[63] = (((167 + 10) - 4) + 59) ^ (((124 + 111) - 222) + 150);
        lllIIlllII[64] = 132 ^ 154;
        lllIIlllII[65] = (-((-17561) & 21917)) & (-16393) & 24349;
        lllIIlllII[66] = (-21313) & 24530;
        lllIIlllII[67] = (-((-7818) & 8187)) & (-8321) & 12279;
        lllIIlllII[68] = (-((-7641) & 8155)) & (-24965) & 28655;
        lllIIlllII[69] = (((193 + 210) - 386) + 211) ^ (((71 + 92) - 109) + 144);
        lllIIlllII[70] = (201 ^ 143) ^ (105 ^ 53);
        lllIIlllII[71] = 51 ^ 40;
        lllIIlllII[72] = (((56 + 33) - 59) + 103) ^ (((113 + 26) - 119) + 133);
        lllIIlllII[73] = 12 ^ 17;
        lllIIlllII[74] = 107 ^ 116;
        lllIIlllII[75] = (((87 + 133) - 105) + 30) ^ (((161 + 74) - 199) + 141);
        lllIIlllII[76] = 48 ^ 17;
        lllIIlllII[77] = 25 ^ 58;
        lllIIlllII[78] = 19 ^ 55;
        lllIIlllII[79] = 99 ^ 70;
        lllIIlllII[80] = (126 ^ 73) ^ (47 ^ 63);
        lllIIlllII[81] = (-((-7443) & 32094)) & (-4353) & 32639;
        lllIIlllII[82] = (-((-8306) & 12529)) & (-16897) & 24319;
        lllIIlllII[83] = (-((-5365) & 30205)) & (-4097) & 32575;
        lllIIlllII[84] = (-((-10001) & 26453)) & (-4657) & 24319;
        lllIIlllII[85] = (-20999) & 24222;
        lllIIlllII[86] = (-((-19237) & 23525)) & (-24833) & 32758;
        lllIIlllII[87] = (-((-1057) & 6015)) & (-24577) & 32766;
        lllIIlllII[88] = (-((-1687) & 22167)) & (-17) & 24159;
        lllIIlllII[89] = (-((-17557) & 26621)) & (-1) & 12285;
        lllIIlllII[90] = (-8593) & 12278;
        lllIIlllII[91] = (-105) & 3327;
        lllIIlllII[92] = (-((-3419) & 27999)) & (-193) & 28415;
        lllIIlllII[93] = (-29553) & 32765;
        lllIIlllII[94] = (-193) & 3832;
        lllIIlllII[95] = (-((-130) & 29663)) & (-1) & 32767;
        lllIIlllII[96] = (-((-2634) & 27595)) & (-4161) & 32765;
        lllIIlllII[97] = (217 ^ 194) ^ (180 ^ 134);
        lllIIlllII[98] = (213 ^ 157) ^ (250 ^ 152);
        lllIIlllII[99] = 149 ^ 190;
        lllIIlllII[100] = (50 ^ 61) ^ (33 ^ 2);
        lllIIlllII[101] = 132 ^ 170;
        lllIIlllII[102] = (-26628) & 32227;
        lllIIlllII[103] = (((58 + 30) - (-62)) + 21) ^ (((25 + 72) - 85) + 120);
        lllIIlllII[104] = (-16397) & 19631;
        lllIIlllII[105] = 23 ^ 38;
        lllIIlllII[106] = (-12689) & 16338;
        lllIIlllII[107] = (-4163) & 7391;
        lllIIlllII[108] = 242 ^ 198;
        lllIIlllII[109] = (83 ^ 124) ^ (126 ^ 100);
        lllIIlllII[110] = 17 ^ 39;
        lllIIlllII[111] = 67 ^ 116;
        lllIIlllII[112] = 111 ^ 87;
        lllIIlllII[113] = 52 ^ 13;
        lllIIlllII[114] = (((23 + 13) - (-40)) + 91) ^ (((139 + 44) - 112) + 86);
        lllIIlllII[115] = (244 ^ 189) ^ (97 ^ 19);
        lllIIlllII[116] = 156 ^ 160;
        lllIIlllII[117] = (-((-333) & 18285)) & (-2049) & 32759;
        lllIIlllII[118] = 97 ^ 92;
        lllIIlllII[119] = (-17301) & 20479;
        lllIIlllII[120] = ((44 + 62) - 85) + 128;
        lllIIlllII[121] = 49 ^ 15;
        lllIIlllII[122] = 28 ^ 35;
        lllIIlllII[123] = (107 ^ 77) ^ (217 ^ 191);
        lllIIlllII[124] = (32 ^ 45) ^ (236 ^ 160);
        lllIIlllII[125] = (52 ^ 36) ^ (72 ^ 26);
        lllIIlllII[126] = " ".length() ^ (103 ^ 32);
        lllIIlllII[127] = (120 ^ 13) ^ (5 ^ 51);
        lllIIlllII[128] = (70 ^ 83) ^ (69 ^ 0);
        lllIIlllII[129] = (((32 + 31) - (-44)) + 22) ^ (((122 + 76) - 175) + 174);
        lllIIlllII[130] = (35 ^ 119) ^ (93 ^ 76);
        lllIIlllII[131] = (163 ^ 136) ^ (97 ^ 13);
        lllIIlllII[132] = (108 ^ 32) ^ (45 ^ 41);
        lllIIlllII[133] = (78 ^ 4) ^ "   ".length();
        lllIIlllII[134] = (101 ^ 76) ^ (9 ^ 106);
        lllIIlllII[135] = (-(112 ^ 52)) & (-9) & 32639;
        lllIIlllII[136] = (((101 + 12) - 103) + 217) ^ (((168 + 157) - 299) + 149);
        lllIIlllII[137] = 69 ^ 8;
        lllIIlllII[138] = 80 ^ 30;
        lllIIlllII[139] = (-193) & 32759;
        lllIIlllII[140] = (44 ^ 72) ^ (161 ^ 138);
        lllIIlllII[141] = 81 ^ 0;
        lllIIlllII[142] = (14 ^ 78) ^ (87 ^ 69);
        lllIIlllII[143] = (34 ^ 69) ^ (147 ^ 167);
        lllIIlllII[144] = (60 ^ 11) ^ (236 ^ 143);
        lllIIlllII[145] = (0 ^ 53) ^ (69 ^ 37);
        lllIIlllII[146] = (((231 + 147) - 250) + 106) ^ (((13 + 179) - 37) + 33);
        lllIIlllII[147] = (184 ^ 138) ^ (7 ^ 98);
        lllIIlllII[148] = 92 ^ 4;
        lllIIlllII[149] = 47 ^ 118;
        lllIIlllII[150] = 211 ^ 137;
        lllIIlllII[151] = (75 ^ 95) ^ (206 ^ 129);
        lllIIlllII[152] = (76 ^ 95) ^ (234 ^ 165);
        lllIIlllII[153] = (((205 + 74) - 88) + 15) ^ (((112 + 98) - 99) + 36);
        lllIIlllII[154] = 8 ^ 86;
        lllIIlllII[155] = 23 ^ 72;
        lllIIlllII[156] = 218 ^ 186;
        lllIIlllII[157] = 205 ^ 172;
        lllIIlllII[158] = (((150 + 211) - 169) + 27) ^ (((43 + 112) - 144) + 174);
        lllIIlllII[159] = 125 ^ 30;
        lllIIlllII[160] = (202 ^ 198) ^ (86 ^ 62);
        lllIIlllII[161] = (132 ^ 167) ^ (111 ^ 41);
        lllIIlllII[162] = (65 ^ 117) ^ (24 ^ 74);
        lllIIlllII[163] = 203 ^ 172;
        lllIIlllII[164] = (((137 + 156) - 179) + 57) ^ (((135 + 122) - 233) + 171);
        lllIIlllII[165] = 218 ^ 179;
        lllIIlllII[166] = (((128 + 239) - 162) + 38) ^ (((28 + 136) - 79) + 68);
        lllIIlllII[167] = 63 ^ 84;
        lllIIlllII[168] = (11 ^ 15) ^ (212 ^ 188);
        lllIIlllII[169] = (91 ^ 99) ^ (249 ^ 172);
        lllIIlllII[170] = (137 ^ 148) ^ (120 ^ 11);
        lllIIlllII[171] = 85 ^ 58;
        lllIIlllII[172] = 36 ^ 84;
        lllIIlllII[173] = 98 ^ 19;
        lllIIlllII[174] = 86 ^ 36;
        lllIIlllII[175] = (59 ^ 101) ^ (105 ^ 68);
        lllIIlllII[176] = 73 ^ 61;
        lllIIlllII[177] = (((59 + 118) - (-72)) + 2) ^ (((20 + 37) - 32) + 117);
        lllIIlllII[178] = 62 ^ 72;
        lllIIlllII[179] = (47 ^ 50) ^ (57 ^ 83);
        lllIIlllII[180] = 9 ^ 113;
        lllIIlllII[181] = (193 ^ 175) ^ (15 ^ 24);
        lllIIlllII[182] = (106 ^ 25) ^ (49 ^ 56);
        lllIIlllII[183] = (-20693) & 24285;
        lllIIlllII[184] = (-16934) & 26613;
        lllIIlllII[185] = (101 ^ 16) ^ (98 ^ 108);
        lllIIlllII[186] = 84 ^ 40;
        lllIIlllII[187] = (30 ^ 37) ^ (15 ^ 73);
        lllIIlllII[188] = (((102 + 96) - 129) + 158) ^ (((34 + 133) - 116) + 106);
        lllIIlllII[189] = ((94 + 22) - 37) + 48;
        lllIIlllII[190] = (((36 ^ 49) + (159 ^ 145)) - (-(232 ^ 162))) + (115 ^ 96);
        lllIIlllII[191] = ((37 + 104) - 30) + 18;
        lllIIlllII[192] = ((19 + 14) - (-20)) + 77;
        lllIIlllII[193] = ((122 + 18) - 123) + 114;
        lllIIlllII[194] = (((144 ^ 149) + (174 ^ 162)) - (-(87 ^ 55))) + (174 ^ 189);
        lllIIlllII[195] = (((5 ^ 88) + (99 ^ 24)) - (125 ^ 14)) + (154 ^ 186);
        lllIIlllII[196] = ((114 + 86) - 181) + 115;
        lllIIlllII[197] = ((26 + 53) - 48) + 104;
        lllIIlllII[198] = (-28803) & 32391;
        lllIIlllII[199] = (-20492) & 30159;
        lllIIlllII[200] = (((78 ^ 7) + (153 ^ 136)) - (-"   ".length())) + (171 ^ 128);
        lllIIlllII[201] = (((120 ^ 14) + (78 ^ 25)) - (((95 + 90) - 119) + 96)) + (119 ^ 41);
        lllIIlllII[202] = (((214 ^ 179) + (15 ^ 115)) - (20 ^ 75)) + (34 ^ 42);
        lllIIlllII[203] = ((14 + 80) - 59) + 104;
        lllIIlllII[204] = ((59 + 61) - 1) + 21;
        lllIIlllII[205] = ((116 + 38) - 73) + 60;
        lllIIlllII[206] = (((30 ^ 32) + (31 ^ 7)) - "  ".length()) + (4 ^ 62);
        lllIIlllII[207] = (((27 ^ 51) + (123 ^ 90)) - (9 ^ 42)) + (25 ^ 112);
        lllIIlllII[208] = ((84 + 67) - 111) + 104;
        lllIIlllII[209] = (((190 ^ 164) + (((120 + 26) - 28) + 24)) - (86 ^ 20)) + (91 ^ 119);
        lllIIlllII[210] = (((114 ^ 9) + (31 ^ 2)) - (58 ^ 52)) + (203 ^ 194);
        lllIIlllII[211] = (-21507) & 24534;
        lllIIlllII[212] = ((93 + 81) - 140) + 114;
        lllIIlllII[213] = (-25613) & 28638;
        lllIIlllII[214] = (-(182 ^ 191)) & (-20513) & 23550;
        lllIIlllII[215] = ((103 + 100) - 189) + 136;
        lllIIlllII[216] = ((110 + 103) - 159) + 97;
        lllIIlllII[217] = (((221 ^ 148) + "  ".length()) - (-(172 ^ 166))) + (119 ^ 52);
        lllIIlllII[218] = ((132 + 56) - 70) + 35;
        lllIIlllII[219] = (((95 ^ 71) + (((102 + 40) - 53) + 47)) - (81 ^ 63)) + (235 ^ 131);
        lllIIlllII[220] = (((((95 + 107) - 143) + 95) + (228 ^ 182)) - (((39 + 21) - 16) + 150)) + (124 ^ 13);
        lllIIlllII[221] = ((69 + 35) - 32) + 84;
        lllIIlllII[222] = ((83 + 12) - 5) + 67;
        lllIIlllII[223] = (((((53 + 119) - 104) + 63) + (((92 + 130) - 199) + 109)) - ((-20635) & 20894)) + ((151 + 8) - 146) + 142;
        lllIIlllII[224] = (((50 ^ 89) + (80 ^ 96)) - (154 ^ 139)) + (115 ^ 102);
        lllIIlllII[225] = (((((27 + 117) - 14) + 23) + (45 ^ 6)) - (78 ^ 21)) + (21 ^ 34);
        lllIIlllII[226] = ((" ".length() + (129 ^ 175)) - (-(29 ^ 93))) + (69 ^ 119);
        lllIIlllII[227] = (-25226) & 28669;
        lllIIlllII[228] = (-17185) & 20350;
        lllIIlllII[229] = (((168 ^ 199) + (64 ^ 91)) - (116 ^ 94)) + (233 ^ 163);
        lllIIlllII[230] = ((91 + 47) - 89) + 113;
        lllIIlllII[231] = ((101 + 129) - 84) + 17;
        lllIIlllII[232] = (((251 ^ 154) + (41 ^ 74)) - (((52 + 38) - 30) + 130)) + ((151 + 44) - 173) + 136;
        lllIIlllII[233] = (((((120 + 15) - 32) + 49) + (83 ^ 54)) - (((8 + 25) - (-98)) + 12)) + (89 ^ 110);
        lllIIlllII[234] = (((20 ^ 18) + (69 ^ 22)) - (-(159 ^ 142))) + (253 ^ 193);
        lllIIlllII[235] = ((4 + 116) - (-15)) + 32;
        lllIIlllII[236] = (((157 ^ 145) + (185 ^ 134)) - (170 ^ 159)) + ((103 + 56) - 43) + 30;
        lllIIlllII[237] = ((9 + 36) - (-68)) + 56;
        lllIIlllII[238] = (((18 ^ 41) + (((66 + 86) - 110) + 89)) - (61 ^ 36)) + (36 ^ 34);
        lllIIlllII[239] = ((79 + 71) - 14) + 36;
        lllIIlllII[240] = (((29 ^ 35) + (73 ^ 106)) - (103 ^ 75)) + (122 ^ 2);
        lllIIlllII[241] = ((85 + 99) - 134) + 124;
        lllIIlllII[242] = ((102 + 133) - 173) + 113;
        lllIIlllII[243] = (((((125 + 158) - 226) + 112) + (((45 + 8) - 20) + 134)) - ((-31745) & 32027)) + (39 ^ 92);
        lllIIlllII[244] = ((93 + 106) - 56) + 34;
        lllIIlllII[245] = ((10 + 146) - 58) + 80;
        lllIIlllII[246] = ((152 + 37) - 188) + 178;
        lllIIlllII[247] = ((30 + 168) - 157) + 139;
        lllIIlllII[248] = (((((116 + 115) - 206) + 105) + (52 ^ 78)) - (((92 + 38) - (-5)) + 8)) + (3 ^ 75);
        lllIIlllII[249] = (((67 ^ 119) + (93 ^ 57)) - (40 ^ 119)) + (44 ^ 81);
        lllIIlllII[250] = (-(((6 + 21) - (-96)) + 6)) & (-65) & 32767;
        lllIIlllII[251] = (((((46 + 88) - 6) + 34) + (((115 + 85) - 106) + 44)) - (((110 + 102) - 83) + 4)) + (53 ^ 37);
        lllIIlllII[252] = (((((40 + 24) - 16) + 123) + (206 ^ 168)) - (((113 + 52) - 88) + 65)) + (175 ^ 154);
        lllIIlllII[253] = ((103 + 68) - 55) + 69;
        lllIIlllII[254] = (((((74 + 129) - 135) + 112) + (254 ^ 141)) - (((15 + 26) - (-27)) + 65)) + (157 ^ 133);
        lllIIlllII[255] = ((110 + 35) - 55) + 97;
        lllIIlllII[256] = ((18 + 165) - 140) + 145;
        lllIIlllII[257] = (-145) & 32720;
        lllIIlllII[258] = (((((39 + 143) - 179) + 150) + (21 ^ 64)) - (((146 + 124) - 139) + 86)) + ((108 + 164) - 224) + 120;
        lllIIlllII[259] = (((144 ^ 181) + (((127 + 88) - 191) + 126)) - (45 ^ 9)) + (79 ^ 104);
        lllIIlllII[260] = ((81 + 139) - 215) + 186;
        lllIIlllII[261] = (((168 ^ 166) + (((72 + 31) - 25) + 70)) - (55 ^ 33)) + (118 ^ 66);
        lllIIlllII[262] = ((164 + 139) - 274) + 164;
        lllIIlllII[263] = (((((19 + 1) - (-108)) + 47) + (11 ^ 56)) - (134 ^ 180)) + (63 ^ 45);
        lllIIlllII[264] = ((43 + 158) - 162) + 156;
        lllIIlllII[265] = ((174 + 8) - 143) + 157;
        lllIIlllII[266] = (((155 ^ 187) + (((61 + 21) - (-18)) + 35)) - (55 ^ 116)) + (88 ^ 57);
        lllIIlllII[267] = (((((96 + 155) - 232) + 162) + (60 ^ 102)) - (75 ^ 31)) + (111 ^ 100);
        lllIIlllII[268] = (-12865) & 16355;
        lllIIlllII[269] = (("  ".length() + (((23 + 131) - 141) + 129)) - (((94 + 76) - 69) + 41)) + ((27 + 147) - 5) + 28;
        lllIIlllII[270] = (((((129 + 33) - 73) + 97) + (244 ^ 172)) - (((1 + 37) - 1) + 94)) + (85 ^ 108);
        lllIIlllII[271] = (((69 ^ 2) + (((92 + 38) - 112) + 148)) - (((160 + 150) - 124) + 33)) + ((11 + 149) - (-3)) + 20;
        lllIIlllII[272] = (((105 ^ 89) + (110 ^ 36)) - "  ".length()) + (52 ^ 102);
        lllIIlllII[273] = (((113 ^ 40) + (24 ^ 114)) - (((88 + 119) - 115) + 66)) + ((70 + 139) - 169) + 126;
        lllIIlllII[274] = ((162 + 194) - 194) + 42;
        lllIIlllII[275] = (((180 ^ 188) + (26 ^ 79)) - (-(194 ^ 174))) + (161 ^ 165);
        lllIIlllII[276] = ((147 + 175) - 156) + 40;
        lllIIlllII[277] = (((36 ^ 5) + (58 ^ 78)) - (-(115 ^ 126))) + (2 ^ 47);
        lllIIlllII[278] = ((187 + 76) - 159) + 104;
        lllIIlllII[279] = (((((31 + 141) - 131) + 158) + (91 ^ 112)) - (((81 + 41) - (-21)) + 90)) + ((17 + 42) - (-19)) + 122;
        lllIIlllII[280] = (((((71 + 18) - 7) + 63) + (((135 + 50) - 96) + 89)) - (((17 + 15) - (-34)) + 78)) + (55 ^ 40);
        lllIIlllII[281] = (((241 ^ 194) + (89 ^ 76)) - (101 ^ 115)) + ((1 + 127) - 93) + 126;
        lllIIlllII[282] = (((12 ^ 120) + (((107 + 45) - 45) + 102)) - (((44 + 69) - 104) + 129)) + (56 ^ 33);
        lllIIlllII[283] = ((58 + 29) - (-38)) + 88;
        lllIIlllII[284] = (((50 ^ 32) + (163 ^ 156)) - (-(111 ^ 23))) + (158 ^ 147);
        lllIIlllII[285] = ((120 + 135) - 180) + 140;
        lllIIlllII[286] = (((((99 + 114) - 98) + 49) + (94 ^ 6)) - (108 ^ 42)) + (156 ^ 190);
        lllIIlllII[287] = (((215 ^ 151) + (135 ^ 163)) - (-(67 ^ 96))) + (114 ^ 32);
        lllIIlllII[288] = (((29 ^ 35) + (((53 + 25) - 21) + 71)) - (121 ^ 51)) + (100 ^ 2);
        lllIIlllII[289] = ((161 + 132) - 159) + 85;
        lllIIlllII[290] = (((((80 + 57) - 48) + 94) + (218 ^ 178)) - (121 ^ 13)) + (127 ^ 78);
        lllIIlllII[291] = (((8 ^ 35) + (((108 + 28) - 124) + 130)) - (-(85 ^ 82))) + (24 ^ 5);
        lllIIlllII[292] = ((136 + 126) - 248) + 208;
        lllIIlllII[293] = (((((61 + 149) - 24) + 19) + (((34 + 149) - 76) + 81)) - (((177 + 114) - 75) + 7)) + (126 ^ 75);
        lllIIlllII[294] = ((203 + 36) - 35) + 20;
        lllIIlllII[295] = (((((79 + 56) - 4) + 3) + (((134 + 122) - 138) + 21)) - (((91 + 62) - 67) + 83)) + (85 ^ 44);
        lllIIlllII[296] = (((((13 + 124) - 97) + 139) + (182 ^ 186)) - (-(145 ^ 142))) + (63 ^ 59);
        lllIIlllII[297] = (((32 ^ 13) + (((116 + 21) - 66) + 105)) - (171 ^ 176)) + (75 ^ 105);
        lllIIlllII[298] = (((178 ^ 141) + (105 ^ 72)) - (65 ^ 7)) + ((43 + 183) - 106) + 83;
        lllIIlllII[299] = (((0 ^ 21) + (40 ^ 83)) - (-(106 ^ 33))) + (145 ^ 154);
        lllIIlllII[300] = ((205 + 173) - 265) + 118;
        lllIIlllII[301] = (((65 ^ 40) + (155 ^ 145)) - (57 ^ 106)) + ((83 + 52) - 23) + 88;
        lllIIlllII[302] = (((((38 + 87) - 42) + 51) + (20 ^ 8)) - (120 ^ 80)) + (16 ^ 96);
        lllIIlllII[303] = ((209 + 115) - 112) + 23;
        lllIIlllII[304] = (((239 ^ 190) + (((140 + 96) - 52) + 40)) - (((10 + 3) - 1) + 132)) + (4 ^ 79);
        lllIIlllII[305] = ((89 + 17) - (-64)) + 67;
        lllIIlllII[306] = (((64 ^ 30) + (((109 + 98) - 185) + 140)) - (((24 + 41) - (-66)) + 68)) + ((115 + 26) - 68) + 108;
        lllIIlllII[307] = ((16 + 142) - 73) + 154;
        lllIIlllII[308] = ((173 + 79) - 97) + 85;
        lllIIlllII[309] = ((117 + 151) - 222) + 195;
        lllIIlllII[310] = (((49 ^ 109) + (((141 + 84) - 59) + 6)) - (((6 + 2) - 7) + 185)) + ((162 + 85) - 156) + 73;
        lllIIlllII[311] = ((214 + 136) - 265) + 158;
        lllIIlllII[312] = ((112 + 187) - 148) + 93;
        lllIIlllII[313] = (((200 ^ 152) + (((159 + 95) - 188) + 103)) - (198 ^ 133)) + (39 ^ 24);
        lllIIlllII[314] = (((102 ^ 81) + (((72 + 103) - 126) + 88)) - (102 ^ 22)) + ((149 + 74) - 145) + 88;
        lllIIlllII[315] = ((36 + 154) - 140) + 197;
        lllIIlllII[316] = (((((52 + 39) - 7) + 87) + (((75 + 98) - 22) + 48)) - ((-29261) & 29519)) + ((32 + 54) - (-35)) + 16;
        lllIIlllII[317] = (((158 ^ 132) + (((2 + 137) - 44) + 43)) - (127 ^ 37)) + ((66 + 158) - 141) + 92;
        lllIIlllII[318] = ((101 + 220) - 191) + 120;
        lllIIlllII[319] = ((174 + 54) - (-15)) + 8;
        lllIIlllII[320] = ((57 + 171) - 177) + 201;
        lllIIlllII[321] = ((213 + 233) - 342) + 149;
        lllIIlllII[322] = (((((93 + 129) - 211) + 124) + (214 ^ 143)) - (8 ^ 6)) + (82 ^ 126);
        lllIIlllII[323] = (((223 ^ 129) + (42 ^ 75)) - (214 ^ 141)) + ((53 + 29) - (-12)) + 61;
        lllIIlllII[324] = (-((-27787) & 28415)) & (-7178) & 8061;
        lllIIlllII[325] = (-((-2067) & 32375)) & (-137) & 30701;
        lllIIlllII[326] = (-((-3329) & 32110)) & (-2705) & 31743;
        lllIIlllII[327] = (-((-3447) & 28151)) & (-3125) & 28087;
        lllIIlllII[328] = (-((-297) & 32252)) & (-41) & 32255;
        lllIIlllII[329] = (-((-5383) & 16343)) & (-16385) & 27605;
        lllIIlllII[330] = (-((-8035) & 32763)) & (-1) & 32763;
        lllIIlllII[331] = (-19602) & 19863;
        lllIIlllII[332] = (-7377) & 7639;
        lllIIlllII[333] = (-11908) & 12171;
        lllIIlllII[334] = (-((-319) & 11711)) & (-513) & 12169;
        lllIIlllII[335] = (-21025) & 21290;
        lllIIlllII[336] = (-1765) & 2031;
        lllIIlllII[337] = (-16435) & 16702;
        lllIIlllII[338] = (-((-1321) & 32233)) & (-1555) & 32735;
        lllIIlllII[339] = (-4114) & 4383;
        lllIIlllII[340] = (-((-25865) & 32105)) & (-24593) & 31103;
        lllIIlllII[341] = (-23621) & 23892;
        lllIIlllII[342] = (-2093) & 2365;
        lllIIlllII[343] = (-4130) & 4403;
        lllIIlllII[344] = (-((-16683) & 30191)) & (-2569) & 16351;
        lllIIlllII[345] = (-19564) & 19839;
        lllIIlllII[346] = (-9955) & 10231;
        lllIIlllII[347] = (-((-4501) & 32190)) & (-193) & 28159;
        lllIIlllII[348] = (-16481) & 16759;
        lllIIlllII[349] = (-((-8457) & 16333)) & (-24610) & 32765;
        lllIIlllII[350] = (-((-24915) & 32627)) & (-199) & 8191;
        lllIIlllII[351] = (-5345) & 5626;
        lllIIlllII[352] = (-30757) & 31039;
        lllIIlllII[353] = (-((-257) & 22818)) & (-8705) & 31549;
        lllIIlllII[354] = (-((-457) & 20457)) & (-3) & 20287;
        lllIIlllII[355] = (-((-2825) & 16361)) & (-16385) & 30206;
        lllIIlllII[356] = (-((-4115) & 24243)) & (-12353) & 32767;
        lllIIlllII[357] = (-((-12218) & 32763)) & (-1665) & 22497;
        lllIIlllII[358] = (-(144 ^ 193)) & (-8229) & 28543;
        lllIIlllII[359] = (-14535) & 14823;
        lllIIlllII[360] = (-((-16641) & 32606)) & (-16513) & 32767;
        lllIIlllII[361] = (-10965) & 11255;
        lllIIlllII[362] = (-25097) & 25388;
        lllIIlllII[363] = (-((-1989) & 16333)) & (-17923) & 32559;
        lllIIlllII[364] = (-((-1862) & 20447)) & (-13889) & 32767;
        lllIIlllII[365] = (-16385) & 16679;
        lllIIlllII[366] = (-((-1029) & 16092)) & (-17409) & 32767;
        lllIIlllII[367] = (-20997) & 21293;
        lllIIlllII[368] = (-3619) & 16315;
        lllIIlllII[369] = (-16449) & 29147;
        lllIIlllII[370] = (-((-24577) & 29510)) & (-24585) & 32765;
        lllIIlllII[371] = (-((-11881) & 28650)) & (-81) & 20475;
        lllIIlllII[372] = (-((-9297) & 27765)) & (-65) & 28151;
        lllIIlllII[373] = (-((-27170) & 32503)) & (-1) & 5631;
        lllIIlllII[374] = (-27221) & 27519;
        lllIIlllII[375] = (-((-2153) & 31337)) & (-1044) & 30527;
        lllIIlllII[376] = (-19601) & 19901;
        lllIIlllII[377] = (-1153) & 1454;
        lllIIlllII[378] = (-((-17721) & 32761)) & (-1) & 15343;
        lllIIlllII[379] = (-20171) & 20474;
        lllIIlllII[380] = (-((-137) & 29643)) & (-9) & 32767;
        lllIIlllII[381] = (-((-8241) & 30399)) & (-10241) & 32703;
        lllIIlllII[382] = (-12934) & 13239;
        lllIIlllII[383] = (-14913) & 15219;
        lllIIlllII[384] = (-((-2110) & 30975)) & (-1) & 32493;
        lllIIlllII[385] = (-((-18735) & 31087)) & (-16385) & 31991;
        lllIIlllII[386] = (-((-577) & 17101)) & (-12545) & 32703;
        lllIIlllII[387] = (-21060) & 24311;
        lllIIlllII[388] = (-4680) & 7935;
        lllIIlllII[389] = (-32329) & 32636;
        lllIIlllII[390] = (-((-17478) & 29791)) & (-2081) & 32511;
        lllIIlllII[391] = (-6337) & 6645;
        lllIIlllII[392] = (-((-12565) & 29086)) & (-6145) & 22975;
        lllIIlllII[393] = (-31753) & 32063;
        lllIIlllII[394] = (-27202) & 27513;
        lllIIlllII[395] = (-12342) & 15935;
        lllIIlllII[396] = (-12855) & 16127;
        lllIIlllII[397] = (-5825) & 6137;
        lllIIlllII[398] = (-32321) & 32634;
        lllIIlllII[399] = (-28225) & 28539;
        lllIIlllII[400] = (-((-82) & 14037)) & (-16449) & 30719;
        lllIIlllII[401] = (-((-777) & 14283)) & (-18945) & 32767;
        lllIIlllII[402] = (-8193) & 163192;
        lllIIlllII[403] = (-11128) & 176127;
        lllIIlllII[404] = (-((-21646) & 32495)) & (-16655) & 917503;
        lllIIlllII[405] = (-((-8259) & 25159)) & (-66) & 981965;
        lllIIlllII[406] = (-((-32281) & 32539)) & (-14) & 950271;
        lllIIlllII[407] = (-67) & 1050066;
        lllIIlllII[408] = (-21741) & 1471740;
        lllIIlllII[409] = (-((-17) & 22871)) & (-10) & 1572863;
        lllIIlllII[410] = (-((-16026) & 32671)) & (-513) & 1167157;
        lllIIlllII[411] = (-((-20489) & 32047)) & (-16394) & 1277951;
        lllIIlllII[412] = (-10279) & 700278;
        lllIIlllII[413] = (-((-4229) & 29319)) & (-9) & 815098;
        lllIIlllII[414] = (-1698) & 124927;
        lllIIlllII[415] = (-((-41) & 18106)) & (-12289) & 163583;
        lllIIlllII[416] = (-1110) & 10109;
        lllIIlllII[417] = (-((-585) & 21194)) & (-2145) & 32253;
        lllIIlllII[418] = (-((-26369) & 32658)) & (-9219) & 32507;
        lllIIlllII[419] = (-((-8805) & 15334)) & (-3) & 24531;
        lllIIlllII[420] = (-21076) & 31575;
        lllIIlllII[421] = (-((-11756) & 28159)) & (-4609) & 32511;
        lllIIlllII[422] = (-((-2689) & 24306)) & (-513) & 30719;
        lllIIlllII[423] = (-((-297) & 13102)) & (-2057) & 16111;
        lllIIlllII[424] = (-20993) & 22442;
        lllIIlllII[425] = (-((-8203) & 26251)) & (-6146) & 32693;
        lllIIlllII[426] = (-((-5349) & 22247)) & (-321) & 30718;
        lllIIlllII[427] = (-2049) & 16348;
        lllIIlllII[428] = (-(126 ^ 95)) & (-4098) & 16109;
        lllIIlllII[429] = (-((-9477) & 15717)) & (-1027) & 32766;
        lllIIlllII[430] = (-((-24609) & 29875)) & (-1) & 32766;
        lllIIlllII[431] = (-74) & 1023;
        lllIIlllII[432] = (-((-9559) & 15735)) & (-25541) & 32766;
        lllIIlllII[433] = (-30721) & 31038;
        lllIIlllII[434] = (-6785) & 7103;
        lllIIlllII[435] = (-(((121 + 159) - 153) + 45)) & (-17) & 32767;
        lllIIlllII[436] = (-(((42 + 146) - 44) + 33)) & (-5) & 32765;
        lllIIlllII[437] = (-((-3905) & 12287)) & (-20481) & 29183;
        lllIIlllII[438] = (-((-1411) & 19867)) & (-5250) & 24027;
        lllIIlllII[439] = (-12301) & 12623;
        lllIIlllII[440] = (-((-29377) & 32506)) & (-20609) & 24061;
        lllIIlllII[441] = (-14521) & 14845;
        lllIIlllII[442] = (-((-841) & 32729)) & (-522) & 32735;
        lllIIlllII[443] = (-((-8723) & 29631)) & (-8194) & 32767;
        lllIIlllII[444] = (-((-11727) & 15870)) & (-833) & 8191;
        lllIIlllII[445] = (-147) & 3795;
        lllIIlllII[446] = (-261) & 3469;
        lllIIlllII[447] = (-16850) & 20437;
        lllIIlllII[448] = (-16929) & 26535;
        lllIIlllII[449] = (-((-3073) & 19938)) & (-9) & 20479;
        lllIIlllII[450] = (-20786) & 23999;
        lllIIlllII[451] = (-3) & 3635;
        lllIIlllII[452] = (-12675) & 15870;
        lllIIlllII[453] = (-4558) & 8191;
        lllIIlllII[454] = (-22169) & 22495;
        lllIIlllII[455] = (-11271) & 11598;
        lllIIlllII[456] = (-1153) & 1481;
        lllIIlllII[457] = (-((-2126) & 31487)) & (-1029) & 30719;
        lllIIlllII[458] = (-((-20941) & 32765)) & (-20613) & 32767;
        lllIIlllII[459] = (-((-13092) & 32695)) & (-513) & 20447;
        lllIIlllII[460] = (-((-5973) & 16247)) & (-22017) & 32623;
        lllIIlllII[461] = (-((-8563) & 30067)) & (-8242) & 30079;
        lllIIlllII[462] = (-21009) & 21343;
        lllIIlllII[463] = (-((-945) & 20408)) & (-12937) & 32735;
        lllIIlllII[464] = (-22023) & 22359;
        lllIIlllII[465] = (-9) & 346;
        lllIIlllII[466] = (-((-11635) & 16383)) & (-17441) & 22527;
        lllIIlllII[467] = (-25130) & 25469;
        lllIIlllII[468] = (-21513) & 21853;
        lllIIlllII[469] = (-26113) & 26454;
        lllIIlllII[470] = (-11425) & 11767;
        lllIIlllII[471] = (-2053) & 2396;
        lllIIlllII[472] = (-((-657) & 17079)) & (-13953) & 30719;
        lllIIlllII[473] = (-25602) & 25947;
        lllIIlllII[474] = (-((-4121) & 31901)) & (-513) & 28639;
        lllIIlllII[475] = (-((-8493) & 16303)) & (-2) & 8159;
        lllIIlllII[476] = (-((-8605) & 31679)) & (-9217) & 32639;
    }

    private static boolean llIIIIlIlIIll(int i) {
        return i == 0;
    }

    private static void bb() {
        if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[10])) {
            if (llIIIIlIlIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
            }
            if (llIIIIlIlIIIl(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
            }
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[357]];
            Movement.walkTo(dl);
            "".length();
            Time.sleepTicks(lllIIlllII[0]);
            "".length();
        }
        if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[10])) {
            if (llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
            }
            if (llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                if (llIIIIlIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lllIIlllII[8]);
                    "".length();
                }
                if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                    C0000a.a(lllIIlllII[30], lllIIlllII[15]);
                    C0000a.b(C0019f.ba, lllIIlllII[0]);
                }
                if (llIIIIlIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                    int[] iArr = new int[lllIIlllII[0]];
                    iArr[lllIIlllII[1]] = lllIIlllII[42];
                    if (llIIIIlIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lllIIlllII[0]];
                        iArr2[lllIIlllII[1]] = lllIIlllII[42];
                        if (llIIIIlIlIIll(Equipment.contains(iArr2) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[42], lllIIlllII[0]);
                        }
                    }
                    int[] iArr3 = new int[lllIIlllII[0]];
                    iArr3[lllIIlllII[1]] = lllIIlllII[43];
                    if (llIIIIlIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIlllII[0]];
                        iArr4[lllIIlllII[1]] = lllIIlllII[43];
                        if (llIIIIlIlIIll(Equipment.contains(iArr4) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[43], lllIIlllII[0]);
                        }
                    }
                    int[] iArr5 = new int[lllIIlllII[0]];
                    iArr5[lllIIlllII[1]] = lllIIlllII[45];
                    if (llIIIIlIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lllIIlllII[0]];
                        iArr6[lllIIlllII[1]] = lllIIlllII[45];
                        if (llIIIIlIlIIll(Equipment.contains(iArr6) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[45], lllIIlllII[0]);
                        }
                    }
                    int[] iArr7 = new int[lllIIlllII[0]];
                    iArr7[lllIIlllII[1]] = lllIIlllII[41];
                    if (llIIIIlIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                        int[] iArr8 = new int[lllIIlllII[0]];
                        iArr8[lllIIlllII[1]] = lllIIlllII[41];
                        if (llIIIIlIlIIll(Equipment.contains(iArr8) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[41], lllIIlllII[0]);
                        }
                    }
                    int[] iArr9 = new int[lllIIlllII[0]];
                    iArr9[lllIIlllII[1]] = lllIIlllII[47];
                    if (llIIIIlIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr10 = new int[lllIIlllII[0]];
                        iArr10[lllIIlllII[1]] = lllIIlllII[47];
                        if (llIIIIlIlIIll(Equipment.contains(iArr10) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[47], lllIIlllII[0]);
                        }
                    }
                    int[] iArr11 = new int[lllIIlllII[0]];
                    iArr11[lllIIlllII[1]] = lllIIlllII[358];
                    if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lllIIlllII[0]];
                        iArr12[lllIIlllII[1]] = lllIIlllII[358];
                        if (llIIIIlIlIIll(Equipment.contains(iArr12) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[358], lllIIlllII[0]);
                        }
                    }
                    int[] iArr13 = new int[lllIIlllII[0]];
                    iArr13[lllIIlllII[1]] = lllIIlllII[40];
                    if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[lllIIlllII[0]];
                        iArr14[lllIIlllII[1]] = lllIIlllII[40];
                        if (llIIIIlIlIIll(Equipment.contains(iArr14) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[40], lllIIlllII[0]);
                        }
                    }
                    int[] iArr15 = new int[lllIIlllII[0]];
                    iArr15[lllIIlllII[1]] = lllIIlllII[49];
                    if (llIIIIlIlIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[lllIIlllII[0]];
                        iArr16[lllIIlllII[1]] = lllIIlllII[49];
                        if (llIIIIlIlIIll(Equipment.contains(iArr16) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[49], lllIIlllII[0]);
                        }
                    }
                    int[] iArr17 = new int[lllIIlllII[0]];
                    iArr17[lllIIlllII[1]] = lllIIlllII[49];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lllIIlllII[0]];
                        iArr18[lllIIlllII[1]] = lllIIlllII[49];
                        Inventory.getFirst(iArr18).interact(lllIIlIIlI[lllIIlllII[359]]);
                    }
                    if (llIIIIlIlIIIl(Inventory.contains(C0019f.bk) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.bk).interact(lllIIlIIlI[lllIIlllII[360]]);
                    }
                    int[] iArr19 = new int[lllIIlllII[0]];
                    iArr19[lllIIlllII[1]] = lllIIlllII[42];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lllIIlllII[0]];
                        iArr20[lllIIlllII[1]] = lllIIlllII[42];
                        Inventory.getFirst(iArr20).interact(lllIIlIIlI[lllIIlllII[361]]);
                    }
                    int[] iArr21 = new int[lllIIlllII[0]];
                    iArr21[lllIIlllII[1]] = lllIIlllII[43];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                        int[] iArr22 = new int[lllIIlllII[0]];
                        iArr22[lllIIlllII[1]] = lllIIlllII[43];
                        Inventory.getFirst(iArr22).interact(lllIIlIIlI[lllIIlllII[362]]);
                    }
                    int[] iArr23 = new int[lllIIlllII[0]];
                    iArr23[lllIIlllII[1]] = lllIIlllII[45];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[lllIIlllII[0]];
                        iArr24[lllIIlllII[1]] = lllIIlllII[45];
                        Inventory.getFirst(iArr24).interact(lllIIlIIlI[lllIIlllII[363]]);
                    }
                    int[] iArr25 = new int[lllIIlllII[0]];
                    iArr25[lllIIlllII[1]] = lllIIlllII[41];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[lllIIlllII[0]];
                        iArr26[lllIIlllII[1]] = lllIIlllII[41];
                        Inventory.getFirst(iArr26).interact(lllIIlIIlI[lllIIlllII[364]]);
                    }
                    int[] iArr27 = new int[lllIIlllII[0]];
                    iArr27[lllIIlllII[1]] = lllIIlllII[47];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr27) ? 1 : 0)) {
                        int[] iArr28 = new int[lllIIlllII[0]];
                        iArr28[lllIIlllII[1]] = lllIIlllII[47];
                        Inventory.getFirst(iArr28).interact(lllIIlIIlI[lllIIlllII[365]]);
                    }
                    int[] iArr29 = new int[lllIIlllII[0]];
                    iArr29[lllIIlllII[1]] = lllIIlllII[358];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr29) ? 1 : 0)) {
                        int[] iArr30 = new int[lllIIlllII[0]];
                        iArr30[lllIIlllII[1]] = lllIIlllII[358];
                        Inventory.getFirst(iArr30).interact(lllIIlIIlI[lllIIlllII[366]]);
                    }
                    int[] iArr31 = new int[lllIIlllII[0]];
                    iArr31[lllIIlllII[1]] = lllIIlllII[40];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[lllIIlllII[0]];
                        iArr32[lllIIlllII[1]] = lllIIlllII[40];
                        Inventory.getFirst(iArr32).interact(lllIIlIIlI[lllIIlllII[367]]);
                    }
                    if (llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lllIIlllII[9]);
                        "".length();
                    }
                    int[] iArr33 = new int[lllIIlllII[0]];
                    iArr33[lllIIlllII[1]] = lllIIlllII[19];
                    if (llIIIIlIlIIIl(Bank.contains(iArr33) ? 1 : 0)) {
                        C0000a.a(lllIIlllII[19], lllIIlllII[0]);
                    }
                    int[] iArr34 = new int[lllIIlllII[0]];
                    iArr34[lllIIlllII[1]] = lllIIlllII[19];
                    if (llIIIIlIlIIll(Inventory.contains(iArr34) ? 1 : 0)) {
                        int[] iArr35 = new int[lllIIlllII[0]];
                        iArr35[lllIIlllII[1]] = lllIIlllII[368];
                        if (llIIIIlIlIIIl(Bank.contains(iArr35) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[368], lllIIlllII[0]);
                        }
                    }
                    int[] iArr36 = new int[lllIIlllII[0]];
                    iArr36[lllIIlllII[1]] = lllIIlllII[19];
                    if (llIIIIlIlIIll(Inventory.contains(iArr36) ? 1 : 0)) {
                        int[] iArr37 = new int[lllIIlllII[0]];
                        iArr37[lllIIlllII[1]] = lllIIlllII[368];
                        if (llIIIIlIlIIll(Inventory.contains(iArr37) ? 1 : 0)) {
                            C0000a.a(lllIIlllII[369], lllIIlllII[0]);
                        }
                    }
                    C0000a.a(lllIIlllII[39], lllIIlllII[8]);
                    C0000a.a(lllIIlllII[25], Inventory.getFreeSlots());
                    Time.sleepTicks(lllIIlllII[8]);
                    "".length();
                    if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private static boolean ba() {
        int[] iArr = new int[lllIIlllII[0]];
        iArr[lllIIlllII[1]] = lllIIlllII[39];
        if (llIIIIlIlIlII(Inventory.getAll(iArr).size(), lllIIlllII[7]) && llIIIIlIlIIIl(Inventory.contains(item -> {
            return item.getName().contains(lllIIlIIlI[lllIIlllII[5]]);
        }) ? 1 : 0)) {
            String[] strArr = new String[lllIIlllII[0]];
            strArr[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[356]];
            if (llIIIIlIlIlII(Inventory.getAll(strArr).size(), lllIIlllII[29])) {
                ?? r0 = lllIIlllII[0];
                "".length();
                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lllIIlllII[1];
    }

    private static String llIIIIIlIIlII(String lllllllllllllllllIlllIIlIllIIIll, String lllllllllllllllllIlllIIlIllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlllII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlllII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIlIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIlIllIIlII) {
            lllllllllllllllllIlllIIlIllIIlII.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIlIIllI(String lllllllllllllllllIlllIIlIllllIII, String lllllllllllllllllIlllIIlIlllIlll) {
        String lllllllllllllllllIlllIIlIllllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIlIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlllIIlIlllIlIl = lllllllllllllllllIlllIIlIlllIlll.toCharArray();
        int lllllllllllllllllIlllIIlIlllIlII = lllIIlllII[1];
        char[] charArray = lllllllllllllllllIlllIIlIllllIII2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllllIlllIIlIllIllII = lllIIlllII[1];
        while (llIIIIlIlIIlI(lllllllllllllllllIlllIIlIllIllII, length)) {
            sb.append((char) (charArray[lllllllllllllllllIlllIIlIllIllII] ^ lllllllllllllllllIlllIIlIlllIlIl[lllllllllllllllllIlllIIlIlllIlII % lllllllllllllllllIlllIIlIlllIlIl.length]));
            "".length();
            lllllllllllllllllIlllIIlIlllIlII++;
            lllllllllllllllllIlllIIlIllIllII++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIIIIlIIlIl(String lllllllllllllllllIlllIIllIIIlIII, String lllllllllllllllllIlllIIllIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIllIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIIllIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIIllIIIlIlI.init(lllIIlllII[6], lllllllllllllllllIlllIIllIIIlIll);
            return new String(lllllllllllllllllIlllIIllIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIllIIIlIIl) {
            lllllllllllllllllIlllIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlIllI(int i) {
        return i > 0;
    }

    private static boolean llIIIIlIlllII(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlIllIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIIlIlIlIl(Object obj) {
        return obj != null;
    }

    public static void bc() {
        WorldArea worldArea = new WorldArea(lllIIlllII[81], lllIIlllII[370], lllIIlllII[9], lllIIlllII[9], lllIIlllII[1]);
        WorldArea worldArea2 = new WorldArea(lllIIlllII[198], lllIIlllII[199], lllIIlllII[24], lllIIlllII[48], lllIIlllII[1]);
        WorldPoint worldPoint = new WorldPoint(lllIIlllII[371], lllIIlllII[372], lllIIlllII[1]);
        if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[4]) && llIIIIlIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[373]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lllIIlllII[0]);
                "".length();
            }
            if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[374]];
                String[] strArr = new String[lllIIlllII[0]];
                strArr[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[375]];
                TileObjects.getNearest(strArr).interact(lllIIlIIlI[lllIIlllII[376]]);
                Time.sleepTicks(lllIIlllII[8]);
                "".length();
            }
        }
        if (llIIIIlIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[377]];
            String[] strArr2 = new String[lllIIlllII[0]];
            strArr2[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[378]];
            TileObjects.getNearest(strArr2).interact(lllIIlIIlI[lllIIlllII[379]]);
            Time.sleepTicks(lllIIlllII[7]);
            "".length();
        }
        if (llIIIIlIlIIIl(new WorldArea(lllIIlllII[81], lllIIlllII[380], lllIIlllII[10], lllIIlllII[10], lllIIlllII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[381]];
            String[] strArr3 = new String[lllIIlllII[0]];
            strArr3[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[382]];
            TileObjects.getNearest(strArr3).interact(lllIIlIIlI[lllIIlllII[383]]);
            Time.sleepTicks(lllIIlllII[7]);
            "".length();
        }
        WorldArea worldArea3 = new WorldArea(lllIIlllII[384], lllIIlllII[385], lllIIlllII[10], lllIIlllII[9], lllIIlllII[0]);
        WorldArea worldArea4 = new WorldArea(lllIIlllII[386], lllIIlllII[387], lllIIlllII[9], lllIIlllII[12], lllIIlllII[0]);
        WorldPoint worldPoint2 = new WorldPoint(lllIIlllII[81], lllIIlllII[388], lllIIlllII[0]);
        if (llIIIIlIlIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[389]];
                Movement.walkTo(worldPoint2);
                "".length();
            }
            if (llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                int[] iArr = new int[lllIIlllII[0]];
                iArr[lllIIlllII[1]] = lllIIlllII[390];
                TileObjects.getNearest(iArr).interact(lllIIlIIlI[lllIIlllII[391]]);
                Time.sleepTicks(lllIIlllII[7]);
                "".length();
            }
        }
        if (llIIIIlIlIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[392]];
            String[] strArr4 = new String[lllIIlllII[0]];
            strArr4[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[393]];
            TileObjects.getNearest(strArr4).interact(lllIIlIIlI[lllIIlllII[394]]);
            Time.sleepTicks(lllIIlllII[7]);
            "".length();
        }
        WorldArea worldArea5 = new WorldArea(lllIIlllII[67], lllIIlllII[385], lllIIlllII[101], lllIIlllII[75], lllIIlllII[1]);
        WorldPoint worldPoint3 = new WorldPoint(lllIIlllII[395], lllIIlllII[396], lllIIlllII[1]);
        if (llIIIIlIlIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[397]];
                Movement.walkTo(worldPoint3);
                "".length();
                Time.sleepTicks(lllIIlllII[0]);
                "".length();
            }
            if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[398]];
                String[] strArr5 = new String[lllIIlllII[0]];
                strArr5[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[399]];
                TileObjects.getNearest(strArr5).interact(lllIIlIIlI[lllIIlllII[400]]);
                Time.sleepTicks(lllIIlllII[8]);
                "".length();
            }
        }
        if (llIIIIlIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            C0020g.a(lllIIlIIlI[lllIIlllII[401]], cE);
        }
    }

    private static boolean llIIIIlIllIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIlIllIll(int i) {
        return i < 0;
    }

    private static int llIIIIlIIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIIlIlIlll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x032f, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[15]) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03c3, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[15]) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04a8, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[160(0xa0, float:2.24E-43)]) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x053a, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[3]) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x070c, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[26]) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x07a0, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[28]) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0834, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[58]) != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
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
        int[] iArr13;
        int[] iArr14 = new int[lllIIlllII[0]];
        iArr14[lllIIlllII[1]] = lllIIlllII[358];
        if (llIIIIlIlIIll(Bank.contains(iArr14) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[358], lllIIlllII[0], C0018e.c(lllIIlllII[402], lllIIlllII[403])));
            "".length();
        }
        int[] iArr15 = new int[lllIIlllII[0]];
        iArr15[lllIIlllII[1]] = lllIIlllII[40];
        if (llIIIIlIlIIll(Bank.contains(iArr15) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[40], lllIIlllII[0], C0018e.c(lllIIlllII[402], lllIIlllII[403])));
            "".length();
        }
        int[] iArr16 = new int[lllIIlllII[0]];
        iArr16[lllIIlllII[1]] = lllIIlllII[41];
        if (llIIIIlIlIIll(Bank.contains(iArr16) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[41], lllIIlllII[0], C0018e.c(lllIIlllII[404], lllIIlllII[405])));
            "".length();
        }
        int[] iArr17 = new int[lllIIlllII[0]];
        iArr17[lllIIlllII[1]] = lllIIlllII[42];
        if (llIIIIlIlIIll(Bank.contains(iArr17) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[42], lllIIlllII[0], C0018e.c(lllIIlllII[406], lllIIlllII[407])));
            "".length();
        }
        int[] iArr18 = new int[lllIIlllII[0]];
        iArr18[lllIIlllII[1]] = lllIIlllII[43];
        if (llIIIIlIlIIll(Bank.contains(iArr18) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[43], lllIIlllII[0], C0018e.c(lllIIlllII[408], lllIIlllII[409])));
            "".length();
        }
        int[] iArr19 = new int[lllIIlllII[0]];
        iArr19[lllIIlllII[1]] = lllIIlllII[45];
        if (llIIIIlIlIIll(Bank.contains(iArr19) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[45], lllIIlllII[0], C0018e.c(lllIIlllII[410], lllIIlllII[411])));
            "".length();
        }
        int[] iArr20 = new int[lllIIlllII[0]];
        iArr20[lllIIlllII[1]] = lllIIlllII[47];
        if (llIIIIlIlIIll(Bank.contains(iArr20) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[47], lllIIlllII[0], C0018e.c(lllIIlllII[412], lllIIlllII[413])));
            "".length();
        }
        int[] iArr21 = new int[lllIIlllII[0]];
        iArr21[lllIIlllII[1]] = lllIIlllII[49];
        if (llIIIIlIlIIll(Bank.contains(iArr21) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[49], lllIIlllII[0], C0018e.c(lllIIlllII[414], lllIIlllII[415])));
            "".length();
        }
        int[] iArr22 = new int[lllIIlllII[0]];
        iArr22[lllIIlllII[1]] = lllIIlllII[36];
        if (llIIIIlIlIIll(Bank.contains(iArr22) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllII[36], lllIIlllII[0], C0018e.c(lllIIlllII[416], lllIIlllII[417])));
            "".length();
        }
        int[] iArr23 = new int[lllIIlllII[0]];
        iArr23[lllIIlllII[1]] = lllIIlllII[18];
        if (llIIIIlIlIIIl(Bank.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[lllIIlllII[0]];
            iArr24[lllIIlllII[1]] = lllIIlllII[18];
            if (llIIIIlIlIIIl(Bank.contains(iArr24) ? 1 : 0)) {
                int[] iArr25 = new int[lllIIlllII[0]];
                iArr25[lllIIlllII[1]] = lllIIlllII[18];
            }
            iArr = new int[lllIIlllII[0]];
            iArr[lllIIlllII[1]] = lllIIlllII[19];
            if (llIIIIlIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr26 = new int[lllIIlllII[0]];
                iArr26[lllIIlllII[1]] = lllIIlllII[19];
                if (llIIIIlIlIIIl(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[lllIIlllII[0]];
                    iArr27[lllIIlllII[1]] = lllIIlllII[19];
                }
                iArr2 = new int[lllIIlllII[0]];
                iArr2[lllIIlllII[1]] = lllIIlllII[38];
                if (llIIIIlIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0017d(lllIIlllII[38], lllIIlllII[0], C0018e.c(lllIIlllII[418], lllIIlllII[419])));
                    "".length();
                }
                iArr3 = new int[lllIIlllII[0]];
                iArr3[lllIIlllII[1]] = lllIIlllII[23];
                if (llIIIIlIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr28 = new int[lllIIlllII[0]];
                    iArr28[lllIIlllII[1]] = lllIIlllII[23];
                    if (llIIIIlIlIIIl(Bank.contains(iArr28) ? 1 : 0)) {
                        int[] iArr29 = new int[lllIIlllII[0]];
                        iArr29[lllIIlllII[1]] = lllIIlllII[23];
                    }
                    iArr4 = new int[lllIIlllII[0]];
                    iArr4[lllIIlllII[1]] = lllIIlllII[21];
                    if (llIIIIlIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr30 = new int[lllIIlllII[0]];
                        iArr30[lllIIlllII[1]] = lllIIlllII[21];
                        if (llIIIIlIlIIIl(Bank.contains(iArr30) ? 1 : 0)) {
                            int[] iArr31 = new int[lllIIlllII[0]];
                            iArr31[lllIIlllII[1]] = lllIIlllII[21];
                        }
                        iArr5 = new int[lllIIlllII[0]];
                        iArr5[lllIIlllII[1]] = lllIIlllII[34];
                        if (llIIIIlIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                            bv.add(new C0017d(lllIIlllII[34], lllIIlllII[0], C0018e.c(lllIIlllII[420], lllIIlllII[421])));
                            "".length();
                        }
                        iArr6 = new int[lllIIlllII[0]];
                        iArr6[lllIIlllII[1]] = lllIIlllII[35];
                        if (llIIIIlIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
                            bv.add(new C0017d(lllIIlllII[35], lllIIlllII[0], C0018e.c(lllIIlllII[422], lllIIlllII[417])));
                            "".length();
                        }
                        iArr7 = new int[lllIIlllII[0]];
                        iArr7[lllIIlllII[1]] = lllIIlllII[33];
                        if (llIIIIlIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                            bv.add(new C0017d(lllIIlllII[33], lllIIlllII[0], C0018e.c(lllIIlllII[420], lllIIlllII[421])));
                            "".length();
                        }
                        iArr8 = new int[lllIIlllII[0]];
                        iArr8[lllIIlllII[1]] = lllIIlllII[37];
                        if (llIIIIlIlIIll(Bank.contains(iArr8) ? 1 : 0)) {
                            bv.add(new C0017d(lllIIlllII[37], lllIIlllII[0], C0018e.c(lllIIlllII[420], lllIIlllII[421])));
                            "".length();
                        }
                        iArr9 = new int[lllIIlllII[0]];
                        iArr9[lllIIlllII[1]] = lllIIlllII[25];
                        if (llIIIIlIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr32 = new int[lllIIlllII[0]];
                            iArr32[lllIIlllII[1]] = lllIIlllII[25];
                            if (llIIIIlIlIIIl(Bank.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lllIIlllII[0]];
                                iArr33[lllIIlllII[1]] = lllIIlllII[25];
                            }
                            iArr10 = new int[lllIIlllII[0]];
                            iArr10[lllIIlllII[1]] = lllIIlllII[31];
                            if (llIIIIlIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                int[] iArr34 = new int[lllIIlllII[0]];
                                iArr34[lllIIlllII[1]] = lllIIlllII[31];
                                if (llIIIIlIlIIIl(Bank.contains(iArr34) ? 1 : 0)) {
                                    int[] iArr35 = new int[lllIIlllII[0]];
                                    iArr35[lllIIlllII[1]] = lllIIlllII[31];
                                }
                                iArr11 = new int[lllIIlllII[0]];
                                iArr11[lllIIlllII[1]] = lllIIlllII[39];
                                if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                    int[] iArr36 = new int[lllIIlllII[0]];
                                    iArr36[lllIIlllII[1]] = lllIIlllII[39];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr36) ? 1 : 0)) {
                                        int[] iArr37 = new int[lllIIlllII[0]];
                                        iArr37[lllIIlllII[1]] = lllIIlllII[39];
                                    }
                                    if (llIIIIlIlIIll(Bank.contains(item -> {
                                        return item.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
                                    }) ? 1 : 0)) {
                                        bv.add(new C0017d(lllIIlllII[428], lllIIlllII[9], C0018e.c(lllIIlllII[429], lllIIlllII[430])));
                                        "".length();
                                    }
                                    iArr12 = new int[lllIIlllII[0]];
                                    iArr12[lllIIlllII[1]] = lllIIlllII[51];
                                    if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
                                        bv.add(new C0017d(lllIIlllII[51], lllIIlllII[8], C0023j.cf));
                                        "".length();
                                    }
                                    iArr13 = new int[lllIIlllII[0]];
                                    iArr13[lllIIlllII[1]] = lllIIlllII[30];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                        int[] iArr38 = new int[lllIIlllII[0]];
                                        iArr38[lllIIlllII[1]] = lllIIlllII[30];
                                        if (!llIIIIlIlIIIl(Bank.contains(iArr38) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr39 = new int[lllIIlllII[0]];
                                        iArr39[lllIIlllII[1]] = lllIIlllII[30];
                                        if (!llIIIIlIlIIlI(Bank.getFirst(iArr39).getQuantity(), lllIIlllII[28])) {
                                            return;
                                        }
                                    }
                                    bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
                                    "".length();
                                }
                                bv.add(new C0017d(lllIIlllII[39], lllIIlllII[58], C0018e.c(lllIIlllII[426], lllIIlllII[427])));
                                "".length();
                                if (llIIIIlIlIIll(Bank.contains(item2 -> {
                                    return item2.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
                                }) ? 1 : 0)) {
                                }
                                iArr12 = new int[lllIIlllII[0]];
                                iArr12[lllIIlllII[1]] = lllIIlllII[51];
                                if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
                                }
                                iArr13 = new int[lllIIlllII[0]];
                                iArr13[lllIIlllII[1]] = lllIIlllII[30];
                                if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
                                "".length();
                            }
                            bv.add(new C0017d(lllIIlllII[31], lllIIlllII[28], C0018e.c(lllIIlllII[425], lllIIlllII[417])));
                            "".length();
                            iArr11 = new int[lllIIlllII[0]];
                            iArr11[lllIIlllII[1]] = lllIIlllII[39];
                            if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIlllII[39], lllIIlllII[58], C0018e.c(lllIIlllII[426], lllIIlllII[427])));
                            "".length();
                            if (llIIIIlIlIIll(Bank.contains(item22 -> {
                                return item22.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
                            }) ? 1 : 0)) {
                            }
                            iArr12 = new int[lllIIlllII[0]];
                            iArr12[lllIIlllII[1]] = lllIIlllII[51];
                            if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            iArr13 = new int[lllIIlllII[0]];
                            iArr13[lllIIlllII[1]] = lllIIlllII[30];
                            if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
                            "".length();
                        }
                        bv.add(new C0017d(lllIIlllII[25], lllIIlllII[26], C0018e.c(lllIIlllII[423], lllIIlllII[424])));
                        "".length();
                        iArr10 = new int[lllIIlllII[0]];
                        iArr10[lllIIlllII[1]] = lllIIlllII[31];
                        if (llIIIIlIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIlllII[31], lllIIlllII[28], C0018e.c(lllIIlllII[425], lllIIlllII[417])));
                        "".length();
                        iArr11 = new int[lllIIlllII[0]];
                        iArr11[lllIIlllII[1]] = lllIIlllII[39];
                        if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIlllII[39], lllIIlllII[58], C0018e.c(lllIIlllII[426], lllIIlllII[427])));
                        "".length();
                        if (llIIIIlIlIIll(Bank.contains(item222 -> {
                            return item222.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[lllIIlllII[0]];
                        iArr12[lllIIlllII[1]] = lllIIlllII[51];
                        if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        iArr13 = new int[lllIIlllII[0]];
                        iArr13[lllIIlllII[1]] = lllIIlllII[30];
                        if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
                        "".length();
                    }
                    bv.add(new C0017d(lllIIlllII[21], lllIIlllII[22], C0018e.c(lllIIlllII[29], lllIIlllII[58])));
                    "".length();
                    iArr5 = new int[lllIIlllII[0]];
                    iArr5[lllIIlllII[1]] = lllIIlllII[34];
                    if (llIIIIlIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[lllIIlllII[0]];
                    iArr6[lllIIlllII[1]] = lllIIlllII[35];
                    if (llIIIIlIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    iArr7 = new int[lllIIlllII[0]];
                    iArr7[lllIIlllII[1]] = lllIIlllII[33];
                    if (llIIIIlIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    iArr8 = new int[lllIIlllII[0]];
                    iArr8[lllIIlllII[1]] = lllIIlllII[37];
                    if (llIIIIlIlIIll(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[lllIIlllII[0]];
                    iArr9[lllIIlllII[1]] = lllIIlllII[25];
                    if (llIIIIlIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIlllII[25], lllIIlllII[26], C0018e.c(lllIIlllII[423], lllIIlllII[424])));
                    "".length();
                    iArr10 = new int[lllIIlllII[0]];
                    iArr10[lllIIlllII[1]] = lllIIlllII[31];
                    if (llIIIIlIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIlllII[31], lllIIlllII[28], C0018e.c(lllIIlllII[425], lllIIlllII[417])));
                    "".length();
                    iArr11 = new int[lllIIlllII[0]];
                    iArr11[lllIIlllII[1]] = lllIIlllII[39];
                    if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIlllII[39], lllIIlllII[58], C0018e.c(lllIIlllII[426], lllIIlllII[427])));
                    "".length();
                    if (llIIIIlIlIIll(Bank.contains(item2222 -> {
                        return item2222.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[lllIIlllII[0]];
                    iArr12[lllIIlllII[1]] = lllIIlllII[51];
                    if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    iArr13 = new int[lllIIlllII[0]];
                    iArr13[lllIIlllII[1]] = lllIIlllII[30];
                    if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
                    "".length();
                }
                bv.add(new C0017d(lllIIlllII[23], lllIIlllII[160], C0018e.c(lllIIlllII[29], lllIIlllII[58])));
                "".length();
                iArr4 = new int[lllIIlllII[0]];
                iArr4[lllIIlllII[1]] = lllIIlllII[21];
                if (llIIIIlIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIlllII[21], lllIIlllII[22], C0018e.c(lllIIlllII[29], lllIIlllII[58])));
                "".length();
                iArr5 = new int[lllIIlllII[0]];
                iArr5[lllIIlllII[1]] = lllIIlllII[34];
                if (llIIIIlIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lllIIlllII[0]];
                iArr6[lllIIlllII[1]] = lllIIlllII[35];
                if (llIIIIlIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[lllIIlllII[0]];
                iArr7[lllIIlllII[1]] = lllIIlllII[33];
                if (llIIIIlIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lllIIlllII[0]];
                iArr8[lllIIlllII[1]] = lllIIlllII[37];
                if (llIIIIlIlIIll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lllIIlllII[0]];
                iArr9[lllIIlllII[1]] = lllIIlllII[25];
                if (llIIIIlIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIlllII[25], lllIIlllII[26], C0018e.c(lllIIlllII[423], lllIIlllII[424])));
                "".length();
                iArr10 = new int[lllIIlllII[0]];
                iArr10[lllIIlllII[1]] = lllIIlllII[31];
                if (llIIIIlIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIlllII[31], lllIIlllII[28], C0018e.c(lllIIlllII[425], lllIIlllII[417])));
                "".length();
                iArr11 = new int[lllIIlllII[0]];
                iArr11[lllIIlllII[1]] = lllIIlllII[39];
                if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIlllII[39], lllIIlllII[58], C0018e.c(lllIIlllII[426], lllIIlllII[427])));
                "".length();
                if (llIIIIlIlIIll(Bank.contains(item22222 -> {
                    return item22222.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[lllIIlllII[0]];
                iArr12[lllIIlllII[1]] = lllIIlllII[51];
                if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[lllIIlllII[0]];
                iArr13[lllIIlllII[1]] = lllIIlllII[30];
                if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
                "".length();
            }
            bv.add(new C0017d(lllIIlllII[19], lllIIlllII[15], C0018e.c(lllIIlllII[418], lllIIlllII[419])));
            "".length();
            iArr2 = new int[lllIIlllII[0]];
            iArr2[lllIIlllII[1]] = lllIIlllII[38];
            if (llIIIIlIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lllIIlllII[0]];
            iArr3[lllIIlllII[1]] = lllIIlllII[23];
            if (llIIIIlIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIlllII[23], lllIIlllII[160], C0018e.c(lllIIlllII[29], lllIIlllII[58])));
            "".length();
            iArr4 = new int[lllIIlllII[0]];
            iArr4[lllIIlllII[1]] = lllIIlllII[21];
            if (llIIIIlIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIlllII[21], lllIIlllII[22], C0018e.c(lllIIlllII[29], lllIIlllII[58])));
            "".length();
            iArr5 = new int[lllIIlllII[0]];
            iArr5[lllIIlllII[1]] = lllIIlllII[34];
            if (llIIIIlIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lllIIlllII[0]];
            iArr6[lllIIlllII[1]] = lllIIlllII[35];
            if (llIIIIlIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lllIIlllII[0]];
            iArr7[lllIIlllII[1]] = lllIIlllII[33];
            if (llIIIIlIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lllIIlllII[0]];
            iArr8[lllIIlllII[1]] = lllIIlllII[37];
            if (llIIIIlIlIIll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lllIIlllII[0]];
            iArr9[lllIIlllII[1]] = lllIIlllII[25];
            if (llIIIIlIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIlllII[25], lllIIlllII[26], C0018e.c(lllIIlllII[423], lllIIlllII[424])));
            "".length();
            iArr10 = new int[lllIIlllII[0]];
            iArr10[lllIIlllII[1]] = lllIIlllII[31];
            if (llIIIIlIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIlllII[31], lllIIlllII[28], C0018e.c(lllIIlllII[425], lllIIlllII[417])));
            "".length();
            iArr11 = new int[lllIIlllII[0]];
            iArr11[lllIIlllII[1]] = lllIIlllII[39];
            if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIlllII[39], lllIIlllII[58], C0018e.c(lllIIlllII[426], lllIIlllII[427])));
            "".length();
            if (llIIIIlIlIIll(Bank.contains(item222222 -> {
                return item222222.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[lllIIlllII[0]];
            iArr12[lllIIlllII[1]] = lllIIlllII[51];
            if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[lllIIlllII[0]];
            iArr13[lllIIlllII[1]] = lllIIlllII[30];
            if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
            "".length();
        }
        bv.add(new C0017d(lllIIlllII[18], lllIIlllII[15], C0018e.c(lllIIlllII[418], lllIIlllII[419])));
        "".length();
        iArr = new int[lllIIlllII[0]];
        iArr[lllIIlllII[1]] = lllIIlllII[19];
        if (llIIIIlIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIlllII[19], lllIIlllII[15], C0018e.c(lllIIlllII[418], lllIIlllII[419])));
        "".length();
        iArr2 = new int[lllIIlllII[0]];
        iArr2[lllIIlllII[1]] = lllIIlllII[38];
        if (llIIIIlIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lllIIlllII[0]];
        iArr3[lllIIlllII[1]] = lllIIlllII[23];
        if (llIIIIlIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIlllII[23], lllIIlllII[160], C0018e.c(lllIIlllII[29], lllIIlllII[58])));
        "".length();
        iArr4 = new int[lllIIlllII[0]];
        iArr4[lllIIlllII[1]] = lllIIlllII[21];
        if (llIIIIlIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIlllII[21], lllIIlllII[22], C0018e.c(lllIIlllII[29], lllIIlllII[58])));
        "".length();
        iArr5 = new int[lllIIlllII[0]];
        iArr5[lllIIlllII[1]] = lllIIlllII[34];
        if (llIIIIlIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lllIIlllII[0]];
        iArr6[lllIIlllII[1]] = lllIIlllII[35];
        if (llIIIIlIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lllIIlllII[0]];
        iArr7[lllIIlllII[1]] = lllIIlllII[33];
        if (llIIIIlIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lllIIlllII[0]];
        iArr8[lllIIlllII[1]] = lllIIlllII[37];
        if (llIIIIlIlIIll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lllIIlllII[0]];
        iArr9[lllIIlllII[1]] = lllIIlllII[25];
        if (llIIIIlIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIlllII[25], lllIIlllII[26], C0018e.c(lllIIlllII[423], lllIIlllII[424])));
        "".length();
        iArr10 = new int[lllIIlllII[0]];
        iArr10[lllIIlllII[1]] = lllIIlllII[31];
        if (llIIIIlIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIlllII[31], lllIIlllII[28], C0018e.c(lllIIlllII[425], lllIIlllII[417])));
        "".length();
        iArr11 = new int[lllIIlllII[0]];
        iArr11[lllIIlllII[1]] = lllIIlllII[39];
        if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIlllII[39], lllIIlllII[58], C0018e.c(lllIIlllII[426], lllIIlllII[427])));
        "".length();
        if (llIIIIlIlIIll(Bank.contains(item2222222 -> {
            return item2222222.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[lllIIlllII[0]];
        iArr12[lllIIlllII[1]] = lllIIlllII[51];
        if (llIIIIlIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[lllIIlllII[0]];
        iArr13[lllIIlllII[1]] = lllIIlllII[30];
        if (llIIIIlIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIlllII[30], lllIIlllII[4], C0018e.c(lllIIlllII[431], lllIIlllII[432])));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIIlllII[17]];
        iArr[lllIIlllII[1]] = lllIIlllII[30];
        iArr[lllIIlllII[0]] = lllIIlllII[31];
        iArr[lllIIlllII[6]] = lllIIlllII[32];
        iArr[lllIIlllII[7]] = lllIIlllII[33];
        iArr[lllIIlllII[8]] = lllIIlllII[34];
        iArr[lllIIlllII[9]] = lllIIlllII[35];
        iArr[lllIIlllII[10]] = lllIIlllII[36];
        iArr[lllIIlllII[12]] = lllIIlllII[21];
        iArr[lllIIlllII[13]] = lllIIlllII[37];
        iArr[lllIIlllII[14]] = lllIIlllII[38];
        iArr[lllIIlllII[15]] = lllIIlllII[39];
        int i = lllIIlllII[1];
        while (llIIIIlIlIIlI(i, iArr.length)) {
            int[] iArr2 = new int[lllIIlllII[0]];
            iArr2[lllIIlllII[1]] = iArr[i];
            if (llIIIIlIlIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIIlllII[1];
            }
            i++;
            "".length();
            if ((50 ^ 54) <= 0) {
                return (true ^ true) & (true ^ true);
            }
        }
        return lllIIlllII[0];
    }

    private static void llIIIIlIIllIl() {
        lllIIlIIlI = new String[lllIIlllII[476]];
        lllIIlIIlI[lllIIlllII[1]] = llIIIIIlIIlII("WFqqgRVnyjkA9Tr9fgtJtW9JT7/OpAgGLyFjRWO2kXQTeuUnQ8lz4KTY3ZENux73", "urafc");
        lllIIlIIlI[lllIIlllII[0]] = llIIIIIlIIlII("/CQUY3ze2httQ6m/vaTE5ZHL0H6mw7E1", "VArRv");
        lllIIlIIlI[lllIIlllII[6]] = llIIIIIlIIlIl("21/Pz2DMhaoe6f6nHQBmSye1YK4667L6", "erjKc");
        lllIIlIIlI[lllIIlllII[7]] = llIIIIIlIIlII("+NYSsl1zyUu+wiZFZjBHOIPiZZiDorpZ", "DALUE");
        lllIIlIIlI[lllIIlllII[8]] = llIIIIIlIIlII("JnBe3DrzGwQCY5leCSgX1Z1aqZZYTotr", "mxisI");
        lllIIlIIlI[lllIIlllII[9]] = llIIIIIlIIlII("6qNhkvXDbkOli32G3IQrPwSOAUumBwAl", "DeGII");
        lllIIlIIlI[lllIIlllII[10]] = llIIIIIlIIllI("MQ0bHFQKBFYcDBUHBBARCwETWVxUSw==", "ebvyt");
        lllIIlIIlI[lllIIlllII[12]] = llIIIIIlIIlIl("WewLMefn3rzBVmhrJP10pFKUVIlqEXED", "ZNKCm");
        lllIIlIIlI[lllIIlllII[13]] = llIIIIIlIIllI("DicXP1A1Llo/CCotCDMVNCsfelhoYQ==", "ZHzZp");
        lllIIlIIlI[lllIIlllII[14]] = llIIIIIlIIllI("OAsvEkQDAmISHBwBMB4BAgcnV0xdTQ==", "ldBwd");
        lllIIlIIlI[lllIIlllII[15]] = llIIIIIlIIlII("zcIiS0r24dR4A7r4N4Mmaw==", "dvZae");
        lllIIlIIlI[lllIIlllII[17]] = llIIIIIlIIllI("PgImDQ0fDS9JAxcNIwAPEQ==", "vcHia");
        lllIIlIIlI[lllIIlllII[20]] = llIIIIIlIIlIl("XDKkI2dA4pFVbp3GQLNfnXtHIQQAnq8AARnfPp1Em66k2nSjpD4N1TWI2OPId8IsTFdwK9YJd6lOUls5J6S9Ae1ZejMiA+dA", "PFmkr");
        lllIIlIIlI[lllIIlllII[24]] = llIIIIIlIIllI("GShEKygrbQkjKT0kCi16LyQWaig7IwE5eiE/RCwzPChEOC8gKBdmej06DT45JiQKLXo6IkQIDxcEKg0=", "NMdJZ");
        lllIIlIIlI[lllIIlllII[27]] = llIIIIIlIIlII("4Y0j0zWCQ48i/+XXY0/I9YZSMFKFxaLDy+QhhW+0s5sVt+8UmkS0Uuet0w/QPJHE", "hCdVa");
        lllIIlIIlI[lllIIlllII[28]] = llIIIIIlIIllI("DRJLNic/VwY+JikeBTB1KwIOJCF6BB4nJTYeDiR5egQcPiE5HwI5MnoDBHcXDy4iGRI=", "ZwkWU");
        lllIIlIIlI[lllIIlllII[44]] = llIIIIIlIIlII("ojrJKDHTLA+v10S92GkIv0S1jzcWA0rxclt/1U+dMYomk4ODFzTzSeld/eBylXgcZgH3drL2VDY=", "cUqde");
        lllIIlIIlI[lllIIlllII[46]] = llIIIIIlIIlII("BYHTT2FJ7m0=", "wOfpy");
        lllIIlIIlI[lllIIlllII[48]] = llIIIIIlIIlII("oUHKYRFYZ3A=", "PtZte");
        lllIIlIIlI[lllIIlllII[50]] = llIIIIIlIIlII("M3ftoMt2E2rJ0dXcNOCnbiiTj+qAb2Kb", "lKYbH");
        lllIIlIIlI[lllIIlllII[29]] = llIIIIIlIIlIl("eVxk051LFFk=", "jGzPv");
        lllIIlIIlI[lllIIlllII[56]] = llIIIIIlIIlII("i8EbnAXPUdc=", "uegea");
        lllIIlIIlI[lllIIlllII[57]] = llIIIIIlIIlII("mJ3zGEIZHNI=", "OfIXz");
        lllIIlIIlI[lllIIlllII[58]] = llIIIIIlIIllI("Dy4bGQ==", "XKzkz");
        lllIIlIIlI[lllIIlllII[59]] = llIIIIIlIIlIl("gG6XLHSvhS6Jd3DBSjKveA==", "kbVQx");
        lllIIlIIlI[lllIIlllII[60]] = llIIIIIlIIllI("Lw4nBj8=", "hoUrW");
        lllIIlIIlI[lllIIlllII[70]] = llIIIIIlIIlIl("OnrSNZSMh1adRFej7ps3dqKh62QQcfFi", "mdDPh");
        lllIIlIIlI[lllIIlllII[71]] = llIIIIIlIIlII("Emu/P1Da6AJCOAbkGg5vYlyRH0McCb9V", "nosJN");
        lllIIlIIlI[lllIIlllII[72]] = llIIIIIlIIlIl("BLipI2CfiQg=", "npevD");
        lllIIlIIlI[lllIIlllII[73]] = llIIIIIlIIlII("2VEJSatRUVZD6G6Z+a93sA==", "PEaOJ");
        lllIIlIIlI[lllIIlllII[64]] = llIIIIIlIIlII("Vuvk7MlnHVYbMEuEXfXxMPijCEWtfTHJ", "Dkprw");
        lllIIlIIlI[lllIIlllII[74]] = llIIIIIlIIlII("bAyvl35LQ8dm+spPrtFALQ==", "aYGSz");
        lllIIlIIlI[lllIIlllII[75]] = llIIIIIlIIlIl("13VPEPfv+vI=", "BCYXO");
        lllIIlIIlI[lllIIlllII[76]] = llIIIIIlIIllI("IC8qPxNONjM=", "cCCRq");
        lllIIlIIlI[lllIIlllII[69]] = llIIIIIlIIllI("ABkTAD4=", "SqrrU");
        lllIIlIIlI[lllIIlllII[77]] = llIIIIIlIIllI("HAcqNSM=", "OoKGH");
        lllIIlIIlI[lllIIlllII[78]] = llIIIIIlIIlIl("9b4Z+38H3Ss=", "CZYwy");
        lllIIlIIlI[lllIIlllII[79]] = llIIIIIlIIlII("JYhEXMANXFqJsIKhI6e+pw==", "tyiMc");
        lllIIlIIlI[lllIIlllII[11]] = llIIIIIlIIlIl("C++Gu0y06RY=", "axcrr");
        lllIIlIIlI[lllIIlllII[80]] = llIIIIIlIIllI("FRgqIil7ATM=", "VtCOK");
        lllIIlIIlI[lllIIlllII[4]] = llIIIIIlIIlIl("4tJCdAHv80VpwBDojdKrWg==", "NLNNz");
        lllIIlIIlI[lllIIlllII[97]] = llIIIIIlIIlII("mbFmaR+UVhfn96W7gvIAmCNH8x4zbCaT", "IbHOo");
        lllIIlIIlI[lllIIlllII[98]] = llIIIIIlIIlII("KTw09vsQRCg=", "WqtpT");
        lllIIlIIlI[lllIIlllII[99]] = llIIIIIlIIlII("jmsEMrgDL0WYFXZlZvAKFQ==", "hOYan");
        lllIIlIIlI[lllIIlllII[100]] = llIIIIIlIIlII("zfGWr7ea9BZSvArgJWz6uLSNZ0pGIDdq", "bEwcH");
        lllIIlIIlI[lllIIlllII[3]] = llIIIIIlIIlII("Gsns8ejUZvE=", "KzJri");
        lllIIlIIlI[lllIIlllII[101]] = llIIIIIlIIllI("CRspFE4sCCI=", "CnDdc");
        lllIIlIIlI[lllIIlllII[103]] = llIIIIIlIIllI("GBQ/TTk5VT0EITM=", "VuImM");
        lllIIlIIlI[lllIIlllII[2]] = llIIIIIlIIlIl("HOEzXpkfkJIbZx8lka36MA12mRwkamoJ", "gWpdp");
        lllIIlIIlI[lllIIlllII[105]] = llIIIIIlIIlIl("oLa+/Eo0Rro=", "YONtm");
        lllIIlIIlI[lllIIlllII[55]] = llIIIIIlIIlII("FodZ+0sa3tVbNtEpBVE5uA==", "sRdkM");
        lllIIlIIlI[lllIIlllII[22]] = llIIIIIlIIllI("DwI4DClhGyE=", "LnQaK");
        lllIIlIIlI[lllIIlllII[108]] = llIIIIIlIIlII("ETBCDiusrlc=", "OTPOs");
        lllIIlIIlI[lllIIlllII[109]] = llIIIIIlIIlIl("78vtZ2HMzyRzS65bKCLVUw==", "rXnxX");
        lllIIlIIlI[lllIIlllII[110]] = llIIIIIlIIllI("OAIlVjoZQyQfIBIMJA==", "vcSvN");
        lllIIlIIlI[lllIIlllII[111]] = llIIIIIlIIllI("EQ8BIAIx", "FfoDm");
        lllIIlIIlI[lllIIlllII[112]] = llIIIIIlIIllI("NhgtP24OHzA7Nh0f", "zwBTC");
        lllIIlIIlI[lllIIlllII[113]] = llIIIIIlIIllI("JT8CJiU=", "vWcTN");
        lllIIlIIlI[lllIIlllII[114]] = llIIIIIlIIllI("NyYX", "rGcgA");
        lllIIlIIlI[lllIIlllII[115]] = llIIIIIlIIllI("NjoMMTk=", "tHiPR");
        lllIIlIIlI[lllIIlllII[116]] = llIIIIIlIIlII("lzwe823UwjvUKLq35MKRaqGhgPhTqxab", "BnPoW");
        lllIIlIIlI[lllIIlllII[118]] = llIIIIIlIIlIl("Qb1SbONZpbg=", "hnCTK");
        lllIIlIIlI[lllIIlllII[121]] = llIIIIIlIIllI("OhInVwUbUzYFHgEdNVcSHQco", "tsQwq");
        lllIIlIIlI[lllIIlllII[122]] = llIIIIIlIIllI("BicKVSU7cgYUIjFyEBw9MQ==", "TRduQ");
        lllIIlIIlI[lllIIlllII[123]] = llIIIIIlIIlIl("0Rb091PToVM=", "kVIpO");
        lllIIlIIlI[lllIIlllII[124]] = llIIIIIlIIllI("Ego2DiogCj5PDiAHPAAx", "AkPoF");
        lllIIlIIlI[lllIIlllII[125]] = llIIIIIlIIlIl("mVXcmqlypJLKyMAhQ/WjIhQ6IwyiSvT6", "SAUJl");
        lllIIlIIlI[lllIIlllII[127]] = llIIIIIlIIlIl("At8Zt5sD4pmbFqcGq8R3lg==", "QJJMw");
        lllIIlIIlI[lllIIlllII[129]] = llIIIIIlIIlII("+P1GnbJc1hE=", "jKovJ");
        lllIIlIIlI[lllIIlllII[130]] = llIIIIIlIIlIl("vnwnrEQ3osk=", "XLoJT");
        lllIIlIIlI[lllIIlllII[126]] = llIIIIIlIIllI("BwMfGDk7HhEUM3IdFgU+PQM=", "RmyqW");
        lllIIlIIlI[lllIIlllII[131]] = llIIIIIlIIlII("AxATAT6ryGWk3tBjDbpIypiJ7wRepfqR", "uKRYA");
        lllIIlIIlI[lllIIlllII[132]] = llIIIIIlIIllI("IB0eDAsfDQINHU0MCAoM", "mdmxn");
        lllIIlIIlI[lllIIlllII[133]] = llIIIIIlIIlIl("hO70tm2QFa+MVCjkFwgHDneYq+qu0k20", "jSFjf");
        lllIIlIIlI[lllIIlllII[134]] = llIIIIIlIIlII("I/13UUbrAJGqigvC0Qyw3A==", "oyVkF");
        lllIIlIIlI[lllIIlllII[63]] = llIIIIIlIIlIl("VAt/PG5u1UY=", "zthML");
        lllIIlIIlI[lllIIlllII[136]] = llIIIIIlIIlII("8XPOI+V6uDrv+VnGOJfR4Q==", "FniSl");
        lllIIlIIlI[lllIIlllII[137]] = llIIIIIlIIlII("pXv4MQ0AWAlYPbAUzw7TFA==", "pFLGW");
        lllIIlIIlI[lllIIlllII[138]] = llIIIIIlIIllI("HxY/Jis2FGs/JzkH", "XsKRB");
        lllIIlIIlI[lllIIlllII[140]] = llIIIIIlIIllI("PQs2GQoG", "nnWki");
        lllIIlIIlI[lllIIlllII[128]] = llIIIIIlIIlII("UqGw8qW/31Lsa7PIOH+//Q==", "vObBA");
        lllIIlIIlI[lllIIlllII[141]] = llIIIIIlIIlII("JeDf+xHE4aph32+7va9HdfFtidAdTmA8", "lrZJJ");
        lllIIlIIlI[lllIIlllII[142]] = llIIIIIlIIlIl("4h/F2Wr1jKn+3q4f8TSY/Q==", "wVKGG");
        lllIIlIIlI[lllIIlllII[143]] = llIIIIIlIIlIl("85lmKorWNuMo29iNQ1JjvYj/tnu8Y6xO", "ZYZJO");
        lllIIlIIlI[lllIIlllII[144]] = llIIIIIlIIllI("IToHMTUeKhswI0wrETcy", "lCtEP");
        lllIIlIIlI[lllIIlllII[145]] = llIIIIIlIIllI("LyMGIGgWLEc7KQ0vFQ==", "yJgLH");
        lllIIlIIlI[lllIIlllII[146]] = llIIIIIlIIllI("HhgxBB4iBT8IFGsGOBkZJBg=", "KvWmp");
        lllIIlIIlI[lllIIlllII[147]] = llIIIIIlIIllI("KTAVBg8WIAkHGUQkAxMe", "dIfrj");
        lllIIlIIlI[lllIIlllII[148]] = llIIIIIlIIllI("ARwrJhAvACVoGSMPNg==", "FnBHt");
        lllIIlIIlI[lllIIlllII[149]] = llIIIIIlIIlII("/0EE5VuftRKNioM3qh7yGg==", "xgeQD");
        lllIIlIIlI[lllIIlllII[150]] = llIIIIIlIIllI("OTcMIT4FKgItNEwpBTw5Azc=", "lYjHP");
        lllIIlIIlI[lllIIlllII[151]] = llIIIIIlIIlII("EYACPaN8CjYT96m0nGNZUbKN2VJZ4FCJ", "PGvTG");
        lllIIlIIlI[lllIIlllII[152]] = llIIIIIlIIlII("kF+7gmjyfvEuCcLT4zuZccOSYora1dhHh4/p1d20eBc=", "TARJM");
        lllIIlIIlI[lllIIlllII[153]] = llIIIIIlIIlIl("NtX2P2w/B+f8D7q3ZnfdZaTde/zLZ1F+", "olWxD");
        lllIIlIIlI[lllIIlllII[154]] = llIIIIIlIIlIl("mzmEdDoS+qB2NHXNIK7Ds54IDCrTmThL", "UABku");
        lllIIlIIlI[lllIIlllII[155]] = llIIIIIlIIllI("GQ0/MAsn", "IbKYd");
        lllIIlIIlI[lllIIlllII[156]] = llIIIIIlIIlIl("0rTwzuepAoAH1nZLAWXcbOT6/gIB0w5q", "wKfYQ");
        lllIIlIIlI[lllIIlllII[157]] = llIIIIIlIIlIl("ooVCrg8sOws=", "CHrwf");
        lllIIlIIlI[lllIIlllII[158]] = llIIIIIlIIlII("qklZMxSM+JU=", "FDjnO");
        lllIIlIIlI[lllIIlllII[159]] = llIIIIIlIIllI("OgUyJisIBTpnDwgIOCgw", "idTGG");
        lllIIlIIlI[lllIIlllII[160]] = llIIIIIlIIllI("CwonPgQ0Gjs/EmYbMTgD", "FsTJa");
        lllIIlIIlI[lllIIlllII[161]] = llIIIIIlIIllI("MzcBKh8PKg8mFUY7CyweAnkXLAUPNgk=", "fYgCq");
        lllIIlIIlI[lllIIlllII[162]] = llIIIIIlIIlII("mceDnTuHAyL6CgQTpY1puw==", "oooEk");
        lllIIlIIlI[lllIIlllII[163]] = llIIIIIlIIlIl("YQ4e5fucKXA=", "jBdyr");
        lllIIlIIlI[lllIIlllII[164]] = llIIIIIlIIllI("BQsEIx06GxgiC2gaEiUa", "HrwWx");
        lllIIlIIlI[lllIIlllII[165]] = llIIIIIlIIlII("aJozhgOt9J10tda27QQhtQ==", "msPOL");
        lllIIlIIlI[lllIIlllII[166]] = llIIIIIlIIllI("Hy8sDSc2LXgUKzk+", "XJXyN");
        lllIIlIIlI[lllIIlllII[167]] = llIIIIIlIIlII("NaYF6f6RySc=", "XsxIE");
        lllIIlIIlI[lllIIlllII[168]] = llIIIIIlIIlII("plz6vGQmuthyjxeSAdtqXQ==", "LgQym");
        lllIIlIIlI[lllIIlllII[169]] = llIIIIIlIIllI("NgIcDRYKHxIBHEMcFRARDAI=", "clzdx");
        lllIIlIIlI[lllIIlllII[170]] = llIIIIIlIIlII("O3kx/uzB1kbRkuZSyShTgA==", "NHyMO");
        lllIIlIIlI[lllIIlllII[171]] = llIIIIIlIIllI("Hw8DETAgHx8QJnIeFRc3", "RvpeU");
        lllIIlIIlI[lllIIlllII[172]] = llIIIIIlIIlIl("9MOkIJ7Jxk+IRFDOEd0/1g==", "Qhdba");
        lllIIlIIlI[lllIIlllII[173]] = llIIIIIlIIlIl("L+id3IC0cQtCpiQK07cibEFUtnERWIXc", "HOACF");
        lllIIlIIlI[lllIIlllII[174]] = llIIIIIlIIlII("XkVZcGmXHvUYmi1+IBbyWw==", "YhRUZ");
        lllIIlIIlI[lllIIlllII[175]] = llIIIIIlIIlIl("qOf9PHm8gTXVSH7jj4jqVg==", "XaPqL");
        lllIIlIIlI[lllIIlllII[176]] = llIIIIIlIIllI("JQ0sAxQZECIPHlABJgUVFEM6BQ4ZDCQ=", "pcJjz");
        lllIIlIIlI[lllIIlllII[177]] = llIIIIIlIIlIl("0qn8SCdUJ82E6sJOhZBNV1nFKg3SuSno", "hykyk");
        lllIIlIIlI[lllIIlllII[178]] = llIIIIIlIIlII("wfdGmcRulumF+gbfVXnIeJi7YTIKKazk", "xUhdF");
        lllIIlIIlI[lllIIlllII[179]] = llIIIIIlIIlIl("pgEGBaHezGHGuK2klG8ZnuhvZMuBhlOB", "VDvpy");
        lllIIlIIlI[lllIIlllII[180]] = llIIIIIlIIllI("EA4CDDJyEgIXPz0M", "RbmcV");
        lllIIlIIlI[lllIIlllII[181]] = llIIIIIlIIlIl("Os3uceuRt0WWaM7gNBBhVw==", "NSNtc");
        lllIIlIIlI[lllIIlllII[182]] = llIIIIIlIIllI("Myk5HQ==", "wFVos");
        lllIIlIIlI[lllIIlllII[185]] = llIIIIIlIIllI("EjU2Hw==", "VZYmt");
        lllIIlIIlI[lllIIlllII[186]] = llIIIIIlIIlIl("IemabbjAlQU=", "TWfjZ");
        lllIIlIIlI[lllIIlllII[187]] = llIIIIIlIIllI("Ejo2Bgw=", "QRSux");
        lllIIlIIlI[lllIIlllII[188]] = llIIIIIlIIllI("DSctGQ==", "BWHwe");
        lllIIlIIlI[lllIIlllII[189]] = llIIIIIlIIllI("CSMVPxE=", "JKpLe");
        lllIIlIIlI[lllIIlllII[190]] = llIIIIIlIIlIl("T79uMLNZlF0=", "TJhKg");
        lllIIlIIlI[lllIIlllII[191]] = llIIIIIlIIlII("9WZPafSkBoU=", "VlAnM");
        lllIIlIIlI[lllIIlllII[192]] = llIIIIIlIIlII("EUjkfkFB/qM=", "bTZqB");
        lllIIlIIlI[lllIIlllII[193]] = llIIIIIlIIlIl("2icSUvn2ryQ=", "PKwBc");
        lllIIlIIlI[lllIIlllII[194]] = llIIIIIlIIllI("NxUoGBEM", "dpIjr");
        lllIIlIIlI[lllIIlllII[195]] = llIIIIIlIIlIl("ekoSMLjswng=", "IYUwh");
        lllIIlIIlI[lllIIlllII[196]] = llIIIIIlIIlII("vBXDedi79UY=", "CKteK");
        lllIIlIIlI[lllIIlllII[197]] = llIIIIIlIIlIl("0j+CbuPYN5z/iogKWW/a7g==", "OfeUy");
        lllIIlIIlI[lllIIlllII[200]] = llIIIIIlIIllI("ACQfEi8=", "BVzsD");
        lllIIlIIlI[lllIIlllII[201]] = llIIIIIlIIllI("JCMmVDgFYjcGIx8sNFQvAzYp", "jBPtL");
        lllIIlIIlI[lllIIlllII[202]] = llIIIIIlIIlII("V+F98En3UWSj5hdx72oMTRWLccG1SA1L", "vkbYD");
        lllIIlIIlI[lllIIlllII[203]] = llIIIIIlIIlII("ujK9Teq8OpA=", "PdPUN");
        lllIIlIIlI[lllIIlllII[204]] = llIIIIIlIIlIl("p1BhqPs+jfDte7bn6wZ1IA==", "yQFIl");
        lllIIlIIlI[lllIIlllII[205]] = llIIIIIlIIlII("74BPEpGW3QcXutnMB11a2Q==", "bvyFY");
        lllIIlIIlI[lllIIlllII[206]] = llIIIIIlIIllI("ESkrDio8aCMDITE8", "YHEjF");
        lllIIlIIlI[lllIIlllII[207]] = llIIIIIlIIllI("PgIVOwM=", "mjtIh");
        lllIIlIIlI[lllIIlllII[208]] = llIIIIIlIIlII("CgGEmz4mKFI=", "EcjwF");
        lllIIlIIlI[lllIIlllII[26]] = llIIIIIlIIlII("GtUZH467ZHs=", "OuMdl");
        lllIIlIIlI[lllIIlllII[209]] = llIIIIIlIIlIl("Nz016muitE4=", "PoVvZ");
        lllIIlIIlI[lllIIlllII[210]] = llIIIIIlIIllI("NBozDwQ=", "phZao");
        lllIIlIIlI[lllIIlllII[212]] = llIIIIIlIIlII("cZNIuaq8PRE=", "QqXNm");
        lllIIlIIlI[lllIIlllII[120]] = llIIIIIlIIllI("AwswLSU=", "GyYCN");
        lllIIlIIlI[lllIIlllII[215]] = llIIIIIlIIlII("wFQuClexXE4=", "KjhHw");
        lllIIlIIlI[lllIIlllII[216]] = llIIIIIlIIlIl("V4mi9k/QG6+cB7Raw/9V0w==", "yGepz");
        lllIIlIIlI[lllIIlllII[217]] = llIIIIIlIIllI("IzMuEBMJ", "bGZqp");
        lllIIlIIlI[lllIIlllII[218]] = llIIIIIlIIlIl("tBhUvryXE8A=", "xyVIW");
        lllIIlIIlI[lllIIlllII[219]] = llIIIIIlIIlII("ZiS8DUDF5sw=", "hLphv");
        lllIIlIIlI[lllIIlllII[220]] = llIIIIIlIIlII("qqD9FQfqISc=", "eplML");
        lllIIlIIlI[lllIIlllII[221]] = llIIIIIlIIlIl("SM9dxz2jd6w=", "vfXSX");
        lllIIlIIlI[lllIIlllII[222]] = llIIIIIlIIlIl("ANxoUfiP77I=", "nqqYI");
        lllIIlIIlI[lllIIlllII[223]] = llIIIIIlIIlIl("Fxt3ePoxr0Y=", "ADXKo");
        lllIIlIIlI[lllIIlllII[224]] = llIIIIIlIIlII("oC3wlFZGFMU=", "blDQM");
        lllIIlIIlI[lllIIlllII[225]] = llIIIIIlIIlII("rSi0aBtobG4=", "CrEcw");
        lllIIlIIlI[lllIIlllII[226]] = llIIIIIlIIlII("QS2jRlkX+FUx26yhNxa1JC6ISLvg2pIu", "gGLku");
        lllIIlIIlI[lllIIlllII[230]] = llIIIIIlIIllI("KD0pLgU=", "jOLOn");
        lllIIlIIlI[lllIIlllII[231]] = llIIIIIlIIlIl("bI85B5DdoKw=", "tOCGK");
        lllIIlIIlI[lllIIlllII[232]] = llIIIIIlIIlII("8IcjFc8Msmc=", "kFHmO");
        lllIIlIIlI[lllIIlllII[233]] = llIIIIIlIIllI("FxcvNTM+Hg==", "RzJGR");
        lllIIlIIlI[lllIIlllII[234]] = llIIIIIlIIllI("FAAmRDsVQT8IKxcAPg==", "zaPdO");
        lllIIlIIlI[lllIIlllII[235]] = llIIIIIlIIlIl("+sPmph6CSO08U37RQvRDEw==", "tAseI");
        lllIIlIIlI[lllIIlllII[236]] = llIIIIIlIIlII("5unDBj2fALM=", "LUqxm");
        lllIIlIIlI[lllIIlllII[237]] = llIIIIIlIIllI("GDEqBR4jLDk=", "LCKuz");
        lllIIlIIlI[lllIIlllII[229]] = llIIIIIlIIlIl("F5exOl2B3yY=", "zkdxZ");
        lllIIlIIlI[lllIIlllII[238]] = llIIIIIlIIlII("izyIh6yJwl7M8YxwOLuIqA==", "WurfG");
        lllIIlIIlI[lllIIlllII[239]] = llIIIIIlIIlIl("wNOUP3xZXHu63h7Hu5a/zA==", "Pqzif");
        lllIIlIIlI[lllIIlllII[240]] = llIIIIIlIIllI("BwQoCQg8GTs=", "SvIyl");
        lllIIlIIlI[lllIIlllII[241]] = llIIIIIlIIlIl("BbIEouN3qCo7OSlybUsFQg==", "UcKrJ");
        lllIIlIIlI[lllIIlllII[242]] = llIIIIIlIIllI("AjQCOCAwNAp5BDA5CDY7", "QUdYL");
        lllIIlIIlI[lllIIlllII[243]] = llIIIIIlIIlIl("wpddyMT27N6rPU0wakXFTb4C4tfPCC0E", "UaNDR");
        lllIIlIIlI[lllIIlllII[244]] = llIIIIIlIIlIl("kK2PLuAX16LdRaNwjv59YMnvchs1eafN", "PMYpE");
        lllIIlIIlI[lllIIlllII[245]] = llIIIIIlIIlIl("YmLYqVbnHzH24zGKNpdew82M8FtidOmM", "aVSiM");
        lllIIlIIlI[lllIIlllII[246]] = llIIIIIlIIllI("PgIKNAwRDwVqGFgABDkOCw==", "xnkMk");
        lllIIlIIlI[lllIIlllII[247]] = llIIIIIlIIlII("kDAovE59Xkg=", "tykNe");
        lllIIlIIlI[lllIIlllII[248]] = llIIIIIlIIllI("Lh4oLzYOG2knPgYBJQ==", "ghIAR");
        lllIIlIIlI[lllIIlllII[249]] = llIIIIIlIIlIl("XiigJYZpi27FtKBrgN5X3WwxRsa/OY6n", "pdGLl");
        lllIIlIIlI[lllIIlllII[251]] = llIIIIIlIIlII("w0Jk/4sstb8=", "XBMrw");
        lllIIlIIlI[lllIIlllII[252]] = llIIIIIlIIlII("5WgBT711siU=", "aQUCh");
        lllIIlIIlI[lllIIlllII[253]] = llIIIIIlIIllI("IRoZBA==", "ehvtN");
        lllIIlIIlI[lllIIlllII[254]] = llIIIIIlIIlIl("0cus0aTFyf0=", "UCLfq");
        lllIIlIIlI[lllIIlllII[255]] = llIIIIIlIIllI("JxwFBR0=", "dtdls");
        lllIIlIIlI[lllIIlllII[256]] = llIIIIIlIIlIl("lBfXn5H0QejQdv67R6risMa9q65gVPoq", "GiAAi");
        lllIIlIIlI[lllIIlllII[258]] = llIIIIIlIIlIl("f2N0onKVau8=", "CLVBT");
        lllIIlIIlI[lllIIlllII[259]] = llIIIIIlIIllI("BBE7PA==", "RxZPr");
        lllIIlIIlI[lllIIlllII[260]] = llIIIIIlIIlIl("Q+9AXyk6L0k=", "KsKQL");
        lllIIlIIlI[lllIIlllII[261]] = llIIIIIlIIlII("yGrgj/Ia9nA=", "Xnwke");
        lllIIlIIlI[lllIIlllII[262]] = llIIIIIlIIllI("Jy8zOyI=", "dGRRL");
        lllIIlIIlI[lllIIlllII[263]] = llIIIIIlIIlII("TmQQ9rjtefZEJ5SREnAOIsctGPuTGEp3", "xUgxL");
        lllIIlIIlI[lllIIlllII[264]] = llIIIIIlIIlIl("1M7xx0dBHTOzYEqzfOGeNnezBUdWJUgC", "vTPhk");
        lllIIlIIlI[lllIIlllII[265]] = llIIIIIlIIlII("9I3jAxSbxIZxIDuw+MQ9PG4NGMegWZqv", "YNPxr");
        lllIIlIIlI[lllIIlllII[266]] = llIIIIIlIIllI("EAQkLBUgQQAwBjIb", "FaHEt");
        lllIIlIIlI[lllIIlllII[267]] = llIIIIIlIIllI("KDEnUwEJcCEGFw==", "fPQsu");
        lllIIlIIlI[lllIIlllII[269]] = llIIIIIlIIlIl("jnCZNX/whvR/LMWvtZMxiw==", "RusoF");
        lllIIlIIlI[lllIIlllII[270]] = llIIIIIlIIllI("LiAHPg==", "aPbPp");
        lllIIlIIlI[lllIIlllII[271]] = llIIIIIlIIlII("wAG06+onK5mGYw+CBJ+wBQ==", "cnpUl");
        lllIIlIIlI[lllIIlllII[272]] = llIIIIIlIIlII("/EKa+qjtcOUoi8INWmhH7w==", "jGFGG");
        lllIIlIIlI[lllIIlllII[273]] = llIIIIIlIIllI("GjUnEBkqcAMMCjgq", "LPKyx");
        lllIIlIIlI[lllIIlllII[274]] = llIIIIIlIIlIl("hVmiq09JTIVWl6rXBsrXD/ne1KM0kWoe", "UUKLs");
        lllIIlIIlI[lllIIlllII[275]] = llIIIIIlIIllI("PzALADQPdS8cJx0v", "iUgiU");
        lllIIlIIlI[lllIIlllII[276]] = llIIIIIlIIlII("YSbJm/bMFtI=", "vTweR");
        lllIIlIIlI[lllIIlllII[277]] = llIIIIIlIIlIl("4ATwn+FbMJbS7FVUGnki+t8aGgZrnm2w", "uRTeT");
        lllIIlIIlI[lllIIlllII[278]] = llIIIIIlIIllI("OAQAcTwMSw0nMgQPDSJzQlpUeA==", "jkdQS");
        lllIIlIIlI[lllIIlllII[279]] = llIIIIIlIIllI("PSshCBEUIg==", "xFDzp");
        lllIIlIIlI[lllIIlllII[280]] = llIIIIIlIIlIl("BSKapJZOSJ9/f9UzaVkYc9daTMaHuigA", "OyoEc");
        lllIIlIIlI[lllIIlllII[281]] = llIIIIIlIIlIl("wBOFK1tqVwwp/kxkz7PXTDQp9VODltuL", "bxBVE");
        lllIIlIIlI[lllIIlllII[282]] = llIIIIIlIIlIl("OY2533g5YLusCwovWb+7C5H/pXTrIusl", "TNBXM");
        lllIIlIIlI[lllIIlllII[283]] = llIIIIIlIIlIl("x8hFHYK00puc7RziQ13OUzA3uifbGNaH1AJ97RgeQ98=", "KyBJM");
        lllIIlIIlI[lllIIlllII[284]] = llIIIIIlIIlII("HZCtVr4R6b+5K/xILWwLuNk4Jcx/wgx21saF/vf9vaw=", "Dksdj");
        lllIIlIIlI[lllIIlllII[285]] = llIIIIIlIIlIl("hXPeWqhLZAgND3qJUc7/Sz06zleBmZaF", "SoSZG");
        lllIIlIIlI[lllIIlllII[286]] = llIIIIIlIIlIl("3iS0Mvy2jIid5e9ttqkI/Q==", "ztjSk");
        lllIIlIIlI[lllIIlllII[287]] = llIIIIIlIIlII("eBNVjJkYlDpTYjOrNtwipQ==", "SMsIm");
        lllIIlIIlI[lllIIlllII[288]] = llIIIIIlIIlII("SHpw/692aco=", "iDjvM");
        lllIIlIIlI[lllIIlllII[289]] = llIIIIIlIIllI("Nw8TKwtZFgo=", "tczFi");
        lllIIlIIlI[lllIIlllII[290]] = llIIIIIlIIlIl("KUgeMDxtrQhWw4c4AOwW5A==", "tvEMU");
        lllIIlIIlI[lllIIlllII[291]] = llIIIIIlIIllI("Bi8xbS4HbighPgUvKQ==", "hNGMZ");
        lllIIlIIlI[lllIIlllII[292]] = llIIIIIlIIlII("DgId5rzHiVFHDDyFByJqUQ==", "ZYoRx");
        lllIIlIIlI[lllIIlllII[293]] = llIIIIIlIIllI("JyQOOQ==", "hTkWI");
        lllIIlIIlI[lllIIlllII[294]] = llIIIIIlIIlII("DcRX8JuEwJNyyTffT5xyyQ==", "UJdFs");
        lllIIlIIlI[lllIIlllII[295]] = llIIIIIlIIlIl("vdzoSCtEtOM=", "REgvO");
        lllIIlIIlI[lllIIlllII[296]] = llIIIIIlIIlIl("Y8WKdMQGG5MhU59lErAsYQ==", "jfgoG");
        lllIIlIIlI[lllIIlllII[38]] = llIIIIIlIIllI("DSofLi9jIhk0Iw==", "NFvCM");
        lllIIlIIlI[lllIIlllII[297]] = llIIIIIlIIlIl("UY9lP0B08nPWwKQsUSg2Jw==", "zzKgS");
        lllIIlIIlI[lllIIlllII[298]] = llIIIIIlIIlIl("Nly2nnQ9tUoEwdQhCcrX9A==", "QLyFy");
        lllIIlIIlI[lllIIlllII[299]] = llIIIIIlIIllI("EgkRJxYgCRlmMiAEGykN", "AhwFz");
        lllIIlIIlI[lllIIlllII[300]] = llIIIIIlIIllI("Ki4tIAkKK2woAQIxIA==", "cXLNm");
        lllIIlIIlI[lllIIlllII[301]] = llIIIIIlIIllI("PxUXPh4fEFY2FhcKGg==", "vcvPz");
        lllIIlIIlI[lllIIlllII[36]] = llIIIIIlIIlII("RYGodOCyqtg=", "jDOid");
        lllIIlIIlI[lllIIlllII[302]] = llIIIIIlIIlIl("9q+homiND2I=", "zRNvJ");
        lllIIlIIlI[lllIIlllII[303]] = llIIIIIlIIlIl("eD0uIWTe+Cq4C3baaU/B4w==", "BfFmD");
        lllIIlIIlI[lllIIlllII[304]] = llIIIIIlIIlIl("0LhUr5Fet6Xv3v57Wid5oQ==", "QwEYH");
        lllIIlIIlI[lllIIlllII[305]] = llIIIIIlIIllI("EyInLTthBzslIyAt", "ACIDH");
        lllIIlIIlI[lllIIlllII[306]] = llIIIIIlIIlIl("YrxPg8Hh7kQ=", "scAOH");
        lllIIlIIlI[lllIIlllII[307]] = llIIIIIlIIlIl("JWbgtUiE3mQ=", "hOxEV");
        lllIIlIIlI[lllIIlllII[308]] = llIIIIIlIIllI("FSgT", "PIgdd");
        lllIIlIIlI[lllIIlllII[309]] = llIIIIIlIIlIl("sn3YqDmd1T4=", "mGzlm");
        lllIIlIIlI[lllIIlllII[310]] = llIIIIIlIIlIl("VZ1vx79ObAGpcnUhLBsKCg==", "rZvWw");
        lllIIlIIlI[lllIIlllII[311]] = llIIIIIlIIlIl("bjbA10u/eYI=", "NJhbk");
        lllIIlIIlI[lllIIlllII[312]] = llIIIIIlIIllI("BBgIAwc=", "Wpiql");
        lllIIlIIlI[lllIIlllII[313]] = llIIIIIlIIllI("GxIlNzI=", "HzDEY");
        lllIIlIIlI[lllIIlllII[314]] = llIIIIIlIIllI("MBsC", "uzvxF");
        lllIIlIIlI[lllIIlllII[315]] = llIIIIIlIIlII("qtd0Gy1Ly/o=", "hQymz");
        lllIIlIIlI[lllIIlllII[316]] = llIIIIIlIIllI("KyIRKy8=", "xJpYD");
        lllIIlIIlI[lllIIlllII[317]] = llIIIIIlIIllI("BCEsMBIoPCg=", "AROQb");
        lllIIlIIlI[lllIIlllII[318]] = llIIIIIlIIlII("95je+njmA2C3MG2xlLIq6Q==", "Kxkns");
        lllIIlIIlI[lllIIlllII[319]] = llIIIIIlIIllI("BxkJASMtEU0EJiwZCUYoLBsP", "CvmfJ");
        lllIIlIIlI[lllIIlllII[320]] = llIIIIIlIIlIl("B8a5KBAHaFTsXRfoQW5Y9Q==", "GALtN");
        lllIIlIIlI[lllIIlllII[321]] = llIIIIIlIIlIl("lIEMg/dBwm2vG++K2ygNcQ==", "RoVei");
        lllIIlIIlI[lllIIlllII[322]] = llIIIIIlIIllI("JxMYLScN", "fglLD");
        lllIIlIIlI[lllIIlllII[323]] = llIIIIIlIIlIl("3CgsivNw0tM=", "uEazn");
        lllIIlIIlI[lllIIlllII[324]] = llIIIIIlIIllI("BCYNEyM=", "WNlaH");
        lllIIlIIlI[lllIIlllII[325]] = llIIIIIlIIllI("ODIBIhAS", "yFuCs");
        lllIIlIIlI[lllIIlllII[326]] = llIIIIIlIIlII("KlgRZ2W7w/RmRJ2/zbk9wg==", "gNsyE");
        lllIIlIIlI[lllIIlllII[327]] = llIIIIIlIIlIl("G9nzoK6vpl18dkaKtXiOgA==", "IxcoD");
        lllIIlIIlI[lllIIlllII[328]] = llIIIIIlIIlII("Qmy87mbcTc4=", "ZqVMp");
        lllIIlIIlI[lllIIlllII[329]] = llIIIIIlIIlIl("HzkpYuZsD2g=", "RFcrF");
        lllIIlIIlI[lllIIlllII[331]] = llIIIIIlIIlIl("wPr9zNGnPsmLbQQYQgQ5jeHkaRl/1cMt", "rHERE");
        lllIIlIIlI[lllIIlllII[332]] = llIIIIIlIIlII("lFVRJnKVQvE=", "jaXFz");
        lllIIlIIlI[lllIIlllII[333]] = llIIIIIlIIlII("rKj+KN0+lxvinA9o3SXSTA==", "PrDph");
        lllIIlIIlI[lllIIlllII[334]] = llIIIIIlIIllI("ERsRFxM7", "Poevp");
        lllIIlIIlI[lllIIlllII[335]] = llIIIIIlIIlIl("kVATFPybMZQ=", "LIUFo");
        lllIIlIIlI[lllIIlllII[336]] = llIIIIIlIIlIl("/YLmh102q1I=", "fTHul");
        lllIIlIIlI[lllIIlllII[337]] = llIIIIIlIIlII("TAxkgqxwLfE=", "wpCHT");
        lllIIlIIlI[lllIIlllII[338]] = llIIIIIlIIlII("c+/ilHcgtlw=", "WAArp");
        lllIIlIIlI[lllIIlllII[339]] = llIIIIIlIIlII("hEWhCVv+xKE=", "sgVZL");
        lllIIlIIlI[lllIIlllII[340]] = llIIIIIlIIllI("Phg+chk/WSc+CT0YJg==", "PyHRm");
        lllIIlIIlI[lllIIlllII[341]] = llIIIIIlIIllI("LjUvOCYVKDw=", "zGNHB");
        lllIIlIIlI[lllIIlllII[342]] = llIIIIIlIIlIl("kbxf6ubhQkk=", "YwkZl");
        lllIIlIIlI[lllIIlllII[343]] = llIIIIIlIIlIl("MLiUB/vUXVkl+qBiojBwBw==", "yZKBa");
        lllIIlIIlI[lllIIlllII[344]] = llIIIIIlIIlII("ahxKsSkAW7I=", "nlPgJ");
        lllIIlIIlI[lllIIlllII[345]] = llIIIIIlIIlII("KrFcWh9IOYm8wsDk+pWZcw==", "DBCHD");
        lllIIlIIlI[lllIIlllII[346]] = llIIIIIlIIlII("51BJcW9nLC6b9O36WsiPdg==", "EJKbA");
        lllIIlIIlI[lllIIlllII[347]] = llIIIIIlIIlIl("cfyUF3MDGPFRemxxzFDM+A==", "ifRCF");
        lllIIlIIlI[lllIIlllII[348]] = llIIIIIlIIllI("DioqNAFgIiwuDQ==", "MFCYc");
        lllIIlIIlI[lllIIlllII[349]] = llIIIIIlIIlIl("XgVVo+YS6hmem02LKzoOGw==", "yHaoa");
        lllIIlIIlI[lllIIlllII[350]] = llIIIIIlIIlIl("Jf/SYzjsGNgiJUk1aF3bYFDqbHq09JjZ", "mImIS");
        lllIIlIIlI[lllIIlllII[351]] = llIIIIIlIIlII("sQzJWdsJNYIzb9vPGqriKDaFcPxUTk+P", "tLimy");
        lllIIlIIlI[lllIIlllII[352]] = llIIIIIlIIlII("nuFD0TIQhnGFeNyZaXi4mwU/M0+HDECW", "GjewX");
        lllIIlIIlI[lllIIlllII[353]] = llIIIIIlIIlIl("bGxPm0O1pkY=", "flSSJ");
        lllIIlIIlI[lllIIlllII[354]] = llIIIIIlIIlIl("29ucFfzLdm0=", "NnErf");
        lllIIlIIlI[lllIIlllII[355]] = llIIIIIlIIllI("MhkfAjsDGw==", "qvqdR");
        lllIIlIIlI[lllIIlllII[356]] = llIIIIIlIIllI("KS01IyQ=", "zETQO");
        lllIIlIIlI[lllIIlllII[357]] = llIIIIIlIIllI("KDIDegYJcwE1EEYxFDQZ", "fSuZr");
        lllIIlIIlI[lllIIlllII[359]] = llIIIIIlIIlIl("GkkXGuxbxa4=", "hyuVq");
        lllIIlIIlI[lllIIlllII[360]] = llIIIIIlIIlII("nLYiICCfgbY=", "UlDAG");
        lllIIlIIlI[lllIIlllII[361]] = llIIIIIlIIlIl("lZnNFHnHc6E=", "aMWUJ");
        lllIIlIIlI[lllIIlllII[362]] = llIIIIIlIIlIl("cnMY6Nung6Y=", "pVABx");
        lllIIlIIlI[lllIIlllII[363]] = llIIIIIlIIlIl("NVUoaCp1HB0=", "MTVTN");
        lllIIlIIlI[lllIIlllII[364]] = llIIIIIlIIlII("5nEV2T9ONIk=", "dNeLo");
        lllIIlIIlI[lllIIlllII[365]] = llIIIIIlIIllI("OA8QNTc=", "ofuYS");
        lllIIlIIlI[lllIIlllII[366]] = llIIIIIlIIllI("NzkjKBI=", "rHVAb");
        lllIIlIIlI[lllIIlllII[367]] = llIIIIIlIIllI("JzUnPA==", "pPFNr");
        lllIIlIIlI[lllIIlllII[373]] = llIIIIIlIIllI("KCsYZjEJagwnNgMmDyIhAzg=", "fJnFE");
        lllIIlIIlI[lllIIlllII[374]] = llIIIIIlIIlII("dylLiDDzvVw=", "iYiVC");
        lllIIlIIlI[lllIIlllII[375]] = llIIIIIlIIlIl("P7m5j5ura7M=", "Ijhcq");
        lllIIlIIlI[lllIIlllII[376]] = llIIIIIlIIlII("m/uRO2BkhCzisQWwinTzjg==", "pBKNU");
        lllIIlIIlI[lllIIlllII[377]] = llIIIIIlIIllI("EzAGOBEtIlUnGS8p", "CEuPx");
        lllIIlIIlI[lllIIlllII[378]] = llIIIIIlIIlII("UAywnf4xk7w=", "ouNnt");
        lllIIlIIlI[lllIIlllII[379]] = llIIIIIlIIlII("iHJ0ef1cZnU=", "UbJUn");
        lllIIlIIlI[lllIIlllII[381]] = llIIIIIlIIlII("BqrnilcHUaE=", "iYNFc");
        lllIIlIIlI[lllIIlllII[382]] = llIIIIIlIIlII("fn9Gvcb7tGw/J5O8cnExmw==", "SLvqb");
        lllIIlIIlI[lllIIlllII[383]] = llIIIIIlIIlII("OuiqIpaawgwPCYLFd2YsHQ==", "OhQEx");
        lllIIlIIlI[lllIIlllII[389]] = llIIIIIlIIlII("6rCgPNk0enWxlvsFDVLgpA==", "ibaKX");
        lllIIlIIlI[lllIIlllII[391]] = llIIIIIlIIllI("ABEIBHQ+Cw==", "JdetY");
        lllIIlIIlI[lllIIlllII[392]] = llIIIIIlIIlII("xDzB2/u9hFw=", "bnBCR");
        lllIIlIIlI[lllIIlllII[393]] = llIIIIIlIIllI("Aw4ABhY9", "Oodbs");
        lllIIlIIlI[lllIIlllII[394]] = llIIIIIlIIlIl("SQw5J2bhypOhFqbTtZG1Mg==", "tYzeM");
        lllIIlIIlI[lllIIlllII[397]] = llIIIIIlIIllI("GRYfaxo4VwEkGyQSSScPMxMMOQ==", "WwiKn");
        lllIIlIIlI[lllIIlllII[398]] = llIIIIIlIIlII("VGZASa4vGfA=", "HZdki");
        lllIIlIIlI[lllIIlllII[399]] = llIIIIIlIIlII("ljAGWCUngQo=", "JJnNl");
        lllIIlIIlI[lllIIlllII[400]] = llIIIIIlIIllI("EzobPCl9Mh0mJQ==", "PVrQK");
        lllIIlIIlI[lllIIlllII[401]] = llIIIIIlIIlII("uHyFwGGhIx7ChxGe75GgOg==", "XweFq");
        lllIIlIIlI[lllIIlllII[433]] = llIIIIIlIIllI("NQgCKmsOAU8qMxECHSYuDwQK", "agoOK");
        lllIIlIIlI[lllIIlllII[434]] = llIIIIIlIIlIl("suTBl8IFYhGdQdZ9oRKAr2KaAoxaEY19", "rXOQB");
        lllIIlIIlI[lllIIlllII[5]] = llIIIIIlIIllI("OzoJDgBILBYGEAk7", "hOykr");
        lllIIlIIlI[lllIIlllII[437]] = llIIIIIlIIlII("LhpO83qfXr/n8GjKhqVzTQ==", "RFrjP");
        lllIIlIIlI[lllIIlllII[438]] = llIIIIIlIIlIl("VyQDwTwGptM=", "VUQvH");
        lllIIlIIlI[lllIIlllII[439]] = llIIIIIlIIlIl("EtP/lLA8X1Jmy580CHbZUf/flnfe6dZe", "nsjnB");
        lllIIlIIlI[lllIIlllII[440]] = llIIIIIlIIllI("CwEQGj93EQoaNSoR", "ZtyyT");
        lllIIlIIlI[lllIIlllII[441]] = llIIIIIlIIllI("FSAmCA==", "gOInw");
        lllIIlIIlI[lllIIlllII[442]] = llIIIIIlIIllI("Jj8aGylIJgM=", "eSsvK");
        lllIIlIIlI[lllIIlllII[454]] = llIIIIIlIIlIl("brfadTAEcHU=", "daSDO");
        lllIIlIIlI[lllIIlllII[455]] = llIIIIIlIIlII("SPFRq/htHcafkuJ77kVNmUqTJrpS6GGVaCnHmXCJv9Nb7HnQDrdEon/7di9rrwUo", "wMnwo");
        lllIIlIIlI[lllIIlllII[456]] = llIIIIIlIIlII("mY+oYjx5kS6FgWt646NwAyqd5ynLbmVSrCGYnCEe+3nxeEMZvuvg4IJbdQ8/MlFUlyT4KRn4Kyc=", "avoat");
        lllIIlIIlI[lllIIlllII[457]] = llIIIIIlIIllI("ST4uGTsRLDRZaCUmZgknFGktHicWaScSJxQ9ZgQgBGkLCToEODMVdw==", "aIFpH");
        lllIIlIIlI[lllIIlllII[458]] = llIIIIIlIIlIl("YRM1jKrRWyalHVUg2rpXS3JeL9IbUt2V7pP0trAQfzaQYobNJ203d6jm3AbvfbSZ", "uCGAW");
        lllIIlIIlI[lllIIlllII[459]] = llIIIIIlIIlII("8Y2+hBfnyRiTWB8h+FI6j3bgGY7wYOIgcwWub1qiQNw=", "rNJXZ");
        lllIIlIIlI[lllIIlllII[460]] = llIIIIIlIIlII("q3aykQbXBX5Jr/+dyP1lNI3uuWcGuRw1rsqz+00s9xE=", "QsiLT");
        lllIIlIIlI[lllIIlllII[461]] = llIIIIIlIIlII("yAJPNJ6DwVXAp3+1B4rqdNDXEIO38ujSrfzJzwRRGHaEdzMQTjjVpA==", "TIKUF");
        lllIIlIIlI[lllIIlllII[462]] = llIIIIIlIIlII("wpp9UZv6oGEL3+2jQu6cCmpyI/+v01oI1H/NQmja1o/NZwoewl6yOg==", "QFCep");
        lllIIlIIlI[lllIIlllII[463]] = llIIIIIlIIllI("MgEzFW0WAT0UIQFJG0EpCkk8Djpa", "eiRaM");
        lllIIlIIlI[lllIIlllII[464]] = llIIIIIlIIlIl("PyK5ZuED335SPisl+lTZAqg0lh63t8sqGZTJVRCr16T3coo+5KXOoiQdUUXf/l7c", "XYgcl");
        lllIIlIIlI[lllIIlllII[465]] = llIIIIIlIIllI("JgglK39JDyEzN0kXLDdzHgI9fA==", "icDRS");
        lllIIlIIlI[lllIIlllII[466]] = llIIIIIlIIllI("DQwYI29rDRM0JmwWVjIrLkUbKS0uHFg=", "KevFC");
        lllIIlIIlI[lllIIlllII[467]] = llIIIIIlIIlIl("tzGeyS54vVwRF5kEn4wfui2bj5PVLI8J", "NQJHu");
        lllIIlIIlI[lllIIlllII[468]] = llIIIIIlIIlII("rFlGR3Nvr4k=", "GtJBn");
        lllIIlIIlI[lllIIlllII[469]] = llIIIIIlIIlII("EZzu+DhNM4SBU2PpRR4PsLwa8Vy7jlnM", "FspvM");
        lllIIlIIlI[lllIIlllII[470]] = llIIIIIlIIllI("OA0hdQ==", "oeXJz");
        lllIIlIIlI[lllIIlllII[471]] = llIIIIIlIIllI("KjE9BEsbOzpBDA16", "bTOak");
        lllIIlIIlI[lllIIlllII[472]] = llIIIIIlIIlII("lIn8YHHaUoGtEJjOr7w6XwWkRbhwLv9FWXx1coa+NfY=", "bsJYC");
        lllIIlIIlI[lllIIlllII[473]] = llIIIIIlIIlII("8Gn6431ab/yiP9XJnTUiYQ==", "fCUsD");
        lllIIlIIlI[lllIIlllII[474]] = llIIIIIlIIllI("C3MYeiAnNREjfA==", "BTuZR");
        lllIIlIIlI[lllIIlllII[475]] = llIIIIIlIIlIl("JfbxF98hTCAn0lVE83ucVw==", "rcvnf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIIlIlIlII(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[233])) {
            String[] strArr = new String[lllIIlllII[0]];
            strArr[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[433]];
            if (llIIIIlIlIIll(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = lllIIlllII[0];
                "".length();
                return !((true ^ true) ^ (true ^ true)) ? ((121 ^ 95) ^ (81 ^ 100)) & (((61 ^ 87) ^ (87 ^ 46)) ^ (-" ".length())) : r0;
            }
        }
        return lllIIlllII[1];
    }

    private static int llIIIIlIlIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIIlIlllIl(int i) {
        return i >= 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aZ();
            "".length();
            if ((((((133 + 141) - 124) + 16) ^ (((34 + 81) - 24) + 82)) & (((208 ^ 129) ^ (98 ^ 56)) ^ (-" ".length()))) > 0) {
                return ((131 ^ 184) ^ (81 ^ 116)) & (((227 ^ 140) ^ (220 ^ 173)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIlllII[160];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return h;
    }

    private static boolean llIIIIlIlIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x043f, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[15]) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0442, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlIIlI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[20]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x045d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x049e, code lost:
        if (llIIIIlIlIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[22]) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04e1, code lost:
        if (llIIIIlIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[22]) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04e4, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlIIlI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[24]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04ff, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03fc, code lost:
        if (llIIIIlIlIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0035v.lllIIlllII[15]) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2154, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2181, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2196, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2286, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v295, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aZ() {
        if (llIIIIlIlIIIl(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (llIIIIlIlIIlI(bv.size(), lllIIlllII[0])) {
                System.out.println(lllIIlIIlI[lllIIlllII[1]]);
                bt = lllIIlllII[1];
            }
        }
        if (llIIIIlIlIIll(bt ? 1 : 0)) {
            if (llIIIIlIlIIlI(Skills.getLevel(Skill.CRAFTING), lllIIlllII[2])) {
                ay.fi();
            }
            if (llIIIIlIlIlII(Skills.getLevel(Skill.CRAFTING), lllIIlllII[2]) && llIIIIlIlIIlI(Skills.getLevel(Skill.AGILITY), lllIIlllII[3])) {
                av.eA();
            }
            if (llIIIIlIlIlII(Skills.getLevel(Skill.CRAFTING), lllIIlllII[2]) && llIIIIlIlIlII(Skills.getLevel(Skill.AGILITY), lllIIlllII[3]) && llIIIIlIlIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlllII[4])) {
                aB.fL();
            }
            if (llIIIIlIlIlII(Skills.getLevel(Skill.CRAFTING), lllIIlllII[2]) && llIIIIlIlIlII(Skills.getLevel(Skill.AGILITY), lllIIlllII[3]) && llIIIIlIlIlII(Skills.getLevel(Skill.HERBLORE), lllIIlllII[4]) && llIIIIlIlIIlI(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) {
                String[] strArr = new String[lllIIlllII[0]];
                strArr[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[0]];
                if (llIIIIlIlIIll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIlllII[0]];
                    strArr2[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[6]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lllIIlllII[0]];
                        strArr3[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[7]];
                        if (llIIIIlIlIIll(Inventory.contains(strArr3) ? 1 : 0)) {
                            C0038y.bl();
                        }
                    }
                }
            }
            if (llIIIIlIlIlII(Skills.getLevel(Skill.CRAFTING), lllIIlllII[2]) && llIIIIlIlIlII(Skills.getLevel(Skill.AGILITY), lllIIlllII[3]) && llIIIIlIlIlII(Skills.getLevel(Skill.HERBLORE), lllIIlllII[4]) && llIIIIlIlIlII(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) {
                String[] strArr4 = new String[lllIIlllII[0]];
                strArr4[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[8]];
                if (llIIIIlIlIIll(Inventory.contains(strArr4) ? 1 : 0)) {
                    String[] strArr5 = new String[lllIIlllII[0]];
                    strArr5[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[9]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr5) ? 1 : 0)) {
                        String[] strArr6 = new String[lllIIlllII[0]];
                        strArr6[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[10]];
                        if (llIIIIlIlIIll(Inventory.contains(strArr6) ? 1 : 0) && llIIIIlIlIIlI(Skills.getLevel(Skill.SLAYER), lllIIlllII[11])) {
                            aL.gb();
                        }
                    }
                }
            }
            if (llIIIIlIlIIll(an() ? 1 : 0) && llIIIIlIlIIll(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) && llIIIIlIlIlII(Skills.getLevel(Skill.SLAYER), lllIIlllII[11]) && llIIIIlIlIlII(Skills.getLevel(Skill.CRAFTING), lllIIlllII[2]) && llIIIIlIlIlII(Skills.getLevel(Skill.AGILITY), lllIIlllII[3]) && llIIIIlIlIlII(Skills.getLevel(Skill.HERBLORE), lllIIlllII[4]) && llIIIIlIlIlII(Vars.getBit(QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) {
                String[] strArr7 = new String[lllIIlllII[0]];
                strArr7[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[12]];
                if (llIIIIlIlIIll(Inventory.contains(strArr7) ? 1 : 0)) {
                    String[] strArr8 = new String[lllIIlllII[0]];
                    strArr8[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[13]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr8) ? 1 : 0)) {
                        String[] strArr9 = new String[lllIIlllII[0]];
                        strArr9[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[14]];
                        if (llIIIIlIlIIll(Inventory.contains(strArr9) ? 1 : 0)) {
                            BankLocation nearest = BankLocation.getNearest();
                            if (llIIIIlIlIlIl(nearest) && llIIIIlIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[15]];
                                C0000a.a(nearest);
                            }
                            if (llIIIIlIlIlIl(nearest) && llIIIIlIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                                    C0000a.a();
                                    Time.sleepUntil(() -> {
                                        return Bank.isOpen();
                                    }, lllIIlllII[16]);
                                    "".length();
                                }
                                if (llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[17]];
                                    if (llIIIIlIlIllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks(lllIIlllII[8]);
                                        "".length();
                                    }
                                    if (llIIIIlIlIllI(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks(lllIIlllII[6]);
                                        "".length();
                                    }
                                    int[] iArr = new int[lllIIlllII[0]];
                                    iArr[lllIIlllII[1]] = lllIIlllII[18];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                                        int[] iArr2 = new int[lllIIlllII[0]];
                                        iArr2[lllIIlllII[1]] = lllIIlllII[18];
                                    }
                                    int[] iArr3 = new int[lllIIlllII[0]];
                                    iArr3[lllIIlllII[1]] = lllIIlllII[19];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                        int[] iArr4 = new int[lllIIlllII[0]];
                                        iArr4[lllIIlllII[1]] = lllIIlllII[19];
                                    }
                                    int[] iArr5 = new int[lllIIlllII[0]];
                                    iArr5[lllIIlllII[1]] = lllIIlllII[21];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[lllIIlllII[0]];
                                        iArr6[lllIIlllII[1]] = lllIIlllII[21];
                                    }
                                    int[] iArr7 = new int[lllIIlllII[0]];
                                    iArr7[lllIIlllII[1]] = lllIIlllII[23];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                        int[] iArr8 = new int[lllIIlllII[0]];
                                        iArr8[lllIIlllII[1]] = lllIIlllII[23];
                                    }
                                    int[] iArr9 = new int[lllIIlllII[0]];
                                    iArr9[lllIIlllII[1]] = lllIIlllII[25];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                        int[] iArr10 = new int[lllIIlllII[0]];
                                        iArr10[lllIIlllII[1]] = lllIIlllII[25];
                                        if (llIIIIlIlIIlI(Bank.getFirst(iArr10).getQuantity(), lllIIlllII[26])) {
                                            Q();
                                            System.out.println(lllIIlIIlI[lllIIlllII[27]]);
                                            bt = lllIIlllII[0];
                                            return;
                                        }
                                    }
                                    int[] iArr11 = new int[lllIIlllII[0]];
                                    iArr11[lllIIlllII[1]] = lllIIlllII[19];
                                    if (llIIIIlIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                        int[] iArr12 = new int[lllIIlllII[0]];
                                        iArr12[lllIIlllII[1]] = lllIIlllII[19];
                                        if (llIIIIlIlIIlI(Bank.getFirst(iArr12).getQuantity(), lllIIlllII[15])) {
                                            Q();
                                            System.out.println(lllIIlIIlI[lllIIlllII[28]]);
                                            bt = lllIIlllII[0];
                                            return;
                                        }
                                    }
                                    int[] iArr13 = new int[lllIIlllII[29]];
                                    iArr13[lllIIlllII[1]] = lllIIlllII[30];
                                    iArr13[lllIIlllII[0]] = lllIIlllII[31];
                                    iArr13[lllIIlllII[6]] = lllIIlllII[32];
                                    iArr13[lllIIlllII[7]] = lllIIlllII[33];
                                    iArr13[lllIIlllII[8]] = lllIIlllII[34];
                                    iArr13[lllIIlllII[9]] = lllIIlllII[35];
                                    iArr13[lllIIlllII[10]] = lllIIlllII[36];
                                    iArr13[lllIIlllII[12]] = lllIIlllII[21];
                                    iArr13[lllIIlllII[13]] = lllIIlllII[37];
                                    iArr13[lllIIlllII[14]] = lllIIlllII[23];
                                    iArr13[lllIIlllII[15]] = lllIIlllII[38];
                                    iArr13[lllIIlllII[17]] = lllIIlllII[39];
                                    iArr13[lllIIlllII[20]] = lllIIlllII[40];
                                    iArr13[lllIIlllII[24]] = lllIIlllII[41];
                                    iArr13[lllIIlllII[27]] = lllIIlllII[42];
                                    iArr13[lllIIlllII[28]] = lllIIlllII[43];
                                    iArr13[lllIIlllII[44]] = lllIIlllII[45];
                                    iArr13[lllIIlllII[46]] = lllIIlllII[47];
                                    iArr13[lllIIlllII[48]] = lllIIlllII[49];
                                    iArr13[lllIIlllII[50]] = lllIIlllII[18];
                                    if (llIIIIlIlIIll(C0018e.c(iArr13) ? 1 : 0)) {
                                        Q();
                                        System.out.println(lllIIlIIlI[lllIIlllII[44]]);
                                        bt = lllIIlllII[0];
                                        return;
                                    }
                                    int[] iArr14 = new int[lllIIlllII[20]];
                                    iArr14[lllIIlllII[1]] = lllIIlllII[30];
                                    iArr14[lllIIlllII[0]] = lllIIlllII[31];
                                    iArr14[lllIIlllII[6]] = lllIIlllII[32];
                                    iArr14[lllIIlllII[7]] = lllIIlllII[33];
                                    iArr14[lllIIlllII[8]] = lllIIlllII[34];
                                    iArr14[lllIIlllII[9]] = lllIIlllII[35];
                                    iArr14[lllIIlllII[10]] = lllIIlllII[36];
                                    iArr14[lllIIlllII[12]] = lllIIlllII[21];
                                    iArr14[lllIIlllII[13]] = lllIIlllII[37];
                                    iArr14[lllIIlllII[14]] = lllIIlllII[38];
                                    iArr14[lllIIlllII[15]] = lllIIlllII[39];
                                    iArr14[lllIIlllII[17]] = lllIIlllII[18];
                                    if (llIIIIlIlIIIl(C0018e.c(iArr14) ? 1 : 0)) {
                                        C0000a.a(lllIIlllII[51], lllIIlllII[8]);
                                        C0000a.a(lllIIlllII[30], lllIIlllII[15]);
                                        C0000a.a(lllIIlllII[31], lllIIlllII[15]);
                                        C0000a.a(lllIIlllII[32], lllIIlllII[16]);
                                        C0000a.a(lllIIlllII[33], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[34], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[35], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[36], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[21], lllIIlllII[7]);
                                        C0000a.a(lllIIlllII[38], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[37], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[39], lllIIlllII[6]);
                                        C0000a.a(lllIIlllII[52], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[53], lllIIlllII[0]);
                                        C0000a.a(lllIIlllII[19], lllIIlllII[0]);
                                        int[] iArr15 = new int[lllIIlllII[0]];
                                        iArr15[lllIIlllII[1]] = lllIIlllII[49];
                                        if (llIIIIlIlIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                                            C0000a.a(lllIIlllII[49], lllIIlllII[0]);
                                        }
                                        int[] iArr16 = new int[lllIIlllII[0]];
                                        iArr16[lllIIlllII[1]] = lllIIlllII[54];
                                        if (llIIIIlIlIIIl(Bank.contains(iArr16) ? 1 : 0)) {
                                            C0000a.a(lllIIlllII[54], lllIIlllII[0]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (llIIIIlIlIIIl(Inventory.contains(C0019f.ba) ? 1 : 0) && llIIIIlIlIIlI(Movement.getRunEnergy(), lllIIlllII[55])) {
                Inventory.getFirst(C0019f.ba).interact(lllIIlIIlI[lllIIlllII[46]]);
                Time.sleepTicks(lllIIlllII[0]);
                "".length();
            }
            String[] strArr10 = new String[lllIIlllII[0]];
            strArr10[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[48]];
            if (!llIIIIlIlIIIl(Inventory.contains(strArr10) ? 1 : 0) || llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
            }
            if (llIIIIlIlIIIl(an() ? 1 : 0) && llIIIIlIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[15])) {
                if (llIIIIlIlIIll(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[50]];
                    if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    int[] iArr17 = new int[lllIIlllII[0]];
                    iArr17[lllIIlllII[1]] = lllIIlllII[52];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lllIIlllII[0]];
                        iArr18[lllIIlllII[1]] = lllIIlllII[52];
                        Inventory.getFirst(iArr18).interact(lllIIlIIlI[lllIIlllII[29]]);
                    }
                    int[] iArr19 = new int[lllIIlllII[0]];
                    iArr19[lllIIlllII[1]] = lllIIlllII[53];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lllIIlllII[0]];
                        iArr20[lllIIlllII[1]] = lllIIlllII[53];
                        Inventory.getFirst(iArr20).interact(lllIIlIIlI[lllIIlllII[56]]);
                    }
                    int[] iArr21 = new int[lllIIlllII[0]];
                    iArr21[lllIIlllII[1]] = lllIIlllII[49];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                        int[] iArr22 = new int[lllIIlllII[0]];
                        iArr22[lllIIlllII[1]] = lllIIlllII[49];
                        Inventory.getFirst(iArr22).interact(lllIIlIIlI[lllIIlllII[57]]);
                    }
                    int[] iArr23 = new int[lllIIlllII[0]];
                    iArr23[lllIIlllII[1]] = lllIIlllII[54];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[lllIIlllII[0]];
                        iArr24[lllIIlllII[1]] = lllIIlllII[54];
                        Inventory.getFirst(iArr24).interact(lllIIlIIlI[lllIIlllII[58]]);
                    }
                    C0038y.bp();
                }
                if (llIIIIlIlIIIl(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(de), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[59]];
                        Movement.walkTo(de);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIlllII[9])) {
                        C0020g.a(lllIIlIIlI[lllIIlllII[60]], cE);
                    }
                }
                C0020g.a(C0038y.cE);
            }
            if (llIIIIlIlIIIl(an() ? 1 : 0) && llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[28])) {
                WorldArea worldArea = new WorldArea(lllIIlllII[61], lllIIlllII[62], lllIIlllII[63], lllIIlllII[64], lllIIlllII[1]);
                WorldArea worldArea2 = new WorldArea(lllIIlllII[65], lllIIlllII[66], lllIIlllII[50], lllIIlllII[13], lllIIlllII[1]);
                if (llIIIIlIlIIll(new WorldArea(lllIIlllII[67], lllIIlllII[68], lllIIlllII[29], lllIIlllII[69], lllIIlllII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[70]];
                    Movement.walkTo(C0038y.dP);
                    "".length();
                    Time.sleepTicks(lllIIlllII[0]);
                    "".length();
                }
                C0038y.bq();
                if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[4])) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[71]];
                        Movement.walkTo(C0038y.dQ);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[72]];
                        C0020g.a(lllIIlIIlI[lllIIlllII[73]], cE);
                    }
                }
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[29])) {
                if (llIIIIlIlIIll(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    di = lllIIlllII[1];
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[64]];
                    if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0038y.bp();
                }
                if (llIIIIlIlIIIl(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[9]) && llIIIIlIlIIll(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(dq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[74]];
                        Movement.walkTo(dl);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[14])) {
                        String[] strArr11 = new String[lllIIlllII[0]];
                        strArr11[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[75]];
                        TileObjects.getNearest(strArr11).interact(lllIIlIIlI[lllIIlllII[76]]);
                        Time.sleepTicks(lllIIlllII[10]);
                        "".length();
                    }
                }
                C0020g.a(C0038y.cE);
            }
            if (!llIIIIlIllIlI(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[64]) || llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[77])) {
                String[] strArr12 = new String[lllIIlllII[0]];
                strArr12[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[69]];
                if (llIIIIlIlIIll(Inventory.contains(strArr12) ? 1 : 0)) {
                    if (llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                    }
                    if (llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.withdraw(lllIIlllII[25], lllIIlllII[12], Bank.WithdrawMode.ITEM);
                    }
                }
                String[] strArr13 = new String[lllIIlllII[0]];
                strArr13[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[77]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                    if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0020g.a(lllIIlIIlI[lllIIlllII[78]], cE);
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[4])) {
                if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[14])) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[79]];
                    String[] strArr14 = new String[lllIIlllII[0]];
                    strArr14[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[11]];
                    TileObjects.getNearest(strArr14).interact(lllIIlIIlI[lllIIlllII[80]]);
                    Time.sleepTicks(lllIIlllII[10]);
                    "".length();
                }
                WorldArea worldArea3 = new WorldArea(lllIIlllII[81], lllIIlllII[82], lllIIlllII[24], lllIIlllII[28], lllIIlllII[0]);
                WorldArea worldArea4 = new WorldArea(lllIIlllII[83], lllIIlllII[84], lllIIlllII[20], lllIIlllII[46], lllIIlllII[6]);
                WorldArea worldArea5 = new WorldArea(lllIIlllII[81], lllIIlllII[85], lllIIlllII[20], lllIIlllII[24], lllIIlllII[0]);
                WorldArea worldArea6 = new WorldArea(lllIIlllII[86], lllIIlllII[87], lllIIlllII[59], lllIIlllII[15], lllIIlllII[6]);
                WorldArea worldArea7 = new WorldArea(lllIIlllII[88], lllIIlllII[89], lllIIlllII[73], lllIIlllII[57], lllIIlllII[6]);
                WorldPoint worldPoint = new WorldPoint(lllIIlllII[90], lllIIlllII[91], lllIIlllII[6]);
                WorldPoint worldPoint2 = new WorldPoint(lllIIlllII[92], lllIIlllII[93], lllIIlllII[0]);
                WorldPoint worldPoint3 = new WorldPoint(lllIIlllII[94], lllIIlllII[95], lllIIlllII[0]);
                WorldPoint worldPoint4 = new WorldPoint(lllIIlllII[96], lllIIlllII[85], lllIIlllII[6]);
                if (llIIIIlIlIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[4]];
                        Movement.walkTo(worldPoint2);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                        if (llIIIIlIlIIll(AccBuilderSotf.i.containsKey(new WorldPoint(lllIIlllII[96], lllIIlllII[93], lllIIlllII[0])) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[97]];
                            String[] strArr15 = new String[lllIIlllII[0]];
                            strArr15[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[98]];
                            TileObjects.getNearest(strArr15).interact(lllIIlIIlI[lllIIlllII[99]]);
                            Time.sleepTicks(lllIIlllII[8]);
                            "".length();
                        }
                    }
                }
                if (llIIIIlIlIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lllIIlllII[6])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[100]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lllIIlllII[6])) {
                        String[] strArr16 = new String[lllIIlllII[0]];
                        strArr16[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[3]];
                        TileObjects.getNearest(strArr16).interact(lllIIlIIlI[lllIIlllII[101]]);
                        Time.sleepUntil(() -> {
                            if (llIIIIlIllIlI(Players.getLocal().getWorldLocation().getPlane(), lllIIlllII[6])) {
                                ?? r0 = lllIIlllII[0];
                                "".length();
                                return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlllII[1];
                        }, lllIIlllII[102]);
                        "".length();
                    }
                }
                if (llIIIIlIlIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[103]];
                        Movement.walkTo(worldPoint3);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                        if (llIIIIlIlIIll(AccBuilderSotf.i.containsKey(new WorldPoint(lllIIlllII[94], lllIIlllII[104], lllIIlllII[0])) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[2]];
                            String[] strArr17 = new String[lllIIlllII[0]];
                            strArr17[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[105]];
                            TileObjects.getNearest(strArr17).interact(lllIIlIIlI[lllIIlllII[55]]);
                            Time.sleepTicks(lllIIlllII[8]);
                            "".length();
                        }
                    }
                }
                if (llIIIIlIlIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (llIIIIlIlIIIl(tileObject.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[441]]) ? 1 : 0)) {
                            String[] strArr18 = new String[lllIIlllII[0]];
                            strArr18[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[442]];
                            if (llIIIIlIlIIIl(tileObject.hasAction(strArr18) ? 1 : 0)) {
                                ?? r0 = lllIIlllII[0];
                                "".length();
                                return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lllIIlllII[1];
                    });
                    if (llIIIIlIlIlIl(nearest2) && llIIIIlIlIIll(Players.getLocal().isAnimating() ? 1 : 0) && llIIIIlIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                        nearest2.interact(lllIIlIIlI[lllIIlllII[22]]);
                        Time.sleepTicks(lllIIlllII[6]);
                        "".length();
                    }
                }
                if (llIIIIlIlIIIl(new WorldArea(lllIIlllII[106], lllIIlllII[107], lllIIlllII[58], lllIIlllII[48], lllIIlllII[7]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr18 = new String[lllIIlllII[0]];
                    strArr18[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[108]];
                    List list = (List) TileObjects.getAll(strArr18).stream().filter(tileObject2 -> {
                        if (llIIIIlIlIlll(tileObject2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[6])) {
                            ?? r0 = lllIIlllII[0];
                            "".length();
                            return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((((81 + 123) - 134) + 92) ^ (((72 + 81) - 38) + 66)) & (((55 ^ 89) ^ (65 ^ 56)) ^ (-" ".length())) : r0;
                        }
                        return lllIIlllII[1];
                    }).collect(Collectors.toList());
                    if (llIIIIlIlIIll(list.isEmpty() ? 1 : 0)) {
                        ((TileObject) list.get(lllIIlllII[1])).interact(lllIIlIIlI[lllIIlllII[109]]);
                        Time.sleepTicks(lllIIlllII[9]);
                        "".length();
                    }
                }
                if (llIIIIlIlIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlllII[8])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[110]];
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlllII[8]) && llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr19 = new String[lllIIlllII[0]];
                        strArr19[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[111]];
                        TileObjects.getNearest(strArr19).interact(lllIIlIIlI[lllIIlllII[112]]);
                        Time.sleepTicks(lllIIlllII[7]);
                        "".length();
                    }
                }
                if (llIIIIlIlIIlI(Skills.getBoostedLevel(Skill.HITPOINTS), Skills.getLevel(Skill.HITPOINTS) - lllIIlllII[29])) {
                    String[] strArr20 = new String[lllIIlllII[0]];
                    strArr20[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[113]];
                    Inventory.getFirst(strArr20).interact(lllIIlIIlI[lllIIlllII[114]]);
                    Time.sleepTicks(lllIIlllII[0]);
                    "".length();
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[3])) {
                if (llIIIIlIlIIIl(new WorldArea(lllIIlllII[88], lllIIlllII[89], lllIIlllII[73], lllIIlllII[57], lllIIlllII[6]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    int[] iArr25 = new int[lllIIlllII[0]];
                    iArr25[lllIIlllII[1]] = lllIIlllII[31];
                    Inventory.getFirst(iArr25).interact(lllIIlIIlI[lllIIlllII[115]]);
                    Time.sleepTicks(lllIIlllII[10]);
                    "".length();
                }
                int[] iArr26 = new int[lllIIlllII[0]];
                iArr26[lllIIlllII[1]] = lllIIlllII[18];
                if (llIIIIlIlIIll(Inventory.contains(iArr26) ? 1 : 0)) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[116]];
                        Movement.walkTo(D.fa);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        if (llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr27 = new int[lllIIlllII[0]];
                            iArr27[lllIIlllII[1]] = lllIIlllII[117];
                            if (llIIIIlIlIlIl(TileObjects.getNearest(iArr27)) && llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[15])) {
                                int[] iArr28 = new int[lllIIlllII[0]];
                                iArr28[lllIIlllII[1]] = lllIIlllII[117];
                                TileObjects.getNearest(iArr28).interact(lllIIlIIlI[lllIIlllII[118]]);
                                Time.sleepTicks(lllIIlllII[6]);
                                "".length();
                            }
                        }
                        if (llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr29 = new int[lllIIlllII[0]];
                            iArr29[lllIIlllII[1]] = lllIIlllII[32];
                            Bank.depositAll(iArr29);
                            int[] iArr30 = new int[lllIIlllII[0]];
                            iArr30[lllIIlllII[1]] = lllIIlllII[34];
                            Bank.depositAll(iArr30);
                            int[] iArr31 = new int[lllIIlllII[0]];
                            iArr31[lllIIlllII[1]] = lllIIlllII[33];
                            Bank.depositAll(iArr31);
                            int[] iArr32 = new int[lllIIlllII[0]];
                            iArr32[lllIIlllII[1]] = lllIIlllII[21];
                            Bank.depositAll(iArr32);
                            int[] iArr33 = new int[lllIIlllII[0]];
                            iArr33[lllIIlllII[1]] = lllIIlllII[37];
                            Bank.depositAll(iArr33);
                            int[] iArr34 = new int[lllIIlllII[0]];
                            iArr34[lllIIlllII[1]] = lllIIlllII[19];
                            if (llIIIIlIlIIll(Inventory.contains(iArr34) ? 1 : 0)) {
                                C0000a.a(lllIIlllII[19], lllIIlllII[0]);
                            }
                            int[] iArr35 = new int[lllIIlllII[0]];
                            iArr35[lllIIlllII[1]] = lllIIlllII[18];
                            if (llIIIIlIlIIll(Inventory.contains(iArr35) ? 1 : 0)) {
                                C0000a.a(lllIIlllII[18], lllIIlllII[6]);
                            }
                            C0000a.a(lllIIlllII[25], Inventory.getFreeSlots() - lllIIlllII[8]);
                        }
                    }
                }
                int[] iArr36 = new int[lllIIlllII[0]];
                iArr36[lllIIlllII[1]] = lllIIlllII[18];
                if (llIIIIlIlIIIl(Inventory.contains(iArr36) ? 1 : 0)) {
                    WorldArea worldArea8 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[1]);
                    WorldArea worldArea9 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[0]);
                    WorldArea worldArea10 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[6]);
                    WorldArea worldArea11 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[7]);
                    if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (llIIIIlIlIIll(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[4]) && llIIIIlIlIIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[121]];
                        if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        C0038y.bp();
                    }
                    C0038y.bq();
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[4])) {
                        if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[12])) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[122]];
                            Movement.walkTo(C0038y.dQ);
                            "".length();
                            Time.sleepTicks(lllIIlllII[0]);
                            "".length();
                        }
                        if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[12])) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[123]];
                            C0020g.a(lllIIlIIlI[lllIIlllII[124]], cE);
                        }
                    }
                }
                C0020g.a(cE);
            }
            if (!llIIIIlIllIlI(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[55]) || !llIIIIlIllIlI(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[111]) || llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[116])) {
                C0020g.a(lllIIlIIlI[lllIIlllII[125]], cE);
            }
            if (!llIIIIlIllIlI(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[124]) || llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[126])) {
                C0020g.a(lllIIlIIlI[lllIIlllII[127]], cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[63])) {
                bc();
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[128])) {
                if (llIIIIlIlIIIl(Inventory.isFull() ? 1 : 0)) {
                    String[] strArr21 = new String[lllIIlllII[0]];
                    strArr21[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[129]];
                    Inventory.getFirst(strArr21).interact(lllIIlIIlI[lllIIlllII[130]]);
                    Time.sleepTicks(lllIIlllII[6]);
                    "".length();
                }
                String[] strArr22 = new String[lllIIlllII[0]];
                strArr22[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[126]];
                if (llIIIIlIlIIll(Inventory.contains(strArr22) ? 1 : 0)) {
                    String[] strArr23 = new String[lllIIlllII[0]];
                    strArr23[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[131]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr23) ? 1 : 0)) {
                        String[] strArr24 = new String[lllIIlllII[0]];
                        strArr24[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[132]];
                        if (llIIIIlIlIIll(Inventory.contains(strArr24) ? 1 : 0)) {
                            String[] strArr25 = new String[lllIIlllII[0]];
                            strArr25[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[133]];
                            if (llIIIIlIlIIll(Inventory.contains(strArr25) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[134]];
                                int[] iArr37 = new int[lllIIlllII[0]];
                                iArr37[lllIIlllII[1]] = lllIIlllII[135];
                                TileObjects.getNearest(iArr37).interact(lllIIlIIlI[lllIIlllII[63]]);
                                Time.sleepTicks(lllIIlllII[7]);
                                "".length();
                            }
                        }
                        String[] strArr26 = new String[lllIIlllII[0]];
                        strArr26[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[136]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr26) ? 1 : 0)) {
                            String[] strArr27 = new String[lllIIlllII[0]];
                            strArr27[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[137]];
                            if (llIIIIlIlIIll(Inventory.contains(strArr27) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[138]];
                                int[] iArr38 = new int[lllIIlllII[0]];
                                iArr38[lllIIlllII[1]] = lllIIlllII[139];
                                TileObjects.getNearest(iArr38).interact(lllIIlIIlI[lllIIlllII[140]]);
                                Time.sleepTicks(lllIIlllII[7]);
                                "".length();
                            }
                        }
                        String[] strArr28 = new String[lllIIlllII[0]];
                        strArr28[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[128]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr28) ? 1 : 0)) {
                            String[] strArr29 = new String[lllIIlllII[0]];
                            strArr29[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[141]];
                            if (llIIIIlIlIIll(Inventory.contains(strArr29) ? 1 : 0)) {
                                String[] strArr30 = new String[lllIIlllII[0]];
                                strArr30[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[142]];
                                if (llIIIIlIlIIIl(Inventory.contains(strArr30) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[143]];
                                    String[] strArr31 = new String[lllIIlllII[0]];
                                    strArr31[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[144]];
                                    Item first = Inventory.getFirst(strArr31);
                                    String[] strArr32 = new String[lllIIlllII[0]];
                                    strArr32[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[145]];
                                    first.useOn(Inventory.getFirst(strArr32));
                                    Time.sleepTicks(lllIIlllII[6]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                String[] strArr33 = new String[lllIIlllII[0]];
                strArr33[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[146]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[lllIIlllII[0]];
                    strArr34[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[147]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr34) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[148]];
                        String[] strArr35 = new String[lllIIlllII[0]];
                        strArr35[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[149]];
                        Item first2 = Inventory.getFirst(strArr35);
                        int[] iArr39 = new int[lllIIlllII[0]];
                        iArr39[lllIIlllII[1]] = lllIIlllII[36];
                        first2.useOn(Inventory.getFirst(iArr39));
                        Time.sleepTicks(lllIIlllII[6]);
                        "".length();
                    }
                }
                String[] strArr36 = new String[lllIIlllII[0]];
                strArr36[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[150]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr36) ? 1 : 0)) {
                    String[] strArr37 = new String[lllIIlllII[0]];
                    strArr37[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[151]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr37) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[152]];
                        String[] strArr38 = new String[lllIIlllII[0]];
                        strArr38[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[153]];
                        Item first3 = Inventory.getFirst(strArr38);
                        String[] strArr39 = new String[lllIIlllII[0]];
                        strArr39[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[154]];
                        first3.useOn(Inventory.getFirst(strArr39));
                        Time.sleepTicks(lllIIlllII[6]);
                        "".length();
                    }
                }
                String[] strArr40 = new String[lllIIlllII[0]];
                strArr40[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[155]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr40) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[156]];
                    String[] strArr41 = new String[lllIIlllII[0]];
                    strArr41[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[157]];
                    Item first4 = Inventory.getFirst(strArr41);
                    String[] strArr42 = new String[lllIIlllII[0]];
                    strArr42[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[158]];
                    first4.useOn(TileObjects.getNearest(strArr42));
                    Time.sleepTicks(lllIIlllII[8]);
                    "".length();
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[141])) {
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[142])) {
                C0020g.a(lllIIlIIlI[lllIIlllII[159]], cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[143])) {
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[144])) {
                String[] strArr43 = new String[lllIIlllII[0]];
                strArr43[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[160]];
                if (llIIIIlIlIIll(Inventory.contains(strArr43) ? 1 : 0)) {
                    String[] strArr44 = new String[lllIIlllII[0]];
                    strArr44[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[161]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr44) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[162]];
                        int[] iArr40 = new int[lllIIlllII[0]];
                        iArr40[lllIIlllII[1]] = lllIIlllII[135];
                        TileObjects.getNearest(iArr40).interact(lllIIlIIlI[lllIIlllII[163]]);
                        Time.sleepTicks(lllIIlllII[7]);
                        "".length();
                    }
                }
                String[] strArr45 = new String[lllIIlllII[0]];
                strArr45[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[164]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr45) ? 1 : 0)) {
                    String[] strArr46 = new String[lllIIlllII[0]];
                    strArr46[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[165]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr46) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[166]];
                        int[] iArr41 = new int[lllIIlllII[0]];
                        iArr41[lllIIlllII[1]] = lllIIlllII[139];
                        TileObjects.getNearest(iArr41).interact(lllIIlIIlI[lllIIlllII[167]]);
                        Time.sleepTicks(lllIIlllII[7]);
                        "".length();
                    }
                }
                String[] strArr47 = new String[lllIIlllII[0]];
                strArr47[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[168]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr47) ? 1 : 0)) {
                    String[] strArr48 = new String[lllIIlllII[0]];
                    strArr48[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[169]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr48) ? 1 : 0)) {
                        String[] strArr49 = new String[lllIIlllII[0]];
                        strArr49[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[170]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr49) ? 1 : 0)) {
                            String[] strArr50 = new String[lllIIlllII[0]];
                            strArr50[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[171]];
                            Item first5 = Inventory.getFirst(strArr50);
                            String[] strArr51 = new String[lllIIlllII[0]];
                            strArr51[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[172]];
                            first5.useOn(Inventory.getFirst(strArr51));
                            Time.sleepTicks(lllIIlllII[6]);
                            "".length();
                        }
                    }
                }
                String[] strArr52 = new String[lllIIlllII[0]];
                strArr52[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[173]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr52) ? 1 : 0)) {
                    String[] strArr53 = new String[lllIIlllII[0]];
                    strArr53[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[174]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr53) ? 1 : 0)) {
                        String[] strArr54 = new String[lllIIlllII[0]];
                        strArr54[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[175]];
                        Item first6 = Inventory.getFirst(strArr54);
                        int[] iArr42 = new int[lllIIlllII[0]];
                        iArr42[lllIIlllII[1]] = lllIIlllII[36];
                        first6.useOn(Inventory.getFirst(iArr42));
                        Time.sleepTicks(lllIIlllII[6]);
                        "".length();
                    }
                }
                String[] strArr55 = new String[lllIIlllII[0]];
                strArr55[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[176]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr55) ? 1 : 0)) {
                    String[] strArr56 = new String[lllIIlllII[0]];
                    strArr56[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[177]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr56) ? 1 : 0)) {
                        String[] strArr57 = new String[lllIIlllII[0]];
                        strArr57[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[178]];
                        Item first7 = Inventory.getFirst(strArr57);
                        String[] strArr58 = new String[lllIIlllII[0]];
                        strArr58[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[179]];
                        first7.useOn(Inventory.getFirst(strArr58));
                        Time.sleepTicks(lllIIlllII[6]);
                        "".length();
                    }
                }
                String[] strArr59 = new String[lllIIlllII[0]];
                strArr59[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[180]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr59) ? 1 : 0)) {
                    String[] strArr60 = new String[lllIIlllII[0]];
                    strArr60[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[181]];
                    Item first8 = Inventory.getFirst(strArr60);
                    String[] strArr61 = new String[lllIIlllII[0]];
                    strArr61[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[182]];
                    first8.useOn(TileObjects.getNearest(strArr61));
                    Time.sleepTicks(lllIIlllII[8]);
                    "".length();
                }
                C0020g.a(cE);
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[145])) {
                WorldArea worldArea12 = new WorldArea(lllIIlllII[183], lllIIlllII[184], lllIIlllII[12], lllIIlllII[9], lllIIlllII[1]);
                if (llIIIIlIlIIll(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr62 = new String[lllIIlllII[0]];
                    strArr62[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[185]];
                    TileObjects.getNearest(strArr62).interact(lllIIlIIlI[lllIIlllII[186]]);
                    Time.sleepTicks(lllIIlllII[8]);
                    "".length();
                }
                if (llIIIIlIlIIIl(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr63 = new String[lllIIlllII[0]];
                    strArr63[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[187]];
                    TileObject nearest3 = TileObjects.getNearest(strArr63);
                    String[] strArr64 = new String[lllIIlllII[0]];
                    strArr64[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[188]];
                    if (llIIIIlIlIIIl(nearest3.hasAction(strArr64) ? 1 : 0)) {
                        String[] strArr65 = new String[lllIIlllII[0]];
                        strArr65[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[189]];
                        TileObjects.getNearest(strArr65).interact(lllIIlIIlI[lllIIlllII[190]]);
                        Time.sleepTicks(lllIIlllII[7]);
                        "".length();
                    }
                    String[] strArr66 = new String[lllIIlllII[0]];
                    strArr66[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[191]];
                    TileObject nearest4 = TileObjects.getNearest(strArr66);
                    String[] strArr67 = new String[lllIIlllII[0]];
                    strArr67[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[192]];
                    if (llIIIIlIlIIIl(nearest4.hasAction(strArr67) ? 1 : 0)) {
                        String[] strArr68 = new String[lllIIlllII[0]];
                        strArr68[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[193]];
                        TileObjects.getNearest(strArr68).interact(lllIIlIIlI[lllIIlllII[194]]);
                        Time.sleepTicks(lllIIlllII[7]);
                        "".length();
                    }
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[146])) {
                WorldArea worldArea13 = new WorldArea(lllIIlllII[183], lllIIlllII[184], lllIIlllII[12], lllIIlllII[9], lllIIlllII[1]);
                if (llIIIIlIlIIIl(worldArea13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr69 = new String[lllIIlllII[0]];
                    strArr69[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[195]];
                    TileObjects.getNearest(strArr69).interact(lllIIlIIlI[lllIIlllII[196]]);
                    Time.sleepTicks(lllIIlllII[8]);
                    "".length();
                }
                if (llIIIIlIlIIll(worldArea13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0020g.a(lllIIlIIlI[lllIIlllII[197]], cE);
                }
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[150])) {
                WorldArea worldArea14 = new WorldArea(lllIIlllII[198], lllIIlllII[199], lllIIlllII[24], lllIIlllII[48], lllIIlllII[1]);
                while (llIIIIlIlIIIl(worldArea14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr43 = new int[lllIIlllII[0]];
                    iArr43[lllIIlllII[1]] = lllIIlllII[31];
                    Inventory.getFirst(iArr43).interact(lllIIlIIlI[lllIIlllII[200]]);
                    Time.sleepTicks(lllIIlllII[9]);
                    "".length();
                    "".length();
                    if ((-((8 ^ 123) ^ (179 ^ 196))) >= 0) {
                        return;
                    }
                }
                WorldArea worldArea15 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[1]);
                WorldArea worldArea16 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[0]);
                WorldArea worldArea17 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[6]);
                WorldArea worldArea18 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[7]);
                if (llIIIIlIlIIll(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[4]) && llIIIIlIlIIll(worldArea15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(worldArea18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[201]];
                    if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0038y.bp();
                }
                C0038y.bq();
                if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[4])) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[202]];
                        Movement.walkTo(C0038y.dQ);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(C0038y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[203]];
                        C0020g.a(lllIIlIIlI[lllIIlllII[204]], cE);
                    }
                }
                C0020g.a(cE);
            }
            if (!llIIIIlIllIlI(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[155]) || llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[160])) {
                String[] strArr70 = new String[lllIIlllII[0]];
                strArr70[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[205]];
                if (llIIIIlIlIlIl(NPCs.getNearest(strArr70))) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[206]];
                    if (llIIIIlIlIIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (llIIIIlIlIIll(Prayers.isEnabled(Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                        Prayers.toggle(Prayer.ULTIMATE_STRENGTH);
                    }
                    if (llIIIIlIlIIll(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                        Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                    }
                    if (llIIIIlIllIll(llIIIIlIIllll(C0018e.w(), 70.0d))) {
                        String[] strArr71 = new String[lllIIlllII[0]];
                        strArr71[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[207]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr71) ? 1 : 0)) {
                            String[] strArr72 = new String[lllIIlllII[0]];
                            strArr72[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[208]];
                            Inventory.getFirst(strArr72).interact(lllIIlIIlI[lllIIlllII[26]]);
                        }
                    }
                    if (llIIIIlIllIIl(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && llIIIIlIlIIIl(Inventory.contains(C0019f.aY) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aY).interact(lllIIlIIlI[lllIIlllII[209]]);
                    }
                    if (llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[64])) {
                        int[] iArr44 = new int[lllIIlllII[0]];
                        iArr44[lllIIlllII[1]] = lllIIlllII[18];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr44) ? 1 : 0)) {
                            int[] iArr45 = new int[lllIIlllII[0]];
                            iArr45[lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst(iArr45).interact(lllIIlIIlI[lllIIlllII[210]]);
                        }
                        int[] iArr46 = new int[lllIIlllII[0]];
                        iArr46[lllIIlllII[1]] = lllIIlllII[211];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr46) ? 1 : 0)) {
                            int[] iArr47 = new int[lllIIlllII[0]];
                            iArr47[lllIIlllII[1]] = lllIIlllII[211];
                            Inventory.getFirst(iArr47).interact(lllIIlIIlI[lllIIlllII[212]]);
                        }
                        int[] iArr48 = new int[lllIIlllII[0]];
                        iArr48[lllIIlllII[1]] = lllIIlllII[213];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr48) ? 1 : 0)) {
                            int[] iArr49 = new int[lllIIlllII[0]];
                            iArr49[lllIIlllII[1]] = lllIIlllII[213];
                            Inventory.getFirst(iArr49).interact(lllIIlIIlI[lllIIlllII[120]]);
                        }
                        int[] iArr50 = new int[lllIIlllII[0]];
                        iArr50[lllIIlllII[1]] = lllIIlllII[214];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr50) ? 1 : 0)) {
                            int[] iArr51 = new int[lllIIlllII[0]];
                            iArr51[lllIIlllII[1]] = lllIIlllII[214];
                            Inventory.getFirst(iArr51).interact(lllIIlIIlI[lllIIlllII[215]]);
                        }
                    }
                    if (llIIIIlIlllII(Players.getLocal().getInteracting())) {
                        String[] strArr73 = new String[lllIIlllII[0]];
                        strArr73[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[216]];
                        NPCs.getNearest(strArr73).interact(lllIIlIIlI[lllIIlllII[217]]);
                    }
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[170])) {
                int[] iArr52 = new int[lllIIlllII[0]];
                iArr52[lllIIlllII[1]] = lllIIlllII[34];
                if (llIIIIlIlIIll(Inventory.contains(iArr52) ? 1 : 0)) {
                    if (llIIIIlIlIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (llIIIIlIlIIIl(Prayers.isEnabled(Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                        Prayers.toggle(Prayer.ULTIMATE_STRENGTH);
                    }
                    if (llIIIIlIlIIIl(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                        Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                    }
                    if (llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3])) {
                        int[] iArr53 = new int[lllIIlllII[0]];
                        iArr53[lllIIlllII[1]] = lllIIlllII[18];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr53) ? 1 : 0)) {
                            int[] iArr54 = new int[lllIIlllII[0]];
                            iArr54[lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst(iArr54).interact(lllIIlIIlI[lllIIlllII[218]]);
                        }
                        int[] iArr55 = new int[lllIIlllII[0]];
                        iArr55[lllIIlllII[1]] = lllIIlllII[18];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr55) ? 1 : 0)) {
                            int[] iArr56 = new int[lllIIlllII[0]];
                            iArr56[lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst(iArr56).interact(lllIIlIIlI[lllIIlllII[219]]);
                        }
                        int[] iArr57 = new int[lllIIlllII[0]];
                        iArr57[lllIIlllII[1]] = lllIIlllII[211];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr57) ? 1 : 0)) {
                            int[] iArr58 = new int[lllIIlllII[0]];
                            iArr58[lllIIlllII[1]] = lllIIlllII[211];
                            Inventory.getFirst(iArr58).interact(lllIIlIIlI[lllIIlllII[220]]);
                        }
                        int[] iArr59 = new int[lllIIlllII[0]];
                        iArr59[lllIIlllII[1]] = lllIIlllII[213];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr59) ? 1 : 0)) {
                            int[] iArr60 = new int[lllIIlllII[0]];
                            iArr60[lllIIlllII[1]] = lllIIlllII[213];
                            Inventory.getFirst(iArr60).interact(lllIIlIIlI[lllIIlllII[221]]);
                        }
                        int[] iArr61 = new int[lllIIlllII[0]];
                        iArr61[lllIIlllII[1]] = lllIIlllII[214];
                        if (llIIIIlIlIIIl(Inventory.contains(iArr61) ? 1 : 0)) {
                            int[] iArr62 = new int[lllIIlllII[0]];
                            iArr62[lllIIlllII[1]] = lllIIlllII[214];
                            Inventory.getFirst(iArr62).interact(lllIIlIIlI[lllIIlllII[222]]);
                        }
                    }
                    if (llIIIIlIllIll(llIIIIlIIllll(C0018e.w(), 100.0d))) {
                        String[] strArr74 = new String[lllIIlllII[0]];
                        strArr74[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[223]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr74) ? 1 : 0)) {
                            String[] strArr75 = new String[lllIIlllII[0]];
                            strArr75[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[224]];
                            Inventory.getFirst(strArr75).interact(lllIIlIIlI[lllIIlllII[225]]);
                        }
                    }
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[226]];
                        WorldArea worldArea19 = new WorldArea(lllIIlllII[227], lllIIlllII[228], lllIIlllII[222], lllIIlllII[229], lllIIlllII[1]);
                        if (llIIIIlIlIIll(worldArea19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr63 = new int[lllIIlllII[0]];
                            iArr63[lllIIlllII[1]] = lllIIlllII[31];
                            Inventory.getFirst(iArr63).interact(lllIIlIIlI[lllIIlllII[230]]);
                            Time.sleepTicks(lllIIlllII[12]);
                            "".length();
                        }
                        if (llIIIIlIlIIIl(worldArea19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(D.fa);
                            "".length();
                            Time.sleepTicks(lllIIlllII[0]);
                            "".length();
                        }
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        if (llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr64 = new int[lllIIlllII[0]];
                            iArr64[lllIIlllII[1]] = lllIIlllII[117];
                            if (llIIIIlIlIlIl(TileObjects.getNearest(iArr64)) && llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[15])) {
                                int[] iArr65 = new int[lllIIlllII[0]];
                                iArr65[lllIIlllII[1]] = lllIIlllII[117];
                                TileObjects.getNearest(iArr65).interact(lllIIlIIlI[lllIIlllII[231]]);
                                Time.sleepTicks(lllIIlllII[6]);
                                "".length();
                            }
                        }
                        if (llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            String[] strArr76 = new String[lllIIlllII[0]];
                            strArr76[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[232]];
                            Bank.depositAll(strArr76);
                            int[] iArr66 = new int[lllIIlllII[0]];
                            iArr66[lllIIlllII[1]] = lllIIlllII[32];
                            Bank.depositAll(iArr66);
                            Bank.withdraw(lllIIlllII[34], lllIIlllII[0], Bank.WithdrawMode.ITEM);
                            Bank.withdraw(lllIIlllII[33], lllIIlllII[0], Bank.WithdrawMode.ITEM);
                            Bank.withdraw(lllIIlllII[21], lllIIlllII[7], Bank.WithdrawMode.ITEM);
                            Bank.withdraw(lllIIlllII[37], lllIIlllII[0], Bank.WithdrawMode.ITEM);
                        }
                    }
                }
                String[] strArr77 = new String[lllIIlllII[0]];
                strArr77[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[233]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr77) ? 1 : 0) && llIIIIlIlIIll(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0038y.bp();
                }
                if (llIIIIlIlIIIl(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[234]];
                        Movement.walkTo(dn);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        String[] strArr78 = new String[lllIIlllII[0]];
                        strArr78[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[235]];
                        TileObject nearest5 = TileObjects.getNearest(strArr78);
                        String[] strArr79 = new String[lllIIlllII[0]];
                        strArr79[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[236]];
                        if (llIIIIlIlIIIl(nearest5.hasAction(strArr79) ? 1 : 0)) {
                            String[] strArr80 = new String[lllIIlllII[0]];
                            strArr80[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[237]];
                            TileObjects.getNearest(strArr80).interact(lllIIlIIlI[lllIIlllII[229]]);
                            Time.sleepTicks(lllIIlllII[8]);
                            "".length();
                        }
                        String[] strArr81 = new String[lllIIlllII[0]];
                        strArr81[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[238]];
                        TileObject nearest6 = TileObjects.getNearest(strArr81);
                        String[] strArr82 = new String[lllIIlllII[0]];
                        strArr82[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[239]];
                        if (llIIIIlIlIIIl(nearest6.hasAction(strArr82) ? 1 : 0)) {
                            String[] strArr83 = new String[lllIIlllII[0]];
                            strArr83[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[240]];
                            TileObjects.getNearest(strArr83).interact(lllIIlIIlI[lllIIlllII[241]]);
                            Time.sleepTicks(lllIIlllII[8]);
                            "".length();
                        }
                    }
                }
                if (llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0020g.a(lllIIlIIlI[lllIIlllII[242]], cE);
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[175])) {
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[180])) {
                String[] strArr84 = new String[lllIIlllII[0]];
                strArr84[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[243]];
                if (llIIIIlIlIIll(Inventory.contains(strArr84) ? 1 : 0)) {
                    C0020g.a(lllIIlIIlI[lllIIlllII[244]], cE);
                }
                String[] strArr85 = new String[lllIIlllII[0]];
                strArr85[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[245]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr85) ? 1 : 0)) {
                    String[] strArr86 = new String[lllIIlllII[0]];
                    strArr86[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[246]];
                    Inventory.getFirst(strArr86).interact(lllIIlIIlI[lllIIlllII[247]]);
                    Time.sleepTicks(lllIIlllII[6]);
                    "".length();
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[187])) {
                String[] strArr87 = new String[lllIIlllII[0]];
                strArr87[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[248]];
                if (llIIIIlIlIIll(Inventory.contains(strArr87) ? 1 : 0)) {
                    String[] strArr88 = new String[lllIIlllII[0]];
                    strArr88[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[249]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr88) ? 1 : 0)) {
                        int[] iArr67 = new int[lllIIlllII[0]];
                        iArr67[lllIIlllII[1]] = lllIIlllII[250];
                        if (llIIIIlIlIlIl(TileObjects.getNearest(iArr67))) {
                            String[] strArr89 = new String[lllIIlllII[0]];
                            strArr89[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[251]];
                            if (llIIIIlIlIIIl(Inventory.contains(strArr89) ? 1 : 0)) {
                                String[] strArr90 = new String[lllIIlllII[0]];
                                strArr90[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[252]];
                                Inventory.getFirst(strArr90).interact(lllIIlIIlI[lllIIlllII[253]]);
                            }
                            int[] iArr68 = new int[lllIIlllII[0]];
                            iArr68[lllIIlllII[1]] = lllIIlllII[250];
                            TileObjects.getNearest(iArr68).interact(lllIIlIIlI[lllIIlllII[254]]);
                            Time.sleepTicks(lllIIlllII[7]);
                            "".length();
                        }
                    }
                    String[] strArr91 = new String[lllIIlllII[0]];
                    strArr91[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[255]];
                    if (llIIIIlIlIIll(Inventory.contains(strArr91) ? 1 : 0)) {
                        String[] strArr92 = new String[lllIIlllII[0]];
                        strArr92[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[256]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr92) ? 1 : 0)) {
                            int[] iArr69 = new int[lllIIlllII[0]];
                            iArr69[lllIIlllII[1]] = lllIIlllII[257];
                            if (llIIIIlIlIlIl(TileObjects.getNearest(iArr69))) {
                                String[] strArr93 = new String[lllIIlllII[0]];
                                strArr93[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[258]];
                                if (llIIIIlIlIIIl(Inventory.contains(strArr93) ? 1 : 0)) {
                                    String[] strArr94 = new String[lllIIlllII[0]];
                                    strArr94[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[259]];
                                    Inventory.getFirst(strArr94).interact(lllIIlIIlI[lllIIlllII[260]]);
                                }
                                int[] iArr70 = new int[lllIIlllII[0]];
                                iArr70[lllIIlllII[1]] = lllIIlllII[257];
                                TileObjects.getNearest(iArr70).interact(lllIIlIIlI[lllIIlllII[261]]);
                                Time.sleepTicks(lllIIlllII[7]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr95 = new String[lllIIlllII[0]];
                    strArr95[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[262]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr95) ? 1 : 0)) {
                        String[] strArr96 = new String[lllIIlllII[0]];
                        strArr96[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[263]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr96) ? 1 : 0)) {
                            String[] strArr97 = new String[lllIIlllII[0]];
                            strArr97[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[264]];
                            if (llIIIIlIlIIll(Inventory.contains(strArr97) ? 1 : 0)) {
                                if (llIIIIlIlIIlI(dt, lllIIlllII[6])) {
                                    C0020g.a(lllIIlIIlI[lllIIlllII[265]], cE);
                                    Time.sleepTicks(lllIIlllII[8]);
                                    "".length();
                                    dt += lllIIlllII[0];
                                }
                                C0020g.a(cE);
                                if (llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr98 = new String[lllIIlllII[0]];
                                    strArr98[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[266]];
                                    if (llIIIIlIlllII(NPCs.getNearest(strArr98))) {
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[267]];
                                        if (llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1])) ? 1 : 0)) {
                                            if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                                Dialog.close();
                                            }
                                            Movement.walkTo(new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1]));
                                            "".length();
                                            Time.sleepTicks(lllIIlllII[0]);
                                            "".length();
                                        }
                                        if (llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1])) ? 1 : 0)) {
                                            String[] strArr99 = new String[lllIIlllII[0]];
                                            strArr99[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[269]];
                                            TileObjects.getNearest(strArr99).interact(lllIIlIIlI[lllIIlllII[270]]);
                                            Time.sleepTicks(lllIIlllII[6]);
                                            "".length();
                                            String[] strArr100 = new String[lllIIlllII[0]];
                                            strArr100[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[271]];
                                            TileObjects.getNearest(strArr100).interact(lllIIlIIlI[lllIIlllII[272]]);
                                            Time.sleepTicks(lllIIlllII[6]);
                                            "".length();
                                        }
                                    }
                                    String[] strArr101 = new String[lllIIlllII[0]];
                                    strArr101[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[273]];
                                    if (llIIIIlIlIlIl(NPCs.getNearest(strArr101))) {
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[274]];
                                        C0020g.a(lllIIlIIlI[lllIIlllII[275]], cE);
                                    }
                                }
                            }
                        }
                    }
                    String[] strArr102 = new String[lllIIlllII[0]];
                    strArr102[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[276]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr102) ? 1 : 0)) {
                        String[] strArr103 = new String[lllIIlllII[0]];
                        strArr103[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[277]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr103) ? 1 : 0)) {
                            String[] strArr104 = new String[lllIIlllII[0]];
                            strArr104[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[278]];
                            if (llIIIIlIlIIIl(Inventory.contains(strArr104) ? 1 : 0)) {
                                String[] strArr105 = new String[lllIIlllII[0]];
                                strArr105[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[279]];
                                Item first9 = Inventory.getFirst(strArr105);
                                String[] strArr106 = new String[lllIIlllII[0]];
                                strArr106[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[280]];
                                first9.useOn(Inventory.getFirst(strArr106));
                            }
                        }
                    }
                    String[] strArr107 = new String[lllIIlllII[0]];
                    strArr107[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[281]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr107) ? 1 : 0)) {
                        SpellBook.Standard standard = SpellBook.Standard.LVL_2_ENCHANT;
                        String[] strArr108 = new String[lllIIlllII[0]];
                        strArr108[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[282]];
                        Magic.cast(standard, Inventory.getFirst(strArr108));
                    }
                    String[] strArr109 = new String[lllIIlllII[0]];
                    strArr109[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[283]];
                    if (llIIIIlIlIIIl(Inventory.contains(strArr109) ? 1 : 0)) {
                        String[] strArr110 = new String[lllIIlllII[0]];
                        strArr110[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[284]];
                        Item first10 = Inventory.getFirst(strArr110);
                        String[] strArr111 = new String[lllIIlllII[0]];
                        strArr111[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[285]];
                        first10.useOn(Inventory.getFirst(strArr111));
                    }
                }
                String[] strArr112 = new String[lllIIlllII[0]];
                strArr112[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[286]];
                if (llIIIIlIlIIIl(Inventory.contains(strArr112) ? 1 : 0)) {
                    String[] strArr113 = new String[lllIIlllII[0]];
                    strArr113[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[287]];
                    if (llIIIIlIlIlIl(NPCs.getNearest(strArr113))) {
                        String[] strArr114 = new String[lllIIlllII[0]];
                        strArr114[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[288]];
                        TileObjects.getNearest(strArr114).interact(lllIIlIIlI[lllIIlllII[289]]);
                        Time.sleepTicks(lllIIlllII[8]);
                        "".length();
                    }
                    String[] strArr115 = new String[lllIIlllII[0]];
                    strArr115[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[290]];
                    if (llIIIIlIlllII(NPCs.getNearest(strArr115))) {
                        if (llIIIIlIlIIll(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            C0038y.bp();
                        }
                        if (llIIIIlIlIIIl(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[291]];
                                Movement.walkTo(dn);
                                "".length();
                                Time.sleepTicks(lllIIlllII[0]);
                                "".length();
                            }
                            if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                                String[] strArr116 = new String[lllIIlllII[0]];
                                strArr116[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[292]];
                                TileObject nearest7 = TileObjects.getNearest(strArr116);
                                String[] strArr117 = new String[lllIIlllII[0]];
                                strArr117[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[293]];
                                if (llIIIIlIlIIIl(nearest7.hasAction(strArr117) ? 1 : 0)) {
                                    String[] strArr118 = new String[lllIIlllII[0]];
                                    strArr118[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[294]];
                                    TileObjects.getNearest(strArr118).interact(lllIIlIIlI[lllIIlllII[295]]);
                                    Time.sleepTicks(lllIIlllII[8]);
                                    "".length();
                                }
                                String[] strArr119 = new String[lllIIlllII[0]];
                                strArr119[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[296]];
                                TileObject nearest8 = TileObjects.getNearest(strArr119);
                                String[] strArr120 = new String[lllIIlllII[0]];
                                strArr120[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[38]];
                                if (llIIIIlIlIIIl(nearest8.hasAction(strArr120) ? 1 : 0)) {
                                    String[] strArr121 = new String[lllIIlllII[0]];
                                    strArr121[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[297]];
                                    TileObjects.getNearest(strArr121).interact(lllIIlIIlI[lllIIlllII[298]]);
                                    Time.sleepTicks(lllIIlllII[8]);
                                    "".length();
                                }
                            }
                        }
                        if (llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            C0020g.a(lllIIlIIlI[lllIIlllII[299]], cE);
                        }
                        C0020g.a(cE);
                    }
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[192])) {
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[197])) {
                C0020g.a(cE);
                if (llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    if (llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr122 = new String[lllIIlllII[0]];
                        strArr122[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[300]];
                        if (llIIIIlIlIIll(Equipment.contains(strArr122) ? 1 : 0)) {
                            String[] strArr123 = new String[lllIIlllII[0]];
                            strArr123[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[301]];
                            Inventory.getFirst(strArr123).interact(lllIIlIIlI[lllIIlllII[36]]);
                        }
                        String[] strArr124 = new String[lllIIlllII[0]];
                        strArr124[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[302]];
                        TileObjects.getNearest(strArr124).interact(lllIIlIIlI[lllIIlllII[303]]);
                        Time.sleepTicks(lllIIlllII[8]);
                        "".length();
                    }
                    if (llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIIIIlIlIIll(ba() ? 1 : 0)) {
                            bb();
                        }
                        if (llIIIIlIlIIIl(ba() ? 1 : 0)) {
                            C0020g.a(lllIIlIIlI[lllIIlllII[304]], cE);
                        }
                    }
                }
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[204])) {
                String[] strArr125 = new String[lllIIlllII[0]];
                strArr125[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[305]];
                NPC nearest9 = NPCs.getNearest(strArr125);
                if (llIIIIlIlllII(nearest9)) {
                    if (llIIIIlIlIIIl(ba() ? 1 : 0)) {
                        if (llIIIIlIllIll(llIIIIlIIllll(C0018e.w(), 100.0d))) {
                            String[] strArr126 = new String[lllIIlllII[0]];
                            strArr126[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[306]];
                            if (llIIIIlIlIIIl(Inventory.contains(strArr126) ? 1 : 0)) {
                                String[] strArr127 = new String[lllIIlllII[0]];
                                strArr127[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[307]];
                                Inventory.getFirst(strArr127).interact(lllIIlIIlI[lllIIlllII[308]]);
                                Time.sleepTicks(lllIIlllII[6]);
                                "".length();
                            }
                        }
                        if (llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3]) && llIIIIlIlIIIl(Inventory.contains(C0019f.aX) ? 1 : 0)) {
                            Inventory.getFirst(C0019f.aX).interact(lllIIlIIlI[lllIIlllII[309]]);
                            Time.sleepTicks(lllIIlllII[0]);
                            "".length();
                        }
                        C0020g.a(lllIIlIIlI[lllIIlllII[310]], cE);
                    }
                    if (llIIIIlIlIIll(ba() ? 1 : 0)) {
                        bb();
                    }
                }
                if (llIIIIlIlIlIl(nearest9)) {
                    if (llIIIIlIlllII(dr)) {
                        dr = nearest9.getWorldLocation();
                        ds = new WorldPoint(dr.getX() - lllIIlllII[12], dr.getY(), dr.getPlane());
                    }
                    if (llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[60]) && llIIIIlIlllIl(llIIIIlIlIIII(C0018e.w(), 65.0d))) {
                        Inventory.getFirst(C0019f.aX).interact(lllIIlIIlI[lllIIlllII[311]]);
                    }
                    if (llIIIIlIllIll(llIIIIlIIllll(C0018e.w(), 65.0d))) {
                        String[] strArr128 = new String[lllIIlllII[0]];
                        strArr128[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[312]];
                        if (llIIIIlIlIIIl(Inventory.contains(strArr128) ? 1 : 0)) {
                            String[] strArr129 = new String[lllIIlllII[0]];
                            strArr129[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[313]];
                            Inventory.getFirst(strArr129).interact(lllIIlIIlI[lllIIlllII[314]]);
                        }
                    }
                    if (llIIIIlIlIlll(Skills.getLevel(Skill.STRENGTH) + lllIIlllII[20], Skills.getBoostedLevel(Skill.STRENGTH)) && llIIIIlIlIIIl(Inventory.contains(C0019f.aY) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aY).interact(lllIIlIIlI[lllIIlllII[315]]);
                    }
                    String[] strArr130 = new String[lllIIlllII[0]];
                    strArr130[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[316]];
                    if ((llIIIIlIlIIll(Inventory.contains(strArr130) ? 1 : 0) && !llIIIIlIlllIl(llIIIIlIIllll(C0018e.w(), 50.0d))) || (llIIIIlIlIIll(Inventory.contains(C0019f.aX) ? 1 : 0) && llIIIIlIllIII(Prayers.getPoints(), lllIIlllII[7]))) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[317]];
                        TileObject nearest10 = TileObjects.getNearest(tileObject3 -> {
                            if (llIIIIlIlIIIl(tileObject3.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[439]]) ? 1 : 0)) {
                                String[] strArr131 = new String[lllIIlllII[0]];
                                strArr131[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[440]];
                                if (llIIIIlIlIIIl(tileObject3.hasAction(strArr131) ? 1 : 0)) {
                                    ?? r0 = lllIIlllII[0];
                                    "".length();
                                    return (-((53 ^ 98) ^ (106 ^ 56))) >= 0 ? ((44 ^ 95) ^ (58 ^ 64)) & (((40 ^ 68) ^ (26 ^ 127)) ^ (-" ".length())) : r0;
                                }
                            }
                            return lllIIlllII[1];
                        });
                        if (llIIIIlIlIlIl(nearest10)) {
                            nearest10.interact(lllIIlIIlI[lllIIlllII[318]]);
                            Time.sleepTicks(lllIIlllII[8]);
                            "".length();
                        }
                    }
                    if (llIIIIlIlIIIl(AccBuilderSotf.i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[319]];
                        TileObjects.getAll(tileObject4 -> {
                            if (llIIIIlIllIIl(tileObject4.getId(), lllIIlllII[436]) && llIIIIlIlIlll(tileObject4.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[8])) {
                                ?? r0 = lllIIlllII[0];
                                "".length();
                                return (-" ".length()) != (-" ".length()) ? ((((150 + 161) - 259) + 137) ^ (((73 + 41) - 10) + 66)) & ((" ".length() ^ (211 ^ 197)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlllII[1];
                        });
                        TileObjects.getAll(tileObject5 -> {
                            if (llIIIIlIllIIl(tileObject5.getId(), lllIIlllII[435]) && llIIIIlIlIlll(tileObject5.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[8])) {
                                ?? r0 = lllIIlllII[0];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlllII[1];
                        });
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        if (llIIIIlIlIlII(worldLocation.distanceTo(ds), lllIIlllII[7])) {
                            Movement.walkTo(ds);
                            "".length();
                        }
                        if (llIIIIlIlIlII(worldLocation.distanceTo(dr), lllIIlllII[7]) && llIIIIlIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                            Movement.walkTo(dr);
                            "".length();
                        }
                    }
                    String[] strArr131 = new String[lllIIlllII[0]];
                    strArr131[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[320]];
                    if (llIIIIlIlIlIl(NPCs.getNearest(strArr131))) {
                        String[] strArr132 = new String[lllIIlllII[0]];
                        strArr132[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[321]];
                        NPC nearest11 = NPCs.getNearest(strArr132);
                        String[] strArr133 = new String[lllIIlllII[0]];
                        strArr133[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[322]];
                        if (llIIIIlIlIIIl(nearest11.hasAction(strArr133) ? 1 : 0)) {
                            String[] strArr134 = new String[lllIIlllII[0]];
                            strArr134[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[323]];
                            if (llIIIIlIlIIll(nearest9.hasAction(strArr134) ? 1 : 0)) {
                                String[] strArr135 = new String[lllIIlllII[0]];
                                strArr135[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[324]];
                                if (llIIIIlIlIIIl(Inventory.contains(strArr135) ? 1 : 0)) {
                                    if (llIIIIlIlIIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                    }
                                    if (llIIIIlIlIIIl(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                                    }
                                    if (llIIIIlIlIIIl(AccBuilderSotf.i.isEmpty() ? 1 : 0) && llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                        NPCs.getNearest(npc -> {
                                            if (llIIIIlIlIIIl(npc.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[437]]) ? 1 : 0)) {
                                                String[] strArr136 = new String[lllIIlllII[0]];
                                                strArr136[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[438]];
                                                if (llIIIIlIlIIIl(npc.hasAction(strArr136) ? 1 : 0)) {
                                                    ?? r0 = lllIIlllII[0];
                                                    "".length();
                                                    return "   ".length() == ((102 ^ 60) & ((227 ^ 185) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                }
                                            }
                                            return lllIIlllII[1];
                                        }).interact(lllIIlIIlI[lllIIlllII[325]]);
                                    }
                                }
                            }
                        }
                    }
                    String[] strArr136 = new String[lllIIlllII[0]];
                    strArr136[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[326]];
                    if (llIIIIlIlIlIl(NPCs.getNearest(strArr136))) {
                        String[] strArr137 = new String[lllIIlllII[0]];
                        strArr137[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[327]];
                        NPC nearest12 = NPCs.getNearest(strArr137);
                        String[] strArr138 = new String[lllIIlllII[0]];
                        strArr138[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[328]];
                        if (llIIIIlIlIIll(nearest12.hasAction(strArr138) ? 1 : 0)) {
                            String[] strArr139 = new String[lllIIlllII[0]];
                            strArr139[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[329]];
                            if (llIIIIlIlIIIl(nearest9.hasAction(strArr139) ? 1 : 0)) {
                                if (llIIIIlIlIlll(nearest9.getHealthRatio(), lllIIlllII[29])) {
                                    if (llIIIIlIlIIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.PROTECT_FROM_MAGIC);
                                    }
                                    if (llIIIIlIlIIll(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                                    }
                                }
                                if (llIIIIlIllIII(nearest9.getHealthRatio(), lllIIlllII[29]) && llIIIIlIlIIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                }
                                if (llIIIIlIllIIl(nearest9.getAnimation(), lllIIlllII[330])) {
                                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[331]];
                                    TileObjects.getAll(tileObject6 -> {
                                        if (llIIIIlIllIIl(tileObject6.getId(), lllIIlllII[436]) && llIIIIlIlIlll(tileObject6.getWorldLocation().distanceTo(nearest9.getWorldLocation()), lllIIlllII[9])) {
                                            ?? r0 = lllIIlllII[0];
                                            "".length();
                                            return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIIlllII[1];
                                    });
                                    TileObjects.getAll(tileObject7 -> {
                                        if (llIIIIlIllIIl(tileObject7.getId(), lllIIlllII[435]) && llIIIIlIlIlll(tileObject7.getWorldLocation().distanceTo(nearest9.getWorldLocation()), lllIIlllII[9])) {
                                            ?? r0 = lllIIlllII[0];
                                            "".length();
                                            return (-" ".length()) != (-" ".length()) ? (((19 ^ 84) & ((41 ^ 110) ^ (-1))) ^ (13 ^ 91)) & (((116 ^ 41) ^ (186 ^ 177)) ^ (-" ".length())) & ((((5 ^ 24) ^ (129 ^ 182)) & (((((177 + 139) - 228) + 90) ^ (((49 + 36) - (-62)) + 5)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                                        }
                                        return lllIIlllII[1];
                                    });
                                    Movement.walkTo(ds);
                                    "".length();
                                    Time.sleepTicks(lllIIlllII[0]);
                                    "".length();
                                }
                                if (llIIIIlIllIlI(nearest9.getAnimation(), lllIIlllII[330]) && llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                    nearest9.interact(lllIIlIIlI[lllIIlllII[332]]);
                                    Time.sleepTicks(lllIIlllII[0]);
                                    "".length();
                                }
                            }
                        }
                    }
                    String[] strArr140 = new String[lllIIlllII[0]];
                    strArr140[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[333]];
                    if (llIIIIlIlllII(NPCs.getNearest(strArr140))) {
                        String[] strArr141 = new String[lllIIlllII[0]];
                        strArr141[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[334]];
                        if (llIIIIlIlIIIl(nearest9.hasAction(strArr141) ? 1 : 0)) {
                            if (llIIIIlIlIIll(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                            }
                            if (llIIIIlIlIlll(nearest9.getHealthRatio(), lllIIlllII[29]) && llIIIIlIlIIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MAGIC);
                            }
                            if (llIIIIlIllIII(nearest9.getHealthRatio(), lllIIlllII[29]) && llIIIIlIlIIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                            if (llIIIIlIllIlI(nearest9.getAnimation(), lllIIlllII[330]) && llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                nearest9.interact(lllIIlIIlI[lllIIlllII[335]]);
                                Time.sleepTicks(lllIIlllII[0]);
                                "".length();
                            }
                        }
                    }
                }
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[26])) {
                C0020g.a(cE);
            }
            if (llIIIIlIllIIl(Vars.getBit(QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                if (llIIIIlIlIIIl(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr71 = new int[lllIIlllII[0]];
                    iArr71[lllIIlllII[1]] = lllIIlllII[30];
                    if (llIIIIlIlIIll(Inventory.contains(iArr71) ? 1 : 0)) {
                        if (llIIIIlIllIll(llIIIIlIIllll(C0018e.w(), 100.0d))) {
                            String[] strArr142 = new String[lllIIlllII[0]];
                            strArr142[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[336]];
                            if (llIIIIlIlIIIl(Inventory.contains(strArr142) ? 1 : 0)) {
                                String[] strArr143 = new String[lllIIlllII[0]];
                                strArr143[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[337]];
                                Inventory.getFirst(strArr143).interact(lllIIlIIlI[lllIIlllII[338]]);
                            }
                        }
                        if (llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3]) && llIIIIlIlIIIl(Inventory.contains(C0019f.aX) ? 1 : 0)) {
                            Inventory.getFirst(C0019f.aX).interact(lllIIlIIlI[lllIIlllII[339]]);
                        }
                        bb();
                    }
                    int[] iArr72 = new int[lllIIlllII[0]];
                    iArr72[lllIIlllII[1]] = lllIIlllII[30];
                    if (llIIIIlIlIIIl(Inventory.contains(iArr72) ? 1 : 0) && llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[340]];
                        Movement.walkTo(dn);
                        "".length();
                        Time.sleepTicks(lllIIlllII[0]);
                        "".length();
                    }
                    if (llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        String[] strArr144 = new String[lllIIlllII[0]];
                        strArr144[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[341]];
                        TileObject nearest13 = TileObjects.getNearest(strArr144);
                        String[] strArr145 = new String[lllIIlllII[0]];
                        strArr145[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[342]];
                        if (llIIIIlIlIIIl(nearest13.hasAction(strArr145) ? 1 : 0)) {
                            String[] strArr146 = new String[lllIIlllII[0]];
                            strArr146[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[343]];
                            TileObjects.getNearest(strArr146).interact(lllIIlIIlI[lllIIlllII[344]]);
                            Time.sleepTicks(lllIIlllII[8]);
                            "".length();
                        }
                        String[] strArr147 = new String[lllIIlllII[0]];
                        strArr147[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[345]];
                        TileObject nearest14 = TileObjects.getNearest(strArr147);
                        String[] strArr148 = new String[lllIIlllII[0]];
                        strArr148[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[346]];
                        if (llIIIIlIlIIIl(nearest14.hasAction(strArr148) ? 1 : 0)) {
                            String[] strArr149 = new String[lllIIlllII[0]];
                            strArr149[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[347]];
                            TileObjects.getNearest(strArr149).interact(lllIIlIIlI[lllIIlllII[348]]);
                            Time.sleepTicks(lllIIlllII[8]);
                            "".length();
                        }
                    }
                }
                if (llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIlIIlI(di, lllIIlllII[0])) {
                        aN.su += lllIIlllII[0];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIlllII[0];
                        aN.su = lllIIlllII[1];
                        dj = lllIIlllII[1];
                    }
                    C0020g.a(lllIIlIIlI[lllIIlllII[349]], cE);
                }
                C0020g.a(cE);
            }
            String[] strArr150 = new String[lllIIlllII[0]];
            strArr150[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[350]];
            if (llIIIIlIlIIIl(Inventory.contains(strArr150) ? 1 : 0)) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[351]];
                String[] strArr151 = new String[lllIIlllII[0]];
                strArr151[lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[352]];
                Inventory.getFirst(strArr151).interact(lllIIlIIlI[lllIIlllII[353]]);
                Time.sleepTicks(lllIIlllII[8]);
                "".length();
            }
            Widget widget = Widgets.get(lllIIlllII[308], lllIIlllII[14]);
            if (llIIIIlIlIlIl(widget)) {
                widget.interact(lllIIlIIlI[lllIIlllII[354]]);
                Time.sleepTicks(lllIIlllII[0]);
                "".length();
            }
            Widget widget2 = Widgets.get(lllIIlllII[308], lllIIlllII[70]);
            if (llIIIIlIlIlIl(widget2)) {
                widget2.interact(lllIIlIIlI[lllIIlllII[355]]);
                Time.sleepTicks(lllIIlllII[6]);
                "".length();
            }
            C0020g.a(cE);
        }
    }
}
