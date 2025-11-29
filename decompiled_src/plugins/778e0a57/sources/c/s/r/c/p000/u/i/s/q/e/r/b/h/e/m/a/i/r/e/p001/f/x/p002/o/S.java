package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.S  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/S.class */
public final class S {
    public static /* synthetic */ int EAST;
    public static /* synthetic */ int NORTH;
    public static final /* synthetic */ S TEMPLATE_EAST;
    public static final /* synthetic */ S TEMPLATE_NORTH;
    public static /* synthetic */ int SOUTH;
    public static final /* synthetic */ S TEMPLATE_WEST;
    private static final /* synthetic */ S[] $VALUES;
    private static /* synthetic */ String[] lIlIlIlIllIl;
    public static final /* synthetic */ S TEMPLATE_UNKNOWN;
    public static /* synthetic */ int WEST;
    private static /* synthetic */ int[] lIlIlIlIlllI;

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    static {
        llIllllIIllIlI();
        llIllllIIllIIl();
        TEMPLATE_WEST = new S(lIlIlIlIllIl[lIlIlIlIlllI[3]], lIlIlIlIlllI[3]);
        TEMPLATE_NORTH = new S(lIlIlIlIllIl[lIlIlIlIlllI[4]], lIlIlIlIlllI[4]);
        TEMPLATE_EAST = new S(lIlIlIlIllIl[lIlIlIlIlllI[1]], lIlIlIlIlllI[1]);
        TEMPLATE_UNKNOWN = new S(lIlIlIlIllIl[lIlIlIlIlllI[5]], lIlIlIlIlllI[5]);
        S[] sArr = new S[lIlIlIlIlllI[2]];
        sArr[lIlIlIlIlllI[3]] = TEMPLATE_WEST;
        sArr[lIlIlIlIlllI[4]] = TEMPLATE_NORTH;
        sArr[lIlIlIlIlllI[1]] = TEMPLATE_EAST;
        sArr[lIlIlIlIlllI[5]] = TEMPLATE_UNKNOWN;
        $VALUES = sArr;
        NORTH = lIlIlIlIlllI[3];
        EAST = lIlIlIlIlllI[4];
        SOUTH = lIlIlIlIlllI[1];
        WEST = lIlIlIlIlllI[5];
    }

    public static int d(char c2) {
        switch (c2) {
            case 'E':
                return EAST;
            case 'N':
                return NORTH;
            case 'S':
                return SOUTH;
            case 'W':
                return WEST;
            default:
                return lIlIlIlIlllI[0];
        }
    }

    private static boolean llIllllIIllIll(int i, int i2) {
        return i < i2;
    }

    public static S a(char c2, char c3) {
        switch (b(c2, c3)) {
            case 1:
                return TEMPLATE_WEST;
            case 2:
                return TEMPLATE_NORTH;
            case 3:
                return TEMPLATE_EAST;
            default:
                return TEMPLATE_UNKNOWN;
        }
    }

    private static String llIllllIIllIII(String lllllllllllllllIllIIllllIIlllIll, String lllllllllllllllIllIIllllIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIllllIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlllI[6]), "DES");
            Cipher lllllllllllllllIllIIllllIIllllIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIllllIIllllIl.init(lIlIlIlIlllI[1], lllllllllllllllIllIIllllIIlllllI);
            return new String(lllllllllllllllIllIIllllIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllllIIllllII) {
            lllllllllllllllIllIIllllIIllllII.printStackTrace();
            return null;
        }
    }

    private static int b(char c2, char c3) {
        return ((d(c3) - e(c2)) + lIlIlIlIlllI[2]) % lIlIlIlIlllI[2];
    }

    private S(String str, int i) {
    }

    public static int e(char c2) {
        return (d(c2) + lIlIlIlIlllI[1]) % lIlIlIlIlllI[2];
    }

    private static void llIllllIIllIIl() {
        lIlIlIlIllIl = new String[lIlIlIlIlllI[2]];
        lIlIlIlIllIl[lIlIlIlIlllI[3]] = llIllllIIlIlll("Fh8IPxsDDgAwAAcJEQ==", "BZEoW");
        lIlIlIlIllIl[lIlIlIlIlllI[4]] = llIllllIIlIlll("Lg4pMSE7HyE+IzUZMCk=", "zKdam");
        lIlIlIlIllIl[lIlIlIlIlllI[1]] = llIllllIIllIII("kKhsXpk3SGPQfq9iTB5AVg==", "OcaIW");
        lIlIlIlIllIl[lIlIlIlIlllI[5]] = llIllllIIlIlll("GicBOTYPNgk2LwApAiYtAA==", "NbLiz");
    }

    private static void llIllllIIllIlI() {
        lIlIlIlIlllI = new int[7];
        lIlIlIlIlllI[0] = -" ".length();
        lIlIlIlIlllI[1] = "  ".length();
        lIlIlIlIlllI[2] = 110 ^ 106;
        lIlIlIlIlllI[3] = (43 ^ 112) & ((237 ^ 182) ^ (-1));
        lIlIlIlIlllI[4] = " ".length();
        lIlIlIlIlllI[5] = "   ".length();
        lIlIlIlIlllI[6] = (92 ^ 108) ^ (9 ^ 49);
    }

    private static String llIllllIIlIlll(String lllllllllllllllIllIIllllIlIlIIII, String lllllllllllllllIllIIllllIlIIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIllllIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIllllIlIIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIllllIlIIllll.toCharArray();
        int lllllllllllllllIllIIllllIlIIllII = lIlIlIlIlllI[3];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIlIlllI[3];
        while (llIllllIIllIll(i, length)) {
            char lllllllllllllllIllIIllllIlIlIIIl = charArray2[i];
            lllllllllllllllIllIIllllIlIIlllI.append((char) (lllllllllllllllIllIIllllIlIlIIIl ^ charArray[lllllllllllllllIllIIllllIlIIllII % charArray.length]));
            "".length();
            lllllllllllllllIllIIllllIlIIllII++;
            i++;
            "".length();
            if (((6 ^ 86) ^ (4 ^ 80)) != ((((68 + 33) - (-74)) + 7) ^ (((46 + 150) - 105) + 87))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIllllIlIIlllI);
    }

    public static S[] values() {
        return (S[]) $VALUES.clone();
    }
}
