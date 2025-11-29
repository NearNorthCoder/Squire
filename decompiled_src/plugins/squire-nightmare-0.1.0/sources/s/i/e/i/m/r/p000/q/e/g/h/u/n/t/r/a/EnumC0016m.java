package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.m  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/m.class */
public final class EnumC0016m {
    private static /* synthetic */ String[] llllIIlIIIll;
    public static final /* synthetic */ EnumC0016m DEFENSIVE;
    public static final /* synthetic */ EnumC0016m NONE;
    private static final /* synthetic */ EnumC0016m[] $VALUES;
    public static final /* synthetic */ EnumC0016m MAGIC;
    private static /* synthetic */ int[] llllIIlIIlII;
    public static final /* synthetic */ EnumC0016m CONTROLLED;
    public static final /* synthetic */ EnumC0016m ACCURATE;
    public static final /* synthetic */ EnumC0016m AGGRESSIVE;

    private static String lIIIllllIlllIIl(String lllllllllllllllIIlIllllIlIlIlIII, String lllllllllllllllIIlIllllIlIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIlIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllllIlIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllllIlIlIlIlI.init(llllIIlIIlII[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllllIlIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllllIlIlIlIIl) {
            lllllllllllllllIIlIllllIlIlIlIIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0016m[] values() {
        return (EnumC0016m[]) $VALUES.clone();
    }

    private static void lIIIllllIlllIll() {
        llllIIlIIlII = new int[7];
        llllIIlIIlII[0] = ((((120 + 119) - 130) + 47) ^ (((80 + 73) - 58) + 48)) & (((76 ^ 41) ^ (109 ^ 27)) ^ (-" ".length()));
        llllIIlIIlII[1] = " ".length();
        llllIIlIIlII[2] = "  ".length();
        llllIIlIIlII[3] = "   ".length();
        llllIIlIIlII[4] = (((55 + 7) - 61) + 137) ^ (((82 + 89) - 127) + 98);
        llllIIlIIlII[5] = 128 ^ 133;
        llllIIlIIlII[6] = 174 ^ 168;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean bk() {
        EnumC0016m[] enumC0016mArr = new EnumC0016m[llllIIlIIlII[1]];
        enumC0016mArr[llllIIlIIlII[0]] = this;
        if (lIIIllllIllllIl(C0019p.a(enumC0016mArr).isEmpty() ? 1 : 0)) {
            ?? r0 = llllIIlIIlII[1];
            "".length();
            return "   ".length() <= 0 ? ((12 ^ 76) ^ (23 ^ 17)) & (((224 ^ 169) ^ (109 ^ 98)) ^ (-" ".length())) : r0;
        }
        return llllIIlIIlII[0];
    }

    private static boolean lIIIllllIlllllI(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllllIlllIlI() {
        llllIIlIIIll = new String[llllIIlIIlII[6]];
        llllIIlIIIll[llllIIlIIlII[0]] = lIIIllllIlllIII("IywtEjwjOys=", "bonGn");
        llllIIlIIIll[llllIIlIIlII[1]] = lIIIllllIlllIII("MzETPyIhJR07Ig==", "rvTmg");
        llllIIlIIIll[llllIIlIIlII[2]] = lIIIllllIlllIII("BR06OwAJHjgqFg==", "FRtoR");
        llllIIlIIIll[llllIIlIIlII[3]] = lIIIllllIlllIIl("b1uXTPrtBxOZH0UTE5kjLA==", "VPsQH");
        llllIIlIIIll[llllIIlIIlII[4]] = lIIIllllIlllIIl("G3XM0On0XzI=", "cERRI");
        llllIIlIIIll[llllIIlIIlII[5]] = lIIIllllIlllIIl("U6xEnh7WoEc=", "FfRdK");
    }

    private static boolean lIIIllllIllllIl(int i) {
        return i == 0;
    }

    private static String lIIIllllIlllIII(String lllllllllllllllIIlIllllIlIllllIl, String lllllllllllllllIIlIllllIlIllllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllllIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllllIlIlllIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllllIlIllllII.toCharArray();
        int lllllllllllllllIIlIllllIlIlllIIl = llllIIlIIlII[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIIlIllllIlIllIIlI = charArray2.length;
        int i = llllIIlIIlII[0];
        while (lIIIllllIlllllI(i, lllllllllllllllIIlIllllIlIllIIlI)) {
            lllllllllllllllIIlIllllIlIlllIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIllllIlIlllIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIllllIlIlllIIl++;
            i++;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllllIlIlllIll);
    }

    public static EnumC0016m valueOf(String str) {
        return (EnumC0016m) Enum.valueOf(EnumC0016m.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean bj() {
        C0018o bq = C0019p.bq();
        return lIIIllllIllllII(bq) ? llllIIlIIlII[0] : Objects.equals(bq.bn(), this);
    }

    private EnumC0016m(String str, int i) {
    }

    private static boolean lIIIllllIllllII(Object obj) {
        return obj == null;
    }

    static {
        lIIIllllIlllIll();
        lIIIllllIlllIlI();
        ACCURATE = new EnumC0016m(llllIIlIIIll[llllIIlIIlII[0]], llllIIlIIlII[0]);
        AGGRESSIVE = new EnumC0016m(llllIIlIIIll[llllIIlIIlII[1]], llllIIlIIlII[1]);
        CONTROLLED = new EnumC0016m(llllIIlIIIll[llllIIlIIlII[2]], llllIIlIIlII[2]);
        DEFENSIVE = new EnumC0016m(llllIIlIIIll[llllIIlIIlII[3]], llllIIlIIlII[3]);
        MAGIC = new EnumC0016m(llllIIlIIIll[llllIIlIIlII[4]], llllIIlIIlII[4]);
        NONE = new EnumC0016m(llllIIlIIIll[llllIIlIIlII[5]], llllIIlIIlII[5]);
        EnumC0016m[] enumC0016mArr = new EnumC0016m[llllIIlIIlII[6]];
        enumC0016mArr[llllIIlIIlII[0]] = ACCURATE;
        enumC0016mArr[llllIIlIIlII[1]] = AGGRESSIVE;
        enumC0016mArr[llllIIlIIlII[2]] = CONTROLLED;
        enumC0016mArr[llllIIlIIlII[3]] = DEFENSIVE;
        enumC0016mArr[llllIIlIIlII[4]] = MAGIC;
        enumC0016mArr[llllIIlIIlII[5]] = NONE;
        $VALUES = enumC0016mArr;
    }
}
