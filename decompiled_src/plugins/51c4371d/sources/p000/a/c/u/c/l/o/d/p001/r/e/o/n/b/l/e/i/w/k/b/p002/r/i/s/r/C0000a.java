package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/a.class */
public class C0000a {
    public static final /* synthetic */ WorldArea F;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea x;
    static /* synthetic */ WorldPoint I;
    private static /* synthetic */ int[] llIlIIlI;
    public static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea E;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldPoint y;
    private static /* synthetic */ String[] llIlIIII;

    static {
        lIlIllIllII();
        lIlIllIlIll();
        x = new WorldArea(llIlIIlI[40], llIlIIlI[41], llIlIIlI[42], llIlIIlI[43], llIlIIlI[2]);
        y = new WorldPoint(llIlIIlI[44], llIlIIlI[45], llIlIIlI[2]);
        z = new WorldArea(llIlIIlI[46], llIlIIlI[47], llIlIIlI[48], llIlIIlI[48], llIlIIlI[2]);
        A = new WorldArea(llIlIIlI[49], llIlIIlI[50], llIlIIlI[51], llIlIIlI[52], llIlIIlI[2]);
        B = new WorldArea(llIlIIlI[53], llIlIIlI[54], llIlIIlI[38], llIlIIlI[11], llIlIIlI[2]);
        C = new WorldArea(llIlIIlI[55], llIlIIlI[56], llIlIIlI[57], llIlIIlI[58], llIlIIlI[2]);
        D = new WorldArea(llIlIIlI[59], llIlIIlI[60], llIlIIlI[61], llIlIIlI[62], llIlIIlI[2]);
        E = new WorldArea(llIlIIlI[63], llIlIIlI[64], llIlIIlI[35], llIlIIlI[36], llIlIIlI[2]);
        F = new WorldArea(llIlIIlI[7], llIlIIlI[65], llIlIIlI[66], llIlIIlI[67], llIlIIlI[2]);
        G = new WorldPoint(llIlIIlI[68], llIlIIlI[69], llIlIIlI[2]);
        H = new WorldPoint(llIlIIlI[70], llIlIIlI[71], llIlIIlI[2]);
        I = new WorldPoint(llIlIIlI[72], llIlIIlI[73], llIlIIlI[1]);
    }

