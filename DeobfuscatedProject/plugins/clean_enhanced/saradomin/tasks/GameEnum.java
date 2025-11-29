/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.saradomin.tasks;

import net.runelite.api.Prayer;

public final class GameEnum
extends Enum<i> {
    
    public static final  /* enum */ i RIGOUR;
    
    private static final  i[] $VALUES;
    public static final  /* enum */ i EAGLE_EYE;
    private final  Prayer[] prayers;

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

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public Prayer[] z() {
        return this.prayers;
    }

    static {
        i.var15();
        i.var16();
        Prayer[] prayerArray = new Prayer[var2[1]];
        prayerArray[i.var2[0]] = Prayer.RIGOUR;
        RIGOUR = new GameEnum(prayerArray);
        Prayer[] prayerArray2 = new Prayer[var2[2]];
        prayerArray2[i.var2[0]] = Prayer.EAGLE_EYE;
        prayerArray2[i.var2[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new GameEnum(prayerArray2);
        i[] iArray = new i[var2[2]];
        iArray[i.var2[0]] = RIGOUR;
        iArray[i.var2[1]] = EAGLE_EYE;
        $VALUES = iArray;
    }

    private static void var16() {
        var1 = new String[var2[2]];
        i.var1[i.var2[0]] = "RIGOUR";
        i.var1[i.var2[1]] = "EAGLE_EYE";
    }

    private static void var15() {
        var2 = new int[4];
        i.var2[0] = (44 + 138 - 169 + 155 ^ 110 + 27 - 130 + 144) & (6 ^ 0x12 ^ (0x4F ^ 0x64) ^ -1);
        i.var2[1] = 1;
        i.var2[2] = 2;
        i.var2[3] = 0x2A ^ 0x22;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private GameEnum(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }
}

