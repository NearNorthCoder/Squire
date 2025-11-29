package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.r.u.q.e.s.o.t.a.i.n  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/n.class */
public final class EnumC0013n {
    public static final /* synthetic */ EnumC0013n NORMAL;
    private static /* synthetic */ int[] lIlIIIIIIIIlI;
    private static final /* synthetic */ EnumC0013n[] $VALUES;
    public static final /* synthetic */ EnumC0013n FLICK;
    public static final /* synthetic */ EnumC0013n NONE;
    private static /* synthetic */ String[] lIlIIIIIIIIIl;

    private static String lIllIlIllIllIIl(String llllllllllllllIlllIIlllIIIIIllIl, String llllllllllllllIlllIIlllIIIIIllII) {
        String llllllllllllllIlllIIlllIIIIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlllIIIIIlIll = new StringBuilder();
        char[] llllllllllllllIlllIIlllIIIIIlIlI = llllllllllllllIlllIIlllIIIIIllII.toCharArray();
        int llllllllllllllIlllIIlllIIIIIlIIl = lIlIIIIIIIIlI[0];
        char[] charArray = llllllllllllllIlllIIlllIIIIIllIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIIIlI[0];
        while (lIllIlIllIlllIl(i, length)) {
            llllllllllllllIlllIIlllIIIIIlIll.append((char) (charArray[i] ^ llllllllllllllIlllIIlllIIIIIlIlI[llllllllllllllIlllIIlllIIIIIlIIl % llllllllllllllIlllIIlllIIIIIlIlI.length]));
            "".length();
            llllllllllllllIlllIIlllIIIIIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlllIIIIIlIll);
    }

    private EnumC0013n(String str, int i) {
    }

    private static void lIllIlIllIlllII() {
        lIlIIIIIIIIlI = new int[4];
        lIlIIIIIIIIlI[0] = ((168 ^ 162) ^ (46 ^ 42)) & (((((75 + 134) - 164) + 133) ^ (((43 + 80) - (-25)) + 40)) ^ (-" ".length()));
        lIlIIIIIIIIlI[1] = " ".length();
        lIlIIIIIIIIlI[2] = "  ".length();
        lIlIIIIIIIIlI[3] = "   ".length();
    }

    private static boolean lIllIlIllIlllIl(int i, int i2) {
        return i < i2;
    }

    public static EnumC0013n[] values() {
        return (EnumC0013n[]) $VALUES.clone();
    }

    public static EnumC0013n valueOf(String str) {
        return (EnumC0013n) Enum.valueOf(EnumC0013n.class, str);
    }

    static {
        lIllIlIllIlllII();
        lIllIlIllIllIll();
        NONE = new EnumC0013n(lIlIIIIIIIIIl[lIlIIIIIIIIlI[0]], lIlIIIIIIIIlI[0]);
        NORMAL = new EnumC0013n(lIlIIIIIIIIIl[lIlIIIIIIIIlI[1]], lIlIIIIIIIIlI[1]);
        FLICK = new EnumC0013n(lIlIIIIIIIIIl[lIlIIIIIIIIlI[2]], lIlIIIIIIIIlI[2]);
        EnumC0013n[] enumC0013nArr = new EnumC0013n[lIlIIIIIIIIlI[3]];
        enumC0013nArr[lIlIIIIIIIIlI[0]] = NONE;
        enumC0013nArr[lIlIIIIIIIIlI[1]] = NORMAL;
        enumC0013nArr[lIlIIIIIIIIlI[2]] = FLICK;
        $VALUES = enumC0013nArr;
    }

    private static String lIllIlIllIllIlI(String llllllllllllllIlllIIlllIIIIlllIl, String llllllllllllllIlllIIlllIIIIlllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIIIIlI[2], llllllllllllllIlllIIlllIIIlIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlllIIIIllllI) {
            llllllllllllllIlllIIlllIIIIllllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllIllIll() {
        lIlIIIIIIIIIl = new String[lIlIIIIIIIIlI[3]];
        lIlIIIIIIIIIl[lIlIIIIIIIIlI[0]] = lIllIlIllIllIIl("GBoPIA==", "VUAev");
        lIlIIIIIIIIIl[lIlIIIIIIIIlI[1]] = lIllIlIllIllIlI("ysAEhQjNas0=", "gaDrA");
        lIlIIIIIIIIIl[lIlIIIIIIIIlI[2]] = lIllIlIllIllIlI("y0WNqC/MHlQ=", "igGis");
    }
}
