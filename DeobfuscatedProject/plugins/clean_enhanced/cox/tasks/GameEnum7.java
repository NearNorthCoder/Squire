/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

public final class GameEnum7
extends Enum<w> {
    public static final  /* enum */ w REACHED_LOWER_LEVEL;
    private static final  w[] $VALUES;
    public static final  /* enum */ w EXPLORING_UPPER_LEVEL;
    
    public static final  /* enum */ w REACHED_BOTTOM;
    
    public static final  /* enum */ w GET_OUT;
    public static final  /* enum */ w WAITING_FOR_LEADER_TO_START;
    public static final  /* enum */ w REACHED_MIDDLE_LEVEL;

    static {
        w.var3();
        w.var4();
        WAITING_FOR_LEADER_TO_START = new GameEnum7();
        EXPLORING_UPPER_LEVEL = new GameEnum7();
        REACHED_MIDDLE_LEVEL = new GameEnum7();
        REACHED_LOWER_LEVEL = new GameEnum7();
        REACHED_BOTTOM = new GameEnum7();
        GET_OUT = new GameEnum7();
        w[] wArray = new w[6];
        wArray[0] = WAITING_FOR_LEADER_TO_START;
        wArray[1] = EXPLORING_UPPER_LEVEL;
        wArray[2] = REACHED_MIDDLE_LEVEL;
        wArray[3] = REACHED_LOWER_LEVEL;
        wArray[4] = REACHED_BOTTOM;
        wArray[5] = GET_OUT;
        $VALUES = wArray;
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
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
            if null == null continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }
}

