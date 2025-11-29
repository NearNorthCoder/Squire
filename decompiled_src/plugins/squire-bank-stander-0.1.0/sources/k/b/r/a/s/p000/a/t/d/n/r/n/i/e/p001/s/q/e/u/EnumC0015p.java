package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.p  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/p.class */
public final class EnumC0015p {
    public static final /* synthetic */ EnumC0015p REDWOOD;
    public static final /* synthetic */ EnumC0015p MAGIC;
    public static final /* synthetic */ EnumC0015p MAPLE;
    private static final /* synthetic */ EnumC0015p[] $VALUES;
    private final /* synthetic */ int logId;
    private static /* synthetic */ int[] lllIlIIlIlI;
    private static /* synthetic */ String[] lllIIlIIIlI;
    public static final /* synthetic */ EnumC0015p WILLOW;
    public static final /* synthetic */ EnumC0015p NORMAL;
    public static final /* synthetic */ EnumC0015p OAK;
    public static final /* synthetic */ EnumC0015p YEW;

    public static EnumC0015p valueOf(String str) {
        return (EnumC0015p) Enum.valueOf(EnumC0015p.class, str);
    }

    static {
        lIlIllllIllIII();
        lIlIllIlllIIlI();
        NORMAL = new EnumC0015p(lllIIlIIIlI[lllIlIIlIlI[0]], lllIlIIlIlI[0], lllIlIIlIlI[1]);
        OAK = new EnumC0015p(lllIIlIIIlI[lllIlIIlIlI[2]], lllIlIIlIlI[2], lllIlIIlIlI[3]);
        WILLOW = new EnumC0015p(lllIIlIIIlI[lllIlIIlIlI[4]], lllIlIIlIlI[4], lllIlIIlIlI[5]);
        MAPLE = new EnumC0015p(lllIIlIIIlI[lllIlIIlIlI[6]], lllIlIIlIlI[6], lllIlIIlIlI[7]);
        YEW = new EnumC0015p(lllIIlIIIlI[lllIlIIlIlI[8]], lllIlIIlIlI[8], lllIlIIlIlI[9]);
        MAGIC = new EnumC0015p(lllIIlIIIlI[lllIlIIlIlI[10]], lllIlIIlIlI[10], lllIlIIlIlI[11]);
        REDWOOD = new EnumC0015p(lllIIlIIIlI[lllIlIIlIlI[12]], lllIlIIlIlI[12], lllIlIIlIlI[13]);
        EnumC0015p[] enumC0015pArr = new EnumC0015p[lllIlIIlIlI[14]];
        enumC0015pArr[lllIlIIlIlI[0]] = NORMAL;
        enumC0015pArr[lllIlIIlIlI[2]] = OAK;
        enumC0015pArr[lllIlIIlIlI[4]] = WILLOW;
        enumC0015pArr[lllIlIIlIlI[6]] = MAPLE;
        enumC0015pArr[lllIlIIlIlI[8]] = YEW;
        enumC0015pArr[lllIlIIlIlI[10]] = MAGIC;
        enumC0015pArr[lllIlIIlIlI[12]] = REDWOOD;
        $VALUES = enumC0015pArr;
    }

    public int M() {
        return this.logId;
    }

    private static void lIlIllIlllIIlI() {
        lllIIlIIIlI = new String[lllIlIIlIlI[14]];
        lllIIlIIIlI[lllIlIIlIlI[0]] = lIlIllIllIllll("go6zIbgZ53A=", "OCBbF");
        lllIIlIIIlI[lllIlIIlIlI[2]] = lIlIllIlllIIII("yFctzkPse0I=", "DyMmB");
        lllIIlIIIlI[lllIlIIlIlI[4]] = lIlIllIlllIIII("inszPhxTHAQ=", "fojRP");
        lllIIlIIIlI[lllIlIIlIlI[6]] = lIlIllIlllIIII("a9PqNw+n9qw=", "SzSMH");
        lllIIlIIIlI[lllIlIIlIlI[8]] = lIlIllIllIllll("QEZOmTcQX9E=", "sKqAK");
        lllIIlIIIlI[lllIlIIlIlI[10]] = lIlIllIlllIIII("3w2xOeqN0EE=", "Unxgt");
        lllIIlIIIlI[lllIlIIlIlI[12]] = lIlIllIlllIIIl("Hw4LBiICDw==", "MKOQm");
    }

