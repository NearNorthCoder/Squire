/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

public final class GameEnum9
extends Enum<F> {
    private static final  F[] $VALUES;
    private final  int personalItemCapacity;
    public static final  /* enum */ F LARGE;
    public static final  /* enum */ F MEDIUM;
    public static final  /* enum */ F TINY;
    private final  int raidItemCapacity;
    public static final  /* enum */ F MASSIVE;

    public static final  /* enum */ F SMALL;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum9(int n3, int n4) {
        this.personalItemCapacity = n3;
        this.raidItemCapacity = n4;
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    static {
        F.var15();
        F.var16();
        TINY = new GameEnum9(1);
        SMALL = new GameEnum9(3, 4);
        MEDIUM = new GameEnum9(6, 7);
        LARGE = new GameEnum9(9, var2[10]);
        MASSIVE = new GameEnum9(var2[12], var2[13]);
        F[] fArray = new F[var2[14]];
        fArray[0] = TINY;
        fArray[2] = SMALL;
        fArray[5] = MEDIUM;
        fArray[8] = LARGE;
        fArray[F.var2[11]] = MASSIVE;
        $VALUES = fArray;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 0;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 0;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public int bM() {
        return this.raidItemCapacity;
    }

    private GameEnum9(int n3) {
        this(n3, 0);
    }

    public static F valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    public int bL() {
        return this.personalItemCapacity;
    }
}

