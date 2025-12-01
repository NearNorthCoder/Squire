package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ai  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ai.class */
public class ai implements ab {
    public static /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ WorldArea cP;
    public static /* synthetic */ WorldArea cO;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ WorldPoint cR;
    private static /* synthetic */ int[] llIIlIIIl;
    public static /* synthetic */ int[] cM;
    public static /* synthetic */ int[] mf;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ String[] llIIIllll;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ WorldPoint cm;

    private static boolean lIlIlIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlIIIlllI() {
        llIIlIIIl = new int[101];
        llIIlIIIl[0] = " ".length() & (" ".length() ^ (-" ".length()));
        llIIlIIIl[1] = " ".length();
        llIIlIIIl[2] = 67 ^ 127;
        llIIlIIIl[3] = 70 ^ 13;
        llIIlIIIl[4] = 108 ^ 42;
        llIIlIIIl[5] = "  ".length();
        llIIlIIIl[6] = "   ".length();
        llIIlIIIl[7] = (-8231) & 13230;
        llIIlIIIl[8] = 136 ^ 140;
        llIIlIIIl[9] = (-((-5169) & 13369)) & (-21) & 9215;
        llIIlIIIl[10] = (-((-675) & 9910)) & (-4097) & 14331;
        llIIlIIIl[11] = (-33) & 8039;
        llIIlIIIl[12] = 193 ^ 196;
        llIIlIIIl[13] = (-19969) & 20347;
        llIIlIIIl[14] = (((152 + 47) - 151) + 114) ^ (((164 + 99) - 171) + 106);
        llIIlIIIl[15] = (222 ^ 139) ^ (209 ^ 139);
        llIIlIIIl[16] = (5 ^ 53) ^ (80 ^ 102);
        llIIlIIIl[17] = (195 ^ 161) ^ (246 ^ 147);
        llIIlIIIl[18] = (-((-1057) & 24297)) & (-8193) & 32763;
        llIIlIIIl[19] = (-19083) & 20415;
        llIIlIIIl[20] = (-((-22853) & 31557)) & (-129) & 15355;
        llIIlIIIl[21] = 39 ^ 47;
        llIIlIIIl[22] = (14 ^ 88) ^ (64 ^ 62);
        llIIlIIIl[23] = (144 ^ 184) ^ (181 ^ 151);
        llIIlIIIl[24] = 183 ^ 190;
        llIIlIIIl[25] = (165 ^ 155) ^ (14 ^ 59);
        llIIlIIIl[26] = 36 ^ 40;
        llIIlIIIl[27] = (((9 + 133) - 100) + 109) ^ (((51 + 96) - 43) + 50);
        llIIlIIIl[28] = (50 ^ 109) ^ (28 ^ 77);
        llIIlIIIl[29] = (((108 + 2) - 39) + 108) ^ (((133 + 127) - 118) + 21);
        llIIlIIIl[30] = (((138 + 99) - 182) + 92) ^ (((46 + 104) - 71) + 51);
        llIIlIIIl[31] = 59 ^ 41;
        llIIlIIIl[32] = (((16 + 57) - (-42)) + 14) ^ (((113 + 28) - 85) + 90);
        llIIlIIIl[33] = -" ".length();
        llIIlIIIl[34] = (-2370) & 38865247;
        llIIlIIIl[35] = (-4231) & 15358;
        llIIlIIIl[36] = (-10373) & 31670;
        llIIlIIIl[37] = (-((-25101) & 28303)) & (-65) & 24567;
        llIIlIIIl[38] = (-((-289) & 11687)) & (-66) & 32767;
        llIIlIIIl[39] = (-26199) & 32766;
        llIIlIIIl[40] = (-((-6153) & 15498)) & (-515) & 16383;
        llIIlIIIl[41] = (-16528) & 28367;
        llIIlIIIl[42] = (((109 + 1) - (-57)) + 19) ^ (((6 + 4) - (-111)) + 53);
        llIIlIIIl[43] = (133 ^ 193) ^ (209 ^ 128);
        llIIlIIIl[44] = 127 ^ 105;
        llIIlIIIl[45] = 121 ^ 110;
        llIIlIIIl[46] = (((89 + 128) - 152) + 73) ^ (((17 + 108) - 33) + 54);
        llIIlIIIl[47] = 138 ^ 147;
        llIIlIIIl[48] = (125 ^ 15) ^ (82 ^ 62);
        llIIlIIIl[49] = 54 ^ 44;
        llIIlIIIl[50] = 170 ^ 177;
        llIIlIIIl[51] = 80 ^ 76;
        llIIlIIIl[52] = 170 ^ 183;
        llIIlIIIl[53] = (-((-4149) & 13111)) & (-6197) & 16319;
        llIIlIIIl[54] = (14 ^ 83) ^ (76 ^ 14);
        llIIlIIIl[55] = (-16897) & 18019;
        llIIlIIIl[56] = 28 ^ 60;
        llIIlIIIl[57] = (-((-4753) & 21405)) & (-10369) & 28093;
        llIIlIIIl[58] = (121 ^ 0) ^ (221 ^ 133);
        llIIlIIIl[59] = (-((-4359) & 23367)) & (-8193) & 28399;
        llIIlIIIl[60] = (((53 + 9) - (-18)) + 91) ^ (((62 + 21) - (-40)) + 14);
        llIIlIIIl[61] = (-10579) & 12282;
        llIIlIIIl[62] = (104 ^ 125) ^ (243 ^ 197);
        llIIlIIIl[63] = (-9) & 11134;
        llIIlIIIl[64] = 68 ^ 96;
        llIIlIIIl[65] = (113 ^ 84) ^ (48 ^ 39);
        llIIlIIIl[66] = (-((-1897) & 26492)) & (-2089) & 27583;
        llIIlIIIl[67] = (-((-2125) & 10494)) & (-7) & 16383;
        llIIlIIIl[68] = (-((-1698) & 18343)) & (-1539) & 53183;
        llIIlIIIl[69] = (-((-26019) & 32755)) & (-1029) & 32764;
        llIIlIIIl[70] = (-22540) & 23039;
        llIIlIIIl[71] = (-1383) & 16382;
        llIIlIIIl[72] = (-4632) & 589631;
        llIIlIIIl[73] = (-((-322) & 25033)) & (-4097) & 653807;
        llIIlIIIl[74] = (-5122) & 180121;
        llIIlIIIl[75] = (-1027) & 186026;
        llIIlIIIl[76] = (-((-26643) & 32631)) & (-2) & 900989;
        llIIlIIIl[77] = (-24616) & 949615;
        llIIlIIIl[78] = (-((-8193) & 12002)) & (-4101) & 1457909;
        llIIlIIIl[79] = (-((-7489) & 24013)) & (-33) & 1506556;
        llIIlIIIl[80] = (-((-1065) & 26607)) & (-4098) & 1179639;
        llIIlIIIl[81] = (-26886) & 1276885;
        llIIlIIIl[82] = (-20648) & 710647;
        llIIlIIIl[83] = (-272) & 740271;
        llIIlIIIl[84] = (-((-9081) & 28541)) & (-12290) & 2981749;
        llIIlIIIl[85] = (-16998) & 3071997;
        llIIlIIIl[86] = 122 ^ 95;
        llIIlIIIl[87] = (194 ^ 191) ^ (122 ^ 33);
        llIIlIIIl[88] = (-12581) & 15805;
        llIIlIIIl[89] = (-((-4245) & 29077)) & (-38) & 28159;
        llIIlIIIl[90] = (-((-3746) & 24565)) & (-8705) & 32767;
        llIIlIIIl[91] = (-((-6361) & 31482)) & (-4363) & 32763;
        llIIlIIIl[92] = (-((-12269) & 28655)) & (-4357) & 23927;
        llIIlIIIl[93] = (-24577) & 27743;
        llIIlIIIl[94] = 123 ^ 75;
        llIIlIIIl[95] = (-((-1177) & 22171)) & (-49) & 24255;
        llIIlIIIl[96] = (-12929) & 16109;
        llIIlIIIl[97] = (-21250) & 24503;
        llIIlIIIl[98] = (-((-10961) & 31473)) & (-8769) & 32511;
        llIIlIIIl[99] = (-4128) & 7423;
        llIIlIIIl[100] = 180 ^ 147;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x057c, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x05d3, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x060d, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0645, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ai.llIIlIIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x069a, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x06f1, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0748, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x079f, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x07f6, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x084d, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x08a4, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x08de, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0929, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ai.llIIlIIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0135, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018c, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e3, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023a, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0291, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e8, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0322, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0351, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ai.llIIlIIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03c9, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0420, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0477, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04ce, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0525, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v169, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v236, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v299, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aN() {
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2])) {
            int[] iArr = new int[llIIlIIIl[1]];
            iArr[llIIlIIIl[0]] = llIIlIIIl[20];
            if (lIlIlIIlIlII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIIIl[1]];
                iArr2[llIIlIIIl[0]] = llIIlIIIl[20];
                if (lIlIlIIlIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIlIIIl[1]];
                    iArr3[llIIlIIIl[0]] = llIIlIIIl[20];
                }
            }
            int[] iArr4 = new int[llIIlIIIl[1]];
            iArr4[llIIlIIIl[0]] = llIIlIIIl[37];
            if (lIlIlIIlIlII(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llIIlIIIl[1]];
                iArr5[llIIlIIIl[0]] = llIIlIIIl[37];
                if (lIlIlIIlIlII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIlIIIl[1]];
                    iArr6[llIIlIIIl[0]] = llIIlIIIl[37];
                }
            }
            int[] iArr7 = new int[llIIlIIIl[1]];
            iArr7[llIIlIIIl[0]] = llIIlIIIl[38];
            if (lIlIlIIlIlII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIlIIIl[1]];
                iArr8[llIIlIIIl[0]] = llIIlIIIl[38];
                if (lIlIlIIlIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIIlIIIl[1]];
                    iArr9[llIIlIIIl[0]] = llIIlIIIl[38];
                }
            }
            int[] iArr10 = new int[llIIlIIIl[1]];
            iArr10[llIIlIIIl[0]] = llIIlIIIl[36];
            if (lIlIlIIlIlII(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIlIIIl[1]];
                iArr11[llIIlIIIl[0]] = llIIlIIIl[36];
                if (lIlIlIIlIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIlIIIl[1]];
                    iArr12[llIIlIIIl[0]] = llIIlIIIl[36];
                }
            }
            int[] iArr13 = new int[llIIlIIIl[1]];
            iArr13[llIIlIIIl[0]] = llIIlIIIl[40];
            if (lIlIlIIlIlII(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIlIIIl[1]];
                iArr14[llIIlIIIl[0]] = llIIlIIIl[40];
                if (lIlIlIIlIlII(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIlIIIl[1]];
                    iArr15[llIIlIIIl[0]] = llIIlIIIl[40];
                }
            }
            int[] iArr16 = new int[llIIlIIIl[1]];
            iArr16[llIIlIIIl[0]] = llIIlIIIl[39];
            if (lIlIlIIlIlII(Equipment.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIlIIIl[1]];
                iArr17[llIIlIIIl[0]] = llIIlIIIl[39];
                if (lIlIlIIlIlII(Inventory.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIlIIIl[1]];
                    iArr18[llIIlIIIl[0]] = llIIlIIIl[39];
                }
            }
            int[] iArr19 = new int[llIIlIIIl[1]];
            iArr19[llIIlIIIl[0]] = llIIlIIIl[35];
            if (lIlIlIIlIlII(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIlIIIl[1]];
                iArr20[llIIlIIIl[0]] = llIIlIIIl[35];
                if (lIlIlIIlIlII(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIIlIIIl[1]];
                    iArr21[llIIlIIIl[0]] = llIIlIIIl[35];
                }
            }
            int[] iArr22 = new int[llIIlIIIl[1]];
            iArr22[llIIlIIIl[0]] = llIIlIIIl[63];
            if (lIlIlIIlIlII(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIlIIIl[1]];
                iArr23[llIIlIIIl[0]] = llIIlIIIl[63];
                if (lIlIlIIlIlII(Equipment.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[llIIlIIIl[1]];
                    iArr24[llIIlIIIl[0]] = llIIlIIIl[63];
                }
            }
            int[] iArr25 = new int[llIIlIIIl[1]];
            iArr25[llIIlIIIl[0]] = llIIlIIIl[13];
            if (lIlIlIIlIlII(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIIlIIIl[1]];
                iArr26[llIIlIIIl[0]] = llIIlIIIl[13];
            }
            ?? r0 = llIIlIIIl[1];
            "".length();
            return (-" ".length()) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        } else if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2])) {
            int[] iArr27 = new int[llIIlIIIl[1]];
            iArr27[llIIlIIIl[0]] = llIIlIIIl[19];
            if (lIlIlIIlIlII(Equipment.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIIlIIIl[1]];
                iArr28[llIIlIIIl[0]] = llIIlIIIl[19];
                if (lIlIlIIlIlII(Inventory.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[llIIlIIIl[1]];
                    iArr29[llIIlIIIl[0]] = llIIlIIIl[19];
                }
            }
            int[] iArr30 = new int[llIIlIIIl[1]];
            iArr30[llIIlIIIl[0]] = llIIlIIIl[55];
            if (lIlIlIIlIlII(Equipment.contains(iArr30) ? 1 : 0)) {
                int[] iArr31 = new int[llIIlIIIl[1]];
                iArr31[llIIlIIIl[0]] = llIIlIIIl[55];
                if (lIlIlIIlIlII(Inventory.contains(iArr31) ? 1 : 0)) {
                    int[] iArr32 = new int[llIIlIIIl[1]];
                    iArr32[llIIlIIIl[0]] = llIIlIIIl[55];
                }
            }
            int[] iArr33 = new int[llIIlIIIl[1]];
            iArr33[llIIlIIIl[0]] = llIIlIIIl[57];
            if (lIlIlIIlIlII(Equipment.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[llIIlIIIl[1]];
                iArr34[llIIlIIIl[0]] = llIIlIIIl[57];
                if (lIlIlIIlIlII(Inventory.contains(iArr34) ? 1 : 0)) {
                    int[] iArr35 = new int[llIIlIIIl[1]];
                    iArr35[llIIlIIIl[0]] = llIIlIIIl[57];
                }
            }
            int[] iArr36 = new int[llIIlIIIl[1]];
            iArr36[llIIlIIIl[0]] = llIIlIIIl[53];
            if (lIlIlIIlIlII(Equipment.contains(iArr36) ? 1 : 0)) {
                int[] iArr37 = new int[llIIlIIIl[1]];
                iArr37[llIIlIIIl[0]] = llIIlIIIl[53];
                if (lIlIlIIlIlII(Inventory.contains(iArr37) ? 1 : 0)) {
                    int[] iArr38 = new int[llIIlIIIl[1]];
                    iArr38[llIIlIIIl[0]] = llIIlIIIl[53];
                }
            }
            int[] iArr39 = new int[llIIlIIIl[1]];
            iArr39[llIIlIIIl[0]] = llIIlIIIl[59];
            if (lIlIlIIlIlII(Equipment.contains(iArr39) ? 1 : 0)) {
                int[] iArr40 = new int[llIIlIIIl[1]];
                iArr40[llIIlIIIl[0]] = llIIlIIIl[59];
                if (lIlIlIIlIlII(Inventory.contains(iArr40) ? 1 : 0)) {
                    int[] iArr41 = new int[llIIlIIIl[1]];
                    iArr41[llIIlIIIl[0]] = llIIlIIIl[59];
                }
            }
            int[] iArr42 = new int[llIIlIIIl[1]];
            iArr42[llIIlIIIl[0]] = llIIlIIIl[61];
            if (lIlIlIIlIlII(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIIlIIIl[1]];
                iArr43[llIIlIIIl[0]] = llIIlIIIl[61];
                if (lIlIlIIlIlII(Equipment.contains(iArr43) ? 1 : 0)) {
                    int[] iArr44 = new int[llIIlIIIl[1]];
                    iArr44[llIIlIIIl[0]] = llIIlIIIl[61];
                }
            }
            int[] iArr45 = new int[llIIlIIIl[1]];
            iArr45[llIIlIIIl[0]] = llIIlIIIl[63];
            if (lIlIlIIlIlII(Inventory.contains(iArr45) ? 1 : 0)) {
                int[] iArr46 = new int[llIIlIIIl[1]];
                iArr46[llIIlIIIl[0]] = llIIlIIIl[63];
                if (lIlIlIIlIlII(Equipment.contains(iArr46) ? 1 : 0)) {
                    int[] iArr47 = new int[llIIlIIIl[1]];
                    iArr47[llIIlIIIl[0]] = llIIlIIIl[63];
                }
            }
            int[] iArr48 = new int[llIIlIIIl[1]];
            iArr48[llIIlIIIl[0]] = llIIlIIIl[13];
            if (lIlIlIIlIlII(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[llIIlIIIl[1]];
                iArr49[llIIlIIIl[0]] = llIIlIIIl[13];
            }
            ?? r02 = llIIlIIIl[1];
            "".length();
            return " ".length() == ((52 ^ 59) & ((57 ^ 54) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r02;
        } else {
            int[] iArr50 = new int[llIIlIIIl[1]];
            iArr50[llIIlIIIl[0]] = llIIlIIIl[18];
            if (lIlIlIIlIlII(Equipment.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[llIIlIIIl[1]];
                iArr51[llIIlIIIl[0]] = llIIlIIIl[18];
                if (lIlIlIIlIlII(Inventory.contains(iArr51) ? 1 : 0)) {
                    int[] iArr52 = new int[llIIlIIIl[1]];
                    iArr52[llIIlIIIl[0]] = llIIlIIIl[18];
                }
            }
            int[] iArr53 = new int[llIIlIIIl[1]];
            iArr53[llIIlIIIl[0]] = llIIlIIIl[55];
            if (lIlIlIIlIlII(Equipment.contains(iArr53) ? 1 : 0)) {
                int[] iArr54 = new int[llIIlIIIl[1]];
                iArr54[llIIlIIIl[0]] = llIIlIIIl[55];
                if (lIlIlIIlIlII(Inventory.contains(iArr54) ? 1 : 0)) {
                    int[] iArr55 = new int[llIIlIIIl[1]];
                    iArr55[llIIlIIIl[0]] = llIIlIIIl[55];
                }
            }
            int[] iArr56 = new int[llIIlIIIl[1]];
            iArr56[llIIlIIIl[0]] = llIIlIIIl[57];
            if (lIlIlIIlIlII(Equipment.contains(iArr56) ? 1 : 0)) {
                int[] iArr57 = new int[llIIlIIIl[1]];
                iArr57[llIIlIIIl[0]] = llIIlIIIl[57];
                if (lIlIlIIlIlII(Inventory.contains(iArr57) ? 1 : 0)) {
                    int[] iArr58 = new int[llIIlIIIl[1]];
                    iArr58[llIIlIIIl[0]] = llIIlIIIl[57];
                }
            }
            int[] iArr59 = new int[llIIlIIIl[1]];
            iArr59[llIIlIIIl[0]] = llIIlIIIl[53];
            if (lIlIlIIlIlII(Equipment.contains(iArr59) ? 1 : 0)) {
                int[] iArr60 = new int[llIIlIIIl[1]];
                iArr60[llIIlIIIl[0]] = llIIlIIIl[53];
                if (lIlIlIIlIlII(Inventory.contains(iArr60) ? 1 : 0)) {
                    int[] iArr61 = new int[llIIlIIIl[1]];
                    iArr61[llIIlIIIl[0]] = llIIlIIIl[53];
                }
            }
            int[] iArr62 = new int[llIIlIIIl[1]];
            iArr62[llIIlIIIl[0]] = llIIlIIIl[59];
            if (lIlIlIIlIlII(Equipment.contains(iArr62) ? 1 : 0)) {
                int[] iArr63 = new int[llIIlIIIl[1]];
                iArr63[llIIlIIIl[0]] = llIIlIIIl[59];
                if (lIlIlIIlIlII(Inventory.contains(iArr63) ? 1 : 0)) {
                    int[] iArr64 = new int[llIIlIIIl[1]];
                    iArr64[llIIlIIIl[0]] = llIIlIIIl[59];
                }
            }
            int[] iArr65 = new int[llIIlIIIl[1]];
            iArr65[llIIlIIIl[0]] = llIIlIIIl[61];
            if (lIlIlIIlIlII(Inventory.contains(iArr65) ? 1 : 0)) {
                int[] iArr66 = new int[llIIlIIIl[1]];
                iArr66[llIIlIIIl[0]] = llIIlIIIl[61];
                if (lIlIlIIlIlII(Equipment.contains(iArr66) ? 1 : 0)) {
                    int[] iArr67 = new int[llIIlIIIl[1]];
                    iArr67[llIIlIIIl[0]] = llIIlIIIl[61];
                }
            }
            int[] iArr68 = new int[llIIlIIIl[1]];
            iArr68[llIIlIIIl[0]] = llIIlIIIl[63];
            if (lIlIlIIlIlII(Inventory.contains(iArr68) ? 1 : 0)) {
                int[] iArr69 = new int[llIIlIIIl[1]];
                iArr69[llIIlIIIl[0]] = llIIlIIIl[63];
                if (lIlIlIIlIlII(Equipment.contains(iArr69) ? 1 : 0)) {
                    int[] iArr70 = new int[llIIlIIIl[1]];
                    iArr70[llIIlIIIl[0]] = llIIlIIIl[63];
                }
            }
            int[] iArr71 = new int[llIIlIIIl[1]];
            iArr71[llIIlIIIl[0]] = llIIlIIIl[13];
            if (lIlIlIIlIlII(Inventory.contains(iArr71) ? 1 : 0)) {
                int[] iArr72 = new int[llIIlIIIl[1]];
                iArr72[llIIlIIIl[0]] = llIIlIIIl[13];
            }
            ?? r03 = llIIlIIIl[1];
            "".length();
            return " ".length() <= 0 ? ((155 ^ 134) ^ (210 ^ 154)) & (((((84 + 214) - 151) + 71) ^ (((65 + 4) - 40) + 114)) ^ (-" ".length())) : r03;
        }
    }

    private static boolean lIlIlIIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[4]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[3])) {
            ?? r0 = llIIlIIIl[1];
            "".length();
            return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((((98 + 86) - 108) + 53) ^ (((186 + 53) - 108) + 68)) & (((51 ^ 59) ^ (244 ^ 186)) ^ (-" ".length())) : r0;
        }
        return llIIlIIIl[0];
    }

    private static boolean lIlIlIIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIlIIIIIlI(String lIllIIlIIlIIIl, String lIllIIlIIlIIII) {
        try {
            SecretKeySpec lIllIIlIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlIIlIIll = Cipher.getInstance("Blowfish");
            lIllIIlIIlIIll.init(llIIlIIIl[5], lIllIIlIIlIlII);
            return new String(lIllIIlIIlIIll.doFinal(Base64.getDecoder().decode(lIllIIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlIIlIIlI) {
            lIllIIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x05dd, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0348, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v211, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v247, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aJ() {
        if (lIlIlIIlIIlI(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIIIllll[llIIlIIIl[0]];
            C0001b.a(bx);
            if (lIlIlIIlIIll(bx.size(), llIIlIIIl[1])) {
                System.out.println(llIIIllll[llIIlIIIl[1]]);
                bv = llIIlIIIl[0];
            }
        }
        if (lIlIlIIlIlII(bv ? 1 : 0) && (!lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) || !lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) || lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]))) {
            if (lIlIlIIlIlII(aM() ? 1 : 0) && (!lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[3]) || !lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) || lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[4]))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIIlIllI(nearest) && lIlIlIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIIllll[llIIlIIIl[5]];
                    C0000a.a(nearest);
                }
                if (lIlIlIIlIllI(nearest) && lIlIlIIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIIllll[llIIlIIIl[6]];
                    if (lIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlIIIl[7]);
                        "".length();
                    }
                    if (lIlIlIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlIIlIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlIIIl[1]);
                            "".length();
                        }
                        if (lIlIlIIlIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlIIIl[5]);
                            "".length();
                        }
                        if (lIlIlIIlIlII(aN() ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIllll[llIIlIIIl[8]]);
                            bv = llIIlIIIl[1];
                            return;
                        }
                        if (!lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) || (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]))) {
                            C0000a.a(cM, llIIlIIIl[1]);
                        }
                        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2])) {
                            C0000a.a(mf, llIIlIIIl[1]);
                        }
                        C0000a.a(llIIlIIIl[9], llIIlIIIl[10]);
                        C0000a.b(C0005f.bc, llIIlIIIl[1]);
                        C0000a.a(llIIlIIIl[11], llIIlIIIl[12]);
                        C0000a.a(llIIlIIIl[13], llIIlIIIl[14]);
                    }
                }
            }
            if (lIlIlIIlIIlI(aM() ? 1 : 0)) {
                aL();
                if (lIlIlIIlIlIl(Movement.getRunEnergy(), llIIlIIIl[15]) && lIlIlIIlIlII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[llIIlIIIl[1]];
                strArr[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[12]];
                if (lIlIlIIlIlII(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIlIIIl[1]];
                    strArr2[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[16]];
                    if (lIlIlIIlIlII(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[llIIlIIIl[1]];
                        strArr3[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[17]];
                        if (lIlIlIIlIlII(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[llIIlIIIl[1]];
                            iArr[llIIlIIIl[0]] = llIIlIIIl[18];
                            if (lIlIlIIlIlII(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIlIIIl[1]];
                                iArr2[llIIlIIIl[0]] = llIIlIIIl[19];
                                if (lIlIlIIlIlII(Equipment.contains(iArr2) ? 1 : 0)) {
                                    int[] iArr3 = new int[llIIlIIIl[1]];
                                    iArr3[llIIlIIIl[0]] = llIIlIIIl[20];
                                }
                            }
                        }
                    }
                }
                aO();
                if (lIlIlIIllIII(lIlIlIIIllll(C0004e.w(), 45.0d))) {
                    int[] iArr4 = new int[llIIlIIIl[1]];
                    iArr4[llIIlIIIl[0]] = llIIlIIIl[13];
                    if (lIlIlIIlIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIlIIIl[1]];
                        iArr5[llIIlIIIl[0]] = llIIlIIIl[13];
                        Inventory.getFirst(iArr5).interact(llIIIllll[llIIlIIIl[21]]);
                        Time.sleepTicks(llIIlIIIl[1]);
                        "".length();
                    }
                }
                if ((lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && !lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[23])) || ((lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[22]) && !lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[23])) || (lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[23])))) {
                    C0015p.al();
                }
                if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[22]) && ((lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && !lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2])) || ((lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[22]) && !lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2])) || (lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[22]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]))))) {
                    C0011l.aj();
                }
            }
        }
        if (!(lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[4]) && !lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[3])) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2])) {
            String[] strArr4 = new String[llIIlIIIl[1]];
            strArr4[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[24]];
            if (lIlIlIIlIlII(Equipment.contains(strArr4) ? 1 : 0)) {
                String[] strArr5 = new String[llIIlIIIl[1]];
                strArr5[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[23]];
                if (lIlIlIIlIlII(Equipment.contains(strArr5) ? 1 : 0)) {
                    String[] strArr6 = new String[llIIlIIIl[1]];
                    strArr6[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[25]];
                    if (lIlIlIIlIlII(Equipment.contains(strArr6) ? 1 : 0)) {
                        int[] iArr6 = new int[llIIlIIIl[1]];
                        iArr6[llIIlIIIl[0]] = llIIlIIIl[18];
                        if (lIlIlIIlIlII(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[llIIlIIIl[1]];
                            iArr7[llIIlIIIl[0]] = llIIlIIIl[19];
                            if (lIlIlIIlIlII(Equipment.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIIlIIIl[1]];
                                iArr8[llIIlIIIl[0]] = llIIlIIIl[20];
                            }
                        }
                    }
                }
            }
            aO();
            C0017r.aV();
        }
    }

    private static String lIlIlIIIIIIl(String lIllIIlIIllllI, String lIllIIlIIlllIl) {
        try {
            SecretKeySpec lIllIIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), llIIlIIIl[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIl[5], lIllIIlIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlIIlllll) {
            lIllIIlIIlllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIlIIIl[0];
    }

    private static boolean lIlIlIIlIlII(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static void aL() {
        if (lIlIlIIllIlI(Static.getClient().getVar(llIIlIIIl[25]), llIIlIIIl[1])) {
            Static.getClient().invokeMenuAction(llIIIllll[llIIlIIIl[31]], llIIIllll[llIIlIIIl[32]], llIIlIIIl[1], MenuAction.CC_OP.getId(), llIIlIIIl[33], llIIlIIIl[34]);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2])) {
            C0004e.l(llIIlIIIl[20]);
            C0004e.l(llIIlIIIl[35]);
            C0004e.l(llIIlIIIl[36]);
            C0004e.l(llIIlIIIl[37]);
            C0004e.l(llIIlIIIl[38]);
            C0004e.l(llIIlIIIl[39]);
            C0004e.l(llIIlIIIl[40]);
            C0004e.l(llIIlIIIl[41]);
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[12])) {
            String[] strArr = new String[llIIlIIIl[1]];
            strArr[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[42]];
            if (lIlIlIIlIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIlIIIl[1]];
                strArr2[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[43]];
                Inventory.getFirst(strArr2).interact(llIIIllll[llIIlIIIl[44]]);
            }
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[12]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[42])) {
            String[] strArr3 = new String[llIIlIIIl[1]];
            strArr3[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[45]];
            if (lIlIlIIlIIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[llIIlIIIl[1]];
                strArr4[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[46]];
                Inventory.getFirst(strArr4).interact(llIIIllll[llIIlIIIl[47]]);
            }
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[42]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[48])) {
            String[] strArr5 = new String[llIIlIIIl[1]];
            strArr5[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[49]];
            if (lIlIlIIlIIlI(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[llIIlIIIl[1]];
                strArr6[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[50]];
                Inventory.getFirst(strArr6).interact(llIIIllll[llIIlIIIl[51]]);
            }
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[48]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22])) {
            int[] iArr = new int[llIIlIIIl[1]];
            iArr[llIIlIIIl[0]] = llIIlIIIl[18];
            if (lIlIlIIlIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIIIl[1]];
                iArr2[llIIlIIIl[0]] = llIIlIIIl[18];
                Inventory.getFirst(iArr2).interact(llIIIllll[llIIlIIIl[52]]);
            }
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22])) {
            int[] iArr3 = new int[llIIlIIIl[1]];
            iArr3[llIIlIIIl[0]] = llIIlIIIl[19];
            if (lIlIlIIlIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIlIIIl[1]];
                iArr4[llIIlIIIl[0]] = llIIlIIIl[19];
                Inventory.getFirst(iArr4).interact(llIIIllll[llIIlIIIl[48]]);
            }
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[48])) {
            int[] iArr5 = new int[llIIlIIIl[1]];
            iArr5[llIIlIIIl[0]] = llIIlIIIl[53];
            if (lIlIlIIlIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlIIIl[1]];
                iArr6[llIIlIIIl[0]] = llIIlIIIl[53];
                Inventory.getFirst(iArr6).interact(llIIIllll[llIIlIIIl[54]]);
            }
            int[] iArr7 = new int[llIIlIIIl[1]];
            iArr7[llIIlIIIl[0]] = llIIlIIIl[55];
            if (lIlIlIIlIIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIlIIIl[1]];
                iArr8[llIIlIIIl[0]] = llIIlIIIl[55];
                Inventory.getFirst(iArr8).interact(llIIIllll[llIIlIIIl[56]]);
            }
            int[] iArr9 = new int[llIIlIIIl[1]];
            iArr9[llIIlIIIl[0]] = llIIlIIIl[57];
            if (lIlIlIIlIIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIlIIIl[1]];
                iArr10[llIIlIIIl[0]] = llIIlIIIl[57];
                Inventory.getFirst(iArr10).interact(llIIIllll[llIIlIIIl[58]]);
            }
            int[] iArr11 = new int[llIIlIIIl[1]];
            iArr11[llIIlIIIl[0]] = llIIlIIIl[59];
            if (lIlIlIIlIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIlIIIl[1]];
                iArr12[llIIlIIIl[0]] = llIIlIIIl[59];
                Inventory.getFirst(iArr12).interact(llIIIllll[llIIlIIIl[60]]);
            }
        }
        int[] iArr13 = new int[llIIlIIIl[1]];
        iArr13[llIIlIIIl[0]] = llIIlIIIl[61];
        if (lIlIlIIlIIlI(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIIlIIIl[1]];
            iArr14[llIIlIIIl[0]] = llIIlIIIl[61];
            Inventory.getFirst(iArr14).interact(llIIIllll[llIIlIIIl[62]]);
        }
        int[] iArr15 = new int[llIIlIIIl[1]];
        iArr15[llIIlIIIl[0]] = llIIlIIIl[63];
        if (lIlIlIIlIIlI(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[llIIlIIIl[1]];
            iArr16[llIIlIIIl[0]] = llIIlIIIl[63];
            Inventory.getFirst(iArr16).interact(llIIIllll[llIIlIIIl[64]]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0546, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0580, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x05ba, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x05f4, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x062e, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0668, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0118, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0152, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018c, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c6, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0200, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023a, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026d, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ai.llIIlIIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02fb, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0335, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x036f, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03a9, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03e3, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x041d, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0457, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x050c, code lost:
        if (lIlIlIIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v135, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v228, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v270, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aM() {
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2])) {
            int[] iArr = new int[llIIlIIIl[1]];
            iArr[llIIlIIIl[0]] = llIIlIIIl[20];
            if (lIlIlIIlIlII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIIIl[1]];
                iArr2[llIIlIIIl[0]] = llIIlIIIl[20];
            }
            int[] iArr3 = new int[llIIlIIIl[1]];
            iArr3[llIIlIIIl[0]] = llIIlIIIl[37];
            if (lIlIlIIlIlII(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIlIIIl[1]];
                iArr4[llIIlIIIl[0]] = llIIlIIIl[37];
            }
            int[] iArr5 = new int[llIIlIIIl[1]];
            iArr5[llIIlIIIl[0]] = llIIlIIIl[38];
            if (lIlIlIIlIlII(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlIIIl[1]];
                iArr6[llIIlIIIl[0]] = llIIlIIIl[38];
            }
            int[] iArr7 = new int[llIIlIIIl[1]];
            iArr7[llIIlIIIl[0]] = llIIlIIIl[36];
            if (lIlIlIIlIlII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIlIIIl[1]];
                iArr8[llIIlIIIl[0]] = llIIlIIIl[36];
            }
            int[] iArr9 = new int[llIIlIIIl[1]];
            iArr9[llIIlIIIl[0]] = llIIlIIIl[40];
            if (lIlIlIIlIlII(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIlIIIl[1]];
                iArr10[llIIlIIIl[0]] = llIIlIIIl[40];
            }
            int[] iArr11 = new int[llIIlIIIl[1]];
            iArr11[llIIlIIIl[0]] = llIIlIIIl[39];
            if (lIlIlIIlIlII(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIlIIIl[1]];
                iArr12[llIIlIIIl[0]] = llIIlIIIl[39];
            }
            int[] iArr13 = new int[llIIlIIIl[1]];
            iArr13[llIIlIIIl[0]] = llIIlIIIl[35];
            if (lIlIlIIlIlII(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIlIIIl[1]];
                iArr14[llIIlIIIl[0]] = llIIlIIIl[35];
            }
            int[] iArr15 = new int[llIIlIIIl[1]];
            iArr15[llIIlIIIl[0]] = llIIlIIIl[63];
            if (lIlIlIIlIlII(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIIlIIIl[1]];
                iArr16[llIIlIIIl[0]] = llIIlIIIl[63];
            }
            int[] iArr17 = new int[llIIlIIIl[1]];
            iArr17[llIIlIIIl[0]] = llIIlIIIl[13];
            if (lIlIlIIlIlII(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[llIIlIIIl[1]];
                iArr18[llIIlIIIl[0]] = llIIlIIIl[13];
            }
            ?? r0 = llIIlIIIl[1];
            "".length();
            return ((183 ^ 173) & ((48 ^ 42) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        } else if ((!lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) || lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2])) && !(lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]))) {
            int[] iArr19 = new int[llIIlIIIl[1]];
            iArr19[llIIlIIIl[0]] = llIIlIIIl[18];
            if (lIlIlIIlIlII(Equipment.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIlIIIl[1]];
                iArr20[llIIlIIIl[0]] = llIIlIIIl[18];
            }
            int[] iArr21 = new int[llIIlIIIl[1]];
            iArr21[llIIlIIIl[0]] = llIIlIIIl[55];
            if (lIlIlIIlIlII(Equipment.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[llIIlIIIl[1]];
                iArr22[llIIlIIIl[0]] = llIIlIIIl[55];
            }
            int[] iArr23 = new int[llIIlIIIl[1]];
            iArr23[llIIlIIIl[0]] = llIIlIIIl[57];
            if (lIlIlIIlIlII(Equipment.contains(iArr23) ? 1 : 0)) {
                int[] iArr24 = new int[llIIlIIIl[1]];
                iArr24[llIIlIIIl[0]] = llIIlIIIl[57];
            }
            int[] iArr25 = new int[llIIlIIIl[1]];
            iArr25[llIIlIIIl[0]] = llIIlIIIl[53];
            if (lIlIlIIlIlII(Equipment.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIIlIIIl[1]];
                iArr26[llIIlIIIl[0]] = llIIlIIIl[53];
            }
            int[] iArr27 = new int[llIIlIIIl[1]];
            iArr27[llIIlIIIl[0]] = llIIlIIIl[59];
            if (lIlIlIIlIlII(Equipment.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIIlIIIl[1]];
                iArr28[llIIlIIIl[0]] = llIIlIIIl[59];
            }
            int[] iArr29 = new int[llIIlIIIl[1]];
            iArr29[llIIlIIIl[0]] = llIIlIIIl[61];
            if (lIlIlIIlIlII(Equipment.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[llIIlIIIl[1]];
                iArr30[llIIlIIIl[0]] = llIIlIIIl[61];
            }
            int[] iArr31 = new int[llIIlIIIl[1]];
            iArr31[llIIlIIIl[0]] = llIIlIIIl[63];
            if (lIlIlIIlIlII(Equipment.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIIlIIIl[1]];
                iArr32[llIIlIIIl[0]] = llIIlIIIl[63];
            }
            int[] iArr33 = new int[llIIlIIIl[1]];
            iArr33[llIIlIIIl[0]] = llIIlIIIl[13];
            if (lIlIlIIlIIlI(Inventory.contains(iArr33) ? 1 : 0)) {
                ?? r02 = llIIlIIIl[1];
                "".length();
                return ((141 ^ 187) & ((126 ^ 72) ^ (-1))) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return llIIlIIIl[0];
        } else {
            int[] iArr34 = new int[llIIlIIIl[1]];
            iArr34[llIIlIIIl[0]] = llIIlIIIl[19];
            if (lIlIlIIlIlII(Equipment.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIIlIIIl[1]];
                iArr35[llIIlIIIl[0]] = llIIlIIIl[19];
            }
            int[] iArr36 = new int[llIIlIIIl[1]];
            iArr36[llIIlIIIl[0]] = llIIlIIIl[55];
            if (lIlIlIIlIlII(Equipment.contains(iArr36) ? 1 : 0)) {
                int[] iArr37 = new int[llIIlIIIl[1]];
                iArr37[llIIlIIIl[0]] = llIIlIIIl[55];
            }
            int[] iArr38 = new int[llIIlIIIl[1]];
            iArr38[llIIlIIIl[0]] = llIIlIIIl[57];
            if (lIlIlIIlIlII(Equipment.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[llIIlIIIl[1]];
                iArr39[llIIlIIIl[0]] = llIIlIIIl[57];
            }
            int[] iArr40 = new int[llIIlIIIl[1]];
            iArr40[llIIlIIIl[0]] = llIIlIIIl[53];
            if (lIlIlIIlIlII(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIIlIIIl[1]];
                iArr41[llIIlIIIl[0]] = llIIlIIIl[53];
            }
            int[] iArr42 = new int[llIIlIIIl[1]];
            iArr42[llIIlIIIl[0]] = llIIlIIIl[59];
            if (lIlIlIIlIlII(Equipment.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIIlIIIl[1]];
                iArr43[llIIlIIIl[0]] = llIIlIIIl[59];
            }
            int[] iArr44 = new int[llIIlIIIl[1]];
            iArr44[llIIlIIIl[0]] = llIIlIIIl[61];
            if (lIlIlIIlIlII(Equipment.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[llIIlIIIl[1]];
                iArr45[llIIlIIIl[0]] = llIIlIIIl[61];
            }
            int[] iArr46 = new int[llIIlIIIl[1]];
            iArr46[llIIlIIIl[0]] = llIIlIIIl[63];
            if (lIlIlIIlIlII(Equipment.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[llIIlIIIl[1]];
                iArr47[llIIlIIIl[0]] = llIIlIIIl[63];
            }
            int[] iArr48 = new int[llIIlIIIl[1]];
            iArr48[llIIlIIIl[0]] = llIIlIIIl[13];
            if (lIlIlIIlIIlI(Inventory.contains(iArr48) ? 1 : 0)) {
                ?? r03 = llIIlIIIl[1];
                "".length();
                return (-" ".length()) >= ((((57 + 23) - 30) + 144) ^ (((56 + 60) - 42) + 124)) ? ("  ".length() ^ (107 ^ 43)) & (((((123 + 21) - (-60)) + 50) ^ (((127 + 151) - 114) + 24)) ^ (-" ".length())) : r03;
            }
            return llIIlIIIl[0];
        }
    }

    private static boolean lIlIlIIllIlI(int i, int i2) {
        return i == i2;
    }

    public static void am() {
        if (lIlIlIIlIlII(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIIllll[llIIlIIIl[26]];
            Movement.walkTo(cm);
            "".length();
            Time.sleepTicks(llIIlIIIl[1]);
            "".length();
        }
        if (lIlIlIIlIIlI(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIIllll[llIIlIIIl[27]];
            if (lIlIlIIllIIl(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIlIlIIlIIlI(npc.getName().contains(llIIIllll[llIIlIIIl[87]]) ? 1 : 0) && lIlIlIIllIIl(npc.getInteracting()) && lIlIlIIlIlII(npc.isDead() ? 1 : 0)) {
                        ?? r0 = llIIlIIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIIIl[0];
                });
                String[] strArr = new String[llIIlIIIl[5]];
                strArr[llIIlIIIl[0]] = llIIIllll[llIIlIIIl[28]];
                strArr[llIIlIIIl[1]] = llIIIllll[llIIlIIIl[15]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIlIlIIlllIl(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = llIIlIIIl[1];
                        "".length();
                        return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIIIl[0];
                }).collect(Collectors.toList());
                if (lIlIlIIlIlII(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(llIIlIIIl[0])).interact(llIIIllll[llIIlIIIl[29]]);
                    Time.sleepTicks(llIIlIIIl[5]);
                    "".length();
                }
                if (lIlIlIIlIllI(nearest) && lIlIlIIlIlII(Players.getLocal().isMoving() ? 1 : 0) && lIlIlIIlIIlI(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(llIIIllll[llIIlIIIl[30]]);
                    Time.sleepTicks(llIIlIIIl[5]);
                    "".length();
                }
            }
            if (lIlIlIIlIllI(Players.getLocal().getInteracting())) {
                Time.sleepTicks(llIIlIIIl[8]);
                "".length();
            }
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIIllll[llIIlIIIl[86]];
    }

    private static boolean lIlIlIIlIlll(int i) {
        return i > 0;
    }

    private static void lIlIlIIIllIl() {
        llIIIllll = new String[llIIlIIIl[100]];
        llIIIllll[llIIlIIIl[0]] = lIlIlIIIIIII("NyAuLiISdT4zKRgm", "uUWGL");
        llIIIllll[llIIlIIIl[1]] = lIlIlIIIIIII("IA0ZEQIOARNYExMdHhYWRg0DHRwVSFcLBg8QFBAYCANXGhAFD1cMHkYJEhQUA0QDChAPCh4WFg==", "fdwxq");
        llIIIllll[llIIlIIIl[5]] = lIlIlIIIIIII("OxkVEDQUDAoXNFUMDFkxFBYI", "uxcyS");
        llIIIllll[llIIlIIIl[6]] = lIlIlIIIIIIl("CqkElqeXV2YKqTRGEl1mZ/+cSqsn1F+Z", "QIUFt");
        llIIIllll[llIIlIIIl[8]] = lIlIlIIIIIII("EBRpLRUiUSQlFDQYJytHNAQ5PAsuFDpgRzQGIDgELxgnK0czHmkOMh44Bws=", "GqILg");
        llIIIllll[llIIlIIIl[12]] = lIlIlIIIIIII("ATAuGFQ7ISgbHTwjMw==", "HBAvt");
        llIIIllll[llIIlIIIl[16]] = lIlIlIIIIIlI("zR90zSEFA31Qk121lAkqGA==", "Aoevw");
        llIIIllll[llIIlIIIl[17]] = lIlIlIIIIIIl("I62ueAuFwDRsP3+VoGVDrpmdd3imN3Eh", "jwKKq");
        llIIIllll[llIIlIIIl[21]] = lIlIlIIIIIII("DjUw", "KTDwS");
        llIIIllll[llIIlIIIl[24]] = lIlIlIIIIIII("JgsgCUYcGiYKDxsYPQ==", "oyOgf");
        llIIIllll[llIIlIIIl[23]] = lIlIlIIIIIlI("sggA0zNzv3FEIjqOJP7zLg==", "saHsg");
        llIIIllll[llIIlIIIl[25]] = lIlIlIIIIIIl("tp6JAdZ1vzetuDbjZfTz0cAIe+yWIPCJ", "TZlbS");
        llIIIllll[llIIlIIIl[26]] = lIlIlIIIIIIl("LDJi2q/qIcLXITT0Kf000axeS/fCwdqL", "FoIGS");
        llIIIllll[llIIlIIIl[27]] = lIlIlIIIIIII("MgwqHDAXAmYTNg4W", "yeFpY");
        llIIIllll[llIIlIIIl[28]] = lIlIlIIIIIII("ABgY", "CwoDN");
        llIIIllll[llIIlIIIl[15]] = lIlIlIIIIIlI("8TpP1Ccq2oc=", "iZJne");
        llIIIllll[llIIlIIIl[29]] = lIlIlIIIIIII("DiM2CCwk", "OWBiO");
        llIIIllll[llIIlIIIl[30]] = lIlIlIIIIIlI("hnkFSwYdxKk=", "yawBR");
        llIIIllll[llIIlIIIl[31]] = lIlIlIIIIIlI("vGB6DLXwJEGMPNvjYXdotA==", "cIGpP");
        llIIIllll[llIIlIIIl[32]] = lIlIlIIIIIlI("5E0gOgno11A=", "AaMTp");
        llIIIllll[llIIlIIIl[42]] = lIlIlIIIIIII("Kwg3IGQRGTEjLRYbKg==", "bzXND");
        llIIIllll[llIIlIIIl[43]] = lIlIlIIIIIIl("EYqRSQ/LuBfL44WJ7Ri8oQ==", "oqnqZ");
        llIIIllll[llIIlIIIl[44]] = lIlIlIIIIIII("IxMvJRI=", "tzJIv");
        llIIIllll[llIIlIIIl[45]] = lIlIlIIIIIII("ITU8HChSMjoQKRs1OAs=", "rAYyD");
        llIIIllll[llIIlIIIl[46]] = lIlIlIIIIIIl("tg06Poy7auJ8/xUcv+U6Bg==", "MgjPv");
        llIIIllll[llIIlIIIl[47]] = lIlIlIIIIIlI("BaGfoMleCGE=", "mBlnl");
        llIIIllll[llIIlIIIl[49]] = lIlIlIIIIIIl("wCudbr+SOcpfRdF88pxVvKXRimSAZ9Hn", "biFpb");
        llIIIllll[llIIlIIIl[50]] = lIlIlIIIIIIl("dMUOecoS2Dny1DQkLXj+hpx8bJG6scKS", "Ljase");
        llIIIllll[llIIlIIIl[51]] = lIlIlIIIIIlI("ZBCqqNHK2DA=", "QIYRn");
        llIIIllll[llIIlIIIl[52]] = lIlIlIIIIIII("JiUyLT4=", "qLWAZ");
        llIIIllll[llIIlIIIl[48]] = lIlIlIIIIIIl("jrgEE4NbiSE=", "DlWdZ");
        llIIIllll[llIIlIIIl[54]] = lIlIlIIIIIlI("i6ychJvav+M=", "PQPeh");
        llIIIllll[llIIlIIIl[56]] = lIlIlIIIIIlI("oHqjNUN3SLg=", "DenxA");
        llIIIllll[llIIlIIIl[58]] = lIlIlIIIIIII("MA8VEQ==", "gjtcQ");
        llIIIllll[llIIlIIIl[60]] = lIlIlIIIIIII("HAstFw==", "KnLeT");
        llIIIllll[llIIlIIIl[62]] = lIlIlIIIIIlI("PRxVX2TktB0=", "IDvIa");
        llIIIllll[llIIlIIIl[64]] = lIlIlIIIIIII("OhMAFQ==", "mvagz");
        llIIIllll[llIIlIIIl[86]] = lIlIlIIIIIII("dFdYRFltUEJTJCcLEhY=", "Bgwsi");
        llIIIllll[llIIlIIIl[87]] = lIlIlIIIIIIl("t5gxGfF4P8M=", "ppQOa");
    }

    private static int lIlIlIIIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static void Q() {
        int[] iArr = new int[llIIlIIIl[1]];
        iArr[llIIlIIIl[0]] = llIIlIIIl[11];
        if (lIlIlIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIIIl[11], llIIlIIIl[22], llIIlIIIl[66]));
            "".length();
        }
        int[] iArr2 = new int[llIIlIIIl[1]];
        iArr2[llIIlIIIl[0]] = llIIlIIIl[67];
        if (lIlIlIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIIIl[67], llIIlIIIl[12], llIIlIIIl[66]));
            "".length();
        }
        int[] iArr3 = new int[llIIlIIIl[1]];
        iArr3[llIIlIIIl[0]] = llIIlIIIl[63];
        if (lIlIlIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIIIl[63], llIIlIIIl[1], llIIlIIIl[68]));
            "".length();
        }
        int[] iArr4 = new int[llIIlIIIl[1]];
        iArr4[llIIlIIIl[0]] = llIIlIIIl[61];
        if (lIlIlIIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIIIl[61], llIIlIIIl[1], llIIlIIIl[69]));
            "".length();
        }
        int[] iArr5 = new int[llIIlIIIl[1]];
        iArr5[llIIlIIIl[0]] = llIIlIIIl[13];
        if (lIlIlIIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIIIl[13], llIIlIIIl[14], llIIlIIIl[70]));
            "".length();
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2])) {
            int[] iArr6 = new int[llIIlIIIl[1]];
            iArr6[llIIlIIIl[0]] = llIIlIIIl[53];
            if (lIlIlIIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[53], llIIlIIIl[1], llIIlIIIl[71]));
                "".length();
            }
            int[] iArr7 = new int[llIIlIIIl[1]];
            iArr7[llIIlIIIl[0]] = llIIlIIIl[57];
            if (lIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[57], llIIlIIIl[1], llIIlIIIl[71]));
                "".length();
            }
            int[] iArr8 = new int[llIIlIIIl[1]];
            iArr8[llIIlIIIl[0]] = llIIlIIIl[59];
            if (lIlIlIIlIlII(Bank.contains(iArr8) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[59], llIIlIIIl[1], llIIlIIIl[71]));
                "".length();
            }
            int[] iArr9 = new int[llIIlIIIl[1]];
            iArr9[llIIlIIIl[0]] = llIIlIIIl[55];
            if (lIlIlIIlIlII(Bank.contains(iArr9) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[55], llIIlIIIl[1], llIIlIIIl[71]));
                "".length();
            }
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2])) {
            int[] iArr10 = new int[llIIlIIIl[1]];
            iArr10[llIIlIIIl[0]] = llIIlIIIl[20];
            if (lIlIlIIlIlII(Bank.contains(iArr10) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[20], llIIlIIIl[1], C0004e.c(llIIlIIIl[72], llIIlIIIl[73])));
                "".length();
            }
            int[] iArr11 = new int[llIIlIIIl[1]];
            iArr11[llIIlIIIl[0]] = llIIlIIIl[41];
            if (lIlIlIIlIlII(Bank.contains(iArr11) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[41], llIIlIIIl[1], C0004e.c(llIIlIIIl[74], llIIlIIIl[75])));
                "".length();
            }
            int[] iArr12 = new int[llIIlIIIl[1]];
            iArr12[llIIlIIIl[0]] = llIIlIIIl[39];
            if (lIlIlIIlIlII(Bank.contains(iArr12) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[39], llIIlIIIl[1], C0004e.c(llIIlIIIl[76], llIIlIIIl[77])));
                "".length();
            }
            int[] iArr13 = new int[llIIlIIIl[1]];
            iArr13[llIIlIIIl[0]] = llIIlIIIl[36];
            if (lIlIlIIlIlII(Bank.contains(iArr13) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[36], llIIlIIIl[1], C0004e.c(llIIlIIIl[76], llIIlIIIl[77])));
                "".length();
            }
            int[] iArr14 = new int[llIIlIIIl[1]];
            iArr14[llIIlIIIl[0]] = llIIlIIIl[37];
            if (lIlIlIIlIlII(Bank.contains(iArr14) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[37], llIIlIIIl[1], C0004e.c(llIIlIIIl[78], llIIlIIIl[79])));
                "".length();
            }
            int[] iArr15 = new int[llIIlIIIl[1]];
            iArr15[llIIlIIIl[0]] = llIIlIIIl[38];
            if (lIlIlIIlIlII(Bank.contains(iArr15) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[38], llIIlIIIl[1], C0004e.c(llIIlIIIl[80], llIIlIIIl[81])));
                "".length();
            }
            int[] iArr16 = new int[llIIlIIIl[1]];
            iArr16[llIIlIIIl[0]] = llIIlIIIl[40];
            if (lIlIlIIlIlII(Bank.contains(iArr16) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[40], llIIlIIIl[1], C0004e.c(llIIlIIIl[82], llIIlIIIl[83])));
                "".length();
            }
            int[] iArr17 = new int[llIIlIIIl[1]];
            iArr17[llIIlIIIl[0]] = llIIlIIIl[35];
            if (lIlIlIIlIlII(Bank.contains(iArr17) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[35], llIIlIIIl[1], C0004e.c(llIIlIIIl[84], llIIlIIIl[85])));
                "".length();
            }
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22])) {
            int[] iArr18 = new int[llIIlIIIl[1]];
            iArr18[llIIlIIIl[0]] = llIIlIIIl[19];
            if (lIlIlIIlIlII(Bank.contains(iArr18) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIIl[19], llIIlIIIl[1], llIIlIIIl[69]));
                "".length();
            }
        }
        int[] iArr19 = new int[llIIlIIIl[1]];
        iArr19[llIIlIIIl[0]] = llIIlIIIl[18];
        if (lIlIlIIlIlII(Bank.contains(iArr19) ? 1 : 0) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[48])) {
            bx.add(new C0003d(llIIlIIIl[18], llIIlIIIl[1], llIIlIIIl[71]));
            "".length();
        }
    }

    public static void aO() {
        if (lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[23]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[23]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[23]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[23]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[23]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[23]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[42]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[23]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[23]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[42]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[42]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[23]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[42]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[42]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[42]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[48]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[42]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[42]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[48]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[48]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[42]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[48]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[48]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[48]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[48]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[48]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[22]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[48]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[22]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[65]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[22]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[22]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[65]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[65]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[22]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[65]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[65]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[65]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[65]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[65]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIIll(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[65]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIlIlIIlIIll(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[4]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIlIl(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[2]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlIIlIlIl(Skills.getLevel(Skill.STRENGTH), llIIlIIIl[4]) && lIlIlIIlIlIl(Skills.getLevel(Skill.ATTACK), llIIlIIIl[2]) && lIlIlIIlIIll(Skills.getLevel(Skill.DEFENCE), llIIlIIIl[3]) && lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean lIlIlIIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIlIIllIII(int i) {
        return i < 0;
    }

    private static String lIlIlIIIIIII(String lIllIIlIllIIll, String lIllIIlIllIIlI) {
        String str = new String(Base64.getDecoder().decode(lIllIIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIlIllIIIl = new StringBuilder();
        char[] charArray = lIllIIlIllIIlI.toCharArray();
        int lIllIIlIlIllll = llIIlIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIl[0];
        while (lIlIlIIlIIll(i, length)) {
            char lIllIIlIlIIllI = charArray2[i];
            lIllIIlIllIIIl.append((char) (lIllIIlIlIIllI ^ charArray[lIllIIlIlIllll % charArray.length]));
            "".length();
            lIllIIlIlIllll++;
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(lIllIIlIllIIIl);
    }

    static {
        lIlIlIIIlllI();
        lIlIlIIIllIl();
        bx = new ArrayList();
        int[] iArr = new int[llIIlIIIl[21]];
        iArr[llIIlIIIl[0]] = llIIlIIIl[18];
        iArr[llIIlIIIl[1]] = llIIlIIIl[19];
        iArr[llIIlIIIl[5]] = llIIlIIIl[55];
        iArr[llIIlIIIl[6]] = llIIlIIIl[57];
        iArr[llIIlIIIl[8]] = llIIlIIIl[53];
        iArr[llIIlIIIl[12]] = llIIlIIIl[59];
        iArr[llIIlIIIl[16]] = llIIlIIIl[61];
        iArr[llIIlIIIl[17]] = llIIlIIIl[63];
        cM = iArr;
        int[] iArr2 = new int[llIIlIIIl[24]];
        iArr2[llIIlIIIl[0]] = llIIlIIIl[20];
        iArr2[llIIlIIIl[1]] = llIIlIIIl[35];
        iArr2[llIIlIIIl[5]] = llIIlIIIl[36];
        iArr2[llIIlIIIl[6]] = llIIlIIIl[37];
        iArr2[llIIlIIIl[8]] = llIIlIIIl[38];
        iArr2[llIIlIIIl[12]] = llIIlIIIl[39];
        iArr2[llIIlIIIl[16]] = llIIlIIIl[40];
        iArr2[llIIlIIIl[17]] = llIIlIIIl[63];
        iArr2[llIIlIIIl[21]] = llIIlIIIl[41];
        mf = iArr2;
        cN = new WorldArea(llIIlIIIl[88], llIIlIIIl[89], llIIlIIIl[25], llIIlIIIl[25], llIIlIIIl[0]);
        cO = new WorldArea(llIIlIIIl[90], llIIlIIIl[91], llIIlIIIl[43], llIIlIIIl[29], llIIlIIIl[0]);
        cP = new WorldArea(llIIlIIIl[92], llIIlIIIl[93], llIIlIIIl[94], llIIlIIIl[48], llIIlIIIl[0]);
        cQ = new WorldPoint(llIIlIIIl[95], llIIlIIIl[96], llIIlIIIl[0]);
        cm = new WorldPoint(llIIlIIIl[97], llIIlIIIl[89], llIIlIIIl[0]);
        cR = new WorldPoint(llIIlIIIl[98], llIIlIIIl[99], llIIlIIIl[0]);
    }

    private static boolean lIlIlIIlIllI(Object obj) {
        return obj != null;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aJ();
            "".length();
            if (0 != 0) {
                return (26 ^ 15) & ((104 ^ 125) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return llIIlIIIl[0];
    }
}
