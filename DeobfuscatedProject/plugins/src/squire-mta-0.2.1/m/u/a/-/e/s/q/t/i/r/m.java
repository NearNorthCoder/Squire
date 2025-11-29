/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 */
package m.u.a.-.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.LocalPoint;

public final class m
extends Enum<m> {
    private static /* synthetic */ String[] lllIlIIlllIl;
    public static final /* synthetic */ /* enum */ m MAZE_7;
    public static final /* synthetic */ /* enum */ m MAZE_4;
    public static final /* synthetic */ /* enum */ m MAZE_1;
    public static final /* synthetic */ /* enum */ m MAZE_6;
    private final /* synthetic */ int walls;
    public static final /* synthetic */ /* enum */ m MAZE_2;
    private static final /* synthetic */ m[] $VALUES;
    private static /* synthetic */ int[] lllIlIIllllI;
    public static final /* synthetic */ /* enum */ m MAZE_5;
    public static final /* synthetic */ /* enum */ m MAZE_9;
    public static final /* synthetic */ /* enum */ m MAZE_3;
    public static final /* synthetic */ /* enum */ m MAZE_10;
    public static final /* synthetic */ /* enum */ m MAZE_8;
    private final /* synthetic */ LocalPoint start;

    /*
     * WARNING - void declaration
     */
    public static m b(int n2) {
        void lllllllllllllllIIllIllIllIlIIlll;
        m[] mArray = m.values();
        int n3 = mArray.length;
        int lllllllllllllllIIllIllIllIlIIllI = lllIlIIllllI[0];
        while (m.lIIIlIllllIIIlI(lllllllllllllllIIllIllIllIlIIllI, (int)lllllllllllllllIIllIllIllIlIIlll)) {
            int lllllllllllllllIIllIllIllIlIlIIl;
            void lllllllllllllllIIllIllIllIlIlIII;
            void lllllllllllllllIIllIllIllIlIIlIl = lllllllllllllllIIllIllIllIlIlIII[lllllllllllllllIIllIllIllIlIIllI];
            if (m.lIIIlIllllIIIll(lllllllllllllllIIllIllIllIlIIlIl.C(), lllllllllllllllIIllIllIllIlIlIIl)) {
                return lllllllllllllllIIllIllIllIlIIlIl;
            }
            ++lllllllllllllllIIllIllIllIlIIllI;
            "".length();
            if ("   ".length() > "  ".length()) continue;
            return null;
        }
        return null;
    }

    private static String lIIIlIlllIlllIl(String lllllllllllllllIIllIllIlIlllIllI, String lllllllllllllllIIllIllIlIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIlIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlIlllIlll.getBytes(StandardCharsets.UTF_8)), lllIlIIllllI[30]), "DES");
            Cipher lllllllllllllllIIllIllIlIllllIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIlIllllIlI.init(lllIlIIllllI[7], lllllllllllllllIIllIllIlIllllIll);
            return new String(lllllllllllllllIIllIllIlIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIlIllllIIl) {
            lllllllllllllllIIllIllIlIllllIIl.printStackTrace();
            return null;
        }
    }

    private m(int n3, LocalPoint localPoint) {
        this.walls = n3;
        this.start = localPoint;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    private static String lIIIlIlllIllllI(String lllllllllllllllIIllIllIllIIllIll, String lllllllllllllllIIllIllIllIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIllIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIllIIlllll.init(lllIlIIllllI[7], lllllllllllllllIIllIllIllIlIIIII);
            return new String(lllllllllllllllIIllIllIllIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIllIIllllI) {
            lllllllllllllllIIllIllIllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIllllIIIIl() {
        lllIlIIllllI = new int[36];
        m.lllIlIIllllI[0] = (0x55 ^ 0x7B) & ~(0x90 ^ 0xBE);
        m.lllIlIIllllI[1] = 0x4C ^ 0x68 ^ (9 ^ 0x49);
        m.lllIlIIllllI[2] = 0xFFFFDBD9 & 0x3EE6;
        m.lllIlIIllllI[3] = 0xFFFFEF64 & 0x1FDB;
        m.lllIlIIllllI[4] = " ".length();
        m.lllIlIIllllI[5] = 74 + 9 - 42 + 176 ^ 36 + 141 - 157 + 145;
        m.lllIlIIllllI[6] = 0xFFFFF3F3 & 0x1F4C;
        m.lllIlIIllllI[7] = "  ".length();
        m.lllIlIIllllI[8] = (0x38 ^ 0x16) + (0x2C ^ 0x4E) - (0x5A ^ 0x73) + (0xA1 ^ 0xBB);
        m.lllIlIIllllI[9] = -(0xFFFF8E7B & 0x75AE) & (0xFFFF9FF9 & 0x7FEF);
        m.lllIlIIllllI[10] = -(0xFFFFEBFF & 0x773F) & (0xFFFFF7FE & Short.MAX_VALUE);
        m.lllIlIIllllI[11] = "   ".length();
        m.lllIlIIllllI[12] = 0x7B ^ 0x4B ^ (0x7B ^ 0x7E);
        m.lllIlIIllllI[13] = 0xFFFFBDEC & 0x5A53;
        m.lllIlIIllllI[14] = 0xDB ^ 0xB7 ^ (0x77 ^ 0x1F);
        m.lllIlIIllllI[15] = 0x1D ^ 0x71;
        m.lllIlIIllllI[16] = -(0xFFFFCF34 & 0x7CDF) & (0xFFFFFFDF & 0x5FF3);
        m.lllIlIIllllI[17] = 0xFFFFF4C7 & 0x1F78;
        m.lllIlIIllllI[18] = 0x43 ^ 0x46;
        m.lllIlIIllllI[19] = 0x7B ^ 2;
        m.lllIlIIllllI[20] = -(0xFFFFFFBD & 0x315E) & (0xFFFFFF5F & 0x3FFB);
        m.lllIlIIllllI[21] = -(0xFFFFAA64 & 0x77BF) & (0xFFFFB7E7 & 0x7F7B);
        m.lllIlIIllllI[22] = 3 + 132 - 119 + 164 ^ 139 + 118 - 240 + 161;
        m.lllIlIIllllI[23] = 0xBF ^ 0xB9 ^ (0xF8 ^ 0xB9);
        m.lllIlIIllllI[24] = 0xFFFFBFCD & 0x57F2;
        m.lllIlIIllllI[25] = -(0xFFFFE9F7 & 0x7EBD) & (0xFFFFFFFE & 0x7EF5);
        m.lllIlIIllllI[26] = 1 ^ 6;
        m.lllIlIIllllI[27] = 0x4B ^ 0x29;
        m.lllIlIIllllI[28] = -(0xFFFFF0BD & 0x2F7F) & (0xFFFFFFFC & 0x377F);
        m.lllIlIIllllI[29] = 0xFFFFDFC7 & 0x3CF8;
        m.lllIlIIllllI[30] = 0xB6 ^ 0xBE;
        m.lllIlIIllllI[31] = 0x94 ^ 0xC3;
        m.lllIlIIllllI[32] = 0x5A ^ 0x7A ^ (0x2B ^ 2);
        m.lllIlIIllllI[33] = 0xD ^ 0x56;
        m.lllIlIIllllI[34] = -(0xFFFFBDCF & 0x5ABE) & (0xFFFFBFFD & 0x7BCF);
        m.lllIlIIllllI[35] = 112 + 14 - 48 + 97 ^ 76 + 66 - 139 + 162;
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public LocalPoint D() {
        return this.start;
    }

    static {
        m.lIIIlIllllIIIIl();
        m.lIIIlIllllIIIII();
        MAZE_1 = new m(lllIlIIllllI[1], new LocalPoint(lllIlIIllllI[2], lllIlIIllllI[3]));
        MAZE_2 = new m(lllIlIIllllI[5], new LocalPoint(lllIlIIllllI[6], lllIlIIllllI[2]));
        MAZE_3 = new m(lllIlIIllllI[8], new LocalPoint(lllIlIIllllI[9], lllIlIIllllI[10]));
        MAZE_4 = new m(lllIlIIllllI[12], new LocalPoint(lllIlIIllllI[13], lllIlIIllllI[6]));
        MAZE_5 = new m(lllIlIIllllI[15], new LocalPoint(lllIlIIllllI[16], lllIlIIllllI[17]));
        MAZE_6 = new m(lllIlIIllllI[19], new LocalPoint(lllIlIIllllI[20], lllIlIIllllI[21]));
        MAZE_7 = new m(lllIlIIllllI[23], new LocalPoint(lllIlIIllllI[24], lllIlIIllllI[25]));
        MAZE_8 = new m(lllIlIIllllI[27], new LocalPoint(lllIlIIllllI[28], lllIlIIllllI[29]));
        MAZE_9 = new m(lllIlIIllllI[31], new LocalPoint(lllIlIIllllI[17], lllIlIIllllI[13]));
        MAZE_10 = new m(lllIlIIllllI[33], new LocalPoint(lllIlIIllllI[21], lllIlIIllllI[34]));
        m[] mArray = new m[lllIlIIllllI[35]];
        mArray[m.lllIlIIllllI[0]] = MAZE_1;
        mArray[m.lllIlIIllllI[4]] = MAZE_2;
        mArray[m.lllIlIIllllI[7]] = MAZE_3;
        mArray[m.lllIlIIllllI[11]] = MAZE_4;
        mArray[m.lllIlIIllllI[14]] = MAZE_5;
        mArray[m.lllIlIIllllI[18]] = MAZE_6;
        mArray[m.lllIlIIllllI[22]] = MAZE_7;
        mArray[m.lllIlIIllllI[26]] = MAZE_8;
        mArray[m.lllIlIIllllI[30]] = MAZE_9;
        mArray[m.lllIlIIllllI[32]] = MAZE_10;
        $VALUES = mArray;
    }

    public int C() {
        return this.walls;
    }

    private static String lIIIlIlllIlllll(String lllllllllllllllIIllIllIllIIIllIl, String lllllllllllllllIIllIllIllIIIIlll) {
        lllllllllllllllIIllIllIllIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIllIIIlIll = new StringBuilder();
        char[] lllllllllllllllIIllIllIllIIIlIlI = lllllllllllllllIIllIllIllIIIIlll.toCharArray();
        int lllllllllllllllIIllIllIllIIIlIIl = lllIlIIllllI[0];
        char[] lllllllllllllllIIllIllIllIIIIIll = lllllllllllllllIIllIllIllIIIllIl.toCharArray();
        int lllllllllllllllIIllIllIllIIIIIlI = lllllllllllllllIIllIllIllIIIIIll.length;
        int lllllllllllllllIIllIllIllIIIIIIl = lllIlIIllllI[0];
        while (m.lIIIlIllllIIIlI(lllllllllllllllIIllIllIllIIIIIIl, lllllllllllllllIIllIllIllIIIIIlI)) {
            char lllllllllllllllIIllIllIllIIIlllI = lllllllllllllllIIllIllIllIIIIIll[lllllllllllllllIIllIllIllIIIIIIl];
            lllllllllllllllIIllIllIllIIIlIll.append((char)(lllllllllllllllIIllIllIllIIIlllI ^ lllllllllllllllIIllIllIllIIIlIlI[lllllllllllllllIIllIllIllIIIlIIl % lllllllllllllllIIllIllIllIIIlIlI.length]));
            "".length();
            ++lllllllllllllllIIllIllIllIIIlIIl;
            ++lllllllllllllllIIllIllIllIIIIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllIllIIIlIll);
    }

    private static void lIIIlIllllIIIII() {
        lllIlIIlllIl = new String[lllIlIIllllI[35]];
        m.lllIlIIlllIl[m.lllIlIIllllI[0]] = m.lIIIlIlllIlllIl("UTM5L7anF/E=", "hZiir");
        m.lllIlIIlllIl[m.lllIlIIllllI[4]] = m.lIIIlIlllIllllI("/y/Bwh6jjFM=", "tdhcv");
        m.lllIlIIlllIl[m.lllIlIIllllI[7]] = m.lIIIlIlllIlllll("KQ05AhhX", "dLcGG");
        m.lllIlIIlllIl[m.lllIlIIllllI[11]] = m.lIIIlIlllIlllll("CAgWNw9x", "EILrP");
        m.lllIlIIlllIl[m.lllIlIIllllI[14]] = m.lIIIlIlllIllllI("NGAFG7DZ7b4=", "RsNpi");
        m.lllIlIIlllIl[m.lllIlIIllllI[18]] = m.lIIIlIlllIlllll("IggRETxZ", "oIKTc");
        m.lllIlIIlllIl[m.lllIlIIllllI[22]] = m.lIIIlIlllIllllI("BndmRh7nrCs=", "mNpIR");
        m.lllIlIIlllIl[m.lllIlIIllllI[26]] = m.lIIIlIlllIlllll("LgYdMjxb", "cGGwc");
        m.lllIlIIlllIl[m.lllIlIIllllI[30]] = m.lIIIlIlllIlllIl("l+oOWycyAXA=", "WTSuI");
        m.lllIlIIlllIl[m.lllIlIIllllI[32]] = m.lIIIlIlllIllllI("KLx45rpV+dY=", "Tmgvg");
    }

    private static boolean lIIIlIllllIIIll(int n2, int n3) {
        return n2 == n3;
    }
}

