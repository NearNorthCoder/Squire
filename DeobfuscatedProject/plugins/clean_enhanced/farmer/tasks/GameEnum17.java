/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

public final class GameEnum17
extends Enum<A> {
    private static final  A[] $VALUES;
    public static final  /* enum */ A CLOCK;
    private final  String name;
    public static final  /* enum */ A OVERVIEW;
    private final  int itemID;
    public static final  /* enum */ A FLOWER;
    public static final  /* enum */ A HOPS;
    public static final  /* enum */ A SPECIAL;
    public static final  /* enum */ A ALLOTMENT;
    public static final  /* enum */ A TREE;
    public static final  /* enum */ A TIME_OFFSET;
    public static final  /* enum */ A FRUIT_TREE;
    
    public static final  /* enum */ A BUSH;
    public static final  A[] FARMING_RUN_TYPES;
    
    public static final  /* enum */ A HERB;
    public static final  /* enum */ A BIRD_HOUSE;
    public static final  /* enum */ A GRAPE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
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
            if (3 >= ((0x3D ^ 0x22) & ~(0xA0 ^ 0xBF))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public String ac() {
        return this.name;
    }

    static {
        A.var19();
        A.var20();
        OVERVIEW = new GameEnum17(var1[1], 2);
        CLOCK = new GameEnum17(var1[4], 5);
        BIRD_HOUSE = new GameEnum17(var1[7], 8);
        ALLOTMENT = new GameEnum17(var1[var2[10]], var2[11]);
        FLOWER = new GameEnum17(var1[var2[13]], var2[14]);
        HERB = new GameEnum17(var1[var2[16]], var2[17]);
        TREE = new GameEnum17(var1[var2[19]], var2[20]);
        FRUIT_TREE = new GameEnum17(var1[var2[22]], var2[23]);
        HOPS = new GameEnum17(var1[var2[25]], var2[26]);
        BUSH = new GameEnum17(var1[var2[28]], var2[29]);
        GRAPE = new GameEnum17(var1[var2[31]], var2[32]);
        SPECIAL = new GameEnum17(var1[var2[34]], var2[35]);
        TIME_OFFSET = new GameEnum17(var1[var2[37]], var2[38]);
        A[] aArray = new A[var2[19]];
        aArray[0] = OVERVIEW;
        aArray[1] = CLOCK;
        aArray[3] = BIRD_HOUSE;
        aArray[4] = ALLOTMENT;
        aArray[6] = FLOWER;
        aArray[7] = HERB;
        aArray[9] = TREE;
        aArray[A.var2[10]] = FRUIT_TREE;
        aArray[A.var2[12]] = HOPS;
        aArray[A.var2[13]] = BUSH;
        aArray[A.var2[15]] = GRAPE;
        aArray[A.var2[16]] = SPECIAL;
        aArray[A.var2[18]] = TIME_OFFSET;
        $VALUES = aArray;
        A[] aArray2 = new A[var2[13]];
        aArray2[0] = HERB;
        aArray2[1] = TREE;
        aArray2[3] = FRUIT_TREE;
        aArray2[4] = SPECIAL;
        aArray2[6] = FLOWER;
        aArray2[7] = ALLOTMENT;
        aArray2[9] = BUSH;
        aArray2[A.var2[10]] = GRAPE;
        aArray2[A.var2[12]] = HOPS;
        FARMING_RUN_TYPES = aArray2;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    private GameEnum17(String string2, int n3) {
        this.name = string2;
        this.itemID = n3;
    }

    public int au() {
        return this.itemID;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }
}

