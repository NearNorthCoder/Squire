/*
 * Decompiled with CFR 0.152.
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class j
extends HashMap<String, Integer> {
    private static /* synthetic */ int[] lIllIIIlIIlIl;
    private static /* synthetic */ String[] lIllIIIlIIlII;

    private static String llIIIlIIllIIlll(String llllllllllllllIllIIlIlllllIlIlII, String llllllllllllllIllIIlIlllllIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlllllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlllllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIlIIlIl[10]), "DES");
            Cipher llllllllllllllIllIIlIlllllIlIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlllllIlIllI.init(lIllIIIlIIlIl[3], llllllllllllllIllIIlIlllllIlIlll);
            return new String(llllllllllllllIllIIlIlllllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlllllIlIlIl) {
            llllllllllllllIllIIlIlllllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIllIlIII() {
        lIllIIIlIIlII = new String[lIllIIIlIIlIl[35]];
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[0]] = j."Zamorak hilt";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[2]] = j."Staff of the dead";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[3]] = j."Zamorakian spear";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[4]] = j."Steam battlestaff";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[5]] = j."Godsword shard 1";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[7]] = j."Godsword shard 2";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[8]] = j."Godsword shard 3";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[9]] = j."Coins";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[10]] = j."Lantadyme seed";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[12]] = j."Grimy lantadyme";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[14]] = j."Stamina potion(4)";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[16]] = j."Stamina potion(3)";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[18]] = j."Stamina potion(2)";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[20]] = j."Stamina potion(1)";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[22]] = j."Rune platebody";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[24]] = j."Rune 2h sword";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[25]] = j."Rune longsword";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[26]] = j."Rune pickaxe";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[27]] = j."Rune kiteshield";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[28]] = j."Tuna potato";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[30]] = j."Manta ray";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[31]] = j."Shark";
        j.lIllIIIlIIlII[j.lIllIIIlIIlIl[33]] = j."Wine of zamorak";
    }

    j() {
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[0]], lIllIIIlIIlIl[1]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[2]], lIllIIIlIIlIl[1]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[3]], lIllIIIlIIlIl[1]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[4]], lIllIIIlIIlIl[1]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[5]], lIllIIIlIIlIl[6]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[7]], lIllIIIlIIlIl[6]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[8]], lIllIIIlIIlIl[6]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[9]], lIllIIIlIIlIl[2]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[10]], lIllIIIlIIlIl[11]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[12]], lIllIIIlIIlIl[13]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[14]], lIllIIIlIIlIl[15]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[16]], lIllIIIlIIlIl[17]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[18]], lIllIIIlIIlIl[19]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[20]], lIllIIIlIIlIl[21]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[22]], lIllIIIlIIlIl[23]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[24]], lIllIIIlIIlIl[23]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[25]], lIllIIIlIIlIl[23]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[26]], lIllIIIlIIlIl[23]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[27]], lIllIIIlIIlIl[23]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[28]], lIllIIIlIIlIl[29]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[30]], lIllIIIlIIlIl[29]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[31]], lIllIIIlIIlIl[32]);
        0;
        this.put(lIllIIIlIIlII[lIllIIIlIIlIl[33]], lIllIIIlIIlIl[34]);
        0;
    }

    private static String llIIIlIIllIIllI(String llllllllllllllIllIIlIlllllIlllll, String llllllllllllllIllIIlIllllllIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllllllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIllllllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIllllllIIIll.init(lIllIIIlIIlIl[3], llllllllllllllIllIIlIllllllIIlII);
            return new String(llllllllllllllIllIIlIllllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIllllllIIIlI) {
            llllllllllllllIllIIlIllllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIllIlIIl() {
        lIllIIIlIIlIl = new int[36];
        j.lIllIIIlIIlIl[0] = (0x90 ^ 0x81 ^ (0x4B ^ 0x7C)) & (0xEA ^ 0xC7 ^ (0x4C ^ 0x47) ^ -1);
        j.lIllIIIlIIlIl[1] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        j.lIllIIIlIIlIl[2] = 1;
        j.lIllIIIlIIlIl[3] = 2;
        j.lIllIIIlIIlIl[4] = 3;
        j.lIllIIIlIIlIl[5] = 0x33 ^ 0x53 ^ (0x22 ^ 0x46);
        j.lIllIIIlIIlIl[6] = -1 & (0xFFFFFFFF & 0x7FFFFFFE);
        j.lIllIIIlIIlIl[7] = 0xA1 ^ 0xA4;
        j.lIllIIIlIIlIl[8] = 0x88 ^ 0x8E;
        j.lIllIIIlIIlIl[9] = 0x7F ^ 0x78;
        j.lIllIIIlIIlIl[10] = 0x1C ^ 0x14;
        j.lIllIIIlIIlIl[11] = 0xFFFFECF9 & 0x1DFF6;
        j.lIllIIIlIIlIl[12] = 0x1E ^ 0x5B ^ (4 ^ 0x48);
        j.lIllIIIlIIlIl[13] = -(0xFFFFFD3C & 0x3FCB) & (0xFFFFBFFF & 0x1FFBF);
        j.lIllIIIlIIlIl[14] = 27 + 154 - 23 + 10 ^ 153 + 107 - 146 + 48;
        j.lIllIIIlIIlIl[15] = 0xFFFFB77F & 0x98DEFF;
        j.lIllIIIlIIlIl[16] = 0x33 ^ 0x47 ^ 63 + 41 - 9 + 32;
        j.lIllIIIlIIlIl[17] = -(0xFFFFF9FF & 0x4F82) & (0xFFFFDFFF & 0x98FFFF);
        j.lIllIIIlIIlIl[18] = 0x1F ^ 0x13;
        j.lIllIIIlIIlIl[19] = -(0xFFFFDCC7 & 0x6BBB) & (0xFFFFFFFF & 0x98DEFF);
        j.lIllIIIlIIlIl[20] = 24 + 77 - 27 + 71 ^ 124 + 59 - 62 + 35;
        j.lIllIIIlIIlIl[21] = 0xFFFFB77F & 0x98DEFC;
        j.lIllIIIlIIlIl[22] = 73 + 8 - 46 + 123 ^ 72 + 104 - 54 + 22;
        j.lIllIIIlIIlIl[23] = 0xFFFFA7E3 & 0x1DEBC;
        j.lIllIIIlIIlIl[24] = 0x8D ^ 0x82;
        j.lIllIIIlIIlIl[25] = 0x3F ^ 0x72 ^ (0x64 ^ 0x39);
        j.lIllIIIlIIlIl[26] = 82 + 117 - 178 + 145 ^ 166 + 178 - 262 + 101;
        j.lIllIIIlIIlIl[27] = 0x88 ^ 0x9A;
        j.lIllIIIlIIlIl[28] = 0xDF ^ 0xAC ^ (0xA4 ^ 0xC4);
        j.lIllIIIlIIlIl[29] = -(0xFFFFA42F & 0x5FDB) & (0xFFFFFFDE & 0x1FFFB);
        j.lIllIIIlIIlIl[30] = 0x28 ^ 0x3C;
        j.lIllIIIlIIlIl[31] = 0x6E ^ 0x47 ^ (0x8A ^ 0xB6);
        j.lIllIIIlIIlIl[32] = 0xFFFFDB6E & 0x1ED99;
        j.lIllIIIlIIlIl[33] = 0xF8 ^ 0xB8 ^ (0x44 ^ 0x12);
        j.lIllIIIlIIlIl[34] = 0xFFFFDFEB & 0x6E34;
        j.lIllIIIlIIlIl[35] = 0x3A ^ 9 ^ (0xB8 ^ 0x9C);
    }

    private static boolean llIIIlIIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlIIllIIlIl(String llllllllllllllIllIIlIllllIllllll, String llllllllllllllIllIIlIlllllIIIIll) {
        llllllllllllllIllIIlIllllIllllll = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlllllIIIIlI = new StringBuilder();
        char[] llllllllllllllIllIIlIlllllIIIIIl = llllllllllllllIllIIlIlllllIIIIll.toCharArray();
        int llllllllllllllIllIIlIlllllIIIIII = lIllIIIlIIlIl[0];
        char[] llllllllllllllIllIIlIllllIlllIlI = llllllllllllllIllIIlIllllIllllll.toCharArray();
        int llllllllllllllIllIIlIllllIlllIIl = llllllllllllllIllIIlIllllIlllIlI.length;
        int llllllllllllllIllIIlIllllIlllIII = lIllIIIlIIlIl[0];
        while (j.llIIIlIIllIlIlI(llllllllllllllIllIIlIllllIlllIII, llllllllllllllIllIIlIllllIlllIIl)) {
            char llllllllllllllIllIIlIlllllIIIlIl = llllllllllllllIllIIlIllllIlllIlI[llllllllllllllIllIIlIllllIlllIII];
            llllllllllllllIllIIlIlllllIIIIlI.append((char)(llllllllllllllIllIIlIlllllIIIlIl ^ llllllllllllllIllIIlIlllllIIIIIl[llllllllllllllIllIIlIlllllIIIIII % llllllllllllllIllIIlIlllllIIIIIl.length]));
            0;
            ++llllllllllllllIllIIlIlllllIIIIII;
            ++llllllllllllllIllIIlIllllIlllIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIlllllIIIIlI);
    }

    static {
        j.llIIIlIIllIlIIl();
        j.llIIIlIIllIlIII();
    }
}

