/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum13
extends Enum<w> {
     String name;
    
    public static final  /* enum */ w NONE;
    private static final  w[] $VALUES;
    public static final  /* enum */ w HALLOWED_HAMMER;
    
    public static final  /* enum */ w HAMMER;

    private static void var3() {
        var2 = new String[var1[6]];
        w.var2[w.var1[0]] = "NONE";
        w.var2[w.var1[1]] = w.var4("PjL+8IStxZs=", "AlLse");
        w.var2[w.var1[2]] = "HAMMER";
        w.var2[w.var1[3]] = "Hammer";
        w.var2[w.var1[4]] = "HALLOWED_HAMMER";
        w.var2[w.var1[5]] = "Hallowed hammer";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        w.var11();
        w.var3();
        NONE = new GameEnum13(var2[var1[1]]);
        HAMMER = new GameEnum13(var2[var1[3]]);
        HALLOWED_HAMMER = new GameEnum13(var2[var1[5]]);
        w[] wArray = new w[var1[3]];
        wArray[w.var1[0]] = NONE;
        wArray[w.var1[1]] = HAMMER;
        wArray[w.var1[2]] = HALLOWED_HAMMER;
        $VALUES = wArray;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    private GameEnum13(String string2) {
        this.name = string2;
    }

    private static void var11() {
        var1 = new int[8];
        w.var1[0] = (0xEF ^ 0xB4) & ~(0x49 ^ 0x12);
        w.var1[1] = 1;
        w.var1[2] = 2;
        w.var1[3] = 3;
        w.var1[4] = 0x80 ^ 0x84;
        w.var1[5] = 0xC6 ^ 0xC3;
        w.var1[6] = 0x4E ^ 0x48;
        w.var1[7] = 0x7C ^ 0x74;
    }
}

