/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mining.tasks;

import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum6
extends Enum<e> {
    private final  WorldPoint[] rocks;
    private final  Point standing;
    public static final  /* enum */ e WEST_FOUR;

    public static final  /* enum */ e WEST_TWO;
    private static final  e[] $VALUES;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.var4();
        e.var5();
        WorldPoint[] worldPointArray = new WorldPoint[var2[4]];
        worldPointArray[e.var2[0]] = new WorldPoint(var2[5], var2[6], var2[0]);
        worldPointArray[e.var2[1]] = new WorldPoint(var2[7], var2[6], var2[0]);
        worldPointArray[e.var2[8]] = new WorldPoint(var2[9], var2[3], var2[0]);
        worldPointArray[e.var2[10]] = new WorldPoint(var2[9], var2[11], var2[0]);
        WEST_FOUR = new GameEnum6(new Point(var2[2], var2[3]), worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[var2[8]];
        worldPointArray2[e.var2[0]] = new WorldPoint(var2[9], var2[3], var2[0]);
        worldPointArray2[e.var2[1]] = new WorldPoint(var2[2], var2[11], var2[0]);
        WEST_TWO = new GameEnum6(new Point(var2[12], var2[3]), worldPointArray2);
        e[] eArray = new e[var2[8]];
        eArray[e.var2[0]] = WEST_FOUR;
        eArray[e.var2[1]] = WEST_TWO;
        $VALUES = eArray;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        void var12;
        WorldPoint[] worldPointArray = this.rocks;
        int n2 = worldPointArray.length;
        int var13 = var2[0];
        while (e.var3(var13, (int)var12)) {
            void var14;
            void var15;
            void var16 = var15[var13];
            if (e.var17(var16.equals((Object)var14) ? 1 : 0)) {
                return var2[1];
            }
            ++var13;
            0;
            if null == null continue;
            return ((170 + 0 - 38 + 40 ^ 45 + 116 - 139 + 139) & (38 + 176 - 80 + 56 ^ 43 + 110 - 109 + 135 ^ -1)) != 0;
        }
        return var2[0];
    }

    public WorldPoint d() {
        return new WorldPoint(this.standing.getX(), this.standing.getY(), var2[0]);
    }

    private static void var5() {
        var1 = new String[var2[8]];
        e.var1[e.var2[0]] = "WEST_FOUR";
        e.var1[e.var2[1]] = "WEST_TWO";
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    public WorldPoint[] GameEnum6() {
        return this.rocks;
    }

    private GameEnum6(Point point, WorldPoint ... worldPointArray) {
        this.standing = point;
        this.rocks = worldPointArray;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void var4() {
        var2 = new int[13];
        e.var2[0] = (0x1F ^ 0xA ^ (0x1F ^ 0x36)) & (0x83 ^ 0xC4 ^ (0xD2 ^ 0xA9) ^ -1);
        e.var2[1] = 1;
        e.var2[2] = 0xFFFFDC5B & 0x2FFF;
        e.var2[3] = -(0xFFFFF6BF & 0x5DCE) & (0xFFFFFFEF & 0x5FFF);
        e.var2[4] = 0xA9 ^ 0xAD;
        e.var2[5] = 0xFFFFBF7F & 0x4CDF;
        e.var2[6] = 0xFFFFBB77 & 0x4FE9;
        e.var2[7] = -(0xFFFFED27 & 0x72DA) & (0xFFFFFF7F & 0x6CDF);
        e.var2[8] = 2;
        e.var2[9] = 0xFFFF8DFF & 0x7E5C;
        e.var2[10] = 3;
        e.var2[11] = 0xFFFFCB63 & 0x3FFF;
        e.var2[12] = 0xFFFFDFDD & 0x2C7F;
    }
}

