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
/* renamed from: -.r.u.q.e.s.o.t.a.i.o  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/o.class */
public final class EnumC0014o {
    public static final /* synthetic */ EnumC0014o RIGOUR;
    public static final /* synthetic */ EnumC0014o EAGLE_EYE;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ int[] lIlIIIIIlllII;
    private static /* synthetic */ String[] lIlIIIIIllIll;
    private static final /* synthetic */ EnumC0014o[] $VALUES;

    private static void lIllIllIIlllllI() {
        lIlIIIIIllIll = new String[lIlIIIIIlllII[2]];
        lIlIIIIIllIll[lIlIIIIIlllII[0]] = lIllIllIIllllII("iEphhhSrsVg=", "QVBkr");
        lIlIIIIIllIll[lIlIIIIIlllII[1]] = lIllIllIIllllIl("JxgkNRQ9HDo8", "bYcyQ");
    }

    static {
        lIllIllIIllllll();
        lIllIllIIlllllI();
        RIGOUR = new EnumC0014o(lIlIIIIIllIll[lIlIIIIIlllII[0]], lIlIIIIIlllII[0], Prayer.RIGOUR);
        EAGLE_EYE = new EnumC0014o(lIlIIIIIllIll[lIlIIIIIlllII[1]], lIlIIIIIlllII[1], Prayer.EAGLE_EYE);
        EnumC0014o[] enumC0014oArr = new EnumC0014o[lIlIIIIIlllII[2]];
        enumC0014oArr[lIlIIIIIlllII[0]] = RIGOUR;
        enumC0014oArr[lIlIIIIIlllII[1]] = EAGLE_EYE;
        $VALUES = enumC0014oArr;
    }

    private static String lIllIllIIllllIl(String llllllllllllllIlllIIlIllIIIlIllI, String llllllllllllllIlllIIlIllIIIlIlIl) {
        String llllllllllllllIlllIIlIllIIIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIllIIIlIlII = new StringBuilder();
        char[] llllllllllllllIlllIIlIllIIIlIIll = llllllllllllllIlllIIlIllIIIlIlIl.toCharArray();
        int llllllllllllllIlllIIlIllIIIlIIlI = lIlIIIIIlllII[0];
        char[] charArray = llllllllllllllIlllIIlIllIIIlIllI2.toCharArray();
        int llllllllllllllIlllIIlIllIIIIlIll = charArray.length;
        int i = lIlIIIIIlllII[0];
        while (lIllIllIlIIIIII(i, llllllllllllllIlllIIlIllIIIIlIll)) {
            char llllllllllllllIlllIIlIllIIIlIlll = charArray[i];
            llllllllllllllIlllIIlIllIIIlIlII.append((char) (llllllllllllllIlllIIlIllIIIlIlll ^ llllllllllllllIlllIIlIllIIIlIIll[llllllllllllllIlllIIlIllIIIlIIlI % llllllllllllllIlllIIlIllIIIlIIll.length]));
            "".length();
            llllllllllllllIlllIIlIllIIIlIIlI++;
            i++;
            "".length();
            if ((-((((46 + 104) - 53) + 40) ^ (((72 + 76) - 113) + 106))) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIllIIIlIlII);
    }

    private static boolean lIllIllIlIIIIII(int i, int i2) {
        return i < i2;
    }

    public Prayer z() {
        return this.mapped;
    }

    private static String lIllIllIIllllII(String llllllllllllllIlllIIlIllIIlIIllI, String llllllllllllllIlllIIlIllIIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlllII[3]), "DES");
            Cipher llllllllllllllIlllIIlIllIIlIlIII = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllIIlIlIII.init(lIlIIIIIlllII[2], llllllllllllllIlllIIlIllIIlIlIIl);
            return new String(llllllllllllllIlllIIlIllIIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIllIIlIIlll) {
            llllllllllllllIlllIIlIllIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIllllll() {
        lIlIIIIIlllII = new int[4];
        lIlIIIIIlllII[0] = ((((93 + 136) - 184) + 148) ^ (((2 + 114) - 67) + 90)) & (((209 ^ 134) ^ (78 ^ 83)) ^ (-" ".length()));
        lIlIIIIIlllII[1] = " ".length();
        lIlIIIIIlllII[2] = "  ".length();
        lIlIIIIIlllII[3] = (((126 + 163) - 184) + 79) ^ (((57 + 77) - 28) + 70);
    }

    public static EnumC0014o[] values() {
        return (EnumC0014o[]) $VALUES.clone();
    }

    public static EnumC0014o valueOf(String str) {
        return (EnumC0014o) Enum.valueOf(EnumC0014o.class, str);
    }

    private EnumC0014o(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }
}
