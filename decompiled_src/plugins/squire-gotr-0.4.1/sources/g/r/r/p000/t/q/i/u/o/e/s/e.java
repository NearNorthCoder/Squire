package g.r.r.p000.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.e  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/e.class */
public final class e {
    private final /* synthetic */ int degradedBaseHoldAmount;
    public static final /* synthetic */ e MEDIUM;
    public static final /* synthetic */ e LARGE;
    private /* synthetic */ boolean unknown;
    public static final /* synthetic */ e SMALL;
    private static /* synthetic */ String[] llIIllllllII;
    public static final /* synthetic */ e GIANT;
    public static final /* synthetic */ e COLOSSAL;
    private final /* synthetic */ int baseHoldAmount;
    private /* synthetic */ int holding;
    private static final /* synthetic */ e[] $VALUES;
    private /* synthetic */ boolean degraded;
    private static /* synthetic */ int[] llIIllllllll;

    private static String lllllllllIllll(String lllllllllllllllIlIIlIlIllIIIllll, String lllllllllllllllIlIIlIlIllIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIllIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIllIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIllIIlIIIl.init(llIIllllllll[5], lllllllllllllllIlIIlIlIllIIlIIlI);
            return new String(lllllllllllllllIlIIlIlIllIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIllIIlIIII) {
            lllllllllllllllIlIIlIlIllIIlIIII.printStackTrace();
            return null;
        }
    }

    private e(String str, int i, int i2) {
        this(str, i, i2, llIIllllllll[0]);
    }

    public boolean ag() {
        return this.unknown;
    }

    private static boolean lllllllllllllI(int i, int i2) {
        return i != i2;
    }

    public int ac() {
        if (lllllllllllIll(this.degraded ? 1 : 0)) {
            int i = this.degradedBaseHoldAmount;
            "".length();
            return " ".length() >= ((81 ^ 93) ^ (189 ^ 181)) ? ((((208 + 83) - 214) + 148) ^ (((5 + 12) - (-143)) + 19)) & (((73 ^ 102) ^ (223 ^ 162)) ^ (-" ".length())) : i;
        }
        return this.baseHoldAmount;
    }

