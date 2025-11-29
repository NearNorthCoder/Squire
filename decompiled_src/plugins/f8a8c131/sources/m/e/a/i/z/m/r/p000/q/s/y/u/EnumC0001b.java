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
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.b  reason: invalid package and case insensitive filesystem */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/b.class */
public final class EnumC0001b {
    private static /* synthetic */ String[] lIllIIlIIlIlI;
    private static final /* synthetic */ EnumC0001b[] $VALUES;
    private final /* synthetic */ Prayer[] prayers;
    private static /* synthetic */ int[] lIllIIlIIlIll;
    public static final /* synthetic */ EnumC0001b EAGLE_EYE;
    public static final /* synthetic */ EnumC0001b RIGOUR;

    private static void llIIIlIllllIllI() {
        lIllIIlIIlIll = new int[4];
        lIllIIlIIlIll[0] = (188 ^ 131) & ((160 ^ 159) ^ (-1));
        lIllIIlIIlIll[1] = " ".length();
        lIllIIlIIlIll[2] = "  ".length();
        lIllIIlIIlIll[3] = 11 ^ 3;
    }

    private static void llIIIlIllllIlIl() {
        lIllIIlIIlIlI = new String[lIllIIlIIlIll[2]];
        lIllIIlIIlIlI[lIllIIlIIlIll[0]] = llIIIlIllllIIll("C/KgXSASY7k=", "prMhW");
        lIllIIlIIlIlI[lIllIIlIIlIll[1]] = llIIIlIllllIlII("C6ukG6p8cmo5xFXfFVMfaQ==", "CuiIv");
    }

    private static String llIIIlIllllIlII(String llllllllllllllIllIIlIlIIIllIlIIl, String llllllllllllllIllIIlIlIIIllIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIIllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIIllIlIII.getBytes(StandardCharsets.UTF_8)), lIllIIlIIlIll[3]), "DES");
            Cipher llllllllllllllIllIIlIlIIIllIlIll = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIIIllIlIll.init(lIllIIlIIlIll[2], llllllllllllllIllIIlIlIIIllIllII);
            return new String(llllllllllllllIllIIlIlIIIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIIIllIlIlI) {
            llllllllllllllIllIIlIlIIIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIllllIIll(String llllllllllllllIllIIlIlIIIlllIllI, String llllllllllllllIllIIlIlIIIlllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIIlIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIIIlllIlll) {
            llllllllllllllIllIIlIlIIIlllIlll.printStackTrace();
            return null;
        }
    }

    private EnumC0001b(String str, int i, Prayer... prayerArr) {
        this.prayers = prayerArr;
    }

    public Prayer[] a() {
        return this.prayers;
    }

    public static EnumC0001b valueOf(String str) {
        return (EnumC0001b) Enum.valueOf(EnumC0001b.class, str);
    }

    public static EnumC0001b[] values() {
        return (EnumC0001b[]) $VALUES.clone();
    }

    static {
        llIIIlIllllIllI();
        llIIIlIllllIlIl();
        String str = lIllIIlIIlIlI[lIllIIlIIlIll[0]];
        int i = lIllIIlIIlIll[0];
        Prayer[] prayerArr = new Prayer[lIllIIlIIlIll[1]];
        prayerArr[lIllIIlIIlIll[0]] = Prayer.RIGOUR;
        RIGOUR = new EnumC0001b(str, i, prayerArr);
        String str2 = lIllIIlIIlIlI[lIllIIlIIlIll[1]];
        int i2 = lIllIIlIIlIll[1];
        Prayer[] prayerArr2 = new Prayer[lIllIIlIIlIll[2]];
        prayerArr2[lIllIIlIIlIll[0]] = Prayer.EAGLE_EYE;
        prayerArr2[lIllIIlIIlIll[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new EnumC0001b(str2, i2, prayerArr2);
        EnumC0001b[] enumC0001bArr = new EnumC0001b[lIllIIlIIlIll[2]];
        enumC0001bArr[lIllIIlIIlIll[0]] = RIGOUR;
        enumC0001bArr[lIllIIlIIlIll[1]] = EAGLE_EYE;
        $VALUES = enumC0001bArr;
    }
}
