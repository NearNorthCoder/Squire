/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

public final class GameEnum10
extends Enum<A> {
    public static final  /* enum */ A UNKNOWN;
    
    public static final  /* enum */ A ACID;
    public static final  /* enum */ A CRYSTAL;
    
    public static final  /* enum */ A FLAME;
    private static final  A[] $VALUES;

    static {
        A.var3();
        A.var4();
        FLAME = new GameEnum10();
        ACID = new GameEnum10();
        CRYSTAL = new GameEnum10();
        UNKNOWN = new GameEnum10();
        A[] aArray = new A[4];
        aArray[0] = FLAME;
        aArray[1] = ACID;
        aArray[2] = CRYSTAL;
        aArray[3] = UNKNOWN;
        $VALUES = aArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0xFB ^ 0x82 ^ (0x79 ^ 0x11)) & (3 + 140 - 115 + 132 ^ 82 + 133 - 138 + 100 ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static A valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }
}

