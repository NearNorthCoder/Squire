/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class DEnum
extends Enum<D> {
    private final /* synthetic */ String log;
    private final /* synthetic */ String tree;
    public static final /* synthetic */ /* enum */ D YEW;
    public static final /* synthetic */ /* enum */ D NORMAL;
    private static final /* synthetic */ D[] $VALUES;
    public static final /* synthetic */ /* enum */ D OAK;
    private static /* synthetic */ String[] llIllIIII;
    private static /* synthetic */ int[] llIllIIIl;
    public static final /* synthetic */ /* enum */ D TEAK;
    public static final /* synthetic */ /* enum */ D MAPLE;
    public static final /* synthetic */ /* enum */ D WILLOW;

    public String Y() {
        return this.log;
    }

    public String Z() {
        return this.tree;
    }

    public static D[] values() {
        return (D[])$VALUES.clone();
    }

    private static void lIllllIlIII() {
        llIllIIIl = new int[19];
        D.llIllIIIl[0] = 3 & ~3;
        D.llIllIIIl[1] = 1;
        D.llIllIIIl[2] = 2;
        D.llIllIIIl[3] = 3;
        D.llIllIIIl[4] = 0xA ^ 0xE;
        D.llIllIIIl[5] = 0x52 ^ 0x67 ^ (0xB8 ^ 0x88);
        D.llIllIIIl[6] = 0x1B ^ 0x1D;
        D.llIllIIIl[7] = 0x4D ^ 0x4A;
        D.llIllIIIl[8] = 0x37 ^ 0x3F;
        D.llIllIIIl[9] = 0x65 ^ 0x6C;
        D.llIllIIIl[10] = 1 ^ 0x76 ^ (7 ^ 0x7A);
        D.llIllIIIl[11] = 2 + 143 - 16 + 17 ^ 34 + 28 - -91 + 0;
        D.llIllIIIl[12] = 0xC ^ 0;
        D.llIllIIIl[13] = 0x61 ^ 0x21 ^ (0x17 ^ 0x5A);
        D.llIllIIIl[14] = 0xE2 ^ 0x8F ^ (0xFD ^ 0x9E);
        D.llIllIIIl[15] = 0xAE ^ 0xBD ^ (0x92 ^ 0x8E);
        D.llIllIIIl[16] = 0x40 ^ 0x50;
        D.llIllIIIl[17] = 0xAA ^ 0xBB;
        D.llIllIIIl[18] = 9 + 119 - -2 + 4 ^ 4 + 55 - -88 + 1;
    }

    private static void lIllllIIlll() {
        llIllIIII = new String[llIllIIIl[18]];
        D.llIllIIII[D.llIllIIIl[0]] = D."NORMAL";
        D.llIllIIII[D.llIllIIIl[1]] = D."Tree";
        D.llIllIIII[D.llIllIIIl[2]] = D."Logs";
        D.llIllIIII[D.llIllIIIl[3]] = D."OAK";
        D.llIllIIII[D.llIllIIIl[4]] = D."Oak tree";
        D.llIllIIII[D.llIllIIIl[5]] = D."Oak logs";
        D.llIllIIII[D.llIllIIIl[6]] = D."WILLOW";
        D.llIllIIII[D.llIllIIIl[7]] = D."Willow tree";
        D.llIllIIII[D.llIllIIIl[8]] = D."Willow logs";
        D.llIllIIII[D.llIllIIIl[9]] = D."MAPLE";
        D.llIllIIII[D.llIllIIIl[10]] = D."Maple tree";
        D.llIllIIII[D.llIllIIIl[11]] = D."Maple logs";
        D.llIllIIII[D.llIllIIIl[12]] = D."TEAK";
        D.llIllIIII[D.llIllIIIl[13]] = D."Teak tree";
        D.llIllIIII[D.llIllIIIl[14]] = D."Teak logs";
        D.llIllIIII[D.llIllIIIl[15]] = D."YEW";
        D.llIllIIII[D.llIllIIIl[16]] = D."Yew tree";
        D.llIllIIII[D.llIllIIIl[17]] = D."Yew logs";
    }

    public String toString() {
        return this.tree;
    }

    private static String lIllllIIllI(String lIlIlllIllIIIll, String lIlIlllIllIIlII) {
        try {
            SecretKeySpec lIlIlllIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllIllIIlll = Cipher.getInstance("Blowfish");
            lIlIlllIllIIlll.init(llIllIIIl[2], lIlIlllIllIlIII);
            return new String(lIlIlllIllIIlll.doFinal(Base64.getDecoder().decode(lIlIlllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllIllIIllI) {
            lIlIlllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllllIIlII(String lIlIlllIlllIIII, String lIlIlllIllIllll) {
        try {
            SecretKeySpec lIlIlllIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIllIllll.getBytes(StandardCharsets.UTF_8)), llIllIIIl[8]), "DES");
            Cipher lIlIlllIlllIlII = Cipher.getInstance("DES");
            lIlIlllIlllIlII.init(llIllIIIl[2], lIlIlllIlllIlIl);
            return new String(lIlIlllIlllIlII.doFinal(Base64.getDecoder().decode(lIlIlllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllIlllIIll) {
            lIlIlllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        D.lIllllIlIII();
        D.lIllllIIlll();
        NORMAL = new D(llIllIIII[llIllIIIl[1]], llIllIIII[llIllIIIl[2]]);
        OAK = new D(llIllIIII[llIllIIIl[4]], llIllIIII[llIllIIIl[5]]);
        WILLOW = new D(llIllIIII[llIllIIIl[7]], llIllIIII[llIllIIIl[8]]);
        MAPLE = new D(llIllIIII[llIllIIIl[10]], llIllIIII[llIllIIIl[11]]);
        TEAK = new D(llIllIIII[llIllIIIl[13]], llIllIIII[llIllIIIl[14]]);
        YEW = new D(llIllIIII[llIllIIIl[16]], llIllIIII[llIllIIIl[17]]);
        D[] dArray = new D[llIllIIIl[6]];
        dArray[D.llIllIIIl[0]] = NORMAL;
        dArray[D.llIllIIIl[1]] = OAK;
        dArray[D.llIllIIIl[2]] = WILLOW;
        dArray[D.llIllIIIl[3]] = MAPLE;
        dArray[D.llIllIIIl[4]] = TEAK;
        dArray[D.llIllIIIl[5]] = YEW;
        $VALUES = dArray;
    }

    public static D valueOf(String string) {
        return Enum.valueOf(D.class, string);
    }

    private static String lIllllIIlIl(String lIlIllllIIIIlll, String lIlIllllIIIIIIl) {
        lIlIllllIIIIlll = new String(Base64.getDecoder().decode(lIlIllllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllllIIIIlIl = new StringBuilder();
        char[] lIlIllllIIIIlII = lIlIllllIIIIIIl.toCharArray();
        int lIlIllllIIIIIll = llIllIIIl[0];
        char[] lIlIlllIlllllIl = lIlIllllIIIIlll.toCharArray();
        int lIlIlllIlllllII = lIlIlllIlllllIl.length;
        int lIlIlllIllllIll = llIllIIIl[0];
        while (D.lIllllIlIIl(lIlIlllIllllIll, lIlIlllIlllllII)) {
            char lIlIllllIIIlIII = lIlIlllIlllllIl[lIlIlllIllllIll];
            lIlIllllIIIIlIl.append((char)(lIlIllllIIIlIII ^ lIlIllllIIIIlII[lIlIllllIIIIIll % lIlIllllIIIIlII.length]));
            0;
            ++lIlIllllIIIIIll;
            ++lIlIlllIllllIll;
            0;
            if (((0x40 ^ 0x17) & ~(0xDF ^ 0x88)) == 0) continue;
            return null;
        }
        return String.valueOf(lIlIllllIIIIlIl);
    }

    private D(String string2, String string3) {
        this.log = string3;
        this.tree = string2;
    }
}

