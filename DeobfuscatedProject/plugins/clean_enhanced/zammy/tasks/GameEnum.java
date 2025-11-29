/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zammy.tasks;

import net.runelite.api.Prayer;

public final class GameEnum
extends Enum<b> {
    
    private static final  b[] $VALUES;
    private final  Prayer[] prayers;
    
    public static final  /* enum */ b EAGLE_EYE;
    public static final  /* enum */ b RIGOUR;

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

    private GameEnum(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public Prayer[] a() {
        return this.prayers;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    static {
        b.var15();
        b.var16();
        Prayer[] prayerArray = new Prayer[1];
        prayerArray[0] = Prayer.RIGOUR;
        RIGOUR = new GameEnum(prayerArray);
        Prayer[] prayerArray2 = new Prayer[2];
        prayerArray2[0] = Prayer.EAGLE_EYE;
        prayerArray2[1] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new GameEnum(prayerArray2);
        b[] bArray = new b[2];
        bArray[0] = RIGOUR;
        bArray[1] = EAGLE_EYE;
        $VALUES = bArray;
    }
}

