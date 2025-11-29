package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.d  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/d.class */
public final class d {
    public static final /* synthetic */ d NONE;
    public static final /* synthetic */ d[] values;
    public static final /* synthetic */ d SPIKED;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ d BROAD;
    public static final /* synthetic */ d LIGHT;
    public static final /* synthetic */ d HEAVY;
    public static final /* synthetic */ d FLAT;
    private static /* synthetic */ int[] llIlIllIIlll;
    private static /* synthetic */ String[] llIlIllIIllI;
    public static final /* synthetic */ d NARROW;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    private static void lIIIIIlllIlIlIl() {
        llIlIllIIlll = new int[9];
        llIlIllIIlll[0] = (221 ^ 188) & ((118 ^ 23) ^ (-1));
        llIlIllIIlll[1] = " ".length();
        llIlIllIIlll[2] = "  ".length();
        llIlIllIIlll[3] = "   ".length();
        llIlIllIIlll[4] = (126 ^ 71) ^ (50 ^ 15);
        llIlIllIIlll[5] = 175 ^ 170;
        llIlIllIIlll[6] = (61 ^ 8) ^ (171 ^ 152);
        llIlIllIIlll[7] = 21 ^ 18;
        llIlIllIIlll[8] = (0 ^ 5) ^ (13 ^ 0);
    }

    public static d a(int i) {
        return (!lIIIIIlllIlIllI(i) || lIIIIIlllIlIlll(i, values.length)) ? NONE : values[i];
    }

    static {
        lIIIIIlllIlIlIl();
        lIIIIIlllIlIlII();
        NONE = new d(llIlIllIIllI[llIlIllIIlll[0]], llIlIllIIlll[0]);
        NARROW = new d(llIlIllIIllI[llIlIllIIlll[1]], llIlIllIIlll[1]);
        LIGHT = new d(llIlIllIIllI[llIlIllIIlll[2]], llIlIllIIlll[2]);
        FLAT = new d(llIlIllIIllI[llIlIllIIlll[3]], llIlIllIIlll[3]);
        BROAD = new d(llIlIllIIllI[llIlIllIIlll[4]], llIlIllIIlll[4]);
        HEAVY = new d(llIlIllIIllI[llIlIllIIlll[5]], llIlIllIIlll[5]);
        SPIKED = new d(llIlIllIIllI[llIlIllIIlll[6]], llIlIllIIlll[6]);
        d[] dVarArr = new d[llIlIllIIlll[7]];
        dVarArr[llIlIllIIlll[0]] = NONE;
        dVarArr[llIlIllIIlll[1]] = NARROW;
        dVarArr[llIlIllIIlll[2]] = LIGHT;
        dVarArr[llIlIllIIlll[3]] = FLAT;
        dVarArr[llIlIllIIlll[4]] = BROAD;
        dVarArr[llIlIllIIlll[5]] = HEAVY;
        dVarArr[llIlIllIIlll[6]] = SPIKED;
        $VALUES = dVarArr;
        values = values();
    }

    private static boolean lIIIIIlllIllIII(int i, int i2) {
        return i < i2;
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    private static boolean lIIIIIlllIlIlll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIIIIlllIlIIll(String lllllllllllllllIlIIIIIllIlIIIlII, String lllllllllllllllIlIIIIIllIlIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), llIlIllIIlll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIllIIlll[2], lllllllllllllllIlIIIIIllIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIllIlIIIlIl) {
            lllllllllllllllIlIIIIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlllIlIllI(int i) {
        return i >= 0;
    }

    private static String lIIIIIlllIlIIlI(String lllllllllllllllIlIIIIIllIlIllIIl, String lllllllllllllllIlIIIIIllIlIllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIllIlIlIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIIIllIlIllIII.toCharArray();
        int lllllllllllllllIlIIIIIllIlIlIlIl = llIlIllIIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIllIIlll[0];
        while (lIIIIIlllIllIII(i, length)) {
            char lllllllllllllllIlIIIIIllIlIllIlI = charArray2[i];
            lllllllllllllllIlIIIIIllIlIlIlll.append((char) (lllllllllllllllIlIIIIIllIlIllIlI ^ charArray[lllllllllllllllIlIIIIIllIlIlIlIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIIIIllIlIlIlIl++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIIIllIlIlIlll);
    }

    private static void lIIIIIlllIlIlII() {
        llIlIllIIllI = new String[llIlIllIIlll[7]];
        llIlIllIIllI[llIlIllIIlll[0]] = lIIIIIlllIlIIlI("OTUgPw==", "wznzs");
        llIlIllIIllI[llIlIllIIlll[1]] = lIIIIIlllIlIIlI("JDs4ECY9", "jzjBi");
        llIlIllIIllI[llIlIllIIlll[2]] = lIIIIIlllIlIIlI("CRASMRA=", "EYUyD");
        llIlIllIIllI[llIlIllIIlll[3]] = lIIIIIlllIlIIlI("ISkMJw==", "geMsU");
        llIlIllIIllI[llIlIllIIlll[4]] = lIIIIIlllIlIIlI("EycGDSk=", "QuILm");
        llIlIllIIllI[llIlIllIIlll[5]] = lIIIIIlllIlIIll("T11jiPwNs60=", "tqwnz");
        llIlIllIIllI[llIlIllIIlll[6]] = lIIIIIlllIlIIlI("AAg4CA4X", "SXqCK");
    }

    private d(String str, int i) {
    }
}
