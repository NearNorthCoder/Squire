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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.L  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/L.class */
public class L implements M {
    private static final /* synthetic */ WorldPoint ib;
    private static final /* synthetic */ WorldPoint id;
    public static /* synthetic */ List<C0003d> bA;
    private static final /* synthetic */ WorldPoint ia;
    private static final /* synthetic */ WorldPoint ic;
    private static final /* synthetic */ WorldPoint hZ;
    static /* synthetic */ int co;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ String[] hX;
    public static /* synthetic */ long g;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIlIIIIllIIl;
    private static final /* synthetic */ WorldPoint hY;
    static /* synthetic */ int bY;
    private static /* synthetic */ int[] lIIlIIIIllIlI;

    private static boolean lIlIlIIIIIlllII(int i2, int i3) {
        return i2 < i3;
    }

    private static int lIlIlIIIIIllIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIlIlIIIIIllIll(int i2) {
        return i2 != 0;
    }

    private static String lIlIlIIIIIlIlIl(String llllllllllllllIllllllIlIlIIIIIlI, String llllllllllllllIllllllIlIlIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllllIlIlIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIIllIlI[18]), "DES");
            Cipher llllllllllllllIllllllIlIlIIIIlII = Cipher.getInstance("DES");
            llllllllllllllIllllllIlIlIIIIlII.init(lIIlIIIIllIlI[3], llllllllllllllIllllllIlIlIIIIlIl);
            return new String(llllllllllllllIllllllIlIlIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllIlIlIIIIIll) {
            llllllllllllllIllllllIlIlIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIIlllll(int i2) {
        return i2 > 0;
    }

    private static String lIlIlIIIIIlIlII(String llllllllllllllIllllllIlIlIlIIlll, String llllllllllllllIllllllIlIlIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllllIlIlIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllllIlIlIlIlIIl.init(lIIlIIIIllIlI[3], secretKeySpec);
            return new String(llllllllllllllIllllllIlIlIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIlIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllIlIlIlIlIII) {
            llllllllllllllIllllllIlIlIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIlIIIll(int i2, int i3) {
        return i2 == i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cB();
            "".length();
            if (" ".length() == 0) {
                return (15 ^ 44) & ((157 ^ 190) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIlIIIIllIlI[54];
    }

    private static void W() {
        int[] iArr = new int[lIIlIIIIllIlI[1]];
        iArr[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[10];
        if (lIlIlIIIIIlllIl(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[10], lIIlIIIIllIlI[1], lIIlIIIIllIlI[46]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIIIIllIlI[1]];
        iArr2[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[14];
        if (lIlIlIIIIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[14], lIIlIIIIllIlI[1], lIIlIIIIllIlI[47]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIIIIllIlI[1]];
        iArr3[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
        if (lIlIlIIIIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[4], lIIlIIIIllIlI[48], lIIlIIIIllIlI[49]));
            "".length();
        }
        if (lIlIlIIIIIlllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[56]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[50], lIIlIIIIllIlI[7], lIIlIIIIllIlI[51]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIIIIllIlI[1]];
        iArr4[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[11];
        if (lIlIlIIIIIlllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[11], lIIlIIIIllIlI[15], lIIlIIIIllIlI[52]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIIIIllIlI[1]];
        iArr5[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[16];
        if (lIlIlIIIIIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[16], lIIlIIIIllIlI[15], lIIlIIIIllIlI[52]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIIIIllIlI[1]];
        iArr6[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[13];
        if (lIlIlIIIIIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[13], lIIlIIIIllIlI[53], lIIlIIIIllIlI[52]));
            "".length();
        }
        int[] iArr7 = new int[lIIlIIIIllIlI[1]];
        iArr7[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[12];
        if (lIlIlIIIIIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIllIlI[12], lIIlIIIIllIlI[7], C0007h.bv));
            "".length();
        }
    }

    private static boolean lIlIlIIIIlIIIIl(int i2, int i3) {
        return i2 > i3;
    }

    static {
        lIlIlIIIIIllIII();
        lIlIlIIIIIlIlll();
        String[] strArr = new String[lIIlIIIIllIlI[24]];
        strArr[lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[62]];
        strArr[lIIlIIIIllIlI[1]] = lIIlIIIIllIIl[lIIlIIIIllIlI[63]];
        strArr[lIIlIIIIllIlI[3]] = lIIlIIIIllIIl[lIIlIIIIllIlI[64]];
        strArr[lIIlIIIIllIlI[5]] = lIIlIIIIllIIl[lIIlIIIIllIlI[65]];
        strArr[lIIlIIIIllIlI[6]] = lIIlIIIIllIIl[lIIlIIIIllIlI[66]];
        strArr[lIIlIIIIllIlI[7]] = lIIlIIIIllIIl[lIIlIIIIllIlI[67]];
        strArr[lIIlIIIIllIlI[9]] = lIIlIIIIllIIl[lIIlIIIIllIlI[68]];
        strArr[lIIlIIIIllIlI[17]] = lIIlIIIIllIIl[lIIlIIIIllIlI[69]];
        strArr[lIIlIIIIllIlI[18]] = lIIlIIIIllIIl[lIIlIIIIllIlI[70]];
        strArr[lIIlIIIIllIlI[19]] = lIIlIIIIllIIl[lIIlIIIIllIlI[71]];
        strArr[lIIlIIIIllIlI[15]] = lIIlIIIIllIIl[lIIlIIIIllIlI[72]];
        strArr[lIIlIIIIllIlI[20]] = lIIlIIIIllIIl[lIIlIIIIllIlI[73]];
        strArr[lIIlIIIIllIlI[21]] = lIIlIIIIllIIl[lIIlIIIIllIlI[48]];
        strArr[lIIlIIIIllIlI[22]] = lIIlIIIIllIIl[lIIlIIIIllIlI[74]];
        strArr[lIIlIIIIllIlI[23]] = lIIlIIIIllIIl[lIIlIIIIllIlI[75]];
        hX = strArr;
        hY = new WorldPoint(lIIlIIIIllIlI[76], lIIlIIIIllIlI[77], lIIlIIIIllIlI[0]);
        hZ = new WorldPoint(lIIlIIIIllIlI[78], lIIlIIIIllIlI[79], lIIlIIIIllIlI[0]);
        ia = new WorldPoint(lIIlIIIIllIlI[80], lIIlIIIIllIlI[81], lIIlIIIIllIlI[0]);
        ib = new WorldPoint(lIIlIIIIllIlI[82], lIIlIIIIllIlI[83], lIIlIIIIllIlI[0]);
        ic = new WorldPoint(lIIlIIIIllIlI[84], lIIlIIIIllIlI[85], lIIlIIIIllIlI[0]);
        id = new WorldPoint(lIIlIIIIllIlI[86], lIIlIIIIllIlI[87], lIIlIIIIllIlI[0]);
        bA = new ArrayList();
        bY = lIIlIIIIllIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        String[] strArr = new String[lIIlIIIIllIlI[1]];
        strArr[lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[45]];
        if (lIlIlIIIIIllIll(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIlIIIIllIlI[1]];
            iArr[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
            if (lIlIlIIIIIllIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIIlIIIIllIlI[1];
                "".length();
                return (((((81 + 100) - 123) + 70) ^ (((43 + 110) - 149) + 152)) & (((211 ^ 147) ^ (15 ^ 83)) ^ (-" ".length()))) < 0 ? ((230 ^ 194) ^ (16 ^ 84)) & (((163 ^ 130) ^ (238 ^ 175)) ^ (-" ".length())) : r0;
            }
        }
        return lIIlIIIIllIlI[0];
    }

    private static int lIlIlIIIIIllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIlIIIIlIIIlI(int i2, int i3) {
        return i2 <= i3;
    }

    private static void lIlIlIIIIIllIII() {
        lIIlIIIIllIlI = new int[89];
        lIIlIIIIllIlI[0] = ((190 ^ 139) ^ (107 ^ 79)) & (((83 ^ 30) ^ (50 ^ 110)) ^ (-" ".length()));
        lIIlIIIIllIlI[1] = " ".length();
        lIIlIIIIllIlI[2] = (((213 + 86) - 278) + 221) ^ (((1 + 138) - 67) + 108);
        lIIlIIIIllIlI[3] = "  ".length();
        lIIlIIIIllIlI[4] = (-((-8545) & 13793)) & (-27141) & 32767;
        lIIlIIIIllIlI[5] = "   ".length();
        lIIlIIIIllIlI[6] = (13 ^ 39) ^ (180 ^ 154);
        lIIlIIIIllIlI[7] = 40 ^ 45;
        lIIlIIIIllIlI[8] = (-((-5635) & 24103)) & (-8211) & 31678;
        lIIlIIIIllIlI[9] = 26 ^ 28;
        lIIlIIIIllIlI[10] = (-((-8905) & 9214)) & (-20481) & 32767;
        lIIlIIIIllIlI[11] = (-16530) & 24537;
        lIIlIIIIllIlI[12] = (-2595) & 15219;
        lIIlIIIIllIlI[13] = (-(105 ^ 72)) & (-8345) & 16383;
        lIIlIIIIllIlI[14] = (-((-427) & 29103)) & (-1089) & 30716;
        lIIlIIIIllIlI[15] = (((129 + 8) - 60) + 55) ^ (((27 + 110) - 44) + 49);
        lIIlIIIIllIlI[16] = (-55) & 8063;
        lIIlIIIIllIlI[17] = (74 ^ 100) ^ (184 ^ 145);
        lIIlIIIIllIlI[18] = 151 ^ 159;
        lIIlIIIIllIlI[19] = (196 ^ 159) ^ (95 ^ 13);
        lIIlIIIIllIlI[20] = (51 ^ 96) ^ (70 ^ 30);
        lIIlIIIIllIlI[21] = (155 ^ 174) ^ (23 ^ 46);
        lIIlIIIIllIlI[22] = 41 ^ 36;
        lIIlIIIIllIlI[23] = 47 ^ 33;
        lIIlIIIIllIlI[24] = (((65 + 18) - 51) + 101) ^ (((81 + 121) - 173) + 109);
        lIIlIIIIllIlI[25] = 175 ^ 191;
        lIIlIIIIllIlI[26] = 187 ^ 170;
        lIIlIIIIllIlI[27] = (46 ^ 91) ^ (30 ^ 121);
        lIIlIIIIllIlI[28] = (((120 + 91) - 116) + 65) ^ (((134 + 9) - 78) + 114);
        lIIlIIIIllIlI[29] = (((8 + 9) - (-60)) + 76) ^ (((97 + 101) - 66) + 9);
        lIIlIIIIllIlI[30] = 88 ^ 77;
        lIIlIIIIllIlI[31] = (167 ^ 169) ^ (55 ^ 47);
        lIIlIIIIllIlI[32] = 20 ^ 3;
        lIIlIIIIllIlI[33] = 84 ^ 76;
        lIIlIIIIllIlI[34] = 31 ^ 6;
        lIIlIIIIllIlI[35] = 70 ^ 92;
        lIIlIIIIllIlI[36] = 165 ^ 190;
        lIIlIIIIllIlI[37] = 65 ^ 93;
        lIIlIIIIllIlI[38] = (-((-16914) & 26455)) & (-19) & 32631;
        lIIlIIIIllIlI[39] = (((((7 + 101) - 79) + 147) + (227 ^ 138)) - (((81 + 3) - (-29)) + 64)) + ((51 + 115) - 97) + 67;
        lIIlIIIIllIlI[40] = 142 ^ 147;
        lIIlIIIIllIlI[41] = (((62 + 27) - (-11)) + 37) ^ (((117 + 8) - (-11)) + 15);
        lIIlIIIIllIlI[42] = (101 ^ 56) ^ (87 ^ 21);
        lIIlIIIIllIlI[43] = (33 ^ 126) ^ (((98 + 114) - 209) + 124);
        lIIlIIIIllIlI[44] = (94 ^ 42) ^ (203 ^ 158);
        lIIlIIIIllIlI[45] = 180 ^ 150;
        lIIlIIIIllIlI[46] = (-385) & 16284;
        lIIlIIIIllIlI[47] = (-(((101 + 168) - 143) + 67)) & (-26660) & 32751;
        lIIlIIIIllIlI[48] = (((59 + 4) - (-72)) + 23) ^ (((84 + 166) - 83) + 2);
        lIIlIIIIllIlI[49] = (-((-8903) & 16071)) & (-24580) & 32247;
        lIIlIIIIllIlI[50] = (-((-11205) & 27638)) & (-4355) & 32767;
        lIIlIIIIllIlI[51] = (-((-8329) & 13471)) & (-514) & 30655;
        lIIlIIIIllIlI[52] = (-4244) & 6143;
        lIIlIIIIllIlI[53] = (169 ^ 138) ^ (1 ^ 10);
        lIIlIIIIllIlI[54] = 221 ^ 185;
        lIIlIIIIllIlI[55] = (((61 + 90) - 31) + 55) ^ (((57 + 129) - 66) + 20);
        lIIlIIIIllIlI[56] = (122 ^ 6) ^ (26 ^ 66);
        lIIlIIIIllIlI[57] = (211 ^ 144) ^ (229 ^ 131);
        lIIlIIIIllIlI[58] = 118 ^ 80;
        lIIlIIIIllIlI[59] = (221 ^ 149) ^ (70 ^ 41);
        lIIlIIIIllIlI[60] = (141 ^ 177) ^ (162 ^ 183);
        lIIlIIIIllIlI[61] = (79 ^ 0) ^ (202 ^ 175);
        lIIlIIIIllIlI[62] = 186 ^ 145;
        lIIlIIIIllIlI[63] = (74 ^ 116) ^ (179 ^ 161);
        lIIlIIIIllIlI[64] = (185 ^ 195) ^ (53 ^ 98);
        lIIlIIIIllIlI[65] = (181 ^ 141) ^ (156 ^ 138);
        lIIlIIIIllIlI[66] = (218 ^ 154) ^ (109 ^ 2);
        lIIlIIIIllIlI[67] = 45 ^ 29;
        lIIlIIIIllIlI[68] = (60 ^ 13) ^ ((18 ^ 20) & ((6 ^ 0) ^ (-1)));
        lIIlIIIIllIlI[69] = (112 ^ 37) ^ (160 ^ 199);
        lIIlIIIIllIlI[70] = (((38 + 44) - (-41)) + 24) ^ (((147 + 151) - 213) + 75);
        lIIlIIIIllIlI[71] = 143 ^ 187;
        lIIlIIIIllIlI[72] = (229 ^ 167) ^ (82 ^ 37);
        lIIlIIIIllIlI[73] = (((21 + 126) - 131) + 226) ^ (((46 + 152) - 169) + 167);
        lIIlIIIIllIlI[74] = (6 ^ 39) ^ (95 ^ 70);
        lIIlIIIIllIlI[75] = (179 ^ 196) ^ (116 ^ 58);
        lIIlIIIIllIlI[76] = (-(38 ^ 101)) & (-17153) & 20447;
        lIIlIIIIllIlI[77] = (-((-3171) & 32359)) & (-274) & 32701;
        lIIlIIIIllIlI[78] = (-((-12373) & 29557)) & (-12353) & 32766;
        lIIlIIIIllIlI[79] = (-((-9985) & 26487)) & (-4865) & 24575;
        lIIlIIIIllIlI[80] = (-9033) & 12235;
        lIIlIIIIllIlI[81] = (-((-4229) & 13047)) & (-16386) & 28415;
        lIIlIIIIllIlI[82] = (-17155) & 20263;
        lIIlIIIIllIlI[83] = (-28929) & 32192;
        lIIlIIIIllIlI[84] = (-((-4167) & 29311)) & (-321) & 28542;
        lIIlIIIIllIlI[85] = (-4357) & 7615;
        lIIlIIIIllIlI[86] = (-29698) & 32751;
        lIIlIIIIllIlI[87] = (-((-2986) & 31675)) & (-513) & 32447;
        lIIlIIIIllIlI[88] = 85 ^ 111;
    }

    private static void lIlIlIIIIIlIlll() {
        lIIlIIIIllIIl = new String[lIIlIIIIllIlI[88]];
        lIIlIIIIllIIl[lIIlIIIIllIlI[0]] = lIlIlIIIIIlIlII("sUp5OCEJTJ7FXyanj/Lw5g==", "gnaEv");
        lIIlIIIIllIIl[lIIlIIIIllIlI[1]] = lIlIlIIIIIlIlIl("Lx7EhZVotRnlxaimJ0Rrir+xOR0Cch+LoBW9Yy4dnaixtC/Xa2qSFLw7szduBISS", "BixFB");
        lIIlIIIIllIIl[lIIlIIIIllIlI[3]] = lIlIlIIIIIlIlII("QwcwJXUPCOI=", "iBlnB");
        lIIlIIIIllIIl[lIIlIIIIllIlI[5]] = lIlIlIIIIIlIllI("Ly86", "jNNBi");
        lIIlIIIIllIIl[lIIlIIIIllIlI[6]] = lIlIlIIIIIlIlII("ljdekk1+MFoaIA7vbzAADQ==", "PyhLG");
        lIIlIIIIllIIl[lIIlIIIIllIlI[7]] = lIlIlIIIIIlIlII("61rJfX+Zr+LNCUhZ9neBDfYv4y3mrXVh", "ulmxD");
        lIIlIIIIllIIl[lIIlIIIIllIlI[9]] = lIlIlIIIIIlIllI("MjRLExEAcQYbEBY4BRVDFCQOARdFIh4CEwk4DgFPRSIcGxcGOQIcBEUlBFIhMAgiPCQ=", "eQkrc");
        lIIlIIIIllIIl[lIIlIIIIllIlI[17]] = lIlIlIIIIIlIlIl("/iNMrwWwwlC5C7J8KLwINg==", "SQiYH");
        lIIlIIIIllIIl[lIIlIIIIllIlI[18]] = lIlIlIIIIIlIllI("Hj4/LAU2Mz9pGScz", "WPKIw");
        lIIlIIIIllIIl[lIIlIIIIllIlI[19]] = lIlIlIIIIIlIlII("tHBvijxN4/g=", "YdQUW");
        lIIlIIIIllIIl[lIIlIIIIllIlI[15]] = lIlIlIIIIIlIllI("JCQOAQ==", "rAarB");
        lIIlIIIIllIIl[lIIlIIIIllIlI[20]] = lIlIlIIIIIlIlIl("i+0CYOotAju3wG/rf4f/oQ==", "lpeQN");
        lIIlIIIIllIIl[lIIlIIIIllIlI[21]] = lIlIlIIIIIlIlIl("2gmHJqmaFL8=", "JRJtM");
        lIIlIIIIllIIl[lIIlIIIIllIlI[22]] = lIlIlIIIIIlIllI("PjE4Aw==", "iTYqY");
        lIIlIIIIllIIl[lIIlIIIIllIlI[23]] = lIlIlIIIIIlIllI("ICYVdzoBZwc+KU52", "nGcWN");
        lIIlIIIIllIIl[lIIlIIIIllIlI[24]] = lIlIlIIIIIlIllI("BgEMBTU=", "UqmaP");
        lIIlIIIIllIIl[lIIlIIIIllIlI[25]] = lIlIlIIIIIlIllI("IAcf", "dnxkN");
        lIIlIIIIllIIl[lIIlIIIIllIlI[26]] = lIlIlIIIIIlIllI("LzQhZzAOdTMuI0Fn", "aUWGD");
        lIIlIIIIllIIl[lIIlIIIIllIlI[27]] = lIlIlIIIIIlIlII("/O1Pj1EUGaY=", "DPCQE");
        lIIlIIIIllIIl[lIIlIIIIllIlI[28]] = lIlIlIIIIIlIlIl("pxVbwsraSI0=", "GHwUr");
        lIIlIIIIllIIl[lIIlIIIIllIlI[29]] = lIlIlIIIIIlIllI("IDMlSTMBcjcAIE5h", "nRSiG");
        lIIlIIIIllIIl[lIIlIIIIllIlI[30]] = lIlIlIIIIIlIlII("zA5WcAiTV9c=", "EWFXh");
        lIIlIIIIllIIl[lIIlIIIIllIlI[31]] = lIlIlIIIIIlIllI("Lzgq", "kQMvy");
        lIIlIIIIllIIl[lIIlIIIIllIlI[32]] = lIlIlIIIIIlIllI("IyQlTxkCZTcGCk1x", "mESom");
        lIIlIIIIllIIl[lIIlIIIIllIlI[33]] = lIlIlIIIIIlIlII("e81fe6QbxM8=", "qEzZk");
        lIIlIIIIllIIl[lIIlIIIIllIlI[34]] = lIlIlIIIIIlIlII("pCsxbhEZ32o=", "vWIGl");
        lIIlIIIIllIIl[lIIlIIIIllIlI[35]] = lIlIlIIIIIlIlIl("aDoF0S2pyDVRDZdD3bkHn+7Su2rI2ET2", "eGBKd");
        lIIlIIIIllIIl[lIIlIIIIllIlI[36]] = lIlIlIIIIIlIllI("EQIOFDc5Dw5RKygP", "XlzqE");
        lIIlIIIIllIIl[lIIlIIIIllIlI[37]] = lIlIlIIIIIlIlII("Bkj7FtL15uI=", "boLGf");
        lIIlIIIIllIIl[lIIlIIIIllIlI[40]] = lIlIlIIIIIlIlIl("DfrpWvTnTvhgtM2f+b7/+Q==", "XzUSJ");
        lIIlIIIIllIIl[lIIlIIIIllIlI[41]] = lIlIlIIIIIlIllI("Mw07", "axYqk");
        lIIlIIIIllIIl[lIIlIIIIllIlI[42]] = lIlIlIIIIIlIlIl("xkOU5gciAWQ5ZXrHU6PDbBaJHa54h3kd", "jnZHZ");
        lIIlIIIIllIIl[lIIlIIIIllIlI[43]] = lIlIlIIIIIlIlIl("z1HPHxM0Yc4=", "PCnKJ");
        lIIlIIIIllIIl[lIIlIIIIllIlI[44]] = lIlIlIIIIIlIlII("52/BIQycTqM=", "zEZzi");
        lIIlIIIIllIIl[lIIlIIIIllIlI[45]] = lIlIlIIIIIlIlIl("N6BAIJ28QD4=", "JlaRX");
        lIIlIIIIllIIl[lIIlIIIIllIlI[55]] = lIlIlIIIIIlIlII("a6cRihFdEHkpA0/Ivkn6iqNWxf7FBAHr", "LEhgf");
        lIIlIIIIllIIl[lIIlIIIIllIlI[56]] = lIlIlIIIIIlIlIl("fruU5XJDgI+Z0wZKrbFUJh+65BZCtH3X", "VJXHV");
        lIIlIIIIllIIl[lIIlIIIIllIlI[57]] = lIlIlIIIIIlIlIl("dBaA+57KCXQ=", "XakPh");
        lIIlIIIIllIIl[lIIlIIIIllIlI[58]] = lIlIlIIIIIlIllI("GCYZOwwH", "oCxWx");
        lIIlIIIIllIIl[lIIlIIIIllIlI[59]] = lIlIlIIIIIlIlII("e0Yj8jjGgiQ=", "PkIDs");
        lIIlIIIIllIIl[lIIlIIIIllIlI[53]] = lIlIlIIIIIlIlII("Rny+veKKKvA=", "PJOvI");
        lIIlIIIIllIIl[lIIlIIIIllIlI[60]] = lIlIlIIIIIlIlII("j0Qwqu6jYJo=", "uIGXo");
        lIIlIIIIllIIl[lIIlIIIIllIlI[61]] = lIlIlIIIIIlIllI("CC4YOjY=", "oBwHO");
        lIIlIIIIllIIl[lIIlIIIIllIlI[62]] = lIlIlIIIIIlIllI("ChhJTxhiHkUaIWUVCh1xJB1FDjUzFgsbJDcWSw==", "EseoQ");
        lIIlIIIIllIIl[lIIlIIIIllIlI[63]] = lIlIlIIIIIlIlII("+JTSHf2sTmdxm5qlVuQteQOxu/8llHhFIOjElAor6TEaSlTEEQvdpA==", "jgPEZ");
        lIIlIIIIllIIl[lIIlIIIIllIlI[64]] = lIlIlIIIIIlIlII("EitF7ZG4Oc3lZfLKKh0XdJ9BusuH428K", "lAgAc");
        lIIlIIIIllIIl[lIIlIIIIllIlI[65]] = lIlIlIIIIIlIllI("Fig0Wg==", "OMGta");
        lIIlIIIIllIIl[lIIlIIIIllIlI[66]] = lIlIlIIIIIlIlIl("ZPD1dRgfWRUekXuH0rvYtkcVbyj3Wg94IxjMSUSH2jE=", "vgovb");
        lIIlIIIIllIIl[lIIlIIIIllIlI[67]] = lIlIlIIIIIlIlIl("6wYDvTvbbi/P71+qJWeP4zMWV3H2dmx6", "PcAai");
        lIIlIIIIllIIl[lIIlIIIIllIlI[68]] = lIlIlIIIIIlIllI("EjEDOgsmcDY3HDEzHHIdMT4DcgMxcAM9TiAxGzlOID9XKwEhfg==", "TPwRn");
        lIIlIIIIllIIl[lIIlIIIIllIlI[69]] = lIlIlIIIIIlIllI("IjRXFmMNPgRFIko2GAowHnEYBDYEJRkLJEo5GRZjDSMREyYTMAIBbQ==", "jQpeC");
        lIIlIIIIllIIl[lIIlIIIIllIlI[70]] = lIlIlIIIIIlIlII("NC5HjffmuRv0D1pgrVJHgmQQ8rlZ4deQ+8D9CnJAS3+d2Q6RGzq6Zw==", "ZGPBx");
        lIIlIIIIllIIl[lIIlIIIIllIlI[71]] = lIlIlIIIIIlIlIl("hicx4omZwt0=", "GIWdL");
        lIIlIIIIllIIl[lIIlIIIIllIlI[72]] = lIlIlIIIIIlIlII("xrdeimi4keQe9WF01pBREYDa2dcnh5pE7q4PjlhxQlQgaQ0OM8Nekg==", "NVcoz");
        lIIlIIIIllIIl[lIIlIIIIllIlI[73]] = lIlIlIIIIIlIlII("Sir7rF07XEoGqcWGoWM2qA==", "neUiv");
        lIIlIIIIllIIl[lIIlIIIIllIlI[48]] = lIlIlIIIIIlIlIl("UtOHOiFMfOK7ZzRM4WdaxA==", "GZciv");
        lIIlIIIIllIIl[lIIlIIIIllIlI[74]] = lIlIlIIIIIlIlIl("e74XPehSv9t2tgFrXLzBBjbhk+wwX28iKOXqyd/xg4U=", "pXrQr");
        lIIlIIIIllIIl[lIIlIIIIllIlI[75]] = lIlIlIIIIIlIlIl("uCBkjFKcmFZUcKXwaY8gcg==", "LkrhR");
    }

    private static String lIlIlIIIIIlIllI(String llllllllllllllIllllllIlIlIIlIlll, String llllllllllllllIllllllIlIlIIlIllI) {
        String llllllllllllllIllllllIlIlIIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllllIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllllIlIlIIlIllI.toCharArray();
        int llllllllllllllIllllllIlIlIIlIIll = lIIlIIIIllIlI[0];
        char[] charArray2 = llllllllllllllIllllllIlIlIIlIlll2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlIIIIllIlI[0];
        while (lIlIlIIIIIlllII(i2, length)) {
            char llllllllllllllIllllllIlIlIIllIII = charArray2[i2];
            sb.append((char) (llllllllllllllIllllllIlIlIIllIII ^ charArray[llllllllllllllIllllllIlIlIIlIIll % charArray.length]));
            "".length();
            llllllllllllllIllllllIlIlIIlIIll++;
            i2++;
            "".length();
            if (" ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIlIIIIlIIlII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[18])) {
            int[] iArr = new int[lIIlIIIIllIlI[1]];
            iArr[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[38];
            if (lIlIlIIIIIlllIl(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIIlIIIIllIlI[1];
                "".length();
                return (((106 ^ 58) ^ (67 ^ 33)) & (((177 ^ 170) ^ (156 ^ 181)) ^ (-" ".length()))) >= ((((100 + 128) - 142) + 48) ^ (((43 + 20) - 35) + 102)) ? ((66 ^ 57) ^ (204 ^ 167)) & (((76 ^ 54) ^ (27 ^ 113)) ^ (-" ".length())) & ((((((52 + 83) - 64) + 118) ^ (((117 + 143) - 132) + 53)) & (((249 ^ 192) ^ (170 ^ 155)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
            }
        }
        return lIIlIIIIllIlI[0];
    }

    private static boolean lIlIlIIIIlIIlII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIlIIIIlIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIIIIIllllI(int i2) {
        return i2 < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v356, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v401, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v62, types: [boolean] */
    public static void cB() {
        if (lIlIlIIIIIllIll(by ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[0]];
            C0001b.a(bA);
            if (lIlIlIIIIIlllII(bA.size(), lIIlIIIIllIlI[1])) {
                System.out.println(lIIlIIIIllIIl[lIIlIIIIllIlI[1]]);
                by = lIIlIIIIllIlI[0];
            }
        }
        if (lIlIlIIIIIlllIl(by ? 1 : 0)) {
            if (lIlIlIIIIIllIll(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIlIIIIIlllII(Movement.getRunEnergy(), lIIlIIIIllIlI[2])) {
                Inventory.getFirst(C0005f.ba).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[3]]);
                Time.sleepTicks(lIIlIIIIllIlI[1]);
                "".length();
            }
            if (lIlIlIIIIIllllI(lIlIlIIIIIllIIl(C0004e.v(), 70.0d))) {
                int[] iArr = new int[lIIlIIIIllIlI[1]];
                iArr[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
                if (lIlIlIIIIIllIll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIIIIllIlI[1]];
                    iArr2[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
                    Inventory.getFirst(iArr2).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[5]]);
                }
            }
            if (lIlIlIIIIIlllIl(Movement.isRunEnabled() ? 1 : 0) && lIlIlIIIIIlllll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIlIIIIIlllIl(S() ? 1 : 0) && lIlIlIIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIIIIlIIIII(nearest) && lIlIlIIIIIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIlIIIIllIlI[3]);
                    "".length();
                }
                if (lIlIlIIIIlIIIII(nearest) && lIlIlIIIIIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[7]];
                    if (lIlIlIIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIIllIlI[8]);
                        "".length();
                    }
                    if (lIlIlIIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlIIIIIlllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIIllIlI[6]);
                            "".length();
                        }
                        if (lIlIlIIIIIlllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIIllIlI[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIIlIIIIllIlI[9]];
                        iArr3[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[10];
                        iArr3[lIIlIIIIllIlI[1]] = lIIlIIIIllIlI[11];
                        iArr3[lIIlIIIIllIlI[3]] = lIIlIIIIllIlI[12];
                        iArr3[lIIlIIIIllIlI[5]] = lIIlIIIIllIlI[13];
                        iArr3[lIIlIIIIllIlI[6]] = lIIlIIIIllIlI[4];
                        iArr3[lIIlIIIIllIlI[7]] = lIIlIIIIllIlI[14];
                        if (lIlIlIIIIIlllIl(C0004e.b(iArr3) ? 1 : 0)) {
                            W();
                            System.out.println(lIIlIIIIllIIl[lIIlIIIIllIlI[9]]);
                            by = lIIlIIIIllIlI[1];
                            return;
                        }
                        int[] iArr4 = new int[lIIlIIIIllIlI[9]];
                        iArr4[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[10];
                        iArr4[lIIlIIIIllIlI[1]] = lIIlIIIIllIlI[11];
                        iArr4[lIIlIIIIllIlI[3]] = lIIlIIIIllIlI[12];
                        iArr4[lIIlIIIIllIlI[5]] = lIIlIIIIllIlI[13];
                        iArr4[lIIlIIIIllIlI[6]] = lIIlIIIIllIlI[4];
                        iArr4[lIIlIIIIllIlI[7]] = lIIlIIIIllIlI[14];
                        if (lIlIlIIIIIllIll(C0004e.b(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lIIlIIIIllIlI[11], lIIlIIIIllIlI[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIlIIIIllIlI[1]);
                            "".length();
                            Bank.withdraw(lIIlIIIIllIlI[14], lIIlIIIIllIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIlIIIIllIlI[1]);
                            "".length();
                            Bank.withdraw(lIIlIIIIllIlI[16], lIIlIIIIllIlI[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIlIIIIllIlI[1]);
                            "".length();
                            Bank.withdraw(lIIlIIIIllIlI[13], lIIlIIIIllIlI[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIlIIIIllIlI[1]);
                            "".length();
                            Bank.withdraw(lIIlIIIIllIlI[10], lIIlIIIIllIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIlIIIIllIlI[1]);
                            "".length();
                            C0000a.b(C0005f.ba, lIIlIIIIllIlI[6]);
                            C0000a.a(lIIlIIIIllIlI[4], lIIlIIIIllIlI[15]);
                            C0000a.b(C0005f.bk, lIIlIIIIllIlI[1]);
                        }
                    }
                }
            }
            if (lIlIlIIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && lIlIlIIIIIllIll(S() ? 1 : 0)) {
                if (lIlIlIIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(hY), lIIlIIIIllIlI[3])) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[17]];
                    if (lIlIlIIIIIlllII(bY, lIIlIIIIllIlI[1])) {
                        C0004e.w();
                        bY += lIIlIIIIllIlI[1];
                    }
                    Movement.walkTo(hY);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIlI[1]);
                    "".length();
                }
                if (lIlIlIIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(hY), lIIlIIIIllIlI[3])) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[18]];
                    if (lIlIlIIIIIlllIl(lIlIlIIIIIllIlI(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (lIlIlIIIIIllIll(lIlIlIIIIIllIlI(g, 0L)) && lIlIlIIIIIlllll(lIlIlIIIIIllIlI(C0004e.a(g), 30000L))) {
                        bY = lIIlIIIIllIlI[0];
                        g = System.currentTimeMillis();
                    }
                    if (lIlIlIIIIIlllII(bY, lIIlIIIIllIlI[1])) {
                        C0004e.w();
                        bY += lIIlIIIIllIlI[1];
                    }
                    if (lIlIlIIIIIllIll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[lIIlIIIIllIlI[1]];
                        iArr5[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
                        Inventory.getFirst(iArr5).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[19]]);
                        Time.sleepTicks(lIIlIIIIllIlI[3]);
                        "".length();
                    }
                    C0006g.a(lIIlIIIIllIIl[lIIlIIIIllIlI[15]], hX, lIIlIIIIllIlI[1]);
                }
            }
            if (lIlIlIIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[1])) {
                co = lIIlIIIIllIlI[0];
                String[] strArr = new String[lIIlIIIIllIlI[1]];
                strArr[lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[20]];
                if (lIlIlIIIIIlllIl(Inventory.contains(strArr) ? 1 : 0)) {
                    C0006g.a(hX);
                }
            }
            if (lIlIlIIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[3])) {
                if (lIlIlIIIIIllIll(Inventory.contains(item -> {
                    return item.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[61]]);
                }) ? 1 : 0) && lIlIlIIIIIlllIl(Equipment.contains(item2 -> {
                    return item2.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[53]]);
                    }).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[21]]);
                }
                if (lIlIlIIIIIllIll(Inventory.contains(item4 -> {
                    return item4.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[59]]);
                }) ? 1 : 0) && lIlIlIIIIIlllIl(Equipment.contains(item5 -> {
                    return item5.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[57]]);
                    }).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[22]]);
                }
                if (lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals(hZ) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[23]];
                    Movement.walkTo(hZ);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIlI[1]);
                    "".length();
                }
                if (lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals(hZ) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIIIIllIlI[1]];
                    strArr2[lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[24]];
                    Inventory.getFirst(strArr2).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[25]]);
                    Time.sleepTicks(lIIlIIIIllIlI[3]);
                    "".length();
                }
            }
            if (lIlIlIIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[5])) {
                if (lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals(ia) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[26]];
                    Movement.walkTo(ia);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIlI[1]);
                    "".length();
                }
                if (lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals(ia) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIlIIIIllIlI[1]];
                    strArr3[lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[27]];
                    Inventory.getFirst(strArr3).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[28]]);
                    Time.sleepTicks(lIIlIIIIllIlI[3]);
                    "".length();
                }
            }
            if (lIlIlIIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[6])) {
                if (lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals(ib) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[29]];
                    Movement.walkTo(ib);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIlI[1]);
                    "".length();
                }
                if (lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals(ib) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIlIIIIllIlI[1]];
                    strArr4[lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[30]];
                    Inventory.getFirst(strArr4).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[31]]);
                    Time.sleepTicks(lIIlIIIIllIlI[3]);
                    "".length();
                }
            }
            if (lIlIlIIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[7])) {
                if (lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals(ic) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[32]];
                    Movement.walkTo(ic);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIlI[1]);
                    "".length();
                }
                if (lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals(ic) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIlIIIIllIlI[1]];
                    strArr5[lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[33]];
                    Inventory.getFirst(strArr5).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[34]]);
                    Time.sleepTicks(lIIlIIIIllIlI[3]);
                    "".length();
                }
            }
            if (lIlIlIIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[9])) {
                if (lIlIlIIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(id), lIIlIIIIllIlI[5])) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[35]];
                    Movement.walkTo(id);
                    "".length();
                    Time.sleepTicks(lIIlIIIIllIlI[1]);
                    "".length();
                }
                if (lIlIlIIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(id), lIIlIIIIllIlI[5])) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[36]];
                    if (lIlIlIIIIIlllII(co, lIIlIIIIllIlI[1])) {
                        P.lk += lIIlIIIIllIlI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIllIlI[1];
                        P.lk = lIIlIIIIllIlI[0];
                        cp = lIIlIIIIllIlI[0];
                    }
                    C0006g.a(lIIlIIIIllIIl[lIIlIIIIllIlI[37]], hX);
                }
            }
            if (lIlIlIIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[17])) {
                C0006g.a(hX);
            }
            do {
                int[] iArr6 = new int[lIIlIIIIllIlI[1]];
                iArr6[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[38];
                if (!lIlIlIIIIIllIll(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0006g.a(new String[lIIlIIIIllIlI[0]]);
                    return;
                }
                if (lIlIlIIIIlIIIII(Widgets.get(lIIlIIIIllIlI[39]))) {
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[40]];
                    int[] iArr7 = new int[lIIlIIIIllIlI[1]];
                    iArr7[lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[38];
                    Inventory.getFirst(iArr7).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[41]]);
                    Time.sleepTicks(lIIlIIIIllIlI[6]);
                    "".length();
                    AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[42]];
                    Widget widget = Widgets.get(lIIlIIIIllIlI[39], lIIlIIIIllIlI[23]);
                    if (lIlIlIIIIlIIIII(widget)) {
                        widget.interact(lIIlIIIIllIIl[lIIlIIIIllIlI[43]]);
                        Time.sleepTicks(lIIlIIIIllIlI[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(lIIlIIIIllIlI[39], lIIlIIIIllIlI[35]);
                    if (lIlIlIIIIlIIIII(widget2)) {
                        widget2.interact(lIIlIIIIllIIl[lIIlIIIIllIlI[44]]);
                        Time.sleepTicks(lIIlIIIIllIlI[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(lIIlIIIIllIlI[1]);
                "".length();
                "".length();
            } while (((114 ^ 97) ^ (208 ^ 199)) > " ".length());
        }
    }

    private static boolean lIlIlIIIIIlllIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIllIlI[0];
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIlIIIIllIIl[lIIlIIIIllIlI[55]];
    }
}
