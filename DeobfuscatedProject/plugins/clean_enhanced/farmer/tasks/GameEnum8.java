/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

public final class GameEnum8
extends Enum<o> {
    private static final  o[] $VALUES;
    public static final  /* enum */ o BIRD_HOUSE;
    
    public static final  /* enum */ o HERBS;
    public static final  /* enum */ o SEAWEED;
    public static final  /* enum */ o TREES;

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
            if (2 != 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    static {
        o.var19();
        o.var20();
        HERBS = new GameEnum8();
        TREES = new GameEnum8();
        BIRD_HOUSE = new GameEnum8();
        SEAWEED = new GameEnum8();
        o[] oArray = new o[4];
        oArray[0] = HERBS;
        oArray[1] = TREES;
        oArray[2] = BIRD_HOUSE;
        oArray[3] = SEAWEED;
        $VALUES = oArray;
    }
}

