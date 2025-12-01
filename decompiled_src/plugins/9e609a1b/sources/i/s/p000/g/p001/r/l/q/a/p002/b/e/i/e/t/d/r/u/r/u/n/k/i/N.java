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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.N  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/N.class */
public class N implements M {

    /* renamed from: if  reason: not valid java name */
    public static /* synthetic */ int f0if;
    public static /* synthetic */ int ie;
    public static /* synthetic */ List<C0003d> bA;
    public static /* synthetic */ int ig;
    static /* synthetic */ WorldArea ij;
    static /* synthetic */ WorldArea ih;
    static /* synthetic */ WorldArea ii;
    private static /* synthetic */ int[] lIIIlllllIllI;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIIlllllIlIl;
    private static /* synthetic */ WorldPoint ik;

    private static boolean lIlIIllIIlllIIl(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIllIIllIlll(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[18])) {
            ?? r0 = lIIIlllllIllI[1];
            "".length();
            return (((82 ^ 46) ^ (25 ^ 74)) & (((((109 + 109) - 48) + 69) ^ (((76 + 21) - (-75)) + 20)) ^ (-" ".length()))) != 0 ? ((((57 + 76) - 76) + 76) ^ (((40 + 121) - 58) + 63)) & (((1 ^ 94) ^ (249 ^ 133)) ^ (-" ".length())) : r0;
        }
        return lIIIlllllIllI[0];
    }

    static {
        lIlIIllIIllIIII();
        lIlIIllIIlIlllI();
        bA = new ArrayList();
        ie = lIIIlllllIllI[27];
        f0if = lIIIlllllIllI[23];
        ih = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[0]);
        ii = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[1]);
        ij = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[2]);
        ik = new WorldPoint(lIIIlllllIllI[236], lIIIlllllIllI[237], lIIIlllllIllI[0]);
    }

    private static void lIlIIllIIllIIII() {
        lIIIlllllIllI = new int[239];
        lIIIlllllIllI[0] = (31 ^ 42) & ((23 ^ 34) ^ (-1));
        lIIIlllllIllI[1] = " ".length();
        lIIIlllllIllI[2] = "  ".length();
        lIIIlllllIllI[3] = (-24617) & 28079;
        lIIIlllllIllI[4] = (-21099) & 24559;
        lIIIlllllIllI[5] = (((128 + 135) - 175) + 51) ^ (((31 + 164) - 39) + 25);
        lIIIlllllIllI[6] = (225 ^ 183) ^ (255 ^ 154);
        lIIIlllllIllI[7] = (-16455) & 19966;
        lIIIlllllIllI[8] = (-28743) & 32222;
        lIIIlllllIllI[9] = "   ".length();
        lIIIlllllIllI[10] = (-26695) & 31694;
        lIIIlllllIllI[11] = (84 ^ 125) ^ (157 ^ 190);
        lIIIlllllIllI[12] = (-16441) & 24447;
        lIIIlllllIllI[13] = (-8225) & 16232;
        lIIIlllllIllI[14] = (-8215) & 16223;
        lIIIlllllIllI[15] = (-20627) & 24479;
        lIIIlllllIllI[16] = 154 ^ 158;
        lIIIlllllIllI[17] = (-4116) & 16095;
        lIIIlllllIllI[18] = (128 ^ 136) ^ (21 ^ 24);
        lIIIlllllIllI[19] = (-2053) & 14677;
        lIIIlllllIllI[20] = 106 ^ 108;
        lIIIlllllIllI[21] = (-16566) & 24575;
        lIIIlllllIllI[22] = 5 ^ 2;
        lIIIlllllIllI[23] = (-((-6625) & 32749)) & (-33) & 26541;
        lIIIlllllIllI[24] = 200 ^ 192;
        lIIIlllllIllI[25] = (-((-917) & 9173)) & (-1) & 27875;
        lIIIlllllIllI[26] = (((54 + 33) - 5) + 51) ^ (((138 + 110) - 145) + 37);
        lIIIlllllIllI[27] = (-((-28937) & 29962)) & (-10337) & 32507;
        lIIIlllllIllI[28] = (-(((70 + 11) - 51) + 108)) & (-289) & 12285;
        lIIIlllllIllI[29] = (-((-1059) & 21935)) & (-33) & 32764;
        lIIIlllllIllI[30] = (-20498) & 32351;
        lIIIlllllIllI[31] = (-((-4685) & 21471)) & (-2) & 28639;
        lIIIlllllIllI[32] = (-((-30722) & 31115)) & (-20485) & 32735;
        lIIIlllllIllI[33] = (-((-16042) & 32699)) & (-161) & 28667;
        lIIIlllllIllI[34] = (-20520) & 32487;
        lIIIlllllIllI[35] = (95 ^ 10) ^ (132 ^ 137);
        lIIIlllllIllI[36] = (-12497) & 32731;
        lIIIlllllIllI[37] = (((74 + 133) - 134) + 64) ^ (((51 + 6) - (-80)) + 24);
        lIIIlllllIllI[38] = 34 ^ 45;
        lIIIlllllIllI[39] = 134 ^ 180;
        lIIIlllllIllI[40] = (223 ^ 191) ^ (180 ^ 192);
        lIIIlllllIllI[41] = (108 ^ 59) ^ (86 ^ 24);
        lIIIlllllIllI[42] = (156 ^ 143) ^ (168 ^ 165);
        lIIIlllllIllI[43] = (-1169) & 1470;
        lIIIlllllIllI[44] = (((76 + 168) - 128) + 67) ^ (((10 + 55) - (-60)) + 14);
        lIIIlllllIllI[45] = (-((-3075) & 32335)) & (-1025) & 30591;
        lIIIlllllIllI[46] = (-12803) & 15271;
        lIIIlllllIllI[47] = (-((-1065) & 13881)) & (-16513) & 32763;
        lIIIlllllIllI[48] = (-((-17637) & 29943)) & (-16386) & 32115;
        lIIIlllllIllI[49] = 107 ^ 96;
        lIIIlllllIllI[50] = (-12961) & 16381;
        lIIIlllllIllI[51] = (-29709) & 32173;
        lIIIlllllIllI[52] = (-((-1349) & 14189)) & (-1) & 16255;
        lIIIlllllIllI[53] = (((81 + 10) - 44) + 133) ^ (((54 + 165) - 188) + 155);
        lIIIlllllIllI[54] = 85 ^ 71;
        lIIIlllllIllI[55] = (-((-1083) & 26175)) & (-5129) & 32703;
        lIIIlllllIllI[56] = (-21029) & 24444;
        lIIIlllllIllI[57] = (-4098) & 6579;
        lIIIlllllIllI[58] = (-((-10147) & 30631)) & (-163) & 24063;
        lIIIlllllIllI[59] = (-((-16747) & 25963)) & (-16909) & 28605;
        lIIIlllllIllI[60] = (-8721) & 12147;
        lIIIlllllIllI[61] = (27 ^ 17) ^ (174 ^ 178);
        lIIIlllllIllI[62] = -" ".length();
        lIIIlllllIllI[63] = 31 ^ 19;
        lIIIlllllIllI[64] = 38 ^ 43;
        lIIIlllllIllI[65] = 4 ^ 20;
        lIIIlllllIllI[66] = 24 ^ 9;
        lIIIlllllIllI[67] = 151 ^ 132;
        lIIIlllllIllI[68] = 58 ^ 47;
        lIIIlllllIllI[69] = (98 ^ 117) ^ ((10 ^ 67) & ((40 ^ 97) ^ (-1)));
        lIIIlllllIllI[70] = 9 ^ 17;
        lIIIlllllIllI[71] = (((31 + 40) - (-21)) + 41) ^ (((67 + 157) - 108) + 43);
        lIIIlllllIllI[72] = 103 ^ 124;
        lIIIlllllIllI[73] = (40 ^ 123) ^ (193 ^ 142);
        lIIIlllllIllI[74] = (176 ^ 144) ^ (147 ^ 174);
        lIIIlllllIllI[75] = 159 ^ 128;
        lIIIlllllIllI[76] = (-((-89) & 17369)) & (-8225) & 28671;
        lIIIlllllIllI[77] = (-24609) & 27958;
        lIIIlllllIllI[78] = ((4 + 31) - (-40)) + 62;
        lIIIlllllIllI[79] = 196 ^ 154;
        lIIIlllllIllI[80] = (-((-2611) & 31615)) & (-545) & 32767;
        lIIIlllllIllI[81] = (-((-6225) & 15091)) & (-20485) & 32759;
        lIIIlllllIllI[82] = (-((-19109) & 23526)) & (-16897) & 24525;
        lIIIlllllIllI[83] = (-769) & 3966;
        lIIIlllllIllI[84] = (-20995) & 24406;
        lIIIlllllIllI[85] = (-24842) & 28031;
        lIIIlllllIllI[86] = (-((-24677) & 29287)) & (-16545) & 24567;
        lIIIlllllIllI[87] = (-(((35 + 77) - 70) + 125)) & (-16897) & 20463;
        lIIIlllllIllI[88] = (-29573) & 32751;
        lIIIlllllIllI[89] = (-((-3383) & 32703)) & (-65) & 32766;
        lIIIlllllIllI[90] = (-((-5265) & 30623)) & (-33) & 28607;
        lIIIlllllIllI[91] = (-((-18745) & 31676)) & (-16433) & 32755;
        lIIIlllllIllI[92] = (-((-8657) & 29649)) & (-8477) & 32702;
        lIIIlllllIllI[93] = (-12821) & 16222;
        lIIIlllllIllI[94] = (-((-8458) & 25355)) & (-4261) & 24567;
        lIIIlllllIllI[95] = (228 ^ 187) ^ (((19 + 59) - (-34)) + 15);
        lIIIlllllIllI[96] = (-29185) & 32408;
        lIIIlllllIllI[97] = 176 ^ 145;
        lIIIlllllIllI[98] = (((195 + 188) - 346) + 188) ^ (((165 + 65) - 58) + 23);
        lIIIlllllIllI[99] = (((72 + 52) - 37) + 46) ^ (((80 + 46) - 23) + 63);
        lIIIlllllIllI[100] = (124 ^ 83) ^ (108 ^ 103);
        lIIIlllllIllI[101] = (245 ^ 163) ^ (53 ^ 70);
        lIIIlllllIllI[102] = (((14 + 75) - (-23)) + 71) ^ (((4 + 66) - (-72)) + 3);
        lIIIlllllIllI[103] = (((22 + 128) - 142) + 133) ^ (((141 + 35) - 63) + 57);
        lIIIlllllIllI[104] = (-((-8788) & 27231)) & (-641) & 27583;
        lIIIlllllIllI[105] = 13 ^ 36;
        lIIIlllllIllI[106] = 87 ^ 125;
        lIIIlllllIllI[107] = (235 ^ 133) ^ (255 ^ 186);
        lIIIlllllIllI[108] = 120 ^ 84;
        lIIIlllllIllI[109] = (((68 + 114) - 150) + 99) ^ (((130 + 132) - 224) + 136);
        lIIIlllllIllI[110] = 135 ^ 169;
        lIIIlllllIllI[111] = 19 ^ 60;
        lIIIlllllIllI[112] = (((91 + 29) - 49) + 74) ^ (((69 + 58) - 105) + 139);
        lIIIlllllIllI[113] = 112 ^ 65;
        lIIIlllllIllI[114] = (138 ^ 190) ^ ((172 ^ 133) & ((139 ^ 162) ^ (-1)));
        lIIIlllllIllI[115] = (-" ".length()) & (-16385) & 31218;
        lIIIlllllIllI[116] = (22 ^ 83) ^ (220 ^ 172);
        lIIIlllllIllI[117] = 104 ^ 94;
        lIIIlllllIllI[118] = (-((-12481) & 29893)) & (-513) & 32759;
        lIIIlllllIllI[119] = (217 ^ 155) ^ (241 ^ 132);
        lIIIlllllIllI[120] = 143 ^ 183;
        lIIIlllllIllI[121] = (-1539) & 16374;
        lIIIlllllIllI[122] = (((98 + 52) - 93) + 111) ^ (((109 + 72) - 148) + 112);
        lIIIlllllIllI[123] = 141 ^ 183;
        lIIIlllllIllI[124] = (17 ^ 121) ^ (150 ^ 197);
        lIIIlllllIllI[125] = (-((-20103) & 24295)) & (-24593) & 32255;
        lIIIlllllIllI[126] = (-16950) & 20415;
        lIIIlllllIllI[127] = (-21058) & 24559;
        lIIIlllllIllI[128] = (-((-26193) & 30298)) & (-533) & 8127;
        lIIIlllllIllI[129] = (-21001) & 24495;
        lIIIlllllIllI[130] = (-12385) & 15867;
        lIIIlllllIllI[131] = (-((-1157) & 30407)) & (-21) & 32767;
        lIIIlllllIllI[132] = (-((-11269) & 15877)) & (-16388) & 24467;
        lIIIlllllIllI[133] = (-((-3089) & 24153)) & (-19) & 24571;
        lIIIlllllIllI[134] = (-((-8091) & 32763)) & (-4109) & 32255;
        lIIIlllllIllI[135] = (-((-2483) & 18931)) & (-12291) & 32223;
        lIIIlllllIllI[136] = (-577) & 4043;
        lIIIlllllIllI[137] = (-25102) & 28607;
        lIIIlllllIllI[138] = (-20553) & 24025;
        lIIIlllllIllI[139] = (-((-3469) & 16366)) & (-16385) & 32767;
        lIIIlllllIllI[140] = (((133 + 143) - 219) + 94) ^ (((144 + 120) - 126) + 32);
        lIIIlllllIllI[141] = (((68 + 125) - 153) + 102) ^ (((113 + 44) - (-5)) + 15);
        lIIIlllllIllI[142] = 95 ^ 31;
        lIIIlllllIllI[143] = 78 ^ 15;
        lIIIlllllIllI[144] = (125 ^ 87) ^ (35 ^ 75);
        lIIIlllllIllI[145] = 18 ^ 81;
        lIIIlllllIllI[146] = 14 ^ 74;
        lIIIlllllIllI[147] = (70 ^ 76) ^ (230 ^ 169);
        lIIIlllllIllI[148] = 74 ^ 12;
        lIIIlllllIllI[149] = 98 ^ 37;
        lIIIlllllIllI[150] = 99 ^ 43;
        lIIIlllllIllI[151] = 107 ^ 34;
        lIIIlllllIllI[152] = 82 ^ 24;
        lIIIlllllIllI[153] = (52 ^ 21) ^ (7 ^ 109);
        lIIIlllllIllI[154] = 214 ^ 154;
        lIIIlllllIllI[155] = 43 ^ 102;
        lIIIlllllIllI[156] = 112 ^ 62;
        lIIIlllllIllI[157] = " ".length() ^ (18 ^ 92);
        lIIIlllllIllI[158] = 3 ^ 83;
        lIIIlllllIllI[159] = (158 ^ 151) ^ (226 ^ 186);
        lIIIlllllIllI[160] = 80 ^ 2;
        lIIIlllllIllI[161] = 111 ^ 60;
        lIIIlllllIllI[162] = (-4225) & 6911;
        lIIIlllllIllI[163] = (-16386) & 19839;
        lIIIlllllIllI[164] = (-20801) & 23519;
        lIIIlllllIllI[165] = (-((-7787) & 24427)) & (-5137) & 24477;
        lIIIlllllIllI[166] = (-8461) & 11167;
        lIIIlllllIllI[167] = (-9297) & 11993;
        lIIIlllllIllI[168] = (-(138 ^ 149)) & (-8545) & 11262;
        lIIIlllllIllI[169] = (-((-24833) & 25463)) & (-12297) & 16383;
        lIIIlllllIllI[170] = (-((-16809) & 30205)) & (-3) & 16127;
        lIIIlllllIllI[171] = (-16981) & 20468;
        lIIIlllllIllI[172] = 207 ^ 155;
        lIIIlllllIllI[173] = 20 ^ 65;
        lIIIlllllIllI[174] = (105 ^ 8) ^ (12 ^ 59);
        lIIIlllllIllI[175] = (((141 + 139) - 181) + 93) ^ (((25 + 68) - (-35)) + 23);
        lIIIlllllIllI[176] = (234 ^ 157) ^ (168 ^ 134);
        lIIIlllllIllI[177] = (161 ^ 151) ^ (118 ^ 26);
        lIIIlllllIllI[178] = 81 ^ 10;
        lIIIlllllIllI[179] = 108 ^ 48;
        lIIIlllllIllI[180] = (37 ^ 119) ^ (35 ^ 44);
        lIIIlllllIllI[181] = 93 ^ 2;
        lIIIlllllIllI[182] = (164 ^ 175) ^ (77 ^ 38);
        lIIIlllllIllI[183] = 248 ^ 153;
        lIIIlllllIllI[184] = (36 ^ 28) ^ (247 ^ 173);
        lIIIlllllIllI[185] = 235 ^ 136;
        lIIIlllllIllI[186] = 45 ^ 73;
        lIIIlllllIllI[187] = (124 ^ 110) ^ (118 ^ 1);
        lIIIlllllIllI[188] = 246 ^ 144;
        lIIIlllllIllI[189] = (-29065) & 32255;
        lIIIlllllIllI[190] = (-12457) & 15870;
        lIIIlllllIllI[191] = (-((-11585) & 32722)) & (-8449) & 32767;
        lIIIlllllIllI[192] = (-((-15361) & 31809)) & (-8705) & 28539;
        lIIIlllllIllI[193] = (-23) & 11871;
        lIIIlllllIllI[194] = (30 ^ 61) ^ (6 ^ 66);
        lIIIlllllIllI[195] = (-25089) & 30588;
        lIIIlllllIllI[196] = (-((-8201) & 15882)) & (-19) & 32699;
        lIIIlllllIllI[197] = (-19460) & 20359;
        lIIIlllllIllI[198] = (-((-1126) & 9327)) & (-22529) & 31679;
        lIIIlllllIllI[199] = (-((-14034) & 32467)) & (-12353) & 32735;
        lIIIlllllIllI[200] = (-((-12018) & 32763)) & (-1) & 29695;
        lIIIlllllIllI[201] = (-((-8897) & 29653)) & (-33) & 32766;
        lIIIlllllIllI[202] = (-((-26041) & 32186)) & (-641) & 32735;
        lIIIlllllIllI[203] = (65 ^ 70) ^ (45 ^ 66);
        lIIIlllllIllI[204] = (239 ^ 143) ^ (67 ^ 74);
        lIIIlllllIllI[205] = 43 ^ 65;
        lIIIlllllIllI[206] = (233 ^ 179) ^ (96 ^ 81);
        lIIIlllllIllI[207] = 110 ^ 2;
        lIIIlllllIllI[208] = (181 ^ 147) ^ (223 ^ 148);
        lIIIlllllIllI[209] = (-((-4613) & 14197)) & (-1) & 12287;
        lIIIlllllIllI[210] = (-((-2451) & 23511)) & (-49) & 24573;
        lIIIlllllIllI[211] = (17 ^ 70) ^ (83 ^ 106);
        lIIIlllllIllI[212] = (-8225) & 11693;
        lIIIlllllIllI[213] = (((203 + 61) - 120) + 106) ^ (((84 + 12) - (-45)) + 8);
        lIIIlllllIllI[214] = (-16673) & 19383;
        lIIIlllllIllI[215] = (-((-1299) & 22331)) & (-3) & 24510;
        lIIIlllllIllI[216] = 42 ^ 90;
        lIIIlllllIllI[217] = (-16449) & 19158;
        lIIIlllllIllI[218] = 54 ^ 71;
        lIIIlllllIllI[219] = (-12379) & 15099;
        lIIIlllllIllI[220] = (-20505) & 23997;
        lIIIlllllIllI[221] = 215 ^ 165;
        lIIIlllllIllI[222] = (-8201) & 11710;
        lIIIlllllIllI[223] = (-516) & 3999;
        lIIIlllllIllI[224] = 56 ^ 75;
        lIIIlllllIllI[225] = (-" ".length()) & (-4161) & 7663;
        lIIIlllllIllI[226] = (117 ^ 84) ^ (145 ^ 196);
        lIIIlllllIllI[227] = 220 ^ 169;
        lIIIlllllIllI[228] = (-((-4767) & 13023)) & (-4610) & 16343;
        lIIIlllllIllI[229] = (-20993) & 24484;
        lIIIlllllIllI[230] = (58 ^ 75) ^ (181 ^ 178);
        lIIIlllllIllI[231] = (-20545) & 24043;
        lIIIlllllIllI[232] = 102 ^ 17;
        lIIIlllllIllI[233] = 223 ^ 167;
        lIIIlllllIllI[234] = (-24579) & 28083;
        lIIIlllllIllI[235] = (-((-1429) & 18335)) & (-9281) & 28654;
        lIIIlllllIllI[236] = (-((-17569) & 25829)) & (-18) & 10751;
        lIIIlllllIllI[237] = (-8337) & 11773;
        lIIIlllllIllI[238] = (136 ^ 141) ^ (61 ^ 65);
    }

    private static boolean lIlIIllIIllIllI(int i2) {
        return i2 > 0;
    }

    private static void cF() {
        new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[47], lIIIlllllIllI[11], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[48], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[50], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[1]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[51], lIIIlllllIllI[52], lIIIlllllIllI[53], lIIIlllllIllI[54], lIIIlllllIllI[2]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[55], lIIIlllllIllI[56], lIIIlllllIllI[24], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[57], lIIIlllllIllI[58], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[0]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[59], lIIIlllllIllI[60], lIIIlllllIllI[11], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[47], lIIIlllllIllI[61], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        if (lIlIIllIIllIIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[11]];
            C0004e.a(ik);
            Time.sleepTicks(lIIIlllllIllI[1]);
            "".length();
        }
        if (!(lIlIIllIIllIIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIIllIIllIIIl(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIIllIIlllIII(Players.getLocal().getAnimation(), lIIIlllllIllI[62]) && lIlIIllIIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIlIIllIIllIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[49]];
                String[] strArr = new String[lIIIlllllIllI[1]];
                strArr[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[63]];
                TileObjects.getNearest(strArr).interact(lIIIlllllIlIl[lIIIlllllIllI[64]]);
                Time.sleepTicks(lIIIlllllIllI[2]);
                "".length();
            }
            if (lIlIIllIIllIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[53]];
                String[] strArr2 = new String[lIIIlllllIllI[1]];
                strArr2[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[38]];
                TileObjects.getNearest(strArr2).interact(lIIIlllllIlIl[lIIIlllllIllI[65]]);
                Time.sleepTicks(lIIIlllllIllI[2]);
                "".length();
            }
            if (lIlIIllIIllIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[66]];
                String[] strArr3 = new String[lIIIlllllIllI[1]];
                strArr3[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[54]];
                TileObjects.getNearest(strArr3).interact(lIIIlllllIlIl[lIIIlllllIllI[67]]);
                Time.sleepTicks(lIIIlllllIllI[2]);
                "".length();
            }
            if (lIlIIllIIllIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[40]];
                String[] strArr4 = new String[lIIIlllllIllI[1]];
                strArr4[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[68]];
                TileObjects.getNearest(strArr4).interact(lIIIlllllIlIl[lIIIlllllIllI[61]]);
                Time.sleepTicks(lIIIlllllIllI[18]);
                "".length();
            }
            if (lIlIIllIIllIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[69]];
                String[] strArr5 = new String[lIIIlllllIllI[1]];
                strArr5[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[70]];
                TileObjects.getNearest(strArr5).interact(lIIIlllllIlIl[lIIIlllllIllI[41]]);
                Time.sleepTicks(lIIIlllllIllI[16]);
                "".length();
            }
            if (lIlIIllIIllIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[71]];
                String[] strArr6 = new String[lIIIlllllIllI[1]];
                strArr6[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[72]];
                TileObjects.getNearest(strArr6).interact(lIIIlllllIlIl[lIIIlllllIllI[73]]);
                Time.sleepTicks(lIIIlllllIllI[9]);
                "".length();
            }
            if (lIlIIllIIllIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[74]];
                String[] strArr7 = new String[lIIIlllllIllI[1]];
                strArr7[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[42]];
                TileObjects.getNearest(strArr7).interact(lIIIlllllIlIl[lIIIlllllIllI[75]]);
                Time.sleepTicks(lIIIlllllIllI[16]);
                "".length();
            }
        }
    }

    private static String lIlIIllIIlIllII(String lllllllllllllllIIIIIIIIIlIIIIlIl, String lllllllllllllllIIIIIIIIIlIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIIIIlIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIIIIlIIIIlll.init(lIIIlllllIllI[2], secretKeySpec);
            return new String(lllllllllllllllIIIIIIIIIlIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIIIlIIIIllI) {
            lllllllllllllllIIIIIIIIIlIIIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIIlIlllI() {
        lIIIlllllIlIl = new String[lIIIlllllIllI[238]];
        lIIIlllllIlIl[lIIIlllllIllI[0]] = lIlIIllIIlIlIll("NTAhDiAQZTETKxo2", "wEXgN");
        lIIIlllllIlIl[lIIIlllllIllI[1]] = lIlIIllIIlIllII("h+jZ2c3ZpZ+/2pm+MpX+krxfihHQ5Vh8YCrBvPo7YT7u5b8qwBsp7kVJ3CBIgF/7CS+DSc3eQak=", "ufjIV");
        lIIIlllllIlIl[lIIIlllllIllI[2]] = lIlIIllIIlIlIll("KxY+LCIEAyErIkUDJ2UnBBkj", "ewHEE");
        lIIIlllllIlIl[lIIIlllllIllI[9]] = lIlIIllIIlIllII("tT2MZNgIqyl/sXs4KcPy8nK1o1HYdPci", "gssIU");
        lIIIlllllIlIl[lIIIlllllIllI[16]] = lIlIIllIIlIllIl("N0c7dhwp/tRrF964WHdEVn7DQ7R7QD8wMkIDjUhzif0pJeYj83bgfJZ1s5Gfou0+b6UZLMqQbp4=", "hIiYv");
        lIIIlllllIlIl[lIIIlllllIllI[18]] = lIlIIllIIlIllIl("Ix+08pq2Mv8=", "bOLsL");
        lIIIlllllIlIl[lIIIlllllIllI[20]] = lIlIIllIIlIllIl("mAupp9JE0/4=", "InimL");
        lIIIlllllIlIl[lIIIlllllIllI[22]] = lIlIIllIIlIllIl("k+hvjK7yv9o=", "wnFOu");
        lIIIlllllIlIl[lIIIlllllIllI[24]] = lIlIIllIIlIlIll("Ax4INCc=", "GlaZL");
        lIIIlllllIlIl[lIIIlllllIllI[26]] = lIlIIllIIlIlIll("AQo3", "DkCch");
        lIIIlllllIlIl[lIIIlllllIllI[11]] = lIlIIllIIlIlIll("ORISQQIYUwMPGRoWRAIZAgEXBA==", "wsdav");
        lIIIlllllIlIl[lIIIlllllIllI[49]] = lIlIIllIIlIllII("J62tihwYyuFjKaIlfJdm3A==", "pBXee");
        lIIIlllllIlIl[lIIIlllllIllI[63]] = lIlIIllIIlIllII("PQyUenkg0AhBjJQcdLChUg==", "bsvsc");
        lIIIlllllIlIl[lIIIlllllIllI[64]] = lIlIIllIIlIllIl("b7CrRu1RNGzHPsidDhAZuQ==", "yuAnc");
        lIIIlllllIlIl[lIIIlllllIllI[53]] = lIlIIllIIlIlIll("EwgCBRM5CgxIHzUQ", "Pdkhq");
        lIIIlllllIlIl[lIIIlllllIllI[38]] = lIlIIllIIlIlIll("Ig8XNQMOAQFhDAgZ", "mmdAb");
        lIIIlllllIlIl[lIIIlllllIllI[65]] = lIlIIllIIlIllIl("gSE2uJrWLGU5aF8nIWDJJw==", "ooKwz");
        lIIIlllllIlIl[lIIIlllllIllI[66]] = lIlIIllIIlIlIll("BgAlJhcsAitrFzcNIigd", "ElLKu");
        lIIIlllllIlIl[lIIIlllllIllI[54]] = lIlIIllIIlIllIl("NvlBVQylJnvnM1M/bnIo4g==", "QlnjV");
        lIIIlllllIlIl[lIIIlllllIllI[67]] = lIlIIllIIlIlIll("OxowFxA=", "xvYzr");
        lIIIlllllIlIl[lIIIlllllIllI[40]] = lIlIIllIIlIllII("2zyx35Q8enuoOy3FQN2wcQ==", "jLlkj");
        lIIIlllllIlIl[lIIIlllllIllI[68]] = lIlIIllIIlIlIll("KjM8KAgLOz4uRho9ICw=", "hRPIf");
        lIIIlllllIlIl[lIIIlllllIllI[61]] = lIlIIllIIlIllIl("TmTa8XSSsJE=", "ZnEvQ");
        lIIIlllllIlIl[lIIIlllllIllI[69]] = lIlIIllIIlIllII("L59pqcHkD5LYBbBQQT+ADQ==", "OUqaW");
        lIIIlllllIlIl[lIIIlllllIllI[70]] = lIlIIllIIlIllII("ZM3gXcA/K5AfqTOXY3Y2ug==", "nCGuK");
        lIIIlllllIlIl[lIIIlllllIllI[41]] = lIlIIllIIlIllII("lhCOOPX84lSshSOjrmD1ag==", "iIKfR");
        lIIIlllllIlIl[lIIIlllllIllI[71]] = lIlIIllIIlIllIl("bQfT7fiDQ6WzzWxs4KgW/Q==", "POSqQ");
        lIIIlllllIlIl[lIIIlllllIllI[72]] = lIlIIllIIlIllII("O5p1e9AYElTsRkT/Zm4R7g==", "ZgRQQ");
        lIIIlllllIlIl[lIIIlllllIllI[73]] = lIlIIllIIlIllIl("wp6A065nH6u3UxWiK5GCHQ==", "XyBqm");
        lIIIlllllIlIl[lIIIlllllIllI[74]] = lIlIIllIIlIllII("LTXEClnwSL29zxr4qr3dEA==", "QLkju");
        lIIIlllllIlIl[lIIIlllllIllI[42]] = lIlIIllIIlIllIl("/g7ENWZ2qjRQ4dNZoRNHHQ==", "IEUcW");
        lIIIlllllIlIl[lIIIlllllIllI[75]] = lIlIIllIIlIllII("+3L0bU9kqE9UORDCgNnN4g==", "RndRj");
        lIIIlllllIlIl[lIIIlllllIllI[95]] = lIlIIllIIlIllIl("lAVY3sivvIx6x/4PQEzjBQ==", "qavRW");
        lIIIlllllIlIl[lIIIlllllIllI[97]] = lIlIIllIIlIllIl("FVafMoLe4XgsS1deLyqk8g==", "nlDMz");
        lIIIlllllIlIl[lIIIlllllIllI[98]] = lIlIIllIIlIllIl("M0x4+7HQbxoRT5SkIe5n2A==", "zPVQZ");
        lIIIlllllIlIl[lIIIlllllIllI[99]] = lIlIIllIIlIllIl("yOZhDdRefgHQS9XCIN8If676hV8Ac/nI", "KboVy");
        lIIIlllllIlIl[lIIIlllllIllI[100]] = lIlIIllIIlIllIl("NpXHopWWWQ0=", "FzdrO");
        lIIIlllllIlIl[lIIIlllllIllI[101]] = lIlIIllIIlIllII("g9BTKboX1n8R4O9i5JCQ+g==", "RAdYy");
        lIIIlllllIlIl[lIIIlllllIllI[102]] = lIlIIllIIlIllIl("TmcJcjKP5NKntGUjYS8rtQ==", "WuQiv");
        lIIIlllllIlIl[lIIIlllllIllI[103]] = lIlIIllIIlIllII("Ep3DliyKAI8=", "mTVmI");
        lIIIlllllIlIl[lIIIlllllIllI[37]] = lIlIIllIIlIlIll("LQI2BAsHHj5XGwIfLR8dHVA1HhYL", "npYwx");
        lIIIlllllIlIl[lIIIlllllIllI[105]] = lIlIIllIIlIllIl("kqs04mtfNWNNlSWdRYaPsA==", "PdGpt");
        lIIIlllllIlIl[lIIIlllllIllI[106]] = lIlIIllIIlIllIl("aNhrzdEHpm4=", "giYcj");
        lIIIlllllIlIl[lIIIlllllIllI[107]] = lIlIIllIIlIllIl("3sot0KVGXsQ=", "EekpW");
        lIIIlllllIlIl[lIIIlllllIllI[108]] = lIlIIllIIlIllIl("6C+ye5KEvpo=", "WJWeu");
        lIIIlllllIlIl[lIIIlllllIllI[109]] = lIlIIllIIlIllII("pgkypcPqKpc=", "UnfLn");
        lIIIlllllIlIl[lIIIlllllIllI[110]] = lIlIIllIIlIllIl("8FgVb0E1SBvmaAHwG+ZTrg==", "Chzpm");
        lIIIlllllIlIl[lIIIlllllIllI[111]] = lIlIIllIIlIllIl("W0GsD/CvATY=", "fFzeX");
        lIIIlllllIlIl[lIIIlllllIllI[112]] = lIlIIllIIlIllIl("zykoG9Cejz8=", "NgzNh");
        lIIIlllllIlIl[lIIIlllllIllI[113]] = lIlIIllIIlIllIl("86XxfLZNf50gtQOuLGnlSA==", "zJNiZ");
        lIIIlllllIlIl[lIIIlllllIllI[39]] = lIlIIllIIlIllII("smUZR4bfDQ8=", "LdZJl");
        lIIIlllllIlIl[lIIIlllllIllI[6]] = lIlIIllIIlIllIl("2tWDrnknWKM=", "psQeN");
        lIIIlllllIlIl[lIIIlllllIllI[114]] = lIlIIllIIlIllII("yz4b66dGOOzUUvAtB/gJJg==", "XYjqP");
        lIIIlllllIlIl[lIIIlllllIllI[116]] = lIlIIllIIlIllII("yExdjqPr3gc=", "UsROt");
        lIIIlllllIlIl[lIIIlllllIllI[117]] = lIlIIllIIlIllII("o/1V71r1C/lBbZfoJL7V4w==", "KnSFO");
        lIIIlllllIlIl[lIIIlllllIllI[119]] = lIlIIllIIlIllII("Mf6RA7sVYVs=", "UWVFd");
        lIIIlllllIlIl[lIIIlllllIllI[120]] = lIlIIllIIlIllIl("gPjpkEmoYam+GvYQul3byw==", "PKkbB");
        lIIIlllllIlIl[lIIIlllllIllI[122]] = lIlIIllIIlIllII("6KUqni//uVg=", "vzOeE");
        lIIIlllllIlIl[lIIIlllllIllI[123]] = lIlIIllIIlIllII("J75volMkoyndssHnqSOto34upQ9SvV0M", "vadpE");
        lIIIlllllIlIl[lIIIlllllIllI[124]] = lIlIIllIIlIllIl("s3itOrcgBEA=", "mpjGb");
        lIIIlllllIlIl[lIIIlllllIllI[44]] = lIlIIllIIlIllII("5rv+QfedwO+rJ7pu0WPytw==", "pcYLU");
        lIIIlllllIlIl[lIIIlllllIllI[140]] = lIlIIllIIlIllII("HDh+MEajmikINLc4RIIpOG/b2j26nEnl", "xOwxc");
        lIIIlllllIlIl[lIIIlllllIllI[5]] = lIlIIllIIlIlIll("ITUCaRsAdAc9Dh0g", "oTtIo");
        lIIIlllllIlIl[lIIIlllllIllI[141]] = lIlIIllIIlIllIl("AspM3kBuC64V/7lrcyKQ1g==", "eWfJX");
        lIIIlllllIlIl[lIIIlllllIllI[142]] = lIlIIllIIlIllIl("omlRQBo7WOjr2rHtAktBVA==", "Eqves");
        lIIIlllllIlIl[lIIIlllllIllI[143]] = lIlIIllIIlIllIl("HEDqutSPojo=", "MzXUx");
        lIIIlllllIlIl[lIIIlllllIllI[144]] = lIlIIllIIlIllII("KK3Di9xcrBpx+j0bubEWPg==", "aUJeK");
        lIIIlllllIlIl[lIIIlllllIllI[145]] = lIlIIllIIlIllIl("b/wh4H5HWjsTlO4H0GjqTw==", "GESGg");
        lIIIlllllIlIl[lIIIlllllIllI[146]] = lIlIIllIIlIllIl("3WagVFLO1z4mlcS6KgveuMZ09nM5W0k/", "UzTgi");
        lIIIlllllIlIl[lIIIlllllIllI[147]] = lIlIIllIIlIllII("ogR+2TOHN4k=", "XRHzH");
        lIIIlllllIlIl[lIIIlllllIllI[148]] = lIlIIllIIlIllIl("7YPTP2rUHi6nvdCZQ1oIHA==", "UUzXk");
        lIIIlllllIlIl[lIIIlllllIllI[149]] = lIlIIllIIlIllIl("iFAiHkZsxfQ=", "VPIvF");
        lIIIlllllIlIl[lIIIlllllIllI[150]] = lIlIIllIIlIlIll("AwAVPwsnElgoAzlVSg==", "IuxOb");
        lIIIlllllIlIl[lIIIlllllIllI[151]] = lIlIIllIIlIlIll("LjEpBQ==", "dDDug");
        lIIIlllllIlIl[lIIIlllllIllI[152]] = lIlIIllIIlIllII("Z0zG6WUupVqq0k2uwcIBOg==", "pqxZr");
        lIIIlllllIlIl[lIIIlllllIllI[153]] = lIlIIllIIlIllIl("Q25sG3OMHCg=", "RqgHu");
        lIIIlllllIlIl[lIIIlllllIllI[154]] = lIlIIllIIlIllIl("AGb+AweylchYlYyO7te9Zg==", "zqoBe");
        lIIIlllllIlIl[lIIIlllllIllI[155]] = lIlIIllIIlIllIl("vvzgh113cVI=", "CSWXd");
        lIIIlllllIlIl[lIIIlllllIllI[156]] = lIlIIllIIlIllIl("5hY9w02fPiMFWyZxDbV1aQ==", "SVKvP");
        lIIIlllllIlIl[lIIIlllllIllI[157]] = lIlIIllIIlIllIl("bvOv57fxINc=", "vPiry");
        lIIIlllllIlIl[lIIIlllllIllI[158]] = lIlIIllIIlIllIl("2mrnWpzD6Zpy1wVfaF4rHQ==", "qSUsd");
        lIIIlllllIlIl[lIIIlllllIllI[159]] = lIlIIllIIlIlIll("OxgVAQ==", "qmxqn");
        lIIIlllllIlIl[lIIIlllllIllI[160]] = lIlIIllIIlIlIll("EAM0Iyg0EXk0ICpWbw==", "ZvYSA");
        lIIIlllllIlIl[lIIIlllllIllI[161]] = lIlIIllIIlIlIll("BhEFHQ==", "Ldhmj");
        lIIIlllllIlIl[lIIIlllllIllI[172]] = lIlIIllIIlIllII("wJ1sc/AlujfZOW5usZtWMzGW4vs6mjN5", "EzvCs");
        lIIIlllllIlIl[lIIIlllllIllI[173]] = lIlIIllIIlIlIll("AwcGYg0iRgM2GD8S", "MfpBy");
        lIIIlllllIlIl[lIIIlllllIllI[174]] = lIlIIllIIlIllII("CZv+q7I6Qy4eXHJ4kOUZHg==", "mgpJi");
        lIIIlllllIlIl[lIIIlllllIllI[175]] = lIlIIllIIlIllIl("FvCNs7IcRII=", "oQCZo");
        lIIIlllllIlIl[lIIIlllllIllI[35]] = lIlIIllIIlIllII("J0hN33V1Xm76Sw1HQ7Ty/w==", "ZXkuQ");
        lIIIlllllIlIl[lIIIlllllIllI[176]] = lIlIIllIIlIllII("NIXOUq6pMuCONGSMv/O/Bg==", "Xyact");
        lIIIlllllIlIl[lIIIlllllIllI[177]] = lIlIIllIIlIllIl("TcUBtwDPcb2fHqwUnfVRlQ==", "UCWeJ");
        lIIIlllllIlIl[lIIIlllllIllI[178]] = lIlIIllIIlIllIl("bQJz8q5HeoN6jFBZ26olvxSAcSfTzr8q", "dYFRC");
        lIIIlllllIlIl[lIIIlllllIllI[179]] = lIlIIllIIlIllII("yEH6bgktq8o=", "BYXUi");
        lIIIlllllIlIl[lIIIlllllIllI[180]] = lIlIIllIIlIlIll("BDQGJwggJkswAD5hWg==", "NAkWa");
        lIIIlllllIlIl[lIIIlllllIllI[79]] = lIlIIllIIlIllIl("BowOVgFdsUM=", "IzTRP");
        lIIIlllllIlIl[lIIIlllllIllI[181]] = lIlIIllIIlIllII("hpgTqy0HoaX2W9AJoZ9l0w==", "PAzNd");
        lIIIlllllIlIl[lIIIlllllIllI[182]] = lIlIIllIIlIllII("PtjJpJM4KxQ=", "ctjZc");
        lIIIlllllIlIl[lIIIlllllIllI[183]] = lIlIIllIIlIllII("EuODkzkx64E02MyZ6wrr9A==", "LSVCR");
        lIIIlllllIlIl[lIIIlllllIllI[184]] = lIlIIllIIlIllII("zRhT2XxRezc=", "ybujw");
        lIIIlllllIlIl[lIIIlllllIllI[185]] = lIlIIllIIlIlIll("PA0dCBgYH1AfEAZYRA==", "vxpxq");
        lIIIlllllIlIl[lIIIlllllIllI[186]] = lIlIIllIIlIlIll("KxIpHA==", "agDlV");
        lIIIlllllIlIl[lIIIlllllIllI[187]] = lIlIIllIIlIllII("Qb8+P/JSp9mKr3iSoU8FOQ==", "JLRMH");
        lIIIlllllIlIl[lIIIlllllIllI[188]] = lIlIIllIIlIlIll("IgYCBg==", "hsovH");
        lIIIlllllIlIl[lIIIlllllIllI[194]] = lIlIIllIIlIllIl("DzoYywF8GGm9V/9MJvy/NQhnJsygNVIr", "egNxX");
        lIIIlllllIlIl[lIIIlllllIllI[203]] = lIlIIllIIlIllII("itp5Hst5/mk=", "kFuoh");
        lIIIlllllIlIl[lIIIlllllIllI[204]] = lIlIIllIIlIllIl("UxYq+v0szv4=", "FYoDe");
        lIIIlllllIlIl[lIIIlllllIllI[205]] = lIlIIllIIlIlIll("BQILEhcSBg==", "ucxav");
        lIIIlllllIlIl[lIIIlllllIllI[206]] = lIlIIllIIlIlIll("HhA8GRQJFA==", "nqOju");
        lIIIlllllIlIl[lIIIlllllIllI[207]] = lIlIIllIIlIlIll("KAogKiA/Dg==", "XkSYA");
        lIIIlllllIlIl[lIIIlllllIllI[208]] = lIlIIllIIlIllII("Xi/A1UIbnG8=", "sNKwn");
        lIIIlllllIlIl[lIIIlllllIllI[211]] = lIlIIllIIlIllIl("ly/A+eHtaxQ=", "iKYNY");
        lIIIlllllIlIl[lIIIlllllIllI[213]] = lIlIIllIIlIlIll("HQwR", "ZmaHD");
        lIIIlllllIlIl[lIIIlllllIllI[216]] = lIlIIllIIlIlIll("MjAkEh4UNjMf", "fYCzj");
        lIIIlllllIlIl[lIIIlllllIllI[218]] = lIlIIllIIlIllII("TFc8Nj3uLvE=", "rawmx");
        lIIIlllllIlIl[lIIIlllllIllI[221]] = lIlIIllIIlIllIl("fJXhTpSubo4=", "QwmJQ");
        lIIIlllllIlIl[lIIIlllllIllI[224]] = lIlIIllIIlIllII("D3KZUrT2j7o=", "MgHxN");
        lIIIlllllIlIl[lIIIlllllIllI[226]] = lIlIIllIIlIllIl("4zl76dgeX1wetUOUebkd8g==", "MLkaq");
        lIIIlllllIlIl[lIIIlllllIllI[227]] = lIlIIllIIlIlIll("KDs7", "oZKVE");
        lIIIlllllIlIl[lIIIlllllIllI[230]] = lIlIIllIIlIllIl("ZfZFmJ9IrjM=", "hBxWq");
        lIIIlllllIlIl[lIIIlllllIllI[232]] = lIlIIllIIlIllIl("1wrvqbjuVPs=", "DMDBh");
        lIIIlllllIlIl[lIIIlllllIllI[233]] = lIlIIllIIlIllIl("pL0wdiQ63S0=", "BFOhl");
    }

    private static String lIlIIllIIlIllIl(String lllllllllllllllIIIIIIIIIIllllIII, String lllllllllllllllIIIIIIIIIIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIIIIlllIlll.getBytes(StandardCharsets.UTF_8)), lIIIlllllIllI[24]), "DES");
            Cipher lllllllllllllllIIIIIIIIIIllllIlI = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIIIIIllllIlI.init(lIIIlllllIllI[2], secretKeySpec);
            return new String(lllllllllllllllIIIIIIIIIIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIIIIllllIIl) {
            lllllllllllllllIIIIIIIIIIllllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllllIllI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIlIIllIIllIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.N.lIIIlllllIllI[11]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIlIIllIIllIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.N.lIIIlllllIllI[11]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIIIlllllIllI[1]];
        iArr4[lIIIlllllIllI[0]] = lIIIlllllIllI[15];
        if (lIlIIllIIllIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllIllI[15], lIIIlllllIllI[1], lIIIlllllIllI[195]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlllllIllI[1]];
        iArr5[lIIIlllllIllI[0]] = lIIIlllllIllI[17];
        if (lIlIIllIIllIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllIllI[17], lIIIlllllIllI[2], lIIIlllllIllI[196]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlllllIllI[1]];
        iArr6[lIIIlllllIllI[0]] = lIIIlllllIllI[27];
        if (lIlIIllIIllIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllIllI[27], lIIIlllllIllI[2], lIIIlllllIllI[196]));
            "".length();
        }
        int[] iArr7 = new int[lIIIlllllIllI[1]];
        iArr7[lIIIlllllIllI[0]] = lIIIlllllIllI[12];
        if (lIlIIllIIllIIll(Bank.contains(iArr7) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllIllI[12], lIIIlllllIllI[11], lIIIlllllIllI[197]));
            "".length();
        }
        int[] iArr8 = new int[lIIIlllllIllI[1]];
        iArr8[lIIIlllllIllI[0]] = lIIIlllllIllI[21];
        if (lIlIIllIIllIIll(Bank.contains(iArr8) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllIllI[21], lIIIlllllIllI[11], lIIIlllllIllI[198]));
            "".length();
        }
        int[] iArr9 = new int[lIIIlllllIllI[1]];
        iArr9[lIIIlllllIllI[0]] = lIIIlllllIllI[14];
        if (lIlIIllIIllIIll(Bank.contains(iArr9) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllIllI[14], lIIIlllllIllI[11], lIIIlllllIllI[198]));
            "".length();
        }
        int[] iArr10 = new int[lIIIlllllIllI[1]];
        iArr10[lIIIlllllIllI[0]] = lIIIlllllIllI[13];
        if (lIlIIllIIllIIll(Bank.contains(iArr10) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllIllI[13], lIIIlllllIllI[11], lIIIlllllIllI[198]));
            "".length();
        }
        int[] iArr11 = new int[lIIIlllllIllI[1]];
        iArr11[lIIIlllllIllI[0]] = lIIIlllllIllI[23];
        if (lIlIIllIIllIIIl(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIIlllllIllI[1]];
            iArr12[lIIIlllllIllI[0]] = lIIIlllllIllI[23];
            if (lIlIIllIIllIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIIlllllIllI[1]];
                iArr13[lIIIlllllIllI[0]] = lIIIlllllIllI[23];
            }
            iArr = new int[lIIIlllllIllI[1]];
            iArr[lIIIlllllIllI[0]] = lIIIlllllIllI[25];
            if (lIlIIllIIllIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIIIlllllIllI[1]];
                iArr14[lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (lIlIIllIIllIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIIlllllIllI[1]];
                    iArr15[lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                }
                iArr2 = new int[lIIIlllllIllI[1]];
                iArr2[lIIIlllllIllI[0]] = lIIIlllllIllI[201];
                if (lIlIIllIIllIIll(Bank.contains(iArr2) ? 1 : 0)) {
                    bA.add(new C0003d(lIIIlllllIllI[201], lIIIlllllIllI[1], lIIIlllllIllI[202]));
                    "".length();
                }
                iArr3 = new int[lIIIlllllIllI[1]];
                iArr3[lIIIlllllIllI[0]] = lIIIlllllIllI[19];
                if (lIlIIllIIllIIll(Bank.contains(iArr3) ? 1 : 0)) {
                    bA.add(new C0003d(lIIIlllllIllI[19], lIIIlllllIllI[40], C0007h.bv));
                    "".length();
                    return;
                }
                return;
            }
            bA.add(new C0003d(lIIIlllllIllI[25], lIIIlllllIllI[11], lIIIlllllIllI[200]));
            "".length();
            iArr2 = new int[lIIIlllllIllI[1]];
            iArr2[lIIIlllllIllI[0]] = lIIIlllllIllI[201];
            if (lIlIIllIIllIIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIIlllllIllI[1]];
            iArr3[lIIIlllllIllI[0]] = lIIIlllllIllI[19];
            if (lIlIIllIIllIIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bA.add(new C0003d(f0if, lIIIlllllIllI[44], lIIIlllllIllI[199]));
        "".length();
        iArr = new int[lIIIlllllIllI[1]];
        iArr[lIIIlllllIllI[0]] = lIIIlllllIllI[25];
        if (lIlIIllIIllIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllllIllI[25], lIIIlllllIllI[11], lIIIlllllIllI[200]));
        "".length();
        iArr2 = new int[lIIIlllllIllI[1]];
        iArr2[lIIIlllllIllI[0]] = lIIIlllllIllI[201];
        if (lIlIIllIIllIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIlllllIllI[1]];
        iArr3[lIIIlllllIllI[0]] = lIIIlllllIllI[19];
        if (lIlIIllIIllIIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllllIlIl[lIIIlllllIllI[203]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean S() {
        if (lIlIIllIIllIlll(Skills.getBoostedLevel(Skill.AGILITY), lIIIlllllIllI[37])) {
            int[] iArr = new int[lIIIlllllIllI[1]];
            iArr[lIIIlllllIllI[0]] = lIIIlllllIllI[12];
            if (lIlIIllIIllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlllllIllI[1]];
                iArr2[lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (lIlIIllIIllIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIlllllIllI[1]];
                    iArr3[lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                    if (lIlIIllIIllIIIl(Inventory.contains(iArr3) ? 1 : 0) && ((!lIlIIllIIllIIll(Inventory.contains(item -> {
                        return item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[207]]);
                    }) ? 1 : 0) || lIlIIllIIllIIIl(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[206]]);
                    }) ? 1 : 0)) && (!lIlIIllIIllIIll(Inventory.contains(C0005f.bk) ? 1 : 0) || lIlIIllIIllIIIl(Equipment.contains(C0005f.bk) ? 1 : 0)))) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return "  ".length() >= "   ".length() ? ((((16 + 3) - (-33)) + 81) ^ (((52 + 50) - (-56)) + 11)) & (((78 ^ 0) ^ (203 ^ 169)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return lIIIlllllIllI[0];
        }
        int[] iArr4 = new int[lIIIlllllIllI[1]];
        iArr4[lIIIlllllIllI[0]] = lIIIlllllIllI[12];
        if (lIlIIllIIllIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIIIlllllIllI[1]];
            iArr5[lIIIlllllIllI[0]] = lIIIlllllIllI[14];
            if (lIlIIllIIllIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIlllllIllI[1]];
                iArr6[lIIIlllllIllI[0]] = lIIIlllllIllI[13];
                if (lIlIIllIIllIIIl(Inventory.contains(iArr6) ? 1 : 0) && ((!lIlIIllIIllIIll(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[205]]);
                }) ? 1 : 0) || lIlIIllIIllIIIl(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[204]]);
                }) ? 1 : 0)) && (!lIlIIllIIllIIll(Inventory.contains(C0005f.bk) ? 1 : 0) || lIlIIllIIllIIIl(Equipment.contains(C0005f.bk) ? 1 : 0)))) {
                    ?? r02 = lIIIlllllIllI[1];
                    "".length();
                    return "  ".length() != "  ".length() ? ((77 ^ 55) ^ (9 ^ 41)) & (((53 ^ 73) ^ (84 ^ 114)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIIIlllllIllI[0];
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cE();
            "".length();
            if ((-" ".length()) >= 0) {
                return (15 ^ 28) & ((213 ^ 198) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllllIllI[186];
    }

    private static void cG() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[1]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[2]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[9]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[80], lIIIlllllIllI[81], lIIIlllllIllI[69], lIIIlllllIllI[64], lIIIlllllIllI[0]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[82], lIIIlllllIllI[81], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[83], lIIIlllllIllI[84], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[9]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[86], lIIIlllllIllI[26], lIIIlllllIllI[22], lIIIlllllIllI[1]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[87], lIIIlllllIllI[11], lIIIlllllIllI[24], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[88], lIIIlllllIllI[89], lIIIlllllIllI[75], lIIIlllllIllI[40], lIIIlllllIllI[9]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[90], lIIIlllllIllI[91], lIIIlllllIllI[66], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[93], lIIIlllllIllI[22], lIIIlllllIllI[26], lIIIlllllIllI[9]);
        WorldArea worldArea12 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[94], lIIIlllllIllI[11], lIIIlllllIllI[22], lIIIlllllIllI[9]);
        if (lIlIIllIIllIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[95]];
            if (lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIIIlllllIllI[96], lIIIlllllIllI[52], lIIIlllllIllI[0]));
            "".length();
            Time.sleepTicks(lIIIlllllIllI[1]);
            "".length();
        }
        if (lIlIIllIIlllIII(Players.getLocal().getAnimation(), lIIIlllllIllI[62]) && lIlIIllIIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIIIlllllIllI[1]];
            strArr[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIlIIllIIllIlII(nearest) && lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[98]];
                System.out.println(lIIIlllllIlIl[lIIIlllllIllI[99]]);
                nearest.interact(lIIIlllllIlIl[lIIIlllllIllI[100]]);
                Time.sleepTicks(lIIIlllllIllI[9]);
                "".length();
            }
            if (lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                if (lIlIIllIIllIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[101]];
                    int lllllllllllllllIIIIIIIIlllIIIllI = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIIIlllllIllI[1]];
                    strArr2[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[102]];
                    TileObjects.getNearest(strArr2).interact(lIIIlllllIlIl[lIIIlllllIllI[103]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (((14 ^ 62) ^ (244 ^ 159)) & (((71 ^ 100) ^ (242 ^ 138)) ^ (-" ".length()))) >= ((94 ^ 80) ^ (63 ^ 53)) ? ((((140 + 131) - 59) + 8) ^ (((76 + 78) - 14) + 19)) & (((((72 + 119) - 130) + 66) ^ (51 ^ 15)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[37]];
                    int lllllllllllllllIIIIIIIIlllIIIllI2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIIIlllllIllI[1]];
                    strArr3[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[105]];
                    TileObjects.getNearest(strArr3).interact(lIIIlllllIlIl[lIIIlllllIllI[106]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI2)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[107]];
                    int lllllllllllllllIIIIIIIIlllIIIllI3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIIIlllllIllI[1]];
                    strArr4[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[108]];
                    TileObjects.getNearest(strArr4).interact(lIIIlllllIlIl[lIIIlllllIllI[109]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI3)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (-" ".length()) > "   ".length() ? ((((93 + 35) - (-19)) + 12) ^ (((97 + 13) - (-27)) + 48)) & (((229 ^ 130) ^ (233 ^ 168)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[110]];
                    int lllllllllllllllIIIIIIIIlllIIIllI4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIIIlllllIllI[1]];
                    strArr5[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[111]];
                    TileObjects.getNearest(strArr5).interact(lIIIlllllIlIl[lIIIlllllIllI[112]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI4)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (-" ".length()) >= 0 ? ((((115 + 7) - 21) + 66) ^ (((92 + 39) - 36) + 73)) & (((((69 + 158) - 143) + 103) ^ (((133 + 94) - 69) + 22)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[113]];
                    int lllllllllllllllIIIIIIIIlllIIIllI5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIIIlllllIllI[1]];
                    strArr6[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[39]];
                    TileObjects.getNearest(strArr6).interact(lIIIlllllIlIl[lIIIlllllIllI[6]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI5)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (36 ^ 33) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[114]];
                    int lllllllllllllllIIIIIIIIlllIIIllI6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIIIlllllIllI[1]];
                    iArr[lIIIlllllIllI[0]] = lIIIlllllIllI[115];
                    TileObjects.getNearest(iArr).interact(lIIIlllllIlIl[lIIIlllllIllI[116]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI6)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[117]];
                    int lllllllllllllllIIIIIIIIlllIIIllI7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIIIlllllIllI[1]];
                    iArr2[lIIIlllllIllI[0]] = lIIIlllllIllI[118];
                    TileObjects.getNearest(iArr2).interact(lIIIlllllIlIl[lIIIlllllIllI[119]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI7)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[120]];
                    int lllllllllllllllIIIIIIIIlllIIIllI8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIIIlllllIllI[1]];
                    iArr3[lIIIlllllIllI[0]] = lIIIlllllIllI[121];
                    TileObjects.getNearest(iArr3).interact(lIIIlllllIlIl[lIIIlllllIllI[122]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI8)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIIIl(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[123]];
                    int lllllllllllllllIIIIIIIIlllIIIllI9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIIIlllllIllI[1]];
                    strArr7[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[124]];
                    TileObjects.getNearest(strArr7).interact(lIIIlllllIlIl[lIIIlllllIllI[44]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), lllllllllllllllIIIIIIIIlllIIIllI9)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (-" ".length()) > ((((157 + 186) - 266) + 110) ^ (((190 + 86) - 272) + 187)) ? ((55 ^ 107) ^ (24 ^ 39)) & (((205 ^ 159) ^ (62 ^ 15)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
        }
    }

    private static void cI() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[1]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[2]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[9]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[164], lIIIlllllIllI[133], lIIIlllllIllI[64], lIIIlllllIllI[11], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[165], lIIIlllllIllI[139], lIIIlllllIllI[38], lIIIlllllIllI[53], lIIIlllllIllI[2]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[166], lIIIlllllIllI[134], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[167], lIIIlllllIllI[136], lIIIlllllIllI[70], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[168], lIIIlllllIllI[169], lIIIlllllIllI[54], lIIIlllllIllI[63], lIIIlllllIllI[2]);
        WorldPoint worldPoint = new WorldPoint(lIIIlllllIllI[170], lIIIlllllIllI[171], lIIIlllllIllI[0]);
        if (lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIllIIllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIlllllIllI[1]);
            "".length();
        }
        if (lIlIIllIIllIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIIlllllIllI[1]);
                "".length();
            }
            if (lIlIIllIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIIlllllIllI[1]];
                strArr[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[175]];
                TileObjects.getNearest(strArr).interact(lIIIlllllIlIl[lIIIlllllIllI[35]]);
                Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return (-" ".length()) < (-" ".length()) ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                    }
                    return lIIIlllllIllI[0];
                }, lIIIlllllIllI[104]);
                "".length();
                Time.sleepTicks(lIIIlllllIllI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIIlllllIllI[1]];
        strArr2[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlIIllIIllIlII(nearest) && lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[177]];
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[178]]);
            nearest.interact(lIIIlllllIlIl[lIIIlllllIllI[179]]);
            Time.sleepTicks(lIIIlllllIllI[9]);
            "".length();
        }
        if (lIlIIllIIllIIll(cJ() ? 1 : 0)) {
            if (lIlIIllIIllIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[218]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[219], lIIIlllllIllI[220], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return ((177 ^ 168) & ((180 ^ 173) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[180]];
                    nearest2.interact(lIIIlllllIlIl[lIIIlllllIllI[79]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return "   ".length() <= 0 ? ((110 ^ 14) ^ (96 ^ 44)) & (((((43 + 104) - 5) + 40) ^ (((10 + 124) - (-6)) + 14)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlIIllIIllIIIl(tileObject2.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[216]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[217], lIIIlllllIllI[128], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return "  ".length() >= "   ".length() ? ((((132 + 5) - (-41)) + 37) ^ (((10 + 131) - 96) + 148)) & (((((12 + 14) - (-71)) + 73) ^ (((95 + 105) - 114) + 102)) ^ (-" ".length())) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest3)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIIlllllIlIl[lIIIlllllIllI[182]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlIIllIIllIIIl(tileObject3.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[213]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[214], lIIIlllllIllI[215], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return (-"  ".length()) >= 0 ? ((21 ^ 59) ^ (253 ^ 153)) & (((((73 + 138) - 128) + 114) ^ (((1 + 45) - (-64)) + 33)) ^ (-" ".length())) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest4)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIIlllllIlIl[lIIIlllllIllI[184]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlIIllIIllIIIl(tileObject4.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[211]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[209], lIIIlllllIllI[212], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest5)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIIlllllIlIl[lIIIlllllIllI[186]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (((20 ^ 40) ^ (167 ^ 146)) & (((205 ^ 177) ^ (249 ^ 140)) ^ (-" ".length()))) != 0 ? ((((35 + 82) - 4) + 30) ^ (((28 + 29) - 24) + 154)) & (((81 ^ 40) ^ (228 ^ 169)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (!lIlIIllIIllIIIl(cJ() ? 1 : 0) && lIlIIllIIllIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlIIllIIllIIIl(tileObject5.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[208]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[209], lIIIlllllIllI[210], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return 0 != 0 ? ("   ".length() ^ (140 ^ 170)) & (((43 ^ 88) ^ (19 ^ 69)) ^ (-" ".length())) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest6)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIIlllllIlIl[lIIIlllllIllI[188]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return "   ".length() < "   ".length() ? ((37 ^ 46) ^ (25 ^ 83)) & (((229 ^ 180) ^ (180 ^ 164)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlIIllIIlllIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIllIIllIlIl(int i2, int i3) {
        return i2 > i3;
    }

    private static String lIlIIllIIlIlIll(String lllllllllllllllIIIIIIIIIlIIllIlI, String lllllllllllllllIIIIIIIIIlIIllIIl) {
        String lllllllllllllllIIIIIIIIIlIIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIIlIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIIIIIIlIIlIlll = lllllllllllllllIIIIIIIIIlIIllIIl.toCharArray();
        int lllllllllllllllIIIIIIIIIlIIlIllI = lIIIlllllIllI[0];
        char[] charArray = lllllllllllllllIIIIIIIIIlIIllIlI2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllllIllI[0];
        while (lIlIIllIIllIIlI(i2, length)) {
            char lllllllllllllllIIIIIIIIIlIIllIll = charArray[i2];
            sb.append((char) (lllllllllllllllIIIIIIIIIlIIllIll ^ lllllllllllllllIIIIIIIIIlIIlIlll[lllllllllllllllIIIIIIIIIlIIlIllI % lllllllllllllllIIIIIIIIIlIIlIlll.length]));
            "".length();
            lllllllllllllllIIIIIIIIIlIIlIllI++;
            i2++;
            "".length();
            if ((((73 ^ 108) ^ (14 ^ 44)) & (((201 ^ 164) ^ (173 ^ 199)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIllIIllIIIl(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIllIIllIlll(int i2, int i3) {
        return i2 >= i3;
    }

    private static void cH() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[1]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[2]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[9]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[127], lIIIlllllIllI[128], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[129], lIIIlllllIllI[127], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[2]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[130], lIIIlllllIllI[131], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[2]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[132], lIIIlllllIllI[133], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[134], lIIIlllllIllI[8], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[135], lIIIlllllIllI[136], lIIIlllllIllI[68], lIIIlllllIllI[53], lIIIlllllIllI[9]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[137], lIIIlllllIllI[138], lIIIlllllIllI[63], lIIIlllllIllI[64], lIIIlllllIllI[2]);
        WorldPoint worldPoint = new WorldPoint(lIIIlllllIllI[137], lIIIlllllIllI[139], lIIIlllllIllI[0]);
        if (lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIllIIllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIlllllIllI[1]);
            "".length();
        }
        if (lIlIIllIIllIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[5]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIIlllllIllI[1]);
                "".length();
            }
            if (lIlIIllIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIIlllllIllI[1]];
                strArr[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[142]];
                TileObjects.getNearest(strArr).interact(lIIIlllllIlIl[lIIIlllllIllI[143]]);
                Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllllIllI[0];
                }, lIIIlllllIllI[104]);
                "".length();
                Time.sleepTicks(lIIIlllllIllI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIIlllllIllI[1]];
        strArr2[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlIIllIIllIlII(nearest) && lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[145]];
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[146]]);
            nearest.interact(lIIIlllllIlIl[lIIIlllllIllI[147]]);
            Time.sleepTicks(lIIIlllllIllI[9]);
            "".length();
        }
        if (lIlIIllIIllIIll(cJ() ? 1 : 0)) {
            if (lIlIIllIIllIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[233]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[234], lIIIlllllIllI[131], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return "   ".length() <= " ".length() ? ((206 ^ 181) ^ (191 ^ 138)) & (((((28 + 155) - 9) + 19) ^ (((93 + 28) - 7) + 29)) ^ (-" ".length())) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[148]];
                    nearest2.interact(lIIIlllllIlIl[lIIIlllllIllI[149]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return ((103 ^ 122) & ((49 ^ 44) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlIIllIIllIIIl(tileObject2.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[232]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[131], lIIIlllllIllI[225], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return 0 != 0 ? ((197 ^ 189) ^ (167 ^ 129)) & (((97 ^ 58) ^ (95 ^ 90)) ^ (-" ".length())) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest3)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIIlllllIlIl[lIIIlllllIllI[151]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? ((131 ^ 199) ^ (79 ^ 72)) & (((((120 + 2) - 41) + 133) ^ (((133 + 2) - 64) + 78)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlIIllIIllIIIl(tileObject3.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[230]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[139], lIIIlllllIllI[231], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest4)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIIlllllIlIl[lIIIlllllIllI[153]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (164 ^ 160) <= (" ".length() & (" ".length() ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlIIllIIllIIIl(tileObject4.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[227]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[228], lIIIlllllIllI[229], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest5)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIIlllllIlIl[lIIIlllllIllI[155]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (27 ^ 31) < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlIIllIIllIIIl(tileObject5.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[226]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[8], lIIIlllllIllI[130], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest6)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIIlllllIlIl[lIIIlllllIllI[157]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (81 ^ 85) < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (lIlIIllIIllIIIl(cJ() ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIllIIIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIlIIllIIllIIIl(tileObject6.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[224]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[225], lIIIlllllIllI[215], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return "  ".length() > "  ".length() ? ((3 ^ 13) ^ (114 ^ 92)) & (((13 ^ 117) ^ (199 ^ 159)) ^ (-" ".length())) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest7)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIIIlllllIlIl[lIIIlllllIllI[159]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (((49 ^ 23) ^ (210 ^ 168)) & (((54 ^ 86) ^ (159 ^ 163)) ^ (-" ".length()))) > (((((182 + 139) - 136) + 3) ^ (((108 + 107) - 70) + 35)) & (((((128 + 86) - 186) + 108) ^ (((101 + 66) - 153) + 114)) ^ (-" ".length()))) ? (((50 ^ 63) & ((55 ^ 58) ^ (-1))) ^ (195 ^ 138)) & (((84 ^ 60) ^ (224 ^ 193)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
            if (!lIlIIllIIllIIIl(cJ() ? 1 : 0) && lIlIIllIIllIIIl(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIlIIllIIllIIIl(tileObject7.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[221]]) ? 1 : 0) && lIlIIllIIlllIIl(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[222], lIIIlllllIllI[223], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                        ?? r0 = lIIIlllllIllI[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllllIllI[0];
                });
                if (lIlIIllIIllIlII(nearest8)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIIIlllllIlIl[lIIIlllllIllI[161]]);
                    Time.sleepTicks(C0004e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIllIIllIlIl(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIIlllllIllI[1];
                            "".length();
                            return (-((78 ^ 26) ^ (114 ^ 34))) > 0 ? ((105 ^ 115) ^ (85 ^ 98)) & (((251 ^ 144) ^ (240 ^ 182)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllllIllI[0];
                    }, lIIIlllllIllI[104]);
                    "".length();
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    private static boolean cJ() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[80], lIIIlllllIllI[81], lIIIlllllIllI[69], lIIIlllllIllI[64], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[82], lIIIlllllIllI[81], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[83], lIIIlllllIllI[84], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[9]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[189], lIIIlllllIllI[190], lIIIlllllIllI[24], lIIIlllllIllI[18], lIIIlllllIllI[1]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[87], lIIIlllllIllI[11], lIIIlllllIllI[24], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[191], lIIIlllllIllI[192], lIIIlllllIllI[73], lIIIlllllIllI[38], lIIIlllllIllI[9]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[90], lIIIlllllIllI[91], lIIIlllllIllI[66], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[93], lIIIlllllIllI[22], lIIIlllllIllI[26], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[94], lIIIlllllIllI[11], lIIIlllllIllI[22], lIIIlllllIllI[9]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[127], lIIIlllllIllI[128], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[129], lIIIlllllIllI[127], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[2]);
        WorldArea worldArea12 = new WorldArea(lIIIlllllIllI[130], lIIIlllllIllI[131], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[2]);
        WorldArea worldArea13 = new WorldArea(lIIIlllllIllI[132], lIIIlllllIllI[133], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea14 = new WorldArea(lIIIlllllIllI[134], lIIIlllllIllI[8], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea15 = new WorldArea(lIIIlllllIllI[135], lIIIlllllIllI[136], lIIIlllllIllI[68], lIIIlllllIllI[53], lIIIlllllIllI[9]);
        WorldArea worldArea16 = new WorldArea(lIIIlllllIllI[137], lIIIlllllIllI[138], lIIIlllllIllI[63], lIIIlllllIllI[64], lIIIlllllIllI[2]);
        WorldArea worldArea17 = new WorldArea(lIIIlllllIllI[164], lIIIlllllIllI[133], lIIIlllllIllI[64], lIIIlllllIllI[11], lIIIlllllIllI[9]);
        WorldArea worldArea18 = new WorldArea(lIIIlllllIllI[165], lIIIlllllIllI[139], lIIIlllllIllI[38], lIIIlllllIllI[53], lIIIlllllIllI[2]);
        WorldArea worldArea19 = new WorldArea(lIIIlllllIllI[166], lIIIlllllIllI[134], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea20 = new WorldArea(lIIIlllllIllI[167], lIIIlllllIllI[136], lIIIlllllIllI[70], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea21 = new WorldArea(lIIIlllllIllI[168], lIIIlllllIllI[169], lIIIlllllIllI[54], lIIIlllllIllI[63], lIIIlllllIllI[2]);
        WorldArea[] worldAreaArr = new WorldArea[lIIIlllllIllI[68]];
        worldAreaArr[lIIIlllllIllI[0]] = worldArea;
        worldAreaArr[lIIIlllllIllI[1]] = worldArea2;
        worldAreaArr[lIIIlllllIllI[2]] = worldArea3;
        worldAreaArr[lIIIlllllIllI[9]] = worldArea4;
        worldAreaArr[lIIIlllllIllI[16]] = worldArea5;
        worldAreaArr[lIIIlllllIllI[18]] = worldArea6;
        worldAreaArr[lIIIlllllIllI[20]] = worldArea7;
        worldAreaArr[lIIIlllllIllI[22]] = worldArea8;
        worldAreaArr[lIIIlllllIllI[24]] = worldArea9;
        worldAreaArr[lIIIlllllIllI[26]] = worldArea10;
        worldAreaArr[lIIIlllllIllI[11]] = worldArea11;
        worldAreaArr[lIIIlllllIllI[49]] = worldArea12;
        worldAreaArr[lIIIlllllIllI[63]] = worldArea13;
        worldAreaArr[lIIIlllllIllI[64]] = worldArea14;
        worldAreaArr[lIIIlllllIllI[53]] = worldArea15;
        worldAreaArr[lIIIlllllIllI[38]] = worldArea16;
        worldAreaArr[lIIIlllllIllI[65]] = worldArea17;
        worldAreaArr[lIIIlllllIllI[66]] = worldArea18;
        worldAreaArr[lIIIlllllIllI[54]] = worldArea19;
        worldAreaArr[lIIIlllllIllI[67]] = worldArea20;
        worldAreaArr[lIIIlllllIllI[40]] = worldArea21;
        int[] iArr = new int[lIIIlllllIllI[1]];
        iArr[lIIIlllllIllI[0]] = lIIIlllllIllI[193];
        if (lIlIIllIIllIlII(TileItems.getNearest(iArr))) {
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[194]]);
            int i2 = lIIIlllllIllI[0];
            while (lIlIIllIIllIIlI(i2, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i2];
                int[] iArr2 = new int[lIIIlllllIllI[1]];
                iArr2[lIIIlllllIllI[0]] = lIIIlllllIllI[193];
                if (lIlIIllIIllIIIl(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIlIIllIIllIIIl(worldAreaArr[i2].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIIlllllIllI[1];
                }
                i2++;
                "".length();
                if (" ".length() == ((24 ^ 69) ^ (120 ^ 33))) {
                    return ((128 ^ 155) ^ (128 ^ 181)) & (((44 ^ 124) ^ (82 ^ 44)) ^ (-" ".length()));
                }
            }
        }
        return lIIIlllllIllI[0];
    }

    private static boolean lIlIIllIIllIIlI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v212, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v256, types: [boolean] */
    public static void cE() {
        if (lIlIIllIIllIIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[0]];
            C0001b.a(bA);
            if (lIlIIllIIllIIlI(bA.size(), lIIIlllllIllI[1])) {
                System.out.println(lIIIlllllIlIl[lIIIlllllIllI[1]]);
                by = lIIIlllllIllI[0];
            }
        }
        if (lIlIIllIIllIIll(by ? 1 : 0)) {
            if (lIlIIllIIllIIll(S() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllIIllIlII(nearest) && lIlIIllIIllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[2]];
                    if (lIlIIllIIllIIIl(new WorldArea(lIIIlllllIllI[3], lIIIlllllIllI[4], lIIIlllllIllI[5], lIIIlllllIllI[6], lIIIlllllIllI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIIlllllIllI[7], lIIIlllllIllI[8], lIIIlllllIllI[0]);
                        if (lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllllIllI[9])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIIlllllIllI[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIlIIllIIllIlII(nearest) && lIlIIllIIllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[9]];
                    if (lIlIIllIIllIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllllIllI[10]);
                        "".length();
                    }
                    if (lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIllIIllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllllIllI[1]);
                            "".length();
                        }
                        if (lIlIIllIIllIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllllIllI[2]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIIIlllllIllI[11]];
                    iArr[lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                    iArr[lIIIlllllIllI[1]] = lIIIlllllIllI[13];
                    iArr[lIIIlllllIllI[2]] = lIIIlllllIllI[14];
                    iArr[lIIIlllllIllI[9]] = lIIIlllllIllI[15];
                    iArr[lIIIlllllIllI[16]] = lIIIlllllIllI[17];
                    iArr[lIIIlllllIllI[18]] = lIIIlllllIllI[19];
                    iArr[lIIIlllllIllI[20]] = lIIIlllllIllI[21];
                    iArr[lIIIlllllIllI[22]] = lIIIlllllIllI[23];
                    iArr[lIIIlllllIllI[24]] = lIIIlllllIllI[25];
                    iArr[lIIIlllllIllI[26]] = lIIIlllllIllI[27];
                    if (lIlIIllIIllIIll(C0004e.b(iArr) ? 1 : 0)) {
                        W();
                        System.out.println(lIIIlllllIlIl[lIIIlllllIllI[16]]);
                        by = lIIIlllllIllI[1];
                        return;
                    }
                    int[] iArr2 = new int[lIIIlllllIllI[11]];
                    iArr2[lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                    iArr2[lIIIlllllIllI[1]] = lIIIlllllIllI[13];
                    iArr2[lIIIlllllIllI[2]] = lIIIlllllIllI[14];
                    iArr2[lIIIlllllIllI[9]] = lIIIlllllIllI[15];
                    iArr2[lIIIlllllIllI[16]] = lIIIlllllIllI[17];
                    iArr2[lIIIlllllIllI[18]] = lIIIlllllIllI[19];
                    iArr2[lIIIlllllIllI[20]] = lIIIlllllIllI[21];
                    iArr2[lIIIlllllIllI[22]] = lIIIlllllIllI[23];
                    iArr2[lIIIlllllIllI[24]] = lIIIlllllIllI[25];
                    iArr2[lIIIlllllIllI[26]] = lIIIlllllIllI[27];
                    if (lIlIIllIIllIIIl(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIIIlllllIllI[28], lIIIlllllIllI[1]);
                        C0000a.a(lIIIlllllIllI[29], lIIIlllllIllI[1]);
                        C0000a.a(lIIIlllllIllI[30], lIIIlllllIllI[1]);
                        C0000a.a(lIIIlllllIllI[31], lIIIlllllIllI[1]);
                        C0000a.a(lIIIlllllIllI[32], lIIIlllllIllI[1]);
                        C0000a.a(lIIIlllllIllI[33], lIIIlllllIllI[1]);
                        C0000a.a(lIIIlllllIllI[34], lIIIlllllIllI[1]);
                        int[] iArr3 = new int[lIIIlllllIllI[1]];
                        iArr3[lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                        if (lIlIIllIIllIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIlllllIllI[1]];
                            iArr4[lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                            if (lIlIIllIIllIIll(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIIIlllllIllI[1]];
                                iArr5[lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                                if (lIlIIllIIllIIll(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIIIlllllIllI[35], lIIIlllllIllI[1]);
                                }
                            }
                        }
                        C0000a.a(lIIIlllllIllI[17], lIIIlllllIllI[1]);
                        C0004e.l(lIIIlllllIllI[28]);
                        C0004e.l(lIIIlllllIllI[29]);
                        C0004e.l(lIIIlllllIllI[30]);
                        C0004e.l(lIIIlllllIllI[31]);
                        C0004e.l(lIIIlllllIllI[32]);
                        Time.sleepTicks(lIIIlllllIllI[1]);
                        "".length();
                        C0004e.l(lIIIlllllIllI[34]);
                        C0004e.l(lIIIlllllIllI[36]);
                        C0004e.l(lIIIlllllIllI[33]);
                        C0004e.l(lIIIlllllIllI[35]);
                        C0004e.l(lIIIlllllIllI[17]);
                        Time.sleepTicks(lIIIlllllIllI[9]);
                        "".length();
                        if (lIlIIllIIllIIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIIlllllIllI[20]);
                            "".length();
                        }
                        if (lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (lIlIIllIIllIIlI(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[37])) {
                                C0000a.a(lIIIlllllIllI[12], lIIIlllllIllI[11]);
                                C0000a.a(lIIIlllllIllI[13], lIIIlllllIllI[11]);
                                C0000a.a(lIIIlllllIllI[21], lIIIlllllIllI[11]);
                                C0000a.a(lIIIlllllIllI[14], lIIIlllllIllI[11]);
                                C0000a.b(C0005f.bk, lIIIlllllIllI[1]);
                                C0000a.a(lIIIlllllIllI[27], lIIIlllllIllI[1]);
                                C0000a.a(lIIIlllllIllI[19], lIIIlllllIllI[18]);
                                C0000a.a(lIIIlllllIllI[23], lIIIlllllIllI[38]);
                            }
                            if (lIlIIllIIllIlll(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[37])) {
                                C0000a.a(lIIIlllllIllI[12], lIIIlllllIllI[11]);
                                C0000a.a(lIIIlllllIllI[21], lIIIlllllIllI[11]);
                                C0000a.a(lIIIlllllIllI[25], lIIIlllllIllI[11]);
                                C0000a.b(C0005f.bk, lIIIlllllIllI[1]);
                                C0000a.a(lIIIlllllIllI[27], lIIIlllllIllI[1]);
                                C0000a.a(lIIIlllllIllI[19], lIIIlllllIllI[24]);
                                C0000a.a(lIIIlllllIllI[23], lIIIlllllIllI[11]);
                            }
                        }
                    }
                }
            }
            if (lIlIIllIIllIIIl(S() ? 1 : 0)) {
                String[] strArr = new String[lIIIlllllIllI[1]];
                strArr[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[18]];
                if (lIlIIllIIllIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIlllllIllI[1]];
                    strArr2[lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[20]];
                    Inventory.getFirst(strArr2).interact(lIIIlllllIlIl[lIIIlllllIllI[22]]);
                }
                if (lIlIIllIIllIIIl(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllIIllIIlI(Movement.getRunEnergy(), lIIIlllllIllI[39])) {
                    Inventory.getFirst(C0005f.ba).interact(lIIIlllllIlIl[lIIIlllllIllI[24]]);
                    Time.sleepTicks(lIIIlllllIllI[1]);
                    "".length();
                }
                if (lIlIIllIIllIlIl(Combat.getMissingHealth(), lIIIlllllIllI[40])) {
                    int[] iArr6 = new int[lIIIlllllIllI[1]];
                    iArr6[lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                    if (lIlIIllIIllIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIlllllIllI[1]];
                        iArr7[lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        Inventory.getFirst(iArr7).interact(lIIIlllllIlIl[lIIIlllllIllI[26]]);
                        Time.sleepTicks(lIIIlllllIllI[2]);
                        "".length();
                    }
                }
                if (lIlIIllIIllIlIl(Movement.getRunEnergy(), lIIIlllllIllI[41]) && lIlIIllIIllIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIlIIllIIllIIlI(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[42])) {
                    cF();
                }
                if ((!lIlIIllIIllIlll(C0004e.j(lIIIlllllIllI[43]), lIIIlllllIllI[44]) || lIlIIllIIllIIlI(C0004e.j(lIIIlllllIllI[45]), lIIIlllllIllI[18])) && lIlIIllIIllIlll(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[42]) && lIlIIllIIllIIlI(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[44])) {
                    cG();
                }
                if (lIlIIllIIllIlll(C0004e.j(lIIIlllllIllI[43]), lIIIlllllIllI[44]) && lIlIIllIIllIlll(C0004e.j(lIIIlllllIllI[45]), lIIIlllllIllI[18])) {
                    if (lIlIIllIIllIlll(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[42]) && lIlIIllIIllIIlI(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[37])) {
                        cG();
                    }
                    if (lIlIIllIIllIlll(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[37]) && lIlIIllIIllIIlI(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[44])) {
                        cH();
                    }
                }
                if (lIlIIllIIllIlll(Skills.getLevel(Skill.AGILITY), lIIIlllllIllI[44])) {
                    cI();
                }
            }
        }
    }

    private static boolean lIlIIllIIllIIll(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIllIIllIlII(Object obj) {
        return obj != null;
    }
}
