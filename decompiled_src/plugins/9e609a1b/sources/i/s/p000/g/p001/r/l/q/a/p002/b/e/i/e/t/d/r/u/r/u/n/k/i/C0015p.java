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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/p.class */
public class C0015p implements M {
    private static final /* synthetic */ int eq;
    private static final /* synthetic */ WorldPoint eD;
    static /* synthetic */ String fa;
    private static final /* synthetic */ WorldPoint ez;
    private static final /* synthetic */ int ep;
    private static /* synthetic */ String[] lIIlIIIIIlllI;
    private static final /* synthetic */ int eT;
    private static final /* synthetic */ int eu;
    private static final /* synthetic */ WorldPoint eG;
    public static final /* synthetic */ WorldArea eg;
    private static final /* synthetic */ int em;
    private static final /* synthetic */ WorldPoint ev;
    private static final /* synthetic */ WorldPoint eB;
    private static final /* synthetic */ WorldPoint eE;
    public static final /* synthetic */ WorldArea ed;
    private static final /* synthetic */ int eP;
    private static final /* synthetic */ int eR;
    private static final /* synthetic */ WorldPoint eJ;
    private static final /* synthetic */ WorldArea eN;
    public static final /* synthetic */ WorldArea eh;
    private static final /* synthetic */ int eU;
    private static final /* synthetic */ int eo;
    private static final /* synthetic */ int et;
    private static final /* synthetic */ WorldPoint eC;
    static /* synthetic */ boolean cp;
    private static final /* synthetic */ WorldPoint ex;
    public static final /* synthetic */ WorldArea ec;
    private static final /* synthetic */ WorldArea eL;
    private static final /* synthetic */ int ej;
    public static final /* synthetic */ WorldPoint dZ;
    private static final /* synthetic */ int eX;
    public static /* synthetic */ int eZ;
    private static final /* synthetic */ int en;
    public static final /* synthetic */ WorldArea eb;
    private static final /* synthetic */ int ek;
    public static final /* synthetic */ WorldPoint dY;
    private static final /* synthetic */ WorldArea eM;
    private static /* synthetic */ int[] lIIlIIIIIllll;
    private static final /* synthetic */ WorldPoint eF;
    private static final /* synthetic */ WorldPoint eH;
    public static final /* synthetic */ WorldPoint dX;
    private static final /* synthetic */ int eO;
    static /* synthetic */ String[] dP;
    private static final /* synthetic */ int ei;
    public static /* synthetic */ int eY;
    public static final /* synthetic */ WorldArea ee;
    private static final /* synthetic */ int eQ;
    private static final /* synthetic */ WorldPoint eA;
    public static final /* synthetic */ WorldArea ea;
    public static /* synthetic */ List<C0003d> bA;
    private static final /* synthetic */ int eW;
    private static final /* synthetic */ int eS;
    private static final /* synthetic */ WorldPoint ew;
    private static final /* synthetic */ int er;
    public static final /* synthetic */ WorldArea ef;
    private static final /* synthetic */ WorldPoint eI;
    private static /* synthetic */ int[] fb;
    private static final /* synthetic */ int es;
    static /* synthetic */ int co;
    public static /* synthetic */ boolean by;
    private static final /* synthetic */ WorldPoint eK;
    private static final /* synthetic */ WorldPoint ey;
    private static final /* synthetic */ int el;
    private static final /* synthetic */ int eV;

    private static boolean lIlIIllllIIIlll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIllllIIllII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllllIIlIlI(int i2, int i3) {
        return i2 > i3;
    }

