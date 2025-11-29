/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.farmer.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum20
extends Enum<E> {
    private final  WorldPoint location;
    private final  String name;
    public static final  /* enum */ E MEADOW_NORTH;
    
    private static final  E[] $VALUES;
    public static final  /* enum */ E VALLEY_NORTH;
    private final  int varp;
    public static final  /* enum */ E MEADOW_SOUTH;
    
    public static final  /* enum */ E VALLEY_SOUTH;

    public static E valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public static E[] values() {
        return (E[])$VALUES.clone();
    }

    private GameEnum20(String string2, int n3, WorldPoint worldPoint) {
        this.name = string2;
        this.varp = n3;
        this.location = worldPoint;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public int ax() {
        return this.varp;
    }

    static {
        E.var25();
        E.var26();
        MEADOW_NORTH = new GameEnum20(var1[1], 2, new WorldPoint(3, 4, 0));
        MEADOW_SOUTH = new GameEnum20(var1[6], 7, new WorldPoint(8, 9, 0));
        VALLEY_NORTH = new GameEnum20(var1[var2[11]], var2[12], new WorldPoint(var2[13], var2[14], 0));
        VALLEY_SOUTH = new GameEnum20(var1[var2[16]], var2[17], new WorldPoint(var2[18], var2[19], 0));
        E[] eArray = new E[var2[10]];
        eArray[0] = MEADOW_NORTH;
        eArray[1] = MEADOW_SOUTH;
        eArray[5] = VALLEY_NORTH;
        eArray[6] = VALLEY_SOUTH;
        $VALUES = eArray;
    }

    public String ac() {
        return this.name;
    }

    public WorldPoint az() {
        return this.location;
    }

}

