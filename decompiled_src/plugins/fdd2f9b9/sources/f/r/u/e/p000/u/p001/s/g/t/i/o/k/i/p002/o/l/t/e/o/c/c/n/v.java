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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.v  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/v.class */
public class v {
    private static /* synthetic */ int db;
    private static /* synthetic */ int dc;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] dd;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lIIIIllllI;
    private static /* synthetic */ int[] lIIIIlllll;

    public static void af() {
        int[] iArr = new int[lIIIIlllll[1]];
        iArr[lIIIIlllll[0]] = db;
        if (lllIIllIllII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(db, lIIIIlllll[1], lIIIIlllll[21]));
            "".length();
        }
        int[] iArr2 = new int[lIIIIlllll[1]];
        iArr2[lIIIIlllll[0]] = dc;
        if (lllIIllIllII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(dc, lIIIIlllll[1], lIIIIlllll[22]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIlllll[1]];
        iArr3[lIIIIlllll[0]] = lIIIIlllll[8];
        if (lllIIllIllII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[8], lIIIIlllll[1], lIIIIlllll[23]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIlllll[1]];
        iArr4[lIIIIlllll[0]] = lIIIIlllll[7];
        if (lllIIllIllII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[7], lIIIIlllll[1], lIIIIlllll[24]));
            "".length();
        }
        int[] iArr5 = new int[lIIIIlllll[1]];
        iArr5[lIIIIlllll[0]] = lIIIIlllll[25];
        if (lllIIllIllII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[25], lIIIIlllll[5], lIIIIlllll[13]));
            "".length();
        }
        int[] iArr6 = new int[lIIIIlllll[1]];
        iArr6[lIIIIlllll[0]] = lIIIIlllll[26];
        if (lllIIllIllII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[26], lIIIIlllll[27], lIIIIlllll[13]));
            "".length();
        }
        int[] iArr7 = new int[lIIIIlllll[1]];
        iArr7[lIIIIlllll[0]] = lIIIIlllll[28];
        if (lllIIllIllII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[28], lIIIIlllll[29], lIIIIlllll[13]));
            "".length();
        }
        int[] iArr8 = new int[lIIIIlllll[1]];
        iArr8[lIIIIlllll[0]] = lIIIIlllll[30];
        if (lllIIllIllII(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[30], lIIIIlllll[31], lIIIIlllll[13]));
            "".length();
        }
        int[] iArr9 = new int[lIIIIlllll[1]];
        iArr9[lIIIIlllll[0]] = lIIIIlllll[25];
        if (lllIIllIlIlI(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lIIIIlllll[1]];
            iArr10[lIIIIlllll[0]] = lIIIIlllll[25];
            if (lllIIllIlIll(Bank.getFirst(iArr10).getQuantity(), lIIIIlllll[32])) {
                bv.add(new C0003d(lIIIIlllll[25], lIIIIlllll[5], lIIIIlllll[13]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIIIIlllll[1]];
        iArr11[lIIIIlllll[0]] = lIIIIlllll[26];
        if (lllIIllIlIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIIIlllll[1]];
            iArr12[lIIIIlllll[0]] = lIIIIlllll[26];
            if (lllIIllIlIll(Bank.getFirst(iArr12).getQuantity(), lIIIIlllll[32])) {
                bv.add(new C0003d(lIIIIlllll[26], lIIIIlllll[27], lIIIIlllll[13]));
                "".length();
            }
        }
        int[] iArr13 = new int[lIIIIlllll[1]];
        iArr13[lIIIIlllll[0]] = lIIIIlllll[28];
        if (lllIIllIlIlI(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIIIIlllll[1]];
            iArr14[lIIIIlllll[0]] = lIIIIlllll[28];
            if (lllIIllIlIll(Bank.getFirst(iArr14).getQuantity(), lIIIIlllll[32])) {
                bv.add(new C0003d(lIIIIlllll[28], lIIIIlllll[29], lIIIIlllll[13]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIIIIlllll[1]];
        iArr15[lIIIIlllll[0]] = lIIIIlllll[30];
        if (lllIIllIlIlI(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIIIIlllll[1]];
            iArr16[lIIIIlllll[0]] = lIIIIlllll[30];
            if (lllIIllIlIll(Bank.getFirst(iArr16).getQuantity(), lIIIIlllll[32])) {
                bv.add(new C0003d(lIIIIlllll[30], lIIIIlllll[31], lIIIIlllll[13]));
                "".length();
            }
        }
        if (lllIIllIllII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIllllI[lIIIIlllll[40]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[33], lIIIIlllll[6], lIIIIlllll[34]));
            "".length();
        }
        int[] iArr17 = new int[lIIIIlllll[1]];
        iArr17[lIIIIlllll[0]] = lIIIIlllll[35];
        if (lllIIllIllII(Bank.contains(iArr17) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlllll[35], lIIIIlllll[36], lIIIIlllll[37]));
            "".length();
        }
    }

    private static String lllIIllIIlll(String llIIlllIIIll, String llIIlllIIIlI) {
        String llIIlllIIIll2 = new String(Base64.getDecoder().decode(llIIlllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlllIIIIl = new StringBuilder();
        char[] llIIlllIIIII = llIIlllIIIlI.toCharArray();
        int llIIllIlllll = lIIIIlllll[0];
        char[] charArray = llIIlllIIIll2.toCharArray();
        int length = charArray.length;
        int llIIllIlIlll = lIIIIlllll[0];
        while (lllIIllIlIll(llIIllIlIlll, length)) {
            char llIIlllIIlII = charArray[llIIllIlIlll];
            llIIlllIIIIl.append((char) (llIIlllIIlII ^ llIIlllIIIII[llIIllIlllll % llIIlllIIIII.length]));
            "".length();
            llIIllIlllll++;
            llIIllIlIlll++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llIIlllIIIIl);
    }

    static {
        lllIIllIlIIl();
        lllIIllIlIII();
        bv = new ArrayList();
        db = lIIIIlllll[41];
        dc = lIIIIlllll[42];
        int[] iArr = new int[lIIIIlllll[4]];
        iArr[lIIIIlllll[0]] = db;
        iArr[lIIIIlllll[1]] = dc;
        iArr[lIIIIlllll[2]] = lIIIIlllll[8];
        iArr[lIIIIlllll[3]] = lIIIIlllll[7];
        dd = iArr;
    }

    private static boolean lllIIllIlIlI(int i) {
        return i != 0;
    }

    private static void lllIIllIlIIl() {
        lIIIIlllll = new int[44];
        lIIIIlllll[0] = (70 ^ 16) & ((40 ^ 126) ^ (-1));
        lIIIIlllll[1] = " ".length();
        lIIIIlllll[2] = "  ".length();
        lIIIIlllll[3] = "   ".length();
        lIIIIlllll[4] = 9 ^ 13;
        lIIIIlllll[5] = (-17441) & 22440;
        lIIIIlllll[6] = (181 ^ 140) ^ (63 ^ 3);
        lIIIIlllll[7] = (-29704) & 32255;
        lIIIIlllll[8] = (-28945) & 30648;
        lIIIIlllll[9] = 70 ^ 64;
        lIIIIlllll[10] = (132 ^ 160) ^ (78 ^ 109);
        lIIIIlllll[11] = 29 ^ 21;
        lIIIIlllll[12] = 50 ^ 59;
        lIIIIlllll[13] = 46 ^ 36;
        lIIIIlllll[14] = 61 ^ 54;
        lIIIIlllll[15] = (((151 + 64) - 149) + 91) ^ (((84 + 68) - 147) + 140);
        lIIIIlllll[16] = (-(36 ^ 32)) & (-529) & 7031;
        lIIIIlllll[17] = 166 ^ 171;
        lIIIIlllll[18] = 191 ^ 177;
        lIIIIlllll[19] = 181 ^ 186;
        lIIIIlllll[20] = 211 ^ 195;
        lIIIIlllll[21] = (-22818) & 31227;
        lIIIIlllll[22] = (-14362) & 15871;
        lIIIIlllll[23] = (-33) & 28542;
        lIIIIlllll[24] = (-((-17745) & 28145)) & (-16898) & 32747;
        lIIIIlllll[25] = (-((-18057) & 30682)) & (-1025) & 14207;
        lIIIIlllll[26] = (-14337) & 14891;
        lIIIIlllll[27] = (-((-19407) & 23503)) & (-67) & 7162;
        lIIIIlllll[28] = (-27971) & 28527;
        lIIIIlllll[29] = (-12382) & 16381;
        lIIIIlllll[30] = (-21958) & 22511;
        lIIIIlllll[31] = (-24743) & 32742;
        lIIIIlllll[32] = (-((-18817) & 32643)) & (-16386) & 30711;
        lIIIIlllll[33] = (-16642) & 28621;
        lIIIIlllll[34] = (-((-18473) & 19005)) & (-1) & 25532;
        lIIIIlllll[35] = (-8233) & 16239;
        lIIIIlllll[36] = (-7235) & 7634;
        lIIIIlllll[37] = (-((-10319) & 27775)) & (-8259) & 26614;
        lIIIIlllll[38] = (98 ^ 86) ^ (143 ^ 170);
        lIIIIlllll[39] = 54 ^ 36;
        lIIIIlllll[40] = 52 ^ 39;
        lIIIIlllll[41] = (-((-9209) & 15355)) & (-129) & 7655;
        lIIIIlllll[42] = (-((-8803) & 27503)) & (-721) & 20479;
        lIIIIlllll[43] = (((140 + 107) - 175) + 80) ^ (((130 + 138) - 212) + 84);
    }

    private static boolean lllIIllIlIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aW() {
        String[] strArr = new String[lIIIIlllll[1]];
        strArr[lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[17]];
        if (lllIIllIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIIIlllll[1]];
            iArr[lIIIIlllll[0]] = lIIIIlllll[8];
            if (lllIIllIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIIIIlllll[1]];
                strArr2[lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[18]];
                if (lllIIllIlIlI(Inventory.contains(strArr2) ? 1 : 0) && lllIIllIlIlI(Inventory.contains(C0005f.aN) ? 1 : 0)) {
                    ?? r0 = lIIIIlllll[1];
                    "".length();
                    return (-" ".length()) > (-" ".length()) ? ((50 ^ 102) ^ (255 ^ 134)) & (((((130 + 73) - 202) + 150) ^ (((132 + 180) - 282) + 156)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIIlllll[0];
    }

    private static void lllIIllIlIII() {
        lIIIIllllI = new String[lIIIIlllll[43]];
        lIIIIllllI[lIIIIlllll[0]] = lllIIllIIlIl("r3Ap1e7LHXiGnwlV89V+Cg==", "oaHed");
        lIIIIllllI[lIIIIlllll[1]] = lllIIllIIllI("2DRJRje4L1yjS6/t1DL4xtiVxWp/Obhkrevumq/M8qGf89E2/hyVjl3EQTyfR//aL1bLmEropF4=", "uxFzt");
        lIIIIllllI[lIIIIlllll[2]] = lllIIllIIllI("szyYovpAObePFitscGdVUD3ShHJ0uQp8", "hhQtw");
        lIIIIllllI[lIIIIlllll[3]] = lllIIllIIlll("AyghPSQsPT46JG09OHQhLCc8", "MIWTC");
        lIIIIllllI[lIIIIlllll[4]] = lllIIllIIllI("5SuPXbrqKSx38cysUiAeAA==", "tWwWa");
        lIIIIllllI[lIIIIlllll[6]] = lllIIllIIllI("lLAczxen2JW+f/jFhiN0U95nx0CJhmbd", "lhOhA");
        lIIIIllllI[lIIIIlllll[9]] = lllIIllIIlll("Hh9kDDAsWikEMToTKgpiOg80HS4gHzdBYjoNLRkhIRMqCmI9FWQvFxAzCipiHA4tAQ==", "IzDmB");
        lIIIIllllI[lIIIIlllll[10]] = lllIIllIIlll("BA4bJQ==", "SkzWi");
        lIIIIllllI[lIIIIlllll[11]] = lllIIllIIlll("LQEjMQ==", "zdBCR");
        lIIIIllllI[lIIIIlllll[12]] = lllIIllIIlll("NBoiJhQ=", "csGJp");
        lIIIIllllI[lIIIIlllll[13]] = lllIIllIIlll("Ji4dBiM=", "qGxjG");
        lIIIIllllI[lIIIIlllll[14]] = lllIIllIIllI("nO+cS5T8byA=", "XbjJD");
        lIIIIllllI[lIIIIlllll[15]] = lllIIllIIlll("DQQBAiM=", "HutkS");
        lIIIIllllI[lIIIIlllll[17]] = lllIIllIIllI("Zhcec4tcBuLfseutkhH5yg==", "pxcwM");
        lIIIIllllI[lIIIIlllll[18]] = lllIIllIIllI("lX3CcL+Oh/8PCHPbA50nzQ==", "NMUIC");
        lIIIIllllI[lIIIIlllll[19]] = lllIIllIIlIl("nJNMw5PtvK5sy0BoWbnhTg==", "fgNEb");
        lIIIIllllI[lIIIIlllll[20]] = lllIIllIIlIl("oiLv6TSixlejqpo6FMLhdg==", "kgzXb");
        lIIIIllllI[lIIIIlllll[38]] = lllIIllIIlIl("viZ6dmBZaXA=", "eUkFZ");
        lIIIIllllI[lIIIIlllll[39]] = lllIIllIIlIl("EzxXWmw4A6Q=", "VyEns");
        lIIIIllllI[lIIIIlllll[40]] = lllIIllIIlIl("tgG0yKoSZ81YiY41sTZlOK+wEFg2Y/6k", "pOOma");
    }

    public static void aY() {
        if (lllIIllIlIlI(Inventory.contains(C0005f.bf) ? 1 : 0) && lllIIllIllII(Equipment.contains(C0005f.bf) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bf).interact(lIIIIllllI[lIIIIlllll[38]]);
            Time.sleepTicks(lIIIIlllll[1]);
            "".length();
        }
        if (lllIIllIlIlI(Inventory.contains(C0005f.aR) ? 1 : 0) && lllIIllIllII(Equipment.contains(C0005f.aR) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aR).interact(lIIIIllllI[lIIIIlllll[39]]);
            Time.sleepTicks(lIIIIlllll[1]);
            "".length();
        }
    }

    private static boolean lllIIllIlllI(int i) {
        return i > 0;
    }

    private static String lllIIllIIlIl(String llIIllIIIIIl, String llIIllIIIIII) {
        try {
            SecretKeySpec llIIllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIIIIll = Cipher.getInstance("Blowfish");
            llIIllIIIIll.init(lIIIIlllll[2], llIIllIIIlII);
            return new String(llIIllIIIIll.doFinal(Base64.getDecoder().decode(llIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIIIIlI) {
            llIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIllll(int i, int i2) {
        return i >= i2;
    }

    private static String lllIIllIIllI(String llIIllIIlllI, String llIIllIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIIllIl.getBytes(StandardCharsets.UTF_8)), lIIIIlllll[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIlllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIIllll) {
            llIIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        if (lllIIllIllll(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.v.lIIIIlllll[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
        if (lllIIllIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ec, code lost:
        if (lllIIllIllll(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.v.lIIIIlllll[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (lllIIllIlIll(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.v.lIIIIlllll[1]) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
        af();
        java.lang.System.out.println(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.v.lIIIIllllI[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.v.lIIIIlllll[9]]);
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.v.bt = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.v.lIIIIlllll[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0249, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v193, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v226, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aV() {
        if (lllIIllIlIlI(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[0]];
            C0001b.a(bv);
            if (lllIIllIlIll(bv.size(), lIIIIlllll[1])) {
                System.out.println(lIIIIllllI[lIIIIlllll[1]]);
                bt = lIIIIlllll[0];
            }
        }
        if (lllIIllIllII(bt ? 1 : 0) && lllIIllIllII(aX() ? 1 : 0)) {
            System.out.println(lIIIIllllI[lIIIIlllll[2]]);
            if (lllIIllIllII(aW() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIIllIllIl(nearest) && lllIIllIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[3]];
                    C0000a.a(nearest);
                }
                if (lllIIllIllIl(nearest) && lllIIllIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIlllll[5]);
                        "".length();
                    }
                    if (lllIIllIlIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[6]];
                        if (lllIIllIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIlllll[3]);
                            "".length();
                        }
                        if (lllIIllIlllI(Equipment.getAll().size()) && lllIIllIllII(aX() ? 1 : 0)) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIlllll[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIlllll[1]];
                        iArr[lIIIIlllll[0]] = dc;
                        if (lllIIllIllII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIIlllll[1]];
                            iArr2[lIIIIlllll[0]] = dc;
                        }
                        int[] iArr3 = new int[lIIIIlllll[1]];
                        iArr3[lIIIIlllll[0]] = db;
                        if (lllIIllIllII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIlllll[1]];
                            iArr4[lIIIIlllll[0]] = db;
                        }
                        int[] iArr5 = new int[lIIIIlllll[1]];
                        iArr5[lIIIIlllll[0]] = lIIIIlllll[7];
                        if (lllIIllIllII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIlllll[1]];
                            iArr6[lIIIIlllll[0]] = lIIIIlllll[7];
                        }
                        int[] iArr7 = new int[lIIIIlllll[1]];
                        iArr7[lIIIIlllll[0]] = lIIIIlllll[8];
                        if (lllIIllIllII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIIIIlllll[1]];
                            iArr8[lIIIIlllll[0]] = lIIIIlllll[8];
                        }
                        int[] iArr9 = new int[lIIIIlllll[1]];
                        iArr9[lIIIIlllll[0]] = db;
                        if (lllIIllIlIlI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIIIIlllll[1]];
                            iArr10[lIIIIlllll[0]] = db;
                            if (lllIIllIlIll(Inventory.getCount(iArr10), lIIIIlllll[1])) {
                                Bank.withdraw(db, lIIIIlllll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlllll[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIIIIlllll[1]];
                                    iArr11[lIIIIlllll[0]] = db;
                                    if (lllIIllIlllI(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIIIIlllll[1];
                                        "".length();
                                        return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIIIlllll[0];
                                }, lIIIIlllll[5]);
                                "".length();
                            }
                        }
                        int[] iArr11 = new int[lIIIIlllll[1]];
                        iArr11[lIIIIlllll[0]] = dc;
                        if (lllIIllIlIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIIlllll[1]];
                            iArr12[lIIIIlllll[0]] = dc;
                            if (lllIIllIlIll(Inventory.getCount(iArr12), lIIIIlllll[1])) {
                                Bank.withdraw(dc, lIIIIlllll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlllll[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr13 = new int[lIIIIlllll[1]];
                                    iArr13[lIIIIlllll[0]] = dc;
                                    if (lllIIllIlllI(Inventory.getCount(iArr13))) {
                                        ?? r0 = lIIIIlllll[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIIIlllll[0];
                                }, lIIIIlllll[5]);
                                "".length();
                            }
                        }
                        int[] iArr13 = new int[lIIIIlllll[1]];
                        iArr13[lIIIIlllll[0]] = lIIIIlllll[7];
                        if (lllIIllIlIlI(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIIIIlllll[1]];
                            iArr14[lIIIIlllll[0]] = lIIIIlllll[7];
                            if (lllIIllIlIll(Inventory.getCount(iArr14), lIIIIlllll[1])) {
                                Bank.withdraw(lIIIIlllll[7], lIIIIlllll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlllll[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lIIIIlllll[1]];
                                    iArr15[lIIIIlllll[0]] = lIIIIlllll[7];
                                    if (lllIIllIlllI(Inventory.getCount(iArr15))) {
                                        ?? r0 = lIIIIlllll[1];
                                        "".length();
                                        return "  ".length() <= (((((51 + 20) - 55) + 134) ^ (((153 + 110) - 231) + 129)) & (((90 ^ 4) ^ (168 ^ 193)) ^ (-" ".length()))) ? ((((58 + 42) - 13) + 92) ^ (((154 + 136) - 177) + 61)) & (((157 ^ 139) ^ (60 ^ 55)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIIlllll[0];
                                }, lIIIIlllll[5]);
                                "".length();
                            }
                        }
                        int[] iArr15 = new int[lIIIIlllll[1]];
                        iArr15[lIIIIlllll[0]] = lIIIIlllll[8];
                        if (lllIIllIlIlI(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lIIIIlllll[1]];
                            iArr16[lIIIIlllll[0]] = lIIIIlllll[8];
                            if (lllIIllIlIll(Inventory.getCount(iArr16), lIIIIlllll[1])) {
                                Bank.withdraw(lIIIIlllll[8], lIIIIlllll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlllll[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lIIIIlllll[1]];
                                    iArr17[lIIIIlllll[0]] = lIIIIlllll[8];
                                    if (lllIIllIlllI(Inventory.getCount(iArr17))) {
                                        ?? r0 = lIIIIlllll[1];
                                        "".length();
                                        return "   ".length() == 0 ? ((((146 + 46) - 19) + 27) ^ (((47 + 146) - 187) + 150)) & (((((63 + 68) - (-38)) + 27) ^ (((77 + 142) - 164) + 89)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIIlllll[0];
                                }, lIIIIlllll[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lllIIllIlIlI(aW() ? 1 : 0)) {
                if (lllIIllIlIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                    if (lllIIllIlIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lIIIIlllll[1]);
                        "".length();
                    }
                    int llIIllllIIll = lIIIIlllll[0];
                    while (lllIIllIlIll(llIIllllIIll, dd.length)) {
                        int[] iArr17 = new int[lIIIIlllll[1]];
                        iArr17[lIIIIlllll[0]] = dd[llIIllllIIll];
                        Item first = Inventory.getFirst(iArr17);
                        if (lllIIllIllIl(first)) {
                            int[] iArr18 = new int[lIIIIlllll[1]];
                            iArr18[lIIIIlllll[0]] = first.getId();
                            if (lllIIllIlIlI(Inventory.contains(iArr18) ? 1 : 0)) {
                                String[] strArr = new String[lIIIIlllll[1]];
                                strArr[lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[10]];
                                if (lllIIllIlIlI(first.hasAction(strArr) ? 1 : 0)) {
                                    first.interact(lIIIIllllI[lIIIIlllll[11]]);
                                    Time.sleepTicks(lIIIIlllll[1]);
                                    "".length();
                                }
                                String[] strArr2 = new String[lIIIIlllll[1]];
                                strArr2[lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[12]];
                                if (lllIIllIlIlI(first.hasAction(strArr2) ? 1 : 0)) {
                                    first.interact(lIIIIllllI[lIIIIlllll[13]]);
                                    Time.sleepTicks(lIIIIlllll[1]);
                                    "".length();
                                }
                                String[] strArr3 = new String[lIIIIlllll[1]];
                                strArr3[lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[14]];
                                if (lllIIllIlIlI(first.hasAction(strArr3) ? 1 : 0)) {
                                    first.interact(lIIIIllllI[lIIIIlllll[15]]);
                                    Time.sleepTicks(lIIIIlllll[1]);
                                    "".length();
                                }
                                Time.sleepTicks(lIIIIlllll[1]);
                                "".length();
                            }
                        }
                        llIIllllIIll++;
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                    }
                    if (lllIIllIlIlI(aX() ? 1 : 0) && lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIlllll[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lllIIllIllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aX() {
        String[] strArr = new String[lIIIIlllll[1]];
        strArr[lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[19]];
        if (lllIIllIlIlI(Equipment.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIIIlllll[1]];
            iArr[lIIIIlllll[0]] = lIIIIlllll[8];
            if (lllIIllIlIlI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIlllll[1]];
                iArr2[lIIIIlllll[0]] = lIIIIlllll[7];
                if (lllIIllIlIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIIlllll[1]];
                    strArr2[lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[20]];
                    if (lllIIllIlIlI(Equipment.contains(strArr2) ? 1 : 0)) {
                        ?? r0 = lIIIIlllll[1];
                        "".length();
                        return (-" ".length()) > 0 ? ((46 ^ 1) ^ (29 ^ 111)) & (((((44 + 135) - 127) + 157) ^ (((33 + 50) - (-3)) + 54)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lIIIIlllll[0];
    }
}
