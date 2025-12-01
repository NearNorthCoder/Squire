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
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Q  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/Q.class */
public class Q implements S {
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint iH;
    private static /* synthetic */ int[] lllIllIIII;
    static /* synthetic */ int ck;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ String[] iK;
    public static final /* synthetic */ WorldPoint iI;
    private static /* synthetic */ String[] lllIlIllll;
    public static /* synthetic */ List<C0003d> bu;
    public static final /* synthetic */ WorldPoint iJ;
    static /* synthetic */ int bS;

    private static boolean llIIIlllllIIl(int i) {
        return i <= 0;
    }

    private static boolean llIIIllllIlII(int i) {
        return i > 0;
    }

    private static void llIIIlllIllIl() {
        lllIlIllll = new String[lllIllIIII[65]];
        lllIlIllll[lllIllIIII[0]] = llIIIlllIlIlI("vz4qT+7YSQsxngXp9q515g==", "CirNa");
        lllIlIllll[lllIllIIII[1]] = llIIIlllIlIll("Nj8bHjIYMxFXIwUvHBkmUD8BEiwDelUENhkiFh8oHjFVFSATPVUDLlAnABIyBA==", "pVuwA");
        lllIlIllll[lllIllIIII[3]] = llIIIlllIlIlI("ynfI661BHj4=", "RgnsX");
        lllIlIllll[lllIllIIII[5]] = llIIIlllIllII("8AoX+CPxsmQ=", "GRyfg");
        lllIlIllll[lllIllIIII[8]] = llIIIlllIlIlI("Dt3mpW7D4A2jlx+GmWMifw==", "cRbnK");
        lllIlIllll[lllIllIIII[9]] = llIIIlllIllII("ZO0NVuNcIlNRb69otn3gAWcB5ahOxarU", "LjqeB");
        lllIlIllll[lllIllIIII[16]] = llIIIlllIlIll("BD9ZGRU2ehQRFCAzFx9HIi8cCxNzKQwIFz8zHAtLcykOERMwMhAWAHMuFlglBgMwNiA=", "SZyxg");
        lllIlIllll[lllIllIIII[19]] = llIIIlllIlIlI("dyo6rUzApsQCsJ8LGThNhw==", "pWzLx");
        lllIlIllll[lllIllIIII[20]] = llIIIlllIllII("RLFHtu/NXHc2qbH0kBcSKw==", "jEQdt");
        lllIlIllll[lllIllIIII[21]] = llIIIlllIlIll("LhoqMQ==", "juECl");
        lllIlIllll[lllIllIIII[18]] = llIIIlllIllII("0o2/n5DFsfE=", "ioctq");
        lllIlIllll[lllIllIIII[22]] = llIIIlllIlIlI("uSyx4ftrjCk=", "JHBsW");
        lllIlIllll[lllIllIIII[23]] = llIIIlllIlIlI("hoe0TJjM0YY=", "woIVy");
        lllIlIllll[lllIllIIII[24]] = llIIIlllIllII("r3Duhx93FtrgvSxiQNs0fQ==", "JeSCZ");
        lllIlIllll[lllIllIIII[25]] = llIIIlllIllII("LBNCc9CGzpZ2EcOOjh+3kA==", "JIeNt");
        lllIlIllll[lllIllIIII[26]] = llIIIlllIlIlI("Vb2TgvZVF/5Cob76cc32Mw==", "YwLwX");
        lllIlIllll[lllIllIIII[27]] = llIIIlllIlIll("AQ8OZwwgTgomFigL", "OnxGx");
        lllIlIllll[lllIllIIII[28]] = llIIIlllIlIlI("YLUhFP7c1UlnqzCmG33n2A==", "BJQOO");
        lllIlIllll[lllIllIIII[29]] = llIIIlllIlIll("LiEfPQgJbh0zDBk=", "mNpVm");
        lllIlIllll[lllIllIIII[30]] = llIIIlllIlIlI("8GcSI6KCfE0=", "rihqz");
        lllIlIllll[lllIllIIII[31]] = llIIIlllIlIll("OAkXMQg=", "jhyVm");
        lllIlIllll[lllIllIIII[32]] = llIIIlllIlIlI("loR3vq/BY9c=", "PwoYZ");
        lllIlIllll[lllIllIIII[33]] = llIIIlllIlIll("FzsUAw11IwMMDQ==", "UNfmy");
        lllIlIllll[lllIllIIII[34]] = llIIIlllIlIlI("xb/piPvE78Ltmo4rKmGD7Q==", "vuuQV");
        lllIlIllll[lllIllIIII[35]] = llIIIlllIlIll("LS4YcBAMbxwxEA==", "cOnPd");
        lllIlIllll[lllIllIIII[36]] = llIIIlllIlIll("OCswYQdKPiUvGA==", "jJDFt");
        lllIlIllll[lllIllIIII[37]] = llIIIlllIllII("6+5HTMwilGI=", "OEDTA");
        lllIlIllll[lllIllIIII[38]] = llIIIlllIlIll("Ch8BETUg", "KkupV");
        lllIlIllll[lllIllIIII[39]] = llIIIlllIlIll("GgYzBw==", "NgXbG");
        lllIlIllll[lllIllIIII[40]] = llIIIlllIlIll("Bxg5HRdlAC4SFw==", "EmKsc");
        lllIlIllll[lllIllIIII[41]] = llIIIlllIlIlI("/vRCAD7fc1YbUllU5mqNNA==", "SGRtV");
        lllIlIllll[lllIllIIII[42]] = llIIIlllIlIlI("ET1ha9fxG0UBHG8pHPS6EA==", "BBrFY");
        lllIlIllll[lllIllIIII[43]] = llIIIlllIlIll("GTYbITEjLB1zND8nCSc=", "JBzSE");
        lllIlIllll[lllIllIIII[44]] = llIIIlllIlIll("CikYEBg=", "BLlda");
        lllIlIllll[lllIllIIII[45]] = llIIIlllIlIlI("GNhF1CPu5WLBwHBCxRiDpQ==", "QokeE");
        lllIlIllll[lllIllIIII[46]] = llIIIlllIlIlI("au4nO7hqDL5gTf6fDVKwpA==", "Vibhr");
        lllIlIllll[lllIllIIII[47]] = llIIIlllIllII("4j+vn6ZqU/AESTTP0l84Sw==", "hSIAh");
        lllIlIllll[lllIllIIII[48]] = llIIIlllIlIlI("aUkL539N0Ag=", "saWcI");
        lllIlIllll[lllIllIIII[55]] = llIIIlllIllII("hqthVBstEFezX4TEYdST5/xiDUtuB8bq", "xEYJt");
        lllIlIllll[lllIllIIII[56]] = llIIIlllIlIll("HS4WKloAIVg6Hw4rDCVaRw==", "oGxMz");
        lllIlIllll[lllIllIIII[53]] = llIIIlllIlIlI("u/kLqJC/wp2fpr9/U4aXEtHzVYFfSy34DZy0rPHSZos=", "MYhtY");
        lllIlIllll[lllIllIIII[63]] = llIIIlllIlIll("Ngo7elQHCiQmVAIKaDQRDAAlM1QAAS12AwYbIHYZFk8sNwYECjp2BwYLLXg=", "ooHVt");
        lllIlIllll[lllIllIIII[64]] = llIIIlllIllII("yZfz/nwoN0Q=", "cLQhh");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[lllIllIIII[1]];
        iArr[lllIllIIII[0]] = lllIllIIII[14];
        if (llIIIllllIIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIllIIII[1]];
            iArr2[lllIllIIII[0]] = lllIllIIII[11];
            if (llIIIllllIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllIllIIII[1]];
                iArr3[lllIllIIII[0]] = lllIllIIII[15];
                if (llIIIllllIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lllIllIIII[1];
                    "".length();
                    return " ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lllIllIIII[0];
    }

    private static int llIIIlllIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIlIllll[lllIllIIII[55]];
    }

