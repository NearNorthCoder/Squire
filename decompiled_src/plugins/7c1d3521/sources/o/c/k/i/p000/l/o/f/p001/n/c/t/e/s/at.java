package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.at  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/at.class */
public class at implements InterfaceC0003ac {
    public static final /* synthetic */ WorldPoint on;
    public static final /* synthetic */ WorldPoint oj;
    static /* synthetic */ int cG;
    public static final /* synthetic */ WorldPoint og;
    static /* synthetic */ int oc;
    public static /* synthetic */ long oa;
    static /* synthetic */ int dF;
    public static /* synthetic */ String[] ob;
    public static final /* synthetic */ WorldPoint ol;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint nY;
    static /* synthetic */ int od;
    public static final /* synthetic */ WorldPoint oi;
    private static /* synthetic */ int[] lllIIIlIII;
    public static final /* synthetic */ WorldPoint oh;
    private static /* synthetic */ String[] lllIIIIllI;
    static /* synthetic */ WorldArea oe;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ WorldPoint nZ;
    public static final /* synthetic */ WorldPoint ok;
    public static final /* synthetic */ WorldPoint of;
    public static /* synthetic */ WorldPoint nX;
    static /* synthetic */ int cI;
    public static final /* synthetic */ WorldPoint om;

    private static boolean lIlllllIlIIll(int i) {
        return i != 0;
    }

