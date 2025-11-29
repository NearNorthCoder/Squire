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

public final class BGEnum
extends Enum<bG> {
    private final /* synthetic */ boolean twoHanded;
    public static final /* synthetic */ /* enum */ bG DRAGON_WARHAMMER;
    public static final /* synthetic */ /* enum */ bG SARADOMIN_BLESSED_SWORD;
    private static /* synthetic */ int[] llllIlII;
    private static /* synthetic */ String[] llllIIll;
    public static final /* synthetic */ /* enum */ bG DRAGON_LONGSWORD;
    private static final /* synthetic */ bG[] $VALUES;
    public static final /* synthetic */ /* enum */ bG BANDOS_GODSWORD;
    public static final /* synthetic */ /* enum */ bG ARMADYL_GODSWORD;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ /* enum */ bG SARADOMIN_GODSWORD;
    public static final /* synthetic */ /* enum */ bG DRAGON_DAGGER_PP;
    public static final /* synthetic */ /* enum */ bG DRAGON_DAGGER;
    public static final /* synthetic */ /* enum */ bG CRYSTAL_HALBERD;
    public static final /* synthetic */ /* enum */ bG DRAGON_HALBERD;
    public static final /* synthetic */ /* enum */ bG SARADOMIN_SWORD;
    public static final /* synthetic */ /* enum */ bG DRAGON_DAGGER_P;
    public static final /* synthetic */ /* enum */ bG DRAGON_BATTLEAXE;
    public static final /* synthetic */ /* enum */ bG DRAGON_DAGGER_PPP;
    public static final /* synthetic */ /* enum */ bG DRAGON_CLAWS;
    private final /* synthetic */ int specAmount;
    public static final /* synthetic */ /* enum */ bG DRAGON_MACE;

    public static bG[] values() {
        return (bG[])$VALUES.clone();
    }

    private static void llIlIIllll() {
        llllIIll = new String[llllIlII[37]];
        bG.llllIIll[bG.llllIlII[0]] = bG."DRAGON_BATTLEAXE";
        bG.llllIIll[bG.llllIlII[3]] = bG."DRAGON_CLAWS";
        bG.llllIIll[bG.llllIlII[6]] = bG."DRAGON_DAGGER";
        bG.llllIIll[bG.llllIlII[9]] = bG."DRAGON_DAGGER_P";
        bG.llllIIll[bG.llllIlII[11]] = bG."DRAGON_DAGGER_PP";
        bG.llllIIll[bG.llllIlII[13]] = bG."DRAGON_DAGGER_PPP";
        bG.llllIIll[bG.llllIlII[15]] = bG."DRAGON_HALBERD";
        bG.llllIIll[bG.llllIlII[18]] = bG."DRAGON_LONGSWORD";
        bG.llllIIll[bG.llllIlII[20]] = bG."DRAGON_MACE";
        bG.llllIIll[bG.llllIlII[22]] = bG."DRAGON_WARHAMMER";
        bG.llllIIll[bG.llllIlII[24]] = bG."ARMADYL_GODSWORD";
        bG.llllIIll[bG.llllIlII[26]] = bG."BANDOS_GODSWORD";
        bG.llllIIll[bG.llllIlII[28]] = bG."SARADOMIN_GODSWORD";
        bG.llllIIll[bG.llllIlII[30]] = bG."SARADOMIN_SWORD";
        bG.llllIIll[bG.llllIlII[32]] = bG."SARADOMIN_BLESSED_SWORD";
        bG.llllIIll[bG.llllIlII[35]] = bG."CRYSTAL_HALBERD";
    }

    private static void llIlIlIIIl() {
        llllIlII = new int[38];
        bG.llllIlII[0] = (0x3D ^ 0x23) & ~(0x68 ^ 0x76);
        bG.llllIlII[1] = 0xFFFFB5EF & 0x4F71;
        bG.llllIlII[2] = 0xF8 ^ 0x9C;
        bG.llllIlII[3] = 1;
        bG.llllIlII[4] = -(0xFFFFCE73 & 0x798D) & (0xFFFFFD5C & 0x7FF7);
        bG.llllIlII[5] = 0xBD ^ 0x8F;
        bG.llllIlII[6] = 2;
        bG.llllIlII[7] = 0xFFFFCEFF & 0x35BF;
        bG.llllIlII[8] = 0xD1 ^ 0x8F ^ (0x76 ^ 0x31);
        bG.llllIlII[9] = 3;
        bG.llllIlII[10] = -(0xFFFFC9F3 & 0x7F3D) & (0xFFFFEFFF & 0x5DFF);
        bG.llllIlII[11] = 8 ^ 0x78 ^ (0xEF ^ 0x9B);
        bG.llllIlII[12] = 0xFFFFFF3A & 0x16F5;
        bG.llllIlII[13] = 0xEA ^ 0xBC ^ (0x19 ^ 0x4A);
        bG.llllIlII[14] = 0xFFFFDE66 & 0x37DB;
        bG.llllIlII[15] = 24 + 86 - 60 + 139 ^ 100 + 114 - 38 + 11;
        bG.llllIlII[16] = 0xFFFFEEA4 & 0x1DDF;
        bG.llllIlII[17] = 0xA4 ^ 0xBA;
        bG.llllIlII[18] = 7 ^ 0;
        bG.llllIlII[19] = -(0xFFFFFBBD & 0x74C3) & (0xFFFFF79D & 0x7DFB);
        bG.llllIlII[20] = 112 + 52 - 137 + 134 ^ 16 + 119 - -32 + 2;
        bG.llllIlII[21] = 0xFFFFC5BE & 0x3FDB;
        bG.llllIlII[22] = 33 + 72 - 49 + 130 ^ 46 + 133 - 39 + 39;
        bG.llllIlII[23] = 0xFFFFBFAF & 0x7558;
        bG.llllIlII[24] = 0xB6 ^ 0xBC;
        bG.llllIlII[25] = -(109 + 66 - 14 + 1) & (0xFFFFEEFF & 0x3FBB);
        bG.llllIlII[26] = 0x41 ^ 0x4A;
        bG.llllIlII[27] = 0xFFFFAE9E & 0x7F7D;
        bG.llllIlII[28] = 0xB1 ^ 0xBD;
        bG.llllIlII[29] = -(0xFFFFEF5A & 0x51E7) & (0xFFFFFF7F & 0x6FDF);
        bG.llllIlII[30] = 0x29 ^ 0x24;
        bG.llllIlII[31] = -2 & (0xFFFFEF7F & 0x3EBF);
        bG.llllIlII[32] = 0x24 ^ 0x2A ^ (0x9C ^ 0xBB) & ~(0x2C ^ 0xB);
        bG.llllIlII[33] = 0xFFFFF26D & 0x3F9B;
        bG.llllIlII[34] = 103 + 76 - 82 + 125 ^ 51 + 111 - 65 + 62;
        bG.llllIlII[35] = 0x4D ^ 0x42;
        bG.llllIlII[36] = 0xFFFFDDFB & 0x7FB7;
        bG.llllIlII[37] = 0xA0 ^ 0xB0;
    }

    static {
        bG.llIlIlIIIl();
        bG.llIlIIllll();
        DRAGON_BATTLEAXE = new bG(llllIlII[1], llllIlII[2], llllIlII[0]);
        DRAGON_CLAWS = new bG(llllIlII[4], llllIlII[5], llllIlII[3]);
        DRAGON_DAGGER = new bG(llllIlII[7], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_P = new bG(llllIlII[10], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_PP = new bG(llllIlII[12], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_PPP = new bG(llllIlII[14], llllIlII[8], llllIlII[0]);
        DRAGON_HALBERD = new bG(llllIlII[16], llllIlII[17], llllIlII[3]);
        DRAGON_LONGSWORD = new bG(llllIlII[19], llllIlII[8], llllIlII[0]);
        DRAGON_MACE = new bG(llllIlII[21], llllIlII[8], llllIlII[0]);
        DRAGON_WARHAMMER = new bG(llllIlII[23], llllIlII[5], llllIlII[0]);
        ARMADYL_GODSWORD = new bG(llllIlII[25], llllIlII[5], llllIlII[3]);
        BANDOS_GODSWORD = new bG(llllIlII[27], llllIlII[5], llllIlII[3]);
        SARADOMIN_GODSWORD = new bG(llllIlII[29], llllIlII[5], llllIlII[3]);
        SARADOMIN_SWORD = new bG(llllIlII[31], llllIlII[2], llllIlII[3]);
        SARADOMIN_BLESSED_SWORD = new bG(llllIlII[33], llllIlII[34], llllIlII[3]);
        CRYSTAL_HALBERD = new bG(llllIlII[36], llllIlII[17], llllIlII[3]);
        bG[] bGArray = new bG[llllIlII[37]];
        bGArray[bG.llllIlII[0]] = DRAGON_BATTLEAXE;
        bGArray[bG.llllIlII[3]] = DRAGON_CLAWS;
        bGArray[bG.llllIlII[6]] = DRAGON_DAGGER;
        bGArray[bG.llllIlII[9]] = DRAGON_DAGGER_P;
        bGArray[bG.llllIlII[11]] = DRAGON_DAGGER_PP;
        bGArray[bG.llllIlII[13]] = DRAGON_DAGGER_PPP;
        bGArray[bG.llllIlII[15]] = DRAGON_HALBERD;
        bGArray[bG.llllIlII[18]] = DRAGON_LONGSWORD;
        bGArray[bG.llllIlII[20]] = DRAGON_MACE;
        bGArray[bG.llllIlII[22]] = DRAGON_WARHAMMER;
        bGArray[bG.llllIlII[24]] = ARMADYL_GODSWORD;
        bGArray[bG.llllIlII[26]] = BANDOS_GODSWORD;
        bGArray[bG.llllIlII[28]] = SARADOMIN_GODSWORD;
        bGArray[bG.llllIlII[30]] = SARADOMIN_SWORD;
        bGArray[bG.llllIlII[32]] = SARADOMIN_BLESSED_SWORD;
        bGArray[bG.llllIlII[35]] = CRYSTAL_HALBERD;
        $VALUES = bGArray;
    }

    private bG(int n3, int n4, boolean bl2) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl2;
    }

    private static String llIlIIllIl(String llIlIIIllllIlII, String llIlIIIllllIIIl) {
        try {
            SecretKeySpec llIlIIIllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), llllIlII[20]), "DES");
            Cipher llIlIIIllllIllI = Cipher.getInstance("DES");
            llIlIIIllllIllI.init(llllIlII[6], llIlIIIllllIlll);
            return new String(llIlIIIllllIllI.doFinal(Base64.getDecoder().decode(llIlIIIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIllllIlIl) {
            llIlIIIllllIlIl.printStackTrace();
            return null;
        }
    }

    public boolean at() {
        return this.twoHanded;
    }

    private static String llIlIIlllI(String llIlIIlIIIIIIIl, String llIlIIlIIIIIIII) {
        try {
            SecretKeySpec llIlIIlIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIlIIIIIIll = Cipher.getInstance("Blowfish");
            llIlIIlIIIIIIll.init(llllIlII[6], llIlIIlIIIIIlII);
            return new String(llIlIIlIIIIIIll.doFinal(Base64.getDecoder().decode(llIlIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIIIIIIlI) {
            llIlIIlIIIIIIlI.printStackTrace();
            return null;
        }
    }

    public static bG valueOf(String string) {
        return Enum.valueOf(BGEnum.class, string);
    }

    private static boolean llIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int as() {
        return this.specAmount;
    }

    private static String llIlIIllII(String llIlIIIlllIIlII, String llIlIIIlllIIIll) {
        llIlIIIlllIIlII = new String(Base64.getDecoder().decode(llIlIIIlllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIIlllIIIlI = new StringBuilder();
        char[] llIlIIIlllIIIIl = llIlIIIlllIIIll.toCharArray();
        int llIlIIIlllIIIII = llllIlII[0];
        char[] llIlIIIllIllIlI = llIlIIIlllIIlII.toCharArray();
        int llIlIIIllIllIIl = llIlIIIllIllIlI.length;
        int llIlIIIllIllIII = llllIlII[0];
        while (bG.llIlIlIIlI(llIlIIIllIllIII, llIlIIIllIllIIl)) {
            char llIlIIIlllIIlIl = llIlIIIllIllIlI[llIlIIIllIllIII];
            llIlIIIlllIIIlI.append((char)(llIlIIIlllIIlIl ^ llIlIIIlllIIIIl[llIlIIIlllIIIII % llIlIIIlllIIIIl.length]));
            0;
            ++llIlIIIlllIIIII;
            ++llIlIIIllIllIII;
            0;
            if (((2 + 90 - 50 + 118 ^ 149 + 63 - 172 + 153) & (0x21 ^ 0x71 ^ (0x66 ^ 0x57) ^ -1)) < 2) continue;
            return null;
        }
        return String.valueOf(llIlIIIlllIIIlI);
    }

    public int ar() {
        return this.itemID;
    }
}

