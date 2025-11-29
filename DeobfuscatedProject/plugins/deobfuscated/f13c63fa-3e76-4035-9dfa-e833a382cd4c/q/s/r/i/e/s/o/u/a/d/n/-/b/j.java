/*
 * Decompiled with CFR 0.152.
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class j
extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lllIIIlIIlI;
    private static /* synthetic */ int[] lllIIIlIllI;

    j() {
        this.put(lllIIIlIIlI[lllIIIlIllI[0]], lllIIIlIllI[1]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[2]], lllIIIlIllI[1]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[3]], lllIIIlIllI[1]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[4]], lllIIIlIllI[1]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[5]], lllIIIlIllI[6]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[7]], lllIIIlIllI[6]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[8]], lllIIIlIllI[6]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[9]], lllIIIlIllI[2]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[10]], lllIIIlIllI[11]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[12]], lllIIIlIllI[13]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[14]], lllIIIlIllI[15]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[16]], lllIIIlIllI[17]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[18]], lllIIIlIllI[19]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[20]], lllIIIlIllI[21]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[22]], lllIIIlIllI[23]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[24]], lllIIIlIllI[23]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[25]], lllIIIlIllI[23]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[26]], lllIIIlIllI[23]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[27]], lllIIIlIllI[23]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[28]], lllIIIlIllI[29]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[30]], lllIIIlIllI[31]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[32]], lllIIIlIllI[33]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[34]], lllIIIlIllI[35]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[36]], lllIIIlIllI[37]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[38]], lllIIIlIllI[37]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[39]], lllIIIlIllI[40]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[41]], lllIIIlIllI[42]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[43]], lllIIIlIllI[44]);
        0;
        this.put(lllIIIlIIlI[lllIIIlIllI[45]], lllIIIlIllI[46]);
        0;
    }

    private static boolean lIlIllIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIllIlIIl(String llllllllllllllllIIlIIlllIIIIlIlI, String llllllllllllllllIIlIIlllIIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIllI[10]), "DES");
            Cipher llllllllllllllllIIlIIlllIIIIlllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllIIIIlllI.init(lllIIIlIllI[3], llllllllllllllllIIlIIlllIIIIllll);
            return new String(llllllllllllllllIIlIIlllIIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIIIIllIl) {
            llllllllllllllllIIlIIlllIIIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        j.lIlIllIlllIlll();
        j.lIlIllIlllIIll();
    }

    private static void lIlIllIlllIlll() {
        lllIIIlIllI = new int[48];
        j.lllIIIlIllI[0] = (0x8C ^ 0x9D) & ~(0x90 ^ 0x81);
        j.lllIIIlIllI[1] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        j.lllIIIlIllI[2] = 1;
        j.lllIIIlIllI[3] = 2;
        j.lllIIIlIllI[4] = 3;
        j.lllIIIlIllI[5] = 174 + 99 - 219 + 135 ^ 14 + 88 - 46 + 129;
        j.lllIIIlIllI[6] = -1 & (0xFFFFFFFF & 0x7FFFFFFE);
        j.lllIIIlIllI[7] = 0xBB ^ 0xBE;
        j.lllIIIlIllI[8] = 0xAA ^ 0xAC;
        j.lllIIIlIllI[9] = 0x7B ^ 0x7C;
        j.lllIIIlIllI[10] = 0x8B ^ 0x83;
        j.lllIIIlIllI[11] = 0xFFFFCFF8 & 0x1FCF7;
        j.lllIIIlIllI[12] = 0xA3 ^ 0xAA;
        j.lllIIIlIllI[13] = -(0xFFFFFDCF & 0x3276) & (0xFFFFF2FD & 0x1BFFF);
        j.lllIIIlIllI[14] = 4 ^ 0x21 ^ (0x53 ^ 0x7C);
        j.lllIIIlIllI[15] = 0xFFFFD67F & 0x98BFFF;
        j.lllIIIlIllI[16] = 0x97 ^ 0x9C;
        j.lllIIIlIllI[17] = 0xFFFFB67E & 0x98DFFF;
        j.lllIIIlIllI[18] = 0x46 ^ 0x4A;
        j.lllIIIlIllI[19] = 0xFFFFFEFD & 0x98977F;
        j.lllIIIlIllI[20] = 8 + 130 - 16 + 51 ^ 150 + 88 - 152 + 74;
        j.lllIIIlIllI[21] = -(0xFFFFEDED & 0x3B93) & (0xFFFFFFFD & 0x98BFFE);
        j.lllIIIlIllI[22] = 0xAF ^ 0xC4 ^ (0xD9 ^ 0xBC);
        j.lllIIIlIllI[23] = 0xFFFF8FA0 & 0x1F6FF;
        j.lllIIIlIllI[24] = 0x94 ^ 0x9B;
        j.lllIIIlIllI[25] = 0x14 ^ 4;
        j.lllIIIlIllI[26] = 0x42 ^ 0x53;
        j.lllIIIlIllI[27] = 0x25 ^ 0x54 ^ (0x43 ^ 0x20);
        j.lllIIIlIllI[28] = 7 ^ 0x14;
        j.lllIIIlIllI[29] = -(0xFFFFF5FD & 0x3AE6) & (0xFFFFFFFB & 0x1F9EF);
        j.lllIIIlIllI[30] = 0x57 ^ 0x43;
        j.lllIIIlIllI[31] = 0xFFFFFFFA & 0x17AED;
        j.lllIIIlIllI[32] = 17 + 42 - 5 + 79 ^ 89 + 142 - 106 + 19;
        j.lllIIIlIllI[33] = -(0xFFFF883D & 0x7FD3) & (0xFFFFFFBD & 0x17F52);
        j.lllIIIlIllI[34] = 0x79 ^ 0x6F;
        j.lllIIIlIllI[35] = -(0xFFFF9196 & 0x7EED) & (0xFFFFFFBB & 0x17FF7);
        j.lllIIIlIllI[36] = 0x22 ^ 0x4C ^ (0x17 ^ 0x6E);
        j.lllIIIlIllI[37] = 0xFFFFEFD8 & 0x17B6F;
        j.lllIIIlIllI[38] = 0x2C ^ 0x7A ^ (0x35 ^ 0x7B);
        j.lllIIIlIllI[39] = 0x4F ^ 0x56;
        j.lllIIIlIllI[40] = 0xFFFF9FCC & 0x7F73;
        j.lllIIIlIllI[41] = 19 + 142 - 77 + 85 ^ 42 + 105 - 119 + 151;
        j.lllIIIlIllI[42] = 0xFFFFF3EE & 0xFF9;
        j.lllIIIlIllI[43] = 2 ^ (0x88 ^ 0x91);
        j.lllIIIlIllI[44] = -(0xFFFFE5C7 & 0x7B7D) & (0xFFFFEDF7 & 0x77FC);
        j.lllIIIlIllI[45] = 0xA5 ^ 0xB9;
        j.lllIIIlIllI[46] = 0xFFFFC320 & 0x3FFF;
        j.lllIIIlIllI[47] = 0x57 ^ 0x53 ^ (0x70 ^ 0x69);
    }

    private static void lIlIllIlllIIll() {
        lllIIIlIIlI = new String[lllIIIlIllI[47]];
        j.lllIIIlIIlI[j.lllIIIlIllI[0]] = j."Bandos chestplate";
        j.lllIIIlIIlI[j.lllIIIlIllI[2]] = j."Bandos tassets";
        j.lllIIIlIIlI[j.lllIIIlIllI[3]] = j."Bandos hilt";
        j.lllIIIlIIlI[j.lllIIIlIllI[4]] = j."Bandos boots";
        j.lllIIIlIIlI[j.lllIIIlIllI[5]] = j."Godsword shard 1";
        j.lllIIIlIIlI[j.lllIIIlIllI[7]] = j."Godsword shard 2";
        j.lllIIIlIIlI[j.lllIIIlIllI[8]] = j."Godsword shard 3";
        j.lllIIIlIIlI[j.lllIIIlIllI[9]] = j."Coins";
        j.lllIIIlIIlI[j.lllIIIlIllI[10]] = j."Snapdragon seed";
        j.lllIIIlIIlI[j.lllIIIlIllI[12]] = j."Grimy snapdragon";
        j.lllIIIlIIlI[j.lllIIIlIllI[14]] = j."Stamina potion(4)";
        j.lllIIIlIIlI[j.lllIIIlIllI[16]] = j."Stamina potion(3)";
        j.lllIIIlIIlI[j.lllIIIlIllI[18]] = j."Stamina potion(2)";
        j.lllIIIlIIlI[j.lllIIIlIllI[20]] = j."Stamina potion(1)";
        j.lllIIIlIIlI[j.lllIIIlIllI[22]] = j."Rune platebody";
        j.lllIIIlIIlI[j.lllIIIlIllI[24]] = j."Rune 2h sword";
        j.lllIIIlIIlI[j.lllIIIlIllI[25]] = j."Rune longsword";
        j.lllIIIlIIlI[j.lllIIIlIllI[26]] = j."Rune pickaxe";
        j.lllIIIlIIlI[j.lllIIIlIllI[27]] = j."Rune kiteshield";
        j.lllIIIlIIlI[j.lllIIIlIllI[28]] = j."Shark";
        j.lllIIIlIIlI[j.lllIIIlIllI[30]] = j."Chilli potato";
        j.lllIIIlIIlI[j.lllIIIlIllI[32]] = j."Adamantite ore";
        j.lllIIIlIIlI[j.lllIIIlIllI[34]] = j."Peach";
        j.lllIIIlIIlI[j.lllIIIlIllI[36]] = j."Bones";
        j.lllIIIlIIlI[j.lllIIIlIllI[38]] = j."Big bones";
        j.lllIIIlIIlI[j.lllIIIlIllI[39]] = j."Nature rune";
        j.lllIIIlIIlI[j.lllIIIlIllI[41]] = j."Cosmic rune";
        j.lllIIIlIIlI[j.lllIIIlIllI[43]] = j."Coal";
        j.lllIIIlIIlI[j.lllIIIlIllI[45]] = j."Limpwurt root";
    }

    private static String lIlIllIllIlIlI(String llllllllllllllllIIlIIlllIIIlIlll, String llllllllllllllllIIlIIlllIIIllIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlllIIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlllIIIllIll.init(lllIIIlIllI[3], llllllllllllllllIIlIIlllIIIlllII);
            return new String(llllllllllllllllIIlIIlllIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIIIllIlI) {
            llllllllllllllllIIlIIlllIIIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIllIlIII(String llllllllllllllllIIlIIllIllllIlll, String llllllllllllllllIIlIIllIllllIllI) {
        llllllllllllllllIIlIIllIllllIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllIlllllIlI = new StringBuilder();
        char[] llllllllllllllllIIlIIllIlllllIIl = llllllllllllllllIIlIIllIllllIllI.toCharArray();
        int llllllllllllllllIIlIIllIlllllIII = lllIIIlIllI[0];
        char[] llllllllllllllllIIlIIllIllllIIlI = llllllllllllllllIIlIIllIllllIlll.toCharArray();
        int llllllllllllllllIIlIIllIllllIIIl = llllllllllllllllIIlIIllIllllIIlI.length;
        int llllllllllllllllIIlIIllIllllIIII = lllIIIlIllI[0];
        while (j.lIlIllIllllIII(llllllllllllllllIIlIIllIllllIIII, llllllllllllllllIIlIIllIllllIIIl)) {
            char llllllllllllllllIIlIIllIllllllIl = llllllllllllllllIIlIIllIllllIIlI[llllllllllllllllIIlIIllIllllIIII];
            llllllllllllllllIIlIIllIlllllIlI.append((char)(llllllllllllllllIIlIIllIllllllIl ^ llllllllllllllllIIlIIllIlllllIIl[llllllllllllllllIIlIIllIlllllIII % llllllllllllllllIIlIIllIlllllIIl.length]));
            0;
            ++llllllllllllllllIIlIIllIlllllIII;
            ++llllllllllllllllIIlIIllIllllIIII;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIllIlllllIlI);
    }
}

