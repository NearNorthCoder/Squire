package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.j  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/j.class */
public final class EnumC0009j {
    public static final /* synthetic */ EnumC0009j BRONZE;
    public static final /* synthetic */ EnumC0009j IRON;
    public static final /* synthetic */ EnumC0009j DRAGON;
    public static final /* synthetic */ EnumC0009j AMETHYST;
    private final /* synthetic */ int dartTipId;
    public static final /* synthetic */ EnumC0009j ADAMANT;
    private static final /* synthetic */ EnumC0009j[] $VALUES;
    public static final /* synthetic */ EnumC0009j STEEL;
    private static /* synthetic */ int[] lllIlIIlIIl;
    public static final /* synthetic */ EnumC0009j RUNE;
    private static /* synthetic */ String[] lllIlIIlIII;
    public static final /* synthetic */ EnumC0009j MITHRIL;

    private static void lIlIllllIlIllI() {
        lllIlIIlIIl = new int[17];
        lllIlIIlIIl[0] = (32 ^ 62) & ((139 ^ 149) ^ (-1));
        lllIlIIlIIl[1] = (-(((106 + 9) - 91) + 109)) & (-1) & 951;
        lllIlIIlIIl[2] = " ".length();
        lllIlIIlIIl[3] = (-23691) & 24510;
        lllIlIIlIIl[4] = "  ".length();
        lllIlIIlIIl[5] = (-13441) & 14261;
        lllIlIIlIIl[6] = "   ".length();
        lllIlIIlIIl[7] = (-12418) & 13239;
        lllIlIIlIIl[8] = 140 ^ 136;
        lllIlIIlIIl[9] = (-12353) & 13175;
        lllIlIIlIIl[10] = (0 ^ 112) ^ (18 ^ 103);
        lllIlIIlIIl[11] = (-((-2055) & 7367)) & (-16386) & 22521;
        lllIlIIlIIl[12] = (((18 + 111) - 106) + 135) ^ (((57 + 0) - (-72)) + 23);
        lllIlIIlIIl[13] = (-3) & 25855;
        lllIlIIlIIl[14] = 119 ^ 112;
        lllIlIIlIIl[15] = (-20491) & 31722;
        lllIlIIlIIl[16] = (223 ^ 169) ^ (99 ^ 29);
    }

    public static EnumC0009j[] values() {
        return (EnumC0009j[]) $VALUES.clone();
    }

    private static void lIlIllllIlIlIl() {
        lllIlIIlIII = new String[lllIlIIlIIl[16]];
        lllIlIIlIII[lllIlIIlIIl[0]] = lIlIllllIlIIlI("r6J1SPycffI=", "XAmJU");
        lllIlIIlIII[lllIlIIlIIl[2]] = lIlIllllIlIIll("cIvE/icNVX0=", "KOiXU");
        lllIlIIlIII[lllIlIIlIIl[4]] = lIlIllllIlIIll("zhrQvlVc6X0=", "cFfuc");
        lllIlIIlIII[lllIlIIlIIl[6]] = lIlIllllIlIlII("KCMxKj4sJg==", "ejebl");
        lllIlIIlIII[lllIlIIlIIl[8]] = lIlIllllIlIIlI("iPmDYRzP4RU=", "yiLzp");
        lllIlIIlIII[lllIlIIlIIl[10]] = lIlIllllIlIIlI("WxGJw0E7wkg=", "KoFMb");
        lllIlIIlIII[lllIlIIlIIl[12]] = lIlIllllIlIlII("DAwRNhEUEgA=", "MATbY");
        lllIlIIlIII[lllIlIIlIIl[14]] = lIlIllllIlIIll("OGTyrp6zFKY=", "ZJBbH");
    }

    public int D() {
        return this.dartTipId;
    }

    private static boolean lIlIllllIlIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllllIlIlII(String llllllllllllllllIIlIIllIIIIlIlll, String llllllllllllllllIIlIIllIIIIlIllI) {
        String llllllllllllllllIIlIIllIIIIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIIllIIIIlIlII = llllllllllllllllIIlIIllIIIIlIllI.toCharArray();
        int llllllllllllllllIIlIIllIIIIlIIll = lllIlIIlIIl[0];
        char[] charArray = llllllllllllllllIIlIIllIIIIlIlll2.toCharArray();
        int length = charArray.length;
        int i = lllIlIIlIIl[0];
        while (lIlIllllIlIlll(i, length)) {
            char llllllllllllllllIIlIIllIIIIllIII = charArray[i];
            sb.append((char) (llllllllllllllllIIlIIllIIIIllIII ^ llllllllllllllllIIlIIllIIIIlIlII[llllllllllllllllIIlIIllIIIIlIIll % llllllllllllllllIIlIIllIIIIlIlII.length]));
            "".length();
            llllllllllllllllIIlIIllIIIIlIIll++;
            i++;
            "".length();
            if (((191 ^ 181) & ((57 ^ 51) ^ (-1))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIllllIlIllI();
        lIlIllllIlIlIl();
        BRONZE = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[0]], lllIlIIlIIl[0], lllIlIIlIIl[1]);
        IRON = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[2]], lllIlIIlIIl[2], lllIlIIlIIl[3]);
        STEEL = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[4]], lllIlIIlIIl[4], lllIlIIlIIl[5]);
        MITHRIL = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[6]], lllIlIIlIIl[6], lllIlIIlIIl[7]);
        ADAMANT = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[8]], lllIlIIlIIl[8], lllIlIIlIIl[9]);
        RUNE = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[10]], lllIlIIlIIl[10], lllIlIIlIIl[11]);
        AMETHYST = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[12]], lllIlIIlIIl[12], lllIlIIlIIl[13]);
        DRAGON = new EnumC0009j(lllIlIIlIII[lllIlIIlIIl[14]], lllIlIIlIIl[14], lllIlIIlIIl[15]);
        EnumC0009j[] enumC0009jArr = new EnumC0009j[lllIlIIlIIl[16]];
        enumC0009jArr[lllIlIIlIIl[0]] = BRONZE;
        enumC0009jArr[lllIlIIlIIl[2]] = IRON;
        enumC0009jArr[lllIlIIlIIl[4]] = STEEL;
        enumC0009jArr[lllIlIIlIIl[6]] = MITHRIL;
        enumC0009jArr[lllIlIIlIIl[8]] = ADAMANT;
        enumC0009jArr[lllIlIIlIIl[10]] = RUNE;
        enumC0009jArr[lllIlIIlIIl[12]] = AMETHYST;
        enumC0009jArr[lllIlIIlIIl[14]] = DRAGON;
        $VALUES = enumC0009jArr;
    }

    private EnumC0009j(String str, int i, int i2) {
        this.dartTipId = i2;
    }

    private static String lIlIllllIlIIll(String llllllllllllllllIIlIIllIIIlIIlll, String llllllllllllllllIIlIIllIIIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIlIIllI.getBytes(StandardCharsets.UTF_8)), lllIlIIlIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIlIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIIlIlIII) {
            llllllllllllllllIIlIIllIIIlIlIII.printStackTrace();
            return null;
        }
    }

    public static EnumC0009j valueOf(String str) {
        return (EnumC0009j) Enum.valueOf(EnumC0009j.class, str);
    }

    private static String lIlIllllIlIIlI(String llllllllllllllllIIlIIllIIIllIlII, String llllllllllllllllIIlIIllIIIllIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIlIIl[4], llllllllllllllllIIlIIllIIIllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIIllIlIl) {
            llllllllllllllllIIlIIllIIIllIlIl.printStackTrace();
            return null;
        }
    }
}
