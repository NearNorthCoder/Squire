package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/g.class */
public final class EnumC0058g {
    private static final /* synthetic */ EnumC0058g[] $VALUES;
    public static final /* synthetic */ EnumC0058g MAGE;
    public static final /* synthetic */ EnumC0058g RANGE_1;
    private static /* synthetic */ int[] llIIllllIII;
    public static final /* synthetic */ EnumC0058g MELEE_1;
    public static final /* synthetic */ EnumC0058g NONE;
    private static /* synthetic */ String[] llIIlllIlll;
    public static final /* synthetic */ EnumC0058g MELEE_2;
    public static final /* synthetic */ EnumC0058g RANGE_2;

    private static String lIlIIIlllIlIll(String llllllllllllllllIIlllIlIIIlIllII, String llllllllllllllllIIlllIlIIIlIlIll) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllllIII[2], llllllllllllllllIIlllIlIIIlIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIlIIIlIllIl) {
            llllllllllllllllIIlllIlIIIlIllIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0058g valueOf(String str) {
        return (EnumC0058g) Enum.valueOf(EnumC0058g.class, str);
    }

    static {
        lIlIIIlllIllIl();
        lIlIIIlllIllII();
        NONE = new EnumC0058g(llIIlllIlll[llIIllllIII[0]], llIIllllIII[0]);
        MELEE_1 = new EnumC0058g(llIIlllIlll[llIIllllIII[1]], llIIllllIII[1]);
        MELEE_2 = new EnumC0058g(llIIlllIlll[llIIllllIII[2]], llIIllllIII[2]);
        RANGE_1 = new EnumC0058g(llIIlllIlll[llIIllllIII[3]], llIIllllIII[3]);
        RANGE_2 = new EnumC0058g(llIIlllIlll[llIIllllIII[4]], llIIllllIII[4]);
        MAGE = new EnumC0058g(llIIlllIlll[llIIllllIII[5]], llIIllllIII[5]);
        EnumC0058g[] enumC0058gArr = new EnumC0058g[llIIllllIII[6]];
        enumC0058gArr[llIIllllIII[0]] = NONE;
        enumC0058gArr[llIIllllIII[1]] = MELEE_1;
        enumC0058gArr[llIIllllIII[2]] = MELEE_2;
        enumC0058gArr[llIIllllIII[3]] = RANGE_1;
        enumC0058gArr[llIIllllIII[4]] = RANGE_2;
        enumC0058gArr[llIIllllIII[5]] = MAGE;
        $VALUES = enumC0058gArr;
    }

    private static void lIlIIIlllIllII() {
        llIIlllIlll = new String[llIIllllIII[6]];
        llIIlllIlll[llIIllllIII[0]] = lIlIIIlllIlIIl("M+YnsLySSlU=", "XHqoJ");
        llIIlllIlll[llIIllllIII[1]] = lIlIIIlllIlIlI("KTwcIxE7SA==", "dyPfT");
        llIIlllIlll[llIIllllIII[2]] = lIlIIIlllIlIll("0kZV4CTgrUo=", "lbJLn");
        llIIlllIlll[llIIllllIII[3]] = lIlIIIlllIlIIl("v2WOOJSQlEc=", "gWQdL");
        llIIlllIlll[llIIllllIII[4]] = lIlIIIlllIlIlI("FTEpCy8YQg==", "GpgLj");
        llIIlllIlll[llIIllllIII[5]] = lIlIIIlllIlIlI("KSIQCw==", "dcWNy");
    }

    private static String lIlIIIlllIlIlI(String llllllllllllllllIIlllIlIIlIIIIIl, String llllllllllllllllIIlllIlIIlIIIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlllIlIIIlllllI = llllllllllllllllIIlllIlIIlIIIIII.toCharArray();
        int llllllllllllllllIIlllIlIIIllllIl = llIIllllIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIllllIII[0];
        while (lIlIIIlllIlllI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIIlllIlIIIlllllI[llllllllllllllllIIlllIlIIIllllIl % llllllllllllllllIIlllIlIIIlllllI.length]));
            "".length();
            llllllllllllllllIIlllIlIIIllllIl++;
            i++;
            "".length();
            if (" ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIIlllIlIIl(String llllllllllllllllIIlllIlIIIIlllll, String llllllllllllllllIIlllIlIIIIllllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), llIIllllIII[7]), "DES");
            Cipher llllllllllllllllIIlllIlIIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlllIlIIIlIIIIl.init(llIIllllIII[2], llllllllllllllllIIlllIlIIIlIIIlI);
            return new String(llllllllllllllllIIlllIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIlIIIlIIIII) {
            llllllllllllllllIIlllIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIlllI(int i, int i2) {
        return i < i2;
    }

    public static EnumC0058g[] values() {
        return (EnumC0058g[]) $VALUES.clone();
    }

    private EnumC0058g(String str, int i) {
    }

    private static void lIlIIIlllIllIl() {
        llIIllllIII = new int[8];
        llIIllllIII[0] = (18 ^ 10) & ((133 ^ 157) ^ (-1));
        llIIllllIII[1] = " ".length();
        llIIllllIII[2] = "  ".length();
        llIIllllIII[3] = "   ".length();
        llIIllllIII[4] = 148 ^ 144;
        llIIllllIII[5] = 127 ^ 122;
        llIIllllIII[6] = 12 ^ 10;
        llIIllllIII[7] = (((62 + 25) - 6) + 46) ^ (212 ^ 163);
    }
}
