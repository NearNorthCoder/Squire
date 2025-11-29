/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

public final class GameEnum4
extends Enum<d> {
    
    public static final  /* enum */ d LOW;
    public static final  /* enum */ d VERY_LOW;
    
    public static final  /* enum */ d VERY_HIGH;
    private static final  d[] $VALUES;
    public static final  /* enum */ d HIGH;
    public static final  /* enum */ d MEDIUM;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.var25();
        d.var26();
        VERY_LOW = new GameEnum4();
        LOW = new GameEnum4();
        MEDIUM = new GameEnum4();
        HIGH = new GameEnum4();
        VERY_HIGH = new GameEnum4();
        d[] dArray = new d[5];
        dArray[0] = VERY_LOW;
        dArray[1] = LOW;
        dArray[2] = MEDIUM;
        dArray[3] = HIGH;
        dArray[4] = VERY_HIGH;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }
}

