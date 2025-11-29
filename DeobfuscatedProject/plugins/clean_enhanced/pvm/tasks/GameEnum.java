/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.Area
 *  net.unethicalite.api.coords.RectangularArea
 */
package gg.squire.pvm.tasks;

import java.util.List;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.Area;
import net.unethicalite.api.coords.RectangularArea;
import gg.squire.pvm.tasks.PvmManager;

public final class GameEnum
extends Enum<g> {
    private final  Area area;
    
    private final  List<WorldPoint> safeSpots;
    public static final  /* enum */ g FIRST_ROOM;
    private final  WorldPoint origin;
    private static final  g[] $VALUES;
    
    private final  WorldPoint center;

    public Area x() {
        return this.area;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void var3() {
        var2 = new String[var1[6]];
        g.var2[g.var1[0]] = "FIRST_ROOM";
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var1 = new int[16];
        g.var1[0] = (0x5A ^ 4) & ~(0xC7 ^ 0x99);
        g.var1[1] = -(0xFFFFFEE3 & 0x5BDF) & (0xFFFFFFEB & 0x5FDF);
        g.var1[2] = -(0xFFFFDCEE & 0x3B13) & (0xFFFFFFFF & 0x3F75);
        g.var1[3] = -(0xFFFFB5C7 & 0x5AFF) & (0xFFFF97D6 & 0x7DFF);
        g.var1[4] = -(0xFFFFE8EF & 0x1F11) & (0xFFFFEF7F & 0x3FED);
        g.var1[5] = 0x16 ^ 0x34 ^ (0xA3 ^ 0x8B);
        g.var1[6] = 1;
        g.var1[7] = 2;
        g.var1[8] = 3;
        g.var1[9] = 0 ^ 4;
        g.var1[10] = 0x78 ^ 0x7D;
        g.var1[11] = -1;
        g.var1[12] = 0x94 ^ 0xA8 ^ (0x6C ^ 0x56);
        g.var1[13] = 0xA1 ^ 0xA6;
        g.var1[14] = 112 + 198 - 222 + 119 ^ 132 + 118 - 65 + 14;
        g.var1[15] = 0xB1 ^ 0x87 ^ (0xFA ^ 0xC5);
    }

    public WorldPoint A() {
        return this.center;
    }

    public WorldPoint y() {
        return this.origin;
    }

    static {
        g.var10();
        g.var3();
        WorldPoint[] worldPointArray = new WorldPoint[var1[5]];
        worldPointArray[g.var1[0]] = c.D.dy(var1[6]);
        worldPointArray[g.var1[6]] = c.D.dy(var1[7]);
        worldPointArray[g.var1[7]] = c.D.dy(var1[8]);
        worldPointArray[g.var1[8]] = c.D.dy(var1[9]);
        worldPointArray[g.var1[9]] = c.D.dy(var1[10]);
        worldPointArray[g.var1[10]] = c.D.dy(var1[11]).dx(var1[7]);
        worldPointArray[g.var1[12]] = c.D.dy(var1[11]).dx(var1[8]);
        worldPointArray[g.var1[13]] = c.D.dy(var1[11]).dx(var1[9]);
        worldPointArray[g.var1[14]] = c.D.dy(var1[11]).dx(var1[10]);
        worldPointArray[g.var1[15]] = c.D.dy(var1[11]).dx(var1[12]);
        FIRST_ROOM = new GameEnum((Area)new RectangularArea(var1[1], var1[2], var1[3], var1[4], var1[0]), c.D, Arrays.asList(worldPointArray), c.G);
        g[] gArray = new g[var1[6]];
        gArray[g.var1[0]] = FIRST_ROOM;
        $VALUES = gArray;
    }

    private GameEnum(Area area, WorldPoint worldPoint, List<WorldPoint> list, WorldPoint worldPoint2) {
        this.area = area;
        this.origin = worldPoint;
        this.safeSpots = list;
        this.center = worldPoint2;
    }

    public List<WorldPoint> z() {
        return this.safeSpots;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }
}

