package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.c  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/c.class */
public final class c {
    public static final /* synthetic */ c STEEL;
    private static /* synthetic */ int[] lIlIllllllIll;
    private static /* synthetic */ String[] lIlIlllllIllI;
    public static final /* synthetic */ c DRAGON;
    public static final /* synthetic */ c BLACK;
    public static final /* synthetic */ c ADAMANT;
    private final /* synthetic */ int ItemID;
    private final /* synthetic */ String name;
    public static final /* synthetic */ c BRONZE;
    private final /* synthetic */ int attackLevelRequired;
    public static final /* synthetic */ c RUNE;
    private final /* synthetic */ int woodcuttingLevelRequired;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ c MITHRIL;
    public static final /* synthetic */ c IRON;

    private c(String str, int i, String str2, int i2, int i3, int i4) {
        this.name = str2;
        this.attackLevelRequired = i2;
        this.woodcuttingLevelRequired = i3;
        this.ItemID = i4;
    }

    static {
        llIIIIlllIIIIll();
        llIIIIllIllllll();
        BRONZE = new c(lIlIlllllIllI[lIlIllllllIll[0]], lIlIllllllIll[0], lIlIlllllIllI[lIlIllllllIll[1]], lIlIllllllIll[1], lIlIllllllIll[1], lIlIllllllIll[2]);
        IRON = new c(lIlIlllllIllI[lIlIllllllIll[3]], lIlIllllllIll[1], lIlIlllllIllI[lIlIllllllIll[4]], lIlIllllllIll[1], lIlIllllllIll[3], lIlIllllllIll[5]);
        STEEL = new c(lIlIlllllIllI[lIlIllllllIll[6]], lIlIllllllIll[3], lIlIlllllIllI[lIlIllllllIll[7]], lIlIllllllIll[8], lIlIllllllIll[4], lIlIllllllIll[9]);
        BLACK = new c(lIlIlllllIllI[lIlIllllllIll[8]], lIlIllllllIll[4], lIlIlllllIllI[lIlIllllllIll[10]], lIlIllllllIll[8], lIlIllllllIll[6], lIlIllllllIll[11]);
        MITHRIL = new c(lIlIlllllIllI[lIlIllllllIll[12]], lIlIllllllIll[6], lIlIlllllIllI[lIlIllllllIll[13]], lIlIllllllIll[14], lIlIllllllIll[7], lIlIllllllIll[15]);
        ADAMANT = new c(lIlIlllllIllI[lIlIllllllIll[16]], lIlIllllllIll[7], lIlIlllllIllI[lIlIllllllIll[17]], lIlIllllllIll[18], lIlIllllllIll[8], lIlIllllllIll[19]);
        RUNE = new c(lIlIlllllIllI[lIlIllllllIll[20]], lIlIllllllIll[8], lIlIlllllIllI[lIlIllllllIll[21]], lIlIllllllIll[22], lIlIllllllIll[10], lIlIllllllIll[23]);
        DRAGON = new c(lIlIlllllIllI[lIlIllllllIll[24]], lIlIllllllIll[10], lIlIlllllIllI[lIlIllllllIll[25]], lIlIllllllIll[26], lIlIllllllIll[12], lIlIllllllIll[27]);
        c[] cVarArr = new c[lIlIllllllIll[12]];
        cVarArr[lIlIllllllIll[0]] = BRONZE;
        cVarArr[lIlIllllllIll[1]] = IRON;
        cVarArr[lIlIllllllIll[3]] = STEEL;
        cVarArr[lIlIllllllIll[4]] = BLACK;
        cVarArr[lIlIllllllIll[6]] = MITHRIL;
        cVarArr[lIlIllllllIll[7]] = ADAMANT;
        cVarArr[lIlIllllllIll[8]] = RUNE;
        cVarArr[lIlIllllllIll[10]] = DRAGON;
        $VALUES = cVarArr;
    }

    private static void llIIIIlllIIIIll() {
        lIlIllllllIll = new int[29];
        lIlIllllllIll[0] = (122 ^ 74) & ((191 ^ 143) ^ (-1));
        lIlIllllllIll[1] = " ".length();
        lIlIllllllIll[2] = (-((-389) & 31669)) & (-9) & 32639;
        lIlIllllllIll[3] = "  ".length();
        lIlIllllllIll[4] = "   ".length();
        lIlIllllllIll[5] = (-((-17473) & 32379)) & (-16385) & 32639;
        lIlIllllllIll[6] = (172 ^ 155) ^ (149 ^ 166);
        lIlIllllllIll[7] = (88 ^ 106) ^ (8 ^ 63);
        lIlIllllllIll[8] = (((42 + 102) - 116) + 154) ^ (((172 + 164) - 279) + 119);
        lIlIllllllIll[9] = (-((-4465) & 31217)) & (-4101) & 32205;
        lIlIllllllIll[10] = 187 ^ 188;
        lIlIllllllIll[11] = (-(55 ^ 26)) & (-16899) & 18303;
        lIlIllllllIll[12] = 203 ^ 195;
        lIlIllllllIll[13] = (102 ^ 4) ^ (232 ^ 131);
        lIlIllllllIll[14] = (14 ^ 74) ^ (10 ^ 91);
        lIlIllllllIll[15] = (-((-8473) & 11161)) & (-4113) & 8155;
        lIlIllllllIll[16] = 82 ^ 88;
        lIlIllllllIll[17] = (16 ^ 45) ^ (120 ^ 78);
        lIlIllllllIll[18] = 10 ^ 21;
        lIlIllllllIll[19] = (-20529) & 21885;
        lIlIllllllIll[20] = 100 ^ 104;
        lIlIllllllIll[21] = (((40 + 65) - (-28)) + 15) ^ (((26 + 148) - 117) + 96);
        lIlIllllllIll[22] = (((7 + 128) - (-66)) + 37) ^ (((157 + 42) - 62) + 62);
        lIlIllllllIll[23] = (-689) & 2047;
        lIlIllllllIll[24] = (15 ^ 29) ^ (77 ^ 81);
        lIlIllllllIll[25] = 66 ^ 77;
        lIlIllllllIll[26] = 164 ^ 153;
        lIlIllllllIll[27] = (-9225) & 15963;
        lIlIllllllIll[28] = (136 ^ 189) ^ (12 ^ 41);
    }

