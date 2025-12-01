package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/k.class */
public final class EnumC0010k {
    public static final /* synthetic */ EnumC0010k NONE;
    public static final /* synthetic */ EnumC0010k RIGOUR;
    public static final /* synthetic */ EnumC0010k CHIVALRY;
    private final /* synthetic */ Prayer mapping;
    public static final /* synthetic */ EnumC0010k MYSTIC_MIGHT;
    public static final /* synthetic */ EnumC0010k ULTIMATE_STRENGTH;
    private static /* synthetic */ int[] llIIllllIIIl;
    public static final /* synthetic */ EnumC0010k PIETY;
    public static final /* synthetic */ EnumC0010k EAGLE_EYE;
    private static final /* synthetic */ EnumC0010k[] $VALUES;
    public static final /* synthetic */ EnumC0010k AUGURY;
    private static /* synthetic */ String[] llIIllllIIII;

    private static void lIIIIIIIIIIlIII() {
        llIIllllIIII = new String[llIIllllIIIl[8]];
        llIIllllIIII[llIIllllIIIl[0]] = lIIIIIIIIIIIlIl("oeVcNLMJJKA=", "HRJso");
        llIIllllIIII[llIIllllIIIl[1]] = lIIIIIIIIIIIlIl("SgkU7+QZqh0jVajJjLvKAQ==", "vAzuS");
        llIIllllIIII[llIIllllIIIl[2]] = lIIIIIIIIIIIllI("VmmQRhM75sI=", "tGitr");
        llIIllllIIII[llIIllllIIIl[3]] = lIIIIIIIIIIIlll("Iws/DRc5DyEE", "fJxAR");
        llIIllllIIII[llIIllllIIIl[4]] = lIIIIIIIIIIIllI("LgWM67WKK34=", "lrnqF");
        llIIllllIIII[llIIllllIIIl[5]] = lIIIIIIIIIIIlll("GyABIykUOhE=", "XhHuh");
        llIIllllIIII[llIIllllIIIl[6]] = lIIIIIIIIIIIlIl("vJzx7jtQPKB2SXO+it085eqjOYSFp3Hc", "WSELo");
        llIIllllIIII[llIIllllIIIl[7]] = lIIIIIIIIIIIlll("GyAGLQ==", "UoHhB");
    }

    public Prayer aL() {
        return this.mapping;
    }

    private static String lIIIIIIIIIIIlll(String lllllllllllllllIlIIlIIIIlIIlIIll, String lllllllllllllllIlIIlIIIIlIIlIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIIIlIIlIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIIIIlIIlIIlI.toCharArray();
        int lllllllllllllllIlIIlIIIIlIIIllll = llIIllllIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllllIIIl[0];
        while (lIIIIIIIIIIlIlI(i, length)) {
            lllllllllllllllIlIIlIIIIlIIlIIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlIIIIlIIIllll % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIIIIlIIIllll++;
            i++;
            "".length();
            if ((175 ^ 170) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIIIIlIIlIIIl);
    }

    public static EnumC0010k valueOf(String str) {
        return (EnumC0010k) Enum.valueOf(EnumC0010k.class, str);
    }

    private static String lIIIIIIIIIIIlIl(String lllllllllllllllIlIIlIIIIlIlIlllI, String lllllllllllllllIlIIlIIIIlIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), llIIllllIIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllllIIIl[2], lllllllllllllllIlIIlIIIIlIllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIIIlIllIIIl) {
            lllllllllllllllIlIIlIIIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIIIIIIllI(String lllllllllllllllIlIIlIIIIlIlIIIll, String lllllllllllllllIlIIlIIIIlIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIIlIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllllIIIl[2], lllllllllllllllIlIIlIIIIlIlIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIIIlIlIIlII) {
            lllllllllllllllIlIIlIIIIlIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIIIIIIIlIIl() {
        llIIllllIIIl = new int[9];
        llIIllllIIIl[0] = ((((135 + 37) - 40) + 7) ^ (((70 + 78) - 39) + 69)) & (((((141 + 85) - 176) + 117) ^ (((34 + 33) - 14) + 105)) ^ (-" ".length()));
        llIIllllIIIl[1] = " ".length();
        llIIllllIIIl[2] = "  ".length();
        llIIllllIIIl[3] = "   ".length();
        llIIllllIIIl[4] = 153 ^ 157;
        llIIllllIIIl[5] = (238 ^ 196) ^ (72 ^ 103);
        llIIllllIIIl[6] = 179 ^ 181;
        llIIllllIIIl[7] = (83 ^ 64) ^ (108 ^ 120);
        llIIllllIIIl[8] = (((19 + 153) - 156) + 186) ^ (((184 + 116) - 273) + 167);
    }

    static {
        lIIIIIIIIIIlIIl();
        lIIIIIIIIIIlIII();
        AUGURY = new EnumC0010k(llIIllllIIII[llIIllllIIIl[0]], llIIllllIIIl[0], Prayer.AUGURY);
        MYSTIC_MIGHT = new EnumC0010k(llIIllllIIII[llIIllllIIIl[1]], llIIllllIIIl[1], Prayer.MYSTIC_MIGHT);
        RIGOUR = new EnumC0010k(llIIllllIIII[llIIllllIIIl[2]], llIIllllIIIl[2], Prayer.RIGOUR);
        EAGLE_EYE = new EnumC0010k(llIIllllIIII[llIIllllIIIl[3]], llIIllllIIIl[3], Prayer.EAGLE_EYE);
        PIETY = new EnumC0010k(llIIllllIIII[llIIllllIIIl[4]], llIIllllIIIl[4], Prayer.PIETY);
        CHIVALRY = new EnumC0010k(llIIllllIIII[llIIllllIIIl[5]], llIIllllIIIl[5], Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new EnumC0010k(llIIllllIIII[llIIllllIIIl[6]], llIIllllIIIl[6], Prayer.ULTIMATE_STRENGTH);
        NONE = new EnumC0010k(llIIllllIIII[llIIllllIIIl[7]], llIIllllIIIl[7], null);
        EnumC0010k[] enumC0010kArr = new EnumC0010k[llIIllllIIIl[8]];
        enumC0010kArr[llIIllllIIIl[0]] = AUGURY;
        enumC0010kArr[llIIllllIIIl[1]] = MYSTIC_MIGHT;
        enumC0010kArr[llIIllllIIIl[2]] = RIGOUR;
        enumC0010kArr[llIIllllIIIl[3]] = EAGLE_EYE;
        enumC0010kArr[llIIllllIIIl[4]] = PIETY;
        enumC0010kArr[llIIllllIIIl[5]] = CHIVALRY;
        enumC0010kArr[llIIllllIIIl[6]] = ULTIMATE_STRENGTH;
        enumC0010kArr[llIIllllIIIl[7]] = NONE;
        $VALUES = enumC0010kArr;
    }

    private EnumC0010k(String str, int i, Prayer prayer) {
        this.mapping = prayer;
    }

    public static EnumC0010k[] values() {
        return (EnumC0010k[]) $VALUES.clone();
    }
}
