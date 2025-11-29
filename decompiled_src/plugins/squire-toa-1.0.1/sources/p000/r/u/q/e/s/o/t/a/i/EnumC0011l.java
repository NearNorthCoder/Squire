package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.r.u.q.e.s.o.t.a.i.l  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/l.class */
public final class EnumC0011l {
    private static /* synthetic */ String[] lIIlllllIIIIl;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ EnumC0011l MYSTIC_MIGHT;
    public static final /* synthetic */ EnumC0011l AUGURY;
    private static final /* synthetic */ EnumC0011l[] $VALUES;
    private static /* synthetic */ int[] lIIlllllIIIlI;

    public static EnumC0011l[] values() {
        return (EnumC0011l[]) $VALUES.clone();
    }

    private static String lIllIlIIllllIlI(String llllllllllllllIlllIIlIllllIlIlIl, String llllllllllllllIlllIIlIllllIlIlII) {
        String llllllllllllllIlllIIlIllllIlIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIllllIlIIll = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIllllIlIlII.toCharArray();
        int llllllllllllllIlllIIlIllllIlIIIl = lIIlllllIIIlI[0];
        char[] charArray2 = llllllllllllllIlllIIlIllllIlIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllIIIlI[0];
        while (lIllIllIIlIlIll(i, length)) {
            llllllllllllllIlllIIlIllllIlIIll.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIIlIllllIlIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIllllIlIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIllllIlIIll);
    }

    private static void lIllIlIIlllllII() {
        lIIlllllIIIIl = new String[lIIlllllIIIlI[2]];
        lIIlllllIIIIl[lIIlllllIIIlI[0]] = lIllIlIIllllIlI("ERwKFDkJ", "PIMAk");
        lIIlllllIIIIl[lIIlllllIIIlI[1]] = lIllIlIIllllIll("Ds2h5mLqqdz+1X9mN5sBTg==", "tTWeb");
    }

    static {
        lIllIlIIlllllIl();
        lIllIlIIlllllII();
        AUGURY = new EnumC0011l(lIIlllllIIIIl[lIIlllllIIIlI[0]], lIIlllllIIIlI[0], Prayer.AUGURY);
        MYSTIC_MIGHT = new EnumC0011l(lIIlllllIIIIl[lIIlllllIIIlI[1]], lIIlllllIIIlI[1], Prayer.MYSTIC_MIGHT);
        EnumC0011l[] enumC0011lArr = new EnumC0011l[lIIlllllIIIlI[2]];
        enumC0011lArr[lIIlllllIIIlI[0]] = AUGURY;
        enumC0011lArr[lIIlllllIIIlI[1]] = MYSTIC_MIGHT;
        $VALUES = enumC0011lArr;
    }

    public Prayer z() {
        return this.mapped;
    }

    public static EnumC0011l valueOf(String str) {
        return (EnumC0011l) Enum.valueOf(EnumC0011l.class, str);
    }

    private static String lIllIlIIllllIll(String llllllllllllllIlllIIlIllllIIIIII, String llllllllllllllIlllIIlIlllIllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), lIIlllllIIIlI[3]), "DES");
            Cipher llllllllllllllIlllIIlIllllIIIIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllllIIIIlI.init(lIIlllllIIIlI[2], secretKeySpec);
            return new String(llllllllllllllIlllIIlIllllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIllllIIIIIl) {
            llllllllllllllIlllIIlIllllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIIlllllIl() {
        lIIlllllIIIlI = new int[4];
        lIIlllllIIIlI[0] = (13 ^ 78) & ((125 ^ 62) ^ (-1));
        lIIlllllIIIlI[1] = " ".length();
        lIIlllllIIIlI[2] = "  ".length();
        lIIlllllIIIlI[3] = 188 ^ 180;
    }

    private EnumC0011l(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lIllIllIIlIlIll(int i, int i2) {
        return i < i2;
    }
}
