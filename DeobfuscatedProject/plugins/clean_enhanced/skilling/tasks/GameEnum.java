/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum
extends Enum<n> {
    public static final  /* enum */ n CANDLE_LANTERN;
    public static final  /* enum */ n LIGHT_ORB;
    private final  int craftingOption;

    private static final  n[] $VALUES;
    public static final  /* enum */ n UNPOWERED_STAFF_ORB;
    public static final  /* enum */ n VIAL;
    public static final  /* enum */ n FISHBOWL;
    private final  int materialID;
    public static final  /* enum */ n BEER_GLASS;
    public static final  /* enum */ n LANTERN_LENS;
    public static final  /* enum */ n OIL_LAMP;
    private final  int finishedID;

    static {
        n.var3();
        n.var4();
        BEER_GLASS = new GameEnum(var1[1], var1[2], var1[3]);
        CANDLE_LANTERN = new GameEnum(var1[1], var1[4], var1[5]);
        OIL_LAMP = new GameEnum(var1[1], var1[6], var1[7]);
        VIAL = new GameEnum(var1[1], var1[8], var1[9]);
        FISHBOWL = new GameEnum(var1[1], var1[10], var1[11]);
        UNPOWERED_STAFF_ORB = new GameEnum(var1[1], var1[12], var1[13]);
        LANTERN_LENS = new GameEnum(var1[1], var1[14], var1[15]);
        LIGHT_ORB = new GameEnum(var1[1], var1[16], var1[17]);
        n[] nArray = new n[var1[17]];
        nArray[n.var1[0]] = BEER_GLASS;
        nArray[n.var1[3]] = CANDLE_LANTERN;
        nArray[n.var1[5]] = OIL_LAMP;
        nArray[n.var1[7]] = VIAL;
        nArray[n.var1[9]] = FISHBOWL;
        nArray[n.var1[11]] = UNPOWERED_STAFF_ORB;
        nArray[n.var1[13]] = LANTERN_LENS;
        nArray[n.var1[15]] = LIGHT_ORB;
        $VALUES = nArray;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
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
        while (n.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static void var4() {
        var2 = new String[var1[17]];
        n.var2[n.var1[0]] = "BEER_GLASS";
        n.var2[n.var1[3]] = "CANDLE_LANTERN";
        n.var2[n.var1[5]] = "OIL_LAMP";
        n.var2[n.var1[7]] = "VIAL";
        n.var2[n.var1[9]] = "FISHBOWL";
        n.var2[n.var1[11]] = "UNPOWERED_STAFF_ORB";
        n.var2[n.var1[13]] = "LANTERN_LENS";
        n.var2[n.var1[15]] = "LIGHT_ORB";
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }

    public int C() {
        return this.craftingOption;
    }

    private static void var3() {
        var1 = new int[18];
        n.var1[0] = (0x5D ^ 0x4B) & ~(8 ^ 0x1E);
        n.var1[1] = 0xFFFF9FEF & 0x66FF;
        n.var1[2] = -(0xFFFFA991 & 0x7EEF) & (0xFFFFBFFF & 0x6FFF);
        n.var1[3] = 1;
        n.var1[4] = -(0xFFFFE779 & 0x7CD7) & (0xFFFFF5FF & Short.MAX_VALUE);
        n.var1[5] = 2;
        n.var1[6] = -(0xFFFFA627 & 0x5FDB) & (0xFFFF9FBF & 0x77EF);
        n.var1[7] = 3;
        n.var1[8] = 110 + 11 - 119 + 190 + (2 ^ 0x18) - (72 + 9 - 27 + 74) + (29 + 41 - -68 + 1);
        n.var1[9] = 0x12 ^ 0x16;
        n.var1[10] = -(0xFFFFF5FB & 0x6FA7) & (0xFFFFFFBF & 0x7FEE);
        n.var1[11] = 0x2B ^ 0x7D ^ (0xFE ^ 0xAD);
        n.var1[12] = 0xFFFFE27F & 0x1FB7;
        n.var1[13] = 0x28 ^ 0x2E;
        n.var1[14] = 0xFFFFB7BE & 0x59FF;
        n.var1[15] = 158 + 131 - 162 + 71 ^ 72 + 93 - 55 + 83;
        n.var1[16] = -(0xFFFFD781 & 0x7C7F) & (0xFFFFFEFD & 0x7FDF);
        n.var1[17] = 0x62 ^ 0x6A;
    }

    public int z() {
        return this.materialID;
    }

    private GameEnum(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    public int E() {
        return this.finishedID;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }
}

