/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mining.tasks;

import java.util.List;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum7
extends Enum<d> {
    private final  WorldPoint[] points;
    
    private static final  d[] $VALUES;
    public static final  /* enum */ d UPPER_FLOOR;
    
    public static final  /* enum */ d SOUTH_WEST;

    private GameEnum7(WorldPoint ... worldPointArray) {
        this.points = worldPointArray;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[41];
        d.var1[0] = (4 + 116 - 96 + 136 ^ 143 + 47 - 65 + 63) & (0x54 ^ 0x30 ^ (0x35 ^ 0x4D) ^ -1);
        d.var1[1] = 98 + 16 - 40 + 66 ^ 127 + 121 - 213 + 99;
        d.var1[2] = -(0x30 ^ 0x65) & (0xFFFFBEFF & 0x4FFF);
        d.var1[3] = -(0xFFFFE9EF & 0x77D3) & (0xFFFFF7FF & 0x7FEF);
        d.var1[4] = 1;
        d.var1[5] = -(0xFFFFFD75 & 0x63DB) & (0xFFFFFFFB & 0x6FFE);
        d.var1[6] = -(0xFFFFCEDE & 0x79F3) & (0xFFFFDFFF & 0x7EFF);
        d.var1[7] = 2;
        d.var1[8] = 0xFFFF9FFD & 0x6EAB;
        d.var1[9] = 0xFFFFFE75 & 0x17BA;
        d.var1[10] = 3;
        d.var1[11] = 0x79 ^ 0x7D;
        d.var1[12] = -(0xFFFFFF5F & 0x70F7) & (0xFFFFFEFF & 0x7FFE);
        d.var1[13] = 0xFFFFF7F6 & 0x1E3D;
        d.var1[14] = 0xB1 ^ 0xB4;
        d.var1[15] = 0xB2 ^ 0xAC ^ (0x63 ^ 0x7B);
        d.var1[16] = 0xFFFF977B & 0x7EB6;
        d.var1[17] = 0xE8 ^ 0xC1 ^ (0x98 ^ 0xB6);
        d.var1[18] = -(0xFFFFEB9F & 0x3DED) & (0xFFFFBFBF & Short.MAX_VALUE);
        d.var1[19] = 0x81 ^ 0x89;
        d.var1[20] = 0xFFFFCEB7 & 0x3FEF;
        d.var1[21] = 0xFFFF97B3 & 0x7E7D;
        d.var1[22] = 0x7F ^ 0x4A ^ (0x10 ^ 0x2C);
        d.var1[23] = 136 + 104 - 233 + 133 ^ 47 + 81 - 25 + 25;
        d.var1[24] = -(0xFFFFF56F & 0x7BFD) & (0xFFFFFFFF & 0x7FFE);
        d.var1[25] = -(0xFFFFE1F7 & 0x3E6D) & (0xFFFFF67F & 0x3FFF);
        d.var1[26] = -(0xFFFFBFB3 & 0x616E) & (0xFFFFBFFF & 0x773D);
        d.var1[27] = 0xFFFFDF3F & 0x36DD;
        d.var1[28] = 0xFFFFF7BE & 0x1E5F;
        d.var1[29] = 0xFFFFDFFF & 0x2E91;
        d.var1[30] = 0xFFFFF77B & 0x1EA6;
        d.var1[31] = -(0xFFFFF5F9 & 0x6ACF) & (0xFFFFF6FF & 0x7FEB);
        d.var1[32] = 0xFFFF9FFC & 0x7627;
        d.var1[33] = 0xFFFFB66F & 0x5FB5;
        d.var1[34] = 0xFFFFDEDD & 0x2FBB;
        d.var1[35] = -(0xFFFFBC2D & 0x63F3) & (0xFFFFBF7E & 0x76BB);
        d.var1[36] = -(0xFFFFD36F & 0x6CFB) & (0xFFFFEEFF & 0x5FFF);
        d.var1[37] = 0xFFFFBF3F & 0x56DF;
        d.var1[38] = -(0xFFFFF5F3 & 0x5A6F) & (0xFFFFDEF6 & Short.MAX_VALUE);
        d.var1[39] = -(0xFFFFFB9F & 0x257B) & (0xFFFFFFBB & 0x377F);
        d.var1[40] = 0x39 ^ 0x32;
    }

    public WorldPoint[] g() {
        return this.points;
    }

    public List<WorldPoint> f() {
        return Arrays.asList(this.g());
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    private static void var10() {
        var2 = new String[var1[7]];
        d.var2[d.var1[0]] = "UPPER_FLOOR";
        d.var2[d.var1[4]] = "SOUTH_WEST";
    }

    static {
        d.var9();
        d.var10();
        WorldPoint[] worldPointArray = new WorldPoint[var1[1]];
        worldPointArray[d.var1[0]] = new WorldPoint(var1[2], var1[3], var1[0]);
        worldPointArray[d.var1[4]] = new WorldPoint(var1[5], var1[6], var1[0]);
        worldPointArray[d.var1[7]] = new WorldPoint(var1[8], var1[9], var1[0]);
        worldPointArray[d.var1[10]] = new WorldPoint(var1[5], var1[6], var1[0]);
        worldPointArray[d.var1[11]] = new WorldPoint(var1[12], var1[13], var1[0]);
        worldPointArray[d.var1[14]] = new WorldPoint(var1[8], var1[13], var1[0]);
        worldPointArray[d.var1[15]] = new WorldPoint(var1[5], var1[16], var1[0]);
        worldPointArray[d.var1[17]] = new WorldPoint(var1[5], var1[18], var1[0]);
        worldPointArray[d.var1[19]] = new WorldPoint(var1[20], var1[21], var1[0]);
        worldPointArray[d.var1[22]] = new WorldPoint(var1[20], var1[9], var1[0]);
        UPPER_FLOOR = new GameEnum7(worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[var1[23]];
        worldPointArray2[d.var1[0]] = new WorldPoint(var1[24], var1[25], var1[0]);
        worldPointArray2[d.var1[4]] = new WorldPoint(var1[24], var1[26], var1[0]);
        worldPointArray2[d.var1[7]] = new WorldPoint(var1[24], var1[27], var1[0]);
        worldPointArray2[d.var1[10]] = new WorldPoint(var1[24], var1[28], var1[0]);
        worldPointArray2[d.var1[11]] = new WorldPoint(var1[29], var1[30], var1[0]);
        worldPointArray2[d.var1[14]] = new WorldPoint(var1[29], var1[31], var1[0]);
        worldPointArray2[d.var1[15]] = new WorldPoint(var1[29], var1[32], var1[0]);
        worldPointArray2[d.var1[17]] = new WorldPoint(var1[29], var1[33], var1[0]);
        worldPointArray2[d.var1[19]] = new WorldPoint(var1[34], var1[35], var1[0]);
        worldPointArray2[d.var1[22]] = new WorldPoint(var1[36], var1[37], var1[0]);
        worldPointArray2[d.var1[1]] = new WorldPoint(var1[38], var1[39], var1[0]);
        worldPointArray2[d.var1[40]] = new WorldPoint(var1[36], var1[3], var1[0]);
        SOUTH_WEST = new GameEnum7(worldPointArray2);
        d[] dArray = new d[var1[7]];
        dArray[d.var1[0]] = UPPER_FLOOR;
        dArray[d.var1[4]] = SOUTH_WEST;
        $VALUES = dArray;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }
}

