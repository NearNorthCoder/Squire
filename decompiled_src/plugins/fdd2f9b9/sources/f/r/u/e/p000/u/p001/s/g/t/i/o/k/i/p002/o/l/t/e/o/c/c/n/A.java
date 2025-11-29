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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.A  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/A.class */
public class A implements G {
    private static final /* synthetic */ WorldPoint hm;
    private static final /* synthetic */ int hA;
    public static final /* synthetic */ WorldArea gN;
    private static final /* synthetic */ int hH;
    private static final /* synthetic */ WorldPoint hh;
    public static /* synthetic */ List<C0003d> bv;
    private static final /* synthetic */ WorldArea hv;
    private static final /* synthetic */ int gT;
    private static final /* synthetic */ int hD;
    private static final /* synthetic */ int hB;
    private static final /* synthetic */ int he;
    private static final /* synthetic */ int hG;
    private static final /* synthetic */ WorldPoint hs;
    static /* synthetic */ String hK;
    private static final /* synthetic */ WorldPoint hi;
    private static /* synthetic */ int[] hL;
    private static final /* synthetic */ WorldPoint hl;
    public static final /* synthetic */ WorldPoint gJ;
    public static final /* synthetic */ WorldPoint gI;
    private static final /* synthetic */ WorldPoint hk;
    private static /* synthetic */ String[] lIIlIlIlII;
    private static final /* synthetic */ WorldPoint hr;
    private static final /* synthetic */ WorldArea hw;
    public static final /* synthetic */ WorldArea gL;
    public static final /* synthetic */ WorldPoint gH;
    private static final /* synthetic */ int hc;
    private static final /* synthetic */ int gY;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ int hE;
    public static final /* synthetic */ WorldArea gM;
    public static final /* synthetic */ WorldArea gK;
    private static final /* synthetic */ int gZ;
    private static final /* synthetic */ WorldPoint hp;
    static /* synthetic */ String[] gz;
    private static final /* synthetic */ int hb;
    private static final /* synthetic */ int gW;
    private static final /* synthetic */ WorldPoint hf;
    private static final /* synthetic */ WorldPoint hj;
    private static final /* synthetic */ int ha;
    private static final /* synthetic */ WorldPoint hq;
    public static /* synthetic */ int hI;
    private static final /* synthetic */ WorldPoint hn;
    private static /* synthetic */ int[] lIIlIllIII;
    public static final /* synthetic */ WorldArea gO;
    public static /* synthetic */ int hJ;
    static /* synthetic */ int ck;
    private static final /* synthetic */ WorldPoint ho;
    public static final /* synthetic */ WorldArea gQ;
    private static final /* synthetic */ int hC;
    private static final /* synthetic */ int gX;
    private static final /* synthetic */ int gV;
    private static final /* synthetic */ int hd;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int gU;
    private static final /* synthetic */ WorldPoint ht;
    private static final /* synthetic */ WorldPoint hg;
    private static final /* synthetic */ int hy;
    public static final /* synthetic */ WorldArea gP;
    private static final /* synthetic */ int gS;
    public static final /* synthetic */ WorldArea gR;
    private static final /* synthetic */ WorldArea hx;
    private static final /* synthetic */ WorldPoint hu;
    private static final /* synthetic */ int hF;
    private static final /* synthetic */ int hz;

    private static boolean lllllllllIIl(int i, int i2) {
        return i < i2;
    }

    private static String llllllIlllIl(String llllllllllllllllllllllIllIIlIlIl, String llllllllllllllllllllllIllIIllIIl) {
        String llllllllllllllllllllllIllIIlIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllllllIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllllIllIIllIII = new StringBuilder();
        char[] llllllllllllllllllllllIllIIlIlll = llllllllllllllllllllllIllIIllIIl.toCharArray();
        int llllllllllllllllllllllIllIIlIllI = lIIlIllIII[4];
        char[] charArray = llllllllllllllllllllllIllIIlIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIIlIllIII[4];
        while (lllllllllIIl(i, length)) {
            char llllllllllllllllllllllIllIIllIll = charArray[i];
            llllllllllllllllllllllIllIIllIII.append((char) (llllllllllllllllllllllIllIIllIll ^ llllllllllllllllllllllIllIIlIlll[llllllllllllllllllllllIllIIlIllI % llllllllllllllllllllllIllIIlIlll.length]));
            "".length();
            llllllllllllllllllllllIllIIlIllI++;
            i++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllllIllIIllIII);
    }

    private static boolean llllllllllII(int i) {
        return i == 0;
    }

