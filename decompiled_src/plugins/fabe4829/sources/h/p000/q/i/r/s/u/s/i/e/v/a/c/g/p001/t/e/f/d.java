package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.d  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/d.class */
public final class d {
    private static /* synthetic */ String[] llIIIllIllll;
    public static final /* synthetic */ d LOW;
    public static final /* synthetic */ d VERY_LOW;
    private static /* synthetic */ int[] llIIIlllIIII;
    public static final /* synthetic */ d VERY_HIGH;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ d HIGH;
    public static final /* synthetic */ d MEDIUM;

    private static String llllIllIlIlIIl(String lllllllllllllllIlIlIIIlIllllIlll, String lllllllllllllllIlIlIIIlIllllIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIlIllllIlIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIIlIllllIlII = lllllllllllllllIlIlIIIlIllllIllI.toCharArray();
        int lllllllllllllllIlIlIIIlIllllIIll = llIIIlllIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIlllIIII[0];
        while (llllIllIlIlllI(i, length)) {
            lllllllllllllllIlIlIIIlIllllIlIl.append((char) (charArray[i] ^ lllllllllllllllIlIlIIIlIllllIlII[lllllllllllllllIlIlIIIlIllllIIll % lllllllllllllllIlIlIIIlIllllIlII.length]));
            "".length();
            lllllllllllllllIlIlIIIlIllllIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIIIlIllllIlIl);
    }

    private static String llllIllIlIlIll(String lllllllllllllllIlIlIIIlIllIlIlIl, String lllllllllllllllIlIlIIIlIllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlllIIII[2], lllllllllllllllIlIlIIIlIllIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIlIllIlIllI) {
            lllllllllllllllIlIlIIIlIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static void llllIllIlIllIl() {
        llIIIlllIIII = new int[7];
        llIIIlllIIII[0] = (39 ^ 19) & ((17 ^ 37) ^ (-1));
        llIIIlllIIII[1] = " ".length();
        llIIIlllIIII[2] = "  ".length();
        llIIIlllIIII[3] = "   ".length();
        llIIIlllIIII[4] = 179 ^ 183;
        llIIIlllIIII[5] = (27 ^ 98) ^ (197 ^ 185);
        llIIIlllIIII[6] = (((39 + 67) - 104) + 126) ^ (((48 + 9) - 11) + 90);
    }

    private static void llllIllIlIllII() {
        llIIIllIllll = new String[llIIIlllIIII[5]];
        llIIIllIllll[llIIIlllIIII[0]] = llllIllIlIlIIl("LB0kEyw2FyE=", "zXvJs");
        llIIIllIllll[llIIIlllIIII[1]] = llllIllIlIlIIl("ACwD", "LcTRi");
        llIIIllIllll[llIIIlllIIII[2]] = llllIllIlIlIlI("xEB6dzt6NYs=", "usVIC");
        llIIIllIllll[llIIIlllIIII[3]] = llllIllIlIlIIl("GS8jJA==", "QfdlU");
        llIIIllIllll[llIIIlllIIII[4]] = llllIllIlIlIll("sBa0dh7BPFncDVv414++oQ==", "JwnYc");
    }

    private static String llllIllIlIlIlI(String lllllllllllllllIlIlIIIlIlllIIIlI, String lllllllllllllllIlIlIIIlIlllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8)), llIIIlllIIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlllIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIlIlllIIIll) {
            lllllllllllllllIlIlIIIlIlllIIIll.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    private d(String str, int i) {
    }

    static {
        llllIllIlIllIl();
        llllIllIlIllII();
        VERY_LOW = new d(llIIIllIllll[llIIIlllIIII[0]], llIIIlllIIII[0]);
        LOW = new d(llIIIllIllll[llIIIlllIIII[1]], llIIIlllIIII[1]);
        MEDIUM = new d(llIIIllIllll[llIIIlllIIII[2]], llIIIlllIIII[2]);
        HIGH = new d(llIIIllIllll[llIIIlllIIII[3]], llIIIlllIIII[3]);
        VERY_HIGH = new d(llIIIllIllll[llIIIlllIIII[4]], llIIIlllIIII[4]);
        d[] dVarArr = new d[llIIIlllIIII[5]];
        dVarArr[llIIIlllIIII[0]] = VERY_LOW;
        dVarArr[llIIIlllIIII[1]] = LOW;
        dVarArr[llIIIlllIIII[2]] = MEDIUM;
        dVarArr[llIIIlllIIII[3]] = HIGH;
        dVarArr[llIIIlllIIII[4]] = VERY_HIGH;
        $VALUES = dVarArr;
    }

    private static boolean llllIllIlIlllI(int i, int i2) {
        return i < i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }
}
