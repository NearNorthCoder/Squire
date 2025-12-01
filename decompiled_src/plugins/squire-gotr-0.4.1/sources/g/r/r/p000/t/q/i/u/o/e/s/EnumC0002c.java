package g.r.r.p000.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.c  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/c.class */
public final class EnumC0002c {
    private static /* synthetic */ String[] llIlIIIIIllI;
    public static final /* synthetic */ EnumC0002c OUTSIDE;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    private static /* synthetic */ int[] llIlIIIIlIIl;
    public static final /* synthetic */ EnumC0002c ACTIVE;
    public static final /* synthetic */ EnumC0002c FINISHING;
    public static final /* synthetic */ EnumC0002c COUNTDOWN;
    public static final /* synthetic */ EnumC0002c ACTIVATING;

    private static boolean lIIIIIIIIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIIIIIIllIlI(String lllllllllllllllIlIIlIlIIlIlIlIll, String lllllllllllllllIlIIlIlIIlIlIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIIlIlIlIIl = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIIlIlIlIII = lllllllllllllllIlIIlIlIIlIlIlIlI.toCharArray();
        int lllllllllllllllIlIIlIlIIlIlIIlll = llIlIIIIlIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIIIIlIIl[0];
        while (lIIIIIIIIlIIllI(i, length)) {
            char lllllllllllllllIlIIlIlIIlIlIllII = charArray[i];
            lllllllllllllllIlIIlIlIIlIlIlIIl.append((char) (lllllllllllllllIlIIlIlIIlIlIllII ^ lllllllllllllllIlIIlIlIIlIlIlIII[lllllllllllllllIlIIlIlIIlIlIIlll % lllllllllllllllIlIIlIlIIlIlIlIII.length]));
            "".length();
            lllllllllllllllIlIIlIlIIlIlIIlll++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIlIIlIlIlIIl);
    }

    private EnumC0002c(String str, int i) {
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    static {
        lIIIIIIIIlIIlIl();
        lIIIIIIIIlIIlII();
        ACTIVATING = new EnumC0002c(llIlIIIIIllI[llIlIIIIlIIl[0]], llIlIIIIlIIl[0]);
        COUNTDOWN = new EnumC0002c(llIlIIIIIllI[llIlIIIIlIIl[1]], llIlIIIIlIIl[1]);
        ACTIVE = new EnumC0002c(llIlIIIIIllI[llIlIIIIlIIl[2]], llIlIIIIlIIl[2]);
        FINISHING = new EnumC0002c(llIlIIIIIllI[llIlIIIIlIIl[3]], llIlIIIIlIIl[3]);
        OUTSIDE = new EnumC0002c(llIlIIIIIllI[llIlIIIIlIIl[4]], llIlIIIIlIIl[4]);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIlIIIIlIIl[5]];
        enumC0002cArr[llIlIIIIlIIl[0]] = ACTIVATING;
        enumC0002cArr[llIlIIIIlIIl[1]] = COUNTDOWN;
        enumC0002cArr[llIlIIIIlIIl[2]] = ACTIVE;
        enumC0002cArr[llIlIIIIlIIl[3]] = FINISHING;
        enumC0002cArr[llIlIIIIlIIl[4]] = OUTSIDE;
        $VALUES = enumC0002cArr;
    }

    private static void lIIIIIIIIlIIlIl() {
        llIlIIIIlIIl = new int[6];
        llIlIIIIlIIl[0] = (87 ^ 24) & ((55 ^ 120) ^ (-1));
        llIlIIIIlIIl[1] = " ".length();
        llIlIIIIlIIl[2] = "  ".length();
        llIlIIIIlIIl[3] = "   ".length();
        llIlIIIIlIIl[4] = (4 ^ 40) ^ (53 ^ 29);
        llIlIIIIlIIl[5] = 192 ^ 197;
    }

    private static String lIIIIIIIIIllIll(String lllllllllllllllIlIIlIlIIlIlllIll, String lllllllllllllllIlIIlIlIIlIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIIlIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIIlIllllIl.init(llIlIIIIlIIl[2], lllllllllllllllIlIIlIlIIlIlllllI);
            return new String(lllllllllllllllIlIIlIlIIlIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIIlIllllII) {
            lllllllllllllllIlIIlIlIIlIllllII.printStackTrace();
            return null;
        }
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        return str.charAt(llIlIIIIlIIl[0]) + str.substring(llIlIIIIlIIl[1]).toLowerCase();
    }

    private static void lIIIIIIIIlIIlII() {
        llIlIIIIIllI = new String[llIlIIIIlIIl[5]];
        llIlIIIIIllI[llIlIIIIlIIl[0]] = lIIIIIIIIIllIlI("FxoAIgQXDR0lFQ==", "VYTkR");
        llIlIIIIIllI[llIlIIIIlIIl[1]] = lIIIIIIIIIllIll("wA9a3A4mz5z/j2ZtCuPdWA==", "XJbPf");
        llIlIIIIIllI[llIlIIIIlIIl[2]] = lIIIIIIIIIllIlI("BDonHD8A", "EysUi");
        llIlIIIIIllI[llIlIIIIlIIl[3]] = lIIIIIIIIIllIll("GoGiE1vkhojgsH2XhEoVgQ==", "RFMRv");
        llIlIIIIIllI[llIlIIIIlIIl[4]] = lIIIIIIIIIllIll("2+MSmt+st8U=", "jPzRB");
    }
}
