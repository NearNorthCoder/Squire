package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bi  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bi.class */
public final class EnumC0036bi {
    private static final /* synthetic */ EnumC0036bi[] $VALUES;
    private static /* synthetic */ String[] llIIIIIllll;
    public static final /* synthetic */ EnumC0036bi SWARM;
    public static final /* synthetic */ EnumC0036bi ATTACK;
    public static final /* synthetic */ EnumC0036bi MAGE;
    private static /* synthetic */ int[] llIIIIlIlII;

    private static String lIIlllIlIIIIlI(String llllllllllllllllIlIIIllIlIIIIlII, String llllllllllllllllIlIIIllIlIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), llIIIIlIlII[4]), "DES");
            Cipher llllllllllllllllIlIIIllIlIIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIlIIIllIlIIIIllI.init(llIIIIlIlII[2], secretKeySpec);
            return new String(llllllllllllllllIlIIIllIlIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIllIlIIIIlIl) {
            llllllllllllllllIlIIIllIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIlIIlI(int i, int i2) {
        return i < i2;
    }

    private EnumC0036bi(String str, int i) {
    }

    private static String lIIlllIlIIIIII(String llllllllllllllllIlIIIllIlIlIlIIl, String llllllllllllllllIlIIIllIlIlIlIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIllIlIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIllIlIlIlIll.init(llIIIIlIlII[2], llllllllllllllllIlIIIllIlIlIllII);
            return new String(llllllllllllllllIlIIIllIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIllIlIlIlIlI) {
            llllllllllllllllIlIIIllIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    public static EnumC0036bi[] values() {
        return (EnumC0036bi[]) $VALUES.clone();
    }

    static {
        lIIlllIlIlIIIl();
        lIIlllIlIIIlIl();
        ATTACK = new EnumC0036bi(llIIIIIllll[llIIIIlIlII[0]], llIIIIlIlII[0]);
        SWARM = new EnumC0036bi(llIIIIIllll[llIIIIlIlII[1]], llIIIIlIlII[1]);
        MAGE = new EnumC0036bi(llIIIIIllll[llIIIIlIlII[2]], llIIIIlIlII[2]);
        EnumC0036bi[] enumC0036biArr = new EnumC0036bi[llIIIIlIlII[3]];
        enumC0036biArr[llIIIIlIlII[0]] = ATTACK;
        enumC0036biArr[llIIIIlIlII[1]] = SWARM;
        enumC0036biArr[llIIIIlIlII[2]] = MAGE;
        $VALUES = enumC0036biArr;
    }

    private static String lIIlllIlIIIIIl(String llllllllllllllllIlIIIllIlIIllIIl, String llllllllllllllllIlIIIllIlIIllIII) {
        String llllllllllllllllIlIIIllIlIIllIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIllIlIIlIlll = new StringBuilder();
        char[] llllllllllllllllIlIIIllIlIIlIllI = llllllllllllllllIlIIIllIlIIllIII.toCharArray();
        int llllllllllllllllIlIIIllIlIIlIIII = llIIIIlIlII[0];
        char[] charArray = llllllllllllllllIlIIIllIlIIllIIl2.toCharArray();
        int length = charArray.length;
        int i = llIIIIlIlII[0];
        while (lIIlllIlIlIIlI(i, length)) {
            llllllllllllllllIlIIIllIlIIlIlll.append((char) (charArray[i] ^ llllllllllllllllIlIIIllIlIIlIllI[llllllllllllllllIlIIIllIlIIlIIII % llllllllllllllllIlIIIllIlIIlIllI.length]));
            "".length();
            llllllllllllllllIlIIIllIlIIlIIII++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIIllIlIIlIlll);
    }

    private static void lIIlllIlIIIlIl() {
        llIIIIIllll = new String[llIIIIlIlII[3]];
        llIIIIIllll[llIIIIlIlII[0]] = lIIlllIlIIIIII("vITJRIrYv+I=", "FPrxz");
        llIIIIIllll[llIIIIlIlII[1]] = lIIlllIlIIIIIl("Kj4zOyI=", "yirio");
        llIIIIIllll[llIIIIlIlII[2]] = lIIlllIlIIIIlI("6n7akkCrSCI=", "LcXYi");
    }

    private static void lIIlllIlIlIIIl() {
        llIIIIlIlII = new int[5];
        llIIIIlIlII[0] = ((26 ^ 122) ^ (1 ^ 94)) & (((57 ^ 88) ^ (226 ^ 188)) ^ (-" ".length()));
        llIIIIlIlII[1] = " ".length();
        llIIIIlIlII[2] = "  ".length();
        llIIIIlIlII[3] = "   ".length();
        llIIIIlIlII[4] = (51 ^ 78) ^ (181 ^ 192);
    }

    public static EnumC0036bi valueOf(String str) {
        return (EnumC0036bi) Enum.valueOf(EnumC0036bi.class, str);
    }
}
