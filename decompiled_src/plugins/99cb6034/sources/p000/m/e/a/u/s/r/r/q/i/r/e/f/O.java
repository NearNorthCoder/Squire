package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.O  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/O.class */
public final class O {
    public static final /* synthetic */ O HERB;
    private static /* synthetic */ int[] lIlllllIIlIl;
    public static final /* synthetic */ O BUSH;
    private final /* synthetic */ int animation;
    private static /* synthetic */ String[] lIlllllIIIIl;
    public static final /* synthetic */ O FLOWER;
    private final /* synthetic */ P allotment;
    private static final /* synthetic */ O[] $VALUES;
    public static final /* synthetic */ O ALLOTMENT;

    public int aP() {
        return this.animation;
    }

    private static void lllIllllIlIIlI() {
        lIlllllIIIIl = new String[lIlllllIIlIl[8]];
        lIlllllIIIIl[lIlllllIIlIl[0]] = lllIllllIIlIll("jByl/aj2/NjGmFs5XwJa7Q==", "PKhYn");
        lIlllllIIIIl[lIlllllIIlIl[2]] = lllIllllIIlIll("uaJ9QtGTavc=", "tsHNp");
        lIlllllIIIIl[lIlllllIIlIl[4]] = lllIllllIIlIll("IQoW3cGEJh8=", "OrSfp");
        lIlllllIIIIl[lIlllllIIlIl[6]] = lllIllllIlIIIl("PC0gNCso", "zaocn");
    }

    private static String lllIllllIlIIIl(String lllllllllllllllIlIllIIIlIIIIlIII, String lllllllllllllllIlIllIIIlIIIIIlll) {
        String lllllllllllllllIlIllIIIlIIIIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIIlIIIIIllI = new StringBuilder();
        char[] lllllllllllllllIlIllIIIlIIIIIlIl = lllllllllllllllIlIllIIIlIIIIIlll.toCharArray();
        int lllllllllllllllIlIllIIIlIIIIIlII = lIlllllIIlIl[0];
        char[] charArray = lllllllllllllllIlIllIIIlIIIIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIlllllIIlIl[0];
        while (lllIllllIlIllI(i, length)) {
            lllllllllllllllIlIllIIIlIIIIIllI.append((char) (charArray[i] ^ lllllllllllllllIlIllIIIlIIIIIlIl[lllllllllllllllIlIllIIIlIIIIIlII % lllllllllllllllIlIllIIIlIIIIIlIl.length]));
            "".length();
            lllllllllllllllIlIllIIIlIIIIIlII++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIIIlIIIIIllI);
    }

    static {
        lllIllllIlIlIl();
        lllIllllIlIIlI();
        ALLOTMENT = new O(lIlllllIIIIl[lIlllllIIlIl[0]], lIlllllIIlIl[0], lIlllllIIlIl[1], P.ALLOTMENT);
        BUSH = new O(lIlllllIIIIl[lIlllllIIlIl[2]], lIlllllIIlIl[2], lIlllllIIlIl[3], P.BUSH);
        HERB = new O(lIlllllIIIIl[lIlllllIIlIl[4]], lIlllllIIlIl[4], lIlllllIIlIl[5], P.HERB);
        FLOWER = new O(lIlllllIIIIl[lIlllllIIlIl[6]], lIlllllIIlIl[6], lIlllllIIlIl[7], P.FLOWER);
        O[] oArr = new O[lIlllllIIlIl[8]];
        oArr[lIlllllIIlIl[0]] = ALLOTMENT;
        oArr[lIlllllIIlIl[2]] = BUSH;
        oArr[lIlllllIIlIl[4]] = HERB;
        oArr[lIlllllIIlIl[6]] = FLOWER;
        $VALUES = oArr;
    }

    private O(String str, int i, int i2, P p) {
        this.animation = i2;
        this.allotment = p;
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }

    private static boolean lllIllllIllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static O e(int i) {
        O[] values = values();
        int length = values.length;
        int i2 = lIlllllIIlIl[0];
        while (lllIllllIlIllI(i2, length)) {
            O o = values[i2];
            if (lllIllllIllIII(o.aP(), i)) {
                return o;
            }
            i2++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return null;
    }

    public static O b(P p) {
        O[] values = values();
        int length = values.length;
        int i = lIlllllIIlIl[0];
        while (lllIllllIlIllI(i, length)) {
            O o = values[i];
            if (lllIllllIllIIl(o.aQ(), p)) {
                return o;
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return null;
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O G(N n) {
        return b(n.aL());
    }

    public P aQ() {
        return this.allotment;
    }

    private static void lllIllllIlIlIl() {
        lIlllllIIlIl = new int[9];
        lIlllllIIlIl[0] = " ".length() & (" ".length() ^ (-1));
        lIlllllIIlIl[1] = (-1089) & 1918;
        lIlllllIIlIl[2] = " ".length();
        lIlllllIIlIl[3] = (-((-15079) & 32503)) & (-8709) & 28413;
        lIlllllIIlIl[4] = "  ".length();
        lIlllllIIlIl[5] = (-14081) & 16362;
        lIlllllIIlIl[6] = "   ".length();
        lIlllllIIlIl[7] = (-13324) & 15615;
        lIlllllIIlIl[8] = (208 ^ 158) ^ (2 ^ 72);
    }

    private static boolean lllIllllIlIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIllllIllIII(int i, int i2) {
        return i == i2;
    }

    private static String lllIllllIIlIll(String lllllllllllllllIlIllIIIlIIIllIII, String lllllllllllllllIlIllIIIlIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIlIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIlIIIllIlI.init(lIlllllIIlIl[4], lllllllllllllllIlIllIIIlIIIllIll);
            return new String(lllllllllllllllIlIllIIIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIlIIIllIIl) {
            lllllllllllllllIlIllIIIlIIIllIIl.printStackTrace();
            return null;
        }
    }
}
