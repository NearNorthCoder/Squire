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
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.x  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/x.class */
public class x implements G {
    static /* synthetic */ int ck;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ WorldPoint dj;
    private static /* synthetic */ String[] lIIlIllllI;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIllIIIII;
    public static final /* synthetic */ WorldPoint dk;

    private static boolean lIIIIIIIlllII(int i) {
        return i > 0;
    }

    private static boolean lIIIIIIIllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIIIIIIlllIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIIIIIIIlllI(String llllllllllllllllllllllIIllllllII, String llllllllllllllllllllllIIlllllIll) {
        String llllllllllllllllllllllIIllllllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllllllIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllllIIlllllIlI = new StringBuilder();
        char[] llllllllllllllllllllllIIlllllIIl = llllllllllllllllllllllIIlllllIll.toCharArray();
        int llllllllllllllllllllllIIlllllIII = lIIllIIIII[4];
        char[] charArray = llllllllllllllllllllllIIllllllII2.toCharArray();
        int length = charArray.length;
        int i = lIIllIIIII[4];
        while (lIIIIIIIlIllI(i, length)) {
            llllllllllllllllllllllIIlllllIlI.append((char) (charArray[i] ^ llllllllllllllllllllllIIlllllIIl[llllllllllllllllllllllIIlllllIII % llllllllllllllllllllllIIlllllIIl.length]));
            "".length();
            llllllllllllllllllllllIIlllllIII++;
            i++;
            "".length();
            if (((((20 + 7) - 9) + 144) ^ (((74 + 37) - 12) + 67)) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllllIIlllllIlI);
    }

    private static boolean lIIIIIIIllIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIIllIIIII[3]];
        strArr[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[49]];
        if (lIIIIIIIlllII(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIllIIIII[3]];
            iArr[lIIllIIIII[4]] = lIIllIIIII[14];
            if (lIIIIIIIlllII(Inventory.getCount(iArr))) {
                String[] strArr2 = new String[lIIllIIIII[3]];
                strArr2[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[50]];
                if (lIIIIIIIllIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIllIIIII[3]];
                    iArr2[lIIllIIIII[4]] = lIIllIIIII[18];
                    if (lIIIIIIIllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIllIIIII[3]];
                        iArr3[lIIllIIIII[4]] = lIIllIIIII[11];
                        if (lIIIIIIIllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            ?? r0 = lIIllIIIII[3];
                            "".length();
                            return (77 ^ 73) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
            }
        }
        return lIIllIIIII[4];
    }

