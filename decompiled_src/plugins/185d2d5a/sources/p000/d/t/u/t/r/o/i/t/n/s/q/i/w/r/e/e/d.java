package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.d  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/d.class */
public class d {
    private static /* synthetic */ String[] lIllIIIIIIIll;
    private static /* synthetic */ int[] lIllIIIIIIlII;

    private static void llIIIIllllIIlll() {
        lIllIIIIIIIll = new String[lIllIIIIIIlII[7]];
        lIllIIIIIIIll[lIllIIIIIIlII[1]] = llIIIIllllIIlIl("1HhOQNe5jBo=", "UdMCh");
        lIllIIIIIIIll[lIllIIIIIIlII[2]] = llIIIIllllIIlIl("Z1/IdHHkiEM=", "RKsjF");
        lIllIIIIIIIll[lIllIIIIIIlII[5]] = llIIIIllllIIllI("d2gtIA==", "RDImh");
    }

    public static String a(double d) {
        return a((int) d);
    }

    static {
        llIIIIllllIlIII();
        llIIIIllllIIlll();
    }

    public static String a(int i) {
        if (llIIIIllllIlIIl(i, lIllIIIIIIlII[0])) {
            String str = lIllIIIIIIIll[lIllIIIIIIlII[1]];
            Object[] objArr = new Object[lIllIIIIIIlII[2]];
            objArr[lIllIIIIIIlII[1]] = Integer.valueOf(i);
            return String.format(str, objArr);
        } else if (llIIIIllllIlIIl(i, lIllIIIIIIlII[3])) {
            String str2 = lIllIIIIIIIll[lIllIIIIIIlII[2]];
            Object[] objArr2 = new Object[lIllIIIIIIlII[2]];
            objArr2[lIllIIIIIIlII[1]] = Integer.valueOf(i / lIllIIIIIIlII[4]);
            return String.format(str2, objArr2);
        } else {
            String str3 = lIllIIIIIIIll[lIllIIIIIIlII[5]];
            Object[] objArr3 = new Object[lIllIIIIIIlII[2]];
            objArr3[lIllIIIIIIlII[1]] = Integer.valueOf(i / lIllIIIIIIlII[6]);
            return String.format(str3, objArr3);
        }
    }

    private static String llIIIIllllIIlIl(String llllllllllllllIllIIllIllIlIIIlII, String llllllllllllllIllIIllIllIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIIIlII[5], llllllllllllllIllIIllIllIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIllIlIIIlIl) {
            llllllllllllllIllIIllIllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIIllllIlIII() {
        lIllIIIIIIlII = new int[8];
        lIllIIIIIIlII[0] = (-12570) & 112569;
        lIllIIIIIIlII[1] = ((((23 + 104) - 97) + 126) ^ (((29 + 61) - 21) + 66)) & (((122 ^ 48) ^ (230 ^ 183)) ^ (-" ".length()));
        lIllIIIIIIlII[2] = " ".length();
        lIllIIIIIIlII[3] = (-18451) & 10018450;
        lIllIIIIIIlII[4] = (-31750) & 32749;
        lIllIIIIIIlII[5] = "  ".length();
        lIllIIIIIIlII[6] = (-((-4177) & 6643)) & (-1045) & 1003510;
        lIllIIIIIIlII[7] = "   ".length();
    }

    private static boolean llIIIIllllIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIIIllllIIllI(String llllllllllllllIllIIllIllIIllIlII, String llllllllllllllIllIIllIllIIllIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIllIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIllIIllIIlI = new StringBuilder();
        char[] charArray = llllllllllllllIllIIllIllIIllIIll.toCharArray();
        int llllllllllllllIllIIllIllIIllIIII = lIllIIIIIIlII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIIIIlII[1];
        while (llIIIIllllIlIIl(i, length)) {
            llllllllllllllIllIIllIllIIllIIlI.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIllIllIIllIIII % charArray.length]));
            "".length();
            llllllllllllllIllIIllIllIIllIIII++;
            i++;
            "".length();
            if ((-((2 ^ 5) ^ "  ".length())) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIllIIllIIlI);
    }
}
