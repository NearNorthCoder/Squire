/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.whisperer.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum2
extends Enum<e> {
    public static final  /* enum */ e FEROX_ENCLAVE;
    private final  int regionId;
    public static final  /* enum */ e VARROCK_WEST;
    
    private final  WorldPoint location;
    public static final  /* enum */ e CASTLE_WARS;
    public static final  /* enum */ e FALADOR_WEST;
    
    public static final  /* enum */ e EDGEVILLE;
    public static final  /* enum */ e GRAND_EXCHANGE;
    private static final  e[] $VALUES;

    private GameEnum2(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    static {
        e.var3();
        e.var4();
        GRAND_EXCHANGE = new GameEnum2(1, new WorldPoint(2, 3, 0));
        FEROX_ENCLAVE = new GameEnum2(5, new WorldPoint(6, 7, 0));
        EDGEVILLE = new GameEnum2(9, new WorldPoint(var1[10], var1[11], 0));
        VARROCK_WEST = new GameEnum2(var1[13], new WorldPoint(var1[14], var1[15], 0));
        FALADOR_WEST = new GameEnum2(var1[17], new WorldPoint(var1[18], var1[19], 0));
        CASTLE_WARS = new GameEnum2(var1[21], new WorldPoint(var1[22], var1[23], 0));
        e[] eArray = new e[var1[24]];
        eArray[0] = GRAND_EXCHANGE;
        eArray[4] = FEROX_ENCLAVE;
        eArray[8] = EDGEVILLE;
        eArray[e.var1[12]] = VARROCK_WEST;
        eArray[e.var1[16]] = FALADOR_WEST;
        eArray[e.var1[20]] = CASTLE_WARS;
        $VALUES = eArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public WorldPoint m() {
        return this.location;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if ((0x28 ^ 0x2C) != 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public int d() {
        return this.regionId;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

