/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum4
extends Enum<b> {
    public static final  /* enum */ b FLETCH_CUTTING;
    public static final  /* enum */ b JEWELRY;
    public static final  /* enum */ b SMELTING;
    public static final  /* enum */ b GLASS_MAKE;
    public static final  /* enum */ b BOLTS;
    public static final  /* enum */ b ARROWS;
    public static final  /* enum */ b ZERO_TICK;
    public static final  /* enum */ b CANNON_BALLS;
    public static final  /* enum */ b COOKING;
    public static final  /* enum */ b ENCHANT_BOLTS;
    public static final  /* enum */ b DARTS;
    public static final  /* enum */ b SMITHING;
    public static final  /* enum */ b ALCHING;
    
    public static final  /* enum */ b STRING_BOWS;
    public static final  /* enum */ b ENCHANTING;
    public static final  /* enum */ b WINES;
    public static final  /* enum */ b ARMOUR;
    public static final  /* enum */ b FURNACE_GLASS;
    private static final  b[] $VALUES;
    public static final  /* enum */ b BATTLESTAVES;
    public static final  /* enum */ b GEM_CUTTING;
    
    public static final  /* enum */ b GLASS_BLOWING;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private static void var9() {
        var2 = new String[var1[23]];
        b.var2[b.var1[0]] = "_";
        b.var2[b.var1[1]] = " ";
        b.var2[b.var1[2]] = "GEM_CUTTING";
        b.var2[b.var1[3]] = "BATTLESTAVES";
        b.var2[b.var1[4]] = "JEWELRY";
        b.var2[b.var1[5]] = "GLASS_BLOWING";
        b.var2[b.var1[6]] = "DARTS";
        b.var2[b.var1[7]] = "ARROWS";
        b.var2[b.var1[8]] = "FLETCH_CUTTING";
        b.var2[b.var1[9]] = "STRING_BOWS";
        b.var2[b.var1[10]] = "BOLTS";
        b.var2[b.var1[11]] = "COOKING";
        b.var2[b.var1[12]] = "WINES";
        b.var2[b.var1[13]] = "ALCHING";
        b.var2[b.var1[14]] = "GLASS_MAKE";
        b.var2[b.var1[15]] = "ENCHANTING";
        b.var2[b.var1[16]] = "SMITHING";
        b.var2[b.var1[17]] = "ARMOUR";
        b.var2[b.var1[18]] = "SMELTING";
        b.var2[b.var1[19]] = "CANNON_BALLS";
        b.var2[b.var1[20]] = "ENCHANT_BOLTS";
        b.var2[b.var1[21]] = "ZERO_TICK";
        b.var2[b.var1[22]] = "FURNACE_GLASS";
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(var1[0]);
        return c2 + string.replaceAll(var2[var1[0]], var2[var1[1]]).substring(var1[1]).toLowerCase();
    }

    private static void var10() {
        var1 = new int[24];
        b.var1[0] = (0x42 ^ 0x1B ^ (0x4D ^ 0x74)) & (0xF ^ 0x17 ^ (0x76 ^ 0xE) ^ -1);
        b.var1[1] = 1;
        b.var1[2] = 2;
        b.var1[3] = 3;
        b.var1[4] = 0x81 ^ 0x85;
        b.var1[5] = 0xB4 ^ 0xB1;
        b.var1[6] = 0xA4 ^ 0xA2;
        b.var1[7] = 0x22 ^ 0x25;
        b.var1[8] = 0x6B ^ 0x63;
        b.var1[9] = 0x3D ^ 0xC ^ (0x51 ^ 0x69);
        b.var1[10] = 0xD6 ^ 0x92 ^ (0x7C ^ 0x32);
        b.var1[11] = 0x92 ^ 0x99;
        b.var1[12] = 0xA4 ^ 0xA8;
        b.var1[13] = 0x23 ^ 0x69 ^ (0x64 ^ 0x23);
        b.var1[14] = 0x9F ^ 0xA0 ^ (0x6E ^ 0x5F);
        b.var1[15] = 160 + 152 - 185 + 40 ^ 155 + 30 - 58 + 41;
        b.var1[16] = 0xBB ^ 0xAB;
        b.var1[17] = 4 ^ 0x30 ^ (0x52 ^ 0x77);
        b.var1[18] = 154 + 57 - 68 + 24 ^ 125 + 164 - 154 + 46;
        b.var1[19] = 0x63 ^ 0x70;
        b.var1[20] = 0x12 ^ 6;
        b.var1[21] = 104 + 27 - 124 + 126 ^ 27 + 21 - 19 + 115;
        b.var1[22] = 0x5E ^ 0x48;
        b.var1[23] = 0x40 ^ 0x57;
    }

    static {
        b.var10();
        b.var9();
        GEM_CUTTING = new GameEnum4();
        BATTLESTAVES = new GameEnum4();
        JEWELRY = new GameEnum4();
        GLASS_BLOWING = new GameEnum4();
        DARTS = new GameEnum4();
        ARROWS = new GameEnum4();
        FLETCH_CUTTING = new GameEnum4();
        STRING_BOWS = new GameEnum4();
        BOLTS = new GameEnum4();
        COOKING = new GameEnum4();
        WINES = new GameEnum4();
        ALCHING = new GameEnum4();
        GLASS_MAKE = new GameEnum4();
        ENCHANTING = new GameEnum4();
        SMITHING = new GameEnum4();
        ARMOUR = new GameEnum4();
        SMELTING = new GameEnum4();
        CANNON_BALLS = new GameEnum4();
        ENCHANT_BOLTS = new GameEnum4();
        ZERO_TICK = new GameEnum4();
        FURNACE_GLASS = new GameEnum4();
        b[] bArray = new b[var1[21]];
        bArray[b.var1[0]] = GEM_CUTTING;
        bArray[b.var1[1]] = BATTLESTAVES;
        bArray[b.var1[2]] = JEWELRY;
        bArray[b.var1[3]] = GLASS_BLOWING;
        bArray[b.var1[4]] = DARTS;
        bArray[b.var1[5]] = ARROWS;
        bArray[b.var1[6]] = FLETCH_CUTTING;
        bArray[b.var1[7]] = STRING_BOWS;
        bArray[b.var1[8]] = BOLTS;
        bArray[b.var1[9]] = COOKING;
        bArray[b.var1[10]] = WINES;
        bArray[b.var1[11]] = ALCHING;
        bArray[b.var1[12]] = GLASS_MAKE;
        bArray[b.var1[13]] = ENCHANTING;
        bArray[b.var1[14]] = SMITHING;
        bArray[b.var1[15]] = ARMOUR;
        bArray[b.var1[16]] = SMELTING;
        bArray[b.var1[17]] = CANNON_BALLS;
        bArray[b.var1[18]] = ENCHANT_BOLTS;
        bArray[b.var1[19]] = ZERO_TICK;
        bArray[b.var1[20]] = FURNACE_GLASS;
        $VALUES = bArray;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[0];
        while (b.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (2 >= ((73 + 150 - 125 + 105 ^ 170 + 65 - 163 + 99) & (78 + 74 - -21 + 30 ^ 119 + 30 - 48 + 70 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }
}

