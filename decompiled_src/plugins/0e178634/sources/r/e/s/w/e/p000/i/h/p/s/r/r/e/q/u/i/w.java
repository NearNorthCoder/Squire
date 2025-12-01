package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/w.class */
final class w {
    private static /* synthetic */ int[] lIlIlllIlIIIl;
    public static final /* synthetic */ w BREWING;
    private static /* synthetic */ String[] lIlIlllIIlllI;
    public static final /* synthetic */ w RESTORING;
    private static final /* synthetic */ w[] $VALUES;
    public static final /* synthetic */ w NONE;

    private static boolean llIIIIlIIlIlllI(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIIlIIlIllIl();
        llIIIIlIIlIIllI();
        NONE = new w(lIlIlllIIlllI[lIlIlllIlIIIl[0]], lIlIlllIlIIIl[0]);
        BREWING = new w(lIlIlllIIlllI[lIlIlllIlIIIl[1]], lIlIlllIlIIIl[1]);
        RESTORING = new w(lIlIlllIIlllI[lIlIlllIlIIIl[2]], lIlIlllIlIIIl[2]);
        w[] wVarArr = new w[lIlIlllIlIIIl[3]];
        wVarArr[lIlIlllIlIIIl[0]] = NONE;
        wVarArr[lIlIlllIlIIIl[1]] = BREWING;
        wVarArr[lIlIlllIlIIIl[2]] = RESTORING;
        $VALUES = wVarArr;
    }

    private static String llIIIIlIIlIIlII(String llllllllllllllIllIIllllllllIlllI, String llllllllllllllIllIIllllllllIllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIllllllllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllllllllIllII = new StringBuilder();
        char[] charArray = llllllllllllllIllIIllllllllIllIl.toCharArray();
        int llllllllllllllIllIIllllllllIIlIl = lIlIlllIlIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlllIlIIIl[0];
        while (llIIIIlIIlIlllI(i, length)) {
            char llllllllllllllIllIIllllllllIllll = charArray2[i];
            llllllllllllllIllIIllllllllIllII.append((char) (llllllllllllllIllIIllllllllIllll ^ charArray[llllllllllllllIllIIllllllllIIlIl % charArray.length]));
            "".length();
            llllllllllllllIllIIllllllllIIlIl++;
            i++;
            "".length();
            if ((197 ^ 193) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllllllllIllII);
    }

    private static String llIIIIlIIlIIlIl(String llllllllllllllIllIIlllllllllllII, String llllllllllllllIllIIlllllllllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllllllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllIlIIIl[2], llllllllllllllIllIlIIIIIIIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllllllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllllllllllll) {
            llllllllllllllIllIIlllllllllllll.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlIIllI() {
        lIlIlllIIlllI = new String[lIlIlllIlIIIl[3]];
        lIlIlllIIlllI[lIlIlllIlIIIl[0]] = llIIIIlIIlIIlII("JSoHMQ==", "keItY");
        lIlIlllIIlllI[lIlIlllIlIIIl[1]] = llIIIIlIIlIIlII("CAQ2ISoEEQ==", "JVsvc");
        lIlIlllIIlllI[lIlIlllIlIIIl[2]] = llIIIIlIIlIIlIl("LBS3aZXyis9LVUXLpCIcLA==", "PfeJs");
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    private static void llIIIIlIIlIllIl() {
        lIlIlllIlIIIl = new int[4];
        lIlIlllIlIIIl[0] = (47 ^ 42) & ((198 ^ 195) ^ (-1));
        lIlIlllIlIIIl[1] = " ".length();
        lIlIlllIlIIIl[2] = "  ".length();
        lIlIlllIlIIIl[3] = "   ".length();
    }

    private w(String str, int i) {
    }
}
