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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ae  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ae.class */
public class C0005ae implements InterfaceC0003ac {
    private static /* synthetic */ int[] llIIlllIll;
    public static /* synthetic */ int mT;
    static /* synthetic */ WorldArea mY;
    private static /* synthetic */ WorldPoint mZ;
    public static /* synthetic */ int mU;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ WorldArea mW;
    private static /* synthetic */ String[] llIIlllIIl;
    static /* synthetic */ WorldArea mX;
    public static /* synthetic */ int mV;
    public static /* synthetic */ boolean bt;

    private static void lIlIlllIIlIIl() {
        llIIlllIll = new int[239];
        llIIlllIll[0] = ((((98 + 123) - 141) + 97) ^ (((21 + 85) - 104) + 132)) & (((105 ^ 117) ^ (110 ^ 69)) ^ (-" ".length()));
        llIIlllIll[1] = " ".length();
        llIIlllIll[2] = 53 ^ 48;
        llIIlllIll[3] = "  ".length();
        llIIlllIll[4] = (-28705) & 32167;
        llIIlllIll[5] = (-8201) & 11661;
        llIIlllIll[6] = (207 ^ 131) ^ (181 ^ 199);
        llIIlllIll[7] = 48 ^ 3;
        llIIlllIll[8] = (-((-16437) & 25206)) & (-4099) & 16379;
        llIIlllIll[9] = (-24583) & 28062;
        llIIlllIll[10] = "   ".length();
        llIIlllIll[11] = (-((-28891) & 29951)) & (-26643) & 32702;
        llIIlllIll[12] = (((39 + 111) - 5) + 29) ^ (((91 + 148) - 81) + 6);
        llIIlllIll[13] = (-(18 ^ 11)) & (-24705) & 32735;
        llIIlllIll[14] = (-8357) & 16364;
        llIIlllIll[15] = (-8215) & 16223;
        llIIlllIll[16] = (-28915) & 32767;
        llIIlllIll[17] = (((68 + 113) - 56) + 32) ^ (((60 + 28) - 36) + 101);
        llIIlllIll[18] = (-((-9391) & 30127)) & (-36) & 32751;
        llIIlllIll[19] = (-((-4437) & 24533)) & (-5) & 32725;
        llIIlllIll[20] = (((106 + 33) - (-25)) + 35) ^ (((93 + 34) - 17) + 83);
        llIIlllIll[21] = (-((-1161) & 17581)) & (-8337) & 32766;
        llIIlllIll[22] = 177 ^ 182;
        llIIlllIll[23] = (-15373) & 15757;
        llIIlllIll[24] = (((31 + 27) - (-14)) + 82) ^ (((42 + 137) - 158) + 125);
        llIIlllIll[25] = (-((-19595) & 32671)) & (-73) & 32767;
        llIIlllIll[26] = 51 ^ 58;
        llIIlllIll[27] = (-((-7) & 10311)) & (-1026) & 32475;
        llIIlllIll[28] = (-((-19545) & 19833)) & (-20619) & 32766;
        llIIlllIll[29] = (-20516) & 32371;
        llIIlllIll[30] = (-4114) & 15967;
        llIIlllIll[31] = (-((-521) & 21435)) & (-2) & 32767;
        llIIlllIll[32] = (-16526) & 28383;
        llIIlllIll[33] = (-4114) & 15963;
        llIIlllIll[34] = (-((-8193) & 28729)) & (-259) & 32762;
        llIIlllIll[35] = (84 ^ 80) ^ (19 ^ 79);
        llIIlllIll[36] = (-((-773) & 4885)) & (-69) & 24415;
        llIIlllIll[37] = 22 ^ 62;
        llIIlllIll[38] = 141 ^ 130;
        llIIlllIll[39] = (207 ^ 133) ^ (244 ^ 140);
        llIIlllIll[40] = 33 ^ 53;
        llIIlllIll[41] = (32 ^ 21) ^ (144 ^ 188);
        llIIlllIll[42] = 25 ^ 7;
        llIIlllIll[43] = (-((-425) & 4025)) & (-16577) & 20478;
        llIIlllIll[44] = 128 ^ 188;
        llIIlllIll[45] = (-((-1057) & 7201)) & (-193) & 6643;
        llIIlllIll[46] = (-((-8893) & 14079)) & (-8201) & 15855;
        llIIlllIll[47] = (-16401) & 19835;
        llIIlllIll[48] = (-12810) & 16233;
        llIIlllIll[49] = (250 ^ 180) ^ (54 ^ 115);
        llIIlllIll[50] = (-((-10749) & 14845)) & (-8195) & 15711;
        llIIlllIll[51] = (-12297) & 14761;
        llIIlllIll[52] = (-16385) & 19799;
        llIIlllIll[53] = (136 ^ 171) ^ (135 ^ 170);
        llIIlllIll[54] = 17 ^ 3;
        llIIlllIll[55] = (-21069) & 23551;
        llIIlllIll[56] = (-16933) & 20348;
        llIIlllIll[57] = (-((-23121) & 32337)) & (-77) & 11774;
        llIIlllIll[58] = (-((-3293) & 32511)) & (-129) & 32763;
        llIIlllIll[59] = (-16973) & 19453;
        llIIlllIll[60] = (-((-7251) & 16083)) & (-1) & 12259;
        llIIlllIll[61] = (124 ^ 9) ^ (228 ^ 135);
        llIIlllIll[62] = -" ".length();
        llIIlllIll[63] = (69 ^ 74) ^ "   ".length();
        llIIlllIll[64] = (((15 + 32) - (-68)) + 12) ^ (203 ^ 185);
        llIIlllIll[65] = 86 ^ 70;
        llIIlllIll[66] = 182 ^ 167;
        llIIlllIll[67] = 4 ^ 23;
        llIIlllIll[68] = (67 ^ 42) ^ (246 ^ 138);
        llIIlllIll[69] = 170 ^ 189;
        llIIlllIll[70] = 3 ^ 27;
        llIIlllIll[71] = 87 ^ 77;
        llIIlllIll[72] = 135 ^ 156;
        llIIlllIll[73] = 77 ^ 81;
        llIIlllIll[74] = (((66 + 62) - 122) + 166) ^ (((118 + 130) - 238) + 167);
        llIIlllIll[75] = 125 ^ 98;
        llIIlllIll[76] = (-((-3105) & 19617)) & (-33) & 19711;
        llIIlllIll[77] = (-((-3346) & 32731)) & (-1) & 32735;
        llIIlllIll[78] = ((5 + 36) - (-78)) + 18;
        llIIlllIll[79] = 224 ^ 190;
        llIIlllIll[80] = (-((-29195) & 29515)) & (-25125) & 28663;
        llIIlllIll[81] = (-((-8601) & 29599)) & (-41) & 24447;
        llIIlllIll[82] = (-12817) & 16028;
        llIIlllIll[83] = (-4225) & 7422;
        llIIlllIll[84] = (-4105) & 7516;
        llIIlllIll[85] = (-21129) & 24318;
        llIIlllIll[86] = (-29219) & 32631;
        llIIlllIll[87] = (-8737) & 12137;
        llIIlllIll[88] = (-((-2123) & 31711)) & (-1) & 32767;
        llIIlllIll[89] = (-((-13327) & 29903)) & (-8202) & 28159;
        llIIlllIll[90] = (-4399) & 7615;
        llIIlllIll[91] = (-24725) & 28116;
        llIIlllIll[92] = (-2) & 3235;
        llIIlllIll[93] = (-17042) & 20443;
        llIIlllIll[94] = (-((-3941) & 28525)) & (-4097) & 32090;
        llIIlllIll[95] = 82 ^ 114;
        llIIlllIll[96] = (-4097) & 7320;
        llIIlllIll[97] = (((101 + 20) - 20) + 42) ^ (((38 + 57) - 31) + 110);
        llIIlllIll[98] = (41 ^ 83) ^ (0 ^ 88);
        llIIlllIll[99] = 93 ^ 126;
        llIIlllIll[100] = 64 ^ 100;
        llIIlllIll[101] = (194 ^ 141) ^ (223 ^ 181);
        llIIlllIll[102] = 127 ^ 89;
        llIIlllIll[103] = (((42 + 80) - 32) + 44) ^ (((18 + 104) - (-24)) + 15);
        llIIlllIll[104] = (-((-6157) & 7758)) & (-2051) & 12151;
        llIIlllIll[105] = 56 ^ 17;
        llIIlllIll[106] = 160 ^ 138;
        llIIlllIll[107] = (13 ^ 116) ^ (105 ^ 59);
        llIIlllIll[108] = (239 ^ 148) ^ (31 ^ 72);
        llIIlllIll[109] = 44 ^ 1;
        llIIlllIll[110] = 81 ^ 127;
        llIIlllIll[111] = (66 ^ 6) ^ (33 ^ 74);
        llIIlllIll[112] = (((117 + 97) - 90) + 7) ^ (((47 + 147) - 92) + 77);
        llIIlllIll[113] = (69 ^ 118) ^ "  ".length();
        llIIlllIll[114] = 42 ^ 30;
        llIIlllIll[115] = (-9) & 14842;
        llIIlllIll[116] = (187 ^ 177) ^ (54 ^ 9);
        llIIlllIll[117] = 18 ^ 36;
        llIIlllIll[118] = (-5) & 14839;
        llIIlllIll[119] = (88 ^ 8) ^ (200 ^ 175);
        llIIlllIll[120] = (111 ^ 30) ^ (246 ^ 191);
        llIIlllIll[121] = (-((-11689) & 28075)) & (-522) & 31743;
        llIIlllIll[122] = 117 ^ 76;
        llIIlllIll[123] = 48 ^ 10;
        llIIlllIll[124] = 168 ^ 147;
        llIIlllIll[125] = (-((-13535) & 29951)) & (-4113) & 23999;
        llIIlllIll[126] = (-((-9609) & 30174)) & (-8737) & 32767;
        llIIlllIll[127] = (-21010) & 24511;
        llIIlllIll[128] = (-((-4018) & 16383)) & (-16401) & 32255;
        llIIlllIll[129] = (-24593) & 28087;
        llIIlllIll[130] = (-12801) & 16283;
        llIIlllIll[131] = (-4625) & 8121;
        llIIlllIll[132] = (-((-271) & 13182)) & (-1) & 16383;
        llIIlllIll[133] = (-8773) & 12261;
        llIIlllIll[134] = (-24613) & 28087;
        llIIlllIll[135] = (-((-1285) & 26469)) & (-3) & 28671;
        llIIlllIll[136] = (-((-7339) & 16063)) & (-4097) & 16287;
        llIIlllIll[137] = (-28674) & 32179;
        llIIlllIll[138] = (-((-1697) & 30447)) & (-545) & 32767;
        llIIlllIll[139] = (-((-3221) & 16117)) & (-2) & 16383;
        llIIlllIll[140] = 183 ^ 138;
        llIIlllIll[141] = 118 ^ 73;
        llIIlllIll[142] = (((32 + 193) - 162) + 143) ^ (((90 + 110) - 92) + 34);
        llIIlllIll[143] = (251 ^ 130) ^ (182 ^ 142);
        llIIlllIll[144] = (28 ^ 36) ^ (30 ^ 100);
        llIIlllIll[145] = 123 ^ 56;
        llIIlllIll[146] = (198 ^ 160) ^ (26 ^ 56);
        llIIlllIll[147] = (80 ^ 127) ^ (35 ^ 73);
        llIIlllIll[148] = 129 ^ 199;
        llIIlllIll[149] = (((136 + 195) - 254) + 147) ^ (((147 + 48) - 79) + 51);
        llIIlllIll[150] = (97 ^ 67) ^ (11 ^ 97);
        llIIlllIll[151] = (98 ^ 102) ^ (213 ^ 152);
        llIIlllIll[152] = (72 ^ 16) ^ (1 ^ 19);
        llIIlllIll[153] = 68 ^ 15;
        llIIlllIll[154] = (253 ^ 190) ^ (103 ^ 104);
        llIIlllIll[155] = 218 ^ 151;
        llIIlllIll[156] = 123 ^ 53;
        llIIlllIll[157] = 25 ^ 86;
        llIIlllIll[158] = 29 ^ 77;
        llIIlllIll[159] = 49 ^ 96;
        llIIlllIll[160] = 110 ^ 60;
        llIIlllIll[161] = 69 ^ 22;
        llIIlllIll[162] = (-1) & 2687;
        llIIlllIll[163] = (-((-5225) & 21737)) & (-8194) & 28159;
        llIIlllIll[164] = (-25889) & 28607;
        llIIlllIll[165] = (-4179) & 6879;
        llIIlllIll[166] = (-5217) & 7923;
        llIIlllIll[167] = (-((-17033) & 22191)) & (-24657) & 32511;
        llIIlllIll[168] = (-24884) & 27571;
        llIIlllIll[169] = (-4141) & 7597;
        llIIlllIll[170] = (-((-3679) & 24415)) & (-69) & 23533;
        llIIlllIll[171] = (-((-18433) & 31326)) & (-16385) & 32765;
        llIIlllIll[172] = 48 ^ 100;
        llIIlllIll[173] = 200 ^ 157;
        llIIlllIll[174] = (((154 + 141) - 290) + 229) ^ (((77 + 49) - 1) + 63);
        llIIlllIll[175] = 228 ^ 179;
        llIIlllIll[176] = 50 ^ 107;
        llIIlllIll[177] = (((181 + 115) - 166) + 65) ^ (((53 + 33) - 74) + 141);
        llIIlllIll[178] = (79 ^ 57) ^ (134 ^ 171);
        llIIlllIll[179] = (94 ^ 117) ^ (13 ^ 122);
        llIIlllIll[180] = 254 ^ 163;
        llIIlllIll[181] = (((12 + 171) - 73) + 98) ^ (((1 + 123) - (-5)) + 14);
        llIIlllIll[182] = (213 ^ 155) ^ (21 ^ 59);
        llIIlllIll[183] = 252 ^ 157;
        llIIlllIll[184] = (((131 + 119) - 100) + 56) ^ (((130 + 20) - 127) + 149);
        llIIlllIll[185] = (63 ^ 37) ^ (251 ^ 130);
        llIIlllIll[186] = (204 ^ 194) ^ (26 ^ 112);
        llIIlllIll[187] = (95 ^ 30) ^ (21 ^ 49);
        llIIlllIll[188] = (88 ^ 94) ^ (238 ^ 142);
        llIIlllIll[189] = (-24961) & 28151;
        llIIlllIll[190] = (-((-133) & 25261)) & (-4225) & 32766;
        llIIlllIll[191] = (-((-16506) & 20987)) & (-1) & 7663;
        llIIlllIll[192] = (-((-11637) & 32245)) & (-69) & 24063;
        llIIlllIll[193] = (-((-2629) & 3029)) & (-16423) & 28671;
        llIIlllIll[194] = 220 ^ 187;
        llIIlllIll[195] = (-10755) & 16254;
        llIIlllIll[196] = (-((-18181) & 20316)) & (-1537) & 28671;
        llIIlllIll[197] = (-((-523) & 20011)) & (-8218) & 28605;
        llIIlllIll[198] = (-27658) & 28607;
        llIIlllIll[199] = (-24610) & 26559;
        llIIlllIll[200] = (-((-16122) & 16379)) & (-6153) & 15359;
        llIIlllIll[201] = (-20738) & 32715;
        llIIlllIll[202] = (-"  ".length()) & (-129) & 26079;
        llIIlllIll[203] = 51 ^ 91;
        llIIlllIll[204] = 231 ^ 142;
        llIIlllIll[205] = (167 ^ 182) ^ (185 ^ 194);
        llIIlllIll[206] = (15 ^ 59) ^ (95 ^ 0);
        llIIlllIll[207] = (96 ^ 93) ^ (46 ^ 127);
        llIIlllIll[208] = (238 ^ 144) ^ (61 ^ 46);
        llIIlllIll[209] = (-((-2115) & 31075)) & (-1105) & 32767;
        llIIlllIll[210] = (-((-16397) & 29263)) & (-5) & 16335;
        llIIlllIll[211] = (((98 + 33) - 103) + 221) ^ (((109 + 26) - 70) + 86);
        llIIlllIll[212] = (-29217) & 32685;
        llIIlllIll[213] = 238 ^ 129;
        llIIlllIll[214] = (-((-2645) & 23389)) & (-1121) & 24575;
        llIIlllIll[215] = (-8202) & 11677;
        llIIlllIll[216] = 61 ^ 77;
        llIIlllIll[217] = (-329) & 3038;
        llIIlllIll[218] = 34 ^ 83;
        llIIlllIll[219] = (-((-23313) & 24345)) & (-12567) & 16319;
        llIIlllIll[220] = (-((-1477) & 14303)) & (-65) & 16383;
        llIIlllIll[221] = (172 ^ 189) ^ (104 ^ 11);
        llIIlllIll[222] = (-578) & 4087;
        llIIlllIll[223] = (-((-12419) & 13030)) & (-8193) & 12287;
        llIIlllIll[224] = 254 ^ 141;
        llIIlllIll[225] = (-4113) & 7615;
        llIIlllIll[226] = (((106 + 65) - 164) + 172) ^ (((131 + 197) - 256) + 127);
        llIIlllIll[227] = (133 ^ 147) ^ (72 ^ 43);
        llIIlllIll[228] = (-((-2177) & 26857)) & (-1) & 28158;
        llIIlllIll[229] = (-((-3343) & 16159)) & (-4) & 16311;
        llIIlllIll[230] = (118 ^ 69) ^ (72 ^ 13);
        llIIlllIll[231] = (-24581) & 28079;
        llIIlllIll[232] = (((57 + 99) - 116) + 155) ^ (((141 + 167) - 167) + 39);
        llIIlllIll[233] = (((200 + 186) - 231) + 87) ^ (((137 + 126) - 139) + 14);
        llIIlllIll[234] = (-25089) & 28593;
        llIIlllIll[235] = (-5202) & 7669;
        llIIlllIll[236] = (-((-17265) & 25462)) & (-17425) & 28095;
        llIIlllIll[237] = (-4099) & 7535;
        llIIlllIll[238] = (((77 + 64) - 115) + 165) ^ (((133 + 102) - 180) + 143);
    }

