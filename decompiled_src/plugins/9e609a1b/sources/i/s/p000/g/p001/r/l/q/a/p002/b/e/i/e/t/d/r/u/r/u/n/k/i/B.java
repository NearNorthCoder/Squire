package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.B  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/B.class */
public class B implements M {
    public static /* synthetic */ boolean by;
    private static final /* synthetic */ WorldPoint gA;
    private static final /* synthetic */ WorldPoint gz;
    private static /* synthetic */ String[] lIIIllllllIII;
    private static /* synthetic */ int[] lIIlIIIIIIlIl;
    private static final /* synthetic */ WorldPoint gD;
    static /* synthetic */ int bY;
    static /* synthetic */ WorldArea gI;
    static /* synthetic */ int co;
    private static final /* synthetic */ WorldPoint gB;
    static /* synthetic */ WorldPoint gK;
    static /* synthetic */ WorldArea gH;
    private static final /* synthetic */ WorldPoint gF;
    private static final /* synthetic */ WorldPoint gE;
    static /* synthetic */ boolean cp;
    private static final /* synthetic */ WorldPoint gy;
    private static final /* synthetic */ WorldPoint gG;
    private static final /* synthetic */ WorldPoint gC;
    public static /* synthetic */ List<C0003d> bA;
    private static final /* synthetic */ String[] gx;
    static /* synthetic */ WorldArea gJ;

