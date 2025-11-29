/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.whisperer.tasks;

final class GameEnum
extends Enum<w> {
    
    public static final  /* enum */ w BREWING;
    
    public static final  /* enum */ w RESTORING;
    private static final  w[] $VALUES;
    public static final  /* enum */ w NONE;

    static {
        w.var3();
        w.var4();
        NONE = new GameEnum();
        BREWING = new GameEnum();
        RESTORING = new GameEnum();
        w[] wArray = new w[3];
        wArray[0] = NONE;
        wArray[1] = BREWING;
        wArray[2] = RESTORING;
        $VALUES = wArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0xC5 ^ 0xC1) > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }
}

