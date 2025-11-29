/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

public final class GameEnum19
extends Enum<h> {
    
    public static final  /* enum */ h SPECIAL_2;
    public static final  /* enum */ h SPECIAL_1;
    public static final  /* enum */ h NONE;
    
    private static final  h[] $VALUES;

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

    static {
        h.var3();
        h.var4();
        SPECIAL_1 = new GameEnum19();
        SPECIAL_2 = new GameEnum19();
        NONE = new GameEnum19();
        h[] hArray = new h[var2[3]];
        hArray[h.var2[0]] = SPECIAL_1;
        hArray[h.var2[1]] = SPECIAL_2;
        hArray[h.var2[2]] = NONE;
        $VALUES = hArray;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void var3() {
        var2 = new int[5];
        h.var2[0] = (0x49 ^ 0x1F ^ (0xDC ^ 0xBF)) & (0x97 ^ 0xA1 ^ 3 ^ -1);
        h.var2[1] = 1;
        h.var2[2] = 2;
        h.var2[3] = 3;
        h.var2[4] = 0xA1 ^ 0xA9;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        h.var1[h.var2[0]] = "SPECIAL_1";
        h.var1[h.var2[1]] = "SPECIAL_2";
        h.var1[h.var2[2]] = "NONE";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }
}

