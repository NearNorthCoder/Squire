package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/g.class */
public final class EnumC0006g {
    private static final /* synthetic */ EnumC0006g[] $VALUES;
    public static final /* synthetic */ EnumC0006g BLADE;
    public static final /* synthetic */ EnumC0006g GOLDEN_BLADE_II;
    public static final /* synthetic */ EnumC0006g GOLDEN_BLADE_V;
    public static final /* synthetic */ EnumC0006g BLADE_I;
    public static final /* synthetic */ EnumC0006g BLADE_III;
    public static final /* synthetic */ EnumC0006g BLADE_II;
    public static final /* synthetic */ EnumC0006g BLUE_BLADE_II;
    public static final /* synthetic */ EnumC0006g BLADE_IV;
    public static final /* synthetic */ EnumC0006g GOLDEN_BLADE_III;
    public static final /* synthetic */ EnumC0006g GOLDEN_BLADE_IV;
    public static final /* synthetic */ EnumC0006g GOLDEN_BLADE_VI;
    private static /* synthetic */ int[] lllIIIIIlIII;
    public static final /* synthetic */ EnumC0006g BLUE_BLADE_I;
    private static /* synthetic */ String[] lllIIIIIIlll;
    public static final /* synthetic */ EnumC0006g GOLDEN_BLADE_I;

    private EnumC0006g(String str, int i) {
    }

