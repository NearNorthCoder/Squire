/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.tithefarm.tasks;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class GameEnum
extends Enum<g> {
    public static final  /* enum */ g PATCH_9;
    public static final  /* enum */ g PATCH_13;
    public static final  /* enum */ g PATCH_6_NORTH;
    public static final  /* enum */ g PATCH_10;
    private final  int regionY;
    public static final  /* enum */ g PATCH_15;
    public static final  /* enum */ g PATCH_6;
    public static final  /* enum */ g PATCH_14;
    public static final  /* enum */ g PATCH_2;
    public static final  /* enum */ g PATCH_3;
    public static final  /* enum */ g PATCH_1;
    public static final  /* enum */ g PATCH_1_NORTH;
    public static final  /* enum */ g PATCH_16_NORTH;
    public static final  /* enum */ g PATCH_11_NORTH;
    
    public static final  /* enum */ g PATCH_4_NORTH;
    
    public static final  /* enum */ g PATCH_14_NORTH;
    public static final  /* enum */ g PATCH_13_NORTH;
    public static final  /* enum */ g PATCH_11;
    public static final  /* enum */ g PATCH_12_NORTH;
    public static final  /* enum */ g PATCH_2_NORTH;
    public static final  /* enum */ g PATCH_8;
    public static final  /* enum */ g PATCH_7;
    public static final  /* enum */ g PATCH_7_NORTH;
    public static final  /* enum */ g PATCH_9_NORTH;
    public static final  /* enum */ g PATCH_3_NORTH;
    public static final  /* enum */ g PATCH_13_SOUTH;
    public static final  /* enum */ g PATCH_4;
    public static final  /* enum */ g PATCH_12;
    private final  int regionX;
    public static final  /* enum */ g PATCH_5_NORTH;
    public static final  /* enum */ g PATCH_10_NORTH;
    public static final  /* enum */ g PATCH_16;
    public static final  /* enum */ g PATCH_5;
    private static final  g[] $VALUES;
    public static final  /* enum */ g PATCH_8_NORTH;
    public static final  /* enum */ g PATCH_15_NORTH;

    private static void var3() {
        var2 = new String[var1[42]];
        g.var2[g.var1[0]] = "PATCH_1";
        g.var2[g.var1[2]] = "PATCH_2";
        g.var2[g.var1[6]] = "PATCH_3";
        g.var2[g.var1[8]] = "PATCH_4";
        g.var2[g.var1[10]] = "PATCH_1_NORTH";
        g.var2[g.var1[12]] = "PATCH_2_NORTH";
        g.var2[g.var1[14]] = "PATCH_3_NORTH";
        g.var2[g.var1[16]] = "PATCH_4_NORTH";
        g.var2[g.var1[18]] = "PATCH_5";
        g.var2[g.var1[20]] = "PATCH_6";
        g.var2[g.var1[21]] = "PATCH_7";
        g.var2[g.var1[22]] = "PATCH_8";
        g.var2[g.var1[23]] = "PATCH_5_NORTH";
        g.var2[g.var1[24]] = "PATCH_6_NORTH";
        g.var2[g.var1[25]] = "PATCH_7_NORTH";
        g.var2[g.var1[26]] = "PATCH_8_NORTH";
        g.var2[g.var1[27]] = "PATCH_9";
        g.var2[g.var1[29]] = "PATCH_10";
        g.var2[g.var1[30]] = "PATCH_11";
        g.var2[g.var1[31]] = "PATCH_12";
        g.var2[g.var1[32]] = "PATCH_13_SOUTH";
        g.var2[g.var1[33]] = "PATCH_9_NORTH";
        g.var2[g.var1[34]] = "PATCH_10_NORTH";
        g.var2[g.var1[35]] = "PATCH_11_NORTH";
        g.var2[g.var1[36]] = "PATCH_12_NORTH";
        g.var2[g.var1[4]] = "PATCH_13";
        g.var2[g.var1[37]] = "PATCH_14";
        g.var2[g.var1[38]] = "PATCH_15";
        g.var2[g.var1[5]] = "PATCH_16";
        g.var2[g.var1[39]] = "PATCH_13_NORTH";
        g.var2[g.var1[40]] = "PATCH_14_NORTH";
        g.var2[g.var1[7]] = "PATCH_15_NORTH";
        g.var2[g.var1[41]] = "PATCH_16_NORTH";
    }

    private GameEnum(int n3, int n4) {
        this.regionX = n3;
        this.regionY = n4;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        g.var10();
        g.var3();
        PATCH_1 = new GameEnum(var1[3], var1[4]);
        PATCH_2 = new GameEnum(var1[3], var1[5]);
        PATCH_3 = new GameEnum(var1[3], var1[7]);
        PATCH_4 = new GameEnum(var1[3], var1[9]);
        PATCH_1_NORTH = new GameEnum(var1[3], var1[11]);
        PATCH_2_NORTH = new GameEnum(var1[3], var1[13]);
        PATCH_3_NORTH = new GameEnum(var1[3], var1[15]);
        PATCH_4_NORTH = new GameEnum(var1[3], var1[17]);
        PATCH_5 = new GameEnum(var1[19], var1[4]);
        PATCH_6 = new GameEnum(var1[19], var1[5]);
        PATCH_7 = new GameEnum(var1[19], var1[7]);
        PATCH_8 = new GameEnum(var1[19], var1[9]);
        PATCH_5_NORTH = new GameEnum(var1[19], var1[11]);
        PATCH_6_NORTH = new GameEnum(var1[19], var1[13]);
        PATCH_7_NORTH = new GameEnum(var1[19], var1[15]);
        PATCH_8_NORTH = new GameEnum(var1[19], var1[17]);
        PATCH_9 = new GameEnum(var1[28], var1[4]);
        PATCH_10 = new GameEnum(var1[28], var1[5]);
        PATCH_11 = new GameEnum(var1[28], var1[7]);
        PATCH_12 = new GameEnum(var1[28], var1[9]);
        PATCH_13_SOUTH = new GameEnum(var1[28], var1[31]);
        PATCH_9_NORTH = new GameEnum(var1[28], var1[11]);
        PATCH_10_NORTH = new GameEnum(var1[28], var1[13]);
        PATCH_11_NORTH = new GameEnum(var1[28], var1[15]);
        PATCH_12_NORTH = new GameEnum(var1[28], var1[17]);
        PATCH_13 = new GameEnum(var1[11], var1[4]);
        PATCH_14 = new GameEnum(var1[11], var1[5]);
        PATCH_15 = new GameEnum(var1[11], var1[7]);
        PATCH_16 = new GameEnum(var1[11], var1[9]);
        PATCH_13_NORTH = new GameEnum(var1[11], var1[11]);
        PATCH_14_NORTH = new GameEnum(var1[11], var1[13]);
        PATCH_15_NORTH = new GameEnum(var1[11], var1[15]);
        PATCH_16_NORTH = new GameEnum(var1[11], var1[17]);
        g[] gArray = new g[var1[42]];
        gArray[g.var1[0]] = PATCH_1;
        gArray[g.var1[2]] = PATCH_2;
        gArray[g.var1[6]] = PATCH_3;
        gArray[g.var1[8]] = PATCH_4;
        gArray[g.var1[10]] = PATCH_1_NORTH;
        gArray[g.var1[12]] = PATCH_2_NORTH;
        gArray[g.var1[14]] = PATCH_3_NORTH;
        gArray[g.var1[16]] = PATCH_4_NORTH;
        gArray[g.var1[18]] = PATCH_5;
        gArray[g.var1[20]] = PATCH_6;
        gArray[g.var1[21]] = PATCH_7;
        gArray[g.var1[22]] = PATCH_8;
        gArray[g.var1[23]] = PATCH_5_NORTH;
        gArray[g.var1[24]] = PATCH_6_NORTH;
        gArray[g.var1[25]] = PATCH_7_NORTH;
        gArray[g.var1[26]] = PATCH_8_NORTH;
        gArray[g.var1[27]] = PATCH_9;
        gArray[g.var1[29]] = PATCH_10;
        gArray[g.var1[30]] = PATCH_11;
        gArray[g.var1[31]] = PATCH_12;
        gArray[g.var1[32]] = PATCH_13_SOUTH;
        gArray[g.var1[33]] = PATCH_9_NORTH;
        gArray[g.var1[34]] = PATCH_10_NORTH;
        gArray[g.var1[35]] = PATCH_11_NORTH;
        gArray[g.var1[36]] = PATCH_12_NORTH;
        gArray[g.var1[4]] = PATCH_13;
        gArray[g.var1[37]] = PATCH_14;
        gArray[g.var1[38]] = PATCH_15;
        gArray[g.var1[5]] = PATCH_16;
        gArray[g.var1[39]] = PATCH_13_NORTH;
        gArray[g.var1[40]] = PATCH_14_NORTH;
        gArray[g.var1[7]] = PATCH_15_NORTH;
        gArray[g.var1[41]] = PATCH_16_NORTH;
        $VALUES = gArray;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void var10() {
        var1 = new int[43];
        g.var1[0] = (0x11 ^ 0x55 ^ (0x1E ^ 0x13)) & (6 + 162 - -20 + 44 ^ 158 + 154 - 255 + 104 ^ -1);
        g.var1[1] = 0xFFFFBD3F & 0x5EF6;
        g.var1[2] = 1;
        g.var1[3] = 0xBB ^ 0x8C;
        g.var1[4] = 147 + 35 - 10 + 19 ^ 23 + 71 - -13 + 59;
        g.var1[5] = 0x1C ^ 0x5B ^ (4 ^ 0x5F);
        g.var1[6] = 2;
        g.var1[7] = 0x16 ^ 9;
        g.var1[8] = 3;
        g.var1[9] = 9 ^ 0x4D ^ (0x73 ^ 0x15);
        g.var1[10] = 0xC8 ^ 0xA6 ^ (0x3E ^ 0x54);
        g.var1[11] = 0xFF ^ 0xAB ^ (0xC9 ^ 0xB5);
        g.var1[12] = (0x59 ^ 0x46) & ~(0x9D ^ 0x82) ^ (0x6E ^ 0x6B);
        g.var1[13] = 0x20 ^ 0x28 ^ (0x3C ^ 0x1F);
        g.var1[14] = 0x8F ^ 0x89;
        g.var1[15] = 0xAC ^ 0x82;
        g.var1[16] = 5 ^ 2;
        g.var1[17] = 5 ^ 0x34;
        g.var1[18] = 0x25 ^ 0x2D;
        g.var1[19] = 0x81 ^ 0xB3;
        g.var1[20] = 0xFD ^ 0xB5 ^ (0xE4 ^ 0xA5);
        g.var1[21] = 0x3C ^ 0x36;
        g.var1[22] = 0x70 ^ 0x7B;
        g.var1[23] = 0x4D ^ 0x69 ^ (0x82 ^ 0xAA);
        g.var1[24] = 0x85 ^ 0x88;
        g.var1[25] = 0x4F ^ 0x67 ^ (0x5F ^ 0x79);
        g.var1[26] = 0x22 ^ 0x2D;
        g.var1[27] = 0xF6 ^ 0x9A ^ (1 ^ 0x7D);
        g.var1[28] = 0x4D ^ 0x41 ^ (0x32 ^ 0x13);
        g.var1[29] = 31 + 73 - 60 + 110 ^ 91 + 123 - 205 + 130;
        g.var1[30] = 0x7D ^ 0x6F;
        g.var1[31] = 0x71 ^ 0x35 ^ (0x3F ^ 0x68);
        g.var1[32] = 31 + 80 - -33 + 26 ^ 61 + 15 - -107 + 7;
        g.var1[33] = 0x82 ^ 0x97;
        g.var1[34] = 0xAE ^ 0xB8;
        g.var1[35] = 0x48 ^ 8 ^ (0x48 ^ 0x1F);
        g.var1[36] = 0xAA ^ 0x89 ^ (0x95 ^ 0xAE);
        g.var1[37] = 0xA6 ^ 0x9F ^ (0x74 ^ 0x57);
        g.var1[38] = 0x8C ^ 0x97;
        g.var1[39] = 0xA6 ^ 0xBB;
        g.var1[40] = 2 ^ (0x4D ^ 0x51);
        g.var1[41] = 0xE2 ^ 0x9E ^ (0x2C ^ 0x70);
        g.var1[42] = 0x11 ^ 0x30;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (g.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public WorldPoint n() {
        return WorldPoint.fromRegion((int)var1[1], (int)this.regionX, (int)this.regionY, (int)var1[0]);
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(TileObject tileObject) {
        int n2;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)tileObject.getWorldLocation());
        if (g.var11(regionPoint.getX(), this.regionX) && g.var11(regionPoint.getY(), this.regionY)) {
            n2 = var1[2];
            0;
            if null != null {
                return ((157 + 134 - 66 + 4 ^ 141 + 84 - 111 + 60) & (96 + 74 - 107 + 132 ^ 56 + 120 - 115 + 75 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    public RegionPoint m() {
        return new RegionPoint(this.regionX, this.regionY, var1[0], var1[1]);
    }
}

