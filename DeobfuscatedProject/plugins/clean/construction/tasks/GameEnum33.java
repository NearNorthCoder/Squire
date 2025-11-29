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

final class GameEnum33
extends Enum<ca> {
    public static final  /* enum */ ca RUNE_AXE;
    public static final  /* enum */ ca BRONZE_AXE;
    public static final  /* enum */ ca IRON_AXE;
    
    public static final  /* enum */ ca INFARNAL_AXE;
    public static final  /* enum */ ca GILDED_AXE;
    public static final  /* enum */ ca MITHRIL_AXE;
    public static final  /* enum */ ca STEEL_AXE;
    public static final  /* enum */ ca ADAMANT_AXE;
    public static final  /* enum */ ca DRAGON_AXE;
    
    private final  int itemID;
    private final  Prayer protectionPrayer;
    public static final  /* enum */ ca BLESSED_AXE;
    public static final  /* enum */ ca BLACK_AXE;
    public static final  /* enum */ ca CRYSTAL_AXE;
    public static final  /* enum */ ca THIRD_AGE_AXE;
    private static final  ca[] $VALUES;

    static {
        ca.llllIllIlI();
        ca.llllIllIIl();
        BRONZE_AXE = new GameEnum33(lIIIlllII[1], Prayer.PROTECT_FROM_MELEE);
        IRON_AXE = new GameEnum33(lIIIlllII[3], Prayer.PROTECT_FROM_MELEE);
        STEEL_AXE = new GameEnum33(lIIIlllII[5], Prayer.PROTECT_FROM_MELEE);
        BLACK_AXE = new GameEnum33(lIIIlllII[7], Prayer.PROTECT_FROM_MELEE);
        MITHRIL_AXE = new GameEnum33(lIIIlllII[9], Prayer.PROTECT_FROM_MELEE);
        ADAMANT_AXE = new GameEnum33(lIIIlllII[11], Prayer.PROTECT_FROM_MELEE);
        RUNE_AXE = new GameEnum33(lIIIlllII[13], Prayer.PROTECT_FROM_MELEE);
        DRAGON_AXE = new GameEnum33(lIIIlllII[15], Prayer.PROTECT_FROM_MELEE);
        CRYSTAL_AXE = new GameEnum33(lIIIlllII[17], Prayer.PROTECT_FROM_MELEE);
        BLESSED_AXE = new GameEnum33(lIIIlllII[19], Prayer.PROTECT_FROM_MELEE);
        GILDED_AXE = new GameEnum33(lIIIlllII[21], Prayer.PROTECT_FROM_MELEE);
        THIRD_AGE_AXE = new GameEnum33(lIIIlllII[23], Prayer.PROTECT_FROM_MELEE);
        INFARNAL_AXE = new GameEnum33(lIIIlllII[25], Prayer.PROTECT_FROM_MELEE);
        ca[] caArray = new ca[lIIIlllII[26]];
        caArray[ca.lIIIlllII[0]] = BRONZE_AXE;
        caArray[ca.lIIIlllII[2]] = IRON_AXE;
        caArray[ca.lIIIlllII[4]] = STEEL_AXE;
        caArray[ca.lIIIlllII[6]] = BLACK_AXE;
        caArray[ca.lIIIlllII[8]] = MITHRIL_AXE;
        caArray[ca.lIIIlllII[10]] = ADAMANT_AXE;
        caArray[ca.lIIIlllII[12]] = RUNE_AXE;
        caArray[ca.lIIIlllII[14]] = DRAGON_AXE;
        caArray[ca.lIIIlllII[16]] = CRYSTAL_AXE;
        caArray[ca.lIIIlllII[18]] = BLESSED_AXE;
        caArray[ca.lIIIlllII[20]] = GILDED_AXE;
        caArray[ca.lIIIlllII[22]] = THIRD_AGE_AXE;
        caArray[ca.lIIIlllII[24]] = INFARNAL_AXE;
        $VALUES = caArray;
    }

    private static boolean lllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public int ar() {
        return this.itemID;
    }

    private GameEnum33(int n3, Prayer prayer) {
        this.itemID = n3;
        this.protectionPrayer = prayer;
    }

        return String.valueOf(llIIlIlIIIllIlI);
    }

    public static ca valueOf(String string) {
        return Enum.valueOf(GameEnum33.class, string);
    }

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static ca[] values() {
        return (ca[])$VALUES.clone();
    }

    private static void llllIllIIl() {
        lIIIllIlI = new String[lIIIlllII[26]];
        ca.lIIIllIlI[ca.lIIIlllII[0]] = "BRONZE_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[2]] = "IRON_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[4]] = "STEEL_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[6]] = "BLACK_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[8]] = "MITHRIL_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[10]] = "ADAMANT_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[12]] = "RUNE_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[14]] = "DRAGON_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[16]] = "CRYSTAL_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[18]] = "BLESSED_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[20]] = "GILDED_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[22]] = "THIRD_AGE_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[24]] = "INFARNAL_AXE";
    }
}

