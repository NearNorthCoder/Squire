package m.e.a.i.z.m.r.p000.q.s.y.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.a  reason: invalid package and case insensitive filesystem */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/a.class */
public final class EnumC0000a {
    private final /* synthetic */ Prayer[] prayers;
    public static final /* synthetic */ EnumC0000a MYSTIC_MIGHT;
    public static final /* synthetic */ EnumC0000a AUGURY;
    private static final /* synthetic */ EnumC0000a[] $VALUES;
    private static /* synthetic */ int[] lIllIIlIllllI;
    private static /* synthetic */ String[] lIllIIlIlllIl;

    private static String llIIIllIIlIllIl(String llllllllllllllIllIIlIIllIIIIllIl, String llllllllllllllIllIIlIIllIIIIllII) {
        String llllllllllllllIllIIlIIllIIIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIllIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIllIIIIlIll = new StringBuilder();
        char[] llllllllllllllIllIIlIIllIIIIlIlI = llllllllllllllIllIIlIIllIIIIllII.toCharArray();
        int llllllllllllllIllIIlIIllIIIIIlII = lIllIIlIllllI[0];
        char[] charArray = llllllllllllllIllIIlIIllIIIIllIl2.toCharArray();
        int length = charArray.length;
        int i = lIllIIlIllllI[0];
        while (llIIIllIIllIIIl(i, length)) {
            llllllllllllllIllIIlIIllIIIIlIll.append((char) (charArray[i] ^ llllllllllllllIllIIlIIllIIIIlIlI[llllllllllllllIllIIlIIllIIIIIlII % llllllllllllllIllIIlIIllIIIIlIlI.length]));
            "".length();
            llllllllllllllIllIIlIIllIIIIIlII++;
            i++;
            "".length();
            if ((-" ".length()) > ((99 ^ 89) & ((120 ^ 66) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIIllIIIIlIll);
    }

    public static EnumC0000a valueOf(String str) {
        return (EnumC0000a) Enum.valueOf(EnumC0000a.class, str);
    }

    private static void llIIIllIIlIllll() {
        lIllIIlIlllIl = new String[lIllIIlIllllI[1]];
        lIllIIlIlllIl[lIllIIlIllllI[0]] = llIIIllIIlIllIl("PB82FywyGSgKIjkS", "qFeCe");
        lIllIIlIlllIl[lIllIIlIllllI[2]] = llIIIllIIlIlllI("Xi0GZJOKnAA=", "PLhIM");
    }

    private static String llIIIllIIlIlllI(String llllllllllllllIllIIlIIlIlllllIII, String llllllllllllllIllIIlIIlIllllIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIlIlllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), lIllIIlIllllI[3]), "DES");
            Cipher llllllllllllllIllIIlIIlIlllllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIIlIlllllIlI.init(lIllIIlIllllI[1], llllllllllllllIllIIlIIlIlllllIll);
            return new String(llllllllllllllIllIIlIIlIlllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIlIlllllIIl) {
            llllllllllllllIllIIlIIlIlllllIIl.printStackTrace();
            return null;
        }
    }

    public Prayer[] a() {
        return this.prayers;
    }

    static {
        llIIIllIIllIIII();
        llIIIllIIlIllll();
        String str = lIllIIlIlllIl[lIllIIlIllllI[0]];
        int i = lIllIIlIllllI[0];
        Prayer[] prayerArr = new Prayer[lIllIIlIllllI[1]];
        prayerArr[lIllIIlIllllI[0]] = Prayer.MYSTIC_MIGHT;
        prayerArr[lIllIIlIllllI[2]] = Prayer.STEEL_SKIN;
        MYSTIC_MIGHT = new EnumC0000a(str, i, prayerArr);
        String str2 = lIllIIlIlllIl[lIllIIlIllllI[2]];
        int i2 = lIllIIlIllllI[2];
        Prayer[] prayerArr2 = new Prayer[lIllIIlIllllI[2]];
        prayerArr2[lIllIIlIllllI[0]] = Prayer.AUGURY;
        AUGURY = new EnumC0000a(str2, i2, prayerArr2);
        EnumC0000a[] enumC0000aArr = new EnumC0000a[lIllIIlIllllI[1]];
        enumC0000aArr[lIllIIlIllllI[0]] = MYSTIC_MIGHT;
        enumC0000aArr[lIllIIlIllllI[2]] = AUGURY;
        $VALUES = enumC0000aArr;
    }

    private static boolean llIIIllIIllIIIl(int i, int i2) {
        return i < i2;
    }

    private EnumC0000a(String str, int i, Prayer... prayerArr) {
        this.prayers = prayerArr;
    }

    private static void llIIIllIIllIIII() {
        lIllIIlIllllI = new int[4];
        lIllIIlIllllI[0] = ((168 ^ 151) ^ (62 ^ 4)) & (((58 ^ 61) ^ "  ".length()) ^ (-" ".length()));
        lIllIIlIllllI[1] = "  ".length();
        lIllIIlIllllI[2] = " ".length();
        lIllIIlIllllI[3] = (((22 + 72) - (-21)) + 28) ^ (((111 + 102) - 197) + 119);
    }

    public static EnumC0000a[] values() {
        return (EnumC0000a[]) $VALUES.clone();
    }
}
