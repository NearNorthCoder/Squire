/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class k
extends Enum<k> {
    public static final /* synthetic */ /* enum */ k JADE_AMULET;
    public static final /* synthetic */ /* enum */ k RUBY_RING;
    public static final /* synthetic */ /* enum */ k JADE_BRACELET;
    public static final /* synthetic */ /* enum */ k TOPAZ_NECKLACE;
    public static final /* synthetic */ /* enum */ k SAPPHIRE_RING;
    private static /* synthetic */ int[] lllIIIlllll;
    public static final /* synthetic */ /* enum */ k DIAMOND_BRACELET;
    public static final /* synthetic */ /* enum */ k SAPPHIRE_NECKLACE;
    public static final /* synthetic */ /* enum */ k DIAMOND_NECKLACE;
    public static final /* synthetic */ /* enum */ k OPAL_AMULET;
    public static final /* synthetic */ /* enum */ k DIAMOND_AMULET;
    public static final /* synthetic */ /* enum */ k TOPAZ_AMULET;
    public static final /* synthetic */ /* enum */ k OPAL_RING;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ /* enum */ k EMERALD_RING;
    private static /* synthetic */ String[] lllIIIllllI;
    private final /* synthetic */ Spell spell;
    public static final /* synthetic */ /* enum */ k EMERALD_AMULET;
    public static final /* synthetic */ /* enum */ k DIAMOND_RING;
    public static final /* synthetic */ /* enum */ k OPAL_NECKLACE;
    public static final /* synthetic */ /* enum */ k EMERALD_BRACELET;
    private static final /* synthetic */ k[] $VALUES;
    public static final /* synthetic */ /* enum */ k RUBY_AMULET;
    public static final /* synthetic */ /* enum */ k JADE_NECKLACE;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ k RUBY_NECKLACE;
    public static final /* synthetic */ /* enum */ k TOPAZ_RING;
    public static final /* synthetic */ /* enum */ k RUBY_BRACELET;
    public static final /* synthetic */ /* enum */ k SAPPHIRE_AMULET;
    public static final /* synthetic */ /* enum */ k JADE_RING;
    public static final /* synthetic */ /* enum */ k SAPPHIRE_BRACELET;
    public static final /* synthetic */ /* enum */ k TOPAZ_BRACELET;
    public static final /* synthetic */ /* enum */ k OPAL_BRACELET;
    public static final /* synthetic */ /* enum */ k EMERALD_NECKLACE;

    private static String lIlIllIlIlllll(String llllllllllllllllIIlIlIIIllllIlll, String llllllllllllllllIIlIlIIIllllIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIlllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIIlllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIIlllllIIl.init(lllIIIlllll[6], llllllllllllllllIIlIlIIIlllllIlI);
            return new String(llllllllllllllllIIlIlIIIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIlllllIII) {
            llllllllllllllllIIlIlIIIlllllIII.printStackTrace();
            return null;
        }
    }

    public int z() {
        return this.materialID;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    public Spell F() {
        return this.spell;
    }

    private static void lIlIllIllIIIlI() {
        lllIIIlllll = new int[85];
        k.lllIIIlllll[0] = (0x79 ^ 0x38) & ~(0xFF ^ 0xBE);
        k.lllIIIlllll[1] = 0xFFFF9EFF & 0x6765;
        k.lllIIIlllll[2] = -(0xFFFFE72B & 0x78DE) & (0xFFFFEFFF & 0x79FF);
        k.lllIIIlllll[3] = " ".length();
        k.lllIIIlllll[4] = -(0xFFFFF269 & 0x5D97) & (0xFFFFFB3F & Short.MAX_VALUE);
        k.lllIIIlllll[5] = -(0xFFFF9D9F & 0x7275) & (0xFFFFBFFF & 0x7B56);
        k.lllIIIlllll[6] = "  ".length();
        k.lllIIIlllll[7] = 0xFFFF9F7A & 0x66FD;
        k.lllIIIlllll[8] = 0xFFFFDF8D & 0x2F7F;
        k.lllIIIlllll[9] = "   ".length();
        k.lllIIIlllll[10] = 0xFFFFBFDE & 0x46BF;
        k.lllIIIlllll[11] = -(0xFFFFF59F & 0x3A61) & (0xFFFFB7BF & 0x7EFF);
        k.lllIIIlllll[12] = 0x88 ^ 0xA4 ^ (0x69 ^ 0x41);
        k.lllIIIlllll[13] = 0xFFFFF2D9 & 0x5F7F;
        k.lllIIIlllll[14] = -(0xFFFFEBFF & 0x3D79) & (0xFFFFFBFE & Short.MAX_VALUE);
        k.lllIIIlllll[15] = 146 + 102 - 228 + 143 ^ 165 + 140 - 281 + 142;
        k.lllIIIlllll[16] = 0xFFFFFFFF & 0x527D;
        k.lllIIIlllll[17] = 0xFFFFD3FB & 0x7EBD;
        k.lllIIIlllll[18] = 110 + 3 - 73 + 101 ^ 74 + 32 - 64 + 97;
        k.lllIIIlllll[19] = -(0xFFFFB5F9 & 0x6B9F) & (0xFFFFF3FE & 0x7FFB);
        k.lllIIIlllll[20] = -(0xFFFFE97D & 0x17EB) & (0xFFFFDBFF & 0x77FF);
        k.lllIIIlllll[21] = 0x93 ^ 0x94;
        k.lllIIIlllll[22] = 0xFFFFD37D & 0x7EF6;
        k.lllIIIlllll[23] = -(0xFFFFFD5D & 0xFE3) & (0xFFFFDFEB & 0x7FFC);
        k.lllIIIlllll[24] = 59 + 88 - 83 + 64 ^ 24 + 106 - 38 + 44;
        k.lllIIIlllll[25] = -(0xFFFFCDF9 & 0x3B0F) & (0xFFFFCF7F & 0x3FEF);
        k.lllIIIlllll[26] = 0xFFFF8DFB & 0x7BFC;
        k.lllIIIlllll[27] = 0x81 ^ 0x88;
        k.lllIIIlllll[28] = 0xFFFFE6FF & 0x1F7A;
        k.lllIIIlllll[29] = 0xFFFF9797 & 0x7DF9;
        k.lllIIIlllll[30] = 87 + 144 - 103 + 47 ^ 78 + 32 - 89 + 144;
        k.lllIIIlllll[31] = 0xFFFFFBDD & 0x2F66;
        k.lllIIIlllll[32] = -(0xFFFFEA3B & 0x55D5) & (0xFFFFFBDF & 0x6F77);
        k.lllIIIlllll[33] = 0xBD ^ 0xA1 ^ (0 ^ 0x17);
        k.lllIIIlllll[34] = -(0xFFFFEAFD & 0x5D5F) & (0xFFFFEFFE & 0x5EFD);
        k.lllIIIlllll[35] = -(0xFFFF9B39 & 0x7DDF) & (0xFFFFBFDB & 0x5FFD);
        k.lllIIIlllll[36] = 0x4F ^ 0x43;
        k.lllIIIlllll[37] = 0xFFFFF27C & 0x5FDF;
        k.lllIIIlllll[38] = 0xFFFFFEBD & 0x53CB;
        k.lllIIIlllll[39] = 0x71 ^ 0x25 ^ (0x40 ^ 0x19);
        k.lllIIIlllll[40] = -(0xFFFFAEFD & 0x7D3A) & (0xFFFFFFFF & 0x7EB7);
        k.lllIIIlllll[41] = 0xFFFFDFBF & 0x72FC;
        k.lllIIIlllll[42] = 0x3F ^ 0x61 ^ (0x14 ^ 0x44);
        k.lllIIIlllll[43] = 0xFFFFDF7F & 0x72E5;
        k.lllIIIlllll[44] = 0xFFFFF2DE & 0x5FBB;
        k.lllIIIlllll[45] = 71 + 144 - 63 + 36 ^ 133 + 14 - 103 + 135;
        k.lllIIIlllll[46] = -(0xFFFF8FDF & 0x79A1) & (0xFFFFDBF7 & Short.MAX_VALUE);
        k.lllIIIlllll[47] = 0xFFFFF3FB & 0x5EAF;
        k.lllIIIlllll[48] = 60 + 39 - -77 + 13 ^ 49 + 48 - 63 + 139;
        k.lllIIIlllll[49] = 0xFFFF86F9 & 0x7F6F;
        k.lllIIIlllll[50] = 0xFFFF9BFF & 0x6E08;
        k.lllIIIlllll[51] = 0xA2 ^ 0xB3;
        k.lllIIIlllll[52] = -" ".length() & (0xFFFF8FFE & 0x767D);
        k.lllIIIlllll[53] = 0xFFFFFBBF & 0x2FFA;
        k.lllIIIlllll[54] = 0x29 ^ 0x35 ^ (0x53 ^ 0x5D);
        k.lllIIIlllll[55] = 0xFFFFBFCF & 0x6B7D;
        k.lllIIIlllll[56] = 0xFFFFBBF6 & 0x6F59;
        k.lllIIIlllll[57] = 55 + 115 - 131 + 108 ^ 46 + 66 - 32 + 48;
        k.lllIIIlllll[58] = 0xFFFF9EFB & 0x67A6;
        k.lllIIIlllll[59] = -(0xFFFF94DB & 0x7B27) & (0xFFFFF6FF & 0x1FBF);
        k.lllIIIlllll[60] = 107 + 51 - 151 + 148 ^ 113 + 99 - 173 + 104;
        k.lllIIIlllll[61] = 0xFFFFD75F & 0x7AFF;
        k.lllIIIlllll[62] = 0xFFFFFBD6 & 0x56BD;
        k.lllIIIlllll[63] = 0xD6 ^ 0xC3;
        k.lllIIIlllll[64] = -(0xFFFFAFFF & 0x757D) & (0xFFFFF7FF & Short.MAX_VALUE);
        k.lllIIIlllll[65] = 0xFFFFD6BF & 0x7BFF;
        k.lllIIIlllll[66] = 0x39 ^ 0xC ^ (0x20 ^ 3);
        k.lllIIIlllll[67] = -(0xFFFFD9DA & 0x27B7) & (0xFFFFFFFD & 0x53FB);
        k.lllIIIlllll[68] = 0xFFFFD6E7 & 0x7BBD;
        k.lllIIIlllll[69] = 0x6B ^ 0x37 ^ (0x6A ^ 0x21);
        k.lllIIIlllll[70] = -(0xFFFFFD23 & 0x27DD) & (0xFFFFFFFA & 0x777F);
        k.lllIIIlllll[71] = -(0xFFFFFB43 & 0x2DBE) & (0xFFFFFFAF & 0x7BFF);
        k.lllIIIlllll[72] = 0x56 ^ 0x4E;
        k.lllIIIlllll[73] = 0xFFFFC77B & 0x3EEF;
        k.lllIIIlllll[74] = -(0xFFFFFBF7 & 0x651E) & (0xFFFFFBBF & 0x6F5F);
        k.lllIIIlllll[75] = 0x4F ^ 0x56;
        k.lllIIIlllll[76] = -(0xFFFFFD1F & 0x73E1) & (0xFFFFF7FE & 0x7F7F);
        k.lllIIIlllll[77] = -(0xFFFFF5ED & 0x5A9F) & (0xFFFFFFDF & 0x7BFE);
        k.lllIIIlllll[78] = 0x9A ^ 0xA3 ^ (0xB3 ^ 0x90);
        k.lllIIIlllll[79] = -(0xFFFFD63E & 0x79CB) & (0xFFFFFFFF & 0x7B5D);
        k.lllIIIlllll[80] = -(0xFFFFE0B3 & 0x5FCD) & (0xFFFFFFDF & 0x6BF7);
        k.lllIIIlllll[81] = 157 + 49 - 46 + 14 ^ 86 + 50 - 33 + 78;
        k.lllIIIlllll[82] = -(0xFFFFDA9A & 0x3D7F) & (0xFFFFBEFF & 0x5FBD);
        k.lllIIIlllll[83] = 0xFFFFF6DB & 0xFE7;
        k.lllIIIlllll[84] = 0x22 ^ 0x3E;
    }

    private static String lIlIllIlIllllI(String llllllllllllllllIIlIlIIlIIIIIlll, String llllllllllllllllIIlIlIIlIIIIIllI) {
        llllllllllllllllIIlIlIIlIIIIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIlIIIIlIlI = new StringBuilder();
        char[] llllllllllllllllIIlIlIIlIIIIlIIl = llllllllllllllllIIlIlIIlIIIIIllI.toCharArray();
        int llllllllllllllllIIlIlIIlIIIIlIII = lllIIIlllll[0];
        char[] llllllllllllllllIIlIlIIlIIIIIIlI = llllllllllllllllIIlIlIIlIIIIIlll.toCharArray();
        int llllllllllllllllIIlIlIIlIIIIIIIl = llllllllllllllllIIlIlIIlIIIIIIlI.length;
        int llllllllllllllllIIlIlIIlIIIIIIII = lllIIIlllll[0];
        while (k.lIlIllIllIIIll(llllllllllllllllIIlIlIIlIIIIIIII, llllllllllllllllIIlIlIIlIIIIIIIl)) {
            char llllllllllllllllIIlIlIIlIIIIllIl = llllllllllllllllIIlIlIIlIIIIIIlI[llllllllllllllllIIlIlIIlIIIIIIII];
            llllllllllllllllIIlIlIIlIIIIlIlI.append((char)(llllllllllllllllIIlIlIIlIIIIllIl ^ llllllllllllllllIIlIlIIlIIIIlIIl[llllllllllllllllIIlIlIIlIIIIlIII % llllllllllllllllIIlIlIIlIIIIlIIl.length]));
            "".length();
            ++llllllllllllllllIIlIlIIlIIIIlIII;
            ++llllllllllllllllIIlIlIIlIIIIIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIlIIIIlIlI);
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    private static String lIlIllIllIIIII(String llllllllllllllllIIlIlIIIlllIlIII, String llllllllllllllllIIlIlIIIlllIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIlllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), lllIIIlllll[24]), "DES");
            Cipher llllllllllllllllIIlIlIIIlllIllII = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIlllIllII.init(lllIIIlllll[6], llllllllllllllllIIlIlIIIlllIllIl);
            return new String(llllllllllllllllIIlIlIIIlllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIlllIlIll) {
            llllllllllllllllIIlIlIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.finishedID;
    }

    private static boolean lIlIllIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        k.lIlIllIllIIIlI();
        k.lIlIllIllIIIIl();
        SAPPHIRE_RING = new k(lllIIIlllll[1], lllIIIlllll[2], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_BRACELET = new k(lllIIIlllll[4], lllIIIlllll[5], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_NECKLACE = new k(lllIIIlllll[7], lllIIIlllll[8], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_AMULET = new k(lllIIIlllll[10], lllIIIlllll[11], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_RING = new k(lllIIIlllll[13], lllIIIlllll[14], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_BRACELET = new k(lllIIIlllll[16], lllIIIlllll[17], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_NECKLACE = new k(lllIIIlllll[19], lllIIIlllll[20], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_AMULET = new k(lllIIIlllll[22], lllIIIlllll[23], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        EMERALD_RING = new k(lllIIIlllll[25], lllIIIlllll[26], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_NECKLACE = new k(lllIIIlllll[28], lllIIIlllll[29], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_BRACELET = new k(lllIIIlllll[31], lllIIIlllll[32], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_AMULET = new k(lllIIIlllll[34], lllIIIlllll[35], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_RING = new k(lllIIIlllll[37], lllIIIlllll[38], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_BRACELET = new k(lllIIIlllll[40], lllIIIlllll[41], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_NECKLACE = new k(lllIIIlllll[43], lllIIIlllll[44], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_AMULET = new k(lllIIIlllll[46], lllIIIlllll[47], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        RUBY_RING = new k(lllIIIlllll[49], lllIIIlllll[50], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_NECKLACE = new k(lllIIIlllll[52], lllIIIlllll[53], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_BRACELET = new k(lllIIIlllll[55], lllIIIlllll[56], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_AMULET = new k(lllIIIlllll[58], lllIIIlllll[59], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_RING = new k(lllIIIlllll[61], lllIIIlllll[62], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_BRACELET = new k(lllIIIlllll[64], lllIIIlllll[65], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_NECKLACE = new k(lllIIIlllll[67], lllIIIlllll[68], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_AMULET = new k(lllIIIlllll[70], lllIIIlllll[71], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        DIAMOND_RING = new k(lllIIIlllll[73], lllIIIlllll[74], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_NECKLACE = new k(lllIIIlllll[76], lllIIIlllll[77], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_BRACELET = new k(lllIIIlllll[79], lllIIIlllll[80], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_AMULET = new k(lllIIIlllll[82], lllIIIlllll[83], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
        k[] kArray = new k[lllIIIlllll[84]];
        kArray[k.lllIIIlllll[0]] = SAPPHIRE_RING;
        kArray[k.lllIIIlllll[3]] = SAPPHIRE_BRACELET;
        kArray[k.lllIIIlllll[6]] = SAPPHIRE_NECKLACE;
        kArray[k.lllIIIlllll[9]] = SAPPHIRE_AMULET;
        kArray[k.lllIIIlllll[12]] = OPAL_RING;
        kArray[k.lllIIIlllll[15]] = OPAL_BRACELET;
        kArray[k.lllIIIlllll[18]] = OPAL_NECKLACE;
        kArray[k.lllIIIlllll[21]] = OPAL_AMULET;
        kArray[k.lllIIIlllll[24]] = EMERALD_RING;
        kArray[k.lllIIIlllll[27]] = EMERALD_NECKLACE;
        kArray[k.lllIIIlllll[30]] = EMERALD_BRACELET;
        kArray[k.lllIIIlllll[33]] = EMERALD_AMULET;
        kArray[k.lllIIIlllll[36]] = JADE_RING;
        kArray[k.lllIIIlllll[39]] = JADE_BRACELET;
        kArray[k.lllIIIlllll[42]] = JADE_NECKLACE;
        kArray[k.lllIIIlllll[45]] = JADE_AMULET;
        kArray[k.lllIIIlllll[48]] = RUBY_RING;
        kArray[k.lllIIIlllll[51]] = RUBY_NECKLACE;
        kArray[k.lllIIIlllll[54]] = RUBY_BRACELET;
        kArray[k.lllIIIlllll[57]] = RUBY_AMULET;
        kArray[k.lllIIIlllll[60]] = TOPAZ_RING;
        kArray[k.lllIIIlllll[63]] = TOPAZ_BRACELET;
        kArray[k.lllIIIlllll[66]] = TOPAZ_NECKLACE;
        kArray[k.lllIIIlllll[69]] = TOPAZ_AMULET;
        kArray[k.lllIIIlllll[72]] = DIAMOND_RING;
        kArray[k.lllIIIlllll[75]] = DIAMOND_NECKLACE;
        kArray[k.lllIIIlllll[78]] = DIAMOND_BRACELET;
        kArray[k.lllIIIlllll[81]] = DIAMOND_AMULET;
        $VALUES = kArray;
    }

    private static void lIlIllIllIIIIl() {
        lllIIIllllI = new String[lllIIIlllll[84]];
        k.lllIIIllllI[k.lllIIIlllll[0]] = k.lIlIllIlIllllI("HDsbOy8GKA40NQY0DA==", "OzKkg");
        k.lllIIIllllI[k.lllIIIlllll[3]] = k.lIlIllIlIlllll("uqrpXdh96PLmOcK1uxeNcJX7TSrpny4w", "kzlMH");
        k.lllIIIllllI[k.lllIIIlllll[6]] = k.lIlIllIlIllllI("ISAGICE7MxMvJzciHTwoMSQ=", "raVpi");
        k.lllIIIllllI[k.lllIIIlllll[9]] = k.lIlIllIlIlllll("elPzQzKwKFtpwkgUFVH95w==", "QmLoW");
        k.lllIIIllllI[k.lllIIIlllll[12]] = k.lIlIllIlIllllI("DCAFJzgROQos", "CpDkg");
        k.lllIIIllllI[k.lllIIIlllll[15]] = k.lIlIllIlIlllll("uC6jjKyzAL4sniZeZmyQAA==", "aikqp");
        k.lllIIIllllI[k.lllIIIlllll[18]] = k.lIlIllIllIIIII("3QXSOzVppOENNVg9rP7VmQ==", "tSZHC");
        k.lllIIIllllI[k.lllIIIlllll[21]] = k.lIlIllIlIlllll("Sohpg5ChCZtTzPBKumhOMQ==", "zGHpZ");
        k.lllIIIllllI[k.lllIIIlllll[24]] = k.lIlIllIlIllllI("ETsxFCoYMisUIhox", "TvtFk");
        k.lllIIIllllI[k.lllIIIlllll[27]] = k.lIlIllIllIIIII("nsMRXkotlPIKN7jvXQ3wCxKCDKJ6EYSK", "kgRhO");
        k.lllIIIllllI[k.lllIIIlllll[30]] = k.lIlIllIllIIIII("01Du8S33GFE6a/J+YDLQveiI4ldSX8I6", "xeObZ");
        k.lllIIIllllI[k.lllIIIlllll[33]] = k.lIlIllIlIlllll("fWJcet3qFUZjMlBY7l+rag==", "TKGfN");
        k.lllIIIllllI[k.lllIIIlllll[36]] = k.lIlIllIllIIIII("AN6tlJs4xDINgYzpdchHAQ==", "NktOJ");
        k.lllIIIllllI[k.lllIIIlllll[39]] = k.lIlIllIlIllllI("HDU0ADsUJjEGIRoxJA==", "VtpEd");
        k.lllIIIllllI[k.lllIIIlllll[42]] = k.lIlIllIlIlllll("0floSINZypAL9bUWkvrKXw==", "UPJXj");
        k.lllIIIllllI[k.lllIIIlllll[45]] = k.lIlIllIlIlllll("dyarJs0smcft7hqpNrCK7A==", "koUzJ");
        k.lllIIIllllI[k.lllIIIlllll[48]] = k.lIlIllIllIIIII("lXRgktClSE4kO3FVogPS3Q==", "zlTqE");
        k.lllIIIllllI[k.lllIIIlllll[51]] = k.lIlIllIllIIIII("4qtZWi+T6CyRYKpuTg9m3g==", "mNeJz");
        k.lllIIIllllI[k.lllIIIlllll[54]] = k.lIlIllIllIIIII("AKFDRsRUghOdxbGOMDxmWg==", "uHMVR");
        k.lllIIIllllI[k.lllIIIlllll[57]] = k.lIlIllIlIlllll("fPmHivImTSuoonpDmFmJsw==", "HTuqY");
        k.lllIIIllllI[k.lllIIIlllll[60]] = k.lIlIllIllIIIII("tq6KQw/+5wU2WZrkz8qUxA==", "PjYUO");
        k.lllIIIllllI[k.lllIIIlllll[63]] = k.lIlIllIllIIIII("wZvRYuPR2YsRVxJX3U9DNg==", "Dfiek");
        k.lllIIIllllI[k.lllIIIlllll[66]] = k.lIlIllIlIlllll("cBYkTCZdJOw8HWzH+3FLVQ==", "MVGFZ");
        k.lllIIIllllI[k.lllIIIlllll[69]] = k.lIlIllIlIllllI("BCgIAy4PJhUXOBUz", "PgXBt");
        k.lllIIIllllI[k.lllIIIlllll[72]] = k.lIlIllIlIllllI("MAIsGj46DzIFODoM", "tKmWq");
        k.lllIIIllllI[k.lllIIIlllll[75]] = k.lIlIllIllIIIII("h3DGc7EXJkV/2/ljJGCEVF+7kvpxuvtL", "RcPgf");
        k.lllIIIllllI[k.lllIIIlllll[78]] = k.lIlIllIlIllllI("ChEKCCgAHBQHNQ8bDgkiGg==", "NXKEg");
        k.lllIIIllllI[k.lllIIIlllll[81]] = k.lIlIllIlIlllll("QqjiSaMqIA3xinsqMMFqBw==", "fmqYT");
    }

    private k(int n3, int n4, Spell spell) {
        this.materialID = n3;
        this.finishedID = n4;
        this.spell = spell;
    }
}

