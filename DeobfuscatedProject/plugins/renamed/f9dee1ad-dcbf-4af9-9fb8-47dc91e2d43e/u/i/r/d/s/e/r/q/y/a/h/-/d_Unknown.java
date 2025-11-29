/*
 * Decompiled with CFR 0.152.
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class d_Unknown
extends HashMap<String, Integer> {
    private static /* synthetic */ int[] llllIIllIlIl;
    private static /* synthetic */ String[] llllIIllIlII;

    d() {
        this.put(llllIIllIlII[llllIIllIlIl[0]], llllIIllIlIl[1]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[2]], llllIIllIlIl[3]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[4]], llllIIllIlIl[5]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[6]], llllIIllIlIl[7]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[8]], llllIIllIlIl[7]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[9]], llllIIllIlIl[7]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[10]], llllIIllIlIl[2]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[11]], llllIIllIlIl[12]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[13]], llllIIllIlIl[14]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[15]], llllIIllIlIl[16]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[17]], llllIIllIlIl[16]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[18]], llllIIllIlIl[16]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[19]], llllIIllIlIl[16]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[20]], llllIIllIlIl[16]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[21]], llllIIllIlIl[16]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[22]], llllIIllIlIl[23]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[24]], llllIIllIlIl[25]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[26]], llllIIllIlIl[27]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[28]], llllIIllIlIl[23]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[29]], llllIIllIlIl[30]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[31]], llllIIllIlIl[32]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[33]], llllIIllIlIl[34]);
        0;
        this.put(llllIIllIlII[llllIIllIlIl[35]], llllIIllIlIl[36]);
        0;
    }

    static {
        d.lIIlIIIIIIIllIl();
        d.lIIlIIIIIIIllII();
    }

    private static void lIIlIIIIIIIllIl() {
        llllIIllIlIl = new int[38];
        d.llllIIllIlIl[0] = (0xDD ^ 0x93) & ~(0xC0 ^ 0x8E);
        d.llllIIllIlIl[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        d.llllIIllIlIl[2] = 1;
        d.llllIIllIlIl[3] = 0xFFFFFFFE & Integer.MAX_VALUE;
        d.llllIIllIlIl[4] = 2;
        d.llllIIllIlIl[5] = 0xFFFFFFFD & Integer.MAX_VALUE;
        d.llllIIllIlIl[6] = 3;
        d.llllIIllIlIl[7] = 0xFFFFFFFF & 0x7FFFFFFC;
        d.llllIIllIlIl[8] = 0x67 ^ 0x63;
        d.llllIIllIlIl[9] = 0x4D ^ 0x48;
        d.llllIIllIlIl[10] = 0xB6 ^ 0xB1 ^ 1;
        d.llllIIllIlIl[11] = 0x44 ^ 0x14 ^ (0xC3 ^ 0x94);
        d.llllIIllIlIl[12] = -(0xFFFFFBAE & 0x2757) & (0xFFFFEFF5 & 0x1FFFF);
        d.llllIIllIlIl[13] = 0x71 ^ 0x3A ^ (0xC ^ 0x4F);
        d.llllIIllIlIl[14] = -(0xFFFFF9C9 & 0x1E3E) & (0xFFFFDAFF & 0x1BFBF);
        d.llllIIllIlIl[15] = 0x1B ^ 0x12;
        d.llllIIllIlIl[16] = -(0xFFFFB12F & 0x7FD9) & (0xFFFFFFAE & 0x1B7F9);
        d.llllIIllIlIl[17] = 0x76 ^ 0x1C ^ (2 ^ 0x62);
        d.llllIIllIlIl[18] = 0x34 ^ 0x7D ^ (0x5C ^ 0x1E);
        d.llllIIllIlIl[19] = 0xCE ^ 0x85 ^ (0x29 ^ 0x6E);
        d.llllIIllIlIl[20] = 0x44 ^ 0x49;
        d.llllIIllIlIl[21] = 0x27 ^ 0x29;
        d.llllIIllIlIl[22] = 0xEB ^ 0xAE ^ (0xD8 ^ 0x92);
        d.llllIIllIlIl[23] = 0xFFFFFFD6 & 0x15FB9;
        d.llllIIllIlIl[24] = 0x1D ^ 8 ^ (0x80 ^ 0x85);
        d.llllIIllIlIl[25] = -(0xFFFFA8B7 & 0x5FD9) & (0xFFFFFFF4 & 0x17F9B);
        d.llllIIllIlIl[26] = 0x1B ^ 0xA;
        d.llllIIllIlIl[27] = 0xFFFFFFF9 & 0x16F36;
        d.llllIIllIlIl[28] = 27 + 118 - 120 + 155 ^ 148 + 126 - 224 + 116;
        d.llllIIllIlIl[29] = 47 + 10 - 9 + 130 ^ 20 + 14 - -58 + 69;
        d.llllIIllIlIl[30] = -(120 + 67 - 180 + 123) & (0xFFFFFFC3 & 0x1FFD);
        d.llllIIllIlIl[31] = 0xBC ^ 0xA8;
        d.llllIIllIlIl[32] = -(0xFFFFE887 & 0x7F7D) & (0xFFFFEBEE & 0x7FFD);
        d.llllIIllIlIl[33] = 0x9C ^ 0x89;
        d.llllIIllIlIl[34] = 0xFFFFB5F7 & 0x4EB8;
        d.llllIIllIlIl[35] = 0xD7 ^ 0xC1;
        d.llllIIllIlIl[36] = -(0xFFFFCDFF & 0x76CE) & (0xFFFFFFED & 0x47FF);
        d.llllIIllIlIl[37] = 0x91 ^ 0x86;
    }

    private static boolean lIIlIIIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIIIIIlIll(String var10, String var5) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llllIIllIlIl[4], var19);
            return new String(var9.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIIIIlIlI(String var18, String var2) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llllIIllIlIl[13]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llllIIllIlIl[4], var1);
            return new String(var12.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIIIIlIIl(String var8, String var13) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var4 = var13.toCharArray();
        int var15 = llllIIllIlIl[0];
        char[] var3 = var8.toCharArray();
        int var16 = var3.length;
        int var11 = llllIIllIlIl[0];
        while (d.lIIlIIIIIIIlllI(var11, var16)) {
            char var6 = var3[var11];
            var14.append((char)(var6 ^ var4[var15 % var4.length]));
            0;
            ++var15;
            ++var11;
            0;
            if (((0x5B ^ 2 ^ (0xCD ^ 0x87)) & (0xBC ^ 0xA0 ^ (0x28 ^ 0x27) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lIIlIIIIIIIllII() {
        llllIIllIlII = new String[llllIIllIlIl[37]];
        d.llllIIllIlII[d.llllIIllIlIl[0]] = d."Hydra's claw";
        d.llllIIllIlII[d.llllIIllIlIl[2]] = d."Hydra leather";
        d.llllIIllIlII[d.llllIIllIlIl[4]] = d."Hydra tail";
        d.llllIIllIlII[d.llllIIllIlIl[6]] = d."Hydra's heart";
        d.llllIIllIlII[d.llllIIllIlIl[8]] = d."Hydra's fang";
        d.llllIIllIlII[d.llllIIllIlIl[9]] = d."Hydra's eye";
        d.llllIIllIlII[d.llllIIllIlIl[10]] = d."Coins";
        d.llllIIllIlII[d.llllIIllIlIl[11]] = d."Snapdragon seed";
        d.llllIIllIlII[d.llllIIllIlIl[13]] = d."Grimy snapdragon";
        d.llllIIllIlII[d.llllIIllIlIl[15]] = d."Mystic fire staff";
        d.llllIIllIlII[d.llllIIllIlIl[17]] = d."Mystic water staff";
        d.llllIIllIlII[d.llllIIllIlIl[18]] = d."Battlestaff";
        d.llllIIllIlII[d.llllIIllIlIl[19]] = d."Black d'hide body";
        d.llllIIllIlII[d.llllIIllIlIl[20]] = d."Dragon longsword";
        d.llllIIllIlII[d.llllIIllIlIl[21]] = d."Dragon med helm";
        d.llllIIllIlII[d.llllIIllIlIl[22]] = d."Shark";
        d.llllIIllIlII[d.llllIIllIlIl[24]] = d."Adamantite ore";
        d.llllIIllIlII[d.llllIIllIlIl[26]] = d."Peach";
        d.llllIIllIlII[d.llllIIllIlIl[28]] = d."Hydra bones";
        d.llllIIllIlII[d.llllIIllIlIl[29]] = d."Nature rune";
        d.llllIIllIlII[d.llllIIllIlIl[31]] = d."Cosmic rune";
        d.llllIIllIlII[d.llllIIllIlIl[33]] = d."Coal";
        d.llllIIllIlII[d.llllIIllIlIl[35]] = d."Limpwurt root";
    }
}

