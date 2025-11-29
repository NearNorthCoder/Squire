package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.s  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/s.class */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    private static /* synthetic */ String[] lllIIlIIllI;
    public static final /* synthetic */ s SERUMS;
    public static final /* synthetic */ s COMPOST;
    private static /* synthetic */ int[] lllIIlIIlll;

    private static void lIlIllIllllIII() {
        lllIIlIIlll = new int[4];
        lllIIlIIlll[0] = ((168 ^ 182) ^ (31 ^ 16)) & (((153 ^ 167) ^ (65 ^ 110)) ^ (-" ".length()));
        lllIIlIIlll[1] = " ".length();
        lllIIlIIlll[2] = "  ".length();
        lllIIlIIlll[3] = (120 ^ 103) ^ (10 ^ 29);
    }

    private static boolean lIlIllIllllIIl(int i, int i2) {
        return i < i2;
    }

    private s(String str, int i) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    private static String lIlIllIlllIllI(String llllllllllllllllIIlIlIIIlIIIlIII, String llllllllllllllllIIlIlIIIlIIIIlll) {
        String llllllllllllllllIIlIlIIIlIIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlIIIlIIIIlll.toCharArray();
        int llllllllllllllllIIlIlIIIlIIIIlII = lllIIlIIlll[0];
        char[] charArray2 = llllllllllllllllIIlIlIIIlIIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIlIIlll[0];
        while (lIlIllIllllIIl(i, length)) {
            char llllllllllllllllIIlIlIIIlIIIlIIl = charArray2[i];
            sb.append((char) (llllllllllllllllIIlIlIIIlIIIlIIl ^ charArray[llllllllllllllllIIlIlIIIlIIIIlII % charArray.length]));
            "".length();
            llllllllllllllllIIlIlIIIlIIIIlII++;
            i++;
            "".length();
            if (("  ".length() & ("  ".length() ^ (-1))) > (106 ^ 110)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIllIlllIlll() {
        lllIIlIIllI = new String[lllIIlIIlll[2]];
        lllIIlIIllI[lllIIlIIlll[0]] = lIlIllIlllIlIl("4Ia72jb4tzc=", "FosaP");
        lllIIlIIllI[lllIIlIIlll[1]] = lIlIllIlllIllI("DzceJwQfLA==", "LxSwK");
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    private static String lIlIllIlllIlIl(String llllllllllllllllIIlIlIIIIlllIIIl, String llllllllllllllllIIlIlIIIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlIIlll[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIIlllIlII) {
            llllllllllllllllIIlIlIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIllIllllIII();
        lIlIllIlllIlll();
        SERUMS = new s(lllIIlIIllI[lllIIlIIlll[0]], lllIIlIIlll[0]);
        COMPOST = new s(lllIIlIIllI[lllIIlIIlll[1]], lllIIlIIlll[1]);
        s[] sVarArr = new s[lllIIlIIlll[2]];
        sVarArr[lllIIlIIlll[0]] = SERUMS;
        sVarArr[lllIIlIIlll[1]] = COMPOST;
        $VALUES = sVarArr;
    }
}
