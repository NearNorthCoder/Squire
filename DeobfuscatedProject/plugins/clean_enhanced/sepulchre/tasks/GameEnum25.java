/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum25
extends Enum<x> {
     String name;
    
    public static final  /* enum */ x NONE;
    private static final  x[] $VALUES;
    
    public static final  /* enum */ x STRANGE_LOCKPICK;
    public static final  /* enum */ x LOCKPICK;

    private static void var3() {
        var2 = new int[7];
        x.var2[0] = (162 + 42 - -33 + 7 ^ 150 + 123 - 103 + 24) & (168 + 182 - 148 + 41 ^ 87 + 78 - -30 + 2 ^ -1);
        x.var2[1] = 1;
        x.var2[2] = 2;
        x.var2[3] = 3;
        x.var2[4] = 6 ^ 2;
        x.var2[5] = 98 + 146 - 186 + 138 ^ 46 + 78 - 1 + 70;
        x.var2[6] = 128 + 163 - 149 + 36 ^ 153 + 142 - 158 + 43;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(GameEnum25.class, string);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static void var11() {
        var1 = new String[var2[6]];
        x.var1[x.var2[0]] = "NONE";
        x.var1[x.var2[1]] = x.var12("", "RiCxr");
        x.var1[x.var2[2]] = "LOCKPICK";
        x.var1[x.var2[3]] = x.var4("/i19lAulv3E=", "OcVXu");
        x.var1[x.var2[4]] = "STRANGE_LOCKPICK";
        x.var1[x.var2[5]] = x.var4("sdEJxsCepRI=", "WePUJ");
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (x.var10(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-(65 + 142 - 161 + 111 ^ 87 + 2 - 23 + 87) <= 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    static {
        x.var3();
        x.var11();
        NONE = new GameEnum25(var1[var2[1]]);
        LOCKPICK = new GameEnum25(var1[var2[3]]);
        STRANGE_LOCKPICK = new GameEnum25(var1[var2[5]]);
        x[] xArray = new x[var2[3]];
        xArray[x.var2[0]] = NONE;
        xArray[x.var2[1]] = LOCKPICK;
        xArray[x.var2[2]] = STRANGE_LOCKPICK;
        $VALUES = xArray;
    }

    private GameEnum25(String string2) {
        this.name = string2;
    }
}