    public String v() {
        return this.name;
    }

    private static boolean llIIIIlllIIIlII(int i, int i2) {
        return i < i2;
    }

    private static String llIIIIllIlIllll(String llllllllllllllIllIIlllIIIlIlIlll, String llllllllllllllIllIIlllIIIlIlIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlllIIIlIlIllI.toCharArray();
        int llllllllllllllIllIIlllIIIlIlIIll = lIlIllllllIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIllllllIll[0];
        while (llIIIIlllIIIlII(i, length)) {
            char llllllllllllllIllIIlllIIIlIllIII = charArray2[i];
            sb.append((char) (llllllllllllllIllIIlllIIIlIllIII ^ charArray[llllllllllllllIllIIlllIIIlIlIIll % charArray.length]));
            "".length();
            llllllllllllllIllIIlllIIIlIlIIll++;
            i++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIIIllIllIIIl(String llllllllllllllIllIIlllIIIllIIlll, String llllllllllllllIllIIlllIIIllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIIIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllIIIllIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllIIIllIlIIl.init(lIlIllllllIll[3], secretKeySpec);
            return new String(llllllllllllllIllIIlllIIIllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIIIllIlIII) {
            llllllllllllllIllIIlllIIIllIlIII.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static void llIIIIllIllllll() {
        lIlIlllllIllI = new String[lIlIllllllIll[28]];
        lIlIlllllIllI[lIlIllllllIll[0]] = llIIIIllIlIllll("LCoWGQMr", "nxYWY");
        lIlIlllllIllI[lIlIllllllIll[1]] = llIIIIllIlIllll("Njg+DykR", "tJQaS");
        lIlIlllllIllI[lIlIllllllIll[3]] = llIIIIllIllIIII("aURRBhvSoLg=", "NfEbO");
        lIlIlllllIllI[lIlIllllllIll[4]] = llIIIIllIllIIIl("dU89zQKL/oQ=", "tUojz");
        lIlIlllllIllI[lIlIllllllIll[6]] = llIIIIllIlIllll("JD4xNAE=", "wjtqM");
        lIlIlllllIllI[lIlIllllllIll[7]] = llIIIIllIlIllll("NBYQDwc=", "gbujk");
        lIlIlllllIllI[lIlIllllllIll[8]] = llIIIIllIllIIIl("AWcGx/4TYjA=", "hhelS");
        lIlIlllllIllI[lIlIllllllIll[10]] = llIIIIllIlIllll("FjQOMQc=", "TXoRl");
        lIlIlllllIllI[lIlIllllllIll[12]] = llIIIIllIlIllll("LiIXBgUqJw==", "ckCNW");
        lIlIlllllIllI[lIlIllllllIll[13]] = llIIIIllIllIIIl("XyQ6mB+h5Yo=", "DDyBL");
        lIlIlllllIllI[lIlIllllllIll[16]] = llIIIIllIllIIIl("gslDW2W8pxY=", "AArQq");
        lIlIlllllIllI[lIlIllllllIll[17]] = llIIIIllIllIIIl("aPWp5LwgMXI=", "eXvll");
        lIlIlllllIllI[lIlIllllllIll[20]] = llIIIIllIllIIIl("kIxNmGvj29g=", "sZgyy");
        lIlIlllllIllI[lIlIllllllIll[21]] = llIIIIllIllIIII("+V1GwSeZMFI=", "TErGJ");
        lIlIlllllIllI[lIlIllllllIll[24]] = llIIIIllIllIIIl("08qPBKyqxnM=", "OCVnq");
        lIlIlllllIllI[lIlIllllllIll[25]] = llIIIIllIllIIII("cLLsjUWRwjk=", "wbPln");
    }

    private static String llIIIIllIllIIII(String llllllllllllllIllIIlllIIIlIIIIlI, String llllllllllllllIllIIlllIIIlIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIllllllIll[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllllllIll[3], llllllllllllllIllIIlllIIIlIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIIIlIIIIll) {
            llllllllllllllIllIIlllIIIlIIIIll.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public int y() {
        return this.ItemID;
    }

    public int w() {
        return this.attackLevelRequired;
    }

    public int x() {
        return this.woodcuttingLevelRequired;
    }
}
