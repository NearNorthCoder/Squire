/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mining.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum2
extends Enum<i> {
    private final  WorldPoint location;
    public static final  /* enum */ i LUMBRIDGE;
    private static final  i[] $VALUES;

    private static void var3() {
        var2 = new String[var1[3]];
        i.var2[i.var1[0]] = "LUMBRIDGE";
    }

    private static void var4() {
        var1 = new int[5];
        i.var1[0] = (93 + 191 - 211 + 180 ^ 16 + 176 - 30 + 15) & (230 + 115 - 246 + 139 ^ 6 + 81 - 62 + 137 ^ -1);
        i.var1[1] = 0xFFFFDFBF & 0x2CDD;
        i.var1[2] = 0xFFFFAE4F & 0x5DFB;
        i.var1[3] = 1;
        i.var1[4] = 2;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private GameEnum2(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public WorldPoint GameEnum2() {
        return this.location;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        i.var4();
        i.var3();
        LUMBRIDGE = new GameEnum2(new WorldPoint(var1[1], var1[2], var1[0]));
        i[] iArray = new i[var1[3]];
        iArray[i.var1[0]] = LUMBRIDGE;
        $VALUES = iArray;
    }
}

