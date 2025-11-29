/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

public final class GameEnum11
extends Enum<C> {

    public static final  /* enum */ C ACID;
    private final  int ticks;
    public static final  /* enum */ C TELEPORT;
    private static final  C[] $VALUES;
    public static final  /* enum */ C BURN;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    static {
        C.var9();
        C.var10();
        BURN = new GameEnum11(1);
        ACID = new GameEnum11(3);
        TELEPORT = new GameEnum11(5);
        C[] cArray = new C[6];
        cArray[0] = BURN;
        cArray[2] = ACID;
        cArray[4] = TELEPORT;
        $VALUES = cArray;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public int bB() {
        return this.ticks;
    }

    public static C valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    private GameEnum11(int n3) {
        this.ticks = n3;
    }
}

