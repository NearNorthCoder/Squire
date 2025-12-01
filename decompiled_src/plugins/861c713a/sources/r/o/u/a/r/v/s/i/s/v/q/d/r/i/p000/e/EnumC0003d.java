package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/d.class */
public final class EnumC0003d {
    private static /* synthetic */ String[] lIlIlIIlIIIIl;
    public static final /* synthetic */ EnumC0003d NOT_ATTACKING;
    public static final /* synthetic */ EnumC0003d DELAYED;
    private static /* synthetic */ int[] lIlIlIIlIIIlI;
    private static final /* synthetic */ EnumC0003d[] $VALUES;

    private static void lIllllIllIllllI() {
        lIlIlIIlIIIIl = new String[lIlIlIIlIIIlI[2]];
        lIlIlIIlIIIIl[lIlIlIIlIIIlI[0]] = lIllllIllIlllII("JAsNMxA+EBgvGiMKHg==", "jDYlQ");
        lIlIlIIlIIIIl[lIlIlIIlIIIlI[1]] = lIllllIllIlllIl("3TsRvnomnGM=", "OLWuA");
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    static {
        lIllllIllIlllll();
        lIllllIllIllllI();
        NOT_ATTACKING = new EnumC0003d(lIlIlIIlIIIIl[lIlIlIIlIIIlI[0]], lIlIlIIlIIIlI[0]);
        DELAYED = new EnumC0003d(lIlIlIIlIIIIl[lIlIlIIlIIIlI[1]], lIlIlIIlIIIlI[1]);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lIlIlIIlIIIlI[2]];
        enumC0003dArr[lIlIlIIlIIIlI[0]] = NOT_ATTACKING;
        enumC0003dArr[lIlIlIIlIIIlI[1]] = DELAYED;
        $VALUES = enumC0003dArr;
    }

    private static String lIllllIllIlllIl(String llllllllllllllIllIlIllllllIllIIl, String llllllllllllllIllIlIllllllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllllllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllllllIllIll.init(lIlIlIIlIIIlI[2], secretKeySpec);
            return new String(llllllllllllllIllIlIllllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllllllIllIlI) {
            llllllllllllllIllIlIllllllIllIlI.printStackTrace();
            return null;
        }
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    private EnumC0003d(String str, int i) {
    }

    private static boolean lIllllIlllIIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIllllIllIlllII(String llllllllllllllIllIlIlllllllIlllI, String llllllllllllllIllIlIlllllllIllIl) {
        String llllllllllllllIllIlIlllllllIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllllllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlllllllIllIl.toCharArray();
        int llllllllllllllIllIlIlllllllIlIlI = lIlIlIIlIIIlI[0];
        char[] charArray2 = llllllllllllllIllIlIlllllllIlllI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlIIIlI[0];
        while (lIllllIlllIIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIlIlllllllIlIlI % charArray.length]));
            "".length();
            llllllllllllllIllIlIlllllllIlIlI++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllllIllIlllll() {
        lIlIlIIlIIIlI = new int[3];
        lIlIlIIlIIIlI[0] = (172 ^ 151) & ((44 ^ 23) ^ (-1));
        lIlIlIIlIIIlI[1] = " ".length();
        lIlIlIIlIIIlI[2] = "  ".length();
    }
}
