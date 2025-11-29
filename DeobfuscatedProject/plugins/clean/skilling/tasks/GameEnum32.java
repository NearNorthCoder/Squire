/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.WidgetInfo
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.WidgetInfo;

public final class GameEnum32
extends Enum<r> {
    public static final  /* enum */ r KITESHIELD;
    public static final  /* enum */ r ARROWTIPS;
    public static final  /* enum */ r FULL_HELM;
    public static final  /* enum */ r AXE;
    public static final  /* enum */ r PLATELEGS;
    private static final  r[] $VALUES;
    private final  int barsRequired;
    public static final  /* enum */ r MACE;
    public static final  /* enum */ r SCIMITAR;
    public static final  /* enum */ r KNIFE;
    public static final  /* enum */ r CLAWS;
    public static final  /* enum */ r TWO_HANDED_SWORD;
    
    public static final  /* enum */ r SWORD;
    public static final  /* enum */ r CHAINBODY;
    public static final  /* enum */ r PLATESKIRT;
    private final  WidgetInfo smithingWidgetGroup;
    public static final  /* enum */ r JAVELIN_HEAD;
    public static final  /* enum */ r WARHAMMER;
    
    public static final  /* enum */ r MED_HELM;
    public static final  /* enum */ r BATTLEAXE;
    public static final  /* enum */ r DAGGER;
    public static final  /* enum */ r PLATEBODY;
    public static final  /* enum */ r NAILS;
    public static final  /* enum */ r SQ_SHIELD;
    public static final  /* enum */ r BOLTS;
    public static final  /* enum */ r LONGSWORD;
    public static final  /* enum */ r LIMBS;
    public static final  /* enum */ r DART_TIP;

        return String.valueOf(var1);
    }

    public int R() {
        return this.barsRequired;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum32.class, string);
    }

    static {
        r.lIlIllIIlIIIlI();
        r.lIlIllIIlIIIIl();
        DAGGER = new GameEnum32(WidgetInfo.SMITHING_ANVIL_DAGGER, lllIIIIlIll[1]);
        AXE = new GameEnum32(WidgetInfo.SMITHING_ANVIL_AXE, lllIIIIlIll[1]);
        MACE = new GameEnum32(WidgetInfo.SMITHING_ANVIL_MACE, lllIIIIlIll[1]);
        MED_HELM = new GameEnum32(WidgetInfo.SMITHING_ANVIL_MED_HELM, lllIIIIlIll[1]);
        BOLTS = new GameEnum32(WidgetInfo.SMITHING_ANVIL_BOLTS, lllIIIIlIll[1]);
        SWORD = new GameEnum32(WidgetInfo.SMITHING_ANVIL_SWORD, lllIIIIlIll[1]);
        DART_TIP = new GameEnum32(WidgetInfo.SMITHING_ANVIL_DART_TIPS, lllIIIIlIll[1]);
        NAILS = new GameEnum32(WidgetInfo.SMITHING_ANVIL_NAILS, lllIIIIlIll[1]);
        SCIMITAR = new GameEnum32(WidgetInfo.SMITHING_ANVIL_SCIMITAR, lllIIIIlIll[2]);
        ARROWTIPS = new GameEnum32(WidgetInfo.SMITHING_ANVIL_ARROW_HEADS, lllIIIIlIll[1]);
        LIMBS = new GameEnum32(WidgetInfo.SMITHING_ANVIL_LIMBS, lllIIIIlIll[1]);
        LONGSWORD = new GameEnum32(WidgetInfo.SMITHING_ANVIL_LONG_SWORD, lllIIIIlIll[2]);
        JAVELIN_HEAD = new GameEnum32(WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS, lllIIIIlIll[1]);
        FULL_HELM = new GameEnum32(WidgetInfo.SMITHING_ANVIL_FULL_HELM, lllIIIIlIll[2]);
        KNIFE = new GameEnum32(WidgetInfo.SMITHING_ANVIL_KNIVES, lllIIIIlIll[1]);
        SQ_SHIELD = new GameEnum32(WidgetInfo.SMITHING_ANVIL_SQ_SHIELD, lllIIIIlIll[2]);
        WARHAMMER = new GameEnum32(WidgetInfo.SMITHING_ANVIL_WARHAMMER, lllIIIIlIll[3]);
        BATTLEAXE = new GameEnum32(WidgetInfo.SMITHING_ANVIL_BATTLE_AXE, lllIIIIlIll[3]);
        CHAINBODY = new GameEnum32(WidgetInfo.SMITHING_ANVIL_CHAIN_BODY, lllIIIIlIll[3]);
        KITESHIELD = new GameEnum32(WidgetInfo.SMITHING_ANVIL_KITE_SHIELD, lllIIIIlIll[3]);
        CLAWS = new GameEnum32(WidgetInfo.SMITHING_ANVIL_CLAWS, lllIIIIlIll[2]);
        TWO_HANDED_SWORD = new GameEnum32(WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD, lllIIIIlIll[3]);
        PLATELEGS = new GameEnum32(WidgetInfo.SMITHING_ANVIL_PLATE_LEGS, lllIIIIlIll[3]);
        PLATESKIRT = new GameEnum32(WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT, lllIIIIlIll[3]);
        PLATEBODY = new GameEnum32(WidgetInfo.SMITHING_ANVIL_PLATE_BODY, lllIIIIlIll[5]);
        r[] rArray = new r[lllIIIIlIll[25]];
        rArray[r.lllIIIIlIll[0]] = DAGGER;
        rArray[r.lllIIIIlIll[1]] = AXE;
        rArray[r.lllIIIIlIll[2]] = MACE;
        rArray[r.lllIIIIlIll[3]] = MED_HELM;
        rArray[r.lllIIIIlIll[4]] = BOLTS;
        rArray[r.lllIIIIlIll[5]] = SWORD;
        rArray[r.lllIIIIlIll[6]] = DART_TIP;
        rArray[r.lllIIIIlIll[7]] = NAILS;
        rArray[r.lllIIIIlIll[8]] = SCIMITAR;
        rArray[r.lllIIIIlIll[9]] = ARROWTIPS;
        rArray[r.lllIIIIlIll[10]] = LIMBS;
        rArray[r.lllIIIIlIll[11]] = LONGSWORD;
        rArray[r.lllIIIIlIll[12]] = JAVELIN_HEAD;
        rArray[r.lllIIIIlIll[13]] = FULL_HELM;
        rArray[r.lllIIIIlIll[14]] = KNIFE;
        rArray[r.lllIIIIlIll[15]] = SQ_SHIELD;
        rArray[r.lllIIIIlIll[16]] = WARHAMMER;
        rArray[r.lllIIIIlIll[17]] = BATTLEAXE;
        rArray[r.lllIIIIlIll[18]] = CHAINBODY;
        rArray[r.lllIIIIlIll[19]] = KITESHIELD;
        rArray[r.lllIIIIlIll[20]] = CLAWS;
        rArray[r.lllIIIIlIll[21]] = TWO_HANDED_SWORD;
        rArray[r.lllIIIIlIll[22]] = PLATELEGS;
        rArray[r.lllIIIIlIll[23]] = PLATESKIRT;
        rArray[r.lllIIIIlIll[24]] = PLATEBODY;
        $VALUES = rArray;
    }

    public WidgetInfo Q() {
        return this.smithingWidgetGroup;
    }

    private static void lIlIllIIlIIIIl() {
        lllIIIIlIlI = new String[lllIIIIlIll[25]];
        r.lllIIIIlIlI[r.lllIIIIlIll[0]] = "DAGGER";
        r.lllIIIIlIlI[r.lllIIIIlIll[1]] = "AXE";
        r.lllIIIIlIlI[r.lllIIIIlIll[2]] = "MACE";
        r.lllIIIIlIlI[r.lllIIIIlIll[3]] = "MED_HELM";
        r.lllIIIIlIlI[r.lllIIIIlIll[4]] = "BOLTS";
        r.lllIIIIlIlI[r.lllIIIIlIll[5]] = "SWORD";
        r.lllIIIIlIlI[r.lllIIIIlIll[6]] = "DART_TIP";
        r.lllIIIIlIlI[r.lllIIIIlIll[7]] = "NAILS";
        r.lllIIIIlIlI[r.lllIIIIlIll[8]] = "SCIMITAR";
        r.lllIIIIlIlI[r.lllIIIIlIll[9]] = "ARROWTIPS";
        r.lllIIIIlIlI[r.lllIIIIlIll[10]] = "LIMBS";
        r.lllIIIIlIlI[r.lllIIIIlIll[11]] = "LONGSWORD";
        r.lllIIIIlIlI[r.lllIIIIlIll[12]] = "JAVELIN_HEAD";
        r.lllIIIIlIlI[r.lllIIIIlIll[13]] = "FULL_HELM";
        r.lllIIIIlIlI[r.lllIIIIlIll[14]] = "KNIFE";
        r.lllIIIIlIlI[r.lllIIIIlIll[15]] = "SQ_SHIELD";
        r.lllIIIIlIlI[r.lllIIIIlIll[16]] = "WARHAMMER";
        r.lllIIIIlIlI[r.lllIIIIlIll[17]] = "BATTLEAXE";
        r.lllIIIIlIlI[r.lllIIIIlIll[18]] = "CHAINBODY";
        r.lllIIIIlIlI[r.lllIIIIlIll[19]] = "KITESHIELD";
        r.lllIIIIlIlI[r.lllIIIIlIll[20]] = "CLAWS";
        r.lllIIIIlIlI[r.lllIIIIlIll[21]] = "TWO_HANDED_SWORD";
        r.lllIIIIlIlI[r.lllIIIIlIll[22]] = "PLATELEGS";
        r.lllIIIIlIlI[r.lllIIIIlIll[23]] = "PLATESKIRT";
        r.lllIIIIlIlI[r.lllIIIIlIll[24]] = "PLATEBODY";
    }

    private GameEnum32(WidgetInfo widgetInfo, int n3) {
        this.smithingWidgetGroup = widgetInfo;
        this.barsRequired = n3;
    }

    private static boolean lIlIllIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

}

