/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class M
extends Enum<M> {
    public static final /* synthetic */ /* enum */ M RAIDS_SHAMANS1;
    public static final /* synthetic */ /* enum */ M RAIDS_SCAVENGERS12;
    public static final /* synthetic */ /* enum */ M RAIDS_GUARDIANS2;
    public static final /* synthetic */ /* enum */ M RAIDS_TEKTON1;
    public static final /* synthetic */ /* enum */ M RAIDS_LOBBY2;
    public static final /* synthetic */ /* enum */ M RAIDS_FARMING12;
    public static final /* synthetic */ /* enum */ M RAIDS_EMPTY;
    public static final /* synthetic */ /* enum */ M RAIDS_VANGUARDS2;
    public static final /* synthetic */ /* enum */ M RAIDS_FARMING23;
    public static final /* synthetic */ /* enum */ M RAIDS_END2;
    public static final /* synthetic */ /* enum */ M RAIDS_VESPULA1;
    public static final /* synthetic */ /* enum */ M RAIDS_VASA3;
    public static final /* synthetic */ /* enum */ M RAIDS_VANGUARDS1;
    private static /* synthetic */ String[] lIlIllIlIllI;
    public static final /* synthetic */ /* enum */ M RAIDS_END3;
    public static final /* synthetic */ /* enum */ M RAIDS_FARMING21;
    public static final /* synthetic */ /* enum */ M RAIDS_MYSTICS3;
    public static final /* synthetic */ /* enum */ M RAIDS_GUARDIANS1;
    public static final /* synthetic */ /* enum */ M RAIDS_VASA2;
    public static final /* synthetic */ /* enum */ M RAIDS_MYSTICS2;
    public static final /* synthetic */ /* enum */ M RAIDS_START3;
    public static final /* synthetic */ /* enum */ M RAIDS_LOBBY1;
    private static final /* synthetic */ M[] $VALUES;
    public static final /* synthetic */ /* enum */ M RAIDS_START2;
    public static final /* synthetic */ /* enum */ M RAIDS_LOBBY3;
    public static final /* synthetic */ /* enum */ M RAIDS_CRABS2;
    public static final /* synthetic */ /* enum */ M RAIDS_CRABS3;
    public static final /* synthetic */ /* enum */ M RAIDS_VESPULA2;
    public static final /* synthetic */ /* enum */ M RAIDS_THIEVING2;
    public static final /* synthetic */ /* enum */ M RAIDS_END1;
    public static final /* synthetic */ /* enum */ M RAIDS_FARMING13;
    public static final /* synthetic */ /* enum */ M RAIDS_ICE_DEMON1;
    public static final /* synthetic */ /* enum */ M RAIDS_TEKTON2;
    private final /* synthetic */ int baseY;
    public static final /* synthetic */ /* enum */ M RAIDS_VASA1;
    public static final /* synthetic */ /* enum */ M RAIDS_ICE_DEMON2;
    private final /* synthetic */ int width;
    public static final /* synthetic */ /* enum */ M RAIDS_ICE_DEMON3;
    public static final /* synthetic */ /* enum */ M RAIDS_TIGHTROPE2;
    private final /* synthetic */ int baseX;
    public static final /* synthetic */ /* enum */ M RAIDS_MUTTADILES2;
    public static final /* synthetic */ /* enum */ M RAIDS_SCAVENGERS11;
    public static final /* synthetic */ /* enum */ M RAIDS_SHAMANS2;
    public static final /* synthetic */ /* enum */ M RAIDS_MUTTADILES1;
    public static final /* synthetic */ /* enum */ M RAIDS_TIGHTROPE1;
    public static final /* synthetic */ /* enum */ M RAIDS_THIEVING3;
    public static final /* synthetic */ /* enum */ M RAIDS_CRABS1;
    public static final /* synthetic */ /* enum */ M RAIDS_SHAMANS3;
    public static final /* synthetic */ /* enum */ M RAIDS_MUTTADILES3;
    private static /* synthetic */ int[] lIlIllIllIIl;
    public static final /* synthetic */ /* enum */ M RAIDS_FARMING11;
    public static final /* synthetic */ /* enum */ M RAIDS_TIGHTROPE3;
    public static final /* synthetic */ /* enum */ M RAIDS_MYSTICS1;
    public static final /* synthetic */ /* enum */ M RAIDS_SCAVENGERS23;
    public static final /* synthetic */ /* enum */ M RAIDS_TEKTON3;
    public static final /* synthetic */ /* enum */ M RAIDS_VESPULA3;
    public static final /* synthetic */ /* enum */ M RAIDS_SCAVENGERS13;
    private final /* synthetic */ int height;
    public static final /* synthetic */ /* enum */ M RAIDS_SCAVENGERS21;
    public static final /* synthetic */ /* enum */ M RAIDS_SCAVENGERS22;
    private final /* synthetic */ int plane;
    public static final /* synthetic */ /* enum */ M RAIDS_START1;
    public static final /* synthetic */ /* enum */ M RAIDS_VANGUARDS3;
    public static final /* synthetic */ /* enum */ M RAIDS_FARMING22;
    public static final /* synthetic */ /* enum */ M RAIDS_THIEVING1;
    public static final /* synthetic */ /* enum */ M RAIDS_GUARDIANS3;

    public static M[] values() {
        return (M[])$VALUES.clone();
    }

    public int bS() {
        return this.baseX;
    }

    public int bU() {
        return this.plane;
    }

    public int bV() {
        return this.width;
    }

    /*
     * WARNING - void declaration
     */
    public static M x(int n2) {
        void lllllllllllllllIllIIlIIlllIIIllI;
        int n3 = n2 >> lIlIllIllIIl[0] & lIlIllIllIIl[1];
        int n4 = (n2 >> lIlIllIllIIl[1] & lIlIllIllIIl[2]) * lIlIllIllIIl[3];
        int n5 = (n2 >> lIlIllIllIIl[4] & lIlIllIllIIl[5]) * lIlIllIllIIl[3];
        int n6 = n2 >> lIlIllIllIIl[6] & lIlIllIllIIl[1];
        M[] mArray = M.values();
        int n7 = mArray.length;
        int lllllllllllllllIllIIlIIlllIIIlIl = lIlIllIllIIl[7];
        while (M.lllIIIIIlllIll(lllllllllllllllIllIIlIIlllIIIlIl, (int)lllllllllllllllIllIIlIIlllIIIllI)) {
            void lllllllllllllllIllIIlIIlllIIlIlI;
            void lllllllllllllllIllIIlIIlllIIlIIl;
            void lllllllllllllllIllIIlIIlllIIlIII;
            void lllllllllllllllIllIIlIIlllIIIlll;
            void lllllllllllllllIllIIlIIlllIIIlII = lllllllllllllllIllIIlIIlllIIIlll[lllllllllllllllIllIIlIIlllIIIlIl];
            if (M.lllIIIIIllllII((int)lllllllllllllllIllIIlIIlllIIlIII, lllllllllllllllIllIIlIIlllIIIlII.bU()) && M.lllIIIIIllllIl((int)lllllllllllllllIllIIlIIlllIIlIIl, lllllllllllllllIllIIlIIlllIIIlII.bS()) && M.lllIIIIIlllIll((int)lllllllllllllllIllIIlIIlllIIlIIl, lllllllllllllllIllIIlIIlllIIIlII.bS() + lllllllllllllllIllIIlIIlllIIIlII.bV()) && M.lllIIIIIllllIl((int)lllllllllllllllIllIIlIIlllIIlIlI, lllllllllllllllIllIIlIIlllIIIlII.bT()) && M.lllIIIIIlllIll((int)lllllllllllllllIllIIlIIlllIIlIlI, lllllllllllllllIllIIlIIlllIIIlII.bT() + lllllllllllllllIllIIlIIlllIIIlII.bW())) {
                return lllllllllllllllIllIIlIIlllIIIlII;
            }
            ++lllllllllllllllIllIIlIIlllIIIlIl;
            0;
            if (2 != 0) continue;
            return null;
        }
        return null;
    }

    private static String lllIIIIIlIlllI(String lllllllllllllllIllIIlIIllIIlllll, String lllllllllllllllIllIIlIIllIIllllI) {
        lllllllllllllllIllIIlIIllIIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlIIllIIlllIl = new StringBuilder();
        char[] lllllllllllllllIllIIlIIllIIlllII = lllllllllllllllIllIIlIIllIIllllI.toCharArray();
        int lllllllllllllllIllIIlIIllIIllIll = lIlIllIllIIl[7];
        char[] lllllllllllllllIllIIlIIllIIlIlIl = lllllllllllllllIllIIlIIllIIlllll.toCharArray();
        int lllllllllllllllIllIIlIIllIIlIlII = lllllllllllllllIllIIlIIllIIlIlIl.length;
        int lllllllllllllllIllIIlIIllIIlIIll = lIlIllIllIIl[7];
        while (M.lllIIIIIlllIll(lllllllllllllllIllIIlIIllIIlIIll, lllllllllllllllIllIIlIIllIIlIlII)) {
            char lllllllllllllllIllIIlIIllIlIIIII = lllllllllllllllIllIIlIIllIIlIlIl[lllllllllllllllIllIIlIIllIIlIIll];
            lllllllllllllllIllIIlIIllIIlllIl.append((char)(lllllllllllllllIllIIlIIllIlIIIII ^ lllllllllllllllIllIIlIIllIIlllII[lllllllllllllllIllIIlIIllIIllIll % lllllllllllllllIllIIlIIllIIlllII.length]));
            0;
            ++lllllllllllllllIllIIlIIllIIllIll;
            ++lllllllllllllllIllIIlIIllIIlIIll;
            0;
            if (((54 + 88 - 105 + 90 ^ (0x66 ^ 0x7B)) & (0xBC ^ 0xB4 ^ (0xFB ^ 0x91) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIlIIllIIlllIl);
    }

    private static boolean lllIIIIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIIIIIlIllll(String lllllllllllllllIllIIlIIllIlIllll, String lllllllllllllllIllIIlIIllIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIllIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIIllIllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIIllIllIIIl.init(lIlIllIllIIl[12], lllllllllllllllIllIIlIIllIllIIlI);
            return new String(lllllllllllllllIllIIlIIllIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIIllIllIIII) {
            lllllllllllllllIllIIlIIllIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIIIIIlllIIl() {
        lIlIllIlIllI = new String[lIlIllIllIIl[73]];
        M.lIlIllIlIllI[M.lIlIllIllIIl[7]] = M."RAIDS_LOBBY1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[0]] = M."RAIDS_LOBBY2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[12]] = M."RAIDS_LOBBY3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[1]] = M."RAIDS_START1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[15]] = M."RAIDS_START2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[16]] = M."RAIDS_START3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[17]] = M."RAIDS_END1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[19]] = M."RAIDS_END2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[3]] = M."RAIDS_END3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[20]] = M."RAIDS_SCAVENGERS11";
        M.lIlIllIlIllI[M.lIlIllIllIIl[22]] = M."RAIDS_SCAVENGERS12";
        M.lIlIllIlIllI[M.lIlIllIllIIl[23]] = M."RAIDS_SCAVENGERS13";
        M.lIlIllIlIllI[M.lIlIllIllIIl[24]] = M."RAIDS_SHAMANS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[26]] = M."RAIDS_SHAMANS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[4]] = M."RAIDS_SHAMANS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[27]] = M."RAIDS_VASA1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[29]] = M."RAIDS_VASA2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[30]] = M."RAIDS_VASA3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[31]] = M."RAIDS_VANGUARDS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[33]] = M."RAIDS_VANGUARDS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[34]] = M."RAIDS_VANGUARDS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[35]] = M."RAIDS_ICE_DEMON1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[37]] = M."RAIDS_ICE_DEMON2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[38]] = M."RAIDS_ICE_DEMON3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[6]] = M."RAIDS_THIEVING1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[40]] = M."RAIDS_THIEVING2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[41]] = M."RAIDS_THIEVING3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[42]] = M."RAIDS_FARMING11";
        M.lIlIllIlIllI[M.lIlIllIllIIl[44]] = M."RAIDS_FARMING12";
        M.lIlIllIlIllI[M.lIlIllIllIIl[45]] = M."RAIDS_FARMING13";
        M.lIlIllIlIllI[M.lIlIllIllIIl[46]] = M."RAIDS_SCAVENGERS21";
        M.lIlIllIlIllI[M.lIlIllIllIIl[47]] = M."RAIDS_SCAVENGERS22";
        M.lIlIllIlIllI[M.lIlIllIllIIl[8]] = M."RAIDS_SCAVENGERS23";
        M.lIlIllIlIllI[M.lIlIllIllIIl[48]] = M."RAIDS_MUTTADILES1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[49]] = M."RAIDS_MUTTADILES2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[50]] = M."RAIDS_MUTTADILES3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[51]] = M."RAIDS_MYSTICS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[52]] = M."RAIDS_MYSTICS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[53]] = M."RAIDS_MYSTICS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[54]] = M."RAIDS_TEKTON1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[55]] = M."RAIDS_TEKTON2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[56]] = M."RAIDS_TEKTON3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[57]] = M."RAIDS_TIGHTROPE1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[58]] = M."RAIDS_TIGHTROPE2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[59]] = M."RAIDS_TIGHTROPE3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[60]] = M."RAIDS_FARMING21";
        M.lIlIllIlIllI[M.lIlIllIllIIl[61]] = M."RAIDS_FARMING22";
        M.lIlIllIlIllI[M.lIlIllIllIIl[62]] = M."RAIDS_FARMING23";
        M.lIlIllIlIllI[M.lIlIllIllIIl[63]] = M."RAIDS_GUARDIANS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[64]] = M."RAIDS_GUARDIANS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[65]] = M."RAIDS_GUARDIANS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[66]] = M."RAIDS_VESPULA1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[67]] = M."RAIDS_VESPULA2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[68]] = M."RAIDS_VESPULA3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[69]] = M."RAIDS_CRABS1";
        M.lIlIllIlIllI[M.lIlIllIllIIl[70]] = M."RAIDS_CRABS2";
        M.lIlIllIlIllI[M.lIlIllIllIIl[71]] = M."RAIDS_CRABS3";
        M.lIlIllIlIllI[M.lIlIllIllIIl[72]] = M."RAIDS_EMPTY";
    }

    public static M valueOf(String string) {
        return Enum.valueOf(M.class, string);
    }

    public int bW() {
        return this.height;
    }

    private static void lllIIIIIlllIlI() {
        lIlIllIllIIl = new int[74];
        M.lIlIllIllIIl[0] = 1;
        M.lIlIllIllIIl[1] = 3;
        M.lIlIllIllIIl[2] = -(0xFFFFF873 & 0x5F8D) & (0xFFFFFFFF & 0x5FFF);
        M.lIlIllIllIIl[3] = 0xA5 ^ 0xB4 ^ (0xAB ^ 0xB2);
        M.lIlIllIllIIl[4] = 0xA ^ 0x40 ^ (0x82 ^ 0xC6);
        M.lIlIllIllIIl[5] = 0xFFFFEBFF & 0x17FF;
        M.lIlIllIllIIl[6] = 0x65 ^ 0x7D;
        M.lIlIllIllIIl[7] = (0x14 ^ 0x52 ^ (0xCE ^ 0x9A)) & (99 + 135 - 105 + 36 ^ 125 + 6 - -18 + 34 ^ -1);
        M.lIlIllIllIIl[8] = 150 + 144 - 293 + 176 ^ 80 + 15 - -33 + 17;
        M.lIlIllIllIIl[9] = -(0xFFFFF5E8 & 0x7B3F) & (0xFFFFFFFF & 0x7DE7);
        M.lIlIllIllIIl[10] = 0xFFFFFD7F & 0x16C0;
        M.lIlIllIllIIl[11] = 0xFFFFACF7 & 0x5FE8;
        M.lIlIllIllIIl[12] = 2;
        M.lIlIllIllIIl[13] = 0xFFFFFD04 & 0xFFB;
        M.lIlIllIllIIl[14] = -(0xFFFFFAC9 & 0x4DF6) & (0xFFFFDEFF & Short.MAX_VALUE);
        M.lIlIllIllIIl[15] = 0x4F ^ 0x4B;
        M.lIlIllIllIIl[16] = 49 + 63 - 93 + 156 ^ 148 + 33 - 42 + 31;
        M.lIlIllIllIIl[17] = 0x33 ^ 0x35;
        M.lIlIllIllIIl[18] = 0xFFFFF426 & 0x1FF9;
        M.lIlIllIllIIl[19] = 0x38 ^ 0x3F;
        M.lIlIllIllIIl[20] = 0xBB ^ 0x93 ^ (0x87 ^ 0xA6);
        M.lIlIllIllIIl[21] = 0xFFFF94EC & 0x7F73;
        M.lIlIllIllIIl[22] = 0x59 ^ 0x53;
        M.lIlIllIllIIl[23] = 0xB9 ^ 0xB2;
        M.lIlIllIllIIl[24] = 4 + 76 - -11 + 77 ^ 133 + 33 - 143 + 141;
        M.lIlIllIllIIl[25] = 0xFFFFBDC4 & 0x56BB;
        M.lIlIllIllIIl[26] = 0x1A ^ 0x64 ^ (0x4B ^ 0x38);
        M.lIlIllIllIIl[27] = 7 ^ 0xA ^ 2;
        M.lIlIllIllIIl[28] = -(0xFFFFAFDF & 0x5A7B) & (0xFFFFFEFB & 0x1FFE);
        M.lIlIllIllIIl[29] = 0x4D ^ 0x1A ^ (0x7F ^ 0x38);
        M.lIlIllIllIIl[30] = (0x31 ^ 0x2B) & ~(0x17 ^ 0xD) ^ (0xA3 ^ 0xB2);
        M.lIlIllIllIIl[31] = 0xA3 ^ 0xB1;
        M.lIlIllIllIIl[32] = -(0xFFFFE8FF & 0x3F0A) & (0xFFFFFEDD & 0x3DEB);
        M.lIlIllIllIIl[33] = 0x97 ^ 0xBB ^ (0x42 ^ 0x7D);
        M.lIlIllIllIIl[34] = 0x6D ^ 0x79;
        M.lIlIllIllIIl[35] = 0x23 ^ 0x36;
        M.lIlIllIllIIl[36] = 0xFFFFFDFA & 0x16E5;
        M.lIlIllIllIIl[37] = 0xD ^ 0x2D ^ (0x49 ^ 0x7F);
        M.lIlIllIllIIl[38] = 0x7E ^ 0x69;
        M.lIlIllIllIIl[39] = -(148 + 0 - 113 + 124) & (0xFFFF9FFE & 0x759F);
        M.lIlIllIllIIl[40] = 0x74 ^ 0x5B ^ (0xF2 ^ 0xC4);
        M.lIlIllIllIIl[41] = 0xC1 ^ 0xC4 ^ (0x42 ^ 0x5D);
        M.lIlIllIllIIl[42] = 0x48 ^ 0x53;
        M.lIlIllIllIIl[43] = -(0xFFFFCAAF & 0x7F57) & (0xFFFFFF67 & 0x5FDE);
        M.lIlIllIllIIl[44] = 0x33 ^ 0x2F;
        M.lIlIllIllIIl[45] = 0x1F ^ 2;
        M.lIlIllIllIIl[46] = 0x8A ^ 0x94;
        M.lIlIllIllIIl[47] = 0x32 ^ 0x4A ^ (0x4D ^ 0x2A);
        M.lIlIllIllIIl[48] = 0xB7 ^ 0x96;
        M.lIlIllIllIIl[49] = 0x79 ^ 0xC ^ (0xEB ^ 0xBC);
        M.lIlIllIllIIl[50] = 0x5D ^ 0x7E;
        M.lIlIllIllIIl[51] = 0x1F ^ 0x3B;
        M.lIlIllIllIIl[52] = 0xA7 ^ 0x82;
        M.lIlIllIllIIl[53] = 0x96 ^ 0x9D ^ (0x3F ^ 0x12);
        M.lIlIllIllIIl[54] = 59 + 43 - -37 + 50 ^ 131 + 68 - 188 + 143;
        M.lIlIllIllIIl[55] = 2 ^ (0xA ^ 0x20);
        M.lIlIllIllIIl[56] = 0x14 ^ 0x12 ^ (0x14 ^ 0x3B);
        M.lIlIllIllIIl[57] = 0x51 ^ 0x7B;
        M.lIlIllIllIIl[58] = 0xBF ^ 0x87 ^ (0x76 ^ 0x65);
        M.lIlIllIllIIl[59] = 144 + 105 - 206 + 116 ^ 98 + 84 - 67 + 64;
        M.lIlIllIllIIl[60] = 0x8E ^ 0xA3;
        M.lIlIllIllIIl[61] = 24 + 95 - 87 + 104 ^ 12 + 155 - 12 + 11;
        M.lIlIllIllIIl[62] = 103 + 119 - 125 + 33 ^ 71 + 114 - 66 + 54;
        M.lIlIllIllIIl[63] = 0xA8 ^ 0x98;
        M.lIlIllIllIIl[64] = 80 + 101 - 78 + 66 ^ 56 + 34 - -30 + 32;
        M.lIlIllIllIIl[65] = 0xEC ^ 0xB1 ^ (0x7D ^ 0x12);
        M.lIlIllIllIIl[66] = 114 + 7 - 109 + 123 ^ 20 + 163 - 91 + 88;
        M.lIlIllIllIIl[67] = 0x92 ^ 0xA6;
        M.lIlIllIllIIl[68] = 0x9E ^ 0xAB;
        M.lIlIllIllIIl[69] = 0x2D ^ 0x1B;
        M.lIlIllIllIIl[70] = 0x5E ^ 0x69;
        M.lIlIllIllIIl[71] = 0x88 ^ 0xB0;
        M.lIlIllIllIIl[72] = 0x2F ^ 0x16;
        M.lIlIllIllIIl[73] = 0x45 ^ 0xD ^ (0x1B ^ 0x69);
    }

    private M(int n3, int n4, int n5) {
        this.baseX = n3;
        this.baseY = n4;
        this.plane = n5;
        this.width = lIlIllIllIIl[8];
        this.height = lIlIllIllIIl[8];
    }

    public int bT() {
        return this.baseY;
    }

    private static String lllIIIIIlIllIl(String lllllllllllllllIllIIlIIllIlllIlI, String lllllllllllllllIllIIlIIllIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIllIIl[3]), "DES");
            Cipher lllllllllllllllIllIIlIIllIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIIllIlllllI.init(lIlIllIllIIl[12], lllllllllllllllIllIIlIIllIllllll);
            return new String(lllllllllllllllIllIIlIIllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIIllIllllIl) {
            lllllllllllllllIllIIlIIllIllllIl.printStackTrace();
            return null;
        }
    }

    static {
        M.lllIIIIIlllIlI();
        M.lllIIIIIlllIIl();
        RAIDS_LOBBY1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_LOBBY2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_LOBBY3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_START1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_START2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_START3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_END1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_END2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_END3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS11 = new M(lIlIllIllIIl[9], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS12 = new M(lIlIllIllIIl[11], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS13 = new M(lIlIllIllIIl[13], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SHAMANS1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_SHAMANS2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_SHAMANS3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_VASA1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VASA2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VASA3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_THIEVING1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_THIEVING2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_THIEVING3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_FARMING11 = new M(lIlIllIllIIl[9], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_FARMING12 = new M(lIlIllIllIIl[11], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_FARMING13 = new M(lIlIllIllIIl[13], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS21 = new M(lIlIllIllIIl[9], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_SCAVENGERS22 = new M(lIlIllIllIIl[11], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_SCAVENGERS23 = new M(lIlIllIllIIl[13], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MYSTICS1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_MYSTICS2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_MYSTICS3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_TEKTON1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TEKTON2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TEKTON3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_FARMING21 = new M(lIlIllIllIIl[9], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_FARMING22 = new M(lIlIllIllIIl[11], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_FARMING23 = new M(lIlIllIllIIl[13], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_GUARDIANS1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_GUARDIANS2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_GUARDIANS3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_VESPULA1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_VESPULA2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_VESPULA3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_CRABS1 = new M(lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_CRABS2 = new M(lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_CRABS3 = new M(lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_EMPTY = new M(lIlIllIllIIl[7], lIlIllIllIIl[7], lIlIllIllIIl[7]);
        M[] mArray = new M[lIlIllIllIIl[73]];
        mArray[M.lIlIllIllIIl[7]] = RAIDS_LOBBY1;
        mArray[M.lIlIllIllIIl[0]] = RAIDS_LOBBY2;
        mArray[M.lIlIllIllIIl[12]] = RAIDS_LOBBY3;
        mArray[M.lIlIllIllIIl[1]] = RAIDS_START1;
        mArray[M.lIlIllIllIIl[15]] = RAIDS_START2;
        mArray[M.lIlIllIllIIl[16]] = RAIDS_START3;
        mArray[M.lIlIllIllIIl[17]] = RAIDS_END1;
        mArray[M.lIlIllIllIIl[19]] = RAIDS_END2;
        mArray[M.lIlIllIllIIl[3]] = RAIDS_END3;
        mArray[M.lIlIllIllIIl[20]] = RAIDS_SCAVENGERS11;
        mArray[M.lIlIllIllIIl[22]] = RAIDS_SCAVENGERS12;
        mArray[M.lIlIllIllIIl[23]] = RAIDS_SCAVENGERS13;
        mArray[M.lIlIllIllIIl[24]] = RAIDS_SHAMANS1;
        mArray[M.lIlIllIllIIl[26]] = RAIDS_SHAMANS2;
        mArray[M.lIlIllIllIIl[4]] = RAIDS_SHAMANS3;
        mArray[M.lIlIllIllIIl[27]] = RAIDS_VASA1;
        mArray[M.lIlIllIllIIl[29]] = RAIDS_VASA2;
        mArray[M.lIlIllIllIIl[30]] = RAIDS_VASA3;
        mArray[M.lIlIllIllIIl[31]] = RAIDS_VANGUARDS1;
        mArray[M.lIlIllIllIIl[33]] = RAIDS_VANGUARDS2;
        mArray[M.lIlIllIllIIl[34]] = RAIDS_VANGUARDS3;
        mArray[M.lIlIllIllIIl[35]] = RAIDS_ICE_DEMON1;
        mArray[M.lIlIllIllIIl[37]] = RAIDS_ICE_DEMON2;
        mArray[M.lIlIllIllIIl[38]] = RAIDS_ICE_DEMON3;
        mArray[M.lIlIllIllIIl[6]] = RAIDS_THIEVING1;
        mArray[M.lIlIllIllIIl[40]] = RAIDS_THIEVING2;
        mArray[M.lIlIllIllIIl[41]] = RAIDS_THIEVING3;
        mArray[M.lIlIllIllIIl[42]] = RAIDS_FARMING11;
        mArray[M.lIlIllIllIIl[44]] = RAIDS_FARMING12;
        mArray[M.lIlIllIllIIl[45]] = RAIDS_FARMING13;
        mArray[M.lIlIllIllIIl[46]] = RAIDS_SCAVENGERS21;
        mArray[M.lIlIllIllIIl[47]] = RAIDS_SCAVENGERS22;
        mArray[M.lIlIllIllIIl[8]] = RAIDS_SCAVENGERS23;
        mArray[M.lIlIllIllIIl[48]] = RAIDS_MUTTADILES1;
        mArray[M.lIlIllIllIIl[49]] = RAIDS_MUTTADILES2;
        mArray[M.lIlIllIllIIl[50]] = RAIDS_MUTTADILES3;
        mArray[M.lIlIllIllIIl[51]] = RAIDS_MYSTICS1;
        mArray[M.lIlIllIllIIl[52]] = RAIDS_MYSTICS2;
        mArray[M.lIlIllIllIIl[53]] = RAIDS_MYSTICS3;
        mArray[M.lIlIllIllIIl[54]] = RAIDS_TEKTON1;
        mArray[M.lIlIllIllIIl[55]] = RAIDS_TEKTON2;
        mArray[M.lIlIllIllIIl[56]] = RAIDS_TEKTON3;
        mArray[M.lIlIllIllIIl[57]] = RAIDS_TIGHTROPE1;
        mArray[M.lIlIllIllIIl[58]] = RAIDS_TIGHTROPE2;
        mArray[M.lIlIllIllIIl[59]] = RAIDS_TIGHTROPE3;
        mArray[M.lIlIllIllIIl[60]] = RAIDS_FARMING21;
        mArray[M.lIlIllIllIIl[61]] = RAIDS_FARMING22;
        mArray[M.lIlIllIllIIl[62]] = RAIDS_FARMING23;
        mArray[M.lIlIllIllIIl[63]] = RAIDS_GUARDIANS1;
        mArray[M.lIlIllIllIIl[64]] = RAIDS_GUARDIANS2;
        mArray[M.lIlIllIllIIl[65]] = RAIDS_GUARDIANS3;
        mArray[M.lIlIllIllIIl[66]] = RAIDS_VESPULA1;
        mArray[M.lIlIllIllIIl[67]] = RAIDS_VESPULA2;
        mArray[M.lIlIllIllIIl[68]] = RAIDS_VESPULA3;
        mArray[M.lIlIllIllIIl[69]] = RAIDS_CRABS1;
        mArray[M.lIlIllIllIIl[70]] = RAIDS_CRABS2;
        mArray[M.lIlIllIllIIl[71]] = RAIDS_CRABS3;
        mArray[M.lIlIllIllIIl[72]] = RAIDS_EMPTY;
        $VALUES = mArray;
    }

    private static boolean lllIIIIIllllII(int n2, int n3) {
        return n2 == n3;
    }
}