    private static String lIlIllIIIIl(String lIlIIlllIlllIll, String lIlIIlllIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), llIlIIlI[29]), "DES");
            Cipher lIlIIlllIllllIl = Cipher.getInstance("DES");
            lIlIIlllIllllIl.init(llIlIIlI[14], secretKeySpec);
            return new String(lIlIIlllIllllIl.doFinal(Base64.getDecoder().decode(lIlIIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlllIllllII) {
            lIlIIlllIllllII.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllII() {
        llIlIIlI = new int[74];
        llIlIIlI[0] = (-20831) & 23006;
        llIlIIlI[1] = " ".length();
        llIlIIlI[2] = (106 ^ 93) & ((178 ^ 133) ^ (-1));
        llIlIIlI[3] = (-1547) & 3998;
        llIlIIlI[4] = (-((-16779) & 25487)) & (-19459) & 32639;
        llIlIIlI[5] = (-28708) & 31659;
        llIlIIlI[6] = (-((-7183) & 32047)) & (-2049) & 32685;
        llIlIIlI[7] = (-((-799) & 29599)) & (-1025) & 32764;
        llIlIIlI[8] = (-2050) & 7809;
        llIlIIlI[9] = 131 ^ 152;
        llIlIIlI[10] = (77 ^ 47) ^ (115 ^ 13);
        llIlIIlI[11] = 121 ^ 109;
        llIlIIlI[12] = -" ".length();
        llIlIIlI[13] = (((158 + 93) - 176) + 107) ^ (((63 + 145) - 169) + 137);
        llIlIIlI[14] = "  ".length();
        llIlIIlI[15] = "   ".length();
        llIlIIlI[16] = (((130 + 72) - 171) + 135) ^ (((39 + 108) - 21) + 16);
        llIlIIlI[17] = (-13573) & 16180;
        llIlIIlI[18] = (-12825) & 16216;
        llIlIIlI[19] = 83 ^ 86;
        llIlIIlI[20] = (-16577) & 19140;
        llIlIIlI[21] = (-12419) & 15278;
        llIlIIlI[22] = 91 ^ 80;
        llIlIIlI[23] = (240 ^ 173) ^ (60 ^ 107);
        llIlIIlI[24] = 87 ^ 83;
        llIlIIlI[25] = (-((-2343) & 22967)) & (-33) & 23807;
        llIlIIlI[26] = (-8195) & 12115;
        llIlIIlI[27] = (11 ^ 34) ^ (50 ^ 28);
        llIlIIlI[28] = 154 ^ 132;
        llIlIIlI[29] = 30 ^ 22;
        llIlIIlI[30] = (-12314) & 16313;
        llIlIIlI[31] = 203 ^ 194;
        llIlIIlI[32] = (((24 + 28) - (-49)) + 76) ^ (((63 + 141) - 141) + 126);
        llIlIIlI[33] = (73 ^ 125) ^ (79 ^ 118);
        llIlIIlI[34] = (171 ^ 151) ^ (16 ^ 34);
        llIlIIlI[35] = (96 ^ 0) ^ (30 ^ 113);
        llIlIIlI[36] = (9 ^ 0) ^ (9 ^ 16);
        llIlIIlI[37] = 145 ^ 128;
        llIlIIlI[38] = 209 ^ 195;
        llIlIIlI[39] = (85 ^ 78) ^ (69 ^ 77);
        llIlIIlI[40] = (-((-7491) & 32211)) & (-4353) & 32215;
        llIlIIlI[41] = (-((-1041) & 26175)) & (-4097) & 32703;
        llIlIIlI[42] = 150 ^ 191;
        llIlIIlI[43] = 130 ^ 165;
        llIlIIlI[44] = (-20780) & 23983;
        llIlIIlI[45] = (-((-779) & 13259)) & (-17) & 15861;
        llIlIIlI[46] = (-8193) & 11099;
        llIlIIlI[47] = (-20741) & 23950;
        llIlIIlI[48] = (((168 + 23) - (-48)) + 13) ^ (((148 + 128) - 205) + 78);
        llIlIIlI[49] = (-((-2613) & 31415)) & (-2) & 31999;
        llIlIIlI[50] = (-((-2114) & 22731)) & (-17) & 23999;
        llIlIIlI[51] = 119 ^ 84;
        llIlIIlI[52] = (109 ^ 97) ^ (58 ^ 12);
        llIlIIlI[53] = (-((-18597) & 27311)) & (-16385) & 28223;
        llIlIIlI[54] = (-((-6727) & 31455)) & (-4421) & 32767;
        llIlIIlI[55] = (-8322) & 11935;
        llIlIIlI[56] = (-((-19505) & 23606)) & (-33) & 7551;
        llIlIIlI[57] = (((205 + 94) - 209) + 164) ^ (((73 + 24) - 45) + 110);
        llIlIIlI[58] = (121 ^ 42) ^ (230 ^ 144);
        llIlIIlI[59] = (-((-21153) & 29669)) & (-20481) & 32126;
        llIlIIlI[60] = (-8705) & 12145;
        llIlIIlI[61] = (68 ^ 25) ^ (64 ^ 44);
        llIlIIlI[62] = (42 ^ 74) ^ (97 ^ 69);
        llIlIIlI[63] = (-((-2641) & 6865)) & (-26913) & 32766;
        llIlIIlI[64] = (-((-20243) & 32671)) & (-17) & 16380;
        llIlIIlI[65] = (-28675) & 31983;
        llIlIIlI[66] = (((38 + 88) - (-12)) + 9) ^ (((126 + 127) - 225) + 162);
        llIlIIlI[67] = (4 ^ 52) ^ (186 ^ 174);
        llIlIIlI[68] = (-((-2971) & 28667)) & (-4097) & 32767;
        llIlIIlI[69] = (-((-15365) & 32517)) & (-12354) & 32747;
        llIlIIlI[70] = (-22790) & 24511;
        llIlIIlI[71] = (-113) & 3577;
        llIlIIlI[72] = (-((-19044) & 28279)) & (-1) & 12279;
        llIlIIlI[73] = (-3219) & 8191;
    }

    private static boolean lIlIlllIIIl(Object obj) {
        return obj != null;
    }

    private static void lIlIllIlIll() {
        llIlIIII = new String[llIlIIlI[11]];
        llIlIIII[llIlIIlI[2]] = lIlIllIIIIl("Q/Jv8rOO7mQ=", "iaHcs");
        llIlIIII[llIlIIlI[1]] = lIlIllIIIlI("p0WBIXoqXO0=", "iJbFw");
        llIlIIII[llIlIIlI[14]] = lIlIllIIIIl("TT8wRR1LOXA=", "zzzBV");
        llIlIIII[llIlIIlI[15]] = lIlIllIIIIl("KNpn7skXgs0=", "tdKej");
        llIlIIII[llIlIIlI[24]] = lIlIllIIIIl("dfS7XscwUIc=", "TbznX");
        llIlIIII[llIlIIlI[19]] = lIlIllIIIlI("vOAl4h4QYU0=", "QQXdv");
        llIlIIII[llIlIIlI[13]] = lIlIllIlIlI("PTsBOg==", "mNmVq");
        llIlIIII[llIlIIlI[27]] = lIlIllIIIlI("ltcpN2kjkmkjzjuBHRp6YHysi3GydgSj", "rhcYU");
        llIlIIII[llIlIIlI[29]] = lIlIllIlIlI("Ngw0Mw==", "tmZXn");
        llIlIIII[llIlIIlI[31]] = lIlIllIIIIl("04foYbHtcfmcSNNeCu8fyQ==", "gKChG");
        llIlIIII[llIlIIlI[23]] = lIlIllIIIlI("WqvK8WQbdnk=", "zMxin");
        llIlIIII[llIlIIlI[22]] = lIlIllIIIIl("yGnyPh5Mqyk=", "raMSE");
        llIlIIII[llIlIIlI[32]] = lIlIllIIIIl("M5UCgBSZ5e0=", "xMilD");
        llIlIIII[llIlIIlI[33]] = lIlIllIIIlI("ujSZwzkLj3E=", "oiRRR");
        llIlIIII[llIlIIlI[34]] = lIlIllIIIlI("vchjIWJARYnXfn/bpv+01A==", "Lkkqk");
        llIlIIII[llIlIIlI[35]] = lIlIllIIIlI("nWNNmixRZvo=", "OrQIK");
        llIlIIII[llIlIIlI[36]] = lIlIllIIIIl("5i4Hk0UqBZQXldbBYS7Pfw==", "wcrZl");
        llIlIIII[llIlIIlI[37]] = lIlIllIlIlI("Hj8iJzQFKDo=", "jZNBD");
        llIlIIII[llIlIIlI[38]] = lIlIllIIIlI("sf0x94WXehijEMNdboinqQ==", "Zzegd");
        llIlIIII[llIlIIlI[39]] = lIlIllIIIIl("VAE586YFxrwze/Vv/naw1Q==", "jACUS");
    }

    public static void a(BankLocation bankLocation) {
        if (lIlIllIllIl(Vars.getBit(llIlIIlI[0]), llIlIIlI[1]) && lIlIllIlllI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[llIlIIlI[1]];
            strArr[llIlIIlI[2]] = llIlIIII[llIlIIlI[2]];
            C0006g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(llIlIIlI[3], llIlIIlI[4], llIlIIlI[2]);
        WorldPoint worldPoint2 = new WorldPoint(llIlIIlI[5], llIlIIlI[6], llIlIIlI[2]);
        WorldArea worldArea = new WorldArea(llIlIIlI[7], llIlIIlI[8], llIlIIlI[9], llIlIIlI[10], llIlIIlI[2]);
        if ((!lIlIllIllll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIlIIlI[11]) || lIlIllIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIllIlllI(Inventory.contains(item -> {
            return item.getName().contains(llIlIIII[llIlIIlI[39]]);
        }) ? 1 : 0) && lIlIllIllIl(Players.getLocal().getAnimation(), llIlIIlI[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(llIlIIII[llIlIIlI[38]]);
            }).interact(llIlIIII[llIlIIlI[1]]);
            Time.sleepTicks(llIlIIlI[13]);
            "".length();
        }
        if (lIlIllIlllI(Inventory.contains(C0005f.bl) ? 1 : 0) && lIlIllIllll(Equipment.contains(C0005f.bl) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bl).interact(llIlIIII[llIlIIlI[14]]);
            Time.sleepTicks(llIlIIlI[14]);
            "".length();
        }
        if (lIlIllIlllI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIlIllIllll(Equipment.contains(C0005f.aU) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aU).interact(llIlIIII[llIlIIlI[15]]);
            Time.sleepTicks(llIlIIlI[14]);
            "".length();
        }
        if (!lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(y), llIlIIlI[11]) || lIlIllIlllI(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(llIlIIlI[14]);
            "".length();
            "".length();
            if ((107 ^ 110) <= 0) {
            }
        } else if (!lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(G), llIlIIlI[16]) || !lIlIllIllll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIllIlllI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(llIlIIlI[14]);
            "".length();
            "".length();
            if ("   ".length() <= 0) {
            }
        } else if (lIlIllIlllI(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(llIlIIlI[14]);
            "".length();
            "".length();
            if ((132 ^ 129) <= 0) {
            }
        } else if (lIlIllIlllI(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0001b.J);
            "".length();
            Time.sleepTicks(llIlIIlI[14]);
            "".length();
            "".length();
            if (((((110 + 42) - 20) + 47) ^ (((158 + 69) - 160) + 116)) < "   ".length()) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(llIlIIlI[17], llIlIIlI[18], llIlIIlI[13], llIlIIlI[19], llIlIIlI[2]);
            WorldArea worldArea3 = new WorldArea(llIlIIlI[20], llIlIIlI[21], llIlIIlI[22], llIlIIlI[23], llIlIIlI[2]);
            if ((!lIlIllIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIllIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIllIlllI(Inventory.contains(item3 -> {
                return item3.getName().contains(llIlIIII[llIlIIlI[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(llIlIIII[llIlIIlI[36]]);
                }).interact(llIlIIII[llIlIIlI[24]]);
                Time.sleepTicks(llIlIIlI[24]);
                "".length();
            }
            if (lIlIllIlllI(new WorldArea(llIlIIlI[25], llIlIIlI[26], llIlIIlI[27], llIlIIlI[13], llIlIIlI[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[llIlIIlI[1]];
                strArr2[llIlIIlI[2]] = llIlIIII[llIlIIlI[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lIlIlllIIIl(nearest)) {
                    nearest.interact(llIlIIII[llIlIIlI[13]]);
                    Time.sleepTicks(llIlIIlI[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(llIlIIlI[14]);
            "".length();
        }
    }

    private static String lIlIllIIIlI(String lIlIIlllllIIIII, String lIlIIllllIlllll) {
        try {
            SecretKeySpec lIlIIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlllllIIIlI = Cipher.getInstance("Blowfish");
            lIlIIlllllIIIlI.init(llIlIIlI[14], lIlIIlllllIIIll);
            return new String(lIlIIlllllIIIlI.doFinal(Base64.getDecoder().decode(lIlIIlllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlllllIIIIl) {
            lIlIIlllllIIIIl.printStackTrace();
            return null;
        }
    }

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(llIlIIlI[1]);
        "".length();
    }

    public static void b(int[] iArr, int lIlIIlllllIllIl) {
        int i = llIlIIlI[2];
        while (lIlIlllIIll(i, iArr.length)) {
            Bank.withdraw(iArr[i], lIlIIlllllIllIl, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIlI[1]);
            "".length();
            int[] iArr2 = new int[llIlIIlI[1]];
            iArr2[llIlIIlI[2]] = iArr[i];
            if (lIlIllIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            }
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return;
            }
        }
    }

    private static boolean lIlIlllIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlllIIII(int i, int i2) {
        return i > i2;
    }

    private static String lIlIllIlIlI(String lIlIIllllIlIIII, String lIlIIllllIIllll) {
        String lIlIIllllIlIIII2 = new String(Base64.getDecoder().decode(lIlIIllllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlIIllllIIllIl = lIlIIllllIIllll.toCharArray();
        int lIlIIllllIIIlll = llIlIIlI[2];
        char[] charArray = lIlIIllllIlIIII2.toCharArray();
        int length = charArray.length;
        int i = llIlIIlI[2];
        while (lIlIlllIIll(i, length)) {
            char lIlIIllllIIIIll = charArray[i];
            sb.append((char) (lIlIIllllIIIIll ^ lIlIIllllIIllIl[lIlIIllllIIIlll % lIlIIllllIIllIl.length]));
            "".length();
            lIlIIllllIIIlll++;
            i++;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void a(int[] iArr, int i) {
        int i2 = llIlIIlI[2];
        while (lIlIlllIIll(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIlI[1]);
            "".length();
            i2++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    public static void a(int[] iArr) {
        int i = llIlIIlI[2];
        while (lIlIlllIIll(i, iArr.length)) {
            Bank.withdraw(iArr[i], llIlIIlI[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIlI[1]);
            "".length();
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return;
            }
        }
    }

    public static void a(int i, int i2) {
        int[] iArr = new int[llIlIIlI[1]];
        iArr[llIlIIlI[2]] = i;
        if (lIlIllIllll(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i + " item id");
        }
        int[] iArr2 = new int[llIlIIlI[1]];
        iArr2[llIlIIlI[2]] = i;
        if (lIlIllIlllI(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i, i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIIlI[1]);
            "".length();
        }
    }

    private static boolean lIlIllIllll(int i) {
        return i == 0;
    }

    private static boolean lIlIllIllIl(int i, int i2) {
        return i == i2;
    }

    public static void a() {
        if (lIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(I), llIlIIlI[28])) {
            String[] strArr = new String[llIlIIlI[1]];
            strArr[llIlIIlI[2]] = llIlIIII[llIlIIlI[27]];
            NPCs.getNearest(strArr).interact(llIlIIII[llIlIIlI[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llIlIIlI[30]);
            "".length();
        }
        if (!lIlIllIllll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIllIlllI(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(llIlIIlI[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llIlIIlI[30]);
            "".length();
            "".length();
            if ("  ".length() < 0) {
            }
        } else if (lIlIllIllll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIllIllll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIllIllll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIllIllll(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIllIllll(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(H), llIlIIlI[11])) {
            if (lIlIllIllll(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlllIIII(Players.getLocal().getWorldLocation().distanceTo(I), llIlIIlI[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[llIlIIlI[1]];
                strArr2[llIlIIlI[2]] = llIlIIII[llIlIIlI[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (lIlIlllIIIl(nearest)) {
                    nearest.interact(llIlIIII[llIlIIlI[35]]);
                    Time.sleepTicks(llIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIIlI[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[llIlIIlI[1]];
            strArr3[llIlIIlI[2]] = llIlIIII[llIlIIlI[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (lIlIlllIIIl(nearest2)) {
                String[] strArr4 = new String[llIlIIlI[1]];
                strArr4[llIlIIlI[2]] = llIlIIII[llIlIIlI[23]];
                if (lIlIllIlllI(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(llIlIIII[llIlIIlI[22]]);
                    Time.sleepTicks(llIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIIlI[30]);
                    "".length();
                }
                String[] strArr5 = new String[llIlIIlI[1]];
                strArr5[llIlIIlI[2]] = llIlIIII[llIlIIlI[32]];
                if (lIlIllIlllI(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(llIlIIII[llIlIIlI[33]]);
                    Time.sleepTicks(llIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIIlI[30]);
                    "".length();
                }
            }
            "".length();
            if ((((229 ^ 182) ^ ((189 ^ 170) & ((56 ^ 47) ^ (-1)))) & (((22 ^ 100) ^ (102 ^ 71)) ^ (-" ".length()))) >= "   ".length()) {
            }
        }
    }

    private static boolean lIlIllIlllI(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIIlI(int i, int i2) {
        return i <= i2;
    }
}
