/*
 * Decompiled with CFR 0.152.
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class b_Unknown
extends HashMap<String, Integer> {
    private static /* synthetic */ int[] lIIlIllllllII;
    private static /* synthetic */ String[] lIIlIllllIlII;

    private static String lIlIlllIIIlIIlI(String var8, String var13) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIIlIllllllII[10]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIlIllllllII[3], var2);
            return new String(var10.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIIIIlIII(String var15, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIlIllllllII[3], var4);
            return new String(var19.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        b.lIlIlllIIIllllI();
        b.lIlIlllIIIlllII();
    }

    private static void lIlIlllIIIllllI() {
        lIIlIllllllII = new int[48];
        b.lIIlIllllllII[0] = (87 + 196 - 192 + 126 ^ 86 + 89 - 73 + 27) & (0x25 ^ 0x2D ^ (0xFF ^ 0xAF) ^ -1);
        b.lIIlIllllllII[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        b.lIIlIllllllII[2] = 1;
        b.lIIlIllllllII[3] = 2;
        b.lIIlIllllllII[4] = 3;
        b.lIIlIllllllII[5] = 0x7B ^ 0x7F;
        b.lIIlIllllllII[6] = -1 & (0xFFFFFFFF & 0x7FFFFFFE);
        b.lIIlIllllllII[7] = 0 ^ 5;
        b.lIIlIllllllII[8] = 0xCE ^ 0x97 ^ (0x1F ^ 0x40);
        b.lIIlIllllllII[9] = 9 ^ 6 ^ (0xAF ^ 0xA7);
        b.lIIlIllllllII[10] = 0xAE ^ 0xA6;
        b.lIIlIllllllII[11] = -(0xFFFF92BF & 0x7F46) & (0xFFFFFFFF & 0x1DEF5);
        b.lIIlIllllllII[12] = 0xDA ^ 0xC5 ^ (0x53 ^ 0x45);
        b.lIIlIllllllII[13] = -(0xFFFFFDE5 & 0x5B5B) & (0xFFFFDFFC & 0x1FBFB);
        b.lIIlIllllllII[14] = 4 + 108 - 44 + 111 ^ 120 + 118 - 230 + 177;
        b.lIIlIllllllII[15] = 0xFFFF9EFF & 0x98F77F;
        b.lIIlIllllllII[16] = 0x41 ^ 0x4A;
        b.lIIlIllllllII[17] = 0xFFFF96FF & 0x98FF7E;
        b.lIIlIllllllII[18] = 0x12 ^ 0x20 ^ (0x3A ^ 4);
        b.lIIlIllllllII[19] = 0xFFFFBEFF & 0x98D77D;
        b.lIIlIllllllII[20] = 0x5D ^ 0x50;
        b.lIIlIllllllII[21] = -(0xFFFFA8A7 & 0x775B) & (0xFFFFF67F & 0x98BFFE);
        b.lIIlIllllllII[22] = 0xB3 ^ 0xBD;
        b.lIIlIllllllII[23] = -(0xFFFFF1EF & 0x6E5E) & (0xFFFFF6FD & 0x1EFEF);
        b.lIIlIllllllII[24] = 96 + 39 - 84 + 133 ^ 72 + 112 - 157 + 156;
        b.lIIlIllllllII[25] = 0x48 ^ 0x58;
        b.lIIlIllllllII[26] = 0x79 ^ 0x68;
        b.lIIlIllllllII[27] = 0x48 ^ 0x5A;
        b.lIIlIllllllII[28] = 0xA3 ^ 0xA7 ^ (0x45 ^ 0x52);
        b.lIIlIllllllII[29] = -(0xFFFFF3FF & 0x3E78) & (0xFFFFFFFF & 0x1FB7F);
        b.lIIlIllllllII[30] = 0x59 ^ 0x4D;
        b.lIIlIllllllII[31] = -(0xFFFFB79F & 0x4D68) & (0xFFFFFFFF & 0x17FEF);
        b.lIIlIllllllII[32] = 0x18 ^ 0xD;
        b.lIIlIllllllII[33] = 0xFFFFF7A5 & 0x17F5A;
        b.lIIlIllllllII[34] = 0x3F ^ 0x79 ^ (0xD2 ^ 0x82);
        b.lIIlIllllllII[35] = -(0xFFFFB4AF & 0x5BDB) & (0xFFFFFFBB & 0x17FFE);
        b.lIIlIllllllII[36] = 0xC ^ 0x1B;
        b.lIIlIllllllII[37] = -(0xFFFFC4F8 & 0x3FBF) & (0xFFFFFFFF & 0x16FFF);
        b.lIIlIllllllII[38] = 0xE ^ 0x16;
        b.lIIlIllllllII[39] = 0xDE ^ 0xC7;
        b.lIIlIllllllII[40] = 0xFFFFBFE9 & 0x5F56;
        b.lIIlIllllllII[41] = 0xB8 ^ 0xA2;
        b.lIIlIllllllII[42] = 0xFFFFCBFC & 0x37EB;
        b.lIIlIllllllII[43] = 0x7B ^ 0x69 ^ (0xBC ^ 0xB5);
        b.lIIlIllllllII[44] = -(0xFFFFF39C & 0x2E73) & (0xFFFFEEFF & 0x37BF);
        b.lIIlIllllllII[45] = 0x9D ^ 0x81;
        b.lIIlIllllllII[46] = 0xFFFFCFFC & 0x3323;
        b.lIIlIllllllII[47] = 0x66 ^ 0x11 ^ (0xF ^ 0x65);
    }

    private static boolean lIlIlllIIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    b() {
        this.put(lIIlIllllIlII[lIIlIllllllII[0]], lIIlIllllllII[1]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[2]], lIIlIllllllII[1]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[3]], lIIlIllllllII[1]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[4]], lIIlIllllllII[1]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[5]], lIIlIllllllII[6]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[7]], lIIlIllllllII[6]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[8]], lIIlIllllllII[6]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[9]], lIIlIllllllII[2]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[10]], lIIlIllllllII[11]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[12]], lIIlIllllllII[13]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[14]], lIIlIllllllII[15]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[16]], lIIlIllllllII[17]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[18]], lIIlIllllllII[19]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[20]], lIIlIllllllII[21]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[22]], lIIlIllllllII[23]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[24]], lIIlIllllllII[23]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[25]], lIIlIllllllII[23]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[26]], lIIlIllllllII[23]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[27]], lIIlIllllllII[23]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[28]], lIIlIllllllII[29]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[30]], lIIlIllllllII[31]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[32]], lIIlIllllllII[33]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[34]], lIIlIllllllII[35]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[36]], lIIlIllllllII[37]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[38]], lIIlIllllllII[37]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[39]], lIIlIllllllII[40]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[41]], lIIlIllllllII[42]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[43]], lIIlIllllllII[44]);
        0;
        this.put(lIIlIllllIlII[lIIlIllllllII[45]], lIIlIllllllII[46]);
        0;
    }

    private static String lIlIlllIIIIIlll(String var1, String var14) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var17 = var14.toCharArray();
        int var9 = lIIlIllllllII[0];
        char[] var12 = var1.toCharArray();
        int var6 = var12.length;
        int var18 = lIIlIllllllII[0];
        while (b.lIlIlllIIlIIIIl(var18, var6)) {
            char var7 = var12[var18];
            var5.append((char)(var7 ^ var17[var9 % var17.length]));
            0;
            ++var9;
            ++var18;
            0;
            if (-1 < (0xC4 ^ 0x9E ^ (0x60 ^ 0x3E))) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static void lIlIlllIIIlllII() {
        lIIlIllllIlII = new String[lIIlIllllllII[47]];
        b.lIIlIllllIlII[b.lIIlIllllllII[0]] = b."Bandos chestplate";
        b.lIIlIllllIlII[b.lIIlIllllllII[2]] = b."Bandos tassets";
        b.lIIlIllllIlII[b.lIIlIllllllII[3]] = b."Bandos hilt";
        b.lIIlIllllIlII[b.lIIlIllllllII[4]] = b."Bandos boots";
        b.lIIlIllllIlII[b.lIIlIllllllII[5]] = b."Godsword shard 1";
        b.lIIlIllllIlII[b.lIIlIllllllII[7]] = b."Godsword shard 2";
        b.lIIlIllllIlII[b.lIIlIllllllII[8]] = b."Godsword shard 3";
        b.lIIlIllllIlII[b.lIIlIllllllII[9]] = b."Coins";
        b.lIIlIllllIlII[b.lIIlIllllllII[10]] = b."Snapdragon seed";
        b.lIIlIllllIlII[b.lIIlIllllllII[12]] = b."Grimy snapdragon";
        b.lIIlIllllIlII[b.lIIlIllllllII[14]] = b."Stamina potion(4)";
        b.lIIlIllllIlII[b.lIIlIllllllII[16]] = b."Stamina potion(3)";
        b.lIIlIllllIlII[b.lIIlIllllllII[18]] = b."Stamina potion(2)";
        b.lIIlIllllIlII[b.lIIlIllllllII[20]] = b."Stamina potion(1)";
        b.lIIlIllllIlII[b.lIIlIllllllII[22]] = b."Rune platebody";
        b.lIIlIllllIlII[b.lIIlIllllllII[24]] = b."Rune 2h sword";
        b.lIIlIllllIlII[b.lIIlIllllllII[25]] = b."Rune longsword";
        b.lIIlIllllIlII[b.lIIlIllllllII[26]] = b."Rune pickaxe";
        b.lIIlIllllIlII[b.lIIlIllllllII[27]] = b."Rune kiteshield";
        b.lIIlIllllIlII[b.lIIlIllllllII[28]] = b."Shark";
        b.lIIlIllllIlII[b.lIIlIllllllII[30]] = b."Chilli potato";
        b.lIIlIllllIlII[b.lIIlIllllllII[32]] = b."Adamantite ore";
        b.lIIlIllllIlII[b.lIIlIllllllII[34]] = b."Peach";
        b.lIIlIllllIlII[b.lIIlIllllllII[36]] = b."Bones";
        b.lIIlIllllIlII[b.lIIlIllllllII[38]] = b."Big bones";
        b.lIIlIllllIlII[b.lIIlIllllllII[39]] = b."Nature rune";
        b.lIIlIllllIlII[b.lIIlIllllllII[41]] = b."Cosmic rune";
        b.lIIlIllllIlII[b.lIIlIllllllII[43]] = b."Coal";
        b.lIIlIllllIlII[b.lIIlIllllllII[45]] = b."Limpwurt root";
    }
}

