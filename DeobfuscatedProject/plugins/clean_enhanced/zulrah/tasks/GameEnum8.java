/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zulrah.tasks;

import net.runelite.api.Prayer;

public final class GameEnum8
extends Enum<j> {
    public static final  /* enum */ j EAGLE_EYE;
    public static final  /* enum */ j RIGOUR;
    
    private final  Prayer prayer;
    private static final  j[] $VALUES;

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

    private GameEnum8(Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        j.var13();
        j.var14();
        EAGLE_EYE = new GameEnum8(Prayer.EAGLE_EYE);
        RIGOUR = new GameEnum8(Prayer.RIGOUR);
        j[] jArray = new j[2];
        jArray[0] = EAGLE_EYE;
        jArray[1] = RIGOUR;
        $VALUES = jArray;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public Prayer r() {
        return this.prayer;
    }
}

