/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f GOLOVANOVA;
    public static final /* synthetic */ /* enum */ f LOGAVANO;
    private static /* synthetic */ String[] lIlIIIIIIIIlI;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f EMPTY;
    public static final /* synthetic */ /* enum */ f BOLOGANO;
    private static final /* synthetic */ Map<Integer, f> plantTypes;
    private final /* synthetic */ String name;
    private final /* synthetic */ int baseId;
    private final /* synthetic */ int[] objectIds;
    private static /* synthetic */ int[] lIlIIIIIIIlII;

    private static String lIllIllIIlllIll(String llllllllllllllIlllIIlIlIIIlllIII, String llllllllllllllIlllIIlIlIIIllIlll) {
        llllllllllllllIlllIIlIlIIIlllIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlIIIlllIll = new StringBuilder();
        char[] llllllllllllllIlllIIlIlIIIlllIlI = llllllllllllllIlllIIlIlIIIllIlll.toCharArray();
        int llllllllllllllIlllIIlIlIIIlllIIl = lIlIIIIIIIlII[0];
        char[] llllllllllllllIlllIIlIlIIIllIIll = llllllllllllllIlllIIlIlIIIlllIII.toCharArray();
        int llllllllllllllIlllIIlIlIIIllIIlI = llllllllllllllIlllIIlIlIIIllIIll.length;
        int llllllllllllllIlllIIlIlIIIllIIIl = lIlIIIIIIIlII[0];
        while (f.lIllIllIIllllll(llllllllllllllIlllIIlIlIIIllIIIl, llllllllllllllIlllIIlIlIIIllIIlI)) {
            char llllllllllllllIlllIIlIlIIIlllllI = llllllllllllllIlllIIlIlIIIllIIll[llllllllllllllIlllIIlIlIIIllIIIl];
            llllllllllllllIlllIIlIlIIIlllIll.append((char)(llllllllllllllIlllIIlIlIIIlllllI ^ llllllllllllllIlllIIlIlIIIlllIlI[llllllllllllllIlllIIlIlIIIlllIIl % llllllllllllllIlllIIlIlIIIlllIlI.length]));
            0;
            ++llllllllllllllIlllIIlIlIIIlllIIl;
            ++llllllllllllllIlllIIlIlIIIllIIIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIlIIIlllIll);
    }

    private static void lIllIllIIlllllI() {
        lIlIIIIIIIlII = new int[46];
        f.lIlIIIIIIIlII[0] = (0x6C ^ 0x1A ^ (0xD0 ^ 0x97)) & (0x14 ^ 0x55 ^ (0x36 ^ 0x46) ^ -1);
        f.lIlIIIIIIIlII[1] = 1;
        f.lIlIIIIIIIlII[2] = -(0xFFFF97B9 & 0x7C4F) & (0xFFFFFFFF & 0x7EFF);
        f.lIlIIIIIIIlII[3] = 2;
        f.lIlIIIIIIIlII[4] = 3;
        f.lIlIIIIIIIlII[5] = 0xFFFFFBBB & 0x6F45;
        f.lIlIIIIIIIlII[6] = 108 + 20 - 30 + 45 ^ 119 + 87 - 205 + 131;
        f.lIlIIIIIIIlII[7] = -(0xFFFFD6E7 & 0x3D1D) & (0xFFFFFEFE & 0x7FFD);
        f.lIlIIIIIIIlII[8] = -1 & (0xFFFFEBFF & 0x7EF9);
        f.lIlIIIIIIIlII[9] = -(0xFFFFD55B & 0x3EA6) & (0xFFFFFEFB & Short.MAX_VALUE);
        f.lIlIIIIIIIlII[10] = 0xFFFFFBFF & 0x6EFB;
        f.lIlIIIIIIIlII[11] = 0x3B ^ 0x4B ^ (0xDD ^ 0xA9);
        f.lIlIIIIIIIlII[12] = 0xFFFFFBFC & 0x6EFF;
        f.lIlIIIIIIIlII[13] = 46 + 36 - -16 + 77 ^ 146 + 69 - 50 + 5;
        f.lIlIIIIIIIlII[14] = 0xFFFFEAFF & 0x7FFD;
        f.lIlIIIIIIIlII[15] = 50 + 19 - -82 + 5 ^ 6 + 129 - -7 + 12;
        f.lIlIIIIIIIlII[16] = 0xFFFFEAFF & 0x7FFE;
        f.lIlIIIIIIIlII[17] = 0x6E ^ 0x69;
        f.lIlIIIIIIIlII[18] = -(0xFFFFE513 & 0x1FED) & (0xFFFFEFFF & Short.MAX_VALUE);
        f.lIlIIIIIIIlII[19] = 0xCF ^ 0xA7 ^ (0xE9 ^ 0x89);
        f.lIlIIIIIIIlII[20] = -(29 + 209 - 90 + 62) & (0xFFFFFBFB & 0x6FD5);
        f.lIlIIIIIIIlII[21] = 0x77 ^ 0x7E;
        f.lIlIIIIIIIlII[22] = 0xFF ^ 0xBE ^ (0x23 ^ 0x68);
        f.lIlIIIIIIIlII[23] = -(100 + 173 - 166 + 78) & (0xFFFFFBBF & 0x6FFA);
        f.lIlIIIIIIIlII[24] = -(0xFFFFCFF4 & 0x340F) & (0xFFFFEF0F & Short.MAX_VALUE);
        f.lIlIIIIIIIlII[25] = 0xFFFFEF67 & 0x7B9B;
        f.lIlIIIIIIIlII[26] = 0xFFFFEB24 & 0x7FDF;
        f.lIlIIIIIIIlII[27] = 0xFFFFFFEF & 0x6B15;
        f.lIlIIIIIIIlII[28] = 0xFFFFFFB6 & 0x6B4F;
        f.lIlIIIIIIIlII[29] = -(35 + 48 - -35 + 131) & (0xFFFFEFFF & 0x7BFF);
        f.lIlIIIIIIIlII[30] = 0xFFFFFF29 & 0x6BDE;
        f.lIlIIIIIIIlII[31] = 0xFFFFEF59 & 0x7BAF;
        f.lIlIIIIIIIlII[32] = 0xFFFFEB2A & 0x7FDF;
        f.lIlIIIIIIIlII[33] = 0xFFFFFFFB & 0x6B0F;
        f.lIlIIIIIIIlII[34] = 0xFFFFFB8F & 0x6F7D;
        f.lIlIIIIIIIlII[35] = -(0xFFFFF7ED & 0xC3B) & (0xFFFFEF3F & Short.MAX_VALUE);
        f.lIlIIIIIIIlII[36] = -(0xFFFFCDFD & 0x36E3) & (0xFFFFEFEE & Short.MAX_VALUE);
        f.lIlIIIIIIIlII[37] = -(0xFFFF97FD & 0x7863) & (0xFFFFFB6F & Short.MAX_VALUE);
        f.lIlIIIIIIIlII[38] = -(0xFFFFB7FE & 0x5CCF) & (0xFFFFFFDD & Short.MAX_VALUE);
        f.lIlIIIIIIIlII[39] = 0xFFFFFF3F & 0x6BD1;
        f.lIlIIIIIIIlII[40] = 0xFFFFFF7B & 0x6B96;
        f.lIlIIIIIIIlII[41] = 0xFFFFFBFF & 0x6F13;
        f.lIlIIIIIIIlII[42] = -(0xF6 ^ 0xB5) & (0xFFFFFFF6 & 0x6B5F);
        f.lIlIIIIIIIlII[43] = -(0x1E ^ 0x75) & (0xFFFFFFFF & 0x6B7F);
        f.lIlIIIIIIIlII[44] = 0xFFFFEFFF & 0x7B16;
        f.lIlIIIIIIIlII[45] = -(0x20 ^ 0x46) & (0xFFFFFB7F & 0x6FFD);
    }

    private static void lIllIllIIllllII() {
        lIlIIIIIIIIlI = new String[lIlIIIIIIIlII[19]];
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[0]] = f."EMPTY";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[1]] = f."Empty";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[3]] = f."GOLOVANOVA";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[4]] = f."Golovanova";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[11]] = f."BOLOGANO";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[13]] = f."Bologano";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[15]] = f."LOGAVANO";
        f.lIlIIIIIIIIlI[f.lIlIIIIIIIlII[17]] = f."Logavano";
    }

    public String j() {
        return this.name;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static boolean lIllIllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public int[] l() {
        return this.objectIds;
    }

    private f(String string2, int n3, int ... nArray) {
        this.name = string2;
        this.baseId = n3;
        this.objectIds = nArray;
    }

    public static f d(int n2) {
        return plantTypes.get(n2);
    }

    private static String lIllIllIIlllIIl(String llllllllllllllIlllIIlIlIIlIIllIl, String llllllllllllllIlllIIlIlIIlIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIIlIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIIlIIllll.init(lIlIIIIIIIlII[3], llllllllllllllIlllIIlIlIIlIlIIII);
            return new String(llllllllllllllIlllIIlIlIIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIIlIIlllI) {
            llllllllllllllIlllIIlIlIIlIIlllI.printStackTrace();
            return null;
        }
    }

    public int k() {
        return this.baseId;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block2: {
            void llllllllllllllIlllIIlIlIIlIllIll;
            f.lIllIllIIlllllI();
            f.lIllIllIIllllII();
            int[] nArray = new int[lIlIIIIIIIlII[1]];
            nArray[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[2];
            EMPTY = new f(lIlIIIIIIIIlI[lIlIIIIIIIlII[1]], lIlIIIIIIIlII[2], nArray);
            int[] nArray2 = new int[lIlIIIIIIIlII[6]];
            nArray2[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[7];
            nArray2[f.lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[8];
            nArray2[f.lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[9];
            nArray2[f.lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[10];
            nArray2[f.lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[12];
            nArray2[f.lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[14];
            nArray2[f.lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[16];
            nArray2[f.lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[18];
            nArray2[f.lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[20];
            nArray2[f.lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[5];
            nArray2[f.lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[23];
            GOLOVANOVA = new f(lIlIIIIIIIIlI[lIlIIIIIIIlII[4]], lIlIIIIIIIlII[5], nArray2);
            int[] nArray3 = new int[lIlIIIIIIIlII[6]];
            nArray3[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[25];
            nArray3[f.lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[26];
            nArray3[f.lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[27];
            nArray3[f.lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[28];
            nArray3[f.lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[29];
            nArray3[f.lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[30];
            nArray3[f.lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[31];
            nArray3[f.lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[32];
            nArray3[f.lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[33];
            nArray3[f.lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[24];
            nArray3[f.lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[34];
            BOLOGANO = new f(lIlIIIIIIIIlI[lIlIIIIIIIlII[13]], lIlIIIIIIIlII[24], nArray3);
            int[] nArray4 = new int[lIlIIIIIIIlII[6]];
            nArray4[f.lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[36];
            nArray4[f.lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[37];
            nArray4[f.lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[38];
            nArray4[f.lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[39];
            nArray4[f.lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[40];
            nArray4[f.lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[41];
            nArray4[f.lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[42];
            nArray4[f.lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[43];
            nArray4[f.lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[44];
            nArray4[f.lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[35];
            nArray4[f.lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[45];
            LOGAVANO = new f(lIlIIIIIIIIlI[lIlIIIIIIIlII[17]], lIlIIIIIIIlII[35], nArray4);
            f[] fArray = new f[lIlIIIIIIIlII[11]];
            fArray[f.lIlIIIIIIIlII[0]] = EMPTY;
            fArray[f.lIlIIIIIIIlII[1]] = GOLOVANOVA;
            fArray[f.lIlIIIIIIIlII[3]] = BOLOGANO;
            fArray[f.lIlIIIIIIIlII[4]] = LOGAVANO;
            $VALUES = fArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            f[] fArray2 = f.values();
            int n2 = fArray2.length;
            int llllllllllllllIlllIIlIlIIlIllIlI = lIlIIIIIIIlII[0];
            while (f.lIllIllIIllllll(llllllllllllllIlllIIlIlIIlIllIlI, (int)llllllllllllllIlllIIlIlIIlIllIll)) {
                void llllllllllllllIlllIIlIlIIlIlllII;
                void llllllllllllllIlllIIlIlIIlIllIIl = llllllllllllllIlllIIlIlIIlIlllII[llllllllllllllIlllIIlIlIIlIllIlI];
                int[] llllllllllllllIlllIIlIlIIlIllIII = llllllllllllllIlllIIlIlIIlIllIIl.l();
                int llllllllllllllIlllIIlIlIIlIlIlll = llllllllllllllIlllIIlIlIIlIllIII.length;
                int llllllllllllllIlllIIlIlIIlIlIllI = lIlIIIIIIIlII[0];
                while (f.lIllIllIIllllll(llllllllllllllIlllIIlIlIIlIlIllI, llllllllllllllIlllIIlIlIIlIlIlll)) {
                    void llllllllllllllIlllIIlIlIIlIlllIl;
                    int llllllllllllllIlllIIlIlIIlIlIlIl = llllllllllllllIlllIIlIlIIlIllIII[llllllllllllllIlllIIlIlIIlIlIllI];
                    llllllllllllllIlllIIlIlIIlIlllIl.put((Object)llllllllllllllIlllIIlIlIIlIlIlIl, (Object)llllllllllllllIlllIIlIlIIlIllIIl);
                    0;
                    ++llllllllllllllIlllIIlIlIIlIlIllI;
                    0;
                    if (3 >= 0) continue;
                    break block2;
                }
                ++llllllllllllllIlllIIlIlIIlIllIlI;
                0;
                if (2 >= 2) continue;
                break block2;
            }
            plantTypes = builder.build();
        }
    }
}

