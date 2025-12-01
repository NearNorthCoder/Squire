package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.v  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/v.class */
public class C0021v implements K {
    private static /* synthetic */ WorldPoint dy;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ int[] lIlllIlIIl;
    private static /* synthetic */ String[] lIlllIIlll;

    /* renamed from: do  reason: not valid java name */
    public static /* synthetic */ boolean f1do;
    public static /* synthetic */ boolean dq;
    private static /* synthetic */ WorldPoint dw;
    public static /* synthetic */ boolean dp;
    static /* synthetic */ int dc;
    private static /* synthetic */ WorldPoint dt;
    private static /* synthetic */ WorldPoint dv;
    private static /* synthetic */ WorldPoint ds;
    private static /* synthetic */ WorldPoint dx;
    public static /* synthetic */ boolean dm;
    static /* synthetic */ int dr;
    private static /* synthetic */ WorldPoint du;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean dn;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlllIlIIl[1];
    }

    private static void lIIlllIllIIIl() {
        lIlllIlIIl = new int[126];
        lIlllIlIIl[0] = " ".length();
        lIlllIlIIl[1] = ((113 ^ 110) ^ (80 ^ 113)) & (((((154 + 182) - 164) + 17) ^ (((75 + 70) - 35) + 21)) ^ (-" ".length()));
        lIlllIlIIl[2] = (228 ^ 196) ^ (169 ^ 129);
        lIlllIlIIl[3] = (-((-25097) & 26527)) & (-8265) & 32766;
        lIlllIlIIl[4] = (-((-23243) & 32491)) & (-16387) & 30634;
        lIlllIlIIl[5] = "  ".length();
        lIlllIlIIl[6] = (((95 + 91) - 171) + 141) ^ (((67 + 95) - 104) + 94);
        lIlllIlIIl[7] = (-8353) & 16359;
        lIlllIlIIl[8] = (-133) & 8141;
        lIlllIlIIl[9] = (-8902) & 9215;
        lIlllIlIIl[10] = "   ".length();
        lIlllIlIIl[11] = (-20015) & 32639;
        lIlllIlIIl[12] = 51 ^ 57;
        lIlllIlIIl[13] = (177 ^ 153) ^ (150 ^ 187);
        lIlllIlIIl[14] = (-((-21603) & 30311)) & (-16385) & 25471;
        lIlllIlIIl[15] = 117 ^ 121;
        lIlllIlIIl[16] = (46 ^ 78) ^ (224 ^ 193);
        lIlllIlIIl[17] = (((7 + 88) - 51) + 149) ^ (((99 + 152) - 131) + 79);
        lIlllIlIIl[18] = (17 ^ 23) ^ " ".length();
        lIlllIlIIl[19] = (-((-2482) & 11187)) & (-9) & 14333;
        lIlllIlIIl[20] = (-((-12293) & 12815)) & (-24577) & 30719;
        lIlllIlIIl[21] = (-((-2070) & 2591)) & (-2049) & 8191;
        lIlllIlIIl[22] = (-27137) & 32759;
        lIlllIlIIl[23] = (-8712) & 14335;
        lIlllIlIIl[24] = (((64 + 151) - 52) + 8) ^ (((40 + 53) - 33) + 102);
        lIlllIlIIl[25] = (65 ^ 112) ^ (98 ^ 88);
        lIlllIlIIl[26] = 64 ^ 77;
        lIlllIlIIl[27] = (((106 + 16) - 101) + 112) ^ (((131 + 20) - 138) + 126);
        lIlllIlIIl[28] = 80 ^ 95;
        lIlllIlIIl[29] = ((187 ^ 173) & ((173 ^ 187) ^ (-1))) ^ (22 ^ 6);
        lIlllIlIIl[30] = (231 ^ 169) ^ (49 ^ 110);
        lIlllIlIIl[31] = (47 ^ 18) ^ (73 ^ 102);
        lIlllIlIIl[32] = (((43 + 112) - 125) + 124) ^ (((130 + 99) - 182) + 90);
        lIlllIlIIl[33] = (184 ^ 178) ^ (180 ^ 170);
        lIlllIlIIl[34] = 96 ^ 117;
        lIlllIlIIl[35] = (113 ^ 46) ^ (104 ^ 33);
        lIlllIlIIl[36] = (((20 + 30) - (-96)) + 26) ^ (((97 + 9) - 54) + 135);
        lIlllIlIIl[37] = 121 ^ 97;
        lIlllIlIIl[38] = 57 ^ 32;
        lIlllIlIIl[39] = 188 ^ 166;
        lIlllIlIIl[40] = (((31 + 25) - (-57)) + 29) ^ (((142 + 89) - 144) + 62);
        lIlllIlIIl[41] = 49 ^ 45;
        lIlllIlIIl[42] = 19 ^ 14;
        lIlllIlIIl[43] = (((132 + 68) - 158) + 111) ^ (((29 + 92) - 23) + 37);
        lIlllIlIIl[44] = (84 ^ 9) ^ (225 ^ 163);
        lIlllIlIIl[45] = 155 ^ 187;
        lIlllIlIIl[46] = (((110 + 109) - 178) + 91) ^ (((125 + 19) - 28) + 49);
        lIlllIlIIl[47] = 125 ^ 95;
        lIlllIlIIl[48] = 131 ^ 160;
        lIlllIlIIl[49] = 230 ^ 194;
        lIlllIlIIl[50] = 97 ^ 68;
        lIlllIlIIl[51] = 17 ^ 55;
        lIlllIlIIl[52] = (41 ^ 34) ^ (19 ^ 63);
        lIlllIlIIl[53] = (29 ^ 23) ^ (110 ^ 76);
        lIlllIlIIl[54] = 28 ^ 53;
        lIlllIlIIl[55] = 233 ^ 195;
        lIlllIlIIl[56] = (11 ^ 41) ^ (38 ^ 47);
        lIlllIlIIl[57] = (45 ^ 87) ^ (218 ^ 140);
        lIlllIlIIl[58] = 237 ^ 192;
        lIlllIlIIl[59] = ((172 + 69) - 171) + 170;
        lIlllIlIIl[60] = 23 ^ 57;
        lIlllIlIIl[61] = 168 ^ 135;
        lIlllIlIIl[62] = (88 ^ 72) ^ (167 ^ 135);
        lIlllIlIIl[63] = (((67 + 64) - 43) + 55) ^ (((24 + 19) - (-27)) + 120);
        lIlllIlIIl[64] = 156 ^ 174;
        lIlllIlIIl[65] = (62 ^ 0) ^ (86 ^ 91);
        lIlllIlIIl[66] = (239 ^ 128) ^ (58 ^ 97);
        lIlllIlIIl[67] = 74 ^ 127;
        lIlllIlIIl[68] = (195 ^ 133) ^ (33 ^ 81);
        lIlllIlIIl[69] = (((213 + 179) - 261) + 110) ^ (((129 + 128) - 232) + 173);
        lIlllIlIIl[70] = 191 ^ 135;
        lIlllIlIIl[71] = (((75 + 127) - 70) + 3) ^ (((29 + 167) - 71) + 65);
        lIlllIlIIl[72] = (((3 + 78) - 55) + 134) ^ (((125 + 120) - 212) + 121);
        lIlllIlIIl[73] = (110 ^ 88) ^ (162 ^ 175);
        lIlllIlIIl[74] = (-((-1302) & 7479)) & (-9233) & 16309;
        lIlllIlIIl[75] = (-((-25023) & 29119)) & (-16643) & 32718;
        lIlllIlIIl[76] = (-((-16649) & 23822)) & (-595) & 32767;
        lIlllIlIIl[77] = (((229 + 198) - 282) + 86) ^ (((42 + 99) - 25) + 15);
        lIlllIlIIl[78] = 154 ^ 166;
        lIlllIlIIl[79] = 175 ^ 146;
        lIlllIlIIl[80] = 40 ^ 22;
        lIlllIlIIl[81] = (196 ^ 134) ^ (75 ^ 54);
        lIlllIlIIl[82] = 244 ^ 180;
        lIlllIlIIl[83] = (179 ^ 185) ^ (95 ^ 23);
        lIlllIlIIl[84] = 86 ^ 21;
        lIlllIlIIl[85] = 253 ^ 185;
        lIlllIlIIl[86] = 1 ^ 68;
        lIlllIlIIl[87] = 110 ^ 40;
        lIlllIlIIl[88] = (99 ^ 48) ^ (93 ^ 73);
        lIlllIlIIl[89] = (200 ^ 154) ^ (183 ^ 173);
        lIlllIlIIl[90] = 219 ^ 146;
        lIlllIlIIl[91] = (-14541) & 16365;
        lIlllIlIIl[92] = (-8454) & 12143;
        lIlllIlIIl[93] = (-((-1217) & 9425)) & (-22625) & 32639;
        lIlllIlIIl[94] = (-24593) & 28318;
        lIlllIlIIl[95] = (-12553) & 14271;
        lIlllIlIIl[96] = (-28963) & 32687;
        lIlllIlIIl[97] = (-((-6747) & 7035)) & (-22673) & 24511;
        lIlllIlIIl[98] = (-16459) & 20207;
        lIlllIlIIl[99] = (-14853) & 16372;
        lIlllIlIIl[100] = (-12793) & 16383;
        lIlllIlIIl[101] = (-22545) & 24318;
        lIlllIlIIl[102] = (-28996) & 32583;
        lIlllIlIIl[103] = (-28996) & 30707;
        lIlllIlIIl[104] = (-((-3151) & 19679)) & (-65) & 20475;
        lIlllIlIIl[105] = 248 ^ 178;
        lIlllIlIIl[106] = 73 ^ 2;
        lIlllIlIIl[107] = (52 ^ 47) ^ (211 ^ 132);
        lIlllIlIIl[108] = 6 ^ 75;
        lIlllIlIIl[109] = 64 ^ 14;
        lIlllIlIIl[110] = 72 ^ 7;
        lIlllIlIIl[111] = (52 ^ 42) ^ (226 ^ 172);
        lIlllIlIIl[112] = (109 ^ 47) ^ (85 ^ 70);
        lIlllIlIIl[113] = 151 ^ 197;
        lIlllIlIIl[114] = 228 ^ 183;
        lIlllIlIIl[115] = 242 ^ 166;
        lIlllIlIIl[116] = (((16 + 185) - 146) + 181) ^ (((150 + 74) - 154) + 115);
        lIlllIlIIl[117] = 150 ^ 192;
        lIlllIlIIl[118] = (81 ^ 24) ^ (174 ^ 176);
        lIlllIlIIl[119] = (((43 + 46) - (-29)) + 35) ^ (((65 + 26) - 76) + 178);
        lIlllIlIIl[120] = 53 ^ 108;
        lIlllIlIIl[121] = (249 ^ 142) ^ (145 ^ 188);
        lIlllIlIIl[122] = (((154 + 122) - 106) + 53) ^ (((43 + 86) - 1) + 4);
        lIlllIlIIl[123] = (((92 + 1) - 38) + 179) ^ (((27 + 120) - 138) + 173);
        lIlllIlIIl[124] = 159 ^ 194;
        lIlllIlIIl[125] = (209 ^ 133) ^ (37 ^ 47);
    }

    private static boolean lIIlllIlllIII(int i) {
        return i > 0;
    }

    private static void O() {
        int[] iArr = new int[lIlllIlIIl[0]];
        iArr[lIlllIlIIl[1]] = lIlllIlIIl[9];
        if (lIIlllIllIlII(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIIl[9], lIlllIlIIl[12], lIlllIlIIl[74]));
            "".length();
        }
        int[] iArr2 = new int[lIlllIlIIl[0]];
        iArr2[lIlllIlIIl[1]] = lIlllIlIIl[11];
        if (lIIlllIllIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIIl[11], lIlllIlIIl[13], C0009j.bZ));
            "".length();
        }
        if (lIIlllIllIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIIlll[lIlllIlIIl[80]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIIl[75], lIlllIlIIl[13], lIlllIlIIl[76]));
            "".length();
        }
        int[] iArr3 = new int[lIlllIlIIl[0]];
        iArr3[lIlllIlIIl[1]] = lIlllIlIIl[7];
        if (lIIlllIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIIl[7], lIlllIlIIl[53], lIlllIlIIl[74]));
            "".length();
        }
        int[] iArr4 = new int[lIlllIlIIl[0]];
        iArr4[lIlllIlIIl[1]] = lIlllIlIIl[8];
        if (lIIlllIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIIl[8], lIlllIlIIl[12], lIlllIlIIl[74]));
            "".length();
        }
    }

    private static boolean lIIlllIllIIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlllIlllIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIlllIlIIIIl(String llllllllllllllllllIllllIllIIIIII, String llllllllllllllllllIllllIlIllllll) {
        String llllllllllllllllllIllllIllIIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllllIllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllllIlIlllllI = new StringBuilder();
        char[] charArray = llllllllllllllllllIllllIlIllllll.toCharArray();
        int llllllllllllllllllIllllIlIllllII = lIlllIlIIl[1];
        char[] charArray2 = llllllllllllllllllIllllIllIIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIlIIl[1];
        while (lIIlllIllIIll(i, length)) {
            char llllllllllllllllllIllllIllIIIIIl = charArray2[i];
            llllllllllllllllllIllllIlIlllllI.append((char) (llllllllllllllllllIllllIllIIIIIl ^ charArray[llllllllllllllllllIllllIlIllllII % charArray.length]));
            "".length();
            llllllllllllllllllIllllIlIllllII++;
            i++;
            "".length();
            if ((((((87 + 109) - 113) + 67) ^ (((88 + 164) - 198) + 128)) & (((54 ^ 95) ^ (142 ^ 199)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllllIlIlllllI);
    }

    static {
        lIIlllIllIIIl();
        lIIlllIllIIII();
        bp = new ArrayList();
        dr = lIlllIlIIl[1];
        ds = new WorldPoint(lIlllIlIIl[91], lIlllIlIIl[92], lIlllIlIIl[1]);
        dt = new WorldPoint(lIlllIlIIl[93], lIlllIlIIl[94], lIlllIlIIl[1]);
        du = new WorldPoint(lIlllIlIIl[95], lIlllIlIIl[96], lIlllIlIIl[1]);
        dv = new WorldPoint(lIlllIlIIl[97], lIlllIlIIl[98], lIlllIlIIl[1]);
        dw = new WorldPoint(lIlllIlIIl[99], lIlllIlIIl[100], lIlllIlIIl[1]);
        dx = new WorldPoint(lIlllIlIIl[101], lIlllIlIIl[102], lIlllIlIIl[1]);
        dy = new WorldPoint(lIlllIlIIl[103], lIlllIlIIl[104], lIlllIlIIl[1]);
        String[] strArr = new String[lIlllIlIIl[33]];
        strArr[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[105]];
        strArr[lIlllIlIIl[0]] = lIlllIIlll[lIlllIlIIl[106]];
        strArr[lIlllIlIIl[5]] = lIlllIIlll[lIlllIlIIl[107]];
        strArr[lIlllIlIIl[10]] = lIlllIIlll[lIlllIlIIl[108]];
        strArr[lIlllIlIIl[6]] = lIlllIIlll[lIlllIlIIl[109]];
        strArr[lIlllIlIIl[13]] = lIlllIIlll[lIlllIlIIl[110]];
        strArr[lIlllIlIIl[17]] = lIlllIIlll[lIlllIlIIl[111]];
        strArr[lIlllIlIIl[18]] = lIlllIIlll[lIlllIlIIl[112]];
        strArr[lIlllIlIIl[2]] = lIlllIIlll[lIlllIlIIl[113]];
        strArr[lIlllIlIIl[24]] = lIlllIIlll[lIlllIlIIl[114]];
        strArr[lIlllIlIIl[12]] = lIlllIIlll[lIlllIlIIl[115]];
        strArr[lIlllIlIIl[25]] = lIlllIIlll[lIlllIlIIl[116]];
        strArr[lIlllIlIIl[15]] = lIlllIIlll[lIlllIlIIl[117]];
        strArr[lIlllIlIIl[26]] = lIlllIIlll[lIlllIlIIl[118]];
        strArr[lIlllIlIIl[27]] = lIlllIIlll[lIlllIlIIl[119]];
        strArr[lIlllIlIIl[28]] = lIlllIIlll[lIlllIlIIl[120]];
        strArr[lIlllIlIIl[29]] = lIlllIIlll[lIlllIlIIl[121]];
        strArr[lIlllIlIIl[30]] = lIlllIIlll[lIlllIlIIl[122]];
        strArr[lIlllIlIIl[31]] = lIlllIIlll[lIlllIlIIl[123]];
        strArr[lIlllIlIIl[32]] = lIlllIIlll[lIlllIlIIl[124]];
        cy = strArr;
    }

    private static boolean lIIlllIlllIll(int i, int i2) {
        return i != i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            bf();
            "".length();
            if ("   ".length() > ((145 ^ 162) ^ (40 ^ 31))) {
                return ((231 ^ 177) ^ (109 ^ 47)) & (((152 ^ 150) ^ (79 ^ 85)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlllIlIIl[77];
    }

    private static boolean lIIlllIllIlII(int i) {
        return i == 0;
    }

    private static boolean lIIlllIllIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlllIllIlIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[24])) {
            String[] strArr = new String[lIlllIlIIl[0]];
            strArr[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[79]];
            if (lIIlllIllIlII(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = lIlllIlIIl[0];
                "".length();
                return ((72 ^ 1) & ((121 ^ 48) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlllIlIIl[1];
    }

    private static String lIIlllIlIIIII(String llllllllllllllllllIllllIllIlllIl, String llllllllllllllllllIllllIllIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllllIllIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllllIllIlllll.init(lIlllIlIIl[5], secretKeySpec);
            return new String(llllllllllllllllllIllllIllIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllllIllIllllI) {
            llllllllllllllllllIllllIllIllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIllIIII() {
        lIlllIIlll = new String[lIlllIlIIl[125]];
        lIlllIIlll[lIlllIlIIl[1]] = lIIlllIIlllll("PTkPVtA1iDLkdtTBEhPPYeZKwqD6jgTscsZjdM9bnCOSCKsWbs92qNcO5diHxwCY", "wWvxh");
        lIlllIIlll[lIlllIlIIl[0]] = lIIlllIlIIIII("tR6FTaMxCP6/Y3ZqrCs3qg==", "eqabx");
        lIlllIIlll[lIlllIlIIl[5]] = lIIlllIlIIIIl("IBgeLQ0BFxdpAwkXGyAPDw==", "hypIa");
        lIlllIIlll[lIlllIlIIl[10]] = lIIlllIlIIIII("R96/mQhVcmDSXp/UGcljd6wwdv7h24+PHa9tjYrwmdAdo0x02uQbjpGA2slisri313gO0EHKYM0=", "IvCDA");
        lIlllIIlll[lIlllIlIIl[6]] = lIIlllIlIIIII("l6AEbNq+HrE=", "deEXH");
        lIlllIIlll[lIlllIlIIl[13]] = lIIlllIIlllll("4QFnPuwrMtQ=", "LxnEu");
        lIlllIIlll[lIlllIlIIl[17]] = lIIlllIlIIIII("YijrKHYZeDyU3P9jZ8KKLg==", "GHpNQ");
        lIlllIIlll[lIlllIlIIl[18]] = lIIlllIlIIIIl("HgEzNA4kGzVmCzgQITI=", "MuRFz");
        lIlllIIlll[lIlllIlIIl[2]] = lIIlllIIlllll("uba3Njk94LY=", "wLBEG");
        lIlllIIlll[lIlllIlIIl[24]] = lIIlllIIlllll("ZQHF2Kf6YhJpSUC3MLgszphx9nS2DCxS", "ttUZw");
        lIlllIIlll[lIlllIlIIl[12]] = lIIlllIIlllll("exQPiRA4z0g=", "QmKRV");
        lIlllIIlll[lIlllIlIIl[25]] = lIIlllIlIIIII("YN6Y3mIGV4IMlsvvTeTFlg==", "sswPA");
        lIlllIIlll[lIlllIlIIl[15]] = lIIlllIlIIIIl("ABkpCjYrAy8GdzYUOA07KQ==", "EwJbW");
        lIlllIIlll[lIlllIlIIl[26]] = lIIlllIlIIIIl("MzElECMQJg==", "uTDdK");
        lIlllIIlll[lIlllIlIIl[27]] = lIIlllIlIIIIl("KTw0ITkCJjIteB0nPiU0", "lRWIX");
        lIlllIIlll[lIlllIlIIl[28]] = lIIlllIlIIIII("P1JtwY3Zc/DLir77UH6aCZ6rgkcL5RuP", "yVhyx");
        lIlllIIlll[lIlllIlIIl[29]] = lIIlllIlIIIIl("AwUvOA45A2MjDiQH", "WdCSg");
        lIlllIIlll[lIlllIlIIl[30]] = lIIlllIlIIIII("+P1/elyV1yw=", "lpHVx");
        lIlllIIlll[lIlllIlIIl[31]] = lIIlllIIlllll("U+nHIKl0IX2bIQ+ldnya2A==", "zMBYw");
        lIlllIIlll[lIlllIlIIl[32]] = lIIlllIIlllll("MSGR2/64CKQ9+DtqWm/+Aw==", "CfhoM");
        lIlllIIlll[lIlllIlIIl[33]] = lIIlllIlIIIII("J4tN9EKtKCUontOmgek7tg==", "SqKSO");
        lIlllIIlll[lIlllIlIIl[34]] = lIIlllIIlllll("9UrQti3Ev70=", "cBbhR");
        lIlllIIlll[lIlllIlIIl[35]] = lIIlllIlIIIIl("Bx80LgApEz5nEjMV", "AvZGs");
        lIlllIIlll[lIlllIlIIl[36]] = lIIlllIIlllll("WusxBN9Xg0eu0p56IGScxX50LCp4w68f", "Detnv");
        lIlllIIlll[lIlllIlIIl[37]] = lIIlllIIlllll("tgZ0/W7GNFmWh1YRP3oj6A==", "UMUxT");
        lIlllIIlll[lIlllIlIIl[38]] = lIIlllIlIIIII("xYIJ7S5INqc=", "Zabkd");
        lIlllIIlll[lIlllIlIIl[39]] = lIIlllIlIIIIl("FycHGjs5Kw1TJSQgHQo=", "QNisH");
        lIlllIIlll[lIlllIlIIl[40]] = lIIlllIlIIIIl("BQwPeAAkTQowDTEEHDZUPwQVPQ==", "KmyXt");
        lIlllIIlll[lIlllIlIIl[41]] = lIIlllIlIIIIl("OjgWPScAPlolJhcjEzMg", "nYzVN");
        lIlllIIlll[lIlllIlIIl[42]] = lIIlllIIlllll("B8HMJPb9wKp7cIUL0VMBMA==", "CKotK");
        lIlllIIlll[lIlllIlIIl[43]] = lIIlllIlIIIII("eLyOyWQyH03XOGxlVF/XSQjrMD5DjnGF", "BxevT");
        lIlllIIlll[lIlllIlIIl[44]] = lIIlllIlIIIII("JD/ug0pkj4rTIpbgWi61drudtwCFoag3", "ZfbIL");
        lIlllIIlll[lIlllIlIIl[45]] = lIIlllIlIIIII("eKxmYx4zhPTNHnjPdsW9Yq562rJ6HWQu", "dPyVx");
        lIlllIIlll[lIlllIlIIl[46]] = lIIlllIlIIIIl("DTgHFxEg", "EWuvr");
        lIlllIIlll[lIlllIlIIl[47]] = lIIlllIlIIIII("+E91G7upCIXazSD2bOYJ2OFPjni0raOC", "XTpGF");
        lIlllIIlll[lIlllIlIIl[48]] = lIIlllIlIIIIl("NC0yTwIVbDcbFwg4", "zLDov");
        lIlllIIlll[lIlllIlIIl[49]] = lIIlllIlIIIII("OL9DoPR15blz938I7rZ9eA==", "oeZwX");
        lIlllIIlll[lIlllIlIIl[50]] = lIIlllIIlllll("gvwO+kX0gE0=", "zOeYW");
        lIlllIIlll[lIlllIlIIl[51]] = lIIlllIlIIIII("MkTi/gLl5YE3UJgw4brBI8YRALueggkZ", "yRuvl");
        lIlllIIlll[lIlllIlIIl[52]] = lIIlllIlIIIII("SN7GmKtHV+TT1mjzd99ing==", "zxKcq");
        lIlllIIlll[lIlllIlIIl[53]] = lIIlllIlIIIII("/luOcODZZZGoICdPQw2P5Q==", "xHWWD");
        lIlllIIlll[lIlllIlIIl[54]] = lIIlllIlIIIII("arsW0YThPj5AgbSEkxRKuQ==", "sEeQH");
        lIlllIIlll[lIlllIlIIl[55]] = lIIlllIlIIIII("h3KTB5MK0H6ORTevkosskw==", "bWrXX");
        lIlllIIlll[lIlllIlIIl[56]] = lIIlllIlIIIIl("MikbMyIoL1cuLik7", "FHwXK");
        lIlllIIlll[lIlllIlIIl[57]] = lIIlllIlIIIIl("AjU2Ag==", "TPYqT");
        lIlllIIlll[lIlllIlIIl[58]] = lIIlllIlIIIII("FRRWm795OfI8Njg1R+xyNg==", "cTRkz");
        lIlllIIlll[lIlllIlIIl[60]] = lIIlllIIlllll("FZ3nZP54T11CVAyl2hh0mA==", "YBvit");
        lIlllIIlll[lIlllIlIIl[61]] = lIIlllIIlllll("3cVJBqMI+QD/flsAy+lBZw==", "kQFYS");
        lIlllIIlll[lIlllIlIIl[62]] = lIIlllIlIIIII("0tdQ0bj9ZzA=", "yrVLr");
        lIlllIIlll[lIlllIlIIl[63]] = lIIlllIIlllll("tRooyVnSIjNgqxrDFatEkYDsddaFj0xq", "aBIch");
        lIlllIIlll[lIlllIlIIl[64]] = lIIlllIlIIIII("BS98iEoVCjQ=", "soHEJ");
        lIlllIIlll[lIlllIlIIl[65]] = lIIlllIlIIIII("stMT/lW+lDM=", "NseaJ");
        lIlllIIlll[lIlllIlIIl[66]] = lIIlllIlIIIII("7LISCyhGev9hJWj17zWsaA==", "NgKtg");
        lIlllIIlll[lIlllIlIIl[67]] = lIIlllIlIIIII("sZlIC0RZ+5yqk7TZqkVkCw==", "oGQbW");
        lIlllIIlll[lIlllIlIIl[68]] = lIIlllIIlllll("k5/YsN4br8Hko+ILkrxK9Q==", "paZMB");
        lIlllIIlll[lIlllIlIIl[69]] = lIIlllIlIIIIl("IBk6", "rlXIw");
        lIlllIIlll[lIlllIlIIl[70]] = lIIlllIlIIIIl("Kh0eNwsNERw1SAoUEysNCw==", "yxrRh");
        lIlllIIlll[lIlllIlIIl[71]] = lIIlllIlIIIII("2hmTykeWHT4=", "aXqco");
        lIlllIIlll[lIlllIlIIl[72]] = lIIlllIlIIIII("xZoyXzkuMBo=", "dgAyM");
        lIlllIIlll[lIlllIlIIl[73]] = lIIlllIlIIIIl("KCIMFjoLNQ==", "nGmbR");
        lIlllIIlll[lIlllIlIIl[78]] = lIIlllIlIIIII("FtcS34YwEISA/AFY7HMYTjkmVj8e5PKW", "WKICY");
        lIlllIIlll[lIlllIlIIl[79]] = lIIlllIlIIIII("N8d4Ellv7U+vfnpxQa+irA==", "AhcAv");
        lIlllIIlll[lIlllIlIIl[80]] = lIIlllIIlllll("kcmHn5+p04enkmVNkZdby53HRx0sPwWp", "uuKKk");
        lIlllIIlll[lIlllIlIIl[81]] = lIIlllIlIIIII("zA2JrNQalxiLg9j8UNg6S4hEvUR1sup8Cyvp3AbMWsE=", "MrpEO");
        lIlllIIlll[lIlllIlIIl[82]] = lIIlllIlIIIIl("ODECcyJ0IAQ1NTF6", "TTvTQ");
        lIlllIIlll[lIlllIlIIl[16]] = lIIlllIlIIIII("k6mixA4fUIgZYn8dojAKTw==", "Nranp");
        lIlllIIlll[lIlllIlIIl[83]] = lIIlllIlIIIIl("DykqTyFsKTcESDUnMU8JLicxG0gfICUWEiUtKlA=", "LHDoh");
        lIlllIIlll[lIlllIlIIl[84]] = lIIlllIlIIIII("CMDyTZpM9uTJIgj+pn439g==", "AHnZS");
        lIlllIIlll[lIlllIlIIl[85]] = lIIlllIIlllll("QgPpkVm4QhRtkrpMPqX3b/TnOjgA2gz0Z/sjG9onn2k=", "diqDi");
        lIlllIIlll[lIlllIlIIl[86]] = lIIlllIlIIIIl("KT8kdhlFLiIwDgB0", "eZPQj");
        lIlllIIlll[lIlllIlIIl[87]] = lIIlllIlIIIIl("LxgMSRFMGBECeBUWF0k5DhYXHXgtCwEMLRkKXQ==", "lybiX");
        lIlllIIlll[lIlllIlIIl[88]] = lIIlllIlIIIIl("B1YQFx5pAlQWFSsSVBkeNwIcER4pWA==", "Nvtxp");
        lIlllIIlll[lIlllIlIIl[89]] = lIIlllIlIIIIl("EwMbSQxwAwYCZSkNAEkkMg0AHWUADQcdZQALBgokIgsZADAjXQ==", "PbuiE");
        lIlllIIlll[lIlllIlIIl[90]] = lIIlllIIlllll("85gHbiGJI4kSSBliFpfAUeduEmbiobOpiwjSSyXQ9ARzAwO4onASDQ==", "vvzaU");
        lIlllIIlll[lIlllIlIIl[105]] = lIIlllIlIIIIl("LCo4IHUdJDtlMgs/biQ7HWs/MDAXPz1lMws5bigwWw==", "dKNEU");
        lIlllIIlll[lIlllIlIIl[106]] = lIIlllIlIIIIl("GhwLRA==", "Cyxjg");
        lIlllIIlll[lIlllIlIIl[107]] = lIIlllIIlllll("KNy8Gc4h/hU=", "IxRVZ");
        lIlllIIlll[lIlllIlIIl[108]] = lIIlllIIlllll("IFS3LwwQJw6L8rJ8nFuVLQUxK5sWr1v/Xevd46NIPtMKoeojrgvXXg==", "uwfzS");
        lIlllIIlll[lIlllIlIIl[109]] = lIIlllIIlllll("dJJv1k9m3h5yl1sRN+ofZSK4K9fo95lp4GpvR0ny8HaFOPBnPrrrAAFjTkgUTref", "QFOBU");
        lIlllIIlll[lIlllIlIIl[110]] = lIIlllIlIIIII("OxAzkQanrp+Fk4EwDFCfUq3boDP5JwZxLHEEiCjBBC5DCzojTFbVdA==", "ubRqv");
        lIlllIIlll[lIlllIlIIl[111]] = lIIlllIlIIIII("6lqxVyr/vDgUIgC5lygsUEpdfmxKzADQ2I54Dz/HmHw=", "cslDW");
        lIlllIIlll[lIlllIlIIl[112]] = lIIlllIIlllll("uvZp0C2rZDoivojJ15lo/loS5Wq2EmAwMeHXLxOB1r/b2yaNcPsK5w==", "ZhbQQ");
        lIlllIIlll[lIlllIlIIl[113]] = lIIlllIlIIIII("Abe/okLuDyRVpYgla6+JTVCa2Tsx6DpCga6FTr9bzr0=", "SbDAR");
        lIlllIIlll[lIlllIlIIl[114]] = lIIlllIlIIIIl("GjoqQh8lPSYOCG0bcwUNJDxzBA07PSYQTDo7JwpMAT0lAwcoPDQIUw==", "MRSbl");
        lIlllIIlll[lIlllIlIIl[115]] = lIIlllIIlllll("9q/UKjhaLOoItxjhZNaHMdiOdEijk+cf6zdMuVO0HOs=", "TMYZj");
        lIlllIIlll[lIlllIlIIl[116]] = lIIlllIlIIIIl("ES4XZAcuKRsoEGYPTiMVLyhOIhUwKRs2VDEvGixUFS4PPQ4vIwB7", "FFnDt");
        lIlllIIlll[lIlllIlIIl[117]] = lIIlllIlIIIII("OVqqPappAFVskM4qI5vKT0i7Ut8/2nzwFJ2h76bdu/0=", "PIaul");
        lIlllIIlll[lIlllIlIIl[118]] = lIIlllIIlllll("Ica9bjdgsneSLw4SLZwKoFmoPhT9r5mXqpUnJGXNx7Zax2yYw+Z+Zg==", "vZVIj");
        lIlllIIlll[lIlllIlIIl[119]] = lIIlllIlIIIIl("Mis2AVQMMHcBHAAxMlUACmMzGlQMLXclGxc3dyUdFiA2Bx0JKiIGSw==", "eCWut");
        lIlllIIlll[lIlllIlIIl[120]] = lIIlllIlIIIIl("FAcvN0oqHG43AiYdK2MeLE8qLEoqAW4CGCAKOzYZfA==", "CoNCj");
        lIlllIIlll[lIlllIlIIl[121]] = lIIlllIlIIIIl("BRILGkM7CUoaCzcID04XPVoOAUM7FEoiDCQbAQsNNRBV", "Rzjnc");
        lIlllIIlll[lIlllIlIIl[122]] = lIIlllIlIIIII("FZhZQdy+TQQoaQm75lNAmKg2JbExJTi69A9zH2O46iiVIEvDsYrx/w==", "NmDJg");
        lIlllIIlll[lIlllIlIIl[123]] = lIIlllIlIIIIl("DSARBnEzO1AGOT86FVIlNWgUHXEzJlA6PikhFBskKXc=", "ZHprQ");
        lIlllIIlll[lIlllIlIIl[124]] = lIIlllIIlllll("iEebO6X3RVWTN4VkxqCJzgzlYgBxM5uJ9E/E4qFMX9U=", "zNAjQ");
    }

    private static boolean lIIlllIllIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllIllIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllIlllIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlllIllIllI(int i, int i2) {
        return i == i2;
    }

    public static void bg() {
        String[] strArr = new String[lIlllIlIIl[0]];
        strArr[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[66]];
        if (lIIlllIllIIlI(Inventory.contains(strArr) ? 1 : 0)) {
            if (lIIlllIllIlll(Widgets.get(lIlllIlIIl[59]))) {
                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[67]];
                String[] strArr2 = new String[lIlllIlIIl[0]];
                strArr2[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[68]];
                Inventory.getFirst(strArr2).interact(lIlllIIlll[lIlllIlIIl[69]]);
                Time.sleepTicks(lIlllIlIIl[6]);
                "".length();
                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[70]];
                Widget widget = Widgets.get(lIlllIlIIl[59], lIlllIlIIl[27]);
                if (lIIlllIllIlll(widget)) {
                    widget.interact(lIlllIIlll[lIlllIlIIl[71]]);
                    Time.sleepTicks(lIlllIlIIl[0]);
                    "".length();
                }
                Widget widget2 = Widgets.get(lIlllIlIIl[59], lIlllIlIIl[39]);
                if (lIIlllIllIlll(widget2)) {
                    widget2.interact(lIlllIIlll[lIlllIlIIl[72]]);
                    Time.sleepTicks(lIlllIlIIl[5]);
                    "".length();
                }
            }
            Time.sleepTicks(lIlllIlIIl[0]);
            "".length();
        }
    }

    private static String lIIlllIIlllll(String llllllllllllllllllIllllIllIlIIII, String llllllllllllllllllIllllIllIIllll) {
        try {
            SecretKeySpec llllllllllllllllllIllllIllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIllIIllll.getBytes(StandardCharsets.UTF_8)), lIlllIlIIl[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIlIIl[5], llllllllllllllllllIllllIllIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllllIllIlIIIl) {
            llllllllllllllllllIllllIllIlIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (lIIlllIllIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L290;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v501, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v503, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v505, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v507, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v509, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v614, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v641, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v96, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bf() {
        if (lIIlllIllIIlI(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIlllIllIIll(bp.size(), lIlllIlIIl[0])) {
                System.out.println(lIlllIIlll[lIlllIlIIl[1]]);
                bn = lIlllIlIIl[1];
            }
        }
        if (lIIlllIllIlII(bn ? 1 : 0)) {
            if (lIIlllIllIlIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) {
                int[] iArr = new int[lIlllIlIIl[0]];
                iArr[lIlllIlIIl[1]] = lIlllIlIIl[3];
            }
            J.cL();
            if (lIIlllIllIlII(al() ? 1 : 0) && lIIlllIllIIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0]) && lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) {
                int[] iArr2 = new int[lIlllIlIIl[0]];
                iArr2[lIlllIlIIl[1]] = lIlllIlIIl[3];
                if (lIIlllIllIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIlllIllIlll(nearest) && lIIlllIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[0]];
                        C0000a.a(nearest);
                    }
                    if (lIIlllIllIlll(nearest) && lIIlllIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIlllIlIIl[4]);
                            "".length();
                        }
                        if (lIIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[5]];
                            if (lIIlllIlllIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIlllIlIIl[6]);
                                "".length();
                            }
                            if (lIIlllIlllIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIlllIlIIl[5]);
                                "".length();
                            }
                            int[] iArr3 = new int[lIlllIlIIl[6]];
                            iArr3[lIlllIlIIl[1]] = lIlllIlIIl[7];
                            iArr3[lIlllIlIIl[0]] = lIlllIlIIl[8];
                            iArr3[lIlllIlIIl[5]] = lIlllIlIIl[9];
                            iArr3[lIlllIlIIl[10]] = lIlllIlIIl[11];
                            if (lIIlllIllIlII(C0004e.b(iArr3) ? 1 : 0)) {
                                O();
                                System.out.println(lIlllIIlll[lIlllIlIIl[10]]);
                                bn = lIlllIlIIl[0];
                                return;
                            }
                            int[] iArr4 = new int[lIlllIlIIl[6]];
                            iArr4[lIlllIlIIl[1]] = lIlllIlIIl[7];
                            iArr4[lIlllIlIIl[0]] = lIlllIlIIl[8];
                            iArr4[lIlllIlIIl[5]] = lIlllIlIIl[9];
                            iArr4[lIlllIlIIl[10]] = lIlllIlIIl[11];
                            if (lIIlllIllIIlI(C0004e.b(iArr4) ? 1 : 0)) {
                                C0000a.a(lIlllIlIIl[7], lIlllIlIIl[12]);
                                C0000a.a(lIlllIlIIl[8], lIlllIlIIl[12]);
                                C0000a.a(lIlllIlIIl[9], lIlllIlIIl[0]);
                                C0000a.a(lIlllIlIIl[11], lIlllIlIIl[13]);
                                C0000a.a(lIlllIlIIl[14], lIlllIlIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] iArr5 = new int[lIlllIlIIl[0]];
            iArr5[lIlllIlIIl[1]] = lIlllIlIIl[14];
            if (lIIlllIllIIlI(Inventory.contains(iArr5) ? 1 : 0) && lIIlllIllIlIl(Combat.getMissingHealth(), lIlllIlIIl[15])) {
                int[] iArr6 = new int[lIlllIlIIl[0]];
                iArr6[lIlllIlIIl[1]] = lIlllIlIIl[14];
                Inventory.getFirst(iArr6).interact(lIlllIIlll[lIlllIlIIl[6]]);
                Time.sleepTicks(lIlllIlIIl[5]);
                "".length();
            }
            if (lIIlllIllIIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlllIllIIll(Movement.getRunEnergy(), lIlllIlIIl[16])) {
                Inventory.getFirst(C0005f.aU).interact(lIlllIIlll[lIlllIlIIl[13]]);
                Time.sleepTicks(lIlllIlIIl[0]);
                "".length();
            }
            if (lIIlllIllIIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0]) && lIIlllIllIIlI(al() ? 1 : 0) && lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) {
                int[] iArr7 = new int[lIlllIlIIl[0]];
                iArr7[lIlllIlIIl[1]] = lIlllIlIIl[3];
                if (lIIlllIllIlII(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (lIIlllIllIlII(Players.getLocal().getWorldLocation().equals(ds) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[17]];
                        if (lIIlllIllIIlI(Dialog.isOpen() ? 1 : 0) && lIIlllIllIIll(dr, lIlllIlIIl[5])) {
                            Dialog.close();
                            dr += lIlllIlIIl[0];
                        }
                        C0004e.a(ds);
                    }
                    if (lIIlllIllIIlI(Players.getLocal().getWorldLocation().equals(ds) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[18]];
                        C0006g.a(lIlllIIlll[lIlllIlIIl[2]], cy);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit(lIlllIlIIl[19]));
            System.out.println("5621: " + Vars.getBit(lIlllIlIIl[20]));
            System.out.println("5622: " + Vars.getBit(lIlllIlIIl[21]));
            System.out.println("5623: " + Vars.getBit(lIlllIlIIl[22]));
            System.out.println("5624: " + Vars.getBit(lIlllIlIIl[23]));
            if (lIIlllIllIllI(Vars.getBit(lIlllIlIIl[19]), lIlllIlIIl[0])) {
                dm = lIlllIlIIl[0];
            }
            if (lIIlllIllIllI(Vars.getBit(lIlllIlIIl[20]), lIlllIlIIl[0])) {
                dn = lIlllIlIIl[0];
            }
            if (lIIlllIllIllI(Vars.getBit(lIlllIlIIl[21]), lIlllIlIIl[0])) {
                f1do = lIlllIlIIl[0];
            }
            if (lIIlllIllIllI(Vars.getBit(lIlllIlIIl[22]), lIlllIlIIl[0])) {
                dp = lIlllIlIIl[0];
            }
            if (lIIlllIllIllI(Vars.getBit(lIlllIlIIl[23]), lIlllIlIIl[0])) {
                dq = lIlllIlIIl[0];
            }
            if (lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0])) {
                dc = lIlllIlIIl[1];
                if (lIIlllIllIlII(dm ? 1 : 0)) {
                    String[] strArr = new String[lIlllIlIIl[0]];
                    strArr[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[24]];
                    if (lIIlllIllIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[lIlllIlIIl[0]];
                        strArr2[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[12]];
                        if (lIIlllIllIIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[lIlllIlIIl[0]];
                            strArr3[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[25]];
                            if (lIIlllIllIlII(Inventory.contains(strArr3) ? 1 : 0)) {
                                String[] strArr4 = new String[lIlllIlIIl[0]];
                                strArr4[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[15]];
                                Item first = Inventory.getFirst(strArr4);
                                String[] strArr5 = new String[lIlllIlIIl[0]];
                                strArr5[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[26]];
                                first.useOn(Inventory.getFirst(strArr5));
                                Time.sleepTicks(lIlllIlIIl[5]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr6 = new String[lIlllIlIIl[0]];
                    strArr6[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[27]];
                    if (lIIlllIllIIlI(Inventory.contains(strArr6) ? 1 : 0)) {
                        if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[28]];
                            Movement.walkTo(dt);
                            "".length();
                            Time.sleepTicks(lIlllIlIIl[0]);
                            "".length();
                        }
                        if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[29]];
                            C0006g.a(lIlllIIlll[lIlllIlIIl[30]], cy, lIlllIlIIl[0]);
                            Time.sleepTicks(lIlllIlIIl[0]);
                            "".length();
                            List options = Dialog.getOptions();
                            ArrayList arrayList = new ArrayList();
                            if (lIIlllIllIlII(options.isEmpty() ? 1 : 0)) {
                                int i = lIlllIlIIl[1];
                                while (lIIlllIllIIll(i, options.size())) {
                                    arrayList.add(((Widget) options.get(i)).getText());
                                    "".length();
                                    i++;
                                    "".length();
                                    if (((144 ^ 170) & ((20 ^ 46) ^ (-1))) < (-" ".length())) {
                                        return;
                                    }
                                }
                                boolean anyMatch = arrayList.stream().anyMatch(str -> {
                                    return str.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[90]]);
                                });
                                boolean noneMatch = arrayList.stream().noneMatch(str2 -> {
                                    return str2.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[89]]);
                                });
                                if (lIIlllIllIIlI(anyMatch ? 1 : 0) && lIIlllIllIIlI(noneMatch ? 1 : 0)) {
                                    System.out.println(lIlllIIlll[lIlllIlIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (lIIlllIllIlII(dn ? 1 : 0) && lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(du), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[32]];
                        Movement.walkTo(du);
                        "".length();
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                    }
                    if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(du), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[33]];
                        C0006g.a(lIlllIIlll[lIlllIlIIl[34]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                        List options2 = Dialog.getOptions();
                        ArrayList arrayList2 = new ArrayList();
                        if (lIIlllIllIlII(options2.isEmpty() ? 1 : 0)) {
                            int i2 = lIlllIlIIl[1];
                            while (lIIlllIllIIll(i2, options2.size())) {
                                arrayList2.add(((Widget) options2.get(i2)).getText());
                                "".length();
                                i2++;
                                "".length();
                                if ((true ^ true) & ((true ^ true) ^ true)) {
                                    return;
                                }
                            }
                            boolean anyMatch2 = arrayList2.stream().anyMatch(str3 -> {
                                return str3.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[88]]);
                            });
                            boolean noneMatch2 = arrayList2.stream().noneMatch(str4 -> {
                                return str4.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[87]]);
                            });
                            if (lIIlllIllIIlI(anyMatch2 ? 1 : 0) && lIIlllIllIIlI(noneMatch2 ? 1 : 0)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[35]]);
                            }
                        }
                    }
                }
                if (lIIlllIllIlII(f1do ? 1 : 0) && lIIlllIllIIlI(dn ? 1 : 0) && lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[36]];
                        Movement.walkTo(dv);
                        "".length();
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                    }
                    if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[37]];
                        C0006g.a(lIlllIIlll[lIlllIlIIl[38]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                        List options3 = Dialog.getOptions();
                        ArrayList arrayList3 = new ArrayList();
                        if (lIIlllIllIlII(options3.isEmpty() ? 1 : 0)) {
                            int i3 = lIlllIlIIl[1];
                            while (lIIlllIllIIll(i3, options3.size())) {
                                arrayList3.add(((Widget) options3.get(i3)).getText());
                                "".length();
                                i3++;
                                "".length();
                                if ("   ".length() < 0) {
                                    return;
                                }
                            }
                            boolean anyMatch3 = arrayList3.stream().anyMatch(str5 -> {
                                return str5.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[86]]);
                            });
                            boolean noneMatch3 = arrayList3.stream().noneMatch(str6 -> {
                                return str6.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[85]]);
                            });
                            if (lIIlllIllIIlI(anyMatch3 ? 1 : 0) && lIIlllIllIIlI(noneMatch3 ? 1 : 0)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[39]]);
                            }
                        }
                    }
                }
                if (lIIlllIllIlII(dp ? 1 : 0) && lIIlllIllIIlI(f1do ? 1 : 0) && lIIlllIllIIlI(dn ? 1 : 0) && lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[40]];
                        Movement.walkTo(dw);
                        "".length();
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                    }
                    if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[41]];
                        C0006g.a(lIlllIIlll[lIlllIlIIl[42]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                        List options4 = Dialog.getOptions();
                        ArrayList arrayList4 = new ArrayList();
                        if (lIIlllIllIlII(options4.isEmpty() ? 1 : 0)) {
                            int i4 = lIlllIlIIl[1];
                            while (lIIlllIllIIll(i4, options4.size())) {
                                arrayList4.add(((Widget) options4.get(i4)).getText());
                                "".length();
                                i4++;
                                "".length();
                                if ((((131 ^ 148) ^ (20 ^ 37)) & (((((125 + 41) - 83) + 81) ^ (((104 + 120) - 162) + 68)) ^ (-" ".length()))) > 0) {
                                    return;
                                }
                            }
                            boolean anyMatch4 = arrayList4.stream().anyMatch(str7 -> {
                                return str7.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[84]]);
                            });
                            boolean noneMatch4 = arrayList4.stream().noneMatch(str8 -> {
                                return str8.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[83]]);
                            });
                            if (lIIlllIllIIlI(anyMatch4 ? 1 : 0) && lIIlllIllIIlI(noneMatch4 ? 1 : 0)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[43]]);
                            }
                        }
                    }
                }
                if (lIIlllIllIlII(dq ? 1 : 0) && lIIlllIllIIlI(dp ? 1 : 0) && lIIlllIllIIlI(f1do ? 1 : 0) && lIIlllIllIIlI(dn ? 1 : 0) && lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[44]];
                        Movement.walkTo(dx);
                        "".length();
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                    }
                    if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[45]];
                        C0006g.a(lIlllIIlll[lIlllIlIIl[46]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks(lIlllIlIIl[0]);
                        "".length();
                        List options5 = Dialog.getOptions();
                        ArrayList arrayList5 = new ArrayList();
                        if (lIIlllIllIlII(options5.isEmpty() ? 1 : 0)) {
                            int i5 = lIlllIlIIl[1];
                            while (lIIlllIllIIll(i5, options5.size())) {
                                arrayList5.add(((Widget) options5.get(i5)).getText());
                                "".length();
                                i5++;
                                "".length();
                                if ((true ^ true) & ((true ^ true) ^ true)) {
                                    return;
                                }
                            }
                            boolean anyMatch5 = arrayList5.stream().anyMatch(str9 -> {
                                return str9.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[16]]);
                            });
                            boolean anyMatch6 = arrayList5.stream().anyMatch(str10 -> {
                                return str10.contains(lIlllIIlll[lIlllIlIIl[82]]);
                            });
                            boolean noneMatch5 = arrayList5.stream().noneMatch(str11 -> {
                                return str11.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[81]]);
                            });
                            if ((!lIIlllIllIlII(anyMatch5 ? 1 : 0) || lIIlllIllIIlI(anyMatch6 ? 1 : 0)) && lIIlllIllIIlI(noneMatch5 ? 1 : 0)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[5])) {
                if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[48]];
                    if (lIIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0004e.a(ds);
                }
                if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[49]];
                    C0006g.a(lIlllIIlll[lIlllIlIIl[50]], cy);
                }
            }
            if (!lIIlllIlllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[10]) || lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[17])) {
                C0006g.a(cy);
            }
            if (lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[6])) {
                if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dy), lIlllIlIIl[6])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[51]];
                    Movement.walkTo(dy);
                    "".length();
                    Time.sleepTicks(lIlllIlIIl[0]);
                    "".length();
                }
                if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIlllIlIIl[6])) {
                    String[] strArr7 = new String[lIlllIlIIl[0]];
                    strArr7[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[52]];
                    if (lIIlllIllIIlI(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[lIlllIlIIl[0]];
                        strArr8[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[53]];
                        Inventory.getFirst(strArr8).interact(lIlllIIlll[lIlllIlIIl[54]]);
                        Time.sleepTicks(lIlllIlIIl[10]);
                        "".length();
                    }
                }
            }
            if (lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[13])) {
                if (lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[55]];
                    C0004e.a(ds);
                }
                if (lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[56]];
                    C0006g.a(lIlllIIlll[lIlllIlIIl[57]], cy);
                }
            }
            if (!lIIlllIlllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[18]) || lIIlllIllIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[2])) {
                if (lIIlllIllIIll(dc, lIlllIlIIl[0])) {
                    Z.nu += lIlllIlIIl[0];
                    Z.p(AccBuilderShamans.m);
                    dc += lIlllIlIIl[0];
                    Z.nu = lIlllIlIIl[1];
                    dd = lIlllIlIIl[1];
                }
                String[] strArr9 = new String[lIlllIlIIl[0]];
                strArr9[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[58]];
                if (lIIlllIllIIlI(Inventory.contains(strArr9) ? 1 : 0)) {
                    if (lIIlllIllIlll(Widgets.get(lIlllIlIIl[59]))) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[60]];
                        String[] strArr10 = new String[lIlllIlIIl[0]];
                        strArr10[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[61]];
                        Inventory.getFirst(strArr10).interact(lIlllIIlll[lIlllIlIIl[62]]);
                        Time.sleepTicks(lIlllIlIIl[6]);
                        "".length();
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[63]];
                        Widget widget = Widgets.get(lIlllIlIIl[59], lIlllIlIIl[27]);
                        if (lIIlllIllIlll(widget)) {
                            widget.interact(lIlllIIlll[lIlllIlIIl[64]]);
                            Time.sleepTicks(lIlllIlIIl[0]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(lIlllIlIIl[59], lIlllIlIIl[39]);
                        if (lIIlllIllIlll(widget2)) {
                            widget2.interact(lIlllIIlll[lIlllIlIIl[65]]);
                            Time.sleepTicks(lIlllIlIIl[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks(lIlllIlIIl[0]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        String[] strArr = new String[lIlllIlIIl[0]];
        strArr[lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[73]];
        if (lIIlllIlllIII(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIlllIlIIl[0]];
            iArr[lIlllIlIIl[1]] = lIlllIlIIl[7];
            if (lIIlllIlllIII(Inventory.getCount(iArr)) && lIIlllIlllIII(Inventory.getCount(C0005f.aU))) {
                int[] iArr2 = new int[lIlllIlIIl[0]];
                iArr2[lIlllIlIIl[1]] = lIlllIlIIl[8];
                if (lIIlllIlllIII(Inventory.getCount(iArr2))) {
                    ?? r0 = lIlllIlIIl[0];
                    "".length();
                    return "   ".length() < "   ".length() ? ((116 ^ 101) ^ (22 ^ 87)) & (((((164 + 197) - 311) + 166) ^ (((104 + 109) - 168) + 91)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIlllIlIIl[1];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlllIIlll[lIlllIlIIl[78]];
    }
}
