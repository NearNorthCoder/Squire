package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/u.class */
public final class EnumC0020u {
    private static /* synthetic */ int[] lllIIIIlIIll;
    public static final /* synthetic */ EnumC0020u GRAPPLE;
    public static final /* synthetic */ EnumC0020u FIX_BRIDGE;
    public static final /* synthetic */ EnumC0020u CAST_PORTAL;
    public static final /* synthetic */ EnumC0020u HOLY_BARRIER;
    public static final /* synthetic */ EnumC0020u BRAZIER;
    private static /* synthetic */ String[] lllIIIIlIIlI;
    private static final /* synthetic */ EnumC0020u[] $VALUES;

    private static void lIIIlIIIIlllllI() {
        lllIIIIlIIll = new int[7];
        lllIIIIlIIll[0] = (254 ^ 161) & ((212 ^ 139) ^ (-1));
        lllIIIIlIIll[1] = " ".length();
        lllIIIIlIIll[2] = "  ".length();
        lllIIIIlIIll[3] = "   ".length();
        lllIIIIlIIll[4] = 116 ^ 112;
        lllIIIIlIIll[5] = (((91 + 37) - 16) + 15) ^ (97 ^ 27);
        lllIIIIlIIll[6] = 12 ^ 4;
    }

    private static String lIIIlIIIIlllIll(String lllllllllllllllIIlllIIlIIIIIlIll, String lllllllllllllllIIlllIIlIIIIIllll) {
        String lllllllllllllllIIlllIIlIIIIIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIlIIIIIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIIlllIIlIIIIIllll.toCharArray();
        int lllllllllllllllIIlllIIlIIIIIllII = lllIIIIlIIll[0];
        char[] charArray2 = lllllllllllllllIIlllIIlIIIIIlIll2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIlIIll[0];
        while (lIIIlIIIIllllll(i, length)) {
            char lllllllllllllllIIlllIIlIIIIlIIIl = charArray2[i];
            lllllllllllllllIIlllIIlIIIIIlllI.append((char) (lllllllllllllllIIlllIIlIIIIlIIIl ^ charArray[lllllllllllllllIIlllIIlIIIIIllII % charArray.length]));
            "".length();
            lllllllllllllllIIlllIIlIIIIIllII++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIIlIIIIIlllI);
    }

    private EnumC0020u(String str, int i) {
    }

    private static String lIIIlIIIIlllIlI(String lllllllllllllllIIlllIIIllllIlllI, String lllllllllllllllIIlllIIIllllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIlIIll[2], lllllllllllllllIIlllIIIlllllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIllllIllll) {
            lllllllllllllllIIlllIIIllllIllll.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIIIIlllllI();
        lIIIlIIIIllllIl();
        FIX_BRIDGE = new EnumC0020u(lllIIIIlIIlI[lllIIIIlIIll[0]], lllIIIIlIIll[0]);
        HOLY_BARRIER = new EnumC0020u(lllIIIIlIIlI[lllIIIIlIIll[1]], lllIIIIlIIll[1]);
        CAST_PORTAL = new EnumC0020u(lllIIIIlIIlI[lllIIIIlIIll[2]], lllIIIIlIIll[2]);
        BRAZIER = new EnumC0020u(lllIIIIlIIlI[lllIIIIlIIll[3]], lllIIIIlIIll[3]);
        GRAPPLE = new EnumC0020u(lllIIIIlIIlI[lllIIIIlIIll[4]], lllIIIIlIIll[4]);
        EnumC0020u[] enumC0020uArr = new EnumC0020u[lllIIIIlIIll[5]];
        enumC0020uArr[lllIIIIlIIll[0]] = FIX_BRIDGE;
        enumC0020uArr[lllIIIIlIIll[1]] = HOLY_BARRIER;
        enumC0020uArr[lllIIIIlIIll[2]] = CAST_PORTAL;
        enumC0020uArr[lllIIIIlIIll[3]] = BRAZIER;
        enumC0020uArr[lllIIIIlIIll[4]] = GRAPPLE;
        $VALUES = enumC0020uArr;
    }

    public static EnumC0020u valueOf(String str) {
        return (EnumC0020u) Enum.valueOf(EnumC0020u.class, str);
    }

    private static String lIIIlIIIIllllII(String lllllllllllllllIIlllIIIllllllIll, String lllllllllllllllIIlllIIIllllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIllllllIlI.getBytes(StandardCharsets.UTF_8)), lllIIIIlIIll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIlIIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIlllllllII) {
            lllllllllllllllIIlllIIIlllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIllllll(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIIIIllllIl() {
        lllIIIIlIIlI = new String[lllIIIIlIIll[5]];
        lllIIIIlIIlI[lllIIIIlIIll[0]] = lIIIlIIIIlllIlI("QTUa/Z+2rQrzmXzU2ZQcTw==", "QzPXI");
        lllIIIIlIIlI[lllIIIIlIIll[1]] = lIIIlIIIIlllIll("PiM6NTs0LSQ+LTM+", "vlvld");
        lllIIIIlIIlI[lllIIIIlIIll[2]] = lIIIlIIIIlllIll("AhkeBjYRFx8GKA0=", "AXMRi");
        lllIIIIlIIlI[lllIIIIlIIll[3]] = lIIIlIIIIlllIll("JjQiOB4hNA==", "dfcbW");
        lllIIIIlIIlI[lllIIIIlIIll[4]] = lIIIlIIIIllllII("nSkT02XTIOQ=", "IAyhE");
    }

    public static EnumC0020u[] values() {
        return (EnumC0020u[]) $VALUES.clone();
    }
}
