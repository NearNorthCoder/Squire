package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.j  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/j.class */
public final class EnumC0009j {
    public static final /* synthetic */ EnumC0009j EAGLE_EYE;
    public static final /* synthetic */ EnumC0009j RIGOUR;
    private static /* synthetic */ int[] lIllIlIllIIII;
    private final /* synthetic */ Prayer prayer;
    private static final /* synthetic */ EnumC0009j[] $VALUES;
    private static /* synthetic */ String[] lIllIlIlIlllI;

    private static String llIIlIIIIIlIllI(String llllllllllllllIllIIIllIlIllIllII, String llllllllllllllIllIIIllIlIllIlIll) {
        String llllllllllllllIllIIIllIlIllIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIlIllIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIllIlIllIlIll.toCharArray();
        int llllllllllllllIllIIIllIlIllIlIII = lIllIlIllIIII[0];
        char[] charArray2 = llllllllllllllIllIIIllIlIllIllII2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIllIIII[0];
        while (llIIlIIIIIllIll(i, length)) {
            llllllllllllllIllIIIllIlIllIlIlI.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIIllIlIllIlIII % charArray.length]));
            "".length();
            llllllllllllllIllIIIllIlIllIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIllIlIllIlIlI);
    }

    private static boolean llIIlIIIIIllIll(int i, int i2) {
        return i < i2;
    }

    private static void llIIlIIIIIlIlll() {
        lIllIlIlIlllI = new String[lIllIlIllIIII[2]];
        lIllIlIlIlllI[lIllIlIllIIII[0]] = llIIlIIIIIlIlIl("7ht95oQiEGL7/eQ4bmbS0A==", "DUgUZ");
        lIllIlIlIlllI[lIllIlIllIIII[1]] = llIIlIIIIIlIllI("NgowAR42", "dCwNK");
    }

    private EnumC0009j(String str, int i, Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        llIIlIIIIIllIlI();
        llIIlIIIIIlIlll();
        EAGLE_EYE = new EnumC0009j(lIllIlIlIlllI[lIllIlIllIIII[0]], lIllIlIllIIII[0], Prayer.EAGLE_EYE);
        RIGOUR = new EnumC0009j(lIllIlIlIlllI[lIllIlIllIIII[1]], lIllIlIllIIII[1], Prayer.RIGOUR);
        EnumC0009j[] enumC0009jArr = new EnumC0009j[lIllIlIllIIII[2]];
        enumC0009jArr[lIllIlIllIIII[0]] = EAGLE_EYE;
        enumC0009jArr[lIllIlIllIIII[1]] = RIGOUR;
        $VALUES = enumC0009jArr;
    }

    private static void llIIlIIIIIllIlI() {
        lIllIlIllIIII = new int[3];
        lIllIlIllIIII[0] = (197 ^ 144) & ((51 ^ 102) ^ (-1));
        lIllIlIllIIII[1] = " ".length();
        lIllIlIllIIII[2] = "  ".length();
    }

    public static EnumC0009j valueOf(String str) {
        return (EnumC0009j) Enum.valueOf(EnumC0009j.class, str);
    }

    public static EnumC0009j[] values() {
        return (EnumC0009j[]) $VALUES.clone();
    }

    private static String llIIlIIIIIlIlIl(String llllllllllllllIllIIIllIlIlllllII, String llllllllllllllIllIIIllIlIllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllIlIllllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllIlIllllllI.init(lIllIlIllIIII[2], secretKeySpec);
            return new String(llllllllllllllIllIIIllIlIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIlIlllllIl) {
            llllllllllllllIllIIIllIlIlllllIl.printStackTrace();
            return null;
        }
    }

    public Prayer r() {
        return this.prayer;
    }
}