    static {
        lIIIlIIIIIlIllI();
        lIIIlIIIIIlIlIl();
        BLADE = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[0]], lllIIIIIlIII[0]);
        BLADE_I = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[1]], lllIIIIIlIII[1]);
        BLADE_II = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[2]], lllIIIIIlIII[2]);
        BLADE_III = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[3]], lllIIIIIlIII[3]);
        BLADE_IV = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[4]], lllIIIIIlIII[4]);
        GOLDEN_BLADE_II = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[5]], lllIIIIIlIII[5]);
        GOLDEN_BLADE_I = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[6]], lllIIIIIlIII[6]);
        GOLDEN_BLADE_III = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[7]], lllIIIIIlIII[7]);
        GOLDEN_BLADE_IV = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[8]], lllIIIIIlIII[8]);
        GOLDEN_BLADE_V = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[9]], lllIIIIIlIII[9]);
        GOLDEN_BLADE_VI = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[10]], lllIIIIIlIII[10]);
        BLUE_BLADE_I = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[11]], lllIIIIIlIII[11]);
        BLUE_BLADE_II = new EnumC0006g(lllIIIIIIlll[lllIIIIIlIII[12]], lllIIIIIlIII[12]);
        EnumC0006g[] enumC0006gArr = new EnumC0006g[lllIIIIIlIII[13]];
        enumC0006gArr[lllIIIIIlIII[0]] = BLADE;
        enumC0006gArr[lllIIIIIlIII[1]] = BLADE_I;
        enumC0006gArr[lllIIIIIlIII[2]] = BLADE_II;
        enumC0006gArr[lllIIIIIlIII[3]] = BLADE_III;
        enumC0006gArr[lllIIIIIlIII[4]] = BLADE_IV;
        enumC0006gArr[lllIIIIIlIII[5]] = GOLDEN_BLADE_II;
        enumC0006gArr[lllIIIIIlIII[6]] = GOLDEN_BLADE_I;
        enumC0006gArr[lllIIIIIlIII[7]] = GOLDEN_BLADE_III;
        enumC0006gArr[lllIIIIIlIII[8]] = GOLDEN_BLADE_IV;
        enumC0006gArr[lllIIIIIlIII[9]] = GOLDEN_BLADE_V;
        enumC0006gArr[lllIIIIIlIII[10]] = GOLDEN_BLADE_VI;
        enumC0006gArr[lllIIIIIlIII[11]] = BLUE_BLADE_I;
        enumC0006gArr[lllIIIIIlIII[12]] = BLUE_BLADE_II;
        $VALUES = enumC0006gArr;
    }

    public static EnumC0006g valueOf(String str) {
        return (EnumC0006g) Enum.valueOf(EnumC0006g.class, str);
    }

    private static String lIIIlIIIIIlIIll(String lllllllllllllllIIlllIIllIIlIIllI, String lllllllllllllllIIlllIIllIIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lllIIIIIlIII[8]), "DES");
            Cipher lllllllllllllllIIlllIIllIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIllIIlIlIII.init(lllIIIIIlIII[2], secretKeySpec);
            return new String(lllllllllllllllIIlllIIllIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIllIIlIIlll) {
            lllllllllllllllIIlllIIllIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIIlIllI() {
        lllIIIIIlIII = new int[14];
        lllIIIIIlIII[0] = ((171 ^ 178) ^ (138 ^ 161)) & (((((96 + 98) - 109) + 43) ^ (((133 + 140) - 209) + 114)) ^ (-" ".length()));
        lllIIIIIlIII[1] = " ".length();
        lllIIIIIlIII[2] = "  ".length();
        lllIIIIIlIII[3] = "   ".length();
        lllIIIIIlIII[4] = 93 ^ 89;
        lllIIIIIlIII[5] = 182 ^ 179;
        lllIIIIIlIII[6] = (116 ^ 18) ^ (45 ^ 77);
        lllIIIIIlIII[7] = 83 ^ 84;
        lllIIIIIlIII[8] = 18 ^ 26;
        lllIIIIIlIII[9] = (81 ^ 26) ^ (65 ^ 3);
        lllIIIIIlIII[10] = (((43 + 72) - 14) + 38) ^ (((107 + 3) - 61) + 80);
        lllIIIIIlIII[11] = (100 ^ 117) ^ (114 ^ 104);
        lllIIIIIlIII[12] = 146 ^ 158;
        lllIIIIIlIII[13] = (93 ^ 3) ^ (110 ^ 61);
    }

    public static EnumC0006g[] values() {
        return (EnumC0006g[]) $VALUES.clone();
    }

    private static boolean lIIIlIIIIIlIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIIIIIlIlII(String lllllllllllllllIIlllIIllIIllIIll, String lllllllllllllllIIlllIIllIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIllIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIllIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIllIIllIlIl.init(lllIIIIIlIII[2], secretKeySpec);
            return new String(lllllllllllllllIIlllIIllIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIllIIllIlII) {
            lllllllllllllllIIlllIIllIIllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIlIIlI(String lllllllllllllllIIlllIIllIlIIIIll, String lllllllllllllllIIlllIIllIlIIIlll) {
        String lllllllllllllllIIlllIIllIlIIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlllIIllIlIIIlll.toCharArray();
        int lllllllllllllllIIlllIIllIIllllll = lllIIIIIlIII[0];
        char[] charArray2 = lllllllllllllllIIlllIIllIlIIIIll2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIIlIII[0];
        while (lIIIlIIIIIlIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlllIIllIIllllll % charArray.length]));
            "".length();
            lllllllllllllllIIlllIIllIIllllll++;
            i++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlIIIIIlIlIl() {
        lllIIIIIIlll = new String[lllIIIIIlIII[13]];
        lllIIIIIIlll[lllIIIIIlIII[0]] = lIIIlIIIIIlIIlI("FgobKRc=", "TFZmR");
        lllIIIIIIlll[lllIIIIIlIII[1]] = lIIIlIIIIIlIIll("pBjarpFkt0U=", "mCLSU");
        lllIIIIIIlll[lllIIIIIlIII[2]] = lIIIlIIIIIlIIll("Ayekisq87zxE8OrxgLrVqw==", "myooJ");
        lllIIIIIIlll[lllIIIIIlIII[3]] = lIIIlIIIIIlIIlI("FyUYBi8KIBAL", "UiYBj");
        lllIIIIIIlll[lllIIIIIlIII[4]] = lIIIlIIIIIlIIlI("LwkAEzwyDBc=", "mEAWy");
        lllIIIIIIlll[lllIIIIIlIII[5]] = lIIIlIIIIIlIlII("B2T8Mjy3UEk3A0eI02baQQ==", "qQXow");
        lllIIIIIIlll[lllIIIIIlIII[6]] = lIIIlIIIIIlIlII("PR+rtJZ5XWn7bah/mXMhsQ==", "TNkDI");
        lllIIIIIIlll[lllIIIIIlIII[7]] = lIIIlIIIIIlIlII("BUZtE+v0hj9TfmXfi9WCEfc1R2FKauQi", "MOagt");
        lllIIIIIIlll[lllIIIIIlIII[8]] = lIIIlIIIIIlIlII("eO0g0d35NCuV30VurFlmoA==", "CRLfl");
        lllIIIIIIlll[lllIIIIIlIII[9]] = lIIIlIIIIIlIIlI("KBc/DjIhBzEGNisdLBw=", "oXsJw");
        lllIIIIIIlll[lllIIIIIlIII[10]] = lIIIlIIIIIlIIll("xWWaBIrC8LQ2gwTeue+YXA==", "YmBEN");
        lllIIIIIIlll[lllIIIIIlIII[11]] = lIIIlIIIIIlIIll("L+0zSrQ9WJVOcJzcE1VzAw==", "xmqOa");
        lllIIIIIIlll[lllIIIIIlIII[12]] = lIIIlIIIIIlIIlI("KiABAg8qIBUDFTclHQ==", "hlTGP");
    }
}
