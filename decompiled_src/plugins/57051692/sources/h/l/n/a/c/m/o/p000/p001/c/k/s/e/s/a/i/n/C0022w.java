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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/w.class */
public class C0022w implements K {
    private static /* synthetic */ WorldPoint dF;
    static /* synthetic */ int dc;
    private static /* synthetic */ WorldPoint dE;
    static /* synthetic */ boolean dd;
    static /* synthetic */ WorldArea dz;
    private static /* synthetic */ WorldPoint dD;
    private static /* synthetic */ WorldPoint dC;
    static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ WorldPoint cV;
    private static /* synthetic */ int[] lIlIIlIIlI;
    private static /* synthetic */ String[] lIlIIlIIIl;
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ WorldPoint dB;
    private static /* synthetic */ int dG;
    static /* synthetic */ boolean dA;

    private static boolean lIIIlIllIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIlIIlI[2];
    }

    private static void lIIIlIllIlIll() {
        lIlIIlIIlI = new int[87];
        lIlIIlIIlI[0] = (((133 + 57) - 121) + 136) ^ (((158 + 131) - 96) + 6);
        lIlIIlIIlI[1] = " ".length();
        lIlIIlIIlI[2] = (82 ^ 0) & ((68 ^ 22) ^ (-1));
        lIlIIlIIlI[3] = "  ".length();
        lIlIIlIIlI[4] = (-((-25003) & 27131)) & (-16424) & 23551;
        lIlIIlIIlI[5] = "   ".length();
        lIlIIlIIlI[6] = (88 ^ 14) ^ (244 ^ 166);
        lIlIIlIIlI[7] = (((98 + 16) - 104) + 134) ^ (((132 + 73) - 169) + 115);
        lIlIIlIIlI[8] = (-((-21219) & 29435)) & (-16417) & 32639;
        lIlIIlIIlI[9] = (-15430) & 16381;
        lIlIIlIIlI[10] = (-((-17083) & 32507)) & (-16397) & 32127;
        lIlIIlIIlI[11] = (-14979) & 15291;
        lIlIIlIIlI[12] = (-27042) & 28591;
        lIlIIlIIlI[13] = (((150 + 167) - 292) + 148) ^ (((34 + 69) - 90) + 155);
        lIlIIlIIlI[14] = (-((-5506) & 13751)) & (-1) & 16255;
        lIlIIlIIlI[15] = (113 ^ 4) ^ (6 ^ 117);
        lIlIIlIIlI[16] = (-(((61 + 67) - 11) + 56)) & (-1025) & 13821;
        lIlIIlIIlI[17] = (-((-2297) & 15609)) & (-2077) & 16383;
        lIlIIlIIlI[18] = (-((-4409) & 23867)) & (-21) & 20478;
        lIlIIlIIlI[19] = 103 ^ 85;
        lIlIIlIIlI[20] = ((51 ^ 21) & ((102 ^ 64) ^ (-1))) ^ (115 ^ 104);
        lIlIIlIIlI[21] = 94 ^ 82;
        lIlIIlIIlI[22] = (71 ^ 22) ^ (93 ^ 4);
        lIlIIlIIlI[23] = 100 ^ 109;
        lIlIIlIIlI[24] = (111 ^ 17) ^ (220 ^ 169);
        lIlIIlIIlI[25] = 86 ^ 91;
        lIlIIlIIlI[26] = (((115 + 156) - 189) + 83) ^ (((89 + 159) - 169) + 92);
        lIlIIlIIlI[27] = (100 ^ 96) ^ (186 ^ 177);
        lIlIIlIIlI[28] = (151 ^ 189) ^ (157 ^ 167);
        lIlIIlIIlI[29] = 98 ^ 115;
        lIlIIlIIlI[30] = 33 ^ 51;
        lIlIIlIIlI[31] = (34 ^ 77) ^ (97 ^ 29);
        lIlIIlIIlI[32] = 150 ^ 130;
        lIlIIlIIlI[33] = (57 ^ 120) ^ (217 ^ 141);
        lIlIIlIIlI[34] = (45 ^ 33) ^ (43 ^ 49);
        lIlIIlIIlI[35] = 87 ^ 64;
        lIlIIlIIlI[36] = 81 ^ 73;
        lIlIIlIIlI[37] = (((124 + 48) - 54) + 17) ^ (((151 + 82) - 131) + 56);
        lIlIIlIIlI[38] = 117 ^ 111;
        lIlIIlIIlI[39] = 164 ^ 184;
        lIlIIlIIlI[40] = (253 ^ 154) ^ (94 ^ 36);
        lIlIIlIIlI[41] = 141 ^ 147;
        lIlIIlIIlI[42] = 1 ^ 30;
        lIlIIlIIlI[43] = (-12296) & 16375;
        lIlIIlIIlI[44] = 90 ^ 122;
        lIlIIlIIlI[45] = 19 ^ 50;
        lIlIIlIIlI[46] = (((94 + 141) - 227) + 144) ^ (((110 + 104) - 104) + 76);
        lIlIIlIIlI[47] = (66 ^ 102) ^ (93 ^ 90);
        lIlIIlIIlI[48] = 21 ^ 49;
        lIlIIlIIlI[49] = 78 ^ 107;
        lIlIIlIIlI[50] = (30 ^ 19) ^ (0 ^ 43);
        lIlIIlIIlI[51] = (158 ^ 197) ^ (69 ^ 57);
        lIlIIlIIlI[52] = 108 ^ 68;
        lIlIIlIIlI[53] = 239 ^ 198;
        lIlIIlIIlI[54] = 30 ^ 52;
        lIlIIlIIlI[55] = (61 ^ 89) ^ (52 ^ 123);
        lIlIIlIIlI[56] = 131 ^ 175;
        lIlIIlIIlI[57] = (-21588) & 30587;
        lIlIIlIIlI[58] = (-11778) & 12277;
        lIlIIlIIlI[59] = (-((-9925) & 30711)) & (-1) & 32766;
        lIlIIlIIlI[60] = (-2644) & 27643;
        lIlIIlIIlI[61] = (-22625) & 23524;
        lIlIIlIIlI[62] = 51 ^ 87;
        lIlIIlIIlI[63] = (9 ^ 102) ^ (2 ^ 64);
        lIlIIlIIlI[64] = 10 ^ 36;
        lIlIIlIIlI[65] = (-((-6242) & 31095)) & (-1185) & 28669;
        lIlIIlIIlI[66] = (-((-1394) & 2035)) & (-16389) & 20463;
        lIlIIlIIlI[67] = (181 ^ 189) ^ (39 ^ 0);
        lIlIIlIIlI[68] = 59 ^ 11;
        lIlIIlIIlI[69] = 9 ^ 56;
        lIlIIlIIlI[70] = (31 ^ 74) ^ (27 ^ 125);
        lIlIIlIIlI[71] = 73 ^ 125;
        lIlIIlIIlI[72] = 35 ^ 22;
        lIlIIlIIlI[73] = (102 ^ 49) ^ (234 ^ 139);
        lIlIIlIIlI[74] = (-((-12441) & 28921)) & (-12417) & 31715;
        lIlIIlIIlI[75] = (-12379) & 15866;
        lIlIIlIIlI[76] = (-((-3333) & 15749)) & (-281) & 15355;
        lIlIIlIIlI[77] = (-12370) & 15869;
        lIlIIlIIlI[78] = (-((-531) & 18331)) & (-17) & 20447;
        lIlIIlIIlI[79] = (-28689) & 32182;
        lIlIIlIIlI[80] = (-((-395) & 20907)) & (-8202) & 31357;
        lIlIIlIIlI[81] = (-8718) & 12159;
        lIlIIlIIlI[82] = (-29826) & 32463;
        lIlIIlIIlI[83] = (-24587) & 28031;
        lIlIIlIIlI[84] = (-((-545) & 26543)) & (-33) & 28671;
        lIlIIlIIlI[85] = (-((-18725) & 27557)) & (-20481) & 32751;
        lIlIIlIIlI[86] = 137 ^ 190;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIlIIIl[lIlIIlIIlI[63]];
    }

    private static boolean lIIIlIlllIIIl(int i) {
        return i > 0;
    }

    private static String lIIIlIllIlIIl(String llllllllllllllllllllIIllIIlIlIII, String llllllllllllllllllllIIllIIlIIlll) {
        String llllllllllllllllllllIIllIIlIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllllllllIIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllllIIllIIlIIlIl = llllllllllllllllllllIIllIIlIIlll.toCharArray();
        int llllllllllllllllllllIIllIIlIIlII = lIlIIlIIlI[2];
        char[] charArray = llllllllllllllllllllIIllIIlIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIlI[2];
        while (lIIIlIllIllII(i, length)) {
            char llllllllllllllllllllIIllIIlIlIIl = charArray[i];
            sb.append((char) (llllllllllllllllllllIIllIIlIlIIl ^ llllllllllllllllllllIIllIIlIIlIl[llllllllllllllllllllIIllIIlIIlII % llllllllllllllllllllIIllIIlIIlIl.length]));
            "".length();
            llllllllllllllllllllIIllIIlIIlII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIlIllIIlll(String llllllllllllllllllllIIllIIIlIIll, String llllllllllllllllllllIIllIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIllIIIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIllIIIlIlIl.init(lIlIIlIIlI[3], secretKeySpec);
            return new String(llllllllllllllllllllIIllIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIllIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIllIIIlIlII) {
            llllllllllllllllllllIIllIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlllIIII(Object obj) {
        return obj != null;
    }

    static {
        lIIIlIllIlIll();
        lIIIlIllIlIlI();
        bp = new ArrayList();
        dz = new WorldArea(lIlIIlIIlI[65], lIlIIlIIlI[66], lIlIIlIIlI[24], lIlIIlIIlI[25], lIlIIlIIlI[2]);
        String[] strArr = new String[lIlIIlIIlI[22]];
        strArr[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[67]];
        strArr[lIlIIlIIlI[1]] = lIlIIlIIIl[lIlIIlIIlI[68]];
        strArr[lIlIIlIIlI[3]] = lIlIIlIIIl[lIlIIlIIlI[69]];
        strArr[lIlIIlIIlI[5]] = lIlIIlIIIl[lIlIIlIIlI[19]];
        strArr[lIlIIlIIlI[6]] = lIlIIlIIIl[lIlIIlIIlI[70]];
        strArr[lIlIIlIIlI[13]] = lIlIIlIIIl[lIlIIlIIlI[71]];
        strArr[lIlIIlIIlI[15]] = lIlIIlIIIl[lIlIIlIIlI[72]];
        strArr[lIlIIlIIlI[7]] = lIlIIlIIIl[lIlIIlIIlI[73]];
        cy = strArr;
        cV = new WorldPoint(lIlIIlIIlI[74], lIlIIlIIlI[75], lIlIIlIIlI[2]);
        dB = new WorldPoint(lIlIIlIIlI[76], lIlIIlIIlI[77], lIlIIlIIlI[2]);
        dC = new WorldPoint(lIlIIlIIlI[78], lIlIIlIIlI[79], lIlIIlIIlI[2]);
        dD = new WorldPoint(lIlIIlIIlI[80], lIlIIlIIlI[81], lIlIIlIIlI[2]);
        dE = new WorldPoint(lIlIIlIIlI[82], lIlIIlIIlI[83], lIlIIlIIlI[2]);
        dF = new WorldPoint(lIlIIlIIlI[84], lIlIIlIIlI[85], lIlIIlIIlI[2]);
        dG = lIlIIlIIlI[24];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlIllIllIl(C0004e.j(dG), lIlIIlIIlI[13])) {
            ?? r0 = lIlIIlIIlI[1];
            "".length();
            return " ".length() < 0 ? ((118 ^ 45) ^ (31 ^ 102)) & (((123 ^ 43) ^ (207 ^ 189)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIIlI[2];
    }

    private static void O() {
        int[] iArr = new int[lIlIIlIIlI[1]];
        iArr[lIlIIlIIlI[2]] = lIlIIlIIlI[12];
        if (lIIIlIllIllll(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[12], lIlIIlIIlI[1], lIlIIlIIlI[57]));
            "".length();
        }
        int[] iArr2 = new int[lIlIIlIIlI[1]];
        iArr2[lIlIIlIIlI[2]] = lIlIIlIIlI[10];
        if (lIIIlIllIllll(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[10], lIlIIlIIlI[1], lIlIIlIIlI[4]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIlIIlI[1]];
        iArr3[lIlIIlIIlI[2]] = lIlIIlIIlI[9];
        if (lIIIlIllIllll(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[9], lIlIIlIIlI[1], lIlIIlIIlI[4]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIlIIlI[1]];
        iArr4[lIlIIlIIlI[2]] = lIlIIlIIlI[14];
        if (lIIIlIllIllll(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[14], lIlIIlIIlI[24], lIlIIlIIlI[4]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIlIIlI[1]];
        iArr5[lIlIIlIIlI[2]] = lIlIIlIIlI[16];
        if (lIIIlIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[16], lIlIIlIIlI[24], C0009j.bZ));
            "".length();
        }
        int[] iArr6 = new int[lIlIIlIIlI[1]];
        iArr6[lIlIIlIIlI[2]] = lIlIIlIIlI[11];
        if (lIIIlIllIllll(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[11], lIlIIlIIlI[0], lIlIIlIIlI[58]));
            "".length();
        }
        if (lIIIlIllIllll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIlIIIl[lIlIIlIIlI[64]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[59], lIlIIlIIlI[13], lIlIIlIIlI[60]));
            "".length();
        }
        int[] iArr7 = new int[lIlIIlIIlI[1]];
        iArr7[lIlIIlIIlI[2]] = lIlIIlIIlI[8];
        if (lIIIlIllIllll(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIIlI[8], lIlIIlIIlI[52], lIlIIlIIlI[61]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        int[] iArr = new int[lIlIIlIIlI[1]];
        iArr[lIlIIlIIlI[2]] = lIlIIlIIlI[8];
        if (lIIIlIlllIIIl(Inventory.getCount(iArr))) {
            String[] strArr = new String[lIlIIlIIlI[1]];
            strArr[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[52]];
            if (lIIIlIlllIIIl(Inventory.getCount(strArr))) {
                String[] strArr2 = new String[lIlIIlIIlI[1]];
                strArr2[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[53]];
                if (lIIIlIlllIIIl(Inventory.getCount(strArr2))) {
                    String[] strArr3 = new String[lIlIIlIIlI[1]];
                    strArr3[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[54]];
                    if (lIIIlIlllIIIl(Inventory.getCount(strArr3))) {
                        String[] strArr4 = new String[lIlIIlIIlI[1]];
                        strArr4[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[55]];
                        if (lIIIlIlllIIIl(Inventory.getCount(strArr4))) {
                            String[] strArr5 = new String[lIlIIlIIlI[1]];
                            strArr5[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[56]];
                            if (lIIIlIlllIIIl(Inventory.getCount(strArr5))) {
                                int[] iArr2 = new int[lIlIIlIIlI[1]];
                                iArr2[lIlIIlIIlI[2]] = lIlIIlIIlI[17];
                                if (lIIIlIlllIIIl(Inventory.getCount(iArr2)) && lIIIlIllIlllI(Inventory.contains(C0005f.aU) ? 1 : 0)) {
                                    ?? r0 = lIlIIlIIlI[1];
                                    "".length();
                                    return !((true ^ true) ^ (true ^ true)) ? ((65 ^ 89) ^ (249 ^ 172)) & (((((61 + 178) - 116) + 105) ^ (((142 + 134) - 259) + 152)) ^ (-" ".length())) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIlIIlIIlI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v294, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public static void bi() {
        if (lIIIlIllIllII(Skills.getLevel(Skill.FISHING), lIlIIlIIlI[0])) {
            W.dE();
        }
        if (lIIIlIllIllIl(Skills.getLevel(Skill.FISHING), lIlIIlIIlI[0])) {
            if (lIIIlIllIlllI(bn ? 1 : 0)) {
                C0001b.a(bp);
                if (lIIIlIllIllII(bp.size(), lIlIIlIIlI[1])) {
                    System.out.println(lIlIIlIIIl[lIlIIlIIlI[2]]);
                    bn = lIlIIlIIlI[2];
                }
            }
            if (lIIIlIllIllll(bn ? 1 : 0)) {
                if (lIIIlIllIllll(al() ? 1 : 0) && lIIIlIllIllII(C0004e.j(dG), lIlIIlIIlI[1])) {
                    String[] strArr = new String[lIlIIlIIlI[1]];
                    strArr[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[1]];
                    if (lIIIlIllIllll(Inventory.contains(strArr) ? 1 : 0)) {
                        BankLocation nearest = BankLocation.getNearest();
                        if (lIIIlIlllIIII(nearest) && lIIIlIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[3]];
                            C0000a.a(nearest);
                        }
                        if (lIIIlIlllIIII(nearest) && lIIIlIllIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIIlIllIllll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, lIlIIlIIlI[4]);
                                "".length();
                            }
                            if (lIIIlIllIlllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[5]];
                                if (lIIIlIlllIIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks(lIlIIlIIlI[6]);
                                    "".length();
                                }
                                if (lIIIlIlllIIIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks(lIlIIlIIlI[3]);
                                    "".length();
                                }
                                int[] iArr = new int[lIlIIlIIlI[7]];
                                iArr[lIlIIlIIlI[2]] = lIlIIlIIlI[8];
                                iArr[lIlIIlIIlI[1]] = lIlIIlIIlI[9];
                                iArr[lIlIIlIIlI[3]] = lIlIIlIIlI[10];
                                iArr[lIlIIlIIlI[5]] = lIlIIlIIlI[11];
                                iArr[lIlIIlIIlI[6]] = lIlIIlIIlI[12];
                                iArr[lIlIIlIIlI[13]] = lIlIIlIIlI[14];
                                iArr[lIlIIlIIlI[15]] = lIlIIlIIlI[16];
                                if (lIIIlIllIllll(C0004e.b(iArr) ? 1 : 0)) {
                                    O();
                                    System.out.println(lIlIIlIIIl[lIlIIlIIlI[6]]);
                                    bn = lIlIIlIIlI[1];
                                    return;
                                }
                                int[] iArr2 = new int[lIlIIlIIlI[15]];
                                iArr2[lIlIIlIIlI[2]] = lIlIIlIIlI[8];
                                iArr2[lIlIIlIIlI[1]] = lIlIIlIIlI[9];
                                iArr2[lIlIIlIIlI[3]] = lIlIIlIIlI[10];
                                iArr2[lIlIIlIIlI[5]] = lIlIIlIIlI[11];
                                iArr2[lIlIIlIIlI[6]] = lIlIIlIIlI[12];
                                iArr2[lIlIIlIIlI[13]] = lIlIIlIIlI[14];
                                if (lIIIlIllIlllI(C0004e.b(iArr2) ? 1 : 0)) {
                                    C0000a.a(lIlIIlIIlI[8], lIlIIlIIlI[0]);
                                    C0000a.a(lIlIIlIIlI[14], lIlIIlIIlI[0]);
                                    C0000a.a(lIlIIlIIlI[9], lIlIIlIIlI[1]);
                                    C0000a.a(lIlIIlIIlI[10], lIlIIlIIlI[1]);
                                    C0000a.a(lIlIIlIIlI[11], lIlIIlIIlI[0]);
                                    C0000a.a(lIlIIlIIlI[12], lIlIIlIIlI[1]);
                                    C0000a.a(lIlIIlIIlI[16], lIlIIlIIlI[5]);
                                    C0000a.a(lIlIIlIIlI[17], lIlIIlIIlI[18]);
                                }
                            }
                        }
                    }
                }
                if (lIIIlIllIlllI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIlIllIllII(Movement.getRunEnergy(), lIlIIlIIlI[19])) {
                    Inventory.getFirst(C0005f.aU).interact(lIlIIlIIIl[lIlIIlIIlI[13]]);
                    Time.sleepTicks(lIlIIlIIlI[1]);
                    "".length();
                }
                if (lIIIlIllIlllI(al() ? 1 : 0) && lIIIlIllIllII(C0004e.j(dG), lIlIIlIIlI[1])) {
                    int[] iArr3 = new int[lIlIIlIIlI[1]];
                    iArr3[lIlIIlIIlI[2]] = lIlIIlIIlI[20];
                    if (lIIIlIllIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[0])) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[15]];
                            if (lIIIlIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(cV);
                            "".length();
                            Time.sleepTicks(lIlIIlIIlI[1]);
                            "".length();
                        }
                        if (lIIIlIlllIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[21])) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[7]];
                            C0006g.a(lIlIIlIIIl[lIlIIlIIlI[22]], cy);
                        }
                    }
                }
                if (lIIIlIlllIlII(C0004e.j(dG), lIlIIlIIlI[1])) {
                    int[] iArr4 = new int[lIlIIlIIlI[1]];
                    iArr4[lIlIIlIIlI[2]] = lIlIIlIIlI[20];
                    if (lIIIlIllIlllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        String[] strArr2 = new String[lIlIIlIIlI[1]];
                        strArr2[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[23]];
                        if (lIIIlIllIllll(Inventory.contains(strArr2) ? 1 : 0)) {
                            dc = lIlIIlIIlI[2];
                            String[] strArr3 = new String[lIlIIlIIlI[1]];
                            strArr3[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[0]];
                            if (lIIIlIllIllll(Inventory.contains(strArr3) ? 1 : 0)) {
                                if (lIIIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlIIlI[6])) {
                                    AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[24]];
                                    Movement.walkTo(dC);
                                    "".length();
                                }
                                if (lIIIlIlllIIll(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlIIlI[6])) {
                                    AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[21]];
                                    String[] strArr4 = new String[lIlIIlIIlI[1]];
                                    strArr4[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[25]];
                                    if (lIIIlIllIllll(Inventory.contains(strArr4) ? 1 : 0)) {
                                        String[] strArr5 = new String[lIlIIlIIlI[1]];
                                        strArr5[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[26]];
                                        if (lIIIlIlllIIII(TileObjects.getNearest(strArr5))) {
                                            String[] strArr6 = new String[lIlIIlIIlI[1]];
                                            strArr6[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[27]];
                                            TileObjects.getNearest(strArr6).interact(lIlIIlIIIl[lIlIIlIIlI[28]]);
                                            Time.sleepTicks(lIlIIlIIlI[3]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr7 = new String[lIlIIlIIlI[1]];
                            strArr7[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[29]];
                            if (lIIIlIllIlllI(Inventory.contains(strArr7) ? 1 : 0)) {
                                if (lIIIlIllIllll(dz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[30]];
                                    if (lIIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo(dF);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIIlI[1]);
                                        "".length();
                                    }
                                    C0006g.a(cy);
                                }
                                if (lIIIlIllIlllI(dz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr8 = new String[lIlIIlIIlI[1]];
                                    strArr8[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[31]];
                                    if (lIIIlIllIlllI(Inventory.contains(strArr8) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[32]];
                                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                                        String[] strArr9 = new String[lIlIIlIIlI[1]];
                                        strArr9[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[33]];
                                        if (lIIIlIlllIIlI(worldLocation.distanceTo(TileObjects.getNearest(strArr9).getWorldLocation()), lIlIIlIIlI[3])) {
                                            String[] strArr10 = new String[lIlIIlIIlI[1]];
                                            strArr10[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[34]];
                                            Movement.walkTo(TileObjects.getNearest(strArr10).getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lIlIIlIIlI[6]);
                                            "".length();
                                        }
                                        if (lIIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr11 = new String[lIlIIlIIlI[1]];
                                            strArr11[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[35]];
                                            Item first = Inventory.getFirst(strArr11);
                                            String[] strArr12 = new String[lIlIIlIIlI[1]];
                                            strArr12[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[36]];
                                            first.useOn(TileObjects.getNearest(strArr12));
                                            Time.sleepTicks(lIlIIlIIlI[3]);
                                            "".length();
                                        }
                                        C0006g.a(cy);
                                    }
                                    String[] strArr13 = new String[lIlIIlIIlI[1]];
                                    strArr13[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[37]];
                                    if (lIIIlIllIllll(Inventory.contains(strArr13) ? 1 : 0) && lIIIlIllIllll(dA ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[38]];
                                        C0006g.a(lIlIIlIIIl[lIlIIlIIlI[20]], cy);
                                        if (lIIIlIllIlllI(Dialog.getText().contains(lIlIIlIIIl[lIlIIlIIlI[39]]) ? 1 : 0)) {
                                            dA = lIlIIlIIlI[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIIIlIlllIlII(C0004e.j(dG), lIlIIlIIlI[5])) {
                    String[] strArr14 = new String[lIlIIlIIlI[1]];
                    strArr14[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[40]];
                    if (lIIIlIllIllll(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[lIlIIlIIlI[1]];
                        strArr15[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[41]];
                        if (lIIIlIllIllll(Inventory.contains(strArr15) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[42]];
                            int[] iArr5 = new int[lIlIIlIIlI[1]];
                            iArr5[lIlIIlIIlI[2]] = lIlIIlIIlI[43];
                            NPCs.getNearest(iArr5).interact(lIlIIlIIIl[lIlIIlIIlI[44]]);
                            Time.sleepTicks(lIlIIlIIlI[13]);
                            "".length();
                        }
                    }
                    String[] strArr16 = new String[lIlIIlIIlI[1]];
                    strArr16[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[45]];
                    if (lIIIlIllIlllI(Inventory.contains(strArr16) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[46]];
                        C0006g.a(lIlIIlIIIl[lIlIIlIIlI[47]], cy);
                    }
                }
                String[] strArr17 = new String[lIlIIlIIlI[1]];
                strArr17[lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[48]];
                if (lIIIlIllIlllI(Inventory.contains(strArr17) ? 1 : 0)) {
                    if (lIIIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[13])) {
                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[49]];
                        Movement.walkTo(cV);
                        "".length();
                        Time.sleepTicks(lIlIIlIIlI[1]);
                        "".length();
                    }
                    if (lIIIlIlllIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[13])) {
                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[50]];
                        if (lIIIlIllIllII(dc, lIlIIlIIlI[1])) {
                            Z.lm += lIlIIlIIlI[1];
                            Z.p(AccBuilderShamans.m);
                            dc += lIlIIlIIlI[1];
                            Z.lm = lIlIIlIIlI[2];
                            dd = lIlIIlIIlI[2];
                        }
                        C0006g.a(lIlIIlIIIl[lIlIIlIIlI[51]], cy);
                    }
                }
            }
        }
    }

    private static String lIIIlIllIlIII(String llllllllllllllllllllIIllIIIIIllI, String llllllllllllllllllllIIllIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllllllIIllIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlI[22]), "DES");
            Cipher llllllllllllllllllllIIllIIIIlIII = Cipher.getInstance("DES");
            llllllllllllllllllllIIllIIIIlIII.init(lIlIIlIIlI[3], llllllllllllllllllllIIllIIIIlIIl);
            return new String(llllllllllllllllllllIIllIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIllIIIIIlll) {
            llllllllllllllllllllIIllIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllIllll(int i) {
        return i == 0;
    }

    private static boolean lIIIlIlllIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlIlllIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlIllIllIl(int i, int i2) {
        return i >= i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            bi();
            "".length();
            if ("  ".length() < (-" ".length())) {
                return ((73 ^ 53) ^ (3 ^ 84)) & (((((37 + 35) - 48) + 103) ^ (196 ^ 144)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIlIIlI[62];
    }

    private static boolean lIIIlIlllIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIllIllII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIllIlIlI() {
        lIlIIlIIIl = new String[lIlIIlIIlI[86]];
        lIlIIlIIIl[lIlIIlIIlI[2]] = lIIIlIllIIlll("9Pe9k9bK1RDxCmCuXMwnsIsHNPDy+P2KKWxQqJGbi2RqmTTx+DC+GVF6B4o4NISI", "TbpvT");
        lIlIIlIIIl[lIlIIlIIlI[1]] = lIIIlIllIIlll("HSgwNSBfFG0wbNB5fh7N0w==", "Gvect");
        lIlIIlIIIl[lIlIIlIIlI[3]] = lIIIlIllIlIII("fwRp7UW0FNYAKvLUakQLyA==", "qdmBC");
        lIlIIlIIIl[lIlIIlIIlI[5]] = lIIIlIllIIlll("Jxu+CvN21T1XDznMtTB0PQMFq/1V0cKd", "DWYSB");
        lIlIIlIIIl[lIlIIlIIlI[6]] = lIIIlIllIIlll("HJdA8h6qdf9a5VUmIj1acS3vVHYNEWiccnGk00xoEXaRHpt+iPxfLOr2aZ2/sFK8oyXgOOR9Hrk=", "fPdTR");
        lIlIIlIIIl[lIlIIlIIlI[13]] = lIIIlIllIlIII("cdKTQGsUgVo=", "RHkxv");
        lIlIIlIIIl[lIlIIlIIlI[15]] = lIIIlIllIIlll("5/vz/DBouwlK7fHZyJDX4g==", "noBnH");
        lIlIIlIIIl[lIlIIlIIlI[7]] = lIIIlIllIlIII("J1zc59CMwOXoPy2HB48Ymw==", "oivmS");
        lIlIIlIIIl[lIlIIlIIlI[22]] = lIIIlIllIlIII("OtIZ/1ZTKJc=", "INMLY");
        lIlIIlIIIl[lIlIIlIIlI[23]] = lIIIlIllIIlll("eVLQsNaOv/WnbUzGS+91Eg==", "LZqDy");
        lIlIIlIIIl[lIlIIlIIlI[0]] = lIIIlIllIIlll("Qy8mR3CWKsxWWMy+kRsSSw==", "vYXiv");
        lIlIIlIIIl[lIlIIlIIlI[24]] = lIIIlIllIlIII("tTMR5GpGWYYrhaj7wPc4gw==", "aWvXS");
        lIlIIlIIIl[lIlIIlIIlI[21]] = lIIIlIllIlIIl("IzoqLCsJNA==", "gSMKB");
        lIlIIlIIIl[lIlIIlIIlI[25]] = lIIIlIllIlIII("6vqYdl/QL/ok59QkX9udEw==", "orgcv");
        lIlIIlIIIl[lIlIIlIIlI[26]] = lIIIlIllIlIIl("PwsYBw==", "ibvbo");
        lIlIIlIIIl[lIlIIlIIlI[27]] = lIIIlIllIlIII("TvtjPZrj4Ao=", "Ghmqm");
        lIlIIlIIIl[lIlIIlIIlI[28]] = lIIIlIllIlIIl("LxAECzw=", "lxahW");
        lIlIIlIIIl[lIlIIlIIlI[29]] = lIIIlIllIlIII("7mIm00WGZDYi/nc9vcxJdw==", "TsPyQ");
        lIlIIlIIIl[lIlIIlIIlI[30]] = lIIIlIllIlIII("pfqu6/3+TqKhbeX0w/N3Xw==", "TWGbs");
        lIlIIlIIIl[lIlIIlIIlI[31]] = lIIIlIllIlIII("TKur3eH6Jk8=", "VVirW");
        lIlIIlIIIl[lIlIIlIIlI[32]] = lIIIlIllIlIII("kUTFFUIkkPocnPLC1UBZkQ==", "Vvuta");
        lIlIIlIIIl[lIlIIlIIlI[33]] = lIIIlIllIIlll("qjhY22sTeqWtSd5Drx+M6w==", "BRTks");
        lIlIIlIIIl[lIlIIlIIlI[34]] = lIIIlIllIlIII("32Yx55Y7Kphdela2Sj2DAA==", "ZWMyV");
        lIlIIlIIIl[lIlIIlIIlI[35]] = lIIIlIllIlIIl("EicoNCY2", "UFZXO");
        lIlIIlIIIl[lIlIIlIIlI[36]] = lIIIlIllIlIII("JLriV9IjQ67j3V26v+0YPQ==", "lEvyM");
        lIlIIlIIIl[lIlIIlIIlI[37]] = lIIIlIllIlIIl("BCQVCAsg", "CEgdb");
        lIlIIlIIIl[lIlIIlIIlI[38]] = lIIIlIllIlIII("FmVr5f2U62NstZYvmnlCbA==", "GHqrv");
        lIlIIlIIIl[lIlIIlIIlI[20]] = lIIIlIllIIlll("9g81evKqHJc=", "XVNHc");
        lIlIIlIIIl[lIlIIlIIlI[39]] = lIIIlIllIIlll("jgiq9Z8285XzipaOV+rQLJvXQPGVc5U2Sy2D2ZfvpDb/2kY7wx3Cm2iiUWL5TwwD", "ozGlm");
        lIlIIlIIIl[lIlIIlIIlI[40]] = lIIIlIllIlIIl("KC4nOgMM", "oOUVj");
        lIlIIlIIIl[lIlIIlIIlI[41]] = lIIIlIllIlIII("KpzFe88a6oKG5HsiapCVaA==", "bygpc");
        lIlIIlIIIl[lIlIIlIIlI[42]] = lIIIlIllIlIII("rXoZQRanpqQ=", "leSWu");
        lIlIIlIIIl[lIlIIlIIlI[44]] = lIIIlIllIIlll("lWS4zTUW1q8=", "WWKVr");
        lIlIIlIIIl[lIlIIlIIlI[45]] = lIIIlIllIlIII("TOz2gTOGU4rSyiQHpZxaqw==", "zerXI");
        lIlIIlIIIl[lIlIIlIIlI[46]] = lIIIlIllIlIII("r2Yk2T7osIFu/0McILfujA==", "MIKvr");
        lIlIIlIIIl[lIlIIlIIlI[47]] = lIIIlIllIlIII("HKovtF2TiFA=", "FVAGU");
        lIlIIlIIIl[lIlIIlIIlI[48]] = lIIIlIllIlIII("tpfZcw9IXmZbmp5uYQXqGg==", "qXlBS");
        lIlIIlIIIl[lIlIIlIIlI[49]] = lIIIlIllIlIIl("GBAgVho5USUCDyQF", "VqVvn");
        lIlIIlIIIl[lIlIIlIIlI[50]] = lIIIlIllIlIII("9guNspQgNig33xpZKoyftQ==", "MbZhU");
        lIlIIlIIIl[lIlIIlIIlI[51]] = lIIIlIllIlIII("U04wQa7IlMw=", "VuWps");
        lIlIIlIIIl[lIlIIlIIlI[52]] = lIIIlIllIlIIl("MQklEQ8dHGgABh4NOBsRBg==", "rhHtc");
        lIlIIlIIIl[lIlIIlIIlI[53]] = lIIIlIllIIlll("QyR7KK9mA50=", "Fgcgz");
        lIlIIlIIIl[lIlIIlIIlI[54]] = lIIIlIllIlIII("Q6kouqZFHtg=", "IavmZ");
        lIlIIlIIIl[lIlIIlIIlI[55]] = lIIIlIllIlIII("kYujQn8uwlSSgqOxQ76ttw==", "GuoMn");
        lIlIIlIIIl[lIlIIlIIlI[56]] = lIIIlIllIlIII("Vim0RFl/muXnHzt0zh2NYw==", "uEpXR");
        lIlIIlIIIl[lIlIIlIIlI[63]] = lIIIlIllIlIIl("Lyc1JywHKWYsKgc6Izwx", "iNFOE");
        lIlIIlIIIl[lIlIIlIIlI[64]] = lIIIlIllIlIII("CzryI4/Tt0SKPiNhk2kS7t7a669MCWRN", "STSjq");
        lIlIIlIIIl[lIlIIlIIlI[67]] = lIIIlIllIlIII("XG8VWDZPGJbdwyWyY5JYyagOiI6Qh9jJooQktF7DnZ0F948dYPFBwnHYnNhsWYlN", "sxrnb");
        lIlIIlIIIl[lIlIIlIIlI[68]] = lIIIlIllIIlll("qRKlHAc+32UeM/Nl7WhQqg==", "Qbsyt");
        lIlIIlIIIl[lIlIIlIIlI[69]] = lIIIlIllIlIIl("DyBUADszZgMcJiNmGQB0IDQdHDoiZj1ZIykzGB06YTJUFD0oIlQQIGg=", "FFtyT");
        lIlIIlIIIl[lIlIIlIIlI[19]] = lIIIlIllIlIIl("BygtKX5wISQxdSNtIyByNj8oIDw0PmA=", "PMAER");
        lIlIIlIIIl[lIlIIlIIlI[70]] = lIIIlIllIIlll("29M2YOkDSkCEmsIm8NoOUxf/Ja5QVI77Y1RCoS6KTIY=", "KXERx");
        lIlIIlIIIl[lIlIIlIIlI[71]] = lIIIlIllIlIIl("DlcqP3oiHjI2KGcELjZ6JB8rIz8zGTI6NSlQNj8/JgMjfQ==", "GpFSZ");
        lIlIIlIIIl[lIlIIlIIlI[72]] = lIIIlIllIlIIl("HHcYFBQwdwQdCyZ3EhwFdTEZBgp7dzkGQjwjUBAMOiIXHUIhOFACCzto", "UWpub");
        lIlIIlIIIl[lIlIIlIIlI[73]] = lIIIlIllIIlll("uxoJAchk5tg=", "JcDBT");
    }
}
