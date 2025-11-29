package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.r  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/r.class */
public class C0017r implements G {
    static /* synthetic */ WorldArea co;
    private static /* synthetic */ String ct;
    static /* synthetic */ int ck;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint cr;
    static /* synthetic */ WorldPoint cq;
    private static /* synthetic */ String[] bR;
    static /* synthetic */ boolean cl;
    static /* synthetic */ WorldPoint cg;
    static /* synthetic */ WorldArea cp;
    private static /* synthetic */ String[] lIIIlllIll;
    private static /* synthetic */ int cs;
    static /* synthetic */ WorldArea cn;
    private static /* synthetic */ int[] lIIlIIIIII;
    public static /* synthetic */ List<C0003d> bv;

    private static void aF() {
        if (llllIlIIlIIl(new WorldArea(lIIlIIIIII[52], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] strArr = new String[lIIlIIIIII[0]];
            strArr[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[142]];
            TileObjects.getNearest(strArr).interact(lIIIlllIll[lIIlIIIIII[143]]);
            Time.sleepTicks(lIIlIIIIII[9]);
            "".length();
        }
        if (llllIlIIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
            AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[144]];
            if (llllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(cg);
            "".length();
            Time.sleepTicks(lIIlIIIIII[0]);
            "".length();
        }
        if (llllIlIIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
            C0006g.a(lIIIlllIll[lIIlIIIIII[145]], bR);
        }
        if (llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIIIIII[52], lIIlIIIIII[53], lIIlIIIIII[1])) ? 1 : 0)) {
            String[] strArr2 = new String[lIIlIIIIII[0]];
            strArr2[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[99]];
            TileObjects.getNearest(strArr2).interact(lIIIlllIll[lIIlIIIIII[146]]);
            Time.sleepTicks(lIIlIIIIII[9]);
            "".length();
        }
    }

    private static boolean llllIlIIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIlIIIIII[20]];
        iArr[lIIlIIIIII[1]] = lIIlIIIIII[36];
        iArr[lIIlIIIIII[0]] = lIIlIIIIII[37];
        iArr[lIIlIIIIII[9]] = lIIlIIIIII[34];
        iArr[lIIlIIIIII[11]] = lIIlIIIIII[40];
        iArr[lIIlIIIIII[13]] = lIIlIIIIII[41];
        iArr[lIIlIIIIII[8]] = lIIlIIIIII[30];
        iArr[lIIlIIIIII[16]] = lIIlIIIIII[31];
        int i = lIIlIIIIII[1];
        while (llllIlIIlIlI(i, iArr.length)) {
            int[] iArr2 = new int[lIIlIIIIII[0]];
            iArr2[lIIlIIIIII[1]] = iArr[i];
            if (llllIlIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlIIIIII[1];
            }
            i++;
            "".length();
            if (" ".length() < 0) {
                return ((((32 + 110) - (-32)) + 10) ^ (((105 + 119) - 130) + 65)) & (((13 ^ 117) ^ (213 ^ 138)) ^ (-" ".length()));
            }
        }
        return lIIlIIIIII[0];
    }

    private static boolean llllIlIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static void llllIlIIIlll() {
        lIIlIIIIII = new int[182];
        lIIlIIIIII[0] = " ".length();
        lIIlIIIIII[1] = ((((55 + 81) - 109) + 106) ^ (((63 + 26) - 32) + 79)) & (((95 ^ 107) ^ (146 ^ 171)) ^ (-" ".length()));
        lIIlIIIIII[2] = ((86 + 120) - 68) + 102;
        lIIlIIIIII[3] = 86 ^ 23;
        lIIlIIIIII[4] = (87 ^ 31) ^ (23 ^ 85);
        lIIlIIIIII[5] = (-((-18359) & 28663)) & (-5249) & 15854;
        lIIlIIIIII[6] = ((15 ^ 1) & ((56 ^ 54) ^ (-1))) ^ (90 ^ 102);
        lIIlIIIIII[7] = (-129) & 435;
        lIIlIIIIII[8] = 135 ^ 130;
        lIIlIIIIII[9] = "  ".length();
        lIIlIIIIII[10] = (78 ^ 80) ^ (67 ^ 125);
        lIIlIIIIII[11] = "   ".length();
        lIIlIIIIII[12] = 107 ^ 120;
        lIIlIIIIII[13] = (84 ^ 22) ^ (248 ^ 190);
        lIIlIIIIII[14] = (((118 + 131) - 165) + 56) ^ (((50 + 36) - 54) + 143);
        lIIlIIIIII[15] = 50 ^ 0;
        lIIlIIIIII[16] = 71 ^ 65;
        lIIlIIIIII[17] = (-18446) & 19455;
        lIIlIIIIII[18] = (-((-1074) & 18421)) & (-9249) & 28671;
        lIIlIIIIII[19] = 69 ^ 76;
        lIIlIIIIII[20] = (52 ^ 110) ^ (248 ^ 165);
        lIIlIIIIII[21] = (((130 + 119) - 102) + 13) ^ (((120 + 30) - 97) + 115);
        lIIlIIIIII[22] = 163 ^ 139;
        lIIlIIIIII[23] = (((44 + 43) - (-84)) + 1) ^ (((150 + 90) - 208) + 135);
        lIIlIIIIII[24] = 206 ^ 194;
        lIIlIIIIII[25] = (94 ^ 36) ^ (37 ^ 82);
        lIIlIIIIII[26] = 24 ^ 22;
        lIIlIIIIII[27] = (-((-4239) & 15615)) & (-8) & 16383;
        lIIlIIIIII[28] = 155 ^ 148;
        lIIlIIIIII[29] = (-20597) & 22527;
        lIIlIIIIII[30] = (-12353) & 31967;
        lIIlIIIIII[31] = (-4699) & 24319;
        lIIlIIIIII[32] = (-13409) & 13934;
        lIIlIIIIII[33] = (-((-267) & 5083)) & (-9217) & 16383;
        lIIlIIIIII[34] = (-((-13333) & 15549)) & (-5) & 14845;
        lIIlIIIIII[35] = 130 ^ 146;
        lIIlIIIIII[36] = (-((-19389) & 27581)) & (-16425) & 32623;
        lIIlIIIIII[37] = (-((-5059) & 29683)) & (-641) & 26619;
        lIIlIIIIII[38] = (-9729) & 12075;
        lIIlIIIIII[39] = (-22801) & 24543;
        lIIlIIIIII[40] = (-((-11814) & 32559)) & (-2049) & 24511;
        lIIlIIIIII[41] = (-17104) & 27599;
        lIIlIIIIII[42] = 70 ^ 87;
        lIIlIIIIII[43] = (-16421) & 24430;
        lIIlIIIIII[44] = (-20933) & 21484;
        lIIlIIIIII[45] = (-12293) & 13287;
        lIIlIIIIII[46] = 51 ^ 33;
        lIIlIIIIII[47] = 153 ^ 129;
        lIIlIIIIII[48] = 211 ^ 199;
        lIIlIIIIII[49] = 29 ^ 8;
        lIIlIIIIII[50] = (((130 + 127) - 165) + 80) ^ (((173 + 185) - 214) + 42);
        lIIlIIIIII[51] = 96 ^ 119;
        lIIlIIIIII[52] = (-((-2433) & 31719)) & (-257) & 32639;
        lIIlIIIIII[53] = (-4102) & 7461;
        lIIlIIIIII[54] = (79 ^ 37) ^ (121 ^ 10);
        lIIlIIIIII[55] = 183 ^ 173;
        lIIlIIIIII[56] = (-(((131 + 117) - 149) + 67)) & (-12289) & 15807;
        lIIlIIIIII[57] = (((105 + 13) - (-8)) + 55) ^ (((84 + 64) - 124) + 150);
        lIIlIIIIII[58] = (((58 + 24) - 14) + 105) ^ (((41 + 153) - 72) + 55);
        lIIlIIIIII[59] = (228 ^ 128) ^ (114 ^ 11);
        lIIlIIIIII[60] = (-((-21013) & 31574)) & (-9) & 14847;
        lIIlIIIIII[61] = (-16547) & 20211;
        lIIlIIIIII[62] = (-12801) & 16319;
        lIIlIIIIII[63] = (-((-8347) & 27547)) & (-1) & 23486;
        lIIlIIIIII[64] = 150 ^ 136;
        lIIlIIIIII[65] = (226 ^ 137) ^ (12 ^ 120);
        lIIlIIIIII[66] = 143 ^ 174;
        lIIlIIIIII[67] = 41 ^ 11;
        lIIlIIIIII[68] = (21 ^ 84) ^ (115 ^ 22);
        lIIlIIIIII[69] = (10 ^ 122) ^ (85 ^ 0);
        lIIlIIIIII[70] = (37 ^ 20) ^ (184 ^ 175);
        lIIlIIIIII[71] = 29 ^ 58;
        lIIlIIIIII[72] = (((35 + 71) - 35) + 65) ^ (((100 + 129) - 87) + 19);
        lIIlIIIIII[73] = (-2873) & 61372;
        lIIlIIIIII[74] = (-154) & 63453;
        lIIlIIIIII[75] = (((99 + 209) - 136) + 61) ^ (((58 + 115) - 22) + 44);
        lIIlIIIIII[76] = ((43 ^ 14) & ((163 ^ 134) ^ (-1))) ^ (50 ^ 25);
        lIIlIIIIII[77] = 96 ^ 76;
        lIIlIIIIII[78] = 29 ^ 48;
        lIIlIIIIII[79] = (2 ^ 93) ^ (239 ^ 158);
        lIIlIIIIII[80] = 16 ^ 63;
        lIIlIIIIII[81] = (161 ^ 199) ^ (13 ^ 91);
        lIIlIIIIII[82] = 42 ^ 27;
        lIIlIIIIII[83] = (-3) & 1927;
        lIIlIIIIII[84] = (((117 + 149) - 151) + 37) ^ (((150 + 139) - 259) + 141);
        lIIlIIIIII[85] = (33 ^ 3) ^ (55 ^ 33);
        lIIlIIIIII[86] = 53 ^ 0;
        lIIlIIIIII[87] = 177 ^ 135;
        lIIlIIIIII[88] = (((100 + 50) - 22) + 23) ^ (((51 + 58) - (-29)) + 22);
        lIIlIIIIII[89] = 240 ^ 182;
        lIIlIIIIII[90] = 113 ^ 56;
        lIIlIIIIII[91] = (-((-12445) & 29374)) & (-8209) & 28599;
        lIIlIIIIII[92] = (-20489) & 24047;
        lIIlIIIIII[93] = (44 ^ 126) ^ (59 ^ 81);
        lIIlIIIIII[94] = 54 ^ 15;
        lIIlIIIIII[95] = (112 ^ 126) ^ (203 ^ 137);
        lIIlIIIIII[96] = 112 ^ 74;
        lIIlIIIIII[97] = (94 ^ 2) ^ (95 ^ 83);
        lIIlIIIIII[98] = 24 ^ 35;
        lIIlIIIIII[99] = (((206 + 68) - 207) + 142) ^ (((135 + 46) - 134) + 92);
        lIIlIIIIII[100] = (254 ^ 138) ^ (18 ^ 2);
        lIIlIIIIII[101] = 135 ^ 186;
        lIIlIIIIII[102] = (13 ^ 61) ^ (118 ^ 120);
        lIIlIIIIII[103] = (-12467) & 16319;
        lIIlIIIIII[104] = 18 ^ 45;
        lIIlIIIIII[105] = 10 ^ 114;
        lIIlIIIIII[106] = ((59 + 126) - 148) + 93;
        lIIlIIIIII[107] = 237 ^ 173;
        lIIlIIIIII[108] = (((84 ^ 37) + (((115 + 24) - 101) + 92)) - (117 ^ 7)) + (39 ^ 44);
        lIIlIIIIII[109] = (86 ^ 18) ^ (191 ^ 185);
        lIIlIIIIII[110] = (-20495) & 23471;
        lIIlIIIIII[111] = (-((-3559) & 28655)) & (-4417) & 32751;
        lIIlIIIIII[112] = (-8211) & 11450;
        lIIlIIIIII[113] = (109 ^ 76) ^ (219 ^ 185);
        lIIlIIIIII[114] = (160 ^ 138) ^ (101 ^ 11);
        lIIlIIIIII[115] = 223 ^ 154;
        lIIlIIIIII[116] = ((65 + 82) - 40) + 43;
        lIIlIIIIII[117] = (-((-10289) & 15227)) & (-17) & 8063;
        lIIlIIIIII[118] = (-((-4563) & 12791)) & (-20682) & 32255;
        lIIlIIIIII[119] = 27 ^ 92;
        lIIlIIIIII[120] = 141 ^ 197;
        lIIlIIIIII[121] = ((120 + 80) - 144) + 104;
        lIIlIIIIII[122] = (((93 ^ 7) + (((25 + 154) - 139) + 120)) - (((133 + 62) - 45) + 61)) + ((16 + 36) - (-23)) + 56;
        lIIlIIIIII[123] = (-4105) & 7035;
        lIIlIIIIII[124] = (-((-18504) & 22607)) & (-8225) & 15863;
        lIIlIIIIII[125] = 54 ^ 124;
        lIIlIIIIII[126] = 17 ^ 90;
        lIIlIIIIII[127] = (((((111 + 90) - 172) + 118) + (((90 + 150) - 185) + 123)) - ((-2225) & 2547)) + ((126 + 143) - 247) + 156;
        lIIlIIIIII[128] = " ".length() ^ (52 ^ 120);
        lIIlIIIIII[129] = 30 ^ 80;
        lIIlIIIIII[130] = (((127 + 20) - 45) + 101) ^ (((31 + 104) - 120) + 117);
        lIIlIIIIII[131] = ((25 + 109) - 106) + 162;
        lIIlIIIIII[132] = (((67 ^ 36) + (0 ^ 13)) - (223 ^ 179)) + ((173 + 174) - 214) + 59;
        lIIlIIIIII[133] = (-((-17812) & 32151)) & (-16405) & 31223;
        lIIlIIIIII[134] = 11 ^ 90;
        lIIlIIIIII[135] = 242 ^ 160;
        lIIlIIIIII[136] = (((115 ^ 84) + (38 ^ 17)) - (-(123 ^ 38))) + (41 ^ 62);
        lIIlIIIIII[137] = (((((62 + 51) - 10) + 31) + (177 ^ 151)) - (100 ^ 91)) + (74 ^ 37);
        lIIlIIIIII[138] = 16 ^ 67;
        lIIlIIIIII[139] = 86 ^ 2;
        lIIlIIIIII[140] = 121 ^ 44;
        lIIlIIIIII[141] = (((198 ^ 136) + (((136 + 174) - 215) + 115)) - (((63 + 28) - 3) + 84)) + (223 ^ 173);
        lIIlIIIIII[142] = (((3 + 7) - (-89)) + 102) ^ (((60 + 49) - (-12)) + 38);
        lIIlIIIIII[143] = 7 ^ 80;
        lIIlIIIIII[144] = (((53 + 119) - 59) + 115) ^ (((22 + 55) - (-65)) + 46);
        lIIlIIIIII[145] = (109 ^ 13) ^ (149 ^ 172);
        lIIlIIIIII[146] = 34 ^ 121;
        lIIlIIIIII[147] = (-18567) & 19966;
        lIIlIIIIII[148] = (-((-10769) & 15254)) & (-24627) & 30711;
        lIIlIIIIII[149] = (-((-12331) & 14766)) & (-533) & 12287;
        lIIlIIIIII[150] = (-((-2065) & 27796)) & (-37) & 32767;
        lIIlIIIIII[151] = (-((-27787) & 31919)) & (-8201) & 14332;
        lIIlIIIIII[152] = (-((-4137) & 14441)) & (-1) & 15854;
        lIIlIIIIII[153] = (-3) & 26562;
        lIIlIIIIII[154] = (-31747) & 32746;
        lIIlIIIIII[155] = (-((-355) & 21347)) & (-129) & 24575;
        lIIlIIIIII[156] = (-(142 ^ 170)) & (-4369) & 16383;
        lIIlIIIIII[157] = (-7687) & 32686;
        lIIlIIIIII[158] = (-673) & 1972;
        lIIlIIIIII[159] = (152 ^ 160) ^ (15 ^ 107);
        lIIlIIIIII[160] = (164 ^ 156) ^ (162 ^ 199);
        lIIlIIIIII[161] = 26 ^ 68;
        lIIlIIIIII[162] = 33 ^ 126;
        lIIlIIIIII[163] = (-13225) & 16315;
        lIIlIIIIII[164] = (-((-2371) & 31699)) & (-1) & 32765;
        lIIlIIIIII[165] = (-((-16517) & 29335)) & (-65) & 16383;
        lIIlIIIIII[166] = (((154 ^ 143) + (164 ^ 175)) - (-(91 ^ 35))) + (238 ^ 137);
        lIIlIIIIII[167] = (-((-1829) & 22509)) & (-33) & 23805;
        lIIlIIIIII[168] = (-((-13835) & 30411)) & (-1) & 19934;
        lIIlIIIIII[169] = (-((-23479) & 24503)) & (-24851) & 28671;
        lIIlIIIIII[170] = (-16514) & 19927;
        lIIlIIIIII[171] = (-((-18481) & 31097)) & (-1) & 16236;
        lIIlIIIIII[172] = (-16913) & 20439;
        lIIlIIIIII[173] = 9 ^ 105;
        lIIlIIIIII[174] = 236 ^ 141;
        lIIlIIIIII[175] = 51 ^ 81;
        lIIlIIIIII[176] = 14 ^ 109;
        lIIlIIIIII[177] = (220 ^ 141) ^ (73 ^ 125);
        lIIlIIIIII[178] = (49 ^ 57) ^ (243 ^ 157);
        lIIlIIIIII[179] = 33 ^ 70;
        lIIlIIIIII[180] = 193 ^ 169;
        lIIlIIIIII[181] = 199 ^ 174;
    }

    private static void llllIIllIlII() {
        lIIIlllIll = new String[lIIlIIIIII[181]];
        lIIIlllIll[lIIlIIIIII[1]] = llllIIlIIIII("KPVfg5/q3iqFWGFxjdhIh1o56uU6HOlrttXYlKXPErqbGJyYKB6Ckn6+aGzF8F8/", "BvdKV");
        lIIIlllIll[lIIlIIIIII[0]] = llllIIlIIIII("opK84QlKO0hfJu4Vs6KbVQ==", "tjrMo");
        lIIIlllIll[lIIlIIIIII[9]] = llllIIlIIIIl("KXDavpNM/kxpjQXx0zG9tA==", "wFRxp");
        lIIIlllIll[lIIlIIIIII[11]] = llllIIlIIIlI("HzM9DwUuYScCE3oCOwMVMSQ9", "ZASjv");
        lIIIlllIll[lIIlIIIIII[13]] = llllIIlIIIII("YhqawKdfLG8GwZxi84Si9A==", "IgcVq");
        lIIIlllIll[lIIlIIIIII[8]] = llllIIlIIIlI("BwUFMyolHh4+Jzc=", "PjjWI");
        lIIIlllIll[lIIlIIIIII[16]] = llllIIlIIIII("OmrU5NRslE4UEIZJ/AMj9w==", "mRRUs");
        lIIIlllIll[lIIlIIIIII[20]] = llllIIlIIIII("D/5HScgJH3BU5PVcVq6U0w==", "BKciz");
        lIIIlllIll[lIIlIIIIII[21]] = llllIIlIIIII("T9eMEK4tC6qWh6g3u9eI2A==", "eBzrf");
        lIIIlllIll[lIIlIIIIII[19]] = llllIIlIIIIl("B4tMn2/EyjdkA8YsP0gExw==", "JBTUQ");
        lIIIlllIll[lIIlIIIIII[4]] = llllIIlIIIII("D4VfAST4RxPzbDib1yYK2w==", "sybhp");
        lIIIlllIll[lIIlIIIIII[23]] = llllIIlIIIlI("EScNIycmawsgaRkkETQsPC8=", "RKdFI");
        lIIIlllIll[lIIlIIIIII[24]] = llllIIlIIIIl("CSM2dhcaGlrz62pjIZpb/Q==", "EGzeL");
        lIIIlllIll[lIIlIIIIII[25]] = llllIIlIIIIl("19DJM/zfcf0=", "kMOuB");
        lIIIlllIll[lIIlIIIIII[26]] = llllIIlIIIlI("IzsFZB8CehElBQY=", "mZsDk");
        lIIIlllIll[lIIlIIIIII[28]] = llllIIlIIIII("rJL7LXmElqxOSKnCc4WmKUrDfvFoF+Eo", "Bhxdj");
        lIIIlllIll[lIIlIIIIII[35]] = llllIIlIIIlI("FD1OMR0meAM5HDAxADdPMi0LIxtjKxsgHy8xCyNDYysZORsgMAc+CGMsAXAtFgEnHig=", "CXnPo");
        lIIIlllIll[lIIlIIIIII[42]] = llllIIlIIIlI("JgFzBzMURD4PMgINPQFhABE2FTVRFyYWMR0NNhVtURckDzUSDDoIJlEQPEYDJD0aKAY=", "qdSfA");
        lIIIlllIll[lIIlIIIIII[46]] = llllIIlIIIII("emB3He8QAuw=", "tNoko");
        lIIIlllIll[lIIlIIIIII[12]] = llllIIlIIIII("x69/cUcZyfA=", "TJHzz");
        lIIIlllIll[lIIlIIIIII[48]] = llllIIlIIIII("UsuA7vk5mBA=", "BLvZa");
        lIIIlllIll[lIIlIIIIII[49]] = llllIIlIIIIl("i8rqk/9+h4I=", "xtIAf");
        lIIIlllIll[lIIlIIIIII[50]] = llllIIlIIIII("/kFuqzWakKs=", "wncvY");
        lIIIlllIll[lIIlIIIIII[51]] = llllIIlIIIlI("FAMUdTM1QhEhJigW", "ZbbUG");
        lIIIlllIll[lIIlIIIIII[47]] = llllIIlIIIII("Lc/d+fxDej8=", "iBMzK");
        lIIIlllIll[lIIlIIIIII[54]] = llllIIlIIIII("80eG7+kBIz6539XLDQwkyw==", "DpJtR");
        lIIIlllIll[lIIlIIIIII[55]] = llllIIlIIIIl("81K7q4c2tOw=", "fbPwo");
        lIIIlllIll[lIIlIIIIII[57]] = llllIIlIIIlI("Ehg7LwwxBDE=", "PwTDo");
        lIIIlllIll[lIIlIIIIII[58]] = llllIIlIIIII("nFFSb9rBwoU=", "OQEBD");
        lIIIlllIll[lIIlIIIIII[59]] = llllIIlIIIIl("0vMJjJhW6JI=", "wHhuw");
        lIIIlllIll[lIIlIIIIII[64]] = llllIIlIIIIl("k1z2W8WOHxnoJ7OCzqbjSQ==", "cKvde");
        lIIIlllIll[lIIlIIIIII[65]] = llllIIlIIIIl("F9ZS60EbpMqYfTZnHOKk7vakvVygtoCu", "MKjVl");
        lIIIlllIll[lIIlIIIIII[10]] = llllIIlIIIlI("DQc1ChU=", "YuTnp");
        lIIIlllIll[lIIlIIIIII[66]] = llllIIlIIIII("D1t6FZWkMdw=", "JiSlx");
        lIIIlllIll[lIIlIIIIII[67]] = llllIIlIIIII("0Cr2Byse+gHsGdMCVnlEdw==", "GblXJ");
        lIIIlllIll[lIIlIIIIII[14]] = llllIIlIIIlI("AQ0fPxI=", "CbqZa");
        lIIIlllIll[lIIlIIIIII[68]] = llllIIlIIIlI("Fx8kPiEnCjYy", "DkEWS");
        lIIIlllIll[lIIlIIIIII[69]] = llllIIlIIIlI("JSgeFTpLMQc=", "fDwxX");
        lIIIlllIll[lIIlIIIIII[70]] = llllIIlIIIII("JYf7gbj1VG8=", "sVWHi");
        lIIIlllIll[lIIlIIIIII[71]] = llllIIlIIIII("qjw+kJ4MgXE=", "mplMk");
        lIIIlllIll[lIIlIIIIII[22]] = llllIIlIIIII("MID2vaz1Ztc=", "WUuwN");
        lIIIlllIll[lIIlIIIIII[72]] = llllIIlIIIIl("KpzMynnhp0U=", "JwuYC");
        lIIIlllIll[lIIlIIIIII[75]] = llllIIlIIIII("9KDiKxu0KqI=", "Qklwi");
        lIIIlllIll[lIIlIIIIII[76]] = llllIIlIIIII("BbgPYAgaU5Lhi/nV3qK4XQ==", "SGHoW");
        lIIIlllIll[lIIlIIIIII[77]] = llllIIlIIIIl("nPFxLq5Zka0wC1TjJ96W2w==", "OIQSe");
        lIIIlllIll[lIIlIIIIII[78]] = llllIIlIIIIl("7WzuQZ5Mg8DLzoJ/OTtMEA==", "aGROO");
        lIIIlllIll[lIIlIIIIII[79]] = llllIIlIIIIl("bl0abuPjIUpEDV2NDdD9YQ==", "OHjKE");
        lIIIlllIll[lIIlIIIIII[80]] = llllIIlIIIIl("M+ACQPbk/go=", "wIGUh");
        lIIIlllIll[lIIlIIIIII[81]] = llllIIlIIIIl("hwLixhs/TJfXPzhq8VXaKg==", "JKtco");
        lIIIlllIll[lIIlIIIIII[82]] = llllIIlIIIIl("Y0FQvVee+GcoDauFwjg2uA==", "Pqakd");
        lIIIlllIll[lIIlIIIIII[15]] = llllIIlIIIIl("XgqSCjlHC04=", "LSVpm");
        lIIIlllIll[lIIlIIIIII[84]] = llllIIlIIIIl("22+4SU9r6zE=", "QiNan");
        lIIIlllIll[lIIlIIIIII[85]] = llllIIlIIIIl("aTknF7mrPIA=", "ZZSMg");
        lIIIlllIll[lIIlIIIIII[86]] = llllIIlIIIIl("NcH9anA2ca0=", "tCRUp");
        lIIIlllIll[lIIlIIIIII[87]] = llllIIlIIIlI("JCsNOQcFJw==", "iJaZh");
        lIIIlllIll[lIIlIIIIII[88]] = llllIIlIIIII("7ToG9jYqCn0=", "wPDPv");
        lIIIlllIll[lIIlIIIIII[93]] = llllIIlIIIlI("KiIkZhoLYzE0AQom", "dCRFn");
        lIIIlllIll[lIIlIIIIII[94]] = llllIIlIIIIl("x+zS4jmClsxa59obndtQUg==", "rlBgZ");
        lIIIlllIll[lIIlIIIIII[96]] = llllIIlIIIII("38gbcb+i1nc=", "gRkhS");
        lIIIlllIll[lIIlIIIIII[98]] = llllIIlIIIII("czEgNJ/R/TU=", "BzVWA");
        lIIIlllIll[lIIlIIIIII[6]] = llllIIlIIIIl("RMqvndFNjIU=", "MvJMY");
        lIIIlllIll[lIIlIIIIII[101]] = llllIIlIIIII("pxMzBa+C8eTb9kzjQZjxGw==", "niwOX");
        lIIIlllIll[lIIlIIIIII[102]] = llllIIlIIIIl("jIKTPW6K5/LT4VCQ5BmyzQ==", "ZLAzR");
        lIIIlllIll[lIIlIIIIII[104]] = llllIIlIIIlI("IzsCAUMIKB8=", "jImoc");
        lIIIlllIll[lIIlIIIIII[107]] = llllIIlIIIII("+5GRe2wjQhY=", "ogWsD");
        lIIIlllIll[lIIlIIIIII[3]] = llllIIlIIIII("56EGdF8jhjA=", "wlscR");
        lIIIlllIll[lIIlIIIIII[109]] = llllIIlIIIII("wiyUGBxPbHXE5Z3EUXzk/g==", "rcKjr");
        lIIIlllIll[lIIlIIIIII[113]] = llllIIlIIIII("8xbpRYcRmEhhC95yjHcKow==", "kfNiD");
        lIIIlllIll[lIIlIIIIII[114]] = llllIIlIIIlI("DDY5Lig2", "DWTCM");
        lIIIlllIll[lIIlIIIIII[115]] = llllIIlIIIII("Ox5m0KhFAdXu/dcAi0ELVA==", "gFaQs");
        lIIIlllIll[lIIlIIIIII[89]] = llllIIlIIIlI("EyoIUzgwLBQWIQ==", "QKzsU");
        lIIIlllIll[lIIlIIIIII[119]] = llllIIlIIIII("7GEaoh/xANCL3LKos0CT3A==", "UbcaL");
        lIIIlllIll[lIIlIIIIII[120]] = llllIIlIIIIl("gaJbATtD2S4=", "exeYp");
        lIIIlllIll[lIIlIIIIII[90]] = llllIIlIIIII("UNooK5GrwXE=", "rqpHO");
        lIIIlllIll[lIIlIIIIII[125]] = llllIIlIIIII("R1x+DOxM2CmOgudGo3v7xA==", "gKCgv");
        lIIIlllIll[lIIlIIIIII[126]] = llllIIlIIIIl("zBzNPXVIZvQ=", "PIWkL");
        lIIIlllIll[lIIlIIIIII[95]] = llllIIlIIIlI("IjwrBgEa", "vIYgd");
        lIIIlllIll[lIIlIIIIII[128]] = llllIIlIIIII("5Ja0k8g6gc4TcvHdy9JCYA==", "jnDmk");
        lIIIlllIll[lIIlIIIIII[129]] = llllIIlIIIIl("c/UbX03ziiHD5AEitd3srw==", "HPfzD");
        lIIIlllIll[lIIlIIIIII[130]] = llllIIlIIIIl("SOermXoRhA4=", "aldTt");
        lIIIlllIll[lIIlIIIIII[97]] = llllIIlIIIIl("VUGatWrmWvCczuIVhzDjMA==", "ZWdVT");
        lIIIlllIll[lIIlIIIIII[134]] = llllIIlIIIIl("uMfB2qCECnUhAQFbcTb2GA==", "TLqhl");
        lIIIlllIll[lIIlIIIIII[135]] = llllIIlIIIIl("AwgNF4BN/FOo1xeAyFLxiw==", "TkIws");
        lIIIlllIll[lIIlIIIIII[138]] = llllIIlIIIlI("D2gCLTk6LQAi", "NHrLM");
        lIIIlllIll[lIIlIIIIII[139]] = llllIIlIIIIl("KhvL8tV+uincv4jeevtYrw==", "Bcqrq");
        lIIIlllIll[lIIlIIIIII[140]] = llllIIlIIIII("jP/QfxfhTAf6/zhdlSDSgA==", "rJXtU");
        lIIIlllIll[lIIlIIIIII[142]] = llllIIlIIIlI("JD0ILwAHIQI=", "fRgDc");
        lIIIlllIll[lIIlIIIIII[143]] = llllIIlIIIIl("33RehR3ocvk=", "QZMVU");
        lIIIlllIll[lIIlIIIIII[144]] = llllIIlIIIIl("ztNfszduQdB8nbKWPunPig==", "xkqGN");
        lIIIlllIll[lIIlIIIIII[145]] = llllIIlIIIIl("OuOshWK1tdc=", "koGcN");
        lIIIlllIll[lIIlIIIIII[99]] = llllIIlIIIIl("EYRHdjBJgjIqSZXYV64TCQ==", "XivgB");
        lIIIlllIll[lIIlIIIIII[146]] = llllIIlIIIIl("CgPfe4MwtOc=", "gcOhr");
        lIIIlllIll[lIIlIIIIII[159]] = llllIIlIIIII("kLedPdlz+sw=", "bhYTU");
        lIIIlllIll[lIIlIIIIII[160]] = llllIIlIIIlI("Ixs5NyAOVR07JgwQJDMyDw==", "buPZA");
        lIIIlllIll[lIIlIIIIII[161]] = llllIIlIIIII("Zl/E/MvpAKWRhYTtS1Ef4ZZj7TZa0vA9", "PlDQk");
        lIIIlllIll[lIIlIIIIII[162]] = llllIIlIIIII("e8pHrSRN15Q=", "ZIKYO");
        lIIIlllIll[lIIlIIIIII[173]] = llllIIlIIIIl("guLqiazPO/E=", "gkzKa");
        lIIIlllIll[lIIlIIIIII[174]] = llllIIlIIIII("Kv3dh7V5kLRFPDh6PezpVmfSVsf3+T8K", "USFvw");
        lIIIlllIll[lIIlIIIIII[175]] = llllIIlIIIII("ifBb9W6bL0APhutoyCxGUPCq34CI/OfWTNqos0GP+WE0nh2Lr8qWvhRCGGviMuNw", "SCtmk");
        lIIIlllIll[lIIlIIIIII[176]] = llllIIlIIIlI("DCEmOxVvB3M1BDZuJz8ePCtzNBkmLTgyHzxuPTgGY24nPxQhcQ==", "ONSWq");
        lIIIlllIll[lIIlIIIIII[100]] = llllIIlIIIIl("SIasVtJxQnf+lSD6xrBokjI9xTrvYx6K", "LajzX");
        lIIIlllIll[lIIlIIIIII[177]] = llllIIlIIIIl("HTd5KjqgN8bV9dv+QtphBh7l1PgDl5PU", "ptBuT");
        lIIIlllIll[lIIlIIIIII[178]] = llllIIlIIIlI("CQk1Jj5tTBBtPGEEPDg0YQ07JSQ1TC0iPjIJeT4jJAkqajAmDTAkfw==", "AlYJQ");
        lIIIlllIll[lIIlIIIIII[179]] = llllIIlIIIlI("OX4HYRUfLwZhFh48T2ENGDgNKgpe", "pYcAy");
        lIIIlllIll[lIIlIIIIII[180]] = llllIIlIIIII("P+8fwxVlSVs=", "yxhUb");
    }

    private static boolean llllIlIIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[16]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0179, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[28]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x028f, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[13]) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0318, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[8]) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[8]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x058d, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[13]) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[4]) != false) goto L81;
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
    private static void af() {
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
        int[] iArr14 = new int[lIIlIIIIII[0]];
        iArr14[lIIlIIIIII[1]] = lIIlIIIIII[43];
        if (llllIlIIlIIl(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIIlIIIIII[0]];
            iArr15[lIIlIIIIII[1]] = lIIlIIIIII[43];
            if (llllIlIIlIIl(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIlIIIIII[0]];
                iArr16[lIIlIIIIII[1]] = lIIlIIIIII[43];
            }
            iArr = new int[lIIlIIIIII[0]];
            iArr[lIIlIIIIII[1]] = lIIlIIIIII[30];
            if (llllIlIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIIIIII[0]];
                iArr17[lIIlIIIIII[1]] = lIIlIIIIII[30];
                if (llllIlIIlIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIlIIIIII[0]];
                    iArr18[lIIlIIIIII[1]] = lIIlIIIIII[30];
                }
                iArr2 = new int[lIIlIIIIII[0]];
                iArr2[lIIlIIIIII[1]] = lIIlIIIIII[31];
                if (llllIlIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr19 = new int[lIIlIIIIII[0]];
                    iArr19[lIIlIIIIII[1]] = lIIlIIIIII[31];
                    if (llllIlIIlIIl(Bank.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lIIlIIIIII[0]];
                        iArr20[lIIlIIIIII[1]] = lIIlIIIIII[31];
                    }
                    iArr3 = new int[lIIlIIIIII[0]];
                    iArr3[lIIlIIIIII[1]] = lIIlIIIIII[103];
                    if (llllIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                        bv.add(new C0003d(lIIlIIIIII[103], lIIlIIIIII[8], lIIlIIIIII[151]));
                        "".length();
                    }
                    iArr4 = new int[lIIlIIIIII[0]];
                    iArr4[lIIlIIIIII[1]] = lIIlIIIIII[37];
                    if (llllIlIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                        bv.add(new C0003d(lIIlIIIIII[37], lIIlIIIIII[0], lIIlIIIIII[27]));
                        "".length();
                    }
                    iArr5 = new int[lIIlIIIIII[0]];
                    iArr5[lIIlIIIIII[1]] = lIIlIIIIII[32];
                    if (llllIlIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr21 = new int[lIIlIIIIII[0]];
                        iArr21[lIIlIIIIII[1]] = lIIlIIIIII[32];
                        if (llllIlIIlIIl(Bank.contains(iArr21) ? 1 : 0)) {
                            int[] iArr22 = new int[lIIlIIIIII[0]];
                            iArr22[lIIlIIIIII[1]] = lIIlIIIIII[32];
                        }
                        iArr6 = new int[lIIlIIIIII[0]];
                        iArr6[lIIlIIIIII[1]] = lIIlIIIIII[33];
                        if (llllIlIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr23 = new int[lIIlIIIIII[0]];
                            iArr23[lIIlIIIIII[1]] = lIIlIIIIII[33];
                            if (llllIlIIlIIl(Bank.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[lIIlIIIIII[0]];
                                iArr24[lIIlIIIIII[1]] = lIIlIIIIII[33];
                            }
                            iArr7 = new int[lIIlIIIIII[0]];
                            iArr7[lIIlIIIIII[1]] = lIIlIIIIII[29];
                            if (llllIlIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr25 = new int[lIIlIIIIII[0]];
                                iArr25[lIIlIIIIII[1]] = lIIlIIIIII[29];
                                if (llllIlIIlIIl(Bank.contains(iArr25) ? 1 : 0)) {
                                    int[] iArr26 = new int[lIIlIIIIII[0]];
                                    iArr26[lIIlIIIIII[1]] = lIIlIIIIII[29];
                                }
                                iArr8 = new int[lIIlIIIIII[0]];
                                iArr8[lIIlIIIIII[1]] = lIIlIIIIII[39];
                                if (llllIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIlIIIIII[39], lIIlIIIIII[0], lIIlIIIIII[27]));
                                    "".length();
                                }
                                iArr9 = new int[lIIlIIIIII[0]];
                                iArr9[lIIlIIIIII[1]] = lIIlIIIIII[38];
                                if (llllIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIlIIIIII[38], lIIlIIIIII[0], lIIlIIIIII[27]));
                                    "".length();
                                }
                                iArr10 = new int[lIIlIIIIII[0]];
                                iArr10[lIIlIIIIII[1]] = lIIlIIIIII[40];
                                if (llllIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIlIIIIII[40], lIIlIIIIII[0], lIIlIIIIII[152]));
                                    "".length();
                                }
                                iArr11 = new int[lIIlIIIIII[0]];
                                iArr11[lIIlIIIIII[1]] = lIIlIIIIII[41];
                                if (llllIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIlIIIIII[41], lIIlIIIIII[0], lIIlIIIIII[153] + C0004e.c(lIIlIIIIII[154], lIIlIIIIII[155])));
                                    "".length();
                                }
                                if (llllIlIIlIll(Bank.contains(item -> {
                                    return item.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]);
                                }) ? 1 : 0)) {
                                    bv.add(new C0003d(lIIlIIIIII[156], lIIlIIIIII[8], lIIlIIIIII[157]));
                                    "".length();
                                }
                                iArr12 = new int[lIIlIIIIII[0]];
                                iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
                                if (llllIlIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                    int[] iArr27 = new int[lIIlIIIIII[0]];
                                    iArr27[lIIlIIIIII[1]] = lIIlIIIIII[34];
                                    if (llllIlIIlIIl(Bank.contains(iArr27) ? 1 : 0)) {
                                        int[] iArr28 = new int[lIIlIIIIII[0]];
                                        iArr28[lIIlIIIIII[1]] = lIIlIIIIII[34];
                                    }
                                    iArr13 = new int[lIIlIIIIII[0]];
                                    iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
                                    if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                        int[] iArr29 = new int[lIIlIIIIII[0]];
                                        iArr29[lIIlIIIIII[1]] = lIIlIIIIII[36];
                                        if (!llllIlIIlIIl(Bank.contains(iArr29) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr30 = new int[lIIlIIIIII[0]];
                                        iArr30[lIIlIIIIII[1]] = lIIlIIIIII[36];
                                        if (!llllIlIIlIlI(Bank.getFirst(iArr30).getQuantity(), lIIlIIIIII[28])) {
                                            return;
                                        }
                                    }
                                    bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
                                    "".length();
                                }
                                bv.add(new C0003d(lIIlIIIIII[34], lIIlIIIIII[13], C0008i.bq));
                                "".length();
                                iArr13 = new int[lIIlIIIIII[0]];
                                iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
                                if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
                                "".length();
                            }
                            bv.add(new C0003d(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]));
                            "".length();
                            iArr8 = new int[lIIlIIIIII[0]];
                            iArr8[lIIlIIIIII[1]] = lIIlIIIIII[39];
                            if (llllIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            iArr9 = new int[lIIlIIIIII[0]];
                            iArr9[lIIlIIIIII[1]] = lIIlIIIIII[38];
                            if (llllIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            iArr10 = new int[lIIlIIIIII[0]];
                            iArr10[lIIlIIIIII[1]] = lIIlIIIIII[40];
                            if (llllIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[lIIlIIIIII[0]];
                            iArr11[lIIlIIIIII[1]] = lIIlIIIIII[41];
                            if (llllIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            if (llllIlIIlIll(Bank.contains(item2 -> {
                                return item2.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]);
                            }) ? 1 : 0)) {
                            }
                            iArr12 = new int[lIIlIIIIII[0]];
                            iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
                            if (llllIlIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            bv.add(new C0003d(lIIlIIIIII[34], lIIlIIIIII[13], C0008i.bq));
                            "".length();
                            iArr13 = new int[lIIlIIIIII[0]];
                            iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
                            if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
                            "".length();
                        }
                        bv.add(new C0003d(lIIlIIIIII[33], lIIlIIIIII[8], lIIlIIIIII[27]));
                        "".length();
                        iArr7 = new int[lIIlIIIIII[0]];
                        iArr7[lIIlIIIIII[1]] = lIIlIIIIII[29];
                        if (llllIlIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bv.add(new C0003d(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]));
                        "".length();
                        iArr8 = new int[lIIlIIIIII[0]];
                        iArr8[lIIlIIIIII[1]] = lIIlIIIIII[39];
                        if (llllIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        iArr9 = new int[lIIlIIIIII[0]];
                        iArr9[lIIlIIIIII[1]] = lIIlIIIIII[38];
                        if (llllIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        iArr10 = new int[lIIlIIIIII[0]];
                        iArr10[lIIlIIIIII[1]] = lIIlIIIIII[40];
                        if (llllIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[lIIlIIIIII[0]];
                        iArr11[lIIlIIIIII[1]] = lIIlIIIIII[41];
                        if (llllIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        if (llllIlIIlIll(Bank.contains(item22 -> {
                            return item22.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[lIIlIIIIII[0]];
                        iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (llllIlIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        bv.add(new C0003d(lIIlIIIIII[34], lIIlIIIIII[13], C0008i.bq));
                        "".length();
                        iArr13 = new int[lIIlIIIIII[0]];
                        iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
                        if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
                        "".length();
                    }
                    bv.add(new C0003d(lIIlIIIIII[32], lIIlIIIIII[13], lIIlIIIIII[27]));
                    "".length();
                    iArr6 = new int[lIIlIIIIII[0]];
                    iArr6[lIIlIIIIII[1]] = lIIlIIIIII[33];
                    if (llllIlIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIlIIIIII[33], lIIlIIIIII[8], lIIlIIIIII[27]));
                    "".length();
                    iArr7 = new int[lIIlIIIIII[0]];
                    iArr7[lIIlIIIIII[1]] = lIIlIIIIII[29];
                    if (llllIlIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]));
                    "".length();
                    iArr8 = new int[lIIlIIIIII[0]];
                    iArr8[lIIlIIIIII[1]] = lIIlIIIIII[39];
                    if (llllIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[lIIlIIIIII[0]];
                    iArr9[lIIlIIIIII[1]] = lIIlIIIIII[38];
                    if (llllIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIIlIIIIII[0]];
                    iArr10[lIIlIIIIII[1]] = lIIlIIIIII[40];
                    if (llllIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[lIIlIIIIII[0]];
                    iArr11[lIIlIIIIII[1]] = lIIlIIIIII[41];
                    if (llllIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    if (llllIlIIlIll(Bank.contains(item222 -> {
                        return item222.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[lIIlIIIIII[0]];
                    iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
                    if (llllIlIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIlIIIIII[34], lIIlIIIIII[13], C0008i.bq));
                    "".length();
                    iArr13 = new int[lIIlIIIIII[0]];
                    iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
                    if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
                    "".length();
                }
                bv.add(new C0003d(lIIlIIIIII[31], lIIlIIIIII[28], lIIlIIIIII[150]));
                "".length();
                iArr3 = new int[lIIlIIIIII[0]];
                iArr3[lIIlIIIIII[1]] = lIIlIIIIII[103];
                if (llllIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                }
                iArr4 = new int[lIIlIIIIII[0]];
                iArr4[lIIlIIIIII[1]] = lIIlIIIIII[37];
                if (llllIlIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIIlIIIIII[0]];
                iArr5[lIIlIIIIII[1]] = lIIlIIIIII[32];
                if (llllIlIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIIII[32], lIIlIIIIII[13], lIIlIIIIII[27]));
                "".length();
                iArr6 = new int[lIIlIIIIII[0]];
                iArr6[lIIlIIIIII[1]] = lIIlIIIIII[33];
                if (llllIlIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIIII[33], lIIlIIIIII[8], lIIlIIIIII[27]));
                "".length();
                iArr7 = new int[lIIlIIIIII[0]];
                iArr7[lIIlIIIIII[1]] = lIIlIIIIII[29];
                if (llllIlIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]));
                "".length();
                iArr8 = new int[lIIlIIIIII[0]];
                iArr8[lIIlIIIIII[1]] = lIIlIIIIII[39];
                if (llllIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIIlIIIIII[0]];
                iArr9[lIIlIIIIII[1]] = lIIlIIIIII[38];
                if (llllIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIIlIIIIII[0]];
                iArr10[lIIlIIIIII[1]] = lIIlIIIIII[40];
                if (llllIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIIlIIIIII[0]];
                iArr11[lIIlIIIIII[1]] = lIIlIIIIII[41];
                if (llllIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                if (llllIlIIlIll(Bank.contains(item2222 -> {
                    return item2222.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[lIIlIIIIII[0]];
                iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
                if (llllIlIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIIII[34], lIIlIIIIII[13], C0008i.bq));
                "".length();
                iArr13 = new int[lIIlIIIIII[0]];
                iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
                if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
                "".length();
            }
            bv.add(new C0003d(lIIlIIIIII[30], lIIlIIIIII[16], lIIlIIIIII[149]));
            "".length();
            iArr2 = new int[lIIlIIIIII[0]];
            iArr2[lIIlIIIIII[1]] = lIIlIIIIII[31];
            if (llllIlIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIIII[31], lIIlIIIIII[28], lIIlIIIIII[150]));
            "".length();
            iArr3 = new int[lIIlIIIIII[0]];
            iArr3[lIIlIIIIII[1]] = lIIlIIIIII[103];
            if (llllIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIIlIIIIII[0]];
            iArr4[lIIlIIIIII[1]] = lIIlIIIIII[37];
            if (llllIlIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIlIIIIII[0]];
            iArr5[lIIlIIIIII[1]] = lIIlIIIIII[32];
            if (llllIlIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIIII[32], lIIlIIIIII[13], lIIlIIIIII[27]));
            "".length();
            iArr6 = new int[lIIlIIIIII[0]];
            iArr6[lIIlIIIIII[1]] = lIIlIIIIII[33];
            if (llllIlIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIIII[33], lIIlIIIIII[8], lIIlIIIIII[27]));
            "".length();
            iArr7 = new int[lIIlIIIIII[0]];
            iArr7[lIIlIIIIII[1]] = lIIlIIIIII[29];
            if (llllIlIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]));
            "".length();
            iArr8 = new int[lIIlIIIIII[0]];
            iArr8[lIIlIIIIII[1]] = lIIlIIIIII[39];
            if (llllIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIIlIIIIII[0]];
            iArr9[lIIlIIIIII[1]] = lIIlIIIIII[38];
            if (llllIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIIlIIIIII[0]];
            iArr10[lIIlIIIIII[1]] = lIIlIIIIII[40];
            if (llllIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIIlIIIIII[0]];
            iArr11[lIIlIIIIII[1]] = lIIlIIIIII[41];
            if (llllIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            if (llllIlIIlIll(Bank.contains(item22222 -> {
                return item22222.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[lIIlIIIIII[0]];
            iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
            if (llllIlIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIIII[34], lIIlIIIIII[13], C0008i.bq));
            "".length();
            iArr13 = new int[lIIlIIIIII[0]];
            iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
            if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
            "".length();
        }
        bv.add(new C0003d(lIIlIIIIII[43], lIIlIIIIII[4], C0004e.c(lIIlIIIIII[147], lIIlIIIIII[148])));
        "".length();
        iArr = new int[lIIlIIIIII[0]];
        iArr[lIIlIIIIII[1]] = lIIlIIIIII[30];
        if (llllIlIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIIII[30], lIIlIIIIII[16], lIIlIIIIII[149]));
        "".length();
        iArr2 = new int[lIIlIIIIII[0]];
        iArr2[lIIlIIIIII[1]] = lIIlIIIIII[31];
        if (llllIlIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIIII[31], lIIlIIIIII[28], lIIlIIIIII[150]));
        "".length();
        iArr3 = new int[lIIlIIIIII[0]];
        iArr3[lIIlIIIIII[1]] = lIIlIIIIII[103];
        if (llllIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIlIIIIII[0]];
        iArr4[lIIlIIIIII[1]] = lIIlIIIIII[37];
        if (llllIlIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlIIIIII[0]];
        iArr5[lIIlIIIIII[1]] = lIIlIIIIII[32];
        if (llllIlIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIIII[32], lIIlIIIIII[13], lIIlIIIIII[27]));
        "".length();
        iArr6 = new int[lIIlIIIIII[0]];
        iArr6[lIIlIIIIII[1]] = lIIlIIIIII[33];
        if (llllIlIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIIII[33], lIIlIIIIII[8], lIIlIIIIII[27]));
        "".length();
        iArr7 = new int[lIIlIIIIII[0]];
        iArr7[lIIlIIIIII[1]] = lIIlIIIIII[29];
        if (llllIlIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]));
        "".length();
        iArr8 = new int[lIIlIIIIII[0]];
        iArr8[lIIlIIIIII[1]] = lIIlIIIIII[39];
        if (llllIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIlIIIIII[0]];
        iArr9[lIIlIIIIII[1]] = lIIlIIIIII[38];
        if (llllIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIIlIIIIII[0]];
        iArr10[lIIlIIIIII[1]] = lIIlIIIIII[40];
        if (llllIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIIlIIIIII[0]];
        iArr11[lIIlIIIIII[1]] = lIIlIIIIII[41];
        if (llllIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        if (llllIlIIlIll(Bank.contains(item222222 -> {
            return item222222.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[lIIlIIIIII[0]];
        iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
        if (llllIlIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIIII[34], lIIlIIIIII[13], C0008i.bq));
        "".length();
        iArr13 = new int[lIIlIIIIII[0]];
        iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
        if (llllIlIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]));
        "".length();
    }

    private static boolean llllIlIlIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIlIlIIlI(int i, int i2) {
        return i <= i2;
    }

    private static String llllIIlIIIIl(String llIIIIlIIlI, String llIIIIlIIIl) {
        try {
            SecretKeySpec llIIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIlIlII = Cipher.getInstance("Blowfish");
            llIIIIlIlII.init(lIIlIIIIII[9], llIIIIlIlIl);
            return new String(llIIIIlIlII.doFinal(Base64.getDecoder().decode(llIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIlllI) {
            llIIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIlIIII(int i) {
        return i < 0;
    }

    private static boolean llllIlIlIIll(int i, int i2) {
        return i != i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return llllIlIlIlII(ct, lIIIlllIll[lIIlIIIIII[159]]) ? lIIIlllIll[lIIlIIIIII[160]] : "Animal Magnetism - " + ct;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x069d, code lost:
        if (llllIlIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[8]) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06e0, code lost:
        if (llllIlIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[16]) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0723, code lost:
        if (llllIlIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[28]) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0766, code lost:
        if (llllIlIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[13]) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x07a9, code lost:
        if (llllIlIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[8]) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x07ec, code lost:
        if (llllIlIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[13]) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07ef, code lost:
        af();
        java.lang.System.out.println(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIIlllIll[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[35]]);
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.bt = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0017r.lIIlIIIIII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x080a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v892, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v925, types: [boolean] */
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
    public static void aE() {
        if (llllIlIIlIIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (llllIlIIlIlI(bv.size(), lIIlIIIIII[0])) {
                System.out.println(lIIIlllIll[lIIlIIIIII[1]]);
                bt = lIIlIIIIII[1];
            }
        }
        if (llllIlIIlIll(bt ? 1 : 0) && llllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[2])) {
            if (llllIlIIlIlI(C0004e.j(lIIlIIIIII[3]), lIIlIIIIII[4])) {
                ct = lIIIlllIll[lIIlIIIIII[0]];
                z.bn();
            }
            if (llllIlIIllII(C0004e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && (!llllIlIIllIl(C0004e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) || llllIlIIlIlI(C0004e.j(lIIlIIIIII[7]), lIIlIIIIII[8]))) {
                ct = lIIIlllIll[lIIlIIIIII[9]];
                C0020u.aM();
            }
            if (llllIlIIllII(C0004e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && llllIlIIlIlI(C0004e.j(lIIlIIIIII[10]), lIIlIIIIII[11])) {
                ct = lIIIlllIll[lIIlIIIIII[11]];
                C.bH();
            }
            if (llllIlIIllII(C0004e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && llllIlIIllII(C0004e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && llllIlIIlIlI(Skills.getLevel(Skill.CRAFTING), lIIlIIIIII[12])) {
                ct = lIIIlllIll[lIIlIIIIII[13]];
                Q.cT();
            }
            if (llllIlIIllII(C0004e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && llllIlIIllII(C0004e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && llllIlIIllIl(Skills.getLevel(Skill.CRAFTING), lIIlIIIIII[12]) && llllIlIIlIlI(Skills.getLevel(Skill.WOODCUTTING), lIIlIIIIII[14])) {
                ct = lIIIlllIll[lIIlIIIIII[8]];
                T.ds();
            }
            if (llllIlIIllII(C0004e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && llllIlIIllII(C0004e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && llllIlIIllIl(Skills.getLevel(Skill.CRAFTING), lIIlIIIIII[12]) && llllIlIIllIl(Skills.getLevel(Skill.WOODCUTTING), lIIlIIIIII[14]) && llllIlIIlIlI(Skills.getLevel(Skill.RANGED), lIIlIIIIII[15])) {
                ct = lIIIlllIll[lIIlIIIIII[16]];
                if (llllIlIIlIlI(cs, lIIlIIIIII[0])) {
                    C0013n.bU = lIIlIIIIII[1];
                    cs += lIIlIIIIII[0];
                }
                C0012m.ap();
            }
            if (llllIlIIllII(C0004e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && llllIlIIllIl(C0004e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && llllIlIIllII(C0004e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && llllIlIIllIl(Skills.getLevel(Skill.CRAFTING), lIIlIIIIII[12]) && llllIlIIllIl(Skills.getLevel(Skill.WOODCUTTING), lIIlIIIIII[14]) && llllIlIIllIl(Skills.getLevel(Skill.RANGED), lIIlIIIIII[15])) {
                if (!llllIlIIllIl(C0004e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) || llllIlIIlIlI(Skills.getLevel(Skill.HUNTER), lIIlIIIIII[19])) {
                    ct = lIIIlllIll[lIIlIIIIII[20]];
                    y.bk();
                }
                if (llllIlIIllIl(C0004e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && llllIlIIllIl(Skills.getLevel(Skill.HUNTER), lIIlIIIIII[19]) && llllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6])) {
                    ct = lIIIlllIll[lIIlIIIIII[21]];
                    w.bf();
                }
                if (llllIlIIllIl(C0004e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && llllIlIIllIl(Skills.getLevel(Skill.HUNTER), lIIlIIIIII[19]) && llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) && llllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22])) {
                    ct = lIIIlllIll[lIIlIIIIII[19]];
                    C0016q.aC();
                }
                if (llllIlIIllIl(C0004e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && llllIlIIllIl(Skills.getLevel(Skill.HUNTER), lIIlIIIIII[19]) && llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) && llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22]) && llllIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIlIIIIII[19])) {
                    String[] strArr = new String[lIIlIIIIII[0]];
                    strArr[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[4]];
                    if (llllIlIIlIll(Inventory.contains(strArr) ? 1 : 0)) {
                        ct = lIIIlllIll[lIIlIIIIII[23]];
                        C0018s.aH();
                    }
                }
                C0018s.aI();
            }
            if (llllIlIIlIll(ab() ? 1 : 0) && llllIlIIlIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) && llllIlIIllIl(C0004e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && llllIlIIllIl(Skills.getLevel(Skill.HUNTER), lIIlIIIIII[19]) && llllIlIIllIl(Skills.getLevel(Skill.RANGED), lIIlIIIIII[15]) && llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) && llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22]) && llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIlIIIIII[19])) {
                String[] strArr2 = new String[lIIlIIIIII[0]];
                strArr2[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[24]];
                if (llllIlIIlIll(Inventory.contains(strArr2) ? 1 : 0)) {
                    ct = lIIIlllIll[lIIlIIIIII[25]];
                    BankLocation nearest = BankLocation.getNearest();
                    if (llllIlIIlllI(nearest) && llllIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[26]];
                        C0000a.a(nearest);
                    }
                    if (llllIlIIlllI(nearest) && llllIlIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llllIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIlIIIIII[27]);
                            "".length();
                        }
                        if (llllIlIIlIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[28]];
                            if (llllIlIIllll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIlIIIIII[13]);
                                "".length();
                            }
                            if (llllIlIIllll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIlIIIIII[9]);
                                "".length();
                            }
                            int[] iArr = new int[lIIlIIIIII[0]];
                            iArr[lIIlIIIIII[1]] = lIIlIIIIII[29];
                            if (llllIlIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIlIIIIII[0]];
                                iArr2[lIIlIIIIII[1]] = lIIlIIIIII[29];
                            }
                            int[] iArr3 = new int[lIIlIIIIII[0]];
                            iArr3[lIIlIIIIII[1]] = lIIlIIIIII[30];
                            if (llllIlIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIlIIIIII[0]];
                                iArr4[lIIlIIIIII[1]] = lIIlIIIIII[30];
                            }
                            int[] iArr5 = new int[lIIlIIIIII[0]];
                            iArr5[lIIlIIIIII[1]] = lIIlIIIIII[31];
                            if (llllIlIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlIIIIII[0]];
                                iArr6[lIIlIIIIII[1]] = lIIlIIIIII[31];
                            }
                            int[] iArr7 = new int[lIIlIIIIII[0]];
                            iArr7[lIIlIIIIII[1]] = lIIlIIIIII[32];
                            if (llllIlIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIlIIIIII[0]];
                                iArr8[lIIlIIIIII[1]] = lIIlIIIIII[32];
                            }
                            int[] iArr9 = new int[lIIlIIIIII[0]];
                            iArr9[lIIlIIIIII[1]] = lIIlIIIIII[33];
                            if (llllIlIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIlIIIIII[0]];
                                iArr10[lIIlIIIIII[1]] = lIIlIIIIII[33];
                            }
                            int[] iArr11 = new int[lIIlIIIIII[0]];
                            iArr11[lIIlIIIIII[1]] = lIIlIIIIII[34];
                            if (llllIlIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIlIIIIII[0]];
                                iArr12[lIIlIIIIII[1]] = lIIlIIIIII[34];
                            }
                            int[] iArr13 = new int[lIIlIIIIII[23]];
                            iArr13[lIIlIIIIII[1]] = lIIlIIIIII[36];
                            iArr13[lIIlIIIIII[0]] = lIIlIIIIII[37];
                            iArr13[lIIlIIIIII[9]] = lIIlIIIIII[33];
                            iArr13[lIIlIIIIII[11]] = lIIlIIIIII[38];
                            iArr13[lIIlIIIIII[13]] = lIIlIIIIII[32];
                            iArr13[lIIlIIIIII[8]] = lIIlIIIIII[34];
                            iArr13[lIIlIIIIII[16]] = lIIlIIIIII[39];
                            iArr13[lIIlIIIIII[20]] = lIIlIIIIII[40];
                            iArr13[lIIlIIIIII[21]] = lIIlIIIIII[41];
                            iArr13[lIIlIIIIII[19]] = lIIlIIIIII[30];
                            iArr13[lIIlIIIIII[4]] = lIIlIIIIII[31];
                            if (llllIlIIlIll(C0004e.b(iArr13) ? 1 : 0)) {
                                af();
                                System.out.println(lIIIlllIll[lIIlIIIIII[42]]);
                                bt = lIIlIIIIII[0];
                                return;
                            }
                            int[] iArr14 = new int[lIIlIIIIII[23]];
                            iArr14[lIIlIIIIII[1]] = lIIlIIIIII[36];
                            iArr14[lIIlIIIIII[0]] = lIIlIIIIII[37];
                            iArr14[lIIlIIIIII[9]] = lIIlIIIIII[33];
                            iArr14[lIIlIIIIII[11]] = lIIlIIIIII[38];
                            iArr14[lIIlIIIIII[13]] = lIIlIIIIII[32];
                            iArr14[lIIlIIIIII[8]] = lIIlIIIIII[34];
                            iArr14[lIIlIIIIII[16]] = lIIlIIIIII[39];
                            iArr14[lIIlIIIIII[20]] = lIIlIIIIII[40];
                            iArr14[lIIlIIIIII[21]] = lIIlIIIIII[41];
                            iArr14[lIIlIIIIII[19]] = lIIlIIIIII[30];
                            iArr14[lIIlIIIIII[4]] = lIIlIIIIII[31];
                            if (llllIlIIlIIl(C0004e.b(iArr14) ? 1 : 0)) {
                                C0000a.a(lIIlIIIIII[34], lIIlIIIIII[13]);
                                C0000a.a(lIIlIIIIII[37], lIIlIIIIII[0]);
                                C0000a.a(lIIlIIIIII[43], lIIlIIIIII[0]);
                                C0000a.a(lIIlIIIIII[32], lIIlIIIIII[13]);
                                C0000a.a(lIIlIIIIII[29], lIIlIIIIII[13]);
                                C0000a.a(lIIlIIIIII[40], lIIlIIIIII[0]);
                                C0000a.a(lIIlIIIIII[41], lIIlIIIIII[0]);
                                C0000a.a(lIIlIIIIII[36], lIIlIIIIII[4]);
                                C0000a.a(lIIlIIIIII[30], lIIlIIIIII[4]);
                                C0000a.a(lIIlIIIIII[31], lIIlIIIIII[28]);
                                C0000a.a(lIIlIIIIII[44], lIIlIIIIII[0]);
                                C0000a.a(lIIlIIIIII[45], lIIlIIIIII[27]);
                            }
                        }
                    }
                }
            }
            if (llllIlIIlIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && llllIlIIlIlI(Movement.getRunEnergy(), lIIlIIIIII[15])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIlllIll[lIIlIIIIII[46]]);
                Time.sleepTicks(lIIlIIIIII[0]);
                "".length();
            }
            if (llllIlIIlIIl(Inventory.contains(C0005f.aS) ? 1 : 0) && llllIlIIlIlI(Prayers.getPoints(), lIIlIIIIII[47])) {
                Inventory.getFirst(C0005f.aS).interact(lIIIlllIll[lIIlIIIIII[12]]);
            }
            if (llllIlIlIIII(llllIlIIlIII(C0004e.u(), 60.0d))) {
                String[] strArr3 = new String[lIIlIIIIII[0]];
                strArr3[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[48]];
                if (llllIlIIlIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIlIIIIII[0]];
                    strArr4[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[49]];
                    Inventory.getFirst(strArr4).interact(lIIIlllIll[lIIlIIIIII[50]]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                }
            }
            if (llllIlIIlIIl(ab() ? 1 : 0) && llllIlIIlIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (llllIlIIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[51]];
                    if (llllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(cg);
                    "".length();
                    Time.sleepTicks(lIIlIIIIII[0]);
                    "".length();
                }
                if (llllIlIIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
                    ck = lIIlIIIIII[1];
                    C0006g.a(lIIIlllIll[lIIlIIIIII[47]], bR);
                }
                if (llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIIIIII[52], lIIlIIIIII[53], lIIlIIIIII[1])) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIlIIIIII[0]];
                    strArr5[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[54]];
                    TileObjects.getNearest(strArr5).interact(lIIIlllIll[lIIlIIIIII[55]]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                }
                if (llllIlIIlIIl(new WorldArea(lIIlIIIIII[52], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[lIIlIIIIII[0]];
                    strArr6[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[57]];
                    TileObjects.getNearest(strArr6).interact(lIIIlllIll[lIIlIIIIII[58]]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[4])) {
                int[] iArr15 = new int[lIIlIIIIII[0]];
                iArr15[lIIlIIIIII[1]] = lIIlIIIIII[44];
                if (llllIlIIlIll(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIlIIIIII[0]];
                    iArr16[lIIlIIIIII[1]] = lIIlIIIIII[44];
                    Inventory.getFirst(iArr16).interact(lIIIlllIll[lIIlIIIIII[59]]);
                }
                int[] iArr17 = new int[lIIlIIIIII[0]];
                iArr17[lIIlIIIIII[1]] = lIIlIIIIII[60];
                if (llllIlIIlIll(Inventory.contains(iArr17) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIIlIIIIII[61], lIIlIIIIII[62], lIIlIIIIII[1]);
                    int[] iArr18 = new int[lIIlIIIIII[0]];
                    iArr18[lIIlIIIIII[1]] = lIIlIIIIII[63];
                    if (llllIlIIlIll(Inventory.contains(iArr18) ? 1 : 0) && llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIIII[48])) {
                        if (llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cq), lIIlIIIIII[8])) {
                            AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[64]];
                            Movement.walkTo(cq);
                            "".length();
                            Time.sleepTicks(lIIlIIIIII[0]);
                            "".length();
                        }
                        if (llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cq), lIIlIIIIII[8])) {
                            if (llllIlIIlIll(Shop.isOpen() ? 1 : 0)) {
                                String[] strArr7 = new String[lIIlIIIIII[0]];
                                strArr7[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[65]];
                                NPCs.getNearest(strArr7).interact(lIIIlllIll[lIIlIIIIII[10]]);
                                Time.sleepTicks(lIIlIIIIII[9]);
                                "".length();
                            }
                            if (llllIlIIlIIl(Shop.isOpen() ? 1 : 0)) {
                                Shop.buyFive(lIIlIIIIII[63]);
                                Time.sleepTicks(lIIlIIIIII[11]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr19 = new int[lIIlIIIIII[0]];
                    iArr19[lIIlIIIIII[1]] = lIIlIIIIII[63];
                    if (llllIlIIlIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                        if (llllIlIIlIll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlIIlIll(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIIlIIIIII[0]];
                            iArr20[lIIlIIIIII[1]] = lIIlIIIIII[31];
                            if (llllIlIIlIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIIlIIIIII[0]];
                                iArr21[lIIlIIIIII[1]] = lIIlIIIIII[31];
                                Inventory.getFirst(iArr21).interact(lIIIlllIll[lIIlIIIIII[66]]);
                                Time.sleepTicks(lIIlIIIIII[20]);
                                "".length();
                            }
                        }
                        if (!llllIlIIlIll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIIlIIIIII[61], lIIlIIIIII[62], lIIlIIIIII[1]);
                            if (llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlIIIIII[8]) && llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[67]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIIlIIIIII[0]);
                                "".length();
                            }
                            String[] strArr8 = new String[lIIlIIIIII[0]];
                            strArr8[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[14]];
                            if (llllIlIIlIIl(Inventory.contains(strArr8) ? 1 : 0)) {
                                if (llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlIIIIII[8]) && llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                    String[] strArr9 = new String[lIIlIIIIII[0]];
                                    strArr9[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[68]];
                                    TileObjects.getNearest(strArr9).interact(lIIIlllIll[lIIlIIIIII[69]]);
                                    Time.sleepTicks(lIIlIIIIII[13]);
                                    "".length();
                                }
                                String[] strArr10 = new String[lIIlIIIIII[0]];
                                strArr10[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[70]];
                                if (llllIlIIlllI(TileObjects.getNearest(strArr10))) {
                                    String[] strArr11 = new String[lIIlIIIIII[0]];
                                    strArr11[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[71]];
                                    if (llllIlIIlIIl(Inventory.contains(strArr11) ? 1 : 0)) {
                                        String[] strArr12 = new String[lIIlIIIIII[0]];
                                        strArr12[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[22]];
                                        Item first = Inventory.getFirst(strArr12);
                                        String[] strArr13 = new String[lIIlIIIIII[0]];
                                        strArr13[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[72]];
                                        first.useOn(TileObjects.getNearest(strArr13));
                                        Time.sleep(C0004e.c(lIIlIIIIII[73], lIIlIIIIII[74]));
                                        "".length();
                                    }
                                }
                            }
                            String[] strArr14 = new String[lIIlIIIIII[0]];
                            strArr14[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[75]];
                            if (llllIlIIlIll(Inventory.contains(strArr14) ? 1 : 0)) {
                                if (llllIlIIllII(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIII[0])) {
                                    String[] strArr15 = new String[lIIlIIIIII[0]];
                                    strArr15[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[76]];
                                    TileObjects.getNearest(strArr15).interact(lIIIlllIll[lIIlIIIIII[77]]);
                                    Time.sleepTicks(lIIlIIIIII[8]);
                                    "".length();
                                }
                                if (llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                    do {
                                        String[] strArr16 = new String[lIIlIIIIII[0]];
                                        strArr16[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[78]];
                                        if (llllIlIIlIIl(Inventory.contains(strArr16) ? 1 : 0)) {
                                            String[] strArr17 = new String[lIIlIIIIII[0]];
                                            strArr17[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[79]];
                                            TileObjects.getNearest(strArr17).interact(lIIIlllIll[lIIlIIIIII[80]]);
                                            Time.sleepTicks(lIIlIIIIII[9]);
                                            "".length();
                                            "".length();
                                        }
                                    } while (" ".length() <= "   ".length());
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr22 = new int[lIIlIIIIII[0]];
                    iArr22[lIIlIIIIII[1]] = lIIlIIIIII[32];
                    if (llllIlIIlIll(Inventory.contains(iArr22) ? 1 : 0)) {
                        String[] strArr18 = new String[lIIlIIIIII[0]];
                        strArr18[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[81]];
                        if (llllIlIIlIll(Inventory.contains(strArr18) ? 1 : 0) && llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIIII[48])) {
                            if (llllIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                C0006g.a(lIIIlllIll[lIIlIIIIII[82]], bR);
                                Time.sleepTicks(lIIlIIIIII[0]);
                                "".length();
                            }
                            C0006g.a(bR);
                        }
                    }
                }
                int[] iArr23 = new int[lIIlIIIIII[0]];
                iArr23[lIIlIIIIII[1]] = lIIlIIIIII[60];
                if (llllIlIIlIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[lIIlIIIIII[9]];
                    iArr24[lIIlIIIIII[1]] = lIIlIIIIII[83];
                    iArr24[lIIlIIIIII[0]] = lIIlIIIIII[29];
                    if (llllIlIIlIIl(Inventory.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[lIIlIIIIII[9]];
                        iArr25[lIIlIIIIII[1]] = lIIlIIIIII[83];
                        iArr25[lIIlIIIIII[0]] = lIIlIIIIII[29];
                        Inventory.getAll(iArr25).stream().forEach(item -> {
                            item.interact(lIIIlllIll[lIIlIIIIII[162]]);
                        });
                    }
                    if (llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                        Movement.walkTo(cr);
                        "".length();
                        Time.sleepTicks(lIIlIIIIII[0]);
                        "".length();
                    }
                    if (llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                        C0006g.a(lIIIlllIll[lIIlIIIIII[15]], bR);
                    }
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[48])) {
                C0006g.a(lIIIlllIll[lIIlIIIIII[84]], bR);
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[64])) {
                C0006g.a(lIIIlllIll[lIIlIIIIII[85]], bR);
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[22])) {
                C0006g.a(lIIIlllIll[lIIlIIIIII[86]], bR);
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[15])) {
                C0006g.a(lIIIlllIll[lIIlIIIIII[87]], bR);
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[6])) {
                C0006g.a(lIIIlllIll[lIIlIIIIII[88]], bR);
            }
            if (!llllIlIlIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[89]) || llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[90])) {
                WorldPoint worldPoint3 = new WorldPoint(lIIlIIIIII[91], lIIlIIIIII[92], lIIlIIIIII[1]);
                if (llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIIII[11])) {
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[93]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(lIIlIIIIII[0]);
                    "".length();
                }
                if (llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIIII[11])) {
                    C0006g.a(lIIIlllIll[lIIlIIIIII[94]], bR);
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[95])) {
                if (llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                    Movement.walkTo(cr);
                    "".length();
                    Time.sleepTicks(lIIlIIIIII[0]);
                    "".length();
                }
                if (llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                    C0006g.a(lIIIlllIll[lIIlIIIIII[96]], bR);
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[97])) {
                C0006g.a(lIIIlllIll[lIIlIIIIII[98]], bR);
            }
            if (!llllIlIlIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[99]) || llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[100])) {
                C0006g.a(lIIIlllIll[lIIlIIIIII[6]], bR);
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[100])) {
                String[] strArr19 = new String[lIIlIIIIII[0]];
                strArr19[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[101]];
                if (llllIlIIlIIl(Inventory.contains(strArr19) ? 1 : 0)) {
                    String[] strArr20 = new String[lIIlIIIIII[0]];
                    strArr20[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[102]];
                    if (llllIlIIlIll(Inventory.contains(strArr20) ? 1 : 0)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Integer.valueOf(lIIlIIIIII[33]), Integer.valueOf(lIIlIIIIII[8]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIlIIIIII[38]), Integer.valueOf(lIIlIIIIII[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIlIIIIII[39]), Integer.valueOf(lIIlIIIIII[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIlIIIIII[103]), Integer.valueOf(lIIlIIIIII[0]));
                        "".length();
                        C0004e.a(hashMap, lIIlIIIIII[1], lIIlIIIIII[1]);
                    }
                    String[] strArr21 = new String[lIIlIIIIII[0]];
                    strArr21[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[104]];
                    if (llllIlIIlIIl(Inventory.contains(strArr21) ? 1 : 0)) {
                        aF();
                    }
                }
            }
            if (!llllIlIlIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[105]) || llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[106])) {
                String[] strArr22 = new String[lIIlIIIIII[0]];
                strArr22[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[107]];
                NPC nearest2 = NPCs.getNearest(strArr22);
                if (llllIlIIlllI(nearest2)) {
                    if (llllIlIIlIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        C0006g.a(lIIIlllIll[lIIlIIIIII[3]], bR);
                    }
                    if (llllIlIIlIll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2);
                        "".length();
                        Time.sleepTicks(lIIlIIIIII[0]);
                        "".length();
                    }
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[108])) {
                String[] strArr23 = new String[lIIlIIIIII[0]];
                strArr23[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[109]];
                if (llllIlIIlIll(Inventory.contains(strArr23) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIIlIIIIII[110], lIIlIIIIII[111], lIIlIIIIII[1]);
                    WorldPoint worldPoint5 = new WorldPoint(lIIlIIIIII[110], lIIlIIIIII[112], lIIlIIIIII[1]);
                    if (llllIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && llllIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[113]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lIIlIIIIII[0]);
                        "".length();
                    }
                    if (llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && llllIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        Movement.walkTo(worldPoint5);
                        "".length();
                    }
                    if (llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        String[] strArr24 = new String[lIIlIIIIII[0]];
                        strArr24[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[114]];
                        Item first2 = Inventory.getFirst(strArr24);
                        String[] strArr25 = new String[lIIlIIIIII[0]];
                        strArr25[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[115]];
                        first2.useOn(Inventory.getFirst(strArr25));
                        Time.sleepTicks(lIIlIIIIII[11]);
                        "".length();
                    }
                }
                String[] strArr26 = new String[lIIlIIIIII[0]];
                strArr26[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[89]];
                if (llllIlIIlIIl(Inventory.contains(strArr26) ? 1 : 0)) {
                    aF();
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[116])) {
                WorldPoint worldPoint6 = new WorldPoint(lIIlIIIIII[117], lIIlIIIIII[118], lIIlIIIIII[1]);
                if (llllIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    Movement.walkTo(worldPoint6);
                    "".length();
                    Time.sleepTicks(lIIlIIIIII[0]);
                    "".length();
                }
                if (llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    String[] strArr27 = new String[lIIlIIIIII[0]];
                    strArr27[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[119]];
                    NPCs.getNearest(strArr27).interact(lIIIlllIll[lIIlIIIIII[120]]);
                    Time.sleepTicks(lIIlIIIIII[0]);
                    "".length();
                }
            }
            if (!llllIlIlIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[121]) || llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[122])) {
                WorldPoint worldPoint7 = new WorldPoint(lIIlIIIIII[123], lIIlIIIIII[124], lIIlIIIIII[1]);
                if (llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIlIIIIII[9])) {
                    if (llllIlIIlIIl(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aO).interact(lIIIlllIll[lIIlIIIIII[90]]);
                    }
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[125]];
                    Movement.walkTo(worldPoint7);
                    "".length();
                    Time.sleepTicks(lIIlIIIIII[0]);
                    "".length();
                }
                if (llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIlIIIIII[9])) {
                    String[] strArr28 = new String[lIIlIIIIII[0]];
                    strArr28[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[126]];
                    NPC nearest3 = NPCs.getNearest(strArr28);
                    if (llllIlIIlllI(nearest3)) {
                        if (llllIlIIlIIl(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            C0006g.a(lIIIlllIll[lIIlIIIIII[95]], bR);
                        }
                        if (llllIlIIlIll(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            Movement.walkTo(nearest3);
                            "".length();
                            Time.sleepTicks(lIIlIIIIII[0]);
                            "".length();
                        }
                    }
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[127])) {
                String[] strArr29 = new String[lIIlIIIIII[0]];
                strArr29[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[128]];
                if (llllIlIIlIll(Inventory.contains(strArr29) ? 1 : 0)) {
                    WorldPoint worldPoint8 = new WorldPoint(lIIlIIIIII[117], lIIlIIIIII[118], lIIlIIIIII[1]);
                    if (llllIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        Movement.walkTo(worldPoint8);
                        "".length();
                        Time.sleepTicks(lIIlIIIIII[0]);
                        "".length();
                    }
                    if (llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        String[] strArr30 = new String[lIIlIIIIII[0]];
                        strArr30[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[129]];
                        NPCs.getNearest(strArr30).interact(lIIIlllIll[lIIlIIIIII[130]]);
                        Time.sleepTicks(lIIlIIIIII[0]);
                        "".length();
                    }
                }
                String[] strArr31 = new String[lIIlIIIIII[0]];
                strArr31[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[97]];
                if (llllIlIIlIIl(Inventory.contains(strArr31) ? 1 : 0)) {
                    aF();
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[131])) {
                aF();
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[132])) {
                if (llllIlIIlIIl(Widgets.get(lIIlIIIIII[133]).isEmpty() ? 1 : 0)) {
                    String[] strArr32 = new String[lIIlIIIIII[0]];
                    strArr32[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[134]];
                    Inventory.getFirst(strArr32).interact(lIIIlllIll[lIIlIIIIII[135]]);
                    Time.sleepTicks(lIIlIIIIII[13]);
                    "".length();
                }
                if (llllIlIIlIll(Widgets.get(lIIlIIIIII[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click(Widgets.get(lIIlIIIIII[133], lIIlIIIIII[55]).getClickPoint().getX(), Widgets.get(lIIlIIIIII[133], lIIlIIIIII[55]).getClickPoint().getY(), (boolean) lIIlIIIIII[0]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIlIIIIII[133], lIIlIIIIII[65]).getClickPoint().getX(), Widgets.get(lIIlIIIIII[133], lIIlIIIIII[65]).getClickPoint().getY(), (boolean) lIIlIIIIII[0]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIlIIIIII[133], lIIlIIIIII[67]).getClickPoint().getX(), Widgets.get(lIIlIIIIII[133], lIIlIIIIII[67]).getClickPoint().getY(), (boolean) lIIlIIIIII[0]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIlIIIIII[133], lIIlIIIIII[22]).getClickPoint().getX(), Widgets.get(lIIlIIIIII[133], lIIlIIIIII[22]).getClickPoint().getY(), (boolean) lIIlIIIIII[0]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIlIIIIII[133], lIIlIIIIII[76]).getClickPoint().getX(), Widgets.get(lIIlIIIIII[133], lIIlIIIIII[76]).getClickPoint().getY(), (boolean) lIIlIIIIII[0]);
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIlIIIIII[133], lIIlIIIIII[79]).getClickPoint().getX(), Widgets.get(lIIlIIIIII[133], lIIlIIIIII[79]).getClickPoint().getY(), (boolean) lIIlIIIIII[0]);
                    Time.sleepTicks(lIIlIIIIII[8]);
                    "".length();
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[136])) {
                aF();
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[137])) {
                String[] strArr33 = new String[lIIlIIIIII[0]];
                strArr33[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[138]];
                if (llllIlIIlIIl(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[lIIlIIIIII[0]];
                    strArr34[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[139]];
                    Item first3 = Inventory.getFirst(strArr34);
                    String[] strArr35 = new String[lIIlIIIIII[0]];
                    strArr35[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[140]];
                    first3.useOn(Inventory.getFirst(strArr35));
                    Time.sleepTicks(lIIlIIIIII[9]);
                    "".length();
                }
            }
            if (llllIlIIllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[141])) {
                if (llllIlIIlIlI(ck, lIIlIIIIII[0])) {
                    U.lP += lIIlIIIIII[0];
                    U.o(AccBuilderRogues.m);
                    ck += lIIlIIIIII[0];
                    U.lP = lIIlIIIIII[1];
                    cl = lIIlIIIIII[1];
                }
                aF();
            }
            C0006g.a(bR);
        }
    }

    private static boolean llllIlIIllII(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIlIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIlIIllll(int i) {
        return i > 0;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            aE();
            "".length();
            if (0 != 0) {
                return ((128 ^ 188) ^ (134 ^ 143)) & (((((22 + 44) - (-58)) + 13) ^ (((52 + 108) - 119) + 147)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIIIII[100];
    }

    static {
        llllIlIIIlll();
        llllIIllIlII();
        bv = new ArrayList();
        cn = new WorldArea(lIIlIIIIII[163], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1]);
        co = new WorldArea(lIIlIIIIII[164], lIIlIIIIII[165], lIIlIIIIII[166], lIIlIIIIII[142], lIIlIIIIII[1]);
        cp = new WorldArea(lIIlIIIIII[164], lIIlIIIIII[165], lIIlIIIIII[166], lIIlIIIIII[142], lIIlIIIIII[0]);
        cg = new WorldPoint(lIIlIIIIII[167], lIIlIIIIII[168], lIIlIIIIII[1]);
        cq = new WorldPoint(lIIlIIIIII[169], lIIlIIIIII[170], lIIlIIIIII[1]);
        cr = new WorldPoint(lIIlIIIIII[171], lIIlIIIIII[172], lIIlIIIIII[1]);
        String[] strArr = new String[lIIlIIIIII[21]];
        strArr[lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[173]];
        strArr[lIIlIIIIII[0]] = lIIIlllIll[lIIlIIIIII[174]];
        strArr[lIIlIIIIII[9]] = lIIIlllIll[lIIlIIIIII[175]];
        strArr[lIIlIIIIII[11]] = lIIIlllIll[lIIlIIIIII[176]];
        strArr[lIIlIIIIII[13]] = lIIIlllIll[lIIlIIIIII[100]];
        strArr[lIIlIIIIII[8]] = lIIIlllIll[lIIlIIIIII[177]];
        strArr[lIIlIIIIII[16]] = lIIIlllIll[lIIlIIIIII[178]];
        strArr[lIIlIIIIII[20]] = lIIIlllIll[lIIlIIIIII[179]];
        bR = strArr;
        cs = lIIlIIIIII[1];
        ct = lIIIlllIll[lIIlIIIIII[180]];
    }

    private static int llllIlIIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllIlIIllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[2])) {
            ?? r0 = lIIlIIIIII[0];
            "".length();
            return (((87 ^ 101) ^ (99 ^ 93)) & (((25 ^ 42) ^ (112 ^ 79)) ^ (-" ".length()))) != 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        }
        return lIIlIIIIII[1];
    }

    private static String llllIIlIIIII(String llIIIIlllll, String llIIIIllllI) {
        try {
            SecretKeySpec llIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIllllI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIII[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIIIII[9], llIIIlIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIIIII) {
            llIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIIllIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIIIIII[1];
    }

    private static boolean llllIlIIlIll(int i) {
        return i == 0;
    }

    private static String llllIIlIIIlI(String llIIIIIIIlI, String llIIIIIIIIl) {
        String llIIIIIIIlI2 = new String(Base64.getDecoder().decode(llIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlllllllll = llIIIIIIIIl.toCharArray();
        int lIllllllllI = lIIlIIIIII[1];
        char[] charArray = llIIIIIIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIIIIII[1];
        while (llllIlIIlIlI(i, length)) {
            char llIIIIIIIll = charArray[i];
            sb.append((char) (llIIIIIIIll ^ lIlllllllll[lIllllllllI % lIlllllllll.length]));
            "".length();
            lIllllllllI++;
            i++;
            "".length();
            if ((-(182 ^ 178)) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
