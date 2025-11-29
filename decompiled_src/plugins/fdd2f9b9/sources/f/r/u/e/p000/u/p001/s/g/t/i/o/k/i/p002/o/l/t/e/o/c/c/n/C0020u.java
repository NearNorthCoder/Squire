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
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.u  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/u.class */
public class C0020u implements G {
    public static /* synthetic */ boolean cX;
    public static final /* synthetic */ WorldPoint cU;
    public static final /* synthetic */ WorldPoint cW;
    public static /* synthetic */ int cY;
    public static final /* synthetic */ WorldPoint cS;
    public static final /* synthetic */ WorldPoint cP;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint cQ;
    static /* synthetic */ String[] bR;
    public static final /* synthetic */ WorldPoint cR;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIIllIlIIl;
    static /* synthetic */ int ck;
    private static /* synthetic */ String[] lIIllIIIIl;
    static /* synthetic */ ArrayList<Integer> da;
    public static final /* synthetic */ WorldPoint cT;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint cV;
    public static /* synthetic */ int cZ;

    private static boolean lIIIIIlIlIIIl(int i) {
        return i > 0;
    }

    private static void aQ() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIIIIlIlIIII(nearest) && lIIIIIlIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[138]];
            C0000a.a(nearest);
        }
        if (lIIIIIlIlIIII(nearest) && lIIIIIlIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIllIlIIl[4]);
                "".length();
            }
            if (lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[139]];
                if (lIIIIIlIlIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIllIlIIl[6]);
                    "".length();
                }
                C0000a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                C0000a.a(lIIllIlIIl[8], lIIllIlIIl[0]);
                C0000a.a(lIIllIlIIl[11], lIIllIlIIl[0]);
                C0000a.a(lIIllIlIIl[12], lIIllIlIIl[3]);
                C0000a.a(lIIllIlIIl[9], lIIllIlIIl[41]);
            }
        }
    }

    private static boolean lIIIIIlIlIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aR() {
        String[] strArr = new String[lIIllIlIIl[0]];
        strArr[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[140]];
        if (lIIIIIlIlIIIl(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIllIlIIl[0]];
            iArr[lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (lIIIIIlIlIIIl(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIIllIlIIl[0]];
                iArr2[lIIllIlIIl[1]] = lIIllIlIIl[11];
                if (lIIIIIlIlIIIl(Inventory.getCount(iArr2))) {
                    int[] iArr3 = new int[lIIllIlIIl[0]];
                    iArr3[lIIllIlIIl[1]] = lIIllIlIIl[7];
                    if (lIIIIIlIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIIllIlIIl[0];
                        "".length();
                        return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIIllIlIIl[1];
    }

    private static boolean lIIIIIlIIllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIIIlIIIll(String lllllllllllllllllllllIllIlIlIIII, String lllllllllllllllllllllIllIlIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIllIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllIllIlIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllIllIlIlIIlI.init(lIIllIlIIl[5], secretKeySpec);
            return new String(lllllllllllllllllllllIllIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIllIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIllIlIlIIIl) {
            lllllllllllllllllllllIllIlIlIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIllIlIIl[1];
    }

    private static void aN() {
        da.add(Integer.valueOf(lIIllIlIIl[120]));
        "".length();
        da.add(Integer.valueOf(lIIllIlIIl[121]));
        "".length();
        da.add(Integer.valueOf(lIIllIlIIl[122]));
        "".length();
        da.add(Integer.valueOf(lIIllIlIIl[123]));
        "".length();
        da.add(Integer.valueOf(lIIllIlIIl[124]));
        "".length();
        da.add(Integer.valueOf(lIIllIlIIl[125]));
        "".length();
        da.add(Integer.valueOf(lIIllIlIIl[126]));
        "".length();
        while (lIIIIIlIIlllI(da.isEmpty() ? 1 : 0) && lIIIIIlIIlllI(da.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[lIIllIlIIl[0]];
            strArr[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[127]];
            if (lIIIIIlIIllII(Inventory.contains(strArr) ? 1 : 0)) {
                "".length();
                if ((true ^ true) != (true ^ true)) {
                    return;
                }
                return;
            }
            int[] iArr = new int[lIIllIlIIl[0]];
            iArr[lIIllIlIIl[1]] = da.get(lIIllIlIIl[1]).intValue();
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIIIIlIlIIII(nearest)) {
                String[] strArr2 = new String[lIIllIlIIl[0]];
                strArr2[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[128]];
                if (lIIIIIlIIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIllIlIIl[0]];
                    strArr3[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[129]];
                    Inventory.getFirst(strArr3).useOn(nearest);
                    Time.sleepTicks(lIIllIlIIl[3]);
                    "".length();
                }
            }
            String[] strArr4 = new String[lIIllIlIIl[0]];
            strArr4[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[130]];
            if (lIIIIIlIIlllI(Inventory.contains(strArr4) ? 1 : 0)) {
                da.remove(lIIllIlIIl[1]);
                "".length();
                Time.sleepTicks(lIIllIlIIl[5]);
                "".length();
            }
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
    }

    private static String lIIIIIIlIIIlI(String lllllllllllllllllllllIllIlllIlIl, String lllllllllllllllllllllIllIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllllllllIllIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIllIlllIlII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIl[18]), "DES");
            Cipher lllllllllllllllllllllIllIlllIlll = Cipher.getInstance("DES");
            lllllllllllllllllllllIllIlllIlll.init(lIIllIlIIl[5], lllllllllllllllllllllIllIllllIII);
            return new String(lllllllllllllllllllllIllIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIllIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIllIlllIllI) {
            lllllllllllllllllllllIllIlllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIlIlIl(Object obj) {
        return obj == null;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            aM();
            "".length();
            if (" ".length() >= (5 ^ 1)) {
                return (185 ^ 160) & ((33 ^ 56) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIllIlIIl[117];
    }

    private static boolean lIIIIIlIlIllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIIllIlIIl[0]];
        strArr[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[141]];
        if (lIIIIIlIlIIIl(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIllIlIIl[0]];
            iArr[lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (lIIIIIlIlIIIl(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIIllIlIIl[0]];
                iArr2[lIIllIlIIl[1]] = lIIllIlIIl[7];
                if (lIIIIIlIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIllIlIIl[0]];
                    iArr3[lIIllIlIIl[1]] = lIIllIlIIl[9];
                    if (lIIIIIlIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIIllIlIIl[0];
                        "".length();
                        return 0 != 0 ? ((((125 + 162) - 222) + 100) ^ (((145 + 136) - 184) + 56)) & (((86 ^ 42) ^ (203 ^ 139)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lIIllIlIIl[1];
    }

    private static void lIIIIIlIIlIlI() {
        lIIllIlIIl = new int[186];
        lIIllIlIIl[0] = " ".length();
        lIIllIlIIl[1] = (195 ^ 197) & ((86 ^ 80) ^ (-1));
        lIIllIlIIl[2] = (((236 + 96) - 80) + 1) ^ (((69 + 81) - 4) + 4);
        lIIllIlIIl[3] = (78 ^ 50) ^ (45 ^ 84);
        lIIllIlIIl[4] = (-1094) & 6093;
        lIIllIlIIl[5] = "  ".length();
        lIIllIlIIl[6] = (92 ^ 72) ^ (94 ^ 78);
        lIIllIlIIl[7] = (-" ".length()) & (-16569) & 24575;
        lIIllIlIIl[8] = (-(29 ^ 94)) & (-2073) & 4063;
        lIIllIlIIl[9] = (-(188 ^ 168)) & (-8393) & 16347;
        lIIllIlIIl[10] = "   ".length();
        lIIllIlIIl[11] = (-((-13401) & 15967)) & (-17577) & 32767;
        lIIllIlIIl[12] = (-1157) & 1535;
        lIIllIlIIl[13] = 187 ^ 177;
        lIIllIlIIl[14] = (-12417) & 13747;
        lIIllIlIIl[15] = (164 ^ 186) ^ (133 ^ 169);
        lIIllIlIIl[16] = 97 ^ 103;
        lIIllIlIIl[17] = (((27 + 13) - (-9)) + 116) ^ (((104 + 26) - 56) + 88);
        lIIllIlIIl[18] = (233 ^ 195) ^ (7 ^ 37);
        lIIllIlIIl[19] = (179 ^ 156) ^ (10 ^ 44);
        lIIllIlIIl[20] = (((127 + 116) - 167) + 61) ^ (((71 + 21) - 49) + 87);
        lIIllIlIIl[21] = 168 ^ 164;
        lIIllIlIIl[22] = (111 ^ 5) ^ (248 ^ 159);
        lIIllIlIIl[23] = 200 ^ 198;
        lIIllIlIIl[24] = 56 ^ 55;
        lIIllIlIIl[25] = (-((-18783) & 31743)) & (-19) & 16383;
        lIIllIlIIl[26] = (-((-187) & 17151)) & (-12290) & 32759;
        lIIllIlIIl[27] = (59 ^ 30) ^ (96 ^ 85);
        lIIllIlIIl[28] = (((131 + 163) - 140) + 55) ^ (((11 + 66) - (-23)) + 92);
        lIIllIlIIl[29] = 65 ^ 83;
        lIIllIlIIl[30] = (242 ^ 168) ^ (12 ^ 69);
        lIIllIlIIl[31] = (26 ^ 110) ^ (97 ^ 1);
        lIIllIlIIl[32] = 129 ^ 148;
        lIIllIlIIl[33] = (((166 + 112) - 226) + 122) ^ (((70 + 19) - (-43)) + 52);
        lIIllIlIIl[34] = (((57 + 143) - 130) + 103) ^ (((27 + 81) - 98) + 176);
        lIIllIlIIl[35] = (233 ^ 156) ^ (52 ^ 89);
        lIIllIlIIl[36] = (93 ^ 13) ^ (230 ^ 175);
        lIIllIlIIl[37] = 168 ^ 178;
        lIIllIlIIl[38] = (28 ^ 88) ^ (107 ^ 52);
        lIIllIlIIl[39] = (41 ^ 9) ^ (67 ^ 127);
        lIIllIlIIl[40] = 34 ^ 63;
        lIIllIlIIl[41] = (60 ^ 35) ^ " ".length();
        lIIllIlIIl[42] = 161 ^ 190;
        lIIllIlIIl[43] = (((105 + 167) - 183) + 84) ^ (((133 + 76) - 174) + 106);
        lIIllIlIIl[44] = 163 ^ 130;
        lIIllIlIIl[45] = (161 ^ 194) ^ (60 ^ 125);
        lIIllIlIIl[46] = (((25 + 47) - 21) + 79) ^ (((115 + 109) - 80) + 17);
        lIIllIlIIl[47] = 100 ^ 64;
        lIIllIlIIl[48] = (167 ^ 173) ^ (93 ^ 114);
        lIIllIlIIl[49] = (41 ^ 120) ^ (232 ^ 159);
        lIIllIlIIl[50] = (177 ^ 133) ^ (52 ^ 39);
        lIIllIlIIl[51] = (((140 + 32) - 49) + 21) ^ (((0 + 61) - (-53)) + 70);
        lIIllIlIIl[52] = 51 ^ 26;
        lIIllIlIIl[53] = 183 ^ 157;
        lIIllIlIIl[54] = (-25121) & 28606;
        lIIllIlIIl[55] = (143 ^ 130) ^ (167 ^ 129);
        lIIllIlIIl[56] = (((82 + 74) - 84) + 56) ^ (((145 + 129) - 269) + 167);
        lIIllIlIIl[57] = (172 ^ 155) ^ (178 ^ 168);
        lIIllIlIIl[58] = (212 ^ 166) ^ (100 ^ 56);
        lIIllIlIIl[59] = 29 ^ 50;
        lIIllIlIIl[60] = (((41 + 111) - 94) + 87) ^ (((93 + 8) - 45) + 105);
        lIIllIlIIl[61] = 178 ^ 131;
        lIIllIlIIl[62] = 74 ^ 121;
        lIIllIlIIl[63] = 163 ^ 151;
        lIIllIlIIl[64] = 164 ^ 145;
        lIIllIlIIl[65] = (-24577) & 28061;
        lIIllIlIIl[66] = 51 ^ 5;
        lIIllIlIIl[67] = 243 ^ 196;
        lIIllIlIIl[68] = (98 ^ 79) ^ (29 ^ 8);
        lIIllIlIIl[69] = (75 ^ 113) ^ "   ".length();
        lIIllIlIIl[70] = 10 ^ 48;
        lIIllIlIIl[71] = 156 ^ 167;
        lIIllIlIIl[72] = 36 ^ 24;
        lIIllIlIIl[73] = 59 ^ 6;
        lIIllIlIIl[74] = (((165 + 82) - 132) + 60) ^ (((70 + 100) - 80) + 55);
        lIIllIlIIl[75] = 130 ^ 189;
        lIIllIlIIl[76] = (104 ^ 64) ^ (252 ^ 148);
        lIIllIlIIl[77] = 4 ^ 69;
        lIIllIlIIl[78] = (185 ^ 193) ^ (126 ^ 68);
        lIIllIlIIl[79] = (241 ^ 175) ^ (27 ^ 6);
        lIIllIlIIl[80] = 233 ^ 173;
        lIIllIlIIl[81] = 75 ^ 14;
        lIIllIlIIl[82] = (88 ^ 113) ^ (37 ^ 74);
        lIIllIlIIl[83] = 135 ^ 192;
        lIIllIlIIl[84] = 35 ^ 107;
        lIIllIlIIl[85] = (130 ^ 150) ^ (50 ^ 111);
        lIIllIlIIl[86] = (153 ^ 130) ^ (215 ^ 134);
        lIIllIlIIl[87] = (115 ^ 1) ^ (32 ^ 25);
        lIIllIlIIl[88] = 69 ^ 9;
        lIIllIlIIl[89] = (((82 + 78) - 49) + 84) ^ (((130 + 141) - 131) + 2);
        lIIllIlIIl[90] = (((10 + 21) - (-23)) + 164) ^ (((58 + 25) - (-57)) + 8);
        lIIllIlIIl[91] = (((196 + 137) - 222) + 142) ^ (((56 + 21) - 22) + 123);
        lIIllIlIIl[92] = (116 ^ 40) ^ (49 ^ 61);
        lIIllIlIIl[93] = (-29217) & 32615;
        lIIllIlIIl[94] = (-((-12887) & 31583)) & (-97) & 28671;
        lIIllIlIIl[95] = (-4227) & 7614;
        lIIllIlIIl[96] = (-((-7685) & 24110)) & (-8209) & 28095;
        lIIllIlIIl[97] = (-8272) & 11775;
        lIIllIlIIl[98] = (199 ^ 166) ^ (165 ^ 149);
        lIIllIlIIl[99] = (((158 + 176) - 306) + 169) ^ (((0 + 144) - 74) + 81);
        lIIllIlIIl[100] = 251 ^ 168;
        lIIllIlIIl[101] = (212 ^ 159) ^ (146 ^ 141);
        lIIllIlIIl[102] = 125 ^ 40;
        lIIllIlIIl[103] = (198 ^ 184) ^ (147 ^ 187);
        lIIllIlIIl[104] = (166 ^ 145) ^ (112 ^ 16);
        lIIllIlIIl[105] = (((30 + 73) - 97) + 187) ^ (((19 + 49) - (-71)) + 14);
        lIIllIlIIl[106] = " ".length() ^ (49 ^ 105);
        lIIllIlIIl[107] = 214 ^ 140;
        lIIllIlIIl[108] = (69 ^ 109) ^ (108 ^ 31);
        lIIllIlIIl[109] = 95 ^ 3;
        lIIllIlIIl[110] = (((95 + 73) - 71) + 116) ^ (((86 + 39) - 108) + 119);
        lIIllIlIIl[111] = 56 ^ 102;
        lIIllIlIIl[112] = 53 ^ 106;
        lIIllIlIIl[113] = 79 ^ 47;
        lIIllIlIIl[114] = (243 ^ 155) ^ (127 ^ 118);
        lIIllIlIIl[115] = " ".length() ^ (119 ^ 20);
        lIIllIlIIl[116] = 20 ^ 119;
        lIIllIlIIl[117] = (130 ^ 141) ^ (197 ^ 174);
        lIIllIlIIl[118] = (((((132 + 60) - 158) + 104) + (65 ^ 113)) - (156 ^ 185)) + (190 ^ 186);
        lIIllIlIIl[119] = 122 ^ 31;
        lIIllIlIIl[120] = (-515) & 4010;
        lIIllIlIIl[121] = (-12353) & 15850;
        lIIllIlIIl[122] = (-16961) & 20455;
        lIIllIlIIl[123] = (-((-4129) & 28727)) & (-4673) & 32767;
        lIIllIlIIl[124] = (-((-8353) & 25322)) & (-4097) & 24559;
        lIIllIlIIl[125] = (-12357) & 15855;
        lIIllIlIIl[126] = (-25155) & 28647;
        lIIllIlIIl[127] = 11 ^ 109;
        lIIllIlIIl[128] = (((151 + 200) - 350) + 203) ^ (((20 + 21) - (-45)) + 85);
        lIIllIlIIl[129] = (38 ^ 13) ^ (207 ^ 140);
        lIIllIlIIl[130] = (240 ^ 192) ^ (251 ^ 162);
        lIIllIlIIl[131] = (190 ^ 184) ^ (105 ^ 5);
        lIIllIlIIl[132] = (125 ^ 20) ^ (172 ^ 169);
        lIIllIlIIl[133] = 83 ^ 62;
        lIIllIlIIl[134] = 79 ^ 33;
        lIIllIlIIl[135] = 95 ^ 48;
        lIIllIlIIl[136] = 255 ^ 143;
        lIIllIlIIl[137] = 39 ^ 86;
        lIIllIlIIl[138] = 118 ^ 4;
        lIIllIlIIl[139] = 4 ^ 119;
        lIIllIlIIl[140] = 23 ^ 99;
        lIIllIlIIl[141] = (((65 + 96) - (-1)) + 18) ^ (((158 + 21) - 173) + 187);
        lIIllIlIIl[142] = (-((-3561) & 24062)) & (-195) & 29695;
        lIIllIlIIl[143] = (-((-22714) & 31483)) & (-1027) & 10095;
        lIIllIlIIl[144] = (-((-9545) & 13673)) & (-16657) & 32764;
        lIIllIlIIl[145] = (-4677) & 29676;
        lIIllIlIIl[146] = (-((-18113) & 22226)) & (-9281) & 14293;
        lIIllIlIIl[147] = 98 ^ 20;
        lIIllIlIIl[148] = (222 ^ 141) ^ (23 ^ 51);
        lIIllIlIIl[149] = (-17001) & 20222;
        lIIllIlIIl[150] = (-((-18821) & 31727)) & (-5) & 16383;
        lIIllIlIIl[151] = (-((-779) & 9131)) & (-17) & 11775;
        lIIllIlIIl[152] = (-8211) & 11699;
        lIIllIlIIl[153] = (-20497) & 30398;
        lIIllIlIIl[154] = (-33) & 8045;
        lIIllIlIIl[155] = (-673) & 7094;
        lIIllIlIIl[156] = (-((-19153) & 31481)) & (-129) & 15871;
        lIIllIlIIl[157] = (-((-3364) & 28591)) & (-4129) & 32767;
        lIIllIlIIl[158] = (-25115) & 28602;
        lIIllIlIIl[159] = (-12834) & 16255;
        lIIllIlIIl[160] = (-4097) & 13983;
        lIIllIlIIl[161] = (-((-17585) & 22203)) & (-6) & 8063;
        lIIllIlIIl[162] = (-25) & 9919;
        lIIllIlIIl[163] = (-12369) & 12670;
        lIIllIlIIl[164] = (-14541) & 14847;
        lIIllIlIIl[165] = (224 ^ 165) ^ (95 ^ 98);
        lIIllIlIIl[166] = (((128 + 191) - 164) + 48) ^ (((82 + 17) - 97) + 176);
        lIIllIlIIl[167] = (69 ^ 121) ^ (207 ^ 137);
        lIIllIlIIl[168] = 199 ^ 188;
        lIIllIlIIl[169] = 253 ^ 129;
        lIIllIlIIl[170] = (((143 + 170) - 154) + 30) ^ (((175 + 140) - 300) + 177);
        lIIllIlIIl[171] = 52 ^ 74;
        lIIllIlIIl[172] = (((163 ^ 139) + (168 ^ 174)) - (-(94 ^ 87))) + (30 ^ 86);
        lIIllIlIIl[173] = (((215 ^ 189) + (75 ^ 37)) - (((16 + 108) - 93) + 180)) + (223 ^ 164);
        lIIllIlIIl[174] = (((88 ^ 50) + (((52 + 28) - 36) + 84)) - (((98 + 78) - 129) + 114)) + (30 ^ 38);
        lIIllIlIIl[175] = (((11 ^ 67) + (56 ^ 72)) - (((17 + 17) - (-87)) + 19)) + (22 ^ 64);
        lIIllIlIIl[176] = (((107 ^ 102) + (164 ^ 179)) - (48 ^ 32)) + (232 ^ 135);
        lIIllIlIIl[177] = ((31 + 29) - (-30)) + 42;
        lIIllIlIIl[178] = (((57 ^ 41) + (76 ^ 127)) - (160 ^ 164)) + (81 ^ 23);
        lIIllIlIIl[179] = (((109 ^ 103) + (3 ^ 67)) - (78 ^ 75)) + (21 ^ 84);
        lIIllIlIIl[180] = (((70 ^ 72) + (228 ^ 144)) - "   ".length()) + (113 ^ 121);
        lIIllIlIIl[181] = (((81 ^ 13) + (199 ^ 179)) - (7 ^ 111)) + (115 ^ 83);
        lIIllIlIIl[182] = ((134 + 15) - 83) + 71;
        lIIllIlIIl[183] = ((49 + 31) - (-44)) + 14;
        lIIllIlIIl[184] = (((118 ^ 32) + (227 ^ 146)) - (((70 + 156) - 179) + 149)) + ((132 + 122) - 174) + 56;
        lIIllIlIIl[185] = (((63 ^ 8) + (((18 + 93) - 77) + 102)) - (3 ^ 75)) + (111 ^ 122);
    }

    private static boolean lIIIIIlIlIlII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIIlIlIllI(C0004e.j(cY), lIIllIlIIl[72]) && lIIIIIlIlIllI(C0004e.j(cZ), lIIllIlIIl[3])) {
            ?? r0 = lIIllIlIIl[0];
            "".length();
            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIlIIl[1];
    }

    private static void aP() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIIIIlIlIIII(nearest) && lIIIIIlIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[136]];
            C0000a.a(nearest);
        }
        if (lIIIIIlIlIIII(nearest) && lIIIIIlIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIllIlIIl[4]);
                "".length();
            }
            if (lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[137]];
                if (lIIIIIlIlIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIllIlIIl[6]);
                    "".length();
                }
                C0000a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                C0000a.a(lIIllIlIIl[11], lIIllIlIIl[0]);
                C0000a.a(lIIllIlIIl[9], lIIllIlIIl[41]);
            }
        }
    }

    private static boolean lIIIIIlIIllII(int i) {
        return i != 0;
    }

    private static boolean lIIIIIlIlIIll(int i, int i2) {
        return i > i2;
    }

    private static String lIIIIIIlIIIIl(String lllllllllllllllllllllIllIllIIlIl, String lllllllllllllllllllllIllIlIlllll) {
        String lllllllllllllllllllllIllIllIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllllllllIllIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllIllIllIIIll = new StringBuilder();
        char[] lllllllllllllllllllllIllIllIIIlI = lllllllllllllllllllllIllIlIlllll.toCharArray();
        int lllllllllllllllllllllIllIllIIIIl = lIIllIlIIl[1];
        char[] charArray = lllllllllllllllllllllIllIllIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIIllIlIIl[1];
        while (lIIIIIlIIllIl(i, length)) {
            char lllllllllllllllllllllIllIllIIllI = charArray[i];
            lllllllllllllllllllllIllIllIIIll.append((char) (lllllllllllllllllllllIllIllIIllI ^ lllllllllllllllllllllIllIllIIIlI[lllllllllllllllllllllIllIllIIIIl % lllllllllllllllllllllIllIllIIIlI.length]));
            "".length();
            lllllllllllllllllllllIllIllIIIIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllllIllIllIIIll);
    }

    private static int lIIIIIlIIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        lIIIIIlIIlIlI();
        lIIIIIlIIlIIl();
        cP = new WorldPoint(lIIllIlIIl[149], lIIllIlIIl[150], lIIllIlIIl[1]);
        cQ = new WorldPoint(lIIllIlIIl[151], lIIllIlIIl[152], lIIllIlIIl[1]);
        cR = new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[153], lIIllIlIIl[1]);
        cS = new WorldPoint(lIIllIlIIl[154], lIIllIlIIl[155], lIIllIlIIl[1]);
        cT = new WorldPoint(lIIllIlIIl[156], lIIllIlIIl[152], lIIllIlIIl[5]);
        cU = new WorldPoint(lIIllIlIIl[157], lIIllIlIIl[158], lIIllIlIIl[1]);
        cV = new WorldPoint(lIIllIlIIl[159], lIIllIlIIl[160], lIIllIlIIl[1]);
        cW = new WorldPoint(lIIllIlIIl[161], lIIllIlIIl[162], lIIllIlIIl[1]);
        bv = new ArrayList();
        cY = lIIllIlIIl[163];
        cZ = lIIllIlIIl[164];
        String[] strArr = new String[lIIllIlIIl[31]];
        strArr[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[165]];
        strArr[lIIllIlIIl[0]] = lIIllIIIIl[lIIllIlIIl[166]];
        strArr[lIIllIlIIl[5]] = lIIllIIIIl[lIIllIlIIl[167]];
        strArr[lIIllIlIIl[10]] = lIIllIIIIl[lIIllIlIIl[168]];
        strArr[lIIllIlIIl[6]] = lIIllIIIIl[lIIllIlIIl[169]];
        strArr[lIIllIlIIl[3]] = lIIllIIIIl[lIIllIlIIl[170]];
        strArr[lIIllIlIIl[16]] = lIIllIIIIl[lIIllIlIIl[171]];
        strArr[lIIllIlIIl[17]] = lIIllIIIIl[lIIllIlIIl[172]];
        strArr[lIIllIlIIl[18]] = lIIllIIIIl[lIIllIlIIl[173]];
        strArr[lIIllIlIIl[19]] = lIIllIIIIl[lIIllIlIIl[174]];
        strArr[lIIllIlIIl[13]] = lIIllIIIIl[lIIllIlIIl[175]];
        strArr[lIIllIlIIl[20]] = lIIllIIIIl[lIIllIlIIl[176]];
        strArr[lIIllIlIIl[21]] = lIIllIIIIl[lIIllIlIIl[177]];
        strArr[lIIllIlIIl[22]] = lIIllIIIIl[lIIllIlIIl[178]];
        strArr[lIIllIlIIl[23]] = lIIllIIIIl[lIIllIlIIl[179]];
        strArr[lIIllIlIIl[24]] = lIIllIIIIl[lIIllIlIIl[180]];
        strArr[lIIllIlIIl[27]] = lIIllIIIIl[lIIllIlIIl[181]];
        strArr[lIIllIlIIl[28]] = lIIllIIIIl[lIIllIlIIl[182]];
        strArr[lIIllIlIIl[29]] = lIIllIIIIl[lIIllIlIIl[183]];
        strArr[lIIllIlIIl[30]] = lIIllIIIIl[lIIllIlIIl[184]];
        bR = strArr;
        da = new ArrayList<>();
    }

    private static void aO() {
        if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[131]];
            WorldArea worldArea = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
            if (lIIIIIlIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                if (lIIIIIlIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                    "".length();
                    Time.sleepTicks(lIIllIlIIl[0]);
                    "".length();
                }
                if (lIIIIIlIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        Movement.walkTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[0]);
                        "".length();
                    }
                    if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        String[] strArr = new String[lIIllIlIIl[0]];
                        strArr[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[2]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (lIIIIIlIlIIII(nearest)) {
                            String[] strArr2 = new String[lIIllIlIIl[0]];
                            strArr2[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[132]];
                            if (lIIIIIlIIllII(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIIllIIIIl[lIIllIlIIl[133]]);
                                Time.sleepTicks(lIIllIlIIl[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIIllIlIIl[0]];
                            strArr3[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[134]];
                            if (lIIIIIlIIllII(nearest.hasAction(strArr3) ? 1 : 0)) {
                                nearest.interact(lIIllIIIIl[lIIllIlIIl[135]]);
                                Time.sleepTicks(lIIllIlIIl[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIIIIlIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(cW);
                "".length();
                Time.sleepTicks(lIIllIlIIl[0]);
                "".length();
            }
        }
    }

    private static void lIIIIIlIIlIIl() {
        lIIllIIIIl = new String[lIIllIlIIl[185]];
        lIIllIIIIl[lIIllIlIIl[1]] = lIIIIIIlIIIIl("Czs2PgElNzx3EDgrMTkVbTssMh8+fngkBSQmOz8bIzV4NRMuOXgjHW0jLTIBOQ==", "MRXWr");
        lIIllIIIIl[lIIllIlIIl[0]] = lIIIIIIlIIIIl("PyY+aDweZyopJho=", "qGHHH");
        lIIllIIIIl[lIIllIlIIl[5]] = lIIIIIIlIIIlI("dCzvpJzQDMsQ0i57L+b0zAkE45PRs9gk", "NoHag");
        lIIllIIIIl[lIIllIlIIl[10]] = lIIIIIIlIIIlI("0twBKTLpbMjzguYjls+6DZ9bW3wh7BbW7mgrtlH+wkxhBPmtllIjL57Qa86Ft9qLq2rrs6QMZCU=", "WOeNU");
        lIIllIIIIl[lIIllIlIIl[6]] = lIIIIIIlIIIIl("KAQdJSU=", "lvtKN");
        lIIllIIIIl[lIIllIlIIl[3]] = lIIIIIIlIIIll("XfM7MX2OD8Q=", "RPPQs");
        lIIllIIIIl[lIIllIlIIl[16]] = lIIIIIIlIIIll("nY3fHheHdVGtqnopyGovUA==", "KNetS");
        lIIllIIIIl[lIIllIlIIl[17]] = lIIIIIIlIIIlI("NGU+zjAdrzZEZKGzNSwfZA==", "WXkWF");
        lIIllIIIIl[lIIllIlIIl[18]] = lIIIIIIlIIIll("IOF8bBJSw3mm2CPtu8trlg==", "ULlgg");
        lIIllIIIIl[lIIllIlIIl[19]] = lIIIIIIlIIIll("fLJKHMargTJ10K0Rz3QvBGwjdI7RzATx", "jqBWv");
        lIIllIIIIl[lIIllIlIIl[13]] = lIIIIIIlIIIll("TxWCKOqlowQjg6gb6rzoE+P6pysMjGeJ", "LHdir");
        lIIllIIIIl[lIIllIlIIl[20]] = lIIIIIIlIIIIl("AjkHACZuPBoIMQ==", "NXugC");
        lIIllIIIIl[lIIllIlIIl[21]] = lIIIIIIlIIIll("W26a3W4b4V0=", "DikhK");
        lIIllIIIIl[lIIllIlIIl[22]] = lIIIIIIlIIIlI("FjRj6mHyo5qgHHaKj9cFTg==", "JvdlN");
        lIIllIIIIl[lIIllIlIIl[23]] = lIIIIIIlIIIll("uWjXbuK6rsjmE+ga5jKk0g==", "TutjX");
        lIIllIIIIl[lIIllIlIIl[24]] = lIIIIIIlIIIll("GVjekUyr+RvmM9s/qLTW4g==", "KDlmL");
        lIIllIIIIl[lIIllIlIIl[27]] = lIIIIIIlIIIIl("LioCJyUfbygiKAgrBjYn", "zOoWI");
        lIIllIIIIl[lIIllIlIIl[28]] = lIIIIIIlIIIll("qsAzUd26fEYNR6ZQADuVPg==", "SYtHq");
        lIIllIIIIl[lIIllIlIIl[29]] = lIIIIIIlIIIlI("a1GVWHUHRmI=", "DCZfn");
        lIIllIIIIl[lIIllIlIIl[30]] = lIIIIIIlIIIlI("GUCSERp2UPs=", "hFvWf");
        lIIllIIIIl[lIIllIlIIl[31]] = lIIIIIIlIIIlI("pQbKvEUFx1kSeQHcAOOoFQ==", "SywDJ");
        lIIllIIIIl[lIIllIlIIl[32]] = lIIIIIIlIIIIl("Eh4RCyh8FhcRJA==", "QrxfJ");
        lIIllIIIIl[lIIllIlIIl[33]] = lIIIIIIlIIIll("/TWsQNjcw/IOzm5Py/zS2g==", "oeKwt");
        lIIllIIIIl[lIIllIlIIl[34]] = lIIIIIIlIIIIl("OCcqCSA=", "oNOeD");
        lIIllIIIIl[lIIllIlIIl[35]] = lIIIIIIlIIIlI("XsWqVyyFMUTNn6ghguUxZw==", "MILDG");
        lIIllIIIIl[lIIllIlIIl[36]] = lIIIIIIlIIIlI("www2CAEgb0E=", "xGpaw");
        lIIllIIIIl[lIIllIlIIl[37]] = lIIIIIIlIIIll("9dDzU9ZcWa2Ut5VKKkfBzA==", "HpRzn");
        lIIllIIIIl[lIIllIlIIl[38]] = lIIIIIIlIIIll("VfPgpADA+6Y=", "Wmyve");
        lIIllIIIIl[lIIllIlIIl[39]] = lIIIIIIlIIIll("+JAObQv9muMU4mP7XlF6hh+pm2am5vb7", "mnWMT");
        lIIllIIIIl[lIIllIlIIl[40]] = lIIIIIIlIIIll("Z3V1iThBhaQ9FNI4nWExfY3OJfIXJ9Up", "fiJbl");
        lIIllIIIIl[lIIllIlIIl[41]] = lIIIIIIlIIIll("15kxElSsBkXLQXXGXupsrA==", "VilOz");
        lIIllIIIIl[lIIllIlIIl[42]] = lIIIIIIlIIIlI("cM/RNdGscJQ=", "UnZVW");
        lIIllIIIIl[lIIllIlIIl[43]] = lIIIIIIlIIIll("cMf0WDNhDCVc3xVKbOMD6A==", "TBwkW");
        lIIllIIIIl[lIIllIlIIl[44]] = lIIIIIIlIIIll("sh3tD9zJeXlCo5kK0DYUcA==", "SobIp");
        lIIllIIIIl[lIIllIlIIl[45]] = lIIIIIIlIIIIl("OhYmPVIlHiQx", "NwJVr");
        lIIllIIIIl[lIIllIlIIl[46]] = lIIIIIIlIIIIl("Og0mDkIjCykFBg==", "qdHib");
        lIIllIIIIl[lIIllIlIIl[47]] = lIIIIIIlIIIlI("WUks7+hNMdKid2+XhO0lnQ==", "eJcjV");
        lIIllIIIIl[lIIllIlIIl[48]] = lIIIIIIlIIIIl("Ly8EAzEDMgQPLQFhFAksFA==", "fApfC");
        lIIllIIIIl[lIIllIlIIl[49]] = lIIIIIIlIIIlI("IUfGiN6pS0qbn7l1RVmH8g==", "FepOz");
        lIIllIIIIl[lIIllIlIIl[50]] = lIIIIIIlIIIll("d3F11ytCppk=", "EKQrU");
        lIIllIIIIl[lIIllIlIIl[51]] = lIIIIIIlIIIIl("LT02Cw8EcjEKEw==", "jRZoj");
        lIIllIIIIl[lIIllIlIIl[52]] = lIIIIIIlIIIIl("IyI9LWMBNSs=", "jPRCC");
        lIIllIIIIl[lIIllIlIIl[53]] = lIIIIIIlIIIlI("yfm75q/PXVhJyueqc6RuU+5zPy5PGx6s", "lQQKT");
        lIIllIIIIl[lIIllIlIIl[55]] = lIIIIIIlIIIlI("SfZuGV64CNU=", "MTLsN");
        lIIllIIIIl[lIIllIlIIl[56]] = lIIIIIIlIIIlI("1k9wwFlZBIZlRTaOQdaemg==", "itFwe");
        lIIllIIIIl[lIIllIlIIl[57]] = lIIIIIIlIIIIl("IgMl", "gbQDU");
        lIIllIIIIl[lIIllIlIIl[58]] = lIIIIIIlIIIIl("LhsCNQ==", "zziPG");
        lIIllIIIIl[lIIllIlIIl[59]] = lIIIIIIlIIIIl("CQs5KhcgRD4rCw==", "NdUNr");
        lIIllIIIIl[lIIllIlIIl[60]] = lIIIIIIlIIIIl("CxcuYT4qVis1KzEDPTI=", "EvXAJ");
        lIIllIIIIl[lIIllIlIIl[61]] = lIIIIIIlIIIlI("ZIqc7r5DmZjEvgJvcu6JQA==", "fqPNz");
        lIIllIIIIl[lIIllIlIIl[15]] = lIIIIIIlIIIIl("Lic+OVkMMCg=", "gUQWy");
        lIIllIIIIl[lIIllIlIIl[62]] = lIIIIIIlIIIIl("IhQ8PixPFi8hMB0=", "oaNUU");
        lIIllIIIIl[lIIllIlIIl[63]] = lIIIIIIlIIIIl("HhYbEDo3FE8TMi0WHQ==", "YsodS");
        lIIllIIIIl[lIIllIlIIl[64]] = lIIIIIIlIIIIl("EQwAJTMn", "SycNV");
        lIIllIIIIl[lIIllIlIIl[66]] = lIIIIIIlIIIIl("LTQ6G2EPIyw=", "dFUuA");
        lIIllIIIIl[lIIllIlIIl[67]] = lIIIIIIlIIIll("T8ojPH7JTMPmXyqYGkW4YA==", "izxrO");
        lIIllIIIIl[lIIllIlIIl[68]] = lIIIIIIlIIIlI("3Y/7QAJFdt/pg3fsoolyNw==", "JGgXy");
        lIIllIIIIl[lIIllIlIIl[69]] = lIIIIIIlIIIIl("ECI6PQg8PzoxFD5sKjcVKw==", "YLNXz");
        lIIllIIIIl[lIIllIlIIl[70]] = lIIIIIIlIIIIl("DhYfNHAsAQk=", "GdpZP");
        lIIllIIIIl[lIIllIlIIl[71]] = lIIIIIIlIIIlI("zCwGh7UD3O42P5dVclIRyg==", "ikREA");
        lIIllIIIIl[lIIllIlIIl[72]] = lIIIIIIlIIIlI("EInGPu4OQ5A=", "JGUze");
        lIIllIIIIl[lIIllIlIIl[73]] = lIIIIIIlIIIlI("VrQpMNLaKCWUlVnw8j1rEQ==", "rIKwP");
        lIIllIIIIl[lIIllIlIIl[74]] = lIIIIIIlIIIll("tiJ9hbDnFcB80XYf9FrBNg==", "lyAjp");
        lIIllIIIIl[lIIllIlIIl[75]] = lIIIIIIlIIIll("rTY1VD9hvtw=", "ZTkFV");
        lIIllIIIIl[lIIllIlIIl[76]] = lIIIIIIlIIIIl("MxomLjUfGjVrJBMYPg==", "vtRKG");
        lIIllIIIIl[lIIllIlIIl[77]] = lIIIIIIlIIIIl("ABIBHFknGAIC", "Cwmpy");
        lIIllIIIIl[lIIllIlIIl[78]] = lIIIIIIlIIIlI("kmVkfWXf4cg=", "AlAyW");
        lIIllIIIIl[lIIllIlIIl[79]] = lIIIIIIlIIIIl("OisqJykdI28jOwwiPQ==", "xGOTZ");
        lIIllIIIIl[lIIllIlIIl[80]] = lIIIIIIlIIIlI("ay1RADpWh2k=", "DLmjN");
        lIIllIIIIl[lIIllIlIIl[81]] = lIIIIIIlIIIIl("IgM6GTRXBzIDNgVQPBlzFB81EToZ", "wpSwS");
        lIIllIIIIl[lIIllIlIIl[82]] = lIIIIIIlIIIlI("+ezwhIwG0o1kWAblrYELAQ==", "XqHHp");
        lIIllIIIIl[lIIllIlIIl[83]] = lIIIIIIlIIIIl("KxcNNw0ACEQgAQID", "nodCd");
        lIIllIIIIl[lIIllIlIIl[84]] = lIIIIIIlIIIlI("gsPDGLqWhoXWVymuteWfug==", "MQKcH");
        lIIllIIIIl[lIIllIlIIl[85]] = lIIIIIIlIIIIl("CD8pHA==", "GOLrs");
        lIIllIIIIl[lIIllIlIIl[86]] = lIIIIIIlIIIIl("FhsnKhw+", "RiBPy");
        lIIllIIIIl[lIIllIlIIl[87]] = lIIIIIIlIIIIl("OBgeDB4ZFxdIERgYBA==", "pyphr");
        lIIllIIIIl[lIIllIlIIl[88]] = lIIIIIIlIIIll("LTq0S5/e4sE=", "PBmBT");
        lIIllIIIIl[lIIllIlIIl[89]] = lIIIIIIlIIIll("folDSLkAA1v5veJSMUGRuw==", "dihuP");
        lIIllIIIIl[lIIllIlIIl[90]] = lIIIIIIlIIIIl("CB8WG2YvFRUF", "KzzwF");
        lIIllIIIIl[lIIllIlIIl[91]] = lIIIIIIlIIIll("ADRVvmJpbgc=", "YQhVw");
        lIIllIIIIl[lIIllIlIIl[92]] = lIIIIIIlIIIIl("DTglYzYseTUqLCI1czcrLzw=", "CYSCB");
        lIIllIIIIl[lIIllIlIIl[98]] = lIIIIIIlIIIIl("Nh8GMg8NAhU=", "bmgBk");
        lIIllIIIIl[lIIllIlIIl[99]] = lIIIIIIlIIIlI("OSNtUjwj1wA=", "eYSyu");
        lIIllIIIIl[lIIllIlIIl[100]] = lIIIIIIlIIIlI("vw/N0ifPSwc=", "urnYP");
        lIIllIIIIl[lIIllIlIIl[101]] = lIIIIIIlIIIIl("ESAtCg1/KCsQAQ==", "RLDgo");
        lIIllIIIIl[lIIllIlIIl[102]] = lIIIIIIlIIIlI("MkrpEmY13NpHUhyfNPFIyA==", "cbRik");
        lIIllIIIIl[lIIllIlIIl[103]] = lIIIIIIlIIIll("xyU5ytvVmeeEmHxoNrtF9Q==", "CGzxK");
        lIIllIIIIl[lIIllIlIIl[104]] = lIIIIIIlIIIll("BoYJCq6e56A=", "wfRBn");
        lIIllIIIIl[lIIllIlIIl[105]] = lIIIIIIlIIIIl("CCY5PU89IDg9ATs2", "XSKXo");
        lIIllIIIIl[lIIllIlIIl[106]] = lIIIIIIlIIIll("rwgsoZhm6yPVrcwWcrgPqA==", "AyZmh");
        lIIllIIIIl[lIIllIlIIl[107]] = lIIIIIIlIIIIl("JiEhCy4O", "bSDqK");
        lIIllIIIIl[lIIllIlIIl[108]] = lIIIIIIlIIIlI("W0QaJZaVweJT96iQrUDXtQ==", "ElKHs");
        lIIllIIIIl[lIIllIlIIl[109]] = lIIIIIIlIIIll("VBwxkduZ9RJ8aGn4wTPZ8gt2XfA48AqG", "VjuHm");
        lIIllIIIIl[lIIllIlIIl[110]] = lIIIIIIlIIIIl("BhEVE0UzFxQTCzUB", "Vdgve");
        lIIllIIIIl[lIIllIlIIl[111]] = lIIIIIIlIIIIl("KSgRRzAIaQEOKgYlRxMtCyw=", "gIggD");
        lIIllIIIIl[lIIllIlIIl[112]] = lIIIIIIlIIIll("/k0MWbtFSesZPVFWOM5FUw==", "OWgWG");
        lIIllIIIIl[lIIllIlIIl[113]] = lIIIIIIlIIIlI("CHXd7aG9Xl0=", "FUDpq");
        lIIllIIIIl[lIIllIlIIl[114]] = lIIIIIIlIIIlI("d+SfmoAHiGc=", "syeKk");
        lIIllIIIIl[lIIllIlIIl[115]] = lIIIIIIlIIIIl("OzoEADdVMgIaOw==", "xVmmU");
        lIIllIIIIl[lIIllIlIIl[116]] = lIIIIIIlIIIlI("XMSbZr6RoUV8oWQpuJgVww==", "lzPvb");
        lIIllIIIIl[lIIllIlIIl[117]] = lIIIIIIlIIIll("FBTdraiBJVeT+8aFJ2MOgEkk23RDtG6CNNCmHpIFYc4ry3PcwqXvEw==", "JhjZo");
        lIIllIIIIl[lIIllIlIIl[119]] = lIIIIIIlIIIIl("NAQdABAc", "pvxzu");
        lIIllIIIIl[lIIllIlIIl[127]] = lIIIIIIlIIIIl("MygiOk8RPzQ=", "zZMTo");
        lIIllIIIIl[lIIllIlIIl[128]] = lIIIIIIlIIIIl("MyUDPSgaagQ8NA==", "tJoYM");
        lIIllIIIIl[lIIllIlIIl[129]] = lIIIIIIlIIIlI("U9ZDqwFFTLoMrONTcMzw0w==", "RghSk");
        lIIllIIIIl[lIIllIlIIl[130]] = lIIIIIIlIIIll("J4On54+XAKXQM3Qqa8OgiA==", "sVeBE");
        lIIllIIIIl[lIIllIlIIl[131]] = lIIIIIIlIIIIl("NxkHTiMWWBcHORgUURo+FR0=", "yxqnW");
        lIIllIIIIl[lIIllIlIIl[2]] = lIIIIIIlIIIll("qQis1BeC1hToJJNqvCkKZw==", "LWwwc");
        lIIllIIIIl[lIIllIlIIl[132]] = lIIIIIIlIIIIl("HBEcDA==", "Saybg");
        lIIllIIIIl[lIIllIlIIl[133]] = lIIIIIIlIIIll("NbitbS3TA34=", "FTbar");
        lIIllIIIIl[lIIllIlIIl[134]] = lIIIIIIlIIIIl("CQMnDypnCyEVJg==", "JoNbH");
        lIIllIIIIl[lIIllIlIIl[135]] = lIIIIIIlIIIll("ZK/Wn8fQIt+9ljhB3kx8pA==", "AeIGN");
        lIIllIIIIl[lIIllIlIIl[136]] = lIIIIIIlIIIll("7XHotS6SBKX4lrmKMrYurQ==", "nnGRV");
        lIIllIIIIl[lIIllIlIIl[137]] = lIIIIIIlIIIIl("GS8qPAc4ICN4CTAgLzEFNg==", "QNDXk");
        lIIllIIIIl[lIIllIlIIl[138]] = lIIIIIIlIIIIl("Ayo9WCciaykZPSY=", "MKKxS");
        lIIllIIIIl[lIIllIlIIl[139]] = lIIIIIIlIIIlI("/cBLWQ8tvM/Hw6y9MVx8waAC4NHnl+T0", "ptPeR");
        lIIllIIIIl[lIIllIlIIl[140]] = lIIIIIIlIIIlI("4x+2sTLMhh4=", "wMlGy");
        lIIllIIIIl[lIIllIlIIl[141]] = lIIIIIIlIIIlI("ES438GVjITc=", "phIon");
        lIIllIIIIl[lIIllIlIIl[147]] = lIIIIIIlIIIll("kTTRcrtFzzpkNiQ5zGNf+g==", "pfRwu");
        lIIllIIIIl[lIIllIlIIl[148]] = lIIIIIIlIIIlI("u1vP1LH7TgY+wB+a2Upx4yzck86IUtZZ", "TDBTN");
        lIIllIIIIl[lIIllIlIIl[165]] = lIIIIIIlIIIll("zMLlQGJ7BayZDKUhqAa4pHIwOAZRJl1ww78O08HFjwU=", "IJFzT");
        lIIllIIIIl[lIIllIlIIl[166]] = lIIIIIIlIIIlI("im/BrAtSi0A=", "tZqBA");
        lIIllIIIIl[lIIllIlIIl[167]] = lIIIIIIlIIIlI("X4SajD15pzZJIQSEcMqgoso+nOvIqXy+", "YStvm");
        lIIllIIIIl[lIIllIlIIl[168]] = lIIIIIIlIIIlI("mudUuHrXIBwlJhGmC77HMfRVH42/shsPQwoXPqS+FI3Lru+Wky3VLg==", "pYWql");
        lIIllIIIIl[lIIllIlIIl[169]] = lIIIIIIlIIIll("LSxP0FfnRgI=", "ZltBl");
        lIIllIIIIl[lIIllIlIIl[170]] = lIIIIIIlIIIIl("DwoRUQQzRRYfET4RSFYBM0UAGRhxEUo=", "Vedvv");
        lIIllIIIIl[lIIllIlIIl[171]] = lIIIIIIlIIIIl("LzFXAjADMBJWOQg7Ax4xCCVXEzQVJ1cfNhInBRMrEisZEXgSLVcSN0YjBRktCCZXHj0UJ0g=", "fBwvX");
        lIIllIIIIl[lIIllIlIIl[172]] = lIIIIIIlIIIll("la/MG3Wl8NRRwwWwvIJiQLSallGI0BhNuCazn+i4DRmehROIfCK3O/bijs6ieEzy", "htrMq");
        lIIllIIIIl[lIIllIlIIl[173]] = lIIIIIIlIIIIl("ChArZGEaUjQkYTQaeCkvN1U0Jy44VT4nM3MdMSVv", "SuXHA");
        lIIllIIIIl[lIIllIlIIl[174]] = lIIIIIIlIIIIl("HzEWY2YPcwhvNTMmAGE=", "FTeOF");
        lIIllIIIIl[lIIllIlIIl[175]] = lIIIIIIlIIIlI("4pQBqfLcW4frHlW8he+uIg==", "LSuvk");
        lIIllIIIIl[lIIllIlIIl[176]] = lIIIIIIlIIIIl("KSdJUR8OLQsaGEg=", "fLeqk");
        lIIllIIIIl[lIIllIlIIl[177]] = lIIIIIIlIIIlI("zud/0nNvX66uGUp/LoOpmDy0YLZrnKmSfiecDGOGVHo=", "mJaaS");
        lIIllIIIIl[lIIllIlIIl[178]] = lIIIIIIlIIIIl("OCcDVCkRJlQ9ahgtGAR1", "pHttJ");
        lIIllIIIIl[lIIllIlIIl[179]] = lIIIIIIlIIIlI("BOZuNlY8tHaDH31K40eEon3LeuZ2D+DCTK32bjKaChE9ZrD2jx7a4g==", "HIKjt");
        lIIllIIIIl[lIIllIlIIl[180]] = lIIIIIIlIIIIl("FAQ0cjwwTDk6MGMeJCQwMUw+JzYrTCxyMiwDKXIxJgooPDYmUw==", "ClMRU");
        lIIllIIIIl[lIIllIlIIl[181]] = lIIIIIIlIIIIl("Dh0ifxcyUiUxAj8Ge3gSMlIzNwtwBnk=", "WrWXe");
        lIIllIIIIl[lIIllIlIIl[182]] = lIIIIIIlIIIll("EnCyxQcChxpRuwN1MwwFag==", "EoOPm");
        lIIllIIIIl[lIIllIlIIl[183]] = lIIIIIIlIIIll("OsF6Nef1Biway403MfMiz/SjztDVP0THyrgzAapgfiChpRaVaRkYRkgvZQ39IfTJ", "zxSro");
        lIIllIIIIl[lIIllIlIIl[184]] = lIIIIIIlIIIIl("Izw9DktULjkDE1QwIkIOAHVxK0cZOChCBRF5MAALEXklDUccPD0SWA==", "tYQbg");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v797, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v819, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void aM() {
        if (lIIIIIlIIllII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIIIlIIllIl(bv.size(), lIIllIlIIl[0])) {
                System.out.println(lIIllIIIIl[lIIllIlIIl[1]]);
                bt = lIIllIlIIl[1];
            }
        }
        if (lIIIIIlIIlllI(bt ? 1 : 0)) {
            if (lIIIIIlIIllIl(C0004e.j(lIIllIlIIl[2]), lIIllIlIIl[3])) {
                E.ck();
            }
            if (lIIIIIlIIlllI(aR() ? 1 : 0) && lIIIIIlIIllIl(C0004e.j(cY), lIIllIlIIl[0]) && lIIIIIlIIllll(C0004e.j(lIIllIlIIl[2]), lIIllIlIIl[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIIlIlIIII(nearest) && lIIIIIlIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[0]];
                    C0000a.a(nearest);
                }
                if (lIIIIIlIlIIII(nearest) && lIIIIIlIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIllIlIIl[4]);
                        "".length();
                    }
                    if (lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[5]];
                        if (lIIIIIlIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIllIlIIl[6]);
                            "".length();
                        }
                        if (lIIIIIlIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIllIlIIl[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIllIlIIl[3]];
                        iArr[lIIllIlIIl[1]] = lIIllIlIIl[7];
                        iArr[lIIllIlIIl[0]] = lIIllIlIIl[8];
                        iArr[lIIllIlIIl[5]] = lIIllIlIIl[9];
                        iArr[lIIllIlIIl[10]] = lIIllIlIIl[11];
                        iArr[lIIllIlIIl[6]] = lIIllIlIIl[12];
                        if (lIIIIIlIIlllI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIllIIIIl[lIIllIlIIl[10]]);
                            bt = lIIllIlIIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIllIlIIl[3]];
                        iArr2[lIIllIlIIl[1]] = lIIllIlIIl[7];
                        iArr2[lIIllIlIIl[0]] = lIIllIlIIl[8];
                        iArr2[lIIllIlIIl[5]] = lIIllIlIIl[9];
                        iArr2[lIIllIlIIl[10]] = lIIllIlIIl[11];
                        iArr2[lIIllIlIIl[6]] = lIIllIlIIl[12];
                        if (lIIIIIlIIllII(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                            C0000a.a(lIIllIlIIl[14], lIIllIlIIl[0]);
                            C0000a.a(lIIllIlIIl[8], lIIllIlIIl[0]);
                            C0000a.a(lIIllIlIIl[11], lIIllIlIIl[6]);
                            C0000a.a(lIIllIlIIl[12], lIIllIlIIl[13]);
                        }
                    }
                }
            }
            if (lIIIIIlIIllII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIIlIIllIl(Movement.getRunEnergy(), lIIllIlIIl[15])) {
                Inventory.getFirst(C0005f.aV).interact(lIIllIIIIl[lIIllIlIIl[6]]);
                Time.sleepTicks(lIIllIlIIl[0]);
                "".length();
            }
            int[] iArr3 = new int[lIIllIlIIl[0]];
            iArr3[lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (lIIIIIlIIllII(Inventory.contains(iArr3) ? 1 : 0) && lIIIIIlIlIIlI(lIIIIIlIIlIll(C0004e.u(), 60.0d))) {
                int[] iArr4 = new int[lIIllIlIIl[0]];
                iArr4[lIIllIlIIl[1]] = lIIllIlIIl[12];
                Inventory.getFirst(iArr4).interact(lIIllIIIIl[lIIllIlIIl[3]]);
                Time.sleepTicks(lIIllIlIIl[0]);
                "".length();
            }
            if (lIIIIIlIIllIl(C0004e.j(cY), lIIllIlIIl[0]) && lIIIIIlIIllII(aR() ? 1 : 0)) {
                if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[16]];
                    if (lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(cP);
                    "".length();
                    Time.sleepTicks(lIIllIlIIl[0]);
                    "".length();
                }
                if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[17]];
                    C0006g.a(lIIllIIIIl[lIIllIlIIl[18]], bR);
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[0])) {
                if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[19]];
                    Movement.walkTo(cQ);
                    "".length();
                    Time.sleepTicks(lIIllIlIIl[0]);
                    "".length();
                }
                if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[13]];
                    if (lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIIllIlIIl[0]];
                        strArr[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[20]];
                        TileObjects.getNearest(strArr).interact(lIIllIIIIl[lIIllIlIIl[21]]);
                    }
                    C0006g.a(bR);
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[5])) {
                String[] strArr2 = new String[lIIllIlIIl[0]];
                strArr2[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[22]];
                if (lIIIIIlIlIlIl(NPCs.getNearest(strArr2))) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[23]];
                    String[] strArr3 = new String[lIIllIlIIl[0]];
                    strArr3[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[24]];
                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                    if (lIIIIIlIlIIII(nearest2) && lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(nearest2), lIIllIlIIl[6]) && lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(bR);
                    }
                    if (!lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0) || lIIIIIlIlIIll(Players.getLocal().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        Movement.walkTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1]));
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[10]);
                        "".length();
                    }
                }
                if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                    String[] strArr4 = new String[lIIllIlIIl[0]];
                    strArr4[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[27]];
                    if (lIIIIIlIlIlIl(NPCs.getNearest(strArr4))) {
                        String[] strArr5 = new String[lIIllIlIIl[0]];
                        strArr5[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[28]];
                        TileObject nearest3 = TileObjects.getNearest(strArr5);
                        if (lIIIIIlIlIIII(nearest3) && lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[lIIllIlIIl[0]];
                            strArr6[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[29]];
                            if (lIIIIIlIIllII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                nearest3.interact(lIIllIIIIl[lIIllIlIIl[30]]);
                                Time.sleepTicks(lIIllIlIIl[5]);
                                "".length();
                            }
                            String[] strArr7 = new String[lIIllIlIIl[0]];
                            strArr7[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[31]];
                            if (lIIIIIlIIllII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                nearest3.interact(lIIllIIIIl[lIIllIlIIl[32]]);
                                Time.sleepTicks(lIIllIlIIl[5]);
                                "".length();
                            }
                        }
                        C0006g.a(bR);
                    }
                }
                String[] strArr8 = new String[lIIllIlIIl[0]];
                strArr8[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[33]];
                if (lIIIIIlIlIIII(NPCs.getNearest(strArr8))) {
                    int[] iArr5 = new int[lIIllIlIIl[0]];
                    iArr5[lIIllIlIIl[1]] = lIIllIlIIl[14];
                    if (lIIIIIlIIllII(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIllIlIIl[0]];
                        iArr6[lIIllIlIIl[1]] = lIIllIlIIl[14];
                        if (lIIIIIlIIlllI(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[lIIllIlIIl[0]];
                            iArr7[lIIllIlIIl[1]] = lIIllIlIIl[14];
                            Inventory.getFirst(iArr7).interact(lIIllIIIIl[lIIllIlIIl[34]]);
                        }
                    }
                    if (lIIIIIlIlIlIl(Players.getLocal().getInteracting())) {
                        String[] strArr9 = new String[lIIllIlIIl[0]];
                        strArr9[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[35]];
                        NPCs.getNearest(strArr9).interact(lIIllIIIIl[lIIllIlIIl[36]]);
                        Time.sleepTicks(lIIllIlIIl[5]);
                        "".length();
                    }
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[10])) {
                if (lIIIIIlIIlllI(cX ? 1 : 0)) {
                    if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                        String[] strArr10 = new String[lIIllIlIIl[0]];
                        strArr10[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[37]];
                        if (lIIIIIlIlIIII(TileObjects.getNearest(strArr10))) {
                            int[] iArr8 = new int[lIIllIlIIl[0]];
                            iArr8[lIIllIlIIl[1]] = lIIllIlIIl[7];
                            if (lIIIIIlIIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lIIllIlIIl[0]];
                                iArr9[lIIllIlIIl[1]] = lIIllIlIIl[7];
                                Inventory.getFirst(iArr9).interact(lIIllIIIIl[lIIllIlIIl[38]]);
                                Time.sleepTicks(lIIllIlIIl[3]);
                                "".length();
                            }
                        }
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[39]];
                        Movement.walkTo(cQ);
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[0]);
                        "".length();
                    }
                    if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[40]];
                        if (lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr11 = new String[lIIllIlIIl[0]];
                            strArr11[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[41]];
                            TileObjects.getNearest(strArr11).interact(lIIllIIIIl[lIIllIlIIl[42]]);
                        }
                        C0006g.a(bR);
                        if (lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0) && lIIIIIlIIllII(Dialog.getText().contains(lIIllIIIIl[lIIllIlIIl[43]]) ? 1 : 0)) {
                            cX = lIIllIlIIl[0];
                        }
                    }
                }
                if (lIIIIIlIIllII(cX ? 1 : 0)) {
                    if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[44]];
                        Movement.walkTo(cP);
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[0]);
                        "".length();
                    }
                    if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[45]];
                        C0006g.a(lIIllIIIIl[lIIllIlIIl[46]], bR);
                    }
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[6])) {
                ck = lIIllIlIIl[1];
                if (lIIIIIlIIlllI(ab() ? 1 : 0)) {
                    aQ();
                }
                if (lIIIIIlIIllII(ab() ? 1 : 0)) {
                    if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[47]];
                        if (lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(cT);
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[0]);
                        "".length();
                    }
                    if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[48]];
                        if (lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[lIIllIlIIl[0]];
                            strArr12[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[49]];
                            TileObjects.getNearest(strArr12).interact(lIIllIIIIl[lIIllIlIIl[50]]);
                        }
                        C0006g.a(bR);
                    }
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[3])) {
                String[] strArr13 = new String[lIIllIlIIl[0]];
                strArr13[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[51]];
                if (lIIIIIlIIlllI(Inventory.contains(strArr13) ? 1 : 0)) {
                    String[] strArr14 = new String[lIIllIlIIl[0]];
                    strArr14[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[52]];
                    if (lIIIIIlIIlllI(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (!lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), lIIllIlIIl[17]) || lIIIIIlIIllII(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[53]];
                            Movement.walkTo(cU);
                            "".length();
                            Time.sleepTicks(lIIllIlIIl[0]);
                            "".length();
                        }
                        if (!lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cU), lIIllIlIIl[17]) || lIIIIIlIIlllI(Players.getLocal().getWorldLocation().getPlane())) {
                            if (lIIIIIlIlIlIl(Players.getLocal().getInteracting())) {
                                int[] iArr10 = new int[lIIllIlIIl[0]];
                                iArr10[lIIllIlIIl[1]] = lIIllIlIIl[54];
                                NPCs.getNearest(iArr10).interact(lIIllIIIIl[lIIllIlIIl[55]]);
                                Time.sleepTicks(lIIllIlIIl[5]);
                                "".length();
                            }
                            String[] strArr15 = new String[lIIllIlIIl[0]];
                            strArr15[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[56]];
                            TileItem nearest4 = TileItems.getNearest(strArr15);
                            if (lIIIIIlIIllII(Inventory.isFull() ? 1 : 0)) {
                                int[] iArr11 = new int[lIIllIlIIl[0]];
                                iArr11[lIIllIlIIl[1]] = lIIllIlIIl[12];
                                Inventory.getFirst(iArr11).interact(lIIllIIIIl[lIIllIlIIl[57]]);
                                Time.sleepTicks(lIIllIlIIl[0]);
                                "".length();
                            }
                            if (lIIIIIlIlIIII(nearest4)) {
                                nearest4.interact(lIIllIIIIl[lIIllIlIIl[58]]);
                                Time.sleepTicks(lIIllIlIIl[5]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr16 = new String[lIIllIlIIl[0]];
                strArr16[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[59]];
                if (lIIIIIlIIllII(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIIllIlIIl[13])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[60]];
                        Movement.walkTo(cV);
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[0]);
                        "".length();
                    }
                    if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cV), lIIllIlIIl[13])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[61]];
                        aN();
                    }
                }
                String[] strArr17 = new String[lIIllIlIIl[0]];
                strArr17[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[15]];
                if (lIIIIIlIIllII(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[lIIllIlIIl[0]];
                    strArr18[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[62]];
                    if (lIIIIIlIIlllI(Inventory.contains(strArr18) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[63]];
                        String[] strArr19 = new String[lIIllIlIIl[0]];
                        strArr19[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[64]];
                        Item first = Inventory.getFirst(strArr19);
                        int[] iArr12 = new int[lIIllIlIIl[0]];
                        iArr12[lIIllIlIIl[1]] = lIIllIlIIl[65];
                        first.useOn(TileObjects.getNearest(iArr12));
                        Time.sleepTicks(lIIllIlIIl[6]);
                        "".length();
                    }
                }
                String[] strArr20 = new String[lIIllIlIIl[0]];
                strArr20[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[66]];
                if (lIIIIIlIIllII(Inventory.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lIIllIlIIl[0]];
                    strArr21[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[67]];
                    if (lIIIIIlIIllII(Inventory.contains(strArr21) ? 1 : 0)) {
                        if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[68]];
                            if (lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(cT);
                            "".length();
                            Time.sleepTicks(lIIllIlIIl[0]);
                            "".length();
                        }
                        if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[69]];
                            String[] strArr22 = new String[lIIllIlIIl[0]];
                            strArr22[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[70]];
                            Item first2 = Inventory.getFirst(strArr22);
                            String[] strArr23 = new String[lIIllIlIIl[0]];
                            strArr23[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[71]];
                            first2.useOn(TileObjects.getNearest(strArr23));
                            Time.sleepTicks(lIIllIlIIl[10]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[16])) {
                String[] strArr24 = new String[lIIllIlIIl[0]];
                strArr24[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[72]];
                NPC nearest5 = NPCs.getNearest(strArr24);
                String[] strArr25 = new String[lIIllIlIIl[0]];
                strArr25[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[73]];
                if (lIIIIIlIIlllI(Inventory.contains(strArr25) ? 1 : 0) && lIIIIIlIlIIII(nearest5)) {
                    if (lIIIIIlIIllII(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[74]];
                        C0006g.a(lIIllIIIIl[lIIllIlIIl[75]], bR);
                    }
                    if (lIIIIIlIIlllI(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[76]];
                        String[] strArr26 = new String[lIIllIlIIl[0]];
                        strArr26[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[77]];
                        TileObjects.getNearest(strArr26).interact(lIIllIIIIl[lIIllIlIIl[78]]);
                        Time.sleepTicks(lIIllIlIIl[5]);
                        "".length();
                    }
                }
                String[] strArr27 = new String[lIIllIlIIl[0]];
                strArr27[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[79]];
                if (lIIIIIlIIllII(Inventory.contains(strArr27) ? 1 : 0)) {
                    String[] strArr28 = new String[lIIllIlIIl[0]];
                    strArr28[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[80]];
                    TileObject nearest6 = TileObjects.getNearest(strArr28);
                    if (lIIIIIlIlIIII(nearest6)) {
                        if (lIIIIIlIIllII(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[81]];
                            String[] strArr29 = new String[lIIllIlIIl[0]];
                            strArr29[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[82]];
                            Inventory.getFirst(strArr29).useOn(nearest6);
                            Time.sleepTicks(lIIllIlIIl[5]);
                            "".length();
                        }
                        if (lIIIIIlIIlllI(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[83]];
                            String[] strArr30 = new String[lIIllIlIIl[0]];
                            strArr30[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[84]];
                            TileObjects.getNearest(strArr30).interact(lIIllIIIIl[lIIllIlIIl[85]]);
                            Time.sleepTicks(lIIllIlIIl[5]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[17])) {
                String[] strArr31 = new String[lIIllIlIIl[0]];
                strArr31[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[86]];
                NPC nearest7 = NPCs.getNearest(strArr31);
                if (lIIIIIlIlIIII(nearest7)) {
                    if (lIIIIIlIIllII(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[87]];
                        C0006g.a(lIIllIIIIl[lIIllIlIIl[88]], bR);
                    }
                    if (lIIIIIlIIlllI(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[89]];
                        String[] strArr32 = new String[lIIllIlIIl[0]];
                        strArr32[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[90]];
                        TileObjects.getNearest(strArr32).interact(lIIllIIIIl[lIIllIlIIl[91]]);
                        Time.sleepTicks(lIIllIlIIl[5]);
                        "".length();
                    }
                }
            }
            if (lIIIIIlIIllll(C0004e.j(cY), lIIllIlIIl[18])) {
                if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[92]];
                    WorldArea worldArea = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
                    if (lIIIIIlIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                        if (lIIIIIlIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                            "".length();
                            Time.sleepTicks(lIIllIlIIl[0]);
                            "".length();
                        }
                        if (lIIIIIlIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                Movement.walkTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                                "".length();
                                Time.sleepTicks(lIIllIlIIl[0]);
                                "".length();
                            }
                            if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                String[] strArr33 = new String[lIIllIlIIl[0]];
                                strArr33[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[98]];
                                TileObject nearest8 = TileObjects.getNearest(strArr33);
                                if (lIIIIIlIlIIII(nearest8)) {
                                    String[] strArr34 = new String[lIIllIlIIl[0]];
                                    strArr34[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[99]];
                                    if (lIIIIIlIIllII(nearest8.hasAction(strArr34) ? 1 : 0)) {
                                        nearest8.interact(lIIllIIIIl[lIIllIlIIl[100]]);
                                        Time.sleepTicks(lIIllIlIIl[10]);
                                        "".length();
                                    }
                                    String[] strArr35 = new String[lIIllIlIIl[0]];
                                    strArr35[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[101]];
                                    if (lIIIIIlIIllII(nearest8.hasAction(strArr35) ? 1 : 0)) {
                                        nearest8.interact(lIIllIIIIl[lIIllIlIIl[102]]);
                                        Time.sleepTicks(lIIllIlIIl[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIIIIIlIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(cW);
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[0]);
                        "".length();
                    }
                }
                if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[103]];
                    C0006g.a(lIIllIIIIl[lIIllIlIIl[104]], bR);
                }
            }
            if (lIIIIIlIlIllI(C0004e.j(cY), lIIllIlIIl[13]) && lIIIIIlIIllIl(C0004e.j(cY), lIIllIlIIl[72])) {
                if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    String[] strArr36 = new String[lIIllIlIIl[0]];
                    strArr36[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[105]];
                    if (lIIIIIlIIllII(Inventory.contains(strArr36) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[106]];
                        if (lIIIIIlIIllIl(ck, lIIllIlIIl[0])) {
                            U.kv += lIIllIlIIl[0];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllIlIIl[0];
                            U.kv = lIIllIlIIl[1];
                            cl = lIIllIlIIl[1];
                        }
                        C0006g.a(lIIllIIIIl[lIIllIlIIl[107]], bR);
                    }
                }
                String[] strArr37 = new String[lIIllIlIIl[0]];
                strArr37[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[108]];
                if (lIIIIIlIIlllI(Inventory.contains(strArr37) ? 1 : 0) && lIIIIIlIIllIl(C0004e.j(cY), lIIllIlIIl[72])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[109]];
                    aP();
                }
                String[] strArr38 = new String[lIIllIlIIl[0]];
                strArr38[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[110]];
                if (lIIIIIlIIllII(Inventory.contains(strArr38) ? 1 : 0) && lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3]) && lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[111]];
                    WorldArea worldArea3 = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
                    if (lIIIIIlIIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea4 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                        if (lIIIIIlIIlllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                            "".length();
                            Time.sleepTicks(lIIllIlIIl[0]);
                            "".length();
                        }
                        if (lIIIIIlIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                Movement.walkTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                                "".length();
                                Time.sleepTicks(lIIllIlIIl[0]);
                                "".length();
                            }
                            if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                String[] strArr39 = new String[lIIllIlIIl[0]];
                                strArr39[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[112]];
                                TileObject nearest9 = TileObjects.getNearest(strArr39);
                                if (lIIIIIlIlIIII(nearest9)) {
                                    String[] strArr40 = new String[lIIllIlIIl[0]];
                                    strArr40[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[113]];
                                    if (lIIIIIlIIllII(nearest9.hasAction(strArr40) ? 1 : 0)) {
                                        nearest9.interact(lIIllIIIIl[lIIllIlIIl[114]]);
                                        Time.sleepTicks(lIIllIlIIl[10]);
                                        "".length();
                                    }
                                    String[] strArr41 = new String[lIIllIlIIl[0]];
                                    strArr41[lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[115]];
                                    if (lIIIIIlIIllII(nearest9.hasAction(strArr41) ? 1 : 0)) {
                                        nearest9.interact(lIIllIIIIl[lIIllIlIIl[116]]);
                                        Time.sleepTicks(lIIllIlIIl[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIIIIIlIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(cW);
                        "".length();
                        Time.sleepTicks(lIIllIlIIl[0]);
                        "".length();
                    }
                }
            }
            if (lIIIIIlIlIllI(C0004e.j(cY), lIIllIlIIl[72]) && lIIIIIlIIllIl(C0004e.j(cZ), lIIllIlIIl[3])) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[117]];
                if (lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    aO();
                }
                if (lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    if (lIIIIIlIlIIII(Widgets.get(lIIllIlIIl[118], lIIllIlIIl[27]))) {
                        Mouse.click(Widgets.get(lIIllIlIIl[118], lIIllIlIIl[27]).getClickPoint().getX(), Widgets.get(lIIllIlIIl[118], lIIllIlIIl[27]).getClickPoint().getY(), (boolean) lIIllIlIIl[0]);
                        Time.sleepTicks(lIIllIlIIl[10]);
                        "".length();
                    }
                    C0006g.a(lIIllIIIIl[lIIllIlIIl[119]], bR);
                    C0006g.a(bR);
                }
            }
            C0006g.a(bR);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0172, code lost:
        if (lIIIIIlIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0020u.lIIllIlIIl[15]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIllIlIIl[0]];
        iArr2[lIIllIlIIl[1]] = lIIllIlIIl[14];
        if (lIIIIIlIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlIIl[14], lIIllIlIIl[0], lIIllIlIIl[142]));
            "".length();
        }
        int[] iArr3 = new int[lIIllIlIIl[0]];
        iArr3[lIIllIlIIl[1]] = lIIllIlIIl[8];
        if (lIIIIIlIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlIIl[8], lIIllIlIIl[0], lIIllIlIIl[142]));
            "".length();
        }
        int[] iArr4 = new int[lIIllIlIIl[0]];
        iArr4[lIIllIlIIl[1]] = lIIllIlIIl[11];
        if (lIIIIIlIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlIIl[11], lIIllIlIIl[3], C0008i.bq));
            "".length();
        }
        int[] iArr5 = new int[lIIllIlIIl[0]];
        iArr5[lIIllIlIIl[1]] = lIIllIlIIl[12];
        if (lIIIIIlIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIlIIl[12], lIIllIlIIl[41], lIIllIlIIl[143]));
            "".length();
        }
        int[] iArr6 = new int[lIIllIlIIl[0]];
        iArr6[lIIllIlIIl[1]] = lIIllIlIIl[9];
        if (lIIIIIlIIllII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIllIlIIl[0]];
            iArr7[lIIllIlIIl[1]] = lIIllIlIIl[9];
            if (lIIIIIlIIllII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIllIlIIl[0]];
                iArr8[lIIllIlIIl[1]] = lIIllIlIIl[9];
            }
            if (lIIIIIlIIlllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIllIIIIl[lIIllIlIIl[148]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIllIlIIl[144], lIIllIlIIl[3], lIIllIlIIl[145]));
                "".length();
            }
            iArr = new int[lIIllIlIIl[0]];
            iArr[lIIllIlIIl[1]] = lIIllIlIIl[7];
            if (lIIIIIlIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bv.add(new C0003d(lIIllIlIIl[7], lIIllIlIIl[51], lIIllIlIIl[146]));
            "".length();
            return;
        }
        bv.add(new C0003d(lIIllIlIIl[9], lIIllIlIIl[15], lIIllIlIIl[107]));
        "".length();
        if (lIIIIIlIIlllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIllIIIIl[lIIllIlIIl[148]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIllIlIIl[0]];
        iArr[lIIllIlIIl[1]] = lIIllIlIIl[7];
        if (lIIIIIlIIlllI(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static boolean lIIIIIlIIllll(int i, int i2) {
        return i == i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIllIIIIl[lIIllIlIIl[147]];
    }

    private static boolean lIIIIIlIlIIlI(int i) {
        return i < 0;
    }

    private static boolean lIIIIIlIIlllI(int i) {
        return i == 0;
    }
}
