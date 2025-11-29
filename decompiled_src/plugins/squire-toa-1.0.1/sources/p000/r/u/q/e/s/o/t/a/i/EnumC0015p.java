package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.r.u.q.e.s.o.t.a.i.p  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/p.class */
public final class EnumC0015p {
    public static final /* synthetic */ EnumC0015p RANGE;
    private static /* synthetic */ int[] lIIlllllIIllI;
    private static /* synthetic */ String[] lIIlllllIIlIl;
    private static final /* synthetic */ EnumC0015p[] $VALUES;
    public static final /* synthetic */ EnumC0015p MELEE;
    public static final /* synthetic */ EnumC0015p MAGE;

    public static EnumC0015p valueOf(String str) {
        return (EnumC0015p) Enum.valueOf(EnumC0015p.class, str);
    }

    private static String lIllIlIlIIIIllI(String llllllllllllllIlllIlIIIIIlllIIll, String llllllllllllllIlllIlIIIIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIIIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIIIlllIlIl.init(lIIlllllIIllI[2], secretKeySpec);
            return new String(llllllllllllllIlllIlIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIIlllIlII) {
            llllllllllllllIlllIlIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    public static EnumC0015p[] values() {
        return (EnumC0015p[]) $VALUES.clone();
    }

    private static void lIllIlIlIIIlIIl() {
        lIIlllllIIllI = new int[5];
        lIIlllllIIllI[0] = ((40 ^ 44) ^ (126 ^ 84)) & (((117 ^ 2) ^ (76 ^ 21)) ^ (-" ".length()));
        lIIlllllIIllI[1] = " ".length();
        lIIlllllIIllI[2] = "  ".length();
        lIIlllllIIllI[3] = "   ".length();
        lIIlllllIIllI[4] = (57 ^ 68) ^ (252 ^ 137);
    }

    private static void lIllIlIlIIIlIII() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[3]];
        lIIlllllIIlIl[lIIlllllIIllI[0]] = lIllIlIlIIIIllI("f76kvmYwa6Y=", "zaIxe");
        lIIlllllIIlIl[lIIlllllIIllI[1]] = lIllIlIlIIIIlll("dw8KpBvwwV4=", "FrDjJ");
        lIIlllllIIlIl[lIIlllllIIllI[2]] = lIllIlIlIIIIllI("EL/bd3x5KYg=", "SqYfe");
    }

    private EnumC0015p(String str, int i) {
    }

    private static String lIllIlIlIIIIlll(String llllllllllllllIlllIlIIIIlIIIIIII, String llllllllllllllIlllIlIIIIIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), lIIlllllIIllI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllIIllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIlIIIIIIl) {
            llllllllllllllIlllIlIIIIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIllIlIlIIIlIIl();
        lIllIlIlIIIlIII();
        RANGE = new EnumC0015p(lIIlllllIIlIl[lIIlllllIIllI[0]], lIIlllllIIllI[0]);
        MAGE = new EnumC0015p(lIIlllllIIlIl[lIIlllllIIllI[1]], lIIlllllIIllI[1]);
        MELEE = new EnumC0015p(lIIlllllIIlIl[lIIlllllIIllI[2]], lIIlllllIIllI[2]);
        EnumC0015p[] enumC0015pArr = new EnumC0015p[lIIlllllIIllI[3]];
        enumC0015pArr[lIIlllllIIllI[0]] = RANGE;
        enumC0015pArr[lIIlllllIIllI[1]] = MAGE;
        enumC0015pArr[lIIlllllIIllI[2]] = MELEE;
        $VALUES = enumC0015pArr;
    }
}
