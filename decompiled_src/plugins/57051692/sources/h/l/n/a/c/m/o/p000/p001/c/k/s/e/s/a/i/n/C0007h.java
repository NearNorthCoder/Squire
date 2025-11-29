package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/h.class */
public class C0007h {
    private static /* synthetic */ int[] lIllIlIIII;
    private static /* synthetic */ int bV;
    private static /* synthetic */ Map<Integer, Integer> bw;
    private static /* synthetic */ Map<Integer, Integer> bt;
    private static /* synthetic */ int bE;
    private static /* synthetic */ int bT;
    private static /* synthetic */ String[] lIllIIllll;
    private static /* synthetic */ Map<Integer, Integer> bz;
    private static /* synthetic */ int bW;
    private static /* synthetic */ int bH;
    private static /* synthetic */ int bR;
    public static /* synthetic */ boolean bo;
    private static /* synthetic */ Map<Integer, Integer> bA;
    private static /* synthetic */ int bD;
    private static /* synthetic */ int bC;
    private static /* synthetic */ int bS;
    private static /* synthetic */ Map<Integer, Integer> bx;
    private static /* synthetic */ int bF;
    private static /* synthetic */ int bU;
    private static /* synthetic */ int bB;
    private static /* synthetic */ int bK;
    private static /* synthetic */ int bP;
    private static /* synthetic */ int bO;
    private static /* synthetic */ int bN;
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ int bL;
    private static /* synthetic */ Map<Integer, Integer> bq;
    private static /* synthetic */ int bM;
    private static /* synthetic */ int bI;
    private static /* synthetic */ Map<Integer, Integer> bv;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ Map<Integer, Integer> bu;
    private static /* synthetic */ Map<Integer, Integer> br;
    private static /* synthetic */ int bQ;
    private static /* synthetic */ int bJ;
    private static /* synthetic */ Map<Integer, Integer> by;
    private static /* synthetic */ Map<Integer, Integer> bs;
    private static /* synthetic */ int bG;

    private static boolean n(int i) {
        if (lIIllIIlIlIll(i, lIllIlIIII[16])) {
            int[] iArr = new int[lIllIlIIII[10]];
            iArr[lIllIlIIII[0]] = bB;
            iArr[lIllIlIIII[1]] = bC;
            iArr[lIllIlIIII[2]] = bD;
            iArr[lIllIlIIII[3]] = bE;
            iArr[lIllIlIIII[4]] = bF;
            iArr[lIllIlIIII[5]] = bG;
            iArr[lIllIlIIII[6]] = bH;
            iArr[lIllIlIIII[7]] = bI;
            iArr[lIllIlIIII[8]] = bJ;
            iArr[lIllIlIIII[9]] = bK;
            return b(iArr);
        }
        int[] iArr2 = new int[lIllIlIIII[11]];
        iArr2[lIllIlIIII[0]] = bB;
        iArr2[lIllIlIIII[1]] = bC;
        iArr2[lIllIlIIII[2]] = bD;
        iArr2[lIllIlIIII[3]] = bE;
        iArr2[lIllIlIIII[4]] = bF;
        iArr2[lIllIlIIII[5]] = bG;
        iArr2[lIllIlIIII[6]] = bH;
        iArr2[lIllIlIIII[7]] = bI;
        iArr2[lIllIlIIII[8]] = bJ;
        iArr2[lIllIlIIII[9]] = bK;
        iArr2[lIllIlIIII[10]] = i;
        return b(iArr2);
    }

