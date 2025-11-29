package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.f  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/f.class */
public final class EnumC0005f {
    private static /* synthetic */ String[] lllIIlIlIII;
    public static final /* synthetic */ EnumC0005f FIRE;
    public static final /* synthetic */ EnumC0005f AIR;
    private static /* synthetic */ int[] lllIIlIlIIl;
    private final /* synthetic */ int orbId;
    private static final /* synthetic */ EnumC0005f[] $VALUES;
    public static final /* synthetic */ EnumC0005f WATER;
    public static final /* synthetic */ EnumC0005f EARTH;

    public int x() {
        return this.orbId;
    }

    private static boolean lIlIllIllllllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIllIlllllIl();
        lIlIllIlllllII();
        AIR = new EnumC0005f(lllIIlIlIII[lllIIlIlIIl[0]], lllIIlIlIIl[0], lllIIlIlIIl[1]);
        EARTH = new EnumC0005f(lllIIlIlIII[lllIIlIlIIl[2]], lllIIlIlIIl[2], lllIIlIlIIl[3]);
        WATER = new EnumC0005f(lllIIlIlIII[lllIIlIlIIl[4]], lllIIlIlIIl[4], lllIIlIlIIl[5]);
        FIRE = new EnumC0005f(lllIIlIlIII[lllIIlIlIIl[6]], lllIIlIlIIl[6], lllIIlIlIIl[7]);
        EnumC0005f[] enumC0005fArr = new EnumC0005f[lllIIlIlIIl[8]];
        enumC0005fArr[lllIIlIlIIl[0]] = AIR;
        enumC0005fArr[lllIIlIlIIl[2]] = EARTH;
        enumC0005fArr[lllIIlIlIIl[4]] = WATER;
        enumC0005fArr[lllIIlIlIIl[6]] = FIRE;
        $VALUES = enumC0005fArr;
    }

    public static EnumC0005f valueOf(String str) {
        return (EnumC0005f) Enum.valueOf(EnumC0005f.class, str);
    }

    public static EnumC0005f[] values() {
        return (EnumC0005f[]) $VALUES.clone();
    }

    private static String lIlIllIllllIll(String llllllllllllllllIIlIlIIIIlIIllIl, String llllllllllllllllIIlIlIIIIlIlIIIl) {
        String llllllllllllllllIIlIlIIIIlIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIIlIIllll = llllllllllllllllIIlIlIIIIlIlIIIl.toCharArray();
        int llllllllllllllllIIlIlIIIIlIIlllI = lllIIlIlIIl[0];
        char[] charArray = llllllllllllllllIIlIlIIIIlIIllIl2.toCharArray();
        int length = charArray.length;
        int i = lllIIlIlIIl[0];
        while (lIlIllIllllllI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIIlIlIIIIlIIllll[llllllllllllllllIIlIlIIIIlIIlllI % llllllllllllllllIIlIlIIIIlIIllll.length]));
            "".length();
            llllllllllllllllIIlIlIIIIlIIlllI++;
            i++;
            "".length();
            if (((((124 + 121) - 173) + 77) ^ (((84 + 105) - 155) + 111)) == (((40 ^ 25) ^ (27 ^ 9)) & (((222 ^ 132) ^ (124 ^ 5)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIllIlllllIl() {
        lllIIlIlIIl = new int[10];
        lllIIlIlIIl[0] = (65 ^ 89) & ((37 ^ 61) ^ (-1));
        lllIIlIlIIl[1] = (-((-17017) & 24443)) & (-129) & 8127;
        lllIIlIlIIl[2] = " ".length();
        lllIIlIlIIl[3] = (-((-119) & 1271)) & (-26945) & 28671;
        lllIIlIlIIl[4] = "  ".length();
        lllIIlIlIIl[5] = (-28997) & 29567;
        lllIIlIlIIl[6] = "   ".length();
        lllIIlIlIIl[7] = (-((-21565) & 32255)) & (-16389) & 27647;
        lllIIlIlIIl[8] = (((79 + 177) - 83) + 12) ^ (((153 + 128) - 124) + 32);
        lllIIlIlIIl[9] = (52 ^ 108) ^ (4 ^ 84);
    }

    private EnumC0005f(String str, int i, int i2) {
        this.orbId = i2;
    }

    private static void lIlIllIlllllII() {
        lllIIlIlIII = new String[lllIIlIlIIl[8]];
        lllIIlIlIII[lllIIlIlIIl[0]] = lIlIllIllllIlI("SbWostMG0ac=", "WCPtR");
        lllIIlIlIII[lllIIlIlIIl[2]] = lIlIllIllllIll("ABUqAzw=", "ETxWt");
        lllIIlIlIII[lllIIlIlIIl[4]] = lIlIllIllllIll("Ay86EDU=", "TnnUg");
        lllIIlIlIII[lllIIlIlIIl[6]] = lIlIllIllllIlI("DT44eUGFzr4=", "QpMoe");
    }

    private static String lIlIllIllllIlI(String llllllllllllllllIIlIlIIIIllIIIlI, String llllllllllllllllIIlIlIIIIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), lllIIlIlIIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIlIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIIllIIIll) {
            llllllllllllllllIIlIlIIIIllIIIll.printStackTrace();
            return null;
        }
    }
}
