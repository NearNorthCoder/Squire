package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.Q  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/Q.class */
public class Q implements ab {
    static /* synthetic */ String[] cG;
    private static /* synthetic */ String[] kU;
    static /* synthetic */ WorldPoint dg;
    private static final /* synthetic */ HashMap<Integer, String> kL;
    private static /* synthetic */ String[] lllIllIll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint kR;
    public static /* synthetic */ boolean kN;
    static /* synthetic */ WorldPoint kP;
    static /* synthetic */ WorldPoint kO;
    static /* synthetic */ int dk;
    static /* synthetic */ WorldPoint kQ;
    public static /* synthetic */ List<C0003d> bx;
    private static final /* synthetic */ String kM;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ int[] lllIlllIl;
    private final /* synthetic */ int kV = lllIlllIl[0];
    static /* synthetic */ WorldPoint kT;
    static /* synthetic */ WorldPoint kS;

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIllIll[lllIlllIl[87]];
    }

    private static void cP() {
        if (llIIlIlllllI(kU)) {
            if (llIIlIllIllI(Vars.getBit(lllIlllIl[70])) && llIIlIllIllI(Vars.getBit(lllIlllIl[71]))) {
                return;
            }
            String[] strArr = new String[lllIlllIl[10]];
            strArr[lllIlllIl[0]] = kL.get(Integer.valueOf(Vars.getBit(lllIlllIl[70])));
            strArr[lllIlllIl[1]] = kL.get(Integer.valueOf(Vars.getBit(lllIlllIl[71])));
            strArr[lllIlllIl[3]] = kL.get(Integer.valueOf(Vars.getBit(lllIlllIl[72])));
            strArr[lllIlllIl[5]] = kL.get(Integer.valueOf(Vars.getBit(lllIlllIl[73])));
            strArr[lllIlllIl[4]] = kL.get(Integer.valueOf(Vars.getBit(lllIlllIl[74])));
            kU = strArr;
            System.out.println("Say the following in order: " + String.join(lllIllIll[lllIlllIl[75]], kU));
        }
    }

    private static void llIIlIllIIlI() {
        lllIlllIl = new int[122];
        lllIlllIl[0] = (109 ^ 61) & ((195 ^ 147) ^ (-1));
        lllIlllIl[1] = " ".length();
        lllIlllIl[2] = (-11333) & 16332;
        lllIlllIl[3] = "  ".length();
        lllIlllIl[4] = (((69 + 0) - (-14)) + 50) ^ (((83 + 25) - 48) + 69);
        lllIlllIl[5] = "   ".length();
        lllIlllIl[6] = (-((-3091) & 11451)) & (-17) & 16383;
        lllIlllIl[7] = (-((-2725) & 32693)) & (-2178) & 32671;
        lllIlllIl[8] = (-20595) & 22523;
        lllIlllIl[9] = 101 ^ 124;
        lllIlllIl[10] = 85 ^ 80;
        lllIlllIl[11] = (-16909) & 29533;
        lllIlllIl[12] = 94 ^ 84;
        lllIlllIl[13] = (-((-21093) & 30333)) & (-6149) & 16383;
        lllIlllIl[14] = (-9240) & 10239;
        lllIlllIl[15] = 169 ^ 155;
        lllIlllIl[16] = 165 ^ 163;
        lllIlllIl[17] = (-5253) & 5631;
        lllIlllIl[18] = 89 ^ 94;
        lllIlllIl[19] = 33 ^ 41;
        lllIlllIl[20] = (((139 + 66) - 140) + 79) ^ (((10 + 74) - (-54)) + 15);
        lllIlllIl[21] = (-28673) & 31871;
        lllIlllIl[22] = (-((-1101) & 9343)) & (-1) & 11711;
        lllIlllIl[23] = (((139 + 122) - 137) + 16) ^ (((40 + 80) - (-14)) + 1);
        lllIlllIl[24] = (-8345) & 10744;
        lllIlllIl[25] = 144 ^ 156;
        lllIlllIl[26] = 184 ^ 181;
        lllIlllIl[27] = 73 ^ 71;
        lllIlllIl[28] = " ".length() ^ (154 ^ 148);
        lllIlllIl[29] = 138 ^ 154;
        lllIlllIl[30] = 8 ^ 25;
        lllIlllIl[31] = (((74 + 7) - (-48)) + 49) ^ (((126 + 6) - 41) + 69);
        lllIlllIl[32] = 183 ^ 164;
        lllIlllIl[33] = 92 ^ 72;
        lllIlllIl[34] = (15 ^ 73) ^ (209 ^ 130);
        lllIlllIl[35] = 32 ^ 54;
        lllIlllIl[36] = 99 ^ 116;
        lllIlllIl[37] = 182 ^ 174;
        lllIlllIl[38] = 182 ^ 172;
        lllIlllIl[39] = (57 ^ 94) ^ (6 ^ 122);
        lllIlllIl[40] = 110 ^ 114;
        lllIlllIl[41] = (((19 + 44) - 7) + 72) ^ (((124 + 76) - 43) + 0);
        lllIlllIl[42] = 131 ^ 157;
        lllIlllIl[43] = (((134 + 28) - 46) + 62) ^ (((148 + 118) - 260) + 167);
        lllIlllIl[44] = 176 ^ 144;
        lllIlllIl[45] = (54 ^ 16) ^ (0 ^ 7);
        lllIlllIl[46] = (-((-329) & 2011)) & (-28677) & 32759;
        lllIlllIl[47] = (23 ^ 115) ^ (232 ^ 174);
        lllIlllIl[48] = (-((-3603) & 24211)) & (-8705) & 31711;
        lllIlllIl[49] = (23 ^ 90) ^ (7 ^ 105);
        lllIlllIl[50] = 72 ^ 108;
        lllIlllIl[51] = 101 ^ 64;
        lllIlllIl[52] = (162 ^ 156) ^ (125 ^ 101);
        lllIlllIl[53] = (50 ^ 90) ^ (137 ^ 198);
        lllIlllIl[54] = (((148 + 22) - 22) + 15) ^ (((26 + 113) - 105) + 105);
        lllIlllIl[55] = (((22 + 33) - (-79)) + 15) ^ (((159 + 17) - 64) + 76);
        lllIlllIl[56] = 129 ^ 171;
        lllIlllIl[57] = (41 ^ 65) ^ (197 ^ 134);
        lllIlllIl[58] = 181 ^ 153;
        lllIlllIl[59] = (((128 + 119) - 70) + 8) ^ (((57 + 61) - 42) + 72);
        lllIlllIl[60] = (57 ^ 92) ^ (71 ^ 12);
        lllIlllIl[61] = (232 ^ 174) ^ (208 ^ 185);
        lllIlllIl[62] = 142 ^ 190;
        lllIlllIl[63] = 63 ^ 14;
        lllIlllIl[64] = 190 ^ 141;
        lllIlllIl[65] = (34 ^ 4) ^ (141 ^ 159);
        lllIlllIl[66] = (((91 + 136) - 167) + 82) ^ (((137 + 146) - 207) + 111);
        lllIlllIl[67] = (195 ^ 175) ^ (246 ^ 172);
        lllIlllIl[68] = "   ".length() ^ (111 ^ 91);
        lllIlllIl[69] = 254 ^ 198;
        lllIlllIl[70] = (-1529) & 4090;
        lllIlllIl[71] = (-((-16655) & 30159)) & (-16429) & 32495;
        lllIlllIl[72] = (-((-8229) & 9719)) & (-28706) & 32759;
        lllIlllIl[73] = (-5225) & 7789;
        lllIlllIl[74] = (-12601) & 15166;
        lllIlllIl[75] = 70 ^ 127;
        lllIlllIl[76] = 186 ^ 128;
        lllIlllIl[77] = 80 ^ 107;
        lllIlllIl[78] = (-2093) & 14719;
        lllIlllIl[79] = 79 ^ 115;
        lllIlllIl[80] = (-19466) & 20125;
        lllIlllIl[81] = (-((-6537) & 14847)) & (-4097) & 14326;
        lllIlllIl[82] = (-20787) & 32766;
        lllIlllIl[83] = (-((-14417) & 14935)) & (-4098) & 29615;
        lllIlllIl[84] = (-((-519) & 10887)) & (-21073) & 31740;
        lllIlllIl[85] = (-4227) & 6126;
        lllIlllIl[86] = 5 ^ 97;
        lllIlllIl[87] = 131 ^ 190;
        lllIlllIl[88] = 0 ^ 62;
        lllIlllIl[89] = (123 ^ 63) ^ (240 ^ 139);
        lllIlllIl[90] = 240 ^ 176;
        lllIlllIl[91] = (-((-15369) & 32637)) & (-1) & 20471;
        lllIlllIl[92] = (-12827) & 16250;
        lllIlllIl[93] = (-29235) & 32438;
        lllIlllIl[94] = (-((-9603) & 10215)) & (-4098) & 8181;
        lllIlllIl[95] = (-24657) & 28153;
        lllIlllIl[96] = (-24578) & 27803;
        lllIlllIl[97] = (-((-17436) & 29791)) & (-16913) & 32763;
        lllIlllIl[98] = (-22613) & 32509;
        lllIlllIl[99] = (-((-26629) & 27543)) & (-12357) & 16383;
        lllIlllIl[100] = (-(((13 + 19) - (-22)) + 112)) & (-16641) & 19967;
        lllIlllIl[101] = (-1) & 3227;
        lllIlllIl[102] = (-((-4107) & 12891)) & (-4101) & 16255;
        lllIlllIl[103] = 198 ^ 135;
        lllIlllIl[104] = 27 ^ 89;
        lllIlllIl[105] = 109 ^ 46;
        lllIlllIl[106] = (((53 + 121) - 48) + 1) ^ (22 ^ 45);
        lllIlllIl[107] = 61 ^ 120;
        lllIlllIl[108] = 30 ^ 88;
        lllIlllIl[109] = (9 ^ 96) ^ (122 ^ 84);
        lllIlllIl[110] = (144 ^ 131) ^ (11 ^ 80);
        lllIlllIl[111] = 51 ^ 122;
        lllIlllIl[112] = 220 ^ 150;
        lllIlllIl[113] = (181 ^ 134) ^ (225 ^ 153);
        lllIlllIl[114] = 3 ^ 79;
        lllIlllIl[115] = 73 ^ 4;
        lllIlllIl[116] = (((36 + 132) - 14) + 47) ^ (((88 + 106) - 65) + 6);
        lllIlllIl[117] = (103 ^ 46) ^ (96 ^ 102);
        lllIlllIl[118] = (((128 + 195) - 161) + 54) ^ (((121 + 43) - 96) + 68);
        lllIlllIl[119] = (((80 + 8) - 56) + 113) ^ (((112 + 117) - 182) + 145);
        lllIlllIl[120] = (((35 + 158) - (-18)) + 15) ^ (((21 + 34) - (-24)) + 97);
        lllIlllIl[121] = 124 ^ 47;
    }

    private static boolean llIIlIllllII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0164, code lost:
        if (llIIlIllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.Q.lllIlllIl[10]) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIIlIllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.Q.lllIlllIl[9]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lllIlllIl[1]];
        iArr5[lllIlllIl[0]] = lllIlllIl[7];
        if (llIIlIllIlII(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lllIlllIl[1]];
            iArr6[lllIlllIl[0]] = lllIlllIl[7];
            if (llIIlIllIlII(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lllIlllIl[1]];
                iArr7[lllIlllIl[0]] = lllIlllIl[7];
            }
            iArr = new int[lllIlllIl[1]];
            iArr[lllIlllIl[0]] = lllIlllIl[8];
            if (llIIlIllIllI(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(lllIlllIl[8], lllIlllIl[1], lllIlllIl[81]));
                "".length();
            }
            if (llIIlIllIllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllIllIll[lllIlllIl[88]]);
            }) ? 1 : 0)) {
                bx.add(new C0003d(lllIlllIl[82], lllIlllIl[10], lllIlllIl[83]));
                "".length();
            }
            iArr2 = new int[lllIlllIl[1]];
            iArr2[lllIlllIl[0]] = lllIlllIl[17];
            if (llIIlIllIlII(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr8 = new int[lllIlllIl[1]];
                iArr8[lllIlllIl[0]] = lllIlllIl[17];
                if (llIIlIllIlII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIlllIl[1]];
                    iArr9[lllIlllIl[0]] = lllIlllIl[17];
                }
                iArr3 = new int[lllIlllIl[1]];
                iArr3[lllIlllIl[0]] = lllIlllIl[11];
                if (llIIlIllIllI(Bank.contains(iArr3) ? 1 : 0)) {
                    bx.add(new C0003d(lllIlllIl[11], lllIlllIl[4], C0009j.ch));
                    "".length();
                }
                iArr4 = new int[lllIlllIl[1]];
                iArr4[lllIlllIl[0]] = lllIlllIl[6];
                if (llIIlIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIlllIl[1]];
                    iArr10[lllIlllIl[0]] = lllIlllIl[6];
                    if (!llIIlIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
                        return;
                    }
                    int[] iArr11 = new int[lllIlllIl[1]];
                    iArr11[lllIlllIl[0]] = lllIlllIl[6];
                    if (!llIIlIllIlIl(Bank.getFirst(iArr11).getQuantity(), lllIlllIl[28])) {
                        return;
                    }
                }
                bx.add(new C0003d(lllIlllIl[6], lllIlllIl[54], lllIlllIl[85]));
                "".length();
            }
            bx.add(new C0003d(lllIlllIl[17], lllIlllIl[12], lllIlllIl[84]));
            "".length();
            iArr3 = new int[lllIlllIl[1]];
            iArr3[lllIlllIl[0]] = lllIlllIl[11];
            if (llIIlIllIllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lllIlllIl[1]];
            iArr4[lllIlllIl[0]] = lllIlllIl[6];
            if (llIIlIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIlllIl[6], lllIlllIl[54], lllIlllIl[85]));
            "".length();
        }
        bx.add(new C0003d(lllIlllIl[7], lllIlllIl[9], lllIlllIl[80]));
        "".length();
        iArr = new int[lllIlllIl[1]];
        iArr[lllIlllIl[0]] = lllIlllIl[8];
        if (llIIlIllIllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (llIIlIllIllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllIllIll[lllIlllIl[88]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lllIlllIl[1]];
        iArr2[lllIlllIl[0]] = lllIlllIl[17];
        if (llIIlIllIlII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIlllIl[17], lllIlllIl[12], lllIlllIl[84]));
        "".length();
        iArr3 = new int[lllIlllIl[1]];
        iArr3[lllIlllIl[0]] = lllIlllIl[11];
        if (llIIlIllIllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lllIlllIl[1]];
        iArr4[lllIlllIl[0]] = lllIlllIl[6];
        if (llIIlIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIlllIl[6], lllIlllIl[54], lllIlllIl[85]));
        "".length();
    }

    private static boolean llIIlIllIlll(Object obj) {
        return obj != null;
    }

    private static String llIIlIIlllII(String llIlIIIIIllIl, String llIlIIIIIllII) {
        try {
            SecretKeySpec llIlIIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIIllll = Cipher.getInstance("Blowfish");
            llIlIIIIIllll.init(lllIlllIl[3], llIlIIIIlIIII);
            return new String(llIlIIIIIllll.doFinal(Base64.getDecoder().decode(llIlIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIIIlllI) {
            llIlIIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIllIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIllIlII(int i) {
        return i != 0;
    }

    private static boolean llIIlIlllIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlIlllIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIlllIl[3]];
        iArr[lllIlllIl[0]] = lllIlllIl[6];
        iArr[lllIlllIl[1]] = lllIlllIl[8];
        int llIlIIIlIlIlI = lllIlllIl[0];
        while (llIIlIllIlIl(llIlIIIlIlIlI, iArr.length)) {
            int[] iArr2 = new int[lllIlllIl[1]];
            iArr2[lllIlllIl[0]] = iArr[llIlIIIlIlIlI];
            if (llIIlIllIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIlllIl[0];
            }
            llIlIIIlIlIlI++;
            "".length();
            if ("   ".length() >= ((33 ^ 81) ^ (18 ^ 102))) {
                return ((183 ^ 160) ^ (27 ^ 40)) & (("   ".length() ^ (67 ^ 100)) ^ (-" ".length()));
            }
        }
        return lllIlllIl[1];
    }

    private static boolean llIIlIllIllI(int i) {
        return i == 0;
    }

    private static boolean llIIlIlllllI(Object obj) {
        return obj == null;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            cO();
            "".length();
            if ("  ".length() != "  ".length()) {
                return (99 ^ 100) & ((107 ^ 108) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIlllIl[86];
    }

    private static boolean llIIllIIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIlIllllll(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[5])) {
            ?? r0 = lllIlllIl[1];
            "".length();
            return (129 ^ 133) > (75 ^ 79) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlllIl[0];
    }

    private static boolean llIIlIllllll(int i, int i2) {
        return i >= i2;
    }

    private static String llIIlIIllIlI(String llIIlllllllIl, String llIIlllllllII) {
        String llIIlllllllIl2 = new String(Base64.getDecoder().decode(llIIlllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIllllllIlI = llIIlllllllII.toCharArray();
        int llIIllllllIIl = lllIlllIl[0];
        char[] charArray = llIIlllllllIl2.toCharArray();
        int llIIlllllIIlI = charArray.length;
        int i = lllIlllIl[0];
        while (llIIlIllIlIl(i, llIIlllllIIlI)) {
            char llIIlllllIIII = charArray[i];
            sb.append((char) (llIIlllllIIII ^ llIIllllllIlI[llIIllllllIIl % llIIllllllIlI.length]));
            "".length();
            llIIllllllIIl++;
            i++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIlIllllIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIlllIl[0];
    }

    private static int llIIlIllIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0b39, code lost:
        if (llIIlIllIlll(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L219;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v294, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v550, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v553, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v575, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cO() {
        if (llIIlIllIlII(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (llIIlIllIlIl(bx.size(), lllIlllIl[1])) {
                System.out.println(lllIllIll[lllIlllIl[0]]);
                bv = lllIlllIl[0];
            }
        }
        if (llIIlIllIllI(bv ? 1 : 0)) {
            if (llIIlIllIllI(an() ? 1 : 0) && llIIlIllIllI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIllIlll(nearest) && llIIlIllIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIllIll[lllIlllIl[1]];
                    C0000a.a(nearest);
                }
                if (llIIlIllIlll(nearest) && llIIlIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlllIl[2]);
                        "".length();
                    }
                    if (llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllIll[lllIlllIl[3]];
                        if (llIIlIlllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlllIl[4]);
                            "".length();
                        }
                        if (llIIlIlllIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIlllIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllIlllIl[5]];
                        iArr[lllIlllIl[0]] = lllIlllIl[6];
                        iArr[lllIlllIl[1]] = lllIlllIl[7];
                        iArr[lllIlllIl[3]] = lllIlllIl[8];
                        if (llIIlIllIllI(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIllIll[lllIlllIl[5]]);
                            bv = lllIlllIl[1];
                            return;
                        }
                        int[] iArr2 = new int[lllIlllIl[1]];
                        iArr2[lllIlllIl[0]] = lllIlllIl[7];
                        if (llIIlIllIlII(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lllIlllIl[1]];
                            iArr3[lllIlllIl[0]] = lllIlllIl[7];
                            if (llIIlIllIlIl(Bank.getFirst(iArr3).getQuantity(), lllIlllIl[9])) {
                                Q();
                                System.out.println(lllIllIll[lllIlllIl[4]]);
                                bv = lllIlllIl[1];
                                return;
                            }
                        }
                        int[] iArr4 = new int[lllIlllIl[5]];
                        iArr4[lllIlllIl[0]] = lllIlllIl[6];
                        iArr4[lllIlllIl[1]] = lllIlllIl[7];
                        iArr4[lllIlllIl[3]] = lllIlllIl[8];
                        if (llIIlIllIlII(C0004e.d(iArr4) ? 1 : 0)) {
                            if (llIIlIllIllI(Equipment.contains(C0005f.aY) ? 1 : 0) && llIIlIllIllI(Inventory.contains(C0005f.aY) ? 1 : 0)) {
                                C0000a.b(C0005f.aY, lllIlllIl[1]);
                            }
                            if (llIIlIllIlII(Inventory.contains(C0005f.aY) ? 1 : 0)) {
                                Inventory.getFirst(C0005f.aY).interact(lllIllIll[lllIlllIl[10]]);
                                Time.sleepTicks(lllIlllIl[5]);
                                "".length();
                            }
                            if (llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lllIlllIl[5]);
                                "".length();
                            }
                            C0000a.a(lllIlllIl[11], lllIlllIl[1]);
                            C0000a.a(lllIlllIl[8], lllIlllIl[1]);
                            C0000a.a(lllIlllIl[6], lllIlllIl[12]);
                            C0000a.a(lllIlllIl[13], lllIlllIl[14]);
                        }
                    }
                }
            }
            if (llIIlIllIlII(Inventory.contains(C0005f.bc) ? 1 : 0) && llIIlIllIlIl(Movement.getRunEnergy(), lllIlllIl[15])) {
                Inventory.getFirst(C0005f.bc).interact(lllIllIll[lllIlllIl[16]]);
                Time.sleepTicks(lllIlllIl[1]);
                "".length();
            }
            int[] iArr5 = new int[lllIlllIl[1]];
            iArr5[lllIlllIl[0]] = lllIlllIl[17];
            if (llIIlIllIlII(Inventory.contains(iArr5) ? 1 : 0) && llIIlIlllIIl(llIIlIllIIll(C0004e.w(), 55.0d))) {
                int[] iArr6 = new int[lllIlllIl[1]];
                iArr6[lllIlllIl[0]] = lllIlllIl[17];
                Inventory.getFirst(iArr6).interact(lllIllIll[lllIlllIl[18]]);
            }
            if (llIIlIllIlII(an() ? 1 : 0) && llIIlIllIllI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                if (llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lllIlllIl[4]) && llIIlIllIllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIllIll[lllIlllIl[19]];
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(lllIlllIl[1]);
                    "".length();
                }
                if (llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIlllIl[4])) {
                    C0006g.a(lllIllIll[lllIlllIl[20]], cG);
                }
            }
            if (llIIlIllllII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[1])) {
                WorldArea worldArea = new WorldArea(lllIlllIl[21], lllIlllIl[22], lllIlllIl[19], lllIlllIl[18], lllIlllIl[0]);
                if (llIIlIllIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIllIll[lllIlllIl[12]];
                    Movement.walkTo(kO);
                    "".length();
                    Time.sleepTicks(lllIlllIl[1]);
                    "".length();
                }
                if (llIIlIllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lllIllIll[lllIlllIl[23]], cG);
                }
            }
            if (llIIlIllllII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[3])) {
                dk = lllIlllIl[0];
                int[] iArr7 = new int[lllIlllIl[1]];
                iArr7[lllIlllIl[0]] = lllIlllIl[24];
                if (llIIlIllIllI(Inventory.contains(iArr7) ? 1 : 0)) {
                    String[] strArr = new String[lllIlllIl[1]];
                    strArr[lllIlllIl[0]] = lllIllIll[lllIlllIl[25]];
                    if (llIIlIllIllI(Equipment.contains(strArr) ? 1 : 0) && llIIlIllIllI(kN ? 1 : 0)) {
                        if (!llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kP), lllIlllIl[4]) || llIIlIllllIl(Players.getLocal().getWorldLocation().getPlane(), lllIlllIl[3])) {
                            AccBuilderGWD.c = lllIllIll[lllIlllIl[26]];
                            Movement.walkTo(kP);
                            "".length();
                            Time.sleepTicks(lllIlllIl[1]);
                            "".length();
                        }
                        if (llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kP), lllIlllIl[4])) {
                            C0006g.a(lllIllIll[lllIlllIl[27]], cG);
                        }
                    }
                }
                int[] iArr8 = new int[lllIlllIl[1]];
                iArr8[lllIlllIl[0]] = lllIlllIl[24];
                if (llIIlIllIlII(Inventory.contains(iArr8) ? 1 : 0) && llIIlIllIllI(kN ? 1 : 0)) {
                    String[] strArr2 = new String[lllIlllIl[1]];
                    strArr2[lllIlllIl[0]] = lllIllIll[lllIlllIl[28]];
                    if (llIIlIllIlII(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kQ), lllIlllIl[4])) {
                            AccBuilderGWD.c = lllIllIll[lllIlllIl[29]];
                            Movement.walkTo(kQ);
                            "".length();
                            Time.sleepTicks(lllIlllIl[1]);
                            "".length();
                        }
                        if (llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kQ), lllIlllIl[4])) {
                            String[] strArr3 = new String[lllIlllIl[1]];
                            strArr3[lllIlllIl[0]] = lllIllIll[lllIlllIl[30]];
                            Item first = Inventory.getFirst(strArr3);
                            String[] strArr4 = new String[lllIlllIl[1]];
                            strArr4[lllIlllIl[0]] = lllIllIll[lllIlllIl[31]];
                            first.useOn(TileObjects.getNearest(strArr4));
                            Time.sleepTicks(lllIlllIl[10]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lllIlllIl[1]];
                    strArr5[lllIlllIl[0]] = lllIllIll[lllIlllIl[32]];
                    if (llIIlIllIllI(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kR), lllIlllIl[4])) {
                            AccBuilderGWD.c = lllIllIll[lllIlllIl[33]];
                            String[] strArr6 = new String[lllIlllIl[1]];
                            strArr6[lllIlllIl[0]] = lllIllIll[lllIlllIl[34]];
                            if (llIIlIllIlll(TileObjects.getNearest(strArr6))) {
                                String[] strArr7 = new String[lllIlllIl[1]];
                                strArr7[lllIlllIl[0]] = lllIllIll[lllIlllIl[35]];
                                TileObject nearest2 = TileObjects.getNearest(strArr7);
                                String[] strArr8 = new String[lllIlllIl[1]];
                                strArr8[lllIlllIl[0]] = lllIllIll[lllIlllIl[36]];
                                if (llIIlIllIlII(nearest2.hasAction(strArr8) ? 1 : 0)) {
                                    String[] strArr9 = new String[lllIlllIl[1]];
                                    strArr9[lllIlllIl[0]] = lllIllIll[lllIlllIl[37]];
                                    TileObjects.getNearest(strArr9).interact(lllIllIll[lllIlllIl[9]]);
                                    Time.sleepTicks(lllIlllIl[3]);
                                    "".length();
                                }
                            }
                            String[] strArr10 = new String[lllIlllIl[1]];
                            strArr10[lllIlllIl[0]] = lllIllIll[lllIlllIl[38]];
                            if (llIIlIllIlll(TileObjects.getNearest(strArr10))) {
                                String[] strArr11 = new String[lllIlllIl[1]];
                                strArr11[lllIlllIl[0]] = lllIllIll[lllIlllIl[39]];
                                TileObject nearest3 = TileObjects.getNearest(strArr11);
                                String[] strArr12 = new String[lllIlllIl[1]];
                                strArr12[lllIlllIl[0]] = lllIllIll[lllIlllIl[40]];
                                if (llIIlIllIlII(nearest3.hasAction(strArr12) ? 1 : 0)) {
                                    String[] strArr13 = new String[lllIlllIl[1]];
                                    strArr13[lllIlllIl[0]] = lllIllIll[lllIlllIl[41]];
                                    TileObjects.getNearest(strArr13).interact(lllIllIll[lllIlllIl[42]]);
                                    Time.sleepTicks(lllIlllIl[3]);
                                    "".length();
                                }
                            }
                            Movement.walkTo(kR);
                            "".length();
                            Time.sleepTicks(lllIlllIl[1]);
                            "".length();
                        }
                        if (llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kR), lllIlllIl[4])) {
                            String[] strArr14 = new String[lllIlllIl[1]];
                            strArr14[lllIlllIl[0]] = lllIllIll[lllIlllIl[43]];
                            if (llIIlIllIlll(TileObjects.getNearest(strArr14))) {
                                String[] strArr15 = new String[lllIlllIl[1]];
                                strArr15[lllIlllIl[0]] = lllIllIll[lllIlllIl[44]];
                                TileObjects.getNearest(strArr15).interact(lllIllIll[lllIlllIl[45]]);
                                Time.sleepTicks(lllIlllIl[4]);
                                "".length();
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lllIlllIl[1]];
                iArr9[lllIlllIl[0]] = lllIlllIl[24];
                if (llIIlIllIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIlllIl[1]];
                    iArr10[lllIlllIl[0]] = lllIlllIl[46];
                    if (llIIlIllIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                        kN = lllIlllIl[1];
                    }
                }
                if (llIIlIllIlII(kN ? 1 : 0)) {
                    String[] strArr16 = new String[lllIlllIl[1]];
                    strArr16[lllIlllIl[0]] = lllIllIll[lllIlllIl[47]];
                    if (llIIlIllIllI(Equipment.contains(strArr16) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIlllIl[1]];
                        iArr11[lllIlllIl[0]] = lllIlllIl[48];
                        if (llIIlIllIllI(Inventory.contains(iArr11) ? 1 : 0)) {
                            String[] strArr17 = new String[lllIlllIl[1]];
                            strArr17[lllIlllIl[0]] = lllIllIll[lllIlllIl[49]];
                            if (llIIlIllIllI(Inventory.contains(strArr17) ? 1 : 0)) {
                                cQ();
                            }
                            String[] strArr18 = new String[lllIlllIl[1]];
                            strArr18[lllIlllIl[0]] = lllIllIll[lllIlllIl[50]];
                            if (llIIlIllIlII(Inventory.contains(strArr18) ? 1 : 0)) {
                                if (llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kS), lllIlllIl[3])) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[51]];
                                    Movement.walkTo(kS);
                                    "".length();
                                    Time.sleepTicks(lllIlllIl[1]);
                                    "".length();
                                }
                                if (llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kS), lllIlllIl[3])) {
                                    C0006g.a(lllIllIll[lllIlllIl[52]], cG);
                                }
                            }
                        }
                    }
                }
                if (llIIlIllIlII(kN ? 1 : 0)) {
                    int[] iArr12 = new int[lllIlllIl[1]];
                    iArr12[lllIlllIl[0]] = lllIlllIl[48];
                    if (llIIlIllIlII(Inventory.contains(iArr12) ? 1 : 0)) {
                        String[] strArr19 = new String[lllIlllIl[1]];
                        strArr19[lllIlllIl[0]] = lllIllIll[lllIlllIl[53]];
                        if (llIIlIllIllI(Equipment.contains(strArr19) ? 1 : 0)) {
                            int[] iArr13 = new int[lllIlllIl[1]];
                            iArr13[lllIlllIl[0]] = lllIlllIl[24];
                            if (llIIlIllIllI(Inventory.contains(iArr13) ? 1 : 0)) {
                                cQ();
                            }
                            int[] iArr14 = new int[lllIlllIl[1]];
                            iArr14[lllIlllIl[0]] = lllIlllIl[24];
                            if (llIIlIllIlII(Inventory.contains(iArr14) ? 1 : 0)) {
                                WorldArea worldArea2 = new WorldArea(lllIlllIl[21], lllIlllIl[22], lllIlllIl[19], lllIlllIl[18], lllIlllIl[0]);
                                if (llIIlIllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[54]];
                                    Movement.walkTo(kO);
                                    "".length();
                                    Time.sleepTicks(lllIlllIl[1]);
                                    "".length();
                                }
                                if (llIIlIllIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    C0006g.a(lllIllIll[lllIlllIl[55]], cG);
                                }
                            }
                        }
                    }
                }
                String[] strArr20 = new String[lllIlllIl[1]];
                strArr20[lllIlllIl[0]] = lllIllIll[lllIlllIl[56]];
                if (llIIlIllIlII(Equipment.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lllIlllIl[1]];
                    strArr21[lllIlllIl[0]] = lllIllIll[lllIlllIl[57]];
                    if (llIIlIlllllI(NPCs.getNearest(strArr21))) {
                        String[] strArr22 = new String[lllIlllIl[1]];
                        strArr22[lllIlllIl[0]] = lllIllIll[lllIlllIl[58]];
                        if (llIIlIlllllI(NPCs.getNearest(strArr22))) {
                            AccBuilderGWD.c = lllIllIll[lllIlllIl[59]];
                            Movement.walkTo(kT);
                            "".length();
                            Time.sleepTicks(lllIlllIl[1]);
                            "".length();
                        }
                    }
                    String[] strArr23 = new String[lllIlllIl[1]];
                    strArr23[lllIlllIl[0]] = lllIllIll[lllIlllIl[60]];
                    if (llIIlIlllllI(NPCs.getNearest(strArr23))) {
                        String[] strArr24 = new String[lllIlllIl[1]];
                        strArr24[lllIlllIl[0]] = lllIllIll[lllIlllIl[61]];
                    }
                    if (llIIlIlllllI(kU)) {
                        cP();
                    }
                    NPC nearest4 = NPCs.getNearest(npc -> {
                        if (llIIlIllIlII(npc.getName().contains(lllIllIll[lllIlllIl[89]]) ? 1 : 0) && llIIllIIIIII(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = lllIlllIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllIlllIl[0];
                    });
                    if (llIIlIllIlll(nearest4) && llIIlIlllllI(Players.getLocal().getInteracting())) {
                        nearest4.interact(lllIllIll[lllIlllIl[62]]);
                        Time.sleepTicks(lllIlllIl[3]);
                        "".length();
                    }
                    if (llIIlIlllllI(nearest4) && llIIlIlllllI(Players.getLocal().getInteracting())) {
                        String[] strArr25 = new String[lllIlllIl[1]];
                        strArr25[lllIlllIl[0]] = lllIllIll[lllIlllIl[63]];
                        if (llIIlIllIlll(NPCs.getNearest(strArr25))) {
                            String[] strArr26 = new String[lllIlllIl[1]];
                            strArr26[lllIlllIl[0]] = lllIllIll[lllIlllIl[15]];
                            if (llIIlIllIllI(NPCs.getNearest(strArr26).isDead() ? 1 : 0) && llIIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr27 = new String[lllIlllIl[1]];
                                strArr27[lllIlllIl[0]] = lllIllIll[lllIlllIl[64]];
                                NPCs.getNearest(strArr27).interact(lllIllIll[lllIlllIl[65]]);
                            }
                        }
                    }
                    if (llIIlIllIlII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllIll[lllIlllIl[66]];
                        List options = Dialog.getOptions();
                        if (llIIlIllIllI(options.isEmpty() ? 1 : 0)) {
                            int i = lllIlllIl[0];
                            do {
                                if (llIIlIllIlIl(i, options.size())) {
                                    if (llIIlIllIlII(((Widget) options.get(i)).getText().contains(lllIllIll[lllIlllIl[67]]) ? 1 : 0)) {
                                        String[] strArr28 = new String[lllIlllIl[1]];
                                        strArr28[lllIlllIl[0]] = ((Widget) options.get(i)).getText();
                                        Dialog.chooseOption(strArr28);
                                        "".length();
                                        Time.sleepTicks(lllIlllIl[3]);
                                        "".length();
                                        "".length();
                                        if (((36 ^ 48) & ((51 ^ 39) ^ (-1))) <= (-" ".length())) {
                                            return;
                                        }
                                    } else {
                                        i++;
                                        "".length();
                                    }
                                }
                            } while (((((39 + 23) - (-56)) + 35) ^ (((0 + 110) - (-6)) + 41)) != 0);
                            return;
                        }
                    }
                    String[] strArr29 = new String[lllIlllIl[1]];
                    strArr29[lllIlllIl[0]] = lllIllIll[lllIlllIl[68]];
                    if (llIIlIllIlll(NPCs.getNearest(strArr29))) {
                        if (llIIlIllIlIl(dk, lllIlllIl[1]) && llIIlIllIllI(dl ? 1 : 0)) {
                            as.pZ += lllIlllIl[1];
                            as.u(AccBuilderGWD.m);
                            dk += lllIlllIl[1];
                            as.pZ = lllIlllIl[0];
                            dl = lllIlllIl[1];
                        }
                        if (llIIlIllIlII(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = lllIllIll[lllIlllIl[69]];
                            List options2 = Dialog.getOptions();
                            if (llIIlIllIllI(options2.isEmpty() ? 1 : 0)) {
                                int i2 = lllIlllIl[0];
                                while (llIIlIllIlIl(i2, options2.size())) {
                                    String str = kU[i2];
                                    int i3 = lllIlllIl[0];
                                    while (true) {
                                        if (!llIIlIllIlIl(i3, options2.size())) {
                                            break;
                                        } else if (llIIlIllIlII(((Widget) options2.get(i3)).getText().contains(str) ? 1 : 0)) {
                                            System.out.println("Selecting: " + ((Widget) options2.get(i3)).getText());
                                            Time.sleepTicks(lllIlllIl[3]);
                                            "".length();
                                            String[] strArr30 = new String[lllIlllIl[1]];
                                            strArr30[lllIlllIl[0]] = ((Widget) options2.get(i3)).getText();
                                            Dialog.chooseOption(strArr30);
                                            "".length();
                                            Time.sleepTicks(lllIlllIl[12]);
                                            "".length();
                                            "".length();
                                            if ("  ".length() <= 0) {
                                                return;
                                            }
                                        } else {
                                            i3++;
                                            "".length();
                                            if (" ".length() != " ".length()) {
                                                return;
                                            }
                                        }
                                    }
                                    i2++;
                                    "".length();
                                    if ("   ".length() < 0) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0006g.a(cG);
        }
    }

    static {
        llIIlIllIIlI();
        llIIlIllIIII();
        kM = lllIllIll[lllIlllIl[90]];
        kL = new R();
        bx = new ArrayList();
        dg = new WorldPoint(lllIlllIl[91], lllIlllIl[92], lllIlllIl[0]);
        kO = new WorldPoint(lllIlllIl[93], lllIlllIl[94], lllIlllIl[0]);
        kP = new WorldPoint(lllIlllIl[93], lllIlllIl[95], lllIlllIl[3]);
        kQ = new WorldPoint(lllIlllIl[96], lllIlllIl[97], lllIlllIl[0]);
        kR = new WorldPoint(lllIlllIl[96], lllIlllIl[98], lllIlllIl[0]);
        kS = new WorldPoint(lllIlllIl[99], lllIlllIl[100], lllIlllIl[1]);
        kT = new WorldPoint(lllIlllIl[101], lllIlllIl[102], lllIlllIl[0]);
        String[] strArr = new String[lllIlllIl[31]];
        strArr[lllIlllIl[0]] = lllIllIll[lllIlllIl[103]];
        strArr[lllIlllIl[1]] = lllIllIll[lllIlllIl[104]];
        strArr[lllIlllIl[3]] = lllIllIll[lllIlllIl[105]];
        strArr[lllIlllIl[5]] = lllIllIll[lllIlllIl[106]];
        strArr[lllIlllIl[4]] = lllIllIll[lllIlllIl[107]];
        strArr[lllIlllIl[10]] = lllIllIll[lllIlllIl[108]];
        strArr[lllIlllIl[16]] = lllIllIll[lllIlllIl[109]];
        strArr[lllIlllIl[18]] = lllIllIll[lllIlllIl[110]];
        strArr[lllIlllIl[19]] = lllIllIll[lllIlllIl[111]];
        strArr[lllIlllIl[20]] = lllIllIll[lllIlllIl[112]];
        strArr[lllIlllIl[12]] = lllIllIll[lllIlllIl[113]];
        strArr[lllIlllIl[23]] = lllIllIll[lllIlllIl[114]];
        strArr[lllIlllIl[25]] = lllIllIll[lllIlllIl[115]];
        strArr[lllIlllIl[26]] = lllIllIll[lllIlllIl[116]];
        strArr[lllIlllIl[27]] = lllIllIll[lllIlllIl[117]];
        strArr[lllIlllIl[28]] = lllIllIll[lllIlllIl[118]];
        strArr[lllIlllIl[29]] = lllIllIll[lllIlllIl[119]];
        strArr[lllIlllIl[30]] = lllIllIll[lllIlllIl[120]];
        cG = strArr;
    }

    private static void cQ() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIlIllIlll(nearest) && llIIlIllIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIll[lllIlllIl[76]];
            C0000a.a(nearest);
        }
        if (llIIlIllIlll(nearest) && llIIlIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllIlllIl[2]);
                "".length();
                Time.sleepTicks(lllIlllIl[5]);
                "".length();
            }
            if (llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = lllIllIll[lllIlllIl[77]];
                if (llIIlIllIlII(kN ? 1 : 0)) {
                    int[] iArr = new int[lllIlllIl[1]];
                    iArr[lllIlllIl[0]] = lllIlllIl[48];
                    if (llIIlIllIllI(Inventory.contains(iArr) ? 1 : 0) && llIIlIlllIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIlllIl[4]);
                        "".length();
                    }
                }
                if (llIIlIlllIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lllIlllIl[3]);
                    "".length();
                }
                if (llIIlIllIlII(kN ? 1 : 0)) {
                    int[] iArr2 = new int[lllIlllIl[1]];
                    iArr2[lllIlllIl[0]] = lllIlllIl[48];
                    if (llIIlIllIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                        C0000a.a(lllIlllIl[11], lllIlllIl[1]);
                        C0000a.a(lllIlllIl[6], lllIlllIl[12]);
                        C0000a.a(lllIlllIl[48], lllIlllIl[1]);
                        C0000a.a(lllIlllIl[24], lllIlllIl[1]);
                        C0000a.a(lllIlllIl[46], lllIlllIl[1]);
                        Time.sleepTicks(lllIlllIl[1]);
                        "".length();
                        int[] iArr3 = new int[lllIlllIl[1]];
                        iArr3[lllIlllIl[0]] = lllIlllIl[11];
                        if (llIIlIllIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            C0000a.a(lllIlllIl[78], lllIlllIl[1]);
                        }
                        C0000a.a(lllIlllIl[17], Inventory.getFreeSlots() - lllIlllIl[1]);
                    }
                }
                if (llIIlIllIlII(kN ? 1 : 0)) {
                    int[] iArr4 = new int[lllIlllIl[1]];
                    iArr4[lllIlllIl[0]] = lllIlllIl[48];
                    if (llIIlIllIllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        if (llIIlIllIllI(Equipment.contains(C0005f.aY) ? 1 : 0) && llIIlIllIllI(Inventory.contains(C0005f.aY) ? 1 : 0)) {
                            C0000a.b(C0005f.aY, lllIlllIl[1]);
                        }
                        if (llIIlIllIlII(Inventory.contains(C0005f.aY) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aY).interact(lllIllIll[lllIlllIl[79]]);
                            Time.sleepTicks(lllIlllIl[5]);
                            "".length();
                        }
                        if (llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lllIlllIl[10]);
                            "".length();
                        }
                        if (llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a(lllIlllIl[11], lllIlllIl[1]);
                            C0000a.a(lllIlllIl[6], lllIlllIl[12]);
                            C0000a.a(lllIlllIl[7], lllIlllIl[9]);
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIlIlllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIlIlllIII(int i) {
        return i > 0;
    }

    private static void llIIlIllIIII() {
        lllIllIll = new String[lllIlllIl[121]];
        lllIllIll[lllIlllIl[0]] = llIIlIIllIlI("IjE4AjgMPTJLKREhPwUsRDEiDiYXdHYYPA0sNQMiCj92CSoHM3YfJEQpIw44EA==", "dXVkK");
        lllIllIll[lllIlllIl[1]] = llIIlIIllIlI("CSc1ZC4oZiElNCw=", "GFCDZ");
        lllIllIll[lllIlllIl[3]] = llIIlIIllIlI("PCAtPh4dLyR6EBUvKDMcEw==", "tACZr");
        lllIllIll[lllIlllIl[5]] = llIIlIIllIll("j+C/cxolTIIY792aPVX66sTFplwEk8+3CL2VJA+2Oegc9u9dvYNXF39cclMHar9ARBHqeOM2So4=", "ktPoP");
        lllIllIll[lllIlllIl[4]] = llIIlIIlllII("NIx/d4sAW+4LP3cJMLqYqVZDhLsJPS2H5F86XgJQjAvmWpbevAkK8o+Zyom1yANj2FKBelgYxHU=", "nefwd");
        lllIllIll[lllIlllIl[10]] = llIIlIIlllII("EUel/TyQmEo=", "WUKxA");
        lllIllIll[lllIlllIl[16]] = llIIlIIllIll("1bVXFs2ojeI=", "CcAgN");
        lllIllIll[lllIlllIl[18]] = llIIlIIlllII("20iJHmi50VE=", "cIlko");
        lllIllIll[lllIlllIl[19]] = llIIlIIlllII("/1yIUqO4OZghegm2xPFuVQ==", "fLLlX");
        lllIllIll[lllIlllIl[20]] = llIIlIIlllII("TflN72XPrP0=", "bMbTw");
        lllIllIll[lllIlllIl[12]] = llIIlIIllIlI("DCkgUBotaCUZHGI4LwIdKyY=", "BHVpn");
        lllIllIll[lllIlllIl[23]] = llIIlIIlllII("9vVSs6UyhI3/DBHQYzaCFQ==", "kWxOf");
        lllIllIll[lllIlllIl[25]] = llIIlIIllIll("HjWCsESd1BtjvwXehpHyKw==", "QOZab");
        lllIllIll[lllIlllIl[26]] = llIIlIIllIll("Am8vInheuaHJMZTBhRVR2A==", "bcMjJ");
        lllIllIll[lllIlllIl[27]] = llIIlIIlllII("PgGMM8BWhwBePPPo5urymA==", "JLOcl");
        lllIllIll[lllIlllIl[28]] = llIIlIIllIlI("EwEvDA4lVCMBSyYVOAIZ", "QtLgk");
        lllIllIll[lllIlllIl[29]] = llIIlIIllIlI("AQUQRAEgRAIWFCYK", "Odfdu");
        lllIllIll[lllIlllIl[30]] = llIIlIIllIlI("Aww7CDQ1WTcFcTYYLAYj", "AyXcQ");
        lllIllIll[lllIlllIl[31]] = llIIlIIlllII("ZjnVXgvEvAA=", "BlzmN");
        lllIllIll[lllIlllIl[32]] = llIIlIIllIll("UTqGPvVZv0i4PhskKP+e1A==", "jofWh");
        lllIllIll[lllIlllIl[33]] = llIIlIIllIlI("KQYubTUIRysoNgIVeCYkHg==", "ggXMA");
        lllIllIll[lllIlllIl[34]] = llIIlIIlllII("apZlhfABlNo=", "rytyn");
        lllIllIll[lllIlllIl[35]] = llIIlIIllIlI("FyQ5Kzw2IA==", "ZEWCS");
        lllIllIll[lllIlllIl[36]] = llIIlIIlllII("38VZwcaAD9A=", "mzjQF");
        lllIllIll[lllIlllIl[37]] = llIIlIIlllII("gkdRxZVIgNU=", "kkHSC");
        lllIllIll[lllIlllIl[9]] = llIIlIIllIlI("OSMrCA==", "vSNfx");
        lllIllIll[lllIlllIl[38]] = llIIlIIllIlI("FRskDyc0Hw==", "XzJgH");
        lllIllIll[lllIlllIl[39]] = llIIlIIllIll("dkSfvsOzCBI=", "lflYY");
        lllIllIll[lllIlllIl[40]] = llIIlIIlllII("IYJn29EnUp8y0g+BvOLJRw==", "dqNRS");
        lllIllIll[lllIlllIl[41]] = llIIlIIlllII("YIvlM0J+v5M=", "IVvxM");
        lllIllIll[lllIlllIl[42]] = llIIlIIllIlI("BQEKPg1rCQwkAQ==", "FmcSo");
        lllIllIll[lllIlllIl[43]] = llIIlIIllIlI("KhsDDDJYBRUB", "xnpxK");
        lllIllIll[lllIlllIl[44]] = llIIlIIlllII("6Sjt0cw7MZyH1eZxdYDsSA==", "wXBdy");
        lllIllIll[lllIlllIl[45]] = llIIlIIllIlI("BwwuKw==", "SmENh");
        lllIllIll[lllIlllIl[47]] = llIIlIIllIlI("Mg81PyQTCjAuKRU=", "afYIA");
        lllIllIll[lllIlllIl[49]] = llIIlIIllIll("iSf6jlzu/38=", "DTDFo");
        lllIllIll[lllIlllIl[50]] = llIIlIIllIll("WfrgfP1/HnA=", "EAoZS");
        lllIllIll[lllIlllIl[51]] = llIIlIIllIll("jkKcp7hG6FlD/FCHnlclPw==", "XBZIU");
        lllIllIll[lllIlllIl[52]] = llIIlIIlllII("3xK82hHnht2AVM5X1hFFeA==", "YIkrq");
        lllIllIll[lllIlllIl[53]] = llIIlIIllIlI("HwMCDgk+BgcfBDg=", "Ljnxl");
        lllIllIll[lllIlllIl[54]] = llIIlIIllIll("2VB6oiYUD2YT47qmTxJVtTsL1Uoza5CJ", "xaQjn");
        lllIllIll[lllIlllIl[55]] = llIIlIIlllII("1gy8etpWacop6nCkQijhPA==", "GDmhG");
        lllIllIll[lllIlllIl[56]] = llIIlIIlllII("78pImYU+VxU8AkUFxPZ1bg==", "UYDDL");
        lllIllIll[lllIlllIl[57]] = llIIlIIllIll("OtgAVuv63zE=", "BBCNl");
        lllIllIll[lllIlllIl[58]] = llIIlIIlllII("LGCPqUWVkOG2jS1xjByXbPc2M2gGJA5r", "paTpZ");
        lllIllIll[lllIlllIl[59]] = llIIlIIllIll("tPSLihVpxPPrYKywr+ngSQ==", "zMaFq");
        lllIllIll[lllIlllIl[60]] = llIIlIIlllII("f8Otw687+gk=", "RBMjc");
        lllIllIll[lllIlllIl[61]] = llIIlIIllIlI("GjQYPgwjNB11LSg9CzwdJQ==", "MQyUi");
        lllIllIll[lllIlllIl[62]] = llIIlIIllIlI("BSAnNDQv", "DTSUW");
        lllIllIll[lllIlllIl[63]] = llIIlIIlllII("vkC0JkBQ4YY=", "SGfce");
        lllIllIll[lllIlllIl[15]] = llIIlIIlllII("CF5cpFT7zpk=", "FisRf");
        lllIllIll[lllIlllIl[64]] = llIIlIIllIll("Cw1D0sNtTHQ=", "EIpWD");
        lllIllIll[lllIlllIl[65]] = llIIlIIllIlI("OA0RLikS", "yyeOJ");
        lllIllIll[lllIlllIl[66]] = llIIlIIlllII("UED6/DGsLC47QK0JrmmgAg==", "dhgFx");
        lllIllIll[lllIlllIl[67]] = llIIlIIllIll("2mouZNYGmYY=", "TuVIO");
        lllIllIll[lllIlllIl[68]] = llIIlIIlllII("Uo06ZovmrfCu2hmcq+NjQQX9q+gwkE7G", "WKZjf");
        lllIllIll[lllIlllIl[69]] = llIIlIIllIll("IRHhmW5WcilKoHBUgZul+w==", "UNwuk");
        lllIllIll[lllIlllIl[75]] = llIIlIIllIlI("eVY=", "Uvalm");
        lllIllIll[lllIlllIl[76]] = llIIlIIllIlI("HCg0bSY9aSAsPDk=", "RIBMR");
        lllIllIll[lllIlllIl[77]] = llIIlIIlllII("TMvTcSfIaez+ZGMvThxStkBqF8tr+XBL", "qUKwu");
        lllIllIll[lllIlllIl[79]] = llIIlIIlllII("MH5wkv5VCig=", "RSQLl");
        lllIllIll[lllIlllIl[87]] = llIIlIIllIlI("Ew0OFxd3Ow8ZADIa", "Whcxy");
        lllIllIll[lllIlllIl[88]] = llIIlIIlllII("FIaicko4XUzdhYn7yTuLDjSJDO02exfm", "AwoRY");
        lllIllIll[lllIlllIl[89]] = llIIlIIllIlI("PxkJCxAs", "Hpsjb");
        lllIllIll[lllIlllIl[90]] = llIIlIIllIll("GC2J74XXu25uRyYzQ68pdrOAacvJ7RYbd7ixHzbajYJpe+L3IOvqig==", "PeGjq");
        lllIllIll[lllIlllIl[103]] = llIIlIIlllII("e1dDljgaLI0=", "vllrv");
        lllIllIll[lllIlllIl[104]] = llIIlIIlllII("1d3OWnfTPSdfdCz/Y1V5D9a4gUt1uYOr", "lmYhg");
        lllIllIll[lllIlllIl[105]] = llIIlIIlllII("TfhUjbOcAIGMMQFa5mv84Zsrg0VY2Fu+ZYeycrTTugwSafKy5VMU0WXXdUOF/udb", "VWNDh");
        lllIllIll[lllIlllIl[106]] = llIIlIIllIlI("OAVDID0cSgchNks9AiQ+EkoIIT4HSictPhkDFyBt", "kjcHR");
        lllIllIll[lllIlllIl[107]] = llIIlIIllIlI("NBowOEsKAXE4AwZSPC0MChEwIEsKHDItBRcTJSUEDU0=", "crQLk");
        lllIllIll[lllIlllIl[108]] = llIIlIIllIll("JIppLBognOEyjAGIpFwVYTkYybbcYFffhPnwKexRcDjz5kOwSrzbkfz+NyA9uGGX", "IDuiG");
        lllIllIll[lllIlllIl[109]] = llIIlIIllIlI("O3oAJiAWehosZRQzACdlITMCNSAANgckLQZ0", "rZnCE");
        lllIllIll[lllIlllIl[110]] = llIIlIIllIll("siwQNcyDQ2gQma2ANJaB5abWw0KePjiXewsxKHIeqbQ/nJWrRtTrTOp9wF7b3fkKwerNCd4bfbw=", "jsQFW");
        lllIllIll[lllIlllIl[111]] = llIIlIIllIll("fOZonpP/WdA5MPiSmJO9q2csBss+IwBV", "nLnGN");
        lllIllIll[lllIlllIl[112]] = llIIlIIllIlI("ECsRTy9pJQwAEWVuABoSaToKBhVpJxFPDyQ+DR0SKCAWQQ==", "INbof");
        lllIllIll[lllIlllIl[113]] = llIIlIIllIll("28YBPbmqaByaXwuSagvageBKHAOYANkBFW4QwaUR6QOsbZbWmSdkQSdoXvbuw84d", "QSoal");
        lllIllIll[lllIlllIl[114]] = llIIlIIllIll("+EZjnNVQsavEOn7Al7d+HQ==", "aotNY");
        lllIllIll[lllIlllIl[115]] = llIIlIIlllII("Qc5DuwylsoG1pPwspDrhvaxRkjMRwuxZPkxorz/knhrYsV2KSd29RFjv83vrWpUKNno80xzYaRxx4/XioovUlA==", "rYAZt");
        lllIllIll[lllIlllIl[116]] = llIIlIIllIlI("ESU5aTswNTggBWI/KiAPYjUkPEs1Iz4lD2IrIj8OYiEuaR8qKWsiDjti", "BLKIk");
        lllIllIll[lllIlllIl[117]] = llIIlIIllIll("1HpSsnxgOd0xl/3xWSkMjeG0HDG0/xXwB3rotamyBrN98lCqScfZPU8ZPacM2Y8i", "VzbzK");
        lllIllIll[lllIlllIl[118]] = llIIlIIllIll("OOw8g/lv+6hD5hp8nWNOB75q6F84iNPkmcHQ0YleepQ=", "ROvIb");
        lllIllIll[lllIlllIl[119]] = llIIlIIllIlI("OCoJOUFPJwQjCE82CiBNCCARdQwBNkU+CBY8RT4DACwOPAMIbwQnAhohAWo=", "oOeUm");
        lllIllIll[lllIlllIl[120]] = llIIlIIllIlI("E147Okk9HCN2HTIcdzQGNBwkdg81C3cvBi9X", "ZyWVi");
    }

    private static String llIIlIIllIll(String llIlIIIIllIlI, String llIlIIIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIIllIIl.getBytes(StandardCharsets.UTF_8)), lllIlllIl[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIIllIll) {
            llIlIIIIllIll.printStackTrace();
            return null;
        }
    }
}
