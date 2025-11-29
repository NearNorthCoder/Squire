/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

public final class GameEnum6
extends Enum<bY> {
    
    public static final  /* enum */ bY WAVE;
    
    public static final  /* enum */ bY JUG;
    public static final  /* enum */ bY ATTACK;
    private static final  bY[] $VALUES;

    private static void var3() {
        var1 = new String[var2[3]];
        bY.var1[bY.var2[0]] = "ATTACK";
        bY.var1[bY.var2[1]] = "WAVE";
        bY.var1[bY.var2[2]] = "JUG";
    }

    private static void var4() {
        var2 = new int[5];
        bY.var2[0] = (0x73 ^ 0x6D ^ (0 ^ 0x59)) & (0x52 ^ 0x2F ^ (0x38 ^ 2) ^ -1);
        bY.var2[1] = 1;
        bY.var2[2] = 2;
        bY.var2[3] = 3;
        bY.var2[4] = 0x68 ^ 0x33 ^ (0xD0 ^ 0x83);
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
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (bY.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    static {
        bY.var4();
        bY.var3();
        ATTACK = new GameEnum6();
        WAVE = new GameEnum6();
        JUG = new GameEnum6();
        bY[] bYArray = new bY[var2[3]];
        bYArray[bY.var2[0]] = ATTACK;
        bYArray[bY.var2[1]] = WAVE;
        bYArray[bY.var2[2]] = JUG;
        $VALUES = bYArray;
    }

    public static bY valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    public static bY[] values() {
        return (bY[])$VALUES.clone();
    }
}

