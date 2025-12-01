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
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/q.class */
public class C0016q {
    static /* synthetic */ int cZ;
    static /* synthetic */ WorldPoint cT;
    private static /* synthetic */ String[] llIllIIll;
    static /* synthetic */ WorldPoint cW;
    private static /* synthetic */ int[] llIllIlll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldArea cV;
    static /* synthetic */ int da;
    static /* synthetic */ WorldPoint cX;
    public static /* synthetic */ boolean cL;
    static /* synthetic */ int cK;
    static /* synthetic */ int cY;
    private static /* synthetic */ int[] db;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ WorldPoint cU;

    private static boolean lIlllIIlIlII(int i, int i2) {
        return i <= i2;
    }

    private static String lIlllIIIIllI(String lIIIIlllllIlIl, String lIIIIlllllIlII) {
        try {
            SecretKeySpec lIIIIllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlllllIlII.getBytes(StandardCharsets.UTF_8)), llIllIlll[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIlll[4], lIIIIllllllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlllllIllI) {
            lIIIIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIllll(int i) {
        return i == 0;
    }

    private static boolean lIlllIIlIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIlllIIlIlll(int i, int i2) {
        return i == i2;
    }

    private static void lIlllIIIllIl() {
        llIllIlll = new int[217];
        llIllIlll[0] = " ".length();
        llIllIlll[1] = (-((-1145) & 32633)) & (-146) & 32693;
        llIllIlll[2] = (-((-278) & 21303)) & (-1) & 22525;
        llIllIlll[3] = ((((188 + 92) - 249) + 173) ^ (((46 + 102) - 115) + 109)) & (((91 ^ 127) ^ (51 ^ 85)) ^ (-" ".length()));
        llIllIlll[4] = "  ".length();
        llIllIlll[5] = "   ".length();
        llIllIlll[6] = (-((-2145) & 7916)) & (-1) & 14271;
        llIllIlll[7] = 195 ^ 199;
        llIllIlll[8] = (((62 + 127) - 9) + 7) ^ (((187 + 86) - 188) + 105);
        llIllIlll[9] = " ".length() ^ (32 ^ 39);
        llIllIlll[10] = (((56 + 24) - 44) + 99) ^ (((55 + 67) - 54) + 60);
        llIllIlll[11] = (40 ^ 86) ^ (41 ^ 95);
        llIllIlll[12] = (232 ^ 152) ^ (8 ^ 113);
        llIllIlll[13] = (((13 + 60) - (-41)) + 26) ^ (((28 + 114) - 48) + 40);
        llIllIlll[14] = 142 ^ 133;
        llIllIlll[15] = (((126 + 40) - 161) + 175) ^ (((118 + 75) - 92) + 69);
        llIllIlll[16] = (-25621) & 26615;
        llIllIlll[17] = (188 ^ 160) ^ (174 ^ 190);
        llIllIlll[18] = (242 ^ 131) ^ (96 ^ 28);
        llIllIlll[19] = (22 ^ 34) ^ (164 ^ 158);
        llIllIlll[20] = (168 ^ 140) ^ (157 ^ 182);
        llIllIlll[21] = 162 ^ 178;
        llIllIlll[22] = (210 ^ 175) ^ (16 ^ 124);
        llIllIlll[23] = (((126 + 66) - 153) + 102) ^ (((146 + 115) - 107) + 5);
        llIllIlll[24] = 26 ^ 9;
        llIllIlll[25] = (-10573) & 2010572;
        llIllIlll[26] = (-(229 ^ 186)) & (-18434) & 2518527;
        llIllIlll[27] = 165 ^ 177;
        llIllIlll[28] = (((117 ^ 23) + (223 ^ 157)) - (72 ^ 110)) + (253 ^ 173);
        llIllIlll[29] = (((90 + 50) - 114) + 136) ^ (((84 + 84) - (-6)) + 9);
        llIllIlll[30] = (248 ^ 128) ^ (7 ^ 105);
        llIllIlll[31] = (43 ^ 12) ^ (174 ^ 158);
        llIllIlll[32] = (((7 + 130) - 94) + 88) ^ (((124 + 73) - 119) + 77);
        llIllIlll[33] = 150 ^ 143;
        llIllIlll[34] = 53 ^ 47;
        llIllIlll[35] = 149 ^ 142;
        llIllIlll[36] = (((87 + 17) - 37) + 75) ^ (((57 + 48) - 30) + 71);
        llIllIlll[37] = 41 ^ 52;
        llIllIlll[38] = (-3602) & 3901;
        llIllIlll[39] = (-14850) & 15349;
        llIllIlll[40] = (((163 + 67) - 108) + 46) ^ (((43 + 14) - (-44)) + 82);
        llIllIlll[41] = (((37 + 41) - (-57)) + 20) ^ (((95 + 182) - 96) + 6);
        llIllIlll[42] = 229 ^ 196;
        llIllIlll[43] = 138 ^ 168;
        llIllIlll[44] = (((92 + 61) - 24) + 14) ^ (((67 + 82) - 81) + 104);
        llIllIlll[45] = (((19 + 116) - 5) + 1) ^ (((83 + 155) - 201) + 130);
        llIllIlll[46] = (((131 + 77) - 163) + 98) ^ (((29 + 33) - (-2)) + 106);
        llIllIlll[47] = (28 ^ 81) ^ (23 ^ 124);
        llIllIlll[48] = (-((-3334) & 32151)) & (-5) & 32767;
        llIllIlll[49] = 156 ^ 187;
        llIllIlll[50] = (216 ^ 143) ^ (((8 + 65) - (-44)) + 10);
        llIllIlll[51] = (((189 + 229) - 227) + 48) ^ (((74 + 186) - 176) + 114);
        llIllIlll[52] = 75 ^ 97;
        llIllIlll[53] = (129 ^ 134) ^ (154 ^ 182);
        llIllIlll[54] = 152 ^ 180;
        llIllIlll[55] = 79 ^ 98;
        llIllIlll[56] = 72 ^ 102;
        llIllIlll[57] = (((129 + 69) - 90) + 79) ^ (((147 + 5) - 57) + 53);
        llIllIlll[58] = (-((-5739) & 22142)) & (-4097) & 24447;
        llIllIlll[59] = (((41 ^ 79) + (15 ^ 106)) - (39 ^ 69)) + (95 ^ 71);
        llIllIlll[60] = (((162 + 117) - 164) + 64) ^ (((25 + 75) - 83) + 114);
        llIllIlll[61] = (61 ^ 82) ^ (235 ^ 181);
        llIllIlll[62] = (14 ^ 51) ^ (164 ^ 171);
        llIllIlll[63] = (-((-8251) & 24699)) & (-4113) & 9428959;
        llIllIlll[64] = (-26337) & 16776959;
        llIllIlll[65] = (14 ^ 38) ^ (93 ^ 70);
        llIllIlll[66] = (213 ^ 195) ^ (33 ^ 3);
        llIllIlll[67] = (220 ^ 147) ^ (214 ^ 172);
        llIllIlll[68] = 115 ^ 69;
        llIllIlll[69] = (80 ^ 17) ^ (226 ^ 148);
        llIllIlll[70] = (((125 + 39) - 123) + 88) ^ (((92 + 152) - 174) + 115);
        llIllIlll[71] = 103 ^ 94;
        llIllIlll[72] = 145 ^ 171;
        llIllIlll[73] = (250 ^ 143) ^ (88 ^ 22);
        llIllIlll[74] = 35 ^ 31;
        llIllIlll[75] = (((38 + 41) - (-27)) + 42) ^ (((140 + 141) - 268) + 156);
        llIllIlll[76] = (107 ^ 100) ^ (191 ^ 142);
        llIllIlll[77] = 186 ^ 133;
        llIllIlll[78] = 0 ^ 64;
        llIllIlll[79] = (84 ^ 63) ^ (55 ^ 29);
        llIllIlll[80] = (105 ^ 90) ^ (208 ^ 161);
        llIllIlll[81] = (77 ^ 125) ^ (11 ^ 120);
        llIllIlll[82] = (162 ^ 185) ^ (194 ^ 157);
        llIllIlll[83] = (28 ^ 15) ^ (124 ^ 42);
        llIllIlll[84] = 209 ^ 151;
        llIllIlll[85] = (91 ^ 38) ^ (180 ^ 142);
        llIllIlll[86] = 234 ^ 162;
        llIllIlll[87] = 142 ^ 199;
        llIllIlll[88] = 253 ^ 183;
        llIllIlll[89] = (232 ^ 147) ^ (97 ^ 81);
        llIllIlll[90] = 9 ^ 69;
        llIllIlll[91] = 105 ^ 36;
        llIllIlll[92] = (-((-4882) & 22421)) & (-10241) & 28671;
        llIllIlll[93] = 196 ^ 138;
        llIllIlll[94] = (((163 + 108) - 190) + 169) ^ (((99 + 158) - 127) + 51);
        llIllIlll[95] = 111 ^ 63;
        llIllIlll[96] = (-22017) & 24509;
        llIllIlll[97] = (-21) & 2519;
        llIllIlll[98] = (-9985) & 16310;
        llIllIlll[99] = (-((-5185) & 8151)) & (-1) & 16351;
        llIllIlll[100] = (-((-1065) & 26223)) & (-1026) & 32511;
        llIllIlll[101] = (-((-71) & 11495)) & (-20483) & 32767;
        llIllIlll[102] = (-((-1285) & 19725)) & (-1539) & 32766;
        llIllIlll[103] = (-12293) & 13996;
        llIllIlll[104] = (-1553) & 12051;
        llIllIlll[105] = (-((-26458) & 30683)) & (-16385) & 31735;
        llIllIlll[106] = (-((-4503) & 6103)) & (-1) & 4095;
        llIllIlll[107] = (-((-6605) & 24543)) & (-4129) & 24567;
        llIllIlll[108] = (-13337) & 15839;
        llIllIlll[109] = (-((-159) & 13983)) & (-57) & 16377;
        llIllIlll[110] = 9 ^ 88;
        llIllIlll[111] = (-((-6219) & 24143)) & (-8321) & 32767;
        llIllIlll[112] = (-3275) & 24575;
        llIllIlll[113] = (-(((104 + 96) - 134) + 63)) & (-1029) & 22460;
        llIllIlll[114] = (-((-16417) & 17641)) & (-8194) & 30715;
        llIllIlll[115] = (-8706) & 15229;
        llIllIlll[116] = (-((-585) & 26206)) & (-1) & 32189;
        llIllIlll[117] = (-((-25323) & 30447)) & (-2) & 16253;
        llIllIlll[118] = 123 ^ 41;
        llIllIlll[119] = (215 ^ 185) ^ (109 ^ 80);
        llIllIlll[120] = (-27667) & 32666;
        llIllIlll[121] = (113 ^ 50) ^ (27 ^ 12);
        llIllIlll[122] = (-((-30545) & 32598)) & (-1) & 14839;
        llIllIlll[123] = (240 ^ 164) ^ " ".length();
        llIllIlll[124] = 70 ^ 16;
        llIllIlll[125] = 2 ^ 85;
        llIllIlll[126] = (-13329) & 14328;
        llIllIlll[127] = (135 ^ 147) ^ (77 ^ 1);
        llIllIlll[128] = 54 ^ 111;
        llIllIlll[129] = (202 ^ 179) ^ (108 ^ 79);
        llIllIlll[130] = (9 ^ 97) ^ (110 ^ 93);
        llIllIlll[131] = (((60 + 99) - 79) + 118) ^ (((63 + 15) - 2) + 78);
        llIllIlll[132] = 83 ^ 14;
        llIllIlll[133] = (14 ^ 5) ^ (194 ^ 151);
        llIllIlll[134] = (((123 + 73) - 164) + 95) ^ (15 ^ 47);
        llIllIlll[135] = (((8 + 93) - 82) + 190) ^ (((41 + 172) - 181) + 145);
        llIllIlll[136] = 226 ^ 131;
        llIllIlll[137] = 162 ^ 192;
        llIllIlll[138] = (((246 + 59) - 251) + 196) ^ (((125 + 81) - 64) + 11);
        llIllIlll[139] = 228 ^ 128;
        llIllIlll[140] = (((191 + 118) - 102) + 17) ^ (((76 + 39) - 88) + 106);
        llIllIlll[141] = (-((-18853) & 24485)) & (-8202) & 163833;
        llIllIlll[142] = 107 ^ 13;
        llIllIlll[143] = 116 ^ 19;
        llIllIlll[144] = (-((-10241) & 12079)) & (-8194) & 260031;
        llIllIlll[145] = 122 ^ 18;
        llIllIlll[146] = (-(125 ^ 36)) & (-16417) & 18938;
        llIllIlll[147] = (-((-10587) & 27487)) & (-4105) & 32734;
        llIllIlll[148] = (-21005) & 32735;
        llIllIlll[149] = (-((-3229) & 20158)) & (-4107) & 32767;
        llIllIlll[150] = (-((-14357) & 14909)) & (-20481) & 32765;
        llIllIlll[151] = (-16438) & 24447;
        llIllIlll[152] = (-((-513) & 20007)) & (-649) & 32767;
        llIllIlll[153] = (-(81 ^ 104)) & (-24705) & 32767;
        llIllIlll[154] = (((187 + 205) - 175) + 32) ^ (((130 + 116) - 172) + 70);
        llIllIlll[155] = 112 ^ 26;
        llIllIlll[156] = (-12426) & 16381;
        llIllIlll[157] = (-((-153) & 9689)) & (-18433) & 28668;
        llIllIlll[158] = 101 ^ 14;
        llIllIlll[159] = 35 ^ 79;
        llIllIlll[160] = 50 ^ 95;
        llIllIlll[161] = (35 ^ 73) ^ (118 ^ 114);
        llIllIlll[162] = 220 ^ 164;
        llIllIlll[163] = (-268) & 9067;
        llIllIlll[164] = (-28674) & 31225;
        llIllIlll[165] = (-(125 ^ 111)) & (-8323) & 10239;
        llIllIlll[166] = (-16466) & 17365;
        llIllIlll[167] = 119 ^ 24;
        llIllIlll[168] = (-((-15545) & 16382)) & (-9219) & 45055;
        llIllIlll[169] = (-4611) & 589610;
        llIllIlll[170] = (-((-4769) & 29363)) & (-4101) & 653694;
        llIllIlll[171] = (-287) & 12126;
        llIllIlll[172] = (-71) & 175070;
        llIllIlll[173] = (-((-5925) & 8053)) & (-1025) & 188152;
        llIllIlll[174] = (-((-8393) & 30702)) & (-67) & 917375;
        llIllIlll[175] = (-((-13385) & 29903)) & (-8738) & 950255;
        llIllIlll[176] = (-((-15764) & 32731)) & (-2441) & 1469407;
        llIllIlll[177] = (-((-26120) & 26543)) & (-521) & 1490943;
        llIllIlll[178] = (-12623) & 1162622;
        llIllIlll[179] = (-1058) & 1251057;
        llIllIlll[180] = (-6178) & 696177;
        llIllIlll[181] = (-9245) & 749244;
        llIllIlll[182] = (-((-636) & 32511)) & (-5) & 2981879;
        llIllIlll[183] = (-((-19737) & 20319)) & (-1) & 3055582;
        llIllIlll[184] = (31 ^ 14) ^ (69 ^ 36);
        llIllIlll[185] = (-257) & 55256;
        llIllIlll[186] = (-530) & 65529;
        llIllIlll[187] = (-8327) & 14326;
        llIllIlll[188] = (-((-15569) & 31958)) & (-4355) & 31743;
        llIllIlll[189] = ((48 + 36) - (-9)) + 37;
        llIllIlll[190] = (((((138 + 16) - 12) + 2) + (((55 + 89) - 61) + 64)) - (((56 + 110) - 41) + 57)) + (3 ^ 42);
        llIllIlll[191] = (-16388) & 416687;
        llIllIlll[192] = (-((-8199) & 24887)) & (-2061) & 458748;
        llIllIlll[193] = (-((-3207) & 11927)) & (-161) & 16380;
        llIllIlll[194] = (-19468) & 23967;
        llIllIlll[195] = 25 ^ 104;
        llIllIlll[196] = 94 ^ 44;
        llIllIlll[197] = 50 ^ 65;
        llIllIlll[198] = 212 ^ 160;
        llIllIlll[199] = 108 ^ 25;
        llIllIlll[200] = (((56 + 111) - 143) + 185) ^ (((115 + 152) - 153) + 53);
        llIllIlll[201] = 49 ^ 70;
        llIllIlll[202] = 86 ^ 47;
        llIllIlll[203] = 191 ^ 197;
        llIllIlll[204] = 57 ^ 66;
        llIllIlll[205] = 252 ^ 128;
        llIllIlll[206] = (10 ^ 41) ^ (103 ^ 57);
        llIllIlll[207] = (-3651) & 8175;
        llIllIlll[208] = (((175 + 10) - 163) + 162) ^ (((107 + 7) - 72) + 156);
        llIllIlll[209] = (-158) & 2751;
        llIllIlll[210] = (-((-8214) & 29527)) & (-1) & 24399;
        llIllIlll[211] = (-((-4177) & 29907)) & (-9) & 28351;
        llIllIlll[212] = (-((-1107) & 21755)) & (-66) & 23807;
        llIllIlll[213] = (-((-30825) & 31211)) & (-81) & 3070;
        llIllIlll[214] = (-((-2319) & 19279)) & (-145) & 20219;
        llIllIlll[215] = (-(204 ^ 193)) & (-131) & 4095;
        llIllIlll[216] = (((36 ^ 16) + (203 ^ 169)) - (((74 + 5) - 21) + 80)) + (179 ^ 192);
    }

    private static boolean lIlllIIlIllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v652, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v87, types: [boolean] */
    public static void e(String str) {
        C0004e.t();
        if (lIlllIIIlllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIllIIll[llIllIlll[3]];
            C0001b.a(bx);
            if (lIlllIIlIIII(bx.size(), llIllIlll[0])) {
                System.out.println(llIllIIll[llIllIlll[0]]);
                bv = llIllIlll[3];
            }
        }
        if (lIlllIIIllll(bv ? 1 : 0)) {
            if (lIlllIIIllll(f(str) ? 1 : 0) && lIlllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                String[] strArr = new String[llIllIlll[0]];
                strArr[llIllIlll[3]] = llIllIIll[llIllIlll[4]];
                if (lIlllIIlIIlI(TileObjects.getNearest(strArr))) {
                    if (lIlllIIIlllI(Equipment.contains(C0005f.aU) ? 1 : 0)) {
                        Equipment.getFirst(C0005f.aU).interact(llIllIIll[llIllIlll[5]]);
                        Time.sleepUntil(() -> {
                            int[] iArr = new int[llIllIlll[0]];
                            iArr[llIllIlll[3]] = llIllIlll[207];
                            if (lIlllIIlIlIl(TileObjects.getNearest(iArr))) {
                                ?? r0 = llIllIlll[0];
                                "".length();
                                return ((58 ^ 64) ^ (73 ^ 55)) <= 0 ? ((21 ^ 14) ^ (95 ^ 76)) & (((21 ^ 110) ^ (59 ^ 72)) ^ (-" ".length())) : r0;
                            }
                            return llIllIlll[3];
                        }, llIllIlll[6]);
                        "".length();
                    }
                    if (lIlllIIIllll(Equipment.contains(C0005f.aU) ? 1 : 0) && lIlllIIIlllI(Inventory.contains(C0005f.aU) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aU).interact(llIllIIll[llIllIlll[7]]);
                    }
                }
                AccBuilderGWD.c = llIllIIll[llIllIlll[8]];
                String[] strArr2 = new String[llIllIlll[0]];
                strArr2[llIllIlll[3]] = llIllIIll[llIllIlll[9]];
                TileObjects.getNearest(strArr2).interact(llIllIIll[llIllIlll[10]]);
                Time.sleepTicks(llIllIlll[7]);
                "".length();
            }
            if ((!lIlllIIIlllI(f(str) ? 1 : 0) || lIlllIIIllll(Inventory.contains(item -> {
                if (lIlllIIIlllI(item.getName().contains(llIllIIll[llIllIlll[206]]) ? 1 : 0) && lIlllIIIllll(item.isNoted() ? 1 : 0)) {
                    ?? r0 = llIllIlll[0];
                    "".length();
                    return !((true ^ true) ^ (true ^ true)) ? ((104 ^ 68) ^ (195 ^ 177)) & (((35 ^ 96) ^ (106 ^ 119)) ^ (-" ".length())) : r0;
                }
                return llIllIlll[3];
            }) ? 1 : 0)) && lIlllIIIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[11]]) ? 1 : 0)) {
                    g(llIllIIll[llIllIlll[12]]);
                }
                if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[13]]) ? 1 : 0)) {
                    g(llIllIIll[llIllIlll[14]]);
                }
            }
            if (lIlllIIIlllI(f(str) ? 1 : 0) && lIlllIIlIIII(Vars.getBit(cZ), llIllIlll[15]) && lIlllIIIlllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr = new int[llIllIlll[0]];
                iArr[llIllIlll[3]] = llIllIlll[16];
                if (lIlllIIIllll(Inventory.contains(iArr) ? 1 : 0)) {
                    g(str);
                }
                int[] iArr2 = new int[llIllIlll[0]];
                iArr2[llIllIlll[3]] = llIllIlll[16];
                if (lIlllIIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                    AccBuilderGWD.c = llIllIIll[llIllIlll[17]];
                    if (lIlllIIIllll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr3 = new String[llIllIlll[0]];
                        strArr3[llIllIlll[3]] = llIllIIll[llIllIlll[18]];
                        TileObject nearest = TileObjects.getNearest(strArr3);
                        String[] strArr4 = new String[llIllIlll[0]];
                        strArr4[llIllIlll[3]] = llIllIIll[llIllIlll[19]];
                        if (lIlllIIIlllI(nearest.hasAction(strArr4) ? 1 : 0)) {
                            String[] strArr5 = new String[llIllIlll[0]];
                            strArr5[llIllIlll[3]] = llIllIIll[llIllIlll[20]];
                            TileObjects.getNearest(strArr5).interact(llIllIIll[llIllIlll[21]]);
                            Time.sleepTicks(llIllIlll[4]);
                            "".length();
                            "".length();
                            if (" ".length() > (128 ^ 132)) {
                                return;
                            }
                        } else {
                            String[] strArr6 = new String[llIllIlll[0]];
                            strArr6[llIllIlll[3]] = llIllIIll[llIllIlll[22]];
                            TileObjects.getNearest(strArr6).interact(llIllIIll[llIllIlll[23]]);
                        }
                    }
                    if (lIlllIIIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        String[] strArr7 = new String[llIllIlll[0]];
                        strArr7[llIllIlll[3]] = llIllIIll[llIllIlll[24]];
                        C0006g.a(strArr7);
                    }
                    if (lIlllIIIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount(C0004e.c(llIllIlll[25], llIllIlll[26]));
                        Time.sleepTicks(llIllIlll[9]);
                        "".length();
                        Dialog.close();
                    }
                }
            }
            if (lIlllIIIlllI(f(str) ? 1 : 0) && lIlllIIIllll(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                g(str);
            }
            if (lIlllIIIlllI(f(str) ? 1 : 0) && lIlllIIIlllI(Inventory.contains(item2 -> {
                if (lIlllIIIlllI(item2.getName().contains(llIllIIll[llIllIlll[205]]) ? 1 : 0) && lIlllIIIllll(item2.isNoted() ? 1 : 0)) {
                    ?? r0 = llIllIlll[0];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIllIlll[3];
            }) ? 1 : 0) && lIlllIIlIIIl(Vars.getBit(cZ), llIllIlll[15])) {
                if (lIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cX), llIllIlll[13]) && lIlllIIIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderGWD.c = llIllIIll[llIllIlll[27]];
                    Movement.walkTo(cX);
                    "".length();
                    Time.sleepTicks(llIllIlll[0]);
                    "".length();
                }
                if (lIlllIIlIlII(Players.getLocal().getWorldLocation().distanceTo(cX), llIllIlll[13])) {
                    if (lIlllIIlIIIl(Vars.getBit(cZ), llIllIlll[15]) && lIlllIIlIIII(Vars.getBit(cY), llIllIlll[27]) && lIlllIIlIIIl(C0004e.j(llIllIlll[1]), llIllIlll[2])) {
                        while (lIlllIIlIIII(Vars.getBit(cY), llIllIlll[27]) && lIlllIIlIIIl(C0004e.j(llIllIlll[1]), llIllIlll[2]) && lIlllIIIllll(AccBuilderGWD.d ? 1 : 0)) {
                            if (lIlllIIIlllI(Widgets.get(llIllIlll[28]).isEmpty() ? 1 : 0)) {
                                AccBuilderGWD.c = llIllIIll[llIllIlll[29]];
                                String[] strArr8 = new String[llIllIlll[0]];
                                strArr8[llIllIlll[3]] = llIllIIll[llIllIlll[30]];
                                TileObjects.getNearest(strArr8).interact(llIllIIll[llIllIlll[31]]);
                                Time.sleepTicks(llIllIlll[5]);
                                "".length();
                            }
                            if (lIlllIIIllll(Widgets.get(llIllIlll[28]).isEmpty() ? 1 : 0)) {
                                Widgets.get(llIllIlll[28], llIllIlll[4]).getChild(llIllIlll[7]);
                                Widget child = Widgets.get(llIllIlll[28], llIllIlll[9]).getChild(llIllIlll[9]);
                                if (lIlllIIlIIlI(child)) {
                                    AccBuilderGWD.c = llIllIIll[llIllIlll[32]];
                                    child.interact(llIllIIll[llIllIlll[33]]);
                                }
                                if (lIlllIIlIlIl(child)) {
                                    AccBuilderGWD.c = llIllIIll[llIllIlll[34]];
                                    Shop.buyFifty(llIllIIll[llIllIlll[35]]);
                                }
                            }
                            Time.sleepTicks(llIllIlll[4]);
                            "".length();
                            "".length();
                            if ((-" ".length()) != (-" ".length())) {
                                return;
                            }
                        }
                    }
                    if (lIlllIIlIIIl(Vars.getBit(cZ), llIllIlll[15]) && lIlllIIlIllI(Vars.getBit(cY)) && lIlllIIIllll(Inventory.isFull() ? 1 : 0)) {
                        AccBuilderGWD.c = llIllIIll[llIllIlll[36]];
                        if (lIlllIIIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            String[] strArr9 = new String[llIllIlll[0]];
                            strArr9[llIllIlll[3]] = llIllIIll[llIllIlll[37]];
                            TileObjects.getNearest(strArr9).interact(llIllIIll[llIllIlll[15]]);
                            Time.sleepTicks(llIllIlll[5]);
                            "".length();
                        }
                        if (lIlllIIIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            Dialog.enterAmount(C0004e.c(llIllIlll[38], llIllIlll[39]));
                        }
                    }
                    if (lIlllIIlIIII(Vars.getBit(cZ), llIllIlll[15])) {
                        int[] iArr3 = new int[llIllIlll[0]];
                        iArr3[llIllIlll[3]] = llIllIlll[16];
                        if (lIlllIIIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[40]];
                            if (lIlllIIIllll(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr10 = new String[llIllIlll[0]];
                                strArr10[llIllIlll[3]] = llIllIIll[llIllIlll[41]];
                                TileObject nearest2 = TileObjects.getNearest(strArr10);
                                String[] strArr11 = new String[llIllIlll[0]];
                                strArr11[llIllIlll[3]] = llIllIIll[llIllIlll[42]];
                                if (lIlllIIIlllI(nearest2.hasAction(strArr11) ? 1 : 0)) {
                                    String[] strArr12 = new String[llIllIlll[0]];
                                    strArr12[llIllIlll[3]] = llIllIIll[llIllIlll[43]];
                                    TileObjects.getNearest(strArr12).interact(llIllIIll[llIllIlll[44]]);
                                    Time.sleepTicks(llIllIlll[4]);
                                    "".length();
                                    "".length();
                                    if ((-" ".length()) >= 0) {
                                        return;
                                    }
                                } else {
                                    String[] strArr13 = new String[llIllIlll[0]];
                                    strArr13[llIllIlll[3]] = llIllIIll[llIllIlll[45]];
                                    TileObjects.getNearest(strArr13).interact(llIllIIll[llIllIlll[46]]);
                                }
                            }
                            if (lIlllIIIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                String[] strArr14 = new String[llIllIlll[0]];
                                strArr14[llIllIlll[3]] = llIllIIll[llIllIlll[47]];
                                C0006g.a(strArr14);
                            }
                            if (lIlllIIIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                Dialog.enterAmount(C0004e.c(llIllIlll[25], llIllIlll[26]));
                                Time.sleepTicks(llIllIlll[5]);
                                "".length();
                                Dialog.close();
                            }
                        }
                    }
                    if (lIlllIIIlllI(aQ() ? 1 : 0) && lIlllIIlIIIl(Vars.getBit(cZ), llIllIlll[15]) && lIlllIIlIIII(Vars.getBit(llIllIlll[48]), llIllIlll[0])) {
                        AccBuilderGWD.c = llIllIIll[llIllIlll[49]];
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr15 = new String[llIllIlll[0]];
                        strArr15[llIllIlll[3]] = llIllIIll[llIllIlll[50]];
                        if (lIlllIIlIIll(worldLocation.distanceTo(NPCs.getNearest(strArr15)), llIllIlll[0]) && lIlllIIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr16 = new String[llIllIlll[0]];
                            strArr16[llIllIlll[3]] = llIllIIll[llIllIlll[51]];
                            NPCs.getNearest(strArr16).interact(llIllIIll[llIllIlll[52]]);
                        }
                        if (lIlllIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr17 = new String[llIllIlll[0]];
                            strArr17[llIllIlll[3]] = llIllIIll[llIllIlll[53]];
                            NPCs.getNearest(strArr17).interact(llIllIIll[llIllIlll[54]]);
                            Time.sleepTicks(llIllIlll[4]);
                            "".length();
                        }
                        String[] strArr18 = new String[llIllIlll[5]];
                        strArr18[llIllIlll[3]] = llIllIIll[llIllIlll[55]];
                        strArr18[llIllIlll[0]] = llIllIIll[llIllIlll[56]];
                        strArr18[llIllIlll[4]] = llIllIIll[llIllIlll[57]];
                        C0006g.a(strArr18);
                    }
                    if (lIlllIIlIIIl(Vars.getBit(llIllIlll[58]), llIllIlll[15]) && lIlllIIlIllI(Vars.getBit(llIllIlll[48]))) {
                        if (lIlllIIIlllI(Widgets.get(llIllIlll[59]).isEmpty() ? 1 : 0)) {
                            String[] strArr19 = new String[llIllIlll[0]];
                            strArr19[llIllIlll[3]] = llIllIIll[llIllIlll[60]];
                            TileObjects.getNearest(strArr19).interact(llIllIIll[llIllIlll[61]]);
                            Time.sleepTicks(llIllIlll[5]);
                            "".length();
                        }
                        if (lIlllIIIllll(Widgets.get(llIllIlll[59]).isEmpty() ? 1 : 0)) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[62]];
                            Widget widget = Widgets.get(llIllIlll[59], llIllIlll[9]);
                            int i = llIllIlll[63];
                            int i2 = llIllIlll[64];
                            int i3 = llIllIlll[3];
                            int i4 = llIllIlll[3];
                            Widget[] children = Widgets.get(llIllIlll[59], llIllIlll[18]).getChildren();
                            int i5 = llIllIlll[3];
                            while (lIlllIIlIIII(i5, children.length)) {
                                if (lIlllIIlIlll(children[i5].getTextColor(), i2)) {
                                    i4++;
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                } else {
                                    i3++;
                                }
                                i5++;
                                "".length();
                                if ((((((178 + 62) - 37) + 46) ^ (((90 + 138) - 53) + 16)) & (((107 ^ 102) ^ (59 ^ 112)) ^ (-" ".length()))) < (((((60 + 144) - 76) + 50) ^ (((139 + 106) - 148) + 90)) & (((((72 + 3) - 65) + 125) ^ (((42 + 98) - 72) + 74)) ^ (-" ".length())))) {
                                    return;
                                }
                            }
                            if (lIlllIIlIIll(i4, llIllIlll[8])) {
                                Widget widget2 = Widgets.get(llIllIlll[59], llIllIlll[11]);
                                if (lIlllIIlIIlI(widget2)) {
                                    Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) llIllIlll[0]);
                                    Time.sleepTicks(llIllIlll[0]);
                                    "".length();
                                }
                            }
                            if (lIlllIIlIIII(i4, llIllIlll[8])) {
                                int i6 = llIllIlll[3];
                                int i7 = llIllIlll[3];
                                int i8 = llIllIlll[3];
                                int i9 = llIllIlll[3];
                                int lIIIlIIIlIIIIl = llIllIlll[3];
                                int i10 = llIllIlll[3];
                                while (lIlllIIlIIII(i10, children.length)) {
                                    if (lIlllIIIlllI(children[i10].getName().contains(llIllIIll[llIllIlll[65]]) ? 1 : 0) && lIlllIIIllll(i6)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[66]];
                                        children[i10].interact(llIllIIll[llIllIlll[67]]);
                                        Time.sleepTicks(llIllIlll[0]);
                                        "".length();
                                        i6 = llIllIlll[0];
                                    }
                                    if (lIlllIIIlllI(children[i10].getName().contains(llIllIIll[llIllIlll[68]]) ? 1 : 0) && lIlllIIIllll(i7)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[69]];
                                        children[i10].interact(llIllIIll[llIllIlll[70]]);
                                        Time.sleepTicks(llIllIlll[0]);
                                        "".length();
                                        i7 = llIllIlll[0];
                                    }
                                    if (lIlllIIIlllI(children[i10].getName().contains(llIllIIll[llIllIlll[71]]) ? 1 : 0) && lIlllIIIllll(i8)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[72]];
                                        children[i10].interact(llIllIIll[llIllIlll[73]]);
                                        Time.sleepTicks(llIllIlll[0]);
                                        "".length();
                                        i8 = llIllIlll[0];
                                    }
                                    if (lIlllIIIlllI(children[i10].getName().contains(llIllIIll[llIllIlll[74]]) ? 1 : 0) && lIlllIIIllll(i9)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[75]];
                                        children[i10].interact(llIllIIll[llIllIlll[76]]);
                                        Time.sleepTicks(llIllIlll[0]);
                                        "".length();
                                        i9 = llIllIlll[0];
                                    }
                                    if (lIlllIIIlllI(children[i10].getName().contains(llIllIIll[llIllIlll[77]]) ? 1 : 0) && lIlllIIIllll(lIIIlIIIlIIIIl)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[78]];
                                        children[i10].interact(llIllIIll[llIllIlll[79]]);
                                        Time.sleepTicks(llIllIlll[0]);
                                        "".length();
                                        lIIIlIIIlIIIIl = llIllIlll[0];
                                    }
                                    i10++;
                                    "".length();
                                    if (!((true ^ true) ^ (true ^ true))) {
                                        return;
                                    }
                                }
                            }
                            if (lIlllIIlIlll(i4, llIllIlll[8])) {
                                AccBuilderGWD.c = llIllIIll[llIllIlll[80]];
                                if (lIlllIIlIIlI(widget)) {
                                    Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llIllIlll[0]);
                                    Time.sleepTicks(llIllIlll[8]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                String[] strArr20 = new String[llIllIlll[0]];
                strArr20[llIllIlll[3]] = llIllIIll[llIllIlll[81]];
                if (lIlllIIlIIlI(NPCs.getNearest(strArr20))) {
                    cT = null;
                }
                if (lIlllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && lIlllIIlIlIl(cT)) {
                    Time.sleepTicks(llIllIlll[7]);
                    "".length();
                    System.out.println(llIllIIll[llIllIlll[82]]);
                    cT = Players.getLocal().getWorldLocation();
                    cU = new WorldPoint(cT.getX() - C0004e.c(llIllIlll[0], llIllIlll[5]), cT.getY() + C0004e.c(llIllIlll[19], llIllIlll[21]), cT.getPlane());
                }
                if (lIlllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && lIlllIIlIIlI(cT)) {
                    if (lIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cU), llIllIlll[5])) {
                        String[] strArr21 = new String[llIllIlll[0]];
                        strArr21[llIllIlll[3]] = llIllIIll[llIllIlll[83]];
                        if (lIlllIIlIlIl(TileObjects.getNearest(strArr21))) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[84]];
                            C0004e.c(cU);
                            Time.sleepTicks(llIllIlll[0]);
                            "".length();
                        }
                    }
                    if (lIlllIIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), llIllIlll[5])) {
                        String[] strArr22 = new String[llIllIlll[0]];
                        strArr22[llIllIlll[3]] = llIllIIll[llIllIlll[85]];
                        if (lIlllIIlIlIl(TileObjects.getNearest(strArr22))) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[86]];
                            List all = NPCs.getAll(npc -> {
                                return npc.getName().contains(llIllIIll[llIllIlll[204]]);
                            });
                            if (lIlllIIlIIIl(all.size(), llIllIlll[5]) && lIlllIIlIlIl(Players.getLocal().getInteracting())) {
                                ((NPC) all.get(llIllIlll[3])).interact(llIllIIll[llIllIlll[87]]);
                                Time.sleepTicks(llIllIlll[4]);
                                "".length();
                            }
                            Item first = Inventory.getFirst(item3 -> {
                                return item3.getName().contains(llIllIIll[llIllIlll[203]]);
                            });
                            if (lIlllIIlIIlI(first) && lIlllIIlIlll(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlllIIlIIIl(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlll[65])) {
                                first.interact(llIllIIll[llIllIlll[88]]);
                                Time.sleepTicks(llIllIlll[5]);
                                "".length();
                                Time.sleepTicks(llIllIlll[20]);
                                "".length();
                            }
                        }
                    }
                    if (lIlllIIIllll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && lIlllIIlIllI(Prayers.getPoints())) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (!lIlllIIlIlIl(NPCs.getNearest(npc2 -> {
                    return npc2.getName().contains(llIllIIll[llIllIlll[202]]);
                })) || lIlllIIlIIlI(NPCs.getNearest(npc3 -> {
                    return npc3.getName().contains(llIllIIll[llIllIlll[162]]);
                }))) {
                    C0004e.F();
                    if (lIlllIIIlllI(Equipment.contains(item4 -> {
                        if (lIlllIIlIlll(item4.getId(), llIllIlll[102])) {
                            ?? r0 = llIllIlll[0];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIllIlll[3];
                    }) ? 1 : 0)) {
                        if (lIlllIIllIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
                        }
                        String[] strArr23 = new String[llIllIlll[0]];
                        strArr23[llIllIlll[3]] = llIllIIll[llIllIlll[89]];
                        if (lIlllIIlIIlI(TileObjects.getNearest(strArr23))) {
                            String[] strArr24 = new String[llIllIlll[0]];
                            strArr24[llIllIlll[3]] = llIllIIll[llIllIlll[90]];
                            TileObjects.getNearest(strArr24).interact(llIllIIll[llIllIlll[91]]);
                            Time.sleepTicks(llIllIlll[5]);
                            "".length();
                        }
                        if (lIlllIIlIIIl(Combat.getSpecEnergy(), llIllIlll[62]) && lIlllIIIllll(Combat.isSpecEnabled() ? 1 : 0)) {
                            int[] iArr4 = new int[llIllIlll[0]];
                            iArr4[llIllIlll[3]] = llIllIlll[92];
                            if (lIlllIIIlllI(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llIllIlll[0]];
                                iArr5[llIllIlll[3]] = llIllIlll[92];
                                if (lIlllIIlIIIl(Equipment.getFirst(iArr5).getQuantity(), llIllIlll[4])) {
                                    Combat.toggleSpec();
                                }
                            }
                        }
                    }
                    if (lIlllIIlIIII(Prayers.getPoints(), llIllIlll[27]) && lIlllIIIlllI(Inventory.contains(item5 -> {
                        return item5.getName().contains(llIllIIll[llIllIlll[201]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item6 -> {
                            return item6.getName().contains(llIllIIll[llIllIlll[200]]);
                        }).interact(llIllIIll[llIllIlll[93]]);
                        Time.sleepTicks(llIllIlll[0]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIlllIIlIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlllIIlIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bf, code lost:
        if (lIlllIIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0016q.llIllIlll[13]) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0642, code lost:
        if (lIlllIIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0016q.llIllIlll[126(0x7e, float:1.77E-43)]) != false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x075c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(String str) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[161]]) ? 1 : 0)) {
            int[] iArr9 = new int[llIllIlll[0]];
            iArr9[llIllIlll[3]] = llIllIlll[146];
            if (lIlllIIIllll(Bank.contains(iArr9) ? 1 : 0)) {
                bx.add(new C0003d(llIllIlll[146], llIllIlll[162], llIllIlll[163]));
                "".length();
            }
        }
        int[] iArr10 = new int[llIllIlll[0]];
        iArr10[llIllIlll[3]] = llIllIlll[152];
        if (lIlllIIIlllI(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[llIllIlll[0]];
            iArr11[llIllIlll[3]] = llIllIlll[152];
            if (lIlllIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIllIlll[0]];
                iArr12[llIllIlll[3]] = llIllIlll[152];
            }
            iArr = new int[llIllIlll[0]];
            iArr[llIllIlll[3]] = llIllIlll[164];
            if (lIlllIIIllll(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llIllIlll[164], llIllIlll[13], llIllIlll[165]));
                "".length();
            }
            iArr2 = new int[llIllIlll[0]];
            iArr2[llIllIlll[3]] = llIllIlll[153];
            if (lIlllIIIllll(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(llIllIlll[153], llIllIlll[50], llIllIlll[166]));
                "".length();
            }
            iArr3 = new int[llIllIlll[0]];
            iArr3[llIllIlll[3]] = llIllIlll[151];
            if (lIlllIIIllll(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(llIllIlll[151], llIllIlll[50], llIllIlll[166]));
                "".length();
            }
            if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[167]]) ? 1 : 0)) {
                int[] iArr13 = new int[llIllIlll[0]];
                iArr13[llIllIlll[3]] = llIllIlll[105];
                if (lIlllIIIllll(Bank.contains(iArr13) ? 1 : 0)) {
                    bx.add(new C0003d(llIllIlll[105], llIllIlll[0], llIllIlll[168]));
                    "".length();
                }
                if (lIlllIIlIIIl(Skills.getLevel(Skill.ATTACK), llIllIlll[74]) && lIlllIIlIIIl(Skills.getLevel(Skill.DEFENCE), llIllIlll[74]) && lIlllIIlIIIl(Skills.getLevel(Skill.STRENGTH), llIllIlll[74])) {
                    int[] iArr14 = new int[llIllIlll[0]];
                    iArr14[llIllIlll[3]] = llIllIlll[111];
                    if (lIlllIIIllll(Bank.contains(iArr14) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[111], llIllIlll[0], C0004e.c(llIllIlll[169], llIllIlll[170])));
                        "".length();
                    }
                    int[] iArr15 = new int[llIllIlll[0]];
                    iArr15[llIllIlll[3]] = llIllIlll[171];
                    if (lIlllIIIllll(Bank.contains(iArr15) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[171], llIllIlll[0], C0004e.c(llIllIlll[172], llIllIlll[173])));
                        "".length();
                    }
                    int[] iArr16 = new int[llIllIlll[0]];
                    iArr16[llIllIlll[3]] = llIllIlll[116];
                    if (lIlllIIIllll(Bank.contains(iArr16) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[116], llIllIlll[0], C0004e.c(llIllIlll[174], llIllIlll[175])));
                        "".length();
                    }
                    int[] iArr17 = new int[llIllIlll[0]];
                    iArr17[llIllIlll[3]] = llIllIlll[114];
                    if (lIlllIIIllll(Bank.contains(iArr17) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[114], llIllIlll[0], C0004e.c(llIllIlll[174], llIllIlll[175])));
                        "".length();
                    }
                    int[] iArr18 = new int[llIllIlll[0]];
                    iArr18[llIllIlll[3]] = llIllIlll[112];
                    if (lIlllIIIllll(Bank.contains(iArr18) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[112], llIllIlll[0], C0004e.c(llIllIlll[176], llIllIlll[177])));
                        "".length();
                    }
                    int[] iArr19 = new int[llIllIlll[0]];
                    iArr19[llIllIlll[3]] = llIllIlll[113];
                    if (lIlllIIIllll(Bank.contains(iArr19) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[113], llIllIlll[0], C0004e.c(llIllIlll[178], llIllIlll[179])));
                        "".length();
                    }
                    int[] iArr20 = new int[llIllIlll[0]];
                    iArr20[llIllIlll[3]] = llIllIlll[115];
                    if (lIlllIIIllll(Bank.contains(iArr20) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[115], llIllIlll[0], C0004e.c(llIllIlll[180], llIllIlll[181])));
                        "".length();
                    }
                    int[] iArr21 = new int[llIllIlll[0]];
                    iArr21[llIllIlll[3]] = llIllIlll[117];
                    if (lIlllIIIllll(Bank.contains(iArr21) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[117], llIllIlll[0], C0004e.c(llIllIlll[182], llIllIlll[183])));
                        "".length();
                    }
                }
            }
            if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[184]]) ? 1 : 0)) {
                return;
            }
            int[] iArr22 = new int[llIllIlll[0]];
            iArr22[llIllIlll[3]] = llIllIlll[103];
            if (lIlllIIIllll(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIllIlll[0]];
                iArr23[llIllIlll[3]] = llIllIlll[103];
                if (lIlllIIIllll(Equipment.contains(iArr23) ? 1 : 0)) {
                    bx.add(new C0003d(llIllIlll[103], llIllIlll[0], C0004e.c(llIllIlll[185], llIllIlll[186])));
                    "".length();
                }
            }
            int[] iArr24 = new int[llIllIlll[0]];
            iArr24[llIllIlll[3]] = llIllIlll[100];
            if (lIlllIIIllll(Bank.contains(iArr24) ? 1 : 0)) {
                bx.add(new C0003d(llIllIlll[100], llIllIlll[4], llIllIlll[187]));
                "".length();
            }
            int[] iArr25 = new int[llIllIlll[0]];
            iArr25[llIllIlll[3]] = llIllIlll[98];
            if (lIlllIIIllll(Bank.contains(iArr25) ? 1 : 0)) {
                bx.add(new C0003d(llIllIlll[98], llIllIlll[4], llIllIlll[187]));
                "".length();
            }
            int[] iArr26 = new int[llIllIlll[0]];
            iArr26[llIllIlll[3]] = llIllIlll[92];
            if (lIlllIIIlllI(Bank.contains(iArr26) ? 1 : 0)) {
                int[] iArr27 = new int[llIllIlll[0]];
                iArr27[llIllIlll[3]] = llIllIlll[92];
                if (lIlllIIIlllI(Bank.contains(iArr27) ? 1 : 0)) {
                    int[] iArr28 = new int[llIllIlll[0]];
                    iArr28[llIllIlll[3]] = llIllIlll[92];
                }
                iArr4 = new int[llIllIlll[0]];
                iArr4[llIllIlll[3]] = llIllIlll[102];
                if (lIlllIIIllll(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr29 = new int[llIllIlll[0]];
                    iArr29[llIllIlll[3]] = llIllIlll[102];
                    if (lIlllIIIllll(Equipment.contains(iArr29) ? 1 : 0)) {
                        int[] iArr30 = new int[llIllIlll[0]];
                        iArr30[llIllIlll[3]] = llIllIlll[122];
                        if (lIlllIIIllll(Bank.contains(iArr30) ? 1 : 0)) {
                            bx.add(new C0003d(llIllIlll[122], llIllIlll[0], C0004e.c(llIllIlll[191], llIllIlll[192])));
                            "".length();
                        }
                        int[] iArr31 = new int[llIllIlll[0]];
                        iArr31[llIllIlll[3]] = llIllIlll[101];
                        if (lIlllIIIllll(Bank.contains(iArr31) ? 1 : 0)) {
                            bx.add(new C0003d(llIllIlll[101], llIllIlll[4], llIllIlll[187]));
                            "".length();
                        }
                    }
                }
                if (lIlllIIlIIII(Skills.getBoostedLevel(Skill.RANGED), llIllIlll[74])) {
                    int[] iArr32 = new int[llIllIlll[0]];
                    iArr32[llIllIlll[3]] = llIllIlll[97];
                    if (lIlllIIIllll(Bank.contains(iArr32) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[97], llIllIlll[4], llIllIlll[187]));
                        "".length();
                    }
                    int[] iArr33 = new int[llIllIlll[0]];
                    iArr33[llIllIlll[3]] = llIllIlll[97];
                    if (lIlllIIIlllI(Bank.contains(iArr33) ? 1 : 0)) {
                        int[] iArr34 = new int[llIllIlll[0]];
                        iArr34[llIllIlll[3]] = llIllIlll[97];
                        if (lIlllIIlIIII(Bank.getFirst(iArr34).getQuantity(), llIllIlll[4])) {
                            int i = llIllIlll[97];
                            int i2 = llIllIlll[4];
                            int[] iArr35 = new int[llIllIlll[0]];
                            iArr35[llIllIlll[3]] = llIllIlll[97];
                            bx.add(new C0003d(i, i2 - Bank.getFirst(iArr35).getQuantity(), llIllIlll[187]));
                            "".length();
                        }
                    }
                    int[] iArr36 = new int[llIllIlll[0]];
                    iArr36[llIllIlll[3]] = llIllIlll[96];
                    if (lIlllIIIllll(Bank.contains(iArr36) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[96], llIllIlll[4], llIllIlll[187]));
                        "".length();
                    }
                    int[] iArr37 = new int[llIllIlll[0]];
                    iArr37[llIllIlll[3]] = llIllIlll[96];
                    if (lIlllIIIlllI(Bank.contains(iArr37) ? 1 : 0)) {
                        int[] iArr38 = new int[llIllIlll[0]];
                        iArr38[llIllIlll[3]] = llIllIlll[96];
                        if (lIlllIIlIIII(Bank.getFirst(iArr38).getQuantity(), llIllIlll[4])) {
                            int i3 = llIllIlll[96];
                            int i4 = llIllIlll[4];
                            int[] iArr39 = new int[llIllIlll[0]];
                            iArr39[llIllIlll[3]] = llIllIlll[96];
                            bx.add(new C0003d(i3, i4 - Bank.getFirst(iArr39).getQuantity(), llIllIlll[187]));
                            "".length();
                        }
                    }
                }
                if (lIlllIIlIIIl(Skills.getLevel(Skill.RANGED), llIllIlll[74]) && lIlllIIlIIII(Skills.getLevel(Skill.RANGED), llIllIlll[84])) {
                    iArr5 = new int[llIllIlll[0]];
                    iArr5[llIllIlll[3]] = llIllIlll[107];
                    if (lIlllIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[107], llIllIlll[4], llIllIlll[193]));
                        "".length();
                    }
                    iArr6 = new int[llIllIlll[0]];
                    iArr6[llIllIlll[3]] = llIllIlll[107];
                    if (lIlllIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr40 = new int[llIllIlll[0]];
                        iArr40[llIllIlll[3]] = llIllIlll[107];
                        if (lIlllIIlIIII(Bank.getFirst(iArr40).getQuantity(), llIllIlll[4])) {
                            int i5 = llIllIlll[107];
                            int i6 = llIllIlll[4];
                            int[] iArr41 = new int[llIllIlll[0]];
                            iArr41[llIllIlll[3]] = llIllIlll[107];
                            bx.add(new C0003d(i5, i6 - Bank.getFirst(iArr41).getQuantity(), llIllIlll[193]));
                            "".length();
                        }
                    }
                    iArr7 = new int[llIllIlll[0]];
                    iArr7[llIllIlll[3]] = llIllIlll[106];
                    if (lIlllIIIllll(Bank.contains(iArr7) ? 1 : 0)) {
                        bx.add(new C0003d(llIllIlll[106], llIllIlll[4], llIllIlll[194]));
                        "".length();
                    }
                    iArr8 = new int[llIllIlll[0]];
                    iArr8[llIllIlll[3]] = llIllIlll[106];
                    if (lIlllIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr42 = new int[llIllIlll[0]];
                        iArr42[llIllIlll[3]] = llIllIlll[106];
                        if (lIlllIIlIIII(Bank.getFirst(iArr42).getQuantity(), llIllIlll[4])) {
                            int i7 = llIllIlll[106];
                            int i8 = llIllIlll[4];
                            int[] iArr43 = new int[llIllIlll[0]];
                            iArr43[llIllIlll[3]] = llIllIlll[106];
                            bx.add(new C0003d(i7, i8 - Bank.getFirst(iArr43).getQuantity(), llIllIlll[194]));
                            "".length();
                        }
                    }
                }
                if (lIlllIIlIIIl(Skills.getLevel(Skill.RANGED), llIllIlll[84])) {
                    return;
                }
                int[] iArr44 = new int[llIllIlll[0]];
                iArr44[llIllIlll[3]] = llIllIlll[109];
                if (lIlllIIIllll(Bank.contains(iArr44) ? 1 : 0)) {
                    bx.add(new C0003d(llIllIlll[109], llIllIlll[4], llIllIlll[193]));
                    "".length();
                }
                int[] iArr45 = new int[llIllIlll[0]];
                iArr45[llIllIlll[3]] = llIllIlll[109];
                if (lIlllIIIlllI(Bank.contains(iArr45) ? 1 : 0)) {
                    int[] iArr46 = new int[llIllIlll[0]];
                    iArr46[llIllIlll[3]] = llIllIlll[109];
                    if (lIlllIIlIIII(Bank.getFirst(iArr46).getQuantity(), llIllIlll[4])) {
                        int i9 = llIllIlll[109];
                        int i10 = llIllIlll[4];
                        int[] iArr47 = new int[llIllIlll[0]];
                        iArr47[llIllIlll[3]] = llIllIlll[109];
                        bx.add(new C0003d(i9, i10 - Bank.getFirst(iArr47).getQuantity(), llIllIlll[193]));
                        "".length();
                    }
                }
                int[] iArr48 = new int[llIllIlll[0]];
                iArr48[llIllIlll[3]] = llIllIlll[108];
                if (lIlllIIIllll(Bank.contains(iArr48) ? 1 : 0)) {
                    bx.add(new C0003d(llIllIlll[108], llIllIlll[4], llIllIlll[6]));
                    "".length();
                }
                int[] iArr49 = new int[llIllIlll[0]];
                iArr49[llIllIlll[3]] = llIllIlll[108];
                if (lIlllIIIlllI(Bank.contains(iArr49) ? 1 : 0)) {
                    int[] iArr50 = new int[llIllIlll[0]];
                    iArr50[llIllIlll[3]] = llIllIlll[108];
                    if (lIlllIIlIIII(Bank.getFirst(iArr50).getQuantity(), llIllIlll[4])) {
                        int i11 = llIllIlll[108];
                        int i12 = llIllIlll[4];
                        int[] iArr51 = new int[llIllIlll[0]];
                        iArr51[llIllIlll[3]] = llIllIlll[108];
                        bx.add(new C0003d(i11, i12 - Bank.getFirst(iArr51).getQuantity(), llIllIlll[6]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bx.add(new C0003d(llIllIlll[92], llIllIlll[188], C0004e.c(llIllIlll[189], llIllIlll[190])));
            "".length();
            iArr4 = new int[llIllIlll[0]];
            iArr4[llIllIlll[3]] = llIllIlll[102];
            if (lIlllIIIllll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            if (lIlllIIlIIII(Skills.getBoostedLevel(Skill.RANGED), llIllIlll[74])) {
            }
            if (lIlllIIlIIIl(Skills.getLevel(Skill.RANGED), llIllIlll[74])) {
                iArr5 = new int[llIllIlll[0]];
                iArr5[llIllIlll[3]] = llIllIlll[107];
                if (lIlllIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[llIllIlll[0]];
                iArr6[llIllIlll[3]] = llIllIlll[107];
                if (lIlllIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[llIllIlll[0]];
                iArr7[llIllIlll[3]] = llIllIlll[106];
                if (lIlllIIIllll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[llIllIlll[0]];
                iArr8[llIllIlll[3]] = llIllIlll[106];
                if (lIlllIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                }
            }
            if (lIlllIIlIIIl(Skills.getLevel(Skill.RANGED), llIllIlll[84])) {
            }
        }
        bx.add(new C0003d(llIllIlll[152], llIllIlll[13], C0009j.ch));
        "".length();
        iArr = new int[llIllIlll[0]];
        iArr[llIllIlll[3]] = llIllIlll[164];
        if (lIlllIIIllll(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIllIlll[0]];
        iArr2[llIllIlll[3]] = llIllIlll[153];
        if (lIlllIIIllll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIllIlll[0]];
        iArr3[llIllIlll[3]] = llIllIlll[151];
        if (lIlllIIIllll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[167]]) ? 1 : 0)) {
        }
        if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[184]]) ? 1 : 0)) {
        }
    }

    private static void aR() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(llIllIIll[llIllIlll[197]]);
        });
        Item first2 = Inventory.getFirst(item2 -> {
            return item2.getName().contains(llIllIIll[llIllIlll[196]]);
        });
        if (lIlllIIlIIlI(first2) && lIlllIIlIlll(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlllIIlIIIl(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlll[65])) {
            first2.interact(llIllIIll[llIllIlll[154]]);
            Time.sleepTicks(llIllIlll[5]);
            "".length();
            if (lIlllIIlIIlI(first)) {
                first.interact(llIllIIll[llIllIlll[155]]);
                Time.sleepTicks(llIllIlll[0]);
                "".length();
            }
            Time.sleepTicks(llIllIlll[20]);
            "".length();
        }
        if (lIlllIIlIIlI(first) && lIlllIIlIlII(Vars.getBit(llIllIlll[156]), llIllIlll[62]) && lIlllIIllIIl(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlllIIlIIII(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlll[65])) {
            while (true) {
                if (!lIlllIIlIIII(Vars.getBit(llIllIlll[156]), llIllIlll[157])) {
                    break;
                }
                if (lIlllIIlIIlI(first)) {
                    first.interact(llIllIIll[llIllIlll[158]]);
                    Time.sleepTicks(llIllIlll[0]);
                    "".length();
                }
                first = Inventory.getFirst(item3 -> {
                    return item3.getName().contains(llIllIIll[llIllIlll[195]]);
                });
                if (lIlllIIlIlIl(first)) {
                    "".length();
                    if ((-"   ".length()) >= 0) {
                        return;
                    }
                }
            }
        }
        String[] strArr = new String[llIllIlll[0]];
        strArr[llIllIlll[3]] = llIllIIll[llIllIlll[159]];
        Item first3 = Inventory.getFirst(strArr);
        if (lIlllIIlIIlI(first3) && lIlllIIllIIl(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlllIIlIIII(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlll[65]) && lIlllIIlIIll(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlll[0])) {
            first3.interact(llIllIIll[llIllIlll[160]]);
            cK = C0004e.c(llIllIlll[0], llIllIlll[4]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    static boolean aQ() {
        if ((!lIlllIIIlllI(Inventory.contains(item -> {
            return item.getName().contains(llIllIIll[llIllIlll[208]]);
        }) ? 1 : 0) || (lIlllIIIllll(Inventory.isFull() ? 1 : 0) && (!lIlllIIlIIII(Vars.getBit(cY), llIllIlll[0]) || lIlllIIlIIIl(Vars.getBit(llIllIlll[1]), llIllIlll[2])))) && !(lIlllIIlIIII(Vars.getBit(cY), llIllIlll[0]) && lIlllIIlIIII(Vars.getBit(llIllIlll[1]), llIllIlll[2]))) {
            return llIllIlll[3];
        }
        ?? r0 = llIllIlll[0];
        "".length();
        return (-"  ".length()) > 0 ? ((23 ^ 123) ^ (172 ^ 148)) & (((226 ^ 158) ^ (124 ^ 84)) ^ (-" ".length())) : r0;
    }

    static {
        lIlllIIIllIl();
        lIlllIIIlIIl();
        bx = new ArrayList();
        cT = null;
        cU = null;
        cV = new WorldArea(llIllIlll[209], llIllIlll[210], llIllIlll[37], llIllIlll[46], llIllIlll[3]);
        cW = new WorldPoint(llIllIlll[211], llIllIlll[212], llIllIlll[3]);
        cX = new WorldPoint(llIllIlll[213], llIllIlll[214], llIllIlll[3]);
        cY = llIllIlll[215];
        cZ = llIllIlll[58];
        da = llIllIlll[3];
        cK = C0004e.c(llIllIlll[0], llIllIlll[4]);
        int[] iArr = new int[llIllIlll[12]];
        iArr[llIllIlll[3]] = llIllIlll[111];
        iArr[llIllIlll[0]] = llIllIlll[117];
        iArr[llIllIlll[4]] = llIllIlll[114];
        iArr[llIllIlll[5]] = llIllIlll[112];
        iArr[llIllIlll[7]] = llIllIlll[113];
        iArr[llIllIlll[8]] = llIllIlll[116];
        iArr[llIllIlll[9]] = llIllIlll[115];
        iArr[llIllIlll[10]] = llIllIlll[105];
        iArr[llIllIlll[11]] = llIllIlll[171];
        db = iArr;
    }

    private static void lIlllIIIlIIl() {
        llIllIIll = new String[llIllIlll[216]];
        llIllIIll[llIllIlll[3]] = lIlllIIIIllI("U5YR3mQRu9W4kXQV9pQNFw==", "dleNF");
        llIllIIll[llIllIlll[0]] = lIlllIIIIllI("ZSZs/G3cr4pKk6DXPjqeE++/PC3EVo9fTsQT5yonMSZTRUjPvjZzLXCJl+my9tWkhj9oGT6wvTU=", "sHqQX");
        llIllIIll[llIllIlll[4]] = lIlllIIIIlll("Ox8zLA8H", "kpAXn");
        llIllIIll[llIllIlll[5]] = lIlllIIIIlll("CxMWECMtUjIFPTs=", "HredO");
        llIllIIll[llIllIlll[7]] = lIlllIIIIlll("AAMSKA==", "WfsZy");
        llIllIIll[llIllIlll[8]] = lIlllIIIlIII("7oM5YerQ/2p0p51madTgGoBZ99+Wnfnd", "bzAhe");
        llIllIIll[llIllIlll[9]] = lIlllIIIIlll("AxczIQI9", "SxGHm");
        llIllIIll[llIllIlll[10]] = lIlllIIIIllI("AsSfLyqRvvo=", "OtShb");
        llIllIIll[llIllIlll[11]] = lIlllIIIlIII("fpeNKme42Xw=", "OLzbW");
        llIllIIll[llIllIlll[12]] = lIlllIIIIllI("JXQjTzuvQQE=", "YArPo");
        llIllIIll[llIllIlll[13]] = lIlllIIIlIII("hdLS/lulHn8=", "efwaD");
        llIllIIll[llIllIlll[14]] = lIlllIIIIllI("/gQZWqXz3vM=", "eMybN");
        llIllIIll[llIllIlll[17]] = lIlllIIIlIII("mJ1rpdEsg2flqs665Its5w==", "NnQPK");
        llIllIIll[llIllIlll[18]] = lIlllIIIIlll("FyYoOSY6KmIjaDAmIzYtIQ==", "SIEPH");
        llIllIIll[llIllIlll[19]] = lIlllIIIIllI("DUTiyPFY1DU=", "NwVOF");
        llIllIIll[llIllIlll[20]] = lIlllIIIIlll("CB8rPDclE2EmeS8fIDM8Pg==", "LpFUY");
        llIllIIll[llIllIlll[21]] = lIlllIIIlIII("YJ7955HboHE=", "RNuHe");
        llIllIIll[llIllIlll[22]] = lIlllIIIlIII("32uwA3titM2FnH9o+qkm3Jw6LhqhzgOV", "mCwaO");
        llIllIIll[llIllIlll[23]] = lIlllIIIIlll("Hwoq", "JyOKM");
        llIllIIll[llIllIlll[24]] = lIlllIIIIlll("HQ4CLj8wH1IsIzcOC28=", "YkrAL");
        llIllIIll[llIllIlll[27]] = lIlllIIIIllI("8AjzvMlJ3IHZ2BOlCCBwI5xsQUJzT84m", "mfIpT");
        llIllIIll[llIllIlll[29]] = lIlllIIIIllI("Fv+gKjlww4ty6yQv4xLi/g==", "ruyLH");
        llIllIIll[llIllIlll[30]] = lIlllIIIIllI("eKS1sS1pxUnLTBbqIZttAA==", "VOvyv");
        llIllIIll[llIllIlll[31]] = lIlllIIIIlll("MSkOCyEK", "bLoyB");
        llIllIIll[llIllIlll[32]] = lIlllIIIIllI("vKpF5DEuWPw=", "kFnPy");
        llIllIIll[llIllIlll[33]] = lIlllIIIIllI("N2VD+mjlDNA=", "rCkil");
        llIllIIll[llIllIlll[34]] = lIlllIIIlIII("kK3S8hv601U=", "GECwy");
        llIllIIll[llIllIlll[35]] = lIlllIIIlIII("ZUrw0Qdycuvk4aZzYBKFhQ==", "CmmXf");
        llIllIIll[llIllIlll[36]] = lIlllIIIlIII("4aLpSiMrnlM2Rb/CZojt+j1vg2ihlzOD", "MRwpH");
        llIllIIll[llIllIlll[37]] = lIlllIIIIlll("HBEQOzk8BhFpJTwTHCY7", "SguIU");
        llIllIIll[llIllIlll[15]] = lIlllIIIlIII("86iBDNPnICw=", "ajdty");
        llIllIIll[llIllIlll[40]] = lIlllIIIlIII("FbbRa1cSVJ74gjPqQlExMA==", "dfEBL");
        llIllIIll[llIllIlll[41]] = lIlllIIIlIII("jNwge3+926yEB356se8m8Ti/5V85zyRo", "uzHWc");
        llIllIIll[llIllIlll[42]] = lIlllIIIIllI("S+B+4JYJFVU=", "sGfzv");
        llIllIIll[llIllIlll[43]] = lIlllIIIIlll("JT8MHisIM0YEZQI/BxEgEw==", "aPawE");
        llIllIIll[llIllIlll[44]] = lIlllIIIIllI("fpIzeo2FnNw=", "lSRso");
        llIllIIll[llIllIlll[45]] = lIlllIIIIllI("fproZdYy896zbAZVb91ViYy7LwbwSgMM", "Uezrj");
        llIllIIll[llIllIlll[46]] = lIlllIIIIlll("ISss", "tXIMz");
        llIllIIll[llIllIlll[47]] = lIlllIIIIllI("4Wc4dVJqUBIHnNXztbz+Dw==", "ZRinp");
        llIllIIll[llIllIlll[49]] = lIlllIIIIlll("OhgOLDwQBAxtLAsPCiA=", "yjkMH");
        llIllIIll[llIllIlll[50]] = lIlllIIIlIII("Gfjx5676eSh8NwSialQwzQ==", "qzYRf");
        llIllIIll[llIllIlll[51]] = lIlllIIIIlll("NyQIJDYaKEUCNhokCw==", "sKeMX");
        llIllIIll[llIllIlll[52]] = lIlllIIIlIII("plhIk5ZZ6Pg=", "FavtA");
        llIllIIll[llIllIlll[53]] = lIlllIIIIlll("ICoZAgMNJlQkAw0qGg==", "dEtkm");
        llIllIIll[llIllIlll[54]] = lIlllIIIIllI("zIRut8iQLzc=", "CgLiK");
        llIllIIll[llIllIlll[55]] = lIlllIIIlIII("1zBDlaVaRcs=", "BZrjn");
        llIllIIll[llIllIlll[56]] = lIlllIIIIlll("CRIKGzwnDgoOMSYCWUJzIgYLCw==", "JgyoS");
        llIllIIll[llIllIlll[57]] = lIlllIIIlIII("5coVPgLPG/U=", "aeRdP");
        llIllIIll[llIllIlll[60]] = lIlllIIIlIII("V0rvKH/sh8U=", "RMWLd");
        llIllIIll[llIllIlll[61]] = lIlllIIIlIII("XXWd6LFSB5Y=", "OqJJh");
        llIllIIll[llIllIlll[62]] = lIlllIIIlIII("mi1Zmm6gTe5CT4SPNWp2e9bHMY/cEMgJ", "uWgNf");
        llIllIIll[llIllIlll[65]] = lIlllIIIIlll("HCQpHhU4IGQ9ACs8IRw=", "JEDnl");
        llIllIIll[llIllIlll[66]] = lIlllIIIIlll("PAI9FD4NTSwSPxg=", "hmZsR");
        llIllIIll[llIllIlll[67]] = lIlllIIIIllI("HGoyQogLyNY=", "guIjq");
        llIllIIll[llIllIlll[68]] = lIlllIIIIllI("ECzDGpwpGxIibhpAjJ9DLQ==", "OiYYL");
        llIllIIll[llIllIlll[69]] = lIlllIIIlIII("WGpsTOMrC/Vfu7zP/py/biSUK+s93rx0", "oSsUf");
        llIllIIll[llIllIlll[70]] = lIlllIIIIllI("t5CR3H57P6o=", "uRCda");
        llIllIIll[llIllIlll[71]] = lIlllIIIIllI("s7DmQbB99TPCnK5duJ8cOA==", "jYUuC");
        llIllIIll[llIllIlll[72]] = lIlllIIIIlll("BRcVJTw0WBAtJT8bFzA=", "QxrBP");
        llIllIIll[llIllIlll[73]] = lIlllIIIlIII("fJLvLfO+/QU=", "NlWSW");
        llIllIIll[llIllIlll[74]] = lIlllIIIIlll("CwEoFgJsJzsdAw==", "LsIxf");
        llIllIIll[llIllIlll[75]] = lIlllIIIIllI("riIg9UHgR7YX0nQeaoUgZRu7VlrOT9AC", "wToLY");
        llIllIIll[llIllIlll[76]] = lIlllIIIIllI("b05D/1gcRlU=", "braxy");
        llIllIIll[llIllIlll[77]] = lIlllIIIIllI("MnKnUaTMoIJtKXswRjZGx+I7UDWqEUsP", "VoBDV");
        llIllIIll[llIllIlll[78]] = lIlllIIIIllI("6x5Ni0Qhf6ViOUGs78LF6Ap32xY8mA6l", "dfayD");
        llIllIIll[llIllIlll[79]] = lIlllIIIlIII("5AZRcvIL9dA=", "zwZDO");
        llIllIIll[llIllIlll[80]] = lIlllIIIlIII("CQxYFzUD1Qh13bGDqnA4kg==", "shdeh");
        llIllIIll[llIllIlll[81]] = lIlllIIIIlll("ISIYBjoMLlUgOgwiGw==", "eMuoT");
        llIllIIll[llIllIlll[82]] = lIlllIIIlIII("csjLipNzcsX3ApOC5Nv2cQ==", "TmOVD");
        llIllIIll[llIllIlll[83]] = lIlllIIIIlll("PRg5HxZNBDsIAwg=", "mwNzd");
        llIllIIll[llIllIlll[84]] = lIlllIIIIlll("AxUiPUogG247AzAQIjM=", "TtNVj");
        llIllIIll[llIllIlll[85]] = lIlllIIIIllI("/lb11C9WtLcfmkoGE9nK2A==", "tJmDJ");
        llIllIIll[llIllIlll[86]] = lIlllIIIIlll("MzMGLB4V", "rUmEp");
        llIllIIll[llIllIlll[87]] = lIlllIIIIllI("TGmZwRiuGHU=", "Zpbzc");
        llIllIIll[llIllIlll[88]] = lIlllIIIIlll("IBclNCw=", "deLZG");
        llIllIIll[llIllIlll[89]] = lIlllIIIIllI("0HkVxQ/NgttDuT8c9Pm0+A==", "UPjKy");
        llIllIIll[llIllIlll[90]] = lIlllIIIIllI("I1+uUDB+mP+G07ALUTNL1A==", "xwlly");
        llIllIIll[llIllIlll[91]] = lIlllIIIlIII("fEEBLoEWRrVJ0gnPKZAw0w==", "EdBrj");
        llIllIIll[llIllIlll[93]] = lIlllIIIIlll("EgIOCQI=", "Vpggi");
        llIllIIll[llIllIlll[94]] = lIlllIIIIlll("DQgKKw==", "cgdNJ");
        llIllIIll[llIllIlll[95]] = lIlllIIIIllI("pWzTTFO22M4=", "yNekC");
        llIllIIll[llIllIlll[110]] = lIlllIIIIllI("mGdAZcFpzjU=", "mDOLI");
        llIllIIll[llIllIlll[118]] = lIlllIIIIllI("AbP5iFNo8AxW5uDuN2dG+WNDJYnrab+o", "CfdSg");
        llIllIIll[llIllIlll[119]] = lIlllIIIIlll("OgoFPisbBQx6JRMFADMpFQ==", "rkkZG");
        llIllIIll[llIllIlll[121]] = lIlllIIIlIII("ahruggd0Wvs=", "jxJpP");
        llIllIIll[llIllIlll[123]] = lIlllIIIlIII("OnVjzMWNNSw=", "DCnhx");
        llIllIIll[llIllIlll[124]] = lIlllIIIlIII("8bymdF8ZbNS5Y8yg/RGw3eUb5io4gtWNDymC2uNEm9bb5dzllnjFVl7as6nZ5mIB+Vd0V1zJxko=", "BQfZz");
        llIllIIll[llIllIlll[125]] = lIlllIIIlIII("pXl9gbd45qtbI1FSWi1ojg==", "yclgR");
        llIllIIll[llIllIlll[127]] = lIlllIIIlIII("84EthLhLIyA=", "ixHho");
        llIllIIll[llIllIlll[128]] = lIlllIIIIlll("Jh1tLjwUWCAmPQIRIyhuAw0jKm4QCj8gOQJUbTw5GAwuJycfH207IVE6GBYHPz8=", "qxMON");
        llIllIIll[llIllIlll[129]] = lIlllIIIIlll("BgklIgY=", "klIGc");
        llIllIIll[llIllIlll[130]] = lIlllIIIIllI("9AOaITDJzQL7kfgN0Wd4jw==", "BoMxY");
        llIllIIll[llIllIlll[131]] = lIlllIIIIlll("GS4JDAc=", "kOgkb");
        llIllIIll[llIllIlll[132]] = lIlllIIIlIII("kagI4QMWO0C6jP54/T6Ndw==", "NsjZV");
        llIllIIll[llIllIlll[133]] = lIlllIIIIlll("KC0pAiA=", "ZLGeE");
        llIllIIll[llIllIlll[134]] = lIlllIIIlIII("0oPaKlEs2Jc=", "jsVXw");
        llIllIIll[llIllIlll[135]] = lIlllIIIlIII("mktB8wu05Nc=", "ZTwRy");
        llIllIIll[llIllIlll[136]] = lIlllIIIIlll("GycGFRA=", "iFhru");
        llIllIIll[llIllIlll[137]] = lIlllIIIIlll("OBIAAyMiAgM=", "KgpsO");
        llIllIIll[llIllIlll[138]] = lIlllIIIIllI("ZnVJEzTPLZTj9AEskc89MaTE0ldAQFrBUEGfyxpgNEALm4BMGN+rDISvEwCxEcT4", "tiPRj");
        llIllIIll[llIllIlll[139]] = lIlllIIIIlll("BRMkIjM=", "hvHGV");
        llIllIIll[llIllIlll[140]] = lIlllIIIlIII("vZ/Soa/0M2c=", "TrSEH");
        llIllIIll[llIllIlll[142]] = lIlllIIIIllI("Kzbs0F5WzEENsK8cvGjtow==", "vTdXH");
        llIllIIll[llIllIlll[143]] = lIlllIIIIllI("jJ7EMOvkuiiBtaVwO6/iIYGGeTZIF2g5", "XmLlR");
        llIllIIll[llIllIlll[145]] = lIlllIIIIllI("AxxsKe8ogbw=", "oLXah");
        llIllIIll[llIllIlll[154]] = lIlllIIIIllI("LKhuzf088jU=", "vYLYB");
        llIllIIll[llIllIlll[155]] = lIlllIIIlIII("aqdnKlwFGs4=", "ujJzG");
        llIllIIll[llIllIlll[158]] = lIlllIIIlIII("wYeHGmI2n2I=", "bYJTA");
        llIllIIll[llIllIlll[159]] = lIlllIIIIlll("Lw0wHg4OFHEeFwgRcQ8ZAB8=", "kzQlx");
        llIllIIll[llIllIlll[160]] = lIlllIIIIllI("I1CE7wQDEjg=", "IcijD");
        llIllIIll[llIllIlll[161]] = lIlllIIIlIII("esKe2KCoqkdcDxSyUxA+Tg==", "fwaWX");
        llIllIIll[llIllIlll[167]] = lIlllIIIIlll("CzUjJgw=", "fPOCi");
        llIllIIll[llIllIlll[184]] = lIlllIIIlIII("WXrot48HfQY=", "VOPCc");
        llIllIIll[llIllIlll[195]] = lIlllIIIIlll("BAoeDT41HAQNIg==", "EhmbL");
        llIllIIll[llIllIlll[196]] = lIlllIIIIlll("OREvPRYZBi4=", "vgJOz");
        llIllIIll[llIllIlll[197]] = lIlllIIIIlll("LTIpCjocJDMKJg==", "lPZeH");
        llIllIIll[llIllIlll[198]] = lIlllIIIIlll("EBA8HyEaAg==", "teYsH");
        llIllIIll[llIllIlll[199]] = lIlllIIIIllI("OSycpHMQR3Y=", "ApKTx");
        llIllIIll[llIllIlll[200]] = lIlllIIIlIII("1nAehbIto/s=", "LpgBl");
        llIllIIll[llIllIlll[201]] = lIlllIIIIlll("IDopPxMC", "pHHFv");
        llIllIIll[llIllIlll[162]] = lIlllIIIIlll("fz8bEB02PV0=", "WQtbp");
        llIllIIll[llIllIlll[202]] = lIlllIIIIlll("YBIjKC1h", "HzBZI");
        llIllIIll[llIllIlll[203]] = lIlllIIIlIII("WXh/Wqd5xv4SXw0XZKyUXA==", "bQVmo");
        llIllIIll[llIllIlll[204]] = lIlllIIIIllI("GHWMH4i76iJNhvzd/ucJdw==", "XELbf");
        llIllIIll[llIllIlll[205]] = lIlllIIIIlll("KDkSCC4K", "xKsqK");
        llIllIIll[llIllIlll[206]] = lIlllIIIlIII("dNW7rK05aOU=", "ZCHQo");
        llIllIIll[llIllIlll[208]] = lIlllIIIIlll("DRMCMT0tBAM=", "BegCQ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0155, code lost:
        if (lIlllIIIllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0402, code lost:
        if (lIlllIIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0016q.llIllIlll[126(0x7e, float:1.77E-43)]) != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v216, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v331, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(String str) {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlllIIlIIlI(nearest) && lIlllIIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIllIIll[llIllIlll[118]];
            C0000a.a(nearest);
        }
        if (lIlllIIlIIlI(nearest) && lIlllIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIllIIll[llIllIlll[119]];
            if (lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIllIlll[120]);
                "".length();
                Time.sleepTicks(C0004e.c(llIllIlll[5], llIllIlll[8]));
                "".length();
            }
            if (lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                if (lIlllIIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIllIlll[5]);
                    "".length();
                }
                if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[121]]) ? 1 : 0)) {
                    if (lIlllIIIlllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        C0007h.X();
                    }
                    int[] iArr = new int[llIllIlll[0]];
                    iArr[llIllIlll[3]] = llIllIlll[102];
                    if (lIlllIIIllll(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[llIllIlll[0]];
                        iArr2[llIllIlll[3]] = llIllIlll[102];
                        if (lIlllIIIllll(Equipment.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llIllIlll[0]];
                            iArr3[llIllIlll[3]] = llIllIlll[101];
                            if (lIlllIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIllIlll[0]];
                                iArr4[llIllIlll[3]] = llIllIlll[122];
                            }
                            h(llIllIIll[llIllIlll[123]]);
                            System.out.println(llIllIIll[llIllIlll[124]]);
                            bv = llIllIlll[0];
                            return;
                        }
                    }
                    int[] iArr5 = new int[llIllIlll[0]];
                    iArr5[llIllIlll[3]] = llIllIlll[102];
                    if (lIlllIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIllIlll[0]];
                        iArr6[llIllIlll[3]] = llIllIlll[102];
                        if (lIlllIIIllll(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[llIllIlll[0]];
                            iArr7[llIllIlll[3]] = llIllIlll[101];
                            if (lIlllIIIlllI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIllIlll[0]];
                                iArr8[llIllIlll[3]] = llIllIlll[122];
                                if (lIlllIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                                    do {
                                        int[] iArr9 = new int[llIllIlll[0]];
                                        iArr9[llIllIlll[3]] = llIllIlll[102];
                                        if (lIlllIIIllll(Inventory.contains(iArr9) ? 1 : 0)) {
                                            AccBuilderGWD.c = llIllIIll[llIllIlll[125]];
                                            int[] iArr10 = new int[llIllIlll[0]];
                                            iArr10[llIllIlll[3]] = llIllIlll[101];
                                            if (lIlllIIIllll(Inventory.contains(iArr10) ? 1 : 0)) {
                                                C0000a.a(llIllIlll[101], llIllIlll[0]);
                                            }
                                            int[] iArr11 = new int[llIllIlll[0]];
                                            iArr11[llIllIlll[3]] = llIllIlll[122];
                                            if (lIlllIIIllll(Inventory.contains(iArr11) ? 1 : 0)) {
                                                C0000a.a(llIllIlll[122], llIllIlll[0]);
                                            }
                                            int[] iArr12 = new int[llIllIlll[0]];
                                            iArr12[llIllIlll[3]] = llIllIlll[101];
                                            if (lIlllIIIlllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                                int[] iArr13 = new int[llIllIlll[0]];
                                                iArr13[llIllIlll[3]] = llIllIlll[122];
                                                if (lIlllIIIlllI(Inventory.contains(iArr13) ? 1 : 0)) {
                                                    int[] iArr14 = new int[llIllIlll[0]];
                                                    iArr14[llIllIlll[3]] = llIllIlll[101];
                                                    Item first = Inventory.getFirst(iArr14);
                                                    int[] iArr15 = new int[llIllIlll[0]];
                                                    iArr15[llIllIlll[3]] = llIllIlll[122];
                                                    first.useOn(Inventory.getFirst(iArr15));
                                                    Time.sleepTicks(llIllIlll[4]);
                                                    "".length();
                                                }
                                            }
                                            if (lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                                                int[] iArr16 = new int[llIllIlll[0]];
                                                iArr16[llIllIlll[3]] = llIllIlll[102];
                                                if (lIlllIIIlllI(Bank.contains(iArr16) ? 1 : 0)) {
                                                    C0000a.a(llIllIlll[102], llIllIlll[0]);
                                                }
                                            }
                                            int[] iArr17 = new int[llIllIlll[0]];
                                            iArr17[llIllIlll[3]] = llIllIlll[102];
                                            if (lIlllIIIlllI(Inventory.contains(iArr17) ? 1 : 0)) {
                                                if (lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                                                    C0000a.a();
                                                    Time.sleepTicks(llIllIlll[9]);
                                                    "".length();
                                                }
                                                if (lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                                                    Bank.depositInventory();
                                                    Time.sleepTicks(llIllIlll[5]);
                                                    "".length();
                                                    "".length();
                                                    if ((-(169 ^ 173)) > 0) {
                                                        return;
                                                    }
                                                }
                                            }
                                            Time.sleepTicks(llIllIlll[0]);
                                            "".length();
                                            "".length();
                                        }
                                    } while (" ".length() >= " ".length());
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr18 = new int[llIllIlll[0]];
                    iArr18[llIllIlll[3]] = llIllIlll[92];
                    if (lIlllIIIlllI(Bank.contains(iArr18) ? 1 : 0)) {
                        int[] iArr19 = new int[llIllIlll[0]];
                        iArr19[llIllIlll[3]] = llIllIlll[92];
                        if (lIlllIIIlllI(Bank.contains(iArr19) ? 1 : 0)) {
                            int[] iArr20 = new int[llIllIlll[0]];
                            iArr20[llIllIlll[3]] = llIllIlll[92];
                        }
                    }
                    int[] iArr21 = new int[llIllIlll[0]];
                    iArr21[llIllIlll[3]] = llIllIlll[92];
                    if (lIlllIIIllll(Equipment.contains(iArr21) ? 1 : 0)) {
                        h(llIllIIll[llIllIlll[127]]);
                        System.out.println(llIllIIll[llIllIlll[128]]);
                        bv = llIllIlll[0];
                        return;
                    }
                }
                if (lIlllIIIllll(cL ? 1 : 0)) {
                    C0007h.X();
                    cL = llIllIlll[0];
                }
                while (lIlllIIIllll(C0007h.bw ? 1 : 0) && lIlllIIIllll(AccBuilderGWD.d ? 1 : 0)) {
                    if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[129]]) ? 1 : 0)) {
                        C0007h.d(llIllIIll[llIllIlll[130]]);
                    }
                    if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[131]]) ? 1 : 0)) {
                        C0007h.d(llIllIIll[llIllIlll[132]]);
                    }
                    Time.sleepTicks(llIllIlll[0]);
                    "".length();
                    "".length();
                    if ((((0 ^ 25) ^ (254 ^ 188)) & (((((201 + 184) - 174) + 6) ^ (((109 + 61) - 87) + 47)) ^ (-" ".length()))) == ((83 ^ 87) ^ ((84 ^ 66) & ((174 ^ 184) ^ (-1))))) {
                        return;
                    }
                }
                if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[133]]) ? 1 : 0)) {
                    int[] iArr22 = new int[llIllIlll[0]];
                    iArr22[llIllIlll[3]] = llIllIlll[92];
                    if (lIlllIIIlllI(Bank.contains(iArr22) ? 1 : 0)) {
                        Bank.withdrawAll(llIllIlll[92], Bank.WithdrawMode.ITEM);
                        Time.sleepTicks(llIllIlll[4]);
                        "".length();
                        int[] iArr23 = new int[llIllIlll[0]];
                        iArr23[llIllIlll[3]] = llIllIlll[92];
                        if (lIlllIIIlllI(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIllIlll[0]];
                            iArr24[llIllIlll[3]] = llIllIlll[92];
                            Inventory.getFirst(iArr24).interact(llIllIIll[llIllIlll[134]]);
                            Time.sleepTicks(llIllIlll[0]);
                            "".length();
                        }
                        if (lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIllIlll[9]);
                            "".length();
                        }
                    }
                }
                if (lIlllIIIllll(an() ? 1 : 0) && (!lIlllIIIllll(f(llIllIIll[llIllIlll[135]]) ? 1 : 0) || lIlllIIIlllI(f(llIllIIll[llIllIlll[136]]) ? 1 : 0))) {
                    h(llIllIIll[llIllIlll[137]]);
                    System.out.println(llIllIIll[llIllIlll[138]]);
                    bv = llIllIlll[0];
                } else if (lIlllIIIlllI(an() ? 1 : 0)) {
                    if (!lIlllIIIllll(f(llIllIIll[llIllIlll[139]]) ? 1 : 0) || lIlllIIIlllI(f(llIllIIll[llIllIlll[140]]) ? 1 : 0)) {
                        while (lIlllIIIllll(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a(llIllIlll[16], llIllIlll[141]);
                                C0000a.b(C0005f.bc, llIllIlll[4]);
                                Bank.withdraw(item -> {
                                    return item.getName().contains(llIllIIll[llIllIlll[199]]);
                                }, llIllIlll[0], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIllIlll[0]);
                                "".length();
                            }
                            if (lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                            }
                            if (lIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), llIllIlll[8])) {
                                AccBuilderGWD.c = llIllIIll[llIllIlll[142]];
                                Movement.walkTo(cW);
                                "".length();
                                Time.sleepTicks(llIllIlll[0]);
                                "".length();
                            }
                            Time.sleepTicks(llIllIlll[0]);
                            "".length();
                            "".length();
                            if (0 != 0) {
                                return;
                            }
                        }
                        if (lIlllIIIlllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[143]];
                            if (lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, llIllIlll[120]);
                                "".length();
                                Time.sleepTicks(C0004e.c(llIllIlll[5], llIllIlll[8]));
                                "".length();
                            }
                            if (lIlllIIlIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llIllIlll[5]);
                                "".length();
                            }
                            if (lIlllIIlIIII(Vars.getBit(llIllIlll[58]), llIllIlll[15])) {
                                C0000a.a(llIllIlll[16], llIllIlll[144]);
                            }
                            if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[145]]) ? 1 : 0)) {
                                Bank.withdrawAll(llIllIlll[92], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIllIlll[4]);
                                "".length();
                            }
                            int[] iArr25 = new int[llIllIlll[0]];
                            iArr25[llIllIlll[3]] = llIllIlll[92];
                            if (lIlllIIIlllI(Inventory.contains(iArr25) ? 1 : 0)) {
                                C0004e.l(llIllIlll[92]);
                                if (lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                                    C0000a.a();
                                    Time.sleepTicks(llIllIlll[9]);
                                    "".length();
                                }
                            }
                            C0000a.a(llIllIlll[146], llIllIlll[27]);
                            C0000a.a(llIllIlll[147], llIllIlll[13]);
                            C0000a.a(llIllIlll[148], llIllIlll[13]);
                            C0000a.a(llIllIlll[149], llIllIlll[13]);
                            C0000a.a(llIllIlll[150], llIllIlll[13]);
                        }
                    }
                }
            }
        }
    }

    private static boolean lIlllIIllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlllIIllIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlllIIIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0520, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x055a, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0594, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05ce, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0608, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0642, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x067c, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x06b6, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x06fc, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0016q.llIllIlll[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011a, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025a, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02b1, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03e0, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0437, code lost:
        if (lIlllIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v234, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v276, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean f(String str) {
        if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[94]]) ? 1 : 0)) {
            return llIllIlll[0];
        }
        if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[95]]) ? 1 : 0)) {
            if (lIlllIIlIIIl(Skills.getLevel(Skill.RANGED), llIllIlll[62]) && lIlllIIlIIII(Skills.getLevel(Skill.RANGED), llIllIlll[74])) {
                int[] iArr = new int[llIllIlll[0]];
                iArr[llIllIlll[3]] = llIllIlll[96];
                if (lIlllIIIlllI(Equipment.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIllIlll[0]];
                    iArr2[llIllIlll[3]] = llIllIlll[97];
                    if (lIlllIIIlllI(Equipment.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIllIlll[0]];
                        iArr3[llIllIlll[3]] = llIllIlll[98];
                        if (lIlllIIIllll(Equipment.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIllIlll[0]];
                            iArr4[llIllIlll[3]] = llIllIlll[99];
                        }
                        int[] iArr5 = new int[llIllIlll[0]];
                        iArr5[llIllIlll[3]] = llIllIlll[100];
                        if (lIlllIIIlllI(Equipment.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIllIlll[0]];
                            iArr6[llIllIlll[3]] = llIllIlll[101];
                            if (lIlllIIIllll(Equipment.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[llIllIlll[0]];
                                iArr7[llIllIlll[3]] = llIllIlll[102];
                            }
                            int[] iArr8 = new int[llIllIlll[0]];
                            iArr8[llIllIlll[3]] = llIllIlll[103];
                            if (lIlllIIIlllI(Equipment.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[llIllIlll[0]];
                                iArr9[llIllIlll[3]] = llIllIlll[92];
                                if (lIlllIIIlllI(Equipment.contains(iArr9) ? 1 : 0)) {
                                    int[] iArr10 = new int[llIllIlll[0]];
                                    iArr10[llIllIlll[3]] = llIllIlll[104];
                                    if (lIlllIIIlllI(Equipment.contains(iArr10) ? 1 : 0)) {
                                        int[] iArr11 = new int[llIllIlll[0]];
                                        iArr11[llIllIlll[3]] = llIllIlll[105];
                                        if (lIlllIIIlllI(Equipment.contains(iArr11) ? 1 : 0)) {
                                            ?? r0 = llIllIlll[0];
                                            "".length();
                                            return ((28 ^ 78) & ((123 ^ 41) ^ (-1))) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return llIllIlll[3];
            } else if (lIlllIIlIIIl(Skills.getLevel(Skill.RANGED), llIllIlll[74]) && lIlllIIlIIII(Skills.getLevel(Skill.RANGED), llIllIlll[84])) {
                int[] iArr12 = new int[llIllIlll[0]];
                iArr12[llIllIlll[3]] = llIllIlll[106];
                if (lIlllIIIlllI(Equipment.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[llIllIlll[0]];
                    iArr13[llIllIlll[3]] = llIllIlll[107];
                    if (lIlllIIIlllI(Equipment.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[llIllIlll[0]];
                        iArr14[llIllIlll[3]] = llIllIlll[98];
                        if (lIlllIIIllll(Equipment.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[llIllIlll[0]];
                            iArr15[llIllIlll[3]] = llIllIlll[99];
                        }
                        int[] iArr16 = new int[llIllIlll[0]];
                        iArr16[llIllIlll[3]] = llIllIlll[100];
                        if (lIlllIIIlllI(Equipment.contains(iArr16) ? 1 : 0)) {
                            int[] iArr17 = new int[llIllIlll[0]];
                            iArr17[llIllIlll[3]] = llIllIlll[101];
                            if (lIlllIIIllll(Equipment.contains(iArr17) ? 1 : 0)) {
                                int[] iArr18 = new int[llIllIlll[0]];
                                iArr18[llIllIlll[3]] = llIllIlll[102];
                            }
                            int[] iArr19 = new int[llIllIlll[0]];
                            iArr19[llIllIlll[3]] = llIllIlll[103];
                            if (lIlllIIIlllI(Equipment.contains(iArr19) ? 1 : 0)) {
                                int[] iArr20 = new int[llIllIlll[0]];
                                iArr20[llIllIlll[3]] = llIllIlll[92];
                                if (lIlllIIIlllI(Equipment.contains(iArr20) ? 1 : 0)) {
                                    int[] iArr21 = new int[llIllIlll[0]];
                                    iArr21[llIllIlll[3]] = llIllIlll[104];
                                    if (lIlllIIIlllI(Equipment.contains(iArr21) ? 1 : 0)) {
                                        int[] iArr22 = new int[llIllIlll[0]];
                                        iArr22[llIllIlll[3]] = llIllIlll[105];
                                        if (lIlllIIIlllI(Equipment.contains(iArr22) ? 1 : 0)) {
                                            ?? r02 = llIllIlll[0];
                                            "".length();
                                            return 0 != 0 ? ((107 ^ 7) ^ (90 ^ 5)) & (((229 ^ 147) ^ (113 ^ 52)) ^ (-" ".length())) : r02;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return llIllIlll[3];
            } else if (lIlllIIlIIIl(Skills.getLevel(Skill.RANGED), llIllIlll[84])) {
                int[] iArr23 = new int[llIllIlll[0]];
                iArr23[llIllIlll[3]] = llIllIlll[108];
                if (lIlllIIIlllI(Equipment.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[llIllIlll[0]];
                    iArr24[llIllIlll[3]] = llIllIlll[109];
                    if (lIlllIIIlllI(Equipment.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[llIllIlll[0]];
                        iArr25[llIllIlll[3]] = llIllIlll[98];
                        if (lIlllIIIllll(Equipment.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[llIllIlll[0]];
                            iArr26[llIllIlll[3]] = llIllIlll[99];
                        }
                        int[] iArr27 = new int[llIllIlll[0]];
                        iArr27[llIllIlll[3]] = llIllIlll[100];
                        if (lIlllIIIlllI(Equipment.contains(iArr27) ? 1 : 0)) {
                            int[] iArr28 = new int[llIllIlll[0]];
                            iArr28[llIllIlll[3]] = llIllIlll[101];
                            if (lIlllIIIllll(Equipment.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[llIllIlll[0]];
                                iArr29[llIllIlll[3]] = llIllIlll[102];
                            }
                            int[] iArr30 = new int[llIllIlll[0]];
                            iArr30[llIllIlll[3]] = llIllIlll[103];
                            if (lIlllIIIlllI(Equipment.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[llIllIlll[0]];
                                iArr31[llIllIlll[3]] = llIllIlll[92];
                                if (lIlllIIIlllI(Equipment.contains(iArr31) ? 1 : 0)) {
                                    int[] iArr32 = new int[llIllIlll[0]];
                                    iArr32[llIllIlll[3]] = llIllIlll[104];
                                    if (lIlllIIIlllI(Equipment.contains(iArr32) ? 1 : 0)) {
                                        int[] iArr33 = new int[llIllIlll[0]];
                                        iArr33[llIllIlll[3]] = llIllIlll[105];
                                        if (lIlllIIIlllI(Equipment.contains(iArr33) ? 1 : 0)) {
                                            ?? r03 = llIllIlll[0];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return llIllIlll[3];
            }
        }
        if (lIlllIIIlllI(str.equalsIgnoreCase(llIllIIll[llIllIlll[110]]) ? 1 : 0)) {
            int[] iArr34 = new int[llIllIlll[0]];
            iArr34[llIllIlll[3]] = llIllIlll[111];
            if (lIlllIIIllll(Equipment.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIllIlll[0]];
                iArr35[llIllIlll[3]] = llIllIlll[111];
            }
            int[] iArr36 = new int[llIllIlll[0]];
            iArr36[llIllIlll[3]] = llIllIlll[112];
            if (lIlllIIIllll(Equipment.contains(iArr36) ? 1 : 0)) {
                int[] iArr37 = new int[llIllIlll[0]];
                iArr37[llIllIlll[3]] = llIllIlll[112];
            }
            int[] iArr38 = new int[llIllIlll[0]];
            iArr38[llIllIlll[3]] = llIllIlll[113];
            if (lIlllIIIllll(Equipment.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[llIllIlll[0]];
                iArr39[llIllIlll[3]] = llIllIlll[113];
            }
            int[] iArr40 = new int[llIllIlll[0]];
            iArr40[llIllIlll[3]] = llIllIlll[114];
            if (lIlllIIIllll(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIllIlll[0]];
                iArr41[llIllIlll[3]] = llIllIlll[114];
            }
            int[] iArr42 = new int[llIllIlll[0]];
            iArr42[llIllIlll[3]] = llIllIlll[115];
            if (lIlllIIIllll(Equipment.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIllIlll[0]];
                iArr43[llIllIlll[3]] = llIllIlll[115];
            }
            int[] iArr44 = new int[llIllIlll[0]];
            iArr44[llIllIlll[3]] = llIllIlll[116];
            if (lIlllIIIllll(Equipment.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[llIllIlll[0]];
                iArr45[llIllIlll[3]] = llIllIlll[116];
            }
            int[] iArr46 = new int[llIllIlll[0]];
            iArr46[llIllIlll[3]] = llIllIlll[117];
            if (lIlllIIIllll(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[llIllIlll[0]];
                iArr47[llIllIlll[3]] = llIllIlll[117];
            }
            int[] iArr48 = new int[llIllIlll[0]];
            iArr48[llIllIlll[3]] = llIllIlll[105];
            if (lIlllIIIllll(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[llIllIlll[0]];
                iArr49[llIllIlll[3]] = llIllIlll[105];
            }
            ?? r04 = llIllIlll[0];
            "".length();
            return ((18 ^ 78) ^ (253 ^ 164)) <= 0 ? ((15 ^ 26) ^ (175 ^ 182)) & (((147 ^ 138) ^ (77 ^ 88)) ^ (-" ".length())) : r04;
        }
        return llIllIlll[3];
    }

    private static String lIlllIIIIlll(String lIIIIllllIIlIl, String lIIIIllllIIlII) {
        String str = new String(Base64.getDecoder().decode(lIIIIllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIIIllllIIIlI = lIIIIllllIIlII.toCharArray();
        int lIIIIllllIIIIl = llIllIlll[3];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIllIlll[3];
        while (lIlllIIlIIII(i, length)) {
            sb.append((char) (charArray[i] ^ lIIIIllllIIIlI[lIIIIllllIIIIl % lIIIIllllIIIlI.length]));
            "".length();
            lIIIIllllIIIIl++;
            i++;
            "".length();
            if ((-((186 ^ 131) ^ (0 ^ 61))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlllIIIlIII(String lIIIlIIIIIIIlI, String lIIIlIIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIIIIIIlII = Cipher.getInstance("Blowfish");
            lIIIlIIIIIIlII.init(llIllIlll[4], secretKeySpec);
            return new String(lIIIlIIIIIIlII.doFinal(Base64.getDecoder().decode(lIIIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIIIIIIll) {
            lIIIlIIIIIIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIllIlll[0]];
        iArr[llIllIlll[3]] = llIllIlll[146];
        if (lIlllIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIllIlll[0]];
            iArr2[llIllIlll[3]] = llIllIlll[151];
            if (lIlllIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIllIlll[0]];
                iArr3[llIllIlll[3]] = llIllIlll[152];
                if (lIlllIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIllIlll[0]];
                    iArr4[llIllIlll[3]] = llIllIlll[153];
                    if (lIlllIIIlllI(Bank.contains(iArr4) ? 1 : 0) && lIlllIIIlllI(Bank.contains(item -> {
                        return item.getName().contains(llIllIIll[llIllIlll[198]]);
                    }) ? 1 : 0)) {
                        ?? r0 = llIllIlll[0];
                        "".length();
                        return (23 ^ 19) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return llIllIlll[3];
    }

    private static boolean lIlllIIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIIlIIIl(int i, int i2) {
        return i >= i2;
    }
}
