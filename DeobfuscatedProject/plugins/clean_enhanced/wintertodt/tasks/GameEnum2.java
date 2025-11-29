/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.wintertodt.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum2
extends Enum<a> {
    public static final  /* enum */ a WEST;
    private final  WorldPoint brazierStand;
    private static final  a[] $VALUES;
    
    public static final  /* enum */ a EAST;
    
    private final  WorldPoint treeStand;

    private GameEnum2(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.brazierStand = worldPoint2;
        this.treeStand = worldPoint;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    static {
        a.var9();
        a.var10();
        WEST = new GameEnum2(new WorldPoint(1, 2, 0), new WorldPoint(1, 3, 0));
        EAST = new GameEnum2(new WorldPoint(5, 2, 0), new WorldPoint(5, 3, 0));
        a[] aArray = new a[6];
        aArray[0] = WEST;
        aArray[4] = EAST;
        $VALUES = aArray;
    }

    public WorldPoint b() {
        return this.brazierStand;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public WorldPoint c() {
        return this.treeStand;
    }
}

