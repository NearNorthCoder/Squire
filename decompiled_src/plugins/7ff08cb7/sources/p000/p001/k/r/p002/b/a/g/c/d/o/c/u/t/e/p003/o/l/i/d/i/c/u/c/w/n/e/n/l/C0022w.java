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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/w.class */
public class C0022w implements ab {
    private static /* synthetic */ WorldPoint dz;
    public static /* synthetic */ boolean dx;
    private static /* synthetic */ String[] cG;
    public static /* synthetic */ boolean dw;
    private static /* synthetic */ WorldPoint dC;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ boolean dv;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ String[] lllIllllI;
    private static /* synthetic */ WorldPoint dF;
    public static /* synthetic */ boolean du;
    private static /* synthetic */ int[] llllIIIIl;
    static /* synthetic */ int dy;
    private static /* synthetic */ WorldPoint dA;
    public static /* synthetic */ boolean dt;
    private static /* synthetic */ WorldPoint dD;
    static /* synthetic */ int dk;
    private static /* synthetic */ WorldPoint dB;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ WorldPoint dE;

    public static void bd() {
        String[] strArr = new String[llllIIIIl[0]];
        strArr[llllIIIIl[1]] = lllIllllI[llllIIIIl[66]];
        if (llIIllIlIlll(Inventory.contains(strArr) ? 1 : 0)) {
            if (llIIllIlllII(Widgets.get(llllIIIIl[59]))) {
                AccBuilderGWD.c = lllIllllI[llllIIIIl[67]];
                String[] strArr2 = new String[llllIIIIl[0]];
                strArr2[llllIIIIl[1]] = lllIllllI[llllIIIIl[68]];
                Inventory.getFirst(strArr2).interact(lllIllllI[llllIIIIl[69]]);
                Time.sleepTicks(llllIIIIl[6]);
                "".length();
                AccBuilderGWD.c = lllIllllI[llllIIIIl[70]];
                Widget widget = Widgets.get(llllIIIIl[59], llllIIIIl[27]);
                if (llIIllIlllII(widget)) {
                    widget.interact(lllIllllI[llllIIIIl[71]]);
                    Time.sleepTicks(llllIIIIl[0]);
                    "".length();
                }
                Widget widget2 = Widgets.get(llllIIIIl[59], llllIIIIl[39]);
                if (llIIllIlllII(widget2)) {
                    widget2.interact(lllIllllI[llllIIIIl[72]]);
                    Time.sleepTicks(llllIIIIl[5]);
                    "".length();
                }
            }
            Time.sleepTicks(llllIIIIl[0]);
            "".length();
        }
    }

    private static boolean llIIllIllIIl(int i) {
        return i == 0;
    }

