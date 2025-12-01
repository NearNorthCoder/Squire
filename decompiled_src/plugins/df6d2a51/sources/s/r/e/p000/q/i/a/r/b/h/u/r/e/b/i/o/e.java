package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.e  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/e.class */
public final class e {
    private final /* synthetic */ int energyPotion4;
    private static /* synthetic */ int[] lllIIlllIIII;
    public static final /* synthetic */ e ENERGY;
    private final /* synthetic */ int energyPotion1;
    private final /* synthetic */ int energyPotion2;
    private static /* synthetic */ String[] lllIIllIllll;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ e NONE;
    public static final /* synthetic */ e SUPER_ENERGY;
    private final /* synthetic */ int energyPotion3;
    public static final /* synthetic */ e STAMINA;

    private static void lIIIlIlIllIlIll() {
        lllIIllIllll = new String[lllIIlllIIII[0]];
        lllIIllIllll[lllIIlllIIII[1]] = lIIIlIlIllIlIII("CDYhNg==", "Fyosi");
        lllIIllIllll[lllIIlllIIII[2]] = lIIIlIlIllIlIIl("uZrpGCAq0fw=", "okHvK");
        lllIIllIllll[lllIIlllIIII[3]] = lIIIlIlIllIlIlI("a+JRmiQEJ/Cuy7Wb819k5g==", "AKxJF");
        lllIIllIllll[lllIIlllIIII[4]] = lIIIlIlIllIlIIl("phRXXfN5W0c=", "IukkB");
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    private static String lIIIlIlIllIlIlI(String lllllllllllllllIIllIIllllIIlIllI, String lllllllllllllllIIllIIllllIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIlllIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllllIIlIlll) {
            lllllllllllllllIIllIIllllIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIllIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIlIllIllII() {
        lllIIlllIIII = new int[19];
        lllIIlllIIII[0] = 80 ^ 84;
        lllIIlllIIII[1] = (39 ^ 13) & ((47 ^ 5) ^ (-1));
        lllIIlllIIII[2] = " ".length();
        lllIIlllIIII[3] = "  ".length();
        lllIIlllIIII[4] = "   ".length();
        lllIIlllIIII[5] = -" ".length();
        lllIIlllIIII[6] = (-((-29077) & 32703)) & (-133) & 16383;
        lllIIlllIIII[7] = (-549) & 13175;
        lllIIlllIIII[8] = (-11) & 12639;
        lllIIlllIIII[9] = (-((-8543) & 10239)) & (-1) & 14327;
        lllIIlllIIII[10] = (-(150 ^ 181)) & (-1030) & 4079;
        lllIIlllIIII[11] = (-17426) & 20443;
        lllIIlllIIII[12] = (-((-2185) & 19610)) & (-8195) & 28639;
        lllIIlllIIII[13] = (-29697) & 32718;
        lllIIlllIIII[14] = (-24590) & 27597;
        lllIIlllIIII[15] = (-((-17387) & 30719)) & (-16386) & 32727;
        lllIIlllIIII[16] = (-((-19237) & 20271)) & (-28690) & 32735;
        lllIIlllIIII[17] = (-((-805) & 26430)) & (-4097) & 32735;
        lllIIlllIIII[18] = (((56 + 82) - 52) + 78) ^ (((135 + 154) - 134) + 17);
    }

    private static String lIIIlIlIllIlIII(String lllllllllllllllIIllIIllllIIIIllI, String lllllllllllllllIIllIIllllIIIIlIl) {
        String lllllllllllllllIIllIIllllIIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllllIIIIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIllllIIIIlIl.toCharArray();
        int lllllllllllllllIIllIIllllIIIIIlI = lllIIlllIIII[1];
        char[] charArray2 = lllllllllllllllIIllIIllllIIIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lllIIlllIIII[1];
        while (lIIIlIlIllIllIl(i, length)) {
            char lllllllllllllllIIllIIllllIIIIlll = charArray2[i];
            lllllllllllllllIIllIIllllIIIIlII.append((char) (lllllllllllllllIIllIIllllIIIIlll ^ charArray[lllllllllllllllIIllIIllllIIIIIlI % charArray.length]));
            "".length();
            lllllllllllllllIIllIIllllIIIIIlI++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIllllIIIIlII);
    }

    private e(String str, int i, int i2, int i3, int i4, int i5) {
        this.energyPotion4 = i2;
        this.energyPotion3 = i3;
        this.energyPotion2 = i4;
        this.energyPotion1 = i5;
    }

    static {
        lIIIlIlIllIllII();
        lIIIlIlIllIlIll();
        NONE = new e(lllIIllIllll[lllIIlllIIII[1]], lllIIlllIIII[1], lllIIlllIIII[5], lllIIlllIIII[5], lllIIlllIIII[5], lllIIlllIIII[5]);
        STAMINA = new e(lllIIllIllll[lllIIlllIIII[2]], lllIIlllIIII[2], lllIIlllIIII[6], lllIIlllIIII[7], lllIIlllIIII[8], lllIIlllIIII[9]);
        SUPER_ENERGY = new e(lllIIllIllll[lllIIlllIIII[3]], lllIIlllIIII[3], lllIIlllIIII[10], lllIIlllIIII[11], lllIIlllIIII[12], lllIIlllIIII[13]);
        ENERGY = new e(lllIIllIllll[lllIIlllIIII[4]], lllIIlllIIII[4], lllIIlllIIII[14], lllIIlllIIII[15], lllIIlllIIII[16], lllIIlllIIII[17]);
        e[] eVarArr = new e[lllIIlllIIII[0]];
        eVarArr[lllIIlllIIII[1]] = NONE;
        eVarArr[lllIIlllIIII[2]] = STAMINA;
        eVarArr[lllIIlllIIII[3]] = SUPER_ENERGY;
        eVarArr[lllIIlllIIII[4]] = ENERGY;
        $VALUES = eVarArr;
    }

    private static String lIIIlIlIllIlIIl(String lllllllllllllllIIllIIllllIlIIIll, String lllllllllllllllIIllIIllllIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlllIIII[18]), "DES");
            Cipher lllllllllllllllIIllIIllllIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIllllIlIIlIl.init(lllIIlllIIII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIIllllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllllIlIIlII) {
            lllllllllllllllIIllIIllllIlIIlII.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public int[] j() {
        int[] iArr = new int[lllIIlllIIII[0]];
        iArr[lllIIlllIIII[1]] = this.energyPotion4;
        iArr[lllIIlllIIII[2]] = this.energyPotion3;
        iArr[lllIIlllIIII[3]] = this.energyPotion2;
        iArr[lllIIlllIIII[4]] = this.energyPotion1;
        return iArr;
    }
}
