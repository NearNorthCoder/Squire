/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.duke.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum2
extends Enum<d> {
    private static final  d[] $VALUES;
    public static final  /* enum */ d FALADOR_WEST;
    private final  WorldPoint location;
    
    public static final  /* enum */ d CASTLE_WARS;
    
    public static final  /* enum */ d GRAND_EXCHANGE;
    private final  int regionId;
    public static final  /* enum */ d VARROCK_WEST;

    private GameEnum2(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    public int G() {
        return this.regionId;
    }

    public WorldPoint H() {
        return this.location;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        d.var9();
        d.var10();
        GRAND_EXCHANGE = new GameEnum2(1, new WorldPoint(2, 3, 0));
        VARROCK_WEST = new GameEnum2(5, new WorldPoint(6, 7, 0));
        FALADOR_WEST = new GameEnum2(9, new WorldPoint(var2[10], var2[11], 0));
        CASTLE_WARS = new GameEnum2(var2[13], new WorldPoint(var2[14], var2[15], 0));
        d[] dArray = new d[var2[16]];
        dArray[0] = GRAND_EXCHANGE;
        dArray[4] = VARROCK_WEST;
        dArray[8] = FALADOR_WEST;
        dArray[d.var2[12]] = CASTLE_WARS;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

