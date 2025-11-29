/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Q;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class P
extends Enum<P> {
    private static final /* synthetic */ P[] $VALUES;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ P EMPTY;
    private static /* synthetic */ String[] lIlIIlIIllll;
    public static final /* synthetic */ /* enum */ P PUZZLE;
    private final /* synthetic */ char code;
    public static final /* synthetic */ /* enum */ P START;
    public static final /* synthetic */ /* enum */ P FARMING;
    public static final /* synthetic */ /* enum */ P COMBAT;
    private static /* synthetic */ int[] lIlIIlIlIIII;
    public static final /* synthetic */ /* enum */ P END;
    public static final /* synthetic */ /* enum */ P SCAVENGERS;

    static {
        P.llIllIIlIIIIIl();
        P.llIllIIlIIIIII();
        START = new P(lIlIIlIIllll[lIlIIlIlIIII[1]], lIlIIlIlIIII[2]);
        END = new P(lIlIIlIIllll[lIlIIlIlIIII[4]], lIlIIlIlIIII[5]);
        SCAVENGERS = new P(lIlIIlIIllll[lIlIIlIlIIII[7]], lIlIIlIlIIII[8]);
        FARMING = new P(lIlIIlIIllll[lIlIIlIlIIII[10]], lIlIIlIlIIII[11]);
        EMPTY = new P(lIlIIlIIllll[lIlIIlIlIIII[13]], lIlIIlIlIIII[14]);
        COMBAT = new P(lIlIIlIIllll[lIlIIlIlIIII[16]], lIlIIlIlIIII[17]);
        PUZZLE = new P(lIlIIlIIllll[lIlIIlIlIIII[19]], lIlIIlIlIIII[20]);
        P[] pArray = new P[lIlIIlIlIIII[10]];
        pArray[P.lIlIIlIlIIII[0]] = START;
        pArray[P.lIlIIlIlIIII[1]] = END;
        pArray[P.lIlIIlIlIIII[3]] = SCAVENGERS;
        pArray[P.lIlIIlIlIIII[4]] = FARMING;
        pArray[P.lIlIIlIlIIII[6]] = EMPTY;
        pArray[P.lIlIIlIlIIII[7]] = COMBAT;
        pArray[P.lIlIIlIlIIII[9]] = PUZZLE;
        $VALUES = pArray;
    }

    public N ce() {
        switch (Q.cm[this.ordinal()]) {
            case 1: {
                return N.START;
            }
            case 2: {
                return N.END;
            }
            case 3: {
                return N.SCAVENGERS;
            }
            case 4: {
                return N.FARMING;
            }
            case 5: {
                return N.UNKNOWN_COMBAT;
            }
            case 6: {
                return N.UNKNOWN_PUZZLE;
            }
        }
        return N.EMPTY;
    }

    private static String llIllIIIllllIl(String lllllllllllllllIllIllIlIllIIlIlI, String lllllllllllllllIllIllIlIllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIlIllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIlIllIIllII.init(lIlIIlIlIIII[3], lllllllllllllllIllIllIlIllIIllIl);
            return new String(lllllllllllllllIllIllIlIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlIllIIlIll) {
            lllllllllllllllIllIllIlIllIIlIll.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIllllll(String lllllllllllllllIllIllIlIllIllIlI, String lllllllllllllllIllIllIlIllIllIIl) {
        lllllllllllllllIllIllIlIllIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIlIllIlllIl = new StringBuilder();
        char[] lllllllllllllllIllIllIlIllIlllII = lllllllllllllllIllIllIlIllIllIIl.toCharArray();
        int lllllllllllllllIllIllIlIllIllIll = lIlIIlIlIIII[0];
        char[] lllllllllllllllIllIllIlIllIlIlIl = lllllllllllllllIllIllIlIllIllIlI.toCharArray();
        int lllllllllllllllIllIllIlIllIlIlII = lllllllllllllllIllIllIlIllIlIlIl.length;
        int lllllllllllllllIllIllIlIllIlIIll = lIlIIlIlIIII[0];
        while (P.llIllIIlIIIIlI(lllllllllllllllIllIllIlIllIlIIll, lllllllllllllllIllIllIlIllIlIlII)) {
            char lllllllllllllllIllIllIlIlllIIIII = lllllllllllllllIllIllIlIllIlIlIl[lllllllllllllllIllIllIlIllIlIIll];
            lllllllllllllllIllIllIlIllIlllIl.append((char)(lllllllllllllllIllIllIlIlllIIIII ^ lllllllllllllllIllIllIlIllIlllII[lllllllllllllllIllIllIlIllIllIll % lllllllllllllllIllIllIlIllIlllII.length]));
            0;
            ++lllllllllllllllIllIllIlIllIllIll;
            ++lllllllllllllllIllIllIlIllIlIIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIlIllIlllIl);
    }

    private static boolean llIllIIlIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllIIlIIIIII() {
        lIlIIlIIllll = new String[lIlIIlIlIIII[21]];
        P.lIlIIlIIllll[P.lIlIIlIlIIII[0]] = P."START";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[1]] = P."Start";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[3]] = P."END";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[4]] = P."End";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[6]] = P."SCAVENGERS";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[7]] = P."Scavengers";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[9]] = P."FARMING";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[10]] = P."Farming";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[12]] = P."EMPTY";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[13]] = P."Empty";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[15]] = P."COMBAT";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[16]] = P."Combat";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[18]] = P."PUZZLE";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[19]] = P."Puzzle";
    }

    /*
     * WARNING - void declaration
     */
    public static P c(char c2) {
        void lllllllllllllllIllIllIlIlllIllII;
        P[] pArray = P.values();
        int n2 = pArray.length;
        int lllllllllllllllIllIllIlIlllIlIll = lIlIIlIlIIII[0];
        while (P.llIllIIlIIIIlI(lllllllllllllllIllIllIlIlllIlIll, (int)lllllllllllllllIllIllIlIlllIllII)) {
            char lllllllllllllllIllIllIlIlllIlllI;
            void lllllllllllllllIllIllIlIlllIllIl;
            void lllllllllllllllIllIllIlIlllIlIlI = lllllllllllllllIllIllIlIlllIllIl[lllllllllllllllIllIllIlIlllIlIll];
            if (P.llIllIIlIIIIll(lllllllllllllllIllIllIlIlllIlIlI.cf(), lllllllllllllllIllIllIlIlllIlllI)) {
                return lllllllllllllllIllIllIlIlllIlIlI;
            }
            ++lllllllllllllllIllIllIlIlllIlIll;
            0;
            if (((0x1A ^ 0x46 ^ (0xDC ^ 0x92)) & (0xF8 ^ 0xC4 ^ (0xAE ^ 0x80) ^ -1)) == (1 & (1 ^ -1))) continue;
            return null;
        }
        return EMPTY;
    }

    public static P valueOf(String string) {
        return Enum.valueOf(P.class, string);
    }

    private static void llIllIIlIIIIIl() {
        lIlIIlIlIIII = new int[22];
        P.lIlIIlIlIIII[0] = (0xE0 ^ 0xB3 ^ (0x10 ^ 0)) & (210 + 41 - 220 + 186 ^ 132 + 44 - 132 + 110 ^ -1);
        P.lIlIIlIlIIII[1] = 1;
        P.lIlIIlIlIIII[2] = 0x5F ^ 0x2E ^ (0x28 ^ 0x7A);
        P.lIlIIlIlIIII[3] = 2;
        P.lIlIIlIlIIII[4] = 3;
        P.lIlIIlIlIIII[5] = (0x4B ^ 1) + (0x42 ^ 0x3A) - (56 + 84 - 1 + 15) + (0x22 ^ 0x5E);
        P.lIlIIlIlIIII[6] = 0x7A ^ 0x7E;
        P.lIlIIlIlIIII[7] = 0xAB ^ 0xAE;
        P.lIlIIlIlIIII[8] = 0x4D ^ 0x1E;
        P.lIlIIlIlIIII[9] = 0x5C ^ 0x5A;
        P.lIlIIlIlIIII[10] = 0xE2 ^ 0x8F ^ (0x56 ^ 0x3C);
        P.lIlIIlIlIIII[11] = 0x16 ^ 0x50;
        P.lIlIIlIlIIII[12] = 0xDB ^ 0xB9 ^ (0xFF ^ 0x95);
        P.lIlIIlIlIIII[13] = 0x2E ^ 0x18 ^ (0x57 ^ 0x68);
        P.lIlIIlIlIIII[14] = 0x3D ^ 0x1D;
        P.lIlIIlIlIIII[15] = 0x6C ^ 0x66;
        P.lIlIIlIlIIII[16] = 0xB9 ^ 0xB2;
        P.lIlIIlIlIIII[17] = 188 + 58 - 49 + 53 ^ 25 + 106 - 39 + 93;
        P.lIlIIlIlIIII[18] = 0x52 ^ 0x37 ^ (0x46 ^ 0x2F);
        P.lIlIIlIlIIII[19] = 0xA3 ^ 0xAE;
        P.lIlIIlIlIIII[20] = 165 + 171 - 209 + 86 ^ 63 + 52 - 83 + 101;
        P.lIlIIlIlIIII[21] = 0xA0 ^ 0xAE;
    }

    public char cf() {
        return this.code;
    }

    public String bX() {
        return this.name;
    }

    private P(String string2, char c2) {
        this.name = string2;
        this.code = c2;
    }

    private static boolean llIllIIlIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    public static P[] values() {
        return (P[])$VALUES.clone();
    }

    private static String llIllIIIlllllI(String lllllllllllllllIllIllIlIlIllllIl, String lllllllllllllllIllIllIlIlIllllII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlIllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIlIllllII.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIII[12]), "DES");
            Cipher lllllllllllllllIllIllIlIlIllllll = Cipher.getInstance("DES");
            lllllllllllllllIllIllIlIlIllllll.init(lIlIIlIlIIII[3], lllllllllllllllIllIllIlIllIIIIII);
            return new String(lllllllllllllllIllIllIlIlIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlIlIlllllI) {
            lllllllllllllllIllIllIlIlIlllllI.printStackTrace();
            return null;
        }
    }
}

