package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/q.class */
public class C0016q implements F {
    private static /* synthetic */ int cq;
    static /* synthetic */ WorldArea cl;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] bX;
    static /* synthetic */ WorldArea cn;
    private static /* synthetic */ int[] llIllIIl;
    private static /* synthetic */ String cr;
    static /* synthetic */ boolean cj;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ String[] llIllIII;
    public static /* synthetic */ List<C0003d> bB;
    static /* synthetic */ WorldPoint co;
    static /* synthetic */ WorldArea cm;
    static /* synthetic */ int ci;
    static /* synthetic */ WorldPoint cp;

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIllIlllIll(cr, llIllIII[llIllIIl[159]]) ? llIllIII[llIllIIl[160]] : "Animal Magnetism - " + cr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIllIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIllIllIlII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[2])) {
            ?? r0 = llIllIIl[0];
            "".length();
            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIllIIl[1];
    }

    private static boolean lIllIllIlll(int i) {
        return i < 0;
    }

    private static boolean lIllIlllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIllIIII(int i) {
        return i != 0;
    }

    private static String lIllIIllllI(String lIlIIIlllllllIl, String lIlIIIlllllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIIl[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIlllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIllllllllI) {
            lIlIIIllllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIllIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ac() {
        int[] iArr = new int[llIllIIl[20]];
        iArr[llIllIIl[1]] = llIllIIl[36];
        iArr[llIllIIl[0]] = llIllIIl[37];
        iArr[llIllIIl[9]] = llIllIIl[34];
        iArr[llIllIIl[11]] = llIllIIl[40];
        iArr[llIllIIl[13]] = llIllIIl[41];
        iArr[llIllIIl[8]] = llIllIIl[30];
        iArr[llIllIIl[16]] = llIllIIl[31];
        int i = llIllIIl[1];
        while (lIllIllIIIl(i, iArr.length)) {
            int[] iArr2 = new int[llIllIIl[0]];
            iArr2[llIllIIl[1]] = iArr[i];
            if (lIllIllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIllIIl[1];
            }
            i++;
            "".length();
            if ((-" ".length()) > "  ".length()) {
                return ((194 ^ 187) ^ (94 ^ 30)) & (((163 ^ 144) ^ (155 ^ 145)) ^ (-" ".length()));
            }
        }
        return llIllIIl[0];
    }

    private static boolean lIllIllIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlllIIl(int i, int i2) {
        return i <= i2;
    }

    private static int lIllIlIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIllIllIllI(int i) {
        return i > 0;
    }

    private static boolean lIllIllIIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIlllI() {
        llIllIIl = new int[182];
        llIllIIl[0] = " ".length();
        llIllIIl[1] = ((245 ^ 175) ^ (119 ^ 9)) & (((((133 + 105) - 83) + 4) ^ (((61 + 153) - 141) + 114)) ^ (-" ".length()));
        llIllIIl[2] = ((163 + 231) - 370) + 216;
        llIllIIl[3] = 6 ^ 71;
        llIllIIl[4] = (97 ^ 67) ^ (169 ^ 129);
        llIllIIl[5] = (-((-4311) & 30423)) & (-17) & 26430;
        llIllIIl[6] = (((134 + 145) - 124) + 13) ^ (((58 + 147) - 180) + 123);
        llIllIIl[7] = (-((-121) & 15101)) & (-9) & 15295;
        llIllIIl[8] = 31 ^ 26;
        llIllIIl[9] = "  ".length();
        llIllIIl[10] = (74 ^ 12) ^ (213 ^ 179);
        llIllIIl[11] = "   ".length();
        llIllIIl[12] = (6 ^ 48) ^ (24 ^ 61);
        llIllIIl[13] = 100 ^ 96;
        llIllIIl[14] = 185 ^ 154;
        llIllIIl[15] = (94 ^ 88) ^ (70 ^ 114);
        llIllIIl[16] = 144 ^ 150;
        llIllIIl[17] = (-((-539) & 30239)) & (-2058) & 32767;
        llIllIIl[18] = (-21890) & 23965;
        llIllIIl[19] = 82 ^ 91;
        llIllIIl[20] = 170 ^ 173;
        llIllIIl[21] = 123 ^ 115;
        llIllIIl[22] = 108 ^ 68;
        llIllIIl[23] = 166 ^ 173;
        llIllIIl[24] = (((42 + 29) - (-8)) + 54) ^ (((43 + 84) - 68) + 78);
        llIllIIl[25] = (((101 + 110) - 41) + 34) ^ (((47 + 0) - 20) + 166);
        llIllIIl[26] = 90 ^ 84;
        llIllIIl[27] = (-((-20996) & 29303)) & (-5) & 13311;
        llIllIIl[28] = 50 ^ 61;
        llIllIIl[29] = (-14385) & 16315;
        llIllIIl[30] = (-((-3219) & 15603)) & (-769) & 32767;
        llIllIIl[31] = (-4929) & 24549;
        llIllIIl[32] = (-((-14405) & 32117)) & (-6337) & 24574;
        llIllIIl[33] = (-12369) & 14719;
        llIllIIl[34] = (-45) & 12669;
        llIllIIl[35] = (120 ^ 26) ^ (80 ^ 34);
        llIllIIl[36] = (-((-1287) & 17855)) & (-1) & 24575;
        llIllIIl[37] = (-((-2433) & 7057)) & (-10245) & 16223;
        llIllIIl[38] = (-22209) & 24555;
        llIllIIl[39] = (-12289) & 14031;
        llIllIIl[40] = (-24642) & 26359;
        llIllIIl[41] = (-17979) & 28474;
        llIllIIl[42] = (27 ^ 49) ^ (131 ^ 184);
        llIllIIl[43] = (-(((86 + 3) - 17) + 77)) & (-16386) & 24543;
        llIllIIl[44] = (-((-17450) & 31995)) & (-16389) & 31485;
        llIllIIl[45] = (-((-21403) & 29599)) & (-4113) & 13303;
        llIllIIl[46] = (13 ^ 39) ^ (67 ^ 123);
        llIllIIl[47] = (117 ^ 104) ^ (40 ^ 45);
        llIllIIl[48] = " ".length() ^ (154 ^ 143);
        llIllIIl[49] = 180 ^ 161;
        llIllIIl[50] = 22 ^ 0;
        llIllIIl[51] = ((133 ^ 160) & ((144 ^ 181) ^ (-1))) ^ (110 ^ 121);
        llIllIIl[52] = (-((-361) & 29675)) & (-321) & 32731;
        llIllIIl[53] = (-((-2485) & 23487)) & (-198) & 24559;
        llIllIIl[54] = 79 ^ 86;
        llIllIIl[55] = (162 ^ 168) ^ (184 ^ 168);
        llIllIIl[56] = (-28837) & 32190;
        llIllIIl[57] = 9 ^ 18;
        llIllIIl[58] = (34 ^ 113) ^ (225 ^ 174);
        llIllIIl[59] = 6 ^ 27;
        llIllIIl[60] = (-((-70) & 1615)) & (-26881) & 32703;
        llIllIIl[61] = (-((-3295) & 27903)) & (-7) & 28279;
        llIllIIl[62] = (-((-2443) & 31691)) & (-1) & 32767;
        llIllIIl[63] = (-((-12479) & 15871)) & (-8194) & 15871;
        llIllIIl[64] = (192 ^ 167) ^ (13 ^ 116);
        llIllIIl[65] = 2 ^ 29;
        llIllIIl[66] = 127 ^ 94;
        llIllIIl[67] = 130 ^ 160;
        llIllIIl[68] = (180 ^ 190) ^ (182 ^ 152);
        llIllIIl[69] = (242 ^ 193) ^ (141 ^ 155);
        llIllIIl[70] = (((11 + 136) - 67) + 98) ^ (((113 + 80) - 67) + 22);
        llIllIIl[71] = (61 ^ 58) ^ (97 ^ 65);
        llIllIIl[72] = 44 ^ 5;
        llIllIIl[73] = (-((-24964) & 29135)) & (-817) & 63487;
        llIllIIl[74] = (-(((42 + 117) - 75) + 87)) & (-17) & 63486;
        llIllIIl[75] = 159 ^ 181;
        llIllIIl[76] = (105 ^ 18) ^ (236 ^ 188);
        llIllIIl[77] = 82 ^ 126;
        llIllIIl[78] = 79 ^ 98;
        llIllIIl[79] = (((28 + 60) - 59) + 103) ^ (((144 + 23) - 41) + 44);
        llIllIIl[80] = (101 ^ 37) ^ (62 ^ 81);
        llIllIIl[81] = 171 ^ 155;
        llIllIIl[82] = 156 ^ 173;
        llIllIIl[83] = (-((-9193) & 11241)) & (-28763) & 32735;
        llIllIIl[84] = (82 ^ 71) ^ (229 ^ 195);
        llIllIIl[85] = 134 ^ 178;
        llIllIIl[86] = 86 ^ 99;
        llIllIIl[87] = (19 ^ 29) ^ (3 ^ 59);
        llIllIIl[88] = 75 ^ 124;
        llIllIIl[89] = 3 ^ 69;
        llIllIIl[90] = 217 ^ 144;
        llIllIIl[91] = (-((-385) & 29642)) & (-49) & 32767;
        llIllIIl[92] = (-((-1281) & 29969)) & (-9) & 32255;
        llIllIIl[93] = 67 ^ 123;
        llIllIIl[94] = 10 ^ 51;
        llIllIIl[95] = 46 ^ 98;
        llIllIIl[96] = 37 ^ 31;
        llIllIIl[97] = 194 ^ 146;
        llIllIIl[98] = 90 ^ 97;
        llIllIIl[99] = (199 ^ 171) ^ (158 ^ 168);
        llIllIIl[100] = (99 ^ 76) ^ (91 ^ 16);
        llIllIIl[101] = 186 ^ 135;
        llIllIIl[102] = (34 ^ 16) ^ (139 ^ 135);
        llIllIIl[103] = (-4193) & 8045;
        llIllIIl[104] = (105 ^ 90) ^ (74 ^ 70);
        llIllIIl[105] = (97 ^ 24) ^ " ".length();
        llIllIIl[106] = ((115 + 14) - 71) + 72;
        llIllIIl[107] = 235 ^ 171;
        llIllIIl[108] = (((74 ^ 25) + (6 ^ 69)) - (5 ^ 95)) + (35 ^ 115);
        llIllIIl[109] = (202 ^ 131) ^ (24 ^ 19);
        llIllIIl[110] = (-21587) & 24563;
        llIllIIl[111] = (-25369) & 28607;
        llIllIIl[112] = (-((-8929) & 25319)) & (-4625) & 24254;
        llIllIIl[113] = (116 ^ 93) ^ (208 ^ 186);
        llIllIIl[114] = (43 ^ 6) ^ (82 ^ 59);
        llIllIIl[115] = 104 ^ 45;
        llIllIIl[116] = ((4 + 9) - (-51)) + 86;
        llIllIIl[117] = (-((-8359) & 29423)) & (-8451) & 32623;
        llIllIIl[118] = (-((-2055) & 14575)) & (-6) & 15871;
        llIllIIl[119] = (((192 + 109) - 120) + 54) ^ (((15 + 141) - 25) + 41);
        llIllIIl[120] = 230 ^ 174;
        llIllIIl[121] = (((98 ^ 40) + (217 ^ 146)) - (43 ^ 85)) + ((24 + 86) - 30) + 57;
        llIllIIl[122] = (((238 ^ 163) + (((4 + 95) - 23) + 61)) - (((0 + 115) - 20) + 41)) + (97 ^ 61);
        llIllIIl[123] = (-28805) & 31735;
        llIllIIl[124] = (-12303) & 15838;
        llIllIIl[125] = 79 ^ 5;
        llIllIIl[126] = (((33 + 176) - 72) + 75) ^ (((46 + 104) - (-5)) + 4);
        llIllIIl[127] = (((15 ^ 53) + (109 ^ 88)) - (-(55 ^ 26))) + (7 ^ 31);
        llIllIIl[128] = 122 ^ 55;
        llIllIIl[129] = (((173 + 153) - 310) + 182) ^ (((21 + 76) - 81) + 120);
        llIllIIl[130] = 3 ^ 76;
        llIllIIl[131] = ((152 + 66) - 134) + 106;
        llIllIIl[132] = ((179 + 131) - 159) + 49;
        llIllIIl[133] = (-6173) & 6652;
        llIllIIl[134] = 70 ^ 23;
        llIllIIl[135] = (73 ^ 66) ^ (123 ^ 34);
        llIllIIl[136] = (((29 ^ 114) + (((147 + 36) - 118) + 88)) - (((63 + 80) - 49) + 144)) + ((156 + 1) - 66) + 93;
        llIllIIl[137] = (((237 ^ 150) + (119 ^ 64)) - (((33 + 80) - (-1)) + 20)) + ((87 + 163) - 93) + 19;
        llIllIIl[138] = (129 ^ 167) ^ (180 ^ 193);
        llIllIIl[139] = (214 ^ 130) ^ ((206 ^ 196) & ((146 ^ 152) ^ (-1)));
        llIllIIl[140] = (96 ^ 3) ^ (83 ^ 101);
        llIllIIl[141] = ((72 + 55) - (-74)) + 29;
        llIllIIl[142] = (24 ^ 30) ^ (192 ^ 144);
        llIllIIl[143] = 200 ^ 159;
        llIllIIl[144] = (54 ^ 120) ^ (177 ^ 167);
        llIllIIl[145] = 218 ^ 131;
        llIllIIl[146] = (158 ^ 146) ^ (242 ^ 165);
        llIllIIl[147] = (-((-1345) & 32712)) & (-1) & 32767;
        llIllIIl[148] = (-((-12483) & 31227)) & (-12293) & 32636;
        llIllIIl[149] = (-((-10404) & 27067)) & (-2177) & 28159;
        llIllIIl[150] = (-((-2641) & 3799)) & (-8226) & 16383;
        llIllIIl[151] = (-((-1217) & 27875)) & (-4106) & 32763;
        llIllIIl[152] = (-18450) & 23999;
        llIllIIl[153] = (-4156) & 30715;
        llIllIIl[154] = (-12310) & 13309;
        llIllIIl[155] = (-((-17687) & 22423)) & (-1) & 8191;
        llIllIIl[156] = (-((-14689) & 31090)) & (-35) & 28415;
        llIllIIl[157] = (-((-8449) & 15683)) & (-533) & 32766;
        llIllIIl[158] = (-29227) & 30526;
        llIllIIl[159] = 27 ^ 71;
        llIllIIl[160] = 36 ^ 121;
        llIllIIl[161] = 211 ^ 141;
        llIllIIl[162] = (73 ^ 87) ^ (212 ^ 149);
        llIllIIl[163] = (-((-3585) & 32749)) & (-1) & 32255;
        llIllIIl[164] = (-29329) & 32765;
        llIllIIl[165] = (-8787) & 12287;
        llIllIIl[166] = (((52 ^ 12) + (((89 + 40) - (-4)) + 7)) - (127 ^ 6)) + ((72 + 147) - 74) + 35;
        llIllIIl[167] = (-((-2581) & 31637)) & (-11) & 32159;
        llIllIIl[168] = (-((-17754) & 22363)) & (-33) & 7999;
        llIllIIl[169] = (-((-11) & 12571)) & (-1025) & 16381;
        llIllIIl[170] = (-(0 ^ 42)) & (-12929) & 16383;
        llIllIIl[171] = (-8257) & 11876;
        llIllIIl[172] = (-((-23809) & 24361)) & (-17) & 4095;
        llIllIIl[173] = (146 ^ 198) ^ (72 ^ 124);
        llIllIIl[174] = 120 ^ 25;
        llIllIIl[175] = 243 ^ 145;
        llIllIIl[176] = (252 ^ 168) ^ (140 ^ 187);
        llIllIIl[177] = 215 ^ 178;
        llIllIIl[178] = (((185 + 17) - 84) + 85) ^ (((112 + 80) - 80) + 61);
        llIllIIl[179] = (75 ^ 36) ^ (62 ^ 54);
        llIllIIl[180] = 224 ^ 136;
        llIllIIl[181] = (((37 + 97) - 26) + 106) ^ (((122 + 187) - 221) + 103);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[16]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0179, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[28]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x028f, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[13]) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0318, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[8]) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[8]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x058d, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[13]) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[4]) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag() {
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
        int[] iArr14 = new int[llIllIIl[0]];
        iArr14[llIllIIl[1]] = llIllIIl[43];
        if (lIllIllIIII(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[llIllIIl[0]];
            iArr15[llIllIIl[1]] = llIllIIl[43];
            if (lIllIllIIII(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIllIIl[0]];
                iArr16[llIllIIl[1]] = llIllIIl[43];
            }
            iArr = new int[llIllIIl[0]];
            iArr[llIllIIl[1]] = llIllIIl[30];
            if (lIllIllIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr17 = new int[llIllIIl[0]];
                iArr17[llIllIIl[1]] = llIllIIl[30];
                if (lIllIllIIII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIllIIl[0]];
                    iArr18[llIllIIl[1]] = llIllIIl[30];
                }
                iArr2 = new int[llIllIIl[0]];
                iArr2[llIllIIl[1]] = llIllIIl[31];
                if (lIllIllIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr19 = new int[llIllIIl[0]];
                    iArr19[llIllIIl[1]] = llIllIIl[31];
                    if (lIllIllIIII(Bank.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[llIllIIl[0]];
                        iArr20[llIllIIl[1]] = llIllIIl[31];
                    }
                    iArr3 = new int[llIllIIl[0]];
                    iArr3[llIllIIl[1]] = llIllIIl[103];
                    if (lIllIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        bB.add(new C0003d(llIllIIl[103], llIllIIl[8], llIllIIl[151]));
                        "".length();
                    }
                    iArr4 = new int[llIllIIl[0]];
                    iArr4[llIllIIl[1]] = llIllIIl[37];
                    if (lIllIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                        bB.add(new C0003d(llIllIIl[37], llIllIIl[0], llIllIIl[27]));
                        "".length();
                    }
                    iArr5 = new int[llIllIIl[0]];
                    iArr5[llIllIIl[1]] = llIllIIl[32];
                    if (lIllIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr21 = new int[llIllIIl[0]];
                        iArr21[llIllIIl[1]] = llIllIIl[32];
                        if (lIllIllIIII(Bank.contains(iArr21) ? 1 : 0)) {
                            int[] iArr22 = new int[llIllIIl[0]];
                            iArr22[llIllIIl[1]] = llIllIIl[32];
                        }
                        iArr6 = new int[llIllIIl[0]];
                        iArr6[llIllIIl[1]] = llIllIIl[33];
                        if (lIllIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr23 = new int[llIllIIl[0]];
                            iArr23[llIllIIl[1]] = llIllIIl[33];
                            if (lIllIllIIII(Bank.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[llIllIIl[0]];
                                iArr24[llIllIIl[1]] = llIllIIl[33];
                            }
                            iArr7 = new int[llIllIIl[0]];
                            iArr7[llIllIIl[1]] = llIllIIl[29];
                            if (lIllIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr25 = new int[llIllIIl[0]];
                                iArr25[llIllIIl[1]] = llIllIIl[29];
                                if (lIllIllIIII(Bank.contains(iArr25) ? 1 : 0)) {
                                    int[] iArr26 = new int[llIllIIl[0]];
                                    iArr26[llIllIIl[1]] = llIllIIl[29];
                                }
                                iArr8 = new int[llIllIIl[0]];
                                iArr8[llIllIIl[1]] = llIllIIl[39];
                                if (lIllIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                                    bB.add(new C0003d(llIllIIl[39], llIllIIl[0], llIllIIl[27]));
                                    "".length();
                                }
                                iArr9 = new int[llIllIIl[0]];
                                iArr9[llIllIIl[1]] = llIllIIl[38];
                                if (lIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                                    bB.add(new C0003d(llIllIIl[38], llIllIIl[0], llIllIIl[27]));
                                    "".length();
                                }
                                iArr10 = new int[llIllIIl[0]];
                                iArr10[llIllIIl[1]] = llIllIIl[40];
                                if (lIllIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                                    bB.add(new C0003d(llIllIIl[40], llIllIIl[0], llIllIIl[152]));
                                    "".length();
                                }
                                iArr11 = new int[llIllIIl[0]];
                                iArr11[llIllIIl[1]] = llIllIIl[41];
                                if (lIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                                    bB.add(new C0003d(llIllIIl[41], llIllIIl[0], llIllIIl[153] + C0004e.c(llIllIIl[154], llIllIIl[155])));
                                    "".length();
                                }
                                if (lIllIllIIlI(Bank.contains(item -> {
                                    return item.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]);
                                }) ? 1 : 0)) {
                                    bB.add(new C0003d(llIllIIl[156], llIllIIl[8], llIllIIl[157]));
                                    "".length();
                                }
                                iArr12 = new int[llIllIIl[0]];
                                iArr12[llIllIIl[1]] = llIllIIl[34];
                                if (lIllIllIIII(Bank.contains(iArr12) ? 1 : 0)) {
                                    int[] iArr27 = new int[llIllIIl[0]];
                                    iArr27[llIllIIl[1]] = llIllIIl[34];
                                    if (lIllIllIIII(Bank.contains(iArr27) ? 1 : 0)) {
                                        int[] iArr28 = new int[llIllIIl[0]];
                                        iArr28[llIllIIl[1]] = llIllIIl[34];
                                    }
                                    iArr13 = new int[llIllIIl[0]];
                                    iArr13[llIllIIl[1]] = llIllIIl[36];
                                    if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
                                        int[] iArr29 = new int[llIllIIl[0]];
                                        iArr29[llIllIIl[1]] = llIllIIl[36];
                                        if (!lIllIllIIII(Bank.contains(iArr29) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr30 = new int[llIllIIl[0]];
                                        iArr30[llIllIIl[1]] = llIllIIl[36];
                                        if (!lIllIllIIIl(Bank.getFirst(iArr30).getQuantity(), llIllIIl[28])) {
                                            return;
                                        }
                                    }
                                    bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
                                    "".length();
                                }
                                bB.add(new C0003d(llIllIIl[34], llIllIIl[13], C0008i.bw));
                                "".length();
                                iArr13 = new int[llIllIIl[0]];
                                iArr13[llIllIIl[1]] = llIllIIl[36];
                                if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
                                "".length();
                            }
                            bB.add(new C0003d(llIllIIl[29], llIllIIl[13], llIllIIl[27]));
                            "".length();
                            iArr8 = new int[llIllIIl[0]];
                            iArr8[llIllIIl[1]] = llIllIIl[39];
                            if (lIllIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            iArr9 = new int[llIllIIl[0]];
                            iArr9[llIllIIl[1]] = llIllIIl[38];
                            if (lIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            iArr10 = new int[llIllIIl[0]];
                            iArr10[llIllIIl[1]] = llIllIIl[40];
                            if (lIllIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[llIllIIl[0]];
                            iArr11[llIllIIl[1]] = llIllIIl[41];
                            if (lIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            if (lIllIllIIlI(Bank.contains(item2 -> {
                                return item2.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]);
                            }) ? 1 : 0)) {
                            }
                            iArr12 = new int[llIllIIl[0]];
                            iArr12[llIllIIl[1]] = llIllIIl[34];
                            if (lIllIllIIII(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            bB.add(new C0003d(llIllIIl[34], llIllIIl[13], C0008i.bw));
                            "".length();
                            iArr13 = new int[llIllIIl[0]];
                            iArr13[llIllIIl[1]] = llIllIIl[36];
                            if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
                            "".length();
                        }
                        bB.add(new C0003d(llIllIIl[33], llIllIIl[8], llIllIIl[27]));
                        "".length();
                        iArr7 = new int[llIllIIl[0]];
                        iArr7[llIllIIl[1]] = llIllIIl[29];
                        if (lIllIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bB.add(new C0003d(llIllIIl[29], llIllIIl[13], llIllIIl[27]));
                        "".length();
                        iArr8 = new int[llIllIIl[0]];
                        iArr8[llIllIIl[1]] = llIllIIl[39];
                        if (lIllIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        iArr9 = new int[llIllIIl[0]];
                        iArr9[llIllIIl[1]] = llIllIIl[38];
                        if (lIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        iArr10 = new int[llIllIIl[0]];
                        iArr10[llIllIIl[1]] = llIllIIl[40];
                        if (lIllIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[llIllIIl[0]];
                        iArr11[llIllIIl[1]] = llIllIIl[41];
                        if (lIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        if (lIllIllIIlI(Bank.contains(item22 -> {
                            return item22.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[llIllIIl[0]];
                        iArr12[llIllIIl[1]] = llIllIIl[34];
                        if (lIllIllIIII(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        bB.add(new C0003d(llIllIIl[34], llIllIIl[13], C0008i.bw));
                        "".length();
                        iArr13 = new int[llIllIIl[0]];
                        iArr13[llIllIIl[1]] = llIllIIl[36];
                        if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
                        "".length();
                    }
                    bB.add(new C0003d(llIllIIl[32], llIllIIl[13], llIllIIl[27]));
                    "".length();
                    iArr6 = new int[llIllIIl[0]];
                    iArr6[llIllIIl[1]] = llIllIIl[33];
                    if (lIllIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bB.add(new C0003d(llIllIIl[33], llIllIIl[8], llIllIIl[27]));
                    "".length();
                    iArr7 = new int[llIllIIl[0]];
                    iArr7[llIllIIl[1]] = llIllIIl[29];
                    if (lIllIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bB.add(new C0003d(llIllIIl[29], llIllIIl[13], llIllIIl[27]));
                    "".length();
                    iArr8 = new int[llIllIIl[0]];
                    iArr8[llIllIIl[1]] = llIllIIl[39];
                    if (lIllIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[llIllIIl[0]];
                    iArr9[llIllIIl[1]] = llIllIIl[38];
                    if (lIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    iArr10 = new int[llIllIIl[0]];
                    iArr10[llIllIIl[1]] = llIllIIl[40];
                    if (lIllIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[llIllIIl[0]];
                    iArr11[llIllIIl[1]] = llIllIIl[41];
                    if (lIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    if (lIllIllIIlI(Bank.contains(item222 -> {
                        return item222.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[llIllIIl[0]];
                    iArr12[llIllIIl[1]] = llIllIIl[34];
                    if (lIllIllIIII(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    bB.add(new C0003d(llIllIIl[34], llIllIIl[13], C0008i.bw));
                    "".length();
                    iArr13 = new int[llIllIIl[0]];
                    iArr13[llIllIIl[1]] = llIllIIl[36];
                    if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
                    "".length();
                }
                bB.add(new C0003d(llIllIIl[31], llIllIIl[28], llIllIIl[150]));
                "".length();
                iArr3 = new int[llIllIIl[0]];
                iArr3[llIllIIl[1]] = llIllIIl[103];
                if (lIllIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                }
                iArr4 = new int[llIllIIl[0]];
                iArr4[llIllIIl[1]] = llIllIIl[37];
                if (lIllIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[llIllIIl[0]];
                iArr5[llIllIIl[1]] = llIllIIl[32];
                if (lIllIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bB.add(new C0003d(llIllIIl[32], llIllIIl[13], llIllIIl[27]));
                "".length();
                iArr6 = new int[llIllIIl[0]];
                iArr6[llIllIIl[1]] = llIllIIl[33];
                if (lIllIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bB.add(new C0003d(llIllIIl[33], llIllIIl[8], llIllIIl[27]));
                "".length();
                iArr7 = new int[llIllIIl[0]];
                iArr7[llIllIIl[1]] = llIllIIl[29];
                if (lIllIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bB.add(new C0003d(llIllIIl[29], llIllIIl[13], llIllIIl[27]));
                "".length();
                iArr8 = new int[llIllIIl[0]];
                iArr8[llIllIIl[1]] = llIllIIl[39];
                if (lIllIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[llIllIIl[0]];
                iArr9[llIllIIl[1]] = llIllIIl[38];
                if (lIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[llIllIIl[0]];
                iArr10[llIllIIl[1]] = llIllIIl[40];
                if (lIllIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[llIllIIl[0]];
                iArr11[llIllIIl[1]] = llIllIIl[41];
                if (lIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                }
                if (lIllIllIIlI(Bank.contains(item2222 -> {
                    return item2222.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[llIllIIl[0]];
                iArr12[llIllIIl[1]] = llIllIIl[34];
                if (lIllIllIIII(Bank.contains(iArr12) ? 1 : 0)) {
                }
                bB.add(new C0003d(llIllIIl[34], llIllIIl[13], C0008i.bw));
                "".length();
                iArr13 = new int[llIllIIl[0]];
                iArr13[llIllIIl[1]] = llIllIIl[36];
                if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
                "".length();
            }
            bB.add(new C0003d(llIllIIl[30], llIllIIl[16], llIllIIl[149]));
            "".length();
            iArr2 = new int[llIllIIl[0]];
            iArr2[llIllIIl[1]] = llIllIIl[31];
            if (lIllIllIIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bB.add(new C0003d(llIllIIl[31], llIllIIl[28], llIllIIl[150]));
            "".length();
            iArr3 = new int[llIllIIl[0]];
            iArr3[llIllIIl[1]] = llIllIIl[103];
            if (lIllIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[llIllIIl[0]];
            iArr4[llIllIIl[1]] = llIllIIl[37];
            if (lIllIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llIllIIl[0]];
            iArr5[llIllIIl[1]] = llIllIIl[32];
            if (lIllIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bB.add(new C0003d(llIllIIl[32], llIllIIl[13], llIllIIl[27]));
            "".length();
            iArr6 = new int[llIllIIl[0]];
            iArr6[llIllIIl[1]] = llIllIIl[33];
            if (lIllIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bB.add(new C0003d(llIllIIl[33], llIllIIl[8], llIllIIl[27]));
            "".length();
            iArr7 = new int[llIllIIl[0]];
            iArr7[llIllIIl[1]] = llIllIIl[29];
            if (lIllIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bB.add(new C0003d(llIllIIl[29], llIllIIl[13], llIllIIl[27]));
            "".length();
            iArr8 = new int[llIllIIl[0]];
            iArr8[llIllIIl[1]] = llIllIIl[39];
            if (lIllIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[llIllIIl[0]];
            iArr9[llIllIIl[1]] = llIllIIl[38];
            if (lIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[llIllIIl[0]];
            iArr10[llIllIIl[1]] = llIllIIl[40];
            if (lIllIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[llIllIIl[0]];
            iArr11[llIllIIl[1]] = llIllIIl[41];
            if (lIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
            }
            if (lIllIllIIlI(Bank.contains(item22222 -> {
                return item22222.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[llIllIIl[0]];
            iArr12[llIllIIl[1]] = llIllIIl[34];
            if (lIllIllIIII(Bank.contains(iArr12) ? 1 : 0)) {
            }
            bB.add(new C0003d(llIllIIl[34], llIllIIl[13], C0008i.bw));
            "".length();
            iArr13 = new int[llIllIIl[0]];
            iArr13[llIllIIl[1]] = llIllIIl[36];
            if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
            "".length();
        }
        bB.add(new C0003d(llIllIIl[43], llIllIIl[4], C0004e.c(llIllIIl[147], llIllIIl[148])));
        "".length();
        iArr = new int[llIllIIl[0]];
        iArr[llIllIIl[1]] = llIllIIl[30];
        if (lIllIllIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIllIIl[30], llIllIIl[16], llIllIIl[149]));
        "".length();
        iArr2 = new int[llIllIIl[0]];
        iArr2[llIllIIl[1]] = llIllIIl[31];
        if (lIllIllIIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIllIIl[31], llIllIIl[28], llIllIIl[150]));
        "".length();
        iArr3 = new int[llIllIIl[0]];
        iArr3[llIllIIl[1]] = llIllIIl[103];
        if (lIllIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llIllIIl[0]];
        iArr4[llIllIIl[1]] = llIllIIl[37];
        if (lIllIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llIllIIl[0]];
        iArr5[llIllIIl[1]] = llIllIIl[32];
        if (lIllIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIllIIl[32], llIllIIl[13], llIllIIl[27]));
        "".length();
        iArr6 = new int[llIllIIl[0]];
        iArr6[llIllIIl[1]] = llIllIIl[33];
        if (lIllIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIllIIl[33], llIllIIl[8], llIllIIl[27]));
        "".length();
        iArr7 = new int[llIllIIl[0]];
        iArr7[llIllIIl[1]] = llIllIIl[29];
        if (lIllIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIllIIl[29], llIllIIl[13], llIllIIl[27]));
        "".length();
        iArr8 = new int[llIllIIl[0]];
        iArr8[llIllIIl[1]] = llIllIIl[39];
        if (lIllIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[llIllIIl[0]];
        iArr9[llIllIIl[1]] = llIllIIl[38];
        if (lIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[llIllIIl[0]];
        iArr10[llIllIIl[1]] = llIllIIl[40];
        if (lIllIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[llIllIIl[0]];
        iArr11[llIllIIl[1]] = llIllIIl[41];
        if (lIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
        }
        if (lIllIllIIlI(Bank.contains(item222222 -> {
            return item222222.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[llIllIIl[0]];
        iArr12[llIllIIl[1]] = llIllIIl[34];
        if (lIllIllIIII(Bank.contains(iArr12) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIllIIl[34], llIllIIl[13], C0008i.bw));
        "".length();
        iArr13 = new int[llIllIIl[0]];
        iArr13[llIllIIl[1]] = llIllIIl[36];
        if (lIllIllIIII(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIllIIl[36], llIllIIl[22], llIllIIl[158]));
        "".length();
    }

    private static String lIllIIlllll(String lIlIIlIIIIlIIlI, String lIlIIlIIIIlIIIl) {
        String lIlIIlIIIIlIIlI2 = new String(Base64.getDecoder().decode(lIlIIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIIlIIIIlIIIl.toCharArray();
        int lIlIIlIIIIIlllI = llIllIIl[1];
        char[] charArray2 = lIlIIlIIIIlIIlI2.toCharArray();
        int length = charArray2.length;
        int i = llIllIIl[1];
        while (lIllIllIIIl(i, length)) {
            char lIlIIlIIIIlIIll = charArray2[i];
            sb.append((char) (lIlIIlIIIIlIIll ^ charArray[lIlIIlIIIIIlllI % charArray.length]));
            "".length();
            lIlIIlIIIIIlllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIllIlII(int i, int i2) {
        return i >= i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            aC();
            "".length();
            if ((((244 ^ 150) ^ (184 ^ 139)) & (((((38 + 84) - 52) + 138) ^ (((49 + 42) - 34) + 72)) ^ (-" ".length()))) != 0) {
                return ((((26 + 101) - 7) + 15) ^ (((0 + 43) - (-77)) + 63)) & (((101 ^ 46) ^ (253 ^ 134)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIllIIl[100];
    }

    private static void aD() {
        if (lIllIllIIII(new WorldArea(llIllIIl[52], llIllIIl[56], llIllIIl[16], llIllIIl[4], llIllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] strArr = new String[llIllIIl[0]];
            strArr[llIllIIl[1]] = llIllIII[llIllIIl[142]];
            TileObjects.getNearest(strArr).interact(llIllIII[llIllIIl[143]]);
            Time.sleepTicks(llIllIIl[9]);
            "".length();
        }
        if (lIllIllIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
            AccBuilderBarrows.c = llIllIII[llIllIIl[144]];
            if (lIllIllIIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(ce);
            "".length();
            Time.sleepTicks(llIllIIl[0]);
            "".length();
        }
        if (lIllIllIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
            C0006g.a(llIllIII[llIllIIl[145]], bX);
        }
        if (lIllIllIIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIllIIl[52], llIllIIl[53], llIllIIl[1])) ? 1 : 0)) {
            String[] strArr2 = new String[llIllIIl[0]];
            strArr2[llIllIIl[1]] = llIllIII[llIllIIl[99]];
            TileObjects.getNearest(strArr2).interact(llIllIII[llIllIIl[146]]);
            Time.sleepTicks(llIllIIl[9]);
            "".length();
        }
    }

    private static boolean lIllIlllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIlIIIII(String lIlIIlIIIlIIIlI, String lIlIIlIIIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llIllIIl[21]), "DES");
            Cipher lIlIIlIIIlIIlII = Cipher.getInstance("DES");
            lIlIIlIIIlIIlII.init(llIllIIl[9], secretKeySpec);
            return new String(lIlIIlIIIlIIlII.doFinal(Base64.getDecoder().decode(lIlIIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlIIIlIIIll) {
            lIlIIlIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlllIlI(int i, int i2) {
        return i != i2;
    }

    private static void lIllIlIllIl() {
        llIllIII = new String[llIllIIl[181]];
        llIllIII[llIllIIl[1]] = lIllIIllllI("m1NsQ2UmogRFZPQMTD+u3+2kpyOJPhZN4Trbhp03zObTo+s5LDpWLgkv5XZ7fPlG", "MmAYm");
        llIllIII[llIllIIl[0]] = lIllIIlllll("Pyo6AhQOKiIL", "hKNgf");
        llIllIII[llIllIIl[9]] = lIllIIllllI("fTQXoEDqAwtUl29b9Zrd7w==", "MzwWF");
        llIllIII[llIllIIl[11]] = lIllIIlllll("AhsaJj4zSQArKGcqHCouLAwa", "GitCM");
        llIllIII[llIllIIl[13]] = lIllIIllllI("0ZlGoj0JR9TV5jPFZi92PA==", "lwzeG");
        llIllIII[llIllIIl[8]] = lIllIIlllll("FBYDNjA2DRg7PSQ=", "CylRS");
        llIllIII[llIllIIl[16]] = lIllIIllllI("zaFUKtc3R1Wlz57rRlbRRw==", "WlIzO");
        llIllIII[llIllIIl[20]] = lIllIlIIIII("QM9b7DYWcXegNIhq1BKrBw==", "jYQle");
        llIllIII[llIllIIl[21]] = lIllIIlllll("ERwPbhQ0Ozko", "CZKNP");
        llIllIII[llIllIIl[19]] = lIllIIlllll("NnkEIjgUMDoo", "wYTMJ");
        llIllIII[llIllIIl[4]] = lIllIIllllI("OfMQvotNGsHZ6TmhDpWMAQ==", "vwxFs");
        llIllIII[llIllIIl[23]] = lIllIIllllI("Kg+sblPMIMbgkEwNcE8xqDhP9FdOPPHw", "nPRYF");
        llIllIII[llIllIIl[24]] = lIllIlIIIII("5pxAMIvKsoftEB1aZyfiiA==", "UnctO");
        llIllIII[llIllIIl[25]] = lIllIIllllI("S8nF7rBje0Y=", "RMnbP");
        llIllIII[llIllIIl[26]] = lIllIIllllI("l18UpaToVLZJ+CdZLUpEvw==", "RgQpl");
        llIllIII[llIllIIl[28]] = lIllIIllllI("a8NKg1ky2IxhbLlSEvC5BKd8doFerZpL", "AXuSz");
        llIllIII[llIllIIl[35]] = lIllIIllllI("/ne5jz7xfv57hXeJPcI40Gnsu0iXkqK1BzGU+ZR91UQiHzsnN3v14E5K4FsYsrbG6KXVIfhhc0g=", "rfEgm");
        llIllIII[llIllIIl[42]] = lIllIIlllll("ByRTLzY1YR4nNyMoHSlkITQWPTBwMgY+NDwoFj1ocDIEJzAzKRogI3A1HG4GBRg6AAM=", "PAsND");
        llIllIII[llIllIIl[46]] = lIllIIllllI("RgnyE1juXWA=", "WIsHz");
        llIllIII[llIllIIl[12]] = lIllIIlllll("PgcBHTw=", "zuhsW");
        llIllIII[llIllIIl[48]] = lIllIlIIIII("HIsO197YahI=", "SHOtA");
        llIllIII[llIllIIl[49]] = lIllIIllllI("2/72P6CXrZA=", "jbbZF");
        llIllIII[llIllIIl[50]] = lIllIIllllI("nUEUZk0vxNA=", "rDJhA");
        llIllIII[llIllIIl[51]] = lIllIlIIIII("LA2aSzld3sI3g/eENu/D7g==", "vLMgZ");
        llIllIII[llIllIIl[47]] = lIllIIlllll("FAAG", "Uvgtq");
        llIllIII[llIllIIl[54]] = lIllIlIIIII("Rsns4+aOt2+63IPBXxcUKg==", "CLJYT");
        llIllIII[llIllIIl[55]] = lIllIIllllI("cb8L8RTmskw=", "pdbdK");
        llIllIII[llIllIIl[57]] = lIllIIllllI("lMSJzRJW8ZZ/5lYDP2dS4g==", "sTQTb");
        llIllIII[llIllIIl[58]] = lIllIlIIIII("NxCm8lmkWAk=", "LFSJE");
        llIllIII[llIllIIl[59]] = lIllIIlllll("PQctHg==", "jbLly");
        llIllIII[llIllIIl[64]] = lIllIIllllI("7ZdvVIoPXEXtXVhaUdO60Q==", "Mbteb");
        llIllIII[llIllIIl[65]] = lIllIlIIIII("aKdOQTf2e3CE4TqIMmkswrehdEhLO+dc", "oCcnN");
        llIllIII[llIllIIl[10]] = lIllIIlllll("Gh4pHgA=", "NlHze");
        llIllIII[llIllIIl[66]] = lIllIIlllll("JRw/CSM=", "gnZhH");
        llIllIII[llIllIIl[67]] = lIllIlIIIII("fcTULw3dO3iOA1ckWePGsw==", "JLZiZ");
        llIllIII[llIllIIl[14]] = lIllIIllllI("p1wUSFkHLfk=", "LbMiB");
        llIllIII[llIllIIl[68]] = lIllIIllllI("/lKWujwL2ofaAJsx6jjqBQ==", "PKTFO");
        llIllIII[llIllIIl[69]] = lIllIIlllll("Mg0LORpcFBI=", "qabTx");
        llIllIII[llIllIIl[70]] = lIllIIlllll("FSwXFQsr", "YCvqn");
        llIllIII[llIllIIl[71]] = lIllIlIIIII("szIWHnoiHe8=", "Gczak");
        llIllIII[llIllIIl[22]] = lIllIIllllI("FKzcfZW81ow=", "PNZIS");
        llIllIII[llIllIIl[72]] = lIllIlIIIII("Mmbp4e1HFBk=", "cqExk");
        llIllIII[llIllIIl[75]] = lIllIlIIIII("2guw4Pq4Tpg=", "Xgapv");
        llIllIII[llIllIIl[76]] = lIllIIllllI("dbZALUDUoGzXidMcmVBfKQ==", "CIidI");
        llIllIII[llIllIIl[77]] = lIllIlIIIII("fseH/uaMPent1uljI2Zcpg==", "BliEz");
        llIllIII[llIllIIl[78]] = lIllIlIIIII("bcO300yigr/zdS4rpj3sKw==", "nsvhW");
        llIllIII[llIllIIl[79]] = lIllIIlllll("FSgWAwElJRYZFA==", "PKblg");
        llIllIII[llIllIIl[80]] = lIllIIllllI("4YJEjMSiBK0=", "qTzWM");
        llIllIII[llIllIIl[81]] = lIllIlIIIII("vcCrlPaJ3ZcghfQotGK/Fg==", "YwkxR");
        llIllIII[llIllIIl[82]] = lIllIlIIIII("waqW+uEUck/EVxeQIxDs2w==", "JWcQj");
        llIllIII[llIllIIl[15]] = lIllIIllllI("Afus4rFflcs=", "YfdMN");
        llIllIII[llIllIIl[84]] = lIllIIllllI("3VZEKRaJYEI=", "zVaGB");
        llIllIII[llIllIIl[85]] = lIllIIllllI("tgGd9AdAm4g=", "UIVdf");
        llIllIII[llIllIIl[86]] = lIllIlIIIII("iLN7dt5lYzI=", "nhRkO");
        llIllIII[llIllIIl[87]] = lIllIIlllll("OgcOJwcbCw==", "wfbDh");
        llIllIII[llIllIIl[88]] = lIllIIllllI("wWcpNYPjJWY=", "ExvFq");
        llIllIII[llIllIIl[93]] = lIllIIllllI("S3F9B46GKLGIjyKUzLeUNw==", "wcwdj");
        llIllIII[llIllIIl[94]] = lIllIIlllll("GQQeYxEkBxQm", "VhzCr");
        llIllIII[llIllIIl[96]] = lIllIIlllll("HxQcBSQ+GA==", "RupfK");
        llIllIII[llIllIIl[98]] = lIllIIlllll("AQ0lFxwgAQ==", "LlIts");
        llIllIII[llIllIIl[6]] = lIllIIllllI("wjs/XQWureA=", "Dreti");
        llIllIII[llIllIIl[101]] = lIllIlIIIII("IK2myGkp7WyL9s2UUgQseQ==", "KsEhT");
        llIllIII[llIllIIl[102]] = lIllIlIIIII("Qkh3C3G9Yt7bEm4r/vzKUg==", "UxySE");
        llIllIII[llIllIIl[104]] = lIllIIllllI("JuaDGddsDooElgkbK4PixQ==", "WSipZ");
        llIllIII[llIllIIl[107]] = lIllIlIIIII("cDLqAK6b2FU=", "oIerJ");
        llIllIII[llIllIIl[3]] = lIllIIllllI("IiZ+EOUygh8=", "FsDWc");
        llIllIII[llIllIIl[109]] = lIllIIllllI("y28oCiMBy1abtFzyADGD8Q==", "iIjAi");
        llIllIII[llIllIIl[113]] = lIllIlIIIII("s/QpTCvhtKlj0CAaXO6vyA==", "bVYzP");
        llIllIII[llIllIIl[114]] = lIllIIlllll("GwUYHzwh", "SdurY");
        llIllIII[llIllIIl[115]] = lIllIIlllll("FhYvBzUxFidCPzccLQ==", "EsCbV");
        llIllIII[llIllIIl[89]] = lIllIlIIIII("OTg1mVTfq6VnR3EGwfVE5g==", "Szggs");
        llIllIII[llIllIIl[119]] = lIllIIllllI("AyDmIW7VluqyjanQIRJX8g==", "XIUwp");
        llIllIII[llIllIIl[120]] = lIllIIllllI("NU+wgznTXdY=", "Dpucm");
        llIllIII[llIllIIl[90]] = lIllIIllllI("06xkOwYS0uI=", "vFsnB");
        llIllIII[llIllIIl[125]] = lIllIIlllll("DAwZQyItTQETNQ==", "BmocV");
        llIllIII[llIllIIl[126]] = lIllIIlllll("HxYxFSQn", "KcCtA");
        llIllIII[llIllIIl[95]] = lIllIlIIIII("smR+q2L0on8=", "JswHT");
        llIllIII[llIllIIl[128]] = lIllIlIIIII("oW8qbGD601voe9DaTpLnMw==", "wfbhK");
        llIllIII[llIllIIl[129]] = lIllIlIIIII("Ea+5W1IHTPnaXa4BMeENCA==", "qVGhp");
        llIllIII[llIllIIl[130]] = lIllIlIIIII("9aRIb6b7BKY=", "BAqDz");
        llIllIII[llIllIIl[97]] = lIllIIlllll("JDksCgwVdzwYBBYk", "qWHom");
        llIllIII[llIllIIl[134]] = lIllIIllllI("8CH+knz2ysqz66DyyhVnkA==", "KHUkx");
        llIllIII[llIllIIl[135]] = lIllIIlllll("MRYsLD8JBTkn", "edMBL");
        llIllIII[llIllIIl[138]] = lIllIIlllll("FE4dDjghCx8B", "UnmoL");
        llIllIII[llIllIIl[139]] = lIllIIllllI("J2m70z8Ev1nlPjyEb4t4ww==", "xURPl");
        llIllIII[llIllIIl[140]] = lIllIlIIIII("/TVDitg6yKfUTTNJi/E0QA==", "IxPam");
        llIllIII[llIllIIl[142]] = lIllIlIIIII("gpRjEp3HtUCeE83PqTm9uQ==", "fWhOT");
        llIllIII[llIllIIl[143]] = lIllIIllllI("wEyrLl0hCnI=", "TQChz");
        llIllIII[llIllIIl[144]] = lIllIIlllll("GQoiVBU4SycAACUf", "WkTta");
        llIllIII[llIllIIl[145]] = lIllIlIIIII("SXcXZm3ARs4=", "VOSiO");
        llIllIII[llIllIIl[99]] = lIllIlIIIII("5LAmB0UC2s6s7oKECXiVUg==", "OaDOq");
        llIllIII[llIllIIl[146]] = lIllIIlllll("MBM7NxML", "cvZEp");
        llIllIII[llIllIIl[159]] = lIllIlIIIII("4r1GMJQqYtk=", "sbzBA");
        llIllIII[llIllIIl[160]] = lIllIIlllll("DggtJTkjRgkpPyEDMCErIg==", "OfDHX");
        llIllIII[llIllIIl[161]] = lIllIlIIIII("cPgEtUpTT+LCtEDqdSqlFDm+Az2cfcvw", "mqgMA");
        llIllIII[llIllIIl[162]] = lIllIlIIIII("hGSBT/BuIvY=", "zAIyx");
        llIllIII[llIllIIl[173]] = lIllIIllllI("+0LUHjF3C6Q=", "maBJc");
        llIllIII[llIllIIl[174]] = lIllIIllllI("eUpp0BBWjp1fuwyYjlabxVAdR/kS6GBl", "AFSPs");
        llIllIII[llIllIIl[175]] = lIllIIlllll("Oz4jP1xULC0zUBowJyJQHSFiKx8GMGIyGBU7Yg9QEDpuZjlUJjc2ABsmJ2g=", "tUBFp");
        llIllIII[llIllIIl[176]] = lIllIIllllI("1DQl7djV+JUjPKB0USvuAjl9VuCuyI6Rd4gjZ7ufHz77Nq1JXBqzZA==", "mntjC");
        llIllIII[llIllIIl[100]] = lIllIlIIIII("3tzWU5QnRvNMQaJIQx8vYwY0+K6zssaC", "vmUOc");
        llIllIII[llIllIIl[177]] = lIllIIllllI("+QiWWliADSZEQ98vNNhy/v9q47LVqHcl", "ISEty");
        llIllIII[llIllIIl[178]] = lIllIlIIIII("YfV0d9jzTbf5itWyRQikKVCQDtlIeD3xndAqXb4Rg+UHjuQZ25DwmxT9psnzCPZp", "TVxpN");
        llIllIII[llIllIIl[179]] = lIllIlIIIII("xh/1RC8IXC6IyZbq6rNu4EbVuTSXGwz3", "srmqL");
        llIllIII[llIllIIl[180]] = lIllIIlllll("", "XCgAN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x069d, code lost:
        if (lIllIllIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[8]) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06e0, code lost:
        if (lIllIllIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[16]) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0723, code lost:
        if (lIllIllIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[28]) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0766, code lost:
        if (lIllIllIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[13]) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x07a9, code lost:
        if (lIllIllIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[8]) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x07ec, code lost:
        if (lIllIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[13]) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07ef, code lost:
        ag();
        java.lang.System.out.println(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIII[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[35]]);
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.bz = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0016q.llIllIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x080a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1135, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v896, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v929, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v311, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v93, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aC() {
        if (lIllIllIIII(bz ? 1 : 0)) {
            C0001b.a(bB);
            if (lIllIllIIIl(bB.size(), llIllIIl[0])) {
                System.out.println(llIllIII[llIllIIl[1]]);
                bz = llIllIIl[1];
            }
        }
        if (lIllIllIIlI(bz ? 1 : 0) && lIllIllIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[2])) {
            if (lIllIllIIIl(C0004e.j(llIllIIl[3]), llIllIIl[4])) {
                cr = llIllIII[llIllIIl[0]];
                y.bl();
            }
            if (lIllIllIIll(C0004e.j(llIllIIl[3]), llIllIIl[4]) && (!lIllIllIlII(C0004e.j(llIllIIl[5]), llIllIIl[6]) || lIllIllIIIl(C0004e.j(llIllIIl[7]), llIllIIl[8]))) {
                cr = llIllIII[llIllIIl[9]];
                t.aK();
            }
            if (lIllIllIIll(C0004e.j(llIllIIl[3]), llIllIIl[4]) && lIllIllIlII(C0004e.j(llIllIIl[5]), llIllIIl[6]) && lIllIllIlII(C0004e.j(llIllIIl[7]), llIllIIl[8]) && lIllIllIIIl(C0004e.j(llIllIIl[10]), llIllIIl[11])) {
                cr = llIllIII[llIllIIl[11]];
                B.bF();
            }
            if (lIllIllIIll(C0004e.j(llIllIIl[3]), llIllIIl[4]) && lIllIllIlII(C0004e.j(llIllIIl[5]), llIllIIl[6]) && lIllIllIlII(C0004e.j(llIllIIl[7]), llIllIIl[8]) && lIllIllIIll(C0004e.j(llIllIIl[10]), llIllIIl[11]) && lIllIllIIIl(Skills.getLevel(Skill.CRAFTING), llIllIIl[12])) {
                cr = llIllIII[llIllIIl[13]];
                M.cK();
            }
            if (lIllIllIIll(C0004e.j(llIllIIl[3]), llIllIIl[4]) && lIllIllIlII(C0004e.j(llIllIIl[5]), llIllIIl[6]) && lIllIllIlII(C0004e.j(llIllIIl[7]), llIllIIl[8]) && lIllIllIIll(C0004e.j(llIllIIl[10]), llIllIIl[11]) && lIllIllIlII(Skills.getLevel(Skill.CRAFTING), llIllIIl[12]) && lIllIllIIIl(Skills.getLevel(Skill.WOODCUTTING), llIllIIl[14])) {
                cr = llIllIII[llIllIIl[8]];
                P.dj();
            }
            if (lIllIllIIll(C0004e.j(llIllIIl[3]), llIllIIl[4]) && lIllIllIlII(C0004e.j(llIllIIl[5]), llIllIIl[6]) && lIllIllIlII(C0004e.j(llIllIIl[7]), llIllIIl[8]) && lIllIllIIll(C0004e.j(llIllIIl[10]), llIllIIl[11]) && lIllIllIlII(Skills.getLevel(Skill.CRAFTING), llIllIIl[12]) && lIllIllIlII(Skills.getLevel(Skill.WOODCUTTING), llIllIIl[14]) && lIllIllIIIl(Skills.getLevel(Skill.RANGED), llIllIIl[15])) {
                cr = llIllIII[llIllIIl[16]];
                if (lIllIllIIIl(cq, llIllIIl[0])) {
                    C0013n.ca = llIllIIl[1];
                    cq += llIllIIl[0];
                }
                C0012m.aq();
            }
            if (lIllIllIIll(C0004e.j(llIllIIl[3]), llIllIIl[4]) && lIllIllIlII(C0004e.j(llIllIIl[5]), llIllIIl[6]) && lIllIllIlII(C0004e.j(llIllIIl[7]), llIllIIl[8]) && lIllIllIIll(C0004e.j(llIllIIl[10]), llIllIIl[11]) && lIllIllIlII(Skills.getLevel(Skill.CRAFTING), llIllIIl[12]) && lIllIllIlII(Skills.getLevel(Skill.WOODCUTTING), llIllIIl[14]) && lIllIllIlII(Skills.getLevel(Skill.RANGED), llIllIIl[15])) {
                if (!lIllIllIlII(C0004e.j(llIllIIl[17]), llIllIIl[18]) || lIllIllIIIl(Skills.getLevel(Skill.HUNTER), llIllIIl[19])) {
                    cr = llIllIII[llIllIIl[20]];
                    x.bi();
                }
                if (lIllIllIlII(C0004e.j(llIllIIl[17]), llIllIIl[18]) && lIllIllIlII(Skills.getLevel(Skill.HUNTER), llIllIIl[19]) && lIllIllIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6])) {
                    cr = llIllIII[llIllIIl[21]];
                    v.bd();
                }
                if (lIllIllIlII(C0004e.j(llIllIIl[17]), llIllIIl[18]) && lIllIllIlII(Skills.getLevel(Skill.HUNTER), llIllIIl[19]) && lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6]) && lIllIllIIIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIllIIl[22])) {
                    cr = llIllIII[llIllIIl[19]];
                    C0015p.aA();
                }
                if (lIllIllIlII(C0004e.j(llIllIIl[17]), llIllIIl[18]) && lIllIllIlII(Skills.getLevel(Skill.HUNTER), llIllIIl[19]) && lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6]) && lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIllIIl[22]) && lIllIllIIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIllIIl[19])) {
                    String[] strArr = new String[llIllIIl[0]];
                    strArr[llIllIIl[1]] = llIllIII[llIllIIl[4]];
                    if (lIllIllIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                        cr = llIllIII[llIllIIl[23]];
                        r.aF();
                    }
                }
                r.aG();
            }
            if (lIllIllIIlI(ac() ? 1 : 0) && lIllIllIIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) && lIllIllIlII(C0004e.j(llIllIIl[17]), llIllIIl[18]) && lIllIllIlII(Skills.getLevel(Skill.HUNTER), llIllIIl[19]) && lIllIllIlII(Skills.getLevel(Skill.RANGED), llIllIIl[15]) && lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6]) && lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIllIIl[22]) && lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIllIIl[19])) {
                String[] strArr2 = new String[llIllIIl[0]];
                strArr2[llIllIIl[1]] = llIllIII[llIllIIl[24]];
                if (lIllIllIIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                    cr = llIllIII[llIllIIl[25]];
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIllIllIlIl(nearest) && lIllIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIllIII[llIllIIl[26]];
                        C0000a.a(nearest);
                    }
                    if (lIllIllIlIl(nearest) && lIllIllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llIllIIl[27]);
                            "".length();
                        }
                        if (lIllIllIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = llIllIII[llIllIIl[28]];
                            if (lIllIllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llIllIIl[13]);
                                "".length();
                            }
                            if (lIllIllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llIllIIl[9]);
                                "".length();
                            }
                            int[] iArr = new int[llIllIIl[0]];
                            iArr[llIllIIl[1]] = llIllIIl[29];
                            if (lIllIllIIII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIllIIl[0]];
                                iArr2[llIllIIl[1]] = llIllIIl[29];
                            }
                            int[] iArr3 = new int[llIllIIl[0]];
                            iArr3[llIllIIl[1]] = llIllIIl[30];
                            if (lIllIllIIII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIllIIl[0]];
                                iArr4[llIllIIl[1]] = llIllIIl[30];
                            }
                            int[] iArr5 = new int[llIllIIl[0]];
                            iArr5[llIllIIl[1]] = llIllIIl[31];
                            if (lIllIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIllIIl[0]];
                                iArr6[llIllIIl[1]] = llIllIIl[31];
                            }
                            int[] iArr7 = new int[llIllIIl[0]];
                            iArr7[llIllIIl[1]] = llIllIIl[32];
                            if (lIllIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIllIIl[0]];
                                iArr8[llIllIIl[1]] = llIllIIl[32];
                            }
                            int[] iArr9 = new int[llIllIIl[0]];
                            iArr9[llIllIIl[1]] = llIllIIl[33];
                            if (lIllIllIIII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llIllIIl[0]];
                                iArr10[llIllIIl[1]] = llIllIIl[33];
                            }
                            int[] iArr11 = new int[llIllIIl[0]];
                            iArr11[llIllIIl[1]] = llIllIIl[34];
                            if (lIllIllIIII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llIllIIl[0]];
                                iArr12[llIllIIl[1]] = llIllIIl[34];
                            }
                            int[] iArr13 = new int[llIllIIl[23]];
                            iArr13[llIllIIl[1]] = llIllIIl[36];
                            iArr13[llIllIIl[0]] = llIllIIl[37];
                            iArr13[llIllIIl[9]] = llIllIIl[33];
                            iArr13[llIllIIl[11]] = llIllIIl[38];
                            iArr13[llIllIIl[13]] = llIllIIl[32];
                            iArr13[llIllIIl[8]] = llIllIIl[34];
                            iArr13[llIllIIl[16]] = llIllIIl[39];
                            iArr13[llIllIIl[20]] = llIllIIl[40];
                            iArr13[llIllIIl[21]] = llIllIIl[41];
                            iArr13[llIllIIl[19]] = llIllIIl[30];
                            iArr13[llIllIIl[4]] = llIllIIl[31];
                            if (lIllIllIIlI(C0004e.b(iArr13) ? 1 : 0)) {
                                ag();
                                System.out.println(llIllIII[llIllIIl[42]]);
                                bz = llIllIIl[0];
                                return;
                            }
                            int[] iArr14 = new int[llIllIIl[23]];
                            iArr14[llIllIIl[1]] = llIllIIl[36];
                            iArr14[llIllIIl[0]] = llIllIIl[37];
                            iArr14[llIllIIl[9]] = llIllIIl[33];
                            iArr14[llIllIIl[11]] = llIllIIl[38];
                            iArr14[llIllIIl[13]] = llIllIIl[32];
                            iArr14[llIllIIl[8]] = llIllIIl[34];
                            iArr14[llIllIIl[16]] = llIllIIl[39];
                            iArr14[llIllIIl[20]] = llIllIIl[40];
                            iArr14[llIllIIl[21]] = llIllIIl[41];
                            iArr14[llIllIIl[19]] = llIllIIl[30];
                            iArr14[llIllIIl[4]] = llIllIIl[31];
                            if (lIllIllIIII(C0004e.b(iArr14) ? 1 : 0)) {
                                C0000a.a(llIllIIl[34], llIllIIl[13]);
                                C0000a.a(llIllIIl[37], llIllIIl[0]);
                                C0000a.a(llIllIIl[43], llIllIIl[0]);
                                C0000a.a(llIllIIl[32], llIllIIl[13]);
                                C0000a.a(llIllIIl[29], llIllIIl[13]);
                                C0000a.a(llIllIIl[40], llIllIIl[0]);
                                C0000a.a(llIllIIl[41], llIllIIl[0]);
                                C0000a.a(llIllIIl[36], llIllIIl[4]);
                                C0000a.a(llIllIIl[30], llIllIIl[4]);
                                C0000a.a(llIllIIl[31], llIllIIl[28]);
                                C0000a.a(llIllIIl[44], llIllIIl[0]);
                                C0000a.a(llIllIIl[45], llIllIIl[27]);
                            }
                        }
                    }
                }
            }
            if (lIllIllIIII(Inventory.contains(C0005f.bb) ? 1 : 0) && lIllIllIIIl(Movement.getRunEnergy(), llIllIIl[15])) {
                Inventory.getFirst(C0005f.bb).interact(llIllIII[llIllIIl[46]]);
                Time.sleepTicks(llIllIIl[0]);
                "".length();
            }
            if (lIllIllIIII(Inventory.contains(C0005f.aY) ? 1 : 0) && lIllIllIIIl(Prayers.getPoints(), llIllIIl[47])) {
                Inventory.getFirst(C0005f.aY).interact(llIllIII[llIllIIl[12]]);
            }
            if (lIllIllIlll(lIllIlIllll(C0004e.v(), 60.0d))) {
                String[] strArr3 = new String[llIllIIl[0]];
                strArr3[llIllIIl[1]] = llIllIII[llIllIIl[48]];
                if (lIllIllIIII(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIllIIl[0]];
                    strArr4[llIllIIl[1]] = llIllIII[llIllIIl[49]];
                    Inventory.getFirst(strArr4).interact(llIllIII[llIllIIl[50]]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                }
            }
            if (lIllIllIIII(ac() ? 1 : 0) && lIllIllIIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (lIllIllIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
                    AccBuilderBarrows.c = llIllIII[llIllIIl[51]];
                    if (lIllIllIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(ce);
                    "".length();
                    Time.sleepTicks(llIllIIl[0]);
                    "".length();
                }
                if (lIllIllIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
                    ci = llIllIIl[1];
                    C0006g.a(llIllIII[llIllIIl[47]], bX);
                }
                if (lIllIllIIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIllIIl[52], llIllIIl[53], llIllIIl[1])) ? 1 : 0)) {
                    String[] strArr5 = new String[llIllIIl[0]];
                    strArr5[llIllIIl[1]] = llIllIII[llIllIIl[54]];
                    TileObjects.getNearest(strArr5).interact(llIllIII[llIllIIl[55]]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                }
                if (lIllIllIIII(new WorldArea(llIllIIl[52], llIllIIl[56], llIllIIl[16], llIllIIl[4], llIllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[llIllIIl[0]];
                    strArr6[llIllIIl[1]] = llIllIII[llIllIIl[57]];
                    TileObjects.getNearest(strArr6).interact(llIllIII[llIllIIl[58]]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[4])) {
                int[] iArr15 = new int[llIllIIl[0]];
                iArr15[llIllIIl[1]] = llIllIIl[44];
                if (lIllIllIIlI(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIllIIl[0]];
                    iArr16[llIllIIl[1]] = llIllIIl[44];
                    Inventory.getFirst(iArr16).interact(llIllIII[llIllIIl[59]]);
                }
                int[] iArr17 = new int[llIllIIl[0]];
                iArr17[llIllIIl[1]] = llIllIIl[60];
                if (lIllIllIIlI(Inventory.contains(iArr17) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(llIllIIl[61], llIllIIl[62], llIllIIl[1]);
                    int[] iArr18 = new int[llIllIIl[0]];
                    iArr18[llIllIIl[1]] = llIllIIl[63];
                    if (lIllIllIIlI(Inventory.contains(iArr18) ? 1 : 0) && lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIllIIl[48])) {
                        if (lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(co), llIllIIl[8])) {
                            AccBuilderBarrows.c = llIllIII[llIllIIl[64]];
                            Movement.walkTo(co);
                            "".length();
                            Time.sleepTicks(llIllIIl[0]);
                            "".length();
                        }
                        if (lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(co), llIllIIl[8])) {
                            if (lIllIllIIlI(Shop.isOpen() ? 1 : 0)) {
                                String[] strArr7 = new String[llIllIIl[0]];
                                strArr7[llIllIIl[1]] = llIllIII[llIllIIl[65]];
                                NPCs.getNearest(strArr7).interact(llIllIII[llIllIIl[10]]);
                                Time.sleepTicks(llIllIIl[9]);
                                "".length();
                            }
                            if (lIllIllIIII(Shop.isOpen() ? 1 : 0)) {
                                Shop.buyFive(llIllIIl[63]);
                                Time.sleepTicks(llIllIIl[11]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr19 = new int[llIllIIl[0]];
                    iArr19[llIllIIl[1]] = llIllIIl[63];
                    if (lIllIllIIII(Inventory.contains(iArr19) ? 1 : 0)) {
                        if (lIllIllIIlI(cm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIllIIlI(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[llIllIIl[0]];
                            iArr20[llIllIIl[1]] = llIllIIl[31];
                            if (lIllIllIIII(Inventory.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[llIllIIl[0]];
                                iArr21[llIllIIl[1]] = llIllIIl[31];
                                Inventory.getFirst(iArr21).interact(llIllIII[llIllIIl[66]]);
                                Time.sleepTicks(llIllIIl[20]);
                                "".length();
                            }
                        }
                        if (!lIllIllIIlI(cm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIllIIII(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(llIllIIl[61], llIllIIl[62], llIllIIl[1]);
                            if (lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIllIIl[8]) && lIllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderBarrows.c = llIllIII[llIllIIl[67]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(llIllIIl[0]);
                                "".length();
                            }
                            String[] strArr8 = new String[llIllIIl[0]];
                            strArr8[llIllIIl[1]] = llIllIII[llIllIIl[14]];
                            if (lIllIllIIII(Inventory.contains(strArr8) ? 1 : 0)) {
                                if (lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIllIIl[8]) && lIllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                                    String[] strArr9 = new String[llIllIIl[0]];
                                    strArr9[llIllIIl[1]] = llIllIII[llIllIIl[68]];
                                    TileObjects.getNearest(strArr9).interact(llIllIII[llIllIIl[69]]);
                                    Time.sleepTicks(llIllIIl[13]);
                                    "".length();
                                }
                                String[] strArr10 = new String[llIllIIl[0]];
                                strArr10[llIllIIl[1]] = llIllIII[llIllIIl[70]];
                                if (lIllIllIlIl(TileObjects.getNearest(strArr10))) {
                                    String[] strArr11 = new String[llIllIIl[0]];
                                    strArr11[llIllIIl[1]] = llIllIII[llIllIIl[71]];
                                    if (lIllIllIIII(Inventory.contains(strArr11) ? 1 : 0)) {
                                        String[] strArr12 = new String[llIllIIl[0]];
                                        strArr12[llIllIIl[1]] = llIllIII[llIllIIl[22]];
                                        Item first = Inventory.getFirst(strArr12);
                                        String[] strArr13 = new String[llIllIIl[0]];
                                        strArr13[llIllIIl[1]] = llIllIII[llIllIIl[72]];
                                        first.useOn(TileObjects.getNearest(strArr13));
                                        Time.sleep(C0004e.c(llIllIIl[73], llIllIIl[74]));
                                        "".length();
                                    }
                                }
                            }
                            String[] strArr14 = new String[llIllIIl[0]];
                            strArr14[llIllIIl[1]] = llIllIII[llIllIIl[75]];
                            if (lIllIllIIlI(Inventory.contains(strArr14) ? 1 : 0)) {
                                if (lIllIllIIll(Players.getLocal().getWorldLocation().getPlane(), llIllIIl[0])) {
                                    String[] strArr15 = new String[llIllIIl[0]];
                                    strArr15[llIllIIl[1]] = llIllIII[llIllIIl[76]];
                                    TileObjects.getNearest(strArr15).interact(llIllIII[llIllIIl[77]]);
                                    Time.sleepTicks(llIllIIl[8]);
                                    "".length();
                                }
                                if (lIllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                                    do {
                                        String[] strArr16 = new String[llIllIIl[0]];
                                        strArr16[llIllIIl[1]] = llIllIII[llIllIIl[78]];
                                        if (lIllIllIIII(Inventory.contains(strArr16) ? 1 : 0)) {
                                            String[] strArr17 = new String[llIllIIl[0]];
                                            strArr17[llIllIIl[1]] = llIllIII[llIllIIl[79]];
                                            TileObjects.getNearest(strArr17).interact(llIllIII[llIllIIl[80]]);
                                            Time.sleepTicks(llIllIIl[9]);
                                            "".length();
                                            "".length();
                                        }
                                    } while ((((((50 + 101) - 37) + 101) ^ (((138 + 63) - 99) + 79)) & (((245 ^ 130) ^ (52 ^ 33)) ^ (-" ".length()))) != ((((72 + 32) - (-2)) + 66) ^ (((141 + 109) - 117) + 35)));
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr22 = new int[llIllIIl[0]];
                    iArr22[llIllIIl[1]] = llIllIIl[32];
                    if (lIllIllIIlI(Inventory.contains(iArr22) ? 1 : 0)) {
                        String[] strArr18 = new String[llIllIIl[0]];
                        strArr18[llIllIIl[1]] = llIllIII[llIllIIl[81]];
                        if (lIllIllIIlI(Inventory.contains(strArr18) ? 1 : 0) && lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIllIIl[48])) {
                            if (lIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                                C0006g.a(llIllIII[llIllIIl[82]], bX);
                                Time.sleepTicks(llIllIIl[0]);
                                "".length();
                            }
                            C0006g.a(bX);
                        }
                    }
                }
                int[] iArr23 = new int[llIllIIl[0]];
                iArr23[llIllIIl[1]] = llIllIIl[60];
                if (lIllIllIIII(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[llIllIIl[9]];
                    iArr24[llIllIIl[1]] = llIllIIl[83];
                    iArr24[llIllIIl[0]] = llIllIIl[29];
                    if (lIllIllIIII(Inventory.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[llIllIIl[9]];
                        iArr25[llIllIIl[1]] = llIllIIl[83];
                        iArr25[llIllIIl[0]] = llIllIIl[29];
                        Inventory.getAll(iArr25).stream().forEach(item -> {
                            item.interact(llIllIII[llIllIIl[162]]);
                        });
                    }
                    if (lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                        Movement.walkTo(cp);
                        "".length();
                        Time.sleepTicks(llIllIIl[0]);
                        "".length();
                    }
                    if (lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                        C0006g.a(llIllIII[llIllIIl[15]], bX);
                    }
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[48])) {
                C0006g.a(llIllIII[llIllIIl[84]], bX);
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[64])) {
                C0006g.a(llIllIII[llIllIIl[85]], bX);
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[22])) {
                C0006g.a(llIllIII[llIllIIl[86]], bX);
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[15])) {
                C0006g.a(llIllIII[llIllIIl[87]], bX);
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[6])) {
                C0006g.a(llIllIII[llIllIIl[88]], bX);
            }
            if (!lIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[89]) || lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[90])) {
                WorldPoint worldPoint3 = new WorldPoint(llIllIIl[91], llIllIIl[92], llIllIIl[1]);
                if (lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llIllIIl[11])) {
                    AccBuilderBarrows.c = llIllIII[llIllIIl[93]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(llIllIIl[0]);
                    "".length();
                }
                if (lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llIllIIl[11])) {
                    C0006g.a(llIllIII[llIllIIl[94]], bX);
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[95])) {
                if (lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                    Movement.walkTo(cp);
                    "".length();
                    Time.sleepTicks(llIllIIl[0]);
                    "".length();
                }
                if (lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                    C0006g.a(llIllIII[llIllIIl[96]], bX);
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[97])) {
                C0006g.a(llIllIII[llIllIIl[98]], bX);
            }
            if (!lIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[99]) || lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[100])) {
                C0006g.a(llIllIII[llIllIIl[6]], bX);
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[100])) {
                String[] strArr19 = new String[llIllIIl[0]];
                strArr19[llIllIIl[1]] = llIllIII[llIllIIl[101]];
                if (lIllIllIIII(Inventory.contains(strArr19) ? 1 : 0)) {
                    String[] strArr20 = new String[llIllIIl[0]];
                    strArr20[llIllIIl[1]] = llIllIII[llIllIIl[102]];
                    if (lIllIllIIlI(Inventory.contains(strArr20) ? 1 : 0)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Integer.valueOf(llIllIIl[33]), Integer.valueOf(llIllIIl[8]));
                        "".length();
                        hashMap.put(Integer.valueOf(llIllIIl[38]), Integer.valueOf(llIllIIl[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(llIllIIl[39]), Integer.valueOf(llIllIIl[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(llIllIIl[103]), Integer.valueOf(llIllIIl[0]));
                        "".length();
                        C0004e.a(hashMap, llIllIIl[1], llIllIIl[1]);
                    }
                    String[] strArr21 = new String[llIllIIl[0]];
                    strArr21[llIllIIl[1]] = llIllIII[llIllIIl[104]];
                    if (lIllIllIIII(Inventory.contains(strArr21) ? 1 : 0)) {
                        aD();
                    }
                }
            }
            if (!lIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[105]) || lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[106])) {
                String[] strArr22 = new String[llIllIIl[0]];
                strArr22[llIllIIl[1]] = llIllIII[llIllIIl[107]];
                NPC nearest2 = NPCs.getNearest(strArr22);
                if (lIllIllIlIl(nearest2)) {
                    if (lIllIllIIII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        C0006g.a(llIllIII[llIllIIl[3]], bX);
                    }
                    if (lIllIllIIlI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2);
                        "".length();
                        Time.sleepTicks(llIllIIl[0]);
                        "".length();
                    }
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[108])) {
                String[] strArr23 = new String[llIllIIl[0]];
                strArr23[llIllIIl[1]] = llIllIII[llIllIIl[109]];
                if (lIllIllIIlI(Inventory.contains(strArr23) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(llIllIIl[110], llIllIIl[111], llIllIIl[1]);
                    WorldPoint worldPoint5 = new WorldPoint(llIllIIl[110], llIllIIl[112], llIllIIl[1]);
                    if (lIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIllIII[llIllIIl[113]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(llIllIIl[0]);
                        "".length();
                    }
                    if (lIllIllIIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        Movement.walkTo(worldPoint5);
                        "".length();
                    }
                    if (lIllIllIIII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        String[] strArr24 = new String[llIllIIl[0]];
                        strArr24[llIllIIl[1]] = llIllIII[llIllIIl[114]];
                        Item first2 = Inventory.getFirst(strArr24);
                        String[] strArr25 = new String[llIllIIl[0]];
                        strArr25[llIllIIl[1]] = llIllIII[llIllIIl[115]];
                        first2.useOn(Inventory.getFirst(strArr25));
                        Time.sleepTicks(llIllIIl[11]);
                        "".length();
                    }
                }
                String[] strArr26 = new String[llIllIIl[0]];
                strArr26[llIllIIl[1]] = llIllIII[llIllIIl[89]];
                if (lIllIllIIII(Inventory.contains(strArr26) ? 1 : 0)) {
                    aD();
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[116])) {
                WorldPoint worldPoint6 = new WorldPoint(llIllIIl[117], llIllIIl[118], llIllIIl[1]);
                if (lIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    Movement.walkTo(worldPoint6);
                    "".length();
                    Time.sleepTicks(llIllIIl[0]);
                    "".length();
                }
                if (lIllIllIIII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    String[] strArr27 = new String[llIllIIl[0]];
                    strArr27[llIllIIl[1]] = llIllIII[llIllIIl[119]];
                    NPCs.getNearest(strArr27).interact(llIllIII[llIllIIl[120]]);
                    Time.sleepTicks(llIllIIl[0]);
                    "".length();
                }
            }
            if (!lIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[121]) || lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[122])) {
                WorldPoint worldPoint7 = new WorldPoint(llIllIIl[123], llIllIIl[124], llIllIIl[1]);
                if (lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llIllIIl[9])) {
                    if (lIllIllIIII(Inventory.contains(C0005f.aU) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aU).interact(llIllIII[llIllIIl[90]]);
                    }
                    AccBuilderBarrows.c = llIllIII[llIllIIl[125]];
                    Movement.walkTo(worldPoint7);
                    "".length();
                    Time.sleepTicks(llIllIIl[0]);
                    "".length();
                }
                if (lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llIllIIl[9])) {
                    String[] strArr28 = new String[llIllIIl[0]];
                    strArr28[llIllIIl[1]] = llIllIII[llIllIIl[126]];
                    NPC nearest3 = NPCs.getNearest(strArr28);
                    if (lIllIllIlIl(nearest3)) {
                        if (lIllIllIIII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            C0006g.a(llIllIII[llIllIIl[95]], bX);
                        }
                        if (lIllIllIIlI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            Movement.walkTo(nearest3);
                            "".length();
                            Time.sleepTicks(llIllIIl[0]);
                            "".length();
                        }
                    }
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[127])) {
                String[] strArr29 = new String[llIllIIl[0]];
                strArr29[llIllIIl[1]] = llIllIII[llIllIIl[128]];
                if (lIllIllIIlI(Inventory.contains(strArr29) ? 1 : 0)) {
                    WorldPoint worldPoint8 = new WorldPoint(llIllIIl[117], llIllIIl[118], llIllIIl[1]);
                    if (lIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        Movement.walkTo(worldPoint8);
                        "".length();
                        Time.sleepTicks(llIllIIl[0]);
                        "".length();
                    }
                    if (lIllIllIIII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        String[] strArr30 = new String[llIllIIl[0]];
                        strArr30[llIllIIl[1]] = llIllIII[llIllIIl[129]];
                        NPCs.getNearest(strArr30).interact(llIllIII[llIllIIl[130]]);
                        Time.sleepTicks(llIllIIl[0]);
                        "".length();
                    }
                }
                String[] strArr31 = new String[llIllIIl[0]];
                strArr31[llIllIIl[1]] = llIllIII[llIllIIl[97]];
                if (lIllIllIIII(Inventory.contains(strArr31) ? 1 : 0)) {
                    aD();
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[131])) {
                aD();
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[132])) {
                if (lIllIllIIII(Widgets.get(llIllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] strArr32 = new String[llIllIIl[0]];
                    strArr32[llIllIIl[1]] = llIllIII[llIllIIl[134]];
                    Inventory.getFirst(strArr32).interact(llIllIII[llIllIIl[135]]);
                    Time.sleepTicks(llIllIIl[13]);
                    "".length();
                }
                if (lIllIllIIlI(Widgets.get(llIllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click(Widgets.get(llIllIIl[133], llIllIIl[55]).getClickPoint().getX(), Widgets.get(llIllIIl[133], llIllIIl[55]).getClickPoint().getY(), (boolean) llIllIIl[0]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(llIllIIl[133], llIllIIl[65]).getClickPoint().getX(), Widgets.get(llIllIIl[133], llIllIIl[65]).getClickPoint().getY(), (boolean) llIllIIl[0]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(llIllIIl[133], llIllIIl[67]).getClickPoint().getX(), Widgets.get(llIllIIl[133], llIllIIl[67]).getClickPoint().getY(), (boolean) llIllIIl[0]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(llIllIIl[133], llIllIIl[22]).getClickPoint().getX(), Widgets.get(llIllIIl[133], llIllIIl[22]).getClickPoint().getY(), (boolean) llIllIIl[0]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(llIllIIl[133], llIllIIl[76]).getClickPoint().getX(), Widgets.get(llIllIIl[133], llIllIIl[76]).getClickPoint().getY(), (boolean) llIllIIl[0]);
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(llIllIIl[133], llIllIIl[79]).getClickPoint().getX(), Widgets.get(llIllIIl[133], llIllIIl[79]).getClickPoint().getY(), (boolean) llIllIIl[0]);
                    Time.sleepTicks(llIllIIl[8]);
                    "".length();
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[136])) {
                aD();
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[137])) {
                String[] strArr33 = new String[llIllIIl[0]];
                strArr33[llIllIIl[1]] = llIllIII[llIllIIl[138]];
                if (lIllIllIIII(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[llIllIIl[0]];
                    strArr34[llIllIIl[1]] = llIllIII[llIllIIl[139]];
                    Item first3 = Inventory.getFirst(strArr34);
                    String[] strArr35 = new String[llIllIIl[0]];
                    strArr35[llIllIIl[1]] = llIllIII[llIllIIl[140]];
                    first3.useOn(Inventory.getFirst(strArr35));
                    Time.sleepTicks(llIllIIl[9]);
                    "".length();
                }
            }
            if (lIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[141])) {
                if (lIllIllIIIl(ci, llIllIIl[0])) {
                    Q.lw += llIllIIl[0];
                    Q.o(AccBuilderBarrows.m);
                    ci += llIllIIl[0];
                    Q.lw = llIllIIl[1];
                    cj = llIllIIl[1];
                }
                aD();
            }
            C0006g.a(bX);
        }
    }

    static {
        lIllIlIlllI();
        lIllIlIllIl();
        bB = new ArrayList();
        cl = new WorldArea(llIllIIl[163], llIllIIl[56], llIllIIl[16], llIllIIl[4], llIllIIl[1]);
        cm = new WorldArea(llIllIIl[164], llIllIIl[165], llIllIIl[166], llIllIIl[142], llIllIIl[1]);
        cn = new WorldArea(llIllIIl[164], llIllIIl[165], llIllIIl[166], llIllIIl[142], llIllIIl[0]);
        ce = new WorldPoint(llIllIIl[167], llIllIIl[168], llIllIIl[1]);
        co = new WorldPoint(llIllIIl[169], llIllIIl[170], llIllIIl[1]);
        cp = new WorldPoint(llIllIIl[171], llIllIIl[172], llIllIIl[1]);
        String[] strArr = new String[llIllIIl[21]];
        strArr[llIllIIl[1]] = llIllIII[llIllIIl[173]];
        strArr[llIllIIl[0]] = llIllIII[llIllIIl[174]];
        strArr[llIllIIl[9]] = llIllIII[llIllIIl[175]];
        strArr[llIllIIl[11]] = llIllIII[llIllIIl[176]];
        strArr[llIllIIl[13]] = llIllIII[llIllIIl[100]];
        strArr[llIllIIl[8]] = llIllIII[llIllIIl[177]];
        strArr[llIllIIl[16]] = llIllIII[llIllIIl[178]];
        strArr[llIllIIl[20]] = llIllIII[llIllIIl[179]];
        bX = strArr;
        cq = llIllIIl[1];
        cr = llIllIII[llIllIIl[180]];
    }
}
