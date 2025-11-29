package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.G  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/G.class */
public final class G {
    private static final /* synthetic */ G[] $VALUES;
    public static final /* synthetic */ G JUTE;
    public static final /* synthetic */ G HAMMERSTONE;
    public static final /* synthetic */ G ASGARNIAN;
    public static final /* synthetic */ G YANILLIAN;
    public static final /* synthetic */ G KRANDORIAN;
    private static /* synthetic */ String[] lIllllIIllll;
    private static /* synthetic */ int[] lIllllIlIIII;
    public static final /* synthetic */ G BARLEY;
    private final /* synthetic */ int seed;
    public static final /* synthetic */ G WILDBLOOD;

    private static String lllIlllIIllIlI(String lllllllllllllllIlIllIIlIIlllIlIl, String lllllllllllllllIlIllIIlIIllllIIl) {
        String lllllllllllllllIlIllIIlIIlllIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIlIIllllIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIIlIIllllIIl.toCharArray();
        int lllllllllllllllIlIllIIlIIlllIIIl = lIllllIlIIII[0];
        char[] charArray2 = lllllllllllllllIlIllIIlIIlllIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIllllIlIIII[0];
        while (lllIlllIIllllI(i, length)) {
            char lllllllllllllllIlIllIIlIIllIllIl = charArray2[i];
            lllllllllllllllIlIllIIlIIllllIII.append((char) (lllllllllllllllIlIllIIlIIllIllIl ^ charArray[lllllllllllllllIlIllIIlIIlllIIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIllIIlIIlllIIIl++;
            i++;
            "".length();
            if ((82 ^ 86) < (103 ^ 99)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIIlIIllllIII);
    }

    private static void lllIlllIIlllII() {
        lIllllIIllll = new String[lIllllIlIIII[14]];
        lIllllIIllll[lIllllIlIIII[0]] = lllIlllIIllIIl("iYnGHgzJXoo=", "eJOXo");
        lIllllIIllll[lIllllIlIIII[2]] = lllIlllIIllIlI("CgM6ARIQESMDGQc=", "BBwLW");
        lIllllIIllll[lIllllIlIIII[4]] = lllIlllIIllIIl("ASk41zknFklPKnj1vatPnA==", "UGsId");
        lIllllIIllll[lIllllIlIIII[6]] = lllIlllIIllIIl("8K/ESCsxpFI=", "XwGAa");
        lIllllIIllll[lIllllIlIIII[8]] = lllIlllIIllIlI("EyQ/LRYGLDAq", "JeqdZ");
        lIllllIIllll[lIllllIlIIII[10]] = lllIlllIIllIll("sgG7kS55yst5BVabMxPfnA==", "aGcCC");
        lIllllIIllll[lIllllIlIIII[12]] = lllIlllIIllIIl("Ghcf1/E0GPq/YB0HMxyUuQ==", "IjGbL");
    }

    private static String lllIlllIIllIll(String lllllllllllllllIlIllIIlIIlIllIII, String lllllllllllllllIlIllIIlIIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIlIIlIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIlIIlIllIlI.init(lIllllIlIIII[4], secretKeySpec);
            return new String(lllllllllllllllIlIllIIlIIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlIIlIllIIl) {
            lllllllllllllllIlIllIIlIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private G(String str, int i, int i2) {
        this.seed = i2;
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    public int aA() {
        return this.seed;
    }

    private static void lllIlllIIlllIl() {
        lIllllIlIIII = new int[16];
        lIllllIlIIII[0] = (124 ^ 34) & ((211 ^ 141) ^ (-1));
        lIllllIlIIII[1] = (-((-8217) & 27163)) & (-5) & 24255;
        lIllllIlIIII[2] = " ".length();
        lIllllIlIIII[3] = (-((-5337) & 32733)) & (-1) & 32703;
        lIllllIlIIII[4] = "  ".length();
        lIllllIlIIII[5] = (-25347) & 30654;
        lIllllIlIIII[6] = "   ".length();
        lIllllIlIIII[7] = (-((-17438) & 28511)) & (-5) & 16383;
        lIllllIlIIII[8] = 72 ^ 76;
        lIllllIlIIII[9] = (-18433) & 23741;
        lIllllIlIIII[10] = (57 ^ 116) ^ (90 ^ 18);
        lIllllIlIIII[11] = (-27394) & 32703;
        lIllllIlIIII[12] = (((118 + 92) - 97) + 74) ^ (((24 + 12) - 28) + 181);
        lIllllIlIIII[13] = (-" ".length()) & (-16897) & 22207;
        lIllllIlIIII[14] = (((0 + 81) - (-22)) + 33) ^ (((31 + 54) - 49) + 107);
        lIllllIlIIII[15] = 96 ^ 104;
    }

    static {
        lllIlllIIlllIl();
        lllIlllIIlllII();
        BARLEY = new G(lIllllIIllll[lIllllIlIIII[0]], lIllllIlIIII[0], lIllllIlIIII[1]);
        HAMMERSTONE = new G(lIllllIIllll[lIllllIlIIII[2]], lIllllIlIIII[2], lIllllIlIIII[3]);
        ASGARNIAN = new G(lIllllIIllll[lIllllIlIIII[4]], lIllllIlIIII[4], lIllllIlIIII[5]);
        JUTE = new G(lIllllIIllll[lIllllIlIIII[6]], lIllllIlIIII[6], lIllllIlIIII[7]);
        YANILLIAN = new G(lIllllIIllll[lIllllIlIIII[8]], lIllllIlIIII[8], lIllllIlIIII[9]);
        KRANDORIAN = new G(lIllllIIllll[lIllllIlIIII[10]], lIllllIlIIII[10], lIllllIlIIII[11]);
        WILDBLOOD = new G(lIllllIIllll[lIllllIlIIII[12]], lIllllIlIIII[12], lIllllIlIIII[13]);
        G[] gArr = new G[lIllllIlIIII[14]];
        gArr[lIllllIlIIII[0]] = BARLEY;
        gArr[lIllllIlIIII[2]] = HAMMERSTONE;
        gArr[lIllllIlIIII[4]] = ASGARNIAN;
        gArr[lIllllIlIIII[6]] = JUTE;
        gArr[lIllllIlIIII[8]] = YANILLIAN;
        gArr[lIllllIlIIII[10]] = KRANDORIAN;
        gArr[lIllllIlIIII[12]] = WILDBLOOD;
        $VALUES = gArr;
    }

    private static boolean lllIlllIIllllI(int i, int i2) {
        return i < i2;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    private static String lllIlllIIllIIl(String lllllllllllllllIlIllIIlIIllIIlIl, String lllllllllllllllIlIllIIlIIllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIllIIlII.getBytes(StandardCharsets.UTF_8)), lIllllIlIIII[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIlIIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlIIllIIllI) {
            lllllllllllllllIlIllIIlIIllIIllI.printStackTrace();
            return null;
        }
    }
}
