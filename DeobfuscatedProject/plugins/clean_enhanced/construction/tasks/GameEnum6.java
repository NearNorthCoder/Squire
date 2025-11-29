/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.construction.tasks;

import net.runelite.api.Prayer;

final class GameEnum6
extends Enum<ca> {
    public static final  /* enum */ ca RUNE_AXE;
    public static final  /* enum */ ca BRONZE_AXE;
    public static final  /* enum */ ca IRON_AXE;
    private static  int[] lIIIlllII;
    public static final  /* enum */ ca INFARNAL_AXE;
    public static final  /* enum */ ca GILDED_AXE;
    public static final  /* enum */ ca MITHRIL_AXE;
    public static final  /* enum */ ca STEEL_AXE;
    public static final  /* enum */ ca ADAMANT_AXE;
    public static final  /* enum */ ca DRAGON_AXE;
    private static  String[] lIIIllIlI;
    private final  int itemID;
    private final  Prayer protectionPrayer;
    public static final  /* enum */ ca BLESSED_AXE;
    public static final  /* enum */ ca BLACK_AXE;
    public static final  /* enum */ ca CRYSTAL_AXE;
    public static final  /* enum */ ca THIRD_AGE_AXE;
    private static final  ca[] $VALUES;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int ar() {
        return this.itemID;
    }

    private GameEnum6(int n3, Prayer prayer) {
        this.itemID = n3;
        this.protectionPrayer = prayer;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (1 != -1) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static ca valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static ca[] values() {
        return (ca[])$VALUES.clone();
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