    private static String lIlIllIllIllll(String llllllllllllllllIIlIIlIlllllIIIl, String llllllllllllllllIIlIIlIlllllIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlllllIIII.getBytes(StandardCharsets.UTF_8)), lllIlIIlIlI[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIlIlI[4], llllllllllllllllIIlIIlIlllllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIlllllIIlI) {
            llllllllllllllllIIlIIlIlllllIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIlllIIIl(String llllllllllllllllIIlIIlIllllIIIIl, String llllllllllllllllIIlIIlIllllIIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIIlIlllIllllI = llllllllllllllllIIlIIlIllllIIIII.toCharArray();
        int llllllllllllllllIIlIIlIlllIlllIl = lllIlIIlIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIIlIlI[0];
        while (lIlIllllIllIIl(i, length)) {
            char llllllllllllllllIIlIIlIlllIlIlII = charArray[i];
            sb.append((char) (llllllllllllllllIIlIIlIlllIlIlII ^ llllllllllllllllIIlIIlIlllIllllI[llllllllllllllllIIlIIlIlllIlllIl % llllllllllllllllIIlIIlIlllIllllI.length]));
            "".length();
            llllllllllllllllIIlIIlIlllIlllIl++;
            i++;
            "".length();
            if ("  ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0015p[] values() {
        return (EnumC0015p[]) $VALUES.clone();
    }

    private EnumC0015p(String str, int i, int i2) {
        this.logId = i2;
    }

    private static void lIlIllllIllIII() {
        lllIlIIlIlI = new int[16];
        lllIlIIlIlI[0] = ((((9 + 0) - (-6)) + 225) ^ (((160 + 113) - 101) + 5)) & (((217 ^ 192) ^ (22 ^ 78)) ^ (-" ".length()));
        lllIlIIlIlI[1] = (-((-7459) & 32555)) & (-1) & 26607;
        lllIlIIlIlI[2] = " ".length();
        lllIlIIlIlI[3] = (-((-3121) & 11839)) & (-22529) & 32767;
        lllIlIIlIlI[4] = "  ".length();
        lllIlIIlIlI[5] = (-17) & 1535;
        lllIlIIlIlI[6] = "   ".length();
        lllIlIIlIlI[7] = (-2065) & 3581;
        lllIlIIlIlI[8] = (((138 + 70) - 106) + 66) ^ (((12 + 84) - (-34)) + 42);
        lllIlIIlIlI[9] = (-24581) & 26095;
        lllIlIIlIlI[10] = (118 ^ 108) ^ (65 ^ 94);
        lllIlIIlIlI[11] = (-16387) & 17899;
        lllIlIIlIlI[12] = (((37 + 65) - 82) + 149) ^ (((51 + 152) - 68) + 40);
        lllIlIIlIlI[13] = (-((-18997) & 31551)) & (-33) & 32255;
        lllIlIIlIlI[14] = (((2 + 22) - (-40)) + 95) ^ (((5 + 95) - 83) + 135);
        lllIlIIlIlI[15] = (((50 + 35) - 39) + 94) ^ (((55 + 100) - 72) + 49);
    }

    private static String lIlIllIlllIIII(String llllllllllllllllIIlIIlIllllllllI, String llllllllllllllllIIlIIlIlllllllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIIIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIIIIIIII.init(lllIlIIlIlI[4], llllllllllllllllIIlIIllIIIIIIIIl);
            return new String(llllllllllllllllIIlIIllIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIlllllllll) {
            llllllllllllllllIIlIIlIlllllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIllIIl(int i, int i2) {
        return i < i2;
    }
}