    private static void lIlIlllIIIlll() {
        llIIlllIIl = new String[llIIlllIll[238]];
        llIIlllIIl[llIIlllIll[0]] = lIlIlllIIIlII("LRo7AC0ITysdJgIc", "ooBiC");
        llIIlllIIl[llIIlllIll[1]] = lIlIlllIIIlIl("bhQ9S6w7H/o14Hcrp+F9KlPfvYDaEuTZTRd+GqZ4R7pAf3enKOu0MYAWiTs6OJxIe9FOhLg0d9c=", "pJuMC");
        llIIlllIIl[llIIlllIll[3]] = lIlIlllIIIlII("IjQ7LBMNISQrE0whImUWDTsm", "lUMEt");
        llIIlllIIl[llIIlllIll[10]] = lIlIlllIIIlIl("v+KwOF1HUEe/IMxb4arfHAYC4bWZ0HR8", "jXzmD");
        llIIlllIIl[llIIlllIll[17]] = lIlIlllIIIllI("oEraoQt4HkOQfJvnCMZYD08vowtrJYYoRR8cXoGQkoQDDpbPRh4c//UEY714nlqleYuTpmSUVGE=", "sRgFn");
        llIIlllIIl[llIIlllIll[2]] = lIlIlllIIIlII("PgY7HQ==", "hoZqI");
        llIIlllIIl[llIIlllIll[20]] = lIlIlllIIIlII("AgEHIA==", "ThfLS");
        llIIlllIIl[llIIlllIll[22]] = lIlIlllIIIllI("0qBKOudzDhc=", "jgpdi");
        llIIlllIIl[llIIlllIll[24]] = lIlIlllIIIlII("IggfKi8=", "fzvDD");
        llIIlllIIl[llIIlllIll[26]] = lIlIlllIIIlII("CSsB", "LJulK");
        llIIlllIIl[llIIlllIll[12]] = lIlIlllIIIlIl("T8bD6waIfYugUTBmjg9R732lR3mog+Yy", "vKQug");
        llIIlllIIl[llIIlllIll[49]] = lIlIlllIIIllI("HShUWiXHo5VU6LUONyr4ZQ==", "cznHy");
        llIIlllIIl[llIIlllIll[63]] = lIlIlllIIIlIl("2nP2bK1+gEoNfL6oZOmC0A==", "UIFYQ");
        llIIlllIIl[llIIlllIll[64]] = lIlIlllIIIllI("oMPmcbQJPG4+ofbET54yLw==", "hiAro");
        llIIlllIIl[llIIlllIll[53]] = lIlIlllIIIlIl("KrjLeRwyCe9ArWKs7vZ8eA==", "fTFyf");
        llIIlllIIl[llIIlllIll[38]] = lIlIlllIIIllI("WPyUyEhW9oOjUH9ouVGHPA==", "MWqQr");
        llIIlllIIl[llIIlllIll[65]] = lIlIlllIIIlII("FxQNIRp5FxIpCg==", "TxdLx");
        llIIlllIIl[llIIlllIll[66]] = lIlIlllIIIlII("Fis8BiA8KTJLICcmOwgq", "UGUkB");
        llIIlllIIl[llIIlllIll[54]] = lIlIlllIIIlII("BxcKMXExFw46Mjs=", "SeoTQ");
        llIIlllIIl[llIIlllIll[67]] = lIlIlllIIIllI("kAfFJCAXW0k=", "DDSDC");
        llIIlllIIl[llIIlllIll[40]] = lIlIlllIIIllI("77Shhpgigrp6UuAba8n/Mw==", "SLpYF");
        llIIlllIIl[llIIlllIll[68]] = lIlIlllIIIlIl("ZaUOoT23VJtkcjbksZ2gxQ==", "dkjga");
        llIIlllIIl[llIIlllIll[61]] = lIlIlllIIIllI("3ofnXZT5Hw8=", "MpBzG");
        llIIlllIIl[llIIlllIll[69]] = lIlIlllIIIlIl("4+Wf6TuIAJkkO3ky4zY+pg==", "NSsDW");
        llIIlllIIl[llIIlllIll[70]] = lIlIlllIIIllI("KxD4Prtd5pWUpov8a6/zOA==", "ZOQTn");
        llIIlllIIl[llIIlllIll[41]] = lIlIlllIIIlIl("nvWgZw0z9+RdVrZ+t3A86Q==", "FLlCp");
        llIIlllIIl[llIIlllIll[71]] = lIlIlllIIIllI("wAuTAkVjzG7lshgf6HuKbQ==", "vIMaq");
        llIIlllIIl[llIIlllIll[72]] = lIlIlllIIIllI("VKlbKKg3gk8u0bTB+wVHQg==", "vLgyv");
        llIIlllIIl[llIIlllIll[73]] = lIlIlllIIIlIl("K4wK86hkNruWzg4YQpNlHQ==", "Ngcof");
        llIIlllIIl[llIIlllIll[74]] = lIlIlllIIIlIl("GhpNiNN87jcUpt3lrPRBKA==", "mKQmy");
        llIIlllIIl[llIIlllIll[42]] = lIlIlllIIIlIl("eBgGCC9x1TWIVQwGKsbIyQ==", "KyRXG");
        llIIlllIIl[llIIlllIll[75]] = lIlIlllIIIllI("3GA5SDymeOtpCLVgMru/aQ==", "lRzeC");
        llIIlllIIl[llIIlllIll[95]] = lIlIlllIIIllI("RL4Cd1Cr9wu2w0x8YozFCA==", "plSWH");
        llIIlllIIl[llIIlllIll[97]] = lIlIlllIIIlIl("styfzVprlPBsItOBRiEiRg==", "VIYzC");
        llIIlllIIl[llIIlllIll[98]] = lIlIlllIIIlII("LTAHCysecQEDNxI=", "yQlbE");
        llIIlllIIl[llIIlllIll[99]] = lIlIlllIIIlII("Jyc/JgNBJSs6DEEnJGgAEyc/JgM=", "aHJHg");
        llIIlllIIl[llIIlllIll[100]] = lIlIlllIIIlIl("6MLhm4NZ5z0=", "jVZPV");
        llIIlllIIl[llIIlllIll[101]] = lIlIlllIIIlIl("67rbaZz6l/uYsI799//ILg==", "nlnCB");
        llIIlllIIl[llIIlllIll[102]] = lIlIlllIIIllI("P4UnaSupynBp2fc0YndGIw==", "uKBvC");
        llIIlllIIl[llIIlllIll[103]] = lIlIlllIIIlIl("dMcTg6a88Vo=", "NTIpU");
        llIIlllIIl[llIIlllIll[37]] = lIlIlllIIIlII("OgMfPzUQHxdsJRUeBCQjClEcJSgc", "yqpLF");
        llIIlllIIl[llIIlllIll[105]] = lIlIlllIIIlIl("qOAFtxc+ZwFjGH3IVEh6Yw==", "bjQgW");
        llIIlllIIl[llIIlllIll[106]] = lIlIlllIIIlIl("/s4dzHmguYY=", "dtBOM");
        llIIlllIIl[llIIlllIll[107]] = lIlIlllIIIlII("KyMMFTMJIQ==", "gFmeZ");
        llIIlllIIl[llIIlllIll[108]] = lIlIlllIIIlII("BQ0f", "Blodb");
        llIIlllIIl[llIIlllIll[109]] = lIlIlllIIIlII("LwgjMQ==", "cmBAX");
        llIIlllIIl[llIIlllIll[110]] = lIlIlllIIIllI("6c8oz/cmy+8eChxtoYQpKg==", "yrrRg");
        llIIlllIIl[llIIlllIll[111]] = lIlIlllIIIlII("NC4eBA==", "cOrhF");
        llIIlllIIl[llIIlllIll[112]] = lIlIlllIIIllI("SW4O+nHHSN0=", "noubl");
        llIIlllIIl[llIIlllIll[113]] = lIlIlllIIIllI("OgG0+F9EKdqiQiVCyc00hA==", "urCIW");
        llIIlllIIl[llIIlllIll[39]] = lIlIlllIIIllI("G56pwxVORzE=", "hZuoU");
        llIIlllIIl[llIIlllIll[7]] = lIlIlllIIIlII("NDYJAQ==", "xShqZ");
        llIIlllIIl[llIIlllIll[114]] = lIlIlllIIIlIl("8uUCUiDPjXJixnK1T1gdZg==", "bouym");
        llIIlllIIl[llIIlllIll[116]] = lIlIlllIIIlII("JysbHg==", "kNznX");
        llIIlllIIl[llIIlllIll[117]] = lIlIlllIIIlII("AwcbMwMnFVYkCzlSRQ==", "IrvCj");
        llIIlllIIl[llIIlllIll[119]] = lIlIlllIIIllI("2hvwqhaVVMQ=", "fnynQ");
        llIIlllIIl[llIIlllIll[120]] = lIlIlllIIIllI("au40jIVNxd5FOPnoETJKfA==", "zXXdy");
        llIIlllIIl[llIIlllIll[122]] = lIlIlllIIIllI("WwOxd1sTltc=", "YSWiq");
        llIIlllIIl[llIIlllIll[123]] = lIlIlllIIIlIl("fehml6mdlAG/AHdQXibnTfr9GY5gYsyM", "Ixgym");
        llIIlllIIl[llIIlllIll[124]] = lIlIlllIIIlIl("7bWJYpKd0OQ=", "GtyYO");
        llIIlllIIl[llIIlllIll[44]] = lIlIlllIIIllI("NaRAYjoAh60BkZRpIG/ITQ==", "AQGsP");
        llIIlllIIl[llIIlllIll[140]] = lIlIlllIIIllI("nPciuKy8Zffyuhtxw28Dy1rHyVoKinAB", "ogZaT");
        llIIlllIIl[llIIlllIll[6]] = lIlIlllIIIlII("JDIQUxcFcxUHAhgn", "jSfsc");
        llIIlllIIl[llIIlllIll[141]] = lIlIlllIIIlII("CiE1NzUwOzNlIjYgJjYk", "YUTEA");
        llIIlllIIl[llIIlllIll[142]] = lIlIlllIIIllI("zKK5VZFQp40C4AX5/kv9gg==", "sRvFI");
        llIIlllIIl[llIIlllIll[143]] = lIlIlllIIIlII("NDUDITs=", "wYjLY");
        llIIlllIIl[llIIlllIll[144]] = lIlIlllIIIllI("O0jaiyQBA1s4xpvreBmCgQ==", "JmgWm");
        llIIlllIIl[llIIlllIll[145]] = lIlIlllIIIllI("Xd1t/zFBros8XdfN3oeaPA==", "swBLE");
        llIIlllIIl[llIIlllIll[146]] = lIlIlllIIIlIl("di4LxNP7WL1xv3AVYPT9KB7RNlEobLaE", "Ryjcs");
        llIIlllIIl[llIIlllIll[147]] = lIlIlllIIIlIl("L1kC2a4LhXA=", "yWCkt");
        llIIlllIIl[llIIlllIll[148]] = lIlIlllIIIlIl("GUeMeNgyNEWv2QbBmtWSRQ==", "MLApo");
        llIIlllIIl[llIIlllIll[149]] = lIlIlllIIIlIl("fkbp1MIigbY=", "kPCTD");
        llIIlllIIl[llIIlllIll[150]] = lIlIlllIIIlII("PRc/CgYZBXIdDgdCYA==", "wbRzo");
        llIIlllIIl[llIIlllIll[151]] = lIlIlllIIIlII("PjcXKQ==", "tBzYp");
        llIIlllIIl[llIIlllIll[152]] = lIlIlllIIIllI("BC3VAY4gpEA2Gb2Li7x8tQ==", "qdwYj");
        llIIlllIIl[llIIlllIll[153]] = lIlIlllIIIlII("HSI3BA==", "WWZta");
        llIIlllIIl[llIIlllIll[154]] = lIlIlllIIIlII("JjMsNAQCIWEjDBxmdQ==", "lFADm");
        llIIlllIIl[llIIlllIll[155]] = lIlIlllIIIlII("Dhg0IQ==", "DmYQn");
        llIIlllIIl[llIIlllIll[156]] = lIlIlllIIIlIl("1+vwySeOcpH89Cz/qfjByg==", "gVEpj");
        llIIlllIIl[llIIlllIll[157]] = lIlIlllIIIlII("EyQSGjs=", "EEgvO");
        llIIlllIIl[llIIlllIll[158]] = lIlIlllIIIlIl("+Gu5oHsXQOanACMcZT4k6w==", "tpdfQ");
        llIIlllIIl[llIIlllIll[159]] = lIlIlllIIIlII("HjYJGA==", "TCdhz");
        llIIlllIIl[llIIlllIll[160]] = lIlIlllIIIlIl("1QTqmonnDxib0s5INkVb4w==", "nZwxV");
        llIIlllIIl[llIIlllIll[161]] = lIlIlllIIIlIl("Zr/4WMWw22A=", "hahKX");
        llIIlllIIl[llIIlllIll[172]] = lIlIlllIIIllI("YrbmmMx3JyJaQnzc6F5KCkLL63RQnxmr", "gdbRj");
        llIIlllIIl[llIIlllIll[173]] = lIlIlllIIIlII("LyUbVjoOZB4CLxMw", "aDmvN");
        llIIlllIIl[llIIlllIll[174]] = lIlIlllIIIlIl("gNN2bAaXu/CneAMGrVyiiw==", "APBUy");
        llIIlllIIl[llIIlllIll[175]] = lIlIlllIIIlII("EjcHKg==", "EVkFz");
        llIIlllIIl[llIIlllIll[35]] = lIlIlllIIIlII("DS8cFwljNgU=", "NCuzk");
        llIIlllIIl[llIIlllIll[176]] = lIlIlllIIIlII("NxczOlEVEGE2AxsVJA==", "zvAQq");
        llIIlllIIl[llIIlllIll[177]] = lIlIlllIIIlII("BzcaGAA0dhwQHDg=", "SVqqn");
        llIIlllIIl[llIIlllIll[178]] = lIlIlllIIIlII("JBcSLRdCFQYxGEIXCWMUEBcSLRc=", "bxgCs");
        llIIlllIIl[llIIlllIll[179]] = lIlIlllIIIlIl("TeWSccMkYzY=", "xDgka");
        llIIlllIIl[llIIlllIll[180]] = lIlIlllIIIlII("IwM3Iz4HEXo0NhlWaw==", "ivZSW");
        llIIlllIIl[llIIlllIll[79]] = lIlIlllIIIlII("OQQ1AQ==", "sqXqC");
        llIIlllIIl[llIIlllIll[181]] = lIlIlllIIIlII("CBMbGwBLExsYFg==", "kaths");
        llIIlllIIl[llIIlllIll[182]] = lIlIlllIIIllI("VWUM+rPHX1k=", "YEgbf");
        llIIlllIIl[llIIlllIll[183]] = lIlIlllIIIlII("IDcLOxgEJUYsEBpiVQ==", "jBfKq");
        llIIlllIIl[llIIlllIll[184]] = lIlIlllIIIllI("wEXHzN9gQ3o=", "TDnha");
        llIIlllIIl[llIIlllIll[185]] = lIlIlllIIIlIl("lvZc0glRAa6Bw3xQZRH+jQ==", "fjzZJ");
        llIIlllIIl[llIIlllIll[186]] = lIlIlllIIIllI("npWGlaYbMtg=", "axrBh");
        llIIlllIIl[llIIlllIll[187]] = lIlIlllIIIllI("vEyuqPbkK5woDK2VMkjmVg==", "CJoXm");
        llIIlllIIl[llIIlllIll[188]] = lIlIlllIIIllI("QbMG1cChz74=", "fOyXX");
        llIIlllIIl[llIIlllIll[194]] = lIlIlllIIIllI("YJ2Y3PvPGIgozdVjf6dS5GSNcab9D76D", "XaxdA");
        llIIlllIIl[llIIlllIll[203]] = lIlIlllIIIllI("l830+2qOz6Y=", "uoxaw");
        llIIlllIIl[llIIlllIll[204]] = lIlIlllIIIlIl("2SNQMWCzPkY=", "kDNLK");
        llIIlllIIl[llIIlllIll[205]] = lIlIlllIIIlII("PwMEGTEoBw==", "ObwjP");
        llIIlllIIl[llIIlllIll[206]] = lIlIlllIIIlII("Pi01GjIpKQ==", "NLFiS");
        llIIlllIIl[llIIlllIll[207]] = lIlIlllIIIlII("JiwDECcxKA==", "VMpcF");
        llIIlllIIl[llIIlllIll[208]] = lIlIlllIIIlIl("EMwayRK5FSM=", "YPvgZ");
        llIIlllIIl[llIIlllIll[211]] = lIlIlllIIIlIl("8PIfFl+NMEY=", "xBkMx");
        llIIlllIIl[llIIlllIll[213]] = lIlIlllIIIlIl("Jph3oiA9aLI=", "aBHhb");
        llIIlllIIl[llIIlllIll[216]] = lIlIlllIIIlII("ECQyCwA2IiUG", "DMUct");
        llIIlllIIl[llIIlllIll[218]] = lIlIlllIIIllI("cSNemMDCHhA=", "SkIvN");
        llIIlllIIl[llIIlllIll[221]] = lIlIlllIIIllI("1fzqIqp1eEI=", "SpdRt");
        llIIlllIIl[llIIlllIll[224]] = lIlIlllIIIlIl("sMu99/IiD8w=", "zUNBT");
        llIIlllIIl[llIIlllIll[226]] = lIlIlllIIIlII("HQEjI0M7DzoqGg==", "MnOFn");
        llIIlllIIl[llIIlllIll[227]] = lIlIlllIIIllI("/kFxgLL1xgo=", "FXekv");
        llIIlllIIl[llIIlllIll[230]] = lIlIlllIIIllI("+mT3XkZ0j+M=", "THimr");
        llIIlllIIl[llIIlllIll[232]] = lIlIlllIIIllI("7pSUBl2P4fk=", "IpLVI");
        llIIlllIIl[llIIlllIll[233]] = lIlIlllIIIlIl("amFsHW4U8zs=", "wNYSA");
    }

