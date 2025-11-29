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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.y  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/y.class */
public class C0024y {
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] dV;
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ int dT;
    private static /* synthetic */ int[] lIlllIIlIl;
    private static /* synthetic */ int dU;
    private static /* synthetic */ String[] lIlllIIlII;

    private static String lIIlllIIlIIlI(String llllllllllllllllllIllllllIIIIlIl, String llllllllllllllllllIllllllIIIIlII) {
        try {
            SecretKeySpec llllllllllllllllllIllllllIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIlIl[2], llllllllllllllllllIllllllIIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllllllIIIIllI) {
            llllllllllllllllllIllllllIIIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIlIlII() {
        lIlllIIlII = new String[lIlllIIlIl[43]];
        lIlllIIlII[lIlllIIlIl[0]] = lIIlllIIlIIIl("GzQjPDs+YTMhMDQy", "YAZUU");
        lIlllIIlII[lIlllIIlIl[1]] = lIIlllIIlIIlI("YWD3u8QA4GSnvbT3eLIpN381cBq9J4Ea1n+hLdgsjbwgsor5iy+b0UbmdWgzU4HGb8NUO7A8Wwc=", "SUqHi");
        lIlllIIlII[lIlllIIlIl[2]] = lIIlllIIlIIlI("laXfMGzc6ebZFBQdpwojJIBvmS6ZCVtz", "OceUs");
        lIlllIIlII[lIlllIIlIl[3]] = lIIlllIIlIIIl("Oi4aPQ8VOwU6D1Q7A3QKFSEH", "tOlTh");
        lIlllIIlII[lIlllIIlIl[4]] = lIIlllIIlIIll("wxA8hunK0dgGsTUkZ2IgXg==", "CBWTO");
        lIlllIIlII[lIlllIIlIl[6]] = lIIlllIIlIIIl("ESQ+IA4wKzdkADgrOy0MPg==", "YEPDb");
        lIlllIIlII[lIlllIIlIl[9]] = lIIlllIIlIIIl("PjxkDAYMeSkEBxowKgpUGiw0HRgAPDdBVBouLRkXATAqClQdNmQvITAQCipUPC0tAQ==", "iYDmt");
        lIlllIIlII[lIlllIIlIl[10]] = lIIlllIIlIIlI("07cLFSazZXI=", "Nznlq");
        lIlllIIlII[lIlllIIlIl[11]] = lIIlllIIlIIlI("iMgvSOieWD8=", "AqDcz");
        lIlllIIlII[lIlllIIlIl[12]] = lIIlllIIlIIlI("x6c6N/KgIoo=", "cRxpf");
        lIlllIIlII[lIlllIIlIl[13]] = lIIlllIIlIIIl("JQ08NTI=", "rdYYV");
        lIlllIIlII[lIlllIIlIl[14]] = lIIlllIIlIIlI("R1RRZiP4/bc=", "AoQIK");
        lIlllIIlII[lIlllIIlIl[15]] = lIIlllIIlIIll("OYzybhEX6t4=", "adDTH");
        lIlllIIlII[lIlllIIlIl[17]] = lIIlllIIlIIIl("KyEgBRJYOidDFREn", "xUAct");
        lIlllIIlII[lIlllIIlIl[18]] = lIIlllIIlIIll("gPiYiFKgam2yAprdTjWrsg==", "vbaDX");
        lIlllIIlII[lIlllIIlIl[19]] = lIIlllIIlIIIl("OhwEACpJBwNGLQAa", "ihefL");
        lIlllIIlII[lIlllIIlIl[20]] = lIIlllIIlIIll("pTFNuvGKW3avyPaYnkugZA==", "XndYv");
        lIlllIIlII[lIlllIIlIl[38]] = lIIlllIIlIIIl("Lj0UKg==", "yXuXH");
        lIlllIIlII[lIlllIIlIl[39]] = lIIlllIIlIIIl("ABEbHA==", "Wtznk");
        lIlllIIlII[lIlllIIlIl[40]] = lIIlllIIlIIIl("CwMID1gWDEYfHRgGEgBYUQ==", "yjfhx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bv() {
        String[] strArr = new String[lIlllIIlIl[1]];
        strArr[lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[19]];
        if (lIIlllIIlIllI(Equipment.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIlllIIlIl[1]];
            iArr[lIlllIIlIl[0]] = lIlllIIlIl[8];
            if (lIIlllIIlIllI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIIlIl[1]];
                iArr2[lIlllIIlIl[0]] = lIlllIIlIl[7];
                if (lIIlllIIlIllI(Equipment.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlllIIlIl[1]];
                    strArr2[lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[20]];
                    if (lIIlllIIlIllI(Equipment.contains(strArr2) ? 1 : 0)) {
                        ?? r0 = lIlllIIlIl[1];
                        "".length();
                        return (193 ^ 197) < ((147 ^ 133) & ((29 ^ 11) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIlllIIlIl[0];
    }

    public static void bw() {
        if (lIIlllIIlIllI(Inventory.contains(C0005f.be) ? 1 : 0) && lIIlllIIllIII(Equipment.contains(C0005f.be) ? 1 : 0)) {
            Inventory.getFirst(C0005f.be).interact(lIlllIIlII[lIlllIIlIl[38]]);
            Time.sleepTicks(lIlllIIlIl[1]);
            "".length();
        }
        if (lIIlllIIlIllI(Inventory.contains(C0005f.aQ) ? 1 : 0) && lIIlllIIllIII(Equipment.contains(C0005f.aQ) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aQ).interact(lIlllIIlII[lIlllIIlIl[39]]);
            Time.sleepTicks(lIlllIIlIl[1]);
            "".length();
        }
    }

    public static void O() {
        int[] iArr = new int[lIlllIIlIl[1]];
        iArr[lIlllIIlIl[0]] = dT;
        if (lIIlllIIllIII(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(dT, lIlllIIlIl[1], lIlllIIlIl[21]));
            "".length();
        }
        int[] iArr2 = new int[lIlllIIlIl[1]];
        iArr2[lIlllIIlIl[0]] = dU;
        if (lIIlllIIllIII(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(dU, lIlllIIlIl[1], lIlllIIlIl[22]));
            "".length();
        }
        int[] iArr3 = new int[lIlllIIlIl[1]];
        iArr3[lIlllIIlIl[0]] = lIlllIIlIl[8];
        if (lIIlllIIllIII(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[8], lIlllIIlIl[1], lIlllIIlIl[23]));
            "".length();
        }
        int[] iArr4 = new int[lIlllIIlIl[1]];
        iArr4[lIlllIIlIl[0]] = lIlllIIlIl[7];
        if (lIIlllIIllIII(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[7], lIlllIIlIl[1], lIlllIIlIl[24]));
            "".length();
        }
        int[] iArr5 = new int[lIlllIIlIl[1]];
        iArr5[lIlllIIlIl[0]] = lIlllIIlIl[25];
        if (lIIlllIIllIII(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[25], lIlllIIlIl[5], lIlllIIlIl[13]));
            "".length();
        }
        int[] iArr6 = new int[lIlllIIlIl[1]];
        iArr6[lIlllIIlIl[0]] = lIlllIIlIl[26];
        if (lIIlllIIllIII(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[26], lIlllIIlIl[27], lIlllIIlIl[13]));
            "".length();
        }
        int[] iArr7 = new int[lIlllIIlIl[1]];
        iArr7[lIlllIIlIl[0]] = lIlllIIlIl[28];
        if (lIIlllIIllIII(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[28], lIlllIIlIl[29], lIlllIIlIl[13]));
            "".length();
        }
        int[] iArr8 = new int[lIlllIIlIl[1]];
        iArr8[lIlllIIlIl[0]] = lIlllIIlIl[30];
        if (lIIlllIIllIII(Bank.contains(iArr8) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[30], lIlllIIlIl[31], lIlllIIlIl[13]));
            "".length();
        }
        int[] iArr9 = new int[lIlllIIlIl[1]];
        iArr9[lIlllIIlIl[0]] = lIlllIIlIl[25];
        if (lIIlllIIlIllI(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lIlllIIlIl[1]];
            iArr10[lIlllIIlIl[0]] = lIlllIIlIl[25];
            if (lIIlllIIlIlll(Bank.getFirst(iArr10).getQuantity(), lIlllIIlIl[32])) {
                bp.add(new C0003d(lIlllIIlIl[25], lIlllIIlIl[5], lIlllIIlIl[13]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIlllIIlIl[1]];
        iArr11[lIlllIIlIl[0]] = lIlllIIlIl[26];
        if (lIIlllIIlIllI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIlllIIlIl[1]];
            iArr12[lIlllIIlIl[0]] = lIlllIIlIl[26];
            if (lIIlllIIlIlll(Bank.getFirst(iArr12).getQuantity(), lIlllIIlIl[32])) {
                bp.add(new C0003d(lIlllIIlIl[26], lIlllIIlIl[27], lIlllIIlIl[13]));
                "".length();
            }
        }
        int[] iArr13 = new int[lIlllIIlIl[1]];
        iArr13[lIlllIIlIl[0]] = lIlllIIlIl[28];
        if (lIIlllIIlIllI(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIlllIIlIl[1]];
            iArr14[lIlllIIlIl[0]] = lIlllIIlIl[28];
            if (lIIlllIIlIlll(Bank.getFirst(iArr14).getQuantity(), lIlllIIlIl[32])) {
                bp.add(new C0003d(lIlllIIlIl[28], lIlllIIlIl[29], lIlllIIlIl[13]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIlllIIlIl[1]];
        iArr15[lIlllIIlIl[0]] = lIlllIIlIl[30];
        if (lIIlllIIlIllI(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIlllIIlIl[1]];
            iArr16[lIlllIIlIl[0]] = lIlllIIlIl[30];
            if (lIIlllIIlIlll(Bank.getFirst(iArr16).getQuantity(), lIlllIIlIl[32])) {
                bp.add(new C0003d(lIlllIIlIl[30], lIlllIIlIl[31], lIlllIIlIl[13]));
                "".length();
            }
        }
        if (lIIlllIIllIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIIlII[lIlllIIlIl[40]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[33], lIlllIIlIl[6], lIlllIIlIl[34]));
            "".length();
        }
        int[] iArr17 = new int[lIlllIIlIl[1]];
        iArr17[lIlllIIlIl[0]] = lIlllIIlIl[35];
        if (lIIlllIIllIII(Bank.contains(iArr17) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIlIl[35], lIlllIIlIl[36], lIlllIIlIl[37]));
            "".length();
        }
    }

    private static String lIIlllIIlIIll(String llllllllllllllllllIlllllIllllIII, String llllllllllllllllllIlllllIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllllIlllIlll.getBytes(StandardCharsets.UTF_8)), lIlllIIlIl[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllllIllllIIl) {
            llllllllllllllllllIlllllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllIIllIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllIIlIllI(int i) {
        return i != 0;
    }

    private static void lIIlllIIlIlIl() {
        lIlllIIlIl = new int[44];
        lIlllIIlIl[0] = ((((29 + 129) - (-9)) + 37) ^ (((135 + 75) - 171) + 105)) & (((5 ^ 58) ^ (33 ^ 66)) ^ (-" ".length()));
        lIlllIIlIl[1] = " ".length();
        lIlllIIlIl[2] = "  ".length();
        lIlllIIlIl[3] = "   ".length();
        lIlllIIlIl[4] = (((91 + 84) - 117) + 96) ^ (((20 + 121) - 130) + 147);
        lIlllIIlIl[5] = (-10245) & 15244;
        lIlllIIlIl[6] = 88 ^ 93;
        lIlllIIlIl[7] = (-((-14433) & 31843)) & (-12802) & 32763;
        lIlllIIlIl[8] = (-((-1569) & 30582)) & (-2049) & 32765;
        lIlllIIlIl[9] = (177 ^ 182) ^ " ".length();
        lIlllIIlIl[10] = 89 ^ 94;
        lIlllIIlIl[11] = (((154 + 146) - 132) + 1) ^ (((6 + 109) - 30) + 76);
        lIlllIIlIl[12] = 81 ^ 88;
        lIlllIIlIl[13] = 152 ^ 146;
        lIlllIIlIl[14] = (79 ^ 2) ^ (43 ^ 109);
        lIlllIIlIl[15] = 73 ^ 69;
        lIlllIIlIl[16] = (-((-8486) & 9655)) & (-523) & 8191;
        lIlllIIlIl[17] = (184 ^ 153) ^ (178 ^ 158);
        lIlllIIlIl[18] = (((140 + 114) - 61) + 8) ^ (((99 + 98) - 77) + 79);
        lIlllIIlIl[19] = 150 ^ 153;
        lIlllIIlIl[20] = 19 ^ 3;
        lIlllIIlIl[21] = (-7457) & 15866;
        lIlllIIlIl[22] = (-25098) & 26607;
        lIlllIIlIl[23] = (-((-10233) & 14330)) & (-1) & 32607;
        lIlllIIlIl[24] = (-8726) & 14175;
        lIlllIIlIl[25] = (-21570) & 22127;
        lIlllIIlIl[26] = (-((-17267) & 23543)) & (-321) & 7151;
        lIlllIIlIl[27] = (-16455) & 19454;
        lIlllIIlIl[28] = (-28097) & 28653;
        lIlllIIlIl[29] = (-7) & 4006;
        lIlllIIlIl[30] = (-26629) & 27182;
        lIlllIIlIl[31] = (-((-6321) & 22713)) & (-8243) & 32634;
        lIlllIIlIl[32] = (-14346) & 14845;
        lIlllIIlIl[33] = (-((-25101) & 29469)) & (-36) & 16383;
        lIlllIIlIl[34] = (-7188) & 32187;
        lIlllIIlIl[35] = (-33) & 8039;
        lIlllIIlIl[36] = (-((-16547) & 32423)) & (-105) & 16380;
        lIlllIIlIl[37] = (-((-89) & 20603)) & (-2138) & 23551;
        lIlllIIlIl[38] = 56 ^ 41;
        lIlllIIlIl[39] = 78 ^ 92;
        lIlllIIlIl[40] = 60 ^ 47;
        lIlllIIlIl[41] = (-((-18273) & 26595)) & (-18449) & 28151;
        lIlllIIlIl[42] = (-15249) & 16307;
        lIlllIIlIl[43] = 149 ^ 129;
    }

    private static boolean lIIlllIIllIII(int i) {
        return i == 0;
    }

    private static boolean lIIlllIIllIlI(int i) {
        return i > 0;
    }

    private static boolean lIIlllIIlIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bu() {
        String[] strArr = new String[lIlllIIlIl[1]];
        strArr[lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[17]];
        if (lIIlllIIlIllI(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIlllIIlIl[1]];
            iArr[lIlllIIlIl[0]] = lIlllIIlIl[8];
            if (lIIlllIIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIlllIIlIl[1]];
                strArr2[lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[18]];
                if (lIIlllIIlIllI(Inventory.contains(strArr2) ? 1 : 0) && lIIlllIIlIllI(Inventory.contains(C0005f.aM) ? 1 : 0)) {
                    ?? r0 = lIlllIIlIl[1];
                    "".length();
                    return (-((33 ^ 102) ^ (118 ^ 52))) >= 0 ? ((((6 + 60) - 47) + 183) ^ (((138 + 2) - (-1)) + 16)) & (((220 ^ 193) ^ (97 ^ 43)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIlllIIlIl[0];
    }

    private static String lIIlllIIlIIIl(String llllllllllllllllllIllllllIIllIlI, String llllllllllllllllllIllllllIIllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIllllllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllllllIIllIII = new StringBuilder();
        char[] llllllllllllllllllIllllllIIlIlll = llllllllllllllllllIllllllIIllIIl.toCharArray();
        int llllllllllllllllllIllllllIIlIllI = lIlllIIlIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlllIIlIl[0];
        while (lIIlllIIlIlll(i, length)) {
            char llllllllllllllllllIllllllIIllIll = charArray[i];
            llllllllllllllllllIllllllIIllIII.append((char) (llllllllllllllllllIllllllIIllIll ^ llllllllllllllllllIllllllIIlIlll[llllllllllllllllllIllllllIIlIllI % llllllllllllllllllIllllllIIlIlll.length]));
            "".length();
            llllllllllllllllllIllllllIIlIllI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllllllIIllIII);
    }

    static {
        lIIlllIIlIlIl();
        lIIlllIIlIlII();
        bp = new ArrayList();
        dT = lIlllIIlIl[41];
        dU = lIlllIIlIl[42];
        int[] iArr = new int[lIlllIIlIl[4]];
        iArr[lIlllIIlIl[0]] = dT;
        iArr[lIlllIIlIl[1]] = dU;
        iArr[lIlllIIlIl[2]] = lIlllIIlIl[8];
        iArr[lIlllIIlIl[3]] = lIlllIIlIl[7];
        dV = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        if (lIIlllIIllIll(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0024y.lIlllIIlIl[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
        if (lIIlllIIlIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ec, code lost:
        if (lIIlllIIllIll(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0024y.lIlllIIlIl[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (lIIlllIIlIlll(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0024y.lIlllIIlIl[1]) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
        O();
        java.lang.System.out.println(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0024y.lIlllIIlII[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0024y.lIlllIIlIl[9]]);
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0024y.bn = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0024y.lIlllIIlIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0249, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v225, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bt() {
        if (lIIlllIIlIllI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[0]];
            C0001b.a(bp);
            if (lIIlllIIlIlll(bp.size(), lIlllIIlIl[1])) {
                System.out.println(lIlllIIlII[lIlllIIlIl[1]]);
                bn = lIlllIIlIl[0];
            }
        }
        if (lIIlllIIllIII(bn ? 1 : 0) && lIIlllIIllIII(bv() ? 1 : 0)) {
            System.out.println(lIlllIIlII[lIlllIIlIl[2]]);
            if (lIIlllIIllIII(bu() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlllIIllIIl(nearest) && lIIlllIIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[3]];
                    C0000a.a(nearest);
                }
                if (lIIlllIIllIIl(nearest) && lIIlllIIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIIlIl[5]);
                        "".length();
                    }
                    if (lIIlllIIlIllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[6]];
                        if (lIIlllIIllIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIIlIl[3]);
                            "".length();
                        }
                        if (lIIlllIIllIlI(Equipment.getAll().size()) && lIIlllIIllIII(bv() ? 1 : 0)) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllIIlIl[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIlllIIlIl[1]];
                        iArr[lIlllIIlIl[0]] = dU;
                        if (lIIlllIIllIII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIlllIIlIl[1]];
                            iArr2[lIlllIIlIl[0]] = dU;
                        }
                        int[] iArr3 = new int[lIlllIIlIl[1]];
                        iArr3[lIlllIIlIl[0]] = dT;
                        if (lIIlllIIllIII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlllIIlIl[1]];
                            iArr4[lIlllIIlIl[0]] = dT;
                        }
                        int[] iArr5 = new int[lIlllIIlIl[1]];
                        iArr5[lIlllIIlIl[0]] = lIlllIIlIl[7];
                        if (lIIlllIIllIII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIlllIIlIl[1]];
                            iArr6[lIlllIIlIl[0]] = lIlllIIlIl[7];
                        }
                        int[] iArr7 = new int[lIlllIIlIl[1]];
                        iArr7[lIlllIIlIl[0]] = lIlllIIlIl[8];
                        if (lIIlllIIllIII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIlllIIlIl[1]];
                            iArr8[lIlllIIlIl[0]] = lIlllIIlIl[8];
                        }
                        int[] iArr9 = new int[lIlllIIlIl[1]];
                        iArr9[lIlllIIlIl[0]] = dT;
                        if (lIIlllIIlIllI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIlllIIlIl[1]];
                            iArr10[lIlllIIlIl[0]] = dT;
                            if (lIIlllIIlIlll(Inventory.getCount(iArr10), lIlllIIlIl[1])) {
                                Bank.withdraw(dT, lIlllIIlIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIIlIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIlllIIlIl[1]];
                                    iArr11[lIlllIIlIl[0]] = dT;
                                    if (lIIlllIIllIlI(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIlllIIlIl[1];
                                        "".length();
                                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlllIIlIl[0];
                                }, lIlllIIlIl[5]);
                                "".length();
                            }
                        }
                        int[] iArr11 = new int[lIlllIIlIl[1]];
                        iArr11[lIlllIIlIl[0]] = dU;
                        if (lIIlllIIlIllI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlllIIlIl[1]];
                            iArr12[lIlllIIlIl[0]] = dU;
                            if (lIIlllIIlIlll(Inventory.getCount(iArr12), lIlllIIlIl[1])) {
                                Bank.withdraw(dU, lIlllIIlIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIIlIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr13 = new int[lIlllIIlIl[1]];
                                    iArr13[lIlllIIlIl[0]] = dU;
                                    if (lIIlllIIllIlI(Inventory.getCount(iArr13))) {
                                        ?? r0 = lIlllIIlIl[1];
                                        "".length();
                                        return " ".length() <= (-" ".length()) ? ((((217 + 17) - 163) + 165) ^ (((142 + 136) - 203) + 101)) & (((63 ^ 95) ^ (159 ^ 163)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlllIIlIl[0];
                                }, lIlllIIlIl[5]);
                                "".length();
                            }
                        }
                        int[] iArr13 = new int[lIlllIIlIl[1]];
                        iArr13[lIlllIIlIl[0]] = lIlllIIlIl[7];
                        if (lIIlllIIlIllI(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIlllIIlIl[1]];
                            iArr14[lIlllIIlIl[0]] = lIlllIIlIl[7];
                            if (lIIlllIIlIlll(Inventory.getCount(iArr14), lIlllIIlIl[1])) {
                                Bank.withdraw(lIlllIIlIl[7], lIlllIIlIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIIlIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lIlllIIlIl[1]];
                                    iArr15[lIlllIIlIl[0]] = lIlllIIlIl[7];
                                    if (lIIlllIIllIlI(Inventory.getCount(iArr15))) {
                                        ?? r0 = lIlllIIlIl[1];
                                        "".length();
                                        return (-" ".length()) != (-" ".length()) ? ((((75 + 173) - 124) + 69) ^ (((106 + 53) - 51) + 49)) & (((((110 + 60) - 70) + 133) ^ (((139 + 4) - (-10)) + 28)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlllIIlIl[0];
                                }, lIlllIIlIl[5]);
                                "".length();
                            }
                        }
                        int[] iArr15 = new int[lIlllIIlIl[1]];
                        iArr15[lIlllIIlIl[0]] = lIlllIIlIl[8];
                        if (lIIlllIIlIllI(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lIlllIIlIl[1]];
                            iArr16[lIlllIIlIl[0]] = lIlllIIlIl[8];
                            if (lIIlllIIlIlll(Inventory.getCount(iArr16), lIlllIIlIl[1])) {
                                Bank.withdraw(lIlllIIlIl[8], lIlllIIlIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIIlIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lIlllIIlIl[1]];
                                    iArr17[lIlllIIlIl[0]] = lIlllIIlIl[8];
                                    if (lIIlllIIllIlI(Inventory.getCount(iArr17))) {
                                        ?? r0 = lIlllIIlIl[1];
                                        "".length();
                                        return ((161 ^ 138) & ((6 ^ 45) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlllIIlIl[0];
                                }, lIlllIIlIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIlllIIlIllI(bu() ? 1 : 0)) {
                if (lIIlllIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (lIIlllIIlIllI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lIlllIIlIl[1]);
                        "".length();
                    }
                    int i = lIlllIIlIl[0];
                    while (lIIlllIIlIlll(i, dV.length)) {
                        int[] iArr17 = new int[lIlllIIlIl[1]];
                        iArr17[lIlllIIlIl[0]] = dV[i];
                        Item first = Inventory.getFirst(iArr17);
                        if (lIIlllIIllIIl(first)) {
                            int[] iArr18 = new int[lIlllIIlIl[1]];
                            iArr18[lIlllIIlIl[0]] = first.getId();
                            if (lIIlllIIlIllI(Inventory.contains(iArr18) ? 1 : 0)) {
                                String[] strArr = new String[lIlllIIlIl[1]];
                                strArr[lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[10]];
                                if (lIIlllIIlIllI(first.hasAction(strArr) ? 1 : 0)) {
                                    first.interact(lIlllIIlII[lIlllIIlIl[11]]);
                                    Time.sleepTicks(lIlllIIlIl[1]);
                                    "".length();
                                }
                                String[] strArr2 = new String[lIlllIIlIl[1]];
                                strArr2[lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[12]];
                                if (lIIlllIIlIllI(first.hasAction(strArr2) ? 1 : 0)) {
                                    first.interact(lIlllIIlII[lIlllIIlIl[13]]);
                                    Time.sleepTicks(lIlllIIlIl[1]);
                                    "".length();
                                }
                                String[] strArr3 = new String[lIlllIIlIl[1]];
                                strArr3[lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[14]];
                                if (lIIlllIIlIllI(first.hasAction(strArr3) ? 1 : 0)) {
                                    first.interact(lIlllIIlII[lIlllIIlIl[15]]);
                                    Time.sleepTicks(lIlllIIlIl[1]);
                                    "".length();
                                }
                                Time.sleepTicks(lIlllIIlIl[1]);
                                "".length();
                            }
                        }
                        i++;
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    }
                    if (lIIlllIIlIllI(bv() ? 1 : 0) && lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIIlIl[16]);
                        "".length();
                    }
                }
            }
        }
    }
}
