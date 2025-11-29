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

public final class GameEnum4
extends Enum<c> {
    private static final  c[] $VALUES;
    public static final  /* enum */ c SOUTH_FOUR;
    
    private final  Point standing;
    private final  WorldPoint[] rocks;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void var3() {
        var2 = new int[12];
        c.var2[0] = (0x4E ^ 0x5C) & ~(0x61 ^ 0x73);
        c.var2[1] = 1;
        c.var2[2] = -(0xFFFFFB9A & 0x67E7) & (0xFFFFEFDF & Short.MAX_VALUE);
        c.var2[3] = 0xFFFFBF5F & 0x4BFE;
        c.var2[4] = 0xE5 ^ 0xC2 ^ (0x7C ^ 0x5F);
        c.var2[5] = 0xFFFFBCDD & 0x4F7F;
        c.var2[6] = 0xFFFF9FFC & 0x6B5F;
        c.var2[7] = 0xFFFFCFFF & 0x3B5D;
        c.var2[8] = 2;
        c.var2[9] = 3;
        c.var2[10] = 0xFFFF9EFF & 0x6D5F;
        c.var2[11] = 0xFFFFABFF & 0x5F5F;
    }

    static {
        c.var3();
        c.var4();
        WorldPoint[] worldPointArray = new WorldPoint[var2[4]];
        worldPointArray[c.var2[0]] = new WorldPoint(var2[5], var2[6], var2[0]);
        worldPointArray[c.var2[1]] = new WorldPoint(var2[5], var2[7], var2[0]);
        worldPointArray[c.var2[8]] = new WorldPoint(var2[5], var2[3], var2[0]);
        worldPointArray[c.var2[9]] = new WorldPoint(var2[10], var2[11], var2[0]);
        SOUTH_FOUR = new GameEnum4(new Point(var2[2], var2[3]), worldPointArray);
        c[] cArray = new c[var2[1]];
        cArray[c.var2[0]] = SOUTH_FOUR;
        $VALUES = cArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private static void var4() {
        var1 = new String[var2[1]];
        c.var1[c.var2[0]] = "SOUTH_FOUR";
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private GameEnum4(Point point, WorldPoint ... worldPointArray) {
        this.standing = point;
        this.rocks = worldPointArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        void var12;
        WorldPoint[] worldPointArray = this.rocks;
        int n2 = worldPointArray.length;
        int var13 = var2[0];
        while (c.var14(var13, (int)var12)) {
            void var15;
            void var16;
            void var17 = var16[var13];
            if (c.var11(var17.equals((Object)var15) ? 1 : 0)) {
                return var2[1];
            }
            ++var13;
            0;
            if ((0x75 ^ 0x70) != 0) continue;
            return ((0x60 ^ 0x37) & ~(0xEA ^ 0xBD)) != 0;
        }
        return var2[0];
    }

    public WorldPoint[] e() {
        return this.rocks;
    }

    public WorldPoint d() {
        return new WorldPoint(this.standing.getX(), this.standing.getY(), var2[0]);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }
}

