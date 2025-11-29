/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hunter.tasks;

public final class GameEnum4
extends Enum<e> {
    public static final  /* enum */ e PITFALL;
    public static final  /* enum */ e BIRDS;
    private static final  e[] $VALUES;
    
    public static final  /* enum */ e FALCONRY;
    
    public static final  /* enum */ e SALLIES;
    public static final  /* enum */ e CHINS;

    static {
        e.var3();
        e.var4();
        BIRDS = new GameEnum4();
        SALLIES = new GameEnum4();
        FALCONRY = new GameEnum4();
        CHINS = new GameEnum4();
        PITFALL = new GameEnum4();
        e[] eArray = new e[var2[5]];
        eArray[e.var2[0]] = BIRDS;
        eArray[e.var2[1]] = SALLIES;
        eArray[e.var2[2]] = FALCONRY;
        eArray[e.var2[3]] = CHINS;
        eArray[e.var2[4]] = PITFALL;
        $VALUES = eArray;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
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

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void var4() {
        var1 = new String[var2[5]];
        e.var1[e.var2[0]] = "BIRDS";
        e.var1[e.var2[1]] = "SALLIES";
        e.var1[e.var2[2]] = "FALCONRY";
        e.var1[e.var2[3]] = "CHINS";
        e.var1[e.var2[4]] = "PITFALL";
    }

    private static void var3() {
        var2 = new int[7];
        e.var2[0] = (0x37 ^ 3) & ~(0x17 ^ 0x23);
        e.var2[1] = 1;
        e.var2[2] = 2;
        e.var2[3] = 3;
        e.var2[4] = 0x37 ^ 0x33;
        e.var2[5] = 0x12 ^ 0x17;
        e.var2[6] = 0xD4 ^ 0x95 ^ (0xEA ^ 0xA3);
    }
}

