package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.K  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/K.class */
public class K implements S {
    private static final /* synthetic */ WorldPoint hV;
    private static final /* synthetic */ WorldPoint hU;
    private static final /* synthetic */ WorldPoint hX;
    static /* synthetic */ int ck;
    private static /* synthetic */ String[] lllllllllI;
    private static /* synthetic */ int[] llllllllll;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint hW;
    static /* synthetic */ int bS;
    public static final /* synthetic */ String[] hT;
    public static /* synthetic */ List<C0003d> bu;

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cY();
            "".length();
            if ((34 ^ 38) <= "   ".length()) {
                return (60 ^ 95) & ((74 ^ 41) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllllllll[51];
    }

    private static boolean llIllIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIIllIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllllllll[1]];
        iArr[llllllllll[0]] = llllllllll[11];
        if (llIllIIlIlIII(Inventory.contains(iArr) ? 1 : 0) && ((!llIllIIlIlIlI(Inventory.contains(C0005f.aQ) ? 1 : 0) || llIllIIlIlIII(Equipment.contains(C0005f.aQ) ? 1 : 0)) && llIllIIlIlIII(Inventory.contains(C0005f.aU) ? 1 : 0))) {
            int[] iArr2 = new int[llllllllll[1]];
            iArr2[llllllllll[0]] = llllllllll[13];
            if (llIllIIlIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llllllllll[1]];
                iArr3[llllllllll[0]] = llllllllll[4];
                if (llIllIIlIlIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = llllllllll[1];
                    "".length();
                    return " ".length() < 0 ? ((((175 + 179) - 295) + 163) ^ (((38 + 9) - 0) + 85)) & (((((87 + 169) - 246) + 192) ^ (((135 + 86) - 78) + 1)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llllllllll[0];
    }

    private static void ae() {
        int[] iArr = new int[llllllllll[1]];
        iArr[llllllllll[0]] = llllllllll[10];
        if (llIllIIlIlIlI(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(llllllllll[10], llllllllll[1], llllllllll[46]));
            "".length();
        }
        int[] iArr2 = new int[llllllllll[1]];
        iArr2[llllllllll[0]] = llllllllll[4];
        if (llIllIIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(llllllllll[4], llllllllll[15], llllllllll[47]));
            "".length();
        }
        if (llIllIIlIlIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllllllllI[llllllllll[53]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(llllllllll[48], llllllllll[8], llllllllll[49]));
            "".length();
        }
        int[] iArr3 = new int[llllllllll[1]];
        iArr3[llllllllll[0]] = llllllllll[11];
        if (llIllIIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(llllllllll[11], llllllllll[15], llllllllll[50]));
            "".length();
        }
        int[] iArr4 = new int[llllllllll[1]];
        iArr4[llllllllll[0]] = llllllllll[13];
        if (llIllIIlIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllllllll[13], llllllllll[31], llllllllll[50]));
            "".length();
        }
        int[] iArr5 = new int[llllllllll[1]];
        iArr5[llllllllll[0]] = llllllllll[12];
        if (llIllIIlIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllllllll[12], llllllllll[8], C0008i.bp));
            "".length();
        }
    }

    private static void llIllIIlIIIll() {
        lllllllllI = new String[llllllllll[74]];
        lllllllllI[llllllllll[0]] = llIllIIlIIIII("/frgTpq0jWcJtqYQ1Bikqw==", "ZyhJF");
        lllllllllI[llllllllll[1]] = llIllIIlIIIIl("MignIB0cJC1pDAE4ICcJVCg9LAMHbWk6GR01KiEHGiZpKw8XKmk9AVQwPCwdAA==", "tAIIn");
        lllllllllI[llllllllll[3]] = llIllIIlIIIIl("Mys7CxM=", "wYRex");
        lllllllllI[llllllllll[5]] = llIllIIlIIIlI("jRRmvXzWDCI=", "cufKa");
        lllllllllI[llllllllll[7]] = llIllIIlIIIIl("DDs1Yw0teiEiFyk=", "BZCCy");
        lllllllllI[llllllllll[8]] = llIllIIlIIIIl("GAQ2JgA5Cz9iDjELMysCNw==", "PeXBl");
        lllllllllI[llllllllll[14]] = llIllIIlIIIII("IiELxQSbMN9c4k2G3UQfPS+Q6zOuCU+L4qClSbGD5sZR+AQYTyc3a4CniueMAr9CuBXSiE5qVCg=", "pKtTT");
        lllllllllI[llllllllll[20]] = llIllIIlIIIlI("5/Kf2gNPv31xoW/x2w2sKg==", "RsAHf");
        lllllllllI[llllllllll[18]] = llIllIIlIIIIl("Nw0RZC4WTBQwOwsY", "ylgDZ");
        lllllllllI[llllllllll[21]] = llIllIIlIIIlI("nyM3yqN6vvDxrG2vJCK8TA==", "ujTfs");
        lllllllllI[llllllllll[15]] = llIllIIlIIIIl("DxQTHSY7VSYQMSwWDA==", "IuguC");
        lllllllllI[llllllllll[19]] = llIllIIlIIIlI("8wxgzt6h8BKq9D9Amuvj9vitL1f5yPXx", "SPWcr");
        lllllllllI[llllllllll[22]] = llIllIIlIIIIl("HCMWNSo0LhY5NjJtDCA7", "UMbPX");
        lllllllllI[llllllllll[23]] = llIllIIlIIIII("vBrGkQhqX7k=", "UWDIB");
        lllllllllI[llllllllll[24]] = llIllIIlIIIII("NPpo6Cwk05A=", "aWbGK");
        lllllllllI[llllllllll[25]] = llIllIIlIIIII("YU08rqTNQRU=", "BQhiG");
        lllllllllI[llllllllll[26]] = llIllIIlIIIIl("HAofCiEoSz4QLDQOEg==", "ZkkbD");
        lllllllllI[llllllllll[28]] = llIllIIlIIIIl("DwIXFg==", "XgvdZ");
        lllllllllI[llllllllll[29]] = llIllIIlIIIlI("rHHLSqjZWd/EDFAQJcBLOA==", "HVXTX");
        lllllllllI[llllllllll[30]] = llIllIIlIIIII("NRuGQ3OIlfKnITC4L2hWqw==", "BNfSP");
        lllllllllI[llllllllll[31]] = llIllIIlIIIIl("GRwqIA8uCip0BCMWKiA=", "KyYTc");
        lllllllllI[llllllllll[32]] = llIllIIlIIIIl("NSo8Jj8CPDxyNA8gPCY=", "gOORS");
        lllllllllI[llllllllll[33]] = llIllIIlIIIIl("MxgIITwe", "pwnGU");
        lllllllllI[llllllllll[34]] = llIllIIlIIIlI("VWutPYbJy/E=", "jxrMp");
        lllllllllI[llllllllll[35]] = llIllIIlIIIlI("t338YkRYkAw6tltD+2RpRA==", "WMWzT");
        lllllllllI[llllllllll[36]] = llIllIIlIIIII("5szYKETJvq1F2qZf4WmpXA==", "WugNq");
        lllllllllI[llllllllll[37]] = llIllIIlIIIlI("ZlVrB1UxjbQ=", "vdRyS");
        lllllllllI[llllllllll[38]] = llIllIIlIIIIl("BBwgJAY/", "WyAVe");
        lllllllllI[llllllllll[39]] = llIllIIlIIIIl("Jz8NPA==", "pZlNu");
        lllllllllI[llllllllll[40]] = llIllIIlIIIII("2MyKDQanbY6Bv15rDJHkhg==", "DvMeW");
        lllllllllI[llllllllll[41]] = llIllIIlIIIlI("8PK3A4U2j7cfuoYffzoDJw==", "dXdeN");
        lllllllllI[llllllllll[42]] = llIllIIlIIIII("1TiPXgKNwxU=", "ScGAV");
        lllllllllI[llllllllll[43]] = llIllIIlIIIlI("THjD5xxkXmM=", "RGldy");
        lllllllllI[llllllllll[44]] = llIllIIlIIIIl("NjgOIg==", "yHkLm");
        lllllllllI[llllllllll[45]] = llIllIIlIIIlI("Cv5IQ0WgYJ9lAlFHsFkD6Q==", "pifei");
        lllllllllI[llllllllll[52]] = llIllIIlIIIIl("Iy07IwsUOzt3ABknOyNHAD0tJBM=", "qHHWg");
        lllllllllI[llllllllll[53]] = llIllIIlIIIlI("vZJI5cah87pXHrjV/OnCbVsgPscRV0Av", "jdQRN");
        lllllllllI[llllllllll[54]] = llIllIIlIIIIl("Kwx7ZRpDCncwI0QBODdzBQl3JDcSAjkxJhYCeQ==", "dgWES");
        lllllllllI[llllllllll[55]] = llIllIIlIIIlI("sYG3intiioAK67QVxOyegHqYK2YLMPV+FPPVfJ3spWwd034P63wfEQ==", "onPXY");
        lllllllllI[llllllllll[56]] = llIllIIlIIIIl("FSIVEDQ2bQkSMDw+Rw46LT9HHzA0PUY=", "XMgwU");
        lllllllllI[llllllllll[57]] = llIllIIlIIIII("tgOuE1dmSok=", "UqEYr");
        lllllllllI[llllllllll[58]] = llIllIIlIIIlI("pcgZItDY4nhdXREHUtZ2/BtjlXza1N3uXo7VQdSNQkc=", "innkG");
        lllllllllI[llllllllll[59]] = llIllIIlIIIII("kLTu5uwvoMjwBfu8nSf550d+XvXQSxpf", "ntzfk");
        lllllllllI[llllllllll[60]] = llIllIIlIIIII("eRjUYNrloduOEGYUzcqIileymiTjKNpPngdphBc0u69/CEP3L2BmNw==", "BYTnD");
        lllllllllI[llllllllll[61]] = llIllIIlIIIIl("Gh9jGWE1FTBKIHIdLAUyJlosCzQ8Di0EJnISLRlhNQglHCQrGzYObw==", "RzDjA");
        lllllllllI[llllllllll[62]] = llIllIIlIIIIl("Hw00VlooBzNaDiMEKFoXI0gzEhsySDASH2YYNhUYKg0pWhM1Rg==", "FhDzz");
        lllllllllI[llllllllll[63]] = llIllIIlIIIlI("LgWSympXBsk=", "VTBrN");
        lllllllllI[llllllllll[64]] = llIllIIlIIIII("UxiDIoio/QQv10WfOZjTus3knyneaJdS2ObRieR2lzZGiSu+g6qrPQ==", "teYhX");
        lllllllllI[llllllllll[65]] = llIllIIlIIIlI("lwTD42ikIDi2vZ1fBW4zOw==", "acEee");
        lllllllllI[llllllllll[66]] = llIllIIlIIIII("jP1k1JgB/RQBMJSNIabz9Q==", "AOggx");
    }

    private static int llIllIIlIIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIllIIlIllIl(Object obj) {
        return obj != null;
    }

    private static String llIllIIlIIIIl(String lllllllllllllllllIlIIIIlIIllIlll, String lllllllllllllllllIlIIIIlIIllIllI) {
        String lllllllllllllllllIlIIIIlIIllIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIIIlIIllIllI.toCharArray();
        int lllllllllllllllllIlIIIIlIIllIIll = llllllllll[0];
        char[] charArray2 = lllllllllllllllllIlIIIIlIIllIlll2.toCharArray();
        int length = charArray2.length;
        int i = llllllllll[0];
        while (llIllIIlIlIIl(i, length)) {
            char lllllllllllllllllIlIIIIlIIlllIII = charArray2[i];
            sb.append((char) (lllllllllllllllllIlIIIIlIIlllIII ^ charArray[lllllllllllllllllIlIIIIlIIllIIll % charArray.length]));
            "".length();
            lllllllllllllllllIlIIIIlIIllIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIllIIlIllII(int i) {
        return i > 0;
    }

    private static boolean llIllIIlIlIII(int i) {
        return i != 0;
    }

    private static String llIllIIlIIIII(String lllllllllllllllllIlIIIIlIIlIIIlI, String lllllllllllllllllIlIIIIlIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIlIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llllllllll[18]), "DES");
            Cipher lllllllllllllllllIlIIIIlIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIIlIIlIIlII.init(llllllllll[3], lllllllllllllllllIlIIIIlIIlIIlIl);
            return new String(lllllllllllllllllIlIIIIlIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIlIIlIIIll) {
            lllllllllllllllllIlIIIIlIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlIlIlI(int i) {
        return i == 0;
    }

    private static boolean llIllIIlIlllI(Object obj) {
        return obj == null;
    }

    private static void llIllIIlIIllI() {
        llllllllll = new int[75];
        llllllllll[0] = "  ".length() & ("  ".length() ^ (-1));
        llllllllll[1] = " ".length();
        llllllllll[2] = 2 ^ 68;
        llllllllll[3] = "  ".length();
        llllllllll[4] = (-((-395) & 16271)) & (-16385) & 32639;
        llllllllll[5] = "   ".length();
        llllllllll[6] = 227 ^ 136;
        llllllllll[7] = 85 ^ 81;
        llllllllll[8] = (25 ^ 51) ^ (80 ^ 127);
        llllllllll[9] = (-26641) & 31640;
        llllllllll[10] = (-17) & 11994;
        llllllllll[11] = (-6) & 8013;
        llllllllll[12] = (-((-6425) & 23453)) & (-1059) & 30711;
        llllllllll[13] = (-((-5191) & 21631)) & (-1) & 24447;
        llllllllll[14] = (((126 + 73) - 59) + 8) ^ (((72 + 29) - 97) + 142);
        llllllllll[15] = (60 ^ 1) ^ (148 ^ 163);
        llllllllll[16] = (-((-24617) & 29227)) & (-24598) & 32447;
        llllllllll[17] = (-((-10785) & 27185)) & (-268) & 19871;
        llllllllll[18] = (47 ^ 104) ^ (108 ^ 35);
        llllllllll[19] = (97 ^ 58) ^ (70 ^ 22);
        llllllllll[20] = (63 ^ 84) ^ (210 ^ 190);
        llllllllll[21] = (((178 + 168) - 204) + 63) ^ (((32 + 35) - 62) + 191);
        llllllllll[22] = 161 ^ 173;
        llllllllll[23] = 129 ^ 140;
        llllllllll[24] = (42 ^ 124) ^ (121 ^ 33);
        llllllllll[25] = 51 ^ 60;
        llllllllll[26] = (((66 + 147) - 120) + 65) ^ (((16 + 81) - (-40)) + 5);
        llllllllll[27] = (-((-2149) & 23031)) & (-1030) & 22463;
        llllllllll[28] = (((97 + 142) - 60) + 5) ^ (((156 + 167) - 270) + 116);
        llllllllll[29] = (25 ^ 45) ^ (155 ^ 189);
        llllllllll[30] = (28 ^ 27) ^ (148 ^ 128);
        llllllllll[31] = 124 ^ 104;
        llllllllll[32] = (((125 + 13) - (-36)) + 15) ^ (((105 + 129) - 101) + 35);
        llllllllll[33] = 47 ^ 57;
        llllllllll[34] = (((100 + 25) - (-8)) + 49) ^ (((67 + 100) - 12) + 6);
        llllllllll[35] = (6 ^ 48) ^ (32 ^ 14);
        llllllllll[36] = (177 ^ 166) ^ (108 ^ 98);
        llllllllll[37] = (((26 + 87) - 81) + 104) ^ (((144 + 124) - 178) + 56);
        llllllllll[38] = (189 ^ 153) ^ (52 ^ 11);
        llllllllll[39] = 68 ^ 88;
        llllllllll[40] = 106 ^ 119;
        llllllllll[41] = (233 ^ 197) ^ (188 ^ 142);
        llllllllll[42] = 92 ^ 67;
        llllllllll[43] = (49 ^ 69) ^ (30 ^ 74);
        llllllllll[44] = 68 ^ 101;
        llllllllll[45] = (81 ^ 114) ^ " ".length();
        llllllllll[46] = (-417) & 16316;
        llllllllll[47] = (-8306) & 14205;
        llllllllll[48] = (-((-1929) & 22426)) & (-3) & 32479;
        llllllllll[49] = (-2582) & 27581;
        llllllllll[50] = (-24707) & 26606;
        llllllllll[51] = ((125 ^ 46) & ((99 ^ 48) ^ (-1))) ^ (86 ^ 50);
        llllllllll[52] = (((58 + 61) - (-5)) + 27) ^ (((63 + 160) - 71) + 28);
        llllllllll[53] = 185 ^ 157;
        llllllllll[54] = 112 ^ 85;
        llllllllll[55] = (68 ^ 86) ^ (54 ^ 2);
        llllllllll[56] = (((135 + 48) - 147) + 119) ^ (((36 + 127) - 1) + 26);
        llllllllll[57] = 183 ^ 159;
        llllllllll[58] = (169 ^ 161) ^ (154 ^ 187);
        llllllllll[59] = 6 ^ 44;
        llllllllll[60] = (112 ^ 29) ^ (192 ^ 134);
        llllllllll[61] = 1 ^ 45;
        llllllllll[62] = 105 ^ 68;
        llllllllll[63] = 100 ^ 74;
        llllllllll[64] = (75 ^ 117) ^ (8 ^ 25);
        llllllllll[65] = (226 ^ 184) ^ (109 ^ 7);
        llllllllll[66] = (160 ^ 168) ^ (129 ^ 184);
        llllllllll[67] = (-773) & 3982;
        llllllllll[68] = (-((-8229) & 29110)) & (-1) & 24027;
        llllllllll[69] = (-((-4697) & 21215)) & (-4370) & 24063;
        llllllllll[70] = (-((-2069) & 23327)) & (-1) & 24507;
        llllllllll[71] = (-8966) & 12159;
        llllllllll[72] = (-21393) & 24510;
        llllllllll[73] = (-2721) & 12286;
        llllllllll[74] = 171 ^ 153;
    }

    private static boolean llIllIIlIlIll(int i) {
        return i < 0;
    }

    static {
        llIllIIlIIllI();
        llIllIIlIIIll();
        String[] strArr = new String[llllllllll[23]];
        strArr[llllllllll[0]] = lllllllllI[llllllllll[54]];
        strArr[llllllllll[1]] = lllllllllI[llllllllll[55]];
        strArr[llllllllll[3]] = lllllllllI[llllllllll[56]];
        strArr[llllllllll[5]] = lllllllllI[llllllllll[57]];
        strArr[llllllllll[7]] = lllllllllI[llllllllll[58]];
        strArr[llllllllll[8]] = lllllllllI[llllllllll[59]];
        strArr[llllllllll[14]] = lllllllllI[llllllllll[60]];
        strArr[llllllllll[20]] = lllllllllI[llllllllll[61]];
        strArr[llllllllll[18]] = lllllllllI[llllllllll[62]];
        strArr[llllllllll[21]] = lllllllllI[llllllllll[63]];
        strArr[llllllllll[15]] = lllllllllI[llllllllll[64]];
        strArr[llllllllll[19]] = lllllllllI[llllllllll[65]];
        strArr[llllllllll[22]] = lllllllllI[llllllllll[66]];
        hT = strArr;
        hU = new WorldPoint(llllllllll[16], llllllllll[67], llllllllll[0]);
        hV = new WorldPoint(llllllllll[68], llllllllll[69], llllllllll[0]);
        hW = new WorldPoint(llllllllll[70], llllllllll[71], llllllllll[0]);
        hX = new WorldPoint(llllllllll[72], llllllllll[73], llllllllll[0]);
        bu = new ArrayList();
        bS = llllllllll[0];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllllllI[llllllllll[52]];
    }

    private static boolean llIllIIllIIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIllIIlIllll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void cY() {
        if (llIllIIlIlIII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllllI[llllllllll[0]];
            C0001b.a(bu);
            if (llIllIIlIlIIl(bu.size(), llllllllll[1])) {
                System.out.println(lllllllllI[llllllllll[1]]);
                bs = llllllllll[0];
            }
        }
        if (llIllIIlIlIlI(bs ? 1 : 0)) {
            if (llIllIIlIlIII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIllIIlIlIIl(Movement.getRunEnergy(), llllllllll[2])) {
                Inventory.getFirst(C0005f.aU).interact(lllllllllI[llllllllll[3]]);
                Time.sleepTicks(llllllllll[1]);
                "".length();
            }
            if (llIllIIlIlIll(llIllIIlIIlll(C0004e.u(), 70.0d))) {
                int[] iArr = new int[llllllllll[1]];
                iArr[llllllllll[0]] = llllllllll[4];
                if (llIllIIlIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllllllll[1]];
                    iArr2[llllllllll[0]] = llllllllll[4];
                    Inventory.getFirst(iArr2).interact(lllllllllI[llllllllll[5]]);
                }
            }
            if (llIllIIlIlIlI(Movement.isRunEnabled() ? 1 : 0) && llIllIIlIllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIllIIlIlIlI(aa() ? 1 : 0) && llIllIIlIlIIl(C0004e.j(llllllllll[6]), llllllllll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllIIlIllIl(nearest) && llIllIIlIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llllllllll[3]);
                    "".length();
                }
                if (llIllIIlIllIl(nearest) && llIllIIlIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[8]];
                    if (llIllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllllllll[9]);
                        "".length();
                    }
                    if (llIllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (llIllIIlIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllllllll[7]);
                            "".length();
                        }
                        if (llIllIIlIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllllllll[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[llllllllll[8]];
                        iArr3[llllllllll[0]] = llllllllll[10];
                        iArr3[llllllllll[1]] = llllllllll[11];
                        iArr3[llllllllll[3]] = llllllllll[12];
                        iArr3[llllllllll[5]] = llllllllll[13];
                        iArr3[llllllllll[7]] = llllllllll[4];
                        if (llIllIIlIlIlI(C0004e.b(iArr3) ? 1 : 0)) {
                            ae();
                            System.out.println(lllllllllI[llllllllll[14]]);
                            bs = llllllllll[1];
                            return;
                        }
                        Bank.withdraw(llllllllll[11], llllllllll[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllllll[1]);
                        "".length();
                        Bank.withdraw(llllllllll[13], llllllllll[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllllll[1]);
                        "".length();
                        Bank.withdraw(llllllllll[10], llllllllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllllll[1]);
                        "".length();
                        C0000a.b(C0005f.aU, llllllllll[1]);
                        C0000a.a(llllllllll[4], llllllllll[15]);
                        C0000a.b(C0005f.be, llllllllll[1]);
                    }
                }
            }
            if (llIllIIlIlIII(aa() ? 1 : 0) && llIllIIlIlIIl(C0004e.j(llllllllll[6]), llllllllll[1])) {
                new WorldArea(llllllllll[16], llllllllll[17], llllllllll[18], llllllllll[19], llllllllll[0]);
                String[] strArr = new String[llllllllll[1]];
                strArr[llllllllll[0]] = lllllllllI[llllllllll[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (llIllIIlIlllI(nearest2) && llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hU), llllllllll[5]) && llIllIIlIlIlI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[18]];
                    if (llIllIIlIlIIl(bS, llllllllll[1])) {
                        C0004e.v();
                        bS += llllllllll[1];
                    }
                    Movement.walkTo(hU);
                    "".length();
                    Time.sleepTicks(llllllllll[1]);
                    "".length();
                }
                if (llIllIIlIllIl(nearest2)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[21]];
                    C0006g.a(lllllllllI[llllllllll[15]], hT, llllllllll[1]);
                }
            }
            if (llIllIIllIIII(C0004e.j(llllllllll[6]), llllllllll[1])) {
                if (llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hV), llllllllll[14])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[19]];
                    Movement.walkTo(hV);
                    "".length();
                    Time.sleepTicks(llllllllll[1]);
                    "".length();
                }
                if (llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hV), llllllllll[14])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[22]];
                    String[] strArr2 = new String[llllllllll[1]];
                    strArr2[llllllllll[0]] = lllllllllI[llllllllll[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (llIllIIlIllIl(nearest3)) {
                        String[] strArr3 = new String[llllllllll[1]];
                        strArr3[llllllllll[0]] = lllllllllI[llllllllll[24]];
                        if (llIllIIlIlIII(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(lllllllllI[llllllllll[25]]);
                            Time.sleepTicks(llllllllll[8]);
                            "".length();
                        }
                    }
                    C0006g.a(lllllllllI[llllllllll[26]], hT);
                }
            }
            if (llIllIIllIIII(C0004e.j(llllllllll[6]), llllllllll[3])) {
                if (llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    int[] iArr4 = new int[llllllllll[1]];
                    iArr4[llllllllll[0]] = llllllllll[27];
                    if (llIllIIlIlIII(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llllllllll[1]];
                        iArr5[llllllllll[0]] = llllllllll[27];
                        Inventory.getFirst(iArr5).interact(lllllllllI[llllllllll[28]]);
                        Time.sleepTicks(llllllllll[1]);
                        "".length();
                    }
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[29]];
                    Movement.walkTo(hW);
                    "".length();
                    Time.sleepTicks(llllllllll[1]);
                    "".length();
                }
                if (llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[30]];
                    String[] strArr4 = new String[llllllllll[1]];
                    strArr4[llllllllll[0]] = lllllllllI[llllllllll[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (llIllIIlIllIl(nearest4)) {
                        C0006g.a(lllllllllI[llllllllll[32]], hT);
                    }
                    if (llIllIIlIlllI(nearest4)) {
                        String[] strArr5 = new String[llllllllll[1]];
                        strArr5[llllllllll[0]] = lllllllllI[llllllllll[33]];
                        TileObjects.getNearest(strArr5).interact(lllllllllI[llllllllll[34]]);
                        Time.sleepTicks(llllllllll[3]);
                        "".length();
                    }
                }
            }
            if (llIllIIllIIII(C0004e.j(llllllllll[6]), llllllllll[5])) {
                ck = llllllllll[0];
                if (llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hX), llllllllll[5])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[35]];
                    Movement.walkTo(hX);
                    "".length();
                    Time.sleepTicks(llllllllll[1]);
                    "".length();
                }
                if (llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hX), llllllllll[5])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[36]];
                    String[] strArr6 = new String[llllllllll[1]];
                    strArr6[llllllllll[0]] = lllllllllI[llllllllll[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (llIllIIlIllIl(nearest5)) {
                        nearest5.interact(lllllllllI[llllllllll[38]]);
                    }
                }
            }
            if (llIllIIllIIII(C0004e.j(llllllllll[6]), llllllllll[7])) {
                if (llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    int[] iArr6 = new int[llllllllll[1]];
                    iArr6[llllllllll[0]] = llllllllll[27];
                    if (llIllIIlIlIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llllllllll[1]];
                        iArr7[llllllllll[0]] = llllllllll[27];
                        Inventory.getFirst(iArr7).interact(lllllllllI[llllllllll[39]]);
                        Time.sleepTicks(llllllllll[1]);
                        "".length();
                    }
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[40]];
                    Movement.walkTo(hW);
                    "".length();
                    Time.sleepTicks(llllllllll[1]);
                    "".length();
                }
                if (llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[41]];
                    String[] strArr7 = new String[llllllllll[1]];
                    strArr7[llllllllll[0]] = lllllllllI[llllllllll[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (llIllIIlIllIl(nearest6)) {
                        String[] strArr8 = new String[llllllllll[1]];
                        strArr8[llllllllll[0]] = lllllllllI[llllllllll[43]];
                        if (llIllIIlIlIII(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(lllllllllI[llllllllll[44]]);
                            Time.sleepTicks(llllllllll[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[llllllllll[1]];
                        strArr9[llllllllll[0]] = lllllllllI[llllllllll[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (llIllIIlIllIl(first)) {
                            if (llIllIIlIlIIl(ck, llllllllll[1])) {
                                ac.mP += llllllllll[1];
                                ac.d(AccBuilderTempleTrek.m);
                                ck += llllllllll[1];
                                ac.mP = llllllllll[0];
                                cl = llllllllll[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(llllllllll[5]);
                            "".length();
                        }
                    }
                }
                C0006g.a(hT);
            }
            C0006g.a(new String[llllllllll[0]]);
        }
    }

    private static String llIllIIlIIIlI(String lllllllllllllllllIlIIIIlIlIIIlll, String lllllllllllllllllIlIIIIlIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIlIlIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIlIlIIlIIl.init(llllllllll[3], secretKeySpec);
            return new String(lllllllllllllllllIlIIIIlIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIlIlIIlIII) {
            lllllllllllllllllIlIIIIlIlIIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllllllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIllIIllIIII(C0004e.j(llllllllll[6]), llllllllll[8])) {
            ?? r0 = llllllllll[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllllllll[0];
    }
}
