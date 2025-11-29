/*
 * Decompiled with CFR 0.152.
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class e
extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lIIlIlIIlIlll;
    private static /* synthetic */ int[] lIIlIlIIllIII;

    private static String lIlIlIlllIIIIII(String llllllllllllllIlllllIIIIIIIIlIIl, String llllllllllllllIlllllIIIIIIIIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIIIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIIlIlIIllIII[10]), "DES");
            Cipher llllllllllllllIlllllIIIIIIIIlIll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIIIIIIIlIll.init(lIIlIlIIllIII[3], llllllllllllllIlllllIIIIIIIIllII);
            return new String(llllllllllllllIlllllIIIIIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIIIIIIIlIlI) {
            llllllllllllllIlllllIIIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    static {
        e.lIlIlIlllIIIIll();
        e.lIlIlIlllIIIIlI();
    }

    private static boolean lIlIlIlllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIlllIIIIll() {
        lIIlIlIIllIII = new int[48];
        e.lIIlIlIIllIII[0] = (0xE3 ^ 0xBB) & ~(0x23 ^ 0x7B);
        e.lIIlIlIIllIII[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        e.lIIlIlIIllIII[2] = 1;
        e.lIIlIlIIllIII[3] = 2;
        e.lIIlIlIIllIII[4] = 3;
        e.lIIlIlIIllIII[5] = 0x75 ^ 0x30 ^ (0x7F ^ 0x3E);
        e.lIIlIlIIllIII[6] = -1 & (0xFFFFFFFE & Integer.MAX_VALUE);
        e.lIIlIlIIllIII[7] = 3 ^ (0x49 ^ 0x4F);
        e.lIIlIlIIllIII[8] = 0x4C ^ 0x4A;
        e.lIIlIlIIllIII[9] = 127 + 51 - 162 + 165 ^ 113 + 28 - 30 + 67;
        e.lIIlIlIIllIII[10] = 181 + 17 - 56 + 41 ^ 117 + 116 - 87 + 45;
        e.lIIlIlIIllIII[11] = -(0xFFFFFDAE & 0x3A53) & (0xFFFFFFDF & 0x3EF7);
        e.lIIlIlIIllIII[12] = 0x46 ^ 0x4F;
        e.lIIlIlIIllIII[13] = -(0xFFFFC8E7 & 0x3F9B) & (0xFFFFCEFF & 0x7DDE);
        e.lIIlIlIIllIII[14] = 0x15 ^ 3 ^ (0x82 ^ 0x9E);
        e.lIIlIlIIllIII[15] = 0xFFFFCCF7 & 0x1FFF8;
        e.lIIlIlIIllIII[16] = 0x51 ^ 0x7D ^ (0x22 ^ 5);
        e.lIIlIlIIllIII[17] = -(0xFFFFFF7D & 0x2983) & (0xFFFFFBB8 & 0x1AFFF);
        e.lIIlIlIIllIII[18] = 0x6D ^ 0x61;
        e.lIIlIlIIllIII[19] = -(0xFFFF96CF & 0x6B35) & (0xFFFFEEFC & 0x137FF);
        e.lIIlIlIIllIII[20] = 0xB4 ^ 0xB9;
        e.lIIlIlIIllIII[21] = 0xFFFF9E7F & 0x98F7FF;
        e.lIIlIlIIllIII[22] = 0xCE ^ 0xBE ^ (0xA ^ 0x74);
        e.lIIlIlIIllIII[23] = 0xFFFFDF7F & 0x98B6FE;
        e.lIIlIlIIllIII[24] = 2 ^ (0x64 ^ 0x69);
        e.lIIlIlIIllIII[25] = -(0xFFFFBB1B & 0x4DE7) & (0xFFFFBF7F & 0x98DFFF);
        e.lIIlIlIIllIII[26] = 0x6C ^ 0x7C;
        e.lIIlIlIIllIII[27] = -(0xFFFF9B9B & 0x6D67) & (0xFFFF9F7E & 0x98FFFF);
        e.lIIlIlIIllIII[28] = 93 + 40 - -27 + 19 ^ 99 + 19 - -16 + 28;
        e.lIIlIlIIllIII[29] = -(0xFFFFFB5F & 0x7DBE) & (0xFFFFFFFF & 0x1FFBD);
        e.lIIlIlIIllIII[30] = 0xE1 ^ 0x91 ^ (0x3D ^ 0x5F);
        e.lIIlIlIIllIII[31] = 0x94 ^ 0xC1 ^ (0x5D ^ 0x1B);
        e.lIIlIlIIllIII[32] = 0x1B ^ 0xF;
        e.lIIlIlIIllIII[33] = 0x87 ^ 0x8A ^ (0x8E ^ 0x96);
        e.lIIlIlIIllIII[34] = 0x39 ^ 0x2F;
        e.lIIlIlIIllIII[35] = 0x86 ^ 0x91;
        e.lIIlIlIIllIII[36] = 0x67 ^ 0x6B ^ (0x78 ^ 0x6C);
        e.lIIlIlIIllIII[37] = -(0xFFFFEDDD & 0x162A) & (0xFFFFFFF7 & 0x1FFDF);
        e.lIIlIlIIllIII[38] = 0x48 ^ 0x54 ^ (0x85 ^ 0x80);
        e.lIIlIlIIllIII[39] = 0x5A ^ 1 ^ (0x65 ^ 0x24);
        e.lIIlIlIIllIII[40] = 0x72 ^ 0x69;
        e.lIIlIlIIllIII[41] = 0xFFFFDFED & 0x1E91A;
        e.lIIlIlIIllIII[42] = 9 ^ 0x7C ^ (0x79 ^ 0x10);
        e.lIIlIlIIllIII[43] = 3 ^ 0x1E;
        e.lIIlIlIIllIII[44] = -(0xFFFFFDD5 & 0x337F) & (0xFFFFFD7F & 0x17FDC);
        e.lIIlIlIIllIII[45] = 0x36 ^ 0x61 ^ (0x21 ^ 0x68);
        e.lIIlIlIIllIII[46] = 0xFFFFFEE5 & 0x4F3A;
        e.lIIlIlIIllIII[47] = 0x65 ^ 0x7A;
    }

    private static String lIlIlIllIllllll(String llllllllllllllIlllllIIIIIIIllllI, String llllllllllllllIlllllIIIIIIIlllIl) {
        llllllllllllllIlllllIIIIIIIllllI = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIIIIIIlllII = new StringBuilder();
        char[] llllllllllllllIlllllIIIIIIIllIll = llllllllllllllIlllllIIIIIIIlllIl.toCharArray();
        int llllllllllllllIlllllIIIIIIIllIlI = lIIlIlIIllIII[0];
        char[] llllllllllllllIlllllIIIIIIIlIlII = llllllllllllllIlllllIIIIIIIllllI.toCharArray();
        int llllllllllllllIlllllIIIIIIIlIIll = llllllllllllllIlllllIIIIIIIlIlII.length;
        int llllllllllllllIlllllIIIIIIIlIIlI = lIIlIlIIllIII[0];
        while (e.lIlIlIlllIIIlII(llllllllllllllIlllllIIIIIIIlIIlI, llllllllllllllIlllllIIIIIIIlIIll)) {
            char llllllllllllllIlllllIIIIIIIlllll = llllllllllllllIlllllIIIIIIIlIlII[llllllllllllllIlllllIIIIIIIlIIlI];
            llllllllllllllIlllllIIIIIIIlllII.append((char)(llllllllllllllIlllllIIIIIIIlllll ^ llllllllllllllIlllllIIIIIIIllIll[llllllllllllllIlllllIIIIIIIllIlI % llllllllllllllIlllllIIIIIIIllIll.length]));
            0;
            ++llllllllllllllIlllllIIIIIIIllIlI;
            ++llllllllllllllIlllllIIIIIIIlIIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllllIIIIIIIlllII);
    }

    private static String lIlIlIlllIIIIIl(String llllllllllllllIlllllIIIIIIlIlllI, String llllllllllllllIlllllIIIIIIlIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIIIIIllIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIIIIIllIIII.init(lIIlIlIIllIII[3], llllllllllllllIlllllIIIIIIllIIIl);
            return new String(llllllllllllllIlllllIIIIIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIIIIIlIllll) {
            llllllllllllllIlllllIIIIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlllIIIIlI() {
        lIIlIlIIlIlll = new String[lIIlIlIIllIII[47]];
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[0]] = e."Saradomin hilt";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[2]] = e."Armadyl crossbow";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[3]] = e."Saradomin sword";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[4]] = e."Saradomin's light";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[5]] = e."Godsword shard 1";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[7]] = e."Godsword shard 2";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[8]] = e."Godsword shard 3";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[9]] = e."Coins";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[10]] = e."Law rune";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[12]] = e."Diamond";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[14]] = e."Ranarr seed";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[16]] = e."Grimy ranarr weed";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[18]] = e."Magic seed";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[20]] = e."Stamina potion(4)";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[22]] = e."Stamina potion(3)";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[24]] = e."Stamina potion(2)";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[26]] = e."Stamina potion(1)";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[28]] = e."Rune platebody";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[30]] = e."Rune 2h sword";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[31]] = e."Rune longsword";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[32]] = e."Rune pickaxe";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[33]] = e."Rune kiteshield";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[34]] = e."Rune plateskirt";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[35]] = e."Adamant platebody";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[36]] = e."Summer pie";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[38]] = e."Half a summer pie";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[39]] = e."Manta ray";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[40]] = e."Shark";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[42]] = e."Monkfish";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[43]] = e."Bones";
        e.lIIlIlIIlIlll[e.lIIlIlIIllIII[45]] = e."Wine of zamorak";
    }

    e() {
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[0]], lIIlIlIIllIII[1]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[2]], lIIlIlIIllIII[1]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[3]], lIIlIlIIllIII[1]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[4]], lIIlIlIIllIII[1]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[5]], lIIlIlIIllIII[6]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[7]], lIIlIlIIllIII[6]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[8]], lIIlIlIIllIII[6]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[9]], lIIlIlIIllIII[2]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[10]], lIIlIlIIllIII[11]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[12]], lIIlIlIIllIII[13]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[14]], lIIlIlIIllIII[15]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[16]], lIIlIlIIllIII[17]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[18]], lIIlIlIIllIII[19]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[20]], lIIlIlIIllIII[21]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[22]], lIIlIlIIllIII[23]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[24]], lIIlIlIIllIII[25]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[26]], lIIlIlIIllIII[27]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[28]], lIIlIlIIllIII[29]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[30]], lIIlIlIIllIII[29]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[31]], lIIlIlIIllIII[29]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[32]], lIIlIlIIllIII[29]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[33]], lIIlIlIIllIII[29]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[34]], lIIlIlIIllIII[29]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[35]], lIIlIlIIllIII[29]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[36]], lIIlIlIIllIII[37]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[38]], lIIlIlIIllIII[37]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[39]], lIIlIlIIllIII[37]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[40]], lIIlIlIIllIII[41]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[42]], lIIlIlIIllIII[17]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[43]], lIIlIlIIllIII[44]);
        0;
        this.put(lIIlIlIIlIlll[lIIlIlIIllIII[45]], lIIlIlIIllIII[46]);
        0;
    }
}