    private static String llIIllIIIIIl(String llIIlIIlIlIll, String llIIlIIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIlIIlll) {
            llIIlIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static String llIIllIIIIlI(String llIIlIlIIIIII, String llIIlIIllllll) {
        String str = new String(Base64.getDecoder().decode(llIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIIlllllI = new StringBuilder();
        char[] charArray = llIIlIIllllll.toCharArray();
        int llIIlIIllllII = llllIIIIl[1];
        char[] charArray2 = str.toCharArray();
        int llIIlIIllIlIl = charArray2.length;
        int i = llllIIIIl[1];
        while (llIIllIllIII(i, llIIlIIllIlIl)) {
            char llIIlIIllIIll = charArray2[i];
            llIIlIIlllllI.append((char) (llIIlIIllIIll ^ charArray[llIIlIIllllII % charArray.length]));
            "".length();
            llIIlIIllllII++;
            i++;
            "".length();
            if (" ".length() <= (((135 ^ 151) ^ (245 ^ 171)) & (((1 ^ 76) ^ "   ".length()) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llIIlIIlllllI);
    }

    private static void llIIllIlIllI() {
        llllIIIIl = new int[126];
        llllIIIIl[0] = " ".length();
        llllIIIIl[1] = (" ".length() ^ (70 ^ 95)) & (((6 ^ 44) ^ (131 ^ 177)) ^ (-" ".length()));
        llllIIIIl[2] = (((29 + 110) - (-15)) + 1) ^ (((120 + 79) - 53) + 1);
        llllIIIIl[3] = (-((-15497) & 15837)) & (-1028) & 24439;
        llllIIIIl[4] = (-27767) & 32766;
        llllIIIIl[5] = "  ".length();
        llllIIIIl[6] = 128 ^ 132;
        llllIIIIl[7] = (-8345) & 16351;
        llllIIIIl[8] = (-((-6849) & 31431)) & (-17) & 32607;
        llllIIIIl[9] = (-((-24843) & 28495)) & (-4226) & 8191;
        llllIIIIl[10] = "   ".length();
        llllIIIIl[11] = (-16417) & 29041;
        llllIIIIl[12] = 140 ^ 134;
        llllIIIIl[13] = 135 ^ 130;
        llllIIIIl[14] = (-((-3085) & 16013)) & (-3073) & 16379;
        llllIIIIl[15] = 190 ^ 178;
        llllIIIIl[16] = 74 ^ 11;
        llllIIIIl[17] = (193 ^ 178) ^ (211 ^ 166);
        llllIIIIl[18] = (((21 + 32) - 15) + 117) ^ (((67 + 32) - 27) + 84);
        llllIIIIl[19] = (-((-8657) & 27100)) & (-8193) & 32255;
        llllIIIIl[20] = (-((-5427) & 7475)) & (-1) & 7669;
        llllIIIIl[21] = (-((-8753) & 27193)) & (-8705) & 32766;
        llllIIIIl[22] = (-2561) & 8183;
        llllIIIIl[23] = (-25092) & 30715;
        llllIIIIl[24] = 161 ^ 168;
        llllIIIIl[25] = (42 ^ 98) ^ (244 ^ 183);
        llllIIIIl[26] = 30 ^ 19;
        llllIIIIl[27] = (10 ^ 49) ^ (183 ^ 130);
        llllIIIIl[28] = 104 ^ 103;
        llllIIIIl[29] = 10 ^ 26;
        llllIIIIl[30] = 67 ^ 82;
        llllIIIIl[31] = 100 ^ 118;
        llllIIIIl[32] = (80 ^ 19) ^ (255 ^ 175);
        llllIIIIl[33] = 177 ^ 165;
        llllIIIIl[34] = (70 ^ 9) ^ (23 ^ 77);
        llllIIIIl[35] = (3 ^ 39) ^ (7 ^ 53);
        llllIIIIl[36] = 88 ^ 79;
        llllIIIIl[37] = (99 ^ 121) ^ "  ".length();
        llllIIIIl[38] = (((73 + 104) - 68) + 67) ^ (((145 + 69) - 87) + 42);
        llllIIIIl[39] = (((104 + 121) - 170) + 91) ^ (((50 + 20) - (-12)) + 54);
        llllIIIIl[40] = 129 ^ 154;
        llllIIIIl[41] = (222 ^ 138) ^ (97 ^ 41);
        llllIIIIl[42] = 121 ^ 100;
        llllIIIIl[43] = (61 ^ 92) ^ (((30 + 53) - 73) + 117);
        llllIIIIl[44] = 49 ^ 46;
        llllIIIIl[45] = (((82 + 11) - (-10)) + 59) ^ (((43 + 72) - 66) + 81);
        llllIIIIl[46] = (0 ^ 86) ^ (222 ^ 169);
        llllIIIIl[47] = (22 ^ 94) ^ (236 ^ 134);
        llllIIIIl[48] = 56 ^ 27;
        llllIIIIl[49] = 84 ^ 112;
        llllIIIIl[50] = " ".length() ^ (190 ^ 154);
        llllIIIIl[51] = (((67 + 28) - 50) + 133) ^ (((78 + 109) - 155) + 116);
        llllIIIIl[52] = 19 ^ 52;
        llllIIIIl[53] = (((54 + 58) - (-4)) + 26) ^ (((8 + 79) - (-13)) + 66);
        llllIIIIl[54] = (((19 + 12) - (-18)) + 85) ^ (((3 + 65) - 13) + 120);
        llllIIIIl[55] = (78 ^ 72) ^ (125 ^ 81);
        llllIIIIl[56] = (((125 + 52) - 44) + 35) ^ (((5 + 55) - 20) + 91);
        llllIIIIl[57] = (73 ^ 6) ^ (108 ^ 15);
        llllIIIIl[58] = ((56 ^ 103) & ((74 ^ 21) ^ (-1))) ^ (39 ^ 10);
        llllIIIIl[59] = ((145 + 104) - 238) + 229;
        llllIIIIl[60] = (8 ^ 123) ^ (12 ^ 81);
        llllIIIIl[61] = (132 ^ 188) ^ (0 ^ 23);
        llllIIIIl[62] = (7 ^ 47) ^ (0 ^ 24);
        llllIIIIl[63] = (33 ^ 24) ^ (203 ^ 195);
        llllIIIIl[64] = 112 ^ 66;
        llllIIIIl[65] = 80 ^ 99;
        llllIIIIl[66] = 71 ^ 115;
        llllIIIIl[67] = 37 ^ 16;
        llllIIIIl[68] = 102 ^ 80;
        llllIIIIl[69] = 78 ^ 121;
        llllIIIIl[70] = (((59 + 164) - 206) + 234) ^ (((114 + 188) - 249) + 142);
        llllIIIIl[71] = (70 ^ 99) ^ (188 ^ 160);
        llllIIIIl[72] = (148 ^ 198) ^ (245 ^ 157);
        llllIIIIl[73] = 255 ^ 196;
        llllIIIIl[74] = (-((-8221) & 11327)) & (-28698) & 32703;
        llllIIIIl[75] = (-20787) & 32766;
        llllIIIIl[76] = (-((-385) & 5080)) & (-1025) & 30719;
        llllIIIIl[77] = 192 ^ 164;
        llllIIIIl[78] = (2 ^ 119) ^ (142 ^ 199);
        llllIIIIl[79] = 179 ^ 142;
        llllIIIIl[80] = 16 ^ 46;
        llllIIIIl[81] = 111 ^ 80;
        llllIIIIl[82] = (162 ^ 154) ^ (18 ^ 106);
        llllIIIIl[83] = (45 ^ 49) ^ (80 ^ 14);
        llllIIIIl[84] = (244 ^ 178) ^ (195 ^ 198);
        llllIIIIl[85] = 44 ^ 104;
        llllIIIIl[86] = (((92 + 175) - 95) + 31) ^ (((110 + 80) - 75) + 27);
        llllIIIIl[87] = 38 ^ 96;
        llllIIIIl[88] = 93 ^ 26;
        llllIIIIl[89] = 242 ^ 186;
        llllIIIIl[90] = (3 ^ 58) ^ (82 ^ 34);
        llllIIIIl[91] = (-30725) & 32549;
        llllIIIIl[92] = (-" ".length()) & (-20625) & 24314;
        llllIIIIl[93] = (-((-771) & 29619)) & (-1) & 30655;
        llllIIIIl[94] = (-((-2189) & 30941)) & (-289) & 32766;
        llllIIIIl[95] = (-((-21133) & 31693)) & (-16385) & 28663;
        llllIIIIl[96] = (-((-16415) & 24959)) & (-16387) & 28655;
        llllIIIIl[97] = (-14513) & 16063;
        llllIIIIl[98] = (-((-14441) & 14715)) & (-20545) & 24567;
        llllIIIIl[99] = (-((-1161) & 29835)) & (-2050) & 32243;
        llllIIIIl[100] = (-((-2181) & 14549)) & (-16681) & 32639;
        llllIIIIl[101] = (-((-2574) & 14879)) & (-257) & 14335;
        llllIIIIl[102] = (-((-17410) & 30189)) & (-1) & 16367;
        llllIIIIl[103] = (-((-4961) & 29543)) & (-6210) & 32503;
        llllIIIIl[104] = (-((-325) & 29141)) & (-1) & 32699;
        llllIIIIl[105] = (223 ^ 170) ^ (139 ^ 180);
        llllIIIIl[106] = (((113 + 172) - 188) + 98) ^ (((96 + 90) - 109) + 59);
        llllIIIIl[107] = 245 ^ 185;
        llllIIIIl[108] = (((35 + 16) - 3) + 79) ^ (42 ^ 24);
        llllIIIIl[109] = 238 ^ 160;
        llllIIIIl[110] = (((72 + 19) - 87) + 132) ^ (((174 + 196) - 258) + 87);
        llllIIIIl[111] = 43 ^ 123;
        llllIIIIl[112] = (2 ^ 95) ^ (180 ^ 184);
        llllIIIIl[113] = 203 ^ 153;
        llllIIIIl[114] = (((48 + 79) - 116) + 212) ^ (((13 + 92) - 22) + 57);
        llllIIIIl[115] = (18 ^ 27) ^ (20 ^ 73);
        llllIIIIl[116] = (((18 + 87) - (-4)) + 18) ^ (67 ^ 105);
        llllIIIIl[117] = (((93 + 180) - 104) + 69) ^ (((0 + 50) - (-118)) + 16);
        llllIIIIl[118] = 199 ^ 144;
        llllIIIIl[119] = 41 ^ 113;
        llllIIIIl[120] = (((132 + 55) - 72) + 120) ^ (((105 + 108) - 36) + 1);
        llllIIIIl[121] = 154 ^ 192;
        llllIIIIl[122] = 223 ^ 132;
        llllIIIIl[123] = 218 ^ 134;
        llllIIIIl[124] = (124 ^ 29) ^ (166 ^ 154);
        llllIIIIl[125] = (248 ^ 137) ^ (176 ^ 159);
    }

    private static boolean llIIllIlIlll(int i) {
        return i != 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bc();
            "".length();
            if ("   ".length() < 0) {
                return (148 ^ 144) & ((172 ^ 168) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llllIIIIl[77];
    }

    private static boolean llIIlllIIIII(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llllIIIIl[1];
    }

    private static boolean llIIllIlllII(Object obj) {
        return obj != null;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIllllI[llllIIIIl[78]];
    }

    static {
        llIIllIlIllI();
        llIIllIlIlIl();
        bx = new ArrayList();
        dy = llllIIIIl[1];
        dz = new WorldPoint(llllIIIIl[91], llllIIIIl[92], llllIIIIl[1]);
        dA = new WorldPoint(llllIIIIl[93], llllIIIIl[94], llllIIIIl[1]);
        dB = new WorldPoint(llllIIIIl[95], llllIIIIl[96], llllIIIIl[1]);
        dC = new WorldPoint(llllIIIIl[97], llllIIIIl[98], llllIIIIl[1]);
        dD = new WorldPoint(llllIIIIl[99], llllIIIIl[100], llllIIIIl[1]);
        dE = new WorldPoint(llllIIIIl[101], llllIIIIl[102], llllIIIIl[1]);
        dF = new WorldPoint(llllIIIIl[103], llllIIIIl[104], llllIIIIl[1]);
        String[] strArr = new String[llllIIIIl[33]];
        strArr[llllIIIIl[1]] = lllIllllI[llllIIIIl[105]];
        strArr[llllIIIIl[0]] = lllIllllI[llllIIIIl[106]];
        strArr[llllIIIIl[5]] = lllIllllI[llllIIIIl[107]];
        strArr[llllIIIIl[10]] = lllIllllI[llllIIIIl[108]];
        strArr[llllIIIIl[6]] = lllIllllI[llllIIIIl[109]];
        strArr[llllIIIIl[13]] = lllIllllI[llllIIIIl[110]];
        strArr[llllIIIIl[17]] = lllIllllI[llllIIIIl[111]];
        strArr[llllIIIIl[18]] = lllIllllI[llllIIIIl[112]];
        strArr[llllIIIIl[2]] = lllIllllI[llllIIIIl[113]];
        strArr[llllIIIIl[24]] = lllIllllI[llllIIIIl[114]];
        strArr[llllIIIIl[12]] = lllIllllI[llllIIIIl[115]];
        strArr[llllIIIIl[25]] = lllIllllI[llllIIIIl[116]];
        strArr[llllIIIIl[15]] = lllIllllI[llllIIIIl[117]];
        strArr[llllIIIIl[26]] = lllIllllI[llllIIIIl[118]];
        strArr[llllIIIIl[27]] = lllIllllI[llllIIIIl[119]];
        strArr[llllIIIIl[28]] = lllIllllI[llllIIIIl[120]];
        strArr[llllIIIIl[29]] = lllIllllI[llllIIIIl[121]];
        strArr[llllIIIIl[30]] = lllIllllI[llllIIIIl[122]];
        strArr[llllIIIIl[31]] = lllIllllI[llllIIIIl[123]];
        strArr[llllIIIIl[32]] = lllIllllI[llllIIIIl[124]];
        cG = strArr;
    }

    private static void Q() {
        int[] iArr = new int[llllIIIIl[0]];
        iArr[llllIIIIl[1]] = llllIIIIl[9];
        if (llIIllIllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(llllIIIIl[9], llllIIIIl[12], llllIIIIl[74]));
            "".length();
        }
        int[] iArr2 = new int[llllIIIIl[0]];
        iArr2[llllIIIIl[1]] = llllIIIIl[11];
        if (llIIllIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llllIIIIl[11], llllIIIIl[13], C0009j.ch));
            "".length();
        }
        if (llIIllIllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIllllI[llllIIIIl[80]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(llllIIIIl[75], llllIIIIl[13], llllIIIIl[76]));
            "".length();
        }
        int[] iArr3 = new int[llllIIIIl[0]];
        iArr3[llllIIIIl[1]] = llllIIIIl[7];
        if (llIIllIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llllIIIIl[7], llllIIIIl[53], llllIIIIl[74]));
            "".length();
        }
        int[] iArr4 = new int[llllIIIIl[0]];
        iArr4[llllIIIIl[1]] = llllIIIIl[8];
        if (llIIllIllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llllIIIIl[8], llllIIIIl[12], llllIIIIl[74]));
            "".length();
        }
    }

    private static boolean llIIllIlllIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIllIllIlI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[24])) {
            String[] strArr = new String[llllIIIIl[0]];
            strArr[llllIIIIl[1]] = lllIllllI[llllIIIIl[79]];
            if (llIIllIllIIl(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = llllIIIIl[0];
                "".length();
                return " ".length() >= "   ".length() ? ((15 ^ 123) ^ (43 ^ 109)) & (((((35 + 6) - 22) + 118) ^ (((172 + 0) - 36) + 51)) ^ (-" ".length())) : r0;
            }
        }
        return llllIIIIl[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (llIIllIlIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L290;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v500, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v502, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v504, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v506, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v508, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v613, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v640, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v90, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bc() {
        if (llIIllIlIlll(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (llIIllIllIII(bx.size(), llllIIIIl[0])) {
                System.out.println(lllIllllI[llllIIIIl[1]]);
                bv = llllIIIIl[1];
            }
        }
        if (llIIllIllIIl(bv ? 1 : 0)) {
            if (llIIllIllIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) {
                int[] iArr = new int[llllIIIIl[0]];
                iArr[llllIIIIl[1]] = llllIIIIl[3];
            }
            aa.dQ();
            if (llIIllIllIIl(an() ? 1 : 0) && llIIllIllIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0]) && llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) {
                int[] iArr2 = new int[llllIIIIl[0]];
                iArr2[llllIIIIl[1]] = llllIIIIl[3];
                if (llIIllIllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (llIIllIlllII(nearest) && llIIllIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[0]];
                        C0000a.a(nearest);
                    }
                    if (llIIllIlllII(nearest) && llIIllIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIIllIllIIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llllIIIIl[4]);
                            "".length();
                        }
                        if (llIIllIlIlll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[5]];
                            if (llIIllIlllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llllIIIIl[6]);
                                "".length();
                            }
                            if (llIIllIlllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llllIIIIl[5]);
                                "".length();
                            }
                            int[] iArr3 = new int[llllIIIIl[6]];
                            iArr3[llllIIIIl[1]] = llllIIIIl[7];
                            iArr3[llllIIIIl[0]] = llllIIIIl[8];
                            iArr3[llllIIIIl[5]] = llllIIIIl[9];
                            iArr3[llllIIIIl[10]] = llllIIIIl[11];
                            if (llIIllIllIIl(C0004e.d(iArr3) ? 1 : 0)) {
                                Q();
                                System.out.println(lllIllllI[llllIIIIl[10]]);
                                bv = llllIIIIl[0];
                                return;
                            }
                            int[] iArr4 = new int[llllIIIIl[6]];
                            iArr4[llllIIIIl[1]] = llllIIIIl[7];
                            iArr4[llllIIIIl[0]] = llllIIIIl[8];
                            iArr4[llllIIIIl[5]] = llllIIIIl[9];
                            iArr4[llllIIIIl[10]] = llllIIIIl[11];
                            if (llIIllIlIlll(C0004e.d(iArr4) ? 1 : 0)) {
                                C0000a.a(llllIIIIl[7], llllIIIIl[12]);
                                C0000a.a(llllIIIIl[8], llllIIIIl[12]);
                                C0000a.a(llllIIIIl[9], llllIIIIl[0]);
                                C0000a.a(llllIIIIl[11], llllIIIIl[13]);
                                C0000a.a(llllIIIIl[14], llllIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] iArr5 = new int[llllIIIIl[0]];
            iArr5[llllIIIIl[1]] = llllIIIIl[14];
            if (llIIllIlIlll(Inventory.contains(iArr5) ? 1 : 0) && llIIllIllIlI(Combat.getMissingHealth(), llllIIIIl[15])) {
                int[] iArr6 = new int[llllIIIIl[0]];
                iArr6[llllIIIIl[1]] = llllIIIIl[14];
                Inventory.getFirst(iArr6).interact(lllIllllI[llllIIIIl[6]]);
                Time.sleepTicks(llllIIIIl[5]);
                "".length();
            }
            if (llIIllIlIlll(Inventory.contains(C0005f.bc) ? 1 : 0) && llIIllIllIII(Movement.getRunEnergy(), llllIIIIl[16])) {
                Inventory.getFirst(C0005f.bc).interact(lllIllllI[llllIIIIl[13]]);
                Time.sleepTicks(llllIIIIl[0]);
                "".length();
            }
            if (llIIllIllIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0]) && llIIllIlIlll(an() ? 1 : 0) && llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) {
                int[] iArr7 = new int[llllIIIIl[0]];
                iArr7[llllIIIIl[1]] = llllIIIIl[3];
                if (llIIllIllIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (llIIllIllIIl(Players.getLocal().getWorldLocation().equals(dz) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[17]];
                        if (llIIllIlIlll(Dialog.isOpen() ? 1 : 0) && llIIllIllIII(dy, llllIIIIl[5])) {
                            Dialog.close();
                            dy += llllIIIIl[0];
                        }
                        C0004e.a(dz);
                    }
                    if (llIIllIlIlll(Players.getLocal().getWorldLocation().equals(dz) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[18]];
                        C0006g.a(lllIllllI[llllIIIIl[2]], cG);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit(llllIIIIl[19]));
            System.out.println("5621: " + Vars.getBit(llllIIIIl[20]));
            System.out.println("5622: " + Vars.getBit(llllIIIIl[21]));
            System.out.println("5623: " + Vars.getBit(llllIIIIl[22]));
            System.out.println("5624: " + Vars.getBit(llllIIIIl[23]));
            if (llIIllIllIll(Vars.getBit(llllIIIIl[19]), llllIIIIl[0])) {
                dt = llllIIIIl[0];
            }
            if (llIIllIllIll(Vars.getBit(llllIIIIl[20]), llllIIIIl[0])) {
                du = llllIIIIl[0];
            }
            if (llIIllIllIll(Vars.getBit(llllIIIIl[21]), llllIIIIl[0])) {
                dv = llllIIIIl[0];
            }
            if (llIIllIllIll(Vars.getBit(llllIIIIl[22]), llllIIIIl[0])) {
                dw = llllIIIIl[0];
            }
            if (llIIllIllIll(Vars.getBit(llllIIIIl[23]), llllIIIIl[0])) {
                dx = llllIIIIl[0];
            }
            if (llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0])) {
                dk = llllIIIIl[1];
                if (llIIllIllIIl(dt ? 1 : 0)) {
                    String[] strArr = new String[llllIIIIl[0]];
                    strArr[llllIIIIl[1]] = lllIllllI[llllIIIIl[24]];
                    if (llIIllIlIlll(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[llllIIIIl[0]];
                        strArr2[llllIIIIl[1]] = lllIllllI[llllIIIIl[12]];
                        if (llIIllIlIlll(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[llllIIIIl[0]];
                            strArr3[llllIIIIl[1]] = lllIllllI[llllIIIIl[25]];
                            if (llIIllIllIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                                String[] strArr4 = new String[llllIIIIl[0]];
                                strArr4[llllIIIIl[1]] = lllIllllI[llllIIIIl[15]];
                                Item first = Inventory.getFirst(strArr4);
                                String[] strArr5 = new String[llllIIIIl[0]];
                                strArr5[llllIIIIl[1]] = lllIllllI[llllIIIIl[26]];
                                first.useOn(Inventory.getFirst(strArr5));
                                Time.sleepTicks(llllIIIIl[5]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr6 = new String[llllIIIIl[0]];
                    strArr6[llllIIIIl[1]] = lllIllllI[llllIIIIl[27]];
                    if (llIIllIlIlll(Inventory.contains(strArr6) ? 1 : 0)) {
                        if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dA), llllIIIIl[2])) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[28]];
                            Movement.walkTo(dA);
                            "".length();
                            Time.sleepTicks(llllIIIIl[0]);
                            "".length();
                        }
                        if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dA), llllIIIIl[2])) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[29]];
                            C0006g.a(lllIllllI[llllIIIIl[30]], cG, llllIIIIl[0]);
                            Time.sleepTicks(llllIIIIl[0]);
                            "".length();
                            List options = Dialog.getOptions();
                            ArrayList arrayList = new ArrayList();
                            if (llIIllIllIIl(options.isEmpty() ? 1 : 0)) {
                                int i = llllIIIIl[1];
                                while (llIIllIllIII(i, options.size())) {
                                    arrayList.add(((Widget) options.get(i)).getText());
                                    "".length();
                                    i++;
                                    "".length();
                                    if ((true ^ true) & ((true ^ true) ^ true)) {
                                        return;
                                    }
                                }
                                boolean anyMatch = arrayList.stream().anyMatch(str -> {
                                    return str.equalsIgnoreCase(lllIllllI[llllIIIIl[90]]);
                                });
                                boolean noneMatch = arrayList.stream().noneMatch(str2 -> {
                                    return str2.equalsIgnoreCase(lllIllllI[llllIIIIl[89]]);
                                });
                                if (llIIllIlIlll(anyMatch ? 1 : 0) && llIIllIlIlll(noneMatch ? 1 : 0)) {
                                    System.out.println(lllIllllI[llllIIIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (llIIllIllIIl(du ? 1 : 0) && llIIllIlIlll(dt ? 1 : 0)) {
                    if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[32]];
                        Movement.walkTo(dB);
                        "".length();
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                    }
                    if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[33]];
                        C0006g.a(lllIllllI[llllIIIIl[34]], cG, llllIIIIl[0]);
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                        List options2 = Dialog.getOptions();
                        ArrayList arrayList2 = new ArrayList();
                        if (llIIllIllIIl(options2.isEmpty() ? 1 : 0)) {
                            int i2 = llllIIIIl[1];
                            while (llIIllIllIII(i2, options2.size())) {
                                arrayList2.add(((Widget) options2.get(i2)).getText());
                                "".length();
                                i2++;
                                "".length();
                                if ((((144 ^ 181) ^ (86 ^ 62)) & (((((16 + 200) - 84) + 115) ^ (((151 + 35) - 50) + 50)) ^ (-" ".length()))) != 0) {
                                    return;
                                }
                            }
                            boolean anyMatch2 = arrayList2.stream().anyMatch(str3 -> {
                                return str3.equalsIgnoreCase(lllIllllI[llllIIIIl[88]]);
                            });
                            boolean noneMatch2 = arrayList2.stream().noneMatch(str4 -> {
                                return str4.equalsIgnoreCase(lllIllllI[llllIIIIl[87]]);
                            });
                            if (llIIllIlIlll(anyMatch2 ? 1 : 0) && llIIllIlIlll(noneMatch2 ? 1 : 0)) {
                                System.out.println(lllIllllI[llllIIIIl[35]]);
                            }
                        }
                    }
                }
                if (llIIllIllIIl(dv ? 1 : 0) && llIIllIlIlll(du ? 1 : 0) && llIIllIlIlll(dt ? 1 : 0)) {
                    if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[36]];
                        Movement.walkTo(dC);
                        "".length();
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                    }
                    if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[37]];
                        C0006g.a(lllIllllI[llllIIIIl[38]], cG, llllIIIIl[0]);
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                        List options3 = Dialog.getOptions();
                        ArrayList arrayList3 = new ArrayList();
                        if (llIIllIllIIl(options3.isEmpty() ? 1 : 0)) {
                            int i3 = llllIIIIl[1];
                            while (llIIllIllIII(i3, options3.size())) {
                                arrayList3.add(((Widget) options3.get(i3)).getText());
                                "".length();
                                i3++;
                                "".length();
                                if (" ".length() == 0) {
                                    return;
                                }
                            }
                            boolean anyMatch3 = arrayList3.stream().anyMatch(str5 -> {
                                return str5.equalsIgnoreCase(lllIllllI[llllIIIIl[86]]);
                            });
                            boolean noneMatch3 = arrayList3.stream().noneMatch(str6 -> {
                                return str6.equalsIgnoreCase(lllIllllI[llllIIIIl[85]]);
                            });
                            if (llIIllIlIlll(anyMatch3 ? 1 : 0) && llIIllIlIlll(noneMatch3 ? 1 : 0)) {
                                System.out.println(lllIllllI[llllIIIIl[39]]);
                            }
                        }
                    }
                }
                if (llIIllIllIIl(dw ? 1 : 0) && llIIllIlIlll(dv ? 1 : 0) && llIIllIlIlll(du ? 1 : 0) && llIIllIlIlll(dt ? 1 : 0)) {
                    if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[40]];
                        Movement.walkTo(dD);
                        "".length();
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                    }
                    if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[41]];
                        C0006g.a(lllIllllI[llllIIIIl[42]], cG, llllIIIIl[0]);
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                        List options4 = Dialog.getOptions();
                        ArrayList arrayList4 = new ArrayList();
                        if (llIIllIllIIl(options4.isEmpty() ? 1 : 0)) {
                            int i4 = llllIIIIl[1];
                            while (llIIllIllIII(i4, options4.size())) {
                                arrayList4.add(((Widget) options4.get(i4)).getText());
                                "".length();
                                i4++;
                                "".length();
                                if ((((70 ^ 39) ^ (121 ^ 33)) & (((170 ^ 196) ^ (92 ^ 11)) ^ (-" ".length()))) >= " ".length()) {
                                    return;
                                }
                            }
                            boolean anyMatch4 = arrayList4.stream().anyMatch(str7 -> {
                                return str7.equalsIgnoreCase(lllIllllI[llllIIIIl[84]]);
                            });
                            boolean noneMatch4 = arrayList4.stream().noneMatch(str8 -> {
                                return str8.equalsIgnoreCase(lllIllllI[llllIIIIl[83]]);
                            });
                            if (llIIllIlIlll(anyMatch4 ? 1 : 0) && llIIllIlIlll(noneMatch4 ? 1 : 0)) {
                                System.out.println(lllIllllI[llllIIIIl[43]]);
                            }
                        }
                    }
                }
                if (llIIllIllIIl(dx ? 1 : 0) && llIIllIlIlll(dw ? 1 : 0) && llIIllIlIlll(dv ? 1 : 0) && llIIllIlIlll(du ? 1 : 0) && llIIllIlIlll(dt ? 1 : 0)) {
                    if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[44]];
                        Movement.walkTo(dE);
                        "".length();
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                    }
                    if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[45]];
                        C0006g.a(lllIllllI[llllIIIIl[46]], cG, llllIIIIl[0]);
                        Time.sleepTicks(llllIIIIl[0]);
                        "".length();
                        List options5 = Dialog.getOptions();
                        ArrayList arrayList5 = new ArrayList();
                        if (llIIllIllIIl(options5.isEmpty() ? 1 : 0)) {
                            int i5 = llllIIIIl[1];
                            while (llIIllIllIII(i5, options5.size())) {
                                arrayList5.add(((Widget) options5.get(i5)).getText());
                                "".length();
                                i5++;
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            }
                            boolean anyMatch5 = arrayList5.stream().anyMatch(str9 -> {
                                return str9.equalsIgnoreCase(lllIllllI[llllIIIIl[16]]);
                            });
                            boolean anyMatch6 = arrayList5.stream().anyMatch(str10 -> {
                                return str10.contains(lllIllllI[llllIIIIl[82]]);
                            });
                            boolean noneMatch5 = arrayList5.stream().noneMatch(str11 -> {
                                return str11.equalsIgnoreCase(lllIllllI[llllIIIIl[81]]);
                            });
                            if ((!llIIllIllIIl(anyMatch5 ? 1 : 0) || llIIllIlIlll(anyMatch6 ? 1 : 0)) && llIIllIlIlll(noneMatch5 ? 1 : 0)) {
                                System.out.println(lllIllllI[llllIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[5])) {
                if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[48]];
                    if (llIIllIlIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0004e.a(dz);
                }
                if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[49]];
                    C0006g.a(lllIllllI[llllIIIIl[50]], cG);
                }
            }
            if (!llIIlllIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[10]) || llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[17])) {
                C0006g.a(cG);
            }
            if (llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[6])) {
                if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIIl[6])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[51]];
                    Movement.walkTo(dF);
                    "".length();
                    Time.sleepTicks(llllIIIIl[0]);
                    "".length();
                }
                if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIIl[6])) {
                    String[] strArr7 = new String[llllIIIIl[0]];
                    strArr7[llllIIIIl[1]] = lllIllllI[llllIIIIl[52]];
                    if (llIIllIlIlll(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[llllIIIIl[0]];
                        strArr8[llllIIIIl[1]] = lllIllllI[llllIIIIl[53]];
                        Inventory.getFirst(strArr8).interact(lllIllllI[llllIIIIl[54]]);
                        Time.sleepTicks(llllIIIIl[10]);
                        "".length();
                    }
                }
            }
            if (llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[13])) {
                if (llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[55]];
                    C0004e.a(dz);
                }
                if (llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[56]];
                    C0006g.a(lllIllllI[llllIIIIl[57]], cG);
                }
            }
            if (!llIIlllIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[18]) || llIIllIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[2])) {
                if (llIIllIllIII(dk, llllIIIIl[0])) {
                    as.pi += llllIIIIl[0];
                    as.u(AccBuilderGWD.m);
                    dk += llllIIIIl[0];
                    as.pi = llllIIIIl[1];
                    dl = llllIIIIl[1];
                }
                String[] strArr9 = new String[llllIIIIl[0]];
                strArr9[llllIIIIl[1]] = lllIllllI[llllIIIIl[58]];
                if (llIIllIlIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                    if (llIIllIlllII(Widgets.get(llllIIIIl[59]))) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[60]];
                        String[] strArr10 = new String[llllIIIIl[0]];
                        strArr10[llllIIIIl[1]] = lllIllllI[llllIIIIl[61]];
                        Inventory.getFirst(strArr10).interact(lllIllllI[llllIIIIl[62]]);
                        Time.sleepTicks(llllIIIIl[6]);
                        "".length();
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[63]];
                        Widget widget = Widgets.get(llllIIIIl[59], llllIIIIl[27]);
                        if (llIIllIlllII(widget)) {
                            widget.interact(lllIllllI[llllIIIIl[64]]);
                            Time.sleepTicks(llllIIIIl[0]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(llllIIIIl[59], llllIIIIl[39]);
                        if (llIIllIlllII(widget2)) {
                            widget2.interact(lllIllllI[llllIIIIl[65]]);
                            Time.sleepTicks(llllIIIIl[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks(llllIIIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static void llIIllIlIlIl() {
        lllIllllI = new String[llllIIIIl[125]];
        lllIllllI[llllIIIIl[1]] = llIIllIIIIIl("DrC5yYdngDl8nm6rt/fyKSeNYLAvMAIFK0TqLMROK0l7gkZg6pOLrnOnU8xmz640", "DwSXw");
        lllIllllI[llllIIIIl[0]] = llIIllIIIIlI("LDY1WRUNdyEYDwk=", "bWCya");
        lllIllllI[llllIIIIl[5]] = llIIllIIIIIl("7+M293NWRn1BKInxdIZZ4jcsMpXjr3Mr", "lAEgK");
        lllIllllI[llllIIIIl[10]] = llIIllIIIIIl("hpRuAYfsErVv4+sZhsWLCRSeQ8h7MNq7Xq/9H5hqj9nnBVpQosHJwnhIQx20pGy/Ufloc7h9qDQ=", "uDnlB");
        lllIllllI[llllIIIIl[6]] = llIIllIIIIIl("H6AIDbzI08A=", "LIONs");
        lllIllllI[llllIIIIl[13]] = llIIllIIIIIl("BSPrATzxd2M=", "miDPD");
        lllIllllI[llllIIIIl[17]] = llIIllIIIIll("aW69znQVb1BRaVGX+YT3Nw==", "oAsYj");
        lllIllllI[llllIIIIl[18]] = llIIllIIIIlI("HB4lPCYmBCNuIzoPNzo=", "OjDNR");
        lllIllllI[llllIIIIl[2]] = llIIllIIIIIl("M+dQSmjn9ow=", "EYBzB");
        lllIllllI[llllIIIIl[24]] = llIIllIIIIll("xCQiUE5/ML57Ad0mzv31Hku3otWXCBxA", "xHCrz");
        lllIllllI[llllIIIIl[12]] = llIIllIIIIlI("LQMwICYOFA==", "kfQTN");
        lllIllllI[llllIIIIl[25]] = llIIllIIIIll("1i1ryCbwgS6/xVXbRn/6fg==", "NbyMP");
        lllIllllI[llllIIIIl[15]] = llIIllIIIIlI("EQ8XOCU6FRE0ZCcCBj8oOA==", "TatPD");
        lllIllllI[llllIIIIl[26]] = llIIllIIIIlI("PhYwLB4dAQ==", "xsQXv");
        lllIllllI[llllIIIIl[27]] = llIIllIIIIll("cLQMYFczA3bWRLCB2Hxb3A==", "pjvQW");
        lllIllllI[llllIIIIl[28]] = llIIllIIIIll("oRRFqMnx5prZjWvONUsYCITfR2bgsmpC", "elPNu");
        lllIllllI[llllIIIIl[29]] = llIIllIIIIIl("VKKWqi37/pOP/vm1vqioTQ==", "FzArV");
        lllIllllI[llllIIIIl[30]] = llIIllIIIIIl("UADH9UJEglE=", "lqujP");
        lllIllllI[llllIIIIl[31]] = llIIllIIIIll("yeqdZjIMqPNwVgOXFfubCg==", "cvnEx");
        lllIllllI[llllIIIIl[32]] = llIIllIIIIll("l8QKkB0rtSTMDd5J90SZ9w==", "gFopb");
        lllIllllI[llllIIIIl[33]] = llIIllIIIIlI("HgotMi0kDGE4Nik=", "JkAYD");
        lllIllllI[llllIIIIl[34]] = llIIllIIIIll("jdVOxLs+Jrw=", "PjPir");
        lllIllllI[llllIIIIl[35]] = llIIllIIIIll("g3hDJz/vtDK7hiDqZeQjnQ==", "kVJDW");
        lllIllllI[llllIIIIl[36]] = llIIllIIIIlI("GAYsRBc5RzYLFTdHLg0PMw==", "VgZdc");
        lllIllllI[llllIIIIl[37]] = llIIllIIIIlI("Ag0aKQA4C1YuBiAN", "VlvBi");
        lllIllllI[llllIIIIl[38]] = llIIllIIIIll("iuarTfpM7pk=", "SZToG");
        lllIllllI[llllIIIIl[39]] = llIIllIIIIlI("Ijs+BhAMNzRPDhE8JBY=", "dRPoc");
        lllIllllI[llllIIIIl[40]] = llIIllIIIIlI("GhUOUBg7VAsYFS4dHR5MIB0UFQ==", "Ttxpl");
        lllIllllI[llllIIIIl[41]] = llIIllIIIIlI("HjQIEw4kMkQLDzMvDR0J", "JUdxg");
        lllIllllI[llllIIIIl[42]] = llIIllIIIIIl("3HeZmpfvCA2l1HGJDYLpRA==", "TeVSM");
        lllIllllI[llllIIIIl[43]] = llIIllIIIIll("Y3BJQs4Kdtkjc55d2VSjwUln/FTGIJTQ", "qisgO");
        lllIllllI[llllIIIIl[44]] = llIIllIIIIll("SbYHdMhx7BZyOgWMNN/9Idh5Kf1a5v9g", "fegQI");
        lllIllllI[llllIIIIl[45]] = llIIllIIIIll("r2OM2r4CXr2JGBjUdle1Nvl2zzaSE8ko", "EdSIO");
        lllIllllI[llllIIIIl[46]] = llIIllIIIIlI("MSIwBQcc", "yMBdd");
        lllIllllI[llllIIIIl[47]] = llIIllIIIIlI("KSwXGxYHIB1SDQA2EBYMGjY=", "oEyre");
        lllIllllI[llllIIIIl[48]] = llIIllIIIIlI("IAA+eT0BQTstKBwV", "naHYI");
        lllIllllI[llllIIIIl[49]] = llIIllIIIIIl("FfpFHjPwN23xMTSwSzAOyg==", "YNyxt");
        lllIllllI[llllIIIIl[50]] = llIIllIIIIll("5vp1SA/Usxk=", "ceEuk");
        lllIllllI[llllIIIIl[51]] = llIIllIIIIll("OhUssx3LM1X87lscWe6qlb0uU2yM0v/A", "iKJmy");
        lllIllllI[llllIIIIl[52]] = llIIllIIIIlI("Jx8qHDYYDzYdIEoJKwo=", "jfYhS");
        lllIllllI[llllIIIIl[53]] = llIIllIIIIIl("OYsuposA143gSftCINgwXA==", "qBUwm");
        lllIllllI[llllIIIIl[54]] = llIIllIIIIlI("GSgzBBM5PyI=", "XKGme");
        lllIllllI[llllIIIIl[55]] = llIIllIIIIll("z1lE3zf71fkheEzkhfAcuQ==", "EsUcU");
        lllIllllI[llllIIIIl[56]] = llIIllIIIIll("LeRDyufmwIj/zVl12x27qw==", "AbUWQ");
        lllIllllI[llllIIIIl[57]] = llIIllIIIIIl("4tfYpKeQ2Ms=", "ylHOp");
        lllIllllI[llllIIIIl[58]] = llIIllIIIIlI("LSUjDjIZLncLIgE7", "lKWgC");
        lllIllllI[llllIIIIl[60]] = llIIllIIIIll("iN2gOValjPGLsByZGXTAjQ==", "upoYV");
        lllIllllI[llllIIIIl[61]] = llIIllIIIIIl("avYIcbB56jabNtNxlRafDg==", "NbAqU");
        lllIllllI[llllIIIIl[62]] = llIIllIIIIlI("JTIK", "wGhHz");
        lllIllllI[llllIIIIl[63]] = llIIllIIIIlI("Ni89HyARIz8dYxYmMAMmFw==", "eJQzC");
        lllIllllI[llllIIIIl[64]] = llIIllIIIIIl("iNLt4xKcb2A=", "pgVsw");
        lllIllllI[llllIIIIl[65]] = llIIllIIIIlI("FyMfNTMmIQ==", "TLqSZ");
        lllIllllI[llllIIIIl[66]] = llIIllIIIIIl("wHc//tfdJ47nbEtvRiJhFg==", "jkHPg");
        lllIllllI[llllIIIIl[67]] = llIIllIIIIlI("ABQyFx88BnAZFz8R", "RaPuv");
        lllIllllI[llllIIIIl[68]] = llIIllIIIIlI("AC0YBTQ0JkwAJCwz", "ACllE");
        lllIllllI[llllIIIIl[69]] = llIIllIIIIIl("d7TLOQJn/qs=", "wGvnB");
        lllIllllI[llllIIIIl[70]] = llIIllIIIIlI("AhI/Mg8lHj0wTCIbMi4JIw==", "QwSWl");
        lllIllllI[llllIIIIl[71]] = llIIllIIIIIl("ZDdXWNShwOc=", "zXSRB");
        lllIllllI[llllIIIIl[72]] = llIIllIIIIIl("Lh45IVkPKnM=", "pdirI");
        lllIllllI[llllIIIIl[73]] = llIIllIIIIlI("AwQyBzggEw==", "EaSsP");
        lllIllllI[llllIIIIl[78]] = llIIllIIIIIl("tbKdQWaOyYdibXqY/lM+v8/RYtvIlut1", "ETvjJ");
        lllIllllI[llllIIIIl[79]] = llIIllIIIIlI("FDwkPSMgN3A4Mzgi", "URPTR");
        lllIllllI[llllIIIIl[80]] = llIIllIIIIlI("HQA7Jm8AD3U2Kg4FISlvRw==", "oiUAO");
        lllIllllI[llllIIIIl[81]] = llIIllIIIIIl("WB5J+glUhocKkXfGnBNKKnvQFr19Bbw/L2T8ueaU96Y=", "wtSnz");
        lllIllllI[llllIIIIl[82]] = llIIllIIIIlI("AgQEbjdOFQIoIAtP", "napID");
        lllIllllI[llllIIIIl[16]] = llIIllIIIIIl("wScr5Xy9yFuTXbTfRG5UPQ==", "vBblZ");
        lllIllllI[llllIIIIl[83]] = llIIllIIIIlI("Fw4cSB10DgEDdC0AB0g1NgAHHHQHBxMRLj0KHFc=", "TorhT");
        lllIllllI[llllIIIIl[84]] = llIIllIIIIll("u+F6BEFxR/hZ8bOFr2IcWg==", "sbYko");
        lllIllllI[llllIIIIl[85]] = llIIllIIIIll("zzT2c+1qmP0/6Fzsf1CpK8OoXHEbG+6Aj2Qu/NyLXT4=", "UuEIL");
        lllIllllI[llllIIIIl[86]] = llIIllIIIIlI("BR0YcT9pDB43KCxW", "IxlVL");
        lllIllllI[llllIIIIl[87]] = llIIllIIIIll("aDrufboXCKZIdmKgJTb75ghw3SwMJP2sPgO28G+jz88=", "pZyQw");
        lllIllllI[llllIIIIl[88]] = llIIllIIIIlI("Ik8CBQJMG0YECQ4LRgsCEhsOAwIMQQ==", "kofjl");
        lllIllllI[llllIIIIl[89]] = llIIllIIIIIl("35oWEVcJdI4Mv+OnAMJEi4ejNQ3OOESmEEE+zt/vb7VFsBRYUmmbTA==", "Wbvis");
        lllIllllI[llllIIIIl[90]] = llIIllIIIIIl("CJxrko3eZwXWg7wbJ1x+rnVr2S60rIQDIPL1iT1NOdmWKObNbGG1eg==", "UJxoj");
        lllIllllI[llllIIIIl[105]] = llIIllIIIIIl("qMMn8FwFVlByjy40kd2v2LRB48fjo89g73wm9FthPSI=", "lvzGh");
        lllIllllI[llllIIIIl[106]] = llIIllIIIIll("XchvfDHW5TA=", "jyZWJ");
        lllIllllI[llllIIIIl[107]] = llIIllIIIIIl("03Cu5KcWRyE=", "hVbpJ");
        lllIllllI[llllIIIIl[108]] = llIIllIIIIlI("Nws7cAVUCyY7bA0FIHAtFgUgJGwkBSckbCQDJjMtBgM5OTkHVQ==", "tjUPL");
        lllIllllI[llllIIIIl[109]] = llIIllIIIIlI("OwkSciMEDh4+NEwoSzUxBQ9LNDEaDh4gcBsIHzpwPA4ZJnA8CBgxMR4IBzslH14=", "lakRP");
        lllIllllI[llllIIIIl[110]] = llIIllIIIIlI("DTg/eCFuOCIzSDc2JHgJLDYkLEgeNiMsSA8rMj0dOypu", "NYQXh");
        lllIllllI[llllIIIIl[111]] = llIIllIIIIlI("JTY6WApGNicTYx84IVgiBDghDGMnJTcdNhMkaw==", "fWTxC");
        lllIllllI[llllIIIIl[112]] = llIIllIIIIlI("FiIPYh0pJQMuCmEDViUPKCRWJA83JQMwTjYjAipOADgVJxs0OUk=", "AJvBn");
        lllIllllI[llllIIIIl[113]] = llIIllIIIIlI("BAIeZhhnAgMtcT4MBWYwJQwFMnELDAYnOiINFyxu", "GcpFQ");
        lllIllllI[llllIIIIl[114]] = llIIllIIIIll("8J/jxGF3nmqTbOz4YegaJM5yqXmDvjS45BWMROGQtxMmomLkgRqgjUYb9JmNeuYx", "bBTJI");
        lllIllllI[llllIIIIl[115]] = llIIllIIIIlI("Ni0/ehxVLSIxdQwjJHo0FyMkLnUmJDAjLxwpP2U=", "uLQZU");
        lllIllllI[llllIIIIl[116]] = llIIllIIIIlI("Jy0vRBIYKiMIBVAMdgMAGSt2AgAGKiMWQQcsIgxBIy03HRsZIDhb", "pEVda");
        lllIllllI[llllIIIIl[117]] = llIIllIIIIIl("a6DgoCT/vXsNMSXmAOokJIonAulEeKOE/XunINNFcqM=", "QdhJr");
        lllIllllI[llllIIIIl[118]] = llIIllIIIIll("yGlhMKBRYMioodMooAigp+REW9TLVU8ZLv/Ts5ziTszJ0HHPJeZbQw==", "gQSUW");
        lllIllllI[llllIIIIl[119]] = llIIllIIIIll("b5mEi/8VmhhoUkIe9PsFr+Qx4+YrXJdKe+YxyUidvJqadXB84rkzqQdi20GDlrJZ", "ooiVZ");
        lllIllllI[llllIIIIl[120]] = llIIllIIIIll("nosShX1Ms6jlyfAUnhfCgC5TpK2QPZw6mmz/4m/50bI=", "jAchY");
        lllIllllI[llllIIIIl[121]] = llIIllIIIIIl("IHCFNbfVk2JkY7gGaP0/YPcFBO/akqoUXYRl8vJ4k9Gdvbg9t5EFXw==", "eOVKk");
        lllIllllI[llllIIIIl[122]] = llIIllIIIIll("WIYCuYpOzJ0YD2O4Rltce41kh7K/OnZlnyMHT8H+oziA6YTt+o30Hw==", "BbABa");
        lllIllllI[llllIIIIl[123]] = llIIllIIIIIl("VvZcm/AKGxucm/jVXcmufobBgJP/SW/MkrbcmHLIyf75V+XPeyW4Tw==", "wSdte");
        lllIllllI[llllIIIIl[124]] = llIIllIIIIlI("DSQWQwNhNQMIG2EgAAsFNWEbCwUzYQEIGSQvFkpebw==", "AAbdp");
    }

    private static boolean llIIllIlllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIllIllIll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIllIllllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llllIIIIl[0]];
        strArr[llllIIIIl[1]] = lllIllllI[llllIIIIl[73]];
        if (llIIllIlllIl(Inventory.getCount(strArr))) {
            int[] iArr = new int[llllIIIIl[0]];
            iArr[llllIIIIl[1]] = llllIIIIl[7];
            if (llIIllIlllIl(Inventory.getCount(iArr)) && llIIllIlllIl(Inventory.getCount(C0005f.bc))) {
                int[] iArr2 = new int[llllIIIIl[0]];
                iArr2[llllIIIIl[1]] = llllIIIIl[8];
                if (llIIllIlllIl(Inventory.getCount(iArr2))) {
                    ?? r0 = llllIIIIl[0];
                    "".length();
                    return " ".length() >= ((69 ^ 106) ^ (16 ^ 59)) ? (" ".length() ^ (143 ^ 136)) & (((((113 + 28) - (-31)) + 10) ^ (((122 + 58) - 65) + 61)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llllIIIIl[1];
    }

    private static boolean llIIllIllIlI(int i, int i2) {
        return i >= i2;
    }

    private static String llIIllIIIIll(String llIIlIlIlIIII, String llIIlIlIIllll) {
        try {
            SecretKeySpec llIIlIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), llllIIIIl[2]), "DES");
            Cipher llIIlIlIlIIlI = Cipher.getInstance("DES");
            llIIlIlIlIIlI.init(llllIIIIl[5], llIIlIlIlIIll);
            return new String(llIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(llIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIlIlIIIl) {
            llIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIllIII(int i, int i2) {
        return i < i2;
    }
}
