/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.combat.tasks;

public final class GameEnum2
extends Enum<c> {
    
    private static final  c[] $VALUES;
    public static final  /* enum */ c RANGE;
    public static final  /* enum */ c MAGIC;
    public static final  /* enum */ c MELEE;

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    static {
        c.var15();
        c.var16();
        MELEE = new GameEnum2();
        MAGIC = new GameEnum2();
        RANGE = new GameEnum2();
        c[] cArray = new c[3];
        cArray[0] = MELEE;
        cArray[1] = MAGIC;
        cArray[2] = RANGE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }
}