    private static void lllllllllIII() {
        lIIlIllIII = new int[175];
        lIIlIllIII[0] = (((65 ^ 41) + (21 ^ 83)) - (164 ^ 154)) + (7 ^ 55);
        lIIlIllIII[1] = "  ".length();
        lIIlIllIII[2] = (((219 ^ 152) + (((155 + 82) - 130) + 79)) - (147 ^ 166)) + (35 ^ 57);
        lIIlIllIII[3] = " ".length();
        lIIlIllIII[4] = ((((65 + 101) - 86) + 47) ^ (87 ^ 103)) & (((106 ^ 82) ^ (247 ^ 128)) ^ (-" ".length()));
        lIIlIllIII[5] = (-((-8857) & 16349)) & (-129) & 8175;
        lIIlIllIII[6] = (-24915) & 25471;
        lIIlIllIII[7] = (-19458) & 20015;
        lIIlIllIII[8] = (-25601) & 25979;
        lIIlIllIII[9] = (-((-325) & 20855)) & (-1) & 22515;
        lIIlIllIII[10] = (-8193) & 16201;
        lIIlIllIII[11] = ((101 + 21) - 29) + 57;
        lIIlIllIII[12] = "   ".length();
        lIIlIllIII[13] = 136 ^ 141;
        lIIlIllIII[14] = " ".length() ^ (154 ^ 157);
        lIIlIllIII[15] = 47 ^ 43;
        lIIlIllIII[16] = (((21 + 125) - 86) + 183) ^ (((44 + 55) - (-55)) + 9);
        lIIlIllIII[17] = (-((-25869) & 29983)) & (-25605) & 32127;
        lIIlIllIII[18] = 15 ^ 8;
        lIIlIllIII[19] = (-24717) & 27583;
        lIIlIllIII[20] = 109 ^ 101;
        lIIlIllIII[21] = (82 ^ 39) ^ (186 ^ 198);
        lIIlIllIII[22] = (34 ^ 125) ^ (73 ^ 28);
        lIIlIllIII[23] = ((194 + 191) - 281) + 125;
        lIIlIllIII[24] = (((164 + 6) - 24) + 32) ^ (((77 + 156) - 192) + 144);
        lIIlIllIII[25] = (89 ^ 94) ^ (45 ^ 38);
        lIIlIllIII[26] = (177 ^ 131) ^ (121 ^ 70);
        lIIlIllIII[27] = (15 ^ 31) ^ (110 ^ 112);
        lIIlIllIII[28] = 13 ^ 2;
        lIIlIllIII[29] = 168 ^ 184;
        lIIlIllIII[30] = (217 ^ 179) ^ (212 ^ 175);
        lIIlIllIII[31] = (((141 + 166) - 166) + 27) ^ (((164 + 181) - 261) + 102);
        lIIlIllIII[32] = (43 ^ 0) ^ (60 ^ 4);
        lIIlIllIII[33] = 177 ^ 165;
        lIIlIllIII[34] = 34 ^ 55;
        lIIlIllIII[35] = 143 ^ 153;
        lIIlIllIII[36] = 186 ^ 173;
        lIIlIllIII[37] = 218 ^ 194;
        lIIlIllIII[38] = (54 ^ 31) ^ (152 ^ 168);
        lIIlIllIII[39] = (-2) & 2411;
        lIIlIllIII[40] = (239 ^ 171) ^ (242 ^ 172);
        lIIlIllIII[41] = (((160 + 112) - 161) + 79) ^ (((161 + 8) - 75) + 71);
        lIIlIllIII[42] = 150 ^ 138;
        lIIlIllIII[43] = 2 ^ 31;
        lIIlIllIII[44] = 126 ^ 96;
        lIIlIllIII[45] = (((120 + 122) - 232) + 121) ^ (((70 + 29) - 55) + 112);
        lIIlIllIII[46] = (((64 + 135) - 80) + 48) ^ (((77 + 16) - 17) + 59);
        lIIlIllIII[47] = (((114 + 137) - 181) + 102) ^ (((4 + 87) - (-14)) + 36);
        lIIlIllIII[48] = " ".length() ^ (51 ^ 16);
        lIIlIllIII[49] = 56 ^ 27;
        lIIlIllIII[50] = (((9 + 36) - (-23)) + 115) ^ (((99 + 118) - 120) + 50);
        lIIlIllIII[51] = 172 ^ 137;
        lIIlIllIII[52] = 55 ^ 17;
        lIIlIllIII[53] = 23 ^ 48;
        lIIlIllIII[54] = (((91 + 115) - 158) + 79) ^ (38 ^ 113);
        lIIlIllIII[55] = (((9 + 159) - 10) + 18) ^ (((36 + 61) - (-25)) + 31);
        lIIlIllIII[56] = (((124 + 25) - 55) + 41) ^ (((10 + 21) - (-121)) + 21);
        lIIlIllIII[57] = (((24 + 69) - (-33)) + 18) ^ (((54 + 55) - (-70)) + 8);
        lIIlIllIII[58] = (-((-8477) & 28991)) & (-9225) & 32639;
        lIIlIllIII[59] = (-((-131) & 16566)) & (-12865) & 32759;
        lIIlIllIII[60] = (-26241) & 28651;
        lIIlIllIII[61] = (((124 + 34) - 85) + 54) ^ (12 ^ 95);
        lIIlIllIII[62] = (-((-789) & 4893)) & (-1027) & 8063;
        lIIlIllIII[63] = 29 ^ 48;
        lIIlIllIII[64] = 233 ^ 199;
        lIIlIllIII[65] = 19 ^ 60;
        lIIlIllIII[66] = (((14 + 35) - 26) + 161) ^ (((44 + 75) - 18) + 35);
        lIIlIllIII[67] = (203 ^ 196) ^ (14 ^ 48);
        lIIlIllIII[68] = (((33 + 42) - (-40)) + 15) ^ (((21 + 151) - 85) + 89);
        lIIlIllIII[69] = 160 ^ 147;
        lIIlIllIII[70] = (58 ^ 9) ^ (27 ^ 28);
        lIIlIllIII[71] = (62 ^ 117) ^ (229 ^ 155);
        lIIlIllIII[72] = 142 ^ 184;
        lIIlIllIII[73] = (((35 + 101) - 132) + 240) ^ (((25 + 44) - (-68)) + 58);
        lIIlIllIII[74] = (((94 + 60) - 40) + 68) ^ (((62 + 133) - 192) + 139);
        lIIlIllIII[75] = (((71 + 217) - 96) + 59) ^ (((114 + 112) - 132) + 100);
        lIIlIllIII[76] = (244 ^ 168) ^ (79 ^ 41);
        lIIlIllIII[77] = (82 ^ 78) ^ (159 ^ 184);
        lIIlIllIII[78] = (46 ^ 65) ^ (102 ^ 53);
        lIIlIllIII[79] = 9 ^ 52;
        lIIlIllIII[80] = 183 ^ 137;
        lIIlIllIII[81] = 139 ^ 180;
        lIIlIllIII[82] = (-69) & 4063;
        lIIlIllIII[83] = (((203 + 102) - 136) + 72) ^ (((159 + 52) - 207) + 173);
        lIIlIllIII[84] = (((241 + 160) - 294) + 137) ^ (((170 + 114) - 239) + 136);
        lIIlIllIII[85] = 197 ^ 135;
        lIIlIllIII[86] = (((103 + 204) - 132) + 41) ^ (((108 + 139) - 163) + 71);
        lIIlIllIII[87] = (36 ^ 5) ^ (25 ^ 124);
        lIIlIllIII[88] = (23 ^ 99) ^ (96 ^ 81);
        lIIlIllIII[89] = "   ".length() ^ (79 ^ 10);
        lIIlIllIII[90] = 85 ^ 18;
        lIIlIllIII[91] = 40 ^ 96;
        lIIlIllIII[92] = 4 ^ 77;
        lIIlIllIII[93] = (-((-20209) & 32507)) & (-16405) & 31615;
        lIIlIllIII[94] = (-29281) & 32746;
        lIIlIllIII[95] = 223 ^ 149;
        lIIlIllIII[96] = (((166 + 174) - 220) + 83) ^ (((47 + 44) - 83) + 120);
        lIIlIllIII[97] = (55 ^ 121) ^ "  ".length();
        lIIlIllIII[98] = 39 ^ 106;
        lIIlIllIII[99] = (-27761) & 32760;
        lIIlIllIII[100] = (((91 + 129) - 33) + 12) ^ (((100 + 18) - 44) + 63);
        lIIlIllIII[101] = (-((-689) & 16051)) & (-16389) & 32750;
        lIIlIllIII[102] = 78 ^ 1;
        lIIlIllIII[103] = (130 ^ 175) ^ (224 ^ 156);
        lIIlIllIII[104] = 74 ^ 24;
        lIIlIllIII[105] = (-24737) & 32743;
        lIIlIllIII[106] = (227 ^ 181) ^ (0 ^ 5);
        lIIlIllIII[107] = (-1537) & 2036;
        lIIlIllIII[108] = (-19971) & 32595;
        lIIlIllIII[109] = (((205 + 134) - 192) + 68) ^ (((27 + 105) - 58) + 105);
        lIIlIllIII[110] = (-3152) & 3551;
        lIIlIllIII[111] = (-((-8931) & 26339)) & (-9) & 22526;
        lIIlIllIII[112] = (-4372) & 16351;
        lIIlIllIII[113] = (-((-201) & 6603)) & (-1157) & 24558;
        lIIlIllIII[114] = (-((-9347) & 29843)) & (-10371) & 32766;
        lIIlIllIII[115] = (-((-18009) & 26239)) & (-2057) & 12286;
        lIIlIllIII[116] = 122 ^ 46;
        lIIlIllIII[117] = (29 ^ 2) ^ (39 ^ 109);
        lIIlIllIII[118] = (-((-23813) & 32573)) & (-18433) & 28666;
        lIIlIllIII[119] = (-10298) & 11773;
        lIIlIllIII[120] = (-2598) & 4069;
        lIIlIllIII[121] = (-19781) & 20334;
        lIIlIllIII[122] = (-((-10559) & 14719)) & (-25089) & 30718;
        lIIlIllIII[123] = (-((-2817) & 15249)) & (-17419) & 32766;
        lIIlIllIII[124] = (-((-4538) & 21437)) & (-69) & 20431;
        lIIlIllIII[125] = (-28681) & 31599;
        lIIlIllIII[126] = (-28714) & 31613;
        lIIlIllIII[127] = (-((-3467) & 32175)) & (-585) & 32751;
        lIIlIllIII[128] = (-29829) & 32743;
        lIIlIllIII[129] = (-((-16913) & 29341)) & (-17410) & 32767;
        lIIlIllIII[130] = (-16965) & 20422;
        lIIlIllIII[131] = (-5249) & 8150;
        lIIlIllIII[132] = (-20587) & 24047;
        lIIlIllIII[133] = (-((-18085) & 30399)) & (-16513) & 31743;
        lIIlIllIII[134] = (-25758) & 28669;
        lIIlIllIII[135] = (-553) & 4015;
        lIIlIllIII[136] = (-((-8493) & 25005)) & (-33) & 19447;
        lIIlIllIII[137] = (-((-737) & 21227)) & (-9345) & 32763;
        lIIlIllIII[138] = (-((-8481) & 13164)) & (-389) & 8175;
        lIIlIllIII[139] = (-13189) & 16351;
        lIIlIllIII[140] = (-20609) & 23535;
        lIIlIllIII[141] = (-((-16977) & 29393)) & (-1) & 15871;
        lIIlIllIII[142] = (-25729) & 28664;
        lIIlIllIII[143] = (-28778) & 31743;
        lIIlIllIII[144] = (-4169) & 7549;
        lIIlIllIII[145] = (-((-2131) & 27775)) & (-129) & 28671;
        lIIlIllIII[146] = (-((-9355) & 30443)) & (-8203) & 32763;
        lIIlIllIII[147] = (-29731) & 32635;
        lIIlIllIII[148] = (-((-19675) & 28379)) & (-16429) & 28607;
        lIIlIllIII[149] = (-((-2573) & 15021)) & (-17414) & 32767;
        lIIlIllIII[150] = (-((-12977) & 31675)) & (-34) & 28607;
        lIIlIllIII[151] = (-((-167) & 22767)) & (-33) & 32506;
        lIIlIllIII[152] = (-263) & 10135;
        lIIlIllIII[153] = (-12855) & 16319;
        lIIlIllIII[154] = (-((-10505) & 32041)) & (-1) & 24447;
        lIIlIllIII[155] = (-8275) & 11743;
        lIIlIllIII[156] = (-((-583) & 8775)) & (-5157) & 16255;
        lIIlIllIII[157] = (-12803) & 16278;
        lIIlIllIII[158] = (-34) & 9903;
        lIIlIllIII[159] = (-21507) & 24415;
        lIIlIllIII[160] = (-((-771) & 23371)) & (-257) & 32733;
        lIIlIllIII[161] = (-17053) & 32415;
        lIIlIllIII[162] = (-((-5411) & 16359)) & (-57) & 16127;
        lIIlIllIII[163] = (((145 + 97) - 2) + 15) ^ (((111 + 123) - 135) + 70);
        lIIlIllIII[164] = 251 ^ 172;
        lIIlIllIII[165] = (((62 + 219) - 226) + 194) ^ (((137 + 125) - 104) + 3);
        lIIlIllIII[166] = (215 ^ 184) ^ (69 ^ 115);
        lIIlIllIII[167] = 120 ^ 34;
        lIIlIllIII[168] = 35 ^ 120;
        lIIlIllIII[169] = (84 ^ 72) ^ (121 ^ 57);
        lIIlIllIII[170] = (-((-2009) & 30683)) & (-65) & 32734;
        lIIlIllIII[171] = (-((-1933) & 14287)) & (-1) & 16351;
        lIIlIllIII[172] = (-(66 ^ 3)) & (-1) & 4062;
        lIIlIllIII[173] = (-20513) & 24511;
        lIIlIllIII[174] = (101 ^ 65) ^ (10 ^ 115);
    }

