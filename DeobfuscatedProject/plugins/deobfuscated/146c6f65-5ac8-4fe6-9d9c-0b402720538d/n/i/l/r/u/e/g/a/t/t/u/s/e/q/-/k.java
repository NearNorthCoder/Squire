/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class k
extends Enum<k> {
    public static final /* synthetic */ /* enum */ k NONE;
    public static final /* synthetic */ /* enum */ k RIGOUR;
    public static final /* synthetic */ /* enum */ k CHIVALRY;
    private final /* synthetic */ Prayer mapping;
    public static final /* synthetic */ /* enum */ k MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ k ULTIMATE_STRENGTH;
    private static /* synthetic */ int[] llIIllllIIIl;
    public static final /* synthetic */ /* enum */ k PIETY;
    public static final /* synthetic */ /* enum */ k EAGLE_EYE;
    private static final /* synthetic */ k[] $VALUES;
    public static final /* synthetic */ /* enum */ k AUGURY;
    private static /* synthetic */ String[] llIIllllIIII;

    private static void lIIIIIIIIIIlIII() {
        llIIllllIIII = new String[llIIllllIIIl[8]];
        k.llIIllllIIII[k.llIIllllIIIl[0]] = k."AUGURY";
        k.llIIllllIIII[k.llIIllllIIIl[1]] = k."MYSTIC_MIGHT";
        k.llIIllllIIII[k.llIIllllIIIl[2]] = k."RIGOUR";
        k.llIIllllIIII[k.llIIllllIIIl[3]] = k."EAGLE_EYE";
        k.llIIllllIIII[k.llIIllllIIIl[4]] = k."PIETY";
        k.llIIllllIIII[k.llIIllllIIIl[5]] = k."CHIVALRY";
        k.llIIllllIIII[k.llIIllllIIIl[6]] = k."ULTIMATE_STRENGTH";
        k.llIIllllIIII[k.llIIllllIIIl[7]] = k."NONE";
    }

    public Prayer aL() {
        return this.mapping;
    }

    private static String lIIIIIIIIIIIlll(String lllllllllllllllIlIIlIIIIlIIlIIll, String lllllllllllllllIlIIlIIIIlIIlIIlI) {
        lllllllllllllllIlIIlIIIIlIIlIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIIIlIIlIIIl = new StringBuilder();
        char[] lllllllllllllllIlIIlIIIIlIIlIIII = lllllllllllllllIlIIlIIIIlIIlIIlI.toCharArray();
        int lllllllllllllllIlIIlIIIIlIIIllll = llIIllllIIIl[0];
        char[] lllllllllllllllIlIIlIIIIlIIIlIIl = lllllllllllllllIlIIlIIIIlIIlIIll.toCharArray();
        int lllllllllllllllIlIIlIIIIlIIIlIII = lllllllllllllllIlIIlIIIIlIIIlIIl.length;
        int lllllllllllllllIlIIlIIIIlIIIIlll = llIIllllIIIl[0];
        while (k.lIIIIIIIIIIlIlI(lllllllllllllllIlIIlIIIIlIIIIlll, lllllllllllllllIlIIlIIIIlIIIlIII)) {
            char lllllllllllllllIlIIlIIIIlIIlIlII = lllllllllllllllIlIIlIIIIlIIIlIIl[lllllllllllllllIlIIlIIIIlIIIIlll];
            lllllllllllllllIlIIlIIIIlIIlIIIl.append((char)(lllllllllllllllIlIIlIIIIlIIlIlII ^ lllllllllllllllIlIIlIIIIlIIlIIII[lllllllllllllllIlIIlIIIIlIIIllll % lllllllllllllllIlIIlIIIIlIIlIIII.length]));
            0;
            ++lllllllllllllllIlIIlIIIIlIIIllll;
            ++lllllllllllllllIlIIlIIIIlIIIIlll;
            0;
            if ((0xAF ^ 0xAA) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIIIIlIIlIIIl);
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static String lIIIIIIIIIIIlIl(String lllllllllllllllIlIIlIIIIlIllIIII, String lllllllllllllllIlIIlIIIIlIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), llIIllllIIIl[8]), "DES");
            Cipher lllllllllllllllIlIIlIIIIlIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIIIIlIllIIlI.init(llIIllllIIIl[2], lllllllllllllllIlIIlIIIIlIllIIll);
            return new String(lllllllllllllllIlIIlIIIIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIIIlIllIIIl) {
            lllllllllllllllIlIIlIIIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIIIIIIllI(String lllllllllllllllIlIIlIIIIlIlIIIll, String lllllllllllllllIlIIlIIIIlIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIIlIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIIIlIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIIIlIlIIlIl.init(llIIllllIIIl[2], lllllllllllllllIlIIlIIIIlIlIIllI);
            return new String(lllllllllllllllIlIIlIIIIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIIIlIlIIlII) {
            lllllllllllllllIlIIlIIIIlIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIIIIIIlIIl() {
        llIIllllIIIl = new int[9];
        k.llIIllllIIIl[0] = (135 + 37 - 40 + 7 ^ 70 + 78 - 39 + 69) & (141 + 85 - 176 + 117 ^ 34 + 33 - 14 + 105 ^ -1);
        k.llIIllllIIIl[1] = 1;
        k.llIIllllIIIl[2] = 2;
        k.llIIllllIIIl[3] = 3;
        k.llIIllllIIIl[4] = 0x99 ^ 0x9D;
        k.llIIllllIIIl[5] = 0xEE ^ 0xC4 ^ (0x48 ^ 0x67);
        k.llIIllllIIIl[6] = 0xB3 ^ 0xB5;
        k.llIIllllIIIl[7] = 0x53 ^ 0x40 ^ (0x6C ^ 0x78);
        k.llIIllllIIIl[8] = 19 + 153 - 156 + 186 ^ 184 + 116 - 273 + 167;
    }

    static {
        k.lIIIIIIIIIIlIIl();
        k.lIIIIIIIIIIlIII();
        AUGURY = new k(Prayer.AUGURY);
        MYSTIC_MIGHT = new k(Prayer.MYSTIC_MIGHT);
        RIGOUR = new k(Prayer.RIGOUR);
        EAGLE_EYE = new k(Prayer.EAGLE_EYE);
        PIETY = new k(Prayer.PIETY);
        CHIVALRY = new k(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new k(Prayer.ULTIMATE_STRENGTH);
        NONE = new k(null);
        k[] kArray = new k[llIIllllIIIl[8]];
        kArray[k.llIIllllIIIl[0]] = AUGURY;
        kArray[k.llIIllllIIIl[1]] = MYSTIC_MIGHT;
        kArray[k.llIIllllIIIl[2]] = RIGOUR;
        kArray[k.llIIllllIIIl[3]] = EAGLE_EYE;
        kArray[k.llIIllllIIIl[4]] = PIETY;
        kArray[k.llIIllllIIIl[5]] = CHIVALRY;
        kArray[k.llIIllllIIIl[6]] = ULTIMATE_STRENGTH;
        kArray[k.llIIllllIIIl[7]] = NONE;
        $VALUES = kArray;
    }

    private k(Prayer prayer) {
        this.mapping = prayer;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }
}

