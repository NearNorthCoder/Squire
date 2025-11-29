package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bY  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bY.class */
public final class bY {
    private static /* synthetic */ String[] llIlIllIIll;
    public static final /* synthetic */ bY WAVE;
    private static /* synthetic */ int[] llIlIllIlII;
    public static final /* synthetic */ bY JUG;
    public static final /* synthetic */ bY ATTACK;
    private static final /* synthetic */ bY[] $VALUES;

    private static void lIlIIlllllIIlI() {
        llIlIllIIll = new String[llIlIllIlII[3]];
        llIlIllIIll[llIlIllIlII[0]] = lIlIIlllllIIII("AjEtACQI", "CeyAg");
        llIlIllIIll[llIlIllIlII[1]] = lIlIIlllllIIIl("k8y/gu+U7LY=", "sWziE");
        llIlIllIIll[llIlIllIlII[2]] = lIlIIlllllIIIl("uYT2pGRRRKg=", "jTbKT");
    }

    private static void lIlIIlllllIIll() {
        llIlIllIlII = new int[5];
        llIlIllIlII[0] = ((115 ^ 109) ^ (0 ^ 89)) & (((82 ^ 47) ^ (56 ^ 2)) ^ (-" ".length()));
        llIlIllIlII[1] = " ".length();
        llIlIllIlII[2] = "  ".length();
        llIlIllIlII[3] = "   ".length();
        llIlIllIlII[4] = (104 ^ 51) ^ (208 ^ 131);
    }

    private static String lIlIIlllllIIIl(String llllllllllllllllIIllIIIllIIlIIlI, String llllllllllllllllIIllIIIllIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), llIlIllIlII[4]), "DES");
            Cipher llllllllllllllllIIllIIIllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIllIIlIlII.init(llIlIllIlII[2], secretKeySpec);
            return new String(llllllllllllllllIIllIIIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIllIIlIIll) {
            llllllllllllllllIIllIIIllIIlIIll.printStackTrace();
            return null;
        }
    }

    private bY(String str, int i) {
    }

    private static String lIlIIlllllIIII(String llllllllllllllllIIllIIIllIIIIIlI, String llllllllllllllllIIllIIIllIIIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIIIlIlllllll = llllllllllllllllIIllIIIllIIIIIIl.toCharArray();
        int llllllllllllllllIIllIIIlIllllllI = llIlIllIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIllIlII[0];
        while (lIlIIlllllIlII(i, length)) {
            char llllllllllllllllIIllIIIllIIIIIll = charArray[i];
            sb.append((char) (llllllllllllllllIIllIIIllIIIIIll ^ llllllllllllllllIIllIIIlIlllllll[llllllllllllllllIIllIIIlIllllllI % llllllllllllllllIIllIIIlIlllllll.length]));
            "".length();
            llllllllllllllllIIllIIIlIllllllI++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIIlllllIIll();
        lIlIIlllllIIlI();
        ATTACK = new bY(llIlIllIIll[llIlIllIlII[0]], llIlIllIlII[0]);
        WAVE = new bY(llIlIllIIll[llIlIllIlII[1]], llIlIllIlII[1]);
        JUG = new bY(llIlIllIIll[llIlIllIlII[2]], llIlIllIlII[2]);
        bY[] bYVarArr = new bY[llIlIllIlII[3]];
        bYVarArr[llIlIllIlII[0]] = ATTACK;
        bYVarArr[llIlIllIlII[1]] = WAVE;
        bYVarArr[llIlIllIlII[2]] = JUG;
        $VALUES = bYVarArr;
    }

    public static bY valueOf(String str) {
        return (bY) Enum.valueOf(bY.class, str);
    }

    private static boolean lIlIIlllllIlII(int i, int i2) {
        return i < i2;
    }

    public static bY[] values() {
        return (bY[]) $VALUES.clone();
    }
}
