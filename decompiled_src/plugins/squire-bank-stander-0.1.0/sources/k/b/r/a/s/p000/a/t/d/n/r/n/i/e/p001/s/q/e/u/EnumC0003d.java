package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.d  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/d.class */
public final class EnumC0003d {
    private final /* synthetic */ int arrowTipId;
    public static final /* synthetic */ EnumC0003d IRON;
    public static final /* synthetic */ EnumC0003d DRAGON;
    private static final /* synthetic */ EnumC0003d[] $VALUES;
    private static /* synthetic */ String[] lllIIIllIII;
    private static /* synthetic */ int[] lllIIIllIIl;
    public static final /* synthetic */ EnumC0003d MITHRIL;
    public static final /* synthetic */ EnumC0003d STEEL;
    public static final /* synthetic */ EnumC0003d ADAMANT;
    public static final /* synthetic */ EnumC0003d RUNE;
    public static final /* synthetic */ EnumC0003d BRONZE;
    public static final /* synthetic */ EnumC0003d HEADLESS;
    public static final /* synthetic */ EnumC0003d BROAD;
    public static final /* synthetic */ EnumC0003d AMETHYST;

    private static boolean lIlIllIlIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIlIIlIll() {
        lllIIIllIII = new String[lllIIIllIIl[20]];
        lllIIIllIII[lllIIIllIIl[0]] = lIlIllIlIIlIII("KykoEgUmPzo=", "cliVI");
        lllIIIllIII[lllIIIllIIl[2]] = lIlIllIlIIlIIl("DcEHaHGa0MY=", "nNKDs");
        lllIIIllIII[lllIIIllIIl[4]] = lIlIllIlIIlIIl("EqvCDEMNOqM=", "oJdIg");
        lllIIIllIII[lllIIIllIIl[6]] = lIlIllIlIIlIIl("4YTROhmEmX8=", "WqBOg");
        lllIIIllIII[lllIIIllIIl[8]] = lIlIllIlIIlIIl("TLP/spBp8lE=", "vwmQO");
        lllIIIllIII[lllIIIllIIl[10]] = lIlIllIlIIlIIl("VmqJ0vKKCP4=", "wCwjn");
        lllIIIllIII[lllIIIllIIl[12]] = lIlIllIlIIlIII("JCwzJzsrPA==", "ehrjz");
        lllIIIllIII[lllIIIllIIl[14]] = lIlIllIlIIlIII("PREHCw==", "oDING");
        lllIIIllIII[lllIIIllIIl[16]] = lIlIllIlIIlIlI("DAcBOBnzIkDHNto0ah5EdQ==", "poQFl");
        lllIIIllIII[lllIIIllIIl[18]] = lIlIllIlIIlIII("IycJDzkp", "guHHv");
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    static {
        lIlIllIlIIllII();
        lIlIllIlIIlIll();
        HEADLESS = new EnumC0003d(lllIIIllIII[lllIIIllIIl[0]], lllIIIllIIl[0], lllIIIllIIl[1]);
        BRONZE = new EnumC0003d(lllIIIllIII[lllIIIllIIl[2]], lllIIIllIIl[2], lllIIIllIIl[3]);
        IRON = new EnumC0003d(lllIIIllIII[lllIIIllIIl[4]], lllIIIllIIl[4], lllIIIllIIl[5]);
        STEEL = new EnumC0003d(lllIIIllIII[lllIIIllIIl[6]], lllIIIllIIl[6], lllIIIllIIl[7]);
        MITHRIL = new EnumC0003d(lllIIIllIII[lllIIIllIIl[8]], lllIIIllIIl[8], lllIIIllIIl[9]);
        BROAD = new EnumC0003d(lllIIIllIII[lllIIIllIIl[10]], lllIIIllIIl[10], lllIIIllIIl[11]);
        ADAMANT = new EnumC0003d(lllIIIllIII[lllIIIllIIl[12]], lllIIIllIIl[12], lllIIIllIIl[13]);
        RUNE = new EnumC0003d(lllIIIllIII[lllIIIllIIl[14]], lllIIIllIIl[14], lllIIIllIIl[15]);
        AMETHYST = new EnumC0003d(lllIIIllIII[lllIIIllIIl[16]], lllIIIllIIl[16], lllIIIllIIl[17]);
        DRAGON = new EnumC0003d(lllIIIllIII[lllIIIllIIl[18]], lllIIIllIIl[18], lllIIIllIIl[19]);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lllIIIllIIl[20]];
        enumC0003dArr[lllIIIllIIl[0]] = HEADLESS;
        enumC0003dArr[lllIIIllIIl[2]] = BRONZE;
        enumC0003dArr[lllIIIllIIl[4]] = IRON;
        enumC0003dArr[lllIIIllIIl[6]] = STEEL;
        enumC0003dArr[lllIIIllIIl[8]] = MITHRIL;
        enumC0003dArr[lllIIIllIIl[10]] = BROAD;
        enumC0003dArr[lllIIIllIIl[12]] = ADAMANT;
        enumC0003dArr[lllIIIllIIl[14]] = RUNE;
        enumC0003dArr[lllIIIllIIl[16]] = AMETHYST;
        enumC0003dArr[lllIIIllIIl[18]] = DRAGON;
        $VALUES = enumC0003dArr;
    }

