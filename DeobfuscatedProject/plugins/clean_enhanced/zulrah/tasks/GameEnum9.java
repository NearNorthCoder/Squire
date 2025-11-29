/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

public final class GameEnum9
extends Enum<c> {
    public static final  /* enum */ c DONE;
    public static final  /* enum */ c TRANSPORTING_ZULRAH;
    public static final  /* enum */ c BANKING;
    private static final  c[] $VALUES;
    public static final  /* enum */ c COLLECTING_ZULRAH;

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

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    static {
        c.var19();
        c.var20();
        BANKING = new GameEnum9();
        TRANSPORTING_ZULRAH = new GameEnum9();
        COLLECTING_ZULRAH = new GameEnum9();
        DONE = new GameEnum9();
        c[] cArray = new c[4];
        cArray[0] = BANKING;
        cArray[1] = TRANSPORTING_ZULRAH;
        cArray[2] = COLLECTING_ZULRAH;
        cArray[3] = DONE;
        $VALUES = cArray;
    }

}