    private static String lIlIlllIIIllI(String llllllllllllllllllIIlIlllIIlllll, String llllllllllllllllllIIlIlllIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIlllIlIIIII) {
            llllllllllllllllllIIlIlllIlIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean eF() {
        WorldArea worldArea = new WorldArea(llIIlllIll[80], llIIlllIll[81], llIIlllIll[69], llIIlllIll[64], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[82], llIIlllIll[81], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[83], llIIlllIll[84], llIIlllIll[63], llIIlllIll[49], llIIlllIll[10]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[189], llIIlllIll[190], llIIlllIll[24], llIIlllIll[2], llIIlllIll[1]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[85], llIIlllIll[87], llIIlllIll[12], llIIlllIll[24], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[191], llIIlllIll[192], llIIlllIll[73], llIIlllIll[38], llIIlllIll[10]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[90], llIIlllIll[91], llIIlllIll[66], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[92], llIIlllIll[93], llIIlllIll[22], llIIlllIll[26], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[92], llIIlllIll[94], llIIlllIll[12], llIIlllIll[22], llIIlllIll[10]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[127], llIIlllIll[128], llIIlllIll[49], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[129], llIIlllIll[127], llIIlllIll[49], llIIlllIll[24], llIIlllIll[3]);
        WorldArea worldArea12 = new WorldArea(llIIlllIll[130], llIIlllIll[131], llIIlllIll[63], llIIlllIll[49], llIIlllIll[3]);
        WorldArea worldArea13 = new WorldArea(llIIlllIll[132], llIIlllIll[133], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea14 = new WorldArea(llIIlllIll[134], llIIlllIll[9], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea15 = new WorldArea(llIIlllIll[135], llIIlllIll[136], llIIlllIll[68], llIIlllIll[53], llIIlllIll[10]);
        WorldArea worldArea16 = new WorldArea(llIIlllIll[137], llIIlllIll[138], llIIlllIll[63], llIIlllIll[64], llIIlllIll[3]);
        WorldArea worldArea17 = new WorldArea(llIIlllIll[164], llIIlllIll[133], llIIlllIll[64], llIIlllIll[12], llIIlllIll[10]);
        WorldArea worldArea18 = new WorldArea(llIIlllIll[165], llIIlllIll[139], llIIlllIll[38], llIIlllIll[53], llIIlllIll[3]);
        WorldArea worldArea19 = new WorldArea(llIIlllIll[166], llIIlllIll[134], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea20 = new WorldArea(llIIlllIll[167], llIIlllIll[136], llIIlllIll[70], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea21 = new WorldArea(llIIlllIll[168], llIIlllIll[169], llIIlllIll[54], llIIlllIll[63], llIIlllIll[3]);
        WorldArea[] worldAreaArr = new WorldArea[llIIlllIll[68]];
        worldAreaArr[llIIlllIll[0]] = worldArea;
        worldAreaArr[llIIlllIll[1]] = worldArea2;
        worldAreaArr[llIIlllIll[3]] = worldArea3;
        worldAreaArr[llIIlllIll[10]] = worldArea4;
        worldAreaArr[llIIlllIll[17]] = worldArea5;
        worldAreaArr[llIIlllIll[2]] = worldArea6;
        worldAreaArr[llIIlllIll[20]] = worldArea7;
        worldAreaArr[llIIlllIll[22]] = worldArea8;
        worldAreaArr[llIIlllIll[24]] = worldArea9;
        worldAreaArr[llIIlllIll[26]] = worldArea10;
        worldAreaArr[llIIlllIll[12]] = worldArea11;
        worldAreaArr[llIIlllIll[49]] = worldArea12;
        worldAreaArr[llIIlllIll[63]] = worldArea13;
        worldAreaArr[llIIlllIll[64]] = worldArea14;
        worldAreaArr[llIIlllIll[53]] = worldArea15;
        worldAreaArr[llIIlllIll[38]] = worldArea16;
        worldAreaArr[llIIlllIll[65]] = worldArea17;
        worldAreaArr[llIIlllIll[66]] = worldArea18;
        worldAreaArr[llIIlllIll[54]] = worldArea19;
        worldAreaArr[llIIlllIll[67]] = worldArea20;
        worldAreaArr[llIIlllIll[40]] = worldArea21;
        int[] iArr = new int[llIIlllIll[1]];
        iArr[llIIlllIll[0]] = llIIlllIll[193];
        if (lIlIlllIIllIl(TileItems.getNearest(iArr))) {
            System.out.println(llIIlllIIl[llIIlllIll[194]]);
            int i = llIIlllIll[0];
            while (lIlIlllIIlIll(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[llIIlllIll[1]];
                iArr2[llIIlllIll[0]] = llIIlllIll[193];
                if (lIlIlllIIlIlI(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIlIlllIIlIlI(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIIlllIll[1];
                }
                i++;
                "".length();
                if ("  ".length() <= " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIIlllIll[0];
    }

    private static void eE() {
        WorldArea worldArea = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[1]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[3]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[10]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[164], llIIlllIll[133], llIIlllIll[64], llIIlllIll[12], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[165], llIIlllIll[139], llIIlllIll[38], llIIlllIll[53], llIIlllIll[3]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[166], llIIlllIll[134], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[167], llIIlllIll[136], llIIlllIll[70], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[168], llIIlllIll[169], llIIlllIll[54], llIIlllIll[63], llIIlllIll[3]);
        WorldPoint worldPoint = new WorldPoint(llIIlllIll[170], llIIlllIll[171], llIIlllIll[0]);
        if (lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIlllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIIlllIll[1]);
            "".length();
        }
        if (lIlIlllIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIIlllIll[1]);
                "".length();
            }
            if (lIlIlllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIIlllIll[1]];
                strArr[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[175]];
                TileObjects.getNearest(strArr).interact(llIIlllIIl[llIIlllIll[35]]);
                Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return (((178 ^ 134) ^ (55 ^ 15)) & (((47 ^ 83) ^ (244 ^ 132)) ^ (-" ".length()))) != 0 ? ((55 ^ 85) ^ (34 ^ 114)) & (((127 ^ 4) ^ (81 ^ 24)) ^ (-" ".length())) : r0;
                    }
                    return llIIlllIll[0];
                }, llIIlllIll[104]);
                "".length();
                Time.sleepTicks(llIIlllIll[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIIlllIll[1]];
        strArr2[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlIlllIIllIl(nearest) && lIlIlllIIlIlI(eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[177]];
            System.out.println(llIIlllIIl[llIIlllIll[178]]);
            nearest.interact(llIIlllIIl[llIIlllIll[179]]);
            Time.sleepTicks(llIIlllIll[10]);
            "".length();
        }
        if (lIlIlllIIllII(eF() ? 1 : 0)) {
            if (lIlIlllIIlIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[218]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[219], llIIlllIll[220], llIIlllIll[10])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return ((98 ^ 66) & ((191 ^ 159) ^ (-1))) > (65 ^ 69) ? true & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest2)) {
                    int llllllllllllllllllIIllIIIIllIlll = Skills.getExperience(Skill.AGILITY);
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[180]];
                    nearest2.interact(llIIlllIIl[llIIlllIll[79]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlIlllIIlIlI(tileObject2.getName().contains(llIIlllIIl[llIIlllIll[216]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[217], llIIlllIll[128], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return (((169 ^ 148) ^ (((111 + 30) - 48) + 34)) & (((20 ^ 1) ^ (30 ^ 73)) ^ (-" ".length()))) != 0 ? ((136 ^ 133) ^ (153 ^ 138)) & (((163 ^ 133) ^ (161 ^ 153)) ^ (-" ".length())) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest3)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[181]];
                    int llllllllllllllllllIIllIIIIllIlll2 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIIlllIIl[llIIlllIll[182]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll2)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return "  ".length() < ((114 ^ 48) & ((19 ^ 81) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlIlllIIlIlI(tileObject3.getName().contains(llIIlllIIl[llIIlllIll[213]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[214], llIIlllIll[215], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return (-(72 ^ 76)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest4)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[183]];
                    int llllllllllllllllllIIllIIIIllIlll3 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIIlllIIl[llIIlllIll[184]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll3)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlIlllIIlIlI(tileObject4.getName().contains(llIIlllIIl[llIIlllIll[211]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[209], llIIlllIll[212], llIIlllIll[10])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return ((165 ^ 128) & ((116 ^ 81) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest5)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[185]];
                    int llllllllllllllllllIIllIIIIllIlll4 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIIlllIIl[llIIlllIll[186]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll4)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (!lIlIlllIIlIlI(eF() ? 1 : 0) && lIlIlllIIlIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlIlllIIlIlI(tileObject5.getName().contains(llIIlllIIl[llIIlllIll[208]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[209], llIIlllIll[210], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return ((238 ^ 151) ^ (3 ^ 126)) <= 0 ? ((((70 + 99) - 93) + 51) ^ (169 ^ 183)) & (((151 ^ 129) ^ (220 ^ 171)) ^ (-" ".length())) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest6)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[187]];
                    int llllllllllllllllllIIllIIIIllIlll5 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIIlllIIl[llIIlllIll[188]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll5)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIlllIIl[llIIlllIll[203]];
    }

    private static boolean lIlIlllIIllII(int i) {
        return i == 0;
    }

    private static boolean lIlIlllIIllIl(Object obj) {
        return obj != null;
    }

    private static void eB() {
        new WorldArea(llIIlllIll[46], llIIlllIll[47], llIIlllIll[12], llIIlllIll[20], llIIlllIll[0]);
        WorldArea worldArea = new WorldArea(llIIlllIll[46], llIIlllIll[48], llIIlllIll[49], llIIlllIll[24], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[46], llIIlllIll[50], llIIlllIll[49], llIIlllIll[24], llIIlllIll[1]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[51], llIIlllIll[52], llIIlllIll[53], llIIlllIll[54], llIIlllIll[3]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[55], llIIlllIll[56], llIIlllIll[24], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[57], llIIlllIll[58], llIIlllIll[49], llIIlllIll[12], llIIlllIll[0]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[59], llIIlllIll[60], llIIlllIll[12], llIIlllIll[20], llIIlllIll[0]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[46], llIIlllIll[47], llIIlllIll[61], llIIlllIll[20], llIIlllIll[0]);
        if (lIlIlllIIllII(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[12]];
            C0018e.b(mZ);
            Time.sleepTicks(llIIlllIll[1]);
            "".length();
        }
        if (!(lIlIlllIIllII(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIlllIIlIlI(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIlllIlIIIl(Players.getLocal().getAnimation(), llIIlllIll[62]) && lIlIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIlIlllIIlIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[49]];
                String[] strArr = new String[llIIlllIll[1]];
                strArr[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[63]];
                TileObjects.getNearest(strArr).interact(llIIlllIIl[llIIlllIll[64]]);
                Time.sleepTicks(llIIlllIll[3]);
                "".length();
            }
            if (lIlIlllIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[53]];
                String[] strArr2 = new String[llIIlllIll[1]];
                strArr2[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[38]];
                TileObjects.getNearest(strArr2).interact(llIIlllIIl[llIIlllIll[65]]);
                Time.sleepTicks(llIIlllIll[3]);
                "".length();
            }
            if (lIlIlllIIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[66]];
                String[] strArr3 = new String[llIIlllIll[1]];
                strArr3[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[54]];
                TileObjects.getNearest(strArr3).interact(llIIlllIIl[llIIlllIll[67]]);
                Time.sleepTicks(llIIlllIll[3]);
                "".length();
            }
            if (lIlIlllIIlIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[40]];
                String[] strArr4 = new String[llIIlllIll[1]];
                strArr4[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[68]];
                TileObjects.getNearest(strArr4).interact(llIIlllIIl[llIIlllIll[61]]);
                Time.sleepTicks(llIIlllIll[2]);
                "".length();
            }
            if (lIlIlllIIlIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[69]];
                String[] strArr5 = new String[llIIlllIll[1]];
                strArr5[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[70]];
                TileObjects.getNearest(strArr5).interact(llIIlllIIl[llIIlllIll[41]]);
                Time.sleepTicks(llIIlllIll[17]);
                "".length();
            }
            if (lIlIlllIIlIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[71]];
                String[] strArr6 = new String[llIIlllIll[1]];
                strArr6[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[72]];
                TileObjects.getNearest(strArr6).interact(llIIlllIIl[llIIlllIll[73]]);
                Time.sleepTicks(llIIlllIll[10]);
                "".length();
            }
            if (lIlIlllIIlIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[74]];
                String[] strArr7 = new String[llIIlllIll[1]];
                strArr7[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[42]];
                TileObjects.getNearest(strArr7).interact(llIIlllIIl[llIIlllIll[75]]);
                Time.sleepTicks(llIIlllIll[17]);
                "".length();
            }
        }
    }

    private static boolean lIlIlllIIlllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void eA() {
        if (lIlIlllIIlIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[0]];
            C0015b.a(bv);
            if (lIlIlllIIlIll(bv.size(), llIIlllIll[1])) {
                System.out.println(llIIlllIIl[llIIlllIll[1]]);
                bt = llIIlllIll[0];
            }
        }
        if (lIlIlllIIllII(bt ? 1 : 0) && lIlIlllIIlIll(Skills.getLevel(Skill.AGILITY), llIIlllIll[2])) {
            if (lIlIlllIIllII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlllIIllIl(nearest) && lIlIlllIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[3]];
                    if (lIlIlllIIlIlI(new WorldArea(llIIlllIll[4], llIIlllIll[5], llIIlllIll[6], llIIlllIll[7], llIIlllIll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llIIlllIll[8], llIIlllIll[9], llIIlllIll[0]);
                        if (lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIlllIll[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llIIlllIll[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIlIlllIIllIl(nearest) && lIlIlllIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[10]];
                    if (lIlIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlllIll[11]);
                        "".length();
                    }
                    if (lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlllIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlllIll[1]);
                            "".length();
                        }
                        if (lIlIlllIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlllIll[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[llIIlllIll[12]];
                    iArr[llIIlllIll[0]] = llIIlllIll[13];
                    iArr[llIIlllIll[1]] = llIIlllIll[14];
                    iArr[llIIlllIll[3]] = llIIlllIll[15];
                    iArr[llIIlllIll[10]] = llIIlllIll[16];
                    iArr[llIIlllIll[17]] = llIIlllIll[18];
                    iArr[llIIlllIll[2]] = llIIlllIll[19];
                    iArr[llIIlllIll[20]] = llIIlllIll[21];
                    iArr[llIIlllIll[22]] = llIIlllIll[23];
                    iArr[llIIlllIll[24]] = llIIlllIll[25];
                    iArr[llIIlllIll[26]] = llIIlllIll[27];
                    if (lIlIlllIIllII(C0018e.c(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(llIIlllIIl[llIIlllIll[17]]);
                        bt = llIIlllIll[1];
                        return;
                    }
                    int[] iArr2 = new int[llIIlllIll[12]];
                    iArr2[llIIlllIll[0]] = llIIlllIll[13];
                    iArr2[llIIlllIll[1]] = llIIlllIll[14];
                    iArr2[llIIlllIll[3]] = llIIlllIll[15];
                    iArr2[llIIlllIll[10]] = llIIlllIll[16];
                    iArr2[llIIlllIll[17]] = llIIlllIll[18];
                    iArr2[llIIlllIll[2]] = llIIlllIll[19];
                    iArr2[llIIlllIll[20]] = llIIlllIll[21];
                    iArr2[llIIlllIll[22]] = llIIlllIll[23];
                    iArr2[llIIlllIll[24]] = llIIlllIll[25];
                    iArr2[llIIlllIll[26]] = llIIlllIll[27];
                    if (lIlIlllIIlIlI(C0018e.c(iArr2) ? 1 : 0)) {
                        C0000a.a(llIIlllIll[28], llIIlllIll[1]);
                        C0000a.a(llIIlllIll[29], llIIlllIll[1]);
                        C0000a.a(llIIlllIll[30], llIIlllIll[1]);
                        C0000a.a(llIIlllIll[31], llIIlllIll[1]);
                        C0000a.a(llIIlllIll[32], llIIlllIll[1]);
                        C0000a.a(llIIlllIll[33], llIIlllIll[1]);
                        C0000a.a(llIIlllIll[34], llIIlllIll[1]);
                        int[] iArr3 = new int[llIIlllIll[1]];
                        iArr3[llIIlllIll[0]] = llIIlllIll[28];
                        if (lIlIlllIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIlllIll[1]];
                            iArr4[llIIlllIll[0]] = llIIlllIll[28];
                            if (lIlIlllIIllII(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llIIlllIll[1]];
                                iArr5[llIIlllIll[0]] = llIIlllIll[28];
                                if (lIlIlllIIllII(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(llIIlllIll[35], llIIlllIll[1]);
                                }
                            }
                        }
                        C0000a.a(llIIlllIll[18], llIIlllIll[1]);
                        C0018e.l(llIIlllIll[28]);
                        C0018e.l(llIIlllIll[29]);
                        C0018e.l(llIIlllIll[30]);
                        C0018e.l(llIIlllIll[31]);
                        C0018e.l(llIIlllIll[32]);
                        Time.sleepTicks(llIIlllIll[1]);
                        "".length();
                        C0018e.l(llIIlllIll[34]);
                        C0018e.l(llIIlllIll[36]);
                        C0018e.l(llIIlllIll[33]);
                        C0018e.l(llIIlllIll[35]);
                        C0018e.l(llIIlllIll[18]);
                        Time.sleepTicks(llIIlllIll[10]);
                        "".length();
                        if (lIlIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIIlllIll[20]);
                            "".length();
                        }
                        if (lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                            if (lIlIlllIIlIll(Skills.getLevel(Skill.AGILITY), llIIlllIll[37])) {
                                C0000a.a(llIIlllIll[13], llIIlllIll[12]);
                                C0000a.a(llIIlllIll[14], llIIlllIll[12]);
                                C0000a.a(llIIlllIll[21], llIIlllIll[12]);
                                C0000a.a(llIIlllIll[15], llIIlllIll[12]);
                                C0000a.b(C0019f.bk, llIIlllIll[1]);
                                C0000a.a(llIIlllIll[27], llIIlllIll[1]);
                                C0000a.a(llIIlllIll[19], llIIlllIll[2]);
                                C0000a.a(llIIlllIll[23], llIIlllIll[38]);
                            }
                            if (lIlIlllIlIIII(Skills.getLevel(Skill.AGILITY), llIIlllIll[37])) {
                                C0000a.a(llIIlllIll[13], llIIlllIll[12]);
                                C0000a.a(llIIlllIll[21], llIIlllIll[12]);
                                C0000a.a(llIIlllIll[25], llIIlllIll[12]);
                                C0000a.b(C0019f.bk, llIIlllIll[1]);
                                C0000a.a(llIIlllIll[27], llIIlllIll[1]);
                                C0000a.a(llIIlllIll[19], llIIlllIll[24]);
                                C0000a.a(llIIlllIll[23], llIIlllIll[12]);
                            }
                        }
                    }
                }
            }
            if (lIlIlllIIlIlI(an() ? 1 : 0)) {
                String[] strArr = new String[llIIlllIll[1]];
                strArr[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[2]];
                if (lIlIlllIIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIlllIll[1]];
                    strArr2[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[20]];
                    Inventory.getFirst(strArr2).interact(llIIlllIIl[llIIlllIll[22]]);
                }
                if (lIlIlllIIlIlI(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIlllIIlIll(Movement.getRunEnergy(), llIIlllIll[39])) {
                    Inventory.getFirst(C0019f.ba).interact(llIIlllIIl[llIIlllIll[24]]);
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlllI(Combat.getMissingHealth(), llIIlllIll[40])) {
                    int[] iArr6 = new int[llIIlllIll[1]];
                    iArr6[llIIlllIll[0]] = llIIlllIll[23];
                    if (lIlIlllIIlIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIlllIll[1]];
                        iArr7[llIIlllIll[0]] = llIIlllIll[23];
                        Inventory.getFirst(iArr7).interact(llIIlllIIl[llIIlllIll[26]]);
                        Time.sleepTicks(llIIlllIll[3]);
                        "".length();
                    }
                }
                if (lIlIlllIIlllI(Movement.getRunEnergy(), llIIlllIll[41]) && lIlIlllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIlIlllIIlIll(Skills.getLevel(Skill.AGILITY), llIIlllIll[42])) {
                    eB();
                }
                if ((!lIlIlllIlIIII(C0018e.j(llIIlllIll[43]), llIIlllIll[44]) || lIlIlllIIlIll(C0018e.j(llIIlllIll[45]), llIIlllIll[2])) && lIlIlllIlIIII(Skills.getLevel(Skill.AGILITY), llIIlllIll[42]) && lIlIlllIIlIll(Skills.getLevel(Skill.AGILITY), llIIlllIll[44])) {
                    eC();
                }
                if (lIlIlllIlIIII(C0018e.j(llIIlllIll[43]), llIIlllIll[44]) && lIlIlllIlIIII(C0018e.j(llIIlllIll[45]), llIIlllIll[2])) {
                    if (lIlIlllIlIIII(Skills.getLevel(Skill.AGILITY), llIIlllIll[42]) && lIlIlllIIlIll(Skills.getLevel(Skill.AGILITY), llIIlllIll[37])) {
                        eC();
                    }
                    if (lIlIlllIlIIII(Skills.getLevel(Skill.AGILITY), llIIlllIll[37]) && lIlIlllIIlIll(Skills.getLevel(Skill.AGILITY), llIIlllIll[44])) {
                        eD();
                    }
                }
                if (lIlIlllIlIIII(Skills.getLevel(Skill.AGILITY), llIIlllIll[44])) {
                    eE();
                }
            }
        }
    }

    private static void eD() {
        WorldArea worldArea = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[1]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[3]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[10]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[127], llIIlllIll[128], llIIlllIll[49], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[129], llIIlllIll[127], llIIlllIll[49], llIIlllIll[24], llIIlllIll[3]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[130], llIIlllIll[131], llIIlllIll[63], llIIlllIll[49], llIIlllIll[3]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[132], llIIlllIll[133], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[134], llIIlllIll[9], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[135], llIIlllIll[136], llIIlllIll[68], llIIlllIll[53], llIIlllIll[10]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[137], llIIlllIll[138], llIIlllIll[63], llIIlllIll[64], llIIlllIll[3]);
        WorldPoint worldPoint = new WorldPoint(llIIlllIll[137], llIIlllIll[139], llIIlllIll[0]);
        if (lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIlllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIIlllIll[1]);
            "".length();
        }
        if (lIlIlllIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIIlllIll[1]);
                "".length();
            }
            if (lIlIlllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIIlllIll[1]];
                strArr[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[142]];
                TileObjects.getNearest(strArr).interact(llIIlllIIl[llIIlllIll[143]]);
                Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                }, llIIlllIll[104]);
                "".length();
                Time.sleepTicks(llIIlllIll[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIIlllIll[1]];
        strArr2[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlIlllIIllIl(nearest) && lIlIlllIIlIlI(eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[145]];
            System.out.println(llIIlllIIl[llIIlllIll[146]]);
            nearest.interact(llIIlllIIl[llIIlllIll[147]]);
            Time.sleepTicks(llIIlllIll[10]);
            "".length();
        }
        if (lIlIlllIIllII(eF() ? 1 : 0)) {
            if (lIlIlllIIlIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[233]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[234], llIIlllIll[131], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return "  ".length() < ((199 ^ 166) & ((24 ^ 121) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[148]];
                    nearest2.interact(llIIlllIIl[llIIlllIll[149]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlIlllIIlIlI(tileObject2.getName().contains(llIIlllIIl[llIIlllIll[232]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[131], llIIlllIll[225], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return ((((44 + 7) - 36) + 129) ^ (((54 + 143) - 171) + 122)) > ((37 ^ 97) ^ (103 ^ 39)) ? ((((42 + 219) - 118) + 77) ^ (((152 + 5) - 118) + 119)) & (((14 ^ 20) ^ (221 ^ 133)) ^ (-" ".length())) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest3)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIIlllIIl[llIIlllIll[151]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (((141 ^ 136) ^ (111 ^ 53)) & (((((64 + 124) - (-4)) + 56) ^ (((97 + 0) - 62) + 132)) ^ (-" ".length()))) <= (-" ".length()) ? ((141 ^ 178) ^ (141 ^ 188)) & (((166 ^ 195) ^ (10 ^ 97)) ^ (-" ".length())) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlIlllIIlIlI(tileObject3.getName().contains(llIIlllIIl[llIIlllIll[230]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[139], llIIlllIll[231], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return "  ".length() > ((217 ^ 162) ^ (((54 + 91) - 96) + 78)) ? ((((19 + 45) - (-45)) + 45) ^ (((107 + 38) - 70) + 121)) & (((((39 + 115) - 14) + 82) ^ (((124 + 33) - 131) + 102)) ^ (-" ".length())) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest4)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIIlllIIl[llIIlllIll[153]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlIlllIIlIlI(tileObject4.getName().contains(llIIlllIIl[llIIlllIll[227]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[228], llIIlllIll[229], llIIlllIll[10])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return " ".length() < (((106 ^ 35) ^ (25 ^ 91)) & (((((133 + 29) - 37) + 81) ^ (((181 + 121) - 108) + 3)) ^ (-" ".length()))) ? ((((59 + 22) - 10) + 69) ^ (((164 + 114) - 199) + 97)) & (((((4 + 44) - (-37)) + 54) ^ (((68 + 139) - 150) + 126)) ^ (-" ".length())) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest5)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIIlllIIl[llIIlllIll[155]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (((((175 + 110) - 81) + 13) ^ (((33 + 85) - (-22)) + 6)) & (((56 ^ 115) ^ ((6 ^ 56) & ((143 ^ 177) ^ (-1)))) ^ (-" ".length()))) > " ".length() ? ((219 ^ 188) ^ (2 ^ 74)) & (((196 ^ 171) ^ (234 ^ 170)) ^ (-" ".length())) & ((((255 ^ 139) ^ (224 ^ 142)) & (((((96 + 16) - 4) + 60) ^ (((68 + 174) - 103) + 39)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlIlllIIlIlI(tileObject5.getName().contains(llIIlllIIl[llIIlllIll[226]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[9], llIIlllIll[130], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest6)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIIlllIIl[llIIlllIll[157]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (lIlIlllIIlIlI(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIlllIIlIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIlIlllIIlIlI(tileObject6.getName().contains(llIIlllIIl[llIIlllIll[224]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject6.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[225], llIIlllIll[215], llIIlllIll[10])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest7)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(llIIlllIIl[llIIlllIll[159]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
            if (!lIlIlllIIlIlI(eF() ? 1 : 0) && lIlIlllIIlIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIlIlllIIlIlI(tileObject7.getName().contains(llIIlllIIl[llIIlllIll[221]]) ? 1 : 0) && lIlIlllIlIIlI(tileObject7.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[222], llIIlllIll[223], llIIlllIll[3])), llIIlllIll[3])) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return (137 ^ 141) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlllIll[0];
                });
                if (lIlIlllIIllIl(nearest8)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(llIIlllIIl[llIIlllIll[161]]);
                    Time.sleepTicks(C0018e.c(llIIlllIll[1], llIIlllIll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (-" ".length()) >= (((((191 + 122) - 135) + 51) ^ (((133 + 108) - 217) + 139)) & (((((36 + 174) - 159) + 181) ^ (((35 + 38) - (-54)) + 47)) ^ (-" ".length()))) ? (((224 ^ 181) & ((200 ^ 157) ^ (-1))) ^ (151 ^ 181)) & (((151 ^ 128) ^ (243 ^ 198)) ^ (-" ".length())) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlllIll[0];
    }

    private static boolean lIlIlllIlIIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean an() {
        if (lIlIlllIlIIII(Skills.getBoostedLevel(Skill.AGILITY), llIIlllIll[37])) {
            int[] iArr = new int[llIIlllIll[1]];
            iArr[llIIlllIll[0]] = llIIlllIll[13];
            if (lIlIlllIIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlllIll[1]];
                iArr2[llIIlllIll[0]] = llIIlllIll[25];
                if (lIlIlllIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIlllIll[1]];
                    iArr3[llIIlllIll[0]] = llIIlllIll[23];
                    if (lIlIlllIIlIlI(Inventory.contains(iArr3) ? 1 : 0) && ((!lIlIlllIIllII(Inventory.contains(item -> {
                        return item.getName().contains(llIIlllIIl[llIIlllIll[207]]);
                    }) ? 1 : 0) || lIlIlllIIlIlI(Equipment.contains(item2 -> {
                        return item2.getName().contains(llIIlllIIl[llIIlllIll[206]]);
                    }) ? 1 : 0)) && (!lIlIlllIIllII(Inventory.contains(C0019f.bk) ? 1 : 0) || lIlIlllIIlIlI(Equipment.contains(C0019f.bk) ? 1 : 0)))) {
                        ?? r0 = llIIlllIll[1];
                        "".length();
                        return 0 != 0 ? ((120 ^ 23) ^ (28 ^ 85)) & (((((120 + 97) - 94) + 5) ^ (((31 + 132) - 99) + 102)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return llIIlllIll[0];
        }
        int[] iArr4 = new int[llIIlllIll[1]];
        iArr4[llIIlllIll[0]] = llIIlllIll[13];
        if (lIlIlllIIlIlI(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[llIIlllIll[1]];
            iArr5[llIIlllIll[0]] = llIIlllIll[15];
            if (lIlIlllIIlIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlllIll[1]];
                iArr6[llIIlllIll[0]] = llIIlllIll[14];
                if (lIlIlllIIlIlI(Inventory.contains(iArr6) ? 1 : 0) && ((!lIlIlllIIllII(Inventory.contains(item3 -> {
                    return item3.getName().contains(llIIlllIIl[llIIlllIll[205]]);
                }) ? 1 : 0) || lIlIlllIIlIlI(Equipment.contains(item4 -> {
                    return item4.getName().contains(llIIlllIIl[llIIlllIll[204]]);
                }) ? 1 : 0)) && (!lIlIlllIIllII(Inventory.contains(C0019f.bk) ? 1 : 0) || lIlIlllIIlIlI(Equipment.contains(C0019f.bk) ? 1 : 0)))) {
                    ?? r02 = llIIlllIll[1];
                    "".length();
                    return 0 != 0 ? ((((19 + 6) - 2) + 105) ^ (((72 + 3) - 52) + 135)) & (((137 ^ 154) ^ (57 ^ 52)) ^ (-" ".length())) : r02;
                }
            }
        }
        return llIIlllIll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0252, code lost:
        if (lIlIlllIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0005ae.llIIlllIll[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02da, code lost:
        if (lIlIlllIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0005ae.llIIlllIll[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[llIIlllIll[1]];
        iArr4[llIIlllIll[0]] = llIIlllIll[16];
        if (lIlIlllIIllII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIlllIll[16], llIIlllIll[1], llIIlllIll[195]));
            "".length();
        }
        int[] iArr5 = new int[llIIlllIll[1]];
        iArr5[llIIlllIll[0]] = llIIlllIll[18];
        if (lIlIlllIIllII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIIlllIll[18], llIIlllIll[3], llIIlllIll[196]));
            "".length();
        }
        int[] iArr6 = new int[llIIlllIll[1]];
        iArr6[llIIlllIll[0]] = llIIlllIll[27];
        if (lIlIlllIIllII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIIlllIll[27], llIIlllIll[3], llIIlllIll[196]));
            "".length();
        }
        int[] iArr7 = new int[llIIlllIll[1]];
        iArr7[llIIlllIll[0]] = llIIlllIll[13];
        if (lIlIlllIIllII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIIlllIll[13], llIIlllIll[12], llIIlllIll[197]));
            "".length();
        }
        int[] iArr8 = new int[llIIlllIll[1]];
        iArr8[llIIlllIll[0]] = llIIlllIll[21];
        if (lIlIlllIIllII(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIIlllIll[21], llIIlllIll[12], llIIlllIll[198]));
            "".length();
        }
        int[] iArr9 = new int[llIIlllIll[1]];
        iArr9[llIIlllIll[0]] = llIIlllIll[15];
        if (lIlIlllIIllII(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIIlllIll[15], llIIlllIll[12], llIIlllIll[198]));
            "".length();
        }
        int[] iArr10 = new int[llIIlllIll[1]];
        iArr10[llIIlllIll[0]] = llIIlllIll[14];
        if (lIlIlllIIllII(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(llIIlllIll[14], llIIlllIll[12], llIIlllIll[198]));
            "".length();
        }
        int[] iArr11 = new int[llIIlllIll[1]];
        iArr11[llIIlllIll[0]] = llIIlllIll[23];
        if (lIlIlllIIlIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[llIIlllIll[1]];
            iArr12[llIIlllIll[0]] = llIIlllIll[23];
            if (lIlIlllIIlIlI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llIIlllIll[1]];
                iArr13[llIIlllIll[0]] = llIIlllIll[23];
            }
            iArr = new int[llIIlllIll[1]];
            iArr[llIIlllIll[0]] = llIIlllIll[25];
            if (lIlIlllIIlIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[llIIlllIll[1]];
                iArr14[llIIlllIll[0]] = llIIlllIll[25];
                if (lIlIlllIIlIlI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIlllIll[1]];
                    iArr15[llIIlllIll[0]] = llIIlllIll[25];
                }
                iArr2 = new int[llIIlllIll[1]];
                iArr2[llIIlllIll[0]] = llIIlllIll[201];
                if (lIlIlllIIllII(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlllIll[201], llIIlllIll[1], llIIlllIll[202]));
                    "".length();
                }
                iArr3 = new int[llIIlllIll[1]];
                iArr3[llIIlllIll[0]] = llIIlllIll[19];
                if (lIlIlllIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlllIll[19], llIIlllIll[40], C0023j.cf));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0017d(llIIlllIll[25], llIIlllIll[12], llIIlllIll[200]));
            "".length();
            iArr2 = new int[llIIlllIll[1]];
            iArr2[llIIlllIll[0]] = llIIlllIll[201];
            if (lIlIlllIIllII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIIlllIll[1]];
            iArr3[llIIlllIll[0]] = llIIlllIll[19];
            if (lIlIlllIIllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(mU, llIIlllIll[44], llIIlllIll[199]));
        "".length();
        iArr = new int[llIIlllIll[1]];
        iArr[llIIlllIll[0]] = llIIlllIll[25];
        if (lIlIlllIIlIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIlllIll[25], llIIlllIll[12], llIIlllIll[200]));
        "".length();
        iArr2 = new int[llIIlllIll[1]];
        iArr2[llIIlllIll[0]] = llIIlllIll[201];
        if (lIlIlllIIllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIlllIll[1]];
        iArr3[llIIlllIll[0]] = llIIlllIll[19];
        if (lIlIlllIIllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static String lIlIlllIIIlIl(String llllllllllllllllllIIlIlllIIlIIlI, String llllllllllllllllllIIlIlllIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), llIIlllIll[24]), "DES");
            Cipher llllllllllllllllllIIlIlllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllllllIIlIlllIIlIlII.init(llIIlllIll[3], secretKeySpec);
            return new String(llllllllllllllllllIIlIlllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIlllIIlIIll) {
            llllllllllllllllllIIlIlllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void eC() {
        WorldArea worldArea = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[1]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[3]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[10]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[80], llIIlllIll[81], llIIlllIll[69], llIIlllIll[64], llIIlllIll[0]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[82], llIIlllIll[81], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[83], llIIlllIll[84], llIIlllIll[63], llIIlllIll[49], llIIlllIll[10]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[85], llIIlllIll[86], llIIlllIll[26], llIIlllIll[22], llIIlllIll[1]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[85], llIIlllIll[87], llIIlllIll[12], llIIlllIll[24], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[88], llIIlllIll[89], llIIlllIll[75], llIIlllIll[40], llIIlllIll[10]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[90], llIIlllIll[91], llIIlllIll[66], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[92], llIIlllIll[93], llIIlllIll[22], llIIlllIll[26], llIIlllIll[10]);
        WorldArea worldArea12 = new WorldArea(llIIlllIll[92], llIIlllIll[94], llIIlllIll[12], llIIlllIll[22], llIIlllIll[10]);
        if (lIlIlllIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[95]];
            if (lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(llIIlllIll[96], llIIlllIll[52], llIIlllIll[0]));
            "".length();
            Time.sleepTicks(llIIlllIll[1]);
            "".length();
        }
        if (lIlIlllIlIIIl(Players.getLocal().getAnimation(), llIIlllIll[62]) && lIlIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[llIIlllIll[1]];
            strArr[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIlIlllIIllIl(nearest) && lIlIlllIIlIlI(eF() ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[98]];
                System.out.println(llIIlllIIl[llIIlllIll[99]]);
                nearest.interact(llIIlllIIl[llIIlllIll[100]]);
                Time.sleepTicks(llIIlllIll[10]);
                "".length();
            }
            if (lIlIlllIIllII(eF() ? 1 : 0)) {
                if (lIlIlllIIlIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[101]];
                    int llllllllllllllllllIIllIIIllIllll = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[llIIlllIll[1]];
                    strArr2[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[102]];
                    TileObjects.getNearest(strArr2).interact(llIIlllIIl[llIIlllIll[103]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[37]];
                    int llllllllllllllllllIIllIIIllIllll2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[llIIlllIll[1]];
                    strArr3[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[105]];
                    TileObjects.getNearest(strArr3).interact(llIIlllIIl[llIIlllIll[106]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll2)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return "   ".length() == 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[107]];
                    int llllllllllllllllllIIllIIIllIllll3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[llIIlllIll[1]];
                    strArr4[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[108]];
                    TileObjects.getNearest(strArr4).interact(llIIlllIIl[llIIlllIll[109]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll3)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return ((112 ^ 27) ^ (7 ^ 104)) < (((54 ^ 127) ^ (148 ^ 198)) & (((62 ^ 11) ^ (166 ^ 136)) ^ (-" ".length()))) ? ((((81 + 81) - (-62)) + 25) ^ (((35 + 146) - 66) + 76)) & (((((77 + 237) - 194) + 129) ^ (((167 + 116) - 129) + 37)) ^ (-" ".length())) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[110]];
                    int llllllllllllllllllIIllIIIllIllll4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[llIIlllIll[1]];
                    strArr5[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[111]];
                    TileObjects.getNearest(strArr5).interact(llIIlllIIl[llIIlllIll[112]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll4)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return ((((174 + 97) - 84) + 3) ^ (((89 + 102) - 83) + 79)) <= 0 ? ((((62 + 121) - 131) + 105) ^ (((187 + 144) - 181) + 41)) & (((((74 + 137) - 53) + 27) ^ (((44 + 22) - (-51)) + 38)) ^ (-" ".length())) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[113]];
                    int llllllllllllllllllIIllIIIllIllll5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[llIIlllIll[1]];
                    strArr6[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[39]];
                    TileObjects.getNearest(strArr6).interact(llIIlllIIl[llIIlllIll[7]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll5)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[114]];
                    int llllllllllllllllllIIllIIIllIllll6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[llIIlllIll[1]];
                    iArr[llIIlllIll[0]] = llIIlllIll[115];
                    TileObjects.getNearest(iArr).interact(llIIlllIIl[llIIlllIll[116]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll6)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[117]];
                    int llllllllllllllllllIIllIIIllIllll7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[llIIlllIll[1]];
                    iArr2[llIIlllIll[0]] = llIIlllIll[118];
                    TileObjects.getNearest(iArr2).interact(llIIlllIIl[llIIlllIll[119]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll7)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? ((((106 + 33) - 10) + 32) ^ (((153 + 24) - 135) + 117)) & (((((71 + 175) - 180) + 122) ^ (((86 + 35) - 32) + 41)) ^ (-" ".length())) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[120]];
                    int llllllllllllllllllIIllIIIllIllll8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[llIIlllIll[1]];
                    iArr3[llIIlllIll[0]] = llIIlllIll[121];
                    TileObjects.getNearest(iArr3).interact(llIIlllIIl[llIIlllIll[122]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll8)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return (-" ".length()) >= ((157 ^ 190) & ((17 ^ 50) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
                if (lIlIlllIIlIlI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIllII(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[123]];
                    int llllllllllllllllllIIllIIIllIllll9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[llIIlllIll[1]];
                    strArr7[llIIlllIll[0]] = llIIlllIIl[llIIlllIll[124]];
                    TileObjects.getNearest(strArr7).interact(llIIlllIIl[llIIlllIll[44]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlllIIlllI(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIllIIIllIllll9)) {
                            ?? r0 = llIIlllIll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlllIll[0];
                    }, llIIlllIll[104]);
                    "".length();
                    Time.sleepTicks(llIIlllIll[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlIlllIlIIII(int i, int i2) {
        return i >= i2;
    }

    static {
        lIlIlllIIlIIl();
        lIlIlllIIIlll();
        bv = new ArrayList();
        mT = llIIlllIll[27];
        mU = llIIlllIll[23];
        mW = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[0]);
        mX = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[1]);
        mY = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[3]);
        mZ = new WorldPoint(llIIlllIll[236], llIIlllIll[237], llIIlllIll[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlllIlIIII(Skills.getLevel(Skill.AGILITY), llIIlllIll[2])) {
            ?? r0 = llIIlllIll[1];
            "".length();
            return "   ".length() <= 0 ? ((((27 + 137) - 99) + 149) ^ (((70 + 66) - 103) + 107)) & (((166 ^ 146) ^ (14 ^ 96)) ^ (-" ".length())) : r0;
        }
        return llIIlllIll[0];
    }

    private static String lIlIlllIIIlII(String llllllllllllllllllIIlIlllIllIlII, String llllllllllllllllllIIlIlllIllIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIlllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIIlIlllIllIIIl = llllllllllllllllllIIlIlllIllIIll.toCharArray();
        int llllllllllllllllllIIlIlllIllIIII = llIIlllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlllIll[0];
        while (lIlIlllIIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllllIIlIlllIllIIIl[llllllllllllllllllIIlIlllIllIIII % llllllllllllllllllIIlIlllIllIIIl.length]));
            "".length();
            llllllllllllllllllIIlIlllIllIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIIllll(int i) {
        return i > 0;
    }

    private static boolean lIlIlllIIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlllIlIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlllIIlIlI(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            eA();
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return ((77 ^ 108) ^ (40 ^ 20)) & (((5 ^ 69) ^ (106 ^ 55)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIlllIll[186];
    }
}
