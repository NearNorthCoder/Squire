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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
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
import net.unethicalite.api.widgets.Prayers;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.C  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/C.class */
public class C implements ab {
    static /* synthetic */ boolean eE;
    static /* synthetic */ boolean eG;
    static /* synthetic */ boolean ex;
    public static final /* synthetic */ WorldPoint em;
    public static /* synthetic */ String dc;
    public static /* synthetic */ String[] cG;
    static /* synthetic */ boolean eA;
    static /* synthetic */ boolean eK;
    public static final /* synthetic */ WorldPoint eo;
    private static /* synthetic */ String[] llllIlIII;
    public static final /* synthetic */ WorldPoint en;
    static /* synthetic */ boolean ez;
    static /* synthetic */ boolean eJ;
    public static final /* synthetic */ WorldPoint et;
    private static /* synthetic */ int[] llllIlIlI;
    static /* synthetic */ boolean eB;
    static /* synthetic */ boolean eD;
    public static /* synthetic */ boolean cL;
    public static final /* synthetic */ WorldPoint er;
    public static final /* synthetic */ WorldPoint eq;
    static /* synthetic */ boolean eH;
    static /* synthetic */ boolean eC;
    public static /* synthetic */ String h;
    public static final /* synthetic */ WorldPoint eu;
    public static final /* synthetic */ WorldPoint ev;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ boolean eM;
    static /* synthetic */ boolean ey;
    static /* synthetic */ int ew;
    static /* synthetic */ boolean eL;
    static /* synthetic */ boolean eF;
    static /* synthetic */ boolean eI;
    public static final /* synthetic */ WorldPoint ep;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int dk;
    public static final /* synthetic */ WorldPoint es;

    static {
        llIlIIIllIIl();
        llIlIIIllIII();
        em = new WorldPoint(llllIlIlI[130], llllIlIlI[188], llllIlIlI[1]);
        en = new WorldPoint(llllIlIlI[189], llllIlIlI[190], llllIlIlI[0]);
        eo = new WorldPoint(llllIlIlI[140], llllIlIlI[191], llllIlIlI[0]);
        ep = new WorldPoint(llllIlIlI[86], llllIlIlI[192], llllIlIlI[4]);
        eq = new WorldPoint(llllIlIlI[193], llllIlIlI[194], llllIlIlI[1]);
        er = new WorldPoint(llllIlIlI[195], llllIlIlI[196], llllIlIlI[1]);
        es = new WorldPoint(llllIlIlI[197], llllIlIlI[198], llllIlIlI[0]);
        et = new WorldPoint(llllIlIlI[142], llllIlIlI[191], llllIlIlI[0]);
        eu = new WorldPoint(llllIlIlI[149], llllIlIlI[199], llllIlIlI[3]);
        ev = new WorldPoint(llllIlIlI[86], llllIlIlI[131], llllIlIlI[1]);
        bx = new ArrayList();
        String[] strArr = new String[llllIlIlI[30]];
        strArr[llllIlIlI[1]] = llllIlIII[llllIlIlI[200]];
        strArr[llllIlIlI[0]] = llllIlIII[llllIlIlI[201]];
        strArr[llllIlIlI[3]] = llllIlIII[llllIlIlI[202]];
        strArr[llllIlIlI[4]] = llllIlIII[llllIlIlI[203]];
        strArr[llllIlIlI[6]] = llllIlIII[llllIlIlI[204]];
        strArr[llllIlIlI[12]] = llllIlIII[llllIlIlI[114]];
        strArr[llllIlIlI[19]] = llllIlIII[llllIlIlI[205]];
        strArr[llllIlIlI[23]] = llllIlIII[llllIlIlI[206]];
        strArr[llllIlIlI[25]] = llllIlIII[llllIlIlI[207]];
        strArr[llllIlIlI[27]] = llllIlIII[llllIlIlI[208]];
        strArr[llllIlIlI[16]] = llllIlIII[llllIlIlI[209]];
        strArr[llllIlIlI[29]] = llllIlIII[llllIlIlI[210]];
        strArr[llllIlIlI[24]] = llllIlIII[llllIlIlI[211]];
        cG = strArr;
        ew = llllIlIlI[35];
        dc = llllIlIII[llllIlIlI[212]];
        h = "Grand Tree " + dc;
    }

