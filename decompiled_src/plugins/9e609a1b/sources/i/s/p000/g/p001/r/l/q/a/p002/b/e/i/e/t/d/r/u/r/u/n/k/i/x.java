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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.x  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/x.class */
public class x implements M {
    public static /* synthetic */ List<C0003d> bA;
    private static /* synthetic */ int[] lIIlIIIIllIII;
    private static /* synthetic */ String[] lIIlIIIIlIllI;
    public static /* synthetic */ WorldPoint fT;
    static /* synthetic */ WorldArea fY;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ boolean by;
    static /* synthetic */ int co;
    static /* synthetic */ boolean cp;
    public static /* synthetic */ WorldPoint fd;
    static /* synthetic */ int fX;
    public static /* synthetic */ WorldPoint fW;
    public static /* synthetic */ WorldPoint fV;
    public static /* synthetic */ WorldPoint fU;

    private static void lIlIlIIIIIIIllI() {
        lIIlIIIIllIII = new int[198];
        lIIlIIIIllIII[0] = " ".length();
        lIIlIIIIllIII[1] = (94 ^ 60) & ((218 ^ 184) ^ (-1));
        lIIlIIIIllIII[2] = (-((-25409) & 28535)) & (-24641) & 32766;
        lIIlIIIIllIII[3] = "  ".length();
        lIIlIIIIllIII[4] = (248 ^ 156) ^ (108 ^ 12);
        lIIlIIIIllIII[5] = (-9) & 8015;
        lIIlIIIIllIII[6] = (-((-1195) & 14251)) & (-97) & 32767;
        lIIlIIIIllIII[7] = (-24645) & 25596;
        lIIlIIIIllIII[8] = "   ".length();
        lIIlIIIIllIII[9] = (-((-16533) & 29439)) & (-18565) & 31743;
        lIIlIIIIllIII[10] = 153 ^ 147;
        lIIlIIIIllIII[11] = (-((-1346) & 30153)) & (-3113) & 32191;
        lIIlIIIIllIII[12] = (-19595) & 32219;
        lIIlIIIIllIII[13] = (-7169) & 7547;
        lIIlIIIIllIII[14] = (153 ^ 189) ^ (98 ^ 67);
        lIIlIIIIllIII[15] = (((3 + 12) - (-142)) + 23) ^ (((119 + 86) - 169) + 98);
        lIIlIIIIllIII[16] = 130 ^ 138;
        lIIlIIIIllIII[17] = (50 ^ 106) ^ (66 ^ 28);
        lIIlIIIIllIII[18] = 172 ^ 171;
        lIIlIIIIllIII[19] = (-((-20746) & 32655)) & (-20585) & 32767;
        lIIlIIIIllIII[20] = 21 ^ 28;
        lIIlIIIIllIII[21] = (-29636) & 32743;
        lIIlIIIIllIII[22] = (-16577) & 19933;
        lIIlIIIIllIII[23] = (28 ^ 39) ^ (115 ^ 67);
        lIIlIIIIllIII[24] = 6 ^ 10;
        lIIlIIIIllIII[25] = (3 ^ 21) ^ (127 ^ 100);
        lIIlIIIIllIII[26] = (29 ^ 59) ^ (109 ^ 69);
        lIIlIIIIllIII[27] = 16 ^ 31;
        lIIlIIIIllIII[28] = 175 ^ 191;
        lIIlIIIIllIII[29] = 136 ^ 153;
        lIIlIIIIllIII[30] = 154 ^ 136;
        lIIlIIIIllIII[31] = "  ".length() ^ (147 ^ 130);
        lIIlIIIIllIII[32] = (114 ^ 16) ^ (104 ^ 30);
        lIIlIIIIllIII[33] = 151 ^ 130;
        lIIlIIIIllIII[34] = (((10 + 119) - 35) + 53) ^ (((130 + 120) - 135) + 18);
        lIIlIIIIllIII[35] = 44 ^ 59;
        lIIlIIIIllIII[36] = 188 ^ 164;
        lIIlIIIIllIII[37] = (((27 + 36) - (-55)) + 49) ^ (((100 + 64) - 59) + 85);
        lIIlIIIIllIII[38] = 184 ^ 162;
        lIIlIIIIllIII[39] = 119 ^ 108;
        lIIlIIIIllIII[40] = 163 ^ 191;
        lIIlIIIIllIII[41] = (88 ^ 7) ^ (28 ^ 94);
        lIIlIIIIllIII[42] = 130 ^ 156;
        lIIlIIIIllIII[43] = (-((-1825) & 22457)) & (-8965) & 32703;
        lIIlIIIIllIII[44] = (-4633) & 7999;
        lIIlIIIIllIII[45] = (-((-275) & 29659)) & (-17) & 32766;
        lIIlIIIIllIII[46] = (163 ^ 130) ^ (50 ^ 12);
        lIIlIIIIllIII[47] = (121 ^ 66) ^ (27 ^ 0);
        lIIlIIIIllIII[48] = 61 ^ 28;
        lIIlIIIIllIII[49] = (((144 + 172) - 238) + 103) ^ (((85 + 140) - 164) + 90);
        lIIlIIIIllIII[50] = (((99 + 19) - 47) + 58) ^ (((79 + 99) - 55) + 39);
        lIIlIIIIllIII[51] = 154 ^ 190;
        lIIlIIIIllIII[52] = (((153 + 29) - 107) + 92) ^ (((109 + 89) - 82) + 14);
        lIIlIIIIllIII[53] = 165 ^ 131;
        lIIlIIIIllIII[54] = (-17026) & 20115;
        lIIlIIIIllIII[55] = (-((-1473) & 21987)) & (-8257) & 32123;
        lIIlIIIIllIII[56] = (62 ^ 112) ^ (91 ^ 50);
        lIIlIIIIllIII[57] = 149 ^ 189;
        lIIlIIIIllIII[58] = 119 ^ 94;
        lIIlIIIIllIII[59] = (35 ^ 29) ^ (8 ^ 28);
        lIIlIIIIllIII[60] = 95 ^ 116;
        lIIlIIIIllIII[61] = (-((-661) & 23518)) & (-5) & 32607;
        lIIlIIIIllIII[62] = (-((-17693) & 30685)) & (-16404) & 32511;
        lIIlIIIIllIII[63] = (-((-24641) & 28902)) & (-18433) & 32445;
        lIIlIIIIllIII[64] = (-((-17567) & 30175)) & (-641) & 16358;
        lIIlIIIIllIII[65] = (-((-10279) & 10671)) & (-22597) & 32749;
        lIIlIIIIllIII[66] = (-16705) & 26469;
        lIIlIIIIllIII[67] = (-((-11281) & 32151)) & (-8737) & 32703;
        lIIlIIIIllIII[68] = (-((-2861) & 19455)) & (-12297) & 31995;
        lIIlIIIIllIII[69] = (-98) & 9855;
        lIIlIIIIllIII[70] = (-20609) & 23703;
        lIIlIIIIllIII[71] = (-2461) & 12223;
        lIIlIIIIllIII[72] = (-20515) & 23614;
        lIIlIIIIllIII[73] = (-18499) & 28243;
        lIIlIIIIllIII[74] = (-28929) & 30716;
        lIIlIIIIllIII[75] = (-26625) & 28415;
        lIIlIIIIllIII[76] = (105 ^ 115) ^ (103 ^ 81);
        lIIlIIIIllIII[77] = 43 ^ 6;
        lIIlIIIIllIII[78] = (116 ^ 45) ^ (109 ^ 26);
        lIIlIIIIllIII[79] = (((110 + 21) - 115) + 133) ^ (((80 + 121) - 103) + 88);
        lIIlIIIIllIII[80] = (-((-1685) & 10135)) & (-20481) & 30719;
        lIIlIIIIllIII[81] = (44 ^ 124) ^ (59 ^ 91);
        lIIlIIIIllIII[82] = (117 ^ 53) ^ (52 ^ 69);
        lIIlIIIIllIII[83] = (((108 + 85) - 189) + 140) ^ (((88 + 57) - 119) + 137);
        lIIlIIIIllIII[84] = (-((-22153) & 22507)) & (-22529) & 32639;
        lIIlIIIIllIII[85] = (((65 + 50) - 76) + 203) ^ (((3 + 186) - 166) + 175);
        lIIlIIIIllIII[86] = (92 ^ 5) ^ (89 ^ 53);
        lIIlIIIIllIII[87] = (54 ^ 127) ^ (((0 + 74) - (-26)) + 27);
        lIIlIIIIllIII[88] = (236 ^ 140) ^ (193 ^ 150);
        lIIlIIIIllIII[89] = (17 ^ 119) ^ (36 ^ 122);
        lIIlIIIIllIII[90] = 117 ^ 76;
        lIIlIIIIllIII[91] = (-(((49 + 62) - (-79)) + 35)) & (-257) & 10239;
        lIIlIIIIllIII[92] = (119 ^ 86) ^ (59 ^ 32);
        lIIlIIIIllIII[93] = (((104 + 107) - 158) + 197) ^ (((133 + 136) - 256) + 180);
        lIIlIIIIllIII[94] = (126 ^ 70) ^ (158 ^ 154);
        lIIlIIIIllIII[95] = (191 ^ 142) ^ (104 ^ 100);
        lIIlIIIIllIII[96] = (182 ^ 190) ^ (104 ^ 94);
        lIIlIIIIllIII[97] = (42 ^ 75) ^ (69 ^ 27);
        lIIlIIIIllIII[98] = (22 ^ 45) ^ (233 ^ 146);
        lIIlIIIIllIII[99] = (((24 + 56) - (-16)) + 35) ^ (((171 + 117) - 116) + 22);
        lIIlIIIIllIII[100] = (13 ^ 38) ^ (172 ^ 197);
        lIIlIIIIllIII[101] = 54 ^ 117;
        lIIlIIIIllIII[102] = 66 ^ 6;
        lIIlIIIIllIII[103] = (-((-16721) & 22995)) & (-6) & 8071;
        lIIlIIIIllIII[104] = (-((-3286) & 32727)) & (-161) & 32703;
        lIIlIIIIllIII[105] = 235 ^ 174;
        lIIlIIIIllIII[106] = 28 ^ 90;
        lIIlIIIIllIII[107] = 125 ^ 58;
        lIIlIIIIllIII[108] = (-20803) & 23903;
        lIIlIIIIllIII[109] = (-20881) & 30640;
        lIIlIIIIllIII[110] = (((151 + 113) - 84) + 63) ^ (((6 + 10) - (-38)) + 133);
        lIIlIIIIllIII[111] = 15 ^ 70;
        lIIlIIIIllIII[112] = (((69 + 152) - 81) + 53) ^ (((36 + 50) - 65) + 118);
        lIIlIIIIllIII[113] = (-4498) & 14259;
        lIIlIIIIllIII[114] = 51 ^ 120;
        lIIlIIIIllIII[115] = 5 ^ 73;
        lIIlIIIIllIII[116] = (114 ^ 98) ^ (21 ^ 72);
        lIIlIIIIllIII[117] = 110 ^ 32;
        lIIlIIIIllIII[118] = (89 ^ 5) ^ (144 ^ 131);
        lIIlIIIIllIII[119] = (((164 + 25) - 158) + 191) ^ (((70 + 14) - (-46)) + 12);
        lIIlIIIIllIII[120] = 195 ^ 146;
        lIIlIIIIllIII[121] = (-24819) & 26611;
        lIIlIIIIllIII[122] = 86 ^ 4;
        lIIlIIIIllIII[123] = 49 ^ 98;
        lIIlIIIIllIII[124] = 109 ^ 57;
        lIIlIIIIllIII[125] = (194 ^ 168) ^ (12 ^ 51);
        lIIlIIIIllIII[126] = (-((-9905) & 16306)) & (-24577) & 32767;
        lIIlIIIIllIII[127] = (-17285) & 20383;
        lIIlIIIIllIII[128] = (83 ^ 40) ^ (97 ^ 76);
        lIIlIIIIllIII[129] = (((151 + 119) - 197) + 139) ^ (((117 + 12) - 33) + 35);
        lIIlIIIIllIII[130] = (56 ^ 15) ^ (38 ^ 73);
        lIIlIIIIllIII[131] = (-((-13443) & 14038)) & (-24833) & 28531;
        lIIlIIIIllIII[132] = 227 ^ 186;
        lIIlIIIIllIII[133] = (235 ^ 168) ^ (22 ^ 15);
        lIIlIIIIllIII[134] = (87 ^ 19) ^ (93 ^ 66);
        lIIlIIIIllIII[135] = 237 ^ 177;
        lIIlIIIIllIII[136] = 118 ^ 43;
        lIIlIIIIllIII[137] = (116 ^ 83) ^ (97 ^ 24);
        lIIlIIIIllIII[138] = (-((-2083) & 27059)) & (-521) & 28602;
        lIIlIIIIllIII[139] = 196 ^ 155;
        lIIlIIIIllIII[140] = 101 ^ 5;
        lIIlIIIIllIII[141] = 161 ^ 192;
        lIIlIIIIllIII[142] = (((131 + 14) - 38) + 55) ^ (((149 + 108) - 83) + 18);
        lIIlIIIIllIII[143] = 200 ^ 171;
        lIIlIIIIllIII[144] = (17 ^ 35) ^ (120 ^ 46);
        lIIlIIIIllIII[145] = 81 ^ 52;
        lIIlIIIIllIII[146] = (120 ^ 102) ^ (184 ^ 192);
        lIIlIIIIllIII[147] = 78 ^ 41;
        lIIlIIIIllIII[148] = (((228 + 203) - 367) + 187) ^ (((123 + 6) - 17) + 35);
        lIIlIIIIllIII[149] = 49 ^ 88;
        lIIlIIIIllIII[150] = (((154 + 196) - 302) + 169) ^ (((56 + 74) - 47) + 96);
        lIIlIIIIllIII[151] = (((81 + 203) - 254) + 180) ^ (((20 + 148) - 19) + 36);
        lIIlIIIIllIII[152] = (-4299) & 14062;
        lIIlIIIIllIII[153] = (((54 + 49) - (-14)) + 10) ^ (16 ^ 3);
        lIIlIIIIllIII[154] = (125 ^ 111) ^ (((106 + 83) - 130) + 68);
        lIIlIIIIllIII[155] = (239 ^ 193) ^ (252 ^ 188);
        lIIlIIIIllIII[156] = (((149 + 0) - 75) + 151) ^ (((118 + 96) - 138) + 66);
        lIIlIIIIllIII[157] = (((135 ^ 162) + (48 ^ 59)) - (189 ^ 179)) + (196 ^ 171);
        lIIlIIIIllIII[158] = ((106 ^ 65) & ((129 ^ 170) ^ (-1))) ^ (205 ^ 189);
        lIIlIIIIllIII[159] = (((((2 + 24) - (-97)) + 10) + (82 ^ 34)) - (((41 + 29) - (-51)) + 84)) + (208 ^ 181);
        lIIlIIIIllIII[160] = (((241 + 158) - 315) + 166) ^ (((81 + 102) - 81) + 37);
        lIIlIIIIllIII[161] = (-13261) & 16349;
        lIIlIIIIllIII[162] = (-((-29829) & 31975)) & (-4353) & 16251;
        lIIlIIIIllIII[163] = 72 ^ 58;
        lIIlIIIIllIII[164] = (252 ^ 176) ^ (51 ^ 12);
        lIIlIIIIllIII[165] = 196 ^ 176;
        lIIlIIIIllIII[166] = (30 ^ 42) ^ (48 ^ 113);
        lIIlIIIIllIII[167] = (((177 + 79) - 26) + 14) ^ (((109 + 49) - 111) + 83);
        lIIlIIIIllIII[168] = (119 ^ 19) ^ (87 ^ 68);
        lIIlIIIIllIII[169] = 74 ^ 50;
        lIIlIIIIllIII[170] = (117 ^ 35) ^ (18 ^ 61);
        lIIlIIIIllIII[171] = (((205 + 59) - 187) + 146) ^ (((151 + 111) - 117) + 20);
        lIIlIIIIllIII[172] = 224 ^ 155;
        lIIlIIIIllIII[173] = 78 ^ 50;
        lIIlIIIIllIII[174] = (26 ^ 126) ^ (156 ^ 133);
        lIIlIIIIllIII[175] = (-((-13317) & 32766)) & (-4097) & 32765;
        lIIlIIIIllIII[176] = (-308) & 12287;
        lIIlIIIIllIII[177] = (-7236) & 32235;
        lIIlIIIIllIII[178] = (-4162) & 4461;
        lIIlIIIIllIII[179] = (-((-8213) & 27390)) & (-12289) & 32765;
        lIIlIIIIllIII[180] = 185 ^ 199;
        lIIlIIIIllIII[181] = (((152 ^ 171) + (197 ^ 181)) - (((120 + 44) - 77) + 57)) + (215 ^ 187);
        lIIlIIIIllIII[182] = ((102 + 74) - 114) + 66;
        lIIlIIIIllIII[183] = (((95 ^ 127) + (160 ^ 171)) - (-(19 ^ 91))) + (147 ^ 157);
        lIIlIIIIllIII[184] = (-((-23) & 12895)) & (-131) & 16367;
        lIIlIIIIllIII[185] = (((37 ^ 27) + (73 ^ 113)) - (59 ^ 4)) + (69 ^ 14);
        lIIlIIIIllIII[186] = ((125 + 60) - 81) + 27;
        lIIlIIIIllIII[187] = (-((-1857) & 14315)) & (-17) & 15803;
        lIIlIIIIllIII[188] = (-8577) & 11663;
        lIIlIIIIllIII[189] = (-((-389) & 29663)) & (-2) & 32635;
        lIIlIIIIllIII[190] = (-((-2689) & 15044)) & (-16405) & 32095;
        lIIlIIIIllIII[191] = (-((-17433) & 30714)) & (-1) & 16375;
        lIIlIIIIllIII[192] = (-((-2331) & 27067)) & (-513) & 28607;
        lIIlIIIIllIII[193] = ((98 + 103) - 180) + 111;
        lIIlIIIIllIII[194] = ((109 + 125) - 177) + 76;
        lIIlIIIIllIII[195] = ((109 + 121) - 161) + 65;
        lIIlIIIIllIII[196] = (-16545) & 26287;
        lIIlIIIIllIII[197] = ((31 + 65) - 68) + 107;
    }

