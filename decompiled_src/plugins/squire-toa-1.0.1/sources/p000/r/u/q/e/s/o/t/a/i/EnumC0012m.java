package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.r.u.q.e.s.o.t.a.i.m  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/m.class */
public final class EnumC0012m {
    private static /* synthetic */ String[] lIlIIIIIIIlll;
    private final /* synthetic */ Prayer mapped;
    private static final /* synthetic */ EnumC0012m[] $VALUES;
    public static final /* synthetic */ EnumC0012m PIETY;
    public static final /* synthetic */ EnumC0012m CHIVALRY;
    public static final /* synthetic */ EnumC0012m ULTIMATE_STRENGTH;
    private static /* synthetic */ int[] lIlIIIIIIlIII;

    static {
        lIllIlIlllIIllI();
        lIllIlIlllIIlIl();
        PIETY = new EnumC0012m(lIlIIIIIIIlll[lIlIIIIIIlIII[0]], lIlIIIIIIlIII[0], Prayer.PIETY);
        CHIVALRY = new EnumC0012m(lIlIIIIIIIlll[lIlIIIIIIlIII[1]], lIlIIIIIIlIII[1], Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new EnumC0012m(lIlIIIIIIIlll[lIlIIIIIIlIII[2]], lIlIIIIIIlIII[2], Prayer.ULTIMATE_STRENGTH);
        EnumC0012m[] enumC0012mArr = new EnumC0012m[lIlIIIIIIlIII[3]];
        enumC0012mArr[lIlIIIIIIlIII[0]] = PIETY;
        enumC0012mArr[lIlIIIIIIlIII[1]] = CHIVALRY;
        enumC0012mArr[lIlIIIIIIlIII[2]] = ULTIMATE_STRENGTH;
        $VALUES = enumC0012mArr;
    }

    private static boolean lIllIlIlllIIlll(int i, int i2) {
        return i < i2;
    }

    public static EnumC0012m valueOf(String str) {
        return (EnumC0012m) Enum.valueOf(EnumC0012m.class, str);
    }

    public static EnumC0012m[] values() {
        return (EnumC0012m[]) $VALUES.clone();
    }

    private static String lIllIlIlllIIlII(String llllllllllllllIlllIIllIlllIlIllI, String llllllllllllllIlllIIllIlllIlIIII) {
        String llllllllllllllIlllIIllIlllIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIlllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIllIlllIlIIII.toCharArray();
        int llllllllllllllIlllIIllIlllIlIIlI = lIlIIIIIIlIII[0];
        char[] charArray2 = llllllllllllllIlllIIllIlllIlIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIIlIII[0];
        while (lIllIlIlllIIlll(i, length)) {
            char llllllllllllllIlllIIllIlllIlIlll = charArray2[i];
            sb.append((char) (llllllllllllllIlllIIllIlllIlIlll ^ charArray[llllllllllllllIlllIIllIlllIlIIlI % charArray.length]));
            "".length();
            llllllllllllllIlllIIllIlllIlIIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIlIlllIIIll(String llllllllllllllIlllIIllIllllIIllI, String llllllllllllllIlllIIllIllllIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIIlIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIllllIIlll) {
            llllllllllllllIlllIIllIllllIIlll.printStackTrace();
            return null;
        }
    }

    public Prayer z() {
        return this.mapped;
    }

    private static void lIllIlIlllIIlIl() {
        lIlIIIIIIIlll = new String[lIlIIIIIIlIII[3]];
        lIlIIIIIIIlll[lIlIIIIIIlIII[0]] = lIllIlIlllIIIll("jK3rkS8YXoM=", "QobfZ");
        lIlIIIIIIIlll[lIlIIIIIIlIII[1]] = lIllIlIlllIIlII("FzgvEjAYIj8=", "TpfDq");
        lIlIIIIIIIlll[lIlIIIIIIlIII[2]] = lIllIlIlllIIIll("q8uF9IUKqhAkd0brPEnBMvaVdjaq6hIO", "kAXYX");
    }

    private static void lIllIlIlllIIllI() {
        lIlIIIIIIlIII = new int[4];
        lIlIIIIIIlIII[0] = ((121 ^ 101) ^ (108 ^ 70)) & (((70 ^ 34) ^ (50 ^ 96)) ^ (-" ".length()));
        lIlIIIIIIlIII[1] = " ".length();
        lIlIIIIIIlIII[2] = "  ".length();
        lIlIIIIIIlIII[3] = "   ".length();
    }

    private EnumC0012m(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }
}
