package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.e  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/e.class */
public final class e {
    public static final /* synthetic */ e CHIVALRY;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ e PIETY;
    private static /* synthetic */ String[] llIIlIlllIIl;
    private static final /* synthetic */ e[] $VALUES;
    private static /* synthetic */ int[] llIIlIlllIlI;
    public static final /* synthetic */ e ULTIMATE_STRENGTH;

    public Prayer C() {
        return this.mapped;
    }

    private static void lllllIlllIIllI() {
        llIIlIlllIIl = new String[llIIlIlllIlI[3]];
        llIIlIlllIIl[llIIlIlllIlI[0]] = lllllIlllIIlII("r+9wxTj63MI=", "GEViP");
        llIIlIlllIIl[llIIlIlllIlI[1]] = lllllIlllIIlIl("LBwvGQYjBj8=", "oTfOG");
        llIIlIlllIIl[llIIlIlllIlI[2]] = lllllIlllIIlII("XFkXXCVAVkfBKN6qB2OvHMrvv4PddBjj", "eVoZF");
    }

    private static void lllllIlllIIlll() {
        llIIlIlllIlI = new int[4];
        llIIlIlllIlI[0] = (128 ^ 161) & ((10 ^ 43) ^ (-1));
        llIIlIlllIlI[1] = " ".length();
        llIIlIlllIlI[2] = "  ".length();
        llIIlIlllIlI[3] = "   ".length();
    }

    static {
        lllllIlllIIlll();
        lllllIlllIIllI();
        PIETY = new e(llIIlIlllIIl[llIIlIlllIlI[0]], llIIlIlllIlI[0], Prayer.PIETY);
        CHIVALRY = new e(llIIlIlllIIl[llIIlIlllIlI[1]], llIIlIlllIlI[1], Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new e(llIIlIlllIIl[llIIlIlllIlI[2]], llIIlIlllIlI[2], Prayer.ULTIMATE_STRENGTH);
        e[] eVarArr = new e[llIIlIlllIlI[3]];
        eVarArr[llIIlIlllIlI[0]] = PIETY;
        eVarArr[llIIlIlllIlI[1]] = CHIVALRY;
        eVarArr[llIIlIlllIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = eVarArr;
    }

    private e(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lllllIlllIlIII(int i, int i2) {
        return i < i2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    private static String lllllIlllIIlII(String lllllllllllllllIlIIlllIlIlIllIIl, String lllllllllllllllIlIIlllIlIlIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIlIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIlIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIlIlIllIll.init(llIIlIlllIlI[2], secretKeySpec);
            return new String(lllllllllllllllIlIIlllIlIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIlIlIllIlI) {
            lllllllllllllllIlIIlllIlIlIllIlI.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    private static String lllllIlllIIlIl(String lllllllllllllllIlIIlllIlIllIlllI, String lllllllllllllllIlIIlllIlIllIllIl) {
        String lllllllllllllllIlIIlllIlIllIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIlIllIllII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlllIlIllIllIl.toCharArray();
        int lllllllllllllllIlIIlllIlIllIlIlI = llIIlIlllIlI[0];
        char[] charArray2 = lllllllllllllllIlIIlllIlIllIlllI2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlllIlI[0];
        while (lllllIlllIlIII(i, length)) {
            lllllllllllllllIlIIlllIlIllIllII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlllIlIllIlIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIIlllIlIllIlIlI++;
            i++;
            "".length();
            if ((((161 ^ 169) ^ (186 ^ 165)) & (((38 ^ 6) ^ (8 ^ 63)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlllIlIllIllII);
    }
}
