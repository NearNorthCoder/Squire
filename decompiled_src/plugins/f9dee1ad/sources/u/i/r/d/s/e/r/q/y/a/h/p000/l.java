package u.i.r.d.s.e.r.q.y.a.h.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.l  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/l.class */
public final class l {
    private static /* synthetic */ int[] llllIIlIIlII;
    public static final /* synthetic */ l DONE;
    public static final /* synthetic */ l MOVING;
    private static final /* synthetic */ l[] $VALUES;
    private static /* synthetic */ String[] llllIIlIIIII;
    public static final /* synthetic */ l WAITING;

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    private l(String str, int i) {
    }

    private static String lIIIllllIlllIlI(String lllllllllllllllIIlIlIllIIlllIlIl, String lllllllllllllllIIlIlIllIIlllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIlllIlII.getBytes(StandardCharsets.UTF_8)), llllIIlIIlII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIIlII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIIlllIllI) {
            lllllllllllllllIIlIlIllIIlllIllI.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlllllIIllII();
        lIIIllllIllllIl();
        WAITING = new l(llllIIlIIIII[llllIIlIIlII[0]], llllIIlIIlII[0]);
        MOVING = new l(llllIIlIIIII[llllIIlIIlII[1]], llllIIlIIlII[1]);
        DONE = new l(llllIIlIIIII[llllIIlIIlII[2]], llllIIlIIlII[2]);
        l[] lVarArr = new l[llllIIlIIlII[3]];
        lVarArr[llllIIlIIlII[0]] = WAITING;
        lVarArr[llllIIlIIlII[1]] = MOVING;
        lVarArr[llllIIlIIlII[2]] = DONE;
        $VALUES = lVarArr;
    }

    private static String lIIIllllIllllII(String lllllllllllllllIIlIlIllIIlIlIIII, String lllllllllllllllIIlIlIllIIlIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIllIIlIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIllIIlIlIIlI.init(llllIIlIIlII[2], secretKeySpec);
            return new String(lllllllllllllllIIlIlIllIIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIIlIlIIIl) {
            lllllllllllllllIIlIlIllIIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllIIllIl(int i, int i2) {
        return i < i2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    private static String lIIIllllIlllIll(String lllllllllllllllIIlIlIllIIllIIlIl, String lllllllllllllllIIlIlIllIIllIIlII) {
        String lllllllllllllllIIlIlIllIIllIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIllIIllIIlII.toCharArray();
        int lllllllllllllllIIlIlIllIIllIIIIl = llllIIlIIlII[0];
        char[] charArray2 = lllllllllllllllIIlIlIllIIllIIlIl2.toCharArray();
        int lllllllllllllllIIlIlIllIIlIllIlI = charArray2.length;
        int i = llllIIlIIlII[0];
        while (lIIIlllllIIllIl(i, lllllllllllllllIIlIlIllIIlIllIlI)) {
            char lllllllllllllllIIlIlIllIIllIIllI = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIlIllIIllIIllI ^ charArray[lllllllllllllllIIlIlIllIIllIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIllIIllIIIIl++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIllllIllllIl() {
        llllIIlIIIII = new String[llllIIlIIlII[3]];
        llllIIlIIIII[llllIIlIIlII[0]] = lIIIllllIlllIlI("CbFJidIDtes=", "pWRWJ");
        llllIIlIIIII[llllIIlIIlII[1]] = lIIIllllIlllIll("JxoFChkt", "jUSCW");
        llllIIlIIIII[llllIIlIIlII[2]] = lIIIllllIllllII("NvCACzK3qDM=", "aJxAM");
    }

    private static void lIIIlllllIIllII() {
        llllIIlIIlII = new int[5];
        llllIIlIIlII[0] = ((26 ^ 103) ^ (81 ^ 14)) & (((((162 + 99) - 168) + 77) ^ (((56 + 1) - (-73)) + 6)) ^ (-" ".length()));
        llllIIlIIlII[1] = " ".length();
        llllIIlIIlII[2] = "  ".length();
        llllIIlIIlII[3] = "   ".length();
        llllIIlIIlII[4] = 159 ^ 151;
    }
}
