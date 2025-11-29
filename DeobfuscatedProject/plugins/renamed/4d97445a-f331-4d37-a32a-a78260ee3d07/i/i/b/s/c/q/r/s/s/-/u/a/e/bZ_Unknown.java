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

public class bZ_Unknown {
    public static /* synthetic */ String[] hm;
    private static /* synthetic */ String[] llllIIlII;
    public static /* synthetic */ String[] hn;
    public static /* synthetic */ String[] hl;
    private static /* synthetic */ int[] llllIIlIl;

    private static void llIIllllIll() {
        llllIIlIl = new int[32];
        bZ.llllIIlIl[0] = 0xAB ^ 0x93 ^ (0x92 ^ 0xB9);
        bZ.llllIIlIl[1] = (0x2C ^ 0x12) & ~(0xAF ^ 0x91);
        bZ.llllIIlIl[2] = 1;
        bZ.llllIIlIl[3] = 2;
        bZ.llllIIlIl[4] = 3;
        bZ.llllIIlIl[5] = 57 + 144 - 136 + 102 ^ 123 + 103 - 88 + 25;
        bZ.llllIIlIl[6] = 81 + 108 - 132 + 110 ^ 31 + 52 - -65 + 14;
        bZ.llllIIlIl[7] = 0x58 ^ 0x5C ^ 2;
        bZ.llllIIlIl[8] = 0xFE ^ 0x8E ^ (0xE9 ^ 0x9E);
        bZ.llllIIlIl[9] = 6 + 137 - -2 + 21 ^ 81 + 160 - 194 + 127;
        bZ.llllIIlIl[10] = 0xD9 ^ 0xA4 ^ (0x5C ^ 0x28);
        bZ.llllIIlIl[11] = 0x97 ^ 0x9D;
        bZ.llllIIlIl[12] = 0xA0 ^ 0xAB;
        bZ.llllIIlIl[13] = 0x73 ^ 0x7F;
        bZ.llllIIlIl[14] = 0x9C ^ 0xA7 ^ (0x5F ^ 0x69);
        bZ.llllIIlIl[15] = 66 + 25 - -17 + 59 ^ 97 + 152 - 136 + 56;
        bZ.llllIIlIl[16] = 0xCE ^ 0xC1;
        bZ.llllIIlIl[17] = 1 + 162 - 62 + 81 ^ 3 + 67 - 8 + 104;
        bZ.llllIIlIl[18] = 132 + 32 - 143 + 191 ^ 40 + 48 - -17 + 92;
        bZ.llllIIlIl[19] = 68 + 11 - 31 + 91 ^ 60 + 35 - 56 + 114;
        bZ.llllIIlIl[20] = 95 + 119 - 108 + 107 ^ 132 + 177 - 249 + 133;
        bZ.llllIIlIl[21] = 0x1B ^ 0xE;
        bZ.llllIIlIl[22] = 0x5E ^ 0x48;
        bZ.llllIIlIl[23] = 0x72 ^ 0x29 ^ (0xCB ^ 0x87);
        bZ.llllIIlIl[24] = 0x6B ^ 0 ^ (0x71 ^ 2);
        bZ.llllIIlIl[25] = 81 + 70 - 118 + 128 ^ 148 + 128 - 214 + 122;
        bZ.llllIIlIl[26] = 0x6D ^ 0x77;
        bZ.llllIIlIl[27] = 0x68 ^ 0xA ^ (0x70 ^ 9);
        bZ.llllIIlIl[28] = 0x4F ^ 0x78 ^ (0x97 ^ 0xBC);
        bZ.llllIIlIl[29] = 13 + 81 - 78 + 128 ^ 101 + 94 - 137 + 83;
        bZ.llllIIlIl[30] = 0x11 ^ 0xF;
        bZ.llllIIlIl[31] = 0x2E ^ 0x31;
    }

