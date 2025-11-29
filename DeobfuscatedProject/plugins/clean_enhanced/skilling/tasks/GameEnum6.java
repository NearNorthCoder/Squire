/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.skilling.tasks;

import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum6
extends Enum<k> {
    public static final  /* enum */ k JADE_AMULET;
    public static final  /* enum */ k RUBY_RING;
    public static final  /* enum */ k JADE_BRACELET;
    public static final  /* enum */ k TOPAZ_NECKLACE;
    public static final  /* enum */ k SAPPHIRE_RING;
    
    public static final  /* enum */ k DIAMOND_BRACELET;
    public static final  /* enum */ k SAPPHIRE_NECKLACE;
    public static final  /* enum */ k DIAMOND_NECKLACE;
    public static final  /* enum */ k OPAL_AMULET;
    public static final  /* enum */ k DIAMOND_AMULET;
    public static final  /* enum */ k TOPAZ_AMULET;
    public static final  /* enum */ k OPAL_RING;
    private final  int finishedID;
    public static final  /* enum */ k EMERALD_RING;
    
    private final  Spell spell;
    public static final  /* enum */ k EMERALD_AMULET;
    public static final  /* enum */ k DIAMOND_RING;
    public static final  /* enum */ k OPAL_NECKLACE;
    public static final  /* enum */ k EMERALD_BRACELET;
    private static final  k[] $VALUES;
    public static final  /* enum */ k RUBY_AMULET;
    public static final  /* enum */ k JADE_NECKLACE;
    private final  int materialID;
    public static final  /* enum */ k RUBY_NECKLACE;
    public static final  /* enum */ k TOPAZ_RING;
    public static final  /* enum */ k RUBY_BRACELET;
    public static final  /* enum */ k SAPPHIRE_AMULET;
    public static final  /* enum */ k JADE_RING;
    public static final  /* enum */ k SAPPHIRE_BRACELET;
    public static final  /* enum */ k TOPAZ_BRACELET;
    public static final  /* enum */ k OPAL_BRACELET;
    public static final  /* enum */ k EMERALD_NECKLACE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int z() {
        return this.materialID;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public Spell F() {
        return this.spell;
    }

    private static void var9() {
        var1 = new int[85];
        k.var1[0] = (0x79 ^ 0x38) & ~(0xFF ^ 0xBE);
        k.var1[1] = 0xFFFF9EFF & 0x6765;
        k.var1[2] = -(0xFFFFE72B & 0x78DE) & (0xFFFFEFFF & 0x79FF);
        k.var1[3] = 1;
        k.var1[4] = -(0xFFFFF269 & 0x5D97) & (0xFFFFFB3F & Short.MAX_VALUE);
        k.var1[5] = -(0xFFFF9D9F & 0x7275) & (0xFFFFBFFF & 0x7B56);
        k.var1[6] = 2;
        k.var1[7] = 0xFFFF9F7A & 0x66FD;
        k.var1[8] = 0xFFFFDF8D & 0x2F7F;
        k.var1[9] = 3;
        k.var1[10] = 0xFFFFBFDE & 0x46BF;
        k.var1[11] = -(0xFFFFF59F & 0x3A61) & (0xFFFFB7BF & 0x7EFF);
        k.var1[12] = 0x88 ^ 0xA4 ^ (0x69 ^ 0x41);
        k.var1[13] = 0xFFFFF2D9 & 0x5F7F;
        k.var1[14] = -(0xFFFFEBFF & 0x3D79) & (0xFFFFFBFE & Short.MAX_VALUE);
        k.var1[15] = 146 + 102 - 228 + 143 ^ 165 + 140 - 281 + 142;
        k.var1[16] = 0xFFFFFFFF & 0x527D;
        k.var1[17] = 0xFFFFD3FB & 0x7EBD;
        k.var1[18] = 110 + 3 - 73 + 101 ^ 74 + 32 - 64 + 97;
        k.var1[19] = -(0xFFFFB5F9 & 0x6B9F) & (0xFFFFF3FE & 0x7FFB);
        k.var1[20] = -(0xFFFFE97D & 0x17EB) & (0xFFFFDBFF & 0x77FF);
        k.var1[21] = 0x93 ^ 0x94;
        k.var1[22] = 0xFFFFD37D & 0x7EF6;
        k.var1[23] = -(0xFFFFFD5D & 0xFE3) & (0xFFFFDFEB & 0x7FFC);
        k.var1[24] = 59 + 88 - 83 + 64 ^ 24 + 106 - 38 + 44;
        k.var1[25] = -(0xFFFFCDF9 & 0x3B0F) & (0xFFFFCF7F & 0x3FEF);
        k.var1[26] = 0xFFFF8DFB & 0x7BFC;
        k.var1[27] = 0x81 ^ 0x88;
        k.var1[28] = 0xFFFFE6FF & 0x1F7A;
        k.var1[29] = 0xFFFF9797 & 0x7DF9;
        k.var1[30] = 87 + 144 - 103 + 47 ^ 78 + 32 - 89 + 144;
        k.var1[31] = 0xFFFFFBDD & 0x2F66;
        k.var1[32] = -(0xFFFFEA3B & 0x55D5) & (0xFFFFFBDF & 0x6F77);
        k.var1[33] = 0xBD ^ 0xA1 ^ (0 ^ 0x17);
        k.var1[34] = -(0xFFFFEAFD & 0x5D5F) & (0xFFFFEFFE & 0x5EFD);
        k.var1[35] = -(0xFFFF9B39 & 0x7DDF) & (0xFFFFBFDB & 0x5FFD);
        k.var1[36] = 0x4F ^ 0x43;
        k.var1[37] = 0xFFFFF27C & 0x5FDF;
        k.var1[38] = 0xFFFFFEBD & 0x53CB;
        k.var1[39] = 0x71 ^ 0x25 ^ (0x40 ^ 0x19);
        k.var1[40] = -(0xFFFFAEFD & 0x7D3A) & (0xFFFFFFFF & 0x7EB7);
        k.var1[41] = 0xFFFFDFBF & 0x72FC;
        k.var1[42] = 0x3F ^ 0x61 ^ (0x14 ^ 0x44);
        k.var1[43] = 0xFFFFDF7F & 0x72E5;
        k.var1[44] = 0xFFFFF2DE & 0x5FBB;
        k.var1[45] = 71 + 144 - 63 + 36 ^ 133 + 14 - 103 + 135;
        k.var1[46] = -(0xFFFF8FDF & 0x79A1) & (0xFFFFDBF7 & Short.MAX_VALUE);
        k.var1[47] = 0xFFFFF3FB & 0x5EAF;
        k.var1[48] = 60 + 39 - -77 + 13 ^ 49 + 48 - 63 + 139;
        k.var1[49] = 0xFFFF86F9 & 0x7F6F;
        k.var1[50] = 0xFFFF9BFF & 0x6E08;
        k.var1[51] = 0xA2 ^ 0xB3;
        k.var1[52] = -1 & (0xFFFF8FFE & 0x767D);
        k.var1[53] = 0xFFFFFBBF & 0x2FFA;
        k.var1[54] = 0x29 ^ 0x35 ^ (0x53 ^ 0x5D);
        k.var1[55] = 0xFFFFBFCF & 0x6B7D;
        k.var1[56] = 0xFFFFBBF6 & 0x6F59;
        k.var1[57] = 55 + 115 - 131 + 108 ^ 46 + 66 - 32 + 48;
        k.var1[58] = 0xFFFF9EFB & 0x67A6;
        k.var1[59] = -(0xFFFF94DB & 0x7B27) & (0xFFFFF6FF & 0x1FBF);
        k.var1[60] = 107 + 51 - 151 + 148 ^ 113 + 99 - 173 + 104;
        k.var1[61] = 0xFFFFD75F & 0x7AFF;
        k.var1[62] = 0xFFFFFBD6 & 0x56BD;
        k.var1[63] = 0xD6 ^ 0xC3;
        k.var1[64] = -(0xFFFFAFFF & 0x757D) & (0xFFFFF7FF & Short.MAX_VALUE);
        k.var1[65] = 0xFFFFD6BF & 0x7BFF;
        k.var1[66] = 0x39 ^ 0xC ^ (0x20 ^ 3);
        k.var1[67] = -(0xFFFFD9DA & 0x27B7) & (0xFFFFFFFD & 0x53FB);
        k.var1[68] = 0xFFFFD6E7 & 0x7BBD;
        k.var1[69] = 0x6B ^ 0x37 ^ (0x6A ^ 0x21);
        k.var1[70] = -(0xFFFFFD23 & 0x27DD) & (0xFFFFFFFA & 0x777F);
        k.var1[71] = -(0xFFFFFB43 & 0x2DBE) & (0xFFFFFFAF & 0x7BFF);
        k.var1[72] = 0x56 ^ 0x4E;
        k.var1[73] = 0xFFFFC77B & 0x3EEF;
        k.var1[74] = -(0xFFFFFBF7 & 0x651E) & (0xFFFFFBBF & 0x6F5F);
        k.var1[75] = 0x4F ^ 0x56;
        k.var1[76] = -(0xFFFFFD1F & 0x73E1) & (0xFFFFF7FE & 0x7F7F);
        k.var1[77] = -(0xFFFFF5ED & 0x5A9F) & (0xFFFFFFDF & 0x7BFE);
        k.var1[78] = 0x9A ^ 0xA3 ^ (0xB3 ^ 0x90);
        k.var1[79] = -(0xFFFFD63E & 0x79CB) & (0xFFFFFFFF & 0x7B5D);
        k.var1[80] = -(0xFFFFE0B3 & 0x5FCD) & (0xFFFFFFDF & 0x6BF7);
        k.var1[81] = 157 + 49 - 46 + 14 ^ 86 + 50 - 33 + 78;
        k.var1[82] = -(0xFFFFDA9A & 0x3D7F) & (0xFFFFBEFF & 0x5FBD);
        k.var1[83] = 0xFFFFF6DB & 0xFE7;
        k.var1[84] = 0x22 ^ 0x3E;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (k.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.finishedID;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    static {
        k.var9();
        k.var27();
        SAPPHIRE_RING = new GameEnum6(var1[1], var1[2], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_BRACELET = new GameEnum6(var1[4], var1[5], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_NECKLACE = new GameEnum6(var1[7], var1[8], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_AMULET = new GameEnum6(var1[10], var1[11], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        OPAL_RING = new GameEnum6(var1[13], var1[14], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        OPAL_BRACELET = new GameEnum6(var1[16], var1[17], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        OPAL_NECKLACE = new GameEnum6(var1[19], var1[20], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        OPAL_AMULET = new GameEnum6(var1[22], var1[23], (SpeSpellBook.Standard.LVL_1_ENCHANT);
        EMERALD_RING = new GameEnum6(var1[25], var1[26], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_NECKLACE = new GameEnum6(var1[28], var1[29], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_BRACELET = new GameEnum6(var1[31], var1[32], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_AMULET = new GameEnum6(var1[34], var1[35], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        JADE_RING = new GameEnum6(var1[37], var1[38], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        JADE_BRACELET = new GameEnum6(var1[40], var1[41], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        JADE_NECKLACE = new GameEnum6(var1[43], var1[44], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        JADE_AMULET = new GameEnum6(var1[46], var1[47], (SpeSpellBook.Standard.LVL_2_ENCHANT);
        RUBY_RING = new GameEnum6(var1[49], var1[50], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        RUBY_NECKLACE = new GameEnum6(var1[52], var1[53], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        RUBY_BRACELET = new GameEnum6(var1[55], var1[56], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        RUBY_AMULET = new GameEnum6(var1[58], var1[59], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_RING = new GameEnum6(var1[61], var1[62], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_BRACELET = new GameEnum6(var1[64], var1[65], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_NECKLACE = new GameEnum6(var1[67], var1[68], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_AMULET = new GameEnum6(var1[70], var1[71], (SpeSpellBook.Standard.LVL_3_ENCHANT);
        DIAMOND_RING = new GameEnum6(var1[73], var1[74], (SpeSpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_NECKLACE = new GameEnum6(var1[76], var1[77], (SpeSpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_BRACELET = new GameEnum6(var1[79], var1[80], (SpeSpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_AMULET = new GameEnum6(var1[82], var1[83], (SpeSpellBook.Standard.LVL_4_ENCHANT);
        k[] kArray = new k[var1[84]];
        kArray[k.var1[0]] = SAPPHIRE_RING;
        kArray[k.var1[3]] = SAPPHIRE_BRACELET;
        kArray[k.var1[6]] = SAPPHIRE_NECKLACE;
        kArray[k.var1[9]] = SAPPHIRE_AMULET;
        kArray[k.var1[12]] = OPAL_RING;
        kArray[k.var1[15]] = OPAL_BRACELET;
        kArray[k.var1[18]] = OPAL_NECKLACE;
        kArray[k.var1[21]] = OPAL_AMULET;
        kArray[k.var1[24]] = EMERALD_RING;
        kArray[k.var1[27]] = EMERALD_NECKLACE;
        kArray[k.var1[30]] = EMERALD_BRACELET;
        kArray[k.var1[33]] = EMERALD_AMULET;
        kArray[k.var1[36]] = JADE_RING;
        kArray[k.var1[39]] = JADE_BRACELET;
        kArray[k.var1[42]] = JADE_NECKLACE;
        kArray[k.var1[45]] = JADE_AMULET;
        kArray[k.var1[48]] = RUBY_RING;
        kArray[k.var1[51]] = RUBY_NECKLACE;
        kArray[k.var1[54]] = RUBY_BRACELET;
        kArray[k.var1[57]] = RUBY_AMULET;
        kArray[k.var1[60]] = TOPAZ_RING;
        kArray[k.var1[63]] = TOPAZ_BRACELET;
        kArray[k.var1[66]] = TOPAZ_NECKLACE;
        kArray[k.var1[69]] = TOPAZ_AMULET;
        kArray[k.var1[72]] = DIAMOND_RING;
        kArray[k.var1[75]] = DIAMOND_NECKLACE;
        kArray[k.var1[78]] = DIAMOND_BRACELET;
        kArray[k.var1[81]] = DIAMOND_AMULET;
        $VALUES = kArray;
    }

    private static void var27() {
        var2 = new String[var1[84]];
        k.var2[k.var1[0]] = "SAPPHIRE_RING";
        k.var2[k.var1[3]] = "SAPPHIRE_BRACELET";
        k.var2[k.var1[6]] = "SAPPHIRE_NECKLACE";
        k.var2[k.var1[9]] = "SAPPHIRE_AMULET";
        k.var2[k.var1[12]] = "OPAL_RING";
        k.var2[k.var1[15]] = "OPAL_BRACELET";
        k.var2[k.var1[18]] = "OPAL_NECKLACE";
        k.var2[k.var1[21]] = "OPAL_AMULET";
        k.var2[k.var1[24]] = "EMERALD_RING";
        k.var2[k.var1[27]] = "EMERALD_NECKLACE";
        k.var2[k.var1[30]] = "EMERALD_BRACELET";
        k.var2[k.var1[33]] = "EMERALD_AMULET";
        k.var2[k.var1[36]] = "JADE_RING";
        k.var2[k.var1[39]] = "JADE_BRACELET";
        k.var2[k.var1[42]] = "JADE_NECKLACE";
        k.var2[k.var1[45]] = "JADE_AMULET";
        k.var2[k.var1[48]] = "RUBY_RING";
        k.var2[k.var1[51]] = "RUBY_NECKLACE";
        k.var2[k.var1[54]] = "RUBY_BRACELET";
        k.var2[k.var1[57]] = "RUBY_AMULET";
        k.var2[k.var1[60]] = "TOPAZ_RING";
        k.var2[k.var1[63]] = "TOPAZ_BRACELET";
        k.var2[k.var1[66]] = "TOPAZ_NECKLACE";
        k.var2[k.var1[69]] = "TOPAZ_AMULET";
        k.var2[k.var1[72]] = "DIAMOND_RING";
        k.var2[k.var1[75]] = "DIAMOND_NECKLACE";
        k.var2[k.var1[78]] = "DIAMOND_BRACELET";
        k.var2[k.var1[81]] = "DIAMOND_AMULET";
    }

    private GameEnum6(int n3, int n4, Spell spell) {
        this.materialID = n3;
        this.finishedID = n4;
        this.spell = spell;
    }
}

