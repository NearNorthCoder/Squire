package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.B  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/B.class */
public final class B {
    private final /* synthetic */ int value;
    public static final /* synthetic */ B RUNITE;
    private static /* synthetic */ int[] lIIlIllllllI;
    private static /* synthetic */ String[] lIIlIlllllIl;
    private static final /* synthetic */ B[] $VALUES;
    public static final /* synthetic */ B MITHRIL;
    public static final /* synthetic */ B IRON;
    public static final /* synthetic */ B ADAMANTITE;

    private static void llIIllIlllIIIl() {
        lIIlIllllllI = new int[9];
        lIIlIllllllI[0] = (59 ^ 50) & ((63 ^ 54) ^ (-1));
        lIIlIllllllI[1] = " ".length();
        lIIlIllllllI[2] = "  ".length();
        lIIlIllllllI[3] = "   ".length();
        lIIlIllllllI[4] = (((6 + 11) - (-53)) + 97) ^ (((1 + 67) - (-46)) + 49);
        lIIlIllllllI[5] = 77 ^ 72;
        lIIlIllllllI[6] = 194 ^ 196;
        lIIlIllllllI[7] = (193 ^ 132) ^ (255 ^ 189);
        lIIlIllllllI[8] = 98 ^ 106;
    }

    private static boolean llIIllIlllIIll(int i, int i2) {
        return i < i2;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    private B(String str, int i, int i2) {
        this.value = i2;
    }

    public static int a(String str) {
        String upperCase = str.toUpperCase();
        return llIIllIlllIIlI(upperCase.contains(lIIlIlllllIl[lIIlIllllllI[0]]) ? 1 : 0) ? IRON.R() : llIIllIlllIIlI(upperCase.contains(lIIlIlllllIl[lIIlIllllllI[1]]) ? 1 : 0) ? MITHRIL.R() : llIIllIlllIIlI(upperCase.contains(lIIlIlllllIl[lIIlIllllllI[2]]) ? 1 : 0) ? ADAMANTITE.R() : llIIllIlllIIlI(upperCase.contains(lIIlIlllllIl[lIIlIllllllI[3]]) ? 1 : 0) ? RUNITE.R() : lIIlIllllllI[0];
    }

    public int R() {
        return this.value;
    }

    private static String llIIllIllIllll(String lllllllllllllllIllllIIIIlIIIIllI, String lllllllllllllllIllllIIIIlIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllllIIIIlIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllllIIIIlIIIlIII.init(lIIlIllllllI[2], secretKeySpec);
            return new String(lllllllllllllllIllllIIIIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllllIIIIlIIIIlll) {
            lllllllllllllllIllllIIIIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIllIlllIIII() {
        lIIlIlllllIl = new String[lIIlIllllllI[8]];
        lIIlIlllllIl[lIIlIllllllI[0]] = llIIllIllIllIl("m2F1StAJr9M=", "VusNm");
        lIIlIlllllIl[lIIlIllllllI[1]] = llIIllIllIllIl("97UVwaEhIg4=", "pJHSM");
        lIIlIlllllIl[lIIlIllllllI[2]] = llIIllIllIlllI("CiEMPw8FMQQmCw==", "KeMrN");
        lIIlIlllllIl[lIIlIllllllI[3]] = llIIllIllIllll("UUjgCcXo3x0=", "Swffi");
        lIIlIlllllIl[lIIlIllllllI[4]] = llIIllIllIllll("G3ufjxNY6F4=", "YQtlS");
        lIIlIlllllIl[lIIlIllllllI[5]] = llIIllIllIlllI("JA8GKxsgCg==", "iFRcI");
        lIIlIlllllIl[lIIlIllllllI[6]] = llIIllIllIlllI("LAw0IhUjHDw7EQ==", "mHuoT");
        lIIlIlllllIl[lIIlIllllllI[7]] = llIIllIllIlllI("CDQNKBsf", "ZaCaO");
    }

    private static String llIIllIllIlllI(String lllllllllllllllIllllIIIIIlllIllI, String lllllllllllllllIllllIIIIIlllIlIl) {
        String lllllllllllllllIllllIIIIIlllIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllllIIIIIlllIIll = lllllllllllllllIllllIIIIIlllIlIl.toCharArray();
        int lllllllllllllllIllllIIIIIlllIIlI = lIIlIllllllI[0];
        char[] charArray = lllllllllllllllIllllIIIIIlllIllI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIllllllI[0];
        while (llIIllIlllIIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllllIIIIIlllIIll[lllllllllllllllIllllIIIIIlllIIlI % lllllllllllllllIllllIIIIIlllIIll.length]));
            "".length();
            lllllllllllllllIllllIIIIIlllIIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIllIlllIIlI(int i) {
        return i != 0;
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }

    private static String llIIllIllIllIl(String lllllllllllllllIllllIIIIIllIIIIl, String lllllllllllllllIllllIIIIIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIIlIllllllI[8]), "DES");
            Cipher lllllllllllllllIllllIIIIIllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIllllIIIIIllIIIll.init(lIIlIllllllI[2], secretKeySpec);
            return new String(lllllllllllllllIllllIIIIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllllIIIIIllIIIlI) {
            lllllllllllllllIllllIIIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    static {
        llIIllIlllIIIl();
        llIIllIlllIIII();
        IRON = new B(lIIlIlllllIl[lIIlIllllllI[4]], lIIlIllllllI[0], lIIlIllllllI[1]);
        MITHRIL = new B(lIIlIlllllIl[lIIlIllllllI[5]], lIIlIllllllI[1], lIIlIllllllI[2]);
        ADAMANTITE = new B(lIIlIlllllIl[lIIlIllllllI[6]], lIIlIllllllI[2], lIIlIllllllI[3]);
        RUNITE = new B(lIIlIlllllIl[lIIlIllllllI[7]], lIIlIllllllI[3], lIIlIllllllI[4]);
        B[] bArr = new B[lIIlIllllllI[4]];
        bArr[lIIlIllllllI[0]] = IRON;
        bArr[lIIlIllllllI[1]] = MITHRIL;
        bArr[lIIlIllllllI[2]] = ADAMANTITE;
        bArr[lIIlIllllllI[3]] = RUNITE;
        $VALUES = bArr;
    }
}
