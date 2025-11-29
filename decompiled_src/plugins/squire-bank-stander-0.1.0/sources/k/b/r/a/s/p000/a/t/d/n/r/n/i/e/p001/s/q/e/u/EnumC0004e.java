package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.e  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/e.class */
public final class EnumC0004e {
    public static final /* synthetic */ EnumC0004e MITHRIL;
    private /* synthetic */ int bar;
    private /* synthetic */ int secondaryOre;
    private static /* synthetic */ int[] lllIlIIlllI;
    private /* synthetic */ int primaryOreRequired;
    public static final /* synthetic */ EnumC0004e GOLD;
    private static /* synthetic */ String[] lllIlIIllIl;
    public static final /* synthetic */ EnumC0004e RUNITE;
    private /* synthetic */ int productionOption;
    private /* synthetic */ int secondaryAmountToWithdraw;
    private /* synthetic */ int primaryAmountToWithdraw;
    private /* synthetic */ int secondaryAmountRequired;
    public static final /* synthetic */ EnumC0004e ADAMANT;
    public static final /* synthetic */ EnumC0004e SILVER;
    public static final /* synthetic */ EnumC0004e IRON;
    private static final /* synthetic */ EnumC0004e[] $VALUES;
    public static final /* synthetic */ EnumC0004e BLURITE;
    private /* synthetic */ int primaryOre;
    public static final /* synthetic */ EnumC0004e BRONZE;
    public static final /* synthetic */ EnumC0004e STEEL;

    private EnumC0004e(String str, int i, int i2, int i3, int i4, int i5) {
        this.bar = i2;
        this.primaryOre = i3;
        this.primaryOreRequired = lllIlIIlllI[0];
        this.primaryAmountToWithdraw = i4;
        this.secondaryOre = lllIlIIlllI[1];
        this.secondaryAmountRequired = lllIlIIlllI[1];
        this.secondaryAmountToWithdraw = lllIlIIlllI[1];
        this.productionOption = i5;
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }

    private static void lIlIlllllIIIIl() {
        lllIlIIlllI = new int[35];
        lllIlIIlllI[0] = " ".length();
        lllIlIIlllI[1] = -" ".length();
        lllIlIIlllI[2] = ((74 ^ 107) ^ ((201 ^ 171) & ((11 ^ 105) ^ (-1)))) & (((117 ^ 20) ^ (56 ^ 120)) ^ (-" ".length()));
        lllIlIIlllI[3] = (-65) & 2413;
        lllIlIIlllI[4] = (-4609) & 5046;
        lllIlIIlllI[5] = (109 ^ 72) ^ (32 ^ 11);
        lllIlIIlllI[6] = (-((-6577) & 16372)) & (-16393) & 26623;
        lllIlIIlllI[7] = (-20741) & 30207;
        lllIlIIlllI[8] = (-((-29) & 30013)) & (-2113) & 32764;
        lllIlIIlllI[9] = (((72 + 116) - 166) + 118) ^ (((42 + 38) - 60) + 124);
        lllIlIIlllI[10] = "  ".length();
        lllIlIIlllI[11] = (-16913) & 19263;
        lllIlIIlllI[12] = (-31302) & 31741;
        lllIlIIlllI[13] = "   ".length();
        lllIlIIlllI[14] = (-((-8369) & 13493)) & (-24641) & 32119;
        lllIlIIlllI[15] = (-((-12465) & 31989)) & (-4097) & 24062;
        lllIlIIlllI[16] = (((94 + 30) - 114) + 156) ^ (((79 + 132) - 118) + 69);
        lllIlIIlllI[17] = (-((-19217) & 32735)) & (-16385) & 32255;
        lllIlIIlllI[18] = 132 ^ 141;
        lllIlIIlllI[19] = (-((-1425) & 28089)) & (-4115) & 31231;
        lllIlIIlllI[20] = (163 ^ 190) ^ (76 ^ 66);
        lllIlIIlllI[21] = (153 ^ 181) ^ (87 ^ 126);
        lllIlIIlllI[22] = (-16905) & 19261;
        lllIlIIlllI[23] = (-((-8243) & 26227)) & (-8194) & 26621;
        lllIlIIlllI[24] = 96 ^ 102;
        lllIlIIlllI[25] = (-521) & 2879;
        lllIlIIlllI[26] = (-((-7443) & 24403)) & (-8193) & 25599;
        lllIlIIlllI[27] = (206 ^ 169) ^ (247 ^ 152);
        lllIlIIlllI[28] = 9 ^ 29;
        lllIlIIlllI[29] = 9 ^ 14;
        lllIlIIlllI[30] = (-16967) & 19327;
        lllIlIIlllI[31] = (-((-24769) & 26351)) & (-18449) & 20479;
        lllIlIIlllI[32] = 138 ^ 146;
        lllIlIIlllI[33] = (-((-2093) & 16045)) & (-5) & 16319;
        lllIlIIlllI[34] = (-((-395) & 15279)) & (-17425) & 32759;
    }

