package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/h.class */
public final class EnumC0059h {
    private static /* synthetic */ String[] lIllllIllII;
    public static final /* synthetic */ EnumC0059h SPECIAL_2;
    public static final /* synthetic */ EnumC0059h SPECIAL_1;
    public static final /* synthetic */ EnumC0059h NONE;
    private static /* synthetic */ int[] lIllllIllIl;
    private static final /* synthetic */ EnumC0059h[] $VALUES;

    public static EnumC0059h valueOf(String str) {
        return (EnumC0059h) Enum.valueOf(EnumC0059h.class, str);
    }

    static {
        lIIllIlIllIlIl();
        lIIllIlIllIlII();
        SPECIAL_1 = new EnumC0059h(lIllllIllII[lIllllIllIl[0]], lIllllIllIl[0]);
        SPECIAL_2 = new EnumC0059h(lIllllIllII[lIllllIllIl[1]], lIllllIllIl[1]);
        NONE = new EnumC0059h(lIllllIllII[lIllllIllIl[2]], lIllllIllIl[2]);
        EnumC0059h[] enumC0059hArr = new EnumC0059h[lIllllIllIl[3]];
        enumC0059hArr[lIllllIllIl[0]] = SPECIAL_1;
        enumC0059hArr[lIllllIllIl[1]] = SPECIAL_2;
        enumC0059hArr[lIllllIllIl[2]] = NONE;
        $VALUES = enumC0059hArr;
    }

    public static EnumC0059h[] values() {
        return (EnumC0059h[]) $VALUES.clone();
    }

    private static void lIIllIlIllIlIl() {
        lIllllIllIl = new int[5];
        lIllllIllIl[0] = ((73 ^ 31) ^ (220 ^ 191)) & (((151 ^ 161) ^ "   ".length()) ^ (-" ".length()));
        lIllllIllIl[1] = " ".length();
        lIllllIllIl[2] = "  ".length();
        lIllllIllIl[3] = "   ".length();
        lIllllIllIl[4] = 161 ^ 169;
    }

    private EnumC0059h(String str, int i) {
    }

    private static void lIIllIlIllIlII() {
        lIllllIllII = new String[lIllllIllIl[3]];
        lIllllIllII[lIllllIllIl[0]] = lIIllIlIllIIlI("R0JgN2I3sYMtVTcCwfzz8A==", "zPtOt");
        lIllllIllII[lIllllIllIl[1]] = lIIllIlIllIIlI("H3M9INK+6IVOXLt7NqYr4g==", "frkKf");
        lIllllIllII[lIllllIllIl[2]] = lIIllIlIllIIll("IxYvYjbKjS8=", "NSNYj");
    }

    private static String lIIllIlIllIIll(String llllllllllllllllIlIIlIlIllIIlIlI, String llllllllllllllllIlIIlIlIllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIllIl[2], llllllllllllllllIlIIlIlIllIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIllIIlIll) {
            llllllllllllllllIlIIlIlIllIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlIllIIlI(String llllllllllllllllIlIIlIlIllIlIlll, String llllllllllllllllIlIIlIlIllIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), lIllllIllIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIllIllIII) {
            llllllllllllllllIlIIlIlIllIllIII.printStackTrace();
            return null;
        }
    }
}