    private static void lIlIIllllIIIlIl() {
        lIIlIIIIIllll = new int[175];
        lIIlIIIIIllll[0] = ((144 + 61) - 52) + 7;
        lIIlIIIIIllll[1] = "  ".length();
        lIIlIIIIIllll[2] = ((222 + 129) - 233) + 108;
        lIIlIIIIIllll[3] = " ".length();
        lIIlIIIIIllll[4] = ((((120 + 130) - 40) + 21) ^ (((17 + 112) - 16) + 63)) & (((((116 + 59) - 104) + 145) ^ (((39 + 126) - 123) + 101)) ^ (-" ".length()));
        lIIlIIIIIllll[5] = (-((-3595) & 15903)) & (-16769) & 29631;
        lIIlIIIIIllll[6] = (-((-5669) & 32375)) & (-1281) & 28543;
        lIIlIIIIIllll[7] = (-((-521) & 11210)) & (-17) & 11263;
        lIIlIIIIIllll[8] = (-32257) & 32635;
        lIIlIIIIIllll[9] = (-(149 ^ 138)) & (-24609) & 26623;
        lIIlIIIIIllll[10] = (-16545) & 24553;
        lIIlIIIIIllll[11] = ((30 + 131) - 126) + 115;
        lIIlIIIIIllll[12] = "   ".length();
        lIIlIIIIIllll[13] = (((49 + 63) - 77) + 92) ^ (216 ^ 162);
        lIIlIIIIIllll[14] = (((135 + 14) - 142) + 134) ^ (((28 + 87) - (-19)) + 5);
        lIIlIIIIIllll[15] = 198 ^ 194;
        lIIlIIIIIllll[16] = (6 ^ 127) ^ (156 ^ 181);
        lIIlIIIIIllll[17] = (-25617) & 28025;
        lIIlIIIIIllll[18] = 101 ^ 98;
        lIIlIIIIIllll[19] = (-25729) & 28595;
        lIIlIIIIIllll[20] = 91 ^ 83;
        lIIlIIIIIllll[21] = (((109 + 14) - (-30)) + 31) ^ (((141 + 26) - 118) + 128);
        lIIlIIIIIllll[22] = (((106 + 102) - 139) + 82) ^ (((121 + 51) - 53) + 38);
        lIIlIIIIIllll[23] = ((151 + 214) - 355) + 219;
        lIIlIIIIIllll[24] = 115 ^ 120;
        lIIlIIIIIllll[25] = 109 ^ 97;
        lIIlIIIIIllll[26] = 44 ^ 33;
        lIIlIIIIIllll[27] = 25 ^ 23;
        lIIlIIIIIllll[28] = 120 ^ 119;
        lIIlIIIIIllll[29] = 72 ^ 88;
        lIIlIIIIIllll[30] = (((50 + 20) - (-76)) + 23) ^ (((126 + 103) - 130) + 85);
        lIIlIIIIIllll[31] = 105 ^ 123;
        lIIlIIIIIllll[32] = (147 ^ 187) ^ (28 ^ 39);
        lIIlIIIIIllll[33] = (27 ^ 45) ^ (38 ^ 4);
        lIIlIIIIIllll[34] = 27 ^ 14;
        lIIlIIIIIllll[35] = (((22 + 64) - (-22)) + 24) ^ (((54 + 77) - 85) + 100);
        lIIlIIIIIllll[36] = (((25 + 16) - (-108)) + 21) ^ (((122 + 152) - 213) + 128);
        lIIlIIIIIllll[37] = (((209 + 48) - 122) + 85) ^ (((168 + 2) - 76) + 102);
        lIIlIIIIIllll[38] = 9 ^ 16;
        lIIlIIIIIllll[39] = (-25218) & 27627;
        lIIlIIIIIllll[40] = 134 ^ 156;
        lIIlIIIIIllll[41] = (((76 + 24) - (-45)) + 44) ^ (((17 + 151) - 49) + 47);
        lIIlIIIIIllll[42] = 109 ^ 113;
        lIIlIIIIIllll[43] = 66 ^ 95;
        lIIlIIIIIllll[44] = 42 ^ 52;
        lIIlIIIIIllll[45] = (((56 + 95) - 150) + 128) ^ (((60 + 115) - 111) + 94);
        lIIlIIIIIllll[46] = 151 ^ 183;
        lIIlIIIIIllll[47] = 126 ^ 95;
        lIIlIIIIIllll[48] = 29 ^ 63;
        lIIlIIIIIllll[49] = 117 ^ 86;
        lIIlIIIIIllll[50] = 80 ^ 116;
        lIIlIIIIIllll[51] = (((59 + 175) - 95) + 52) ^ (((56 + 7) - (-38)) + 53);
        lIIlIIIIIllll[52] = (203 ^ 152) ^ (122 ^ 15);
        lIIlIIIIIllll[53] = (((44 + 9) - (-49)) + 30) ^ (((134 + 148) - 213) + 94);
        lIIlIIIIIllll[54] = 24 ^ 48;
        lIIlIIIIIllll[55] = (((118 + 87) - 131) + 106) ^ (((82 + 80) - 152) + 147);
        lIIlIIIIIllll[56] = 82 ^ 120;
        lIIlIIIIIllll[57] = 77 ^ 102;
        lIIlIIIIIllll[58] = (-16417) & 19317;
        lIIlIIIIIllll[59] = (-((-2196) & 15007)) & (-33) & 16303;
        lIIlIIIIIllll[60] = (-5649) & 8059;
        lIIlIIIIIllll[61] = 151 ^ 187;
        lIIlIIIIIllll[62] = (-((-309) & 25015)) & (-4097) & 31735;
        lIIlIIIIIllll[63] = 141 ^ 160;
        lIIlIIIIIllll[64] = (((25 + 71) - 66) + 139) ^ (((79 + 107) - 121) + 70);
        lIIlIIIIIllll[65] = (((51 + 108) - 26) + 23) ^ (((128 + 134) - 240) + 157);
        lIIlIIIIIllll[66] = 53 ^ 5;
        lIIlIIIIIllll[67] = (((60 + 132) - 139) + 94) ^ (((122 + 160) - 143) + 23);
        lIIlIIIIIllll[68] = 141 ^ 191;
        lIIlIIIIIllll[69] = 82 ^ 97;
        lIIlIIIIIllll[70] = 241 ^ 197;
        lIIlIIIIIllll[71] = (((129 + 54) - 146) + 123) ^ (((108 + 63) - 92) + 70);
        lIIlIIIIIllll[72] = 119 ^ 65;
        lIIlIIIIIllll[73] = 154 ^ 173;
        lIIlIIIIIllll[74] = (39 ^ 28) ^ "   ".length();
        lIIlIIIIIllll[75] = 182 ^ 143;
        lIIlIIIIIllll[76] = 54 ^ 12;
        lIIlIIIIIllll[77] = 142 ^ 181;
        lIIlIIIIIllll[78] = 171 ^ 151;
        lIIlIIIIIllll[79] = 75 ^ 118;
        lIIlIIIIIllll[80] = 142 ^ 176;
        lIIlIIIIIllll[81] = (15 ^ 70) ^ (198 ^ 176);
        lIIlIIIIIllll[82] = (-(37 ^ 68)) & (-5) & 4095;
        lIIlIIIIIllll[83] = (72 ^ 7) ^ (131 ^ 140);
        lIIlIIIIIllll[84] = (236 ^ 180) ^ (185 ^ 160);
        lIIlIIIIIllll[85] = (((56 + 135) - 61) + 65) ^ (((18 + 74) - (-22)) + 15);
        lIIlIIIIIllll[86] = 106 ^ 41;
        lIIlIIIIIllll[87] = (46 ^ 31) ^ (118 ^ 3);
        lIIlIIIIIllll[88] = 69 ^ 0;
        lIIlIIIIIllll[89] = (((176 + 194) - 339) + 195) ^ (((7 + 43) - (-54)) + 60);
        lIIlIIIIIllll[90] = (((168 + 169) - 289) + 180) ^ (((156 + 119) - 129) + 17);
        lIIlIIIIIllll[91] = 56 ^ 112;
        lIIlIIIIIllll[92] = (145 ^ 181) ^ (221 ^ 176);
        lIIlIIIIIllll[93] = (-25) & 2937;
        lIIlIIIIIllll[94] = (-16481) & 19946;
        lIIlIIIIIllll[95] = (((140 + 143) - 260) + 169) ^ (((131 + 74) - 93) + 26);
        lIIlIIIIIllll[96] = 34 ^ 105;
        lIIlIIIIIllll[97] = 51 ^ 127;
        lIIlIIIIIllll[98] = 3 ^ 78;
        lIIlIIIIIllll[99] = (-(30 ^ 11)) & (-98) & 5117;
        lIIlIIIIIllll[100] = 199 ^ 137;
        lIIlIIIIIllll[101] = (-20497) & 21496;
        lIIlIIIIIllll[102] = 10 ^ 69;
        lIIlIIIIIllll[103] = 57 ^ 104;
        lIIlIIIIIllll[104] = (115 ^ 11) ^ (107 ^ 65);
        lIIlIIIIIllll[105] = (-(((102 + 133) - 201) + 119)) & (-33) & 8191;
        lIIlIIIIIllll[106] = (81 ^ 105) ^ (45 ^ 70);
        lIIlIIIIIllll[107] = (-((-23009) & 32747)) & (-4097) & 14334;
        lIIlIIIIIllll[108] = (-((-9777) & 28219)) & (-133) & 31199;
        lIIlIIIIIllll[109] = 36 ^ 64;
        lIIlIIIIIllll[110] = (-14915) & 15314;
        lIIlIIIIIllll[111] = (-((-8673) & 26090)) & (-10241) & 32767;
        lIIlIIIIIllll[112] = (-16675) & 28654;
        lIIlIIIIIllll[113] = (-2055) & 19054;
        lIIlIIIIIllll[114] = (-((-19781) & 32086)) & (-16515) & 30719;
        lIIlIIIIIllll[115] = (-((-17801) & 32173)) & (-2) & 16373;
        lIIlIIIIIllll[116] = 235 ^ 191;
        lIIlIIIIIllll[117] = (151 ^ 160) ^ (126 ^ 28);
        lIIlIIIIIllll[118] = (-((-389) & 6533)) & (-513) & 8126;
        lIIlIIIIIllll[119] = (-((-28754) & 30847)) & (-4625) & 8191;
        lIIlIIIIIllll[120] = (-((-20801) & 29524)) & (-6153) & 16351;
        lIIlIIIIIllll[121] = (-((-12329) & 29934)) & (-14593) & 32751;
        lIIlIIIIIllll[122] = (-((-5207) & 32351)) & (-4104) & 32719;
        lIIlIIIIIllll[123] = (-((-35) & 28851)) & (-1036) & 32767;
        lIIlIIIIIllll[124] = (-12833) & 16296;
        lIIlIIIIIllll[125] = (-129) & 3047;
        lIIlIIIIIllll[126] = (-28844) & 31743;
        lIIlIIIIIllll[127] = (-((-27779) & 32511)) & (-1) & 8191;
        lIIlIIIIIllll[128] = (-4097) & 7011;
        lIIlIIIIIllll[129] = (-((-2697) & 14985)) & (-1034) & 16251;
        lIIlIIIIIllll[130] = (-((-3353) & 32121)) & (-541) & 32766;
        lIIlIIIIIllll[131] = (-16393) & 19294;
        lIIlIIIIIllll[132] = (-25187) & 28647;
        lIIlIIIIIllll[133] = (-((-26157) & 30399)) & (-16393) & 23551;
        lIIlIIIIIllll[134] = (-((-11694) & 15807)) & (-17413) & 24437;
        lIIlIIIIIllll[135] = (-(168 ^ 185)) & (-12353) & 15831;
        lIIlIIIIIllll[136] = (-17441) & 20343;
        lIIlIIIIIllll[137] = (-((-20337) & 32763)) & (-5) & 15359;
        lIIlIIIIIllll[138] = (-((-10275) & 31723)) & (-5) & 24556;
        lIIlIIIIIllll[139] = (-20869) & 24031;
        lIIlIIIIIllll[140] = (-((-1429) & 26005)) & (-5249) & 32751;
        lIIlIIIIIllll[141] = (-16513) & 19967;
        lIIlIIIIIllll[142] = (-((-2185) & 23695)) & (-130) & 24575;
        lIIlIIIIIllll[143] = (-9218) & 12183;
        lIIlIIIIIllll[144] = (-((-9313) & 9835)) & (-4289) & 8191;
        lIIlIIIIIllll[145] = (-25613) & 28511;
        lIIlIIIIIllll[146] = (-((-4103) & 28719)) & (-513) & 28601;
        lIIlIIIIIllll[147] = (-5127) & 8031;
        lIIlIIIIIllll[148] = (-12877) & 16351;
        lIIlIIIIIllll[149] = (-((-3593) & 16009)) & (-1025) & 16346;
        lIIlIIIIIllll[150] = (-22819) & 32694;
        lIIlIIIIIllll[151] = (-6209) & 16082;
        lIIlIIIIIllll[152] = (-(40 ^ 33)) & (-20481) & 30361;
        lIIlIIIIIllll[153] = (-16417) & 19881;
        lIIlIIIIIllll[154] = (-161) & 3071;
        lIIlIIIIIllll[155] = (-((-16773) & 21493)) & (-1) & 8189;
        lIIlIIIIIllll[156] = (-4257) & 7163;
        lIIlIIIIIllll[157] = (-8265) & 11740;
        lIIlIIIIIllll[158] = (-((-175) & 431)) & (-6161) & 16286;
        lIIlIIIIIllll[159] = (-((-5063) & 29639)) & (-4129) & 31613;
        lIIlIIIIIllll[160] = (-22627) & 32503;
        lIIlIIIIIllll[161] = (-((-4139) & 4479)) & (-16425) & 32127;
        lIIlIIIIIllll[162] = (-8317) & 13439;
        lIIlIIIIIllll[163] = 13 ^ 91;
        lIIlIIIIIllll[164] = (218 ^ 131) ^ (99 ^ 109);
        lIIlIIIIIllll[165] = 31 ^ 71;
        lIIlIIIIIllll[166] = (133 ^ 193) ^ (31 ^ 2);
        lIIlIIIIIllll[167] = (46 ^ 78) ^ (188 ^ 134);
        lIIlIIIIIllll[168] = (118 ^ 10) ^ (124 ^ 91);
        lIIlIIIIIllll[169] = (85 ^ 127) ^ (62 ^ 72);
        lIIlIIIIIllll[170] = (-((-2497) & 31202)) & (-65) & 32765;
        lIIlIIIIIllll[171] = (-(168 ^ 139)) & (-1) & 4031;
        lIIlIIIIIllll[172] = (-((-3115) & 31851)) & (-33) & 32766;
        lIIlIIIIIllll[173] = (-12353) & 16351;
        lIIlIIIIIllll[174] = 216 ^ 133;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0262, code lost:
        if (lIlIIllllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[22]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a5, code lost:
        if (lIlIIllllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[13]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e8, code lost:
        if (lIlIIllllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[33]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02eb, code lost:
        W();
        java.lang.System.out.println(i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIlllI[i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[104(0x68, float:1.46E-43)]]);
        i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.by = i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0306, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v232, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aR() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIllllIIllII(nearest) && lIlIIllllIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[97]];
            C0000a.a(nearest);
        }
        if (lIlIIllllIIllII(nearest) && lIlIIllllIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[98]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIlIIIIIllll[99]);
                "".length();
            }
            if (lIlIIllllIIlIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[100]];
                if (lIlIIllllIIllll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIlIIIIIllll[12]);
                    "".length();
                }
                if (lIlIIllllIIllll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIlIIIIIllll[1]);
                    "".length();
                }
                while (lIlIIllllIIlIIl(C0012m.av() ? 1 : 0) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    C0012m.at();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if ((-" ".length()) > "  ".length()) {
                        return;
                    }
                }
                int[] iArr = new int[lIIlIIIIIllll[3]];
                iArr[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                if (lIlIIllllIIlIII(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIIIIIllll[3]];
                    iArr2[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                    if (lIlIIllllIIIllI(Bank.getFirst(iArr2).getQuantity(), lIIlIIIIIllll[101])) {
                        W();
                        System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[102]]);
                        by = lIIlIIIIIllll[3];
                        return;
                    }
                }
                int[] iArr3 = new int[lIIlIIIIIllll[3]];
                iArr3[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                if (lIlIIllllIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIlIIIIIllll[3]];
                    iArr4[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                    if (lIlIIllllIIIllI(Bank.getFirst(iArr4).getQuantity(), lIIlIIIIIllll[101])) {
                        W();
                        System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[16]]);
                        by = lIIlIIIIIllll[3];
                        return;
                    }
                }
                int[] iArr5 = new int[lIIlIIIIIllll[3]];
                iArr5[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                if (lIlIIllllIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIlIIIIIllll[3]];
                    iArr6[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                    if (lIlIIllllIIIllI(Bank.getFirst(iArr6).getQuantity(), lIIlIIIIIllll[101])) {
                        W();
                        System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[103]]);
                        by = lIIlIIIIIllll[3];
                        return;
                    }
                }
                int[] iArr7 = new int[lIIlIIIIIllll[3]];
                iArr7[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (lIlIIllllIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lIIlIIIIIllll[3]];
                    iArr8[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                }
                int[] iArr9 = new int[lIIlIIIIIllll[3]];
                iArr9[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                if (lIlIIllllIIlIII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlIIIIIllll[3]];
                    iArr10[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                }
                int[] iArr11 = new int[lIIlIIIIIllll[3]];
                iArr11[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                if (lIlIIllllIIlIII(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIlIIIIIllll[3]];
                    iArr12[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                }
                int[] iArr13 = new int[lIIlIIIIIllll[18]];
                iArr13[lIIlIIIIIllll[4]] = lIIlIIIIIllll[105];
                iArr13[lIIlIIIIIllll[3]] = lIIlIIIIIllll[10];
                iArr13[lIIlIIIIIllll[1]] = lIIlIIIIIllll[9];
                iArr13[lIIlIIIIIllll[12]] = lIIlIIIIIllll[8];
                iArr13[lIIlIIIIIllll[15]] = lIIlIIIIIllll[7];
                iArr13[lIIlIIIIIllll[13]] = lIIlIIIIIllll[5];
                iArr13[lIIlIIIIIllll[14]] = lIIlIIIIIllll[6];
                if (lIlIIllllIIlIIl(C0004e.b(iArr13) ? 1 : 0)) {
                    W();
                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[106]]);
                    by = lIIlIIIIIllll[3];
                    return;
                }
                if (lIlIIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIIlIIIIIllll[15]);
                    "".length();
                }
                int[] iArr14 = new int[lIIlIIIIIllll[3]];
                iArr14[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (lIlIIllllIIlIII(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlIIIIIllll[3]];
                    iArr15[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                    if (lIlIIllllIIIllI(Inventory.getCount(iArr15), lIIlIIIIIllll[3])) {
                        Bank.withdraw(lIIlIIIIIllll[10], lIIlIIIIIllll[13], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIIlIIIIIllll[3]];
                            iArr16[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                            if (lIlIIllllIIllll(Inventory.getCount(iArr16))) {
                                ?? r0 = lIIlIIIIIllll[3];
                                "".length();
                                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIIIIIllll[4];
                        }, lIIlIIIIIllll[99]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIIlIIIIIllll[3]];
                iArr16[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                if (lIlIIllllIIlIII(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIIlIIIIIllll[3]];
                    iArr17[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                    if (lIlIIllllIIIllI(Inventory.getCount(iArr17), lIIlIIIIIllll[3])) {
                        Bank.withdraw(lIIlIIIIIllll[9], lIIlIIIIIllll[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIIlIIIIIllll[3]];
                            iArr18[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                            if (lIlIIllllIIllll(Inventory.getCount(iArr18))) {
                                ?? r0 = lIIlIIIIIllll[3];
                                "".length();
                                return ((113 ^ 81) & ((130 ^ 162) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIIIIIllll[4];
                        }, lIIlIIIIIllll[99]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIIlIIIIIllll[3]];
                iArr18[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                if (lIlIIllllIIlIII(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIIlIIIIIllll[3]];
                    iArr19[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                    if (lIlIIllllIIIllI(Inventory.getCount(iArr19), lIIlIIIIIllll[3])) {
                        Bank.withdraw(lIIlIIIIIllll[7], lIIlIIIIIllll[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIIlIIIIIllll[3]];
                            iArr20[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                            if (lIlIIllllIIllll(Inventory.getCount(iArr20))) {
                                ?? r0 = lIIlIIIIIllll[3];
                                "".length();
                                return 0 != 0 ? ((245 ^ 173) ^ (56 ^ 105)) & (((183 ^ 143) ^ (124 ^ 77)) ^ (-" ".length())) : r0;
                            }
                            return lIIlIIIIIllll[4];
                        }, lIIlIIIIIllll[99]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIlIIIIIllll[3]];
                iArr20[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                if (lIlIIllllIIlIII(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIIlIIIIIllll[3]];
                    iArr21[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                    if (lIlIIllllIIIllI(Inventory.getCount(iArr21), lIIlIIIIIllll[3])) {
                        Bank.withdraw(lIIlIIIIIllll[5], lIIlIIIIIllll[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIIlIIIIIllll[3]];
                            iArr22[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                            if (lIlIIllllIIllll(Inventory.getCount(iArr22))) {
                                ?? r0 = lIIlIIIIIllll[3];
                                "".length();
                                return (-" ".length()) > ((7 ^ 3) & ((61 ^ 57) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIIIIIllll[4];
                        }, lIIlIIIIIllll[99]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIIlIIIIIllll[3]];
                iArr22[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                if (lIlIIllllIIlIII(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIIlIIIIIllll[3]];
                    iArr23[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                    if (lIlIIllllIIIllI(Inventory.getCount(iArr23), lIIlIIIIIllll[3])) {
                        Bank.withdraw(lIIlIIIIIllll[6], lIIlIIIIIllll[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIIlIIIIIllll[3]];
                            iArr24[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                            if (lIlIIllllIIllll(Inventory.getCount(iArr24))) {
                                ?? r0 = lIIlIIIIIllll[3];
                                "".length();
                                return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIIIIIllll[4];
                        }, lIIlIIIIIllll[99]);
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIlIIIIIllll[3]];
                iArr24[lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                if (lIlIIllllIIlIII(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIIlIIIIIllll[3]];
                    iArr25[lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                    if (lIlIIllllIIlIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                        Bank.withdraw(lIIlIIIIIllll[108], lIIlIIIIIllll[3], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr26 = new int[lIIlIIIIIllll[3]];
                            iArr26[lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                            return Inventory.contains(iArr26);
                        }, lIIlIIIIIllll[99]);
                        "".length();
                    }
                }
                int[] iArr26 = new int[lIIlIIIIIllll[3]];
                iArr26[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                if (lIlIIllllIIlIII(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[lIIlIIIIIllll[3]];
                    iArr27[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                    if (lIlIIllllIIIllI(Inventory.getCount(iArr27), lIIlIIIIIllll[3])) {
                        Bank.withdrawAll(lIIlIIIIIllll[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr28 = new int[lIIlIIIIIllll[3]];
                            iArr28[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                            if (lIlIIllllIIllll(Inventory.getCount(iArr28))) {
                                ?? r0 = lIIlIIIIIllll[3];
                                "".length();
                                return "   ".length() > "   ".length() ? ((111 ^ 85) ^ ((124 ^ 122) & ((111 ^ 105) ^ (-1)))) & (((190 ^ 153) ^ (62 ^ 35)) ^ (-" ".length())) : r0;
                            }
                            return lIIlIIIIIllll[4];
                        }, lIIlIIIIIllll[99]);
                        "".length();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b10, code lost:
        if (lIlIIllllIIlIlI(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.eJ), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[12]) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0d7c, code lost:
        if (lIlIIllllIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018e  */
    /* JADX WARN: Type inference failed for: r0v652, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aP() {
        if (lIlIIllllIIIllI(C0004e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1])) {
            try {
                z.bD();
                "".length();
                if ((-" ".length()) > (-" ".length())) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && lIlIIllllIIIllI(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[3])) {
            if (lIlIIllllIIlIII(by ? 1 : 0)) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[4]];
                C0001b.a(bA);
                if (lIlIIllllIIIllI(bA.size(), lIIlIIIIIllll[3])) {
                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[3]]);
                    by = lIIlIIIIIllll[4];
                }
            }
            do {
                if (lIlIIllllIIlIII(C0012m.av() ? 1 : 0)) {
                    int[] iArr = new int[lIIlIIIIIllll[3]];
                    iArr[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                    if (lIlIIllllIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIlIIIIIllll[3]];
                        iArr2[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                        if (lIlIIllllIIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIlIIIIIllll[3]];
                            iArr3[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                            if (lIlIIllllIIlIII(Inventory.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIlIIIIIllll[3]];
                                iArr4[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                                if (lIlIIllllIIlIII(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lIIlIIIIIllll[3]];
                                    iArr5[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                                    if (lIlIIllllIIlIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[lIIlIIIIIllll[3]];
                                        iArr6[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                        if (!lIlIIllllIIlIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                                            if (lIlIIllllIIlIIl(by ? 1 : 0)) {
                                                if (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[11])) {
                                                    int[] iArr7 = new int[lIIlIIIIIllll[3]];
                                                    iArr7[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                                    if (lIlIIllllIIlIII(Inventory.contains(iArr7) ? 1 : 0)) {
                                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[1]];
                                                        int[] iArr8 = new int[lIIlIIIIIllll[3]];
                                                        iArr8[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                                        Inventory.getFirst(iArr8).interact(lIIlIIIIIlllI[lIIlIIIIIllll[12]]);
                                                        Time.sleepTicks(lIIlIIIIIllll[13]);
                                                        "".length();
                                                    }
                                                }
                                                if (lIlIIllllIIIllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[11]) && lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[14])) {
                                                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[15]];
                                                    if (lIlIIllllIIlIII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllllIIIllI(Movement.getRunEnergy(), lIIlIIIIIllll[16])) {
                                                        Inventory.getFirst(C0005f.ba).interact(lIIlIIIIIlllI[lIIlIIIIIllll[13]]);
                                                        Time.sleepTicks(lIIlIIIIIllll[3]);
                                                        "".length();
                                                    }
                                                    Movement.walkTo(ew);
                                                    "".length();
                                                    Time.sleepTicks(lIIlIIIIIllll[3]);
                                                    "".length();
                                                }
                                                if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[14])) {
                                                    C0006g.a(lIIlIIIIIlllI[lIIlIIIIIllll[14]], dP);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    aR();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                } else if (lIlIIllllIIlIIl(by ? 1 : 0)) {
                }
            } while (!((true ^ true) & ((true ^ true) ^ true)));
            return;
        }
        if (lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[3])) {
            if (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15]) && lIlIIllllIIlIIl(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlIIIIIllll[3]];
                iArr9[lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                if (lIlIIllllIIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[18]];
                    Movement.walkTo(ez);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                }
            }
            if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15]) && lIlIIllllIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] iArr10 = new int[lIIlIIIIIllll[3]];
                iArr10[lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                if (lIlIIllllIIlIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIlIIIIIllll[3]];
                    iArr11[lIIlIIIIIllll[4]] = lIIlIIIIIllll[19];
                    TileObject nearest = TileObjects.getNearest(iArr11);
                    if (lIlIIllllIIlIII(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr12 = new int[lIIlIIIIIllll[3]];
                        iArr12[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        Inventory.getFirst(iArr12).interact(lIIlIIIIIlllI[lIIlIIIIIllll[20]]);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                    }
                    if (lIlIIllllIIlIIl(Inventory.isFull() ? 1 : 0)) {
                        if (lIlIIllllIIllII(nearest) && lIlIIllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[21]];
                            nearest.interact(lIIlIIIIIlllI[lIIlIIIIIllll[22]]);
                            Dialog.continueSpace();
                        }
                        Widget widget = Widgets.get(lIIlIIIIIllll[23], lIIlIIIIIllll[3]);
                        if (lIlIIllllIIllII(widget)) {
                            widget.interact(lIIlIIIIIlllI[lIIlIIIIIllll[24]]);
                            widget.interact(lIIlIIIIIllll[4]);
                            widget.interact(lIIlIIIIIlllI[lIIlIIIIIllll[25]]);
                            Keyboard.type(lIIlIIIIIlllI[lIIlIIIIIllll[26]]);
                        }
                    }
                }
            }
            if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15])) {
                int[] iArr13 = new int[lIIlIIIIIllll[3]];
                iArr13[lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                if (lIlIIllllIIlIII(Inventory.contains(iArr13) ? 1 : 0) && lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[27]];
                    Movement.walkTo(eD);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                }
            }
            if (lIlIIllllIIlIII(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[28]];
                if (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                    Movement.walkTo(eD);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                }
                if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                    String[] strArr = new String[lIIlIIIIIllll[3]];
                    strArr[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[29]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[30]];
                    if (lIlIIllllIIlIII(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr14 = new int[lIIlIIIIIllll[3]];
                        iArr14[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        Inventory.getFirst(iArr14).interact(lIIlIIIIIlllI[lIIlIIIIIllll[31]]);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                    }
                    if (lIlIIllllIIllII(nearest2)) {
                        String[] strArr2 = new String[lIIlIIIIIllll[3]];
                        strArr2[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[32]];
                        if (lIlIIllllIIlIII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[33]]);
                            Time.sleepTicks(lIIlIIIIIllll[1]);
                            "".length();
                        }
                        String[] strArr3 = new String[lIIlIIIIIllll[3]];
                        strArr3[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[34]];
                        if (lIlIIllllIIlIII(nearest2.hasAction(strArr3) ? 1 : 0)) {
                            nearest2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[35]]);
                            Time.sleepTicks(lIIlIIIIIllll[1]);
                            "".length();
                            Widget widget2 = Widgets.get(lIIlIIIIIllll[23], lIIlIIIIIllll[3]);
                            if (lIlIIllllIIllII(widget2)) {
                                widget2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[36]]);
                                widget2.interact(lIIlIIIIIllll[4]);
                                widget2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[37]]);
                                Keyboard.type(lIIlIIIIIlllI[lIIlIIIIIllll[38]]);
                            }
                        }
                    }
                }
            }
        }
        if (lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[1])) {
            co = lIIlIIIIIllll[4];
            if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[22])) {
                while (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[1]) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    Movement.walkTo(ez);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return;
                    }
                }
            }
            int[] iArr15 = new int[lIIlIIIIIllll[3]];
            iArr15[lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
            if (lIlIIllllIIlIIl(Inventory.contains(iArr15) ? 1 : 0) && lIlIIllllIIlIII(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[40]];
                if (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                    Movement.walkTo(eD);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                }
                if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                    String[] strArr4 = new String[lIIlIIIIIllll[3]];
                    strArr4[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[41]];
                    TileObject nearest3 = TileObjects.getNearest(strArr4);
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[42]];
                    if (lIlIIllllIIllII(nearest3)) {
                        String[] strArr5 = new String[lIIlIIIIIllll[3]];
                        strArr5[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[43]];
                        if (lIlIIllllIIlIII(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            nearest3.interact(lIIlIIIIIlllI[lIIlIIIIIllll[44]]);
                            Time.sleepTicks(lIIlIIIIIllll[1]);
                            "".length();
                        }
                        String[] strArr6 = new String[lIIlIIIIIllll[3]];
                        strArr6[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[45]];
                        if (lIlIIllllIIlIII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                            nearest3.interact(lIIlIIIIIlllI[lIIlIIIIIllll[46]]);
                            Time.sleepTicks(lIIlIIIIIllll[1]);
                            "".length();
                            Widget widget3 = Widgets.get(lIIlIIIIIllll[23], lIIlIIIIIllll[3]);
                            if (lIlIIllllIIllII(widget3)) {
                                widget3.interact(lIIlIIIIIlllI[lIIlIIIIIllll[47]]);
                                widget3.interact(lIIlIIIIIllll[4]);
                                widget3.interact(lIIlIIIIIlllI[lIIlIIIIIllll[48]]);
                                Keyboard.type(lIIlIIIIIlllI[lIIlIIIIIllll[49]]);
                            }
                        }
                    }
                }
            }
            int[] iArr16 = new int[lIIlIIIIIllll[3]];
            iArr16[lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
            if (lIlIIllllIIlIII(Inventory.contains(iArr16) ? 1 : 0) && lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[3])) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[50]];
                Movement.walkTo(eA);
                "".length();
                Time.sleepTicks(lIIlIIIIIllll[3]);
                "".length();
            }
            if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[1])) {
                String[] strArr7 = new String[lIIlIIIIIllll[3]];
                strArr7[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[51]];
                TileObject nearest4 = TileObjects.getNearest(strArr7);
                String[] strArr8 = new String[lIIlIIIIIllll[3]];
                strArr8[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[52]];
                NPC nearest5 = NPCs.getNearest(strArr8);
                if (lIlIIllllIIllII(nearest4) && lIlIIllllIIllIl(nearest5)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[53]];
                    String[] strArr9 = new String[lIIlIIIIIllll[3]];
                    strArr9[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[54]];
                    if (lIlIIllllIIlIII(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lIIlIIIIIllll[3]];
                        strArr10[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[55]];
                        Inventory.getFirst(strArr10).useOn(nearest4);
                    }
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                }
                if (lIlIIllllIIllII(nearest5)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[56]];
                    int[] iArr17 = new int[lIIlIIIIIllll[3]];
                    iArr17[lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                    if (lIlIIllllIIlIII(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lIIlIIIIIllll[3]];
                        iArr18[lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                        Inventory.getFirst(iArr18).useOn(nearest5);
                    }
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                }
            }
        }
        if (lIlIIllllIIlIII(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[12])) {
            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[57]];
            Movement.walkTo(new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[59], lIIlIIIIIllll[4]));
            "".length();
            Time.sleepTicks(lIIlIIIIIllll[3]);
            "".length();
        }
        if (lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[12])) {
            int[] iArr19 = new int[lIIlIIIIIllll[3]];
            iArr19[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
            if (lIlIIllllIIlIII(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIlIIIIIllll[3]];
                iArr20[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                if (lIlIIllllIIlIII(Inventory.contains(iArr20) ? 1 : 0)) {
                }
            }
            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[61]];
            if (lIlIIllllIIlllI(Movement.getRunEnergy(), lIIlIIIIIllll[33])) {
                aQ();
            }
        }
        if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eJ), lIIlIIIIIllll[12])) {
            int[] iArr21 = new int[lIIlIIIIIllll[3]];
            iArr21[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
            if (lIlIIllllIIlIII(Inventory.contains(iArr21) ? 1 : 0) && lIlIIllllIIIlll(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIllll[62])) {
                String[] strArr11 = new String[lIIlIIIIIllll[3]];
                strArr11[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[63]];
                TileObject nearest6 = TileObjects.getNearest(strArr11);
                if (lIlIIllllIIllII(nearest6)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[64]];
                    int[] iArr22 = new int[lIIlIIIIIllll[3]];
                    iArr22[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                    if (lIlIIllllIIlIII(Inventory.contains(iArr22) ? 1 : 0)) {
                        int[] iArr23 = new int[lIIlIIIIIllll[3]];
                        iArr23[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                        Inventory.getFirst(iArr23).useOn(nearest6);
                        Time.sleepTicks(lIIlIIIIIllll[1]);
                        "".length();
                    }
                }
            }
        }
        if (lIlIIllllIIlIII(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr24 = new int[lIIlIIIIIllll[3]];
            iArr24[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
            if (lIlIIllllIIlIII(Inventory.contains(iArr24) ? 1 : 0)) {
                if (lIlIIllllIIlIIl(Players.getLocal().getWorldLocation().equals(ex) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[65]];
                    Movement.walkTo(ex);
                    "".length();
                }
                if (lIlIIllllIIlIll(Skills.getBoostedLevel(Skill.HITPOINTS), lIIlIIIIIllll[13])) {
                    int[] iArr25 = new int[lIIlIIIIIllll[3]];
                    iArr25[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                    if (lIlIIllllIIlIII(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[lIIlIIIIIllll[3]];
                        iArr26[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        Inventory.getFirst(iArr26).interact(lIIlIIIIIlllI[lIIlIIIIIllll[66]]);
                    }
                }
                if (lIlIIllllIIlIII(Players.getLocal().getWorldLocation().equals(ex) ? 1 : 0)) {
                    NPC nearest7 = NPCs.getNearest(fb);
                    if (lIlIIllllIIllII(nearest7) && lIlIIllllIIlIIl(nearest7.isDead() ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[67]];
                        if (lIlIIllllIIIllI(Skills.getLevel(Skill.MAGIC), lIIlIIIIIllll[21])) {
                            Magic.cast(SpellBook.Standard.WATER_STRIKE, nearest7);
                            Time.sleepTicks(lIIlIIIIIllll[3]);
                            "".length();
                        }
                        if (!lIlIIllllIIIllI(Skills.getLevel(Skill.MAGIC), lIIlIIIIIllll[26]) || lIlIIllllIIIllI(Skills.getLevel(Skill.MAGIC), lIIlIIIIIllll[21])) {
                            if (lIlIIllllIIlllI(Skills.getLevel(Skill.MAGIC), lIIlIIIIIllll[21])) {
                                int[] iArr27 = new int[lIIlIIIIIllll[3]];
                                iArr27[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                                if (lIlIIllllIIlIII(Inventory.contains(iArr27) ? 1 : 0)) {
                                    String[] strArr12 = new String[lIIlIIIIIllll[3]];
                                    strArr12[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[68]];
                                }
                            }
                            if (lIlIIllllIIlllI(Skills.getLevel(Skill.MAGIC), lIIlIIIIIllll[26])) {
                                String[] strArr13 = new String[lIIlIIIIIllll[3]];
                                strArr13[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[69]];
                                if (lIlIIllllIIlIII(Inventory.contains(strArr13) ? 1 : 0)) {
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, nearest7);
                                    Time.sleepTicks(lIIlIIIIIllll[3]);
                                    "".length();
                                }
                            }
                        }
                        Magic.cast(SpellBook.Standard.EARTH_STRIKE, nearest7);
                        Time.sleepTicks(lIIlIIIIIllll[3]);
                        "".length();
                        if (lIlIIllllIIlllI(Skills.getLevel(Skill.MAGIC), lIIlIIIIIllll[26])) {
                        }
                    }
                }
            }
        }
        if (lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[14])) {
            String[] strArr14 = new String[lIIlIIIIIllll[3]];
            strArr14[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[70]];
            if (lIlIIllllIIlIIl(Inventory.contains(strArr14) ? 1 : 0)) {
                String[] strArr15 = new String[lIIlIIIIIllll[3]];
                strArr15[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[71]];
                TileItem nearest8 = TileItems.getNearest(strArr15);
                if (lIlIIllllIIllII(nearest8)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[72]];
                    nearest8.interact(lIIlIIIIIlllI[lIIlIIIIIllll[73]]);
                    Time.sleepTicks(lIIlIIIIIllll[1]);
                    "".length();
                }
            }
        }
        if (lIlIIllllIIIlll(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[14])) {
            String[] strArr16 = new String[lIIlIIIIIllll[3]];
            strArr16[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[74]];
            if (lIlIIllllIIlIII(Inventory.contains(strArr16) ? 1 : 0)) {
                if (lIlIIllllIIlIII(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr28 = new int[lIIlIIIIIllll[3]];
                    iArr28[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                    if (lIlIIllllIIlIII(Inventory.contains(iArr28) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[75]];
                        int[] iArr29 = new int[lIIlIIIIIllll[3]];
                        iArr29[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                        Inventory.getFirst(iArr29).interact(lIIlIIIIIlllI[lIIlIIIIIllll[76]]);
                        Time.sleepTicks(lIIlIIIIIllll[13]);
                        "".length();
                    }
                }
                if (lIlIIllllIIlIIl(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[15])) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[77]];
                    Movement.walkTo(ew);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                }
                if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[13])) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[78]];
                    if (lIlIIllllIIIllI(co, lIIlIIIIIllll[3])) {
                        P.iw += lIIlIIIIIllll[3];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIIllll[3];
                        P.iw = lIIlIIIIIllll[4];
                        cp = lIIlIIIIIllll[4];
                    }
                    C0006g.a(lIIlIIIIIlllI[lIIlIIIIIllll[79]], dP);
                }
            }
        }
    }

    public static void aQ() {
        if (lIlIIllllIIlIII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllllIIIllI(Movement.getRunEnergy(), lIIlIIIIIllll[68])) {
            Inventory.getFirst(C0005f.ba).interact(lIIlIIIIIlllI[lIIlIIIIIllll[80]]);
            Time.sleepTicks(lIIlIIIIIllll[3]);
            "".length();
        }
        if (lIlIIllllIIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[1])) {
            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[81]];
            Movement.walkTo(new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[59], lIIlIIIIIllll[4]));
            "".length();
            Time.sleepTicks(lIIlIIIIIllll[3]);
            "".length();
        }
        int[] iArr = new int[lIIlIIIIIllll[3]];
        iArr[lIIlIIIIIllll[4]] = lIIlIIIIIllll[82];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[lIIlIIIIIllll[3]];
        iArr2[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
        if (lIlIIllllIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            if (lIlIIllllIIlIII(ea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIIllII(nearest) && lIlIIllllIIlIII(eg.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIIlIIIIIllll[24]);
                "".length();
                while (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dX), lIIlIIIIIllll[3]) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[83]];
                    Movement.walkTo(dX);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if ((-((72 ^ 14) ^ (126 ^ 60))) > 0) {
                        return;
                    }
                }
            }
            if (lIlIIllllIIlIII(eb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIIllII(nearest) && lIlIIllllIIlIII(ed.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dY), lIIlIIIIIllll[3]) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[84]];
                    Movement.walkTo(dY);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if ((((225 ^ 175) ^ (118 ^ 22)) & (((148 ^ 198) ^ (29 ^ 97)) ^ (-" ".length()))) != 0) {
                        return;
                    }
                }
            }
            if (lIlIIllllIIlIII(ec.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIIllII(nearest) && lIlIIllllIIlIII(eh.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIIlIIIIIllll[18]);
                "".length();
                while (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dZ), lIIlIIIIIllll[3]) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[85]];
                    Movement.walkTo(dZ);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if ((127 ^ 123) <= 0) {
                        return;
                    }
                }
            }
            if (lIlIIllllIIlIII(ef.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIIllII(nearest) && lIlIIllllIIlIII(eh.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[1]) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[86]];
                    Movement.walkTo(eK);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if (((126 ^ 63) ^ (92 ^ 25)) < "   ".length()) {
                        return;
                    }
                }
            }
            if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[12])) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[87]];
                String[] strArr = new String[lIIlIIIIIllll[3]];
                strArr[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[88]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (lIlIIllllIIllII(nearest2)) {
                    nearest2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[89]]);
                    Time.sleepTicks(lIIlIIIIIllll[1]);
                    "".length();
                    Widget widget = Widgets.get(lIIlIIIIIllll[23], lIIlIIIIIllll[3]);
                    if (lIlIIllllIIllII(widget)) {
                        widget.interact(lIIlIIIIIlllI[lIIlIIIIIllll[90]]);
                        widget.interact(lIIlIIIIIllll[4]);
                        widget.interact(lIIlIIIIIlllI[lIIlIIIIIllll[91]]);
                        Keyboard.type(lIIlIIIIIlllI[lIIlIIIIIllll[92]]);
                    }
                }
            }
        }
        int[] iArr3 = new int[lIIlIIIIIllll[3]];
        iArr3[lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
        if (lIlIIllllIIlIII(Inventory.contains(iArr3) ? 1 : 0)) {
            if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[12])) {
                while (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4])), lIIlIIIIIllll[3]) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[95]];
                    Movement.walkTo(new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4]));
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            if (lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4])), lIIlIIIIIllll[1]) && lIlIIllllIIllII(nearest) && lIlIIllllIIlIII(eg.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dY), lIIlIIIIIllll[3]) && lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[96]];
                    Movement.walkTo(dY);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIllll[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
        }
    }

    private static String lIlIIllllIIIIIl(String llllllllllllllIlllllllIIlllllIll, String llllllllllllllIlllllllIIlllllIlI) {
        try {
            SecretKeySpec llllllllllllllIlllllllIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIlllllIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIllll[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIIIIllll[1], llllllllllllllIlllllllIIlllllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIIllllllII) {
            llllllllllllllIlllllllIIllllllII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllllIIIIlI(String llllllllllllllIlllllllIIllIlIllI, String llllllllllllllIlllllllIIllIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllllllIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIIIllll[1], llllllllllllllIlllllllIIllIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIIllIlIlll) {
            llllllllllllllIlllllllIIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllllIIIlII() {
        lIIlIIIIIlllI = new String[lIIlIIIIIllll[174]];
        lIIlIIIIIlllI[lIIlIIIIIllll[4]] = lIlIIllllIIIIIl("1ndTxiz272cB9Oi1vnf5lQ==", "AcZmI");
        lIIlIIIIIlllI[lIIlIIIIIllll[3]] = lIlIIllllIIIIlI("qQlpin4FwY3RYFfXc/YuCoaA/ssIE6BV3G3K6UVruNNOeU7xbHCYna910g0pOqM8wg5ldpvaaXs=", "gPmjt");
        lIIlIIIIIlllI[lIIlIIIIIllll[1]] = lIlIIllllIIIIlI("Q6f9KPfPNTkeGFKMJ+rQGQ==", "WhjSH");
        lIIlIIIIIlllI[lIIlIIIIIllll[12]] = lIlIIllllIIIIIl("UBxd0nQe+C0=", "kohDw");
        lIIlIIIIIlllI[lIIlIIIIIllll[15]] = lIlIIllllIIIIIl("7/pAlkRDZ13Uyrf8xHyGHw==", "NjHMz");
        lIIlIIIIIlllI[lIIlIIIIIllll[13]] = lIlIIllllIIIIlI("JE3lFmj8InM=", "ePYWl");
        lIIlIIIIIlllI[lIIlIIIIIllll[14]] = lIlIIllllIIIIll("JAUw", "fjIQd");
        lIIlIIIIIlllI[lIIlIIIIIllll[18]] = lIlIIllllIIIIIl("KUiIFmLFFyuu9SBGZP07lDZOFLq/k7mHM5xtHMUtgV8=", "Nvuxj");
        lIIlIIIIIlllI[lIIlIIIIIllll[20]] = lIlIIllllIIIIll("NicNIg==", "rUbRN");
        lIIlIIIIIlllI[lIIlIIIIIllll[21]] = lIlIIllllIIIIlI("TbhVwl4lzf3Oqy20bahWcA==", "nxCvd");
        lIIlIIIIIlllI[lIIlIIIIIllll[22]] = lIlIIllllIIIIlI("OW3gyCRa/fkrOCyrE6odSg==", "tLzwi");
        lIIlIIIIIlllI[lIIlIIIIIllll[24]] = lIlIIllllIIIIIl("87PjvTtADybhxKfz2zxCnw==", "qYIcp");
        lIIlIIIIIlllI[lIIlIIIIIllll[25]] = lIlIIllllIIIIIl("qXE9KBvvwsU=", "MUjos");
        lIIlIIIIIlllI[lIIlIIIIIllll[26]] = lIlIIllllIIIIlI("80fmyD4wv3I=", "xrguT");
        lIIlIIIIIlllI[lIIlIIIIIllll[27]] = lIlIIllllIIIIlI("QYUhQxV0SkHWNn980b5hXIKq92a0ikG4", "iTdNf");
        lIIlIIIIIlllI[lIIlIIIIIllll[28]] = lIlIIllllIIIIIl("4WFSctIEB0I/14lCbTBcNpY4Gl+enxgp", "VoMIL");
        lIIlIIIIIlllI[lIIlIIIIIllll[29]] = lIlIIllllIIIIll("MAMmECoSBDI=", "svVrE");
        lIIlIIIIIlllI[lIIlIIIIIllll[30]] = lIlIIllllIIIIll("NRQiISEGVSQpKA8QPQ==", "auIHO");
        lIIlIIIIIlllI[lIIlIIIIIllll[31]] = lIlIIllllIIIIll("MTgbPg==", "uJtNN");
        lIIlIIIIIlllI[lIIlIIIIIllll[32]] = lIlIIllllIIIIll("HCgtCg==", "SXHdq");
        lIIlIIIIIlllI[lIIlIIIIIllll[33]] = lIlIIllllIIIIIl("fPrZsqTZQZA=", "lMika");
        lIIlIIIIIlllI[lIIlIIIIIllll[34]] = lIlIIllllIIIIll("MDQWAAIL", "cQwra");
        lIIlIIIIIlllI[lIIlIIIIIllll[35]] = lIlIIllllIIIIlI("09A0iSLXVZM=", "zLGtN");
        lIIlIIIIIlllI[lIIlIIIIIllll[36]] = lIlIIllllIIIIIl("xSWEuiK6XqkH2yIuMIcfhA==", "YnaQN");
        lIIlIIIIIlllI[lIIlIIIIIllll[37]] = lIlIIllllIIIIll("DS0/Jw==", "cXSKI");
        lIIlIIIIIlllI[lIIlIIIIIllll[38]] = lIlIIllllIIIIll("aQ==", "ItgOR");
        lIIlIIIIIlllI[lIIlIIIIIllll[40]] = lIlIIllllIIIIll("HA8VdSc9Tg40NDwLF3UxPRY=", "RncUS");
        lIIlIIIIIlllI[lIIlIIIIIllll[41]] = lIlIIllllIIIIlI("wtvimZvRl6UzTJIR49K3YQ==", "uktAw");
        lIIlIIIIIlllI[lIIlIIIIIllll[42]] = lIlIIllllIIIIll("GSQSLw8qZRQnBiMgDQ==", "MEyFa");
        lIIlIIIIIlllI[lIIlIIIIIllll[43]] = lIlIIllllIIIIlI("JaElgvF5RKc=", "WiyjU");
        lIIlIIIIIlllI[lIIlIIIIIllll[44]] = lIlIIllllIIIIll("NgUOKw==", "yukEo");
        lIIlIIIIIlllI[lIIlIIIIIllll[45]] = lIlIIllllIIIIIl("hwHGg9/Q/Yc=", "ejWcD");
        lIIlIIIIIlllI[lIIlIIIIIllll[46]] = lIlIIllllIIIIlI("wOyeRKkxuRE=", "cVEbU");
        lIIlIIIIIlllI[lIIlIIIIIllll[47]] = lIlIIllllIIIIll("Gx8DHgo2BQg=", "Xpmjc");
        lIIlIIIIIlllI[lIIlIIIIIllll[48]] = lIlIIllllIIIIlI("Tzsvryr5Qu8=", "odOWx");
        lIIlIIIIIlllI[lIIlIIIIIllll[49]] = lIlIIllllIIIIIl("wcgaM6K0Xjo=", "qopfB");
        lIIlIIIIIlllI[lIIlIIIIIllll[50]] = lIlIIllllIIIIll("GTIDbwY4cxYnFzIgEG8BJzwB", "WSuOr");
        lIIlIIIIIlllI[lIIlIIIIIllll[51]] = lIlIIllllIIIIlI("Q1TBJ5s6xO2XyWJUGd3Qgg==", "GLXBq");
        lIIlIIIIIlllI[lIIlIIIIIllll[52]] = lIlIIllllIIIIlI("raud+ply74Y=", "KQAzh");
        lIIlIIIIIlllI[lIIlIIIIIllll[53]] = lIlIIllllIIIIll("MDsYLz9FKxkkPRYt", "eHqAX");
        lIIlIIIIIlllI[lIIlIIIIIllll[54]] = lIlIIllllIIIIIl("A1mfGYfbYyM=", "cYnIx");
        lIIlIIIIIlllI[lIIlIIIIIllll[55]] = lIlIIllllIIIIll("GQEGLwI/", "ZicJq");
        lIIlIIIIIlllI[lIIlIIIIIllll[56]] = lIlIIllllIIIIll("LS4MFTsAbw8eIhYq", "eObqW");
        lIIlIIIIIlllI[lIIlIIIIIllll[57]] = lIlIIllllIIIIIl("MjDxx6jSpEbhIe96TVyQeA==", "pRDRH");
        lIIlIIIIIlllI[lIIlIIIIIllll[61]] = lIlIIllllIIIIll("PxQjFB0eGypQBhYZJhkfEA==", "wuMpq");
        lIIlIIIIIlllI[lIIlIIIIIllll[63]] = lIlIIllllIIIIll("ChstKg==", "NtBXF");
        lIIlIIIIIlllI[lIIlIIIIIllll[64]] = lIlIIllllIIIIIl("Qu/sAJF3cf9AxFFFaQFHvg==", "ODQIF");
        lIIlIIIIIlllI[lIIlIIIIIllll[65]] = lIlIIllllIIIIIl("gOwSbLDx/0KqE1JUfwaaHD1alO0Cxbam", "mXFNz");
        lIIlIIIIIlllI[lIIlIIIIIllll[66]] = lIlIIllllIIIIll("KjUs", "oTXPe");
        lIIlIIIIIlllI[lIIlIIIIIllll[67]] = lIlIIllllIIIIIl("l4l/kJc5NBLbbmZukzVoRg==", "ZOqOf");
        lIIlIIIIIlllI[lIIlIIIIIllll[68]] = lIlIIllllIIIIlI("N0UmF9qyzV5rg8y1d0gPrw==", "llHKM");
        lIIlIIIIIlllI[lIIlIIIIIllll[69]] = lIlIIllllIIIIll("CBoXKnc8Bgsq", "NseOW");
        lIIlIIIIIlllI[lIIlIIIIIllll[70]] = lIlIIllllIIIIlI("7Zip7c8+jHo=", "yFPqv");
        lIIlIIIIIlllI[lIIlIIIIIllll[71]] = lIlIIllllIIIIlI("G/jGdoEQEhA=", "kokNm");
        lIIlIIIIIlllI[lIIlIIIIIllll[72]] = lIlIIllllIIIIlI("7MxanwR9rW7s7JlWIlzoGg==", "cdihy");
        lIIlIIIIIlllI[lIIlIIIIIllll[73]] = lIlIIllllIIIIlI("hcD0/f/3RYg=", "iqmdE");
        lIIlIIIIIlllI[lIIlIIIIIllll[74]] = lIlIIllllIIIIll("ODs6JQ==", "zZVIl");
        lIIlIIIIIlllI[lIIlIIIIIllll[75]] = lIlIIllllIIIIIl("QDT9mo1Ewg8WqESdilXHEA==", "pbTLG");
        lIIlIIIIIlllI[lIIlIIIIIllll[76]] = lIlIIllllIIIIIl("A53AjYat1nE=", "hmEwX");
        lIIlIIIIIlllI[lIIlIIIIIllll[77]] = lIlIIllllIIIIIl("4Cz738xgPX22Q/OtLA6YPQKXHQoLZOav", "Yntel");
        lIIlIIIIIlllI[lIIlIIIIIllll[78]] = lIlIIllllIIIIll("DDAYBS02IkoCKng0Hw43LA==", "XEjkD");
        lIIlIIIIIlllI[lIIlIIIIIllll[79]] = lIlIIllllIIIIll("CDkB", "JVxzt");
        lIIlIIIIIlllI[lIIlIIIIIllll[80]] = lIlIIllllIIIIIl("6GlNodM9KFc=", "EELyR");
        lIIlIIIIIlllI[lIIlIIIIIllll[81]] = lIlIIllllIIIIlI("xUFWIDNgVvdxIRdmea+WjA==", "pYIIc");
        lIIlIIIIIlllI[lIIlIIIIIllll[83]] = lIlIIllllIIIIlI("FNEoAmZt+d/oIyWO7U9a92/p9KZcnmWn", "yisxG");
        lIIlIIIIIlllI[lIIlIIIIIllll[84]] = lIlIIllllIIIIll("PQcTahIcRhYvBRwIAWoVAwkR", "sfeJf");
        lIIlIIIIIlllI[lIIlIIIIIllll[85]] = lIlIIllllIIIIIl("NCzXaLadisjKcBrgs3pJ63hYrlX6qQ+v", "iytgj");
        lIIlIIIIIlllI[lIIlIIIIIllll[86]] = lIlIIllllIIIIIl("cnqUyFY6xLJ7Glya9iiJYw==", "vCGqN");
        lIIlIIIIIlllI[lIIlIIIIIllll[87]] = lIlIIllllIIIIll("JiocHxMPKEgAHxg=", "aOhkz");
        lIIlIIIIIlllI[lIIlIIIIIllll[88]] = lIlIIllllIIIIIl("cBryL3hz9C71JMR9j1R49Q==", "ZdjGN");
        lIIlIIIIIlllI[lIIlIIIIIllll[89]] = lIlIIllllIIIIlI("JVH0VdaeNuw=", "fumSU");
        lIIlIIIIIlllI[lIIlIIIIIllll[90]] = lIlIIllllIIIIll("Dzw7IzEiJjA=", "LSUWX");
        lIIlIIIIIlllI[lIIlIIIIIllll[91]] = lIlIIllllIIIIlI("4JW5kn5LsdA=", "MdfkL");
        lIIlIIIIIlllI[lIIlIIIIIllll[92]] = lIlIIllllIIIIll("bQ==", "MfqYp");
        lIIlIIIIIlllI[lIIlIIIIIllll[95]] = lIlIIllllIIIIIl("QvhWkICLF2wl8pSFHqZcXwP+jwU9PP0b", "qVBRL");
        lIIlIIIIIlllI[lIIlIIIIIllll[96]] = lIlIIllllIIIIIl("DC+uKcKQ9vAjKPohUEPH6SE/ZfgEZyJ8", "qPjBE");
        lIIlIIIIIlllI[lIIlIIIIIllll[97]] = lIlIIllllIIIIlI("PLAbuP55x/SNf8sIfNeQuGr4T81f99s9", "WJdLD");
        lIIlIIIIIlllI[lIIlIIIIIllll[98]] = lIlIIllllIIIIlI("KaKZQjJAR8BA1l2pPgIhYQ==", "hJMmv");
        lIIlIIIIIlllI[lIIlIIIIIllll[100]] = lIlIIllllIIIIll("PxstIQIeFCRlDBYUKCwAEA==", "wzCEn");
        lIIlIIIIIlllI[lIIlIIIIIllll[102]] = lIlIIllllIIIIlI("heVOBzrYjcReiokLrsIRQjFe4fmqsVUlkQgi+4oZeYjyAFTGUUXCf3lN/0ScVEjj", "ECdEy");
        lIIlIIIIIlllI[lIIlIIIIIllll[16]] = lIlIIllllIIIIIl("WshAvWuR9dQQRnkO2wTAvXnvic1Fvrxeof35sj5baZMGm5van799yvkbqxPkUIfB", "JCNva");
        lIIlIIIIIlllI[lIIlIIIIIllll[103]] = lIlIIllllIIIIlI("PFhQ4/SSkG5nGSa6w4TE3WwgbJW+qL1Cc90i+IF75+mVrOcwv6ds+s8vDSWZMP0R", "WvejY");
        lIIlIIIIIlllI[lIIlIIIIIllll[104]] = lIlIIllllIIIIll("BQBlESA3RSgZISEMKxdyIRA1AD47ADZcciESLAQxOgwrF3ImCmUyBwssCzc=", "ReEpR");
        lIIlIIIIIlllI[lIIlIIIIIllll[106]] = lIlIIllllIIIIlI("ZYl6jOZcVqgbR2GGhQw9qjODAQ7aal2vTHdcj5N9knzeLKAtAmYQJW0uEzV10J4m", "LpwnP");
        lIIlIIIIIlllI[lIIlIIIIIllll[116]] = lIlIIllllIIIIIl("VDnozG4NP7v/0ECKYL4KhBsMtl7MhYEp", "grKro");
        lIIlIIIIIlllI[lIIlIIIIIllll[117]] = lIlIIllllIIIIll("HDA8EGUBP3IAIA81Jh9lRg==", "nYRwE");
        lIIlIIIIIlllI[lIIlIIIIIllll[163]] = lIlIIllllIIIIll("HRgVLBwuUSIkFC0eCA==", "JqoMn");
        lIIlIIIIIlllI[lIIlIIIIIllll[164]] = lIlIIllllIIIIll("CQ4DNE0jAlUwTT8SECIZbhcZNAw9Als=", "NguQm");
        lIIlIIIIIlllI[lIIlIIIIIllll[165]] = lIlIIllllIIIIll("AmscCVM/PglL", "KLpes");
        lIIlIIIIIlllI[lIIlIIIIIllll[166]] = lIlIIllllIIIIlI("geVNbhcCNEYWj9OYEjefWTDjoEgxAA2x29PkN96y7PUnIiyc0ZaDHN7/O7I52F2f", "XIMvu");
        lIIlIIIIIlllI[lIIlIIIIIllll[167]] = lIlIIllllIIIIll("LBEGSA==", "utufw");
        lIIlIIIIIlllI[lIIlIIIIIllll[168]] = lIlIIllllIIIIll("BT4lMGkhdjAsK3I7JTA6NyR7", "RVDDN");
        lIIlIIIIIlllI[lIIlIIIIIllll[169]] = lIlIIllllIIIIlI("PBlbIxZ1NGXtzjfl2j29BKCqjNh/2/WaN1KohTlSxkc=", "vvmma");
    }

    private static boolean lIlIIllllIIlIIl(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIllllIIlIII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
        if (lIlIIllllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[13]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0217, code lost:
        if (lIlIIllllIIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0015p.lIIlIIIIIllll[22]) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lIIlIIIIIllll[3]];
        iArr7[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
        if (lIlIIllllIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIllll[8], lIIlIIIIIllll[109], lIIlIIIIIllll[110]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIIIIIllll[3]];
        iArr8[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
        if (lIlIIllllIIlIII(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIlIIIIIllll[3]];
            iArr9[lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
            if (lIlIIllllIIIllI(Bank.getFirst(iArr9).getQuantity(), lIIlIIIIIllll[33])) {
                bA.add(new C0003d(lIIlIIIIIllll[8], lIIlIIIIIllll[54], lIIlIIIIIllll[110]));
                "".length();
            }
        }
        int[] iArr10 = new int[lIIlIIIIIllll[3]];
        iArr10[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
        if (lIlIIllllIIlIII(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIIlIIIIIllll[3]];
            iArr11[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
            if (lIlIIllllIIlIII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlIIIIIllll[3]];
                iArr12[lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
            }
            if (lIlIIllllIIlIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIlIIIIIlllI[lIIlIIIIIllll[117]]);
            }) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIIllll[112], lIIlIIIIIllll[31], lIIlIIIIIllll[113]));
                "".length();
            }
            iArr = new int[lIIlIIIIIllll[3]];
            iArr[lIIlIIIIIllll[4]] = lIIlIIIIIllll[105];
            if (lIlIIllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIIllll[105], lIIlIIIIIllll[54], lIIlIIIIIllll[114]));
                "".length();
            }
            iArr2 = new int[lIIlIIIIIllll[3]];
            iArr2[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
            if (lIlIIllllIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[lIIlIIIIIllll[3]];
                iArr13[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (lIlIIllllIIlIII(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lIIlIIIIIllll[3]];
                    iArr14[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                }
                iArr3 = new int[lIIlIIIIIllll[3]];
                iArr3[lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                if (lIlIIllllIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    bA.add(new C0003d(lIIlIIIIIllll[108], lIIlIIIIIllll[13], C0007h.bv));
                    "".length();
                }
                iArr4 = new int[lIIlIIIIIllll[3]];
                iArr4[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                if (lIlIIllllIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlIIIIIllll[3]];
                    iArr15[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                    if (lIlIIllllIIIllI(Bank.getFirst(iArr15).getQuantity(), lIIlIIIIIllll[101])) {
                        bA.add(new C0003d(lIIlIIIIIllll[7], lIIlIIIIIllll[115], lIIlIIIIIllll[18]));
                        "".length();
                    }
                }
                iArr5 = new int[lIIlIIIIIllll[3]];
                iArr5[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                if (lIlIIllllIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIlIIIIIllll[3]];
                    iArr16[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                    if (lIlIIllllIIIllI(Bank.getFirst(iArr16).getQuantity(), lIIlIIIIIllll[101])) {
                        bA.add(new C0003d(lIIlIIIIIllll[5], lIIlIIIIIllll[115], lIIlIIIIIllll[18]));
                        "".length();
                    }
                }
                iArr6 = new int[lIIlIIIIIllll[3]];
                iArr6[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                if (lIlIIllllIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lIIlIIIIIllll[3]];
                    iArr17[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                    if (lIlIIllllIIIllI(Bank.getFirst(iArr17).getQuantity(), lIIlIIIIIllll[101])) {
                        bA.add(new C0003d(lIIlIIIIIllll[6], lIIlIIIIIllll[115], lIIlIIIIIllll[18]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bA.add(new C0003d(lIIlIIIIIllll[10], lIIlIIIIIllll[33], lIIlIIIIIllll[114]));
            "".length();
            iArr3 = new int[lIIlIIIIIllll[3]];
            iArr3[lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
            if (lIlIIllllIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIIlIIIIIllll[3]];
            iArr4[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
            if (lIlIIllllIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIlIIIIIllll[3]];
            iArr5[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
            if (lIlIIllllIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIlIIIIIllll[3]];
            iArr6[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
            if (lIlIIllllIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bA.add(new C0003d(lIIlIIIIIllll[9], lIIlIIIIIllll[13], lIIlIIIIIllll[111]));
        "".length();
        if (lIlIIllllIIlIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIlIIIIIlllI[lIIlIIIIIllll[117]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIlIIIIIllll[3]];
        iArr[lIIlIIIIIllll[4]] = lIIlIIIIIllll[105];
        if (lIlIIllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIlIIIIIllll[3]];
        iArr2[lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
        if (lIlIIllllIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIIllll[10], lIIlIIIIIllll[33], lIIlIIIIIllll[114]));
        "".length();
        iArr3 = new int[lIIlIIIIIllll[3]];
        iArr3[lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
        if (lIlIIllllIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIlIIIIIllll[3]];
        iArr4[lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
        if (lIlIIllllIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlIIIIIllll[3]];
        iArr5[lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
        if (lIlIIllllIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIlIIIIIllll[3]];
        iArr6[lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
        if (lIlIIllllIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }

    private static boolean lIlIIllllIIllIl(Object obj) {
        return obj == null;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        aP();
        return lIIlIIIIIllll[109];
    }

    private static String lIlIIllllIIIIll(String llllllllllllllIlllllllIIlllIlIll, String llllllllllllllIlllllllIIlllIlIlI) {
        String llllllllllllllIlllllllIIlllIlIll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllllIIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllllllIIlllIlIII = llllllllllllllIlllllllIIlllIlIlI.toCharArray();
        int llllllllllllllIlllllllIIlllIIlll = lIIlIIIIIllll[4];
        char[] charArray = llllllllllllllIlllllllIIlllIlIll2.toCharArray();
        int llllllllllllllIlllllllIIlllIIIII = charArray.length;
        int i2 = lIIlIIIIIllll[4];
        while (lIlIIllllIIIllI(i2, llllllllllllllIlllllllIIlllIIIII)) {
            sb.append((char) (charArray[i2] ^ llllllllllllllIlllllllIIlllIlIII[llllllllllllllIlllllllIIlllIIlll % llllllllllllllIlllllllIIlllIlIII.length]));
            "".length();
            llllllllllllllIlllllllIIlllIIlll++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIllllIIlllI(C0004e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[18])) {
            ?? r0 = lIIlIIIIIllll[3];
            "".length();
            return (-"   ".length()) > 0 ? ((((40 + 82) - 13) + 68) ^ (((55 + 80) - 42) + 94)) & (((37 ^ 35) ^ (162 ^ 174)) ^ (-" ".length())) : r0;
        }
        return lIIlIIIIIllll[4];
    }

    private static boolean lIlIIllllIIlllI(int i2, int i3) {
        return i2 >= i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIlIIIIIlllI[lIIlIIIIIllll[116]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIIllll[4];
    }

    private static boolean lIlIIllllIIIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIllllIIllll(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIllllIIlIll(int i2, int i3) {
        return i2 <= i3;
    }

    static {
        lIlIIllllIIIlIl();
        lIlIIllllIIIlII();
        eq = lIIlIIIIIllll[82];
        ei = lIIlIIIIIllll[0];
        es = lIIlIIIIIllll[60];
        et = lIIlIIIIIllll[39];
        em = lIIlIIIIIllll[1];
        ep = lIIlIIIIIllll[18];
        ek = lIIlIIIIIllll[2];
        eS = lIIlIIIIIllll[7];
        eo = lIIlIIIIIllll[14];
        eO = lIIlIIIIIllll[118];
        eT = lIIlIIIIIllll[5];
        ej = lIIlIIIIIllll[1];
        eQ = lIIlIIIIIllll[119];
        eR = lIIlIIIIIllll[120];
        eV = lIIlIIIIIllll[121];
        el = lIIlIIIIIllll[3];
        er = lIIlIIIIIllll[17];
        eX = lIIlIIIIIllll[9];
        en = lIIlIIIIIllll[12];
        eP = lIIlIIIIIllll[122];
        eU = lIIlIIIIIllll[6];
        eW = lIIlIIIIIllll[8];
        eu = lIIlIIIIIllll[19];
        dX = new WorldPoint(lIIlIIIIIllll[123], lIIlIIIIIllll[59], lIIlIIIIIllll[4]);
        dY = new WorldPoint(lIIlIIIIIllll[62], lIIlIIIIIllll[124], lIIlIIIIIllll[4]);
        dZ = new WorldPoint(lIIlIIIIIllll[125], lIIlIIIIIllll[94], lIIlIIIIIllll[4]);
        ea = new WorldArea(lIIlIIIIIllll[126], lIIlIIIIIllll[127], lIIlIIIIIllll[31], lIIlIIIIIllll[14], lIIlIIIIIllll[4]);
        eb = new WorldArea(lIIlIIIIIllll[128], lIIlIIIIIllll[127], lIIlIIIIIllll[30], lIIlIIIIIllll[14], lIIlIIIIIllll[4]);
        ec = new WorldArea(lIIlIIIIIllll[129], lIIlIIIIIllll[130], lIIlIIIIIllll[15], lIIlIIIIIllll[22], lIIlIIIIIllll[4]);
        ed = new WorldArea(lIIlIIIIIllll[131], lIIlIIIIIllll[132], lIIlIIIIIllll[24], lIIlIIIIIllll[15], lIIlIIIIIllll[4]);
        ee = new WorldArea(lIIlIIIIIllll[133], lIIlIIIIIllll[132], lIIlIIIIIllll[18], lIIlIIIIIllll[13], lIIlIIIIIllll[4]);
        ef = new WorldArea(lIIlIIIIIllll[134], lIIlIIIIIllll[135], lIIlIIIIIllll[21], lIIlIIIIIllll[18], lIIlIIIIIllll[4]);
        eg = new WorldArea(lIIlIIIIIllll[136], lIIlIIIIIllll[132], lIIlIIIIIllll[15], lIIlIIIIIllll[15], lIIlIIIIIllll[4]);
        eh = new WorldArea(lIIlIIIIIllll[137], lIIlIIIIIllll[132], lIIlIIIIIllll[15], lIIlIIIIIllll[13], lIIlIIIIIllll[4]);
        ev = new WorldPoint(lIIlIIIIIllll[138], lIIlIIIIIllll[139], lIIlIIIIIllll[1]);
        ew = new WorldPoint(lIIlIIIIIllll[140], lIIlIIIIIllll[141], lIIlIIIIIllll[4]);
        ex = new WorldPoint(lIIlIIIIIllll[142], lIIlIIIIIllll[127], lIIlIIIIIllll[4]);
        ey = new WorldPoint(lIIlIIIIIllll[143], lIIlIIIIIllll[144], lIIlIIIIIllll[4]);
        ez = new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[146], lIIlIIIIIllll[4]);
        eA = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[94], lIIlIIIIIllll[4]);
        eB = new WorldPoint(lIIlIIIIIllll[147], lIIlIIIIIllll[148], lIIlIIIIIllll[4]);
        eC = new WorldPoint(lIIlIIIIIllll[149], lIIlIIIIIllll[150], lIIlIIIIIllll[4]);
        eD = new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eE = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eF = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[152], lIIlIIIIIllll[4]);
        eG = new WorldPoint(lIIlIIIIIllll[136], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eH = new WorldPoint(lIIlIIIIIllll[136], lIIlIIIIIllll[152], lIIlIIIIIllll[4]);
        eI = new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[153], lIIlIIIIIllll[4]);
        eJ = new WorldPoint(lIIlIIIIIllll[62], lIIlIIIIIllll[135], lIIlIIIIIllll[4]);
        eK = new WorldPoint(lIIlIIIIIllll[154], lIIlIIIIIllll[155], lIIlIIIIIllll[4]);
        eL = new WorldArea(new WorldPoint(lIIlIIIIIllll[156], lIIlIIIIIllll[157], lIIlIIIIIllll[4]), new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[94], lIIlIIIIIllll[4]));
        eM = new WorldArea(new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[158], lIIlIIIIIllll[4]), new WorldPoint(lIIlIIIIIllll[159], lIIlIIIIIllll[160], lIIlIIIIIllll[4]));
        eN = new WorldArea(lIIlIIIIIllll[62], lIIlIIIIIllll[130], lIIlIIIIIllll[14], lIIlIIIIIllll[22], lIIlIIIIIllll[4]);
        bA = new ArrayList();
        eY = lIIlIIIIIllll[161];
        eZ = lIIlIIIIIllll[162];
        fa = lIIlIIIIIlllI[lIIlIIIIIllll[163]];
        String[] strArr = new String[lIIlIIIIIllll[14]];
        strArr[lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[164]];
        strArr[lIIlIIIIIllll[3]] = lIIlIIIIIlllI[lIIlIIIIIllll[165]];
        strArr[lIIlIIIIIllll[1]] = lIIlIIIIIlllI[lIIlIIIIIllll[166]];
        strArr[lIIlIIIIIllll[12]] = lIIlIIIIIlllI[lIIlIIIIIllll[167]];
        strArr[lIIlIIIIIllll[15]] = lIIlIIIIIlllI[lIIlIIIIIllll[168]];
        strArr[lIIlIIIIIllll[13]] = lIIlIIIIIlllI[lIIlIIIIIllll[169]];
        dP = strArr;
        int[] iArr = new int[lIIlIIIIIllll[15]];
        iArr[lIIlIIIIIllll[4]] = lIIlIIIIIllll[170];
        iArr[lIIlIIIIIllll[3]] = lIIlIIIIIllll[171];
        iArr[lIIlIIIIIllll[1]] = lIIlIIIIIllll[172];
        iArr[lIIlIIIIIllll[12]] = lIIlIIIIIllll[173];
        fb = iArr;
    }
}
