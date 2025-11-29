/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.WidgetInfo
 */
package gg.squire.skilling.tasks;

import net.runelite.api.widgets.WidgetInfo;

public final class GameEnum13
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

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (r.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xF ^ 0x71 ^ (0xA1 ^ 0xC7)) & (73 + 187 - 247 + 178 ^ 44 + 12 - -67 + 44 ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public int R() {
        return this.barsRequired;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    static {
        r.var20();
        r.var21();
        DAGGER = new GameEnum13(WidgetInfo.SMITHING_ANVIL_DAGGER, var1[1]);
        AXE = new GameEnum13(WidgetInfo.SMITHING_ANVIL_AXE, var1[1]);
        MACE = new GameEnum13(WidgetInfo.SMITHING_ANVIL_MACE, var1[1]);
        MED_HELM = new GameEnum13(WidgetInfo.SMITHING_ANVIL_MED_HELM, var1[1]);
        BOLTS = new GameEnum13(WidgetInfo.SMITHING_ANVIL_BOLTS, var1[1]);
        SWORD = new GameEnum13(WidgetInfo.SMITHING_ANVIL_SWORD, var1[1]);
        DART_TIP = new GameEnum13(WidgetInfo.SMITHING_ANVIL_DART_TIPS, var1[1]);
        NAILS = new GameEnum13(WidgetInfo.SMITHING_ANVIL_NAILS, var1[1]);
        SCIMITAR = new GameEnum13(WidgetInfo.SMITHING_ANVIL_SCIMITAR, var1[2]);
        ARROWTIPS = new GameEnum13(WidgetInfo.SMITHING_ANVIL_ARROW_HEADS, var1[1]);
        LIMBS = new GameEnum13(WidgetInfo.SMITHING_ANVIL_LIMBS, var1[1]);
        LONGSWORD = new GameEnum13(WidgetInfo.SMITHING_ANVIL_LONG_SWORD, var1[2]);
        JAVELIN_HEAD = new GameEnum13(WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS, var1[1]);
        FULL_HELM = new GameEnum13(WidgetInfo.SMITHING_ANVIL_FULL_HELM, var1[2]);
        KNIFE = new GameEnum13(WidgetInfo.SMITHING_ANVIL_KNIVES, var1[1]);
        SQ_SHIELD = new GameEnum13(WidgetInfo.SMITHING_ANVIL_SQ_SHIELD, var1[2]);
        WARHAMMER = new GameEnum13(WidgetInfo.SMITHING_ANVIL_WARHAMMER, var1[3]);
        BATTLEAXE = new GameEnum13(WidgetInfo.SMITHING_ANVIL_BATTLE_AXE, var1[3]);
        CHAINBODY = new GameEnum13(WidgetInfo.SMITHING_ANVIL_CHAIN_BODY, var1[3]);
        KITESHIELD = new GameEnum13(WidgetInfo.SMITHING_ANVIL_KITE_SHIELD, var1[3]);
        CLAWS = new GameEnum13(WidgetInfo.SMITHING_ANVIL_CLAWS, var1[2]);
        TWO_HANDED_SWORD = new GameEnum13(WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD, var1[3]);
        PLATELEGS = new GameEnum13(WidgetInfo.SMITHING_ANVIL_PLATE_LEGS, var1[3]);
        PLATESKIRT = new GameEnum13(WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT, var1[3]);
        PLATEBODY = new GameEnum13(WidgetInfo.SMITHING_ANVIL_PLATE_BODY, var1[5]);
        r[] rArray = new r[var1[25]];
        rArray[r.var1[0]] = DAGGER;
        rArray[r.var1[1]] = AXE;
        rArray[r.var1[2]] = MACE;
        rArray[r.var1[3]] = MED_HELM;
        rArray[r.var1[4]] = BOLTS;
        rArray[r.var1[5]] = SWORD;
        rArray[r.var1[6]] = DART_TIP;
        rArray[r.var1[7]] = NAILS;
        rArray[r.var1[8]] = SCIMITAR;
        rArray[r.var1[9]] = ARROWTIPS;
        rArray[r.var1[10]] = LIMBS;
        rArray[r.var1[11]] = LONGSWORD;
        rArray[r.var1[12]] = JAVELIN_HEAD;
        rArray[r.var1[13]] = FULL_HELM;
        rArray[r.var1[14]] = KNIFE;
        rArray[r.var1[15]] = SQ_SHIELD;
        rArray[r.var1[16]] = WARHAMMER;
        rArray[r.var1[17]] = BATTLEAXE;
        rArray[r.var1[18]] = CHAINBODY;
        rArray[r.var1[19]] = KITESHIELD;
        rArray[r.var1[20]] = CLAWS;
        rArray[r.var1[21]] = TWO_HANDED_SWORD;
        rArray[r.var1[22]] = PLATELEGS;
        rArray[r.var1[23]] = PLATESKIRT;
        rArray[r.var1[24]] = PLATEBODY;
        $VALUES = rArray;
    }

    public WidgetInfo Q() {
        return this.smithingWidgetGroup;
    }

    private static void var20() {
        var1 = new int[26];
        r.var1[0] = (0xB4 ^ 0xBB) & ~(0xAF ^ 0xA0);
        r.var1[1] = 1;
        r.var1[2] = 2;
        r.var1[3] = 3;
        r.var1[4] = 0x73 ^ 0x6E ^ (0x72 ^ 0x6B);
        r.var1[5] = 0x12 ^ 0x17;
        r.var1[6] = 0xC3 ^ 0xC5;
        r.var1[7] = 0x3A ^ 0x3D;
        r.var1[8] = 0x9C ^ 0x94;
        r.var1[9] = 0xC ^ 5;
        r.var1[10] = 0xD ^ 7;
        r.var1[11] = 0x7C ^ 9 ^ (0x28 ^ 0x56);
        r.var1[12] = 0x38 ^ 0x5B ^ (0x19 ^ 0x76);
        r.var1[13] = 0x3E ^ 0x15 ^ (0x40 ^ 0x66);
        r.var1[14] = 111 + 56 - 73 + 49 ^ 52 + 35 - -32 + 10;
        r.var1[15] = 0x77 ^ 0x26 ^ (0xD8 ^ 0x86);
        r.var1[16] = 42 + 135 - 104 + 98 ^ 14 + 89 - 64 + 148;
        r.var1[17] = 141 + 156 - 181 + 64 ^ 27 + 7 - 16 + 147;
        r.var1[18] = 0x40 ^ 0x52;
        r.var1[19] = 0x38 ^ 0 ^ (0x45 ^ 0x6E);
        r.var1[20] = 0xDB ^ 0x82 ^ (0x2A ^ 0x67);
        r.var1[21] = 0x65 ^ 0x70;
        r.var1[22] = 0x1F ^ 9;
        r.var1[23] = 55 + 127 - 169 + 155 ^ 125 + 95 - 141 + 112;
        r.var1[24] = 0xE ^ 3 ^ (0xC ^ 0x19);
        r.var1[25] = 0x86 ^ 0x9F;
    }

    private static void var21() {
        var2 = new String[var1[25]];
        r.var2[r.var1[0]] = "DAGGER";
        r.var2[r.var1[1]] = "AXE";
        r.var2[r.var1[2]] = "MACE";
        r.var2[r.var1[3]] = "MED_HELM";
        r.var2[r.var1[4]] = "BOLTS";
        r.var2[r.var1[5]] = "SWORD";
        r.var2[r.var1[6]] = "DART_TIP";
        r.var2[r.var1[7]] = "NAILS";
        r.var2[r.var1[8]] = "SCIMITAR";
        r.var2[r.var1[9]] = "ARROWTIPS";
        r.var2[r.var1[10]] = "LIMBS";
        r.var2[r.var1[11]] = "LONGSWORD";
        r.var2[r.var1[12]] = "JAVELIN_HEAD";
        r.var2[r.var1[13]] = "FULL_HELM";
        r.var2[r.var1[14]] = "KNIFE";
        r.var2[r.var1[15]] = "SQ_SHIELD";
        r.var2[r.var1[16]] = "WARHAMMER";
        r.var2[r.var1[17]] = "BATTLEAXE";
        r.var2[r.var1[18]] = "CHAINBODY";
        r.var2[r.var1[19]] = "KITESHIELD";
        r.var2[r.var1[20]] = "CLAWS";
        r.var2[r.var1[21]] = "TWO_HANDED_SWORD";
        r.var2[r.var1[22]] = "PLATELEGS";
        r.var2[r.var1[23]] = "PLATESKIRT";
        r.var2[r.var1[24]] = "PLATEBODY";
    }

    private GameEnum13(WidgetInfo widgetInfo, int n3) {
        this.smithingWidgetGroup = widgetInfo;
        this.barsRequired = n3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

