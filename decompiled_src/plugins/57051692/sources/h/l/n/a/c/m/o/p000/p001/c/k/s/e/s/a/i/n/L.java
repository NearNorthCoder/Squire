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
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.L  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/L.class */
public class L implements K {
    public static /* synthetic */ int jt;
    static /* synthetic */ WorldArea ju;
    private static /* synthetic */ int[] lIllIIIIII;
    private static /* synthetic */ String[] lIlIllllll;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<C0003d> bp;
    static /* synthetic */ WorldArea jv;
    public static /* synthetic */ int jr;
    public static /* synthetic */ int js;
    private static /* synthetic */ WorldPoint jx;
    static /* synthetic */ WorldArea jw;

    private static boolean lIIlIlIlIIlIl(int i, int i2) {
        return i > i2;
    }

    private static void lIIlIlIlIIIII() {
        lIllIIIIII = new int[239];
        lIllIIIIII[0] = ((44 ^ 70) ^ (212 ^ 149)) & (((((7 + 106) - 78) + 106) ^ (((33 + 32) - (-48)) + 53)) ^ (-" ".length()));
        lIllIIIIII[1] = " ".length();
        lIllIIIIII[2] = ((145 ^ 129) & ((214 ^ 198) ^ (-1))) ^ (40 ^ 54);
        lIllIIIIII[3] = "  ".length();
        lIllIIIIII[4] = (-((-1613) & 26237)) & (-4097) & 32183;
        lIllIIIIII[5] = (-((-15433) & 31819)) & (-12409) & 32255;
        lIllIIIIII[6] = (((133 + 80) - 81) + 46) ^ (((87 + 84) - 67) + 36);
        lIllIIIIII[7] = (((32 + 62) - 16) + 100) ^ (((107 + 72) - 118) + 68);
        lIllIIIIII[8] = (-29249) & 32760;
        lIllIIIIII[9] = (-12386) & 15865;
        lIllIIIIII[10] = "   ".length();
        lIllIIIIII[11] = (-3125) & 8124;
        lIllIIIIII[12] = 92 ^ 86;
        lIllIIIIII[13] = (-24601) & 32607;
        lIllIIIIII[14] = (-24612) & 32619;
        lIllIIIIII[15] = (-8199) & 16207;
        lIllIIIIII[16] = (-(225 ^ 160)) & (-20627) & 24543;
        lIllIIIIII[17] = 121 ^ 125;
        lIllIIIIII[18] = (-((-9225) & 29707)) & (-2) & 32463;
        lIllIIIIII[19] = (161 ^ 190) ^ (34 ^ 56);
        lIllIIIIII[20] = (-17409) & 30033;
        lIllIIIIII[21] = 8 ^ 14;
        lIllIIIIII[22] = (-((-5250) & 21687)) & (-8321) & 32767;
        lIllIIIIII[23] = 108 ^ 107;
        lIllIIIIII[24] = (-17447) & 17831;
        lIllIIIIII[25] = 8 ^ 0;
        lIllIIIIII[26] = (-((-21081) & 29533)) & (-4169) & 32239;
        lIllIIIIII[27] = (69 ^ 36) ^ (76 ^ 36);
        lIllIIIIII[28] = (-2085) & 23230;
        lIllIIIIII[29] = (-((-11038) & 31647)) & (-265) & 32733;
        lIllIIIIII[30] = (-16517) & 28372;
        lIllIIIIII[31] = (-20530) & 32383;
        lIllIIIIII[32] = (-((-3335) & 23991)) & (-3) & 32510;
        lIllIIIIII[33] = (-4262) & 16119;
        lIllIIIIII[34] = (-20770) & 32619;
        lIllIIIIII[35] = (-265) & 12232;
        lIllIIIIII[36] = (5 ^ 42) ^ (176 ^ 199);
        lIllIIIIII[37] = (-4277) & 24511;
        lIllIIIIII[38] = (59 ^ 22) ^ (196 ^ 193);
        lIllIIIIII[39] = 129 ^ 142;
        lIllIIIIII[40] = 126 ^ 76;
        lIllIIIIII[41] = (193 ^ 169) ^ (120 ^ 4);
        lIllIIIIII[42] = (198 ^ 162) ^ (126 ^ 3);
        lIllIIIIII[43] = (-((-1031) & 3159)) & (-30338) & 32767;
        lIllIIIIII[44] = (111 ^ 12) ^ (77 ^ 18);
        lIllIIIIII[45] = (-8257) & 8563;
        lIllIIIIII[46] = (-24587) & 27055;
        lIllIIIIII[47] = (-((-2349) & 15293)) & (-1) & 16379;
        lIllIIIIII[48] = (-652) & 4075;
        lIllIIIIII[49] = (67 ^ 37) ^ (66 ^ 47);
        lIllIIIIII[50] = (-((-11591) & 32615)) & (-8193) & 32637;
        lIllIIIIII[51] = (-((-7043) & 32723)) & (-4103) & 32247;
        lIllIIIIII[52] = (-((-9613) & 30093)) & (-8329) & 32223;
        lIllIIIIII[53] = 0 ^ 14;
        lIllIIIIII[54] = 148 ^ 134;
        lIllIIIIII[55] = (-((-9993) & 26441)) & (-13833) & 32763;
        lIllIIIIII[56] = (-131) & 3546;
        lIllIIIIII[57] = (-(2 ^ 71)) & (-12801) & 15350;
        lIllIIIIII[58] = (-8227) & 11643;
        lIllIIIIII[59] = (-519) & 2999;
        lIllIIIIII[60] = (-((-19571) & 32383)) & (-17) & 16255;
        lIllIIIIII[61] = 110 ^ 120;
        lIllIIIIII[62] = -" ".length();
        lIllIIIIII[63] = 57 ^ 53;
        lIllIIIIII[64] = 181 ^ 184;
        lIllIIIIII[65] = 2 ^ 18;
        lIllIIIIII[66] = 125 ^ 108;
        lIllIIIIII[67] = 215 ^ 196;
        lIllIIIIII[68] = (((122 + 174) - 184) + 103) ^ (((100 + 135) - 42) + 1);
        lIllIIIIII[69] = 57 ^ 46;
        lIllIIIIII[70] = 50 ^ 42;
        lIllIIIIII[71] = (99 ^ 92) ^ (178 ^ 151);
        lIllIIIIII[72] = (((149 + 161) - 283) + 158) ^ (((161 + 77) - 199) + 123);
        lIllIIIIII[73] = (200 ^ 186) ^ (120 ^ 22);
        lIllIIIIII[74] = 50 ^ 47;
        lIllIIIIII[75] = (((120 + 74) - 83) + 53) ^ (((74 + 185) - 184) + 112);
        lIllIIIIII[76] = (-(26 ^ 59)) & (-12801) & 15999;
        lIllIIIIII[77] = (-((-7191) & 15583)) & (-20994) & 32735;
        lIllIIIIII[78] = ((" ".length() + (227 ^ 148)) - (137 ^ 128)) + (115 ^ 105);
        lIllIIIIII[79] = (228 ^ 170) ^ (102 ^ 118);
        lIllIIIIII[80] = (-21345) & 24563;
        lIllIIIIII[81] = (-24619) & 28027;
        lIllIIIIII[82] = (-((-19557) & 20341)) & (-28705) & 32700;
        lIllIIIIII[83] = (-((-18597) & 27301)) & (-2) & 11903;
        lIllIIIIII[84] = (-556) & 3967;
        lIllIIIIII[85] = (-13185) & 16374;
        lIllIIIIII[86] = (-((-3085) & 7855)) & (-24585) & 32767;
        lIllIIIIII[87] = (-((-2377) & 22911)) & (-8705) & 32639;
        lIllIIIIII[88] = (-4885) & 8063;
        lIllIIIIII[89] = (-((-7593) & 24489)) & (-201) & 20478;
        lIllIIIIII[90] = (-4613) & 7829;
        lIllIIIIII[91] = (-12426) & 15817;
        lIllIIIIII[92] = (-28685) & 31918;
        lIllIIIIII[93] = (-4786) & 8187;
        lIllIIIIII[94] = (-4745) & 8154;
        lIllIIIIII[95] = (((124 + 67) - 167) + 124) ^ (((97 + 85) - 141) + 139);
        lIllIIIIII[96] = (-((-10441) & 10700)) & (-513) & 3995;
        lIllIIIIII[97] = (26 ^ 96) ^ (215 ^ 140);
        lIllIIIIII[98] = (((54 + 100) - 141) + 138) ^ (((53 + 50) - 26) + 104);
        lIllIIIIII[99] = (((6 + 3) - (-132)) + 3) ^ (((121 + 55) - 14) + 17);
        lIllIIIIII[100] = (98 ^ 57) ^ (((65 + 100) - 160) + 122);
        lIllIIIIII[101] = (((15 + 74) - 70) + 112) ^ (((65 + 42) - 55) + 114);
        lIllIIIIII[102] = (63 ^ 88) ^ (220 ^ 157);
        lIllIIIIII[103] = (240 ^ 146) ^ (69 ^ 0);
        lIllIIIIII[104] = (-((-12297) & 31241)) & (-195) & 27638;
        lIllIIIIII[105] = (185 ^ 138) ^ (161 ^ 187);
        lIllIIIIII[106] = 38 ^ 12;
        lIllIIIIII[107] = 60 ^ 23;
        lIllIIIIII[108] = (((65 + 63) - 85) + 138) ^ (((145 + 83) - 189) + 114);
        lIllIIIIII[109] = (92 ^ 20) ^ (247 ^ 146);
        lIllIIIIII[110] = (95 ^ 48) ^ (202 ^ 139);
        lIllIIIIII[111] = (156 ^ 138) ^ (74 ^ 115);
        lIllIIIIII[112] = (228 ^ 142) ^ (39 ^ 125);
        lIllIIIIII[113] = 186 ^ 139;
        lIllIIIIII[114] = 103 ^ 83;
        lIllIIIIII[115] = (-((-6193) & 24117)) & (-1) & 32758;
        lIllIIIIII[116] = (214 ^ 168) ^ (54 ^ 125);
        lIllIIIIII[117] = (169 ^ 191) ^ (127 ^ 95);
        lIllIIIIII[118] = (-1541) & 16375;
        lIllIIIIII[119] = 158 ^ 169;
        lIllIIIIII[120] = (250 ^ 189) ^ (((54 + 76) - 106) + 103);
        lIllIIIIII[121] = (-(186 ^ 176)) & (-17409) & 32253;
        lIllIIIIII[122] = 157 ^ 164;
        lIllIIIIII[123] = 88 ^ 98;
        lIllIIIIII[124] = (7 ^ 100) ^ (197 ^ 157);
        lIllIIIIII[125] = (-((-2479) & 31743)) & (-1) & 32735;
        lIllIIIIII[126] = (-((-2154) & 19055)) & (-8193) & 28559;
        lIllIIIIII[127] = (-17) & 3518;
        lIllIIIIII[128] = (-((-21511) & 22103)) & (-4110) & 8191;
        lIllIIIIII[129] = (-29265) & 32759;
        lIllIIIIII[130] = (-((-16535) & 20727)) & (-25093) & 32767;
        lIllIIIIII[131] = (-(107 ^ 40)) & (-12305) & 15867;
        lIllIIIIII[132] = (-((-18625) & 27344)) & (-20577) & 32767;
        lIllIIIIII[133] = (-28679) & 32167;
        lIllIIIIII[134] = (-28681) & 32155;
        lIllIIIIII[135] = (-((-3079) & 23655)) & (-8705) & 32765;
        lIllIIIIII[136] = (-8821) & 12287;
        lIllIIIIII[137] = (-8714) & 12219;
        lIllIIIIII[138] = (-4685) & 8157;
        lIllIIIIII[139] = (-4642) & 8127;
        lIllIIIIII[140] = (1 ^ 75) ^ (103 ^ 16);
        lIllIIIIII[141] = 33 ^ 30;
        lIllIIIIII[142] = 99 ^ 35;
        lIllIIIIII[143] = (198 ^ 187) ^ (132 ^ 184);
        lIllIIIIII[144] = (((115 + 15) - (-10)) + 79) ^ (((126 + 81) - 96) + 42);
        lIllIIIIII[145] = (((48 + 143) - 151) + 154) ^ (((90 + 58) - 51) + 32);
        lIllIIIIII[146] = 3 ^ 71;
        lIllIIIIII[147] = (134 ^ 183) ^ (72 ^ 60);
        lIllIIIIII[148] = (((121 + 44) - 151) + 238) ^ (((155 + 53) - 90) + 68);
        lIllIIIIII[149] = 6 ^ 65;
        lIllIIIIII[150] = (146 ^ 197) ^ (162 ^ 189);
        lIllIIIIII[151] = (((82 + 224) - 279) + 206) ^ (((93 + 0) - 22) + 89);
        lIllIIIIII[152] = (((152 + 11) - 95) + 125) ^ (((109 + 37) - 137) + 130);
        lIllIIIIII[153] = 102 ^ 45;
        lIllIIIIII[154] = 207 ^ 131;
        lIllIIIIII[155] = 41 ^ 100;
        lIllIIIIII[156] = (119 ^ 85) ^ (114 ^ 30);
        lIllIIIIII[157] = 226 ^ 173;
        lIllIIIIII[158] = (((208 + 67) - 181) + 120) ^ (((93 + 91) - 57) + 7);
        lIllIIIIII[159] = (254 ^ 144) ^ (12 ^ 51);
        lIllIIIIII[160] = (((10 + 30) - (-68)) + 91) ^ (((17 + 56) - (-7)) + 69);
        lIllIIIIII[161] = 20 ^ 71;
        lIllIIIIII[162] = (-28801) & 31487;
        lIllIIIIII[163] = (-((-109) & 21230)) & (-1) & 24575;
        lIllIIIIII[164] = (-((-173) & 29165)) & (-1057) & 32767;
        lIllIIIIII[165] = (-25635) & 28335;
        lIllIIIIII[166] = (-((-4355) & 30063)) & (-4353) & 32767;
        lIllIIIIII[167] = (-1141) & 3837;
        lIllIIIIII[168] = (-((-3605) & 12085)) & (-5211) & 16378;
        lIllIIIIII[169] = (-((-1169) & 18175)) & (-8193) & 28655;
        lIllIIIIII[170] = (-20547) & 23275;
        lIllIIIIII[171] = (-29273) & 32760;
        lIllIIIIII[172] = (((108 + 137) - 210) + 175) ^ (((32 + 74) - 1) + 29);
        lIllIIIIII[173] = (91 ^ 0) ^ (172 ^ 162);
        lIllIIIIII[174] = 4 ^ 82;
        lIllIIIIII[175] = (106 ^ 122) ^ (254 ^ 185);
        lIllIIIIII[176] = (33 ^ 26) ^ (27 ^ 121);
        lIllIIIIII[177] = (((46 + 60) - 73) + 196) ^ (((44 + 43) - (-28)) + 76);
        lIllIIIIII[178] = 125 ^ 38;
        lIllIIIIII[179] = (249 ^ 136) ^ (19 ^ 62);
        lIllIIIIII[180] = 94 ^ 3;
        lIllIIIIII[181] = 255 ^ 160;
        lIllIIIIII[182] = 20 ^ 116;
        lIllIIIIII[183] = 115 ^ 18;
        lIllIIIIII[184] = 202 ^ 168;
        lIllIIIIII[185] = 74 ^ 41;
        lIllIIIIII[186] = 199 ^ 163;
        lIllIIIIII[187] = (93 ^ 116) ^ (69 ^ 9);
        lIllIIIIII[188] = 220 ^ 186;
        lIllIIIIII[189] = (-13057) & 16247;
        lIllIIIIII[190] = (-28809) & 32222;
        lIllIIIIII[191] = (-((-57) & 12601)) & (-130) & 15855;
        lIllIIIIII[192] = (-24577) & 27963;
        lIllIIIIII[193] = (-(((82 + 123) - 201) + 131)) & (-20513) & 32495;
        lIllIIIIII[194] = 52 ^ 83;
        lIllIIIIII[195] = (-10753) & 16252;
        lIllIIIIII[196] = (-((-27081) & 28635)) & (-6209) & 32762;
        lIllIIIIII[197] = (-10267) & 11166;
        lIllIIIIII[198] = (-((-26069) & 32221)) & (-17409) & 24510;
        lIllIIIIII[199] = (-((-1031) & 19495)) & (-4162) & 24575;
        lIllIIIIII[200] = (-((-9093) & 15246)) & (-1) & 15103;
        lIllIIIIII[201] = (-4358) & 16335;
        lIllIIIIII[202] = (-((-16387) & 23203)) & (-2) & 32767;
        lIllIIIIII[203] = 34 ^ 74;
        lIllIIIIII[204] = 192 ^ 169;
        lIllIIIIII[205] = 18 ^ 120;
        lIllIIIIII[206] = 115 ^ 24;
        lIllIIIIII[207] = 100 ^ 8;
        lIllIIIIII[208] = (51 ^ 82) ^ (116 ^ 120);
        lIllIIIIII[209] = (-((-6147) & 31763)) & (-65) & 28383;
        lIllIIIIII[210] = (-25143) & 28607;
        lIllIIIIII[211] = (46 ^ 95) ^ (98 ^ 125);
        lIllIIIIII[212] = (-8801) & 12269;
        lIllIIIIII[213] = (((116 + 107) - 136) + 112) ^ (((117 + 159) - 120) + 12);
        lIllIIIIII[214] = (-((-23059) & 32635)) & (-4097) & 16383;
        lIllIIIIII[215] = (-((-18705) & 23419)) & (-24578) & 32767;
        lIllIIIIII[216] = (((106 + 67) - (-18)) + 22) ^ (((149 + 113) - 254) + 157);
        lIllIIIIII[217] = (-12321) & 15030;
        lIllIIIIII[218] = 96 ^ 17;
        lIllIIIIII[219] = (-5205) & 7925;
        lIllIIIIII[220] = (-585) & 4077;
        lIllIIIIII[221] = 49 ^ 67;
        lIllIIIIII[222] = (-((-27781) & 32397)) & (-8194) & 16319;
        lIllIIIIII[223] = (-21059) & 24542;
        lIllIIIIII[224] = 84 ^ 39;
        lIllIIIIII[225] = (-20561) & 24063;
        lIllIIIIII[226] = (188 ^ 197) ^ (85 ^ 88);
        lIllIIIIII[227] = (((100 + 96) - 182) + 167) ^ (((129 + 7) - 107) + 163);
        lIllIIIIII[228] = (-20522) & 23999;
        lIllIIIIII[229] = (-((-3121) & 15483)) & (-16898) & 32751;
        lIllIIIIII[230] = (131 ^ 194) ^ (108 ^ 91);
        lIllIIIIII[231] = (-((-24859) & 29535)) & (-8193) & 16367;
        lIllIIIIII[232] = 14 ^ 121;
        lIllIIIIII[233] = (163 ^ 153) ^ (133 ^ 199);
        lIllIIIIII[234] = (-(111 ^ 46)) & (-11) & 3579;
        lIllIIIIII[235] = (-4107) & 6574;
        lIllIIIIII[236] = (-((-9126) & 26535)) & (-12821) & 32703;
        lIllIIIIII[237] = (-((-2135) & 26711)) & (-145) & 28157;
        lIllIIIIII[238] = 249 ^ 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIIlIlIlIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.L.lIllIIIIII[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIIlIlIlIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.L.lIllIIIIII[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIllIIIIII[1]];
        iArr4[lIllIIIIII[0]] = lIllIIIIII[16];
        if (lIIlIlIlIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIII[16], lIllIIIIII[1], lIllIIIIII[195]));
            "".length();
        }
        int[] iArr5 = new int[lIllIIIIII[1]];
        iArr5[lIllIIIIII[0]] = lIllIIIIII[18];
        if (lIIlIlIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIII[18], lIllIIIIII[3], lIllIIIIII[196]));
            "".length();
        }
        int[] iArr6 = new int[lIllIIIIII[1]];
        iArr6[lIllIIIIII[0]] = lIllIIIIII[28];
        if (lIIlIlIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIII[28], lIllIIIIII[3], lIllIIIIII[196]));
            "".length();
        }
        int[] iArr7 = new int[lIllIIIIII[1]];
        iArr7[lIllIIIIII[0]] = lIllIIIIII[13];
        if (lIIlIlIlIIIll(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIII[13], lIllIIIIII[12], lIllIIIIII[197]));
            "".length();
        }
        int[] iArr8 = new int[lIllIIIIII[1]];
        iArr8[lIllIIIIII[0]] = lIllIIIIII[22];
        if (lIIlIlIlIIIll(Bank.contains(iArr8) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIII[22], lIllIIIIII[12], lIllIIIIII[198]));
            "".length();
        }
        int[] iArr9 = new int[lIllIIIIII[1]];
        iArr9[lIllIIIIII[0]] = lIllIIIIII[15];
        if (lIIlIlIlIIIll(Bank.contains(iArr9) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIII[15], lIllIIIIII[12], lIllIIIIII[198]));
            "".length();
        }
        int[] iArr10 = new int[lIllIIIIII[1]];
        iArr10[lIllIIIIII[0]] = lIllIIIIII[14];
        if (lIIlIlIlIIIll(Bank.contains(iArr10) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIII[14], lIllIIIIII[12], lIllIIIIII[198]));
            "".length();
        }
        int[] iArr11 = new int[lIllIIIIII[1]];
        iArr11[lIllIIIIII[0]] = lIllIIIIII[24];
        if (lIIlIlIlIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIllIIIIII[1]];
            iArr12[lIllIIIIII[0]] = lIllIIIIII[24];
            if (lIIlIlIlIIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIllIIIIII[1]];
                iArr13[lIllIIIIII[0]] = lIllIIIIII[24];
            }
            iArr = new int[lIllIIIIII[1]];
            iArr[lIllIIIIII[0]] = lIllIIIIII[26];
            if (lIIlIlIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIllIIIIII[1]];
                iArr14[lIllIIIIII[0]] = lIllIIIIII[26];
                if (lIIlIlIlIIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIllIIIIII[1]];
                    iArr15[lIllIIIIII[0]] = lIllIIIIII[26];
                }
                iArr2 = new int[lIllIIIIII[1]];
                iArr2[lIllIIIIII[0]] = lIllIIIIII[201];
                if (lIIlIlIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                    bp.add(new C0003d(lIllIIIIII[201], lIllIIIIII[1], lIllIIIIII[202]));
                    "".length();
                }
                iArr3 = new int[lIllIIIIII[1]];
                iArr3[lIllIIIIII[0]] = lIllIIIIII[20];
                if (lIIlIlIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
                    bp.add(new C0003d(lIllIIIIII[20], lIllIIIIII[41], C0009j.bZ));
                    "".length();
                    return;
                }
                return;
            }
            bp.add(new C0003d(lIllIIIIII[26], lIllIIIIII[12], lIllIIIIII[200]));
            "".length();
            iArr2 = new int[lIllIIIIII[1]];
            iArr2[lIllIIIIII[0]] = lIllIIIIII[201];
            if (lIIlIlIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIllIIIIII[1]];
            iArr3[lIllIIIIII[0]] = lIllIIIIII[20];
            if (lIIlIlIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bp.add(new C0003d(js, lIllIIIIII[44], lIllIIIIII[199]));
        "".length();
        iArr = new int[lIllIIIIII[1]];
        iArr[lIllIIIIII[0]] = lIllIIIIII[26];
        if (lIIlIlIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIllIIIIII[26], lIllIIIIII[12], lIllIIIIII[200]));
        "".length();
        iArr2 = new int[lIllIIIIII[1]];
        iArr2[lIllIIIIII[0]] = lIllIIIIII[201];
        if (lIIlIlIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIllIIIIII[1]];
        iArr3[lIllIIIIII[0]] = lIllIIIIII[20];
        if (lIIlIlIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean al() {
        if (lIIlIlIlIIlll(Skills.getBoostedLevel(Skill.AGILITY), lIllIIIIII[38])) {
            int[] iArr = new int[lIllIIIIII[1]];
            iArr[lIllIIIIII[0]] = lIllIIIIII[13];
            if (lIIlIlIlIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIIIII[1]];
                iArr2[lIllIIIIII[0]] = lIllIIIIII[26];
                if (lIIlIlIlIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllIIIIII[1]];
                    iArr3[lIllIIIIII[0]] = lIllIIIIII[24];
                    if (lIIlIlIlIIIIl(Inventory.contains(iArr3) ? 1 : 0) && ((!lIIlIlIlIIIll(Inventory.contains(item -> {
                        return item.getName().contains(lIlIllllll[lIllIIIIII[207]]);
                    }) ? 1 : 0) || lIIlIlIlIIIIl(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIlIllllll[lIllIIIIII[206]]);
                    }) ? 1 : 0)) && (!lIIlIlIlIIIll(Inventory.contains(C0005f.be) ? 1 : 0) || lIIlIlIlIIIIl(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return ("  ".length() & ("  ".length() ^ (-1))) != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return lIllIIIIII[0];
        }
        int[] iArr4 = new int[lIllIIIIII[1]];
        iArr4[lIllIIIIII[0]] = lIllIIIIII[13];
        if (lIIlIlIlIIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIllIIIIII[1]];
            iArr5[lIllIIIIII[0]] = lIllIIIIII[15];
            if (lIIlIlIlIIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIllIIIIII[1]];
                iArr6[lIllIIIIII[0]] = lIllIIIIII[14];
                if (lIIlIlIlIIIIl(Inventory.contains(iArr6) ? 1 : 0) && ((!lIIlIlIlIIIll(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIlIllllll[lIllIIIIII[205]]);
                }) ? 1 : 0) || lIIlIlIlIIIIl(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIlIllllll[lIllIIIIII[204]]);
                }) ? 1 : 0)) && (!lIIlIlIlIIIll(Inventory.contains(C0005f.be) ? 1 : 0) || lIIlIlIlIIIIl(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                    ?? r02 = lIllIIIIII[1];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
        }
        return lIllIIIIII[0];
    }

    private static String lIIlIlIIlllIl(String lllllllllllllllllllIIllIIlIIIlIl, String lllllllllllllllllllIIllIIlIIlIIl) {
        String lllllllllllllllllllIIllIIlIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIllIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllIIllIIlIIIlll = lllllllllllllllllllIIllIIlIIlIIl.toCharArray();
        int lllllllllllllllllllIIllIIlIIIllI = lIllIIIIII[0];
        char[] charArray = lllllllllllllllllllIIllIIlIIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIII[0];
        while (lIIlIlIlIIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllllIIllIIlIIIlll[lllllllllllllllllllIIllIIlIIIllI % lllllllllllllllllllIIllIIlIIIlll.length]));
            "".length();
            lllllllllllllllllllIIllIIlIIIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIlIlIIlll(Skills.getLevel(Skill.AGILITY), lIllIIIIII[2])) {
            ?? r0 = lIllIIIIII[1];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIIII[0];
    }

    private static boolean lIIlIlIlIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIlIlIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIlIlIIIll(int i) {
        return i == 0;
    }

    private static void cP() {
        new WorldArea(lIllIIIIII[46], lIllIIIIII[47], lIllIIIIII[12], lIllIIIIII[21], lIllIIIIII[0]);
        WorldArea worldArea = new WorldArea(lIllIIIIII[46], lIllIIIIII[48], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[46], lIllIIIIII[50], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[51], lIllIIIIII[52], lIllIIIIII[53], lIllIIIIII[54], lIllIIIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[55], lIllIIIIII[56], lIllIIIIII[25], lIllIIIIII[12], lIllIIIIII[3]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[57], lIllIIIIII[58], lIllIIIIII[49], lIllIIIIII[12], lIllIIIIII[0]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[59], lIllIIIIII[60], lIllIIIIII[12], lIllIIIIII[21], lIllIIIIII[0]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[46], lIllIIIIII[47], lIllIIIIII[61], lIllIIIIII[21], lIllIIIIII[0]);
        if (lIIlIlIlIIIll(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[12]];
            C0004e.b(jx);
            Time.sleepTicks(lIllIIIIII[1]);
            "".length();
        }
        if (!(lIIlIlIlIIIll(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIlIlIlIIIIl(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIlIlIlIlIII(Players.getLocal().getAnimation(), lIllIIIIII[62]) && lIIlIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIIlIlIlIIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[49]];
                String[] strArr = new String[lIllIIIIII[1]];
                strArr[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[63]];
                TileObjects.getNearest(strArr).interact(lIlIllllll[lIllIIIIII[64]]);
                Time.sleepTicks(lIllIIIIII[3]);
                "".length();
            }
            if (lIIlIlIlIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[53]];
                String[] strArr2 = new String[lIllIIIIII[1]];
                strArr2[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[39]];
                TileObjects.getNearest(strArr2).interact(lIlIllllll[lIllIIIIII[65]]);
                Time.sleepTicks(lIllIIIIII[3]);
                "".length();
            }
            if (lIIlIlIlIIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[66]];
                String[] strArr3 = new String[lIllIIIIII[1]];
                strArr3[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[54]];
                TileObjects.getNearest(strArr3).interact(lIlIllllll[lIllIIIIII[67]]);
                Time.sleepTicks(lIllIIIIII[3]);
                "".length();
            }
            if (lIIlIlIlIIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[41]];
                String[] strArr4 = new String[lIllIIIIII[1]];
                strArr4[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[68]];
                TileObjects.getNearest(strArr4).interact(lIlIllllll[lIllIIIIII[61]]);
                Time.sleepTicks(lIllIIIIII[19]);
                "".length();
            }
            if (lIIlIlIlIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[69]];
                String[] strArr5 = new String[lIllIIIIII[1]];
                strArr5[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[70]];
                TileObjects.getNearest(strArr5).interact(lIlIllllll[lIllIIIIII[42]]);
                Time.sleepTicks(lIllIIIIII[17]);
                "".length();
            }
            if (lIIlIlIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[71]];
                String[] strArr6 = new String[lIllIIIIII[1]];
                strArr6[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[72]];
                TileObjects.getNearest(strArr6).interact(lIlIllllll[lIllIIIIII[73]]);
                Time.sleepTicks(lIllIIIIII[10]);
                "".length();
            }
            if (lIIlIlIlIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[74]];
                String[] strArr7 = new String[lIllIIIIII[1]];
                strArr7[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[2]];
                TileObjects.getNearest(strArr7).interact(lIlIllllll[lIllIIIIII[75]]);
                Time.sleepTicks(lIllIIIIII[17]);
                "".length();
            }
        }
    }

    private static String lIIlIlIIllllI(String lllllllllllllllllllIIllIIIlIlIII, String lllllllllllllllllllIIllIIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllllllIIllIIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIllIIIlIIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIIII[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIIII[3], lllllllllllllllllllIIllIIIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIllIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIllIIIlIlIIl) {
            lllllllllllllllllllIIllIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void cO() {
        if (lIIlIlIlIIIIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[0]];
            C0001b.a(bp);
            if (lIIlIlIlIIIlI(bp.size(), lIllIIIIII[1])) {
                System.out.println(lIlIllllll[lIllIIIIII[1]]);
                bn = lIllIIIIII[0];
            }
        }
        if (lIIlIlIlIIIll(bn ? 1 : 0) && lIIlIlIlIIIlI(Skills.getLevel(Skill.AGILITY), lIllIIIIII[2])) {
            if (lIIlIlIlIIIll(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIlIlIIlII(nearest) && lIIlIlIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[3]];
                    if (lIIlIlIlIIIIl(new WorldArea(lIllIIIIII[4], lIllIIIIII[5], lIllIIIIII[6], lIllIIIIII[7], lIllIIIIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIllIIIIII[8], lIllIIIIII[9], lIllIIIIII[0]);
                        if (lIIlIlIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIII[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIllIIIIII[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIIlIlIlIIlII(nearest) && lIIlIlIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[10]];
                    if (lIIlIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIIIII[11]);
                        "".length();
                    }
                    if (lIIlIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIlIlIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIIIII[1]);
                            "".length();
                        }
                        if (lIIlIlIlIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIIIII[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIllIIIIII[12]];
                    iArr[lIllIIIIII[0]] = lIllIIIIII[13];
                    iArr[lIllIIIIII[1]] = lIllIIIIII[14];
                    iArr[lIllIIIIII[3]] = lIllIIIIII[15];
                    iArr[lIllIIIIII[10]] = lIllIIIIII[16];
                    iArr[lIllIIIIII[17]] = lIllIIIIII[18];
                    iArr[lIllIIIIII[19]] = lIllIIIIII[20];
                    iArr[lIllIIIIII[21]] = lIllIIIIII[22];
                    iArr[lIllIIIIII[23]] = lIllIIIIII[24];
                    iArr[lIllIIIIII[25]] = lIllIIIIII[26];
                    iArr[lIllIIIIII[27]] = lIllIIIIII[28];
                    if (lIIlIlIlIIIll(C0004e.b(iArr) ? 1 : 0)) {
                        O();
                        System.out.println(lIlIllllll[lIllIIIIII[17]]);
                        bn = lIllIIIIII[1];
                        return;
                    }
                    int[] iArr2 = new int[lIllIIIIII[12]];
                    iArr2[lIllIIIIII[0]] = lIllIIIIII[13];
                    iArr2[lIllIIIIII[1]] = lIllIIIIII[14];
                    iArr2[lIllIIIIII[3]] = lIllIIIIII[15];
                    iArr2[lIllIIIIII[10]] = lIllIIIIII[16];
                    iArr2[lIllIIIIII[17]] = lIllIIIIII[18];
                    iArr2[lIllIIIIII[19]] = lIllIIIIII[20];
                    iArr2[lIllIIIIII[21]] = lIllIIIIII[22];
                    iArr2[lIllIIIIII[23]] = lIllIIIIII[24];
                    iArr2[lIllIIIIII[25]] = lIllIIIIII[26];
                    iArr2[lIllIIIIII[27]] = lIllIIIIII[28];
                    if (lIIlIlIlIIIIl(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIllIIIIII[29], lIllIIIIII[1]);
                        C0000a.a(lIllIIIIII[30], lIllIIIIII[1]);
                        C0000a.a(lIllIIIIII[31], lIllIIIIII[1]);
                        C0000a.a(lIllIIIIII[32], lIllIIIIII[1]);
                        C0000a.a(lIllIIIIII[33], lIllIIIIII[1]);
                        C0000a.a(lIllIIIIII[34], lIllIIIIII[1]);
                        C0000a.a(lIllIIIIII[35], lIllIIIIII[1]);
                        int[] iArr3 = new int[lIllIIIIII[1]];
                        iArr3[lIllIIIIII[0]] = lIllIIIIII[29];
                        if (lIIlIlIlIIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIllIIIIII[1]];
                            iArr4[lIllIIIIII[0]] = lIllIIIIII[29];
                            if (lIIlIlIlIIIll(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIllIIIIII[1]];
                                iArr5[lIllIIIIII[0]] = lIllIIIIII[29];
                                if (lIIlIlIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIllIIIIII[36], lIllIIIIII[1]);
                                }
                            }
                        }
                        C0000a.a(lIllIIIIII[18], lIllIIIIII[1]);
                        C0004e.l(lIllIIIIII[29]);
                        C0004e.l(lIllIIIIII[30]);
                        C0004e.l(lIllIIIIII[31]);
                        C0004e.l(lIllIIIIII[32]);
                        C0004e.l(lIllIIIIII[33]);
                        Time.sleepTicks(lIllIIIIII[1]);
                        "".length();
                        C0004e.l(lIllIIIIII[35]);
                        C0004e.l(lIllIIIIII[37]);
                        C0004e.l(lIllIIIIII[34]);
                        C0004e.l(lIllIIIIII[36]);
                        C0004e.l(lIllIIIIII[18]);
                        Time.sleepTicks(lIllIIIIII[10]);
                        "".length();
                        if (lIIlIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIllIIIIII[21]);
                            "".length();
                        }
                        if (lIIlIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (lIIlIlIlIIIlI(Skills.getLevel(Skill.AGILITY), lIllIIIIII[38])) {
                                C0000a.a(lIllIIIIII[13], lIllIIIIII[12]);
                                C0000a.a(lIllIIIIII[14], lIllIIIIII[12]);
                                C0000a.a(lIllIIIIII[22], lIllIIIIII[12]);
                                C0000a.a(lIllIIIIII[15], lIllIIIIII[12]);
                                C0000a.b(C0005f.be, lIllIIIIII[1]);
                                C0000a.a(lIllIIIIII[28], lIllIIIIII[1]);
                                C0000a.a(lIllIIIIII[20], lIllIIIIII[19]);
                                C0000a.a(lIllIIIIII[24], lIllIIIIII[39]);
                            }
                            if (lIIlIlIlIIlll(Skills.getLevel(Skill.AGILITY), lIllIIIIII[38])) {
                                C0000a.a(lIllIIIIII[13], lIllIIIIII[12]);
                                C0000a.a(lIllIIIIII[22], lIllIIIIII[12]);
                                C0000a.a(lIllIIIIII[26], lIllIIIIII[12]);
                                C0000a.b(C0005f.be, lIllIIIIII[1]);
                                C0000a.a(lIllIIIIII[28], lIllIIIIII[1]);
                                C0000a.a(lIllIIIIII[20], lIllIIIIII[25]);
                                C0000a.a(lIllIIIIII[24], lIllIIIIII[12]);
                            }
                        }
                    }
                }
            }
            if (lIIlIlIlIIIIl(al() ? 1 : 0)) {
                String[] strArr = new String[lIllIIIIII[1]];
                strArr[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[19]];
                if (lIIlIlIlIIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllIIIIII[1]];
                    strArr2[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[21]];
                    Inventory.getFirst(strArr2).interact(lIlIllllll[lIllIIIIII[23]]);
                }
                if (lIIlIlIlIIIIl(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIlIlIIIlI(Movement.getRunEnergy(), lIllIIIIII[40])) {
                    Inventory.getFirst(C0005f.aU).interact(lIlIllllll[lIllIIIIII[25]]);
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIlIl(Combat.getMissingHealth(), lIllIIIIII[41])) {
                    int[] iArr6 = new int[lIllIIIIII[1]];
                    iArr6[lIllIIIIII[0]] = lIllIIIIII[24];
                    if (lIIlIlIlIIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIllIIIIII[1]];
                        iArr7[lIllIIIIII[0]] = lIllIIIIII[24];
                        Inventory.getFirst(iArr7).interact(lIlIllllll[lIllIIIIII[27]]);
                        Time.sleepTicks(lIllIIIIII[3]);
                        "".length();
                    }
                }
                if (lIIlIlIlIIlIl(Movement.getRunEnergy(), lIllIIIIII[42]) && lIIlIlIlIIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIIlIlIlIIIlI(Skills.getLevel(Skill.AGILITY), lIllIIIIII[2])) {
                    cP();
                }
                if ((!lIIlIlIlIIlll(C0004e.j(lIllIIIIII[43]), lIllIIIIII[44]) || lIIlIlIlIIIlI(C0004e.j(lIllIIIIII[45]), lIllIIIIII[19])) && lIIlIlIlIIlll(Skills.getLevel(Skill.AGILITY), lIllIIIIII[2]) && lIIlIlIlIIIlI(Skills.getLevel(Skill.AGILITY), lIllIIIIII[44])) {
                    cQ();
                }
                if (lIIlIlIlIIlll(C0004e.j(lIllIIIIII[43]), lIllIIIIII[44]) && lIIlIlIlIIlll(C0004e.j(lIllIIIIII[45]), lIllIIIIII[19])) {
                    if (lIIlIlIlIIlll(Skills.getLevel(Skill.AGILITY), lIllIIIIII[2]) && lIIlIlIlIIIlI(Skills.getLevel(Skill.AGILITY), lIllIIIIII[38])) {
                        cQ();
                    }
                    if (lIIlIlIlIIlll(Skills.getLevel(Skill.AGILITY), lIllIIIIII[38]) && lIIlIlIlIIIlI(Skills.getLevel(Skill.AGILITY), lIllIIIIII[44])) {
                        cR();
                    }
                }
                if (lIIlIlIlIIlll(Skills.getLevel(Skill.AGILITY), lIllIIIIII[44])) {
                    cS();
                }
            }
        }
    }

    private static boolean lIIlIlIlIIllI(int i) {
        return i > 0;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            cO();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (111 ^ 40) & ((29 ^ 90) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIIIIII[186];
    }

    private static boolean lIIlIlIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIlIIIlI(int i, int i2) {
        return i < i2;
    }

    private static void cS() {
        WorldArea worldArea = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[10]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[164], lIllIIIIII[133], lIllIIIIII[64], lIllIIIIII[12], lIllIIIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[165], lIllIIIIII[139], lIllIIIIII[39], lIllIIIIII[53], lIllIIIIII[3]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[166], lIllIIIIII[134], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[167], lIllIIIIII[136], lIllIIIIII[70], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[168], lIllIIIIII[169], lIllIIIIII[54], lIllIIIIII[63], lIllIIIIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIllIIIIII[170], lIllIIIIII[171], lIllIIIIII[0]);
        if (lIIlIlIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIlIlIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIllIIIIII[1]);
            "".length();
        }
        if (lIIlIlIlIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIlIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIllIIIIII[1]);
                "".length();
            }
            if (lIIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIllIIIIII[1]];
                strArr[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[175]];
                TileObjects.getNearest(strArr).interact(lIlIllllll[lIllIIIIII[36]]);
                Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return (-((((9 + 142) - 73) + 65) ^ (((36 + 24) - 4) + 83))) >= 0 ? ("  ".length() ^ (53 ^ 47)) & (((((26 + 54) - 30) + 97) ^ (((43 + 56) - 71) + 111)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIIIII[0];
                }, lIllIIIIII[104]);
                "".length();
                Time.sleepTicks(lIllIIIIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIllIIIIII[1]];
        strArr2[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIlIlIlIIlII(nearest) && lIIlIlIlIIIIl(cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[177]];
            System.out.println(lIlIllllll[lIllIIIIII[178]]);
            nearest.interact(lIlIllllll[lIllIIIIII[179]]);
            Time.sleepTicks(lIllIIIIII[10]);
            "".length();
        }
        if (lIIlIlIlIIIll(cT() ? 1 : 0)) {
            if (lIIlIlIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[218]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[219], lIllIIIIII[220], lIllIIIIII[10])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return (-" ".length()) != (-" ".length()) ? ((((120 + 72) - 113) + 65) ^ (((71 + 167) - 110) + 69)) & (((2 ^ 75) ^ (168 ^ 180)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest2)) {
                    int lllllllllllllllllllIIllIllIIllIl = Skills.getExperience(Skill.AGILITY);
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[180]];
                    nearest2.interact(lIlIllllll[lIllIIIIII[79]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (-" ".length()) >= ((((70 + 190) - 125) + 59) ^ (((102 + 180) - 186) + 102)) ? ((((67 + 190) - 191) + 131) ^ (((136 + 98) - 184) + 145)) & (((92 ^ 57) ^ (165 ^ 198)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIlIlIlIIIIl(tileObject2.getName().contains(lIlIllllll[lIllIIIIII[216]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[217], lIllIIIIII[128], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return " ".length() > (121 ^ 125) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest3)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[181]];
                    int lllllllllllllllllllIIllIllIIllIl2 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIlIllllll[lIllIIIIII[182]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl2)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIlIlIlIIIIl(tileObject3.getName().contains(lIlIllllll[lIllIIIIII[213]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[214], lIllIIIIII[215], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return 0 != 0 ? ((22 ^ 13) ^ (117 ^ 79)) & (((((110 + 118) - 189) + 185) ^ (((68 + 62) - (-24)) + 39)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest4)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[183]];
                    int lllllllllllllllllllIIllIllIIllIl3 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIlIllllll[lIllIIIIII[184]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl3)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return ((114 ^ 97) ^ (2 ^ 21)) <= 0 ? ((113 ^ 117) ^ (84 ^ 108)) & (((97 ^ 80) ^ (175 ^ 162)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIlIlIlIIIIl(tileObject4.getName().contains(lIlIllllll[lIllIIIIII[211]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[209], lIllIIIIII[212], lIllIIIIII[10])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return "   ".length() == 0 ? ((((147 + 182) - 192) + 51) ^ (((24 + 47) - (-90)) + 9)) & (((251 ^ 157) ^ (204 ^ 188)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest5)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[185]];
                    int lllllllllllllllllllIIllIllIIllIl4 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIlIllllll[lIllIIIIII[186]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl4)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (!lIIlIlIlIIIIl(cT() ? 1 : 0) && lIIlIlIlIIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIlIlIlIIIIl(tileObject5.getName().contains(lIlIllllll[lIllIIIIII[208]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[209], lIllIIIIII[210], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest6)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[187]];
                    int lllllllllllllllllllIIllIllIIllIl5 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIlIllllll[lIllIIIIII[188]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl5)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return !((true ^ true) ^ (true ^ true)) ? ((7 ^ 15) ^ (139 ^ 134)) & (((70 ^ 100) ^ (72 ^ 111)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIlIlIlIIlll(int i, int i2) {
        return i >= i2;
    }

    private static void cQ() {
        WorldArea worldArea = new WorldArea(lIllIIIIII[76], lIllIIIIII[77], lIllIIIIII[78], lIllIIIIII[79], lIllIIIIII[1]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[76], lIllIIIIII[77], lIllIIIIII[78], lIllIIIIII[79], lIllIIIIII[3]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[76], lIllIIIIII[77], lIllIIIIII[78], lIllIIIIII[79], lIllIIIIII[10]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[80], lIllIIIIII[81], lIllIIIIII[69], lIllIIIIII[64], lIllIIIIII[0]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[82], lIllIIIIII[81], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[83], lIllIIIIII[84], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[10]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[85], lIllIIIIII[86], lIllIIIIII[27], lIllIIIIII[23], lIllIIIIII[1]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[85], lIllIIIIII[87], lIllIIIIII[12], lIllIIIIII[25], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[88], lIllIIIIII[89], lIllIIIIII[75], lIllIIIIII[41], lIllIIIIII[10]);
        WorldArea worldArea10 = new WorldArea(lIllIIIIII[90], lIllIIIIII[91], lIllIIIIII[66], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea11 = new WorldArea(lIllIIIIII[92], lIllIIIIII[93], lIllIIIIII[23], lIllIIIIII[27], lIllIIIIII[10]);
        WorldArea worldArea12 = new WorldArea(lIllIIIIII[92], lIllIIIIII[94], lIllIIIIII[12], lIllIIIIII[23], lIllIIIIII[10]);
        if (lIIlIlIlIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[95]];
            if (lIIlIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIlIlIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIllIIIIII[96], lIllIIIIII[52], lIllIIIIII[0]));
            "".length();
            Time.sleepTicks(lIllIIIIII[1]);
            "".length();
        }
        if (lIIlIlIlIlIII(Players.getLocal().getAnimation(), lIllIIIIII[62]) && lIIlIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIllIIIIII[1]];
            strArr[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIIlIlIlIIlII(nearest) && lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[98]];
                System.out.println(lIlIllllll[lIllIIIIII[99]]);
                nearest.interact(lIlIllllll[lIllIIIIII[100]]);
                Time.sleepTicks(lIllIIIIII[10]);
                "".length();
            }
            if (lIIlIlIlIIIll(cT() ? 1 : 0)) {
                if (lIIlIlIlIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIllIIIIII[1]];
                    strArr2[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[102]];
                    TileObjects.getNearest(strArr2).interact(lIlIllllll[lIllIIIIII[103]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[38]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIllIIIIII[1]];
                    strArr3[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[105]];
                    TileObjects.getNearest(strArr3).interact(lIlIllllll[lIllIIIIII[106]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? ((238 ^ 129) ^ (153 ^ 197)) & (((14 ^ 51) ^ (202 ^ 196)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIllIIIIII[1]];
                    strArr4[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[108]];
                    TileObjects.getNearest(strArr4).interact(lIlIllllll[lIllIIIIII[109]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (((148 ^ 192) ^ (41 ^ 51)) & (((78 ^ 80) ^ (216 ^ 136)) ^ (-" ".length()))) == "  ".length() ? ((191 ^ 193) ^ (139 ^ 173)) & (((((55 + 89) - 56) + 113) ^ (((56 + 134) - 133) + 88)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIllIIIIII[1]];
                    strArr5[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[111]];
                    TileObjects.getNearest(strArr5).interact(lIlIllllll[lIllIIIIII[112]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIllIIIIII[1]];
                    strArr6[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[40]];
                    TileObjects.getNearest(strArr6).interact(lIlIllllll[lIllIIIIII[7]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIllIIIIII[1]];
                    iArr[lIllIIIIII[0]] = lIllIIIIII[115];
                    TileObjects.getNearest(iArr).interact(lIlIllllll[lIllIIIIII[116]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return "  ".length() <= (-" ".length()) ? ((((29 + 162) - 30) + 17) ^ (((39 + 51) - 59) + 111)) & (("   ".length() ^ (105 ^ 86)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIllIIIIII[1]];
                    iArr2[lIllIIIIII[0]] = lIllIIIIII[118];
                    TileObjects.getNearest(iArr2).interact(lIlIllllll[lIllIIIIII[119]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (-" ".length()) > (-" ".length()) ? ((249 ^ 194) ^ (35 ^ 87)) & (((((113 + 164) - 198) + 124) ^ (((50 + 35) - 67) + 114)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIllIIIIII[1]];
                    iArr3[lIllIIIIII[0]] = lIllIIIIII[121];
                    TileObjects.getNearest(iArr3).interact(lIlIllllll[lIllIIIIII[122]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (((227 ^ 186) ^ (214 ^ 133)) & (((49 ^ 83) ^ (67 ^ 43)) ^ (-" ".length()))) >= ((132 ^ 181) ^ (137 ^ 188)) ? ((101 ^ 23) ^ (3 ^ 117)) & (((97 ^ 6) ^ (161 ^ 194)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
                if (lIIlIlIlIIIIl(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIllIIIIII[1]];
                    strArr7[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[124]];
                    TileObjects.getNearest(strArr7).interact(lIlIllllll[lIllIIIIII[44]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return " ".length() >= ((((71 + 149) - 148) + 81) ^ (((14 + 77) - (-22)) + 44)) ? ((((18 + 91) - 87) + 182) ^ (((8 + 6) - (-90)) + 68)) & (((253 ^ 184) ^ (226 ^ 199)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIllllll[lIllIIIIII[203]];
    }

    private static boolean lIIlIlIlIlIII(int i, int i2) {
        return i == i2;
    }

    private static String lIIlIlIIlllII(String lllllllllllllllllllIIllIIIllIlIl, String lllllllllllllllllllIIllIIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllllllIIllIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIllIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIII[3], lllllllllllllllllllIIllIIIlllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIllIIIllIllI) {
            lllllllllllllllllllIIllIIIllIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    private static boolean cT() {
        WorldArea worldArea = new WorldArea(lIllIIIIII[80], lIllIIIIII[81], lIllIIIIII[69], lIllIIIIII[64], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[82], lIllIIIIII[81], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[83], lIllIIIIII[84], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[10]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[189], lIllIIIIII[190], lIllIIIIII[25], lIllIIIIII[19], lIllIIIIII[1]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[85], lIllIIIIII[87], lIllIIIIII[12], lIllIIIIII[25], lIllIIIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[191], lIllIIIIII[192], lIllIIIIII[73], lIllIIIIII[39], lIllIIIIII[10]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[90], lIllIIIIII[91], lIllIIIIII[66], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[92], lIllIIIIII[93], lIllIIIIII[23], lIllIIIIII[27], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[92], lIllIIIIII[94], lIllIIIIII[12], lIllIIIIII[23], lIllIIIIII[10]);
        WorldArea worldArea10 = new WorldArea(lIllIIIIII[127], lIllIIIIII[128], lIllIIIIII[49], lIllIIIIII[12], lIllIIIIII[3]);
        WorldArea worldArea11 = new WorldArea(lIllIIIIII[129], lIllIIIIII[127], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[3]);
        WorldArea worldArea12 = new WorldArea(lIllIIIIII[130], lIllIIIIII[131], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[3]);
        WorldArea worldArea13 = new WorldArea(lIllIIIIII[132], lIllIIIIII[133], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea14 = new WorldArea(lIllIIIIII[134], lIllIIIIII[9], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea15 = new WorldArea(lIllIIIIII[135], lIllIIIIII[136], lIllIIIIII[68], lIllIIIIII[53], lIllIIIIII[10]);
        WorldArea worldArea16 = new WorldArea(lIllIIIIII[137], lIllIIIIII[138], lIllIIIIII[63], lIllIIIIII[64], lIllIIIIII[3]);
        WorldArea worldArea17 = new WorldArea(lIllIIIIII[164], lIllIIIIII[133], lIllIIIIII[64], lIllIIIIII[12], lIllIIIIII[10]);
        WorldArea worldArea18 = new WorldArea(lIllIIIIII[165], lIllIIIIII[139], lIllIIIIII[39], lIllIIIIII[53], lIllIIIIII[3]);
        WorldArea worldArea19 = new WorldArea(lIllIIIIII[166], lIllIIIIII[134], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea20 = new WorldArea(lIllIIIIII[167], lIllIIIIII[136], lIllIIIIII[70], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea21 = new WorldArea(lIllIIIIII[168], lIllIIIIII[169], lIllIIIIII[54], lIllIIIIII[63], lIllIIIIII[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIllIIIIII[68]];
        worldAreaArr[lIllIIIIII[0]] = worldArea;
        worldAreaArr[lIllIIIIII[1]] = worldArea2;
        worldAreaArr[lIllIIIIII[3]] = worldArea3;
        worldAreaArr[lIllIIIIII[10]] = worldArea4;
        worldAreaArr[lIllIIIIII[17]] = worldArea5;
        worldAreaArr[lIllIIIIII[19]] = worldArea6;
        worldAreaArr[lIllIIIIII[21]] = worldArea7;
        worldAreaArr[lIllIIIIII[23]] = worldArea8;
        worldAreaArr[lIllIIIIII[25]] = worldArea9;
        worldAreaArr[lIllIIIIII[27]] = worldArea10;
        worldAreaArr[lIllIIIIII[12]] = worldArea11;
        worldAreaArr[lIllIIIIII[49]] = worldArea12;
        worldAreaArr[lIllIIIIII[63]] = worldArea13;
        worldAreaArr[lIllIIIIII[64]] = worldArea14;
        worldAreaArr[lIllIIIIII[53]] = worldArea15;
        worldAreaArr[lIllIIIIII[39]] = worldArea16;
        worldAreaArr[lIllIIIIII[65]] = worldArea17;
        worldAreaArr[lIllIIIIII[66]] = worldArea18;
        worldAreaArr[lIllIIIIII[54]] = worldArea19;
        worldAreaArr[lIllIIIIII[67]] = worldArea20;
        worldAreaArr[lIllIIIIII[41]] = worldArea21;
        int[] iArr = new int[lIllIIIIII[1]];
        iArr[lIllIIIIII[0]] = lIllIIIIII[193];
        if (lIIlIlIlIIlII(TileItems.getNearest(iArr))) {
            System.out.println(lIlIllllll[lIllIIIIII[194]]);
            int i = lIllIIIIII[0];
            while (lIIlIlIlIIIlI(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[lIllIIIIII[1]];
                iArr2[lIllIIIIII[0]] = lIllIIIIII[193];
                if (lIIlIlIlIIIIl(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIIl(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIllIIIIII[1];
                }
                i++;
                "".length();
                if (((247 ^ 183) ^ (239 ^ 170)) <= 0) {
                    return ((127 ^ 28) ^ (63 ^ 6)) & (((((32 + 84) - 61) + 183) ^ (((120 + 101) - 210) + 169)) ^ (-" ".length()));
                }
            }
        }
        return lIllIIIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIIIIII[0];
    }

    static {
        lIIlIlIlIIIII();
        lIIlIlIIlllll();
        bp = new ArrayList();
        jr = lIllIIIIII[28];
        js = lIllIIIIII[24];
        ju = new WorldArea(lIllIIIIII[235], lIllIIIIII[52], lIllIIIIII[69], lIllIIIIII[72], lIllIIIIII[0]);
        jv = new WorldArea(lIllIIIIII[235], lIllIIIIII[52], lIllIIIIII[69], lIllIIIIII[72], lIllIIIIII[1]);
        jw = new WorldArea(lIllIIIIII[235], lIllIIIIII[52], lIllIIIIII[69], lIllIIIIII[72], lIllIIIIII[3]);
        jx = new WorldPoint(lIllIIIIII[236], lIllIIIIII[237], lIllIIIIII[0]);
    }

    private static void lIIlIlIIlllll() {
        lIlIllllll = new String[lIllIIIIII[238]];
        lIlIllllll[lIllIIIIII[0]] = lIIlIlIIlllII("//5eBF7lhjAY82gpWIT15w==", "ZZTLn");
        lIlIllllll[lIllIIIIII[1]] = lIIlIlIIlllIl("FDADLBw6PAllDScgBCsIcjAZIAIhdU02GDstDi0GPD5NJw4xMk0xAHI4CiwDOy0U", "RYmEo");
        lIlIllllll[lIllIIIIII[3]] = lIIlIlIIlllIl("FwI6LR84FyUqH3kXI2QaOA0n", "YcLDx");
        lIlIllllll[lIllIIIIII[10]] = lIIlIlIIllllI("YkCFT6NH05qYdzdKHPPdAbvqdIPn6E8A", "RlEPR");
        lIlIllllll[lIllIIIIII[17]] = lIIlIlIIllllI("79vQpFAoMJgkeOd72cZ4z2fsdEUY2zUAQ3UKoBJe8R79riFXEtXwHy4boOmKdEHGG3iO7tc25JQ=", "FmNMo");
        lIlIllllll[lIllIIIIII[19]] = lIIlIlIIlllII("nmctKpTWK2M=", "GSNEM");
        lIlIllllll[lIllIIIIII[21]] = lIIlIlIIlllIl("BBAMJQ==", "RymIu");
        lIlIllllll[lIllIIIIII[23]] = lIIlIlIIllllI("/S0pHgR3p0Y=", "AYzoj");
        lIlIllllll[lIllIIIIII[25]] = lIIlIlIIlllII("yH5gtLLYBTc=", "gFnmz");
        lIlIllllll[lIllIIIIII[27]] = lIIlIlIIlllIl("PSkQ", "xHdlW");
        lIlIllllll[lIllIIIIII[12]] = lIIlIlIIllllI("/W9J4kmiZoLplDBBhsqlVAEFKtmqhUNr", "bvaCR");
        lIlIllllll[lIllIIIIII[49]] = lIIlIlIIlllII("5rGJ/Ub3yy5DW+Kpp8qxtg==", "eMJXd");
        lIlIllllll[lIllIIIIII[63]] = lIIlIlIIlllIl("Nj8zYxQbPDUtFR8=", "zPTCv");
        lIlIllllll[lIllIIIIII[64]] = lIIlIlIIllllI("qY9H0O6/NBBMLknYF0pewA==", "Rwnxa");
        lIlIllllll[lIllIIIIII[53]] = lIIlIlIIlllIl("ICEoFzEKIyZaPQY5", "cMAzS");
        lIlIllllll[lIllIIIIII[39]] = lIIlIlIIlllII("jPK6KL2CcFnov0xPSspzlQ==", "evfxO");
        lIlIllllll[lIllIIIIII[65]] = lIIlIlIIlllIl("NBggIAVaGz8oFQ==", "wtIMg");
        lIlIllllll[lIllIIIIII[66]] = lIIlIlIIllllI("jqYcsKzDa/Baey/hDHcARg==", "yCPua");
        lIlIllllll[lIllIIIIII[54]] = lIIlIlIIllllI("HebwLxTwXaUGMKOdT2O79g==", "SXHnn");
        lIlIllllll[lIllIIIIII[67]] = lIIlIlIIlllIl("FCkMLyY=", "WEeBD");
        lIlIllllll[lIllIIIIII[41]] = lIIlIlIIllllI("t8VRBqmgssOU8zc9x0yqxQ==", "mPjNC");
        lIlIllllll[lIllIIIIII[68]] = lIIlIlIIlllIl("BCYqADolLigGdDQoNgQ=", "FGFaT");
        lIlIllllll[lIllIIIIII[61]] = lIIlIlIIlllII("ZePWkvVUljI=", "ssEhb");
        lIlIllllll[lIllIIIIII[69]] = lIIlIlIIlllIl("Bg0QGQYsDx5UACoWFw==", "Eaytd");
        lIlIllllll[lIllIIIIII[70]] = lIIlIlIIllllI("rSIpvkkp+sRTzD9WmErWxA==", "QSHcV");
        lIlIllllll[lIllIIIIII[42]] = lIIlIlIIlllIl("AhUoCTpsHS4TNg==", "AyAdX");
        lIlIllllll[lIllIIIIII[71]] = lIIlIlIIllllI("kSgKSVSg/+wEkJwBf+3EVg==", "Cpkna");
        lIlIllllll[lIllIIIIII[72]] = lIIlIlIIlllII("PlqMz4r3GE3i5vviqmPMOQ==", "yBLCj");
        lIlIllllll[lIllIIIIII[73]] = lIIlIlIIlllIl("FRgOCiZ7GxECNg==", "VtggD");
        lIlIllllll[lIllIIIIII[74]] = lIIlIlIIllllI("ooOh+lCsIQCU7mWyd1tJJA==", "PyRGZ");
        lIlIllllll[lIllIIIIII[2]] = lIIlIlIIlllIl("FQ8DIRs5ARV1CjMdFQ==", "ZmpUz");
        lIlIllllll[lIllIIIIII[75]] = lIIlIlIIlllIl("BxciEzIuA3oCPyYJIhE/", "TfWvW");
        lIlIllllll[lIllIIIIII[95]] = lIIlIlIIllllI("iFxP/y3HRCPKhNL3nUTWXw==", "yTOVX");
        lIlIllllll[lIllIIIIII[97]] = lIIlIlIIlllII("y4EsTtIMUkK26LCDnZS3BA==", "gxcUe");
        lIlIllllll[lIllIIIIII[98]] = lIIlIlIIlllII("z/MAwLjEDNZaszOT2zvY8w==", "iDPDN");
        lIlIllllll[lIllIIIIII[99]] = lIIlIlIIlllII("I5OSaPodxSeQPOXGDtnudAMRL1BnY5XT", "ZHGPh");
        lIlIllllll[lIllIIIIII[100]] = lIIlIlIIlllIl("BTMMDA==", "QRgiA");
        lIlIllllll[lIllIIIIII[101]] = lIIlIlIIlllIl("MDo2Hh8KIDBMCAw7JR8O", "cNWlk");
        lIlIllllll[lIllIIIIII[102]] = lIIlIlIIlllIl("CzcHKCJ5LxMjJg==", "YXrOJ");
        lIlIllllll[lIllIIIIII[103]] = lIIlIlIIlllII("CRtClwQFkJg=", "GyzUW");
        lIlIllllll[lIllIIIIII[38]] = lIIlIlIIllllI("vN8P6jpBEXGKnazjkuoMpwpTMB13Erob", "JRTKa");
        lIlIllllll[lIllIIIIII[105]] = lIIlIlIIllllI("sHw0nFCkhBWX0Z2f+RimAA==", "kiOSS");
        lIlIllllll[lIllIIIIII[106]] = lIIlIlIIlllIl("EBkhOiI=", "SkNIQ");
        lIlIllllll[lIllIIIIII[107]] = lIIlIlIIlllII("eB4wQGxUKMs=", "bLTJJ");
        lIlIllllll[lIllIIIIII[108]] = lIIlIlIIllllI("Mrvffg1WAd0=", "Kjnmr");
        lIlIllllll[lIllIIIIII[109]] = lIIlIlIIlllIl("CgkRBQ==", "Flpue");
        lIlIllllll[lIllIIIIII[110]] = lIIlIlIIlllIl("DyQCFhguLAAQ", "MEnwv");
        lIlIllllll[lIllIIIIII[111]] = lIIlIlIIllllI("UEg0ogfXsRc=", "bHAZR");
        lIlIllllll[lIllIIIIII[112]] = lIIlIlIIllllI("NJSIykkt13s=", "RhQFu");
        lIlIllllll[lIllIIIIII[113]] = lIIlIlIIllllI("qIlQFpBwasR7dURzS6hJEg==", "hqhRb");
        lIlIllllll[lIllIIIIII[40]] = lIIlIlIIllllI("3UmKo5Y96KA=", "yPcwG");
        lIlIllllll[lIllIIIIII[7]] = lIIlIlIIlllII("hcPaX3Zwqv0=", "wijJx");
        lIlIllllll[lIllIIIIII[114]] = lIIlIlIIlllII("ASR1jIskKqBNpzIWBPuhfA==", "CpMEl");
        lIlIllllll[lIllIIIIII[116]] = lIIlIlIIlllII("O9iryrQfOe0=", "PVrAl");
        lIlIllllll[lIllIIIIII[117]] = lIIlIlIIlllIl("GwYFHi4/FEgJJiFTWw==", "QshnG");
        lIlIllllll[lIllIIIIII[119]] = lIIlIlIIlllIl("JwMLPQ==", "kfjMz");
        lIlIllllll[lIllIIIIII[120]] = lIIlIlIIlllIl("IDIbDhwNZxsFHw4=", "hGijp");
        lIlIllllll[lIllIIIIII[122]] = lIIlIlIIllllI("aWJxSQECxi4=", "ilpLO");
        lIlIllllll[lIllIIIIII[123]] = lIIlIlIIllllI("hnqMBM3eh8mPPa6cJH5MXPmcNgIu8J51", "qFqUl");
        lIlIllllll[lIllIIIIII[124]] = lIIlIlIIllllI("Js35poZdCDU=", "cNjfX");
        lIlIllllll[lIllIIIIII[44]] = lIIlIlIIlllII("fqIqLZ57jla3z4fHKVh9kA==", "KEwMf");
        lIlIllllll[lIllIIIIII[140]] = lIIlIlIIlllIl("AjAHVh8jcRIXBS03GAVLLz4EBBgp", "LQqvk");
        lIlIllllll[lIllIIIIII[6]] = lIIlIlIIlllIl("DAsbUDctSh4EIjAe", "BjmpC");
        lIlIllllll[lIllIIIIII[141]] = lIIlIlIIlllIl("Jz4lIy4dJCNxORs/NiI/", "tJDQZ");
        lIlIllllll[lIllIIIIII[142]] = lIIlIlIIllllI("Sdgq13AnGGhVehELs1Co5A==", "NtSQK");
        lIlIllllll[lIllIIIIII[143]] = lIIlIlIIllllI("XF2EZOs0Lv4=", "kWRrt");
        lIlIllllll[lIllIIIIII[144]] = lIIlIlIIllllI("REh3f+62jtpKyICiUzMt1g==", "PopJS");
        lIlIllllll[lIllIIIIII[145]] = lIIlIlIIlllIl("PCYoIh0PZy4qAQM=", "hGCKs");
        lIlIllllll[lIllIIIIII[146]] = lIIlIlIIlllII("YKyrCYIDEfOkFDq1BT1RuMPCZL09i4iD", "lYUuD");
        lIlIllllll[lIllIIIIII[147]] = lIIlIlIIlllII("43oadOQmHws=", "PjqMt");
        lIlIllllll[lIllIIIIII[148]] = lIIlIlIIllllI("XakPkoLnAWkSx4OzrXrGeA==", "BlVoc");
        lIlIllllll[lIllIIIIII[149]] = lIIlIlIIlllII("Wcg01rNYUxc=", "nSBwO");
        lIlIllllll[lIllIIIIII[150]] = lIIlIlIIllllI("HYoiB4touHHUNGZiuYfBuQ==", "JMWiJ");
        lIlIllllll[lIllIIIIII[151]] = lIIlIlIIllllI("lmtRnaxBpcQ=", "UZIIM");
        lIlIllllll[lIllIIIIII[152]] = lIIlIlIIllllI("F1zzNO9g8UQ/34ABQUwhKQ==", "MZkrN");
        lIlIllllll[lIllIIIIII[153]] = lIIlIlIIlllIl("ATojCQ==", "KONyK");
        lIlIllllll[lIllIIIIII[154]] = lIIlIlIIlllIl("Gg89ORw+HXAuFCBaZA==", "PzPIu");
        lIlIllllll[lIllIIIIII[155]] = lIIlIlIIlllIl("Cx8YEQ==", "Ajuaj");
        lIlIllllll[lIllIIIIII[156]] = lIIlIlIIlllII("eCKGmw7C25b7tOz3bp2buw==", "qPxJE");
        lIlIllllll[lIllIIIIII[157]] = lIIlIlIIllllI("f6H6acQW/6w=", "VjtxY");
        lIlIllllll[lIllIIIIII[158]] = lIIlIlIIlllIl("OxscFxAfCVEAGAFORA==", "qnqgy");
        lIlIllllll[lIllIIIIII[159]] = lIIlIlIIllllI("cYGgqBIY9eA=", "KVJtG");
        lIlIllllll[lIllIIIIII[160]] = lIIlIlIIlllIl("EAYCKR80FE8+FypTWQ==", "ZsoYv");
        lIlIllllll[lIllIIIIII[161]] = lIIlIlIIlllII("V4iDWtJUqQI=", "aRhlh");
        lIlIllllll[lIllIIIIII[172]] = lIIlIlIIlllII("X01k8W1/VvAXCJXqvdvAC8i5kQu7GPqV", "DnpJv");
        lIlIllllll[lIllIIIIII[173]] = lIIlIlIIlllIl("CwURTAMqRBQYFjcQ", "Edglw");
        lIlIllllll[lIllIIIIII[174]] = lIIlIlIIlllII("GPinJJ/96Um/ReEe29Y7Cw==", "DhXic");
        lIlIllllll[lIllIIIIII[175]] = lIIlIlIIlllIl("FhAeAw==", "Aqrob");
        lIlIllllll[lIllIIIIII[36]] = lIIlIlIIlllIl("JCAzIzBKOSo=", "gLZNR");
        lIlIllllll[lIllIIIIII[176]] = lIIlIlIIlllIl("KBMcIGsKFE4sOQQRCw==", "ernKK");
        lIlIllllll[lIllIIIIII[177]] = lIIlIlIIlllIl("DQ4/BwU+TzkPGTI=", "YoTnk");
        lIlIllllll[lIllIIIIII[178]] = lIIlIlIIllllI("dYaLkrd5M/0YQtsyVG7GBfwZ8HBR8m2+", "bVIRY");
        lIlIllllll[lIllIIIIII[179]] = lIIlIlIIlllIl("LAwSMA==", "xmyUQ");
        lIlIllllll[lIllIIIIII[180]] = lIIlIlIIlllII("AGR+bvlBjdtwfsXibJYimw==", "zympn");
        lIlIllllll[lIllIIIIII[79]] = lIIlIlIIlllII("3QrATI+W2hs=", "kqkjO");
        lIlIllllll[lIllIIIIII[181]] = lIIlIlIIlllII("SZU3UnbCc6reEw6jDy7XYQ==", "SRIis");
        lIlIllllll[lIllIIIIII[182]] = lIIlIlIIlllIl("Jx0XICI=", "doxSQ");
        lIlIllllll[lIllIIIIII[183]] = lIIlIlIIllllI("kRs1b7SDBDfb9xhI5fwWQg==", "MHZxl");
        lIlIllllll[lIllIIIIII[184]] = lIIlIlIIlllIl("IS8ICA==", "kZexH");
        lIlIllllll[lIllIIIIII[185]] = lIIlIlIIlllIl("OTMMHxwdIUEIFANmVQ==", "sFaou");
        lIlIllllll[lIllIIIIII[186]] = lIIlIlIIlllIl("HDE9Hw==", "VDPoF");
        lIlIllllll[lIllIIIIII[187]] = lIIlIlIIllllI("AsBu+2PDP9Whx29gXUmh9Q==", "bfcUm");
        lIlIllllll[lIllIIIIII[188]] = lIIlIlIIllllI("DBPnPMsSzbk=", "BEpaY");
        lIlIllllll[lIllIIIIII[194]] = lIIlIlIIlllIl("HCUDIhN6Jxc+HHolGGwQKCUDIhM=", "ZJvLw");
        lIlIllllll[lIllIIIIII[203]] = lIIlIlIIllllI("mlemHB7aYmc=", "HcabM");
        lIlIllllll[lIllIIIIII[204]] = lIIlIlIIlllII("Hcw0bLbhVZg=", "CpFml");
        lIlIllllll[lIllIIIIII[205]] = lIIlIlIIlllII("q4gHO/7Tk34=", "NDnFZ");
        lIlIllllll[lIllIIIIII[206]] = lIIlIlIIlllII("C1G57xqSek0=", "saame");
        lIlIllllll[lIllIIIIII[207]] = lIIlIlIIlllII("vdtn5KHO1/4=", "CrnPf");
        lIlIllllll[lIllIIIIII[208]] = lIIlIlIIlllIl("MTIrEA==", "tVLui");
        lIlIllllll[lIllIIIIII[211]] = lIIlIlIIlllII("NGW+hA2tpp0=", "bOxhy");
        lIlIllllll[lIllIIIIII[213]] = lIIlIlIIllllI("jUIQJM7zObc=", "CgtgP");
        lIlIllllll[lIllIIIIII[216]] = lIIlIlIIlllII("zNmJRUUo4//FereB2WDUcg==", "eZnjg");
        lIlIllllll[lIllIIIIII[218]] = lIIlIlIIlllIl("Hy8Z", "XNitV");
        lIlIllllll[lIllIIIIII[221]] = lIIlIlIIlllII("1v0lWCfTJQQ=", "SHXdp");
        lIlIllllll[lIllIIIIII[224]] = lIIlIlIIllllI("SfKSNpzWORQ=", "KuhUU");
        lIlIllllll[lIllIIIIII[226]] = lIIlIlIIlllIl("PycfN0EZKQY+GA==", "oHsRl");
        lIlIllllll[lIllIIIIII[227]] = lIIlIlIIlllIl("CwgE", "LitkL");
        lIlIllllll[lIllIIIIII[230]] = lIIlIlIIlllII("NUHHkwFjUiA=", "Jreog");
        lIlIllllll[lIllIIIIII[232]] = lIIlIlIIllllI("C7SxrwKYHgg=", "YDDzn");
        lIlIllllll[lIllIIIIII[233]] = lIIlIlIIllllI("Vd70Iln0DRk=", "HjqGk");
    }

    private static void cR() {
        WorldArea worldArea = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[10]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[127], lIllIIIIII[128], lIllIIIIII[49], lIllIIIIII[12], lIllIIIIII[3]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[129], lIllIIIIII[127], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[3]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[130], lIllIIIIII[131], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[3]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[132], lIllIIIIII[133], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[134], lIllIIIIII[9], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea10 = new WorldArea(lIllIIIIII[135], lIllIIIIII[136], lIllIIIIII[68], lIllIIIIII[53], lIllIIIIII[10]);
        WorldArea worldArea11 = new WorldArea(lIllIIIIII[137], lIllIIIIII[138], lIllIIIIII[63], lIllIIIIII[64], lIllIIIIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIllIIIIII[137], lIllIIIIII[139], lIllIIIIII[0]);
        if (lIIlIlIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIlIlIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIlIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIllIIIIII[1]);
            "".length();
        }
        if (lIIlIlIlIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIlIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIllIIIIII[1]);
                "".length();
            }
            if (lIIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIllIIIIII[1]];
                strArr[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[142]];
                TileObjects.getNearest(strArr).interact(lIlIllllll[lIllIIIIII[143]]);
                Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                }, lIllIIIIII[104]);
                "".length();
                Time.sleepTicks(lIllIIIIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIllIIIIII[1]];
        strArr2[lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIlIlIlIIlII(nearest) && lIIlIlIlIIIIl(cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[145]];
            System.out.println(lIlIllllll[lIllIIIIII[146]]);
            nearest.interact(lIlIllllll[lIllIIIIII[147]]);
            Time.sleepTicks(lIllIIIIII[10]);
            "".length();
        }
        if (lIIlIlIlIIIll(cT() ? 1 : 0)) {
            if (lIIlIlIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[233]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[234], lIllIIIIII[131], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[148]];
                    nearest2.interact(lIlIllllll[lIllIIIIII[149]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return "   ".length() < 0 ? ((79 ^ 112) ^ (34 ^ 125)) & (((135 ^ 171) ^ (106 ^ 38)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIlIlIlIIIIl(tileObject2.getName().contains(lIlIllllll[lIllIIIIII[232]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[131], lIllIIIIII[225], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return ((127 ^ 49) & ((121 ^ 55) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest3)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIlIllllll[lIllIIIIII[151]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? ((((132 + 99) - 138) + 127) ^ (((97 + 14) - 79) + 116)) & (((((4 + 138) - 11) + 73) ^ (((112 + 22) - 78) + 76)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIlIlIlIIIIl(tileObject3.getName().contains(lIlIllllll[lIllIIIIII[230]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[139], lIllIIIIII[231], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return " ".length() == 0 ? (" ".length() ^ (199 ^ 159)) & (((31 ^ 82) ^ (181 ^ 161)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest4)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIlIllllll[lIllIIIIII[153]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return ((84 ^ 110) & ((255 ^ 197) ^ (-1))) <= (-" ".length()) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIlIlIlIIIIl(tileObject4.getName().contains(lIlIllllll[lIllIIIIII[227]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[228], lIllIIIIII[229], lIllIIIIII[10])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest5)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIlIllllll[lIllIIIIII[155]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return "   ".length() == (49 ^ 53) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIlIlIlIIIIl(tileObject5.getName().contains(lIlIllllll[lIllIIIIII[226]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[9], lIllIIIIII[130], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest6)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIlIllllll[lIllIIIIII[157]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (lIIlIlIlIIIIl(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIlIlIIIIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIIlIlIlIIIIl(tileObject6.getName().contains(lIlIllllll[lIllIIIIII[224]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[225], lIllIIIIII[215], lIllIIIIII[10])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest7)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIlIllllll[lIllIIIIII[159]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (((((60 + 24) - (-6)) + 55) ^ (((168 + 85) - 242) + 161)) & (((24 ^ 109) ^ (65 ^ 9)) ^ (-" ".length()))) != 0 ? ((((88 + 2) - (-122)) + 0) ^ (((42 + 115) - (-4)) + 20)) & (((24 ^ 43) ^ (118 ^ 36)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
            if (!lIIlIlIlIIIIl(cT() ? 1 : 0) && lIIlIlIlIIIIl(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIIlIlIlIIIIl(tileObject7.getName().contains(lIlIllllll[lIllIIIIII[221]]) ? 1 : 0) && lIIlIlIlIlIIl(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[222], lIllIIIIII[223], lIllIIIIII[3])), lIllIIIIII[3])) {
                        ?? r0 = lIllIIIIII[1];
                        "".length();
                        return (((70 ^ 42) ^ (60 ^ 18)) & (((216 ^ 152) ^ "  ".length()) ^ (-" ".length()))) > "   ".length() ? (" ".length() ^ (147 ^ 171)) & (((((118 + 65) - 74) + 46) ^ (((151 + 23) - 78) + 66)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIIIII[0];
                });
                if (lIIlIlIlIIlII(nearest8)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIlIllllll[lIllIIIIII[161]]);
                    Time.sleepTicks(C0004e.c(lIllIIIIII[1], lIllIIIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIlIlIIlIl(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIllIIIIII[1];
                            "".length();
                            return (((28 ^ 82) ^ (219 ^ 132)) & (((4 ^ 104) ^ (76 ^ 49)) ^ (-" ".length()))) != 0 ? ((91 ^ 93) ^ (56 ^ 20)) & (((((84 + 50) - 114) + 114) ^ (((31 + 45) - 65) + 161)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIII[0];
                    }, lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks(lIllIIIIII[1]);
                    "".length();
                }
            }
        }
    }
}
