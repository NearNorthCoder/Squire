package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.F  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/F.class */
public final class F {
    private static /* synthetic */ int[] lIlllIllIlII;
    public static final /* synthetic */ F UNKNOWN;
    public static final /* synthetic */ F BUILT;
    private static /* synthetic */ String[] lIlllIllIIll;
    private final /* synthetic */ Color color;
    public static final /* synthetic */ F SEEDED;
    public static final /* synthetic */ F EMPTY;
    private static final /* synthetic */ F[] $VALUES;

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    private static boolean lllIllIIllllIl(int i, int i2) {
        return i > i2;
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }

    private static String lllIllIIlllIII(String lllllllllllllllIlIllIlIlIIlIIllI, String lllllllllllllllIlIllIlIlIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIlIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlllIllIlII[5]), "DES");
            Cipher lllllllllllllllIlIllIlIlIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlIllIlIlIIlIlIII.init(lIlllIllIlII[3], lllllllllllllllIlIllIlIlIIlIlIIl);
            return new String(lllllllllllllllIlIllIlIlIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlIlIIlIIlll) {
            lllllllllllllllIlIllIlIlIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIIllllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIllIIllllII(int i) {
        return i >= 0;
    }

    private static void lllIllIIlllIll() {
        lIlllIllIlII = new int[6];
        lIlllIllIlII[0] = "   ".length();
        lIlllIllIlII[1] = ((148 ^ 189) ^ (156 ^ 168)) & (((17 ^ 56) ^ (88 ^ 108)) ^ (-" ".length()));
        lIlllIllIlII[2] = " ".length();
        lIlllIllIlII[3] = "  ".length();
        lIlllIllIlII[4] = (((94 + 128) - 182) + 129) ^ (((105 + 99) - 181) + 150);
        lIlllIllIlII[5] = 74 ^ 66;
    }

    private F(String str, int i, Color color) {
        this.color = color;
    }

    private static void lllIllIIlllIlI() {
        lIlllIllIIll = new String[lIlllIllIlII[4]];
        lIlllIllIIll[lIlllIllIlII[1]] = lllIllIIllIlll("V/R1JYfg9sQ=", "BlruL");
        lIlllIllIIll[lIlllIllIlII[2]] = lllIllIIlllIII("Bs+GVxZUUKg=", "buvoa");
        lIlllIllIIll[lIlllIllIlII[3]] = lllIllIIlllIIl("PRwBEwM=", "xQQGZ");
        lIlllIllIIll[lIlllIllIlII[0]] = lllIllIIlllIIl("PB0kGh4+HQ==", "iSoTQ");
    }

    private static String lllIllIIllIlll(String lllllllllllllllIlIllIlIlIIIIIIIl, String lllllllllllllllIlIllIlIlIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIlIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIllIlII[3], lllllllllllllllIlIllIlIlIIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlIlIIIIIIlI) {
            lllllllllllllllIlIllIlIlIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllIllIIlllIIl(String lllllllllllllllIlIllIlIlIIIlIIIl, String lllllllllllllllIlIllIlIlIIIlIlIl) {
        String lllllllllllllllIlIllIlIlIIIlIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlIlIIIlIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIlIlIIIlIlIl.toCharArray();
        int lllllllllllllllIlIllIlIlIIIIllIl = lIlllIllIlII[1];
        char[] charArray2 = lllllllllllllllIlIllIlIlIIIlIIIl2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlIllIlIlIIIIlIlI = lIlllIllIlII[1];
        while (lllIllIIllllll(lllllllllllllllIlIllIlIlIIIIlIlI, length)) {
            char lllllllllllllllIlIllIlIlIIIlIlll = charArray2[lllllllllllllllIlIllIlIlIIIIlIlI];
            lllllllllllllllIlIllIlIlIIIlIlII.append((char) (lllllllllllllllIlIllIlIlIIIlIlll ^ charArray[lllllllllllllllIlIllIlIlIIIIllIl % charArray.length]));
            "".length();
            lllllllllllllllIlIllIlIlIIIIllIl++;
            lllllllllllllllIlIllIlIlIIIIlIlI++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIlIlIIIlIlII);
    }

    static {
        lllIllIIlllIll();
        lllIllIIlllIlI();
        SEEDED = new F(lIlllIllIIll[lIlllIllIlII[1]], lIlllIllIlII[1], ColorScheme.PROGRESS_COMPLETE_COLOR);
        BUILT = new F(lIlllIllIIll[lIlllIllIlII[2]], lIlllIllIlII[2], ColorScheme.PROGRESS_INPROGRESS_COLOR);
        EMPTY = new F(lIlllIllIIll[lIlllIllIlII[3]], lIlllIllIlII[3], ColorScheme.MEDIUM_GRAY_COLOR);
        UNKNOWN = new F(lIlllIllIIll[lIlllIllIlII[0]], lIlllIllIlII[0], ColorScheme.MEDIUM_GRAY_COLOR);
        F[] fArr = new F[lIlllIllIlII[4]];
        fArr[lIlllIllIlII[1]] = SEEDED;
        fArr[lIlllIllIlII[2]] = BUILT;
        fArr[lIlllIllIlII[3]] = EMPTY;
        fArr[lIlllIllIlII[0]] = UNKNOWN;
        $VALUES = fArr;
    }

    private static boolean lllIllIIlllllI(int i) {
        return i == 0;
    }

    public static F d(int i) {
        return (!lllIllIIllllII(i) || lllIllIIllllIl(i, C.values().length * lIlllIllIlII[0])) ? UNKNOWN : lllIllIIlllllI(i) ? EMPTY : lllIllIIlllllI(i % lIlllIllIlII[0]) ? SEEDED : BUILT;
    }

    public Color V() {
        return this.color;
    }
}
