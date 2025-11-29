package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.F  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/F.class */
public final class F {
    private static final /* synthetic */ F[] $VALUES;
    private static /* synthetic */ String[] lllIIIllllIl;
    private static /* synthetic */ int[] lllIIIlllllI;
    public static final /* synthetic */ F STATUE_8_DOUBLE;
    public static final /* synthetic */ F STATUE_BLUE_DOUBLE;
    public static final /* synthetic */ F STATUE_6_DOUBLE;

    private static String lIIIlIIlllIIIIl(String lllllllllllllllIIllIlIlllIllllII, String lllllllllllllllIIllIlIlllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlllIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlllIlllllI.init(lllIIIlllllI[2], lllllllllllllllIIllIlIlllIllllll);
            return new String(lllllllllllllllIIllIlIlllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlllIllllIl) {
            lllllllllllllllIIllIlIlllIllllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIIlllIIIll();
        lIIIlIIlllIIIlI();
        STATUE_6_DOUBLE = new F(lllIIIllllIl[lllIIIlllllI[0]], lllIIIlllllI[0]);
        STATUE_8_DOUBLE = new F(lllIIIllllIl[lllIIIlllllI[1]], lllIIIlllllI[1]);
        STATUE_BLUE_DOUBLE = new F(lllIIIllllIl[lllIIIlllllI[2]], lllIIIlllllI[2]);
        F[] fArr = new F[lllIIIlllllI[3]];
        fArr[lllIIIlllllI[0]] = STATUE_6_DOUBLE;
        fArr[lllIIIlllllI[1]] = STATUE_8_DOUBLE;
        fArr[lllIIIlllllI[2]] = STATUE_BLUE_DOUBLE;
        $VALUES = fArr;
    }

    private F(String str, int i) {
    }

    private static void lIIIlIIlllIIIlI() {
        lllIIIllllIl = new String[lllIIIlllllI[3]];
        lllIIIllllIl[lllIIIlllllI[0]] = lIIIlIIlllIIIIl("QNshsf0xe1OP81r/NaGZLQ==", "hpFNc");
        lllIIIllllIl[lllIIIlllllI[1]] = lIIIlIIlllIIIIl("F4nweRkRMP0DLrW63X6IyA==", "tRpyc");
        lllIIIllllIl[lllIIIlllllI[2]] = lIIIlIIlllIIIIl("7frmXW8grYnw37bbFfv1Qn0L9cWLkCtf", "ShBlw");
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }

    private static void lIIIlIIlllIIIll() {
        lllIIIlllllI = new int[4];
        lllIIIlllllI[0] = (63 ^ 26) & ((97 ^ 68) ^ (-1));
        lllIIIlllllI[1] = " ".length();
        lllIIIlllllI[2] = "  ".length();
        lllIIIlllllI[3] = "   ".length();
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }
}
