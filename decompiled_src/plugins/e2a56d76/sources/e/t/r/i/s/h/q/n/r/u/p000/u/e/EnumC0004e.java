package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.e  reason: invalid package and case insensitive filesystem */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/e.class */
public final class EnumC0004e {
    public static final /* synthetic */ EnumC0004e PITFALL;
    public static final /* synthetic */ EnumC0004e BIRDS;
    private static final /* synthetic */ EnumC0004e[] $VALUES;
    private static /* synthetic */ String[] lllIllIlIllI;
    public static final /* synthetic */ EnumC0004e FALCONRY;
    private static /* synthetic */ int[] lllIllIlIlll;
    public static final /* synthetic */ EnumC0004e SALLIES;
    public static final /* synthetic */ EnumC0004e CHINS;

    static {
        lIIIllIlIllIlll();
        lIIIllIlIllIllI();
        BIRDS = new EnumC0004e(lllIllIlIllI[lllIllIlIlll[0]], lllIllIlIlll[0]);
        SALLIES = new EnumC0004e(lllIllIlIllI[lllIllIlIlll[1]], lllIllIlIlll[1]);
        FALCONRY = new EnumC0004e(lllIllIlIllI[lllIllIlIlll[2]], lllIllIlIlll[2]);
        CHINS = new EnumC0004e(lllIllIlIllI[lllIllIlIlll[3]], lllIllIlIlll[3]);
        PITFALL = new EnumC0004e(lllIllIlIllI[lllIllIlIlll[4]], lllIllIlIlll[4]);
        EnumC0004e[] enumC0004eArr = new EnumC0004e[lllIllIlIlll[5]];
        enumC0004eArr[lllIllIlIlll[0]] = BIRDS;
        enumC0004eArr[lllIllIlIlll[1]] = SALLIES;
        enumC0004eArr[lllIllIlIlll[2]] = FALCONRY;
        enumC0004eArr[lllIllIlIlll[3]] = CHINS;
        enumC0004eArr[lllIllIlIlll[4]] = PITFALL;
        $VALUES = enumC0004eArr;
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }

    private static String lIIIllIlIllIlII(String lllllllllllllllIIlIlllIllllIIIlI, String lllllllllllllllIIlIlllIllllIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIllllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIllllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIllllIIlII.init(lllIllIlIlll[2], lllllllllllllllIIlIlllIllllIIlIl);
            return new String(lllllllllllllllIIlIlllIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIllllIIIll) {
            lllllllllllllllIIlIlllIllllIIIll.printStackTrace();
            return null;
        }
    }

    private EnumC0004e(String str, int i) {
    }

    private static String lIIIllIlIllIlIl(String lllllllllllllllIIlIlllIlllIlIlIl, String lllllllllllllllIIlIlllIlllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlllIlIlII.getBytes(StandardCharsets.UTF_8)), lllIllIlIlll[6]), "DES");
            Cipher lllllllllllllllIIlIlllIlllIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIlllIlIlll.init(lllIllIlIlll[2], secretKeySpec);
            return new String(lllllllllllllllIIlIlllIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlllIlIllI) {
            lllllllllllllllIIlIlllIlllIlIllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    private static void lIIIllIlIllIllI() {
        lllIllIlIllI = new String[lllIllIlIlll[5]];
        lllIllIlIllI[lllIllIlIlll[0]] = lIIIllIlIllIlII("9bZtsK3czP8=", "CeFXL");
        lllIllIlIllI[lllIllIlIlll[1]] = lIIIllIlIllIlIl("xdm6CI7/y6k=", "eHTYf");
        lllIllIlIllI[lllIllIlIlll[2]] = lIIIllIlIllIlII("sYTJXMjUvANGTF98lmt3Dg==", "tGSTa");
        lllIllIlIllI[lllIllIlIlll[3]] = lIIIllIlIllIlII("SbtCpbUJp4M=", "hFMHE");
        lllIllIlIllI[lllIllIlIlll[4]] = lIIIllIlIllIlIl("uvP9zISdBO0=", "GPZfv");
    }

    private static void lIIIllIlIllIlll() {
        lllIllIlIlll = new int[7];
        lllIllIlIlll[0] = (55 ^ 3) & ((23 ^ 35) ^ (-1));
        lllIllIlIlll[1] = " ".length();
        lllIllIlIlll[2] = "  ".length();
        lllIllIlIlll[3] = "   ".length();
        lllIllIlIlll[4] = 55 ^ 51;
        lllIllIlIlll[5] = 18 ^ 23;
        lllIllIlIlll[6] = (212 ^ 149) ^ (234 ^ 163);
    }
}
