/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class i_Unknown
extends HashMap<String, Integer> {
    private static /* synthetic */ String[] llllIIIllIll;
    private static /* synthetic */ int[] llllIIIlllII;

    private static String lIIIllllIIllllI(String var16, String var5) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(llllIIIlllII[3], var1);
            return new String(var17.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void lIIIllllIIlllll() {
        llllIIIllIll = new String[llllIIIlllII[53]];
        i.llllIIIllIll[i.llllIIIlllII[0]] = i."Nightmare staff";
        i.llllIIIllIll[i.llllIIIlllII[2]] = i."Inquisitor's great helm";
        i.llllIIIllIll[i.llllIIIlllII[3]] = i."Inquisitor's hauberk";
        i.llllIIIllIll[i.llllIIIlllII[4]] = i."Inquisitor's plateskirt";
        i.llllIIIllIll[i.llllIIIlllII[5]] = i."Inquisitor's mace";
        i.llllIIIllIll[i.llllIIIlllII[6]] = i."Eldritch orb";
        i.llllIIIllIll[i.llllIIIlllII[7]] = i."Harmonised orb";
        i.llllIIIllIll[i.llllIIIlllII[8]] = i."Volatile orb";
        i.llllIIIllIll[i.llllIIIlllII[9]] = i."Slepey tablet";
        i.llllIIIllIll[i.llllIIIlllII[10]] = i."Parasitic egg";
        i.llllIIIllIll[i.llllIIIlllII[11]] = i."Jar of dreams";
        i.llllIIIllIll[i.llllIIIlllII[13]] = i."Clue scroll (elite)";
        i.llllIIIllIll[i.llllIIIlllII[14]] = i."Coins";
        i.llllIIIllIll[i.llllIIIlllII[15]] = i."Snapdragon seed";
        i.llllIIIllIll[i.llllIIIlllII[17]] = i."Runite ore";
        i.llllIIIllIll[i.llllIIIlllII[19]] = i."Blood rune";
        i.llllIIIllIll[i.llllIIIlllII[21]] = i."Soul rune";
        i.llllIIIllIll[i.llllIIIlllII[23]] = i."Cosmic rune";
        i.llllIIIllIll[i.llllIIIlllII[25]] = i."Death rune";
        i.llllIIIllIll[i.llllIIIlllII[27]] = i."Nature rune";
        i.llllIIIllIll[i.llllIIIlllII[28]] = i."Grimy snapdragon";
        i.llllIIIllIll[i.llllIIIlllII[30]] = i."Rune arrow";
        i.llllIIIllIll[i.llllIIIlllII[31]] = i."Magic logs";
        i.llllIIIllIll[i.llllIIIlllII[33]] = i."Grimy torstol";
        i.llllIIIllIll[i.llllIIIlllII[35]] = i."Grimy cadantine";
        i.llllIIIllIll[i.llllIIIlllII[36]] = i."Sanfew serum(3)";
        i.llllIIIllIll[i.llllIIIlllII[38]] = i."Shark";
        i.llllIIIllIll[i.llllIIIlllII[40]] = i."Bass";
        i.llllIIIllIll[i.llllIIIlllII[41]] = i."Prayer potion(3)";
        i.llllIIIllIll[i.llllIIIlllII[42]] = i."Adamantite ore";
        i.llllIIIllIll[i.llllIIIlllII[43]] = i."Mithril ore";
        i.llllIIIllIll[i.llllIIIlllII[44]] = i."Gold ore";
        i.llllIIIllIll[i.llllIIIlllII[46]] = i."Cannonball";
        i.llllIIIllIll[i.llllIIIlllII[48]] = i."Coal";
        i.llllIIIllIll[i.llllIIIlllII[50]] = i."Uncut ruby";
        i.llllIIIllIll[i.llllIIIlllII[51]] = i."Uncut emerald";
    }

    private static String lIIIllllIIlllIl(String var18, String var3) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var10 = var3.toCharArray();
        int var7 = llllIIIlllII[0];
        char[] var14 = var18.toCharArray();
        int var9 = var14.length;
        int var4 = llllIIIlllII[0];
        while (i.lIIIllllIlIIIIl(var4, var9)) {
            char var12 = var14[var4];
            var8.append((char)(var12 ^ var10[var7 % var10.length]));
            0;
            ++var7;
            ++var4;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIIIllllIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllllIlIIIII() {
        llllIIIlllII = new int[54];
        i.llllIIIlllII[0] = 2 & ~2;
        i.llllIIIlllII[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        i.llllIIIlllII[2] = 1;
        i.llllIIIlllII[3] = 2;
        i.llllIIIlllII[4] = 3;
        i.llllIIIlllII[5] = 0x40 ^ 0x44;
        i.llllIIIlllII[6] = 0x1A ^ 0x1F;
        i.llllIIIlllII[7] = 0xFD ^ 0x8B ^ (0x47 ^ 0x37);
        i.llllIIIlllII[8] = 0xC1 ^ 0x87 ^ (0x26 ^ 0x67);
        i.llllIIIlllII[9] = 0xB4 ^ 0xBC;
        i.llllIIIlllII[10] = 0x7F ^ 0x76;
        i.llllIIIlllII[11] = 0x2B ^ 0x21;
        i.llllIIIlllII[12] = 0xFFFFFF7D & 0x7FFE79E2;
        i.llllIIIlllII[13] = 0x66 ^ 0x6D;
        i.llllIIIlllII[14] = 7 ^ 0x5D ^ (0x5E ^ 8);
        i.llllIIIlllII[15] = 3 ^ 0xE;
        i.llllIIIlllII[16] = 0xFFFFFDB0 & 0x777F;
        i.llllIIIlllII[17] = 0xCD ^ 0xC3;
        i.llllIIIlllII[18] = 0xFFFFEFF1 & 0x3EEE;
        i.llllIIIlllII[19] = 3 + 8 - -176 + 3 ^ 32 + 45 - -66 + 34;
        i.llllIIIlllII[20] = -(16 + 126 - 36 + 24) & (0xFFFFBFED & 0x41BF);
        i.llllIIIlllII[21] = 149 + 13 - 76 + 128 ^ 53 + 182 - 114 + 77;
        i.llllIIIlllII[22] = 190 + 171 - 320 + 209;
        i.llllIIIlllII[23] = 119 + 88 - 170 + 173 ^ 140 + 118 - 69 + 6;
        i.llllIIIlllII[24] = 0x5B ^ 0x3F;
        i.llllIIIlllII[25] = 0xA6 ^ 0xB4;
        i.llllIIIlllII[26] = 139 + 18 - 126 + 194;
        i.llllIIIlllII[27] = 89 + 145 - 150 + 131 ^ 30 + 191 - 191 + 166;
        i.llllIIIlllII[28] = 0x78 ^ 0x4D ^ (0x97 ^ 0xB6);
        i.llllIIIlllII[29] = -(0xFFFFEEDD & 0x75BB) & (0xFFFFFFFE & 0x7DFD);
        i.llllIIIlllII[30] = 0xA2 ^ 0xB7;
        i.llllIIIlllII[31] = 0x22 ^ 0x16 ^ (0xA ^ 0x28);
        i.llllIIIlllII[32] = 0xFFFFC7E9 & 0x3BFE;
        i.llllIIIlllII[33] = 144 + 77 - 203 + 139 ^ 105 + 90 - 192 + 135;
        i.llllIIIlllII[34] = -(0xFFFFF0FD & 0x5F4F) & (0xFFFFDFFE & 0x7FED);
        i.llllIIIlllII[35] = 0x2C ^ 0x34;
        i.llllIIIlllII[36] = 65 + 117 - 170 + 145 ^ 13 + 93 - -20 + 6;
        i.llllIIIlllII[37] = 0xFFFFFFEB & 0x4E34;
        i.llllIIIlllII[38] = 164 + 117 - 243 + 128 ^ 116 + 81 - 27 + 18;
        i.llllIIIlllII[39] = -(0xFFFFCDF7 & 0x766D) & (0xFFFFFEFE & 0x7FFD);
        i.llllIIIlllII[40] = 0x40 ^ 3 ^ (0xFC ^ 0xA4);
        i.llllIIIlllII[41] = 0x70 ^ 0x6C;
        i.llllIIIlllII[42] = 0x88 ^ 0x95;
        i.llllIIIlllII[43] = 4 ^ 0x16 ^ (0x4A ^ 0x46);
        i.llllIIIlllII[44] = 7 ^ 0x18;
        i.llllIIIlllII[45] = 3 + 174 - 157 + 180;
        i.llllIIIlllII[46] = 0x84 ^ 0xA4;
        i.llllIIIlllII[47] = 4 + 31 - -90 + 25;
        i.llllIIIlllII[48] = 0x8C ^ 0xAD;
        i.llllIIIlllII[49] = 142 + 20 - 152 + 185;
        i.llllIIIlllII[50] = 0x46 ^ 0x64;
        i.llllIIIlllII[51] = 102 + 162 - 160 + 65 ^ 62 + 135 - 170 + 111;
        i.llllIIIlllII[52] = 0xFFFFEDF4 & 0x13FF;
        i.llllIIIlllII[53] = 0xAE ^ 0x8A;
    }

    static {
        i.lIIIllllIlIIIII();
        i.lIIIllllIIlllll();
    }

    private static String lIIIllllIIlllII(String var11, String var19) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llllIIIlllII[9]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llllIIIlllII[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    i() {
        this.put(llllIIIllIll[llllIIIlllII[0]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[2]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[3]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[4]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[5]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[6]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[7]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[8]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[9]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[10]], llllIIIlllII[1]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[11]], llllIIIlllII[1]);
        0;
        int n2 = llllIIIlllII[12];
        this.put(llllIIIllIll[llllIIIlllII[13]], n2);
        0;
        this.put(llllIIIllIll[llllIIIlllII[14]], llllIIIlllII[2]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[15]], llllIIIlllII[16]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[17]], llllIIIlllII[18]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[19]], llllIIIlllII[20]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[21]], llllIIIlllII[22]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[23]], llllIIIlllII[24]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[25]], llllIIIlllII[26]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[27]], llllIIIlllII[24]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[28]], llllIIIlllII[29]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[30]], llllIIIlllII[24]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[31]], llllIIIlllII[32]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[33]], llllIIIlllII[34]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[35]], llllIIIlllII[34]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[36]], llllIIIlllII[37]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[38]], llllIIIlllII[39]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[40]], llllIIIlllII[39]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[41]], llllIIIlllII[29]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[42]], llllIIIlllII[32]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[43]], llllIIIlllII[24]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[44]], llllIIIlllII[45]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[46]], llllIIIlllII[47]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[48]], llllIIIlllII[49]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[50]], llllIIIlllII[32]);
        0;
        this.put(llllIIIllIll[llllIIIlllII[51]], llllIIIlllII[52]);
        0;
    }
}