    private static void W() {
        int[] iArr = new int[lIIlIIIIIIlIl[1]];
        iArr[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
        if (lIlIIlllIIIlIlI(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIlIl[7], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[190]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIIIIIIlIl[1]];
        iArr2[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
        if (lIlIIlllIIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIlIl[8], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[191]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIIIIIIlIl[1]];
        iArr3[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
        if (lIlIIlllIIIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIlIl[9], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[190]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIIIIIIlIl[1]];
        iArr4[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[12];
        if (lIlIIlllIIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIlIl[12], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[192]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIIIIIIlIl[1]];
        iArr5[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[10];
        if (lIlIIlllIIIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIlIl[10], lIIlIIIIIIlIl[2], lIIlIIIIIIlIl[193]));
            "".length();
        }
        if (lIlIIlllIIIlIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIllllllIII[lIIlIIIIIIlIl[199]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIlIl[194], lIIlIIIIIIlIl[11], lIIlIIIIIIlIl[195]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIIIIIIlIl[1]];
        iArr6[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[196];
        if (lIlIIlllIIIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIlIl[196], lIIlIIIIIIlIl[49], lIIlIIIIIIlIl[193]));
            "".length();
        }
    }

    private static boolean lIlIIlllIIIlIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlllIIIllII(int i2) {
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIIIlIl[0];
    }

    private static void lIlIIlllIIIIlll() {
        lIIlIIIIIIlIl = new int[219];
        lIIlIIIIIIlIl[0] = ((((87 + 61) - 63) + 121) ^ (((99 + 52) - 52) + 56)) & (((198 ^ 186) ^ (99 ^ 74)) ^ (-" ".length()));
        lIIlIIIIIIlIl[1] = " ".length();
        lIIlIIIIIIlIl[2] = (113 ^ 105) ^ (138 ^ 152);
        lIIlIIIIIIlIl[3] = "  ".length();
        lIIlIIIIIIlIl[4] = "   ".length();
        lIIlIIIIIIlIl[5] = (-18520) & 23519;
        lIIlIIIIIIlIl[6] = 197 ^ 193;
        lIIlIIIIIIlIl[7] = (-((-13633) & 15739)) & (-28673) & 32703;
        lIIlIIIIIIlIl[8] = (-((-161) & 29921)) & (-2058) & 32763;
        lIIlIIIIIIlIl[9] = (-19633) & 20222;
        lIIlIIIIIIlIl[10] = (-((-6671) & 23231)) & (-8193) & 32760;
        lIIlIIIIIIlIl[11] = (69 ^ 12) ^ (42 ^ 102);
        lIIlIIIIIIlIl[12] = (-((-4425) & 21481)) & (-2055) & 31735;
        lIIlIIIIIIlIl[13] = 20 ^ 18;
        lIIlIIIIIIlIl[14] = 107 ^ 108;
        lIIlIIIIIIlIl[15] = (-((-685) & 31663)) & (-137) & 32751;
        lIIlIIIIIIlIl[16] = (-18490) & 23291;
        lIIlIIIIIIlIl[17] = (((190 + 49) - 111) + 127) ^ (((162 + 177) - 267) + 113);
        lIIlIIIIIIlIl[18] = (182 ^ 151) ^ (77 ^ 100);
        lIIlIIIIIIlIl[19] = (101 ^ 2) ^ (102 ^ 31);
        lIIlIIIIIIlIl[20] = (-2593) & 32700;
        lIIlIIIIIIlIl[21] = 41 ^ 32;
        lIIlIIIIIIlIl[22] = 29 ^ 22;
        lIIlIIIIIIlIl[23] = 128 ^ 140;
        lIIlIIIIIIlIl[24] = 188 ^ 179;
        lIIlIIIIIIlIl[25] = (-((-1033) & 7465)) & (-129) & 8175;
        lIIlIIIIIIlIl[26] = (-((-602) & 28539)) & (-3) & 32767;
        lIIlIIIIIIlIl[27] = (178 ^ 135) ^ (22 ^ 46);
        lIIlIIIIIIlIl[28] = 211 ^ 199;
        lIIlIIIIIIlIl[29] = (237 ^ 158) ^ (45 ^ 80);
        lIIlIIIIIIlIl[30] = (-12407) & 14335;
        lIIlIIIIIIlIl[31] = 35 ^ 51;
        lIIlIIIIIIlIl[32] = (78 ^ 62) ^ (79 ^ 46);
        lIIlIIIIIIlIl[33] = "  ".length() ^ (180 ^ 175);
        lIIlIIIIIIlIl[34] = (-11458) & 32509;
        lIIlIIIIIIlIl[35] = (((11 + 5) - 10) + 167) ^ (((90 + 80) - 46) + 67);
        lIIlIIIIIIlIl[36] = 70 ^ 85;
        lIIlIIIIIIlIl[37] = (75 ^ 55) ^ (5 ^ 108);
        lIIlIIIIIIlIl[38] = 3 ^ 21;
        lIIlIIIIIIlIl[39] = 46 ^ 57;
        lIIlIIIIIIlIl[40] = 165 ^ 189;
        lIIlIIIIIIlIl[41] = (-2635) & 32746;
        lIIlIIIIIIlIl[42] = (59 ^ 40) ^ (102 ^ 86);
        lIIlIIIIIIlIl[43] = (111 ^ 77) ^ (31 ^ 39);
        lIIlIIIIIIlIl[44] = (-11293) & 32348;
        lIIlIIIIIIlIl[45] = (13 ^ 88) ^ (91 ^ 21);
        lIIlIIIIIIlIl[46] = (-((-2770) & 31479)) & (-1025) & 31999;
        lIIlIIIIIIlIl[47] = (53 ^ 33) ^ (31 ^ 23);
        lIIlIIIIIIlIl[48] = (((45 + 43) - 19) + 93) ^ (((125 + 6) - 53) + 113);
        lIIlIIIIIIlIl[49] = (((102 + 160) - 78) + 0) ^ (((62 + 117) - 53) + 18);
        lIIlIIIIIIlIl[50] = (-((-24593) & 26681)) & (-1026) & 32763;
        lIIlIIIIIIlIl[51] = (-24705) & 26336;
        lIIlIIIIIIlIl[52] = (-((-249) & 2303)) & (-8209) & 15095;
        lIIlIIIIIIlIl[53] = (-22559) & 24191;
        lIIlIIIIIIlIl[54] = (-((-21605) & 29797)) & (-3073) & 16095;
        lIIlIIIIIIlIl[55] = (62 ^ 16) ^ (156 ^ 173);
        lIIlIIIIIIlIl[56] = 37 ^ 5;
        lIIlIIIIIIlIl[57] = 185 ^ 152;
        lIIlIIIIIIlIl[58] = "   ".length() ^ (55 ^ 22);
        lIIlIIIIIIlIl[59] = (38 ^ 124) ^ (104 ^ 22);
        lIIlIIIIIIlIl[60] = 70 ^ 99;
        lIIlIIIIIIlIl[61] = 140 ^ 170;
        lIIlIIIIIIlIl[62] = (247 ^ 151) ^ (113 ^ 54);
        lIIlIIIIIIlIl[63] = 233 ^ 196;
        lIIlIIIIIIlIl[64] = (92 ^ 99) ^ (113 ^ 103);
        lIIlIIIIIIlIl[65] = (((165 + 105) - 197) + 113) ^ (((60 + 94) - 89) + 79);
        lIIlIIIIIIlIl[66] = (95 ^ 72) ^ (22 ^ 42);
        lIIlIIIIIIlIl[67] = (((93 + 68) - 122) + 91) ^ (((81 + 11) - 2) + 84);
        lIIlIIIIIIlIl[68] = (-3521) & 24573;
        lIIlIIIIIIlIl[69] = (-((-23974) & 24503)) & (-2051) & 32695;
        lIIlIIIIIIlIl[70] = (223 ^ 191) ^ (221 ^ 147);
        lIIlIIIIIIlIl[71] = 89 ^ 107;
        lIIlIIIIIIlIl[72] = (93 ^ 28) ^ (59 ^ 85);
        lIIlIIIIIIlIl[73] = (((50 + 129) - 83) + 71) ^ (((99 + 65) - 69) + 56);
        lIIlIIIIIIlIl[74] = 107 ^ 92;
        lIIlIIIIIIlIl[75] = (44 ^ 119) ^ (213 ^ 191);
        lIIlIIIIIIlIl[76] = (((95 + 168) - 218) + 136) ^ (((99 + 43) - 46) + 41);
        lIIlIIIIIIlIl[77] = 122 ^ 73;
        lIIlIIIIIIlIl[78] = (123 ^ 48) ^ (((90 + 102) - 111) + 46);
        lIIlIIIIIIlIl[79] = (42 ^ 23) ^ (123 ^ 7);
        lIIlIIIIIIlIl[80] = (-((-17020) & 27519)) & (-1) & 12139;
        lIIlIIIIIIlIl[81] = (56 ^ 24) ^ (118 ^ 99);
        lIIlIIIIIIlIl[82] = (((74 + 71) - 117) + 123) ^ (((122 + 5) - (-9)) + 25);
        lIIlIIIIIIlIl[83] = (-((-8707) & 15251)) & (-1) & 8191;
        lIIlIIIIIIlIl[84] = (70 ^ 127) ^ " ".length();
        lIIlIIIIIIlIl[85] = ((158 ^ 154) & ((47 ^ 43) ^ (-1))) ^ (36 ^ 29);
        lIIlIIIIIIlIl[86] = (-2618) & 32767;
        lIIlIIIIIIlIl[87] = (203 ^ 153) ^ (8 ^ 96);
        lIIlIIIIIIlIl[88] = 138 ^ 177;
        lIIlIIIIIIlIl[89] = (-9223) & 30279;
        lIIlIIIIIIlIl[90] = 90 ^ 103;
        lIIlIIIIIIlIl[91] = (-29473) & 31739;
        lIIlIIIIIIlIl[92] = 127 ^ 65;
        lIIlIIIIIIlIl[93] = (13 ^ 115) ^ (13 ^ 56);
        lIIlIIIIIIlIl[94] = (-37) & 4085;
        lIIlIIIIIIlIl[95] = (-23621) & 24174;
        lIIlIIIIIIlIl[96] = 71 ^ 120;
        lIIlIIIIIIlIl[97] = (223 ^ 154) ^ (16 ^ 21);
        lIIlIIIIIIlIl[98] = (-((-16941) & 28654)) & (-1) & 32767;
        lIIlIIIIIIlIl[99] = (23 ^ 16) ^ (239 ^ 170);
        lIIlIIIIIIlIl[100] = (-2049) & 31706;
        lIIlIIIIIIlIl[101] = 254 ^ 189;
        lIIlIIIIIIlIl[102] = 220 ^ 152;
        lIIlIIIIIIlIl[103] = (((199 + 50) - 204) + 183) ^ (((26 + 164) - 127) + 117);
        lIIlIIIIIIlIl[104] = (((161 + 53) - 127) + 158) ^ (((153 + 125) - 120) + 18);
        lIIlIIIIIIlIl[105] = 235 ^ 172;
        lIIlIIIIIIlIl[106] = (-18569) & 20216;
        lIIlIIIIIIlIl[107] = (37 ^ 7) ^ (70 ^ 44);
        lIIlIIIIIIlIl[108] = 22 ^ 95;
        lIIlIIIIIIlIl[109] = 61 ^ 119;
        lIIlIIIIIIlIl[110] = (92 ^ 102) ^ (212 ^ 162);
        lIIlIIIIIIlIl[111] = (-2579) & 32695;
        lIIlIIIIIIlIl[112] = (80 ^ 99) ^ (126 ^ 0);
        lIIlIIIIIIlIl[113] = (((180 + 25) - 51) + 46) ^ (((114 + 76) - 151) + 95);
        lIIlIIIIIIlIl[114] = 214 ^ 131;
        lIIlIIIIIIlIl[115] = (((42 + 125) - (-27)) + 4) ^ (((30 + 86) - 58) + 79);
        lIIlIIIIIIlIl[116] = (-585) & 30702;
        lIIlIIIIIIlIl[117] = 245 ^ 164;
        lIIlIIIIIIlIl[118] = 47 ^ 117;
        lIIlIIIIIIlIl[119] = 80 ^ 2;
        lIIlIIIIIIlIl[120] = (-((-17043) & 27283)) & (-1209) & 32506;
        lIIlIIIIIIlIl[121] = (((106 + 20) - (-26)) + 71) ^ (((25 + 96) - 31) + 50);
        lIIlIIIIIIlIl[122] = (-2058) & 31705;
        lIIlIIIIIIlIl[123] = 24 ^ 76;
        lIIlIIIIIIlIl[124] = 53 ^ 106;
        lIIlIIIIIIlIl[125] = 216 ^ 142;
        lIIlIIIIIIlIl[126] = 211 ^ 132;
        lIIlIIIIIIlIl[127] = (((198 + 136) - 226) + 104) ^ (((83 + 131) - 202) + 128);
        lIIlIIIIIIlIl[128] = (-28945) & 30587;
        lIIlIIIIIIlIl[129] = (-9487) & 14318;
        lIIlIIIIIIlIl[130] = (-8337) & 9982;
        lIIlIIIIIIlIl[131] = (-3073) & 7907;
        lIIlIIIIIIlIl[132] = (112 ^ 121) ^ (215 ^ 135);
        lIIlIIIIIIlIl[133] = (((29 + 164) - 40) + 83) ^ (((148 + 138) - 156) + 53);
        lIIlIIIIIIlIl[134] = (((154 + 19) - 146) + 174) ^ (((53 + 144) - 133) + 85);
        lIIlIIIIIIlIl[135] = (41 ^ 27) ^ (47 ^ 64);
        lIIlIIIIIIlIl[136] = (16 ^ 123) ^ (164 ^ 145);
        lIIlIIIIIIlIl[137] = 20 ^ 116;
        lIIlIIIIIIlIl[138] = (((114 + 114) - 142) + 113) ^ (((127 + 96) - 64) + 7);
        lIIlIIIIIIlIl[139] = 114 ^ 16;
        lIIlIIIIIIlIl[140] = (160 ^ 130) ^ (104 ^ 46);
        lIIlIIIIIIlIl[141] = (-469) & 1023;
        lIIlIIIIIIlIl[142] = 127 ^ 28;
        lIIlIIIIIIlIl[143] = (-((-13085) & 29470)) & (-12321) & 32755;
        lIIlIIIIIIlIl[144] = (66 ^ 107) ^ (104 ^ 36);
        lIIlIIIIIIlIl[145] = (((130 + 73) - 57) + 47) ^ (((65 + 60) - 53) + 95);
        lIIlIIIIIIlIl[146] = (6 ^ 71) ^ (51 ^ 21);
        lIIlIIIIIIlIl[147] = 67 ^ 43;
        lIIlIIIIIIlIl[148] = (73 ^ 126) ^ (25 ^ 71);
        lIIlIIIIIIlIl[149] = (-11713) & 32767;
        lIIlIIIIIIlIl[150] = (211 ^ 147) ^ (118 ^ 92);
        lIIlIIIIIIlIl[151] = 196 ^ 175;
        lIIlIIIIIIlIl[152] = 60 ^ 80;
        lIIlIIIIIIlIl[153] = (240 ^ 197) ^ (198 ^ 158);
        lIIlIIIIIIlIl[154] = (-4353) & 5979;
        lIIlIIIIIIlIl[155] = (-16643) & 21471;
        lIIlIIIIIIlIl[156] = 248 ^ 150;
        lIIlIIIIIIlIl[157] = 56 ^ 87;
        lIIlIIIIIIlIl[158] = 33 ^ 81;
        lIIlIIIIIIlIl[159] = (((118 + 179) - 82) + 12) ^ (((17 + 36) - (-39)) + 54);
        lIIlIIIIIIlIl[160] = 124 ^ 14;
        lIIlIIIIIIlIl[161] = 212 ^ 167;
        lIIlIIIIIIlIl[162] = (((211 + 136) - 237) + 130) ^ (((40 + 37) - (-27)) + 28);
        lIIlIIIIIIlIl[163] = 5 ^ 112;
        lIIlIIIIIIlIl[164] = 20 ^ 98;
        lIIlIIIIIIlIl[165] = 18 ^ 101;
        lIIlIIIIIIlIl[166] = (((223 + 200) - 350) + 176) ^ (((56 + 112) - 74) + 35);
        lIIlIIIIIIlIl[167] = (55 ^ 48) ^ (242 ^ 140);
        lIIlIIIIIIlIl[168] = 239 ^ 149;
        lIIlIIIIIIlIl[169] = (((36 + 56) - 39) + 170) ^ (((19 + 60) - (-83)) + 2);
        lIIlIIIIIIlIl[170] = (((236 + 71) - 237) + 173) ^ (((115 + 44) - 56) + 40);
        lIIlIIIIIIlIl[171] = (68 ^ 66) ^ (9 ^ 114);
        lIIlIIIIIIlIl[172] = (((118 + 86) - 23) + 11) ^ (((169 + 131) - 174) + 64);
        lIIlIIIIIIlIl[173] = (((77 ^ 96) + (254 ^ 172)) - (25 ^ 121)) + (234 ^ 138);
        lIIlIIIIIIlIl[174] = (((101 ^ 95) + (14 ^ 95)) - (134 ^ 153)) + (79 ^ 91);
        lIIlIIIIIIlIl[175] = (((66 ^ 33) + (1 ^ 87)) - (((22 + 42) - 6) + 108)) + (245 ^ 155);
        lIIlIIIIIIlIl[176] = (((227 ^ 143) + (135 ^ 166)) - (72 ^ 19)) + (44 ^ 124);
        lIIlIIIIIIlIl[177] = ((69 + 63) - 125) + 124;
        lIIlIIIIIIlIl[178] = (((82 ^ 7) + (64 ^ 80)) - (172 ^ 142)) + (49 ^ 112);
        lIIlIIIIIIlIl[179] = ((132 + 92) - 113) + 22;
        lIIlIIIIIIlIl[180] = ((114 + 48) - 44) + 16;
        lIIlIIIIIIlIl[181] = ((48 + 28) - 64) + 123;
        lIIlIIIIIIlIl[182] = (((192 ^ 190) + (206 ^ 160)) - (198 ^ 182)) + (41 ^ 37);
        lIIlIIIIIIlIl[183] = (((((70 + 12) - (-7)) + 43) + (119 ^ 32)) - (((89 + 153) - 195) + 124)) + (37 ^ 124);
        lIIlIIIIIIlIl[184] = ((11 + 113) - 37) + 51;
        lIIlIIIIIIlIl[185] = (((95 ^ 98) + (200 ^ 197)) - (134 ^ 151)) + (120 ^ 42);
        lIIlIIIIIIlIl[186] = ((129 + 129) - 246) + 128;
        lIIlIIIIIIlIl[187] = (-((-10203) & 30683)) & (-28) & 22143;
        lIIlIIIIIIlIl[188] = (-((-12977) & 32445)) & (-289) & 24574;
        lIIlIIIIIIlIl[189] = (((215 ^ 142) + (177 ^ 199)) - (54 ^ 89)) + (164 ^ 137);
        lIIlIIIIIIlIl[190] = (-((-897) & 6075)) & (-24577) & 32254;
        lIIlIIIIIIlIl[191] = (-((-19807) & 28511)) & (-2178) & 16381;
        lIIlIIIIIIlIl[192] = (-3628) & 16127;
        lIIlIIIIIIlIl[193] = (-((-781) & 15263)) & (-16386) & 32767;
        lIIlIIIIIIlIl[194] = (-305) & 12284;
        lIIlIIIIIIlIl[195] = (-((-345) & 7513)) & (-577) & 32744;
        lIIlIIIIIIlIl[196] = (-((-9581) & 26109)) & (-8233) & 32767;
        lIIlIIIIIIlIl[197] = (((212 ^ 172) + (120 ^ 81)) - (73 ^ 5)) + (131 ^ 186);
        lIIlIIIIIIlIl[198] = (-((-7233) & 24141)) & (-3073) & 20463;
        lIIlIIIIIIlIl[199] = ((138 + 92) - 211) + 124;
        lIIlIIIIIIlIl[200] = (((27 ^ 77) + " ".length()) - (41 ^ 15)) + (5 ^ 90);
        lIIlIIIIIIlIl[201] = (((242 ^ 199) + (24 ^ 120)) - (((113 + 99) - 129) + 52)) + ((24 + 105) - 108) + 110;
        lIIlIIIIIIlIl[202] = (((79 ^ 92) + (((105 + 108) - 91) + 15)) - (229 ^ 142)) + (204 ^ 173);
        lIIlIIIIIIlIl[203] = ((114 + 55) - 125) + 103;
        lIIlIIIIIIlIl[204] = ((101 + 61) - 46) + 32;
        lIIlIIIIIIlIl[205] = (-((-10435) & 31707)) & (-1) & 24509;
        lIIlIIIIIIlIl[206] = (-8354) & 11503;
        lIIlIIIIIIlIl[207] = (-14601) & 16219;
        lIIlIIIIIIlIl[208] = (-((-30737) & 31030)) & (-9225) & 14333;
        lIIlIIIIIIlIl[209] = (-2081) & 6903;
        lIIlIIIIIIlIl[210] = (-2445) & 4079;
        lIIlIIIIIIlIl[211] = (-27650) & 32487;
        lIIlIIIIIIlIl[212] = (-18437) & 23263;
        lIIlIIIIIIlIl[213] = (-28801) & 30431;
        lIIlIIIIIIlIl[214] = (-16386) & 21227;
        lIIlIIIIIIlIl[215] = (-((-23691) & 31915)) & (-16388) & 29435;
        lIIlIIIIIIlIl[216] = (-((-6295) & 15767)) & (-18469) & 32765;
        lIIlIIIIIIlIl[217] = (-((-7255) & 32127)) & (-129) & 26623;
        lIIlIIIIIIlIl[218] = ((123 + 99) - 162) + 89;
    }

    private static void lIlIIlllIIIIllI() {
        lIIIllllllIII = new String[lIIlIIIIIIlIl[218]];
        lIIIllllllIII[lIIlIIIIIIlIl[0]] = lIlIIllIlIIlIIl("TYxw/+4IzKlvknVHtjkf/w==", "KLMRp");
        lIIIllllllIII[lIIlIIIIIIlIl[1]] = lIlIIllIlIIlIlI("A2GvIJxjrpgYnS12W8AiC1tq44o1vp4krTzNL3BnKWSu6dE1ZRb3hnqUGScY+Hnn", "qvykd");
        lIIIllllllIII[lIIlIIIIIIlIl[3]] = lIlIIllIlIIlIlI("yFypWQyksNBrLbf5sB0tLw==", "wYvQP");
        lIIIllllllIII[lIIlIIIIIIlIl[4]] = lIlIIllIlIIlIIl("qerPlCTXt0MYHSLfBzvfwtCoITUOmGk3", "pNWNS");
        lIIIllllllIII[lIIlIIIIIIlIl[6]] = lIlIIllIlIIlIIl("6yqmD55n8l57AaAzuqo0yh2dW2v3c0ducdgxxKEsy4aUdVpOw7WxQs9LiL4r9JrqzeTT/kmHnTg=", "hpwPy");
        lIIIllllllIII[lIIlIIIIIIlIl[11]] = lIlIIllIlIIlIlI("BSPPjpDR0jBlULM1z9fSfw==", "ZVkkH");
        lIIIllllllIII[lIIlIIIIIIlIl[13]] = lIlIIllIlIIlIlI("I9l6YacpVgRML6T0xaKTzw==", "Hkfbx");
        lIIIllllllIII[lIIlIIIIIIlIl[14]] = lIlIIllIlIIlIlI("bCTBnYEQ7xs=", "WqNQE");
        lIIIllllllIII[lIIlIIIIIIlIl[18]] = lIlIIllIlIIlIIl("XtPggu413YPYAzK3yBcf6g==", "fAjgy");
        lIIIllllllIII[lIIlIIIIIIlIl[21]] = lIlIIllIlIIlIlI("aajbUapVX2KWoqvFo7FMxA==", "VMDjq");
        lIIIllllllIII[lIIlIIIIIIlIl[2]] = lIlIIllIlIIlIlI("JO0Wi8mXNHA=", "cQwsy");
        lIIIllllllIII[lIIlIIIIIIlIl[22]] = lIlIIllIlIIlIlI("KQfz3VKoTFg9zh5+lDNkCg==", "uwUku");
        lIIIllllllIII[lIIlIIIIIIlIl[23]] = lIlIIllIlIIlIlI("i6MlNzl6HyNj5QhC/SF1FA==", "DqzHE");
        lIIIllllllIII[lIIlIIIIIIlIl[27]] = lIlIIllIlIIlIlI("OVMteepO9fkmsRFLxyZm7nCy9J4EPyWy", "QiQCR");
        lIIIllllllIII[lIIlIIIIIIlIl[29]] = lIlIIllIlIIlIIl("xFGsRV+gNnpQMgV9z8BDFA==", "sUSVf");
        lIIIllllllIII[lIIlIIIIIIlIl[24]] = lIlIIllIlIIlIlI("aWs3izVQoO12WSIiI7/l8mgIpUUHN+pu", "NAScv");
        lIIIllllllIII[lIIlIIIIIIlIl[31]] = lIlIIllIlIIlIIl("td89XYUl+r0tgCJvq6goztDrmushTb3n", "gZFZF");
        lIIIllllllIII[lIIlIIIIIIlIl[32]] = lIlIIllIlIIlIlI("AbZAZWx7vEA=", "TMLak");
        lIIIllllllIII[lIIlIIIIIIlIl[35]] = lIlIIllIlIIlIlI("gLL/7+XbM0k=", "LvRRl");
        lIIIllllllIII[lIIlIIIIIIlIl[36]] = lIlIIllIlIIlIIl("Dz8asrfYo+s=", "JeywJ");
        lIIIllllllIII[lIIlIIIIIIlIl[28]] = lIlIIllIlIIlIIl("RsbaZT5YPdvqGFRCLIv7KA==", "Evegn");
        lIIIllllllIII[lIIlIIIIIIlIl[37]] = lIlIIllIlIIlIll("CScUBjxlIgkOKw==", "EFfaY");
        lIIIllllllIII[lIIlIIIIIIlIl[38]] = lIlIIllIlIIlIlI("6TgcsyxyKtxYwrqNcY/aog==", "ppPDk");
        lIIIllllllIII[lIIlIIIIIIlIl[39]] = lIlIIllIlIIlIlI("INZWc7vELC8=", "ZqpsX");
        lIIIllllllIII[lIIlIIIIIIlIl[40]] = lIlIIllIlIIlIll("Ag8OQjkjThwNIj4=", "LnxbM");
        lIIIllllllIII[lIIlIIIIIIlIl[33]] = lIlIIllIlIIlIll("HhwpJg==", "QlLHx");
        lIIIllllllIII[lIIlIIIIIIlIl[43]] = lIlIIllIlIIlIlI("U/K1NO0hhfi+HD3/Nt09jQ==", "qnMGE");
        lIIIllllllIII[lIIlIIIIIIlIl[45]] = lIlIIllIlIIlIll("JwYpBhgURywAAhY=", "sgBov");
        lIIIllllllIII[lIIlIIIIIIlIl[47]] = lIlIIllIlIIlIlI("BWrlI3tdltM=", "LiFho");
        lIIIllllllIII[lIIlIIIIIIlIl[48]] = lIlIIllIlIIlIIl("sp6gNzS7GaqHSzxB+/cpUw==", "UqOvO");
        lIIIllllllIII[lIIlIIIIIIlIl[19]] = lIlIIllIlIIlIIl("wSvROjaXCu4=", "YpefO");
        lIIIllllllIII[lIIlIIIIIIlIl[55]] = lIlIIllIlIIlIll("Jh8iCA==", "bpMzx");
        lIIIllllllIII[lIIlIIIIIIlIl[56]] = lIlIIllIlIIlIIl("mrq7lHKWeg2v0mNc2vRSZQ==", "BdNOM");
        lIIIllllllIII[lIIlIIIIIIlIl[57]] = lIlIIllIlIIlIll("DTg0HQ==", "BHQsv");
        lIIIllllllIII[lIIlIIIIIIlIl[58]] = lIlIIllIlIIlIIl("NTkQ949psa4=", "ZYYcl");
        lIIIllllllIII[lIIlIIIIIIlIl[42]] = lIlIIllIlIIlIIl("2iqN+3OmG/U=", "Iekmi");
        lIIIllllllIII[lIIlIIIIIIlIl[59]] = lIlIIllIlIIlIll("ECERBBkrLR4RWjMlGRgOKioX", "CDpvz");
        lIIIllllllIII[lIIlIIIIIIlIl[60]] = lIlIIllIlIIlIIl("A9tSiS/PGDc=", "JLdVO");
        lIIIllllllIII[lIIlIIIIIIlIl[61]] = lIlIIllIlIIlIIl("36IgXDx8Drk=", "fXFoZ");
        lIIIllllllIII[lIIlIIIIIIlIl[62]] = lIlIIllIlIIlIll("CSEAKxQ=", "BOiMq");
        lIIIllllllIII[lIIlIIIIIIlIl[49]] = lIlIIllIlIIlIll("FyEUKxAs", "DDuYs");
        lIIIllllllIII[lIIlIIIIIIlIl[64]] = lIlIIllIlIIlIll("FQE4JgwuDTczTzYFMDobLwo+", "FdYTo");
        lIIIllllllIII[lIIlIIIIIIlIl[65]] = lIlIIllIlIIlIlI("owDh+o3cZgU=", "Lshax");
        lIIIllllllIII[lIIlIIIIIIlIl[66]] = lIlIIllIlIIlIlI("KTOfX4LhqqU=", "bfASb");
        lIIIllllllIII[lIIlIIIIIIlIl[67]] = lIlIIllIlIIlIll("ICk/Iik=", "kGVDL");
        lIIIllllllIII[lIIlIIIIIIlIl[63]] = lIlIIllIlIIlIlI("2sOLoQON0liWrjGHAlz/8w==", "Unzlt");
        lIIIllllllIII[lIIlIIIIIIlIl[70]] = lIlIIllIlIIlIIl("1K4u02UlqcU=", "HptbM");
        lIIIllllllIII[lIIlIIIIIIlIl[72]] = lIlIIllIlIIlIlI("OYsGeyGdLNQqPfFZnr2PUQ==", "cLwIR");
        lIIIllllllIII[lIIlIIIIIIlIl[73]] = lIlIIllIlIIlIll("NCIjDR8RJSNFCBklIAkO", "xKDek");
        lIIIllllllIII[lIIlIIIIIIlIl[75]] = lIlIIllIlIIlIlI("p7ZLw6WAc9I=", "MebLi");
        lIIIllllllIII[lIIlIIIIIIlIl[71]] = lIlIIllIlIIlIIl("WCUmWLEKiJrSGKsU2q2fYQ==", "lhiVA");
        lIIIllllllIII[lIIlIIIIIIlIl[77]] = lIlIIllIlIIlIll("LSMIIiQMNE0oIg0h", "bSmLM");
        lIIIllllllIII[lIIlIIIIIIlIl[78]] = lIlIIllIlIIlIll("KxQCDA==", "ddgbD");
        lIIIllllllIII[lIIlIIIIIIlIl[81]] = lIlIIllIlIIlIll("KxcgIygKAGUpLgsV", "dgEMA");
        lIIIllllllIII[lIIlIIIIIIlIl[82]] = lIlIIllIlIIlIIl("2F+5Z/VgKJ0=", "RKjtt");
        lIIIllllllIII[lIIlIIIIIIlIl[74]] = lIlIIllIlIIlIlI("k+oOQnM3L0oiGB7dZ7uKEg==", "NrWnC");
        lIIIllllllIII[lIIlIIIIIIlIl[84]] = lIlIIllIlIIlIIl("Ovr3/KZRdoX2HgUGyYa5xA==", "BtBEI");
        lIIIllllllIII[lIIlIIIIIIlIl[85]] = lIlIIllIlIIlIIl("hK2elbursS4=", "lfLAC");
        lIIIllllllIII[lIIlIIIIIIlIl[87]] = lIlIIllIlIIlIlI("LQG55IN8WbD733npNtGMIw==", "qgXZR");
        lIIIllllllIII[lIIlIIIIIIlIl[88]] = lIlIIllIlIIlIIl("BGNR3vJ2tV0=", "dXFar");
        lIIIllllllIII[lIIlIIIIIIlIl[76]] = lIlIIllIlIIlIIl("DMxsFAMun0A1om0HXP9+a4x9a2znH+MY", "AojiW");
        lIIIllllllIII[lIIlIIIIIIlIl[90]] = lIlIIllIlIIlIIl("gx2IUzYfK50=", "dDweQ");
        lIIIllllllIII[lIIlIIIIIIlIl[92]] = lIlIIllIlIIlIll("LgghFg==", "ziJsd");
        lIIIllllllIII[lIIlIIIIIIlIl[96]] = lIlIIllIlIIlIll("Mx8IPww=", "cviQc");
        lIIIllllllIII[lIIlIIIIIIlIl[97]] = lIlIIllIlIIlIlI("CbNkOhVi8Nk=", "DzkfV");
        lIIIllllllIII[lIIlIIIIIIlIl[79]] = lIlIIllIlIIlIIl("g1ElomNmWhw=", "HNABp");
        lIIIllllllIII[lIIlIIIIIIlIl[99]] = lIlIIllIlIIlIlI("LYGSgWoSWMiZFXEpEZlakw==", "fOCFH");
        lIIIllllllIII[lIIlIIIIIIlIl[101]] = lIlIIllIlIIlIIl("xr0LSH0sCbA=", "JOqlc");
        lIIIllllllIII[lIIlIIIIIIlIl[102]] = lIlIIllIlIIlIlI("7J/4plVTyqI=", "wyDmR");
        lIIIllllllIII[lIIlIIIIIIlIl[104]] = lIlIIllIlIIlIIl("DwOQ1rt57suWnlMvTsSKtw==", "diKtK");
        lIIIllllllIII[lIIlIIIIIIlIl[17]] = lIlIIllIlIIlIll("KwAmJxYQ", "xeGUu");
        lIIIllllllIII[lIIlIIIIIIlIl[105]] = lIlIIllIlIIlIlI("mC7CFeh8ZI8=", "xTFeV");
        lIIIllllllIII[lIIlIIIIIIlIl[107]] = lIlIIllIlIIlIlI("aHS+ddKDzBzlR5r93wjPtw==", "bglhJ");
        lIIIllllllIII[lIIlIIIIIIlIl[108]] = lIlIIllIlIIlIIl("22wvNprVI/jO8IaSo/jn4w==", "hzqFH");
        lIIIllllllIII[lIIlIIIIIIlIl[109]] = lIlIIllIlIIlIIl("aIh/Sf3g/2E=", "qxMHT");
        lIIIllllllIII[lIIlIIIIIIlIl[93]] = lIlIIllIlIIlIll("FSEgPxs0NmU1HTUj", "ZQEQr");
        lIIIllllllIII[lIIlIIIIIIlIl[110]] = lIlIIllIlIIlIll("Hxk0GQ==", "PiQwB");
        lIIIllllllIII[lIIlIIIIIIlIl[112]] = lIlIIllIlIIlIIl("G19rRes6Wm579L2bB614gg==", "TLqbZ");
        lIIIllllllIII[lIIlIIIIIIlIl[113]] = lIlIIllIlIIlIll("DDQPOg==", "CDjTn");
        lIIIllllllIII[lIIlIIIIIIlIl[115]] = lIlIIllIlIIlIll("FgMBUQQ3QhMeHyo=", "Xbwqp");
        lIIIllllllIII[lIIlIIIIIIlIl[103]] = lIlIIllIlIIlIIl("WuN9buwaB0uuKffFX8msFw==", "NCaik");
        lIIIllllllIII[lIIlIIIIIIlIl[117]] = lIlIIllIlIIlIlI("Vx7TxE2C6Kg=", "Kfzis");
        lIIIllllllIII[lIIlIIIIIIlIl[119]] = lIlIIllIlIIlIIl("r0qh04Ry9ju3wJaiaP3jLwDffUORDe22", "KhtbE");
        lIIIllllllIII[lIIlIIIIIIlIl[121]] = lIlIIllIlIIlIll("Pz8vMg==", "mZNVR");
        lIIIllllllIII[lIIlIIIIIIlIl[123]] = lIlIIllIlIIlIll("BBgvNQ==", "PyDPN");
        lIIIllllllIII[lIIlIIIIIIlIl[114]] = lIlIIllIlIIlIIl("bOU8Zjn7wx/vl4IioclGmg==", "aPKCc");
        lIIIllllllIII[lIIlIIIIIIlIl[125]] = lIlIIllIlIIlIIl("8P22hqtK1JM=", "vTxoD");
        lIIIllllllIII[lIIlIIIIIIlIl[126]] = lIlIIllIlIIlIlI("wq4Q+R7r6hDxaGNmkNvyAg==", "BqFvx");
        lIIIllllllIII[lIIlIIIIIIlIl[127]] = lIlIIllIlIIlIlI("dkv2hW4lSR8=", "vyZxX");
        lIIIllllllIII[lIIlIIIIIIlIl[132]] = lIlIIllIlIIlIIl("pf+hOBj9a4s=", "gZEZK");
        lIIIllllllIII[lIIlIIIIIIlIl[118]] = lIlIIllIlIIlIIl("R/ejDsAz2XY=", "rEZuY");
        lIIIllllllIII[lIIlIIIIIIlIl[133]] = lIlIIllIlIIlIlI("Gl4D0H9yXkw=", "ztmni");
        lIIIllllllIII[lIIlIIIIIIlIl[134]] = lIlIIllIlIIlIlI("Oae3ZvFSVAE=", "iPuHc");
        lIIIllllllIII[lIIlIIIIIIlIl[135]] = lIlIIllIlIIlIll("HAEGPA==", "SqcRB");
        lIIIllllllIII[lIIlIIIIIIlIl[136]] = lIlIIllIlIIlIll("Gz4gDw==", "TNEaM");
        lIIIllllllIII[lIIlIIIIIIlIl[124]] = lIlIIllIlIIlIll("FjgXNz88MAY3", "PQeRO");
        lIIIllllllIII[lIIlIIIIIIlIl[137]] = lIlIIllIlIIlIll("BTEnGDI+", "VTFjQ");
        lIIIllllllIII[lIIlIIIIIIlIl[138]] = lIlIIllIlIIlIlI("paCbUVZU/1KTlff8M0DVYg==", "OVzUl");
        lIIIllllllIII[lIIlIIIIIIlIl[139]] = lIlIIllIlIIlIlI("7zeLctZPh3YKaY6V1wD99w==", "oDGhS");
        lIIIllllllIII[lIIlIIIIIIlIl[142]] = lIlIIllIlIIlIIl("v4CBSFS6lPWlmWVIWbA4uktBf04wUwPK", "ezMAE");
        lIIIllllllIII[lIIlIIIIIIlIl[140]] = lIlIIllIlIIlIlI("mGl9TbwNr2Tv9AifRVhHTA==", "lodme");
        lIIIllllllIII[lIIlIIIIIIlIl[144]] = lIlIIllIlIIlIIl("2rGAVllWQxs=", "NsLZi");
        lIIIllllllIII[lIIlIIIIIIlIl[145]] = lIlIIllIlIIlIlI("2i8vcIJalYZZlNhLIZ+1ww==", "YRKPQ");
        lIIIllllllIII[lIIlIIIIIIlIl[146]] = lIlIIllIlIIlIlI("TD+aChMVeZ0=", "dzSLH");
        lIIIllllllIII[lIIlIIIIIIlIl[147]] = lIlIIllIlIIlIlI("t7pOTZv0ChY=", "DjuiM");
        lIIIllllllIII[lIIlIIIIIIlIl[148]] = lIlIIllIlIIlIlI("ojJANK9INXNI5WLwBdZO9Q==", "Gusil");
        lIIIllllllIII[lIIlIIIIIIlIl[150]] = lIlIIllIlIIlIlI("FnNHhzGis0Pt7YbEtVG/yA==", "xOxBY");
        lIIIllllllIII[lIIlIIIIIIlIl[151]] = lIlIIllIlIIlIIl("YURCtDZMbDQ=", "ZfITd");
        lIIIllllllIII[lIIlIIIIIIlIl[152]] = lIlIIllIlIIlIll("HDANCionPAIf", "OUlxI");
        lIIIllllllIII[lIIlIIIIIIlIl[153]] = lIlIIllIlIIlIlI("WhnoUIwZZrE=", "soCFy");
        lIIIllllllIII[lIIlIIIIIIlIl[156]] = lIlIIllIlIIlIlI("xbfh4Fq6X89k8E1YMm/L9A==", "hpeCU");
        lIIIllllllIII[lIIlIIIIIIlIl[157]] = lIlIIllIlIIlIll("IzsXAw==", "gTxqt");
        lIIIllllllIII[lIIlIIIIIIlIl[158]] = lIlIIllIlIIlIlI("E0FJjS8V8sI=", "wqdYh");
        lIIIllllllIII[lIIlIIIIIIlIl[159]] = lIlIIllIlIIlIIl("cMd1bpJJzOI=", "aWOkq");
        lIIIllllllIII[lIIlIIIIIIlIl[160]] = lIlIIllIlIIlIlI("IMU8noGkPkDnTbao0cJl2Q==", "zaAkj");
        lIIIllllllIII[lIIlIIIIIIlIl[161]] = lIlIIllIlIIlIll("CCoHGjU3", "ECuhZ");
        lIIIllllllIII[lIIlIIIIIIlIl[162]] = lIlIIllIlIIlIll("IBAbJA==", "pehLU");
        lIIIllllllIII[lIIlIIIIIIlIl[163]] = lIlIIllIlIIlIIl("qd8mLcpMZbc=", "QqRwx");
        lIIIllllllIII[lIIlIIIIIIlIl[164]] = lIlIIllIlIIlIIl("RYaQANexAwg=", "fvget");
        lIIIllllllIII[lIIlIIIIIIlIl[165]] = lIlIIllIlIIlIll("BR0xAA==", "UhBhp");
        lIIIllllllIII[lIIlIIIIIIlIl[166]] = lIlIIllIlIIlIIl("8YMyIS/pMlA=", "DMMsK");
        lIIIllllllIII[lIIlIIIIIIlIl[167]] = lIlIIllIlIIlIlI("s80DVWE3zeE=", "olpgq");
        lIIIllllllIII[lIIlIIIIIIlIl[168]] = lIlIIllIlIIlIlI("gkNXuotjchY=", "pdiHN");
        lIIIllllllIII[lIIlIIIIIIlIl[169]] = lIlIIllIlIIlIll("AzYAOg==", "SCsRS");
        lIIIllllllIII[lIIlIIIIIIlIl[170]] = lIlIIllIlIIlIIl("dKCY08rdRmA=", "GuBZI");
        lIIIllllllIII[lIIlIIIIIIlIl[171]] = lIlIIllIlIIlIIl("bJ5bQH/BF6k=", "zsxUY");
        lIIIllllllIII[lIIlIIIIIIlIl[172]] = lIlIIllIlIIlIIl("VdvzyOqxjqRSeV+9rn5JDg==", "PAAJu");
        lIIIllllllIII[lIIlIIIIIIlIl[173]] = lIlIIllIlIIlIIl("tXGWbNH2HcsvFfPM29Pzqg==", "xHtBq");
        lIIIllllllIII[lIIlIIIIIIlIl[174]] = lIlIIllIlIIlIll("DzslBS42dTpJICo7Lww=", "DRIiK");
        lIIIllllllIII[lIIlIIIIIIlIl[175]] = lIlIIllIlIIlIIl("/f+yMM7MRSN76ELavXtq8g==", "ZRftF");
        lIIIllllllIII[lIIlIIIIIIlIl[176]] = lIlIIllIlIIlIll("GyIINQ==", "OCcPk");
        lIIIllllllIII[lIIlIIIIIIlIl[177]] = lIlIIllIlIIlIll("HiICIi4nbB1uIDsiCCs=", "UKnNK");
        lIIIllllllIII[lIIlIIIIIIlIl[178]] = lIlIIllIlIIlIll("CgMCKgEzTR1mDy8DCCM=", "AjnFd");
        lIIIllllllIII[lIIlIIIIIIlIl[179]] = lIlIIllIlIIlIIl("/7hQP4PslUE=", "dyxiq");
        lIIIllllllIII[lIIlIIIIIIlIl[180]] = lIlIIllIlIIlIll("Ji47HQEfYCRRDwMuMRQ=", "mGWqd");
        lIIIllllllIII[lIIlIIIIIIlIl[181]] = lIlIIllIlIIlIIl("NwxRzbF/J/A=", "RngUm");
        lIIIllllllIII[lIIlIIIIIIlIl[182]] = lIlIIllIlIIlIlI("rjktFORcC3o=", "ZMrst");
        lIIIllllllIII[lIIlIIIIIIlIl[183]] = lIlIIllIlIIlIll("Fh06Eyw9AnMVKjwI", "SeSgE");
        lIIIllllllIII[lIIlIIIIIIlIl[184]] = lIlIIllIlIIlIlI("Hp3tLe5W0Vw=", "NxqQZ");
        lIIIllllllIII[lIIlIIIIIIlIl[185]] = lIlIIllIlIIlIll("KxcIIQ==", "dgmOD");
        lIIIllllllIII[lIIlIIIIIIlIl[186]] = lIlIIllIlIIlIIl("o8L87ViwpEMODmzjL56hp/XMg7PY98nd", "pGVQH");
        lIIIllllllIII[lIIlIIIIIIlIl[189]] = lIlIIllIlIIlIlI("I73Xth3tuk0=", "MAYja");
        lIIIllllllIII[lIIlIIIIIIlIl[197]] = lIlIIllIlIIlIll("CAUwEAAkACoKSAgVMBANNxVjFR0gHzc=", "ElCdh");
        lIIIllllllIII[lIIlIIIIIIlIl[199]] = lIlIIllIlIIlIll("IAYUA289CVoTKjMDDgxveg==", "RozdO");
        lIIIllllllIII[lIIlIIIIIIlIl[200]] = lIlIIllIlIIlIll("KkYnEAwXAzRRFgxGJQIHQx8/BBBDBz4HCw8Vfg==", "cfPqb");
        lIIIllllllIII[lIIlIIIIIIlIl[201]] = lIlIIllIlIIlIll("EQ0aXkIBSB4bDiRIDhcWaBEGB0I8AAxSDykcDAALKQQaXA==", "Hhirb");
        lIIIllllllIII[lIIlIIIIIIlIl[202]] = lIlIIllIlIIlIIl("oU3Jv7a/0NULw4DxTBhxXhUa/gsAfIpObmEMDcu2QhU=", "zPcYP");
        lIIIllllllIII[lIIlIIIIIIlIl[203]] = lIlIIllIlIIlIlI("heBH4dGFuxg=", "qkrZy");
        lIIIllllllIII[lIIlIIIIIIlIl[204]] = lIlIIllIlIIlIlI("IiW3e4V3iuuNTphsuaZdEA==", "yCQjb");
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIlIIlllIIIllll(graphicsObjectCreated.getGraphicsObject().getId(), lIIlIIIIIIlIl[198])) {
            System.out.println("Found one " + String.valueOf(graphicsObjectCreated.getGraphicsObject().getLocation()));
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            ce();
            "".length();
            if ("   ".length() < (((47 ^ 109) ^ (76 ^ 48)) & ((((13 ^ 33) & ((148 ^ 184) ^ (-1))) ^ (101 ^ 91)) ^ (-" ".length())))) {
                return ((43 ^ 121) ^ (187 ^ 178)) & (((35 ^ 25) ^ (25 ^ 120)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIIIIIlIl[140];
    }

    private static boolean lIlIIlllIIIllll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlllIIlIIlI(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlllIIlIIIl(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[181])) {
            ?? r0 = lIIlIIIIIIlIl[1];
            "".length();
            return (-" ".length()) == " ".length() ? ("  ".length() ^ (217 ^ 145)) & (((((81 + 217) - 189) + 142) ^ (((150 + 137) - 256) + 146)) ^ (-" ".length())) : r0;
        }
        return lIIlIIIIIIlIl[0];
    }

    private static String lIlIIllIlIIlIlI(String llllllllllllllIllllllllIlIllIIll, String llllllllllllllIllllllllIlIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIIlIl[18]), "DES");
            Cipher llllllllllllllIllllllllIlIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIllllllllIlIllIlIl.init(lIIlIIIIIIlIl[3], secretKeySpec);
            return new String(llllllllllllllIllllllllIlIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllllIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllllIlIllIlII) {
            llllllllllllllIllllllllIlIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIIlIIIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIlllIIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlllIIlIIII(Object obj) {
        return obj == null;
    }

    static {
        lIlIIlllIIIIlll();
        lIlIIlllIIIIllI();
        String[] strArr = new String[lIIlIIIIIIlIl[11]];
        strArr[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[200]];
        strArr[lIIlIIIIIIlIl[1]] = lIIIllllllIII[lIIlIIIIIIlIl[201]];
        strArr[lIIlIIIIIIlIl[3]] = lIIIllllllIII[lIIlIIIIIIlIl[202]];
        strArr[lIIlIIIIIIlIl[4]] = lIIIllllllIII[lIIlIIIIIIlIl[203]];
        strArr[lIIlIIIIIIlIl[6]] = lIIIllllllIII[lIIlIIIIIIlIl[204]];
        gx = strArr;
        gy = new WorldPoint(lIIlIIIIIIlIl[205], lIIlIIIIIIlIl[206], lIIlIIIIIIlIl[0]);
        gz = new WorldPoint(lIIlIIIIIIlIl[205], lIIlIIIIIIlIl[206], lIIlIIIIIIlIl[0]);
        gA = new WorldPoint(lIIlIIIIIIlIl[207], lIIlIIIIIIlIl[208], lIIlIIIIIIlIl[0]);
        gB = new WorldPoint(lIIlIIIIIIlIl[187], lIIlIIIIIIlIl[209], lIIlIIIIIIlIl[0]);
        gC = new WorldPoint(lIIlIIIIIIlIl[210], lIIlIIIIIIlIl[211], lIIlIIIIIIlIl[0]);
        gD = new WorldPoint(lIIlIIIIIIlIl[210], lIIlIIIIIIlIl[211], lIIlIIIIIIlIl[0]);
        gE = new WorldPoint(lIIlIIIIIIlIl[51], lIIlIIIIIIlIl[52], lIIlIIIIIIlIl[0]);
        gF = new WorldPoint(lIIlIIIIIIlIl[130], lIIlIIIIIIlIl[212], lIIlIIIIIIlIl[0]);
        gG = new WorldPoint(lIIlIIIIIIlIl[213], lIIlIIIIIIlIl[214], lIIlIIIIIIlIl[0]);
        bA = new ArrayList();
        gH = new WorldArea(lIIlIIIIIIlIl[51], lIIlIIIIIIlIl[215], lIIlIIIIIIlIl[31], lIIlIIIIIIlIl[37], lIIlIIIIIIlIl[0]);
        gI = new WorldArea(lIIlIIIIIIlIl[80], lIIlIIIIIIlIl[216], lIIlIIIIIIlIl[18], lIIlIIIIIIlIl[18], lIIlIIIIIIlIl[0]);
        gJ = new WorldArea(lIIlIIIIIIlIl[217], lIIlIIIIIIlIl[216], lIIlIIIIIIlIl[33], lIIlIIIIIIlIl[28], lIIlIIIIIIlIl[0]);
        gK = null;
    }

    private static boolean lIlIIlllIIIlIlI(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIlIIIIIIlIl[1]];
        iArr[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
        if (lIlIIlllIIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIlIIIIIIlIl[1]];
            iArr2[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
            if (lIlIIlllIIIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIlIIIIIIlIl[1]];
                iArr3[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIIlIIIIIIlIl[1];
                    "".length();
                    return (-" ".length()) >= " ".length() ? ((((156 + 93) - 165) + 103) ^ (((110 + 27) - 11) + 28)) & (((((46 + 7) - (-5)) + 111) ^ (((119 + 117) - 130) + 30)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIlIIIIIIlIl[0];
    }

    private static String lIlIIllIlIIlIll(String llllllllllllllIllllllllIlIlIIIll, String llllllllllllllIllllllllIlIlIIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllllllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllllllIlIlIIIIl = new StringBuilder();
        char[] charArray = llllllllllllllIllllllllIlIlIIIlI.toCharArray();
        int llllllllllllllIllllllllIlIIlllll = lIIlIIIIIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlIIIIIIlIl[0];
        while (lIlIIlllIIIlIIl(i2, length)) {
            llllllllllllllIllllllllIlIlIIIIl.append((char) (charArray2[i2] ^ charArray[llllllllllllllIllllllllIlIIlllll % charArray.length]));
            "".length();
            llllllllllllllIllllllllIlIIlllll++;
            i2++;
            "".length();
            if (" ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllllllIlIlIIIIl);
    }

    private static boolean lIlIIlllIIIllIl(int i2, int i3) {
        return i2 > i3;
    }

    private static String lIlIIllIlIIlIIl(String llllllllllllllIllllllllIlIIIlllI, String llllllllllllllIllllllllIlIIIllIl) {
        try {
            SecretKeySpec llllllllllllllIllllllllIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllllIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllllllIlIIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllllllIlIIlIIII.init(lIIlIIIIIIlIl[3], llllllllllllllIllllllllIlIIlIIIl);
            return new String(llllllllllllllIllllllllIlIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllllIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllllIlIIIlIlI) {
            llllllllllllllIllllllllIlIIIlIlI.printStackTrace();
            return null;
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIllllllIII[lIIlIIIIIIlIl[197]];
    }

    private static boolean lIlIIlllIIIlllI(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1404, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v408, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v354, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v359, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v384, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v389, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v396, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v597, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v606, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v611, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v616, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v123, types: [boolean] */
    public static void ce() {
        if (lIlIIlllIIIlIII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[0]];
            C0001b.a(bA);
            if (lIlIIlllIIIlIIl(bA.size(), lIIlIIIIIIlIl[1])) {
                System.out.println(lIIIllllllIII[lIIlIIIIIIlIl[1]]);
                by = lIIlIIIIIIlIl[0];
            }
        }
        if (lIlIIlllIIIlIlI(by ? 1 : 0)) {
            if (lIlIIlllIIIlIlI(S() ? 1 : 0) && lIlIIlllIIIlIIl(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlllIIIlIll(nearest) && lIlIIlllIIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[3]];
                    Movement.walkTo(nearest);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[3]);
                    "".length();
                }
                if (lIlIIlllIIIlIll(nearest) && lIlIIlllIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[4]];
                    if (lIlIIlllIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIIIIlIl[5]);
                        "".length();
                    }
                    if (lIlIIlllIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlllIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIIIIlIl[6]);
                            "".length();
                        }
                        if (lIlIIlllIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIIIIlIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIIIIIlIl[6]];
                        iArr[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
                        iArr[lIIlIIIIIIlIl[1]] = lIIlIIIIIIlIl[8];
                        iArr[lIIlIIIIIIlIl[3]] = lIIlIIIIIIlIl[9];
                        iArr[lIIlIIIIIIlIl[4]] = lIIlIIIIIIlIl[10];
                        if (lIlIIlllIIIlIlI(C0004e.b(iArr) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIllllllIII[lIIlIIIIIIlIl[6]]);
                            by = lIIlIIIIIIlIl[1];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIIIIIIlIl[11]];
                        iArr2[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
                        iArr2[lIIlIIIIIIlIl[1]] = lIIlIIIIIIlIl[8];
                        iArr2[lIIlIIIIIIlIl[3]] = lIIlIIIIIIlIl[9];
                        iArr2[lIIlIIIIIIlIl[4]] = lIIlIIIIIIlIl[10];
                        iArr2[lIIlIIIIIIlIl[6]] = lIIlIIIIIIlIl[12];
                        C0000a.a(iArr2, lIIlIIIIIIlIl[1]);
                    }
                }
            }
            if (lIlIIlllIIIlIII(S() ? 1 : 0) && lIlIIlllIIIlIIl(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[2])) {
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(gy), lIIlIIIIIIlIl[11])) {
                    if (lIlIIlllIIIlIIl(bY, lIIlIIIIIIlIl[1])) {
                        C0004e.w();
                        bY += lIIlIIIIIIlIl[1];
                    }
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[11]];
                    Movement.walkTo(gy);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gy), lIIlIIIIIIlIl[11])) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[13]];
                    C0006g.a(lIIIllllllIII[lIIlIIIIIIlIl[14]], gx);
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[2])) {
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(gz), lIIlIIIIIIlIl[11]) && lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[15], lIIlIIIIIIlIl[16], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[17])) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[18]];
                    Movement.walkTo(gz);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gz), lIIlIIIIIIlIl[11]) && lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gy), lIIlIIIIIIlIl[19])) {
                    int[] iArr3 = new int[lIIlIIIIIIlIl[1]];
                    iArr3[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[20];
                    TileObject nearest2 = TileObjects.getNearest(iArr3);
                    if (lIlIIlllIIIlIll(nearest2)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[21]];
                        nearest2.interact(lIIIllllllIII[lIIlIIIIIIlIl[2]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[15], lIIlIIIIIIlIl[16], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[17])) {
                    if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(gA), lIIlIIIIIIlIl[11])) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[22]];
                        Movement.walkTo(gA);
                        "".length();
                        Time.sleepTicks(lIIlIIIIIIlIl[1]);
                        "".length();
                    }
                    if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gA), lIIlIIIIIIlIl[11])) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[23]];
                        C0006g.a(gx);
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[24]) && lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIIIIIIlIl[25], lIIlIIIIIIlIl[26], lIIlIIIIIIlIl[0])) ? 1 : 0)) {
                C0006g.a(gx);
                AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[27]];
                Movement.walkTo(new WorldPoint(lIIlIIIIIIlIl[25], lIIlIIIIIIlIl[26], lIIlIIIIIIlIl[0]));
                "".length();
                Time.sleepTicks(lIIlIIIIIIlIl[1]);
                "".length();
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[28])) {
                AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[29]];
                int[] iArr4 = new int[lIIlIIIIIIlIl[1]];
                iArr4[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIlIIIIIIlIl[1]];
                    iArr5[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
                    Item first = Inventory.getFirst(iArr5);
                    String[] strArr = new String[lIIlIIIIIIlIl[1]];
                    strArr[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[24]];
                    first.useOn(TileObjects.getNearest(strArr));
                    "".length();
                    if ((-" ".length()) >= "  ".length()) {
                        return;
                    }
                } else {
                    int[] iArr6 = new int[lIIlIIIIIIlIl[1]];
                    iArr6[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[30];
                    if (lIlIIlllIIIlIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIlIIIIIIlIl[1]];
                        strArr2[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[31]];
                        TileObjects.getNearest(strArr2).interact(lIIIllllllIII[lIIlIIIIIIlIl[32]]);
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[33])) {
                int[] iArr7 = new int[lIIlIIIIIIlIl[1]];
                iArr7[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[30];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lIIlIIIIIIlIl[1]];
                    iArr8[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[34];
                    if (lIlIIlllIIIlIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIlIIIIIIlIl[1]];
                        strArr3[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[35]];
                        TileObjects.getNearest(strArr3).interact(lIIIllllllIII[lIIlIIIIIIlIl[36]]);
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return;
                        }
                    }
                }
                int[] iArr9 = new int[lIIlIIIIIIlIl[1]];
                iArr9[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[34];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(gB), lIIlIIIIIIlIl[6])) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[28]];
                        Movement.walkTo(gB);
                        "".length();
                        Time.sleepTicks(lIIlIIIIIIlIl[1]);
                        "".length();
                    }
                    if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gB), lIIlIIIIIIlIl[6])) {
                        String[] strArr4 = new String[lIIlIIIIIIlIl[1]];
                        strArr4[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[37]];
                        TileObject nearest3 = TileObjects.getNearest(strArr4);
                        if (lIlIIlllIIIlIll(nearest3)) {
                            AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[38]];
                            nearest3.interact(lIIIllllllIII[lIIlIIIIIIlIl[39]]);
                            Time.sleepTicks(lIIlIIIIIIlIl[3]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[19])) {
                C0006g.a(gx);
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(gC), lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[40]];
                    Movement.walkTo(gC);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIlIIIIIIlIl[4])) {
                    int[] iArr10 = new int[lIIlIIIIIIlIl[1]];
                    iArr10[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[41];
                    TileObject nearest4 = TileObjects.getNearest(iArr10);
                    if (lIlIIlllIIIlIll(nearest4)) {
                        nearest4.interact(lIIIllllllIII[lIIlIIIIIIlIl[33]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[42])) {
                co = lIIlIIIIIIlIl[0];
                C0006g.a(gx);
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(gD), lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[43]];
                    Movement.walkTo(gD);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[3]);
                    "".length();
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIlIIIIIIlIl[4])) {
                    int[] iArr11 = new int[lIIlIIIIIIlIl[1]];
                    iArr11[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[44];
                    if (lIlIIlllIIIlIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[45]];
                        int[] iArr12 = new int[lIIlIIIIIIlIl[1]];
                        iArr12[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[46];
                        TileObject nearest5 = TileObjects.getNearest(iArr12);
                        if (lIlIIlllIIIlIll(nearest5)) {
                            nearest5.interact(lIIIllllllIII[lIIlIIIIIIlIl[47]]);
                            Time.sleepTicks(lIIlIIIIIIlIl[1]);
                            "".length();
                        }
                    }
                    int[] iArr13 = new int[lIIlIIIIIIlIl[1]];
                    iArr13[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[44];
                    if (lIlIIlllIIIlIII(Inventory.contains(iArr13) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[48]];
                        int[] iArr14 = new int[lIIlIIIIIIlIl[1]];
                        iArr14[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[44];
                        Inventory.getFirst(iArr14).interact(lIIIllllllIII[lIIlIIIIIIlIl[19]]);
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[49])) {
                int[] iArr15 = new int[lIIlIIIIIIlIl[1]];
                iArr15[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[50];
                TileObject nearest6 = TileObjects.getNearest(iArr15);
                if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIIIIIIlIl[51], lIIlIIIIIIlIl[52], lIIlIIIIIIlIl[0])) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIIlIIIIIIlIl[53], lIIlIIIIIIlIl[54], lIIlIIIIIIlIl[0]);
                    String[] strArr5 = new String[lIIlIIIIIIlIl[1]];
                    strArr5[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[55]];
                    List at = TileObjects.getAt(worldPoint, strArr5);
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[56]];
                    if (lIlIIlllIIIlIlI(at.isEmpty() ? 1 : 0)) {
                        String[] strArr6 = new String[lIIlIIIIIIlIl[1]];
                        strArr6[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[57]];
                        if (lIlIIlllIIIlIII(((TileObject) at.get(lIIlIIIIIIlIl[0])).hasAction(strArr6) ? 1 : 0)) {
                            ((TileObject) at.get(lIIlIIIIIIlIl[0])).interact(lIIIllllllIII[lIIlIIIIIIlIl[58]]);
                            Time.sleepTicks(lIIlIIIIIIlIl[14]);
                            "".length();
                        }
                    }
                    String[] strArr7 = new String[lIIlIIIIIIlIl[1]];
                    strArr7[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[42]];
                    if (lIlIIlllIIIlIII(nearest6.hasAction(strArr7) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[59]];
                        nearest6.interact(lIIIllllllIII[lIIlIIIIIIlIl[60]]);
                    }
                    String[] strArr8 = new String[lIIlIIIIIIlIl[1]];
                    strArr8[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[61]];
                    if (lIlIIlllIIIlIlI(nearest6.hasAction(strArr8) ? 1 : 0)) {
                        String[] strArr9 = new String[lIIlIIIIIIlIl[1]];
                        strArr9[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[62]];
                        Item first2 = Inventory.getFirst(strArr9);
                        int[] iArr16 = new int[lIIlIIIIIIlIl[1]];
                        iArr16[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[50];
                        first2.useOn(TileObjects.getNearest(iArr16));
                    }
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[63])) {
                int[] iArr17 = new int[lIIlIIIIIIlIl[1]];
                iArr17[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[50];
                TileObject nearest7 = TileObjects.getNearest(iArr17);
                String[] strArr10 = new String[lIIlIIIIIIlIl[1]];
                strArr10[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[49]];
                if (lIlIIlllIIIlIII(nearest7.hasAction(strArr10) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[64]];
                    nearest7.interact(lIIIllllllIII[lIIlIIIIIIlIl[65]]);
                }
                String[] strArr11 = new String[lIIlIIIIIIlIl[1]];
                strArr11[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[66]];
                if (lIlIIlllIIIlIlI(nearest7.hasAction(strArr11) ? 1 : 0)) {
                    String[] strArr12 = new String[lIIlIIIIIIlIl[1]];
                    strArr12[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[67]];
                    Item first3 = Inventory.getFirst(strArr12);
                    int[] iArr18 = new int[lIIlIIIIIIlIl[1]];
                    iArr18[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[50];
                    first3.useOn(TileObjects.getNearest(iArr18));
                }
                int[] iArr19 = new int[lIIlIIIIIIlIl[1]];
                iArr19[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[68];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[lIIlIIIIIIlIl[1]];
                    iArr20[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[69];
                    TileObject nearest8 = TileObjects.getNearest(iArr20);
                    if (lIlIIlllIIIlIll(nearest8)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[63]];
                        nearest8.interact(lIIIllllllIII[lIIlIIIIIIlIl[70]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[71])) {
                String[] strArr13 = new String[lIIlIIIIIIlIl[1]];
                strArr13[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[72]];
                TileObject nearest9 = TileObjects.getNearest(strArr13);
                if (lIlIIlllIIIlIll(nearest9)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[73]];
                    int[] iArr21 = new int[lIIlIIIIIIlIl[1]];
                    iArr21[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
                    Inventory.getFirst(iArr21).useOn(nearest9);
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[74])) {
                String[] strArr14 = new String[lIIlIIIIIIlIl[1]];
                strArr14[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[75]];
                TileObject nearest10 = TileObjects.getNearest(strArr14);
                if (lIlIIlllIIIlIll(nearest10)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[71]];
                    int[] iArr22 = new int[lIIlIIIIIIlIl[1]];
                    iArr22[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
                    Inventory.getFirst(iArr22).useOn(nearest10);
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[76])) {
                int[] iArr23 = new int[lIIlIIIIIIlIl[1]];
                iArr23[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[69];
                TileObject nearest11 = TileObjects.getNearest(iArr23);
                if (lIlIIlllIIIlIll(nearest11)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[77]];
                    nearest11.interact(lIIIllllllIII[lIIlIIIIIIlIl[78]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[3]);
                    "".length();
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[79])) {
                int[] iArr24 = new int[lIIlIIIIIIlIl[1]];
                iArr24[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[69];
                TileObject nearest12 = TileObjects.getNearest(iArr24);
                if (lIlIIlllIIIlIll(nearest12) && lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIIIIIIlIl[80], lIIlIIIIIIlIl[26], lIIlIIIIIIlIl[0])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[81]];
                    nearest12.interact(lIIIllllllIII[lIIlIIIIIIlIl[82]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[14]);
                    "".length();
                }
                String[] strArr15 = new String[lIIlIIIIIIlIl[1]];
                strArr15[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[74]];
                TileObject nearest13 = TileObjects.getNearest(strArr15);
                if (lIlIIlllIIIlIll(nearest13) && lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIIlIl[83])) {
                    if (lIlIIlllIIIlIlI(Reachable.isInteractable(nearest13) ? 1 : 0)) {
                        Movement.walkTo(nearest13);
                        "".length();
                        Time.sleepTicks(lIIlIIIIIIlIl[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[84]];
                    nearest13.interact(lIIIllllllIII[lIIlIIIIIIlIl[85]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[14]);
                    "".length();
                }
                int[] iArr25 = new int[lIIlIIIIIIlIl[1]];
                iArr25[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[86];
                TileObject nearest14 = TileObjects.getNearest(iArr25);
                if (lIlIIlllIIIlIll(nearest14) && lIlIIlllIIIlIlI(gH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[87]];
                    nearest14.interact(lIIIllllllIII[lIIlIIIIIIlIl[88]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[13]);
                    "".length();
                }
                C0006g.a(gx);
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[17])) {
                C0006g.a(gx);
                AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[76]];
                int[] iArr26 = new int[lIIlIIIIIIlIl[1]];
                iArr26[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[89];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[lIIlIIIIIIlIl[1]];
                    iArr27[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[89];
                    Inventory.getFirst(iArr27).interact(lIIIllllllIII[lIIlIIIIIIlIl[90]]);
                }
                int[] iArr28 = new int[lIIlIIIIIIlIl[1]];
                iArr28[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[89];
                if (lIlIIlllIIIlIlI(Inventory.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[lIIlIIIIIIlIl[1]];
                    iArr29[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[91];
                    TileObjects.getNearest(iArr29).interact(lIIIllllllIII[lIIlIIIIIIlIl[92]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[3]);
                    "".length();
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[93])) {
                int bit = Vars.getBit(lIIlIIIIIIlIl[94]);
                Widget widget = Widgets.get(lIIlIIIIIIlIl[95], lIIlIIIIIIlIl[11]);
                if (lIlIIlllIIIlIll(widget)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[96]];
                    if (lIlIIlllIIIlIlI(bit)) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[95], lIIlIIIIIIlIl[37]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                        Time.sleepTicks(lIIlIIIIIIlIl[1]);
                        "".length();
                        "".length();
                        if ((-((176 ^ 136) ^ (162 ^ 159))) >= 0) {
                            return;
                        }
                    } else if (lIlIIlllIIIllll(bit, lIIlIIIIIIlIl[1])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[95], lIIlIIIIIIlIl[38]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                    }
                    if (lIlIIlllIIIllll(bit, lIIlIIIIIIlIl[3])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[95], lIIlIIIIIIlIl[33]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                    }
                    if (lIlIIlllIIIllll(bit, lIIlIIIIIIlIl[4])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[95], lIIlIIIIIIlIl[37]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                    }
                }
                if (lIlIIlllIIlIIII(widget)) {
                    String[] strArr16 = new String[lIIlIIIIIIlIl[1]];
                    strArr16[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[97]];
                    TileObjects.getNearest(strArr16).interact(lIIIllllllIII[lIIlIIIIIIlIl[79]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[4]);
                    "".length();
                }
                int[] iArr30 = new int[lIIlIIIIIIlIl[1]];
                iArr30[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[98];
                if (lIlIIlllIIIlIlI(Inventory.contains(iArr30) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[99]];
                    int[] iArr31 = new int[lIIlIIIIIIlIl[1]];
                    iArr31[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[100];
                    TileObject nearest15 = TileObjects.getNearest(iArr31);
                    String[] strArr17 = new String[lIIlIIIIIIlIl[1]];
                    strArr17[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[101]];
                    if (lIlIIlllIIIlIII(nearest15.hasAction(strArr17) ? 1 : 0)) {
                        nearest15.interact(lIIIllllllIII[lIIlIIIIIIlIl[102]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[103])) {
                int[] iArr32 = new int[lIIlIIIIIIlIl[1]];
                iArr32[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[98];
                if (lIlIIlllIIIlIlI(Inventory.contains(iArr32) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[104]];
                    int[] iArr33 = new int[lIIlIIIIIIlIl[1]];
                    iArr33[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[100];
                    TileObject nearest16 = TileObjects.getNearest(iArr33);
                    String[] strArr18 = new String[lIIlIIIIIIlIl[1]];
                    strArr18[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[17]];
                    if (lIlIIlllIIIlIII(nearest16.hasAction(strArr18) ? 1 : 0)) {
                        nearest16.interact(lIIIllllllIII[lIIlIIIIIIlIl[105]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[3]);
                        "".length();
                    }
                }
                if (!lIlIIlllIIIlIII(gI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIlllIIlIIIl(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIIlIl[106])) {
                    String[] strArr19 = new String[lIIlIIIIIIlIl[1]];
                    strArr19[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[107]];
                    TileObject nearest17 = TileObjects.getNearest(strArr19);
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[108]];
                    nearest17.interact(lIIIllllllIII[lIIlIIIIIIlIl[109]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[14]);
                    "".length();
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIIlIl[83])) {
                    int[] iArr34 = new int[lIIlIIIIIIlIl[1]];
                    iArr34[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[69];
                    TileObject nearest18 = TileObjects.getNearest(iArr34);
                    if (lIlIIlllIIIlIll(nearest18)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[93]];
                        nearest18.interact(lIIIllllllIII[lIIlIIIIIIlIl[110]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[14]);
                        "".length();
                    }
                }
                if (lIlIIlllIIIlIII(gJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr35 = new int[lIIlIIIIIIlIl[1]];
                    iArr35[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[111];
                    TileObject nearest19 = TileObjects.getNearest(iArr35);
                    if (lIlIIlllIIIlIll(nearest19)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[112]];
                        nearest19.interact(lIIIllllllIII[lIIlIIIIIIlIl[113]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[18]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[114])) {
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(gG), lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[115]];
                    Movement.walkTo(gG);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(gG), lIIlIIIIIIlIl[4])) {
                    int[] iArr36 = new int[lIIlIIIIIIlIl[1]];
                    iArr36[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[116];
                    TileObject nearest20 = TileObjects.getNearest(iArr36);
                    C0006g.a(gx);
                    if (lIlIIlllIIIlIll(nearest20)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[103]];
                        nearest20.interact(lIIIllllllIII[lIIlIIIIIIlIl[117]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[18]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[118])) {
                AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[119]];
                C0006g.a(gx);
                int[] iArr37 = new int[lIIlIIIIIIlIl[1]];
                iArr37[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[120];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr37) ? 1 : 0)) {
                    int[] iArr38 = new int[lIIlIIIIIIlIl[1]];
                    iArr38[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[120];
                    Inventory.getFirst(iArr38).interact(lIIIllllllIII[lIIlIIIIIIlIl[121]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
                int[] iArr39 = new int[lIIlIIIIIIlIl[1]];
                iArr39[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[120];
                if (lIlIIlllIIIlIlI(Inventory.contains(iArr39) ? 1 : 0)) {
                    int[] iArr40 = new int[lIIlIIIIIIlIl[1]];
                    iArr40[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[122];
                    TileObjects.getNearest(iArr40).interact(lIIIllllllIII[lIIlIIIIIIlIl[123]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[3]);
                    "".length();
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[124])) {
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIIlIl[51])) {
                    int[] iArr41 = new int[lIIlIIIIIIlIl[1]];
                    iArr41[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[111];
                    TileObject nearest21 = TileObjects.getNearest(iArr41);
                    if (lIlIIlllIIIlIll(nearest21)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[114]];
                        nearest21.interact(lIIIllllllIII[lIIlIIIIIIlIl[125]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[18]);
                        "".length();
                    }
                }
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIIlIl[51]) && lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIIlIl[80])) {
                    int[] iArr42 = new int[lIIlIIIIIIlIl[1]];
                    iArr42[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[69];
                    TileObject nearest22 = TileObjects.getNearest(iArr42);
                    if (lIlIIlllIIIlIll(nearest22)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[126]];
                        nearest22.interact(lIIIllllllIII[lIIlIIIIIIlIl[127]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[14]);
                        "".length();
                    }
                }
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[128], lIIlIIIIIIlIl[129], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[1]) && lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[130], lIIlIIIIIIlIl[131], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[4])) {
                    Movement.walkTo(new WorldPoint(lIIlIIIIIIlIl[128], lIIlIIIIIIlIl[129], lIIlIIIIIIlIl[0]));
                    "".length();
                    String[] strArr20 = new String[lIIlIIIIIIlIl[1]];
                    strArr20[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[132]];
                    TileObject nearest23 = TileObjects.getNearest(strArr20);
                    String[] strArr21 = new String[lIIlIIIIIIlIl[1]];
                    strArr21[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[118]];
                    if (lIlIIlllIIIlIII(nearest23.hasAction(strArr21) ? 1 : 0)) {
                        nearest23.interact(lIIIllllllIII[lIIlIIIIIIlIl[133]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[14]);
                        "".length();
                    }
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[130], lIIlIIIIIIlIl[131], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[6])) {
                    C0006g.a(gx);
                    if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getY(), lIIlIIIIIIlIl[129])) {
                        String[] strArr22 = new String[lIIlIIIIIIlIl[1]];
                        strArr22[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[134]];
                        TileObject nearest24 = TileObjects.getNearest(strArr22);
                        String[] strArr23 = new String[lIIlIIIIIIlIl[1]];
                        strArr23[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[135]];
                        if (lIlIIlllIIIlIII(nearest24.hasAction(strArr23) ? 1 : 0)) {
                            nearest24.interact(lIIIllllllIII[lIIlIIIIIIlIl[136]]);
                            Time.sleepTicks(lIIlIIIIIIlIl[1]);
                            "".length();
                        }
                    }
                    String[] strArr24 = new String[lIIlIIIIIIlIl[1]];
                    strArr24[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[124]];
                    TileObject nearest25 = TileObjects.getNearest(strArr24);
                    String[] strArr25 = new String[lIIlIIIIIIlIl[1]];
                    strArr25[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[137]];
                    if (lIlIIlllIIIlIlI(nearest25.hasAction(strArr25) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[138]];
                        int[] iArr43 = new int[lIIlIIIIIIlIl[1]];
                        iArr43[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
                        Item first4 = Inventory.getFirst(iArr43);
                        String[] strArr26 = new String[lIIlIIIIIIlIl[1]];
                        strArr26[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[139]];
                        first4.useOn(TileObjects.getNearest(strArr26));
                        Time.sleepTicks(lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[140])) {
                C0006g.a(gx);
                Widget widget2 = Widgets.get(lIIlIIIIIIlIl[141], lIIlIIIIIIlIl[3]);
                if (lIlIIlllIIIlIll(widget2)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[142]];
                    int bit2 = Vars.getBit(lIIlIIIIIIlIl[143]);
                    if (lIlIIlllIIIlIlI(bit2)) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[141], lIIlIIIIIIlIl[36]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                        "".length();
                        if ((-" ".length()) >= (151 ^ 147)) {
                            return;
                        }
                    } else if (lIlIIlllIIIllll(bit2, lIIlIIIIIIlIl[1])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[141], lIIlIIIIIIlIl[4]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                        "".length();
                        if ("  ".length() <= " ".length()) {
                            return;
                        }
                    } else if (lIlIIlllIIIllll(bit2, lIIlIIIIIIlIl[3])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[141], lIIlIIIIIIlIl[22]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    } else if (lIlIIlllIIIllll(bit2, lIIlIIIIIIlIl[4])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[141], lIIlIIIIIIlIl[39]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                        "".length();
                        if ((((((56 + 49) - (-56)) + 82) ^ (((106 + 27) - 96) + 123)) & (((((16 + 48) - (-44)) + 140) ^ (((115 + 110) - 114) + 60)) ^ (-" ".length()))) != 0) {
                            return;
                        }
                    } else if (lIlIIlllIIIllll(bit2, lIIlIIIIIIlIl[6])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[141], lIIlIIIIIIlIl[14]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                        "".length();
                        if ((-" ".length()) >= " ".length()) {
                            return;
                        }
                    } else if (lIlIIlllIIIllll(bit2, lIIlIIIIIIlIl[11])) {
                        Mouse.click(Widgets.get(lIIlIIIIIIlIl[141], lIIlIIIIIIlIl[24]).getClickPoint().getAwtPoint(), (boolean) lIIlIIIIIIlIl[1]);
                    }
                }
                if (lIlIIlllIIlIIII(widget2) && lIlIIlllIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr27 = new String[lIIlIIIIIIlIl[1]];
                    strArr27[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[140]];
                    TileObject nearest26 = TileObjects.getNearest(strArr27);
                    String[] strArr28 = new String[lIIlIIIIIIlIl[1]];
                    strArr28[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[144]];
                    if (lIlIIlllIIIlIII(nearest26.hasAction(strArr28) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[145]];
                        nearest26.interact(lIIIllllllIII[lIIlIIIIIIlIl[146]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                    String[] strArr29 = new String[lIIlIIIIIIlIl[1]];
                    strArr29[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[147]];
                    if (lIlIIlllIIIlIlI(nearest26.hasAction(strArr29) ? 1 : 0)) {
                        int[] iArr44 = new int[lIIlIIIIIIlIl[1]];
                        iArr44[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
                        Item first5 = Inventory.getFirst(iArr44);
                        String[] strArr30 = new String[lIIlIIIIIIlIl[1]];
                        strArr30[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[148]];
                        first5.useOn(TileObjects.getNearest(strArr30));
                        Time.sleepTicks(lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[148])) {
                int[] iArr45 = new int[lIIlIIIIIIlIl[1]];
                iArr45[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[149];
                if (lIlIIlllIIIlIlI(Inventory.contains(iArr45) ? 1 : 0)) {
                    String[] strArr31 = new String[lIIlIIIIIIlIl[1]];
                    strArr31[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[150]];
                    TileObject nearest27 = TileObjects.getNearest(strArr31);
                    String[] strArr32 = new String[lIIlIIIIIIlIl[1]];
                    strArr32[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[151]];
                    if (lIlIIlllIIIlIII(nearest27.hasAction(strArr32) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[152]];
                        nearest27.interact(lIIIllllllIII[lIIlIIIIIIlIl[153]]);
                        Time.sleepTicks(lIIlIIIIIIlIl[4]);
                        "".length();
                    }
                }
                int[] iArr46 = new int[lIIlIIIIIIlIl[1]];
                iArr46[lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[149];
                if (lIlIIlllIIIlIII(Inventory.contains(iArr46) ? 1 : 0) && lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[154], lIIlIIIIIIlIl[155], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[6])) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[156]];
                    Movement.walkTo(new WorldPoint(lIIlIIIIIIlIl[154], lIIlIIIIIIlIl[155], lIIlIIIIIIlIl[0]));
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
            }
            if (!lIlIIlllIIlIIlI(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[157]) || lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[156])) {
                C0006g.a(gx);
                if (lIlIIlllIIIlIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    String[] strArr33 = new String[lIIlIIIIIIlIl[1]];
                    strArr33[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[157]];
                    TileObjects.getNearest(strArr33).interact(lIIIllllllIII[lIIlIIIIIIlIl[158]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[13]);
                    "".length();
                }
                if (lIlIIlllIIIlIII(Static.getClient().isInInstancedRegion() ? 1 : 0) && lIlIIlllIIlIIII(gK)) {
                    String[] strArr34 = new String[lIIlIIIIIIlIl[1]];
                    strArr34[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[159]];
                    if (lIlIIlllIIIlIll(NPCs.getNearest(strArr34)) && lIlIIlllIIIlIlI(Dialog.isOpen() ? 1 : 0) && lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[157])) {
                        Time.sleepTicks(lIIlIIIIIIlIl[14]);
                        "".length();
                        System.out.println(lIIIllllllIII[lIIlIIIIIIlIl[160]]);
                        gK = Players.getLocal().getWorldLocation();
                    }
                }
                if (lIlIIlllIIIlIll(gK)) {
                    WorldPoint worldPoint2 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[3], lIIlIIIIIIlIl[0]);
                    String[] strArr35 = new String[lIIlIIIIIIlIl[1]];
                    strArr35[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[161]];
                    NPC nearest28 = NPCs.getNearest(strArr35);
                    if (lIlIIlllIIIlIll(nearest28)) {
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                            WorldPoint worldPoint3 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[4], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                                C0004e.b(worldPoint3);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[162]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        WorldPoint worldPoint4 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint5 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY(), lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint6 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY() + lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint7 = new WorldPoint(gK.getX(), gK.getY() + lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint8 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY() + lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint9 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY(), lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint10 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint11 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[3], lIIlIIIIIIlIl[0]);
                        WorldPoint worldPoint12 = new WorldPoint(gK.getX(), gK.getY() - lIIlIIIIIIlIl[3], lIIlIIIIIIlIl[0]);
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            WorldPoint worldPoint13 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[4], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                C0004e.b(worldPoint13);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[163]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                            WorldPoint worldPoint14 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                C0004e.b(worldPoint14);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[164]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                            WorldPoint worldPoint15 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[3], gK.getY() + lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                C0004e.b(worldPoint15);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[165]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                            Time.sleepTicks(lIIlIIIIIIlIl[24]);
                            "".length();
                            WorldPoint worldPoint16 = new WorldPoint(gK.getX() - lIIlIIIIIIlIl[1], gK.getY() + lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                C0004e.b(worldPoint16);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[166]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                            WorldPoint worldPoint17 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY() + lIIlIIIIIIlIl[3], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                C0004e.b(worldPoint17);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[167]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                            Time.sleepTicks(lIIlIIIIIIlIl[24]);
                            "".length();
                            WorldPoint worldPoint18 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY() + lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                C0004e.b(worldPoint18);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[168]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                            WorldPoint worldPoint19 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY() + lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                C0004e.b(worldPoint19);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[169]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                            WorldPoint worldPoint20 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[3], gK.getY() - lIIlIIIIIIlIl[3], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint20) ? 1 : 0)) {
                                C0004e.b(worldPoint20);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint20) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[170]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                        if (lIlIIlllIIIlIII(nearest28.getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                            Time.sleepTicks(lIIlIIIIIIlIl[24]);
                            "".length();
                            WorldPoint worldPoint21 = new WorldPoint(gK.getX() + lIIlIIIIIIlIl[1], gK.getY() - lIIlIIIIIIlIl[3], lIIlIIIIIIlIl[0]);
                            if (lIlIIlllIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint21) ? 1 : 0)) {
                                C0004e.b(worldPoint21);
                                Time.sleepTicks(lIIlIIIIIIlIl[3]);
                                "".length();
                            }
                            if (lIlIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint21) ? 1 : 0)) {
                                nearest28.interact(lIIIllllllIII[lIIlIIIIIIlIl[171]]);
                                Time.sleepTicks(lIIlIIIIIIlIl[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[161])) {
                AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[172]];
                C0006g.a(gx);
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[166])) {
                AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[173]];
                String[] strArr36 = new String[lIIlIIIIIIlIl[1]];
                strArr36[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[174]];
                if (lIlIIlllIIIlIll(TileItems.getNearest(strArr36))) {
                    String[] strArr37 = new String[lIIlIIIIIIlIl[1]];
                    strArr37[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[175]];
                    TileItems.getNearest(strArr37).interact(lIIIllllllIII[lIIlIIIIIIlIl[176]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[3]);
                    "".length();
                }
                String[] strArr38 = new String[lIIlIIIIIIlIl[1]];
                strArr38[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[177]];
                if (lIlIIlllIIIlIII(Inventory.contains(strArr38) ? 1 : 0)) {
                    String[] strArr39 = new String[lIIlIIIIIIlIl[1]];
                    strArr39[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[178]];
                    Inventory.getFirst(strArr39).interact(lIIIllllllIII[lIIlIIIIIIlIl[179]]);
                }
                String[] strArr40 = new String[lIIlIIIIIIlIl[1]];
                strArr40[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[180]];
                if (lIlIIlllIIIlIII(Equipment.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lIIlIIIIIIlIl[1]];
                    strArr41[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[181]];
                    NPCs.getNearest(strArr41).interact(lIIIllllllIII[lIIlIIIIIIlIl[182]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[3]);
                    "".length();
                }
                if (lIlIIlllIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.chooseOption(gx);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[4]);
                    "".length();
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[171])) {
                if (lIlIIlllIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[183]];
                    String[] strArr42 = new String[lIIlIIIIIIlIl[1]];
                    strArr42[lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[184]];
                    TileObjects.getNearest(strArr42).interact(lIIIllllllIII[lIIlIIIIIIlIl[185]]);
                    Time.sleepTicks(lIIlIIIIIIlIl[24]);
                    "".length();
                }
                C0006g.a(gx);
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[176])) {
                AccBuilderRat.c = lIIIllllllIII[lIIlIIIIIIlIl[186]];
                if (lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[187], lIIlIIIIIIlIl[188], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[6])) {
                    Movement.walkTo(new WorldPoint(lIIlIIIIIIlIl[187], lIIlIIIIIIlIl[188], lIIlIIIIIIlIl[0]));
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIlIl[1]);
                    "".length();
                }
                if (lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIIlIl[187], lIIlIIIIIIlIl[188], lIIlIIIIIIlIl[0])), lIIlIIIIIIlIl[6])) {
                    if (lIlIIlllIIIlIIl(co, lIIlIIIIIIlIl[1])) {
                        P.lu += lIIlIIIIIIlIl[1];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIIIlIl[1];
                        P.lu = lIIlIIIIIIlIl[0];
                        cp = lIIlIIIIIIlIl[0];
                    }
                    C0006g.a(lIIIllllllIII[lIIlIIIIIIlIl[189]], gx, lIIlIIIIIIlIl[1]);
                }
            }
            if (lIlIIlllIIIllll(Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[181])) {
            }
            C0006g.a(new String[lIIlIIIIIIlIl[0]]);
        }
        System.out.println("Setting: " + Vars.getBit(QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()));
    }

    private static boolean lIlIIlllIIIlIII(int i2) {
        return i2 != 0;
    }
}
