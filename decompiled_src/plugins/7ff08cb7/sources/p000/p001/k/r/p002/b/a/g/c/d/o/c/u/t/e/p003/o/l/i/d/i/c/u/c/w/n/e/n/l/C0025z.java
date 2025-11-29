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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/z.class */
public class C0025z implements ab {
    public static /* synthetic */ boolean dQ;
    private static /* synthetic */ int[] lIIIIlllII;
    private static /* synthetic */ String[] cG;
    private static /* synthetic */ String[] lIIIIlIlII;
    public static /* synthetic */ boolean dP;
    static /* synthetic */ String dc;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ boolean dR;
    static /* synthetic */ int dS;
    static /* synthetic */ int dk;
    static /* synthetic */ String h;
    static /* synthetic */ int dL;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint dg;

    private static String lllIIIIllIll(String llIlIlIIIIIl, String llIlIIlllIll) {
        String str = new String(Base64.getDecoder().decode(llIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIlIIlllllI = llIlIIlllIll.toCharArray();
        int llIlIIllllIl = lIIIIlllII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIIlllII[1];
        while (lllIIlIIllII(i, length)) {
            char llIlIlIIIIlI = charArray[i];
            sb.append((char) (llIlIlIIIIlI ^ llIlIIlllllI[llIlIIllllIl % llIlIIlllllI.length]));
            "".length();
            llIlIIllllIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIIllIIlII(int i, int i2) {
        return i != i2;
    }

    private static String lllIIIIllIlI(String llIlIIlIllII, String llIlIIlIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIlllII[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlIllIl) {
            llIlIIlIllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lllIIlIlllII(C0004e.j(dL), lIIIIlllII[152]) && lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
            ?? r0 = lIIIIlllII[0];
            "".length();
            return ((182 ^ 146) & ((162 ^ 134) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIlllII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIIIIlllII[13]];
        iArr[lIIIIlllII[1]] = lIIIIlllII[22];
        iArr[lIIIIlllII[0]] = lIIIIlllII[23];
        iArr[lIIIIlllII[7]] = lIIIIlllII[36];
        iArr[lIIIIlllII[9]] = lIIIIlllII[24];
        iArr[lIIIIlllII[10]] = lIIIIlllII[26];
        iArr[lIIIIlllII[11]] = lIIIIlllII[25];
        int i = lIIIIlllII[1];
        while (lllIIlIIllII(i, iArr.length)) {
            int[] iArr2 = new int[lIIIIlllII[0]];
            iArr2[lIIIIlllII[1]] = iArr[i];
            if (lllIIlIllIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIIlllII[1];
            }
            i++;
            "".length();
            if (!(true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIIlllII[0];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return h;
    }

    private static boolean lllIIlIllIll(int i) {
        return i == 0;
    }

    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (lllIIlIlllIl(nearest) && lllIIlIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[236]];
            C0000a.a(nearest);
        }
        if (lllIIlIlllIl(nearest) && lllIIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIIlllII[12]);
                "".length();
            }
            if (lllIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[237]];
                if (lllIIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIIlllII[10]);
                    "".length();
                }
                C0000a.a(lIIIIlllII[22], lIIIIlllII[15]);
                C0000a.a(lIIIIlllII[36], lIIIIlllII[7]);
                C0000a.a(lIIIIlllII[14], lIIIIlllII[15]);
                C0000a.a(lIIIIlllII[16], lIIIIlllII[11]);
                C0000a.a(lIIIIlllII[18], lIIIIlllII[7]);
                C0000a.a(lIIIIlllII[32], lIIIIlllII[0]);
                C0000a.a(lIIIIlllII[30], lIIIIlllII[0]);
                C0000a.a(lIIIIlllII[28], lIIIIlllII[0]);
                C0000a.a(lIIIIlllII[19], lIIIIlllII[15]);
                C0000a.a(lIIIIlllII[35], Inventory.getFreeSlots() - lIIIIlllII[0]);
            }
        }
    }

    private static boolean lllIIlIIllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIlIllllI(int i) {
        return i > 0;
    }

    private static boolean lllIIlIlllll(int i) {
        return i < 0;
    }

    private static boolean lllIIlIlllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bn() {
        int[] iArr = new int[lIIIIlllII[0]];
        iArr[lIIIIlllII[1]] = lIIIIlllII[14];
        if (lllIIlIIlIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIlllII[0]];
            iArr2[lIIIIlllII[1]] = lIIIIlllII[16];
            if (lllIIlIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIIlllII[0]];
                iArr3[lIIIIlllII[1]] = lIIIIlllII[18];
                if (lllIIlIIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIIIIlllII[0];
                    "".length();
                    return (28 ^ 24) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIIlllII[1];
    }

    private static boolean lllIIllIIIlI(int i, int i2) {
        return i == i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bk();
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return ((((170 + 41) - 124) + 136) ^ (((179 + 181) - 328) + 159)) & (((88 ^ 49) ^ (188 ^ 181)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIlllII[139];
    }

    private static String lllIIIIllIIl(String llIlIIIlllll, String llIlIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lIIIIlllII[27]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIlllII[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlIIIII) {
            llIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static int lllIIlIIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lllIIlIIlIIl() {
        lIIIIlllII = new int[310];
        lIIIIlllII[0] = " ".length();
        lIIIIlllII[1] = ((116 ^ 115) ^ (121 ^ 109)) & (((105 ^ 61) ^ (128 ^ 199)) ^ (-" ".length()));
        lIIIIlllII[2] = ((118 + 26) - (-5)) + 16;
        lIIIIlllII[3] = (90 ^ 126) ^ (153 ^ 163);
        lIIIIlllII[4] = (-25097) & 26601;
        lIIIIlllII[5] = (-((-21885) & 32255)) & (-20545) & 31231;
        lIIIIlllII[6] = (112 ^ 89) ^ (184 ^ 163);
        lIIIIlllII[7] = "  ".length();
        lIIIIlllII[8] = 46 ^ 49;
        lIIIIlllII[9] = "   ".length();
        lIIIIlllII[10] = 143 ^ 139;
        lIIIIlllII[11] = (131 ^ 183) ^ (10 ^ 59);
        lIIIIlllII[12] = (-16424) & 21423;
        lIIIIlllII[13] = 30 ^ 24;
        lIIIIlllII[14] = (-28677) & 30623;
        lIIIIlllII[15] = (((13 + 107) - 19) + 39) ^ (((99 + 108) - 80) + 7);
        lIIIIlllII[16] = (-9505) & 11642;
        lIIIIlllII[17] = (-((-14562) & 31471)) & (-9313) & 28655;
        lIIIIlllII[18] = (-6169) & 7679;
        lIIIIlllII[19] = (-24753) & 32761;
        lIIIIlllII[20] = 145 ^ 150;
        lIIIIlllII[21] = 183 ^ 186;
        lIIIIlllII[22] = (-(((120 + 103) - 201) + 115)) & (-8209) & 16351;
        lIIIIlllII[23] = (-24597) & 32607;
        lIIIIlllII[24] = (-4743) & 7847;
        lIIIIlllII[25] = (-((-3395) & 32067)) & (-1) & 30687;
        lIIIIlllII[26] = (-((-3219) & 7870)) & (-385) & 7151;
        lIIIIlllII[27] = (((60 + 177) - 57) + 23) ^ (((52 + 177) - 221) + 187);
        lIIIIlllII[28] = (((((217 + 198) - 321) + 126) + (204 ^ 159)) - (74 ^ 6)) + (92 ^ 90);
        lIIIIlllII[29] = 58 ^ 51;
        lIIIIlllII[30] = 81 ^ 50;
        lIIIIlllII[31] = (74 ^ 109) ^ (136 ^ 164);
        lIIIIlllII[32] = (-((-24969) & 32154)) & (-8193) & 15967;
        lIIIIlllII[33] = (33 ^ 60) ^ (212 ^ 197);
        lIIIIlllII[34] = (-24625) & 28477;
        lIIIIlllII[35] = (-((-3859) & 12087)) & (-2627) & 11239;
        lIIIIlllII[36] = (-19969) & 32593;
        lIIIIlllII[37] = (200 ^ 146) ^ (110 ^ 44);
        lIIIIlllII[38] = 188 ^ 178;
        lIIIIlllII[39] = (112 ^ 11) ^ (0 ^ 116);
        lIIIIlllII[40] = 137 ^ 153;
        lIIIIlllII[41] = 177 ^ 160;
        lIIIIlllII[42] = (((40 + 135) - 156) + 129) ^ (((26 + 121) - 49) + 36);
        lIIIIlllII[43] = (37 ^ 96) ^ (125 ^ 43);
        lIIIIlllII[44] = 96 ^ 116;
        lIIIIlllII[45] = 120 ^ 109;
        lIIIIlllII[46] = (((112 + 19) - 9) + 43) ^ (((57 + 166) - 102) + 58);
        lIIIIlllII[47] = 208 ^ 199;
        lIIIIlllII[48] = (78 ^ 94) ^ (141 ^ 132);
        lIIIIlllII[49] = (30 ^ 19) ^ (27 ^ 12);
        lIIIIlllII[50] = 123 ^ 96;
        lIIIIlllII[51] = (-29793) & 32637;
        lIIIIlllII[52] = (-2077) & 12127;
        lIIIIlllII[53] = (((52 + 159) - 123) + 83) ^ (((119 + 127) - 143) + 80);
        lIIIIlllII[54] = (105 ^ 11) ^ (((64 + 91) - 93) + 65);
        lIIIIlllII[55] = 180 ^ 148;
        lIIIIlllII[56] = 108 ^ 77;
        lIIIIlllII[57] = 29 ^ 63;
        lIIIIlllII[58] = 183 ^ 148;
        lIIIIlllII[59] = (-16388) & 19223;
        lIIIIlllII[60] = (-((-1633) & 24290)) & (-5) & 32751;
        lIIIIlllII[61] = (97 ^ 62) ^ (118 ^ 13);
        lIIIIlllII[62] = (((20 + 91) - 95) + 122) ^ (((44 + 144) - 18) + 5);
        lIIIIlllII[63] = (78 ^ 39) ^ (80 ^ 31);
        lIIIIlllII[64] = (126 ^ 106) ^ (24 ^ 43);
        lIIIIlllII[65] = (((97 + 3) - 9) + 40) ^ (((63 + 115) - 129) + 122);
        lIIIIlllII[66] = (-((-27429) & 32677)) & (-33) & 8115;
        lIIIIlllII[67] = (-20491) & 24171;
        lIIIIlllII[68] = 139 ^ 162;
        lIIIIlllII[69] = (-((-929) & 30639)) & (-65) & 32639;
        lIIIIlllII[70] = (-((-2065) & 30776)) & (-257) & 32631;
        lIIIIlllII[71] = (((69 + 48) - (-32)) + 9) ^ (((174 + 178) - 272) + 100);
        lIIIIlllII[72] = (13 ^ 27) ^ (100 ^ 89);
        lIIIIlllII[73] = (-4149) & 7414;
        lIIIIlllII[74] = (67 ^ 37) ^ (46 ^ 100);
        lIIIIlllII[75] = 167 ^ 138;
        lIIIIlllII[76] = (((23 + 49) - 62) + 176) ^ (((95 + 107) - 156) + 102);
        lIIIIlllII[77] = 47 ^ 0;
        lIIIIlllII[78] = (54 ^ 91) ^ (208 ^ 141);
        lIIIIlllII[79] = (-20869) & 23479;
        lIIIIlllII[80] = (-((-3355) & 12063)) & (-33) & 12023;
        lIIIIlllII[81] = (((170 + 115) - 182) + 80) ^ (((40 + 74) - 100) + 120);
        lIIIIlllII[82] = 110 ^ 93;
        lIIIIlllII[83] = 91 ^ 111;
        lIIIIlllII[84] = (71 ^ 100) ^ (189 ^ 171);
        lIIIIlllII[85] = (((155 + 113) - 125) + 18) ^ (((31 + 62) - 65) + 123);
        lIIIIlllII[86] = (209 ^ 194) ^ (153 ^ 189);
        lIIIIlllII[87] = (-8505) & 11774;
        lIIIIlllII[88] = 17 ^ 41;
        lIIIIlllII[89] = (73 ^ 11) ^ (112 ^ 11);
        lIIIIlllII[90] = 41 ^ 19;
        lIIIIlllII[91] = (76 ^ 22) ^ (94 ^ 63);
        lIIIIlllII[92] = 13 ^ 49;
        lIIIIlllII[93] = 167 ^ 154;
        lIIIIlllII[94] = 169 ^ 151;
        lIIIIlllII[95] = 177 ^ 142;
        lIIIIlllII[96] = 249 ^ 185;
        lIIIIlllII[97] = (116 ^ 122) ^ (87 ^ 24);
        lIIIIlllII[98] = (44 ^ 3) ^ (168 ^ 197);
        lIIIIlllII[99] = (14 ^ 110) ^ (141 ^ 174);
        lIIIIlllII[100] = (27 ^ 56) ^ (11 ^ 108);
        lIIIIlllII[101] = (-((-109) & 20589)) & (-2177) & 32765;
        lIIIIlllII[102] = (0 ^ 80) ^ (25 ^ 12);
        lIIIIlllII[103] = (121 ^ 57) ^ (151 ^ 145);
        lIIIIlllII[104] = 114 ^ 53;
        lIIIIlllII[105] = 71 ^ 15;
        lIIIIlllII[106] = 63 ^ 118;
        lIIIIlllII[107] = (148 ^ 196) ^ (180 ^ 174);
        lIIIIlllII[108] = 203 ^ 128;
        lIIIIlllII[109] = 102 ^ 42;
        lIIIIlllII[110] = (155 ^ 178) ^ (251 ^ 159);
        lIIIIlllII[111] = (-((-2817) & 23377)) & (-1025) & 24415;
        lIIIIlllII[112] = (-4109) & 14205;
        lIIIIlllII[113] = 235 ^ 165;
        lIIIIlllII[114] = (63 ^ 84) ^ (113 ^ 85);
        lIIIIlllII[115] = (24 ^ 56) ^ (203 ^ 187);
        lIIIIlllII[116] = (-((-67) & 24703)) & (-1) & 27903;
        lIIIIlllII[117] = (-((-19267) & 32603)) & (-16389) & 32637;
        lIIIIlllII[118] = (-((-3409) & 32753)) & (-5) & 32767;
        lIIIIlllII[119] = 193 ^ 144;
        lIIIIlllII[120] = (6 ^ 27) ^ (254 ^ 177);
        lIIIIlllII[121] = (184 ^ 145) ^ (14 ^ 116);
        lIIIIlllII[122] = 124 ^ 40;
        lIIIIlllII[123] = (((30 + 11) - (-8)) + 143) ^ (((138 + 27) - 67) + 51);
        lIIIIlllII[124] = (91 ^ 67) ^ (108 ^ 34);
        lIIIIlllII[125] = 228 ^ 179;
        lIIIIlllII[126] = 218 ^ 130;
        lIIIIlllII[127] = 78 ^ 23;
        lIIIIlllII[128] = 121 ^ 35;
        lIIIIlllII[129] = 94 ^ 5;
        lIIIIlllII[130] = (110 ^ 16) ^ (172 ^ 142);
        lIIIIlllII[131] = 57 ^ 100;
        lIIIIlllII[132] = (23 ^ 93) ^ (57 ^ 45);
        lIIIIlllII[133] = 236 ^ 179;
        lIIIIlllII[134] = (-((-1612) & 30587)) & (-513) & 32751;
        lIIIIlllII[135] = (-4097) & 7359;
        lIIIIlllII[136] = (230 ^ 144) ^ (32 ^ 54);
        lIIIIlllII[137] = 243 ^ 146;
        lIIIIlllII[138] = 85 ^ 55;
        lIIIIlllII[139] = 206 ^ 170;
        lIIIIlllII[140] = (-12417) & 15305;
        lIIIIlllII[141] = (-24995) & 28671;
        lIIIIlllII[142] = (((127 + 55) - 83) + 61) ^ (((171 + 126) - 178) + 78);
        lIIIIlllII[143] = (((34 + 81) - 85) + 162) ^ (((53 + 101) - 21) + 33);
        lIIIIlllII[144] = 210 ^ 181;
        lIIIIlllII[145] = 75 ^ 35;
        lIIIIlllII[146] = (((95 + 208) - 144) + 71) ^ (((92 + 112) - 79) + 18);
        lIIIIlllII[147] = 35 ^ 73;
        lIIIIlllII[148] = (77 ^ 125) ^ (31 ^ 68);
        lIIIIlllII[149] = 91 ^ 55;
        lIIIIlllII[150] = 172 ^ 193;
        lIIIIlllII[151] = (-((-3079) & 20031)) & (-4101) & 24317;
        lIIIIlllII[152] = 11 ^ 101;
        lIIIIlllII[153] = 63 ^ 80;
        lIIIIlllII[154] = 251 ^ 139;
        lIIIIlllII[155] = (7 ^ 31) ^ (18 ^ 123);
        lIIIIlllII[156] = (88 ^ 37) ^ (157 ^ 146);
        lIIIIlllII[157] = (128 ^ 156) ^ (225 ^ 142);
        lIIIIlllII[158] = 77 ^ 57;
        lIIIIlllII[159] = (((109 + 63) - 41) + 110) ^ (((91 + 116) - 201) + 126);
        lIIIIlllII[160] = 242 ^ 132;
        lIIIIlllII[161] = 33 ^ 86;
        lIIIIlllII[162] = (112 ^ 81) ^ (26 ^ 67);
        lIIIIlllII[163] = (30 ^ 24) ^ (((77 + 81) - 150) + 119);
        lIIIIlllII[164] = 6 ^ 124;
        lIIIIlllII[165] = 209 ^ 170;
        lIIIIlllII[166] = 247 ^ 139;
        lIIIIlllII[167] = (((15 + 73) - (-6)) + 108) ^ (((31 + 100) - 125) + 177);
        lIIIIlllII[168] = (((146 + 4) - (-59)) + 0) ^ (((0 + 154) - 57) + 78);
        lIIIIlllII[169] = (((60 ^ 55) + (100 ^ 54)) - (28 ^ 19)) + (131 ^ 178);
        lIIIIlllII[170] = (((182 ^ 185) + (254 ^ 139)) - (236 ^ 135)) + (93 ^ 58);
        lIIIIlllII[171] = ((4 + 123) - 89) + 91;
        lIIIIlllII[172] = (((100 ^ 47) + (229 ^ 168)) - (165 ^ 137)) + (74 ^ 92);
        lIIIIlllII[173] = (-((-2389) & 7519)) & (-24770) & 32719;
        lIIIIlllII[174] = (-(181 ^ 164)) & (-22657) & 32765;
        lIIIIlllII[175] = (-28749) & 31598;
        lIIIIlllII[176] = (-2182) & 12287;
        lIIIIlllII[177] = ((13 + 78) - 5) + 45;
        lIIIIlllII[178] = ((72 + 78) - 66) + 48;
        lIIIIlllII[179] = ((22 + 51) - 50) + 110;
        lIIIIlllII[180] = (((197 ^ 143) + (61 ^ 24)) - (131 ^ 196)) + (56 ^ 102);
        lIIIIlllII[181] = (-((-291) & 30187)) & (-1) & 32730;
        lIIIIlllII[182] = (-((-12291) & 30727)) & (-4097) & 32630;
        lIIIIlllII[183] = ((62 + 41) - 23) + 55;
        lIIIIlllII[184] = (((4 ^ 114) + (175 ^ 142)) - (184 ^ 137)) + (2 ^ 32);
        lIIIIlllII[185] = (((120 ^ 20) + (24 ^ 111)) - (((124 + 98) - 189) + 108)) + (168 ^ 155);
        lIIIIlllII[186] = (((4 ^ 99) + (((97 + 72) - 49) + 15)) - (8 ^ 121)) + (0 ^ 13);
        lIIIIlllII[187] = (((36 ^ 26) + (((9 + 109) - 114) + 125)) - (((95 + 20) - 20) + 45)) + (255 ^ 167);
        lIIIIlllII[188] = ((81 + 72) - 39) + 26;
        lIIIIlllII[189] = ((3 + 0) - (-72)) + 66;
        lIIIIlllII[190] = ((65 + 96) - 79) + 60;
        lIIIIlllII[191] = ((74 + 93) - 161) + 137;
        lIIIIlllII[192] = (((194 ^ 155) + (123 ^ 35)) - (147 ^ 194)) + (56 ^ 8);
        lIIIIlllII[193] = (((((82 + 22) - 71) + 97) + (234 ^ 137)) - (105 ^ 28)) + (57 ^ 24);
        lIIIIlllII[194] = ((33 + 41) - 7) + 79;
        lIIIIlllII[195] = ((75 + 41) - 34) + 65;
        lIIIIlllII[196] = (((39 ^ 44) + (91 ^ 63)) - (-(44 ^ 40))) + (167 ^ 134);
        lIIIIlllII[197] = (((96 ^ 41) + (88 ^ 20)) - (113 ^ 90)) + (11 ^ 32);
        lIIIIlllII[198] = (((71 ^ 101) + (221 ^ 145)) - (34 ^ 125)) + ((108 + 96) - 84) + 15;
        lIIIIlllII[199] = ((69 + 7) - 29) + 104;
        lIIIIlllII[200] = (((199 ^ 160) + (178 ^ 169)) - (98 ^ 42)) + (120 ^ 38);
        lIIIIlllII[201] = (((29 ^ 5) + (19 ^ 46)) - (14 ^ 60)) + (123 ^ 13);
        lIIIIlllII[202] = (-((-6693) & 31535)) & (-4657) & 32767;
        lIIIIlllII[203] = (((16 ^ 96) + (153 ^ 139)) - (36 ^ 110)) + (74 ^ 40);
        lIIIIlllII[204] = ((137 + 84) - 205) + 139;
        lIIIIlllII[205] = ((46 + 31) - 40) + 119;
        lIIIIlllII[206] = ((98 + 153) - 229) + 135;
        lIIIIlllII[207] = ((125 + 87) - 202) + 148;
        lIIIIlllII[208] = ((35 + 47) - 27) + 104;
        lIIIIlllII[209] = (((((112 + 68) - 47) + 7) + (109 ^ 125)) - (211 ^ 169)) + (252 ^ 130);
        lIIIIlllII[210] = (((193 ^ 191) + (204 ^ 193)) - (0 ^ 82)) + (78 ^ 38);
        lIIIIlllII[211] = (-((-13489) & 30129)) & (-577) & 20477;
        lIIIIlllII[212] = (((210 ^ 192) + (26 ^ 1)) - (-(10 ^ 96))) + (92 ^ 87);
        lIIIIlllII[213] = ((81 + 113) - 60) + 29;
        lIIIIlllII[214] = (((184 ^ 152) + "   ".length()) - (-(24 ^ 65))) + (3 ^ 43);
        lIIIIlllII[215] = (-12365) & 15212;
        lIIIIlllII[216] = (-18597) & 28669;
        lIIIIlllII[217] = (-6145) & 16229;
        lIIIIlllII[218] = (-((-25449) & 26603)) & (-17) & 4031;
        lIIIIlllII[219] = (-4098) & 14189;
        lIIIIlllII[220] = (-((-4097) & 13523)) & (-4097) & 16382;
        lIIIIlllII[221] = (-((-3345) & 28126)) & (-1025) & 28671;
        lIIIIlllII[222] = (-1) & 2863;
        lIIIIlllII[223] = (-18561) & 28647;
        lIIIIlllII[224] = (-12434) & 15295;
        lIIIIlllII[225] = (((107 ^ 108) + " ".length()) - (-(45 ^ 122))) + (61 ^ 122);
        lIIIIlllII[226] = (((44 ^ 90) + (235 ^ 154)) - (94 ^ 36)) + (102 ^ 92);
        lIIIIlllII[227] = ((8 + 77) - (-7)) + 76;
        lIIIIlllII[228] = (-((-430) & 4527)) & (-2199) & 16383;
        lIIIIlllII[229] = (-28822) & 31679;
        lIIIIlllII[230] = (-20613) & 30686;
        lIIIIlllII[231] = (-((-20779) & 21995)) & (-4101) & 8175;
        lIIIIlllII[232] = (-(109 ^ 124)) & (-6274) & 16373;
        lIIIIlllII[233] = ((77 + 43) - 65) + 114;
        lIIIIlllII[234] = (((16 ^ 65) + (112 ^ 77)) - (227 ^ 179)) + (219 ^ 183);
        lIIIIlllII[235] = ((156 + 57) - 56) + 14;
        lIIIIlllII[236] = ((83 + 119) - 182) + 152;
        lIIIIlllII[237] = (((19 ^ 81) + (164 ^ 133)) - (-(47 ^ 49))) + (55 ^ 27);
        lIIIIlllII[238] = (-8326) & 16335;
        lIIIIlllII[239] = (-((-3659) & 32334)) & (-133) & 30207;
        lIIIIlllII[240] = (-8617) & 10216;
        lIIIIlllII[241] = (-((-11010) & 15107)) & (-16385) & 21501;
        lIIIIlllII[242] = (-21250) & 24549;
        lIIIIlllII[243] = (-((-4564) & 5599)) & (-16453) & 21887;
        lIIIIlllII[244] = (-516) & 5715;
        lIIIIlllII[245] = (-((-4397) & 31535)) & (-130) & 32767;
        lIIIIlllII[246] = (-1163) & 26362;
        lIIIIlllII[247] = (-5377) & 40876;
        lIIIIlllII[248] = (-((-69) & 21319)) & (-9281) & 32730;
        lIIIIlllII[249] = (-((-19022) & 32351)) & (-553) & 16381;
        lIIIIlllII[250] = (-((-24897) & 26053)) & (-19) & 16374;
        lIIIIlllII[251] = (-((-11533) & 12157)) & (-16642) & 32765;
        lIIIIlllII[252] = (-4403) & 16382;
        lIIIIlllII[253] = (-1109) & 26108;
        lIIIIlllII[254] = (-16907) & 19354;
        lIIIIlllII[255] = (-9289) & 15608;
        lIIIIlllII[256] = (-((-16593) & 17879)) & (-18) & 14303;
        lIIIIlllII[257] = (-((-4362) & 20813)) & (-1317) & 32767;
        lIIIIlllII[258] = (-((-161) & 6314)) & (-115) & 7167;
        lIIIIlllII[259] = (-((-314) & 29117)) & (-1) & 30703;
        lIIIIlllII[260] = ((68 + 75) - 62) + 93;
        lIIIIlllII[261] = (((((111 + 25) - (-12)) + 8) + (1 ^ 8)) - (40 ^ 62)) + (132 ^ 164);
        lIIIIlllII[262] = (-((-3097) & 27805)) & (-83) & 27647;
        lIIIIlllII[263] = (-17794) & 21947;
        lIIIIlllII[264] = (-16529) & 26610;
        lIIIIlllII[265] = (-198) & 3053;
        lIIIIlllII[266] = (-((-5158) & 23983)) & (-1) & 22975;
        lIIIIlllII[267] = (-6167) & 16255;
        lIIIIlllII[268] = (-((-16406) & 28639)) & (-16385) & 32765;
        lIIIIlllII[269] = ((153 + 45) - 22) + 0;
        lIIIIlllII[270] = (((33 ^ 89) + (70 ^ 67)) - (25 ^ 9)) + (15 ^ 75);
        lIIIIlllII[271] = (((156 ^ 151) + (((107 + 92) - 130) + 67)) - (38 ^ 13)) + (199 ^ 141);
        lIIIIlllII[272] = (-12565) & 16381;
        lIIIIlllII[273] = (-((-14339) & 15511)) & (-65) & 4087;
        lIIIIlllII[274] = (-((-841) & 23550)) & (-9) & 32767;
        lIIIIlllII[275] = (-((-27443) & 31543)) & (-260) & 8175;
        lIIIIlllII[276] = ((47 + 63) - (-68)) + 1;
        lIIIIlllII[277] = (((17 ^ 79) + (118 ^ 15)) - (217 ^ 170)) + (48 ^ 96);
        lIIIIlllII[278] = ((114 + 69) - 9) + 7;
        lIIIIlllII[279] = ((10 + 94) - 62) + 140;
        lIIIIlllII[280] = (((42 ^ 54) + (((106 + 37) - 123) + 108)) - (125 ^ 81)) + (42 ^ 109);
        lIIIIlllII[281] = ((158 + 148) - 208) + 86;
        lIIIIlllII[282] = ((129 + 122) - 136) + 70;
        lIIIIlllII[283] = ((70 + 31) - 3) + 88;
        lIIIIlllII[284] = ((80 + 180) - 111) + 38;
        lIIIIlllII[285] = ((163 + 7) - 117) + 135;
        lIIIIlllII[286] = ((88 + 148) - 225) + 178;
        lIIIIlllII[287] = (((41 ^ 54) + (218 ^ 138)) - (45 ^ 61)) + (225 ^ 190);
        lIIIIlllII[288] = (((11 ^ 89) + (221 ^ 163)) - (((1 + 19) - (-41)) + 72)) + (71 ^ 51);
        lIIIIlllII[289] = ((124 + 51) - 108) + 125;
        lIIIIlllII[290] = ((14 + 46) - 36) + 169;
        lIIIIlllII[291] = (((((100 + 49) - 35) + 27) + (69 ^ 57)) - (23 ^ 72)) + (71 ^ 95);
        lIIIIlllII[292] = (((((32 + 36) - (-16)) + 104) + (((147 + 39) - 60) + 41)) - ((-6737) & 7001)) + (76 ^ 37);
        lIIIIlllII[293] = ((59 + 116) - 90) + 111;
        lIIIIlllII[294] = (((89 ^ 70) + (14 ^ 103)) - (245 ^ 178)) + ((67 + 116) - 132) + 81;
        lIIIIlllII[295] = ((26 + 96) - 38) + 114;
        lIIIIlllII[296] = (((6 ^ 21) + (((32 + 7) - (-56)) + 73)) - (((13 + 89) - 70) + 105)) + ((61 + 141) - 185) + 132;
        lIIIIlllII[297] = ((160 + 38) - 176) + 178;
        lIIIIlllII[298] = ((112 + 134) - 158) + 113;
        lIIIIlllII[299] = (((((85 + 122) - 152) + 125) + (236 ^ 178)) - (((72 + 129) - 156) + 88)) + (61 ^ 0);
        lIIIIlllII[300] = (((108 ^ 83) + (((103 + 164) - 105) + 14)) - (((102 + 162) - 223) + 129)) + ((114 + 63) - 158) + 115;
        lIIIIlllII[301] = ((154 + 164) - 220) + 106;
        lIIIIlllII[302] = (-((-2561) & 32302)) & (-129) & 32767;
        lIIIIlllII[303] = (-12929) & 16355;
        lIIIIlllII[304] = (-19985) & 20319;
        lIIIIlllII[305] = (((207 ^ 145) + (((83 + 23) - 49) + 134)) - (((77 + 23) - (-72)) + 19)) + (233 ^ 134);
        lIIIIlllII[306] = (((206 ^ 160) + (199 ^ 156)) - (52 ^ 12)) + (104 ^ 85);
        lIIIIlllII[307] = ((48 + 157) - 107) + 109;
        lIIIIlllII[308] = ((0 + 196) - 36) + 48;
        lIIIIlllII[309] = (((192 ^ 172) + (51 ^ 75)) - (100 ^ 125)) + (198 ^ 192);
    }

    private static boolean lllIIllIIIIl(int i, int i2) {
        return i <= i2;
    }

    private static void lllIIlIIlIII() {
        lIIIIlIlII = new String[lIIIIlllII[309]];
        lIIIIlIlII[lIIIIlllII[1]] = lllIIIIllIIl("Mw2t4zvECDWdhQVfLVX3IYFRBItSEAOgzlQFpHZ/+1i1ChBGLNlWL03sh/GWSsqV", "ZJSGn");
        lIIIIlIlII[lIIIIlllII[0]] = lllIIIIllIlI("yKa4GTwYHQvFEF/spXYX7Q==", "EMqoL");
        lIIIIlIlII[lIIIIlllII[7]] = lllIIIIllIll("Yks9ETgjB0kwIz0EBwQ/IAcN", "OkicW");
        lIIIIlIlII[lIIIIlllII[9]] = lllIIIIllIll("XEw5DiYTAB4ZMQ==", "qlqkT");
        lIIIIlIlII[lIIIIlllII[10]] = lllIIIIllIll("", "TIQQj");
        lIIIIlIlII[lIIIIlllII[11]] = lllIIIIllIlI("lOk9f/SL+SLAj2oRWmkq8A==", "kAgbA");
        lIIIIlIlII[lIIIIlllII[13]] = lllIIIIllIlI("UmKQU1Zs9YTIMlSimOaJDYjXjFhNND+W", "pbjsZ");
        lIIIIlIlII[lIIIIlllII[20]] = lllIIIIllIlI("H99E0SDo/2p3dFCN9wNNTGSpQP3uGyAOvjBdfJ0JJ1gtdMfu1J3cUYzPiU3ynKyGM3OTsgaHpdc=", "gjIQh");
        lIIIIlIlII[lIIIIlllII[27]] = lllIIIIllIIl("8ZVUG6Nf7nyazXghbtnM6EpcbRTEorhEIe+G4ty9VZqS1zV3m9oKVm3lDJqdIKyRv7UvrE89A5c=", "ljRIe");
        lIIIIlIlII[lIIIIlllII[29]] = lllIIIIllIll("AgICCz0=", "FpkeV");
        lIIIIlIlII[lIIIIlllII[15]] = lllIIIIllIll("KSsYHSU=", "mYqsN");
        lIIIIlIlII[lIIIIlllII[31]] = lllIIIIllIlI("d/aQc2udbPM=", "Mcree");
        lIIIIlIlII[lIIIIlllII[33]] = lllIIIIllIll("NDgrGSU=", "gPJkN");
        lIIIIlIlII[lIIIIlllII[21]] = lllIIIIllIlI("nOtQDeRr8PY=", "QrejL");
        lIIIIlIlII[lIIIIlllII[38]] = lllIIIIllIll("FRs6LBE=", "QiSBz");
        lIIIIlIlII[lIIIIlllII[39]] = lllIIIIllIIl("kagTpbR/HkRlbQVAyaBcBg==", "UcKsg");
        lIIIIlIlII[lIIIIlllII[40]] = lllIIIIllIll("GQ8NCCA9", "JncnE");
        lIIIIlIlII[lIIIIlllII[41]] = lllIIIIllIlI("pCvvGHQ6NN6ElP3p2TUZ2n0POf5RDjmX", "IwPTt");
        lIIIIlIlII[lIIIIlllII[42]] = lllIIIIllIIl("i89C+I69nRU=", "FiMgw");
        lIIIIlIlII[lIIIIlllII[43]] = lllIIIIllIIl("Xfq9s75nM0s/xt74oR3+gA==", "OmZfa");
        lIIIIlIlII[lIIIIlllII[44]] = lllIIIIllIll("IwQRKTkU", "feuNX");
        lIIIIlIlII[lIIIIlllII[45]] = lllIIIIllIlI("iu15YYvi3e0=", "exlfo");
        lIIIIlIlII[lIIIIlllII[46]] = lllIIIIllIlI("wDoJjdTkA7I=", "DPVAQ");
        lIIIIlIlII[lIIIIlllII[47]] = lllIIIIllIll("CgIFKgw9", "OcaMm");
        lIIIIlIlII[lIIIIlllII[37]] = lllIIIIllIll("Kj0fPRABIlYqGBkg", "oEvIy");
        lIIIIlIlII[lIIIIlllII[48]] = lllIIIIllIll("EgkZC3MUEAYa", "QhonS");
        lIIIIlIlII[lIIIIlllII[49]] = lllIIIIllIlI("5UPvmVtl8dE=", "TOzIU");
        lIIIIlIlII[lIIIIlllII[50]] = lllIIIIllIlI("jZHyaQ7TEe0=", "ZlAne");
        lIIIIlIlII[lIIIIlllII[53]] = lllIIIIllIll("PBATegIdURYuFxsDFg==", "rqeZv");
        lIIIIlIlII[lIIIIlllII[54]] = lllIIIIllIll("KTofHixOMRkHJU4mAhEiHCY=", "nUvpK");
        lIIIIlIlII[lIIIIlllII[3]] = lllIIIIllIlI("ncDSaNCxudvyUknvIiK8pA==", "tRkHW");
        lIIIIlIlII[lIIIIlllII[8]] = lllIIIIllIlI("ATCX1vYK8d5BYoMpNtqA3g==", "IgiYK");
        lIIIIlIlII[lIIIIlllII[55]] = lllIIIIllIlI("caf5ptVPwF/7J3KxoreVPA==", "DdNRb");
        lIIIIlIlII[lIIIIlllII[56]] = lllIIIIllIIl("IMoMHG/uetwaF19kIYozLg==", "cYbqW");
        lIIIIlIlII[lIIIIlllII[57]] = lllIIIIllIll("CTADIRB6FxguHCgnDTwQ", "ZDlOu");
        lIIIIlIlII[lIIIIlllII[58]] = lllIIIIllIIl("VcyysrWM68KATr93aF2Pbg==", "YfvBS");
        lIIIIlIlII[lIIIIlllII[61]] = lllIIIIllIlI("6BZRsO23g7TuHsSkWL+pQA==", "gAurA");
        lIIIIlIlII[lIIIIlllII[62]] = lllIIIIllIIl("cOfwFlojofw=", "BFzDy");
        lIIIIlIlII[lIIIIlllII[63]] = lllIIIIllIlI("JHttt+s63s0=", "wDOPW");
        lIIIIlIlII[lIIIIlllII[64]] = lllIIIIllIll("KyMDPRI=", "gFbKw");
        lIIIIlIlII[lIIIIlllII[65]] = lllIIIIllIIl("dPv0LEQJBRQ=", "tjrxi");
        lIIIIlIlII[lIIIIlllII[68]] = lllIIIIllIIl("LcR6DvPZNKcSr5j+ChF03A==", "qgqPA");
        lIIIIlIlII[lIIIIlllII[71]] = lllIIIIllIlI("XBhX9gjB9ss=", "HFyfI");
        lIIIIlIlII[lIIIIlllII[72]] = lllIIIIllIll("Ay8XHgM0", "FNsyb");
        lIIIIlIlII[lIIIIlllII[74]] = lllIIIIllIlI("a3VM9ezamzE=", "fkEoz");
        lIIIIlIlII[lIIIIlllII[75]] = lllIIIIllIll("JQoeAG4FAFIEPBUW", "qoreN");
        lIIIIlIlII[lIIIIlllII[76]] = lllIIIIllIll("EAsiFiw=", "RyGwG");
        lIIIIlIlII[lIIIIlllII[77]] = lllIIIIllIIl("GJ7ONQ/sXzU=", "Qirsz");
        lIIIIlIlII[lIIIIlllII[78]] = lllIIIIllIIl("3QdbFU6OwdGlB1sG2mzBSw==", "CKWoI");
        lIIIIlIlII[lIIIIlllII[81]] = lllIIIIllIlI("O5QDkgAt16pwDEP1khrV6aM8dNqhDgi9", "Qoaeb");
        lIIIIlIlII[lIIIIlllII[6]] = lllIIIIllIlI("9bx+dqdzCQCpz0e/FK197Q==", "SgeUX");
        lIIIIlIlII[lIIIIlllII[82]] = lllIIIIllIIl("0A8yZBzLaW9aqWnNKDc0uw==", "dHmGg");
        lIIIIlIlII[lIIIIlllII[83]] = lllIIIIllIlI("sWCcAOD/IZK5eTHA8JbE7w==", "zmwaR");
        lIIIIlIlII[lIIIIlllII[84]] = lllIIIIllIll("ORw9J0oKHTxpEwEBeCgOClQxPVU=", "ntXIj");
        lIIIIlIlII[lIIIIlllII[85]] = lllIIIIllIll("HC01FTo4NWc3MDgp", "LLGgU");
        lIIIIlIlII[lIIIIlllII[86]] = lllIIIIllIlI("5Lt8EPxtAUp5f9TUxGUCkFMaVVU2sD7M", "hjWbb");
        lIIIIlIlII[lIIIIlllII[88]] = lllIIIIllIlI("wNoQXfSxkwFvoKOErro5aw==", "SrPUW");
        lIIIIlIlII[lIIIIlllII[89]] = lllIIIIllIIl("2NFdnuJpRt4n2gXU23w0fA==", "wGaUE");
        lIIIIlIlII[lIIIIlllII[90]] = lllIIIIllIll("Ci8nehgrbjMvHjAmIzUcIQ==", "DNQZl");
        lIIIIlIlII[lIIIIlllII[91]] = lllIIIIllIll("Gy40NQ==", "LKUGb");
        lIIIIlIlII[lIIIIlllII[92]] = lllIIIIllIll("CTwBPj8kOwMv", "KIsJW");
        lIIIIlIlII[lIIIIlllII[93]] = lllIIIIllIll("FREBICAi", "PpeGA");
        lIIIIlIlII[lIIIIlllII[94]] = lllIIIIllIIl("lcZFSZ8RIgA=", "feHoy");
        lIIIIlIlII[lIIIIlllII[95]] = lllIIIIllIIl("1Dq5TxiBqeU=", "TxFjp");
        lIIIIlIlII[lIIIIlllII[96]] = lllIIIIllIIl("1GvvYV+Tvqs=", "Qyitv");
        lIIIIlIlII[lIIIIlllII[97]] = lllIIIIllIll("JjULJiQNKkIxLBUo", "cMbRM");
        lIIIIlIlII[lIIIIlllII[98]] = lllIIIIllIlI("qe01rp30WJujMKUWrvX03Q==", "jIiFw");
        lIIIIlIlII[lIIIIlllII[99]] = lllIIIIllIll("HQsMPw==", "XseKQ");
        lIIIIlIlII[lIIIIlllII[100]] = lllIIIIllIlI("4K6foE5aVro=", "znWNI");
        lIIIIlIlII[lIIIIlllII[102]] = lllIIIIllIll("GQocVjM4SxkCJj4ZGQ==", "WkjvG");
        lIIIIlIlII[lIIIIlllII[103]] = lllIIIIllIlI("f6FLAYO+L/vsDg6G34rLxUiGUP+Kb1+2", "ucAdo");
        lIIIIlIlII[lIIIIlllII[104]] = lllIIIIllIIl("B27J+Ovtx3V/Q8qqTi7A9g==", "EDvpD");
        lIIIIlIlII[lIIIIlllII[105]] = lllIIIIllIlI("Ipmuyto+E0gsivXA12AjyQ==", "GxQxe");
        lIIIIlIlII[lIIIIlllII[106]] = lllIIIIllIIl("Jsz1ayTwOf4mznR1rqnu0g==", "rhklP");
        lIIIIlIlII[lIIIIlllII[107]] = lllIIIIllIll("OS0LGhdXJQ0AGw==", "zAbwu");
        lIIIIlIlII[lIIIIlllII[108]] = lllIIIIllIll("PjgDNSk=", "mPbGB");
        lIIIIlIlII[lIIIIlllII[109]] = lllIIIIllIIl("EBbi3ox8p7s=", "EmXjo");
        lIIIIlIlII[lIIIIlllII[110]] = lllIIIIllIlI("g4q61smbNBg=", "ICcCs");
        lIIIIlIlII[lIIIIlllII[113]] = lllIIIIllIIl("Rkl8vTh9zbLyd0G0Wwwwgg==", "zataU");
        lIIIIlIlII[lIIIIlllII[114]] = lllIIIIllIll("KAUnMzsWF3M3MwoCPDNyFx5zNTMbGw==", "xpSGR");
        lIIIIlIlII[lIIIIlllII[115]] = lllIIIIllIIl("uULn7qkzeNM=", "piImb");
        lIIIIlIlII[lIIIIlllII[119]] = lllIIIIllIlI("Xyt+h9/FI+4+RuLDWwot8Q==", "OfjAH");
        lIIIIlIlII[lIIIIlllII[120]] = lllIIIIllIlI("zixf2I5p7Gg=", "DipyH");
        lIIIIlIlII[lIIIIlllII[121]] = lllIIIIllIlI("dSwkigauDutNqNbNuhrZEhonLcei7VSR3fSnYnJakAg=", "RdoRT");
        lIIIIlIlII[lIIIIlllII[122]] = lllIIIIllIIl("rccXytyYAiA=", "rsruw");
        lIIIIlIlII[lIIIIlllII[123]] = lllIIIIllIIl("+NBOYEAyZCo/xXZgJPT3jX8fiDhfdWk9", "ONdqS");
        lIIIIlIlII[lIIIIlllII[124]] = lllIIIIllIll("HhcKNw==", "IrkEc");
        lIIIIlIlII[lIIIIlllII[125]] = lllIIIIllIlI("xG9rtVKhQ/nGCbpc7mjNOA==", "vtTfx");
        lIIIIlIlII[lIIIIlllII[126]] = lllIIIIllIIl("BolaTvJ3Nkc=", "lUxOb");
        lIIIIlIlII[lIIIIlllII[127]] = lllIIIIllIlI("M68xE8U8nu0=", "adQyU");
        lIIIIlIlII[lIIIIlllII[128]] = lllIIIIllIIl("fN+mGUr6v/A=", "uaXQw");
        lIIIIlIlII[lIIIIlllII[129]] = lllIIIIllIlI("HqlH7igU6IGj1qqU8Y5Yvw==", "Drvty");
        lIIIIlIlII[lIIIIlllII[130]] = lllIIIIllIll("HRgoESQq", "XyLvE");
        lIIIIlIlII[lIIIIlllII[131]] = lllIIIIllIlI("nf5ioeu8Qux+qB/WbliuPQ==", "EYkCN");
        lIIIIlIlII[lIIIIlllII[132]] = lllIIIIllIIl("CV+J7oKHPjiGIV+pgouvJg==", "hTYEp");
        lIIIIlIlII[lIIIIlllII[133]] = lllIIIIllIll("CC4kOg==", "MVMNj");
        lIIIIlIlII[lIIIIlllII[136]] = lllIIIIllIlI("cI2NRrwmJNZOMw8uxpHlTg==", "Weaos");
        lIIIIlIlII[lIIIIlllII[137]] = lllIIIIllIlI("x/9GI7QxQCb+hQPUMXiOLA==", "vLbbn");
        lIIIIlIlII[lIIIIlllII[138]] = lllIIIIllIlI("xpu1Kk8Wy6w=", "Nieru");
        lIIIIlIlII[lIIIIlllII[30]] = lllIIIIllIll("OS4FKg==", "iGfAj");
        lIIIIlIlII[lIIIIlllII[139]] = lllIIIIllIIl("OFd22Xe+tgBvhl2tyquOnw==", "cJDVm");
        lIIIIlIlII[lIIIIlllII[142]] = lllIIIIllIll("ITYFai4AdzUHehs+Hy8=", "oWsJZ");
        lIIIIlIlII[lIIIIlllII[143]] = lllIIIIllIlI("2I6fO6lFOoqzuGnNV4/S4g==", "kvyME");
        lIIIIlIlII[lIIIIlllII[144]] = lllIIIIllIlI("QNV0lVakM9suOyz9IGVc9A==", "JdJuo");
        lIIIIlIlII[lIIIIlllII[145]] = lllIIIIllIll("PS4gIw==", "qAGPC");
        lIIIIlIlII[lIIIIlllII[146]] = lllIIIIllIIl("VNV20JBrB0kGRby+SdeXmA==", "XGTxU");
        lIIIIlIlII[lIIIIlllII[147]] = lllIIIIllIll("Hz0kBzZrOyMCKT8jLg==", "KOKkZ");
        lIIIIlIlII[lIIIIlllII[148]] = lllIIIIllIll("LTseDw==", "kRljG");
        lIIIIlIlII[lIIIIlllII[149]] = lllIIIIllIlI("LYLXgpp05PfkOz84HL4sSSwAznhejCU3", "aJKJw");
        lIIIIlIlII[lIIIIlllII[150]] = lllIIIIllIlI("ZPoqcRfcPkM033kl1zpu8g==", "cdHvz");
        lIIIIlIlII[lIIIIlllII[152]] = lllIIIIllIlI("eaALZlL9ycI=", "jbrUw");
        lIIIIlIlII[lIIIIlllII[153]] = lllIIIIllIll("HRYjEiUq", "XwGuD");
        lIIIIlIlII[lIIIIlllII[154]] = lllIIIIllIll("HQMSCBMq", "Xbvor");
        lIIIIlIlII[lIIIIlllII[155]] = lllIIIIllIIl("eUIDQEihShY=", "lDbYG");
        lIIIIlIlII[lIIIIlllII[156]] = lllIIIIllIIl("w+bWobRMTum/kkOxFIK4xw==", "qRBqb");
        lIIIIlIlII[lIIIIlllII[157]] = lllIIIIllIIl("syODgWG8CLFRPzvfRudUCA==", "sVPsQ");
        lIIIIlIlII[lIIIIlllII[158]] = lllIIIIllIll("NT4ZOA==", "pFpLN");
        lIIIIlIlII[lIIIIlllII[159]] = lllIIIIllIll("IjsoLRsV", "gZLJz");
        lIIIIlIlII[lIIIIlllII[160]] = lllIIIIllIIl("i+UmmXuRe8jkVceDV/z9pA==", "hGHvA");
        lIIIIlIlII[lIIIIlllII[161]] = lllIIIIllIll("FhonHQpxESEEA3EGOhIEIwY=", "QuNsm");
        lIIIIlIlII[lIIIIlllII[162]] = lllIIIIllIIl("VGyB0YLcFadeWnkF+dc9wA==", "jRKyI");
        lIIIIlIlII[lIIIIlllII[163]] = lllIIIIllIlI("4zmC4nfvkpfCJuTShsqK0g==", "UkoqV");
        lIIIIlIlII[lIIIIlllII[164]] = lllIIIIllIlI("TuYNy2tCSbxR8btuOvcCBA==", "MIfEG");
        lIIIIlIlII[lIIIIlllII[165]] = lllIIIIllIIl("UV+yzuiQqUvxn8VyC0S43g==", "xhbdS");
        lIIIIlIlII[lIIIIlllII[166]] = lllIIIIllIIl("vyxn8olY9uU=", "vvKcF");
        lIIIIlIlII[lIIIIlllII[167]] = lllIIIIllIlI("g57wBGaB7Ic=", "btZcM");
        lIIIIlIlII[lIIIIlllII[168]] = lllIIIIllIlI("NXHndYW/TY0=", "tQJGi");
        lIIIIlIlII[lIIIIlllII[169]] = lllIIIIllIll("HAQ1aDU9RTEpIjk=", "ReCHA");
        lIIIIlIlII[lIIIIlllII[170]] = lllIIIIllIll("NSsNBRAcKVkBGAA8FgU=", "rNyqy");
        lIIIIlIlII[lIIIIlllII[171]] = lllIIIIllIIl("5Jq6xgYXGps=", "YFwmW");
        lIIIIlIlII[lIIIIlllII[172]] = lllIIIIllIll("NT8uHSsO", "fZOoH");
        lIIIIlIlII[lIIIIlllII[177]] = lllIIIIllIlI("OyVb4NKQH+jrVLGIik79pg==", "XaodG");
        lIIIIlIlII[lIIIIlllII[178]] = lllIIIIllIIl("EfgX1eHnBsdn+h/QyN+iKg==", "tGSRB");
        lIIIIlIlII[lIIIIlllII[179]] = lllIIIIllIll("HiQgJyBtAzsoLD8zLjog", "MPOIE");
        lIIIIlIlII[lIIIIlllII[180]] = lllIIIIllIll("NQsOGilbEhc=", "vggwK");
        lIIIIlIlII[lIIIIlllII[183]] = lllIIIIllIll("HgAaYiY/QR82MzkT", "PalBR");
        lIIIIlIlII[lIIIIlllII[184]] = lllIIIIllIIl("1Sk6hUlNJcexzVa2knXCVA==", "Qdbhs");
        lIIIIlIlII[lIIIIlllII[185]] = lllIIIIllIll("EAIZIjo7HVAlJycVHjE7OhYU", "UzpVS");
        lIIIIlIlII[lIIIIlllII[186]] = lllIIIIllIlI("FUjYw4aq+1U=", "JAUwb");
        lIIIIlIlII[lIIIIlllII[187]] = lllIIIIllIlI("VqZjXvKpHK0=", "eGUYM");
        lIIIIlIlII[lIIIIlllII[188]] = lllIIIIllIIl("FkEqqVAII/8=", "yrUxW");
        lIIIIlIlII[lIIIIlllII[189]] = lllIIIIllIll("AA83SQMhTgQIEykPMw==", "NnAiw");
        lIIIIlIlII[lIIIIlllII[190]] = lllIIIIllIIl("Hwe6ejCfYr8=", "objLG");
        lIIIIlIlII[lIIIIlllII[191]] = lllIIIIllIIl("8kvMYWCwK9o=", "svWSy");
        lIIIIlIlII[lIIIIlllII[192]] = lllIIIIllIll("CjQhDA89", "OUEkn");
        lIIIIlIlII[lIIIIlllII[193]] = lllIIIIllIlI("w/XyZBg8jqghX7QtMqUN4Q==", "cQilp");
        lIIIIlIlII[lIIIIlllII[194]] = lllIIIIllIll("LiMZCVUoOgYY", "mBolu");
        lIIIIlIlII[lIIIIlllII[195]] = lllIIIIllIlI("MgXZ9qvbnzs=", "KsFNb");
        lIIIIlIlII[lIIIIlllII[196]] = lllIIIIllIll("KwIcBSQc", "ncxbE");
        lIIIIlIlII[lIIIIlllII[197]] = lllIIIIllIlI("ANnXMP7Mwx8zYTojoaVQrQ==", "dozoa");
        lIIIIlIlII[lIIIIlllII[198]] = lllIIIIllIll("Nj0DAx5RNgUaF1EhHgwQAyE=", "qRjmy");
        lIIIIlIlII[lIIIIlllII[199]] = lllIIIIllIIl("P5RnEgduznhjL6i8z9B6DQ==", "KExTV");
        lIIIIlIlII[lIIIIlllII[200]] = lllIIIIllIll("EAQ8ChN+DDoQHw==", "ShUgq");
        lIIIIlIlII[lIIIIlllII[201]] = lllIIIIllIlI("p0cBGQB3B1WvxN7tkRejLw==", "TEAfo");
        lIIIIlIlII[lIIIIlllII[203]] = lllIIIIllIIl("eRrAdYpWVRTRr48UvowABg==", "ligiG");
        lIIIIlIlII[lIIIIlllII[204]] = lllIIIIllIlI("Yvx2JeE21hjVFk5Yjy4WhHzsuAI176qPxfz+mlE6VM1mgH6x3Jk31Q==", "awYmP");
        lIIIIlIlII[lIIIIlllII[205]] = lllIIIIllIIl("vZ0v1lnDidLad4iyslPBMw==", "ocscq");
        lIIIIlIlII[lIIIIlllII[206]] = lllIIIIllIIl("6UvFFfg260I=", "dfBYq");
        lIIIIlIlII[lIIIIlllII[207]] = lllIIIIllIlI("9L+B4b+6d8c=", "oXHpb");
        lIIIIlIlII[lIIIIlllII[208]] = lllIIIIllIll("Oh81KygB", "izTYK");
        lIIIIlIlII[lIIIIlllII[209]] = lllIIIIllIlI("6KoWwiUEdXPWPw74NDadIA==", "LVNwb");
        lIIIIlIlII[lIIIIlllII[210]] = lllIIIIllIll("IiYBHQhMLgcHBA==", "aJhpj");
        lIIIIlIlII[lIIIIlllII[212]] = lllIIIIllIIl("6wyf5hhFZHnJwMQgTsnAHQ==", "XICky");
        lIIIIlIlII[lIIIIlllII[213]] = lllIIIIllIlI("9ngr6kid7LY=", "nPXVu");
        lIIIIlIlII[lIIIIlllII[214]] = lllIIIIllIIl("8w4bG5GYf6A=", "hHDyk");
        lIIIIlIlII[lIIIIlllII[2]] = lllIIIIllIlI("o4hbkuNpxlNxgKq9A1z6CQ==", "pDVaf");
        lIIIIlIlII[lIIIIlllII[225]] = lllIIIIllIIl("2wlYVQwEkHw=", "UgPhg");
        lIIIIlIlII[lIIIIlllII[226]] = lllIIIIllIIl("AlP1FfdN+XQ=", "LawxB");
        lIIIIlIlII[lIIIIlllII[227]] = lllIIIIllIll("IiEAGA==", "mQevp");
        lIIIIlIlII[lIIIIlllII[233]] = lllIIIIllIlI("Xinf3QfoKkgsVlhf0RucdnfzIXyYXncq", "LCzcb");
        lIIIIlIlII[lIIIIlllII[234]] = lllIIIIllIlI("z+s//kxGc4SjvDrDfdoOUA==", "VxaXa");
        lIIIIlIlII[lIIIIlllII[235]] = lllIIIIllIll("AT0IHRs6", "RXiox");
        lIIIIlIlII[lIIIIlllII[236]] = lllIIIIllIlI("IDYLQ58woaSsgp2EuxC6+Q==", "BiOHm");
        lIIIIlIlII[lIIIIlllII[237]] = lllIIIIllIlI("EhWVNEGAbkmV07ubiH/WtnGW944J6X+s", "xvean");
        lIIIIlIlII[lIIIIlllII[260]] = lllIIIIllIlI("NhHN8DGJy2rUJD8qT8/Iq79CtNdspEYL", "COoXr");
        lIIIIlIlII[lIIIIlllII[261]] = lllIIIIllIlI("jPa4W4aKbxd16ri/21EYbQ==", "eLLKS");
        lIIIIlIlII[lIIIIlllII[269]] = lllIIIIllIll("ITs4JQ==", "eTWWR");
        lIIIIlIlII[lIIIIlllII[270]] = lllIIIIllIlI("M3uzmhkmuFvRJjAjXNKifA==", "NWuwl");
        lIIIIlIlII[lIIIIlllII[271]] = lllIIIIllIlI("CmzVgqZUwy+vXjW0VR3Tig==", "XYbYV");
        lIIIIlIlII[lIIIIlllII[276]] = lllIIIIllIIl("jScNopOpWkjuPku/hTpcpg==", "wgfdr");
        lIIIIlIlII[lIIIIlllII[277]] = lllIIIIllIIl("YBaaOUCMj9atxTqkawRylQ==", "hKZnd");
        lIIIIlIlII[lIIIIlllII[278]] = lllIIIIllIIl("GG+B4UcOJS8=", "SNKeY");
        lIIIIlIlII[lIIIIlllII[279]] = lllIIIIllIIl("+5I/msyPJRM=", "liJAu");
        lIIIIlIlII[lIIIIlllII[280]] = lllIIIIllIlI("eyickPVy0BpWDcKCuOx8lA==", "OJLus");
        lIIIIlIlII[lIIIIlllII[281]] = lllIIIIllIlI("LZsCq+eYyv2kVWI4EsFIDg==", "fpEjE");
        lIIIIlIlII[lIIIIlllII[282]] = lllIIIIllIll("BRA2Lw==", "CyDJY");
        lIIIIlIlII[lIIIIlllII[283]] = lllIIIIllIll("IiEqLg==", "dHXKQ");
        lIIIIlIlII[lIIIIlllII[284]] = lllIIIIllIlI("mS17JaNwleI=", "sHxZp");
        lIIIIlIlII[lIIIIlllII[285]] = lllIIIIllIll("IwoFADU=", "dkheF");
        lIIIIlIlII[lIIIIlllII[286]] = lllIIIIllIIl("tJlafRhDXc4=", "VXtLf");
        lIIIIlIlII[lIIIIlllII[287]] = lllIIIIllIlI("jleCtBd03z0=", "HfwvF");
        lIIIIlIlII[lIIIIlllII[288]] = lllIIIIllIll("HjkoHQk8", "NKIdl");
        lIIIIlIlII[lIIIIlllII[289]] = lllIIIIllIll("PAQSHTMe", "lvsdV");
        lIIIIlIlII[lIIIIlllII[290]] = lllIIIIllIlI("lyPgf9xe5ng+EFneEtMwhw==", "klvkW");
        lIIIIlIlII[lIIIIlllII[291]] = lllIIIIllIll("IA8RHC9OBxcGIw==", "ccxqM");
        lIIIIlIlII[lIIIIlllII[292]] = lllIIIIllIIl("VI/XCMeH0Gg=", "qKngC");
        lIIIIlIlII[lIIIIlllII[293]] = lllIIIIllIIl("0RFeReSUG+Y=", "DWtcD");
        lIIIIlIlII[lIIIIlllII[294]] = lllIIIIllIIl("x7YV5Lw8Eqg=", "Ocswy");
        lIIIIlIlII[lIIIIlllII[295]] = lllIIIIllIIl("SqE4/YcU/BA=", "KxdIo");
        lIIIIlIlII[lIIIIlllII[296]] = lllIIIIllIll("FxsEJB8=", "PziAl");
        lIIIIlIlII[lIIIIlllII[297]] = lllIIIIllIIl("joriuxJF3K4=", "SoLWV");
        lIIIIlIlII[lIIIIlllII[298]] = lllIIIIllIlI("/j9rUPyNnY8=", "FjXpd");
        lIIIIlIlII[lIIIIlllII[299]] = lllIIIIllIIl("GZ4gTh4fkMg=", "ZCbYU");
        lIIIIlIlII[lIIIIlllII[300]] = lllIIIIllIlI("gqTCYo1SQtM=", "FxWAp");
        lIIIIlIlII[lIIIIlllII[301]] = lllIIIIllIIl("1APrsQPmZUk=", "MMonv");
        lIIIIlIlII[lIIIIlllII[305]] = lllIIIIllIll("Kgcaaw==", "sbiER");
        lIIIIlIlII[lIIIIlllII[306]] = lllIIIIllIIl("6dwxJjR8/VmrYK6upqXTYPgkg5eWJL5uK8qOUZhQ9Cq8ogtcYKMOlhZBCisOgIlAgGP60ALUpU9KaeEGRkrn4g==", "XzAMm");
        lIIIIlIlII[lIIIIlllII[307]] = lllIIIIllIIl("jzeuPr9e/Xq/gMF9kp/mM9MPfB6dosO0AGYqTYIVdkQ=", "FtTqv");
        lIIIIlIlII[lIIIIlllII[308]] = lllIIIIllIIl("4OhJuqW0hxo=", "cozxa");
    }

    private static boolean lllIIlIlllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIIllIIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIlllII[1];
    }

    static {
        lllIIlIIlIIl();
        lllIIlIIlIII();
        bx = new ArrayList();
        dg = new WorldPoint(lIIIIlllII[302], lIIIIlllII[303], lIIIIlllII[0]);
        dL = lIIIIlllII[304];
        dS = lIIIIlllII[1];
        String[] strArr = new String[lIIIIlllII[9]];
        strArr[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[305]];
        strArr[lIIIIlllII[0]] = lIIIIlIlII[lIIIIlllII[306]];
        strArr[lIIIIlllII[7]] = lIIIIlIlII[lIIIIlllII[307]];
        cG = strArr;
        dc = lIIIIlIlII[lIIIIlllII[308]];
        h = "Eadgars Ruse " + dc;
    }

    private static boolean lllIIlIIlIll(int i) {
        return i != 0;
    }

    public static void bl() {
        WorldArea worldArea = new WorldArea(lIIIIlllII[215], lIIIIlllII[216], lIIIIlllII[42], lIIIIlllII[38], lIIIIlllII[1]);
        WorldArea worldArea2 = new WorldArea(lIIIIlllII[215], lIIIIlllII[217], lIIIIlllII[38], lIIIIlllII[31], lIIIIlllII[1]);
        WorldPoint worldPoint = new WorldPoint(lIIIIlllII[218], lIIIIlllII[219], lIIIIlllII[1]);
        if (lllIIlIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIlIllIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            new WorldPoint(lIIIIlllII[220], lIIIIlllII[219], lIIIIlllII[1]);
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[2]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIIlllII[0]);
            "".length();
            WorldArea worldArea3 = new WorldArea(lIIIIlllII[221], lIIIIlllII[217], lIIIIlllII[20], lIIIIlllII[29], lIIIIlllII[1]);
            WorldArea worldArea4 = new WorldArea(lIIIIlllII[222], lIIIIlllII[223], lIIIIlllII[11], lIIIIlllII[20], lIIIIlllII[1]);
            if (!lllIIlIllIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlIIlIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(lIIIIlllII[224], lIIIIlllII[219], lIIIIlllII[1]);
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[269]]) ? 1 : 0) && lllIIllIIIIl(tileObject.getWorldLocation().distanceTo(worldPoint2), lIIIIlllII[9])) {
                        ?? r0 = lIIIIlllII[0];
                        "".length();
                        return (-"   ".length()) > 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                    return lIIIIlllII[1];
                });
                if (lllIIlIlllIl(nearest)) {
                    String[] strArr = new String[lIIIIlllII[0]];
                    strArr[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[225]];
                    if (lllIIlIIlIll(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(lIIIIlIlII[lIIIIlllII[226]]);
                        Time.sleepTicks(lIIIIlllII[9]);
                        "".length();
                    }
                    String[] strArr2 = new String[lIIIIlllII[0]];
                    strArr2[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[227]];
                    if (lllIIlIllIll(nearest.hasAction(strArr2) ? 1 : 0) && lllIIlIllIll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                        C0004e.c(worldPoint);
                        Time.sleepTicks(lIIIIlllII[7]);
                        "".length();
                    }
                }
            }
        }
        if (lllIIlIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIlIllIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lllIIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
            return;
        }
        WorldArea worldArea5 = new WorldArea(lIIIIlllII[215], lIIIIlllII[228], lIIIIlllII[27], lIIIIlllII[13], lIIIIlllII[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIIIIlllII[229], lIIIIlllII[230], lIIIIlllII[1]);
        NPC nearest2 = NPCs.getNearest(npc -> {
            if (lllIIllIIIlI(npc.getId(), lIIIIlllII[268]) && lllIIlIIlIll(worldArea5.contains(npc.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIIIlllII[0];
                "".length();
                return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIlllII[1];
        });
        NPC nearest3 = NPCs.getNearest(npc2 -> {
            if (!lllIIllIIIlI(npc2.getId(), lIIIIlllII[266]) || (lllIIlIllIll(npc2.getWorldLocation().equals(new WorldPoint(lIIIIlllII[231], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0) && lllIIlIllIll(npc2.getWorldLocation().equals(new WorldPoint(lIIIIlllII[262], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0) && !lllIIlIIlIll(npc2.getWorldLocation().equals(new WorldPoint(lIIIIlllII[229], lIIIIlllII[267], lIIIIlllII[1])) ? 1 : 0))) {
                return lIIIIlllII[1];
            }
            ?? r0 = lIIIIlllII[0];
            "".length();
            return "  ".length() >= (52 ^ 48) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        NPC nearest4 = NPCs.getNearest(npc3 -> {
            if (!lllIIllIIIlI(npc3.getId(), lIIIIlllII[263]) || (lllIIlIllIll(npc3.getWorldLocation().equals(new WorldPoint(lIIIIlllII[262], lIIIIlllII[264], lIIIIlllII[1])) ? 1 : 0) && !lllIIlIIlIll(npc3.getWorldLocation().equals(new WorldPoint(lIIIIlllII[265], lIIIIlllII[264], lIIIIlllII[1])) ? 1 : 0))) {
                return lIIIIlllII[1];
            }
            ?? r0 = lIIIIlllII[0];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        WorldPoint worldPoint4 = new WorldPoint(lIIIIlllII[231], lIIIIlllII[232], lIIIIlllII[1]);
        if (lllIIlIlllIl(nearest2) && lllIIlIlllIl(nearest3) && lllIIllIIIII(Players.getLocal().getWorldLocation().getY(), lIIIIlllII[217]) && lllIIlIlllII(Movement.getRunEnergy(), lIIIIlllII[44])) {
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[233]];
            C0004e.c(worldPoint4);
            Time.sleepTicks(lIIIIlllII[7]);
            "".length();
        }
        if (lllIIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lllIIlIlllIl(nearest4)) {
            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[234]];
            C0004e.c(worldPoint3);
            Time.sleepTicks(lIIIIlllII[7]);
            "".length();
        }
        if (lllIIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
            TileObject nearest5 = TileObjects.getNearest(tileObject2 -> {
                if (lllIIlIIlIll(tileObject2.getName().contains(lIIIIlIlII[lIIIIlllII[261]]) ? 1 : 0) && lllIIlIIlIll(tileObject2.getWorldLocation().equals(new WorldPoint(lIIIIlllII[262], lIIIIlllII[230], lIIIIlllII[1])) ? 1 : 0)) {
                    ?? r0 = lIIIIlllII[0];
                    "".length();
                    return (-"  ".length()) >= 0 ? ((58 ^ 74) ^ (195 ^ 181)) & (((177 ^ 151) ^ (87 ^ 119)) ^ (-" ".length())) : r0;
                }
                return lIIIIlllII[1];
            });
            if (lllIIlIlllIl(nearest5)) {
                nearest5.interact(lIIIIlIlII[lIIIIlllII[235]]);
                Time.sleepTicks(lIIIIlllII[7]);
                "".length();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f5, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[15]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x017f, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[15]) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0213, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[11]) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04d8, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[7]) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x05ef, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[15]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0683, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[10]) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[15]) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0709, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[44]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0793, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[39]) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16;
        int[] iArr17;
        int[] iArr18 = new int[lIIIIlllII[0]];
        iArr18[lIIIIlllII[1]] = lIIIIlllII[238];
        if (lllIIlIIlIll(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIIIIlllII[0]];
            iArr19[lIIIIlllII[1]] = lIIIIlllII[238];
            if (lllIIlIIlIll(Bank.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIIIlllII[0]];
                iArr20[lIIIIlllII[1]] = lIIIIlllII[238];
            }
            iArr = new int[lIIIIlllII[0]];
            iArr[lIIIIlllII[1]] = lIIIIlllII[19];
            if (lllIIlIIlIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIIlllII[0]];
                iArr21[lIIIIlllII[1]] = lIIIIlllII[19];
                if (lllIIlIIlIll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlllII[0]];
                    iArr22[lIIIIlllII[1]] = lIIIIlllII[19];
                }
                iArr2 = new int[lIIIIlllII[0]];
                iArr2[lIIIIlllII[1]] = lIIIIlllII[14];
                if (lllIIlIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr23 = new int[lIIIIlllII[0]];
                    iArr23[lIIIIlllII[1]] = lIIIIlllII[14];
                    if (lllIIlIIlIll(Bank.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[lIIIIlllII[0]];
                        iArr24[lIIIIlllII[1]] = lIIIIlllII[14];
                    }
                    iArr3 = new int[lIIIIlllII[0]];
                    iArr3[lIIIIlllII[1]] = lIIIIlllII[16];
                    if (lllIIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr25 = new int[lIIIIlllII[0]];
                        iArr25[lIIIIlllII[1]] = lIIIIlllII[16];
                        if (lllIIlIIlIll(Bank.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[lIIIIlllII[0]];
                            iArr26[lIIIIlllII[1]] = lIIIIlllII[16];
                        }
                        iArr4 = new int[lIIIIlllII[0]];
                        iArr4[lIIIIlllII[1]] = lIIIIlllII[28];
                        if (lllIIlIllIll(Bank.contains(iArr4) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlllII[28], lIIIIlllII[0], C0004e.c(lIIIIlllII[244], lIIIIlllII[245])));
                            "".length();
                        }
                        iArr5 = new int[lIIIIlllII[0]];
                        iArr5[lIIIIlllII[1]] = lIIIIlllII[32];
                        if (lllIIlIllIll(Bank.contains(iArr5) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlllII[32], lIIIIlllII[0], C0004e.c(lIIIIlllII[244], lIIIIlllII[245])));
                            "".length();
                        }
                        iArr6 = new int[lIIIIlllII[0]];
                        iArr6[lIIIIlllII[1]] = lIIIIlllII[30];
                        if (lllIIlIllIll(Bank.contains(iArr6) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlllII[30], lIIIIlllII[0], C0004e.c(lIIIIlllII[246], lIIIIlllII[247])));
                            "".length();
                        }
                        iArr7 = new int[lIIIIlllII[0]];
                        iArr7[lIIIIlllII[1]] = lIIIIlllII[24];
                        if (lllIIlIllIll(Bank.contains(iArr7) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlllII[24], lIIIIlllII[0], C0004e.c(lIIIIlllII[244], lIIIIlllII[245])));
                            "".length();
                        }
                        iArr8 = new int[lIIIIlllII[0]];
                        iArr8[lIIIIlllII[1]] = lIIIIlllII[34];
                        if (lllIIlIllIll(Bank.contains(iArr8) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlllII[34], lIIIIlllII[11], C0004e.c(lIIIIlllII[248], lIIIIlllII[249])));
                            "".length();
                        }
                        iArr9 = new int[lIIIIlllII[0]];
                        iArr9[lIIIIlllII[1]] = lIIIIlllII[25];
                        if (lllIIlIllIll(Bank.contains(iArr9) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlllII[25], lIIIIlllII[0], C0004e.c(lIIIIlllII[250], lIIIIlllII[251])));
                            "".length();
                        }
                        iArr10 = new int[lIIIIlllII[0]];
                        iArr10[lIIIIlllII[1]] = lIIIIlllII[26];
                        if (lllIIlIllIll(Bank.contains(iArr10) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlllII[26], lIIIIlllII[0], C0004e.c(lIIIIlllII[250], lIIIIlllII[251])));
                            "".length();
                        }
                        iArr11 = new int[lIIIIlllII[0]];
                        iArr11[lIIIIlllII[1]] = lIIIIlllII[18];
                        if (lllIIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr27 = new int[lIIIIlllII[0]];
                            iArr27[lIIIIlllII[1]] = lIIIIlllII[18];
                            if (lllIIlIIlIll(Bank.contains(iArr27) ? 1 : 0)) {
                                int[] iArr28 = new int[lIIIIlllII[0]];
                                iArr28[lIIIIlllII[1]] = lIIIIlllII[18];
                            }
                            if (lllIIlIllIll(Bank.contains(item -> {
                                return item.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]);
                            }) ? 1 : 0)) {
                                bx.add(new C0003d(lIIIIlllII[252], lIIIIlllII[11], lIIIIlllII[253]));
                                "".length();
                            }
                            iArr12 = new int[lIIIIlllII[0]];
                            iArr12[lIIIIlllII[1]] = lIIIIlllII[254];
                            if (lllIIlIllIll(Bank.contains(iArr12) ? 1 : 0)) {
                                bx.add(new C0003d(lIIIIlllII[254], lIIIIlllII[0], lIIIIlllII[255]));
                                "".length();
                            }
                            iArr13 = new int[lIIIIlllII[0]];
                            iArr13[lIIIIlllII[1]] = lIIIIlllII[17];
                            if (lllIIlIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr29 = new int[lIIIIlllII[0]];
                                iArr29[lIIIIlllII[1]] = lIIIIlllII[17];
                                if (lllIIlIIlIll(Bank.contains(iArr29) ? 1 : 0)) {
                                    int[] iArr30 = new int[lIIIIlllII[0]];
                                    iArr30[lIIIIlllII[1]] = lIIIIlllII[17];
                                }
                                iArr14 = new int[lIIIIlllII[0]];
                                iArr14[lIIIIlllII[1]] = lIIIIlllII[36];
                                if (lllIIlIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                                    int[] iArr31 = new int[lIIIIlllII[0]];
                                    iArr31[lIIIIlllII[1]] = lIIIIlllII[36];
                                    if (lllIIlIIlIll(Bank.contains(iArr31) ? 1 : 0)) {
                                        int[] iArr32 = new int[lIIIIlllII[0]];
                                        iArr32[lIIIIlllII[1]] = lIIIIlllII[36];
                                    }
                                    iArr15 = new int[lIIIIlllII[0]];
                                    iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
                                    if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                                        int[] iArr33 = new int[lIIIIlllII[0]];
                                        iArr33[lIIIIlllII[1]] = lIIIIlllII[35];
                                        if (lllIIlIIlIll(Bank.contains(iArr33) ? 1 : 0)) {
                                            int[] iArr34 = new int[lIIIIlllII[0]];
                                            iArr34[lIIIIlllII[1]] = lIIIIlllII[35];
                                        }
                                        iArr16 = new int[lIIIIlllII[0]];
                                        iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                                        if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                                            int[] iArr35 = new int[lIIIIlllII[0]];
                                            iArr35[lIIIIlllII[1]] = lIIIIlllII[22];
                                            if (lllIIlIIlIll(Bank.contains(iArr35) ? 1 : 0)) {
                                                int[] iArr36 = new int[lIIIIlllII[0]];
                                                iArr36[lIIIIlllII[1]] = lIIIIlllII[22];
                                            }
                                            iArr17 = new int[lIIIIlllII[0]];
                                            iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                                            if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                                                int[] iArr37 = new int[lIIIIlllII[0]];
                                                iArr37[lIIIIlllII[1]] = lIIIIlllII[23];
                                                if (!lllIIlIIlIll(Bank.contains(iArr37) ? 1 : 0)) {
                                                    return;
                                                }
                                                int[] iArr38 = new int[lIIIIlllII[0]];
                                                iArr38[lIIIIlllII[1]] = lIIIIlllII[23];
                                                if (!lllIIlIIllII(Bank.getFirst(iArr38).getQuantity(), lIIIIlllII[39])) {
                                                    return;
                                                }
                                            }
                                            bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                                            "".length();
                                        }
                                        bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
                                        "".length();
                                        iArr17 = new int[lIIIIlllII[0]];
                                        iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                                        if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                                        }
                                        bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                                        "".length();
                                    }
                                    bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
                                    "".length();
                                    iArr16 = new int[lIIIIlllII[0]];
                                    iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                                    if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
                                    "".length();
                                    iArr17 = new int[lIIIIlllII[0]];
                                    iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                                    if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                                    "".length();
                                }
                                bx.add(new C0003d(lIIIIlllII[36], lIIIIlllII[10], C0009j.ch));
                                "".length();
                                iArr15 = new int[lIIIIlllII[0]];
                                iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
                                if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
                                "".length();
                                iArr16 = new int[lIIIIlllII[0]];
                                iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                                if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
                                "".length();
                                iArr17 = new int[lIIIIlllII[0]];
                                iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                                if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                                "".length();
                            }
                            bx.add(new C0003d(lIIIIlllII[17], lIIIIlllII[15], C0004e.c(lIIIIlllII[256], lIIIIlllII[257])));
                            "".length();
                            iArr14 = new int[lIIIIlllII[0]];
                            iArr14[lIIIIlllII[1]] = lIIIIlllII[36];
                            if (lllIIlIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lIIIIlllII[36], lIIIIlllII[10], C0009j.ch));
                            "".length();
                            iArr15 = new int[lIIIIlllII[0]];
                            iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
                            if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
                            "".length();
                            iArr16 = new int[lIIIIlllII[0]];
                            iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                            if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
                            "".length();
                            iArr17 = new int[lIIIIlllII[0]];
                            iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                            if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                            "".length();
                        }
                        bx.add(new C0003d(lIIIIlllII[18], lIIIIlllII[7], C0004e.c(lIIIIlllII[250], lIIIIlllII[251])));
                        "".length();
                        if (lllIIlIllIll(Bank.contains(item2 -> {
                            return item2.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[lIIIIlllII[0]];
                        iArr12[lIIIIlllII[1]] = lIIIIlllII[254];
                        if (lllIIlIllIll(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        iArr13 = new int[lIIIIlllII[0]];
                        iArr13[lIIIIlllII[1]] = lIIIIlllII[17];
                        if (lllIIlIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIlllII[17], lIIIIlllII[15], C0004e.c(lIIIIlllII[256], lIIIIlllII[257])));
                        "".length();
                        iArr14 = new int[lIIIIlllII[0]];
                        iArr14[lIIIIlllII[1]] = lIIIIlllII[36];
                        if (lllIIlIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIlllII[36], lIIIIlllII[10], C0009j.ch));
                        "".length();
                        iArr15 = new int[lIIIIlllII[0]];
                        iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
                        if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
                        "".length();
                        iArr16 = new int[lIIIIlllII[0]];
                        iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                        if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
                        "".length();
                        iArr17 = new int[lIIIIlllII[0]];
                        iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                        if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                        "".length();
                    }
                    bx.add(new C0003d(lIIIIlllII[16], lIIIIlllII[11], C0004e.c(lIIIIlllII[242], lIIIIlllII[243])));
                    "".length();
                    iArr4 = new int[lIIIIlllII[0]];
                    iArr4[lIIIIlllII[1]] = lIIIIlllII[28];
                    if (lllIIlIllIll(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    iArr5 = new int[lIIIIlllII[0]];
                    iArr5[lIIIIlllII[1]] = lIIIIlllII[32];
                    if (lllIIlIllIll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[lIIIIlllII[0]];
                    iArr6[lIIIIlllII[1]] = lIIIIlllII[30];
                    if (lllIIlIllIll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    iArr7 = new int[lIIIIlllII[0]];
                    iArr7[lIIIIlllII[1]] = lIIIIlllII[24];
                    if (lllIIlIllIll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    iArr8 = new int[lIIIIlllII[0]];
                    iArr8[lIIIIlllII[1]] = lIIIIlllII[34];
                    if (lllIIlIllIll(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[lIIIIlllII[0]];
                    iArr9[lIIIIlllII[1]] = lIIIIlllII[25];
                    if (lllIIlIllIll(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIIIIlllII[0]];
                    iArr10[lIIIIlllII[1]] = lIIIIlllII[26];
                    if (lllIIlIllIll(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[lIIIIlllII[0]];
                    iArr11[lIIIIlllII[1]] = lIIIIlllII[18];
                    if (lllIIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIlllII[18], lIIIIlllII[7], C0004e.c(lIIIIlllII[250], lIIIIlllII[251])));
                    "".length();
                    if (lllIIlIllIll(Bank.contains(item22 -> {
                        return item22.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[lIIIIlllII[0]];
                    iArr12[lIIIIlllII[1]] = lIIIIlllII[254];
                    if (lllIIlIllIll(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    iArr13 = new int[lIIIIlllII[0]];
                    iArr13[lIIIIlllII[1]] = lIIIIlllII[17];
                    if (lllIIlIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIlllII[17], lIIIIlllII[15], C0004e.c(lIIIIlllII[256], lIIIIlllII[257])));
                    "".length();
                    iArr14 = new int[lIIIIlllII[0]];
                    iArr14[lIIIIlllII[1]] = lIIIIlllII[36];
                    if (lllIIlIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIlllII[36], lIIIIlllII[10], C0009j.ch));
                    "".length();
                    iArr15 = new int[lIIIIlllII[0]];
                    iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
                    if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
                    "".length();
                    iArr16 = new int[lIIIIlllII[0]];
                    iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                    if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
                    "".length();
                    iArr17 = new int[lIIIIlllII[0]];
                    iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                    if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                    "".length();
                }
                bx.add(new C0003d(lIIIIlllII[14], lIIIIlllII[15], C0004e.c(lIIIIlllII[242], lIIIIlllII[243])));
                "".length();
                iArr3 = new int[lIIIIlllII[0]];
                iArr3[lIIIIlllII[1]] = lIIIIlllII[16];
                if (lllIIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlllII[16], lIIIIlllII[11], C0004e.c(lIIIIlllII[242], lIIIIlllII[243])));
                "".length();
                iArr4 = new int[lIIIIlllII[0]];
                iArr4[lIIIIlllII[1]] = lIIIIlllII[28];
                if (lllIIlIllIll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIIIIlllII[0]];
                iArr5[lIIIIlllII[1]] = lIIIIlllII[32];
                if (lllIIlIllIll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lIIIIlllII[0]];
                iArr6[lIIIIlllII[1]] = lIIIIlllII[30];
                if (lllIIlIllIll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[lIIIIlllII[0]];
                iArr7[lIIIIlllII[1]] = lIIIIlllII[24];
                if (lllIIlIllIll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lIIIIlllII[0]];
                iArr8[lIIIIlllII[1]] = lIIIIlllII[34];
                if (lllIIlIllIll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIIIIlllII[0]];
                iArr9[lIIIIlllII[1]] = lIIIIlllII[25];
                if (lllIIlIllIll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIIIIlllII[0]];
                iArr10[lIIIIlllII[1]] = lIIIIlllII[26];
                if (lllIIlIllIll(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIIIIlllII[0]];
                iArr11[lIIIIlllII[1]] = lIIIIlllII[18];
                if (lllIIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlllII[18], lIIIIlllII[7], C0004e.c(lIIIIlllII[250], lIIIIlllII[251])));
                "".length();
                if (lllIIlIllIll(Bank.contains(item222 -> {
                    return item222.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[lIIIIlllII[0]];
                iArr12[lIIIIlllII[1]] = lIIIIlllII[254];
                if (lllIIlIllIll(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[lIIIIlllII[0]];
                iArr13[lIIIIlllII[1]] = lIIIIlllII[17];
                if (lllIIlIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlllII[17], lIIIIlllII[15], C0004e.c(lIIIIlllII[256], lIIIIlllII[257])));
                "".length();
                iArr14 = new int[lIIIIlllII[0]];
                iArr14[lIIIIlllII[1]] = lIIIIlllII[36];
                if (lllIIlIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlllII[36], lIIIIlllII[10], C0009j.ch));
                "".length();
                iArr15 = new int[lIIIIlllII[0]];
                iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
                if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
                "".length();
                iArr16 = new int[lIIIIlllII[0]];
                iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
                "".length();
                iArr17 = new int[lIIIIlllII[0]];
                iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
                if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
                "".length();
            }
            bx.add(new C0003d(lIIIIlllII[19], lIIIIlllII[15], lIIIIlllII[241]));
            "".length();
            iArr2 = new int[lIIIIlllII[0]];
            iArr2[lIIIIlllII[1]] = lIIIIlllII[14];
            if (lllIIlIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[14], lIIIIlllII[15], C0004e.c(lIIIIlllII[242], lIIIIlllII[243])));
            "".length();
            iArr3 = new int[lIIIIlllII[0]];
            iArr3[lIIIIlllII[1]] = lIIIIlllII[16];
            if (lllIIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[16], lIIIIlllII[11], C0004e.c(lIIIIlllII[242], lIIIIlllII[243])));
            "".length();
            iArr4 = new int[lIIIIlllII[0]];
            iArr4[lIIIIlllII[1]] = lIIIIlllII[28];
            if (lllIIlIllIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIIIlllII[0]];
            iArr5[lIIIIlllII[1]] = lIIIIlllII[32];
            if (lllIIlIllIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIIIlllII[0]];
            iArr6[lIIIIlllII[1]] = lIIIIlllII[30];
            if (lllIIlIllIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIIIIlllII[0]];
            iArr7[lIIIIlllII[1]] = lIIIIlllII[24];
            if (lllIIlIllIll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIIIIlllII[0]];
            iArr8[lIIIIlllII[1]] = lIIIIlllII[34];
            if (lllIIlIllIll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIIIIlllII[0]];
            iArr9[lIIIIlllII[1]] = lIIIIlllII[25];
            if (lllIIlIllIll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIIIIlllII[0]];
            iArr10[lIIIIlllII[1]] = lIIIIlllII[26];
            if (lllIIlIllIll(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIIIIlllII[0]];
            iArr11[lIIIIlllII[1]] = lIIIIlllII[18];
            if (lllIIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[18], lIIIIlllII[7], C0004e.c(lIIIIlllII[250], lIIIIlllII[251])));
            "".length();
            if (lllIIlIllIll(Bank.contains(item2222 -> {
                return item2222.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[lIIIIlllII[0]];
            iArr12[lIIIIlllII[1]] = lIIIIlllII[254];
            if (lllIIlIllIll(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[lIIIIlllII[0]];
            iArr13[lIIIIlllII[1]] = lIIIIlllII[17];
            if (lllIIlIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[17], lIIIIlllII[15], C0004e.c(lIIIIlllII[256], lIIIIlllII[257])));
            "".length();
            iArr14 = new int[lIIIIlllII[0]];
            iArr14[lIIIIlllII[1]] = lIIIIlllII[36];
            if (lllIIlIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[36], lIIIIlllII[10], C0009j.ch));
            "".length();
            iArr15 = new int[lIIIIlllII[0]];
            iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
            if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
            "".length();
            iArr16 = new int[lIIIIlllII[0]];
            iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
            if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
            "".length();
            iArr17 = new int[lIIIIlllII[0]];
            iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
            if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
            "".length();
        }
        bx.add(new C0003d(lIIIIlllII[238], lIIIIlllII[15], C0004e.c(lIIIIlllII[239], lIIIIlllII[240])));
        "".length();
        iArr = new int[lIIIIlllII[0]];
        iArr[lIIIIlllII[1]] = lIIIIlllII[19];
        if (lllIIlIIlIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[19], lIIIIlllII[15], lIIIIlllII[241]));
        "".length();
        iArr2 = new int[lIIIIlllII[0]];
        iArr2[lIIIIlllII[1]] = lIIIIlllII[14];
        if (lllIIlIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[14], lIIIIlllII[15], C0004e.c(lIIIIlllII[242], lIIIIlllII[243])));
        "".length();
        iArr3 = new int[lIIIIlllII[0]];
        iArr3[lIIIIlllII[1]] = lIIIIlllII[16];
        if (lllIIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[16], lIIIIlllII[11], C0004e.c(lIIIIlllII[242], lIIIIlllII[243])));
        "".length();
        iArr4 = new int[lIIIIlllII[0]];
        iArr4[lIIIIlllII[1]] = lIIIIlllII[28];
        if (lllIIlIllIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIIIlllII[0]];
        iArr5[lIIIIlllII[1]] = lIIIIlllII[32];
        if (lllIIlIllIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIIIlllII[0]];
        iArr6[lIIIIlllII[1]] = lIIIIlllII[30];
        if (lllIIlIllIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIIIlllII[0]];
        iArr7[lIIIIlllII[1]] = lIIIIlllII[24];
        if (lllIIlIllIll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIIIIlllII[0]];
        iArr8[lIIIIlllII[1]] = lIIIIlllII[34];
        if (lllIIlIllIll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIIIlllII[0]];
        iArr9[lIIIIlllII[1]] = lIIIIlllII[25];
        if (lllIIlIllIll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIIIIlllII[0]];
        iArr10[lIIIIlllII[1]] = lIIIIlllII[26];
        if (lllIIlIllIll(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIIIIlllII[0]];
        iArr11[lIIIIlllII[1]] = lIIIIlllII[18];
        if (lllIIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[18], lIIIIlllII[7], C0004e.c(lIIIIlllII[250], lIIIIlllII[251])));
        "".length();
        if (lllIIlIllIll(Bank.contains(item22222 -> {
            return item22222.getName().toLowerCase().contains(lIIIIlIlII[lIIIIlllII[260]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[lIIIIlllII[0]];
        iArr12[lIIIIlllII[1]] = lIIIIlllII[254];
        if (lllIIlIllIll(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[lIIIIlllII[0]];
        iArr13[lIIIIlllII[1]] = lIIIIlllII[17];
        if (lllIIlIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[17], lIIIIlllII[15], C0004e.c(lIIIIlllII[256], lIIIIlllII[257])));
        "".length();
        iArr14 = new int[lIIIIlllII[0]];
        iArr14[lIIIIlllII[1]] = lIIIIlllII[36];
        if (lllIIlIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[36], lIIIIlllII[10], C0009j.ch));
        "".length();
        iArr15 = new int[lIIIIlllII[0]];
        iArr15[lIIIIlllII[1]] = lIIIIlllII[35];
        if (lllIIlIIlIll(Bank.contains(iArr15) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[35], lIIIIlllII[44], lIIIIlllII[241]));
        "".length();
        iArr16 = new int[lIIIIlllII[0]];
        iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
        if (lllIIlIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[22], lIIIIlllII[65], lIIIIlllII[258]));
        "".length();
        iArr17 = new int[lIIIIlllII[0]];
        iArr17[lIIIIlllII[1]] = lIIIIlllII[23];
        if (lllIIlIIlIll(Bank.contains(iArr17) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlllII[23], lIIIIlllII[39], lIIIIlllII[259]));
        "".length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (lllIIlIIlIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02ba, code lost:
        if (lllIIlIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[15]) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02fd, code lost:
        if (lllIIlIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[11]) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0340, code lost:
        if (lllIIlIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[11]) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0383, code lost:
        if (lllIIlIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[7]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03c6, code lost:
        if (lllIIlIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[11]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03c9, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlIlII[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[20]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z.lIIIIlllII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03e4, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1249, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1276, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1334, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v396, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bk() {
        if (lllIIlIIlIll(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lllIIlIIllII(bx.size(), lIIIIlllII[0])) {
                System.out.println(lIIIIlIlII[lIIIIlllII[1]]);
                bv = lIIIIlllII[1];
            }
        }
        if (lllIIlIllIll(bv ? 1 : 0)) {
            if (lllIIlIlllII(C0004e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                int[] iArr = new int[lIIIIlllII[0]];
                iArr[lIIIIlllII[1]] = lIIIIlllII[4];
            }
            dc = lIIIIlIlII[lIIIIlllII[0]];
            F.bG();
            if (lllIIlIlllII(C0004e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                int[] iArr2 = new int[lIIIIlllII[0]];
                iArr2[lIIIIlllII[1]] = lIIIIlllII[4];
                if (lllIIlIllIll(Inventory.contains(iArr2) ? 1 : 0) && lllIIlIIllII(C0004e.j(lIIIIlllII[5]), lIIIIlllII[6])) {
                    dc = lIIIIlIlII[lIIIIlllII[7]];
                    L.cl();
                }
            }
            if (lllIIlIlllII(C0004e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                int[] iArr3 = new int[lIIIIlllII[0]];
                iArr3[lIIIIlllII[1]] = lIIIIlllII[4];
                if (lllIIlIllIll(Inventory.contains(iArr3) ? 1 : 0) && lllIIlIlllII(C0004e.j(lIIIIlllII[5]), lIIIIlllII[6]) && lllIIlIIllII(Skills.getLevel(Skill.HERBLORE), lIIIIlllII[8])) {
                    dc = lIIIIlIlII[lIIIIlllII[9]];
                    ap.eK();
                }
            }
            C0004e.t();
            if (lllIIlIllIll(an() ? 1 : 0) && lllIIlIlllII(C0004e.j(lIIIIlllII[2]), lIIIIlllII[3])) {
                int[] iArr4 = new int[lIIIIlllII[0]];
                iArr4[lIIIIlllII[1]] = lIIIIlllII[4];
                if (lllIIlIllIll(Inventory.contains(iArr4) ? 1 : 0) && lllIIlIlllII(C0004e.j(lIIIIlllII[5]), lIIIIlllII[6]) && lllIIlIlllII(Skills.getLevel(Skill.HERBLORE), lIIIIlllII[8]) && lllIIlIIllII(C0004e.j(dL), lIIIIlllII[0])) {
                    dc = lIIIIlIlII[lIIIIlllII[10]];
                    BankLocation nearest = BankLocation.getNearest();
                    if (lllIIlIlllIl(nearest) && lllIIlIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[11]];
                        C0000a.a(nearest);
                    }
                    if (lllIIlIlllIl(nearest) && lllIIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIIlllII[12]);
                            "".length();
                        }
                        if (lllIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[13]];
                            if (lllIIlIllllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIIlllII[10]);
                                "".length();
                            }
                            if (lllIIlIllllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIIlllII[7]);
                                "".length();
                            }
                            int[] iArr5 = new int[lIIIIlllII[0]];
                            iArr5[lIIIIlllII[1]] = lIIIIlllII[14];
                            if (lllIIlIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlllII[0]];
                                iArr6[lIIIIlllII[1]] = lIIIIlllII[14];
                            }
                            int[] iArr7 = new int[lIIIIlllII[0]];
                            iArr7[lIIIIlllII[1]] = lIIIIlllII[16];
                            if (lllIIlIIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIIlllII[0]];
                                iArr8[lIIIIlllII[1]] = lIIIIlllII[16];
                            }
                            int[] iArr9 = new int[lIIIIlllII[0]];
                            iArr9[lIIIIlllII[1]] = lIIIIlllII[17];
                            if (lllIIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIIlllII[0]];
                                iArr10[lIIIIlllII[1]] = lIIIIlllII[17];
                            }
                            int[] iArr11 = new int[lIIIIlllII[0]];
                            iArr11[lIIIIlllII[1]] = lIIIIlllII[18];
                            if (lllIIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIIIlllII[0]];
                                iArr12[lIIIIlllII[1]] = lIIIIlllII[18];
                            }
                            int[] iArr13 = new int[lIIIIlllII[0]];
                            iArr13[lIIIIlllII[1]] = lIIIIlllII[19];
                            if (lllIIlIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIIIlllII[0]];
                                iArr14[lIIIIlllII[1]] = lIIIIlllII[19];
                            }
                            int[] iArr15 = new int[lIIIIlllII[21]];
                            iArr15[lIIIIlllII[1]] = lIIIIlllII[22];
                            iArr15[lIIIIlllII[0]] = lIIIIlllII[23];
                            iArr15[lIIIIlllII[7]] = lIIIIlllII[24];
                            iArr15[lIIIIlllII[9]] = lIIIIlllII[25];
                            iArr15[lIIIIlllII[10]] = lIIIIlllII[26];
                            iArr15[lIIIIlllII[11]] = lIIIIlllII[18];
                            iArr15[lIIIIlllII[13]] = lIIIIlllII[14];
                            iArr15[lIIIIlllII[20]] = lIIIIlllII[16];
                            iArr15[lIIIIlllII[27]] = lIIIIlllII[28];
                            iArr15[lIIIIlllII[29]] = lIIIIlllII[30];
                            iArr15[lIIIIlllII[15]] = lIIIIlllII[17];
                            iArr15[lIIIIlllII[31]] = lIIIIlllII[32];
                            iArr15[lIIIIlllII[33]] = lIIIIlllII[19];
                            if (lllIIlIllIll(C0004e.d(iArr15) ? 1 : 0)) {
                                Q();
                                System.out.println(lIIIIlIlII[lIIIIlllII[27]]);
                                bv = lIIIIlllII[0];
                                return;
                            }
                            int[] iArr16 = new int[lIIIIlllII[21]];
                            iArr16[lIIIIlllII[1]] = lIIIIlllII[22];
                            iArr16[lIIIIlllII[0]] = lIIIIlllII[23];
                            iArr16[lIIIIlllII[7]] = lIIIIlllII[24];
                            iArr16[lIIIIlllII[9]] = lIIIIlllII[25];
                            iArr16[lIIIIlllII[10]] = lIIIIlllII[26];
                            iArr16[lIIIIlllII[11]] = lIIIIlllII[18];
                            iArr16[lIIIIlllII[13]] = lIIIIlllII[14];
                            iArr16[lIIIIlllII[20]] = lIIIIlllII[16];
                            iArr16[lIIIIlllII[27]] = lIIIIlllII[28];
                            iArr16[lIIIIlllII[29]] = lIIIIlllII[30];
                            iArr16[lIIIIlllII[15]] = lIIIIlllII[17];
                            iArr16[lIIIIlllII[31]] = lIIIIlllII[32];
                            iArr16[lIIIIlllII[33]] = lIIIIlllII[19];
                            if (lllIIlIIlIll(C0004e.d(iArr16) ? 1 : 0)) {
                                C0000a.a(lIIIIlllII[22], lIIIIlllII[15]);
                                C0000a.a(lIIIIlllII[25], lIIIIlllII[0]);
                                C0000a.a(lIIIIlllII[26], lIIIIlllII[0]);
                                C0000a.a(lIIIIlllII[23], lIIIIlllII[15]);
                                C0000a.a(lIIIIlllII[34], lIIIIlllII[0]);
                                C0000a.a(lIIIIlllII[35], lIIIIlllII[13]);
                                C0000a.a(lIIIIlllII[17], lIIIIlllII[7]);
                                C0000a.a(lIIIIlllII[36], lIIIIlllII[9]);
                                C0000a.a(lIIIIlllII[24], lIIIIlllII[0]);
                                C0000a.a(lIIIIlllII[19], lIIIIlllII[15]);
                            }
                        }
                    }
                }
            }
            if (lllIIlIIlIll(Inventory.contains(C0005f.bc) ? 1 : 0) && lllIIlIIllII(Movement.getRunEnergy(), lIIIIlllII[6])) {
                Inventory.getFirst(C0005f.bc).interact(lIIIIlIlII[lIIIIlllII[29]]);
                Time.sleepTicks(lIIIIlllII[0]);
                "".length();
            }
            if (lllIIlIIlIll(Inventory.contains(C0005f.aZ) ? 1 : 0) && lllIIlIIllII(Prayers.getPoints(), lIIIIlllII[37])) {
                Inventory.getFirst(C0005f.aZ).interact(lIIIIlIlII[lIIIIlllII[15]]);
            }
            if (lllIIlIlllll(lllIIlIIlIlI(C0004e.w(), 60.0d))) {
                String[] strArr = new String[lIIIIlllII[0]];
                strArr[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[31]];
                if (lllIIlIIlIll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIIlllII[0]];
                    strArr2[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[33]];
                    Inventory.getFirst(strArr2).interact(lIIIIlIlII[lIIIIlllII[21]]);
                    Time.sleepTicks(lIIIIlllII[7]);
                    "".length();
                }
            }
            if (lllIIlIIlIll(C0004e.s() ? 1 : 0) && lllIIlIIlIll(Inventory.contains(item -> {
                return item.getName().contains(lIIIIlIlII[lIIIIlllII[301]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item2 -> {
                    return item2.getName().contains(lIIIIlIlII[lIIIIlllII[300]]);
                }).interact(lIIIIlIlII[lIIIIlllII[38]]);
                Time.sleepTicks(lIIIIlllII[7]);
                "".length();
            }
            if (lllIIlIllIll(C0004e.j(dL)) && lllIIlIIlIll(an() ? 1 : 0)) {
                if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[39]];
                    if (lllIIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(lIIIIlllII[0]);
                    "".length();
                }
                if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    C0006g.a(lIIIIlIlII[lIIIIlllII[40]], cG, lIIIIlllII[0]);
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[15])) {
                dk = lIIIIlllII[1];
                if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[41]];
                    if (lllIIlIIlIll(Inventory.contains(item3 -> {
                        return item3.getName().contains(lIIIIlIlII[lIIIIlllII[299]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item4 -> {
                            return item4.getName().contains(lIIIIlIlII[lIIIIlllII[298]]);
                        }).interact(lIIIIlIlII[lIIIIlllII[42]]);
                    }
                    if (lllIIlIIlIll(Equipment.contains(item5 -> {
                        return item5.getName().contains(lIIIIlIlII[lIIIIlllII[297]]);
                    }) ? 1 : 0)) {
                        Equipment.getFirst(item6 -> {
                            return item6.getName().contains(lIIIIlIlII[lIIIIlllII[296]]);
                        }).interact(lIIIIlIlII[lIIIIlllII[43]]);
                        Time.sleepTicks(lIIIIlllII[13]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lIIIIlllII[0]];
                strArr3[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[44]];
                if (lllIIllIIIll(NPCs.getNearest(strArr3))) {
                    L.cp();
                }
                String[] strArr4 = new String[lIIIIlllII[0]];
                strArr4[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[45]];
                if (lllIIlIlllIl(NPCs.getNearest(strArr4))) {
                    C0006g.a(lIIIIlIlII[lIIIIlllII[46]], cG);
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[39])) {
                String[] strArr5 = new String[lIIIIlllII[0]];
                strArr5[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[47]];
                if (lllIIlIlllIl(NPCs.getNearest(strArr5))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[37]];
                    String[] strArr6 = new String[lIIIIlllII[0]];
                    strArr6[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[48]];
                    TileObjects.getNearest(strArr6).interact(lIIIIlIlII[lIIIIlllII[49]]);
                    Time.sleepTicks(lIIIIlllII[9]);
                    "".length();
                }
                String[] strArr7 = new String[lIIIIlllII[0]];
                strArr7[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[50]];
                if (lllIIllIIIll(NPCs.getNearest(strArr7))) {
                    if (lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            WorldPoint worldPoint = new WorldPoint(lIIIIlllII[51], lIIIIlllII[52], lIIIIlllII[7]);
                            if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[53]];
                                Movement.walkTo(worldPoint);
                                "".length();
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[54]];
                                String[] strArr8 = new String[lIIIIlllII[0]];
                                strArr8[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[3]];
                                TileObjects.getNearest(strArr8).interact(lIIIIlIlII[lIIIIlllII[8]]);
                                Time.sleepTicks(lIIIIlllII[10]);
                                "".length();
                            }
                        }
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            C0006g.a(lIIIIlIlII[lIIIIlllII[55]], cG);
                        }
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[48])) {
                if (lllIIlIIlIll(L.cq() ? 1 : 0)) {
                    if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[56]];
                        String[] strArr9 = new String[lIIIIlllII[0]];
                        strArr9[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[57]];
                        TileObjects.getNearest(strArr9).interact(lIIIIlIlII[lIIIIlllII[58]]);
                        Time.sleepTicks(lIIIIlllII[10]);
                        "".length();
                    }
                    if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                        WorldPoint worldPoint2 = new WorldPoint(lIIIIlllII[59], lIIIIlllII[60], lIIIIlllII[7]);
                        if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIIlllII[9])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[61]];
                            Movement.walkTo(worldPoint2);
                            "".length();
                            Time.sleepTicks(lIIIIlllII[0]);
                            "".length();
                        }
                        if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIIlllII[9])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[62]];
                            String[] strArr10 = new String[lIIIIlllII[0]];
                            strArr10[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[63]];
                            TileObjects.getNearest(strArr10).interact(lIIIIlIlII[lIIIIlllII[64]]);
                            Time.sleepTicks(lIIIIlllII[9]);
                            "".length();
                        }
                    }
                }
                if (lllIIlIllIll(L.cq() ? 1 : 0)) {
                    String[] strArr11 = new String[lIIIIlllII[0]];
                    strArr11[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[65]];
                    if (lllIIllIIIll(NPCs.getNearest(strArr11))) {
                        WorldArea worldArea = new WorldArea(lIIIIlllII[66], lIIIIlllII[67], lIIIIlllII[44], lIIIIlllII[43], lIIIIlllII[1]);
                        if (lllIIlIIlIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[68]];
                            Movement.walkTo(new WorldPoint(lIIIIlllII[69], lIIIIlllII[70], lIIIIlllII[1]));
                            "".length();
                            Time.sleepTicks(lIIIIlllII[0]);
                            "".length();
                        }
                        if (lllIIlIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            L.cp();
                        }
                    }
                }
                String[] strArr12 = new String[lIIIIlllII[0]];
                strArr12[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[71]];
                if (lllIIlIlllIl(NPCs.getNearest(strArr12))) {
                    C0006g.a(lIIIIlIlII[lIIIIlllII[72]], cG);
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[3])) {
                int[] iArr17 = new int[lIIIIlllII[0]];
                iArr17[lIIIIlllII[1]] = lIIIIlllII[73];
                if (lllIIlIllIll(Inventory.contains(iArr17) ? 1 : 0)) {
                    String[] strArr13 = new String[lIIIIlllII[0]];
                    strArr13[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[74]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr13))) {
                        int[] iArr18 = new int[lIIIIlllII[0]];
                        iArr18[lIIIIlllII[1]] = lIIIIlllII[23];
                        if (lllIIlIIlIll(Inventory.contains(iArr18) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[75]];
                            int[] iArr19 = new int[lIIIIlllII[0]];
                            iArr19[lIIIIlllII[1]] = lIIIIlllII[23];
                            Inventory.getFirst(iArr19).interact(lIIIIlIlII[lIIIIlllII[76]]);
                            Time.sleepTicks(lIIIIlllII[13]);
                            "".length();
                        }
                    }
                    String[] strArr14 = new String[lIIIIlllII[0]];
                    strArr14[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[77]];
                    if (lllIIllIIIll(NPCs.getNearest(strArr14))) {
                        String[] strArr15 = new String[lIIIIlllII[0]];
                        strArr15[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[78]];
                        if (lllIIllIIIll(NPCs.getNearest(strArr15))) {
                            WorldPoint worldPoint3 = new WorldPoint(lIIIIlllII[79], lIIIIlllII[80], lIIIIlllII[1]);
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[81]];
                            Movement.walkTo(worldPoint3);
                            "".length();
                            Time.sleepTicks(lIIIIlllII[0]);
                            "".length();
                        }
                    }
                    String[] strArr16 = new String[lIIIIlllII[0]];
                    strArr16[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[6]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr16))) {
                        if (lllIIlIllIll(dP ? 1 : 0) && lllIIlIllIll(dQ ? 1 : 0)) {
                            C0006g.a(lIIIIlIlII[lIIIIlllII[82]], cG);
                        }
                        if (lllIIlIllIll(dP ? 1 : 0)) {
                            String str = lIIIIlIlII[lIIIIlllII[83]];
                            String[] strArr17 = new String[lIIIIlllII[0]];
                            strArr17[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[84]];
                            C0006g.a(str, strArr17);
                        }
                        if (lllIIlIIlIll(dP ? 1 : 0) && lllIIlIllIll(dQ ? 1 : 0)) {
                            String str2 = lIIIIlIlII[lIIIIlllII[85]];
                            String[] strArr18 = new String[lIIIIlllII[0]];
                            strArr18[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[86]];
                            C0006g.a(str2, strArr18);
                        }
                        if (lllIIlIIlIll(dQ ? 1 : 0) && lllIIlIIlIll(dP ? 1 : 0)) {
                            int[] iArr20 = new int[lIIIIlllII[0]];
                            iArr20[lIIIIlllII[1]] = lIIIIlllII[26];
                            if (lllIIlIIlIll(Inventory.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIIIIlllII[0]];
                                iArr21[lIIIIlllII[1]] = lIIIIlllII[26];
                                Item first = Inventory.getFirst(iArr21);
                                int[] iArr22 = new int[lIIIIlllII[0]];
                                iArr22[lIIIIlllII[1]] = lIIIIlllII[25];
                                first.useOn(Inventory.getFirst(iArr22));
                            }
                            int[] iArr23 = new int[lIIIIlllII[0]];
                            iArr23[lIIIIlllII[1]] = lIIIIlllII[87];
                            if (lllIIlIIlIll(Inventory.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[lIIIIlllII[0]];
                                iArr24[lIIIIlllII[1]] = lIIIIlllII[87];
                                Item first2 = Inventory.getFirst(iArr24);
                                String[] strArr19 = new String[lIIIIlllII[0]];
                                strArr19[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[88]];
                                first2.useOn(TileObjects.getNearest(strArr19));
                            }
                        }
                    }
                }
                int[] iArr25 = new int[lIIIIlllII[0]];
                iArr25[lIIIIlllII[1]] = lIIIIlllII[73];
                if (lllIIlIIlIll(Inventory.contains(iArr25) ? 1 : 0)) {
                    String[] strArr20 = new String[lIIIIlllII[0]];
                    strArr20[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[89]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr20))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[90]];
                        if (lllIIlIIlIll(Inventory.contains(item7 -> {
                            return item7.getName().contains(lIIIIlIlII[lIIIIlllII[295]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item8 -> {
                                return item8.getName().contains(lIIIIlIlII[lIIIIlllII[294]]);
                            }).interact(lIIIIlIlII[lIIIIlllII[91]]);
                        }
                        if (lllIIlIIlIll(Equipment.contains(item9 -> {
                            return item9.getName().contains(lIIIIlIlII[lIIIIlllII[293]]);
                        }) ? 1 : 0)) {
                            Equipment.getFirst(item10 -> {
                                return item10.getName().contains(lIIIIlIlII[lIIIIlllII[292]]);
                            }).interact(lIIIIlIlII[lIIIIlllII[92]]);
                            Time.sleepTicks(lIIIIlllII[13]);
                            "".length();
                        }
                    }
                    String[] strArr21 = new String[lIIIIlllII[0]];
                    strArr21[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[93]];
                    if (lllIIllIIIll(NPCs.getNearest(strArr21))) {
                        L.cp();
                    }
                    String[] strArr22 = new String[lIIIIlllII[0]];
                    strArr22[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[94]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr22))) {
                        C0006g.a(lIIIIlIlII[lIIIIlllII[95]], cG);
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[6])) {
                String[] strArr23 = new String[lIIIIlllII[0]];
                strArr23[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[96]];
                if (lllIIlIlllIl(NPCs.getNearest(strArr23))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[97]];
                    String[] strArr24 = new String[lIIIIlllII[0]];
                    strArr24[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[98]];
                    TileObjects.getNearest(strArr24).interact(lIIIIlIlII[lIIIIlllII[99]]);
                    Time.sleepTicks(lIIIIlllII[9]);
                    "".length();
                }
                String[] strArr25 = new String[lIIIIlllII[0]];
                strArr25[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[100]];
                if (lllIIllIIIll(NPCs.getNearest(strArr25))) {
                    if (lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            WorldPoint worldPoint4 = new WorldPoint(lIIIIlllII[51], lIIIIlllII[101], lIIIIlllII[7]);
                            if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[102]];
                                Movement.walkTo(worldPoint4);
                                "".length();
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[103]];
                                String[] strArr26 = new String[lIIIIlllII[0]];
                                strArr26[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[104]];
                                TileObjects.getNearest(strArr26).interact(lIIIIlIlII[lIIIIlllII[105]]);
                                Time.sleepTicks(lIIIIlllII[10]);
                                "".length();
                            }
                        }
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                                if (lllIIlIIlIll(tileObject.getName().contains(lIIIIlIlII[lIIIIlllII[290]]) ? 1 : 0)) {
                                    String[] strArr27 = new String[lIIIIlllII[0]];
                                    strArr27[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[291]];
                                    if (lllIIlIIlIll(tileObject.hasAction(strArr27) ? 1 : 0)) {
                                        ?? r0 = lIIIIlllII[0];
                                        "".length();
                                        return (-"   ".length()) >= 0 ? ((((146 + 183) - 315) + 201) ^ (((144 + 120) - 236) + 117)) & (((17 ^ 30) ^ (81 ^ 24)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lIIIIlllII[1];
                            });
                            if (lllIIlIlllIl(nearest2)) {
                                if (lllIIlIllIll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[106]];
                                    Movement.walkTo(nearest2.getWorldLocation());
                                    "".length();
                                    Time.sleepTicks(lIIIIlllII[0]);
                                    "".length();
                                }
                                if (lllIIlIIlIll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                    nearest2.interact(lIIIIlIlII[lIIIIlllII[107]]);
                                    Time.sleepTicks(lIIIIlllII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (lllIIlIlllll(lllIIlIIlIlI(C0004e.w(), 100.0d))) {
                                int[] iArr26 = new int[lIIIIlllII[0]];
                                iArr26[lIIIIlllII[1]] = lIIIIlllII[35];
                                if (lllIIlIIlIll(Inventory.contains(iArr26) ? 1 : 0)) {
                                    String[] strArr27 = new String[lIIIIlllII[0]];
                                    strArr27[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[108]];
                                    Inventory.getFirst(strArr27).interact(lIIIIlIlII[lIIIIlllII[109]]);
                                    Time.sleepTicks(lIIIIlllII[0]);
                                    "".length();
                                }
                            }
                            if (lllIIllIIlII(Prayers.getPoints(), Skills.getLevel(Skill.PRAYER)) && lllIIlIIlIll(Inventory.contains(item11 -> {
                                return item11.getName().contains(lIIIIlIlII[lIIIIlllII[289]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item12 -> {
                                    return item12.getName().contains(lIIIIlIlII[lIIIIlllII[288]]);
                                }).interact(lIIIIlIlII[lIIIIlllII[110]]);
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            WorldPoint worldPoint5 = new WorldPoint(lIIIIlllII[111], lIIIIlllII[112], lIIIIlllII[1]);
                            if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[113]];
                                Movement.walkTo(worldPoint5);
                                "".length();
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIIIlllII[15])) {
                                int[] iArr27 = new int[lIIIIlllII[0]];
                                iArr27[lIIIIlllII[1]] = lIIIIlllII[73];
                                if (lllIIlIIlIll(Inventory.contains(iArr27) ? 1 : 0)) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[114]];
                                    int[] iArr28 = new int[lIIIIlllII[0]];
                                    iArr28[lIIIIlllII[1]] = lIIIIlllII[73];
                                    Item first3 = Inventory.getFirst(iArr28);
                                    String[] strArr28 = new String[lIIIIlllII[0]];
                                    strArr28[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[115]];
                                    first3.useOn(TileObjects.getNearest(strArr28));
                                    Time.sleepTicks(lIIIIlllII[9]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[92])) {
                int[] iArr29 = new int[lIIIIlllII[0]];
                iArr29[lIIIIlllII[1]] = lIIIIlllII[116];
                if (lllIIlIllIll(Inventory.contains(iArr29) ? 1 : 0)) {
                    if (lllIIlIllIll(bn() ? 1 : 0)) {
                        bm();
                    }
                    if (lllIIlIIlIll(bn() ? 1 : 0)) {
                        WorldPoint worldPoint6 = new WorldPoint(lIIIIlllII[117], lIIIIlllII[118], lIIIIlllII[1]);
                        if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lIIIIlllII[11])) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[119]];
                            Movement.walkTo(worldPoint6);
                            "".length();
                            Time.sleepTicks(lIIIIlllII[0]);
                            "".length();
                        }
                        if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lIIIIlllII[11])) {
                            String str3 = lIIIIlIlII[lIIIIlllII[120]];
                            String[] strArr29 = new String[lIIIIlllII[0]];
                            strArr29[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[121]];
                            C0006g.a(str3, strArr29);
                        }
                    }
                }
                int[] iArr30 = new int[lIIIIlllII[0]];
                iArr30[lIIIIlllII[1]] = lIIIIlllII[116];
                if (lllIIlIIlIll(Inventory.contains(iArr30) ? 1 : 0)) {
                    String[] strArr30 = new String[lIIIIlllII[0]];
                    strArr30[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[122]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr30))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[123]];
                        if (lllIIlIIlIll(Inventory.contains(item13 -> {
                            return item13.getName().contains(lIIIIlIlII[lIIIIlllII[287]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item14 -> {
                                return item14.getName().contains(lIIIIlIlII[lIIIIlllII[286]]);
                            }).interact(lIIIIlIlII[lIIIIlllII[124]]);
                        }
                        if (lllIIlIIlIll(Equipment.contains(item15 -> {
                            return item15.getName().contains(lIIIIlIlII[lIIIIlllII[285]]);
                        }) ? 1 : 0)) {
                            Equipment.getFirst(item16 -> {
                                return item16.getName().contains(lIIIIlIlII[lIIIIlllII[284]]);
                            }).interact(lIIIIlIlII[lIIIIlllII[125]]);
                            Time.sleepTicks(lIIIIlllII[13]);
                            "".length();
                        }
                    }
                    String[] strArr31 = new String[lIIIIlllII[0]];
                    strArr31[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[126]];
                    if (lllIIllIIIll(NPCs.getNearest(strArr31))) {
                        L.cp();
                    }
                    String[] strArr32 = new String[lIIIIlllII[0]];
                    strArr32[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[127]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr32))) {
                        C0006g.a(lIIIIlIlII[lIIIIlllII[128]], cG);
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[103])) {
                C0006g.a(new String[lIIIIlllII[1]]);
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[115])) {
                String[] strArr33 = new String[lIIIIlllII[0]];
                strArr33[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[129]];
                if (lllIIlIllIll(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[lIIIIlllII[0]];
                    strArr34[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[130]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr34))) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[131]];
                        String[] strArr35 = new String[lIIIIlllII[0]];
                        strArr35[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[132]];
                        TileObjects.getNearest(strArr35).interact(lIIIIlIlII[lIIIIlllII[133]]);
                        Time.sleepTicks(lIIIIlllII[10]);
                        "".length();
                    }
                    int[] iArr31 = new int[lIIIIlllII[0]];
                    iArr31[lIIIIlllII[1]] = lIIIIlllII[134];
                    if (lllIIlIllIll(Inventory.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[lIIIIlllII[0]];
                        iArr32[lIIIIlllII[1]] = lIIIIlllII[135];
                        if (lllIIlIllIll(Inventory.contains(iArr32) ? 1 : 0)) {
                            String[] strArr36 = new String[lIIIIlllII[0]];
                            strArr36[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[136]];
                            if (lllIIlIllIll(Inventory.contains(strArr36) ? 1 : 0)) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[137]];
                                String[] strArr37 = new String[lIIIIlllII[0]];
                                strArr37[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[138]];
                                NPCs.getNearest(strArr37).interact(lIIIIlIlII[lIIIIlllII[30]]);
                                Time.sleepTicks(lIIIIlllII[9]);
                                "".length();
                            }
                            String[] strArr38 = new String[lIIIIlllII[0]];
                            strArr38[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[139]];
                            if (lllIIlIIlIll(Inventory.contains(strArr38) ? 1 : 0)) {
                                if (lllIIllIIIll(TileObjects.getNearest(tileObject2 -> {
                                    if (lllIIlIIlIll(tileObject2.getName().contains(lIIIIlIlII[lIIIIlllII[283]]) ? 1 : 0) && lllIIllIIIIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1])), lIIIIlllII[15])) {
                                        ?? r0 = lIIIIlllII[0];
                                        "".length();
                                        return 0 != 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                                    }
                                    return lIIIIlllII[1];
                                }))) {
                                    WorldPoint worldPoint7 = new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1]);
                                    if (lllIIlIllIll(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[142]];
                                        Movement.walkTo(worldPoint7);
                                        "".length();
                                        Time.sleepTicks(lIIIIlllII[0]);
                                        "".length();
                                    }
                                    if (lllIIlIIlIll(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[143]];
                                        String[] strArr39 = new String[lIIIIlllII[0]];
                                        strArr39[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[144]];
                                        Item first4 = Inventory.getFirst(strArr39);
                                        String[] strArr40 = new String[lIIIIlllII[0]];
                                        strArr40[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[145]];
                                        first4.useOn(Inventory.getFirst(strArr40));
                                        Time.sleepTicks(lIIIIlllII[11]);
                                        "".length();
                                    }
                                }
                                if (lllIIlIlllIl(TileObjects.getNearest(tileObject3 -> {
                                    if (lllIIlIIlIll(tileObject3.getName().contains(lIIIIlIlII[lIIIIlllII[282]]) ? 1 : 0) && lllIIllIIIIl(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[140], lIIIIlllII[141], lIIIIlllII[1])), lIIIIlllII[15])) {
                                        ?? r0 = lIIIIlllII[0];
                                        "".length();
                                        return (-" ".length()) > 0 ? ((88 ^ 63) ^ (31 ^ 38)) & (((((81 + 218) - 124) + 70) ^ (((63 + 119) - 135) + 124)) ^ (-" ".length())) & ((((((125 + 62) - 97) + 89) ^ (((132 + 41) - 80) + 54)) & (((196 ^ 142) ^ (91 ^ 49)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIIlllII[1];
                                }))) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[146]];
                                    String[] strArr41 = new String[lIIIIlllII[0]];
                                    strArr41[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[147]];
                                    Item first5 = Inventory.getFirst(strArr41);
                                    String[] strArr42 = new String[lIIIIlllII[0]];
                                    strArr42[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[148]];
                                    first5.useOn(TileObjects.getNearest(strArr42));
                                    Time.sleepTicks(lIIIIlllII[9]);
                                    "".length();
                                }
                            }
                        }
                        int[] iArr33 = new int[lIIIIlllII[0]];
                        iArr33[lIIIIlllII[1]] = lIIIIlllII[135];
                        if (lllIIlIIlIll(Inventory.contains(iArr33) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[149]];
                            int[] iArr34 = new int[lIIIIlllII[0]];
                            iArr34[lIIIIlllII[1]] = lIIIIlllII[135];
                            Item first6 = Inventory.getFirst(iArr34);
                            int[] iArr35 = new int[lIIIIlllII[0]];
                            iArr35[lIIIIlllII[1]] = lIIIIlllII[28];
                            first6.useOn(Inventory.getFirst(iArr35));
                            Time.sleepTicks(lIIIIlllII[7]);
                            "".length();
                        }
                    }
                    int[] iArr36 = new int[lIIIIlllII[0]];
                    iArr36[lIIIIlllII[1]] = lIIIIlllII[134];
                    if (lllIIlIIlIll(Inventory.contains(iArr36) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[150]];
                        int[] iArr37 = new int[lIIIIlllII[0]];
                        iArr37[lIIIIlllII[1]] = lIIIIlllII[134];
                        Item first7 = Inventory.getFirst(iArr37);
                        int[] iArr38 = new int[lIIIIlllII[0]];
                        iArr38[lIIIIlllII[1]] = lIIIIlllII[30];
                        first7.useOn(Inventory.getFirst(iArr38));
                        Time.sleepTicks(lIIIIlllII[7]);
                        "".length();
                    }
                }
                int[] iArr39 = new int[lIIIIlllII[0]];
                iArr39[lIIIIlllII[1]] = lIIIIlllII[151];
                if (lllIIlIIlIll(Inventory.contains(iArr39) ? 1 : 0)) {
                    String[] strArr43 = new String[lIIIIlllII[0]];
                    strArr43[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[152]];
                    if (lllIIllIIIll(NPCs.getNearest(strArr43))) {
                        L.cp();
                    }
                    String[] strArr44 = new String[lIIIIlllII[0]];
                    strArr44[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[153]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr44))) {
                        C0006g.a(lIIIIlIlII[lIIIIlllII[154]], cG);
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[123])) {
                String[] strArr45 = new String[lIIIIlllII[0]];
                strArr45[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[155]];
                if (lllIIlIlllIl(NPCs.getNearest(strArr45))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[156]];
                    String[] strArr46 = new String[lIIIIlllII[0]];
                    strArr46[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[157]];
                    TileObjects.getNearest(strArr46).interact(lIIIIlIlII[lIIIIlllII[158]]);
                    Time.sleepTicks(lIIIIlllII[10]);
                    "".length();
                }
                String[] strArr47 = new String[lIIIIlllII[0]];
                strArr47[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[159]];
                if (lllIIllIIIll(NPCs.getNearest(strArr47))) {
                    if (lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            WorldPoint worldPoint8 = new WorldPoint(lIIIIlllII[51], lIIIIlllII[101], lIIIIlllII[7]);
                            if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[160]];
                                Movement.walkTo(worldPoint8);
                                "".length();
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[161]];
                                String[] strArr48 = new String[lIIIIlllII[0]];
                                strArr48[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[162]];
                                TileObjects.getNearest(strArr48).interact(lIIIIlIlII[lIIIIlllII[163]]);
                                Time.sleepTicks(lIIIIlllII[10]);
                                "".length();
                            }
                        }
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject4 -> {
                                if (lllIIlIIlIll(tileObject4.getName().contains(lIIIIlIlII[lIIIIlllII[280]]) ? 1 : 0)) {
                                    String[] strArr49 = new String[lIIIIlllII[0]];
                                    strArr49[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[281]];
                                    if (lllIIlIIlIll(tileObject4.hasAction(strArr49) ? 1 : 0)) {
                                        ?? r0 = lIIIIlllII[0];
                                        "".length();
                                        return "   ".length() == ((86 ^ 99) ^ (125 ^ 76)) ? ((((152 + 175) - 178) + 32) ^ (((130 + 27) - 54) + 40)) & (((61 ^ 9) ^ (13 ^ 3)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lIIIIlllII[1];
                            });
                            if (lllIIlIlllIl(nearest3)) {
                                if (lllIIlIllIll(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[164]];
                                    Movement.walkTo(nearest3.getWorldLocation());
                                    "".length();
                                    Time.sleepTicks(lIIIIlllII[0]);
                                    "".length();
                                }
                                if (lllIIlIIlIll(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                    nearest3.interact(lIIIIlIlII[lIIIIlllII[165]]);
                                    Time.sleepTicks(lIIIIlllII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (lllIIlIlllll(lllIIlIIlIlI(C0004e.w(), 100.0d))) {
                                int[] iArr40 = new int[lIIIIlllII[0]];
                                iArr40[lIIIIlllII[1]] = lIIIIlllII[35];
                                if (lllIIlIIlIll(Inventory.contains(iArr40) ? 1 : 0)) {
                                    String[] strArr49 = new String[lIIIIlllII[0]];
                                    strArr49[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[166]];
                                    Inventory.getFirst(strArr49).interact(lIIIIlIlII[lIIIIlllII[167]]);
                                    Time.sleepTicks(lIIIIlllII[0]);
                                    "".length();
                                }
                            }
                            if (lllIIllIIlII(Prayers.getPoints(), Skills.getLevel(Skill.PRAYER)) && lllIIlIIlIll(Inventory.contains(item17 -> {
                                return item17.getName().contains(lIIIIlIlII[lIIIIlllII[279]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item18 -> {
                                    return item18.getName().contains(lIIIIlIlII[lIIIIlllII[278]]);
                                }).interact(lIIIIlIlII[lIIIIlllII[168]]);
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            WorldPoint worldPoint9 = new WorldPoint(lIIIIlllII[111], lIIIIlllII[112], lIIIIlllII[1]);
                            if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[169]];
                                Movement.walkTo(worldPoint9);
                                "".length();
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lIIIIlllII[15])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[170]];
                                String[] strArr50 = new String[lIIIIlllII[0]];
                                strArr50[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[171]];
                                TileObjects.getNearest(strArr50).interact(lIIIIlIlII[lIIIIlllII[172]]);
                                Time.sleepTicks(lIIIIlllII[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[124])) {
                if (lllIIlIIlIll(new WorldArea(lIIIIlllII[173], lIIIIlllII[174], lIIIIlllII[72], lIIIIlllII[47], lIIIIlllII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint10 = new WorldPoint(lIIIIlllII[175], lIIIIlllII[176], lIIIIlllII[1]);
                    if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint10), lIIIIlllII[11])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[177]];
                        Movement.walkTo(worldPoint10);
                        "".length();
                        Time.sleepTicks(lIIIIlllII[0]);
                        "".length();
                    }
                    if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint10), lIIIIlllII[11])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[178]];
                        String[] strArr51 = new String[lIIIIlllII[0]];
                        strArr51[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[179]];
                        TileObjects.getNearest(strArr51).interact(lIIIIlIlII[lIIIIlllII[180]]);
                        Time.sleepTicks(lIIIIlllII[9]);
                        "".length();
                    }
                }
                if (lllIIlIIlIll(new WorldArea(lIIIIlllII[181], lIIIIlllII[182], lIIIIlllII[53], lIIIIlllII[42], lIIIIlllII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject5 -> {
                        if (lllIIlIIlIll(tileObject5.getName().contains(lIIIIlIlII[lIIIIlllII[276]]) ? 1 : 0)) {
                            String[] strArr52 = new String[lIIIIlllII[0]];
                            strArr52[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[277]];
                            if (lllIIlIIlIll(tileObject5.hasAction(strArr52) ? 1 : 0)) {
                                ?? r0 = lIIIIlllII[0];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lIIIIlllII[1];
                    });
                    if (lllIIlIlllIl(nearest4)) {
                        if (lllIIlIllIll(Reachable.isInteractable(nearest4) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[183]];
                            Movement.walkTo(nearest4.getWorldLocation());
                            "".length();
                            Time.sleepTicks(lIIIIlllII[0]);
                            "".length();
                        }
                        if (lllIIlIIlIll(Reachable.isInteractable(nearest4) ? 1 : 0)) {
                            nearest4.interact(lIIIIlIlII[lIIIIlllII[184]]);
                            Time.sleepTicks(lIIIIlllII[7]);
                            "".length();
                        }
                    }
                }
                if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[185]];
                    String[] strArr52 = new String[lIIIIlllII[0]];
                    strArr52[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[186]];
                    TileObjects.getNearest(strArr52).interact(lIIIIlIlII[lIIIIlllII[187]]);
                    Time.sleepTicks(lIIIIlllII[10]);
                    "".length();
                }
                if (lllIIlIllIll(L.cq() ? 1 : 0)) {
                    String[] strArr53 = new String[lIIIIlllII[0]];
                    strArr53[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[188]];
                    if (lllIIllIIIll(NPCs.getNearest(strArr53))) {
                        WorldArea worldArea2 = new WorldArea(lIIIIlllII[66], lIIIIlllII[67], lIIIIlllII[44], lIIIIlllII[43], lIIIIlllII[1]);
                        if (lllIIlIIlIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[189]];
                            Movement.walkTo(new WorldPoint(lIIIIlllII[69], lIIIIlllII[70], lIIIIlllII[1]));
                            "".length();
                            Time.sleepTicks(lIIIIlllII[0]);
                            "".length();
                        }
                        if (lllIIlIllIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            L.cp();
                        }
                    }
                    String[] strArr54 = new String[lIIIIlllII[0]];
                    strArr54[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[190]];
                    if (lllIIlIlllIl(NPCs.getNearest(strArr54))) {
                        C0006g.a(lIIIIlIlII[lIIIIlllII[191]], cG);
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[125])) {
                String[] strArr55 = new String[lIIIIlllII[0]];
                strArr55[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[192]];
                if (lllIIlIlllIl(NPCs.getNearest(strArr55))) {
                    AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[193]];
                    String[] strArr56 = new String[lIIIIlllII[0]];
                    strArr56[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[194]];
                    TileObjects.getNearest(strArr56).interact(lIIIIlIlII[lIIIIlllII[195]]);
                    Time.sleepTicks(lIIIIlllII[9]);
                    "".length();
                }
                String[] strArr57 = new String[lIIIIlllII[0]];
                strArr57[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[196]];
                if (lllIIllIIIll(NPCs.getNearest(strArr57))) {
                    if (lllIIlIllIll(L.cq() ? 1 : 0)) {
                        L.co();
                    }
                    if (lllIIlIIlIll(L.cq() ? 1 : 0)) {
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[7])) {
                            WorldPoint worldPoint11 = new WorldPoint(lIIIIlllII[51], lIIIIlllII[52], lIIIIlllII[7]);
                            if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint11), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[197]];
                                Movement.walkTo(worldPoint11);
                                "".length();
                                Time.sleepTicks(lIIIIlllII[0]);
                                "".length();
                            }
                            if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint11), lIIIIlllII[10])) {
                                AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[198]];
                                String[] strArr58 = new String[lIIIIlllII[0]];
                                strArr58[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[199]];
                                TileObjects.getNearest(strArr58).interact(lIIIIlIlII[lIIIIlllII[200]]);
                                Time.sleepTicks(lIIIIlllII[10]);
                                "".length();
                            }
                        }
                        if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                            C0006g.a(lIIIIlIlII[lIIIIlllII[201]], cG);
                        }
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[128])) {
                int[] iArr41 = new int[lIIIIlllII[0]];
                iArr41[lIIIIlllII[1]] = lIIIIlllII[202];
                if (lllIIlIllIll(Inventory.contains(iArr41) ? 1 : 0)) {
                    if (lllIIlIllIll(dR ? 1 : 0)) {
                        String str4 = lIIIIlIlII[lIIIIlllII[203]];
                        String[] strArr59 = new String[lIIIIlllII[0]];
                        strArr59[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[204]];
                        C0006g.a(str4, strArr59);
                    }
                    if (lllIIlIIlIll(dR ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[205]];
                        TileObject nearest5 = TileObjects.getNearest(tileObject6 -> {
                            if (lllIIllIIIlI(tileObject6.getId(), lIIIIlllII[275]) && lllIIllIIIIl(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                ?? r0 = lIIIIlllII[0];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIIlllII[1];
                        });
                        if (lllIIlIlllIl(nearest5)) {
                            String[] strArr60 = new String[lIIIIlllII[0]];
                            strArr60[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[206]];
                            if (lllIIlIIlIll(nearest5.hasAction(strArr60) ? 1 : 0)) {
                                nearest5.interact(lIIIIlIlII[lIIIIlllII[207]]);
                                Time.sleepTicks(lIIIIlllII[9]);
                                "".length();
                            }
                        }
                        if (lllIIlIlllIl(TileObjects.getNearest(tileObject7 -> {
                            if (lllIIllIIIlI(tileObject7.getId(), lIIIIlllII[272]) && lllIIllIIIIl(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                ?? r0 = lIIIIlllII[0];
                                "".length();
                                return (((((32 + 150) - 177) + 166) ^ (((135 + 10) - 93) + 103)) & (((160 ^ 165) ^ (77 ^ 120)) ^ (-" ".length()))) == (-" ".length()) ? (" ".length() ^ (145 ^ 151)) & (((248 ^ 160) ^ (239 ^ 176)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIlllII[1];
                        }))) {
                            TileObjects.getNearest(tileObject8 -> {
                                if (lllIIllIIIlI(tileObject8.getId(), lIIIIlllII[272]) && lllIIllIIIIl(tileObject8.getWorldLocation().distanceTo(new WorldPoint(lIIIIlllII[273], lIIIIlllII[274], lIIIIlllII[0])), lIIIIlllII[7])) {
                                    ?? r0 = lIIIIlllII[0];
                                    "".length();
                                    return 0 != 0 ? ((94 ^ 79) ^ (82 ^ 68)) & (((((18 + 116) - 42) + 51) ^ (((120 + 109) - 202) + 109)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIlllII[1];
                            }).interact(lIIIIlIlII[lIIIIlllII[208]]);
                            Time.sleepTicks(lIIIIlllII[9]);
                            "".length();
                        }
                    }
                }
                int[] iArr42 = new int[lIIIIlllII[0]];
                iArr42[lIIIIlllII[1]] = lIIIIlllII[202];
                if (lllIIlIIlIll(Inventory.contains(iArr42) ? 1 : 0)) {
                    if (lllIIllIIIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIIlllII[0])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[209]];
                        TileObjects.getNearest(tileObject9 -> {
                            if (lllIIlIIlIll(tileObject9.getName().contains(lIIIIlIlII[lIIIIlllII[270]]) ? 1 : 0)) {
                                String[] strArr61 = new String[lIIIIlllII[0]];
                                strArr61[lIIIIlllII[1]] = lIIIIlIlII[lIIIIlllII[271]];
                                if (lllIIlIIlIll(tileObject9.hasAction(strArr61) ? 1 : 0)) {
                                    ?? r0 = lIIIIlllII[0];
                                    "".length();
                                    return "   ".length() < 0 ? ((((149 + 23) - 112) + 175) ^ (((85 + 9) - (-48)) + 44)) & (((((153 + 53) - 147) + 162) ^ (((123 + 87) - 107) + 37)) ^ (-" ".length())) : r0;
                                }
                            }
                            return lIIIIlllII[1];
                        }).interact(lIIIIlIlII[lIIIIlllII[210]]);
                        Time.sleepTicks(lIIIIlllII[9]);
                        "".length();
                    }
                    if (lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                        bl();
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[139])) {
                int[] iArr43 = new int[lIIIIlllII[0]];
                iArr43[lIIIIlllII[1]] = lIIIIlllII[211];
                if (lllIIlIIllII(Inventory.getAll(iArr43).size(), lIIIIlllII[9]) && lllIIlIllIll(Players.getLocal().getWorldLocation().getPlane())) {
                    bl();
                }
                int[] iArr44 = new int[lIIIIlllII[0]];
                iArr44[lIIIIlllII[1]] = lIIIIlllII[211];
                if (lllIIlIlllII(Inventory.getAll(iArr44).size(), lIIIIlllII[9])) {
                    if (lllIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                        AccBuilderGWD.c = lIIIIlIlII[lIIIIlllII[212]];
                        if (lllIIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dg);
                        "".length();
                        Time.sleepTicks(lIIIIlllII[0]);
                        "".length();
                    }
                    if (lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                        if (lllIIlIIllII(dk, lIIIIlllII[0])) {
                            as.nH += lIIIIlllII[0];
                            as.u(AccBuilderGWD.m);
                            dk += lIIIIlllII[0];
                            as.nH = lIIIIlllII[1];
                        }
                        C0006g.a(lIIIIlIlII[lIIIIlllII[213]], cG, lIIIIlllII[0]);
                    }
                }
            }
            if (lllIIllIIIlI(C0004e.j(dL), lIIIIlllII[152]) && lllIIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIlllII[15])) {
                int[] iArr45 = new int[lIIIIlllII[0]];
                iArr45[lIIIIlllII[1]] = lIIIIlllII[22];
                if (lllIIlIIlIll(Inventory.contains(iArr45) ? 1 : 0)) {
                    int[] iArr46 = new int[lIIIIlllII[0]];
                    iArr46[lIIIIlllII[1]] = lIIIIlllII[22];
                    Inventory.getFirst(iArr46).interact(lIIIIlIlII[lIIIIlllII[214]]);
                    Time.sleepTicks(lIIIIlllII[13]);
                    "".length();
                }
            }
        }
    }

    private static boolean lllIIllIIIII(int i, int i2) {
        return i > i2;
    }
}
