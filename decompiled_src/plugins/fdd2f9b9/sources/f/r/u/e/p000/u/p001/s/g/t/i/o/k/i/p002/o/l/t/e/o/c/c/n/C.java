package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.C  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/C.class */
public class C implements G {
    static /* synthetic */ boolean cl;
    static /* synthetic */ int hW;
    private static /* synthetic */ int[] lIIllllIIl;
    static /* synthetic */ String[] bR;
    public static /* synthetic */ WorldPoint hS;
    public static /* synthetic */ WorldPoint hT;
    public static /* synthetic */ WorldPoint cg;
    static /* synthetic */ int ck;
    static /* synthetic */ WorldArea hX;
    public static /* synthetic */ WorldPoint hU;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lIIlllIlll;
    public static /* synthetic */ WorldPoint hV;
    public static /* synthetic */ List<C0003d> bv;

    private static boolean lIIIIllIIlIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIllllIIl[4]];
        iArr[lIIllllIIl[1]] = lIIllllIIl[5];
        iArr[lIIllllIIl[0]] = lIIllllIIl[6];
        iArr[lIIllllIIl[3]] = lIIllllIIl[7];
        iArr[lIIllllIIl[8]] = lIIllllIIl[9];
        int i = lIIllllIIl[1];
        while (lIIIIllIIIIlI(i, iArr.length)) {
            int[] iArr2 = new int[lIIllllIIl[0]];
            iArr2[lIIllllIIl[1]] = iArr[i];
            if (lIIIIllIIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIllllIIl[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIllllIIl[0];
    }

    private static int lIIIIllIIIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIIIIlIllllll() {
        lIIllllIIl = new int[198];
        lIIllllIIl[0] = " ".length();
        lIIllllIIl[1] = ((((122 + 23) - 134) + 153) ^ (((75 + 91) - 44) + 74)) & (((((134 + 104) - 171) + 100) ^ (((13 + 1) - 0) + 185)) ^ (-" ".length()));
        lIIllllIIl[2] = (-((-13020) & 32511)) & (-8261) & 32751;
        lIIllllIIl[3] = "  ".length();
        lIIllllIIl[4] = 83 ^ 87;
        lIIllllIIl[5] = (-8361) & 16367;
        lIIllllIIl[6] = (-12353) & 31967;
        lIIllllIIl[7] = (-((-1681) & 14033)) & (-16387) & 29690;
        lIIllllIIl[8] = "   ".length();
        lIIllllIIl[9] = (-((-5489) & 21887)) & (-1217) & 17887;
        lIIllllIIl[10] = 121 ^ 115;
        lIIllllIIl[11] = (-18661) & 18932;
        lIIllllIIl[12] = (-18991) & 31615;
        lIIllllIIl[13] = (-27265) & 27643;
        lIIllllIIl[14] = (244 ^ 149) ^ (231 ^ 131);
        lIIllllIIl[15] = (142 ^ 167) ^ (175 ^ 180);
        lIIllllIIl[16] = (46 ^ 123) ^ (249 ^ 164);
        lIIllllIIl[17] = 177 ^ 183;
        lIIllllIIl[18] = 190 ^ 185;
        lIIllllIIl[19] = (-30250) & 30523;
        lIIllllIIl[20] = 2 ^ 11;
        lIIllllIIl[21] = (-28) & 3135;
        lIIllllIIl[22] = (-((-16919) & 29431)) & (-3) & 15871;
        lIIllllIIl[23] = (((151 + 109) - 124) + 38) ^ (((126 + 133) - 98) + 4);
        lIIllllIIl[24] = 174 ^ 162;
        lIIllllIIl[25] = 95 ^ 82;
        lIIllllIIl[26] = (224 ^ 128) ^ (248 ^ 150);
        lIIllllIIl[27] = 179 ^ 188;
        lIIllllIIl[28] = (198 ^ 158) ^ (4 ^ 76);
        lIIllllIIl[29] = 157 ^ 140;
        lIIllllIIl[30] = (11 ^ 60) ^ (33 ^ 4);
        lIIllllIIl[31] = (((10 + 198) - 101) + 105) ^ (((12 + 108) - (-61)) + 18);
        lIIllllIIl[32] = (49 ^ 29) ^ (133 ^ 189);
        lIIllllIIl[33] = (((55 + 29) - 16) + 81) ^ (((87 + 69) - 57) + 29);
        lIIllllIIl[34] = (178 ^ 174) ^ (49 ^ 59);
        lIIllllIIl[35] = (43 ^ 97) ^ (46 ^ 115);
        lIIllllIIl[36] = (112 ^ 87) ^ (88 ^ 103);
        lIIllllIIl[37] = 176 ^ 169;
        lIIllllIIl[38] = 55 ^ 45;
        lIIllllIIl[39] = 71 ^ 92;
        lIIllllIIl[40] = 9 ^ 21;
        lIIllllIIl[41] = (159 ^ 165) ^ (82 ^ 117);
        lIIllllIIl[42] = (61 ^ 91) ^ (121 ^ 1);
        lIIllllIIl[43] = (-((-535) & 29407)) & (-789) & 32767;
        lIIllllIIl[44] = (-16593) & 19959;
        lIIllllIIl[45] = (-17042) & 20407;
        lIIllllIIl[46] = 133 ^ 154;
        lIIllllIIl[47] = 165 ^ 133;
        lIIllllIIl[48] = (86 ^ 34) ^ (108 ^ 57);
        lIIllllIIl[49] = 20 ^ 54;
        lIIllllIIl[50] = 27 ^ 56;
        lIIllllIIl[51] = (167 ^ 194) ^ (45 ^ 108);
        lIIllllIIl[52] = (254 ^ 167) ^ (126 ^ 2);
        lIIllllIIl[53] = 35 ^ 5;
        lIIllllIIl[54] = (-8906) & 11995;
        lIIllllIIl[55] = (-((-8327) & 24807)) & (-4615) & 24447;
        lIIllllIIl[56] = 138 ^ 173;
        lIIllllIIl[57] = (((151 + 171) - 180) + 43) ^ (((74 + 16) - (-25)) + 30);
        lIIllllIIl[58] = (((120 + 82) - 118) + 83) ^ (((43 + 124) - 43) + 18);
        lIIllllIIl[59] = 12 ^ 38;
        lIIllllIIl[60] = 41 ^ 2;
        lIIllllIIl[61] = (-(((131 + 115) - 198) + 145)) & (-2350) & 12287;
        lIIllllIIl[62] = (-4804) & 7919;
        lIIllllIIl[63] = (-((-9757) & 32765)) & (-7) & 32766;
        lIIllllIIl[64] = (-20554) & 23663;
        lIIllllIIl[65] = (-((-24661) & 27103)) & (-20481) & 32683;
        lIIllllIIl[66] = (-((-8497) & 29115)) & (-65) & 30447;
        lIIllllIIl[67] = (-24613) & 27709;
        lIIllllIIl[68] = (-((-6253) & 23549)) & (-13) & 20413;
        lIIllllIIl[69] = (-194) & 9951;
        lIIllllIIl[70] = (-13161) & 16255;
        lIIllllIIl[71] = (-16705) & 26467;
        lIIllllIIl[72] = (-449) & 3548;
        lIIllllIIl[73] = (-((-21031) & 21487)) & (-4131) & 14331;
        lIIllllIIl[74] = (-((-19693) & 32239)) & (-1) & 14334;
        lIIllllIIl[75] = (-((-1589) & 20277)) & (-1) & 20479;
        lIIllllIIl[76] = 71 ^ 107;
        lIIllllIIl[77] = (131 ^ 150) ^ (154 ^ 162);
        lIIllllIIl[78] = (104 ^ 101) ^ (146 ^ 177);
        lIIllllIIl[79] = (35 ^ 73) ^ (229 ^ 160);
        lIIllllIIl[80] = (-((-10309) & 26951)) & (-12289) & 30719;
        lIIllllIIl[81] = 99 ^ 83;
        lIIllllIIl[82] = 68 ^ 117;
        lIIllllIIl[83] = (234 ^ 150) ^ (124 ^ 51);
        lIIllllIIl[84] = (-((-9517) & 30191)) & (-2337) & 32767;
        lIIllllIIl[85] = (1 ^ 118) ^ (203 ^ 136);
        lIIllllIIl[86] = 123 ^ 78;
        lIIllllIIl[87] = 183 ^ 129;
        lIIllllIIl[88] = 20 ^ 35;
        lIIllllIIl[89] = (((109 + 89) - 183) + 164) ^ (((97 + 23) - 118) + 137);
        lIIllllIIl[90] = 180 ^ 141;
        lIIllllIIl[91] = (-6561) & 16319;
        lIIllllIIl[92] = (40 ^ 11) ^ (179 ^ 170);
        lIIllllIIl[93] = (((98 + 141) - 238) + 169) ^ (((108 + 108) - 103) + 32);
        lIIllllIIl[94] = (((74 + 101) - 168) + 129) ^ (((56 + 97) - 120) + 147);
        lIIllllIIl[95] = (69 ^ 109) ^ (21 ^ 0);
        lIIllllIIl[96] = 42 ^ 20;
        lIIllllIIl[97] = (5 ^ 59) ^ " ".length();
        lIIllllIIl[98] = 249 ^ 185;
        lIIllllIIl[99] = 87 ^ 22;
        lIIllllIIl[100] = (14 ^ 105) ^ (4 ^ 33);
        lIIllllIIl[101] = 33 ^ 98;
        lIIllllIIl[102] = 98 ^ 38;
        lIIllllIIl[103] = (-((-1793) & 30707)) & (-1) & 30706;
        lIIllllIIl[104] = (-((-5265) & 30705)) & (-4226) & 32767;
        lIIllllIIl[105] = 86 ^ 19;
        lIIllllIIl[106] = (106 ^ 83) ^ (((40 + 30) - (-13)) + 44);
        lIIllllIIl[107] = (78 ^ 99) ^ (113 ^ 27);
        lIIllllIIl[108] = (-((-30725) & 31207)) & (-29185) & 32767;
        lIIllllIIl[109] = (-(((198 + 101) - 200) + 102)) & (-18453) & 28412;
        lIIllllIIl[110] = (206 ^ 193) ^ (49 ^ 118);
        lIIllllIIl[111] = (239 ^ 160) ^ (159 ^ 153);
        lIIllllIIl[112] = (35 ^ 74) ^ (137 ^ 170);
        lIIllllIIl[113] = (-4165) & 13926;
        lIIllllIIl[114] = (234 ^ 175) ^ (94 ^ 80);
        lIIllllIIl[115] = 96 ^ 44;
        lIIllllIIl[116] = (141 ^ 129) ^ (113 ^ 48);
        lIIllllIIl[117] = 73 ^ 7;
        lIIllllIIl[118] = 136 ^ 199;
        lIIllllIIl[119] = (((133 + 167) - 130) + 35) ^ (((52 + 97) - 7) + 15);
        lIIllllIIl[120] = 145 ^ 192;
        lIIllllIIl[121] = (-((-261) & 26951)) & (-25) & 28507;
        lIIllllIIl[122] = 144 ^ 194;
        lIIllllIIl[123] = 64 ^ 19;
        lIIllllIIl[124] = (82 ^ 116) ^ (247 ^ 133);
        lIIllllIIl[125] = 51 ^ 102;
        lIIllllIIl[126] = (-24578) & 26367;
        lIIllllIIl[127] = (-9029) & 12127;
        lIIllllIIl[128] = 222 ^ 136;
        lIIllllIIl[129] = (37 ^ 50) ^ (4 ^ 68);
        lIIllllIIl[130] = 101 ^ 61;
        lIIllllIIl[131] = (-((-1132) & 13439)) & (-16705) & 32115;
        lIIllllIIl[132] = (153 ^ 166) ^ (99 ^ 5);
        lIIllllIIl[133] = (222 ^ 198) ^ (226 ^ 160);
        lIIllllIIl[134] = 241 ^ 170;
        lIIllllIIl[135] = (57 ^ 82) ^ (245 ^ 194);
        lIIllllIIl[136] = 244 ^ 169;
        lIIllllIIl[137] = 90 ^ 4;
        lIIllllIIl[138] = (-((-6278) & 14799)) & (-4229) & 15855;
        lIIllllIIl[139] = (28 ^ 18) ^ (57 ^ 104);
        lIIllllIIl[140] = (40 ^ 21) ^ (78 ^ 19);
        lIIllllIIl[141] = (185 ^ 153) ^ (215 ^ 150);
        lIIllllIIl[142] = 250 ^ 152;
        lIIllllIIl[143] = (((156 + 134) - 187) + 98) ^ (((3 + 122) - 84) + 129);
        lIIllllIIl[144] = 103 ^ 3;
        lIIllllIIl[145] = (144 ^ 169) ^ (219 ^ 135);
        lIIllllIIl[146] = (((66 + 14) - 21) + 141) ^ (((13 + 21) - (-33)) + 107);
        lIIllllIIl[147] = (156 ^ 184) ^ (53 ^ 118);
        lIIllllIIl[148] = (138 ^ 181) ^ (117 ^ 34);
        lIIllllIIl[149] = 199 ^ 174;
        lIIllllIIl[150] = 196 ^ 174;
        lIIllllIIl[151] = (101 ^ 40) ^ (168 ^ 142);
        lIIllllIIl[152] = (-((-11813) & 16254)) & (-3) & 14207;
        lIIllllIIl[153] = 117 ^ 25;
        lIIllllIIl[154] = 252 ^ 145;
        lIIllllIIl[155] = 35 ^ 77;
        lIIllllIIl[156] = 123 ^ 20;
        lIIllllIIl[157] = ((33 + 65) - 11) + 58;
        lIIllllIIl[158] = 196 ^ 180;
        lIIllllIIl[159] = ((25 + 3) - (-7)) + 106;
        lIIllllIIl[160] = 254 ^ 143;
        lIIllllIIl[161] = (-25167) & 28255;
        lIIllllIIl[162] = (-((-3197) & 23807)) & (-2049) & 32411;
        lIIllllIIl[163] = 64 ^ 50;
        lIIllllIIl[164] = (((7 + 207) - 54) + 86) ^ (((26 + 28) - (-16)) + 63);
        lIIllllIIl[165] = 178 ^ 198;
        lIIllllIIl[166] = (150 ^ 129) ^ (90 ^ 56);
        lIIllllIIl[167] = 15 ^ 121;
        lIIllllIIl[168] = 101 ^ 18;
        lIIllllIIl[169] = (91 ^ 107) ^ (27 ^ 83);
        lIIllllIIl[170] = 43 ^ 82;
        lIIllllIIl[171] = (120 ^ 105) ^ (195 ^ 168);
        lIIllllIIl[172] = 49 ^ 74;
        lIIllllIIl[173] = (((71 + 27) - 26) + 149) ^ (((35 + 52) - (-38)) + 36);
        lIIllllIIl[174] = (((58 + 97) - 121) + 204) ^ (((46 + 107) - 56) + 50);
        lIIllllIIl[175] = (-596) & 9815;
        lIIllllIIl[176] = (-4116) & 16095;
        lIIllllIIl[177] = (-7683) & 32682;
        lIIllllIIl[178] = (-4161) & 4460;
        lIIllllIIl[179] = (-25163) & 26462;
        lIIllllIIl[180] = 37 ^ 91;
        lIIllllIIl[181] = ((76 + 60) - 83) + 74;
        lIIllllIIl[182] = ((75 + 18) - (-10)) + 25;
        lIIllllIIl[183] = (((106 ^ 31) + (((107 + 94) - 177) + 104)) - (((214 + 75) - 186) + 129)) + (54 ^ 66);
        lIIllllIIl[184] = (-((-11317) & 32311)) & (-8345) & 32703;
        lIIllllIIl[185] = (((238 ^ 177) + (16 ^ 101)) - (((150 + 49) - 109) + 74)) + (146 ^ 192);
        lIIllllIIl[186] = (((99 ^ 61) + (141 ^ 173)) - (132 ^ 197)) + (199 ^ 129);
        lIIllllIIl[187] = (-16461) & 19789;
        lIIllllIIl[188] = (-((-3539) & 12243)) & (-16641) & 28431;
        lIIllllIIl[189] = (-((-333) & 25567)) & (-70) & 28663;
        lIIllllIIl[190] = (-4737) & 8072;
        lIIllllIIl[191] = (-((-10289) & 15289)) & (-97) & 8190;
        lIIllllIIl[192] = (-((-17631) & 18175)) & (-12289) & 16191;
        lIIllllIIl[193] = ((99 + 125) - 129) + 37;
        lIIllllIIl[194] = ((117 + 89) - 96) + 23;
        lIIllllIIl[195] = (((51 ^ 40) + (((50 + 92) - 123) + 113)) - (194 ^ 136)) + (51 ^ 2);
        lIIllllIIl[196] = (-((-1197) & 3517)) & (-4097) & 16159;
        lIIllllIIl[197] = ((72 + 53) - 74) + 84;
    }

    private static boolean lIIIIllIIlIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIIllIIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0514, code lost:
        if (lIIIIllIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L399;
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
    public static void bH() {
        if (lIIIIllIIIIIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIIllIIIIlI(bv.size(), lIIllllIIl[0])) {
                System.out.println(lIIlllIlll[lIIllllIIl[1]]);
                bt = lIIllllIIl[1];
            }
        }
        if (lIIIIllIIIIll(bt ? 1 : 0)) {
            if (lIIIIllIIIIll(ab() ? 1 : 0) && lIIIIllIIIIlI(C0004e.j(hW), lIIllllIIl[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIllIIIlII(nearest) && lIIIIllIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[0]];
                    C0000a.a(nearest);
                }
                if (lIIIIllIIIlII(nearest) && lIIIIllIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIIllIIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIllllIIl[2]);
                        "".length();
                    }
                    if (lIIIIllIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[3]];
                        if (lIIIIllIIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIllllIIl[4]);
                            "".length();
                        }
                        if (lIIIIllIIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIllllIIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIllllIIl[4]];
                        iArr[lIIllllIIl[1]] = lIIllllIIl[5];
                        iArr[lIIllllIIl[0]] = lIIllllIIl[6];
                        iArr[lIIllllIIl[3]] = lIIllllIIl[7];
                        iArr[lIIllllIIl[8]] = lIIllllIIl[9];
                        if (lIIIIllIIIIll(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlllIlll[lIIllllIIl[8]]);
                            bt = lIIllllIIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIllllIIl[4]];
                        iArr2[lIIllllIIl[1]] = lIIllllIIl[5];
                        iArr2[lIIllllIIl[0]] = lIIllllIIl[6];
                        iArr2[lIIllllIIl[3]] = lIIllllIIl[7];
                        iArr2[lIIllllIIl[8]] = lIIllllIIl[9];
                        if (lIIIIllIIIIIl(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIllllIIl[5], lIIllllIIl[10]);
                            C0000a.a(lIIllllIIl[6], lIIllllIIl[10]);
                            C0000a.a(lIIllllIIl[7], lIIllllIIl[0]);
                            C0000a.a(lIIllllIIl[11], lIIllllIIl[0]);
                            C0000a.a(lIIllllIIl[9], lIIllllIIl[0]);
                            C0000a.a(lIIllllIIl[12], lIIllllIIl[0]);
                            C0000a.a(lIIllllIIl[13], lIIllllIIl[14]);
                        }
                    }
                }
            }
            if (lIIIIllIIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIllIIIIlI(Movement.getRunEnergy(), lIIllllIIl[15])) {
                Inventory.getFirst(C0005f.aV).interact(lIIlllIlll[lIIllllIIl[4]]);
                Time.sleepTicks(lIIllllIIl[0]);
                "".length();
            }
            int[] iArr3 = new int[lIIllllIIl[0]];
            iArr3[lIIllllIIl[1]] = lIIllllIIl[13];
            if (lIIIIllIIIIIl(Inventory.contains(iArr3) ? 1 : 0) && lIIIIllIIIllI(lIIIIllIIIIII(C0004e.u(), 50.0d))) {
                int[] iArr4 = new int[lIIllllIIl[0]];
                iArr4[lIIllllIIl[1]] = lIIllllIIl[13];
                Inventory.getFirst(iArr4).interact(lIIlllIlll[lIIllllIIl[14]]);
                Time.sleepTicks(lIIllllIIl[3]);
                "".length();
            }
            if (lIIIIllIIIIIl(ab() ? 1 : 0) && lIIIIllIIIIll(C0004e.j(hW))) {
                if (lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIIl[16])) {
                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[17]];
                    Movement.walkTo(cg);
                    "".length();
                    Time.sleepTicks(lIIllllIIl[0]);
                    "".length();
                }
                if (lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIIl[16])) {
                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[18]];
                    if (lIIIIllIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0006g.a(lIIlllIlll[lIIllllIIl[16]], bR);
                }
            }
            if (lIIIIllIIlIIl(C0004e.j(hW), lIIllllIIl[0])) {
                ck = lIIllllIIl[1];
                int[] iArr5 = new int[lIIllllIIl[0]];
                iArr5[lIIllllIIl[1]] = lIIllllIIl[11];
                if (lIIIIllIIIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIllllIIl[0]];
                    iArr6[lIIllllIIl[1]] = lIIllllIIl[19];
                    if (lIIIIllIIIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr = new String[lIIllllIIl[0]];
                        strArr[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[20]];
                        if (lIIIIllIIIIll(Inventory.contains(strArr) ? 1 : 0)) {
                            WorldPoint worldPoint = new WorldPoint(lIIllllIIl[21], lIIllllIIl[22], lIIllllIIl[0]);
                            int[] iArr7 = new int[lIIllllIIl[0]];
                            iArr7[lIIllllIIl[1]] = lIIllllIIl[11];
                            if (lIIIIllIIIIll(Inventory.contains(iArr7) ? 1 : 0)) {
                                if (lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIllllIIl[14])) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[10]];
                                    Movement.walkTo(worldPoint);
                                    "".length();
                                    Time.sleepTicks(lIIllllIIl[0]);
                                    "".length();
                                }
                                if (lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIllllIIl[14])) {
                                    int[] iArr8 = new int[lIIllllIIl[0]];
                                    iArr8[lIIllllIIl[1]] = lIIllllIIl[11];
                                    TileItem nearest2 = TileItems.getNearest(iArr8);
                                    if (lIIIIllIIIlII(nearest2)) {
                                        if (lIIIIllIIIIll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[23]];
                                            Movement.walkTo(nearest2.getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lIIllllIIl[0]);
                                            "".length();
                                        }
                                        if (lIIIIllIIIIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[24]];
                                            nearest2.interact(lIIlllIlll[lIIllllIIl[25]]);
                                            Time.sleepTicks(lIIllllIIl[8]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lIIllllIIl[0]];
                iArr9[lIIllllIIl[1]] = lIIllllIIl[11];
                if (lIIIIllIIIIll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIllllIIl[0]];
                    iArr10[lIIllllIIl[1]] = lIIllllIIl[19];
                }
                int[] iArr11 = new int[lIIllllIIl[0]];
                iArr11[lIIllllIIl[1]] = lIIllllIIl[19];
                if (lIIIIllIIIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIllllIIl[0]];
                    iArr12[lIIllllIIl[1]] = lIIllllIIl[11];
                    if (lIIIIllIIIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[26]];
                        int[] iArr13 = new int[lIIllllIIl[0]];
                        iArr13[lIIllllIIl[1]] = lIIllllIIl[11];
                        Item first = Inventory.getFirst(iArr13);
                        int[] iArr14 = new int[lIIllllIIl[0]];
                        iArr14[lIIllllIIl[1]] = lIIllllIIl[9];
                        first.useOn(Inventory.getFirst(iArr14));
                        Time.sleepTicks(lIIllllIIl[0]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[lIIllllIIl[0]];
                iArr15[lIIllllIIl[1]] = lIIllllIIl[19];
                if (lIIIIllIIIIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIllllIIl[0]];
                    strArr2[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[27]];
                    if (lIIIIllIIIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hS), lIIllllIIl[4])) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[28]];
                            Movement.walkTo(hS);
                            "".length();
                            Time.sleepTicks(lIIllllIIl[0]);
                            "".length();
                        }
                        if (lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hS), lIIllllIIl[4])) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[29]];
                            String[] strArr3 = new String[lIIllllIIl[0]];
                            strArr3[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[30]];
                            TileObjects.getNearest(strArr3).interact(lIIlllIlll[lIIllllIIl[31]]);
                            Time.sleepTicks(lIIllllIIl[20]);
                            "".length();
                        }
                    }
                    String[] strArr4 = new String[lIIllllIIl[0]];
                    strArr4[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[32]];
                    if (lIIIIllIIIIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIllllIIl[8])) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[33]];
                            Movement.walkTo(hT);
                            "".length();
                            Time.sleepTicks(lIIllllIIl[0]);
                            "".length();
                        }
                        if (lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), lIIllllIIl[8])) {
                            int[] iArr16 = new int[lIIllllIIl[0]];
                            iArr16[lIIllllIIl[1]] = lIIllllIIl[19];
                            Item first2 = Inventory.getFirst(iArr16);
                            String[] strArr5 = new String[lIIllllIIl[0]];
                            strArr5[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[34]];
                            first2.useOn(TileObjects.getNearest(strArr5));
                            Time.sleepTicks(lIIllllIIl[0]);
                            "".length();
                        }
                    }
                }
                String[] strArr6 = new String[lIIllllIIl[0]];
                strArr6[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[35]];
                if (lIIIIllIIIIIl(Inventory.contains(strArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lIIllllIIl[0]];
                    iArr17[lIIllllIIl[1]] = lIIllllIIl[19];
                    if (lIIIIllIIIIll(Inventory.contains(iArr17) ? 1 : 0)) {
                        String[] strArr7 = new String[lIIllllIIl[0]];
                        strArr7[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[36]];
                        if (lIIIIllIIIIll(Inventory.contains(strArr7) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[37]];
                            if (lIIIIllIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr8 = new String[lIIllllIIl[0]];
                                strArr8[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[38]];
                                TileObjects.getNearest(strArr8).interact(lIIlllIlll[lIIllllIIl[39]]);
                                Time.sleepTicks(lIIllllIIl[4]);
                                "".length();
                            }
                            C0006g.a(bR);
                        }
                    }
                }
                String[] strArr9 = new String[lIIllllIIl[0]];
                strArr9[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[40]];
                if (lIIIIllIIIIIl(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lIIllllIIl[0]];
                    strArr10[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[41]];
                    if (lIIIIllIIIIIl(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lIIllllIIl[0]];
                        strArr11[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[42]];
                        if (lIIIIllIIIIll(Inventory.contains(strArr11) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIIllllIIl[43], lIIllllIIl[44], lIIllllIIl[1]);
                            WorldPoint worldPoint3 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[44], lIIllllIIl[1]);
                            WorldArea worldArea = new WorldArea(lIIllllIIl[21], lIIllllIIl[45], lIIllllIIl[14], lIIllllIIl[8], lIIllllIIl[1]);
                            if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && lIIIIllIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[46]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIIllllIIl[0]);
                                "".length();
                            }
                            if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                String[] strArr12 = new String[lIIllllIIl[0]];
                                strArr12[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[47]];
                                TileObjects.getNearest(strArr12).interact(lIIlllIlll[lIIllllIIl[48]]);
                                Time.sleepTicks(lIIllllIIl[3]);
                                "".length();
                            }
                            if (lIIIIllIIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[49]];
                                String[] strArr13 = new String[lIIllllIIl[0]];
                                strArr13[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[50]];
                                TileItems.getNearest(strArr13).interact(lIIlllIlll[lIIllllIIl[51]]);
                                Time.sleepTicks(lIIllllIIl[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr14 = new String[lIIllllIIl[0]];
                strArr14[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[52]];
                if (lIIIIllIIIIIl(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lIIllllIIl[0]];
                    strArr15[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[53]];
                    if (lIIIIllIIIIll(Inventory.contains(strArr15) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lIIllllIIl[21], lIIllllIIl[45], lIIllllIIl[14], lIIllllIIl[8], lIIllllIIl[1]);
                        WorldArea worldArea3 = new WorldArea(lIIllllIIl[54], lIIllllIIl[55], lIIllllIIl[18], lIIllllIIl[23], lIIllllIIl[1]);
                        if (lIIIIllIIIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[lIIllllIIl[0]];
                            strArr16[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[56]];
                            TileObjects.getNearest(strArr16).interact(lIIlllIlll[lIIllllIIl[57]]);
                            Time.sleepTicks(lIIllllIIl[3]);
                            "".length();
                        }
                        if (lIIIIllIIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIllIIIIll(hX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[58]];
                            Movement.walkTo(hU);
                            "".length();
                            Time.sleepTicks(lIIllllIIl[0]);
                            "".length();
                        }
                        if (lIIIIllIIIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr17 = new String[lIIllllIIl[0]];
                            strArr17[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[59]];
                            TileObjects.getNearest(strArr17).interact(lIIlllIlll[lIIllllIIl[60]]);
                            Time.sleepTicks(lIIllllIIl[4]);
                            "".length();
                        }
                        if (lIIIIllIIIIIl(hX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint4 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[61], lIIllllIIl[1]);
                            WorldPoint worldPoint5 = new WorldPoint(lIIllllIIl[62], lIIllllIIl[63], lIIllllIIl[1]);
                            new WorldPoint(lIIllllIIl[64], lIIllllIIl[65], lIIllllIIl[1]);
                            new WorldPoint(lIIllllIIl[43], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldPoint worldPoint6 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldPoint worldPoint7 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldArea worldArea4 = new WorldArea(lIIllllIIl[68], lIIllllIIl[69], lIIllllIIl[20], lIIllllIIl[23], lIIllllIIl[1]);
                            WorldArea worldArea5 = new WorldArea(lIIllllIIl[70], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[17], lIIllllIIl[1]);
                            WorldArea worldArea6 = new WorldArea(lIIllllIIl[72], lIIllllIIl[73], lIIllllIIl[32], lIIllllIIl[25], lIIllllIIl[1]);
                            if (lIIIIllIIlIlI(Vars.getBit(lIIllllIIl[74]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[75]))) {
                                if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[76]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lIIllllIIl[0]);
                                    "".length();
                                }
                                if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[77]];
                                    String[] strArr18 = new String[lIIllllIIl[0]];
                                    strArr18[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[78]];
                                    TileObjects.getNearest(strArr18).interact(lIIlllIlll[lIIllllIIl[79]]);
                                    Time.sleepTicks(lIIllllIIl[8]);
                                    "".length();
                                }
                            }
                            if (lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[74]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[75]))) {
                                if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[81]];
                                    Movement.walkTo(worldPoint5);
                                    "".length();
                                    Time.sleepTicks(lIIllllIIl[0]);
                                    "".length();
                                }
                                if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[82]];
                                    String[] strArr19 = new String[lIIllllIIl[0]];
                                    strArr19[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[15]];
                                    TileObjects.getNearest(strArr19).interact(lIIlllIlll[lIIllllIIl[83]]);
                                    Time.sleepTicks(lIIllllIIl[8]);
                                    "".length();
                                }
                            }
                            if (lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[74]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[80]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[75]))) {
                                if (lIIIIllIIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint8 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[84], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[85]];
                                        Movement.walkTo(worldPoint8);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        String[] strArr20 = new String[lIIllllIIl[0]];
                                        strArr20[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[86]];
                                        TileObjects.getNearest(strArr20).interact(lIIlllIlll[lIIllllIIl[87]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[88]];
                                    String[] strArr21 = new String[lIIllllIIl[0]];
                                    strArr21[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[89]];
                                    TileObjects.getNearest(strArr21).interact(lIIlllIlll[lIIllllIIl[90]]);
                                    Time.sleepTicks(lIIllllIIl[8]);
                                    "".length();
                                }
                            }
                            if (lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[74]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[80]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0])) {
                                if (lIIIIllIIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint9 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[91], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[92]];
                                        Movement.walkTo(worldPoint9);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        String[] strArr22 = new String[lIIllllIIl[0]];
                                        strArr22[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[93]];
                                        TileObjects.getNearest(strArr22).interact(lIIlllIlll[lIIllllIIl[94]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[95]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[96]];
                                        String[] strArr23 = new String[lIIllllIIl[0]];
                                        strArr23[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[97]];
                                        TileObjects.getNearest(strArr23).interact(lIIlllIlll[lIIllllIIl[98]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[74]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0])) {
                                if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[99]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lIIllllIIl[0]);
                                    "".length();
                                }
                                if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[100]];
                                    String[] strArr24 = new String[lIIllllIIl[0]];
                                    strArr24[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[101]];
                                    TileObjects.getNearest(strArr24).interact(lIIlllIlll[lIIllllIIl[102]]);
                                    Time.sleepTicks(lIIllllIIl[8]);
                                    "".length();
                                }
                            }
                            if (lIIIIllIIIIll(Vars.getBit(lIIllllIIl[74])) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[103])) && lIIIIllIIIIll(bI() ? 1 : 0)) {
                                if (lIIIIllIIIIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIIIllIIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint10 = new WorldPoint(lIIllllIIl[104], lIIllllIIl[84], lIIllllIIl[1]);
                                        if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[105]];
                                            Movement.walkTo(worldPoint10);
                                            "".length();
                                            Time.sleepTicks(lIIllllIIl[0]);
                                            "".length();
                                        }
                                        if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            String[] strArr25 = new String[lIIllllIIl[0]];
                                            strArr25[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[106]];
                                            TileObjects.getNearest(strArr25).interact(lIIlllIlll[lIIllllIIl[107]]);
                                            Time.sleepTicks(lIIllllIIl[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIIIIllIIIIIl(new WorldArea(lIIllllIIl[72], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIllIIIIll(bI() ? 1 : 0)) {
                                        WorldPoint worldPoint11 = new WorldPoint(lIIllllIIl[108], lIIllllIIl[109], lIIllllIIl[1]);
                                        if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[110]];
                                            Movement.walkTo(worldPoint11);
                                            "".length();
                                            Time.sleepTicks(lIIllllIIl[0]);
                                            "".length();
                                        }
                                        if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            String[] strArr26 = new String[lIIllllIIl[0]];
                                            strArr26[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[111]];
                                            TileObjects.getNearest(strArr26).interact(lIIlllIlll[lIIllllIIl[112]]);
                                            Time.sleepTicks(lIIllllIIl[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIIIIllIIIIIl(new WorldArea(lIIllllIIl[70], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint12 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[113], lIIllllIIl[1]);
                                        if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[114]];
                                            Movement.walkTo(worldPoint12);
                                            "".length();
                                            Time.sleepTicks(lIIllllIIl[0]);
                                            "".length();
                                        }
                                        if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            String[] strArr27 = new String[lIIllllIIl[0]];
                                            strArr27[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[115]];
                                            TileObjects.getNearest(strArr27).interact(lIIlllIlll[lIIllllIIl[116]]);
                                            Time.sleepTicks(lIIllllIIl[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (lIIIIllIIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIllIIIIll(bI() ? 1 : 0)) {
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[117]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[118]];
                                        String[] strArr28 = new String[lIIllllIIl[0]];
                                        strArr28[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[119]];
                                        TileObjects.getNearest(strArr28).interact(lIIlllIlll[lIIllllIIl[120]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIIIIllIIIIll(Vars.getBit(lIIllllIIl[74])) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[103]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[121]))) {
                                if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[122]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(lIIllllIIl[0]);
                                    "".length();
                                }
                                if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[123]];
                                    String[] strArr29 = new String[lIIllllIIl[0]];
                                    strArr29[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[124]];
                                    TileObjects.getNearest(strArr29).interact(lIIlllIlll[lIIllllIIl[125]]);
                                    Time.sleepTicks(lIIllllIIl[8]);
                                    "".length();
                                }
                            }
                            if (lIIIIllIIIIll(Vars.getBit(lIIllllIIl[74])) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[103]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[121]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[126]))) {
                                WorldArea worldArea7 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (lIIIIllIIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint13 = new WorldPoint(lIIllllIIl[127], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[128]];
                                        Movement.walkTo(worldPoint13);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        String[] strArr30 = new String[lIIllllIIl[0]];
                                        strArr30[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[129]];
                                        TileObjects.getNearest(strArr30).interact(lIIlllIlll[lIIllllIIl[130]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint14 = new WorldPoint(lIIllllIIl[131], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[132]];
                                        Movement.walkTo(worldPoint14);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        String[] strArr31 = new String[lIIllllIIl[0]];
                                        strArr31[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[133]];
                                        TileObjects.getNearest(strArr31).interact(lIIlllIlll[lIIllllIIl[134]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[135]];
                                    String[] strArr32 = new String[lIIllllIIl[0]];
                                    strArr32[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[136]];
                                    TileObjects.getNearest(strArr32).interact(lIIlllIlll[lIIllllIIl[137]]);
                                    Time.sleepTicks(lIIllllIIl[16]);
                                    "".length();
                                }
                            }
                            if (lIIIIllIIIIll(Vars.getBit(lIIllllIIl[74])) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[103]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[121]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[126]), lIIllllIIl[0])) {
                                WorldArea worldArea8 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (lIIIIllIIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint15 = new WorldPoint(lIIllllIIl[138], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[139]];
                                        Movement.walkTo(worldPoint15);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        String[] strArr33 = new String[lIIllllIIl[0]];
                                        strArr33[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[140]];
                                        TileObjects.getNearest(strArr33).interact(lIIlllIlll[lIIllllIIl[141]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint16 = new WorldPoint(lIIllllIIl[108], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[142]];
                                        Movement.walkTo(worldPoint16);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        String[] strArr34 = new String[lIIllllIIl[0]];
                                        strArr34[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[143]];
                                        TileObjects.getNearest(strArr34).interact(lIIlllIlll[lIIllllIIl[144]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[145]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[146]];
                                        String[] strArr35 = new String[lIIllllIIl[0]];
                                        strArr35[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[147]];
                                        TileObjects.getNearest(strArr35).interact(lIIlllIlll[lIIllllIIl[148]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIIIIllIIIIll(Vars.getBit(lIIllllIIl[74])) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[103])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[121]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[126]), lIIllllIIl[0])) {
                                WorldArea worldArea9 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (lIIIIllIIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint17 = new WorldPoint(lIIllllIIl[127], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[149]];
                                        Movement.walkTo(worldPoint17);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        String[] strArr36 = new String[lIIllllIIl[0]];
                                        strArr36[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[150]];
                                        TileObjects.getNearest(strArr36).interact(lIIlllIlll[lIIllllIIl[151]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint18 = new WorldPoint(lIIllllIIl[104], lIIllllIIl[152], lIIllllIIl[1]);
                                    if (lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[153]];
                                        Movement.walkTo(worldPoint18);
                                        "".length();
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                    }
                                    if (lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        Time.sleepTicks(lIIllllIIl[0]);
                                        "".length();
                                        String[] strArr37 = new String[lIIllllIIl[0]];
                                        strArr37[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[154]];
                                        TileObjects.getNearest(strArr37).interact(lIIlllIlll[lIIllllIIl[155]]);
                                        Time.sleepTicks(lIIllllIIl[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllIIIIIl(new WorldArea(lIIllllIIl[72], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIllIIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[156]];
                                    Time.sleepTicks(lIIllllIIl[0]);
                                    "".length();
                                    int[] iArr18 = new int[lIIllllIIl[0]];
                                    iArr18[lIIllllIIl[1]] = lIIllllIIl[157];
                                    TileObjects.getNearest(iArr18).interact(lIIlllIlll[lIIllllIIl[158]]);
                                    Time.sleepTicks(lIIllllIIl[8]);
                                    "".length();
                                }
                                if (lIIIIllIIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] iArr19 = new int[lIIllllIIl[0]];
                                    iArr19[lIIllllIIl[1]] = lIIllllIIl[159];
                                    TileObjects.getNearest(iArr19).interact(lIIlllIlll[lIIllllIIl[160]]);
                                    Time.sleepTicks(lIIllllIIl[8]);
                                    "".length();
                                }
                                if (lIIIIllIIIIIl(new WorldArea(lIIllllIIl[161], lIIllllIIl[162], lIIllllIIl[23], lIIllllIIl[14], lIIllllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr38 = new String[lIIllllIIl[0]];
                                    strArr38[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[163]];
                                    if (lIIIIllIIIIll(Inventory.contains(strArr38) ? 1 : 0)) {
                                        String[] strArr39 = new String[lIIllllIIl[0]];
                                        strArr39[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[164]];
                                        TileItems.getNearest(strArr39).interact(lIIlllIlll[lIIllllIIl[165]]);
                                        Time.sleepTicks(lIIllllIIl[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr40 = new String[lIIllllIIl[0]];
                strArr40[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[166]];
                if (lIIIIllIIIIIl(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lIIllllIIl[0]];
                    strArr41[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[167]];
                    if (lIIIIllIIIIIl(Inventory.contains(strArr41) ? 1 : 0)) {
                        if (lIIIIllIIIIIl(new WorldArea(lIIllllIIl[161], lIIllllIIl[162], lIIllllIIl[23], lIIllllIIl[14], lIIllllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIIllllIIl[0]];
                            iArr20[lIIllllIIl[1]] = lIIllllIIl[159];
                            TileObjects.getNearest(iArr20).interact(lIIlllIlll[lIIllllIIl[168]]);
                            Time.sleepTicks(lIIllllIIl[14]);
                            "".length();
                        }
                        if (lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[169]];
                            Movement.walkTo(hV);
                            "".length();
                            Time.sleepTicks(lIIllllIIl[0]);
                            "".length();
                        }
                        if (lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                                if (lIIIIllIIIIIl(tileObject.getName().contains(lIIlllIlll[lIIllllIIl[185]]) ? 1 : 0)) {
                                    String[] strArr42 = new String[lIIllllIIl[0]];
                                    strArr42[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[186]];
                                    if (lIIIIllIIIIIl(tileObject.hasAction(strArr42) ? 1 : 0) && lIIIIllIIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllllIIl[21], lIIllllIIl[184], lIIllllIIl[3])), lIIllllIIl[3])) {
                                        ?? r0 = lIIllllIIl[0];
                                        "".length();
                                        return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return lIIllllIIl[1];
                            });
                            if (lIIIIllIIIlII(nearest3)) {
                                nearest3.interact(lIIlllIlll[lIIllllIIl[170]]);
                                Time.sleepTicks(lIIllllIIl[8]);
                                "".length();
                            }
                            if (lIIIIllIIlIll(nearest3)) {
                                C0006g.a(lIIlllIlll[lIIllllIIl[171]], bR, lIIllllIIl[0]);
                            }
                        }
                    }
                }
            }
            if (lIIIIllIIlIIl(C0004e.j(hW), lIIllllIIl[3])) {
                if (lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[172]];
                    Movement.walkTo(hV);
                    "".length();
                    Time.sleepTicks(lIIllllIIl[0]);
                    "".length();
                }
                if (lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                        if (lIIIIllIIIIIl(tileObject2.getName().contains(lIIlllIlll[lIIllllIIl[182]]) ? 1 : 0)) {
                            String[] strArr42 = new String[lIIllllIIl[0]];
                            strArr42[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[183]];
                            if (lIIIIllIIIIIl(tileObject2.hasAction(strArr42) ? 1 : 0) && lIIIIllIIlIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIllllIIl[21], lIIllllIIl[184], lIIllllIIl[3])), lIIllllIIl[3])) {
                                ?? r0 = lIIllllIIl[0];
                                "".length();
                                return (-" ".length()) > 0 ? ((((18 + 141) - 53) + 55) ^ (((43 + 31) - (-99)) + 12)) & (((((21 + 17) - 28) + 118) ^ (((129 + 72) - 159) + 110)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lIIllllIIl[1];
                    });
                    if (lIIIIllIIIlII(nearest4)) {
                        nearest4.interact(lIIlllIlll[lIIllllIIl[173]]);
                        Time.sleepTicks(lIIllllIIl[8]);
                        "".length();
                    }
                    if (lIIIIllIIlIll(nearest4)) {
                        if (lIIIIllIIIIlI(ck, lIIllllIIl[0])) {
                            U.mQ += lIIllllIIl[0];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllllIIl[0];
                            U.mQ = lIIllllIIl[1];
                            cl = lIIllllIIl[1];
                        }
                        C0006g.a(lIIlllIlll[lIIllllIIl[174]], bR, lIIllllIIl[0]);
                    }
                }
            }
            C0006g.a(bR);
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlllIlll[lIIllllIIl[180]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    static boolean bI() {
        if (lIIIIllIIIIll(Vars.getBit(lIIllllIIl[74])) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[80])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[75]), lIIllllIIl[0]) && lIIIIllIIIIll(Vars.getBit(lIIllllIIl[103])) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[121]), lIIllllIIl[0]) && lIIIIllIIlIIl(Vars.getBit(lIIllllIIl[126]), lIIllllIIl[0])) {
            ?? r0 = lIIllllIIl[0];
            "".length();
            return ((87 ^ 96) & ((79 ^ 120) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllllIIl[1];
    }

    private static boolean lIIIIllIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIllIIIlIl(int i) {
        return i > 0;
    }

    private static boolean lIIIIllIIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIllIIlIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIIIIlIlIIlIl(String llllllllllllllllllllIlllllIlIIll, String llllllllllllllllllllIlllllIlIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIlllllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIlllllIlIIIl = new StringBuilder();
        char[] llllllllllllllllllllIlllllIlIIII = llllllllllllllllllllIlllllIlIIlI.toCharArray();
        int llllllllllllllllllllIlllllIIllll = lIIllllIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllllIIl[1];
        while (lIIIIllIIIIlI(i, length)) {
            char llllllllllllllllllllIlllllIlIlII = charArray[i];
            llllllllllllllllllllIlllllIlIIIl.append((char) (llllllllllllllllllllIlllllIlIlII ^ llllllllllllllllllllIlllllIlIIII[llllllllllllllllllllIlllllIIllll % llllllllllllllllllllIlllllIlIIII.length]));
            "".length();
            llllllllllllllllllllIlllllIIllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIlllllIlIIIl);
    }

    private static boolean lIIIIllIIIIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIllIIllII(C0004e.j(lIIllllIIl[47]), lIIllllIIl[8])) {
            ?? r0 = lIIllllIIl[0];
            "".length();
            return ((((21 + 73) - 11) + 106) ^ (((29 + 157) - 104) + 103)) <= "   ".length() ? ((193 ^ 154) ^ (48 ^ 60)) & (((11 ^ 101) ^ (13 ^ 52)) ^ (-" ".length())) : r0;
        }
        return lIIllllIIl[1];
    }

    private static void lIIIIlIllIIIl() {
        lIIlllIlll = new String[lIIllllIIl[197]];
        lIIlllIlll[lIIllllIIl[1]] = lIIIIlIlIIIll("RBZX+BNYYjLKeUtXADvIQiS7WTfgzFe9G47kOPHYrK6+E69VBjQjsqfUSPZfPk2J", "cneTz");
        lIIlllIlll[lIIllllIIl[0]] = lIIIIlIlIIlII("CoHxHv3ZAaG5V+Nv8tA8vg==", "UZCro");
        lIIlllIlll[lIIllllIIl[3]] = lIIIIlIlIIIll("WRnf3wsyKnAyuhoWteZfO44ICRAYHAQ0", "WRYjZ");
        lIIlllIlll[lIIllllIIl[8]] = lIIIIlIlIIIll("px22TP5Dg09yDmc4C2WZz5ldMLv6zrOX2vpL6C9QzDMmb1+v8F5vysc9CTyi5QebSavPVKoJO8Y=", "eMBub");
        lIIlllIlll[lIIllllIIl[4]] = lIIIIlIlIIlIl("PBMzGAY=", "xaZvm");
        lIIlllIlll[lIIllllIIl[14]] = lIIIIlIlIIIll("rCfgeBWhWKI=", "GgydB");
        lIIlllIlll[lIIllllIIl[17]] = lIIIIlIlIIIll("CPXr7QtOfVlH4Hhw+HA7gA==", "RDjLT");
        lIIlllIlll[lIIllllIIl[18]] = lIIIIlIlIIlIl("Oz0gPSxIODQqKxw=", "hIAOX");
        lIIlllIlll[lIIllllIIl[16]] = lIIIIlIlIIlII("CyUf57mh0F/0SjIhnW9nVg==", "PuLeh");
        lIIlllIlll[lIIllllIIl[20]] = lIIIIlIlIIlII("ySR/BZTNfc4=", "wOYOk");
        lIIlllIlll[lIIllllIIl[10]] = lIIIIlIlIIlII("NO/NzJ80hBaEJXrvfkPmMnd/+86sX4PG", "XqAlQ");
        lIIlllIlll[lIIllllIIl[23]] = lIIIIlIlIIIll("9N8heQS/TeN5eCMhLcoJgt/3Azw//Czc", "FIPMf");
        lIIlllIlll[lIIllllIIl[24]] = lIIIIlIlIIlII("dyKKRayDcHsG/W50O0BiNQ==", "ljNmI");
        lIIlllIlll[lIIllllIIl[25]] = lIIIIlIlIIlIl("HwknBA==", "KhLaT");
        lIIlllIlll[lIIllllIIl[26]] = lIIIIlIlIIIll("oBGxYusKh2UZEEdF1hsx7dUHRPyRT4zE", "vJkWF");
        lIIlllIlll[lIIllllIIl[27]] = lIIIIlIlIIlIl("ISwN", "jItyo");
        lIIlllIlll[lIIllllIIl[28]] = lIIIIlIlIIlII("C6skvZX9nzObdsHFo6UtEA==", "vFKKb");
        lIIlllIlll[lIIllllIIl[29]] = lIIIIlIlIIlII("MHeNDPywVPc=", "lxzXf");
        lIIlllIlll[lIIllllIIl[30]] = lIIIIlIlIIlIl("BRcZJCU1DFQ8LycI", "FxtTJ");
        lIIlllIlll[lIIllllIIl[31]] = lIIIIlIlIIIll("2q7OQunM3e0=", "UOTyL");
        lIIlllIlll[lIIllllIIl[32]] = lIIIIlIlIIlIl("BDc+", "ORGXo");
        lIIlllIlll[lIIllllIIl[33]] = lIIIIlIlIIlIl("FzQ/QRw2dS8OHTchKAgG", "YUIah");
        lIIlllIlll[lIIllllIIl[34]] = lIIIIlIlIIlII("l3umkhoGrS1CR8ztf0qZhQ==", "baCtH");
        lIIlllIlll[lIIllllIIl[35]] = lIIIIlIlIIIll("r00UqbgJZG8=", "PxFZM");
        lIIlllIlll[lIIllllIIl[36]] = lIIIIlIlIIIll("WCk//dZGGj3FqMPtSK/A0w==", "FXQRe");
        lIIlllIlll[lIIllllIIl[37]] = lIIIIlIlIIIll("xMthGV3ZcmT1sY+ytJz0cQ==", "VADZX");
        lIIlllIlll[lIIllllIIl[38]] = lIIIIlIlIIlII("XQOWiHC9CnSgBX94m8V0fg==", "UxbZt");
        lIIlllIlll[lIIllllIIl[39]] = lIIIIlIlIIlIl("MTYxOCIK", "bSPJA");
        lIIlllIlll[lIIllllIIl[40]] = lIIIIlIlIIlII("hhYifZs+Xzk=", "PuCKR");
        lIIlllIlll[lIIllllIIl[41]] = lIIIIlIlIIlIl("GR8wEic8HzBBMygYMgQ=", "ImUaT");
        lIIlllIlll[lIIllllIIl[42]] = lIIIIlIlIIlII("yWnhzPU2IYrOld/uvtY3bA==", "UwHOr");
        lIIlllIlll[lIIllllIIl[46]] = lIIIIlIlIIlII("CD+uT2Zq89tpWE3XY7WPxA==", "Pbpki");
        lIIlllIlll[lIIllllIIl[47]] = lIIIIlIlIIlII("8P4EM5EJDq8=", "wcOOy");
        lIIlllIlll[lIIllllIIl[48]] = lIIIIlIlIIlIl("CSY3NA==", "FVRZf");
        lIIlllIlll[lIIllllIIl[49]] = lIIIIlIlIIIll("lEq6ib1teZnZ9393YjK1qw==", "GYCar");
        lIIlllIlll[lIIllllIIl[50]] = lIIIIlIlIIIll("XTUUyCL1i10pCyO4UjTepQ==", "pfoEy");
        lIIlllIlll[lIIllllIIl[51]] = lIIIIlIlIIlIl("HSskDw==", "IJOjR");
        lIIlllIlll[lIIllllIIl[52]] = lIIIIlIlIIlII("sdZMQI8MvxmAz+vJOmtKJw==", "IFSMP");
        lIIlllIlll[lIIllllIIl[53]] = lIIIIlIlIIIll("tqBoMCp8sTc=", "TlJmU");
        lIIlllIlll[lIIllllIIl[56]] = lIIIIlIlIIlIl("MQEdNA==", "unrFT");
        lIIlllIlll[lIIllllIIl[57]] = lIIIIlIlIIIll("9OBJVtzyIhA=", "Lhenv");
        lIIlllIlll[lIIllllIIl[58]] = lIIIIlIlIIlIl("Jzs1UxoGeiUaAAg2YwEBBjc=", "iZCsn");
        lIIlllIlll[lIIllllIIl[59]] = lIIIIlIlIIlII("C+KARuJFQ0Q=", "YdUlT");
        lIIlllIlll[lIIllllIIl[60]] = lIIIIlIlIIIll("wPluOeY2gXp32j5NMJ4Dcw==", "GjWeT");
        lIIlllIlll[lIIllllIIl[76]] = lIIIIlIlIIlIl("GgMxYg47QiY=", "TbGBz");
        lIIlllIlll[lIIllllIIl[77]] = lIIIIlIlIIlII("KVFgmn2b5YATSV77Tnjnbg==", "cTZdE");
        lIIlllIlll[lIIllllIIl[78]] = lIIIIlIlIIlIl("KgQcNB9GIA==", "fajQm");
        lIIlllIlll[lIIllllIIl[79]] = lIIIIlIlIIlII("btV1TAFF8J8=", "fDbld");
        lIIlllIlll[lIIllllIIl[81]] = lIIIIlIlIIlIl("HxkPaS4+WBs=", "QxyIZ");
        lIIlllIlll[lIIllllIIl[82]] = lIIIIlIlIIlII("pnV6Roljx06TNBDzfUKGlg==", "hWbOg");
        lIIlllIlll[lIIllllIIl[15]] = lIIIIlIlIIIll("ZK6Jo/CnSkQ=", "GFRsN");
        lIIlllIlll[lIIllllIIl[83]] = lIIIIlIlIIlII("6SVNAeZtrIA=", "AWSau");
        lIIlllIlll[lIIllllIIl[85]] = lIIIIlIlIIIll("j9r8BCs61sYy5nNQjaZBrg==", "YlBjI");
        lIIlllIlll[lIIllllIIl[86]] = lIIIIlIlIIIll("rXfUwq8uCOQ=", "QAqiX");
        lIIlllIlll[lIIllllIIl[87]] = lIIIIlIlIIlIl("FjsPAg==", "YKjlL");
        lIIlllIlll[lIIllllIIl[88]] = lIIIIlIlIIIll("yvQgymN3W+qOr4YY/CaiqA==", "gkyMc");
        lIIlllIlll[lIIllllIIl[89]] = lIIIIlIlIIIll("ZhHwIhNHwfE=", "EgmuB");
        lIIlllIlll[lIIllllIIl[90]] = lIIIIlIlIIlIl("BRcpLw==", "UbECV");
        lIIlllIlll[lIIllllIIl[92]] = lIIIIlIlIIIll("7QOvpQBq+3nogIFnzUW9Hg==", "peFME");
        lIIlllIlll[lIIllllIIl[93]] = lIIIIlIlIIlIl("PSMgJw==", "yLOUi");
        lIIlllIlll[lIIllllIIl[94]] = lIIIIlIlIIlII("O1zBUS+wHSs=", "rnZfT");
        lIIlllIlll[lIIllllIIl[95]] = lIIIIlIlIIlIl("IA0idyMBTDY=", "nlTWW");
        lIIlllIlll[lIIllllIIl[96]] = lIIIIlIlIIIll("PeeXU+1jNzDdxZZuphQRSA==", "tJsxx");
        lIIlllIlll[lIIllllIIl[97]] = lIIIIlIlIIIll("OfhGPf929s4=", "pJsEY");
        lIIlllIlll[lIIllllIIl[98]] = lIIIIlIlIIIll("3g/cwJvWTIc=", "ZLDXE");
        lIIlllIlll[lIIllllIIl[99]] = lIIIIlIlIIIll("RIxFl0mOJ9iMRGAtG9u+Uw==", "ltTBq");
        lIIlllIlll[lIIllllIIl[100]] = lIIIIlIlIIlII("zzpYaUYp/RH7AkKvyuVVPA==", "lNAKo");
        lIIlllIlll[lIIllllIIl[101]] = lIIIIlIlIIlIl("Kw8MACtHKw==", "gjzeY");
        lIIlllIlll[lIIllllIIl[102]] = lIIIIlIlIIlII("pq+SGFpB8Xc=", "bgLHf");
        lIIlllIlll[lIIllllIIl[105]] = lIIIIlIlIIIll("d5giVU8r1z8jqveoD8o2zg==", "sXTZK");
        lIIlllIlll[lIIllllIIl[106]] = lIIIIlIlIIlII("0HS7O6u8/14=", "TTcLm");
        lIIlllIlll[lIIllllIIl[107]] = lIIIIlIlIIIll("buYtJc+FpbI=", "OriVm");
        lIIlllIlll[lIIllllIIl[110]] = lIIIIlIlIIIll("R+AuqrJlz9TbS0mC9tF0dA==", "UhQvJ");
        lIIlllIlll[lIIllllIIl[111]] = lIIIIlIlIIlIl("Ix0bKg==", "grtXr");
        lIIlllIlll[lIIllllIIl[112]] = lIIIIlIlIIIll("8HnAoyB/Irg=", "AMRyy");
        lIIlllIlll[lIIllllIIl[114]] = lIIIIlIlIIlII("1pba0NCUmBcM4f2Ntx3aFQ==", "dmwfG");
        lIIlllIlll[lIIllllIIl[115]] = lIIIIlIlIIlII("eA6aARsAvF0=", "KqPef");
        lIIlllIlll[lIIllllIIl[116]] = lIIIIlIlIIlII("jFajeKGsHrU=", "JBosj");
        lIIlllIlll[lIIllllIIl[117]] = lIIIIlIlIIlII("bUc0kq/RaBJQzaBuRWFVFQ==", "wsHPz");
        lIIlllIlll[lIIllllIIl[118]] = lIIIIlIlIIlIl("PwIOKnkDEhQjKw==", "owbFY");
        lIIlllIlll[lIIllllIIl[119]] = lIIIIlIlIIlIl("ORI0CiFVMg==", "uwBoS");
        lIIlllIlll[lIIllllIIl[120]] = lIIIIlIlIIlII("OBw7uALQfns=", "lVgfm");
        lIIlllIlll[lIIllllIIl[122]] = lIIIIlIlIIlIl("LyoCcTEOaxI=", "aKtQE");
        lIIlllIlll[lIIllllIIl[123]] = lIIIIlIlIIlIl("KiYBIUsWNhsoGQ==", "zSmMk");
        lIIlllIlll[lIIllllIIl[124]] = lIIIIlIlIIlII("nRk1LH21fqA=", "GaUsL");
        lIIlllIlll[lIIllllIIl[125]] = lIIIIlIlIIlIl("Gz0ODg==", "KHbbq");
        lIIlllIlll[lIIllllIIl[128]] = lIIIIlIlIIlII("/6G1+BiqW5yg7dTGy+sJlQ==", "Scmif");
        lIIlllIlll[lIIllllIIl[129]] = lIIIIlIlIIIll("693T9J6U1+c=", "gzFsq");
        lIIlllIlll[lIIllllIIl[130]] = lIIIIlIlIIIll("T7tNP3G+MhA=", "mOMWA");
        lIIlllIlll[lIIllllIIl[132]] = lIIIIlIlIIlIl("OgE1KFADAWMpHxgc", "wnCMp");
        lIIlllIlll[lIIllllIIl[133]] = lIIIIlIlIIlII("s3VMtB4jqsc=", "HtcEU");
        lIIlllIlll[lIIllllIIl[134]] = lIIIIlIlIIIll("lhFQ7Un7BWM=", "erPkm");
        lIIlllIlll[lIIllllIIl[135]] = lIIIIlIlIIIll("fDD0dOiLytzG263daZO2Og==", "Icbaw");
        lIIlllIlll[lIIllllIIl[136]] = lIIIIlIlIIlII("OOoRuftz+CM=", "ELbhP");
        lIIlllIlll[lIIllllIIl[137]] = lIIIIlIlIIIll("Vf63fAnI2l4=", "EdlXV");
        lIIlllIlll[lIIllllIIl[139]] = lIIIIlIlIIlII("08zD7h6i65INom7PbwDCGQ==", "PxKvl");
        lIIlllIlll[lIIllllIIl[140]] = lIIIIlIlIIlIl("MgUGOw==", "vjiIb");
        lIIlllIlll[lIIllllIIl[141]] = lIIIIlIlIIlII("mwitVQ1Yhxg=", "Fxrhp");
        lIIlllIlll[lIIllllIIl[142]] = lIIIIlIlIIIll("qjEjaxOp7LY1bjZl6NM7hg==", "qjpzQ");
        lIIlllIlll[lIIllllIIl[143]] = lIIIIlIlIIlIl("Lz8NEw==", "kPban");
        lIIlllIlll[lIIllllIIl[144]] = lIIIIlIlIIIll("8YUJ+fc5knQ=", "XNxsO");
        lIIlllIlll[lIIllllIIl[145]] = lIIIIlIlIIlIl("BBESSiAlUAE=", "JpdjT");
        lIIlllIlll[lIIllllIIl[146]] = lIIIIlIlIIIll("mIo8LOWAKmUOnBT90w3ykA==", "MGgAR");
        lIIlllIlll[lIIllllIIl[147]] = lIIIIlIlIIlIl("Ag4xFTFuLg==", "NkGpC");
        lIIlllIlll[lIIllllIIl[148]] = lIIIIlIlIIlIl("NSMbKA==", "eVwDF");
        lIIlllIlll[lIIllllIIl[149]] = lIIIIlIlIIlIl("Bi4SAkk/LkQDBiQz", "KAdgi");
        lIIlllIlll[lIIllllIIl[150]] = lIIIIlIlIIIll("XIcVgP4itwI=", "iudgu");
        lIIlllIlll[lIIllllIIl[151]] = lIIIIlIlIIlIl("DjYjPg==", "AFFPw");
        lIIlllIlll[lIIllllIIl[153]] = lIIIIlIlIIIll("yj5UEVR5Oaw+H3v8YICJYA==", "SVPsu");
        lIIlllIlll[lIIllllIIl[154]] = lIIIIlIlIIlII("iuSF4Q6GLGE=", "XTLMZ");
        lIIlllIlll[lIIllllIIl[155]] = lIIIIlIlIIlII("1f8N549ZwfI=", "MnRKg");
        lIIlllIlll[lIIllllIIl[156]] = lIIIIlIlIIlII("X36B5z849yLzAKg+EI4j5w==", "BtNvt");
        lIIlllIlll[lIIllllIIl[158]] = lIIIIlIlIIIll("TTIom577tfM=", "Pasxj");
        lIIlllIlll[lIIllllIIl[160]] = lIIIIlIlIIIll("u56IQEGbXx4=", "RTTgj");
        lIIlllIlll[lIIllllIIl[163]] = lIIIIlIlIIlIl("DTACRAwjNw==", "BYndo");
        lIIlllIlll[lIIllllIIl[164]] = lIIIIlIlIIlII("ygoARX3z1Rw=", "APpeU");
        lIIlllIlll[lIIllllIIl[165]] = lIIIIlIlIIlII("7W/yW8qWv2o=", "twRSY");
        lIIlllIlll[lIIllllIIl[166]] = lIIIIlIlIIIll("QvzlK92qnFBLhWC3939+hQ==", "WhzXf");
        lIIlllIlll[lIIllllIIl[167]] = lIIIIlIlIIlII("63TmxIA8iCs=", "dVAHg");
        lIIlllIlll[lIIllllIIl[168]] = lIIIIlIlIIlII("jtmf+Ee/3xk=", "kFigf");
        lIIlllIlll[lIIllllIIl[169]] = lIIIIlIlIIlIl("IhQfSyEDVRkZOgoQGhg6Hg==", "luikU");
        lIIlllIlll[lIIllllIIl[170]] = lIIIIlIlIIlII("C6LH3L7HYYM=", "AuAMt");
        lIIlllIlll[lIIllllIIl[171]] = lIIIIlIlIIIll("oquzobw+meWp65qv+sK4v5G9QtfTsk9+", "AWhlo");
        lIIlllIlll[lIIllllIIl[172]] = lIIIIlIlIIlII("2jbTy+NA8nZ8lS7GieKEUi5l844RLkoX", "UkVin");
        lIIlllIlll[lIIllllIIl[173]] = lIIIIlIlIIlII("F45hyfxo85o=", "ZyrEm");
        lIIlllIlll[lIIllllIIl[174]] = lIIIIlIlIIlIl("Kgo4IyMJCzg3ZjUcMyAoCQwyLCg=", "zxWEF");
        lIIlllIlll[lIIllllIIl[180]] = lIIIIlIlIIIll("sppIJA+TVBFeQxihwkwvAM/mF887RB2o", "mUIfx");
        lIIlllIlll[lIIllllIIl[181]] = lIIIIlIlIIIll("LNpL5oNj06th4IHj2gZj45K4l4IB9z4x", "lDsRG");
        lIIlllIlll[lIIllllIIl[182]] = lIIIIlIlIIlII("ms6QtTabjmU=", "czSWb");
        lIIlllIlll[lIIllllIIl[183]] = lIIIIlIlIIlII("ay6YKZQioQQ=", "iugIg");
        lIIlllIlll[lIIllllIIl[185]] = lIIIIlIlIIlII("2WjJuw9sYs8=", "hOpNl");
        lIIlllIlll[lIIllllIIl[186]] = lIIIIlIlIIlII("FHpiic3v+rI=", "mBNBJ");
        lIIlllIlll[lIIllllIIl[193]] = lIIIIlIlIIlII("IhoXk3dsG7k=", "msBsG");
        lIIlllIlll[lIIllllIIl[194]] = lIIIIlIlIIlIl("A0kbZyMlAR0uIS1OECg9ag9WIDozThUmIyYLEmcKOAATNDtk", "JnvGO");
        lIIlllIlll[lIIllllIIl[195]] = lIIIIlIlIIlII("ZfcgygrziqCmNgYthjft7ALz/2SGyxVFFOfXuRYqUQ27g4xLxaXrBl+Go2ymlXh3GT1LYqUyKwFR0pEwDuGA8Q==", "SGAxl");
    }

    private static boolean lIIIIllIIIllI(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIllllIIl[1];
    }

    private static boolean lIIIIllIIlIII(int i, int i2) {
        return i <= i2;
    }

    static {
        lIIIIlIllllll();
        lIIIIlIllIIIl();
        bv = new ArrayList();
        cg = new WorldPoint(lIIllllIIl[64], lIIllllIIl[187], lIIllllIIl[1]);
        hS = new WorldPoint(lIIllllIIl[188], lIIllllIIl[189], lIIllllIIl[1]);
        hT = new WorldPoint(lIIllllIIl[161], lIIllllIIl[190], lIIllllIIl[1]);
        hU = new WorldPoint(lIIllllIIl[191], lIIllllIIl[192], lIIllllIIl[1]);
        hV = new WorldPoint(lIIllllIIl[64], lIIllllIIl[45], lIIllllIIl[3]);
        hW = lIIllllIIl[47];
        String[] strArr = new String[lIIllllIIl[8]];
        strArr[lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[193]];
        strArr[lIIllllIIl[0]] = lIIlllIlll[lIIllllIIl[194]];
        strArr[lIIllllIIl[3]] = lIIlllIlll[lIIllllIIl[195]];
        bR = strArr;
        hX = new WorldArea(lIIllllIIl[188], lIIllllIIl[196], lIIllllIIl[50], lIIllllIIl[40], lIIllllIIl[1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ad, code lost:
        if (lIIIIllIIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C.lIIllllIIl[14]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIllllIIl[0]];
        iArr2[lIIllllIIl[1]] = lIIllllIIl[6];
        if (lIIIIllIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIIl[6], lIIllllIIl[10], lIIllllIIl[175]));
            "".length();
        }
        int[] iArr3 = new int[lIIllllIIl[0]];
        iArr3[lIIllllIIl[1]] = lIIllllIIl[7];
        if (lIIIIllIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIIl[7], lIIllllIIl[0], lIIllllIIl[175]));
            "".length();
        }
        int[] iArr4 = new int[lIIllllIIl[0]];
        iArr4[lIIllllIIl[1]] = lIIllllIIl[9];
        if (lIIIIllIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIIl[9], lIIllllIIl[0], lIIllllIIl[175]));
            "".length();
        }
        if (lIIIIllIIIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlllIlll[lIIllllIIl[181]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIIl[176], lIIllllIIl[14], lIIllllIIl[177]));
            "".length();
        }
        int[] iArr5 = new int[lIIllllIIl[0]];
        iArr5[lIIllllIIl[1]] = lIIllllIIl[12];
        if (lIIIIllIIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIIl[12], lIIllllIIl[4], C0008i.bq));
            "".length();
        }
        int[] iArr6 = new int[lIIllllIIl[0]];
        iArr6[lIIllllIIl[1]] = lIIllllIIl[13];
        if (lIIIIllIIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIllllIIl[0]];
            iArr7[lIIllllIIl[1]] = lIIllllIIl[13];
            if (lIIIIllIIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIllllIIl[0]];
                iArr8[lIIllllIIl[1]] = lIIllllIIl[13];
            }
            iArr = new int[lIIllllIIl[0]];
            iArr[lIIllllIIl[1]] = lIIllllIIl[5];
            if (lIIIIllIIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lIIllllIIl[0]];
                iArr9[lIIllllIIl[1]] = lIIllllIIl[5];
                if (!lIIIIllIIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    return;
                }
                int[] iArr10 = new int[lIIllllIIl[0]];
                iArr10[lIIllllIIl[1]] = lIIllllIIl[5];
                if (!lIIIIllIIIIlI(Bank.getFirst(iArr10).getQuantity(), lIIllllIIl[27])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIllllIIl[5], lIIllllIIl[57], lIIllllIIl[179]));
            "".length();
        }
        bv.add(new C0003d(lIIllllIIl[13], lIIllllIIl[10], lIIllllIIl[178]));
        "".length();
        iArr = new int[lIIllllIIl[0]];
        iArr[lIIllllIIl[1]] = lIIllllIIl[5];
        if (lIIIIllIIIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIllllIIl[5], lIIllllIIl[57], lIIllllIIl[179]));
        "".length();
    }

    private static boolean lIIIIllIIIlll(int i, int i2) {
        return i > i2;
    }

    private static String lIIIIlIlIIlII(String llllllllllllllllllllIllllllIIIll, String llllllllllllllllllllIllllllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllllIllllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllllllIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllllIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIIl[3], llllllllllllllllllllIllllllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllllllIIlII) {
            llllllllllllllllllllIllllllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllIIIIlI(int i, int i2) {
        return i < i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            bH();
            "".length();
            if (0 != 0) {
                return (37 ^ 24) & ((179 ^ 142) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIllllIIl[144];
    }

    private static String lIIIIlIlIIIll(String llllllllllllllllllllIllllIlllllI, String llllllllllllllllllllIllllIllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIlllllIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIlllllIIIIII.init(lIIllllIIl[3], secretKeySpec);
            return new String(llllllllllllllllllllIlllllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllllIllllll) {
            llllllllllllllllllllIllllIllllll.printStackTrace();
            return null;
        }
    }
}
