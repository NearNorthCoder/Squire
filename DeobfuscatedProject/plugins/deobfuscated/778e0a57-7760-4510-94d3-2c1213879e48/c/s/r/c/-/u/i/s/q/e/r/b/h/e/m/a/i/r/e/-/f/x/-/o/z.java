/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import com.google.common.collect.Maps;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class z
extends Enum<z> {
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_AUTO_RIGHT;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_DYING;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_MIDDLE_TO_LEFT;
    public static final /* synthetic */ /* enum */ z HEAD_DYING;
    public static final /* synthetic */ /* enum */ z UNKNOWN;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_RIGHT_TO_LEFT;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_MIDDLE_TO_RIGHT;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_RIGHT;
    public static final /* synthetic */ /* enum */ z HEAD_MIDDLE_TO_RIGHT;
    public static final /* synthetic */ /* enum */ z HEAD_MIDDLE;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_LIGHTNING1;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_IDLE2;
    private static final /* synthetic */ z[] $VALUES;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_RISING_2;
    private static /* synthetic */ String[] lIIlllllIIlI;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_MIDDLE;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_HEAL2;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_AUTO_LEFT;
    private static final /* synthetic */ Map<Integer, z> LOOKUP;
    public static final /* synthetic */ /* enum */ z HEAD_MIDDLE_TO_LEFT;
    private final /* synthetic */ boolean move;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_PORTALS2;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_HEAL1;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_LIGHTNING2;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_PORTALS1;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_CRYSTALS2;
    private static /* synthetic */ int[] lIIlllllIlll;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_LEFT_TO_RIGHT;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_RIGHT_TO_MIDDLE;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_LEFT_TO_MIDDLE;
    public static final /* synthetic */ /* enum */ z HEAD_RISING_2;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_LEFT;
    public static final /* synthetic */ /* enum */ z HEAD_RISING_1;
    public static final /* synthetic */ /* enum */ z HEAD_AUTO_RIGHT;
    public static final /* synthetic */ /* enum */ z HEAD_LEFT;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_CRIPPLED;
    public static final /* synthetic */ /* enum */ z HEAD_AUTO_LEFT;
    public static final /* synthetic */ /* enum */ z HEAD_ENRAGED_AUTO_MIDDLE;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_CRYSTALS1;
    public static final /* synthetic */ /* enum */ z HEAD_RIGHT_TO_MIDDLE;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_CRIPPLING;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_IDLE1;
    public static final /* synthetic */ /* enum */ z HEAD_AUTO_MIDDLE;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_UNCRIPPLING1;
    public static final /* synthetic */ /* enum */ z HEAD_LEFT_TO_MIDDLE;
    public static final /* synthetic */ /* enum */ z HEAD_RIGHT;
    public static final /* synthetic */ /* enum */ z HEAD_LEFT_TO_RIGHT;
    public static final /* synthetic */ /* enum */ z HEAD_RIGHT_TO_LEFT;
    public static final /* synthetic */ /* enum */ z LEFT_HAND_UNCRIPPLING2;

    private static String llIlIIlIIlllII(String lllllllllllllllIlllIIlllllllIlIl, String lllllllllllllllIlllIIlllllllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllllIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllIlll[16]), "DES");
            Cipher lllllllllllllllIlllIIlllllllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllllllIlll.init(lIIlllllIlll[4], lllllllllllllllIlllIIllllllllIII);
            return new String(lllllllllllllllIlllIIlllllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllllllIllI) {
            lllllllllllllllIlllIIlllllllIllI.printStackTrace();
            return null;
        }
    }

    private z(int n3, boolean bl2) {
        this.id = n3;
        this.move = bl2;
    }

    private static boolean llIlIIlIllIIlI(Object object) {
        return object == null;
    }

    private static void llIlIIlIllIIIl() {
        lIIlllllIlll = new int[89];
        z.lIIlllllIlll[0] = (0xE7 ^ 0xBD) & ~(0xE6 ^ 0xBC);
        z.lIIlllllIlll[1] = -2;
        z.lIIlllllIlll[2] = 1;
        z.lIIlllllIlll[3] = -(0xFFFFA25E & 0x7DB3) & (0xFFFFBDFF & 0x7EB7);
        z.lIIlllllIlll[4] = 2;
        z.lIIlllllIlll[5] = -(0xFFFFE3BF & 0x7C59) & (0xFFFFFCBF & Short.MAX_VALUE);
        z.lIIlllllIlll[6] = 3;
        z.lIIlllllIlll[7] = 0xFFFFDCBA & 0x3FED;
        z.lIIlllllIlll[8] = 0x5D ^ 0x47 ^ (0x8E ^ 0x90);
        z.lIIlllllIlll[9] = 0xFFFFDDFB & 0x3EAD;
        z.lIIlllllIlll[10] = 123 + 140 - 197 + 79 ^ 121 + 59 - 117 + 85;
        z.lIIlllllIlll[11] = 0xFFFFFFEA & 0x1CBF;
        z.lIIlllllIlll[12] = 0x93 ^ 0xA3 ^ (0x1D ^ 0x2B);
        z.lIIlllllIlll[13] = -(0xFFFFAFFF & 0x7141) & (0xFFFFFDEF & 0x3FFB);
        z.lIIlllllIlll[14] = 0x47 ^ 0x40;
        z.lIIlllllIlll[15] = 0xFFFFBCBE & 0x5FED;
        z.lIIlllllIlll[16] = 0x24 ^ 0x2C;
        z.lIIlllllIlll[17] = -(0xFFFFEF5F & 0x53B3) & (0xFFFFDFBF & Short.MAX_VALUE);
        z.lIIlllllIlll[18] = 93 + 83 - 101 + 79 ^ 3 + 97 - -15 + 32;
        z.lIIlllllIlll[19] = 0xFFFF9EBF & 0x7DEE;
        z.lIIlllllIlll[20] = 38 + 109 - 137 + 143 ^ 81 + 40 - -10 + 16;
        z.lIIlllllIlll[21] = -(0xFFFFA601 & 0x79FF) & (0xFFFFBCFF & 0x7FAF);
        z.lIIlllllIlll[22] = 0x39 ^ 0x32;
        z.lIIlllllIlll[23] = 0xFFFFFFFF & 0x1CB0;
        z.lIIlllllIlll[24] = 0x35 ^ 0x39;
        z.lIIlllllIlll[25] = 0xFFFF9DBD & 0x7EF3;
        z.lIIlllllIlll[26] = 0x38 ^ 0x35;
        z.lIIlllllIlll[27] = 0xFFFFFEF2 & 0x1DBF;
        z.lIIlllllIlll[28] = 0xCD ^ 0xC3;
        z.lIIlllllIlll[29] = 0xFFFFDEF7 & 0x3DBB;
        z.lIIlllllIlll[30] = 0x6C ^ 0x71 ^ (6 ^ 0x14);
        z.lIIlllllIlll[31] = 0xFFFFBFBE & 0x5CF5;
        z.lIIlllllIlll[32] = 0x59 ^ 0x49;
        z.lIIlllllIlll[33] = 0xFFFFFEBB & 0x1DFF;
        z.lIIlllllIlll[34] = 0x36 ^ 0x27;
        z.lIIlllllIlll[35] = -(0xFFFFAB33 & 0x77CD) & (0xFFFFFFBF & 0x3FFC);
        z.lIIlllllIlll[36] = 0x94 ^ 0x86;
        z.lIIlllllIlll[37] = -(0xFFFFD389 & 0x2F77) & (0xFFFFBFBF & 0x5FFD);
        z.lIIlllllIlll[38] = 0x41 ^ 0x52;
        z.lIIlllllIlll[39] = -(0xEE ^ 0xAF) & (0xFFFFFDFE & 0x1EFF);
        z.lIIlllllIlll[40] = 76 + 29 - 59 + 81 ^ (0x63 ^ 8);
        z.lIIlllllIlll[41] = -(0xFFFFE38F & 0x7F71) & (0xFFFFFFFF & 0x7FBF);
        z.lIIlllllIlll[42] = 144 + 140 - 281 + 160 ^ 90 + 14 - 59 + 137;
        z.lIIlllllIlll[43] = 0xFFFFDFE5 & 0x3CDA;
        z.lIIlllllIlll[44] = 1 ^ (0xB6 ^ 0xA1);
        z.lIIlllllIlll[45] = -(0xFFFFFB75 & 0x26BB) & (0xFFFFFFFF & 0x3EF1);
        z.lIIlllllIlll[46] = 0x63 ^ 0x74;
        z.lIIlllllIlll[47] = -(0xFFFFFE7D & 0x638F) & (0xFFFFFFFE & 0x7ECF);
        z.lIIlllllIlll[48] = 103 + 170 - 194 + 140 ^ 68 + 79 - 129 + 177;
        z.lIIlllllIlll[49] = 0xFFFF9ECC & 0x7DF7;
        z.lIIlllllIlll[50] = 102 + 102 - 97 + 24 ^ 5 + 2 - -15 + 132;
        z.lIIlllllIlll[51] = -(0xFFFFD17F & 0x6FB3) & (0xFFFFFDF7 & 0x5FFF);
        z.lIIlllllIlll[52] = 0xAE ^ 0xA5 ^ (0x2F ^ 0x3E);
        z.lIIlllllIlll[53] = -(0xFFFF8A3B & 0x77ED) & (0xFFFFBEFE & 0x5FEF);
        z.lIIlllllIlll[54] = 0x47 ^ 0x7B ^ (0x26 ^ 1);
        z.lIIlllllIlll[55] = -(0xFFFFFF5F & 0x62B9) & (0xFFFFFFDF & 0x7EFF);
        z.lIIlllllIlll[56] = 0x91 ^ 0x8D;
        z.lIIlllllIlll[57] = -(0xFFFFFA74 & 0x67BF) & (0xFFFFFEFF & 0x7FFB);
        z.lIIlllllIlll[58] = 0x5D ^ 0x40;
        z.lIIlllllIlll[59] = 0xFFFF9DED & 0x7EDB;
        z.lIIlllllIlll[60] = 4 + 100 - 18 + 71 ^ 82 + 95 - 46 + 0;
        z.lIIlllllIlll[61] = -2 & (0xFFFFDFFB & 0x3CCF);
        z.lIIlllllIlll[62] = 0x14 ^ 0xB;
        z.lIIlllllIlll[63] = 0xFFFFBFEB & 0x5CDF;
        z.lIIlllllIlll[64] = 0xCE ^ 0xA5 ^ (0xF7 ^ 0xBC);
        z.lIIlllllIlll[65] = 0xFFFFFCEE & 0x1FDD;
        z.lIIlllllIlll[66] = 67 + 101 - 27 + 31 ^ 116 + 46 - 63 + 42;
        z.lIIlllllIlll[67] = -(0xFFFFEFB3 & 0x716F) & (0xFFFFFFFF & 0x7DEF);
        z.lIIlllllIlll[68] = 0xE2 ^ 0xC0;
        z.lIIlllllIlll[69] = -(0xFFFFDA63 & 0x679E) & (0xFFFFDECF & Short.MAX_VALUE);
        z.lIIlllllIlll[70] = 0x11 ^ 0x40 ^ (0x19 ^ 0x6B);
        z.lIIlllllIlll[71] = -(0xFFFFEB3D & 0x56F3) & (0xFFFFDFFF & 0x7EFF);
        z.lIIlllllIlll[72] = 0x13 ^ 0x37;
        z.lIIlllllIlll[73] = -(0xFFFFFBB5 & 0x264B) & (0xFFFFBFDF & 0x7EF0);
        z.lIIlllllIlll[74] = 0x7F ^ 0x5A;
        z.lIIlllllIlll[75] = 0xFFFF9DD5 & 0x7EFB;
        z.lIIlllllIlll[76] = 23 + 95 - -3 + 17 ^ 55 + 105 - -1 + 11;
        z.lIIlllllIlll[77] = -(0xFFFFEC4F & 0x73BD) & (0xFFFFFFFF & 0x7CDE);
        z.lIIlllllIlll[78] = 0x7F ^ 0x50 ^ (0x50 ^ 0x58);
        z.lIIlllllIlll[79] = 0xFFFFDCD3 & 0x3FFF;
        z.lIIlllllIlll[80] = 0x59 ^ 0x71;
        z.lIIlllllIlll[81] = 0xFFFFFCDD & 0x1FF6;
        z.lIIlllllIlll[82] = 157 + 153 - 301 + 162 ^ 43 + 45 - -18 + 24;
        z.lIIlllllIlll[83] = 0xFFFFFDDD & 0x1EF7;
        z.lIIlllllIlll[84] = 0x8B ^ 0xA1;
        z.lIIlllllIlll[85] = 0xFFFFFEFE & 0x1DD7;
        z.lIIlllllIlll[86] = 0x90 ^ 0xBB;
        z.lIIlllllIlll[87] = -(0xFFFFD36F & 0x6FB9) & (0xFFFFDFFF & Short.MAX_VALUE);
        z.lIIlllllIlll[88] = 0x68 ^ 0x44;
    }

    public static z[] values() {
        return (z[])$VALUES.clone();
    }

    static {
        z.llIlIIlIllIIIl();
        z.llIlIIlIllIIII();
        UNKNOWN = new z(lIIlllllIlll[1]);
        HEAD_RISING_1 = new z(lIIlllllIlll[3]);
        HEAD_RISING_2 = new z(lIIlllllIlll[5]);
        HEAD_MIDDLE = new z(lIIlllllIlll[7]);
        HEAD_RIGHT = new z(lIIlllllIlll[9]);
        HEAD_LEFT = new z(lIIlllllIlll[11]);
        HEAD_MIDDLE_TO_RIGHT = new z(lIIlllllIlll[13], lIIlllllIlll[2]);
        HEAD_RIGHT_TO_MIDDLE = new z(lIIlllllIlll[15], lIIlllllIlll[2]);
        HEAD_MIDDLE_TO_LEFT = new z(lIIlllllIlll[17], lIIlllllIlll[2]);
        HEAD_LEFT_TO_MIDDLE = new z(lIIlllllIlll[19], lIIlllllIlll[2]);
        HEAD_LEFT_TO_RIGHT = new z(lIIlllllIlll[21], lIIlllllIlll[2]);
        HEAD_RIGHT_TO_LEFT = new z(lIIlllllIlll[23], lIIlllllIlll[2]);
        HEAD_AUTO_MIDDLE = new z(lIIlllllIlll[25]);
        HEAD_AUTO_RIGHT = new z(lIIlllllIlll[27]);
        HEAD_AUTO_LEFT = new z(lIIlllllIlll[29]);
        HEAD_DYING = new z(lIIlllllIlll[31]);
        LEFT_HAND_IDLE1 = new z(lIIlllllIlll[33]);
        LEFT_HAND_CRYSTALS1 = new z(lIIlllllIlll[35]);
        LEFT_HAND_HEAL1 = new z(lIIlllllIlll[37]);
        LEFT_HAND_LIGHTNING1 = new z(lIIlllllIlll[39]);
        LEFT_HAND_PORTALS1 = new z(lIIlllllIlll[41]);
        LEFT_HAND_CRIPPLING = new z(lIIlllllIlll[43]);
        LEFT_HAND_CRIPPLED = new z(lIIlllllIlll[45]);
        LEFT_HAND_UNCRIPPLING1 = new z(lIIlllllIlll[47]);
        LEFT_HAND_UNCRIPPLING2 = new z(lIIlllllIlll[49]);
        LEFT_HAND_IDLE2 = new z(lIIlllllIlll[51]);
        LEFT_HAND_CRYSTALS2 = new z(lIIlllllIlll[53]);
        LEFT_HAND_HEAL2 = new z(lIIlllllIlll[55]);
        LEFT_HAND_LIGHTNING2 = new z(lIIlllllIlll[57]);
        LEFT_HAND_PORTALS2 = new z(lIIlllllIlll[59]);
        LEFT_HAND_DYING = new z(lIIlllllIlll[61]);
        HEAD_ENRAGED_AUTO_MIDDLE = new z(lIIlllllIlll[63]);
        HEAD_ENRAGED_AUTO_LEFT = new z(lIIlllllIlll[65]);
        HEAD_ENRAGED_AUTO_RIGHT = new z(lIIlllllIlll[67]);
        HEAD_ENRAGED_MIDDLE = new z(lIIlllllIlll[69]);
        HEAD_ENRAGED_LEFT = new z(lIIlllllIlll[71]);
        HEAD_ENRAGED_RIGHT = new z(lIIlllllIlll[73]);
        HEAD_ENRAGED_MIDDLE_TO_LEFT = new z(lIIlllllIlll[75], lIIlllllIlll[2]);
        HEAD_ENRAGED_LEFT_TO_MIDDLE = new z(lIIlllllIlll[77], lIIlllllIlll[2]);
        HEAD_ENRAGED_LEFT_TO_RIGHT = new z(lIIlllllIlll[79], lIIlllllIlll[2]);
        HEAD_ENRAGED_RIGHT_TO_LEFT = new z(lIIlllllIlll[81], lIIlllllIlll[2]);
        HEAD_ENRAGED_MIDDLE_TO_RIGHT = new z(lIIlllllIlll[83], lIIlllllIlll[2]);
        HEAD_ENRAGED_RIGHT_TO_MIDDLE = new z(lIIlllllIlll[85], lIIlllllIlll[2]);
        HEAD_ENRAGED_RISING_2 = new z(lIIlllllIlll[87]);
        z[] zArray = new z[lIIlllllIlll[88]];
        zArray[z.lIIlllllIlll[0]] = UNKNOWN;
        zArray[z.lIIlllllIlll[2]] = HEAD_RISING_1;
        zArray[z.lIIlllllIlll[4]] = HEAD_RISING_2;
        zArray[z.lIIlllllIlll[6]] = HEAD_MIDDLE;
        zArray[z.lIIlllllIlll[8]] = HEAD_RIGHT;
        zArray[z.lIIlllllIlll[10]] = HEAD_LEFT;
        zArray[z.lIIlllllIlll[12]] = HEAD_MIDDLE_TO_RIGHT;
        zArray[z.lIIlllllIlll[14]] = HEAD_RIGHT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[16]] = HEAD_MIDDLE_TO_LEFT;
        zArray[z.lIIlllllIlll[18]] = HEAD_LEFT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[20]] = HEAD_LEFT_TO_RIGHT;
        zArray[z.lIIlllllIlll[22]] = HEAD_RIGHT_TO_LEFT;
        zArray[z.lIIlllllIlll[24]] = HEAD_AUTO_MIDDLE;
        zArray[z.lIIlllllIlll[26]] = HEAD_AUTO_RIGHT;
        zArray[z.lIIlllllIlll[28]] = HEAD_AUTO_LEFT;
        zArray[z.lIIlllllIlll[30]] = HEAD_DYING;
        zArray[z.lIIlllllIlll[32]] = LEFT_HAND_IDLE1;
        zArray[z.lIIlllllIlll[34]] = LEFT_HAND_CRYSTALS1;
        zArray[z.lIIlllllIlll[36]] = LEFT_HAND_HEAL1;
        zArray[z.lIIlllllIlll[38]] = LEFT_HAND_LIGHTNING1;
        zArray[z.lIIlllllIlll[40]] = LEFT_HAND_PORTALS1;
        zArray[z.lIIlllllIlll[42]] = LEFT_HAND_CRIPPLING;
        zArray[z.lIIlllllIlll[44]] = LEFT_HAND_CRIPPLED;
        zArray[z.lIIlllllIlll[46]] = LEFT_HAND_UNCRIPPLING1;
        zArray[z.lIIlllllIlll[48]] = LEFT_HAND_UNCRIPPLING2;
        zArray[z.lIIlllllIlll[50]] = LEFT_HAND_IDLE2;
        zArray[z.lIIlllllIlll[52]] = LEFT_HAND_CRYSTALS2;
        zArray[z.lIIlllllIlll[54]] = LEFT_HAND_HEAL2;
        zArray[z.lIIlllllIlll[56]] = LEFT_HAND_LIGHTNING2;
        zArray[z.lIIlllllIlll[58]] = LEFT_HAND_PORTALS2;
        zArray[z.lIIlllllIlll[60]] = LEFT_HAND_DYING;
        zArray[z.lIIlllllIlll[62]] = HEAD_ENRAGED_AUTO_MIDDLE;
        zArray[z.lIIlllllIlll[64]] = HEAD_ENRAGED_AUTO_LEFT;
        zArray[z.lIIlllllIlll[66]] = HEAD_ENRAGED_AUTO_RIGHT;
        zArray[z.lIIlllllIlll[68]] = HEAD_ENRAGED_MIDDLE;
        zArray[z.lIIlllllIlll[70]] = HEAD_ENRAGED_LEFT;
        zArray[z.lIIlllllIlll[72]] = HEAD_ENRAGED_RIGHT;
        zArray[z.lIIlllllIlll[74]] = HEAD_ENRAGED_MIDDLE_TO_LEFT;
        zArray[z.lIIlllllIlll[76]] = HEAD_ENRAGED_LEFT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[78]] = HEAD_ENRAGED_LEFT_TO_RIGHT;
        zArray[z.lIIlllllIlll[80]] = HEAD_ENRAGED_RIGHT_TO_LEFT;
        zArray[z.lIIlllllIlll[82]] = HEAD_ENRAGED_MIDDLE_TO_RIGHT;
        zArray[z.lIIlllllIlll[84]] = HEAD_ENRAGED_RIGHT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[86]] = HEAD_ENRAGED_RISING_2;
        $VALUES = zArray;
        LOOKUP = Maps.uniqueIndex(Arrays.asList(z.values()), z::bw);
    }

    private static String llIlIIlIIllIll(String lllllllllllllllIlllIlIIIIIIlIlll, String lllllllllllllllIlllIlIIIIIIlIIIl) {
        lllllllllllllllIlllIlIIIIIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIIIIlIlIl = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIIIIlIlII = lllllllllllllllIlllIlIIIIIIlIIIl.toCharArray();
        int lllllllllllllllIlllIlIIIIIIlIIll = lIIlllllIlll[0];
        char[] lllllllllllllllIlllIlIIIIIIIllIl = lllllllllllllllIlllIlIIIIIIlIlll.toCharArray();
        int lllllllllllllllIlllIlIIIIIIIllII = lllllllllllllllIlllIlIIIIIIIllIl.length;
        int lllllllllllllllIlllIlIIIIIIIlIll = lIIlllllIlll[0];
        while (z.llIlIIlIllIIll(lllllllllllllllIlllIlIIIIIIIlIll, lllllllllllllllIlllIlIIIIIIIllII)) {
            char lllllllllllllllIlllIlIIIIIIllIII = lllllllllllllllIlllIlIIIIIIIllIl[lllllllllllllllIlllIlIIIIIIIlIll];
            lllllllllllllllIlllIlIIIIIIlIlIl.append((char)(lllllllllllllllIlllIlIIIIIIllIII ^ lllllllllllllllIlllIlIIIIIIlIlII[lllllllllllllllIlllIlIIIIIIlIIll % lllllllllllllllIlllIlIIIIIIlIlII.length]));
            0;
            ++lllllllllllllllIlllIlIIIIIIlIIll;
            ++lllllllllllllllIlllIlIIIIIIIlIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIIIIIlIlIl);
    }

    private static String llIlIIlIIllIlI(String lllllllllllllllIlllIlIIIIIIIIIlI, String lllllllllllllllIlllIIlllllllllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIIIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIIIIIIlII.init(lIIlllllIlll[4], lllllllllllllllIlllIlIIIIIIIIlIl);
            return new String(lllllllllllllllIlllIlIIIIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIIIIIIIll) {
            lllllllllllllllIlllIlIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIllIIII() {
        lIIlllllIIlI = new String[lIIlllllIlll[88]];
        z.lIIlllllIIlI[z.lIIlllllIlll[0]] = z."UNKNOWN";
        z.lIIlllllIIlI[z.lIIlllllIlll[2]] = z."HEAD_RISING_1";
        z.lIIlllllIIlI[z.lIIlllllIlll[4]] = z."HEAD_RISING_2";
        z.lIIlllllIIlI[z.lIIlllllIlll[6]] = z."HEAD_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[8]] = z."HEAD_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[10]] = z."HEAD_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[12]] = z."HEAD_MIDDLE_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[14]] = z."HEAD_RIGHT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[16]] = z."HEAD_MIDDLE_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[18]] = z."HEAD_LEFT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[20]] = z."HEAD_LEFT_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[22]] = z."HEAD_RIGHT_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[24]] = z."HEAD_AUTO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[26]] = z."HEAD_AUTO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[28]] = z."HEAD_AUTO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[30]] = z."HEAD_DYING";
        z.lIIlllllIIlI[z.lIIlllllIlll[32]] = z."LEFT_HAND_IDLE1";
        z.lIIlllllIIlI[z.lIIlllllIlll[34]] = z."LEFT_HAND_CRYSTALS1";
        z.lIIlllllIIlI[z.lIIlllllIlll[36]] = z."LEFT_HAND_HEAL1";
        z.lIIlllllIIlI[z.lIIlllllIlll[38]] = z."LEFT_HAND_LIGHTNING1";
        z.lIIlllllIIlI[z.lIIlllllIlll[40]] = z."LEFT_HAND_PORTALS1";
        z.lIIlllllIIlI[z.lIIlllllIlll[42]] = z."LEFT_HAND_CRIPPLING";
        z.lIIlllllIIlI[z.lIIlllllIlll[44]] = z."LEFT_HAND_CRIPPLED";
        z.lIIlllllIIlI[z.lIIlllllIlll[46]] = z."LEFT_HAND_UNCRIPPLING1";
        z.lIIlllllIIlI[z.lIIlllllIlll[48]] = z."LEFT_HAND_UNCRIPPLING2";
        z.lIIlllllIIlI[z.lIIlllllIlll[50]] = z."LEFT_HAND_IDLE2";
        z.lIIlllllIIlI[z.lIIlllllIlll[52]] = z."LEFT_HAND_CRYSTALS2";
        z.lIIlllllIIlI[z.lIIlllllIlll[54]] = z."LEFT_HAND_HEAL2";
        z.lIIlllllIIlI[z.lIIlllllIlll[56]] = z."LEFT_HAND_LIGHTNING2";
        z.lIIlllllIIlI[z.lIIlllllIlll[58]] = z."LEFT_HAND_PORTALS2";
        z.lIIlllllIIlI[z.lIIlllllIlll[60]] = z."LEFT_HAND_DYING";
        z.lIIlllllIIlI[z.lIIlllllIlll[62]] = z."HEAD_ENRAGED_AUTO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[64]] = z."HEAD_ENRAGED_AUTO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[66]] = z."HEAD_ENRAGED_AUTO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[68]] = z."HEAD_ENRAGED_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[70]] = z."HEAD_ENRAGED_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[72]] = z."HEAD_ENRAGED_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[74]] = z."HEAD_ENRAGED_MIDDLE_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[76]] = z."HEAD_ENRAGED_LEFT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[78]] = z."HEAD_ENRAGED_LEFT_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[80]] = z."HEAD_ENRAGED_RIGHT_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[82]] = z."HEAD_ENRAGED_MIDDLE_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[84]] = z."HEAD_ENRAGED_RIGHT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[86]] = z."HEAD_ENRAGED_RISING_2";
    }

    public static z r(int n2) {
        z z2 = LOOKUP.get(n2);
        if (z.llIlIIlIllIIlI((Object)z2)) {
            return UNKNOWN;
        }
        return z2;
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    private static boolean llIlIIlIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private z(int n3) {
        this.id = n3;
        this.move = lIIlllllIlll[0];
    }

    public int bw() {
        return this.id;
    }

    public boolean bx() {
        return this.move;
    }
}

