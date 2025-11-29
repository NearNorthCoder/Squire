package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.f  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/f.class */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ f SINGLE_ORDER;
    private static /* synthetic */ String[] lIIIIIIIIIlll;
    public static final /* synthetic */ f MULTI_ORDER;
    private static /* synthetic */ int[] lIIIIIIIIlIII;

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    private static void lIIlIllIIlIIlIl() {
        lIIIIIIIIIlll = new String[lIIIIIIIIlIII[2]];
        lIIIIIIIIIlll[lIIIIIIIIlIII[0]] = lIIlIllIIlIIIll("ITMCEi43JQMHJjco", "rzLUb");
        lIIIIIIIIIlll[lIIIIIIIIlIII[1]] = lIIlIllIIlIIlII("5LC12YADVLr0n83G7pvz5Q==", "UoFnR");
    }

    private static boolean lIIlIllIIlIIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIllIIlIIlII(String lllllllllllllllIIlIIIIIIIllIlllI, String lllllllllllllllIIlIIIIIIIllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIIllIllIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlIII[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIIlIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIIIllIllll) {
            lllllllllllllllIIlIIIIIIIllIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllIIlIIIll(String lllllllllllllllIIlIIIIIIlIIIIIll, String lllllllllllllllIIlIIIIIIlIIIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIIIIlIIIIIlI.toCharArray();
        int lllllllllllllllIIlIIIIIIIlllllll = lIIIIIIIIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIIIlIII[0];
        while (lIIlIllIIlIIlll(i, length)) {
            char lllllllllllllllIIlIIIIIIlIIIIlII = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIIIIIIlIIIIlII ^ charArray[lllllllllllllllIIlIIIIIIIlllllll % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIIIIIlllllll++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private f(String str, int i) {
    }

    private static void lIIlIllIIlIIllI() {
        lIIIIIIIIlIII = new int[4];
        lIIIIIIIIlIII[0] = ((246 ^ 190) ^ (224 ^ 137)) & (((173 ^ 132) ^ (143 ^ 135)) ^ (-" ".length()));
        lIIIIIIIIlIII[1] = " ".length();
        lIIIIIIIIlIII[2] = "  ".length();
        lIIIIIIIIlIII[3] = 48 ^ 56;
    }

    static {
        lIIlIllIIlIIllI();
        lIIlIllIIlIIlIl();
        SINGLE_ORDER = new f(lIIIIIIIIIlll[lIIIIIIIIlIII[0]], lIIIIIIIIlIII[0]);
        MULTI_ORDER = new f(lIIIIIIIIIlll[lIIIIIIIIlIII[1]], lIIIIIIIIlIII[1]);
        f[] fVarArr = new f[lIIIIIIIIlIII[2]];
        fVarArr[lIIIIIIIIlIII[0]] = SINGLE_ORDER;
        fVarArr[lIIIIIIIIlIII[1]] = MULTI_ORDER;
        $VALUES = fVarArr;
    }
}
