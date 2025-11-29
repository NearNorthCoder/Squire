/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum16
extends Enum<F> {
    private static final  F[] $VALUES;

    public static final  /* enum */ F STATUE_8_DOUBLE;
    public static final  /* enum */ F STATUE_BLUE_DOUBLE;
    public static final  /* enum */ F STATUE_6_DOUBLE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        F.var9();
        F.var10();
        STATUE_6_DOUBLE = new GameEnum16();
        STATUE_8_DOUBLE = new GameEnum16();
        STATUE_BLUE_DOUBLE = new GameEnum16();
        F[] fArray = new F[var2[3]];
        fArray[F.var2[0]] = STATUE_6_DOUBLE;
        fArray[F.var2[1]] = STATUE_8_DOUBLE;
        fArray[F.var2[2]] = STATUE_BLUE_DOUBLE;
        $VALUES = fArray;
    }

    private static void var10() {
        var1 = new String[var2[3]];
        F.var1[F.var2[0]] = "STATUE_6_DOUBLE";
        F.var1[F.var2[1]] = "STATUE_8_DOUBLE";
        F.var1[F.var2[2]] = "STATUE_BLUE_DOUBLE";
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    private static void var9() {
        var2 = new int[4];
        F.var2[0] = (0x3F ^ 0x1A) & ~(0x61 ^ 0x44);
        F.var2[1] = 1;
        F.var2[2] = 2;
        F.var2[3] = 3;
    }

    public static F valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }
}

