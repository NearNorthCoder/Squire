package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/j.class */
public final class EnumC0009j {
    public static final /* synthetic */ EnumC0009j EAST;
    private static /* synthetic */ int[] lllIIIIIllII;
    public static final /* synthetic */ EnumC0009j NORTH;
    public static final /* synthetic */ EnumC0009j SOUTH;
    private static /* synthetic */ String[] lllIIIIIlIll;
    public static final /* synthetic */ EnumC0009j WEST;
    private static final /* synthetic */ EnumC0009j[] $VALUES;

    private static String lIIIlIIIIIlllll(String lllllllllllllllIIlllIIlIllIIIlll, String lllllllllllllllIIlllIIlIllIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIllIIIllI.getBytes(StandardCharsets.UTF_8)), lllIIIIIllII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIllII[2], lllllllllllllllIIlllIIlIllIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIllIIlIII) {
            lllllllllllllllIIlllIIlIllIIlIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIlIIIIl() {
        lllIIIIIllII = new int[6];
        lllIIIIIllII[0] = "   ".length() & ("   ".length() ^ (-1));
        lllIIIIIllII[1] = " ".length();
        lllIIIIIllII[2] = "  ".length();
        lllIIIIIllII[3] = "   ".length();
        lllIIIIIllII[4] = 105 ^ 109;
        lllIIIIIllII[5] = (239 ^ 193) ^ (88 ^ 126);
    }

    public static EnumC0009j[] values() {
        return (EnumC0009j[]) $VALUES.clone();
    }

    public static EnumC0009j valueOf(String str) {
        return (EnumC0009j) Enum.valueOf(EnumC0009j.class, str);
    }

    private EnumC0009j(String str, int i) {
    }

    private static void lIIIlIIIIlIIIII() {
        lllIIIIIlIll = new String[lllIIIIIllII[4]];
        lllIIIIIlIll[lllIIIIIllII[0]] = lIIIlIIIIIlllIl("FmV23J4yvj0=", "HvjQw");
        lllIIIIIlIll[lllIIIIIllII[1]] = lIIIlIIIIIllllI("OTcQBjA=", "jxERx");
        lllIIIIIlIll[lllIIIIIllII[2]] = lIIIlIIIIIlllll("f+ByjQGwcPA=", "HEMpD");
        lllIIIIIlIll[lllIIIIIllII[3]] = lIIIlIIIIIlllll("U0Ft8iPW3mM=", "ANini");
    }

    private static String lIIIlIIIIIlllIl(String lllllllllllllllIIlllIIlIllIlIlII, String lllllllllllllllIIlllIIlIllIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIlIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIlIllIlIllI.init(lllIIIIIllII[2], secretKeySpec);
            return new String(lllllllllllllllIIlllIIlIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIllIlIlIl) {
            lllllllllllllllIIlllIIlIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIllllI(String lllllllllllllllIIlllIIlIlllIlIIl, String lllllllllllllllIIlllIIlIlllIlIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIlIlllIIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlllIIlIlllIlIII.toCharArray();
        int lllllllllllllllIIlllIIlIlllIIlIl = lllIIIIIllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIIllII[0];
        while (lIIIlIIIIlIIIlI(i, length)) {
            lllllllllllllllIIlllIIlIlllIIlll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlllIIlIlllIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIlllIIlIlllIIlIl++;
            i++;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIIlIlllIIlll);
    }

    private static boolean lIIIlIIIIlIIIlI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIlIIIIlIIIIl();
        lIIIlIIIIlIIIII();
        NORTH = new EnumC0009j(lllIIIIIlIll[lllIIIIIllII[0]], lllIIIIIllII[0]);
        SOUTH = new EnumC0009j(lllIIIIIlIll[lllIIIIIllII[1]], lllIIIIIllII[1]);
        WEST = new EnumC0009j(lllIIIIIlIll[lllIIIIIllII[2]], lllIIIIIllII[2]);
        EAST = new EnumC0009j(lllIIIIIlIll[lllIIIIIllII[3]], lllIIIIIllII[3]);
        EnumC0009j[] enumC0009jArr = new EnumC0009j[lllIIIIIllII[4]];
        enumC0009jArr[lllIIIIIllII[0]] = NORTH;
        enumC0009jArr[lllIIIIIllII[1]] = SOUTH;
        enumC0009jArr[lllIIIIIllII[2]] = WEST;
        enumC0009jArr[lllIIIIIllII[3]] = EAST;
        $VALUES = enumC0009jArr;
    }
}
