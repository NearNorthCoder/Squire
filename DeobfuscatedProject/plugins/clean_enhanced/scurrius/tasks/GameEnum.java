/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.scurrius.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum
extends Enum<c> {
    private final  int regionId;
    private final  WorldPoint location;
    
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c VARROCK_EAST;

    private static void var3() {
        var2 = new String[var1[4]];
        c.var2[c.var1[0]] = "VARROCK_EAST";
    }

    private static void var4() {
        var1 = new int[6];
        c.var1[0] = (0xC4 ^ 0x95) & ~(0x3C ^ 0x6D);
        c.var1[1] = -(0xFFFFBFE9 & 0x44D7) & (0xFFFFBFF5 & 0x76FF);
        c.var1[2] = -(0xFFFF9017 & 0x7FEB) & (0xFFFF9FBF & 0x7CF7);
        c.var1[3] = 0xFFFFDF7C & 0x2DDF;
        c.var1[4] = 1;
        c.var1[5] = 2;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public WorldPoint r() {
        return this.location;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    public int q() {
        return this.regionId;
    }

    static {
        c.var4();
        c.var3();
        VARROCK_EAST = new GameEnum(var1[1], new WorldPoint(var1[2], var1[3], var1[0]));
        c[] cArray = new c[var1[4]];
        cArray[c.var1[0]] = VARROCK_EAST;
        $VALUES = cArray;
    }
}

