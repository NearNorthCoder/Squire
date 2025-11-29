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

public final class G
extends Enum<G> {
    public static final /* synthetic */ /* enum */ G CRYSTAL_HALBERD;
    private static /* synthetic */ String[] lIIlllllI;
    public static final /* synthetic */ /* enum */ G DRAGON_DAGGER;
    public static final /* synthetic */ /* enum */ G DRAGON_LONGSWORD;
    public static final /* synthetic */ /* enum */ G SARADOMIN_SWORD;
    public static final /* synthetic */ /* enum */ G DRAGON_DAGGER_PPP;
    public static final /* synthetic */ /* enum */ G DRAGON_DAGGER_PP;
    public static final /* synthetic */ /* enum */ G DRAGON_CLAWS;
    public static final /* synthetic */ /* enum */ G TOXIC_BLOWPIPE;
    public static final /* synthetic */ /* enum */ G DRAGON_DAGGER_P;
    public static final /* synthetic */ /* enum */ G SARADOMIN_BLESSED_SWORD;
    public static final /* synthetic */ /* enum */ G ARMADYL_GODSWORD;
    public static final /* synthetic */ /* enum */ G BANDOS_GODSWORD;
    public static final /* synthetic */ /* enum */ G DRAGON_BATTLEAXE;
    private static /* synthetic */ int[] lIIllllll;
    private static final /* synthetic */ G[] $VALUES;
    private final /* synthetic */ int itemID;
    private final /* synthetic */ int specAmount;
    public static final /* synthetic */ /* enum */ G DRAGON_MACE;
    public static final /* synthetic */ /* enum */ G SARADOMIN_GODSWORD;
    public static final /* synthetic */ /* enum */ G OSMUMTENS_FANG;
    public static final /* synthetic */ /* enum */ G VOIDWAKER;
    public static final /* synthetic */ /* enum */ G DRAGON_WARHAMMER;
    public static final /* synthetic */ /* enum */ G DRAGON_HALBERD;
    private final /* synthetic */ boolean twoHanded;

    private G(int n3, int n4, boolean bl2) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl2;
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private static String lIIIlIllIII(String llIIIlIIIllIlll, String llIIIlIIIllIllI) {
        try {
            SecretKeySpec llIIIlIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIIllIllI.getBytes(StandardCharsets.UTF_8)), lIIllllll[20]), "DES");
            Cipher llIIIlIIIlllIll = Cipher.getInstance("DES");
            llIIIlIIIlllIll.init(lIIllllll[6], llIIIlIIIllllII);
            return new String(llIIIlIIIlllIll.doFinal(Base64.getDecoder().decode(llIIIlIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIIIlllIlI) {
            llIIIlIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIllIll() {
        lIIlllllI = new String[lIIllllll[43]];
        G.lIIlllllI[G.lIIllllll[0]] = G."DRAGON_BATTLEAXE";
        G.lIIlllllI[G.lIIllllll[3]] = G."DRAGON_CLAWS";
        G.lIIlllllI[G.lIIllllll[6]] = G."DRAGON_DAGGER";
        G.lIIlllllI[G.lIIllllll[9]] = G."DRAGON_DAGGER_P";
        G.lIIlllllI[G.lIIllllll[11]] = G."DRAGON_DAGGER_PP";
        G.lIIlllllI[G.lIIllllll[13]] = G."DRAGON_DAGGER_PPP";
        G.lIIlllllI[G.lIIllllll[15]] = G."DRAGON_HALBERD";
        G.lIIlllllI[G.lIIllllll[18]] = G."DRAGON_LONGSWORD";
        G.lIIlllllI[G.lIIllllll[20]] = G."DRAGON_MACE";
        G.lIIlllllI[G.lIIllllll[22]] = G."DRAGON_WARHAMMER";
        G.lIIlllllI[G.lIIllllll[24]] = G."ARMADYL_GODSWORD";
        G.lIIlllllI[G.lIIllllll[26]] = G."BANDOS_GODSWORD";
        G.lIIlllllI[G.lIIllllll[28]] = G."SARADOMIN_GODSWORD";
        G.lIIlllllI[G.lIIllllll[30]] = G."SARADOMIN_SWORD";
        G.lIIlllllI[G.lIIllllll[32]] = G."SARADOMIN_BLESSED_SWORD";
        G.lIIlllllI[G.lIIllllll[35]] = G."VOIDWAKER";
        G.lIIlllllI[G.lIIllllll[37]] = G."TOXIC_BLOWPIPE";
        G.lIIlllllI[G.lIIllllll[39]] = G."OSMUMTENS_FANG";
        G.lIIlllllI[G.lIIllllll[41]] = G."CRYSTAL_HALBERD";
    }

    static {
        G.lIIIlIlllII();
        G.lIIIlIllIll();
        DRAGON_BATTLEAXE = new G(lIIllllll[1], lIIllllll[2], lIIllllll[0]);
        DRAGON_CLAWS = new G(lIIllllll[4], lIIllllll[5], lIIllllll[3]);
        DRAGON_DAGGER = new G(lIIllllll[7], lIIllllll[8], lIIllllll[0]);
        DRAGON_DAGGER_P = new G(lIIllllll[10], lIIllllll[8], lIIllllll[0]);
        DRAGON_DAGGER_PP = new G(lIIllllll[12], lIIllllll[8], lIIllllll[0]);
        DRAGON_DAGGER_PPP = new G(lIIllllll[14], lIIllllll[8], lIIllllll[0]);
        DRAGON_HALBERD = new G(lIIllllll[16], lIIllllll[17], lIIllllll[3]);
        DRAGON_LONGSWORD = new G(lIIllllll[19], lIIllllll[8], lIIllllll[0]);
        DRAGON_MACE = new G(lIIllllll[21], lIIllllll[8], lIIllllll[0]);
        DRAGON_WARHAMMER = new G(lIIllllll[23], lIIllllll[5], lIIllllll[0]);
        ARMADYL_GODSWORD = new G(lIIllllll[25], lIIllllll[5], lIIllllll[3]);
        BANDOS_GODSWORD = new G(lIIllllll[27], lIIllllll[5], lIIllllll[3]);
        SARADOMIN_GODSWORD = new G(lIIllllll[29], lIIllllll[5], lIIllllll[3]);
        SARADOMIN_SWORD = new G(lIIllllll[31], lIIllllll[2], lIIllllll[3]);
        SARADOMIN_BLESSED_SWORD = new G(lIIllllll[33], lIIllllll[34], lIIllllll[3]);
        VOIDWAKER = new G(lIIllllll[36], lIIllllll[5], lIIllllll[0]);
        TOXIC_BLOWPIPE = new G(lIIllllll[38], lIIllllll[5], lIIllllll[3]);
        OSMUMTENS_FANG = new G(lIIllllll[40], lIIllllll[8], lIIllllll[3]);
        CRYSTAL_HALBERD = new G(lIIllllll[42], lIIllllll[17], lIIllllll[3]);
        G[] gArray = new G[lIIllllll[43]];
        gArray[G.lIIllllll[0]] = DRAGON_BATTLEAXE;
        gArray[G.lIIllllll[3]] = DRAGON_CLAWS;
        gArray[G.lIIllllll[6]] = DRAGON_DAGGER;
        gArray[G.lIIllllll[9]] = DRAGON_DAGGER_P;
        gArray[G.lIIllllll[11]] = DRAGON_DAGGER_PP;
        gArray[G.lIIllllll[13]] = DRAGON_DAGGER_PPP;
        gArray[G.lIIllllll[15]] = DRAGON_HALBERD;
        gArray[G.lIIllllll[18]] = DRAGON_LONGSWORD;
        gArray[G.lIIllllll[20]] = DRAGON_MACE;
        gArray[G.lIIllllll[22]] = DRAGON_WARHAMMER;
        gArray[G.lIIllllll[24]] = ARMADYL_GODSWORD;
        gArray[G.lIIllllll[26]] = BANDOS_GODSWORD;
        gArray[G.lIIllllll[28]] = SARADOMIN_GODSWORD;
        gArray[G.lIIllllll[30]] = SARADOMIN_SWORD;
        gArray[G.lIIllllll[32]] = SARADOMIN_BLESSED_SWORD;
        gArray[G.lIIllllll[35]] = VOIDWAKER;
        gArray[G.lIIllllll[37]] = TOXIC_BLOWPIPE;
        gArray[G.lIIllllll[39]] = OSMUMTENS_FANG;
        gArray[G.lIIllllll[41]] = CRYSTAL_HALBERD;
        $VALUES = gArray;
    }

    public int ar() {
        return this.itemID;
    }

    private static String lIIIlIllIlI(String llIIIlIIIIlIIlI, String llIIIlIIIIlIIIl) {
        try {
            SecretKeySpec llIIIlIIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIlIIIIlIllI = Cipher.getInstance("Blowfish");
            llIIIlIIIIlIllI.init(lIIllllll[6], llIIIlIIIIlIlll);
            return new String(llIIIlIIIIlIllI.doFinal(Base64.getDecoder().decode(llIIIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIIIIlIlIl) {
            llIIIlIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    private static String lIIIlIllIIl(String llIIIlIIIlIIlII, String llIIIlIIIlIlIII) {
        llIIIlIIIlIIlII = new String(Base64.getDecoder().decode(llIIIlIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIIIlIIlll = new StringBuilder();
        char[] llIIIlIIIlIIllI = llIIIlIIIlIlIII.toCharArray();
        int llIIIlIIIlIIlIl = lIIllllll[0];
        char[] llIIIlIIIIlllll = llIIIlIIIlIIlII.toCharArray();
        int llIIIlIIIIllllI = llIIIlIIIIlllll.length;
        int llIIIlIIIIlllIl = lIIllllll[0];
        while (G.lIIIlIlllIl(llIIIlIIIIlllIl, llIIIlIIIIllllI)) {
            char llIIIlIIIlIlIlI = llIIIlIIIIlllll[llIIIlIIIIlllIl];
            llIIIlIIIlIIlll.append((char)(llIIIlIIIlIlIlI ^ llIIIlIIIlIIllI[llIIIlIIIlIIlIl % llIIIlIIIlIIllI.length]));
            0;
            ++llIIIlIIIlIIlIl;
            ++llIIIlIIIIlllIl;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(llIIIlIIIlIIlll);
    }

    public int as() {
        return this.specAmount;
    }

    private static void lIIIlIlllII() {
        lIIllllll = new int[44];
        G.lIIllllll[0] = (0x48 ^ 0x1C ^ (0x60 ^ 0x18)) & (0xD8 ^ 0x9E ^ (0xF5 ^ 0x9F) ^ -1);
        G.lIIllllll[1] = 0xFFFFA5EB & 0x5F75;
        G.lIIllllll[2] = 0x1F ^ 0x7B;
        G.lIIllllll[3] = 1;
        G.lIIllllll[4] = -(0xFFFFC9DF & 0x7E29) & (0xFFFFFFDE & 0x7D7D);
        G.lIIllllll[5] = 44 + 145 - 103 + 85 ^ 21 + 32 - -88 + 12;
        G.lIIllllll[6] = 2;
        G.lIIllllll[7] = 0xFFFF96BF & 0x6DFF;
        G.lIIllllll[8] = 168 + 88 - 92 + 24 ^ 152 + 60 - 127 + 80;
        G.lIIllllll[9] = 3;
        G.lIIllllll[10] = 0xFFFFF5DF & 0xEEF;
        G.lIIllllll[11] = 0x4F ^ 0x4B;
        G.lIIllllll[12] = 0xFFFFF776 & 0x1EB9;
        G.lIIllllll[13] = 0x7E ^ 0x7B;
        G.lIIllllll[14] = -(0xFFFFBBBE & 0x6CD7) & (0xFFFFFFDF & 0x3EF7);
        G.lIIllllll[15] = 118 + 60 - 48 + 25 ^ 84 + 35 - 81 + 119;
        G.lIIllllll[16] = -(0xFFFFFFEA & 0x733F) & (0xFFFFFFBD & 0x7FEF);
        G.lIIllllll[17] = 0xB1 ^ 0xAF;
        G.lIIllllll[18] = 0xF0 ^ 0x91 ^ (0x2B ^ 0x4D);
        G.lIIllllll[19] = 0xFFFFEFFD & 0x151B;
        G.lIIllllll[20] = 0xD9 ^ 0x95 ^ (0x39 ^ 0x7D);
        G.lIIllllll[21] = 0xFFFFDF9A & 0x25FF;
        G.lIIllllll[22] = 17 + 57 - -30 + 79 ^ 88 + 158 - 218 + 162;
        G.lIIllllll[23] = 0xFFFFB728 & 0x7DDF;
        G.lIIllllll[24] = 0 ^ 0xA;
        G.lIIllllll[25] = -(0xFFFFDFA7 & 0x61FE) & (0xFFFFFFBF & 0x6FFF);
        G.lIIllllll[26] = 0x62 ^ 0x69;
        G.lIIllllll[27] = 0xFFFFEE7D & 0x3F9E;
        G.lIIllllll[28] = 0xDE ^ 0xA4 ^ (0x4C ^ 0x3A);
        G.lIIllllll[29] = -(0xFFFFDBC1 & 0x75FF) & (0xFFFFFFFE & 0x7FDF);
        G.lIIllllll[30] = 0x3D ^ 0x30;
        G.lIIllllll[31] = 0xFFFFAFFF & 0x7E3E;
        G.lIIllllll[32] = 0x7C ^ 0x72;
        G.lIIllllll[33] = -(0xFFFFAC79 & 0x57D7) & (0xFFFFFF5D & 0x36FB);
        G.lIIllllll[34] = 0x75 ^ 0x34;
        G.lIIllllll[35] = 0xCA ^ 0xB0 ^ (0xCA ^ 0xBF);
        G.lIIllllll[36] = 0xFFFFFC6A & 0x6FBF;
        G.lIIllllll[37] = 0x4A ^ 0x5A;
        G.lIIllllll[38] = -(0xFFFFDF5A & 0x2DA7) & (0xFFFFBFFF & 0x7F7F);
        G.lIIllllll[39] = 0x9F ^ 0x8E;
        G.lIIllllll[40] = -(0xFFFFAE89 & 0x59F7) & (0xFFFFFEEF & 0x6FFB);
        G.lIIllllll[41] = 85 + 98 - 90 + 75 ^ 123 + 154 - 229 + 138;
        G.lIIllllll[42] = 0xFFFFDDFB & 0x7FB7;
        G.lIIllllll[43] = 2 ^ 0x11;
    }

    public boolean at() {
        return this.twoHanded;
    }
}

