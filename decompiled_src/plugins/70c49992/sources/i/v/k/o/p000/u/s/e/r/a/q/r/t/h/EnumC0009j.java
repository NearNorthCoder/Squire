package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/j.class */
public final class EnumC0009j {
    private static /* synthetic */ String[] lIlIlIlllIllI;
    public static final /* synthetic */ EnumC0009j FREEZE;
    public static final /* synthetic */ EnumC0009j FIRE_BALLS;
    public static final /* synthetic */ EnumC0009j NONE;
    private static final /* synthetic */ EnumC0009j[] $VALUES;
    private static /* synthetic */ int[] lIlIlIlllIlll;

    private static void lIllllllllIllll() {
        lIlIlIlllIlll = new int[5];
        lIlIlIlllIlll[0] = ((142 ^ 162) ^ (73 ^ 42)) & (((153 ^ 129) ^ (125 ^ 42)) ^ (-" ".length()));
        lIlIlIlllIlll[1] = " ".length();
        lIlIlIlllIlll[2] = "  ".length();
        lIlIlIlllIlll[3] = "   ".length();
        lIlIlIlllIlll[4] = 30 ^ 22;
    }

    private static void lIllllllllIlllI() {
        lIlIlIlllIllI = new String[lIlIlIlllIlll[3]];
        lIlIlIlllIllI[lIlIlIlllIlll[0]] = lIllllllllIllII("FrVJhQ17dIs=", "QqfIR");
        lIlIlIlllIllI[lIlIlIlllIlll[1]] = lIllllllllIllIl("NpIms05+jNaR+sON39a+2A==", "mEQOR");
        lIlIlIlllIllI[lIlIlIlllIlll[2]] = lIllllllllIllIl("8h7QIVIJJ+4=", "nTOth");
    }

    private static String lIllllllllIllIl(String llllllllllllllIllIlIlIIIIllIlIll, String llllllllllllllIllIlIlIIIIllIllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIIIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIIIllIllll.init(lIlIlIlllIlll[2], llllllllllllllIllIlIlIIIIlllIIII);
            return new String(llllllllllllllIllIlIlIIIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIIIllIlllI) {
            llllllllllllllIllIlIlIIIIllIlllI.printStackTrace();
            return null;
        }
    }

    static {
        lIllllllllIllll();
        lIllllllllIlllI();
        NONE = new EnumC0009j(lIlIlIlllIllI[lIlIlIlllIlll[0]], lIlIlIlllIlll[0]);
        FIRE_BALLS = new EnumC0009j(lIlIlIlllIllI[lIlIlIlllIlll[1]], lIlIlIlllIlll[1]);
        FREEZE = new EnumC0009j(lIlIlIlllIllI[lIlIlIlllIlll[2]], lIlIlIlllIlll[2]);
        EnumC0009j[] enumC0009jArr = new EnumC0009j[lIlIlIlllIlll[3]];
        enumC0009jArr[lIlIlIlllIlll[0]] = NONE;
        enumC0009jArr[lIlIlIlllIlll[1]] = FIRE_BALLS;
        enumC0009jArr[lIlIlIlllIlll[2]] = FREEZE;
        $VALUES = enumC0009jArr;
    }

    public static EnumC0009j[] values() {
        return (EnumC0009j[]) $VALUES.clone();
    }

    private static String lIllllllllIllII(String llllllllllllllIllIlIlIIIIllIIIII, String llllllllllllllIllIlIlIIIIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), lIlIlIlllIlll[4]), "DES");
            Cipher llllllllllllllIllIlIlIIIIllIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIIIIllIIIlI.init(lIlIlIlllIlll[2], secretKeySpec);
            return new String(llllllllllllllIllIlIlIIIIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIIIllIIIIl) {
            llllllllllllllIllIlIlIIIIllIIIIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0009j valueOf(String str) {
        return (EnumC0009j) Enum.valueOf(EnumC0009j.class, str);
    }

    private EnumC0009j(String str, int i2) {
    }
}