    private static boolean lIIIIIIIlIllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f7, code lost:
        if (lIIIIIIIlIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.x.lIIllIIIII[2]) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIllIIIII[3]];
        iArr2[lIIllIIIII[4]] = lIIllIIIII[19];
        if (lIIIIIIIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIII[19], lIIllIIIII[2], C0008i.bq));
            "".length();
        }
        int[] iArr3 = new int[lIIllIIIII[3]];
        iArr3[lIIllIIIII[4]] = lIIllIIIII[11];
        if (lIIIIIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIII[11], lIIllIIIII[3], lIIllIIIII[51]));
            "".length();
        }
        int[] iArr4 = new int[lIIllIIIII[3]];
        iArr4[lIIllIIIII[4]] = lIIllIIIII[14];
        if (lIIIIIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIII[14], lIIllIIIII[3], lIIllIIIII[51]));
            "".length();
        }
        int[] iArr5 = new int[lIIllIIIII[3]];
        iArr5[lIIllIIIII[4]] = lIIllIIIII[18];
        if (lIIIIIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIII[18], lIIllIIIII[3], lIIllIIIII[51]));
            "".length();
        }
        int[] iArr6 = new int[lIIllIIIII[3]];
        iArr6[lIIllIIIII[4]] = lIIllIIIII[16];
        if (lIIIIIIIllIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIII[16], lIIllIIIII[3], lIIllIIIII[51]));
            "".length();
        }
        int[] iArr7 = new int[lIIllIIIII[3]];
        iArr7[lIIllIIIII[4]] = lIIllIIIII[13];
        if (lIIIIIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIII[13], lIIllIIIII[3], lIIllIIIII[52]));
            "".length();
        }
        int[] iArr8 = new int[lIIllIIIII[3]];
        iArr8[lIIllIIIII[4]] = lIIllIIIII[10];
        if (lIIIIIIIllIIl(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIllIIIII[3]];
            iArr9[lIIllIIIII[4]] = lIIllIIIII[10];
            if (lIIIIIIIllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIIllIIIII[3]];
                iArr10[lIIllIIIII[4]] = lIIllIIIII[10];
            }
            if (lIIIIIIIllIlI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIlIllllI[lIIllIIIII[59]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIllIIIII[54], lIIllIIIII[15], lIIllIIIII[55]));
                "".length();
            }
            iArr = new int[lIIllIIIII[3]];
            iArr[lIIllIIIII[4]] = lIIllIIIII[9];
            if (lIIIIIIIllIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[lIIllIIIII[3]];
                iArr11[lIIllIIIII[4]] = lIIllIIIII[9];
                if (!lIIIIIIIllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIllIIIII[3]];
                iArr12[lIIllIIIII[4]] = lIIllIIIII[9];
                if (!lIIIIIIIlIllI(Bank.getFirst(iArr12).getQuantity(), lIIllIIIII[2])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIllIIIII[9], lIIllIIIII[56], lIIllIIIII[52]));
            "".length();
        }
        bv.add(new C0003d(lIIllIIIII[10], lIIllIIIII[2], lIIllIIIII[53]));
        "".length();
        if (lIIIIIIIllIlI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIlIllllI[lIIllIIIII[59]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIllIIIII[3]];
        iArr[lIIllIIIII[4]] = lIIllIIIII[9];
        if (lIIIIIIIllIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIllIIIII[9], lIIllIIIII[56], lIIllIIIII[52]));
        "".length();
    }

    private static String lIIIIIIIlIIII(String llllllllllllllllllllllIIlllIIlll, String llllllllllllllllllllllIIlllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIlllIIllI.getBytes(StandardCharsets.UTF_8)), lIIllIIIII[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIIII[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIIlllIlIII) {
            llllllllllllllllllllllIIlllIlIII.printStackTrace();
            return null;
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            System.out.println("678: " + C0004e.j(lIIllIIIII[5]));
            bh();
            "".length();
            if ((-" ".length()) == ((149 ^ 128) & ((128 ^ 149) ^ (-1)))) {
                return (190 ^ 133) & ((24 ^ 35) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIllIIIII[57];
    }

    private static boolean lIIIIIIIlIlll(int i, int i2) {
        return i == i2;
    }

    private static void lIIIIIIIlIlIl() {
        lIIllIIIII = new int[79];
        lIIllIIIII[0] = (152 ^ 197) ^ (7 ^ 71);
        lIIllIIIII[1] = "  ".length();
        lIIllIIIII[2] = (28 ^ 35) ^ (23 ^ 34);
        lIIllIIIII[3] = " ".length();
        lIIllIIIII[4] = ((((210 + 231) - 440) + 246) ^ (((11 + 108) - 53) + 98)) & (((((147 + 140) - 178) + 106) ^ (((56 + 111) - 56) + 21)) ^ (-" ".length()));
        lIIllIIIII[5] = (-((-1606) & 24151)) & (-9545) & 32767;
        lIIllIIIII[6] = (-((-8329) & 11453)) & (-24578) & 32701;
        lIIllIIIII[7] = 70 ^ 66;
        lIIllIIIII[8] = (((95 + 109) - 112) + 70) ^ (((138 + 39) - 102) + 90);
        lIIllIIIII[9] = (-8353) & 16359;
        lIIllIIIII[10] = (-((-397) & 24991)) & (-161) & 32762;
        lIIllIIIII[11] = (-28673) & 31224;
        lIIllIIIII[12] = "   ".length();
        lIIllIIIII[13] = ((84 + 58) - (-49)) + 30;
        lIIllIIIII[14] = (-20617) & 22525;
        lIIllIIIII[15] = 100 ^ 97;
        lIIllIIIII[16] = (-8964) & 11047;
        lIIllIIIII[17] = 129 ^ 135;
        lIIllIIIII[18] = (-((-21261) & 32557)) & (-20494) & 32381;
        lIIllIIIII[19] = (-((-4369) & 21947)) & (-2053) & 32255;
        lIIllIIIII[20] = (-1029) & 2023;
        lIIllIIIII[21] = 39 ^ 21;
        lIIllIIIII[22] = (-12298) & 14815;
        lIIllIIIII[23] = 200 ^ 192;
        lIIllIIIII[24] = 168 ^ 161;
        lIIllIIIII[25] = (-16643) & 19935;
        lIIllIIIII[26] = (-4097) & 7286;
        lIIllIIIII[27] = 182 ^ 192;
        lIIllIIIII[28] = ((8 + 77) - (-40)) + 12;
        lIIllIIIII[29] = -" ".length();
        lIIllIIIII[30] = 14 ^ 5;
        lIIllIIIII[31] = 43 ^ 39;
        lIIllIIIII[32] = (-6787) & 7086;
        lIIllIIIII[33] = (67 ^ 29) ^ (4 ^ 87);
        lIIllIIIII[34] = (((31 + 68) - (-61)) + 28) ^ (((46 + 109) - 40) + 63);
        lIIllIIIII[35] = 157 ^ 141;
        lIIllIIIII[36] = 95 ^ 80;
        lIIllIIIII[37] = (234 ^ 199) ^ (20 ^ 40);
        lIIllIIIII[38] = 133 ^ 151;
        lIIllIIIII[39] = (90 ^ 0) ^ (204 ^ 133);
        lIIllIIIII[40] = (39 ^ 110) ^ (250 ^ 167);
        lIIllIIIII[41] = 122 ^ 111;
        lIIllIIIII[42] = (((111 + 41) - 27) + 21) ^ (((111 + 124) - 112) + 9);
        lIIllIIIII[43] = 8 ^ 31;
        lIIllIIIII[44] = (126 ^ 16) ^ (29 ^ 107);
        lIIllIIIII[45] = (5 ^ 74) ^ (110 ^ 56);
        lIIllIIIII[46] = 64 ^ 90;
        lIIllIIIII[47] = (((75 + 46) - 21) + 31) ^ (((72 + 31) - (-42)) + 7);
        lIIllIIIII[48] = 107 ^ 119;
        lIIllIIIII[49] = 25 ^ 7;
        lIIllIIIII[50] = 153 ^ 134;
        lIIllIIIII[51] = (-(((135 + 28) - 72) + 58)) & (-7169) & 16316;
        lIIllIIIII[52] = (-((-2613) & 28287)) & (-6193) & 32766;
        lIIllIIIII[53] = (-12289) & 14188;
        lIIllIIIII[54] = (-4370) & 16349;
        lIIllIIIII[55] = (-7703) & 32702;
        lIIllIIIII[56] = (66 ^ 25) ^ (84 ^ 39);
        lIIllIIIII[57] = (((162 + 213) - 243) + 113) ^ (((101 + 69) - 121) + 96);
        lIIllIIIII[58] = (((70 + 150) - 192) + 159) ^ (((145 + 54) - 66) + 22);
        lIIllIIIII[59] = 85 ^ 116;
        lIIllIIIII[60] = (72 ^ 126) ^ (179 ^ 167);
        lIIllIIIII[61] = (36 ^ 34) ^ (46 ^ 11);
        lIIllIIIII[62] = (122 ^ 115) ^ (117 ^ 88);
        lIIllIIIII[63] = 92 ^ 121;
        lIIllIIIII[64] = 180 ^ 146;
        lIIllIIIII[65] = (47 ^ 69) ^ (33 ^ 108);
        lIIllIIIII[66] = (231 ^ 194) ^ (162 ^ 174);
        lIIllIIIII[67] = (-20793) & 23999;
        lIIllIIIII[68] = (-24577) & 27790;
        lIIllIIIII[69] = (-4617) & 7998;
        lIIllIIIII[70] = (-(98 ^ 91)) & (-16901) & 20223;
        lIIllIIIII[71] = (((125 + 139) - 192) + 100) ^ (((65 + 71) - 92) + 90);
        lIIllIIIII[72] = 134 ^ 173;
        lIIllIIIII[73] = 44 ^ 0;
        lIIllIIIII[74] = 39 ^ 10;
        lIIllIIIII[75] = 129 ^ 175;
        lIIllIIIII[76] = (((158 + 111) - 161) + 75) ^ (((93 + 56) - 77) + 80);
        lIIllIIIII[77] = (183 ^ 133) ^ "  ".length();
        lIIllIIIII[78] = 180 ^ 133;
    }

    private static boolean lIIIIIIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIIIIllIIl(int i) {
        return i != 0;
    }

    static {
        lIIIIIIIlIlIl();
        lIIIIIIIlIlII();
        dj = new WorldPoint(lIIllIIIII[67], lIIllIIIII[68], lIIllIIIII[4]);
        dk = new WorldPoint(lIIllIIIII[69], lIIllIIIII[70], lIIllIIIII[4]);
        bv = new ArrayList();
        String[] strArr = new String[lIIllIIIII[23]];
        strArr[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[71]];
        strArr[lIIllIIIII[3]] = lIIlIllllI[lIIllIIIII[72]];
        strArr[lIIllIIIII[1]] = lIIlIllllI[lIIllIIIII[73]];
        strArr[lIIllIIIII[12]] = lIIlIllllI[lIIllIIIII[74]];
        strArr[lIIllIIIII[7]] = lIIlIllllI[lIIllIIIII[75]];
        strArr[lIIllIIIII[15]] = lIIlIllllI[lIIllIIIII[76]];
        strArr[lIIllIIIII[17]] = lIIlIllllI[lIIllIIIII[77]];
        strArr[lIIllIIIII[8]] = lIIlIllllI[lIIllIIIII[78]];
        bR = strArr;
    }

    private static boolean lIIIIIIIlllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIIllllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v300, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v322, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    public static void bh() {
        if (lIIIIIIIlIllI(C0004e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            B.bF();
        }
        if (lIIIIIIIlIllI(Skills.getLevel(Skill.COOKING), lIIllIIIII[2]) && lIIIIIIIlIlll(C0004e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            P.cL();
        }
        if (lIIIIIIIllIII(Skills.getLevel(Skill.COOKING), lIIllIIIII[2]) && lIIIIIIIlIlll(C0004e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            if (lIIIIIIIllIIl(bt ? 1 : 0)) {
                C0001b.a(bv);
                if (lIIIIIIIlIllI(bv.size(), lIIllIIIII[3])) {
                    System.out.println(lIIlIllllI[lIIllIIIII[4]]);
                    bt = lIIllIIIII[4];
                }
            }
            if (lIIIIIIIllIlI(bt ? 1 : 0)) {
                if (lIIIIIIIllIlI(ab() ? 1 : 0) && lIIIIIIIllIlI(C0004e.j(lIIllIIIII[5]))) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIIIIIIllIll(nearest) && lIIIIIIIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[3]];
                        C0000a.a(nearest);
                    }
                    if (lIIIIIIIllIll(nearest) && lIIIIIIIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIIIIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIllIIIII[6]);
                            "".length();
                        }
                        if (lIIIIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[1]];
                            if (lIIIIIIIlllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIllIIIII[7]);
                                "".length();
                            }
                            if (lIIIIIIIlllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIllIIIII[1]);
                                "".length();
                            }
                            int[] iArr = new int[lIIllIIIII[8]];
                            iArr[lIIllIIIII[4]] = lIIllIIIII[9];
                            iArr[lIIllIIIII[3]] = lIIllIIIII[10];
                            iArr[lIIllIIIII[1]] = lIIllIIIII[11];
                            iArr[lIIllIIIII[12]] = lIIllIIIII[13];
                            iArr[lIIllIIIII[7]] = lIIllIIIII[14];
                            iArr[lIIllIIIII[15]] = lIIllIIIII[16];
                            iArr[lIIllIIIII[17]] = lIIllIIIII[18];
                            if (lIIIIIIIllIlI(C0004e.b(iArr) ? 1 : 0)) {
                                af();
                                System.out.println(lIIlIllllI[lIIllIIIII[12]]);
                                bt = lIIllIIIII[3];
                                return;
                            }
                            int[] iArr2 = new int[lIIllIIIII[8]];
                            iArr2[lIIllIIIII[4]] = lIIllIIIII[9];
                            iArr2[lIIllIIIII[3]] = lIIllIIIII[10];
                            iArr2[lIIllIIIII[1]] = lIIllIIIII[11];
                            iArr2[lIIllIIIII[12]] = lIIllIIIII[13];
                            iArr2[lIIllIIIII[7]] = lIIllIIIII[14];
                            iArr2[lIIllIIIII[15]] = lIIllIIIII[16];
                            iArr2[lIIllIIIII[17]] = lIIllIIIII[18];
                            if (lIIIIIIIllIIl(C0004e.b(iArr2) ? 1 : 0)) {
                                C0000a.a(lIIllIIIII[9], lIIllIIIII[2]);
                                C0000a.a(lIIllIIIII[10], lIIllIIIII[2]);
                                C0000a.a(lIIllIIIII[11], lIIllIIIII[3]);
                                C0000a.a(lIIllIIIII[13], lIIllIIIII[3]);
                                C0000a.a(lIIllIIIII[14], lIIllIIIII[3]);
                                C0000a.a(lIIllIIIII[16], lIIllIIIII[3]);
                                C0000a.a(lIIllIIIII[18], lIIllIIIII[3]);
                                C0000a.a(lIIllIIIII[19], lIIllIIIII[1]);
                                C0000a.a(lIIllIIIII[20], lIIllIIIII[6]);
                            }
                        }
                    }
                }
                if (lIIIIIIIllIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIIIIlIllI(Movement.getRunEnergy(), lIIllIIIII[21])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlIllllI[lIIllIIIII[7]]);
                    Time.sleepTicks(lIIllIIIII[3]);
                    "".length();
                }
                if (lIIIIIIIllIlI(C0004e.j(lIIllIIIII[5])) && lIIIIIIIllIIl(ab() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[15]];
                    if (lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                        if (lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dj);
                        "".length();
                        Time.sleepTicks(lIIllIIIII[3]);
                        "".length();
                    }
                    if (lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                        AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[17]];
                        C0006g.a(lIIlIllllI[lIIllIIIII[8]], bR);
                    }
                }
                if (lIIIIIIIlIlll(C0004e.j(lIIllIIIII[5]), lIIllIIIII[3])) {
                    int[] iArr3 = new int[lIIllIIIII[3]];
                    iArr3[lIIllIIIII[4]] = lIIllIIIII[22];
                    if (lIIIIIIIllIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        String[] strArr = new String[lIIllIIIII[3]];
                        strArr[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[23]];
                        if (lIIIIIIIllIlI(Inventory.contains(strArr) ? 1 : 0)) {
                            ck = lIIllIIIII[4];
                            if (lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dk), lIIllIIIII[7])) {
                                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[24]];
                                WorldArea worldArea = new WorldArea(lIIllIIIII[25], lIIllIIIII[26], lIIllIIIII[27], lIIllIIIII[28], lIIllIIIII[4]);
                                if (lIIIIIIIllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIIIIIIllIIl(Inventory.contains(item -> {
                                        return item.getName().contains(lIIlIllllI[lIIllIIIII[66]]);
                                    }) ? 1 : 0) && lIIIIIIIllIlI(Equipment.contains(item2 -> {
                                        return item2.getName().contains(lIIlIllllI[lIIllIIIII[56]]);
                                    }) ? 1 : 0)) {
                                        Inventory.getFirst(item3 -> {
                                            return item3.getName().contains(lIIlIllllI[lIIllIIIII[65]]);
                                        }).interact(lIIlIllllI[lIIllIIIII[2]]);
                                    }
                                    if (lIIIIIIIllIIl(Equipment.contains(item4 -> {
                                        return item4.getName().contains(lIIlIllllI[lIIllIIIII[64]]);
                                    }) ? 1 : 0) && lIIIIIIIlIlll(Players.getLocal().getAnimation(), lIIllIIIII[29])) {
                                        Equipment.getFirst(item5 -> {
                                            return item5.getName().contains(lIIlIllllI[lIIllIIIII[63]]);
                                        }).interact(lIIlIllllI[lIIllIIIII[30]]);
                                        Time.sleepTicks(lIIllIIIII[7]);
                                        "".length();
                                    }
                                }
                                if (lIIIIIIIllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(dk);
                                    "".length();
                                    Time.sleepTicks(lIIllIIIII[3]);
                                    "".length();
                                }
                            }
                            if (lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dk), lIIllIIIII[7])) {
                                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[31]];
                                if (lIIIIIIIllIIl(Widgets.get(lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    String[] strArr2 = new String[lIIllIIIII[3]];
                                    strArr2[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[33]];
                                    NPCs.getNearest(strArr2).interact(lIIlIllllI[lIIllIIIII[34]]);
                                    Time.sleepTicks(lIIllIIIII[12]);
                                    "".length();
                                }
                                if (lIIIIIIIllIlI(Widgets.get(lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIIllIIIII[32], lIIllIIIII[35], lIIllIIIII[3]).interact(lIIlIllllI[lIIllIIIII[36]]);
                                    Time.sleepTicks(lIIllIIIII[1]);
                                    "".length();
                                }
                                int[] iArr4 = new int[lIIllIIIII[3]];
                                iArr4[lIIllIIIII[4]] = lIIllIIIII[22];
                                if (lIIIIIIIllIIl(Inventory.contains(iArr4) ? 1 : 0) && lIIIIIIIllIlI(Widgets.get(lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIIllIIIII[32], lIIllIIIII[3], lIIllIIIII[30]).interact(lIIlIllllI[lIIllIIIII[35]]);
                                    Time.sleepTicks(lIIllIIIII[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIllIIIII[3]];
                    iArr5[lIIllIIIII[4]] = lIIllIIIII[22];
                    if (lIIIIIIIllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIllIIIII[3]];
                        strArr3[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[37]];
                        if (lIIIIIIIllIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIllIIIII[3]];
                            iArr6[lIIllIIIII[4]] = lIIllIIIII[22];
                            if (lIIIIIIIllIIl(Inventory.contains(iArr6) ? 1 : 0) && lIIIIIIIllIlI(Widgets.get(lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get(lIIllIIIII[32], lIIllIIIII[3], lIIllIIIII[30]).interact(lIIlIllllI[lIIllIIIII[38]]);
                                Time.sleepTicks(lIIllIIIII[3]);
                                "".length();
                            }
                            int[] iArr7 = new int[lIIllIIIII[3]];
                            iArr7[lIIllIIIII[4]] = lIIllIIIII[18];
                            Item first = Inventory.getFirst(iArr7);
                            String[] strArr4 = new String[lIIllIIIII[3]];
                            strArr4[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[39]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(lIIllIIIII[1]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIIllIIIII[3]];
                    strArr5[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[40]];
                    if (lIIIIIIIllIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                            if (lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (lIIIIIIIllIIl(Inventory.contains(item6 -> {
                                return item6.getName().contains(lIIlIllllI[lIIllIIIII[62]]);
                            }) ? 1 : 0) && lIIIIIIIllIlI(Equipment.contains(item7 -> {
                                return item7.getName().contains(lIIlIllllI[lIIllIIIII[61]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item8 -> {
                                    return item8.getName().contains(lIIlIllllI[lIIllIIIII[60]]);
                                }).interact(lIIlIllllI[lIIllIIIII[41]]);
                                Time.sleepTicks(lIIllIIIII[1]);
                                "".length();
                            }
                            Movement.walkTo(dj);
                            "".length();
                            Time.sleepTicks(lIIllIIIII[3]);
                            "".length();
                        }
                        if (lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                            AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[42]];
                            if (lIIIIIIIlIllI(ck, lIIllIIIII[3])) {
                                U.lq += lIIllIIIII[3];
                                U.o(AccBuilderRogues.m);
                                ck += lIIllIIIII[3];
                                U.lq = lIIllIIIII[4];
                                cl = lIIllIIIII[4];
                            }
                            C0006g.a(lIIlIllllI[lIIllIIIII[43]], bR);
                        }
                    }
                }
                if (lIIIIIIIlIlll(C0004e.j(lIIllIIIII[5]), lIIllIIIII[1])) {
                    String[] strArr6 = new String[lIIllIIIII[3]];
                    strArr6[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[44]];
                    TileObjects.getNearest(strArr6).interact(lIIlIllllI[lIIllIIIII[45]]);
                    Time.sleepTicks(lIIllIIIII[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIllIIIII[4];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIllllI[lIIllIIIII[58]];
    }

    private static String lIIIIIIIIllll(String llllllllllllllllllllllIIllIllIlI, String llllllllllllllllllllllIIllIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllllIIllIlllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllllIIllIlllII.init(lIIllIIIII[1], secretKeySpec);
            return new String(llllllllllllllllllllllIIllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIIllIllIll) {
            llllllllllllllllllllllIIllIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIlIlII() {
        lIIlIllllI = new String[lIIllIIIII[21]];
        lIIlIllllI[lIIllIIIII[4]] = lIIIIIIIIlllI("BCQtESUqKCdYNDc0KhYxYiQ3HTsxYWMLISs5IBA/LCpjGjchJmMMOWI8Nh0lNg==", "BMCxV");
        lIIlIllllI[lIIllIIIII[3]] = lIIIIIIIIllll("v2VAqVZ+7c5PuyVu7ey/FA==", "iElCR");
        lIIlIllllI[lIIllIIIII[1]] = lIIIIIIIIllll("rSlwrK4habW76xg1dW8i8K4VDP260NX7", "aspVc");
        lIIlIllllI[lIIllIIIII[12]] = lIIIIIIIIllll("fwR4TIqyxo45AZlrCvLlXtv+aA4zYCKiEVzhscTBqIXPr5V0J1apjmBOE8tGDD352DHZaZwuVCA=", "cGxNU");
        lIIlIllllI[lIIllIIIII[7]] = lIIIIIIIlIIII("ONVzTad/iqA=", "RLZZN");
        lIIlIllllI[lIIllIIIII[15]] = lIIIIIIIIlllI("KCA5UwQJYTwHERQ1", "fAOsp");
        lIIlIllllI[lIIllIIIII[17]] = lIIIIIIIlIIII("AiOelxV/xeP/P8DaYrIJXQ==", "jwuQR");
        lIIlIllllI[lIIllIIIII[8]] = lIIIIIIIIllll("LEd+gk+4GAk=", "lXTnj");
        lIIlIllllI[lIIllIIIII[23]] = lIIIIIIIIllll("Ft28/awofdcGZ1Evg8VZnQ==", "ISROy");
        lIIlIllllI[lIIllIIIII[24]] = lIIIIIIIlIIII("vWGyKjig9DU/N2FlwQ0PleF6DxcksNbB", "XlbOC");
        lIIlIllllI[lIIllIIIII[2]] = lIIIIIIIIlllI("Hy80Mw==", "HJUAy");
        lIIlIllllI[lIIllIIIII[30]] = lIIIIIIIlIIII("lJVtFg0j6LzfDbd/zgL+HA==", "HXoBK");
        lIIlIllllI[lIIllIIIII[31]] = lIIIIIIIlIIII("hVRbl6ePx41yeYNovIdzyw==", "HBjdm");
        lIIlIllllI[lIIllIIIII[33]] = lIIIIIIIlIIII("vBg6Wf3Mq/k=", "sJrJt");
        lIIlIllllI[lIIllIIIII[34]] = lIIIIIIIIlllI("KAQU", "jqmZm");
        lIIlIllllI[lIIllIIIII[36]] = lIIIIIIIIllll("8zkXpa/fH0U=", "ivScM");
        lIIlIllllI[lIIllIIIII[35]] = lIIIIIIIlIIII("/QAmsijT+xk=", "WMaRi");
        lIIlIllllI[lIIllIIIII[37]] = lIIIIIIIIlllI("My0IBhtXJhYTEQM=", "wDzrb");
        lIIlIllllI[lIIllIIIII[38]] = lIIIIIIIIlllI("NjU+OgQ=", "uYQIa");
        lIIlIllllI[lIIllIIIII[39]] = lIIIIIIIIllll("wHtECnEHenA/m8VQ4cUkAA==", "GBbyP");
        lIIlIllllI[lIIllIIIII[40]] = lIIIIIIIIllll("x2S8AkqN5k96s3L2/SuzNA==", "DDxRx");
        lIIlIllllI[lIIllIIIII[41]] = lIIIIIIIIllll("Cb5SV+3LZo4=", "Hkhqy");
        lIIlIllllI[lIIllIIIII[42]] = lIIIIIIIIlllI("IAAoEBwBDyFUFAEAKhsX", "haFtp");
        lIIlIllllI[lIIllIIIII[43]] = lIIIIIIIIlllI("ER8HHg==", "Rphup");
        lIIlIllllI[lIIllIIIII[44]] = lIIIIIIIlIIII("DanzC133Zkg=", "FKLWg");
        lIIlIllllI[lIIllIIIII[45]] = lIIIIIIIIllll("bs7bmKLBkOM=", "Cmfvj");
        lIIlIllllI[lIIllIIIII[46]] = lIIIIIIIIlllI("MzcgKQ==", "rEIZj");
        lIIlIllllI[lIIllIIIII[47]] = lIIIIIIIIlllI("EDYlEhU8NjZXFTo3PA==", "UXQwg");
        lIIlIllllI[lIIllIIIII[48]] = lIIIIIIIIlllI("Eic2Cw==", "VHYyM");
        lIIlIllllI[lIIllIIIII[0]] = lIIIIIIIIlllI("PzcmHw==", "pGCqN");
        lIIlIllllI[lIIllIIIII[49]] = lIIIIIIIIllll("WpT2hweNR6rWIDZGaYKJxw==", "ASBNr");
        lIIlIllllI[lIIllIIIII[50]] = lIIIIIIIIlllI("CCo9ESduOiQZIDo=", "NXHxS");
        lIIlIllllI[lIIllIIIII[58]] = lIIIIIIIlIIII("6pdUQeUHEMuzNmXtoafgWQ==", "dZpMZ");
        lIIlIllllI[lIIllIIIII[59]] = lIIIIIIIIllll("Kx4FW3CNiJnw/riMGE0S5i5Cxm0kR8AZ", "vykir");
        lIIlIllllI[lIIllIIIII[60]] = lIIIIIIIlIIII("gjn+fmyEKWI=", "xlJFV");
        lIIlIllllI[lIIllIIIII[61]] = lIIIIIIIlIIII("GQJaUIhPBts=", "rlJNy");
        lIIlIllllI[lIIllIIIII[62]] = lIIIIIIIIlllI("PR8rIwY3DQ==", "YjNOo");
        lIIlIllllI[lIIllIIIII[63]] = lIIIIIIIIlllI("Ii0RIiUoPw==", "FXtNL");
        lIIlIllllI[lIIllIIIII[64]] = lIIIIIIIIllll("ikdVBrU9A5M=", "BdtYD");
        lIIlIllllI[lIIllIIIII[65]] = lIIIIIIIIllll("0Krgay5tcQ0=", "djeqs");
        lIIlIllllI[lIIllIIIII[56]] = lIIIIIIIIllll("uamrroVH+qM=", "mdAtt");
        lIIlIllllI[lIIllIIIII[66]] = lIIIIIIIlIIII("bxsIxpx5OSQ=", "VlhXR");
        lIIlIllllI[lIIllIIIII[71]] = lIIIIIIIlIIII("HXYIpgfEDIoilLnpLVe4X8tzE1CWBNyE", "PqFHV");
        lIIlIllllI[lIIllIIIII[72]] = lIIIIIIIlIIII("dMU/x+UwEK3btSjFDKYwJtyVuDNy/eSs2CiI5yENWX3x8x2Nw0RwXmNQu6Xu8gvd", "QdyGS");
        lIIlIllllI[lIIllIIIII[73]] = lIIIIIIIIlllI("FgkcOCI7BhFhYx5KAyMsIEofJSYlD0g5LHcMASMndx4AJDB3GRw4JTFE", "WjhMC");
        lIIlIllllI[lIIllIIIII[74]] = lIIIIIIIIllll("rRClBDt/PI0=", "duhng");
        lIIlIllllI[lIIllIIIII[75]] = lIIIIIIIIlllI("BhEgE0oiWTYVAj8efg==", "QyAgm");
        lIIlIllllI[lIIllIIIII[76]] = lIIIIIIIlIIII("wT9RCMjfyua8CieBvLXqW+K/Tuyt8gAuhbmfzcy35K1qjGTaFgWFcA==", "ZUxHt");
        lIIlIllllI[lIIllIIIII[77]] = lIIIIIIIIllll("1HymH92y3noJ38S5rxNYH7m9XcZ1x1ZT/LuU2NLrgt0=", "GoIBI");
        lIIlIllllI[lIIllIIIII[78]] = lIIIIIIIIllll("Q9SBkcYOa4h275IRufuIe7/gY3cziVf96Teh49AgGoU=", "KYTDE");
    }

    private static boolean lIIIIIIIllIll(Object obj) {
        return obj != null;
    }

    public static void bi() {
        String[] strArr = new String[lIIllIIIII[3]];
        strArr[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[46]];
        if (lIIIIIIIlllll(NPCs.getNearest(strArr))) {
            if (lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                if (lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo(dj);
                "".length();
                Time.sleepTicks(lIIllIIIII[3]);
                "".length();
            }
            if (lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[47]];
                String[] strArr2 = new String[lIIllIIIII[3]];
                strArr2[lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[48]];
                TileObjects.getNearest(strArr2).interact(lIIlIllllI[lIIllIIIII[0]]);
                Time.sleepTicks(lIIllIIIII[1]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIIIlIIIII(Quests.getState(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            ?? r0 = lIIllIIIII[3];
            "".length();
            return 0 != 0 ? ((((93 + 57) - 74) + 55) ^ (((158 + 167) - 224) + 68)) & (((((122 + 213) - 319) + 220) ^ (((59 + 124) - 10) + 25)) ^ (-" ".length())) : r0;
        }
        return lIIllIIIII[4];
    }
}
