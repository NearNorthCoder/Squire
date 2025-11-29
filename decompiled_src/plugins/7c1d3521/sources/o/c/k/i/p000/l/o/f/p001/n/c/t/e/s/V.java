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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.V  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/V.class */
public class V implements InterfaceC0003ac {
    private static /* synthetic */ String[] lllIlIIIII;
    private static /* synthetic */ int[] lllIlIIlII;
    public static /* synthetic */ WorldPoint mg;
    static /* synthetic */ boolean dj;
    static /* synthetic */ int mi;
    public static /* synthetic */ WorldPoint mf;
    public static /* synthetic */ WorldPoint mh;
    static /* synthetic */ int di;
    public static /* synthetic */ WorldPoint de;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint me;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ String[] cE;
    static /* synthetic */ WorldArea mj;

    private static boolean llIIIlIlIIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIlIIllllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIlIIlIlll(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIlIIIII[lllIlIIlII[180]];
    }

    private static boolean llIIIlIIllIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIlIIlII[1];
    }

    private static boolean llIIIlIlIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static int llIIIlIIlIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIlIIllIIl(int i) {
        return i == 0;
    }

    private static void llIIIlIIlIlIl() {
        lllIlIIlII = new int[198];
        lllIlIIlII[0] = " ".length();
        lllIlIIlII[1] = (45 ^ 103) & ((248 ^ 178) ^ (-1));
        lllIlIIlII[2] = (-16419) & 21418;
        lllIlIIlII[3] = "  ".length();
        lllIlIIlII[4] = (42 ^ 117) ^ (70 ^ 29);
        lllIlIIlII[5] = (-(((2 + 27) - (-41)) + 75)) & (-24577) & 32727;
        lllIlIIlII[6] = (-((-19113) & 23465)) & (-545) & 24511;
        lllIlIIlII[7] = (-((-22169) & 30431)) & (-16385) & 25598;
        lllIlIIlII[8] = "   ".length();
        lllIlIIlII[9] = (-27749) & 28021;
        lllIlIIlII[10] = (88 ^ 37) ^ (4 ^ 115);
        lllIlIIlII[11] = (-13997) & 14268;
        lllIlIIlII[12] = (-18561) & 31185;
        lllIlIIlII[13] = (-((-18853) & 19877)) & (-8705) & 10107;
        lllIlIIlII[14] = 86 ^ 83;
        lllIlIIlII[15] = 96 ^ 82;
        lllIlIIlII[16] = 109 ^ 101;
        lllIlIIlII[17] = 21 ^ 19;
        lllIlIIlII[18] = 192 ^ 199;
        lllIlIIlII[19] = (-2694) & 2967;
        lllIlIIlII[20] = 82 ^ 91;
        lllIlIIlII[21] = (-21313) & 24420;
        lllIlIIlII[22] = (-3) & 3359;
        lllIlIIlII[23] = (30 ^ 8) ^ (139 ^ 150);
        lllIlIIlII[24] = 130 ^ 142;
        lllIlIIlII[25] = (87 ^ 65) ^ (112 ^ 107);
        lllIlIIlII[26] = (((140 + 39) - 143) + 135) ^ (((78 + 115) - 37) + 9);
        lllIlIIlII[27] = " ".length() ^ (23 ^ 25);
        lllIlIIlII[28] = (77 ^ 28) ^ (60 ^ 125);
        lllIlIIlII[29] = (125 ^ 97) ^ (165 ^ 168);
        lllIlIIlII[30] = (175 ^ 154) ^ (17 ^ 54);
        lllIlIIlII[31] = 210 ^ 193;
        lllIlIIlII[32] = (84 ^ 22) ^ (119 ^ 33);
        lllIlIIlII[33] = (216 ^ 136) ^ (213 ^ 144);
        lllIlIIlII[34] = (18 ^ 44) ^ (180 ^ 156);
        lllIlIIlII[35] = (((91 + 15) - (-66)) + 41) ^ (((23 + 31) - (-73)) + 67);
        lllIlIIlII[36] = (((18 + 41) - (-3)) + 84) ^ (((78 + 71) - 73) + 62);
        lllIlIIlII[37] = 42 ^ 51;
        lllIlIIlII[38] = 26 ^ 0;
        lllIlIIlII[39] = (((171 + 146) - 277) + 136) ^ (((131 + 170) - 270) + 140);
        lllIlIIlII[40] = (91 ^ 23) ^ (85 ^ 5);
        lllIlIIlII[41] = 86 ^ 75;
        lllIlIIlII[42] = 75 ^ 85;
        lllIlIIlII[43] = (-24833) & 27939;
        lllIlIIlII[44] = (-((-1301) & 14101)) & (-145) & 16311;
        lllIlIIlII[45] = (-12801) & 16166;
        lllIlIIlII[46] = 101 ^ 122;
        lllIlIIlII[47] = (((39 + 144) - 97) + 73) ^ (((147 + 189) - 272) + 127);
        lllIlIIlII[48] = (((18 + 61) - 5) + 66) ^ (((82 + 86) - 51) + 56);
        lllIlIIlII[49] = (((17 + 168) - 97) + 82) ^ (((50 + 44) - 32) + 74);
        lllIlIIlII[50] = 148 ^ 183;
        lllIlIIlII[51] = (((86 + 0) - 80) + 158) ^ (((15 + 99) - 62) + 76);
        lllIlIIlII[52] = 108 ^ 73;
        lllIlIIlII[53] = 49 ^ 23;
        lllIlIIlII[54] = (-21418) & 24507;
        lllIlIIlII[55] = (-((-8977) & 13139)) & (-8869) & 16383;
        lllIlIIlII[56] = (119 ^ 89) ^ (85 ^ 92);
        lllIlIIlII[57] = 58 ^ 18;
        lllIlIIlII[58] = 166 ^ 143;
        lllIlIIlII[59] = 83 ^ 121;
        lllIlIIlII[60] = (59 ^ 102) ^ (51 ^ 69);
        lllIlIIlII[61] = (-((-1793) & 5998)) & (-18817) & 32767;
        lllIlIIlII[62] = (-17361) & 20476;
        lllIlIIlII[63] = (-((-25626) & 28127)) & (-4097) & 16349;
        lllIlIIlII[64] = (-29642) & 32751;
        lllIlIIlII[65] = (-18695) & 28455;
        lllIlIIlII[66] = (-4417) & 14181;
        lllIlIIlII[67] = (-((-16391) & 25063)) & (-20487) & 32255;
        lllIlIIlII[68] = (-((-1601) & 22367)) & (-129) & 23999;
        lllIlIIlII[69] = (-2433) & 12190;
        lllIlIIlII[70] = (-24777) & 27871;
        lllIlIIlII[71] = (-((-8225) & 24949)) & (-2049) & 28535;
        lllIlIIlII[72] = (-8547) & 11646;
        lllIlIIlII[73] = (-" ".length()) & (-6281) & 16025;
        lllIlIIlII[74] = (-18689) & 20476;
        lllIlIIlII[75] = (-6145) & 7935;
        lllIlIIlII[76] = (67 ^ 111) ^ ((180 ^ 186) & ((65 ^ 79) ^ (-1)));
        lllIlIIlII[77] = (97 ^ 119) ^ (161 ^ 154);
        lllIlIIlII[78] = 143 ^ 161;
        lllIlIIlII[79] = (66 ^ 99) ^ (102 ^ 104);
        lllIlIIlII[80] = (-10499) & 12287;
        lllIlIIlII[81] = (91 ^ 104) ^ "   ".length();
        lllIlIIlII[82] = (((49 + 128) - 134) + 92) ^ (((146 + 160) - 220) + 96);
        lllIlIIlII[83] = (170 ^ 179) ^ (55 ^ 29);
        lllIlIIlII[84] = (-18755) & 28511;
        lllIlIIlII[85] = 77 ^ 121;
        lllIlIIlII[86] = (((47 + 85) - 108) + 146) ^ (((54 + 109) - 138) + 134);
        lllIlIIlII[87] = 131 ^ 181;
        lllIlIIlII[88] = 87 ^ 96;
        lllIlIIlII[89] = (((36 + 27) - 32) + 100) ^ (((176 + 135) - 167) + 43);
        lllIlIIlII[90] = 5 ^ 60;
        lllIlIIlII[91] = (-18817) & 28575;
        lllIlIIlII[92] = 172 ^ 150;
        lllIlIIlII[93] = (68 ^ 86) ^ (48 ^ 25);
        lllIlIIlII[94] = (55 ^ 101) ^ (18 ^ 124);
        lllIlIIlII[95] = (((77 + 42) - 11) + 25) ^ (((33 + 25) - (-65)) + 61);
        lllIlIIlII[96] = (212 ^ 151) ^ (88 ^ 37);
        lllIlIIlII[97] = (12 ^ 17) ^ (136 ^ 170);
        lllIlIIlII[98] = (((199 + 27) - 122) + 136) ^ (((147 + 163) - 183) + 49);
        lllIlIIlII[99] = (127 ^ 120) ^ (214 ^ 144);
        lllIlIIlII[100] = ((31 ^ 82) & ((71 ^ 10) ^ (-1))) ^ (63 ^ 125);
        lllIlIIlII[101] = (((94 + 171) - 50) + 23) ^ (((81 + 141) - 166) + 117);
        lllIlIIlII[102] = 104 ^ 44;
        lllIlIIlII[103] = (-((-5400) & 30071)) & (-4097) & 30559;
        lllIlIIlII[104] = (-((-1546) & 18347)) & (-8193) & 28095;
        lllIlIIlII[105] = (((166 + 132) - 215) + 116) ^ (((81 + 44) - 124) + 129);
        lllIlIIlII[106] = 58 ^ 124;
        lllIlIIlII[107] = 36 ^ 99;
        lllIlIIlII[108] = (-4611) & 7711;
        lllIlIIlII[109] = (-((-17517) & 22015)) & (-18501) & 32758;
        lllIlIIlII[110] = 249 ^ 177;
        lllIlIIlII[111] = (((125 + 158) - 106) + 53) ^ (((59 + 123) - 150) + 143);
        lllIlIIlII[112] = 198 ^ 140;
        lllIlIIlII[113] = (-6353) & 16114;
        lllIlIIlII[114] = 90 ^ 17;
        lllIlIIlII[115] = (149 ^ 157) ^ (132 ^ 192);
        lllIlIIlII[116] = (((192 + 108) - 142) + 57) ^ (((34 + 52) - 72) + 140);
        lllIlIIlII[117] = 123 ^ 53;
        lllIlIIlII[118] = 228 ^ 171;
        lllIlIIlII[119] = 207 ^ 159;
        lllIlIIlII[120] = (18 ^ 6) ^ (100 ^ 33);
        lllIlIIlII[121] = (-((-20163) & 32487)) & (-2177) & 16293;
        lllIlIIlII[122] = (123 ^ 41) ^ ((173 ^ 165) & ((26 ^ 18) ^ (-1)));
        lllIlIIlII[123] = (74 ^ 58) ^ (167 ^ 132);
        lllIlIIlII[124] = (112 ^ 95) ^ (15 ^ 116);
        lllIlIIlII[125] = 68 ^ 17;
        lllIlIIlII[126] = (-18433) & 20222;
        lllIlIIlII[127] = (-29633) & 32731;
        lllIlIIlII[128] = (216 ^ 154) ^ (149 ^ 129);
        lllIlIIlII[129] = 77 ^ 26;
        lllIlIIlII[130] = 240 ^ 168;
        lllIlIIlII[131] = (-((-2141) & 31583)) & (-6) & 32551;
        lllIlIIlII[132] = (27 ^ 110) ^ (232 ^ 196);
        lllIlIIlII[133] = (((198 + 229) - 250) + 77) ^ (((41 + 72) - 97) + 148);
        lllIlIIlII[134] = 48 ^ 107;
        lllIlIIlII[135] = (50 ^ 115) ^ (189 ^ 160);
        lllIlIIlII[136] = (160 ^ 128) ^ (26 ^ 103);
        lllIlIIlII[137] = (((182 + 40) - 23) + 11) ^ (((92 + 75) - 67) + 40);
        lllIlIIlII[138] = (-8538) & 11643;
        lllIlIIlII[139] = (27 ^ 126) ^ (32 ^ 26);
        lllIlIIlII[140] = (((191 + 26) - 176) + 152) ^ (((75 + 96) - 77) + 67);
        lllIlIIlII[141] = (48 ^ 87) ^ (8 ^ 14);
        lllIlIIlII[142] = (198 ^ 186) ^ (77 ^ 83);
        lllIlIIlII[143] = 12 ^ 111;
        lllIlIIlII[144] = 96 ^ 4;
        lllIlIIlII[145] = 65 ^ 36;
        lllIlIIlII[146] = (138 ^ 197) ^ (42 ^ 3);
        lllIlIIlII[147] = 118 ^ 17;
        lllIlIIlII[148] = 0 ^ 104;
        lllIlIIlII[149] = 195 ^ 170;
        lllIlIIlII[150] = 87 ^ 61;
        lllIlIIlII[151] = 169 ^ 194;
        lllIlIIlII[152] = (-4553) & 14316;
        lllIlIIlII[153] = 40 ^ 68;
        lllIlIIlII[154] = 239 ^ 130;
        lllIlIIlII[155] = 104 ^ 6;
        lllIlIIlII[156] = (4 ^ 103) ^ (58 ^ 54);
        lllIlIIlII[157] = (((214 ^ 153) + (((48 + 61) - (-10)) + 8)) - (((83 + 90) - 107) + 93)) + (9 ^ 107);
        lllIlIIlII[158] = 56 ^ 72;
        lllIlIIlII[159] = ((15 + 49) - (-46)) + 31;
        lllIlIIlII[160] = (31 ^ 3) ^ (93 ^ 48);
        lllIlIIlII[161] = (-(91 ^ 114)) & (-24705) & 27833;
        lllIlIIlII[162] = (-((-2899) & 23543)) & (-65) & 30461;
        lllIlIIlII[163] = (221 ^ 165) ^ (74 ^ 64);
        lllIlIIlII[164] = " ".length() ^ (47 ^ 93);
        lllIlIIlII[165] = 63 ^ 75;
        lllIlIIlII[166] = 241 ^ 132;
        lllIlIIlII[167] = 98 ^ 20;
        lllIlIIlII[168] = (43 ^ 16) ^ (239 ^ 163);
        lllIlIIlII[169] = (4 ^ 21) ^ (234 ^ 131);
        lllIlIIlII[170] = (219 ^ 133) ^ (1 ^ 38);
        lllIlIIlII[171] = 242 ^ 136;
        lllIlIIlII[172] = (14 ^ 117) ^ ((67 ^ 85) & ((215 ^ 193) ^ (-1)));
        lllIlIIlII[173] = (13 ^ 112) ^ " ".length();
        lllIlIIlII[174] = (114 ^ 62) ^ (247 ^ 198);
        lllIlIIlII[175] = (-((-19459) & 23747)) & (-18740) & 32247;
        lllIlIIlII[176] = (-((-7625) & 24057)) & (-2) & 28413;
        lllIlIIlII[177] = (-4676) & 29675;
        lllIlIIlII[178] = (-12948) & 13247;
        lllIlIIlII[179] = (-((-2451) & 15318)) & (-18561) & 32727;
        lllIlIIlII[180] = 24 ^ 102;
        lllIlIIlII[181] = ((29 + 100) - 61) + 59;
        lllIlIIlII[182] = (((11 ^ 100) + (137 ^ 143)) - (47 ^ 78)) + (232 ^ 132);
        lllIlIIlII[183] = ((18 + 48) - 34) + 97;
        lllIlIIlII[184] = (-((-19873) & 32755)) & (-129) & 16375;
        lllIlIIlII[185] = ((6 + 22) - (-102)) + 0;
        lllIlIIlII[186] = ((116 + 23) - 127) + 119;
        lllIlIIlII[187] = (-20715) & 24043;
        lllIlIIlII[188] = (-((-16651) & 29659)) & (-257) & 16351;
        lllIlIIlII[189] = (-((-17514) & 26363)) & (-69) & 12277;
        lllIlIIlII[190] = (-12497) & 15832;
        lllIlIIlII[191] = (-((-437) & 25077)) & (-4106) & 31839;
        lllIlIIlII[192] = (-8193) & 11551;
        lllIlIIlII[193] = ((39 + 82) - 118) + 129;
        lllIlIIlII[194] = (((246 ^ 159) + (75 ^ 33)) - (203 ^ 174)) + (23 ^ 0);
        lllIlIIlII[195] = ((45 + 82) - 27) + 34;
        lllIlIIlII[196] = (-((-1045) & 24053)) & (-1) & 32751;
        lllIlIIlII[197] = ((7 + 117) - 89) + 100;
    }

    private static boolean llIIIlIIlllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIlIlIIIIl(Object obj) {
        return obj == null;
    }

    private static void llIIIlIIIIIll() {
        lllIlIIIII = new String[lllIlIIlII[197]];
        lllIlIIIII[lllIlIIlII[1]] = llIIIIlllIllI("Kk7HLhhrO2yY8V2TAg1HWnr26suxuxE3Mp/pArUqbmK5YNSDkn2TB/jR7gQIo2ee", "vzvEb");
        lllIlIIIII[lllIlIIlII[0]] = llIIIIlllIlll("JzQYTzMGdQwOKQI=", "iUnoG");
        lllIlIIIII[lllIlIIlII[3]] = llIIIIlllIllI("1X7xXqIV3gljWfgFH06dRgZfGAFU+EJi", "UlDKr");
        lllIlIIIII[lllIlIIlII[8]] = llIIIIlllIlll("JwF5LT0VRDQlPAMNNytvARE8PztQFyw8PxwNPD9jUBcuJTsTDDAiKFAQNmwNJT0QAgg=", "pdYLO");
        lllIlIIIII[lllIlIIlII[4]] = llIIIIlllIllI("46hmpXzJ+VE=", "VLzmo");
        lllIlIIIII[lllIlIIlII[14]] = llIIIIlllIlll("EggT", "Wigik");
        lllIlIIIII[lllIlIIlII[17]] = llIIIIlllIllI("+1OjC2Oi497lM1bTcjgqzg==", "bpqNR");
        lllIlIIIII[lllIlIIlII[18]] = llIIIIlllIlll("BDEAKwd3NBQ8ACM=", "WEaYs");
        lllIlIIIII[lllIlIIlII[16]] = llIIIIllllIII("S6gPvqoeXblV7n0HWgdzDA==", "QdbAg");
        lllIlIIIII[lllIlIIlII[20]] = llIIIIlllIlll("Ij8I", "iZqou");
        lllIlIIIII[lllIlIIlII[10]] = llIIIIlllIllI("4C2yWkEx2qcYcl2sKl5PsqkSil3VNLNW", "mBNnr");
        lllIlIIIII[lllIlIIlII[23]] = llIIIIlllIllI("9pywukmvMs6/NBgpgPQ18EAQue1q96QQ", "GPEmz");
        lllIlIIIII[lllIlIIlII[24]] = llIIIIlllIllI("gmFaHMWLumGYSCvhIMM9xQ==", "jjZXF");
        lllIlIIIII[lllIlIIlII[25]] = llIIIIlllIlll("DQgMMw==", "YigVg");
        lllIlIIIII[lllIlIIlII[26]] = llIIIIllllIII("pleiPIF5GKYqNWrpgMhg9OTlmqRRY75b", "AspEV");
        lllIlIIIII[lllIlIIlII[27]] = llIIIIlllIllI("lxgfPWVJJCs=", "oTwvK");
        lllIlIIIII[lllIlIIlII[28]] = llIIIIlllIllI("h/jh37ukbKDNk85FOHY99w==", "zFmnz");
        lllIlIIIII[lllIlIIlII[29]] = llIIIIllllIII("iSx+tW3x9EY=", "nfjZj");
        lllIlIIIII[lllIlIIlII[30]] = llIIIIllllIII("AE4jKhZHDZFCxm9Wy6ft3Q==", "vmjdU");
        lllIlIIIII[lllIlIIlII[31]] = llIIIIllllIII("JkD7UDlwWmk=", "TrqSa");
        lllIlIIIII[lllIlIIlII[32]] = llIIIIlllIllI("yrRjS35T3jA=", "Bfaah");
        lllIlIIIII[lllIlIIlII[33]] = llIIIIlllIlll("DDIhSBstczEHGiwnNgEB", "BSWho");
        lllIlIIIII[lllIlIIlII[34]] = llIIIIlllIllI("N6/8YJrMgL40d0XPPEa90Q==", "IvcDm");
        lllIlIIIII[lllIlIIlII[35]] = llIIIIlllIlll("DjUI", "EPqUJ");
        lllIlIIIII[lllIlIIlII[36]] = llIIIIlllIlll("OwEcMiAeARxhNAoGHiQ=", "ksyAS");
        lllIlIIIII[lllIlIIlII[37]] = llIIIIlllIlll("DhEyPSonE2YuNigTIw==", "ItFIC");
        lllIlIIIII[lllIlIIlII[38]] = llIIIIllllIII("JlFZ92Xzhi35+9tNbIv1Qw==", "XqRSL");
        lllIlIIIII[lllIlIIlII[39]] = llIIIIllllIII("uPrwf+0PvEM=", "ptmbq");
        lllIlIIIII[lllIlIIlII[40]] = llIIIIlllIllI("VBe3WeHGrPE=", "Imegy");
        lllIlIIIII[lllIlIIlII[41]] = llIIIIlllIllI("6yZHh8bzCHdLw0Fty1BtXA==", "KqvgP");
        lllIlIIIII[lllIlIIlII[42]] = llIIIIllllIII("afFMC2YS5ErSTO7kK8M6cA==", "aoWuW");
        lllIlIIIII[lllIlIIlII[46]] = llIIIIlllIllI("1IoMBsqYHv/pdLTdZzBc1g==", "ymCsC");
        lllIlIIIII[lllIlIIlII[47]] = llIIIIllllIII("SluIFmwsDb4=", "vhnmU");
        lllIlIIIII[lllIlIIlII[48]] = llIIIIllllIII("JWf9sGIFmsM=", "rbCdX");
        lllIlIIIII[lllIlIIlII[49]] = llIIIIllllIII("lInbOuavrI61hHUO+w8K4Q==", "XbcGP");
        lllIlIIIII[lllIlIIlII[50]] = llIIIIllllIII("BVhBVPpQtCNniXAepDSiyg==", "RNSCF");
        lllIlIIIII[lllIlIIlII[51]] = llIIIIlllIlll("HzQPLA==", "KUdIi");
        lllIlIIIII[lllIlIIlII[52]] = llIIIIlllIlll("ARcVLSchQgM6IDY=", "SbwOB");
        lllIlIIIII[lllIlIIlII[53]] = llIIIIllllIII("W6le26wQ+OY=", "Qxiid");
        lllIlIIIII[lllIlIIlII[56]] = llIIIIllllIII("jopySDmPta0=", "uLcFK");
        lllIlIIIII[lllIlIIlII[57]] = llIIIIlllIllI("rf4OviL5qQM=", "RnSSU");
        lllIlIIIII[lllIlIIlII[58]] = llIIIIlllIllI("BxENocuZk/GPeQfk5zxMHNqBApcXNS/h", "wEzZC");
        lllIlIIIII[lllIlIIlII[59]] = llIIIIllllIII("iiFWpVu8j+8=", "DFSXF");
        lllIlIIIII[lllIlIIlII[60]] = llIIIIlllIlll("DB8tIzhiFys5NA==", "OsDNZ");
        lllIlIIIII[lllIlIIlII[76]] = llIIIIllllIII("SdNFh7HQZPHZdT/GqC1GUg==", "YjPKI");
        lllIlIIIII[lllIlIIlII[77]] = llIIIIlllIlll("Aw01ImM/HS8rMQ==", "SxYNC");
        lllIlIIIII[lllIlIIlII[78]] = llIIIIlllIlll("ABwXKjxsOA==", "LyaON");
        lllIlIIIII[lllIlIIlII[79]] = llIIIIlllIlll("KhECGA==", "zdntE");
        lllIlIIIII[lllIlIIlII[81]] = llIIIIlllIllI("m8mMbFUdGyEwT/bg2ldnHA==", "pCYQg");
        lllIlIIIII[lllIlIIlII[82]] = llIIIIllllIII("CiMSW9zHkiG0+RyQW+mzAQ==", "pRgDa");
        lllIlIIIII[lllIlIIlII[15]] = llIIIIlllIllI("PqwPzbIQp7k=", "VStxr");
        lllIlIIIII[lllIlIIlII[83]] = llIIIIlllIlll("FjstLQ==", "FNAAq");
        lllIlIIIII[lllIlIIlII[85]] = llIIIIlllIlll("HggcTwE/SQ4=", "Pijou");
        lllIlIIIII[lllIlIIlII[86]] = llIIIIlllIllI("mvMTt0oEKdw=", "hWVvV");
        lllIlIIIII[lllIlIIlII[87]] = llIIIIllllIII("ktu1hZr8aZM=", "piTyJ");
        lllIlIIIII[lllIlIIlII[88]] = llIIIIlllIlll("FhopK0UqCjMiFw==", "FoEGe");
        lllIlIIIII[lllIlIIlII[89]] = llIIIIlllIlll("HxAcPChzMQ==", "SujYZ");
        lllIlIIIII[lllIlIIlII[90]] = llIIIIllllIII("nYAHVLZPPkc=", "AEdTC");
        lllIlIIIII[lllIlIIlII[92]] = llIIIIlllIlll("OxsSJGICG0QlLRkG", "vtdAB");
        lllIlIIIII[lllIlIIlII[93]] = llIIIIlllIlll("EQUcGQ==", "UjskV");
        lllIlIIIII[lllIlIIlII[94]] = llIIIIlllIlll("FykTKQ==", "XYvGg");
        lllIlIIIII[lllIlIIlII[95]] = llIIIIlllIlll("LQw+QToMTSo=", "cmHaN");
        lllIlIIIII[lllIlIIlII[96]] = llIIIIlllIlll("EjYuOU0uJjQwHw==", "BCBUm");
        lllIlIIIII[lllIlIIlII[97]] = llIIIIlllIlll("Gj8hFxh2GA==", "VZWrj");
        lllIlIIIII[lllIlIIlII[98]] = llIIIIllllIII("EkSMm447y8E=", "yMvVe");
        lllIlIIIII[lllIlIIlII[99]] = llIIIIlllIllI("3jiXGl7oBO2oiQumBlXZ4g==", "nwVXS");
        lllIlIIIII[lllIlIIlII[100]] = llIIIIllllIII("5ePZqzvqPumW+gq0KEuqsA==", "vbGEq");
        lllIlIIIII[lllIlIIlII[101]] = llIIIIlllIllI("FuQNv0yBha0=", "owFib");
        lllIlIIIII[lllIlIIlII[102]] = llIIIIllllIII("DNnEGCNF2o4=", "EFYBL");
        lllIlIIIII[lllIlIIlII[105]] = llIIIIlllIlll("ADsiCEE5O3QJDiIm", "MTTma");
        lllIlIIIII[lllIlIIlII[106]] = llIIIIlllIlll("MiEaCg==", "vNuxe");
        lllIlIIIII[lllIlIIlII[107]] = llIIIIllllIII("qbMhHDvcBok=", "ZddcC");
        lllIlIIIII[lllIlIIlII[110]] = llIIIIlllIllI("BFrSGEinkYeXpdoYbs9/gQ==", "cOTxD");
        lllIlIIIII[lllIlIIlII[111]] = llIIIIlllIlll("DwcpMQ==", "KhFCm");
        lllIlIIIII[lllIlIIlII[112]] = llIIIIlllIllI("XxmsCYFdGNU=", "YfSvV");
        lllIlIIIII[lllIlIIlII[114]] = llIIIIllllIII("GTxKPmxnnpqai9cQdukzig==", "xfqVM");
        lllIlIIIII[lllIlIIlII[115]] = llIIIIllllIII("ZSHeEvrTDQY=", "tlBVp");
        lllIlIIIII[lllIlIIlII[116]] = llIIIIlllIlll("IDUGBQ==", "oEckE");
        lllIlIIIII[lllIlIIlII[117]] = llIIIIlllIllI("4gIkhyeyBafIivpTSvxUjg==", "LRgrd");
        lllIlIIIII[lllIlIIlII[118]] = llIIIIllllIII("3wn2B3QDfEunkz7WvBsV+w==", "VmWoJ");
        lllIlIIIII[lllIlIIlII[119]] = llIIIIlllIlll("CBUVJhdkNQ==", "DpcCe");
        lllIlIIIII[lllIlIIlII[120]] = llIIIIllllIII("l95mXcnVRmQ=", "PrEIi");
        lllIlIIIII[lllIlIIlII[122]] = llIIIIlllIlll("FgY3cxw3Ryc=", "XgASh");
        lllIlIIIII[lllIlIIlII[123]] = llIIIIlllIlll("PQAKDkwBEBAHHg==", "mufbl");
        lllIlIIIII[lllIlIIlII[124]] = llIIIIlllIllI("/qsTtt71hn4=", "bPVJC");
        lllIlIIIII[lllIlIIlII[125]] = llIIIIlllIlll("CjkWLw==", "ZLzCS");
        lllIlIIIII[lllIlIIlII[128]] = llIIIIlllIlll("IzcwP28aN2Y+IAEq", "nXFZO");
        lllIlIIIII[lllIlIIlII[129]] = llIIIIlllIllI("qxcKDfGXzco=", "YJyea");
        lllIlIIIII[lllIlIIlII[130]] = llIIIIlllIlll("PxkKFg==", "pioxT");
        lllIlIIIII[lllIlIIlII[132]] = llIIIIllllIII("sVuw0dJcDLu8yTo/Z2flHQ==", "LnnNi");
        lllIlIIIII[lllIlIIlII[133]] = llIIIIlllIlll("Fh4FAw==", "Rqjqt");
        lllIlIIIII[lllIlIIlII[134]] = llIIIIllllIII("vdJlu4xylNw=", "HILzT");
        lllIlIIIII[lllIlIIlII[135]] = llIIIIllllIII("HZs5AkEzWNfhGBluuYL2gQ==", "sUhUi");
        lllIlIIIII[lllIlIIlII[136]] = llIIIIlllIlll("LR0BLBtBOw==", "axwIi");
        lllIlIIIII[lllIlIIlII[137]] = llIIIIlllIlll("IB4nGw==", "pkKwf");
        lllIlIIIII[lllIlIIlII[139]] = llIIIIlllIllI("DvK3mH1SLPodQersarWmtA==", "QBvvf");
        lllIlIIIII[lllIlIIlII[140]] = llIIIIllllIII("PADOWjSpEgc=", "fTQpm");
        lllIlIIIII[lllIlIIlII[141]] = llIIIIllllIII("FfGF83imIIA=", "QOVcz");
        lllIlIIIII[lllIlIIlII[142]] = llIIIIlllIlll("Nx0TN0cOHUU2CBUA", "zreRg");
        lllIlIIIII[lllIlIIlII[143]] = llIIIIlllIlll("NyIhMw==", "sMNAu");
        lllIlIIIII[lllIlIIlII[144]] = llIIIIlllIllI("GQh4bwlLQdk=", "qNEzq");
        lllIlIIIII[lllIlIIlII[145]] = llIIIIlllIlll("KBcPbj8JVhw=", "fvyNK");
        lllIlIIIII[lllIlIIlII[146]] = llIIIIlllIlll("CBkWOlg0CQwzCg==", "XlzVx");
        lllIlIIIII[lllIlIIlII[147]] = llIIIIlllIllI("NVUQp6dUiDs=", "mnvEV");
        lllIlIIIII[lllIlIIlII[148]] = llIIIIllllIII("ONmFeuj72V0=", "GyRDa");
        lllIlIIIII[lllIlIIlII[149]] = llIIIIllllIII("b5CqaYHtDB5g8sE2qid90g==", "FxlCj");
        lllIlIIIII[lllIlIIlII[150]] = llIIIIlllIlll("Ah04Fw==", "FrWeD");
        lllIlIIIII[lllIlIIlII[151]] = llIIIIllllIII("0QrO0HLfTm4=", "nDQYp");
        lllIlIIIII[lllIlIIlII[153]] = llIIIIlllIllI("+Ea22PVcO+UTc0S4sJ7oKA==", "nQFWr");
        lllIlIIIII[lllIlIIlII[154]] = llIIIIlllIlll("ExwtNQ==", "WsBGA");
        lllIlIIIII[lllIlIIlII[155]] = llIIIIlllIlll("KR4MIA==", "fniNv");
        lllIlIIIII[lllIlIIlII[156]] = llIIIIllllIII("YenrSxmPIa3KuobC/rxDug==", "vxgDv");
        lllIlIIIII[lllIlIIlII[158]] = llIIIIlllIllI("Qglc+wP9qaY=", "IsuTB");
        lllIlIIIII[lllIlIIlII[160]] = llIIIIlllIllI("tNDjBobOl0o=", "BudAY");
        lllIlIIIII[lllIlIIlII[163]] = llIIIIlllIllI("/gbMi0l7qeA=", "CJHNN");
        lllIlIIIII[lllIlIIlII[164]] = llIIIIlllIllI("8i83WPbKvrk=", "vTwGz");
        lllIlIIIII[lllIlIIlII[165]] = llIIIIllllIII("tPM9Y5hm/8I=", "rrnoc");
        lllIlIIIII[lllIlIIlII[166]] = llIIIIllllIII("82n9B1Jd2MDk8vyr82Wkpw==", "KDGaB");
        lllIlIIIII[lllIlIIlII[167]] = llIIIIlllIllI("ZmQ3M/Kx9LI=", "kxssU");
        lllIlIIIII[lllIlIIlII[168]] = llIIIIllllIII("UmxK+HgMwxc=", "sBOqC");
        lllIlIIIII[lllIlIIlII[169]] = llIIIIlllIllI("4aHoDXRCQrIBft6G1c5xaTXGYbLdNAeX", "NjnZm");
        lllIlIIIII[lllIlIIlII[170]] = llIIIIlllIlll("BiYPAg==", "IVjlG");
        lllIlIIIII[lllIlIIlII[171]] = llIIIIlllIllI("1DGi66CRCFg1O/lHO59thnwHRpitpcay", "orgAU");
        lllIlIIIII[lllIlIIlII[172]] = llIIIIlllIlll("OiY5TiQbZz8cPxIiPB0/Bg==", "tGOnP");
        lllIlIIIII[lllIlIIlII[173]] = llIIIIllllIII("QYW60qAk6A8=", "lZCdW");
        lllIlIIIII[lllIlIIlII[174]] = llIIIIlllIllI("8BBSWFxh/1xp/UHEtYUEt2bZ1ZmWxkAE", "jZqOY");
        lllIlIIIII[lllIlIIlII[180]] = llIIIIlllIlll("LiQjJAkfdjkpH0sVJSgZADMj", "kVMAz");
        lllIlIIIII[lllIlIIlII[181]] = llIIIIlllIlll("HwUZBkkCClcWDAwAAwlJRQ==", "mlwai");
        lllIlIIIII[lllIlIIlII[182]] = llIIIIlllIllI("nUn2SlCxNpY=", "Mivwm");
        lllIlIIIII[lllIlIIlII[183]] = llIIIIllllIII("7hM/rstVw/8=", "CLsIy");
        lllIlIIIII[lllIlIIlII[185]] = llIIIIlllIlll("DC0mAg==", "HBIpq");
        lllIlIIIII[lllIlIIlII[186]] = llIIIIllllIII("/WeHll1vzwU=", "UgWhs");
        lllIlIIIII[lllIlIIlII[193]] = llIIIIllllIII("C++HQlsarFg=", "TArfz");
        lllIlIIIII[lllIlIIlII[194]] = llIIIIllllIII("DgRj2vEME4xwHaTWleDRBpvfo8ChjkTwkAvG9OFPXU4a6Z/mR4lMQw==", "JPida");
        lllIlIIIII[lllIlIIlII[195]] = llIIIIllllIII("DZYM8sk76CDu67tIA2xKBGos/XulK0E1QD2qzSsjMY4g1K0bLLTaXi+9+wlGJMiFV9vq3xk/pQP7JWQBeM4hDw==", "JPepB");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0520, code lost:
        if (llIIIlIIlIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L399;
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
    public static void dL() {
        if (llIIIlIIlIlll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (llIIIlIIllIII(bv.size(), lllIlIIlII[0])) {
                System.out.println(lllIlIIIII[lllIlIIlII[1]]);
                bt = lllIlIIlII[1];
            }
        }
        if (llIIIlIIllIIl(bt ? 1 : 0)) {
            if (llIIIlIIllIIl(an() ? 1 : 0) && llIIIlIIllIII(C0018e.j(mi), lllIlIIlII[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIlIIllIlI(nearest) && llIIIlIIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[0]];
                    C0000a.a(nearest);
                }
                if (llIIIlIIllIlI(nearest) && llIIIlIIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIlIIllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlIIlII[2]);
                        "".length();
                    }
                    if (llIIIlIIlIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[3]];
                        if (llIIIlIIllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlIIlII[4]);
                            "".length();
                        }
                        if (llIIIlIIllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIlIIlII[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllIlIIlII[4]];
                        iArr[lllIlIIlII[1]] = lllIlIIlII[5];
                        iArr[lllIlIIlII[0]] = lllIlIIlII[6];
                        iArr[lllIlIIlII[3]] = lllIlIIlII[7];
                        iArr[lllIlIIlII[8]] = lllIlIIlII[9];
                        if (llIIIlIIllIIl(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIlIIIII[lllIlIIlII[8]]);
                            bt = lllIlIIlII[0];
                            return;
                        }
                        int[] iArr2 = new int[lllIlIIlII[4]];
                        iArr2[lllIlIIlII[1]] = lllIlIIlII[5];
                        iArr2[lllIlIIlII[0]] = lllIlIIlII[6];
                        iArr2[lllIlIIlII[3]] = lllIlIIlII[7];
                        iArr2[lllIlIIlII[8]] = lllIlIIlII[9];
                        if (llIIIlIIlIlll(C0018e.c(iArr2) ? 1 : 0)) {
                            C0000a.a(lllIlIIlII[5], lllIlIIlII[10]);
                            C0000a.a(lllIlIIlII[6], lllIlIIlII[10]);
                            C0000a.a(lllIlIIlII[7], lllIlIIlII[0]);
                            C0000a.a(lllIlIIlII[11], lllIlIIlII[0]);
                            C0000a.a(lllIlIIlII[9], lllIlIIlII[0]);
                            C0000a.a(lllIlIIlII[12], lllIlIIlII[0]);
                            C0000a.a(lllIlIIlII[13], lllIlIIlII[14]);
                        }
                    }
                }
            }
            if (llIIIlIIlIlll(Inventory.contains(C0019f.ba) ? 1 : 0) && llIIIlIIllIII(Movement.getRunEnergy(), lllIlIIlII[15])) {
                Inventory.getFirst(C0019f.ba).interact(lllIlIIIII[lllIlIIlII[4]]);
                Time.sleepTicks(lllIlIIlII[0]);
                "".length();
            }
            int[] iArr3 = new int[lllIlIIlII[0]];
            iArr3[lllIlIIlII[1]] = lllIlIIlII[13];
            if (llIIIlIIlIlll(Inventory.contains(iArr3) ? 1 : 0) && llIIIlIIlllII(llIIIlIIlIllI(C0018e.w(), 50.0d))) {
                int[] iArr4 = new int[lllIlIIlII[0]];
                iArr4[lllIlIIlII[1]] = lllIlIIlII[13];
                Inventory.getFirst(iArr4).interact(lllIlIIIII[lllIlIIlII[14]]);
                Time.sleepTicks(lllIlIIlII[3]);
                "".length();
            }
            if (llIIIlIIlIlll(an() ? 1 : 0) && llIIIlIIllIIl(C0018e.j(mi))) {
                if (llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlII[16])) {
                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[17]];
                    Movement.walkTo(de);
                    "".length();
                    Time.sleepTicks(lllIlIIlII[0]);
                    "".length();
                }
                if (llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlII[16])) {
                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[18]];
                    if (llIIIlIIlIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0020g.a(lllIlIIIII[lllIlIIlII[16]], cE);
                }
            }
            if (llIIIlIIlllll(C0018e.j(mi), lllIlIIlII[0])) {
                di = lllIlIIlII[1];
                int[] iArr5 = new int[lllIlIIlII[0]];
                iArr5[lllIlIIlII[1]] = lllIlIIlII[11];
                if (llIIIlIIllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIlIIlII[0]];
                    iArr6[lllIlIIlII[1]] = lllIlIIlII[19];
                    if (llIIIlIIllIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr = new String[lllIlIIlII[0]];
                        strArr[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[20]];
                        if (llIIIlIIllIIl(Inventory.contains(strArr) ? 1 : 0)) {
                            WorldPoint worldPoint = new WorldPoint(lllIlIIlII[21], lllIlIIlII[22], lllIlIIlII[0]);
                            int[] iArr7 = new int[lllIlIIlII[0]];
                            iArr7[lllIlIIlII[1]] = lllIlIIlII[11];
                            if (llIIIlIIllIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                                if (llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIlIIlII[14])) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[10]];
                                    Movement.walkTo(worldPoint);
                                    "".length();
                                    Time.sleepTicks(lllIlIIlII[0]);
                                    "".length();
                                }
                                if (llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIlIIlII[14])) {
                                    int[] iArr8 = new int[lllIlIIlII[0]];
                                    iArr8[lllIlIIlII[1]] = lllIlIIlII[11];
                                    TileItem nearest2 = TileItems.getNearest(iArr8);
                                    if (llIIIlIIllIlI(nearest2)) {
                                        if (llIIIlIIllIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[23]];
                                            Movement.walkTo(nearest2.getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lllIlIIlII[0]);
                                            "".length();
                                        }
                                        if (llIIIlIIlIlll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[24]];
                                            nearest2.interact(lllIlIIIII[lllIlIIlII[25]]);
                                            Time.sleepTicks(lllIlIIlII[8]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lllIlIIlII[0]];
                iArr9[lllIlIIlII[1]] = lllIlIIlII[11];
                if (llIIIlIIllIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIlIIlII[0]];
                    iArr10[lllIlIIlII[1]] = lllIlIIlII[19];
                }
                int[] iArr11 = new int[lllIlIIlII[0]];
                iArr11[lllIlIIlII[1]] = lllIlIIlII[19];
                if (llIIIlIIllIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIlIIlII[0]];
                    iArr12[lllIlIIlII[1]] = lllIlIIlII[11];
                    if (llIIIlIIlIlll(Inventory.contains(iArr12) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[26]];
                        int[] iArr13 = new int[lllIlIIlII[0]];
                        iArr13[lllIlIIlII[1]] = lllIlIIlII[11];
                        Item first = Inventory.getFirst(iArr13);
                        int[] iArr14 = new int[lllIlIIlII[0]];
                        iArr14[lllIlIIlII[1]] = lllIlIIlII[9];
                        first.useOn(Inventory.getFirst(iArr14));
                        Time.sleepTicks(lllIlIIlII[0]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[lllIlIIlII[0]];
                iArr15[lllIlIIlII[1]] = lllIlIIlII[19];
                if (llIIIlIIlIlll(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIlIIlII[0]];
                    strArr2[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[27]];
                    if (llIIIlIIllIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(me), lllIlIIlII[4])) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[28]];
                            Movement.walkTo(me);
                            "".length();
                            Time.sleepTicks(lllIlIIlII[0]);
                            "".length();
                        }
                        if (llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(me), lllIlIIlII[4])) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[29]];
                            String[] strArr3 = new String[lllIlIIlII[0]];
                            strArr3[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[30]];
                            TileObjects.getNearest(strArr3).interact(lllIlIIIII[lllIlIIlII[31]]);
                            Time.sleepTicks(lllIlIIlII[20]);
                            "".length();
                        }
                    }
                    String[] strArr4 = new String[lllIlIIlII[0]];
                    strArr4[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[32]];
                    if (llIIIlIIlIlll(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(mf), lllIlIIlII[8])) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[33]];
                            Movement.walkTo(mf);
                            "".length();
                            Time.sleepTicks(lllIlIIlII[0]);
                            "".length();
                        }
                        if (llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(mf), lllIlIIlII[8])) {
                            int[] iArr16 = new int[lllIlIIlII[0]];
                            iArr16[lllIlIIlII[1]] = lllIlIIlII[19];
                            Item first2 = Inventory.getFirst(iArr16);
                            String[] strArr5 = new String[lllIlIIlII[0]];
                            strArr5[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[34]];
                            first2.useOn(TileObjects.getNearest(strArr5));
                            Time.sleepTicks(lllIlIIlII[0]);
                            "".length();
                        }
                    }
                }
                String[] strArr6 = new String[lllIlIIlII[0]];
                strArr6[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[35]];
                if (llIIIlIIlIlll(Inventory.contains(strArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lllIlIIlII[0]];
                    iArr17[lllIlIIlII[1]] = lllIlIIlII[19];
                    if (llIIIlIIllIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                        String[] strArr7 = new String[lllIlIIlII[0]];
                        strArr7[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[36]];
                        if (llIIIlIIllIIl(Inventory.contains(strArr7) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[37]];
                            if (llIIIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr8 = new String[lllIlIIlII[0]];
                                strArr8[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[38]];
                                TileObjects.getNearest(strArr8).interact(lllIlIIIII[lllIlIIlII[39]]);
                                Time.sleepTicks(lllIlIIlII[4]);
                                "".length();
                            }
                            C0020g.a(cE);
                        }
                    }
                }
                String[] strArr9 = new String[lllIlIIlII[0]];
                strArr9[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[40]];
                if (llIIIlIIlIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lllIlIIlII[0]];
                    strArr10[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[41]];
                    if (llIIIlIIlIlll(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lllIlIIlII[0]];
                        strArr11[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[42]];
                        if (llIIIlIIllIIl(Inventory.contains(strArr11) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lllIlIIlII[43], lllIlIIlII[44], lllIlIIlII[1]);
                            WorldPoint worldPoint3 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[44], lllIlIIlII[1]);
                            WorldArea worldArea = new WorldArea(lllIlIIlII[21], lllIlIIlII[45], lllIlIIlII[14], lllIlIIlII[8], lllIlIIlII[1]);
                            if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && llIIIlIIllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[46]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lllIlIIlII[0]);
                                "".length();
                            }
                            if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                String[] strArr12 = new String[lllIlIIlII[0]];
                                strArr12[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[47]];
                                TileObjects.getNearest(strArr12).interact(lllIlIIIII[lllIlIIlII[48]]);
                                Time.sleepTicks(lllIlIIlII[3]);
                                "".length();
                            }
                            if (llIIIlIIlIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[49]];
                                String[] strArr13 = new String[lllIlIIlII[0]];
                                strArr13[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[50]];
                                TileItems.getNearest(strArr13).interact(lllIlIIIII[lllIlIIlII[51]]);
                                Time.sleepTicks(lllIlIIlII[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr14 = new String[lllIlIIlII[0]];
                strArr14[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[52]];
                if (llIIIlIIlIlll(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lllIlIIlII[0]];
                    strArr15[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[53]];
                    if (llIIIlIIllIIl(Inventory.contains(strArr15) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lllIlIIlII[21], lllIlIIlII[45], lllIlIIlII[14], lllIlIIlII[8], lllIlIIlII[1]);
                        WorldArea worldArea3 = new WorldArea(lllIlIIlII[54], lllIlIIlII[55], lllIlIIlII[18], lllIlIIlII[23], lllIlIIlII[1]);
                        if (llIIIlIIlIlll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[lllIlIIlII[0]];
                            strArr16[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[56]];
                            TileObjects.getNearest(strArr16).interact(lllIlIIIII[lllIlIIlII[57]]);
                            Time.sleepTicks(lllIlIIlII[3]);
                            "".length();
                        }
                        if (llIIIlIIllIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIllIIl(mj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[58]];
                            Movement.walkTo(mg);
                            "".length();
                            Time.sleepTicks(lllIlIIlII[0]);
                            "".length();
                        }
                        if (llIIIlIIlIlll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr17 = new String[lllIlIIlII[0]];
                            strArr17[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[59]];
                            TileObjects.getNearest(strArr17).interact(lllIlIIIII[lllIlIIlII[60]]);
                            Time.sleepTicks(lllIlIIlII[4]);
                            "".length();
                        }
                        if (llIIIlIIlIlll(mj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint4 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[61], lllIlIIlII[1]);
                            WorldPoint worldPoint5 = new WorldPoint(lllIlIIlII[62], lllIlIIlII[63], lllIlIIlII[1]);
                            new WorldPoint(lllIlIIlII[64], lllIlIIlII[65], lllIlIIlII[1]);
                            new WorldPoint(lllIlIIlII[43], lllIlIIlII[66], lllIlIIlII[1]);
                            WorldPoint worldPoint6 = new WorldPoint(lllIlIIlII[67], lllIlIIlII[66], lllIlIIlII[1]);
                            WorldPoint worldPoint7 = new WorldPoint(lllIlIIlII[67], lllIlIIlII[66], lllIlIIlII[1]);
                            WorldArea worldArea4 = new WorldArea(lllIlIIlII[68], lllIlIIlII[69], lllIlIIlII[20], lllIlIIlII[23], lllIlIIlII[1]);
                            WorldArea worldArea5 = new WorldArea(lllIlIIlII[70], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[17], lllIlIIlII[1]);
                            WorldArea worldArea6 = new WorldArea(lllIlIIlII[72], lllIlIIlII[73], lllIlIIlII[32], lllIlIIlII[25], lllIlIIlII[1]);
                            if (llIIIlIlIIIII(Vars.getBit(lllIlIIlII[74]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[75]))) {
                                if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[76]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lllIlIIlII[0]);
                                    "".length();
                                }
                                if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[77]];
                                    String[] strArr18 = new String[lllIlIIlII[0]];
                                    strArr18[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[78]];
                                    TileObjects.getNearest(strArr18).interact(lllIlIIIII[lllIlIIlII[79]]);
                                    Time.sleepTicks(lllIlIIlII[8]);
                                    "".length();
                                }
                            }
                            if (llIIIlIIlllll(Vars.getBit(lllIlIIlII[74]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[75]))) {
                                if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[81]];
                                    Movement.walkTo(worldPoint5);
                                    "".length();
                                    Time.sleepTicks(lllIlIIlII[0]);
                                    "".length();
                                }
                                if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[82]];
                                    String[] strArr19 = new String[lllIlIIlII[0]];
                                    strArr19[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[15]];
                                    TileObjects.getNearest(strArr19).interact(lllIlIIIII[lllIlIIlII[83]]);
                                    Time.sleepTicks(lllIlIIlII[8]);
                                    "".length();
                                }
                            }
                            if (llIIIlIIlllll(Vars.getBit(lllIlIIlII[74]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[80]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[75]))) {
                                if (llIIIlIIllIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint8 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[84], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[85]];
                                        Movement.walkTo(worldPoint8);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        String[] strArr20 = new String[lllIlIIlII[0]];
                                        strArr20[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[86]];
                                        TileObjects.getNearest(strArr20).interact(lllIlIIIII[lllIlIIlII[87]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIlIlll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[88]];
                                    String[] strArr21 = new String[lllIlIIlII[0]];
                                    strArr21[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[89]];
                                    TileObjects.getNearest(strArr21).interact(lllIlIIIII[lllIlIIlII[90]]);
                                    Time.sleepTicks(lllIlIIlII[8]);
                                    "".length();
                                }
                            }
                            if (llIIIlIIlllll(Vars.getBit(lllIlIIlII[74]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[80]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0])) {
                                if (llIIIlIIlIlll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint9 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[91], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[92]];
                                        Movement.walkTo(worldPoint9);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        String[] strArr22 = new String[lllIlIIlII[0]];
                                        strArr22[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[93]];
                                        TileObjects.getNearest(strArr22).interact(lllIlIIIII[lllIlIIlII[94]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIllIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[95]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[96]];
                                        String[] strArr23 = new String[lllIlIIlII[0]];
                                        strArr23[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[97]];
                                        TileObjects.getNearest(strArr23).interact(lllIlIIIII[lllIlIIlII[98]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (llIIIlIIlllll(Vars.getBit(lllIlIIlII[74]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0])) {
                                if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[99]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lllIlIIlII[0]);
                                    "".length();
                                }
                                if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[100]];
                                    String[] strArr24 = new String[lllIlIIlII[0]];
                                    strArr24[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[101]];
                                    TileObjects.getNearest(strArr24).interact(lllIlIIIII[lllIlIIlII[102]]);
                                    Time.sleepTicks(lllIlIIlII[8]);
                                    "".length();
                                }
                            }
                            if (llIIIlIIllIIl(Vars.getBit(lllIlIIlII[74])) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[103])) && llIIIlIIllIIl(dM() ? 1 : 0)) {
                                if (llIIIlIIllIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (llIIIlIIlIlll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint10 = new WorldPoint(lllIlIIlII[104], lllIlIIlII[84], lllIlIIlII[1]);
                                        if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[105]];
                                            Movement.walkTo(worldPoint10);
                                            "".length();
                                            Time.sleepTicks(lllIlIIlII[0]);
                                            "".length();
                                        }
                                        if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            String[] strArr25 = new String[lllIlIIlII[0]];
                                            strArr25[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[106]];
                                            TileObjects.getNearest(strArr25).interact(lllIlIIIII[lllIlIIlII[107]]);
                                            Time.sleepTicks(lllIlIIlII[8]);
                                            "".length();
                                        }
                                    }
                                    if (llIIIlIIlIlll(new WorldArea(lllIlIIlII[72], lllIlIIlII[69], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIllIIl(dM() ? 1 : 0)) {
                                        WorldPoint worldPoint11 = new WorldPoint(lllIlIIlII[108], lllIlIIlII[109], lllIlIIlII[1]);
                                        if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[110]];
                                            Movement.walkTo(worldPoint11);
                                            "".length();
                                            Time.sleepTicks(lllIlIIlII[0]);
                                            "".length();
                                        }
                                        if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            String[] strArr26 = new String[lllIlIIlII[0]];
                                            strArr26[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[111]];
                                            TileObjects.getNearest(strArr26).interact(lllIlIIIII[lllIlIIlII[112]]);
                                            Time.sleepTicks(lllIlIIlII[8]);
                                            "".length();
                                        }
                                    }
                                    if (llIIIlIIlIlll(new WorldArea(lllIlIIlII[70], lllIlIIlII[69], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint12 = new WorldPoint(lllIlIIlII[67], lllIlIIlII[113], lllIlIIlII[1]);
                                        if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[114]];
                                            Movement.walkTo(worldPoint12);
                                            "".length();
                                            Time.sleepTicks(lllIlIIlII[0]);
                                            "".length();
                                        }
                                        if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            String[] strArr27 = new String[lllIlIIlII[0]];
                                            strArr27[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[115]];
                                            TileObjects.getNearest(strArr27).interact(lllIlIIIII[lllIlIIlII[116]]);
                                            Time.sleepTicks(lllIlIIlII[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (llIIIlIIlIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIllIIl(dM() ? 1 : 0)) {
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[117]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[118]];
                                        String[] strArr28 = new String[lllIlIIlII[0]];
                                        strArr28[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[119]];
                                        TileObjects.getNearest(strArr28).interact(lllIlIIIII[lllIlIIlII[120]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (llIIIlIIllIIl(Vars.getBit(lllIlIIlII[74])) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[103]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[121]))) {
                                if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[122]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(lllIlIIlII[0]);
                                    "".length();
                                }
                                if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[123]];
                                    String[] strArr29 = new String[lllIlIIlII[0]];
                                    strArr29[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[124]];
                                    TileObjects.getNearest(strArr29).interact(lllIlIIIII[lllIlIIlII[125]]);
                                    Time.sleepTicks(lllIlIIlII[8]);
                                    "".length();
                                }
                            }
                            if (llIIIlIIllIIl(Vars.getBit(lllIlIIlII[74])) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[103]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[121]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[126]))) {
                                WorldArea worldArea7 = new WorldArea(lllIlIIlII[72], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]);
                                if (llIIIlIIlIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint13 = new WorldPoint(lllIlIIlII[127], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[128]];
                                        Movement.walkTo(worldPoint13);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        String[] strArr30 = new String[lllIlIIlII[0]];
                                        strArr30[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[129]];
                                        TileObjects.getNearest(strArr30).interact(lllIlIIIII[lllIlIIlII[130]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIlIlll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint14 = new WorldPoint(lllIlIIlII[131], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[132]];
                                        Movement.walkTo(worldPoint14);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        String[] strArr31 = new String[lllIlIIlII[0]];
                                        strArr31[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[133]];
                                        TileObjects.getNearest(strArr31).interact(lllIlIIIII[lllIlIIlII[134]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIlIlll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[135]];
                                    String[] strArr32 = new String[lllIlIIlII[0]];
                                    strArr32[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[136]];
                                    TileObjects.getNearest(strArr32).interact(lllIlIIIII[lllIlIIlII[137]]);
                                    Time.sleepTicks(lllIlIIlII[16]);
                                    "".length();
                                }
                            }
                            if (llIIIlIIllIIl(Vars.getBit(lllIlIIlII[74])) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[103]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[121]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[126]), lllIlIIlII[0])) {
                                WorldArea worldArea8 = new WorldArea(lllIlIIlII[72], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]);
                                if (llIIIlIIlIlll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint15 = new WorldPoint(lllIlIIlII[138], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[139]];
                                        Movement.walkTo(worldPoint15);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        String[] strArr33 = new String[lllIlIIlII[0]];
                                        strArr33[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[140]];
                                        TileObjects.getNearest(strArr33).interact(lllIlIIIII[lllIlIIlII[141]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIlIlll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint16 = new WorldPoint(lllIlIIlII[108], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[142]];
                                        Movement.walkTo(worldPoint16);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        String[] strArr34 = new String[lllIlIIlII[0]];
                                        strArr34[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[143]];
                                        TileObjects.getNearest(strArr34).interact(lllIlIIIII[lllIlIIlII[144]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIlIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[145]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[146]];
                                        String[] strArr35 = new String[lllIlIIlII[0]];
                                        strArr35[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[147]];
                                        TileObjects.getNearest(strArr35).interact(lllIlIIIII[lllIlIIlII[148]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (llIIIlIIllIIl(Vars.getBit(lllIlIIlII[74])) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[103])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[121]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[126]), lllIlIIlII[0])) {
                                WorldArea worldArea9 = new WorldArea(lllIlIIlII[72], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]);
                                if (llIIIlIIlIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint17 = new WorldPoint(lllIlIIlII[127], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[149]];
                                        Movement.walkTo(worldPoint17);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        String[] strArr36 = new String[lllIlIIlII[0]];
                                        strArr36[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[150]];
                                        TileObjects.getNearest(strArr36).interact(lllIlIIIII[lllIlIIlII[151]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIlIlll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint18 = new WorldPoint(lllIlIIlII[104], lllIlIIlII[152], lllIlIIlII[1]);
                                    if (llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[153]];
                                        Movement.walkTo(worldPoint18);
                                        "".length();
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                    }
                                    if (llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        Time.sleepTicks(lllIlIIlII[0]);
                                        "".length();
                                        String[] strArr37 = new String[lllIlIIlII[0]];
                                        strArr37[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[154]];
                                        TileObjects.getNearest(strArr37).interact(lllIlIIIII[lllIlIIlII[155]]);
                                        Time.sleepTicks(lllIlIIlII[8]);
                                        "".length();
                                    }
                                }
                                if (llIIIlIIlIlll(new WorldArea(lllIlIIlII[72], lllIlIIlII[69], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[156]];
                                    Time.sleepTicks(lllIlIIlII[0]);
                                    "".length();
                                    int[] iArr18 = new int[lllIlIIlII[0]];
                                    iArr18[lllIlIIlII[1]] = lllIlIIlII[157];
                                    TileObjects.getNearest(iArr18).interact(lllIlIIIII[lllIlIIlII[158]]);
                                    Time.sleepTicks(lllIlIIlII[8]);
                                    "".length();
                                }
                                if (llIIIlIIlIlll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] iArr19 = new int[lllIlIIlII[0]];
                                    iArr19[lllIlIIlII[1]] = lllIlIIlII[159];
                                    TileObjects.getNearest(iArr19).interact(lllIlIIIII[lllIlIIlII[160]]);
                                    Time.sleepTicks(lllIlIIlII[8]);
                                    "".length();
                                }
                                if (llIIIlIIlIlll(new WorldArea(lllIlIIlII[161], lllIlIIlII[162], lllIlIIlII[23], lllIlIIlII[14], lllIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr38 = new String[lllIlIIlII[0]];
                                    strArr38[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[163]];
                                    if (llIIIlIIllIIl(Inventory.contains(strArr38) ? 1 : 0)) {
                                        String[] strArr39 = new String[lllIlIIlII[0]];
                                        strArr39[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[164]];
                                        TileItems.getNearest(strArr39).interact(lllIlIIIII[lllIlIIlII[165]]);
                                        Time.sleepTicks(lllIlIIlII[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr40 = new String[lllIlIIlII[0]];
                strArr40[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[166]];
                if (llIIIlIIlIlll(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lllIlIIlII[0]];
                    strArr41[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[167]];
                    if (llIIIlIIlIlll(Inventory.contains(strArr41) ? 1 : 0)) {
                        if (llIIIlIIlIlll(new WorldArea(lllIlIIlII[161], lllIlIIlII[162], lllIlIIlII[23], lllIlIIlII[14], lllIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lllIlIIlII[0]];
                            iArr20[lllIlIIlII[1]] = lllIlIIlII[159];
                            TileObjects.getNearest(iArr20).interact(lllIlIIIII[lllIlIIlII[168]]);
                            Time.sleepTicks(lllIlIIlII[14]);
                            "".length();
                        }
                        if (llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[169]];
                            Movement.walkTo(mh);
                            "".length();
                            Time.sleepTicks(lllIlIIlII[0]);
                            "".length();
                        }
                        if (llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                                if (llIIIlIIlIlll(tileObject.getName().contains(lllIlIIIII[lllIlIIlII[185]]) ? 1 : 0)) {
                                    String[] strArr42 = new String[lllIlIIlII[0]];
                                    strArr42[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[186]];
                                    if (llIIIlIIlIlll(tileObject.hasAction(strArr42) ? 1 : 0) && llIIIlIIllllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIlIIlII[21], lllIlIIlII[184], lllIlIIlII[3])), lllIlIIlII[3])) {
                                        ?? r0 = lllIlIIlII[0];
                                        "".length();
                                        return (-"  ".length()) >= 0 ? ((((66 + 108) - 143) + 145) ^ (((74 + 143) - 105) + 53)) & (((49 ^ 71) ^ (233 ^ 138)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lllIlIIlII[1];
                            });
                            if (llIIIlIIllIlI(nearest3)) {
                                nearest3.interact(lllIlIIIII[lllIlIIlII[170]]);
                                Time.sleepTicks(lllIlIIlII[8]);
                                "".length();
                            }
                            if (llIIIlIlIIIIl(nearest3)) {
                                C0020g.a(lllIlIIIII[lllIlIIlII[171]], cE, lllIlIIlII[0]);
                            }
                        }
                    }
                }
            }
            if (llIIIlIIlllll(C0018e.j(mi), lllIlIIlII[3])) {
                if (llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[172]];
                    Movement.walkTo(mh);
                    "".length();
                    Time.sleepTicks(lllIlIIlII[0]);
                    "".length();
                }
                if (llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                        if (llIIIlIIlIlll(tileObject2.getName().contains(lllIlIIIII[lllIlIIlII[182]]) ? 1 : 0)) {
                            String[] strArr42 = new String[lllIlIIlII[0]];
                            strArr42[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[183]];
                            if (llIIIlIIlIlll(tileObject2.hasAction(strArr42) ? 1 : 0) && llIIIlIIllllI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lllIlIIlII[21], lllIlIIlII[184], lllIlIIlII[3])), lllIlIIlII[3])) {
                                ?? r0 = lllIlIIlII[0];
                                "".length();
                                return ((54 ^ 115) ^ (81 ^ 16)) <= 0 ? ((128 ^ 145) ^ (206 ^ 191)) & (((((26 + 6) - (-127)) + 6) ^ (((149 + 49) - 111) + 110)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllIlIIlII[1];
                    });
                    if (llIIIlIIllIlI(nearest4)) {
                        nearest4.interact(lllIlIIIII[lllIlIIlII[173]]);
                        Time.sleepTicks(lllIlIIlII[8]);
                        "".length();
                    }
                    if (llIIIlIlIIIIl(nearest4)) {
                        if (llIIIlIIllIII(di, lllIlIIlII[0])) {
                            aN.tb += lllIlIIlII[0];
                            aN.u(AccBuilderSotf.m);
                            di += lllIlIIlII[0];
                            aN.tb = lllIlIIlII[1];
                            dj = lllIlIIlII[1];
                        }
                        C0020g.a(lllIlIIIII[lllIlIIlII[174]], cE, lllIlIIlII[0]);
                    }
                }
            }
            C0020g.a(cE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIlIlIIIlI(C0018e.j(lllIlIIlII[47]), lllIlIIlII[8])) {
            ?? r0 = lllIlIIlII[0];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIIlII[1];
    }

    private static boolean llIIIlIIllIII(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIlIIlIlIl();
        llIIIlIIIIIll();
        bv = new ArrayList();
        de = new WorldPoint(lllIlIIlII[64], lllIlIIlII[187], lllIlIIlII[1]);
        me = new WorldPoint(lllIlIIlII[188], lllIlIIlII[189], lllIlIIlII[1]);
        mf = new WorldPoint(lllIlIIlII[161], lllIlIIlII[190], lllIlIIlII[1]);
        mg = new WorldPoint(lllIlIIlII[191], lllIlIIlII[192], lllIlIIlII[1]);
        mh = new WorldPoint(lllIlIIlII[64], lllIlIIlII[45], lllIlIIlII[3]);
        mi = lllIlIIlII[47];
        String[] strArr = new String[lllIlIIlII[8]];
        strArr[lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[193]];
        strArr[lllIlIIlII[0]] = lllIlIIIII[lllIlIIlII[194]];
        strArr[lllIlIIlII[3]] = lllIlIIIII[lllIlIIlII[195]];
        cE = strArr;
        mj = new WorldArea(lllIlIIlII[188], lllIlIIlII[196], lllIlIIlII[50], lllIlIIlII[40], lllIlIIlII[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIlIIlII[4]];
        iArr[lllIlIIlII[1]] = lllIlIIlII[5];
        iArr[lllIlIIlII[0]] = lllIlIIlII[6];
        iArr[lllIlIIlII[3]] = lllIlIIlII[7];
        iArr[lllIlIIlII[8]] = lllIlIIlII[9];
        int i = lllIlIIlII[1];
        while (llIIIlIIllIII(i, iArr.length)) {
            int[] iArr2 = new int[lllIlIIlII[0]];
            iArr2[lllIlIIlII[1]] = iArr[i];
            if (llIIIlIIllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIlIIlII[1];
            }
            i++;
            "".length();
            if (((86 ^ 5) ^ (64 ^ 23)) <= " ".length()) {
                return ((((93 + 121) - 82) + 14) ^ (((76 + 96) - 148) + 137)) & (((190 ^ 153) ^ (19 ^ 7)) ^ (-" ".length()));
            }
        }
        return lllIlIIlII[0];
    }

    private static boolean llIIIlIIlllll(int i, int i2) {
        return i == i2;
    }

    private static String llIIIIllllIII(String lllllllllllllllllIllIllllIIIIIll, String lllllllllllllllllIllIllllIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIllllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIllllIIIIllI) {
            lllllllllllllllllIllIllllIIIIllI.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            dL();
            "".length();
            if (" ".length() >= "   ".length()) {
                return (165 ^ 140) & ((140 ^ 165) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIlIIlII[144];
    }

    private static String llIIIIlllIllI(String lllllllllllllllllIllIllllIlIlIlI, String lllllllllllllllllIllIllllIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllllIllIllllIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIllllIlIlIIl.getBytes(StandardCharsets.UTF_8)), lllIlIIlII[16]), "DES");
            Cipher lllllllllllllllllIllIllllIlIllII = Cipher.getInstance("DES");
            lllllllllllllllllIllIllllIlIllII.init(lllIlIIlII[3], lllllllllllllllllIllIllllIlIllIl);
            return new String(lllllllllllllllllIllIllllIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIllllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIllllIlIlIll) {
            lllllllllllllllllIllIllllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    static boolean dM() {
        if (llIIIlIIllIIl(Vars.getBit(lllIlIIlII[74])) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[80])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[75]), lllIlIIlII[0]) && llIIIlIIllIIl(Vars.getBit(lllIlIIlII[103])) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[121]), lllIlIIlII[0]) && llIIIlIIlllll(Vars.getBit(lllIlIIlII[126]), lllIlIIlII[0])) {
            ?? r0 = lllIlIIlII[0];
            "".length();
            return " ".length() != " ".length() ? ((((116 + 79) - (-13)) + 8) ^ (((100 + 74) - 107) + 70)) & (((59 ^ 60) ^ (112 ^ 38)) ^ (-" ".length())) : r0;
        }
        return lllIlIIlII[1];
    }

    private static String llIIIIlllIlll(String lllllllllllllllllIllIllllIIllIlI, String lllllllllllllllllIllIllllIIllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIllllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIllllIIllIII = new StringBuilder();
        char[] lllllllllllllllllIllIllllIIlIlll = lllllllllllllllllIllIllllIIllIIl.toCharArray();
        int lllllllllllllllllIllIllllIIlIllI = lllIlIIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIIlII[1];
        while (llIIIlIIllIII(i, length)) {
            char lllllllllllllllllIllIllllIIllIll = charArray[i];
            lllllllllllllllllIllIllllIIllIII.append((char) (lllllllllllllllllIllIllllIIllIll ^ lllllllllllllllllIllIllllIIlIlll[lllllllllllllllllIllIllllIIlIllI % lllllllllllllllllIllIllllIIlIlll.length]));
            "".length();
            lllllllllllllllllIllIllllIIlIllI++;
            i++;
            "".length();
            if ((141 ^ 137) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIllIllllIIllIII);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01b2, code lost:
        if (llIIIlIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.V.lllIlIIlII[14]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[lllIlIIlII[0]];
        iArr2[lllIlIIlII[1]] = lllIlIIlII[6];
        if (llIIIlIIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlII[6], lllIlIIlII[10], lllIlIIlII[175]));
            "".length();
        }
        int[] iArr3 = new int[lllIlIIlII[0]];
        iArr3[lllIlIIlII[1]] = lllIlIIlII[7];
        if (llIIIlIIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlII[7], lllIlIIlII[0], lllIlIIlII[175]));
            "".length();
        }
        int[] iArr4 = new int[lllIlIIlII[0]];
        iArr4[lllIlIIlII[1]] = lllIlIIlII[9];
        if (llIIIlIIllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlII[9], lllIlIIlII[0], lllIlIIlII[175]));
            "".length();
        }
        if (llIIIlIIllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlIIIII[lllIlIIlII[181]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlII[176], lllIlIIlII[14], lllIlIIlII[177]));
            "".length();
        }
        int[] iArr5 = new int[lllIlIIlII[0]];
        iArr5[lllIlIIlII[1]] = lllIlIIlII[12];
        if (llIIIlIIllIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlII[12], lllIlIIlII[4], C0023j.cf));
            "".length();
        }
        int[] iArr6 = new int[lllIlIIlII[0]];
        iArr6[lllIlIIlII[1]] = lllIlIIlII[13];
        if (llIIIlIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lllIlIIlII[0]];
            iArr7[lllIlIIlII[1]] = lllIlIIlII[13];
            if (llIIIlIIlIlll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIlIIlII[0]];
                iArr8[lllIlIIlII[1]] = lllIlIIlII[13];
            }
            iArr = new int[lllIlIIlII[0]];
            iArr[lllIlIIlII[1]] = lllIlIIlII[5];
            if (llIIIlIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lllIlIIlII[0]];
                iArr9[lllIlIIlII[1]] = lllIlIIlII[5];
                if (!llIIIlIIlIlll(Bank.contains(iArr9) ? 1 : 0)) {
                    return;
                }
                int[] iArr10 = new int[lllIlIIlII[0]];
                iArr10[lllIlIIlII[1]] = lllIlIIlII[5];
                if (!llIIIlIIllIII(Bank.getFirst(iArr10).getQuantity(), lllIlIIlII[27])) {
                    return;
                }
            }
            bv.add(new C0017d(lllIlIIlII[5], lllIlIIlII[57], lllIlIIlII[179]));
            "".length();
        }
        bv.add(new C0017d(lllIlIIlII[13], lllIlIIlII[10], lllIlIIlII[178]));
        "".length();
        iArr = new int[lllIlIIlII[0]];
        iArr[lllIlIIlII[1]] = lllIlIIlII[5];
        if (llIIIlIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIlIIlII[5], lllIlIIlII[57], lllIlIIlII[179]));
        "".length();
    }

    private static boolean llIIIlIIlllII(int i) {
        return i < 0;
    }
}
