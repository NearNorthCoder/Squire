package m.e.i.q.u.r.p000.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/b.class */
public final class EnumC0001b {
    private static /* synthetic */ String[] lllllIlllIlI;
    private static final /* synthetic */ EnumC0001b[] $VALUES;
    private static /* synthetic */ int[] lllllIlllIll;
    public static final /* synthetic */ EnumC0001b JAVELIN_HEADS;
    public static final /* synthetic */ EnumC0001b ARROW_TIPS;
    public static final /* synthetic */ EnumC0001b DISABLE;
    public static final /* synthetic */ EnumC0001b DART_TIPS;
    public static final /* synthetic */ EnumC0001b BOLT_TIPS;

    private static String lIIlIIllllIlllI(String lllllllllllllllIIlIIIllllIIlIlII, String lllllllllllllllIIlIIIllllIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllllIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllllIIlIIll.getBytes(StandardCharsets.UTF_8)), lllllIlllIll[6]), "DES");
            Cipher lllllllllllllllIIlIIIllllIIlIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllllIIlIllI.init(lllllIlllIll[2], lllllllllllllllIIlIIIllllIIlIlll);
            return new String(lllllllllllllllIIlIIIllllIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIllllIIlIlIl) {
            lllllllllllllllIIlIIIllllIIlIlIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIlllllIIII();
        lIIlIIllllIllll();
        BOLT_TIPS = new EnumC0001b(lllllIlllIlI[lllllIlllIll[0]], lllllIlllIll[0]);
        ARROW_TIPS = new EnumC0001b(lllllIlllIlI[lllllIlllIll[1]], lllllIlllIll[1]);
        JAVELIN_HEADS = new EnumC0001b(lllllIlllIlI[lllllIlllIll[2]], lllllIlllIll[2]);
        DART_TIPS = new EnumC0001b(lllllIlllIlI[lllllIlllIll[3]], lllllIlllIll[3]);
        DISABLE = new EnumC0001b(lllllIlllIlI[lllllIlllIll[4]], lllllIlllIll[4]);
        EnumC0001b[] enumC0001bArr = new EnumC0001b[lllllIlllIll[5]];
        enumC0001bArr[lllllIlllIll[0]] = BOLT_TIPS;
        enumC0001bArr[lllllIlllIll[1]] = ARROW_TIPS;
        enumC0001bArr[lllllIlllIll[2]] = JAVELIN_HEADS;
        enumC0001bArr[lllllIlllIll[3]] = DART_TIPS;
        enumC0001bArr[lllllIlllIll[4]] = DISABLE;
        $VALUES = enumC0001bArr;
    }

    public static EnumC0001b[] values() {
        return (EnumC0001b[]) $VALUES.clone();
    }

    private static boolean lIIlIIlllllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIllllIllIl(String lllllllllllllllIIlIIIllllIlIIIIl, String lllllllllllllllIIlIIIllllIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIlllIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIIllIlIIll) {
            lllllllllllllllIIlIIlIIIllIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllllIIII() {
        lllllIlllIll = new int[7];
        lllllIlllIll[0] = (171 ^ 185) & ((21 ^ 7) ^ (-1));
        lllllIlllIll[1] = " ".length();
        lllllIlllIll[2] = "  ".length();
        lllllIlllIll[3] = "   ".length();
        lllllIlllIll[4] = 92 ^ 88;
        lllllIlllIll[5] = "   ".length() ^ (195 ^ 197);
        lllllIlllIll[6] = 110 ^ 102;
    }

    private EnumC0001b(String str, int i) {
    }

    public static EnumC0001b valueOf(String str) {
        return (EnumC0001b) Enum.valueOf(EnumC0001b.class, str);
    }

    private static void lIIlIIllllIllll() {
        lllllIlllIlI = new String[lllllIlllIll[5]];
        lllllIlllIlI[lllllIlllIll[0]] = lIIlIIllllIllII("ASAmEhoXJjoV", "CojFE");
        lllllIlllIlI[lllllIlllIll[1]] = lIIlIIllllIllIl("VuOA0B4vCK15VxliPoe9ag==", "eVlEf");
        lllllIlllIlI[lllllIlllIll[2]] = lIIlIIllllIllIl("3BFFMqY58R5BvsRvDGHZdA==", "SwZdB");
        lllllIlllIlI[lllllIlllIll[3]] = lIIlIIllllIllII("IgMTNxoyCxEw", "fBAcE");
        lllllIlllIlI[lllllIlllIll[4]] = lIIlIIllllIlllI("ns+YBOnUCi8=", "iGYAM");
    }

    private static String lIIlIIllllIllII(String lllllllllllllllIIlIIIllllIIIIlII, String lllllllllllllllIIlIIIllllIIIIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIIllllIIIIIIl = lllllllllllllllIIlIIIllllIIIIIll.toCharArray();
        int lllllllllllllllIIlIIIllllIIIIIII = lllllIlllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIlIIIlllIllllIII = lllllIlllIll[0];
        while (lIIlIIlllllIIIl(lllllllllllllllIIlIIIlllIllllIII, length)) {
            sb.append((char) (charArray[lllllllllllllllIIlIIIlllIllllIII] ^ lllllllllllllllIIlIIIllllIIIIIIl[lllllllllllllllIIlIIIllllIIIIIII % lllllllllllllllIIlIIIllllIIIIIIl.length]));
            "".length();
            lllllllllllllllIIlIIIllllIIIIIII++;
            lllllllllllllllIIlIIIlllIllllIII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
