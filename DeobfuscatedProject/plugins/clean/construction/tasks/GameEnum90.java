/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum90
extends Enum<cb> {
    public static final  /* enum */ cb SARADOMIN_GODSWORD;
    public static final  /* enum */ cb BLACK_2H_SWORD;
    public static final  /* enum */ cb BRONZE_2H_SWORD;
    public static final  /* enum */ cb STEEL_2H_SWORD;
    public static final  /* enum */ cb SARADOMIN_GODSWORD_OR;
    
    private static final  cb[] $VALUES;
    
    public static final  /* enum */ cb SARADOMIN_SWORD;
    public static final  /* enum */ cb COLOSSAL_BLADE;
    public static final  /* enum */ cb BANDOS_GODSWORD;
    public static final  /* enum */ cb ARMADYL_GODSWORD;
    public static final  /* enum */ cb SHADOW_SWORD;
    public static final  /* enum */ cb ZAMORAK_GODSWORD_OR;
    private final  Prayer protectionPrayer;
    public static final  /* enum */ cb IRON_2H_SWORD;
    public static final  /* enum */ cb SARADOMIN_BLESSED_SWORD;
    public static final  /* enum */ cb ANCIENT_GODSWORD;
    public static final  /* enum */ cb ARMADYL_GODSWORD_OR;
    private final  int itemID;
    public static final  /* enum */ cb SPATULA;
    public static final  /* enum */ cb WHITE_2H_SWORD;
    public static final  /* enum */ cb RUNE_2H_SWORD;
    public static final  /* enum */ cb MITHRIL_2H_SWORD;
    public static final  /* enum */ cb DRAGON_2H_SWORD;
    public static final  /* enum */ cb BANDOS_GODSWORD_OR;
    public static final  /* enum */ cb GILDED_2H_SWORD;
    public static final  /* enum */ cb ZAMORAK_GODSWORD;
    public static final  /* enum */ cb ADAMANT_2H_SWORD;

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static cb[] values() {
        return (cb[])$VALUES.clone();
    }

    private static boolean llIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        cb.llIlIIIIlll();
        cb.llIlIIIIllI();
        BRONZE_2H_SWORD = new GameEnum90(llllIlIll[1], Prayer.PROTECT_FROM_MELEE);
        IRON_2H_SWORD = new GameEnum90(llllIlIll[3], Prayer.PROTECT_FROM_MELEE);
        STEEL_2H_SWORD = new GameEnum90(llllIlIll[5], Prayer.PROTECT_FROM_MELEE);
        BLACK_2H_SWORD = new GameEnum90(llllIlIll[7], Prayer.PROTECT_FROM_MELEE);
        WHITE_2H_SWORD = new GameEnum90(llllIlIll[9], Prayer.PROTECT_FROM_MELEE);
        MITHRIL_2H_SWORD = new GameEnum90(llllIlIll[11], Prayer.PROTECT_FROM_MELEE);
        ADAMANT_2H_SWORD = new GameEnum90(llllIlIll[13], Prayer.PROTECT_FROM_MELEE);
        RUNE_2H_SWORD = new GameEnum90(llllIlIll[15], Prayer.PROTECT_FROM_MELEE);
        DRAGON_2H_SWORD = new GameEnum90(llllIlIll[17], Prayer.PROTECT_FROM_MELEE);
        ANCIENT_GODSWORD = new GameEnum90(llllIlIll[19], Prayer.PROTECT_FROM_MELEE);
        ARMADYL_GODSWORD = new GameEnum90(llllIlIll[21], Prayer.PROTECT_FROM_MELEE);
        ARMADYL_GODSWORD_OR = new GameEnum90(llllIlIll[23], Prayer.PROTECT_FROM_MELEE);
        BANDOS_GODSWORD = new GameEnum90(llllIlIll[25], Prayer.PROTECT_FROM_MELEE);
        BANDOS_GODSWORD_OR = new GameEnum90(llllIlIll[27], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_GODSWORD = new GameEnum90(llllIlIll[29], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_GODSWORD_OR = new GameEnum90(llllIlIll[31], Prayer.PROTECT_FROM_MELEE);
        ZAMORAK_GODSWORD = new GameEnum90(llllIlIll[33], Prayer.PROTECT_FROM_MELEE);
        ZAMORAK_GODSWORD_OR = new GameEnum90(llllIlIll[35], Prayer.PROTECT_FROM_MELEE);
        SHADOW_SWORD = new GameEnum90(llllIlIll[37], Prayer.PROTECT_FROM_MELEE);
        SPATULA = new GameEnum90(llllIlIll[39], Prayer.PROTECT_FROM_MELEE);
        GILDED_2H_SWORD = new GameEnum90(llllIlIll[41], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_SWORD = new GameEnum90(llllIlIll[43], Prayer.PROTECT_FROM_MELEE);
        COLOSSAL_BLADE = new GameEnum90(llllIlIll[45], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_BLESSED_SWORD = new GameEnum90(llllIlIll[47], Prayer.PROTECT_FROM_MELEE);
        cb[] cbArray = new cb[llllIlIll[48]];
        cbArray[cb.llllIlIll[0]] = BRONZE_2H_SWORD;
        cbArray[cb.llllIlIll[2]] = IRON_2H_SWORD;
        cbArray[cb.llllIlIll[4]] = STEEL_2H_SWORD;
        cbArray[cb.llllIlIll[6]] = BLACK_2H_SWORD;
        cbArray[cb.llllIlIll[8]] = WHITE_2H_SWORD;
        cbArray[cb.llllIlIll[10]] = MITHRIL_2H_SWORD;
        cbArray[cb.llllIlIll[12]] = ADAMANT_2H_SWORD;
        cbArray[cb.llllIlIll[14]] = RUNE_2H_SWORD;
        cbArray[cb.llllIlIll[16]] = DRAGON_2H_SWORD;
        cbArray[cb.llllIlIll[18]] = ANCIENT_GODSWORD;
        cbArray[cb.llllIlIll[20]] = ARMADYL_GODSWORD;
        cbArray[cb.llllIlIll[22]] = ARMADYL_GODSWORD_OR;
        cbArray[cb.llllIlIll[24]] = BANDOS_GODSWORD;
        cbArray[cb.llllIlIll[26]] = BANDOS_GODSWORD_OR;
        cbArray[cb.llllIlIll[28]] = SARADOMIN_GODSWORD;
        cbArray[cb.llllIlIll[30]] = SARADOMIN_GODSWORD_OR;
        cbArray[cb.llllIlIll[32]] = ZAMORAK_GODSWORD;
        cbArray[cb.llllIlIll[34]] = ZAMORAK_GODSWORD_OR;
        cbArray[cb.llllIlIll[36]] = SHADOW_SWORD;
        cbArray[cb.llllIlIll[38]] = SPATULA;
        cbArray[cb.llllIlIll[40]] = GILDED_2H_SWORD;
        cbArray[cb.llllIlIll[42]] = SARADOMIN_SWORD;
        cbArray[cb.llllIlIll[44]] = COLOSSAL_BLADE;
        cbArray[cb.llllIlIll[46]] = SARADOMIN_BLESSED_SWORD;
        $VALUES = cbArray;
    }

    private static void llIlIIIIllI() {
        llllIlIlI = new String[llllIlIll[48]];
        cb.llllIlIlI[cb.llllIlIll[0]] = "BRONZE_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[2]] = "IRON_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[4]] = "STEEL_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[6]] = "BLACK_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[8]] = "WHITE_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[10]] = "MITHRIL_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[12]] = "ADAMANT_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[14]] = "RUNE_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[16]] = "DRAGON_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[18]] = "ANCIENT_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[20]] = "ARMADYL_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[22]] = "ARMADYL_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[24]] = "BANDOS_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[26]] = "BANDOS_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[28]] = "SARADOMIN_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[30]] = "SARADOMIN_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[32]] = "ZAMORAK_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[34]] = "ZAMORAK_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[36]] = "SHADOW_SWORD";
        cb.llllIlIlI[cb.llllIlIll[38]] = "SPATULA";
        cb.llllIlIlI[cb.llllIlIll[40]] = "GILDED_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[42]] = "SARADOMIN_SWORD";
        cb.llllIlIlI[cb.llllIlIll[44]] = "COLOSSAL_BLADE";
        cb.llllIlIlI[cb.llllIlIll[46]] = "SARADOMIN_BLESSED_SWORD";
    }

    private GameEnum90(int n3, Prayer prayer) {
        this.itemID = n3;
        this.protectionPrayer = prayer;
    }

    public int ar() {
        return this.itemID;
    }

        return String.valueOf(lIlIIllIlllIllI);
    }

    public static cb valueOf(String string) {
        return Enum.valueOf(GameEnum90.class, string);
    }
}

