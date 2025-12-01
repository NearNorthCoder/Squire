package r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.a  reason: invalid package */
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:r/g/q/-/s/r/s/u/i/e/r/r/n/c/s/-/e/s/e/o/e/d/a/a.class */
public final class a {
    public static final /* synthetic */ a MAKE;
    public static final /* synthetic */ a MINIGAME;
    private static /* synthetic */ String[] lIIllIIlIlIlI;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ a EXCHANGE;
    private static /* synthetic */ int[] lIIllIIlIlIll;

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    private static void lIlIllllllIlIIl() {
        lIIllIIlIlIll = new int[5];
        lIIllIIlIlIll[0] = ((84 ^ 95) ^ (137 ^ 198)) & (((127 ^ 63) ^ (124 ^ 120)) ^ (-" ".length()));
        lIIllIIlIlIll[1] = " ".length();
        lIIllIIlIlIll[2] = "  ".length();
        lIIllIIlIlIll[3] = "   ".length();
        lIIllIIlIlIll[4] = (120 ^ 110) ^ (106 ^ 116);
    }

    private static void lIlIllllllIlIII() {
        lIIllIIlIlIlI = new String[lIIllIIlIlIll[3]];
        lIIllIIlIlIlI[lIIllIIlIlIll[0]] = lIlIllllllIIllI("aQHRtAi7l322egagiShZnw==", "vljXh");
        lIIllIIlIlIlI[lIIllIIlIlIll[1]] = lIlIllllllIIllI("2P3hvRuwIoQ=", "JfQAS");
        lIIllIIlIlIlI[lIIllIIlIlIll[2]] = lIlIllllllIIlll("5UA77/NuNQnZrYO/7gznpA==", "TWjTo");
    }

    private a(String str, int i) {
    }

    static {
        lIlIllllllIlIIl();
        lIlIllllllIlIII();
        MINIGAME = new a(lIIllIIlIlIlI[lIIllIIlIlIll[0]], lIIllIIlIlIll[0]);
        MAKE = new a(lIIllIIlIlIlI[lIIllIIlIlIll[1]], lIIllIIlIlIll[1]);
        EXCHANGE = new a(lIIllIIlIlIlI[lIIllIIlIlIll[2]], lIIllIIlIlIll[2]);
        a[] aVarArr = new a[lIIllIIlIlIll[3]];
        aVarArr[lIIllIIlIlIll[0]] = MINIGAME;
        aVarArr[lIIllIIlIlIll[1]] = MAKE;
        aVarArr[lIIllIIlIlIll[2]] = EXCHANGE;
        $VALUES = aVarArr;
    }

    private static String lIlIllllllIIlll(String llllllllllllllIllllIIIIlIlIlIIll, String llllllllllllllIllllIIIIlIlIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIlIlIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIlIlIlII) {
            llllllllllllllIllllIIIIlIlIlIlII.printStackTrace();
            return null;
        }
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    private static String lIlIllllllIIllI(String llllllllllllllIllllIIIIlIllIIIII, String llllllllllllllIllllIIIIlIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), lIIllIIlIlIll[4]), "DES");
            Cipher llllllllllllllIllllIIIIlIllIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIllIIIlI.init(lIIllIIlIlIll[2], secretKeySpec);
            return new String(llllllllllllllIllllIIIIlIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIllIIIIl) {
            llllllllllllllIllllIIIIlIllIIIIl.printStackTrace();
            return null;
        }
    }
}
