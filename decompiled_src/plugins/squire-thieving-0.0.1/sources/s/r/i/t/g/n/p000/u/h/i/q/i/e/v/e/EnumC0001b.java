package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/b.class */
public final class EnumC0001b {
    public static final /* synthetic */ EnumC0001b PICKPOCKETING;
    public static final /* synthetic */ EnumC0001b CHESTS;
    public static final /* synthetic */ EnumC0001b BLACK_JACK;
    private static /* synthetic */ int[] lIIllIlllIlII;
    private static /* synthetic */ String[] lIIllIlllIIll;
    public static final /* synthetic */ EnumC0001b STALLS;
    private static final /* synthetic */ EnumC0001b[] $VALUES;
    public static final /* synthetic */ EnumC0001b ROGUES_DEN;

    private static boolean lIllIIIlllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIIllIlllll(String llllllllllllllIlllIlllIIIlllIIII, String llllllllllllllIlllIlllIIIllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIIlllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIIlllIIlI.init(lIIllIlllIlII[2], secretKeySpec);
            return new String(llllllllllllllIlllIlllIIIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIIlllIIIl) {
            llllllllllllllIlllIlllIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        return str.charAt(lIIllIlllIlII[0]) + str.replaceAll(lIIllIlllIIll[lIIllIlllIlII[0]], lIIllIlllIIll[lIIllIlllIlII[1]]).substring(lIIllIlllIlII[1]).toLowerCase();
    }

    private EnumC0001b(String str, int i) {
    }

    private static String lIllIIIllIlllIl(String llllllllllllllIlllIlllIIIlIIlIll, String llllllllllllllIlllIlllIIIlIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlII[8]), "DES");
            Cipher llllllllllllllIlllIlllIIIlIIllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIIIlIIllIl.init(lIIllIlllIlII[2], llllllllllllllIlllIlllIIIlIIlllI);
            return new String(llllllllllllllIlllIlllIIIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIIlIIIlll) {
            llllllllllllllIlllIlllIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIlllIIIIl() {
        lIIllIlllIlII = new int[9];
        lIIllIlllIlII[0] = (42 ^ 27) & ((128 ^ 177) ^ (-1));
        lIIllIlllIlII[1] = " ".length();
        lIIllIlllIlII[2] = "  ".length();
        lIIllIlllIlII[3] = "   ".length();
        lIIllIlllIlII[4] = 130 ^ 134;
        lIIllIlllIlII[5] = (((134 + 141) - 187) + 87) ^ (((134 + 31) - 154) + 159);
        lIIllIlllIlII[6] = 152 ^ 158;
        lIIllIlllIlII[7] = 9 ^ 14;
        lIIllIlllIlII[8] = (98 ^ 74) ^ (161 ^ 129);
    }

    private static String lIllIIIllIllllI(String llllllllllllllIlllIlllIIIllIIIII, String llllllllllllllIlllIlllIIIlIlllll) {
        String llllllllllllllIlllIlllIIIllIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIIIlIllllI = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlllIIIlIlllll.toCharArray();
        int llllllllllllllIlllIlllIIIlIlllII = lIIllIlllIlII[0];
        char[] charArray2 = llllllllllllllIlllIlllIIIllIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlllIlII[0];
        while (lIllIIIlllIIIlI(i, length)) {
            llllllllllllllIlllIlllIIIlIllllI.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIlllIIIlIlllII % charArray.length]));
            "".length();
            llllllllllllllIlllIlllIIIlIlllII++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllIIIlIllllI);
    }

    public static EnumC0001b valueOf(String str) {
        return (EnumC0001b) Enum.valueOf(EnumC0001b.class, str);
    }

    public static EnumC0001b[] values() {
        return (EnumC0001b[]) $VALUES.clone();
    }

    private static void lIllIIIlllIIIII() {
        lIIllIlllIIll = new String[lIIllIlllIlII[7]];
        lIIllIlllIIll[lIIllIlllIlII[0]] = lIllIIIllIlllIl("CG0uS3QSzG0=", "swmYS");
        lIIllIlllIIll[lIIllIlllIlII[1]] = lIllIIIllIllllI("Yw==", "CSzOY");
        lIIllIlllIIll[lIIllIlllIlII[2]] = lIllIIIllIlllll("fBMxlwLBhgqHsA1Dj+q7hA==", "LMwHr");
        lIIllIlllIIll[lIIllIlllIlII[3]] = lIllIIIllIllllI("CAQMEyMXDgQdJxEDCA==", "XMOXs");
        lIIllIlllIIll[lIIllIlllIlII[4]] = lIllIIIllIllllI("BRcoIi0F", "VCina");
        lIIllIlllIIll[lIIllIlllIlII[5]] = lIllIIIllIlllIl("Dkes52IIbU8=", "OhEFO");
        lIIllIlllIIll[lIIllIlllIlII[6]] = lIllIIIllIlllIl("j6DTdus7fP6ISLwIyYwwsg==", "aRIcH");
    }

    static {
        lIllIIIlllIIIIl();
        lIllIIIlllIIIII();
        BLACK_JACK = new EnumC0001b(lIIllIlllIIll[lIIllIlllIlII[2]], lIIllIlllIlII[0]);
        PICKPOCKETING = new EnumC0001b(lIIllIlllIIll[lIIllIlllIlII[3]], lIIllIlllIlII[1]);
        STALLS = new EnumC0001b(lIIllIlllIIll[lIIllIlllIlII[4]], lIIllIlllIlII[2]);
        CHESTS = new EnumC0001b(lIIllIlllIIll[lIIllIlllIlII[5]], lIIllIlllIlII[3]);
        ROGUES_DEN = new EnumC0001b(lIIllIlllIIll[lIIllIlllIlII[6]], lIIllIlllIlII[4]);
        EnumC0001b[] enumC0001bArr = new EnumC0001b[lIIllIlllIlII[5]];
        enumC0001bArr[lIIllIlllIlII[0]] = BLACK_JACK;
        enumC0001bArr[lIIllIlllIlII[1]] = PICKPOCKETING;
        enumC0001bArr[lIIllIlllIlII[2]] = STALLS;
        enumC0001bArr[lIIllIlllIlII[3]] = CHESTS;
        enumC0001bArr[lIIllIlllIlII[4]] = ROGUES_DEN;
        $VALUES = enumC0001bArr;
    }
}
