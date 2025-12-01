package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.v  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/v.class */
public class C0021v implements ab {
    static /* synthetic */ WorldPoint dq;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ int[] lIIIIIIIlI;
    private static /* synthetic */ int da;

    /* renamed from: do  reason: not valid java name */
    static /* synthetic */ WorldArea f1do;
    static /* synthetic */ int dk;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldArea dn;
    static /* synthetic */ WorldPoint dr;
    private static /* synthetic */ String ds;
    static /* synthetic */ WorldPoint dg;
    private static /* synthetic */ String[] cG;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ String[] lllllllll;
    static /* synthetic */ WorldArea dp;

    private static boolean llIllIllIlIl(int i, int i2) {
        return i == i2;
    }

    private static void ba() {
        if (llIllIllIIlI(new WorldArea(lIIIIIIIlI[52], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] strArr = new String[lIIIIIIIlI[0]];
            strArr[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[142]];
            TileObjects.getNearest(strArr).interact(lllllllll[lIIIIIIIlI[143]]);
            Time.sleepTicks(lIIIIIIIlI[9]);
            "".length();
        }
        if (llIllIllIlII(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
            AccBuilderGWD.c = lllllllll[lIIIIIIIlI[144]];
            if (llIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(dg);
            "".length();
            Time.sleepTicks(lIIIIIIIlI[0]);
            "".length();
        }
        if (llIllIllIIlI(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
            C0006g.a(lllllllll[lIIIIIIIlI[145]], cG);
        }
        if (llIllIllIIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIIIIIlI[52], lIIIIIIIlI[53], lIIIIIIIlI[1])) ? 1 : 0)) {
            String[] strArr2 = new String[lIIIIIIIlI[0]];
            strArr2[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[99]];
            TileObjects.getNearest(strArr2).interact(lllllllll[lIIIIIIIlI[146]]);
            Time.sleepTicks(lIIIIIIIlI[9]);
            "".length();
        }
    }

    private static boolean llIllIllIlII(int i) {
        return i == 0;
    }

    private static String llIllIIlllII(String lIIlIlIIllllI, String lIIlIlIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIlI[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIlIIllIlI) {
            lIIlIlIIllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIllIllIIII() {
        lIIIIIIIlI = new int[182];
        lIIIIIIIlI[0] = " ".length();
        lIIIIIIIlI[1] = (212 ^ 153) & ((78 ^ 3) ^ (-1));
        lIIIIIIIlI[2] = (((((91 + 50) - 104) + 105) + (((8 + 118) - 53) + 68)) - (((41 + 123) - 72) + 76)) + (206 ^ 179);
        lIIIIIIIlI[3] = (73 ^ 77) ^ (83 ^ 22);
        lIIIIIIIlI[4] = 182 ^ 188;
        lIIIIIIIlI[5] = (-((-21897) & 30618)) & (-2241) & 11263;
        lIIIIIIIlI[6] = (148 ^ 147) ^ (80 ^ 107);
        lIIIIIIIlI[7] = (-20101) & 20407;
        lIIIIIIIlI[8] = (((129 + 74) - 169) + 164) ^ (((120 + 131) - 243) + 187);
        lIIIIIIIlI[9] = "  ".length();
        lIIIIIIIlI[10] = (220 ^ 189) ^ (126 ^ 63);
        lIIIIIIIlI[11] = "   ".length();
        lIIIIIIIlI[12] = (112 ^ 36) ^ (209 ^ 150);
        lIIIIIIIlI[13] = (((79 + 38) - 30) + 86) ^ (((113 + 33) - 28) + 51);
        lIIIIIIIlI[14] = 116 ^ 87;
        lIIIIIIIlI[15] = (((91 + 119) - 200) + 131) ^ (((45 + 104) - 49) + 91);
        lIIIIIIIlI[16] = 11 ^ 13;
        lIIIIIIIlI[17] = (-19457) & 20466;
        lIIIIIIIlI[18] = (-((-19036) & 28255)) & (-4289) & 15583;
        lIIIIIIIlI[19] = 130 ^ 139;
        lIIIIIIIlI[20] = 146 ^ 149;
        lIIIIIIIlI[21] = (136 ^ 172) ^ (146 ^ 190);
        lIIIIIIIlI[22] = 44 ^ 4;
        lIIIIIIIlI[23] = (((158 + 68) - 208) + 185) ^ (((151 + 89) - 181) + 133);
        lIIIIIIIlI[24] = (116 ^ 50) ^ (250 ^ 176);
        lIIIIIIIlI[25] = 137 ^ 132;
        lIIIIIIIlI[26] = 98 ^ 108;
        lIIIIIIIlI[27] = (-((-7817) & 16059)) & (-17409) & 30650;
        lIIIIIIIlI[28] = 130 ^ 141;
        lIIIIIIIlI[29] = (-12305) & 14235;
        lIIIIIIIlI[30] = (-8769) & 28383;
        lIIIIIIIlI[31] = (-4361) & 23981;
        lIIIIIIIlI[32] = (-((-9802) & 32731)) & (-9217) & 32671;
        lIIIIIIIlI[33] = (-((-1277) & 26365)) & (-5313) & 32751;
        lIIIIIIIlI[34] = (-((-24913) & 27641)) & (-5) & 15357;
        lIIIIIIIlI[35] = (95 ^ 113) ^ (136 ^ 182);
        lIIIIIIIlI[36] = (-8377) & 16383;
        lIIIIIIIlI[37] = (-8209) & 9563;
        lIIIIIIIlI[38] = (-((-387) & 8647)) & (-4097) & 14703;
        lIIIIIIIlI[39] = (-((-5833) & 16345)) & (-20513) & 32767;
        lIIIIIIIlI[40] = (-14594) & 16311;
        lIIIIIIIlI[41] = (-577) & 11072;
        lIIIIIIIlI[42] = 41 ^ 56;
        lIIIIIIIlI[43] = (-(42 ^ 56)) & (-16389) & 24415;
        lIIIIIIIlI[44] = (-13464) & 14015;
        lIIIIIIIlI[45] = (-5133) & 6127;
        lIIIIIIIlI[46] = 19 ^ 1;
        lIIIIIIIlI[47] = 111 ^ 119;
        lIIIIIIIlI[48] = (126 ^ 56) ^ (107 ^ 57);
        lIIIIIIIlI[49] = (90 ^ 33) ^ (67 ^ 45);
        lIIIIIIIlI[50] = (227 ^ 171) ^ (205 ^ 147);
        lIIIIIIIlI[51] = 171 ^ 188;
        lIIIIIIIlI[52] = (-28679) & 31775;
        lIIIIIIIlI[53] = (-21016) & 24375;
        lIIIIIIIlI[54] = 36 ^ 61;
        lIIIIIIIlI[55] = 36 ^ 62;
        lIIIIIIIlI[56] = (-29254) & 32607;
        lIIIIIIIlI[57] = 78 ^ 85;
        lIIIIIIIlI[58] = 190 ^ 162;
        lIIIIIIIlI[59] = 53 ^ 40;
        lIIIIIIIlI[60] = (-(19 ^ 82)) & (-28425) & 32766;
        lIIIIIIIlI[61] = (-28965) & 32629;
        lIIIIIIIlI[62] = (-24641) & 28159;
        lIIIIIIIlI[63] = (-18497) & 22782;
        lIIIIIIIlI[64] = 8 ^ 22;
        lIIIIIIIlI[65] = (((132 + 55) - 79) + 57) ^ (((29 + 50) - 72) + 179);
        lIIIIIIIlI[66] = 181 ^ 148;
        lIIIIIIIlI[67] = (((58 + 63) - 34) + 65) ^ (((102 + 147) - 85) + 22);
        lIIIIIIIlI[68] = (((48 + 145) - 77) + 49) ^ (((123 + 18) - 26) + 14);
        lIIIIIIIlI[69] = 229 ^ 192;
        lIIIIIIIlI[70] = 88 ^ 126;
        lIIIIIIIlI[71] = 137 ^ 174;
        lIIIIIIIlI[72] = 166 ^ 143;
        lIIIIIIIlI[73] = (-6660) & 65159;
        lIIIIIIIlI[74] = (-43) & 63342;
        lIIIIIIIlI[75] = (((86 + 54) - 11) + 14) ^ (((89 + 61) - 16) + 31);
        lIIIIIIIlI[76] = (112 ^ 45) ^ (195 ^ 181);
        lIIIIIIIlI[77] = 29 ^ 49;
        lIIIIIIIlI[78] = (28 ^ 72) ^ (69 ^ 60);
        lIIIIIIIlI[79] = 66 ^ 108;
        lIIIIIIIlI[80] = 161 ^ 142;
        lIIIIIIIlI[81] = (234 ^ 173) ^ (245 ^ 130);
        lIIIIIIIlI[82] = 180 ^ 133;
        lIIIIIIIlI[83] = (-18465) & 20389;
        lIIIIIIIlI[84] = 128 ^ 179;
        lIIIIIIIlI[85] = (35 ^ 16) ^ (156 ^ 155);
        lIIIIIIIlI[86] = 114 ^ 71;
        lIIIIIIIlI[87] = (230 ^ 136) ^ (73 ^ 17);
        lIIIIIIIlI[88] = (((84 + 177) - 243) + 167) ^ (((83 + 50) - 53) + 62);
        lIIIIIIIlI[89] = (((2 + 115) - 112) + 208) ^ (((55 + 43) - 37) + 86);
        lIIIIIIIlI[90] = 48 ^ 121;
        lIIIIIIIlI[91] = (-((-1391) & 30591)) & (-2) & 32663;
        lIIIIIIIlI[92] = (-12801) & 16359;
        lIIIIIIIlI[93] = 25 ^ 33;
        lIIIIIIIlI[94] = 24 ^ 33;
        lIIIIIIIlI[95] = (105 ^ 99) ^ (129 ^ 199);
        lIIIIIIIlI[96] = (((53 + 81) - 12) + 50) ^ (((8 + 85) - 69) + 126);
        lIIIIIIIlI[97] = (128 ^ 163) ^ (33 ^ 82);
        lIIIIIIIlI[98] = (73 ^ 64) ^ (189 ^ 143);
        lIIIIIIIlI[99] = (((135 + 210) - 321) + 229) ^ (((128 + 126) - 92) + 5);
        lIIIIIIIlI[100] = 79 ^ 43;
        lIIIIIIIlI[101] = (((89 + 47) - 115) + 132) ^ (((40 + 27) - 24) + 121);
        lIIIIIIIlI[102] = (((150 + 5) - 107) + 103) ^ (((1 + 59) - (-9)) + 100);
        lIIIIIIIlI[103] = (-((-16899) & 21171)) & (-1) & 8125;
        lIIIIIIIlI[104] = 40 ^ 23;
        lIIIIIIIlI[105] = 18 ^ 106;
        lIIIIIIIlI[106] = ((32 + 25) - (-57)) + 16;
        lIIIIIIIlI[107] = (18 ^ 6) ^ (239 ^ 187);
        lIIIIIIIlI[108] = (((133 ^ 156) + (229 ^ 186)) - (27 ^ 14)) + (76 ^ 101);
        lIIIIIIIlI[109] = 118 ^ 52;
        lIIIIIIIlI[110] = (-9217) & 12193;
        lIIIIIIIlI[111] = (-((-2057) & 22873)) & (-9) & 24063;
        lIIIIIIIlI[112] = (-((-26377) & 30559)) & (-8705) & 16126;
        lIIIIIIIlI[113] = (((92 + 86) - 69) + 25) ^ (((174 + 63) - 56) + 16);
        lIIIIIIIlI[114] = 31 ^ 91;
        lIIIIIIIlI[115] = (162 ^ 146) ^ (117 ^ 0);
        lIIIIIIIlI[116] = (((196 ^ 190) + (11 ^ 59)) - (45 ^ 0)) + (131 ^ 154);
        lIIIIIIIlI[117] = (-((-21153) & 21435)) & (-4161) & 7551;
        lIIIIIIIlI[118] = (-20514) & 23859;
        lIIIIIIIlI[119] = " ".length() ^ (234 ^ 172);
        lIIIIIIIlI[120] = 119 ^ 63;
        lIIIIIIIlI[121] = (((((103 + 138) - 167) + 84) + (51 ^ 3)) - (((103 + 61) - 73) + 91)) + ((58 + 97) - 23) + 4;
        lIIIIIIIlI[122] = (((164 ^ 194) + (50 ^ 82)) - (39 ^ 15)) + (163 ^ 175);
        lIIIIIIIlI[123] = (-((-6185) & 23721)) & (-4101) & 24567;
        lIIIIIIIlI[124] = (-((-10949) & 27335)) & (-546) & 20467;
        lIIIIIIIlI[125] = 96 ^ 42;
        lIIIIIIIlI[126] = 5 ^ 78;
        lIIIIIIIlI[127] = (((79 ^ 99) + (184 ^ 138)) - (148 ^ 161)) + ((98 + 107) - 69) + 3;
        lIIIIIIIlI[128] = 121 ^ 52;
        lIIIIIIIlI[129] = (103 ^ 92) ^ (73 ^ 60);
        lIIIIIIIlI[130] = (((9 + 36) - 3) + 97) ^ (((60 + 47) - (-79)) + 10);
        lIIIIIIIlI[131] = (((87 ^ 21) + (174 ^ 138)) - (-(165 ^ 174))) + (0 ^ 77);
        lIIIIIIIlI[132] = ((154 + 4) - 84) + 126;
        lIIIIIIIlI[133] = (-13317) & 13796;
        lIIIIIIIlI[134] = 58 ^ 107;
        lIIIIIIIlI[135] = 65 ^ 19;
        lIIIIIIIlI[136] = ((0 + 25) - (-15)) + 170;
        lIIIIIIIlI[137] = (((80 ^ 61) + (((83 + 119) - 142) + 105)) - (((147 + 148) - 221) + 112)) + ((78 + 33) - 52) + 73;
        lIIIIIIIlI[138] = 113 ^ 34;
        lIIIIIIIlI[139] = (51 ^ 32) ^ (51 ^ 116);
        lIIIIIIIlI[140] = (((87 + 137) - 99) + 25) ^ (((127 + 79) - 41) + 30);
        lIIIIIIIlI[141] = (((((107 + 202) - 153) + 66) + (((101 + 108) - 64) + 8)) - (((1 + 89) - 62) + 221)) + (23 ^ 127);
        lIIIIIIIlI[142] = 33 ^ 119;
        lIIIIIIIlI[143] = 1 ^ 86;
        lIIIIIIIlI[144] = 206 ^ 150;
        lIIIIIIIlI[145] = 22 ^ 79;
        lIIIIIIIlI[146] = 243 ^ 168;
        lIIIIIIIlI[147] = (-30728) & 32127;
        lIIIIIIIlI[148] = (-6413) & 8012;
        lIIIIIIIlI[149] = (-((-11338) & 27723)) & (-6277) & 31981;
        lIIIIIIIlI[150] = (-((-7001) & 32761)) & (-1) & 32760;
        lIIIIIIIlI[151] = (-((-3474) & 11709)) & (-18437) & 28671;
        lIIIIIIIlI[152] = (-530) & 6079;
        lIIIIIIIlI[153] = (-((-10845) & 14942)) & (-19) & 30675;
        lIIIIIIIlI[154] = (-(101 ^ 97)) & (-17425) & 18427;
        lIIIIIIIlI[155] = (-20609) & 24063;
        lIIIIIIIlI[156] = (-50) & 12029;
        lIIIIIIIlI[157] = (-2643) & 27642;
        lIIIIIIIlI[158] = (-((-7861) & 24253)) & (-6241) & 23932;
        lIIIIIIIlI[159] = (((80 + 146) - 70) + 97) ^ (((41 + 41) - (-25)) + 54);
        lIIIIIIIlI[160] = (148 ^ 158) ^ (199 ^ 144);
        lIIIIIIIlI[161] = (94 ^ 5) ^ (72 ^ 77);
        lIIIIIIIlI[162] = (91 ^ 124) ^ (205 ^ 181);
        lIIIIIIIlI[163] = (-833) & 3923;
        lIIIIIIIlI[164] = (-((-25675) & 30411)) & (-24577) & 32749;
        lIIIIIIIlI[165] = (-((-3553) & 16371)) & (-65) & 16383;
        lIIIIIIIlI[166] = (((154 ^ 142) + (((132 + 165) - 192) + 115)) - (31 ^ 13)) + (121 ^ 88);
        lIIIIIIIlI[167] = (-24971) & 28063;
        lIIIIIIIlI[168] = (-((-5390) & 30703)) & (-1) & 28671;
        lIIIIIIIlI[169] = (-1299) & 4095;
        lIIIIIIIlI[170] = (-((-4167) & 29295)) & (-4098) & 32639;
        lIIIIIIIlI[171] = (-16794) & 20413;
        lIIIIIIIlI[172] = (-((-18727) & 22831)) & (-16945) & 24575;
        lIIIIIIIlI[173] = (((160 + 88) - 196) + 147) ^ (((138 + 25) - 115) + 119);
        lIIIIIIIlI[174] = 69 ^ 36;
        lIIIIIIIlI[175] = (((142 + 155) - 274) + 190) ^ (((110 + 182) - 171) + 62);
        lIIIIIIIlI[176] = 79 ^ 44;
        lIIIIIIIlI[177] = (((105 + 21) - 48) + 164) ^ (((123 + 44) - 69) + 53);
        lIIIIIIIlI[178] = (66 ^ 88) ^ (95 ^ 35);
        lIIIIIIIlI[179] = (((119 + 43) - 90) + 168) ^ (((41 + 99) - 79) + 90);
        lIIIIIIIlI[180] = (((153 + 222) - 148) + 1) ^ (((137 + 9) - 40) + 34);
        lIIIIIIIlI[181] = (((65 + 192) - 145) + 89) ^ (((80 + 114) - 175) + 141);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[16]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0179, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[28]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x028f, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[13]) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0318, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[8]) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[8]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x058d, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[13]) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[4]) != false) goto L81;
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
    private static void Q() {
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
        int[] iArr14 = new int[lIIIIIIIlI[0]];
        iArr14[lIIIIIIIlI[1]] = lIIIIIIIlI[43];
        if (llIllIllIIlI(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIIIIIIIlI[0]];
            iArr15[lIIIIIIIlI[1]] = lIIIIIIIlI[43];
            if (llIllIllIIlI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIIIIIIlI[0]];
                iArr16[lIIIIIIIlI[1]] = lIIIIIIIlI[43];
            }
            iArr = new int[lIIIIIIIlI[0]];
            iArr[lIIIIIIIlI[1]] = lIIIIIIIlI[30];
            if (llIllIllIIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIIIIlI[0]];
                iArr17[lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                if (llIllIllIIlI(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIIIIIIlI[0]];
                    iArr18[lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                }
                iArr2 = new int[lIIIIIIIlI[0]];
                iArr2[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                if (llIllIllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr19 = new int[lIIIIIIIlI[0]];
                    iArr19[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                    if (llIllIllIIlI(Bank.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lIIIIIIIlI[0]];
                        iArr20[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                    }
                    iArr3 = new int[lIIIIIIIlI[0]];
                    iArr3[lIIIIIIIlI[1]] = lIIIIIIIlI[103];
                    if (llIllIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
                        bx.add(new C0003d(lIIIIIIIlI[103], lIIIIIIIlI[8], lIIIIIIIlI[151]));
                        "".length();
                    }
                    iArr4 = new int[lIIIIIIIlI[0]];
                    iArr4[lIIIIIIIlI[1]] = lIIIIIIIlI[37];
                    if (llIllIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
                        bx.add(new C0003d(lIIIIIIIlI[37], lIIIIIIIlI[0], lIIIIIIIlI[27]));
                        "".length();
                    }
                    iArr5 = new int[lIIIIIIIlI[0]];
                    iArr5[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                    if (llIllIllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr21 = new int[lIIIIIIIlI[0]];
                        iArr21[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                        if (llIllIllIIlI(Bank.contains(iArr21) ? 1 : 0)) {
                            int[] iArr22 = new int[lIIIIIIIlI[0]];
                            iArr22[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                        }
                        iArr6 = new int[lIIIIIIIlI[0]];
                        iArr6[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                        if (llIllIllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr23 = new int[lIIIIIIIlI[0]];
                            iArr23[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            if (llIllIllIIlI(Bank.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[lIIIIIIIlI[0]];
                                iArr24[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            }
                            iArr7 = new int[lIIIIIIIlI[0]];
                            iArr7[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                            if (llIllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr25 = new int[lIIIIIIIlI[0]];
                                iArr25[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                if (llIllIllIIlI(Bank.contains(iArr25) ? 1 : 0)) {
                                    int[] iArr26 = new int[lIIIIIIIlI[0]];
                                    iArr26[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                }
                                iArr8 = new int[lIIIIIIIlI[0]];
                                iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[39];
                                if (llIllIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
                                    bx.add(new C0003d(lIIIIIIIlI[39], lIIIIIIIlI[0], lIIIIIIIlI[27]));
                                    "".length();
                                }
                                iArr9 = new int[lIIIIIIIlI[0]];
                                iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[38];
                                if (llIllIllIlII(Bank.contains(iArr9) ? 1 : 0)) {
                                    bx.add(new C0003d(lIIIIIIIlI[38], lIIIIIIIlI[0], lIIIIIIIlI[27]));
                                    "".length();
                                }
                                iArr10 = new int[lIIIIIIIlI[0]];
                                iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[40];
                                if (llIllIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
                                    bx.add(new C0003d(lIIIIIIIlI[40], lIIIIIIIlI[0], lIIIIIIIlI[152]));
                                    "".length();
                                }
                                iArr11 = new int[lIIIIIIIlI[0]];
                                iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[41];
                                if (llIllIllIlII(Bank.contains(iArr11) ? 1 : 0)) {
                                    bx.add(new C0003d(lIIIIIIIlI[41], lIIIIIIIlI[0], lIIIIIIIlI[153] + C0004e.c(lIIIIIIIlI[154], lIIIIIIIlI[155])));
                                    "".length();
                                }
                                if (llIllIllIlII(Bank.contains(item -> {
                                    return item.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]);
                                }) ? 1 : 0)) {
                                    bx.add(new C0003d(lIIIIIIIlI[156], lIIIIIIIlI[8], lIIIIIIIlI[157]));
                                    "".length();
                                }
                                iArr12 = new int[lIIIIIIIlI[0]];
                                iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                                if (llIllIllIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                                    int[] iArr27 = new int[lIIIIIIIlI[0]];
                                    iArr27[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                                    if (llIllIllIIlI(Bank.contains(iArr27) ? 1 : 0)) {
                                        int[] iArr28 = new int[lIIIIIIIlI[0]];
                                        iArr28[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                                    }
                                    iArr13 = new int[lIIIIIIIlI[0]];
                                    iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                                    if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                                        int[] iArr29 = new int[lIIIIIIIlI[0]];
                                        iArr29[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                                        if (!llIllIllIIlI(Bank.contains(iArr29) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr30 = new int[lIIIIIIIlI[0]];
                                        iArr30[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                                        if (!llIllIllIIll(Bank.getFirst(iArr30).getQuantity(), lIIIIIIIlI[28])) {
                                            return;
                                        }
                                    }
                                    bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
                                    "".length();
                                }
                                bx.add(new C0003d(lIIIIIIIlI[34], lIIIIIIIlI[13], C0009j.ch));
                                "".length();
                                iArr13 = new int[lIIIIIIIlI[0]];
                                iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                                if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
                                "".length();
                            }
                            bx.add(new C0003d(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]));
                            "".length();
                            iArr8 = new int[lIIIIIIIlI[0]];
                            iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[39];
                            if (llIllIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            iArr9 = new int[lIIIIIIIlI[0]];
                            iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[38];
                            if (llIllIllIlII(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            iArr10 = new int[lIIIIIIIlI[0]];
                            iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[40];
                            if (llIllIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[lIIIIIIIlI[0]];
                            iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[41];
                            if (llIllIllIlII(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            if (llIllIllIlII(Bank.contains(item2 -> {
                                return item2.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]);
                            }) ? 1 : 0)) {
                            }
                            iArr12 = new int[lIIIIIIIlI[0]];
                            iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                            if (llIllIllIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lIIIIIIIlI[34], lIIIIIIIlI[13], C0009j.ch));
                            "".length();
                            iArr13 = new int[lIIIIIIIlI[0]];
                            iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                            if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
                            "".length();
                        }
                        bx.add(new C0003d(lIIIIIIIlI[33], lIIIIIIIlI[8], lIIIIIIIlI[27]));
                        "".length();
                        iArr7 = new int[lIIIIIIIlI[0]];
                        iArr7[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                        if (llIllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]));
                        "".length();
                        iArr8 = new int[lIIIIIIIlI[0]];
                        iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[39];
                        if (llIllIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        iArr9 = new int[lIIIIIIIlI[0]];
                        iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[38];
                        if (llIllIllIlII(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        iArr10 = new int[lIIIIIIIlI[0]];
                        iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[40];
                        if (llIllIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[lIIIIIIIlI[0]];
                        iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[41];
                        if (llIllIllIlII(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        if (llIllIllIlII(Bank.contains(item22 -> {
                            return item22.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[lIIIIIIIlI[0]];
                        iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (llIllIllIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIIIIlI[34], lIIIIIIIlI[13], C0009j.ch));
                        "".length();
                        iArr13 = new int[lIIIIIIIlI[0]];
                        iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                        if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
                        "".length();
                    }
                    bx.add(new C0003d(lIIIIIIIlI[32], lIIIIIIIlI[13], lIIIIIIIlI[27]));
                    "".length();
                    iArr6 = new int[lIIIIIIIlI[0]];
                    iArr6[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                    if (llIllIllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIIIIlI[33], lIIIIIIIlI[8], lIIIIIIIlI[27]));
                    "".length();
                    iArr7 = new int[lIIIIIIIlI[0]];
                    iArr7[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                    if (llIllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]));
                    "".length();
                    iArr8 = new int[lIIIIIIIlI[0]];
                    iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[39];
                    if (llIllIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[lIIIIIIIlI[0]];
                    iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[38];
                    if (llIllIllIlII(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIIIIIIIlI[0]];
                    iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[40];
                    if (llIllIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[lIIIIIIIlI[0]];
                    iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[41];
                    if (llIllIllIlII(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    if (llIllIllIlII(Bank.contains(item222 -> {
                        return item222.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[lIIIIIIIlI[0]];
                    iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                    if (llIllIllIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIIIIlI[34], lIIIIIIIlI[13], C0009j.ch));
                    "".length();
                    iArr13 = new int[lIIIIIIIlI[0]];
                    iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                    if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
                    "".length();
                }
                bx.add(new C0003d(lIIIIIIIlI[31], lIIIIIIIlI[28], lIIIIIIIlI[150]));
                "".length();
                iArr3 = new int[lIIIIIIIlI[0]];
                iArr3[lIIIIIIIlI[1]] = lIIIIIIIlI[103];
                if (llIllIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
                }
                iArr4 = new int[lIIIIIIIlI[0]];
                iArr4[lIIIIIIIlI[1]] = lIIIIIIIlI[37];
                if (llIllIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIIIIIIIlI[0]];
                iArr5[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                if (llIllIllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIIIIlI[32], lIIIIIIIlI[13], lIIIIIIIlI[27]));
                "".length();
                iArr6 = new int[lIIIIIIIlI[0]];
                iArr6[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                if (llIllIllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIIIIlI[33], lIIIIIIIlI[8], lIIIIIIIlI[27]));
                "".length();
                iArr7 = new int[lIIIIIIIlI[0]];
                iArr7[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                if (llIllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]));
                "".length();
                iArr8 = new int[lIIIIIIIlI[0]];
                iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[39];
                if (llIllIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIIIIIIIlI[0]];
                iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[38];
                if (llIllIllIlII(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIIIIIIIlI[0]];
                iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[40];
                if (llIllIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIIIIIIIlI[0]];
                iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[41];
                if (llIllIllIlII(Bank.contains(iArr11) ? 1 : 0)) {
                }
                if (llIllIllIlII(Bank.contains(item2222 -> {
                    return item2222.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[lIIIIIIIlI[0]];
                iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                if (llIllIllIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIIIIlI[34], lIIIIIIIlI[13], C0009j.ch));
                "".length();
                iArr13 = new int[lIIIIIIIlI[0]];
                iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
                "".length();
            }
            bx.add(new C0003d(lIIIIIIIlI[30], lIIIIIIIlI[16], lIIIIIIIlI[149]));
            "".length();
            iArr2 = new int[lIIIIIIIlI[0]];
            iArr2[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
            if (llIllIllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIIIIlI[31], lIIIIIIIlI[28], lIIIIIIIlI[150]));
            "".length();
            iArr3 = new int[lIIIIIIIlI[0]];
            iArr3[lIIIIIIIlI[1]] = lIIIIIIIlI[103];
            if (llIllIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIIIIIlI[0]];
            iArr4[lIIIIIIIlI[1]] = lIIIIIIIlI[37];
            if (llIllIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIIIIIIlI[0]];
            iArr5[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
            if (llIllIllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIIIIlI[32], lIIIIIIIlI[13], lIIIIIIIlI[27]));
            "".length();
            iArr6 = new int[lIIIIIIIlI[0]];
            iArr6[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
            if (llIllIllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIIIIlI[33], lIIIIIIIlI[8], lIIIIIIIlI[27]));
            "".length();
            iArr7 = new int[lIIIIIIIlI[0]];
            iArr7[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
            if (llIllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]));
            "".length();
            iArr8 = new int[lIIIIIIIlI[0]];
            iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[39];
            if (llIllIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIIIIIIIlI[0]];
            iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[38];
            if (llIllIllIlII(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIIIIIIIlI[0]];
            iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[40];
            if (llIllIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIIIIIIIlI[0]];
            iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[41];
            if (llIllIllIlII(Bank.contains(iArr11) ? 1 : 0)) {
            }
            if (llIllIllIlII(Bank.contains(item22222 -> {
                return item22222.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[lIIIIIIIlI[0]];
            iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
            if (llIllIllIIlI(Bank.contains(iArr12) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIIIIlI[34], lIIIIIIIlI[13], C0009j.ch));
            "".length();
            iArr13 = new int[lIIIIIIIlI[0]];
            iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
            if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
            "".length();
        }
        bx.add(new C0003d(lIIIIIIIlI[43], lIIIIIIIlI[4], C0004e.c(lIIIIIIIlI[147], lIIIIIIIlI[148])));
        "".length();
        iArr = new int[lIIIIIIIlI[0]];
        iArr[lIIIIIIIlI[1]] = lIIIIIIIlI[30];
        if (llIllIllIIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIIlI[30], lIIIIIIIlI[16], lIIIIIIIlI[149]));
        "".length();
        iArr2 = new int[lIIIIIIIlI[0]];
        iArr2[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
        if (llIllIllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIIlI[31], lIIIIIIIlI[28], lIIIIIIIlI[150]));
        "".length();
        iArr3 = new int[lIIIIIIIlI[0]];
        iArr3[lIIIIIIIlI[1]] = lIIIIIIIlI[103];
        if (llIllIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIIIIIlI[0]];
        iArr4[lIIIIIIIlI[1]] = lIIIIIIIlI[37];
        if (llIllIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIIIIIIlI[0]];
        iArr5[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
        if (llIllIllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIIlI[32], lIIIIIIIlI[13], lIIIIIIIlI[27]));
        "".length();
        iArr6 = new int[lIIIIIIIlI[0]];
        iArr6[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
        if (llIllIllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIIlI[33], lIIIIIIIlI[8], lIIIIIIIlI[27]));
        "".length();
        iArr7 = new int[lIIIIIIIlI[0]];
        iArr7[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
        if (llIllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]));
        "".length();
        iArr8 = new int[lIIIIIIIlI[0]];
        iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[39];
        if (llIllIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIIIIIIlI[0]];
        iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[38];
        if (llIllIllIlII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIIIIIIIlI[0]];
        iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[40];
        if (llIllIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIIIIIIIlI[0]];
        iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[41];
        if (llIllIllIlII(Bank.contains(iArr11) ? 1 : 0)) {
        }
        if (llIllIllIlII(Bank.contains(item222222 -> {
            return item222222.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[lIIIIIIIlI[0]];
        iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
        if (llIllIllIIlI(Bank.contains(iArr12) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIIlI[34], lIIIIIIIlI[13], C0009j.ch));
        "".length();
        iArr13 = new int[lIIIIIIIlI[0]];
        iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
        if (llIllIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]));
        "".length();
    }

    private static boolean llIllIllIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIlllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIllIllllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIllIllllIl(ds, lllllllll[lIIIIIIIlI[159]]) ? lllllllll[lIIIIIIIlI[160]] : "Animal Magnetism - " + ds;
    }

    private static String llIllIIllIll(String lIIlIIllllIIl, String lIIlIIlllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlI[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIlI[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIllllIlI) {
            lIIlIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static int llIllIllIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIllIllIIlI(int i) {
        return i != 0;
    }

    private static boolean llIllIlllIII(int i) {
        return i > 0;
    }

    private static void llIllIlIllII() {
        lllllllll = new String[lIIIIIIIlI[181]];
        lllllllll[lIIIIIIIlI[1]] = llIllIIllIll("MLCcHmF25WbRtB0JNhlbWPcxm09gtkB3JHnGbAgBVHcPnYH7GAeE/kieCZEQ5DAZ", "hMBqi");
        lllllllll[lIIIIIIIlI[0]] = llIllIIlllII("2emcVyOfm7vhQiQOv38+NQ==", "gzxwB");
        lllllllll[lIIIIIIIlI[9]] = llIllIIlllII("ZUotuQPJV0LRcT+1nrW9wQ==", "BqaTj");
        lllllllll[lIIIIIIIlI[11]] = llIllIIlllIl("KhsiCjgbSTgHLk8qJAYoBAwi", "oiLoK");
        lllllllll[lIIIIIIIlI[13]] = llIllIIlllII("CiJINHNfYdFRAmEv2UQ2ng==", "xBqQt");
        lllllllll[lIIIIIIIlI[8]] = llIllIIllIll("ODpW+SRB9Ymc+ABATz6Mgw==", "QKefd");
        lllllllll[lIIIIIIIlI[16]] = llIllIIlllIl("ARUbIB48CR1pAjQJHSw=", "UgzIp");
        lllllllll[lIIIIIIIlI[20]] = llIllIIlllIl("IxceJAEWHUwHGxwM", "uvlVn");
        lllllllll[lIIIIIIIlI[21]] = llIllIIllIll("avqHVtJWPDu2C9Zs24oWsw==", "sPlCc");
        lllllllll[lIIIIIIIlI[19]] = llIllIIllIll("uUno22p2WNTwJsGiso8K2g==", "bxYug");
        lllllllll[lIIIIIIIlI[4]] = llIllIIllIll("C+5F1Apa/x/TgP7mGi5dwg==", "YxIyQ");
        lllllllll[lIIIIIIIlI[23]] = llIllIIlllII("VOCnPyoKMVCquzjao56oe0dhS2+8uV0l", "ROBij");
        lllllllll[lIIIIIIIlI[24]] = llIllIIlllII("HuosCk61md6YhDHhjHeOgg==", "sILup");
        lllllllll[lIIIIIIIlI[25]] = llIllIIlllIl("", "DpcMz");
        lllllllll[lIIIIIIIlI[26]] = llIllIIllIll("abYgc6QkJbxgVxH3oTvbKw==", "RpAhJ");
        lllllllll[lIIIIIIIlI[28]] = llIllIIllIll("KKtmbX7rod3xHZFqll4cysTjTg9Po0Vy", "sNzYl");
        lllllllll[lIIIIIIIlI[35]] = llIllIIlllII("iOe0RyljqVJzx3aBc64V6L+B4L/wvDSG0JI4BrlbX7aoVmoeClurTsVHRGc/lbtmPLU4xV/3xqY=", "jmtTt");
        lllllllll[lIIIIIIIlI[42]] = llIllIIlllIl("LStMDxYfbgEHFwknAglECzsJHRBaPRkeFBYnCR1IWj0bBxAZJgUAA1o6A04mLxclICM=", "zNlnd");
        lllllllll[lIIIIIIIlI[46]] = llIllIIlllIl("JhUGLyQ=", "bgoAO");
        lllllllll[lIIIIIIIlI[12]] = llIllIIlllIl("ADYYJwg=", "DDqIc");
        lllllllll[lIIIIIIIlI[48]] = llIllIIlllIl("JiUEAAo=", "uMera");
        lllllllll[lIIIIIIIlI[49]] = llIllIIlllII("SCjp3RJCYdA=", "gBZaR");
        lllllllll[lIIIIIIIlI[50]] = llIllIIlllIl("ATEB", "DPuaf");
        lllllllll[lIIIIIIIlI[51]] = llIllIIllIll("p5K6PmSIU9u1JSw7qr7rgA==", "pZcTS");
        lllllllll[lIIIIIIIlI[47]] = llIllIIlllIl("JAQb", "erzWM");
        lllllllll[lIIIIIIIlI[54]] = llIllIIlllII("/YqjcFsJf11nqwdgJcr+Pg==", "RDkdw");
        lllllllll[lIIIIIIIlI[55]] = llIllIIlllIl("FB07Hzcv", "GxZmT");
        lllllllll[lIIIIIIIlI[57]] = llIllIIlllIl("CC0dBjUrMRc=", "JBrmV");
        lllllllll[lIIIIIIIlI[58]] = llIllIIlllII("q99Ia00Qwn4=", "ySzTM");
        lllllllll[lIIIIIIIlI[59]] = llIllIIlllII("WiGKuvDnJ+U=", "nebXJ");
        lllllllll[lIIIIIIIlI[64]] = llIllIIlllIl("AgAeVzMjQQsfJj4VDQU=", "LahwG");
        lllllllll[lIIIIIIIlI[65]] = llIllIIllIll("SZOY0Ac106TmTJSfDivFzO1Os3U2TBWx", "dMHbj");
        lllllllll[lIIIIIIIlI[10]] = llIllIIlllII("rxBeDKSdbcM=", "LWjQE");
        lllllllll[lIIIIIIIlI[66]] = llIllIIllIll("yDJm1PM1Myg=", "rvEsu");
        lllllllll[lIIIIIIIlI[67]] = llIllIIlllIl("PDQ+aj0ddS0pPR0=", "rUHJI");
        lllllllll[lIIIIIIIlI[14]] = llIllIIlllII("6wBk8Myda/c=", "fkCPA");
        lllllllll[lIIIIIIIlI[68]] = llIllIIlllIl("CicWPCI6MgQw", "YSwUP");
        lllllllll[lIIIIIIIlI[69]] = llIllIIlllII("ERlaw3SBN8GxMTm/tYOWvg==", "bqALS");
        lllllllll[lIIIIIIIlI[70]] = llIllIIlllIl("OTgRCSwH", "uWpmI");
        lllllllll[lIIIIIIIlI[71]] = llIllIIlllII("RDMQ8KYZWFk=", "BUhDC");
        lllllllll[lIIIIIIIlI[22]] = llIllIIlllII("cDuZ1rjAtpY=", "pGYBF");
        lllllllll[lIIIIIIIlI[72]] = llIllIIlllIl("LxszPi4R", "ctRZK");
        lllllllll[lIIIIIIIlI[75]] = llIllIIlllII("4fJO8V2Qsg0=", "hNXao");
        lllllllll[lIIIIIIIlI[76]] = llIllIIlllIl("MAIZKycAFwsn", "cvxBU");
        lllllllll[lIIIIIIIlI[77]] = llIllIIlllII("JKwOdYIJjYQU2BKEnxWCRQ==", "tuzrX");
        lllllllll[lIIIIIIIlI[78]] = llIllIIlllIl("Mz06MwAUMzg=", "qRTVm");
        lllllllll[lIIIIIIIlI[79]] = llIllIIlllII("B5/W4IVycSKoFqYyPZ7X0g==", "wvyjH");
        lllllllll[lIIIIIIIlI[80]] = llIllIIlllIl("AQQ2GC4/Gw==", "VkDkF");
        lllllllll[lIIIIIIIlI[81]] = llIllIIllIll("McZz+ABMyBQvFy0t9rxK8A==", "wNKTc");
        lllllllll[lIIIIIIIlI[82]] = llIllIIllIll("rrEHjkrZRovbaZH4BXJ/3A==", "nezrO");
        lllllllll[lIIIIIIIlI[15]] = llIllIIllIll("MgCs0kOrFRI=", "cZUSI");
        lllllllll[lIIIIIIIlI[84]] = llIllIIlllIl("Lhw/Lhc=", "opVMr");
        lllllllll[lIIIIIIIlI[85]] = llIllIIlllII("4+JpwHDwmQ0=", "slwkt");
        lllllllll[lIIIIIIIlI[86]] = llIllIIllIll("LTvr/TGiwug=", "aJJeC");
        lllllllll[lIIIIIIIlI[87]] = llIllIIlllIl("KwQfFxsKCA==", "festt");
        lllllllll[lIIIIIIIlI[88]] = llIllIIlllII("s4RIEPhYeQg=", "xzKDv");
        lllllllll[lIIIIIIIlI[93]] = llIllIIlllIl("BTkdeCEkeAgqOiU9", "KXkXU");
        lllllllll[lIIIIIIIlI[94]] = llIllIIlllIl("NzspaDMKOCMt", "xWMHP");
        lllllllll[lIIIIIIIlI[96]] = llIllIIlllIl("IgoeNSADBg==", "okrVO");
        lllllllll[lIIIIIIIlI[98]] = llIllIIllIll("HOyJRAsNEGI=", "XjGwH");
        lllllllll[lIIIIIIIlI[6]] = llIllIIllIll("dS9Gifn1eZo=", "RTNlI");
        lllllllll[lIIIIIIIlI[101]] = llIllIIllIll("YNnd34H3yJTmvXO0dYC1vA==", "DLWQP");
        lllllllll[lIIIIIIIlI[102]] = llIllIIllIll("AA6y9keVpwq5x0weA/Hffw==", "UChTv");
        lllllllll[lIIIIIIIlI[104]] = llIllIIlllII("Y6fVwWlVyOI/FvDuAUldEg==", "VLvCM");
        lllllllll[lIIIIIIIlI[107]] = llIllIIlllII("dy/FfhFTtTc=", "ClAOz");
        lllllllll[lIIIIIIIlI[3]] = llIllIIlllII("f37zndIbffQ=", "ZrLYH");
        lllllllll[lIIIIIIIlI[109]] = llIllIIllIll("e1FIQeuIs132PzOVu+VzJw==", "sjeYn");
        lllllllll[lIIIIIIIlI[113]] = llIllIIlllIl("HxYXVSc+VwwcPTQ=", "QwauS");
        lllllllll[lIIIIIIIlI[114]] = llIllIIlllIl("MgQiChII", "zeOgw");
        lllllllll[lIIIIIIIlI[115]] = llIllIIlllII("RT9y2iu1v3i0QlPHcCTuIg==", "OBkqV");
        lllllllll[lIIIIIIIlI[89]] = llIllIIlllII("YrEBSQwmz98O7cpD/X0YXg==", "LVTjU");
        lllllllll[lIIIIIIIlI[119]] = llIllIIlllII("hUr47BSmlY42quSPR23W0Q==", "FGBnN");
        lllllllll[lIIIIIIIlI[120]] = llIllIIlllII("hiyyXjK4usw=", "YMNxk");
        lllllllll[lIIIIIIIlI[90]] = llIllIIlllIl("EzAsOg==", "DUMHY");
        lllllllll[lIIIIIIIlI[125]] = llIllIIlllII("e/WDKcO1kNd3hrhAIaxktQ==", "IVcgx");
        lllllllll[lIIIIIIIlI[126]] = llIllIIlllII("3afeQQuG9PI=", "OJrDq");
        lllllllll[lIIIIIIIlI[95]] = llIllIIlllII("SoYtvDnfK78=", "ZyaOz");
        lllllllll[lIIIIIIIlI[128]] = llIllIIlllIl("HycmHycuaTYNLy06", "JIBzF");
        lllllllll[lIIIIIIIlI[129]] = llIllIIlllIl("HgkgHAIvRzALBi4=", "KgDyc");
        lllllllll[lIIIIIIIlI[130]] = llIllIIlllIl("GRoZBQ==", "Zrvuv");
        lllllllll[lIIIIIIIlI[97]] = llIllIIllIll("T1BLsoCao5nzkDtwpzIW8A==", "fzkPM");
        lllllllll[lIIIIIIIlI[134]] = llIllIIlllIl("EzQVBwczMg5CCC4lAxE=", "AQfbf");
        lllllllll[lIIIIIIIlI[135]] = llIllIIlllIl("DB4MDwo0DRkE", "Xlmay");
        lllllllll[lIIIIIIIlI[138]] = llIllIIllIll("0tyXzXcLQqCpPW1vpIPO5w==", "gAuRW");
        lllllllll[lIIIIIIIlI[139]] = llIllIIlllII("yWm+0Kp+plQxWDl02UM4rQ==", "fijZY");
        lllllllll[lIIIIIIIlI[140]] = llIllIIlllII("AWW2p/tLaRvWQw+LzxArrA==", "FTnMI");
        lllllllll[lIIIIIIIlI[142]] = llIllIIlllII("0XEuMU6jiz+/Gb16PUWSJA==", "Clnra");
        lllllllll[lIIIIIIIlI[143]] = llIllIIlllII("O9APWawi2c0=", "YXKAo");
        lllllllll[lIIIIIIIlI[144]] = llIllIIlllIl("GTYcVjw4dxkCKSUj", "WWjvH");
        lllllllll[lIIIIIIIlI[145]] = llIllIIllIll("399ZonIFrQI=", "eovff");
        lllllllll[lIIIIIIIlI[99]] = llIllIIlllII("yv/AehGyWzlAtU5ULDUqRg==", "NQpTC");
        lllllllll[lIIIIIIIlI[146]] = llIllIIlllII("Oj6gsOjwfjk=", "PNJYX");
        lllllllll[lIIIIIIIlI[159]] = llIllIIlllIl("", "rLXtq");
        lllllllll[lIIIIIIIlI[160]] = llIllIIllIll("O6kcVrlIxIf7bwRB+OmoWIj4ZKKkIP6w", "eeBEv");
        lllllllll[lIIIIIIIlI[161]] = llIllIIlllII("crIOKdP98XBhwxwCXgHbHFGTtkaaoeug", "xppri");
        lllllllll[lIIIIIIIlI[162]] = llIllIIllIll("mjNvBnwobdA=", "aMQsm");
        lllllllll[lIIIIIIIlI[173]] = llIllIIllIll("7/WXTMgEqks=", "PguPC");
        lllllllll[lIIIIIIIlI[174]] = llIllIIllIll("DHDyLyDZk+uDiRvoXBeCVzsVEeZ5ZgWH", "wdjUN");
        lllllllll[lIIIIIIIlI[175]] = llIllIIllIll("lnCwtBnMcHbaegA28hPgyBWZU6XlLvg5rSLcjo36lAqVc06NR/GAct0MP+dkfATC", "yFKTr");
        lllllllll[lIIIIIIIlI[176]] = llIllIIlllII("8Q9001b3vqmXdSdDw/Wf3u+ABS93XbDlKY6eNb+PYNVu9jmSRLW6Fw==", "EVaUQ");
        lllllllll[lIIIIIIIlI[100]] = llIllIIlllII("Vh+TPswxjkuSl1lwCmNuizQWPPN3+3Zm", "DWmdR");
        lllllllll[lIIIIIIIlI[177]] = llIllIIllIll("byFQjirpf7Yr4crlr3+1Fjl0mVsT3hPi", "MsUgb");
        lllllllll[lIIIIIIIlI[178]] = llIllIIlllII("NkgYDvKqQzYLBdTfLNN70bSWmlP9WA6coMSmL2dFTy444RR0gZ5AcnLTXh1POxsR", "ixClb");
        lllllllll[lIIIIIIIlI[179]] = llIllIIlllIl("J2YuTSEBNy9NIgAkZk05BiAkBj5A", "nAJmM");
        lllllllll[lIIIIIIIlI[180]] = llIllIIlllII("Rw3xbVJxh6s=", "HrhlH");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x069d, code lost:
        if (llIllIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[8]) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06e0, code lost:
        if (llIllIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[16]) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0723, code lost:
        if (llIllIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[28]) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0766, code lost:
        if (llIllIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[13]) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x07a9, code lost:
        if (llIllIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[8]) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x07ec, code lost:
        if (llIllIllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[13]) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07ef, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lllllllll[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[35]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0021v.lIIIIIIIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x080a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v891, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v924, types: [boolean] */
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
    public static void aZ() {
        if (llIllIllIIlI(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (llIllIllIIll(bx.size(), lIIIIIIIlI[0])) {
                System.out.println(lllllllll[lIIIIIIIlI[1]]);
                bv = lIIIIIIIlI[1];
            }
        }
        if (llIllIllIlII(bv ? 1 : 0) && llIllIllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[2])) {
            if (llIllIllIIll(C0004e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4])) {
                ds = lllllllll[lIIIIIIIlI[0]];
                N.cv();
            }
            if (llIllIllIlIl(C0004e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && (!llIllIllIllI(C0004e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) || llIllIllIIll(C0004e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]))) {
                ds = lllllllll[lIIIIIIIlI[9]];
                G.bI();
            }
            if (llIllIllIlIl(C0004e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && llIllIllIIll(C0004e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11])) {
                ds = lllllllll[lIIIIIIIlI[11]];
                U.de();
            }
            if (llIllIllIlIl(C0004e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && llIllIllIlIl(C0004e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && llIllIllIIll(Skills.getLevel(Skill.CRAFTING), lIIIIIIIlI[12])) {
                ds = lllllllll[lIIIIIIIlI[13]];
                an.el();
            }
            if (llIllIllIlIl(C0004e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && llIllIllIlIl(C0004e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && llIllIllIllI(Skills.getLevel(Skill.CRAFTING), lIIIIIIIlI[12]) && llIllIllIIll(Skills.getLevel(Skill.WOODCUTTING), lIIIIIIIlI[14])) {
                ds = lllllllll[lIIIIIIIlI[8]];
                ar.eP();
            }
            if (llIllIllIlIl(C0004e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && llIllIllIlIl(C0004e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && llIllIllIllI(Skills.getLevel(Skill.CRAFTING), lIIIIIIIlI[12]) && llIllIllIllI(Skills.getLevel(Skill.WOODCUTTING), lIIIIIIIlI[14]) && llIllIllIIll(Skills.getLevel(Skill.RANGED), lIIIIIIIlI[15])) {
                ds = lllllllll[lIIIIIIIlI[16]];
                if (llIllIllIIll(da, lIIIIIIIlI[0])) {
                    C0014o.cJ = lIIIIIIIlI[1];
                    da += lIIIIIIIlI[0];
                }
                C0013n.aA();
            }
            if (llIllIllIlIl(C0004e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && llIllIllIllI(C0004e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && llIllIllIlIl(C0004e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && llIllIllIllI(Skills.getLevel(Skill.CRAFTING), lIIIIIIIlI[12]) && llIllIllIllI(Skills.getLevel(Skill.WOODCUTTING), lIIIIIIIlI[14]) && llIllIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIIlI[15])) {
                if (!llIllIllIllI(C0004e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) || llIllIllIIll(Skills.getLevel(Skill.HUNTER), lIIIIIIIlI[19])) {
                    ds = lllllllll[lIIIIIIIlI[20]];
                    M.cs();
                }
                if (llIllIllIllI(C0004e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && llIllIllIllI(Skills.getLevel(Skill.HUNTER), lIIIIIIIlI[19]) && llIllIllIIll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6])) {
                    ds = lllllllll[lIIIIIIIlI[21]];
                    I.cb();
                }
                if (llIllIllIllI(C0004e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && llIllIllIllI(Skills.getLevel(Skill.HUNTER), lIIIIIIIlI[19]) && llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) && llIllIllIIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22])) {
                    ds = lllllllll[lIIIIIIIlI[19]];
                    C0020u.aX();
                }
                if (llIllIllIllI(C0004e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && llIllIllIllI(Skills.getLevel(Skill.HUNTER), lIIIIIIIlI[19]) && llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) && llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22]) && llIllIllIIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIIIIIlI[19])) {
                    String[] strArr = new String[lIIIIIIIlI[0]];
                    strArr[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[4]];
                    if (llIllIllIlII(Inventory.contains(strArr) ? 1 : 0)) {
                        ds = lllllllll[lIIIIIIIlI[23]];
                        C0022w.bc();
                    }
                }
                C0022w.bd();
            }
            if (llIllIllIlII(an() ? 1 : 0) && llIllIllIlII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) && llIllIllIllI(C0004e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && llIllIllIllI(Skills.getLevel(Skill.HUNTER), lIIIIIIIlI[19]) && llIllIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIIlI[15]) && llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) && llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22]) && llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIIIIIlI[19])) {
                String[] strArr2 = new String[lIIIIIIIlI[0]];
                strArr2[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[24]];
                if (llIllIllIlII(Inventory.contains(strArr2) ? 1 : 0)) {
                    ds = lllllllll[lIIIIIIIlI[25]];
                    BankLocation nearest = BankLocation.getNearest();
                    if (llIllIllIlll(nearest) && llIllIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllllll[lIIIIIIIlI[26]];
                        C0000a.a(nearest);
                    }
                    if (llIllIllIlll(nearest) && llIllIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIllIllIlII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIIIIIlI[27]);
                            "".length();
                        }
                        if (llIllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = lllllllll[lIIIIIIIlI[28]];
                            if (llIllIlllIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIIIIIlI[13]);
                                "".length();
                            }
                            if (llIllIlllIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIIIIIlI[9]);
                                "".length();
                            }
                            int[] iArr = new int[lIIIIIIIlI[0]];
                            iArr[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                            if (llIllIllIIlI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIIIIIlI[0]];
                                iArr2[lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                            }
                            int[] iArr3 = new int[lIIIIIIIlI[0]];
                            iArr3[lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                            if (llIllIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIIIIIlI[0]];
                                iArr4[lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                            }
                            int[] iArr5 = new int[lIIIIIIIlI[0]];
                            iArr5[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                            if (llIllIllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIIIIlI[0]];
                                iArr6[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                            }
                            int[] iArr7 = new int[lIIIIIIIlI[0]];
                            iArr7[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                            if (llIllIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIIIIIlI[0]];
                                iArr8[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                            }
                            int[] iArr9 = new int[lIIIIIIIlI[0]];
                            iArr9[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            if (llIllIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIIIIIlI[0]];
                                iArr10[lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            }
                            int[] iArr11 = new int[lIIIIIIIlI[0]];
                            iArr11[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                            if (llIllIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIIIIIIlI[0]];
                                iArr12[lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                            }
                            int[] iArr13 = new int[lIIIIIIIlI[23]];
                            iArr13[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                            iArr13[lIIIIIIIlI[0]] = lIIIIIIIlI[37];
                            iArr13[lIIIIIIIlI[9]] = lIIIIIIIlI[33];
                            iArr13[lIIIIIIIlI[11]] = lIIIIIIIlI[38];
                            iArr13[lIIIIIIIlI[13]] = lIIIIIIIlI[32];
                            iArr13[lIIIIIIIlI[8]] = lIIIIIIIlI[34];
                            iArr13[lIIIIIIIlI[16]] = lIIIIIIIlI[39];
                            iArr13[lIIIIIIIlI[20]] = lIIIIIIIlI[40];
                            iArr13[lIIIIIIIlI[21]] = lIIIIIIIlI[41];
                            iArr13[lIIIIIIIlI[19]] = lIIIIIIIlI[30];
                            iArr13[lIIIIIIIlI[4]] = lIIIIIIIlI[31];
                            if (llIllIllIlII(C0004e.d(iArr13) ? 1 : 0)) {
                                Q();
                                System.out.println(lllllllll[lIIIIIIIlI[42]]);
                                bv = lIIIIIIIlI[0];
                                return;
                            }
                            int[] iArr14 = new int[lIIIIIIIlI[23]];
                            iArr14[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                            iArr14[lIIIIIIIlI[0]] = lIIIIIIIlI[37];
                            iArr14[lIIIIIIIlI[9]] = lIIIIIIIlI[33];
                            iArr14[lIIIIIIIlI[11]] = lIIIIIIIlI[38];
                            iArr14[lIIIIIIIlI[13]] = lIIIIIIIlI[32];
                            iArr14[lIIIIIIIlI[8]] = lIIIIIIIlI[34];
                            iArr14[lIIIIIIIlI[16]] = lIIIIIIIlI[39];
                            iArr14[lIIIIIIIlI[20]] = lIIIIIIIlI[40];
                            iArr14[lIIIIIIIlI[21]] = lIIIIIIIlI[41];
                            iArr14[lIIIIIIIlI[19]] = lIIIIIIIlI[30];
                            iArr14[lIIIIIIIlI[4]] = lIIIIIIIlI[31];
                            if (llIllIllIIlI(C0004e.d(iArr14) ? 1 : 0)) {
                                C0000a.a(lIIIIIIIlI[34], lIIIIIIIlI[13]);
                                C0000a.a(lIIIIIIIlI[37], lIIIIIIIlI[0]);
                                C0000a.a(lIIIIIIIlI[43], lIIIIIIIlI[0]);
                                C0000a.a(lIIIIIIIlI[32], lIIIIIIIlI[13]);
                                C0000a.a(lIIIIIIIlI[29], lIIIIIIIlI[13]);
                                C0000a.a(lIIIIIIIlI[40], lIIIIIIIlI[0]);
                                C0000a.a(lIIIIIIIlI[41], lIIIIIIIlI[0]);
                                C0000a.a(lIIIIIIIlI[36], lIIIIIIIlI[4]);
                                C0000a.a(lIIIIIIIlI[30], lIIIIIIIlI[4]);
                                C0000a.a(lIIIIIIIlI[31], lIIIIIIIlI[28]);
                                C0000a.a(lIIIIIIIlI[44], lIIIIIIIlI[0]);
                                C0000a.a(lIIIIIIIlI[45], lIIIIIIIlI[27]);
                            }
                        }
                    }
                }
            }
            if (llIllIllIIlI(Inventory.contains(C0005f.bc) ? 1 : 0) && llIllIllIIll(Movement.getRunEnergy(), lIIIIIIIlI[15])) {
                Inventory.getFirst(C0005f.bc).interact(lllllllll[lIIIIIIIlI[46]]);
                Time.sleepTicks(lIIIIIIIlI[0]);
                "".length();
            }
            if (llIllIllIIlI(Inventory.contains(C0005f.aZ) ? 1 : 0) && llIllIllIIll(Prayers.getPoints(), lIIIIIIIlI[47])) {
                Inventory.getFirst(C0005f.aZ).interact(lllllllll[lIIIIIIIlI[12]]);
            }
            if (llIllIlllIIl(llIllIllIIIl(C0004e.w(), 60.0d))) {
                String[] strArr3 = new String[lIIIIIIIlI[0]];
                strArr3[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[48]];
                if (llIllIllIIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIIIIIlI[0]];
                    strArr4[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[49]];
                    Inventory.getFirst(strArr4).interact(lllllllll[lIIIIIIIlI[50]]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                }
            }
            if (llIllIllIIlI(an() ? 1 : 0) && llIllIllIlII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (llIllIllIlII(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[51]];
                    if (llIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlI[0]);
                    "".length();
                }
                if (llIllIllIIlI(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
                    dk = lIIIIIIIlI[1];
                    C0006g.a(lllllllll[lIIIIIIIlI[47]], cG);
                }
                if (llIllIllIIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIIIIIlI[52], lIIIIIIIlI[53], lIIIIIIIlI[1])) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIIIIIIlI[0]];
                    strArr5[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[54]];
                    TileObjects.getNearest(strArr5).interact(lllllllll[lIIIIIIIlI[55]]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                }
                if (llIllIllIIlI(new WorldArea(lIIIIIIIlI[52], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[lIIIIIIIlI[0]];
                    strArr6[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[57]];
                    TileObjects.getNearest(strArr6).interact(lllllllll[lIIIIIIIlI[58]]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[4])) {
                int[] iArr15 = new int[lIIIIIIIlI[0]];
                iArr15[lIIIIIIIlI[1]] = lIIIIIIIlI[44];
                if (llIllIllIlII(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIIIIIIlI[0]];
                    iArr16[lIIIIIIIlI[1]] = lIIIIIIIlI[44];
                    Inventory.getFirst(iArr16).interact(lllllllll[lIIIIIIIlI[59]]);
                }
                int[] iArr17 = new int[lIIIIIIIlI[0]];
                iArr17[lIIIIIIIlI[1]] = lIIIIIIIlI[60];
                if (llIllIllIlII(Inventory.contains(iArr17) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIIIIIIIlI[61], lIIIIIIIlI[62], lIIIIIIIlI[1]);
                    int[] iArr18 = new int[lIIIIIIIlI[0]];
                    iArr18[lIIIIIIIlI[1]] = lIIIIIIIlI[63];
                    if (llIllIllIlII(Inventory.contains(iArr18) ? 1 : 0) && llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIIlI[48])) {
                        if (llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIIIIIlI[8])) {
                            AccBuilderGWD.c = lllllllll[lIIIIIIIlI[64]];
                            Movement.walkTo(dq);
                            "".length();
                            Time.sleepTicks(lIIIIIIIlI[0]);
                            "".length();
                        }
                        if (llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIIIIIlI[8])) {
                            if (llIllIllIlII(Shop.isOpen() ? 1 : 0)) {
                                String[] strArr7 = new String[lIIIIIIIlI[0]];
                                strArr7[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[65]];
                                NPCs.getNearest(strArr7).interact(lllllllll[lIIIIIIIlI[10]]);
                                Time.sleepTicks(lIIIIIIIlI[9]);
                                "".length();
                            }
                            if (llIllIllIIlI(Shop.isOpen() ? 1 : 0)) {
                                Shop.buyFive(lIIIIIIIlI[63]);
                                Time.sleepTicks(lIIIIIIIlI[11]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr19 = new int[lIIIIIIIlI[0]];
                    iArr19[lIIIIIIIlI[1]] = lIIIIIIIlI[63];
                    if (llIllIllIIlI(Inventory.contains(iArr19) ? 1 : 0)) {
                        if (llIllIllIlII(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIllIlII(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIIIIIIIlI[0]];
                            iArr20[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                            if (llIllIllIIlI(Inventory.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIIIIIIIlI[0]];
                                iArr21[lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                Inventory.getFirst(iArr21).interact(lllllllll[lIIIIIIIlI[66]]);
                                Time.sleepTicks(lIIIIIIIlI[20]);
                                "".length();
                            }
                        }
                        if (!llIllIllIlII(f1do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIllIllIIlI(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIIIIIIIlI[61], lIIIIIIIlI[62], lIIIIIIIlI[1]);
                            if (llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIIIIIlI[8]) && llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderGWD.c = lllllllll[lIIIIIIIlI[67]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIIIIIIIlI[0]);
                                "".length();
                            }
                            String[] strArr8 = new String[lIIIIIIIlI[0]];
                            strArr8[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[14]];
                            if (llIllIllIIlI(Inventory.contains(strArr8) ? 1 : 0)) {
                                if (llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIIIIIlI[8]) && llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                    String[] strArr9 = new String[lIIIIIIIlI[0]];
                                    strArr9[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[68]];
                                    TileObjects.getNearest(strArr9).interact(lllllllll[lIIIIIIIlI[69]]);
                                    Time.sleepTicks(lIIIIIIIlI[13]);
                                    "".length();
                                }
                                String[] strArr10 = new String[lIIIIIIIlI[0]];
                                strArr10[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[70]];
                                if (llIllIllIlll(TileObjects.getNearest(strArr10))) {
                                    String[] strArr11 = new String[lIIIIIIIlI[0]];
                                    strArr11[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[71]];
                                    if (llIllIllIIlI(Inventory.contains(strArr11) ? 1 : 0)) {
                                        String[] strArr12 = new String[lIIIIIIIlI[0]];
                                        strArr12[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[22]];
                                        Item first = Inventory.getFirst(strArr12);
                                        String[] strArr13 = new String[lIIIIIIIlI[0]];
                                        strArr13[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[72]];
                                        first.useOn(TileObjects.getNearest(strArr13));
                                        Time.sleep(C0004e.c(lIIIIIIIlI[73], lIIIIIIIlI[74]));
                                        "".length();
                                    }
                                }
                            }
                            String[] strArr14 = new String[lIIIIIIIlI[0]];
                            strArr14[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[75]];
                            if (llIllIllIlII(Inventory.contains(strArr14) ? 1 : 0)) {
                                if (llIllIllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIIIIIIIlI[0])) {
                                    String[] strArr15 = new String[lIIIIIIIlI[0]];
                                    strArr15[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[76]];
                                    TileObjects.getNearest(strArr15).interact(lllllllll[lIIIIIIIlI[77]]);
                                    Time.sleepTicks(lIIIIIIIlI[8]);
                                    "".length();
                                }
                                if (llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                    do {
                                        String[] strArr16 = new String[lIIIIIIIlI[0]];
                                        strArr16[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[78]];
                                        if (llIllIllIIlI(Inventory.contains(strArr16) ? 1 : 0)) {
                                            String[] strArr17 = new String[lIIIIIIIlI[0]];
                                            strArr17[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[79]];
                                            TileObjects.getNearest(strArr17).interact(lllllllll[lIIIIIIIlI[80]]);
                                            Time.sleepTicks(lIIIIIIIlI[9]);
                                            "".length();
                                            "".length();
                                        }
                                    } while (0 == 0);
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr22 = new int[lIIIIIIIlI[0]];
                    iArr22[lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                    if (llIllIllIlII(Inventory.contains(iArr22) ? 1 : 0)) {
                        String[] strArr18 = new String[lIIIIIIIlI[0]];
                        strArr18[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[81]];
                        if (llIllIllIlII(Inventory.contains(strArr18) ? 1 : 0) && llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIIlI[48])) {
                            if (llIllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                                C0006g.a(lllllllll[lIIIIIIIlI[82]], cG);
                                Time.sleepTicks(lIIIIIIIlI[0]);
                                "".length();
                            }
                            C0006g.a(cG);
                        }
                    }
                }
                int[] iArr23 = new int[lIIIIIIIlI[0]];
                iArr23[lIIIIIIIlI[1]] = lIIIIIIIlI[60];
                if (llIllIllIIlI(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[lIIIIIIIlI[9]];
                    iArr24[lIIIIIIIlI[1]] = lIIIIIIIlI[83];
                    iArr24[lIIIIIIIlI[0]] = lIIIIIIIlI[29];
                    if (llIllIllIIlI(Inventory.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[lIIIIIIIlI[9]];
                        iArr25[lIIIIIIIlI[1]] = lIIIIIIIlI[83];
                        iArr25[lIIIIIIIlI[0]] = lIIIIIIIlI[29];
                        Inventory.getAll(iArr25).stream().forEach(item -> {
                            item.interact(lllllllll[lIIIIIIIlI[162]]);
                        });
                    }
                    if (llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                        Movement.walkTo(dr);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlI[0]);
                        "".length();
                    }
                    if (llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                        C0006g.a(lllllllll[lIIIIIIIlI[15]], cG);
                    }
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[48])) {
                C0006g.a(lllllllll[lIIIIIIIlI[84]], cG);
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[64])) {
                C0006g.a(lllllllll[lIIIIIIIlI[85]], cG);
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[22])) {
                C0006g.a(lllllllll[lIIIIIIIlI[86]], cG);
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[15])) {
                C0006g.a(lllllllll[lIIIIIIIlI[87]], cG);
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[6])) {
                C0006g.a(lllllllll[lIIIIIIIlI[88]], cG);
            }
            if (!llIllIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[89]) || llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[90])) {
                WorldPoint worldPoint3 = new WorldPoint(lIIIIIIIlI[91], lIIIIIIIlI[92], lIIIIIIIlI[1]);
                if (llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIIIIIIlI[11])) {
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[93]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlI[0]);
                    "".length();
                }
                if (llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIIIIIIlI[11])) {
                    C0006g.a(lllllllll[lIIIIIIIlI[94]], cG);
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[95])) {
                if (llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                    Movement.walkTo(dr);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlI[0]);
                    "".length();
                }
                if (llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                    C0006g.a(lllllllll[lIIIIIIIlI[96]], cG);
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[97])) {
                C0006g.a(lllllllll[lIIIIIIIlI[98]], cG);
            }
            if (!llIllIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[99]) || llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[100])) {
                C0006g.a(lllllllll[lIIIIIIIlI[6]], cG);
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[100])) {
                String[] strArr19 = new String[lIIIIIIIlI[0]];
                strArr19[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[101]];
                if (llIllIllIIlI(Inventory.contains(strArr19) ? 1 : 0)) {
                    String[] strArr20 = new String[lIIIIIIIlI[0]];
                    strArr20[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[102]];
                    if (llIllIllIlII(Inventory.contains(strArr20) ? 1 : 0)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Integer.valueOf(lIIIIIIIlI[33]), Integer.valueOf(lIIIIIIIlI[8]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIIIIIIlI[38]), Integer.valueOf(lIIIIIIIlI[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIIIIIIlI[39]), Integer.valueOf(lIIIIIIIlI[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIIIIIIIlI[103]), Integer.valueOf(lIIIIIIIlI[0]));
                        "".length();
                        C0004e.a(hashMap, lIIIIIIIlI[1], lIIIIIIIlI[1]);
                    }
                    String[] strArr21 = new String[lIIIIIIIlI[0]];
                    strArr21[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[104]];
                    if (llIllIllIIlI(Inventory.contains(strArr21) ? 1 : 0)) {
                        ba();
                    }
                }
            }
            if (!llIllIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[105]) || llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[106])) {
                String[] strArr22 = new String[lIIIIIIIlI[0]];
                strArr22[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[107]];
                NPC nearest2 = NPCs.getNearest(strArr22);
                if (llIllIllIlll(nearest2)) {
                    if (llIllIllIIlI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        C0006g.a(lllllllll[lIIIIIIIlI[3]], cG);
                    }
                    if (llIllIllIlII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlI[0]);
                        "".length();
                    }
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[108])) {
                String[] strArr23 = new String[lIIIIIIIlI[0]];
                strArr23[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[109]];
                if (llIllIllIlII(Inventory.contains(strArr23) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIIIIIIIlI[110], lIIIIIIIlI[111], lIIIIIIIlI[1]);
                    WorldPoint worldPoint5 = new WorldPoint(lIIIIIIIlI[110], lIIIIIIIlI[112], lIIIIIIIlI[1]);
                    if (llIllIllIlII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && llIllIllIlII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllllll[lIIIIIIIlI[113]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlI[0]);
                        "".length();
                    }
                    if (llIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && llIllIllIlII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        Movement.walkTo(worldPoint5);
                        "".length();
                    }
                    if (llIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        String[] strArr24 = new String[lIIIIIIIlI[0]];
                        strArr24[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[114]];
                        Item first2 = Inventory.getFirst(strArr24);
                        String[] strArr25 = new String[lIIIIIIIlI[0]];
                        strArr25[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[115]];
                        first2.useOn(Inventory.getFirst(strArr25));
                        Time.sleepTicks(lIIIIIIIlI[11]);
                        "".length();
                    }
                }
                String[] strArr26 = new String[lIIIIIIIlI[0]];
                strArr26[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[89]];
                if (llIllIllIIlI(Inventory.contains(strArr26) ? 1 : 0)) {
                    ba();
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[116])) {
                WorldPoint worldPoint6 = new WorldPoint(lIIIIIIIlI[117], lIIIIIIIlI[118], lIIIIIIIlI[1]);
                if (llIllIllIlII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    Movement.walkTo(worldPoint6);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlI[0]);
                    "".length();
                }
                if (llIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    String[] strArr27 = new String[lIIIIIIIlI[0]];
                    strArr27[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[119]];
                    NPCs.getNearest(strArr27).interact(lllllllll[lIIIIIIIlI[120]]);
                    Time.sleepTicks(lIIIIIIIlI[0]);
                    "".length();
                }
            }
            if (!llIllIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[121]) || llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[122])) {
                WorldPoint worldPoint7 = new WorldPoint(lIIIIIIIlI[123], lIIIIIIIlI[124], lIIIIIIIlI[1]);
                if (llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIIIIIIlI[9])) {
                    if (llIllIllIIlI(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aV).interact(lllllllll[lIIIIIIIlI[90]]);
                    }
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[125]];
                    Movement.walkTo(worldPoint7);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlI[0]);
                    "".length();
                }
                if (llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIIIIIIlI[9])) {
                    String[] strArr28 = new String[lIIIIIIIlI[0]];
                    strArr28[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[126]];
                    NPC nearest3 = NPCs.getNearest(strArr28);
                    if (llIllIllIlll(nearest3)) {
                        if (llIllIllIIlI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            C0006g.a(lllllllll[lIIIIIIIlI[95]], cG);
                        }
                        if (llIllIllIlII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            Movement.walkTo(nearest3);
                            "".length();
                            Time.sleepTicks(lIIIIIIIlI[0]);
                            "".length();
                        }
                    }
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[127])) {
                String[] strArr29 = new String[lIIIIIIIlI[0]];
                strArr29[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[128]];
                if (llIllIllIlII(Inventory.contains(strArr29) ? 1 : 0)) {
                    WorldPoint worldPoint8 = new WorldPoint(lIIIIIIIlI[117], lIIIIIIIlI[118], lIIIIIIIlI[1]);
                    if (llIllIllIlII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        Movement.walkTo(worldPoint8);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlI[0]);
                        "".length();
                    }
                    if (llIllIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        String[] strArr30 = new String[lIIIIIIIlI[0]];
                        strArr30[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[129]];
                        NPCs.getNearest(strArr30).interact(lllllllll[lIIIIIIIlI[130]]);
                        Time.sleepTicks(lIIIIIIIlI[0]);
                        "".length();
                    }
                }
                String[] strArr31 = new String[lIIIIIIIlI[0]];
                strArr31[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[97]];
                if (llIllIllIIlI(Inventory.contains(strArr31) ? 1 : 0)) {
                    ba();
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[131])) {
                ba();
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[132])) {
                if (llIllIllIIlI(Widgets.get(lIIIIIIIlI[133]).isEmpty() ? 1 : 0)) {
                    String[] strArr32 = new String[lIIIIIIIlI[0]];
                    strArr32[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[134]];
                    Inventory.getFirst(strArr32).interact(lllllllll[lIIIIIIIlI[135]]);
                    Time.sleepTicks(lIIIIIIIlI[13]);
                    "".length();
                }
                if (llIllIllIlII(Widgets.get(lIIIIIIIlI[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click(Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[55]).getClickPoint().getX(), Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[55]).getClickPoint().getY(), (boolean) lIIIIIIIlI[0]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[65]).getClickPoint().getX(), Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[65]).getClickPoint().getY(), (boolean) lIIIIIIIlI[0]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[67]).getClickPoint().getX(), Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[67]).getClickPoint().getY(), (boolean) lIIIIIIIlI[0]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[22]).getClickPoint().getX(), Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[22]).getClickPoint().getY(), (boolean) lIIIIIIIlI[0]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[76]).getClickPoint().getX(), Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[76]).getClickPoint().getY(), (boolean) lIIIIIIIlI[0]);
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[79]).getClickPoint().getX(), Widgets.get(lIIIIIIIlI[133], lIIIIIIIlI[79]).getClickPoint().getY(), (boolean) lIIIIIIIlI[0]);
                    Time.sleepTicks(lIIIIIIIlI[8]);
                    "".length();
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[136])) {
                ba();
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[137])) {
                String[] strArr33 = new String[lIIIIIIIlI[0]];
                strArr33[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[138]];
                if (llIllIllIIlI(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[lIIIIIIIlI[0]];
                    strArr34[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[139]];
                    Item first3 = Inventory.getFirst(strArr34);
                    String[] strArr35 = new String[lIIIIIIIlI[0]];
                    strArr35[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[140]];
                    first3.useOn(Inventory.getFirst(strArr35));
                    Time.sleepTicks(lIIIIIIIlI[9]);
                    "".length();
                }
            }
            if (llIllIllIlIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[141])) {
                if (llIllIllIIll(dk, lIIIIIIIlI[0])) {
                    as.oV += lIIIIIIIlI[0];
                    as.u(AccBuilderGWD.m);
                    dk += lIIIIIIIlI[0];
                    as.oV = lIIIIIIIlI[1];
                    dl = lIIIIIIIlI[1];
                }
                ba();
            }
            C0006g.a(cG);
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aZ();
            "".length();
            if ((-((47 ^ 82) ^ (14 ^ 118))) >= 0) {
                return ((21 ^ 112) ^ (247 ^ 162)) & (((((100 + 78) - 35) + 20) ^ (((57 + 69) - 110) + 131)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIIIIlI[100];
    }

    private static boolean llIllIlllIIl(int i) {
        return i < 0;
    }

    private static boolean llIllIllIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIIIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIllIllIllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[2])) {
            ?? r0 = lIIIIIIIlI[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIIIIlI[1];
    }

    private static boolean llIllIlllIlI(int i, int i2) {
        return i > i2;
    }

    private static String llIllIIlllIl(String lIIlIlIIIlllI, String lIIlIlIIIllIl) {
        String str = new String(Base64.getDecoder().decode(lIIlIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIlIIIllII = new StringBuilder();
        char[] lIIlIlIIIlIll = lIIlIlIIIllIl.toCharArray();
        int lIIlIlIIIlIlI = lIIIIIIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIIlI[1];
        while (llIllIllIIll(i, length)) {
            char lIIlIlIIIllll = charArray[i];
            lIIlIlIIIllII.append((char) (lIIlIlIIIllll ^ lIIlIlIIIlIll[lIIlIlIIIlIlI % lIIlIlIIIlIll.length]));
            "".length();
            lIIlIlIIIlIlI++;
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIlIlIIIllII);
    }

    static {
        llIllIllIIII();
        llIllIlIllII();
        bx = new ArrayList();
        dn = new WorldArea(lIIIIIIIlI[163], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1]);
        f1do = new WorldArea(lIIIIIIIlI[164], lIIIIIIIlI[165], lIIIIIIIlI[166], lIIIIIIIlI[142], lIIIIIIIlI[1]);
        dp = new WorldArea(lIIIIIIIlI[164], lIIIIIIIlI[165], lIIIIIIIlI[166], lIIIIIIIlI[142], lIIIIIIIlI[0]);
        dg = new WorldPoint(lIIIIIIIlI[167], lIIIIIIIlI[168], lIIIIIIIlI[1]);
        dq = new WorldPoint(lIIIIIIIlI[169], lIIIIIIIlI[170], lIIIIIIIlI[1]);
        dr = new WorldPoint(lIIIIIIIlI[171], lIIIIIIIlI[172], lIIIIIIIlI[1]);
        String[] strArr = new String[lIIIIIIIlI[21]];
        strArr[lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[173]];
        strArr[lIIIIIIIlI[0]] = lllllllll[lIIIIIIIlI[174]];
        strArr[lIIIIIIIlI[9]] = lllllllll[lIIIIIIIlI[175]];
        strArr[lIIIIIIIlI[11]] = lllllllll[lIIIIIIIlI[176]];
        strArr[lIIIIIIIlI[13]] = lllllllll[lIIIIIIIlI[100]];
        strArr[lIIIIIIIlI[8]] = lllllllll[lIIIIIIIlI[177]];
        strArr[lIIIIIIIlI[16]] = lllllllll[lIIIIIIIlI[178]];
        strArr[lIIIIIIIlI[20]] = lllllllll[lIIIIIIIlI[179]];
        cG = strArr;
        da = lIIIIIIIlI[1];
        ds = lllllllll[lIIIIIIIlI[180]];
    }

    private static boolean llIllIllIllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIIIIIIIlI[20]];
        iArr[lIIIIIIIlI[1]] = lIIIIIIIlI[36];
        iArr[lIIIIIIIlI[0]] = lIIIIIIIlI[37];
        iArr[lIIIIIIIlI[9]] = lIIIIIIIlI[34];
        iArr[lIIIIIIIlI[11]] = lIIIIIIIlI[40];
        iArr[lIIIIIIIlI[13]] = lIIIIIIIlI[41];
        iArr[lIIIIIIIlI[8]] = lIIIIIIIlI[30];
        iArr[lIIIIIIIlI[16]] = lIIIIIIIlI[31];
        int i = lIIIIIIIlI[1];
        while (llIllIllIIll(i, iArr.length)) {
            int[] iArr2 = new int[lIIIIIIIlI[0]];
            iArr2[lIIIIIIIlI[1]] = iArr[i];
            if (llIllIllIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIIIIIlI[1];
            }
            i++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return ((106 ^ 67) ^ (187 ^ 166)) & (((33 ^ 66) ^ (67 ^ 20)) ^ (-" ".length()));
            }
        }
        return lIIIIIIIlI[0];
    }

    private static boolean llIllIllllII(int i, int i2) {
        return i != i2;
    }
}