    private static void lIIllIIlIIlIl() {
        lIllIlIIII = new int[219];
        lIllIlIIII[0] = (94 ^ 124) & ((9 ^ 43) ^ (-1));
        lIllIlIIII[1] = " ".length();
        lIllIlIIII[2] = "  ".length();
        lIllIlIIII[3] = "   ".length();
        lIllIlIIII[4] = (41 ^ 28) ^ (75 ^ 122);
        lIllIlIIII[5] = (111 ^ 6) ^ (229 ^ 137);
        lIllIlIIII[6] = (186 ^ 154) ^ (120 ^ 94);
        lIllIlIIII[7] = 62 ^ 57;
        lIllIlIIII[8] = 56 ^ 48;
        lIllIlIIII[9] = 181 ^ 188;
        lIllIlIIII[10] = (220 ^ 185) ^ (54 ^ 89);
        lIllIlIIII[11] = 25 ^ 18;
        lIllIlIIII[12] = (((181 + 85) - 152) + 91) ^ (((71 + 31) - 38) + 129);
        lIllIlIIII[13] = (239 ^ 175) ^ (113 ^ 60);
        lIllIlIIII[14] = 89 ^ 87;
        lIllIlIIII[15] = (-((-2989) & 28671)) & (-2081) & 32762;
        lIllIlIIII[16] = (-((-29710) & 30015)) & (-3) & 12287;
        lIllIlIIII[17] = (-20785) & 32766;
        lIllIlIIII[18] = (-((-11909) & 32436)) & (-257) & 32767;
        lIllIlIIII[19] = (((64 + 134) - 132) + 105) ^ (((107 + 111) - 87) + 33);
        lIllIlIIII[20] = 157 ^ 141;
        lIllIlIIII[21] = (((29 + 73) - 64) + 140) ^ (((139 + 94) - 120) + 50);
        lIllIlIIII[22] = (-((-1269) & 17909)) & (-4110) & 32735;
        lIllIlIIII[23] = (-20515) & 32502;
        lIllIlIIII[24] = 0 ^ 18;
        lIllIlIIII[25] = (-575) & 1727;
        lIllIlIIII[26] = (-((-5745) & 13939)) & (-258) & 25951;
        lIllIlIIII[27] = (-((-8815) & 13311)) & (-8708) & 32703;
        lIllIlIIII[28] = (-((-16419) & 27451)) & (-69) & 12255;
        lIllIlIIII[29] = (-((-16661) & 28951)) & (-18969) & 32447;
        lIllIlIIII[30] = (-(((88 + 100) - 8) + 34)) & (-16905) & 32767;
        lIllIlIIII[31] = (-99) & 19438;
        lIllIlIIII[32] = (-((-28217) & 32569)) & (-10833) & 16375;
        lIllIlIIII[33] = (-17105) & 18427;
        lIllIlIIII[34] = (-6971) & 24510;
        lIllIlIIII[35] = (-((-18086) & 26535)) & (-1) & 31679;
        lIllIlIIII[36] = (-((-17557) & 23959)) & (-129) & 7647;
        lIllIlIIII[37] = (-((-2114) & 16239)) & (-1) & 32575;
        lIllIlIIII[38] = (-9489) & 30718;
        lIllIlIIII[39] = (-((-4153) & 29497)) & (-6145) & 32603;
        lIllIlIIII[40] = (-((-17589) & 30391)) & (-2433) & 16335;
        lIllIlIIII[41] = (-((-5315) & 31955)) & (-5) & 27711;
        lIllIlIIII[42] = (-((-933) & 3006)) & (-3) & 24575;
        lIllIlIIII[43] = (-((-955) & 8191)) & (-132) & 32767;
        lIllIlIIII[44] = (-19201) & 20275;
        lIllIlIIII[45] = (-((-16431) & 31471)) & (-16389) & 32509;
        lIllIlIIII[46] = (63 ^ 27) ^ (141 ^ 189);
        lIllIlIIII[47] = (-((-12301) & 28767)) & (-10505) & 28127;
        lIllIlIIII[48] = (-((-5667) & 24359)) & (-8273) & 28157;
        lIllIlIIII[49] = (-((-11815) & 32503)) & (-10243) & 32255;
        lIllIlIIII[50] = (-((-2591) & 23231)) & (-1) & 21759;
        lIllIlIIII[51] = (-131) & 1199;
        lIllIlIIII[52] = 46 ^ 48;
        lIllIlIIII[53] = (-12817) & 13975;
        lIllIlIIII[54] = (-8206) & 28383;
        lIllIlIIII[55] = (-((-5670) & 30375)) & (-3) & 62207;
        lIllIlIIII[56] = (-15364) & 64863;
        lIllIlIIII[57] = (-12561) & 13757;
        lIllIlIIII[58] = (-((-817) & 21373)) & (-8195) & 30079;
        lIllIlIIII[59] = (-((-9745) & 32287)) & (-257) & 23919;
        lIllIlIIII[60] = (-1) & 12287;
        lIllIlIIII[61] = (-18822) & 57271;
        lIllIlIIII[62] = (-16609) & 57838;
        lIllIlIIII[63] = (-((-1295) & 27935)) & (-4673) & 32383;
        lIllIlIIII[64] = (-((-2485) & 11255)) & (-22529) & 32383;
        lIllIlIIII[65] = 58 ^ 18;
        lIllIlIIII[66] = (-21105) & 22265;
        lIllIlIIII[67] = (-((-3593) & 28635)) & (-4097) & 31743;
        lIllIlIIII[68] = (-((-30842) & 32251)) & (-1) & 40909;
        lIllIlIIII[69] = (-24577) & 25775;
        lIllIlIIII[70] = (-20481) & 23083;
        lIllIlIIII[71] = (-((-1091) & 32459)) & (-69) & 32767;
        lIllIlIIII[72] = (-27025) & 28147;
        lIllIlIIII[73] = (-1281) & 3887;
        lIllIlIIII[74] = (-((-5377) & 22322)) & (-13) & 65407;
        lIllIlIIII[75] = (-((-10777) & 12250)) & (-8705) & 61407;
        lIllIlIIII[76] = (-2209) & 3319;
        lIllIlIIII[77] = (-30917) & 31989;
        lIllIlIIII[78] = (-31153) & 32243;
        lIllIlIIII[79] = "   ".length() ^ (164 ^ 155);
        lIllIlIIII[80] = (-6949) & 8111;
        lIllIlIIII[81] = (-((-17521) & 18165)) & (-1) & 1791;
        lIllIlIIII[82] = (-241) & 95740;
        lIllIlIIII[83] = (-16609) & 122108;
        lIllIlIIII[84] = (-((-16389) & 26895)) & (-65) & 11771;
        lIllIlIIII[85] = (-4357) & 7031;
        lIllIlIIII[86] = (-2372) & 14839;
        lIllIlIIII[87] = (-((-611) & 29291)) & (-2117) & 31981;
        lIllIlIIII[88] = (-133) & 2791;
        lIllIlIIII[89] = (-18569) & 19901;
        lIllIlIIII[90] = (-((-1670) & 26527)) & (-3075) & 65471;
        lIllIlIIII[91] = (-((-11953) & 16049)) & (-1826) & 49151;
        lIllIlIIII[92] = (-21153) & 22265;
        lIllIlIIII[93] = (-21377) & 22455;
        lIllIlIIII[94] = (-((-7297) & 8155)) & (-1) & 63358;
        lIllIlIIII[95] = (-((-2449) & 22931)) & (-2054) & 97935;
        lIllIlIIII[96] = (-23179) & 24271;
        lIllIlIIII[97] = (-257) & 1981;
        lIllIlIIII[98] = (-((-12998) & 14079)) & (-515) & 20095;
        lIllIlIIII[99] = (-((-587) & 25467)) & (-2057) & 28667;
        lIllIlIIII[100] = (-1025) & 11388;
        lIllIlIIII[101] = (-(((16 + 103) - 49) + 83)) & (-26628) & 65279;
        lIllIlIIII[102] = (-22820) & 65319;
        lIllIlIIII[103] = (-28941) & 30669;
        lIllIlIIII[104] = (-25605) & 26623;
        lIllIlIIII[105] = (-((-4697) & 5723)) & (-145) & 24470;
        lIllIlIIII[106] = (-((-579) & 2638)) & (-1169) & 32767;
        lIllIlIIII[107] = (-20481) & 21487;
        lIllIlIIII[108] = (-8193) & 9215;
        lIllIlIIII[109] = (-((-17859) & 18423)) & (-10305) & 11895;
        lIllIlIIII[110] = (-((-10289) & 28283)) & (-10261) & 32639;
        lIllIlIIII[111] = (-4098) & 4979;
        lIllIlIIII[112] = (((((60 + 129) - 46) + 30) + (154 ^ 145)) - (123 ^ 56)) + (15 ^ 102);
        lIllIlIIII[113] = ((157 + 113) - 216) + 179;
        lIllIlIIII[114] = (-((-9235) & 15455)) & (-8465) & 15743;
        lIllIlIIII[115] = (-4228) & 31727;
        lIllIlIIII[116] = (-338) & 32637;
        lIllIlIIII[117] = (-((-23331) & 24375)) & (-1) & 3966;
        lIllIlIIII[118] = (-((-662) & 26271)) & (-4241) & 32761;
        lIllIlIIII[119] = (-28763) & 29823;
        lIllIlIIII[120] = (-((-10541) & 32189)) & (-8226) & 32767;
        lIllIlIIII[121] = (-((-6510) & 31231)) & (-1037) & 28671;
        lIllIlIIII[122] = (-((-2871) & 3902)) & (-8193) & 12127;
        lIllIlIIII[123] = (-((-18195) & 32543)) & (-16401) & 32383;
        lIllIlIIII[124] = (-145) & 1781;
        lIllIlIIII[125] = (-((-621) & 23421)) & (-5) & 24447;
        lIllIlIIII[126] = (-20505) & 22143;
        lIllIlIIII[127] = (-2697) & 14987;
        lIllIlIIII[128] = (-17411) & 20083;
        lIllIlIIII[129] = (-28996) & 30699;
        lIllIlIIII[130] = (-((-3273) & 15819)) & (-2) & 32767;
        lIllIlIIII[131] = (-10245) & 65244;
        lIllIlIIII[132] = (-21) & 65020;
        lIllIlIIII[133] = (-((-7458) & 15871)) & (-1) & 28639;
        lIllIlIIII[134] = (-((-10499) & 14723)) & (-53) & 24511;
        lIllIlIIII[135] = (-193) & 20424;
        lIllIlIIII[136] = (-((-3858) & 20379)) & (-4097) & 31743;
        lIllIlIIII[137] = (-((-2633) & 32381)) & (-132) & 65279;
        lIllIlIIII[138] = (-((-2857) & 19305)) & (-4097) & 22381;
        lIllIlIIII[139] = (-2245) & 6365;
        lIllIlIIII[140] = (-((-12642) & 15723)) & (-8449) & 15839;
        lIllIlIIII[141] = (-26890) & 27515;
        lIllIlIIII[142] = (-28001) & 32123;
        lIllIlIIII[143] = (-((-12433) & 30705)) & (-1) & 22399;
        lIllIlIIII[144] = (-11805) & 15935;
        lIllIlIIII[145] = (-6242) & 31741;
        lIllIlIIII[146] = (-((-16525) & 17551)) & (-65) & 30590;
        lIllIlIIII[147] = (((88 + 170) - 226) + 185) ^ (((3 + 158) - 125) + 123);
        lIllIlIIII[148] = (-9986) & 16311;
        lIllIlIIII[149] = (-((-170) & 2303)) & (-1) & 27133;
        lIllIlIIII[150] = (-((-2297) & 32511)) & (-258) & 65471;
        lIllIlIIII[151] = (-20561) & 32763;
        lIllIlIIII[152] = (-((-10377) & 10969)) & (-6) & 325597;
        lIllIlIIII[153] = (-((-4121) & 20799)) & (-578) & 352255;
        lIllIlIIII[154] = (-((-21190) & 22215)) & (-16899) & 30711;
        lIllIlIIII[155] = (-16392) & 706391;
        lIllIlIIII[156] = (-((-19801) & 23898)) & (-8195) & 752291;
        lIllIlIIII[157] = (-((-7175) & 31791)) & (-4613) & 31727;
        lIllIlIIII[158] = (-((-27975) & 32615)) & (-8201) & 15341;
        lIllIlIIII[159] = (-16658) & 29149;
        lIllIlIIII[160] = (-((-10410) & 15855)) & (-3) & 360447;
        lIllIlIIII[161] = (-((-12357) & 15479)) & (-16385) & 384506;
        lIllIlIIII[162] = (-25091) & 27583;
        lIllIlIIII[163] = (-((-6613) & 23509)) & (-13313) & 32703;
        lIllIlIIII[164] = (-((-1993) & 4089)) & (-18178) & 32767;
        lIllIlIIII[165] = (-((-4609) & 4962)) & (-1) & 655353;
        lIllIlIIII[166] = (-((-24589) & 31245)) & (-1) & 671656;
        lIllIlIIII[167] = (-4647) & 89646;
        lIllIlIIII[168] = (-1217) & 96216;
        lIllIlIIII[169] = (-((-14605) & 32765)) & (-13) & 28671;
        lIllIlIIII[170] = (-((-11790) & 16079)) & (-18211) & 917499;
        lIllIlIIII[171] = (-((-18185) & 26543)) & (-513) & 933870;
        lIllIlIIII[172] = (-817) & 13306;
        lIllIlIIII[173] = (-69) & 335468;
        lIllIlIIII[174] = (-20947) & 360446;
        lIllIlIIII[175] = (-((-24705) & 26567)) & (-8194) & 16383;
        lIllIlIIII[176] = (-5219) & 180218;
        lIllIlIIII[177] = (-((-22153) & 32730)) & (-1029) & 196605;
        lIllIlIIII[178] = (-12841) & 32761;
        lIllIlIIII[179] = (-(31 ^ 26)) & (-33) & 1175036;
        lIllIlIIII[180] = (-((-8265) & 25164)) & (-261) & 1202159;
        lIllIlIIII[181] = (-3146) & 24443;
        lIllIlIIII[182] = (-((-4731) & 30463)) & (-513) & 32767;
        lIllIlIIII[183] = (-(230 ^ 176)) & (-131) & 585215;
        lIllIlIIII[184] = (-((-22753) & 32499)) & (-16514) & 651259;
        lIllIlIIII[185] = (-((-5972) & 14167)) & (-17537) & 32255;
        lIllIlIIII[186] = (-11329) & 32629;
        lIllIlIIII[187] = (-1507) & 1451506;
        lIllIlIIII[188] = (-770) & 1490769;
        lIllIlIIII[189] = (-9350) & 30653;
        lIllIlIIII[190] = (-784) & 1150783;
        lIllIlIIII[191] = (-26628) & 1276627;
        lIllIlIIII[192] = (-5121) & 16248;
        lIllIlIIII[193] = (-3212) & 2953211;
        lIllIlIIII[194] = (-((-4229) & 4807)) & (-24613) & 3080190;
        lIllIlIIII[195] = (-9730) & 16297;
        lIllIlIIII[196] = (-((-10241) & 10683)) & (-20481) & 32762;
        lIllIlIIII[197] = (-9189) & 10238;
        lIllIlIIII[198] = (-28974) & 30015;
        lIllIlIIII[199] = (-((-11554) & 32227)) & (-10761) & 32479;
        lIllIlIIII[200] = (-587) & 15086;
        lIllIlIIII[201] = (-31203) & 32246;
        lIllIlIIII[202] = (-31473) & 32510;
        lIllIlIIII[203] = (-((-18073) & 24223)) & (-513) & 7710;
        lIllIlIIII[204] = (-21068) & 22107;
        lIllIlIIII[205] = (-27171) & 28223;
        lIllIlIIII[206] = (-((-515) & 20127)) & (-257) & 20447;
        lIllIlIIII[207] = (-3073) & 4089;
        lIllIlIIII[208] = (-(32 ^ 3)) & (-16449) & 18431;
        lIllIlIIII[209] = (-((-22157) & 32461)) & (-4097) & 16127;
        lIllIlIIII[210] = (-4619) & 5999;
        lIllIlIIII[211] = (-205) & 748;
        lIllIlIIII[212] = (-29831) & 30407;
        lIllIlIIII[213] = (-10977) & 12011;
        lIllIlIIII[214] = (-((-16667) & 28155)) & (-1) & 12030;
        lIllIlIIII[215] = (-((-9225) & 15567)) & (-273) & 7647;
        lIllIlIIII[216] = (((7 + 116) - (-4)) + 16) ^ (((155 + 153) - 299) + 147);
        lIllIlIIII[217] = (4 ^ 51) ^ (154 ^ 184);
        lIllIlIIII[218] = (137 ^ 187) ^ (32 ^ 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public static void V() {
        bq.clear();
        br.clear();
        bs.clear();
        bt.clear();
        bu.clear();
        bv.clear();
        bw.clear();
        bx.clear();
        by.clear();
        bz.clear();
        bA.clear();
        int i = lIllIlIIII[0];
        bL = i;
        bK = i;
        bJ = i;
        bI = i;
        bH = i;
        bG = i;
        bF = i;
        bE = i;
        bD = i;
        bC = i;
        bB = i;
        int i2 = lIllIlIIII[0];
        bW = i2;
        bV = i2;
        bU = i2;
        bT = i2;
        bS = i2;
        bR = i2;
        bQ = i2;
        bP = i2;
        bO = i2;
        bN = i2;
        bM = i2;
        bo = lIllIlIIII[0];
        System.out.println(lIllIIllll[lIllIlIIII[46]]);
    }

    private static void lIIllIIIlIIll() {
        lIllIIllll = new String[lIllIlIIII[218]];
        lIllIIllll[lIllIlIIII[0]] = lIIllIIIlIIII("AXk/NS4LLio=", "gKOXK");
        lIllIIllll[lIllIlIIII[1]] = lIIllIIIlIIII("NEQCPwQ3BQY=", "RvrNq");
        lIllIIllll[lIllIlIIII[2]] = lIIllIIIlIIIl("LH2InbgHwWE=", "xtjby");
        lIllIIllll[lIllIlIIII[3]] = lIIllIIIlIIII("NykxEw==", "ZHVvB");
        lIllIIllll[lIllIlIIII[4]] = lIIllIIIlIIlI("W5LS2GIzMNY=", "nvSVy");
        lIllIIllll[lIllIlIIII[5]] = lIIllIIIlIIII("FTwVEh8qJicEGw==", "dIpak");
        lIllIIllll[lIllIlIIII[6]] = lIIllIIIlIIlI("uGBBYHTiFrs=", "tKOtg");
        lIllIIllll[lIllIlIIII[7]] = lIIllIIIlIIII("JzQlLR0yKg==", "FSLAt");
        lIllIIllll[lIllIlIIII[8]] = lIIllIIIlIIIl("3t1L55CQvQvZAYJZVOxrlw==", "zDNUL");
        lIllIIllll[lIllIlIIII[9]] = lIIllIIIlIIII("FCILBQ8oLh8=", "fCebj");
        lIllIIllll[lIllIlIIII[10]] = lIIllIIIlIIII("ODI6KRoHOi4oEUoWJTgcGj4xIwFQ", "jSTMu");
        lIllIIllll[lIllIlIIII[11]] = lIIllIIIlIIlI("qq5thURvba51VsgvtqHylA==", "pTCqc");
        lIllIIllll[lIllIlIIII[12]] = lIIllIIIlIIII("JxgnADEJFC1JIBQIIAclQRg9DC8SXWkaNQgFKgErDxZpCyMCGmkdLUEDKAcmDhwODCMTGCcO", "aqIiB");
        lIllIIllll[lIllIlIIII[13]] = lIIllIIIlIIlI("BKOiYgIsYo0ITVVbkoLeXuUH7APyTN3C", "RUdjs");
        lIllIIllll[lIllIlIIII[14]] = lIIllIIIlIIlI("+wUCtFRQt453CFU5YR7QKlHb65EfjqpX", "MTIVY");
        lIllIIllll[lIllIlIIII[19]] = lIIllIIIlIIlI("JLU2bTS3F+6JlXdNwCxV7ZRyhgJ76dbM9hDgJtmc81h+PVd1uOd0Oz+BIDFIyAVc", "hdbAj");
        lIllIIllll[lIllIlIIII[20]] = lIIllIIIlIIlI("SFLOir27AQ9ZLIITsor1zjc2sQwGu58JdcXxa0jYbgHoflvngblAstnKNfBShb7z", "dzLlW");
        lIllIIllll[lIllIlIIII[21]] = lIIllIIIlIIlI("75CnuEMWpyKeN2F0THE9res/aMLThC9p2MhLkwpdblllfklE2maGFmsH07OrvUR7", "zqzIP");
        lIllIIllll[lIllIlIIII[24]] = lIIllIIIlIIlI("/UO+sb/C9X8xo1dr/5zlT7Re4Sh40mev", "KkDqk");
        lIllIIllll[lIllIlIIII[216]] = lIIllIIIlIIlI("BQ8e2t8nFdKVYhTTDMyN+h9zkp4qlmOrl9uWpx8bYmBOaDvdA5SEpFteBSQsPfIx1NEfQ+5/G7A=", "WUTVy");
        lIllIIllll[lIllIlIIII[46]] = lIIllIIIlIIII("NhQPECAJVQYRLhZVDR08EAZBNwMhNDMxCw==", "duatO");
        lIllIIllll[lIllIlIIII[217]] = lIIllIIIlIIII("NC4zBAcr", "CKRhs");
    }

    private static boolean lIIllIIlIllIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(int[] iArr) {
        int i = lIllIlIIII[0];
        while (lIIllIIlIlIII(i, iArr.length)) {
            if (lIIllIIlIlIlI(iArr[i])) {
                int[] iArr2 = new int[lIllIlIIII[1]];
                iArr2[lIllIlIIII[0]] = iArr[i];
                if (lIIllIIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + iArr[i]);
                    return lIllIlIIII[0];
                }
            }
            i++;
            "".length();
            if ((((88 ^ 54) ^ (234 ^ 131)) & (((((67 + 7) - 23) + 76) ^ (28 ^ 100)) ^ (-" ".length()))) != 0) {
                return ((161 ^ 193) ^ (116 ^ 25)) & (((48 ^ 52) ^ (116 ^ 125)) ^ (-" ".length()));
            }
        }
        return lIllIlIIII[1];
    }

    private static boolean lIIllIIlIlIll(int i, int i2) {
        return i == i2;
    }

    private static void T() {
        bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[197]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[198]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[199]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98])), Integer.valueOf(lIllIlIIII[201]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98])), Integer.valueOf(lIllIlIIII[202]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98])), Integer.valueOf(lIllIlIIII[203]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98])), Integer.valueOf(lIllIlIIII[204]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98])), Integer.valueOf(lIllIlIIII[205]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[146])), Integer.valueOf(lIllIlIIII[206]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
        bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[25]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98])), Integer.valueOf(lIllIlIIII[207]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98])), Integer.valueOf(lIllIlIIII[208]), Integer.valueOf(C0004e.c(lIllIlIIII[200], lIllIlIIII[98]))));
        br.putAll(Map.of(Integer.valueOf(lIllIlIIII[97]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42])), Integer.valueOf(lIllIlIIII[99]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42])), Integer.valueOf(lIllIlIIII[209]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42]))));
        bs.putAll(Map.of(Integer.valueOf(lIllIlIIII[104]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[107]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[108]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[109]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[110]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106]))));
        bt.putAll(Map.of());
        bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[210]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
        bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[211]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[212]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[213]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38]))));
        bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[214]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[215]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        by.putAll(Map.of(Integer.valueOf(lIllIlIIII[114]), Integer.valueOf(C0004e.c(lIllIlIIII[137], lIllIlIIII[68])), Integer.valueOf(lIllIlIIII[118]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[117]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[119]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[121]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[122]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[120]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        bA.putAll(Map.of(Integer.valueOf(lIllIlIIII[123]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[125]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[126]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v238, types: [boolean] */
    public static void d(String str) {
        if (!lIIllIIlIIllI(bB) || lIIllIIlIIlll(bH)) {
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[0]]) ? 1 : 0)) {
                P();
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[1]]) ? 1 : 0)) {
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[2]]) ? 1 : 0)) {
                T();
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[3]]) ? 1 : 0)) {
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[4]]) ? 1 : 0)) {
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[5]]) ? 1 : 0)) {
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[6]]) ? 1 : 0)) {
                Q();
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[7]]) ? 1 : 0)) {
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[8]]) ? 1 : 0)) {
                S();
            }
            if (lIIllIIlIIllI(str.equalsIgnoreCase(lIllIIllll[lIllIlIIII[9]]) ? 1 : 0)) {
                R();
            }
            U();
            System.out.println(lIllIIllll[lIllIlIIII[10]]);
            System.out.println("Helm: " + bB + ", Price: " + bM);
            System.out.println("Amulet: " + bC + ", Price: " + bN);
            System.out.println("Cape: " + bD + ", Price: " + bO);
            System.out.println("Ammo: " + bE + ", Price: " + bP);
            System.out.println("Weapon: " + bF + ", Price: " + bQ);
            System.out.println("Shield: " + bG + ", Price: " + bR);
            System.out.println("Body: " + bH + ", Price: " + bS);
            System.out.println("Legs: " + bI + ", Price: " + bT);
            System.out.println("Gloves: " + bJ + ", Price: " + bU);
            System.out.println("Boots: " + bK + ", Price: " + bV);
            System.out.println("Ring: " + bL + ", Price: " + bW);
        }
        if (lIIllIIlIIllI(bB) && lIIllIIlIIllI(bH)) {
            if (lIIllIIlIIllI(bn ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIllll[lIllIlIIII[11]];
                C0001b.a(bp);
                if (lIIllIIlIlIII(bp.size(), lIllIlIIII[1])) {
                    System.out.println(lIllIIllll[lIllIlIIII[12]]);
                    bn = lIllIlIIII[0];
                }
            }
            if (lIIllIIlIIlll(bn ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllIIlIlIIl(nearest) && lIIllIIlIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllll[lIllIlIIII[13]];
                    C0000a.a(nearest);
                }
                if (lIIllIIlIlIIl(nearest) && lIIllIIlIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllll[lIllIlIIII[14]];
                    if (lIIllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIlIIII[15]);
                        "".length();
                    }
                    if (lIIllIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIIlIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIlIIII[4]);
                            "".length();
                        }
                        if (lIIllIIlIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIlIIII[2]);
                            "".length();
                        }
                        if (lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                            int[] iArr = new int[lIllIlIIII[1]];
                            iArr[lIllIlIIII[0]] = lIllIlIIII[17];
                            if (lIIllIIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIllIlIIII[1]];
                                iArr2[lIllIlIIII[0]] = lIllIlIIII[16];
                                if (lIIllIIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                                    int[] iArr3 = new int[lIllIlIIII[1]];
                                    iArr3[lIllIlIIII[0]] = lIllIlIIII[18];
                                    if (lIIllIIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                                        O();
                                        System.out.println(lIllIIllll[lIllIlIIII[19]]);
                                        bn = lIllIlIIII[1];
                                        return;
                                    }
                                }
                            }
                            int[] iArr4 = new int[lIllIlIIII[10]];
                            iArr4[lIllIlIIII[0]] = bB;
                            iArr4[lIllIlIIII[1]] = bC;
                            iArr4[lIllIlIIII[2]] = bD;
                            iArr4[lIllIlIIII[3]] = bE;
                            iArr4[lIllIlIIII[4]] = bF;
                            iArr4[lIllIlIIII[5]] = bG;
                            iArr4[lIllIlIIII[6]] = bH;
                            iArr4[lIllIlIIII[7]] = bI;
                            iArr4[lIllIlIIII[8]] = bJ;
                            iArr4[lIllIlIIII[9]] = bK;
                            if (lIIllIIlIIlll(b(iArr4) ? 1 : 0)) {
                                O();
                                System.out.println(lIllIIllll[lIllIlIIII[20]]);
                                bn = lIllIlIIII[1];
                                return;
                            }
                        }
                        if (lIIllIIlIllII(bL, lIllIlIIII[16])) {
                            int[] iArr5 = new int[lIllIlIIII[11]];
                            iArr5[lIllIlIIII[0]] = bB;
                            iArr5[lIllIlIIII[1]] = bC;
                            iArr5[lIllIlIIII[2]] = bD;
                            iArr5[lIllIlIIII[3]] = bE;
                            iArr5[lIllIlIIII[4]] = bF;
                            iArr5[lIllIlIIII[5]] = bG;
                            iArr5[lIllIlIIII[6]] = bH;
                            iArr5[lIllIlIIII[7]] = bI;
                            iArr5[lIllIlIIII[8]] = bJ;
                            iArr5[lIllIlIIII[9]] = bK;
                            iArr5[lIllIlIIII[10]] = bL;
                            if (lIIllIIlIIlll(b(iArr5) ? 1 : 0)) {
                                O();
                                System.out.println(lIllIIllll[lIllIlIIII[21]]);
                                bn = lIllIlIIII[1];
                                return;
                            }
                        }
                        if (lIIllIIlIIllI(n(bL) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIlIIII[11]];
                            iArr6[lIllIlIIII[0]] = bB;
                            iArr6[lIllIlIIII[1]] = bC;
                            iArr6[lIllIlIIII[2]] = bD;
                            iArr6[lIllIlIIII[3]] = bE;
                            iArr6[lIllIlIIII[4]] = bF;
                            iArr6[lIllIlIIII[5]] = bG;
                            iArr6[lIllIlIIII[6]] = bH;
                            iArr6[lIllIlIIII[7]] = bI;
                            iArr6[lIllIlIIII[8]] = bJ;
                            iArr6[lIllIlIIII[9]] = bK;
                            iArr6[lIllIlIIII[10]] = bL;
                            if (lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                                int[] iArr7 = new int[lIllIlIIII[1]];
                                iArr7[lIllIlIIII[0]] = lIllIlIIII[16];
                                if (lIIllIIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr8 = new int[lIllIlIIII[1]];
                                    iArr8[lIllIlIIII[0]] = lIllIlIIII[17];
                                    if (lIIllIIlIIllI(Bank.contains(iArr8) ? 1 : 0)) {
                                        C0000a.a(lIllIlIIII[17], lIllIlIIII[1]);
                                    }
                                }
                                int[] iArr9 = new int[lIllIlIIII[1]];
                                iArr9[lIllIlIIII[0]] = lIllIlIIII[16];
                                if (lIIllIIlIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                    int[] iArr10 = new int[lIllIlIIII[1]];
                                    iArr10[lIllIlIIII[0]] = lIllIlIIII[17];
                                    if (lIIllIIlIIlll(Bank.contains(iArr10) ? 1 : 0)) {
                                        int[] iArr11 = new int[lIllIlIIII[1]];
                                        iArr11[lIllIlIIII[0]] = lIllIlIIII[17];
                                        if (lIIllIIlIIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                                            int[] iArr12 = new int[lIllIlIIII[1]];
                                            iArr12[lIllIlIIII[0]] = lIllIlIIII[18];
                                            if (lIIllIIlIIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                                C0000a.a(lIllIlIIII[18], lIllIlIIII[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            C0000a.a(iArr6, lIllIlIIII[1]);
                            Time.sleepTicks(C0004e.c(lIllIlIIII[10], lIllIlIIII[14]));
                            "".length();
                            if (lIIllIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks(C0004e.c(lIllIlIIII[3], lIllIlIIII[5]));
                                "".length();
                            }
                            do {
                                if (lIIllIIlIIlll(Inventory.contains(iArr6) ? 1 : 0) && !lIIllIIlIIllI(Inventory.contains(item -> {
                                    if (lIIllIIlIIllI(item.getName().contains(lIllIIllll[lIllIlIIII[217]]) ? 1 : 0) && lIIllIIlIIlll(item.isNoted() ? 1 : 0)) {
                                        ?? r0 = lIllIlIIII[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIllIlIIII[0];
                                }) ? 1 : 0)) {
                                    if (lIIllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                                        C0000a.a();
                                        Time.sleepUntil(() -> {
                                            return Bank.isOpen();
                                        }, lIllIlIIII[15]);
                                        "".length();
                                        Time.sleepTicks(lIllIlIIII[4]);
                                        "".length();
                                        System.out.println(lIllIIllll[lIllIlIIII[24]]);
                                        bo = lIllIlIIII[1];
                                        return;
                                    }
                                    return;
                                }
                                C0004e.l(bB);
                                C0004e.l(bC);
                                C0004e.l(bD);
                                C0004e.l(bE);
                                Time.sleepTicks(lIllIlIIII[1]);
                                "".length();
                                C0004e.l(bF);
                                C0004e.l(bG);
                                C0004e.l(bH);
                                Time.sleepTicks(lIllIlIIII[1]);
                                "".length();
                                C0004e.l(bI);
                                C0004e.l(bJ);
                                C0004e.l(bK);
                                C0004e.l(bL);
                                Time.sleepTicks(lIllIlIIII[1]);
                                "".length();
                                C0004e.l(lIllIlIIII[16]);
                                C0004e.l(lIllIlIIII[17]);
                                C0004e.l(lIllIlIIII[18]);
                                C0004e.l(lIllIlIIII[22]);
                                C0004e.l(lIllIlIIII[23]);
                                "".length();
                            } while (((3 ^ 93) & ((35 ^ 125) ^ (-1))) <= 0);
                        }
                    }
                }
            }
        }
    }

    private static String lIIllIIIlIIIl(String lllllllllllllllllllIIIlIIllIlIII, String lllllllllllllllllllIIIlIIllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIIlIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIII[8]), "DES");
            Cipher lllllllllllllllllllIIIlIIllIllII = Cipher.getInstance("DES");
            lllllllllllllllllllIIIlIIllIllII.init(lIllIlIIII[2], lllllllllllllllllllIIIlIIllIllIl);
            return new String(lllllllllllllllllllIIIlIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlIIllIlIll) {
            lllllllllllllllllllIIIlIIllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlIlI(int i) {
        return i > 0;
    }

    private static boolean lIIllIIlIlIIl(Object obj) {
        return obj != null;
    }

    private static int a(Map<Integer, Integer> map, Random random) {
        if (lIIllIIlIIllI(map.isEmpty() ? 1 : 0)) {
            return lIllIlIIII[0];
        }
        int nextInt = random.nextInt(map.size());
        int i = lIllIlIIII[0];
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (lIIllIIlIlIll(i, nextInt)) {
                return intValue;
            }
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return (98 ^ 86) & ((140 ^ 184) ^ (-1));
            }
        }
        throw new IllegalStateException(lIllIIllll[lIllIlIIII[216]]);
    }

    private static String lIIllIIIlIIII(String lllllllllllllllllllIIIlIlIIIllII, String lllllllllllllllllllIIIlIlIIIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIlIlIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllIIIlIlIIIlIIl = lllllllllllllllllllIIIlIlIIIlIll.toCharArray();
        int lllllllllllllllllllIIIlIlIIIlIII = lIllIlIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIlIIII[0];
        while (lIIllIIlIlIII(i, length)) {
            char lllllllllllllllllllIIIlIlIIIllIl = charArray[i];
            sb.append((char) (lllllllllllllllllllIIIlIlIIIllIl ^ lllllllllllllllllllIIIlIlIIIlIIl[lllllllllllllllllllIIIlIlIIIlIII % lllllllllllllllllllIIIlIlIIIlIIl.length]));
            "".length();
            lllllllllllllllllllIIIlIlIIIlIII++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void U() {
        Random random = new Random();
        bB = a(bq, random);
        bM = bq.getOrDefault(Integer.valueOf(bB), Integer.valueOf(lIllIlIIII[0])).intValue();
        bC = a(br, random);
        bN = br.getOrDefault(Integer.valueOf(bC), Integer.valueOf(lIllIlIIII[0])).intValue();
        bD = a(bs, random);
        bO = bs.getOrDefault(Integer.valueOf(bD), Integer.valueOf(lIllIlIIII[0])).intValue();
        bE = a(bt, random);
        bP = bt.getOrDefault(Integer.valueOf(bE), Integer.valueOf(lIllIlIIII[0])).intValue();
        bF = a(bu, random);
        bQ = bu.getOrDefault(Integer.valueOf(bF), Integer.valueOf(lIllIlIIII[0])).intValue();
        bG = a(bv, random);
        bR = bv.getOrDefault(Integer.valueOf(bG), Integer.valueOf(lIllIlIIII[0])).intValue();
        bH = a(bw, random);
        bS = bw.getOrDefault(Integer.valueOf(bH), Integer.valueOf(lIllIlIIII[0])).intValue();
        bI = a(bx, random);
        bT = bx.getOrDefault(Integer.valueOf(bI), Integer.valueOf(lIllIlIIII[0])).intValue();
        bJ = a(by, random);
        bU = by.getOrDefault(Integer.valueOf(bJ), Integer.valueOf(lIllIlIIII[0])).intValue();
        bK = a(bz, random);
        bV = bz.getOrDefault(Integer.valueOf(bK), Integer.valueOf(lIllIlIIII[0])).intValue();
        bL = a(bA, random);
        bW = bA.getOrDefault(Integer.valueOf(bL), Integer.valueOf(lIllIlIIII[0])).intValue();
    }

    private static String lIIllIIIlIIlI(String lllllllllllllllllllIIIlIIlllIlll, String lllllllllllllllllllIIIlIIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllllllIIIlIIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIlIIllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIlIIllllIIl.init(lIllIlIIII[2], lllllllllllllllllllIIIlIIllllIlI);
            return new String(lllllllllllllllllllIIIlIIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlIIllllIII) {
            lllllllllllllllllllIIIlIIllllIII.printStackTrace();
            return null;
        }
    }

    private static void O() {
        if (lIIllIIlIIllI(bB)) {
            int[] iArr = new int[lIllIlIIII[1]];
            iArr[lIllIlIIII[0]] = bB;
            if (lIIllIIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(bB, lIllIlIIII[1], bM));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bC)) {
            int[] iArr2 = new int[lIllIlIIII[1]];
            iArr2[lIllIlIIII[0]] = bC;
            if (lIIllIIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(bC, lIllIlIIII[1], bN));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bD)) {
            int[] iArr3 = new int[lIllIlIIII[1]];
            iArr3[lIllIlIIII[0]] = bD;
            if (lIIllIIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                bp.add(new C0003d(bD, lIllIlIIII[1], bO));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bE)) {
            int[] iArr4 = new int[lIllIlIIII[1]];
            iArr4[lIllIlIIII[0]] = bE;
            if (lIIllIIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                bp.add(new C0003d(bE, lIllIlIIII[1], bP));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bF)) {
            int[] iArr5 = new int[lIllIlIIII[1]];
            iArr5[lIllIlIIII[0]] = bF;
            if (lIIllIIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                bp.add(new C0003d(bF, lIllIlIIII[1], bQ));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bG)) {
            int[] iArr6 = new int[lIllIlIIII[1]];
            iArr6[lIllIlIIII[0]] = bG;
            if (lIIllIIlIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                bp.add(new C0003d(bG, lIllIlIIII[1], bR));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bH)) {
            int[] iArr7 = new int[lIllIlIIII[1]];
            iArr7[lIllIlIIII[0]] = bH;
            if (lIIllIIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                bp.add(new C0003d(bH, lIllIlIIII[1], bS));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bI)) {
            int[] iArr8 = new int[lIllIlIIII[1]];
            iArr8[lIllIlIIII[0]] = bI;
            if (lIIllIIlIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                bp.add(new C0003d(bI, lIllIlIIII[1], bT));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bJ)) {
            int[] iArr9 = new int[lIllIlIIII[1]];
            iArr9[lIllIlIIII[0]] = bJ;
            if (lIIllIIlIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                bp.add(new C0003d(bJ, lIllIlIIII[1], bU));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bK)) {
            int[] iArr10 = new int[lIllIlIIII[1]];
            iArr10[lIllIlIIII[0]] = bK;
            if (lIIllIIlIIlll(Bank.contains(iArr10) ? 1 : 0)) {
                bp.add(new C0003d(bK, lIllIlIIII[1], bV));
                "".length();
            }
        }
        if (lIIllIIlIIllI(bL)) {
            int[] iArr11 = new int[lIllIlIIII[1]];
            iArr11[lIllIlIIII[0]] = bL;
            if (lIIllIIlIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                if (!lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                    bp.add(new C0003d(bL, lIllIlIIII[1], bW));
                    "".length();
                    return;
                }
                int[] iArr12 = new int[lIllIlIIII[1]];
                iArr12[lIllIlIIII[0]] = lIllIlIIII[16];
                if (lIIllIIlIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[lIllIlIIII[1]];
                    iArr13[lIllIlIIII[0]] = lIllIlIIII[17];
                    if (lIIllIIlIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[lIllIlIIII[1]];
                        iArr14[lIllIlIIII[0]] = lIllIlIIII[18];
                        if (lIIllIIlIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                            bp.add(new C0003d(bL, lIllIlIIII[1], bW));
                            "".length();
                            "".length();
                            if (0 != 0) {
                            }
                        }
                    }
                }
            }
        }
    }

    private static void S() {
        bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[181]), Integer.valueOf(C0004e.c(lIllIlIIII[170], lIllIlIIII[171]))));
        bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[182]), Integer.valueOf(C0004e.c(lIllIlIIII[183], lIllIlIIII[184]))));
        bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[185]), Integer.valueOf(C0004e.c(lIllIlIIII[155], lIllIlIIII[156]))));
        bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[186]), Integer.valueOf(C0004e.c(lIllIlIIII[187], lIllIlIIII[188]))));
        bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[189]), Integer.valueOf(C0004e.c(lIllIlIIII[190], lIllIlIIII[191]))));
        br.putAll(Map.of(Integer.valueOf(lIllIlIIII[192]), Integer.valueOf(C0004e.c(lIllIlIIII[193], lIllIlIIII[194]))));
        bs.putAll(Map.of(Integer.valueOf(lIllIlIIII[195]), Integer.valueOf(C0004e.c(lIllIlIIII[170], lIllIlIIII[171]))));
        bt.putAll(Map.of(Integer.valueOf(lIllIlIIII[134]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132]))));
        by.putAll(Map.of(Integer.valueOf(lIllIlIIII[136]), Integer.valueOf(C0004e.c(lIllIlIIII[137], lIllIlIIII[68]))));
        bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[196]), Integer.valueOf(C0004e.c(lIllIlIIII[176], lIllIlIIII[177]))));
        bA.putAll(Map.of(Integer.valueOf(lIllIlIIII[16]), Integer.valueOf(C0004e.c(lIllIlIIII[145], lIllIlIIII[146]))));
    }

    private static boolean lIIllIIlIIlll(int i) {
        return i == 0;
    }

    private static void Q() {
        if (lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[5])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[25]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[29]), Integer.valueOf(C0004e.c(lIllIlIIII[30], lIllIlIIII[31])), Integer.valueOf(lIllIlIIII[32]), Integer.valueOf(C0004e.c(lIllIlIIII[30], lIllIlIIII[31]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[33]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[36]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[39]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[40]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[41]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[44]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[45]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[5]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[46])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[47]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[48]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[32]), Integer.valueOf(C0004e.c(lIllIlIIII[30], lIllIlIIII[31]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[49]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[50]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[39]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[41]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[51]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[46]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[52])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[53]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[47]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[54]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[56]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[57]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[48]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[127]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[56]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[58]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[50]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[59]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[60]), Integer.valueOf(C0004e.c(lIllIlIIII[61], lIllIlIIII[62]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[63]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[51]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[64]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[52]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[65])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[66]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[67]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[69]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[70]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68])), Integer.valueOf(lIllIlIIII[57]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[71]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[72]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[59]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[73]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75])), Integer.valueOf(lIllIlIIII[76]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[63]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[77]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[78]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[65]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[79])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[66]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[80]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68])), Integer.valueOf(lIllIlIIII[128]), Integer.valueOf(C0004e.c(lIllIlIIII[82], lIllIlIIII[83]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[69]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[84]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68])), Integer.valueOf(lIllIlIIII[85]), Integer.valueOf(C0004e.c(lIllIlIIII[82], lIllIlIIII[83]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[89]), Integer.valueOf(C0004e.c(lIllIlIIII[90], lIllIlIIII[91]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[72]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[92]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75])), Integer.valueOf(lIllIlIIII[73]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75])), Integer.valueOf(lIllIlIIII[76]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[93]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[77]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[96]), Integer.valueOf(C0004e.c(lIllIlIIII[94], lIllIlIIII[95]))));
        }
        br.putAll(Map.of(Integer.valueOf(lIllIlIIII[129]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42])), Integer.valueOf(lIllIlIIII[97]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42])), Integer.valueOf(lIllIlIIII[99]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42])), Integer.valueOf(lIllIlIIII[100]), Integer.valueOf(C0004e.c(lIllIlIIII[101], lIllIlIIII[102])), Integer.valueOf(lIllIlIIII[103]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42]))));
        bs.putAll(Map.of(Integer.valueOf(lIllIlIIII[104]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[107]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[108]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[109]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[110]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106]))));
        bt.putAll(Map.of(Integer.valueOf(lIllIlIIII[130]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132])), Integer.valueOf(lIllIlIIII[133]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132])), Integer.valueOf(lIllIlIIII[134]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132])), Integer.valueOf(lIllIlIIII[135]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132]))));
        by.putAll(Map.of(Integer.valueOf(lIllIlIIII[136]), Integer.valueOf(C0004e.c(lIllIlIIII[137], lIllIlIIII[68]))));
        bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[119]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[138]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[139]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[140]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[141]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[5]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[46])) {
            bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[142]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[46]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[52])) {
            bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[143]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[65]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[79])) {
            bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[144]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        }
        bA.putAll(Map.of(Integer.valueOf(lIllIlIIII[16]), Integer.valueOf(C0004e.c(lIllIlIIII[145], lIllIlIIII[146]))));
    }

    private static void P() {
        if (lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[5])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[25]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[28]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[29]), Integer.valueOf(C0004e.c(lIllIlIIII[30], lIllIlIIII[31])), Integer.valueOf(lIllIlIIII[32]), Integer.valueOf(C0004e.c(lIllIlIIII[30], lIllIlIIII[31]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[33]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[36]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[39]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[40]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[41]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[44]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[45]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[5]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[46])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[47]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[48]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[32]), Integer.valueOf(C0004e.c(lIllIlIIII[30], lIllIlIIII[31]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[49]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[50]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[39]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[41]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[51]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[46]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[52])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[53]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[47]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[54]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[56]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[57]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[48]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[58]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[50]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[59]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[60]), Integer.valueOf(C0004e.c(lIllIlIIII[61], lIllIlIIII[62]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[63]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[51]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[64]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[52]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[65])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[66]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[67]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[69]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[70]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68])), Integer.valueOf(lIllIlIIII[57]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[71]), Integer.valueOf(C0004e.c(lIllIlIIII[34], lIllIlIIII[35]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[72]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[59]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[73]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75])), Integer.valueOf(lIllIlIIII[76]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[63]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[77]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43])), Integer.valueOf(lIllIlIIII[78]), Integer.valueOf(C0004e.c(lIllIlIIII[42], lIllIlIIII[43]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[65]) && lIIllIIlIlIII(Skills.getLevel(Skill.DEFENCE), lIllIlIIII[79])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[66]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[80]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68])), Integer.valueOf(lIllIlIIII[81]), Integer.valueOf(C0004e.c(lIllIlIIII[82], lIllIlIIII[83]))));
            bv.putAll(Map.of(Integer.valueOf(lIllIlIIII[69]), Integer.valueOf(C0004e.c(lIllIlIIII[26], lIllIlIIII[27])), Integer.valueOf(lIllIlIIII[84]), Integer.valueOf(C0004e.c(lIllIlIIII[55], lIllIlIIII[68])), Integer.valueOf(lIllIlIIII[85]), Integer.valueOf(C0004e.c(lIllIlIIII[82], lIllIlIIII[83])), Integer.valueOf(lIllIlIIII[86]), Integer.valueOf(C0004e.c(lIllIlIIII[82], lIllIlIIII[83])), Integer.valueOf(lIllIlIIII[87]), Integer.valueOf(C0004e.c(lIllIlIIII[82], lIllIlIIII[83])), Integer.valueOf(lIllIlIIII[88]), Integer.valueOf(C0004e.c(lIllIlIIII[82], lIllIlIIII[83]))));
            bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[89]), Integer.valueOf(C0004e.c(lIllIlIIII[90], lIllIlIIII[91]))));
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[72]), Integer.valueOf(C0004e.c(lIllIlIIII[37], lIllIlIIII[38])), Integer.valueOf(lIllIlIIII[92]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75])), Integer.valueOf(lIllIlIIII[73]), Integer.valueOf(C0004e.c(lIllIlIIII[74], lIllIlIIII[75]))));
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[93]), Integer.valueOf(C0004e.c(lIllIlIIII[94], lIllIlIIII[95])), Integer.valueOf(lIllIlIIII[96]), Integer.valueOf(C0004e.c(lIllIlIIII[94], lIllIlIIII[95]))));
        }
        br.putAll(Map.of(Integer.valueOf(lIllIlIIII[97]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42])), Integer.valueOf(lIllIlIIII[99]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42])), Integer.valueOf(lIllIlIIII[100]), Integer.valueOf(C0004e.c(lIllIlIIII[101], lIllIlIIII[102])), Integer.valueOf(lIllIlIIII[103]), Integer.valueOf(C0004e.c(lIllIlIIII[98], lIllIlIIII[42]))));
        bs.putAll(Map.of(Integer.valueOf(lIllIlIIII[104]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[107]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[108]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[109]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106])), Integer.valueOf(lIllIlIIII[110]), Integer.valueOf(C0004e.c(lIllIlIIII[105], lIllIlIIII[106]))));
        bt.putAll(Map.of(Integer.valueOf(lIllIlIIII[111]), Integer.valueOf(C0004e.c(lIllIlIIII[112], lIllIlIIII[113]))));
        by.putAll(Map.of(Integer.valueOf(lIllIlIIII[114]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[117]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[118]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[119]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[120]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[121]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[122]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
        bA.putAll(Map.of(Integer.valueOf(lIllIlIIII[123]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[124]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[125]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116])), Integer.valueOf(lIllIlIIII[126]), Integer.valueOf(C0004e.c(lIllIlIIII[115], lIllIlIIII[116]))));
    }

    static {
        lIIllIIlIIlIl();
        lIIllIIIlIIll();
        bp = new ArrayList();
        bq = new HashMap();
        br = new HashMap();
        bs = new HashMap();
        bt = new HashMap();
        bu = new HashMap();
        bv = new HashMap();
        bw = new HashMap();
        bx = new HashMap();
        by = new HashMap();
        bz = new HashMap();
        bA = new HashMap();
    }

    private static boolean lIIllIIlIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIIlIllII(int i, int i2) {
        return i != i2;
    }

    private static void R() {
        if (lIIllIIlIlIII(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[148]), Integer.valueOf(C0004e.c(lIllIlIIII[149], lIllIlIIII[150]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bq.putAll(Map.of(Integer.valueOf(lIllIlIIII[151]), Integer.valueOf(C0004e.c(lIllIlIIII[152], lIllIlIIII[153]))));
        }
        bu.putAll(Map.of(Integer.valueOf(lIllIlIIII[154]), Integer.valueOf(C0004e.c(lIllIlIIII[155], lIllIlIIII[156]))));
        if (lIIllIIlIlIII(Skills.getLevel(Skill.RANGED), lIllIlIIII[79])) {
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[157]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.RANGED), lIllIlIIII[79]) && lIIllIIlIlIII(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[158]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bw.putAll(Map.of(Integer.valueOf(lIllIlIIII[159]), Integer.valueOf(C0004e.c(lIllIlIIII[160], lIllIlIIII[161]))));
        }
        if (lIIllIIlIlIII(Skills.getLevel(Skill.RANGED), lIllIlIIII[79])) {
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[162]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.RANGED), lIllIlIIII[79]) && lIIllIIlIlIII(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[163]), Integer.valueOf(C0004e.c(lIllIlIIII[131], lIllIlIIII[132]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bx.putAll(Map.of(Integer.valueOf(lIllIlIIII[164]), Integer.valueOf(C0004e.c(lIllIlIIII[165], lIllIlIIII[166]))));
        }
        br.putAll(Map.of(Integer.valueOf(lIllIlIIII[129]), Integer.valueOf(C0004e.c(lIllIlIIII[167], lIllIlIIII[168]))));
        bs.putAll(Map.of(Integer.valueOf(lIllIlIIII[169]), Integer.valueOf(C0004e.c(lIllIlIIII[170], lIllIlIIII[171]))));
        if (lIIllIIlIlIII(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            by.putAll(Map.of(Integer.valueOf(lIllIlIIII[136]), Integer.valueOf(C0004e.c(lIllIlIIII[137], lIllIlIIII[68]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            by.putAll(Map.of(Integer.valueOf(lIllIlIIII[172]), Integer.valueOf(C0004e.c(lIllIlIIII[173], lIllIlIIII[174]))));
        }
        if (lIIllIIlIlIII(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[175]), Integer.valueOf(C0004e.c(lIllIlIIII[176], lIllIlIIII[177]))));
        }
        if (lIIllIIlIllIl(Skills.getLevel(Skill.RANGED), lIllIlIIII[147])) {
            bz.putAll(Map.of(Integer.valueOf(lIllIlIIII[178]), Integer.valueOf(C0004e.c(lIllIlIIII[179], lIllIlIIII[180]))));
        }
        bA.putAll(Map.of(Integer.valueOf(lIllIlIIII[16]), Integer.valueOf(C0004e.c(lIllIlIIII[145], lIllIlIIII[146]))));
    }

    private static boolean lIIllIIlIIllI(int i) {
        return i != 0;
    }
}
