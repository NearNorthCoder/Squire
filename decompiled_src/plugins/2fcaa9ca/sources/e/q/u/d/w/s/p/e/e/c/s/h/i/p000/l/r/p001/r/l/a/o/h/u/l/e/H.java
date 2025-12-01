package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.H  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/H.class */
public final class H {
    private static /* synthetic */ String[] lllIIIIIlIIl;
    private static final /* synthetic */ H[] $VALUES;
    public static final /* synthetic */ H BLADE_STRANGE_TILES;
    private static /* synthetic */ int[] lllIIIIIlIlI;
    public static final /* synthetic */ H STRANGE_TILES;
    public static final /* synthetic */ H DART_STRANGE_TILES;

    static {
        lIIIlIIIIIllIll();
        lIIIlIIIIIllIlI();
        STRANGE_TILES = new H(lllIIIIIlIIl[lllIIIIIlIlI[0]], lllIIIIIlIlI[0]);
        DART_STRANGE_TILES = new H(lllIIIIIlIIl[lllIIIIIlIlI[1]], lllIIIIIlIlI[1]);
        BLADE_STRANGE_TILES = new H(lllIIIIIlIIl[lllIIIIIlIlI[2]], lllIIIIIlIlI[2]);
        H[] hArr = new H[lllIIIIIlIlI[3]];
        hArr[lllIIIIIlIlI[0]] = STRANGE_TILES;
        hArr[lllIIIIIlIlI[1]] = DART_STRANGE_TILES;
        hArr[lllIIIIIlIlI[2]] = BLADE_STRANGE_TILES;
        $VALUES = hArr;
    }

    public static H[] values() {
        return (H[]) $VALUES.clone();
    }

    private static String lIIIlIIIIIllIII(String lllllllllllllllIIlllIIllIIIlIIlI, String lllllllllllllllIIlllIIllIIIlIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIllIIIlIIII = new StringBuilder();
        char[] lllllllllllllllIIlllIIllIIIIllll = lllllllllllllllIIlllIIllIIIlIIIl.toCharArray();
        int lllllllllllllllIIlllIIllIIIIlllI = lllIIIIIlIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIlllIIllIIIIIllI = lllIIIIIlIlI[0];
        while (lIIIlIIIIIlllII(lllllllllllllllIIlllIIllIIIIIllI, length)) {
            char lllllllllllllllIIlllIIllIIIIIlIl = charArray[lllllllllllllllIIlllIIllIIIIIllI];
            lllllllllllllllIIlllIIllIIIlIIII.append((char) (lllllllllllllllIIlllIIllIIIIIlIl ^ lllllllllllllllIIlllIIllIIIIllll[lllllllllllllllIIlllIIllIIIIlllI % lllllllllllllllIIlllIIllIIIIllll.length]));
            "".length();
            lllllllllllllllIIlllIIllIIIIlllI++;
            lllllllllllllllIIlllIIllIIIIIllI++;
            "".length();
            if ((131 ^ 135) < (21 ^ 17)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIIllIIIlIIII);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    private static void lIIIlIIIIIllIlI() {
        lllIIIIIlIIl = new String[lllIIIIIlIlI[3]];
        lllIIIIIlIIl[lllIIIIIlIlI[0]] = lIIIlIIIIIllIII("FBshFRYACiwAEQsKIA==", "GOsTX");
        lllIIIIIlIIl[lllIIIIIlIlI[1]] = lIIIlIIIIIllIIl("NNhdfEqxK2hQih7vJUzFfzclJvqZ92Yc", "CyfYU");
        lllIIIIIlIIl[lllIIIIIlIlI[2]] = lIIIlIIIIIllIIl("jQmIXVBcZFHsc5bQNM2RbD5PsRacjwm2", "rjSKP");
    }

    private static String lIIIlIIIIIllIIl(String lllllllllllllllIIlllIIlIllllllIl, String lllllllllllllllIIlllIIlIllllllII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIllllllII.getBytes(StandardCharsets.UTF_8)), lllIIIIIlIlI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIlIlI[2], lllllllllllllllIIlllIIllIIIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIlllllllI) {
            lllllllllllllllIIlllIIlIlllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIIllIll() {
        lllIIIIIlIlI = new int[5];
        lllIIIIIlIlI[0] = (125 ^ 85) & ((177 ^ 153) ^ (-1));
        lllIIIIIlIlI[1] = " ".length();
        lllIIIIIlIlI[2] = "  ".length();
        lllIIIIIlIlI[3] = "   ".length();
        lllIIIIIlIlI[4] = (13 ^ 92) ^ (152 ^ 193);
    }

    private static boolean lIIIlIIIIIlllII(int i, int i2) {
        return i < i2;
    }

    private H(String str, int i) {
    }
}