    static {
        lllllllllIII();
        lllllllIlIlI();
        ha = lIIlIllIII[82];
        gV = lIIlIllIII[3];
        hA = lIIlIllIII[118];
        hG = lIIlIllIII[8];
        gY = lIIlIllIII[14];
        hE = lIIlIllIII[6];
        hB = lIIlIllIII[119];
        hH = lIIlIllIII[9];
        hz = lIIlIllIII[120];
        hc = lIIlIllIII[60];
        hF = lIIlIllIII[121];
        gW = lIIlIllIII[1];
        hb = lIIlIllIII[17];
        he = lIIlIllIII[19];
        hy = lIIlIllIII[122];
        hD = lIIlIllIII[5];
        hd = lIIlIllIII[39];
        gX = lIIlIllIII[12];
        gT = lIIlIllIII[1];
        hC = lIIlIllIII[7];
        gS = lIIlIllIII[0];
        gU = lIIlIllIII[2];
        gZ = lIIlIllIII[18];
        gH = new WorldPoint(lIIlIllIII[123], lIIlIllIII[59], lIIlIllIII[4]);
        gI = new WorldPoint(lIIlIllIII[62], lIIlIllIII[124], lIIlIllIII[4]);
        gJ = new WorldPoint(lIIlIllIII[125], lIIlIllIII[94], lIIlIllIII[4]);
        gK = new WorldArea(lIIlIllIII[126], lIIlIllIII[127], lIIlIllIII[31], lIIlIllIII[14], lIIlIllIII[4]);
        gL = new WorldArea(lIIlIllIII[128], lIIlIllIII[127], lIIlIllIII[30], lIIlIllIII[14], lIIlIllIII[4]);
        gM = new WorldArea(lIIlIllIII[129], lIIlIllIII[130], lIIlIllIII[15], lIIlIllIII[22], lIIlIllIII[4]);
        gN = new WorldArea(lIIlIllIII[131], lIIlIllIII[132], lIIlIllIII[24], lIIlIllIII[15], lIIlIllIII[4]);
        gO = new WorldArea(lIIlIllIII[133], lIIlIllIII[132], lIIlIllIII[18], lIIlIllIII[13], lIIlIllIII[4]);
        gP = new WorldArea(lIIlIllIII[134], lIIlIllIII[135], lIIlIllIII[21], lIIlIllIII[18], lIIlIllIII[4]);
        gQ = new WorldArea(lIIlIllIII[136], lIIlIllIII[132], lIIlIllIII[15], lIIlIllIII[15], lIIlIllIII[4]);
        gR = new WorldArea(lIIlIllIII[137], lIIlIllIII[132], lIIlIllIII[15], lIIlIllIII[13], lIIlIllIII[4]);
        hf = new WorldPoint(lIIlIllIII[138], lIIlIllIII[139], lIIlIllIII[1]);
        hg = new WorldPoint(lIIlIllIII[140], lIIlIllIII[141], lIIlIllIII[4]);
        hh = new WorldPoint(lIIlIllIII[142], lIIlIllIII[127], lIIlIllIII[4]);
        hi = new WorldPoint(lIIlIllIII[143], lIIlIllIII[144], lIIlIllIII[4]);
        hj = new WorldPoint(lIIlIllIII[145], lIIlIllIII[146], lIIlIllIII[4]);
        hk = new WorldPoint(lIIlIllIII[131], lIIlIllIII[94], lIIlIllIII[4]);
        hl = new WorldPoint(lIIlIllIII[147], lIIlIllIII[148], lIIlIllIII[4]);
        hm = new WorldPoint(lIIlIllIII[149], lIIlIllIII[150], lIIlIllIII[4]);
        hn = new WorldPoint(lIIlIllIII[145], lIIlIllIII[151], lIIlIllIII[4]);
        ho = new WorldPoint(lIIlIllIII[131], lIIlIllIII[151], lIIlIllIII[4]);
        hp = new WorldPoint(lIIlIllIII[131], lIIlIllIII[152], lIIlIllIII[4]);
        hq = new WorldPoint(lIIlIllIII[136], lIIlIllIII[151], lIIlIllIII[4]);
        hr = new WorldPoint(lIIlIllIII[136], lIIlIllIII[152], lIIlIllIII[4]);
        hs = new WorldPoint(lIIlIllIII[58], lIIlIllIII[153], lIIlIllIII[4]);
        ht = new WorldPoint(lIIlIllIII[62], lIIlIllIII[135], lIIlIllIII[4]);
        hu = new WorldPoint(lIIlIllIII[154], lIIlIllIII[155], lIIlIllIII[4]);
        hv = new WorldArea(new WorldPoint(lIIlIllIII[156], lIIlIllIII[157], lIIlIllIII[4]), new WorldPoint(lIIlIllIII[58], lIIlIllIII[94], lIIlIllIII[4]));
        hw = new WorldArea(new WorldPoint(lIIlIllIII[145], lIIlIllIII[158], lIIlIllIII[4]), new WorldPoint(lIIlIllIII[159], lIIlIllIII[160], lIIlIllIII[4]));
        hx = new WorldArea(lIIlIllIII[62], lIIlIllIII[130], lIIlIllIII[14], lIIlIllIII[22], lIIlIllIII[4]);
        bv = new ArrayList();
        hI = lIIlIllIII[161];
        hJ = lIIlIllIII[162];
        hK = lIIlIlIlII[lIIlIllIII[163]];
        String[] strArr = new String[lIIlIllIII[14]];
        strArr[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[164]];
        strArr[lIIlIllIII[3]] = lIIlIlIlII[lIIlIllIII[165]];
        strArr[lIIlIllIII[1]] = lIIlIlIlII[lIIlIllIII[166]];
        strArr[lIIlIllIII[12]] = lIIlIlIlII[lIIlIllIII[167]];
        strArr[lIIlIllIII[15]] = lIIlIlIlII[lIIlIllIII[168]];
        strArr[lIIlIllIII[13]] = lIIlIlIlII[lIIlIllIII[169]];
        gz = strArr;
        int[] iArr = new int[lIIlIllIII[15]];
        iArr[lIIlIllIII[4]] = lIIlIllIII[170];
        iArr[lIIlIllIII[3]] = lIIlIllIII[171];
        iArr[lIIlIllIII[1]] = lIIlIllIII[172];
        iArr[lIIlIllIII[12]] = lIIlIllIII[173];
        hL = iArr;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIlIlII[lIIlIllIII[116]];
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b3f, code lost:
        if (llllllllllIl(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.ht), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[12]) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0dab, code lost:
        if (llllllllllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017a  */
    /* JADX WARN: Type inference failed for: r0v651, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bu() {
        if (lllllllllIIl(C0004e.j(lIIlIllIII[0]), lIIlIllIII[1])) {
            try {
                D.bK();
                "".length();
                if ((-" ".length()) >= 0) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (lllllllllIlI(C0004e.j(lIIlIllIII[0]), lIIlIllIII[1]) && lllllllllIIl(C0004e.j(lIIlIllIII[2]), lIIlIllIII[3])) {
            if (lllllllllIll(bt ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[4]];
                C0001b.a(bv);
                if (lllllllllIIl(bv.size(), lIIlIllIII[3])) {
                    System.out.println(lIIlIlIlII[lIIlIllIII[3]]);
                    bt = lIIlIllIII[4];
                }
            }
            do {
                if (lllllllllIll(v.aX() ? 1 : 0)) {
                    int[] iArr = new int[lIIlIllIII[3]];
                    iArr[lIIlIllIII[4]] = lIIlIllIII[5];
                    if (lllllllllIll(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIlIllIII[3]];
                        iArr2[lIIlIllIII[4]] = lIIlIllIII[6];
                        if (lllllllllIll(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIlIllIII[3]];
                            iArr3[lIIlIllIII[4]] = lIIlIllIII[7];
                            if (lllllllllIll(Inventory.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIlIllIII[3]];
                                iArr4[lIIlIllIII[4]] = lIIlIllIII[8];
                                if (lllllllllIll(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lIIlIllIII[3]];
                                    iArr5[lIIlIllIII[4]] = lIIlIllIII[9];
                                    if (lllllllllIll(Inventory.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[lIIlIllIII[3]];
                                        iArr6[lIIlIllIII[4]] = lIIlIllIII[10];
                                        if (!llllllllllII(Inventory.contains(iArr6) ? 1 : 0)) {
                                            if (llllllllllII(bt ? 1 : 0)) {
                                                if (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[11])) {
                                                    int[] iArr7 = new int[lIIlIllIII[3]];
                                                    iArr7[lIIlIllIII[4]] = lIIlIllIII[10];
                                                    if (lllllllllIll(Inventory.contains(iArr7) ? 1 : 0)) {
                                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[1]];
                                                        int[] iArr8 = new int[lIIlIllIII[3]];
                                                        iArr8[lIIlIllIII[4]] = lIIlIllIII[10];
                                                        Inventory.getFirst(iArr8).interact(lIIlIlIlII[lIIlIllIII[12]]);
                                                        Time.sleepTicks(lIIlIllIII[13]);
                                                        "".length();
                                                    }
                                                }
                                                if (lllllllllIIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[11]) && llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[14])) {
                                                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[15]];
                                                    if (lllllllllIll(Inventory.contains(C0005f.aV) ? 1 : 0) && lllllllllIIl(Movement.getRunEnergy(), lIIlIllIII[16])) {
                                                        Inventory.getFirst(C0005f.aV).interact(lIIlIlIlII[lIIlIllIII[13]]);
                                                        Time.sleepTicks(lIIlIllIII[3]);
                                                        "".length();
                                                    }
                                                    Movement.walkTo(hg);
                                                    "".length();
                                                    Time.sleepTicks(lIIlIllIII[3]);
                                                    "".length();
                                                }
                                                if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[14])) {
                                                    C0006g.a(lIIlIlIlII[lIIlIllIII[14]], gz);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    bw();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                } else if (llllllllllII(bt ? 1 : 0)) {
                }
            } while (0 == 0);
            return;
        }
        if (lllllllllIlI(C0004e.j(lIIlIllIII[0]), lIIlIllIII[1]) && lllllllllIlI(C0004e.j(lIIlIllIII[2]), lIIlIllIII[3])) {
            if (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15]) && llllllllllII(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlIllIII[3]];
                iArr9[lIIlIllIII[4]] = lIIlIllIII[17];
                if (llllllllllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[18]];
                    Movement.walkTo(hj);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                }
            }
            if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15]) && llllllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] iArr10 = new int[lIIlIllIII[3]];
                iArr10[lIIlIllIII[4]] = lIIlIllIII[17];
                if (llllllllllII(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIlIllIII[3]];
                    iArr11[lIIlIllIII[4]] = lIIlIllIII[19];
                    TileObject nearest = TileObjects.getNearest(iArr11);
                    if (lllllllllIll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr12 = new int[lIIlIllIII[3]];
                        iArr12[lIIlIllIII[4]] = lIIlIllIII[8];
                        Inventory.getFirst(iArr12).interact(lIIlIlIlII[lIIlIllIII[20]]);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                    }
                    if (llllllllllII(Inventory.isFull() ? 1 : 0)) {
                        if (llllllllllll(nearest) && llllllllllII(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[21]];
                            nearest.interact(lIIlIlIlII[lIIlIllIII[22]]);
                            Dialog.continueSpace();
                        }
                        Widget widget = Widgets.get(lIIlIllIII[23], lIIlIllIII[3]);
                        if (llllllllllll(widget)) {
                            widget.interact(lIIlIlIlII[lIIlIllIII[24]]);
                            widget.interact(lIIlIllIII[4]);
                            widget.interact(lIIlIlIlII[lIIlIllIII[25]]);
                            Keyboard.type(lIIlIlIlII[lIIlIllIII[26]]);
                        }
                    }
                }
            }
            if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15])) {
                int[] iArr13 = new int[lIIlIllIII[3]];
                iArr13[lIIlIllIII[4]] = lIIlIllIII[17];
                if (lllllllllIll(Inventory.contains(iArr13) ? 1 : 0) && llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[27]];
                    Movement.walkTo(hn);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                }
            }
            if (lllllllllIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[28]];
                if (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                    Movement.walkTo(hn);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                }
                if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                    String[] strArr = new String[lIIlIllIII[3]];
                    strArr[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[29]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[30]];
                    if (lllllllllIll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr14 = new int[lIIlIllIII[3]];
                        iArr14[lIIlIllIII[4]] = lIIlIllIII[8];
                        Inventory.getFirst(iArr14).interact(lIIlIlIlII[lIIlIllIII[31]]);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                    }
                    if (llllllllllll(nearest2)) {
                        String[] strArr2 = new String[lIIlIllIII[3]];
                        strArr2[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[32]];
                        if (lllllllllIll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lIIlIlIlII[lIIlIllIII[33]]);
                            Time.sleepTicks(lIIlIllIII[1]);
                            "".length();
                        }
                        String[] strArr3 = new String[lIIlIllIII[3]];
                        strArr3[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[34]];
                        if (lllllllllIll(nearest2.hasAction(strArr3) ? 1 : 0)) {
                            nearest2.interact(lIIlIlIlII[lIIlIllIII[35]]);
                            Time.sleepTicks(lIIlIllIII[1]);
                            "".length();
                            Widget widget2 = Widgets.get(lIIlIllIII[23], lIIlIllIII[3]);
                            if (llllllllllll(widget2)) {
                                widget2.interact(lIIlIlIlII[lIIlIllIII[36]]);
                                widget2.interact(lIIlIllIII[4]);
                                widget2.interact(lIIlIlIlII[lIIlIllIII[37]]);
                                Keyboard.type(lIIlIlIlII[lIIlIllIII[38]]);
                            }
                        }
                    }
                }
            }
        }
        if (lllllllllIlI(C0004e.j(lIIlIllIII[0]), lIIlIllIII[1]) && lllllllllIlI(C0004e.j(lIIlIllIII[2]), lIIlIllIII[1])) {
            ck = lIIlIllIII[4];
            if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[22])) {
                while (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[1]) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    Movement.walkTo(hj);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if ((((83 ^ 86) ^ (39 ^ 101)) & (((((7 + 82) - 28) + 151) ^ (((95 + 24) - 57) + 85)) ^ (-" ".length()))) < (((52 ^ 101) ^ (17 ^ 11)) & (((85 ^ 44) ^ (112 ^ 66)) ^ (-" ".length())))) {
                        return;
                    }
                }
            }
            int[] iArr15 = new int[lIIlIllIII[3]];
            iArr15[lIIlIllIII[4]] = lIIlIllIII[39];
            if (llllllllllII(Inventory.contains(iArr15) ? 1 : 0) && lllllllllIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[40]];
                if (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                    Movement.walkTo(hn);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                }
                if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                    String[] strArr4 = new String[lIIlIllIII[3]];
                    strArr4[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[41]];
                    TileObject nearest3 = TileObjects.getNearest(strArr4);
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[42]];
                    if (llllllllllll(nearest3)) {
                        String[] strArr5 = new String[lIIlIllIII[3]];
                        strArr5[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[43]];
                        if (lllllllllIll(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            nearest3.interact(lIIlIlIlII[lIIlIllIII[44]]);
                            Time.sleepTicks(lIIlIllIII[1]);
                            "".length();
                        }
                        String[] strArr6 = new String[lIIlIllIII[3]];
                        strArr6[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[45]];
                        if (lllllllllIll(nearest3.hasAction(strArr6) ? 1 : 0)) {
                            nearest3.interact(lIIlIlIlII[lIIlIllIII[46]]);
                            Time.sleepTicks(lIIlIllIII[1]);
                            "".length();
                            Widget widget3 = Widgets.get(lIIlIllIII[23], lIIlIllIII[3]);
                            if (llllllllllll(widget3)) {
                                widget3.interact(lIIlIlIlII[lIIlIllIII[47]]);
                                widget3.interact(lIIlIllIII[4]);
                                widget3.interact(lIIlIlIlII[lIIlIllIII[48]]);
                                Keyboard.type(lIIlIlIlII[lIIlIllIII[49]]);
                            }
                        }
                    }
                }
            }
            int[] iArr16 = new int[lIIlIllIII[3]];
            iArr16[lIIlIllIII[4]] = lIIlIllIII[39];
            if (lllllllllIll(Inventory.contains(iArr16) ? 1 : 0) && llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[3])) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[50]];
                Movement.walkTo(hk);
                "".length();
                Time.sleepTicks(lIIlIllIII[3]);
                "".length();
            }
            if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[1])) {
                String[] strArr7 = new String[lIIlIllIII[3]];
                strArr7[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[51]];
                TileObject nearest4 = TileObjects.getNearest(strArr7);
                String[] strArr8 = new String[lIIlIllIII[3]];
                strArr8[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[52]];
                NPC nearest5 = NPCs.getNearest(strArr8);
                if (llllllllllll(nearest4) && lIIIIIIIIIIII(nearest5)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[53]];
                    String[] strArr9 = new String[lIIlIllIII[3]];
                    strArr9[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[54]];
                    if (lllllllllIll(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lIIlIllIII[3]];
                        strArr10[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[55]];
                        Inventory.getFirst(strArr10).useOn(nearest4);
                    }
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                }
                if (llllllllllll(nearest5)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[56]];
                    int[] iArr17 = new int[lIIlIllIII[3]];
                    iArr17[lIIlIllIII[4]] = lIIlIllIII[39];
                    if (lllllllllIll(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lIIlIllIII[3]];
                        iArr18[lIIlIllIII[4]] = lIIlIllIII[39];
                        Inventory.getFirst(iArr18).useOn(nearest5);
                    }
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                }
            }
        }
        if (lllllllllIll(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllllllIlI(C0004e.j(lIIlIllIII[2]), lIIlIllIII[12])) {
            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[57]];
            Movement.walkTo(new WorldPoint(lIIlIllIII[58], lIIlIllIII[59], lIIlIllIII[4]));
            "".length();
            Time.sleepTicks(lIIlIllIII[3]);
            "".length();
        }
        if (llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllllllIlI(C0004e.j(lIIlIllIII[2]), lIIlIllIII[12])) {
            int[] iArr19 = new int[lIIlIllIII[3]];
            iArr19[lIIlIllIII[4]] = lIIlIllIII[60];
            if (lllllllllIll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIlIllIII[3]];
                iArr20[lIIlIllIII[4]] = lIIlIllIII[60];
                if (lllllllllIll(Inventory.contains(iArr20) ? 1 : 0)) {
                }
            }
            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[61]];
            if (lIIIIIIIIIIIl(Movement.getRunEnergy(), lIIlIllIII[33])) {
                bv();
            }
        }
        if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(ht), lIIlIllIII[12])) {
            int[] iArr21 = new int[lIIlIllIII[3]];
            iArr21[lIIlIllIII[4]] = lIIlIllIII[60];
            if (lllllllllIll(Inventory.contains(iArr21) ? 1 : 0) && lllllllllIlI(Players.getLocal().getWorldLocation().getX(), lIIlIllIII[62])) {
                String[] strArr11 = new String[lIIlIllIII[3]];
                strArr11[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[63]];
                TileObject nearest6 = TileObjects.getNearest(strArr11);
                if (llllllllllll(nearest6)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[64]];
                    int[] iArr22 = new int[lIIlIllIII[3]];
                    iArr22[lIIlIllIII[4]] = lIIlIllIII[60];
                    if (lllllllllIll(Inventory.contains(iArr22) ? 1 : 0)) {
                        int[] iArr23 = new int[lIIlIllIII[3]];
                        iArr23[lIIlIllIII[4]] = lIIlIllIII[60];
                        Inventory.getFirst(iArr23).useOn(nearest6);
                        Time.sleepTicks(lIIlIllIII[1]);
                        "".length();
                    }
                }
            }
        }
        if (lllllllllIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr24 = new int[lIIlIllIII[3]];
            iArr24[lIIlIllIII[4]] = lIIlIllIII[60];
            if (lllllllllIll(Inventory.contains(iArr24) ? 1 : 0)) {
                if (llllllllllII(Players.getLocal().getWorldLocation().equals(hh) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[65]];
                    Movement.walkTo(hh);
                    "".length();
                }
                if (lllllllllllI(Skills.getBoostedLevel(Skill.HITPOINTS), lIIlIllIII[13])) {
                    int[] iArr25 = new int[lIIlIllIII[3]];
                    iArr25[lIIlIllIII[4]] = lIIlIllIII[8];
                    if (lllllllllIll(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[lIIlIllIII[3]];
                        iArr26[lIIlIllIII[4]] = lIIlIllIII[8];
                        Inventory.getFirst(iArr26).interact(lIIlIlIlII[lIIlIllIII[66]]);
                    }
                }
                if (lllllllllIll(Players.getLocal().getWorldLocation().equals(hh) ? 1 : 0)) {
                    NPC nearest7 = NPCs.getNearest(hL);
                    if (llllllllllll(nearest7) && llllllllllII(nearest7.isDead() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[67]];
                        if (lllllllllIIl(Skills.getLevel(Skill.MAGIC), lIIlIllIII[21])) {
                            Magic.cast(SpellBook.Standard.WATER_STRIKE, nearest7);
                            Time.sleepTicks(lIIlIllIII[3]);
                            "".length();
                        }
                        if (!lllllllllIIl(Skills.getLevel(Skill.MAGIC), lIIlIllIII[26]) || lllllllllIIl(Skills.getLevel(Skill.MAGIC), lIIlIllIII[21])) {
                            if (lIIIIIIIIIIIl(Skills.getLevel(Skill.MAGIC), lIIlIllIII[21])) {
                                int[] iArr27 = new int[lIIlIllIII[3]];
                                iArr27[lIIlIllIII[4]] = lIIlIllIII[6];
                                if (lllllllllIll(Inventory.contains(iArr27) ? 1 : 0)) {
                                    String[] strArr12 = new String[lIIlIllIII[3]];
                                    strArr12[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[68]];
                                }
                            }
                            if (lIIIIIIIIIIIl(Skills.getLevel(Skill.MAGIC), lIIlIllIII[26])) {
                                String[] strArr13 = new String[lIIlIllIII[3]];
                                strArr13[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[69]];
                                if (lllllllllIll(Inventory.contains(strArr13) ? 1 : 0)) {
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, nearest7);
                                    Time.sleepTicks(lIIlIllIII[3]);
                                    "".length();
                                }
                            }
                        }
                        Magic.cast(SpellBook.Standard.EARTH_STRIKE, nearest7);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        if (lIIIIIIIIIIIl(Skills.getLevel(Skill.MAGIC), lIIlIllIII[26])) {
                        }
                    }
                }
            }
        }
        if (lllllllllIlI(C0004e.j(lIIlIllIII[2]), lIIlIllIII[14])) {
            String[] strArr14 = new String[lIIlIllIII[3]];
            strArr14[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[70]];
            if (llllllllllII(Inventory.contains(strArr14) ? 1 : 0)) {
                String[] strArr15 = new String[lIIlIllIII[3]];
                strArr15[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[71]];
                TileItem nearest8 = TileItems.getNearest(strArr15);
                if (llllllllllll(nearest8)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[72]];
                    nearest8.interact(lIIlIlIlII[lIIlIllIII[73]]);
                    Time.sleepTicks(lIIlIllIII[1]);
                    "".length();
                }
            }
        }
        if (lllllllllIlI(C0004e.j(lIIlIllIII[2]), lIIlIllIII[14])) {
            String[] strArr16 = new String[lIIlIllIII[3]];
            strArr16[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[74]];
            if (lllllllllIll(Inventory.contains(strArr16) ? 1 : 0)) {
                if (lllllllllIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr28 = new int[lIIlIllIII[3]];
                    iArr28[lIIlIllIII[4]] = lIIlIllIII[10];
                    if (lllllllllIll(Inventory.contains(iArr28) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[75]];
                        int[] iArr29 = new int[lIIlIllIII[3]];
                        iArr29[lIIlIllIII[4]] = lIIlIllIII[10];
                        Inventory.getFirst(iArr29).interact(lIIlIlIlII[lIIlIllIII[76]]);
                        Time.sleepTicks(lIIlIllIII[13]);
                        "".length();
                    }
                }
                if (llllllllllII(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[15])) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[77]];
                    Movement.walkTo(hg);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                }
                if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[13])) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[78]];
                    if (lllllllllIIl(ck, lIIlIllIII[3])) {
                        U.jO += lIIlIllIII[3];
                        U.o(AccBuilderRogues.m);
                        ck += lIIlIllIII[3];
                        U.jO = lIIlIllIII[4];
                        cl = lIIlIllIII[4];
                    }
                    C0006g.a(lIIlIlIlII[lIIlIllIII[79]], gz);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x025d, code lost:
        if (lIIIIIIIIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[22]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a0, code lost:
        if (lIIIIIIIIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[13]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e3, code lost:
        if (lllllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[33]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e6, code lost:
        af();
        java.lang.System.out.println(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIlIlII[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[104(0x68, float:1.46E-43)]]);
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.bt = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0301, code lost:
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
    private static void bw() {
        BankLocation nearest = BankLocation.getNearest();
        if (llllllllllll(nearest) && llllllllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[97]];
            C0000a.a(nearest);
        }
        if (llllllllllll(nearest) && lllllllllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llllllllllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[98]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIlIllIII[99]);
                "".length();
            }
            if (lllllllllIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[100]];
                if (lIIIIIIIIIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIlIllIII[12]);
                    "".length();
                }
                if (lIIIIIIIIIIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIlIllIII[1]);
                    "".length();
                }
                while (llllllllllII(v.aX() ? 1 : 0) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    v.aV();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if ((-"  ".length()) >= 0) {
                        return;
                    }
                }
                int[] iArr = new int[lIIlIllIII[3]];
                iArr[lIIlIllIII[4]] = lIIlIllIII[7];
                if (lllllllllIll(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIllIII[3]];
                    iArr2[lIIlIllIII[4]] = lIIlIllIII[7];
                    if (lllllllllIIl(Bank.getFirst(iArr2).getQuantity(), lIIlIllIII[101])) {
                        af();
                        System.out.println(lIIlIlIlII[lIIlIllIII[102]]);
                        bt = lIIlIllIII[3];
                        return;
                    }
                }
                int[] iArr3 = new int[lIIlIllIII[3]];
                iArr3[lIIlIllIII[4]] = lIIlIllIII[6];
                if (lllllllllIll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIlIllIII[3]];
                    iArr4[lIIlIllIII[4]] = lIIlIllIII[6];
                    if (lllllllllIIl(Bank.getFirst(iArr4).getQuantity(), lIIlIllIII[101])) {
                        af();
                        System.out.println(lIIlIlIlII[lIIlIllIII[16]]);
                        bt = lIIlIllIII[3];
                        return;
                    }
                }
                int[] iArr5 = new int[lIIlIllIII[3]];
                iArr5[lIIlIllIII[4]] = lIIlIllIII[5];
                if (lllllllllIll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIlIllIII[3]];
                    iArr6[lIIlIllIII[4]] = lIIlIllIII[5];
                    if (lllllllllIIl(Bank.getFirst(iArr6).getQuantity(), lIIlIllIII[101])) {
                        af();
                        System.out.println(lIIlIlIlII[lIIlIllIII[103]]);
                        bt = lIIlIllIII[3];
                        return;
                    }
                }
                int[] iArr7 = new int[lIIlIllIII[3]];
                iArr7[lIIlIllIII[4]] = lIIlIllIII[10];
                if (lllllllllIll(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lIIlIllIII[3]];
                    iArr8[lIIlIllIII[4]] = lIIlIllIII[10];
                }
                int[] iArr9 = new int[lIIlIllIII[3]];
                iArr9[lIIlIllIII[4]] = lIIlIllIII[9];
                if (lllllllllIll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlIllIII[3]];
                    iArr10[lIIlIllIII[4]] = lIIlIllIII[9];
                }
                int[] iArr11 = new int[lIIlIllIII[3]];
                iArr11[lIIlIllIII[4]] = lIIlIllIII[8];
                if (lllllllllIll(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIlIllIII[3]];
                    iArr12[lIIlIllIII[4]] = lIIlIllIII[8];
                }
                int[] iArr13 = new int[lIIlIllIII[18]];
                iArr13[lIIlIllIII[4]] = lIIlIllIII[105];
                iArr13[lIIlIllIII[3]] = lIIlIllIII[10];
                iArr13[lIIlIllIII[1]] = lIIlIllIII[9];
                iArr13[lIIlIllIII[12]] = lIIlIllIII[8];
                iArr13[lIIlIllIII[15]] = lIIlIllIII[7];
                iArr13[lIIlIllIII[13]] = lIIlIllIII[5];
                iArr13[lIIlIllIII[14]] = lIIlIllIII[6];
                if (llllllllllII(C0004e.b(iArr13) ? 1 : 0)) {
                    af();
                    System.out.println(lIIlIlIlII[lIIlIllIII[106]]);
                    bt = lIIlIllIII[3];
                    return;
                }
                if (llllllllllII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIIlIllIII[15]);
                    "".length();
                }
                int[] iArr14 = new int[lIIlIllIII[3]];
                iArr14[lIIlIllIII[4]] = lIIlIllIII[10];
                if (lllllllllIll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlIllIII[3]];
                    iArr15[lIIlIllIII[4]] = lIIlIllIII[10];
                    if (lllllllllIIl(Inventory.getCount(iArr15), lIIlIllIII[3])) {
                        Bank.withdraw(lIIlIllIII[10], lIIlIllIII[13], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIIlIllIII[3]];
                            iArr16[lIIlIllIII[4]] = lIIlIllIII[10];
                            if (lIIIIIIIIIIlI(Inventory.getCount(iArr16))) {
                                ?? r0 = lIIlIllIII[3];
                                "".length();
                                return (((85 ^ 48) ^ (91 ^ 120)) & (((155 ^ 134) ^ (156 ^ 199)) ^ (-" ".length()))) != 0 ? ((188 ^ 153) ^ (5 ^ 49)) & (((125 ^ 11) ^ (6 ^ 97)) ^ (-" ".length())) : r0;
                            }
                            return lIIlIllIII[4];
                        }, lIIlIllIII[99]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIIlIllIII[3]];
                iArr16[lIIlIllIII[4]] = lIIlIllIII[9];
                if (lllllllllIll(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIIlIllIII[3]];
                    iArr17[lIIlIllIII[4]] = lIIlIllIII[9];
                    if (lllllllllIIl(Inventory.getCount(iArr17), lIIlIllIII[3])) {
                        Bank.withdraw(lIIlIllIII[9], lIIlIllIII[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIIlIllIII[3]];
                            iArr18[lIIlIllIII[4]] = lIIlIllIII[9];
                            if (lIIIIIIIIIIlI(Inventory.getCount(iArr18))) {
                                ?? r0 = lIIlIllIII[3];
                                "".length();
                                return ((95 ^ 37) ^ (202 ^ 180)) < (((106 ^ 91) ^ "  ".length()) & (((((79 + 135) - 59) + 4) ^ (((141 + 38) - 166) + 159)) ^ (-" ".length()))) ? ((198 ^ 132) ^ (224 ^ 172)) & (((((63 + 25) - 44) + 98) ^ (((121 + 119) - 186) + 74)) ^ (-" ".length())) : r0;
                            }
                            return lIIlIllIII[4];
                        }, lIIlIllIII[99]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIIlIllIII[3]];
                iArr18[lIIlIllIII[4]] = lIIlIllIII[7];
                if (lllllllllIll(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIIlIllIII[3]];
                    iArr19[lIIlIllIII[4]] = lIIlIllIII[7];
                    if (lllllllllIIl(Inventory.getCount(iArr19), lIIlIllIII[3])) {
                        Bank.withdraw(lIIlIllIII[7], lIIlIllIII[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIIlIllIII[3]];
                            iArr20[lIIlIllIII[4]] = lIIlIllIII[7];
                            if (lIIIIIIIIIIlI(Inventory.getCount(iArr20))) {
                                ?? r0 = lIIlIllIII[3];
                                "".length();
                                return (((129 ^ 197) ^ (7 ^ 101)) & (((236 ^ 193) ^ (39 ^ 44)) ^ (-" ".length()))) < (-" ".length()) ? ((((138 + 76) - 166) + 119) ^ (((76 + 12) - (-24)) + 78)) & (((114 ^ 119) ^ (69 ^ 89)) ^ (-" ".length())) : r0;
                            }
                            return lIIlIllIII[4];
                        }, lIIlIllIII[99]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIlIllIII[3]];
                iArr20[lIIlIllIII[4]] = lIIlIllIII[5];
                if (lllllllllIll(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIIlIllIII[3]];
                    iArr21[lIIlIllIII[4]] = lIIlIllIII[5];
                    if (lllllllllIIl(Inventory.getCount(iArr21), lIIlIllIII[3])) {
                        Bank.withdraw(lIIlIllIII[5], lIIlIllIII[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIIlIllIII[3]];
                            iArr22[lIIlIllIII[4]] = lIIlIllIII[5];
                            if (lIIIIIIIIIIlI(Inventory.getCount(iArr22))) {
                                ?? r0 = lIIlIllIII[3];
                                "".length();
                                return (-"  ".length()) > 0 ? ((23 ^ 53) ^ (105 ^ 8)) & (((((79 + 65) - 117) + 178) ^ (((50 + 141) - 117) + 68)) ^ (-" ".length())) : r0;
                            }
                            return lIIlIllIII[4];
                        }, lIIlIllIII[99]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIIlIllIII[3]];
                iArr22[lIIlIllIII[4]] = lIIlIllIII[6];
                if (lllllllllIll(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIIlIllIII[3]];
                    iArr23[lIIlIllIII[4]] = lIIlIllIII[6];
                    if (lllllllllIIl(Inventory.getCount(iArr23), lIIlIllIII[3])) {
                        Bank.withdraw(lIIlIllIII[6], lIIlIllIII[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIIlIllIII[3]];
                            iArr24[lIIlIllIII[4]] = lIIlIllIII[6];
                            if (lIIIIIIIIIIlI(Inventory.getCount(iArr24))) {
                                ?? r0 = lIIlIllIII[3];
                                "".length();
                                return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIllIII[4];
                        }, lIIlIllIII[99]);
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIlIllIII[3]];
                iArr24[lIIlIllIII[4]] = lIIlIllIII[108];
                if (lllllllllIll(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIIlIllIII[3]];
                    iArr25[lIIlIllIII[4]] = lIIlIllIII[108];
                    if (llllllllllII(Inventory.contains(iArr25) ? 1 : 0)) {
                        Bank.withdraw(lIIlIllIII[108], lIIlIllIII[3], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr26 = new int[lIIlIllIII[3]];
                            iArr26[lIIlIllIII[4]] = lIIlIllIII[108];
                            return Inventory.contains(iArr26);
                        }, lIIlIllIII[99]);
                        "".length();
                    }
                }
                int[] iArr26 = new int[lIIlIllIII[3]];
                iArr26[lIIlIllIII[4]] = lIIlIllIII[8];
                if (lllllllllIll(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[lIIlIllIII[3]];
                    iArr27[lIIlIllIII[4]] = lIIlIllIII[8];
                    if (lllllllllIIl(Inventory.getCount(iArr27), lIIlIllIII[3])) {
                        Bank.withdrawAll(lIIlIllIII[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIlIllIII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr28 = new int[lIIlIllIII[3]];
                            iArr28[lIIlIllIII[4]] = lIIlIllIII[8];
                            if (lIIIIIIIIIIlI(Inventory.getCount(iArr28))) {
                                ?? r0 = lIIlIllIII[3];
                                "".length();
                                return "  ".length() >= ((((116 + 136) - 169) + 87) ^ (((49 + 1) - 36) + 160)) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                            }
                            return lIIlIllIII[4];
                        }, lIIlIllIII[99]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void bv() {
        if (lllllllllIll(Inventory.contains(C0005f.aV) ? 1 : 0) && lllllllllIIl(Movement.getRunEnergy(), lIIlIllIII[68])) {
            Inventory.getFirst(C0005f.aV).interact(lIIlIlIlII[lIIlIllIII[80]]);
            Time.sleepTicks(lIIlIllIII[3]);
            "".length();
        }
        if (llllllllllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[1])) {
            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[81]];
            Movement.walkTo(new WorldPoint(lIIlIllIII[58], lIIlIllIII[59], lIIlIllIII[4]));
            "".length();
            Time.sleepTicks(lIIlIllIII[3]);
            "".length();
        }
        int[] iArr = new int[lIIlIllIII[3]];
        iArr[lIIlIllIII[4]] = lIIlIllIII[82];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[lIIlIllIII[3]];
        iArr2[lIIlIllIII[4]] = lIIlIllIII[60];
        if (llllllllllII(Inventory.contains(iArr2) ? 1 : 0)) {
            if (lllllllllIll(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllllllllll(nearest) && lllllllllIll(gQ.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIIlIllIII[24]);
                "".length();
                while (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gH), lIIlIllIII[3]) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[83]];
                    Movement.walkTo(gH);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return;
                    }
                }
            }
            if (lllllllllIll(gL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllllllllll(nearest) && lllllllllIll(gN.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gI), lIIlIllIII[3]) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[84]];
                    Movement.walkTo(gI);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
            }
            if (lllllllllIll(gM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllllllllll(nearest) && lllllllllIll(gR.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIIlIllIII[18]);
                "".length();
                while (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIlIllIII[3]) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[85]];
                    Movement.walkTo(gJ);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return;
                    }
                }
            }
            if (lllllllllIll(gP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllllllllll(nearest) && lllllllllIll(gR.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[1]) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[86]];
                    Movement.walkTo(hu);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if (((32 ^ 104) & ((100 ^ 44) ^ (-1))) < (-" ".length())) {
                        return;
                    }
                }
            }
            if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[12])) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[87]];
                String[] strArr = new String[lIIlIllIII[3]];
                strArr[lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[88]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (llllllllllll(nearest2)) {
                    nearest2.interact(lIIlIlIlII[lIIlIllIII[89]]);
                    Time.sleepTicks(lIIlIllIII[1]);
                    "".length();
                    Widget widget = Widgets.get(lIIlIllIII[23], lIIlIllIII[3]);
                    if (llllllllllll(widget)) {
                        widget.interact(lIIlIlIlII[lIIlIllIII[90]]);
                        widget.interact(lIIlIllIII[4]);
                        widget.interact(lIIlIlIlII[lIIlIllIII[91]]);
                        Keyboard.type(lIIlIlIlII[lIIlIllIII[92]]);
                    }
                }
            }
        }
        int[] iArr3 = new int[lIIlIllIII[3]];
        iArr3[lIIlIllIII[4]] = lIIlIllIII[60];
        if (lllllllllIll(Inventory.contains(iArr3) ? 1 : 0)) {
            if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[12])) {
                while (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4])), lIIlIllIII[3]) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[95]];
                    Movement.walkTo(new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4]));
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
            }
            if (lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4])), lIIlIllIII[1]) && llllllllllll(nearest) && lllllllllIll(gQ.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gI), lIIlIllIII[3]) && llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[96]];
                    Movement.walkTo(gI);
                    "".length();
                    Time.sleepTicks(lIIlIllIII[3]);
                    "".length();
                    "".length();
                    if ((-((((89 + 38) - 57) + 57) ^ (75 ^ 48))) >= 0) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean lllllllllllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllllllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIIIIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIIIIIIIIl(C0004e.j(lIIlIllIII[2]), lIIlIllIII[18])) {
            ?? r0 = lIIlIllIII[3];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIllIII[4];
    }

    private static boolean lIIIIIIIIIIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIllIII[4];
    }

    private static boolean llllllllllIl(int i, int i2) {
        return i > i2;
    }

    private static void lllllllIlIlI() {
        lIIlIlIlII = new String[lIIlIllIII[174]];
        lIIlIlIlII[lIIlIllIII[4]] = llllllIlllIl("BRoqIBYgTzo9HSoc", "GoSIx");
        lIIlIlIlII[lIIlIllIII[3]] = llllllIllllI("b0LZJ1B+jVYNcBO2j2Uv3s2KePcmRbtI0HrMdwfHoGk0jKBIGaaJ4nzS2WJKcOdMuk1fs3FvL2A=", "yXfDc");
        lIIlIlIlII[lIIlIllIII[1]] = llllllIllllI("aYQDPsIX48F0/GkiLpWYOg==", "MoXeG");
        lIIlIlIlII[lIIlIllIII[12]] = llllllIlllIl("Nwc2BzE=", "uuSfZ");
        lIIlIlIlII[lIIlIllIII[15]] = llllllIlllIl("LxgseD0OWSksKBMN", "ayZXI");
        lIIlIlIlII[lIIlIllIII[13]] = llllllIlllll("u5Eth1v+e90=", "XEOWN");
        lIIlIlIlII[lIIlIllIII[14]] = llllllIlllIl("FiYO", "TIwVU");
        lIIlIlIlII[lIIlIllIII[18]] = llllllIllllI("4NbdZICskkx2cLSV0puRNaw1ZMy6Zk6GCkPhXxzLFvI=", "skgaR");
        lIIlIlIlII[lIIlIllIII[20]] = llllllIllllI("9+Ipj5LYi28=", "llTJx");
        lIIlIlIlII[lIIlIllIII[21]] = llllllIllllI("07ywrbAgBBdHPwN6YThZhg==", "WAwyf");
        lIIlIlIlII[lIIlIllIII[22]] = llllllIllllI("MjlQdZjTwqUJzd2YTyHHqA==", "ATbxC");
        lIIlIlIlII[lIIlIllIII[24]] = llllllIlllIl("JDo+EgYJIDU=", "gUPfo");
        lIIlIlIlII[lIIlIllIII[25]] = llllllIlllll("7ZdG1KWo2pY=", "bIbNX");
        lIIlIlIlII[lIIlIllIII[26]] = llllllIllllI("rw59Ajbz4C0=", "ohRXg");
        lIIlIlIlII[lIIlIllIII[27]] = llllllIlllll("bS9CPivwETi1fex5Yb0JvZ2I+FxYTIlZ", "SPFtj");
        lIIlIlIlII[lIIlIllIII[28]] = llllllIlllll("aw/0vvWpxNVZkLxiqb8+Gq3QmnqVZf+I", "VBROv");
        lIIlIlIlII[lIIlIllIII[29]] = llllllIllllI("Agh6Fk9LUbKzxK2AQUqZsA==", "oqewy");
        lIIlIlIlII[lIIlIllIII[30]] = llllllIlllll("nNmIHkLum/KUMgwlu+3nuQ==", "ERInm");
        lIIlIlIlII[lIIlIllIII[31]] = llllllIllllI("YYP/4bfzUZ4=", "YObEy");
        lIIlIlIlII[lIIlIllIII[32]] = llllllIllllI("GRrvsrJ5o8E=", "cSQNc");
        lIIlIlIlII[lIIlIllIII[33]] = llllllIlllIl("CxUjHg==", "DeFpx");
        lIIlIlIlII[lIIlIllIII[34]] = llllllIllllI("OxrhG6gCBDY=", "Hejze");
        lIIlIlIlII[lIIlIllIII[35]] = llllllIlllll("MY4LAc30fkQ=", "KYFPi");
        lIIlIlIlII[lIIlIllIII[36]] = llllllIlllll("Jl2qKplggj8L5FEw6DgKyA==", "pnGlB");
        lIIlIlIlII[lIIlIllIII[37]] = llllllIlllll("+i8vfy7I7yg=", "CbjmH");
        lIIlIlIlII[lIIlIllIII[38]] = llllllIlllll("eVPZndDQhvI=", "YHKNO");
        lIIlIlIlII[lIIlIllIII[40]] = llllllIlllll("kNR4qGgDd5bh9W+Rzyc3r3oq0gCP+JIC", "vfBqK");
        lIIlIlIlII[lIIlIllIII[41]] = llllllIlllll("u4qv2aMItxWCc5I98c0ivA==", "KFRSm");
        lIIlIlIlII[lIIlIllIII[42]] = llllllIlllIl("HQ88LSMuTjolKicLIw==", "InWDM");
        lIIlIlIlII[lIIlIllIII[43]] = llllllIlllll("V2euDVPN4lE=", "NYtni");
        lIIlIlIlII[lIIlIllIII[44]] = llllllIlllll("KgsYhc44F6Y=", "sbVqS");
        lIIlIlIlII[lIIlIllIII[45]] = llllllIllllI("85fdTkRYJEs=", "hNmnF");
        lIIlIlIlII[lIIlIllIII[46]] = llllllIlllIl("HiMkPS0l", "MFEON");
        lIIlIlIlII[lIIlIllIII[47]] = llllllIllllI("ocaQ81q6+aI91afsB1UoDw==", "TxNGv");
        lIIlIlIlII[lIIlIllIII[48]] = llllllIlllll("Qs8dUB6Bt4g=", "RBcKP");
        lIIlIlIlII[lIIlIllIII[49]] = llllllIlllll("ftmjSRQZc/I=", "KhPSj");
        lIIlIlIlII[lIIlIllIII[50]] = llllllIlllll("EgF1rioKxlVU7YmFNIn1CKZLf+y7dx7u", "GdLJV");
        lIIlIlIlII[lIIlIllIII[51]] = llllllIlllll("9qZEPK6k2zMLCQWICQW0Zw==", "WHoly");
        lIIlIlIlII[lIIlIllIII[52]] = llllllIlllll("ho4ZO5934tk=", "EqVzF");
        lIIlIlIlII[lIIlIllIII[53]] = llllllIlllll("qgTPRh03VzTXBD4GFV1XsQ==", "mEtan");
        lIIlIlIlII[lIIlIllIII[54]] = llllllIlllll("S5JmC3BYwBM=", "BxqeA");
        lIIlIlIlII[lIIlIllIII[55]] = llllllIllllI("zxdaxfwz8pE=", "UvClq");
        lIIlIlIlII[lIIlIllIII[56]] = llllllIlllIl("DDEoLSMhcCsmOjc1", "DPFIO");
        lIIlIlIlII[lIIlIllIII[57]] = llllllIlllIl("FwY4AQE7BitEHjMSKQ==", "RhLds");
        lIIlIlIlII[lIIlIllIII[61]] = llllllIlllll("r7dst4PNUhQx3UryyU1PrTUVKgAmWhtN", "WnOFO");
        lIIlIlIlII[lIIlIllIII[63]] = llllllIllllI("dCXWqIZvvJ4=", "kXQcZ");
        lIIlIlIlII[lIIlIllIII[64]] = llllllIllllI("bQxK+RXJKKd0l5QZPJHQEg==", "XqbOU");
        lIIlIlIlII[lIIlIllIII[65]] = llllllIllllI("f1xbJweBJmuXBacWgucAi4Ee7B3R92FC", "hvsAy");
        lIIlIlIlII[lIIlIllIII[66]] = llllllIlllIl("MTc8", "tVHvQ");
        lIIlIlIlII[lIIlIllIII[67]] = llllllIlllll("rQZGjzZdNR6Ch1OjrvBPxA==", "mPHlO");
        lIIlIlIlII[lIIlIllIII[68]] = llllllIlllll("Gd9TP4Ob9E+wUpj+vpQqJA==", "uTvzh");
        lIIlIlIlII[lIIlIllIII[69]] = llllllIlllll("C1+gtVDVXCAztd17JZZSUw==", "TOopy");
        lIIlIlIlII[lIIlIllIII[70]] = llllllIllllI("qT4KgCM4Jes=", "HOCoE");
        lIIlIlIlII[lIIlIllIII[71]] = llllllIlllll("b8Msvg8SCWY=", "sdykv");
        lIIlIlIlII[lIIlIllIII[72]] = llllllIllllI("EA739E6zgCAvqozTVUgYxg==", "EbFym");
        lIIlIlIlII[lIIlIllIII[73]] = llllllIlllIl("AhcnNw==", "VvLRa");
        lIIlIlIlII[lIIlIllIII[74]] = llllllIllllI("UrHWqgjVv14=", "SryrG");
        lIIlIlIlII[lIIlIllIII[75]] = llllllIllllI("6M9+5pCXnFHGtR5OZz9mXQ==", "hDsrD");
        lIIlIlIlII[lIIlIllIII[76]] = llllllIlllIl("CAcTJB0=", "JuvEv");
        lIIlIlIlII[lIIlIllIII[77]] = llllllIllllI("oLgyA4KWP0qxpShuYz6ohKTvuF8dQGSs", "dyOzx");
        lIIlIlIlII[lIIlIllIII[78]] = llllllIllllI("505eaRkR3xcLrptaLhkGaEGJkCEsCVJX", "RAihU");
        lIIlIlIlII[lIIlIllIII[79]] = llllllIlllIl("LQEh", "onXTU");
        lIIlIlIlII[lIIlIllIII[80]] = llllllIlllIl("LCoGCwE=", "hXoej");
        lIIlIlIlII[lIIlIllIII[81]] = llllllIlllIl("FQsdKjM5Cw5vLDEfDA==", "PeiOA");
        lIIlIlIlII[lIIlIllIII[83]] = llllllIlllll("zFtc+r2aSOaZeZecSEEwZ4/q3l7cA+KC", "toZze");
        lIIlIlIlII[lIIlIllIII[84]] = llllllIllllI("vOao/M0d+JLMcLegWU+fwYzRUnnttbio", "EwvYT");
        lIIlIlIlII[lIIlIllIII[85]] = llllllIllllI("rWaShuyjvKXtics6UHzZkcJxkhGAqk0p", "zntLX");
        lIIlIlIlII[lIIlIllIII[86]] = llllllIllllI("0g8oVex+ooaGkeFg1l/GRg==", "nviTs");
        lIIlIlIlII[lIIlIllIII[87]] = llllllIllllI("SFtkySv9BS0xhEDYg6AGLA==", "Schye");
        lIIlIlIlII[lIIlIllIII[88]] = llllllIlllIl("PCMHCC0bJRw=", "zLrfY");
        lIIlIlIlII[lIIlIllIII[89]] = llllllIllllI("6C3EuNnLbOQ=", "NShJm");
        lIIlIlIlII[lIIlIllIII[90]] = llllllIlllIl("LyckBiwCPS8=", "lHJrE");
        lIIlIlIlII[lIIlIllIII[91]] = llllllIlllll("nQK1BL3KxzM=", "ogleM");
        lIIlIlIlII[lIIlIllIII[92]] = llllllIllllI("7KOL5jcGsu8=", "BCiFW");
        lIIlIlIlII[lIIlIllIII[95]] = llllllIllllI("EKlSJJ7GCdWbeob96Eywb9vgqPheY+Mh", "CJdnI");
        lIIlIlIlII[lIIlIllIII[96]] = llllllIllllI("kOO5YwOBzPGLqjoUtH5l/6xkbDmBDxCA", "uZSnn");
        lIIlIlIlII[lIIlIllIII[97]] = llllllIlllll("4jUFm7d3bkLqxYx5PdzhnWs9ETZAtYKq", "UThvr");
        lIIlIlIlII[lIIlIllIII[98]] = llllllIlllIl("BiARJB4nN1QoFic7", "IPtJw");
        lIIlIlIlII[lIIlIllIII[100]] = llllllIllllI("9lsybgD8PcRXSzbnx6y2Wit8J8bdPqK8", "DYKys");
        lIIlIlIlII[lIIlIllIII[102]] = llllllIllllI("dqaRjIR3VeKk6Rglj0TKlL52Iuuv2APsuRo/WgedTt0JQzdbqkzd67WJmF9ISn8i", "YFpfu");
        lIIlIlIlII[lIIlIllIII[16]] = llllllIlllIl("EyJWAichZxsKJjcuGAR1NzIGEzktIgVPdTcwHxc2LC4YBHUwKFYhAB0OOCQ=", "DGvcU");
        lIIlIlIlII[lIIlIllIII[103]] = llllllIllllI("cmWD7qPU6vaGZfgzXKdvgFu71GOj8aSzQHF0fXClAye9Gf8NQ1SCqZbxL6vkmHWZ", "yCEkL");
        lIIlIlIlII[lIIlIllIII[104]] = llllllIllllI("sx5SqN2nEV9ZDZ922/fzZkVjANJpMcqHtXb3o1v7kVcHL87/Wcjl37jQIs/iDS7w", "HrjWQ");
        lIIlIlIlII[lIIlIllIII[106]] = llllllIlllll("0eDMmBGNCsk58avTyWbhvaBX4E3h4oxnt5mhJy8Nl29rF3piuYpHG/TQT6LhbZE7", "yKWOV");
        lIIlIlIlII[lIIlIllIII[116]] = llllllIlllll("6olv4xfmT3BQjbQ59cG0DcCcStHpF/Cp", "eEQtT");
        lIIlIlIlII[lIIlIllIII[117]] = llllllIlllll("e4vWByr+WynQgWafZTfcWPAGAYIbfWY9", "nCcaz");
        lIIlIlIlII[lIIlIllIII[163]] = llllllIllllI("oBreNuZwJNAeeGo58yH6Bw==", "yWkDo");
        lIIlIlIlII[lIIlIllIII[164]] = llllllIllllI("FKOfzg5pp0U6dzE+FBvgDG9rhv6Hc/8e", "DPIbA");
        lIIlIlIlII[lIIlIllIII[165]] = llllllIlllIl("CH08H2g1KCld", "AZPsH");
        lIIlIlIlII[lIIlIllIII[166]] = llllllIlllll("4DTQeW4WfbIgKPg6WYj5t44lqaoQH/Y7z8/481z86/ZueVLaGh2JtKTA3AV/sdRg", "FIkiA");
        lIIlIlIlII[lIIlIllIII[167]] = llllllIlllll("Igj+sNpwBnA=", "FDFRP");
        lIIlIlIlII[lIIlIllIII[168]] = llllllIllllI("OedENlq3JOPGdyF+zby5l5z3qDLgPa88", "RrAli");
        lIIlIlIlII[lIIlIllIII[169]] = llllllIlllll("55ADgdc5+HNfGBTNayNZxJt/xmVZWRy2OdWTG7678u8=", "ScwDN");
    }

    private static String llllllIlllll(String llllllllllllllllllllllIllIllIlll, String llllllllllllllllllllllIllIllIllI) {
        try {
            SecretKeySpec llllllllllllllllllllllIllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllIII[1], llllllllllllllllllllllIllIlllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIllIlllIII) {
            llllllllllllllllllllllIllIlllIII.printStackTrace();
            return null;
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        bu();
        return lIIlIllIII[109];
    }

    private static boolean lllllllllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lllllllllIll(int i) {
        return i != 0;
    }

    private static String llllllIllllI(String llllllllllllllllllllllIllIlIlIlI, String llllllllllllllllllllllIllIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIIlIllIII[20]), "DES");
            Cipher llllllllllllllllllllllIllIlIllII = Cipher.getInstance("DES");
            llllllllllllllllllllllIllIlIllII.init(lIIlIllIII[1], secretKeySpec);
            return new String(llllllllllllllllllllllIllIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIllIlIlIll) {
            llllllllllllllllllllllIllIlIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
        if (lllllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[13]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0217, code lost:
        if (lllllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.A.lIIlIllIII[22]) != false) goto L49;
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
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lIIlIllIII[3]];
        iArr7[lIIlIllIII[4]] = lIIlIllIII[8];
        if (llllllllllII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIII[8], lIIlIllIII[109], lIIlIllIII[110]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIllIII[3]];
        iArr8[lIIlIllIII[4]] = lIIlIllIII[8];
        if (lllllllllIll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIlIllIII[3]];
            iArr9[lIIlIllIII[4]] = lIIlIllIII[8];
            if (lllllllllIIl(Bank.getFirst(iArr9).getQuantity(), lIIlIllIII[33])) {
                bv.add(new C0003d(lIIlIllIII[8], lIIlIllIII[54], lIIlIllIII[110]));
                "".length();
            }
        }
        int[] iArr10 = new int[lIIlIllIII[3]];
        iArr10[lIIlIllIII[4]] = lIIlIllIII[9];
        if (lllllllllIll(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIIlIllIII[3]];
            iArr11[lIIlIllIII[4]] = lIIlIllIII[9];
            if (lllllllllIll(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlIllIII[3]];
                iArr12[lIIlIllIII[4]] = lIIlIllIII[9];
            }
            if (llllllllllII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIlIlIlII[lIIlIllIII[117]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIllIII[112], lIIlIllIII[31], lIIlIllIII[113]));
                "".length();
            }
            iArr = new int[lIIlIllIII[3]];
            iArr[lIIlIllIII[4]] = lIIlIllIII[105];
            if (llllllllllII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIllIII[105], lIIlIllIII[54], lIIlIllIII[114]));
                "".length();
            }
            iArr2 = new int[lIIlIllIII[3]];
            iArr2[lIIlIllIII[4]] = lIIlIllIII[10];
            if (lllllllllIll(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[lIIlIllIII[3]];
                iArr13[lIIlIllIII[4]] = lIIlIllIII[10];
                if (lllllllllIll(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lIIlIllIII[3]];
                    iArr14[lIIlIllIII[4]] = lIIlIllIII[10];
                }
                iArr3 = new int[lIIlIllIII[3]];
                iArr3[lIIlIllIII[4]] = lIIlIllIII[108];
                if (llllllllllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIllIII[108], lIIlIllIII[13], C0008i.bq));
                    "".length();
                }
                iArr4 = new int[lIIlIllIII[3]];
                iArr4[lIIlIllIII[4]] = lIIlIllIII[7];
                if (lllllllllIll(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlIllIII[3]];
                    iArr15[lIIlIllIII[4]] = lIIlIllIII[7];
                    if (lllllllllIIl(Bank.getFirst(iArr15).getQuantity(), lIIlIllIII[101])) {
                        bv.add(new C0003d(lIIlIllIII[7], lIIlIllIII[115], lIIlIllIII[18]));
                        "".length();
                    }
                }
                iArr5 = new int[lIIlIllIII[3]];
                iArr5[lIIlIllIII[4]] = lIIlIllIII[5];
                if (lllllllllIll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIlIllIII[3]];
                    iArr16[lIIlIllIII[4]] = lIIlIllIII[5];
                    if (lllllllllIIl(Bank.getFirst(iArr16).getQuantity(), lIIlIllIII[101])) {
                        bv.add(new C0003d(lIIlIllIII[5], lIIlIllIII[115], lIIlIllIII[18]));
                        "".length();
                    }
                }
                iArr6 = new int[lIIlIllIII[3]];
                iArr6[lIIlIllIII[4]] = lIIlIllIII[6];
                if (lllllllllIll(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lIIlIllIII[3]];
                    iArr17[lIIlIllIII[4]] = lIIlIllIII[6];
                    if (lllllllllIIl(Bank.getFirst(iArr17).getQuantity(), lIIlIllIII[101])) {
                        bv.add(new C0003d(lIIlIllIII[6], lIIlIllIII[115], lIIlIllIII[18]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIIlIllIII[10], lIIlIllIII[33], lIIlIllIII[114]));
            "".length();
            iArr3 = new int[lIIlIllIII[3]];
            iArr3[lIIlIllIII[4]] = lIIlIllIII[108];
            if (llllllllllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIIlIllIII[3]];
            iArr4[lIIlIllIII[4]] = lIIlIllIII[7];
            if (lllllllllIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIlIllIII[3]];
            iArr5[lIIlIllIII[4]] = lIIlIllIII[5];
            if (lllllllllIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIlIllIII[3]];
            iArr6[lIIlIllIII[4]] = lIIlIllIII[6];
            if (lllllllllIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(lIIlIllIII[9], lIIlIllIII[13], lIIlIllIII[111]));
        "".length();
        if (llllllllllII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIlIlIlII[lIIlIllIII[117]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIlIllIII[3]];
        iArr[lIIlIllIII[4]] = lIIlIllIII[105];
        if (llllllllllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIlIllIII[3]];
        iArr2[lIIlIllIII[4]] = lIIlIllIII[10];
        if (lllllllllIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIllIII[10], lIIlIllIII[33], lIIlIllIII[114]));
        "".length();
        iArr3 = new int[lIIlIllIII[3]];
        iArr3[lIIlIllIII[4]] = lIIlIllIII[108];
        if (llllllllllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIlIllIII[3]];
        iArr4[lIIlIllIII[4]] = lIIlIllIII[7];
        if (lllllllllIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlIllIII[3]];
        iArr5[lIIlIllIII[4]] = lIIlIllIII[5];
        if (lllllllllIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIlIllIII[3]];
        iArr6[lIIlIllIII[4]] = lIIlIllIII[6];
        if (lllllllllIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }
}
