/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.charters.tasks;

public final class GameEnum
extends Enum<b> {
    
    private static final  b[] $VALUES;
    
    public static final  /* enum */ b CHARTER_SHIPS;

    static {
        b.var3();
        b.var4();
        CHARTER_SHIPS = new GameEnum();
        b[] bArray = new b[1];
        bArray[0] = CHARTER_SHIPS;
        $VALUES = bArray;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