    private static int lIlllllIllIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIllllIllllll(String lllllllllllllllllIllllIIllIlIIlI, String lllllllllllllllllIllllIIllIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllllIIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllllIIllIlIllI.init(lllIIIlIII[3], secretKeySpec);
            return new String(lllllllllllllllllIllllIIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIIllIlIlII) {
            lllllllllllllllllIllllIIllIlIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIlllllIlIIlI();
        lIlllllIIIlII();
        bv = new ArrayList();
        nX = new WorldPoint(lllIIIlIII[55], lllIIIlIII[56], lllIIIlIII[0]);
        nY = new WorldPoint(lllIIIlIII[57], lllIIIlIII[58], lllIIIlIII[0]);
        nZ = new WorldPoint(lllIIIlIII[0], lllIIIlIII[0], lllIIIlIII[0]);
        oa = System.currentTimeMillis();
        String[] strArr = new String[lllIIIlIII[54]];
        strArr[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[6]];
        strArr[lllIIIlIII[1]] = lllIIIIllI[lllIIIlIII[59]];
        strArr[lllIIIlIII[3]] = lllIIIIllI[lllIIIlIII[60]];
        strArr[lllIIIlIII[4]] = lllIIIIllI[lllIIIlIII[61]];
        strArr[lllIIIlIII[9]] = lllIIIIllI[lllIIIlIII[62]];
        strArr[lllIIIlIII[13]] = lllIIIIllI[lllIIIlIII[63]];
        strArr[lllIIIlIII[18]] = lllIIIIllI[lllIIIlIII[64]];
        strArr[lllIIIlIII[19]] = lllIIIIllI[lllIIIlIII[65]];
        strArr[lllIIIlIII[21]] = lllIIIIllI[lllIIIlIII[66]];
        strArr[lllIIIlIII[22]] = lllIIIIllI[lllIIIlIII[67]];
        strArr[lllIIIlIII[14]] = lllIIIIllI[lllIIIlIII[68]];
        strArr[lllIIIlIII[23]] = lllIIIIllI[lllIIIlIII[69]];
        strArr[lllIIIlIII[24]] = lllIIIIllI[lllIIIlIII[70]];
        strArr[lllIIIlIII[25]] = lllIIIIllI[lllIIIlIII[71]];
        strArr[lllIIIlIII[26]] = lllIIIIllI[lllIIIlIII[72]];
        strArr[lllIIIlIII[17]] = lllIIIIllI[lllIIIlIII[73]];
        strArr[lllIIIlIII[27]] = lllIIIIllI[lllIIIlIII[74]];
        strArr[lllIIIlIII[28]] = lllIIIIllI[lllIIIlIII[75]];
        strArr[lllIIIlIII[30]] = lllIIIIllI[lllIIIlIII[76]];
        strArr[lllIIIlIII[31]] = lllIIIIllI[lllIIIlIII[77]];
        strArr[lllIIIlIII[15]] = lllIIIIllI[lllIIIlIII[78]];
        strArr[lllIIIlIII[32]] = lllIIIIllI[lllIIIlIII[79]];
        strArr[lllIIIlIII[2]] = lllIIIIllI[lllIIIlIII[80]];
        strArr[lllIIIlIII[33]] = lllIIIIllI[lllIIIlIII[81]];
        strArr[lllIIIlIII[34]] = lllIIIIllI[lllIIIlIII[82]];
        strArr[lllIIIlIII[29]] = lllIIIIllI[lllIIIlIII[83]];
        strArr[lllIIIlIII[35]] = lllIIIIllI[lllIIIlIII[84]];
        strArr[lllIIIlIII[36]] = lllIIIIllI[lllIIIlIII[85]];
        strArr[lllIIIlIII[37]] = lllIIIIllI[lllIIIlIII[86]];
        strArr[lllIIIlIII[38]] = lllIIIIllI[lllIIIlIII[87]];
        strArr[lllIIIlIII[40]] = lllIIIIllI[lllIIIlIII[88]];
        strArr[lllIIIlIII[48]] = lllIIIIllI[lllIIIlIII[89]];
        strArr[lllIIIlIII[49]] = lllIIIIllI[lllIIIlIII[90]];
        strArr[lllIIIlIII[50]] = lllIIIIllI[lllIIIlIII[91]];
        strArr[lllIIIlIII[51]] = lllIIIIllI[lllIIIlIII[92]];
        strArr[lllIIIlIII[52]] = lllIIIIllI[lllIIIlIII[93]];
        strArr[lllIIIlIII[53]] = lllIIIIllI[lllIIIlIII[94]];
        ob = strArr;
        oc = lllIIIlIII[95];
        dF = lllIIIlIII[0];
        cI = C0018e.c(lllIIIlIII[21], lllIIIlIII[2]);
        od = C0018e.c(lllIIIlIII[6], lllIIIlIII[74]);
        cG = lllIIIlIII[1];
        oe = new WorldArea(lllIIIlIII[96], lllIIIlIII[97], lllIIIlIII[2], lllIIIlIII[29], lllIIIlIII[0]);
        of = new WorldPoint(lllIIIlIII[98], lllIIIlIII[99], lllIIIlIII[0]);
        og = new WorldPoint(lllIIIlIII[100], lllIIIlIII[101], lllIIIlIII[0]);
        oh = new WorldPoint(lllIIIlIII[102], lllIIIlIII[103], lllIIIlIII[0]);
        oi = new WorldPoint(lllIIIlIII[104], lllIIIlIII[105], lllIIIlIII[0]);
        oj = new WorldPoint(lllIIIlIII[106], lllIIIlIII[107], lllIIIlIII[0]);
        ok = new WorldPoint(lllIIIlIII[108], lllIIIlIII[109], lllIIIlIII[0]);
        ol = of;
        om = og;
        on = om;
    }

    private static boolean lIlllllIlIlIl(int i) {
        return i == 0;
    }

    private static boolean lIlllllIllllI(int i, int i2) {
        return i == i2;
    }

    private static void lIlllllIlIIlI() {
        lllIIIlIII = new int[111];
        lllIIIlIII[0] = ((199 ^ 148) ^ (245 ^ 147)) & (((((221 + 243) - 429) + 210) ^ (((76 + 86) - 71) + 101)) ^ (-" ".length()));
        lllIIIlIII[1] = " ".length();
        lllIIIlIII[2] = 124 ^ 106;
        lllIIIlIII[3] = "  ".length();
        lllIIIlIII[4] = "   ".length();
        lllIIIlIII[5] = (-24660) & 29659;
        lllIIIlIII[6] = 86 ^ 112;
        lllIIIlIII[7] = (-((-21557) & 32117)) & (-1) & 31703;
        lllIIIlIII[8] = (-39) & 2031;
        lllIIIlIII[9] = 43 ^ 47;
        lllIIIlIII[10] = (-16545) & 24551;
        lllIIIlIII[11] = (-16549) & 24556;
        lllIIIlIII[12] = (-4737) & 5115;
        lllIIIlIII[13] = 4 ^ 1;
        lllIIIlIII[14] = (((49 + 150) - 66) + 56) ^ (((55 + 55) - 8) + 81);
        lllIIIlIII[15] = (71 ^ 55) ^ (2 ^ 102);
        lllIIIlIII[16] = (-((-8823) & 27391)) & (-1) & 20459;
        lllIIIlIII[17] = (77 ^ 16) ^ (243 ^ 161);
        lllIIIlIII[18] = (144 ^ 165) ^ (50 ^ 1);
        lllIIIlIII[19] = (77 ^ 9) ^ (53 ^ 118);
        lllIIIlIII[20] = (((((113 + 199) - 283) + 187) + (65 ^ 14)) - (((64 + 22) - (-53)) + 77)) + ((7 + 102) - 6) + 63;
        lllIIIlIII[21] = (68 ^ 88) ^ (152 ^ 140);
        lllIIIlIII[22] = 158 ^ 151;
        lllIIIlIII[23] = (101 ^ 48) ^ (21 ^ 75);
        lllIIIlIII[24] = 50 ^ 62;
        lllIIIlIII[25] = (68 ^ 120) ^ (174 ^ 159);
        lllIIIlIII[26] = (63 ^ 10) ^ (102 ^ 93);
        lllIIIlIII[27] = 68 ^ 84;
        lllIIIlIII[28] = 65 ^ 80;
        lllIIIlIII[29] = 21 ^ 12;
        lllIIIlIII[30] = 22 ^ 4;
        lllIIIlIII[31] = (97 ^ 35) ^ (116 ^ 37);
        lllIIIlIII[32] = (227 ^ 167) ^ (201 ^ 152);
        lllIIIlIII[33] = (203 ^ 152) ^ (1 ^ 69);
        lllIIIlIII[34] = 222 ^ 198;
        lllIIIlIII[35] = 51 ^ 41;
        lllIIIlIII[36] = (69 ^ 28) ^ (53 ^ 119);
        lllIIIlIII[37] = (76 ^ 50) ^ (68 ^ 38);
        lllIIIlIII[38] = (((87 + 122) - 136) + 69) ^ (((84 + 61) - 32) + 34);
        lllIIIlIII[39] = (-((-27705) & 31807)) & (-16402) & 24503;
        lllIIIlIII[40] = (179 ^ 175) ^ "  ".length();
        lllIIIlIII[41] = (-28673) & 30650;
        lllIIIlIII[42] = (-12329) & 13228;
        lllIIIlIII[43] = (-21009) & 21308;
        lllIIIlIII[44] = (-((-2003) & 20439)) & (-1033) & 32093;
        lllIIIlIII[45] = (-((-15562) & 32237)) & (-1093) & 32767;
        lllIIIlIII[46] = (-4161) & 6110;
        lllIIIlIII[47] = 204 ^ 168;
        lllIIIlIII[48] = (((88 + 27) - 73) + 87) ^ (((44 + 56) - (-17)) + 41);
        lllIIIlIII[49] = (((148 + 97) - 87) + 25) ^ (((115 + 145) - 170) + 61);
        lllIIIlIII[50] = (((3 + 19) - (-100)) + 6) ^ (((7 + 146) - 39) + 47);
        lllIIIlIII[51] = 65 ^ 99;
        lllIIIlIII[52] = 65 ^ 98;
        lllIIIlIII[53] = (103 ^ 11) ^ (36 ^ 108);
        lllIIIlIII[54] = 35 ^ 6;
        lllIIIlIII[55] = (-((-9) & 29483)) & (-10) & 32703;
        lllIIIlIII[56] = (-((-3393) & 32621)) & (-65) & 32511;
        lllIIIlIII[57] = (-4372) & 7639;
        lllIIIlIII[58] = (-546) & 3955;
        lllIIIlIII[59] = (94 ^ 91) ^ (29 ^ 63);
        lllIIIlIII[60] = (((52 + 111) - 47) + 123) ^ (((79 + 176) - 125) + 69);
        lllIIIlIII[61] = (160 ^ 136) ^ " ".length();
        lllIIIlIII[62] = 53 ^ 31;
        lllIIIlIII[63] = 168 ^ 131;
        lllIIIlIII[64] = (((133 + 15) - 103) + 120) ^ (((86 + 83) - 79) + 47);
        lllIIIlIII[65] = (174 ^ 191) ^ (63 ^ 3);
        lllIIIlIII[66] = (((88 + 64) - 120) + 136) ^ (((86 + 133) - 103) + 18);
        lllIIIlIII[67] = (((36 + 178) - 207) + 174) ^ (((114 + 16) - 65) + 89);
        lllIIIlIII[68] = 68 ^ 116;
        lllIIIlIII[69] = (141 ^ 181) ^ (125 ^ 116);
        lllIIIlIII[70] = 136 ^ 186;
        lllIIIlIII[71] = (36 ^ 120) ^ (14 ^ 97);
        lllIIIlIII[72] = 121 ^ 77;
        lllIIIlIII[73] = (201 ^ 166) ^ (122 ^ 32);
        lllIIIlIII[74] = (100 ^ 56) ^ (212 ^ 190);
        lllIIIlIII[75] = (3 ^ 102) ^ (149 ^ 199);
        lllIIIlIII[76] = (((57 + 0) - (-2)) + 78) ^ (((100 + 32) - (-1)) + 44);
        lllIIIlIII[77] = 183 ^ 142;
        lllIIIlIII[78] = 139 ^ 177;
        lllIIIlIII[79] = (((69 + 100) - 105) + 103) ^ (((43 + 20) - (-8)) + 85);
        lllIIIlIII[80] = 29 ^ 33;
        lllIIIlIII[81] = 175 ^ 146;
        lllIIIlIII[82] = (((72 + 86) - 27) + 10) ^ (((135 + 46) - 29) + 27);
        lllIIIlIII[83] = (((81 + 135) - 132) + 71) ^ (((112 + 136) - 99) + 15);
        lllIIIlIII[84] = (172 ^ 153) ^ (254 ^ 139);
        lllIIIlIII[85] = 209 ^ 144;
        lllIIIlIII[86] = (((118 + 146) - 158) + 103) ^ (((41 + 3) - (-102)) + 1);
        lllIIIlIII[87] = (62 ^ 91) ^ (102 ^ 64);
        lllIIIlIII[88] = 103 ^ 35;
        lllIIIlIII[89] = (222 ^ 160) ^ (189 ^ 134);
        lllIIIlIII[90] = (((106 + 105) - 94) + 13) ^ (((149 + 185) - 172) + 34);
        lllIIIlIII[91] = 21 ^ 82;
        lllIIIlIII[92] = (17 ^ 79) ^ (173 ^ 187);
        lllIIIlIII[93] = 9 ^ 64;
        lllIIIlIII[94] = 102 ^ 44;
        lllIIIlIII[95] = (-((-1247) & 11487)) & (-5) & 32765;
        lllIIIlIII[96] = (-" ".length()) & (-24578) & 27645;
        lllIIIlIII[97] = (-17161) & 20399;
        lllIIIlIII[98] = (-679) & 3759;
        lllIIIlIII[99] = (-((-21539) & 30511)) & (-4097) & 16319;
        lllIIIlIII[100] = (-195) & 3286;
        lllIIIlIII[101] = (-17173) & 20415;
        lllIIIlIII[102] = (-25349) & 28447;
        lllIIIlIII[103] = (-((-11289) & 31833)) & (-8201) & 31994;
        lllIIIlIII[104] = (-6422) & 8181;
        lllIIIlIII[105] = (-339) & 3967;
        lllIIIlIII[106] = (-((-2113) & 26697)) & (-2049) & 28381;
        lllIIIlIII[107] = (-4561) & 8159;
        lllIIIlIII[108] = (-6449) & 8187;
        lllIIIlIII[109] = (-20609) & 24242;
        lllIIIlIII[110] = 72 ^ 3;
    }

    private static boolean lIlllllIlIlII(int i, int i2) {
        return i < i2;
    }

    private static int lIllllllIIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIlllllIllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllllIlIlll(int i) {
        return i > 0;
    }

    public static void gn() {
        if (lIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll(ob).forEach(item -> {
                item.interact(lllIIIIllI[lllIIIlIII[54]]);
            });
        }
        if (lIlllllIlIlIl(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[lllIIIlIII[1]];
            iArr[lllIIIlIII[0]] = lllIIIlIII[8];
            if (lIlllllIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIlIII[1]];
                iArr2[lllIIIlIII[0]] = lllIIIlIII[7];
                if (lIlllllIlIlIl(Equipment.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIIIlIII[1]];
                    iArr3[lllIIIlIII[0]] = lllIIIlIII[7];
                    if (lIlllllIlIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIIlIII[1]];
                        iArr4[lllIIIlIII[0]] = lllIIIlIII[7];
                        Inventory.getFirst(iArr4).interact(lllIIIIllI[lllIIIlIII[18]]);
                        Time.sleepTicks(lllIIIlIII[1]);
                        "".length();
                    }
                }
            }
        }
        if (lIlllllIllIIl(Players.getLocal().getWorldLocation().distanceTo(ol), lllIIIlIII[17])) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[19]];
            Movement.walkTo(ol);
            "".length();
            Time.sleepTicks(lllIIIlIII[1]);
            "".length();
        }
        if (lIlllllIllIll(Players.getLocal().getWorldLocation().distanceTo(ol), lllIIIlIII[17])) {
            if (lIlllllIlIlIl(oe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(ol);
                "".length();
                Time.sleepTicks(lllIIIlIII[1]);
                "".length();
            }
            if (lIlllllIlIIll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIlllllIlllII(Players.getLocal().getGraphic(), lllIIIlIII[20])) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[21]];
                String[] strArr = new String[lllIIIlIII[1]];
                strArr[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[22]];
                if (lIlllllIlIllI(NPCs.getNearest(strArr)) && lIlllllIlllIl(Players.getLocal().getInteracting())) {
                    String[] strArr2 = new String[lllIIIlIII[1]];
                    strArr2[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[14]];
                    NPCs.getNearest(strArr2).interact(lllIIIIllI[lllIIIlIII[23]]);
                    Time.sleepTicks(lllIIIlIII[1]);
                    "".length();
                }
            }
            if (lIlllllIllllI(Players.getLocal().getGraphic(), lllIIIlIII[20])) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[24]];
                if (!lIlllllIlllll(lIlllllIllIlI(C0018e.w(), 70.0d)) || lIlllllIllIll(Skills.getBoostedLevel(Skill.HITPOINTS), lllIIIlIII[9])) {
                    int[] iArr5 = new int[lllIIIlIII[1]];
                    iArr5[lllIIIlIII[0]] = lllIIIlIII[8];
                    if (lIlllllIlIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lllIIIlIII[1]];
                        iArr6[lllIIIlIII[0]] = lllIIIlIII[8];
                        Inventory.getFirst(iArr6).interact(lllIIIIllI[lllIIIlIII[25]]);
                        Time.sleepTicks(lllIIIlIII[1]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lllIIIlIII[1]];
                strArr3[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[26]];
                if (lIlllllIlIIll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lllIIIlIII[1]];
                    strArr4[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[17]];
                    Inventory.getAll(strArr4).stream().forEach(item2 -> {
                        item2.interact(lllIIIIllI[lllIIIlIII[53]]);
                    });
                }
                Inventory.getAll(ob).forEach(item3 -> {
                    item3.interact(lllIIIIllI[lllIIIlIII[52]]);
                });
            }
        }
    }

    private static boolean lIlllllIlllll(int i) {
        return i >= 0;
    }

    private static boolean lIlllllIllIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIllllIlllllI(String lllllllllllllllllIllllIlIIIIIIII, String lllllllllllllllllIllllIIllllllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllllIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIllllIIllllllll.toCharArray();
        int lllllllllllllllllIllllIIllllllII = lllIIIlIII[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllllIllllIIllllIlIl = charArray2.length;
        int i = lllIIIlIII[0];
        while (lIlllllIlIlII(i, lllllllllllllllllIllllIIllllIlIl)) {
            char lllllllllllllllllIllllIIllllIIll = charArray2[i];
            sb.append((char) (lllllllllllllllllIllllIIllllIIll ^ charArray[lllllllllllllllllIllllIIllllllII % charArray.length]));
            "".length();
            lllllllllllllllllIllllIIllllllII++;
            i++;
            "".length();
            if ((-" ".length()) > ((129 ^ 193) & ((81 ^ 17) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[2])) {
            ?? r0 = lllIIIlIII[1];
            "".length();
            return (((7 ^ 59) ^ (247 ^ 156)) & (((((112 + 61) - 73) + 47) ^ (((93 + 42) - 94) + 155)) ^ (-" ".length()))) >= " ".length() ? ((6 ^ 83) ^ (206 ^ 160)) & (((242 ^ 188) ^ (122 ^ 15)) ^ (-" ".length())) : r0;
        }
        return lllIIIlIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIIlIII[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0152, code lost:
        if (lIlllllIlIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gm() {
        if (lIlllllIlIIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[0]];
            C0015b.a(bv);
            if (lIlllllIlIlII(bv.size(), lllIIIlIII[1])) {
                System.out.println(lllIIIIllI[lllIIIlIII[1]]);
                bt = lllIIIlIII[0];
            }
        }
        if (lIlllllIlIlIl(bt ? 1 : 0) && lIlllllIlIlII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[2])) {
            if (lIlllllIlIlIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllllIlIllI(nearest) && lIlllllIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[3]];
                    C0000a.a(nearest);
                }
                if (lIlllllIlIllI(nearest) && lIlllllIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[4]];
                    if (lIlllllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIlIII[5]);
                        "".length();
                    }
                    if (lIlllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlllllIlIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIlIII[4]);
                            "".length();
                        }
                        if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
                            int[] iArr = new int[lllIIIlIII[1]];
                            iArr[lllIIIlIII[0]] = lllIIIlIII[7];
                            if (lIlllllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIIIlIII[1]];
                                iArr2[lllIIIlIII[0]] = lllIIIlIII[8];
                            }
                            Q();
                            System.out.println(lllIIIIllI[lllIIIlIII[9]]);
                            bt = lllIIIlIII[1];
                            return;
                        }
                        int[] iArr3 = new int[lllIIIlIII[1]];
                        iArr3[lllIIIlIII[0]] = lllIIIlIII[10];
                        if (lIlllllIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIIIlIII[1]];
                            iArr4[lllIIIlIII[0]] = lllIIIlIII[11];
                            if (lIlllllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lllIIIlIII[1]];
                                iArr5[lllIIIlIII[0]] = lllIIIlIII[12];
                                if (!lIlllllIlIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                                    if (lIlllllIlIlII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[13])) {
                                        C0000a.a(lllIIIlIII[11], lllIIIlIII[13]);
                                        C0000a.a(lllIIIlIII[10], lllIIIlIII[13]);
                                        C0000a.a(lllIIIlIII[12], lllIIIlIII[14]);
                                    }
                                    if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[13]) && lIlllllIlIlII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
                                        C0000a.a(lllIIIlIII[10], lllIIIlIII[13]);
                                    }
                                    if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
                                        C0000a.a(lllIIIlIII[7], lllIIIlIII[13]);
                                        C0000a.a(lllIIIlIII[8], lllIIIlIII[15]);
                                        C0000a.a(lllIIIlIII[16], lllIIIlIII[15]);
                                    }
                                    cG += lllIIIlIII[1];
                                }
                            }
                        }
                        Q();
                        System.out.println(lllIIIIllI[lllIIIlIII[13]]);
                        bt = lllIIIlIII[1];
                        return;
                    }
                }
                if (lIlllllIllIIl(Inventory.getFreeSlots(), lllIIIlIII[17])) {
                    cG += lllIIIlIII[1];
                }
            }
            if (lIlllllIlIIll(an() ? 1 : 0) && lIlllllIlIlll(cG)) {
                if (lIlllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlllllIlIlII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[13])) {
                    go();
                }
                if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[13]) && lIlllllIlIlII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
                    gp();
                }
                if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
                    gn();
                }
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        gm();
        return lllIIIlIII[47];
    }

    private static boolean lIlllllIlllIl(Object obj) {
        return obj == null;
    }

    private static int lIllllllIIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private static boolean fN() {
        return lllIIIlIII[0];
    }

    private static boolean lIlllllIlllII(int i, int i2) {
        return i != i2;
    }

    private static void lIlllllIIIlII() {
        lllIIIIllI = new String[lllIIIlIII[110]];
        lllIIIIllI[lllIIIlIII[0]] = lIllllIlllllI("BB0AJDshSBA5MCsb", "FhyMU");
        lllIIIIllI[lllIIIlIII[1]] = lIllllIllllll("M3pMkMMPQr9wwNSS+ZIqDVElC7x9y5Oe4MoslGLm3qppbBRZem1Ipn16RXhONqBv", "cIrxt");
        lllIIIIllI[lllIIIlIII[3]] = lIllllIlllllI("DDgaPCYjLQU7JmItA3UjIzcH", "BYlUA");
        lllIIIIllI[lllIIIlIII[4]] = lIlllllIIIIlI("ZMRLHNqOPZY9LaSFUjkhazuStyD89jv0", "aHBCn");
        lllIIIIllI[lllIIIlIII[9]] = lIlllllIIIIlI("FPwGz6U8RSxLBdRCDhEKAqhVxs6hfngXu9/32IId4u6nEzyeJN5+mFmk/SPWpy4c", "lovVO");
        lllIIIIllI[lllIIIlIII[13]] = lIllllIlllllI("EiJRGxQgZxwTFTYuHx1GNjIBCgosIgJWRjYwGA4FLS4fHUYxKFE4MxwOPz0=", "EGqzf");
        lllIIIIllI[lllIIIlIII[18]] = lIllllIllllll("kay6BOKs9b0=", "wFoGQ");
        lllIIIIllI[lllIIIlIII[19]] = lIllllIlllllI("KS4TUAQIbwMRAgoqFw==", "gOepp");
        lllIIIIllI[lllIIIlIII[21]] = lIllllIllllll("yN6A8UU28PIbwxI7XVPdYw==", "WrAvw");
        lllIIIIllI[lllIIIlIII[22]] = lIllllIlllllI("CiUHMzE1ZDImJiohBg==", "GDtGT");
        lllIIIIllI[lllIIIlIII[14]] = lIllllIlllllI("GjU6ET0ldA8EKjoxOw==", "WTIeX");
        lllIIIIllI[lllIIIlIII[23]] = lIllllIlllllI("Ax0mHjg8Fy4QPA==", "StEuH");
        lllIIIIllI[lllIIIlIII[24]] = lIllllIllllll("rQiTiuqaLq8=", "HdHZY");
        lllIIIIllI[lllIIIlIII[25]] = lIllllIllllll("VVQrygSjPVg=", "hFhtj");
        lllIIIIllI[lllIIIlIII[26]] = lIllllIlllllI("GhIo", "PgOYm");
        lllIIIIllI[lllIIIlIII[17]] = lIllllIllllll("cWNJYvFjQwU=", "QBHyB");
        lllIIIIllI[lllIIIlIII[27]] = lIllllIllllll("9HxuWL16xKGmdduJtQcuPg==", "QbuUL");
        lllIIIIllI[lllIIIlIII[28]] = lIllllIllllll("GUsdXCdgok1IV1YOxuWdTg==", "RIIeS");
        lllIIIIllI[lllIIIlIII[30]] = lIllllIlllllI("NQgnPWIbFC4=", "zxBSO");
        lllIIIIllI[lllIIIlIII[31]] = lIlllllIIIIlI("khSs3+iShGQ=", "ZHAfy");
        lllIIIIllI[lllIIIlIII[15]] = lIllllIllllll("VaxScZzia9c=", "YCwas");
        lllIIIIllI[lllIIIlIII[32]] = lIlllllIIIIlI("owiUlxJKx+FEiVuUZogBYA==", "ugLjW");
        lllIIIIllI[lllIIIlIII[2]] = lIllllIlllllI("Bzo+PA0xKg==", "TNKRc");
        lllIIIIllI[lllIIIlIII[33]] = lIllllIllllll("ybIAjJoIOCA=", "KDuCO");
        lllIIIIllI[lllIIIlIII[34]] = lIllllIlllllI("CiAdZAArYR8hFWQ1AigR", "DAkDt");
        lllIIIIllI[lllIIIlIII[29]] = lIllllIlllllI("AgIhGEEsHig=", "MrDvl");
        lllIIIIllI[lllIIIlIII[35]] = lIllllIllllll("YT8Jyrtp5HuwOMPoYFDDSg==", "sfzjm");
        lllIIIIllI[lllIIIlIII[36]] = lIlllllIIIIlI("pxRHDjTsYDWbsWSQnUhOMg==", "coFbB");
        lllIIIIllI[lllIIIlIII[37]] = lIllllIlllllI("BAY1Yh0kAjgu", "PcTBn");
        lllIIIIllI[lllIIIlIII[38]] = lIllllIlllllI("PBAxLztCAiYhOg==", "odTNW");
        lllIIIIllI[lllIIIlIII[40]] = lIllllIlllllI("HhQjExUzCCs=", "ZfLce");
        lllIIIIllI[lllIIIlIII[48]] = lIlllllIIIIlI("hbzArNCuByf0VMDV49v1Ag==", "JMDHy");
        lllIIIIllI[lllIIIlIII[49]] = lIllllIllllll("uAW3XnPtESQ=", "BgBhI");
        lllIIIIllI[lllIIIlIII[50]] = lIllllIllllll("T0yPtnu9Ic4=", "NZmSR");
        lllIIIIllI[lllIIIlIII[51]] = lIlllllIIIIlI("Y0iFLrS7P3efnFK9uXQ24w==", "Lfhqx");
        lllIIIIllI[lllIIIlIII[52]] = lIlllllIIIIlI("dswsa8XUxwQ=", "UsVaG");
        lllIIIIllI[lllIIIlIII[53]] = lIllllIlllllI("ABYaFQ==", "DdueM");
        lllIIIIllI[lllIIIlIII[54]] = lIlllllIIIIlI("Mr42TCsTNsc=", "BBEpv");
        lllIIIIllI[lllIIIlIII[6]] = lIllllIlllllI("GhwzHAB1AT8WCg==", "UrZsn");
        lllIIIIllI[lllIIIlIII[59]] = lIllllIllllll("yCPCCR984GucGlbDVnMwFQ==", "pXpLw");
        lllIIIIllI[lllIIIlIII[60]] = lIllllIllllll("2EN/9IjK2B1kjgcj+fulyQ==", "tbxva");
        lllIIIIllI[lllIIIlIII[61]] = lIlllllIIIIlI("NTA6aB96x5w0XcRm4SvyAw==", "PTVNL");
        lllIIIIllI[lllIIIlIII[62]] = lIllllIllllll("W/kEIgiRF/DOMIjToyKnLQ==", "iVWXY");
        lllIIIIllI[lllIIIlIII[63]] = lIlllllIIIIlI("00BkIiUBh07AhHG0gOPseA==", "xYfdR");
        lllIIIIllI[lllIIIlIII[64]] = lIllllIllllll("A0gIWWZzHu5NJgX0MIVg+Q==", "FDAZB");
        lllIIIIllI[lllIIIlIII[65]] = lIllllIllllll("Pqu4CeWdu6iuZB8Qkbxx1A==", "FWDhS");
        lllIIIIllI[lllIIIlIII[66]] = lIllllIllllll("lCRXeMQQ1HdYFCe2CyrcQpgJRf57eNMh", "FEBkk");
        lllIIIIllI[lllIIIlIII[67]] = lIllllIlllllI("Jw0wPSMNBnE6NgoBNDUw", "deQRW");
        lllIIIIllI[lllIIIlIII[68]] = lIllllIlllllI("Ji0MDDIWNRsHZgY/DA0=", "uZiiF");
        lllIIIIllI[lllIIIlIII[69]] = lIllllIlllllI("ASoHPU8lIAM9", "VEfYo");
        lllIIIIllI[lllIIIlIII[70]] = lIllllIlllllI("PTM3JSgdJCpnPgozNw==", "oVSGM");
        lllIIIIllI[lllIIIlIII[71]] = lIlllllIIIIlI("8214IoZdlD5mhMYdljXt2ctvm3znuP28", "GXBiq");
        lllIIIIllI[lllIIIlIII[72]] = lIllllIllllll("OCglzEagma30/HQ66EyOMg==", "CNBIb");
        lllIIIIllI[lllIIIlIII[73]] = lIllllIlllllI("BCULJyg3OAFiNjMvHA==", "VJxBE");
        lllIIIIllI[lllIIIlIII[74]] = lIllllIllllll("ys/QC1VTJ3zLysshH/F+EA==", "lTWYQ");
        lllIIIIllI[lllIIIlIII[75]] = lIllllIllllll("Hswo0fK77XAb6tYD0MVouGu3wrRCXHSH", "zJaJm");
        lllIIIIllI[lllIIIlIII[76]] = lIllllIlllllI("JRY2FDsKDDAbaRcANBE=", "deQuI");
        lllIIIIllI[lllIIIlIII[77]] = lIllllIllllll("06uKhfPf/YdICiEKZiGiwg==", "CotrM");
        lllIIIIllI[lllIIIlIII[78]] = lIlllllIIIIlI("tPfUPbgJGdKufJS/er06KQ==", "TiVZL");
        lllIIIIllI[lllIIIlIII[79]] = lIllllIlllllI("Ayg/LRA4LjwtUickNi0=", "TASIr");
        lllIIIIllI[lllIIIlIII[80]] = lIllllIlllllI("AREmPjAjHDB3JCkVMA==", "LpTWW");
        lllIIIIllI[lllIIIlIII[81]] = lIlllllIIIIlI("vW/sexrGUH4BB5aB0XUHRA==", "ogfQa");
        lllIIIIllI[lllIIIlIII[82]] = lIlllllIIIIlI("WfA64xwIOp95qnaLm+NEw0cmZ0IC9cyW", "gGHjP");
        lllIIIIllI[lllIIIlIII[83]] = lIllllIllllll("ckqf2g5wpaVub91cTgRBgQ==", "TXHdL");
        lllIIIIllI[lllIIIlIII[84]] = lIllllIlllllI("IRQBBQgZFwoQHxJVHAcIDw==", "kuobm");
        lllIIIIllI[lllIIIlIII[85]] = lIllllIllllll("FxJr7I1sMymFO/4Z52VFlw==", "DhmvX");
        lllIIIIllI[lllIIIlIII[86]] = lIlllllIIIIlI("3G2Fd1PhQA1AHnxYaPIelQ==", "YMMpr");
        lllIIIIllI[lllIIIlIII[87]] = lIllllIllllll("kG1RYylDAYJjxZ+tB3Nm6w==", "NhBEy");
        lllIIIIllI[lllIIIlIII[88]] = lIllllIlllllI("Ngw+FQMPBCJHHwcIKA==", "bmLgl");
        lllIIIIllI[lllIIIlIII[89]] = lIllllIlllllI("ICIVPg4EIgkoChpjFCkKDA==", "hCgLo");
        lllIIIIllI[lllIIIlIII[90]] = lIllllIlllllI("BhI7PDokCCV0OzsIOjE=", "KgHTH");
        lllIIIIllI[lllIIIlIII[91]] = lIlllllIIIIlI("/oPsdQkFPDoH3G+NZbt8Tg==", "ZVeBA");
        lllIIIIllI[lllIIIlIII[92]] = lIllllIllllll("tpQ5t/kCLNQAV52sur5oSQ==", "lUDCk");
        lllIIIIllI[lllIIIlIII[93]] = lIllllIllllll("QOlBwkj09s6H3/Q3d6R1k9HssdleCjWS", "oyAIb");
        lllIIIIllI[lllIIIlIII[94]] = lIllllIlllllI("Kzcr", "aBLeA");
    }

    private static String lIlllllIIIIlI(String lllllllllllllllllIllllIIlllIlIII, String lllllllllllllllllIllllIIlllIIlll) {
        try {
            SecretKeySpec lllllllllllllllllIllllIIlllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIlllIIlll.getBytes(StandardCharsets.UTF_8)), lllIIIlIII[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIII[3], lllllllllllllllllIllllIIlllIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIIlllIlIIl) {
            lllllllllllllllllIllllIIlllIlIIl.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIIIllI[lllIIIlIII[48]];
    }

    private static boolean lIlllllIlIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0126, code lost:
        if (lIlllllIlIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        if (lIlllllIlIlII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[13])) {
            int[] iArr = new int[lllIIIlIII[1]];
            iArr[lllIIIlIII[0]] = lllIIIlIII[12];
            if (lIlllllIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIlIII[1]];
                iArr2[lllIIIlIII[0]] = lllIIIlIII[11];
                boolean contains = Inventory.contains(iArr2);
                int[] iArr3 = new int[lllIIIlIII[1]];
                iArr3[lllIIIlIII[0]] = lllIIIlIII[10];
                if (lIlllllIlIIll((contains ? 1 : 0) & (Inventory.contains(iArr3) ? 1 : 0)) && lIlllllIlIlll(cG)) {
                    ?? r0 = lllIIIlIII[1];
                    "".length();
                    return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lllIIIlIII[0];
        } else if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[13]) && lIlllllIlIlII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
            return lllIIIlIII[1];
        } else {
            if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
                int[] iArr4 = new int[lllIIIlIII[1]];
                iArr4[lllIIIlIII[0]] = lllIIIlIII[8];
                if (lIlllllIlIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lllIIIlIII[1]];
                    iArr5[lllIIIlIII[0]] = lllIIIlIII[7];
                    if (lIlllllIlIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lllIIIlIII[1]];
                        iArr6[lllIIIlIII[0]] = lllIIIlIII[7];
                    }
                    ?? r02 = lllIIIlIII[1];
                    "".length();
                    return (((40 ^ 79) ^ (220 ^ 145)) & (((((89 + 103) - 58) + 22) ^ (((6 + 40) - (-130)) + 6)) ^ (-" ".length()))) != 0 ? ((242 ^ 184) ^ (120 ^ 117)) & (((((204 + 95) - 204) + 143) ^ (((64 + 148) - 208) + 165)) ^ (-" ".length())) & ((((109 ^ 93) ^ (95 ^ 81)) & (((((8 + 176) - 44) + 39) ^ (((66 + 89) - 146) + 132)) ^ (-" ".length()))) ^ (-" ".length())) : r02;
                }
                return lllIIIlIII[0];
            }
            return lllIIIlIII[0];
        }
    }

    private static void go() {
        if (lIlllllIllIIl(Players.getLocal().getWorldLocation().distanceTo(nX), lllIIIlIII[17])) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[27]];
            Movement.walkTo(nX);
            "".length();
            Time.sleepTicks(lllIIIlIII[1]);
            "".length();
        }
        if (lIlllllIllIll(Players.getLocal().getWorldLocation().distanceTo(nX), lllIIIlIII[17])) {
            if (lIlllllIlIIll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIlllllIlllll(lIllllllIIIII(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[28]];
                int[] iArr = new int[lllIIIlIII[1]];
                iArr[lllIIIlIII[0]] = oc;
                if (lIlllllIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIIlIII[1]];
                    iArr2[lllIIIlIII[0]] = oc;
                    if (lIlllllIllIII(Inventory.getFirst(iArr2).getQuantity(), lllIIIlIII[29])) {
                        int[] iArr3 = new int[lllIIIlIII[1]];
                        iArr3[lllIIIlIII[0]] = oc;
                        Inventory.getFirst(iArr3).interact(lllIIIIllI[lllIIIlIII[30]]);
                        Time.sleepTicks(lllIIIlIII[1]);
                        "".length();
                    }
                }
                String[] strArr = new String[lllIIIlIII[1]];
                strArr[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[31]];
                if (lIlllllIlIllI(NPCs.getNearest(strArr)) && lIlllllIlllIl(Players.getLocal().getInteracting()) && lIlllllIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIlIII[1]];
                    strArr2[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[15]];
                    NPCs.getNearest(strArr2).interact(lllIIIIllI[lllIIIlIII[32]]);
                    Time.sleepTicks(lllIIIlIII[1]);
                    "".length();
                }
            }
            if (lIllllllIIIlI(lIllllllIIIII(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[2]];
                if (!lIlllllIlllll(lIllllllIIIIl(C0018e.w(), 30.0d)) || lIlllllIllIll(Skills.getBoostedLevel(Skill.HITPOINTS), lllIIIlIII[9])) {
                    int[] iArr4 = new int[lllIIIlIII[1]];
                    iArr4[lllIIIlIII[0]] = lllIIIlIII[12];
                    if (lIlllllIlIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIIIlIII[1]];
                        iArr5[lllIIIlIII[0]] = lllIIIlIII[12];
                        Inventory.getFirst(iArr5).interact(lllIIIIllI[lllIIIlIII[33]]);
                        Time.sleepTicks(lllIIIlIII[1]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIllllllIIIlI(int i) {
        return i <= 0;
    }

    public static void Q() {
        int[] iArr = new int[lllIIIlIII[1]];
        iArr[lllIIIlIII[0]] = lllIIIlIII[10];
        if (lIlllllIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlIII[10], lllIIIlIII[14], lllIIIlIII[42]));
            "".length();
        }
        int[] iArr2 = new int[lllIIIlIII[1]];
        iArr2[lllIIIlIII[0]] = lllIIIlIII[11];
        if (lIlllllIlIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlIII[11], lllIIIlIII[14], lllIIIlIII[42]));
            "".length();
        }
        int[] iArr3 = new int[lllIIIlIII[1]];
        iArr3[lllIIIlIII[0]] = lllIIIlIII[12];
        if (lIlllllIlIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlIII[12], lllIIIlIII[40], lllIIIlIII[43]));
            "".length();
        }
        int[] iArr4 = new int[lllIIIlIII[1]];
        iArr4[lllIIIlIII[0]] = lllIIIlIII[44];
        if (lIlllllIlIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIlIII[44], lllIIIlIII[13], C0023j.cf));
            "".length();
        }
        if (lIlllllIllIII(Skills.getLevel(Skill.THIEVING), lllIIIlIII[6])) {
            int[] iArr5 = new int[lllIIIlIII[1]];
            iArr5[lllIIIlIII[0]] = lllIIIlIII[8];
            if (lIlllllIlIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(lllIIIlIII[8], lllIIIlIII[45], lllIIIlIII[21]));
                "".length();
            }
            int[] iArr6 = new int[lllIIIlIII[1]];
            iArr6[lllIIIlIII[0]] = lllIIIlIII[7];
            if (lIlllllIlIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(lllIIIlIII[7], lllIIIlIII[43], lllIIIlIII[46]));
                "".length();
            }
        }
    }

    private static boolean lIlllllIllIll(int i, int i2) {
        return i <= i2;
    }

    private static void gp() {
        if (lIlllllIlIlIl(Players.getLocal().getWorldLocation().equals(nY) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[34]];
            if (lIlllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(nY);
            "".length();
            Time.sleepTicks(lllIIIlIII[1]);
            "".length();
        }
        if (lIlllllIlIIll(Players.getLocal().getWorldLocation().equals(nY) ? 1 : 0)) {
            int[] iArr = new int[lllIIIlIII[1]];
            iArr[lllIIIlIII[0]] = oc;
            if (lIlllllIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIlIII[1]];
                iArr2[lllIIIlIII[0]] = oc;
                Inventory.getFirst(iArr2).interact(lllIIIIllI[lllIIIlIII[29]]);
                Time.sleepTicks(lllIIIlIII[1]);
                "".length();
            }
            if (lIlllllIlIlIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[35]];
                String[] strArr = new String[lllIIIlIII[1]];
                strArr[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[36]];
                if (lIlllllIlIllI(TileObjects.getNearest(strArr))) {
                    String[] strArr2 = new String[lllIIIlIII[1]];
                    strArr2[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[37]];
                    TileObjects.getNearest(strArr2).interact(lllIIIIllI[lllIIIlIII[38]]);
                    Time.sleepUntil(() -> {
                        String[] strArr3 = new String[lllIIIlIII[1]];
                        strArr3[lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[51]];
                        if (lIlllllIlllIl(TileObjects.getNearest(strArr3))) {
                            ?? r0 = lllIIIlIII[1];
                            "".length();
                            return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllIIIlIII[0];
                    }, lllIIIlIII[39]);
                    "".length();
                }
            }
            if (lIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[40]];
                int[] iArr3 = new int[lllIIIlIII[1]];
                iArr3[lllIIIlIII[0]] = lllIIIlIII[41];
                Inventory.getAll(iArr3).forEach(item -> {
                    item.interact(lllIIIIllI[lllIIIlIII[50]]);
                });
                int[] iArr4 = new int[lllIIIlIII[1]];
                iArr4[lllIIIlIII[0]] = lllIIIlIII[12];
                if (lIlllllIlIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lllIIIlIII[1]];
                    iArr5[lllIIIlIII[0]] = lllIIIlIII[12];
                    Inventory.getAll(iArr5).forEach(item2 -> {
                        item2.interact(lllIIIIllI[lllIIIlIII[49]]);
                    });
                }
            }
        }
    }
}
