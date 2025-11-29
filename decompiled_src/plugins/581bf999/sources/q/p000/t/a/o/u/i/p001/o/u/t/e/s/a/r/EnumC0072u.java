package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/u.class */
public final class EnumC0072u {
    private static final /* synthetic */ EnumC0072u[] $VALUES;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ int[] llIlIIIlIlI;
    public static final /* synthetic */ EnumC0072u ULTIMATE_STRENGTH;
    private static /* synthetic */ String[] llIlIIIlIIl;
    public static final /* synthetic */ EnumC0072u CHIVALRY;
    public static final /* synthetic */ EnumC0072u PIETY;

    static {
        lIlIIlIIlllllI();
        lIlIIlIIllllIl();
        PIETY = new EnumC0072u(llIlIIIlIIl[llIlIIIlIlI[0]], llIlIIIlIlI[0], Prayer.PIETY);
        CHIVALRY = new EnumC0072u(llIlIIIlIIl[llIlIIIlIlI[1]], llIlIIIlIlI[1], Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new EnumC0072u(llIlIIIlIIl[llIlIIIlIlI[2]], llIlIIIlIlI[2], Prayer.ULTIMATE_STRENGTH);
        EnumC0072u[] enumC0072uArr = new EnumC0072u[llIlIIIlIlI[3]];
        enumC0072uArr[llIlIIIlIlI[0]] = PIETY;
        enumC0072uArr[llIlIIIlIlI[1]] = CHIVALRY;
        enumC0072uArr[llIlIIIlIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = enumC0072uArr;
    }

    private EnumC0072u(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void lIlIIlIIlllllI() {
        llIlIIIlIlI = new int[4];
        llIlIIIlIlI[0] = ((((10 + 88) - 42) + 127) ^ (((126 + 19) - 127) + 118)) & (((75 ^ 64) ^ (116 ^ 64)) ^ (-" ".length()));
        llIlIIIlIlI[1] = " ".length();
        llIlIIIlIlI[2] = "  ".length();
        llIlIIIlIlI[3] = "   ".length();
    }

    public static EnumC0072u[] values() {
        return (EnumC0072u[]) $VALUES.clone();
    }

    private static String lIlIIlIIlllIll(String llllllllllllllllIIllIllllIIIIIll, String llllllllllllllllIIllIllllIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIllIllllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllllIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllllIIIIlIl.init(llIlIIIlIlI[2], llllllllllllllllIIllIllllIIIIllI);
            return new String(llllllllllllllllIIllIllllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIllllIIIIlII) {
            llllllllllllllllIIllIllllIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIllllll(int i, int i2) {
        return i < i2;
    }

    public static EnumC0072u valueOf(String str) {
        return (EnumC0072u) Enum.valueOf(EnumC0072u.class, str);
    }

    private static void lIlIIlIIllllIl() {
        llIlIIIlIIl = new String[llIlIIIlIlI[3]];
        llIlIIIlIIl[llIlIIIlIlI[0]] = lIlIIlIIlllIll("Cus6eajwO2s=", "nWANb");
        llIlIIIlIIl[llIlIIIlIlI[1]] = lIlIIlIIllllII("BgEiFTQJGzI=", "EIkCu");
        llIlIIIlIIl[llIlIIIlIlI[2]] = lIlIIlIIllllII("AyQ8Az8XPC0VIQI6LQQ1AiA=", "VhhJr");
    }

    private static String lIlIIlIIllllII(String llllllllllllllllIIllIlllIlllIIll, String llllllllllllllllIIllIlllIlllIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlllIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlllIlllIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIllIlllIlllIIlI.toCharArray();
        int llllllllllllllllIIllIlllIllIllll = llIlIIIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllIIllIlllIllIlIII = charArray2.length;
        int i = llIlIIIlIlI[0];
        while (lIlIIlIIllllll(i, llllllllllllllllIIllIlllIllIlIII)) {
            char llllllllllllllllIIllIlllIlllIlII = charArray2[i];
            llllllllllllllllIIllIlllIlllIIIl.append((char) (llllllllllllllllIIllIlllIlllIlII ^ charArray[llllllllllllllllIIllIlllIllIllll % charArray.length]));
            "".length();
            llllllllllllllllIIllIlllIllIllll++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIllIlllIlllIIIl);
    }
}
