/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.construction.tasks;

import net.runelite.api.Prayer;

public final class GameEnum18
extends Enum<cb> {
    public static final  /* enum */ cb SARADOMIN_GODSWORD;
    public static final  /* enum */ cb BLACK_2H_SWORD;
    public static final  /* enum */ cb BRONZE_2H_SWORD;
    public static final  /* enum */ cb STEEL_2H_SWORD;
    public static final  /* enum */ cb SARADOMIN_GODSWORD_OR;
    private static  String[] llllIlIlI;
    private static final  cb[] $VALUES;
    private static  int[] llllIlIll;
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

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static cb[] values() {
        return (cb[])$VALUES.clone();
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private GameEnum18(int n3, Prayer prayer) {
        this.itemID = n3;
        this.protectionPrayer = prayer;
    }

    public int ar() {
        return this.itemID;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    public static cb valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }
}