    public int u() {
        return this.secondaryAmountRequired;
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    private static String lIlIllllIllllI(String llllllllllllllllIIlIIlIllIllllII, String llllllllllllllllIIlIIlIllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIllIlllIll.getBytes(StandardCharsets.UTF_8)), lllIlIIlllI[27]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIlllI[10], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIllIllllIl) {
            llllllllllllllllIIlIIlIllIllllIl.printStackTrace();
            return null;
        }
    }

    public int v() {
        return this.secondaryAmountToWithdraw;
    }

    public int s() {
        return this.primaryAmountToWithdraw;
    }

    private static boolean lIlIlllllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllllIlllIl(String llllllllllllllllIIlIIlIllIIlllll, String llllllllllllllllIIlIIlIllIIllllI) {
        String llllllllllllllllIIlIIlIllIIlllll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIllIIlllIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIlIllIIllllI.toCharArray();
        int llllllllllllllllIIlIIlIllIIllIll = lllIlIIlllI[2];
        char[] charArray2 = llllllllllllllllIIlIIlIllIIlllll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIIlIIlIllIIlIIll = lllIlIIlllI[2];
        while (lIlIlllllIIIlI(llllllllllllllllIIlIIlIllIIlIIll, length)) {
            char llllllllllllllllIIlIIlIllIlIIIII = charArray2[llllllllllllllllIIlIIlIllIIlIIll];
            llllllllllllllllIIlIIlIllIIlllIl.append((char) (llllllllllllllllIIlIIlIllIlIIIII ^ charArray[llllllllllllllllIIlIIlIllIIllIll % charArray.length]));
            "".length();
            llllllllllllllllIIlIIlIllIIllIll++;
            llllllllllllllllIIlIIlIllIIlIIll++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlIllIIlllIl);
    }

    public int r() {
        return this.primaryOreRequired;
    }

    public int q() {
        return this.primaryOre;
    }

    private static String lIlIllllIlllll(String llllllllllllllllIIlIIlIllIlIllll, String llllllllllllllllIIlIIlIllIlIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIllIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIllIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIllIllIIIl.init(lllIlIIlllI[10], llllllllllllllllIIlIIlIllIllIIlI);
            return new String(llllllllllllllllIIlIIlIllIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIllIllIIII) {
            llllllllllllllllIIlIIlIllIllIIII.printStackTrace();
            return null;
        }
    }

    public int p() {
        return this.bar;
    }

    private EnumC0004e(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.bar = i2;
        this.primaryOre = i3;
        this.primaryOreRequired = i4;
        this.primaryAmountToWithdraw = i5;
        this.secondaryOre = i6;
        this.secondaryAmountToWithdraw = i7;
        this.secondaryAmountRequired = i8;
        this.productionOption = i9;
    }

    private static void lIlIlllllIIIII() {
        lllIlIIllIl = new String[lllIlIIlllI[18]];
        lllIlIIllIl[lllIlIIlllI[2]] = lIlIllllIlllIl("MT0/AzY2", "sopMl");
        lllIlIIllIl[lllIlIIlllI[0]] = lIlIllllIllllI("mrHD0t2b7po=", "EwATV");
        lllIlIIllIl[lllIlIIlllI[10]] = lIlIllllIlllll("xKXafWY4Zf0=", "fGGBH");
        lllIlIIllIl[lllIlIIlllI[13]] = lIlIllllIlllll("7QBlvM8zF7U=", "Ohoej");
        lllIlIIllIl[lllIlIIlllI[16]] = lIlIllllIlllIl("BB8MEj4=", "WKIWr");
        lllIlIIllIl[lllIlIIlllI[21]] = lIlIllllIlllll("oyfEMFfoSfo=", "aKPOz");
        lllIlIIllIl[lllIlIIlllI[24]] = lIlIllllIlllIl("PxMHODc7Fg==", "rZSpe");
        lllIlIIllIl[lllIlIIlllI[29]] = lIlIllllIlllll("zvl+sIKApjY=", "SgZZM");
        lllIlIIllIl[lllIlIIlllI[27]] = lIlIllllIllllI("xKpe5+0EI4c=", "FRcjW");
    }

    public int w() {
        return this.productionOption;
    }

    static {
        lIlIlllllIIIIl();
        lIlIlllllIIIII();
        BRONZE = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[2]], lllIlIIlllI[2], lllIlIIlllI[3], lllIlIIlllI[4], lllIlIIlllI[0], lllIlIIlllI[5], lllIlIIlllI[6], lllIlIIlllI[5], lllIlIIlllI[0], lllIlIIlllI[0]);
        BLURITE = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[0]], lllIlIIlllI[0], lllIlIIlllI[7], lllIlIIlllI[8], lllIlIIlllI[9], lllIlIIlllI[10]);
        IRON = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[10]], lllIlIIlllI[10], lllIlIIlllI[11], lllIlIIlllI[12], lllIlIIlllI[9], lllIlIIlllI[13]);
        SILVER = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[13]], lllIlIIlllI[13], lllIlIIlllI[14], lllIlIIlllI[15], lllIlIIlllI[9], lllIlIIlllI[16]);
        STEEL = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[16]], lllIlIIlllI[16], lllIlIIlllI[17], lllIlIIlllI[12], lllIlIIlllI[0], lllIlIIlllI[18], lllIlIIlllI[19], lllIlIIlllI[20], lllIlIIlllI[10], lllIlIIlllI[21]);
        GOLD = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[21]], lllIlIIlllI[21], lllIlIIlllI[22], lllIlIIlllI[23], lllIlIIlllI[9], lllIlIIlllI[24]);
        MITHRIL = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[24]], lllIlIIlllI[24], lllIlIIlllI[25], lllIlIIlllI[26], lllIlIIlllI[0], lllIlIIlllI[27], lllIlIIlllI[19], lllIlIIlllI[28], lllIlIIlllI[16], lllIlIIlllI[29]);
        ADAMANT = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[29]], lllIlIIlllI[29], lllIlIIlllI[30], lllIlIIlllI[31], lllIlIIlllI[0], lllIlIIlllI[16], lllIlIIlllI[19], lllIlIIlllI[32], lllIlIIlllI[24], lllIlIIlllI[27]);
        RUNITE = new EnumC0004e(lllIlIIllIl[lllIlIIlllI[27]], lllIlIIlllI[27], lllIlIIlllI[33], lllIlIIlllI[34], lllIlIIlllI[0], lllIlIIlllI[13], lllIlIIlllI[19], lllIlIIlllI[32], lllIlIIlllI[27], lllIlIIlllI[18]);
        EnumC0004e[] enumC0004eArr = new EnumC0004e[lllIlIIlllI[18]];
        enumC0004eArr[lllIlIIlllI[2]] = BRONZE;
        enumC0004eArr[lllIlIIlllI[0]] = BLURITE;
        enumC0004eArr[lllIlIIlllI[10]] = IRON;
        enumC0004eArr[lllIlIIlllI[13]] = SILVER;
        enumC0004eArr[lllIlIIlllI[16]] = STEEL;
        enumC0004eArr[lllIlIIlllI[21]] = GOLD;
        enumC0004eArr[lllIlIIlllI[24]] = MITHRIL;
        enumC0004eArr[lllIlIIlllI[29]] = ADAMANT;
        enumC0004eArr[lllIlIIlllI[27]] = RUNITE;
        $VALUES = enumC0004eArr;
    }

    public int t() {
        return this.secondaryOre;
    }
}
