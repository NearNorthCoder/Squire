package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.g  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/g.class */
public final class g {
    private static /* synthetic */ String[] lllIlllIIlIl;
    private static /* synthetic */ int[] lllIlllIlIIl;
    public static final /* synthetic */ g FULL;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ g TRANSITION;
    public static final /* synthetic */ g OPEN;
    public static final /* synthetic */ g EMPTY;

    private static String lIIIllIllIllIll(String lllllllllllllllIIlIlllIIlIllIlII, String lllllllllllllllIIlIlllIIlIllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIlIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIlIllIIll.getBytes(StandardCharsets.UTF_8)), lllIlllIlIIl[5]), "DES");
            Cipher lllllllllllllllIIlIlllIIlIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIIlIllIllI.init(lllIlllIlIIl[2], lllllllllllllllIIlIlllIIlIllIlll);
            return new String(lllllllllllllllIIlIlllIIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIlIllIlIl) {
            lllllllllllllllIIlIlllIIlIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIIlIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIllIlllIIIlI();
        lIIIllIlllIIIII();
        OPEN = new g(lllIlllIIlIl[lllIlllIlIIl[0]], lllIlllIlIIl[0]);
        EMPTY = new g(lllIlllIIlIl[lllIlllIlIIl[1]], lllIlllIlIIl[1]);
        FULL = new g(lllIlllIIlIl[lllIlllIlIIl[2]], lllIlllIlIIl[2]);
        TRANSITION = new g(lllIlllIIlIl[lllIlllIlIIl[3]], lllIlllIlIIl[3]);
        g[] gVarArr = new g[lllIlllIlIIl[4]];
        gVarArr[lllIlllIlIIl[0]] = OPEN;
        gVarArr[lllIlllIlIIl[1]] = EMPTY;
        gVarArr[lllIlllIlIIl[2]] = FULL;
        gVarArr[lllIlllIlIIl[3]] = TRANSITION;
        $VALUES = gVarArr;
    }

    private static String lIIIllIllIlllll(String lllllllllllllllIIlIlllIIllIlIllI, String lllllllllllllllIIlIlllIIllIlIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIIllIlIlII = new StringBuilder();
        char[] lllllllllllllllIIlIlllIIllIlIIll = lllllllllllllllIIlIlllIIllIlIlIl.toCharArray();
        int lllllllllllllllIIlIlllIIllIlIIlI = lllIlllIlIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlllIlIIl[0];
        while (lIIIllIlllIIlIl(i, length)) {
            char lllllllllllllllIIlIlllIIllIlIlll = charArray[i];
            lllllllllllllllIIlIlllIIllIlIlII.append((char) (lllllllllllllllIIlIlllIIllIlIlll ^ lllllllllllllllIIlIlllIIllIlIIll[lllllllllllllllIIlIlllIIllIlIIlI % lllllllllllllllIIlIlllIIllIlIIll.length]));
            "".length();
            lllllllllllllllIIlIlllIIllIlIIlI++;
            i++;
            "".length();
            if ((-(12 ^ 8)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlllIIllIlIlII);
    }

    private static void lIIIllIlllIIIII() {
        lllIlllIIlIl = new String[lllIlllIlIIl[4]];
        lllIlllIIlIl[lllIlllIlIIl[0]] = lIIIllIllIllIll("BRoOCCv2hSM=", "BLYgA");
        lllIlllIIlIl[lllIlllIlIIl[1]] = lIIIllIllIllIll("c1a1mkl4858=", "WNVRE");
        lllIlllIIlIl[lllIlllIlIIl[2]] = lIIIllIllIlllII("osseZz9Eeqs=", "WXxPe");
        lllIlllIIlIl[lllIlllIlIIl[3]] = lIIIllIllIlllll("AAcpICodASEhNw==", "TUhny");
    }

    private g(String str, int i) {
    }

    private static void lIIIllIlllIIIlI() {
        lllIlllIlIIl = new int[6];
        lllIlllIlIIl[0] = (96 ^ 117) & ((9 ^ 28) ^ (-1));
        lllIlllIlIIl[1] = " ".length();
        lllIlllIlIIl[2] = "  ".length();
        lllIlllIlIIl[3] = "   ".length();
        lllIlllIlIIl[4] = 60 ^ 56;
        lllIlllIlIIl[5] = (((50 + 37) - (-70)) + 5) ^ (((27 + 106) - 3) + 40);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    private static String lIIIllIllIlllII(String lllllllllllllllIIlIlllIIllIIIIIl, String lllllllllllllllIIlIlllIIllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlllIlIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIllIIIIlI) {
            lllllllllllllllIIlIlllIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }
}
