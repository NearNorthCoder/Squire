package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/i.class */
public final class EnumC0008i {
    private static /* synthetic */ String[] lIIlIIllIlIIl;
    public static final /* synthetic */ EnumC0008i RIGOUR;
    private static /* synthetic */ int[] lIIlIIllIlIll;
    private static final /* synthetic */ EnumC0008i[] $VALUES;
    public static final /* synthetic */ EnumC0008i EAGLE_EYE;
    private final /* synthetic */ Prayer[] prayers;

    private static String lIlIlIlIIlIIlIl(String llllllllllllllIlllllIIllllIlllll, String llllllllllllllIlllllIIllllIlllIl) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIllIlIll[2], llllllllllllllIlllllIIlllllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlllllIIIII) {
            llllllllllllllIlllllIIlllllIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIIlIIlII(String llllllllllllllIlllllIIllllllIlII, String llllllllllllllIlllllIIllllllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllllllIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIllIlIll[3]), "DES");
            Cipher llllllllllllllIlllllIIllllllIlll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIllllllIlll.init(lIIlIIllIlIll[2], secretKeySpec);
            return new String(llllllllllllllIlllllIIllllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIllllllIllI) {
            llllllllllllllIlllllIIllllllIllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    public Prayer[] z() {
        return this.prayers;
    }

    static {
        lIlIlIlIIllIIIl();
        lIlIlIlIIlIIlll();
        String str = lIIlIIllIlIIl[lIIlIIllIlIll[0]];
        int i = lIIlIIllIlIll[0];
        Prayer[] prayerArr = new Prayer[lIIlIIllIlIll[1]];
        prayerArr[lIIlIIllIlIll[0]] = Prayer.RIGOUR;
        RIGOUR = new EnumC0008i(str, i, prayerArr);
        String str2 = lIIlIIllIlIIl[lIIlIIllIlIll[1]];
        int i2 = lIIlIIllIlIll[1];
        Prayer[] prayerArr2 = new Prayer[lIIlIIllIlIll[2]];
        prayerArr2[lIIlIIllIlIll[0]] = Prayer.EAGLE_EYE;
        prayerArr2[lIIlIIllIlIll[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new EnumC0008i(str2, i2, prayerArr2);
        EnumC0008i[] enumC0008iArr = new EnumC0008i[lIIlIIllIlIll[2]];
        enumC0008iArr[lIIlIIllIlIll[0]] = RIGOUR;
        enumC0008iArr[lIIlIIllIlIll[1]] = EAGLE_EYE;
        $VALUES = enumC0008iArr;
    }

    private static void lIlIlIlIIlIIlll() {
        lIIlIIllIlIIl = new String[lIIlIIllIlIll[2]];
        lIIlIIllIlIIl[lIIlIIllIlIll[0]] = lIlIlIlIIlIIlII("3Svf7W1Fnp0=", "pcfnA");
        lIIlIIllIlIIl[lIIlIIllIlIll[1]] = lIlIlIlIIlIIlIl("xWKiqzDkasmZ2ODbUMRJGw==", "WweJg");
    }

    private static void lIlIlIlIIllIIIl() {
        lIIlIIllIlIll = new int[4];
        lIIlIIllIlIll[0] = ((((44 + 138) - 169) + 155) ^ (((110 + 27) - 130) + 144)) & (((6 ^ 18) ^ (79 ^ 100)) ^ (-" ".length()));
        lIIlIIllIlIll[1] = " ".length();
        lIIlIIllIlIll[2] = "  ".length();
        lIIlIIllIlIll[3] = 42 ^ 34;
    }

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }

    private EnumC0008i(String str, int i, Prayer... prayerArr) {
        this.prayers = prayerArr;
    }
}
