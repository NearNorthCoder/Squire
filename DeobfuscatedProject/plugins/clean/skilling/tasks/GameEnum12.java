/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum12
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

    public int z() {
        return this.materialID;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    public Spell F() {
        return this.spell;
    }

        return String.valueOf(var1);
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
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
        SAPPHIRE_RING = new GameEnum12(lllIIIlllll[1], lllIIIlllll[2], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_BRACELET = new GameEnum12(lllIIIlllll[4], lllIIIlllll[5], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_NECKLACE = new GameEnum12(lllIIIlllll[7], lllIIIlllll[8], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_AMULET = new GameEnum12(lllIIIlllll[10], lllIIIlllll[11], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_RING = new GameEnum12(lllIIIlllll[13], lllIIIlllll[14], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_BRACELET = new GameEnum12(lllIIIlllll[16], lllIIIlllll[17], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_NECKLACE = new GameEnum12(lllIIIlllll[19], lllIIIlllll[20], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_AMULET = new GameEnum12(lllIIIlllll[22], lllIIIlllll[23], (Spell)SpellBook.Standard.LVL_1_ENCHANT);
        EMERALD_RING = new GameEnum12(lllIIIlllll[25], lllIIIlllll[26], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_NECKLACE = new GameEnum12(lllIIIlllll[28], lllIIIlllll[29], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_BRACELET = new GameEnum12(lllIIIlllll[31], lllIIIlllll[32], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_AMULET = new GameEnum12(lllIIIlllll[34], lllIIIlllll[35], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_RING = new GameEnum12(lllIIIlllll[37], lllIIIlllll[38], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_BRACELET = new GameEnum12(lllIIIlllll[40], lllIIIlllll[41], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_NECKLACE = new GameEnum12(lllIIIlllll[43], lllIIIlllll[44], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        JADE_AMULET = new GameEnum12(lllIIIlllll[46], lllIIIlllll[47], (Spell)SpellBook.Standard.LVL_2_ENCHANT);
        RUBY_RING = new GameEnum12(lllIIIlllll[49], lllIIIlllll[50], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_NECKLACE = new GameEnum12(lllIIIlllll[52], lllIIIlllll[53], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_BRACELET = new GameEnum12(lllIIIlllll[55], lllIIIlllll[56], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_AMULET = new GameEnum12(lllIIIlllll[58], lllIIIlllll[59], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_RING = new GameEnum12(lllIIIlllll[61], lllIIIlllll[62], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_BRACELET = new GameEnum12(lllIIIlllll[64], lllIIIlllll[65], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_NECKLACE = new GameEnum12(lllIIIlllll[67], lllIIIlllll[68], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_AMULET = new GameEnum12(lllIIIlllll[70], lllIIIlllll[71], (Spell)SpellBook.Standard.LVL_3_ENCHANT);
        DIAMOND_RING = new GameEnum12(lllIIIlllll[73], lllIIIlllll[74], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_NECKLACE = new GameEnum12(lllIIIlllll[76], lllIIIlllll[77], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_BRACELET = new GameEnum12(lllIIIlllll[79], lllIIIlllll[80], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_AMULET = new GameEnum12(lllIIIlllll[82], lllIIIlllll[83], (Spell)SpellBook.Standard.LVL_4_ENCHANT);
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
        k.lllIIIllllI[k.lllIIIlllll[0]] = "SAPPHIRE_RING";
        k.lllIIIllllI[k.lllIIIlllll[3]] = "SAPPHIRE_BRACELET";
        k.lllIIIllllI[k.lllIIIlllll[6]] = "SAPPHIRE_NECKLACE";
        k.lllIIIllllI[k.lllIIIlllll[9]] = "SAPPHIRE_AMULET";
        k.lllIIIllllI[k.lllIIIlllll[12]] = "OPAL_RING";
        k.lllIIIllllI[k.lllIIIlllll[15]] = "OPAL_BRACELET";
        k.lllIIIllllI[k.lllIIIlllll[18]] = "OPAL_NECKLACE";
        k.lllIIIllllI[k.lllIIIlllll[21]] = "OPAL_AMULET";
        k.lllIIIllllI[k.lllIIIlllll[24]] = "EMERALD_RING";
        k.lllIIIllllI[k.lllIIIlllll[27]] = "EMERALD_NECKLACE";
        k.lllIIIllllI[k.lllIIIlllll[30]] = "EMERALD_BRACELET";
        k.lllIIIllllI[k.lllIIIlllll[33]] = "EMERALD_AMULET";
        k.lllIIIllllI[k.lllIIIlllll[36]] = "JADE_RING";
        k.lllIIIllllI[k.lllIIIlllll[39]] = "JADE_BRACELET";
        k.lllIIIllllI[k.lllIIIlllll[42]] = "JADE_NECKLACE";
        k.lllIIIllllI[k.lllIIIlllll[45]] = "JADE_AMULET";
        k.lllIIIllllI[k.lllIIIlllll[48]] = "RUBY_RING";
        k.lllIIIllllI[k.lllIIIlllll[51]] = "RUBY_NECKLACE";
        k.lllIIIllllI[k.lllIIIlllll[54]] = "RUBY_BRACELET";
        k.lllIIIllllI[k.lllIIIlllll[57]] = "RUBY_AMULET";
        k.lllIIIllllI[k.lllIIIlllll[60]] = "TOPAZ_RING";
        k.lllIIIllllI[k.lllIIIlllll[63]] = "TOPAZ_BRACELET";
        k.lllIIIllllI[k.lllIIIlllll[66]] = "TOPAZ_NECKLACE";
        k.lllIIIllllI[k.lllIIIlllll[69]] = "TOPAZ_AMULET";
        k.lllIIIllllI[k.lllIIIlllll[72]] = "DIAMOND_RING";
        k.lllIIIllllI[k.lllIIIlllll[75]] = "DIAMOND_NECKLACE";
        k.lllIIIllllI[k.lllIIIlllll[78]] = "DIAMOND_BRACELET";
        k.lllIIIllllI[k.lllIIIlllll[81]] = "DIAMOND_AMULET";
    }

    private GameEnum12(int n3, int n4, Spell spell) {
        this.materialID = n3;
        this.finishedID = n4;
        this.spell = spell;
    }
}

