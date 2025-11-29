package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.a  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/a.class */
public final class a {
    public static final /* synthetic */ a HERB_BOX;
    public static final /* synthetic */ a SEED_PACK;
    public static final /* synthetic */ a NONE;
    private static /* synthetic */ int[] lIlIIIIIIIlll;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ String[] lIlIIIIIIIllI;

    private a(String str, int i) {
    }

    private static String lIllIllIlIIlIlI(String llllllllllllllIlllIIlIIllIlIlIlI, String llllllllllllllIlllIIlIIllIlIlIIl) {
        String llllllllllllllIlllIIlIIllIlIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIIllIlIlIII = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIIllIlIlIIl.toCharArray();
        int llllllllllllllIlllIIlIIllIlIIIIl = lIlIIIIIIIlll[0];
        char[] charArray2 = llllllllllllllIlllIIlIIllIlIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIIIlll[0];
        while (lIllIllIlIIlllI(i, length)) {
            llllllllllllllIlllIIlIIllIlIlIII.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIIlIIllIlIIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIIllIlIIIIl++;
            i++;
            "".length();
            if ("   ".length() < (((57 ^ 89) ^ (216 ^ 137)) & (((17 ^ 62) ^ (52 ^ 42)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIIllIlIlIII);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    private static String lIllIllIlIIlIll(String llllllllllllllIlllIIlIIllIIlIlIl, String llllllllllllllIlllIIlIIllIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIIIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIllIIlIllI) {
            llllllllllllllIlllIIlIIllIIlIllI.printStackTrace();
            return null;
        }
    }

    static {
        lIllIllIlIIllIl();
        lIllIllIlIIllII();
        NONE = new a(lIlIIIIIIIllI[lIlIIIIIIIlll[0]], lIlIIIIIIIlll[0]);
        HERB_BOX = new a(lIlIIIIIIIllI[lIlIIIIIIIlll[1]], lIlIIIIIIIlll[1]);
        SEED_PACK = new a(lIlIIIIIIIllI[lIlIIIIIIIlll[2]], lIlIIIIIIIlll[2]);
        a[] aVarArr = new a[lIlIIIIIIIlll[3]];
        aVarArr[lIlIIIIIIIlll[0]] = NONE;
        aVarArr[lIlIIIIIIIlll[1]] = HERB_BOX;
        aVarArr[lIlIIIIIIIlll[2]] = SEED_PACK;
        $VALUES = aVarArr;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    private static boolean lIllIllIlIIlllI(int i, int i2) {
        return i < i2;
    }

    private static void lIllIllIlIIllII() {
        lIlIIIIIIIllI = new String[lIlIIIIIIIlll[3]];
        lIlIIIIIIIllI[lIlIIIIIIIlll[0]] = lIllIllIlIIlIlI("FAcmPw==", "ZHhzQ");
        lIlIIIIIIIllI[lIlIIIIIIIlll[1]] = lIllIllIlIIlIll("C+TnlqBQk4WrpL+VOllMJA==", "UsGcy");
        lIlIIIIIIIllI[lIlIIIIIIIlll[2]] = lIllIllIlIIlIll("dedwo9vXE9V4xnKd3jJgJg==", "ZPayW");
    }

    private static void lIllIllIlIIllIl() {
        lIlIIIIIIIlll = new int[4];
        lIlIIIIIIIlll[0] = ((16 ^ 74) ^ (75 ^ 63)) & (((((142 + 104) - 83) + 10) ^ (((59 + 123) - 73) + 22)) ^ (-" ".length()));
        lIlIIIIIIIlll[1] = " ".length();
        lIlIIIIIIIlll[2] = "  ".length();
        lIlIIIIIIIlll[3] = "   ".length();
    }
}
