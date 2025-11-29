package g.r.r.p000.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.b  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/b.class */
public final class EnumC0001b {
    public static final /* synthetic */ EnumC0001b OVERCHARGED;
    private static /* synthetic */ String[] llIIllIlIlIl;
    public static final /* synthetic */ EnumC0001b STRONG;
    private static final /* synthetic */ EnumC0001b[] $VALUES;
    public static final /* synthetic */ EnumC0001b MEDIUM;
    public static final /* synthetic */ EnumC0001b WEAK;
    private static /* synthetic */ int[] llIIllIlIllI;

    private static String llllllIlIIllIl(String lllllllllllllllIlIIllIlIIIIIllll, String lllllllllllllllIlIIllIlIIIIIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllIlIIIIIlllI.toCharArray();
        int lllllllllllllllIlIIllIlIIIIIlIll = llIIllIlIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllIlIllI[0];
        while (llllllIlIlIIIl(i, length)) {
            char lllllllllllllllIlIIllIlIIIIlIIII = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIllIlIIIIlIIII ^ charArray[lllllllllllllllIlIIllIlIIIIIlIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIllIlIIIIIlIll++;
            i++;
            "".length();
            if ((-((6 ^ 64) ^ (66 ^ 0))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private EnumC0001b(String str, int i) {
    }

    private static String llllllIlIIlllI(String lllllllllllllllIlIIllIlIIIIlllll, String lllllllllllllllIlIIllIlIIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIlIIIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIlIIIlIIIIl.init(llIIllIlIllI[2], secretKeySpec);
            return new String(lllllllllllllllIlIIllIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIlIIIlIIIII) {
            lllllllllllllllIlIIllIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    public static EnumC0001b valueOf(String str) {
        return (EnumC0001b) Enum.valueOf(EnumC0001b.class, str);
    }

    private static void llllllIlIlIIII() {
        llIIllIlIllI = new int[5];
        llIIllIlIllI[0] = ((((128 + 105) - 141) + 85) ^ (((98 + 73) - 66) + 60)) & (((90 ^ 33) ^ (126 ^ 17)) ^ (-" ".length()));
        llIIllIlIllI[1] = " ".length();
        llIIllIlIllI[2] = "  ".length();
        llIIllIlIllI[3] = "   ".length();
        llIIllIlIllI[4] = 156 ^ 152;
    }

    public static EnumC0001b[] values() {
        return (EnumC0001b[]) $VALUES.clone();
    }

    static {
        llllllIlIlIIII();
        llllllIlIIllll();
        WEAK = new EnumC0001b(llIIllIlIlIl[llIIllIlIllI[0]], llIIllIlIllI[0]);
        MEDIUM = new EnumC0001b(llIIllIlIlIl[llIIllIlIllI[1]], llIIllIlIllI[1]);
        STRONG = new EnumC0001b(llIIllIlIlIl[llIIllIlIllI[2]], llIIllIlIllI[2]);
        OVERCHARGED = new EnumC0001b(llIIllIlIlIl[llIIllIlIllI[3]], llIIllIlIllI[3]);
        EnumC0001b[] enumC0001bArr = new EnumC0001b[llIIllIlIllI[4]];
        enumC0001bArr[llIIllIlIllI[0]] = WEAK;
        enumC0001bArr[llIIllIlIllI[1]] = MEDIUM;
        enumC0001bArr[llIIllIlIllI[2]] = STRONG;
        enumC0001bArr[llIIllIlIllI[3]] = OVERCHARGED;
        $VALUES = enumC0001bArr;
    }

    private static void llllllIlIIllll() {
        llIIllIlIlIl = new String[llIIllIlIllI[4]];
        llIIllIlIlIl[llIIllIlIllI[0]] = llllllIlIIllIl("DTAkCQ==", "ZueBq");
        llIIllIlIlIl[llIIllIlIllI[1]] = llllllIlIIllIl("DAs9MSEM", "ANyxt");
        llIIllIlIlIl[llIIllIlIllI[2]] = llllllIlIIlllI("jpD2t6zd+hI=", "uOdbw");
        llIIllIlIlIl[llIIllIlIllI[3]] = llllllIlIIllIl("GTo1JAkeLSIxDxI=", "VlpvJ");
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        return str.charAt(llIIllIlIllI[0]) + str.substring(llIIllIlIllI[1]).toLowerCase();
    }

    private static boolean llllllIlIlIIIl(int i, int i2) {
        return i < i2;
    }
}