    private static boolean lIlIlIIIIIIlIlI(int i2) {
        return i2 == 0;
    }

    private static String lIlIIllllllIIll(String llllllllllllllIllllllIlIlllIllll, String llllllllllllllIllllllIlIlllIlllI) {
        try {
            SecretKeySpec llllllllllllllIllllllIlIllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlIlllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllllIlIllllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllllIlIllllIIIl.init(lIIlIIIIllIII[3], llllllllllllllIllllllIlIllllIIlI);
            return new String(llllllllllllllIllllllIlIllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIlIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllIlIllllIIII) {
            llllllllllllllIllllllIlIllllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIIIIIIllII(int i2) {
        return i2 > 0;
    }

    static {
        lIlIlIIIIIIIllI();
        lIlIlIIIIIIIlIl();
        bA = new ArrayList();
        fd = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[187], lIIlIIIIllIII[1]);
        fT = new WorldPoint(lIIlIIIIllIII[188], lIIlIIIIllIII[189], lIIlIIIIllIII[1]);
        fU = new WorldPoint(lIIlIIIIllIII[161], lIIlIIIIllIII[190], lIIlIIIIllIII[1]);
        fV = new WorldPoint(lIIlIIIIllIII[191], lIIlIIIIllIII[192], lIIlIIIIllIII[1]);
        fW = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[45], lIIlIIIIllIII[3]);
        fX = lIIlIIIIllIII[47];
        String[] strArr = new String[lIIlIIIIllIII[8]];
        strArr[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[193]];
        strArr[lIIlIIIIllIII[0]] = lIIlIIIIlIllI[lIIlIIIIllIII[194]];
        strArr[lIIlIIIIllIII[3]] = lIIlIIIIlIllI[lIIlIIIIllIII[195]];
        bW = strArr;
        fY = new WorldArea(lIIlIIIIllIII[188], lIIlIIIIllIII[196], lIIlIIIIllIII[50], lIIlIIIIllIII[40], lIIlIIIIllIII[1]);
    }

    private static boolean lIlIlIIIIIIlIII(int i2) {
        return i2 != 0;
    }

    private static void lIlIlIIIIIIIlIl() {
        lIIlIIIIlIllI = new String[lIIlIIIIllIII[197]];
        lIIlIIIIlIllI[lIIlIIIIllIII[1]] = lIlIIllllllIIlI("BQs0IiorBz5rOzYbMyU+YwsuLjQwTno4LioWOSMwLQV6KTggCXo/NmMTLy4qNw==", "CbZKY");
        lIIlIIIIlIllI[lIIlIIIIllIII[0]] = lIlIIllllllIIll("+6ED6d8G8aZNUQLSpBIZJw==", "xolMY");
        lIIlIIIIlIllI[lIIlIIIIllIII[3]] = lIlIIllllllIlII("1B1Y84IbIxCjIXux8IcNfXdogBLJmZLq", "KXCKq");
        lIIlIIIIlIllI[lIIlIIIIllIII[8]] = lIlIIllllllIIlI("JwFELzEVRAknMAMNCiljAREBPTdQFxE+MxwNAT1vUBcTJzcTDA0gJFAQC24BJT0tAAQ=", "pddNC");
        lIIlIIIIlIllI[lIIlIIIIllIII[4]] = lIlIIllllllIIlI("KCEZIAc=", "lSpNl");
        lIIlIIIIlIllI[lIIlIIIIllIII[14]] = lIlIIllllllIlII("/nF/5YHdPLE=", "QykcH");
        lIIlIIIIlIllI[lIIlIIIIllIII[17]] = lIlIIllllllIIll("EbuDn7wSrWH45f18meA0/w==", "jLFtI");
        lIIlIIIIlIllI[lIIlIIIIllIII[18]] = lIlIIllllllIlII("6IAaGFTZiBj1U0XCKPyHCg==", "XhnSa");
        lIIlIIIIlIllI[lIIlIIIIllIII[16]] = lIlIIllllllIlII("a170fVOGrWPTzV0ywe7pxg==", "LMpch");
        lIIlIIIIlIllI[lIIlIIIIllIII[20]] = lIlIIllllllIIll("W+9WyN7TRyA=", "Acooo");
        lIIlIIIIlIllI[lIIlIIIIllIII[10]] = lIlIIllllllIIll("1erBJYEeMiccp9VhPbWEsrEquXJ3ZRgS", "WOpfj");
        lIIlIIIIlIllI[lIIlIIIIllIII[23]] = lIlIIllllllIlII("g7ik2KV89we6d+GEPTdlhfpF9OakPqXb", "RahVw");
        lIIlIIIIlIllI[lIIlIIIIllIII[24]] = lIlIIllllllIIlI("HgcqLSstRicrKi4=", "JfADE");
        lIIlIIIIlIllI[lIIlIIIIllIII[25]] = lIlIIllllllIIlI("Ew4sDg==", "GoGkO");
        lIIlIIIIlIllI[lIIlIIIIllIII[26]] = lIlIIllllllIIll("G6pHGkV7UOym4aQSLDO5CGx+wbYVS6Vu", "viftF");
        lIIlIIIIlIllI[lIIlIIIIllIII[27]] = lIlIIllllllIlII("UlqjUKHvAXw=", "Wtsrc");
        lIIlIIIIlIllI[lIIlIIIIllIII[28]] = lIlIIllllllIIll("qP44qUrnRdUNga6/lKlhKg==", "TgSaQ");
        lIIlIIIIlIllI[lIIlIIIIllIII[29]] = lIlIIllllllIIlI("LggGMxAEBg==", "jaaTy");
        lIIlIIIIlIllI[lIIlIIIIllIII[30]] = lIlIIllllllIIll("6xOCvinw/UQwRv4LK+JA6A==", "DnLVw");
        lIIlIIIIlIllI[lIIlIIIIllIII[31]] = lIlIIllllllIIll("OI4wjGhXvuk=", "tenFB");
        lIIlIIIIlIllI[lIIlIIIIllIII[32]] = lIlIIllllllIIll("32CWqTPQ4co=", "JsniB");
        lIIlIIIIlIllI[lIIlIIIIllIII[33]] = lIlIIllllllIIll("Yz26ACwrO88XHaL/pNIlFg==", "kXcSN");
        lIIlIIIIlIllI[lIIlIIIIllIII[34]] = lIlIIllllllIlII("q76JReohmT/3FuwwUvrqQQ==", "NUBGJ");
        lIIlIIIIlIllI[lIIlIIIIllIII[35]] = lIlIIllllllIIlI("HCgw", "WMInP");
        lIIlIIIIlIllI[lIIlIIIIllIII[36]] = lIlIIllllllIlII("pjCdeIZ/s7hL80YSovoiEQ==", "DtDMj");
        lIIlIIIIlIllI[lIIlIIIIllIII[37]] = lIlIIllllllIIlI("AwcXDRMqBUMeDyUFBg==", "Dbcyz");
        lIIlIIIIlIllI[lIIlIIIIllIII[38]] = lIlIIllllllIIll("HhhO7QACqwQFY7ZCwKUeWA==", "KIGUT");
        lIIlIIIIlIllI[lIIlIIIIllIII[39]] = lIlIIllllllIlII("g3yblSv/CT8=", "kekuq");
        lIIlIIIIlIllI[lIIlIIIIllIII[40]] = lIlIIllllllIIll("fk+9+wlCtf0=", "zCkeY");
        lIIlIIIIlIllI[lIIlIIIIllIII[41]] = lIlIIllllllIlII("E1Rr7ZFyPTdloofkzXzmaQ==", "wZNCE");
        lIIlIIIIlIllI[lIIlIIIIllIII[42]] = lIlIIllllllIlII("gHvfB9djmxJSDKosSkswkQ==", "XsAqC");
        lIIlIIIIlIllI[lIIlIIIIllIII[46]] = lIlIIllllllIlII("2D+m4+YiXe9DGLTRzBx1Fg==", "oqGzQ");
        lIIlIIIIlIllI[lIIlIIIIllIII[47]] = lIlIIllllllIIlI("HiggEA==", "ZGObZ");
        lIIlIIIIlIllI[lIIlIIIIllIII[48]] = lIlIIllllllIlII("DLvo6E4bYKw=", "eIhoI");
        lIIlIIIIlIllI[lIIlIIIIllIII[49]] = lIlIIllllllIIlI("Fw4xdgMlCSA=", "PkEVw");
        lIIlIIIIlIllI[lIIlIIIIllIII[50]] = lIlIIllllllIlII("lQe2VFJZm/IG0Ex2k6+iGQ==", "gYoXE");
        lIIlIIIIlIllI[lIIlIIIIllIII[51]] = lIlIIllllllIIlI("JCQaHQ==", "pEqxa");
        lIIlIIIIlIllI[lIIlIIIIllIII[52]] = lIlIIllllllIIll("IJduPu1lr470Olkbdf0HoA==", "CNWbW");
        lIIlIIIIlIllI[lIIlIIIIllIII[53]] = lIlIIllllllIIll("xwMwz+/IegU=", "eJDof");
        lIIlIIIIlIllI[lIIlIIIIllIII[56]] = lIlIIllllllIlII("Af9SLDJ46Hw=", "MUJVH");
        lIIlIIIIlIllI[lIIlIIIIllIII[57]] = lIlIIllllllIIlI("CSEoIg==", "FQMLe");
        lIIlIIIIlIllI[lIIlIIIIllIII[58]] = lIlIIllllllIIlI("Ky4wegEKbyAzGwQjZigaCiI=", "eOFZu");
        lIIlIIIIlIllI[lIIlIIIIllIII[59]] = lIlIIllllllIIll("D03rjKJH+QM=", "DNJzH");
        lIIlIIIIlIllI[lIIlIIIIllIII[60]] = lIlIIllllllIIlI("NwoxDClZAjcWJQ==", "tfXaK");
        lIIlIIIIlIllI[lIIlIIIIllIII[76]] = lIlIIllllllIlII("IWlSCpqrD7FypDZ/9F2tgg==", "yrwHA");
        lIIlIIIIlIllI[lIIlIIIIllIII[77]] = lIlIIllllllIIlI("OBIdHlkEAgcXCw==", "hgqry");
        lIIlIIIIlIllI[lIIlIIIIllIII[78]] = lIlIIllllllIlII("nf+dC6PbhQ8=", "vHeIb");
        lIIlIIIIlIllI[lIIlIIIIllIII[79]] = lIlIIllllllIlII("GiyqgQGfbfI=", "yvSKB");
        lIIlIIIIlIllI[lIIlIIIIllIII[81]] = lIlIIllllllIIlI("GjAlSzM7cTE=", "TQSkG");
        lIIlIIIIlIllI[lIIlIIIIllIII[82]] = lIlIIllllllIlII("Xu7ksI67bNI+rGbITmyzYA==", "CKKdz");
        lIIlIIIIlIllI[lIIlIIIIllIII[15]] = lIlIIllllllIIll("qdldS5eyC6g=", "LprMK");
        lIIlIIIIlIllI[lIIlIIIIllIII[83]] = lIlIIllllllIIlI("PBsEKg==", "lnhFe");
        lIIlIIIIlIllI[lIIlIIIIllIII[85]] = lIlIIllllllIlII("KJFYf1Bimdqs6eMZpG+NAQ==", "kcRlT");
        lIIlIIIIlIllI[lIIlIIIIllIII[86]] = lIlIIllllllIlII("kic1S+cRWr4=", "QCmxl");
        lIIlIIIIlIllI[lIIlIIIIllIII[87]] = lIlIIllllllIIll("aoYA7kM5sKo=", "XrZvm");
        lIIlIIIIlIllI[lIIlIIIIllIII[88]] = lIlIIllllllIIlI("NgUYD1UKFQIGBw==", "fptcu");
        lIIlIIIIlIllI[lIIlIIIIllIII[89]] = lIlIIllllllIIll("8RQ+K4n3gWE=", "aVqCb");
        lIIlIIIIlIllI[lIIlIIIIllIII[90]] = lIlIIllllllIlII("rac1nB/7Dd0=", "qrldt");
        lIIlIIIIlIllI[lIIlIIIIllIII[92]] = lIlIIllllllIIlI("LDw0CkcVPGILCA4h", "aSBog");
        lIIlIIIIlIllI[lIIlIIIIllIII[93]] = lIlIIllllllIIll("qqii+B9Dz4o=", "gbcHq");
        lIIlIIIIlIllI[lIIlIIIIllIII[94]] = lIlIIllllllIlII("jo8A4a+QL7w=", "InedA");
        lIIlIIIIlIllI[lIIlIIIIllIII[95]] = lIlIIllllllIlII("x9wbSzjCfjGozqhwUB9VuA==", "YMxBb");
        lIIlIIIIlIllI[lIIlIIIIllIII[96]] = lIlIIllllllIlII("kTKrbLrY2oN65cHk2+m1Lw==", "lyUVA");
        lIIlIIIIlIllI[lIIlIIIIllIII[97]] = lIlIIllllllIIll("RGGbBl+bkdo=", "ixcEN");
        lIIlIIIIlIllI[lIIlIIIIllIII[98]] = lIlIIllllllIlII("mxd7X13cuZw=", "yzLCh");
        lIIlIIIIlIllI[lIIlIIIIllIII[99]] = lIlIIllllllIIll("41ibuDq6Dbh4K7bSEVHmVA==", "WPqrl");
        lIIlIIIIlIllI[lIIlIIIIllIII[100]] = lIlIIllllllIIlI("IwANOGsfEBcxOQ==", "suaTK");
        lIIlIIIIlIllI[lIIlIIIIllIII[101]] = lIlIIllllllIlII("47Eo5/xUMxE=", "JIeBX");
        lIIlIIIIlIllI[lIIlIIIIllIII[102]] = lIlIIllllllIlII("QfuPNA8PXb0=", "SFkrP");
        lIIlIIIIlIllI[lIIlIIIIllIII[105]] = lIlIIllllllIlII("IAzeS9S79lRBRVWsypJ6Wg==", "figRb");
        lIIlIIIIlIllI[lIIlIIIIllIII[106]] = lIlIIllllllIIll("lTRDQ0RhkW8=", "YiOBX");
        lIIlIIIIlIllI[lIIlIIIIllIII[107]] = lIlIIllllllIIlI("LAQjCA==", "ctFfO");
        lIIlIIIIlIllI[lIIlIIIIllIII[110]] = lIlIIllllllIIlI("KgIEPUwTAlI8Awgf", "gmrXl");
        lIIlIIIIlIllI[lIIlIIIIllIII[111]] = lIlIIllllllIIll("rHHdtheoq34=", "GMsNV");
        lIIlIIIIlIllI[lIIlIIIIllIII[112]] = lIlIIllllllIIll("QEI3YcE2ARI=", "DTRza");
        lIIlIIIIlIllI[lIIlIIIIllIII[114]] = lIlIIllllllIIlI("Pws+NUgGC2g0Bx0W", "rdHPh");
        lIIlIIIIlIllI[lIIlIIIIllIII[115]] = lIlIIllllllIlII("SCu3+MF5WCU=", "zbExF");
        lIIlIIIIlIllI[lIIlIIIIllIII[116]] = lIlIIllllllIIlI("Kh81Ng==", "eoPXG");
        lIIlIIIIlIllI[lIIlIIIIllIII[117]] = lIlIIllllllIIlI("DxMERg0uUhc=", "Arrfy");
        lIIlIIIIlIllI[lIIlIIIIllIII[118]] = lIlIIllllllIlII("HDeSW8ZF7x8fZUYOyTe/NQ==", "YEQbO");
        lIIlIIIIlIllI[lIIlIIIIllIII[119]] = lIlIIllllllIIlI("Awk/FShvKQ==", "OlIpZ");
        lIIlIIIIlIllI[lIIlIIIIllIII[120]] = lIlIIllllllIlII("C/hH+acLUx8=", "VKrky");
        lIIlIIIIlIllI[lIIlIIIIllIII[122]] = lIlIIllllllIIlI("HS0/cBM8bC8=", "SLIPg");
        lIIlIIIIlIllI[lIIlIIIIllIII[123]] = lIlIIllllllIlII("hmPnqgXM/nljYAlWiwrLDQ==", "EWKBE");
        lIIlIIIIlIllI[lIIlIIIIllIII[124]] = lIlIIllllllIlII("NEmlqPK38sM=", "lpNbb");
        lIIlIIIIlIllI[lIIlIIIIllIII[125]] = lIlIIllllllIIll("6pQLjzbaI94=", "AjCkQ");
        lIIlIIIIlIllI[lIIlIIIIllIII[128]] = lIlIIllllllIIll("lFEDLT6ps9uX12RM+6dLIA==", "MjIau");
        lIIlIIIIlIllI[lIIlIIIIllIII[129]] = lIlIIllllllIlII("XHZSSVDc/zI=", "QiiFT");
        lIIlIIIIlIllI[lIIlIIIIllIII[130]] = lIlIIllllllIIlI("KxYnNA==", "dfBZT");
        lIIlIIIIlIllI[lIIlIIIIllIII[132]] = lIlIIllllllIIll("Sm0fcOyZTdOpyTf9aHHHGQ==", "MrwSS");
        lIIlIIIIlIllI[lIIlIIIIllIII[133]] = lIlIIllllllIIll("iS6mj3oA4zc=", "ClPde");
        lIIlIIIIlIllI[lIIlIIIIllIII[134]] = lIlIIllllllIIlI("DgI3CQ==", "ArRgg");
        lIIlIIIIlIllI[lIIlIIIIllIII[135]] = lIlIIllllllIIlI("GBsjIHEkCzkpIw==", "HnOLQ");
        lIIlIIIIlIllI[lIIlIIIIllIII[136]] = lIlIIllllllIIll("u0iLIRODXW8=", "UHkIa");
        lIIlIIIIlIllI[lIIlIIIIllIII[137]] = lIlIIllllllIIll("fayhy68Mwl8=", "maUle");
        lIIlIIIIlIllI[lIIlIIIIllIII[139]] = lIlIIllllllIlII("h3dA3LOnU6RnRDdlsuhi8A==", "kVitF");
        lIIlIIIIlIllI[lIIlIIIIllIII[140]] = lIlIIllllllIIlI("NDo7IQ==", "pUTSr");
        lIIlIIIIlIllI[lIIlIIIIllIII[141]] = lIlIIllllllIIll("hWXTmEuOagI=", "PdQWW");
        lIIlIIIIlIllI[lIIlIIIIllIII[142]] = lIlIIllllllIIlI("HSgEIHckKFIhOD81", "PGrEW");
        lIIlIIIIlIllI[lIIlIIIIllIII[143]] = lIlIIllllllIIll("wdMMUIbOG4c=", "urAlN");
        lIIlIIIIlIllI[lIIlIIIIllIII[144]] = lIlIIllllllIIlI("BgoAHw==", "Izeqd");
        lIIlIIIIlIllI[lIIlIIIIllIII[145]] = lIlIIllllllIIll("ghxEJyVgq9kBfl2vWGXoqQ==", "yjDcZ");
        lIIlIIIIlIllI[lIIlIIIIllIII[146]] = lIlIIllllllIIlI("Py0oL3UDPTImJw==", "oXDCU");
        lIIlIIIIlIllI[lIIlIIIIllIII[147]] = lIlIIllllllIIlI("Gy0UCxZ3DQ==", "WHbnd");
        lIIlIIIIlIllI[lIIlIIIIllIII[148]] = lIlIIllllllIIll("fXKdVC6lKKE=", "hwHpg");
        lIIlIIIIlIllI[lIIlIIIIllIII[149]] = lIlIIllllllIIlI("ISsBKFMYK1cpHAM2", "lDwMs");
        lIIlIIIIlIllI[lIIlIIIIllIII[150]] = lIlIIllllllIlII("RYEwEaiaVPY=", "iFZzs");
        lIIlIIIIlIllI[lIIlIIIIllIII[151]] = lIlIIllllllIIll("EO1nFX8naOQ=", "qzJrT");
        lIIlIIIIlIllI[lIIlIIIIllIII[153]] = lIlIIllllllIIlI("AiYCEUo7JlQQBSA7", "OIttj");
        lIIlIIIIlIllI[lIIlIIIIllIII[154]] = lIlIIllllllIIlI("MSA5JQ==", "uOVWc");
        lIIlIIIIlIllI[lIIlIIIIllIII[155]] = lIlIIllllllIIll("yGo4lrWtKy8=", "GAkmM");
        lIIlIIIIlIllI[lIIlIIIIllIII[156]] = lIlIIllllllIIll("lrhr8pMh9+mhD76C2/MiSQ==", "MYQOB");
        lIIlIIIIlIllI[lIIlIIIIllIII[158]] = lIlIIllllllIIlI("KxkSNA==", "diwZz");
        lIIlIIIIlIllI[lIIlIIIIllIII[160]] = lIlIIllllllIlII("tTD4ALxcn70=", "WRlfT");
        lIIlIIIIlIllI[lIIlIIIIllIII[163]] = lIlIIllllllIIlI("KjoVTiwEPQ==", "eSynO");
        lIIlIIIIlIllI[lIIlIIIIllIII[164]] = lIlIIllllllIIlI("OzEFbBEVNg==", "tXiLr");
        lIIlIIIIlIllI[lIIlIIIIllIII[165]] = lIlIIllllllIIll("SIpRlgnAbxA=", "wralW");
        lIIlIIIIlIllI[lIIlIIIIllIII[166]] = lIlIIllllllIIlI("NCczMDMUciUnNAM=", "fRQRV");
        lIIlIIIIlIllI[lIIlIIIIllIII[167]] = lIlIIllllllIlII("RIeUAu8ddRY=", "noDNh");
        lIIlIIIIlIllI[lIIlIIIIllIII[168]] = lIlIIllllllIIll("jPYBj+SitYI=", "HfGRp");
        lIIlIIIIlIllI[lIIlIIIIllIII[169]] = lIlIIllllllIIlI("JgAMSjYHQQoYLQ4ECRktGg==", "hazjB");
        lIIlIIIIlIllI[lIIlIIIIllIII[170]] = lIlIIllllllIIll("72pSA/1667M=", "AHZtN");
        lIIlIIIIlIllI[lIIlIIIIllIII[171]] = lIlIIllllllIIll("uanesXZe3QcHXHksiXmG5YyewYtX7It8", "IqmgC");
        lIIlIIIIlIllI[lIIlIIIIllIII[172]] = lIlIIllllllIIll("mAqEfKKf/cOPGuxkWp86JD1EWSFudhh8", "ohRQc");
        lIIlIIIIlIllI[lIIlIIIIllIII[173]] = lIlIIllllllIIll("LWSaAjUaSHI=", "yNwzu");
        lIIlIIIIlIllI[lIIlIIIIllIII[174]] = lIlIIllllllIIlI("KCMoLj8LIig6ejc1Iy00CyUiITQ=", "xQGHZ");
        lIIlIIIIlIllI[lIIlIIIIllIII[180]] = lIlIIllllllIIll("fIAM39dVuEmBwA2zbYj0ETVvpnvmWIkH", "XEFkc");
        lIIlIIIIlIllI[lIIlIIIIllIII[181]] = lIlIIllllllIIll("CgyHVwBQrFAM4z9TNhfPTnt0QPlWcJ0f", "rStvH");
        lIIlIIIIlIllI[lIIlIIIIllIII[182]] = lIlIIllllllIIll("eHNoD9uV7Eo=", "lYFrn");
        lIIlIIIIlIllI[lIIlIIIIllIII[183]] = lIlIIllllllIIll("VcjHEfvS93o=", "KLpzw");
        lIIlIIIIlIllI[lIIlIIIIllIII[185]] = lIlIIllllllIlII("Lnk94ouksUU=", "oIYYY");
        lIIlIIIIlIllI[lIIlIIIIllIII[186]] = lIlIIllllllIIlI("Aj8xAQ==", "MOToH");
        lIIlIIIIlIllI[lIIlIIIIllIII[193]] = lIlIIllllllIIlI("AxMRag==", "ZvbDS");
        lIIlIIIIlIllI[lIIlIIIIllIII[194]] = lIlIIllllllIIll("VDK7J6f8iDRlV6spmz0ctk4LqIHdcrnF0QjXM/ZO+Jw+Ryz34Ink/Q==", "LAdxi");
        lIIlIIIIlIllI[lIIlIIIIllIII[195]] = lIlIIllllllIIlI("HU8vbhI4CSZuIzEaLSAcNwliKhwwBmU6VTULNjsUOAQ7bhIxHGIrGzMJJSsRdBwtbhR0CyonFj8NLGA=", "ThBNu");
    }

    private static String lIlIIllllllIIlI(String llllllllllllllIllllllIllIIIIIlII, String llllllllllllllIllllllIllIIIIIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllllIllIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllllIllIIIIIIll.toCharArray();
        int llllllllllllllIllllllIllIIIIIIII = lIIlIIIIllIII[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIllllllIlIlllllIIl = charArray2.length;
        int i2 = lIIlIIIIllIII[1];
        while (lIlIlIIIIIIlIIl(i2, llllllllllllllIllllllIlIlllllIIl)) {
            char llllllllllllllIllllllIllIIIIIlIl = charArray2[i2];
            sb.append((char) (llllllllllllllIllllllIllIIIIIlIl ^ charArray[llllllllllllllIllllllIllIIIIIIII % charArray.length]));
            "".length();
            llllllllllllllIllllllIllIIIIIIII++;
            i2++;
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIlIIIIlIllI[lIIlIIIIllIII[180]];
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0520, code lost:
        if (lIlIlIIIIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L399;
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
    public static void bx() {
        if (lIlIlIIIIIIlIII(by ? 1 : 0)) {
            C0001b.a(bA);
            if (lIlIlIIIIIIlIIl(bA.size(), lIIlIIIIllIII[0])) {
                System.out.println(lIIlIIIIlIllI[lIIlIIIIllIII[1]]);
                by = lIIlIIIIllIII[1];
            }
        }
        if (lIlIlIIIIIIlIlI(by ? 1 : 0)) {
            if (lIlIlIIIIIIlIlI(S() ? 1 : 0) && lIlIlIIIIIIlIIl(C0004e.j(fX), lIIlIIIIllIII[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIIIIIIlIll(nearest) && lIlIlIIIIIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[0]];
                    C0000a.a(nearest);
                }
                if (lIlIlIIIIIIlIll(nearest) && lIlIlIIIIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIlIIIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIIllIII[2]);
                        "".length();
                    }
                    if (lIlIlIIIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[3]];
                        if (lIlIlIIIIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIIllIII[4]);
                            "".length();
                        }
                        if (lIlIlIIIIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIIllIII[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIIIllIII[4]];
                        iArr[lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                        iArr[lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
                        iArr[lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
                        iArr[lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
                        if (lIlIlIIIIIIlIlI(C0004e.b(iArr) ? 1 : 0)) {
                            W();
                            System.out.println(lIIlIIIIlIllI[lIIlIIIIllIII[8]]);
                            by = lIIlIIIIllIII[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIIIIllIII[4]];
                        iArr2[lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                        iArr2[lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
                        iArr2[lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
                        iArr2[lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
                        if (lIlIlIIIIIIlIII(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIlIIIIllIII[5], lIIlIIIIllIII[10]);
                            C0000a.a(lIIlIIIIllIII[6], lIIlIIIIllIII[10]);
                            C0000a.a(lIIlIIIIllIII[7], lIIlIIIIllIII[0]);
                            C0000a.a(lIIlIIIIllIII[11], lIIlIIIIllIII[0]);
                            C0000a.a(lIIlIIIIllIII[9], lIIlIIIIllIII[0]);
                            C0000a.a(lIIlIIIIllIII[12], lIIlIIIIllIII[0]);
                            C0000a.a(lIIlIIIIllIII[13], lIIlIIIIllIII[14]);
                        }
                    }
                }
            }
            if (lIlIlIIIIIIlIII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIlIIIIIIlIIl(Movement.getRunEnergy(), lIIlIIIIllIII[15])) {
                Inventory.getFirst(C0005f.ba).interact(lIIlIIIIlIllI[lIIlIIIIllIII[4]]);
                Time.sleepTicks(lIIlIIIIllIII[0]);
                "".length();
            }
            int[] iArr3 = new int[lIIlIIIIllIII[0]];
            iArr3[lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
            if (lIlIlIIIIIIlIII(Inventory.contains(iArr3) ? 1 : 0) && lIlIlIIIIIIllIl(lIlIlIIIIIIIlll(C0004e.v(), 50.0d))) {
                int[] iArr4 = new int[lIIlIIIIllIII[0]];
                iArr4[lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                Inventory.getFirst(iArr4).interact(lIIlIIIIlIllI[lIIlIIIIllIII[14]]);
                Time.sleepTicks(lIIlIIIIllIII[3]);
                "".length();
            }
            if (lIlIlIIIIIIlIII(S() ? 1 : 0) && lIlIlIIIIIIlIlI(C0004e.j(fX))) {
                if (lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIllIII[16])) {
                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[17]];
                    Movement.walkTo(fd);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIII[0]);
                    "".length();
                }
                if (lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIllIII[16])) {
                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[18]];
                    if (lIlIlIIIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0006g.a(lIIlIIIIlIllI[lIIlIIIIllIII[16]], bW);
                }
            }
            if (lIlIlIIIIIlIIII(C0004e.j(fX), lIIlIIIIllIII[0])) {
                co = lIIlIIIIllIII[1];
                int[] iArr5 = new int[lIIlIIIIllIII[0]];
                iArr5[lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                if (lIlIlIIIIIIlIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIlIIIIllIII[0]];
                    iArr6[lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (lIlIlIIIIIIlIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr = new String[lIIlIIIIllIII[0]];
                        strArr[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[20]];
                        if (lIlIlIIIIIIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                            WorldPoint worldPoint = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[22], lIIlIIIIllIII[0]);
                            int[] iArr7 = new int[lIIlIIIIllIII[0]];
                            iArr7[lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                            if (lIlIlIIIIIIlIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                                if (lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIIllIII[14])) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[10]];
                                    Movement.walkTo(worldPoint);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIIllIII[0]);
                                    "".length();
                                }
                                if (lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIIllIII[14])) {
                                    int[] iArr8 = new int[lIIlIIIIllIII[0]];
                                    iArr8[lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                                    TileItem nearest2 = TileItems.getNearest(iArr8);
                                    if (lIlIlIIIIIIlIll(nearest2)) {
                                        if (lIlIlIIIIIIlIlI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[23]];
                                            Movement.walkTo(nearest2.getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lIIlIIIIllIII[0]);
                                            "".length();
                                        }
                                        if (lIlIlIIIIIIlIII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[24]];
                                            nearest2.interact(lIIlIIIIlIllI[lIIlIIIIllIII[25]]);
                                            Time.sleepTicks(lIIlIIIIllIII[8]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lIIlIIIIllIII[0]];
                iArr9[lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                if (lIlIlIIIIIIlIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlIIIIllIII[0]];
                    iArr10[lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                }
                int[] iArr11 = new int[lIIlIIIIllIII[0]];
                iArr11[lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                if (lIlIlIIIIIIlIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIlIIIIllIII[0]];
                    iArr12[lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                    if (lIlIlIIIIIIlIII(Inventory.contains(iArr12) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[26]];
                        int[] iArr13 = new int[lIIlIIIIllIII[0]];
                        iArr13[lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                        Item first = Inventory.getFirst(iArr13);
                        int[] iArr14 = new int[lIIlIIIIllIII[0]];
                        iArr14[lIIlIIIIllIII[1]] = lIIlIIIIllIII[9];
                        first.useOn(Inventory.getFirst(iArr14));
                        Time.sleepTicks(lIIlIIIIllIII[0]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[lIIlIIIIllIII[0]];
                iArr15[lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                if (lIlIlIIIIIIlIII(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIIIIllIII[0]];
                    strArr2[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[27]];
                    if (lIlIlIIIIIIlIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fT), lIIlIIIIllIII[4])) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[28]];
                            Movement.walkTo(fT);
                            "".length();
                            Time.sleepTicks(lIIlIIIIllIII[0]);
                            "".length();
                        }
                        if (lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fT), lIIlIIIIllIII[4])) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[29]];
                            String[] strArr3 = new String[lIIlIIIIllIII[0]];
                            strArr3[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[30]];
                            TileObjects.getNearest(strArr3).interact(lIIlIIIIlIllI[lIIlIIIIllIII[31]]);
                            Time.sleepTicks(lIIlIIIIllIII[20]);
                            "".length();
                        }
                    }
                    String[] strArr4 = new String[lIIlIIIIllIII[0]];
                    strArr4[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[32]];
                    if (lIlIlIIIIIIlIII(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fU), lIIlIIIIllIII[8])) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[33]];
                            Movement.walkTo(fU);
                            "".length();
                            Time.sleepTicks(lIIlIIIIllIII[0]);
                            "".length();
                        }
                        if (lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fU), lIIlIIIIllIII[8])) {
                            int[] iArr16 = new int[lIIlIIIIllIII[0]];
                            iArr16[lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                            Item first2 = Inventory.getFirst(iArr16);
                            String[] strArr5 = new String[lIIlIIIIllIII[0]];
                            strArr5[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[34]];
                            first2.useOn(TileObjects.getNearest(strArr5));
                            Time.sleepTicks(lIIlIIIIllIII[0]);
                            "".length();
                        }
                    }
                }
                String[] strArr6 = new String[lIIlIIIIllIII[0]];
                strArr6[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[35]];
                if (lIlIlIIIIIIlIII(Inventory.contains(strArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lIIlIIIIllIII[0]];
                    iArr17[lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (lIlIlIIIIIIlIlI(Inventory.contains(iArr17) ? 1 : 0)) {
                        String[] strArr7 = new String[lIIlIIIIllIII[0]];
                        strArr7[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[36]];
                        if (lIlIlIIIIIIlIlI(Inventory.contains(strArr7) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[37]];
                            if (lIlIlIIIIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr8 = new String[lIIlIIIIllIII[0]];
                                strArr8[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[38]];
                                TileObjects.getNearest(strArr8).interact(lIIlIIIIlIllI[lIIlIIIIllIII[39]]);
                                Time.sleepTicks(lIIlIIIIllIII[4]);
                                "".length();
                            }
                            C0006g.a(bW);
                        }
                    }
                }
                String[] strArr9 = new String[lIIlIIIIllIII[0]];
                strArr9[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[40]];
                if (lIlIlIIIIIIlIII(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lIIlIIIIllIII[0]];
                    strArr10[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[41]];
                    if (lIlIlIIIIIIlIII(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lIIlIIIIllIII[0]];
                        strArr11[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[42]];
                        if (lIlIlIIIIIIlIlI(Inventory.contains(strArr11) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIIlIIIIllIII[43], lIIlIIIIllIII[44], lIIlIIIIllIII[1]);
                            WorldPoint worldPoint3 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[44], lIIlIIIIllIII[1]);
                            WorldArea worldArea = new WorldArea(lIIlIIIIllIII[21], lIIlIIIIllIII[45], lIIlIIIIllIII[14], lIIlIIIIllIII[8], lIIlIIIIllIII[1]);
                            if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && lIlIlIIIIIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[46]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIIlIIIIllIII[0]);
                                "".length();
                            }
                            if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                String[] strArr12 = new String[lIIlIIIIllIII[0]];
                                strArr12[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[47]];
                                TileObjects.getNearest(strArr12).interact(lIIlIIIIlIllI[lIIlIIIIllIII[48]]);
                                Time.sleepTicks(lIIlIIIIllIII[3]);
                                "".length();
                            }
                            if (lIlIlIIIIIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[49]];
                                String[] strArr13 = new String[lIIlIIIIllIII[0]];
                                strArr13[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[50]];
                                TileItems.getNearest(strArr13).interact(lIIlIIIIlIllI[lIIlIIIIllIII[51]]);
                                Time.sleepTicks(lIIlIIIIllIII[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr14 = new String[lIIlIIIIllIII[0]];
                strArr14[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[52]];
                if (lIlIlIIIIIIlIII(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lIIlIIIIllIII[0]];
                    strArr15[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[53]];
                    if (lIlIlIIIIIIlIlI(Inventory.contains(strArr15) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lIIlIIIIllIII[21], lIIlIIIIllIII[45], lIIlIIIIllIII[14], lIIlIIIIllIII[8], lIIlIIIIllIII[1]);
                        WorldArea worldArea3 = new WorldArea(lIIlIIIIllIII[54], lIIlIIIIllIII[55], lIIlIIIIllIII[18], lIIlIIIIllIII[23], lIIlIIIIllIII[1]);
                        if (lIlIlIIIIIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[lIIlIIIIllIII[0]];
                            strArr16[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[56]];
                            TileObjects.getNearest(strArr16).interact(lIIlIIIIlIllI[lIIlIIIIllIII[57]]);
                            Time.sleepTicks(lIIlIIIIllIII[3]);
                            "".length();
                        }
                        if (lIlIlIIIIIIlIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIIIlIlI(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[58]];
                            Movement.walkTo(fV);
                            "".length();
                            Time.sleepTicks(lIIlIIIIllIII[0]);
                            "".length();
                        }
                        if (lIlIlIIIIIIlIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr17 = new String[lIIlIIIIllIII[0]];
                            strArr17[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[59]];
                            TileObjects.getNearest(strArr17).interact(lIIlIIIIlIllI[lIIlIIIIllIII[60]]);
                            Time.sleepTicks(lIIlIIIIllIII[4]);
                            "".length();
                        }
                        if (lIlIlIIIIIIlIII(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint4 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[61], lIIlIIIIllIII[1]);
                            WorldPoint worldPoint5 = new WorldPoint(lIIlIIIIllIII[62], lIIlIIIIllIII[63], lIIlIIIIllIII[1]);
                            new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[65], lIIlIIIIllIII[1]);
                            new WorldPoint(lIIlIIIIllIII[43], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldPoint worldPoint6 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldPoint worldPoint7 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldArea worldArea4 = new WorldArea(lIIlIIIIllIII[68], lIIlIIIIllIII[69], lIIlIIIIllIII[20], lIIlIIIIllIII[23], lIIlIIIIllIII[1]);
                            WorldArea worldArea5 = new WorldArea(lIIlIIIIllIII[70], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[17], lIIlIIIIllIII[1]);
                            WorldArea worldArea6 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[73], lIIlIIIIllIII[32], lIIlIIIIllIII[25], lIIlIIIIllIII[1]);
                            if (lIlIlIIIIIlIIIl(Vars.getBit(lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[75]))) {
                                if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[76]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIIllIII[0]);
                                    "".length();
                                }
                                if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[77]];
                                    String[] strArr18 = new String[lIIlIIIIllIII[0]];
                                    strArr18[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[78]];
                                    TileObjects.getNearest(strArr18).interact(lIIlIIIIlIllI[lIIlIIIIllIII[79]]);
                                    Time.sleepTicks(lIIlIIIIllIII[8]);
                                    "".length();
                                }
                            }
                            if (lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[75]))) {
                                if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[81]];
                                    Movement.walkTo(worldPoint5);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIIllIII[0]);
                                    "".length();
                                }
                                if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[82]];
                                    String[] strArr19 = new String[lIIlIIIIllIII[0]];
                                    strArr19[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[15]];
                                    TileObjects.getNearest(strArr19).interact(lIIlIIIIlIllI[lIIlIIIIllIII[83]]);
                                    Time.sleepTicks(lIIlIIIIllIII[8]);
                                    "".length();
                                }
                            }
                            if (lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[80]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[75]))) {
                                if (lIlIlIIIIIIlIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint8 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[84], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[85]];
                                        Movement.walkTo(worldPoint8);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        String[] strArr20 = new String[lIIlIIIIllIII[0]];
                                        strArr20[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[86]];
                                        TileObjects.getNearest(strArr20).interact(lIIlIIIIlIllI[lIIlIIIIllIII[87]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[88]];
                                    String[] strArr21 = new String[lIIlIIIIllIII[0]];
                                    strArr21[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[89]];
                                    TileObjects.getNearest(strArr21).interact(lIIlIIIIlIllI[lIIlIIIIllIII[90]]);
                                    Time.sleepTicks(lIIlIIIIllIII[8]);
                                    "".length();
                                }
                            }
                            if (lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[80]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0])) {
                                if (lIlIlIIIIIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint9 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[91], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[92]];
                                        Movement.walkTo(worldPoint9);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        String[] strArr22 = new String[lIIlIIIIllIII[0]];
                                        strArr22[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[93]];
                                        TileObjects.getNearest(strArr22).interact(lIIlIIIIlIllI[lIIlIIIIllIII[94]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[95]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[96]];
                                        String[] strArr23 = new String[lIIlIIIIllIII[0]];
                                        strArr23[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[97]];
                                        TileObjects.getNearest(strArr23).interact(lIIlIIIIlIllI[lIIlIIIIllIII[98]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0])) {
                                if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[99]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIIllIII[0]);
                                    "".length();
                                }
                                if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[100]];
                                    String[] strArr24 = new String[lIIlIIIIllIII[0]];
                                    strArr24[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[101]];
                                    TileObjects.getNearest(strArr24).interact(lIIlIIIIlIllI[lIIlIIIIllIII[102]]);
                                    Time.sleepTicks(lIIlIIIIllIII[8]);
                                    "".length();
                                }
                            }
                            if (lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[74])) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[103])) && lIlIlIIIIIIlIlI(by() ? 1 : 0)) {
                                if (lIlIlIIIIIIlIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIlIlIIIIIIlIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint10 = new WorldPoint(lIIlIIIIllIII[104], lIIlIIIIllIII[84], lIIlIIIIllIII[1]);
                                        if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[105]];
                                            Movement.walkTo(worldPoint10);
                                            "".length();
                                            Time.sleepTicks(lIIlIIIIllIII[0]);
                                            "".length();
                                        }
                                        if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            String[] strArr25 = new String[lIIlIIIIllIII[0]];
                                            strArr25[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[106]];
                                            TileObjects.getNearest(strArr25).interact(lIIlIIIIlIllI[lIIlIIIIllIII[107]]);
                                            Time.sleepTicks(lIIlIIIIllIII[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIlIlIIIIIIlIII(new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIIIlIlI(by() ? 1 : 0)) {
                                        WorldPoint worldPoint11 = new WorldPoint(lIIlIIIIllIII[108], lIIlIIIIllIII[109], lIIlIIIIllIII[1]);
                                        if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[110]];
                                            Movement.walkTo(worldPoint11);
                                            "".length();
                                            Time.sleepTicks(lIIlIIIIllIII[0]);
                                            "".length();
                                        }
                                        if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            String[] strArr26 = new String[lIIlIIIIllIII[0]];
                                            strArr26[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[111]];
                                            TileObjects.getNearest(strArr26).interact(lIIlIIIIlIllI[lIIlIIIIllIII[112]]);
                                            Time.sleepTicks(lIIlIIIIllIII[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIlIlIIIIIIlIII(new WorldArea(lIIlIIIIllIII[70], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint12 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[113], lIIlIIIIllIII[1]);
                                        if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[114]];
                                            Movement.walkTo(worldPoint12);
                                            "".length();
                                            Time.sleepTicks(lIIlIIIIllIII[0]);
                                            "".length();
                                        }
                                        if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            String[] strArr27 = new String[lIIlIIIIllIII[0]];
                                            strArr27[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[115]];
                                            TileObjects.getNearest(strArr27).interact(lIIlIIIIlIllI[lIIlIIIIllIII[116]]);
                                            Time.sleepTicks(lIIlIIIIllIII[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (lIlIlIIIIIIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIIIlIlI(by() ? 1 : 0)) {
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[117]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[118]];
                                        String[] strArr28 = new String[lIIlIIIIllIII[0]];
                                        strArr28[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[119]];
                                        TileObjects.getNearest(strArr28).interact(lIIlIIIIlIllI[lIIlIIIIllIII[120]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[74])) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[121]))) {
                                if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[122]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIIllIII[0]);
                                    "".length();
                                }
                                if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[123]];
                                    String[] strArr29 = new String[lIIlIIIIllIII[0]];
                                    strArr29[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[124]];
                                    TileObjects.getNearest(strArr29).interact(lIIlIIIIlIllI[lIIlIIIIllIII[125]]);
                                    Time.sleepTicks(lIIlIIIIllIII[8]);
                                    "".length();
                                }
                            }
                            if (lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[74])) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[126]))) {
                                WorldArea worldArea7 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (lIlIlIIIIIIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint13 = new WorldPoint(lIIlIIIIllIII[127], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[128]];
                                        Movement.walkTo(worldPoint13);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        String[] strArr30 = new String[lIIlIIIIllIII[0]];
                                        strArr30[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[129]];
                                        TileObjects.getNearest(strArr30).interact(lIIlIIIIlIllI[lIIlIIIIllIII[130]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint14 = new WorldPoint(lIIlIIIIllIII[131], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[132]];
                                        Movement.walkTo(worldPoint14);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        String[] strArr31 = new String[lIIlIIIIllIII[0]];
                                        strArr31[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[133]];
                                        TileObjects.getNearest(strArr31).interact(lIIlIIIIlIllI[lIIlIIIIllIII[134]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[135]];
                                    String[] strArr32 = new String[lIIlIIIIllIII[0]];
                                    strArr32[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[136]];
                                    TileObjects.getNearest(strArr32).interact(lIIlIIIIlIllI[lIIlIIIIllIII[137]]);
                                    Time.sleepTicks(lIIlIIIIllIII[16]);
                                    "".length();
                                }
                            }
                            if (lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[74])) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
                                WorldArea worldArea8 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (lIlIlIIIIIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint15 = new WorldPoint(lIIlIIIIllIII[138], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[139]];
                                        Movement.walkTo(worldPoint15);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        String[] strArr33 = new String[lIIlIIIIllIII[0]];
                                        strArr33[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[140]];
                                        TileObjects.getNearest(strArr33).interact(lIIlIIIIlIllI[lIIlIIIIllIII[141]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint16 = new WorldPoint(lIIlIIIIllIII[108], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[142]];
                                        Movement.walkTo(worldPoint16);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        String[] strArr34 = new String[lIIlIIIIllIII[0]];
                                        strArr34[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[143]];
                                        TileObjects.getNearest(strArr34).interact(lIIlIIIIlIllI[lIIlIIIIllIII[144]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[145]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[146]];
                                        String[] strArr35 = new String[lIIlIIIIllIII[0]];
                                        strArr35[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[147]];
                                        TileObjects.getNearest(strArr35).interact(lIIlIIIIlIllI[lIIlIIIIllIII[148]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[74])) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[103])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
                                WorldArea worldArea9 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (lIlIlIIIIIIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint17 = new WorldPoint(lIIlIIIIllIII[127], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[149]];
                                        Movement.walkTo(worldPoint17);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        String[] strArr36 = new String[lIIlIIIIllIII[0]];
                                        strArr36[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[150]];
                                        TileObjects.getNearest(strArr36).interact(lIIlIIIIlIllI[lIIlIIIIllIII[151]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint18 = new WorldPoint(lIIlIIIIllIII[104], lIIlIIIIllIII[152], lIIlIIIIllIII[1]);
                                    if (lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[153]];
                                        Movement.walkTo(worldPoint18);
                                        "".length();
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                    }
                                    if (lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        Time.sleepTicks(lIIlIIIIllIII[0]);
                                        "".length();
                                        String[] strArr37 = new String[lIIlIIIIllIII[0]];
                                        strArr37[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[154]];
                                        TileObjects.getNearest(strArr37).interact(lIIlIIIIlIllI[lIIlIIIIllIII[155]]);
                                        Time.sleepTicks(lIIlIIIIllIII[8]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIlIII(new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIIIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[156]];
                                    Time.sleepTicks(lIIlIIIIllIII[0]);
                                    "".length();
                                    int[] iArr18 = new int[lIIlIIIIllIII[0]];
                                    iArr18[lIIlIIIIllIII[1]] = lIIlIIIIllIII[157];
                                    TileObjects.getNearest(iArr18).interact(lIIlIIIIlIllI[lIIlIIIIllIII[158]]);
                                    Time.sleepTicks(lIIlIIIIllIII[8]);
                                    "".length();
                                }
                                if (lIlIlIIIIIIlIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] iArr19 = new int[lIIlIIIIllIII[0]];
                                    iArr19[lIIlIIIIllIII[1]] = lIIlIIIIllIII[159];
                                    TileObjects.getNearest(iArr19).interact(lIIlIIIIlIllI[lIIlIIIIllIII[160]]);
                                    Time.sleepTicks(lIIlIIIIllIII[8]);
                                    "".length();
                                }
                                if (lIlIlIIIIIIlIII(new WorldArea(lIIlIIIIllIII[161], lIIlIIIIllIII[162], lIIlIIIIllIII[23], lIIlIIIIllIII[14], lIIlIIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr38 = new String[lIIlIIIIllIII[0]];
                                    strArr38[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[163]];
                                    if (lIlIlIIIIIIlIlI(Inventory.contains(strArr38) ? 1 : 0)) {
                                        String[] strArr39 = new String[lIIlIIIIllIII[0]];
                                        strArr39[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[164]];
                                        TileItems.getNearest(strArr39).interact(lIIlIIIIlIllI[lIIlIIIIllIII[165]]);
                                        Time.sleepTicks(lIIlIIIIllIII[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr40 = new String[lIIlIIIIllIII[0]];
                strArr40[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[166]];
                if (lIlIlIIIIIIlIII(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lIIlIIIIllIII[0]];
                    strArr41[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[167]];
                    if (lIlIlIIIIIIlIII(Inventory.contains(strArr41) ? 1 : 0)) {
                        if (lIlIlIIIIIIlIII(new WorldArea(lIIlIIIIllIII[161], lIIlIIIIllIII[162], lIIlIIIIllIII[23], lIIlIIIIllIII[14], lIIlIIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIIlIIIIllIII[0]];
                            iArr20[lIIlIIIIllIII[1]] = lIIlIIIIllIII[159];
                            TileObjects.getNearest(iArr20).interact(lIIlIIIIlIllI[lIIlIIIIllIII[168]]);
                            Time.sleepTicks(lIIlIIIIllIII[14]);
                            "".length();
                        }
                        if (lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[169]];
                            Movement.walkTo(fW);
                            "".length();
                            Time.sleepTicks(lIIlIIIIllIII[0]);
                            "".length();
                        }
                        if (lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                                if (lIlIlIIIIIIlIII(tileObject.getName().contains(lIIlIIIIlIllI[lIIlIIIIllIII[185]]) ? 1 : 0)) {
                                    String[] strArr42 = new String[lIIlIIIIllIII[0]];
                                    strArr42[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[186]];
                                    if (lIlIlIIIIIIlIII(tileObject.hasAction(strArr42) ? 1 : 0) && lIlIlIIIIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[184], lIIlIIIIllIII[3])), lIIlIIIIllIII[3])) {
                                        ?? r0 = lIIlIIIIllIII[0];
                                        "".length();
                                        return (-((((22 + 58) - 47) + 97) ^ (((84 + 12) - 80) + 118))) > 0 ? ((187 ^ 198) ^ (247 ^ 189)) & (("  ".length() ^ (62 ^ 11)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lIIlIIIIllIII[1];
                            });
                            if (lIlIlIIIIIIlIll(nearest3)) {
                                nearest3.interact(lIIlIIIIlIllI[lIIlIIIIllIII[170]]);
                                Time.sleepTicks(lIIlIIIIllIII[8]);
                                "".length();
                            }
                            if (lIlIlIIIIIlIIlI(nearest3)) {
                                C0006g.a(lIIlIIIIlIllI[lIIlIIIIllIII[171]], bW, lIIlIIIIllIII[0]);
                            }
                        }
                    }
                }
            }
            if (lIlIlIIIIIlIIII(C0004e.j(fX), lIIlIIIIllIII[3])) {
                if (lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[172]];
                    Movement.walkTo(fW);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIII[0]);
                    "".length();
                }
                if (lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                        if (lIlIlIIIIIIlIII(tileObject2.getName().contains(lIIlIIIIlIllI[lIIlIIIIllIII[182]]) ? 1 : 0)) {
                            String[] strArr42 = new String[lIIlIIIIllIII[0]];
                            strArr42[lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[183]];
                            if (lIlIlIIIIIIlIII(tileObject2.hasAction(strArr42) ? 1 : 0) && lIlIlIIIIIIllll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[184], lIIlIIIIllIII[3])), lIIlIIIIllIII[3])) {
                                ?? r0 = lIIlIIIIllIII[0];
                                "".length();
                                return (((89 ^ 76) ^ (84 ^ 32)) & (((163 ^ 149) ^ (195 ^ 148)) ^ (-" ".length()))) != 0 ? ((26 ^ 81) ^ (41 ^ 59)) & (((12 ^ 78) ^ (63 ^ 36)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lIIlIIIIllIII[1];
                    });
                    if (lIlIlIIIIIIlIll(nearest4)) {
                        nearest4.interact(lIIlIIIIlIllI[lIIlIIIIllIII[173]]);
                        Time.sleepTicks(lIIlIIIIllIII[8]);
                        "".length();
                    }
                    if (lIlIlIIIIIlIIlI(nearest4)) {
                        if (lIlIlIIIIIIlIIl(co, lIIlIIIIllIII[0])) {
                            P.ly += lIIlIIIIllIII[0];
                            P.d(AccBuilderRat.m);
                            co += lIIlIIIIllIII[0];
                            P.ly = lIIlIIIIllIII[1];
                            cp = lIIlIIIIllIII[1];
                        }
                        C0006g.a(lIIlIIIIlIllI[lIIlIIIIllIII[174]], bW, lIIlIIIIllIII[0]);
                    }
                }
            }
            C0006g.a(bW);
        }
    }

    private static boolean lIlIlIIIIIIllIl(int i2) {
        return i2 < 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            bx();
            "".length();
            if (" ".length() >= ((208 ^ 169) ^ (66 ^ 63))) {
                return ((19 ^ 11) ^ (157 ^ 190)) & (((243 ^ 180) ^ (14 ^ 114)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIIIllIII[144];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    static boolean by() {
        if (lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[74])) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[80])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && lIlIlIIIIIIlIlI(Vars.getBit(lIIlIIIIllIII[103])) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && lIlIlIIIIIlIIII(Vars.getBit(lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
            ?? r0 = lIIlIIIIllIII[0];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIIIllIII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIlIIIIllIII[4]];
        iArr[lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
        iArr[lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
        iArr[lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
        iArr[lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
        int i2 = lIIlIIIIllIII[1];
        while (lIlIlIIIIIIlIIl(i2, iArr.length)) {
            int[] iArr2 = new int[lIIlIIIIllIII[0]];
            iArr2[lIIlIIIIllIII[1]] = iArr[i2];
            if (lIlIlIIIIIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlIIIIllIII[1];
            }
            i2++;
            "".length();
            if (" ".length() == 0) {
                return ((10 ^ 109) ^ (97 ^ 61)) & (((173 ^ 150) ^ ((54 ^ 23) & ((227 ^ 194) ^ (-1)))) ^ (-" ".length()));
            }
        }
        return lIIlIIIIllIII[0];
    }

    private static boolean lIlIlIIIIIlIIIl(int i2, int i3) {
        return i2 != i3;
    }

    private static int lIlIlIIIIIIIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIlIIIIIIlIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIlIIIIIlIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIlIIIIIIlllI(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01b2, code lost:
        if (lIlIlIIIIIIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.x.lIIlIIIIllIII[14]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2 = new int[lIIlIIIIllIII[0]];
        iArr2[lIIlIIIIllIII[1]] = lIIlIIIIllIII[6];
        if (lIlIlIIIIIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIII[6], lIIlIIIIllIII[10], lIIlIIIIllIII[175]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIIIIllIII[0]];
        iArr3[lIIlIIIIllIII[1]] = lIIlIIIIllIII[7];
        if (lIlIlIIIIIIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIII[7], lIIlIIIIllIII[0], lIIlIIIIllIII[175]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIIIIllIII[0]];
        iArr4[lIIlIIIIllIII[1]] = lIIlIIIIllIII[9];
        if (lIlIlIIIIIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIII[9], lIIlIIIIllIII[0], lIIlIIIIllIII[175]));
            "".length();
        }
        if (lIlIlIIIIIIlIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIIIIlIllI[lIIlIIIIllIII[181]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIII[176], lIIlIIIIllIII[14], lIIlIIIIllIII[177]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIIIIllIII[0]];
        iArr5[lIIlIIIIllIII[1]] = lIIlIIIIllIII[12];
        if (lIlIlIIIIIIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIII[12], lIIlIIIIllIII[4], C0007h.bv));
            "".length();
        }
        int[] iArr6 = new int[lIIlIIIIllIII[0]];
        iArr6[lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
        if (lIlIlIIIIIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIlIIIIllIII[0]];
            iArr7[lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
            if (lIlIlIIIIIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIIIIllIII[0]];
                iArr8[lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
            }
            iArr = new int[lIIlIIIIllIII[0]];
            iArr[lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
            if (lIlIlIIIIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlIIIIllIII[0]];
                iArr9[lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!lIlIlIIIIIIlIII(Bank.contains(iArr9) ? 1 : 0)) {
                    return;
                }
                int[] iArr10 = new int[lIIlIIIIllIII[0]];
                iArr10[lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!lIlIlIIIIIIlIIl(Bank.getFirst(iArr10).getQuantity(), lIIlIIIIllIII[27])) {
                    return;
                }
            }
            bA.add(new C0003d(lIIlIIIIllIII[5], lIIlIIIIllIII[57], lIIlIIIIllIII[179]));
            "".length();
        }
        bA.add(new C0003d(lIIlIIIIllIII[13], lIIlIIIIllIII[10], lIIlIIIIllIII[178]));
        "".length();
        iArr = new int[lIIlIIIIllIII[0]];
        iArr[lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
        if (lIlIlIIIIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIllIII[5], lIIlIIIIllIII[57], lIIlIIIIllIII[179]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIllIII[1];
    }

    private static boolean lIlIlIIIIIlIIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIlIIIIIlIIll(C0004e.j(lIIlIIIIllIII[47]), lIIlIIIIllIII[8])) {
            ?? r0 = lIIlIIIIllIII[0];
            "".length();
            return (-"   ".length()) > 0 ? ((85 ^ 24) ^ (76 ^ 75)) & (((85 ^ 40) ^ (17 ^ 38)) ^ (-" ".length())) : r0;
        }
        return lIIlIIIIllIII[1];
    }

    private static boolean lIlIlIIIIIlIIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIlIIIIIIllll(int i2, int i3) {
        return i2 <= i3;
    }

    private static String lIlIIllllllIlII(String llllllllllllllIllllllIlIlllIIIII, String llllllllllllllIllllllIlIlllIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllllIlIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlIlllIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIIllIII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIIIllIII[3], llllllllllllllIllllllIlIlllIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllIlIlllIIIll) {
            llllllllllllllIllllllIlIlllIIIll.printStackTrace();
            return null;
        }
    }
}
