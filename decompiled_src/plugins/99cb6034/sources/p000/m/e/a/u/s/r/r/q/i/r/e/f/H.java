package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.H  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/H.class */
public final class H {
    public static final /* synthetic */ H LUNAR_SPELL;
    private static /* synthetic */ String[] lIllllllIlII;
    private static final /* synthetic */ H[] $VALUES;
    private static /* synthetic */ int[] lIllllllIllI;
    private final /* synthetic */ int id;
    private final /* synthetic */ K equipment;
    public static final /* synthetic */ H SUPERCOMPOST;
    public static final /* synthetic */ H COMPOST;
    public static final /* synthetic */ H ULTRACOMPOST;

    static {
        llllIIIIIllIII();
        llllIIIIIIlllI();
        COMPOST = new H(lIllllllIlII[lIllllllIllI[0]], lIllllllIllI[0], lIllllllIllI[1], K.COMPOST);
        SUPERCOMPOST = new H(lIllllllIlII[lIllllllIllI[2]], lIllllllIllI[2], lIllllllIllI[3], K.SUPER_COMPOST);
        ULTRACOMPOST = new H(lIllllllIlII[lIllllllIllI[4]], lIllllllIllI[4], lIllllllIllI[5], K.ULTRA_COMPOST);
        LUNAR_SPELL = new H(lIllllllIlII[lIllllllIllI[6]], lIllllllIllI[6], lIllllllIllI[7], null);
        H[] hArr = new H[lIllllllIllI[8]];
        hArr[lIllllllIllI[0]] = COMPOST;
        hArr[lIllllllIllI[2]] = SUPERCOMPOST;
        hArr[lIllllllIllI[4]] = ULTRACOMPOST;
        hArr[lIllllllIllI[6]] = LUNAR_SPELL;
        $VALUES = hArr;
    }

    private static void llllIIIIIIlllI() {
        lIllllllIlII = new String[lIllllllIllI[8]];
        lIllllllIlII[lIllllllIllI[0]] = llllIIIIIIlIll("hiC8hLJ1U6A=", "FgyOO");
        lIllllllIlII[lIllllllIllI[2]] = llllIIIIIIllII("84IpbEYfJHXRhElV5kSa1Q==", "drSCA");
        lIllllllIlII[lIllllllIllI[4]] = llllIIIIIIlIll("BqoMCoFynlRay6z7IRQgKA==", "FbcZL");
        lIllllllIlII[lIllllllIllI[6]] = llllIIIIIIllIl("JwEgMxM0Bz43DSc=", "kTnrA");
    }

    public static H[] values() {
        return (H[]) $VALUES.clone();
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    private static String llllIIIIIIllIl(String lllllllllllllllIlIlIlllIllllIllI, String lllllllllllllllIlIlIlllIllllIlIl) {
        String lllllllllllllllIlIlIlllIllllIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIlllIllllIIll = lllllllllllllllIlIlIlllIllllIlIl.toCharArray();
        int lllllllllllllllIlIlIlllIllllIIlI = lIllllllIllI[0];
        char[] charArray = lllllllllllllllIlIlIlllIllllIllI2.toCharArray();
        int length = charArray.length;
        int i = lIllllllIllI[0];
        while (llllIIIIIllIIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIlIlllIllllIIll[lllllllllllllllIlIlIlllIllllIIlI % lllllllllllllllIlIlIlllIllllIIll.length]));
            "".length();
            lllllllllllllllIlIlIlllIllllIIlI++;
            i++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIIIIIllIIl(int i, int i2) {
        return i < i2;
    }

    public static H c(EnumC0021au enumC0021au) {
        switch (I.bm[enumC0021au.ordinal()]) {
            case 1:
            case 2:
                return ULTRACOMPOST;
            case 3:
            case 4:
                return SUPERCOMPOST;
            case 5:
            case 6:
                return COMPOST;
            default:
                return null;
        }
    }

    public int aB() {
        return this.id;
    }

    public K aC() {
        return this.equipment;
    }

    private static String llllIIIIIIllII(String lllllllllllllllIlIlIlllIlllIIIIl, String lllllllllllllllIlIlIlllIlllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIlllIIIII.getBytes(StandardCharsets.UTF_8)), lIllllllIllI[9]), "DES");
            Cipher lllllllllllllllIlIlIlllIlllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlllIlllIIIll.init(lIllllllIllI[4], secretKeySpec);
            return new String(lllllllllllllllIlIlIlllIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlllIllIlllIl) {
            lllllllllllllllIlIlIlllIllIlllIl.printStackTrace();
            return null;
        }
    }

    private static void llllIIIIIllIII() {
        lIllllllIllI = new int[10];
        lIllllllIllI[0] = (41 ^ 98) & ((65 ^ 10) ^ (-1));
        lIllllllIllI[1] = (-26694) & 32725;
        lIllllllIllI[2] = " ".length();
        lIllllllIllI[3] = (-((-4626) & 31351)) & (-1) & 32759;
        lIllllllIllI[4] = "  ".length();
        lIllllllIllI[5] = (-10245) & 31727;
        lIllllllIllI[6] = "   ".length();
        lIllllllIllI[7] = -" ".length();
        lIllllllIllI[8] = 85 ^ 81;
        lIllllllIllI[9] = 54 ^ 62;
    }

    private H(String str, int i, int i2, K k) {
        this.id = i2;
        this.equipment = k;
    }

    private static String llllIIIIIIlIll(String lllllllllllllllIlIlIlllIllIlIlII, String lllllllllllllllIlIlIlllIllIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllllIllI[4], lllllllllllllllIlIlIlllIllIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlllIllIlIlIl) {
            lllllllllllllllIlIlIlllIllIlIlIl.printStackTrace();
            return null;
        }
    }
}