    private static boolean llIlIIIllllI(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIIlllll(int i) {
        return i > 0;
    }

    private static boolean llIlIIIlllII(int i) {
        return i == 0;
    }

    private static boolean llIlIIIlllIl(int i, int i2) {
        return i >= i2;
    }

    private static String llIlIIIIIlll(String lIlllIIlllIll, String lIlllIIlllIlI) {
        try {
            SecretKeySpec lIlllIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIIllllIl = Cipher.getInstance("Blowfish");
            lIlllIIllllIl.init(llllIlIlI[3], lIlllIIlllllI);
            return new String(lIlllIIllllIl.doFinal(Base64.getDecoder().decode(lIlllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIllllII) {
            lIlllIIllllII.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bu();
            "".length();
            if ((-" ".length()) > " ".length()) {
                return (126 ^ 37) & ((225 ^ 186) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llllIlIlI[82];
    }

    private static boolean llIlIIlIIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llllIlIlI[1];
    }

    private static boolean llIlIIIllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[186])) {
            ?? r0 = llllIlIlI[0];
            "".length();
            return " ".length() < " ".length() ? ((88 ^ 82) ^ (62 ^ 20)) & (((40 ^ 44) ^ (71 ^ 99)) ^ (-" ".length())) : r0;
        }
        return llllIlIlI[1];
    }

    private static void llIlIIIllIIl() {
        llllIlIlI = new int[214];
        llllIlIlI[0] = " ".length();
        llllIlIlI[1] = (61 ^ 119) & ((249 ^ 179) ^ (-1));
        llllIlIlI[2] = (41 ^ 55) ^ (124 ^ 123);
        llllIlIlI[3] = "  ".length();
        llllIlIlI[4] = "   ".length();
        llllIlIlI[5] = (-9250) & 14249;
        llllIlIlI[6] = (58 ^ 30) ^ (8 ^ 40);
        llllIlIlI[7] = (-((-2081) & 30837)) & (-1154) & 30463;
        llllIlIlI[8] = (-8194) & 10193;
        llllIlIlI[9] = (-((-523) & 10187)) & (-22529) & 32750;
        llllIlIlI[10] = (-((-4167) & 30814)) & (-1) & 27647;
        llllIlIlI[11] = (-((-11781) & 28167)) & (-12806) & 31743;
        llllIlIlI[12] = 161 ^ 164;
        llllIlIlI[13] = (-18947) & 31571;
        llllIlIlI[14] = (-((-145) & 13046)) & (-1041) & 16375;
        llllIlIlI[15] = (-27265) & 27643;
        llllIlIlI[16] = 188 ^ 182;
        llllIlIlI[17] = (-24617) & 32623;
        llllIlIlI[18] = (-((-35) & 23603)) & (-8197) & 32759;
        llllIlIlI[19] = (((78 + 39) - 54) + 95) ^ (((52 + 95) - 91) + 96);
        llllIlIlI[20] = (-((-24857) & 31514)) & (-17417) & 24573;
        llllIlIlI[21] = (-((-9613) & 30639)) & (-10242) & 32767;
        llllIlIlI[22] = 134 ^ 180;
        llllIlIlI[23] = (48 ^ 124) ^ (12 ^ 71);
        llllIlIlI[24] = (((79 + 37) - 10) + 76) ^ (((112 + 120) - 88) + 42);
        llllIlIlI[25] = 8 ^ 0;
        llllIlIlI[26] = (103 ^ 1) ^ (242 ^ 155);
        llllIlIlI[27] = 186 ^ 179;
        llllIlIlI[28] = (((78 + 136) - 62) + 23) ^ (((148 + 170) - 213) + 82);
        llllIlIlI[29] = (0 ^ 113) ^ (27 ^ 97);
        llllIlIlI[30] = (35 ^ 123) ^ (89 ^ 12);
        llllIlIlI[31] = (122 ^ 40) ^ (50 ^ 110);
        llllIlIlI[32] = 215 ^ 199;
        llllIlIlI[33] = (-12680) & 15863;
        llllIlIlI[34] = (-16393) & 19899;
        llllIlIlI[35] = (((18 ^ 58) + (204 ^ 158)) - (12 ^ 86)) + (218 ^ 172);
        llllIlIlI[36] = 52 ^ 28;
        llllIlIlI[37] = (130 ^ 143) ^ (75 ^ 87);
        llllIlIlI[38] = "   ".length() ^ (18 ^ 15);
        llllIlIlI[39] = 156 ^ 142;
        llllIlIlI[40] = 102 ^ 117;
        llllIlIlI[41] = (((31 + 123) - 77) + 114) ^ (((126 + 94) - 104) + 54);
        llllIlIlI[42] = (22 ^ 120) ^ (190 ^ 198);
        llllIlIlI[43] = 7 ^ 16;
        llllIlIlI[44] = (((160 + 17) - 11) + 52) ^ (((66 + 44) - 89) + 173);
        llllIlIlI[45] = 186 ^ 134;
        llllIlIlI[46] = (14 ^ 76) ^ (2 ^ 90);
        llllIlIlI[47] = 51 ^ 40;
        llllIlIlI[48] = (((125 + 112) - 153) + 88) ^ (((163 + 141) - 224) + 96);
        llllIlIlI[49] = (228 ^ 130) ^ (6 ^ 125);
        llllIlIlI[50] = 71 ^ 88;
        llllIlIlI[51] = 59 ^ 27;
        llllIlIlI[52] = (((151 + 26) - 169) + 173) ^ (((130 + 73) - 159) + 104);
        llllIlIlI[53] = 55 ^ 21;
        llllIlIlI[54] = 96 ^ 67;
        llllIlIlI[55] = 59 ^ 31;
        llllIlIlI[56] = 92 ^ 121;
        llllIlIlI[57] = 105 ^ 47;
        llllIlIlI[58] = (((18 + 141) - 158) + 155) ^ (((129 + 21) - 137) + 173);
        llllIlIlI[59] = (49 ^ 85) ^ (54 ^ 117);
        llllIlIlI[60] = (-91) & 2554;
        llllIlIlI[61] = (-4119) & 7614;
        llllIlIlI[62] = 194 ^ 146;
        llllIlIlI[63] = 59 ^ 18;
        llllIlIlI[64] = 180 ^ 158;
        llllIlIlI[65] = (-17437) & 20381;
        llllIlIlI[66] = 122 ^ 81;
        llllIlIlI[67] = 69 ^ 105;
        llllIlIlI[68] = 86 ^ 123;
        llllIlIlI[69] = (33 ^ 50) ^ (77 ^ 112);
        llllIlIlI[70] = 94 ^ 113;
        llllIlIlI[71] = 41 ^ 25;
        llllIlIlI[72] = 30 ^ 68;
        llllIlIlI[73] = 46 ^ 31;
        llllIlIlI[74] = (((75 + 100) - 147) + 141) ^ (((67 + 28) - 71) + 130);
        llllIlIlI[75] = 187 ^ 143;
        llllIlIlI[76] = 128 ^ 181;
        llllIlIlI[77] = 62 ^ 8;
        llllIlIlI[78] = 80 ^ 103;
        llllIlIlI[79] = 110 ^ 86;
        llllIlIlI[80] = 26 ^ 35;
        llllIlIlI[81] = 179 ^ 137;
        llllIlIlI[82] = (111 ^ 48) ^ (79 ^ 116);
        llllIlIlI[83] = 15 ^ 52;
        llllIlIlI[84] = 129 ^ 188;
        llllIlIlI[85] = 162 ^ 156;
        llllIlIlI[86] = (-((-6441) & 32635)) & (-4105) & 32763;
        llllIlIlI[87] = (-((-17) & 24689)) & (-4105) & 32255;
        llllIlIlI[88] = (123 ^ 57) ^ (229 ^ 152);
        llllIlIlI[89] = 93 ^ 29;
        llllIlIlI[90] = 192 ^ 129;
        llllIlIlI[91] = 85 ^ 23;
        llllIlIlI[92] = (((52 + 106) - (-9)) + 79) ^ (((141 + 168) - 205) + 77);
        llllIlIlI[93] = 25 ^ 93;
        llllIlIlI[94] = (-((-23337) & 31673)) & (-17921) & 28663;
        llllIlIlI[95] = 30 ^ 91;
        llllIlIlI[96] = (50 ^ 67) ^ (117 ^ 67);
        llllIlIlI[97] = (180 ^ 152) ^ (243 ^ 151);
        llllIlIlI[98] = 36 ^ 109;
        llllIlIlI[99] = (1 ^ 115) ^ (177 ^ 137);
        llllIlIlI[100] = 101 ^ 11;
        llllIlIlI[101] = 53 ^ 126;
        llllIlIlI[102] = (92 ^ 123) ^ (29 ^ 118);
        llllIlIlI[103] = 85 ^ 45;
        llllIlIlI[104] = 23 ^ 90;
        llllIlIlI[105] = (185 ^ 199) ^ (147 ^ 163);
        llllIlIlI[106] = (-23747) & 24535;
        llllIlIlI[107] = (-22065) & 24504;
        llllIlIlI[108] = (-13514) & 14303;
        llllIlIlI[109] = (-((-3395) & 24419)) & (-9281) & 32745;
        llllIlIlI[110] = (-((-1305) & 24057)) & (-1033) & 24575;
        llllIlIlI[111] = (-((-9226) & 26123)) & (-1029) & 20367;
        llllIlIlI[112] = (-6338) & 7129;
        llllIlIlI[113] = (-((-11707) & 32703)) & (-8209) & 31647;
        llllIlIlI[114] = (((143 ^ 151) + (56 ^ 4)) - (212 ^ 198)) + (116 ^ 52);
        llllIlIlI[115] = 5 ^ 74;
        llllIlIlI[116] = 71 ^ 22;
        llllIlIlI[117] = (111 ^ 106) ^ (94 ^ 9);
        llllIlIlI[118] = (-13383) & 15870;
        llllIlIlI[119] = (-20549) & 30407;
        llllIlIlI[120] = 86 ^ 5;
        llllIlIlI[121] = 221 ^ 137;
        llllIlIlI[122] = 10 ^ 95;
        llllIlIlI[123] = ((79 + 37) - 3) + 27;
        llllIlIlI[124] = 101 ^ 51;
        llllIlIlI[125] = 22 ^ 65;
        llllIlIlI[126] = (((95 + 8) - 34) + 135) ^ (((11 + 7) - 15) + 145);
        llllIlIlI[127] = (((108 + 36) - 21) + 73) ^ (((24 + 43) - 3) + 93);
        llllIlIlI[128] = 250 ^ 161;
        llllIlIlI[129] = (((208 + 138) - 208) + 88) ^ (((96 + 103) - 64) + 55);
        llllIlIlI[130] = (-25098) & 27563;
        llllIlIlI[131] = (-((-26250) & 26587)) & (-6147) & 16379;
        llllIlIlI[132] = 124 ^ 33;
        llllIlIlI[133] = (126 ^ 98) ^ (213 ^ 151);
        llllIlIlI[134] = (-20561) & 30452;
        llllIlIlI[135] = (((133 + 76) - 123) + 138) ^ (((47 + 43) - 76) + 177);
        llllIlIlI[136] = (68 ^ 45) ^ (159 ^ 150);
        llllIlIlI[137] = (-13377) & 15847;
        llllIlIlI[138] = (21 ^ 110) ^ (99 ^ 121);
        llllIlIlI[139] = 224 ^ 130;
        llllIlIlI[140] = (-24597) & 27071;
        llllIlIlI[141] = "   ".length() ^ (99 ^ 3);
        llllIlIlI[142] = (-((-2155) & 19055)) & (-4105) & 23487;
        llllIlIlI[143] = (-((-29893) & 32197)) & (-4097) & 16303;
        llllIlIlI[144] = (184 ^ 189) ^ (38 ^ 70);
        llllIlIlI[145] = (67 ^ 52) ^ (180 ^ 165);
        llllIlIlI[146] = (-((-18485) & 32373)) & (-2) & 16379;
        llllIlIlI[147] = (105 ^ 90) ^ (30 ^ 74);
        llllIlIlI[148] = "   ".length() ^ (120 ^ 19);
        llllIlIlI[149] = (-21506) & 23991;
        llllIlIlI[150] = (-4162) & 14049;
        llllIlIlI[151] = (((162 + 14) - 126) + 182) ^ (((35 + 84) - 12) + 22);
        llllIlIlI[152] = 29 ^ 119;
        llllIlIlI[153] = (-16466) & 18935;
        llllIlIlI[154] = (-18789) & 28661;
        llllIlIlI[155] = (((90 + 21) - (-21)) + 113) ^ (((37 + 118) - 28) + 31);
        llllIlIlI[156] = 103 ^ 11;
        llllIlIlI[157] = (-29732) & 32191;
        llllIlIlI[158] = (-22789) & 32668;
        llllIlIlI[159] = (39 ^ 99) ^ (16 ^ 57);
        llllIlIlI[160] = (-26150) & 28607;
        llllIlIlI[161] = (-((-17007) & 23407)) & (-16461) & 32735;
        llllIlIlI[162] = 228 ^ 139;
        llllIlIlI[163] = 61 ^ 77;
        llllIlIlI[164] = (-((-2271) & 23295)) & (-9217) & 32686;
        llllIlIlI[165] = 24 ^ 105;
        llllIlIlI[166] = (((52 + 27) - 67) + 225) ^ (((121 + 2) - 90) + 126);
        llllIlIlI[167] = (-22786) & 32669;
        llllIlIlI[168] = 56 ^ 75;
        llllIlIlI[169] = 4 ^ 112;
        llllIlIlI[170] = (-1571) & 4015;
        llllIlIlI[171] = 217 ^ 172;
        llllIlIlI[172] = (((210 + 158) - 197) + 77) ^ (((90 + 100) - 131) + 83);
        llllIlIlI[173] = (-24579) & 27031;
        llllIlIlI[174] = 197 ^ 178;
        llllIlIlI[175] = (-5193) & 7647;
        llllIlIlI[176] = (-((-26559) & 32703)) & (-16481) & 32511;
        llllIlIlI[177] = 3 ^ 122;
        llllIlIlI[178] = 121 ^ 3;
        llllIlIlI[179] = 40 ^ 83;
        llllIlIlI[180] = (-((-133) & 7919)) & (-24581) & 32766;
        llllIlIlI[181] = (-((-9057) & 14202)) & (-545) & 8189;
        llllIlIlI[182] = (-4369) & 16348;
        llllIlIlI[183] = (-3587) & 28586;
        llllIlIlI[184] = (-((-4537) & 5567)) & (-16673) & 32702;
        llllIlIlI[185] = (-1129) & 2028;
        llllIlIlI[186] = (((42 ^ 73) + (254 ^ 148)) - (((149 + 118) - 109) + 32)) + ((43 + 46) - (-11)) + 45;
        llllIlIlI[187] = 184 ^ 196;
        llllIlIlI[188] = (-((-5513) & 30687)) & (-4097) & 32767;
        llllIlIlI[189] = (-((-2593) & 16291)) & (-9) & 16383;
        llllIlIlI[190] = (-((-3265) & 24556)) & (-8257) & 32635;
        llllIlIlI[191] = (-21057) & 24519;
        llllIlIlI[192] = (-((-7527) & 24439)) & (-8201) & 28607;
        llllIlIlI[193] = (-29805) & 32748;
        llllIlIlI[194] = (-29705) & 32746;
        llllIlIlI[195] = (-((-259) & 21763)) & (-8263) & 32767;
        llllIlIlI[196] = (-((-2606) & 15935)) & (-16393) & 32767;
        llllIlIlI[197] = (-1676) & 4063;
        llllIlIlI[198] = (-12802) & 16315;
        llllIlIlI[199] = (-4165) & 7629;
        llllIlIlI[200] = (195 ^ 130) ^ (37 ^ 25);
        llllIlIlI[201] = (((101 + 39) - 35) + 110) ^ (((119 + 145) - 124) + 29);
        llllIlIlI[202] = (((10 ^ 80) + (123 ^ 115)) - (-(82 ^ 88))) + (150 ^ 133);
        llllIlIlI[203] = (((61 ^ 15) + (4 ^ 119)) - (((116 + 111) - 103) + 15)) + (57 ^ 95);
        llllIlIlI[204] = (((160 ^ 151) + (43 ^ 13)) - (107 ^ 45)) + (94 ^ 52);
        llllIlIlI[205] = (((63 ^ 115) + (199 ^ 141)) - (7 ^ 46)) + (123 ^ 109);
        llllIlIlI[206] = (((72 ^ 19) + (66 ^ 116)) - (20 ^ 10)) + (33 ^ 48);
        llllIlIlI[207] = (((15 ^ 114) + (84 ^ 67)) - (251 ^ 160)) + (20 ^ 88);
        llllIlIlI[208] = (((87 ^ 65) + (74 ^ 101)) - (-(13 ^ 57))) + (60 ^ 49);
        llllIlIlI[209] = ((102 + 61) - 41) + 13;
        llllIlIlI[210] = ((15 + 40) - (-57)) + 24;
        llllIlIlI[211] = ((35 + 95) - 41) + 48;
        llllIlIlI[212] = (("   ".length() + (255 ^ 189)) - (21 ^ 17)) + (222 ^ 151);
        llllIlIlI[213] = ((124 + 117) - 216) + 114;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return h;
    }

    private static boolean llIlIIIllIlI(int i) {
        return i != 0;
    }

    private static void llIlIIIllIII() {
        llllIlIII = new String[llllIlIlI[213]];
        llllIlIII[llllIlIlI[1]] = llIlIIIIIlll("Bds2/yxn98Mo5W7W4RRIyw6RCROqauc0/v0r3TDUlCjSottPbye+2n4CSsAM9vCf", "CxFvO");
        llllIlIII[llllIlIlI[0]] = llIlIIIIlIII("e2w2Lz46JQMx", "VLwHW");
        llllIlIII[llllIlIlI[3]] = llIlIIIIIlll("OHM02rHFhXo=", "LWIyA");
        llllIlIII[llllIlIlI[4]] = llIlIIIIlIII("NzM6bw0Wci4uFxI=", "yRLOy");
        llllIlIII[llllIlIlI[6]] = llIlIIIIlIII("CSc0ESYoKD1VKCAoMRwkJg==", "AFZuJ");
        llllIlIII[llllIlIlI[12]] = llIlIIIIlIIl("K3YbrRQKKvlfeFUvgnjZDbxYq8paFZ02E91ck77oMIOzRCkdvoTl1sXuJyTZlBY6EQMXxoVpHOw=", "vdVFp");
        llllIlIII[llllIlIlI[19]] = llIlIIIIlIIl("TyDbdqCzSefGWpH6IQ9qFjhTmOYbQEAlf1VHtkAFUMuYqigjU9ClZDFllGo1MpZ8zMhzNegj7kQ=", "AICSW");
        llllIlIII[llllIlIlI[23]] = llIlIIIIlIIl("PT/jpHHYgt8=", "vYAfN");
        llllIlIII[llllIlIlI[25]] = llIlIIIIlIIl("Kec+u+17X98=", "rJLDD");
        llllIlIII[llllIlIlI[27]] = llIlIIIIIlll("0pl9B6fvaTGaOcIL/Fc4hQ==", "tEHmH");
        llllIlIII[llllIlIlI[16]] = llIlIIIIIlll("mCIfwBcPSv/yRaTWGkPUTbwqYRo17nFI", "rmFCS");
        llllIlIII[llllIlIlI[29]] = llIlIIIIIlll("YlzNP/s41W/ulDPAEBWIBbDUeJ/KfXtP", "rFYQY");
        llllIlIII[llllIlIlI[24]] = llIlIIIIlIIl("etm3k1rIXSq14yUHmCBH1jlzCT3RalNc", "qtvBe");
        llllIlIII[llllIlIlI[30]] = llIlIIIIlIIl("CRakqAtWzoX0zfvvZk4JaA==", "VOTVl");
        llllIlIII[llllIlIlI[31]] = llIlIIIIIlll("JvUMDUxKsq/Ffj8/lyDbFBoVSLjPRVI0", "ZvJTk");
        llllIlIII[llllIlIlI[26]] = llIlIIIIIlll("pfz/6Fd6Wr2wEypmFS5KLg==", "cycij");
        llllIlIII[llllIlIlI[32]] = llIlIIIIIlll("BGkG6HLyqO4=", "cBujw");
        llllIlIII[llllIlIlI[37]] = llIlIIIIlIIl("4llyHXN9tvoCt1v1zlgv6UMnQJ+hcgJ1", "OLSOZ");
        llllIlIII[llllIlIlI[39]] = llIlIIIIlIIl("IXsiYLdXcKTRtEQrAoag5A==", "JcMSj");
        llllIlIII[llllIlIlI[40]] = llIlIIIIlIIl("4NoCyyzsQAU=", "mEHKq");
        llllIlIII[llllIlIlI[28]] = llIlIIIIlIII("FwQiEQo4", "PhMdm");
        llllIlIII[llllIlIlI[41]] = llIlIIIIlIIl("wlh39TmuNik3uLA/CYNeeQ==", "Mbdok");
        llllIlIII[llllIlIlI[42]] = llIlIIIIlIIl("5tdw3vCAA62CN//g2GbBx+8hb3Tmcldg", "cCKAb");
        llllIlIII[llllIlIlI[43]] = llIlIIIIlIII("FCkiZjY1aDcuIygkPSM=", "ZHTFB");
        llllIlIII[llllIlIlI[44]] = llIlIIIIlIII("LT8jBx0HMg==", "nWBuq");
        llllIlIII[llllIlIlI[2]] = llIlIIIIlIII("FDYQeAU1dwE0Hi8wDg==", "ZWfXq");
        llllIlIII[llllIlIlI[46]] = llIlIIIIlIIl("frIlIrme/nA=", "OrHAw");
        llllIlIII[llllIlIlI[47]] = llIlIIIIIlll("szc8mA1OfOo=", "dRxeG");
        llllIlIII[llllIlIlI[48]] = llIlIIIIIlll("JsqwGZM3RpRaqBcCJVBE3A==", "jcZra");
        llllIlIII[llllIlIlI[49]] = llIlIIIIlIII("EAMlPBQrRic7ByEHKzwT", "CfDNw");
        llllIlIII[llllIlIlI[38]] = llIlIIIIlIIl("ZzT379eEEv2pvyABQtl+Mg==", "XfQZF");
        llllIlIII[llllIlIlI[50]] = llIlIIIIIlll("LDPhqtwynvI=", "mkjBN");
        llllIlIII[llllIlIlI[51]] = llIlIIIIlIIl("8xEu58yIxRlT1EsxkFlZuQ==", "eNecJ");
        llllIlIII[llllIlIlI[52]] = llIlIIIIlIIl("MBtjFfh/cX8=", "KkRRg");
        llllIlIII[llllIlIlI[53]] = llIlIIIIlIIl("85TwrD9zkarqYskdXlVk9w==", "zRaYr");
        llllIlIII[llllIlIlI[54]] = llIlIIIIlIIl("AxopkOlJBlw=", "GWzFa");
        llllIlIII[llllIlIlI[55]] = llIlIIIIlIII("ByUDGDUlIhc=", "DPszZ");
        llllIlIII[llllIlIlI[56]] = llIlIIIIIlll("b8cdAxgy+rw=", "BIjMG");
        llllIlIII[llllIlIlI[58]] = llIlIIIIlIIl("auzEC2f4opk=", "QWvsT");
        llllIlIII[llllIlIlI[59]] = llIlIIIIlIII("EBY/Jgk/", "WzPSn");
        llllIlIII[llllIlIlI[36]] = llIlIIIIlIII("FhA3Fig8HQ==", "UxVdD");
        llllIlIII[llllIlIlI[63]] = llIlIIIIIlll("jDYcZIGcoir041GfwXzr/A==", "DgcRS");
        llllIlIII[llllIlIlI[64]] = llIlIIIIlIII("GS41AgMzIWUzECgrKg==", "ZOEvb");
        llllIlIII[llllIlIlI[66]] = llIlIIIIlIIl("ngpPoue8yVL6wBNYOK8C4g==", "DWjbG");
        llllIlIII[llllIlIlI[67]] = llIlIIIIIlll("0TX+ks7EzOA=", "LnvYJ");
        llllIlIII[llllIlIlI[68]] = llIlIIIIlIII("OBogDQ==", "wjEcO");
        llllIlIII[llllIlIlI[69]] = llIlIIIIlIIl("YcDt77DMiw/NASG9qj78uw==", "EKEzd");
        llllIlIII[llllIlIlI[70]] = llIlIIIIIlll("ytCemUbmzL4=", "ciLiv");
        llllIlIII[llllIlIlI[71]] = llIlIIIIlIII("FR44Nio/", "TjLWI");
        llllIlIII[llllIlIlI[73]] = llIlIIIIlIIl("mJ/Av7lNwxMVOJgk8hCL9Q==", "TtyDV");
        llllIlIII[llllIlIlI[22]] = llIlIIIIlIIl("lqtE8MNj33GPMEnJ4gYYPA==", "MrDmt");
        llllIlIII[llllIlIlI[74]] = llIlIIIIlIII("AyQMHQ==", "WEgxs");
        llllIlIII[llllIlIlI[75]] = llIlIIIIlIII("CycDKSk1cgE5KCIg", "GRnKL");
        llllIlIII[llllIlIlI[76]] = llIlIIIIlIIl("Gvixv2+kchITXHg281p7PQ==", "iWrMW");
        llllIlIII[llllIlIlI[77]] = llIlIIIIIlll("8CNLuRKLfrU=", "ptUfQ");
        llllIlIII[llllIlIlI[78]] = llIlIIIIlIIl("xNlEJCMCoGg=", "fhlmR");
        llllIlIII[llllIlIlI[79]] = llIlIIIIlIII("DTUIHAYz", "ATlxc");
        llllIlIII[llllIlIlI[80]] = llIlIIIIlIII("DBooNStiAzE=", "OvAXI");
        llllIlIII[llllIlIlI[81]] = llIlIIIIIlll("Xbll+I2kOOM=", "WHVia");
        llllIlIII[llllIlIlI[83]] = llIlIIIIlIIl("xSpPK+kVA3qLmKQ5D9OGxQ==", "YQTsO");
        llllIlIII[llllIlIlI[45]] = llIlIIIIIlll("8Wga2JJ0daX7byGVFIIbHA==", "dxPgP");
        llllIlIII[llllIlIlI[84]] = llIlIIIIIlll("YG1IDzIFqGM=", "pLtoD");
        llllIlIII[llllIlIlI[85]] = llIlIIIIlIII("CSMiGhdnKyQAGw==", "JOKwu");
        llllIlIII[llllIlIlI[88]] = llIlIIIIlIII("KTwdHBM=", "hRthr");
        llllIlIII[llllIlIlI[89]] = llIlIIIIlIII("JC4gLAcUOzIg", "wZAEu");
        llllIlIII[llllIlIlI[90]] = llIlIIIIlIIl("gf3qpDRzV5qAfuWNX3QSxg==", "GTKjZ");
        llllIlIII[llllIlIlI[91]] = llIlIIIIlIIl("SGr6a6qyFGlwKhQ2ds/8ZQ==", "ToYcK");
        llllIlIII[llllIlIlI[92]] = llIlIIIIlIIl("EwmmByOdzRoXDU2diyN6hA==", "uaeET");
        llllIlIII[llllIlIlI[93]] = llIlIIIIIlll("YmhTh0WSAH9G1hlVUwHIPg==", "EGsjb");
        llllIlIII[llllIlIlI[95]] = llIlIIIIlIII("NDIlByEEJzcL", "gFDnS");
        llllIlIII[llllIlIlI[57]] = llIlIIIIlIIl("N8W6cElr6a0/7UEklMSn+g==", "jdGaa");
        llllIlIII[llllIlIlI[96]] = llIlIIIIIlll("ovF1l0t5ICMCkOHvmHnnMA==", "dByYm");
        llllIlIII[llllIlIlI[97]] = llIlIIIIlIII("OQsqMCseRyYrKwkT", "zgECN");
        llllIlIII[llllIlIlI[98]] = llIlIIIIlIIl("66I9NNY4l7LwWaCou1ibRg==", "UjiQZ");
        llllIlIII[llllIlIlI[99]] = llIlIIIIlIIl("HXLIimShKgsedbxntk2jsw==", "QaCzd");
        llllIlIII[llllIlIlI[101]] = llIlIIIIlIII("Kw4nSwUKTyIfEBcb", "eoQkq");
        llllIlIII[llllIlIlI[102]] = llIlIIIIlIIl("PumHtKuLC6e8GEBR6KEzH4Y7i70reMSq", "qcwwx");
        llllIlIII[llllIlIlI[104]] = llIlIIIIIlll("/+Ukk136sjlU4EWdXd6DGQiEfu1kf19X", "IIzxw");
        llllIlIII[llllIlIlI[105]] = llIlIIIIIlll("ZtRD5vopRnmFxM2/ZX7b2w==", "WTmZm");
        llllIlIII[llllIlIlI[115]] = llIlIIIIlIII("NCFSESoEIA==", "sNruE");
        llllIlIII[llllIlIlI[62]] = llIlIIIIlIIl("HPTtNFcd/48/eh8nenapJg==", "pGaGR");
        llllIlIII[llllIlIlI[116]] = llIlIIIIIlll("pQF9DdlUXaMeHCdYkPJ9Jg==", "oxVqP");
        llllIlIII[llllIlIlI[117]] = llIlIIIIlIII("DQIwKQdvCjQnAyE=", "OnQJl");
        llllIlIII[llllIlIlI[120]] = llIlIIIIlIII("JiQYITE=", "bVqOZ");
        llllIlIII[llllIlIlI[121]] = llIlIIIIlIII("MBQFCw1SHAEFCRw=", "rxdhf");
        llllIlIII[llllIlIlI[122]] = llIlIIIIIlll("myW9OZOf6xU=", "fptYd");
        llllIlIII[llllIlIlI[124]] = llIlIIIIlIIl("ILggLG2cKNKW/8J9nAI27xbt8wD5k4bA", "jNNuS");
        llllIlIII[llllIlIlI[125]] = llIlIIIIlIIl("mXtAFmrHZR08oMIlMp8BBhUt9BTl8zs6", "yHOsH");
        llllIlIII[llllIlIlI[126]] = llIlIIIIlIII("PjMVAxkTM1YeGBk5", "zRvlw");
        llllIlIII[llllIlIlI[127]] = llIlIIIIIlll("DTLoQwfBkLYuVofhHn12lA==", "PbhCA");
        llllIlIII[llllIlIlI[72]] = llIlIIIIIlll("yC8XAjgdKG02DJGgRvAUOA==", "NBWNx");
        llllIlIII[llllIlIlI[128]] = llIlIIIIlIII("PQwiQRUcTT8IDxRNIQ8FFh8zEw4GAzA=", "smTaa");
        llllIlIII[llllIlIlI[129]] = llIlIIIIlIIl("LhyaTIhLgSIfKImscpZxKoKoUTKtk5GU", "FYpLI");
        llllIlIII[llllIlIlI[132]] = llIlIIIIIlll("JHReJlOPN6c=", "ocLsJ");
        llllIlIII[llllIlIlI[133]] = llIlIIIIlIII("CSAoEAAy", "ZEIbc");
        llllIlIII[llllIlIlI[135]] = llIlIIIIIlll("7rUXNaLEL5Y=", "OobXp");
        llllIlIII[llllIlIlI[136]] = llIlIIIIlIIl("a6/Onw9oo+g=", "oDkIK");
        llllIlIII[llllIlIlI[138]] = llIlIIIIIlll("tPNuQcptHHk=", "UlojI");
        llllIlIII[llllIlIlI[139]] = llIlIIIIIlll("C/AcDJF7hZw=", "TnhjZ");
        llllIlIII[llllIlIlI[141]] = llIlIIIIlIII("AwofBA==", "Qeppp");
        llllIlIII[llllIlIlI[82]] = llIlIIIIlIIl("CKXUSUXCtoQ=", "Rwlpu");
        llllIlIII[llllIlIlI[144]] = llIlIIIIlIIl("lw7FQMgx6hM=", "Bofoh");
        llllIlIII[llllIlIlI[145]] = llIlIIIIlIII("AgY5OjI5", "QcXHQ");
        llllIlIII[llllIlIlI[147]] = llIlIIIIlIIl("C0dC7HgC3Pw=", "VBROB");
        llllIlIII[llllIlIlI[148]] = llIlIIIIIlll("9GiOLFxoFkA=", "CPWnb");
        llllIlIII[llllIlIlI[151]] = llIlIIIIIlll("Q0Cy+aMqt5o=", "CvDLA");
        llllIlIII[llllIlIlI[152]] = llIlIIIIIlll("ZhGloke47pk=", "ITmJw");
        llllIlIII[llllIlIlI[155]] = llIlIIIIlIIl("vCGXm/v7dxU=", "gjFLD");
        llllIlIII[llllIlIlI[156]] = llIlIIIIIlll("2qFCk4uNwvY=", "xSMDv");
        llllIlIII[llllIlIlI[159]] = llIlIIIIlIIl("EzKIaIXVB1c=", "SzNEu");
        llllIlIII[llllIlIlI[100]] = llIlIIIIIlll("lir3qN/F7NE=", "EUnTD");
        llllIlIII[llllIlIlI[162]] = llIlIIIIIlll("PNwfU7t/keU=", "jQofs");
        llllIlIII[llllIlIlI[163]] = llIlIIIIlIII("PTMIEw4G", "nViam");
        llllIlIII[llllIlIlI[165]] = llIlIIIIlIII("OCQVHA==", "jKzhR");
        llllIlIII[llllIlIlI[166]] = llIlIIIIlIII("IgopFBcZ", "qoHft");
        llllIlIII[llllIlIlI[168]] = llIlIIIIlIIl("y011JmTBysU=", "DYmvQ");
        llllIlIII[llllIlIlI[169]] = llIlIIIIIlll("Rn+9xDfXF/4=", "SqjQC");
        llllIlIII[llllIlIlI[171]] = llIlIIIIlIIl("duOYwHjqqZM=", "cACne");
        llllIlIII[llllIlIlI[172]] = llIlIIIIlIIl("jkmtSiPSZ2U=", "lfWRl");
        llllIlIII[llllIlIlI[174]] = llIlIIIIIlll("T0jdAbd5Hgc=", "yFJbV");
        llllIlIII[llllIlIlI[103]] = llIlIIIIIlll("yJN+AGfPrMw=", "ulHDd");
        llllIlIII[llllIlIlI[177]] = llIlIIIIlIIl("AM1NI17t2cU=", "nFXif");
        llllIlIII[llllIlIlI[178]] = llIlIIIIIlll("0VXSXxGOJJw=", "TZIIv");
        llllIlIII[llllIlIlI[179]] = llIlIIIIlIII("IzE7CR4OMXgUHwQ7", "gPXfp");
        llllIlIII[llllIlIlI[187]] = llIlIIIIlIII("NBkdNnopFlMmPyccBzl6bg==", "FpsQZ");
        llllIlIII[llllIlIlI[200]] = llIlIIIIlIII("FTU8XQ==", "LPOsV");
        llllIlIII[llllIlIlI[201]] = llIlIIIIlIII("PBYSaQQAHAppAAoLFSASAVVHPh8EDUA6VxAJWA==", "eygIw");
        llllIlIII[llllIlIlI[202]] = llIlIIIIlIII("KnAyPQANO2YmBkI=", "cPFUi");
        llllIlIII[llllIlIlI[203]] = llIlIIIIlIII("E3kGDShyOgoBI3ItBEwrN3kcBTI6eR8EI3ISAgIhdSpLHyMzNUU=", "RYklF");
        llllIlIII[llllIlIlI[204]] = llIlIIIIlIIl("T4YWuNdr9cOkq0lv+8Nh/1nzA8981ZWY96CkuGB2Pc4=", "RDGOD");
        llllIlIII[llllIlIlI[114]] = llIlIIIIlIII("EQE2eDwxDD02ETFPIDcbOxxyLxE8A3IzETwDciwQNU8mKh01Tg==", "PoRXx");
        llllIlIII[llllIlIlI[205]] = llIlIIIIlIIl("//P4NF6QrN07zMYHu5FbHnBHbXD6DwrJ", "UiIrP");
        llllIlIII[llllIlIlI[206]] = llIlIIIIlIII("MjctEHILM2YBPUYdJwczCzwnVSIKMycGN0c=", "fVFuR");
        llllIlIII[llllIlIlI[207]] = llIlIIIIIlll("CXcMzHhr5/unx6bhdWwF6w==", "WByGJ");
        llllIlIII[llllIlIlI[208]] = llIlIIIIlIIl("QcQTv5t3rLk=", "AaClZ");
        llllIlIII[llllIlIlI[209]] = llIlIIIIlIIl("X2cQo12WuIg=", "InqwO");
        llllIlIII[llllIlIlI[210]] = llIlIIIIlIII("PxE8Yg==", "rxRLk");
        llllIlIII[llllIlIlI[211]] = llIlIIIIIlll("GcgFn0JORilJrSApKDwsVw==", "FQFKf");
        llllIlIII[llllIlIlI[212]] = llIlIIIIIlll("J/Jw1fnH7NY=", "ZUBKq");
    }

    private static boolean llIlIIlIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIlIIIlI(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v204, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v276, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v312, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v348, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v384, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v420, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v456, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v492, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v528, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v564, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v598, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    public static void bv() {
        if (llIlIIIlllII(ex ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[130], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3])) {
                Movement.walkTo(new WorldPoint(llllIlIlI[130], llllIlIlI[131], llllIlIlI[1]));
                "".length();
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[130], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr = new String[llllIlIlI[0]];
                    strArr[llllIlIlI[1]] = llllIlIII[llllIlIlI[132]];
                    TileObjects.getNearest(strArr).interact(llllIlIII[llllIlIlI[133]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    ex = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(ey ? 1 : 0) && llIlIIIllIlI(ex ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[60], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[60], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[60], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr2 = new String[llllIlIlI[0]];
                    strArr2[llllIlIlI[1]] = llllIlIII[llllIlIlI[135]];
                    TileObjects.getNearest(strArr2).interact(llllIlIII[llllIlIlI[136]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    ey = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(ez ? 1 : 0) && llIlIIIllIlI(ey ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[137], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[137], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[137], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr3 = new String[llllIlIlI[0]];
                    strArr3[llllIlIlI[1]] = llllIlIII[llllIlIlI[138]];
                    TileObjects.getNearest(strArr3).interact(llllIlIII[llllIlIlI[139]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    ez = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eA ? 1 : 0) && llIlIIIllIlI(ez ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[140], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[140], llllIlIlI[131], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[140], llllIlIlI[131], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr4 = new String[llllIlIlI[0]];
                    strArr4[llllIlIlI[1]] = llllIlIII[llllIlIlI[141]];
                    TileObjects.getNearest(strArr4).interact(llllIlIII[llllIlIlI[82]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eA = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eB ? 1 : 0) && llIlIIIllIlI(eA ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[142], llllIlIlI[143], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[142], llllIlIlI[143], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[142], llllIlIlI[143], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr5 = new String[llllIlIlI[0]];
                    strArr5[llllIlIlI[1]] = llllIlIII[llllIlIlI[144]];
                    TileObjects.getNearest(strArr5).interact(llllIlIII[llllIlIlI[145]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eB = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eC ? 1 : 0) && llIlIIIllIlI(eB ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[146], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[146], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[146], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr6 = new String[llllIlIlI[0]];
                    strArr6[llllIlIlI[1]] = llllIlIII[llllIlIlI[147]];
                    TileObjects.getNearest(strArr6).interact(llllIlIII[llllIlIlI[148]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eC = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eD ? 1 : 0) && llIlIIIllIlI(eC ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[149], llllIlIlI[150], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[149], llllIlIlI[150], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[149], llllIlIlI[150], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr7 = new String[llllIlIlI[0]];
                    strArr7[llllIlIlI[1]] = llllIlIII[llllIlIlI[151]];
                    TileObjects.getNearest(strArr7).interact(llllIlIII[llllIlIlI[152]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eD = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eE ? 1 : 0) && llIlIIIllIlI(eD ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[153], llllIlIlI[154], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[153], llllIlIlI[154], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[153], llllIlIlI[154], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr8 = new String[llllIlIlI[0]];
                    strArr8[llllIlIlI[1]] = llllIlIII[llllIlIlI[155]];
                    TileObjects.getNearest(strArr8).interact(llllIlIII[llllIlIlI[156]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eE = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eF ? 1 : 0) && llIlIIIllIlI(eE ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[157], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[157], llllIlIlI[158], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[157], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr9 = new String[llllIlIlI[0]];
                    strArr9[llllIlIlI[1]] = llllIlIII[llllIlIlI[159]];
                    TileObjects.getNearest(strArr9).interact(llllIlIII[llllIlIlI[100]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eF = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eG ? 1 : 0) && llIlIIIllIlI(eF ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[160], llllIlIlI[161], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[160], llllIlIlI[161], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[160], llllIlIlI[161], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr10 = new String[llllIlIlI[0]];
                    strArr10[llllIlIlI[1]] = llllIlIII[llllIlIlI[162]];
                    TileObjects.getNearest(strArr10).interact(llllIlIII[llllIlIlI[163]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eG = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eH ? 1 : 0) && llIlIIIllIlI(eG ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[164], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[164], llllIlIlI[158], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[164], llllIlIlI[158], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr11 = new String[llllIlIlI[0]];
                    strArr11[llllIlIlI[1]] = llllIlIII[llllIlIlI[165]];
                    TileObjects.getNearest(strArr11).interact(llllIlIII[llllIlIlI[166]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eH = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eI ? 1 : 0) && llIlIIIllIlI(eH ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[109], llllIlIlI[167], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[109], llllIlIlI[167], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[109], llllIlIlI[167], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr12 = new String[llllIlIlI[0]];
                    strArr12[llllIlIlI[1]] = llllIlIII[llllIlIlI[168]];
                    TileObjects.getNearest(strArr12).interact(llllIlIII[llllIlIlI[169]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eI = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eJ ? 1 : 0) && llIlIIIllIlI(eI ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[170], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[170], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[170], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr13 = new String[llllIlIlI[0]];
                    strArr13[llllIlIlI[1]] = llllIlIII[llllIlIlI[171]];
                    TileObjects.getNearest(strArr13).interact(llllIlIII[llllIlIlI[172]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eJ = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eK ? 1 : 0) && llIlIIIllIlI(eJ ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[173], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[173], llllIlIlI[134], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[173], llllIlIlI[134], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr14 = new String[llllIlIlI[0]];
                    strArr14[llllIlIlI[1]] = llllIlIII[llllIlIlI[174]];
                    TileObjects.getNearest(strArr14).interact(llllIlIII[llllIlIlI[103]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eK = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIlllII(eL ? 1 : 0) && llIlIIIllIlI(eK ? 1 : 0) && llIlIIIlllII(C0006g.M() ? 1 : 0)) {
            if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[175], llllIlIlI[176], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIllIlI(Movement.walkTo(new WorldPoint(llllIlIlI[175], llllIlIlI[176], llllIlIlI[1])) ? 1 : 0)) {
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlI[175], llllIlIlI[176], llllIlIlI[1])), llllIlIlI[3]) && llIlIIIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    String[] strArr15 = new String[llllIlIlI[0]];
                    strArr15[llllIlIlI[1]] = llllIlIII[llllIlIlI[177]];
                    TileObjects.getNearest(strArr15).interact(llllIlIII[llllIlIlI[178]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                    eL = llllIlIlI[0];
                }
                C0006g.a(cG);
            }
        }
        if (llIlIIIllIlI(eL ? 1 : 0)) {
            String[] strArr16 = new String[llllIlIlI[0]];
            strArr16[llllIlIlI[1]] = llllIlIII[llllIlIlI[179]];
            if (llIlIIIlllII(Inventory.contains(strArr16) ? 1 : 0)) {
                ex = llllIlIlI[1];
                ey = llllIlIlI[1];
                ez = llllIlIlI[1];
                eA = llllIlIlI[1];
                eB = llllIlIlI[1];
                eC = llllIlIlI[1];
                eD = llllIlIlI[1];
                eE = llllIlIlI[1];
                eF = llllIlIlI[1];
                eG = llllIlIlI[1];
                eH = llllIlIlI[1];
                eI = llllIlIlI[1];
                eJ = llllIlIlI[1];
                eK = llllIlIlI[1];
                eL = llllIlIlI[1];
            }
        }
    }

    private static boolean llIlIIlIIIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f1, code lost:
        if (llIlIIIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[181(0xb5, float:2.54E-43)]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x017b, code lost:
        if (llIlIIIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[10]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0204, code lost:
        if (llIlIIIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[12]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02c8, code lost:
        if (llIlIIIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[6]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIlIIIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[16]) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03dd  */
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
        int[] iArr8 = new int[llllIlIlI[0]];
        iArr8[llllIlIlI[1]] = llllIlIlI[15];
        if (llIlIIIllIlI(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llllIlIlI[0]];
            iArr9[llllIlIlI[1]] = llllIlIlI[15];
            if (llIlIIIllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llllIlIlI[0]];
                iArr10[llllIlIlI[1]] = llllIlIlI[15];
            }
            iArr = new int[llllIlIlI[0]];
            iArr[llllIlIlI[1]] = llllIlIlI[7];
            if (llIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[llllIlIlI[0]];
                iArr11[llllIlIlI[1]] = llllIlIlI[7];
                if (llIlIIIllIlI(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llllIlIlI[0]];
                    iArr12[llllIlIlI[1]] = llllIlIlI[7];
                }
                iArr2 = new int[llllIlIlI[0]];
                iArr2[llllIlIlI[1]] = llllIlIlI[9];
                if (llIlIIIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr13 = new int[llllIlIlI[0]];
                    iArr13[llllIlIlI[1]] = llllIlIlI[9];
                    if (llIlIIIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[llllIlIlI[0]];
                        iArr14[llllIlIlI[1]] = llllIlIlI[9];
                    }
                    iArr3 = new int[llllIlIlI[0]];
                    iArr3[llllIlIlI[1]] = llllIlIlI[11];
                    if (llIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr15 = new int[llllIlIlI[0]];
                        iArr15[llllIlIlI[1]] = llllIlIlI[11];
                        if (llIlIIIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[llllIlIlI[0]];
                            iArr16[llllIlIlI[1]] = llllIlIlI[11];
                        }
                        if (llIlIIIlllII(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(llllIlIII[llllIlIlI[187]]);
                        }) ? 1 : 0)) {
                            bx.add(new C0003d(llllIlIlI[182], llllIlIlI[12], llllIlIlI[183]));
                            "".length();
                        }
                        iArr4 = new int[llllIlIlI[0]];
                        iArr4[llllIlIlI[1]] = llllIlIlI[13];
                        if (llIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr17 = new int[llllIlIlI[0]];
                            iArr17[llllIlIlI[1]] = llllIlIlI[13];
                            if (llIlIIIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                                int[] iArr18 = new int[llllIlIlI[0]];
                                iArr18[llllIlIlI[1]] = llllIlIlI[13];
                            }
                            iArr5 = new int[llllIlIlI[0]];
                            iArr5[llllIlIlI[1]] = llllIlIlI[14];
                            if (llIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr19 = new int[llllIlIlI[0]];
                                iArr19[llllIlIlI[1]] = llllIlIlI[14];
                                if (llIlIIIllIll(Bank.getFirst(iArr19).getQuantity(), llllIlIlI[6])) {
                                    int i = llllIlIlI[14];
                                    int i2 = llllIlIlI[6];
                                    int[] iArr20 = new int[llllIlIlI[0]];
                                    iArr20[llllIlIlI[1]] = llllIlIlI[14];
                                    bx.add(new C0003d(i, i2 - Bank.getFirst(iArr20).getQuantity(), llllIlIlI[184]));
                                    "".length();
                                }
                            }
                            iArr6 = new int[llllIlIlI[0]];
                            iArr6[llllIlIlI[1]] = llllIlIlI[14];
                            if (llIlIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
                                bx.add(new C0003d(llllIlIlI[14], llllIlIlI[6], llllIlIlI[184]));
                                "".length();
                            }
                            iArr7 = new int[llllIlIlI[0]];
                            iArr7[llllIlIlI[1]] = llllIlIlI[17];
                            if (llIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr21 = new int[llllIlIlI[0]];
                                iArr21[llllIlIlI[1]] = llllIlIlI[17];
                                if (!llIlIIIllIlI(Bank.contains(iArr21) ? 1 : 0)) {
                                    return;
                                }
                                int[] iArr22 = new int[llllIlIlI[0]];
                                iArr22[llllIlIlI[1]] = llllIlIlI[17];
                                if (!llIlIIIllIll(Bank.getFirst(iArr22).getQuantity(), llllIlIlI[26])) {
                                    return;
                                }
                            }
                            bx.add(new C0003d(llllIlIlI[17], llllIlIlI[36], llllIlIlI[185]));
                            "".length();
                        }
                        bx.add(new C0003d(llllIlIlI[13], llllIlIlI[6], C0009j.ch));
                        "".length();
                        iArr5 = new int[llllIlIlI[0]];
                        iArr5[llllIlIlI[1]] = llllIlIlI[14];
                        if (llIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        iArr6 = new int[llllIlIlI[0]];
                        iArr6[llllIlIlI[1]] = llllIlIlI[14];
                        if (llIlIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        iArr7 = new int[llllIlIlI[0]];
                        iArr7[llllIlIlI[1]] = llllIlIlI[17];
                        if (llIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llllIlIlI[17], llllIlIlI[36], llllIlIlI[185]));
                        "".length();
                    }
                    bx.add(new C0003d(llllIlIlI[11], llllIlIlI[12], llllIlIlI[8]));
                    "".length();
                    if (llIlIIIlllII(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(llllIlIII[llllIlIlI[187]]);
                    }) ? 1 : 0)) {
                    }
                    iArr4 = new int[llllIlIlI[0]];
                    iArr4[llllIlIlI[1]] = llllIlIlI[13];
                    if (llIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llllIlIlI[13], llllIlIlI[6], C0009j.ch));
                    "".length();
                    iArr5 = new int[llllIlIlI[0]];
                    iArr5[llllIlIlI[1]] = llllIlIlI[14];
                    if (llIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[llllIlIlI[0]];
                    iArr6[llllIlIlI[1]] = llllIlIlI[14];
                    if (llIlIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    iArr7 = new int[llllIlIlI[0]];
                    iArr7[llllIlIlI[1]] = llllIlIlI[17];
                    if (llIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llllIlIlI[17], llllIlIlI[36], llllIlIlI[185]));
                    "".length();
                }
                bx.add(new C0003d(llllIlIlI[9], llllIlIlI[10], llllIlIlI[25]));
                "".length();
                iArr3 = new int[llllIlIlI[0]];
                iArr3[llllIlIlI[1]] = llllIlIlI[11];
                if (llIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bx.add(new C0003d(llllIlIlI[11], llllIlIlI[12], llllIlIlI[8]));
                "".length();
                if (llIlIIIlllII(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(llllIlIII[llllIlIlI[187]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[llllIlIlI[0]];
                iArr4[llllIlIlI[1]] = llllIlIlI[13];
                if (llIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bx.add(new C0003d(llllIlIlI[13], llllIlIlI[6], C0009j.ch));
                "".length();
                iArr5 = new int[llllIlIlI[0]];
                iArr5[llllIlIlI[1]] = llllIlIlI[14];
                if (llIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[llllIlIlI[0]];
                iArr6[llllIlIlI[1]] = llllIlIlI[14];
                if (llIlIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[llllIlIlI[0]];
                iArr7[llllIlIlI[1]] = llllIlIlI[17];
                if (llIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bx.add(new C0003d(llllIlIlI[17], llllIlIlI[36], llllIlIlI[185]));
                "".length();
            }
            bx.add(new C0003d(llllIlIlI[7], llllIlIlI[181], llllIlIlI[25]));
            "".length();
            iArr2 = new int[llllIlIlI[0]];
            iArr2[llllIlIlI[1]] = llllIlIlI[9];
            if (llIlIIIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bx.add(new C0003d(llllIlIlI[9], llllIlIlI[10], llllIlIlI[25]));
            "".length();
            iArr3 = new int[llllIlIlI[0]];
            iArr3[llllIlIlI[1]] = llllIlIlI[11];
            if (llIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bx.add(new C0003d(llllIlIlI[11], llllIlIlI[12], llllIlIlI[8]));
            "".length();
            if (llIlIIIlllII(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(llllIlIII[llllIlIlI[187]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[llllIlIlI[0]];
            iArr4[llllIlIlI[1]] = llllIlIlI[13];
            if (llIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bx.add(new C0003d(llllIlIlI[13], llllIlIlI[6], C0009j.ch));
            "".length();
            iArr5 = new int[llllIlIlI[0]];
            iArr5[llllIlIlI[1]] = llllIlIlI[14];
            if (llIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llllIlIlI[0]];
            iArr6[llllIlIlI[1]] = llllIlIlI[14];
            if (llIlIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[llllIlIlI[0]];
            iArr7[llllIlIlI[1]] = llllIlIlI[17];
            if (llIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bx.add(new C0003d(llllIlIlI[17], llllIlIlI[36], llllIlIlI[185]));
            "".length();
        }
        bx.add(new C0003d(llllIlIlI[15], llllIlIlI[16], C0004e.c(llllIlIlI[180], llllIlIlI[20])));
        "".length();
        iArr = new int[llllIlIlI[0]];
        iArr[llllIlIlI[1]] = llllIlIlI[7];
        if (llIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(llllIlIlI[7], llllIlIlI[181], llllIlIlI[25]));
        "".length();
        iArr2 = new int[llllIlIlI[0]];
        iArr2[llllIlIlI[1]] = llllIlIlI[9];
        if (llIlIIIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(llllIlIlI[9], llllIlIlI[10], llllIlIlI[25]));
        "".length();
        iArr3 = new int[llllIlIlI[0]];
        iArr3[llllIlIlI[1]] = llllIlIlI[11];
        if (llIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bx.add(new C0003d(llllIlIlI[11], llllIlIlI[12], llllIlIlI[8]));
        "".length();
        if (llIlIIIlllII(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(llllIlIII[llllIlIlI[187]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[llllIlIlI[0]];
        iArr4[llllIlIlI[1]] = llllIlIlI[13];
        if (llIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bx.add(new C0003d(llllIlIlI[13], llllIlIlI[6], C0009j.ch));
        "".length();
        iArr5 = new int[llllIlIlI[0]];
        iArr5[llllIlIlI[1]] = llllIlIlI[14];
        if (llIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llllIlIlI[0]];
        iArr6[llllIlIlI[1]] = llllIlIlI[14];
        if (llIlIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[llllIlIlI[0]];
        iArr7[llllIlIlI[1]] = llllIlIlI[17];
        if (llIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bx.add(new C0003d(llllIlIlI[17], llllIlIlI[36], llllIlIlI[185]));
        "".length();
    }

    private static String llIlIIIIlIII(String lIlllIlIlIIII, String lIlllIlIIllll) {
        String lIlllIlIlIIII2 = new String(Base64.getDecoder().decode(lIlllIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlllIlIIllIl = lIlllIlIIllll.toCharArray();
        int lIlllIlIIllII = llllIlIlI[1];
        char[] charArray = lIlllIlIlIIII2.toCharArray();
        int length = charArray.length;
        int i = llllIlIlI[1];
        while (llIlIIIllIll(i, length)) {
            sb.append((char) (charArray[i] ^ lIlllIlIIllIl[lIlllIlIIllII % lIlllIlIIllIl.length]));
            "".length();
            lIlllIlIIllII++;
            i++;
            "".length();
            if ((101 ^ 97) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIIlIIIII(int i, int i2) {
        return i > i2;
    }

    private static String llIlIIIIlIIl(String lIlllIllIIIII, String lIlllIlIlllll) {
        try {
            SecretKeySpec lIlllIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlIlllll.getBytes(StandardCharsets.UTF_8)), llllIlIlI[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIlI[3], lIlllIllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIllIIIIl) {
            lIlllIllIIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x09e8, code lost:
        if (llIlIIIllllI(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c9, code lost:
        if (llIlIIIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[8]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020c, code lost:
        if (llIlIIIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[10]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024f, code lost:
        if (llIlIIIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[12]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0292, code lost:
        if (llIlIIIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[6]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02d5, code lost:
        if (llIlIIIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[6]) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0318, code lost:
        if (llIlIIIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[16]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x031b, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIII[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[12]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C.llllIlIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0336, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1012, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1045, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1082, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bu() {
        if (llIlIIIllIlI(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (llIlIIIllIll(bx.size(), llllIlIlI[0])) {
                System.out.println(llllIlIII[llllIlIlI[1]]);
                bv = llllIlIlI[1];
            }
        }
        if (llIlIIIlllII(bv ? 1 : 0)) {
            if (llIlIIIllIll(Skills.getLevel(Skill.AGILITY), llllIlIlI[2])) {
                dc = llllIlIII[llllIlIlI[0]];
                al.dT();
            }
            if (llIlIIIlllII(an() ? 1 : 0) && llIlIIIllIll(C0004e.j(ew), llllIlIlI[0]) && llIlIIIlllIl(Skills.getLevel(Skill.AGILITY), llllIlIlI[2])) {
                dc = llllIlIII[llllIlIlI[3]];
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIIIllllI(nearest) && llIlIIIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[4]];
                    C0000a.a(nearest);
                }
                if (llIlIIIllllI(nearest) && llIlIIIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlIIIlllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIlIlI[5]);
                        "".length();
                    }
                    if (llIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[6]];
                        if (llIlIIIlllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIlIlI[6]);
                            "".length();
                        }
                        if (llIlIIIlllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIlIlI[3]);
                            "".length();
                        }
                        while (llIlIIIlllII(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                            "".length();
                            if ("  ".length() > "   ".length()) {
                                return;
                            }
                        }
                        int[] iArr = new int[llllIlIlI[0]];
                        iArr[llllIlIlI[1]] = llllIlIlI[7];
                        if (llIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llllIlIlI[0]];
                            iArr2[llllIlIlI[1]] = llllIlIlI[7];
                        }
                        int[] iArr3 = new int[llllIlIlI[0]];
                        iArr3[llllIlIlI[1]] = llllIlIlI[9];
                        if (llIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llllIlIlI[0]];
                            iArr4[llllIlIlI[1]] = llllIlIlI[9];
                        }
                        int[] iArr5 = new int[llllIlIlI[0]];
                        iArr5[llllIlIlI[1]] = llllIlIlI[11];
                        if (llIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llllIlIlI[0]];
                            iArr6[llllIlIlI[1]] = llllIlIlI[11];
                        }
                        int[] iArr7 = new int[llllIlIlI[0]];
                        iArr7[llllIlIlI[1]] = llllIlIlI[13];
                        if (llIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llllIlIlI[0]];
                            iArr8[llllIlIlI[1]] = llllIlIlI[13];
                        }
                        int[] iArr9 = new int[llllIlIlI[0]];
                        iArr9[llllIlIlI[1]] = llllIlIlI[14];
                        if (llIlIIIllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llllIlIlI[0]];
                            iArr10[llllIlIlI[1]] = llllIlIlI[14];
                        }
                        int[] iArr11 = new int[llllIlIlI[0]];
                        iArr11[llllIlIlI[1]] = llllIlIlI[15];
                        if (llIlIIIllIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllIlIlI[0]];
                            iArr12[llllIlIlI[1]] = llllIlIlI[15];
                        }
                        int[] iArr13 = new int[llllIlIlI[6]];
                        iArr13[llllIlIlI[1]] = llllIlIlI[17];
                        iArr13[llllIlIlI[0]] = llllIlIlI[11];
                        iArr13[llllIlIlI[3]] = llllIlIlI[13];
                        iArr13[llllIlIlI[4]] = llllIlIlI[18];
                        if (llIlIIIlllII(C0004e.d(iArr13) ? 1 : 0)) {
                            Q();
                            System.out.println(llllIlIII[llllIlIlI[19]]);
                            bv = llllIlIlI[0];
                            return;
                        }
                        if (llIlIIIlllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llllIlIlI[19]);
                            "".length();
                        }
                        int[] iArr14 = new int[llllIlIlI[6]];
                        iArr14[llllIlIlI[1]] = llllIlIlI[17];
                        iArr14[llllIlIlI[0]] = llllIlIlI[11];
                        iArr14[llllIlIlI[3]] = llllIlIlI[13];
                        iArr14[llllIlIlI[4]] = llllIlIlI[18];
                        if (llIlIIIllIlI(C0004e.d(iArr14) ? 1 : 0)) {
                            C0000a.a(llllIlIlI[17], llllIlIlI[16]);
                            C0000a.a(llllIlIlI[13], llllIlIlI[4]);
                            Bank.withdraw(llllIlIlI[18], llllIlIlI[5], Bank.WithdrawMode.ITEM);
                            Bank.withdraw(llllIlIlI[11], llllIlIlI[0], Bank.WithdrawMode.ITEM);
                            Bank.withdraw(llllIlIlI[14], llllIlIlI[6], Bank.WithdrawMode.ITEM);
                            C0000a.a(llllIlIlI[15], llllIlIlI[12]);
                            int[] iArr15 = new int[llllIlIlI[0]];
                            iArr15[llllIlIlI[1]] = llllIlIlI[9];
                            if (llIlIIIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                                int[] iArr16 = new int[llllIlIlI[0]];
                                iArr16[llllIlIlI[1]] = llllIlIlI[9];
                                if (llIlIIIllIll(Inventory.getCount(iArr16), llllIlIlI[0])) {
                                    Bank.withdraw(llllIlIlI[9], llllIlIlI[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIlIlI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr17 = new int[llllIlIlI[0]];
                                        iArr17[llllIlIlI[1]] = llllIlIlI[9];
                                        if (llIlIIIlllll(Inventory.getCount(iArr17))) {
                                            ?? r0 = llllIlIlI[0];
                                            "".length();
                                            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllIlIlI[1];
                                    }, llllIlIlI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr17 = new int[llllIlIlI[0]];
                            iArr17[llllIlIlI[1]] = llllIlIlI[7];
                            if (llIlIIIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                                int[] iArr18 = new int[llllIlIlI[0]];
                                iArr18[llllIlIlI[1]] = llllIlIlI[7];
                                if (llIlIIIllIll(Inventory.getCount(iArr18), llllIlIlI[0])) {
                                    Bank.withdraw(llllIlIlI[7], llllIlIlI[21], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIlIlI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr19 = new int[llllIlIlI[0]];
                                        iArr19[llllIlIlI[1]] = llllIlIlI[7];
                                        if (llIlIIIlllll(Inventory.getCount(iArr19))) {
                                            ?? r0 = llllIlIlI[0];
                                            "".length();
                                            return (-(" ".length() ^ (5 ^ 0))) > 0 ? ((((71 + 48) - 19) + 50) ^ (((36 + 1) - (-28)) + 81)) & (((((81 + 46) - 108) + 127) ^ (((35 + 133) - 71) + 53)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIlIlI[1];
                                    }, llllIlIlI[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (llIlIIIllIlI(Inventory.contains(C0005f.bc) ? 1 : 0) && llIlIIIllIll(Movement.getRunEnergy(), llllIlIlI[22])) {
                Inventory.getFirst(C0005f.bc).interact(llllIlIII[llllIlIlI[23]]);
                Time.sleepTicks(llllIlIlI[0]);
                "".length();
            }
            if (llIlIIIlllIl(Combat.getMissingHealth(), llllIlIlI[24])) {
                int[] iArr19 = new int[llllIlIlI[0]];
                iArr19[llllIlIlI[1]] = llllIlIlI[15];
                if (llIlIIIllIlI(Inventory.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[llllIlIlI[0]];
                    iArr20[llllIlIlI[1]] = llllIlIlI[15];
                    Inventory.getFirst(iArr20).interact(llllIlIII[llllIlIlI[25]]);
                    Time.sleepTicks(llllIlIlI[3]);
                    "".length();
                }
            }
            if (llIlIIIllIlI(an() ? 1 : 0) && llIlIIIlllII(C0004e.j(ew))) {
                C0007h.X();
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[27]];
                    if (llIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(ev);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (!llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    C0006g.a(llllIlIII[llllIlIlI[16]], cG);
                }
            }
            if (!llIlIIlIIIlI(C0004e.j(ew), llllIlIlI[16]) || llIlIIlIIIll(C0004e.j(ew), llllIlIlI[28])) {
                String[] strArr = new String[llllIlIlI[0]];
                strArr[llllIlIlI[1]] = llllIlIII[llllIlIlI[29]];
                if (llIlIIIlllII(Inventory.contains(strArr) ? 1 : 0)) {
                    if (!llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[4]) || (llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0]) && llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[4]))) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[24]];
                        Movement.walkTo(en);
                        "".length();
                        Time.sleepTicks(llllIlIlI[0]);
                        "".length();
                    }
                    if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[4]) && llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        C0006g.a(llllIlIII[llllIlIlI[30]], cG);
                    }
                }
                String[] strArr2 = new String[llllIlIlI[0]];
                strArr2[llllIlIlI[1]] = llllIlIII[llllIlIlI[31]];
                if (llIlIIIllIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                    if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[26]];
                        if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[28])) {
                            int[] iArr21 = new int[llllIlIlI[0]];
                            iArr21[llllIlIlI[1]] = llllIlIlI[17];
                            Inventory.getFirst(iArr21).interact(llllIlIII[llllIlIlI[32]]);
                            Time.sleepTicks(llllIlIlI[12]);
                            "".length();
                        }
                        WorldPoint worldPoint = new WorldPoint(llllIlIlI[33], llllIlIlI[34], llllIlIlI[1]);
                        if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(C0001b.K), llllIlIlI[35]) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIlIlI[25])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                        if ((!llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIlIlI[25]) || llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[35])) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(en), llllIlIlI[36])) {
                            Movement.walkTo(em);
                            "".length();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                    }
                    if (!llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                        C0006g.a(llllIlIII[llllIlIlI[37]], cG);
                    }
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[38])) {
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23]) && llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[39]];
                    Movement.walkTo(eo);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[26])) {
                    String[] strArr3 = new String[llllIlIlI[0]];
                    strArr3[llllIlIlI[1]] = llllIlIII[llllIlIlI[40]];
                }
                C0006g.a(llllIlIII[llllIlIlI[28]], cG);
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[36])) {
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[41]];
                    Movement.walkTo(ev);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (!llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    C0006g.a(llllIlIII[llllIlIlI[42]], cG);
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[22])) {
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[43]];
                    Movement.walkTo(ep);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                    C0006g.a(llllIlIII[llllIlIlI[44]], cG);
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[45])) {
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23]) && llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[2]];
                    Movement.walkTo(eo);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (!llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0]) || llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23])) {
                    String[] strArr4 = new String[llllIlIlI[0]];
                    strArr4[llllIlIlI[1]] = llllIlIII[llllIlIlI[46]];
                    if (llIlIIIllllI(TileObjects.getNearest(strArr4))) {
                        String[] strArr5 = new String[llllIlIlI[0]];
                        strArr5[llllIlIlI[1]] = llllIlIII[llllIlIlI[47]];
                        TileObjects.getNearest(strArr5).interact(llllIlIII[llllIlIlI[48]]);
                        Time.sleepTicks(llllIlIlI[0]);
                        "".length();
                    }
                }
                if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[23])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[49]];
                    String[] strArr6 = new String[llllIlIlI[0]];
                    strArr6[llllIlIlI[1]] = llllIlIII[llllIlIlI[38]];
                    TileObject nearest2 = TileObjects.getNearest(strArr6);
                    String[] strArr7 = new String[llllIlIlI[0]];
                    strArr7[llllIlIlI[1]] = llllIlIII[llllIlIlI[50]];
                    if (llIlIIIllIlI(nearest2.hasAction(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[llllIlIlI[0]];
                        strArr8[llllIlIlI[1]] = llllIlIII[llllIlIlI[51]];
                        TileObjects.getNearest(strArr8).interact(llllIlIII[llllIlIlI[52]]);
                        Time.sleepTicks(llllIlIlI[4]);
                        "".length();
                    }
                    String[] strArr9 = new String[llllIlIlI[0]];
                    strArr9[llllIlIlI[1]] = llllIlIII[llllIlIlI[53]];
                    TileObject nearest3 = TileObjects.getNearest(strArr9);
                    String[] strArr10 = new String[llllIlIlI[0]];
                    strArr10[llllIlIlI[1]] = llllIlIII[llllIlIlI[54]];
                    if (llIlIIIllIlI(nearest3.hasAction(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[llllIlIlI[0]];
                        strArr11[llllIlIlI[1]] = llllIlIII[llllIlIlI[55]];
                        TileObjects.getNearest(strArr11).interact(llllIlIII[llllIlIlI[56]]);
                        Time.sleepTicks(llllIlIlI[4]);
                        "".length();
                    }
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[57])) {
                AccBuilderGWD.c = llllIlIII[llllIlIlI[58]];
                C0006g.a(llllIlIII[llllIlIlI[59]], cG);
                if (llIlIIIllIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllIlIlI[60], llllIlIlI[61], llllIlIlI[4])) ? 1 : 0)) {
                    C0006g.a(llllIlIII[llllIlIlI[36]], cG);
                }
                C0006g.a(cG);
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[62])) {
                if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[28])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[63]];
                    C0006g.a(llllIlIII[llllIlIlI[64]], cG);
                }
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[28])) {
                    if (llIlIIIllIll(Players.getLocal().getWorldLocation().getX(), llllIlIlI[65])) {
                        if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eq), llllIlIlI[4])) {
                            AccBuilderGWD.c = llllIlIII[llllIlIlI[66]];
                            Movement.walkTo(eq);
                            "".length();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                        if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eq), llllIlIlI[4])) {
                            if (llIlIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr12 = new String[llllIlIlI[0]];
                                strArr12[llllIlIlI[1]] = llllIlIII[llllIlIlI[67]];
                                TileObjects.getNearest(strArr12).interact(llllIlIII[llllIlIlI[68]]);
                                Time.sleepTicks(llllIlIlI[4]);
                                "".length();
                            }
                            C0006g.a(cG);
                        }
                    }
                    if (llIlIIIlllIl(Players.getLocal().getWorldLocation().getX(), llllIlIlI[65])) {
                        if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[19])) {
                            AccBuilderGWD.c = llllIlIII[llllIlIlI[69]];
                            Movement.walkTo(er);
                            "".length();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                        if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[19])) {
                            if (llIlIIIlllII(C0012m.ap() ? 1 : 0)) {
                                C0012m.aq();
                            }
                            if (llIlIIlIIlII(Players.getLocal().getInteracting())) {
                                String[] strArr13 = new String[llllIlIlI[0]];
                                strArr13[llllIlIlI[1]] = llllIlIII[llllIlIlI[70]];
                                NPCs.getNearest(strArr13).interact(llllIlIII[llllIlIlI[71]]);
                                Time.sleepTicks(llllIlIlI[0]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[72])) {
                String[] strArr14 = new String[llllIlIlI[0]];
                strArr14[llllIlIlI[1]] = llllIlIII[llllIlIlI[73]];
                if (llIlIIIlllII(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[llllIlIlI[0]];
                    strArr15[llllIlIlI[1]] = llllIlIII[llllIlIlI[22]];
                    TileItems.getNearest(strArr15).interact(llllIlIII[llllIlIlI[74]]);
                    Time.sleepTicks(llllIlIlI[6]);
                    "".length();
                }
                String[] strArr16 = new String[llllIlIlI[0]];
                strArr16[llllIlIlI[1]] = llllIlIII[llllIlIlI[75]];
                if (llIlIIIllIlI(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[76]];
                        WorldPoint worldPoint2 = new WorldPoint(llllIlIlI[33], llllIlIlI[34], llllIlIlI[1]);
                        if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[28])) {
                            int[] iArr22 = new int[llllIlIlI[0]];
                            iArr22[llllIlIlI[1]] = llllIlIlI[17];
                            Inventory.getFirst(iArr22).interact(llllIlIII[llllIlIlI[77]]);
                            Time.sleepTicks(llllIlIlI[12]);
                            "".length();
                        }
                        if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(C0001b.K), llllIlIlI[35]) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIlIlI[25])) {
                            Movement.walkTo(worldPoint2);
                            "".length();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                        if ((!llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIlIlI[25]) || llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[35])) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(er), llllIlIlI[36])) {
                            Movement.walkTo(ep);
                            "".length();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                        if (!llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[3]) || llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                            String[] strArr17 = new String[llllIlIlI[0]];
                            strArr17[llllIlIlI[1]] = llllIlIII[llllIlIlI[78]];
                            if (llIlIIIllllI(TileObjects.getNearest(strArr17))) {
                                String[] strArr18 = new String[llllIlIlI[0]];
                                strArr18[llllIlIlI[1]] = llllIlIII[llllIlIlI[79]];
                                TileObjects.getNearest(strArr18).interact(llllIlIII[llllIlIlI[80]]);
                                Time.sleepTicks(llllIlIlI[4]);
                                "".length();
                            }
                        }
                    }
                    if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), llllIlIlI[4]) && llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4])) {
                        C0006g.a(llllIlIII[llllIlIlI[81]], cG);
                    }
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[82])) {
                String[] strArr19 = new String[llllIlIlI[0]];
                strArr19[llllIlIlI[1]] = llllIlIII[llllIlIlI[83]];
                if (llIlIIIlllII(Inventory.contains(strArr19) ? 1 : 0)) {
                    if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(es), llllIlIlI[12])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[45]];
                        if (!llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[4]) || !llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[3]) || llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                            String[] strArr20 = new String[llllIlIlI[0]];
                            strArr20[llllIlIlI[1]] = llllIlIII[llllIlIlI[84]];
                            TileObjects.getNearest(strArr20).interact(llllIlIII[llllIlIlI[85]]);
                            Time.sleepTicks(llllIlIlI[4]);
                            "".length();
                        }
                        if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[12])) {
                            Movement.walkTo(new WorldPoint(llllIlIlI[86], llllIlIlI[87], llllIlIlI[1]));
                            "".length();
                        }
                        if (llIlIIIlllII(Players.getLocal().getWorldLocation().getPlane()) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[12])) {
                            Movement.walkTo(es);
                            "".length();
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                    }
                    if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), llllIlIlI[12])) {
                        C0006g.a(llllIlIII[llllIlIlI[88]], cG);
                        if (llIlIIIlllII(Players.getLocal().getWorldLocation().getPlane())) {
                            String[] strArr21 = new String[llllIlIlI[0]];
                            strArr21[llllIlIlI[1]] = llllIlIII[llllIlIlI[89]];
                            TileObjects.getNearest(strArr21).interact(llllIlIII[llllIlIlI[90]]);
                            Time.sleepTicks(llllIlIlI[3]);
                            "".length();
                        }
                    }
                }
                String[] strArr22 = new String[llllIlIlI[0]];
                strArr22[llllIlIlI[1]] = llllIlIII[llllIlIlI[91]];
                if (llIlIIIllIlI(Inventory.contains(strArr22) ? 1 : 0)) {
                    if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), llllIlIlI[12]) && llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        String[] strArr23 = new String[llllIlIlI[0]];
                        strArr23[llllIlIlI[1]] = llllIlIII[llllIlIlI[92]];
                        TileObjects.getNearest(strArr23).interact(llllIlIII[llllIlIlI[93]]);
                        Time.sleepTicks(llllIlIlI[3]);
                        "".length();
                    }
                    if (llIlIIIllIlI(new WorldArea(llllIlIlI[94], llllIlIlI[87], llllIlIlI[37], llllIlIlI[2], llllIlIlI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr24 = new String[llllIlIlI[0]];
                        strArr24[llllIlIlI[1]] = llllIlIII[llllIlIlI[95]];
                        TileObjects.getNearest(strArr24).interact(llllIlIII[llllIlIlI[57]]);
                        Time.sleepTicks(llllIlIlI[3]);
                        "".length();
                    }
                    if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[24]) && llIlIIlIIIlI(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[96]];
                        Movement.walkTo(eo);
                        "".length();
                        Time.sleepTicks(llllIlIlI[0]);
                        "".length();
                    }
                    if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eo), llllIlIlI[24]) && llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[0])) {
                        String[] strArr25 = new String[llllIlIlI[0]];
                        strArr25[llllIlIlI[1]] = llllIlIII[llllIlIlI[97]];
                        if (llIlIIIllllI(TileObjects.getNearest(strArr25))) {
                            String[] strArr26 = new String[llllIlIlI[0]];
                            strArr26[llllIlIlI[1]] = llllIlIII[llllIlIlI[98]];
                            Item first = Inventory.getFirst(strArr26);
                            String[] strArr27 = new String[llllIlIlI[0]];
                            strArr27[llllIlIlI[1]] = llllIlIII[llllIlIlI[99]];
                            first.useOn(TileObjects.getNearest(strArr27));
                            Time.sleepTicks(llllIlIlI[4]);
                            "".length();
                        }
                    }
                    C0006g.a(cG);
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[100])) {
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) && llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[101]];
                    Movement.walkTo(ev);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (!llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(em), llllIlIlI[4]) || llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[26])) {
                    C0006g.a(llllIlIII[llllIlIlI[102]], cG);
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[103])) {
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(eu), llllIlIlI[12])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[104]];
                    Movement.walkTo(eu);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), llllIlIlI[12])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[105]];
                    int[] iArr23 = new int[llllIlIlI[0]];
                    iArr23[llllIlIlI[1]] = llllIlIlI[106];
                    if (llIlIIIllIlI(Inventory.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[llllIlIlI[0]];
                        iArr24[llllIlIlI[1]] = llllIlIlI[106];
                        Item first2 = Inventory.getFirst(iArr24);
                        int[] iArr25 = new int[llllIlIlI[0]];
                        iArr25[llllIlIlI[1]] = llllIlIlI[107];
                        first2.useOn(TileObjects.getNearest(iArr25));
                        Time.sleepTicks(llllIlIlI[4]);
                        "".length();
                    }
                    int[] iArr26 = new int[llllIlIlI[0]];
                    iArr26[llllIlIlI[1]] = llllIlIlI[108];
                    if (llIlIIIllIlI(Inventory.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[llllIlIlI[0]];
                        iArr27[llllIlIlI[1]] = llllIlIlI[108];
                        Item first3 = Inventory.getFirst(iArr27);
                        int[] iArr28 = new int[llllIlIlI[0]];
                        iArr28[llllIlIlI[1]] = llllIlIlI[109];
                        first3.useOn(TileObjects.getNearest(iArr28));
                        Time.sleepTicks(llllIlIlI[4]);
                        "".length();
                    }
                    int[] iArr29 = new int[llllIlIlI[0]];
                    iArr29[llllIlIlI[1]] = llllIlIlI[110];
                    if (llIlIIIllIlI(Inventory.contains(iArr29) ? 1 : 0)) {
                        int[] iArr30 = new int[llllIlIlI[0]];
                        iArr30[llllIlIlI[1]] = llllIlIlI[110];
                        Item first4 = Inventory.getFirst(iArr30);
                        int[] iArr31 = new int[llllIlIlI[0]];
                        iArr31[llllIlIlI[1]] = llllIlIlI[111];
                        first4.useOn(TileObjects.getNearest(iArr31));
                        Time.sleepTicks(llllIlIlI[4]);
                        "".length();
                    }
                    int[] iArr32 = new int[llllIlIlI[0]];
                    iArr32[llllIlIlI[1]] = llllIlIlI[112];
                    if (llIlIIIllIlI(Inventory.contains(iArr32) ? 1 : 0)) {
                        int[] iArr33 = new int[llllIlIlI[0]];
                        iArr33[llllIlIlI[1]] = llllIlIlI[112];
                        Item first5 = Inventory.getFirst(iArr33);
                        int[] iArr34 = new int[llllIlIlI[0]];
                        iArr34[llllIlIlI[1]] = llllIlIlI[113];
                        first5.useOn(TileObjects.getNearest(iArr34));
                        Time.sleepTicks(llllIlIlI[4]);
                        "".length();
                    }
                }
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[114])) {
                if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), llllIlIlI[12]) && llIlIIlIIIll(Players.getLocal().getWorldLocation().getPlane(), llllIlIlI[3])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[115]];
                    String[] strArr28 = new String[llllIlIlI[0]];
                    strArr28[llllIlIlI[1]] = llllIlIII[llllIlIlI[62]];
                    TileObjects.getNearest(strArr28).interact(llllIlIII[llllIlIlI[116]]);
                    Time.sleepTicks(llllIlIlI[4]);
                    "".length();
                }
                String[] strArr29 = new String[llllIlIlI[0]];
                strArr29[llllIlIlI[1]] = llllIlIII[llllIlIlI[117]];
                if (llIlIIIllllI(NPCs.getNearest(strArr29))) {
                    WorldPoint worldPoint3 = new WorldPoint(llllIlIlI[118], llllIlIlI[119], llllIlIlI[1]);
                    if (llIlIIIlllII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                        Movement.walkTo(worldPoint3);
                        "".length();
                        Time.sleepTicks(llllIlIlI[0]);
                        "".length();
                    }
                    if (llIlIIIlllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && llIlIIIlllll(Prayers.getPoints()) && llIlIIIlllIl(Skills.getLevel(Skill.PRAYER), llllIlIlI[66])) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (llIlIIIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                        if (llIlIIIlllII(C0012m.ap() ? 1 : 0)) {
                            C0012m.aq();
                        }
                        if (llIlIIIllIll(Prayers.getPoints(), llllIlIlI[43]) && llIlIIIllIlI(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aZ).interact(llllIlIII[llllIlIlI[120]]);
                            Time.sleepTicks(llllIlIlI[0]);
                            "".length();
                        }
                        if (llIlIIlIIlII(Players.getLocal().getInteracting())) {
                            String[] strArr30 = new String[llllIlIlI[0]];
                            strArr30[llllIlIlI[1]] = llllIlIII[llllIlIlI[121]];
                            NPCs.getNearest(strArr30).interact(llllIlIII[llllIlIlI[122]]);
                            Time.sleepTicks(llllIlIlI[3]);
                            "".length();
                        }
                    }
                }
                C0006g.a(cG);
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[123])) {
                if (llIlIIIllIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[124]];
                    Movement.walkTo(ev);
                    "".length();
                    Time.sleepTicks(llllIlIlI[0]);
                    "".length();
                }
                if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                    C0006g.a(llllIlIII[llllIlIlI[125]], cG);
                }
                C0006g.a(cG);
            }
            if (llIlIIlIIIll(C0004e.j(ew), llllIlIlI[35])) {
                String[] strArr31 = new String[llllIlIlI[0]];
                strArr31[llllIlIlI[1]] = llllIlIII[llllIlIlI[126]];
                if (llIlIIIlllII(Inventory.contains(strArr31) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIlIII[llllIlIlI[127]];
                    bv();
                }
                String[] strArr32 = new String[llllIlIlI[0]];
                strArr32[llllIlIlI[1]] = llllIlIII[llllIlIlI[72]];
                if (llIlIIIllIlI(Inventory.contains(strArr32) ? 1 : 0)) {
                    if (llIlIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                        AccBuilderGWD.c = llllIlIII[llllIlIlI[128]];
                        Movement.walkTo(ev);
                        "".length();
                        Time.sleepTicks(llllIlIlI[0]);
                        "".length();
                    }
                    if (llIlIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ev), llllIlIlI[6])) {
                        if (llIlIIIllIll(dk, llllIlIlI[0])) {
                            as.no += llllIlIlI[0];
                            as.u(AccBuilderGWD.m);
                            dk += llllIlIlI[0];
                            as.no = llllIlIlI[1];
                        }
                        C0006g.a(llllIlIII[llllIlIlI[129]], cG);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llllIlIlI[6]];
        iArr[llllIlIlI[1]] = llllIlIlI[17];
        iArr[llllIlIlI[0]] = llllIlIlI[11];
        iArr[llllIlIlI[3]] = llllIlIlI[13];
        iArr[llllIlIlI[4]] = llllIlIlI[18];
        int i = llllIlIlI[1];
        while (llIlIIIllIll(i, iArr.length)) {
            int[] iArr2 = new int[llllIlIlI[0]];
            iArr2[llllIlIlI[1]] = iArr[i];
            if (llIlIIIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllIlIlI[1];
            }
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllIlIlI[0];
    }
}
