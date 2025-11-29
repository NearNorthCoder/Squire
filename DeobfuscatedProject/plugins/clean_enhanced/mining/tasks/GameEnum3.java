/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.mining.tasks;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

public final class GameEnum3
extends Enum<g> {
    private final  WorldPoint location;
    public static final  /* enum */ g EAST;
    
    public static final  /* enum */ g NORTH;
    private final  WorldPoint m2;
    
    private final  WorldPoint m1;
    private static final  g[] $VALUES;
    public static final  /* enum */ g SOUTH_2;
    public static final  /* enum */ g SOUTH_1;

    static {
        g.var3();
        g.var4();
        NORTH = new GameEnum3(new WorldPoint(var2[3], var2[4], var2[5]), new WorldPoint(var2[3], var2[6], var2[5]), new WorldPoint(var2[7], var2[6], var2[5]));
        EAST = new GameEnum3(new WorldPoint(var2[8], var2[9], var2[5]), new WorldPoint(var2[10], var2[11], var2[5]), new WorldPoint(var2[10], var2[12], var2[5]));
        SOUTH_1 = new GameEnum3(new WorldPoint(var2[13], var2[14], var2[5]), new WorldPoint(var2[13], var2[15], var2[5]), new WorldPoint(var2[16], var2[15], var2[5]));
        SOUTH_2 = new GameEnum3(new WorldPoint(var2[13], var2[14], var2[5]), new WorldPoint(var2[3], var2[14], var2[5]), new WorldPoint(var2[3], var2[18], var2[5]));
        g[] gArray = new g[var2[19]];
        gArray[g.var2[2]] = NORTH;
        gArray[g.var2[1]] = EAST;
        gArray[g.var2[5]] = SOUTH_1;
        gArray[g.var2[17]] = SOUTH_2;
        $VALUES = gArray;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public static TileObject h() {
        int n2 = var2[0];
        int[] nArray = new int[var2[1]];
        nArray[g.var2[2]] = var2[0];
        return TileObjects.getNearest((int[])nArray);
    }

    public WorldPoint j() {
        return this.m1;
    }

    public WorldPoint k() {
        return this.m2;
    }

    private static void var3() {
        var2 = new int[21];
        g.var2[0] = 0xFFFF9AFF & 0xFDB7;
        g.var2[1] = 1;
        g.var2[2] = (91 + 115 - 135 + 101 ^ 76 + 176 - 219 + 148) & (113 + 61 - 152 + 127 ^ 104 + 96 - 151 + 91 ^ -1);
        g.var2[3] = -(0xFFFFF7AE & 0x3957) & (0xFFFFBFDF & 0x7F7F);
        g.var2[4] = -(0xFFFFD7BB & 0x69CD) & (0xFFFFE7BF & 0x7FED);
        g.var2[5] = 2;
        g.var2[6] = -(138 + 52 - 112 + 62) & (0xFFFFBFFF & 0x66AF);
        g.var2[7] = 0xFFFFCE5B & 0x3FFF;
        g.var2[8] = -(0xFFFFAB8D & 0x74F3) & (0xFFFFBFEF & 0x6EF7);
        g.var2[9] = 0xFFFFFE1F & 0x27FB;
        g.var2[10] = -(0xFFFFF98A & 0x17FF) & (0xFFFF9FFF & 0x7FEF);
        g.var2[11] = 0xFFFFB77D & 0x6E9F;
        g.var2[12] = 0xFFFFAEDC & 0x773F;
        g.var2[13] = -(0xFFFFFFFB & 0x512D) & (0xFFFFDFFF & 0x7F7F);
        g.var2[14] = 0xFFFFF737 & 0x2EDE;
        g.var2[15] = 0xFFFFBF99 & 0x667F;
        g.var2[16] = 0xFFFFDF59 & 0x2EFE;
        g.var2[17] = 3;
        g.var2[18] = 0xFFFFF697 & 0x2F7F;
        g.var2[19] = 0x61 ^ 0x31 ^ (0xD ^ 0x59);
        g.var2[20] = 0x3A ^ 0x28 ^ (0x71 ^ 0x6B);
    }

    private GameEnum3(WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.location = worldPoint;
        this.m1 = worldPoint2;
        this.m2 = worldPoint3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public WorldPoint i() {
        return this.location;
    }

    private static void var4() {
        var1 = new String[var2[19]];
        g.var1[g.var2[2]] = "NORTH";
        g.var1[g.var2[1]] = "EAST";
        g.var1[g.var2[5]] = "SOUTH_1";
        g.var1[g.var2[17]] = "SOUTH_2";
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }
}