    private static String lIlIllIlIIlIlI(String llllllllllllllllIIlIlIIllIIIIIII, String llllllllllllllllIIlIlIIlIlllllll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIlllllll.getBytes(StandardCharsets.UTF_8)), lllIIIllIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIllIIl[4], llllllllllllllllIIlIlIIllIIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIllIIIIIIl) {
            llllllllllllllllIIlIlIIllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIlIIlIIl(String llllllllllllllllIIlIlIIllIIIllIl, String llllllllllllllllIIlIlIIllIIIllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIllIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIllIIIllll.init(lllIIIllIIl[4], llllllllllllllllIIlIlIIllIIlIIII);
            return new String(llllllllllllllllIIlIlIIllIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIllIIIlllI) {
            llllllllllllllllIIlIlIIllIIIlllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    private static void lIlIllIlIIllII() {
        lllIIIllIIl = new int[21];
        lllIIIllIIl[0] = ((75 ^ 8) ^ (117 ^ 108)) & (((((41 + 189) - 104) + 86) ^ (((59 + 69) - 48) + 62)) ^ (-" ".length()));
        lllIIIllIIl[1] = 136 ^ 188;
        lllIIIllIIl[2] = " ".length();
        lllIIIllIIl[3] = 79 ^ 104;
        lllIIIllIIl[4] = "  ".length();
        lllIIIllIIl[5] = (((139 + 81) - 58) + 6) ^ (((125 + 41) - 154) + 116);
        lllIIIllIIl[6] = "   ".length();
        lllIIIllIIl[7] = 239 ^ 198;
        lllIIIllIIl[8] = 170 ^ 174;
        lllIIIllIIl[9] = (((0 + 82) - (-27)) + 46) ^ (((133 + 44) - 77) + 77);
        lllIIIllIIl[10] = (157 ^ 172) ^ (18 ^ 38);
        lllIIIllIIl[11] = (-((-20226) & 24479)) & (-16385) & 32511;
        lllIIIllIIl[12] = 154 ^ 156;
        lllIIIllIIl[13] = (249 ^ 143) ^ (10 ^ 87);
        lllIIIllIIl[14] = 66 ^ 69;
        lllIIIllIIl[15] = 46 ^ 2;
        lllIIIllIIl[16] = (85 ^ 37) ^ (227 ^ 155);
        lllIIIllIIl[17] = (-(((114 + 46) - 102) + 96)) & (-1) & 21503;
        lllIIIllIIl[18] = 48 ^ 57;
        lllIIIllIIl[19] = (-((-26963) & 27987)) & (-25) & 12285;
        lllIIIllIIl[20] = (78 ^ 109) ^ (15 ^ 38);
    }

    public int o() {
        return this.arrowTipId;
    }

    private EnumC0003d(String str, int i, int i2) {
        this.arrowTipId = i2;
    }

    private static String lIlIllIlIIlIII(String llllllllllllllllIIlIlIIlIlllIIII, String llllllllllllllllIIlIlIIlIllIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlIIlIllIllll.toCharArray();
        int llllllllllllllllIIlIlIIlIllIllII = lllIIIllIIl[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllIIlIlIIlIllIIlIl = charArray2.length;
        int i = lllIIIllIIl[0];
        while (lIlIllIlIIllIl(i, llllllllllllllllIIlIlIIlIllIIlIl)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIlIIlIllIllII % charArray.length]));
            "".length();
            llllllllllllllllIIlIlIIlIllIllII++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