    static {
        bZ.llIIllllIll();
        bZ.llIIllllIlI();
        String[] stringArray = new String[llllIIlIl[0]];
        stringArray[bZ.llllIIlIl[1]] = llllIIlII[llllIIlIl[1]];
        stringArray[bZ.llllIIlIl[2]] = llllIIlII[llllIIlIl[2]];
        stringArray[bZ.llllIIlIl[3]] = llllIIlII[llllIIlIl[3]];
        stringArray[bZ.llllIIlIl[4]] = llllIIlII[llllIIlIl[4]];
        stringArray[bZ.llllIIlIl[5]] = llllIIlII[llllIIlIl[5]];
        stringArray[bZ.llllIIlIl[6]] = llllIIlII[llllIIlIl[6]];
        stringArray[bZ.llllIIlIl[7]] = llllIIlII[llllIIlIl[7]];
        stringArray[bZ.llllIIlIl[8]] = llllIIlII[llllIIlIl[8]];
        stringArray[bZ.llllIIlIl[9]] = llllIIlII[llllIIlIl[9]];
        stringArray[bZ.llllIIlIl[10]] = llllIIlII[llllIIlIl[10]];
        stringArray[bZ.llllIIlIl[11]] = llllIIlII[llllIIlIl[11]];
        stringArray[bZ.llllIIlIl[12]] = llllIIlII[llllIIlIl[12]];
        stringArray[bZ.llllIIlIl[13]] = llllIIlII[llllIIlIl[13]];
        stringArray[bZ.llllIIlIl[14]] = llllIIlII[llllIIlIl[14]];
        stringArray[bZ.llllIIlIl[15]] = llllIIlII[llllIIlIl[15]];
        stringArray[bZ.llllIIlIl[16]] = llllIIlII[llllIIlIl[16]];
        stringArray[bZ.llllIIlIl[17]] = llllIIlII[llllIIlIl[17]];
        stringArray[bZ.llllIIlIl[18]] = llllIIlII[llllIIlIl[18]];
        stringArray[bZ.llllIIlIl[19]] = llllIIlII[llllIIlIl[19]];
        hl = stringArray;
        String[] stringArray2 = new String[llllIIlIl[5]];
        stringArray2[bZ.llllIIlIl[1]] = llllIIlII[llllIIlIl[0]];
        stringArray2[bZ.llllIIlIl[2]] = llllIIlII[llllIIlIl[20]];
        stringArray2[bZ.llllIIlIl[3]] = llllIIlII[llllIIlIl[21]];
        stringArray2[bZ.llllIIlIl[4]] = llllIIlII[llllIIlIl[22]];
        hm = stringArray2;
        String[] stringArray3 = new String[llllIIlIl[9]];
        stringArray3[bZ.llllIIlIl[1]] = llllIIlII[llllIIlIl[23]];
        stringArray3[bZ.llllIIlIl[2]] = llllIIlII[llllIIlIl[24]];
        stringArray3[bZ.llllIIlIl[3]] = llllIIlII[llllIIlIl[25]];
        stringArray3[bZ.llllIIlIl[4]] = llllIIlII[llllIIlIl[26]];
        stringArray3[bZ.llllIIlIl[5]] = llllIIlII[llllIIlIl[27]];
        stringArray3[bZ.llllIIlIl[6]] = llllIIlII[llllIIlIl[28]];
        stringArray3[bZ.llllIIlIl[7]] = llllIIlII[llllIIlIl[29]];
        stringArray3[bZ.llllIIlIl[8]] = llllIIlII[llllIIlIl[30]];
        hn = stringArray3;
    }

