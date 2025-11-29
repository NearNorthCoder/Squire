package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.A  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/A.class */
public final class A {
    public static final /* synthetic */ A UNKNOWN;
    private static /* synthetic */ int[] lIlIlIllIlll;
    public static final /* synthetic */ A ACID;
    public static final /* synthetic */ A CRYSTAL;
    private static /* synthetic */ String[] lIlIlIllIllI;
    public static final /* synthetic */ A FLAME;
    private static final /* synthetic */ A[] $VALUES;

    static {
        llIllllIllllII();
        llIllllIlllIll();
        FLAME = new A(lIlIlIllIllI[lIlIlIllIlll[0]], lIlIlIllIlll[0]);
        ACID = new A(lIlIlIllIllI[lIlIlIllIlll[1]], lIlIlIllIlll[1]);
        CRYSTAL = new A(lIlIlIllIllI[lIlIlIllIlll[2]], lIlIlIllIlll[2]);
        UNKNOWN = new A(lIlIlIllIllI[lIlIlIllIlll[3]], lIlIlIllIlll[3]);
        A[] aArr = new A[lIlIlIllIlll[4]];
        aArr[lIlIlIllIlll[0]] = FLAME;
        aArr[lIlIlIllIlll[1]] = ACID;
        aArr[lIlIlIllIlll[2]] = CRYSTAL;
        aArr[lIlIlIllIlll[3]] = UNKNOWN;
        $VALUES = aArr;
    }

    private static boolean llIllllIllllIl(int i, int i2) {
        return i < i2;
    }

    private static String llIllllIlllIIl(String lllllllllllllllIllIIlllIIIllIIlI, String lllllllllllllllIllIIlllIIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIllIlll[2], lllllllllllllllIllIIlllIIIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlllIIIllIIll) {
            lllllllllllllllIllIIlllIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static String llIllllIlllIlI(String lllllllllllllllIllIIlllIIIlIIIlI, String lllllllllllllllIllIIlllIIIlIIIIl) {
        String lllllllllllllllIllIIlllIIIlIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIlllIIIlIIIIl.toCharArray();
        int lllllllllllllllIllIIlllIIIIllllI = lIlIlIllIlll[0];
        char[] charArray2 = lllllllllllllllIllIIlllIIIlIIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIllIlll[0];
        while (llIllllIllllIl(i, length)) {
            char lllllllllllllllIllIIlllIIIlIIIll = charArray2[i];
            sb.append((char) (lllllllllllllllIllIIlllIIIlIIIll ^ charArray[lllllllllllllllIllIIlllIIIIllllI % charArray.length]));
            "".length();
            lllllllllllllllIllIIlllIIIIllllI++;
            i++;
            "".length();
            if ((((251 ^ 130) ^ (121 ^ 17)) & (((((3 + 140) - 115) + 132) ^ (((82 + 133) - 138) + 100)) ^ (-" ".length()))) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIllllIllllII() {
        lIlIlIllIlll = new int[5];
        lIlIlIllIlll[0] = (95 ^ 6) & ((19 ^ 74) ^ (-1));
        lIlIlIllIlll[1] = " ".length();
        lIlIlIllIlll[2] = "  ".length();
        lIlIlIllIlll[3] = "   ".length();
        lIlIlIllIlll[4] = (103 ^ 83) ^ (245 ^ 197);
    }

    private A(String str, int i) {
    }

    private static void llIllllIlllIll() {
        lIlIlIllIllI = new String[lIlIlIllIlll[4]];
        lIlIlIllIllI[lIlIlIllIlll[0]] = llIllllIlllIIl("C3IUMA2sKZc=", "qHrFj");
        lIlIlIllIllI[lIlIlIllIlll[1]] = llIllllIlllIlI("MgEhMQ==", "sBhug");
        lIlIlIllIllI[lIlIlIllIlll[2]] = llIllllIlllIIl("O3LcJ/v8RVs=", "QbayX");
        lIlIlIllIllI[lIlIlIllIlll[3]] = llIllllIlllIlI("Gj8qLxkYPw==", "OqaaV");
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }
}
