package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/i.class */
public final class EnumC0008i {
    public static final /* synthetic */ EnumC0008i BLOWPIE;
    public static final /* synthetic */ EnumC0008i CBOW;
    public static final /* synthetic */ EnumC0008i NELEE;
    private static /* synthetic */ int[] lIlIllIIllIll;
    public static final /* synthetic */ EnumC0008i MELEE;
    public static final /* synthetic */ EnumC0008i OTHER;
    private static final /* synthetic */ EnumC0008i[] $VALUES;
    private static /* synthetic */ String[] lIlIllIIllIlI;

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    private static String llIIIIIIllIIIll(String llllllllllllllIllIlIIlIlIIIlllll, String llllllllllllllIllIlIIlIlIIIllllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIIlIlIIIlllII = llllllllllllllIllIlIIlIlIIIllllI.toCharArray();
        int llllllllllllllIllIlIIlIlIIIllIll = lIlIllIIllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIllIIllIll[0];
        while (llIIIIIIllIIllI(i2, length)) {
            char llllllllllllllIllIlIIlIlIIlIIIII = charArray[i2];
            sb.append((char) (llllllllllllllIllIlIIlIlIIlIIIII ^ llllllllllllllIllIlIIlIlIIIlllII[llllllllllllllIllIlIIlIlIIIllIll % llllllllllllllIllIlIIlIlIIIlllII.length]));
            "".length();
            llllllllllllllIllIlIIlIlIIIllIll++;
            i2++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIIIIIllIIIlI(String llllllllllllllIllIlIIlIlIIIIlIlI, String llllllllllllllIllIlIIlIlIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIIllIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIlIIIIlIll) {
            llllllllllllllIllIlIIlIlIIIIlIll.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIIllIIlIl();
        llIIIIIIllIIlII();
        NELEE = new EnumC0008i(lIlIllIIllIlI[lIlIllIIllIll[0]], lIlIllIIllIll[0]);
        BLOWPIE = new EnumC0008i(lIlIllIIllIlI[lIlIllIIllIll[1]], lIlIllIIllIll[1]);
        CBOW = new EnumC0008i(lIlIllIIllIlI[lIlIllIIllIll[2]], lIlIllIIllIll[2]);
        MELEE = new EnumC0008i(lIlIllIIllIlI[lIlIllIIllIll[3]], lIlIllIIllIll[3]);
        OTHER = new EnumC0008i(lIlIllIIllIlI[lIlIllIIllIll[4]], lIlIllIIllIll[4]);
        EnumC0008i[] enumC0008iArr = new EnumC0008i[lIlIllIIllIll[5]];
        enumC0008iArr[lIlIllIIllIll[0]] = NELEE;
        enumC0008iArr[lIlIllIIllIll[1]] = BLOWPIE;
        enumC0008iArr[lIlIllIIllIll[2]] = CBOW;
        enumC0008iArr[lIlIllIIllIll[3]] = MELEE;
        enumC0008iArr[lIlIllIIllIll[4]] = OTHER;
        $VALUES = enumC0008iArr;
    }

    private EnumC0008i(String str, int i2) {
    }

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }

    private static boolean llIIIIIIllIIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String llIIIIIIllIIIIl(String llllllllllllllIllIlIIlIlIIlIllll, String llllllllllllllIllIlIIlIlIIlIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIlIIlIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllIIllIll[6]), "DES");
            Cipher llllllllllllllIllIlIIlIlIIllIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIlIIllIIIl.init(lIlIllIIllIll[2], secretKeySpec);
            return new String(llllllllllllllIllIlIIlIlIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIlIIllIIII) {
            llllllllllllllIllIlIIlIlIIllIIII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIIllIIlIl() {
        lIlIllIIllIll = new int[7];
        lIlIllIIllIll[0] = ((100 ^ 87) ^ "  ".length()) & (((18 ^ 84) ^ (20 ^ 99)) ^ (-" ".length()));
        lIlIllIIllIll[1] = " ".length();
        lIlIllIIllIll[2] = "  ".length();
        lIlIllIIllIll[3] = "   ".length();
        lIlIllIIllIll[4] = (233 ^ 180) ^ (58 ^ 99);
        lIlIllIIllIll[5] = 59 ^ 62;
        lIlIllIIllIll[6] = 2 ^ 10;
    }

    private static void llIIIIIIllIIlII() {
        lIlIllIIllIlI = new String[lIlIllIIllIll[5]];
        lIlIllIIllIlI[lIlIllIIllIll[0]] = llIIIIIIllIIIIl("XOj9tjdsm20=", "SXfSA");
        lIlIllIIllIlI[lIlIllIIllIll[1]] = llIIIIIIllIIIlI("FXyRmEaNqvc=", "zjQrV");
        lIlIllIIllIlI[lIlIllIIllIll[2]] = llIIIIIIllIIIlI("BgJhuEnsMbk=", "uuRVv");
        lIlIllIIllIlI[lIlIllIIllIll[3]] = llIIIIIIllIIIll("CS04Fg0=", "DhtSH");
        lIlIllIIllIlI[lIlIllIIllIll[4]] = llIIIIIIllIIIlI("9kkvQM4DMYU=", "UIwAy");
    }
}
