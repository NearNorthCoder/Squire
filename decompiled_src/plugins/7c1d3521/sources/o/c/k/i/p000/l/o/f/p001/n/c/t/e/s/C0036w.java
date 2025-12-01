package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/w.class */
public class C0036w implements InterfaceC0003ac {
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ int di;
    static /* synthetic */ WorldArea du;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] lIllllIIIl;
    static /* synthetic */ boolean dj;
    static /* synthetic */ WorldArea dv;
    private static /* synthetic */ int[] lIllllIIll;
    static /* synthetic */ WorldArea dw;
    static /* synthetic */ WorldPoint dx;
    static /* synthetic */ WorldPoint dy;
    private static /* synthetic */ String dz;
    private static /* synthetic */ String[] cE;
    private static /* synthetic */ int cY;
    public static /* synthetic */ boolean bt;

    private static boolean lIIllllllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllllIllll(int i) {
        return i == 0;
    }

    private static boolean lIIlllllllIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIIIIIIIl(int i, int i2) {
        return i != i2;
    }

    private static void bg() {
        if (lIIlllllIllIl(new WorldArea(lIllllIIll[52], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] strArr = new String[lIllllIIll[0]];
            strArr[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[142]];
            TileObjects.getNearest(strArr).interact(lIllllIIIl[lIllllIIll[143]]);
            Time.sleepTicks(lIllllIIll[9]);
            "".length();
        }
        if (lIIlllllIllll(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
            AccBuilderSotf.c = lIllllIIIl[lIllllIIll[144]];
            if (lIIlllllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(de);
            "".length();
            Time.sleepTicks(lIllllIIll[0]);
            "".length();
        }
        if (lIIlllllIllIl(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
            C0020g.a(lIllllIIIl[lIllllIIll[145]], cE);
        }
        if (lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIll[52], lIllllIIll[53], lIllllIIll[1])) ? 1 : 0)) {
            String[] strArr2 = new String[lIllllIIll[0]];
            strArr2[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[99]];
            TileObjects.getNearest(strArr2).interact(lIllllIIIl[lIllllIIll[146]]);
            Time.sleepTicks(lIllllIIll[9]);
            "".length();
        }
    }

    private static boolean lIIlllllllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlllllIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllllIllIl(int i) {
        return i != 0;
    }

    private static void lIIlllllIlIll() {
        lIllllIIll = new int[182];
        lIllllIIll[0] = " ".length();
        lIllllIIll[1] = (56 ^ 89) & ((72 ^ 41) ^ (-1));
        lIllllIIll[2] = ((236 + 125) - 293) + 172;
        lIllllIIll[3] = 121 ^ 56;
        lIllllIIll[4] = (181 ^ 146) ^ (145 ^ 188);
        lIllllIIll[5] = (-((-1041) & 28370)) & (-5137) & 32767;
        lIllllIIll[6] = (175 ^ 197) ^ (243 ^ 165);
        lIllllIIll[7] = (-4173) & 4479;
        lIllllIIll[8] = (163 ^ 136) ^ (178 ^ 156);
        lIllllIIll[9] = "  ".length();
        lIllllIIll[10] = 179 ^ 147;
        lIllllIIll[11] = "   ".length();
        lIllllIIll[12] = (((14 + 131) - 81) + 69) ^ (((104 + 43) - 19) + 22);
        lIllllIIll[13] = (66 ^ 57) ^ (((49 + 28) - 26) + 76);
        lIllllIIll[14] = (69 ^ 20) ^ (107 ^ 25);
        lIllllIIll[15] = (236 ^ 190) ^ (21 ^ 117);
        lIllllIIll[16] = (((55 + 109) - 31) + 4) ^ (((10 + 17) - 16) + 132);
        lIllllIIll[17] = (-((-1126) & 7279)) & (-16385) & 23547;
        lIllllIIll[18] = (-16706) & 18781;
        lIllllIIll[19] = 24 ^ 17;
        lIllllIIll[20] = 60 ^ 59;
        lIllllIIll[21] = 49 ^ 57;
        lIllllIIll[22] = 1 ^ 41;
        lIllllIIll[23] = 138 ^ 129;
        lIllllIIll[24] = 34 ^ 46;
        lIllllIIll[25] = (226 ^ 184) ^ (85 ^ 2);
        lIllllIIll[26] = (102 ^ 84) ^ (138 ^ 182);
        lIllllIIll[27] = (-((-6408) & 31039)) & (-1025) & 30655;
        lIllllIIll[28] = 158 ^ 145;
        lIllllIIll[29] = (-22561) & 24491;
        lIllllIIll[30] = (-12321) & 31935;
        lIllllIIll[31] = (-12867) & 32487;
        lIllllIIll[32] = (-18722) & 19247;
        lIllllIIll[33] = (-21505) & 23855;
        lIllllIIll[34] = (-((-24861) & 28605)) & (-16393) & 32761;
        lIllllIIll[35] = 43 ^ 59;
        lIllllIIll[36] = (-8361) & 16367;
        lIllllIIll[37] = (-29221) & 30575;
        lIllllIIll[38] = (-((-8227) & 13559)) & (-513) & 8191;
        lIllllIIll[39] = (-((-8493) & 14653)) & (-8481) & 16383;
        lIllllIIll[40] = (-(136 ^ 194)) & (-30977) & 32767;
        lIllllIIll[41] = (-((-9317) & 13431)) & (-1705) & 16314;
        lIllllIIll[42] = (182 ^ 157) ^ (158 ^ 164);
        lIllllIIll[43] = (-2) & 8011;
        lIllllIIll[44] = (-((-8387) & 29139)) & (-3203) & 24506;
        lIllllIIll[45] = (-21529) & 22523;
        lIllllIIll[46] = 89 ^ 75;
        lIllllIIll[47] = 159 ^ 135;
        lIllllIIll[48] = (124 ^ 99) ^ (201 ^ 194);
        lIllllIIll[49] = 20 ^ 1;
        lIllllIIll[50] = (188 ^ 144) ^ (121 ^ 67);
        lIllllIIll[51] = (3 ^ 108) ^ (66 ^ 58);
        lIllllIIll[52] = (-29605) & 32701;
        lIllllIIll[53] = (-((-24851) & 29655)) & (-24593) & 32756;
        lIllllIIll[54] = (86 ^ 39) ^ (248 ^ 144);
        lIllllIIll[55] = (((51 + 83) - 107) + 107) ^ (((12 + 79) - 27) + 92);
        lIllllIIll[56] = (-((-18693) & 31205)) & (-16897) & 32762;
        lIllllIIll[57] = (173 ^ 147) ^ (82 ^ 119);
        lIllllIIll[58] = 179 ^ 175;
        lIllllIIll[59] = 8 ^ 21;
        lIllllIIll[60] = (-((-17849) & 28153)) & (-17666) & 32247;
        lIllllIIll[61] = (-16681) & 20345;
        lIllllIIll[62] = (-8769) & 12287;
        lIllllIIll[63] = (-((-16447) & 27967)) & (-16962) & 32767;
        lIllllIIll[64] = (((124 + 129) - 215) + 100) ^ (((22 + 13) - (-99)) + 14);
        lIllllIIll[65] = 142 ^ 145;
        lIllllIIll[66] = 172 ^ 141;
        lIllllIIll[67] = (((71 + 59) - 52) + 90) ^ (((94 + 86) - 43) + 1);
        lIllllIIll[68] = 72 ^ 108;
        lIllllIIll[69] = "  ".length() ^ (128 ^ 167);
        lIllllIIll[70] = (36 ^ 121) ^ (205 ^ 182);
        lIllllIIll[71] = 31 ^ 56;
        lIllllIIll[72] = 232 ^ 193;
        lIllllIIll[73] = (-((-1706) & 5885)) & (-289) & 62967;
        lIllllIIll[74] = (-35) & 63334;
        lIllllIIll[75] = (148 ^ 131) ^ (45 ^ 16);
        lIllllIIll[76] = 13 ^ 38;
        lIllllIIll[77] = (((56 + 81) - 57) + 72) ^ (((129 + 106) - 155) + 100);
        lIllllIIll[78] = 187 ^ 150;
        lIllllIIll[79] = (((56 + 36) - (-44)) + 41) ^ (((89 + 40) - 8) + 38);
        lIllllIIll[80] = (215 ^ 154) ^ (101 ^ 7);
        lIllllIIll[81] = ((210 ^ 147) & ((56 ^ 121) ^ (-1))) ^ (246 ^ 198);
        lIllllIIll[82] = (102 ^ 45) ^ (69 ^ 63);
        lIllllIIll[83] = (-((-769) & 15203)) & (-1) & 16359;
        lIllllIIll[84] = 89 ^ 106;
        lIllllIIll[85] = 110 ^ 90;
        lIllllIIll[86] = 3 ^ 54;
        lIllllIIll[87] = 77 ^ 123;
        lIllllIIll[88] = 128 ^ 183;
        lIllllIIll[89] = 196 ^ 130;
        lIllllIIll[90] = (245 ^ 128) ^ (76 ^ 112);
        lIllllIIll[91] = (-((-2181) & 31486)) & (-1) & 32767;
        lIllllIIll[92] = (-((-6277) & 23197)) & (-4097) & 24575;
        lIllllIIll[93] = 3 ^ 59;
        lIllllIIll[94] = (201 ^ 140) ^ (203 ^ 183);
        lIllllIIll[95] = 2 ^ 78;
        lIllllIIll[96] = (((46 + 20) - (-76)) + 11) ^ (((123 + 50) - 125) + 115);
        lIllllIIll[97] = (197 ^ 191) ^ (4 ^ 46);
        lIllllIIll[98] = (((225 + 207) - 256) + 72) ^ (((57 + 79) - (-23)) + 36);
        lIllllIIll[99] = 21 ^ 79;
        lIllllIIll[100] = (119 ^ 82) ^ (40 ^ 105);
        lIllllIIll[101] = (((98 + 47) - 15) + 3) ^ (((36 + 2) - (-49)) + 97);
        lIllllIIll[102] = (95 ^ 30) ^ (((17 + 118) - 29) + 21);
        lIllllIIll[103] = (-24595) & 28447;
        lIllllIIll[104] = (((112 + 161) - 164) + 71) ^ (((89 + 49) - 32) + 33);
        lIllllIIll[105] = (((241 + 229) - 269) + 48) ^ (((52 + 106) - 90) + 61);
        lIllllIIll[106] = (((174 ^ 193) + (38 ^ 98)) - (((8 + 47) - 20) + 118)) + (45 ^ 69);
        lIllllIIll[107] = (26 ^ 5) ^ (219 ^ 132);
        lIllllIIll[108] = (((167 ^ 156) + (22 ^ 66)) - (137 ^ 176)) + (106 ^ 92);
        lIllllIIll[109] = (((25 + 8) - 32) + 192) ^ (((70 + 42) - 33) + 52);
        lIllllIIll[110] = (-21599) & 24575;
        lIllllIIll[111] = (-12865) & 16103;
        lIllllIIll[112] = (-((-626) & 4985)) & (-24641) & 32239;
        lIllllIIll[113] = 118 ^ 53;
        lIllllIIll[114] = 113 ^ 53;
        lIllllIIll[115] = 8 ^ 77;
        lIllllIIll[116] = ((26 + 32) - (-52)) + 40;
        lIllllIIll[117] = (-21203) & 24311;
        lIllllIIll[118] = (-((-3957) & 24574)) & (-8769) & 32731;
        lIllllIIll[119] = 19 ^ 84;
        lIllllIIll[120] = 24 ^ 80;
        lIllllIIll[121] = ((39 + 131) - 52) + 42;
        lIllllIIll[122] = (((181 ^ 167) + (((139 + 33) - 58) + 54)) - (172 ^ 182)) + (65 ^ 75);
        lIllllIIll[123] = (-21505) & 24435;
        lIllllIIll[124] = (-((-20809) & 29007)) & (-21033) & 32766;
        lIllllIIll[125] = 222 ^ 148;
        lIllllIIll[126] = 121 ^ 50;
        lIllllIIll[127] = (((((49 + 6) - (-22)) + 58) + (((136 + 74) - 85) + 42)) - (((161 + 229) - 279) + 132)) + (249 ^ 128);
        lIllllIIll[128] = 36 ^ 105;
        lIllllIIll[129] = (33 ^ 59) ^ (87 ^ 3);
        lIllllIIll[130] = 42 ^ 101;
        lIllllIIll[131] = ((61 + 85) - (-36)) + 8;
        lIllllIIll[132] = (((62 ^ 31) + (204 ^ 149)) - (117 ^ 98)) + (166 ^ 195);
        lIllllIIll[133] = (-21531) & 22010;
        lIllllIIll[134] = 227 ^ 178;
        lIllllIIll[135] = (75 ^ 8) ^ (122 ^ 107);
        lIllllIIll[136] = ((163 + 173) - 250) + 124;
        lIllllIIll[137] = ((89 + 118) - 148) + 161;
        lIllllIIll[138] = 251 ^ 168;
        lIllllIIll[139] = 69 ^ 17;
        lIllllIIll[140] = 230 ^ 179;
        lIllllIIll[141] = (((165 ^ 197) + (((74 + 122) - 149) + 154)) - (((59 + 175) - 101) + 52)) + (226 ^ 148);
        lIllllIIll[142] = (186 ^ 139) ^ (67 ^ 36);
        lIllllIIll[143] = (133 ^ 138) ^ (53 ^ 109);
        lIllllIIll[144] = (((216 + 137) - 285) + 164) ^ (((106 + 51) - 142) + 161);
        lIllllIIll[145] = (((55 + 75) - (-52)) + 26) ^ (((107 + 68) - 46) + 8);
        lIllllIIll[146] = 17 ^ 74;
        lIllllIIll[147] = (-12291) & 13690;
        lIllllIIll[148] = (-4118) & 5717;
        lIllllIIll[149] = (-901) & 10220;
        lIllllIIll[150] = (-24712) & 31711;
        lIllllIIll[151] = (-((-1714) & 11957)) & (-20481) & 32723;
        lIllllIIll[152] = (-16465) & 22014;
        lIllllIIll[153] = (-((-11419) & 15547)) & (-2068) & 32755;
        lIllllIIll[154] = (-14342) & 15341;
        lIllllIIll[155] = (-((-21841) & 30545)) & (-20481) & 32639;
        lIllllIIll[156] = (-4148) & 16127;
        lIllllIIll[157] = (-((-835) & 8019)) & (-520) & 32703;
        lIllllIIll[158] = (-((-3331) & 24523)) & (-2050) & 24541;
        lIllllIIll[159] = 239 ^ 179;
        lIllllIIll[160] = 83 ^ 14;
        lIllllIIll[161] = 93 ^ 3;
        lIllllIIll[162] = 217 ^ 134;
        lIllllIIll[163] = (-((-19969) & 32745)) & (-513) & 16379;
        lIllllIIll[164] = (-((-2633) & 15065)) & (-1) & 15869;
        lIllllIIll[165] = (-((-26661) & 31349)) & (-24579) & 32767;
        lIllllIIll[166] = (((114 ^ 27) + (((70 + 187) - 157) + 124)) - (((110 + 101) - 200) + 212)) + ((37 + 83) - (-10)) + 19;
        lIllllIIll[167] = (-((-1289) & 17899)) & (-777) & 20479;
        lIllllIIll[168] = (-(254 ^ 191)) & (-29185) & 32606;
        lIllllIIll[169] = (-29955) & 32751;
        lIllllIIll[170] = (-((-2117) & 22733)) & (-8738) & 32767;
        lIllllIIll[171] = (-((-1559) & 14039)) & (-18) & 16117;
        lIllllIIll[172] = (-((-24961) & 25521)) & (-20489) & 24575;
        lIllllIIll[173] = (249 ^ 163) ^ (7 ^ 61);
        lIllllIIll[174] = 27 ^ 122;
        lIllllIIll[175] = (((213 + 107) - 110) + 27) ^ (((10 + 12) - (-74)) + 47);
        lIllllIIll[176] = (64 ^ 34) ^ " ".length();
        lIllllIIll[177] = 210 ^ 183;
        lIllllIIll[178] = (164 ^ 192) ^ "  ".length();
        lIllllIIll[179] = (((125 + 14) - 79) + 106) ^ (((160 + 138) - 277) + 172);
        lIllllIIll[180] = (128 ^ 143) ^ (58 ^ 93);
        lIllllIIll[181] = 250 ^ 147;
    }

    private static boolean lIlIIIIIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[16]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0179, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[28]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x028f, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[13]) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0318, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[8]) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[8]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x058d, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[13]) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[4]) != false) goto L81;
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
        int[] iArr14 = new int[lIllllIIll[0]];
        iArr14[lIllllIIll[1]] = lIllllIIll[43];
        if (lIIlllllIllIl(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIllllIIll[0]];
            iArr15[lIllllIIll[1]] = lIllllIIll[43];
            if (lIIlllllIllIl(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIllllIIll[0]];
                iArr16[lIllllIIll[1]] = lIllllIIll[43];
            }
            iArr = new int[lIllllIIll[0]];
            iArr[lIllllIIll[1]] = lIllllIIll[30];
            if (lIIlllllIllIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr17 = new int[lIllllIIll[0]];
                iArr17[lIllllIIll[1]] = lIllllIIll[30];
                if (lIIlllllIllIl(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIllllIIll[0]];
                    iArr18[lIllllIIll[1]] = lIllllIIll[30];
                }
                iArr2 = new int[lIllllIIll[0]];
                iArr2[lIllllIIll[1]] = lIllllIIll[31];
                if (lIIlllllIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr19 = new int[lIllllIIll[0]];
                    iArr19[lIllllIIll[1]] = lIllllIIll[31];
                    if (lIIlllllIllIl(Bank.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lIllllIIll[0]];
                        iArr20[lIllllIIll[1]] = lIllllIIll[31];
                    }
                    iArr3 = new int[lIllllIIll[0]];
                    iArr3[lIllllIIll[1]] = lIllllIIll[103];
                    if (lIIlllllIllll(Bank.contains(iArr3) ? 1 : 0)) {
                        bv.add(new C0017d(lIllllIIll[103], lIllllIIll[8], lIllllIIll[151]));
                        "".length();
                    }
                    iArr4 = new int[lIllllIIll[0]];
                    iArr4[lIllllIIll[1]] = lIllllIIll[37];
                    if (lIIlllllIllll(Bank.contains(iArr4) ? 1 : 0)) {
                        bv.add(new C0017d(lIllllIIll[37], lIllllIIll[0], lIllllIIll[27]));
                        "".length();
                    }
                    iArr5 = new int[lIllllIIll[0]];
                    iArr5[lIllllIIll[1]] = lIllllIIll[32];
                    if (lIIlllllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr21 = new int[lIllllIIll[0]];
                        iArr21[lIllllIIll[1]] = lIllllIIll[32];
                        if (lIIlllllIllIl(Bank.contains(iArr21) ? 1 : 0)) {
                            int[] iArr22 = new int[lIllllIIll[0]];
                            iArr22[lIllllIIll[1]] = lIllllIIll[32];
                        }
                        iArr6 = new int[lIllllIIll[0]];
                        iArr6[lIllllIIll[1]] = lIllllIIll[33];
                        if (lIIlllllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr23 = new int[lIllllIIll[0]];
                            iArr23[lIllllIIll[1]] = lIllllIIll[33];
                            if (lIIlllllIllIl(Bank.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[lIllllIIll[0]];
                                iArr24[lIllllIIll[1]] = lIllllIIll[33];
                            }
                            iArr7 = new int[lIllllIIll[0]];
                            iArr7[lIllllIIll[1]] = lIllllIIll[29];
                            if (lIIlllllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr25 = new int[lIllllIIll[0]];
                                iArr25[lIllllIIll[1]] = lIllllIIll[29];
                                if (lIIlllllIllIl(Bank.contains(iArr25) ? 1 : 0)) {
                                    int[] iArr26 = new int[lIllllIIll[0]];
                                    iArr26[lIllllIIll[1]] = lIllllIIll[29];
                                }
                                iArr8 = new int[lIllllIIll[0]];
                                iArr8[lIllllIIll[1]] = lIllllIIll[39];
                                if (lIIlllllIllll(Bank.contains(iArr8) ? 1 : 0)) {
                                    bv.add(new C0017d(lIllllIIll[39], lIllllIIll[0], lIllllIIll[27]));
                                    "".length();
                                }
                                iArr9 = new int[lIllllIIll[0]];
                                iArr9[lIllllIIll[1]] = lIllllIIll[38];
                                if (lIIlllllIllll(Bank.contains(iArr9) ? 1 : 0)) {
                                    bv.add(new C0017d(lIllllIIll[38], lIllllIIll[0], lIllllIIll[27]));
                                    "".length();
                                }
                                iArr10 = new int[lIllllIIll[0]];
                                iArr10[lIllllIIll[1]] = lIllllIIll[40];
                                if (lIIlllllIllll(Bank.contains(iArr10) ? 1 : 0)) {
                                    bv.add(new C0017d(lIllllIIll[40], lIllllIIll[0], lIllllIIll[152]));
                                    "".length();
                                }
                                iArr11 = new int[lIllllIIll[0]];
                                iArr11[lIllllIIll[1]] = lIllllIIll[41];
                                if (lIIlllllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                                    bv.add(new C0017d(lIllllIIll[41], lIllllIIll[0], lIllllIIll[153] + C0018e.c(lIllllIIll[154], lIllllIIll[155])));
                                    "".length();
                                }
                                if (lIIlllllIllll(Bank.contains(item -> {
                                    return item.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]);
                                }) ? 1 : 0)) {
                                    bv.add(new C0017d(lIllllIIll[156], lIllllIIll[8], lIllllIIll[157]));
                                    "".length();
                                }
                                iArr12 = new int[lIllllIIll[0]];
                                iArr12[lIllllIIll[1]] = lIllllIIll[34];
                                if (lIIlllllIllIl(Bank.contains(iArr12) ? 1 : 0)) {
                                    int[] iArr27 = new int[lIllllIIll[0]];
                                    iArr27[lIllllIIll[1]] = lIllllIIll[34];
                                    if (lIIlllllIllIl(Bank.contains(iArr27) ? 1 : 0)) {
                                        int[] iArr28 = new int[lIllllIIll[0]];
                                        iArr28[lIllllIIll[1]] = lIllllIIll[34];
                                    }
                                    iArr13 = new int[lIllllIIll[0]];
                                    iArr13[lIllllIIll[1]] = lIllllIIll[36];
                                    if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                                        int[] iArr29 = new int[lIllllIIll[0]];
                                        iArr29[lIllllIIll[1]] = lIllllIIll[36];
                                        if (!lIIlllllIllIl(Bank.contains(iArr29) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr30 = new int[lIllllIIll[0]];
                                        iArr30[lIllllIIll[1]] = lIllllIIll[36];
                                        if (!lIIlllllIlllI(Bank.getFirst(iArr30).getQuantity(), lIllllIIll[28])) {
                                            return;
                                        }
                                    }
                                    bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
                                    "".length();
                                }
                                bv.add(new C0017d(lIllllIIll[34], lIllllIIll[13], C0023j.cf));
                                "".length();
                                iArr13 = new int[lIllllIIll[0]];
                                iArr13[lIllllIIll[1]] = lIllllIIll[36];
                                if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
                                "".length();
                            }
                            bv.add(new C0017d(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]));
                            "".length();
                            iArr8 = new int[lIllllIIll[0]];
                            iArr8[lIllllIIll[1]] = lIllllIIll[39];
                            if (lIIlllllIllll(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            iArr9 = new int[lIllllIIll[0]];
                            iArr9[lIllllIIll[1]] = lIllllIIll[38];
                            if (lIIlllllIllll(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            iArr10 = new int[lIllllIIll[0]];
                            iArr10[lIllllIIll[1]] = lIllllIIll[40];
                            if (lIIlllllIllll(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[lIllllIIll[0]];
                            iArr11[lIllllIIll[1]] = lIllllIIll[41];
                            if (lIIlllllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            if (lIIlllllIllll(Bank.contains(item2 -> {
                                return item2.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]);
                            }) ? 1 : 0)) {
                            }
                            iArr12 = new int[lIllllIIll[0]];
                            iArr12[lIllllIIll[1]] = lIllllIIll[34];
                            if (lIIlllllIllIl(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lIllllIIll[34], lIllllIIll[13], C0023j.cf));
                            "".length();
                            iArr13 = new int[lIllllIIll[0]];
                            iArr13[lIllllIIll[1]] = lIllllIIll[36];
                            if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
                            "".length();
                        }
                        bv.add(new C0017d(lIllllIIll[33], lIllllIIll[8], lIllllIIll[27]));
                        "".length();
                        iArr7 = new int[lIllllIIll[0]];
                        iArr7[lIllllIIll[1]] = lIllllIIll[29];
                        if (lIIlllllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]));
                        "".length();
                        iArr8 = new int[lIllllIIll[0]];
                        iArr8[lIllllIIll[1]] = lIllllIIll[39];
                        if (lIIlllllIllll(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        iArr9 = new int[lIllllIIll[0]];
                        iArr9[lIllllIIll[1]] = lIllllIIll[38];
                        if (lIIlllllIllll(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        iArr10 = new int[lIllllIIll[0]];
                        iArr10[lIllllIIll[1]] = lIllllIIll[40];
                        if (lIIlllllIllll(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[lIllllIIll[0]];
                        iArr11[lIllllIIll[1]] = lIllllIIll[41];
                        if (lIIlllllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        if (lIIlllllIllll(Bank.contains(item22 -> {
                            return item22.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[lIllllIIll[0]];
                        iArr12[lIllllIIll[1]] = lIllllIIll[34];
                        if (lIIlllllIllIl(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lIllllIIll[34], lIllllIIll[13], C0023j.cf));
                        "".length();
                        iArr13 = new int[lIllllIIll[0]];
                        iArr13[lIllllIIll[1]] = lIllllIIll[36];
                        if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
                        "".length();
                    }
                    bv.add(new C0017d(lIllllIIll[32], lIllllIIll[13], lIllllIIll[27]));
                    "".length();
                    iArr6 = new int[lIllllIIll[0]];
                    iArr6[lIllllIIll[1]] = lIllllIIll[33];
                    if (lIIlllllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lIllllIIll[33], lIllllIIll[8], lIllllIIll[27]));
                    "".length();
                    iArr7 = new int[lIllllIIll[0]];
                    iArr7[lIllllIIll[1]] = lIllllIIll[29];
                    if (lIIlllllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]));
                    "".length();
                    iArr8 = new int[lIllllIIll[0]];
                    iArr8[lIllllIIll[1]] = lIllllIIll[39];
                    if (lIIlllllIllll(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[lIllllIIll[0]];
                    iArr9[lIllllIIll[1]] = lIllllIIll[38];
                    if (lIIlllllIllll(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIllllIIll[0]];
                    iArr10[lIllllIIll[1]] = lIllllIIll[40];
                    if (lIIlllllIllll(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[lIllllIIll[0]];
                    iArr11[lIllllIIll[1]] = lIllllIIll[41];
                    if (lIIlllllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    if (lIIlllllIllll(Bank.contains(item222 -> {
                        return item222.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[lIllllIIll[0]];
                    iArr12[lIllllIIll[1]] = lIllllIIll[34];
                    if (lIIlllllIllIl(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lIllllIIll[34], lIllllIIll[13], C0023j.cf));
                    "".length();
                    iArr13 = new int[lIllllIIll[0]];
                    iArr13[lIllllIIll[1]] = lIllllIIll[36];
                    if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
                    "".length();
                }
                bv.add(new C0017d(lIllllIIll[31], lIllllIIll[28], lIllllIIll[150]));
                "".length();
                iArr3 = new int[lIllllIIll[0]];
                iArr3[lIllllIIll[1]] = lIllllIIll[103];
                if (lIIlllllIllll(Bank.contains(iArr3) ? 1 : 0)) {
                }
                iArr4 = new int[lIllllIIll[0]];
                iArr4[lIllllIIll[1]] = lIllllIIll[37];
                if (lIIlllllIllll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIllllIIll[0]];
                iArr5[lIllllIIll[1]] = lIllllIIll[32];
                if (lIIlllllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bv.add(new C0017d(lIllllIIll[32], lIllllIIll[13], lIllllIIll[27]));
                "".length();
                iArr6 = new int[lIllllIIll[0]];
                iArr6[lIllllIIll[1]] = lIllllIIll[33];
                if (lIIlllllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bv.add(new C0017d(lIllllIIll[33], lIllllIIll[8], lIllllIIll[27]));
                "".length();
                iArr7 = new int[lIllllIIll[0]];
                iArr7[lIllllIIll[1]] = lIllllIIll[29];
                if (lIIlllllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bv.add(new C0017d(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]));
                "".length();
                iArr8 = new int[lIllllIIll[0]];
                iArr8[lIllllIIll[1]] = lIllllIIll[39];
                if (lIIlllllIllll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIllllIIll[0]];
                iArr9[lIllllIIll[1]] = lIllllIIll[38];
                if (lIIlllllIllll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIllllIIll[0]];
                iArr10[lIllllIIll[1]] = lIllllIIll[40];
                if (lIIlllllIllll(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIllllIIll[0]];
                iArr11[lIllllIIll[1]] = lIllllIIll[41];
                if (lIIlllllIllll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                if (lIIlllllIllll(Bank.contains(item2222 -> {
                    return item2222.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[lIllllIIll[0]];
                iArr12[lIllllIIll[1]] = lIllllIIll[34];
                if (lIIlllllIllIl(Bank.contains(iArr12) ? 1 : 0)) {
                }
                bv.add(new C0017d(lIllllIIll[34], lIllllIIll[13], C0023j.cf));
                "".length();
                iArr13 = new int[lIllllIIll[0]];
                iArr13[lIllllIIll[1]] = lIllllIIll[36];
                if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
                "".length();
            }
            bv.add(new C0017d(lIllllIIll[30], lIllllIIll[16], lIllllIIll[149]));
            "".length();
            iArr2 = new int[lIllllIIll[0]];
            iArr2[lIllllIIll[1]] = lIllllIIll[31];
            if (lIIlllllIllIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIllllIIll[31], lIllllIIll[28], lIllllIIll[150]));
            "".length();
            iArr3 = new int[lIllllIIll[0]];
            iArr3[lIllllIIll[1]] = lIllllIIll[103];
            if (lIIlllllIllll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIllllIIll[0]];
            iArr4[lIllllIIll[1]] = lIllllIIll[37];
            if (lIIlllllIllll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIllllIIll[0]];
            iArr5[lIllllIIll[1]] = lIllllIIll[32];
            if (lIIlllllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIllllIIll[32], lIllllIIll[13], lIllllIIll[27]));
            "".length();
            iArr6 = new int[lIllllIIll[0]];
            iArr6[lIllllIIll[1]] = lIllllIIll[33];
            if (lIIlllllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIllllIIll[33], lIllllIIll[8], lIllllIIll[27]));
            "".length();
            iArr7 = new int[lIllllIIll[0]];
            iArr7[lIllllIIll[1]] = lIllllIIll[29];
            if (lIIlllllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]));
            "".length();
            iArr8 = new int[lIllllIIll[0]];
            iArr8[lIllllIIll[1]] = lIllllIIll[39];
            if (lIIlllllIllll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIllllIIll[0]];
            iArr9[lIllllIIll[1]] = lIllllIIll[38];
            if (lIIlllllIllll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIllllIIll[0]];
            iArr10[lIllllIIll[1]] = lIllllIIll[40];
            if (lIIlllllIllll(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIllllIIll[0]];
            iArr11[lIllllIIll[1]] = lIllllIIll[41];
            if (lIIlllllIllll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            if (lIIlllllIllll(Bank.contains(item22222 -> {
                return item22222.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[lIllllIIll[0]];
            iArr12[lIllllIIll[1]] = lIllllIIll[34];
            if (lIIlllllIllIl(Bank.contains(iArr12) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIllllIIll[34], lIllllIIll[13], C0023j.cf));
            "".length();
            iArr13 = new int[lIllllIIll[0]];
            iArr13[lIllllIIll[1]] = lIllllIIll[36];
            if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
            "".length();
        }
        bv.add(new C0017d(lIllllIIll[43], lIllllIIll[4], C0018e.c(lIllllIIll[147], lIllllIIll[148])));
        "".length();
        iArr = new int[lIllllIIll[0]];
        iArr[lIllllIIll[1]] = lIllllIIll[30];
        if (lIIlllllIllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIllllIIll[30], lIllllIIll[16], lIllllIIll[149]));
        "".length();
        iArr2 = new int[lIllllIIll[0]];
        iArr2[lIllllIIll[1]] = lIllllIIll[31];
        if (lIIlllllIllIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIllllIIll[31], lIllllIIll[28], lIllllIIll[150]));
        "".length();
        iArr3 = new int[lIllllIIll[0]];
        iArr3[lIllllIIll[1]] = lIllllIIll[103];
        if (lIIlllllIllll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIllllIIll[0]];
        iArr4[lIllllIIll[1]] = lIllllIIll[37];
        if (lIIlllllIllll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIllllIIll[0]];
        iArr5[lIllllIIll[1]] = lIllllIIll[32];
        if (lIIlllllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIllllIIll[32], lIllllIIll[13], lIllllIIll[27]));
        "".length();
        iArr6 = new int[lIllllIIll[0]];
        iArr6[lIllllIIll[1]] = lIllllIIll[33];
        if (lIIlllllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIllllIIll[33], lIllllIIll[8], lIllllIIll[27]));
        "".length();
        iArr7 = new int[lIllllIIll[0]];
        iArr7[lIllllIIll[1]] = lIllllIIll[29];
        if (lIIlllllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]));
        "".length();
        iArr8 = new int[lIllllIIll[0]];
        iArr8[lIllllIIll[1]] = lIllllIIll[39];
        if (lIIlllllIllll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIllllIIll[0]];
        iArr9[lIllllIIll[1]] = lIllllIIll[38];
        if (lIIlllllIllll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIllllIIll[0]];
        iArr10[lIllllIIll[1]] = lIllllIIll[40];
        if (lIIlllllIllll(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIllllIIll[0]];
        iArr11[lIllllIIll[1]] = lIllllIIll[41];
        if (lIIlllllIllll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        if (lIIlllllIllll(Bank.contains(item222222 -> {
            return item222222.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[lIllllIIll[0]];
        iArr12[lIllllIIll[1]] = lIllllIIll[34];
        if (lIIlllllIllIl(Bank.contains(iArr12) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIllllIIll[34], lIllllIIll[13], C0023j.cf));
        "".length();
        iArr13 = new int[lIllllIIll[0]];
        iArr13[lIllllIIll[1]] = lIllllIIll[36];
        if (lIIlllllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIllllIIll[1];
    }

    private static void lIIlllllIlIlI() {
        lIllllIIIl = new String[lIllllIIll[181]];
        lIllllIIIl[lIllllIIll[1]] = lIIllllIllIIl("vCdwjbmppAVL9MAlhLSQhduLFpPd0pJv+oLyul7uDdSd09KRTgJzJkbUPXSu02jF", "JCugm");
        lIllllIIIl[lIllllIIll[0]] = lIIllllIllIIl("wquu008MAHcXq1Bz1fKeVg==", "OJWVJ");
        lIllllIIIl[lIllllIIll[9]] = lIIllllIllIIl("1f3i3ZvGoAM/CdqZ2mF1Yg==", "gfTnG");
        lIllllIIIl[lIllllIIll[11]] = lIIllllIllIlI("LAJi8ghHgxcUghco9lHsEeKWvPGGo6F/", "plJva");
        lIllllIIIl[lIllllIIll[13]] = lIIllllIllIIl("KtL2raAWl7lU8bNIQJDCjA==", "mFfhb");
        lIllllIIIl[lIllllIIll[8]] = lIIllllIllIIl("xO35ejMIfqKbTV3NdD+XLA==", "fnpUd");
        lIllllIIIl[lIllllIIll[16]] = lIIllllIllIlI("K3uG0J7SwsUX5tzgtQgbZw==", "FECwE");
        lIllllIIIl[lIllllIIll[20]] = lIIllllIllIIl("nPi9aaPQXl9ynf4Dn129eA==", "GZeOO");
        lIllllIIIl[lIllllIIll[21]] = lIIllllIllIll("Bx4ObDYiOTgq", "UXJLr");
        lIllllIIIl[lIllllIIll[19]] = lIIllllIllIlI("bQSR+/gcmKkFUTf3UCRjSQ==", "RETeJ");
        lIllllIIIl[lIllllIIll[4]] = lIIllllIllIll("FTgdIB0hM0klDTkm", "TViIl");
        lIllllIIIl[lIllllIIll[23]] = lIIllllIllIll("CwgPISM8RAkibQMLEzYoJgA=", "HdfDM");
        lIllllIIIl[lIllllIIll[24]] = lIIllllIllIll("LwoRBDgbAUUBKAMU", "ndemI");
        lIllllIIIl[lIllllIIll[25]] = lIIllllIllIIl("JILXYc9QlU4=", "XQqlQ");
        lIllllIIIl[lIllllIIll[26]] = lIIllllIllIIl("Yl/jQDdGf+SotuQYKEyIiA==", "FHxUx");
        lIllllIIIl[lIllllIIll[28]] = lIIllllIllIIl("HmUNgEC0Os5fvo988wuStRoS+X0Zfath", "fSkae");
        lIllllIIIl[lIllllIIll[35]] = lIIllllIllIlI("CTV7UZjz/7RMUHBfFBijurjQcIJC7s5xZk03FVA3knvL43ejHFMduaIZ6e4D0uKzYQOeXw2/+Rc=", "ChJZG");
        lIllllIIIl[lIllllIIll[42]] = lIIllllIllIll("LiZKBh8cYwcOHgoqBABNCDYPFBlZMB8XHRUqDxRBWTAdDhkaKwMJClk3BUcvLBojKSo=", "yCjgm");
        lIllllIIIl[lIllllIIll[46]] = lIIllllIllIlI("A/XCygwuSBs=", "hCLnx");
        lIllllIIIl[lIllllIIll[12]] = lIIllllIllIll("ABwfCBg=", "Dnvfs");
        lIllllIIIl[lIllllIIll[48]] = lIIllllIllIll("OzEvMCA=", "hYNBK");
        lIllllIIIl[lIllllIIll[49]] = lIIllllIllIIl("N09fgh/6gR4=", "ACZeF");
        lIllllIIIl[lIllllIIll[50]] = lIIllllIllIIl("GKhCGXDy3D4=", "OfNaX");
        lIllllIIIl[lIllllIIll[51]] = lIIllllIllIlI("VSmr9lLq0OW4zwj9kM6vOg==", "idFES");
        lIllllIIIl[lIllllIIll[47]] = lIIllllIllIll("JQY4", "dpYSe");
        lIllllIIIl[lIllllIIll[54]] = lIIllllIllIIl("NpwylUOw9jYBKVl16jAdCw==", "sHAhG");
        lIllllIIIl[lIllllIIll[55]] = lIIllllIllIll("ODQqMSQD", "kQKCG");
        lIllllIIIl[lIllllIIll[57]] = lIIllllIllIIl("uu42asHXycB+0EDXSD6GTw==", "spUwt");
        lIllllIIIl[lIllllIIll[58]] = lIIllllIllIIl("G04WRnjbHXE=", "fSvLM");
        lIllllIIIl[lIllllIIll[59]] = lIIllllIllIll("AC0FGQ==", "WHdkQ");
        lIllllIIIl[lIllllIIll[64]] = lIIllllIllIIl("tnKFv0/AV0fW85dRwmSAyA==", "kCbtq");
        lIllllIIIl[lIllllIIll[65]] = lIIllllIllIlI("xPCGQrRerNToCCNvnnTJOdAKp8Z7+Ye1", "avFlA");
        lIllllIIIl[lIllllIIll[10]] = lIIllllIllIlI("X5fXqBjkMWw=", "yhLqf");
        lIllllIIIl[lIllllIIll[66]] = lIIllllIllIIl("yh5Rxhcd/yE=", "mEjdj");
        lIllllIIIl[lIllllIIll[67]] = lIIllllIllIll("LBQYYSENVQsiIQ0=", "bunAU");
        lIllllIIIl[lIllllIIll[14]] = lIIllllIllIIl("02cbTKUwnMA=", "QZBdv");
        lIllllIIIl[lIllllIIll[68]] = lIIllllIllIIl("oU4SQ8T7qm+rAdvaJQ+fkA==", "dCFep");
        lIllllIIIl[lIllllIIll[69]] = lIIllllIllIlI("HUGdllfgv3vYgn8K9Bxseg==", "XlBrI");
        lIllllIIIl[lIllllIIll[70]] = lIIllllIllIll("ARwwKhY/", "MsQNs");
        lIllllIIIl[lIllllIIll[71]] = lIIllllIllIIl("EW14dX6lZss=", "LrJix");
        lIllllIIIl[lIllllIIll[22]] = lIIllllIllIlI("0vs1Pk3k7kQ=", "dkKjW");
        lIllllIIIl[lIllllIIll[72]] = lIIllllIllIll("KgEkFxwU", "fnEsy");
        lIllllIIIl[lIllllIIll[75]] = lIIllllIllIll("DCssBzQ=", "NDBbG");
        lIllllIIIl[lIllllIIll[76]] = lIIllllIllIll("AzgADCozLRIA", "PLaeX");
        lIllllIIIl[lIllllIIll[77]] = lIIllllIllIll("MgomPBVcAiAmGQ==", "qfOQw");
        lIllllIIIl[lIllllIIll[78]] = lIIllllIllIlI("boox4O+y6YJX5CO4RNuTwg==", "SRUSn");
        lIllllIIIl[lIllllIIll[79]] = lIIllllIllIll("LQskBy0dBiQdOA==", "hhPhK");
        lIllllIIIl[lIllllIIll[80]] = lIIllllIllIlI("yYkR9oTnd6o=", "tVvZE");
        lIllllIIIl[lIllllIIll[81]] = lIIllllIllIlI("T9JzWHyPlN8IKUahFFRKhw==", "hMjsT");
        lIllllIIIl[lIllllIIll[82]] = lIIllllIllIll("NBwHKwNTEAErFBoEBD0=", "sthXw");
        lIllllIIIl[lIllllIIll[15]] = lIIllllIllIll("CBAdFw4pHA==", "Eqqta");
        lIllllIIIl[lIllllIIll[84]] = lIIllllIllIIl("sOdwXVZpvpA=", "iYujw");
        lIllllIIIl[lIllllIIll[85]] = lIIllllIllIll("PjsOOyQfNw==", "sZbXK");
        lIllllIIIl[lIllllIIll[86]] = lIIllllIllIll("EyYuNRU=", "RJGVp");
        lIllllIIIl[lIllllIIll[87]] = lIIllllIllIll("BzcHDA4mOw==", "JVkoa");
        lIllllIIIl[lIllllIIll[88]] = lIIllllIllIlI("V8ypza8wGus=", "IAwag");
        lIllllIIIl[lIllllIIll[93]] = lIIllllIllIIl("rr7WPdfU86IEMjGcLKiAtw==", "ddwVf");
        lIllllIIIl[lIllllIIll[94]] = lIIllllIllIll("KBgXeAoVGx09", "gtsXi");
        lIllllIIIl[lIllllIIll[96]] = lIIllllIllIll("BwwqCCYmAA==", "JmFkI");
        lIllllIIIl[lIllllIIll[98]] = lIIllllIllIll("Azs5OhciNw==", "NZUYx");
        lIllllIIIl[lIllllIIll[6]] = lIIllllIllIIl("64cuczwu1Mo=", "XaAIJ");
        lIllllIIIl[lIllllIIll[101]] = lIIllllIllIll("AAA1DxYxTjICHjYFNAQ=", "UnQjw");
        lIllllIIIl[lIllllIIll[102]] = lIIllllIllIIl("CKu22n+stR2wrBjuh2NdfQ==", "VKWlf");
        lIllllIIIl[lIllllIIll[104]] = lIIllllIllIIl("lzY6+8ANbwIYr6TZkSt7Ag==", "hmxzY");
        lIllllIIIl[lIllllIIll[107]] = lIIllllIllIIl("A+yiJl8vIbQ=", "PpqJn");
        lIllllIIIl[lIllllIIll[3]] = lIIllllIllIll("OicSLSo=", "mNfNB");
        lIllllIIIl[lIllllIIll[109]] = lIIllllIllIIl("LNVapbr/HB2LQrUT5AgHrQ==", "bfqKV");
        lIllllIIIl[lIllllIIll[113]] = lIIllllIllIIl("VHBVTnprAU4gCX0LPq24JA==", "nAbRU");
        lIllllIIIl[lIllllIIll[114]] = lIIllllIllIlI("7BDFZR+rTqo=", "RwVmW");
        lIllllIIIl[lIllllIIll[115]] = lIIllllIllIll("HywdFRY4LBVQHD4mHw==", "LIqpu");
        lIllllIIIl[lIllllIIll[89]] = lIIllllIllIlI("GSev/Jh05kzdSPqXAHSrhw==", "HwDcO");
        lIllllIIIl[lIllllIIll[119]] = lIIllllIllIlI("hfDiGGzK3KQqMNee+SaZeg==", "DGVmm");
        lIllllIIIl[lIllllIIll[120]] = lIIllllIllIlI("RTLRYJ726hA=", "SprEy");
        lIllllIIIl[lIllllIIll[90]] = lIIllllIllIIl("GTEQq0HQkbY=", "VCwGb");
        lIllllIIIl[lIllllIIll[125]] = lIIllllIllIlI("97qx3wzGUe189eHiOVYR9Q==", "UHuQk");
        lIllllIIIl[lIllllIIll[126]] = lIIllllIllIlI("MUIR4RAIpFc=", "sSnno");
        lIllllIIIl[lIllllIIll[95]] = lIIllllIllIIl("mHY6jW9e2Ys=", "cofam");
        lIllllIIIl[lIllllIIll[128]] = lIIllllIllIlI("pPUnUtXoqUAErOrh9Qnxtg==", "qRJNW");
        lIllllIIIl[lIllllIIll[129]] = lIIllllIllIll("Mx0QJjYCUwAxMgM=", "fstCW");
        lIllllIIIl[lIllllIIll[130]] = lIIllllIllIlI("WZU07D8K9lE=", "vIrBC");
        lIllllIIIl[lIllllIIll[97]] = lIIllllIllIlI("tDZs6hHPu3C1F0UyfUeL6g==", "BspDJ");
        lIllllIIIl[lIllllIIll[134]] = lIIllllIllIll("IAI+KBkABCVtFh0TKD4=", "rgMMx");
        lIllllIIIl[lIllllIIll[135]] = lIIllllIllIll("ID0iDzUYLjcE", "tOCaF");
        lIllllIIIl[lIllllIIll[138]] = lIIllllIllIlI("//GV56s+5CnpVCGXFsaipQ==", "AiXIa");
        lIllllIIIl[lIllllIIll[139]] = lIIllllIllIll("D2MWFzU6JhQY", "NCfvA");
        lIllllIIIl[lIllllIIll[140]] = lIIllllIllIlI("pORIlVJkWlfMoqPpGajRJg==", "rvdYw");
        lIllllIIIl[lIllllIIll[142]] = lIIllllIllIlI("AtXkVQ3MmNsu8o7Nk++DEg==", "ctayL");
        lIllllIIIl[lIllllIIll[143]] = lIIllllIllIll("FSY5EzMu", "FCXaP");
        lIllllIIIl[lIllllIIll[144]] = lIIllllIllIll("DAwwRCEtTTUQNDAZ", "BmFdU");
        lIllllIIIl[lIllllIIll[145]] = lIIllllIllIIl("l8SOuCO/6+8=", "Guxak");
        lIllllIIIl[lIllllIIll[99]] = lIIllllIllIlI("1jjMYrWE11Mqc5m153osZg==", "KMxbz");
        lIllllIIIl[lIllllIIll[146]] = lIIllllIllIll("KigjACAR", "yMBrC");
        lIllllIIIl[lIllllIIll[159]] = lIIllllIllIIl("oSvecbS0Vqc=", "BcjFF");
        lIllllIIIl[lIllllIIll[160]] = lIIllllIllIll("EgM4AAc/TRwMAT0IJQQVPg==", "SmQmf");
        lIllllIIIl[lIllllIIll[161]] = lIIllllIllIIl("A0mQIPgZBBvPGFbLY1pfU+N6JSjNQnZn", "lDOSb");
        lIllllIIIl[lIllllIIll[162]] = lIIllllIllIlI("Aa7rbx+FpOc=", "YdDht");
        lIllllIIIl[lIllllIIll[173]] = lIIllllIllIIl("WITwph4ruHU=", "JcPcu");
        lIllllIIIl[lIllllIIll[174]] = lIIllllIllIlI("uXI5kcfp7HrHDkBkgw2uryVolr5YmnJP", "CLlir");
        lIllllIIIl[lIllllIIll[175]] = lIIllllIllIIl("giIbhbk3+C5YhFhIlPCEJeH1ubpwB9TPQOoANL8fLaSm/+aZF7rxBpJk/NEcGnyM", "QBPuQ");
        lIllllIIIl[lIllllIIll[176]] = lIIllllIllIll("DCcgARFvAXUPADZoIQUaPC11Dh0mKz4IGzxoOwICY2ghBRAhdw==", "OHUmu");
        lIllllIIIl[lIllllIIll[100]] = lIIllllIllIIl("5MyJ1FGS5RYwQCRGtmnEAWaxa9bVecTv", "NuyWh");
        lIllllIIIl[lIllllIIll[177]] = lIIllllIllIlI("XtHi9xewe8Ui+hKiWUTXZZojNDz1Sran", "IPsaB");
        lIllllIIIl[lIllllIIll[178]] = lIIllllIllIll("Pwk+JRxbTBtuHlcENzsWVw0wJgYDTCYhHAQJcj0BEgkhaRIQDTsnXQ==", "wlRIs");
        lIllllIIIl[lIllllIIll[179]] = lIIllllIllIlI("ArBeSYrfEt5BJQvasUSWomitG3DZ9+E5", "xILnU");
        lIllllIIIl[lIllllIIll[180]] = lIIllllIllIll("", "wmpnX");
    }

    static {
        lIIlllllIlIll();
        lIIlllllIlIlI();
        bv = new ArrayList();
        du = new WorldArea(lIllllIIll[163], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1]);
        dv = new WorldArea(lIllllIIll[164], lIllllIIll[165], lIllllIIll[166], lIllllIIll[142], lIllllIIll[1]);
        dw = new WorldArea(lIllllIIll[164], lIllllIIll[165], lIllllIIll[166], lIllllIIll[142], lIllllIIll[0]);
        de = new WorldPoint(lIllllIIll[167], lIllllIIll[168], lIllllIIll[1]);
        dx = new WorldPoint(lIllllIIll[169], lIllllIIll[170], lIllllIIll[1]);
        dy = new WorldPoint(lIllllIIll[171], lIllllIIll[172], lIllllIIll[1]);
        String[] strArr = new String[lIllllIIll[21]];
        strArr[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[173]];
        strArr[lIllllIIll[0]] = lIllllIIIl[lIllllIIll[174]];
        strArr[lIllllIIll[9]] = lIllllIIIl[lIllllIIll[175]];
        strArr[lIllllIIll[11]] = lIllllIIIl[lIllllIIll[176]];
        strArr[lIllllIIll[13]] = lIllllIIIl[lIllllIIll[100]];
        strArr[lIllllIIll[8]] = lIllllIIIl[lIllllIIll[177]];
        strArr[lIllllIIll[16]] = lIllllIIIl[lIllllIIll[178]];
        strArr[lIllllIIll[20]] = lIllllIIIl[lIllllIIll[179]];
        cE = strArr;
        cY = lIllllIIll[1];
        dz = lIllllIIIl[lIllllIIll[180]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIllllIIll[20]];
        iArr[lIllllIIll[1]] = lIllllIIll[36];
        iArr[lIllllIIll[0]] = lIllllIIll[37];
        iArr[lIllllIIll[9]] = lIllllIIll[34];
        iArr[lIllllIIll[11]] = lIllllIIll[40];
        iArr[lIllllIIll[13]] = lIllllIIll[41];
        iArr[lIllllIIll[8]] = lIllllIIll[30];
        iArr[lIllllIIll[16]] = lIllllIIll[31];
        int i = lIllllIIll[1];
        while (lIIlllllIlllI(i, iArr.length)) {
            int[] iArr2 = new int[lIllllIIll[0]];
            iArr2[lIllllIIll[1]] = iArr[i];
            if (lIIlllllIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIllllIIll[1];
            }
            i++;
            "".length();
            if (((((136 + 21) - 90) + 130) ^ (((112 + 152) - 245) + 174)) != ((((133 + 67) - 164) + 129) ^ (((142 + 111) - 151) + 59))) {
                return ((124 ^ 75) ^ (250 ^ 155)) & (((((51 + 115) - 74) + 110) ^ (((142 + 14) - 124) + 124)) ^ (-" ".length()));
            }
        }
        return lIllllIIll[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            bf();
            "".length();
            if ((-(147 ^ 151)) > 0) {
                return (96 ^ 40) & ((24 ^ 80) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllllIIll[100];
    }

    private static boolean lIIlllllllIII(int i) {
        return i > 0;
    }

    private static boolean lIIllllllIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllllllIIl(int i) {
        return i < 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIlIIIIIIIlIl(dz, lIllllIIIl[lIllllIIll[159]]) ? lIllllIIIl[lIllllIIll[160]] : "Animal Magnetism - " + dz;
    }

    private static int lIIlllllIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIIllllIllIll(String llllllllllllllllllIlllIlIlIIlllI, String llllllllllllllllllIlllIlIlIIllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlllIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIlllIlIlIIllIl.toCharArray();
        int llllllllllllllllllIlllIlIlIIlIlI = lIllllIIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllllIIll[1];
        while (lIIlllllIlllI(i, length)) {
            char llllllllllllllllllIlllIlIlIIllll = charArray2[i];
            sb.append((char) (llllllllllllllllllIlllIlIlIIllll ^ charArray[llllllllllllllllllIlllIlIlIIlIlI % charArray.length]));
            "".length();
            llllllllllllllllllIlllIlIlIIlIlI++;
            i++;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x069d, code lost:
        if (lIIllllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[8]) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06e0, code lost:
        if (lIIllllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[16]) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0723, code lost:
        if (lIIllllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[28]) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0766, code lost:
        if (lIIllllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[13]) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x07a9, code lost:
        if (lIIllllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[8]) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x07ec, code lost:
        if (lIIlllllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[13]) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07ef, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIIl[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[35]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0036w.lIllllIIll[0];
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
    public static void bf() {
        if (lIIlllllIllIl(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIIlllllIlllI(bv.size(), lIllllIIll[0])) {
                System.out.println(lIllllIIIl[lIllllIIll[1]]);
                bt = lIllllIIll[1];
            }
        }
        if (lIIlllllIllll(bt ? 1 : 0) && lIIlllllIlllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[2])) {
            if (lIIlllllIlllI(C0018e.j(lIllllIIll[3]), lIllllIIll[4])) {
                dz = lIllllIIIl[lIllllIIll[0]];
                O.db();
            }
            if (lIIllllllIIII(C0018e.j(lIllllIIll[3]), lIllllIIll[4]) && (!lIIllllllIIIl(C0018e.j(lIllllIIll[5]), lIllllIIll[6]) || lIIlllllIlllI(C0018e.j(lIllllIIll[7]), lIllllIIll[8]))) {
                dz = lIllllIIIl[lIllllIIll[9]];
                H.cf();
            }
            if (lIIllllllIIII(C0018e.j(lIllllIIll[3]), lIllllIIll[4]) && lIIllllllIIIl(C0018e.j(lIllllIIll[5]), lIllllIIll[6]) && lIIllllllIIIl(C0018e.j(lIllllIIll[7]), lIllllIIll[8]) && lIIlllllIlllI(C0018e.j(lIllllIIll[10]), lIllllIIll[11])) {
                dz = lIllllIIIl[lIllllIIll[11]];
                V.dL();
            }
            if (lIIllllllIIII(C0018e.j(lIllllIIll[3]), lIllllIIll[4]) && lIIllllllIIIl(C0018e.j(lIllllIIll[5]), lIllllIIll[6]) && lIIllllllIIIl(C0018e.j(lIllllIIll[7]), lIllllIIll[8]) && lIIllllllIIII(C0018e.j(lIllllIIll[10]), lIllllIIll[11]) && lIIlllllIlllI(Skills.getLevel(Skill.CRAFTING), lIllllIIll[12])) {
                dz = lIllllIIIl[lIllllIIll[13]];
                ay.fi();
            }
            if (lIIllllllIIII(C0018e.j(lIllllIIll[3]), lIllllIIll[4]) && lIIllllllIIIl(C0018e.j(lIllllIIll[5]), lIllllIIll[6]) && lIIllllllIIIl(C0018e.j(lIllllIIll[7]), lIllllIIll[8]) && lIIllllllIIII(C0018e.j(lIllllIIll[10]), lIllllIIll[11]) && lIIllllllIIIl(Skills.getLevel(Skill.CRAFTING), lIllllIIll[12]) && lIIlllllIlllI(Skills.getLevel(Skill.WOODCUTTING), lIllllIIll[14])) {
                dz = lIllllIIIl[lIllllIIll[8]];
                aF.gs();
            }
            if (lIIllllllIIII(C0018e.j(lIllllIIll[3]), lIllllIIll[4]) && lIIllllllIIIl(C0018e.j(lIllllIIll[5]), lIllllIIll[6]) && lIIllllllIIIl(C0018e.j(lIllllIIll[7]), lIllllIIll[8]) && lIIllllllIIII(C0018e.j(lIllllIIll[10]), lIllllIIll[11]) && lIIllllllIIIl(Skills.getLevel(Skill.CRAFTING), lIllllIIll[12]) && lIIllllllIIIl(Skills.getLevel(Skill.WOODCUTTING), lIllllIIll[14]) && lIIlllllIlllI(Skills.getLevel(Skill.RANGED), lIllllIIll[15])) {
                dz = lIllllIIIl[lIllllIIll[16]];
                if (lIIlllllIlllI(cY, lIllllIIll[0])) {
                    C0028o.cH = lIllllIIll[1];
                    cY += lIllllIIll[0];
                }
                C0027n.aA();
            }
            if (lIIllllllIIII(C0018e.j(lIllllIIll[3]), lIllllIIll[4]) && lIIllllllIIIl(C0018e.j(lIllllIIll[5]), lIllllIIll[6]) && lIIllllllIIIl(C0018e.j(lIllllIIll[7]), lIllllIIll[8]) && lIIllllllIIII(C0018e.j(lIllllIIll[10]), lIllllIIll[11]) && lIIllllllIIIl(Skills.getLevel(Skill.CRAFTING), lIllllIIll[12]) && lIIllllllIIIl(Skills.getLevel(Skill.WOODCUTTING), lIllllIIll[14]) && lIIllllllIIIl(Skills.getLevel(Skill.RANGED), lIllllIIll[15])) {
                if (!lIIllllllIIIl(C0018e.j(lIllllIIll[17]), lIllllIIll[18]) || lIIlllllIlllI(Skills.getLevel(Skill.HUNTER), lIllllIIll[19])) {
                    dz = lIllllIIIl[lIllllIIll[20]];
                    N.cY();
                }
                if (lIIllllllIIIl(C0018e.j(lIllllIIll[17]), lIllllIIll[18]) && lIIllllllIIIl(Skills.getLevel(Skill.HUNTER), lIllllIIll[19]) && lIIlllllIlllI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6])) {
                    dz = lIllllIIIl[lIllllIIll[21]];
                    J.cw();
                }
                if (lIIllllllIIIl(C0018e.j(lIllllIIll[17]), lIllllIIll[18]) && lIIllllllIIIl(Skills.getLevel(Skill.HUNTER), lIllllIIll[19]) && lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) && lIIlllllIlllI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22])) {
                    dz = lIllllIIIl[lIllllIIll[19]];
                    C0034u.aX();
                }
                if (lIIllllllIIIl(C0018e.j(lIllllIIll[17]), lIllllIIll[18]) && lIIllllllIIIl(Skills.getLevel(Skill.HUNTER), lIllllIIll[19]) && lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) && lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22]) && lIIlllllIlllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIllllIIll[19])) {
                    String[] strArr = new String[lIllllIIll[0]];
                    strArr[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[4]];
                    if (lIIlllllIllll(Inventory.contains(strArr) ? 1 : 0)) {
                        dz = lIllllIIIl[lIllllIIll[23]];
                        C0037x.bi();
                    }
                }
                C0037x.bj();
            }
            if (lIIlllllIllll(an() ? 1 : 0) && lIIlllllIllll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) && lIIllllllIIIl(C0018e.j(lIllllIIll[17]), lIllllIIll[18]) && lIIllllllIIIl(Skills.getLevel(Skill.HUNTER), lIllllIIll[19]) && lIIllllllIIIl(Skills.getLevel(Skill.RANGED), lIllllIIll[15]) && lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) && lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22]) && lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIllllIIll[19])) {
                String[] strArr2 = new String[lIllllIIll[0]];
                strArr2[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[24]];
                if (lIIlllllIllll(Inventory.contains(strArr2) ? 1 : 0)) {
                    dz = lIllllIIIl[lIllllIIll[25]];
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIllllllIllI(nearest) && lIIlllllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIIl[lIllllIIll[26]];
                        C0000a.a(nearest);
                    }
                    if (lIIllllllIllI(nearest) && lIIlllllIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlllllIllll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIllllIIll[27]);
                            "".length();
                        }
                        if (lIIlllllIllIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIIIl[lIllllIIll[28]];
                            if (lIIlllllllIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIllllIIll[13]);
                                "".length();
                            }
                            if (lIIlllllllIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIllllIIll[9]);
                                "".length();
                            }
                            int[] iArr = new int[lIllllIIll[0]];
                            iArr[lIllllIIll[1]] = lIllllIIll[29];
                            if (lIIlllllIllIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIllllIIll[0]];
                                iArr2[lIllllIIll[1]] = lIllllIIll[29];
                            }
                            int[] iArr3 = new int[lIllllIIll[0]];
                            iArr3[lIllllIIll[1]] = lIllllIIll[30];
                            if (lIIlllllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIllllIIll[0]];
                                iArr4[lIllllIIll[1]] = lIllllIIll[30];
                            }
                            int[] iArr5 = new int[lIllllIIll[0]];
                            iArr5[lIllllIIll[1]] = lIllllIIll[31];
                            if (lIIlllllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllIIll[0]];
                                iArr6[lIllllIIll[1]] = lIllllIIll[31];
                            }
                            int[] iArr7 = new int[lIllllIIll[0]];
                            iArr7[lIllllIIll[1]] = lIllllIIll[32];
                            if (lIIlllllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIllllIIll[0]];
                                iArr8[lIllllIIll[1]] = lIllllIIll[32];
                            }
                            int[] iArr9 = new int[lIllllIIll[0]];
                            iArr9[lIllllIIll[1]] = lIllllIIll[33];
                            if (lIIlllllIllIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIllllIIll[0]];
                                iArr10[lIllllIIll[1]] = lIllllIIll[33];
                            }
                            int[] iArr11 = new int[lIllllIIll[0]];
                            iArr11[lIllllIIll[1]] = lIllllIIll[34];
                            if (lIIlllllIllIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIllllIIll[0]];
                                iArr12[lIllllIIll[1]] = lIllllIIll[34];
                            }
                            int[] iArr13 = new int[lIllllIIll[23]];
                            iArr13[lIllllIIll[1]] = lIllllIIll[36];
                            iArr13[lIllllIIll[0]] = lIllllIIll[37];
                            iArr13[lIllllIIll[9]] = lIllllIIll[33];
                            iArr13[lIllllIIll[11]] = lIllllIIll[38];
                            iArr13[lIllllIIll[13]] = lIllllIIll[32];
                            iArr13[lIllllIIll[8]] = lIllllIIll[34];
                            iArr13[lIllllIIll[16]] = lIllllIIll[39];
                            iArr13[lIllllIIll[20]] = lIllllIIll[40];
                            iArr13[lIllllIIll[21]] = lIllllIIll[41];
                            iArr13[lIllllIIll[19]] = lIllllIIll[30];
                            iArr13[lIllllIIll[4]] = lIllllIIll[31];
                            if (lIIlllllIllll(C0018e.c(iArr13) ? 1 : 0)) {
                                Q();
                                System.out.println(lIllllIIIl[lIllllIIll[42]]);
                                bt = lIllllIIll[0];
                                return;
                            }
                            int[] iArr14 = new int[lIllllIIll[23]];
                            iArr14[lIllllIIll[1]] = lIllllIIll[36];
                            iArr14[lIllllIIll[0]] = lIllllIIll[37];
                            iArr14[lIllllIIll[9]] = lIllllIIll[33];
                            iArr14[lIllllIIll[11]] = lIllllIIll[38];
                            iArr14[lIllllIIll[13]] = lIllllIIll[32];
                            iArr14[lIllllIIll[8]] = lIllllIIll[34];
                            iArr14[lIllllIIll[16]] = lIllllIIll[39];
                            iArr14[lIllllIIll[20]] = lIllllIIll[40];
                            iArr14[lIllllIIll[21]] = lIllllIIll[41];
                            iArr14[lIllllIIll[19]] = lIllllIIll[30];
                            iArr14[lIllllIIll[4]] = lIllllIIll[31];
                            if (lIIlllllIllIl(C0018e.c(iArr14) ? 1 : 0)) {
                                C0000a.a(lIllllIIll[34], lIllllIIll[13]);
                                C0000a.a(lIllllIIll[37], lIllllIIll[0]);
                                C0000a.a(lIllllIIll[43], lIllllIIll[0]);
                                C0000a.a(lIllllIIll[32], lIllllIIll[13]);
                                C0000a.a(lIllllIIll[29], lIllllIIll[13]);
                                C0000a.a(lIllllIIll[40], lIllllIIll[0]);
                                C0000a.a(lIllllIIll[41], lIllllIIll[0]);
                                C0000a.a(lIllllIIll[36], lIllllIIll[4]);
                                C0000a.a(lIllllIIll[30], lIllllIIll[4]);
                                C0000a.a(lIllllIIll[31], lIllllIIll[28]);
                                C0000a.a(lIllllIIll[44], lIllllIIll[0]);
                                C0000a.a(lIllllIIll[45], lIllllIIll[27]);
                            }
                        }
                    }
                }
            }
            if (lIIlllllIllIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIIlllllIlllI(Movement.getRunEnergy(), lIllllIIll[15])) {
                Inventory.getFirst(C0019f.ba).interact(lIllllIIIl[lIllllIIll[46]]);
                Time.sleepTicks(lIllllIIll[0]);
                "".length();
            }
            if (lIIlllllIllIl(Inventory.contains(C0019f.aX) ? 1 : 0) && lIIlllllIlllI(Prayers.getPoints(), lIllllIIll[47])) {
                Inventory.getFirst(C0019f.aX).interact(lIllllIIIl[lIllllIIll[12]]);
            }
            if (lIIlllllllIIl(lIIlllllIllII(C0018e.w(), 60.0d))) {
                String[] strArr3 = new String[lIllllIIll[0]];
                strArr3[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[48]];
                if (lIIlllllIllIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIllllIIll[0]];
                    strArr4[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[49]];
                    Inventory.getFirst(strArr4).interact(lIllllIIIl[lIllllIIll[50]]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                }
            }
            if (lIIlllllIllIl(an() ? 1 : 0) && lIIlllllIllll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (lIIlllllIllll(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[51]];
                    if (lIIlllllIllIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(de);
                    "".length();
                    Time.sleepTicks(lIllllIIll[0]);
                    "".length();
                }
                if (lIIlllllIllIl(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
                    di = lIllllIIll[1];
                    C0020g.a(lIllllIIIl[lIllllIIll[47]], cE);
                }
                if (lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIllllIIll[52], lIllllIIll[53], lIllllIIll[1])) ? 1 : 0)) {
                    String[] strArr5 = new String[lIllllIIll[0]];
                    strArr5[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[54]];
                    TileObjects.getNearest(strArr5).interact(lIllllIIIl[lIllllIIll[55]]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                }
                if (lIIlllllIllIl(new WorldArea(lIllllIIll[52], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[lIllllIIll[0]];
                    strArr6[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[57]];
                    TileObjects.getNearest(strArr6).interact(lIllllIIIl[lIllllIIll[58]]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[4])) {
                int[] iArr15 = new int[lIllllIIll[0]];
                iArr15[lIllllIIll[1]] = lIllllIIll[44];
                if (lIIlllllIllll(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIllllIIll[0]];
                    iArr16[lIllllIIll[1]] = lIllllIIll[44];
                    Inventory.getFirst(iArr16).interact(lIllllIIIl[lIllllIIll[59]]);
                }
                int[] iArr17 = new int[lIllllIIll[0]];
                iArr17[lIllllIIll[1]] = lIllllIIll[60];
                if (lIIlllllIllll(Inventory.contains(iArr17) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIllllIIll[61], lIllllIIll[62], lIllllIIll[1]);
                    int[] iArr18 = new int[lIllllIIll[0]];
                    iArr18[lIllllIIll[1]] = lIllllIIll[63];
                    if (lIIlllllIllll(Inventory.contains(iArr18) ? 1 : 0) && lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllllIIll[48])) {
                        if (lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dx), lIllllIIll[8])) {
                            AccBuilderSotf.c = lIllllIIIl[lIllllIIll[64]];
                            Movement.walkTo(dx);
                            "".length();
                            Time.sleepTicks(lIllllIIll[0]);
                            "".length();
                        }
                        if (lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dx), lIllllIIll[8])) {
                            if (lIIlllllIllll(Shop.isOpen() ? 1 : 0)) {
                                String[] strArr7 = new String[lIllllIIll[0]];
                                strArr7[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[65]];
                                NPCs.getNearest(strArr7).interact(lIllllIIIl[lIllllIIll[10]]);
                                Time.sleepTicks(lIllllIIll[9]);
                                "".length();
                            }
                            if (lIIlllllIllIl(Shop.isOpen() ? 1 : 0)) {
                                Shop.buyFive(lIllllIIll[63]);
                                Time.sleepTicks(lIllllIIll[11]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr19 = new int[lIllllIIll[0]];
                    iArr19[lIllllIIll[1]] = lIllllIIll[63];
                    if (lIIlllllIllIl(Inventory.contains(iArr19) ? 1 : 0)) {
                        if (lIIlllllIllll(dv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllllIllll(dw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIllllIIll[0]];
                            iArr20[lIllllIIll[1]] = lIllllIIll[31];
                            if (lIIlllllIllIl(Inventory.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIllllIIll[0]];
                                iArr21[lIllllIIll[1]] = lIllllIIll[31];
                                Inventory.getFirst(iArr21).interact(lIllllIIIl[lIllllIIll[66]]);
                                Time.sleepTicks(lIllllIIll[20]);
                                "".length();
                            }
                        }
                        if (!lIIlllllIllll(dv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIlllllIllIl(dw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIllllIIll[61], lIllllIIll[62], lIllllIIll[1]);
                            if (lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllllIIll[8]) && lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderSotf.c = lIllllIIIl[lIllllIIll[67]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIllllIIll[0]);
                                "".length();
                            }
                            String[] strArr8 = new String[lIllllIIll[0]];
                            strArr8[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[14]];
                            if (lIIlllllIllIl(Inventory.contains(strArr8) ? 1 : 0)) {
                                if (lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllllIIll[8]) && lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                    String[] strArr9 = new String[lIllllIIll[0]];
                                    strArr9[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[68]];
                                    TileObjects.getNearest(strArr9).interact(lIllllIIIl[lIllllIIll[69]]);
                                    Time.sleepTicks(lIllllIIll[13]);
                                    "".length();
                                }
                                String[] strArr10 = new String[lIllllIIll[0]];
                                strArr10[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[70]];
                                if (lIIllllllIllI(TileObjects.getNearest(strArr10))) {
                                    String[] strArr11 = new String[lIllllIIll[0]];
                                    strArr11[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[71]];
                                    if (lIIlllllIllIl(Inventory.contains(strArr11) ? 1 : 0)) {
                                        String[] strArr12 = new String[lIllllIIll[0]];
                                        strArr12[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[22]];
                                        Item first = Inventory.getFirst(strArr12);
                                        String[] strArr13 = new String[lIllllIIll[0]];
                                        strArr13[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[72]];
                                        first.useOn(TileObjects.getNearest(strArr13));
                                        Time.sleep(C0018e.c(lIllllIIll[73], lIllllIIll[74]));
                                        "".length();
                                    }
                                }
                            }
                            String[] strArr14 = new String[lIllllIIll[0]];
                            strArr14[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[75]];
                            if (lIIlllllIllll(Inventory.contains(strArr14) ? 1 : 0)) {
                                if (lIIllllllIIII(Players.getLocal().getWorldLocation().getPlane(), lIllllIIll[0])) {
                                    String[] strArr15 = new String[lIllllIIll[0]];
                                    strArr15[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[76]];
                                    TileObjects.getNearest(strArr15).interact(lIllllIIIl[lIllllIIll[77]]);
                                    Time.sleepTicks(lIllllIIll[8]);
                                    "".length();
                                }
                                if (lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                    do {
                                        String[] strArr16 = new String[lIllllIIll[0]];
                                        strArr16[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[78]];
                                        if (lIIlllllIllIl(Inventory.contains(strArr16) ? 1 : 0)) {
                                            String[] strArr17 = new String[lIllllIIll[0]];
                                            strArr17[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[79]];
                                            TileObjects.getNearest(strArr17).interact(lIllllIIIl[lIllllIIll[80]]);
                                            Time.sleepTicks(lIllllIIll[9]);
                                            "".length();
                                            "".length();
                                        }
                                    } while (0 == 0);
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr22 = new int[lIllllIIll[0]];
                    iArr22[lIllllIIll[1]] = lIllllIIll[32];
                    if (lIIlllllIllll(Inventory.contains(iArr22) ? 1 : 0)) {
                        String[] strArr18 = new String[lIllllIIll[0]];
                        strArr18[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[81]];
                        if (lIIlllllIllll(Inventory.contains(strArr18) ? 1 : 0) && lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllllIIll[48])) {
                            if (lIIlllllIllll(Dialog.isOpen() ? 1 : 0)) {
                                C0020g.a(lIllllIIIl[lIllllIIll[82]], cE);
                                Time.sleepTicks(lIllllIIll[0]);
                                "".length();
                            }
                            C0020g.a(cE);
                        }
                    }
                }
                int[] iArr23 = new int[lIllllIIll[0]];
                iArr23[lIllllIIll[1]] = lIllllIIll[60];
                if (lIIlllllIllIl(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[lIllllIIll[9]];
                    iArr24[lIllllIIll[1]] = lIllllIIll[83];
                    iArr24[lIllllIIll[0]] = lIllllIIll[29];
                    if (lIIlllllIllIl(Inventory.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[lIllllIIll[9]];
                        iArr25[lIllllIIll[1]] = lIllllIIll[83];
                        iArr25[lIllllIIll[0]] = lIllllIIll[29];
                        Inventory.getAll(iArr25).stream().forEach(item -> {
                            item.interact(lIllllIIIl[lIllllIIll[162]]);
                        });
                    }
                    if (lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                        Movement.walkTo(dy);
                        "".length();
                        Time.sleepTicks(lIllllIIll[0]);
                        "".length();
                    }
                    if (lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                        C0020g.a(lIllllIIIl[lIllllIIll[15]], cE);
                    }
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[48])) {
                C0020g.a(lIllllIIIl[lIllllIIll[84]], cE);
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[64])) {
                C0020g.a(lIllllIIIl[lIllllIIll[85]], cE);
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[22])) {
                C0020g.a(lIllllIIIl[lIllllIIll[86]], cE);
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[15])) {
                C0020g.a(lIllllIIIl[lIllllIIll[87]], cE);
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[6])) {
                C0020g.a(lIllllIIIl[lIllllIIll[88]], cE);
            }
            if (!lIlIIIIIIIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[89]) || lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[90])) {
                WorldPoint worldPoint3 = new WorldPoint(lIllllIIll[91], lIllllIIll[92], lIllllIIll[1]);
                if (lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIllllIIll[11])) {
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[93]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(lIllllIIll[0]);
                    "".length();
                }
                if (lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIllllIIll[11])) {
                    C0020g.a(lIllllIIIl[lIllllIIll[94]], cE);
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[95])) {
                if (lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                    Movement.walkTo(dy);
                    "".length();
                    Time.sleepTicks(lIllllIIll[0]);
                    "".length();
                }
                if (lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                    C0020g.a(lIllllIIIl[lIllllIIll[96]], cE);
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[97])) {
                C0020g.a(lIllllIIIl[lIllllIIll[98]], cE);
            }
            if (!lIlIIIIIIIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[99]) || lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[100])) {
                C0020g.a(lIllllIIIl[lIllllIIll[6]], cE);
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[100])) {
                String[] strArr19 = new String[lIllllIIll[0]];
                strArr19[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[101]];
                if (lIIlllllIllIl(Inventory.contains(strArr19) ? 1 : 0)) {
                    String[] strArr20 = new String[lIllllIIll[0]];
                    strArr20[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[102]];
                    if (lIIlllllIllll(Inventory.contains(strArr20) ? 1 : 0)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Integer.valueOf(lIllllIIll[33]), Integer.valueOf(lIllllIIll[8]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIllllIIll[38]), Integer.valueOf(lIllllIIll[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIllllIIll[39]), Integer.valueOf(lIllllIIll[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIllllIIll[103]), Integer.valueOf(lIllllIIll[0]));
                        "".length();
                        C0018e.a(hashMap, lIllllIIll[1], lIllllIIll[1]);
                    }
                    String[] strArr21 = new String[lIllllIIll[0]];
                    strArr21[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[104]];
                    if (lIIlllllIllIl(Inventory.contains(strArr21) ? 1 : 0)) {
                        bg();
                    }
                }
            }
            if (!lIlIIIIIIIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[105]) || lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[106])) {
                String[] strArr22 = new String[lIllllIIll[0]];
                strArr22[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[107]];
                NPC nearest2 = NPCs.getNearest(strArr22);
                if (lIIllllllIllI(nearest2)) {
                    if (lIIlllllIllIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        C0020g.a(lIllllIIIl[lIllllIIll[3]], cE);
                    }
                    if (lIIlllllIllll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2);
                        "".length();
                        Time.sleepTicks(lIllllIIll[0]);
                        "".length();
                    }
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[108])) {
                String[] strArr23 = new String[lIllllIIll[0]];
                strArr23[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[109]];
                if (lIIlllllIllll(Inventory.contains(strArr23) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIllllIIll[110], lIllllIIll[111], lIllllIIll[1]);
                    WorldPoint worldPoint5 = new WorldPoint(lIllllIIll[110], lIllllIIll[112], lIllllIIll[1]);
                    if (lIIlllllIllll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lIIlllllIllll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIIl[lIllllIIll[113]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lIllllIIll[0]);
                        "".length();
                    }
                    if (lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lIIlllllIllll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        Movement.walkTo(worldPoint5);
                        "".length();
                    }
                    if (lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        String[] strArr24 = new String[lIllllIIll[0]];
                        strArr24[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[114]];
                        Item first2 = Inventory.getFirst(strArr24);
                        String[] strArr25 = new String[lIllllIIll[0]];
                        strArr25[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[115]];
                        first2.useOn(Inventory.getFirst(strArr25));
                        Time.sleepTicks(lIllllIIll[11]);
                        "".length();
                    }
                }
                String[] strArr26 = new String[lIllllIIll[0]];
                strArr26[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[89]];
                if (lIIlllllIllIl(Inventory.contains(strArr26) ? 1 : 0)) {
                    bg();
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[116])) {
                WorldPoint worldPoint6 = new WorldPoint(lIllllIIll[117], lIllllIIll[118], lIllllIIll[1]);
                if (lIIlllllIllll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    Movement.walkTo(worldPoint6);
                    "".length();
                    Time.sleepTicks(lIllllIIll[0]);
                    "".length();
                }
                if (lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    String[] strArr27 = new String[lIllllIIll[0]];
                    strArr27[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[119]];
                    NPCs.getNearest(strArr27).interact(lIllllIIIl[lIllllIIll[120]]);
                    Time.sleepTicks(lIllllIIll[0]);
                    "".length();
                }
            }
            if (!lIlIIIIIIIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[121]) || lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[122])) {
                WorldPoint worldPoint7 = new WorldPoint(lIllllIIll[123], lIllllIIll[124], lIllllIIll[1]);
                if (lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIllllIIll[9])) {
                    if (lIIlllllIllIl(Inventory.contains(C0019f.aT) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aT).interact(lIllllIIIl[lIllllIIll[90]]);
                    }
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[125]];
                    Movement.walkTo(worldPoint7);
                    "".length();
                    Time.sleepTicks(lIllllIIll[0]);
                    "".length();
                }
                if (lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIllllIIll[9])) {
                    String[] strArr28 = new String[lIllllIIll[0]];
                    strArr28[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[126]];
                    NPC nearest3 = NPCs.getNearest(strArr28);
                    if (lIIllllllIllI(nearest3)) {
                        if (lIIlllllIllIl(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            C0020g.a(lIllllIIIl[lIllllIIll[95]], cE);
                        }
                        if (lIIlllllIllll(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            Movement.walkTo(nearest3);
                            "".length();
                            Time.sleepTicks(lIllllIIll[0]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[127])) {
                String[] strArr29 = new String[lIllllIIll[0]];
                strArr29[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[128]];
                if (lIIlllllIllll(Inventory.contains(strArr29) ? 1 : 0)) {
                    WorldPoint worldPoint8 = new WorldPoint(lIllllIIll[117], lIllllIIll[118], lIllllIIll[1]);
                    if (lIIlllllIllll(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        Movement.walkTo(worldPoint8);
                        "".length();
                        Time.sleepTicks(lIllllIIll[0]);
                        "".length();
                    }
                    if (lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        String[] strArr30 = new String[lIllllIIll[0]];
                        strArr30[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[129]];
                        NPCs.getNearest(strArr30).interact(lIllllIIIl[lIllllIIll[130]]);
                        Time.sleepTicks(lIllllIIll[0]);
                        "".length();
                    }
                }
                String[] strArr31 = new String[lIllllIIll[0]];
                strArr31[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[97]];
                if (lIIlllllIllIl(Inventory.contains(strArr31) ? 1 : 0)) {
                    bg();
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[131])) {
                bg();
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[132])) {
                if (lIIlllllIllIl(Widgets.get(lIllllIIll[133]).isEmpty() ? 1 : 0)) {
                    String[] strArr32 = new String[lIllllIIll[0]];
                    strArr32[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[134]];
                    Inventory.getFirst(strArr32).interact(lIllllIIIl[lIllllIIll[135]]);
                    Time.sleepTicks(lIllllIIll[13]);
                    "".length();
                }
                if (lIIlllllIllll(Widgets.get(lIllllIIll[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click(Widgets.get(lIllllIIll[133], lIllllIIll[55]).getClickPoint().getX(), Widgets.get(lIllllIIll[133], lIllllIIll[55]).getClickPoint().getY(), (boolean) lIllllIIll[0]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIllllIIll[133], lIllllIIll[65]).getClickPoint().getX(), Widgets.get(lIllllIIll[133], lIllllIIll[65]).getClickPoint().getY(), (boolean) lIllllIIll[0]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIllllIIll[133], lIllllIIll[67]).getClickPoint().getX(), Widgets.get(lIllllIIll[133], lIllllIIll[67]).getClickPoint().getY(), (boolean) lIllllIIll[0]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIllllIIll[133], lIllllIIll[22]).getClickPoint().getX(), Widgets.get(lIllllIIll[133], lIllllIIll[22]).getClickPoint().getY(), (boolean) lIllllIIll[0]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIllllIIll[133], lIllllIIll[76]).getClickPoint().getX(), Widgets.get(lIllllIIll[133], lIllllIIll[76]).getClickPoint().getY(), (boolean) lIllllIIll[0]);
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIllllIIll[133], lIllllIIll[79]).getClickPoint().getX(), Widgets.get(lIllllIIll[133], lIllllIIll[79]).getClickPoint().getY(), (boolean) lIllllIIll[0]);
                    Time.sleepTicks(lIllllIIll[8]);
                    "".length();
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[136])) {
                bg();
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[137])) {
                String[] strArr33 = new String[lIllllIIll[0]];
                strArr33[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[138]];
                if (lIIlllllIllIl(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[lIllllIIll[0]];
                    strArr34[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[139]];
                    Item first3 = Inventory.getFirst(strArr34);
                    String[] strArr35 = new String[lIllllIIll[0]];
                    strArr35[lIllllIIll[1]] = lIllllIIIl[lIllllIIll[140]];
                    first3.useOn(Inventory.getFirst(strArr35));
                    Time.sleepTicks(lIllllIIll[9]);
                    "".length();
                }
            }
            if (lIIllllllIIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[141])) {
                if (lIIlllllIlllI(di, lIllllIIll[0])) {
                    aN.sa += lIllllIIll[0];
                    aN.u(AccBuilderSotf.m);
                    di += lIllllIIll[0];
                    aN.sa = lIllllIIll[1];
                    dj = lIllllIIll[1];
                }
                bg();
            }
            C0020g.a(cE);
        }
    }

    private static boolean lIIllllllIIII(int i, int i2) {
        return i == i2;
    }

    private static String lIIllllIllIIl(String llllllllllllllllllIlllIlIllIIIlI, String llllllllllllllllllIlllIlIllIIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIlllIlIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), lIllllIIll[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIIll[9], llllllllllllllllllIlllIlIllIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIlIllIIIll) {
            llllllllllllllllllIlllIlIllIIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[2])) {
            ?? r0 = lIllllIIll[0];
            "".length();
            return (((128 ^ 170) ^ (69 ^ 39)) & (((66 ^ 25) ^ (144 ^ 131)) ^ (-" ".length()))) != 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        }
        return lIllllIIll[1];
    }

    private static String lIIllllIllIlI(String llllllllllllllllllIlllIlIllIllll, String llllllllllllllllllIlllIlIllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIlIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIIll[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIlIlllIIII) {
            llllllllllllllllllIlllIlIlllIIII.printStackTrace();
            return null;
        }
    }
}
