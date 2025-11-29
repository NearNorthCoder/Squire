/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vorkath.tasks;

public final class GameEnum2
extends Enum<j> {
    
    public static final  /* enum */ j FREEZE;
    public static final  /* enum */ j FIRE_BALLS;
    public static final  /* enum */ j NONE;
    private static final  j[] $VALUES;

    private static void var3() {
        var2 = new int[5];
        j.var2[0] = (0x8E ^ 0xA2 ^ (0x49 ^ 0x2A)) & (0x99 ^ 0x81 ^ (0x7D ^ 0x2A) ^ -1);
        j.var2[1] = 1;
        j.var2[2] = 2;
        j.var2[3] = 3;
        j.var2[4] = 0x1E ^ 0x16;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        j.var1[j.var2[0]] = "NONE";
        j.var1[j.var2[1]] = "FIRE_BALLS";
        j.var1[j.var2[2]] = "FREEZE";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        j.var3();
        j.var4();
        NONE = new GameEnum2();
        FIRE_BALLS = new GameEnum2();
        FREEZE = new GameEnum2();
        j[] jArray = new j[var2[3]];
        jArray[j.var2[0]] = NONE;
        jArray[j.var2[1]] = FIRE_BALLS;
        jArray[j.var2[2]] = FREEZE;
        $VALUES = jArray;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