    public void b(boolean z) {
        this.unknown = z;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    private static boolean llllllllllllII(int i) {
        return i < 0;
    }

    public static e c(int i) {
        switch (i) {
            case 5509:
                return SMALL;
            case 5510:
            case 5511:
                return MEDIUM;
            case 5512:
            case 5513:
                return LARGE;
            case 5514:
            case 5515:
                return GIANT;
            case 26784:
            case 26786:
            case 26906:
                return COLOSSAL;
            default:
                return null;
        }
    }

    private static boolean llllllllllllIl(int i, int i2) {
        return i > i2;
    }

    private static void llllllllllIIll() {
        llIIllllllII = new String[llIIllllllll[12]];
        llIIllllllII[llIIllllllll[2]] = lllllllllIllll("roeDGAGHD8A=", "JirXw");
        llIIllllllII[llIIllllllll[1]] = llllllllllIIlI("KhEnAjQq", "gTcKa");
        llIIllllllII[llIIllllllll[5]] = llllllllllIIlI("ODYaJQA=", "twHbE");
        llIIllllllII[llIIllllllll[3]] = lllllllllIllll("IWdkr/xFzhI=", "lgBEr");
        llIIllllllII[llIIllllllll[9]] = llllllllllIIlI("OSsdGT8pJR0=", "zdQVl");
    }

    public void d(int i) {
        int i2;
        this.holding += i;
        if (lllllllllllIll(this.degraded ? 1 : 0)) {
            i2 = this.degradedBaseHoldAmount;
            "".length();
            if ((-"   ".length()) >= 0) {
                return;
            }
        } else {
            i2 = this.baseHoldAmount;
        }
        int i3 = i2;
        if (llllllllllllII(this.holding)) {
            this.holding = llIIllllllll[2];
        }
        if (llllllllllllIl(this.holding, i3)) {
            this.holding = i3;
        }
    }

    private static String llllllllllIIlI(String lllllllllllllllIlIIlIlIllIlIIlII, String lllllllllllllllIlIIlIlIllIlIIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIlIllIlIIIll.toCharArray();
        int lllllllllllllllIlIIlIlIllIlIIIII = llIIllllllll[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllllllll[2];
        while (llllllllllllll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlIlIllIlIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIlIllIlIIIII++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lllllllllllIlI();
        llllllllllIIll();
        SMALL = new e(llIIllllllII[llIIllllllll[2]], llIIllllllll[2], llIIllllllll[3]);
        MEDIUM = new e(llIIllllllII[llIIllllllll[1]], llIIllllllll[1], llIIllllllll[4], llIIllllllll[3]);
        LARGE = new e(llIIllllllII[llIIllllllll[5]], llIIllllllll[5], llIIllllllll[6], llIIllllllll[7]);
        GIANT = new e(llIIllllllII[llIIllllllll[3]], llIIllllllll[3], llIIllllllll[8], llIIllllllll[6]);
        COLOSSAL = new e(llIIllllllII[llIIllllllll[9]], llIIllllllll[9], llIIllllllll[10], llIIllllllll[11]);
        e[] eVarArr = new e[llIIllllllll[12]];
        eVarArr[llIIllllllll[2]] = SMALL;
        eVarArr[llIIllllllll[1]] = MEDIUM;
        eVarArr[llIIllllllll[5]] = LARGE;
        eVarArr[llIIllllllll[3]] = GIANT;
        eVarArr[llIIllllllll[9]] = COLOSSAL;
        $VALUES = eVarArr;
    }

    private static void lllllllllllIlI() {
        llIIllllllll = new int[13];
        llIIllllllll[0] = -" ".length();
        llIIllllllll[1] = " ".length();
        llIIllllllll[2] = (69 ^ 72) & ((7 ^ 10) ^ (-1));
        llIIllllllll[3] = "   ".length();
        llIIllllllll[4] = 115 ^ 117;
        llIIllllllll[5] = "  ".length();
        llIIllllllll[6] = (34 ^ 26) ^ (37 ^ 20);
        llIIllllllll[7] = 8 ^ 15;
        llIIllllllll[8] = 62 ^ 50;
        llIIllllllll[9] = 4 ^ 0;
        llIIllllllll[10] = (193 ^ 146) ^ (41 ^ 82);
        llIIllllllll[11] = (107 ^ 123) ^ (93 ^ 110);
        llIIllllllll[12] = 171 ^ 174;
    }

    public int ae() {
        return this.holding;
    }

    private static boolean lllllllllllIll(int i) {
        return i != 0;
    }

    public boolean af() {
        return this.degraded;
    }

    public int ad() {
        int i;
        if (lllllllllllIll(this.degraded ? 1 : 0)) {
            i = this.degradedBaseHoldAmount;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return (76 ^ 121) & ((112 ^ 69) ^ (-1));
            }
        } else {
            i = this.baseHoldAmount;
        }
        return i - this.holding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    private e(String str, int i, int i2, int i3) {
        this.unknown = llIIllllllll[1];
        this.baseHoldAmount = i2;
        this.degradedBaseHoldAmount = i3;
    }

    public void a(boolean z) {
        int i;
        if (lllllllllllllI(z ? 1 : 0, this.degraded ? 1 : 0)) {
            this.degraded = z;
            if (lllllllllllIll(this.degraded ? 1 : 0)) {
                i = this.degradedBaseHoldAmount;
                "".length();
                if ((((((36 + 68) - 9) + 57) ^ (((98 + 103) - 144) + 112)) & (((185 ^ 157) ^ (132 ^ 145)) ^ (-" ".length()))) != 0) {
                    return;
                }
            } else {
                i = this.baseHoldAmount;
            }
            this.holding = Math.min(this.holding, i);
        }
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    private static boolean llllllllllllll(int i, int i2) {
        return i < i2;
    }

    public void e(int i) {
        this.holding = i;
    }
}