    private static String llIIllllIII(String lIlIIllllIIIIlI, String lIlIIllllIIIIIl) {
        lIlIIllllIIIIlI = new String(Base64.getDecoder().decode(lIlIIllllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllllIIIIII = new StringBuilder();
        char[] lIlIIlllIllllll = lIlIIllllIIIIIl.toCharArray();
        int lIlIIlllIlllllI = llllIIlIl[1];
        char[] lIlIIlllIlllIII = lIlIIllllIIIIlI.toCharArray();
        int lIlIIlllIllIlll = lIlIIlllIlllIII.length;
        int lIlIIlllIllIllI = llllIIlIl[1];
        while (bZ.llIIlllllII(lIlIIlllIllIllI, lIlIIlllIllIlll)) {
            char lIlIIllllIIIIll = lIlIIlllIlllIII[lIlIIlllIllIllI];
            lIlIIllllIIIIII.append((char)(lIlIIllllIIIIll ^ lIlIIlllIllllll[lIlIIlllIlllllI % lIlIIlllIllllll.length]));
            0;
            ++lIlIIlllIlllllI;
            ++lIlIIlllIllIllI;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(lIlIIllllIIIIII);
    }

    private static boolean llIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlllIlll(String lIlIIllllIlIIlI, String lIlIIllllIlIIIl) {
        try {
            SecretKeySpec lIlIIllllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), llllIIlIl[9]), "DES");
            Cipher lIlIIllllIlIlII = Cipher.getInstance("DES");
            lIlIIllllIlIlII.init(llllIIlIl[3], lIlIIllllIlIlIl);
            return new String(lIlIIllllIlIlII.doFinal(Base64.getDecoder().decode(lIlIIllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllllIlIIll) {
            lIlIIllllIlIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIllllIIl(String lIlIIllllIlllIl, String lIlIIllllIllllI) {
        try {
            SecretKeySpec lIlIIlllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlllllIIIIl = Cipher.getInstance("Blowfish");
            lIlIIlllllIIIIl.init(llllIIlIl[3], lIlIIlllllIIIlI);
            return new String(lIlIIlllllIIIIl.doFinal(Base64.getDecoder().decode(lIlIIllllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlllllIIIII) {
            lIlIIlllllIIIII.printStackTrace();
            return null;
        }
    }

    private static void llIIllllIlI() {
        llllIIlII = new String[llllIIlIl[31]];
        bZ.llllIIlII[bZ.llllIIlIl[1]] = bZ."sword";
        bZ.llllIIlII[bZ.llllIIlIl[2]] = bZ."bludgeon";
        bZ.llllIIlII[bZ.llllIIlIl[3]] = bZ."dagger";
        bZ.llllIIlII[bZ.llllIIlIl[4]] = bZ."tentacle";
        bZ.llllIIlII[bZ.llllIIlIl[5]] = bZ."whip";
        bZ.llllIIlII[bZ.llllIIlIl[6]] = bZ."battleaxe";
        bZ.llllIIlII[bZ.llllIIlIl[7]] = bZ."claws";
        bZ.llllIIlII[bZ.llllIIlIl[8]] = bZ."halberd";
        bZ.llllIIlII[bZ.llllIIlIl[9]] = bZ."hasta";
        bZ.llllIIlII[bZ.llllIIlIl[10]] = bZ."mace";
        bZ.llllIIlII[bZ.llllIIlIl[11]] = bZ."scimitar";
        bZ.llllIIlII[bZ.llllIIlIl[12]] = bZ."spear";
        bZ.llllIIlII[bZ.llllIIlIl[13]] = bZ."hammer";
        bZ.llllIIlII[bZ.llllIIlIl[14]] = bZ."anchor";
        bZ.llllIIlII[bZ.llllIIlIl[15]] = bZ."sabre";
        bZ.llllIIlII[bZ.llllIIlIl[16]] = bZ."blade";
        bZ.llllIIlII[bZ.llllIIlIl[17]] = bZ."scythe";
        bZ.llllIIlII[bZ.llllIIlIl[18]] = bZ."maul";
        bZ.llllIIlII[bZ.llllIIlIl[19]] = bZ."dharok's";
        bZ.llllIIlII[bZ.llllIIlIl[0]] = bZ."wand";
        bZ.llllIIlII[bZ.llllIIlIl[20]] = bZ."staff";
        bZ.llllIIlII[bZ.llllIIlIl[21]] = bZ."crozier";
        bZ.llllIIlII[bZ.llllIIlIl[22]] = bZ."sceptre";
        bZ.llllIIlII[bZ.llllIIlIl[23]] = bZ."bow of";
        bZ.llllIIlII[bZ.llllIIlIl[24]] = bZ."dart";
        bZ.llllIIlII[bZ.llllIIlIl[25]] = bZ."knife";
        bZ.llllIIlII[bZ.llllIIlIl[26]] = bZ."thrownaxe";
        bZ.llllIIlII[bZ.llllIIlIl[27]] = bZ."chinchompa";
        bZ.llllIIlII[bZ.llllIIlIl[28]] = bZ."ballista";
        bZ.llllIIlII[bZ.llllIIlIl[29]] = bZ."toktz-xil-ul";
        bZ.llllIIlII[bZ.llllIIlIl[30]] = bZ."seercull";
    }
}

