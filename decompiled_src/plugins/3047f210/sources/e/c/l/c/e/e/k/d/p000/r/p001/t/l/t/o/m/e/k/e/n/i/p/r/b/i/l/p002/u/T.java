package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.T  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/T.class */
public class T implements S {
    private static /* synthetic */ int[] llllIlIlIl;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ int iS;
    static /* synthetic */ WorldArea iX;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ int iT;
    public static /* synthetic */ int iU;
    private static /* synthetic */ String[] llllIlIIll;
    private static /* synthetic */ WorldPoint iY;
    static /* synthetic */ WorldArea iW;
    static /* synthetic */ WorldArea iV;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIIIIIIIII(Skills.getLevel(Skill.AGILITY), llllIlIlIl[2])) {
            ?? r0 = llllIlIlIl[1];
            "".length();
            return ((54 ^ 25) ^ (122 ^ 80)) <= 0 ? ((160 ^ 190) ^ (19 ^ 90)) & (((((34 + 123) - 122) + 200) ^ (((61 + 33) - (-10)) + 84)) ^ (-" ".length())) : r0;
        }
        return llllIlIlIl[0];
    }

    private static void dt() {
        new WorldArea(llllIlIlIl[46], llllIlIlIl[47], llllIlIlIl[12], llllIlIlIl[20], llllIlIlIl[0]);
        WorldArea worldArea = new WorldArea(llllIlIlIl[46], llllIlIlIl[48], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[46], llllIlIlIl[50], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[51], llllIlIlIl[52], llllIlIlIl[53], llllIlIlIl[54], llllIlIlIl[3]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[55], llllIlIlIl[56], llllIlIlIl[24], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[57], llllIlIlIl[58], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[0]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[59], llllIlIlIl[60], llllIlIlIl[12], llllIlIlIl[20], llllIlIlIl[0]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[46], llllIlIlIl[47], llllIlIlIl[61], llllIlIlIl[20], llllIlIlIl[0]);
        if (llIIlllllllII(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[12]];
            C0004e.a(iY);
            Time.sleepTicks(llllIlIlIl[1]);
            "".length();
        }
        if (!(llIIlllllllII(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIIllllllIlI(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llIlIIIIIIIIl(Players.getLocal().getAnimation(), llllIlIlIl[62]) && llIIlllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (llIIllllllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[49]];
                String[] strArr = new String[llllIlIlIl[1]];
                strArr[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[63]];
                TileObjects.getNearest(strArr).interact(llllIlIIll[llllIlIlIl[64]]);
                Time.sleepTicks(llllIlIlIl[3]);
                "".length();
            }
            if (llIIllllllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[53]];
                String[] strArr2 = new String[llllIlIlIl[1]];
                strArr2[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[38]];
                TileObjects.getNearest(strArr2).interact(llllIlIIll[llllIlIlIl[65]]);
                Time.sleepTicks(llllIlIlIl[3]);
                "".length();
            }
            if (llIIllllllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[66]];
                String[] strArr3 = new String[llllIlIlIl[1]];
                strArr3[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[54]];
                TileObjects.getNearest(strArr3).interact(llllIlIIll[llllIlIlIl[67]]);
                Time.sleepTicks(llllIlIlIl[3]);
                "".length();
            }
            if (llIIllllllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[40]];
                String[] strArr4 = new String[llllIlIlIl[1]];
                strArr4[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[68]];
                TileObjects.getNearest(strArr4).interact(llllIlIIll[llllIlIlIl[61]]);
                Time.sleepTicks(llllIlIlIl[2]);
                "".length();
            }
            if (llIIllllllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[69]];
                String[] strArr5 = new String[llllIlIlIl[1]];
                strArr5[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[70]];
                TileObjects.getNearest(strArr5).interact(llllIlIIll[llllIlIlIl[41]]);
                Time.sleepTicks(llllIlIlIl[17]);
                "".length();
            }
            if (llIIllllllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[71]];
                String[] strArr6 = new String[llllIlIlIl[1]];
                strArr6[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[72]];
                TileObjects.getNearest(strArr6).interact(llllIlIIll[llllIlIlIl[73]]);
                Time.sleepTicks(llllIlIlIl[10]);
                "".length();
            }
            if (llIIllllllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[74]];
                String[] strArr7 = new String[llllIlIlIl[1]];
                strArr7[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[42]];
                TileObjects.getNearest(strArr7).interact(llllIlIIll[llllIlIlIl[75]]);
                Time.sleepTicks(llllIlIlIl[17]);
                "".length();
            }
        }
    }

    private static boolean llIIlllllllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIllllllIlI(int i) {
        return i != 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIlIIll[llllIlIlIl[203]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIlIlIl[0];
    }

    private static void llIIllllllIIl() {
        llllIlIlIl = new int[239];
        llllIlIlIl[0] = (251 ^ 190) & ((119 ^ 50) ^ (-1));
        llllIlIlIl[1] = " ".length();
        llllIlIlIl[2] = 20 ^ 17;
        llllIlIlIl[3] = "  ".length();
        llllIlIlIl[4] = (-16393) & 19855;
        llllIlIlIl[5] = (-17019) & 20479;
        llllIlIlIl[6] = 107 ^ 85;
        llllIlIlIl[7] = (((238 + 62) - 259) + 200) ^ (((110 + 8) - 100) + 176);
        llllIlIlIl[8] = (-((-34) & 25189)) & (-1) & 28667;
        llllIlIlIl[9] = (-((-2212) & 2791)) & (-16417) & 20475;
        llllIlIlIl[10] = "   ".length();
        llllIlIlIl[11] = (-((-19003) & 27259)) & (-8) & 13263;
        llllIlIlIl[12] = 61 ^ 55;
        llllIlIlIl[13] = (-24713) & 32719;
        llllIlIlIl[14] = (-16536) & 24543;
        llllIlIlIl[15] = (-135) & 8143;
        llllIlIlIl[16] = (-((-20873) & 29113)) & (-20611) & 32703;
        llllIlIlIl[17] = (36 ^ 76) ^ (197 ^ 169);
        llllIlIlIl[18] = (-4385) & 16364;
        llllIlIlIl[19] = (-((-3607) & 20127)) & (-1027) & 30171;
        llllIlIlIl[20] = 168 ^ 174;
        llllIlIlIl[21] = (-((-5122) & 21539)) & (-8321) & 32747;
        llllIlIlIl[22] = 30 ^ 25;
        llllIlIlIl[23] = (-3135) & 3519;
        llllIlIlIl[24] = 58 ^ 50;
        llllIlIlIl[25] = (-((-17) & 857)) & (-8209) & 28667;
        llllIlIlIl[26] = 86 ^ 95;
        llllIlIlIl[27] = (-((-12309) & 15414)) & (-257) & 24507;
        llllIlIlIl[28] = (-((-9749) & 26262)) & (-4355) & 32727;
        llllIlIlIl[29] = (-((-6517) & 22908)) & (-4225) & 32471;
        llllIlIlIl[30] = (-((-3919) & 8191)) & (-257) & 16382;
        llllIlIlIl[31] = (-16787) & 28638;
        llllIlIlIl[32] = (-20614) & 32471;
        llllIlIlIl[33] = (-(89 ^ 104)) & (-16390) & 28287;
        llllIlIlIl[34] = (-319) & 12286;
        llllIlIlIl[35] = (((189 + 121) - 131) + 67) ^ (((5 + 169) - 120) + 120);
        llllIlIlIl[36] = (-(((6 + 77) - (-119)) + 23)) & (-4113) & 24571;
        llllIlIlIl[37] = (135 ^ 165) ^ (100 ^ 110);
        llllIlIlIl[38] = 126 ^ 113;
        llllIlIlIl[39] = 68 ^ 118;
        llllIlIlIl[40] = 30 ^ 10;
        llllIlIlIl[41] = (171 ^ 129) ^ (150 ^ 165);
        llllIlIlIl[42] = (86 ^ 18) ^ (205 ^ 151);
        llllIlIlIl[43] = (-30930) & 31231;
        llllIlIlIl[44] = (((81 + 102) - 153) + 161) ^ (((24 + 115) - 13) + 5);
        llllIlIlIl[45] = (-21633) & 21939;
        llllIlIlIl[46] = (-((-257) & 30041)) & (-3) & 32255;
        llllIlIlIl[47] = (-((-3591) & 7831)) & (-16897) & 24571;
        llllIlIlIl[48] = (-17055) & 20478;
        llllIlIlIl[49] = 5 ^ 14;
        llllIlIlIl[50] = (-((-18713) & 22971)) & (-1) & 7679;
        llllIlIlIl[51] = (-4619) & 7083;
        llllIlIlIl[52] = (-((-8549) & 29165)) & (-8737) & 32767;
        llllIlIlIl[53] = (90 ^ 105) ^ (35 ^ 30);
        llllIlIlIl[54] = (2 ^ 20) ^ (199 ^ 195);
        llllIlIlIl[55] = (-((-4147) & 30335)) & (-4097) & 32767;
        llllIlIlIl[56] = (-((-2241) & 23236)) & (-37) & 24447;
        llllIlIlIl[57] = (-21506) & 23987;
        llllIlIlIl[58] = (-35) & 3451;
        llllIlIlIl[59] = (-((-23057) & 32279)) & (-20481) & 32183;
        llllIlIlIl[60] = (-25221) & 28647;
        llllIlIlIl[61] = (241 ^ 186) ^ (102 ^ 59);
        llllIlIlIl[62] = -" ".length();
        llllIlIlIl[63] = (29 ^ 10) ^ (125 ^ 102);
        llllIlIlIl[64] = (103 ^ 96) ^ (122 ^ 112);
        llllIlIlIl[65] = 111 ^ 127;
        llllIlIlIl[66] = 121 ^ 104;
        llllIlIlIl[67] = (124 ^ 40) ^ (23 ^ 80);
        llllIlIlIl[68] = 74 ^ 95;
        llllIlIlIl[69] = 164 ^ 179;
        llllIlIlIl[70] = 73 ^ 81;
        llllIlIlIl[71] = (255 ^ 181) ^ (91 ^ 11);
        llllIlIlIl[72] = (67 ^ 94) ^ (188 ^ 186);
        llllIlIlIl[73] = (114 ^ 47) ^ (231 ^ 166);
        llllIlIlIl[74] = (((78 + 127) - 129) + 80) ^ (((16 + 40) - (-69)) + 4);
        llllIlIlIl[75] = 94 ^ 65;
        llllIlIlIl[76] = (-257) & 3423;
        llllIlIlIl[77] = (-21225) & 24574;
        llllIlIlIl[78] = (((238 ^ 162) + (66 ^ 124)) - (44 ^ 67)) + (35 ^ 77);
        llllIlIlIl[79] = (208 ^ 131) ^ (101 ^ 104);
        llllIlIlIl[80] = (-557) & 3775;
        llllIlIlIl[81] = (-((-6401) & 30991)) & (-4225) & 32223;
        llllIlIlIl[82] = (-17155) & 20366;
        llllIlIlIl[83] = (-20738) & 23935;
        llllIlIlIl[84] = (-24747) & 28158;
        llllIlIlIl[85] = (-4610) & 7799;
        llllIlIlIl[86] = (-20489) & 23901;
        llllIlIlIl[87] = (-((-2817) & 31637)) & (-33) & 32253;
        llllIlIlIl[88] = (-21381) & 24559;
        llllIlIlIl[89] = (-((-3209) & 32458)) & (-1) & 32631;
        llllIlIlIl[90] = (-((-17745) & 25951)) & (-16737) & 28159;
        llllIlIlIl[91] = (-25248) & 28639;
        llllIlIlIl[92] = (-4178) & 7411;
        llllIlIlIl[93] = (-16545) & 19946;
        llllIlIlIl[94] = (-((-1346) & 30543)) & (-161) & 32767;
        llllIlIlIl[95] = (16 ^ 71) ^ (126 ^ 9);
        llllIlIlIl[96] = (-((-3010) & 7145)) & (-257) & 7615;
        llllIlIlIl[97] = (161 ^ 149) ^ (154 ^ 143);
        llllIlIlIl[98] = 15 ^ 45;
        llllIlIlIl[99] = (37 ^ 48) ^ (119 ^ 65);
        llllIlIlIl[100] = (25 ^ 112) ^ (61 ^ 112);
        llllIlIlIl[101] = (188 ^ 149) ^ (89 ^ 85);
        llllIlIlIl[102] = (((1 + 168) - 25) + 47) ^ (((141 + 15) - 132) + 129);
        llllIlIlIl[103] = (247 ^ 148) ^ (117 ^ 49);
        llllIlIlIl[104] = (-16971) & 25470;
        llllIlIlIl[105] = 92 ^ 117;
        llllIlIlIl[106] = (100 ^ 89) ^ (24 ^ 15);
        llllIlIlIl[107] = (167 ^ 168) ^ (42 ^ 14);
        llllIlIlIl[108] = (64 ^ 81) ^ (139 ^ 182);
        llllIlIlIl[109] = 188 ^ 145;
        llllIlIlIl[110] = (36 ^ 87) ^ (105 ^ 52);
        llllIlIlIl[111] = (48 ^ 100) ^ (67 ^ 56);
        llllIlIlIl[112] = (145 ^ 196) ^ (239 ^ 138);
        llllIlIlIl[113] = (178 ^ 189) ^ (141 ^ 179);
        llllIlIlIl[114] = 143 ^ 187;
        llllIlIlIl[115] = (-"  ".length()) & (-1025) & 15859;
        llllIlIlIl[116] = (7 ^ 114) ^ (69 ^ 5);
        llllIlIlIl[117] = (((36 + 70) - 98) + 131) ^ (((153 + 57) - 132) + 111);
        llllIlIlIl[118] = (-((-28997) & 29509)) & (-16385) & 31731;
        llllIlIlIl[119] = (186 ^ 165) ^ (65 ^ 105);
        llllIlIlIl[120] = 55 ^ 15;
        llllIlIlIl[121] = (-((-3337) & 3850)) & (-1033) & 16381;
        llllIlIlIl[122] = (120 ^ 11) ^ (202 ^ 128);
        llllIlIlIl[123] = (123 ^ 80) ^ (146 ^ 131);
        llllIlIlIl[124] = 82 ^ 105;
        llllIlIlIl[125] = (-((-169) & 697)) & (-28673) & 32671;
        llllIlIlIl[126] = (-((-17417) & 26237)) & (-2) & 12287;
        llllIlIlIl[127] = (-4673) & 8174;
        llllIlIlIl[128] = (-8717) & 12206;
        llllIlIlIl[129] = (-((-1327) & 9535)) & (-4609) & 16311;
        llllIlIlIl[130] = (-12293) & 15775;
        llllIlIlIl[131] = (-((-15341) & 31741)) & (-8257) & 28153;
        llllIlIlIl[132] = (-((-19730) & 28499)) & (-16395) & 28635;
        llllIlIlIl[133] = (-20485) & 23973;
        llllIlIlIl[134] = (-((-14351) & 30767)) & (-4621) & 24511;
        llllIlIlIl[135] = (-((-2065) & 26705)) & (-4099) & 32223;
        llllIlIlIl[136] = (-12833) & 16299;
        llllIlIlIl[137] = (-10) & 3515;
        llllIlIlIl[138] = (-((-1813) & 14173)) & (-16903) & 32735;
        llllIlIlIl[139] = (-((-14347) & 30763)) & (-4098) & 23999;
        llllIlIlIl[140] = 114 ^ 79;
        llllIlIlIl[141] = (24 ^ 50) ^ (163 ^ 182);
        llllIlIlIl[142] = 197 ^ 133;
        llllIlIlIl[143] = 1 ^ 64;
        llllIlIlIl[144] = (((22 + 38) - (-14)) + 57) ^ (((31 + 125) - 43) + 80);
        llllIlIlIl[145] = 73 ^ 10;
        llllIlIlIl[146] = 224 ^ 164;
        llllIlIlIl[147] = (((141 + 201) - 230) + 124) ^ (((28 + 133) - 54) + 62);
        llllIlIlIl[148] = 28 ^ 90;
        llllIlIlIl[149] = (((219 + 189) - 188) + 30) ^ (((6 + 65) - (-47)) + 71);
        llllIlIlIl[150] = (59 ^ 116) ^ (44 ^ 43);
        llllIlIlIl[151] = (91 ^ 78) ^ (77 ^ 17);
        llllIlIlIl[152] = (141 ^ 192) ^ (81 ^ 86);
        llllIlIlIl[153] = (((108 + 60) - 14) + 40) ^ (((37 + 61) - 35) + 74);
        llllIlIlIl[154] = 93 ^ 17;
        llllIlIlIl[155] = 106 ^ 39;
        llllIlIlIl[156] = (((115 + 223) - 271) + 173) ^ (((132 + 142) - 216) + 132);
        llllIlIlIl[157] = 228 ^ 171;
        llllIlIlIl[158] = (237 ^ 180) ^ (178 ^ 187);
        llllIlIlIl[159] = 31 ^ 78;
        llllIlIlIl[160] = 70 ^ 20;
        llllIlIlIl[161] = 108 ^ 63;
        llllIlIlIl[162] = (-" ".length()) & (-24705) & 27391;
        llllIlIlIl[163] = (-2) & 3455;
        llllIlIlIl[164] = (-((-18601) & 27817)) & (-20737) & 32671;
        llllIlIlIl[165] = (-((-4259) & 21683)) & (-1) & 20125;
        llllIlIlIl[166] = (-((-7827) & 32511)) & (-1) & 27391;
        llllIlIlIl[167] = (-24931) & 27627;
        llllIlIlIl[168] = (-8273) & 10960;
        llllIlIlIl[169] = (-((-10001) & 30551)) & (-17) & 24023;
        llllIlIlIl[170] = (-30021) & 32749;
        llllIlIlIl[171] = (-4640) & 8127;
        llllIlIlIl[172] = 215 ^ 131;
        llllIlIlIl[173] = (33 ^ 72) ^ (181 ^ 137);
        llllIlIlIl[174] = 207 ^ 153;
        llllIlIlIl[175] = 253 ^ 170;
        llllIlIlIl[176] = (104 ^ 115) ^ (248 ^ 186);
        llllIlIlIl[177] = 80 ^ 10;
        llllIlIlIl[178] = 113 ^ 42;
        llllIlIlIl[179] = 17 ^ 77;
        llllIlIlIl[180] = 104 ^ 53;
        llllIlIlIl[181] = 219 ^ 132;
        llllIlIlIl[182] = (180 ^ 167) ^ (68 ^ 55);
        llllIlIlIl[183] = 198 ^ 167;
        llllIlIlIl[184] = 12 ^ 110;
        llllIlIlIl[185] = 1 ^ 98;
        llllIlIlIl[186] = (237 ^ 154) ^ (64 ^ 83);
        llllIlIlIl[187] = (110 ^ 4) ^ (187 ^ 180);
        llllIlIlIl[188] = (91 ^ 53) ^ (137 ^ 129);
        llllIlIlIl[189] = (-28929) & 32119;
        llllIlIlIl[190] = (-((-3417) & 28666)) & (-4097) & 32759;
        llllIlIlIl[191] = (-((-1025) & 30338)) & (-1) & 32495;
        llllIlIlIl[192] = (-((-393) & 21385)) & (-8197) & 32575;
        llllIlIlIl[193] = (-16677) & 28525;
        llllIlIlIl[194] = 101 ^ 2;
        llllIlIlIl[195] = (-(((97 + 99) - 129) + 63)) & (-513) & 6141;
        llllIlIlIl[196] = (-((-25890) & 26419)) & (-1029) & 26557;
        llllIlIlIl[197] = (-((-651) & 31483)) & (-1034) & 32765;
        llllIlIlIl[198] = (-((-13109) & 32629)) & (-9) & 20478;
        llllIlIlIl[199] = (-66) & 2015;
        llllIlIlIl[200] = (-((-26662) & 27951)) & (-4097) & 14335;
        llllIlIlIl[201] = (-((-674) & 17335)) & (-4129) & 32767;
        llllIlIlIl[202] = (-((-465) & 3057)) & (-129) & 28670;
        llllIlIlIl[203] = (96 ^ 91) ^ (127 ^ 44);
        llllIlIlIl[204] = 112 ^ 25;
        llllIlIlIl[205] = 124 ^ 22;
        llllIlIlIl[206] = 12 ^ 103;
        llllIlIlIl[207] = (245 ^ 149) ^ (5 ^ 9);
        llllIlIlIl[208] = (182 ^ 164) ^ (((62 + 30) - 76) + 111);
        llllIlIlIl[209] = (-((-14879) & 16255)) & (-8209) & 12287;
        llllIlIlIl[210] = (-28689) & 32153;
        llllIlIlIl[211] = 20 ^ 122;
        llllIlIlIl[212] = (-((-2755) & 6899)) & (-3) & 7615;
        llllIlIlIl[213] = 20 ^ 123;
        llllIlIlIl[214] = (-((-10837) & 31325)) & (-1313) & 24511;
        llllIlIlIl[215] = (-((-6178) & 14379)) & (-21059) & 32735;
        llllIlIlIl[216] = (208 ^ 180) ^ (167 ^ 179);
        llllIlIlIl[217] = (-20490) & 23199;
        llllIlIlIl[218] = (29 ^ 46) ^ (249 ^ 187);
        llllIlIlIl[219] = (-((-2533) & 19965)) & (-8199) & 28351;
        llllIlIlIl[220] = (-((-16657) & 29009)) & (-16915) & 32759;
        llllIlIlIl[221] = (3 ^ 70) ^ (142 ^ 185);
        llllIlIlIl[222] = (-4169) & 7678;
        llllIlIlIl[223] = (-12289) & 15772;
        llllIlIlIl[224] = (((144 + 134) - 158) + 126) ^ (((28 + 20) - (-52)) + 33);
        llllIlIlIl[225] = (-28689) & 32191;
        llllIlIlIl[226] = (82 ^ 8) ^ (5 ^ 43);
        llllIlIlIl[227] = (208 ^ 146) ^ (42 ^ 29);
        llllIlIlIl[228] = (-((-16774) & 25071)) & (-513) & 12287;
        llllIlIlIl[229] = (-8721) & 12212;
        llllIlIlIl[230] = (42 ^ 30) ^ (202 ^ 136);
        llllIlIlIl[231] = (-12309) & 15807;
        llllIlIlIl[232] = 21 ^ 98;
        llllIlIlIl[233] = (((0 + 172) - 167) + 188) ^ (((131 + 88) - 65) + 31);
        llllIlIlIl[234] = (-12359) & 15863;
        llllIlIlIl[235] = (-4618) & 7085;
        llllIlIlIl[236] = (-70) & 2543;
        llllIlIlIl[237] = (-((-6155) & 22683)) & (-3) & 19967;
        llllIlIlIl[238] = ((45 ^ 35) & ((58 ^ 52) ^ (-1))) ^ (58 ^ 67);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean dx() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[80], llllIlIlIl[81], llllIlIlIl[69], llllIlIlIl[64], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[82], llllIlIlIl[81], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[83], llllIlIlIl[84], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[10]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[189], llllIlIlIl[190], llllIlIlIl[24], llllIlIlIl[2], llllIlIlIl[1]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[85], llllIlIlIl[87], llllIlIlIl[12], llllIlIlIl[24], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[191], llllIlIlIl[192], llllIlIlIl[73], llllIlIlIl[38], llllIlIlIl[10]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[90], llllIlIlIl[91], llllIlIlIl[66], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[92], llllIlIlIl[93], llllIlIlIl[22], llllIlIlIl[26], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[92], llllIlIlIl[94], llllIlIlIl[12], llllIlIlIl[22], llllIlIlIl[10]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[127], llllIlIlIl[128], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[129], llllIlIlIl[127], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[3]);
        WorldArea worldArea12 = new WorldArea(llllIlIlIl[130], llllIlIlIl[131], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[3]);
        WorldArea worldArea13 = new WorldArea(llllIlIlIl[132], llllIlIlIl[133], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea14 = new WorldArea(llllIlIlIl[134], llllIlIlIl[9], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea15 = new WorldArea(llllIlIlIl[135], llllIlIlIl[136], llllIlIlIl[68], llllIlIlIl[53], llllIlIlIl[10]);
        WorldArea worldArea16 = new WorldArea(llllIlIlIl[137], llllIlIlIl[138], llllIlIlIl[63], llllIlIlIl[64], llllIlIlIl[3]);
        WorldArea worldArea17 = new WorldArea(llllIlIlIl[164], llllIlIlIl[133], llllIlIlIl[64], llllIlIlIl[12], llllIlIlIl[10]);
        WorldArea worldArea18 = new WorldArea(llllIlIlIl[165], llllIlIlIl[139], llllIlIlIl[38], llllIlIlIl[53], llllIlIlIl[3]);
        WorldArea worldArea19 = new WorldArea(llllIlIlIl[166], llllIlIlIl[134], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea20 = new WorldArea(llllIlIlIl[167], llllIlIlIl[136], llllIlIlIl[70], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea21 = new WorldArea(llllIlIlIl[168], llllIlIlIl[169], llllIlIlIl[54], llllIlIlIl[63], llllIlIlIl[3]);
        WorldArea[] worldAreaArr = new WorldArea[llllIlIlIl[68]];
        worldAreaArr[llllIlIlIl[0]] = worldArea;
        worldAreaArr[llllIlIlIl[1]] = worldArea2;
        worldAreaArr[llllIlIlIl[3]] = worldArea3;
        worldAreaArr[llllIlIlIl[10]] = worldArea4;
        worldAreaArr[llllIlIlIl[17]] = worldArea5;
        worldAreaArr[llllIlIlIl[2]] = worldArea6;
        worldAreaArr[llllIlIlIl[20]] = worldArea7;
        worldAreaArr[llllIlIlIl[22]] = worldArea8;
        worldAreaArr[llllIlIlIl[24]] = worldArea9;
        worldAreaArr[llllIlIlIl[26]] = worldArea10;
        worldAreaArr[llllIlIlIl[12]] = worldArea11;
        worldAreaArr[llllIlIlIl[49]] = worldArea12;
        worldAreaArr[llllIlIlIl[63]] = worldArea13;
        worldAreaArr[llllIlIlIl[64]] = worldArea14;
        worldAreaArr[llllIlIlIl[53]] = worldArea15;
        worldAreaArr[llllIlIlIl[38]] = worldArea16;
        worldAreaArr[llllIlIlIl[65]] = worldArea17;
        worldAreaArr[llllIlIlIl[66]] = worldArea18;
        worldAreaArr[llllIlIlIl[54]] = worldArea19;
        worldAreaArr[llllIlIlIl[67]] = worldArea20;
        worldAreaArr[llllIlIlIl[40]] = worldArea21;
        int[] iArr = new int[llllIlIlIl[1]];
        iArr[llllIlIlIl[0]] = llllIlIlIl[193];
        if (llIIlllllllIl(TileItems.getNearest(iArr))) {
            System.out.println(llllIlIIll[llllIlIlIl[194]]);
            int i = llllIlIlIl[0];
            while (llIIllllllIll(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[llllIlIlIl[1]];
                iArr2[llllIlIlIl[0]] = llllIlIlIl[193];
                if (llIIllllllIlI(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && llIIllllllIlI(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llllIlIlIl[1];
                }
                i++;
                "".length();
                if (0 != 0) {
                    return ((112 ^ 39) ^ (252 ^ 165)) & (((((76 + 6) - (-30)) + 16) ^ (((136 + 48) - 180) + 138)) ^ (-" ".length()));
                }
            }
        }
        return llllIlIlIl[0];
    }

    private static void llIIllllIlIIl() {
        llllIlIIll = new String[llllIlIlIl[238]];
        llllIlIIll[llllIlIlIl[0]] = llIIllllIIlIl("tz4z0GPhfklKcjgXMR64aQ==", "dvLde");
        llllIlIIll[llllIlIlIl[1]] = llIIllllIIllI("HAUWGTcyCRxQJi8VER4jegUMFSkpQFgDMzMYGxgtNAtYEiU5B1gEK3oNHxkoMxgB", "ZlxpD");
        llllIlIIll[llllIlIlIl[3]] = llIIllllIIllI("IDcYIxUPIgckFU4iAWoQDzgF", "nVnJr");
        llllIlIIll[llllIlIlIl[10]] = llIIllllIIlIl("1HwCDZCzBzKu94c3A2T3+mpOaAnt4bYF", "rLvck");
        llllIlIIll[llllIlIlIl[17]] = llIIllllIIlIl("jjf0DHrNRg+RoYm9bjRXV9qKJKwtqjGoebDD9m32hVJb+0V6TcdzQ4OSDzNgoJH42eUYTDWMXiY=", "LMIPf");
        llllIlIIll[llllIlIlIl[2]] = llIIllllIIlIl("xmGuGrPldKw=", "JrPnD");
        llllIlIIll[llllIlIlIl[20]] = llIIllllIIlIl("R6NfnMAtYAI=", "BMurC");
        llllIlIIll[llllIlIlIl[22]] = llIIllllIIlll("KElykRRocnM=", "XFDIF");
        llllIlIIll[llllIlIlIl[24]] = llIIllllIIlll("BrXFTQFIPfk=", "FmJVy");
        llllIlIIll[llllIlIlIl[26]] = llIIllllIIlIl("SiMYl5iyhPY=", "iEPZu");
        llllIlIIll[llllIlIlIl[12]] = llIIllllIIlIl("JsNoKvDTG28EbbIX6htVnJK8Mk4s7lSC", "vCMKz");
        llllIlIIll[llllIlIlIl[49]] = llIIllllIIllI("LRYNJjoHCgV1JQED", "ndbUI");
        llllIlIIll[llllIlIlIl[63]] = llIIllllIIlIl("iT7ToRJLADV7zSi23ZCXzg==", "GYAzl");
        llllIlIIll[llllIlIlIl[64]] = llIIllllIIlll("DlzCeOeYSOQAMJS3ZM9Lmg==", "nbyte");
        llllIlIIll[llllIlIlIl[53]] = llIIllllIIlIl("+pENDHCPlFV0R9ftTMpMQg==", "QZbxf");
        llllIlIIll[llllIlIlIl[38]] = llIIllllIIlIl("LSlPlxe2iI+fLlJzU1WD/A==", "sOMOf");
        llllIlIIll[llllIlIlIl[65]] = llIIllllIIllI("Jg0TKztIDgwjKw==", "eazFY");
        llllIlIIll[llllIlIlIl[66]] = llIIllllIIllI("ADoLBSYqOAVIJjE3DAss", "CVbhD");
        llllIlIIll[llllIlIlIl[54]] = llIIllllIIllI("LgckH1UYByAUFhI=", "zuAzu");
        llllIlIIll[llllIlIlIl[67]] = llIIllllIIllI("MCM7PiA=", "sORSB");
        llllIlIIll[llllIlIlIl[40]] = llIIllllIIlIl("s4CIEx7IRQQXUZyvUcyTrw==", "pzlzt");
        llllIlIIll[llllIlIlIl[68]] = llIIllllIIllI("KDgWFj0JMBQQcxg2ChI=", "jYzwS");
        llllIlIIll[llllIlIlIl[61]] = llIIllllIIlll("1kLUas6iRm0=", "TnEYX");
        llllIlIIll[llllIlIlIl[69]] = llIIllllIIllI("Cx09KjghHzNnPicGOg==", "HqTGZ");
        llllIlIIll[llllIlIlIl[70]] = llIIllllIIlIl("VFy7MDcCqf5IBVJsc3p4Qg==", "aFHaq");
        llllIlIIll[llllIlIlIl[41]] = llIIllllIIlIl("gZpBtuNZ0zUT2++8vugAAw==", "ZFHxy");
        llllIlIIll[llllIlIlIl[71]] = llIIllllIIlIl("otIV7GVVhS/CwL/qkVPgjQ==", "zBSFb");
        llllIlIIll[llllIlIlIl[72]] = llIIllllIIllI("IAsCBwYMBRRTCQod", "oiqsg");
        llllIlIIll[llllIlIlIl[73]] = llIIllllIIlIl("/VEvjpo4XMeNJ+6XwXsESg==", "DxNaq");
        llllIlIIll[llllIlIlIl[74]] = llIIllllIIlll("FMqq4cHaZy3hT3tO5CBmhg==", "avrPF");
        llllIlIIll[llllIlIlIl[42]] = llIIllllIIllI("PgQiJxUSCjRzBBgWNA==", "qfQSt");
        llllIlIIll[llllIlIlIl[75]] = llIIllllIIllI("MSgMKAoYPFQ5BxA2DCoH", "bYyMo");
        llllIlIIll[llllIlIlIl[95]] = llIIllllIIlIl("pDGKjT7Qv/Ft0ZrR4Tgtug==", "LrkQY");
        llllIlIIll[llllIlIlIl[97]] = llIIllllIIllI("OQwFGnYbC1cWJBUOEg==", "tmwqV");
        llllIlIIll[llllIlIlIl[98]] = llIIllllIIllI("DSMAChY+YgYCCjI=", "YBkcx");
        llllIlIIll[llllIlIlIl[99]] = llIIllllIIlll("goOl645qohoU9137MaplRmdgP6EPJ5Gt", "iEhMi");
        llllIlIIll[llllIlIlIl[100]] = llIIllllIIllI("HCsxDQ==", "HJZhT");
        llllIlIIll[llllIlIlIl[101]] = llIIllllIIllI("GjE7PBAgKz1uByYwKD0B", "IEZNd");
        llllIlIIll[llllIlIlIl[102]] = llIIllllIIlll("He6/fCZ2xXktxW8OOq7aYQ==", "mHeWi");
        llllIlIIll[llllIlIlIl[103]] = llIIllllIIlll("T2wig/HelbE=", "xzmBP");
        llllIlIIll[llllIlIlIl[37]] = llIIllllIIllI("NyMZEhUdPxFBBRg+AgkDB3EaCAgR", "tQvaf");
        llllIlIIll[llllIlIlIl[105]] = llIIllllIIllI("EiADPxE0P0wnED8p", "QLlKy");
        llllIlIIll[llllIlIlIl[106]] = llIIllllIIllI("MyEfARI=", "pSpra");
        llllIlIIll[llllIlIlIl[107]] = llIIllllIIllI("ChcOBwooFQ==", "Frowc");
        llllIlIIll[llllIlIlIl[108]] = llIIllllIIllI("Axci", "DvRjY");
        llllIlIIll[llllIlIlIl[109]] = llIIllllIIllI("OD0RGQ==", "tXpiu");
        llllIlIIll[llllIlIlIl[110]] = llIIllllIIlll("iYmJhZwIRfJ1ehMgmGBQtQ==", "GIgeW");
        llllIlIIll[llllIlIlIl[111]] = llIIllllIIlll("zmfMHv0m/V8=", "hPFDT");
        llllIlIIll[llllIlIlIl[112]] = llIIllllIIllI("JRcZAAsEEw==", "gvuae");
        llllIlIIll[llllIlIlIl[113]] = llIIllllIIlIl("9GM1MjkkER7grNHSLuCUOw==", "CPhBv");
        llllIlIIll[llllIlIlIl[39]] = llIIllllIIlIl("1hTRCdULNys=", "ClHrv");
        llllIlIIll[llllIlIlIl[7]] = llIIllllIIllI("AjQUCQ==", "NQuym");
        llllIlIIll[llllIlIlIl[114]] = llIIllllIIlIl("4nyn7/7WbGl6j81BULEUDQ==", "lJPJh");
        llllIlIIll[llllIlIlIl[116]] = llIIllllIIllI("AiQ4HA==", "NAYlZ");
        llllIlIIll[llllIlIlIl[117]] = llIIllllIIlll("AHIEMSnz26e2rCqfhh6zeQ==", "paCaE");
        llllIlIIll[llllIlIlIl[119]] = llIIllllIIlll("YOw7BN9HZDI=", "WGfWy");
        llllIlIIll[llllIlIlIl[120]] = llIIllllIIlIl("FMjllxITcB7VBRPRlMQk7w==", "jLBHc");
        llllIlIIll[llllIlIlIl[122]] = llIIllllIIlIl("g5zU8I3BkKQ=", "RSBKD");
        llllIlIIll[llllIlIlIl[123]] = llIIllllIIllI("Azo9JAotOj0qWSY8Jj8KIA==", "ESSMy");
        llllIlIIll[llllIlIlIl[124]] = llIIllllIIlIl("1yxHu8SAX8A=", "cuwpG");
        llllIlIIll[llllIlIlIl[44]] = llIIllllIIlll("MvojPkB9hMoLy2OVZD9adA==", "RTMol");
        llllIlIIll[llllIlIlIl[140]] = llIIllllIIllI("OgMycT4bQicwJBUELSJqFw0xIzkR", "tbDQJ");
        llllIlIIll[llllIlIlIl[6]] = llIIllllIIlIl("6KZgscS7jzJBrQMKiTqcsw==", "tMnBK");
        llllIlIIll[llllIlIlIl[141]] = llIIllllIIllI("FBMMBRYuCQpXASgSHwQH", "Ggmwb");
        llllIlIIll[llllIlIlIl[142]] = llIIllllIIllI("NQAPG2wVEwYS", "aacwL");
        llllIlIIll[llllIlIlIl[143]] = llIIllllIIllI("OjoZAAQ=", "yVpmf");
        llllIlIIll[llllIlIlIl[144]] = llIIllllIIlll("oHhSL/3WfM5ZH0cU92oORA==", "CMipu");
        llllIlIIll[llllIlIlIl[145]] = llIIllllIIlll("gYm8C9S+39HGux6MgF45Ig==", "HvIUm");
        llllIlIIll[llllIlIlIl[146]] = llIIllllIIlll("cQTt5DASYzxGaF744tMR9jX+taF89stB", "dMyyX");
        llllIlIIll[llllIlIlIl[147]] = llIIllllIIllI("LSQcKg==", "yEwOQ");
        llllIlIIll[llllIlIlIl[148]] = llIIllllIIlIl("CtRPSMGrO2GJlKYhZHTJHg==", "lSsYG");
        llllIlIIll[llllIlIlIl[149]] = llIIllllIIlll("TuYA8UR7mDk=", "uXJdX");
        llllIlIIll[llllIlIlIl[150]] = llIIllllIIlIl("f8iO1p9CSQ04ABKPqEjovQ==", "jzsjf");
        llllIlIIll[llllIlIlIl[151]] = llIIllllIIlIl("th3XhHJZevo=", "uPPUm");
        llllIlIIll[llllIlIlIl[152]] = llIIllllIIlll("FUp6sSuy8q9pMLD52lGOFQ==", "LRaJK");
        llllIlIIll[llllIlIlIl[153]] = llIIllllIIllI("BwY+Gw==", "MsSkv");
        llllIlIIll[llllIlIlIl[154]] = llIIllllIIlIl("yHTPxVBRL0QLRlRosDfifA==", "nHynC");
        llllIlIIll[llllIlIlIl[155]] = llIIllllIIlll("HHNsyRUdwOg=", "ESnlR");
        llllIlIIll[llllIlIlIl[156]] = llIIllllIIlIl("MTNuMg9Bd4wYDhWofyknaw==", "niRlo");
        llllIlIIll[llllIlIlIl[157]] = llIIllllIIlIl("4jydA+USpME=", "gYENa");
        llllIlIIll[llllIlIlIl[158]] = llIIllllIIllI("BQI7Hz0hEHYINT9XYw==", "OwVoT");
        llllIlIIll[llllIlIlIl[159]] = llIIllllIIlll("gLBnzgnJM+s=", "JntDj");
        llllIlIIll[llllIlIlIl[160]] = llIIllllIIlIl("v0pHFMC51rGrzGIOhg/gyw==", "baNeq");
        llllIlIIll[llllIlIlIl[161]] = llIIllllIIlIl("ns9QwFtk6fo=", "pYwbK");
        llllIlIIll[llllIlIlIl[172]] = llIIllllIIllI("AAcnWhkhRjIbAy8AOAlNLQkkCB4r", "NfQzm");
        llllIlIIll[llllIlIlIl[173]] = llIIllllIIllI("Ji8idBsHbicgDho6", "hNTTo");
        llllIlIIll[llllIlIlIl[174]] = llIIllllIIlll("J8YqUqUrqLxITu6E/CekFg==", "PpswW");
        llllIlIIll[llllIlIlIl[175]] = llIIllllIIlIl("naS+mDfZccg=", "XvNRn");
        llllIlIIll[llllIlIlIl[35]] = llIIllllIIlIl("koFaglTD1xAfYTKznEn4hw==", "obfLv");
        llllIlIIll[llllIlIlIl[176]] = llIIllllIIlll("vsE3iXCDeJn8uKyhkRVhLQ==", "lABlJ");
        llllIlIIll[llllIlIlIl[177]] = llIIllllIIlll("nNmey7sKw0ocQuT+jn+t9A==", "ZWHxh");
        llllIlIIll[llllIlIlIl[178]] = llIIllllIIlIl("QsZnd5HY1DcM9+i7OF5IpA1emYhw/bZk", "vjXZi");
        llllIlIIll[llllIlIlIl[179]] = llIIllllIIlIl("2/rwKe5mAfM=", "ZTGLY");
        llllIlIIll[llllIlIlIl[180]] = llIIllllIIlIl("8WUGKydNW912JUBbVP+JYw==", "fmTWY");
        llllIlIIll[llllIlIlIl[79]] = llIIllllIIlll("p3Tx1dtaXU4=", "pmnDA");
        llllIlIIll[llllIlIlIl[181]] = llIIllllIIlIl("xS+mUDK3dus2BE3FE4Y9Rg==", "xpQpn");
        llllIlIIll[llllIlIlIl[182]] = llIIllllIIlIl("Ii7oGVBWSx8=", "ECQVx");
        llllIlIIll[llllIlIlIl[183]] = llIIllllIIllI("OiMUOggeMVktAAB2Sg==", "pVyJa");
        llllIlIIll[llllIlIlIl[184]] = llIIllllIIlIl("YLTX29x0Nqs=", "uwtAa");
        llllIlIIll[llllIlIlIl[185]] = llIIllllIIllI("CDAKBQwsIkcSBDJlUw==", "BEgue");
        llllIlIIll[llllIlIlIl[186]] = llIIllllIIlll("LIMM4JNAFGo=", "Vuzpb");
        llllIlIIll[llllIlIlIl[187]] = llIIllllIIlIl("9y6Tkea25BFJoJ1yhXW3ug==", "vkUcQ");
        llllIlIIll[llllIlIlIl[188]] = llIIllllIIlIl("VkYMHZqcV8c=", "QiWZV");
        llllIlIIll[llllIlIlIl[194]] = llIIllllIIlll("6mQyfgQxavgb/ji2GNrv1HTACzEMQyWO", "SRbCP");
        llllIlIIll[llllIlIlIl[203]] = llIIllllIIlIl("cjnSXdPPEaQ=", "CAahY");
        llllIlIIll[llllIlIlIl[204]] = llIIllllIIllI("FioSKQkBLg==", "fKaZh");
        llllIlIIll[llllIlIlIl[205]] = llIIllllIIllI("GysmPiUMLw==", "kJUMD");
        llllIlIIll[llllIlIlIl[206]] = llIIllllIIlIl("X3Qr5F1nRTs=", "BWTUo");
        llllIlIIll[llllIlIlIl[207]] = llIIllllIIllI("HhI7OBcJFg==", "nsHKv");
        llllIlIIll[llllIlIlIl[208]] = llIIllllIIlIl("MY5bE+UguDA=", "EChvG");
        llllIlIIll[llllIlIlIl[211]] = llIIllllIIlIl("ZaXdpcAUYW0=", "yizjk");
        llllIlIIll[llllIlIlIl[213]] = llIIllllIIlIl("lgbQFd0yUnw=", "xtNDv");
        llllIlIIll[llllIlIlIl[216]] = llIIllllIIlIl("DN5M7G3+krrDnluqC9w0PA==", "Xoekx");
        llllIlIIll[llllIlIlIl[218]] = llIIllllIIlIl("2lggu3EEi+U=", "pIKDL");
        llllIlIIll[llllIlIlIl[221]] = llIIllllIIlll("58DfbKW/OgM=", "FpDMX");
        llllIlIIll[llllIlIlIl[224]] = llIIllllIIllI("MBIH", "wswhZ");
        llllIlIIll[llllIlIlIl[226]] = llIIllllIIllI("EyEYPGw1LwE1NQ==", "CNtYA");
        llllIlIIll[llllIlIlIl[227]] = llIIllllIIlIl("PvkKDRQtGVk=", "HNgMp");
        llllIlIIll[llllIlIlIl[230]] = llIIllllIIlll("ovwTJgy/55M=", "FzjiL");
        llllIlIIll[llllIlIlIl[232]] = llIIllllIIllI("HhAm", "YqVfa");
        llllIlIIll[llllIlIlIl[233]] = llIIllllIIlIl("MdSx2J/SJf4=", "tGmjX");
    }

    private static String llIIllllIIllI(String lllllllllllllllllIlIlIlIIIIIllll, String lllllllllllllllllIlIlIlIIIIIlllI) {
        String lllllllllllllllllIlIlIlIIIIIllll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIlIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIlIlIIIIIllIl = new StringBuilder();
        char[] lllllllllllllllllIlIlIlIIIIIllII = lllllllllllllllllIlIlIlIIIIIlllI.toCharArray();
        int lllllllllllllllllIlIlIlIIIIIlIll = llllIlIlIl[0];
        char[] charArray = lllllllllllllllllIlIlIlIIIIIllll2.toCharArray();
        int length = charArray.length;
        int i = llllIlIlIl[0];
        while (llIIllllllIll(i, length)) {
            char lllllllllllllllllIlIlIlIIIIlIIII = charArray[i];
            lllllllllllllllllIlIlIlIIIIIllIl.append((char) (lllllllllllllllllIlIlIlIIIIlIIII ^ lllllllllllllllllIlIlIlIIIIIllII[lllllllllllllllllIlIlIlIIIIIlIll % lllllllllllllllllIlIlIlIIIIIllII.length]));
            "".length();
            lllllllllllllllllIlIlIlIIIIIlIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIlIlIIIIIllIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean aa() {
        if (llIlIIIIIIIII(Skills.getBoostedLevel(Skill.AGILITY), llllIlIlIl[37])) {
            int[] iArr = new int[llllIlIlIl[1]];
            iArr[llllIlIlIl[0]] = llllIlIlIl[13];
            if (llIIllllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIlIlIl[1]];
                iArr2[llllIlIlIl[0]] = llllIlIlIl[25];
                if (llIIllllllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllIlIlIl[1]];
                    iArr3[llllIlIlIl[0]] = llllIlIlIl[23];
                    if (llIIllllllIlI(Inventory.contains(iArr3) ? 1 : 0) && ((!llIIlllllllII(Inventory.contains(item -> {
                        return item.getName().contains(llllIlIIll[llllIlIlIl[207]]);
                    }) ? 1 : 0) || llIIllllllIlI(Equipment.contains(item2 -> {
                        return item2.getName().contains(llllIlIIll[llllIlIlIl[206]]);
                    }) ? 1 : 0)) && (!llIIlllllllII(Inventory.contains(C0005f.be) ? 1 : 0) || llIIllllllIlI(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return llllIlIlIl[0];
        }
        int[] iArr4 = new int[llllIlIlIl[1]];
        iArr4[llllIlIlIl[0]] = llllIlIlIl[13];
        if (llIIllllllIlI(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[llllIlIlIl[1]];
            iArr5[llllIlIlIl[0]] = llllIlIlIl[15];
            if (llIIllllllIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llllIlIlIl[1]];
                iArr6[llllIlIlIl[0]] = llllIlIlIl[14];
                if (llIIllllllIlI(Inventory.contains(iArr6) ? 1 : 0) && ((!llIIlllllllII(Inventory.contains(item3 -> {
                    return item3.getName().contains(llllIlIIll[llllIlIlIl[205]]);
                }) ? 1 : 0) || llIIllllllIlI(Equipment.contains(item4 -> {
                    return item4.getName().contains(llllIlIIll[llllIlIlIl[204]]);
                }) ? 1 : 0)) && (!llIIlllllllII(Inventory.contains(C0005f.be) ? 1 : 0) || llIIllllllIlI(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                    ?? r02 = llllIlIlIl[1];
                    "".length();
                    return "  ".length() <= (((((178 + 114) - 169) + 122) ^ (((7 + 173) - 74) + 89)) & (((10 ^ 123) ^ (135 ^ 192)) ^ (-" ".length()))) ? ((64 ^ 68) ^ (157 ^ 199)) & (((((38 + 50) - (-58)) + 83) ^ (((31 + 65) - (-49)) + 42)) ^ (-" ".length())) : r02;
                }
            }
        }
        return llllIlIlIl[0];
    }

    private static boolean llIIlllllllII(int i) {
        return i == 0;
    }

    static {
        llIIllllllIIl();
        llIIllllIlIIl();
        bu = new ArrayList();
        iS = llllIlIlIl[27];
        iT = llllIlIlIl[23];
        iV = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[0]);
        iW = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[1]);
        iX = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[3]);
        iY = new WorldPoint(llllIlIlIl[236], llllIlIlIl[237], llllIlIlIl[0]);
    }

    private static void dv() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[3]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[10]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[127], llllIlIlIl[128], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[129], llllIlIlIl[127], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[3]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[130], llllIlIlIl[131], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[3]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[132], llllIlIlIl[133], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[134], llllIlIlIl[9], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[135], llllIlIlIl[136], llllIlIlIl[68], llllIlIlIl[53], llllIlIlIl[10]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[137], llllIlIlIl[138], llllIlIlIl[63], llllIlIlIl[64], llllIlIlIl[3]);
        WorldPoint worldPoint = new WorldPoint(llllIlIlIl[137], llllIlIlIl[139], llllIlIlIl[0]);
        if (llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlllllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llllIlIlIl[1]);
            "".length();
        }
        if (llIIllllllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llllIlIlIl[1]);
                "".length();
            }
            if (llIlIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llllIlIlIl[1]];
                strArr[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[142]];
                TileObjects.getNearest(strArr).interact(llllIlIIll[llllIlIlIl[143]]);
                Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (-" ".length()) >= 0 ? ((21 ^ 54) ^ (123 ^ 127)) & (((84 ^ 96) ^ (173 ^ 190)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                }, llllIlIlIl[104]);
                "".length();
                Time.sleepTicks(llllIlIlIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llllIlIlIl[1]];
        strArr2[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIIlllllllIl(nearest) && llIIllllllIlI(dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[145]];
            System.out.println(llllIlIIll[llllIlIlIl[146]]);
            nearest.interact(llllIlIIll[llllIlIlIl[147]]);
            Time.sleepTicks(llllIlIlIl[10]);
            "".length();
        }
        if (llIIlllllllII(dx() ? 1 : 0)) {
            if (llIIllllllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[233]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[234], llllIlIlIl[131], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (-" ".length()) >= 0 ? ((237 ^ 133) ^ (48 ^ 84)) & (((195 ^ 144) ^ (209 ^ 142)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[148]];
                    nearest2.interact(llllIlIIll[llllIlIlIl[149]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (-(67 ^ 71)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIIllllllIlI(tileObject2.getName().contains(llllIlIIll[llllIlIlIl[232]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[131], llllIlIlIl[225], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (-((195 ^ 140) ^ (126 ^ 53))) > 0 ? ((196 ^ 135) ^ (189 ^ 163)) & (((((141 + 145) - 204) + 127) ^ (((36 + 75) - (-23)) + 6)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest3)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llllIlIIll[llllIlIlIl[151]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIIllllllIlI(tileObject3.getName().contains(llllIlIIll[llllIlIlIl[230]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[139], llllIlIlIl[231], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return ((117 ^ 60) & ((236 ^ 165) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest4)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llllIlIIll[llllIlIlIl[153]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return 0 != 0 ? ((220 ^ 157) ^ (150 ^ 146)) & (((73 ^ 115) ^ (((40 + 69) - (-18)) + 0)) ^ (-" ".length())) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIIllllllIlI(tileObject4.getName().contains(llllIlIIll[llllIlIlIl[227]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[228], llllIlIlIl[229], llllIlIlIl[10])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return ((64 ^ 18) ^ (89 ^ 15)) <= "  ".length() ? ((((7 + 114) - 90) + 104) ^ (((94 + 125) - 194) + 166)) & (((((87 + 114) - 91) + 44) ^ (((20 + 139) - 14) + 17)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest5)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llllIlIIll[llllIlIlIl[155]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIIllllllIlI(tileObject5.getName().contains(llllIlIIll[llllIlIlIl[226]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[9], llllIlIlIl[130], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return "  ".length() < "  ".length() ? ((118 ^ 87) ^ (94 ^ 120)) & (((((16 + 61) - 28) + 89) ^ (((124 + 28) - 79) + 68)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest6)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llllIlIIll[llllIlIlIl[157]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return " ".length() > (188 ^ 184) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (llIIllllllIlI(tileObject6.getName().contains(llllIlIIll[llllIlIlIl[224]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject6.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[225], llllIlIlIl[215], llllIlIlIl[10])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (112 ^ 116) < ((155 ^ 142) & ((51 ^ 38) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest7)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(llllIlIIll[llllIlIlIl[159]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (((22 ^ 113) ^ (92 ^ 44)) & (((241 ^ 158) ^ (231 ^ 159)) ^ (-" ".length()))) < 0 ? ((184 ^ 170) ^ (109 ^ 37)) & (((((41 + 66) - 68) + 177) ^ (((12 + 62) - (-32)) + 24)) ^ (-" ".length())) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (!llIIllllllIlI(dx() ? 1 : 0) && llIIllllllIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (llIIllllllIlI(tileObject7.getName().contains(llllIlIIll[llllIlIlIl[221]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject7.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[222], llllIlIlIl[223], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return " ".length() > (148 ^ 144) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest8)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(llllIlIIll[llllIlIlIl[161]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (4 ^ 0) == ("   ".length() & ("   ".length() ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
        }
    }

    private static void du() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[1]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[3]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[10]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[80], llllIlIlIl[81], llllIlIlIl[69], llllIlIlIl[64], llllIlIlIl[0]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[82], llllIlIlIl[81], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[83], llllIlIlIl[84], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[10]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[85], llllIlIlIl[86], llllIlIlIl[26], llllIlIlIl[22], llllIlIlIl[1]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[85], llllIlIlIl[87], llllIlIlIl[12], llllIlIlIl[24], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[88], llllIlIlIl[89], llllIlIlIl[75], llllIlIlIl[40], llllIlIlIl[10]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[90], llllIlIlIl[91], llllIlIlIl[66], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[92], llllIlIlIl[93], llllIlIlIl[22], llllIlIlIl[26], llllIlIlIl[10]);
        WorldArea worldArea12 = new WorldArea(llllIlIlIl[92], llllIlIlIl[94], llllIlIlIl[12], llllIlIlIl[22], llllIlIlIl[10]);
        if (llIIlllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[95]];
            if (llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(llllIlIlIl[96], llllIlIlIl[52], llllIlIlIl[0]));
            "".length();
            Time.sleepTicks(llllIlIlIl[1]);
            "".length();
        }
        if (llIlIIIIIIIIl(Players.getLocal().getAnimation(), llllIlIlIl[62]) && llIIlllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[llllIlIlIl[1]];
            strArr[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (llIIlllllllIl(nearest) && llIIllllllIlI(dx() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[98]];
                System.out.println(llllIlIIll[llllIlIlIl[99]]);
                nearest.interact(llllIlIIll[llllIlIlIl[100]]);
                Time.sleepTicks(llllIlIlIl[10]);
                "".length();
            }
            if (llIIlllllllII(dx() ? 1 : 0)) {
                if (llIIllllllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[llllIlIlIl[1]];
                    strArr2[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[102]];
                    TileObjects.getNearest(strArr2).interact(llllIlIIll[llllIlIlIl[103]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return ((((22 + 45) - (-62)) + 31) ^ (((124 + 68) - 126) + 98)) < " ".length() ? ((1 ^ 117) ^ (216 ^ 155)) & (((76 ^ 63) ^ (116 ^ 48)) ^ (-" ".length())) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[37]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[llllIlIlIl[1]];
                    strArr3[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[105]];
                    TileObjects.getNearest(strArr3).interact(llllIlIIll[llllIlIlIl[106]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return " ".length() == (-" ".length()) ? ((((61 + 42) - (-149)) + 0) ^ (((136 + 47) - 62) + 62)) & (((47 ^ 0) ^ (248 ^ 156)) ^ (-" ".length())) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[llllIlIlIl[1]];
                    strArr4[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[108]];
                    TileObjects.getNearest(strArr4).interact(llllIlIIll[llllIlIlIl[109]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (192 ^ 197) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[llllIlIlIl[1]];
                    strArr5[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[111]];
                    TileObjects.getNearest(strArr5).interact(llllIlIIll[llllIlIlIl[112]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[llllIlIlIl[1]];
                    strArr6[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[39]];
                    TileObjects.getNearest(strArr6).interact(llllIlIIll[llllIlIlIl[7]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return "  ".length() == ((76 ^ 82) & ((94 ^ 64) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[llllIlIlIl[1]];
                    iArr[llllIlIlIl[0]] = llllIlIlIl[115];
                    TileObjects.getNearest(iArr).interact(llllIlIIll[llllIlIlIl[116]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (-" ".length()) > 0 ? ((((12 + 129) - 19) + 80) ^ (((78 + 44) - 105) + 115)) & (((83 ^ 25) ^ (188 ^ 184)) ^ (-" ".length())) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[llllIlIlIl[1]];
                    iArr2[llllIlIlIl[0]] = llllIlIlIl[118];
                    TileObjects.getNearest(iArr2).interact(llllIlIIll[llllIlIlIl[119]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return " ".length() < 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[llllIlIlIl[1]];
                    iArr3[llllIlIlIl[0]] = llllIlIlIl[121];
                    TileObjects.getNearest(iArr3).interact(llllIlIIll[llllIlIlIl[122]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllIlI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[llllIlIlIl[1]];
                    strArr7[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[124]];
                    TileObjects.getNearest(strArr7).interact(llllIlIIll[llllIlIlIl[44]]);
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (85 ^ 81) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIIlllllllll(int i) {
        return i > 0;
    }

    private static boolean llIlIIIIIIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIllllllllI(int i, int i2) {
        return i > i2;
    }

    private static void dw() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[3]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[10]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[164], llllIlIlIl[133], llllIlIlIl[64], llllIlIlIl[12], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[165], llllIlIlIl[139], llllIlIlIl[38], llllIlIlIl[53], llllIlIlIl[3]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[166], llllIlIlIl[134], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[167], llllIlIlIl[136], llllIlIlIl[70], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[168], llllIlIlIl[169], llllIlIlIl[54], llllIlIlIl[63], llllIlIlIl[3]);
        WorldPoint worldPoint = new WorldPoint(llllIlIlIl[170], llllIlIlIl[171], llllIlIlIl[0]);
        if (llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlllllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llllIlIlIl[1]);
            "".length();
        }
        if (llIIllllllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llllIlIlIl[1]);
                "".length();
            }
            if (llIlIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llllIlIlIl[1]];
                strArr[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[175]];
                TileObjects.getNearest(strArr).interact(llllIlIIll[llllIlIlIl[35]]);
                Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIlIl[0];
                }, llllIlIlIl[104]);
                "".length();
                Time.sleepTicks(llllIlIlIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llllIlIlIl[1]];
        strArr2[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIIlllllllIl(nearest) && llIIllllllIlI(dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[177]];
            System.out.println(llllIlIIll[llllIlIlIl[178]]);
            nearest.interact(llllIlIIll[llllIlIlIl[179]]);
            Time.sleepTicks(llllIlIlIl[10]);
            "".length();
        }
        if (llIIlllllllII(dx() ? 1 : 0)) {
            if (llIIllllllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[218]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[219], llllIlIlIl[220], llllIlIlIl[10])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[180]];
                    nearest2.interact(llllIlIIll[llllIlIlIl[79]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIIllllllIlI(tileObject2.getName().contains(llllIlIIll[llllIlIlIl[216]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[217], llllIlIlIl[128], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return "   ".length() <= 0 ? ((112 ^ 72) ^ (226 ^ 199)) & (((234 ^ 197) ^ (106 ^ 88)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest3)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llllIlIIll[llllIlIlIl[182]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return ((201 ^ 134) & ((104 ^ 39) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIIllllllIlI(tileObject3.getName().contains(llllIlIIll[llllIlIlIl[213]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[214], llllIlIlIl[215], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest4)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llllIlIIll[llllIlIlIl[184]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return "  ".length() >= (42 ^ 46) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (llIIllllllIlI(dx() ? 1 : 0)) {
                return;
            }
            if (llIIllllllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIIllllllIlI(tileObject4.getName().contains(llllIlIIll[llllIlIlIl[211]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[209], llllIlIlIl[212], llllIlIlIl[10])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return (((113 ^ 107) ^ (185 ^ 154)) & (((((133 + 85) - 103) + 20) ^ (((117 + 39) - 100) + 134)) ^ (-" ".length()))) != 0 ? ("   ".length() ^ (77 ^ 102)) & (((104 ^ 69) ^ (111 ^ 106)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest5)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llllIlIIll[llllIlIlIl[186]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return " ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
            if (!llIIllllllIlI(dx() ? 1 : 0) && llIIllllllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIIllllllIlI(tileObject5.getName().contains(llllIlIIll[llllIlIlIl[208]]) ? 1 : 0) && llIlIIIIIIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[209], llllIlIlIl[210], llllIlIlIl[3])), llllIlIlIl[3])) {
                        ?? r0 = llllIlIlIl[1];
                        "".length();
                        return 0 != 0 ? ((148 ^ 144) ^ (29 ^ 50)) & (((114 ^ 104) ^ (71 ^ 118)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIlIl[0];
                });
                if (llIIlllllllIl(nearest6)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llllIlIIll[llllIlIlIl[188]]);
                    Time.sleepTicks(C0004e.c(llllIlIlIl[1], llllIlIlIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIIllllllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llllIlIlIl[1];
                            "".length();
                            return "  ".length() > "  ".length() ? ((95 ^ 85) ^ (105 ^ 79)) & (((((36 + 66) - (-3)) + 64) ^ (((130 + 95) - 201) + 109)) ^ (-" ".length())) : r0;
                        }
                        return llllIlIlIl[0];
                    }, llllIlIlIl[104]);
                    "".length();
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlIIIIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIllllllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIIIIIIIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void ds() {
        if (llIIllllllIlI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[0]];
            C0001b.a(bu);
            if (llIIllllllIll(bu.size(), llllIlIlIl[1])) {
                System.out.println(llllIlIIll[llllIlIlIl[1]]);
                bs = llllIlIlIl[0];
            }
        }
        if (llIIlllllllII(bs ? 1 : 0) && llIIllllllIll(Skills.getLevel(Skill.AGILITY), llllIlIlIl[2])) {
            if (llIIlllllllII(aa() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlllllllIl(nearest) && llIIlllllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[3]];
                    if (llIIllllllIlI(new WorldArea(llllIlIlIl[4], llllIlIlIl[5], llllIlIlIl[6], llllIlIlIl[7], llllIlIlIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llllIlIlIl[8], llllIlIlIl[9], llllIlIlIl[0]);
                        if (llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIlIlIl[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llllIlIlIl[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (llIIlllllllIl(nearest) && llIIllllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[10]];
                    if (llIIlllllllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIlIlIl[11]);
                        "".length();
                    }
                    if (llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (llIIlllllllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIlIlIl[1]);
                            "".length();
                        }
                        if (llIIlllllllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIlIlIl[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[llllIlIlIl[12]];
                    iArr[llllIlIlIl[0]] = llllIlIlIl[13];
                    iArr[llllIlIlIl[1]] = llllIlIlIl[14];
                    iArr[llllIlIlIl[3]] = llllIlIlIl[15];
                    iArr[llllIlIlIl[10]] = llllIlIlIl[16];
                    iArr[llllIlIlIl[17]] = llllIlIlIl[18];
                    iArr[llllIlIlIl[2]] = llllIlIlIl[19];
                    iArr[llllIlIlIl[20]] = llllIlIlIl[21];
                    iArr[llllIlIlIl[22]] = llllIlIlIl[23];
                    iArr[llllIlIlIl[24]] = llllIlIlIl[25];
                    iArr[llllIlIlIl[26]] = llllIlIlIl[27];
                    if (llIIlllllllII(C0004e.b(iArr) ? 1 : 0)) {
                        ae();
                        System.out.println(llllIlIIll[llllIlIlIl[17]]);
                        bs = llllIlIlIl[1];
                        return;
                    }
                    int[] iArr2 = new int[llllIlIlIl[12]];
                    iArr2[llllIlIlIl[0]] = llllIlIlIl[13];
                    iArr2[llllIlIlIl[1]] = llllIlIlIl[14];
                    iArr2[llllIlIlIl[3]] = llllIlIlIl[15];
                    iArr2[llllIlIlIl[10]] = llllIlIlIl[16];
                    iArr2[llllIlIlIl[17]] = llllIlIlIl[18];
                    iArr2[llllIlIlIl[2]] = llllIlIlIl[19];
                    iArr2[llllIlIlIl[20]] = llllIlIlIl[21];
                    iArr2[llllIlIlIl[22]] = llllIlIlIl[23];
                    iArr2[llllIlIlIl[24]] = llllIlIlIl[25];
                    iArr2[llllIlIlIl[26]] = llllIlIlIl[27];
                    if (llIIllllllIlI(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(llllIlIlIl[28], llllIlIlIl[1]);
                        C0000a.a(llllIlIlIl[29], llllIlIlIl[1]);
                        C0000a.a(llllIlIlIl[30], llllIlIlIl[1]);
                        C0000a.a(llllIlIlIl[31], llllIlIlIl[1]);
                        C0000a.a(llllIlIlIl[32], llllIlIlIl[1]);
                        C0000a.a(llllIlIlIl[33], llllIlIlIl[1]);
                        C0000a.a(llllIlIlIl[34], llllIlIlIl[1]);
                        int[] iArr3 = new int[llllIlIlIl[1]];
                        iArr3[llllIlIlIl[0]] = llllIlIlIl[28];
                        if (llIIlllllllII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llllIlIlIl[1]];
                            iArr4[llllIlIlIl[0]] = llllIlIlIl[28];
                            if (llIIlllllllII(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llllIlIlIl[1]];
                                iArr5[llllIlIlIl[0]] = llllIlIlIl[28];
                                if (llIIlllllllII(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(llllIlIlIl[35], llllIlIlIl[1]);
                                }
                            }
                        }
                        C0000a.a(llllIlIlIl[18], llllIlIlIl[1]);
                        C0004e.l(llllIlIlIl[28]);
                        C0004e.l(llllIlIlIl[29]);
                        C0004e.l(llllIlIlIl[30]);
                        C0004e.l(llllIlIlIl[31]);
                        C0004e.l(llllIlIlIl[32]);
                        Time.sleepTicks(llllIlIlIl[1]);
                        "".length();
                        C0004e.l(llllIlIlIl[34]);
                        C0004e.l(llllIlIlIl[36]);
                        C0004e.l(llllIlIlIl[33]);
                        C0004e.l(llllIlIlIl[35]);
                        C0004e.l(llllIlIlIl[18]);
                        Time.sleepTicks(llllIlIlIl[10]);
                        "".length();
                        if (llIIlllllllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llllIlIlIl[20]);
                            "".length();
                        }
                        if (llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (llIIllllllIll(Skills.getLevel(Skill.AGILITY), llllIlIlIl[37])) {
                                C0000a.a(llllIlIlIl[13], llllIlIlIl[12]);
                                C0000a.a(llllIlIlIl[14], llllIlIlIl[12]);
                                C0000a.a(llllIlIlIl[21], llllIlIlIl[12]);
                                C0000a.a(llllIlIlIl[15], llllIlIlIl[12]);
                                C0000a.b(C0005f.be, llllIlIlIl[1]);
                                C0000a.a(llllIlIlIl[27], llllIlIlIl[1]);
                                C0000a.a(llllIlIlIl[19], llllIlIlIl[2]);
                                C0000a.a(llllIlIlIl[23], llllIlIlIl[38]);
                            }
                            if (llIlIIIIIIIII(Skills.getLevel(Skill.AGILITY), llllIlIlIl[37])) {
                                C0000a.a(llllIlIlIl[13], llllIlIlIl[12]);
                                C0000a.a(llllIlIlIl[21], llllIlIlIl[12]);
                                C0000a.a(llllIlIlIl[25], llllIlIlIl[12]);
                                C0000a.b(C0005f.be, llllIlIlIl[1]);
                                C0000a.a(llllIlIlIl[27], llllIlIlIl[1]);
                                C0000a.a(llllIlIlIl[19], llllIlIlIl[24]);
                                C0000a.a(llllIlIlIl[23], llllIlIlIl[12]);
                            }
                        }
                    }
                }
            }
            if (llIIllllllIlI(aa() ? 1 : 0)) {
                String[] strArr = new String[llllIlIlIl[1]];
                strArr[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[2]];
                if (llIIllllllIlI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llllIlIlIl[1]];
                    strArr2[llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[20]];
                    Inventory.getFirst(strArr2).interact(llllIlIIll[llllIlIlIl[22]]);
                }
                if (llIIllllllIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIllllllIll(Movement.getRunEnergy(), llllIlIlIl[39])) {
                    Inventory.getFirst(C0005f.aU).interact(llllIlIIll[llllIlIlIl[24]]);
                    Time.sleepTicks(llllIlIlIl[1]);
                    "".length();
                }
                if (llIIllllllllI(Combat.getMissingHealth(), llllIlIlIl[40])) {
                    int[] iArr6 = new int[llllIlIlIl[1]];
                    iArr6[llllIlIlIl[0]] = llllIlIlIl[23];
                    if (llIIllllllIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llllIlIlIl[1]];
                        iArr7[llllIlIlIl[0]] = llllIlIlIl[23];
                        Inventory.getFirst(iArr7).interact(llllIlIIll[llllIlIlIl[26]]);
                        Time.sleepTicks(llllIlIlIl[3]);
                        "".length();
                    }
                }
                if (llIIllllllllI(Movement.getRunEnergy(), llllIlIlIl[41]) && llIIlllllllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (llIIllllllIll(Skills.getLevel(Skill.AGILITY), llllIlIlIl[42])) {
                    dt();
                }
                if ((!llIlIIIIIIIII(C0004e.j(llllIlIlIl[43]), llllIlIlIl[44]) || llIIllllllIll(C0004e.j(llllIlIlIl[45]), llllIlIlIl[2])) && llIlIIIIIIIII(Skills.getLevel(Skill.AGILITY), llllIlIlIl[42]) && llIIllllllIll(Skills.getLevel(Skill.AGILITY), llllIlIlIl[44])) {
                    du();
                }
                if (llIlIIIIIIIII(C0004e.j(llllIlIlIl[43]), llllIlIlIl[44]) && llIlIIIIIIIII(C0004e.j(llllIlIlIl[45]), llllIlIlIl[2])) {
                    if (llIlIIIIIIIII(Skills.getLevel(Skill.AGILITY), llllIlIlIl[42]) && llIIllllllIll(Skills.getLevel(Skill.AGILITY), llllIlIlIl[37])) {
                        du();
                    }
                    if (llIlIIIIIIIII(Skills.getLevel(Skill.AGILITY), llllIlIlIl[37]) && llIIllllllIll(Skills.getLevel(Skill.AGILITY), llllIlIlIl[44])) {
                        dv();
                    }
                }
                if (llIlIIIIIIIII(Skills.getLevel(Skill.AGILITY), llllIlIlIl[44])) {
                    dw();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (llIIllllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.T.llllIlIlIl[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (llIIllllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.T.llllIlIlIl[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[llllIlIlIl[1]];
        iArr4[llllIlIlIl[0]] = llllIlIlIl[16];
        if (llIIlllllllII(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllIlIlIl[16], llllIlIlIl[1], llllIlIlIl[195]));
            "".length();
        }
        int[] iArr5 = new int[llllIlIlIl[1]];
        iArr5[llllIlIlIl[0]] = llllIlIlIl[18];
        if (llIIlllllllII(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllIlIlIl[18], llllIlIlIl[3], llllIlIlIl[196]));
            "".length();
        }
        int[] iArr6 = new int[llllIlIlIl[1]];
        iArr6[llllIlIlIl[0]] = llllIlIlIl[27];
        if (llIIlllllllII(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(llllIlIlIl[27], llllIlIlIl[3], llllIlIlIl[196]));
            "".length();
        }
        int[] iArr7 = new int[llllIlIlIl[1]];
        iArr7[llllIlIlIl[0]] = llllIlIlIl[13];
        if (llIIlllllllII(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(llllIlIlIl[13], llllIlIlIl[12], llllIlIlIl[197]));
            "".length();
        }
        int[] iArr8 = new int[llllIlIlIl[1]];
        iArr8[llllIlIlIl[0]] = llllIlIlIl[21];
        if (llIIlllllllII(Bank.contains(iArr8) ? 1 : 0)) {
            bu.add(new C0003d(llllIlIlIl[21], llllIlIlIl[12], llllIlIlIl[198]));
            "".length();
        }
        int[] iArr9 = new int[llllIlIlIl[1]];
        iArr9[llllIlIlIl[0]] = llllIlIlIl[15];
        if (llIIlllllllII(Bank.contains(iArr9) ? 1 : 0)) {
            bu.add(new C0003d(llllIlIlIl[15], llllIlIlIl[12], llllIlIlIl[198]));
            "".length();
        }
        int[] iArr10 = new int[llllIlIlIl[1]];
        iArr10[llllIlIlIl[0]] = llllIlIlIl[14];
        if (llIIlllllllII(Bank.contains(iArr10) ? 1 : 0)) {
            bu.add(new C0003d(llllIlIlIl[14], llllIlIlIl[12], llllIlIlIl[198]));
            "".length();
        }
        int[] iArr11 = new int[llllIlIlIl[1]];
        iArr11[llllIlIlIl[0]] = llllIlIlIl[23];
        if (llIIllllllIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[llllIlIlIl[1]];
            iArr12[llllIlIlIl[0]] = llllIlIlIl[23];
            if (llIIllllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llllIlIlIl[1]];
                iArr13[llllIlIlIl[0]] = llllIlIlIl[23];
            }
            iArr = new int[llllIlIlIl[1]];
            iArr[llllIlIlIl[0]] = llllIlIlIl[25];
            if (llIIllllllIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[llllIlIlIl[1]];
                iArr14[llllIlIlIl[0]] = llllIlIlIl[25];
                if (llIIllllllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llllIlIlIl[1]];
                    iArr15[llllIlIlIl[0]] = llllIlIlIl[25];
                }
                iArr2 = new int[llllIlIlIl[1]];
                iArr2[llllIlIlIl[0]] = llllIlIlIl[201];
                if (llIIlllllllII(Bank.contains(iArr2) ? 1 : 0)) {
                    bu.add(new C0003d(llllIlIlIl[201], llllIlIlIl[1], llllIlIlIl[202]));
                    "".length();
                }
                iArr3 = new int[llllIlIlIl[1]];
                iArr3[llllIlIlIl[0]] = llllIlIlIl[19];
                if (llIIlllllllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bu.add(new C0003d(llllIlIlIl[19], llllIlIlIl[40], C0008i.bp));
                    "".length();
                    return;
                }
                return;
            }
            bu.add(new C0003d(llllIlIlIl[25], llllIlIlIl[12], llllIlIlIl[200]));
            "".length();
            iArr2 = new int[llllIlIlIl[1]];
            iArr2[llllIlIlIl[0]] = llllIlIlIl[201];
            if (llIIlllllllII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llllIlIlIl[1]];
            iArr3[llllIlIlIl[0]] = llllIlIlIl[19];
            if (llIIlllllllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bu.add(new C0003d(iT, llllIlIlIl[44], llllIlIlIl[199]));
        "".length();
        iArr = new int[llllIlIlIl[1]];
        iArr[llllIlIlIl[0]] = llllIlIlIl[25];
        if (llIIllllllIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlIl[25], llllIlIlIl[12], llllIlIlIl[200]));
        "".length();
        iArr2 = new int[llllIlIlIl[1]];
        iArr2[llllIlIlIl[0]] = llllIlIlIl[201];
        if (llIIlllllllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llllIlIlIl[1]];
        iArr3[llllIlIlIl[0]] = llllIlIlIl[19];
        if (llIIlllllllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static String llIIllllIIlll(String lllllllllllllllllIlIlIIllllllIlI, String lllllllllllllllllIlIlIIllllllIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIlllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIllllllIIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIl[24]), "DES");
            Cipher lllllllllllllllllIlIlIIlllllllII = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIIlllllllII.init(llllIlIlIl[3], lllllllllllllllllIlIlIIlllllllIl);
            return new String(lllllllllllllllllIlIlIIlllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIIllllllIll) {
            lllllllllllllllllIlIlIIllllllIll.printStackTrace();
            return null;
        }
    }

    private static String llIIllllIIlIl(String lllllllllllllllllIlIlIlIIIIlllll, String lllllllllllllllllIlIlIlIIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIlIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIlIl[3], lllllllllllllllllIlIlIlIIIlIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIlIIIlIIIII) {
            lllllllllllllllllIlIlIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            ds();
            "".length();
            if ((-"  ".length()) > 0) {
                return (155 ^ 197) & ((47 ^ 113) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllIlIlIl[186];
    }
}