    private static boolean llIIIllllIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIllllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIIlllIllII(String lllllllllllllllllIllIlIIlllllIIl, String lllllllllllllllllIllIlIIlllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIlllllIII.getBytes(StandardCharsets.UTF_8)), lllIllIIII[20]), "DES");
            Cipher lllllllllllllllllIllIlIIlllllIll = Cipher.getInstance("DES");
            lllllllllllllllllIllIlIIlllllIll.init(lllIllIIII[3], secretKeySpec);
            return new String(lllllllllllllllllIllIlIIlllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIIlllllIlI) {
            lllllllllllllllllIllIlIIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIIlllIlllI() {
        lllIllIIII = new int[66];
        lllIllIIII[0] = (20 ^ 31) & ((167 ^ 172) ^ (-1));
        lllIllIIII[1] = " ".length();
        lllIllIIII[2] = (54 ^ 18) ^ (77 ^ 47);
        lllIllIIII[3] = "  ".length();
        lllIllIIII[4] = (-((-15) & 14863)) & (-17537) & 32763;
        lllIllIIII[5] = "   ".length();
        lllIllIIII[6] = (-((-16993) & 32381)) & (-16385) & 32767;
        lllIllIIII[7] = 128 ^ 195;
        lllIllIIII[8] = (203 ^ 154) ^ (65 ^ 20);
        lllIllIIII[9] = (66 ^ 91) ^ (183 ^ 171);
        lllIllIIII[10] = (-((-4441) & 15741)) & (-19) & 16318;
        lllIllIIII[11] = (-25257) & 27390;
        lllIllIIII[12] = (-1159) & 13783;
        lllIllIIII[13] = (-16513) & 24519;
        lllIllIIII[14] = (((28 ^ 62) + (((17 + 124) - (-9)) + 70)) - (2 ^ 81)) + (103 ^ 85);
        lllIllIIII[15] = (-((-9765) & 13951)) & (-16385) & 22527;
        lllIllIIII[16] = (46 ^ 74) ^ (167 ^ 197);
        lllIllIIII[17] = (-16417) & 24425;
        lllIllIIII[18] = (91 ^ 121) ^ (3 ^ 43);
        lllIllIIII[19] = 188 ^ 187;
        lllIllIIII[20] = 60 ^ 52;
        lllIllIIII[21] = (27 ^ 21) ^ (38 ^ 33);
        lllIllIIII[22] = (((45 + 109) - 48) + 44) ^ (((138 + 156) - 233) + 96);
        lllIllIIII[23] = 202 ^ 198;
        lllIllIIII[24] = 43 ^ 38;
        lllIllIIII[25] = 105 ^ 103;
        lllIllIIII[26] = 121 ^ 118;
        lllIllIIII[27] = 137 ^ 153;
        lllIllIIII[28] = 68 ^ 85;
        lllIllIIII[29] = 84 ^ 70;
        lllIllIIII[30] = (136 ^ 174) ^ (22 ^ 35);
        lllIllIIII[31] = (85 ^ 36) ^ (233 ^ 140);
        lllIllIIII[32] = (((141 + 110) - 178) + 73) ^ (((117 + 40) - 104) + 82);
        lllIllIIII[33] = (0 ^ 124) ^ (168 ^ 194);
        lllIllIIII[34] = (94 ^ 35) ^ (193 ^ 171);
        lllIllIIII[35] = (219 ^ 151) ^ (200 ^ 156);
        lllIllIIII[36] = 218 ^ 195;
        lllIllIIII[37] = (175 ^ 188) ^ (167 ^ 174);
        lllIllIIII[38] = 133 ^ 158;
        lllIllIIII[39] = 101 ^ 121;
        lllIllIIII[40] = 17 ^ 12;
        lllIllIIII[41] = (86 ^ 99) ^ (91 ^ 112);
        lllIllIIII[42] = 140 ^ 147;
        lllIllIIII[43] = (((67 + 127) - 148) + 106) ^ (((171 + 0) - 5) + 18);
        lllIllIIII[44] = (((30 + 107) - 31) + 75) ^ (((89 + 49) - 69) + 79);
        lllIllIIII[45] = 12 ^ 46;
        lllIllIIII[46] = (243 ^ 131) ^ (33 ^ 114);
        lllIllIIII[47] = 31 ^ 59;
        lllIllIIII[48] = (((1 + 85) - (-48)) + 96) ^ (((156 + 143) - 230) + 126);
        lllIllIIII[49] = (-26692) & 32591;
        lllIllIIII[50] = (-16689) & 28668;
        lllIllIIII[51] = (-5143) & 30142;
        lllIllIIII[52] = (-12289) & 14188;
        lllIllIIII[53] = 77 ^ 101;
        lllIllIIII[54] = 13 ^ 105;
        lllIllIIII[55] = (((85 + 56) - 128) + 155) ^ (((53 + 2) - (-26)) + 61);
        lllIllIIII[56] = 166 ^ 129;
        lllIllIIII[57] = (-((-129) & 9413)) & (-20514) & 32765;
        lllIllIIII[58] = (-((-1155) & 22171)) & (-8257) & 32477;
        lllIllIIII[59] = (-28771) & 31739;
        lllIllIIII[60] = (-25429) & 28639;
        lllIllIIII[61] = (-((-6157) & 30847)) & (-5121) & 32767;
        lllIllIIII[62] = (-((-3203) & 28291)) & (-297) & 28587;
        lllIllIIII[63] = (184 ^ 190) ^ (2 ^ 45);
        lllIllIIII[64] = 116 ^ 94;
        lllIllIIII[65] = (((88 + 162) - 174) + 91) ^ (((124 + 132) - 178) + 62);
    }

    private static boolean llIIIllllIIII(int i) {
        return i != 0;
    }

    private static boolean llIIIllllIIll(int i) {
        return i < 0;
    }

    static {
        llIIIlllIlllI();
        llIIIlllIllIl();
        iH = new WorldPoint(lllIllIIII[57], lllIllIIII[58], lllIllIIII[0]);
        iI = new WorldPoint(lllIllIIII[59], lllIllIIII[60], lllIllIIII[0]);
        iJ = new WorldPoint(lllIllIIII[61], lllIllIIII[62], lllIllIIII[0]);
        String[] strArr = new String[lllIllIIII[5]];
        strArr[lllIllIIII[0]] = lllIlIllll[lllIllIIII[53]];
        strArr[lllIllIIII[1]] = lllIlIllll[lllIllIIII[63]];
        strArr[lllIllIIII[3]] = lllIlIllll[lllIllIIII[64]];
        iK = strArr;
        bu = new ArrayList();
        bS = lllIllIIII[0];
    }

    private static boolean llIIIllllIlIl(Object obj) {
        return obj != null;
    }

    private static void ae() {
        int[] iArr = new int[lllIllIIII[1]];
        iArr[lllIllIIII[0]] = lllIllIIII[15];
        if (llIIIllllIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIII[15], lllIllIIII[1], lllIllIIII[49]));
            "".length();
        }
        int[] iArr2 = new int[lllIllIIII[1]];
        iArr2[lllIllIIII[0]] = lllIllIIII[11];
        if (llIIIllllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIII[11], lllIllIIII[1], lllIllIIII[49]));
            "".length();
        }
        int[] iArr3 = new int[lllIllIIII[1]];
        iArr3[lllIllIIII[0]] = lllIllIIII[14];
        if (llIIIllllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIII[14], lllIllIIII[1], lllIllIIII[49]));
            "".length();
        }
        if (llIIIllllIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlIllll[lllIllIIII[56]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIII[50], lllIllIIII[9], lllIllIIII[51]));
            "".length();
        }
        int[] iArr4 = new int[lllIllIIII[1]];
        iArr4[lllIllIIII[0]] = lllIllIIII[17];
        if (llIIIllllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIII[17], lllIllIIII[18], lllIllIIII[52]));
            "".length();
        }
        int[] iArr5 = new int[lllIllIIII[1]];
        iArr5[lllIllIIII[0]] = lllIllIIII[13];
        if (llIIIllllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIII[13], lllIllIIII[53], lllIllIIII[52]));
            "".length();
        }
        int[] iArr6 = new int[lllIllIIII[1]];
        iArr6[lllIllIIII[0]] = lllIllIIII[12];
        if (llIIIllllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIII[12], lllIllIIII[9], C0008i.bp));
            "".length();
        }
    }

    private static String llIIIlllIlIlI(String lllllllllllllllllIllIlIlIIIllllI, String lllllllllllllllllIllIlIlIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIlIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIlIlIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIlIlIIlIIIII.init(lllIllIIII[3], lllllllllllllllllIllIlIlIIlIIIIl);
            return new String(lllllllllllllllllIllIlIlIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIlIIIlllll) {
            lllllllllllllllllIllIlIlIIIlllll.printStackTrace();
            return null;
        }
    }

    private static String llIIIlllIlIll(String lllllllllllllllllIllIlIlIIIIlllI, String lllllllllllllllllIllIlIlIIIIllIl) {
        String lllllllllllllllllIllIlIlIIIIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIllIlIlIIIIllIl.toCharArray();
        int lllllllllllllllllIllIlIlIIIIlIlI = lllIllIIII[0];
        char[] charArray2 = lllllllllllllllllIllIlIlIIIIlllI2.toCharArray();
        int length = charArray2.length;
        int i = lllIllIIII[0];
        while (llIIIllllIIIl(i, length)) {
            char lllllllllllllllllIllIlIlIIIIllll = charArray2[i];
            sb.append((char) (lllllllllllllllllIllIlIlIIIIllll ^ charArray[lllllllllllllllllIllIlIlIIIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllllIllIlIlIIIIlIlI++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
        if (llIIIllllIlII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04db, code lost:
        if (llIIIllllIlII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v364, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dn() {
        if (llIIIllllIIII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[0]];
            C0001b.a(bu);
            if (llIIIllllIIIl(bu.size(), lllIllIIII[1])) {
                System.out.println(lllIlIllll[lllIllIIII[1]]);
                bs = lllIllIIII[0];
            }
        }
        if (llIIIllllIIlI(bs ? 1 : 0)) {
            if (llIIIllllIIII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIIllllIIIl(Movement.getRunEnergy(), lllIllIIII[2])) {
                Inventory.getFirst(C0005f.aU).interact(lllIlIllll[lllIllIIII[3]]);
                Time.sleepTicks(lllIllIIII[1]);
                "".length();
            }
            if (llIIIllllIIll(llIIIlllIllll(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lllIllIIII[1]];
                iArr[lllIllIIII[0]] = lllIllIIII[4];
                if (llIIIllllIIII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIllIIII[1]];
                    iArr2[lllIllIIII[0]] = lllIllIIII[4];
                    Inventory.getFirst(iArr2).interact(lllIlIllll[lllIllIIII[5]]);
                }
            }
            if (llIIIllllIIlI(Movement.isRunEnabled() ? 1 : 0) && llIIIllllIlII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIIIllllIIII(aa() ? 1 : 0)) {
                int[] iArr3 = new int[lllIllIIII[1]];
                iArr3[lllIllIIII[0]] = lllIllIIII[6];
            }
            if (llIIIllllIIIl(C0004e.j(lllIllIIII[7]), lllIllIIII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIllllIlIl(nearest) && llIIIllllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[8]];
                    Movement.walkTo(nearest);
                    "".length();
                    Time.sleepTicks(lllIllIIII[3]);
                    "".length();
                }
                if (llIIIllllIlIl(nearest) && llIIIllllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[9]];
                    if (llIIIllllIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIllIIII[10]);
                        "".length();
                    }
                    if (llIIIllllIIII(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIllllIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIllIIII[8]);
                            "".length();
                        }
                        if (llIIIllllIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIllIIII[3]);
                            "".length();
                        }
                        int[] iArr4 = new int[lllIllIIII[9]];
                        iArr4[lllIllIIII[0]] = lllIllIIII[11];
                        iArr4[lllIllIIII[1]] = lllIllIIII[12];
                        iArr4[lllIllIIII[3]] = lllIllIIII[13];
                        iArr4[lllIllIIII[5]] = lllIllIIII[14];
                        iArr4[lllIllIIII[8]] = lllIllIIII[15];
                        if (llIIIllllIIlI(C0004e.b(iArr4) ? 1 : 0)) {
                            ae();
                            System.out.println(lllIlIllll[lllIllIIII[16]]);
                            bs = lllIllIIII[1];
                            return;
                        }
                        Bank.withdraw(lllIllIIII[11], lllIllIIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIIII[1]);
                        "".length();
                        Bank.withdraw(lllIllIIII[14], lllIllIIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIIII[1]);
                        "".length();
                        Bank.withdraw(lllIllIIII[15], lllIllIIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIIII[1]);
                        "".length();
                        Bank.withdraw(lllIllIIII[17], lllIllIIII[18], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIIII[1]);
                        "".length();
                        Bank.withdraw(lllIllIIII[13], lllIllIIII[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIIII[1]);
                        "".length();
                        C0000a.b(C0005f.aU, lllIllIIII[1]);
                        C0000a.a(lllIllIIII[4], lllIllIIII[18]);
                        C0000a.b(C0005f.be, lllIllIIII[1]);
                    }
                }
            }
            if (llIIIllllIIIl(C0004e.j(lllIllIIII[7]), lllIllIIII[1]) && llIIIllllIIII(aa() ? 1 : 0)) {
                if (llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[5])) {
                    AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[19]];
                    if (llIIIllllIIIl(bS, lllIllIIII[1])) {
                        C0004e.v();
                        bS += lllIllIIII[1];
                    }
                    Movement.walkTo(iH);
                    "".length();
                    Time.sleepTicks(lllIllIIII[1]);
                    "".length();
                }
                if (llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[9])) {
                    AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[20]];
                    String[] strArr = new String[lllIllIIII[1]];
                    strArr[lllIllIIII[0]] = lllIlIllll[lllIllIIII[21]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (llIIIllllIlIl(nearest2)) {
                        String[] strArr2 = new String[lllIllIIII[1]];
                        strArr2[lllIllIIII[0]] = lllIlIllll[lllIllIIII[18]];
                        if (llIIIllllIIII(nearest2.hasAction(strArr2) ? 1 : 0) && llIIIllllIlll(nearest2.getWorldLocation().distanceTo(iH), lllIllIIII[16])) {
                            nearest2.interact(lllIlIllll[lllIllIIII[22]]);
                            Time.sleepTicks(lllIllIIII[5]);
                            "".length();
                        }
                    }
                    C0006g.a(lllIlIllll[lllIllIIII[23]], iK, lllIllIIII[1]);
                }
            }
            if (llIIIlllllIII(C0004e.j(lllIllIIII[7]), lllIllIIII[1])) {
                String[] strArr3 = new String[lllIllIIII[1]];
                strArr3[lllIllIIII[0]] = lllIlIllll[lllIllIIII[24]];
                if (llIIIllllIIIl(Inventory.getCount(strArr3), lllIllIIII[1])) {
                    String[] strArr4 = new String[lllIllIIII[1]];
                    strArr4[lllIllIIII[0]] = lllIlIllll[lllIllIIII[25]];
                    if (llIIIlllllIIl(Inventory.getCount(strArr4))) {
                        String[] strArr5 = new String[lllIllIIII[1]];
                        strArr5[lllIllIIII[0]] = lllIlIllll[lllIllIIII[26]];
                    }
                    ck = lllIllIIII[0];
                    if (llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iI), lllIllIIII[3])) {
                        AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[27]];
                        Movement.walkTo(iI);
                        "".length();
                        Time.sleepTicks(lllIllIIII[1]);
                        "".length();
                    }
                    if (llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iI), lllIllIIII[3])) {
                        String[] strArr6 = new String[lllIllIIII[1]];
                        strArr6[lllIllIIII[0]] = lllIlIllll[lllIllIIII[28]];
                        Item first = Inventory.getFirst(strArr6);
                        String[] strArr7 = new String[lllIllIIII[1]];
                        strArr7[lllIllIIII[0]] = lllIlIllll[lllIllIIII[29]];
                        Item first2 = Inventory.getFirst(strArr7);
                        if (llIIIllllIlIl(first)) {
                            String[] strArr8 = new String[lllIllIIII[1]];
                            strArr8[lllIllIIII[0]] = lllIlIllll[lllIllIIII[30]];
                            first.useOn(TileObjects.getNearest(strArr8));
                            Time.sleepTicks(lllIllIIII[3]);
                            "".length();
                        }
                        if (llIIIllllIlIl(first2)) {
                            String[] strArr9 = new String[lllIllIIII[1]];
                            strArr9[lllIllIIII[0]] = lllIlIllll[lllIllIIII[31]];
                            first2.useOn(TileObjects.getNearest(strArr9));
                            Time.sleepTicks(lllIllIIII[3]);
                            "".length();
                        }
                        Keyboard.type(lllIlIllll[lllIllIIII[32]]);
                    }
                }
            }
            if (llIIIlllllIII(C0004e.j(lllIllIIII[7]), lllIllIIII[1])) {
                String[] strArr10 = new String[lllIllIIII[1]];
                strArr10[lllIllIIII[0]] = lllIlIllll[lllIllIIII[33]];
                if (llIIIllllIlII(Inventory.getCount(strArr10))) {
                    String[] strArr11 = new String[lllIllIIII[1]];
                    strArr11[lllIllIIII[0]] = lllIlIllll[lllIllIIII[34]];
                    if (llIIIllllIIIl(Inventory.getCount(strArr11), lllIllIIII[1])) {
                        if (llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIllIIII[3])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[35]];
                            Movement.walkTo(iJ);
                            "".length();
                            Time.sleepTicks(lllIllIIII[1]);
                            "".length();
                        }
                        if (llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIllIIII[3])) {
                            String[] strArr12 = new String[lllIllIIII[1]];
                            strArr12[lllIllIIII[0]] = lllIlIllll[lllIllIIII[36]];
                            TileItem nearest3 = TileItems.getNearest(strArr12);
                            if (llIIIlllllIlI(nearest3)) {
                                String[] strArr13 = new String[lllIllIIII[1]];
                                strArr13[lllIllIIII[0]] = lllIlIllll[lllIllIIII[37]];
                                NPCs.getNearest(strArr13).interact(lllIlIllll[lllIllIIII[38]]);
                                Time.sleepTicks(lllIllIIII[9]);
                                "".length();
                            }
                            if (llIIIllllIlIl(nearest3)) {
                                nearest3.interact(lllIlIllll[lllIllIIII[39]]);
                                Time.sleepTicks(lllIllIIII[3]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIIIlllllIII(C0004e.j(lllIllIIII[7]), lllIllIIII[1])) {
                String[] strArr14 = new String[lllIllIIII[1]];
                strArr14[lllIllIIII[0]] = lllIlIllll[lllIllIIII[40]];
                if (llIIIllllIlII(Inventory.getCount(strArr14))) {
                    String[] strArr15 = new String[lllIllIIII[1]];
                    strArr15[lllIllIIII[0]] = lllIlIllll[lllIllIIII[41]];
                    if (llIIIllllIlII(Inventory.getCount(strArr15))) {
                        if (llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[5])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[42]];
                            Movement.walkTo(iH);
                            "".length();
                            Time.sleepTicks(lllIllIIII[1]);
                            "".length();
                        }
                        if (llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[9])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[43]];
                            C0006g.a(lllIlIllll[lllIllIIII[44]], iK, lllIllIIII[1]);
                        }
                    }
                }
            }
            if (llIIIlllllIII(C0004e.j(lllIllIIII[7]), lllIllIIII[3])) {
                String[] strArr16 = new String[lllIllIIII[1]];
                strArr16[lllIllIIII[0]] = lllIlIllll[lllIllIIII[45]];
                TileObject nearest4 = TileObjects.getNearest(strArr16);
                if (llIIIllllIlIl(nearest4)) {
                    String[] strArr17 = new String[lllIllIIII[1]];
                    strArr17[lllIllIIII[0]] = lllIlIllll[lllIllIIII[46]];
                    if (llIIIllllIIII(nearest4.hasAction(strArr17) ? 1 : 0)) {
                        if (llIIIllllIIIl(ck, lllIllIIII[1])) {
                            ac.mJ += lllIllIIII[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIllIIII[1];
                            ac.mJ = lllIllIIII[0];
                            cl = lllIllIIII[0];
                        }
                        nearest4.interact(lllIlIllll[lllIllIIII[47]]);
                        Time.sleepTicks(lllIllIIII[5]);
                        "".length();
                    }
                }
                C0006g.a(iK);
            }
            if (llIIIlllllIII(C0004e.j(lllIllIIII[7]), lllIllIIII[5]) && llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[41])) {
                int[] iArr5 = new int[lllIllIIII[1]];
                iArr5[lllIllIIII[0]] = lllIllIIII[13];
                if (llIIIllllIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIllIIII[1]];
                    iArr6[lllIllIIII[0]] = lllIllIIII[13];
                    Inventory.getFirst(iArr6).interact(lllIlIllll[lllIllIIII[48]]);
                    Time.sleepTicks(lllIllIIII[16]);
                    "".length();
                }
            }
            C0006g.a(new String[lllIllIIII[0]]);
            System.out.println("Setting: " + C0004e.j(lllIllIIII[7]));
        }
    }

    private static boolean llIIIllllIlll(int i, int i2) {
        return i <= i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dn();
            "".length();
            if ((-" ".length()) > (124 ^ 120)) {
                return (223 ^ 135) & ((96 ^ 56) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return lllIllIIII[54];
    }

    private static boolean llIIIlllllIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIIIlllllIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIIlllllIII(C0004e.j(lllIllIIII[7]), lllIllIIII[5]) && llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[41])) {
            ?? r0 = lllIllIIII[1];
            "".length();
            return "   ".length() == 0 ? ((64 ^ 127) ^ (106 ^ 78)) & (((((137 + 67) - 57) + 22) ^ (((134 + 106) - 78) + 16)) ^ (-" ".length())) : r0;
        }
        return lllIllIIII[0];
    }

    private static boolean llIIIllllIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllIllIIII[0];
    }
}
