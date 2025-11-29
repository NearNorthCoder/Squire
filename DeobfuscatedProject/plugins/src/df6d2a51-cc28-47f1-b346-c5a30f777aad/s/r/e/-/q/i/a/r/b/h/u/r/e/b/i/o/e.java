/*
 * Decompiled with CFR 0.152.
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    private final /* synthetic */ int energyPotion4;
    private static /* synthetic */ int[] lllIIlllIIII;
    public static final /* synthetic */ /* enum */ e ENERGY;
    private final /* synthetic */ int energyPotion1;
    private final /* synthetic */ int energyPotion2;
    private static /* synthetic */ String[] lllIIllIllll;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e NONE;
    public static final /* synthetic */ /* enum */ e SUPER_ENERGY;
    private final /* synthetic */ int energyPotion3;
    public static final /* synthetic */ /* enum */ e STAMINA;

    private static void lIIIlIlIllIlIll() {
        lllIIllIllll = new String[lllIIlllIIII[0]];
        e.lllIIllIllll[e.lllIIlllIIII[1]] = e.lIIIlIlIllIlIII("CDYhNg==", "Fyosi");
        e.lllIIllIllll[e.lllIIlllIIII[2]] = e.lIIIlIlIllIlIIl("uZrpGCAq0fw=", "okHvK");
        e.lllIIllIllll[e.lllIIlllIIII[3]] = e.lIIIlIlIllIlIlI("a+JRmiQEJ/Cuy7Wb819k5g==", "AKxJF");
        e.lllIIllIllll[e.lllIIlllIIII[4]] = e.lIIIlIlIllIlIIl("phRXXfN5W0c=", "IukkB");
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lIIIlIlIllIlIlI(String lllllllllllllllIIllIIllllIIlIlII, String lllllllllllllllIIllIIllllIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllllIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllllIIllIII.init(lllIIlllIIII[3], lllllllllllllllIIllIIllllIIllIIl);
            return new String(lllllllllllllllIIllIIllllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIllllIIlIlll) {
            lllllllllllllllIIllIIllllIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIlIllIllII() {
        lllIIlllIIII = new int[19];
        e.lllIIlllIIII[0] = 0x50 ^ 0x54;
        e.lllIIlllIIII[1] = (0x27 ^ 0xD) & ~(0x2F ^ 5);
        e.lllIIlllIIII[2] = " ".length();
        e.lllIIlllIIII[3] = "  ".length();
        e.lllIIlllIIII[4] = "   ".length();
        e.lllIIlllIIII[5] = -" ".length();
        e.lllIIlllIIII[6] = -(0xFFFF8E6B & 0x7FBF) & (0xFFFFFF7B & 0x3FFF);
        e.lllIIlllIIII[7] = 0xFFFFFDDB & 0x3377;
        e.lllIIlllIIII[8] = 0xFFFFFFF5 & 0x315F;
        e.lllIIlllIIII[9] = -(0xFFFFDEA1 & 0x27FF) & (0xFFFFFFFF & 0x37F7);
        e.lllIIlllIIII[10] = -(0x96 ^ 0xB5) & (0xFFFFFBFA & 0xFEF);
        e.lllIIlllIIII[11] = 0xFFFFBBEE & 0x4FDB;
        e.lllIIlllIIII[12] = -(0xFFFFF777 & 0x4C9A) & (0xFFFFDFFD & 0x6FDF);
        e.lllIIlllIIII[13] = 0xFFFF8BFF & 0x7FCE;
        e.lllIIlllIIII[14] = 0xFFFF9FF2 & 0x6BCD;
        e.lllIIlllIIII[15] = -(0xFFFFBC15 & 0x77FF) & (0xFFFFBFFE & 0x7FD7);
        e.lllIIlllIIII[16] = -(0xFFFFB4DB & 0x4F2F) & (0xFFFF8FEE & 0x7FDF);
        e.lllIIlllIIII[17] = -(0xFFFFFCDB & 0x673E) & (0xFFFFEFFF & 0x7FDF);
        e.lllIIlllIIII[18] = 56 + 82 - 52 + 78 ^ 135 + 154 - 134 + 17;
    }

    private static String lIIIlIlIllIlIII(String lllllllllllllllIIllIIllllIIIIIIl, String lllllllllllllllIIllIIllllIIIIlIl) {
        lllllllllllllllIIllIIllllIIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllllIIIIlII = new StringBuilder();
        char[] lllllllllllllllIIllIIllllIIIIIll = lllllllllllllllIIllIIllllIIIIlIl.toCharArray();
        int lllllllllllllllIIllIIllllIIIIIlI = lllIIlllIIII[1];
        char[] lllllllllllllllIIllIIlllIlllllII = lllllllllllllllIIllIIllllIIIIIIl.toCharArray();
        int lllllllllllllllIIllIIlllIllllIll = lllllllllllllllIIllIIlllIlllllII.length;
        int lllllllllllllllIIllIIlllIllllIlI = lllIIlllIIII[1];
        while (e.lIIIlIlIllIllIl(lllllllllllllllIIllIIlllIllllIlI, lllllllllllllllIIllIIlllIllllIll)) {
            char lllllllllllllllIIllIIllllIIIIlll = lllllllllllllllIIllIIlllIlllllII[lllllllllllllllIIllIIlllIllllIlI];
            lllllllllllllllIIllIIllllIIIIlII.append((char)(lllllllllllllllIIllIIllllIIIIlll ^ lllllllllllllllIIllIIllllIIIIIll[lllllllllllllllIIllIIllllIIIIIlI % lllllllllllllllIIllIIllllIIIIIll.length]));
            "".length();
            ++lllllllllllllllIIllIIllllIIIIIlI;
            ++lllllllllllllllIIllIIlllIllllIlI;
            "".length();
            if (" ".length() == " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIllllIIIIlII);
    }

    private e(int n3, int n4, int n5, int n6) {
        this.energyPotion4 = n3;
        this.energyPotion3 = n4;
        this.energyPotion2 = n5;
        this.energyPotion1 = n6;
    }

    static {
        e.lIIIlIlIllIllII();
        e.lIIIlIlIllIlIll();
        NONE = new e(lllIIlllIIII[5], lllIIlllIIII[5], lllIIlllIIII[5], lllIIlllIIII[5]);
        STAMINA = new e(lllIIlllIIII[6], lllIIlllIIII[7], lllIIlllIIII[8], lllIIlllIIII[9]);
        SUPER_ENERGY = new e(lllIIlllIIII[10], lllIIlllIIII[11], lllIIlllIIII[12], lllIIlllIIII[13]);
        ENERGY = new e(lllIIlllIIII[14], lllIIlllIIII[15], lllIIlllIIII[16], lllIIlllIIII[17]);
        e[] eArray = new e[lllIIlllIIII[0]];
        eArray[e.lllIIlllIIII[1]] = NONE;
        eArray[e.lllIIlllIIII[2]] = STAMINA;
        eArray[e.lllIIlllIIII[3]] = SUPER_ENERGY;
        eArray[e.lllIIlllIIII[4]] = ENERGY;
        $VALUES = eArray;
    }

    private static String lIIIlIlIllIlIIl(String lllllllllllllllIIllIIllllIlIIIIl, String lllllllllllllllIIllIIllllIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlllIIII[18]), "DES");
            Cipher lllllllllllllllIIllIIllllIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIllllIlIIlIl.init(lllIIlllIIII[3], lllllllllllllllIIllIIllllIlIIllI);
            return new String(lllllllllllllllIIllIIllllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIllllIlIIlII) {
            lllllllllllllllIIllIIllllIlIIlII.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public int[] j() {
        int[] nArray = new int[lllIIlllIIII[0]];
        nArray[e.lllIIlllIIII[1]] = this.energyPotion4;
        nArray[e.lllIIlllIIII[2]] = this.energyPotion3;
        nArray[e.lllIIlllIIII[3]] = this.energyPotion2;
        nArray[e.lllIIlllIIII[4]] = this.energyPotion1;
        return nArray;
    }
}

